package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class uv extends FrameLayout {
    public final Paint f38725a;
    public final gy f38726b;

    public uv(gy gyVar, Context context) {
        super(context);
        this.f38726b = gyVar;
        this.f38725a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        gy gyVar = this.f38726b;
        tv tvVar = gyVar.B0;
        float L = org.telegram.messenger.g0.L(50.0f) * gyVar.f34084t1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z9 = gyVar.z(org.telegram.ui.ActionBar.k6.f28211wf);
        Paint paint = this.f38725a;
        paint.setColor(z9);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), tvVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (tvVar.f37696s != null) {
            canvas.save();
            float f10 = tvVar.f37677c0 - tvVar.f37678d0;
            float f11 = tvVar.f37698w;
            if (f11 > 0.0f) {
                f10 = ((tvVar.f37696s.getX() - tvVar.getScrollX()) * tvVar.f37698w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            tvVar.f37696s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f38726b.Z();
    }
}
