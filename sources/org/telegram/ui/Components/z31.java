package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class z31 extends ClickableSpan {
    public final URLSpan f29581a;
    public final i41 f29582b;

    public z31(i41 i41Var, URLSpan uRLSpan) {
        this.f29582b = i41Var;
        this.f29581a = uRLSpan;
    }

    @Override
    public final void onClick(View view) {
        i41 i41Var = this.f29582b;
        Utilities.CallbackReturn callbackReturn = i41Var.N;
        URLSpan uRLSpan = this.f29581a;
        if (callbackReturn != null) {
            if (((Boolean) callbackReturn.run(uRLSpan)).booleanValue()) {
                i41Var.dismiss();
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = i41Var.M;
        if (p2Var != null) {
            d5.q0(p2Var, uRLSpan.getURL(), false, false);
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int min = Math.min(textPaint.getAlpha(), (textPaint.getColor() >> 24) & 255);
        if (!(this.f29581a instanceof z51)) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18054k5, false));
        textPaint.setAlpha(min);
    }
}
