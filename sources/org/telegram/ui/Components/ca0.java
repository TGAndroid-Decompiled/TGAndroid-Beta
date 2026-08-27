package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.ViewGroup;

public final class ca0 extends Drawable {

    public Paint f27391a;

    public Paint f27392b;

    public long f27393c;
    public float d;

    public boolean f27394e;

    public boolean f27395f;

    public float f27396g;
    public float h;

    public float f27397i;

    public float f27398j;

    public float f27399k;

    public long f27400l;

    public org.telegram.ui.Cells.s1 f27401m;

    public final void a() {
        Rect bounds = getBounds();
        float fCenterX = bounds.centerX();
        float fCenterY = bounds.centerY();
        int i10 = bounds.left;
        int i11 = bounds.top;
        this.f27396g = (float) Math.ceil(Math.sqrt(com.google.android.recaptcha.internal.a.z(i11, fCenterY, i11 - fCenterY, (i10 - fCenterX) * (i10 - fCenterX))));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint = this.f27391a;
        float f11 = this.d;
        if (f11 == 1.0f) {
            Rect bounds = getBounds();
            Paint paint2 = this.f27392b;
            if (paint2 != null) {
                paint = paint2;
            }
            canvas.drawRect(bounds, paint);
        } else if (f11 != 0.0f) {
            float interpolation = this.f27394e ? er.h.getInterpolation(f11) : 1.0f - er.h.getInterpolation(1.0f - f11);
            Rect bounds2 = getBounds();
            float fCenterX = bounds2.centerX();
            float fCenterY = bounds2.centerY();
            float f12 = this.f27398j;
            if (f12 >= 0.0f) {
                f10 = this.f27399k;
                if (f10 < 0.0f) {
                    f12 = this.h;
                    if (f12 >= 0.0f) {
                        f10 = this.f27397i;
                        if (f10 < 0.0f) {
                            f10 = fCenterY;
                            f12 = fCenterX;
                        }
                    } else {
                        f10 = fCenterY;
                        f12 = fCenterX;
                    }
                }
            } else {
                f12 = this.h;
                if (f12 >= 0.0f) {
                    f10 = this.f27397i;
                    if (f10 < 0.0f) {
                        f10 = fCenterY;
                        f12 = fCenterX;
                    }
                } else {
                    f10 = fCenterY;
                    f12 = fCenterX;
                }
            }
            float f13 = 1.0f - interpolation;
            float fZ = com.google.android.recaptcha.internal.a.z(f12, fCenterX, f13, fCenterX);
            float fZ2 = com.google.android.recaptcha.internal.a.z(f10, fCenterY, f13, fCenterY);
            float f14 = this.f27396g * interpolation;
            Paint paint3 = this.f27392b;
            if (paint3 != null) {
                paint = paint3;
            }
            canvas.drawCircle(fZ, fZ2, f14, paint);
        }
        if (this.f27395f) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f27393c;
            if (j10 > 20) {
                j10 = 17;
            }
            this.f27393c = jElapsedRealtime;
            if (this.f27394e) {
                float f15 = (j10 / 240.0f) + this.d;
                this.d = f15;
                if (f15 >= 1.0f) {
                    this.d = 1.0f;
                    this.h = -1.0f;
                    this.f27397i = -1.0f;
                    this.f27398j = -1.0f;
                    this.f27399k = -1.0f;
                    this.f27395f = false;
                }
            } else {
                float f16 = this.d - (j10 / 240.0f);
                this.d = f16;
                if (f16 <= 0.0f) {
                    this.d = 0.0f;
                    this.h = -1.0f;
                    this.f27397i = -1.0f;
                    this.f27398j = -1.0f;
                    this.f27399k = -1.0f;
                    this.f27395f = false;
                }
            }
            org.telegram.ui.Cells.s1 s1Var = this.f27401m;
            if (s1Var != null) {
                s1Var.invalidate();
                if (s1Var.getParent() != null) {
                    ((ViewGroup) s1Var.getParent()).invalidate();
                }
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27391a.setAlpha(i10);
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27391a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
