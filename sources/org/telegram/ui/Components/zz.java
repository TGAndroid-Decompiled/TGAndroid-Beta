package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class zz extends URLSpan {
    public static final int f41135e = 0;
    public final String f41136a;
    public final TLRPC.TL_messageEntityFormattedDate f41137b;
    public final ty0 f41138c;
    public final boolean d;

    public zz(String str, ty0 ty0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f41136a = str;
        this.f41137b = tL_messageEntityFormattedDate;
        this.f41138c = ty0Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z9) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            zz[] zzVarArr = (zz[]) spanned.getSpans(0, spanned.length(), zz.class);
            int length = zzVarArr.length;
            ?? r42 = 0;
            int i7 = 0;
            while (i7 < length) {
                zz zzVar = zzVarArr[i7];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = zzVar.f41137b;
                if (tL_messageEntityFormattedDate.flags != 0 && (zzVar.d != z9 || (z9 && tL_messageEntityFormattedDate.relative))) {
                    if (r42 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r42 = charSequence;
                    }
                    int spanStart = r42.getSpanStart(zzVar);
                    int spanEnd = r42.getSpanEnd(zzVar);
                    if (z9) {
                        str = org.telegram.messenger.hd.A(zzVar.f41137b, System.currentTimeMillis(), Locale.getDefault(), false);
                    } else {
                        str = zzVar.f41136a;
                    }
                    r42.removeSpan(zzVar);
                    r42.replace(spanStart, spanEnd, str);
                    r42.setSpan(new zz(zzVar, z9), spanStart, str.length() + spanStart, 33);
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
        ty0 ty0Var = this.f41138c;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        }
        if (i7 == color) {
            z9 = true;
        } else {
            z9 = false;
        }
        textPaint.setUnderlineText(z9);
    }

    public zz(zz zzVar, boolean z9) {
        super(zzVar.f41136a);
        this.f41136a = zzVar.f41136a;
        this.f41137b = zzVar.f41137b;
        this.f41138c = zzVar.f41138c;
        this.d = z9;
    }

    @Override
    public final void onClick(View view) {
    }
}
