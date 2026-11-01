package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class eg0 {
    public int f25812a;
    public final dc f25813b;
    public final t5 e;
    public Drawable f25817i;
    public Drawable f25818j;
    public ci0 f25819k;
    public rz0 f25820l;
    public t80 f25826r;
    public boolean f25827s;
    public boolean f25828t;
    public int f25829u;
    public long f25830w;
    public int f25831x;
    public final hg0 f25832y;
    public final RectF f25814c = new RectF();
    public final RectF d = new RectF();
    public final RectF f25815f = new RectF();
    public final RectF f25816g = new RectF();
    public final Rect h = new Rect();
    public float f25821m = 1.0f;
    public boolean f25822n = false;
    public boolean f25823o = false;
    public boolean f25824p = false;
    public final float f25825q = 1.0f;
    public int v = 0;

    public eg0(hg0 hg0Var) {
        this.f25832y = hg0Var;
        this.f25813b = new dc(hg0Var);
        this.e = new t5(hg0Var, 0L, 250L, gr.f26523f);
    }

    public final void a() {
        float e = this.e.e(false, 1.0f);
        if (e != 1.0f) {
            RectF rectF = this.f25816g;
            float f7 = rectF.left;
            RectF rectF2 = this.f25815f;
            float T1 = org.telegram.messenger.i0.T1(f7, rectF2.left, e);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.i0.T1(rectF.right, rectF2.right, e);
            return;
        }
        this.f25822n = false;
        if (this.f25823o) {
            this.f25824p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f25823o;
        t5 t5Var = this.e;
        if (z10) {
            return 1.0f - t5Var.e(false, 1.0f);
        }
        if (!this.f25822n) {
            return 1.0f;
        }
        return t5Var.e(false, 1.0f);
    }

    public final void c(String str) {
        rz0 rz0Var = new rz0(str, 11.0f, org.telegram.messenger.i0.o());
        rz0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        rz0Var.a();
        this.f25820l = rz0Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        hg0 hg0Var = this.f25832y;
        if (i10 != 0) {
            ci0 ci0Var = new ci0(i10, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f), false, null);
            ci0Var.R(hg0Var);
            ci0Var.start();
            this.f25819k = ci0Var;
        } else {
            this.f25819k = null;
        }
        if (i11 != 0) {
            drawable = hg0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f25817i = drawable;
        if (i12 != 0) {
            drawable2 = hg0Var.getResources().getDrawable(i12).mutate();
        }
        this.f25818j = drawable2;
        ci0 ci0Var2 = this.f25819k;
        Rect rect = this.h;
        if (ci0Var2 != null) {
            ci0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f25817i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f25818j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public eg0(hg0 hg0Var, fg0 fg0Var) {
        this.f25832y = hg0Var;
        this.f25813b = new dc(hg0Var);
        this.e = new t5(hg0Var, 0L, 250L, gr.f26523f);
        d(0, fg0Var.f26166b, fg0Var.f26167c);
        c(org.telegram.messenger.dd.L0(fg0Var.f26165a, null));
    }
}
