package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class mg0 {
    public int f30814a;
    public final pc f30815b;
    public final y5 f30817e;
    public Drawable f30820i;
    public Drawable f30821j;
    public mi0 f30822k;
    public nz0 f30823l;
    public p80 f30829r;
    public boolean f30830s;
    public boolean f30831t;
    public int f30832u;
    public long f30833w;
    public int f30834x;
    public final pg0 f30835y;
    public final RectF f30816c = new RectF();
    public final RectF d = new RectF();
    public final RectF f30818f = new RectF();
    public final RectF f30819g = new RectF();
    public final Rect h = new Rect();
    public float f30824m = 1.0f;
    public boolean f30825n = false;
    public boolean f30826o = false;
    public boolean f30827p = false;
    public final float f30828q = 1.0f;
    public int v = 0;

    public mg0(pg0 pg0Var) {
        this.f30835y = pg0Var;
        this.f30815b = new pc(pg0Var);
        this.f30817e = new y5(pg0Var, 0L, 250L, gr.f28844f);
    }

    public final void a() {
        float d = this.f30817e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f30819g;
            float f10 = rectF.left;
            RectF rectF2 = this.f30818f;
            float lerp = AndroidUtilities.lerp(f10, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f30825n = false;
        if (this.f30826o) {
            this.f30827p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f30826o;
        y5 y5Var = this.f30817e;
        if (z10) {
            return 1.0f - y5Var.d(1.0f, false);
        }
        if (!this.f30825n) {
            return 1.0f;
        }
        return y5Var.d(1.0f, false);
    }

    public final void c(String str) {
        nz0 nz0Var = new nz0(str, 11.0f, AndroidUtilities.bold());
        nz0Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        nz0Var.a();
        this.f30823l = nz0Var;
    }

    public final void d(int i9, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        pg0 pg0Var = this.f30835y;
        if (i9 != 0) {
            mi0 mi0Var = new mi0(i9, String.valueOf(i9), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            mi0Var.f30863r0 = pg0Var;
            mi0Var.start();
            this.f30822k = mi0Var;
        } else {
            this.f30822k = null;
        }
        if (i10 != 0) {
            drawable = pg0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f30820i = drawable;
        if (i11 != 0) {
            drawable2 = pg0Var.getResources().getDrawable(i11).mutate();
        }
        this.f30821j = drawable2;
        mi0 mi0Var2 = this.f30822k;
        Rect rect = this.h;
        if (mi0Var2 != null) {
            mi0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f30820i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f30821j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public mg0(pg0 pg0Var, ng0 ng0Var) {
        this.f30835y = pg0Var;
        this.f30815b = new pc(pg0Var);
        this.f30817e = new y5(pg0Var, 0L, 250L, gr.f28844f);
        d(0, ng0Var.f31111b, ng0Var.f31112c);
        c(LocaleController.getString(ng0Var.f31110a));
    }
}
