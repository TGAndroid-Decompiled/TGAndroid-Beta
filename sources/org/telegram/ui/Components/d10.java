package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class d10 extends URLSpan {
    public static final int f27630e = 0;
    public final String f27631a;
    public final TLRPC.TL_messageEntityFormattedDate f27632b;
    public final h01 f27633c;
    public final boolean d;

    public d10(String str, h01 h01Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f27631a = str;
        this.f27632b = tL_messageEntityFormattedDate;
        this.f27633c = h01Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            d10[] d10VarArr = (d10[]) spanned.getSpans(0, spanned.length(), d10.class);
            int length = d10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                d10 d10Var = d10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = d10Var.f27632b;
                if (tL_messageEntityFormattedDate.flags != 0 && (d10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(d10Var);
                    int spanEnd = r42.getSpanEnd(d10Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(d10Var.f27632b);
                    } else {
                        str = d10Var.f27631a;
                    }
                    r42.removeSpan(d10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new d10(d10Var, z10), spanStart, str.length() + spanStart, 33);
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
        h01 h01Var = this.f27633c;
        if (h01Var != null) {
            h01Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public d10(d10 d10Var, boolean z10) {
        super(d10Var.f27631a);
        this.f27631a = d10Var.f27631a;
        this.f27632b = d10Var.f27632b;
        this.f27633c = d10Var.f27633c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
