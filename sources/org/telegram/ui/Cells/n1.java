package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
public abstract class n1 extends Drawable {
    public final int f21426a;
    public final Path f21427b;
    public final Paint f21428c;
    public final Object d;

    public n1(int i10) {
        this.f21426a = i10;
        switch (i10) {
            case 1:
                this.f21427b = new Path();
                Paint paint = new Paint(1);
                this.f21428c = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeJoin(Paint.Join.ROUND);
                paint.setStrokeCap(Paint.Cap.ROUND);
                this.d = new org.telegram.ui.Components.z5(new org.telegram.ui.web.o0(this, 4), 350L, nr.h, 0);
                return;
            default:
                Paint paint2 = new Paint(1);
                this.f21428c = paint2;
                paint2.setColor(-1);
                this.d = new RectF();
                this.f21427b = new Path();
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f21426a) {
            case 0:
                e();
                canvas.drawPath(this.f21427b, this.f21428c);
                return;
            default:
                float e = ((org.telegram.ui.Components.z5) this.d).e(true);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float width = getBounds().width();
                float f10 = 0.57f * width;
                Path path = this.f21427b;
                path.rewind();
                float f11 = f10 / 2.0f;
                path.moveTo(centerX - AndroidUtilities.lerp(f11, (-f10) / 2.0f, e), centerY);
                float f12 = f11 + centerX;
                path.lineTo(f12, centerY);
                float f13 = f12 - (0.27f * width);
                float f14 = (0.54f * width) / 2.0f;
                path.moveTo(f13, centerY - f14);
                path.lineTo(f12, centerY);
                path.lineTo(f13, f14 + centerY);
                canvas.save();
                Paint paint = this.f21428c;
                paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                canvas.translate(0.0f, (-width) * 0.1f * e);
                canvas.rotate(e * 90.0f, centerX, centerY);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
        }
    }

    public abstract void e();

    @Override
    public int getIntrinsicHeight() {
        switch (this.f21426a) {
            case 1:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f21426a) {
            case 1:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f21426a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f21426a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f21426a;
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
