package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class po0 extends ClickableSpan {
    public final so0 f39527a;

    public po0(so0 so0Var) {
        this.f39527a = so0Var;
    }

    @Override
    public final void onClick(View view) {
        so0 so0Var = this.f39527a;
        so0Var.presentFragment(new bh1(6, so0Var.f40547a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
