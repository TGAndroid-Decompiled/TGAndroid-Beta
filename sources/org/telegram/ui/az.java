package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class az extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public Paint f35909a;
    public float[] f35910b;
    public Path f35911c;
    public float d;

    public final void a(float f7, float f10) {
        float[] fArr = this.f35910b;
        fArr[7] = f7;
        fArr[6] = f7;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        Path path = this.f35911c;
        path.rewind();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, measuredWidth - org.telegram.messenger.i0.W1(this.d, 0, org.telegram.messenger.i0.L(4.0f)), getMeasuredHeight());
        a(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.W1(this.d, 0, org.telegram.messenger.i0.L(8.0f)));
        float[] fArr = this.f35910b;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        Paint paint = this.f35909a;
        canvas.drawPath(path, paint);
        path.rewind();
        rectF.set(measuredWidth + org.telegram.messenger.i0.W1(this.d, 0, org.telegram.messenger.i0.L(4.0f)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        a(org.telegram.messenger.i0.W1(this.d, 0, org.telegram.messenger.i0.L(8.0f)), org.telegram.messenger.i0.L(8.0f));
        path.addRoundRect(rectF, fArr, direction);
        canvas.drawPath(path, paint);
    }

    @Override
    public final void updateColors() {
        try {
            this.f35909a.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
