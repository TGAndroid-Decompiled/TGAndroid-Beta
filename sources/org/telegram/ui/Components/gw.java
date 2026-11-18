package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class gw extends FrameLayout {
    public final Paint f35660a;
    public final ry f35661b;

    public gw(ry ryVar, Context context) {
        super(context);
        this.f35661b = ryVar;
        this.f35660a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ry ryVar = this.f35661b;
        fw fwVar = ryVar.C0;
        float L = org.telegram.messenger.g0.L(50.0f) * ryVar.f39397u1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = ryVar.z(org.telegram.ui.ActionBar.n6.f29814zf);
        Paint paint = this.f35660a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), fwVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (fwVar.f34759s != null) {
            canvas.save();
            float f10 = fwVar.f34741d0 - fwVar.f34743e0;
            float f11 = fwVar.f34762w;
            if (f11 > 0.0f) {
                f10 = ((fwVar.f34759s.getX() - fwVar.getScrollX()) * fwVar.f34762w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            fwVar.f34759s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f35661b.Z();
    }
}
