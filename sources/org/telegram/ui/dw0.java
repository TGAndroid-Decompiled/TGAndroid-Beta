package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class dw0 extends URLSpan {
    public final String f47027a;
    public final lw0 f47028b;

    public dw0(lw0 lw0Var, String str, String str2) {
        super(str);
        this.f47028b = lw0Var;
        this.f47027a = str2;
    }

    @Override
    public final void onClick(View view) {
        vf.c.t(this.f47028b.f49684e.getParentActivity(), this.f47027a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
