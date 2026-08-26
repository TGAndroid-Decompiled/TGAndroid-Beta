package org.telegram.ui.iv;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

public final class RichEditorLimits {
    public int blocks;
    public int depth;
    public int length;
    public int media;
    public int tableCols;

    public static void addText(TL_iv.RichText richText, int i, RichEditorLimits richEditorLimits) {
        if (richText == null) {
            return;
        }
        richEditorLimits.length = RichTextStyle.plainOf(richText).length() + richEditorLimits.length;
        int iRichTextDepth = richTextDepth(richText) + i;
        if (iRichTextDepth > richEditorLimits.depth) {
            richEditorLimits.depth = iRichTextDepth;
        }
    }

    public static void measureBlock(TL_iv.PageBlock pageBlock, int i, RichEditorLimits richEditorLimits) {
        int i2;
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
        int i3 = 0;
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            addText(pageblockblockquoteblocks.caption, i, richEditorLimits);
            richEditorLimits.blocks = pageblockblockquoteblocks.blocks.size() + richEditorLimits.blocks;
            while (i3 < pageblockblockquoteblocks.blocks.size()) {
                measureBlock(pageblockblockquoteblocks.blocks.get(i3), i + 1, richEditorLimits);
                i3++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            addText(pageblockdetails.title, i, richEditorLimits);
            richEditorLimits.blocks = pageblockdetails.blocks.size() + richEditorLimits.blocks;
            while (i3 < pageblockdetails.blocks.size()) {
                measureBlock(pageblockdetails.blocks.get(i3), i + 1, richEditorLimits);
                i3++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            richEditorLimits.blocks = pageblocklist.items.size() + richEditorLimits.blocks;
            for (int i4 = 0; i4 < pageblocklist.items.size(); i4++) {
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i4);
                int i5 = i + 1;
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    addText(((TL_iv.TL_pageListItemText) pageListItem).text, i5, richEditorLimits);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        measureBlock(arrayList.get(i6), i5, richEditorLimits);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            richEditorLimits.blocks = pageblockorderedlist.items.size() + richEditorLimits.blocks;
            for (int i7 = 0; i7 < pageblockorderedlist.items.size(); i7++) {
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i7);
                int i8 = i + 1;
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    addText(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, i8, richEditorLimits);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                    for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                        measureBlock(arrayList2.get(i9), i8, richEditorLimits);
                    }
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
            addText(pageblocktable.title, i, richEditorLimits);
            ArrayList<TL_iv.pageTableRow> arrayList3 = pageblocktable.rows;
            if (arrayList3 != null) {
                richEditorLimits.blocks = arrayList3.size() + richEditorLimits.blocks;
                for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
                    TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
                    if (pagetablerow.cells != null) {
                        i2 = 0;
                        for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                            TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i11);
                            int i12 = pagetablecell.colspan;
                            if (i12 == 0) {
                                i12 = 1;
                            }
                            i2 += i12;
                            addText(pagetablecell.text, i + 1, richEditorLimits);
                        }
                    } else {
                        i2 = 0;
                    }
                    if (i2 > richEditorLimits.tableCols) {
                        richEditorLimits.tableCols = i2;
                    }
                }
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            ArrayList<TL_keyboard.PageButton> arrayList4 = ((TL_iv.pageBlockButtonRow) pageBlock).buttons;
            if (arrayList4 != null) {
                int size = arrayList4.size();
                while (i3 < size) {
                    TL_keyboard.PageButton pageButton = arrayList4.get(i3);
                    i3++;
                    TL_keyboard.PageButton pageButton2 = pageButton;
                    if (pageButton2 != null) {
                        addText(pageButton2.text, i + 1, richEditorLimits);
                    }
                }
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                addText(pageCaption.text, i, richEditorLimits);
                addText(pageCaption.credit, i, richEditorLimits);
            }
            ArrayList<TL_iv.PageBlock> arrayList5 = ((TL_iv.pageBlockCollage) pageBlock).items;
            while (i3 < arrayList5.size()) {
                measureBlock(arrayList5.get(i3), i + 1, richEditorLimits);
                i3++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.PageCaption pageCaption2 = pageBlock.caption;
            if (pageCaption2 != null) {
                addText(pageCaption2.text, i, richEditorLimits);
                addText(pageCaption2.credit, i, richEditorLimits);
            }
            ArrayList<TL_iv.PageBlock> arrayList6 = ((TL_iv.pageBlockSlideshow) pageBlock).items;
            while (i3 < arrayList6.size()) {
                measureBlock(arrayList6.get(i3), i + 1, richEditorLimits);
                i3++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            String str = ((TL_iv.pageBlockMath) pageBlock).source;
            if (str != null) {
                richEditorLimits.length = str.length() + richEditorLimits.length;
                return;
            }
            return;
        }
        TL_iv.PageCaption pageCaption3 = pageBlock.caption;
        if (pageCaption3 == null) {
            return;
        }
        addText(pageCaption3.text, i, richEditorLimits);
        addText(pageCaption3.credit, i, richEditorLimits);
    }

    public static int richTextDepth(TL_iv.RichText richText) {
        int i = 0;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return 0;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            return richTextDepth(richText.text) + 1;
        }
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int iMax = 0;
        while (i < size) {
            TL_iv.RichText richText2 = arrayList.get(i);
            i++;
            iMax = Math.max(iMax, richTextDepth(richText2));
        }
        return iMax;
    }
}
