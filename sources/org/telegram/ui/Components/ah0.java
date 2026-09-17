package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ah0 {
    public int f24375a;
    public final zc f24376b;
    public final e6 f24378e;
    public Drawable f24381i;
    public Drawable f24382j;
    public xi0 f24383k;
    public f01 f24384l;
    public h90 f24390r;
    public boolean f24391s;
    public boolean f24392t;
    public int f24393u;
    public long f24394w;
    public int f24395x;
    public final dh0 f24396y;
    public final RectF f24377c = new RectF();
    public final RectF d = new RectF();
    public final RectF f24379f = new RectF();
    public final RectF f24380g = new RectF();
    public final Rect h = new Rect();
    public float f24385m = 1.0f;
    public boolean f24386n = false;
    public boolean f24387o = false;
    public boolean f24388p = false;
    public final float f24389q = 1.0f;
    public int v = 0;

    public ah0(dh0 dh0Var) {
        this.f24396y = dh0Var;
        this.f24376b = new zc(dh0Var);
        this.f24378e = new e6(dh0Var, 0L, 250L, pr.f29467f);
    }

    public final void a() {
        float d = this.f24378e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f24380g;
            float f7 = rectF.left;
            RectF rectF2 = this.f24379f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f24386n = false;
        if (this.f24387o) {
            this.f24388p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f24387o;
        e6 e6Var = this.f24378e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f24386n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        f01 f01Var = new f01(str, 11.0f, AndroidUtilities.bold());
        f01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f01Var.a();
        this.f24384l = f01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        dh0 dh0Var = this.f24396y;
        if (i10 != 0) {
            xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            xi0Var.f32579v0 = dh0Var;
            xi0Var.start();
            this.f24383k = xi0Var;
        } else {
            this.f24383k = null;
        }
        if (i11 != 0) {
            drawable = dh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f24381i = drawable;
        if (i12 != 0) {
            drawable2 = dh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f24382j = drawable2;
        xi0 xi0Var2 = this.f24383k;
        Rect rect = this.h;
        if (xi0Var2 != null) {
            xi0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f24381i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f24382j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public ah0(dh0 dh0Var, bh0 bh0Var) {
        this.f24396y = dh0Var;
        this.f24376b = new zc(dh0Var);
        this.f24378e = new e6(dh0Var, 0L, 250L, pr.f29467f);
        d(0, bh0Var.f24710b, bh0Var.f24711c);
        c(LocaleController.getString(bh0Var.f24709a));
    }
}
