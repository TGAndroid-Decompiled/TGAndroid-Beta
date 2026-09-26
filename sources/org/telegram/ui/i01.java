package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class i01 extends URLSpan {
    public final String f34337a;
    public final q01 f34338b;

    public i01(q01 q01Var, String str, String str2) {
        super(str);
        this.f34338b = q01Var;
        this.f34337a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f34338b.e.getParentActivity(), this.f34337a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
