package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class qf0 {
    public int f38896a;
    public final mc f38897b;
    public final d6 f38899e;
    public Drawable f38902i;
    public Drawable f38903j;
    public oh0 f38904k;
    public xy0 f38905l;
    public q80 f38911r;
    public boolean f38912s;
    public boolean f38913t;
    public int f38914u;
    public long f38915w;
    public int f38916x;
    public final tf0 f38917y;
    public final RectF f38898c = new RectF();
    public final RectF d = new RectF();
    public final RectF f38900f = new RectF();
    public final RectF f38901g = new RectF();
    public final Rect h = new Rect();
    public float f38906m = 1.0f;
    public boolean f38907n = false;
    public boolean f38908o = false;
    public boolean f38909p = false;
    public final float f38910q = 1.0f;
    public int v = 0;

    public qf0(tf0 tf0Var) {
        this.f38917y = tf0Var;
        this.f38897b = new mc(tf0Var);
        this.f38899e = new d6(tf0Var, 0L, 250L, nr.f37960f);
    }

    public final void a() {
        float e10 = this.f38899e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f38901g;
            float f10 = rectF.left;
            RectF rectF2 = this.f38900f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f38907n = false;
        if (this.f38908o) {
            this.f38909p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f38908o;
        d6 d6Var = this.f38899e;
        if (z10) {
            return 1.0f - d6Var.e(false, 1.0f);
        }
        if (!this.f38907n) {
            return 1.0f;
        }
        return d6Var.e(false, 1.0f);
    }

    public final void c(String str) {
        xy0 xy0Var = new xy0(str, 11.0f, org.telegram.messenger.g0.o());
        xy0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        xy0Var.a();
        this.f38905l = xy0Var;
    }

    public final void d(int i7, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        tf0 tf0Var = this.f38917y;
        if (i7 != 0) {
            oh0 oh0Var = new oh0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            oh0Var.R(tf0Var);
            oh0Var.start();
            this.f38904k = oh0Var;
        } else {
            this.f38904k = null;
        }
        if (i10 != 0) {
            drawable = tf0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f38902i = drawable;
        if (i11 != 0) {
            drawable2 = tf0Var.getResources().getDrawable(i11).mutate();
        }
        this.f38903j = drawable2;
        oh0 oh0Var2 = this.f38904k;
        Rect rect = this.h;
        if (oh0Var2 != null) {
            oh0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f38902i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f38903j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public qf0(tf0 tf0Var, rf0 rf0Var) {
        this.f38917y = tf0Var;
        this.f38897b = new mc(tf0Var);
        this.f38899e = new d6(tf0Var, 0L, 250L, nr.f37960f);
        d(0, rf0Var.f39187b, rf0Var.f39188c);
        c(org.telegram.messenger.hd.N0(rf0Var.f39186a, null));
    }
}
