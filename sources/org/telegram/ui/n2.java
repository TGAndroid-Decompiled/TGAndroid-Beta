package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class n2 extends View {
    public final o2 f47939a;

    public n2(o2 o2Var, Context context) {
        super(context);
        this.f47939a = o2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        o2 o2Var = this.f47939a;
        if (o2Var.f48212e == null) {
            return;
        }
        int b10 = o2Var.f48211c.b();
        int L2 = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.D(6.0f, b10 - 1, org.telegram.messenger.g0.L(7.0f) * b10);
        float f10 = o2Var.f48218x + o2Var.f48217w;
        if (L2 < getMeasuredWidth()) {
            L = (getMeasuredWidth() - L2) / 2.0f;
        } else {
            int L3 = org.telegram.messenger.g0.L(13.0f);
            int measuredWidth = ((getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)) / 2) / L3;
            L = org.telegram.messenger.g0.L(4.0f) - (Utilities.i(f10 - measuredWidth, Math.max(0, (b10 - (measuredWidth * 2)) - 1), 0.0f) * L3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i7 = 0; i7 < o2Var.f48212e.items.size(); i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i7 - f10));
            float L4 = (org.telegram.messenger.g0.L(1.0f) * max) + org.telegram.messenger.g0.L(2.0f);
            g4.C1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(org.telegram.messenger.g0.L(4.0f) + L + (org.telegram.messenger.g0.L(13.0f) * i7), getMeasuredHeight() / 2.0f, L4, g4.C1);
        }
        canvas.restore();
    }
}
