package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
public final class e80 extends oq {
    public static CornerPathEffect f34630w;
    public static int f34631x;
    public Layout h;
    public int f34632i;
    public float f34633j;
    public float f34634k;
    public float f34635l;
    public final boolean f34636m;
    public boolean f34637n;
    public int f34638o;
    public int f34639p;
    public float f34640q;
    public float f34641r;
    public float f34642s;
    public float f34643t;
    public float f34644u;
    public float v;

    public e80() {
        this.f34633j = -1.0f;
        this.f34637n = true;
        this.f34642s = Float.MAX_VALUE;
        this.f34644u = Float.MAX_VALUE;
        this.f38246c = false;
    }

    public static CornerPathEffect c() {
        if (f34630w == null || f34631x != org.telegram.messenger.g0.L(5.0f)) {
            int L = org.telegram.messenger.g0.L(5.0f);
            f34631x = L;
            f34630w = new CornerPathEffect(L);
        }
        return f34630w;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f10, f11, f12, f13, direction);
            return;
        }
        try {
            float f14 = this.f34635l;
            float f15 = f11 + f14;
            float f16 = f13 + f14;
            float f17 = this.f34633j;
            if (f17 == -1.0f) {
                this.f34633j = f15;
            } else if (f17 != f15) {
                this.f34633j = f15;
                this.f34632i++;
            }
            float lineRight = layout.getLineRight(this.f34632i);
            float lineLeft = this.h.getLineLeft(this.f34632i);
            if (f10 < lineRight) {
                int i7 = (f10 > lineLeft ? 1 : (f10 == lineLeft ? 0 : -1));
                if (i7 > 0 || f12 > lineLeft) {
                    if (f12 > lineRight) {
                        f12 = lineRight;
                    }
                    if (i7 < 0) {
                        f10 = lineLeft;
                    }
                    float f18 = this.f34634k;
                    float f19 = f10 + f18;
                    float f20 = f12 + f18;
                    float f21 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f16 - f15 > this.f34639p) {
                            float f22 = this.f34635l;
                            if (f16 != this.h.getHeight()) {
                                f21 = this.h.getLineBottom(this.f34632i) - this.h.getSpacingAdd();
                            }
                            f16 = f22 + f21;
                        }
                    } else {
                        if (f16 != this.h.getHeight()) {
                            f21 = this.h.getSpacingAdd();
                        }
                        f16 -= f21;
                    }
                    int i10 = this.f34638o;
                    if (i10 < 0) {
                        f16 += i10;
                    } else if (i10 > 0) {
                        f15 += i10;
                    }
                    float f23 = f15;
                    float f24 = f16;
                    if (this.f34636m) {
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
            this.f34632i = 0;
            this.f34633j = -1.0f;
            this.f34634k = f10;
            this.f34635l = f11;
            return;
        }
        this.h = layout;
        this.f34632i = layout.getLineForOffset(i7);
        this.f34633j = -1.0f;
        this.f34634k = f10;
        this.f34635l = f11;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i10 = lineCount - 1;
            this.f34639p = layout.getLineBottom(i10) - layout.getLineTop(i10);
        }
    }

    public final void f(float f10, float f11, float f12, float f13, Path.Direction direction) {
        float f14 = this.f34641r;
        float f15 = f10 - f14;
        float f16 = this.f34640q;
        float f17 = f11 - f16;
        float f18 = f12 + f14;
        float f19 = f13 + f16;
        this.f34642s = Math.min(this.f34642s, Math.min(f15, f18));
        this.f34644u = Math.min(this.f34644u, Math.min(f17, f19));
        this.f34643t = Math.max(this.f34643t, Math.max(f15, f18));
        this.v = Math.max(this.v, Math.max(f17, f19));
        super.addRect(f15, f17, f18, f19, direction);
    }

    @Override
    public final void reset() {
        if (!this.f34637n) {
            return;
        }
        super.reset();
    }

    public e80(int i7) {
        this.f34633j = -1.0f;
        this.f34637n = true;
        this.f34642s = Float.MAX_VALUE;
        this.f34644u = Float.MAX_VALUE;
        this.f34636m = true;
        this.f38246c = false;
    }
}
