package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class xl0 extends Drawable {
    public final wv e;
    public final wv f30694f;
    public float h;
    public float f30696i;
    public final Rect f30691a = new Rect();
    public final nr f30692b = gt.f25246b;
    public final int f30693c = AndroidUtilities.dp(24.0f);
    public final int d = AndroidUtilities.dp(24.0f);
    public long f30695g = -1;

    public xl0() {
        wv wvVar = new wv();
        this.e = wvVar;
        wvVar.f30429c.setColor(-2130706433);
        wv wvVar2 = new wv();
        this.f30694f = wvVar2;
        wvVar2.f30429c.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f30692b.getInterpolation(f10);
        Rect rect = this.f30691a;
        rect.left = (int) (AndroidUtilities.dp(2.0f) * this.h);
        int dp = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.f30696i));
        rect.bottom = dp;
        rect.right = bounds.right - rect.left;
        rect.top = dp - ((int) (AndroidUtilities.dp(4.0f) * this.f30696i));
        wv wvVar = this.f30694f;
        wvVar.setBounds(rect);
        wvVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(12.0f);
        rect.right = dp2;
        rect.left = dp2;
        int dp3 = AndroidUtilities.dp(8.0f);
        rect.bottom = dp3;
        rect.top = dp3;
        rect.inset(-AndroidUtilities.dp(AndroidUtilities.lerp(10, 11, interpolation)), -AndroidUtilities.dp(AndroidUtilities.lerp(2, 3, interpolation)));
        wv wvVar2 = this.e;
        wvVar2.setBounds(rect);
        wvVar2.setAlpha(AndroidUtilities.lerp(128, 255, interpolation));
        wvVar2.draw(canvas);
    }

    public final void b(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f30692b.getInterpolation(f10);
        Rect rect = this.f30691a;
        rect.left = (int) (AndroidUtilities.dp(2.0f) * this.h);
        int dp = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.f30696i));
        rect.bottom = dp;
        rect.right = bounds.right - rect.left;
        rect.top = dp - ((int) (AndroidUtilities.dp(4.0f) * this.f30696i));
        rect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, -8, interpolation)));
        wv wvVar = this.f30694f;
        wvVar.setBounds(rect);
        wvVar.draw(canvas);
        rect.left = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(1, 2, interpolation)) * this.h);
        int dpf2 = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(5, 6, interpolation)) * this.f30696i);
        rect.top = dpf2;
        rect.right = bounds.right - rect.left;
        rect.bottom = dpf2 + ((int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(6, 4, interpolation)) * this.f30696i));
        rect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, 8, interpolation)));
        wv wvVar2 = this.e;
        wvVar2.setBounds(rect);
        wvVar2.setAlpha(255);
        wvVar2.draw(canvas);
    }

    public final void c(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f30692b.getInterpolation(f10);
        Rect rect = this.f30691a;
        rect.left = (int) (AndroidUtilities.dp(2.0f) * this.h);
        int dp = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.f30696i));
        rect.bottom = dp;
        rect.right = bounds.right - rect.left;
        rect.top = dp - ((int) (AndroidUtilities.dp(4.0f) * this.f30696i));
        rect.offset(0, AndroidUtilities.dp(-8.0f));
        wv wvVar = this.f30694f;
        wvVar.setBounds(rect);
        wvVar.draw(canvas);
        rect.left = (int) (AndroidUtilities.dpf2(2.0f) * this.h);
        int dpf2 = (int) (AndroidUtilities.dpf2(6.0f) * this.f30696i);
        rect.top = dpf2;
        rect.right = bounds.right - rect.left;
        rect.bottom = dpf2 + ((int) (AndroidUtilities.dpf2(4.0f) * this.f30696i));
        rect.offset(0, AndroidUtilities.dp(8.0f));
        wv wvVar2 = this.e;
        wvVar2.setBounds(rect);
        wvVar2.setAlpha(AndroidUtilities.lerp(255, 128, interpolation));
        wvVar2.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f30695g > 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f30695g);
            int i10 = currentTimeMillis - 300;
            if (i10 >= 0) {
                if (i10 < 150) {
                    a(canvas, i10 / 150.0f);
                } else {
                    int i11 = currentTimeMillis - 750;
                    if (i11 >= 0) {
                        if (i11 < 200) {
                            b(canvas, i11 / 200.0f);
                        } else {
                            int i12 = currentTimeMillis - 1250;
                            if (i12 >= 0) {
                                if (i12 < 150) {
                                    c(canvas, i12 / 150.0f);
                                } else {
                                    c(canvas, 1.0f);
                                    if (currentTimeMillis - 1400 >= 100) {
                                        this.f30695g = System.currentTimeMillis();
                                    }
                                }
                            } else {
                                b(canvas, 1.0f);
                            }
                        }
                    } else {
                        a(canvas, 1.0f);
                    }
                }
            } else {
                a(canvas, 0.0f);
            }
            invalidateSelf();
            return;
        }
        a(canvas, 0.0f);
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f30693c;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.h = rect.width() / this.f30693c;
        this.f30696i = rect.height() / this.d;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        this.f30694f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
