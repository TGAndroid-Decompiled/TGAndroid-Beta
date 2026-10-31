package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
public final class eg0 {
    public int f25778a;
    public final dc f25779b;
    public final t5 e;
    public Drawable f25783i;
    public Drawable f25784j;
    public bi0 f25785k;
    public qz0 f25786l;
    public t80 f25792r;
    public boolean f25793s;
    public boolean f25794t;
    public int f25795u;
    public long f25796w;
    public int f25797x;
    public final hg0 f25798y;
    public final RectF f25780c = new RectF();
    public final RectF d = new RectF();
    public final RectF f25781f = new RectF();
    public final RectF f25782g = new RectF();
    public final Rect h = new Rect();
    public float f25787m = 1.0f;
    public boolean f25788n = false;
    public boolean f25789o = false;
    public boolean f25790p = false;
    public final float f25791q = 1.0f;
    public int v = 0;

    public eg0(hg0 hg0Var) {
        this.f25798y = hg0Var;
        this.f25779b = new dc(hg0Var);
        this.e = new t5(hg0Var, 0L, 250L, gr.f26495f);
    }

    public final void a() {
        float e = this.e.e(false, 1.0f);
        if (e != 1.0f) {
            RectF rectF = this.f25782g;
            float f7 = rectF.left;
            RectF rectF2 = this.f25781f;
            float T1 = org.telegram.messenger.i0.T1(f7, rectF2.left, e);
            RectF rectF3 = this.d;
            rectF3.left = T1;
            rectF3.right = org.telegram.messenger.i0.T1(rectF.right, rectF2.right, e);
            return;
        }
        this.f25788n = false;
        if (this.f25789o) {
            this.f25790p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f25789o;
        t5 t5Var = this.e;
        if (z10) {
            return 1.0f - t5Var.e(false, 1.0f);
        }
        if (!this.f25788n) {
            return 1.0f;
        }
        return t5Var.e(false, 1.0f);
    }

    public final void c(String str) {
        qz0 qz0Var = new qz0(str, 11.0f, org.telegram.messenger.i0.o());
        qz0Var.m(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        qz0Var.a();
        this.f25786l = qz0Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        hg0 hg0Var = this.f25798y;
        if (i10 != 0) {
            bi0 bi0Var = new bi0(i10, org.telegram.messenger.i0.L(56.0f), org.telegram.messenger.i0.L(56.0f), false, null);
            bi0Var.R(hg0Var);
            bi0Var.start();
            this.f25785k = bi0Var;
        } else {
            this.f25785k = null;
        }
        if (i11 != 0) {
            drawable = hg0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f25783i = drawable;
        if (i12 != 0) {
            drawable2 = hg0Var.getResources().getDrawable(i12).mutate();
        }
        this.f25784j = drawable2;
        bi0 bi0Var2 = this.f25785k;
        Rect rect = this.h;
        if (bi0Var2 != null) {
            bi0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f25783i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f25784j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public eg0(hg0 hg0Var, fg0 fg0Var) {
        this.f25798y = hg0Var;
        this.f25779b = new dc(hg0Var);
        this.e = new t5(hg0Var, 0L, 250L, gr.f26495f);
        d(0, fg0Var.f26067b, fg0Var.f26068c);
        c(org.telegram.messenger.cd.L0(fg0Var.f26066a, null));
    }
}
