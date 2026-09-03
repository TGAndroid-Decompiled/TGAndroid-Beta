package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class i10 extends URLSpan {
    public static final int e = 0;
    public final String f25554a;
    public final TLRPC.TL_messageEntityFormattedDate f25555b;
    public final s01 f25556c;
    public final boolean d;

    public i10(String str, s01 s01Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f25554a = str;
        this.f25555b = tL_messageEntityFormattedDate;
        this.f25556c = s01Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z4) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            i10[] i10VarArr = (i10[]) spanned.getSpans(0, spanned.length(), i10.class);
            int length = i10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                i10 i10Var = i10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = i10Var.f25555b;
                if (tL_messageEntityFormattedDate.flags != 0 && (i10Var.d != z4 || (z4 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(i10Var);
                    int spanEnd = r42.getSpanEnd(i10Var);
                    if (z4) {
                        str = LocaleController.formatEntityFormattedDate(i10Var.f25555b);
                    } else {
                        str = i10Var.f25554a;
                    }
                    r42.removeSpan(i10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new i10(i10Var, z4), spanStart, str.length() + spanStart, 33);
                }
                i10++;
                r42 = r42;
            }
        }
        return charSequence;
    }

    public static CharSequence e(SpannableStringBuilder spannableStringBuilder) {
        return a(spannableStringBuilder, false);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z4;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        s01 s01Var = this.f25556c;
        if (s01Var != null) {
            s01Var.a(textPaint);
        }
        if (i10 == color) {
            z4 = true;
        } else {
            z4 = false;
        }
        textPaint.setUnderlineText(z4);
    }

    public i10(i10 i10Var, boolean z4) {
        super(i10Var.f25554a);
        this.f25554a = i10Var.f25554a;
        this.f25555b = i10Var.f25555b;
        this.f25556c = i10Var.f25556c;
        this.d = z4;
    }

    @Override
    public final void onClick(View view) {
    }
}
