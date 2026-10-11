package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class y90 extends kr {
    public static CornerPathEffect f33199w;
    public static int f33200x;
    public Layout h;
    public int f33201i;
    public float f33202j;
    public float f33203k;
    public float f33204l;
    public final boolean f33205m;
    public boolean f33206n;
    public int f33207o;
    public int f33208p;
    public float f33209q;
    public float f33210r;
    public float f33211s;
    public float f33212t;
    public float f33213u;
    public float v;

    public y90() {
        this.f33202j = -1.0f;
        this.f33206n = true;
        this.f33211s = Float.MAX_VALUE;
        this.f33213u = Float.MAX_VALUE;
        this.f28123c = false;
    }

    public static CornerPathEffect c() {
        if (f33199w == null || f33200x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f33200x = dp;
            f33199w = new CornerPathEffect(dp);
        }
        return f33199w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f33204l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f33202j;
            if (f16 == -1.0f) {
                this.f33202j = f14;
            } else if (f16 != f14) {
                this.f33202j = f14;
                this.f33201i++;
            }
            float lineRight = layout.getLineRight(this.f33201i);
            float lineLeft = this.h.getLineLeft(this.f33201i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f33203k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f33208p) {
                            float f21 = this.f33204l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f33201i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f33207o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f33205m) {
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
            this.f33201i = 0;
            this.f33202j = -1.0f;
            this.f33203k = f7;
            this.f33204l = f10;
            return;
        }
        this.h = layout;
        this.f33201i = layout.getLineForOffset(i10);
        this.f33202j = -1.0f;
        this.f33203k = f7;
        this.f33204l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f33208p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f33210r;
        float f14 = f7 - f13;
        float f15 = this.f33209q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f33211s = Math.min(this.f33211s, Math.min(f14, f17));
        this.f33213u = Math.min(this.f33213u, Math.min(f16, f18));
        this.f33212t = Math.max(this.f33212t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f33206n) {
            return;
        }
        super.reset();
    }

    public y90(int i10) {
        this.f33202j = -1.0f;
        this.f33206n = true;
        this.f33211s = Float.MAX_VALUE;
        this.f33213u = Float.MAX_VALUE;
        this.f33205m = true;
        this.f28123c = false;
    }
}
