package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class k90 extends xq {
    public static CornerPathEffect f25702w;
    public static int f25703x;
    public Layout h;
    public int f25704i;
    public float f25705j;
    public float f25706k;
    public float f25707l;
    public final boolean f25708m;
    public boolean f25709n;
    public int f25710o;
    public int f25711p;
    public float f25712q;
    public float f25713r;
    public float f25714s;
    public float f25715t;
    public float f25716u;
    public float v;

    public k90() {
        this.f25705j = -1.0f;
        this.f25709n = true;
        this.f25714s = Float.MAX_VALUE;
        this.f25716u = Float.MAX_VALUE;
        this.f30451c = false;
    }

    public static CornerPathEffect c() {
        if (f25702w == null || f25703x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f25703x = dp;
            f25702w = new CornerPathEffect(dp);
        }
        return f25702w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f25707l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f25705j;
            if (f16 == -1.0f) {
                this.f25705j = f14;
            } else if (f16 != f14) {
                this.f25705j = f14;
                this.f25704i++;
            }
            float lineRight = layout.getLineRight(this.f25704i);
            float lineLeft = this.h.getLineLeft(this.f25704i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f25706k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f25711p) {
                            float f21 = this.f25707l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f25704i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f25710o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f25708m) {
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
            this.f25704i = 0;
            this.f25705j = -1.0f;
            this.f25706k = f7;
            this.f25707l = f10;
            return;
        }
        this.h = layout;
        this.f25704i = layout.getLineForOffset(i10);
        this.f25705j = -1.0f;
        this.f25706k = f7;
        this.f25707l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f25711p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f25713r;
        float f14 = f7 - f13;
        float f15 = this.f25712q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f25714s = Math.min(this.f25714s, Math.min(f14, f17));
        this.f25716u = Math.min(this.f25716u, Math.min(f16, f18));
        this.f25715t = Math.max(this.f25715t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f25709n) {
            return;
        }
        super.reset();
    }

    public k90(int i10) {
        this.f25705j = -1.0f;
        this.f25709n = true;
        this.f25714s = Float.MAX_VALUE;
        this.f25716u = Float.MAX_VALUE;
        this.f25708m = true;
        this.f30451c = false;
    }
}
