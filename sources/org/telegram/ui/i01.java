package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class i01 extends URLSpan {
    public final String f34339a;
    public final q01 f34340b;

    public i01(q01 q01Var, String str, String str2) {
        super(str);
        this.f34340b = q01Var;
        this.f34339a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f34340b.e.getParentActivity(), this.f34339a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
