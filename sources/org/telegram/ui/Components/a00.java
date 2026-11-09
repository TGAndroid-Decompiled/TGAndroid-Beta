package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class a00 extends URLSpan {
    public static final int f31630e = 0;
    public final String f31631a;
    public final TLRPC.TL_messageEntityFormattedDate f31632b;
    public final vy0 f31633c;
    public final boolean d;

    public a00(String str, vy0 vy0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f31631a = str;
        this.f31632b = tL_messageEntityFormattedDate;
        this.f31633c = vy0Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z9) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            a00[] a00VarArr = (a00[]) spanned.getSpans(0, spanned.length(), a00.class);
            int length = a00VarArr.length;
            ?? r42 = 0;
            int i7 = 0;
            while (i7 < length) {
                a00 a00Var = a00VarArr[i7];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = a00Var.f31632b;
                if (tL_messageEntityFormattedDate.flags != 0 && (a00Var.d != z9 || (z9 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(a00Var);
                    int spanEnd = r42.getSpanEnd(a00Var);
                    if (z9) {
                        str = org.telegram.messenger.id.A(a00Var.f31632b, System.currentTimeMillis(), Locale.getDefault(), false);
                    } else {
                        str = a00Var.f31631a;
                    }
                    r42.removeSpan(a00Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new a00(a00Var, z9), spanStart, str.length() + spanStart, 33);
                }
                i7++;
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
        boolean z9;
        int i7 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vy0 vy0Var = this.f31633c;
        if (vy0Var != null) {
            vy0Var.a(textPaint);
        }
        if (i7 == color) {
            z9 = true;
        } else {
            z9 = false;
        }
        textPaint.setUnderlineText(z9);
    }

    public a00(a00 a00Var, boolean z9) {
        super(a00Var.f31631a);
        this.f31631a = a00Var.f31631a;
        this.f31632b = a00Var.f31632b;
        this.f31633c = a00Var.f31633c;
        this.d = z9;
    }

    @Override
    public final void onClick(View view) {
    }
}
