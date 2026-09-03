package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class f01 extends URLSpan {
    public final String f36619a;
    public final n01 f36620b;

    public f01(n01 n01Var, String str, String str2) {
        super(str);
        this.f36620b = n01Var;
        this.f36619a = str2;
    }

    @Override
    public final void onClick(View view) {
        af.g.s(this.f36620b.f39152e.getParentActivity(), this.f36619a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
