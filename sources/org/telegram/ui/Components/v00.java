package org.telegram.ui.Components;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

public final class v00 extends URLSpan {

    public static final int f33238e = 0;

    public final String f33239a;

    public final TLRPC.TL_messageEntityFormattedDate f33240b;

    public final xz0 f33241c;
    public final boolean d;

    public v00(String str, xz0 xz0Var, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.f33239a = str;
        this.f33240b = tL_messageEntityFormattedDate;
        this.f33241c = xz0Var;
        this.d = false;
    }

    public static CharSequence a(CharSequence charSequence, boolean z10) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            int i10 = 0;
            v00[] v00VarArr = (v00[]) spanned.getSpans(0, spanned.length(), v00.class);
            int length = v00VarArr.length;
            ?? r10 = 0;
            while (i10 < length) {
                v00 v00Var = v00VarArr[i10];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = v00Var.f33240b;
                if (tL_messageEntityFormattedDate.flags != 0 && (v00Var.d != z10 || (z10 && tL_messageEntityFormattedDate.relative))) {
                    if (r10 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r10 = charSequence;
                    }
                    int spanStart = r10.getSpanStart(v00Var);
                    int spanEnd = r10.getSpanEnd(v00Var);
                    String entityFormattedDate = z10 ? LocaleController.formatEntityFormattedDate(v00Var.f33240b) : v00Var.f33239a;
                    r10.removeSpan(v00Var);
                    r10.replace(spanStart, spanEnd, entityFormattedDate);
                    r10.setSpan(new v00(v00Var, z10), spanStart, entityFormattedDate.length() + spanStart, 33);
                }
                i10++;
                r10 = r10;
            }
        }
        return charSequence;
    }

    public static CharSequence b(SpannableStringBuilder spannableStringBuilder) {
        return a(spannableStringBuilder, false);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        xz0 xz0Var = this.f33241c;
        if (xz0Var != null) {
            xz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color);
    }

    public v00(v00 v00Var, boolean z10) {
        super(v00Var.f33239a);
        this.f33239a = v00Var.f33239a;
        this.f33240b = v00Var.f33240b;
        this.f33241c = v00Var.f33241c;
        this.d = z10;
    }

    @Override
    public final void onClick(View view) {
    }
}
