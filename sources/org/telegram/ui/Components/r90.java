package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class r90 extends er {
    public static CornerPathEffect f29895w;
    public static int f29896x;
    public Layout h;
    public int f29897i;
    public float f29898j;
    public float f29899k;
    public float f29900l;
    public final boolean f29901m;
    public boolean f29902n;
    public int f29903o;
    public int f29904p;
    public float f29905q;
    public float f29906r;
    public float f29907s;
    public float f29908t;
    public float f29909u;
    public float v;

    public r90() {
        this.f29898j = -1.0f;
        this.f29902n = true;
        this.f29907s = Float.MAX_VALUE;
        this.f29909u = Float.MAX_VALUE;
        this.f25956c = false;
    }

    public static CornerPathEffect c() {
        if (f29895w == null || f29896x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f29896x = dp;
            f29895w = new CornerPathEffect(dp);
        }
        return f29895w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f29900l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f29898j;
            if (f16 == -1.0f) {
                this.f29898j = f14;
            } else if (f16 != f14) {
                this.f29898j = f14;
                this.f29897i++;
            }
            float lineRight = layout.getLineRight(this.f29897i);
            float lineLeft = this.h.getLineLeft(this.f29897i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f29899k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f29904p) {
                            float f21 = this.f29900l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f29897i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f29903o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f29901m) {
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
            this.f29897i = 0;
            this.f29898j = -1.0f;
            this.f29899k = f7;
            this.f29900l = f10;
            return;
        }
        this.h = layout;
        this.f29897i = layout.getLineForOffset(i10);
        this.f29898j = -1.0f;
        this.f29899k = f7;
        this.f29900l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f29904p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f29906r;
        float f14 = f7 - f13;
        float f15 = this.f29905q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f29907s = Math.min(this.f29907s, Math.min(f14, f17));
        this.f29909u = Math.min(this.f29909u, Math.min(f16, f18));
        this.f29908t = Math.max(this.f29908t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f29902n) {
            return;
        }
        super.reset();
    }

    public r90(int i10) {
        this.f29898j = -1.0f;
        this.f29902n = true;
        this.f29907s = Float.MAX_VALUE;
        this.f29909u = Float.MAX_VALUE;
        this.f29901m = true;
        this.f25956c = false;
    }
}
