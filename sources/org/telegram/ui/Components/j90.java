package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class j90 extends wq {
    public static CornerPathEffect f25394w;
    public static int f25395x;
    public Layout h;
    public int f25396i;
    public float f25397j;
    public float f25398k;
    public float f25399l;
    public final boolean f25400m;
    public boolean f25401n;
    public int f25402o;
    public int f25403p;
    public float f25404q;
    public float f25405r;
    public float f25406s;
    public float f25407t;
    public float f25408u;
    public float v;

    public j90() {
        this.f25397j = -1.0f;
        this.f25401n = true;
        this.f25406s = Float.MAX_VALUE;
        this.f25408u = Float.MAX_VALUE;
        this.f30123c = false;
    }

    public static CornerPathEffect c() {
        if (f25394w == null || f25395x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f25395x = dp;
            f25394w = new CornerPathEffect(dp);
        }
        return f25394w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f25399l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f25397j;
            if (f16 == -1.0f) {
                this.f25397j = f14;
            } else if (f16 != f14) {
                this.f25397j = f14;
                this.f25396i++;
            }
            float lineRight = layout.getLineRight(this.f25396i);
            float lineLeft = this.h.getLineLeft(this.f25396i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f25398k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f25403p) {
                            float f21 = this.f25399l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f25396i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f25402o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f25400m) {
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
            this.f25396i = 0;
            this.f25397j = -1.0f;
            this.f25398k = f7;
            this.f25399l = f10;
            return;
        }
        this.h = layout;
        this.f25396i = layout.getLineForOffset(i10);
        this.f25397j = -1.0f;
        this.f25398k = f7;
        this.f25399l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f25403p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f25405r;
        float f14 = f7 - f13;
        float f15 = this.f25404q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f25406s = Math.min(this.f25406s, Math.min(f14, f17));
        this.f25408u = Math.min(this.f25408u, Math.min(f16, f18));
        this.f25407t = Math.max(this.f25407t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f25401n) {
            return;
        }
        super.reset();
    }

    public j90(int i10) {
        this.f25397j = -1.0f;
        this.f25401n = true;
        this.f25406s = Float.MAX_VALUE;
        this.f25408u = Float.MAX_VALUE;
        this.f25400m = true;
        this.f30123c = false;
    }
}
