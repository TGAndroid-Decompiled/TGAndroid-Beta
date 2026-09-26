package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class mh0 {
    public int f26404a;
    public final yc f26405b;
    public final e6 e;
    public Drawable f26409i;
    public Drawable f26410j;
    public jj0 f26411k;
    public u01 f26412l;
    public s90 f26418r;
    public boolean f26419s;
    public boolean f26420t;
    public int f26421u;
    public long f26422w;
    public int f26423x;
    public final ph0 f26424y;
    public final RectF f26406c = new RectF();
    public final RectF d = new RectF();
    public final RectF f26407f = new RectF();
    public final RectF f26408g = new RectF();
    public final Rect h = new Rect();
    public float f26413m = 1.0f;
    public boolean f26414n = false;
    public boolean f26415o = false;
    public boolean f26416p = false;
    public final float f26417q = 1.0f;
    public int v = 0;

    public mh0(ph0 ph0Var) {
        this.f26424y = ph0Var;
        this.f26405b = new yc(ph0Var);
        this.e = new e6(ph0Var, 0L, 250L, sr.f28339f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f26408g;
            float f7 = rectF.left;
            RectF rectF2 = this.f26407f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f26414n = false;
        if (this.f26415o) {
            this.f26416p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f26415o;
        e6 e6Var = this.e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f26414n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        u01 u01Var = new u01(str, 11.0f, AndroidUtilities.bold());
        u01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        u01Var.a();
        this.f26412l = u01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        ph0 ph0Var = this.f26424y;
        if (i10 != 0) {
            jj0 jj0Var = new jj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            jj0Var.R(ph0Var);
            jj0Var.start();
            this.f26411k = jj0Var;
        } else {
            this.f26411k = null;
        }
        if (i11 != 0) {
            drawable = ph0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f26409i = drawable;
        if (i12 != 0) {
            drawable2 = ph0Var.getResources().getDrawable(i12).mutate();
        }
        this.f26410j = drawable2;
        jj0 jj0Var2 = this.f26411k;
        Rect rect = this.h;
        if (jj0Var2 != null) {
            jj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f26409i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f26410j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public mh0(ph0 ph0Var, nh0 nh0Var) {
        this.f26424y = ph0Var;
        this.f26405b = new yc(ph0Var);
        this.e = new e6(ph0Var, 0L, 250L, sr.f28339f);
        d(0, nh0Var.f26799b, nh0Var.f26800c);
        c(LocaleController.getString(nh0Var.f26798a));
    }
}
