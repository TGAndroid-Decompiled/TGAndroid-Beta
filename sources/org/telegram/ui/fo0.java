package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class fo0 extends ClickableSpan {
    public final io0 f37379a;

    public fo0(io0 io0Var) {
        this.f37379a = io0Var;
    }

    @Override
    public final void onClick(View view) {
        io0 io0Var = this.f37379a;
        io0Var.presentFragment(new bg1(6, io0Var.f38288a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
