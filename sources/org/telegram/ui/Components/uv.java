package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class uv extends FrameLayout {
    public final Paint f38729a;
    public final gy f38730b;

    public uv(gy gyVar, Context context) {
        super(context);
        this.f38730b = gyVar;
        this.f38729a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        gy gyVar = this.f38730b;
        tv tvVar = gyVar.B0;
        float L = org.telegram.messenger.g0.L(50.0f) * gyVar.f34076t1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z9 = gyVar.z(org.telegram.ui.ActionBar.k6.f28210wf);
        Paint paint = this.f38729a;
        paint.setColor(z9);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), tvVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (tvVar.f37736s != null) {
            canvas.save();
            float f10 = tvVar.f37717c0 - tvVar.f37718d0;
            float f11 = tvVar.f37738w;
            if (f11 > 0.0f) {
                f10 = ((tvVar.f37736s.getX() - tvVar.getScrollX()) * tvVar.f37738w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            tvVar.f37736s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f38730b.Z();
    }
}
