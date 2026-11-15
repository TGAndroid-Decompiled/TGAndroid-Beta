package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class aw0 extends URLSpan {
    public final String f45518a;
    public final iw0 f45519b;

    public aw0(iw0 iw0Var, String str, String str2) {
        super(str);
        this.f45519b = iw0Var;
        this.f45518a = str2;
    }

    @Override
    public final void onClick(View view) {
        vf.c.t(this.f45519b.f48123e.getParentActivity(), this.f45518a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
