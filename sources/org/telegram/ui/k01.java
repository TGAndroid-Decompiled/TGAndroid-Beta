package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class k01 extends URLSpan {
    public final String f37795a;
    public final s01 f37796b;

    public k01(s01 s01Var, String str, String str2) {
        super(str);
        this.f37796b = s01Var;
        this.f37795a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f37796b.f40317e.getParentActivity(), this.f37795a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
