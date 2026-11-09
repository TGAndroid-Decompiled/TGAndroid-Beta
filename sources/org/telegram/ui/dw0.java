package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class dw0 extends URLSpan {
    public final String f45125a;
    public final lw0 f45126b;

    public dw0(lw0 lw0Var, String str, String str2) {
        super(str);
        this.f45126b = lw0Var;
        this.f45125a = str2;
    }

    @Override
    public final void onClick(View view) {
        vf.c.t(this.f45126b.f47690e.getParentActivity(), this.f45125a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
