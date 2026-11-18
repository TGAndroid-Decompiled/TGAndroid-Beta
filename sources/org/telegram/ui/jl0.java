package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class jl0 extends ClickableSpan {
    public final ml0 f48979a;

    public jl0(ml0 ml0Var) {
        this.f48979a = ml0Var;
    }

    @Override
    public final void onClick(View view) {
        ml0 ml0Var = this.f48979a;
        ml0Var.presentFragment(new bb1(6, ml0Var.f49857b0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
