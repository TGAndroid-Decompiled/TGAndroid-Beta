package org.telegram.ui.iv;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.TextStyleSpan;

public abstract class RichMessageConvert {
    public static ArrayList blocksFromCharSequence(CharSequence charSequence) {
        Object objBlockSpan;
        ArrayList arrayList = new ArrayList();
        if (charSequence == null) {
            arrayList.add(emptyParagraph());
            return arrayList;
        }
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        int[] iArrLineStarts = lineStarts(charSequence);
        int length = charSequence.length();
        int i = 0;
        while (i < iArrLineStarts.length) {
            int i2 = iArrLineStarts[i];
            i++;
            int i3 = i < iArrLineStarts.length ? iArrLineStarts[i] - 1 : length;
            CodeHighlighting.Span span = spanned == null ? null : (CodeHighlighting.Span) blockSpan(spanned, i2, i3, CodeHighlighting.Span.class);
            QuoteSpan quoteSpan = (spanned == null || span != null) ? null : (QuoteSpan) blockSpan(spanned, i2, i3, QuoteSpan.class);
            if (span == null && quoteSpan == null) {
                arrayList.add(paragraph(charSequence.subSequence(i2, i3)));
            } else {
                Object obj = span != null ? span : quoteSpan;
                while (i < iArrLineStarts.length) {
                    int i4 = iArrLineStarts[i];
                    int i5 = i + 1;
                    int i6 = i5 < iArrLineStarts.length ? iArrLineStarts[i5] - 1 : length;
                    if (span != null) {
                        objBlockSpan = blockSpan(spanned, i4, i6, CodeHighlighting.Span.class);
                    } else {
                        objBlockSpan = blockSpan(spanned, i4, i6, QuoteSpan.class);
                    }
                    if (objBlockSpan != obj) {
                        break;
                    }
                    i = i5;
                    i3 = i6;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(i2, i3);
                if (span != null) {
                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                    pageblockpreformatted.text = RichTextStyle.fromSpannable(charSequenceSubSequence);
                    String str = span.lng;
                    if (str == null) {
                        str = "";
                    }
                    pageblockpreformatted.language = str;
                    arrayList.add(pageblockpreformatted);
                } else {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    pageblockblockquote.text = RichTextStyle.fromSpannable(charSequenceSubSequence);
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    pageblockblockquote.collapsed = quoteSpan != null && quoteSpan.isCollapsing;
                    arrayList.add(pageblockblockquote);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(emptyParagraph());
        }
        return arrayList;
    }

    private static TL_iv.pageBlockParagraph paragraph(CharSequence charSequence) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = RichTextStyle.fromSpannable(charSequence);
        return pageblockparagraph;
    }

    private static TL_iv.pageBlockParagraph emptyParagraph() {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = new TL_iv.textEmpty();
        return pageblockparagraph;
    }

    private static int[] lineStarts(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) == '\n') {
                arrayList.add(Integer.valueOf(i + 1));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr;
    }

    private static Object blockSpan(Spanned spanned, int i, int i2, Class cls) {
        for (Object obj : spanned.getSpans(i, Math.max(i, i2), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i && spanEnd >= i2) {
                return obj;
            }
        }
        return null;
    }

    public static CharSequence toCharSequence(TL_iv.RichMessage richMessage) {
        return blocksToCharSequence(richMessage == null ? null : richMessage.blocks);
    }

    public static CharSequence blocksToCharSequence(List list) {
        ArrayList arrayList = new ArrayList();
        collectBlocks(arrayList, list);
        return join(arrayList);
    }

    private static void collectBlocks(ArrayList arrayList, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CharSequence charSequenceRenderBlock = renderBlock((TL_iv.PageBlock) it.next());
            if (charSequenceRenderBlock != null) {
                arrayList.add(charSequenceRenderBlock);
            }
        }
    }

    private static CharSequence renderBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.RichText richText;
        if (pageBlock == null) {
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(RichTextStyle.toSpannable(pageBlock.text, pageBlock));
            spannableStringBuilder.setSpan(new CodeHighlighting.Span(true, 0, null, ((TL_iv.pageBlockPreformatted) pageBlock).language, spannableStringBuilder.toString()), 0, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        boolean z = pageBlock instanceof TL_iv.pageBlockBlockquote;
        if (z || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            if (z) {
                richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption;
            } else {
                richText = ((TL_iv.pageBlockPullquote) pageBlock).caption;
            }
            return quoted(RichTextStyle.toSpannable(pageBlock.text, pageBlock), richText);
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            ArrayList arrayList = new ArrayList();
            collectBlocks(arrayList, pageblockblockquoteblocks.blocks);
            return quoted(join(arrayList), pageblockblockquoteblocks.caption);
        }
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
            ArrayList arrayList2 = new ArrayList();
            CharSequence spannable = RichTextStyle.toSpannable(pageblockdetails.title);
            if (!TextUtils.isEmpty(spannable)) {
                arrayList2.add(spannable);
            }
            collectBlocks(arrayList2, pageblockdetails.blocks);
            if (arrayList2.isEmpty()) {
                return null;
            }
            return join(arrayList2);
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            return renderList(((TL_iv.pageBlockList) pageBlock).items);
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            return renderOrderedList(((TL_iv.pageBlockOrderedList) pageBlock).items);
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            return renderTable((TL_iv.pageBlockTable) pageBlock);
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            String str = ((TL_iv.pageBlockMath) pageBlock).source;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return mono(new SpannableStringBuilder(str));
        }
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            return "——————————";
        }
        if (isHeading(pageBlock)) {
            CharSequence charSequenceBold = bold(RichTextStyle.toSpannable(pageBlock.text, pageBlock));
            if (TextUtils.isEmpty(charSequenceBold)) {
                return null;
            }
            return charSequenceBold;
        }
        if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            return RichTextStyle.toSpannable(((TL_iv.pageBlockAuthorDate) pageBlock).author);
        }
        if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockKicker) || (pageBlock instanceof TL_iv.pageBlockThinking)) {
            return RichTextStyle.toSpannable(pageBlock.text, pageBlock);
        }
        return captionText(pageBlock);
    }

    private static CharSequence renderList(ArrayList arrayList) {
        String str;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TL_iv.PageListItem pageListItem = (TL_iv.PageListItem) it.next();
            CharSequence charSequenceListItemText = listItemText(pageListItem);
            if (charSequenceListItemText != null) {
                if (pageListItem.checkbox) {
                    str = pageListItem.checked ? "☑  " : "☐  ";
                } else {
                    str = "•  ";
                }
                arrayList2.add(prefixed(str, charSequenceListItemText));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return join(arrayList2);
    }

    private static CharSequence renderOrderedList(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        int i = 1;
        while (it.hasNext()) {
            TL_iv.PageListOrderedItem pageListOrderedItem = (TL_iv.PageListOrderedItem) it.next();
            CharSequence charSequenceOrderedItemText = orderedItemText(pageListOrderedItem);
            if (charSequenceOrderedItemText != null) {
                arrayList2.add(prefixed((!TextUtils.isEmpty(pageListOrderedItem.num) ? pageListOrderedItem.num : String.valueOf(i)) + ".  ", charSequenceOrderedItemText));
            }
            i++;
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return join(arrayList2);
    }

    private static CharSequence renderTable(TL_iv.pageBlockTable pageblocktable) {
        ArrayList arrayList = new ArrayList();
        CharSequence spannable = RichTextStyle.toSpannable(pageblocktable.title);
        if (!TextUtils.isEmpty(spannable)) {
            arrayList.add(spannable);
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            for (TL_iv.pageTableRow pagetablerow : arrayList2) {
                ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow.cells;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    for (int i = 0; i < pagetablerow.cells.size(); i++) {
                        if (i > 0) {
                            spannableStringBuilder.append((CharSequence) "  |  ");
                        }
                        spannableStringBuilder.append(RichTextStyle.toSpannable(pagetablerow.cells.get(i).text));
                    }
                    arrayList.add(spannableStringBuilder);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return join(arrayList);
    }

    private static CharSequence listItemText(TL_iv.PageListItem pageListItem) {
        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
            return RichTextStyle.toSpannable(((TL_iv.TL_pageListItemText) pageListItem).text);
        }
        if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
            return blocksToCharSequence(((TL_iv.TL_pageListItemBlocks) pageListItem).blocks);
        }
        return null;
    }

    private static CharSequence orderedItemText(TL_iv.PageListOrderedItem pageListOrderedItem) {
        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
            return RichTextStyle.toSpannable(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text);
        }
        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
            return blocksToCharSequence(((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks);
        }
        return null;
    }

    private static CharSequence captionText(TL_iv.PageBlock pageBlock) {
        if (pageBlock.caption == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence spannable = RichTextStyle.toSpannable(pageBlock.caption.text);
        if (!TextUtils.isEmpty(spannable)) {
            spannableStringBuilder.append(spannable);
        }
        CharSequence spannable2 = RichTextStyle.toSpannable(pageBlock.caption.credit);
        if (!TextUtils.isEmpty(spannable2)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(spannable2);
        }
        if (spannableStringBuilder.length() > 0) {
            return spannableStringBuilder;
        }
        return null;
    }

    private static CharSequence quoted(CharSequence charSequence, TL_iv.RichText richText) {
        if (charSequence == null) {
            charSequence = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        CharSequence spannable = RichTextStyle.toSpannable(richText);
        if (!TextUtils.isEmpty(spannable)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) "— ").append(spannable);
        }
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        QuoteSpan.putQuote(spannableStringBuilder, 0, spannableStringBuilder.length(), false);
        return spannableStringBuilder;
    }

    private static CharSequence prefixed(String str, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (charSequence == null) {
            charSequence = "";
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private static CharSequence bold(CharSequence charSequence) {
        return styled(charSequence, 1);
    }

    private static CharSequence mono(CharSequence charSequence) {
        return styled(charSequence, 4);
    }

    private static CharSequence styled(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags = i;
        spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private static CharSequence join(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i));
        }
        return spannableStringBuilder;
    }

    public static boolean isLossy(List list, Map map) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (rowLossy((BlockRow) it.next(), map)) {
                return true;
            }
        }
        return false;
    }

    private static boolean rowLossy(BlockRow blockRow, Map map) {
        if (blockRow == null) {
            return false;
        }
        if (blockRow.detailsEnd || blockRow.level > 0) {
            return true;
        }
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return true;
        }
        boolean z = pageBlock instanceof TL_iv.pageBlockBlockquote;
        if (blockRow.quoteIds.size() + (z ? 1 : 0) > 1) {
            return true;
        }
        if (z && hasText(captionOf(pageBlock))) {
            return true;
        }
        if (map != null && !blockRow.quoteIds.isEmpty()) {
            Iterator it = blockRow.quoteIds.iterator();
            while (it.hasNext()) {
                if (hasText((TL_iv.RichText) map.get((Long) it.next()))) {
                    return true;
                }
            }
        }
        if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z) {
            return inlineLossy(pageBlock.text);
        }
        return true;
    }

    private static TL_iv.RichText captionOf(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    private static boolean hasText(TL_iv.RichText richText) {
        return (richText == null || (richText instanceof TL_iv.textEmpty) || RichTextStyle.plainOf(richText).isEmpty()) ? false : true;
    }

    public static CharSequence rowsToCharSequence(List list) {
        return rowsToCharSequence(list, false);
    }

    private static CharSequence rowsToCharSequence(List list, boolean z) {
        CharSequence spannable;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (list != null && i < list.size()) {
            BlockRow blockRow = (BlockRow) list.get(i);
            if (!blockRow.quoteIds.isEmpty()) {
                long jLongValue = ((Long) blockRow.quoteIds.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i2 = i;
                while (i2 < list.size() && !((BlockRow) list.get(i2)).quoteIds.isEmpty() && ((Long) ((BlockRow) list.get(i2)).quoteIds.get(0)).longValue() == jLongValue) {
                    if (i2 > i) {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(renderLeaf((BlockRow) list.get(i2), z));
                    i2++;
                }
                if (spannableStringBuilder.length() > 0) {
                    QuoteSpan.putQuote(spannableStringBuilder, 0, spannableStringBuilder.length(), false);
                }
                arrayList.add(spannableStringBuilder);
                i = i2;
            } else {
                if (isQuoteLeaf(blockRow.block)) {
                    if (z) {
                        TL_iv.PageBlock pageBlock = blockRow.block;
                        spannable = RichTextStyle.toSimpleSpannable(pageBlock.text, pageBlock);
                    } else {
                        TL_iv.PageBlock pageBlock2 = blockRow.block;
                        spannable = RichTextStyle.toSpannable(pageBlock2.text, pageBlock2);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannable);
                    TL_iv.PageBlock pageBlock3 = blockRow.block;
                    boolean z2 = (pageBlock3 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock3).collapsed;
                    if (spannableStringBuilder2.length() > 0) {
                        QuoteSpan.putQuote(spannableStringBuilder2, 0, spannableStringBuilder2.length(), z2);
                    }
                    arrayList.add(spannableStringBuilder2);
                } else {
                    arrayList.add(renderLeaf(blockRow, z));
                }
                i++;
            }
        }
        return join(arrayList);
    }

    public static CharSequence rowsToSimpleMessage(List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rowsToCharSequence(list, true));
        int length = spannableStringBuilder.length();
        RichTextStyle.setStyle(spannableStringBuilder, 0, length, 65536, false);
        RichTextStyle.setStyle(spannableStringBuilder, 0, length, 16384, false);
        RichTextStyle.setStyle(spannableStringBuilder, 0, length, 32768, false);
        for (MathSpan mathSpan : (MathSpan[]) spannableStringBuilder.getSpans(0, length, MathSpan.class)) {
            spannableStringBuilder.removeSpan(mathSpan);
        }
        return spannableStringBuilder;
    }

    private static boolean inlineLossy(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return false;
        }
        if (richText instanceof TL_iv.textConcat) {
            Iterator<TL_iv.RichText> it = ((TL_iv.textConcat) richText).texts.iterator();
            while (it.hasNext()) {
                if (inlineLossy(it.next())) {
                    return true;
                }
            }
            return false;
        }
        if ((richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMath) || (richText instanceof TL_iv.textButton)) {
            return true;
        }
        return inlineLossy(richText.text);
    }

    private static boolean isQuoteLeaf(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    private static CharSequence renderLeaf(BlockRow blockRow, boolean z) {
        CharSequence spannable;
        if (z) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            spannable = RichTextStyle.toSimpleSpannable(pageBlock != null ? pageBlock.text : null, pageBlock);
        } else {
            TL_iv.PageBlock pageBlock2 = blockRow.block;
            spannable = RichTextStyle.toSpannable(pageBlock2 != null ? pageBlock2.text : null, pageBlock2);
        }
        if (!(blockRow.block instanceof TL_iv.pageBlockPreformatted)) {
            return spannable;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        spannableStringBuilder.setSpan(new CodeHighlighting.Span(true, 0, null, ((TL_iv.pageBlockPreformatted) blockRow.block).language, spannableStringBuilder.toString()), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private static boolean isHeading(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }
}
