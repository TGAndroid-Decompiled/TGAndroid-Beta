package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class a61 extends MetricAffectingSpan {
    public final CharSequence f22561a;
    public final int f22562b;
    public final int f22563c;
    public final byte d;
    public final d11 e;

    public a61(CharSequence charSequence, int i10, int i11, byte b10, d11 d11Var) {
        this.f22561a = charSequence;
        this.f22562b = i10;
        this.f22563c = i11;
        this.d = b10;
        this.e = d11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19100fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.ec, false));
        }
        d11 d11Var = this.e;
        if (d11Var != null) {
            d11Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        d11 d11Var = this.e;
        if (d11Var != null) {
            d11Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
