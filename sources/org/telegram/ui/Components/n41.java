package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
public final class n41 extends URLSpan {
    public final vz0 f31023a;

    public n41(String str, vz0 vz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f31023a = vz0Var;
    }

    @Override
    public final void onClick(View view) {
        ve.e.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        vz0 vz0Var = this.f31023a;
        if (vz0Var != null) {
            vz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
