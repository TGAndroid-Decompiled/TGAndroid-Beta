package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class k01 extends URLSpan {
    public final String f34886a;
    public final s01 f34887b;

    public k01(s01 s01Var, String str, String str2) {
        super(str);
        this.f34887b = s01Var;
        this.f34886a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f34887b.e.getParentActivity(), this.f34886a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
