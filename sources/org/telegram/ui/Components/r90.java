package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class r90 extends er {
    public static CornerPathEffect f29887w;
    public static int f29888x;
    public Layout h;
    public int f29889i;
    public float f29890j;
    public float f29891k;
    public float f29892l;
    public final boolean f29893m;
    public boolean f29894n;
    public int f29895o;
    public int f29896p;
    public float f29897q;
    public float f29898r;
    public float f29899s;
    public float f29900t;
    public float f29901u;
    public float v;

    public r90() {
        this.f29890j = -1.0f;
        this.f29894n = true;
        this.f29899s = Float.MAX_VALUE;
        this.f29901u = Float.MAX_VALUE;
        this.f25972c = false;
    }

    public static CornerPathEffect c() {
        if (f29887w == null || f29888x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f29888x = dp;
            f29887w = new CornerPathEffect(dp);
        }
        return f29887w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f29892l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f29890j;
            if (f16 == -1.0f) {
                this.f29890j = f14;
            } else if (f16 != f14) {
                this.f29890j = f14;
                this.f29889i++;
            }
            float lineRight = layout.getLineRight(this.f29889i);
            float lineLeft = this.h.getLineLeft(this.f29889i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f29891k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f29896p) {
                            float f21 = this.f29892l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f29889i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f29895o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f29893m) {
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
            this.f29889i = 0;
            this.f29890j = -1.0f;
            this.f29891k = f7;
            this.f29892l = f10;
            return;
        }
        this.h = layout;
        this.f29889i = layout.getLineForOffset(i10);
        this.f29890j = -1.0f;
        this.f29891k = f7;
        this.f29892l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f29896p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f29898r;
        float f14 = f7 - f13;
        float f15 = this.f29897q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f29899s = Math.min(this.f29899s, Math.min(f14, f17));
        this.f29901u = Math.min(this.f29901u, Math.min(f16, f18));
        this.f29900t = Math.max(this.f29900t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f29894n) {
            return;
        }
        super.reset();
    }

    public r90(int i10) {
        this.f29890j = -1.0f;
        this.f29894n = true;
        this.f29899s = Float.MAX_VALUE;
        this.f29901u = Float.MAX_VALUE;
        this.f29893m = true;
        this.f25972c = false;
    }
}
