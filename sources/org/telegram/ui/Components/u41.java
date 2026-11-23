package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class u41 extends URLSpan {
    public final fz0 f40260a;
    public boolean f40261b;

    public u41(String str, fz0 fz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f40260a = fz0Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f40261b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        fz0 fz0Var = this.f40260a;
        if (fz0Var != null) {
            fz0Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
