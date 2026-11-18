package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class r41 extends URLSpan {
    public final dz0 f39038a;
    public boolean f39039b;

    public r41(String str, dz0 dz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f39038a = dz0Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f39039b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        dz0 dz0Var = this.f39038a;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
