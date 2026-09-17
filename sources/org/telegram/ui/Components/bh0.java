package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class bh0 {
    public int f22728a;
    public final wc f22729b;
    public final c6 e;
    public Drawable f22733i;
    public Drawable f22734j;
    public yi0 f22735k;
    public h01 f22736l;
    public g90 f22742r;
    public boolean f22743s;
    public boolean f22744t;
    public int f22745u;
    public long f22746w;
    public int f22747x;
    public final eh0 f22748y;
    public final RectF f22730c = new RectF();
    public final RectF d = new RectF();
    public final RectF f22731f = new RectF();
    public final RectF f22732g = new RectF();
    public final Rect h = new Rect();
    public float f22737m = 1.0f;
    public boolean f22738n = false;
    public boolean f22739o = false;
    public boolean f22740p = false;
    public final float f22741q = 1.0f;
    public int v = 0;

    public bh0(eh0 eh0Var) {
        this.f22748y = eh0Var;
        this.f22729b = new wc(eh0Var);
        this.e = new c6(eh0Var, 0L, 250L, qr.f27380f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f22732g;
            float f7 = rectF.left;
            RectF rectF2 = this.f22731f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f22738n = false;
        if (this.f22739o) {
            this.f22740p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f22739o;
        c6 c6Var = this.e;
        if (z10) {
            return 1.0f - c6Var.d(1.0f, false);
        }
        if (!this.f22738n) {
            return 1.0f;
        }
        return c6Var.d(1.0f, false);
    }

    public final void c(String str) {
        h01 h01Var = new h01(str, 11.0f, AndroidUtilities.bold());
        h01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        h01Var.a();
        this.f22736l = h01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        eh0 eh0Var = this.f22748y;
        if (i10 != 0) {
            yi0 yi0Var = new yi0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            yi0Var.f30245v0 = eh0Var;
            yi0Var.start();
            this.f22735k = yi0Var;
        } else {
            this.f22735k = null;
        }
        if (i11 != 0) {
            drawable = eh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f22733i = drawable;
        if (i12 != 0) {
            drawable2 = eh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f22734j = drawable2;
        yi0 yi0Var2 = this.f22735k;
        Rect rect = this.h;
        if (yi0Var2 != null) {
            yi0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f22733i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f22734j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public bh0(eh0 eh0Var, ch0 ch0Var) {
        this.f22748y = eh0Var;
        this.f22729b = new wc(eh0Var);
        this.e = new c6(eh0Var, 0L, 250L, qr.f27380f);
        d(0, ch0Var.f23045b, ch0Var.f23046c);
        c(LocaleController.getString(ch0Var.f23044a));
    }
}
