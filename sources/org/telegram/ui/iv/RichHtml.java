package org.telegram.ui.iv;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.PhotoViewer;

public abstract class RichHtml {

    public final class Node {
        public HashMap attrs;
        public final ArrayList children = new ArrayList();
        public boolean isText;
        public String tag;
        public String text;

        public final String attr(String str) {
            HashMap map = this.attrs;
            if (map == null) {
                return null;
            }
            return (String) map.get(str);
        }

        public final boolean has(String str) {
            HashMap map = this.attrs;
            return map != null && map.containsKey(str);
        }
    }

    public abstract class Parser {
        public static boolean isSpace(char c) {
            return c == ' ' || c == '\t' || c == '\n' || c == '\r' || c == '\f';
        }
    }

    public static void addText(ArrayList arrayList, TL_iv.PageBlock pageBlock, Node node) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        appendChildrenInline(spannableStringBuilder, node, 0, null, 0L);
        CharSequence charSequenceTrim = trim(spannableStringBuilder);
        int i = RichTextCell.$r8$clinit;
        pageBlock.text = RichTextStyle.fromSpannable(charSequenceTrim);
        arrayList.add(new BlockRow(pageBlock, 0, 0));
    }

    public static void appendButton(StringBuilder sb, TL_iv.RichText richText, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle) {
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
            appendInline(sb, RichTextStyle.toSpannable(richText, null));
            sb.append("</button>");
        }
    }

    public static void appendChildrenInline(SpannableStringBuilder spannableStringBuilder, Node node, int i, String str, long j) {
        SpannableStringBuilder spannableStringBuilder2;
        int i2;
        String str2;
        long j2;
        ArrayList arrayList = node.children;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Node node2 = (Node) obj;
            if (node2.isText) {
                spannableStringBuilder2 = spannableStringBuilder;
                i2 = i;
                str2 = str;
                j2 = j;
                appendStyled(spannableStringBuilder2, decode(node2.text), i2, str2, j2);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                i2 = i;
                str2 = str;
                j2 = j;
                appendInlineNode(spannableStringBuilder2, node2, i2, str2, j2);
            }
            spannableStringBuilder = spannableStringBuilder2;
            i = i2;
            str = str2;
            j = j2;
        }
    }

    public static void appendChildrenInlineExcept(SpannableStringBuilder spannableStringBuilder, Node node) {
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList = node.children;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Node node2 = (Node) obj;
            if (node2.isText) {
                spannableStringBuilder2 = spannableStringBuilder;
                appendStyled(spannableStringBuilder2, decode(node2.text), 0, null, 0L);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                if (!"cite".equals(node2.tag)) {
                    appendInlineNode(spannableStringBuilder2, node2, 0, null, 0L);
                }
            }
            spannableStringBuilder = spannableStringBuilder2;
        }
    }

    public static void appendInline(StringBuilder sb, CharSequence charSequence) {
        int spanEnd;
        RichInlineButtonSpan richInlineButtonSpan;
        long documentId;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        char c = 0;
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
                TL_iv.textButton textbutton = richInlineButtonSpan.button;
                if (textbutton != null && RichInlineButtonSpan.isSupported(textbutton.type)) {
                    appendButton(sb, textbutton.text, textbutton.type, textbutton.style);
                }
                iMin = Math.min(length, spanEnd);
            } else {
                int iNextSpanTransition = spanned.nextSpanTransition(iMin, length, CharacterStyle.class);
                int i2 = 0;
                for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) spanned.getSpans(iMin, iNextSpanTransition, TextStyleSpan.class)) {
                    TextStyleSpan.TextStyleRun textStyleRun = textStyleSpan.style;
                    if (textStyleRun != null) {
                        i2 |= textStyleRun.flags;
                    }
                }
                URLSpanReplacement[] uRLSpanReplacementArr = (URLSpanReplacement[]) spanned.getSpans(iMin, iNextSpanTransition, URLSpanReplacement.class);
                String url = uRLSpanReplacementArr.length > 0 ? uRLSpanReplacementArr[c].getURL() : null;
                AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(iMin, iNextSpanTransition, AnimatedEmojiSpan.class);
                if (animatedEmojiSpanArr.length > 0) {
                    AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[c];
                    if (animatedEmojiSpan.standard) {
                        documentId = 0;
                    } else {
                        documentId = animatedEmojiSpan.getDocumentId();
                    }
                } else {
                    documentId = 0;
                }
                int i3 = i2 & 256;
                if (i3 != 0) {
                    sb.append("<spoiler>");
                }
                int i4 = i2 & 1;
                if (i4 != 0) {
                    sb.append("<b>");
                }
                int i5 = i2 & 2;
                if (i5 != 0) {
                    sb.append("<i>");
                }
                int i6 = i2 & 16;
                if (i6 != 0) {
                    sb.append("<u>");
                }
                int i7 = i2 & 8;
                if (i7 != 0) {
                    sb.append("<s>");
                }
                int i8 = i2 & 4;
                Spanned spanned2 = spanned;
                if (i8 != 0) {
                    sb.append("<code>");
                }
                int i9 = i2 & 16384;
                if (i9 != 0) {
                    sb.append("<sub>");
                }
                int i10 = 32768 & i2;
                if (i10 != 0) {
                    sb.append("<sup>");
                }
                int i11 = 65536 & i2;
                if (i11 != 0) {
                    sb.append("<mark>");
                }
                if (url != null) {
                    sb.append("<a href=\"");
                    sb.append(escapeAttr(url));
                    sb.append("\">");
                }
                if (documentId != 0) {
                    sb.append("<animated-emoji data-document-id=\"");
                    sb.append(documentId);
                    sb.append("\">");
                }
                escape(sb, charSequence, iMin, iNextSpanTransition);
                if (documentId != 0) {
                    sb.append("</animated-emoji>");
                }
                if (url != null) {
                    sb.append("</a>");
                }
                if (i11 != 0) {
                    sb.append("</mark>");
                }
                if (i10 != 0) {
                    sb.append("</sup>");
                }
                if (i9 != 0) {
                    sb.append("</sub>");
                }
                if (i8 != 0) {
                    sb.append("</code>");
                }
                if (i7 != 0) {
                    sb.append("</s>");
                }
                if (i6 != 0) {
                    sb.append("</u>");
                }
                if (i5 != 0) {
                    sb.append("</i>");
                }
                if (i4 != 0) {
                    sb.append("</b>");
                }
                if (i3 != 0) {
                    sb.append("</spoiler>");
                }
                iMin = iNextSpanTransition;
                spanned = spanned2;
                c = 0;
            }
        }
    }

    public static void appendInlineNode(SpannableStringBuilder spannableStringBuilder, Node node, int i, String str, long j) {
        int i2;
        int i3;
        long j2;
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
                TL_keyboard.RichButtonStyle richButtonStyle = new TL_keyboard.RichButtonStyle();
                String strAttr = node.attr("data-style");
                richButtonStyle.bg_primary = "primary".equals(strAttr);
                richButtonStyle.bg_danger = "danger".equals(strAttr);
                richButtonStyle.bg_success = "success".equals(strAttr);
                textbutton.style = richButtonStyle;
                spannableStringBuilder.setSpan(new RichInlineButtonSpan(textbutton), length, spannableStringBuilder.length(), 33);
            }
            return;
        }
        String str3 = node.tag;
        str3.getClass();
        switch (str3) {
            case "spoiler":
                i3 = i | 256;
                str2 = str;
                j2 = j;
                i2 = i3;
                if (node.children.isEmpty() || node.isText) {
                    appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                    break;
                }
                break;
            case "strike":
            case "s":
            case "del":
                i3 = i | 8;
                str2 = str;
                j2 = j;
                i2 = i3;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "strong":
            case "b":
                i3 = i | 1;
                str2 = str;
                j2 = j;
                i2 = i3;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "a":
                String strAttr2 = node.attr("href");
                if (strAttr2 != null) {
                    i2 = i;
                    j2 = j;
                    str2 = strAttr2;
                } else {
                    i2 = i;
                    str2 = str;
                    j2 = j;
                }
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "i":
            case "em":
                i3 = i | 2;
                str2 = str;
                j2 = j;
                i2 = i3;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "u":
                i3 = i | 16;
                str2 = str;
                j2 = j;
                i2 = i3;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "br":
                appendStyled(spannableStringBuilder, "\n", i, str, j);
                break;
            case "tt":
            case "code":
                i2 = i | 4;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "sub":
                i2 = i | 16384;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "sup":
                i4 = 32768;
                i2 = i | i4;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "mark":
                i4 = 65536;
                i2 = i | i4;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            case "animated-emoji":
                String strAttr3 = node.attr("data-document-id");
                if (strAttr3 != null) {
                    try {
                        i2 = i;
                        j2 = Long.parseLong(strAttr3.trim());
                        str2 = str;
                    } catch (Exception unused) {
                        i2 = i;
                        str2 = str;
                        j2 = j;
                    }
                    if (node.children.isEmpty()) {
                        break;
                    }
                    appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                    break;
                }
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
            default:
                i2 = i;
                str2 = str;
                j2 = j;
                if (node.children.isEmpty()) {
                    break;
                }
                appendChildrenInline(spannableStringBuilder, node, i2, str2, j2);
                break;
        }
    }

    public static void appendMediaTag(StringBuilder sb, String str, long j, MediaUploadState mediaUploadState, TL_iv.PageBlock pageBlock) {
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

    public static void appendStyled(SpannableStringBuilder spannableStringBuilder, String str, int i, String str2, long j) {
        if (str == null || str.length() == 0) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        if (j != 0) {
            spannableStringBuilder.setSpan(new AnimatedEmojiSpan(j, 1.2f, null), length, length2, 33);
        }
        if (i != 0) {
            TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
            textStyleRun.flags = i & 114975;
            spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun, AndroidUtilities.dp(SharedConfig.fontSize)), length, length2, 33);
        }
        if (str2 != null) {
            TextStyleSpan.TextStyleRun textStyleRun2 = new TextStyleSpan.TextStyleRun();
            textStyleRun2.flags = 1024;
            spannableStringBuilder.setSpan(new URLSpanReplacement(str2, textStyleRun2), length, length2, 33);
        }
    }

    public static String blockTag(TL_iv.PageBlock pageBlock) {
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

    public static BlockRow buildMediaRow(Node node) {
        double d;
        String str = node.tag;
        str.getClass();
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
                long longAttr = parseLongAttr(node.attr("src"));
                if (longAttr <= 0) {
                    return null;
                }
                boolean zHas = node.has("data-spoiler");
                TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
                pageblockphoto.photo_id = longAttr > 0 ? longAttr : 0L;
                pageblockphoto.spoiler = zHas;
                setEmptyCaption(pageblockphoto);
                return new BlockRow(pageblockphoto, 0, 0);
            case "audio":
                long longAttr2 = parseLongAttr(node.attr("src"));
                if (longAttr2 <= 0) {
                    return null;
                }
                TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
                pageblockaudio.audio_id = longAttr2;
                setEmptyCaption(pageblockaudio);
                return new BlockRow(pageblockaudio, 0, 0);
            case "video":
                long longAttr3 = parseLongAttr(node.attr("src"));
                if (longAttr3 <= 0) {
                    return null;
                }
                boolean zHas2 = node.has("data-spoiler");
                TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
                pageblockvideo.video_id = longAttr3 > 0 ? longAttr3 : 0L;
                pageblockvideo.spoiler = zHas2;
                setEmptyCaption(pageblockvideo);
                return new BlockRow(pageblockvideo, 0, 0);
            case "document":
                long longAttr4 = parseLongAttr(node.attr("src"));
                if (longAttr4 <= 0) {
                    return null;
                }
                TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
                pageblockdocument.document_id = longAttr4;
                setEmptyCaption(pageblockdocument);
                return new BlockRow(pageblockdocument, 0, 0);
            case "location":
                TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                String strAttr2 = node.attr("lat");
                double d2 = 0.0d;
                if (strAttr2 != null) {
                    try {
                        d = Double.parseDouble(strAttr2.trim());
                    } catch (Exception unused) {
                        d = 0.0d;
                    }
                    break;
                } else {
                    d = 0.0d;
                }
                tL_geoPoint.lat = d;
                String strAttr3 = node.attr("long");
                if (strAttr3 != null) {
                    try {
                        d2 = Double.parseDouble(strAttr3.trim());
                        break;
                    } catch (Exception unused2) {
                    }
                }
                tL_geoPoint._long = d2;
                tL_geoPoint.access_hash = parseLongAttr(node.attr("access"));
                pageblockmap.geo = tL_geoPoint;
                pageblockmap.zoom = parseIntAttr(15, node.attr("zoom"));
                pageblockmap.w = parseIntAttr(600, node.attr("w"));
                pageblockmap.h = parseIntAttr(400, node.attr("h"));
                setEmptyCaption(pageblockmap);
                return new BlockRow(pageblockmap, 0, 0);
            default:
                return null;
        }
    }

    public static SpannableStringBuilder captionOf(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        if (pageBlock != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            SpannableStringBuilder spannable = RichTextStyle.toSpannable(richText, null);
            if (spannable.length() > 0) {
                return spannable;
            }
        }
        return null;
    }

    public static void collectTableRows(Node node, TL_iv.pageBlockTable pageblocktable) {
        String lowerCase;
        int iIndexOf;
        ArrayList arrayList = node.children;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Node node2 = (Node) obj;
            if (!node2.isText) {
                String str = node2.tag;
                str.getClass();
                switch (str) {
                    case "tr":
                        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        pagetablerow.cells = new ArrayList<>();
                        ArrayList arrayList3 = node2.children;
                        int size2 = arrayList3.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList3.get(i3);
                            i3++;
                            Node node3 = (Node) obj2;
                            if (!node3.isText && ("td".equals(node3.tag) || "th".equals(node3.tag))) {
                                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                pagetablecell.colspan = parseIntAttr(i, node3.attr("colspan"));
                                pagetablecell.rowspan = parseIntAttr(i, node3.attr("rowspan"));
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                appendChildrenInline(spannableStringBuilder, node3, 0, null, 0L);
                                TableModel.applyStyledText(pagetablecell, trim(spannableStringBuilder));
                                boolean z = "th".equals(node3.tag) || node3.has("header");
                                pagetablecell.header = z;
                                pagetablecell.flags = z ? pagetablecell.flags | 1 : pagetablecell.flags & (-2);
                                String strAttr = node3.attr("align");
                                if (strAttr == null) {
                                    String strAttr2 = node3.attr("style");
                                    if (strAttr2 == null || (iIndexOf = (lowerCase = strAttr2.toLowerCase()).indexOf("text-align")) < 0) {
                                        strAttr = null;
                                    } else if (lowerCase.indexOf("center", iIndexOf) >= 0) {
                                        strAttr = "center";
                                    } else if (lowerCase.indexOf("right", iIndexOf) >= 0) {
                                        strAttr = "right";
                                    } else {
                                        strAttr = null;
                                    }
                                }
                                if ("center".equalsIgnoreCase(strAttr)) {
                                    TableModel.setAlign(pagetablecell, 1);
                                } else if ("right".equalsIgnoreCase(strAttr)) {
                                    TableModel.setAlign(pagetablecell, 2);
                                }
                                String strAttr3 = node3.attr("valign");
                                if ("middle".equalsIgnoreCase(strAttr3)) {
                                    TableModel.setVAlign(pagetablecell, 1);
                                } else {
                                    if ("bottom".equalsIgnoreCase(strAttr3)) {
                                        TableModel.setVAlign(pagetablecell, 2);
                                    }
                                    pagetablerow.cells.add(pagetablecell);
                                }
                                pagetablerow.cells.add(pagetablecell);
                            }
                            i = 0;
                        }
                        if (pagetablerow.cells.isEmpty()) {
                            ArrayList<TL_iv.pageTableCell> arrayList4 = pagetablerow.cells;
                            TL_iv.pageTableCell pagetablecell2 = new TL_iv.pageTableCell();
                            TableModel.applyPlainText(pagetablecell2, "");
                            arrayList4.add(pagetablecell2);
                        }
                        arrayList2.add(pagetablerow);
                        continue;
                        break;
                    case "tbody":
                    case "tfoot":
                    case "thead":
                        collectTableRows(node2, pageblocktable);
                        break;
                    case "caption":
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        appendChildrenInline(spannableStringBuilder2, node2, 0, null, 0L);
                        pageblocktable.title = RichTextStyle.fromSpannable(trim(spannableStringBuilder2));
                        break;
                    default:
                        break;
                }
            }
            i = 0;
        }
    }

    public static String decode(String str) {
        String str2;
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
                    String strSubstring = str.substring(i2, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            str2 = ">";
                            break;
                        case "lt":
                            str2 = "<";
                            break;
                        case "amp":
                            str2 = "&";
                            break;
                        case "apos":
                            str2 = "'";
                            break;
                        case "nbsp":
                            str2 = " ";
                            break;
                        case "quot":
                            str2 = "\"";
                            break;
                        default:
                            if (strSubstring.length() <= 1 || strSubstring.charAt(0) != '#') {
                                str2 = null;
                                break;
                            } else {
                                try {
                                    str2 = new String(Character.toChars((strSubstring.charAt(1) == 'x' || strSubstring.charAt(1) == 'X') ? Integer.parseInt(strSubstring.substring(2), 16) : Integer.parseInt(strSubstring.substring(1))));
                                } catch (Exception unused) {
                                    str2 = null;
                                }
                                break;
                            }
                            break;
                    }
                    if (str2 != null) {
                        sb.append(str2);
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

    public static void escape(StringBuilder sb, CharSequence charSequence, int i, int i2) {
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

    public static String escapeAttr(String str) {
        return str == null ? "" : str.replace("&", "&amp;").replace("\"", "&quot;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public static TL_keyboard.InlineButtonType inlineButtonTypeOf(Node node) {
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
        long longAttr = parseLongAttr(node.attr("data-user-id"));
        if (longAttr <= 0) {
            return null;
        }
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = longAttr;
        return tL_inlineButtonTypeUserProfile;
    }

    public static boolean isBlank(String str) {
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

    public static ArrayList parse(String str, HashMap map) {
        char c;
        Node node;
        String strSubstring;
        int i;
        int i2 = 3;
        int i3 = 4;
        int i4 = -1;
        int i5 = 2;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = 0;
            while (length < str.length()) {
                if (str.charAt(length) != '<') {
                    int iIndexOf = str.indexOf(60, length);
                    if (iIndexOf < 0) {
                        iIndexOf = str.length();
                    }
                    String strSubstring2 = str.substring(length, iIndexOf);
                    if (!strSubstring2.isEmpty()) {
                        Node node2 = new Node();
                        node2.isText = true;
                        node2.text = strSubstring2;
                        if (arrayList3.isEmpty()) {
                            arrayList2.add(node2);
                        } else {
                            ((Node) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList3)).children.add(node2);
                        }
                    }
                    length = iIndexOf;
                } else if (str.startsWith("<!--", length)) {
                    int iIndexOf2 = str.indexOf("-->", length + i3);
                    length = iIndexOf2 < 0 ? str.length() : iIndexOf2 + i2;
                } else if (length + 1 < str.length() && str.charAt(length + 1) == '!') {
                    int iIndexOf3 = str.indexOf(62, length);
                    length = iIndexOf3 < 0 ? str.length() : iIndexOf3 + 1;
                } else if (length + 1 >= str.length() || str.charAt(length + 1) != '/') {
                    int i6 = length + 1;
                    boolean z = false;
                    char c2 = 0;
                    while (true) {
                        c = '\'';
                        if (i6 < str.length()) {
                            char cCharAt = str.charAt(i6);
                            if (z) {
                                if (cCharAt == c2) {
                                    z = false;
                                }
                            } else if (cCharAt == '\"' || cCharAt == '\'') {
                                c2 = cCharAt;
                                z = true;
                            } else if (cCharAt == '>') {
                            }
                            i6++;
                        } else {
                            i6 = -1;
                        }
                    }
                    if (i6 < 0) {
                        String strSubstring3 = str.substring(length);
                        if (!strSubstring3.isEmpty()) {
                            Node node3 = new Node();
                            node3.isText = true;
                            node3.text = strSubstring3;
                            if (arrayList3.isEmpty()) {
                                arrayList2.add(node3);
                            } else {
                                ((Node) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList3)).children.add(node3);
                            }
                        }
                        parseBlocks(arrayList2, arrayList, map);
                        if (arrayList.isEmpty()) {
                            arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                    } else {
                        String strSubstring4 = str.substring(length + 1, i6);
                        int i7 = i6 + 1;
                        boolean zEndsWith = strSubstring4.endsWith("/");
                        if (zEndsWith) {
                            strSubstring4 = SurfaceContainer$$ExternalSyntheticOutline0.m(1, 0, strSubstring4);
                        }
                        String strTrim = strSubstring4.trim();
                        if (strTrim.isEmpty()) {
                            node = null;
                        } else {
                            int i8 = 0;
                            while (i8 < strTrim.length() && !Parser.isSpace(strTrim.charAt(i8))) {
                                i8++;
                            }
                            String lowerCase = strTrim.substring(0, i8).toLowerCase();
                            if (lowerCase.isEmpty()) {
                                node = null;
                            } else {
                                Node node4 = new Node();
                                node4.tag = lowerCase;
                                while (i8 < strTrim.length()) {
                                    while (i8 < strTrim.length() && Parser.isSpace(strTrim.charAt(i8))) {
                                        i8++;
                                    }
                                    if (i8 >= strTrim.length()) {
                                        node = node4;
                                    } else {
                                        int i9 = i8;
                                        while (i9 < strTrim.length() && strTrim.charAt(i9) != '=' && !Parser.isSpace(strTrim.charAt(i9))) {
                                            i9++;
                                        }
                                        String lowerCase2 = strTrim.substring(i8, i9).toLowerCase();
                                        while (i9 < strTrim.length() && Parser.isSpace(strTrim.charAt(i9))) {
                                            i9++;
                                        }
                                        if (i9 >= strTrim.length() || strTrim.charAt(i9) != '=') {
                                            strSubstring = "";
                                            i8 = i9;
                                        } else {
                                            while (true) {
                                                i = i9 + 1;
                                                if (i < strTrim.length() && Parser.isSpace(strTrim.charAt(i))) {
                                                    i9 = i;
                                                }
                                            }
                                            if (i >= strTrim.length() || !(strTrim.charAt(i) == '\"' || strTrim.charAt(i) == c)) {
                                                int i10 = i;
                                                while (i10 < strTrim.length() && !Parser.isSpace(strTrim.charAt(i10))) {
                                                    i10++;
                                                }
                                                i8 = i10;
                                                strSubstring = strTrim.substring(i, i10);
                                            } else {
                                                char cCharAt2 = strTrim.charAt(i);
                                                int i11 = i9 + 2;
                                                i8 = i11;
                                                while (i8 < strTrim.length() && strTrim.charAt(i8) != cCharAt2) {
                                                    i8++;
                                                }
                                                strSubstring = strTrim.substring(i11, Math.min(i8, strTrim.length()));
                                                if (i8 < strTrim.length()) {
                                                    i8++;
                                                }
                                            }
                                        }
                                        if (!lowerCase2.isEmpty()) {
                                            if (node4.attrs == null) {
                                                node4.attrs = new HashMap();
                                            }
                                            node4.attrs.put(lowerCase2, decode(strSubstring));
                                        }
                                        c = '\'';
                                    }
                                }
                                node = node4;
                            }
                        }
                        if (node != null) {
                            if (arrayList3.isEmpty()) {
                                arrayList2.add(node);
                            } else {
                                ((Node) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList3)).children.add(node);
                            }
                            if (!zEndsWith) {
                                String str2 = node.tag;
                                str2.getClass();
                                switch (str2) {
                                    case "br":
                                    case "hr":
                                    case "img":
                                    case "wbr":
                                    case "link":
                                    case "meta":
                                    case "input":
                                        break;
                                    default:
                                        arrayList3.add(node);
                                        break;
                                }
                            }
                        }
                        length = i7;
                    }
                } else {
                    int iIndexOf4 = str.indexOf(62, length);
                    String lowerCase3 = str.substring(length + i5, iIndexOf4 < 0 ? str.length() : iIndexOf4).trim().toLowerCase();
                    int length2 = iIndexOf4 < 0 ? str.length() : iIndexOf4 + 1;
                    for (int size = arrayList3.size() - 1; size >= 0; size += i4) {
                        if (((Node) arrayList3.get(size)).tag.equals(lowerCase3)) {
                            while (arrayList3.size() > size) {
                                SurfaceContainer$$ExternalSyntheticOutline0.m5m(1, arrayList3);
                            }
                            length = length2;
                        }
                    }
                    length = length2;
                }
                i2 = 3;
                i3 = 4;
                i4 = -1;
                i5 = 2;
            }
            parseBlocks(arrayList2, arrayList, map);
            if (arrayList.isEmpty()) {
                arrayList.add(new BlockRow(new TL_iv.pageBlockParagraph(), 0, 0));
            }
        }
        return arrayList;
    }

    public static void parseBlocks(java.util.ArrayList r31, java.util.ArrayList r32, java.util.HashMap r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichHtml.parseBlocks(java.util.ArrayList, java.util.ArrayList, java.util.HashMap):void");
    }

    public static BlockRow parseGallery(Node node, boolean z) {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageBlock pageblockslideshow = z ? new TL_iv.pageBlockSlideshow() : new TL_iv.pageBlockCollage();
        ArrayList arrayListGalleryItems = RichEditorListView.galleryItems(pageblockslideshow);
        ArrayList arrayList = node.children;
        int size = arrayList.size();
        CharSequence charSequenceTrim = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Node node2 = (Node) obj;
            if (!node2.isText) {
                if ("figcaption".equals(node2.tag)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    appendChildrenInline(spannableStringBuilder, node2, 0, null, 0L);
                    charSequenceTrim = trim(spannableStringBuilder);
                } else {
                    boolean zEquals = "video".equals(node2.tag);
                    if (zEquals || "img".equals(node2.tag)) {
                        long longAttr = parseLongAttr(node2.attr("src"));
                        if (longAttr > 0) {
                            boolean zHas = node2.has("data-spoiler");
                            if (zEquals) {
                                TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
                                if (longAttr <= 0) {
                                    longAttr = 0;
                                }
                                pageblockvideo.video_id = longAttr;
                                pageblockvideo.spoiler = zHas;
                                pageBlock = pageblockvideo;
                            } else {
                                TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
                                if (longAttr <= 0) {
                                    longAttr = 0;
                                }
                                pageblockphoto.photo_id = longAttr;
                                pageblockphoto.spoiler = zHas;
                                pageBlock = pageblockphoto;
                            }
                            setEmptyCaption(pageBlock);
                            arrayListGalleryItems.add(pageBlock);
                        }
                    }
                }
            }
        }
        if (arrayListGalleryItems.isEmpty()) {
            return null;
        }
        if (arrayListGalleryItems.size() == 1) {
            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayListGalleryItems.get(0);
            if (charSequenceTrim != null && charSequenceTrim.length() > 0) {
                TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                pageCaption.text = RichTextStyle.fromSpannable(charSequenceTrim);
                pageCaption.credit = new TL_iv.textEmpty();
                pageBlock2.caption = pageCaption;
            }
            return new BlockRow(pageBlock2, 0, 0);
        }
        setEmptyCaption(pageblockslideshow);
        if (charSequenceTrim != null && charSequenceTrim.length() > 0) {
            TL_iv.PageCaption pageCaption2 = new TL_iv.PageCaption();
            pageCaption2.text = RichTextStyle.fromSpannable(charSequenceTrim);
            pageCaption2.credit = new TL_iv.textEmpty();
            pageblockslideshow.caption = pageCaption2;
        }
        return new BlockRow(pageblockslideshow, 0, 0);
    }

    public static int parseIntAttr(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str.trim());
        } catch (Exception unused) {
            return i;
        }
    }

    public static void parseList(Node node, ArrayList arrayList, int i, boolean z) {
        String strAttr;
        int i2;
        int i3 = i + 1;
        ArrayList arrayList2 = node.children;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 1;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            Node node2 = (Node) obj;
            if (!node2.isText && "li".equals(node2.tag)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = node2.children;
                int size2 = arrayList4.size();
                int i6 = 0;
                while (i6 < size2) {
                    int i7 = i6 + 1;
                    Node node3 = (Node) arrayList4.get(i6);
                    if (node3.isText || !("ul".equals(node3.tag) || "ol".equals(node3.tag))) {
                        if (node3.isText) {
                            spannableStringBuilder.append((CharSequence) decode(node3.text));
                        } else {
                            i2 = size2;
                            appendInlineNode(spannableStringBuilder, node3, 0, null, 0L);
                        }
                        arrayList4 = arrayList4;
                        i6 = i7;
                        size2 = i2;
                    } else {
                        arrayList3.add(node3);
                    }
                    i2 = size2;
                    arrayList4 = arrayList4;
                    i6 = i7;
                    size2 = i2;
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = RichTextStyle.fromSpannable(trim(spannableStringBuilder));
                BlockRow blockRow = new BlockRow(pageblockparagraph, i3, z ? i5 : 0);
                blockRow.checkbox = node2.has("data-checkbox") || ((strAttr = node2.attr("class")) != null && strAttr.toLowerCase().contains("checkbox"));
                blockRow.checked = node2.has("data-checked");
                arrayList.add(blockRow);
                int size3 = arrayList3.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj2 = arrayList3.get(i8);
                    i8++;
                    Node node4 = (Node) obj2;
                    parseList(node4, arrayList, i3, "ol".equals(node4.tag));
                }
                i5++;
            }
        }
    }

    public static long parseLongAttr(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str.trim());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void serializeRange(StringBuilder sb, ArrayList arrayList, int[] iArr, int i, int i2, int i3, int i4, int i5, PhotoViewer.AnonymousClass49 anonymousClass49, boolean z, int i6, HashMap map) {
        BlockRow blockRow;
        ArrayList arrayList2;
        int i7;
        String str;
        ArrayList arrayList3;
        TL_iv.RichText richText;
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannable;
        StringBuilder sb2 = sb;
        ArrayList arrayList4 = arrayList;
        int i8 = i;
        while (true) {
            while (true) {
                int i9 = iArr[0];
                if (i9 > i8) {
                    return;
                }
                blockRow = (BlockRow) arrayList4.get(i9);
                if (blockRow.detailsEnd) {
                    if (z) {
                        return;
                    } else {
                        iArr[0] = iArr[0] + 1;
                    }
                } else if (blockRow.quoteIds.size() > i6) {
                    anonymousClass49.closeAll(sb2);
                    Long l = (Long) ((BlockRow) arrayList4.get(iArr[0])).quoteIds.get(i6);
                    long jLongValue = l.longValue();
                    int i10 = iArr[0];
                    while (true) {
                        int i11 = i10 + 1;
                        if (i11 > i8) {
                            break;
                        }
                        BlockRow blockRow2 = (BlockRow) arrayList4.get(i11);
                        if (blockRow2.quoteIds.size() <= i6 || ((Long) blockRow2.quoteIds.get(i6)).longValue() != jLongValue) {
                            break;
                        } else {
                            i10 = i11;
                        }
                    }
                    sb2.append("<blockquote>");
                    PhotoViewer.AnonymousClass49 anonymousClass410 = new PhotoViewer.AnonymousClass49();
                    serializeRange(sb2, arrayList4, iArr, i10, i2, i3, i4, i5, anonymousClass410, z, i6 + 1, map);
                    anonymousClass410.closeAll(sb2);
                    if (map == null || (richText = (TL_iv.RichText) map.get(l)) == null || (richText instanceof TL_iv.textEmpty)) {
                        spannableStringBuilder = null;
                    } else {
                        spannableStringBuilder = null;
                        spannable = RichTextStyle.toSpannable(richText, null);
                        if (spannable.length() <= 0) {
                        }
                        if (spannable != null && spannable.length() != 0) {
                            sb2.append("<cite>");
                            appendInline(sb2, spannable);
                            sb2.append("</cite>");
                        }
                        sb2.append("</blockquote>");
                    }
                    spannable = spannableStringBuilder;
                    if (spannable != null) {
                        sb2.append("<cite>");
                        appendInline(sb2, spannable);
                        sb2.append("</cite>");
                    }
                    sb2.append("</blockquote>");
                }
            }
            if (RichEditorListView.isDetailsHeader(blockRow)) {
                anonymousClass49.closeAll(sb2);
                BlockRow blockRow3 = (BlockRow) arrayList4.get(iArr[0]);
                sb2.append(((TL_iv.pageBlockDetails) blockRow3.block).open ? "<details open>" : "<details>");
                sb2.append("<summary>");
                appendInline(sb2, slicedStyled(blockRow3, iArr[0], i2, i3, i4, i5));
                sb2.append("</summary>");
                iArr[0] = iArr[0] + 1;
                PhotoViewer.AnonymousClass49 anonymousClass411 = new PhotoViewer.AnonymousClass49();
                int i12 = i8;
                serializeRange(sb2, arrayList4, iArr, i12, i2, i3, i4, i5, anonymousClass411, true, i6, map);
                arrayList2 = arrayList4;
                i7 = i12;
                anonymousClass411.closeAll(sb2);
                int i13 = iArr[0];
                if (i13 <= i7 && i13 < arrayList2.size() && ((BlockRow) arrayList2.get(iArr[0])).detailsEnd) {
                    iArr[0] = iArr[0] + 1;
                }
                sb2.append("</details>");
            } else {
                arrayList2 = arrayList4;
                i7 = i8;
                if (blockRow.level <= 0 || blockTag(blockRow.block) == null) {
                    anonymousClass49.closeAll(sb2);
                    int i14 = iArr[0];
                    TL_iv.PageBlock pageBlock = blockRow.block;
                    if (pageBlock instanceof TL_iv.pageBlockDivider) {
                        sb2.append("<hr>");
                    } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        sb2.append("<div class=\"button-row\"");
                        if (pageblockbuttonrow.align_left) {
                            sb2.append(" data-align=\"left\"");
                        } else if (pageblockbuttonrow.align_center) {
                            sb2.append(" data-align=\"center\"");
                        } else if (pageblockbuttonrow.align_right) {
                            sb2.append(" data-align=\"right\"");
                        } else {
                            sb2.append(" data-align=\"fill\"");
                        }
                        sb2.append(">");
                        ArrayList<TL_keyboard.PageButton> arrayList5 = pageblockbuttonrow.buttons;
                        if (arrayList5 != null) {
                            int size = arrayList5.size();
                            int i15 = 0;
                            while (i15 < size) {
                                TL_keyboard.PageButton pageButton = arrayList5.get(i15);
                                i15++;
                                TL_keyboard.PageButton pageButton2 = pageButton;
                                if (pageButton2 != null) {
                                    appendButton(sb2, pageButton2.text, pageButton2.type, pageButton2.style);
                                }
                            }
                        }
                        sb2.append("</div>");
                    } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                        serializeTable(sb2, (TL_iv.pageBlockTable) pageBlock);
                    } else {
                        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                            serializeSingleMedia(sb2, "img", ((TL_iv.pageBlockPhoto) pageBlock).photo_id, blockRow.media, pageBlock);
                            sb2 = sb;
                        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                            sb2 = sb;
                            serializeSingleMedia(sb2, "video", ((TL_iv.pageBlockVideo) pageBlock).video_id, blockRow.media, pageBlock);
                        } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                            sb2 = sb;
                            serializeSingleMedia(sb2, "audio", ((TL_iv.pageBlockAudio) pageBlock).audio_id, blockRow.media, pageBlock);
                        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                            sb2 = sb;
                            serializeSingleMedia(sb2, "document", ((TL_iv.pageBlockDocument) pageBlock).document_id, blockRow.media, pageBlock);
                        } else {
                            sb2 = sb;
                            boolean zIsGallery = RichEditorListView.isGallery(pageBlock);
                            String str2 = "<figcaption>";
                            if (zIsGallery) {
                                String str3 = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
                                sb2.append("<div class=\"");
                                sb2.append(str3);
                                sb2.append("\">");
                                ArrayList arrayListGalleryItems = RichEditorListView.galleryItems(pageBlock);
                                if (arrayListGalleryItems != null) {
                                    int i16 = 0;
                                    while (i16 < arrayListGalleryItems.size()) {
                                        TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayListGalleryItems.get(i16);
                                        ArrayList arrayList6 = blockRow.medias;
                                        MediaUploadState mediaUploadState = (arrayList6 == null || i16 >= arrayList6.size()) ? null : (MediaUploadState) blockRow.medias.get(i16);
                                        if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                                            long j = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                                            if (j != 0) {
                                                str = str2;
                                                appendMediaTag(sb2, "video", j, mediaUploadState, pageBlock2);
                                            } else {
                                                str = str2;
                                            }
                                        } else {
                                            str = str2;
                                            if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                                                long j2 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                                                if (j2 != 0) {
                                                    sb2 = sb;
                                                    appendMediaTag(sb2, "img", j2, mediaUploadState, pageBlock2);
                                                }
                                            }
                                            i16++;
                                            str2 = str;
                                        }
                                        sb2 = sb;
                                        i16++;
                                        str2 = str;
                                    }
                                }
                                String str4 = str2;
                                SpannableStringBuilder spannableStringBuilderCaptionOf = captionOf(pageBlock);
                                if (spannableStringBuilderCaptionOf != null && spannableStringBuilderCaptionOf.length() > 0) {
                                    sb2.append(str4);
                                    appendInline(sb2, spannableStringBuilderCaptionOf);
                                    sb2.append("</figcaption>");
                                }
                                sb2.append("</div>");
                            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                                SpannableStringBuilder spannableStringBuilderCaptionOf2 = captionOf(pageblockmap);
                                boolean z2 = spannableStringBuilderCaptionOf2 != null && spannableStringBuilderCaptionOf2.length() > 0;
                                if (z2) {
                                    sb2.append("<figure>");
                                }
                                sb2.append("<location");
                                if (pageblockmap.geo != null) {
                                    sb2.append(" lat=\"");
                                    sb2.append(pageblockmap.geo.lat);
                                    sb2.append('\"');
                                    sb2.append(" long=\"");
                                    sb2.append(pageblockmap.geo._long);
                                    sb2.append('\"');
                                    if (pageblockmap.geo.access_hash != 0) {
                                        sb2.append(" access=\"");
                                        sb2.append(pageblockmap.geo.access_hash);
                                        sb2.append('\"');
                                    }
                                }
                                if (pageblockmap.zoom != 0) {
                                    sb2.append(" zoom=\"");
                                    sb2.append(pageblockmap.zoom);
                                    sb2.append('\"');
                                }
                                if (pageblockmap.w != 0) {
                                    sb2.append(" w=\"");
                                    sb2.append(pageblockmap.w);
                                    sb2.append('\"');
                                }
                                if (pageblockmap.h != 0) {
                                    sb2.append(" h=\"");
                                    sb2.append(pageblockmap.h);
                                    sb2.append('\"');
                                }
                                sb2.append(" />");
                                if (z2) {
                                    sb2.append("<figcaption>");
                                    appendInline(sb2, spannableStringBuilderCaptionOf2);
                                    sb2.append("</figcaption></figure>");
                                }
                            } else {
                                String strBlockTag = blockTag(pageBlock);
                                if (strBlockTag == null) {
                                    SpannableStringBuilder spannableStringBuilderCaptionOf3 = captionOf(pageBlock);
                                    if (spannableStringBuilderCaptionOf3 != null && spannableStringBuilderCaptionOf3.length() > 0) {
                                        sb2.append("<p>");
                                        appendInline(sb2, spannableStringBuilderCaptionOf3);
                                        sb2.append("</p>");
                                    }
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    String str5 = ((TL_iv.pageBlockPreformatted) pageBlock).language;
                                    if (TextUtils.isEmpty(str5)) {
                                        sb2.append("<pre>");
                                    } else {
                                        sb2.append("<pre language=\"");
                                        sb2.append(escapeAttr(str5));
                                        sb2.append("\">");
                                    }
                                    appendInline(sb2, slicedStyled(blockRow, i14, i2, i3, i4, i5));
                                    sb2.append("</pre>");
                                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                                    sb2.append("<blockquote class=\"pull\">");
                                    SpannableStringBuilder spannableStringBuilder2 = null;
                                    appendInline(sb2, slicedStyled(blockRow, i14, i2, i3, i4, i5));
                                    TL_iv.RichText richText2 = ((TL_iv.pageBlockPullquote) pageBlock).caption;
                                    if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty)) {
                                        SpannableStringBuilder spannable2 = RichTextStyle.toSpannable(richText2, null);
                                        if (spannable2.length() > 0) {
                                            spannableStringBuilder2 = spannable2;
                                        }
                                    }
                                    if (spannableStringBuilder2 != null && spannableStringBuilder2.length() != 0) {
                                        sb2.append("<cite>");
                                        appendInline(sb2, spannableStringBuilder2);
                                        sb2.append("</cite>");
                                    }
                                    sb2.append("</blockquote>");
                                } else {
                                    SpannableStringBuilder spannableStringBuilder3 = null;
                                    if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                                        if (pageblockblockquote.collapsed) {
                                            sb2.append("<blockquote collapsed>");
                                        } else {
                                            sb2.append("<blockquote>");
                                        }
                                        appendInline(sb2, slicedStyled(blockRow, i14, i2, i3, i4, i5));
                                        TL_iv.RichText richText3 = pageblockblockquote.caption;
                                        if (richText3 != null && !(richText3 instanceof TL_iv.textEmpty)) {
                                            SpannableStringBuilder spannable3 = RichTextStyle.toSpannable(richText3, null);
                                            if (spannable3.length() > 0) {
                                                spannableStringBuilder3 = spannable3;
                                            }
                                        }
                                        if (spannableStringBuilder3 != null && spannableStringBuilder3.length() != 0) {
                                            sb2.append("<cite>");
                                            appendInline(sb2, spannableStringBuilder3);
                                            sb2.append("</cite>");
                                        }
                                        sb2.append("</blockquote>");
                                    } else {
                                        sb2.append('<');
                                        sb2.append(strBlockTag);
                                        sb2.append('>');
                                        appendInline(sb2, slicedStyled(blockRow, i14, i2, i3, i4, i5));
                                        sb2.append("</");
                                        sb2.append(strBlockTag);
                                        sb2.append('>');
                                    }
                                }
                            }
                        }
                        iArr[0] = iArr[0] + 1;
                    }
                    iArr[0] = iArr[0] + 1;
                } else {
                    int i17 = blockRow.level;
                    boolean z3 = blockRow.num > 0;
                    while (true) {
                        arrayList3 = (ArrayList) anonymousClass49.this$0;
                        String str6 = "</ul>";
                        if (arrayList3.size() <= i17) {
                            break;
                        }
                        if (((Boolean) DiffUtil.m(arrayList3)).booleanValue()) {
                            str6 = "</ol>";
                        }
                        sb2.append(str6);
                    }
                    while (true) {
                        String str7 = "<ul>";
                        if (arrayList3.size() >= i17) {
                            break;
                        }
                        if (z3) {
                            str7 = "<ol>";
                        }
                        sb2.append(str7);
                        arrayList3.add(Boolean.valueOf(z3));
                    }
                    if (!arrayList3.isEmpty() && ((Boolean) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList3)).booleanValue() != z3) {
                        sb2.append(((Boolean) arrayList3.remove(arrayList3.size() - 1)).booleanValue() ? "</ol>" : "</ul>");
                        sb2.append(z3 ? "<ol>" : "<ul>");
                        arrayList3.add(Boolean.valueOf(z3));
                    }
                    sb2.append("<li>");
                    appendInline(sb2, slicedStyled(blockRow, iArr[0], i2, i3, i4, i5));
                    sb2.append("</li>");
                    iArr[0] = iArr[0] + 1;
                }
            }
            arrayList4 = arrayList2;
            i8 = i7;
        }
    }

    public static void serializeSingleMedia(StringBuilder sb, String str, long j, MediaUploadState mediaUploadState, TL_iv.PageBlock pageBlock) {
        if (j == 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilderCaptionOf = captionOf(pageBlock);
        boolean z = spannableStringBuilderCaptionOf != null && spannableStringBuilderCaptionOf.length() > 0;
        if (z) {
            sb.append("<figure>");
        }
        appendMediaTag(sb, str, j, mediaUploadState, pageBlock);
        if (z) {
            sb.append("<figcaption>");
            appendInline(sb, spannableStringBuilderCaptionOf);
            sb.append("</figcaption></figure>");
        }
    }

    public static void serializeTable(StringBuilder sb, TL_iv.pageBlockTable pageblocktable) {
        ArrayList<TL_iv.pageTableCell> arrayList;
        String str;
        String str2;
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
        SpannableStringBuilder spannable = richText != null ? RichTextStyle.toSpannable(richText, null) : null;
        if (spannable != null && spannable.length() > 0) {
            sb.append("<caption>");
            appendInline(sb, spannable);
            sb.append("</caption>");
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i);
                i++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                sb.append("<tr>");
                if (pagetablerow2 != null && (arrayList = pagetablerow2.cells) != null) {
                    int size2 = arrayList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        TL_iv.pageTableCell pagetablecell = arrayList.get(i2);
                        i2++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null) {
                            String str3 = pagetablecell2.header ? "th" : "td";
                            sb.append('<');
                            sb.append(str3);
                            int i3 = pagetablecell2.colspan;
                            if (i3 <= 1) {
                                i3 = 0;
                            }
                            if (i3 > 0) {
                                sb.append(" colspan=\"");
                                sb.append(i3);
                                sb.append('\"');
                            }
                            int i4 = pagetablecell2.rowspan;
                            if (i4 <= 1) {
                                i4 = 0;
                            }
                            if (i4 > 0) {
                                sb.append(" rowspan=\"");
                                sb.append(i4);
                                sb.append('\"');
                            }
                            if (pagetablecell2.align_right) {
                                str = "right";
                            } else {
                                str = pagetablecell2.align_center ? "center" : null;
                            }
                            if (str != null) {
                                sb.append(" align=\"");
                                sb.append(str);
                                sb.append('\"');
                            }
                            if (pagetablecell2.valign_bottom) {
                                str2 = "bottom";
                            } else {
                                str2 = pagetablecell2.valign_middle ? "middle" : null;
                            }
                            if (str2 != null) {
                                sb.append(" valign=\"");
                                sb.append(str2);
                                sb.append('\"');
                            }
                            sb.append('>');
                            TL_iv.RichText richText2 = pagetablecell2.text;
                            appendInline(sb, richText2 == null ? "" : RichTextStyle.toSpannable(richText2, null));
                            sb.append("</");
                            sb.append(str3);
                            sb.append('>');
                        }
                    }
                }
                sb.append("</tr>");
            }
        }
        sb.append("</table>");
    }

    public static void setEmptyCaption(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static CharSequence slicedStyled(BlockRow blockRow, int i, int i2, int i3, int i4, int i5) {
        CharSequence spannable = RichEditorListView.isDetailsHeader(blockRow) ? RichTextStyle.toSpannable(((TL_iv.pageBlockDetails) blockRow.block).title, null) : RichTextCell.readStyledText(blockRow.block);
        if (spannable == null) {
            spannable = "";
        }
        int length = spannable.length();
        int iMax = i == i2 ? Math.max(0, Math.min(i4, length)) : 0;
        int iMax2 = i == i3 ? Math.max(0, Math.min(i5, length)) : length;
        if (iMax > iMax2) {
            int i6 = iMax;
            iMax = iMax2;
            iMax2 = i6;
        }
        return (iMax == 0 && iMax2 == length) ? spannable : spannable.subSequence(iMax, iMax2);
    }

    public static CharSequence trim(SpannableStringBuilder spannableStringBuilder) {
        char cCharAt;
        int length = spannableStringBuilder.length();
        int i = 0;
        while (i < length && ((cCharAt = spannableStringBuilder.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\t' || cCharAt == '\r')) {
            i++;
        }
        while (length > i) {
            char cCharAt2 = spannableStringBuilder.charAt(length - 1);
            if (cCharAt2 != ' ' && cCharAt2 != '\n' && cCharAt2 != '\t' && cCharAt2 != '\r') {
                break;
            }
            length--;
        }
        return (i == 0 && length == spannableStringBuilder.length()) ? spannableStringBuilder : spannableStringBuilder.subSequence(i, length);
    }
}
