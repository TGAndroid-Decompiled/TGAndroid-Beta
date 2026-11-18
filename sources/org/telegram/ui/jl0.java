package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class jl0 extends ClickableSpan {
    public final ml0 f49002a;

    public jl0(ml0 ml0Var) {
        this.f49002a = ml0Var;
    }

    @Override
    public final void onClick(View view) {
        ml0 ml0Var = this.f49002a;
        ml0Var.presentFragment(new bb1(6, ml0Var.f49883b0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
