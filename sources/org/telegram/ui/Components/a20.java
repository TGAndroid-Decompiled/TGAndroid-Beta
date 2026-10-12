package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class a20 extends URLSpan {
    public static final int f24217e = 0;
    public final String f24218a;
    public final TLRPC.TL_messageEntityFormattedDate f24219b;
    public final z11 f24220c;
    public final boolean d;

    public a20(String str, z11 z11Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f24218a = str;
        this.f24219b = tL_messageEntityFormattedDate;
        this.f24220c = z11Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            a20[] a20VarArr = (a20[]) spanned.getSpans(0, spanned.length(), a20.class);
            int length = a20VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                a20 a20Var = a20VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = a20Var.f24219b;
                if (tL_messageEntityFormattedDate.flags != 0 && (a20Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(a20Var);
                    int spanEnd = r42.getSpanEnd(a20Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(a20Var.f24219b);
                    } else {
                        str = a20Var.f24218a;
                    }
                    r42.removeSpan(a20Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new a20(a20Var, z10), spanStart, str.length() + spanStart, 33);
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
        z11 z11Var = this.f24220c;
        if (z11Var != null) {
            z11Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public a20(a20 a20Var, boolean z10) {
        super(a20Var.f24218a);
        this.f24218a = a20Var.f24218a;
        this.f24219b = a20Var.f24219b;
        this.f24220c = a20Var.f24220c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
