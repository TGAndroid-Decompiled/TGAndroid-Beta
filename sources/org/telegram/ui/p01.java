package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class p01 extends URLSpan {
    public final String f40714a;
    public final x01 f40715b;

    public p01(x01 x01Var, String str, String str2) {
        super(str);
        this.f40715b = x01Var;
        this.f40714a = str2;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f40715b.f43950e.getParentActivity(), this.f40714a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
