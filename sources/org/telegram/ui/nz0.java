package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

public final class nz0 extends URLSpan {

    public final String f40960a;

    public final vz0 f40961b;

    public nz0(vz0 vz0Var, String str, String str2) {
        super(str);
        this.f40961b = vz0Var;
        this.f40960a = str2;
    }

    @Override
    public final void onClick(View view) {
        we.e.s(this.f40961b.f43554e.getParentActivity(), this.f40960a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
