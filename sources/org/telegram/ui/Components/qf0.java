package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class qf0 {
    public int f38849a;
    public final mc f38850b;
    public final d6 f38852e;
    public Drawable f38855i;
    public Drawable f38856j;
    public oh0 f38857k;
    public xy0 f38858l;
    public q80 f38864r;
    public boolean f38865s;
    public boolean f38866t;
    public int f38867u;
    public long f38868w;
    public int f38869x;
    public final tf0 f38870y;
    public final RectF f38851c = new RectF();
    public final RectF d = new RectF();
    public final RectF f38853f = new RectF();
    public final RectF f38854g = new RectF();
    public final Rect h = new Rect();
    public float f38859m = 1.0f;
    public boolean f38860n = false;
    public boolean f38861o = false;
    public boolean f38862p = false;
    public final float f38863q = 1.0f;
    public int v = 0;

    public qf0(tf0 tf0Var) {
        this.f38870y = tf0Var;
        this.f38850b = new mc(tf0Var);
        this.f38852e = new d6(tf0Var, 0L, 250L, nr.f37917f);
    }

    public final void a() {
        float e10 = this.f38852e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f38854g;
            float f10 = rectF.left;
            RectF rectF2 = this.f38853f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f38860n = false;
        if (this.f38861o) {
            this.f38862p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f38861o;
        d6 d6Var = this.f38852e;
        if (z10) {
            return 1.0f - d6Var.e(false, 1.0f);
        }
        if (!this.f38860n) {
            return 1.0f;
        }
        return d6Var.e(false, 1.0f);
    }

    public final void c(String str) {
        xy0 xy0Var = new xy0(str, 11.0f, org.telegram.messenger.g0.o());
        xy0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        xy0Var.a();
        this.f38858l = xy0Var;
    }

    public final void d(int i7, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        tf0 tf0Var = this.f38870y;
        if (i7 != 0) {
            oh0 oh0Var = new oh0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            oh0Var.R(tf0Var);
            oh0Var.start();
            this.f38857k = oh0Var;
        } else {
            this.f38857k = null;
        }
        if (i10 != 0) {
            drawable = tf0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f38855i = drawable;
        if (i11 != 0) {
            drawable2 = tf0Var.getResources().getDrawable(i11).mutate();
        }
        this.f38856j = drawable2;
        oh0 oh0Var2 = this.f38857k;
        Rect rect = this.h;
        if (oh0Var2 != null) {
            oh0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f38855i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f38856j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public qf0(tf0 tf0Var, rf0 rf0Var) {
        this.f38870y = tf0Var;
        this.f38850b = new mc(tf0Var);
        this.f38852e = new d6(tf0Var, 0L, 250L, nr.f37917f);
        d(0, rf0Var.f39142b, rf0Var.f39143c);
        c(org.telegram.messenger.hd.N0(rf0Var.f39141a, null));
    }
}
