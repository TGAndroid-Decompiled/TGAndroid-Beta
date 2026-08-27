package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public final class q41 extends MetricAffectingSpan {

    public final CharSequence f31790a;

    public final int f31791b;

    public final int f31792c;
    public final byte d;

    public final xz0 f31793e;

    public q41(CharSequence charSequence, int i10, int i11, byte b10, xz0 xz0Var) {
        this.f31790a = charSequence;
        this.f31791b = i10;
        this.f31792c = i11;
        this.d = b10;
        this.f31793e = xz0Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23077ec, false));
        }
        xz0 xz0Var = this.f31793e;
        if (xz0Var != null) {
            xz0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
            textPaint.setUnderlineText(false);
        }
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        xz0 xz0Var = this.f31793e;
        if (xz0Var != null) {
            xz0Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
