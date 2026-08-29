package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class z41 extends MetricAffectingSpan {
    public final CharSequence f35212a;
    public final int f35213b;
    public final int f35214c;
    public final byte d;
    public final h01 f35215e;

    public z41(CharSequence charSequence, int i10, int i11, byte b10, h01 h01Var) {
        this.f35212a = charSequence;
        this.f35213b = i10;
        this.f35214c = i11;
        this.d = b10;
        this.f35215e = h01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23104fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23086ec, false));
        }
        h01 h01Var = this.f35215e;
        if (h01Var != null) {
            h01Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        h01 h01Var = this.f35215e;
        if (h01Var != null) {
            h01Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
