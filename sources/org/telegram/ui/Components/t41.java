package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class t41 extends URLSpan {
    public final ez0 f39795a;
    public boolean f39796b;

    public t41(String str, ez0 ez0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f39795a = ez0Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f39796b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        ez0 ez0Var = this.f39795a;
        if (ez0Var != null) {
            ez0Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
