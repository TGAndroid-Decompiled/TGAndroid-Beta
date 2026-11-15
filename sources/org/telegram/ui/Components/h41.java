package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class h41 extends URLSpan {
    public final wy0 f35164a;
    public boolean f35165b;

    public h41(String str, wy0 wy0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f35164a = wy0Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f35165b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        wy0 wy0Var = this.f35164a;
        if (wy0Var != null) {
            wy0Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
