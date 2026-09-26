package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ti0 extends Drawable {
    public Path f28544a;
    public Paint f28545b;
    public float f28546c;

    public final void a() {
        int dp = AndroidUtilities.dp(18.0f);
        Path path = this.f28544a;
        path.reset();
        float f7 = dp >> 1;
        path.moveTo(f7, AndroidUtilities.dpf2(4.98f));
        path.lineTo(AndroidUtilities.dpf2(4.95f), AndroidUtilities.dpf2(9.0f));
        path.lineTo(dp - AndroidUtilities.dpf2(4.95f), AndroidUtilities.dpf2(9.0f));
        path.lineTo(f7, AndroidUtilities.dpf2(4.98f));
        Paint paint = this.f28545b;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        this.f28546c = AndroidUtilities.density;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f28545b;
        if (this.f28546c != AndroidUtilities.density) {
            a();
        }
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        canvas.drawPath(this.f28544a, paint);
        canvas.drawRect(AndroidUtilities.dpf2(7.56f), AndroidUtilities.dpf2(8.0f), AndroidUtilities.dp(18.0f) - AndroidUtilities.dpf2(7.56f), AndroidUtilities.dpf2(11.1f), paint);
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
