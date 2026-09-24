package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class lo0 extends ClickableSpan {
    public final oo0 f35382a;

    public lo0(oo0 oo0Var) {
        this.f35382a = oo0Var;
    }

    @Override
    public final void onClick(View view) {
        oo0 oo0Var = this.f35382a;
        oo0Var.presentFragment(new zg1(6, oo0Var.f36262a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
