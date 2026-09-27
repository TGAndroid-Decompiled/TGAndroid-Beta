package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class oo0 extends ClickableSpan {
    public final ro0 f36233a;

    public oo0(ro0 ro0Var) {
        this.f36233a = ro0Var;
    }

    @Override
    public final void onClick(View view) {
        ro0 ro0Var = this.f36233a;
        ro0Var.presentFragment(new zg1(6, ro0Var.f37168a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
