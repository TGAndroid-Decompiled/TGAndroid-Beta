package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
public final class n70 extends bq {
    public static CornerPathEffect f36396w;
    public static int f36397x;
    public Layout h;
    public int f36398i;
    public float f36399j;
    public float f36400k;
    public float f36401l;
    public final boolean f36402m;
    public boolean f36403n;
    public int f36404o;
    public int f36405p;
    public float f36406q;
    public float f36407r;
    public float f36408s;
    public float f36409t;
    public float f36410u;
    public float v;

    public n70() {
        this.f36399j = -1.0f;
        this.f36403n = true;
        this.f36408s = Float.MAX_VALUE;
        this.f36410u = Float.MAX_VALUE;
        this.f32362c = false;
    }

    public static CornerPathEffect c() {
        if (f36396w == null || f36397x != org.telegram.messenger.g0.L(5.0f)) {
            int L = org.telegram.messenger.g0.L(5.0f);
            f36397x = L;
            f36396w = new CornerPathEffect(L);
        }
        return f36396w;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f10, f11, f12, f13, direction);
            return;
        }
        try {
            float f14 = this.f36401l;
            float f15 = f11 + f14;
            float f16 = f13 + f14;
            float f17 = this.f36399j;
            if (f17 == -1.0f) {
                this.f36399j = f15;
            } else if (f17 != f15) {
                this.f36399j = f15;
                this.f36398i++;
            }
            float lineRight = layout.getLineRight(this.f36398i);
            float lineLeft = this.h.getLineLeft(this.f36398i);
            if (f10 < lineRight) {
                int i3 = (f10 > lineLeft ? 1 : (f10 == lineLeft ? 0 : -1));
                if (i3 > 0 || f12 > lineLeft) {
                    if (f12 > lineRight) {
                        f12 = lineRight;
                    }
                    if (i3 < 0) {
                        f10 = lineLeft;
                    }
                    float f18 = this.f36400k;
                    float f19 = f10 + f18;
                    float f20 = f12 + f18;
                    float f21 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f16 - f15 > this.f36405p) {
                            float f22 = this.f36401l;
                            if (f16 != this.h.getHeight()) {
                                f21 = this.h.getLineBottom(this.f36398i) - this.h.getSpacingAdd();
                            }
                            f16 = f22 + f21;
                        }
                    } else {
                        if (f16 != this.h.getHeight()) {
                            f21 = this.h.getSpacingAdd();
                        }
                        f16 -= f21;
                    }
                    int i10 = this.f36404o;
                    if (i10 < 0) {
                        f16 += i10;
                    } else if (i10 > 0) {
                        f15 += i10;
                    }
                    float f23 = f15;
                    float f24 = f16;
                    if (this.f36402m) {
                        f(f19 - (org.telegram.messenger.g0.L(5.0f) / 2.0f), f23, f20 + (org.telegram.messenger.g0.L(5.0f) / 2.0f), f24, direction);
                    } else {
                        f(f19, f23, f20, f24, direction);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(Layout layout, int i3, float f10) {
        e(layout, i3, 0.0f, f10);
    }

    public final void e(Layout layout, int i3, float f10, float f11) {
        int lineCount;
        if (layout == null) {
            this.h = null;
            this.f36398i = 0;
            this.f36399j = -1.0f;
            this.f36400k = f10;
            this.f36401l = f11;
            return;
        }
        this.h = layout;
        this.f36398i = layout.getLineForOffset(i3);
        this.f36399j = -1.0f;
        this.f36400k = f10;
        this.f36401l = f11;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i10 = lineCount - 1;
            this.f36405p = layout.getLineBottom(i10) - layout.getLineTop(i10);
        }
    }

    public final void f(float f10, float f11, float f12, float f13, Path.Direction direction) {
        float f14 = this.f36407r;
        float f15 = f10 - f14;
        float f16 = this.f36406q;
        float f17 = f11 - f16;
        float f18 = f12 + f14;
        float f19 = f13 + f16;
        this.f36408s = Math.min(this.f36408s, Math.min(f15, f18));
        this.f36410u = Math.min(this.f36410u, Math.min(f17, f19));
        this.f36409t = Math.max(this.f36409t, Math.max(f15, f18));
        this.v = Math.max(this.v, Math.max(f17, f19));
        super.addRect(f15, f17, f18, f19, direction);
    }

    @Override
    public final void reset() {
        if (!this.f36403n) {
            return;
        }
        super.reset();
    }

    public n70(int i3) {
        this.f36399j = -1.0f;
        this.f36403n = true;
        this.f36408s = Float.MAX_VALUE;
        this.f36410u = Float.MAX_VALUE;
        this.f36402m = true;
        this.f32362c = false;
    }
}
