package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class bw0 extends URLSpan {
    public final String f44498a;
    public final jw0 f44499b;

    public bw0(jw0 jw0Var, String str, String str2) {
        super(str);
        this.f44499b = jw0Var;
        this.f44498a = str2;
    }

    @Override
    public final void onClick(View view) {
        vf.c.t(this.f44499b.f47047e.getParentActivity(), this.f44498a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
