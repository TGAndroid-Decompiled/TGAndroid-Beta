package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class w80 extends uq {
    public static CornerPathEffect f29653w;
    public static int f29654x;
    public Layout h;
    public int f29655i;
    public float f29656j;
    public float f29657k;
    public float f29658l;
    public final boolean f29659m;
    public boolean f29660n;
    public int f29661o;
    public int f29662p;
    public float f29663q;
    public float f29664r;
    public float f29665s;
    public float f29666t;
    public float f29667u;
    public float v;

    public w80() {
        this.f29656j = -1.0f;
        this.f29660n = true;
        this.f29665s = Float.MAX_VALUE;
        this.f29667u = Float.MAX_VALUE;
        this.f28486c = false;
    }

    public static CornerPathEffect c() {
        if (f29653w == null || f29654x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f29654x = dp;
            f29653w = new CornerPathEffect(dp);
        }
        return f29653w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f29658l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f29656j;
            if (f16 == -1.0f) {
                this.f29656j = f14;
            } else if (f16 != f14) {
                this.f29656j = f14;
                this.f29655i++;
            }
            float lineRight = layout.getLineRight(this.f29655i);
            float lineLeft = this.h.getLineLeft(this.f29655i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f29657k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f29662p) {
                            float f21 = this.f29658l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f29655i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f29661o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f29659m) {
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
            this.f29655i = 0;
            this.f29656j = -1.0f;
            this.f29657k = f7;
            this.f29658l = f10;
            return;
        }
        this.h = layout;
        this.f29655i = layout.getLineForOffset(i10);
        this.f29656j = -1.0f;
        this.f29657k = f7;
        this.f29658l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f29662p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f29664r;
        float f14 = f7 - f13;
        float f15 = this.f29663q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f29665s = Math.min(this.f29665s, Math.min(f14, f17));
        this.f29667u = Math.min(this.f29667u, Math.min(f16, f18));
        this.f29666t = Math.max(this.f29666t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f29660n) {
            return;
        }
        super.reset();
    }

    public w80(int i10) {
        this.f29656j = -1.0f;
        this.f29660n = true;
        this.f29665s = Float.MAX_VALUE;
        this.f29667u = Float.MAX_VALUE;
        this.f29659m = true;
        this.f28486c = false;
    }
}
