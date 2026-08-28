package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class nz0 extends URLSpan {
    public final String f40853a;
    public final vz0 f40854b;

    public nz0(vz0 vz0Var, String str, String str2) {
        super(str);
        this.f40854b = vz0Var;
        this.f40853a = str2;
    }

    @Override
    public final void onClick(View view) {
        ve.e.s(this.f40854b.f43616e.getParentActivity(), this.f40853a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
