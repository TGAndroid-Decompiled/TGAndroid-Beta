package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fx extends FrameLayout {
    public final Paint f26401a;
    public final tz f26402b;

    public fx(tz tzVar, Context context) {
        super(context);
        this.f26402b = tzVar;
        this.f26401a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        tz tzVar = this.f26402b;
        ex exVar = tzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * tzVar.f30800t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = tzVar.A(org.telegram.ui.ActionBar.h6.He);
        Paint paint = this.f26401a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), exVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (exVar.f26618s != null) {
            canvas.save();
            float f7 = exVar.f26600c0 - exVar.f26601d0;
            float f10 = exVar.v;
            if (f10 > 0.0f) {
                f7 = ((exVar.f26618s.getX() - exVar.getScrollX()) * exVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            exVar.f26618s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f26402b.Y();
    }
}
