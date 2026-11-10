package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class ew0 extends URLSpan {
    public final String f45453a;
    public final mw0 f45454b;

    public ew0(mw0 mw0Var, String str, String str2) {
        super(str);
        this.f45454b = mw0Var;
        this.f45453a = str2;
    }

    @Override
    public final void onClick(View view) {
        vf.c.t(this.f45454b.f48065e.getParentActivity(), this.f45453a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
