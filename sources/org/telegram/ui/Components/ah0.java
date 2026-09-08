package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ah0 {
    public int f24401a;
    public final zc f24402b;
    public final e6 f24404e;
    public Drawable f24407i;
    public Drawable f24408j;
    public xi0 f24409k;
    public f01 f24410l;
    public h90 f24416r;
    public boolean f24417s;
    public boolean f24418t;
    public int f24419u;
    public long f24420w;
    public int f24421x;
    public final dh0 f24422y;
    public final RectF f24403c = new RectF();
    public final RectF d = new RectF();
    public final RectF f24405f = new RectF();
    public final RectF f24406g = new RectF();
    public final Rect h = new Rect();
    public float f24411m = 1.0f;
    public boolean f24412n = false;
    public boolean f24413o = false;
    public boolean f24414p = false;
    public final float f24415q = 1.0f;
    public int v = 0;

    public ah0(dh0 dh0Var) {
        this.f24422y = dh0Var;
        this.f24402b = new zc(dh0Var);
        this.f24404e = new e6(dh0Var, 0L, 250L, pr.f29493f);
    }

    public final void a() {
        float d = this.f24404e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f24406g;
            float f7 = rectF.left;
            RectF rectF2 = this.f24405f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f24412n = false;
        if (this.f24413o) {
            this.f24414p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f24413o;
        e6 e6Var = this.f24404e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f24412n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        f01 f01Var = new f01(str, 11.0f, AndroidUtilities.bold());
        f01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f01Var.a();
        this.f24410l = f01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        dh0 dh0Var = this.f24422y;
        if (i10 != 0) {
            xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            xi0Var.f32605v0 = dh0Var;
            xi0Var.start();
            this.f24409k = xi0Var;
        } else {
            this.f24409k = null;
        }
        if (i11 != 0) {
            drawable = dh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f24407i = drawable;
        if (i12 != 0) {
            drawable2 = dh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f24408j = drawable2;
        xi0 xi0Var2 = this.f24409k;
        Rect rect = this.h;
        if (xi0Var2 != null) {
            xi0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f24407i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f24408j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public ah0(dh0 dh0Var, bh0 bh0Var) {
        this.f24422y = dh0Var;
        this.f24402b = new zc(dh0Var);
        this.f24404e = new e6(dh0Var, 0L, 250L, pr.f29493f);
        d(0, bh0Var.f24736b, bh0Var.f24737c);
        c(LocaleController.getString(bh0Var.f24735a));
    }
}
