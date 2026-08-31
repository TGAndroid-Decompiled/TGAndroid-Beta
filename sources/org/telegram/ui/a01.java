package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class a01 extends URLSpan {
    public final String f34971a;
    public final i01 f34972b;

    public a01(i01 i01Var, String str, String str2) {
        super(str);
        this.f34972b = i01Var;
        this.f34971a = str2;
    }

    @Override
    public final void onClick(View view) {
        af.g.s(this.f34972b.f37715e.getParentActivity(), this.f34971a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
