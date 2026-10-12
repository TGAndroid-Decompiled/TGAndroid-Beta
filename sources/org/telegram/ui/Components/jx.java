package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jx extends FrameLayout {
    public final Paint f26509a;
    public final wz f26510b;

    public jx(wz wzVar, Context context) {
        super(context);
        this.f26510b = wzVar;
        this.f26509a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        wz wzVar = this.f26510b;
        ix ixVar = wzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * wzVar.f31067t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = wzVar.A(org.telegram.ui.ActionBar.g6.He);
        Paint paint = this.f26509a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ixVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (ixVar.f26757s != null) {
            canvas.save();
            float f7 = ixVar.f26739c0 - ixVar.f26740d0;
            float f10 = ixVar.v;
            if (f10 > 0.0f) {
                f7 = ((ixVar.f26757s.getX() - ixVar.getScrollX()) * ixVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            ixVar.f26757s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f26510b.Y();
    }
}
