package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class y41 extends URLSpan {
    public final h01 f34922a;

    public y41(String str, h01 h01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f34922a = h01Var;
    }

    @Override
    public final void onClick(View view) {
        ye.d.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        h01 h01Var = this.f34922a;
        if (h01Var != null) {
            h01Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
