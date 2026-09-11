package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class h10 extends URLSpan {
    public static final int f26557e = 0;
    public final String f26558a;
    public final TLRPC.TL_messageEntityFormattedDate f26559b;
    public final n01 f26560c;
    public final boolean d;

    public h10(String str, n01 n01Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f26558a = str;
        this.f26559b = tL_messageEntityFormattedDate;
        this.f26560c = n01Var;
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
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = h10Var.f26559b;
                if (tL_messageEntityFormattedDate.flags != 0 && (h10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(h10Var);
                    int spanEnd = r42.getSpanEnd(h10Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(h10Var.f26559b);
                    } else {
                        str = h10Var.f26558a;
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
        n01 n01Var = this.f26560c;
        if (n01Var != null) {
            n01Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public h10(h10 h10Var, boolean z10) {
        super(h10Var.f26558a);
        this.f26558a = h10Var.f26558a;
        this.f26559b = h10Var.f26559b;
        this.f26560c = h10Var.f26560c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
