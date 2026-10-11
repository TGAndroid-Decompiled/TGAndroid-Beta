package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class p01 extends URLSpan {
    public final String f40680a;
    public final x01 f40681b;

    public p01(x01 x01Var, String str, String str2) {
        super(str);
        this.f40681b = x01Var;
        this.f40680a = str2;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f40681b.f43916e.getParentActivity(), this.f40680a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
