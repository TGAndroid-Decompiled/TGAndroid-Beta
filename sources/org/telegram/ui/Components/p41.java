package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class p41 extends URLSpan {
    public final ez0 f38384a;

    public p41(String str, ez0 ez0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f38384a = ez0Var;
    }

    @Override
    public final void onClick(View view) {
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        ez0 ez0Var = this.f38384a;
        if (ez0Var != null) {
            ez0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
