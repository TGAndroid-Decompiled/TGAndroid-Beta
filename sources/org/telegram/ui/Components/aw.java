package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class aw extends FrameLayout {
    public final Paint f33095a;
    public final ly f33096b;

    public aw(ly lyVar, Context context) {
        super(context);
        this.f33096b = lyVar;
        this.f33095a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ly lyVar = this.f33096b;
        zv zvVar = lyVar.C0;
        float L = org.telegram.messenger.g0.L(50.0f) * lyVar.f36993u1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = lyVar.z(org.telegram.ui.ActionBar.j6.f29269zf);
        Paint paint = this.f33095a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), zvVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (zvVar.f41400s != null) {
            canvas.save();
            float f10 = zvVar.f41382d0 - zvVar.f41384e0;
            float f11 = zvVar.f41403w;
            if (f11 > 0.0f) {
                f10 = ((zvVar.f41400s.getX() - zvVar.getScrollX()) * zvVar.f41403w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            zvVar.f41400s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f33096b.Z();
    }
}
