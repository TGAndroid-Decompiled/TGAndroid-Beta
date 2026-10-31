package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
public final class k80 extends jq {
    public static CornerPathEffect f27678w;
    public static int f27679x;
    public Layout h;
    public int f27680i;
    public float f27681j;
    public float f27682k;
    public float f27683l;
    public final boolean f27684m;
    public boolean f27685n;
    public int f27686o;
    public int f27687p;
    public float f27688q;
    public float f27689r;
    public float f27690s;
    public float f27691t;
    public float f27692u;
    public float v;

    public k80() {
        this.f27681j = -1.0f;
        this.f27685n = true;
        this.f27690s = Float.MAX_VALUE;
        this.f27692u = Float.MAX_VALUE;
        this.f27471c = false;
    }

    public static CornerPathEffect c() {
        if (f27678w == null || f27679x != org.telegram.messenger.i0.L(5.0f)) {
            int L = org.telegram.messenger.i0.L(5.0f);
            f27679x = L;
            f27678w = new CornerPathEffect(L);
        }
        return f27678w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f27683l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f27681j;
            if (f16 == -1.0f) {
                this.f27681j = f14;
            } else if (f16 != f14) {
                this.f27681j = f14;
                this.f27680i++;
            }
            float lineRight = layout.getLineRight(this.f27680i);
            float lineLeft = this.h.getLineLeft(this.f27680i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f27682k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f27687p) {
                            float f21 = this.f27683l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f27680i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f27686o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f27684m) {
                        f(f18 - (org.telegram.messenger.i0.L(5.0f) / 2.0f), f22, f19 + (org.telegram.messenger.i0.L(5.0f) / 2.0f), f23, direction);
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
            this.f27680i = 0;
            this.f27681j = -1.0f;
            this.f27682k = f7;
            this.f27683l = f10;
            return;
        }
        this.h = layout;
        this.f27680i = layout.getLineForOffset(i10);
        this.f27681j = -1.0f;
        this.f27682k = f7;
        this.f27683l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f27687p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f27689r;
        float f14 = f7 - f13;
        float f15 = this.f27688q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f27690s = Math.min(this.f27690s, Math.min(f14, f17));
        this.f27692u = Math.min(this.f27692u, Math.min(f16, f18));
        this.f27691t = Math.max(this.f27691t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f27685n) {
            return;
        }
        super.reset();
    }

    public k80(int i10) {
        this.f27681j = -1.0f;
        this.f27685n = true;
        this.f27690s = Float.MAX_VALUE;
        this.f27692u = Float.MAX_VALUE;
        this.f27684m = true;
        this.f27471c = false;
    }
}
