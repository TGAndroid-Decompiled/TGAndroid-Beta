package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ax extends FrameLayout {
    public final Paint f22760a;
    public final mz f22761b;

    public ax(mz mzVar, Context context) {
        super(context);
        this.f22761b = mzVar;
        this.f22760a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        mz mzVar = this.f22761b;
        zw zwVar = mzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * mzVar.f26585t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = mzVar.z(org.telegram.ui.ActionBar.h6.He);
        Paint paint = this.f22760a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), zwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (zwVar.f30050s != null) {
            canvas.save();
            float f7 = zwVar.f30032c0 - zwVar.f30033d0;
            float f10 = zwVar.v;
            if (f10 > 0.0f) {
                f7 = ((zwVar.f30050s.getX() - zwVar.getScrollX()) * zwVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            zwVar.f30050s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f22761b.Y();
    }
}
