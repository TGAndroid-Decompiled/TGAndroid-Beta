package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class g90 extends ar {
    public static CornerPathEffect f23296w;
    public static int f23297x;
    public Layout h;
    public int f23298i;
    public float f23299j;
    public float f23300k;
    public float f23301l;
    public final boolean f23302m;
    public boolean f23303n;
    public int f23304o;
    public int f23305p;
    public float f23306q;
    public float f23307r;
    public float f23308s;
    public float f23309t;
    public float f23310u;
    public float v;

    public g90() {
        this.f23299j = -1.0f;
        this.f23303n = true;
        this.f23308s = Float.MAX_VALUE;
        this.f23310u = Float.MAX_VALUE;
        this.f21567c = false;
    }

    public static CornerPathEffect c() {
        if (f23296w == null || f23297x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f23297x = dp;
            f23296w = new CornerPathEffect(dp);
        }
        return f23296w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f23301l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f23299j;
            if (f16 == -1.0f) {
                this.f23299j = f14;
            } else if (f16 != f14) {
                this.f23299j = f14;
                this.f23298i++;
            }
            float lineRight = layout.getLineRight(this.f23298i);
            float lineLeft = this.h.getLineLeft(this.f23298i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f23300k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f23305p) {
                            float f21 = this.f23301l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f23298i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f23304o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f23302m) {
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
            this.f23298i = 0;
            this.f23299j = -1.0f;
            this.f23300k = f7;
            this.f23301l = f10;
            return;
        }
        this.h = layout;
        this.f23298i = layout.getLineForOffset(i10);
        this.f23299j = -1.0f;
        this.f23300k = f7;
        this.f23301l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f23305p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f23307r;
        float f14 = f7 - f13;
        float f15 = this.f23306q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f23308s = Math.min(this.f23308s, Math.min(f14, f17));
        this.f23310u = Math.min(this.f23310u, Math.min(f16, f18));
        this.f23309t = Math.max(this.f23309t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f23303n) {
            return;
        }
        super.reset();
    }

    public g90(int i10) {
        this.f23299j = -1.0f;
        this.f23303n = true;
        this.f23308s = Float.MAX_VALUE;
        this.f23310u = Float.MAX_VALUE;
        this.f23302m = true;
        this.f21567c = false;
    }
}
