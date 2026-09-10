package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class p10 extends URLSpan {
    public static final int e = 0;
    public final String f25978a;
    public final TLRPC.TL_messageEntityFormattedDate f25979b;
    public final b11 f25980c;
    public final boolean d;

    public p10(String str, b11 b11Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f25978a = str;
        this.f25979b = tL_messageEntityFormattedDate;
        this.f25980c = b11Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            p10[] p10VarArr = (p10[]) spanned.getSpans(0, spanned.length(), p10.class);
            int length = p10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                p10 p10Var = p10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = p10Var.f25979b;
                if (tL_messageEntityFormattedDate.flags != 0 && (p10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(p10Var);
                    int spanEnd = r42.getSpanEnd(p10Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(p10Var.f25979b);
                    } else {
                        str = p10Var.f25978a;
                    }
                    r42.removeSpan(p10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new p10(p10Var, z10), spanStart, str.length() + spanStart, 33);
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
        b11 b11Var = this.f25980c;
        if (b11Var != null) {
            b11Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public p10(p10 p10Var, boolean z10) {
        super(p10Var.f25978a);
        this.f25978a = p10Var.f25978a;
        this.f25979b = p10Var.f25979b;
        this.f25980c = p10Var.f25980c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
