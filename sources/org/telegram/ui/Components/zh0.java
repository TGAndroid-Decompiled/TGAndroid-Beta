package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class zh0 {
    public int f33225a;
    public final yc f33226b;
    public final f6 e;
    public Drawable f33230i;
    public Drawable f33231j;
    public yj0 f33232k;
    public i11 f33233l;
    public ca0 f33239r;
    public boolean f33240s;
    public boolean f33241t;
    public int f33242u;
    public long f33243w;
    public int f33244x;
    public final ci0 f33245y;
    public final RectF f33227c = new RectF();
    public final RectF d = new RectF();
    public final RectF f33228f = new RectF();
    public final RectF f33229g = new RectF();
    public final Rect h = new Rect();
    public float f33234m = 1.0f;
    public boolean f33235n = false;
    public boolean f33236o = false;
    public boolean f33237p = false;
    public final float f33238q = 1.0f;
    public int v = 0;

    public zh0(ci0 ci0Var) {
        this.f33245y = ci0Var;
        this.f33226b = new yc(ci0Var);
        this.e = new f6(ci0Var, 0L, 250L, bs.f25133f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f33229g;
            float f7 = rectF.left;
            RectF rectF2 = this.f33228f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f33235n = false;
        if (this.f33236o) {
            this.f33237p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f33236o;
        f6 f6Var = this.e;
        if (z10) {
            return 1.0f - f6Var.d(1.0f, false);
        }
        if (!this.f33235n) {
            return 1.0f;
        }
        return f6Var.d(1.0f, false);
    }

    public final void c(String str) {
        i11 i11Var = new i11(str, 11.0f, AndroidUtilities.bold());
        i11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        i11Var.a();
        this.f33233l = i11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        ci0 ci0Var = this.f33245y;
        if (i10 != 0) {
            yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            yj0Var.R(ci0Var);
            yj0Var.start();
            this.f33232k = yj0Var;
        } else {
            this.f33232k = null;
        }
        if (i11 != 0) {
            drawable = ci0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f33230i = drawable;
        if (i12 != 0) {
            drawable2 = ci0Var.getResources().getDrawable(i12).mutate();
        }
        this.f33231j = drawable2;
        yj0 yj0Var2 = this.f33232k;
        Rect rect = this.h;
        if (yj0Var2 != null) {
            yj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f33230i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f33231j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public zh0(ci0 ci0Var, ai0 ai0Var) {
        this.f33245y = ci0Var;
        this.f33226b = new yc(ci0Var);
        this.e = new f6(ci0Var, 0L, 250L, bs.f25133f);
        d(0, ai0Var.f24732b, ai0Var.f24733c);
        c(LocaleController.getString(ai0Var.f24731a));
    }
}
