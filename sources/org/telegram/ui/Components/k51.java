package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class k51 extends URLSpan {
    public final s01 f26164a;

    public k51(String str, s01 s01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f26164a = s01Var;
    }

    @Override
    public final void onClick(View view) {
        af.g.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        s01 s01Var = this.f26164a;
        if (s01Var != null) {
            s01Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
