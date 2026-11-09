package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class xj0 extends Drawable {
    public final av f40400e;
    public final av f40401f;
    public float h;
    public float f40403i;
    public final Rect f40397a = new Rect();
    public final xq f40398b = ks.f35467b;
    public final int f40399c = org.telegram.messenger.g0.L(24.0f);
    public final int d = org.telegram.messenger.g0.L(24.0f);
    public long f40402g = -1;

    public xj0() {
        av avVar = new av(1, (byte) 0);
        this.f40400e = avVar;
        avVar.f31984c.setColor(-2130706433);
        av avVar2 = new av(1, (byte) 0);
        this.f40401f = avVar2;
        avVar2.f31984c.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f40398b.getInterpolation(f10);
        Rect rect = this.f40397a;
        rect.left = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.f40403i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.g0.L(4.0f) * this.f40403i));
        av avVar = this.f40401f;
        avVar.setBounds(rect);
        avVar.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(12.0f);
        rect.right = L2;
        rect.left = L2;
        int L3 = org.telegram.messenger.g0.L(8.0f);
        rect.bottom = L3;
        rect.top = L3;
        rect.inset(-org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 10, 11)), -org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 2, 3)));
        av avVar2 = this.f40400e;
        avVar2.setBounds(rect);
        avVar2.setAlpha(org.telegram.messenger.g0.W1(interpolation, 128, 255));
        avVar2.draw(canvas);
    }

    public final void b(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f40398b.getInterpolation(f10);
        Rect rect = this.f40397a;
        rect.left = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.f40403i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.g0.L(4.0f) * this.f40403i));
        rect.offset(0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 0, -8)));
        av avVar = this.f40401f;
        avVar.setBounds(rect);
        avVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 1, 2)) * this.h);
        int N = (int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 5, 6)) * this.f40403i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 6, 4)) * this.f40403i));
        rect.offset(0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 0, 8)));
        av avVar2 = this.f40400e;
        avVar2.setBounds(rect);
        avVar2.setAlpha(255);
        avVar2.draw(canvas);
    }

    public final void c(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f40398b.getInterpolation(f10);
        Rect rect = this.f40397a;
        rect.left = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.f40403i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.g0.L(4.0f) * this.f40403i));
        rect.offset(0, org.telegram.messenger.g0.L(-8.0f));
        av avVar = this.f40401f;
        avVar.setBounds(rect);
        avVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.g0.N(2.0f) * this.h);
        int N = (int) (org.telegram.messenger.g0.N(6.0f) * this.f40403i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.g0.N(4.0f) * this.f40403i));
        rect.offset(0, org.telegram.messenger.g0.L(8.0f));
        av avVar2 = this.f40400e;
        avVar2.setBounds(rect);
        avVar2.setAlpha(org.telegram.messenger.g0.W1(interpolation, 255, 128));
        avVar2.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f40402g > 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f40402g);
            int i7 = currentTimeMillis - 300;
            if (i7 >= 0) {
                if (i7 < 150) {
                    a(canvas, i7 / 150.0f);
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
                                        this.f40402g = System.currentTimeMillis();
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
        return this.f40399c;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.h = rect.width() / this.f40399c;
        this.f40403i = rect.height() / this.d;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40400e.setColorFilter(colorFilter);
        this.f40401f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
