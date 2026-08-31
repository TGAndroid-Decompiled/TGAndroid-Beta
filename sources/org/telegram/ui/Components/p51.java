package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class p51 extends URLSpan {
    public final t01 f29971a;
    public boolean f29972b;

    public p51(String str, t01 t01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f29971a = t01Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f29972b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).U0 = true;
        }
        af.g.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z4;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        t01 t01Var = this.f29971a;
        if (t01Var != null) {
            t01Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z4 = true;
            } else {
                z4 = false;
            }
            textPaint.setUnderlineText(z4);
        }
    }
}
