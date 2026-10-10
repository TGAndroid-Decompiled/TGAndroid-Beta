package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class t61 extends MetricAffectingSpan {
    public final CharSequence f31033a;
    public final int f31034b;
    public final int f31035c;
    public final byte d;
    public final u11 f31036e;

    public t61(CharSequence charSequence, int i10, int i11, byte b10, u11 u11Var) {
        this.f31033a = charSequence;
        this.f31034b = i10;
        this.f31035c = i11;
        this.d = b10;
        this.f31036e = u11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20843fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ec, false));
        }
        u11 u11Var = this.f31036e;
        if (u11Var != null) {
            u11Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        u11 u11Var = this.f31036e;
        if (u11Var != null) {
            u11Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
