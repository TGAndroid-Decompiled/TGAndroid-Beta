package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class uw extends FrameLayout {
    public final Paint f29296a;
    public final kz f29297b;

    public uw(kz kzVar, Context context) {
        super(context);
        this.f29297b = kzVar;
        this.f29296a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        kz kzVar = this.f29297b;
        tw twVar = kzVar.f26488y0;
        float dp = AndroidUtilities.dp(50.0f) * kzVar.f26460q1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = kzVar.A(org.telegram.ui.ActionBar.j6.He);
        Paint paint = this.f29296a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), twVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (twVar.f27955s != null) {
            canvas.save();
            float f10 = twVar.W - twVar.f27935a0;
            float f11 = twVar.v;
            if (f11 > 0.0f) {
                f10 = ((twVar.f27955s.getX() - twVar.getScrollX()) * twVar.v) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            twVar.f27955s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f29297b.a0();
    }
}
