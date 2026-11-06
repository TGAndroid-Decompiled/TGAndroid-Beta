package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class el0 extends ClickableSpan {
    public final hl0 f45374a;

    public el0(hl0 hl0Var) {
        this.f45374a = hl0Var;
    }

    @Override
    public final void onClick(View view) {
        hl0 hl0Var = this.f45374a;
        hl0Var.presentFragment(new ya1(6, hl0Var.f46408a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
