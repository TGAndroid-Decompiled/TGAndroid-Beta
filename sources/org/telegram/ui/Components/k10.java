package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class k10 extends URLSpan {
    public static final int f27940e = 0;
    public final String f27941a;
    public final TLRPC.TL_messageEntityFormattedDate f27942b;
    public final m11 f27943c;
    public final boolean d;

    public k10(String str, m11 m11Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f27941a = str;
        this.f27942b = tL_messageEntityFormattedDate;
        this.f27943c = m11Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            k10[] k10VarArr = (k10[]) spanned.getSpans(0, spanned.length(), k10.class);
            int length = k10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                k10 k10Var = k10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = k10Var.f27942b;
                if (tL_messageEntityFormattedDate.flags != 0 && (k10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(k10Var);
                    int spanEnd = r42.getSpanEnd(k10Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(k10Var.f27942b);
                    } else {
                        str = k10Var.f27941a;
                    }
                    r42.removeSpan(k10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new k10(k10Var, z10), spanStart, str.length() + spanStart, 33);
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
        m11 m11Var = this.f27943c;
        if (m11Var != null) {
            m11Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public k10(k10 k10Var, boolean z10) {
        super(k10Var.f27941a);
        this.f27941a = k10Var.f27941a;
        this.f27942b = k10Var.f27942b;
        this.f27943c = k10Var.f27943c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
