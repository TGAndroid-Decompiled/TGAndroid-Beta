package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class o2 extends View {
    public final p2 f48173a;

    public o2(p2 p2Var, Context context) {
        super(context);
        this.f48173a = p2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        p2 p2Var = this.f48173a;
        if (p2Var.f48414e == null) {
            return;
        }
        int b10 = p2Var.f48413c.b();
        int L2 = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.D(6.0f, b10 - 1, org.telegram.messenger.g0.L(7.0f) * b10);
        float f10 = p2Var.f48420x + p2Var.f48419w;
        if (L2 < getMeasuredWidth()) {
            L = (getMeasuredWidth() - L2) / 2.0f;
        } else {
            int L3 = org.telegram.messenger.g0.L(13.0f);
            int measuredWidth = ((getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)) / 2) / L3;
            L = org.telegram.messenger.g0.L(4.0f) - (Utilities.i(f10 - measuredWidth, Math.max(0, (b10 - (measuredWidth * 2)) - 1), 0.0f) * L3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i3 = 0; i3 < p2Var.f48414e.items.size(); i3++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i3 - f10));
            float L4 = (org.telegram.messenger.g0.L(1.0f) * max) + org.telegram.messenger.g0.L(2.0f);
            i4.D1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(org.telegram.messenger.g0.L(4.0f) + L + (org.telegram.messenger.g0.L(13.0f) * i3), getMeasuredHeight() / 2.0f, L4, i4.D1);
        }
        canvas.restore();
    }
}
