package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import io.noties.markwon.MarkwonPlugin;
import io.noties.markwon.ext.latex.JLatexMathBlock;
import io.noties.markwon.ext.latex.JLatexMathNode;
import io.noties.markwon.ext.latex.JLatexMathPlugin;
import io.noties.markwon.html.HtmlTag;
import io.noties.markwon.html.MarkwonHtmlParser;
import io.noties.markwon.html.MarkwonHtmlParserImpl;
import io.noties.markwon.inlineparser.InlineProcessor;
import io.noties.markwon.inlineparser.MarkwonInlineParserPlugin;
import j$.util.Comparator$CC;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.ToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;
import org.commonmark.ext.gfm.strikethrough.StrikethroughExtension;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.Code;
import org.commonmark.node.CustomBlock;
import org.commonmark.node.CustomNode;
import org.commonmark.node.Document;
import org.commonmark.node.Emphasis;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Heading;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.HtmlInline;
import org.commonmark.node.Image;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.Link;
import org.commonmark.node.ListItem;
import org.commonmark.node.Node;
import org.commonmark.node.OrderedList;
import org.commonmark.node.Paragraph;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.Parser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.MarkdownParser;
import ru.noties.jlatexmath.JLatexMathDrawable;

public abstract class MarkdownParser {
    private static final Pattern FOOTNOTE_DEF = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    private static final Pattern FOOTNOTE_REF = Pattern.compile("\\[\\^([^\\]]+)\\]");
    private static final Pattern ORDERED_MARKER = Pattern.compile("^(\\d+)[.)]\\s");

    public static boolean isMarkdown(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return isExtensionMarkdown(messageObject.getExtension()) || isMimeMarkdown(messageObject.getMimeType());
    }

    public static boolean isExtensionMarkdown(String str) {
        return "md".equalsIgnoreCase(str) || "mkd".equalsIgnoreCase(str) || "mdwn".equalsIgnoreCase(str) || "mkdn".equalsIgnoreCase(str) || "mdown".equalsIgnoreCase(str) || "markdown".equalsIgnoreCase(str);
    }

    public static boolean isMimeMarkdown(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.startsWith("text/markdown") || lowerCase.startsWith("text/x-markdown") || lowerCase.startsWith("text/x-web-markdown");
    }

    public static TLRPC.WebPage fromMarkdown(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || messageObject.messageOwner == null || (document = messageObject.getDocument()) == null) {
            return null;
        }
        File file = !TextUtils.isEmpty(messageObject.messageOwner.attachPath) ? new File(messageObject.messageOwner.attachPath) : null;
        if (file == null || !file.exists()) {
            file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner, true);
        }
        if (file == null || !file.exists()) {
            file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner, true, true);
        }
        if (file != null && file.exists()) {
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeFilename.class);
            String str = tL_documentAttributeFilename != null ? tL_documentAttributeFilename.file_name : null;
            TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
            tL_webPage.url = str == null ? "" : str;
            tL_webPage.display_url = str != null ? str : "";
            if (!TextUtils.isEmpty(str)) {
                tL_webPage.flags |= 4;
                tL_webPage.title = str;
            }
            TLRPC.TL_page tL_page = new TLRPC.TL_page();
            tL_page.local = file;
            tL_page.url = tL_webPage.url;
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[(int) file.length()];
                    fileInputStream.read(bArr);
                    String str2 = new String(bArr, StandardCharsets.UTF_8);
                    fileInputStream.close();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String strRewriteFootnoteRefs = rewriteFootnoteRefs(extractFootnoteDefs(str2, linkedHashMap));
                    List listAsList = Arrays.asList(StrikethroughExtension.create(), TablesExtension.create());
                    final MarkwonInlineParserPlugin markwonInlineParserPluginCreate = MarkwonInlineParserPlugin.create();
                    JLatexMathPlugin jLatexMathPluginCreate = JLatexMathPlugin.create(AndroidUtilities.dp(18.0f), new JLatexMathPlugin.BuilderConfigure() {
                        @Override
                        public final void configureBuilder(JLatexMathPlugin.Builder builder) {
                            builder.inlinesEnabled(true);
                        }
                    });
                    jLatexMathPluginCreate.configure(new MarkwonPlugin.Registry() {
                        @Override
                        public MarkwonPlugin require(Class cls) {
                            if (cls == MarkwonInlineParserPlugin.class) {
                                return markwonInlineParserPluginCreate;
                            }
                            throw new IllegalStateException("plugin not registered: " + cls);
                        }
                    });
                    markwonInlineParserPluginCreate.factoryBuilder().addInlineProcessor(new SingleDollarLatexInlineProcessor());
                    Parser.Builder builderExtensions = Parser.builder().extensions(listAsList);
                    markwonInlineParserPluginCreate.configureParser(builderExtensions);
                    jLatexMathPluginCreate.configureParser(builderExtensions);
                    Parser parserBuild = builderExtensions.build();
                    BlockVisitor blockVisitor = new BlockVisitor(tL_page.blocks, scanOrderedListMarkers(strRewriteFootnoteRefs));
                    parserBuild.parse(strRewriteFootnoteRefs).accept(blockVisitor);
                    blockVisitor.finish();
                    appendFootnotes(parserBuild, tL_page.blocks, linkedHashMap);
                    TLRPC.RichText richText = blockVisitor.title;
                    if (richText != null) {
                        String strRichTextToString = richTextToString(richText);
                        if (!TextUtils.isEmpty(strRichTextToString)) {
                            tL_webPage.flags |= 4;
                            tL_webPage.title = strRichTextToString;
                        }
                    }
                    tL_webPage.flags |= 1024;
                    tL_webPage.cached_page = tL_page;
                    return tL_webPage;
                } finally {
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return null;
    }

    public static class SingleDollarLatexInlineProcessor extends InlineProcessor {
        private static final Pattern RE = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

        @Override
        public char specialCharacter() {
            return '$';
        }

        @Override
        protected Node parse() {
            String strMatch = match(RE);
            if (strMatch == null) {
                return null;
            }
            JLatexMathNode jLatexMathNode = new JLatexMathNode();
            jLatexMathNode.latex(strMatch.substring(1, strMatch.length() - 1));
            return jLatexMathNode;
        }
    }

    public static TLRPC.TL_textLatex makeLatex(String str) {
        TLRPC.TL_textLatex tL_textLatex = new TLRPC.TL_textLatex();
        String strTrim = str == null ? "" : str.trim();
        tL_textLatex.raw = strTrim;
        try {
            JLatexMathDrawable jLatexMathDrawableBuild = JLatexMathDrawable.builder(strTrim).textSize(AndroidUtilities.dp(20.0f)).build();
            int intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
            int intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                jLatexMathDrawableBuild.draw(new Canvas(bitmapCreateBitmap));
                tL_textLatex.w = intrinsicWidth;
                tL_textLatex.h = intrinsicHeight;
                try {
                    tL_textLatex.depth = jLatexMathDrawableBuild.icon().getIconDepth();
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                tL_textLatex.bitmap = bitmapCreateBitmap;
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        return tL_textLatex;
    }

    private static java.util.ArrayDeque scanOrderedListMarkers(java.lang.String r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.MarkdownParser.scanOrderedListMarkers(java.lang.String):java.util.ArrayDeque");
    }

    private static String extractFootnoteDefs(String str, LinkedHashMap linkedHashMap) {
        String[] strArrSplit = str.split("\n", -1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < strArrSplit.length) {
            Matcher matcher = FOOTNOTE_DEF.matcher(strArrSplit[i]);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                StringBuilder sb2 = new StringBuilder(matcher.group(2));
                while (true) {
                    i++;
                    while (i < strArrSplit.length) {
                        String str2 = strArrSplit[i];
                        if (str2.startsWith("    ") || str2.startsWith("\t")) {
                            sb2.append('\n');
                            sb2.append(str2.startsWith("\t") ? str2.substring(1) : str2.substring(4));
                        } else {
                            if (!str2.trim().isEmpty()) {
                                break;
                            }
                            int i2 = i + 1;
                            int i3 = i2;
                            while (i3 < strArrSplit.length && strArrSplit[i3].trim().isEmpty()) {
                                i3++;
                            }
                            if (i3 >= strArrSplit.length || !(strArrSplit[i3].startsWith("    ") || strArrSplit[i3].startsWith("\t"))) {
                                break;
                            }
                            sb2.append('\n');
                            i = i2;
                        }
                    }
                    break;
                }
                linkedHashMap.put(strGroup, sb2.toString().trim());
            } else {
                sb.append(strArrSplit[i]);
                if (i < strArrSplit.length - 1) {
                    sb.append('\n');
                }
                i++;
            }
        }
        return sb.toString();
    }

    private static String rewriteFootnoteRefs(String str) {
        Matcher matcher = FOOTNOTE_REF.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement("<sup>[\\[" + strGroup + "\\]](#fn-" + strGroup + ")</sup>"));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static void appendFootnotes(Parser parser, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        if (linkedHashMap.isEmpty()) {
            return;
        }
        TLRPC.TL_pageBlockDetails tL_pageBlockDetails = new TLRPC.TL_pageBlockDetails();
        tL_pageBlockDetails.title = bold(LocaleController.getString(R.string.InstantViewReferences));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            BlockVisitor blockVisitor = new BlockVisitor(arrayList2);
            parser.parse(str2).accept(blockVisitor);
            blockVisitor.finish();
            TLRPC.RichText richTextCombineParagraphs = combineParagraphs(arrayList2);
            TLRPC.TL_textAnchor tL_textAnchor = new TLRPC.TL_textAnchor();
            tL_textAnchor.name = "fn-" + str;
            tL_textAnchor.text = richTextCombineParagraphs;
            TLRPC.TL_pageBlockParagraph tL_pageBlockParagraph = new TLRPC.TL_pageBlockParagraph();
            tL_pageBlockParagraph.text = concat(bold(str + ". "), tL_textAnchor);
            tL_pageBlockDetails.blocks.add(tL_pageBlockParagraph);
        }
        arrayList.add(tL_pageBlockDetails);
    }

    private static TLRPC.RichText combineParagraphs(ArrayList arrayList) {
        TLRPC.RichText richText;
        TLRPC.TL_textConcat tL_textConcat = new TLRPC.TL_textConcat();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TLRPC.PageBlock pageBlock = (TLRPC.PageBlock) it.next();
            if (pageBlock instanceof TLRPC.TL_pageBlockParagraph) {
                richText = ((TLRPC.TL_pageBlockParagraph) pageBlock).text;
            } else if (pageBlock instanceof TLRPC.TL_pageBlockHeader) {
                richText = ((TLRPC.TL_pageBlockHeader) pageBlock).text;
            } else if (pageBlock instanceof TLRPC.TL_pageBlockSubheader) {
                richText = ((TLRPC.TL_pageBlockSubheader) pageBlock).text;
            } else {
                richText = pageBlock instanceof TLRPC.TL_pageBlockTitle ? ((TLRPC.TL_pageBlockTitle) pageBlock).text : null;
            }
            if (richText != null && !(richText instanceof TLRPC.TL_textEmpty)) {
                if (!tL_textConcat.texts.isEmpty()) {
                    tL_textConcat.texts.add(plain("\n\n"));
                }
                tL_textConcat.texts.add(richText);
            }
        }
        return tL_textConcat.texts.isEmpty() ? new TLRPC.TL_textEmpty() : tL_textConcat.texts.size() == 1 ? tL_textConcat.texts.get(0) : tL_textConcat;
    }

    public static TLRPC.RichText richTextOf(Node node, TLRPC.PageBlock pageBlock) {
        RichTextParser richTextParser = new RichTextParser(pageBlock);
        node.accept(richTextParser);
        return materializeStyles(pairHtml(richTextParser.getText()));
    }

    private static TLRPC.RichText pairHtml(TLRPC.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TLRPC.TL_textConcat) {
            TLRPC.TL_textConcat tL_textConcat = (TLRPC.TL_textConcat) richText;
            for (int i = 0; i < tL_textConcat.texts.size(); i++) {
                ArrayList<TLRPC.RichText> arrayList = tL_textConcat.texts;
                arrayList.set(i, pairHtml(arrayList.get(i)));
            }
            return pairHtmlConcat(tL_textConcat);
        }
        TLRPC.RichText richText2 = richText;
        while (true) {
            TLRPC.RichText richText3 = richText2.text;
            if (richText3 == null) {
                break;
            }
            if (richText3 instanceof TLRPC.TL_textConcat) {
                richText2.text = pairHtml(richText3);
                break;
            }
            richText2 = richText3;
        }
        return richText;
    }

    private static TLRPC.RichText pairHtmlConcat(TLRPC.TL_textConcat tL_textConcat) {
        TLRPC.RichText tL_textConcat2;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        MarkwonHtmlParserImpl markwonHtmlParserImplCreate = MarkwonHtmlParserImpl.create();
        Iterator<TLRPC.RichText> it = tL_textConcat.texts.iterator();
        while (it.hasNext()) {
            TLRPC.RichText next = it.next();
            if (next instanceof TLRPC.TL_textPlain) {
                TLRPC.TL_textPlain tL_textPlain = (TLRPC.TL_textPlain) next;
                if (looksLikeHtmlTag(tL_textPlain.text)) {
                    int length = sb.length();
                    try {
                        markwonHtmlParserImplCreate.processFragment(sb, ((TLRPC.TL_textPlain) next).text);
                    } catch (Throwable th) {
                        FileLog.e(th);
                        sb.append(tL_textPlain.text);
                    }
                    int length2 = sb.length();
                    if (length2 > length) {
                        arrayList.add(plain(sb.substring(length, length2)));
                        arrayList2.add(new int[]{length, length2});
                    }
                }
            }
            String strRichTextToString = richTextToString(next);
            int length3 = sb.length();
            sb.append(strRichTextToString);
            int length4 = sb.length();
            arrayList.add(next);
            arrayList2.add(new int[]{length3, length4});
        }
        final ArrayList<HtmlTag> arrayList3 = new ArrayList();
        try {
            markwonHtmlParserImplCreate.flushInlineTags(sb.length(), new MarkwonHtmlParser.FlushAction() {
                @Override
                public final void apply(List list) {
                    arrayList3.addAll(list);
                }
            });
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        try {
            markwonHtmlParserImplCreate.flushBlockTags(sb.length(), new MarkwonHtmlParser.FlushAction() {
                @Override
                public final void apply(List list) {
                    MarkdownParser.flattenBlocks(list, arrayList3);
                }
            });
        } catch (Throwable th3) {
            FileLog.e(th3);
        }
        Collections.sort(arrayList3, Comparator$CC.comparingInt(new ToIntFunction() {
            @Override
            public final int applyAsInt(Object obj) {
                return MarkdownParser.lambda$pairHtmlConcat$3((HtmlTag) obj);
            }
        }));
        for (HtmlTag htmlTag : arrayList3) {
            if (htmlTag.isClosed()) {
                int iStart = htmlTag.start();
                int iEnd = htmlTag.end();
                int i = -1;
                int i2 = -1;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    int i4 = ((int[]) arrayList2.get(i3))[0];
                    int i5 = ((int[]) arrayList2.get(i3))[1];
                    if (i4 >= iStart && i5 <= iEnd) {
                        if (i == -1) {
                            i = i3;
                        }
                        i2 = i3;
                    }
                }
                if (i != -1) {
                    if (i == i2) {
                        tL_textConcat2 = (TLRPC.RichText) arrayList.get(i);
                    } else {
                        tL_textConcat2 = new TLRPC.TL_textConcat();
                        for (int i6 = i; i6 <= i2; i6++) {
                            tL_textConcat2.texts.add((TLRPC.RichText) arrayList.get(i6));
                        }
                    }
                    TLRPC.RichText richTextWrapByTag = wrapByTag(htmlTag.name(), tL_textConcat2);
                    while (i2 >= i) {
                        arrayList.remove(i2);
                        arrayList2.remove(i2);
                        i2--;
                    }
                    arrayList.add(i, richTextWrapByTag);
                    arrayList2.add(i, new int[]{iStart, iEnd});
                }
            }
        }
        if (arrayList.isEmpty()) {
            return new TLRPC.TL_textEmpty();
        }
        if (arrayList.size() == 1) {
            TLRPC.RichText richText = (TLRPC.RichText) arrayList.get(0);
            if ((richText instanceof TLRPC.TL_textPlain) || (richText instanceof TLRPC.TL_textEmpty)) {
                return richText;
            }
        }
        TLRPC.TL_textConcat tL_textConcat3 = new TLRPC.TL_textConcat();
        tL_textConcat3.texts.addAll(arrayList);
        return tL_textConcat3;
    }

    public static int lambda$pairHtmlConcat$3(HtmlTag htmlTag) {
        return htmlTag.end() - htmlTag.start();
    }

    public static void flattenBlocks(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HtmlTag.Block block = (HtmlTag.Block) it.next();
            list2.add(block);
            flattenBlocks(block.children(), list2);
        }
    }

    private static boolean looksLikeHtmlTag(String str) {
        return str != null && str.length() >= 2 && str.charAt(0) == '<' && str.charAt(str.length() - 1) == '>';
    }

    private static final class TextStyle extends TLRPC.RichText {
        int styleFlags;

        private TextStyle() {
        }
    }

    private static int flagFor(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return 0;
    }

    private static TLRPC.RichText wrapByTag(String str, TLRPC.RichText richText) {
        int iFlagFor = flagFor(str);
        if (iFlagFor == 0) {
            return richText;
        }
        if (richText instanceof TextStyle) {
            TextStyle textStyle = (TextStyle) richText;
            textStyle.styleFlags = iFlagFor | textStyle.styleFlags;
            return richText;
        }
        TextStyle textStyle2 = new TextStyle();
        textStyle2.styleFlags = iFlagFor;
        textStyle2.text = richText;
        return textStyle2;
    }

    private static TLRPC.RichText materializeStyles(TLRPC.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TLRPC.TL_textConcat) {
            TLRPC.TL_textConcat tL_textConcat = (TLRPC.TL_textConcat) richText;
            for (int i = 0; i < tL_textConcat.texts.size(); i++) {
                ArrayList<TLRPC.RichText> arrayList = tL_textConcat.texts;
                arrayList.set(i, materializeStyles(arrayList.get(i)));
            }
            return tL_textConcat;
        }
        if (richText instanceof TextStyle) {
            TextStyle textStyle = (TextStyle) richText;
            TLRPC.RichText richTextMaterializeStyles = materializeStyles(textStyle.text);
            int i2 = textStyle.styleFlags;
            if ((i2 & 4) != 0) {
                richTextMaterializeStyles = wrapStyle(new TLRPC.TL_textFixed(), richTextMaterializeStyles);
            }
            if ((i2 & 32) != 0) {
                richTextMaterializeStyles = wrapStyle(new TLRPC.TL_textStrike(), richTextMaterializeStyles);
            }
            if ((i2 & 16) != 0) {
                richTextMaterializeStyles = wrapStyle(new TLRPC.TL_textUnderline(), richTextMaterializeStyles);
            }
            if ((i2 & 64) != 0) {
                richTextMaterializeStyles = wrapStyle(new TLRPC.TL_textMarked(), richTextMaterializeStyles);
            }
            if ((i2 & 128) != 0) {
                richTextMaterializeStyles = wrapStyle(new TLRPC.TL_textSubscript(), richTextMaterializeStyles);
            }
            if ((i2 & 256) != 0) {
                richTextMaterializeStyles = wrapStyle(new TLRPC.TL_textSuperscript(), richTextMaterializeStyles);
            }
            if ((i2 & 2) != 0) {
                richTextMaterializeStyles = wrapStyle(new TLRPC.TL_textItalic(), richTextMaterializeStyles);
            }
            return (i2 & 1) != 0 ? wrapStyle(new TLRPC.TL_textBold(), richTextMaterializeStyles) : richTextMaterializeStyles;
        }
        TLRPC.RichText richText2 = richText.text;
        if (richText2 != null) {
            richText.text = materializeStyles(richText2);
        }
        return richText;
    }

    private static TLRPC.RichText wrapStyle(TLRPC.RichText richText, TLRPC.RichText richText2) {
        richText.text = richText2;
        return richText;
    }

    public static TLRPC.RichText plain(String str) {
        TLRPC.TL_textPlain tL_textPlain = new TLRPC.TL_textPlain();
        if (str == null) {
            str = "";
        }
        tL_textPlain.text = str;
        return tL_textPlain;
    }

    private static TLRPC.RichText bold(String str) {
        TLRPC.TL_textBold tL_textBold = new TLRPC.TL_textBold();
        tL_textBold.text = plain(str);
        return tL_textBold;
    }

    private static TLRPC.RichText concat(TLRPC.RichText... richTextArr) {
        TLRPC.TL_textConcat tL_textConcat = new TLRPC.TL_textConcat();
        for (TLRPC.RichText richText : richTextArr) {
            tL_textConcat.texts.add(richText);
        }
        return tL_textConcat;
    }

    public static String richTextToString(TLRPC.RichText richText) {
        if (richText == null || (richText instanceof TLRPC.TL_textEmpty)) {
            return "";
        }
        if (richText instanceof TLRPC.TL_textPlain) {
            return ((TLRPC.TL_textPlain) richText).text;
        }
        if (richText instanceof TLRPC.TL_textConcat) {
            StringBuilder sb = new StringBuilder();
            Iterator<TLRPC.RichText> it = richText.texts.iterator();
            while (it.hasNext()) {
                sb.append(richTextToString(it.next()));
            }
            return sb.toString();
        }
        return richTextToString(richText.text);
    }

    public static class BlockVisitor extends AbstractVisitor {
        public final ArrayList blocks;
        private final MarkwonHtmlParser htmlParser;
        private final List items;
        private final ArrayDeque orderedMarkers;
        private final StringBuilder synth;
        public TLRPC.RichText title;

        private static final class Item {
            final TLRPC.PageBlock block;
            final int end;
            final int start;

            Item(TLRPC.PageBlock pageBlock, int i, int i2) {
                this.block = pageBlock;
                this.start = i;
                this.end = i2;
            }
        }

        public BlockVisitor(ArrayList arrayList) {
            this(arrayList, new ArrayDeque());
        }

        public BlockVisitor(ArrayList arrayList, ArrayDeque arrayDeque) {
            this.items = new ArrayList();
            this.synth = new StringBuilder();
            this.htmlParser = MarkwonHtmlParserImpl.create();
            this.blocks = arrayList;
            this.orderedMarkers = arrayDeque;
        }

        private void emit(TLRPC.PageBlock pageBlock) {
            int length = this.synth.length();
            this.synth.append((char) 1);
            this.items.add(new Item(pageBlock, length, this.synth.length()));
        }

        public void finish() {
            final ArrayList arrayList = new ArrayList();
            try {
                this.htmlParser.flushBlockTags(this.synth.length(), new MarkwonHtmlParser.FlushAction() {
                    @Override
                    public final void apply(List list) {
                        arrayList.addAll(list);
                    }
                });
            } catch (Throwable th) {
                FileLog.e(th);
            }
            ArrayList<HtmlTag.Block> arrayList2 = new ArrayList();
            flattenBlockTags(arrayList, arrayList2);
            HashMap map = new HashMap();
            for (Item item : this.items) {
                map.put(Integer.valueOf(item.start), item);
            }
            TreeSet treeSet = new TreeSet();
            int i = 0;
            treeSet.add(0);
            treeSet.add(Integer.valueOf(this.synth.length()));
            for (Integer num : map.keySet()) {
                treeSet.add(num);
                treeSet.add(Integer.valueOf(num.intValue() + 1));
            }
            for (HtmlTag.Block block : arrayList2) {
                treeSet.add(Integer.valueOf(block.start()));
                treeSet.add(Integer.valueOf(block.end()));
            }
            ArrayList<Item> arrayList3 = new ArrayList();
            Iterator it = treeSet.iterator();
            Integer num2 = null;
            while (it.hasNext()) {
                Integer num3 = (Integer) it.next();
                if (num2 != null && num3.intValue() > num2.intValue()) {
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num3.intValue();
                    if (iIntValue2 - iIntValue == 1 && map.containsKey(num2)) {
                        arrayList3.add((Item) map.get(num2));
                    } else {
                        String strTrim = this.synth.substring(iIntValue, iIntValue2).trim();
                        if (!strTrim.isEmpty()) {
                            TLRPC.TL_pageBlockParagraph tL_pageBlockParagraph = new TLRPC.TL_pageBlockParagraph();
                            tL_pageBlockParagraph.text = MarkdownParser.plain(strTrim);
                            arrayList3.add(new Item(tL_pageBlockParagraph, iIntValue, iIntValue2));
                        }
                    }
                }
                num2 = num3;
            }
            Collections.sort(arrayList2, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return MarkdownParser.BlockVisitor.lambda$finish$0((HtmlTag.Block) obj, (HtmlTag.Block) obj2);
                }
            });
            Scope scope = new Scope(null, 0, Integer.MAX_VALUE);
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(scope);
            for (Item item2 : arrayList3) {
                while (i < arrayList2.size() && ((HtmlTag.Block) arrayList2.get(i)).start() <= item2.start) {
                    int i2 = i + 1;
                    HtmlTag.Block block2 = (HtmlTag.Block) arrayList2.get(i);
                    if (block2.end() >= item2.start) {
                        while (arrayDeque.peek() != scope && ((Scope) arrayDeque.peek()).end <= block2.start()) {
                            arrayDeque.pop();
                        }
                        Scope scope2 = new Scope(block2, block2.start(), block2.end());
                        ((Scope) arrayDeque.peek()).children.add(scope2);
                        arrayDeque.push(scope2);
                    }
                    i = i2;
                }
                while (arrayDeque.peek() != scope && ((Scope) arrayDeque.peek()).end <= item2.start) {
                    arrayDeque.pop();
                }
                if (item2.block != null) {
                    ((Scope) arrayDeque.peek()).children.add(item2);
                }
            }
            materialize(scope.children, this.blocks);
        }

        public static int lambda$finish$0(HtmlTag.Block block, HtmlTag.Block block2) {
            int iCompare = Integer.compare(block.start(), block2.start());
            return iCompare != 0 ? iCompare : Integer.compare(block2.end(), block.end());
        }

        private static void flattenBlockTags(List list, List list2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HtmlTag.Block block = (HtmlTag.Block) it.next();
                list2.add(block);
                flattenBlockTags(block.children(), list2);
            }
        }

        private static final class Scope {
            final List children = new ArrayList();
            final int end;
            final int start;
            final HtmlTag.Block tag;

            Scope(HtmlTag.Block block, int i, int i2) {
                this.tag = block;
                this.start = i;
                this.end = i2;
            }
        }

        private void materialize(List list, List list2) {
            materialize(list, list2, 0);
        }

        private void materialize(List list, List list2, int i) {
            for (Object obj : list) {
                if (obj instanceof Item) {
                    TLRPC.PageBlock pageBlock = ((Item) obj).block;
                    if (pageBlock != null) {
                        list2.add(pageBlock);
                    }
                } else if (obj instanceof Scope) {
                    wrapScope((Scope) obj, list2, i);
                }
            }
        }

        private void wrapScope(org.telegram.ui.Components.MarkdownParser.BlockVisitor.Scope r9, java.util.List r10, int r11) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.MarkdownParser.BlockVisitor.wrapScope(org.telegram.ui.Components.MarkdownParser$BlockVisitor$Scope, java.util.List, int):void");
        }

        private TLRPC.RichText scopeToRichText(Scope scope) {
            StringBuilder sb = new StringBuilder();
            collectText(scope.children, sb);
            String strTrim = sb.toString().trim();
            return strTrim.isEmpty() ? new TLRPC.TL_textEmpty() : MarkdownParser.plain(strTrim);
        }

        private void collectText(List list, StringBuilder sb) {
            for (Object obj : list) {
                if (obj instanceof Item) {
                    TLRPC.PageBlock pageBlock = ((Item) obj).block;
                    if (pageBlock instanceof TLRPC.TL_pageBlockParagraph) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(MarkdownParser.richTextToString(((TLRPC.TL_pageBlockParagraph) pageBlock).text));
                    } else if (pageBlock instanceof TLRPC.TL_pageBlockHeader) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(MarkdownParser.richTextToString(((TLRPC.TL_pageBlockHeader) pageBlock).text));
                    } else if (pageBlock instanceof TLRPC.TL_pageBlockSubheader) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(MarkdownParser.richTextToString(((TLRPC.TL_pageBlockSubheader) pageBlock).text));
                    }
                } else if (obj instanceof Scope) {
                    collectText(((Scope) obj).children, sb);
                }
            }
        }

        @Override
        public void visit(Heading heading) {
            TLRPC.RichText richTextRichTextOf = MarkdownParser.richTextOf(heading, null);
            if (this.items.isEmpty()) {
                this.title = richTextRichTextOf;
                TLRPC.TL_pageBlockTitle tL_pageBlockTitle = new TLRPC.TL_pageBlockTitle();
                tL_pageBlockTitle.text = richTextRichTextOf;
                emit(tL_pageBlockTitle);
                return;
            }
            if (heading.getLevel() <= 2) {
                TLRPC.TL_pageBlockHeader tL_pageBlockHeader = new TLRPC.TL_pageBlockHeader();
                tL_pageBlockHeader.text = richTextRichTextOf;
                emit(tL_pageBlockHeader);
            } else {
                TLRPC.TL_pageBlockSubheader tL_pageBlockSubheader = new TLRPC.TL_pageBlockSubheader();
                tL_pageBlockSubheader.text = richTextRichTextOf;
                emit(tL_pageBlockSubheader);
            }
        }

        @Override
        public void visit(Paragraph paragraph) {
            TLRPC.TL_pageBlockParagraph tL_pageBlockParagraph = new TLRPC.TL_pageBlockParagraph();
            tL_pageBlockParagraph.text = MarkdownParser.richTextOf(paragraph, tL_pageBlockParagraph);
            emit(tL_pageBlockParagraph);
        }

        @Override
        public void visit(BlockQuote blockQuote) {
            TLRPC.TL_pageBlockBlockquote tL_pageBlockBlockquote = new TLRPC.TL_pageBlockBlockquote();
            tL_pageBlockBlockquote.text = MarkdownParser.richTextOf(blockQuote, tL_pageBlockBlockquote);
            tL_pageBlockBlockquote.caption = new TLRPC.TL_textEmpty();
            emit(tL_pageBlockBlockquote);
        }

        @Override
        public void visit(ThematicBreak thematicBreak) {
            emit(new TLRPC.TL_pageBlockDivider());
        }

        @Override
        public void visit(FencedCodeBlock fencedCodeBlock) {
            TLRPC.TL_pageBlockPreformatted tL_pageBlockPreformatted = new TLRPC.TL_pageBlockPreformatted();
            tL_pageBlockPreformatted.text = MarkdownParser.plain(fencedCodeBlock.getLiteral());
            tL_pageBlockPreformatted.language = fencedCodeBlock.getInfo() == null ? "" : fencedCodeBlock.getInfo();
            emit(tL_pageBlockPreformatted);
        }

        @Override
        public void visit(IndentedCodeBlock indentedCodeBlock) {
            TLRPC.TL_pageBlockPreformatted tL_pageBlockPreformatted = new TLRPC.TL_pageBlockPreformatted();
            tL_pageBlockPreformatted.text = MarkdownParser.plain(indentedCodeBlock.getLiteral());
            tL_pageBlockPreformatted.language = "";
            emit(tL_pageBlockPreformatted);
        }

        @Override
        public void visit(BulletList bulletList) {
            TLRPC.TL_pageBlockList tL_pageBlockList = new TLRPC.TL_pageBlockList();
            for (Node firstChild = bulletList.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
                if (firstChild instanceof ListItem) {
                    int iStripCheckboxPrefix = stripCheckboxPrefix(firstChild);
                    if (iStripCheckboxPrefix >= 0) {
                        TLRPC.TL_pageListItemCheckbox tL_pageListItemCheckbox = new TLRPC.TL_pageListItemCheckbox();
                        tL_pageListItemCheckbox.checked = iStripCheckboxPrefix == 1;
                        tL_pageListItemCheckbox.text = MarkdownParser.richTextOf(firstChild, tL_pageBlockList);
                        tL_pageBlockList.items.add(tL_pageListItemCheckbox);
                    } else {
                        TLRPC.TL_pageListItemText tL_pageListItemText = new TLRPC.TL_pageListItemText();
                        tL_pageListItemText.text = MarkdownParser.richTextOf(firstChild, tL_pageBlockList);
                        tL_pageBlockList.items.add(tL_pageListItemText);
                    }
                }
            }
            emit(tL_pageBlockList);
        }

        @Override
        public void visit(OrderedList orderedList) {
            String strValueOf;
            TLRPC.TL_pageBlockOrderedList tL_pageBlockOrderedList = new TLRPC.TL_pageBlockOrderedList();
            boolean z = orderedList.getParent() instanceof Document;
            int startNumber = orderedList.getStartNumber();
            for (Node firstChild = orderedList.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
                if (firstChild instanceof ListItem) {
                    if (!z || this.orderedMarkers.isEmpty()) {
                        strValueOf = String.valueOf(startNumber);
                        startNumber++;
                    } else {
                        strValueOf = (String) this.orderedMarkers.poll();
                    }
                    int iStripCheckboxPrefix = stripCheckboxPrefix(firstChild);
                    if (iStripCheckboxPrefix >= 0) {
                        TLRPC.TL_pageListOrderedItemCheckbox tL_pageListOrderedItemCheckbox = new TLRPC.TL_pageListOrderedItemCheckbox();
                        tL_pageListOrderedItemCheckbox.checked = iStripCheckboxPrefix == 1;
                        tL_pageListOrderedItemCheckbox.num = strValueOf;
                        tL_pageListOrderedItemCheckbox.text = MarkdownParser.richTextOf(firstChild, tL_pageBlockOrderedList);
                        tL_pageBlockOrderedList.items.add(tL_pageListOrderedItemCheckbox);
                    } else {
                        TLRPC.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TLRPC.TL_pageListOrderedItemText();
                        tL_pageListOrderedItemText.num = strValueOf;
                        tL_pageListOrderedItemText.text = MarkdownParser.richTextOf(firstChild, tL_pageBlockOrderedList);
                        tL_pageBlockOrderedList.items.add(tL_pageListOrderedItemText);
                    }
                }
            }
            emit(tL_pageBlockOrderedList);
        }

        private static int stripCheckboxPrefix(Node node) {
            org.commonmark.node.Text text;
            String literal;
            Node firstChild = node.getFirstChild();
            if (!(firstChild instanceof Paragraph)) {
                return -1;
            }
            Node firstChild2 = firstChild.getFirstChild();
            if ((firstChild2 instanceof org.commonmark.node.Text) && (literal = (text = (org.commonmark.node.Text) firstChild2).getLiteral()) != null) {
                int i = 3;
                if (literal.length() >= 3) {
                    int i2 = 0;
                    if (literal.charAt(0) == '[' && literal.charAt(2) == ']') {
                        char cCharAt = literal.charAt(1);
                        if (cCharAt != ' ') {
                            if (cCharAt != 'x' && cCharAt != 'X') {
                                return -1;
                            }
                            i2 = 1;
                        }
                        if (literal.length() > 3 && literal.charAt(3) == ' ') {
                            i = 4;
                        }
                        text.setLiteral(literal.substring(i));
                        return i2;
                    }
                }
            }
            return -1;
        }

        @Override
        public void visit(HtmlBlock htmlBlock) {
            String literal = htmlBlock.getLiteral();
            if (literal == null) {
                return;
            }
            try {
                this.htmlParser.processFragment(this.synth, literal);
            } catch (Throwable th) {
                FileLog.e(th);
                this.synth.append(literal);
            }
        }

        @Override
        public void visit(CustomBlock customBlock) {
            if (customBlock instanceof TableBlock) {
                emit(buildTable((TableBlock) customBlock));
            } else {
                if (customBlock instanceof JLatexMathBlock) {
                    TLRPC.TL_pageBlockParagraph tL_pageBlockParagraph = new TLRPC.TL_pageBlockParagraph();
                    tL_pageBlockParagraph.text = MarkdownParser.makeLatex(((JLatexMathBlock) customBlock).latex());
                    emit(tL_pageBlockParagraph);
                    return;
                }
                super.visit(customBlock);
            }
        }

        private TLRPC.TL_pageBlockTable buildTable(TableBlock tableBlock) {
            TLRPC.TL_pageBlockTable tL_pageBlockTable = new TLRPC.TL_pageBlockTable();
            tL_pageBlockTable.bordered = true;
            tL_pageBlockTable.title = new TLRPC.TL_textEmpty();
            for (Node firstChild = tableBlock.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
                boolean z = firstChild instanceof TableHead;
                if (z || (firstChild instanceof TableBody)) {
                    for (Node firstChild2 = firstChild.getFirstChild(); firstChild2 != null; firstChild2 = firstChild2.getNext()) {
                        if (firstChild2 instanceof TableRow) {
                            tL_pageBlockTable.rows.add(buildTableRow((TableRow) firstChild2, z));
                        }
                    }
                }
            }
            return tL_pageBlockTable;
        }

        private TLRPC.TL_pageTableRow buildTableRow(TableRow tableRow, boolean z) {
            TLRPC.TL_pageTableRow tL_pageTableRow = new TLRPC.TL_pageTableRow();
            for (Node firstChild = tableRow.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
                if (firstChild instanceof TableCell) {
                    tL_pageTableRow.cells.add(buildTableCell((TableCell) firstChild, z));
                }
            }
            return tL_pageTableRow;
        }

        private TLRPC.TL_pageTableCell buildTableCell(TableCell tableCell, boolean z) {
            TLRPC.TL_pageTableCell tL_pageTableCell = new TLRPC.TL_pageTableCell();
            tL_pageTableCell.header = z || tableCell.isHeader();
            TableCell.Alignment alignment = tableCell.getAlignment();
            if (alignment == TableCell.Alignment.CENTER) {
                tL_pageTableCell.align_center = true;
            } else if (alignment == TableCell.Alignment.RIGHT) {
                tL_pageTableCell.align_right = true;
            }
            tL_pageTableCell.text = MarkdownParser.richTextOf(tableCell, null);
            tL_pageTableCell.flags |= 128;
            return tL_pageTableCell;
        }
    }

    public static class RichTextParser extends AbstractVisitor {
        private final TLRPC.PageBlock block;
        private int blockDepth;
        private TLRPC.TL_textConcat current = new TLRPC.TL_textConcat();

        public RichTextParser(TLRPC.PageBlock pageBlock) {
            this.block = pageBlock;
        }

        @Override
        public void visit(BlockQuote blockQuote) {
            int i = this.blockDepth;
            if (i >= 64) {
                return;
            }
            this.blockDepth = i + 1;
            try {
                visitChildren(blockQuote);
            } finally {
                this.blockDepth--;
            }
        }

        @Override
        public void visit(BulletList bulletList) {
            int i = this.blockDepth;
            if (i >= 64) {
                return;
            }
            this.blockDepth = i + 1;
            try {
                visitChildren(bulletList);
            } finally {
                this.blockDepth--;
            }
        }

        @Override
        public void visit(OrderedList orderedList) {
            int i = this.blockDepth;
            if (i >= 64) {
                return;
            }
            this.blockDepth = i + 1;
            try {
                visitChildren(orderedList);
            } finally {
                this.blockDepth--;
            }
        }

        @Override
        public void visit(ListItem listItem) {
            int i = this.blockDepth;
            if (i >= 64) {
                return;
            }
            this.blockDepth = i + 1;
            try {
                visitChildren(listItem);
            } finally {
                this.blockDepth--;
            }
        }

        public TLRPC.RichText getText() {
            return collapse(this.current);
        }

        private static TLRPC.RichText collapse(TLRPC.TL_textConcat tL_textConcat) {
            return tL_textConcat.texts.isEmpty() ? new TLRPC.TL_textEmpty() : tL_textConcat.texts.size() == 1 ? tL_textConcat.texts.get(0) : tL_textConcat;
        }

        private void append(TLRPC.RichText richText) {
            this.current.texts.add(richText);
        }

        private TLRPC.RichText collectChildren(Node node) {
            TLRPC.TL_textConcat tL_textConcat = this.current;
            this.current = new TLRPC.TL_textConcat();
            visitChildren(node);
            TLRPC.RichText richTextCollapse = collapse(this.current);
            this.current = tL_textConcat;
            return richTextCollapse;
        }

        @Override
        public void visit(Paragraph paragraph) {
            if (!this.current.texts.isEmpty()) {
                append(MarkdownParser.plain("\n\n"));
            }
            visitChildren(paragraph);
        }

        @Override
        public void visit(org.commonmark.node.Text text) {
            append(MarkdownParser.plain(text.getLiteral()));
        }

        @Override
        public void visit(Emphasis emphasis) {
            TLRPC.TL_textItalic tL_textItalic = new TLRPC.TL_textItalic();
            tL_textItalic.text = collectChildren(emphasis);
            append(tL_textItalic);
        }

        @Override
        public void visit(StrongEmphasis strongEmphasis) {
            TLRPC.TL_textBold tL_textBold = new TLRPC.TL_textBold();
            tL_textBold.text = collectChildren(strongEmphasis);
            append(tL_textBold);
        }

        @Override
        public void visit(Code code) {
            TLRPC.TL_textFixed tL_textFixed = new TLRPC.TL_textFixed();
            tL_textFixed.text = MarkdownParser.plain(code.getLiteral());
            append(tL_textFixed);
        }

        @Override
        public void visit(Link link) {
            String strTrim = (link.getDestination() == null ? "" : link.getDestination()).trim();
            if (strTrim.startsWith("mailto:")) {
                TLRPC.RichText tL_textEmail = new TLRPC.TL_textEmail();
                tL_textEmail.text = collectChildren(link);
                tL_textEmail.email = strTrim.substring(7);
                append(tL_textEmail);
                return;
            }
            if (strTrim.startsWith("tel:")) {
                TLRPC.TL_textPhone tL_textPhone = new TLRPC.TL_textPhone();
                tL_textPhone.text = collectChildren(link);
                tL_textPhone.phone = strTrim.substring(4);
                append(tL_textPhone);
                return;
            }
            TLRPC.RichText tL_textUrl = new TLRPC.TL_textUrl();
            tL_textUrl.text = collectChildren(link);
            tL_textUrl.url = strTrim;
            append(tL_textUrl);
        }

        @Override
        public void visit(Image image) {
            append(collectChildren(image));
        }

        @Override
        public void visit(HardLineBreak hardLineBreak) {
            append(MarkdownParser.plain("\n"));
        }

        @Override
        public void visit(SoftLineBreak softLineBreak) {
            append(MarkdownParser.plain(this.block instanceof TLRPC.TL_pageBlockBlockquote ? "\n" : " "));
        }

        @Override
        public void visit(HtmlInline htmlInline) {
            append(MarkdownParser.plain(htmlInline.getLiteral()));
        }

        @Override
        public void visit(CustomNode customNode) {
            if (customNode instanceof Strikethrough) {
                TLRPC.TL_textStrike tL_textStrike = new TLRPC.TL_textStrike();
                tL_textStrike.text = collectChildren(customNode);
                append(tL_textStrike);
            } else if (customNode instanceof JLatexMathNode) {
                append(MarkdownParser.makeLatex(((JLatexMathNode) customNode).latex()));
            } else {
                super.visit(customNode);
            }
        }

        @Override
        public void visit(CustomBlock customBlock) {
            if (customBlock instanceof JLatexMathBlock) {
                if (!this.current.texts.isEmpty()) {
                    append(MarkdownParser.plain("\n"));
                }
                append(MarkdownParser.makeLatex(((JLatexMathBlock) customBlock).latex()));
                append(MarkdownParser.plain("\n"));
                return;
            }
            super.visit(customBlock);
        }
    }
}
