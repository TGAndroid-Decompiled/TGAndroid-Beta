package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class wg0 {
    public int f34399a;
    public final uc f34400b;
    public final d6 f34402e;
    public Drawable f34405i;
    public Drawable f34406j;
    public xi0 f34407k;
    public zz0 f34408l;
    public c90 f34414r;
    public boolean f34415s;
    public boolean f34416t;
    public int f34417u;
    public long f34418w;
    public int f34419x;
    public final zg0 f34420y;
    public final RectF f34401c = new RectF();
    public final RectF d = new RectF();
    public final RectF f34403f = new RectF();
    public final RectF f34404g = new RectF();
    public final Rect h = new Rect();
    public float f34409m = 1.0f;
    public boolean f34410n = false;
    public boolean f34411o = false;
    public boolean f34412p = false;
    public final float f34413q = 1.0f;
    public int v = 0;

    public wg0(zg0 zg0Var) {
        this.f34420y = zg0Var;
        this.f34400b = new uc(zg0Var);
        this.f34402e = new d6(zg0Var, 0L, 250L, jr.f29800f);
    }

    public final void a() {
        float d = this.f34402e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f34404g;
            float f9 = rectF.left;
            RectF rectF2 = this.f34403f;
            float lerp = AndroidUtilities.lerp(f9, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f34410n = false;
        if (this.f34411o) {
            this.f34412p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f34411o;
        d6 d6Var = this.f34402e;
        if (z10) {
            return 1.0f - d6Var.d(1.0f, false);
        }
        if (!this.f34410n) {
            return 1.0f;
        }
        return d6Var.d(1.0f, false);
    }

    public final void c(String str) {
        zz0 zz0Var = new zz0(str, 11.0f, AndroidUtilities.bold());
        zz0Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        zz0Var.a();
        this.f34408l = zz0Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        zg0 zg0Var = this.f34420y;
        if (i10 != 0) {
            xi0 xi0Var = new xi0(i10, String.valueOf(i10), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            xi0Var.f34753r0 = zg0Var;
            xi0Var.start();
            this.f34407k = xi0Var;
        } else {
            this.f34407k = null;
        }
        if (i11 != 0) {
            drawable = zg0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f34405i = drawable;
        if (i12 != 0) {
            drawable2 = zg0Var.getResources().getDrawable(i12).mutate();
        }
        this.f34406j = drawable2;
        xi0 xi0Var2 = this.f34407k;
        Rect rect = this.h;
        if (xi0Var2 != null) {
            xi0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f34405i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f34406j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public wg0(zg0 zg0Var, xg0 xg0Var) {
        this.f34420y = zg0Var;
        this.f34400b = new uc(zg0Var);
        this.f34402e = new d6(zg0Var, 0L, 250L, jr.f29800f);
        d(0, xg0Var.f34720b, xg0Var.f34721c);
        c(LocaleController.getString(xg0Var.f34719a));
    }
}
