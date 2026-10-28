package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class oo0 extends ClickableSpan {
    public final ro0 f42164a;

    public oo0(ro0 ro0Var) {
        this.f42164a = ro0Var;
    }

    @Override
    public final void onClick(View view) {
        ro0 ro0Var = this.f42164a;
        ro0Var.presentFragment(new fg1(6, ro0Var.f43098a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
