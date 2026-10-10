package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class q01 extends URLSpan {
    public final String f40994a;
    public final y01 f40995b;

    public q01(y01 y01Var, String str, String str2) {
        super(str);
        this.f40995b = y01Var;
        this.f40994a = str2;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f40995b.f44235e.getParentActivity(), this.f40994a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
