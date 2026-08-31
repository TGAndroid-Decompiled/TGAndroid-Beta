package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class m51 extends MetricAffectingSpan {
    public final CharSequence f28941a;
    public final int f28942b;
    public final int f28943c;
    public final byte d;
    public final t01 f28944e;

    public m51(CharSequence charSequence, int i10, int i11, byte b10, t01 t01Var) {
        this.f28941a = charSequence;
        this.f28942b = i10;
        this.f28943c = i11;
        this.d = b10;
        this.f28944e = t01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21701fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21683ec, false));
        }
        t01 t01Var = this.f28944e;
        if (t01Var != null) {
            t01Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        t01 t01Var = this.f28944e;
        if (t01Var != null) {
            t01Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
