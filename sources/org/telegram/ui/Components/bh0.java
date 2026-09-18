package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class bh0 {
    public int f22731a;
    public final wc f22732b;
    public final c6 e;
    public Drawable f22736i;
    public Drawable f22737j;
    public yi0 f22738k;
    public h01 f22739l;
    public g90 f22745r;
    public boolean f22746s;
    public boolean f22747t;
    public int f22748u;
    public long f22749w;
    public int f22750x;
    public final eh0 f22751y;
    public final RectF f22733c = new RectF();
    public final RectF d = new RectF();
    public final RectF f22734f = new RectF();
    public final RectF f22735g = new RectF();
    public final Rect h = new Rect();
    public float f22740m = 1.0f;
    public boolean f22741n = false;
    public boolean f22742o = false;
    public boolean f22743p = false;
    public final float f22744q = 1.0f;
    public int v = 0;

    public bh0(eh0 eh0Var) {
        this.f22751y = eh0Var;
        this.f22732b = new wc(eh0Var);
        this.e = new c6(eh0Var, 0L, 250L, qr.f27383f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f22735g;
            float f7 = rectF.left;
            RectF rectF2 = this.f22734f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f22741n = false;
        if (this.f22742o) {
            this.f22743p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f22742o;
        c6 c6Var = this.e;
        if (z10) {
            return 1.0f - c6Var.d(1.0f, false);
        }
        if (!this.f22741n) {
            return 1.0f;
        }
        return c6Var.d(1.0f, false);
    }

    public final void c(String str) {
        h01 h01Var = new h01(str, 11.0f, AndroidUtilities.bold());
        h01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        h01Var.a();
        this.f22739l = h01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        eh0 eh0Var = this.f22751y;
        if (i10 != 0) {
            yi0 yi0Var = new yi0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            yi0Var.R(eh0Var);
            yi0Var.start();
            this.f22738k = yi0Var;
        } else {
            this.f22738k = null;
        }
        if (i11 != 0) {
            drawable = eh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f22736i = drawable;
        if (i12 != 0) {
            drawable2 = eh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f22737j = drawable2;
        yi0 yi0Var2 = this.f22738k;
        Rect rect = this.h;
        if (yi0Var2 != null) {
            yi0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f22736i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f22737j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public bh0(eh0 eh0Var, ch0 ch0Var) {
        this.f22751y = eh0Var;
        this.f22732b = new wc(eh0Var);
        this.e = new c6(eh0Var, 0L, 250L, qr.f27383f);
        d(0, ch0Var.f23048b, ch0Var.f23049c);
        c(LocaleController.getString(ch0Var.f23047a));
    }
}
