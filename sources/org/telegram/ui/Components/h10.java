package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class h10 extends URLSpan {
    public static final int e = 0;
    public final String f25309a;
    public final TLRPC.TL_messageEntityFormattedDate f25310b;
    public final s01 f25311c;
    public final boolean d;

    public h10(String str, s01 s01Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f25309a = str;
        this.f25310b = tL_messageEntityFormattedDate;
        this.f25311c = s01Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z4) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            h10[] h10VarArr = (h10[]) spanned.getSpans(0, spanned.length(), h10.class);
            int length = h10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                h10 h10Var = h10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = h10Var.f25310b;
                if (tL_messageEntityFormattedDate.flags != 0 && (h10Var.d != z4 || (z4 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(h10Var);
                    int spanEnd = r42.getSpanEnd(h10Var);
                    if (z4) {
                        str = LocaleController.formatEntityFormattedDate(h10Var.f25310b);
                    } else {
                        str = h10Var.f25309a;
                    }
                    r42.removeSpan(h10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new h10(h10Var, z4), spanStart, str.length() + spanStart, 33);
                }
                i10++;
                r42 = r42;
            }
        }
        return charSequence;
    }

    public static CharSequence e(SpannableStringBuilder spannableStringBuilder) {
        return a(spannableStringBuilder, false);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z4;
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        s01 s01Var = this.f25311c;
        if (s01Var != null) {
            s01Var.a(textPaint);
        }
        if (i10 == color) {
            z4 = true;
        } else {
            z4 = false;
        }
        textPaint.setUnderlineText(z4);
    }

    public h10(h10 h10Var, boolean z4) {
        super(h10Var.f25309a);
        this.f25309a = h10Var.f25309a;
        this.f25310b = h10Var.f25310b;
        this.f25311c = h10Var.f25311c;
        this.d = z4;
    }

    @Override
    public final void onClick(View view) {
    }
}
