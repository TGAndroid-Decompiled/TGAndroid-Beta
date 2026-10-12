package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
public final class ca0 extends mr {
    public static CornerPathEffect f24891w;
    public static int f24892x;
    public Layout h;
    public int f24893i;
    public float f24894j;
    public float f24895k;
    public float f24896l;
    public final boolean f24897m;
    public boolean f24898n;
    public int f24899o;
    public int f24900p;
    public float f24901q;
    public float f24902r;
    public float f24903s;
    public float f24904t;
    public float f24905u;
    public float v;

    public ca0() {
        this.f24894j = -1.0f;
        this.f24898n = true;
        this.f24903s = Float.MAX_VALUE;
        this.f24905u = Float.MAX_VALUE;
        this.f28637c = false;
    }

    public static CornerPathEffect c() {
        if (f24891w == null || f24892x != AndroidUtilities.dp(5.0f)) {
            int dp = AndroidUtilities.dp(5.0f);
            f24892x = dp;
            f24891w = new CornerPathEffect(dp);
        }
        return f24891w;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f7, f10, f11, f12, direction);
            return;
        }
        try {
            float f13 = this.f24896l;
            float f14 = f10 + f13;
            float f15 = f12 + f13;
            float f16 = this.f24894j;
            if (f16 == -1.0f) {
                this.f24894j = f14;
            } else if (f16 != f14) {
                this.f24894j = f14;
                this.f24893i++;
            }
            float lineRight = layout.getLineRight(this.f24893i);
            float lineLeft = this.h.getLineLeft(this.f24893i);
            if (f7 < lineRight) {
                int i10 = (f7 > lineLeft ? 1 : (f7 == lineLeft ? 0 : -1));
                if (i10 > 0 || f11 > lineLeft) {
                    if (f11 > lineRight) {
                        f11 = lineRight;
                    }
                    if (i10 < 0) {
                        f7 = lineLeft;
                    }
                    float f17 = this.f24895k;
                    float f18 = f7 + f17;
                    float f19 = f11 + f17;
                    float f20 = 0.0f;
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (f15 - f14 > this.f24900p) {
                            float f21 = this.f24896l;
                            if (f15 != this.h.getHeight()) {
                                f20 = this.h.getLineBottom(this.f24893i) - this.h.getSpacingAdd();
                            }
                            f15 = f21 + f20;
                        }
                    } else {
                        if (f15 != this.h.getHeight()) {
                            f20 = this.h.getSpacingAdd();
                        }
                        f15 -= f20;
                    }
                    int i11 = this.f24899o;
                    if (i11 < 0) {
                        f15 += i11;
                    } else if (i11 > 0) {
                        f14 += i11;
                    }
                    float f22 = f14;
                    float f23 = f15;
                    if (this.f24897m) {
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
            this.f24893i = 0;
            this.f24894j = -1.0f;
            this.f24895k = f7;
            this.f24896l = f10;
            return;
        }
        this.h = layout;
        this.f24893i = layout.getLineForOffset(i10);
        this.f24894j = -1.0f;
        this.f24895k = f7;
        this.f24896l = f10;
        if (Build.VERSION.SDK_INT >= 28 && (lineCount = layout.getLineCount()) > 0) {
            int i11 = lineCount - 1;
            this.f24900p = layout.getLineBottom(i11) - layout.getLineTop(i11);
        }
    }

    public final void f(float f7, float f10, float f11, float f12, Path.Direction direction) {
        float f13 = this.f24902r;
        float f14 = f7 - f13;
        float f15 = this.f24901q;
        float f16 = f10 - f15;
        float f17 = f11 + f13;
        float f18 = f12 + f15;
        this.f24903s = Math.min(this.f24903s, Math.min(f14, f17));
        this.f24905u = Math.min(this.f24905u, Math.min(f16, f18));
        this.f24904t = Math.max(this.f24904t, Math.max(f14, f17));
        this.v = Math.max(this.v, Math.max(f16, f18));
        super.addRect(f14, f16, f17, f18, direction);
    }

    @Override
    public final void reset() {
        if (!this.f24898n) {
            return;
        }
        super.reset();
    }

    public ca0(int i10) {
        this.f24894j = -1.0f;
        this.f24898n = true;
        this.f24903s = Float.MAX_VALUE;
        this.f24905u = Float.MAX_VALUE;
        this.f24897m = true;
        this.f28637c = false;
    }
}
