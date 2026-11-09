package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class e41 extends URLSpan {
    public final vy0 f33290a;
    public boolean f33291b;

    public e41(String str, vy0 vy0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f33290a = vy0Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f33291b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).W0 = true;
        }
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z9;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vy0 vy0Var = this.f33290a;
        if (vy0Var != null) {
            vy0Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z9 = true;
            } else {
                z9 = false;
            }
            textPaint.setUnderlineText(z9);
        }
    }
}
