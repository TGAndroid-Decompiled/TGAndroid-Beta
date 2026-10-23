package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class s90 extends dr {
    public static CornerPathEffect f30425w;
    public static int f30426x;
    public Layout h;
    public int f30427i;
    public float f30428j;
    public float f30429k;
    public float f30430l;
    public final boolean f30431m;
    public boolean f30432n;
    public int f30433o;
    public int f30434p;
    public float f30435q;
    public float f30436r;
    public float f30437s;
    public float f30438t;
    public float f30439u;
    public float v;

    public s90() {
        this.f30428j = -1.0f;
        this.f30432n = true;
        this.f30437s = Float.MAX_VALUE;
        this.f30439u = Float.MAX_VALUE;
        this.f25718c = false;
    }

    public static CornerPathEffect c() {
        if (f30425w == null || f30426x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f30426x = dp;
            f30425w = new CornerPathEffect(dp);
        }
        return f30425w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f30430l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f30428j;
            if (f16 == -1.0f) {
                this.f30428j = f14;
            } else if (f16 != f14) {
                this.f30428j = f14;
                this.f30427i++;
            }
            float lineRight = layout.getLineRight(this.f30427i);
            float lineLeft = this.h.getLineLeft(this.f30427i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f30429k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f30434p) {
                            float f21 = this.f30430l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f30427i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f30433o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f30431m) {
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
            this.f30427i = 0;
            this.f30428j = -1.0f;
            this.f30429k = f7;
            this.f30430l = f10;
            return;
        }
        this.h = layout;
        this.f30427i = layout.getLineForOffset(i10);
        this.f30428j = -1.0f;
        this.f30429k = f7;
        this.f30430l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f30434p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f30436r;
        float f14 = f7 - f13;
        float f15 = this.f30435q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f30437s = Math.min(this.f30437s, Math.min(f14, f17));
        this.f30439u = Math.min(this.f30439u, Math.min(f16, f18));
        this.f30438t = Math.max(this.f30438t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f30432n) {
            return;
        }
        super.reset();
    }

    public s90(int i10) {
        this.f30428j = -1.0f;
        this.f30432n = true;
        this.f30437s = Float.MAX_VALUE;
        this.f30439u = Float.MAX_VALUE;
        this.f30431m = true;
        this.f25718c = false;
    }
}
