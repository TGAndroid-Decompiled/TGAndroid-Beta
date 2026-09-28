package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class i01 extends URLSpan {
    public final String f34338a;
    public final q01 f34339b;

    public i01(q01 q01Var, String str, String str2) {
        super(str);
        this.f34339b = q01Var;
        this.f34338a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f34339b.e.getParentActivity(), this.f34338a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
