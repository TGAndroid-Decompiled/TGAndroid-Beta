package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class o51 extends URLSpan {
    public final s01 f27452a;
    public boolean f27453b;

    public o51(String str, s01 s01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f27452a = s01Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f27453b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).U0 = true;
        }
        af.g.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z4;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        s01 s01Var = this.f27452a;
        if (s01Var != null) {
            s01Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z4 = true;
            } else {
                z4 = false;
            }
            textPaint.setUnderlineText(z4);
        }
    }
}
