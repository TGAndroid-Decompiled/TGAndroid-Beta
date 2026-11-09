package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class cf0 {
    public int f32653a;
    public final ic f32654b;
    public final w5 f32656e;
    public Drawable f32659i;
    public Drawable f32660j;
    public ah0 f32661k;
    public ny0 f32662l;
    public b80 f32668r;
    public boolean f32669s;
    public boolean f32670t;
    public int f32671u;
    public long f32672w;
    public int f32673x;
    public final ff0 f32674y;
    public final RectF f32655c = new RectF();
    public final RectF d = new RectF();
    public final RectF f32657f = new RectF();
    public final RectF f32658g = new RectF();
    public final Rect h = new Rect();
    public float f32663m = 1.0f;
    public boolean f32664n = false;
    public boolean f32665o = false;
    public boolean f32666p = false;
    public final float f32667q = 1.0f;
    public int v = 0;

    public cf0(ff0 ff0Var) {
        this.f32674y = ff0Var;
        this.f32654b = new ic(ff0Var);
        this.f32656e = new w5(ff0Var, 0L, 250L, xq.f40458f);
    }

    public final void a() {
        float e10 = this.f32656e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f32658g;
            float f10 = rectF.left;
            RectF rectF2 = this.f32657f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f32664n = false;
        if (this.f32665o) {
            this.f32666p = true;
        }
    }

    public final float b() {
        boolean z9 = this.f32665o;
        w5 w5Var = this.f32656e;
        if (z9) {
            return 1.0f - w5Var.e(false, 1.0f);
        }
        if (!this.f32664n) {
            return 1.0f;
        }
        return w5Var.e(false, 1.0f);
    }

    public final void c(String str) {
        ny0 ny0Var = new ny0(str, 11.0f, org.telegram.messenger.g0.o());
        ny0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ny0Var.a();
        this.f32662l = ny0Var;
    }

    public final void d(int i7, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        ff0 ff0Var = this.f32674y;
        if (i7 != 0) {
            ah0 ah0Var = new ah0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            ah0Var.R(ff0Var);
            ah0Var.start();
            this.f32661k = ah0Var;
        } else {
            this.f32661k = null;
        }
        if (i10 != 0) {
            drawable = ff0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f32659i = drawable;
        if (i11 != 0) {
            drawable2 = ff0Var.getResources().getDrawable(i11).mutate();
        }
        this.f32660j = drawable2;
        ah0 ah0Var2 = this.f32661k;
        Rect rect = this.h;
        if (ah0Var2 != null) {
            ah0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f32659i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f32660j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public cf0(ff0 ff0Var, df0 df0Var) {
        this.f32674y = ff0Var;
        this.f32654b = new ic(ff0Var);
        this.f32656e = new w5(ff0Var, 0L, 250L, xq.f40458f);
        d(0, df0Var.f32952b, df0Var.f32953c);
        c(org.telegram.messenger.id.M0(df0Var.f32951a, null));
    }
}
