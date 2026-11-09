package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class vv extends FrameLayout {
    public final Paint f39810a;
    public final hy f39811b;

    public vv(hy hyVar, Context context) {
        super(context);
        this.f39811b = hyVar;
        this.f39810a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        hy hyVar = this.f39811b;
        uv uvVar = hyVar.B0;
        float L = org.telegram.messenger.g0.L(50.0f) * hyVar.f34467t1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z9 = hyVar.z(org.telegram.ui.ActionBar.l6.f28227wf);
        Paint paint = this.f39810a;
        paint.setColor(z9);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), uvVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (uvVar.f38118s != null) {
            canvas.save();
            float f10 = uvVar.f38099c0 - uvVar.f38100d0;
            float f11 = uvVar.f38120w;
            if (f11 > 0.0f) {
                f10 = ((uvVar.f38118s.getX() - uvVar.getScrollX()) * uvVar.f38120w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            uvVar.f38118s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f39811b.Z();
    }
}
