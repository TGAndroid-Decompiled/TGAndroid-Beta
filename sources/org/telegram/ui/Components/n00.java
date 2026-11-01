package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class n00 extends URLSpan {
    public static final int e = 0;
    public final String f28626a;
    public final TLRPC.TL_messageEntityFormattedDate f28627b;
    public final zz0 f28628c;
    public final boolean d;

    public n00(String str, zz0 zz0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f28626a = str;
        this.f28627b = tL_messageEntityFormattedDate;
        this.f28628c = zz0Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            n00[] n00VarArr = (n00[]) spanned.getSpans(0, spanned.length(), n00.class);
            int length = n00VarArr.length;
            ?? r42 = 0;
            int i10 = 0;
            while (i10 < length) {
                n00 n00Var = n00VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = n00Var.f28627b;
                if (tL_messageEntityFormattedDate.flags != 0 && (n00Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(n00Var);
                    int spanEnd = r42.getSpanEnd(n00Var);
                    if (z10) {
                        str = org.telegram.messenger.dd.A(n00Var.f28627b, System.currentTimeMillis(), Locale.getDefault(), false);
                    } else {
                        str = n00Var.f28626a;
                    }
                    r42.removeSpan(n00Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new n00(n00Var, z10), spanStart, str.length() + spanStart, 33);
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
        zz0 zz0Var = this.f28628c;
        if (zz0Var != null) {
            zz0Var.a(textPaint);
        }
        if (i10 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public n00(n00 n00Var, boolean z10) {
        super(n00Var.f28626a);
        this.f28626a = n00Var.f28626a;
        this.f28627b = n00Var.f28627b;
        this.f28628c = n00Var.f28628c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
