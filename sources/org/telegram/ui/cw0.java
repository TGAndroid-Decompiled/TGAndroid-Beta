package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class cw0 extends URLSpan {
    public final String f46691a;
    public final lw0 f46692b;

    public cw0(lw0 lw0Var, String str, String str2) {
        super(str);
        this.f46692b = lw0Var;
        this.f46691a = str2;
    }

    @Override
    public final void onClick(View view) {
        vf.c.t(this.f46692b.f49718e.getParentActivity(), this.f46691a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
