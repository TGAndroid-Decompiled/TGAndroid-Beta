package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class k00 extends URLSpan {
    public static final int f36595e = 0;
    public final String f36596a;
    public final TLRPC.TL_messageEntityFormattedDate f36597b;
    public final dz0 f36598c;
    public final boolean d;

    public k00(String str, dz0 dz0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f36596a = str;
        this.f36597b = tL_messageEntityFormattedDate;
        this.f36598c = dz0Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            k00[] k00VarArr = (k00[]) spanned.getSpans(0, spanned.length(), k00.class);
            int length = k00VarArr.length;
            ?? r42 = 0;
            int i7 = 0;
            while (i7 < length) {
                k00 k00Var = k00VarArr[i7];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = k00Var.f36597b;
                if (tL_messageEntityFormattedDate.flags != 0 && (k00Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(k00Var);
                    int spanEnd = r42.getSpanEnd(k00Var);
                    if (z10) {
                        str = org.telegram.messenger.gd.A(k00Var.f36597b, System.currentTimeMillis(), Locale.getDefault(), false);
                    } else {
                        str = k00Var.f36596a;
                    }
                    r42.removeSpan(k00Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new k00(k00Var, z10), spanStart, str.length() + spanStart, 33);
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
        dz0 dz0Var = this.f36598c;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
        }
        if (i7 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public k00(k00 k00Var, boolean z10) {
        super(k00Var.f36596a);
        this.f36596a = k00Var.f36596a;
        this.f36597b = k00Var.f36597b;
        this.f36598c = k00Var.f36598c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
