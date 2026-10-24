package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class n10 extends URLSpan {
    public static final int e = 0;
    public final String f28757a;
    public final TLRPC.TL_messageEntityFormattedDate f28758b;
    public final p11 f28759c;
    public final boolean d;

    public n10(String str, p11 p11Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f28757a = str;
        this.f28758b = tL_messageEntityFormattedDate;
        this.f28759c = p11Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            n10[] n10VarArr = (n10[]) spanned.getSpans(0, spanned.length(), n10.class);
            int length = n10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                n10 n10Var = n10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = n10Var.f28758b;
                if (tL_messageEntityFormattedDate.flags != 0 && (n10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(n10Var);
                    int spanEnd = r42.getSpanEnd(n10Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(n10Var.f28758b);
                    } else {
                        str = n10Var.f28757a;
                    }
                    r42.removeSpan(n10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new n10(n10Var, z10), spanStart, str.length() + spanStart, 33);
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
        p11 p11Var = this.f28759c;
        if (p11Var != null) {
            p11Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public n10(n10 n10Var, boolean z10) {
        super(n10Var.f28757a);
        this.f28757a = n10Var.f28757a;
        this.f28758b = n10Var.f28758b;
        this.f28759c = n10Var.f28759c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
