package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class qm0 extends Drawable {
    public final nw e;
    public final nw f28648f;
    public float h;
    public float f28650i;
    public final Rect f28645a = new Rect();
    public final es f28646b = xt.f31325b;
    public final int f28647c = AndroidUtilities.dp(24.0f);
    public final int d = AndroidUtilities.dp(24.0f);
    public long f28649g = -1;

    public qm0() {
        nw nwVar = new nw();
        this.e = nwVar;
        nwVar.f27733c.setColor(-2130706433);
        nw nwVar2 = new nw();
        this.f28648f = nwVar2;
        nwVar2.f27733c.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f7) {
        Rect bounds = getBounds();
        float interpolation = this.f28646b.getInterpolation(f7);
        Rect rect = this.f28645a;
        rect.left = (int) (AndroidUtilities.dp(2.0f) * this.h);
        int dp = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.f28650i));
        rect.bottom = dp;
        rect.right = bounds.right - rect.left;
        rect.top = dp - ((int) (AndroidUtilities.dp(4.0f) * this.f28650i));
        nw nwVar = this.f28648f;
        nwVar.setBounds(rect);
        nwVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(12.0f);
        rect.right = dp2;
        rect.left = dp2;
        int dp3 = AndroidUtilities.dp(8.0f);
        rect.bottom = dp3;
        rect.top = dp3;
        rect.inset(-AndroidUtilities.dp(AndroidUtilities.lerp(10, 11, interpolation)), -AndroidUtilities.dp(AndroidUtilities.lerp(2, 3, interpolation)));
        nw nwVar2 = this.e;
        nwVar2.setBounds(rect);
        nwVar2.setAlpha(AndroidUtilities.lerp(128, 255, interpolation));
        nwVar2.draw(canvas);
    }

    public final void b(Canvas canvas, float f7) {
        Rect bounds = getBounds();
        float interpolation = this.f28646b.getInterpolation(f7);
        Rect rect = this.f28645a;
        rect.left = (int) (AndroidUtilities.dp(2.0f) * this.h);
        int dp = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.f28650i));
        rect.bottom = dp;
        rect.right = bounds.right - rect.left;
        rect.top = dp - ((int) (AndroidUtilities.dp(4.0f) * this.f28650i));
        rect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, -8, interpolation)));
        nw nwVar = this.f28648f;
        nwVar.setBounds(rect);
        nwVar.draw(canvas);
        rect.left = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(1, 2, interpolation)) * this.h);
        int dpf2 = (int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(5, 6, interpolation)) * this.f28650i);
        rect.top = dpf2;
        rect.right = bounds.right - rect.left;
        rect.bottom = dpf2 + ((int) (AndroidUtilities.dpf2(AndroidUtilities.lerp(6, 4, interpolation)) * this.f28650i));
        rect.offset(0, AndroidUtilities.dp(AndroidUtilities.lerp(0, 8, interpolation)));
        nw nwVar2 = this.e;
        nwVar2.setBounds(rect);
        nwVar2.setAlpha(255);
        nwVar2.draw(canvas);
    }

    public final void c(Canvas canvas, float f7) {
        Rect bounds = getBounds();
        float interpolation = this.f28646b.getInterpolation(f7);
        Rect rect = this.f28645a;
        rect.left = (int) (AndroidUtilities.dp(2.0f) * this.h);
        int dp = bounds.bottom - ((int) (AndroidUtilities.dp(6.0f) * this.f28650i));
        rect.bottom = dp;
        rect.right = bounds.right - rect.left;
        rect.top = dp - ((int) (AndroidUtilities.dp(4.0f) * this.f28650i));
        rect.offset(0, AndroidUtilities.dp(-8.0f));
        nw nwVar = this.f28648f;
        nwVar.setBounds(rect);
        nwVar.draw(canvas);
        rect.left = (int) (AndroidUtilities.dpf2(2.0f) * this.h);
        int dpf2 = (int) (AndroidUtilities.dpf2(6.0f) * this.f28650i);
        rect.top = dpf2;
        rect.right = bounds.right - rect.left;
        rect.bottom = dpf2 + ((int) (AndroidUtilities.dpf2(4.0f) * this.f28650i));
        rect.offset(0, AndroidUtilities.dp(8.0f));
        nw nwVar2 = this.e;
        nwVar2.setBounds(rect);
        nwVar2.setAlpha(AndroidUtilities.lerp(255, 128, interpolation));
        nwVar2.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f28649g > 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f28649g);
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
                                        this.f28649g = System.currentTimeMillis();
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
        return this.f28647c;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.h = rect.width() / this.f28647c;
        this.f28650i = rect.height() / this.d;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        this.f28648f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
