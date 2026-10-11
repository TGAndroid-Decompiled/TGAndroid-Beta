package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class hi0 {
    public int f26997a;
    public final bd f26998b;
    public final g6 f27000e;
    public Drawable f27003i;
    public Drawable f27004j;
    public ek0 f27005k;
    public n11 f27006l;
    public ja0 f27012r;
    public boolean f27013s;
    public boolean f27014t;
    public int f27015u;
    public long f27016w;
    public int f27017x;
    public final ki0 f27018y;
    public final RectF f26999c = new RectF();
    public final RectF d = new RectF();
    public final RectF f27001f = new RectF();
    public final RectF f27002g = new RectF();
    public final Rect h = new Rect();
    public float f27007m = 1.0f;
    public boolean f27008n = false;
    public boolean f27009o = false;
    public boolean f27010p = false;
    public final float f27011q = 1.0f;
    public int v = 0;

    public hi0(ki0 ki0Var) {
        this.f27018y = ki0Var;
        this.f26998b = new bd(ki0Var);
        this.f27000e = new g6(ki0Var, 0L, 250L, is.f27451f);
    }

    public final void a() {
        float d = this.f27000e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f27002g;
            float f7 = rectF.left;
            RectF rectF2 = this.f27001f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f27008n = false;
        if (this.f27009o) {
            this.f27010p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f27009o;
        g6 g6Var = this.f27000e;
        if (z10) {
            return 1.0f - g6Var.d(1.0f, false);
        }
        if (!this.f27008n) {
            return 1.0f;
        }
        return g6Var.d(1.0f, false);
    }

    public final void c(String str) {
        n11 n11Var = new n11(str, 11.0f, AndroidUtilities.bold());
        n11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        n11Var.a();
        this.f27006l = n11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        ki0 ki0Var = this.f27018y;
        if (i10 != 0) {
            ek0 ek0Var = new ek0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            ek0Var.R(ki0Var);
            ek0Var.start();
            this.f27005k = ek0Var;
        } else {
            this.f27005k = null;
        }
        if (i11 != 0) {
            drawable = ki0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f27003i = drawable;
        if (i12 != 0) {
            drawable2 = ki0Var.getResources().getDrawable(i12).mutate();
        }
        this.f27004j = drawable2;
        ek0 ek0Var2 = this.f27005k;
        Rect rect = this.h;
        if (ek0Var2 != null) {
            ek0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f27003i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f27004j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public hi0(ki0 ki0Var, ii0 ii0Var) {
        this.f27018y = ki0Var;
        this.f26998b = new bd(ki0Var);
        this.f27000e = new g6(ki0Var, 0L, 250L, is.f27451f);
        d(0, ii0Var.f27359b, ii0Var.f27360c);
        c(LocaleController.getString(ii0Var.f27358a));
    }
}
