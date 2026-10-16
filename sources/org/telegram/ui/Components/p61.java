package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class p61 extends MetricAffectingSpan {
    public final CharSequence f27894a;
    public final int f27895b;
    public final int f27896c;
    public final byte d;
    public final q11 e;

    public p61(CharSequence charSequence, int i10, int i11, byte b10, q11 q11Var) {
        this.f27894a = charSequence;
        this.f27895b = i10;
        this.f27896c = i11;
        this.d = b10;
        this.e = q11Var;
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
            textPaint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19623ec, false));
        }
        q11 q11Var = this.e;
        if (q11Var != null) {
            q11Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        q11 q11Var = this.e;
        if (q11Var != null) {
            q11Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
