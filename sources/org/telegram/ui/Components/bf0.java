package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class bf0 {
    public int f32121a;
    public final ic f32122b;
    public final w5 f32124e;
    public Drawable f32127i;
    public Drawable f32128j;
    public zg0 f32129k;
    public ly0 f32130l;
    public a80 f32136r;
    public boolean f32137s;
    public boolean f32138t;
    public int f32139u;
    public long f32140w;
    public int f32141x;
    public final ef0 f32142y;
    public final RectF f32123c = new RectF();
    public final RectF d = new RectF();
    public final RectF f32125f = new RectF();
    public final RectF f32126g = new RectF();
    public final Rect h = new Rect();
    public float f32131m = 1.0f;
    public boolean f32132n = false;
    public boolean f32133o = false;
    public boolean f32134p = false;
    public final float f32135q = 1.0f;
    public int v = 0;

    public bf0(ef0 ef0Var) {
        this.f32142y = ef0Var;
        this.f32122b = new ic(ef0Var);
        this.f32124e = new w5(ef0Var, 0L, 250L, xq.f40310f);
    }

    public final void a() {
        float e10 = this.f32124e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f32126g;
            float f10 = rectF.left;
            RectF rectF2 = this.f32125f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f32132n = false;
        if (this.f32133o) {
            this.f32134p = true;
        }
    }

    public final float b() {
        boolean z9 = this.f32133o;
        w5 w5Var = this.f32124e;
        if (z9) {
            return 1.0f - w5Var.e(false, 1.0f);
        }
        if (!this.f32132n) {
            return 1.0f;
        }
        return w5Var.e(false, 1.0f);
    }

    public final void c(String str) {
        ly0 ly0Var = new ly0(str, 11.0f, org.telegram.messenger.g0.o());
        ly0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ly0Var.a();
        this.f32130l = ly0Var;
    }

    public final void d(int i7, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        ef0 ef0Var = this.f32142y;
        if (i7 != 0) {
            zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            zg0Var.R(ef0Var);
            zg0Var.start();
            this.f32129k = zg0Var;
        } else {
            this.f32129k = null;
        }
        if (i10 != 0) {
            drawable = ef0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f32127i = drawable;
        if (i11 != 0) {
            drawable2 = ef0Var.getResources().getDrawable(i11).mutate();
        }
        this.f32128j = drawable2;
        zg0 zg0Var2 = this.f32129k;
        Rect rect = this.h;
        if (zg0Var2 != null) {
            zg0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f32127i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f32128j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public bf0(ef0 ef0Var, cf0 cf0Var) {
        this.f32142y = ef0Var;
        this.f32122b = new ic(ef0Var);
        this.f32124e = new w5(ef0Var, 0L, 250L, xq.f40310f);
        d(0, cf0Var.f32554b, cf0Var.f32555c);
        c(org.telegram.messenger.hd.M0(cf0Var.f32553a, null));
    }
}
