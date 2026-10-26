package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class z61 extends URLSpan {
    public final y11 f35233a;
    public boolean f35234b;

    public z61(String str, y11 y11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f35233a = y11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f35234b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).Y0 = true;
        }
        qf.d.o(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        y11 y11Var = this.f35233a;
        if (y11Var != null) {
            y11Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
