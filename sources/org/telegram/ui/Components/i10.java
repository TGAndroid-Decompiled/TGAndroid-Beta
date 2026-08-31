package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
public final class i10 extends URLSpan {
    public static final int f27644e = 0;
    public final String f27645a;
    public final TLRPC.TL_messageEntityFormattedDate f27646b;
    public final t01 f27647c;
    public final boolean d;

    public i10(String str, t01 t01Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f27645a = str;
        this.f27646b = tL_messageEntityFormattedDate;
        this.f27647c = t01Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z4) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            i10[] i10VarArr = (i10[]) spanned.getSpans(0, spanned.length(), i10.class);
            int length = i10VarArr.length;
            ?? r42 = 0;
            while (i10 < length) {
                i10 i10Var = i10VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = i10Var.f27646b;
                if (tL_messageEntityFormattedDate.flags != 0 && (i10Var.d != z4 || (z4 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(i10Var);
                    int spanEnd = r42.getSpanEnd(i10Var);
                    if (z4) {
                        str = LocaleController.formatEntityFormattedDate(i10Var.f27646b);
                    } else {
                        str = i10Var.f27645a;
                    }
                    r42.removeSpan(i10Var);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new i10(i10Var, z4), spanStart, str.length() + spanStart, 33);
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
        t01 t01Var = this.f27647c;
        if (t01Var != null) {
            t01Var.a(textPaint);
        }
        if (i10 == color) {
            z4 = true;
        } else {
            z4 = false;
        }
        textPaint.setUnderlineText(z4);
    }

    public i10(i10 i10Var, boolean z4) {
        super(i10Var.f27645a);
        this.f27645a = i10Var.f27645a;
        this.f27646b = i10Var.f27646b;
        this.f27647c = i10Var.f27647c;
        this.d = z4;
    }

    @Override
    public final void onClick(View view) {
    }
}
