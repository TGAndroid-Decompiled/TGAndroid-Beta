package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class co0 extends ClickableSpan {
    public final fo0 f35967a;

    public co0(fo0 fo0Var) {
        this.f35967a = fo0Var;
    }

    @Override
    public final void onClick(View view) {
        fo0 fo0Var = this.f35967a;
        fo0Var.presentFragment(new xf1(6, fo0Var.f36971a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
