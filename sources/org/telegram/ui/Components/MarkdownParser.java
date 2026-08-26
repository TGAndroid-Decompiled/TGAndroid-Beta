package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.text.ssa.SsaSubtitle;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import io.noties.markwon.ext.latex.JLatexMathBlock;
import io.noties.markwon.ext.latex.JLatexMathInlineProcessor;
import io.noties.markwon.ext.latex.JLatexMathNode;
import io.noties.markwon.html.HtmlTagImpl;
import io.noties.markwon.html.MarkwonHtmlParserImpl;
import io.noties.markwon.inlineparser.AutolinkInlineProcessor;
import io.noties.markwon.inlineparser.BackslashInlineProcessor;
import io.noties.markwon.inlineparser.BackticksInlineProcessor;
import io.noties.markwon.inlineparser.BangInlineProcessor;
import io.noties.markwon.inlineparser.CloseBracketInlineProcessor;
import io.noties.markwon.inlineparser.EntityInlineProcessor;
import io.noties.markwon.inlineparser.HtmlInlineProcessor;
import io.noties.markwon.inlineparser.InlineProcessor;
import io.noties.markwon.inlineparser.MarkwonInlineParser;
import io.noties.markwon.inlineparser.NewLineInlineProcessor;
import j$.util.Comparator$CC;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.Extension;
import org.commonmark.ext.gfm.strikethrough.Strikethrough;
import org.commonmark.ext.gfm.strikethrough.internal.StrikethroughDelimiterProcessor;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TableBody;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.TableHead;
import org.commonmark.ext.gfm.tables.TableRow;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.internal.HeadingParser;
import org.commonmark.internal.inline.AsteriskDelimiterProcessor;
import org.commonmark.node.AbstractVisitor;
import org.commonmark.node.Block;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.Code;
import org.commonmark.node.CustomBlock;
import org.commonmark.node.CustomNode;
import org.commonmark.node.Document;
import org.commonmark.node.Emphasis;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Heading;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.Link;
import org.commonmark.node.ListItem;
import org.commonmark.node.Node;
import org.commonmark.node.OrderedList;
import org.commonmark.node.Paragraph;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.Parser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.iv.Latex;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;
import org.telegram.ui.web.MHTML;

public abstract class MarkdownParser {
    public static final Pattern FOOTNOTE_DEF = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    public static final Pattern FOOTNOTE_REF = Pattern.compile("\\[\\^([^\\]]+)\\]");
    public static final Pattern ORDERED_MARKER = Pattern.compile("^(\\d+)[.)]\\s");

    public final class SingleDollarLatexInlineProcessor extends InlineProcessor {
        public static final Pattern RE = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

        @Override
        public final Node parse() {
            String strMatch = match(RE);
            if (strMatch == null) {
                return null;
            }
            JLatexMathNode jLatexMathNode = new JLatexMathNode();
            jLatexMathNode.latex = SurfaceContainer$$ExternalSyntheticOutline0.m(1, 1, strMatch);
            return jLatexMathNode;
        }

        @Override
        public final char specialCharacter() {
            return '$';
        }
    }

    public final class TextStyle extends TL_iv.RichText {
        public int styleFlags;
    }

    public static TL_iv.RichText access$300(Node node, TL_iv.PageBlock pageBlock) {
        RichTextParser richTextParser = new RichTextParser(pageBlock);
        node.accept(richTextParser);
        TL_iv.RichText textempty = richTextParser.current;
        if (textempty.texts.isEmpty()) {
            textempty = new TL_iv.textEmpty();
        } else if (textempty.texts.size() == 1) {
            textempty = textempty.texts.get(0);
        }
        return materializeStyles(pairHtml(textempty));
    }

    public static List access$400(TL_iv.RichText richText) {
        int i;
        if (richText == null) {
            return Collections.singletonList(plain(""));
        }
        if (richTextLength(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String strRichTextToString = richTextToString(richText);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < strRichTextToString.length()) {
            if (strRichTextToString.length() - i2 <= 8192) {
                arrayList.add(plain(strRichTextToString.substring(i2)));
                return arrayList;
            }
            int i3 = i2 + 8192;
            int i4 = i2 + 8191;
            int iLastIndexOf = strRichTextToString.lastIndexOf(10, i4);
            if (iLastIndexOf <= i2) {
                iLastIndexOf = strRichTextToString.lastIndexOf(32, i4);
            }
            if (iLastIndexOf <= i2) {
                i = 0;
            } else {
                i3 = iLastIndexOf;
                i = 1;
            }
            arrayList.add(plain(strRichTextToString.substring(i2, i3)));
            i2 = i3 + i;
        }
        return arrayList;
    }

    public static TL_iv.textMath access$500(String str) {
        TL_iv.textMath textmath = new TL_iv.textMath();
        String strTrim = str == null ? "" : str.trim();
        textmath.source = strTrim;
        textmath.tried = true;
        Latex latexRender = Latex.render(strTrim, AndroidUtilities.dp(20.0f), true);
        if (latexRender != null) {
            textmath.w = latexRender.width;
            textmath.h = latexRender.height;
            textmath.depth = latexRender.depth;
            textmath.bitmap = (Bitmap) latexRender.bitmap;
        }
        return textmath;
    }

    public static TL_iv.RichText first(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richTextLength(richText) <= 8192) {
            return richText;
        }
        String strRichTextToString = richTextToString(richText);
        return plain(strRichTextToString.substring(0, Math.min(strRichTextToString.length(), 8192)));
    }

    public static void flattenBlocks(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HtmlTagImpl.BlockImpl blockImpl = (HtmlTagImpl.BlockImpl) it.next();
            arrayList.add(blockImpl);
            ArrayList arrayList2 = blockImpl.children;
            flattenBlocks(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    public static TLRPC.TL_webPage fromMarkdown(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject.messageOwner != null && (document = messageObject.getDocument()) != null) {
            File file = !TextUtils.isEmpty(messageObject.messageOwner.attachPath) ? new File(messageObject.messageOwner.attachPath) : null;
            if (file == null || !file.exists()) {
                file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner, true);
            }
            if (file == null || !file.exists()) {
                file = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner, true, true);
            }
            if (file != null && file.exists() && file.length() <= 65536) {
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeFilename.class);
                String str = tL_documentAttributeFilename != null ? tL_documentAttributeFilename.file_name : null;
                TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                tL_webPage.url = str == null ? "" : str;
                tL_webPage.display_url = str != null ? str : "";
                if (!TextUtils.isEmpty(str)) {
                    tL_webPage.flags |= 4;
                    tL_webPage.title = str;
                }
                TL_iv.TL_page tL_page = new TL_iv.TL_page();
                tL_page.local = file;
                tL_page.url = tL_webPage.url;
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[(int) file.length()];
                        fileInputStream.read(bArr);
                        String str2 = new String(bArr, StandardCharsets.UTF_8);
                        fileInputStream.close();
                        if (str2.length() <= 65536) {
                            String str3 = parse(str2, tL_page.blocks);
                            if (!TextUtils.isEmpty(str3)) {
                                tL_webPage.flags |= 4;
                                tL_webPage.title = str3;
                            }
                            tL_webPage.flags |= 1024;
                            tL_webPage.cached_page = tL_page;
                            return tL_webPage;
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return null;
    }

    public static TL_iv.RichText materializeStyles(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i = 0; i < textconcat.texts.size(); i++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i, materializeStyles(arrayList.get(i)));
            }
            return textconcat;
        }
        if (!(richText instanceof TextStyle)) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                richText.text = materializeStyles(richText2);
            }
            return richText;
        }
        TextStyle textStyle = (TextStyle) richText;
        TL_iv.RichText richTextMaterializeStyles = materializeStyles(textStyle.text);
        int i2 = textStyle.styleFlags;
        if ((i2 & 4) != 0) {
            TL_iv.textFixed textfixed = new TL_iv.textFixed();
            textfixed.text = richTextMaterializeStyles;
            richTextMaterializeStyles = textfixed;
        }
        if ((i2 & 32) != 0) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = richTextMaterializeStyles;
            richTextMaterializeStyles = textstrike;
        }
        if ((i2 & 16) != 0) {
            TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
            textunderline.text = richTextMaterializeStyles;
            richTextMaterializeStyles = textunderline;
        }
        if ((i2 & 64) != 0) {
            TL_iv.textMarked textmarked = new TL_iv.textMarked();
            textmarked.text = richTextMaterializeStyles;
            richTextMaterializeStyles = textmarked;
        }
        if ((i2 & 128) != 0) {
            TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
            textsubscript.text = richTextMaterializeStyles;
            richTextMaterializeStyles = textsubscript;
        }
        if ((i2 & 256) != 0) {
            TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = richTextMaterializeStyles;
            richTextMaterializeStyles = textsuperscript;
        }
        if ((i2 & 2) != 0) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = richTextMaterializeStyles;
            richTextMaterializeStyles = textitalic;
        }
        if ((i2 & 1) == 0) {
            return richTextMaterializeStyles;
        }
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = richTextMaterializeStyles;
        return textbold;
    }

    public static TL_iv.RichText pairHtml(TL_iv.RichText richText) {
        TL_iv.RichText textconcat;
        int i;
        TL_iv.textPlain textplain;
        String str;
        int i2 = 2;
        int i3 = 22;
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat2 = (TL_iv.textConcat) richText;
            for (int i4 = 0; i4 < textconcat2.texts.size(); i4++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat2.texts;
                arrayList.set(i4, pairHtml(arrayList.get(i4)));
            }
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            MarkwonHtmlParserImpl markwonHtmlParserImpl = new MarkwonHtmlParserImpl(new RichEditor.AnonymousClass12(22), new ChatActivity.AnonymousClass40(i3));
            ArrayList<TL_iv.RichText> arrayList4 = textconcat2.texts;
            int size = arrayList4.size();
            int i5 = 0;
            while (i5 < size) {
                int i6 = i5 + 1;
                TL_iv.RichText richText2 = arrayList4.get(i5);
                if ((richText2 instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText2).text) != null) {
                    if (str.length() >= i2 && str.charAt(0) == '<' && str.charAt(str.length() - 1) == '>') {
                        int length = sb.length();
                        try {
                            markwonHtmlParserImpl.processFragment(sb, ((TL_iv.textPlain) richText2).text);
                        } catch (Throwable th) {
                            FileLog.e(th);
                            sb.append(textplain.text);
                        }
                        int length2 = sb.length();
                        if (length2 > length) {
                            arrayList2.add(plain(sb.substring(length, length2)));
                            arrayList3.add(new int[]{length, length2});
                        }
                    }
                    i5 = i6;
                    i2 = 2;
                }
                String strRichTextToString = richTextToString(richText2);
                int length3 = sb.length();
                sb.append(strRichTextToString);
                int length4 = sb.length();
                arrayList2.add(richText2);
                arrayList3.add(new int[]{length3, length4});
                i5 = i6;
                i2 = 2;
            }
            ArrayList arrayList5 = new ArrayList();
            try {
                int length5 = sb.length();
                ArrayList arrayList6 = markwonHtmlParserImpl.inlineTags;
                if (arrayList6.size() > 0) {
                    if (length5 > -1) {
                        int size2 = arrayList6.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            Object obj = arrayList6.get(i7);
                            i7++;
                            HtmlTagImpl.InlineImpl inlineImpl = (HtmlTagImpl.InlineImpl) obj;
                            if (inlineImpl.end <= -1) {
                                inlineImpl.end = length5;
                            }
                        }
                    }
                    arrayList5.addAll(DesugarCollections.unmodifiableList(arrayList6));
                    arrayList6.clear();
                } else {
                    arrayList5.addAll(Collections.EMPTY_LIST);
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
            try {
                int length6 = sb.length();
                HtmlTagImpl.BlockImpl blockImpl = markwonHtmlParserImpl.currentBlock;
                while (true) {
                    HtmlTagImpl.BlockImpl blockImpl2 = blockImpl.parent;
                    if (blockImpl2 == null) {
                        break;
                    }
                    blockImpl = blockImpl2;
                }
                if (length6 > -1) {
                    blockImpl.closeAt(length6);
                }
                ArrayList arrayList7 = blockImpl.children;
                List listUnmodifiableList = arrayList7 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList7);
                if (listUnmodifiableList.size() > 0) {
                    flattenBlocks(arrayList5, listUnmodifiableList);
                } else {
                    flattenBlocks(arrayList5, Collections.EMPTY_LIST);
                }
                markwonHtmlParserImpl.currentBlock = new HtmlTagImpl.BlockImpl("", 0, Collections.EMPTY_MAP, null);
            } catch (Throwable th3) {
                FileLog.e(th3);
            }
            Collections.sort(arrayList5, Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(8)));
            int size3 = arrayList5.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj2 = arrayList5.get(i8);
                i8++;
                HtmlTagImpl htmlTagImpl = (HtmlTagImpl) obj2;
                int i9 = htmlTagImpl.end;
                if (i9 > -1) {
                    int i10 = 0;
                    int i11 = -1;
                    int i12 = -1;
                    while (true) {
                        int size4 = arrayList3.size();
                        int i13 = htmlTagImpl.start;
                        if (i10 < size4) {
                            int i14 = ((int[]) arrayList3.get(i10))[0];
                            int i15 = ((int[]) arrayList3.get(i10))[1];
                            if (i14 >= i13 && i15 <= i9) {
                                if (i11 == -1) {
                                    i11 = i10;
                                }
                                i12 = i10;
                            }
                            i10++;
                        } else if (i11 != -1) {
                            if (i11 == i12) {
                                textconcat = (TL_iv.RichText) arrayList2.get(i11);
                            } else {
                                textconcat = new TL_iv.textConcat();
                                for (int i16 = i11; i16 <= i12; i16++) {
                                    textconcat.texts.add((TL_iv.RichText) arrayList2.get(i16));
                                }
                            }
                            String str2 = htmlTagImpl.name;
                            if (str2 != null) {
                                String lowerCase = str2.toLowerCase();
                                lowerCase.getClass();
                                switch (lowerCase) {
                                    case "strike":
                                    case "s":
                                    case "del":
                                        i = 32;
                                        break;
                                    case "strong":
                                    case "b":
                                        i = 1;
                                        break;
                                    case "i":
                                    case "em":
                                        i = 2;
                                        break;
                                    case "u":
                                    case "ins":
                                        i = 16;
                                        break;
                                    case "tt":
                                    case "code":
                                        i = 4;
                                        break;
                                    case "sub":
                                        i = 128;
                                        break;
                                    case "sup":
                                        i = 256;
                                        break;
                                    case "mark":
                                        i = 64;
                                        break;
                                    default:
                                        i = 0;
                                        break;
                                }
                            } else {
                                i = 0;
                            }
                            if (i != 0) {
                                if (textconcat instanceof TextStyle) {
                                    TextStyle textStyle = (TextStyle) textconcat;
                                    textStyle.styleFlags = i | textStyle.styleFlags;
                                } else {
                                    TextStyle textStyle2 = new TextStyle();
                                    textStyle2.styleFlags = i;
                                    textStyle2.text = textconcat;
                                    textconcat = textStyle2;
                                }
                            }
                            while (i12 >= i11) {
                                arrayList2.remove(i12);
                                arrayList3.remove(i12);
                                i12--;
                            }
                            arrayList2.add(i11, textconcat);
                            arrayList3.add(i11, new int[]{i13, i9});
                        }
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return new TL_iv.textEmpty();
            }
            if (arrayList2.size() == 1) {
                TL_iv.RichText richText3 = (TL_iv.RichText) arrayList2.get(0);
                if ((richText3 instanceof TL_iv.textPlain) || (richText3 instanceof TL_iv.textEmpty)) {
                    return richText3;
                }
            }
            TL_iv.textConcat textconcat3 = new TL_iv.textConcat();
            textconcat3.texts.addAll(arrayList2);
            return textconcat3;
        }
        TL_iv.RichText richText4 = richText;
        while (true) {
            TL_iv.RichText richText5 = richText4.text;
            if (richText5 == null) {
                return richText;
            }
            if (richText5 instanceof TL_iv.textConcat) {
                richText4.text = pairHtml(richText5);
                return richText;
            }
            richText4 = richText5;
        }
    }

    public static String parse(String str, ArrayList arrayList) {
        TL_iv.RichText richText;
        int i;
        int i2 = 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] strArrSplit = str.split("\n", -1);
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < strArrSplit.length) {
            Matcher matcher = FOOTNOTE_DEF.matcher(strArrSplit[i3]);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                StringBuilder sb2 = new StringBuilder(matcher.group(i2));
                i3++;
                while (i3 < strArrSplit.length) {
                    String str2 = strArrSplit[i3];
                    if (str2.startsWith("    ") || str2.startsWith("\t")) {
                        sb2.append('\n');
                        sb2.append(str2.startsWith("\t") ? str2.substring(1) : str2.substring(4));
                        i3++;
                    } else {
                        if (!str2.trim().isEmpty()) {
                            break;
                        }
                        int i4 = i3 + 1;
                        int i5 = i4;
                        while (i5 < strArrSplit.length && strArrSplit[i5].trim().isEmpty()) {
                            i5++;
                        }
                        if (i5 >= strArrSplit.length || !(strArrSplit[i5].startsWith("    ") || strArrSplit[i5].startsWith("\t"))) {
                            break;
                        }
                        sb2.append('\n');
                        i3 = i4;
                    }
                }
                linkedHashMap.put(strGroup, sb2.toString().trim());
            } else {
                sb.append(strArrSplit[i3]);
                if (i3 < strArrSplit.length - 1) {
                    sb.append('\n');
                }
                i3++;
            }
            i2 = 2;
        }
        Matcher matcher2 = FOOTNOTE_REF.matcher(sb.toString());
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher2.find()) {
            String strGroup2 = matcher2.group(1);
            matcher2.appendReplacement(stringBuffer, Matcher.quoteReplacement("<sup>[\\[" + strGroup2 + "\\]](#fn-" + strGroup2 + ")</sup>"));
        }
        matcher2.appendTail(stringBuffer);
        String string = stringBuffer.toString();
        List<Extension> listAsList = Arrays.asList(new TablesExtension(1), new TablesExtension(0));
        Pattern pattern = MarkwonInlineParser.PUNCTUATION;
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        arrayList2.addAll(Arrays.asList(new AutolinkInlineProcessor(), new BackslashInlineProcessor(), new BackticksInlineProcessor(), new BangInlineProcessor(0), new CloseBracketInlineProcessor(), new EntityInlineProcessor(), new HtmlInlineProcessor(), new NewLineInlineProcessor(), new BangInlineProcessor(1)));
        arrayList3.addAll(Arrays.asList(new AsteriskDelimiterProcessor(0), new AsteriskDelimiterProcessor(1)));
        AndroidUtilities.dp(18.0f);
        Executors.newCachedThreadPool();
        new Handler(Looper.getMainLooper());
        new HashMap(3);
        arrayList2.add(new JLatexMathInlineProcessor());
        arrayList2.add(new SingleDollarLatexInlineProcessor());
        MHTML mhtml = new MHTML(12);
        if (listAsList == null) {
            throw new NullPointerException("extensions must not be null");
        }
        for (Extension extension : listAsList) {
            if (extension instanceof TablesExtension) {
                switch (((TablesExtension) extension).$r8$classId) {
                    case 0:
                        ((ArrayList) mhtml.entries).add(new HeadingParser.Factory(2));
                        break;
                    default:
                        ((ArrayList) mhtml.file).add(new StrikethroughDelimiterProcessor());
                        break;
                }
            }
        }
        mhtml.filePos = new SsaSubtitle(arrayList2, arrayList3);
        ((ArrayList) mhtml.entries).add(new HeadingParser.Factory(1));
        Parser parser = new Parser(mhtml);
        ArrayDeque arrayDeque = new ArrayDeque();
        String[] strArrSplit2 = string.split("\n", -1);
        int length = strArrSplit2.length;
        String str3 = null;
        int i6 = 0;
        boolean z = false;
        while (i6 < length) {
            String str4 = strArrSplit2[i6];
            int i7 = 0;
            while (i7 < str4.length() && i7 < 3 && str4.charAt(i7) == ' ') {
                i7++;
            }
            String strSubstring = str4.substring(i7);
            if (!z) {
                String str5 = "```";
                if (strSubstring.startsWith("```")) {
                    str3 = str5;
                    z = true;
                } else {
                    str5 = "~~~";
                    if (strSubstring.startsWith("~~~")) {
                        str3 = str5;
                        z = true;
                    } else {
                        Matcher matcher3 = ORDERED_MARKER.matcher(str4);
                        if (matcher3.find()) {
                            i = 1;
                            arrayDeque.add(matcher3.group(1));
                        }
                    }
                }
                i6 += i;
            } else if (strSubstring.startsWith(str3)) {
                str3 = null;
                z = false;
            }
            i = 1;
            i6 += i;
        }
        BlockVisitor blockVisitor = new BlockVisitor(arrayList, arrayDeque);
        blockVisitor.visitChildren(parser.parse(string));
        blockVisitor.finish();
        if (!linkedHashMap.isEmpty()) {
            TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
            String string2 = LocaleController.getString(R.string.InstantViewReferences);
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = plain(string2);
            pageblockdetails.title = textbold;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                ArrayList arrayList4 = new ArrayList();
                BlockVisitor blockVisitor2 = new BlockVisitor(arrayList4, new ArrayDeque());
                blockVisitor2.visitChildren(parser.parse(str7));
                blockVisitor2.finish();
                TL_iv.RichText textconcat = new TL_iv.textConcat();
                int size = arrayList4.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList4.get(i8);
                    i8++;
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        richText = ((TL_iv.pageBlockParagraph) pageBlock).text;
                    } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                        richText = ((TL_iv.pageBlockHeader) pageBlock).text;
                    } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                        richText = ((TL_iv.pageBlockSubheader) pageBlock).text;
                    } else {
                        richText = pageBlock instanceof TL_iv.pageBlockTitle ? ((TL_iv.pageBlockTitle) pageBlock).text : null;
                    }
                    if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                        if (!textconcat.texts.isEmpty()) {
                            textconcat.texts.add(plain("\n\n"));
                        }
                        textconcat.texts.add(richText);
                    }
                }
                if (textconcat.texts.isEmpty()) {
                    textconcat = new TL_iv.textEmpty();
                } else if (textconcat.texts.size() == 1) {
                    textconcat = textconcat.texts.get(0);
                }
                TL_iv.RichText richTextFirst = first(textconcat);
                TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
                textanchor.name = zzil.m("fn-", str6);
                textanchor.text = richTextFirst;
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                String strM = zzhr.m(str6, ". ");
                TL_iv.textBold textbold2 = new TL_iv.textBold();
                textbold2.text = plain(strM);
                TL_iv.RichText[] richTextArr = {textbold2, textanchor};
                TL_iv.textConcat textconcat2 = new TL_iv.textConcat();
                for (int i9 = 0; i9 < 2; i9++) {
                    textconcat2.texts.add(richTextArr[i9]);
                }
                pageblockparagraph.text = textconcat2;
                pageblockdetails.blocks.add(pageblockparagraph);
            }
            arrayList.add(pageblockdetails);
        }
        TL_iv.RichText richText2 = blockVisitor.title;
        if (richText2 != null) {
            return richTextToString(richText2);
        }
        return null;
    }

    public static TL_iv.textPlain plain(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        return textplain;
    }

    public static int richTextLength(TL_iv.RichText richText) {
        int i = 0;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return 0;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            if (str == null) {
                return 0;
            }
            return str.length();
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return richTextLength(richText.text);
        }
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int iRichTextLength = 0;
        while (i < size) {
            TL_iv.RichText richText2 = arrayList.get(i);
            i++;
            iRichTextLength += richTextLength(richText2);
        }
        return iRichTextLength;
    }

    public static String richTextToString(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return "";
        }
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return richTextToString(richText.text);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_iv.RichText richText2 = arrayList.get(i);
            i++;
            sb.append(richTextToString(richText2));
        }
        return sb.toString();
    }

    public final class RichTextParser extends AbstractVisitor {
        public final TL_iv.PageBlock block;
        public int blockDepth;
        public TL_iv.textConcat current = new TL_iv.textConcat();

        public RichTextParser(TL_iv.PageBlock pageBlock) {
            this.block = pageBlock;
        }

        public final TL_iv.RichText collectChildren(Node node) {
            TL_iv.textConcat textconcat = this.current;
            this.current = new TL_iv.textConcat();
            visitChildren(node);
            TL_iv.RichText textempty = this.current;
            if (textempty.texts.isEmpty()) {
                textempty = new TL_iv.textEmpty();
            } else if (textempty.texts.size() == 1) {
                textempty = textempty.texts.get(0);
            }
            this.current = textconcat;
            return textempty;
        }

        @Override
        public final void visit(BlockQuote blockQuote) {
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
        public final void visit$1(Code code) {
            this.current.texts.add(MarkdownParser.plain(code.literal));
        }

        @Override
        public final void visit$2(Emphasis emphasis) {
            this.current.texts.add(MarkdownParser.plain(this.block instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
        }

        @Override
        public final void visit$3(Emphasis emphasis) {
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = collectChildren(emphasis);
            this.current.texts.add(textbold);
        }

        @Override
        public final void visit$1(Link link) {
            this.current.texts.add(collectChildren(link));
        }

        @Override
        public final void visit(BulletList bulletList) {
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
        public final void visit$1(Emphasis emphasis) {
            this.current.texts.add(MarkdownParser.plain("\n"));
        }

        @Override
        public final void visit(OrderedList orderedList) {
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
        public final void visit(ListItem listItem) {
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

        @Override
        public final void visit(Paragraph paragraph) {
            if (!this.current.texts.isEmpty()) {
                this.current.texts.add(MarkdownParser.plain("\n\n"));
            }
            visitChildren(paragraph);
        }

        @Override
        public final void visit(org.commonmark.node.Text text) {
            this.current.texts.add(MarkdownParser.plain(text.literal));
        }

        @Override
        public final void visit(Emphasis emphasis) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = collectChildren(emphasis);
            this.current.texts.add(textitalic);
        }

        @Override
        public final void visit(Code code) {
            TL_iv.textFixed textfixed = new TL_iv.textFixed();
            textfixed.text = MarkdownParser.plain(code.literal);
            this.current.texts.add(textfixed);
        }

        @Override
        public final void visit(Link link) {
            String str = link.destination;
            if (str == null) {
                str = "";
            }
            String strTrim = str.trim();
            if (strTrim.startsWith("mailto:")) {
                TL_iv.textEmail textemail = new TL_iv.textEmail();
                textemail.text = collectChildren(link);
                textemail.email = strTrim.substring(7);
                this.current.texts.add(textemail);
                return;
            }
            if (strTrim.startsWith("tel:")) {
                TL_iv.textPhone textphone = new TL_iv.textPhone();
                textphone.text = collectChildren(link);
                textphone.phone = strTrim.substring(4);
                this.current.texts.add(textphone);
                return;
            }
            TL_iv.textUrl texturl = new TL_iv.textUrl();
            texturl.text = collectChildren(link);
            texturl.url = strTrim;
            this.current.texts.add(texturl);
        }

        @Override
        public final void visit(CustomNode customNode) {
            if (customNode instanceof Strikethrough) {
                TL_iv.textStrike textstrike = new TL_iv.textStrike();
                textstrike.text = collectChildren(customNode);
                this.current.texts.add(textstrike);
            } else if (customNode instanceof JLatexMathNode) {
                this.current.texts.add(MarkdownParser.access$500(((JLatexMathNode) customNode).latex));
            } else {
                visitChildren(customNode);
            }
        }

        @Override
        public final void visit(CustomBlock customBlock) {
            if (customBlock instanceof JLatexMathBlock) {
                if (!this.current.texts.isEmpty()) {
                    this.current.texts.add(MarkdownParser.plain("\n"));
                }
                this.current.texts.add(MarkdownParser.access$500(((JLatexMathBlock) customBlock).latex));
                this.current.texts.add(MarkdownParser.plain("\n"));
                return;
            }
            visitChildren(customBlock);
        }
    }

    public final class BlockVisitor extends AbstractVisitor {
        public final ArrayList blocks;
        public final ArrayDeque orderedMarkers;
        public TL_iv.RichText title;
        public final ArrayList items = new ArrayList();
        public final StringBuilder synth = new StringBuilder();
        public final MarkwonHtmlParserImpl htmlParser = new MarkwonHtmlParserImpl(new RichEditor.AnonymousClass12(22), new ChatActivity.AnonymousClass40(22));

        public final class Item {
            public final TL_iv.PageBlock block;
            public final int start;

            public Item(int i, TL_iv.PageBlock pageBlock) {
                this.block = pageBlock;
                this.start = i;
            }
        }

        public final class Scope {
            public final ArrayList children = new ArrayList();
            public final int end;
            public final HtmlTagImpl.BlockImpl tag;

            public Scope(HtmlTagImpl.BlockImpl blockImpl, int i) {
                this.tag = blockImpl;
                this.end = i;
            }
        }

        public BlockVisitor(ArrayList arrayList, ArrayDeque arrayDeque) {
            this.blocks = arrayList;
            this.orderedMarkers = arrayDeque;
        }

        public static void collectText(StringBuilder sb, ArrayList arrayList) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (obj instanceof Item) {
                    TL_iv.PageBlock pageBlock = ((Item) obj).block;
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(MarkdownParser.richTextToString(((TL_iv.pageBlockParagraph) pageBlock).text));
                    } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(MarkdownParser.richTextToString(((TL_iv.pageBlockHeader) pageBlock).text));
                    } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(MarkdownParser.richTextToString(((TL_iv.pageBlockSubheader) pageBlock).text));
                    }
                } else if (obj instanceof Scope) {
                    collectText(sb, ((Scope) obj).children);
                }
            }
        }

        public static void flattenBlockTags(ArrayList arrayList, List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HtmlTagImpl.BlockImpl blockImpl = (HtmlTagImpl.BlockImpl) it.next();
                arrayList.add(blockImpl);
                ArrayList arrayList2 = blockImpl.children;
                flattenBlockTags(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
            }
        }

        public static void materialize(ArrayList arrayList, List list, int i) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (obj instanceof Item) {
                    list.add(((Item) obj).block);
                } else if (obj instanceof Scope) {
                    wrapScope((Scope) obj, list, i);
                }
            }
        }

        public static int stripCheckboxPrefix(Node node) {
            org.commonmark.node.Text text;
            String str;
            Node node2 = (Node) node.firstChild;
            if (!(node2 instanceof Paragraph)) {
                return -1;
            }
            Node node3 = (Node) node2.firstChild;
            if (!(node3 instanceof org.commonmark.node.Text) || (str = (text = (org.commonmark.node.Text) node3).literal) == null) {
                return -1;
            }
            int i = 3;
            if (str.length() < 3) {
                return -1;
            }
            int i2 = 0;
            if (str.charAt(0) != '[' || str.charAt(2) != ']') {
                return -1;
            }
            char cCharAt = str.charAt(1);
            if (cCharAt != ' ') {
                if (cCharAt != 'x' && cCharAt != 'X') {
                    return -1;
                }
                i2 = 1;
            }
            if (str.length() > 3 && str.charAt(3) == ' ') {
                i = 4;
            }
            text.literal = str.substring(i);
            return i2;
        }

        public static void wrapScope(Scope scope, List list, int i) {
            byte b;
            String str = scope.tag.name;
            String lowerCase = str == null ? "" : str.toLowerCase();
            ArrayList arrayList = scope.children;
            if (i >= 64) {
                materialize(arrayList, list, i + 1);
                return;
            }
            int i2 = 0;
            switch (lowerCase) {
                case "summary":
                    b = 1;
                    break;
                case "footer":
                    b = 8;
                    break;
                case "header":
                    b = 7;
                    break;
                case "article":
                    b = 5;
                    break;
                case "p":
                    b = 2;
                    break;
                case "div":
                    b = 3;
                    break;
                case "nav":
                    b = 10;
                    break;
                case "main":
                    b = 6;
                    break;
                case "aside":
                    b = 9;
                    break;
                case "details":
                    b = 0;
                    break;
                case "section":
                    b = 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0) {
                if (b != 1) {
                    materialize(arrayList, list, i + 1);
                    return;
                }
                return;
            }
            TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
            Map map = scope.tag.attributes;
            pageblockdetails.open = map != null && map.containsKey("open");
            pageblockdetails.title = new TL_iv.textEmpty();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                boolean z = obj instanceof Scope;
                if (z) {
                    Scope scope2 = (Scope) obj;
                    if ("summary".equalsIgnoreCase(scope2.tag.name)) {
                        StringBuilder sb = new StringBuilder();
                        collectText(sb, scope2.children);
                        String strTrim = sb.toString().trim();
                        pageblockdetails.title = strTrim.isEmpty() ? new TL_iv.textEmpty() : MarkdownParser.plain(strTrim);
                    }
                }
                if (obj instanceof Item) {
                    arrayList2.add(((Item) obj).block);
                } else if (z) {
                    wrapScope((Scope) obj, arrayList2, i + 1);
                }
            }
            pageblockdetails.blocks.addAll(arrayList2);
            list.add(pageblockdetails);
        }

        public final void emit(TL_iv.PageBlock pageBlock) {
            StringBuilder sb = this.synth;
            int length = sb.length();
            sb.append((char) 1);
            ArrayList arrayList = this.items;
            sb.length();
            arrayList.add(new Item(length, pageBlock));
        }

        public final void finish() {
            StringBuilder sb = this.synth;
            ArrayList arrayList = new ArrayList();
            try {
                MarkwonHtmlParserImpl markwonHtmlParserImpl = this.htmlParser;
                int length = sb.length();
                HtmlTagImpl.BlockImpl blockImpl = markwonHtmlParserImpl.currentBlock;
                while (true) {
                    HtmlTagImpl.BlockImpl blockImpl2 = blockImpl.parent;
                    if (blockImpl2 == null) {
                        break;
                    } else {
                        blockImpl = blockImpl2;
                    }
                }
                if (length > -1) {
                    blockImpl.closeAt(length);
                }
                ArrayList arrayList2 = blockImpl.children;
                List listUnmodifiableList = arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2);
                if (listUnmodifiableList.size() > 0) {
                    arrayList.addAll(listUnmodifiableList);
                } else {
                    arrayList.addAll(Collections.EMPTY_LIST);
                }
                markwonHtmlParserImpl.currentBlock = new HtmlTagImpl.BlockImpl("", 0, Collections.EMPTY_MAP, null);
            } catch (Throwable th) {
                FileLog.e(th);
            }
            ArrayList arrayList3 = new ArrayList();
            flattenBlockTags(arrayList3, arrayList);
            HashMap map = new HashMap();
            ArrayList arrayList4 = this.items;
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                Item item = (Item) obj;
                map.put(Integer.valueOf(item.start), item);
            }
            TreeSet<Integer> treeSet = new TreeSet();
            treeSet.add(0);
            treeSet.add(Integer.valueOf(sb.length()));
            for (Integer num : map.keySet()) {
                treeSet.add(num);
                treeSet.add(Integer.valueOf(num.intValue() + 1));
            }
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                HtmlTagImpl.BlockImpl blockImpl3 = (HtmlTagImpl.BlockImpl) obj2;
                treeSet.add(Integer.valueOf(blockImpl3.start));
                treeSet.add(Integer.valueOf(blockImpl3.end));
            }
            ArrayList arrayList5 = new ArrayList();
            Integer num2 = null;
            for (Integer num3 : treeSet) {
                if (num2 != null && num3.intValue() > num2.intValue()) {
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num3.intValue();
                    if (iIntValue2 - iIntValue == 1 && map.containsKey(num2)) {
                        arrayList5.add((Item) map.get(num2));
                    } else {
                        String strTrim = sb.substring(iIntValue, iIntValue2).trim();
                        if (!strTrim.isEmpty()) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = MarkdownParser.first(MarkdownParser.plain(strTrim));
                            arrayList5.add(new Item(iIntValue, pageblockparagraph));
                        }
                    }
                }
                num2 = num3;
            }
            Collections.sort(arrayList3, new ChatActivity$$ExternalSyntheticLambda18(14));
            Scope scope = new Scope(null, Integer.MAX_VALUE);
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(scope);
            int size3 = arrayList5.size();
            int i3 = 0;
            int i4 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList5.get(i3);
                i3++;
                Item item2 = (Item) obj3;
                while (i4 < arrayList3.size() && ((HtmlTagImpl.BlockImpl) arrayList3.get(i4)).start <= item2.start) {
                    int i5 = i4 + 1;
                    HtmlTagImpl.BlockImpl blockImpl4 = (HtmlTagImpl.BlockImpl) arrayList3.get(i4);
                    if (blockImpl4.end >= item2.start) {
                        while (arrayDeque.peek() != scope && ((Scope) arrayDeque.peek()).end <= blockImpl4.start) {
                            arrayDeque.pop();
                        }
                        Scope scope2 = new Scope(blockImpl4, blockImpl4.end);
                        ((Scope) arrayDeque.peek()).children.add(scope2);
                        arrayDeque.push(scope2);
                    }
                    i4 = i5;
                }
                while (arrayDeque.peek() != scope && ((Scope) arrayDeque.peek()).end <= item2.start) {
                    arrayDeque.pop();
                }
                TL_iv.PageBlock pageBlock = item2.block;
                ((Scope) arrayDeque.peek()).children.add(item2);
            }
            materialize(scope.children, this.blocks, 0);
        }

        @Override
        public final void visit(Heading heading) {
            TL_iv.RichText richTextFirst = MarkdownParser.first(MarkdownParser.access$300(heading, null));
            if (this.items.isEmpty()) {
                this.title = richTextFirst;
            }
            switch (heading.level) {
                case 1:
                    TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                    pageblockheading1.text = richTextFirst;
                    emit(pageblockheading1);
                    break;
                case 2:
                    TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                    pageblockheading2.text = richTextFirst;
                    emit(pageblockheading2);
                    break;
                case 3:
                    TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                    pageblockheading3.text = richTextFirst;
                    emit(pageblockheading3);
                    break;
                case 4:
                    TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                    pageblockheading4.text = richTextFirst;
                    emit(pageblockheading4);
                    break;
                case 5:
                    TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                    pageblockheading5.text = richTextFirst;
                    emit(pageblockheading5);
                    break;
                case 6:
                    TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                    pageblockheading6.text = richTextFirst;
                    emit(pageblockheading6);
                    break;
                default:
                    TL_iv.pageBlockHeader pageblockheader = new TL_iv.pageBlockHeader();
                    pageblockheader.text = richTextFirst;
                    emit(pageblockheader);
                    break;
            }
        }

        @Override
        public final void visit(Paragraph paragraph) {
            for (TL_iv.RichText richText : MarkdownParser.access$400(MarkdownParser.access$300(paragraph, null))) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = richText;
                emit(pageblockparagraph);
            }
        }

        @Override
        public final void visit(BlockQuote blockQuote) {
            for (TL_iv.RichText richText : MarkdownParser.access$400(MarkdownParser.access$300(blockQuote, null))) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.text = richText;
                pageblockblockquote.caption = new TL_iv.textEmpty();
                emit(pageblockblockquote);
            }
        }

        @Override
        public final void visit(ThematicBreak thematicBreak) {
            emit(new TL_iv.pageBlockDivider());
        }

        @Override
        public final void visit(FencedCodeBlock fencedCodeBlock) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
            pageblockpreformatted.text = MarkdownParser.first(MarkdownParser.plain(fencedCodeBlock.literal));
            String str = fencedCodeBlock.info;
            if (str == null) {
                str = "";
            }
            pageblockpreformatted.language = str;
            emit(pageblockpreformatted);
        }

        @Override
        public final void visit(IndentedCodeBlock indentedCodeBlock) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
            pageblockpreformatted.text = MarkdownParser.first(MarkdownParser.plain(indentedCodeBlock.literal));
            pageblockpreformatted.language = "";
            emit(pageblockpreformatted);
        }

        @Override
        public final void visit(BulletList bulletList) {
            TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
            for (Node node = (Node) bulletList.firstChild; node != null; node = (Node) node.next) {
                if (node instanceof ListItem) {
                    int iStripCheckboxPrefix = stripCheckboxPrefix(node);
                    TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                    if (iStripCheckboxPrefix >= 0) {
                        tL_pageListItemText.checkbox = true;
                        tL_pageListItemText.checked = iStripCheckboxPrefix == 1;
                    }
                    tL_pageListItemText.text = MarkdownParser.first(MarkdownParser.access$300(node, pageblocklist));
                    pageblocklist.items.add(tL_pageListItemText);
                }
            }
            emit(pageblocklist);
        }

        @Override
        public final void visit(OrderedList orderedList) {
            String strValueOf;
            TL_iv.pageBlockOrderedList pageblockorderedlist = new TL_iv.pageBlockOrderedList();
            boolean z = ((Block) ((Node) orderedList.parent)) instanceof Document;
            int i = orderedList.startNumber;
            for (Node node = (Node) orderedList.firstChild; node != null; node = (Node) node.next) {
                if (node instanceof ListItem) {
                    if (z) {
                        ArrayDeque arrayDeque = this.orderedMarkers;
                        if (!arrayDeque.isEmpty()) {
                            strValueOf = (String) arrayDeque.poll();
                        } else {
                            strValueOf = String.valueOf(i);
                            i++;
                        }
                    } else {
                        strValueOf = String.valueOf(i);
                        i++;
                    }
                    int iStripCheckboxPrefix = stripCheckboxPrefix(node);
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                    if (iStripCheckboxPrefix >= 0) {
                        tL_pageListOrderedItemText.checkbox = true;
                        tL_pageListOrderedItemText.checked = iStripCheckboxPrefix == 1;
                    }
                    tL_pageListOrderedItemText.num = strValueOf;
                    tL_pageListOrderedItemText.text = MarkdownParser.first(MarkdownParser.access$300(node, pageblockorderedlist));
                    pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                }
            }
            emit(pageblockorderedlist);
        }

        @Override
        public final void visit(HtmlBlock htmlBlock) {
            StringBuilder sb = this.synth;
            String str = htmlBlock.literal;
            if (str == null) {
                return;
            }
            try {
                this.htmlParser.processFragment(sb, str);
            } catch (Throwable th) {
                FileLog.e(th);
                sb.append(str);
            }
        }

        @Override
        public final void visit(CustomBlock customBlock) {
            if (customBlock instanceof TableBlock) {
                TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
                pageblocktable.bordered = true;
                pageblocktable.title = new TL_iv.textEmpty();
                for (Node node = (Node) ((TableBlock) customBlock).firstChild; node != null; node = (Node) node.next) {
                    boolean z = node instanceof TableHead;
                    if (z || (node instanceof TableBody)) {
                        for (Node node2 = (Node) node.firstChild; node2 != null; node2 = (Node) node2.next) {
                            if (node2 instanceof TableRow) {
                                ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                                for (Node node3 = (Node) ((TableRow) node2).firstChild; node3 != null; node3 = (Node) node3.next) {
                                    if (node3 instanceof TableCell) {
                                        ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                        TableCell tableCell = (TableCell) node3;
                                        TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                        pagetablecell.header = z || tableCell.header;
                                        TableCell.Alignment alignment = tableCell.alignment;
                                        if (alignment == TableCell.Alignment.CENTER) {
                                            pagetablecell.align_center = true;
                                        } else if (alignment == TableCell.Alignment.RIGHT) {
                                            pagetablecell.align_right = true;
                                        }
                                        pagetablecell.text = MarkdownParser.first(MarkdownParser.access$300(tableCell, null));
                                        pagetablecell.flags |= 128;
                                        arrayList2.add(pagetablecell);
                                    }
                                }
                                arrayList.add(pagetablerow);
                            }
                        }
                    }
                }
                emit(pageblocktable);
                return;
            }
            if (customBlock instanceof JLatexMathBlock) {
                TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = MarkdownParser.access$500(((JLatexMathBlock) customBlock).latex);
                emit(pageblockparagraph);
                return;
            }
            visitChildren(customBlock);
        }
    }
}
