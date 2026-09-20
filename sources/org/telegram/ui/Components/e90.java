package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class e90 extends uq {
    public static CornerPathEffect f23778w;
    public static int f23779x;
    public Layout h;
    public int f23780i;
    public float f23781j;
    public float f23782k;
    public float f23783l;
    public final boolean f23784m;
    public boolean f23785n;
    public int f23786o;
    public int f23787p;
    public float f23788q;
    public float f23789r;
    public float f23790s;
    public float f23791t;
    public float f23792u;
    public float v;

    public e90() {
        this.f23781j = -1.0f;
        this.f23785n = true;
        this.f23790s = Float.MAX_VALUE;
        this.f23792u = Float.MAX_VALUE;
        this.f28801c = false;
    }

    public static CornerPathEffect c() {
        if (f23778w == null || f23779x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f23779x = dp;
            f23778w = new CornerPathEffect(dp);
        }
        return f23778w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f23783l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f23781j;
            if (f16 == -1.0f) {
                this.f23781j = f14;
            } else if (f16 != f14) {
                this.f23781j = f14;
                this.f23780i++;
            }
            float lineRight = layout.getLineRight(this.f23780i);
            float lineLeft = this.h.getLineLeft(this.f23780i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f23782k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f23787p) {
                            float f21 = this.f23783l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f23780i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f23786o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f23784m) {
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
            this.f23780i = 0;
            this.f23781j = -1.0f;
            this.f23782k = f7;
            this.f23783l = f10;
            return;
        }
        this.h = layout;
        this.f23780i = layout.getLineForOffset(i10);
        this.f23781j = -1.0f;
        this.f23782k = f7;
        this.f23783l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f23787p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f23789r;
        float f14 = f7 - f13;
        float f15 = this.f23788q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f23790s = Math.min(this.f23790s, Math.min(f14, f17));
        this.f23792u = Math.min(this.f23792u, Math.min(f16, f18));
        this.f23791t = Math.max(this.f23791t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f23785n) {
            return;
        }
        super.reset();
    }

    public e90(int i10) {
        this.f23781j = -1.0f;
        this.f23785n = true;
        this.f23790s = Float.MAX_VALUE;
        this.f23792u = Float.MAX_VALUE;
        this.f23784m = true;
        this.f28801c = false;
    }
}
