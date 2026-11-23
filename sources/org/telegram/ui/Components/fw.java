package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class fw extends FrameLayout {
    public final Paint f35209a;
    public final qy f35210b;

    public fw(qy qyVar, Context context) {
        super(context);
        this.f35210b = qyVar;
        this.f35209a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        qy qyVar = this.f35210b;
        ew ewVar = qyVar.C0;
        float L = org.telegram.messenger.g0.L(50.0f) * qyVar.f39099u1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = qyVar.z(org.telegram.ui.ActionBar.n6.f29871zf);
        Paint paint = this.f35209a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ewVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (ewVar.f35493s != null) {
            canvas.save();
            float f10 = ewVar.f35475d0 - ewVar.f35477e0;
            float f11 = ewVar.f35496w;
            if (f11 > 0.0f) {
                f10 = ((ewVar.f35493s.getX() - ewVar.getScrollX()) * ewVar.f35496w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            ewVar.f35493s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f35210b.Z();
    }
}
