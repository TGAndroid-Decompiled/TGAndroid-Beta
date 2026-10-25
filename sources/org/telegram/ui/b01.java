package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class b01 extends URLSpan {
    public final String f37933a;
    public final j01 f37934b;

    public b01(j01 j01Var, String str, String str2) {
        super(str);
        this.f37934b = j01Var;
        this.f37933a = str2;
    }

    @Override
    public final void onClick(View view) {
        qf.d.r(this.f37934b.e.getParentActivity(), this.f37933a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
