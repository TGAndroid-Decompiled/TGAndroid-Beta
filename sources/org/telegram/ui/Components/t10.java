package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class t10 extends URLSpan {
    public static final int e = 0;
    public final String f28946a;
    public final TLRPC.TL_messageEntityFormattedDate f28947b;
    public final q11 f28948c;
    public final boolean d;

    public t10(String str, q11 q11Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f28946a = str;
        this.f28947b = tL_messageEntityFormattedDate;
        this.f28948c = q11Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            t10[] t10VarArr = (t10[]) spanned.getSpans(0, spanned.length(), t10.class);
            int length = t10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                t10 t10Var = t10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = t10Var.f28947b;
                if (tL_messageEntityFormattedDate.flags != 0 && (t10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(t10Var);
                    int spanEnd = r42.getSpanEnd(t10Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(t10Var.f28947b);
                    } else {
                        str = t10Var.f28946a;
                    }
                    r42.removeSpan(t10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new t10(t10Var, z10), spanStart, str.length() + spanStart, 33);
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
        q11 q11Var = this.f28948c;
        if (q11Var != null) {
            q11Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public t10(t10 t10Var, boolean z10) {
        super(t10Var.f28946a);
        this.f28946a = t10Var.f28946a;
        this.f28947b = t10Var.f28947b;
        this.f28948c = t10Var.f28948c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
