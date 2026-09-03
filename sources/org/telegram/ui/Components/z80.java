package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class z80 extends uq {
    public static CornerPathEffect f33857w;
    public static int f33858x;
    public Layout h;
    public int f33859i;
    public float f33860j;
    public float f33861k;
    public float f33862l;
    public final boolean f33863m;
    public boolean f33864n;
    public int f33865o;
    public int f33866p;
    public float f33867q;
    public float f33868r;
    public float f33869s;
    public float f33870t;
    public float f33871u;
    public float v;

    public z80() {
        this.f33860j = -1.0f;
        this.f33864n = true;
        this.f33869s = Float.MAX_VALUE;
        this.f33871u = Float.MAX_VALUE;
        this.f31669c = false;
    }

    public static CornerPathEffect c() {
        if (f33857w == null || f33858x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f33858x = dp;
            f33857w = new CornerPathEffect(dp);
        }
        return f33857w;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f10, f11, f12, f13, direction);
            return;
        }
        try {
            float f14 = this.f33862l;
            float f15 = f11 + f14;
            float f16 = f13 + f14;
            float f17 = this.f33860j;
            if (f17 == -1.0f) {
                this.f33860j = f15;
            } else if (f17 != f15) {
                this.f33860j = f15;
                this.f33859i++;
            }
            float lineRight = layout.getLineRight(this.f33859i);
            float lineLeft = this.h.getLineLeft(this.f33859i);
            if (f10 < lineRight) {
                int i10 = (f10 > lineLeft ? 1 : (f10 == lineLeft ? 0 : -1));
                if (i10 > 0 || f12 > lineLeft) {
                    if (f12 > lineRight) {
                        f12 = lineRight;
                    }
                    if (i10 < 0) {
                        f10 = lineLeft;
                    }
                    float f18 = this.f33861k;
                    float f19 = f10 + f18;
                    float f20 = f12 + f18;
                    float f21 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f16 - f15 > this.f33866p) {
                            float f22 = this.f33862l;
                            if (f16 != this.h.getHeight()) {
                                f21 = this.h.getLineBottom(this.f33859i) - this.h.getSpacingAdd();
                            }
                            f16 = f22 + f21;
                        }
                    } else {
                        if (f16 != this.h.getHeight()) {
                            f21 = this.h.getSpacingAdd();
                        }
                        f16 -= f21;
                    }
                    int i11 = this.f33865o;
                    if (i11 < 0) {
                        f16 += i11;
                    } else if (i11 > 0) {
                        f15 += i11;
                    }
                    float f23 = f15;
                    float f24 = f16;
                    if (this.f33863m) {
                        f(f19 - (AndroidUtilities.dp(5.0f) / 2.0f), f23, f20 + (AndroidUtilities.dp(5.0f) / 2.0f), f24, direction);
                    } else {
                        f(f19, f23, f20, f24, direction);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(Layout layout, int i10, float f10) {
        e(layout, i10, 0.0f, f10);
    }

    public final void e(Layout layout, int i10, float f10, float f11) {
        int lineCount;
        if (layout == null) {
            this.h = null;
            this.f33859i = 0;
            this.f33860j = -1.0f;
            this.f33861k = f10;
            this.f33862l = f11;
            return;
        }
        this.h = layout;
        this.f33859i = layout.getLineForOffset(i10);
        this.f33860j = -1.0f;
        this.f33861k = f10;
        this.f33862l = f11;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f33866p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f10, float f11, float f12, float f13, Path.Direction direction) {
        float f14 = this.f33868r;
        float f15 = f10 - f14;
        float f16 = this.f33867q;
        float f17 = f11 - f16;
        float f18 = f12 + f14;
        float f19 = f13 + f16;
        this.f33869s = Math.min(this.f33869s, Math.min(f15, f18));
        this.f33871u = Math.min(this.f33871u, Math.min(f17, f19));
        this.f33870t = Math.max(this.f33870t, Math.max(f15, f18));
        this.v = Math.max(this.v, Math.max(f17, f19));
        super.addRect(f15, f17, f18, f19, direction);
    }

    @Override
    public final void reset() {
        if (!this.f33864n) {
            return;
        }
        super.reset();
    }

    public z80(int i10) {
        this.f33860j = -1.0f;
        this.f33864n = true;
        this.f33869s = Float.MAX_VALUE;
        this.f33871u = Float.MAX_VALUE;
        this.f33863m = true;
        this.f31669c = false;
    }
}
