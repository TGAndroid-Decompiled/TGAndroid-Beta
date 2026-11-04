package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class tv extends FrameLayout {
    public final Paint f38558a;
    public final ey f38559b;

    public tv(ey eyVar, Context context) {
        super(context);
        this.f38559b = eyVar;
        this.f38558a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ey eyVar = this.f38559b;
        sv svVar = eyVar.C0;
        float L = org.telegram.messenger.g0.L(50.0f) * eyVar.f33582u1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = eyVar.z(org.telegram.ui.ActionBar.k6.f28243wf);
        Paint paint = this.f38558a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), svVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (svVar.f39169s != null) {
            canvas.save();
            float f10 = svVar.f39151d0 - svVar.f39153e0;
            float f11 = svVar.f39172w;
            if (f11 > 0.0f) {
                f10 = ((svVar.f39169s.getX() - svVar.getScrollX()) * svVar.f39172w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            svVar.f39169s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.f38559b.Z();
    }
}
