package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class k90 extends xq {
    public static CornerPathEffect f28034w;
    public static int f28035x;
    public Layout h;
    public int f28036i;
    public float f28037j;
    public float f28038k;
    public float f28039l;
    public final boolean f28040m;
    public boolean f28041n;
    public int f28042o;
    public int f28043p;
    public float f28044q;
    public float f28045r;
    public float f28046s;
    public float f28047t;
    public float f28048u;
    public float v;

    public k90() {
        this.f28037j = -1.0f;
        this.f28041n = true;
        this.f28046s = Float.MAX_VALUE;
        this.f28048u = Float.MAX_VALUE;
        this.f32968c = false;
    }

    public static CornerPathEffect c() {
        if (f28034w == null || f28035x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f28035x = dp;
            f28034w = new CornerPathEffect(dp);
        }
        return f28034w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f28039l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f28037j;
            if (f16 == -1.0f) {
                this.f28037j = f14;
            } else if (f16 != f14) {
                this.f28037j = f14;
                this.f28036i++;
            }
            float lineRight = layout.getLineRight(this.f28036i);
            float lineLeft = this.h.getLineLeft(this.f28036i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f28038k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f28043p) {
                            float f21 = this.f28039l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f28036i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f28042o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f28040m) {
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
            this.f28036i = 0;
            this.f28037j = -1.0f;
            this.f28038k = f7;
            this.f28039l = f10;
            return;
        }
        this.h = layout;
        this.f28036i = layout.getLineForOffset(i10);
        this.f28037j = -1.0f;
        this.f28038k = f7;
        this.f28039l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f28043p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f28045r;
        float f14 = f7 - f13;
        float f15 = this.f28044q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f28046s = Math.min(this.f28046s, Math.min(f14, f17));
        this.f28048u = Math.min(this.f28048u, Math.min(f16, f18));
        this.f28047t = Math.max(this.f28047t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f28041n) {
            return;
        }
        super.reset();
    }

    public k90(int i10) {
        this.f28037j = -1.0f;
        this.f28041n = true;
        this.f28046s = Float.MAX_VALUE;
        this.f28048u = Float.MAX_VALUE;
        this.f28040m = true;
        this.f32968c = false;
    }
}
