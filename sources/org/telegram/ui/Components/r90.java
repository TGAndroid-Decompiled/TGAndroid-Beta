package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class r90 extends er {
    public static CornerPathEffect f29894w;
    public static int f29895x;
    public Layout h;
    public int f29896i;
    public float f29897j;
    public float f29898k;
    public float f29899l;
    public final boolean f29900m;
    public boolean f29901n;
    public int f29902o;
    public int f29903p;
    public float f29904q;
    public float f29905r;
    public float f29906s;
    public float f29907t;
    public float f29908u;
    public float v;

    public r90() {
        this.f29897j = -1.0f;
        this.f29901n = true;
        this.f29906s = Float.MAX_VALUE;
        this.f29908u = Float.MAX_VALUE;
        this.f25955c = false;
    }

    public static CornerPathEffect c() {
        if (f29894w == null || f29895x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f29895x = dp;
            f29894w = new CornerPathEffect(dp);
        }
        return f29894w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f29899l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f29897j;
            if (f16 == -1.0f) {
                this.f29897j = f14;
            } else if (f16 != f14) {
                this.f29897j = f14;
                this.f29896i++;
            }
            float lineRight = layout.getLineRight(this.f29896i);
            float lineLeft = this.h.getLineLeft(this.f29896i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f29898k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f29903p) {
                            float f21 = this.f29899l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f29896i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f29902o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f29900m) {
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
            this.f29896i = 0;
            this.f29897j = -1.0f;
            this.f29898k = f7;
            this.f29899l = f10;
            return;
        }
        this.h = layout;
        this.f29896i = layout.getLineForOffset(i10);
        this.f29897j = -1.0f;
        this.f29898k = f7;
        this.f29899l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f29903p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f29905r;
        float f14 = f7 - f13;
        float f15 = this.f29904q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f29906s = Math.min(this.f29906s, Math.min(f14, f17));
        this.f29908u = Math.min(this.f29908u, Math.min(f16, f18));
        this.f29907t = Math.max(this.f29907t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f29901n) {
            return;
        }
        super.reset();
    }

    public r90(int i10) {
        this.f29897j = -1.0f;
        this.f29901n = true;
        this.f29906s = Float.MAX_VALUE;
        this.f29908u = Float.MAX_VALUE;
        this.f29900m = true;
        this.f25955c = false;
    }
}
