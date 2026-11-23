package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class lk0 extends Drawable {
    public final kv f37152e;
    public final kv f37153f;
    public float h;
    public float f37155i;
    public final Rect f37149a = new Rect();
    public final kr f37150b = ws.f41714b;
    public final int f37151c = org.telegram.messenger.g0.L(24.0f);
    public final int d = org.telegram.messenger.g0.L(24.0f);
    public long f37154g = -1;

    public lk0() {
        kv kvVar = new kv(1, (byte) 0);
        this.f37152e = kvVar;
        kvVar.f36897c.setColor(-2130706433);
        kv kvVar2 = new kv(1, (byte) 0);
        this.f37153f = kvVar2;
        kvVar2.f36897c.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f37150b.getInterpolation(f10);
        Rect rect = this.f37149a;
        rect.left = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.f37155i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.g0.L(4.0f) * this.f37155i));
        kv kvVar = this.f37153f;
        kvVar.setBounds(rect);
        kvVar.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(12.0f);
        rect.right = L2;
        rect.left = L2;
        int L3 = org.telegram.messenger.g0.L(8.0f);
        rect.bottom = L3;
        rect.top = L3;
        rect.inset(-org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 10, 11)), -org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 2, 3)));
        kv kvVar2 = this.f37152e;
        kvVar2.setBounds(rect);
        kvVar2.setAlpha(org.telegram.messenger.g0.W1(interpolation, 128, 255));
        kvVar2.draw(canvas);
    }

    public final void b(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f37150b.getInterpolation(f10);
        Rect rect = this.f37149a;
        rect.left = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.f37155i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.g0.L(4.0f) * this.f37155i));
        rect.offset(0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 0, -8)));
        kv kvVar = this.f37153f;
        kvVar.setBounds(rect);
        kvVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 1, 2)) * this.h);
        int N = (int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 5, 6)) * this.f37155i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.g0.N(org.telegram.messenger.g0.W1(interpolation, 6, 4)) * this.f37155i));
        rect.offset(0, org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(interpolation, 0, 8)));
        kv kvVar2 = this.f37152e;
        kvVar2.setBounds(rect);
        kvVar2.setAlpha(255);
        kvVar2.draw(canvas);
    }

    public final void c(Canvas canvas, float f10) {
        Rect bounds = getBounds();
        float interpolation = this.f37150b.getInterpolation(f10);
        Rect rect = this.f37149a;
        rect.left = (int) (org.telegram.messenger.g0.L(2.0f) * this.h);
        int L = bounds.bottom - ((int) (org.telegram.messenger.g0.L(6.0f) * this.f37155i));
        rect.bottom = L;
        rect.right = bounds.right - rect.left;
        rect.top = L - ((int) (org.telegram.messenger.g0.L(4.0f) * this.f37155i));
        rect.offset(0, org.telegram.messenger.g0.L(-8.0f));
        kv kvVar = this.f37153f;
        kvVar.setBounds(rect);
        kvVar.draw(canvas);
        rect.left = (int) (org.telegram.messenger.g0.N(2.0f) * this.h);
        int N = (int) (org.telegram.messenger.g0.N(6.0f) * this.f37155i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (org.telegram.messenger.g0.N(4.0f) * this.f37155i));
        rect.offset(0, org.telegram.messenger.g0.L(8.0f));
        kv kvVar2 = this.f37152e;
        kvVar2.setBounds(rect);
        kvVar2.setAlpha(org.telegram.messenger.g0.W1(interpolation, 255, 128));
        kvVar2.draw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f37154g > 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f37154g);
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
                                        this.f37154g = System.currentTimeMillis();
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
        return this.f37151c;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.h = rect.width() / this.f37151c;
        this.f37155i = rect.height() / this.d;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37152e.setColorFilter(colorFilter);
        this.f37153f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
