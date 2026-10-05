package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class k01 extends URLSpan {
    public final String f37809a;
    public final s01 f37810b;

    public k01(s01 s01Var, String str, String str2) {
        super(str);
        this.f37810b = s01Var;
        this.f37809a = str2;
    }

    @Override
    public final void onClick(View view) {
        nf.f.s(this.f37810b.f40298e.getParentActivity(), this.f37809a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
