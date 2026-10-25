package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class s10 extends URLSpan {
    public static final int e = 0;
    public final String f32401a;
    public final TLRPC.TL_messageEntityFormattedDate f32402b;
    public final y11 f32403c;
    public final boolean d;

    public s10(String str, y11 y11Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f32401a = str;
        this.f32402b = tL_messageEntityFormattedDate;
        this.f32403c = y11Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            s10[] s10VarArr = (s10[]) spanned.getSpans(0, spanned.length(), s10.class);
            int length = s10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                s10 s10Var = s10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = s10Var.f32402b;
                if (tL_messageEntityFormattedDate.flags != 0 && (s10Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(s10Var);
                    int spanEnd = r42.getSpanEnd(s10Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(s10Var.f32402b);
                    } else {
                        str = s10Var.f32401a;
                    }
                    r42.removeSpan(s10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new s10(s10Var, z10), spanStart, str.length() + spanStart, 33);
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
        y11 y11Var = this.f32403c;
        if (y11Var != null) {
            y11Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public s10(s10 s10Var, boolean z10) {
        super(s10Var.f32401a);
        this.f32401a = s10Var.f32401a;
        this.f32402b = s10Var.f32402b;
        this.f32403c = s10Var.f32403c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
