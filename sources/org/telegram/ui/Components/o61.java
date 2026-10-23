package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class o61 extends URLSpan {
    public final q11 f29103a;

    public o61(String str, q11 q11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f29103a = q11Var;
    }

    @Override
    public final void onClick(View view) {
        pf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        q11 q11Var = this.f29103a;
        if (q11Var != null) {
            q11Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
