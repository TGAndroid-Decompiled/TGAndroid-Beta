package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class gx0 extends org.telegram.ui.Components.ll0 {
    public final Paint X2;
    public final Path Y2;
    public final jx0 Z2;

    public gx0(jx0 jx0Var, Context context) {
        super(context, null);
        this.Z2 = jx0Var;
        Paint paint = new Paint(1);
        this.X2 = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false));
        this.Y2 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.Y2;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
        canvas.drawPath(path, this.X2);
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.Z2.f37864n.f33791q0 >= 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.Z2.f37864n.f33791q0 >= 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.Z2.f37864n;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            ArrayList arrayList = premiumPreviewFragment.d;
            if (i14 < arrayList.size()) {
                premiumPreviewFragment.M.a((lx0) arrayList.get(i14), false);
                premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
                ((lx0) arrayList.get(i14)).h = i15;
                i15 += premiumPreviewFragment.M.getMeasuredHeight();
                i14++;
            } else {
                premiumPreviewFragment.O = i15;
                return;
            }
        }
    }
}
