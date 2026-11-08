package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class bf0 {
    public int f32170a;
    public final ic f32171b;
    public final w5 f32173e;
    public Drawable f32176i;
    public Drawable f32177j;
    public zg0 f32178k;
    public my0 f32179l;
    public a80 f32185r;
    public boolean f32186s;
    public boolean f32187t;
    public int f32188u;
    public long f32189w;
    public int f32190x;
    public final ef0 f32191y;
    public final RectF f32172c = new RectF();
    public final RectF d = new RectF();
    public final RectF f32174f = new RectF();
    public final RectF f32175g = new RectF();
    public final Rect h = new Rect();
    public float f32180m = 1.0f;
    public boolean f32181n = false;
    public boolean f32182o = false;
    public boolean f32183p = false;
    public final float f32184q = 1.0f;
    public int v = 0;

    public bf0(ef0 ef0Var) {
        this.f32191y = ef0Var;
        this.f32171b = new ic(ef0Var);
        this.f32173e = new w5(ef0Var, 0L, 250L, xq.f40366f);
    }

    public final void a() {
        float e10 = this.f32173e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f32175g;
            float f10 = rectF.left;
            RectF rectF2 = this.f32174f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f32181n = false;
        if (this.f32182o) {
            this.f32183p = true;
        }
    }

    public final float b() {
        boolean z9 = this.f32182o;
        w5 w5Var = this.f32173e;
        if (z9) {
            return 1.0f - w5Var.e(false, 1.0f);
        }
        if (!this.f32181n) {
            return 1.0f;
        }
        return w5Var.e(false, 1.0f);
    }

    public final void c(String str) {
        my0 my0Var = new my0(str, 11.0f, org.telegram.messenger.g0.o());
        my0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        my0Var.a();
        this.f32179l = my0Var;
    }

    public final void d(int i7, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        ef0 ef0Var = this.f32191y;
        if (i7 != 0) {
            zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            zg0Var.R(ef0Var);
            zg0Var.start();
            this.f32178k = zg0Var;
        } else {
            this.f32178k = null;
        }
        if (i10 != 0) {
            drawable = ef0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f32176i = drawable;
        if (i11 != 0) {
            drawable2 = ef0Var.getResources().getDrawable(i11).mutate();
        }
        this.f32177j = drawable2;
        zg0 zg0Var2 = this.f32178k;
        Rect rect = this.h;
        if (zg0Var2 != null) {
            zg0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f32176i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f32177j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public bf0(ef0 ef0Var, cf0 cf0Var) {
        this.f32191y = ef0Var;
        this.f32171b = new ic(ef0Var);
        this.f32173e = new w5(ef0Var, 0L, 250L, xq.f40366f);
        d(0, cf0Var.f32576b, cf0Var.f32577c);
        c(org.telegram.messenger.id.M0(cf0Var.f32575a, null));
    }
}
