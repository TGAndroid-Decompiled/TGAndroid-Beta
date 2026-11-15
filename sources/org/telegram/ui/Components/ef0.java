package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class ef0 {
    public int f34286a;
    public final dc f34287b;
    public final u5 f34289e;
    public Drawable f34292i;
    public Drawable f34293j;
    public ch0 f34294k;
    public oy0 f34295l;
    public d80 f34301r;
    public boolean f34302s;
    public boolean f34303t;
    public int f34304u;
    public long f34305w;
    public int f34306x;
    public final hf0 f34307y;
    public final RectF f34288c = new RectF();
    public final RectF d = new RectF();
    public final RectF f34290f = new RectF();
    public final RectF f34291g = new RectF();
    public final Rect h = new Rect();
    public float f34296m = 1.0f;
    public boolean f34297n = false;
    public boolean f34298o = false;
    public boolean f34299p = false;
    public final float f34300q = 1.0f;
    public int v = 0;

    public ef0(hf0 hf0Var) {
        this.f34307y = hf0Var;
        this.f34287b = new dc(hf0Var);
        this.f34289e = new u5(hf0Var, 0L, 250L, er.f34420f);
    }

    public final void a() {
        float e10 = this.f34289e.e(false, 1.0f);
        if (e10 != 1.0f) {
            RectF rectF = this.f34291g;
            float f10 = rectF.left;
            RectF rectF2 = this.f34290f;
            float T1 = org.telegram.messenger.g0.T1(f10, rectF2.left, e10);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, e10);
            return;
        }
        this.f34297n = false;
        if (this.f34298o) {
            this.f34299p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f34298o;
        u5 u5Var = this.f34289e;
        if (z10) {
            return 1.0f - u5Var.e(false, 1.0f);
        }
        if (!this.f34297n) {
            return 1.0f;
        }
        return u5Var.e(false, 1.0f);
    }

    public final void c(String str) {
        oy0 oy0Var = new oy0(str, 11.0f, org.telegram.messenger.g0.o());
        oy0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        oy0Var.a();
        this.f34295l = oy0Var;
    }

    public final void d(int i7, int i10, int i11) {
        Drawable drawable;
        Drawable drawable2 = null;
        hf0 hf0Var = this.f34307y;
        if (i7 != 0) {
            ch0 ch0Var = new ch0(i7, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.g0.L(56.0f), false, null);
            ch0Var.R(hf0Var);
            ch0Var.start();
            this.f34294k = ch0Var;
        } else {
            this.f34294k = null;
        }
        if (i10 != 0) {
            drawable = hf0Var.getResources().getDrawable(i10).mutate();
        } else {
            drawable = null;
        }
        this.f34292i = drawable;
        if (i11 != 0) {
            drawable2 = hf0Var.getResources().getDrawable(i11).mutate();
        }
        this.f34293j = drawable2;
        ch0 ch0Var2 = this.f34294k;
        Rect rect = this.h;
        if (ch0Var2 != null) {
            ch0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f34292i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f34293j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public ef0(hf0 hf0Var, ff0 ff0Var) {
        this.f34307y = hf0Var;
        this.f34287b = new dc(hf0Var);
        this.f34289e = new u5(hf0Var, 0L, 250L, er.f34420f);
        d(0, ff0Var.f34596b, ff0Var.f34597c);
        c(org.telegram.messenger.hd.M0(ff0Var.f34595a, null));
    }
}
