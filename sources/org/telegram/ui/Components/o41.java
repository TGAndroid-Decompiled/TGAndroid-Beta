package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class o41 extends MetricAffectingSpan {
    public final CharSequence f31283a;
    public final int f31284b;
    public final int f31285c;
    public final byte d;
    public final vz0 f31286e;

    public o41(CharSequence charSequence, int i9, int i10, byte b10, vz0 vz0Var) {
        this.f31283a = charSequence;
        this.f31284b = i9;
        this.f31285c = i10;
        this.d = b10;
        this.f31286e = vz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ec, false));
        }
        vz0 vz0Var = this.f31286e;
        if (vz0Var != null) {
            vz0Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        vz0 vz0Var = this.f31286e;
        if (vz0Var != null) {
            vz0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
