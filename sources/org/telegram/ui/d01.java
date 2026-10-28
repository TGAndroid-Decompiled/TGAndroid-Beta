package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class d01 extends URLSpan {
    public final String f38486a;
    public final l01 f38487b;

    public d01(l01 l01Var, String str, String str2) {
        super(str);
        this.f38487b = l01Var;
        this.f38486a = str2;
    }

    @Override
    public final void onClick(View view) {
        qf.d.r(this.f38487b.e.getParentActivity(), this.f38486a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
