package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class zl0 extends Drawable {
    public final fw e;
    public final fw f29722f;
    public float h;
    public float f29724i;
    public final Rect f29719a = new Rect();
    public final wr f29720b = pt.f26247b;
    public final int f29721c = AndroidUtilities.dp(24.0f);
    public final int d = AndroidUtilities.dp(24.0f);
    public long f29723g = -1;

    public zl0() {
        fw fwVar = new fw();
        this.e = fwVar;
        fwVar.f23095c.setColor(-2130706433);
        fw fwVar2 = new fw();
        this.f29722f = fwVar2;
        fwVar2.f23095c.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f7) {
        Rect bounds = getBounds();
        float interpolation = this.f29720b.getInterpolation(f7);
        Rect rect = this.f29719a;
        rect.left = (int) (AndroidUtilities.dp(2.0f) * this.h);
        int dp = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.f29724i));
        rect.bottom = dp;
        rect.right = bounds.right - rect.left;
        rect.top = dp - ((int) (AndroidUtilities.dp(4.0f) * this.f29724i));
        fw fwVar = this.f29722f;
        fwVar.setBounds(rect);
        fwVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(12.0f);
        rect.right = dp2;
        rect.left = dp2;
        int dp3 = AndroidUtilities.dp(8.0f);
        rect.bottom = dp3;
        rect.top = dp3;
        rect.inset(-AndroidUtilities.dp(AndroidUtilities.lerp(10, 11, interpolation)), -AndroidUtilities.dp(AndroidUtilities.lerp(2, 3, interpolation)));
        fw fwVar2 = this.e;
        fwVar2.setBounds(rect);
        fwVar2.setAlpha(AndroidUtilities.lerp(128, 255, interpolation));
        fwVar2.draw(canvas);
    }

    public final void b(Canvas canvas, float f7) {
        Rect bounds = getBounds();
        float interpolation = this.f29720b.getInterpolation(f7);
        Rect rect = this.f29719a;
        rect.left = (int) (AndroidUtilities.dp(2.0f) * this.h);
        int dp = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.f29724i));
        rect.bottom = dp;
        rect.right = bounds.right - rect.left;
        rect.top = dp - ((int) (AndroidUtilities.dp(4.0f) * this.f29724i));
        rect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, -8, interpolation)));
        fw fwVar = this.f29722f;
        fwVar.setBounds(rect);
        fwVar.draw(canvas);
        rect.left = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(1, 2, interpolation)) * this.h);
        int dpf2 = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(5, 6, interpolation)) * this.f29724i);
        rect.top = dpf2;
        rect.right = bounds.right - rect.left;
        rect.bottom = dpf2 + ((int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(6, 4, interpolation)) * this.f29724i));
        rect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, 8, interpolation)));
        fw fwVar2 = this.e;
        fwVar2.setBounds(rect);
        fwVar2.setAlpha(255);
        fwVar2.draw(canvas);
    }

    public final void c(Canvas canvas, float f7) {
        Rect bounds = getBounds();
        float interpolation = this.f29720b.getInterpolation(f7);
        Rect rect = this.f29719a;
        rect.left = (int) (AndroidUtilities.dp(2.0f) * this.h);
        int dp = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.f29724i));
        rect.bottom = dp;
        rect.right = bounds.right - rect.left;
        rect.top = dp - ((int) (AndroidUtilities.dp(4.0f) * this.f29724i));
        rect.offset(0, AndroidUtilities.dp(-8.0f));
        fw fwVar = this.f29722f;
        fwVar.setBounds(rect);
        fwVar.draw(canvas);
        rect.left = (int) (AndroidUtilities.dpf2(2.0f) * this.h);
        int dpf2 = (int) (AndroidUtilities.dpf2(6.0f) * this.f29724i);
        rect.top = dpf2;
        rect.right = bounds.right - rect.left;
        rect.bottom = dpf2 + ((int) (AndroidUtilities.dpf2(4.0f) * this.f29724i));
        rect.offset(0, AndroidUtilities.dp(8.0f));
        fw fwVar2 = this.e;
        fwVar2.setBounds(rect);
        fwVar2.setAlpha(AndroidUtilities.lerp(255, 128, interpolation));
        fwVar2.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f29723g > 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f29723g);
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
                                        this.f29723g = System.currentTimeMillis();
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
        return this.f29721c;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.h = rect.width() / this.f29721c;
        this.f29724i = rect.height() / this.d;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        this.f29722f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
