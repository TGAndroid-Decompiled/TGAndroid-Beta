package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class kh0 {
    public int f24715a;
    public final xc f24716b;
    public final d6 e;
    public Drawable f24720i;
    public Drawable f24721j;
    public hj0 f24722k;
    public t01 f24723l;
    public q90 f24729r;
    public boolean f24730s;
    public boolean f24731t;
    public int f24732u;
    public long f24733w;
    public int f24734x;
    public final nh0 f24735y;
    public final RectF f24717c = new RectF();
    public final RectF d = new RectF();
    public final RectF f24718f = new RectF();
    public final RectF f24719g = new RectF();
    public final Rect h = new Rect();
    public float f24724m = 1.0f;
    public boolean f24725n = false;
    public boolean f24726o = false;
    public boolean f24727p = false;
    public final float f24728q = 1.0f;
    public int v = 0;

    public kh0(nh0 nh0Var) {
        this.f24735y = nh0Var;
        this.f24716b = new xc(nh0Var);
        this.e = new d6(nh0Var, 0L, 250L, wr.f28819f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f24719g;
            float f7 = rectF.left;
            RectF rectF2 = this.f24718f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f24725n = false;
        if (this.f24726o) {
            this.f24727p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f24726o;
        d6 d6Var = this.e;
        if (z10) {
            return 1.0f - d6Var.d(1.0f, false);
        }
        if (!this.f24725n) {
            return 1.0f;
        }
        return d6Var.d(1.0f, false);
    }

    public final void c(String str) {
        t01 t01Var = new t01(str, 11.0f, AndroidUtilities.bold());
        t01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        t01Var.a();
        this.f24723l = t01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        nh0 nh0Var = this.f24735y;
        if (i10 != 0) {
            hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            hj0Var.f23672v0 = nh0Var;
            hj0Var.start();
            this.f24722k = hj0Var;
        } else {
            this.f24722k = null;
        }
        if (i11 != 0) {
            drawable = nh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f24720i = drawable;
        if (i12 != 0) {
            drawable2 = nh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f24721j = drawable2;
        hj0 hj0Var2 = this.f24722k;
        Rect rect = this.h;
        if (hj0Var2 != null) {
            hj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f24720i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f24721j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public kh0(nh0 nh0Var, lh0 lh0Var) {
        this.f24735y = nh0Var;
        this.f24716b = new xc(nh0Var);
        this.e = new d6(nh0Var, 0L, 250L, wr.f28819f);
        d(0, lh0Var.f24992b, lh0Var.f24993c);
        c(LocaleController.getString(lh0Var.f24991a));
    }
}
