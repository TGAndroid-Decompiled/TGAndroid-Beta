package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class x80 extends tq {
    public static CornerPathEffect f32477w;
    public static int f32478x;
    public Layout h;
    public int f32479i;
    public float f32480j;
    public float f32481k;
    public float f32482l;
    public final boolean f32483m;
    public boolean f32484n;
    public int f32485o;
    public int f32486p;
    public float f32487q;
    public float f32488r;
    public float f32489s;
    public float f32490t;
    public float f32491u;
    public float v;

    public x80() {
        this.f32480j = -1.0f;
        this.f32484n = true;
        this.f32489s = Float.MAX_VALUE;
        this.f32491u = Float.MAX_VALUE;
        this.f30705c = false;
    }

    public static CornerPathEffect c() {
        if (f32477w == null || f32478x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f32478x = dp;
            f32477w = new CornerPathEffect(dp);
        }
        return f32477w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f32482l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f32480j;
            if (f16 == -1.0f) {
                this.f32480j = f14;
            } else if (f16 != f14) {
                this.f32480j = f14;
                this.f32479i++;
            }
            float lineRight = layout.getLineRight(this.f32479i);
            float lineLeft = this.h.getLineLeft(this.f32479i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f32481k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f32486p) {
                            float f21 = this.f32482l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f32479i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f32485o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f32483m) {
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
            this.f32479i = 0;
            this.f32480j = -1.0f;
            this.f32481k = f7;
            this.f32482l = f10;
            return;
        }
        this.h = layout;
        this.f32479i = layout.getLineForOffset(i10);
        this.f32480j = -1.0f;
        this.f32481k = f7;
        this.f32482l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f32486p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f32488r;
        float f14 = f7 - f13;
        float f15 = this.f32487q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f32489s = Math.min(this.f32489s, Math.min(f14, f17));
        this.f32491u = Math.min(this.f32491u, Math.min(f16, f18));
        this.f32490t = Math.max(this.f32490t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f32484n) {
            return;
        }
        super.reset();
    }

    public x80(int i10) {
        this.f32480j = -1.0f;
        this.f32484n = true;
        this.f32489s = Float.MAX_VALUE;
        this.f32491u = Float.MAX_VALUE;
        this.f32483m = true;
        this.f30705c = false;
    }
}
