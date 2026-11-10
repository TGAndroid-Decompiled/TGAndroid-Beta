package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class uv extends FrameLayout {
    public final Paint f38751a;
    public final gy f38752b;

    public uv(gy gyVar, Context context) {
        super(context);
        this.f38752b = gyVar;
        this.f38751a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        gy gyVar = this.f38752b;
        tv tvVar = gyVar.B0;
        float L = org.telegram.messenger.g0.L(50.0f) * gyVar.f34068t1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z9 = gyVar.z(org.telegram.ui.ActionBar.m6.f28252wf);
        Paint paint = this.f38751a;
        paint.setColor(z9);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), tvVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (tvVar.f37704s != null) {
            canvas.save();
            float f10 = tvVar.f37685c0 - tvVar.f37686d0;
            float f11 = tvVar.f37706w;
            if (f11 > 0.0f) {
                f10 = ((tvVar.f37704s.getX() - tvVar.getScrollX()) * tvVar.f37706w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            tvVar.f37704s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f38752b.Z();
    }
}
