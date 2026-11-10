package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class wj0 extends Drawable {
    public final zu f39985e;
    public final zu f39986f;
    public float h;
    public float f39988i;
    public final Rect f39982a = new Rect();
    public final wq f39983b = js.f35058b;
    public final int f39984c = org.telegram.messenger.g0.L(24.0f);
    public final int d = org.telegram.messenger.g0.L(24.0f);
    public long f39987g = -1;

    public wj0() {
        zu zuVar = new zu(1, (byte) 0);
        this.f39985e = zuVar;
        zuVar.f41121c.setColor(-2130706433);
        zu zuVar2 = new zu(1, (byte) 0);
        this.f39986f = zuVar2;
        zuVar2.f41121c.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f39983b.getInterpolation(f10);
        Rect rect = this.f39982a;
        rect.left = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.f39988i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.g0.L(4.0f) * this.f39988i));
        zu zuVar = this.f39986f;
        zuVar.setBounds(rect);
        zuVar.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(12.0f);
        rect.right = L2;
        rect.left = L2;
        int L3 = org.telegram.messenger.g0.L(8.0f);
        rect.bottom = L3;
        rect.top = L3;
        rect.inset(-org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 10, 11)), -org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 2, 3)));
        zu zuVar2 = this.f39985e;
        zuVar2.setBounds(rect);
        zuVar2.setAlpha(org.telegram.messenger.g0.W1(interpolation, 128, 255));
        zuVar2.draw(canvas);
    }

    public final void b(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f39983b.getInterpolation(f10);
        Rect rect = this.f39982a;
        rect.left = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.f39988i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.g0.L(4.0f) * this.f39988i));
        rect.offset(0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 0, -8)));
        zu zuVar = this.f39986f;
        zuVar.setBounds(rect);
        zuVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 1, 2)) * this.h);
        int N = (int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 5, 6)) * this.f39988i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 6, 4)) * this.f39988i));
        rect.offset(0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 0, 8)));
        zu zuVar2 = this.f39985e;
        zuVar2.setBounds(rect);
        zuVar2.setAlpha(255);
        zuVar2.draw(canvas);
    }

    public final void c(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f39983b.getInterpolation(f10);
        Rect rect = this.f39982a;
        rect.left = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.f39988i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.g0.L(4.0f) * this.f39988i));
        rect.offset(0, org.telegram.messenger.g0.L(-8.0f));
        zu zuVar = this.f39986f;
        zuVar.setBounds(rect);
        zuVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.g0.N(2.0f) * this.h);
        int N = (int) (org.telegram.messenger.g0.N(6.0f) * this.f39988i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.g0.N(4.0f) * this.f39988i));
        rect.offset(0, org.telegram.messenger.g0.L(8.0f));
        zu zuVar2 = this.f39985e;
        zuVar2.setBounds(rect);
        zuVar2.setAlpha(org.telegram.messenger.g0.W1(interpolation, 255, 128));
        zuVar2.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f39987g > 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f39987g);
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
                                        this.f39987g = System.currentTimeMillis();
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
        return this.f39984c;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.h = rect.width() / this.f39984c;
        this.f39988i = rect.height() / this.d;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f39985e.setColorFilter(colorFilter);
        this.f39986f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
