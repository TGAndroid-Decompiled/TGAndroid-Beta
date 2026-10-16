package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jx extends FrameLayout {
    public final Paint f26146a;
    public final wz f26147b;

    public jx(wz wzVar, Context context) {
        super(context);
        this.f26147b = wzVar;
        this.f26146a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        wz wzVar = this.f26147b;
        ix ixVar = wzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * wzVar.f30760t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int B = wzVar.B(org.telegram.ui.ActionBar.g6.He);
        Paint paint = this.f26146a;
        paint.setColor(B);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ixVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (ixVar.f26442s != null) {
            canvas.save();
            float f7 = ixVar.f26424c0 - ixVar.f26425d0;
            float f10 = ixVar.v;
            if (f10 > 0.0f) {
                f7 = ((ixVar.f26442s.getX() - ixVar.getScrollX()) * ixVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            ixVar.f26442s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f26147b.Y();
    }
}
