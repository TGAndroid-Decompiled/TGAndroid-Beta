package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public abstract class n1 extends Drawable {
    public final int f24743a;
    public final Path f24744b;
    public final Paint f24745c;
    public final Object d;

    public n1(int i9) {
        this.f24743a = i9;
        switch (i9) {
            case 1:
                this.f24744b = new Path();
                Paint paint = new Paint(1);
                this.f24745c = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeJoin(Paint.Join.ROUND);
                paint.setStrokeCap(Paint.Cap.ROUND);
                this.d = new org.telegram.ui.Components.y5(new mh.m2(this, 20), 350L, gr.h, 0);
                return;
            default:
                Paint paint2 = new Paint(1);
                this.f24745c = paint2;
                paint2.setColor(-1);
                this.d = new RectF();
                this.f24744b = new Path();
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f24743a) {
            case 0:
                e();
                canvas.drawPath(this.f24744b, this.f24745c);
                return;
            default:
                float e10 = ((org.telegram.ui.Components.y5) this.d).e(true);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float width = getBounds().width();
                float f10 = 0.57f * width;
                Path path = this.f24744b;
                path.rewind();
                float f11 = f10 / 2.0f;
                path.moveTo(centerX - AndroidUtilities.lerp(f11, (-f10) / 2.0f, e10), centerY);
                float f12 = f11 + centerX;
                path.lineTo(f12, centerY);
                float f13 = f12 - (0.27f * width);
                float f14 = (0.54f * width) / 2.0f;
                path.moveTo(f13, centerY - f14);
                path.lineTo(f12, centerY);
                path.lineTo(f13, f14 + centerY);
                canvas.save();
                Paint paint = this.f24745c;
                paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                canvas.translate(0.0f, (-width) * 0.1f * e10);
                canvas.rotate(e10 * 90.0f, centerX, centerY);
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
        }
    }

    public abstract void e();

    @Override
    public int getIntrinsicHeight() {
        switch (this.f24743a) {
            case 1:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f24743a) {
            case 1:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f24743a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i9) {
        int i10 = this.f24743a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i9 = this.f24743a;
    }

    private final void a(int i9) {
    }

    private final void b(int i9) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
