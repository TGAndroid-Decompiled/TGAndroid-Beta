package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class k90 extends xq {
    public static CornerPathEffect f28029w;
    public static int f28030x;
    public Layout h;
    public int f28031i;
    public float f28032j;
    public float f28033k;
    public float f28034l;
    public final boolean f28035m;
    public boolean f28036n;
    public int f28037o;
    public int f28038p;
    public float f28039q;
    public float f28040r;
    public float f28041s;
    public float f28042t;
    public float f28043u;
    public float v;

    public k90() {
        this.f28032j = -1.0f;
        this.f28036n = true;
        this.f28041s = Float.MAX_VALUE;
        this.f28043u = Float.MAX_VALUE;
        this.f32962c = false;
    }

    public static CornerPathEffect c() {
        if (f28029w == null || f28030x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f28030x = dp;
            f28029w = new CornerPathEffect(dp);
        }
        return f28029w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f28034l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f28032j;
            if (f16 == -1.0f) {
                this.f28032j = f14;
            } else if (f16 != f14) {
                this.f28032j = f14;
                this.f28031i++;
            }
            float lineRight = layout.getLineRight(this.f28031i);
            float lineLeft = this.h.getLineLeft(this.f28031i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f28033k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f28038p) {
                            float f21 = this.f28034l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f28031i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f28037o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f28035m) {
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
            this.f28031i = 0;
            this.f28032j = -1.0f;
            this.f28033k = f7;
            this.f28034l = f10;
            return;
        }
        this.h = layout;
        this.f28031i = layout.getLineForOffset(i10);
        this.f28032j = -1.0f;
        this.f28033k = f7;
        this.f28034l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f28038p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f28040r;
        float f14 = f7 - f13;
        float f15 = this.f28039q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f28041s = Math.min(this.f28041s, Math.min(f14, f17));
        this.f28043u = Math.min(this.f28043u, Math.min(f16, f18));
        this.f28042t = Math.max(this.f28042t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f28036n) {
            return;
        }
        super.reset();
    }

    public k90(int i10) {
        this.f28032j = -1.0f;
        this.f28036n = true;
        this.f28041s = Float.MAX_VALUE;
        this.f28043u = Float.MAX_VALUE;
        this.f28035m = true;
        this.f32962c = false;
    }
}
