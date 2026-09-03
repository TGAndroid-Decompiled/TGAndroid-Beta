package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class k51 extends MetricAffectingSpan {
    public final CharSequence f28276a;
    public final int f28277b;
    public final int f28278c;
    public final byte d;
    public final s01 f28279e;

    public k51(CharSequence charSequence, int i10, int i11, byte b10, s01 s01Var) {
        this.f28276a = charSequence;
        this.f28277b = i10;
        this.f28278c = i11;
        this.d = b10;
        this.f28279e = s01Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21703fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21685ec, false));
        }
        s01 s01Var = this.f28279e;
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
        s01 s01Var = this.f28279e;
        if (s01Var != null) {
            s01Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
