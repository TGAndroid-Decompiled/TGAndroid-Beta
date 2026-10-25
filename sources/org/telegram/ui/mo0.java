package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class mo0 extends ClickableSpan {
    public final po0 f41629a;

    public mo0(po0 po0Var) {
        this.f41629a = po0Var;
    }

    @Override
    public final void onClick(View view) {
        po0 po0Var = this.f41629a;
        po0Var.presentFragment(new dg1(6, po0Var.f42584a0));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
