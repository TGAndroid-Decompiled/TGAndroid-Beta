package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class df0 {
    public int f33064a;
    public final gc f33065b;
    public final u5 f33067e;
    public Drawable f33070i;
    public Drawable f33071j;
    public ch0 f33072k;
    public ly0 f33073l;
    public w70 f33079r;
    public boolean f33080s;
    public boolean f33081t;
    public int f33082u;
    public long f33083w;
    public int f33084x;
    public final gf0 f33085y;
    public final RectF f33066c = new RectF();
    public final RectF d = new RectF();
    public final RectF f33068f = new RectF();
    public final RectF f33069g = new RectF();
    public final Rect h = new Rect();
    public float f33074m = 1.0f;
    public boolean f33075n = false;
    public boolean f33076o = false;
    public boolean f33077p = false;
    public final float f33078q = 1.0f;
    public int v = 0;

    public df0(gf0 gf0Var) {
        this.f33085y = gf0Var;
        this.f33065b = new gc(gf0Var);
        this.f33067e = new u5(gf0Var, 0L, 250L, xq.f40452f);
    }

    public final void a() {
        float e10 = this.f33067e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f33069g;
            float f10 = rectF.left;
            RectF rectF2 = this.f33068f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f33075n = false;
        if (this.f33076o) {
            this.f33077p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f33076o;
        u5 u5Var = this.f33067e;
        if (z10) {
            return 1.0f - u5Var.e(false, 1.0f);
        }
        if (!this.f33075n) {
            return 1.0f;
        }
        return u5Var.e(false, 1.0f);
    }

    public final void c(String str) {
        ly0 ly0Var = new ly0(str, 11.0f, org.telegram.messenger.g0.o());
        ly0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ly0Var.a();
        this.f33073l = ly0Var;
    }

    public final void d(int i3, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        gf0 gf0Var = this.f33085y;
        if (i3 != 0) {
            ch0 ch0Var = new ch0(i3, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            ch0Var.R(gf0Var);
            ch0Var.start();
            this.f33072k = ch0Var;
        } else {
            this.f33072k = null;
        }
        if (i10 != 0) {
            drawable = gf0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f33070i = drawable;
        if (i11 != 0) {
            drawable2 = gf0Var.getResources().getDrawable(i11).mutate();
        }
        this.f33071j = drawable2;
        ch0 ch0Var2 = this.f33072k;
        Rect rect = this.h;
        if (ch0Var2 != null) {
            ch0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f33070i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f33071j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public df0(gf0 gf0Var, ef0 ef0Var) {
        this.f33085y = gf0Var;
        this.f33065b = new gc(gf0Var);
        this.f33067e = new u5(gf0Var, 0L, 250L, xq.f40452f);
        d(0, ef0Var.f33384b, ef0Var.f33385c);
        c(org.telegram.messenger.bd.M0(ef0Var.f33383a, null));
    }
}
