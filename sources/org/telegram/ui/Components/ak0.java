package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class ak0 extends Drawable {
    public final yu f31866e;
    public final yu f31867f;
    public float h;
    public float f31869i;
    public final Rect f31863a = new Rect();
    public final xq f31864b = ks.f35475b;
    public final int f31865c = org.telegram.messenger.g0.L(24.0f);
    public final int d = org.telegram.messenger.g0.L(24.0f);
    public long f31868g = -1;

    public ak0() {
        yu yuVar = new yu(1, (byte) 0);
        this.f31866e = yuVar;
        yuVar.f40836c.setColor(-2130706433);
        yu yuVar2 = new yu(1, (byte) 0);
        this.f31867f = yuVar2;
        yuVar2.f40836c.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f31864b.getInterpolation(f10);
        Rect rect = this.f31863a;
        rect.left = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.f31869i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.g0.L(4.0f) * this.f31869i));
        yu yuVar = this.f31867f;
        yuVar.setBounds(rect);
        yuVar.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(12.0f);
        rect.right = L2;
        rect.left = L2;
        int L3 = org.telegram.messenger.g0.L(8.0f);
        rect.bottom = L3;
        rect.top = L3;
        rect.inset(-org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 10, 11)), -org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 2, 3)));
        yu yuVar2 = this.f31866e;
        yuVar2.setBounds(rect);
        yuVar2.setAlpha(org.telegram.messenger.g0.W1(interpolation, 128, 255));
        yuVar2.draw(canvas);
    }

    public final void b(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f31864b.getInterpolation(f10);
        Rect rect = this.f31863a;
        rect.left = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.f31869i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.g0.L(4.0f) * this.f31869i));
        rect.offset(0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 0, -8)));
        yu yuVar = this.f31867f;
        yuVar.setBounds(rect);
        yuVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 1, 2)) * this.h);
        int N = (int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 5, 6)) * this.f31869i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 6, 4)) * this.f31869i));
        rect.offset(0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 0, 8)));
        yu yuVar2 = this.f31866e;
        yuVar2.setBounds(rect);
        yuVar2.setAlpha(255);
        yuVar2.draw(canvas);
    }

    public final void c(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f31864b.getInterpolation(f10);
        Rect rect = this.f31863a;
        rect.left = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.f31869i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.g0.L(4.0f) * this.f31869i));
        rect.offset(0, org.telegram.messenger.g0.L(-8.0f));
        yu yuVar = this.f31867f;
        yuVar.setBounds(rect);
        yuVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.g0.N(2.0f) * this.h);
        int N = (int) (org.telegram.messenger.g0.N(6.0f) * this.f31869i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.g0.N(4.0f) * this.f31869i));
        rect.offset(0, org.telegram.messenger.g0.L(8.0f));
        yu yuVar2 = this.f31866e;
        yuVar2.setBounds(rect);
        yuVar2.setAlpha(org.telegram.messenger.g0.W1(interpolation, 255, 128));
        yuVar2.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f31868g > 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f31868g);
            int i3 = currentTimeMillis - 300;
            if (i3 >= 0) {
                if (i3 < 150) {
                    a(canvas, i3 / 150.0f);
                } else {
                    int i10 = currentTimeMillis - 750;
                    if (i10 >= 0) {
                        if (i10 < 200) {
                            b(canvas, i10 / 200.0f);
                        } else {
                            int i11 = currentTimeMillis - 1250;
                            if (i11 >= 0) {
                                if (i11 < 150) {
                                    c(canvas, i11 / 150.0f);
                                } else {
                                    c(canvas, 1.0f);
                                    if (currentTimeMillis - 1400 >= 100) {
                                        this.f31868g = System.currentTimeMillis();
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
        return this.f31865c;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.h = rect.width() / this.f31865c;
        this.f31869i = rect.height() / this.d;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31866e.setColorFilter(colorFilter);
        this.f31867f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i3) {
    }
}
