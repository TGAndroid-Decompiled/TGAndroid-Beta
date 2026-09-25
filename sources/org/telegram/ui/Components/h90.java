package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class h90 extends vq {
    public static CornerPathEffect f24694w;
    public static int f24695x;
    public Layout h;
    public int f24696i;
    public float f24697j;
    public float f24698k;
    public float f24699l;
    public final boolean f24700m;
    public boolean f24701n;
    public int f24702o;
    public int f24703p;
    public float f24704q;
    public float f24705r;
    public float f24706s;
    public float f24707t;
    public float f24708u;
    public float v;

    public h90() {
        this.f24697j = -1.0f;
        this.f24701n = true;
        this.f24706s = Float.MAX_VALUE;
        this.f24708u = Float.MAX_VALUE;
        this.f29791c = false;
    }

    public static CornerPathEffect c() {
        if (f24694w == null || f24695x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f24695x = dp;
            f24694w = new CornerPathEffect(dp);
        }
        return f24694w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f24699l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f24697j;
            if (f16 == -1.0f) {
                this.f24697j = f14;
            } else if (f16 != f14) {
                this.f24697j = f14;
                this.f24696i++;
            }
            float lineRight = layout.getLineRight(this.f24696i);
            float lineLeft = this.h.getLineLeft(this.f24696i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f24698k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f24703p) {
                            float f21 = this.f24699l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f24696i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f24702o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f24700m) {
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
            this.f24696i = 0;
            this.f24697j = -1.0f;
            this.f24698k = f7;
            this.f24699l = f10;
            return;
        }
        this.h = layout;
        this.f24696i = layout.getLineForOffset(i10);
        this.f24697j = -1.0f;
        this.f24698k = f7;
        this.f24699l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f24703p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f24705r;
        float f14 = f7 - f13;
        float f15 = this.f24704q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f24706s = Math.min(this.f24706s, Math.min(f14, f17));
        this.f24708u = Math.min(this.f24708u, Math.min(f16, f18));
        this.f24707t = Math.max(this.f24707t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f24701n) {
            return;
        }
        super.reset();
    }

    public h90(int i10) {
        this.f24697j = -1.0f;
        this.f24701n = true;
        this.f24706s = Float.MAX_VALUE;
        this.f24708u = Float.MAX_VALUE;
        this.f24700m = true;
        this.f29791c = false;
    }
}
