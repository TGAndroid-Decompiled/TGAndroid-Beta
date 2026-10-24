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
public final class nw0 extends org.telegram.ui.Components.lm0 {
    public final Paint Y2;
    public final Path Z2;
    public final qw0 f40004a3;

    public nw0(qw0 qw0Var, Context context) {
        super(context, null);
        this.f40004a3 = qw0Var;
        Paint paint = new Paint(1);
        this.Y2 = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false));
        this.Z2 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.Z2;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false);
        Paint paint = this.Y2;
        paint.setColor(x02);
        canvas.drawPath(path, paint);
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f40004a3.f40941n.f33821q0 >= 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f40004a3.f40941n.f33821q0 >= 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.f40004a3.f40941n;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            ArrayList arrayList = premiumPreviewFragment.d;
            if (i14 < arrayList.size()) {
                premiumPreviewFragment.M.a((sw0) arrayList.get(i14), false);
                premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
                ((sw0) arrayList.get(i14)).h = i15;
                i15 += premiumPreviewFragment.M.getMeasuredHeight();
                i14++;
            } else {
                premiumPreviewFragment.O = i15;
                return;
            }
        }
    }
}
