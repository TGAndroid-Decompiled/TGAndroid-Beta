package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dx extends FrameLayout {
    public final Paint f22493a;
    public final rz f22494b;

    public dx(rz rzVar, Context context) {
        super(context);
        this.f22494b = rzVar;
        this.f22493a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        rz rzVar = this.f22494b;
        cx cxVar = rzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * rzVar.f26858t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = rzVar.z(org.telegram.ui.ActionBar.j6.He);
        Paint paint = this.f22493a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), cxVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (cxVar.f27123s != null) {
            canvas.save();
            float f7 = cxVar.f27105c0 - cxVar.f27106d0;
            float f10 = cxVar.v;
            if (f10 > 0.0f) {
                f7 = ((cxVar.f27123s.getX() - cxVar.getScrollX()) * cxVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            cxVar.f27123s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f22494b.a0();
    }
}
