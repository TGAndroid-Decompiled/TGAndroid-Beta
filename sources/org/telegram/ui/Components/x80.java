package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class x80 extends tq {
    public static CornerPathEffect f32450w;
    public static int f32451x;
    public Layout h;
    public int f32452i;
    public float f32453j;
    public float f32454k;
    public float f32455l;
    public final boolean f32456m;
    public boolean f32457n;
    public int f32458o;
    public int f32459p;
    public float f32460q;
    public float f32461r;
    public float f32462s;
    public float f32463t;
    public float f32464u;
    public float v;

    public x80() {
        this.f32453j = -1.0f;
        this.f32457n = true;
        this.f32462s = Float.MAX_VALUE;
        this.f32464u = Float.MAX_VALUE;
        this.f30678c = false;
    }

    public static CornerPathEffect c() {
        if (f32450w == null || f32451x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f32451x = dp;
            f32450w = new CornerPathEffect(dp);
        }
        return f32450w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f32455l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f32453j;
            if (f16 == -1.0f) {
                this.f32453j = f14;
            } else if (f16 != f14) {
                this.f32453j = f14;
                this.f32452i++;
            }
            float lineRight = layout.getLineRight(this.f32452i);
            float lineLeft = this.h.getLineLeft(this.f32452i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f32454k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f32459p) {
                            float f21 = this.f32455l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f32452i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f32458o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f32456m) {
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
            this.f32452i = 0;
            this.f32453j = -1.0f;
            this.f32454k = f7;
            this.f32455l = f10;
            return;
        }
        this.h = layout;
        this.f32452i = layout.getLineForOffset(i10);
        this.f32453j = -1.0f;
        this.f32454k = f7;
        this.f32455l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f32459p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f32461r;
        float f14 = f7 - f13;
        float f15 = this.f32460q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f32462s = Math.min(this.f32462s, Math.min(f14, f17));
        this.f32464u = Math.min(this.f32464u, Math.min(f16, f18));
        this.f32463t = Math.max(this.f32463t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f32457n) {
            return;
        }
        super.reset();
    }

    public x80(int i10) {
        this.f32453j = -1.0f;
        this.f32457n = true;
        this.f32462s = Float.MAX_VALUE;
        this.f32464u = Float.MAX_VALUE;
        this.f32456m = true;
        this.f30678c = false;
    }
}
