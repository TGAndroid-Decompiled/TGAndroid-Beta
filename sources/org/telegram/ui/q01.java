package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class q01 extends URLSpan {
    public final String f40950a;
    public final y01 f40951b;

    public q01(y01 y01Var, String str, String str2) {
        super(str);
        this.f40951b = y01Var;
        this.f40950a = str2;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f40951b.f44191e.getParentActivity(), this.f40950a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
