package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class w80 extends uq {
    public static CornerPathEffect f29598w;
    public static int f29599x;
    public Layout h;
    public int f29600i;
    public float f29601j;
    public float f29602k;
    public float f29603l;
    public final boolean f29604m;
    public boolean f29605n;
    public int f29606o;
    public int f29607p;
    public float f29608q;
    public float f29609r;
    public float f29610s;
    public float f29611t;
    public float f29612u;
    public float v;

    public w80() {
        this.f29601j = -1.0f;
        this.f29605n = true;
        this.f29610s = Float.MAX_VALUE;
        this.f29612u = Float.MAX_VALUE;
        this.f28468c = false;
    }

    public static CornerPathEffect c() {
        if (f29598w == null || f29599x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f29599x = dp;
            f29598w = new CornerPathEffect(dp);
        }
        return f29598w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f29603l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f29601j;
            if (f16 == -1.0f) {
                this.f29601j = f14;
            } else if (f16 != f14) {
                this.f29601j = f14;
                this.f29600i++;
            }
            float lineRight = layout.getLineRight(this.f29600i);
            float lineLeft = this.h.getLineLeft(this.f29600i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f29602k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f29607p) {
                            float f21 = this.f29603l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f29600i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f29606o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f29604m) {
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
            this.f29600i = 0;
            this.f29601j = -1.0f;
            this.f29602k = f7;
            this.f29603l = f10;
            return;
        }
        this.h = layout;
        this.f29600i = layout.getLineForOffset(i10);
        this.f29601j = -1.0f;
        this.f29602k = f7;
        this.f29603l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f29607p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f29609r;
        float f14 = f7 - f13;
        float f15 = this.f29608q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f29610s = Math.min(this.f29610s, Math.min(f14, f17));
        this.f29612u = Math.min(this.f29612u, Math.min(f16, f18));
        this.f29611t = Math.max(this.f29611t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f29605n) {
            return;
        }
        super.reset();
    }

    public w80(int i10) {
        this.f29601j = -1.0f;
        this.f29605n = true;
        this.f29610s = Float.MAX_VALUE;
        this.f29612u = Float.MAX_VALUE;
        this.f29604m = true;
        this.f28468c = false;
    }
}
