package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
public final class h80 extends rq {
    public static CornerPathEffect f35817w;
    public static int f35818x;
    public Layout h;
    public int f35819i;
    public float f35820j;
    public float f35821k;
    public float f35822l;
    public final boolean f35823m;
    public boolean f35824n;
    public int f35825o;
    public int f35826p;
    public float f35827q;
    public float f35828r;
    public float f35829s;
    public float f35830t;
    public float f35831u;
    public float v;

    public h80() {
        this.f35820j = -1.0f;
        this.f35824n = true;
        this.f35829s = Float.MAX_VALUE;
        this.f35831u = Float.MAX_VALUE;
        this.f39316c = false;
    }

    public static CornerPathEffect c() {
        if (f35817w == null || f35818x != org.telegram.messenger.g0.L(5.0f)) {
            int L = org.telegram.messenger.g0.L(5.0f);
            f35818x = L;
            f35817w = new CornerPathEffect(L);
        }
        return f35817w;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f10, f11, f12, f13, direction);
            return;
        }
        try {
            float f14 = this.f35822l;
            float f15 = f11 + f14;
            float f16 = f13 + f14;
            float f17 = this.f35820j;
            if (f17 == -1.0f) {
                this.f35820j = f15;
            } else if (f17 != f15) {
                this.f35820j = f15;
                this.f35819i++;
            }
            float lineRight = layout.getLineRight(this.f35819i);
            float lineLeft = this.h.getLineLeft(this.f35819i);
            if (f10 < lineRight) {
                int i7 = (f10 > lineLeft ? 1 : (f10 == lineLeft ? 0 : -1));
                if (i7 > 0 || f12 > lineLeft) {
                    if (f12 > lineRight) {
                        f12 = lineRight;
                    }
                    if (i7 < 0) {
                        f10 = lineLeft;
                    }
                    float f18 = this.f35821k;
                    float f19 = f10 + f18;
                    float f20 = f12 + f18;
                    float f21 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f16 - f15 > this.f35826p) {
                            float f22 = this.f35822l;
                            if (f16 != this.h.getHeight()) {
                                f21 = this.h.getLineBottom(this.f35819i) - this.h.getSpacingAdd();
                            }
                            f16 = f22 + f21;
                        }
                    } else {
                        if (f16 != this.h.getHeight()) {
                            f21 = this.h.getSpacingAdd();
                        }
                        f16 -= f21;
                    }
                    int i10 = this.f35825o;
                    if (i10 < 0) {
                        f16 += i10;
                    } else if (i10 > 0) {
                        f15 += i10;
                    }
                    float f23 = f15;
                    float f24 = f16;
                    if (this.f35823m) {
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
            this.f35819i = 0;
            this.f35820j = -1.0f;
            this.f35821k = f10;
            this.f35822l = f11;
            return;
        }
        this.h = layout;
        this.f35819i = layout.getLineForOffset(i7);
        this.f35820j = -1.0f;
        this.f35821k = f10;
        this.f35822l = f11;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i10 = lineCount - 1;
            this.f35826p = layout.getLineBottom(i10) - layout.getLineTop(i10);
        }
    }

    public final void f(float f10, float f11, float f12, float f13, Path.Direction direction) {
        float f14 = this.f35828r;
        float f15 = f10 - f14;
        float f16 = this.f35827q;
        float f17 = f11 - f16;
        float f18 = f12 + f14;
        float f19 = f13 + f16;
        this.f35829s = Math.min(this.f35829s, Math.min(f15, f18));
        this.f35831u = Math.min(this.f35831u, Math.min(f17, f19));
        this.f35830t = Math.max(this.f35830t, Math.max(f15, f18));
        this.v = Math.max(this.v, Math.max(f17, f19));
        super.addRect(f15, f17, f18, f19, direction);
    }

    @Override
    public final void reset() {
        if (!this.f35824n) {
            return;
        }
        super.reset();
    }

    public h80(int i7) {
        this.f35820j = -1.0f;
        this.f35824n = true;
        this.f35829s = Float.MAX_VALUE;
        this.f35831u = Float.MAX_VALUE;
        this.f35823m = true;
        this.f39316c = false;
    }
}
