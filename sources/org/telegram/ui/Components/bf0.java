package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class bf0 {
    public int f32149a;
    public final ic f32150b;
    public final w5 f32152e;
    public Drawable f32155i;
    public Drawable f32156j;
    public zg0 f32157k;
    public my0 f32158l;
    public a80 f32164r;
    public boolean f32165s;
    public boolean f32166t;
    public int f32167u;
    public long f32168w;
    public int f32169x;
    public final ef0 f32170y;
    public final RectF f32151c = new RectF();
    public final RectF d = new RectF();
    public final RectF f32153f = new RectF();
    public final RectF f32154g = new RectF();
    public final Rect h = new Rect();
    public float f32159m = 1.0f;
    public boolean f32160n = false;
    public boolean f32161o = false;
    public boolean f32162p = false;
    public final float f32163q = 1.0f;
    public int v = 0;

    public bf0(ef0 ef0Var) {
        this.f32170y = ef0Var;
        this.f32150b = new ic(ef0Var);
        this.f32152e = new w5(ef0Var, 0L, 250L, xq.f40345f);
    }

    public final void a() {
        float e10 = this.f32152e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f32154g;
            float f10 = rectF.left;
            RectF rectF2 = this.f32153f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f32160n = false;
        if (this.f32161o) {
            this.f32162p = true;
        }
    }

    public final float b() {
        boolean z9 = this.f32161o;
        w5 w5Var = this.f32152e;
        if (z9) {
            return 1.0f - w5Var.e(false, 1.0f);
        }
        if (!this.f32160n) {
            return 1.0f;
        }
        return w5Var.e(false, 1.0f);
    }

    public final void c(String str) {
        my0 my0Var = new my0(str, 11.0f, org.telegram.messenger.g0.o());
        my0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        my0Var.a();
        this.f32158l = my0Var;
    }

    public final void d(int i7, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        ef0 ef0Var = this.f32170y;
        if (i7 != 0) {
            zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            zg0Var.R(ef0Var);
            zg0Var.start();
            this.f32157k = zg0Var;
        } else {
            this.f32157k = null;
        }
        if (i10 != 0) {
            drawable = ef0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f32155i = drawable;
        if (i11 != 0) {
            drawable2 = ef0Var.getResources().getDrawable(i11).mutate();
        }
        this.f32156j = drawable2;
        zg0 zg0Var2 = this.f32157k;
        Rect rect = this.h;
        if (zg0Var2 != null) {
            zg0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f32155i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f32156j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public bf0(ef0 ef0Var, cf0 cf0Var) {
        this.f32170y = ef0Var;
        this.f32150b = new ic(ef0Var);
        this.f32152e = new w5(ef0Var, 0L, 250L, xq.f40345f);
        d(0, cf0Var.f32545b, cf0Var.f32546c);
        c(org.telegram.messenger.hd.M0(cf0Var.f32544a, null));
    }
}
