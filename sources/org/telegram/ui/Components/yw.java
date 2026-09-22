package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yw extends FrameLayout {
    public final Paint f30760a;
    public final kz f30761b;

    public yw(kz kzVar, Context context) {
        super(context);
        this.f30761b = kzVar;
        this.f30760a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        kz kzVar = this.f30761b;
        xw xwVar = kzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * kzVar.f25911t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = kzVar.z(org.telegram.ui.ActionBar.j6.He);
        Paint paint = this.f30760a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), xwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (xwVar.f30067s != null) {
            canvas.save();
            float f7 = xwVar.f30049c0 - xwVar.f30050d0;
            float f10 = xwVar.v;
            if (f10 > 0.0f) {
                f7 = ((xwVar.f30067s.getX() - xwVar.getScrollX()) * xwVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            xwVar.f30067s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f30761b.Y();
    }
}
