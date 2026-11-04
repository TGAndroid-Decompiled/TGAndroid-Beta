package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class al0 extends ClickableSpan {
    public final dl0 f43795a;

    public al0(dl0 dl0Var) {
        this.f43795a = dl0Var;
    }

    @Override
    public final void onClick(View view) {
        dl0 dl0Var = this.f43795a;
        dl0Var.presentFragment(new ra1(6, dl0Var.f44740b0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
