package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class cw0 extends URLSpan {
    public final String f46688a;
    public final lw0 f46689b;

    public cw0(lw0 lw0Var, String str, String str2) {
        super(str);
        this.f46689b = lw0Var;
        this.f46688a = str2;
    }

    @Override
    public final void onClick(View view) {
        vf.c.t(this.f46689b.f49714e.getParentActivity(), this.f46688a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
