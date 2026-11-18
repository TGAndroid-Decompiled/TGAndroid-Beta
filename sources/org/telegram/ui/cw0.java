package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class cw0 extends URLSpan {
    public final String f46652a;
    public final lw0 f46653b;

    public cw0(lw0 lw0Var, String str, String str2) {
        super(str);
        this.f46653b = lw0Var;
        this.f46652a = str2;
    }

    @Override
    public final void onClick(View view) {
        vf.c.t(this.f46653b.f49704e.getParentActivity(), this.f46652a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
