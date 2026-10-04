package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class bx extends FrameLayout {
    public final Paint f25072a;
    public final nz f25073b;

    public bx(nz nzVar, Context context) {
        super(context);
        this.f25073b = nzVar;
        this.f25072a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        nz nzVar = this.f25073b;
        ax axVar = nzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * nzVar.f29145t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = nzVar.z(org.telegram.ui.ActionBar.i6.He);
        Paint paint = this.f25072a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), axVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (axVar.f24602s != null) {
            canvas.save();
            float f7 = axVar.f24583c0 - axVar.f24584d0;
            float f10 = axVar.v;
            if (f10 > 0.0f) {
                f7 = ((axVar.f24602s.getX() - axVar.getScrollX()) * axVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            axVar.f24602s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f25073b.X();
    }
}
