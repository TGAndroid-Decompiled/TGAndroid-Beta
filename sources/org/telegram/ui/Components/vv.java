package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class vv extends FrameLayout {
    public final Paint f39733a;
    public final hy f39734b;

    public vv(hy hyVar, Context context) {
        super(context);
        this.f39734b = hyVar;
        this.f39733a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        hy hyVar = this.f39734b;
        uv uvVar = hyVar.B0;
        float L = org.telegram.messenger.g0.L(50.0f) * hyVar.f34452t1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z9 = hyVar.z(org.telegram.ui.ActionBar.k6.f28214wf);
        Paint paint = this.f39733a;
        paint.setColor(z9);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), uvVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (uvVar.f37717s != null) {
            canvas.save();
            float f10 = uvVar.f37698c0 - uvVar.f37699d0;
            float f11 = uvVar.f37719w;
            if (f11 > 0.0f) {
                f10 = ((uvVar.f37717s.getX() - uvVar.getScrollX()) * uvVar.f37719w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            uvVar.f37717s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f39734b.Z();
    }
}
