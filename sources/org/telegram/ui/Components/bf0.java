package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class bf0 {
    public int f32115a;
    public final ic f32116b;
    public final w5 f32118e;
    public Drawable f32121i;
    public Drawable f32122j;
    public zg0 f32123k;
    public ly0 f32124l;
    public a80 f32130r;
    public boolean f32131s;
    public boolean f32132t;
    public int f32133u;
    public long f32134w;
    public int f32135x;
    public final ef0 f32136y;
    public final RectF f32117c = new RectF();
    public final RectF d = new RectF();
    public final RectF f32119f = new RectF();
    public final RectF f32120g = new RectF();
    public final Rect h = new Rect();
    public float f32125m = 1.0f;
    public boolean f32126n = false;
    public boolean f32127o = false;
    public boolean f32128p = false;
    public final float f32129q = 1.0f;
    public int v = 0;

    public bf0(ef0 ef0Var) {
        this.f32136y = ef0Var;
        this.f32116b = new ic(ef0Var);
        this.f32118e = new w5(ef0Var, 0L, 250L, xq.f40329f);
    }

    public final void a() {
        float e10 = this.f32118e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f32120g;
            float f10 = rectF.left;
            RectF rectF2 = this.f32119f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f32126n = false;
        if (this.f32127o) {
            this.f32128p = true;
        }
    }

    public final float b() {
        boolean z9 = this.f32127o;
        w5 w5Var = this.f32118e;
        if (z9) {
            return 1.0f - w5Var.e(false, 1.0f);
        }
        if (!this.f32126n) {
            return 1.0f;
        }
        return w5Var.e(false, 1.0f);
    }

    public final void c(String str) {
        ly0 ly0Var = new ly0(str, 11.0f, org.telegram.messenger.g0.o());
        ly0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ly0Var.a();
        this.f32124l = ly0Var;
    }

    public final void d(int i7, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        ef0 ef0Var = this.f32136y;
        if (i7 != 0) {
            zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            zg0Var.R(ef0Var);
            zg0Var.start();
            this.f32123k = zg0Var;
        } else {
            this.f32123k = null;
        }
        if (i10 != 0) {
            drawable = ef0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f32121i = drawable;
        if (i11 != 0) {
            drawable2 = ef0Var.getResources().getDrawable(i11).mutate();
        }
        this.f32122j = drawable2;
        zg0 zg0Var2 = this.f32123k;
        Rect rect = this.h;
        if (zg0Var2 != null) {
            zg0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f32121i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f32122j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public bf0(ef0 ef0Var, cf0 cf0Var) {
        this.f32136y = ef0Var;
        this.f32116b = new ic(ef0Var);
        this.f32118e = new w5(ef0Var, 0L, 250L, xq.f40329f);
        d(0, cf0Var.f32558b, cf0Var.f32559c);
        c(org.telegram.messenger.hd.M0(cf0Var.f32557a, null));
    }
}
