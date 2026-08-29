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
public final class bw0 extends org.telegram.ui.Components.jl0 {
    public final Paint T2;
    public final Path U2;
    public final ew0 V2;

    public bw0(ew0 ew0Var, Context context) {
        super(context, null);
        this.V2 = ew0Var;
        Paint paint = new Paint(1);
        this.T2 = paint;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false));
        this.U2 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.U2;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
        canvas.drawPath(path, this.T2);
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.V2.f37915n.m0 >= 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.V2.f37915n.m0 >= 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.V2.f37915n;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            ArrayList arrayList = premiumPreviewFragment.d;
            if (i14 < arrayList.size()) {
                premiumPreviewFragment.I.a((gw0) arrayList.get(i14), false);
                premiumPreviewFragment.I.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
                ((gw0) arrayList.get(i14)).h = i15;
                i15 += premiumPreviewFragment.I.getMeasuredHeight();
                i14++;
            } else {
                premiumPreviewFragment.K = i15;
                return;
            }
        }
    }
}
