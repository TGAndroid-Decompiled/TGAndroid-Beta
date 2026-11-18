package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class cw0 extends URLSpan {
    public final String f46632a;
    public final lw0 f46633b;

    public cw0(lw0 lw0Var, String str, String str2) {
        super(str);
        this.f46633b = lw0Var;
        this.f46632a = str2;
    }

    @Override
    public final void onClick(View view) {
        vf.c.t(this.f46633b.f49663e.getParentActivity(), this.f46632a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
