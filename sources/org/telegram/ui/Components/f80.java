package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class f80 extends kq {
    public static CornerPathEffect f28326w;
    public static int f28327x;
    public Layout h;
    public int f28328i;
    public float f28329j;
    public float f28330k;
    public float f28331l;
    public final boolean f28332m;
    public boolean f28333n;
    public int f28334o;
    public int f28335p;
    public float f28336q;
    public float f28337r;
    public float f28338s;
    public float f28339t;
    public float f28340u;
    public float v;

    public f80() {
        this.f28329j = -1.0f;
        this.f28333n = true;
        this.f28338s = Float.MAX_VALUE;
        this.f28340u = Float.MAX_VALUE;
        this.f30219c = false;
    }

    public static CornerPathEffect c() {
        if (f28326w == null || f28327x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f28327x = dp;
            f28326w = new CornerPathEffect(dp);
        }
        return f28326w;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f10, f11, f12, f13, direction);
            return;
        }
        try {
            float f14 = this.f28331l;
            float f15 = f11 + f14;
            float f16 = f13 + f14;
            float f17 = this.f28329j;
            if (f17 == -1.0f) {
                this.f28329j = f15;
            } else if (f17 != f15) {
                this.f28329j = f15;
                this.f28328i++;
            }
            float lineRight = layout.getLineRight(this.f28328i);
            float lineLeft = this.h.getLineLeft(this.f28328i);
            if (f10 < lineRight) {
                int i9 = (f10 > lineLeft ? 1 : (f10 == lineLeft ? 0 : -1));
                if (i9 > 0 || f12 > lineLeft) {
                    if (f12 > lineRight) {
                        f12 = lineRight;
                    }
                    if (i9 < 0) {
                        f10 = lineLeft;
                    }
                    float f18 = this.f28330k;
                    float f19 = f10 + f18;
                    float f20 = f12 + f18;
                    float f21 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f16 - f15 > this.f28335p) {
                            float f22 = this.f28331l;
                            if (f16 != this.h.getHeight()) {
                                f21 = this.h.getLineBottom(this.f28328i) - this.h.getSpacingAdd();
                            }
                            f16 = f22 + f21;
                        }
                    } else {
                        if (f16 != this.h.getHeight()) {
                            f21 = this.h.getSpacingAdd();
                        }
                        f16 -= f21;
                    }
                    int i10 = this.f28334o;
                    if (i10 < 0) {
                        f16 += i10;
                    } else if (i10 > 0) {
                        f15 += i10;
                    }
                    float f23 = f15;
                    float f24 = f16;
                    if (this.f28332m) {
                        f(f19 - (AndroidUtilities.dp(5.0f) / 2.0f), f23, f20 + (AndroidUtilities.dp(5.0f) / 2.0f), f24, direction);
                    } else {
                        f(f19, f23, f20, f24, direction);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(Layout layout, int i9, float f10) {
        e(layout, i9, 0.0f, f10);
    }

    public final void e(Layout layout, int i9, float f10, float f11) {
        int lineCount;
        if (layout == null) {
            this.h = null;
            this.f28328i = 0;
            this.f28329j = -1.0f;
            this.f28330k = f10;
            this.f28331l = f11;
            return;
        }
        this.h = layout;
        this.f28328i = layout.getLineForOffset(i9);
        this.f28329j = -1.0f;
        this.f28330k = f10;
        this.f28331l = f11;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i10 = lineCount - 1;
            this.f28335p = layout.getLineBottom(i10) - layout.getLineTop(i10);
        }
    }

    public final void f(float f10, float f11, float f12, float f13, Path.Direction direction) {
        float f14 = this.f28337r;
        float f15 = f10 - f14;
        float f16 = this.f28336q;
        float f17 = f11 - f16;
        float f18 = f12 + f14;
        float f19 = f13 + f16;
        this.f28338s = Math.min(this.f28338s, Math.min(f15, f18));
        this.f28340u = Math.min(this.f28340u, Math.min(f17, f19));
        this.f28339t = Math.max(this.f28339t, Math.max(f15, f18));
        this.v = Math.max(this.v, Math.max(f17, f19));
        super.addRect(f15, f17, f18, f19, direction);
    }

    @Override
    public final void reset() {
        if (!this.f28333n) {
            return;
        }
        super.reset();
    }

    public f80(int i9) {
        this.f28329j = -1.0f;
        this.f28333n = true;
        this.f28338s = Float.MAX_VALUE;
        this.f28340u = Float.MAX_VALUE;
        this.f28332m = true;
        this.f30219c = false;
    }
}
