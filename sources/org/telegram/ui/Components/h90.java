package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class h90 extends uq {
    public static CornerPathEffect f24743w;
    public static int f24744x;
    public Layout h;
    public int f24745i;
    public float f24746j;
    public float f24747k;
    public float f24748l;
    public final boolean f24749m;
    public boolean f24750n;
    public int f24751o;
    public int f24752p;
    public float f24753q;
    public float f24754r;
    public float f24755s;
    public float f24756t;
    public float f24757u;
    public float v;

    public h90() {
        this.f24746j = -1.0f;
        this.f24750n = true;
        this.f24755s = Float.MAX_VALUE;
        this.f24757u = Float.MAX_VALUE;
        this.f28879c = false;
    }

    public static CornerPathEffect c() {
        if (f24743w == null || f24744x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f24744x = dp;
            f24743w = new CornerPathEffect(dp);
        }
        return f24743w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f24748l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f24746j;
            if (f16 == -1.0f) {
                this.f24746j = f14;
            } else if (f16 != f14) {
                this.f24746j = f14;
                this.f24745i++;
            }
            float lineRight = layout.getLineRight(this.f24745i);
            float lineLeft = this.h.getLineLeft(this.f24745i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f24747k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f24752p) {
                            float f21 = this.f24748l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f24745i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f24751o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f24749m) {
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
            this.f24745i = 0;
            this.f24746j = -1.0f;
            this.f24747k = f7;
            this.f24748l = f10;
            return;
        }
        this.h = layout;
        this.f24745i = layout.getLineForOffset(i10);
        this.f24746j = -1.0f;
        this.f24747k = f7;
        this.f24748l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f24752p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f24754r;
        float f14 = f7 - f13;
        float f15 = this.f24753q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f24755s = Math.min(this.f24755s, Math.min(f14, f17));
        this.f24757u = Math.min(this.f24757u, Math.min(f16, f18));
        this.f24756t = Math.max(this.f24756t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f24750n) {
            return;
        }
        super.reset();
    }

    public h90(int i10) {
        this.f24746j = -1.0f;
        this.f24750n = true;
        this.f24755s = Float.MAX_VALUE;
        this.f24757u = Float.MAX_VALUE;
        this.f24749m = true;
        this.f28879c = false;
    }
}
