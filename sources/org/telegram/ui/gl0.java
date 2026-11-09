package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class gl0 extends ClickableSpan {
    public final jl0 f46032a;

    public gl0(jl0 jl0Var) {
        this.f46032a = jl0Var;
    }

    @Override
    public final void onClick(View view) {
        jl0 jl0Var = this.f46032a;
        jl0Var.presentFragment(new bb1(6, jl0Var.f46994a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
