package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ex extends FrameLayout {
    public final Paint f28002a;
    public final sz f28003b;

    public ex(sz szVar, Context context) {
        super(context);
        this.f28003b = szVar;
        this.f28002a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        sz szVar = this.f28003b;
        dx dxVar = szVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * szVar.f32772t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = szVar.A(org.telegram.ui.ActionBar.y6.He);
        Paint paint = this.f28002a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), dxVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (dxVar.f31634s != null) {
            canvas.save();
            float f7 = dxVar.f31616c0 - dxVar.f31617d0;
            float f10 = dxVar.v;
            if (f10 > 0.0f) {
                f7 = ((dxVar.f31634s.getX() - dxVar.getScrollX()) * dxVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            dxVar.f31634s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f28003b.Y();
    }
}
