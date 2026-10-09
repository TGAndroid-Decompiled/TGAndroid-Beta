package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class s61 extends MetricAffectingSpan {
    public final CharSequence f30705a;
    public final int f30706b;
    public final int f30707c;
    public final byte d;
    public final t11 f30708e;

    public s61(CharSequence charSequence, int i10, int i11, byte b10, t11 t11Var) {
        this.f30705a = charSequence;
        this.f30706b = i10;
        this.f30707c = i11;
        this.d = b10;
        this.f30708e = t11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20839fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ec, false));
        }
        t11 t11Var = this.f30708e;
        if (t11Var != null) {
            t11Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        t11 t11Var = this.f30708e;
        if (t11Var != null) {
            t11Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
