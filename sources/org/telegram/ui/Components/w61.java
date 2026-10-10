package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class w61 extends URLSpan {
    public final u11 f32608a;
    public boolean f32609b;

    public w61(String str, u11 u11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f32608a = u11Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f32609b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        of.f.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        u11 u11Var = this.f32608a;
        if (u11Var != null) {
            u11Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
