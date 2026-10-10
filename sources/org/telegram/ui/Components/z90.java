package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class z90 extends kr {
    public static CornerPathEffect f33545w;
    public static int f33546x;
    public Layout h;
    public int f33547i;
    public float f33548j;
    public float f33549k;
    public float f33550l;
    public final boolean f33551m;
    public boolean f33552n;
    public int f33553o;
    public int f33554p;
    public float f33555q;
    public float f33556r;
    public float f33557s;
    public float f33558t;
    public float f33559u;
    public float v;

    public z90() {
        this.f33548j = -1.0f;
        this.f33552n = true;
        this.f33557s = Float.MAX_VALUE;
        this.f33559u = Float.MAX_VALUE;
        this.f28086c = false;
    }

    public static CornerPathEffect c() {
        if (f33545w == null || f33546x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f33546x = dp;
            f33545w = new CornerPathEffect(dp);
        }
        return f33545w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f33550l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f33548j;
            if (f16 == -1.0f) {
                this.f33548j = f14;
            } else if (f16 != f14) {
                this.f33548j = f14;
                this.f33547i++;
            }
            float lineRight = layout.getLineRight(this.f33547i);
            float lineLeft = this.h.getLineLeft(this.f33547i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f33549k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f33554p) {
                            float f21 = this.f33550l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f33547i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f33553o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f33551m) {
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
            this.f33547i = 0;
            this.f33548j = -1.0f;
            this.f33549k = f7;
            this.f33550l = f10;
            return;
        }
        this.h = layout;
        this.f33547i = layout.getLineForOffset(i10);
        this.f33548j = -1.0f;
        this.f33549k = f7;
        this.f33550l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f33554p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f33556r;
        float f14 = f7 - f13;
        float f15 = this.f33555q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f33557s = Math.min(this.f33557s, Math.min(f14, f17));
        this.f33559u = Math.min(this.f33559u, Math.min(f16, f18));
        this.f33558t = Math.max(this.f33558t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f33552n) {
            return;
        }
        super.reset();
    }

    public z90(int i10) {
        this.f33548j = -1.0f;
        this.f33552n = true;
        this.f33557s = Float.MAX_VALUE;
        this.f33559u = Float.MAX_VALUE;
        this.f33551m = true;
        this.f28086c = false;
    }
}
