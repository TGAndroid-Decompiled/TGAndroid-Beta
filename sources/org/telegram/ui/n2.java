package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class n2 extends View {
    public final o2 f39676a;

    public n2(o2 o2Var, Context context) {
        super(context);
        this.f39676a = o2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        o2 o2Var = this.f39676a;
        if (o2Var.e == null) {
            return;
        }
        int b10 = o2Var.f40020c.b();
        int L2 = org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.m5.D(6.0f, b10 - 1, org.telegram.messenger.i0.L(7.0f) * b10);
        float f7 = o2Var.f40026x + o2Var.f40025w;
        if (L2 < getMeasuredWidth()) {
            L = (getMeasuredWidth() - L2) / 2.0f;
        } else {
            int L3 = org.telegram.messenger.i0.L(13.0f);
            int measuredWidth = ((getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f)) / 2) / L3;
            L = org.telegram.messenger.i0.L(4.0f) - (Utilities.i(f7 - measuredWidth, Math.max(0, (b10 - (measuredWidth * 2)) - 1), 0.0f) * L3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i10 = 0; i10 < o2Var.e.items.size(); i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            float L4 = (org.telegram.messenger.i0.L(1.0f) * max) + org.telegram.messenger.i0.L(2.0f);
            h4.C1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(org.telegram.messenger.i0.L(4.0f) + L + (org.telegram.messenger.i0.L(13.0f) * i10), getMeasuredHeight() / 2.0f, L4, h4.C1);
        }
        canvas.restore();
    }
}
