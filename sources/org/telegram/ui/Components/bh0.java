package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class bh0 {
    public int f22740a;
    public final yc f22741b;
    public final e6 e;
    public Drawable f22745i;
    public Drawable f22746j;
    public yi0 f22747k;
    public f01 f22748l;
    public h90 f22754r;
    public boolean f22755s;
    public boolean f22756t;
    public int f22757u;
    public long f22758w;
    public int f22759x;
    public final eh0 f22760y;
    public final RectF f22742c = new RectF();
    public final RectF d = new RectF();
    public final RectF f22743f = new RectF();
    public final RectF f22744g = new RectF();
    public final Rect h = new Rect();
    public float f22749m = 1.0f;
    public boolean f22750n = false;
    public boolean f22751o = false;
    public boolean f22752p = false;
    public final float f22753q = 1.0f;
    public int v = 0;

    public bh0(eh0 eh0Var) {
        this.f22760y = eh0Var;
        this.f22741b = new yc(eh0Var);
        this.e = new e6(eh0Var, 0L, 250L, rr.f27701f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f22744g;
            float f7 = rectF.left;
            RectF rectF2 = this.f22743f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f22750n = false;
        if (this.f22751o) {
            this.f22752p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f22751o;
        e6 e6Var = this.e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f22750n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        f01 f01Var = new f01(str, 11.0f, AndroidUtilities.bold());
        f01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f01Var.a();
        this.f22748l = f01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        eh0 eh0Var = this.f22760y;
        if (i10 != 0) {
            yi0 yi0Var = new yi0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            yi0Var.R(eh0Var);
            yi0Var.start();
            this.f22747k = yi0Var;
        } else {
            this.f22747k = null;
        }
        if (i11 != 0) {
            drawable = eh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f22745i = drawable;
        if (i12 != 0) {
            drawable2 = eh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f22746j = drawable2;
        yi0 yi0Var2 = this.f22747k;
        Rect rect = this.h;
        if (yi0Var2 != null) {
            yi0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f22745i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f22746j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public bh0(eh0 eh0Var, ch0 ch0Var) {
        this.f22760y = eh0Var;
        this.f22741b = new yc(eh0Var);
        this.e = new e6(eh0Var, 0L, 250L, rr.f27701f);
        d(0, ch0Var.f23037b, ch0Var.f23038c);
        c(LocaleController.getString(ch0Var.f23036a));
    }
}
