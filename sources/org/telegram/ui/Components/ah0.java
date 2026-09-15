package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ah0 {
    public int f22396a;
    public final wc f22397b;
    public final c6 e;
    public Drawable f22401i;
    public Drawable f22402j;
    public xi0 f22403k;
    public g01 f22404l;
    public g90 f22410r;
    public boolean f22411s;
    public boolean f22412t;
    public int f22413u;
    public long f22414w;
    public int f22415x;
    public final dh0 f22416y;
    public final RectF f22398c = new RectF();
    public final RectF d = new RectF();
    public final RectF f22399f = new RectF();
    public final RectF f22400g = new RectF();
    public final Rect h = new Rect();
    public float f22405m = 1.0f;
    public boolean f22406n = false;
    public boolean f22407o = false;
    public boolean f22408p = false;
    public final float f22409q = 1.0f;
    public int v = 0;

    public ah0(dh0 dh0Var) {
        this.f22416y = dh0Var;
        this.f22397b = new wc(dh0Var);
        this.e = new c6(dh0Var, 0L, 250L, qr.f27423f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f22400g;
            float f7 = rectF.left;
            RectF rectF2 = this.f22399f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f22406n = false;
        if (this.f22407o) {
            this.f22408p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f22407o;
        c6 c6Var = this.e;
        if (z10) {
            return 1.0f - c6Var.d(1.0f, false);
        }
        if (!this.f22406n) {
            return 1.0f;
        }
        return c6Var.d(1.0f, false);
    }

    public final void c(String str) {
        g01 g01Var = new g01(str, 11.0f, AndroidUtilities.bold());
        g01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        g01Var.a();
        this.f22404l = g01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        dh0 dh0Var = this.f22416y;
        if (i10 != 0) {
            xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            xi0Var.f29972v0 = dh0Var;
            xi0Var.start();
            this.f22403k = xi0Var;
        } else {
            this.f22403k = null;
        }
        if (i11 != 0) {
            drawable = dh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f22401i = drawable;
        if (i12 != 0) {
            drawable2 = dh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f22402j = drawable2;
        xi0 xi0Var2 = this.f22403k;
        Rect rect = this.h;
        if (xi0Var2 != null) {
            xi0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f22401i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f22402j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public ah0(dh0 dh0Var, bh0 bh0Var) {
        this.f22416y = dh0Var;
        this.f22397b = new wc(dh0Var);
        this.e = new c6(dh0Var, 0L, 250L, qr.f27423f);
        d(0, bh0Var.f22790b, bh0Var.f22791c);
        c(LocaleController.getString(bh0Var.f22789a));
    }
}
