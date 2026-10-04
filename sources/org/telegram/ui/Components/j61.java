package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class j61 extends MetricAffectingSpan {
    public final CharSequence f27607a;
    public final int f27608b;
    public final int f27609c;
    public final byte d;
    public final m11 f27610e;

    public j61(CharSequence charSequence, int i10, int i11, byte b10, m11 m11Var) {
        this.f27607a = charSequence;
        this.f27608b = i10;
        this.f27609c = i11;
        this.d = b10;
        this.f27610e = m11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20859fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.ec, false));
        }
        m11 m11Var = this.f27610e;
        if (m11Var != null) {
            m11Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        m11 m11Var = this.f27610e;
        if (m11Var != null) {
            m11Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
