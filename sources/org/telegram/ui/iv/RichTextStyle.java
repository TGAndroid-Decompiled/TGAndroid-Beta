package org.telegram.ui.iv;

import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.FormattedDateSpan;
import org.telegram.ui.Components.SquigglyLinesSpan;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanReplacement;

public abstract class RichTextStyle {
    public static final int[] STYLE_FLAGS = {1, 2, 16, 8, 4, 256, 16384, 32768, 65536};

    public final class Run {
        public RichInlineButtonSpan button;
        public FormattedDateSpan date;
        public long emojiDocId;
        public int flags;
        public String mathSource;
        public String url;
    }

    public static void append(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i, TL_iv.PageBlock pageBlock, boolean z) {
        String str;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return;
        }
        int i2 = 0;
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            while (i2 < size) {
                TL_iv.RichText richText2 = arrayList.get(i2);
                i2++;
                append(spannableStringBuilder, richText2, i, pageBlock, z);
            }
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean zIsEmpty = isEmpty(textdiff.text);
            boolean zIsEmpty2 = isEmpty(textdiff.old_text);
            int length = spannableStringBuilder.length();
            if (zIsEmpty) {
                append(spannableStringBuilder, textdiff.old_text, i, pageBlock, z);
                if (spannableStringBuilder.length() > length) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags = 8192;
                    spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
            append(spannableStringBuilder, textdiff.text, i, pageBlock, z);
            if (!zIsEmpty2) {
                if (spannableStringBuilder.length() > length) {
                    spannableStringBuilder.setSpan(new SquigglyLinesSpan(), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            } else {
                if (spannableStringBuilder.length() > length) {
                    TextStyleSpan.TextStyleRun textStyleRun2 = new TextStyleSpan.TextStyleRun();
                    textStyleRun2.flags = 4096;
                    spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun2, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
        }
        if (richText instanceof TL_iv.textPlain) {
            String str2 = ((TL_iv.textPlain) richText).text;
            if (str2 == null || str2.isEmpty()) {
                return;
            }
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            if (i != 0) {
                spannableStringBuilder.setSpan(spanFor(i, pageBlock), length2, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
            String str3 = textcustomemoji.alt;
            CharSequence charSequence = (str3 == null || str3.isEmpty()) ? "😀" : textcustomemoji.alt;
            int length3 = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence);
            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(textcustomemoji.document_id, 1.2f, null);
            animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
            spannableStringBuilder.setSpan(animatedEmojiSpan, length3, spannableStringBuilder.length(), 33);
            if (i != 0) {
                spannableStringBuilder.setSpan(spanFor(i, pageBlock), length3, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
            int length4 = spannableStringBuilder.length();
            append(spannableStringBuilder, texturl.text, i, pageBlock, z);
            if (spannableStringBuilder.length() <= length4 || (str = texturl.url) == null) {
                return;
            }
            TextStyleSpan.TextStyleRun textStyleRun3 = new TextStyleSpan.TextStyleRun();
            textStyleRun3.flags = 1024;
            spannableStringBuilder.setSpan(new URLSpanReplacement(str, textStyleRun3), length4, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textDate) {
            TL_iv.textDate textdate = (TL_iv.textDate) richText;
            int length5 = spannableStringBuilder.length();
            append(spannableStringBuilder, textdate.text, i, pageBlock, z);
            if (spannableStringBuilder.length() > length5) {
                String string = spannableStringBuilder.subSequence(length5, spannableStringBuilder.length()).toString();
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.flags = textdate.flags;
                tL_messageEntityFormattedDate.date = textdate.date;
                tL_messageEntityFormattedDate.applyFlags();
                TextStyleSpan.TextStyleRun textStyleRun4 = new TextStyleSpan.TextStyleRun();
                textStyleRun4.flags |= 128;
                spannableStringBuilder.setSpan(new FormattedDateSpan(string, textStyleRun4, tL_messageEntityFormattedDate), length5, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText;
            int length6 = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            Object objCreate = MathSpan.create(textmath.source, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), AndroidUtilities.dp(SharedConfig.fontSize + 4));
            if (objCreate != null) {
                spannableStringBuilder.setSpan(objCreate, length6, spannableStringBuilder.length(), 33);
            } else {
                int length7 = spannableStringBuilder.length();
                CharSequence charSequence2 = textmath.source;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                spannableStringBuilder.replace(length6, length7, charSequence2);
            }
            if (spannableStringBuilder.length() <= length6 || i == 0) {
                return;
            }
            spannableStringBuilder.setSpan(spanFor(i, pageBlock), length6, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textButton) {
            TL_iv.textButton textbutton = (TL_iv.textButton) richText;
            int length8 = spannableStringBuilder.length();
            append(spannableStringBuilder, textbutton.text, i, pageBlock, z);
            if (z && spannableStringBuilder.length() > length8 && RichInlineButtonSpan.isSupported(textbutton.type)) {
                spannableStringBuilder.setSpan(new RichInlineButtonSpan(textbutton), length8, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textBold) {
            i2 = 1;
        } else if (richText instanceof TL_iv.textItalic) {
            i2 = 2;
        } else if (richText instanceof TL_iv.textUnderline) {
            i2 = 16;
        } else if (richText instanceof TL_iv.textStrike) {
            i2 = 8;
        } else if (richText instanceof TL_iv.textFixed) {
            i2 = 4;
        } else if (richText instanceof TL_iv.textSpoiler) {
            i2 = 256;
        } else if (richText instanceof TL_iv.textSubscript) {
            i2 = 16384;
        } else if (richText instanceof TL_iv.textSuperscript) {
            i2 = 32768;
        } else if (richText instanceof TL_iv.textMarked) {
            i2 = 65536;
        }
        if (i2 != 0) {
            append(spannableStringBuilder, richText.text, i | i2, pageBlock, z);
            return;
        }
        String strPlainOf = plainOf(richText);
        if (strPlainOf == null || strPlainOf.isEmpty()) {
            return;
        }
        int length9 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) strPlainOf);
        if (i != 0) {
            spannableStringBuilder.setSpan(spanFor(i, pageBlock), length9, spannableStringBuilder.length(), 33);
        }
    }

    public static int emojiOnlyCount(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned) || charSequence.length() == 0) {
            return 0;
        }
        Spanned spanned = (Spanned) charSequence;
        ArrayList arrayList = new ArrayList();
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(0, charSequence.length(), AnimatedEmojiSpan.class);
        for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
            arrayList.add(animatedEmojiSpan);
        }
        for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spanned.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)) {
            int spanStart = spanned.getSpanStart(emojiSpan);
            int spanEnd = spanned.getSpanEnd(emojiSpan);
            int length = animatedEmojiSpanArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    arrayList.add(emojiSpan);
                    break;
                }
                AnimatedEmojiSpan animatedEmojiSpan2 = animatedEmojiSpanArr[i];
                if (spanned.getSpanStart(animatedEmojiSpan2) == spanStart && spanned.getSpanEnd(animatedEmojiSpan2) == spanEnd) {
                    break;
                }
                i++;
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (spanned.getSpanStart(obj) <= i2 && spanned.getSpanEnd(obj) > i2) {
                }
            }
            return 0;
        }
        return arrayList.size();
    }

    public static int flagsBetween(Spanned spanned, int i, int i2) {
        TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) spanned.getSpans(i, i2, TextStyleSpan.class);
        int i3 = 0;
        for (TextStyleSpan textStyleSpan : textStyleSpanArr) {
            int i4 = textStyleSpan.style.flags;
            if ((i4 & 512) != 0) {
                i4 |= 256;
            }
            i3 |= i4;
        }
        return 114975 & i3;
    }

    public static org.telegram.tgnet.tl.TL_iv.RichText fromSpannable(java.lang.CharSequence r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iv.RichTextStyle.fromSpannable(java.lang.CharSequence):org.telegram.tgnet.tl.TL_iv$RichText");
    }

    public static boolean hasDate(Editable editable, int i, int i2) {
        int length = editable == null ? 0 : editable.length();
        int iMax = Math.max(0, Math.min(i, length));
        int iMax2 = Math.max(0, Math.min(i2, length));
        if (iMax < iMax2 && editable != null) {
            while (iMax < iMax2) {
                int iNextSpanTransition = editable.nextSpanTransition(iMax, iMax2, FormattedDateSpan.class);
                if (((FormattedDateSpan[]) editable.getSpans(iMax, iNextSpanTransition, FormattedDateSpan.class)).length != 0) {
                    iMax = iNextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean hasLink(Editable editable, int i, int i2) {
        int length = editable == null ? 0 : editable.length();
        int iMax = Math.max(0, Math.min(i, length));
        int iMax2 = Math.max(0, Math.min(i2, length));
        if (iMax < iMax2 && editable != null) {
            while (iMax < iMax2) {
                int iNextSpanTransition = editable.nextSpanTransition(iMax, iMax2, URLSpanReplacement.class);
                if (((URLSpanReplacement[]) editable.getSpans(iMax, iNextSpanTransition, URLSpanReplacement.class)).length != 0) {
                    iMax = iNextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean hasStyle(int i, int i2, int i3, CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        int iMax = Math.max(0, Math.min(i, length));
        int iMax2 = Math.max(0, Math.min(i2, length));
        if (iMax >= iMax2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (iMax < iMax2) {
            int iNextSpanTransition = spanned.nextSpanTransition(iMax, iMax2, TextStyleSpan.class);
            if ((flagsBetween(spanned, iMax, iNextSpanTransition) & i3) == 0) {
                return false;
            }
            iMax = iNextSpanTransition;
        }
        return true;
    }

    public static boolean isEmpty(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return true;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            return str == null || str.isEmpty();
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            return false;
        }
        if (richText instanceof TL_iv.textMath) {
            String str2 = ((TL_iv.textMath) richText).source;
            return str2 == null || str2.isEmpty();
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (!(richText instanceof TL_iv.textDiff)) {
                return isEmpty(richText.text);
            }
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            return isEmpty(textdiff.text) && isEmpty(textdiff.old_text);
        }
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_iv.RichText richText2 = arrayList.get(i);
            i++;
            if (!isEmpty(richText2)) {
                return false;
            }
        }
        return true;
    }

    public static String plainOf(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return "";
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            return str == null ? "" : str;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            String str2 = ((TL_iv.textCustomEmoji) richText).alt;
            return str2 == null ? "" : str2;
        }
        if (richText instanceof TL_iv.textMath) {
            return " ";
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (!(richText instanceof TL_iv.textDiff)) {
                return plainOf(richText.text);
            }
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            return isEmpty(textdiff.text) ? plainOf(textdiff.old_text) : plainOf(textdiff.text);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_iv.RichText richText2 = arrayList.get(i);
            i++;
            sb.append(plainOf(richText2));
        }
        return sb.toString();
    }

    public static void removeDate(Editable editable, int i, int i2) {
        int length = editable.length();
        int iMax = Math.max(0, Math.min(i, length));
        int iMax2 = Math.max(0, Math.min(i2, length));
        if (iMax >= iMax2) {
            return;
        }
        for (FormattedDateSpan formattedDateSpan : (FormattedDateSpan[]) editable.getSpans(iMax, iMax2, FormattedDateSpan.class)) {
            editable.removeSpan(formattedDateSpan);
        }
    }

    public static void removeLink(Editable editable, int i, int i2) {
        int length = editable.length();
        int iMax = Math.max(0, Math.min(i, length));
        int iMax2 = Math.max(0, Math.min(i2, length));
        if (iMax >= iMax2) {
            return;
        }
        for (URLSpanReplacement uRLSpanReplacement : (URLSpanReplacement[]) editable.getSpans(iMax, iMax2, URLSpanReplacement.class)) {
            int spanStart = editable.getSpanStart(uRLSpanReplacement);
            int spanEnd = editable.getSpanEnd(uRLSpanReplacement);
            editable.removeSpan(uRLSpanReplacement);
            if (spanStart < iMax) {
                String url = uRLSpanReplacement.getURL();
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags = 1024;
                editable.setSpan(new URLSpanReplacement(url, textStyleRun), spanStart, iMax, 33);
            }
            if (spanEnd > iMax2) {
                String url2 = uRLSpanReplacement.getURL();
                TextStyleSpan.TextStyleRun textStyleRun2 = new TextStyleSpan.TextStyleRun();
                textStyleRun2.flags = 1024;
                editable.setSpan(new URLSpanReplacement(url2, textStyleRun2), iMax2, spanEnd, 33);
            }
        }
    }

    public static void setStyle(Spannable spannable, int i, int i2, int i3, boolean z, TL_iv.PageBlock pageBlock) {
        int length = spannable.length();
        int iMax = Math.max(0, Math.min(i, length));
        int iMax2 = Math.max(0, Math.min(i2, length));
        if (iMax >= iMax2) {
            return;
        }
        for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) spannable.getSpans(iMax, iMax2, TextStyleSpan.class)) {
            int spanStart = spannable.getSpanStart(textStyleSpan);
            int spanEnd = spannable.getSpanEnd(textStyleSpan);
            int i4 = textStyleSpan.style.flags;
            spannable.removeSpan(textStyleSpan);
            if (spanStart < iMax && i4 != 0) {
                spannable.setSpan(spanFor(i4, pageBlock), spanStart, iMax, 33);
            }
            if (iMax2 < spanEnd && i4 != 0) {
                spannable.setSpan(spanFor(i4, pageBlock), iMax2, spanEnd, 33);
            }
            int iMax3 = Math.max(spanStart, iMax);
            int iMin = Math.min(spanEnd, iMax2);
            int i5 = z ? i4 | i3 : (~i3) & i4;
            if (iMax3 < iMin && i5 != 0) {
                spannable.setSpan(spanFor(i5, pageBlock), iMax3, iMin, 33);
            }
        }
        if (z) {
            while (iMax < iMax2) {
                int iNextSpanTransition = spannable.nextSpanTransition(iMax, iMax2, TextStyleSpan.class);
                if (flagsBetween(spannable, iMax, iNextSpanTransition) == 0 && iMax < iNextSpanTransition && i3 != 0) {
                    spannable.setSpan(spanFor(i3, pageBlock), iMax, iNextSpanTransition, 33);
                }
                iMax = iNextSpanTransition;
            }
        }
    }

    public static TextStyleSpan spanFor(int i, TL_iv.PageBlock pageBlock) {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags = i;
        textStyleRun.header = (pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        return new TextStyleSpan(textStyleRun, 0);
    }

    public static int stylesFullyCovering(int i, int i2, CharSequence charSequence) {
        int[] iArr = STYLE_FLAGS;
        int i3 = 0;
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = iArr[i4];
            if (hasStyle(i, i2, i5, charSequence)) {
                i3 |= i5;
            }
        }
        return i3;
    }

    public static SpannableStringBuilder toSpannable(TL_iv.RichText richText, TL_iv.PageBlock pageBlock) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        append(spannableStringBuilder, richText, 0, pageBlock, true);
        return spannableStringBuilder;
    }

    public static TL_iv.RichText wrap(String str, Run run) {
        TL_iv.RichText richText;
        RichInlineButtonSpan richInlineButtonSpan = run.button;
        if (richInlineButtonSpan != null) {
            return richInlineButtonSpan.button;
        }
        if (run.mathSource != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = run.mathSource;
            return textmath;
        }
        long j = run.emojiDocId;
        if (j != 0) {
            TL_iv.textCustomEmoji textcustomemoji = new TL_iv.textCustomEmoji();
            textcustomemoji.document_id = j;
            if (str == null) {
                str = "";
            }
            textcustomemoji.alt = str;
            richText = textcustomemoji;
        } else {
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = str;
            richText = textplain;
        }
        int i = run.flags;
        TL_iv.RichText richText2 = richText;
        if ((i & 1) != 0) {
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = richText;
            richText2 = textbold;
        }
        TL_iv.RichText richText3 = richText2;
        if ((i & 2) != 0) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = richText2;
            richText3 = textitalic;
        }
        TL_iv.RichText richText4 = richText3;
        if ((i & 16) != 0) {
            TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
            textunderline.text = richText3;
            richText4 = textunderline;
        }
        TL_iv.RichText richText5 = richText4;
        if ((i & 8) != 0) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = richText4;
            richText5 = textstrike;
        }
        TL_iv.RichText richText6 = richText5;
        if ((i & 4) != 0) {
            TL_iv.textFixed textfixed = new TL_iv.textFixed();
            textfixed.text = richText5;
            richText6 = textfixed;
        }
        TL_iv.RichText richText7 = richText6;
        if ((i & 256) != 0) {
            TL_iv.textSpoiler textspoiler = new TL_iv.textSpoiler();
            textspoiler.text = richText6;
            richText7 = textspoiler;
        }
        TL_iv.RichText richText8 = richText7;
        if ((i & 16384) != 0) {
            TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
            textsubscript.text = richText7;
            richText8 = textsubscript;
        }
        TL_iv.RichText richText9 = richText8;
        if ((32768 & i) != 0) {
            TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = richText8;
            richText9 = textsuperscript;
        }
        TL_iv.RichText richText10 = richText9;
        if ((i & 65536) != 0) {
            TL_iv.textMarked textmarked = new TL_iv.textMarked();
            textmarked.text = richText9;
            richText10 = textmarked;
        }
        TL_iv.RichText richText11 = richText10;
        if (run.url != null) {
            TL_iv.textUrl texturl = new TL_iv.textUrl();
            texturl.text = richText10;
            texturl.url = run.url;
            richText11 = texturl;
        }
        FormattedDateSpan formattedDateSpan = run.date;
        if (formattedDateSpan == null) {
            return richText11;
        }
        TL_iv.textDate textdate = new TL_iv.textDate();
        textdate.text = richText11;
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = formattedDateSpan.entity;
        textdate.flags = tL_messageEntityFormattedDate.flags;
        textdate.relative = tL_messageEntityFormattedDate.relative;
        textdate.short_time = tL_messageEntityFormattedDate.short_time;
        textdate.long_time = tL_messageEntityFormattedDate.long_time;
        textdate.short_date = tL_messageEntityFormattedDate.short_date;
        textdate.long_date = tL_messageEntityFormattedDate.long_date;
        textdate.day_of_week = tL_messageEntityFormattedDate.day_of_week;
        textdate.date = tL_messageEntityFormattedDate.date;
        return textdate;
    }
}
