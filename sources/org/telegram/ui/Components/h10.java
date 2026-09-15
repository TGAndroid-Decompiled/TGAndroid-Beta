package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class h10 extends URLSpan {
    public static final int e = 0;
    public final String f24491a;
    public final TLRPC.TL_messageEntityFormattedDate f24492b;
    public final o01 f24493c;
    public final boolean d;

    public h10(String str, o01 o01Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f24491a = str;
        this.f24492b = tL_messageEntityFormattedDate;
        this.f24493c = o01Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            h10[] h10VarArr = (h10[]) spanned.getSpans(0, spanned.length(), h10.class);
            int length = h10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                h10 h10Var = h10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = h10Var.f24492b;
                if (tL_messageEntityFormattedDate.flags != 0 && (h10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(h10Var);
                    int spanEnd = r42.getSpanEnd(h10Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(h10Var.f24492b);
                    } else {
                        str = h10Var.f24491a;
                    }
                    r42.removeSpan(h10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new h10(h10Var, z10), spanStart, str.length() + spanStart, 33);
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
        o01 o01Var = this.f24493c;
        if (o01Var != null) {
            o01Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public h10(h10 h10Var, boolean z10) {
        super(h10Var.f24491a);
        this.f24491a = h10Var.f24491a;
        this.f24492b = h10Var.f24492b;
        this.f24493c = h10Var.f24493c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
