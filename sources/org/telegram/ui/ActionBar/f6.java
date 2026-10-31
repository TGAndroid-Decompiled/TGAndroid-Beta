package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class f6 extends Drawable {
    public final int f20327a = 1;
    public final int f20328b;
    public final int f20329c;
    public Object d;

    public f6(int i10, int i11, int i12) {
        this.f20328b = i10;
        this.f20329c = i12;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i10);
        paint.setColor(i11);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float f7;
        switch (this.f20327a) {
            case 0:
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.f20329c / 2.0f, (Paint) this.d);
                return;
            default:
                Rect bounds2 = getBounds();
                int i11 = this.f20329c;
                int i12 = this.f20328b;
                if (i12 == 7) {
                    if (((RectF) this.d) == null) {
                        this.d = new RectF();
                    }
                    ((RectF) this.d).set(bounds2);
                    if (i11 <= 0) {
                        f7 = org.telegram.messenger.i0.L(6.0f);
                    } else {
                        f7 = i11;
                    }
                    canvas.drawRoundRect((RectF) this.d, f7, f7, t6.f21323z);
                    return;
                }
                if (i12 != 1 && i12 != 6) {
                    if (i12 == 3) {
                        i10 = Math.max(bounds2.width(), bounds2.height()) / 2;
                    } else {
                        i10 = (int) Math.ceil(Math.sqrt(((bounds2.top - bounds2.centerY()) * (bounds2.top - bounds2.centerY())) + ((bounds2.left - bounds2.centerX()) * (bounds2.left - bounds2.centerX()))));
                    }
                } else {
                    if (i11 <= 0) {
                        i11 = org.telegram.messenger.i0.L(20.0f);
                    }
                    i10 = i11;
                }
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), i10, t6.f21323z);
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f20327a) {
            case 0:
                return this.f20329c + this.f20328b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f20327a) {
            case 0:
                return this.f20329c + this.f20328b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f20327a) {
            case 0:
                return -2;
            default:
                return 0;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f20327a) {
            case 0:
                ((Paint) this.d).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f20327a) {
            case 0:
                ((Paint) this.d).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public f6(int i10, int i11) {
        this.f20328b = i10;
        this.f20329c = i11;
    }

    private final void a(int i10) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
