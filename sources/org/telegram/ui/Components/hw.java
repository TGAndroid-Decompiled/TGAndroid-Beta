package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
public final class hw extends FrameLayout {
    public final Paint f26939a;
    public final vy f26940b;

    public hw(vy vyVar, Context context) {
        super(context);
        this.f26940b = vyVar;
        this.f26939a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        vy vyVar = this.f26940b;
        gw gwVar = vyVar.B0;
        float L = org.telegram.messenger.i0.L(50.0f) * vyVar.f31996t1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = vyVar.A(org.telegram.ui.ActionBar.t6.f21286wf);
        Paint paint = this.f26939a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gwVar.getExpandedOffset() + org.telegram.messenger.i0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (gwVar.f31339s != null) {
            canvas.save();
            float f7 = gwVar.f31321c0 - gwVar.f31322d0;
            float f10 = gwVar.f31341w;
            if (f10 > 0.0f) {
                f7 = ((gwVar.f31339s.getX() - gwVar.getScrollX()) * gwVar.f31341w) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            gwVar.f31339s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f26940b.Z();
    }
}
