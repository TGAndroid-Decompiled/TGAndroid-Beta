package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class gh0 {
    public int f25122a;
    public final rc f25123b;
    public final z5 e;
    public Drawable f25127i;
    public Drawable f25128j;
    public gj0 f25129k;
    public k01 f25130l;
    public i90 f25136r;
    public boolean f25137s;
    public boolean f25138t;
    public int f25139u;
    public long f25140w;
    public int f25141x;
    public final jh0 f25142y;
    public final RectF f25124c = new RectF();
    public final RectF d = new RectF();
    public final RectF f25125f = new RectF();
    public final RectF f25126g = new RectF();
    public final Rect h = new Rect();
    public float f25131m = 1.0f;
    public boolean f25132n = false;
    public boolean f25133o = false;
    public boolean f25134p = false;
    public final float f25135q = 1.0f;
    public int v = 0;

    public gh0(jh0 jh0Var) {
        this.f25142y = jh0Var;
        this.f25123b = new rc(jh0Var);
        this.e = new z5(jh0Var, 0L, 250L, nr.f27346f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f25126g;
            float f10 = rectF.left;
            RectF rectF2 = this.f25125f;
            float lerp = AndroidUtilities.lerp(f10, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f25132n = false;
        if (this.f25133o) {
            this.f25134p = true;
        }
    }

    public final float b() {
        boolean z4 = this.f25133o;
        z5 z5Var = this.e;
        if (z4) {
            return 1.0f - z5Var.d(1.0f, false);
        }
        if (!this.f25132n) {
            return 1.0f;
        }
        return z5Var.d(1.0f, false);
    }

    public final void c(String str) {
        k01 k01Var = new k01(str, 11.0f, AndroidUtilities.bold());
        k01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        k01Var.a();
        this.f25130l = k01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        jh0 jh0Var = this.f25142y;
        if (i10 != 0) {
            gj0 gj0Var = new gj0(i10, String.valueOf(i10), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            gj0Var.f25170s0 = jh0Var;
            gj0Var.start();
            this.f25129k = gj0Var;
        } else {
            this.f25129k = null;
        }
        if (i11 != 0) {
            drawable = jh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f25127i = drawable;
        if (i12 != 0) {
            drawable2 = jh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f25128j = drawable2;
        gj0 gj0Var2 = this.f25129k;
        Rect rect = this.h;
        if (gj0Var2 != null) {
            gj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f25127i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f25128j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public gh0(jh0 jh0Var, hh0 hh0Var) {
        this.f25142y = jh0Var;
        this.f25123b = new rc(jh0Var);
        this.e = new z5(jh0Var, 0L, 250L, nr.f27346f);
        d(0, hh0Var.f25424b, hh0Var.f25425c);
        c(LocaleController.getString(hh0Var.f25423a));
    }
}
