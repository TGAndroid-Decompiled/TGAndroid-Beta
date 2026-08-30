package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class y80 extends sq {
    public static CornerPathEffect f30930w;
    public static int f30931x;
    public Layout h;
    public int f30932i;
    public float f30933j;
    public float f30934k;
    public float f30935l;
    public final boolean f30936m;
    public boolean f30937n;
    public int f30938o;
    public int f30939p;
    public float f30940q;
    public float f30941r;
    public float f30942s;
    public float f30943t;
    public float f30944u;
    public float v;

    public y80() {
        this.f30933j = -1.0f;
        this.f30937n = true;
        this.f30942s = Float.MAX_VALUE;
        this.f30944u = Float.MAX_VALUE;
        this.f28799c = false;
    }

    public static CornerPathEffect c() {
        if (f30930w == null || f30931x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f30931x = dp;
            f30930w = new CornerPathEffect(dp);
        }
        return f30930w;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f10, f11, f12, f13, direction);
            return;
        }
        try {
            float f14 = this.f30935l;
            float f15 = f11 + f14;
            float f16 = f13 + f14;
            float f17 = this.f30933j;
            if (f17 == -1.0f) {
                this.f30933j = f15;
            } else if (f17 != f15) {
                this.f30933j = f15;
                this.f30932i++;
            }
            float lineRight = layout.getLineRight(this.f30932i);
            float lineLeft = this.h.getLineLeft(this.f30932i);
            if (f10 < lineRight) {
                int i10 = (f10 > lineLeft ? 1 : (f10 == lineLeft ? 0 : -1));
                if (i10 > 0 || f12 > lineLeft) {
                    if (f12 > lineRight) {
                        f12 = lineRight;
                    }
                    if (i10 < 0) {
                        f10 = lineLeft;
                    }
                    float f18 = this.f30934k;
                    float f19 = f10 + f18;
                    float f20 = f12 + f18;
                    float f21 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f16 - f15 > this.f30939p) {
                            float f22 = this.f30935l;
                            if (f16 != this.h.getHeight()) {
                                f21 = this.h.getLineBottom(this.f30932i) - this.h.getSpacingAdd();
                            }
                            f16 = f22 + f21;
                        }
                    } else {
                        if (f16 != this.h.getHeight()) {
                            f21 = this.h.getSpacingAdd();
                        }
                        f16 -= f21;
                    }
                    int i11 = this.f30938o;
                    if (i11 < 0) {
                        f16 += i11;
                    } else if (i11 > 0) {
                        f15 += i11;
                    }
                    float f23 = f15;
                    float f24 = f16;
                    if (this.f30936m) {
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
            this.f30932i = 0;
            this.f30933j = -1.0f;
            this.f30934k = f10;
            this.f30935l = f11;
            return;
        }
        this.h = layout;
        this.f30932i = layout.getLineForOffset(i10);
        this.f30933j = -1.0f;
        this.f30934k = f10;
        this.f30935l = f11;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f30939p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f10, float f11, float f12, float f13, Path.Direction direction) {
        float f14 = this.f30941r;
        float f15 = f10 - f14;
        float f16 = this.f30940q;
        float f17 = f11 - f16;
        float f18 = f12 + f14;
        float f19 = f13 + f16;
        this.f30942s = Math.min(this.f30942s, Math.min(f15, f18));
        this.f30944u = Math.min(this.f30944u, Math.min(f17, f19));
        this.f30943t = Math.max(this.f30943t, Math.max(f15, f18));
        this.v = Math.max(this.v, Math.max(f17, f19));
        super.addRect(f15, f17, f18, f19, direction);
    }

    @Override
    public final void reset() {
        if (!this.f30937n) {
            return;
        }
        super.reset();
    }

    public y80(int i10) {
        this.f30933j = -1.0f;
        this.f30937n = true;
        this.f30942s = Float.MAX_VALUE;
        this.f30944u = Float.MAX_VALUE;
        this.f30936m = true;
        this.f28799c = false;
    }
}
