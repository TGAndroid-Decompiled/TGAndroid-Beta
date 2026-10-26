package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class b01 extends URLSpan {
    public final String f37936a;
    public final j01 f37937b;

    public b01(j01 j01Var, String str, String str2) {
        super(str);
        this.f37937b = j01Var;
        this.f37936a = str2;
    }

    @Override
    public final void onClick(View view) {
        qf.d.r(this.f37937b.e.getParentActivity(), this.f37936a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
