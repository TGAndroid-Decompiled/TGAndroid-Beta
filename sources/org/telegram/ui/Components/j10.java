package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class j10 extends URLSpan {
    public static final int e = 0;
    public final String f25263a;
    public final TLRPC.TL_messageEntityFormattedDate f25264b;
    public final d11 f25265c;
    public final boolean d;

    public j10(String str, d11 d11Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f25263a = str;
        this.f25264b = tL_messageEntityFormattedDate;
        this.f25265c = d11Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            j10[] j10VarArr = (j10[]) spanned.getSpans(0, spanned.length(), j10.class);
            int length = j10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                j10 j10Var = j10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = j10Var.f25264b;
                if (tL_messageEntityFormattedDate.flags != 0 && (j10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(j10Var);
                    int spanEnd = r42.getSpanEnd(j10Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(j10Var.f25264b);
                    } else {
                        str = j10Var.f25263a;
                    }
                    r42.removeSpan(j10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new j10(j10Var, z10), spanStart, str.length() + spanStart, 33);
                }
                i10++;
                r42 = r42;
            }
        }
        return charSequence;
    }

    public static CharSequence b(SpannableStringBuilder spannableStringBuilder) {
        return a(spannableStringBuilder, false);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        d11 d11Var = this.f25265c;
        if (d11Var != null) {
            d11Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public j10(j10 j10Var, boolean z10) {
        super(j10Var.f25263a);
        this.f25263a = j10Var.f25263a;
        this.f25264b = j10Var.f25264b;
        this.f25265c = j10Var.f25265c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
