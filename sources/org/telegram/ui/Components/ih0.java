package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ih0 {
    public int f27786a;
    public final rc f27787b;
    public final z5 f27789e;
    public Drawable f27792i;
    public Drawable f27793j;
    public ij0 f27794k;
    public l01 f27795l;
    public k90 f27801r;
    public boolean f27802s;
    public boolean f27803t;
    public int f27804u;
    public long f27805w;
    public int f27806x;
    public final lh0 f27807y;
    public final RectF f27788c = new RectF();
    public final RectF d = new RectF();
    public final RectF f27790f = new RectF();
    public final RectF f27791g = new RectF();
    public final Rect h = new Rect();
    public float f27796m = 1.0f;
    public boolean f27797n = false;
    public boolean f27798o = false;
    public boolean f27799p = false;
    public final float f27800q = 1.0f;
    public int v = 0;

    public ih0(lh0 lh0Var) {
        this.f27807y = lh0Var;
        this.f27787b = new rc(lh0Var);
        this.f27789e = new z5(lh0Var, 0L, 250L, pr.f30183f);
    }

    public final void a() {
        float d = this.f27789e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f27791g;
            float f10 = rectF.left;
            RectF rectF2 = this.f27790f;
            float lerp = AndroidUtilities.lerp(f10, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f27797n = false;
        if (this.f27798o) {
            this.f27799p = true;
        }
    }

    public final float b() {
        boolean z4 = this.f27798o;
        z5 z5Var = this.f27789e;
        if (z4) {
            return 1.0f - z5Var.d(1.0f, false);
        }
        if (!this.f27797n) {
            return 1.0f;
        }
        return z5Var.d(1.0f, false);
    }

    public final void c(String str) {
        l01 l01Var = new l01(str, 11.0f, AndroidUtilities.bold());
        l01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        l01Var.a();
        this.f27795l = l01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        lh0 lh0Var = this.f27807y;
        if (i10 != 0) {
            ij0 ij0Var = new ij0(i10, String.valueOf(i10), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            ij0Var.f27835s0 = lh0Var;
            ij0Var.start();
            this.f27794k = ij0Var;
        } else {
            this.f27794k = null;
        }
        if (i11 != 0) {
            drawable = lh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f27792i = drawable;
        if (i12 != 0) {
            drawable2 = lh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f27793j = drawable2;
        ij0 ij0Var2 = this.f27794k;
        Rect rect = this.h;
        if (ij0Var2 != null) {
            ij0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f27792i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f27793j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public ih0(lh0 lh0Var, jh0 jh0Var) {
        this.f27807y = lh0Var;
        this.f27787b = new rc(lh0Var);
        this.f27789e = new z5(lh0Var, 0L, 250L, pr.f30183f);
        d(0, jh0Var.f28124b, jh0Var.f28125c);
        c(LocaleController.getString(jh0Var.f28123a));
    }
}
