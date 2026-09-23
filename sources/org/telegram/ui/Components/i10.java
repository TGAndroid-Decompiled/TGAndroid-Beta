package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class i10 extends URLSpan {
    public static final int e = 0;
    public final String f24848a;
    public final TLRPC.TL_messageEntityFormattedDate f24849b;
    public final n01 f24850c;
    public final boolean d;

    public i10(String str, n01 n01Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f24848a = str;
        this.f24849b = tL_messageEntityFormattedDate;
        this.f24850c = n01Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            i10[] i10VarArr = (i10[]) spanned.getSpans(0, spanned.length(), i10.class);
            int length = i10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                i10 i10Var = i10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = i10Var.f24849b;
                if (tL_messageEntityFormattedDate.flags != 0 && (i10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(i10Var);
                    int spanEnd = r42.getSpanEnd(i10Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(i10Var.f24849b);
                    } else {
                        str = i10Var.f24848a;
                    }
                    r42.removeSpan(i10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new i10(i10Var, z10), spanStart, str.length() + spanStart, 33);
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
        n01 n01Var = this.f24850c;
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

    public i10(i10 i10Var, boolean z10) {
        super(i10Var.f24848a);
        this.f24848a = i10Var.f24848a;
        this.f24849b = i10Var.f24849b;
        this.f24850c = i10Var.f24850c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
