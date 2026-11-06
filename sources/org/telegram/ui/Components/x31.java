package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class x31 extends URLSpan {
    public final ty0 f40142a;
    public boolean f40143b;

    public x31(String str, ty0 ty0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f40142a = ty0Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f40143b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).W0 = true;
        }
        vf.c.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z9;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        ty0 ty0Var = this.f40142a;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z9 = true;
            } else {
                z9 = false;
            }
            textPaint.setUnderlineText(z9);
        }
    }
}
