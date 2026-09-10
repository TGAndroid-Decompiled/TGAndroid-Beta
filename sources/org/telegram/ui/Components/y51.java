package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class y51 extends MetricAffectingSpan {
    public final CharSequence f29250a;
    public final int f29251b;
    public final int f29252c;
    public final byte d;
    public final b11 e;

    public y51(CharSequence charSequence, int i10, int i11, byte b10, b11 b11Var) {
        this.f29250a = charSequence;
        this.f29251b = i10;
        this.f29252c = i11;
        this.d = b10;
        this.e = b11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17969fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ec, false));
        }
        b11 b11Var = this.e;
        if (b11Var != null) {
            b11Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        b11 b11Var = this.e;
        if (b11Var != null) {
            b11Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
