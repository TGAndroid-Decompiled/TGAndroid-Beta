package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
public final class r41 extends URLSpan {
    public final vz0 f32081a;
    public boolean f32082b;

    public r41(String str, vz0 vz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.f32081a = vz0Var;
    }

    @Override
    public final void onClick(View view) {
        if (this.f32082b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).T0 = true;
        }
        ve.e.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z10;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vz0 vz0Var = this.f32081a;
        if (vz0Var != null) {
            vz0Var.a(textPaint);
            if (textPaint.linkColor == color) {
                z10 = true;
            } else {
                z10 = false;
            }
            textPaint.setUnderlineText(z10);
        }
    }
}
