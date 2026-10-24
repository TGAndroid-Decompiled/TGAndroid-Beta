package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dx extends FrameLayout {
    public final Paint f25851a;
    public final rz f25852b;

    public dx(rz rzVar, Context context) {
        super(context);
        this.f25852b = rzVar;
        this.f25851a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        rz rzVar = this.f25852b;
        cx cxVar = rzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * rzVar.f30363t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = rzVar.A(org.telegram.ui.ActionBar.k6.He);
        Paint paint = this.f25851a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), cxVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (cxVar.f27752s != null) {
            canvas.save();
            float f7 = cxVar.f27734c0 - cxVar.f27735d0;
            float f10 = cxVar.v;
            if (f10 > 0.0f) {
                f7 = ((cxVar.f27752s.getX() - cxVar.getScrollX()) * cxVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            cxVar.f27752s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f25852b.Y();
    }
}
