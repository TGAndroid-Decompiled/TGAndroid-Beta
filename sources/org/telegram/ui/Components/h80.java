package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
public final class h80 extends rq {
    public static CornerPathEffect f35816w;
    public static int f35817x;
    public Layout h;
    public int f35818i;
    public float f35819j;
    public float f35820k;
    public float f35821l;
    public final boolean f35822m;
    public boolean f35823n;
    public int f35824o;
    public int f35825p;
    public float f35826q;
    public float f35827r;
    public float f35828s;
    public float f35829t;
    public float f35830u;
    public float v;

    public h80() {
        this.f35819j = -1.0f;
        this.f35823n = true;
        this.f35828s = Float.MAX_VALUE;
        this.f35830u = Float.MAX_VALUE;
        this.f39315c = false;
    }

    public static CornerPathEffect c() {
        if (f35816w == null || f35817x != org.telegram.messenger.g0.L(5.0f)) {
            int L = org.telegram.messenger.g0.L(5.0f);
            f35817x = L;
            f35816w = new CornerPathEffect(L);
        }
        return f35816w;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f10, f11, f12, f13, direction);
            return;
        }
        try {
            float f14 = this.f35821l;
            float f15 = f11 + f14;
            float f16 = f13 + f14;
            float f17 = this.f35819j;
            if (f17 == -1.0f) {
                this.f35819j = f15;
            } else if (f17 != f15) {
                this.f35819j = f15;
                this.f35818i++;
            }
            float lineRight = layout.getLineRight(this.f35818i);
            float lineLeft = this.h.getLineLeft(this.f35818i);
            if (f10 < lineRight) {
                int i7 = (f10 > lineLeft ? 1 : (f10 == lineLeft ? 0 : -1));
                if (i7 > 0 || f12 > lineLeft) {
                    if (f12 > lineRight) {
                        f12 = lineRight;
                    }
                    if (i7 < 0) {
                        f10 = lineLeft;
                    }
                    float f18 = this.f35820k;
                    float f19 = f10 + f18;
                    float f20 = f12 + f18;
                    float f21 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f16 - f15 > this.f35825p) {
                            float f22 = this.f35821l;
                            if (f16 != this.h.getHeight()) {
                                f21 = this.h.getLineBottom(this.f35818i) - this.h.getSpacingAdd();
                            }
                            f16 = f22 + f21;
                        }
                    } else {
                        if (f16 != this.h.getHeight()) {
                            f21 = this.h.getSpacingAdd();
                        }
                        f16 -= f21;
                    }
                    int i10 = this.f35824o;
                    if (i10 < 0) {
                        f16 += i10;
                    } else if (i10 > 0) {
                        f15 += i10;
                    }
                    float f23 = f15;
                    float f24 = f16;
                    if (this.f35822m) {
                        f(f19 - (org.telegram.messenger.g0.L(5.0f) / 2.0f), f23, f20 + (org.telegram.messenger.g0.L(5.0f) / 2.0f), f24, direction);
                    } else {
                        f(f19, f23, f20, f24, direction);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(Layout layout, int i7, float f10) {
        e(layout, i7, 0.0f, f10);
    }

    public final void e(Layout layout, int i7, float f10, float f11) {
        int lineCount;
        if (layout == null) {
            this.h = null;
            this.f35818i = 0;
            this.f35819j = -1.0f;
            this.f35820k = f10;
            this.f35821l = f11;
            return;
        }
        this.h = layout;
        this.f35818i = layout.getLineForOffset(i7);
        this.f35819j = -1.0f;
        this.f35820k = f10;
        this.f35821l = f11;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i10 = lineCount - 1;
            this.f35825p = layout.getLineBottom(i10) - layout.getLineTop(i10);
        }
    }

    public final void f(float f10, float f11, float f12, float f13, Path.Direction direction) {
        float f14 = this.f35827r;
        float f15 = f10 - f14;
        float f16 = this.f35826q;
        float f17 = f11 - f16;
        float f18 = f12 + f14;
        float f19 = f13 + f16;
        this.f35828s = Math.min(this.f35828s, Math.min(f15, f18));
        this.f35830u = Math.min(this.f35830u, Math.min(f17, f19));
        this.f35829t = Math.max(this.f35829t, Math.max(f15, f18));
        this.v = Math.max(this.v, Math.max(f17, f19));
        super.addRect(f15, f17, f18, f19, direction);
    }

    @Override
    public final void reset() {
        if (!this.f35823n) {
            return;
        }
        super.reset();
    }

    public h80(int i7) {
        this.f35819j = -1.0f;
        this.f35823n = true;
        this.f35828s = Float.MAX_VALUE;
        this.f35830u = Float.MAX_VALUE;
        this.f35822m = true;
        this.f39315c = false;
    }
}
