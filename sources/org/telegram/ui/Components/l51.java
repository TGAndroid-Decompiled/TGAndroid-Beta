package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class l51 extends MetricAffectingSpan {
    public final CharSequence f26575a;
    public final int f26576b;
    public final int f26577c;
    public final byte d;
    public final s01 e;

    public l51(CharSequence charSequence, int i10, int i11, byte b10, s01 s01Var) {
        this.f26575a = charSequence;
        this.f26576b = i10;
        this.f26577c = i11;
        this.d = b10;
        this.e = s01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19947fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19929ec, false));
        }
        s01 s01Var = this.e;
        if (s01Var != null) {
            s01Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        s01 s01Var = this.e;
        if (s01Var != null) {
            s01Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
