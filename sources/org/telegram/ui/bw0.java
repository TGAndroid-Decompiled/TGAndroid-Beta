package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class bw0 extends URLSpan {
    public final String f46518a;
    public final jw0 f46519b;

    public bw0(jw0 jw0Var, String str, String str2) {
        super(str);
        this.f46519b = jw0Var;
        this.f46518a = str2;
    }

    @Override
    public final void onClick(View view) {
        vf.c.t(this.f46519b.f49218e.getParentActivity(), this.f46518a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
