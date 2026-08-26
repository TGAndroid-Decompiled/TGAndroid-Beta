package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

public final class FormattedDateSpan extends URLSpan {
    public static final int $r8$clinit = 0;
    public final boolean applied;
    public final TLRPC.TL_messageEntityFormattedDate entity;
    public final String originalText;
    public final TextStyleSpan.TextStyleRun style;

    public FormattedDateSpan(String str, TextStyleSpan.TextStyleRun textStyleRun, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.originalText = str;
        this.entity = tL_messageEntityFormattedDate;
        this.style = textStyleRun;
        this.applied = false;
    }

    public static CharSequence rebuildFormatedDateEntities(CharSequence charSequence, boolean z) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i = 0;
            FormattedDateSpan[] formattedDateSpanArr = (FormattedDateSpan[]) spanned.getSpans(0, spanned.length(), FormattedDateSpan.class);
            int length = formattedDateSpanArr.length;
            ?? r4 = 0;
            while (i < length) {
                FormattedDateSpan formattedDateSpan = formattedDateSpanArr[i];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = formattedDateSpan.entity;
                if (tL_messageEntityFormattedDate.flags != 0 && (formattedDateSpan.applied != z || (z && tL_messageEntityFormattedDate.relative))) {
                    if (r4 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r4 = charSequence;
                    }
                    int spanStart = r4.getSpanStart(formattedDateSpan);
                    int spanEnd = r4.getSpanEnd(formattedDateSpan);
                    String entityFormattedDate = z ? LocaleController.formatEntityFormattedDate(formattedDateSpan.entity) : formattedDateSpan.originalText;
                    r4.removeSpan(formattedDateSpan);
                    r4.replace(spanStart, spanEnd, entityFormattedDate);
                    r4.setSpan(new FormattedDateSpan(formattedDateSpan, z), spanStart, entityFormattedDate.length() + spanStart, 33);
                }
                i++;
                r4 = r4;
            }
        }
        return charSequence;
    }

    public static CharSequence restoreFormatedDateEntities(SpannableStringBuilder spannableStringBuilder) {
        return rebuildFormatedDateEntities(spannableStringBuilder, false);
    }

    @Override
    public final void onClick(View view) {
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        TextStyleSpan.TextStyleRun textStyleRun = this.style;
        if (textStyleRun != null) {
            textStyleRun.applyStyle(textPaint);
        }
        textPaint.setUnderlineText(i == color);
    }

    public FormattedDateSpan(FormattedDateSpan formattedDateSpan, boolean z) {
        super(formattedDateSpan.originalText);
        this.originalText = formattedDateSpan.originalText;
        this.entity = formattedDateSpan.entity;
        this.style = formattedDateSpan.style;
        this.applied = z;
    }
}
