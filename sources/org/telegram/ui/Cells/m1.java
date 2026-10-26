package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
public abstract class m1 extends Drawable {
    public final int f24418a;
    public final Path f24419b;
    public final Paint f24420c;
    public final Object d;

    public m1(int i10) {
        this.f24418a = i10;
        switch (i10) {
            case 1:
                this.f24419b = new Path();
                Paint paint = new Paint(1);
                this.f24420c = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeJoin(Paint.Join.ROUND);
                paint.setStrokeCap(Paint.Cap.ROUND);
                this.d = new org.telegram.ui.Components.h6(new org.telegram.ui.web.h1(this, 1), 350L, ds.h, 0);
                return;
            default:
                Paint paint2 = new Paint(1);
                this.f24420c = paint2;
                paint2.setColor(-1);
                this.d = new RectF();
                this.f24419b = new Path();
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f24418a) {
            case 0:
                e();
                canvas.drawPath(this.f24419b, this.f24420c);
                return;
            default:
                float e = ((org.telegram.ui.Components.h6) this.d).e(true);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float width = getBounds().width();
                float f7 = 0.57f * width;
                Path path = this.f24419b;
                path.rewind();
                float f10 = f7 / 2.0f;
                path.moveTo(centerX - AndroidUtilities.lerp(f10, (-f7) / 2.0f, e), centerY);
                float f11 = f10 + centerX;
                path.lineTo(f11, centerY);
                float f12 = f11 - (0.27f * width);
                float f13 = (0.54f * width) / 2.0f;
                path.moveTo(f12, centerY - f13);
                path.lineTo(f11, centerY);
                path.lineTo(f12, f13 + centerY);
                canvas.save();
                Paint paint = this.f24420c;
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
        switch (this.f24418a) {
            case 1:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f24418a) {
            case 1:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f24418a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f24418a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f24418a;
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
