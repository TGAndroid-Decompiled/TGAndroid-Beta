package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public abstract class m1 extends Drawable {

    public final int f24650a;

    public final Path f24651b;

    public final Paint f24652c;
    public final Object d;

    public m1(int i10) {
        this.f24650a = i10;
        switch (i10) {
            case 1:
                this.f24651b = new Path();
                Paint paint = new Paint(1);
                this.f24652c = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeJoin(Paint.Join.ROUND);
                paint.setStrokeCap(Paint.Cap.ROUND);
                this.d = new org.telegram.ui.Components.y5(new nh.f0(this, 26), 350L, er.h, 0);
                break;
            default:
                Paint paint2 = new Paint(1);
                this.f24652c = paint2;
                paint2.setColor(-1);
                this.d = new RectF();
                this.f24651b = new Path();
                break;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f24650a) {
            case 0:
                e();
                canvas.drawPath(this.f24651b, this.f24652c);
                break;
            default:
                float fE = ((org.telegram.ui.Components.y5) this.d).e(true);
                float fCenterX = getBounds().centerX();
                float fCenterY = getBounds().centerY();
                float fWidth = getBounds().width();
                float f10 = 0.57f * fWidth;
                Path path = this.f24651b;
                path.rewind();
                float f11 = f10 / 2.0f;
                path.moveTo(fCenterX - AndroidUtilities.lerp(f11, (-f10) / 2.0f, fE), fCenterY);
                float f12 = f11 + fCenterX;
                path.lineTo(f12, fCenterY);
                float f13 = f12 - (0.27f * fWidth);
                float f14 = (0.54f * fWidth) / 2.0f;
                path.moveTo(f13, fCenterY - f14);
                path.lineTo(f12, fCenterY);
                path.lineTo(f13, f14 + fCenterY);
                canvas.save();
                float fDp = AndroidUtilities.dp(2.0f);
                Paint paint = this.f24652c;
                paint.setStrokeWidth(fDp);
                canvas.translate(0.0f, (-fWidth) * 0.1f * fE);
                canvas.rotate(fE * 90.0f, fCenterX, fCenterY);
                canvas.drawPath(path, paint);
                canvas.restore();
                break;
        }
    }

    public abstract void e();

    @Override
    public int getIntrinsicHeight() {
        switch (this.f24650a) {
            case 1:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f24650a) {
            case 1:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f24650a) {
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f24650a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f24650a;
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
