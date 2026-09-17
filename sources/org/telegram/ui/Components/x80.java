package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class x80 extends tq {
    public static CornerPathEffect f32451w;
    public static int f32452x;
    public Layout h;
    public int f32453i;
    public float f32454j;
    public float f32455k;
    public float f32456l;
    public final boolean f32457m;
    public boolean f32458n;
    public int f32459o;
    public int f32460p;
    public float f32461q;
    public float f32462r;
    public float f32463s;
    public float f32464t;
    public float f32465u;
    public float v;

    public x80() {
        this.f32454j = -1.0f;
        this.f32458n = true;
        this.f32463s = Float.MAX_VALUE;
        this.f32465u = Float.MAX_VALUE;
        this.f30679c = false;
    }

    public static CornerPathEffect c() {
        if (f32451w == null || f32452x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f32452x = dp;
            f32451w = new CornerPathEffect(dp);
        }
        return f32451w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f32456l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f32454j;
            if (f16 == -1.0f) {
                this.f32454j = f14;
            } else if (f16 != f14) {
                this.f32454j = f14;
                this.f32453i++;
            }
            float lineRight = layout.getLineRight(this.f32453i);
            float lineLeft = this.h.getLineLeft(this.f32453i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f32455k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f32460p) {
                            float f21 = this.f32456l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f32453i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f32459o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f32457m) {
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
            this.f32453i = 0;
            this.f32454j = -1.0f;
            this.f32455k = f7;
            this.f32456l = f10;
            return;
        }
        this.h = layout;
        this.f32453i = layout.getLineForOffset(i10);
        this.f32454j = -1.0f;
        this.f32455k = f7;
        this.f32456l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f32460p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f32462r;
        float f14 = f7 - f13;
        float f15 = this.f32461q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f32463s = Math.min(this.f32463s, Math.min(f14, f17));
        this.f32465u = Math.min(this.f32465u, Math.min(f16, f18));
        this.f32464t = Math.max(this.f32464t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f32458n) {
            return;
        }
        super.reset();
    }

    public x80(int i10) {
        this.f32454j = -1.0f;
        this.f32458n = true;
        this.f32463s = Float.MAX_VALUE;
        this.f32465u = Float.MAX_VALUE;
        this.f32457m = true;
        this.f30679c = false;
    }
}
