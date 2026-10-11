package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ox extends FrameLayout {
    public final Paint f29646a;
    public final b00 f29647b;

    public ox(b00 b00Var, Context context) {
        super(context);
        this.f29647b = b00Var;
        this.f29646a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b00 b00Var = this.f29647b;
        nx nxVar = b00Var.B0;
        float dp = AndroidUtilities.dp(50.0f) * b00Var.f24785t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int B = b00Var.B(org.telegram.ui.ActionBar.h6.He);
        Paint paint = this.f29646a;
        paint.setColor(B);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), nxVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (nxVar.f29923s != null) {
            canvas.save();
            float f7 = nxVar.f29904c0 - nxVar.f29905d0;
            float f10 = nxVar.v;
            if (f10 > 0.0f) {
                f7 = ((nxVar.f29923s.getX() - nxVar.getScrollX()) * nxVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            nxVar.f29923s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f29647b.Y();
    }
}
