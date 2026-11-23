package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class iw extends FrameLayout {
    public final Paint f36285a;
    public final ty f36286b;

    public iw(ty tyVar, Context context) {
        super(context);
        this.f36286b = tyVar;
        this.f36285a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ty tyVar = this.f36286b;
        hw hwVar = tyVar.C0;
        float L = org.telegram.messenger.g0.L(50.0f) * tyVar.f40126u1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = tyVar.z(org.telegram.ui.ActionBar.m6.f29767zf);
        Paint paint = this.f36285a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), hwVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (hwVar.f35588s != null) {
            canvas.save();
            float f10 = hwVar.f35570d0 - hwVar.f35572e0;
            float f11 = hwVar.f35591w;
            if (f11 > 0.0f) {
                f10 = ((hwVar.f35588s.getX() - hwVar.getScrollX()) * hwVar.f35591w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            hwVar.f35588s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f36286b.Z();
    }
}
