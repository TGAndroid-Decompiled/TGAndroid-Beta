package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class k61 extends MetricAffectingSpan {
    public final CharSequence f28069a;
    public final int f28070b;
    public final int f28071c;
    public final byte d;
    public final n11 f28072e;

    public k61(CharSequence charSequence, int i10, int i11, byte b10, n11 n11Var) {
        this.f28069a = charSequence;
        this.f28070b = i10;
        this.f28071c = i11;
        this.d = b10;
        this.f28072e = n11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20869fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.ec, false));
        }
        n11 n11Var = this.f28072e;
        if (n11Var != null) {
            n11Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        n11 n11Var = this.f28072e;
        if (n11Var != null) {
            n11Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
