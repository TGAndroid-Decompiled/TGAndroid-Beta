package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ri0 extends Drawable {
    public Path f27906a;
    public Paint f27907b;
    public float f27908c;

    public final void a() {
        int dp = AndroidUtilities.dp(18.0f);
        Path path = this.f27906a;
        path.reset();
        float f7 = dp >> 1;
        path.moveTo(f7, AndroidUtilities.dpf2(4.98f));
        path.lineTo(AndroidUtilities.dpf2(4.95f), AndroidUtilities.dpf2(9.0f));
        path.lineTo(dp - AndroidUtilities.dpf2(4.95f), AndroidUtilities.dpf2(9.0f));
        path.lineTo(f7, AndroidUtilities.dpf2(4.98f));
        Paint paint = this.f27907b;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        this.f27908c = AndroidUtilities.density;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f27907b;
        if (this.f27908c != AndroidUtilities.density) {
            a();
        }
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        canvas.drawPath(this.f27906a, paint);
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
