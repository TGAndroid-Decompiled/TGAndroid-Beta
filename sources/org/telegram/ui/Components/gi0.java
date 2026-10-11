package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class gi0 {
    public int f26750a;
    public final bd f26751b;
    public final g6 f26753e;
    public Drawable f26756i;
    public Drawable f26757j;
    public dk0 f26758k;
    public m11 f26759l;
    public ia0 f26765r;
    public boolean f26766s;
    public boolean f26767t;
    public int f26768u;
    public long f26769w;
    public int f26770x;
    public final ji0 f26771y;
    public final RectF f26752c = new RectF();
    public final RectF d = new RectF();
    public final RectF f26754f = new RectF();
    public final RectF f26755g = new RectF();
    public final Rect h = new Rect();
    public float f26760m = 1.0f;
    public boolean f26761n = false;
    public boolean f26762o = false;
    public boolean f26763p = false;
    public final float f26764q = 1.0f;
    public int v = 0;

    public gi0(ji0 ji0Var) {
        this.f26771y = ji0Var;
        this.f26751b = new bd(ji0Var);
        this.f26753e = new g6(ji0Var, 0L, 250L, is.f27500f);
    }

    public final void a() {
        float d = this.f26753e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f26755g;
            float f7 = rectF.left;
            RectF rectF2 = this.f26754f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f26761n = false;
        if (this.f26762o) {
            this.f26763p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f26762o;
        g6 g6Var = this.f26753e;
        if (z10) {
            return 1.0f - g6Var.d(1.0f, false);
        }
        if (!this.f26761n) {
            return 1.0f;
        }
        return g6Var.d(1.0f, false);
    }

    public final void c(String str) {
        m11 m11Var = new m11(str, 11.0f, AndroidUtilities.bold());
        m11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        m11Var.a();
        this.f26759l = m11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        ji0 ji0Var = this.f26771y;
        if (i10 != 0) {
            dk0 dk0Var = new dk0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            dk0Var.R(ji0Var);
            dk0Var.start();
            this.f26758k = dk0Var;
        } else {
            this.f26758k = null;
        }
        if (i11 != 0) {
            drawable = ji0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f26756i = drawable;
        if (i12 != 0) {
            drawable2 = ji0Var.getResources().getDrawable(i12).mutate();
        }
        this.f26757j = drawable2;
        dk0 dk0Var2 = this.f26758k;
        Rect rect = this.h;
        if (dk0Var2 != null) {
            dk0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f26756i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f26757j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public gi0(ji0 ji0Var, hi0 hi0Var) {
        this.f26771y = ji0Var;
        this.f26751b = new bd(ji0Var);
        this.f26753e = new g6(ji0Var, 0L, 250L, is.f27500f);
        d(0, hi0Var.f27137b, hi0Var.f27138c);
        c(LocaleController.getString(hi0Var.f27136a));
    }
}
