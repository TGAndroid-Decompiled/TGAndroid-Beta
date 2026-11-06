package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
public final class r70 extends aq {
    public static CornerPathEffect f37622w;
    public static int f37623x;
    public Layout h;
    public int f37624i;
    public float f37625j;
    public float f37626k;
    public float f37627l;
    public final boolean f37628m;
    public boolean f37629n;
    public int f37630o;
    public int f37631p;
    public float f37632q;
    public float f37633r;
    public float f37634s;
    public float f37635t;
    public float f37636u;
    public float v;

    public r70() {
        this.f37625j = -1.0f;
        this.f37629n = true;
        this.f37634s = Float.MAX_VALUE;
        this.f37636u = Float.MAX_VALUE;
        this.f31873c = false;
    }

    public static CornerPathEffect c() {
        if (f37622w == null || f37623x != org.telegram.messenger.g0.L(5.0f)) {
            int L = org.telegram.messenger.g0.L(5.0f);
            f37623x = L;
            f37622w = new CornerPathEffect(L);
        }
        return f37622w;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f10, f11, f12, f13, direction);
            return;
        }
        try {
            float f14 = this.f37627l;
            float f15 = f11 + f14;
            float f16 = f13 + f14;
            float f17 = this.f37625j;
            if (f17 == -1.0f) {
                this.f37625j = f15;
            } else if (f17 != f15) {
                this.f37625j = f15;
                this.f37624i++;
            }
            float lineRight = layout.getLineRight(this.f37624i);
            float lineLeft = this.h.getLineLeft(this.f37624i);
            if (f10 < lineRight) {
                int i7 = (f10 > lineLeft ? 1 : (f10 == lineLeft ? 0 : -1));
                if (i7 > 0 || f12 > lineLeft) {
                    if (f12 > lineRight) {
                        f12 = lineRight;
                    }
                    if (i7 < 0) {
                        f10 = lineLeft;
                    }
                    float f18 = this.f37626k;
                    float f19 = f10 + f18;
                    float f20 = f12 + f18;
                    float f21 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f16 - f15 > this.f37631p) {
                            float f22 = this.f37627l;
                            if (f16 != this.h.getHeight()) {
                                f21 = this.h.getLineBottom(this.f37624i) - this.h.getSpacingAdd();
                            }
                            f16 = f22 + f21;
                        }
                    } else {
                        if (f16 != this.h.getHeight()) {
                            f21 = this.h.getSpacingAdd();
                        }
                        f16 -= f21;
                    }
                    int i10 = this.f37630o;
                    if (i10 < 0) {
                        f16 += i10;
                    } else if (i10 > 0) {
                        f15 += i10;
                    }
                    float f23 = f15;
                    float f24 = f16;
                    if (this.f37628m) {
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
            this.f37624i = 0;
            this.f37625j = -1.0f;
            this.f37626k = f10;
            this.f37627l = f11;
            return;
        }
        this.h = layout;
        this.f37624i = layout.getLineForOffset(i7);
        this.f37625j = -1.0f;
        this.f37626k = f10;
        this.f37627l = f11;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i10 = lineCount - 1;
            this.f37631p = layout.getLineBottom(i10) - layout.getLineTop(i10);
        }
    }

    public final void f(float f10, float f11, float f12, float f13, Path.Direction direction) {
        float f14 = this.f37633r;
        float f15 = f10 - f14;
        float f16 = this.f37632q;
        float f17 = f11 - f16;
        float f18 = f12 + f14;
        float f19 = f13 + f16;
        this.f37634s = Math.min(this.f37634s, Math.min(f15, f18));
        this.f37636u = Math.min(this.f37636u, Math.min(f17, f19));
        this.f37635t = Math.max(this.f37635t, Math.max(f15, f18));
        this.v = Math.max(this.v, Math.max(f17, f19));
        super.addRect(f15, f17, f18, f19, direction);
    }

    @Override
    public final void reset() {
        if (!this.f37629n) {
            return;
        }
        super.reset();
    }

    public r70(int i7) {
        this.f37625j = -1.0f;
        this.f37629n = true;
        this.f37634s = Float.MAX_VALUE;
        this.f37636u = Float.MAX_VALUE;
        this.f37628m = true;
        this.f31873c = false;
    }
}
