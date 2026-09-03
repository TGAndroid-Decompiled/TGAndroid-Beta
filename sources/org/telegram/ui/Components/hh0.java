package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class hh0 {
    public int f25405a;
    public final rc f25406b;
    public final z5 e;
    public Drawable f25410i;
    public Drawable f25411j;
    public gj0 f25412k;
    public k01 f25413l;
    public j90 f25419r;
    public boolean f25420s;
    public boolean f25421t;
    public int f25422u;
    public long f25423w;
    public int f25424x;
    public final kh0 f25425y;
    public final RectF f25407c = new RectF();
    public final RectF d = new RectF();
    public final RectF f25408f = new RectF();
    public final RectF f25409g = new RectF();
    public final Rect h = new Rect();
    public float f25414m = 1.0f;
    public boolean f25415n = false;
    public boolean f25416o = false;
    public boolean f25417p = false;
    public final float f25418q = 1.0f;
    public int v = 0;

    public hh0(kh0 kh0Var) {
        this.f25425y = kh0Var;
        this.f25406b = new rc(kh0Var);
        this.e = new z5(kh0Var, 0L, 250L, mr.f27122f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f25409g;
            float f10 = rectF.left;
            RectF rectF2 = this.f25408f;
            float lerp = AndroidUtilities.lerp(f10, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f25415n = false;
        if (this.f25416o) {
            this.f25417p = true;
        }
    }

    public final float b() {
        boolean z4 = this.f25416o;
        z5 z5Var = this.e;
        if (z4) {
            return 1.0f - z5Var.d(1.0f, false);
        }
        if (!this.f25415n) {
            return 1.0f;
        }
        return z5Var.d(1.0f, false);
    }

    public final void c(String str) {
        k01 k01Var = new k01(str, 11.0f, AndroidUtilities.bold());
        k01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        k01Var.a();
        this.f25413l = k01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        kh0 kh0Var = this.f25425y;
        if (i10 != 0) {
            gj0 gj0Var = new gj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            gj0Var.f25176s0 = kh0Var;
            gj0Var.start();
            this.f25412k = gj0Var;
        } else {
            this.f25412k = null;
        }
        if (i11 != 0) {
            drawable = kh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f25410i = drawable;
        if (i12 != 0) {
            drawable2 = kh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f25411j = drawable2;
        gj0 gj0Var2 = this.f25412k;
        Rect rect = this.h;
        if (gj0Var2 != null) {
            gj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f25410i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f25411j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public hh0(kh0 kh0Var, ih0 ih0Var) {
        this.f25425y = kh0Var;
        this.f25406b = new rc(kh0Var);
        this.e = new z5(kh0Var, 0L, 250L, mr.f27122f);
        d(0, ih0Var.f25717b, ih0Var.f25718c);
        c(LocaleController.getString(ih0Var.f25716a));
    }
}
