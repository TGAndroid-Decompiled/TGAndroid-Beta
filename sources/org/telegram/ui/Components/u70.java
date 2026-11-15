package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
public final class u70 extends iq {
    public static CornerPathEffect f39942w;
    public static int f39943x;
    public Layout h;
    public int f39944i;
    public float f39945j;
    public float f39946k;
    public float f39947l;
    public final boolean f39948m;
    public boolean f39949n;
    public int f39950o;
    public int f39951p;
    public float f39952q;
    public float f39953r;
    public float f39954s;
    public float f39955t;
    public float f39956u;
    public float v;

    public u70() {
        this.f39945j = -1.0f;
        this.f39949n = true;
        this.f39954s = Float.MAX_VALUE;
        this.f39956u = Float.MAX_VALUE;
        this.f35696c = false;
    }

    public static CornerPathEffect c() {
        if (f39942w == null || f39943x != org.telegram.messenger.g0.L(5.0f)) {
            int L = org.telegram.messenger.g0.L(5.0f);
            f39943x = L;
            f39942w = new CornerPathEffect(L);
        }
        return f39942w;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f10, f11, f12, f13, direction);
            return;
        }
        try {
            float f14 = this.f39947l;
            float f15 = f11 + f14;
            float f16 = f13 + f14;
            float f17 = this.f39945j;
            if (f17 == -1.0f) {
                this.f39945j = f15;
            } else if (f17 != f15) {
                this.f39945j = f15;
                this.f39944i++;
            }
            float lineRight = layout.getLineRight(this.f39944i);
            float lineLeft = this.h.getLineLeft(this.f39944i);
            if (f10 < lineRight) {
                int i7 = (f10 > lineLeft ? 1 : (f10 == lineLeft ? 0 : -1));
                if (i7 > 0 || f12 > lineLeft) {
                    if (f12 > lineRight) {
                        f12 = lineRight;
                    }
                    if (i7 < 0) {
                        f10 = lineLeft;
                    }
                    float f18 = this.f39946k;
                    float f19 = f10 + f18;
                    float f20 = f12 + f18;
                    float f21 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f16 - f15 > this.f39951p) {
                            float f22 = this.f39947l;
                            if (f16 != this.h.getHeight()) {
                                f21 = this.h.getLineBottom(this.f39944i) - this.h.getSpacingAdd();
                            }
                            f16 = f22 + f21;
                        }
                    } else {
                        if (f16 != this.h.getHeight()) {
                            f21 = this.h.getSpacingAdd();
                        }
                        f16 -= f21;
                    }
                    int i10 = this.f39950o;
                    if (i10 < 0) {
                        f16 += i10;
                    } else if (i10 > 0) {
                        f15 += i10;
                    }
                    float f23 = f15;
                    float f24 = f16;
                    if (this.f39948m) {
                        f(f19 - (org.telegram.messenger.g0.L(5.0f) / 2.0f), f23, f20 + (org.telegram.messenger.g0.L(5.0f) / 2.0f), f24, direction);
                    } else {
                        f(f19, f23, f20, f24, direction);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(Layout layout, int i7, float f10) {
        e(layout, i7, 0.0f, f10);
    }

    public final void e(Layout layout, int i7, float f10, float f11) {
        int lineCount;
        if (layout == null) {
            this.h = null;
            this.f39944i = 0;
            this.f39945j = -1.0f;
            this.f39946k = f10;
            this.f39947l = f11;
            return;
        }
        this.h = layout;
        this.f39944i = layout.getLineForOffset(i7);
        this.f39945j = -1.0f;
        this.f39946k = f10;
        this.f39947l = f11;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i10 = lineCount - 1;
            this.f39951p = layout.getLineBottom(i10) - layout.getLineTop(i10);
        }
    }

    public final void f(float f10, float f11, float f12, float f13, Path.Direction direction) {
        float f14 = this.f39953r;
        float f15 = f10 - f14;
        float f16 = this.f39952q;
        float f17 = f11 - f16;
        float f18 = f12 + f14;
        float f19 = f13 + f16;
        this.f39954s = Math.min(this.f39954s, Math.min(f15, f18));
        this.f39956u = Math.min(this.f39956u, Math.min(f17, f19));
        this.f39955t = Math.max(this.f39955t, Math.max(f15, f18));
        this.v = Math.max(this.v, Math.max(f17, f19));
        super.addRect(f15, f17, f18, f19, direction);
    }

    @Override
    public final void reset() {
        if (!this.f39949n) {
            return;
        }
        super.reset();
    }

    public u70(int i7) {
        this.f39945j = -1.0f;
        this.f39949n = true;
        this.f39954s = Float.MAX_VALUE;
        this.f39956u = Float.MAX_VALUE;
        this.f39948m = true;
        this.f35696c = false;
    }
}
