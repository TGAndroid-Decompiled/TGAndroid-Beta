package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class y10 extends URLSpan {
    public static final int f33067e = 0;
    public final String f33068a;
    public final TLRPC.TL_messageEntityFormattedDate f33069b;
    public final v11 f33070c;
    public final boolean d;

    public y10(String str, v11 v11Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f33068a = str;
        this.f33069b = tL_messageEntityFormattedDate;
        this.f33070c = v11Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            y10[] y10VarArr = (y10[]) spanned.getSpans(0, spanned.length(), y10.class);
            int length = y10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                y10 y10Var = y10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = y10Var.f33069b;
                if (tL_messageEntityFormattedDate.flags != 0 && (y10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(y10Var);
                    int spanEnd = r42.getSpanEnd(y10Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(y10Var.f33069b);
                    } else {
                        str = y10Var.f33068a;
                    }
                    r42.removeSpan(y10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new y10(y10Var, z10), spanStart, str.length() + spanStart, 33);
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
        v11 v11Var = this.f33070c;
        if (v11Var != null) {
            v11Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public y10(y10 y10Var, boolean z10) {
        super(y10Var.f33068a);
        this.f33068a = y10Var.f33068a;
        this.f33069b = y10Var.f33069b;
        this.f33070c = y10Var.f33070c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
