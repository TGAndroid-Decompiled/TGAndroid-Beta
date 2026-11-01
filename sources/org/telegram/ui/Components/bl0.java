package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class bl0 extends Drawable {
    public final lv e;
    public final lv f24884f;
    public float h;
    public float f24886i;
    public final Rect f24881a = new Rect();
    public final gr f24882b = vs.f31897b;
    public final int f24883c = org.telegram.messenger.i0.L(24.0f);
    public final int d = org.telegram.messenger.i0.L(24.0f);
    public long f24885g = -1;

    public bl0() {
        lv lvVar = new lv(1, (byte) 0);
        this.e = lvVar;
        lvVar.f28292c.setColor(-2130706433);
        lv lvVar2 = new lv(1, (byte) 0);
        this.f24884f = lvVar2;
        lvVar2.f28292c.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f7) {
        Rect bounds = getBounds();
        float interpolation = this.f24882b.getInterpolation(f7);
        Rect rect = this.f24881a;
        rect.left = (int) (org.telegram.messenger.i0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.i0.L(6.0f) * this.f24886i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.i0.L(4.0f) * this.f24886i));
        lv lvVar = this.f24884f;
        lvVar.setBounds(rect);
        lvVar.draw(canvas);
        int L2 = org.telegram.messenger.i0.L(12.0f);
        rect.right = L2;
        rect.left = L2;
        int L3 = org.telegram.messenger.i0.L(8.0f);
        rect.bottom = L3;
        rect.top = L3;
        rect.inset(-org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(interpolation, 10, 11)), -org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(interpolation, 2, 3)));
        lv lvVar2 = this.e;
        lvVar2.setBounds(rect);
        lvVar2.setAlpha(org.telegram.messenger.i0.W1(interpolation, 128, 255));
        lvVar2.draw(canvas);
    }

    public final void b(Canvas canvas, float f7) {
        Rect bounds = getBounds();
        float interpolation = this.f24882b.getInterpolation(f7);
        Rect rect = this.f24881a;
        rect.left = (int) (org.telegram.messenger.i0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.i0.L(6.0f) * this.f24886i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.i0.L(4.0f) * this.f24886i));
        rect.offset(0, org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(interpolation, 0, -8)));
        lv lvVar = this.f24884f;
        lvVar.setBounds(rect);
        lvVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.i0.N(org.telegram.messenger.i0.W1(interpolation, 1, 2)) * this.h);
        int N = (int) (org.telegram.messenger.i0.N(org.telegram.messenger.i0.W1(interpolation, 5, 6)) * this.f24886i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.i0.N(org.telegram.messenger.i0.W1(interpolation, 6, 4)) * this.f24886i));
        rect.offset(0, org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(interpolation, 0, 8)));
        lv lvVar2 = this.e;
        lvVar2.setBounds(rect);
        lvVar2.setAlpha(255);
        lvVar2.draw(canvas);
    }

    public final void c(Canvas canvas, float f7) {
        Rect bounds = getBounds();
        float interpolation = this.f24882b.getInterpolation(f7);
        Rect rect = this.f24881a;
        rect.left = (int) (org.telegram.messenger.i0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.i0.L(6.0f) * this.f24886i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.i0.L(4.0f) * this.f24886i));
        rect.offset(0, org.telegram.messenger.i0.L(-8.0f));
        lv lvVar = this.f24884f;
        lvVar.setBounds(rect);
        lvVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.i0.N(2.0f) * this.h);
        int N = (int) (org.telegram.messenger.i0.N(6.0f) * this.f24886i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.i0.N(4.0f) * this.f24886i));
        rect.offset(0, org.telegram.messenger.i0.L(8.0f));
        lv lvVar2 = this.e;
        lvVar2.setBounds(rect);
        lvVar2.setAlpha(org.telegram.messenger.i0.W1(interpolation, 255, 128));
        lvVar2.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f24885g > 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f24885g);
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
                                        this.f24885g = System.currentTimeMillis();
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
        return this.f24883c;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.h = rect.width() / this.f24883c;
        this.f24886i = rect.height() / this.d;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        this.f24884f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
