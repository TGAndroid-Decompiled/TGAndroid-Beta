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
public final class cw0 extends org.telegram.ui.Components.wk0 {
    public final Paint T2;
    public final Path U2;
    public final fw0 V2;

    public cw0(fw0 fw0Var, Context context) {
        super(context, null);
        this.V2 = fw0Var;
        Paint paint = new Paint(1);
        this.T2 = paint;
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
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
        if (this.V2.f38361n.m0 >= 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.V2.f38361n.m0 >= 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.V2.f38361n;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = premiumPreviewFragment.d;
            if (i13 < arrayList.size()) {
                premiumPreviewFragment.I.a((hw0) arrayList.get(i13), false);
                premiumPreviewFragment.I.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
                ((hw0) arrayList.get(i13)).h = i14;
                i14 += premiumPreviewFragment.I.getMeasuredHeight();
                i13++;
            } else {
                premiumPreviewFragment.K = i14;
                return;
            }
        }
    }
}
