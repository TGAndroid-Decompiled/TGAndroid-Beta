package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class m00 extends URLSpan {
    public static final int f37366e = 0;
    public final String f37367a;
    public final TLRPC.TL_messageEntityFormattedDate f37368b;
    public final fz0 f37369c;
    public final boolean d;

    public m00(String str, fz0 fz0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f37367a = str;
        this.f37368b = tL_messageEntityFormattedDate;
        this.f37369c = fz0Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            m00[] m00VarArr = (m00[]) spanned.getSpans(0, spanned.length(), m00.class);
            int length = m00VarArr.length;
            ?? r42 = 0;
            int i7 = 0;
            while (i7 < length) {
                m00 m00Var = m00VarArr[i7];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = m00Var.f37368b;
                if (tL_messageEntityFormattedDate.flags != 0 && (m00Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(m00Var);
                    int spanEnd = r42.getSpanEnd(m00Var);
                    if (z10) {
                        str = org.telegram.messenger.hd.A(m00Var.f37368b, System.currentTimeMillis(), Locale.getDefault(), false);
                    } else {
                        str = m00Var.f37367a;
                    }
                    r42.removeSpan(m00Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new m00(m00Var, z10), spanStart, str.length() + spanStart, 33);
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
        fz0 fz0Var = this.f37369c;
        if (fz0Var != null) {
            fz0Var.a(textPaint);
        }
        if (i7 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public m00(m00 m00Var, boolean z10) {
        super(m00Var.f37367a);
        this.f37367a = m00Var.f37367a;
        this.f37368b = m00Var.f37368b;
        this.f37369c = m00Var.f37369c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
