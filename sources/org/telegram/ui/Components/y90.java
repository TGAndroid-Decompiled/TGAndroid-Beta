package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class y90 extends kr {
    public static CornerPathEffect f33167w;
    public static int f33168x;
    public Layout h;
    public int f33169i;
    public float f33170j;
    public float f33171k;
    public float f33172l;
    public final boolean f33173m;
    public boolean f33174n;
    public int f33175o;
    public int f33176p;
    public float f33177q;
    public float f33178r;
    public float f33179s;
    public float f33180t;
    public float f33181u;
    public float v;

    public y90() {
        this.f33170j = -1.0f;
        this.f33174n = true;
        this.f33179s = Float.MAX_VALUE;
        this.f33181u = Float.MAX_VALUE;
        this.f28150c = false;
    }

    public static CornerPathEffect c() {
        if (f33167w == null || f33168x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f33168x = dp;
            f33167w = new CornerPathEffect(dp);
        }
        return f33167w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f33172l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f33170j;
            if (f16 == -1.0f) {
                this.f33170j = f14;
            } else if (f16 != f14) {
                this.f33170j = f14;
                this.f33169i++;
            }
            float lineRight = layout.getLineRight(this.f33169i);
            float lineLeft = this.h.getLineLeft(this.f33169i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f33171k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f33176p) {
                            float f21 = this.f33172l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f33169i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f33175o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f33173m) {
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
            this.f33169i = 0;
            this.f33170j = -1.0f;
            this.f33171k = f7;
            this.f33172l = f10;
            return;
        }
        this.h = layout;
        this.f33169i = layout.getLineForOffset(i10);
        this.f33170j = -1.0f;
        this.f33171k = f7;
        this.f33172l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f33176p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f33178r;
        float f14 = f7 - f13;
        float f15 = this.f33177q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f33179s = Math.min(this.f33179s, Math.min(f14, f17));
        this.f33181u = Math.min(this.f33181u, Math.min(f16, f18));
        this.f33180t = Math.max(this.f33180t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f33174n) {
            return;
        }
        super.reset();
    }

    public y90(int i10) {
        this.f33170j = -1.0f;
        this.f33174n = true;
        this.f33179s = Float.MAX_VALUE;
        this.f33181u = Float.MAX_VALUE;
        this.f33173m = true;
        this.f28150c = false;
    }
}
