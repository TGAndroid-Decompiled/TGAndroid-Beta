package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class nz0 extends URLSpan {
    public final String f40940a;
    public final vz0 f40941b;

    public nz0(vz0 vz0Var, String str, String str2) {
        super(str);
        this.f40941b = vz0Var;
        this.f40940a = str2;
    }

    @Override
    public final void onClick(View view) {
        ye.d.s(this.f40941b.f43803e.getParentActivity(), this.f40940a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
