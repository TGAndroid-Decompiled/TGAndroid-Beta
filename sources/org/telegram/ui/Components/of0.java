package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class of0 {
    public int f38077a;
    public final mc f38078b;
    public final c6 f38080e;
    public Drawable f38083i;
    public Drawable f38084j;
    public mh0 f38085k;
    public vy0 f38086l;
    public o80 f38092r;
    public boolean f38093s;
    public boolean f38094t;
    public int f38095u;
    public long f38096w;
    public int f38097x;
    public final rf0 f38098y;
    public final RectF f38079c = new RectF();
    public final RectF d = new RectF();
    public final RectF f38081f = new RectF();
    public final RectF f38082g = new RectF();
    public final Rect h = new Rect();
    public float f38087m = 1.0f;
    public boolean f38088n = false;
    public boolean f38089o = false;
    public boolean f38090p = false;
    public final float f38091q = 1.0f;
    public int v = 0;

    public of0(rf0 rf0Var) {
        this.f38098y = rf0Var;
        this.f38078b = new mc(rf0Var);
        this.f38080e = new c6(rf0Var, 0L, 250L, lr.f37208f);
    }

    public final void a() {
        float e10 = this.f38080e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f38082g;
            float f10 = rectF.left;
            RectF rectF2 = this.f38081f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f38088n = false;
        if (this.f38089o) {
            this.f38090p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f38089o;
        c6 c6Var = this.f38080e;
        if (z10) {
            return 1.0f - c6Var.e(false, 1.0f);
        }
        if (!this.f38088n) {
            return 1.0f;
        }
        return c6Var.e(false, 1.0f);
    }

    public final void c(String str) {
        vy0 vy0Var = new vy0(str, 11.0f, org.telegram.messenger.g0.o());
        vy0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        vy0Var.a();
        this.f38086l = vy0Var;
    }

    public final void d(int i7, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        rf0 rf0Var = this.f38098y;
        if (i7 != 0) {
            mh0 mh0Var = new mh0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            mh0Var.R(rf0Var);
            mh0Var.start();
            this.f38085k = mh0Var;
        } else {
            this.f38085k = null;
        }
        if (i10 != 0) {
            drawable = rf0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f38083i = drawable;
        if (i11 != 0) {
            drawable2 = rf0Var.getResources().getDrawable(i11).mutate();
        }
        this.f38084j = drawable2;
        mh0 mh0Var2 = this.f38085k;
        Rect rect = this.h;
        if (mh0Var2 != null) {
            mh0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f38083i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f38084j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public of0(rf0 rf0Var, pf0 pf0Var) {
        this.f38098y = rf0Var;
        this.f38078b = new mc(rf0Var);
        this.f38080e = new c6(rf0Var, 0L, 250L, lr.f37208f);
        d(0, pf0Var.f38394b, pf0Var.f38395c);
        c(org.telegram.messenger.gd.M0(pf0Var.f38393a, null));
    }
}
