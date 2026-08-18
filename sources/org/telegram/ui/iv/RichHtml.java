package org.telegram.ui.iv;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanReplacement;

public abstract class RichHtml {
    private static boolean isWs(char c) {
        return c == ' ' || c == '\n' || c == '\t' || c == '\r';
    }

    public static String serialize(List list, int i, int i2, int i3, int i4, Map map) {
        StringBuilder sb = new StringBuilder();
        ListState listState = new ListState();
        serializeRange(sb, list, new int[]{i}, i2, i, i2, i3, i4, listState, false, 0, map);
        listState.closeAll(sb);
        return sb.toString();
    }

    private static class ListState {
        final ArrayList stack;

        private ListState() {
            this.stack = new ArrayList();
        }

        void sync(StringBuilder sb, int i, boolean z) {
            while (this.stack.size() > i) {
                close(sb);
            }
            while (this.stack.size() < i) {
                open(sb, z);
            }
            if (this.stack.isEmpty()) {
                return;
            }
            if (((Boolean) this.stack.get(this.stack.size() - 1)).booleanValue() != z) {
                close(sb);
                open(sb, z);
            }
        }

        private void open(StringBuilder sb, boolean z) {
            sb.append(z ? "<ol>" : "<ul>");
            this.stack.add(Boolean.valueOf(z));
        }

        private void close(StringBuilder sb) {
            ArrayList arrayList = this.stack;
            sb.append(((Boolean) arrayList.remove(arrayList.size() + (-1))).booleanValue() ? "</ol>" : "</ul>");
        }

        void closeAll(StringBuilder sb) {
            while (!this.stack.isEmpty()) {
                close(sb);
            }
        }
    }

    private static void serializeRange(StringBuilder sb, List list, int[] iArr, int i, int i2, int i3, int i4, int i5, ListState listState, boolean z, int i6, Map map) {
        while (true) {
            int i7 = iArr[0];
            if (i7 > i) {
                return;
            }
            BlockRow blockRow = (BlockRow) list.get(i7);
            if (blockRow.detailsEnd) {
                if (z) {
                    return;
                } else {
                    iArr[0] = iArr[0] + 1;
                }
            } else if (blockRow.quoteIds.size() > i6) {
                listState.closeAll(sb);
                serializeQuote(sb, list, iArr, i, i2, i3, i4, i5, z, i6, map);
            } else if (RichEditorListView.isDetailsHeader(blockRow)) {
                listState.closeAll(sb);
                serializeDetails(sb, list, iArr, i, i2, i3, i4, i5, i6, map);
            } else if (blockRow.level > 0 && isTextBlock(blockRow.block)) {
                listState.sync(sb, blockRow.level, blockRow.num > 0);
                sb.append("<li>");
                appendInline(sb, slicedStyled(blockRow, iArr[0], i2, i3, i4, i5));
                sb.append("</li>");
                iArr[0] = iArr[0] + 1;
            } else {
                listState.closeAll(sb);
                serializeLeaf(sb, blockRow, iArr[0], i2, i3, i4, i5);
                iArr[0] = iArr[0] + 1;
            }
        }
    }

    private static void serializeDetails(StringBuilder sb, List list, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, Map map) {
        BlockRow blockRow = (BlockRow) list.get(iArr[0]);
        sb.append(((TL_iv.pageBlockDetails) blockRow.block).open ? "<details open>" : "<details>");
        sb.append("<summary>");
        appendInline(sb, slicedStyled(blockRow, iArr[0], i2, i3, i4, i5));
        sb.append("</summary>");
        iArr[0] = iArr[0] + 1;
        ListState listState = new ListState();
        serializeRange(sb, list, iArr, i, i2, i3, i4, i5, listState, true, i6, map);
        listState.closeAll(sb);
        int i7 = iArr[0];
        if (i7 <= i && i7 < list.size() && ((BlockRow) list.get(iArr[0])).detailsEnd) {
            iArr[0] = iArr[0] + 1;
        }
        sb.append("</details>");
    }

    private static void serializeQuote(StringBuilder sb, List list, int[] iArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6, Map map) {
        int i7;
        BlockRow blockRow;
        Long l = (Long) ((BlockRow) list.get(iArr[0])).quoteIds.get(i6);
        long jLongValue = l.longValue();
        int i8 = iArr[0];
        do {
            i7 = i8;
            i8 = i7 + 1;
            if (i8 > i) {
                break;
            }
            blockRow = (BlockRow) list.get(i8);
            if (blockRow.quoteIds.size() <= i6) {
                break;
            }
        } while (((Long) blockRow.quoteIds.get(i6)).longValue() == jLongValue);
        sb.append("<blockquote>");
        ListState listState = new ListState();
        serializeRange(sb, list, iArr, i7, i2, i3, i4, i5, listState, z, i6 + 1, map);
        listState.closeAll(sb);
        appendAuthorCite(sb, map == null ? null : authorText((TL_iv.RichText) map.get(l)));
        sb.append("</blockquote>");
    }

    private static CharSequence authorText(TL_iv.RichText richText) {
        CharSequence spannable;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (spannable = RichTextStyle.toSpannable(richText)) == null || spannable.length() <= 0) {
            return null;
        }
        return spannable;
    }

    private static void appendAuthorCite(StringBuilder sb, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        sb.append("<cite>");
        appendInline(sb, charSequence);
        sb.append("</cite>");
    }

    private static void serializeLeaf(StringBuilder sb, BlockRow blockRow, int i, int i2, int i3, int i4, int i5) {
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            sb.append("<hr>");
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            serializeButtonRow(sb, (TL_iv.pageBlockButtonRow) pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            serializeTable(sb, (TL_iv.pageBlockTable) pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            serializeSingleMedia(sb, "img", ((TL_iv.pageBlockPhoto) pageBlock).photo_id, blockRow.media, pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            serializeSingleMedia(sb, "video", ((TL_iv.pageBlockVideo) pageBlock).video_id, blockRow.media, pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            serializeSingleMedia(sb, "audio", ((TL_iv.pageBlockAudio) pageBlock).audio_id, blockRow.media, pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            serializeSingleMedia(sb, "document", ((TL_iv.pageBlockDocument) pageBlock).document_id, blockRow.media, pageBlock);
            return;
        }
        if (RichEditorListView.isGallery(pageBlock)) {
            serializeGallery(sb, pageBlock, blockRow);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            serializeMap(sb, (TL_iv.pageBlockMap) pageBlock);
            return;
        }
        String strBlockTag = blockTag(pageBlock);
        if (strBlockTag == null) {
            CharSequence charSequenceCaptionOf = captionOf(pageBlock);
            if (charSequenceCaptionOf == null || charSequenceCaptionOf.length() <= 0) {
                return;
            }
            sb.append("<p>");
            appendInline(sb, charSequenceCaptionOf);
            sb.append("</p>");
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
            if (!TextUtils.isEmpty(str)) {
                sb.append("<pre language=\"");
                sb.append(escapeAttr(str));
                sb.append("\">");
            } else {
                sb.append("<pre>");
            }
            appendInline(sb, slicedStyled(blockRow, i, i2, i3, i4, i5));
            sb.append("</pre>");
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            sb.append("<blockquote class=\"pull\">");
            appendInline(sb, slicedStyled(blockRow, i, i2, i3, i4, i5));
            appendAuthorCite(sb, authorText(((TL_iv.pageBlockPullquote) pageBlock).caption));
            sb.append("</blockquote>");
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.collapsed) {
                sb.append("<blockquote collapsed>");
            } else {
                sb.append("<blockquote>");
            }
            appendInline(sb, slicedStyled(blockRow, i, i2, i3, i4, i5));
            appendAuthorCite(sb, authorText(pageblockblockquote.caption));
            sb.append("</blockquote>");
            return;
        }
        sb.append('<');
        sb.append(strBlockTag);
        sb.append('>');
        appendInline(sb, slicedStyled(blockRow, i, i2, i3, i4, i5));
        sb.append("</");
        sb.append(strBlockTag);
        sb.append('>');
    }

    private static CharSequence slicedStyled(BlockRow blockRow, int i, int i2, int i3, int i4, int i5) {
        CharSequence styledText;
        if (RichEditorListView.isDetailsHeader(blockRow)) {
            styledText = RichTextStyle.toSpannable(((TL_iv.pageBlockDetails) blockRow.block).title);
        } else {
            styledText = RichTextCell.readStyledText(blockRow.block);
        }
        if (styledText == null) {
            styledText = "";
        }
        int length = styledText.length();
        int iMax = i == i2 ? Math.max(0, Math.min(i4, length)) : 0;
        int iMax2 = i == i3 ? Math.max(0, Math.min(i5, length)) : length;
        if (iMax > iMax2) {
            int i6 = iMax;
            iMax = iMax2;
            iMax2 = i6;
        }
        return (iMax == 0 && iMax2 == length) ? styledText : styledText.subSequence(iMax, iMax2);
    }

    private static boolean isTextBlock(TL_iv.PageBlock pageBlock) {
        return blockTag(pageBlock) != null;
    }

    private static String blockTag(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return "h1";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return "h2";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return "h3";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return "h4";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return "h5";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return "h6";
        }
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return "blockquote";
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return "pre";
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return "footer";
        }
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return "p";
        }
        return null;
    }

    private static CharSequence captionOf(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        CharSequence spannable;
        if (pageBlock == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null || (spannable = RichTextStyle.toSpannable(richText)) == null || spannable.length() <= 0) {
            return null;
        }
        return spannable;
    }

    private static void serializeTable(StringBuilder sb, TL_iv.pageBlockTable pageblocktable) {
        ArrayList<TL_iv.pageTableCell> arrayList;
        sb.append("<table");
        if (pageblocktable.bordered) {
            sb.append(" border=\"1\"");
        }
        if (pageblocktable.striped || pageblocktable.compact) {
            sb.append(" class=\"");
            if (pageblocktable.striped) {
                sb.append("striped");
            }
            if (pageblocktable.striped && pageblocktable.compact) {
                sb.append(' ');
            }
            if (pageblocktable.compact) {
                sb.append("compact");
            }
            sb.append('\"');
        }
        sb.append('>');
        TL_iv.RichText richText = pageblocktable.title;
        CharSequence spannable = richText != null ? RichTextStyle.toSpannable(richText) : null;
        if (spannable != null && spannable.length() > 0) {
            sb.append("<caption>");
            appendInline(sb, spannable);
            sb.append("</caption>");
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            for (TL_iv.pageTableRow pagetablerow : arrayList2) {
                sb.append("<tr>");
                if (pagetablerow != null && (arrayList = pagetablerow.cells) != null) {
                    for (TL_iv.pageTableCell pagetablecell : arrayList) {
                        if (pagetablecell != null) {
                            String str = pagetablecell.header ? "th" : "td";
                            sb.append('<');
                            sb.append(str);
                            int i = pagetablecell.colspan;
                            if (i <= 1) {
                                i = 0;
                            }
                            if (i > 0) {
                                sb.append(" colspan=\"");
                                sb.append(i);
                                sb.append('\"');
                            }
                            int i2 = pagetablecell.rowspan;
                            int i3 = i2 > 1 ? i2 : 0;
                            if (i3 > 0) {
                                sb.append(" rowspan=\"");
                                sb.append(i3);
                                sb.append('\"');
                            }
                            String str2 = pagetablecell.align_right ? "right" : pagetablecell.align_center ? "center" : null;
                            if (str2 != null) {
                                sb.append(" align=\"");
                                sb.append(str2);
                                sb.append('\"');
                            }
                            String str3 = pagetablecell.valign_bottom ? "bottom" : pagetablecell.valign_middle ? "middle" : null;
                            if (str3 != null) {
                                sb.append(" valign=\"");
                                sb.append(str3);
                                sb.append('\"');
                            }
                            sb.append('>');
                            appendInline(sb, TableModel.readStyledText(pagetablecell));
                            sb.append("</");
                            sb.append(str);
                            sb.append('>');
                        }
                    }
                }
                sb.append("</tr>");
            }
        }
        sb.append("</table>");
    }

    private static void serializeSingleMedia(StringBuilder sb, String str, long j, MediaUploadState mediaUploadState, TL_iv.PageBlock pageBlock) {
        if (j == 0) {
            return;
        }
        CharSequence charSequenceCaptionOf = captionOf(pageBlock);
        boolean z = charSequenceCaptionOf != null && charSequenceCaptionOf.length() > 0;
        if (z) {
            sb.append("<figure>");
        }
        appendMediaTag(sb, str, j, mediaUploadState, pageBlock);
        if (z) {
            sb.append("<figcaption>");
            appendInline(sb, charSequenceCaptionOf);
            sb.append("</figcaption></figure>");
        }
    }

    private static void appendMediaTag(StringBuilder sb, String str, long j, MediaUploadState mediaUploadState, TL_iv.PageBlock pageBlock) {
        sb.append('<');
        sb.append(str);
        sb.append(" src=\"");
        sb.append(j);
        sb.append('\"');
        if (mediaUploadState != null) {
            if (mediaUploadState.width > 0) {
                sb.append(" width=\"");
                sb.append(mediaUploadState.width);
                sb.append('\"');
            }
            if (mediaUploadState.height > 0) {
                sb.append(" height=\"");
                sb.append(mediaUploadState.height);
                sb.append('\"');
            }
        }
        if ((pageBlock instanceof TL_iv.pageBlockPhoto) && ((TL_iv.pageBlockPhoto) pageBlock).spoiler) {
            sb.append(" data-spoiler=\"1\"");
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && ((TL_iv.pageBlockVideo) pageBlock).spoiler) {
            sb.append(" data-spoiler=\"1\"");
        }
        sb.append(" />");
    }

    private static void serializeGallery(StringBuilder sb, TL_iv.PageBlock pageBlock, BlockRow blockRow) {
        String str = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
        sb.append("<div class=\"");
        sb.append(str);
        sb.append("\">");
        ArrayList arrayListGalleryItems = RichEditorListView.galleryItems(pageBlock);
        if (arrayListGalleryItems != null) {
            int i = 0;
            while (i < arrayListGalleryItems.size()) {
                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayListGalleryItems.get(i);
                ArrayList arrayList = blockRow.medias;
                MediaUploadState mediaUploadState = (arrayList == null || i >= arrayList.size()) ? null : (MediaUploadState) blockRow.medias.get(i);
                if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                    long j = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                    if (j != 0) {
                        appendMediaTag(sb, "video", j, mediaUploadState, pageBlock2);
                    }
                } else if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                    long j2 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                    if (j2 != 0) {
                        appendMediaTag(sb, "img", j2, mediaUploadState, pageBlock2);
                    }
                }
                i++;
            }
        }
        CharSequence charSequenceCaptionOf = captionOf(pageBlock);
        if (charSequenceCaptionOf != null && charSequenceCaptionOf.length() > 0) {
            sb.append("<figcaption>");
            appendInline(sb, charSequenceCaptionOf);
            sb.append("</figcaption>");
        }
        sb.append("</div>");
    }

    private static void serializeMap(StringBuilder sb, TL_iv.pageBlockMap pageblockmap) {
        CharSequence charSequenceCaptionOf = captionOf(pageblockmap);
        boolean z = charSequenceCaptionOf != null && charSequenceCaptionOf.length() > 0;
        if (z) {
            sb.append("<figure>");
        }
        sb.append("<location");
        if (pageblockmap.geo != null) {
            sb.append(" lat=\"");
            sb.append(pageblockmap.geo.lat);
            sb.append('\"');
            sb.append(" long=\"");
            sb.append(pageblockmap.geo._long);
            sb.append('\"');
            if (pageblockmap.geo.access_hash != 0) {
                sb.append(" access=\"");
                sb.append(pageblockmap.geo.access_hash);
                sb.append('\"');
            }
        }
        if (pageblockmap.zoom != 0) {
            sb.append(" zoom=\"");
            sb.append(pageblockmap.zoom);
            sb.append('\"');
        }
        if (pageblockmap.w != 0) {
            sb.append(" w=\"");
            sb.append(pageblockmap.w);
            sb.append('\"');
        }
        if (pageblockmap.h != 0) {
            sb.append(" h=\"");
            sb.append(pageblockmap.h);
            sb.append('\"');
        }
        sb.append(" />");
        if (z) {
            sb.append("<figcaption>");
            appendInline(sb, charSequenceCaptionOf);
            sb.append("</figcaption></figure>");
        }
    }

    public static String inlineToHtml(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        appendInline(sb, charSequence);
        return sb.toString();
    }

    public static String preToHtml(CharSequence charSequence, String str) {
        String strInlineToHtml = inlineToHtml(charSequence);
        if (strInlineToHtml.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append("<pre language=\"");
            sb.append(escapeAttr(str));
            sb.append("\">");
        } else {
            sb.append("<pre>");
        }
        sb.append(strInlineToHtml);
        sb.append("</pre>");
        return sb.toString();
    }

    public static String tableToHtml(TL_iv.pageBlockTable pageblocktable) {
        if (pageblocktable == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        serializeTable(sb, pageblocktable);
        return sb.toString();
    }

    private static void appendInline(StringBuilder sb, CharSequence charSequence) {
        int spanEnd;
        RichInlineButtonSpan richInlineButtonSpan;
        long documentId;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        if (!(charSequence instanceof Spanned)) {
            escape(sb, charSequence, 0, charSequence.length());
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        int length = charSequence.length();
        int iMin = 0;
        while (iMin < length) {
            RichInlineButtonSpan[] richInlineButtonSpanArr = (RichInlineButtonSpan[]) spanned.getSpans(iMin, Math.min(length, iMin + 1), RichInlineButtonSpan.class);
            int length2 = richInlineButtonSpanArr.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    spanEnd = -1;
                    richInlineButtonSpan = null;
                    break;
                }
                richInlineButtonSpan = richInlineButtonSpanArr[i];
                int spanStart = spanned.getSpanStart(richInlineButtonSpan);
                spanEnd = spanned.getSpanEnd(richInlineButtonSpan);
                if (spanStart <= iMin && spanEnd > iMin) {
                    break;
                } else {
                    i++;
                }
            }
            if (richInlineButtonSpan != null) {
                appendInlineButton(sb, richInlineButtonSpan.getButton());
                iMin = Math.min(length, spanEnd);
            } else {
                int iNextSpanTransition = spanned.nextSpanTransition(iMin, length, CharacterStyle.class);
                int i2 = 0;
                for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) spanned.getSpans(iMin, iNextSpanTransition, TextStyleSpan.class)) {
                    TextStyleSpan.TextStyleRun textStyleRun = textStyleSpan.getTextStyleRun();
                    if (textStyleRun != null) {
                        i2 |= textStyleRun.flags;
                    }
                }
                URLSpanReplacement[] uRLSpanReplacementArr = (URLSpanReplacement[]) spanned.getSpans(iMin, iNextSpanTransition, URLSpanReplacement.class);
                String url = uRLSpanReplacementArr.length > 0 ? uRLSpanReplacementArr[0].getURL() : null;
                AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(iMin, iNextSpanTransition, AnimatedEmojiSpan.class);
                if (animatedEmojiSpanArr.length > 0) {
                    AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[0];
                    if (animatedEmojiSpan.standard) {
                        documentId = 0;
                    } else {
                        documentId = animatedEmojiSpan.getDocumentId();
                    }
                } else {
                    documentId = 0;
                }
                openInline(sb, i2, url, documentId);
                escape(sb, charSequence, iMin, iNextSpanTransition);
                closeInline(sb, i2, url, documentId);
                iMin = iNextSpanTransition;
            }
        }
    }

    private static void appendInlineButton(StringBuilder sb, TL_iv.textButton textbutton) {
        if (textbutton == null || !RichInlineButtonSpan.isSupported(textbutton.type)) {
            return;
        }
        appendButton(sb, textbutton.text, textbutton.type, textbutton.style);
    }

    private static void appendButton(StringBuilder sb, TL_iv.RichText richText, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle) {
        String str;
        if (RichInlineButtonSpan.isSupported(inlineButtonType)) {
            sb.append("<button");
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                sb.append(" data-type=\"url\" data-url=\"");
                sb.append(escapeAttr(((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url));
                sb.append("\"");
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                sb.append(" data-type=\"copy\" data-copy-text=\"");
                sb.append(escapeAttr(((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text));
                sb.append("\"");
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                sb.append(" data-type=\"user-profile\" data-user-id=\"");
                sb.append(((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id);
                sb.append("\"");
            }
            if (richButtonStyle != null) {
                if (richButtonStyle.bg_primary) {
                    str = "primary";
                } else if (richButtonStyle.bg_danger) {
                    str = "danger";
                } else {
                    str = richButtonStyle.bg_success ? "success" : "default";
                }
                sb.append(" data-style=\"");
                sb.append(str);
                sb.append("\"");
            }
            sb.append(">");
            appendInline(sb, RichTextStyle.toSpannable(richText));
            sb.append("</button>");
        }
    }

    private static void serializeButtonRow(StringBuilder sb, TL_iv.pageBlockButtonRow pageblockbuttonrow) {
        sb.append("<div class=\"button-row\"");
        if (pageblockbuttonrow.align_left) {
            sb.append(" data-align=\"left\"");
        } else if (pageblockbuttonrow.align_center) {
            sb.append(" data-align=\"center\"");
        } else if (pageblockbuttonrow.align_right) {
            sb.append(" data-align=\"right\"");
        } else {
            sb.append(" data-align=\"fill\"");
        }
        sb.append(">");
        ArrayList<TL_keyboard.PageButton> arrayList = pageblockbuttonrow.buttons;
        if (arrayList != null) {
            for (TL_keyboard.PageButton pageButton : arrayList) {
                if (pageButton != null) {
                    appendButton(sb, pageButton.text, pageButton.type, pageButton.style);
                }
            }
        }
        sb.append("</div>");
    }

    private static void openInline(StringBuilder sb, int i, String str, long j) {
        if ((i & 256) != 0) {
            sb.append("<spoiler>");
        }
        if ((i & 1) != 0) {
            sb.append("<b>");
        }
        if ((i & 2) != 0) {
            sb.append("<i>");
        }
        if ((i & 16) != 0) {
            sb.append("<u>");
        }
        if ((i & 8) != 0) {
            sb.append("<s>");
        }
        if ((i & 4) != 0) {
            sb.append("<code>");
        }
        if ((i & 16384) != 0) {
            sb.append("<sub>");
        }
        if ((32768 & i) != 0) {
            sb.append("<sup>");
        }
        if ((i & 65536) != 0) {
            sb.append("<mark>");
        }
        if (str != null) {
            sb.append("<a href=\"");
            sb.append(escapeAttr(str));
            sb.append("\">");
        }
        if (j != 0) {
            sb.append("<animated-emoji data-document-id=\"");
            sb.append(j);
            sb.append("\">");
        }
    }

    private static void closeInline(StringBuilder sb, int i, String str, long j) {
        if (j != 0) {
            sb.append("</animated-emoji>");
        }
        if (str != null) {
            sb.append("</a>");
        }
        if ((65536 & i) != 0) {
            sb.append("</mark>");
        }
        if ((32768 & i) != 0) {
            sb.append("</sup>");
        }
        if ((i & 16384) != 0) {
            sb.append("</sub>");
        }
        if ((i & 4) != 0) {
            sb.append("</code>");
        }
        if ((i & 8) != 0) {
            sb.append("</s>");
        }
        if ((i & 16) != 0) {
            sb.append("</u>");
        }
        if ((i & 2) != 0) {
            sb.append("</i>");
        }
        if ((i & 1) != 0) {
            sb.append("</b>");
        }
        if ((i & 256) != 0) {
            sb.append("</spoiler>");
        }
    }

    private static void escape(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\n') {
                sb.append("<br>");
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
    }

    private static String escapeAttr(String str) {
        if (str == null) {
            return "";
        }
        return str.replace("&", "&amp;").replace("\"", "&quot;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public static List parse(String str, Map map) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        parseBlocks(new Parser(str).parse(), arrayList, 0, map);
        if (arrayList.isEmpty()) {
            arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph()));
        }
        return arrayList;
    }

    private static void parseBlocks(List list, ArrayList arrayList, int i, Map map) {
        Iterator it = list.iterator();
        SpannableStringBuilder spannableStringBuilder = null;
        while (it.hasNext()) {
            Node node = (Node) it.next();
            if (node.isText) {
                if (!isBlank(node.text)) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    spannableStringBuilder.append((CharSequence) decode(node.text));
                }
            } else {
                String str = node.tag;
                if (isInlineTag(str)) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    appendInlineNode(spannableStringBuilder, node, 0, null, 0L);
                } else {
                    spannableStringBuilder = flushParagraph(arrayList, spannableStringBuilder, i);
                    str.hashCode();
                    switch (str) {
                        case "summary":
                            addText(arrayList, new TL_iv.pageBlockParagraph(), node, i);
                            break;
                        case "figure":
                            parseFigure(node, arrayList, i);
                            break;
                        case "footer":
                            addText(arrayList, new TL_iv.pageBlockFooter(), node, i);
                            break;
                        case "p":
                            addText(arrayList, new TL_iv.pageBlockParagraph(), node, i);
                            break;
                        case "h1":
                            addText(arrayList, new TL_iv.pageBlockHeading1(), node, i);
                            break;
                        case "h2":
                            addText(arrayList, new TL_iv.pageBlockHeading2(), node, i);
                            break;
                        case "h3":
                            addText(arrayList, new TL_iv.pageBlockHeading3(), node, i);
                            break;
                        case "h4":
                            addText(arrayList, new TL_iv.pageBlockHeading4(), node, i);
                            break;
                        case "h5":
                            addText(arrayList, new TL_iv.pageBlockHeading5(), node, i);
                            break;
                        case "h6":
                            addText(arrayList, new TL_iv.pageBlockHeading6(), node, i);
                            break;
                        case "hr":
                            arrayList.add(new BlockRow(new TL_iv.pageBlockDivider()));
                            break;
                        case "ol":
                        case "ul":
                            parseList(node, arrayList, i, "ol".equals(str));
                            break;
                        case "td":
                        case "th":
                        case "tr":
                        case "tbody":
                        case "thead":
                            parseBlocks(node.children, arrayList, i, map);
                            break;
                        case "div":
                            String strAttr = node.attr("class");
                            String lowerCase = strAttr == null ? "" : strAttr.toLowerCase();
                            if (lowerCase.contains("button-row")) {
                                arrayList.add(parseButtonRow(node));
                                break;
                            } else {
                                if (lowerCase.contains("collage")) {
                                    addRow(arrayList, parseGallery(node, false));
                                } else if (lowerCase.contains("slideshow")) {
                                    addRow(arrayList, parseGallery(node, true));
                                } else {
                                    addText(arrayList, new TL_iv.pageBlockParagraph(), node, i);
                                }
                                break;
                            }
                            break;
                        case "img":
                            addRow(arrayList, buildMediaRow(node));
                            break;
                        case "pre":
                            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                            pageblockpreformatted.language = firstAttr(node, "language", "lang", "lng");
                            addText(arrayList, pageblockpreformatted, node, i);
                            break;
                        case "audio":
                            addRow(arrayList, buildMediaRow(node));
                            break;
                        case "table":
                            arrayList.add(parseTable(node));
                            break;
                        case "video":
                            addRow(arrayList, buildMediaRow(node));
                            break;
                        case "blockquote":
                            if (hasPullClass(node)) {
                                parsePullquote(node, arrayList, i);
                                break;
                            } else {
                                parseBlockquote(node, arrayList, i, map);
                                break;
                            }
                            break;
                        case "details":
                            parseDetails(node, arrayList, i, map);
                            break;
                        case "location":
                            addRow(arrayList, buildMediaRow(node));
                            break;
                        default:
                            if (node.children.isEmpty()) {
                                break;
                            } else {
                                parseBlocks(node.children, arrayList, i, map);
                                break;
                            }
                            break;
                    }
                }
            }
        }
        flushParagraph(arrayList, spannableStringBuilder, i);
    }

    private static SpannableStringBuilder flushParagraph(ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, int i) {
        if (spannableStringBuilder == null || isBlank(spannableStringBuilder.toString())) {
            return null;
        }
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = RichTextStyle.fromSpannable(trim(spannableStringBuilder));
        arrayList.add(new BlockRow(pageblockparagraph, i, 0));
        return null;
    }

    private static void addText(ArrayList arrayList, TL_iv.PageBlock pageBlock, Node node, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        appendChildrenInline(spannableStringBuilder, node, 0, null, 0L);
        RichTextCell.applyStyledTextToBlock(pageBlock, trim(spannableStringBuilder));
        arrayList.add(new BlockRow(pageBlock, i, 0));
    }

    private static void addRow(ArrayList arrayList, BlockRow blockRow) {
        if (blockRow != null) {
            arrayList.add(blockRow);
        }
    }

    private static CharSequence inlineOf(Node node) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        appendChildrenInline(spannableStringBuilder, node, 0, null, 0L);
        return trim(spannableStringBuilder);
    }

    private static BlockRow parseTable(Node node) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        pageblocktable.bordered = node.has("border");
        String strAttr = node.attr("class");
        boolean z = false;
        pageblocktable.striped = strAttr != null && strAttr.toLowerCase().contains("striped");
        if (strAttr != null && strAttr.toLowerCase().contains("compact")) {
            z = true;
        }
        pageblocktable.compact = z;
        collectTableRows(node, pageblocktable);
        if (pageblocktable.rows.isEmpty()) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
            pagetablerow.cells = arrayList;
            arrayList.add(TableModel.newEmptyCell());
            pageblocktable.rows.add(pagetablerow);
        }
        return new BlockRow(pageblocktable);
    }

    private static BlockRow parseButtonRow(Node node) {
        TL_keyboard.InlineButtonType inlineButtonTypeInlineButtonTypeOf;
        TL_iv.pageBlockButtonRow pageblockbuttonrow = new TL_iv.pageBlockButtonRow();
        String strAttr = node.attr("data-align");
        pageblockbuttonrow.align_left = "left".equalsIgnoreCase(strAttr);
        pageblockbuttonrow.align_center = "center".equalsIgnoreCase(strAttr);
        pageblockbuttonrow.align_right = "right".equalsIgnoreCase(strAttr);
        for (Node node2 : node.children) {
            if (pageblockbuttonrow.buttons.size() >= 8) {
                break;
            }
            if (!node2.isText && "button".equals(node2.tag) && (inlineButtonTypeInlineButtonTypeOf = inlineButtonTypeOf(node2)) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                appendChildrenInline(spannableStringBuilder, node2, 0, null, 0L);
                CharSequence charSequenceTrim = trim(spannableStringBuilder);
                if (charSequenceTrim.length() != 0) {
                    TL_keyboard.PageButton pageButton = new TL_keyboard.PageButton();
                    pageButton.text = RichTextStyle.fromSpannable(charSequenceTrim);
                    pageButton.type = inlineButtonTypeInlineButtonTypeOf;
                    pageButton.style = inlineButtonStyleOf(node2);
                    pageblockbuttonrow.buttons.add(pageButton);
                }
            }
        }
        return new BlockRow(pageblockbuttonrow);
    }

    private static void collectTableRows(Node node, TL_iv.pageBlockTable pageblocktable) {
        for (Node node2 : node.children) {
            if (!node2.isText) {
                String str = node2.tag;
                str.hashCode();
                switch (str) {
                    case "tr":
                        pageblocktable.rows.add(parseTableRow(node2));
                        break;
                    case "tbody":
                    case "tfoot":
                    case "thead":
                        collectTableRows(node2, pageblocktable);
                        break;
                    case "caption":
                        pageblocktable.title = RichTextStyle.fromSpannable(inlineOf(node2));
                        break;
                }
            }
        }
    }

    private static TL_iv.pageTableRow parseTableRow(Node node) {
        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
        pagetablerow.cells = new ArrayList<>();
        for (Node node2 : node.children) {
            if (!node2.isText && ("td".equals(node2.tag) || "th".equals(node2.tag))) {
                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                pagetablecell.colspan = parseIntAttr(node2.attr("colspan"), 0);
                pagetablecell.rowspan = parseIntAttr(node2.attr("rowspan"), 0);
                TableModel.applyStyledText(pagetablecell, inlineOf(node2));
                TableModel.setHeader(pagetablecell, "th".equals(node2.tag) || node2.has("header"));
                String strAttr = node2.attr("align");
                if (strAttr == null) {
                    strAttr = alignFromStyle(node2.attr("style"));
                }
                if ("center".equalsIgnoreCase(strAttr)) {
                    TableModel.setAlign(pagetablecell, 1);
                } else if ("right".equalsIgnoreCase(strAttr)) {
                    TableModel.setAlign(pagetablecell, 2);
                }
                String strAttr2 = node2.attr("valign");
                if ("middle".equalsIgnoreCase(strAttr2)) {
                    TableModel.setVAlign(pagetablecell, 1);
                } else if ("bottom".equalsIgnoreCase(strAttr2)) {
                    TableModel.setVAlign(pagetablecell, 2);
                }
                pagetablerow.cells.add(pagetablecell);
            }
        }
        if (pagetablerow.cells.isEmpty()) {
            pagetablerow.cells.add(TableModel.newEmptyCell());
        }
        return pagetablerow;
    }

    private static String alignFromStyle(String str) {
        String lowerCase;
        int iIndexOf;
        if (str == null || (iIndexOf = (lowerCase = str.toLowerCase()).indexOf("text-align")) < 0) {
            return null;
        }
        if (lowerCase.indexOf("center", iIndexOf) >= 0) {
            return "center";
        }
        if (lowerCase.indexOf("right", iIndexOf) >= 0) {
            return "right";
        }
        return null;
    }

    private static BlockRow buildMediaRow(Node node) {
        String str = node.tag;
        str.hashCode();
        switch (str) {
            case "div":
                String strAttr = node.attr("class");
                String lowerCase = strAttr == null ? "" : strAttr.toLowerCase();
                if (lowerCase.contains("slideshow")) {
                    return parseGallery(node, true);
                }
                if (lowerCase.contains("collage")) {
                    return parseGallery(node, false);
                }
                return null;
            case "img":
                return buildPhotoOrVideo(node, false);
            case "audio":
                return buildAudio(node);
            case "video":
                return buildPhotoOrVideo(node, true);
            case "document":
                return buildDocument(node);
            case "location":
                return buildMap(node);
            default:
                return null;
        }
    }

    private static BlockRow buildPhotoOrVideo(Node node, boolean z) {
        long longAttr = parseLongAttr(node.attr("src"), 0L);
        if (longAttr <= 0) {
            return null;
        }
        TL_iv.PageBlock pageBlockNewMediaItemBlock = newMediaItemBlock(z, longAttr, node.has("data-spoiler"));
        setEmptyCaption(pageBlockNewMediaItemBlock);
        return new BlockRow(pageBlockNewMediaItemBlock);
    }

    private static BlockRow buildAudio(Node node) {
        long longAttr = parseLongAttr(node.attr("src"), 0L);
        if (longAttr <= 0) {
            return null;
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        pageblockaudio.audio_id = longAttr;
        setEmptyCaption(pageblockaudio);
        return new BlockRow(pageblockaudio);
    }

    private static BlockRow buildDocument(Node node) {
        long longAttr = parseLongAttr(node.attr("src"), 0L);
        if (longAttr <= 0) {
            return null;
        }
        TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
        pageblockdocument.document_id = longAttr;
        setEmptyCaption(pageblockdocument);
        return new BlockRow(pageblockdocument);
    }

    private static BlockRow buildMap(Node node) {
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_geoPoint.lat = parseDoubleAttr(node.attr("lat"), 0.0d);
        tL_geoPoint._long = parseDoubleAttr(node.attr("long"), 0.0d);
        tL_geoPoint.access_hash = parseLongAttr(node.attr("access"), 0L);
        pageblockmap.geo = tL_geoPoint;
        pageblockmap.zoom = parseIntAttr(node.attr("zoom"), 15);
        pageblockmap.w = parseIntAttr(node.attr("w"), 600);
        pageblockmap.h = parseIntAttr(node.attr("h"), 400);
        setEmptyCaption(pageblockmap);
        return new BlockRow(pageblockmap);
    }

    private static TL_iv.PageBlock newMediaItemBlock(boolean z, long j, boolean z2) {
        if (z) {
            TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
            if (j <= 0) {
                j = 0;
            }
            pageblockvideo.video_id = j;
            pageblockvideo.spoiler = z2;
            return pageblockvideo;
        }
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        if (j <= 0) {
            j = 0;
        }
        pageblockphoto.photo_id = j;
        pageblockphoto.spoiler = z2;
        return pageblockphoto;
    }

    private static BlockRow parseGallery(Node node, boolean z) {
        TL_iv.PageBlock pageblockslideshow = z ? new TL_iv.pageBlockSlideshow() : new TL_iv.pageBlockCollage();
        ArrayList arrayListGalleryItems = RichEditorListView.galleryItems(pageblockslideshow);
        CharSequence charSequenceInlineOf = null;
        for (Node node2 : node.children) {
            if (!node2.isText) {
                if ("figcaption".equals(node2.tag)) {
                    charSequenceInlineOf = inlineOf(node2);
                } else {
                    boolean zEquals = "video".equals(node2.tag);
                    if (zEquals || "img".equals(node2.tag)) {
                        long longAttr = parseLongAttr(node2.attr("src"), 0L);
                        if (longAttr > 0) {
                            TL_iv.PageBlock pageBlockNewMediaItemBlock = newMediaItemBlock(zEquals, longAttr, node2.has("data-spoiler"));
                            setEmptyCaption(pageBlockNewMediaItemBlock);
                            arrayListGalleryItems.add(pageBlockNewMediaItemBlock);
                        }
                    }
                }
            }
        }
        if (arrayListGalleryItems.isEmpty()) {
            return null;
        }
        if (arrayListGalleryItems.size() == 1) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayListGalleryItems.get(0);
            if (charSequenceInlineOf != null && charSequenceInlineOf.length() > 0) {
                setCaption(pageBlock, charSequenceInlineOf);
            }
            return new BlockRow(pageBlock);
        }
        setEmptyCaption(pageblockslideshow);
        if (charSequenceInlineOf != null && charSequenceInlineOf.length() > 0) {
            setCaption(pageblockslideshow, charSequenceInlineOf);
        }
        return new BlockRow(pageblockslideshow);
    }

    private static void parseFigure(Node node, ArrayList arrayList, int i) {
        BlockRow blockRowBuildMediaRow = null;
        CharSequence charSequenceInlineOf = null;
        for (Node node2 : node.children) {
            if (!node2.isText) {
                if ("figcaption".equals(node2.tag)) {
                    charSequenceInlineOf = inlineOf(node2);
                } else if (blockRowBuildMediaRow == null) {
                    blockRowBuildMediaRow = buildMediaRow(node2);
                }
            }
        }
        if (blockRowBuildMediaRow != null) {
            if (charSequenceInlineOf != null && charSequenceInlineOf.length() > 0) {
                setCaption(blockRowBuildMediaRow.block, charSequenceInlineOf);
            }
            arrayList.add(blockRowBuildMediaRow);
            return;
        }
        if (charSequenceInlineOf == null || charSequenceInlineOf.length() <= 0) {
            return;
        }
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = RichTextStyle.fromSpannable(charSequenceInlineOf);
        arrayList.add(new BlockRow(pageblockparagraph, i, 0));
    }

    private static void setCaption(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = RichTextStyle.fromSpannable(charSequence);
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    private static void setEmptyCaption(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    private static String firstAttr(Node node, String... strArr) {
        for (String str : strArr) {
            String strAttr = node.attr(str);
            if (strAttr != null) {
                return strAttr;
            }
        }
        return null;
    }

    private static long parseLongAttr(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str.trim());
        } catch (Exception unused) {
            return j;
        }
    }

    private static int parseIntAttr(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str.trim());
        } catch (Exception unused) {
            return i;
        }
    }

    private static double parseDoubleAttr(String str, double d) {
        if (str == null) {
            return d;
        }
        try {
            return Double.parseDouble(str.trim());
        } catch (Exception unused) {
            return d;
        }
    }

    private static void parseList(Node node, ArrayList arrayList, int i, boolean z) {
        int i2 = i + 1;
        int i3 = 1;
        for (Node node2 : node.children) {
            if (!node2.isText && "li".equals(node2.tag)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList<Node> arrayList2 = new ArrayList();
                for (Node node3 : node2.children) {
                    if (!node3.isText && ("ul".equals(node3.tag) || "ol".equals(node3.tag))) {
                        arrayList2.add(node3);
                    } else if (node3.isText) {
                        spannableStringBuilder.append((CharSequence) decode(node3.text));
                    } else {
                        appendInlineNode(spannableStringBuilder, node3, 0, null, 0L);
                    }
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = RichTextStyle.fromSpannable(trim(spannableStringBuilder));
                BlockRow blockRow = new BlockRow(pageblockparagraph, i2, z ? i3 : 0);
                blockRow.checkbox = node2.has("data-checkbox") || hasCheckboxClass(node2);
                blockRow.checked = node2.has("data-checked");
                arrayList.add(blockRow);
                for (Node node4 : arrayList2) {
                    parseList(node4, arrayList, i2, "ol".equals(node4.tag));
                }
                i3++;
            }
        }
    }

    private static void parseDetails(Node node, ArrayList arrayList, int i, Map map) {
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.open = node.has("open");
        pageblockdetails.blocks = new ArrayList<>();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList2 = new ArrayList();
        for (Node node2 : node.children) {
            if (!node2.isText && "summary".equals(node2.tag)) {
                appendChildrenInline(spannableStringBuilder, node2, 0, null, 0L);
            } else {
                arrayList2.add(node2);
            }
        }
        pageblockdetails.title = RichTextStyle.fromSpannable(trim(spannableStringBuilder));
        arrayList.add(new BlockRow(pageblockdetails));
        int size = arrayList.size();
        parseBlocks(arrayList2, arrayList, i, map);
        if (arrayList.size() == size) {
            arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph()));
        }
        BlockRow blockRow = new BlockRow(new TL_iv.pageBlockParagraph());
        blockRow.detailsEnd = true;
        arrayList.add(blockRow);
    }

    private static void parseBlockquote(Node node, ArrayList arrayList, int i, Map map) {
        boolean z;
        String str;
        Iterator it = node.children.iterator();
        Node node2 = null;
        boolean z2 = false;
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Node node3 = (Node) it.next();
            if (!node3.isText && (str = node3.tag) != null) {
                if ("cite".equals(str)) {
                    if (node2 == null) {
                        node2 = node3;
                    }
                } else if (!isInlineTag(node3.tag)) {
                    z2 = true;
                }
            }
        }
        TL_iv.RichText richTextCiteAuthor = citeAuthor(node2);
        if (!z2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            appendChildrenInlineExcept(spannableStringBuilder, node, "cite");
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            if (!node.has("data-collapsed") && !node.has("collapsed")) {
                z = false;
            }
            pageblockblockquote.collapsed = z;
            RichTextCell.applyStyledTextToBlock(pageblockblockquote, trim(spannableStringBuilder));
            if (richTextCiteAuthor != null) {
                pageblockblockquote.caption = richTextCiteAuthor;
            }
            arrayList.add(new BlockRow(pageblockblockquote, i, 0));
            return;
        }
        long jNewId = RichContainer.newId();
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        for (Node node4 : node.children) {
            if (node4.isText || !"cite".equals(node4.tag)) {
                arrayList2.add(node4);
            }
        }
        parseBlocks(arrayList2, arrayList, i, map);
        if (arrayList.size() == size) {
            arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph(), i, 0));
        }
        while (size < arrayList.size()) {
            ((BlockRow) arrayList.get(size)).quoteIds.add(0, Long.valueOf(jNewId));
            size++;
        }
        if (richTextCiteAuthor == null || map == null) {
            return;
        }
        map.put(Long.valueOf(jNewId), richTextCiteAuthor);
    }

    private static void parsePullquote(Node node, ArrayList arrayList, int i) {
        Node node2;
        Iterator it = node.children.iterator();
        while (true) {
            if (!it.hasNext()) {
                node2 = null;
                break;
            }
            node2 = (Node) it.next();
            if (!node2.isText && "cite".equals(node2.tag)) {
                break;
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        appendChildrenInlineExcept(spannableStringBuilder, node, "cite");
        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
        RichTextCell.applyStyledTextToBlock(pageblockpullquote, trim(spannableStringBuilder));
        TL_iv.RichText richTextCiteAuthor = citeAuthor(node2);
        if (richTextCiteAuthor != null) {
            pageblockpullquote.caption = richTextCiteAuthor;
        }
        arrayList.add(new BlockRow(pageblockpullquote, i, 0));
    }

    private static TL_iv.RichText citeAuthor(Node node) {
        CharSequence charSequenceInlineOf;
        if (node == null || (charSequenceInlineOf = inlineOf(node)) == null || charSequenceInlineOf.length() == 0) {
            return null;
        }
        return RichTextStyle.fromSpannable(charSequenceInlineOf);
    }

    private static void appendChildrenInlineExcept(SpannableStringBuilder spannableStringBuilder, Node node, String str) {
        for (Node node2 : node.children) {
            if (node2.isText) {
                appendStyled(spannableStringBuilder, decode(node2.text), 0, null, 0L);
            } else if (!str.equals(node2.tag)) {
                appendInlineNode(spannableStringBuilder, node2, 0, null, 0L);
            }
        }
    }

    private static boolean isInlineTag(String str) {
        str.hashCode();
        switch (str) {
            case "spoiler":
            case "button":
            case "strike":
            case "strong":
            case "a":
            case "b":
            case "i":
            case "s":
            case "u":
            case "br":
            case "em":
            case "tt":
            case "del":
            case "sub":
            case "sup":
            case "code":
            case "font":
            case "span":
            case "animated-emoji":
                return true;
            default:
                return false;
        }
    }

    private static void appendChildrenInline(SpannableStringBuilder spannableStringBuilder, Node node, int i, String str, long j) {
        for (Node node2 : node.children) {
            if (node2.isText) {
                appendStyled(spannableStringBuilder, decode(node2.text), i, str, j);
            } else {
                appendInlineNode(spannableStringBuilder, node2, i, str, j);
            }
        }
    }

    private static void appendInlineNode(SpannableStringBuilder spannableStringBuilder, Node node, int i, String str, long j) {
        long j2;
        int i2;
        int i3;
        String str2;
        int i4;
        TL_keyboard.InlineButtonType inlineButtonTypeInlineButtonTypeOf;
        if ("button".equals(node.tag) && (inlineButtonTypeInlineButtonTypeOf = inlineButtonTypeOf(node)) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            appendChildrenInline(spannableStringBuilder2, node, i, str, j);
            if (spannableStringBuilder2.length() > 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                TL_iv.textButton textbutton = new TL_iv.textButton();
                textbutton.text = RichTextStyle.fromSpannable(spannableStringBuilder2);
                textbutton.type = inlineButtonTypeInlineButtonTypeOf;
                textbutton.style = inlineButtonStyleOf(node);
                spannableStringBuilder.setSpan(new RichInlineButtonSpan(textbutton), length, spannableStringBuilder.length(), 33);
            }
            return;
        }
        String str3 = node.tag;
        str3.hashCode();
        switch (str3) {
            case "spoiler":
                i2 = i | 256;
                str2 = str;
                j2 = j;
                i3 = i2;
                if (node.children.isEmpty() || node.isText) {
                    appendChildrenInline(spannableStringBuilder, node, i3, str2, j2);
                    break;
                }
                break;
            case "strike":
            case "s":
            case "del":
                i2 = i | 8;
                str2 = str;
                j2 = j;
                i3 = i2;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i3, str2, j2);
                break;
            case "strong":
            case "b":
                i2 = i | 1;
                str2 = str;
                j2 = j;
                i3 = i2;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i3, str2, j2);
                break;
            case "a":
                String strAttr = node.attr("href");
                if (strAttr != null) {
                    j2 = j;
                    i3 = i;
                    str2 = strAttr;
                } else {
                    j2 = j;
                    i3 = i;
                    str2 = str;
                }
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i3, str2, j2);
                break;
            case "i":
            case "em":
                i2 = i | 2;
                str2 = str;
                j2 = j;
                i3 = i2;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i3, str2, j2);
                break;
            case "u":
                i2 = 16 | i;
                str2 = str;
                j2 = j;
                i3 = i2;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i3, str2, j2);
                break;
            case "br":
                appendStyled(spannableStringBuilder, "\n", i, str, j);
                break;
            case "tt":
            case "code":
                i2 = i | 4;
                str2 = str;
                j2 = j;
                i3 = i2;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i3, str2, j2);
                break;
            case "sub":
                i2 = i | 16384;
                str2 = str;
                j2 = j;
                i3 = i2;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i3, str2, j2);
                break;
            case "sup":
                i4 = 32768;
                i2 = i4 | i;
                str2 = str;
                j2 = j;
                i3 = i2;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i3, str2, j2);
                break;
            case "mark":
                i4 = 65536;
                i2 = i4 | i;
                str2 = str;
                j2 = j;
                i3 = i2;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i3, str2, j2);
                break;
            case "animated-emoji":
                String strAttr2 = node.attr("data-document-id");
                if (strAttr2 != null) {
                    try {
                        j2 = Long.parseLong(strAttr2.trim());
                    } catch (Exception unused) {
                        j2 = j;
                    }
                } else {
                    j2 = j;
                }
                i3 = i;
                str2 = str;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i3, str2, j2);
                break;
            default:
                j2 = j;
                i3 = i;
                str2 = str;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i3, str2, j2);
                break;
        }
    }

    private static TL_keyboard.InlineButtonType inlineButtonTypeOf(Node node) {
        String strAttr = node.attr("data-type");
        if ("url".equals(strAttr)) {
            String strAttr2 = node.attr("data-url");
            if (TextUtils.isEmpty(strAttr2)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
            tL_inlineButtonTypeUrl.url = strAttr2;
            return tL_inlineButtonTypeUrl;
        }
        if ("copy".equals(strAttr)) {
            String strAttr3 = node.attr("data-copy-text");
            if (TextUtils.isEmpty(strAttr3)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
            tL_inlineButtonTypeCopy.copy_text = strAttr3;
            return tL_inlineButtonTypeCopy;
        }
        if (!"user-profile".equals(strAttr)) {
            return null;
        }
        long longAttr = parseLongAttr(node.attr("data-user-id"), 0L);
        if (longAttr <= 0) {
            return null;
        }
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = longAttr;
        return tL_inlineButtonTypeUserProfile;
    }

    private static TL_keyboard.RichButtonStyle inlineButtonStyleOf(Node node) {
        TL_keyboard.RichButtonStyle richButtonStyle = new TL_keyboard.RichButtonStyle();
        String strAttr = node.attr("data-style");
        richButtonStyle.bg_primary = "primary".equals(strAttr);
        richButtonStyle.bg_danger = "danger".equals(strAttr);
        richButtonStyle.bg_success = "success".equals(strAttr);
        return richButtonStyle;
    }

    private static void appendStyled(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, int i, String str, long j) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        int length2 = spannableStringBuilder.length();
        if (j != 0) {
            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(j, (Paint.FontMetricsInt) null), length, length2, 33);
        }
        if (i != 0) {
            TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
            textStyleRun.flags = i & 114975;
            spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun, AndroidUtilities.dp(SharedConfig.fontSize)), length, length2, 33);
        }
        if (str != null) {
            spannableStringBuilder.setSpan(RichTextStyle.linkSpan(str), length, length2, 33);
        }
    }

    private static boolean hasPullClass(Node node) {
        String strAttr = node.attr("class");
        return strAttr != null && strAttr.toLowerCase().contains("pull");
    }

    private static boolean hasCheckboxClass(Node node) {
        String strAttr = node.attr("class");
        return strAttr != null && strAttr.toLowerCase().contains("checkbox");
    }

    private static boolean isBlank(String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != 160) {
                return false;
            }
        }
        return true;
    }

    private static CharSequence trim(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length();
        int i = 0;
        while (i < length && isWs(spannableStringBuilder.charAt(i))) {
            i++;
        }
        while (length > i && isWs(spannableStringBuilder.charAt(length - 1))) {
            length--;
        }
        return (i == 0 && length == spannableStringBuilder.length()) ? spannableStringBuilder : spannableStringBuilder.subSequence(i, length);
    }

    public static String decode(String str) {
        if (str == null) {
            return "";
        }
        if (str.indexOf(38) < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '&') {
                sb.append(cCharAt);
            } else {
                int i2 = i + 1;
                int iIndexOf = str.indexOf(59, i2);
                if (iIndexOf < 0 || iIndexOf - i > 12) {
                    sb.append(cCharAt);
                } else {
                    String strEntity = entity(str.substring(i2, iIndexOf));
                    if (strEntity != null) {
                        sb.append(strEntity);
                        i = iIndexOf;
                    } else {
                        sb.append(cCharAt);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    private static String entity(String str) {
        int i;
        str.hashCode();
        switch (str) {
            case "gt":
                return ">";
            case "lt":
                return "<";
            case "amp":
                return "&";
            case "apos":
                return "'";
            case "nbsp":
                return " ";
            case "quot":
                return "\"";
            default:
                if (str.length() > 1 && str.charAt(0) == '#') {
                    try {
                        if (str.charAt(1) == 'x' || str.charAt(1) == 'X') {
                            i = Integer.parseInt(str.substring(2), 16);
                        } else {
                            i = Integer.parseInt(str.substring(1));
                        }
                        return new String(Character.toChars(i));
                    } catch (Exception unused) {
                    }
                }
                return null;
        }
    }

    private static class Node {
        Map attrs;
        final ArrayList children = new ArrayList();
        boolean isText;
        String tag;
        String text;

        private Node() {
        }

        static Node text(String str) {
            Node node = new Node();
            node.isText = true;
            node.text = str;
            return node;
        }

        static Node el(String str) {
            Node node = new Node();
            node.tag = str;
            return node;
        }

        String attr(String str) {
            Map map = this.attrs;
            if (map == null) {
                return null;
            }
            return (String) map.get(str);
        }

        boolean has(String str) {
            Map map = this.attrs;
            return map != null && map.containsKey(str);
        }
    }

    public static boolean isVoid(String str) {
        str.hashCode();
        switch (str) {
            case "br":
            case "hr":
            case "img":
            case "wbr":
            case "link":
            case "meta":
            case "input":
                return true;
            default:
                return false;
        }
    }

    private static class Parser {
        int p;
        final String s;

        private boolean isSpace(char c) {
            return c == ' ' || c == '\t' || c == '\n' || c == '\r' || c == '\f';
        }

        Parser(String str) {
            this.s = str == null ? "" : str;
        }

        List parse() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (this.p < this.s.length()) {
                if (this.s.charAt(this.p) == '<') {
                    if (this.s.startsWith("<!--", this.p)) {
                        int iIndexOf = this.s.indexOf("-->", this.p + 4);
                        this.p = iIndexOf < 0 ? this.s.length() : iIndexOf + 3;
                    } else if (this.p + 1 < this.s.length() && this.s.charAt(this.p + 1) == '!') {
                        int iIndexOf2 = this.s.indexOf(62, this.p);
                        this.p = iIndexOf2 < 0 ? this.s.length() : iIndexOf2 + 1;
                    } else if (this.p + 1 < this.s.length() && this.s.charAt(this.p + 1) == '/') {
                        int iIndexOf3 = this.s.indexOf(62, this.p);
                        String str = this.s;
                        String lowerCase = str.substring(this.p + 2, iIndexOf3 < 0 ? str.length() : iIndexOf3).trim().toLowerCase();
                        this.p = iIndexOf3 < 0 ? this.s.length() : iIndexOf3 + 1;
                        closeTag(arrayList2, lowerCase);
                    } else {
                        int iFindTagEnd = findTagEnd(this.p);
                        if (iFindTagEnd < 0) {
                            addText(arrayList2, arrayList, this.s.substring(this.p));
                            break;
                        }
                        String strSubstring = this.s.substring(this.p + 1, iFindTagEnd);
                        this.p = iFindTagEnd + 1;
                        boolean zEndsWith = strSubstring.endsWith("/");
                        if (zEndsWith) {
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                        }
                        Node tag = parseTag(strSubstring);
                        if (tag != null) {
                            addChild(arrayList2, arrayList, tag);
                            if (!zEndsWith && !RichHtml.isVoid(tag.tag)) {
                                arrayList2.add(tag);
                            }
                        }
                    }
                } else {
                    int iIndexOf4 = this.s.indexOf(60, this.p);
                    if (iIndexOf4 < 0) {
                        iIndexOf4 = this.s.length();
                    }
                    addText(arrayList2, arrayList, this.s.substring(this.p, iIndexOf4));
                    this.p = iIndexOf4;
                }
            }
            return arrayList;
        }

        private int findTagEnd(int i) {
            boolean z = false;
            char c = 0;
            for (int i2 = i + 1; i2 < this.s.length(); i2++) {
                char cCharAt = this.s.charAt(i2);
                if (z) {
                    if (cCharAt == c) {
                        z = false;
                    }
                } else if (cCharAt == '\"' || cCharAt == '\'') {
                    c = cCharAt;
                    z = true;
                } else if (cCharAt == '>') {
                    return i2;
                }
            }
            return -1;
        }

        private void closeTag(ArrayList arrayList, String str) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((Node) arrayList.get(size)).tag.equals(str)) {
                    while (arrayList.size() > size) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                    return;
                }
            }
        }

        private void addChild(ArrayList arrayList, ArrayList arrayList2, Node node) {
            if (arrayList.isEmpty()) {
                arrayList2.add(node);
            } else {
                ((Node) arrayList.get(arrayList.size() - 1)).children.add(node);
            }
        }

        private void addText(ArrayList arrayList, ArrayList arrayList2, String str) {
            if (str.isEmpty()) {
                return;
            }
            addChild(arrayList, arrayList2, Node.text(str));
        }

        private Node parseTag(String str) {
            String strSubstring;
            int i;
            String strSubstring2;
            int i2;
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return null;
            }
            int i3 = 0;
            while (i3 < strTrim.length() && !isSpace(strTrim.charAt(i3))) {
                i3++;
            }
            String lowerCase = strTrim.substring(0, i3).toLowerCase();
            if (lowerCase.isEmpty()) {
                return null;
            }
            Node nodeEl = Node.el(lowerCase);
            while (i3 < strTrim.length()) {
                while (i3 < strTrim.length() && isSpace(strTrim.charAt(i3))) {
                    i3++;
                }
                if (i3 >= strTrim.length()) {
                    break;
                }
                int i4 = i3;
                while (i4 < strTrim.length() && strTrim.charAt(i4) != '=' && !isSpace(strTrim.charAt(i4))) {
                    i4++;
                }
                String lowerCase2 = strTrim.substring(i3, i4).toLowerCase();
                while (i4 < strTrim.length() && isSpace(strTrim.charAt(i4))) {
                    i4++;
                }
                if (i4 < strTrim.length() && strTrim.charAt(i4) == '=') {
                    while (true) {
                        i2 = i4 + 1;
                        if (i2 >= strTrim.length() || !isSpace(strTrim.charAt(i2))) {
                            break;
                        }
                        i4 = i2;
                    }
                    if (i2 < strTrim.length() && (strTrim.charAt(i2) == '\"' || strTrim.charAt(i2) == '\'')) {
                        char cCharAt = strTrim.charAt(i2);
                        int i5 = i4 + 2;
                        i = i5;
                        while (i < strTrim.length() && strTrim.charAt(i) != cCharAt) {
                            i++;
                        }
                        strSubstring2 = strTrim.substring(i5, Math.min(i, strTrim.length()));
                        if (i < strTrim.length()) {
                            i++;
                        }
                    } else {
                        i4 = i2;
                        while (i4 < strTrim.length() && !isSpace(strTrim.charAt(i4))) {
                            i4++;
                        }
                        strSubstring = strTrim.substring(i2, i4);
                    }
                    if (lowerCase2.isEmpty()) {
                        if (nodeEl.attrs == null) {
                            nodeEl.attrs = new HashMap();
                        }
                        nodeEl.attrs.put(lowerCase2, RichHtml.decode(strSubstring2));
                    }
                    i3 = i;
                } else {
                    strSubstring = "";
                }
                i = i4;
                strSubstring2 = strSubstring;
                if (lowerCase2.isEmpty()) {
                    if (nodeEl.attrs == null) {
                        nodeEl.attrs = new HashMap();
                    }
                    nodeEl.attrs.put(lowerCase2, RichHtml.decode(strSubstring2));
                }
                i3 = i;
            }
            return nodeEl;
        }
    }
}
