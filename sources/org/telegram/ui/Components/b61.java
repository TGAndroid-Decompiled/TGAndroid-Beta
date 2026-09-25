package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class b61 extends URLSpan {
    public final b11 f22908a;
    public boolean f22909b;

    public b61(String str, b11 b11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f22908a = b11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f22909b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        nf.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        b11 b11Var = this.f22908a;
        if (b11Var != null) {
            b11Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
