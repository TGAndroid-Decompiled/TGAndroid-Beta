package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class w61 extends MetricAffectingSpan {
    public final CharSequence f34376a;
    public final int f34377b;
    public final int f34378c;
    public final byte d;
    public final y11 e;

    public w61(CharSequence charSequence, int i10, int i11, byte b10, y11 y11Var) {
        this.f34376a = charSequence;
        this.f34377b = i10;
        this.f34378c = i11;
        this.d = b10;
        this.e = y11Var;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        byte b10 = this.d;
        if (b10 == 2) {
            textPaint.setColor(-1);
        } else if (b10 == 1) {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23396fc, false));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23378ec, false));
        }
        y11 y11Var = this.e;
        if (y11Var != null) {
            y11Var.a(textPaint);
            return;
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize - 1));
        textPaint.setFlags(textPaint.getFlags() | 128);
        y11 y11Var = this.e;
        if (y11Var != null) {
            y11Var.a(textPaint);
        } else {
            textPaint.setTypeface(Typeface.MONOSPACE);
        }
    }
}
