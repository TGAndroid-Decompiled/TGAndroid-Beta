package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class z90 extends kr {
    public static CornerPathEffect f33458w;
    public static int f33459x;
    public Layout h;
    public int f33460i;
    public float f33461j;
    public float f33462k;
    public float f33463l;
    public final boolean f33464m;
    public boolean f33465n;
    public int f33466o;
    public int f33467p;
    public float f33468q;
    public float f33469r;
    public float f33470s;
    public float f33471t;
    public float f33472u;
    public float v;

    public z90() {
        this.f33461j = -1.0f;
        this.f33465n = true;
        this.f33470s = Float.MAX_VALUE;
        this.f33472u = Float.MAX_VALUE;
        this.f28062c = false;
    }

    public static CornerPathEffect c() {
        if (f33458w == null || f33459x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f33459x = dp;
            f33458w = new CornerPathEffect(dp);
        }
        return f33458w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f33463l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f33461j;
            if (f16 == -1.0f) {
                this.f33461j = f14;
            } else if (f16 != f14) {
                this.f33461j = f14;
                this.f33460i++;
            }
            float lineRight = layout.getLineRight(this.f33460i);
            float lineLeft = this.h.getLineLeft(this.f33460i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f33462k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f33467p) {
                            float f21 = this.f33463l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f33460i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f33466o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f33464m) {
                        f(f18 - (AndroidUtilities.dp(5.0f) / 2.0f), f22, f19 + (AndroidUtilities.dp(5.0f) / 2.0f), f23, direction);
                    } else {
                        f(f18, f22, f19, f23, direction);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(Layout layout, int i10, float f7) {
        e(layout, i10, 0.0f, f7);
    }

    public final void e(Layout layout, int i10, float f7, float f10) {
        int lineCount;
        if (layout == null) {
            this.h = null;
            this.f33460i = 0;
            this.f33461j = -1.0f;
            this.f33462k = f7;
            this.f33463l = f10;
            return;
        }
        this.h = layout;
        this.f33460i = layout.getLineForOffset(i10);
        this.f33461j = -1.0f;
        this.f33462k = f7;
        this.f33463l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f33467p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f33469r;
        float f14 = f7 - f13;
        float f15 = this.f33468q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f33470s = Math.min(this.f33470s, Math.min(f14, f17));
        this.f33472u = Math.min(this.f33472u, Math.min(f16, f18));
        this.f33471t = Math.max(this.f33471t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f33465n) {
            return;
        }
        super.reset();
    }

    public z90(int i10) {
        this.f33461j = -1.0f;
        this.f33465n = true;
        this.f33470s = Float.MAX_VALUE;
        this.f33472u = Float.MAX_VALUE;
        this.f33464m = true;
        this.f28062c = false;
    }
}
