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
public final class ax0 extends org.telegram.ui.Components.zl0 {
    public final Paint f34938e3;
    public final Path f34939f3;
    public final dx0 f34940g3;

    public ax0(dx0 dx0Var, Context context) {
        super(context, null);
        this.f34940g3 = dx0Var;
        Paint paint = new Paint(1);
        this.f34938e3 = paint;
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20894h5, false));
        this.f34939f3 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.f34939f3;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
        canvas.drawPath(path, this.f34938e3);
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f34940g3.f35861n.f34143q0 >= 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f34940g3.f35861n.f34143q0 >= 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.f34940g3.f35861n;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            ArrayList arrayList = premiumPreviewFragment.d;
            if (i14 < arrayList.size()) {
                premiumPreviewFragment.M.a((fx0) arrayList.get(i14), false);
                premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
                ((fx0) arrayList.get(i14)).h = i15;
                i15 += premiumPreviewFragment.M.getMeasuredHeight();
                i14++;
            } else {
                premiumPreviewFragment.O = i15;
                return;
            }
        }
    }
}
