package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class v5 extends Drawable {
    public final int f28664a = 1;
    public final int f28665b;
    public final int f28666c;
    public Object d;

    public v5(int i7, int i10, int i11) {
        this.f28665b = i7;
        this.f28666c = i11;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i7);
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        float f10;
        switch (this.f28664a) {
            case 0:
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.f28666c / 2.0f, (Paint) this.d);
                return;
            default:
                Rect bounds2 = getBounds();
                int i10 = this.f28666c;
                int i11 = this.f28665b;
                if (i11 == 7) {
                    if (((RectF) this.d) == null) {
                        this.d = new RectF();
                    }
                    ((RectF) this.d).set(bounds2);
                    if (i10 <= 0) {
                        f10 = org.telegram.messenger.g0.L(6.0f);
                    } else {
                        f10 = i10;
                    }
                    canvas.drawRoundRect((RectF) this.d, f10, f10, k6.f28252z);
                    return;
                }
                if (i11 != 1 && i11 != 6) {
                    if (i11 == 3) {
                        i7 = Math.max(bounds2.width(), bounds2.height()) / 2;
                    } else {
                        i7 = (int) Math.ceil(Math.sqrt(((bounds2.top - bounds2.centerY()) * (bounds2.top - bounds2.centerY())) + ((bounds2.left - bounds2.centerX()) * (bounds2.left - bounds2.centerX()))));
                    }
                } else {
                    if (i10 <= 0) {
                        i10 = org.telegram.messenger.g0.L(20.0f);
                    }
                    i7 = i10;
                }
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), i7, k6.f28252z);
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f28664a) {
            case 0:
                return this.f28666c + this.f28665b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f28664a) {
            case 0:
                return this.f28666c + this.f28665b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f28664a) {
            case 0:
                return -2;
            default:
                return 0;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f28664a) {
            case 0:
                ((Paint) this.d).setAlpha(i7);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f28664a) {
            case 0:
                ((Paint) this.d).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public v5(int i7, int i10) {
        this.f28665b = i7;
        this.f28666c = i10;
    }

    private final void a(int i7) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
