package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class bf0 {
    public int f32229a;
    public final hc f32230b;
    public final v5 f32232e;
    public Drawable f32235i;
    public Drawable f32236j;
    public zg0 f32237k;
    public my0 f32238l;
    public a80 f32244r;
    public boolean f32245s;
    public boolean f32246t;
    public int f32247u;
    public long f32248w;
    public int f32249x;
    public final ef0 f32250y;
    public final RectF f32231c = new RectF();
    public final RectF d = new RectF();
    public final RectF f32233f = new RectF();
    public final RectF f32234g = new RectF();
    public final Rect h = new Rect();
    public float f32239m = 1.0f;
    public boolean f32240n = false;
    public boolean f32241o = false;
    public boolean f32242p = false;
    public final float f32243q = 1.0f;
    public int v = 0;

    public bf0(ef0 ef0Var) {
        this.f32250y = ef0Var;
        this.f32230b = new hc(ef0Var);
        this.f32232e = new v5(ef0Var, 0L, 250L, wq.f40046f);
    }

    public final void a() {
        float e10 = this.f32232e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f32234g;
            float f10 = rectF.left;
            RectF rectF2 = this.f32233f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f32240n = false;
        if (this.f32241o) {
            this.f32242p = true;
        }
    }

    public final float b() {
        boolean z9 = this.f32241o;
        v5 v5Var = this.f32232e;
        if (z9) {
            return 1.0f - v5Var.e(false, 1.0f);
        }
        if (!this.f32240n) {
            return 1.0f;
        }
        return v5Var.e(false, 1.0f);
    }

    public final void c(String str) {
        my0 my0Var = new my0(str, 11.0f, org.telegram.messenger.g0.o());
        my0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        my0Var.a();
        this.f32238l = my0Var;
    }

    public final void d(int i7, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        ef0 ef0Var = this.f32250y;
        if (i7 != 0) {
            zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            zg0Var.R(ef0Var);
            zg0Var.start();
            this.f32237k = zg0Var;
        } else {
            this.f32237k = null;
        }
        if (i10 != 0) {
            drawable = ef0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f32235i = drawable;
        if (i11 != 0) {
            drawable2 = ef0Var.getResources().getDrawable(i11).mutate();
        }
        this.f32236j = drawable2;
        zg0 zg0Var2 = this.f32237k;
        Rect rect = this.h;
        if (zg0Var2 != null) {
            zg0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f32235i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f32236j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public bf0(ef0 ef0Var, cf0 cf0Var) {
        this.f32250y = ef0Var;
        this.f32230b = new hc(ef0Var);
        this.f32232e = new v5(ef0Var, 0L, 250L, wq.f40046f);
        d(0, cf0Var.f32556b, cf0Var.f32557c);
        c(org.telegram.messenger.id.M0(cf0Var.f32555a, null));
    }
}
