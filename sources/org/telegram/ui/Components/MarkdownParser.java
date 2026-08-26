package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.gms.dynamite.zzk;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import io.noties.markwon.MarkwonPlugin;
import io.noties.markwon.ext.latex.JLatexMathBlock;
import io.noties.markwon.ext.latex.JLatexMathInlineProcessor;
import io.noties.markwon.ext.latex.JLatexMathNode;
import io.noties.markwon.ext.latex.JLatexMathPlugin$Builder;
import io.noties.markwon.html.HtmlTag;
import io.noties.markwon.html.HtmlTagImpl;
import io.noties.markwon.html.MarkwonHtmlParser;
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
import io.noties.markwon.inlineparser.MarkwonInlineParserPlugin;
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
import org.commonmark.internal.DocumentParser;
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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.iv.Latex;
import org.telegram.ui.iv.RichMediaCell;
import org.telegram.ui.web.MHTML;

public class MarkdownParser {
    private static final int MAX_FILE_SIZE = 65536;
    private static final int MAX_RICH_TEXT_LEN = 8192;
    private static final Pattern FOOTNOTE_DEF = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    private static final Pattern FOOTNOTE_REF = Pattern.compile("\\[\\^([^\\]]+)\\]");
    private static final Pattern ORDERED_MARKER = Pattern.compile("^(\\d+)[.)]\\s");

    public static class BlockVisitor extends AbstractVisitor {
        private static final int MAX_SCOPE_DEPTH = 64;
        public final ArrayList<TL_iv.PageBlock> blocks;
        private final MarkwonHtmlParser htmlParser;
        private final List<Item> items;
        private final ArrayDeque<String> orderedMarkers;
        private final StringBuilder synth;
        public TL_iv.RichText title;

        public static final class Item {
            final TL_iv.PageBlock block;
            final int end;
            final int start;

            public Item(TL_iv.PageBlock pageBlock, int i, int i2) {
                this.block = pageBlock;
                this.start = i;
                this.end = i2;
            }
        }

        public static final class Scope {
            final List<Object> children = new ArrayList();
            final int end;
            final int start;
            final HtmlTag.Block tag;

            public Scope(HtmlTag.Block block, int i, int i2) {
                this.tag = block;
                this.start = i;
                this.end = i2;
            }
        }

        public BlockVisitor(ArrayList<TL_iv.PageBlock> arrayList) {
            this(arrayList, new ArrayDeque());
        }

        private TL_iv.pageBlockTable buildTable(TableBlock tableBlock) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (Node node = tableBlock.firstChild; node != null; node = node.next) {
                boolean z = node instanceof TableHead;
                if (z || (node instanceof TableBody)) {
                    for (Node node2 = node.firstChild; node2 != null; node2 = node2.next) {
                        if (node2 instanceof TableRow) {
                            pageblocktable.rows.add(buildTableRow((TableRow) node2, z));
                        }
                    }
                }
            }
            return pageblocktable;
        }

        private TL_iv.pageTableCell buildTableCell(TableCell tableCell, boolean z) {
            TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
            pagetablecell.header = z || tableCell.header;
            TableCell.Alignment alignment = tableCell.alignment;
            if (alignment == TableCell.Alignment.CENTER) {
                pagetablecell.align_center = true;
            } else if (alignment == TableCell.Alignment.RIGHT) {
                pagetablecell.align_right = true;
            }
            pagetablecell.text = MarkdownParser.first(MarkdownParser.richTextOf(tableCell, null));
            pagetablecell.flags |= 128;
            return pagetablecell;
        }

        private TL_iv.pageTableRow buildTableRow(TableRow tableRow, boolean z) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            for (Node node = tableRow.firstChild; node != null; node = node.next) {
                if (node instanceof TableCell) {
                    pagetablerow.cells.add(buildTableCell((TableCell) node, z));
                }
            }
            return pagetablerow;
        }

        private void collectText(List<Object> list, StringBuilder sb) {
            for (Object obj : list) {
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
                    collectText(((Scope) obj).children, sb);
                }
            }
        }

        private void emit(TL_iv.PageBlock pageBlock) {
            int length = this.synth.length();
            this.synth.append((char) 1);
            this.items.add(new Item(pageBlock, length, this.synth.length()));
        }

        private static void flattenBlockTags(List<HtmlTag.Block> list, List<HtmlTag.Block> list2) {
            for (HtmlTag.Block block : list) {
                list2.add(block);
                ArrayList arrayList = ((HtmlTagImpl.BlockImpl) block).children;
                flattenBlockTags(arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList), list2);
            }
        }

        public static int lambda$finish$0(HtmlTag.Block block, HtmlTag.Block block2) {
            int iCompare = Integer.compare(((HtmlTagImpl) block).start, ((HtmlTagImpl) block2).start);
            return iCompare != 0 ? iCompare : Integer.compare(((HtmlTagImpl) block2).end, ((HtmlTagImpl) block).end);
        }

        private void materialize(List<Object> list, List<TL_iv.PageBlock> list2) {
            materialize(list, list2, 0);
        }

        private TL_iv.RichText scopeToRichText(Scope scope) {
            StringBuilder sb = new StringBuilder();
            collectText(scope.children, sb);
            String strTrim = sb.toString().trim();
            return strTrim.isEmpty() ? new TL_iv.textEmpty() : MarkdownParser.plain(strTrim);
        }

        private static int stripCheckboxPrefix(Node node) {
            org.commonmark.node.Text text;
            String str;
            Node node2 = node.firstChild;
            if (!(node2 instanceof Paragraph)) {
                return -1;
            }
            Node node3 = node2.firstChild;
            if ((node3 instanceof org.commonmark.node.Text) && (str = (text = (org.commonmark.node.Text) node3).literal) != null) {
                int i = 3;
                if (str.length() >= 3) {
                    int i2 = 0;
                    if (str.charAt(0) == '[' && str.charAt(2) == ']') {
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
                }
            }
            return -1;
        }

        private void wrapScope(Scope scope, List<TL_iv.PageBlock> list, int i) {
            byte b;
            Object obj = scope.tag;
            String lowerCase = ((HtmlTagImpl) obj).name == null ? "" : ((HtmlTagImpl) obj).name.toLowerCase();
            if (i >= 64) {
                materialize(scope.children, list, i + 1);
                return;
            }
            boolean z = false;
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
                    materialize(scope.children, list, i + 1);
                    return;
                }
                return;
            }
            TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
            HtmlTag.Block block = scope.tag;
            if (((HtmlTagImpl.BlockImpl) block).attributes != null && ((HtmlTagImpl.BlockImpl) block).attributes.containsKey("open")) {
                z = true;
            }
            pageblockdetails.open = z;
            pageblockdetails.title = new TL_iv.textEmpty();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : scope.children) {
                boolean z2 = obj2 instanceof Scope;
                if (z2) {
                    Scope scope2 = (Scope) obj2;
                    if ("summary".equalsIgnoreCase(((HtmlTagImpl) scope2.tag).name)) {
                        pageblockdetails.title = scopeToRichText(scope2);
                    }
                }
                if (obj2 instanceof Item) {
                    TL_iv.PageBlock pageBlock = ((Item) obj2).block;
                    if (pageBlock != null) {
                        arrayList.add(pageBlock);
                    }
                } else if (z2) {
                    wrapScope((Scope) obj2, arrayList, i + 1);
                }
            }
            pageblockdetails.blocks.addAll(arrayList);
            list.add(pageblockdetails);
        }

        public void finish() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            try {
                MarkwonHtmlParser markwonHtmlParser = this.htmlParser;
                int length = this.synth.length();
                MarkwonHtmlParserImpl markwonHtmlParserImpl = (MarkwonHtmlParserImpl) markwonHtmlParser;
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
            flattenBlockTags(arrayList, arrayList3);
            HashMap map = new HashMap();
            for (Item item : this.items) {
                map.put(Integer.valueOf(item.start), item);
            }
            TreeSet<Integer> treeSet = new TreeSet();
            treeSet.add(0);
            treeSet.add(Integer.valueOf(this.synth.length()));
            for (Integer num : map.keySet()) {
                treeSet.add(num);
                treeSet.add(Integer.valueOf(num.intValue() + 1));
            }
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                HtmlTagImpl htmlTagImpl = (HtmlTagImpl) ((HtmlTag.Block) obj);
                treeSet.add(Integer.valueOf(htmlTagImpl.start));
                treeSet.add(Integer.valueOf(htmlTagImpl.end));
            }
            ArrayList arrayList4 = new ArrayList();
            Integer num2 = null;
            for (Integer num3 : treeSet) {
                if (num2 != null && num3.intValue() > num2.intValue()) {
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num3.intValue();
                    if (iIntValue2 - iIntValue == 1 && map.containsKey(num2)) {
                        arrayList4.add((Item) map.get(num2));
                    } else {
                        String strTrim = this.synth.substring(iIntValue, iIntValue2).trim();
                        if (!strTrim.isEmpty()) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = MarkdownParser.first(MarkdownParser.plain(strTrim));
                            arrayList4.add(new Item(pageblockparagraph, iIntValue, iIntValue2));
                        }
                    }
                }
                num2 = num3;
            }
            Collections.sort(arrayList3, new SeekBar$$ExternalSyntheticLambda0(7));
            Scope scope = new Scope(null, 0, Integer.MAX_VALUE);
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(scope);
            int size2 = arrayList4.size();
            int i3 = 0;
            while (i < size2) {
                Object obj2 = arrayList4.get(i);
                i++;
                Item item2 = (Item) obj2;
                while (i3 < arrayList3.size() && ((HtmlTagImpl) ((HtmlTag.Block) arrayList3.get(i3))).start <= item2.start) {
                    int i4 = i3 + 1;
                    HtmlTag.Block block = (HtmlTag.Block) arrayList3.get(i3);
                    HtmlTagImpl htmlTagImpl2 = (HtmlTagImpl) block;
                    if (htmlTagImpl2.end >= item2.start) {
                        while (arrayDeque.peek() != scope && ((Scope) arrayDeque.peek()).end <= htmlTagImpl2.start) {
                            arrayDeque.pop();
                        }
                        Scope scope2 = new Scope(block, htmlTagImpl2.start, htmlTagImpl2.end);
                        ((Scope) arrayDeque.peek()).children.add(scope2);
                        arrayDeque.push(scope2);
                    }
                    i3 = i4;
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

        @Override
        public void visit(Heading heading) {
            TL_iv.RichText richTextFirst = MarkdownParser.first(MarkdownParser.richTextOf(heading, null));
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

        public BlockVisitor(ArrayList<TL_iv.PageBlock> arrayList, ArrayDeque<String> arrayDeque) {
            this.items = new ArrayList();
            this.synth = new StringBuilder();
            this.htmlParser = new MarkwonHtmlParserImpl(new zzk(21), new RichMediaCell.AnonymousClass2(22));
            this.blocks = arrayList;
            this.orderedMarkers = arrayDeque;
        }

        private void materialize(List<Object> list, List<TL_iv.PageBlock> list2, int i) {
            for (Object obj : list) {
                if (obj instanceof Item) {
                    TL_iv.PageBlock pageBlock = ((Item) obj).block;
                    if (pageBlock != null) {
                        list2.add(pageBlock);
                    }
                } else if (obj instanceof Scope) {
                    wrapScope((Scope) obj, list2, i);
                }
            }
        }

        @Override
        public void visit(HtmlBlock htmlBlock) {
            String str = htmlBlock.literal;
            if (str == null) {
                return;
            }
            try {
                this.htmlParser.processFragment(this.synth, str);
            } catch (Throwable th) {
                FileLog.e(th);
                this.synth.append(str);
            }
        }

        @Override
        public void visit(Paragraph paragraph) {
            for (TL_iv.RichText richText : MarkdownParser.split(MarkdownParser.richTextOf(paragraph, null))) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = richText;
                emit(pageblockparagraph);
            }
        }

        @Override
        public void visit(BlockQuote blockQuote) {
            for (TL_iv.RichText richText : MarkdownParser.split(MarkdownParser.richTextOf(blockQuote, null))) {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.text = richText;
                pageblockblockquote.caption = new TL_iv.textEmpty();
                emit(pageblockblockquote);
            }
        }

        @Override
        public void visit(ThematicBreak thematicBreak) {
            emit(new TL_iv.pageBlockDivider());
        }

        @Override
        public void visit(FencedCodeBlock fencedCodeBlock) {
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
        public void visit(IndentedCodeBlock indentedCodeBlock) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
            pageblockpreformatted.text = MarkdownParser.first(MarkdownParser.plain(indentedCodeBlock.literal));
            pageblockpreformatted.language = "";
            emit(pageblockpreformatted);
        }

        @Override
        public void visit(BulletList bulletList) {
            TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
            for (Node node = bulletList.firstChild; node != null; node = node.next) {
                if (node instanceof ListItem) {
                    int iStripCheckboxPrefix = stripCheckboxPrefix(node);
                    TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                    if (iStripCheckboxPrefix >= 0) {
                        tL_pageListItemText.checkbox = true;
                        tL_pageListItemText.checked = iStripCheckboxPrefix == 1;
                    }
                    tL_pageListItemText.text = MarkdownParser.first(MarkdownParser.richTextOf(node, pageblocklist));
                    pageblocklist.items.add(tL_pageListItemText);
                }
            }
            emit(pageblocklist);
        }

        @Override
        public void visit(OrderedList orderedList) {
            String strValueOf;
            TL_iv.pageBlockOrderedList pageblockorderedlist = new TL_iv.pageBlockOrderedList();
            boolean z = ((Block) orderedList.parent) instanceof Document;
            int i = orderedList.startNumber;
            for (Node node = orderedList.firstChild; node != null; node = node.next) {
                if (node instanceof ListItem) {
                    if (z && !this.orderedMarkers.isEmpty()) {
                        strValueOf = this.orderedMarkers.poll();
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
                    tL_pageListOrderedItemText.text = MarkdownParser.first(MarkdownParser.richTextOf(node, pageblockorderedlist));
                    pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                }
            }
            emit(pageblockorderedlist);
        }

        @Override
        public void visit(CustomBlock customBlock) {
            if (customBlock instanceof TableBlock) {
                emit(buildTable((TableBlock) customBlock));
            } else {
                if (customBlock instanceof JLatexMathBlock) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = MarkdownParser.makeLatex(((JLatexMathBlock) customBlock).latex);
                    emit(pageblockparagraph);
                    return;
                }
                visitChildren(customBlock);
            }
        }
    }

    public static class SingleDollarLatexInlineProcessor extends InlineProcessor {
        private static final Pattern RE = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

        @Override
        public Node parse() {
            String strMatch = match(RE);
            if (strMatch == null) {
                return null;
            }
            JLatexMathNode jLatexMathNode = new JLatexMathNode();
            jLatexMathNode.latex = Fragment$$ExternalSyntheticOutline0.m(1, 1, strMatch);
            return jLatexMathNode;
        }

        @Override
        public char specialCharacter() {
            return '$';
        }
    }

    public static final class TextStyle extends TL_iv.RichText {
        int styleFlags;

        private TextStyle() {
        }
    }

    private static void appendFootnotes(Parser parser, ArrayList<TL_iv.PageBlock> arrayList, LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap.isEmpty()) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.title = bold(LocaleController.getString(R.string.InstantViewReferences));
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            BlockVisitor blockVisitor = new BlockVisitor(arrayList2);
            blockVisitor.visit(parser.parse(value));
            blockVisitor.finish();
            TL_iv.RichText richTextFirst = first(combineParagraphs(arrayList2));
            TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
            textanchor.name = zzii.m("fn-", key);
            textanchor.text = richTextFirst;
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = concat(bold(zzhp.m(key, ". ")), textanchor);
            pageblockdetails.blocks.add(pageblockparagraph);
        }
        arrayList.add(pageblockdetails);
    }

    private static TL_iv.RichText bold(String str) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = plain(str);
        return textbold;
    }

    private static TL_iv.RichText combineParagraphs(ArrayList<TL_iv.PageBlock> arrayList) {
        TL_iv.RichText richText;
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_iv.PageBlock pageBlock = arrayList.get(i);
            i++;
            TL_iv.PageBlock pageBlock2 = pageBlock;
            if (pageBlock2 instanceof TL_iv.pageBlockParagraph) {
                richText = ((TL_iv.pageBlockParagraph) pageBlock2).text;
            } else if (pageBlock2 instanceof TL_iv.pageBlockHeader) {
                richText = ((TL_iv.pageBlockHeader) pageBlock2).text;
            } else if (pageBlock2 instanceof TL_iv.pageBlockSubheader) {
                richText = ((TL_iv.pageBlockSubheader) pageBlock2).text;
            } else {
                richText = pageBlock2 instanceof TL_iv.pageBlockTitle ? ((TL_iv.pageBlockTitle) pageBlock2).text : null;
            }
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                if (!textconcat.texts.isEmpty()) {
                    textconcat.texts.add(plain("\n\n"));
                }
                textconcat.texts.add(richText);
            }
        }
        if (textconcat.texts.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        return textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    private static TL_iv.RichText concat(TL_iv.RichText... richTextArr) {
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        for (TL_iv.RichText richText : richTextArr) {
            textconcat.texts.add(richText);
        }
        return textconcat;
    }

    private static String extractFootnoteDefs(String str, LinkedHashMap<String, String> linkedHashMap) {
        String str2;
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
                    while (true) {
                        if (i >= strArrSplit.length) {
                            break;
                        }
                        str2 = strArrSplit[i];
                        if (!str2.startsWith("    ") && !str2.startsWith("\t")) {
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
                        } else {
                            break;
                        }
                    }
                    sb2.append('\n');
                    sb2.append(str2.startsWith("\t") ? str2.substring(1) : str2.substring(4));
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

    private static int flagFor(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "strike":
            case "s":
            case "del":
                return 32;
            case "strong":
            case "b":
                return 1;
            case "i":
            case "em":
                return 2;
            case "u":
            case "ins":
                return 16;
            case "tt":
            case "code":
                return 4;
            case "sub":
                return 128;
            case "sup":
                return 256;
            case "mark":
                return 64;
            default:
                return 0;
        }
    }

    public static void flattenBlocks(List<HtmlTag.Block> list, List<HtmlTag> list2) {
        for (HtmlTag.Block block : list) {
            list2.add(block);
            ArrayList arrayList = ((HtmlTagImpl.BlockImpl) block).children;
            flattenBlocks(arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList), list2);
        }
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
        if (file == null || !file.exists() || file.length() > 65536) {
            return null;
        }
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
                if (str2.length() > 65536) {
                    return null;
                }
                String str3 = parse(str2, tL_page.blocks);
                if (!TextUtils.isEmpty(str3)) {
                    tL_webPage.flags |= 4;
                    tL_webPage.title = str3;
                }
                tL_webPage.flags |= 1024;
                tL_webPage.cached_page = tL_page;
                return tL_webPage;
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
            return null;
        }
    }

    public static boolean isExtensionMarkdown(String str) {
        return "md".equalsIgnoreCase(str) || "mkd".equalsIgnoreCase(str) || "mdwn".equalsIgnoreCase(str) || "mkdn".equalsIgnoreCase(str) || "mdown".equalsIgnoreCase(str) || "markdown".equalsIgnoreCase(str);
    }

    public static boolean isMarkdown(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        return isExtensionMarkdown(messageObject.getExtension()) || isMimeMarkdown(messageObject.getMimeType());
    }

    public static boolean isMimeMarkdown(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.startsWith("text/markdown") || lowerCase.startsWith("text/x-markdown") || lowerCase.startsWith("text/x-web-markdown");
    }

    public static int lambda$pairHtmlConcat$3(HtmlTag htmlTag) {
        return ((HtmlTagImpl) htmlTag).end - ((HtmlTagImpl) htmlTag).start;
    }

    private static boolean looksLikeHtmlTag(String str) {
        return str != null && str.length() >= 2 && str.charAt(0) == '<' && str.charAt(str.length() - 1) == '>';
    }

    public static TL_iv.textMath makeLatex(String str) {
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

    private static TL_iv.RichText materializeStyles(TL_iv.RichText richText) {
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
            richTextMaterializeStyles = wrapStyle(new TL_iv.textFixed(), richTextMaterializeStyles);
        }
        if ((i2 & 32) != 0) {
            richTextMaterializeStyles = wrapStyle(new TL_iv.textStrike(), richTextMaterializeStyles);
        }
        if ((i2 & 16) != 0) {
            richTextMaterializeStyles = wrapStyle(new TL_iv.textUnderline(), richTextMaterializeStyles);
        }
        if ((i2 & 64) != 0) {
            richTextMaterializeStyles = wrapStyle(new TL_iv.textMarked(), richTextMaterializeStyles);
        }
        if ((i2 & 128) != 0) {
            richTextMaterializeStyles = wrapStyle(new TL_iv.textSubscript(), richTextMaterializeStyles);
        }
        if ((i2 & 256) != 0) {
            richTextMaterializeStyles = wrapStyle(new TL_iv.textSuperscript(), richTextMaterializeStyles);
        }
        if ((i2 & 2) != 0) {
            richTextMaterializeStyles = wrapStyle(new TL_iv.textItalic(), richTextMaterializeStyles);
        }
        return (i2 & 1) != 0 ? wrapStyle(new TL_iv.textBold(), richTextMaterializeStyles) : richTextMaterializeStyles;
    }

    private static TL_iv.RichText pairHtml(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i = 0; i < textconcat.texts.size(); i++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i, pairHtml(arrayList.get(i)));
            }
            return pairHtmlConcat(textconcat);
        }
        TL_iv.RichText richText2 = richText;
        while (true) {
            TL_iv.RichText richText3 = richText2.text;
            if (richText3 == null) {
                return richText;
            }
            if (richText3 instanceof TL_iv.textConcat) {
                richText2.text = pairHtml(richText3);
                return richText;
            }
            richText2 = richText3;
        }
    }

    private static TL_iv.RichText pairHtmlConcat(TL_iv.textConcat textconcat) {
        int i;
        TL_iv.RichText textconcat2;
        HtmlTagImpl.BlockImpl blockImpl;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        MarkwonHtmlParserImpl markwonHtmlParserImpl = new MarkwonHtmlParserImpl(new zzk(21), new RichMediaCell.AnonymousClass2(22));
        ArrayList<TL_iv.RichText> arrayList3 = textconcat.texts;
        int size = arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            TL_iv.RichText richText = arrayList3.get(i2);
            i2++;
            TL_iv.RichText richText2 = richText;
            if (richText2 instanceof TL_iv.textPlain) {
                TL_iv.textPlain textplain = (TL_iv.textPlain) richText2;
                if (looksLikeHtmlTag(textplain.text)) {
                    int length = sb.length();
                    try {
                        markwonHtmlParserImpl.processFragment(sb, ((TL_iv.textPlain) richText2).text);
                    } catch (Throwable th) {
                        FileLog.e(th);
                        sb.append(textplain.text);
                    }
                    int length2 = sb.length();
                    if (length2 > length) {
                        arrayList.add(plain(sb.substring(length, length2)));
                        arrayList2.add(new int[]{length, length2});
                    }
                }
            }
            String strRichTextToString = richTextToString(richText2);
            int length3 = sb.length();
            sb.append(strRichTextToString);
            int length4 = sb.length();
            arrayList.add(richText2);
            arrayList2.add(new int[]{length3, length4});
        }
        ArrayList arrayList4 = new ArrayList();
        try {
            try {
                int length5 = sb.length();
                ArrayList arrayList5 = markwonHtmlParserImpl.inlineTags;
                if (arrayList5.size() > 0) {
                    if (length5 > -1) {
                        int size2 = arrayList5.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj = arrayList5.get(i3);
                            i3++;
                            HtmlTagImpl.InlineImpl inlineImpl = (HtmlTagImpl.InlineImpl) obj;
                            if (inlineImpl.end <= -1) {
                                inlineImpl.end = length5;
                            }
                        }
                    }
                    arrayList4.addAll(DesugarCollections.unmodifiableList(arrayList5));
                    arrayList5.clear();
                } else {
                    arrayList4.addAll(Collections.EMPTY_LIST);
                }
                while (true) {
                    HtmlTagImpl.BlockImpl blockImpl2 = blockImpl.parent;
                    if (blockImpl2 == null) {
                        break;
                    }
                    blockImpl = blockImpl2;
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
            int length6 = sb.length();
            blockImpl = markwonHtmlParserImpl.currentBlock;
            if (length6 > -1) {
                blockImpl.closeAt(length6);
            }
            ArrayList arrayList6 = blockImpl.children;
            List listUnmodifiableList = arrayList6 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList6);
            if (listUnmodifiableList.size() > 0) {
                flattenBlocks(listUnmodifiableList, arrayList4);
            } else {
                flattenBlocks(Collections.EMPTY_LIST, arrayList4);
            }
            markwonHtmlParserImpl.currentBlock = new HtmlTagImpl.BlockImpl("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th3) {
            FileLog.e(th3);
        }
        Collections.sort(arrayList4, Comparator$CC.comparingInt(new MarkdownParser$$ExternalSyntheticLambda0(0)));
        int size3 = arrayList4.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj2 = arrayList4.get(i4);
            i4++;
            HtmlTagImpl htmlTagImpl = (HtmlTagImpl) ((HtmlTag) obj2);
            int i5 = htmlTagImpl.end;
            if (i5 > -1) {
                int i6 = 0;
                int i7 = -1;
                int i8 = -1;
                while (true) {
                    int size4 = arrayList2.size();
                    i = htmlTagImpl.start;
                    if (i6 >= size4) {
                        break;
                    }
                    int i9 = ((int[]) arrayList2.get(i6))[0];
                    int i10 = ((int[]) arrayList2.get(i6))[1];
                    if (i9 >= i && i10 <= i5) {
                        if (i7 == -1) {
                            i7 = i6;
                        }
                        i8 = i6;
                    }
                    i6++;
                }
                if (i7 != -1) {
                    if (i7 == i8) {
                        textconcat2 = (TL_iv.RichText) arrayList.get(i7);
                    } else {
                        textconcat2 = new TL_iv.textConcat();
                        for (int i11 = i7; i11 <= i8; i11++) {
                            textconcat2.texts.add((TL_iv.RichText) arrayList.get(i11));
                        }
                    }
                    TL_iv.RichText richTextWrapByTag = wrapByTag(htmlTagImpl.name, textconcat2);
                    while (i8 >= i7) {
                        arrayList.remove(i8);
                        arrayList2.remove(i8);
                        i8--;
                    }
                    arrayList.add(i7, richTextWrapByTag);
                    arrayList2.add(i7, new int[]{i, i5});
                }
            }
        }
        if (arrayList.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (arrayList.size() == 1) {
            TL_iv.RichText richText3 = (TL_iv.RichText) arrayList.get(0);
            if ((richText3 instanceof TL_iv.textPlain) || (richText3 instanceof TL_iv.textEmpty)) {
                return richText3;
            }
        }
        TL_iv.textConcat textconcat3 = new TL_iv.textConcat();
        textconcat3.texts.addAll(arrayList);
        return textconcat3;
    }

    public static String parse(String str, ArrayList<TL_iv.PageBlock> arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strRewriteFootnoteRefs = rewriteFootnoteRefs(extractFootnoteDefs(str, linkedHashMap));
        List<Extension> listAsList = Arrays.asList(new TablesExtension(1), new TablesExtension(0));
        Pattern pattern = MarkwonInlineParser.PUNCTUATION;
        MarkwonInlineParser.FactoryBuilderImpl factoryBuilderImpl = new MarkwonInlineParser.FactoryBuilderImpl();
        factoryBuilderImpl.referencesEnabled = true;
        ArrayList arrayList2 = factoryBuilderImpl.inlineProcessors;
        arrayList2.addAll(Arrays.asList(new AutolinkInlineProcessor(), new BackslashInlineProcessor(), new BackticksInlineProcessor(), new BangInlineProcessor(0), new CloseBracketInlineProcessor(), new EntityInlineProcessor(), new HtmlInlineProcessor(), new NewLineInlineProcessor(), new BangInlineProcessor(1)));
        factoryBuilderImpl.delimiterProcessors.addAll(Arrays.asList(new AsteriskDelimiterProcessor(0), new AsteriskDelimiterProcessor(1)));
        final MarkwonInlineParserPlugin markwonInlineParserPlugin = new MarkwonInlineParserPlugin(factoryBuilderImpl);
        AndroidUtilities.dp(18.0f);
        JLatexMathPlugin$Builder jLatexMathPlugin$Builder = new JLatexMathPlugin$Builder();
        jLatexMathPlugin$Builder.inlinesEnabled = true;
        boolean z = jLatexMathPlugin$Builder.inlinesEnabled;
        Executors.newCachedThreadPool();
        new Handler(Looper.getMainLooper());
        new HashMap(3);
        MarkwonPlugin.Registry registry = new MarkwonPlugin.Registry() {
            @Override
            public <P extends MarkwonPlugin> P require(Class<P> cls) {
                if (cls == MarkwonInlineParserPlugin.class) {
                    return markwonInlineParserPlugin;
                }
                throw new IllegalStateException("plugin not registered: " + cls);
            }

            public <P extends MarkwonPlugin> void require(Class<P> cls, MarkwonPlugin.Action action) {
                require(cls);
                action.apply();
            }
        };
        if (z) {
            ((MarkwonInlineParserPlugin) registry.require(MarkwonInlineParserPlugin.class)).factoryBuilder.inlineProcessors.add(new JLatexMathInlineProcessor());
        }
        arrayList2.add(new SingleDollarLatexInlineProcessor());
        MHTML mhtml = new MHTML();
        mhtml.entries = new ArrayList();
        mhtml.file = new ArrayList();
        mhtml.boundary = new ArrayList();
        mhtml.entriesByLocation = DocumentParser.CORE_FACTORY_TYPES;
        if (listAsList == null) {
            throw new NullPointerException("extensions must not be null");
        }
        for (Extension extension : listAsList) {
            if (extension instanceof TablesExtension) {
                switch (((TablesExtension) extension).$r8$classId) {
                    case 0:
                        ((ArrayList) mhtml.entries).add(new HeadingParser.Factory(2));
                        continue;
                    default:
                        ((ArrayList) mhtml.file).add(new StrikethroughDelimiterProcessor());
                        break;
                }
            }
        }
        MarkwonInlineParser.FactoryBuilderImpl factoryBuilderImpl2 = markwonInlineParserPlugin.factoryBuilder;
        mhtml.filePos = new MarkwonInlineParser.FactoryBuilderImpl(factoryBuilderImpl2.inlineProcessors, factoryBuilderImpl2.delimiterProcessors, factoryBuilderImpl2.referencesEnabled);
        ((ArrayList) mhtml.entries).add(new HeadingParser.Factory(1));
        Parser parser = new Parser(mhtml);
        BlockVisitor blockVisitor = new BlockVisitor(arrayList, scanOrderedListMarkers(strRewriteFootnoteRefs));
        blockVisitor.visit(parser.parse(strRewriteFootnoteRefs));
        blockVisitor.finish();
        appendFootnotes(parser, arrayList, linkedHashMap);
        TL_iv.RichText richText = blockVisitor.title;
        if (richText != null) {
            return richTextToString(richText);
        }
        return null;
    }

    public static TL_iv.RichText plain(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        return textplain;
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

    private static int richTextLength(TL_iv.RichText richText) {
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

    public static TL_iv.RichText richTextOf(Node node, TL_iv.PageBlock pageBlock) {
        RichTextParser richTextParser = new RichTextParser(pageBlock);
        node.accept(richTextParser);
        return materializeStyles(pairHtml(richTextParser.getText()));
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

    private static ArrayDeque<String> scanOrderedListMarkers(String str) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        String str2 = null;
        boolean z = false;
        for (String str3 : str.split("\n", -1)) {
            int i = 0;
            while (i < str3.length() && i < 3 && str3.charAt(i) == ' ') {
                i++;
            }
            String strSubstring = str3.substring(i);
            if (!z) {
                String str4 = "```";
                if (strSubstring.startsWith("```")) {
                    str2 = str4;
                    z = true;
                } else {
                    str4 = "~~~";
                    if (strSubstring.startsWith("~~~")) {
                        str2 = str4;
                        z = true;
                    } else {
                        Matcher matcher = ORDERED_MARKER.matcher(str3);
                        if (matcher.find()) {
                            arrayDeque.add(matcher.group(1));
                        }
                    }
                }
            } else if (strSubstring.startsWith(str2)) {
                str2 = null;
                z = false;
            }
        }
        return arrayDeque;
    }

    public static List<TL_iv.RichText> split(TL_iv.RichText richText) {
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

    private static TL_iv.RichText wrapByTag(String str, TL_iv.RichText richText) {
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

    private static TL_iv.RichText wrapStyle(TL_iv.RichText richText, TL_iv.RichText richText2) {
        richText.text = richText2;
        return richText;
    }

    public static boolean isMarkdown(ArrayList<TL_iv.PageBlock> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (!(arrayList.get(i) instanceof TL_iv.pageBlockParagraph) || !(arrayList.get(i).text instanceof TL_iv.textPlain)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class RichTextParser extends AbstractVisitor {
        private static final int MAX_BLOCK_DEPTH = 64;
        private final TL_iv.PageBlock block;
        private int blockDepth;
        private TL_iv.textConcat current = new TL_iv.textConcat();

        public RichTextParser(TL_iv.PageBlock pageBlock) {
            this.block = pageBlock;
        }

        private void append(TL_iv.RichText richText) {
            this.current.texts.add(richText);
        }

        private static TL_iv.RichText collapse(TL_iv.textConcat textconcat) {
            if (textconcat.texts.isEmpty()) {
                return new TL_iv.textEmpty();
            }
            return textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
        }

        private TL_iv.RichText collectChildren(Node node) {
            TL_iv.textConcat textconcat = this.current;
            this.current = new TL_iv.textConcat();
            visitChildren(node);
            TL_iv.RichText richTextCollapse = collapse(this.current);
            this.current = textconcat;
            return richTextCollapse;
        }

        public TL_iv.RichText getText() {
            return collapse(this.current);
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

        @Override
        public void visit(Paragraph paragraph) {
            if (!this.current.texts.isEmpty()) {
                append(MarkdownParser.plain("\n\n"));
            }
            visitChildren(paragraph);
        }

        @Override
        public void visit(HtmlInline htmlInline) {
            append(MarkdownParser.plain(htmlInline.literal));
        }

        @Override
        public void visit(org.commonmark.node.Text text) {
            append(MarkdownParser.plain(text.literal));
        }

        @Override
        public void visit(Emphasis emphasis) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = collectChildren(emphasis);
            append(textitalic);
        }

        @Override
        public void visit(StrongEmphasis strongEmphasis) {
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = collectChildren(strongEmphasis);
            append(textbold);
        }

        @Override
        public void visit(Code code) {
            TL_iv.textFixed textfixed = new TL_iv.textFixed();
            textfixed.text = MarkdownParser.plain(code.literal);
            append(textfixed);
        }

        @Override
        public void visit(Link link) {
            String str = link.destination;
            if (str == null) {
                str = "";
            }
            String strTrim = str.trim();
            if (strTrim.startsWith("mailto:")) {
                TL_iv.RichText textemail = new TL_iv.textEmail();
                textemail.text = collectChildren(link);
                textemail.email = strTrim.substring(7);
                append(textemail);
                return;
            }
            if (strTrim.startsWith("tel:")) {
                TL_iv.textPhone textphone = new TL_iv.textPhone();
                textphone.text = collectChildren(link);
                textphone.phone = strTrim.substring(4);
                append(textphone);
                return;
            }
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = collectChildren(link);
            texturl.url = strTrim;
            append(texturl);
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
            append(MarkdownParser.plain(this.block instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
        }

        @Override
        public void visit(CustomNode customNode) {
            if (customNode instanceof Strikethrough) {
                TL_iv.textStrike textstrike = new TL_iv.textStrike();
                textstrike.text = collectChildren(customNode);
                append(textstrike);
            } else if (customNode instanceof JLatexMathNode) {
                append(MarkdownParser.makeLatex(((JLatexMathNode) customNode).latex));
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
                append(MarkdownParser.makeLatex(((JLatexMathBlock) customBlock).latex));
                append(MarkdownParser.plain("\n"));
                return;
            }
            visitChildren(customBlock);
        }
    }
}
