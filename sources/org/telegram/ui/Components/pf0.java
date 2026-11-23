package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class pf0 {
    public int f38461a;
    public final lc f38462b;
    public final c6 f38464e;
    public Drawable f38467i;
    public Drawable f38468j;
    public nh0 f38469k;
    public wy0 f38470l;
    public n80 f38476r;
    public boolean f38477s;
    public boolean f38478t;
    public int f38479u;
    public long f38480w;
    public int f38481x;
    public final sf0 f38482y;
    public final RectF f38463c = new RectF();
    public final RectF d = new RectF();
    public final RectF f38465f = new RectF();
    public final RectF f38466g = new RectF();
    public final Rect h = new Rect();
    public float f38471m = 1.0f;
    public boolean f38472n = false;
    public boolean f38473o = false;
    public boolean f38474p = false;
    public final float f38475q = 1.0f;
    public int v = 0;

    public pf0(sf0 sf0Var) {
        this.f38482y = sf0Var;
        this.f38462b = new lc(sf0Var);
        this.f38464e = new c6(sf0Var, 0L, 250L, kr.f36858f);
    }

    public final void a() {
        float e10 = this.f38464e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f38466g;
            float f10 = rectF.left;
            RectF rectF2 = this.f38465f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f38472n = false;
        if (this.f38473o) {
            this.f38474p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f38473o;
        c6 c6Var = this.f38464e;
        if (z10) {
            return 1.0f - c6Var.e(false, 1.0f);
        }
        if (!this.f38472n) {
            return 1.0f;
        }
        return c6Var.e(false, 1.0f);
    }

    public final void c(String str) {
        wy0 wy0Var = new wy0(str, 11.0f, org.telegram.messenger.g0.o());
        wy0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        wy0Var.a();
        this.f38470l = wy0Var;
    }

    public final void d(int i7, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        sf0 sf0Var = this.f38482y;
        if (i7 != 0) {
            nh0 nh0Var = new nh0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            nh0Var.R(sf0Var);
            nh0Var.start();
            this.f38469k = nh0Var;
        } else {
            this.f38469k = null;
        }
        if (i10 != 0) {
            drawable = sf0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f38467i = drawable;
        if (i11 != 0) {
            drawable2 = sf0Var.getResources().getDrawable(i11).mutate();
        }
        this.f38468j = drawable2;
        nh0 nh0Var2 = this.f38469k;
        Rect rect = this.h;
        if (nh0Var2 != null) {
            nh0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f38467i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f38468j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public pf0(sf0 sf0Var, qf0 qf0Var) {
        this.f38482y = sf0Var;
        this.f38462b = new lc(sf0Var);
        this.f38464e = new c6(sf0Var, 0L, 250L, kr.f36858f);
        d(0, qf0Var.f38833b, qf0Var.f38834c);
        c(org.telegram.messenger.gd.N0(qf0Var.f38832a, null));
    }
}
