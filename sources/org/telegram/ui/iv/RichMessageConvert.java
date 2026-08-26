package org.telegram.ui.iv;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.TextStyleSpan;

public abstract class RichMessageConvert {
    public static Object blockSpan(Spanned spanned, int i, int i2, Class cls) {
        for (Object obj : spanned.getSpans(i, Math.max(i, i2), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i && spanEnd >= i2) {
                return obj;
            }
        }
        return null;
    }

    public static ArrayList blocksFromCharSequence(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (charSequence == null) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = new TL_iv.textEmpty();
            arrayList.add(pageblockparagraph);
            return arrayList;
        }
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0);
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) == '\n') {
                arrayList2.add(Integer.valueOf(i + 1));
            }
        }
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList2.get(i2)).intValue();
        }
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < size) {
            int i4 = iArr[i3];
            i3++;
            int i5 = i3 < size ? iArr[i3] - 1 : length;
            CodeHighlighting.Span span = spanned == null ? null : (CodeHighlighting.Span) blockSpan(spanned, i4, i5, CodeHighlighting.Span.class);
            QuoteSpan quoteSpan = (spanned == null || span != null) ? null : (QuoteSpan) blockSpan(spanned, i4, i5, QuoteSpan.class);
            if (span == null && quoteSpan == null) {
                CharSequence charSequenceSubSequence = charSequence.subSequence(i4, i5);
                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                pageblockparagraph2.text = RichTextStyle.fromSpannable(charSequenceSubSequence);
                arrayList.add(pageblockparagraph2);
            } else {
                Object obj = span != null ? span : quoteSpan;
                while (true) {
                    if (i3 >= size) {
                        length = length;
                        break;
                    }
                    int i6 = iArr[i3];
                    int i7 = i3 + 1;
                    if (i7 < size) {
                        length = iArr[i7] - 1;
                    }
                    if ((span != null ? blockSpan(spanned, i6, length, CodeHighlighting.Span.class) : blockSpan(spanned, i6, length, QuoteSpan.class)) != obj) {
                        break;
                    }
                    i5 = length;
                    i3 = i7;
                    length = length;
                }
                CharSequence charSequenceSubSequence2 = charSequence.subSequence(i4, i5);
                if (span != null) {
                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                    pageblockpreformatted.text = RichTextStyle.fromSpannable(charSequenceSubSequence2);
                    String str = span.lng;
                    if (str == null) {
                        str = "";
                    }
                    pageblockpreformatted.language = str;
                    arrayList.add(pageblockpreformatted);
                } else {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    pageblockblockquote.text = RichTextStyle.fromSpannable(charSequenceSubSequence2);
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    pageblockblockquote.collapsed = quoteSpan != null && quoteSpan.isCollapsing;
                    arrayList.add(pageblockblockquote);
                }
                length = length;
            }
        }
        if (arrayList.isEmpty()) {
            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
            pageblockparagraph3.text = new TL_iv.textEmpty();
            arrayList.add(pageblockparagraph3);
        }
        return arrayList;
    }

    public static void collectBlocks(ArrayList arrayList, List list) {
        SpannableStringBuilder spannable;
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilderJoin;
        SpannableStringBuilder spannableStringBuilderJoin2;
        SpannableStringBuilder spannableStringBuilderJoin3;
        SpannableStringBuilder spannableStringBuilderJoin4;
        SpannableStringBuilder spannableStringBuilderJoin5;
        SpannableStringBuilder spannableStringBuilderJoin6;
        SpannableStringBuilder spannableStringBuilderQuoted;
        SpannableStringBuilder spannableStringBuilder2;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) it.next();
            Object objQuoted = null;
            objQuoted = null;
            objQuoted = null;
            objQuoted = null;
            objQuoted = null;
            objQuoted = null;
            objQuoted = null;
            objQuoted = null;
            objQuoted = null;
            objQuoted = null;
            objQuoted = null;
            objQuoted = null;
            objQuoted = null;
            if (pageBlock != null) {
                int i = 0;
                if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                    spannableStringBuilder2 = new SpannableStringBuilder(RichTextStyle.toSpannable(pageBlock.text, pageBlock));
                    spannableStringBuilder2.setSpan(new CodeHighlighting.Span(true, 0, null, ((TL_iv.pageBlockPreformatted) pageBlock).language, spannableStringBuilder2.toString()), 0, spannableStringBuilder2.length(), 33);
                } else {
                    boolean z = pageBlock instanceof TL_iv.pageBlockBlockquote;
                    if (z || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
                        objQuoted = quoted(RichTextStyle.toSpannable(pageBlock.text, pageBlock), z ? ((TL_iv.pageBlockBlockquote) pageBlock).caption : ((TL_iv.pageBlockPullquote) pageBlock).caption);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        ArrayList arrayList2 = new ArrayList();
                        collectBlocks(arrayList2, pageblockblockquoteblocks.blocks);
                        spannableStringBuilderQuoted = quoted(join(arrayList2), pageblockblockquoteblocks.caption);
                    } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                        ArrayList arrayList3 = new ArrayList();
                        SpannableStringBuilder spannable2 = RichTextStyle.toSpannable(pageblockdetails.title, null);
                        if (!TextUtils.isEmpty(spannable2)) {
                            arrayList3.add(spannable2);
                        }
                        collectBlocks(arrayList3, pageblockdetails.blocks);
                        if (!arrayList3.isEmpty()) {
                            spannableStringBuilderJoin6 = join(arrayList3);
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockList) {
                        ArrayList<TL_iv.PageListItem> arrayList4 = ((TL_iv.pageBlockList) pageBlock).items;
                        if (arrayList4 != null && !arrayList4.isEmpty()) {
                            ArrayList arrayList5 = new ArrayList();
                            int size = arrayList4.size();
                            while (i < size) {
                                TL_iv.PageListItem pageListItem = arrayList4.get(i);
                                i++;
                                TL_iv.PageListItem pageListItem2 = pageListItem;
                                if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                                    spannableStringBuilderJoin5 = RichTextStyle.toSpannable(((TL_iv.TL_pageListItemText) pageListItem2).text, null);
                                } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                                    ArrayList<TL_iv.PageBlock> arrayList6 = ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks;
                                    ArrayList arrayList7 = new ArrayList();
                                    collectBlocks(arrayList7, arrayList6);
                                    spannableStringBuilderJoin5 = join(arrayList7);
                                } else {
                                    spannableStringBuilderJoin5 = null;
                                }
                                if (spannableStringBuilderJoin5 != null) {
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(pageListItem2.checkbox ? pageListItem2.checked ? "☑  " : "☐  " : "•  ");
                                    spannableStringBuilder3.append((CharSequence) spannableStringBuilderJoin5);
                                    arrayList5.add(spannableStringBuilder3);
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                spannableStringBuilderJoin4 = join(arrayList5);
                            }
                        }
                    } else {
                        int i2 = 1;
                        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                            ArrayList<TL_iv.PageListOrderedItem> arrayList8 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
                            if (arrayList8 != null && !arrayList8.isEmpty()) {
                                ArrayList arrayList9 = new ArrayList();
                                int size2 = arrayList8.size();
                                while (i < size2) {
                                    TL_iv.PageListOrderedItem pageListOrderedItem = arrayList8.get(i);
                                    i++;
                                    TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                                    if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                                        spannableStringBuilderJoin3 = RichTextStyle.toSpannable(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, null);
                                    } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                                        ArrayList<TL_iv.PageBlock> arrayList10 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks;
                                        ArrayList arrayList11 = new ArrayList();
                                        collectBlocks(arrayList11, arrayList10);
                                        spannableStringBuilderJoin3 = join(arrayList11);
                                    } else {
                                        spannableStringBuilderJoin3 = null;
                                    }
                                    if (spannableStringBuilderJoin3 != null) {
                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(zzhr.m(!TextUtils.isEmpty(pageListOrderedItem2.num) ? pageListOrderedItem2.num : String.valueOf(i2), ".  "));
                                        spannableStringBuilder4.append((CharSequence) spannableStringBuilderJoin3);
                                        arrayList9.add(spannableStringBuilder4);
                                    }
                                    i2++;
                                }
                                if (!arrayList9.isEmpty()) {
                                    spannableStringBuilderJoin2 = join(arrayList9);
                                }
                            }
                        } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                            TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                            ArrayList arrayList12 = new ArrayList();
                            SpannableStringBuilder spannable3 = RichTextStyle.toSpannable(pageblocktable.title, null);
                            if (!TextUtils.isEmpty(spannable3)) {
                                arrayList12.add(spannable3);
                            }
                            ArrayList<TL_iv.pageTableRow> arrayList13 = pageblocktable.rows;
                            if (arrayList13 != null) {
                                int size3 = arrayList13.size();
                                int i3 = 0;
                                while (i3 < size3) {
                                    TL_iv.pageTableRow pagetablerow = arrayList13.get(i3);
                                    i3++;
                                    TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                                    ArrayList<TL_iv.pageTableCell> arrayList14 = pagetablerow2.cells;
                                    if (arrayList14 != null && !arrayList14.isEmpty()) {
                                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                        for (int i4 = 0; i4 < pagetablerow2.cells.size(); i4++) {
                                            if (i4 > 0) {
                                                spannableStringBuilder5.append((CharSequence) "  |  ");
                                            }
                                            spannableStringBuilder5.append((CharSequence) RichTextStyle.toSpannable(pagetablerow2.cells.get(i4).text, null));
                                        }
                                        arrayList12.add(spannableStringBuilder5);
                                    }
                                }
                            }
                            if (!arrayList12.isEmpty()) {
                                spannableStringBuilderJoin = join(arrayList12);
                            }
                        } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                            String str = ((TL_iv.pageBlockMath) pageBlock).source;
                            if (!TextUtils.isEmpty(str)) {
                                spannableStringBuilder = new SpannableStringBuilder(str);
                                if (!TextUtils.isEmpty(spannableStringBuilder)) {
                                    objQuoted = spannableStringBuilder;
                                    spannable = new SpannableStringBuilder(spannableStringBuilder);
                                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                                    textStyleRun.flags = 4;
                                    spannable.setSpan(new TextStyleSpan(textStyleRun, 0), 0, spannable.length(), 33);
                                    objQuoted = spannable;
                                }
                            }
                        } else if (pageBlock instanceof TL_iv.pageBlockDivider) {
                            objQuoted = "——————————";
                        } else if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6)) {
                            spannable = RichTextStyle.toSpannable(pageBlock.text, pageBlock);
                            if (!TextUtils.isEmpty(spannable)) {
                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(spannable);
                                TextStyleSpan.TextStyleRun textStyleRun2 = new TextStyleSpan.TextStyleRun();
                                textStyleRun2.flags = 1;
                                spannableStringBuilder6.setSpan(new TextStyleSpan(textStyleRun2, 0), 0, spannableStringBuilder6.length(), 33);
                                spannable = spannableStringBuilder6;
                            }
                            if (!TextUtils.isEmpty(spannable)) {
                                objQuoted = spannable;
                            }
                        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                            objQuoted = RichTextStyle.toSpannable(((TL_iv.pageBlockAuthorDate) pageBlock).author, null);
                        } else if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockKicker) || (pageBlock instanceof TL_iv.pageBlockThinking)) {
                            objQuoted = RichTextStyle.toSpannable(pageBlock.text, pageBlock);
                        } else if (pageBlock.caption != null) {
                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                            SpannableStringBuilder spannable4 = RichTextStyle.toSpannable(pageBlock.caption.text, null);
                            if (!TextUtils.isEmpty(spannable4)) {
                                spannableStringBuilder7.append((CharSequence) spannable4);
                            }
                            SpannableStringBuilder spannable5 = RichTextStyle.toSpannable(pageBlock.caption.credit, null);
                            if (!TextUtils.isEmpty(spannable5)) {
                                if (spannableStringBuilder7.length() > 0) {
                                    spannableStringBuilder7.append('\n');
                                }
                                spannableStringBuilder7.append((CharSequence) spannable5);
                            }
                            if (spannableStringBuilder7.length() > 0) {
                                objQuoted = spannableStringBuilder7;
                            }
                        }
                    }
                }
            }
            if (objQuoted != null) {
                objQuoted = spannableStringBuilderJoin;
                objQuoted = spannableStringBuilderJoin2;
                objQuoted = spannableStringBuilderJoin4;
                objQuoted = spannableStringBuilderJoin6;
                objQuoted = spannableStringBuilderQuoted;
                objQuoted = spannableStringBuilder2;
                arrayList.add(objQuoted);
            } else {
                objQuoted = spannableStringBuilderJoin;
                objQuoted = spannableStringBuilderJoin2;
                objQuoted = spannableStringBuilderJoin4;
                objQuoted = spannableStringBuilderJoin6;
                objQuoted = spannableStringBuilderQuoted;
                objQuoted = spannableStringBuilder2;
            }
        }
    }

    public static boolean inlineLossy(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return false;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if ((richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMath) || (richText instanceof TL_iv.textButton)) {
                return true;
            }
            return inlineLossy(richText.text);
        }
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_iv.RichText richText2 = arrayList.get(i);
            i++;
            if (inlineLossy(richText2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLossy(ArrayList arrayList, HashMap map) {
        boolean zInlineLossy;
        TL_iv.RichText richText;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                BlockRow blockRow = (BlockRow) obj;
                if (blockRow == null) {
                    zInlineLossy = false;
                } else if (!blockRow.detailsEnd && blockRow.level <= 0) {
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        zInlineLossy = true;
                    } else {
                        boolean z = pageBlock instanceof TL_iv.pageBlockBlockquote;
                        ArrayList arrayList2 = blockRow.quoteIds;
                        if (arrayList2.size() + (z ? 1 : 0) > 1) {
                            zInlineLossy = true;
                        } else if (z) {
                            if (pageBlock != null) {
                                richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption;
                            } else {
                                richText = pageBlock instanceof TL_iv.pageBlockPullquote ? ((TL_iv.pageBlockPullquote) pageBlock).caption : null;
                            }
                            if (richText != null && !(richText instanceof TL_iv.textEmpty) && !RichTextStyle.plainOf(richText).isEmpty()) {
                                zInlineLossy = true;
                            } else if (map == null) {
                                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                                }
                                zInlineLossy = inlineLossy(pageBlock.text);
                            } else {
                                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                                }
                                zInlineLossy = inlineLossy(pageBlock.text);
                            }
                        } else if (map == null && !arrayList2.isEmpty()) {
                            int size2 = arrayList2.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 < size2) {
                                    Object obj2 = arrayList2.get(i2);
                                    i2++;
                                    TL_iv.RichText richText2 = (TL_iv.RichText) map.get((Long) obj2);
                                    if (richText2 == null || (richText2 instanceof TL_iv.textEmpty) || RichTextStyle.plainOf(richText2).isEmpty()) {
                                    }
                                } else {
                                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                                    }
                                    zInlineLossy = inlineLossy(pageBlock.text);
                                }
                                zInlineLossy = true;
                            }
                        } else if (!(pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z) {
                            zInlineLossy = inlineLossy(pageBlock.text);
                        } else {
                            zInlineLossy = true;
                        }
                    }
                } else {
                    zInlineLossy = true;
                }
                if (zInlineLossy) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder join(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i));
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder quoted(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        SpannableStringBuilder spannable = RichTextStyle.toSpannable(richText, null);
        if (!TextUtils.isEmpty(spannable)) {
            if (spannableStringBuilder2.length() > 0) {
                spannableStringBuilder2.append('\n');
            }
            spannableStringBuilder2.append((CharSequence) "— ").append((CharSequence) spannable);
        }
        if (spannableStringBuilder2.length() == 0) {
            return null;
        }
        QuoteSpan.putQuote(spannableStringBuilder2, 0, spannableStringBuilder2.length(), false);
        return spannableStringBuilder2;
    }

    public static SpannableStringBuilder renderLeaf(BlockRow blockRow, boolean z) {
        SpannableStringBuilder spannable;
        if (z) {
            TL_iv.PageBlock pageBlock = blockRow.block;
            TL_iv.RichText richText = pageBlock != null ? pageBlock.text : null;
            spannable = new SpannableStringBuilder();
            RichTextStyle.append(spannable, richText, 0, pageBlock, false);
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

    public static SpannableStringBuilder rowsToCharSequence(ArrayList arrayList, boolean z) {
        SpannableStringBuilder spannable;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (arrayList != null && i < arrayList.size()) {
            BlockRow blockRow = (BlockRow) arrayList.get(i);
            if (blockRow.quoteIds.isEmpty()) {
                TL_iv.PageBlock pageBlock = blockRow.block;
                if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    if (z) {
                        TL_iv.RichText richText = pageBlock.text;
                        spannable = new SpannableStringBuilder();
                        RichTextStyle.append(spannable, richText, 0, pageBlock, false);
                    } else {
                        spannable = RichTextStyle.toSpannable(pageBlock.text, pageBlock);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
                    TL_iv.PageBlock pageBlock2 = blockRow.block;
                    boolean z2 = (pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed;
                    if (spannableStringBuilder.length() > 0) {
                        QuoteSpan.putQuote(spannableStringBuilder, 0, spannableStringBuilder.length(), z2);
                    }
                    arrayList2.add(spannableStringBuilder);
                } else {
                    arrayList2.add(renderLeaf(blockRow, z));
                }
                i++;
            } else {
                long jLongValue = ((Long) blockRow.quoteIds.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i2 = i;
                while (i2 < arrayList.size() && !((BlockRow) arrayList.get(i2)).quoteIds.isEmpty() && ((Long) ((BlockRow) arrayList.get(i2)).quoteIds.get(0)).longValue() == jLongValue) {
                    if (i2 > i) {
                        spannableStringBuilder2.append('\n');
                    }
                    spannableStringBuilder2.append((CharSequence) renderLeaf((BlockRow) arrayList.get(i2), z));
                    i2++;
                }
                if (spannableStringBuilder2.length() > 0) {
                    QuoteSpan.putQuote(spannableStringBuilder2, 0, spannableStringBuilder2.length(), false);
                }
                arrayList2.add(spannableStringBuilder2);
                i = i2;
            }
        }
        return join(arrayList2);
    }

    public static SpannableStringBuilder rowsToSimpleMessage(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rowsToCharSequence(arrayList, true));
        int length = spannableStringBuilder.length();
        RichTextStyle.setStyle(spannableStringBuilder, 0, length, 65536, false, null);
        RichTextStyle.setStyle(spannableStringBuilder, 0, length, 16384, false, null);
        RichTextStyle.setStyle(spannableStringBuilder, 0, length, 32768, false, null);
        for (MathSpan mathSpan : (MathSpan[]) spannableStringBuilder.getSpans(0, length, MathSpan.class)) {
            spannableStringBuilder.removeSpan(mathSpan);
        }
        return spannableStringBuilder;
    }
}
