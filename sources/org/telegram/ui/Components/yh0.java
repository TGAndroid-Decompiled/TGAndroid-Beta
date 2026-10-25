package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class yh0 {
    public int f35041a;
    public final xc f35042b;
    public final h6 e;
    public Drawable f35046i;
    public Drawable f35047j;
    public xj0 f35048k;
    public q11 f35049l;
    public da0 f35055r;
    public boolean f35056s;
    public boolean f35057t;
    public int f35058u;
    public long f35059w;
    public int f35060x;
    public final bi0 f35061y;
    public final RectF f35043c = new RectF();
    public final RectF d = new RectF();
    public final RectF f35044f = new RectF();
    public final RectF f35045g = new RectF();
    public final Rect h = new Rect();
    public float f35050m = 1.0f;
    public boolean f35051n = false;
    public boolean f35052o = false;
    public boolean f35053p = false;
    public final float f35054q = 1.0f;
    public int v = 0;

    public yh0(bi0 bi0Var) {
        this.f35061y = bi0Var;
        this.f35042b = new xc(bi0Var);
        this.e = new h6(bi0Var, 0L, 250L, ds.f27584f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f35045g;
            float f7 = rectF.left;
            RectF rectF2 = this.f35044f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f35051n = false;
        if (this.f35052o) {
            this.f35053p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f35052o;
        h6 h6Var = this.e;
        if (z10) {
            return 1.0f - h6Var.d(1.0f, false);
        }
        if (!this.f35051n) {
            return 1.0f;
        }
        return h6Var.d(1.0f, false);
    }

    public final void c(String str) {
        q11 q11Var = new q11(str, 11.0f, AndroidUtilities.bold());
        q11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        q11Var.a();
        this.f35049l = q11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        bi0 bi0Var = this.f35061y;
        if (i10 != 0) {
            xj0 xj0Var = new xj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            xj0Var.R(bi0Var);
            xj0Var.start();
            this.f35048k = xj0Var;
        } else {
            this.f35048k = null;
        }
        if (i11 != 0) {
            drawable = bi0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f35046i = drawable;
        if (i12 != 0) {
            drawable2 = bi0Var.getResources().getDrawable(i12).mutate();
        }
        this.f35047j = drawable2;
        xj0 xj0Var2 = this.f35048k;
        Rect rect = this.h;
        if (xj0Var2 != null) {
            xj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f35046i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f35047j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public yh0(bi0 bi0Var, zh0 zh0Var) {
        this.f35061y = bi0Var;
        this.f35042b = new xc(bi0Var);
        this.e = new h6(bi0Var, 0L, 250L, ds.f27584f);
        d(0, zh0Var.f35337b, zh0Var.f35338c);
        c(LocaleController.getString(zh0Var.f35336a));
    }
}
