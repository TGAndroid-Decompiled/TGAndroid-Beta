package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class pm0 extends ClickableSpan {
    public final sm0 f40689a;

    public pm0(sm0 sm0Var) {
        this.f40689a = sm0Var;
    }

    @Override
    public final void onClick(View view) {
        sm0 sm0Var = this.f40689a;
        sm0Var.presentFragment(new tc1(6, sm0Var.f41547a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
