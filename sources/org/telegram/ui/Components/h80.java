package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
public final class h80 extends rq {
    public static CornerPathEffect f35769w;
    public static int f35770x;
    public Layout h;
    public int f35771i;
    public float f35772j;
    public float f35773k;
    public float f35774l;
    public final boolean f35775m;
    public boolean f35776n;
    public int f35777o;
    public int f35778p;
    public float f35779q;
    public float f35780r;
    public float f35781s;
    public float f35782t;
    public float f35783u;
    public float v;

    public h80() {
        this.f35772j = -1.0f;
        this.f35776n = true;
        this.f35781s = Float.MAX_VALUE;
        this.f35783u = Float.MAX_VALUE;
        this.f39271c = false;
    }

    public static CornerPathEffect c() {
        if (f35769w == null || f35770x != org.telegram.messenger.g0.L(5.0f)) {
            int L = org.telegram.messenger.g0.L(5.0f);
            f35770x = L;
            f35769w = new CornerPathEffect(L);
        }
        return f35769w;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f10, f11, f12, f13, direction);
            return;
        }
        try {
            float f14 = this.f35774l;
            float f15 = f11 + f14;
            float f16 = f13 + f14;
            float f17 = this.f35772j;
            if (f17 == -1.0f) {
                this.f35772j = f15;
            } else if (f17 != f15) {
                this.f35772j = f15;
                this.f35771i++;
            }
            float lineRight = layout.getLineRight(this.f35771i);
            float lineLeft = this.h.getLineLeft(this.f35771i);
            if (f10 < lineRight) {
                int i7 = (f10 > lineLeft ? 1 : (f10 == lineLeft ? 0 : -1));
                if (i7 > 0 || f12 > lineLeft) {
                    if (f12 > lineRight) {
                        f12 = lineRight;
                    }
                    if (i7 < 0) {
                        f10 = lineLeft;
                    }
                    float f18 = this.f35773k;
                    float f19 = f10 + f18;
                    float f20 = f12 + f18;
                    float f21 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f16 - f15 > this.f35778p) {
                            float f22 = this.f35774l;
                            if (f16 != this.h.getHeight()) {
                                f21 = this.h.getLineBottom(this.f35771i) - this.h.getSpacingAdd();
                            }
                            f16 = f22 + f21;
                        }
                    } else {
                        if (f16 != this.h.getHeight()) {
                            f21 = this.h.getSpacingAdd();
                        }
                        f16 -= f21;
                    }
                    int i10 = this.f35777o;
                    if (i10 < 0) {
                        f16 += i10;
                    } else if (i10 > 0) {
                        f15 += i10;
                    }
                    float f23 = f15;
                    float f24 = f16;
                    if (this.f35775m) {
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
            this.f35771i = 0;
            this.f35772j = -1.0f;
            this.f35773k = f10;
            this.f35774l = f11;
            return;
        }
        this.h = layout;
        this.f35771i = layout.getLineForOffset(i7);
        this.f35772j = -1.0f;
        this.f35773k = f10;
        this.f35774l = f11;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i10 = lineCount - 1;
            this.f35778p = layout.getLineBottom(i10) - layout.getLineTop(i10);
        }
    }

    public final void f(float f10, float f11, float f12, float f13, Path.Direction direction) {
        float f14 = this.f35780r;
        float f15 = f10 - f14;
        float f16 = this.f35779q;
        float f17 = f11 - f16;
        float f18 = f12 + f14;
        float f19 = f13 + f16;
        this.f35781s = Math.min(this.f35781s, Math.min(f15, f18));
        this.f35783u = Math.min(this.f35783u, Math.min(f17, f19));
        this.f35782t = Math.max(this.f35782t, Math.max(f15, f18));
        this.v = Math.max(this.v, Math.max(f17, f19));
        super.addRect(f15, f17, f18, f19, direction);
    }

    @Override
    public final void reset() {
        if (!this.f35776n) {
            return;
        }
        super.reset();
    }

    public h80(int i7) {
        this.f35772j = -1.0f;
        this.f35776n = true;
        this.f35781s = Float.MAX_VALUE;
        this.f35783u = Float.MAX_VALUE;
        this.f35775m = true;
        this.f39271c = false;
    }
}
