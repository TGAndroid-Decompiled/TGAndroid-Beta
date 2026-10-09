package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class x10 extends URLSpan {
    public static final int f32713e = 0;
    public final String f32714a;
    public final TLRPC.TL_messageEntityFormattedDate f32715b;
    public final t11 f32716c;
    public final boolean d;

    public x10(String str, t11 t11Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f32714a = str;
        this.f32715b = tL_messageEntityFormattedDate;
        this.f32716c = t11Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            x10[] x10VarArr = (x10[]) spanned.getSpans(0, spanned.length(), x10.class);
            int length = x10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                x10 x10Var = x10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = x10Var.f32715b;
                if (tL_messageEntityFormattedDate.flags != 0 && (x10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(x10Var);
                    int spanEnd = r42.getSpanEnd(x10Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(x10Var.f32715b);
                    } else {
                        str = x10Var.f32714a;
                    }
                    r42.removeSpan(x10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new x10(x10Var, z10), spanStart, str.length() + spanStart, 33);
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
        t11 t11Var = this.f32716c;
        if (t11Var != null) {
            t11Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public x10(x10 x10Var, boolean z10) {
        super(x10Var.f32714a);
        this.f32714a = x10Var.f32714a;
        this.f32715b = x10Var.f32715b;
        this.f32716c = x10Var.f32716c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
