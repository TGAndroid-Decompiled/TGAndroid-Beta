package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ii0 {
    public int f27150a;
    public final ad f27151b;
    public final g6 f27153e;
    public Drawable f27156i;
    public Drawable f27157j;
    public fk0 f27158k;
    public r11 f27159l;
    public ma0 f27165r;
    public boolean f27166s;
    public boolean f27167t;
    public int f27168u;
    public long f27169w;
    public int f27170x;
    public final li0 f27171y;
    public final RectF f27152c = new RectF();
    public final RectF d = new RectF();
    public final RectF f27154f = new RectF();
    public final RectF f27155g = new RectF();
    public final Rect h = new Rect();
    public float f27160m = 1.0f;
    public boolean f27161n = false;
    public boolean f27162o = false;
    public boolean f27163p = false;
    public final float f27164q = 1.0f;
    public int v = 0;

    public ii0(li0 li0Var) {
        this.f27171y = li0Var;
        this.f27151b = new ad(li0Var);
        this.f27153e = new g6(li0Var, 0L, 250L, js.f27634f);
    }

    public final void a() {
        float d = this.f27153e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f27155g;
            float f7 = rectF.left;
            RectF rectF2 = this.f27154f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f27161n = false;
        if (this.f27162o) {
            this.f27163p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f27162o;
        g6 g6Var = this.f27153e;
        if (z10) {
            return 1.0f - g6Var.d(1.0f, false);
        }
        if (!this.f27161n) {
            return 1.0f;
        }
        return g6Var.d(1.0f, false);
    }

    public final void c(String str) {
        r11 r11Var = new r11(str, 11.0f, AndroidUtilities.bold());
        r11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        r11Var.a();
        this.f27159l = r11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        li0 li0Var = this.f27171y;
        if (i10 != 0) {
            fk0 fk0Var = new fk0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            fk0Var.R(li0Var);
            fk0Var.start();
            this.f27158k = fk0Var;
        } else {
            this.f27158k = null;
        }
        if (i11 != 0) {
            drawable = li0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f27156i = drawable;
        if (i12 != 0) {
            drawable2 = li0Var.getResources().getDrawable(i12).mutate();
        }
        this.f27157j = drawable2;
        fk0 fk0Var2 = this.f27158k;
        Rect rect = this.h;
        if (fk0Var2 != null) {
            fk0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f27156i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f27157j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public ii0(li0 li0Var, ji0 ji0Var) {
        this.f27171y = li0Var;
        this.f27151b = new ad(li0Var);
        this.f27153e = new g6(li0Var, 0L, 250L, js.f27634f);
        d(0, ji0Var.f27533b, ji0Var.f27534c);
        c(LocaleController.getString(ji0Var.f27532a));
    }
}
