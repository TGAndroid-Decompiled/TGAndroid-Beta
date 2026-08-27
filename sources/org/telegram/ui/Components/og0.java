package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class og0 {

    public int f31280a;

    public final nc f31281b;

    public final y5 f31283e;

    public Drawable f31286i;

    public Drawable f31287j;

    public oi0 f31288k;

    public pz0 f31289l;

    public t80 f31295r;

    public boolean f31296s;

    public boolean f31297t;

    public int f31298u;

    public long f31299w;

    public int f31300x;

    public final rg0 f31301y;

    public final RectF f31282c = new RectF();
    public final RectF d = new RectF();

    public final RectF f31284f = new RectF();

    public final RectF f31285g = new RectF();
    public final Rect h = new Rect();

    public float f31290m = 1.0f;

    public boolean f31291n = false;

    public boolean f31292o = false;

    public boolean f31293p = false;

    public final float f31294q = 1.0f;
    public int v = 0;

    public og0(rg0 rg0Var) {
        this.f31301y = rg0Var;
        this.f31281b = new nc(rg0Var);
        this.f31283e = new y5(rg0Var, 0L, 250L, er.f28122f);
    }

    public final void a() {
        float fD = this.f31283e.d(1.0f, false);
        if (fD == 1.0f) {
            this.f31291n = false;
            if (this.f31292o) {
                this.f31293p = true;
                return;
            }
            return;
        }
        RectF rectF = this.f31285g;
        float f10 = rectF.left;
        RectF rectF2 = this.f31284f;
        float fLerp = AndroidUtilities.lerp(f10, rectF2.left, fD);
        RectF rectF3 = this.d;
        rectF3.left = fLerp;
        rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, fD);
    }

    public final float b() {
        boolean z10 = this.f31292o;
        y5 y5Var = this.f31283e;
        if (z10) {
            return 1.0f - y5Var.d(1.0f, false);
        }
        if (this.f31291n) {
            return y5Var.d(1.0f, false);
        }
        return 1.0f;
    }

    public final void c(String str) {
        pz0 pz0Var = new pz0(str, 11.0f, AndroidUtilities.bold());
        pz0Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        pz0Var.a();
        this.f31289l = pz0Var;
    }

    public final void d(int i10, int i11, int i12) {
        rg0 rg0Var = this.f31301y;
        if (i10 != 0) {
            oi0 oi0Var = new oi0(i10, String.valueOf(i10), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            oi0Var.f31328r0 = rg0Var;
            oi0Var.start();
            this.f31288k = oi0Var;
        } else {
            this.f31288k = null;
        }
        this.f31286i = i11 != 0 ? rg0Var.getResources().getDrawable(i11).mutate() : null;
        this.f31287j = i12 != 0 ? rg0Var.getResources().getDrawable(i12).mutate() : null;
        oi0 oi0Var2 = this.f31288k;
        Rect rect = this.h;
        if (oi0Var2 != null) {
            oi0Var2.setBounds(rect);
        }
        Drawable drawable = this.f31286i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f31287j;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public og0(rg0 rg0Var, pg0 pg0Var) {
        this.f31301y = rg0Var;
        this.f31281b = new nc(rg0Var);
        this.f31283e = new y5(rg0Var, 0L, 250L, er.f28122f);
        d(0, pg0Var.f31608b, pg0Var.f31609c);
        c(LocaleController.getString(pg0Var.f31607a));
    }
}
