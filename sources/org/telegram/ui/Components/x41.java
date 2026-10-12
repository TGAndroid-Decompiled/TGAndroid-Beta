package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class x41 extends ClickableSpan {
    public final URLSpan f32650a;
    public final g51 f32651b;

    public x41(g51 g51Var, URLSpan uRLSpan) {
        this.f32651b = g51Var;
        this.f32650a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        g51 g51Var = this.f32651b;
        Utilities.CallbackReturn callbackReturn = g51Var.N;
        URLSpan uRLSpan = this.f32650a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                g51Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = g51Var.M;
        if (m2Var != null) {
            g5.p0(m2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f32650a instanceof y61)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20686k5, false));
        textPaint.setAlpha(min);
    }
}
