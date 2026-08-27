package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;

public final class t41 extends URLSpan {

    public final xz0 f32651a;

    public boolean f32652b;

    public t41(String str, xz0 xz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f32651a = xz0Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f32652b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).T0 = true;
        }
        we.e.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        xz0 xz0Var = this.f32651a;
        if (xz0Var != null) {
            xz0Var.a(textPaint);
            textPaint.setUnderlineText(textPaint.linkColor == color);
        }
    }
}
