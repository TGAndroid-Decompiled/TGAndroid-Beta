package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class o61 extends MetricAffectingSpan {
    public final CharSequence f27892a;
    public final int f27893b;
    public final int f27894c;
    public final byte d;
    public final p11 e;

    public o61(CharSequence charSequence, int i10, int i11, byte b10, p11 p11Var) {
        this.f27892a = charSequence;
        this.f27893b = i10;
        this.f27894c = i11;
        this.d = b10;
        this.e = p11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19923ec, false));
        }
        p11 p11Var = this.e;
        if (p11Var != null) {
            p11Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        p11 p11Var = this.e;
        if (p11Var != null) {
            p11Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
