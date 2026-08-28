package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class s00 extends URLSpan {
    public static final int f32328e = 0;
    public final String f32329a;
    public final TLRPC.TL_messageEntityFormattedDate f32330b;
    public final vz0 f32331c;
    public final boolean d;

    public s00(String str, vz0 vz0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f32329a = str;
        this.f32330b = tL_messageEntityFormattedDate;
        this.f32331c = vz0Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i9 = 0;
            s00[] s00VarArr = (s00[]) spanned.getSpans(0, spanned.length(), s00.class);
            int length = s00VarArr.length;
            ?? r42 = 0;
            while (i9 < length) {
                s00 s00Var = s00VarArr[i9];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = s00Var.f32330b;
                if (tL_messageEntityFormattedDate.flags != 0 && (s00Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(s00Var);
                    int spanEnd = r42.getSpanEnd(s00Var);
                    if (z10) {
                        str = LocaleController.formatEntityFormattedDate(s00Var.f32330b);
                    } else {
                        str = s00Var.f32329a;
                    }
                    r42.removeSpan(s00Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new s00(s00Var, z10), spanStart, str.length() + spanStart, 33);
                }
                i9++;
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
        int i9 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vz0 vz0Var = this.f32331c;
        if (vz0Var != null) {
            vz0Var.a(textPaint);
        }
        if (i9 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public s00(s00 s00Var, boolean z10) {
        super(s00Var.f32329a);
        this.f32329a = s00Var.f32329a;
        this.f32330b = s00Var.f32330b;
        this.f32331c = s00Var.f32331c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
