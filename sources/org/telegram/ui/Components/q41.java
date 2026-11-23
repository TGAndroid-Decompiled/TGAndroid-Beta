package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class q41 extends MetricAffectingSpan {
    public final CharSequence f38687a;
    public final int f38688b;
    public final int f38689c;
    public final byte d;
    public final ez0 f38690e;

    public q41(CharSequence charSequence, int i7, int i10, byte b10, ez0 ez0Var) {
        this.f38687a = charSequence;
        this.f38688b = i7;
        this.f38689c = i10;
        this.d = b10;
        this.f38690e = ez0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.bz.W0 - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Wc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Vc, false));
        }
        ez0 ez0Var = this.f38690e;
        if (ez0Var != null) {
            ez0Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(org.telegram.messenger.g0.L(org.telegram.messenger.bz.W0 - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        ez0 ez0Var = this.f38690e;
        if (ez0Var != null) {
            ez0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
