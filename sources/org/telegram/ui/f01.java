package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class f01 extends URLSpan {
    public final String f33900a;
    public final n01 f33901b;

    public f01(n01 n01Var, String str, String str2) {
        super(str);
        this.f33901b = n01Var;
        this.f33900a = str2;
    }

    @Override
    public final void onClick(View view) {
        ze.d.s(this.f33901b.e.getParentActivity(), this.f33900a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
