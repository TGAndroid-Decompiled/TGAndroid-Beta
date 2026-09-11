package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ah0 {
    public int f24374a;
    public final zc f24375b;
    public final e6 f24377e;
    public Drawable f24380i;
    public Drawable f24381j;
    public xi0 f24382k;
    public f01 f24383l;
    public h90 f24389r;
    public boolean f24390s;
    public boolean f24391t;
    public int f24392u;
    public long f24393w;
    public int f24394x;
    public final dh0 f24395y;
    public final RectF f24376c = new RectF();
    public final RectF d = new RectF();
    public final RectF f24378f = new RectF();
    public final RectF f24379g = new RectF();
    public final Rect h = new Rect();
    public float f24384m = 1.0f;
    public boolean f24385n = false;
    public boolean f24386o = false;
    public boolean f24387p = false;
    public final float f24388q = 1.0f;
    public int v = 0;

    public ah0(dh0 dh0Var) {
        this.f24395y = dh0Var;
        this.f24375b = new zc(dh0Var);
        this.f24377e = new e6(dh0Var, 0L, 250L, pr.f29466f);
    }

    public final void a() {
        float d = this.f24377e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f24379g;
            float f7 = rectF.left;
            RectF rectF2 = this.f24378f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f24385n = false;
        if (this.f24386o) {
            this.f24387p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f24386o;
        e6 e6Var = this.f24377e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f24385n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        f01 f01Var = new f01(str, 11.0f, AndroidUtilities.bold());
        f01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f01Var.a();
        this.f24383l = f01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        dh0 dh0Var = this.f24395y;
        if (i10 != 0) {
            xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            xi0Var.f32578v0 = dh0Var;
            xi0Var.start();
            this.f24382k = xi0Var;
        } else {
            this.f24382k = null;
        }
        if (i11 != 0) {
            drawable = dh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f24380i = drawable;
        if (i12 != 0) {
            drawable2 = dh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f24381j = drawable2;
        xi0 xi0Var2 = this.f24382k;
        Rect rect = this.h;
        if (xi0Var2 != null) {
            xi0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f24380i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f24381j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public ah0(dh0 dh0Var, bh0 bh0Var) {
        this.f24395y = dh0Var;
        this.f24375b = new zc(dh0Var);
        this.f24377e = new e6(dh0Var, 0L, 250L, pr.f29466f);
        d(0, bh0Var.f24709b, bh0Var.f24710c);
        c(LocaleController.getString(bh0Var.f24708a));
    }
}
