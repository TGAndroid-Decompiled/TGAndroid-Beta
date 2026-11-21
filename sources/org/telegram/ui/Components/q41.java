package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class q41 extends URLSpan {
    public final fz0 f38790a;

    public q41(String str, fz0 fz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f38790a = fz0Var;
    }

    @Override
    public final void onClick(View view) {
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        fz0 fz0Var = this.f38790a;
        if (fz0Var != null) {
            fz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
