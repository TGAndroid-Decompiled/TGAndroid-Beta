package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class nx0 extends URLSpan {
    public final String f39981a;
    public final wx0 f39982b;

    public nx0(wx0 wx0Var, String str, String str2) {
        super(str);
        this.f39982b = wx0Var;
        this.f39981a = str2;
    }

    @Override
    public final void onClick(View view) {
        gf.f.r(this.f39982b.e.getParentActivity(), this.f39981a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
