package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class d00 extends URLSpan {
    public static final int f33772e = 0;
    public final String f33773a;
    public final TLRPC.TL_messageEntityFormattedDate f33774b;
    public final wy0 f33775c;
    public final boolean d;

    public d00(String str, wy0 wy0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f33773a = str;
        this.f33774b = tL_messageEntityFormattedDate;
        this.f33775c = wy0Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            d00[] d00VarArr = (d00[]) spanned.getSpans(0, spanned.length(), d00.class);
            int length = d00VarArr.length;
            ?? r42 = 0;
            int i7 = 0;
            while (i7 < length) {
                d00 d00Var = d00VarArr[i7];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = d00Var.f33774b;
                if (tL_messageEntityFormattedDate.flags != 0 && (d00Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(d00Var);
                    int spanEnd = r42.getSpanEnd(d00Var);
                    if (z10) {
                        str = org.telegram.messenger.hd.A(d00Var.f33774b, System.currentTimeMillis(), Locale.getDefault(), false);
                    } else {
                        str = d00Var.f33773a;
                    }
                    r42.removeSpan(d00Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new d00(d00Var, z10), spanStart, str.length() + spanStart, 33);
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
        boolean z10;
        int i7 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        wy0 wy0Var = this.f33775c;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
        }
        if (i7 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public d00(d00 d00Var, boolean z10) {
        super(d00Var.f33773a);
        this.f33773a = d00Var.f33773a;
        this.f33774b = d00Var.f33774b;
        this.f33775c = d00Var.f33775c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
