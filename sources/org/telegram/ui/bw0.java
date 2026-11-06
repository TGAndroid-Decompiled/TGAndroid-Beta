package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class bw0 extends URLSpan {
    public final String f44496a;
    public final jw0 f44497b;

    public bw0(jw0 jw0Var, String str, String str2) {
        super(str);
        this.f44497b = jw0Var;
        this.f44496a = str2;
    }

    @Override
    public final void onClick(View view) {
        vf.c.t(this.f44497b.f47050e.getParentActivity(), this.f44496a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
