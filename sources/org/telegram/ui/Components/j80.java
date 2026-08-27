package org.telegram.ui.Components;

import android.graphics.CornerPathEffect;
import android.graphics.Path;
import android.os.Build;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;

public final class j80 extends iq {

    public static CornerPathEffect f29642w;

    public static int f29643x;
    public Layout h;

    public int f29644i;

    public float f29645j;

    public float f29646k;

    public float f29647l;

    public final boolean f29648m;

    public boolean f29649n;

    public int f29650o;

    public int f29651p;

    public float f29652q;

    public float f29653r;

    public float f29654s;

    public float f29655t;

    public float f29656u;
    public float v;

    public j80() {
        this.f29645j = -1.0f;
        this.f29649n = true;
        this.f29654s = Float.MAX_VALUE;
        this.f29656u = Float.MAX_VALUE;
        this.f29462c = false;
    }

    public static CornerPathEffect c() {
        if (f29642w == null || f29643x != AndroidUtilities.dp(5.0f)) {
            int iDp = AndroidUtilities.dp(5.0f);
            f29643x = iDp;
            f29642w = new CornerPathEffect(iDp);
        }
        return f29642w;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Layout layout = this.h;
        if (layout == null) {
            f(f10, f11, f12, f13, direction);
            return;
        }
        try {
            float f14 = this.f29647l;
            float f15 = f11 + f14;
            float spacingAdd = f13 + f14;
            float f16 = this.f29645j;
            if (f16 == -1.0f) {
                this.f29645j = f15;
            } else if (f16 != f15) {
                this.f29645j = f15;
                this.f29644i++;
            }
            float lineRight = layout.getLineRight(this.f29644i);
            float lineLeft = this.h.getLineLeft(this.f29644i);
            if (f10 < lineRight) {
                if (f10 > lineLeft || f12 > lineLeft) {
                    if (f12 > lineRight) {
                        f12 = lineRight;
                    }
                    if (f10 < lineLeft) {
                        f10 = lineLeft;
                    }
                    float f17 = this.f29646k;
                    float f18 = f10 + f17;
                    float f19 = f12 + f17;
                    if (Build.VERSION.SDK_INT < 28) {
                        spacingAdd -= spacingAdd != ((float) this.h.getHeight()) ? this.h.getSpacingAdd() : 0.0f;
                    } else if (spacingAdd - f15 > this.f29651p) {
                        spacingAdd = this.f29647l + (spacingAdd != ((float) this.h.getHeight()) ? this.h.getLineBottom(this.f29644i) - this.h.getSpacingAdd() : 0.0f);
                    }
                    int i10 = this.f29650o;
                    if (i10 < 0) {
                        spacingAdd += i10;
                    } else if (i10 > 0) {
                        f15 += i10;
                    }
                    float f20 = f15;
                    float f21 = spacingAdd;
                    if (this.f29648m) {
                        f(f18 - (AndroidUtilities.dp(5.0f) / 2.0f), f20, f19 + (AndroidUtilities.dp(5.0f) / 2.0f), f21, direction);
                    } else {
                        f(f18, f20, f19, f21, direction);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(Layout layout, int i10, float f10) {
        e(layout, i10, 0.0f, f10);
    }

    public final void e(Layout layout, int i10, float f10, float f11) {
        int lineCount;
        if (layout == null) {
            this.h = null;
            this.f29644i = 0;
            this.f29645j = -1.0f;
            this.f29646k = f10;
            this.f29647l = f11;
            return;
        }
        this.h = layout;
        this.f29644i = layout.getLineForOffset(i10);
        this.f29645j = -1.0f;
        this.f29646k = f10;
        this.f29647l = f11;
        if (Build.VERSION.SDK_INT < 28 || (lineCount = layout.getLineCount()) <= 0) {
            return;
        }
        int i11 = lineCount - 1;
        this.f29651p = layout.getLineBottom(i11) - layout.getLineTop(i11);
    }

    public final void f(float f10, float f11, float f12, float f13, Path.Direction direction) {
        float f14 = this.f29653r;
        float f15 = f10 - f14;
        float f16 = this.f29652q;
        float f17 = f11 - f16;
        float f18 = f12 + f14;
        float f19 = f13 + f16;
        this.f29654s = Math.min(this.f29654s, Math.min(f15, f18));
        this.f29656u = Math.min(this.f29656u, Math.min(f17, f19));
        this.f29655t = Math.max(this.f29655t, Math.max(f15, f18));
        this.v = Math.max(this.v, Math.max(f17, f19));
        super.addRect(f15, f17, f18, f19, direction);
    }

    @Override
    public final void reset() {
        if (this.f29649n) {
            super.reset();
        }
    }

    public j80(int i10) {
        this.f29645j = -1.0f;
        this.f29649n = true;
        this.f29654s = Float.MAX_VALUE;
        this.f29656u = Float.MAX_VALUE;
        this.f29648m = true;
        this.f29462c = false;
    }
}
