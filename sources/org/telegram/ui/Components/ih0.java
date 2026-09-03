package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ih0 {
    public int f27819a;
    public final rc f27820b;
    public final z5 f27822e;
    public Drawable f27825i;
    public Drawable f27826j;
    public hj0 f27827k;
    public k01 f27828l;
    public k90 f27834r;
    public boolean f27835s;
    public boolean f27836t;
    public int f27837u;
    public long f27838w;
    public int f27839x;
    public final lh0 f27840y;
    public final RectF f27821c = new RectF();
    public final RectF d = new RectF();
    public final RectF f27823f = new RectF();
    public final RectF f27824g = new RectF();
    public final Rect h = new Rect();
    public float f27829m = 1.0f;
    public boolean f27830n = false;
    public boolean f27831o = false;
    public boolean f27832p = false;
    public final float f27833q = 1.0f;
    public int v = 0;

    public ih0(lh0 lh0Var) {
        this.f27840y = lh0Var;
        this.f27820b = new rc(lh0Var);
        this.f27822e = new z5(lh0Var, 0L, 250L, pr.f30168f);
    }

    public final void a() {
        float d = this.f27822e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f27824g;
            float f10 = rectF.left;
            RectF rectF2 = this.f27823f;
            float lerp = AndroidUtilities.lerp(f10, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f27830n = false;
        if (this.f27831o) {
            this.f27832p = true;
        }
    }

    public final float b() {
        boolean z4 = this.f27831o;
        z5 z5Var = this.f27822e;
        if (z4) {
            return 1.0f - z5Var.d(1.0f, false);
        }
        if (!this.f27830n) {
            return 1.0f;
        }
        return z5Var.d(1.0f, false);
    }

    public final void c(String str) {
        k01 k01Var = new k01(str, 11.0f, AndroidUtilities.bold());
        k01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        k01Var.a();
        this.f27828l = k01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        lh0 lh0Var = this.f27840y;
        if (i10 != 0) {
            hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            hj0Var.f27542s0 = lh0Var;
            hj0Var.start();
            this.f27827k = hj0Var;
        } else {
            this.f27827k = null;
        }
        if (i11 != 0) {
            drawable = lh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f27825i = drawable;
        if (i12 != 0) {
            drawable2 = lh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f27826j = drawable2;
        hj0 hj0Var2 = this.f27827k;
        Rect rect = this.h;
        if (hj0Var2 != null) {
            hj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f27825i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f27826j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public ih0(lh0 lh0Var, jh0 jh0Var) {
        this.f27840y = lh0Var;
        this.f27820b = new rc(lh0Var);
        this.f27822e = new z5(lh0Var, 0L, 250L, pr.f30168f);
        d(0, jh0Var.f28111b, jh0Var.f28112c);
        c(LocaleController.getString(jh0Var.f28110a));
    }
}
