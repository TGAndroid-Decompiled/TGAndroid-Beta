package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class s80 extends oq {
    public static CornerPathEffect f32539w;
    public static int f32540x;
    public Layout h;
    public int f32541i;
    public float f32542j;
    public float f32543k;
    public float f32544l;
    public final boolean f32545m;
    public boolean f32546n;
    public int f32547o;
    public int f32548p;
    public float f32549q;
    public float f32550r;
    public float f32551s;
    public float f32552t;
    public float f32553u;
    public float v;

    public s80() {
        this.f32542j = -1.0f;
        this.f32546n = true;
        this.f32551s = Float.MAX_VALUE;
        this.f32553u = Float.MAX_VALUE;
        this.f31451c = false;
    }

    public static CornerPathEffect c() {
        if (f32539w == null || f32540x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f32540x = dp;
            f32539w = new CornerPathEffect(dp);
        }
        return f32539w;
    }

    @Override
    public final void addRect(float f9, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f9, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f32544l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f32542j;
            if (f16 == -1.0f) {
                this.f32542j = f14;
            } else if (f16 != f14) {
                this.f32542j = f14;
                this.f32541i++;
            }
            float lineRight = layout.getLineRight(this.f32541i);
            float lineLeft = this.h.getLineLeft(this.f32541i);
            if (f9 < lineRight) {
                int i10 = (f9 > lineLeft ? 1 : (f9 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f9 = lineLeft;
                    }
                    float f17 = this.f32543k;
                    float f18 = f9 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f32548p) {
                            float f21 = this.f32544l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f32541i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f32547o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f32545m) {
                        f(f18 - (AndroidUtilities.dp(5.0f) / 2.0f), f22, f19 + (AndroidUtilities.dp(5.0f) / 2.0f), f23, direction);
                    } else {
                        f(f18, f22, f19, f23, direction);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(Layout layout, int i10, float f9) {
        e(layout, i10, 0.0f, f9);
    }

    public final void e(Layout layout, int i10, float f9, float f10) {
        int lineCount;
        if (layout == null) {
            this.h = null;
            this.f32541i = 0;
            this.f32542j = -1.0f;
            this.f32543k = f9;
            this.f32544l = f10;
            return;
        }
        this.h = layout;
        this.f32541i = layout.getLineForOffset(i10);
        this.f32542j = -1.0f;
        this.f32543k = f9;
        this.f32544l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f32548p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f9, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f32550r;
        float f14 = f9 - f13;
        float f15 = this.f32549q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f32551s = Math.min(this.f32551s, Math.min(f14, f17));
        this.f32553u = Math.min(this.f32553u, Math.min(f16, f18));
        this.f32552t = Math.max(this.f32552t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f32546n) {
            return;
        }
        super.reset();
    }

    public s80(int i10) {
        this.f32542j = -1.0f;
        this.f32546n = true;
        this.f32551s = Float.MAX_VALUE;
        this.f32553u = Float.MAX_VALUE;
        this.f32545m = true;
        this.f31451c = false;
    }
}
