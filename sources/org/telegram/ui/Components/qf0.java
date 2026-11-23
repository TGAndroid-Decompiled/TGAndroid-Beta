package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class qf0 {
    public int f38897a;
    public final mc f38898b;
    public final d6 f38900e;
    public Drawable f38903i;
    public Drawable f38904j;
    public oh0 f38905k;
    public xy0 f38906l;
    public q80 f38912r;
    public boolean f38913s;
    public boolean f38914t;
    public int f38915u;
    public long f38916w;
    public int f38917x;
    public final tf0 f38918y;
    public final RectF f38899c = new RectF();
    public final RectF d = new RectF();
    public final RectF f38901f = new RectF();
    public final RectF f38902g = new RectF();
    public final Rect h = new Rect();
    public float f38907m = 1.0f;
    public boolean f38908n = false;
    public boolean f38909o = false;
    public boolean f38910p = false;
    public final float f38911q = 1.0f;
    public int v = 0;

    public qf0(tf0 tf0Var) {
        this.f38918y = tf0Var;
        this.f38898b = new mc(tf0Var);
        this.f38900e = new d6(tf0Var, 0L, 250L, nr.f37961f);
    }

    public final void a() {
        float e10 = this.f38900e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f38902g;
            float f10 = rectF.left;
            RectF rectF2 = this.f38901f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f38908n = false;
        if (this.f38909o) {
            this.f38910p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f38909o;
        d6 d6Var = this.f38900e;
        if (z10) {
            return 1.0f - d6Var.e(false, 1.0f);
        }
        if (!this.f38908n) {
            return 1.0f;
        }
        return d6Var.e(false, 1.0f);
    }

    public final void c(String str) {
        xy0 xy0Var = new xy0(str, 11.0f, org.telegram.messenger.g0.o());
        xy0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        xy0Var.a();
        this.f38906l = xy0Var;
    }

    public final void d(int i7, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        tf0 tf0Var = this.f38918y;
        if (i7 != 0) {
            oh0 oh0Var = new oh0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            oh0Var.R(tf0Var);
            oh0Var.start();
            this.f38905k = oh0Var;
        } else {
            this.f38905k = null;
        }
        if (i10 != 0) {
            drawable = tf0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f38903i = drawable;
        if (i11 != 0) {
            drawable2 = tf0Var.getResources().getDrawable(i11).mutate();
        }
        this.f38904j = drawable2;
        oh0 oh0Var2 = this.f38905k;
        Rect rect = this.h;
        if (oh0Var2 != null) {
            oh0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f38903i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f38904j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public qf0(tf0 tf0Var, rf0 rf0Var) {
        this.f38918y = tf0Var;
        this.f38898b = new mc(tf0Var);
        this.f38900e = new d6(tf0Var, 0L, 250L, nr.f37961f);
        d(0, rf0Var.f39188b, rf0Var.f39189c);
        c(org.telegram.messenger.hd.N0(rf0Var.f39187a, null));
    }
}
