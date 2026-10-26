package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class dz extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public Paint f38955a;
    public float[] f38956b;
    public Path f38957c;
    public float d;

    public final void a(float f7, float f10) {
        float[] fArr = this.f38956b;
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
        Path path = this.f38957c;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, measuredWidth - AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.d), getMeasuredHeight());
        a(AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.d));
        float[] fArr = this.f38956b;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        Paint paint = this.f38955a;
        canvas.drawPath(path, paint);
        path.rewind();
        rectF.set(measuredWidth + AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.d), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        a(AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.d), AndroidUtilities.dp(8.0f));
        path.addRoundRect(rectF, fArr, direction);
        canvas.drawPath(path, paint);
    }

    @Override
    public final void updateColors() {
        try {
            this.f38955a.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
