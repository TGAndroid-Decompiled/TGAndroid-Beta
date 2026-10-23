package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class k61 extends MetricAffectingSpan {
    public final CharSequence f27771a;
    public final int f27772b;
    public final int f27773c;
    public final byte d;
    public final n11 e;

    public k61(CharSequence charSequence, int i10, int i11, byte b10, n11 n11Var) {
        this.f27771a = charSequence;
        this.f27772b = i10;
        this.f27773c = i11;
        this.d = b10;
        this.e = n11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21016ec, false));
        }
        n11 n11Var = this.e;
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
        n11 n11Var = this.e;
        if (n11Var != null) {
            n11Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
