package org.telegram.ui.iv;

import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.tgnet.tl.TL_iv;

public class RichEditorLimits {
    public int blocks;
    public int depth;
    public int length;
    public int media;
    public int tableCols;

    public static RichEditorLimits measure(ArrayList arrayList, int i) {
        RichEditorLimits richEditorLimits = new RichEditorLimits();
        richEditorLimits.media = i;
        richEditorLimits.blocks += arrayList.size();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            measureBlock((TL_iv.PageBlock) arrayList.get(i2), 1, richEditorLimits);
        }
        return richEditorLimits;
    }

    public int findExceeded(AppGlobalConfig appGlobalConfig) {
        if (this.length > appGlobalConfig.richMessageLengthLimit.get()) {
            return 1;
        }
        if (this.blocks > appGlobalConfig.richMessageMaxBlocks.get()) {
            return 2;
        }
        if (this.depth > appGlobalConfig.richMessageMaxDepth.get()) {
            return 3;
        }
        if (this.media > appGlobalConfig.richMessageMaxMedia.get()) {
            return 4;
        }
        return this.tableCols > appGlobalConfig.richMessageMaxTableCols.get() ? 5 : 0;
    }

    private static void measureBlock(TL_iv.PageBlock pageBlock, int i, RichEditorLimits richEditorLimits) {
        int iSpanCol;
        if (pageBlock == null) {
            return;
        }
        if (i > richEditorLimits.depth) {
            richEditorLimits.depth = i;
        }
        addText(pageBlock.text, i, richEditorLimits);
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            addText(((TL_iv.pageBlockBlockquote) pageBlock).caption, i, richEditorLimits);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            addText(((TL_iv.pageBlockPullquote) pageBlock).caption, i, richEditorLimits);
            return;
        }
        int i2 = 0;
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            addText(pageblockblockquoteblocks.caption, i, richEditorLimits);
            richEditorLimits.blocks += pageblockblockquoteblocks.blocks.size();
            while (i2 < pageblockblockquoteblocks.blocks.size()) {
                measureBlock(pageblockblockquoteblocks.blocks.get(i2), i + 1, richEditorLimits);
                i2++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            addText(pageblockdetails.title, i, richEditorLimits);
            richEditorLimits.blocks += pageblockdetails.blocks.size();
            while (i2 < pageblockdetails.blocks.size()) {
                measureBlock(pageblockdetails.blocks.get(i2), i + 1, richEditorLimits);
                i2++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            richEditorLimits.blocks += pageblocklist.items.size();
            while (i2 < pageblocklist.items.size()) {
                measureListItem(pageblocklist.items.get(i2), i + 1, richEditorLimits);
                i2++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            richEditorLimits.blocks += pageblockorderedlist.items.size();
            while (i2 < pageblockorderedlist.items.size()) {
                measureOrderedItem(pageblockorderedlist.items.get(i2), i + 1, richEditorLimits);
                i2++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
            addText(pageblocktable.title, i, richEditorLimits);
            ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
            if (arrayList != null) {
                richEditorLimits.blocks += arrayList.size();
                for (int i3 = 0; i3 < pageblocktable.rows.size(); i3++) {
                    TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i3);
                    if (pagetablerow.cells != null) {
                        iSpanCol = 0;
                        for (int i4 = 0; i4 < pagetablerow.cells.size(); i4++) {
                            TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i4);
                            iSpanCol += TableModel.spanCol(pagetablecell);
                            addText(pagetablecell.text, i + 1, richEditorLimits);
                        }
                    } else {
                        iSpanCol = 0;
                    }
                    if (iSpanCol > richEditorLimits.tableCols) {
                        richEditorLimits.tableCols = iSpanCol;
                    }
                }
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            addCaption(pageBlock.caption, i, richEditorLimits);
            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.pageBlockCollage) pageBlock).items;
            while (i2 < arrayList2.size()) {
                measureBlock(arrayList2.get(i2), i + 1, richEditorLimits);
                i2++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            addCaption(pageBlock.caption, i, richEditorLimits);
            ArrayList<TL_iv.PageBlock> arrayList3 = ((TL_iv.pageBlockSlideshow) pageBlock).items;
            while (i2 < arrayList3.size()) {
                measureBlock(arrayList3.get(i2), i + 1, richEditorLimits);
                i2++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            String str = ((TL_iv.pageBlockMath) pageBlock).source;
            if (str != null) {
                richEditorLimits.length += str.length();
                return;
            }
            return;
        }
        addCaption(pageBlock.caption, i, richEditorLimits);
    }

    private static void measureListItem(TL_iv.PageListItem pageListItem, int i, RichEditorLimits richEditorLimits) {
        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
            addText(((TL_iv.TL_pageListItemText) pageListItem).text, i, richEditorLimits);
            return;
        }
        if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                measureBlock(arrayList.get(i2), i, richEditorLimits);
            }
        }
    }

    private static void measureOrderedItem(TL_iv.PageListOrderedItem pageListOrderedItem, int i, RichEditorLimits richEditorLimits) {
        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
            addText(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, i, richEditorLimits);
            return;
        }
        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                measureBlock(arrayList.get(i2), i, richEditorLimits);
            }
        }
    }

    private static void addCaption(TL_iv.PageCaption pageCaption, int i, RichEditorLimits richEditorLimits) {
        if (pageCaption == null) {
            return;
        }
        addText(pageCaption.text, i, richEditorLimits);
        addText(pageCaption.credit, i, richEditorLimits);
    }

    private static void addText(TL_iv.RichText richText, int i, RichEditorLimits richEditorLimits) {
        if (richText == null) {
            return;
        }
        richEditorLimits.length += RichTextStyle.plainOf(richText).length();
        int iRichTextDepth = i + richTextDepth(richText);
        if (iRichTextDepth > richEditorLimits.depth) {
            richEditorLimits.depth = iRichTextDepth;
        }
    }

    private static int richTextDepth(TL_iv.RichText richText) {
        int iMax = 0;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return 0;
        }
        if (richText instanceof TL_iv.textConcat) {
            Iterator<TL_iv.RichText> it = ((TL_iv.textConcat) richText).texts.iterator();
            while (it.hasNext()) {
                iMax = Math.max(iMax, richTextDepth(it.next()));
            }
            return iMax;
        }
        return richTextDepth(richText.text) + 1;
    }
}
