package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class ox0 extends URLSpan {
    public final String f40389a;
    public final xx0 f40390b;

    public ox0(xx0 xx0Var, String str, String str2) {
        super(str);
        this.f40390b = xx0Var;
        this.f40389a = str2;
    }

    @Override
    public final void onClick(View view) {
        gf.f.r(this.f40390b.e.getParentActivity(), this.f40389a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
