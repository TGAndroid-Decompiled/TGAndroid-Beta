package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class k01 extends URLSpan {
    public final String f37801a;
    public final s01 f37802b;

    public k01(s01 s01Var, String str, String str2) {
        super(str);
        this.f37802b = s01Var;
        this.f37801a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f37802b.f40323e.getParentActivity(), this.f37801a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
