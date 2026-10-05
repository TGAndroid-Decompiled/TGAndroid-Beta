package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class po0 extends ClickableSpan {
    public final so0 f39611a;

    public po0(so0 so0Var) {
        this.f39611a = so0Var;
    }

    @Override
    public final void onClick(View view) {
        so0 so0Var = this.f39611a;
        so0Var.presentFragment(new zg1(6, so0Var.f40559a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
