package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class vz extends URLSpan {
    public static final int f39826e = 0;
    public final String f39827a;
    public final TLRPC.TL_messageEntityFormattedDate f39828b;
    public final ty0 f39829c;
    public final boolean d;

    public vz(String str, ty0 ty0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f39827a = str;
        this.f39828b = tL_messageEntityFormattedDate;
        this.f39829c = ty0Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            vz[] vzVarArr = (vz[]) spanned.getSpans(0, spanned.length(), vz.class);
            int length = vzVarArr.length;
            ?? r42 = 0;
            int i3 = 0;
            while (i3 < length) {
                vz vzVar = vzVarArr[i3];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = vzVar.f39828b;
                if (tL_messageEntityFormattedDate.flags != 0 && (vzVar.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(vzVar);
                    int spanEnd = r42.getSpanEnd(vzVar);
                    if (z10) {
                        str = org.telegram.messenger.bd.A(vzVar.f39828b, System.currentTimeMillis(), Locale.getDefault(), false);
                    } else {
                        str = vzVar.f39827a;
                    }
                    r42.removeSpan(vzVar);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new vz(vzVar, z10), spanStart, str.length() + spanStart, 33);
                }
                i3++;
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
        int i3 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        ty0 ty0Var = this.f39829c;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        }
        if (i3 == color) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setUnderlineText(z10);
    }

    public vz(vz vzVar, boolean z10) {
        super(vzVar.f39827a);
        this.f39827a = vzVar.f39827a;
        this.f39828b = vzVar.f39828b;
        this.f39829c = vzVar.f39829c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
