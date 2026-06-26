package org.telegram.ui.iv;

import android.graphics.Paint;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.FormattedDateSpan;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanReplacement;

public abstract class RichTextStyle {
    private static final int[] STYLE_FLAGS = {1, 2, 16, 8, 4, 256, 16384, 32768};

    public static CharSequence toSpannable(TL_iv.RichText richText) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        append(spannableStringBuilder, richText, 0);
        return spannableStringBuilder;
    }

    private static void append(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return;
        }
        if (richText instanceof TL_iv.textConcat) {
            Iterator<TL_iv.RichText> it = ((TL_iv.textConcat) richText).texts.iterator();
            while (it.hasNext()) {
                append(spannableStringBuilder, it.next(), i);
            }
            return;
        }
        if (richText instanceof TL_iv.textPlain) {
            appendLeaf(spannableStringBuilder, ((TL_iv.textPlain) richText).text, i);
            return;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
            String str = textcustomemoji.alt;
            CharSequence charSequence = (str == null || str.isEmpty()) ? "😀" : textcustomemoji.alt;
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence);
            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(textcustomemoji.document_id, (Paint.FontMetricsInt) null);
            animatedEmojiSpan.cacheType = AnimatedEmojiDrawable.getCacheTypeForEnterView();
            spannableStringBuilder.setSpan(animatedEmojiSpan, length, spannableStringBuilder.length(), 33);
            if (i != 0) {
                spannableStringBuilder.setSpan(spanFor(i), length, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
            int length2 = spannableStringBuilder.length();
            append(spannableStringBuilder, texturl.text, i);
            if (spannableStringBuilder.length() <= length2 || texturl.url == null) {
                return;
            }
            spannableStringBuilder.setSpan(new URLSpanReplacement(texturl.url), length2, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textDate) {
            TL_iv.textDate textdate = (TL_iv.textDate) richText;
            int length3 = spannableStringBuilder.length();
            append(spannableStringBuilder, textdate.text, i);
            if (spannableStringBuilder.length() > length3) {
                spannableStringBuilder.setSpan(dateSpan(textdate, spannableStringBuilder.subSequence(length3, spannableStringBuilder.length()).toString()), length3, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText;
            int length4 = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            Object objCreate = MathSpan.create(textmath.source, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText), AndroidUtilities.dp(SharedConfig.fontSize + 4));
            if (objCreate != null) {
                spannableStringBuilder.setSpan(objCreate, length4, spannableStringBuilder.length(), 33);
            } else {
                int length5 = spannableStringBuilder.length();
                CharSequence charSequence2 = textmath.source;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                spannableStringBuilder.replace(length4, length5, charSequence2);
            }
            if (spannableStringBuilder.length() <= length4 || i == 0) {
                return;
            }
            spannableStringBuilder.setSpan(spanFor(i), length4, spannableStringBuilder.length(), 33);
            return;
        }
        int iFlagOf = flagOf(richText);
        if (iFlagOf != 0) {
            append(spannableStringBuilder, richText.text, i | iFlagOf);
        } else {
            appendLeaf(spannableStringBuilder, plainOf(richText), i);
        }
    }

    private static void appendLeaf(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        if (str == null || str.isEmpty()) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        if (i != 0) {
            spannableStringBuilder.setSpan(spanFor(i), length, spannableStringBuilder.length(), 33);
        }
    }

    private static int flagOf(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textBold) {
            return 1;
        }
        if (richText instanceof TL_iv.textItalic) {
            return 2;
        }
        if (richText instanceof TL_iv.textUnderline) {
            return 16;
        }
        if (richText instanceof TL_iv.textStrike) {
            return 8;
        }
        if (richText instanceof TL_iv.textFixed) {
            return 4;
        }
        if (richText instanceof TL_iv.textSpoiler) {
            return 256;
        }
        if (richText instanceof TL_iv.textSubscript) {
            return 16384;
        }
        return richText instanceof TL_iv.textSuperscript ? 32768 : 0;
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
        if (richText instanceof TL_iv.textConcat) {
            StringBuilder sb = new StringBuilder();
            Iterator<TL_iv.RichText> it = ((TL_iv.textConcat) richText).texts.iterator();
            while (it.hasNext()) {
                sb.append(plainOf(it.next()));
            }
            return sb.toString();
        }
        return plainOf(richText.text);
    }

    private static FormattedDateSpan dateSpan(TL_iv.textDate textdate, String str) {
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
        tL_messageEntityFormattedDate.flags = textdate.flags;
        tL_messageEntityFormattedDate.date = textdate.date;
        tL_messageEntityFormattedDate.applyFlags();
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 128;
        return new FormattedDateSpan(str, textStyleRun, tL_messageEntityFormattedDate);
    }

    public static TL_iv.RichText fromSpannable(CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return new TL_iv.textEmpty();
        }
        if (!(charSequence instanceof Spanned)) {
            return plainNode(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
        Run run = null;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int iNextSpanTransition = spanned.nextSpanTransition(i, length, CharacterStyle.class);
            Run runRunAt = runAt(spanned, i, iNextSpanTransition);
            if (run == null) {
                run = runRunAt;
            } else if (!run.equals(runRunAt)) {
                arrayList.add(wrap(charSequence.subSequence(i2, i).toString(), run));
                i2 = i;
                run = runRunAt;
            }
            i = iNextSpanTransition;
        }
        String string = charSequence.subSequence(i2, length).toString();
        if (run == null) {
            run = new Run();
        }
        arrayList.add(wrap(string, run));
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        textconcat.texts = arrayList;
        return textconcat;
    }

    private static TL_iv.RichText wrap(String str, Run run) {
        if (run.mathSource != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = run.mathSource;
            return textmath;
        }
        long j = run.emojiDocId;
        TL_iv.RichText richTextCustomEmojiNode = j != 0 ? customEmojiNode(j, str) : plainNode(str);
        int i = run.flags;
        if ((i & 1) != 0) {
            richTextCustomEmojiNode = wrapOne(new TL_iv.textBold(), richTextCustomEmojiNode);
        }
        if ((i & 2) != 0) {
            richTextCustomEmojiNode = wrapOne(new TL_iv.textItalic(), richTextCustomEmojiNode);
        }
        if ((i & 16) != 0) {
            richTextCustomEmojiNode = wrapOne(new TL_iv.textUnderline(), richTextCustomEmojiNode);
        }
        if ((i & 8) != 0) {
            richTextCustomEmojiNode = wrapOne(new TL_iv.textStrike(), richTextCustomEmojiNode);
        }
        if ((i & 4) != 0) {
            richTextCustomEmojiNode = wrapOne(new TL_iv.textFixed(), richTextCustomEmojiNode);
        }
        if ((i & 256) != 0) {
            richTextCustomEmojiNode = wrapOne(new TL_iv.textSpoiler(), richTextCustomEmojiNode);
        }
        if ((i & 16384) != 0) {
            richTextCustomEmojiNode = wrapOne(new TL_iv.textSubscript(), richTextCustomEmojiNode);
        }
        if ((i & 32768) != 0) {
            richTextCustomEmojiNode = wrapOne(new TL_iv.textSuperscript(), richTextCustomEmojiNode);
        }
        if (run.url != null) {
            TL_iv.textUrl texturl = new TL_iv.textUrl();
            texturl.text = richTextCustomEmojiNode;
            texturl.url = run.url;
            richTextCustomEmojiNode = texturl;
        }
        FormattedDateSpan formattedDateSpan = run.date;
        return formattedDateSpan != null ? dateNode(formattedDateSpan, richTextCustomEmojiNode) : richTextCustomEmojiNode;
    }

    private static TL_iv.RichText dateNode(FormattedDateSpan formattedDateSpan, TL_iv.RichText richText) {
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = formattedDateSpan.entity;
        TL_iv.textDate textdate = new TL_iv.textDate();
        textdate.text = richText;
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

    private static TL_iv.textPlain plainNode(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        return textplain;
    }

    private static TL_iv.textCustomEmoji customEmojiNode(long j, String str) {
        TL_iv.textCustomEmoji textcustomemoji = new TL_iv.textCustomEmoji();
        textcustomemoji.document_id = j;
        if (str == null) {
            str = "";
        }
        textcustomemoji.alt = str;
        return textcustomemoji;
    }

    private static TL_iv.RichText wrapOne(TL_iv.RichText richText, TL_iv.RichText richText2) {
        richText.text = richText2;
        return richText;
    }

    public static boolean hasStyle(CharSequence charSequence, int i, int i2, int i3) {
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

    public static boolean hasLink(CharSequence charSequence, int i, int i2) {
        int length = charSequence == null ? 0 : charSequence.length();
        int iMax = Math.max(0, Math.min(i, length));
        int iMax2 = Math.max(0, Math.min(i2, length));
        if (iMax >= iMax2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (iMax < iMax2) {
            int iNextSpanTransition = spanned.nextSpanTransition(iMax, iMax2, URLSpanReplacement.class);
            if (((URLSpanReplacement[]) spanned.getSpans(iMax, iNextSpanTransition, URLSpanReplacement.class)).length == 0) {
                return false;
            }
            iMax = iNextSpanTransition;
        }
        return true;
    }

    public static boolean hasDate(CharSequence charSequence, int i, int i2) {
        int length = charSequence == null ? 0 : charSequence.length();
        int iMax = Math.max(0, Math.min(i, length));
        int iMax2 = Math.max(0, Math.min(i2, length));
        if (iMax >= iMax2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (iMax < iMax2) {
            int iNextSpanTransition = spanned.nextSpanTransition(iMax, iMax2, FormattedDateSpan.class);
            if (((FormattedDateSpan[]) spanned.getSpans(iMax, iNextSpanTransition, FormattedDateSpan.class)).length == 0) {
                return false;
            }
            iMax = iNextSpanTransition;
        }
        return true;
    }

    public static int stylesFullyCovering(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        for (int i4 : STYLE_FLAGS) {
            if (hasStyle(charSequence, i, i2, i4)) {
                i3 |= i4;
            }
        }
        return i3;
    }

    public static void setStyle(Spannable spannable, int i, int i2, int i3, boolean z) {
        int length = spannable.length();
        int iMax = Math.max(0, Math.min(i, length));
        int iMax2 = Math.max(0, Math.min(i2, length));
        if (iMax >= iMax2) {
            return;
        }
        for (TextStyleSpan textStyleSpan : (TextStyleSpan[]) spannable.getSpans(iMax, iMax2, TextStyleSpan.class)) {
            int spanStart = spannable.getSpanStart(textStyleSpan);
            int spanEnd = spannable.getSpanEnd(textStyleSpan);
            int styleFlags = textStyleSpan.getStyleFlags();
            spannable.removeSpan(textStyleSpan);
            applyRun(spannable, spanStart, iMax, styleFlags);
            applyRun(spannable, iMax2, spanEnd, styleFlags);
            applyRun(spannable, Math.max(spanStart, iMax), Math.min(spanEnd, iMax2), z ? styleFlags | i3 : (~i3) & styleFlags);
        }
        if (z) {
            while (iMax < iMax2) {
                int iNextSpanTransition = spannable.nextSpanTransition(iMax, iMax2, TextStyleSpan.class);
                if (flagsBetween(spannable, iMax, iNextSpanTransition) == 0) {
                    applyRun(spannable, iMax, iNextSpanTransition, i3);
                }
                iMax = iNextSpanTransition;
            }
        }
    }

    public static void removeLink(Spannable spannable, int i, int i2) {
        int length = spannable.length();
        int iMax = Math.max(0, Math.min(i, length));
        int iMax2 = Math.max(0, Math.min(i2, length));
        if (iMax >= iMax2) {
            return;
        }
        for (URLSpanReplacement uRLSpanReplacement : (URLSpanReplacement[]) spannable.getSpans(iMax, iMax2, URLSpanReplacement.class)) {
            int spanStart = spannable.getSpanStart(uRLSpanReplacement);
            int spanEnd = spannable.getSpanEnd(uRLSpanReplacement);
            spannable.removeSpan(uRLSpanReplacement);
            if (spanStart < iMax) {
                spannable.setSpan(new URLSpanReplacement(uRLSpanReplacement.getURL()), spanStart, iMax, 33);
            }
            if (spanEnd > iMax2) {
                spannable.setSpan(new URLSpanReplacement(uRLSpanReplacement.getURL()), iMax2, spanEnd, 33);
            }
        }
    }

    public static void removeDate(Spannable spannable, int i, int i2) {
        int length = spannable.length();
        int iMax = Math.max(0, Math.min(i, length));
        int iMax2 = Math.max(0, Math.min(i2, length));
        if (iMax >= iMax2) {
            return;
        }
        for (FormattedDateSpan formattedDateSpan : (FormattedDateSpan[]) spannable.getSpans(iMax, iMax2, FormattedDateSpan.class)) {
            spannable.removeSpan(formattedDateSpan);
        }
    }

    private static void applyRun(Spannable spannable, int i, int i2, int i3) {
        if (i >= i2 || i3 == 0) {
            return;
        }
        spannable.setSpan(spanFor(i3), i, i2, 33);
    }

    private static int flagsBetween(Spanned spanned, int i, int i2) {
        TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) spanned.getSpans(i, i2, TextStyleSpan.class);
        int i3 = 0;
        for (TextStyleSpan textStyleSpan : textStyleSpanArr) {
            int styleFlags = textStyleSpan.getStyleFlags();
            if ((styleFlags & 512) != 0) {
                styleFlags |= 256;
            }
            i3 |= styleFlags;
        }
        return 49439 & i3;
    }

    private static Run runAt(Spanned spanned, int i, int i2) {
        Run run = new Run();
        run.flags = flagsBetween(spanned, i, i2);
        URLSpanReplacement[] uRLSpanReplacementArr = (URLSpanReplacement[]) spanned.getSpans(i, i2, URLSpanReplacement.class);
        if (uRLSpanReplacementArr.length > 0) {
            run.url = uRLSpanReplacementArr[0].getURL();
        }
        FormattedDateSpan[] formattedDateSpanArr = (FormattedDateSpan[]) spanned.getSpans(i, i2, FormattedDateSpan.class);
        if (formattedDateSpanArr.length > 0) {
            run.date = formattedDateSpanArr[0];
        }
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i, i2, AnimatedEmojiSpan.class);
        if (animatedEmojiSpanArr.length > 0) {
            run.emojiDocId = animatedEmojiSpanArr[0].getDocumentId();
        }
        MathSpan[] mathSpanArr = (MathSpan[]) spanned.getSpans(i, i2, MathSpan.class);
        if (mathSpanArr.length > 0) {
            run.mathSource = mathSpanArr[0].source;
        }
        return run;
    }

    private static TextStyleSpan spanFor(int i) {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags = i;
        return new TextStyleSpan(textStyleRun, AndroidUtilities.dp(SharedConfig.fontSize));
    }

    private static class Run {
        FormattedDateSpan date;
        long emojiDocId;
        int flags;
        String mathSource;
        String url;

        private Run() {
        }

        boolean equals(Run run) {
            if (this.emojiDocId != 0 || run.emojiDocId != 0 || this.mathSource != null || run.mathSource != null || this.flags != run.flags) {
                return false;
            }
            String str = this.url;
            if (str == null) {
                if (run.url != null) {
                    return false;
                }
            } else if (!str.equals(run.url)) {
                return false;
            }
            return this.date == run.date;
        }
    }
}
