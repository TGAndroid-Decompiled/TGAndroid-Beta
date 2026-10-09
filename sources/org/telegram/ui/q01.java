package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class q01 extends URLSpan {
    public final String f40948a;
    public final y01 f40949b;

    public q01(y01 y01Var, String str, String str2) {
        super(str);
        this.f40949b = y01Var;
        this.f40948a = str2;
    }

    @Override
    public final void onClick(View view) {
        of.f.s(this.f40949b.f44189e.getParentActivity(), this.f40948a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
