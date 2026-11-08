package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class d41 extends URLSpan {
    public final uy0 f32786a;
    public boolean f32787b;

    public d41(String str, uy0 uy0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f32786a = uy0Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f32787b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).W0 = true;
        }
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z9;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        uy0 uy0Var = this.f32786a;
        if (uy0Var != null) {
            uy0Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z9 = true;
            } else {
                z9 = false;
            }
            textPaint.setUnderlineText(z9);
        }
    }
}
