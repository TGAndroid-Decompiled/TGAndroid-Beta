package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class hi0 {
    public int f26780a;
    public final ad f26781b;
    public final g6 f26783e;
    public Drawable f26786i;
    public Drawable f26787j;
    public fk0 f26788k;
    public r11 f26789l;
    public ma0 f26795r;
    public boolean f26796s;
    public boolean f26797t;
    public int f26798u;
    public long f26799w;
    public int f26800x;
    public final ki0 f26801y;
    public final RectF f26782c = new RectF();
    public final RectF d = new RectF();
    public final RectF f26784f = new RectF();
    public final RectF f26785g = new RectF();
    public final Rect h = new Rect();
    public float f26790m = 1.0f;
    public boolean f26791n = false;
    public boolean f26792o = false;
    public boolean f26793p = false;
    public final float f26794q = 1.0f;
    public int v = 0;

    public hi0(ki0 ki0Var) {
        this.f26801y = ki0Var;
        this.f26781b = new ad(ki0Var);
        this.f26783e = new g6(ki0Var, 0L, 250L, js.f27627f);
    }

    public final void a() {
        float d = this.f26783e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f26785g;
            float f7 = rectF.left;
            RectF rectF2 = this.f26784f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f26791n = false;
        if (this.f26792o) {
            this.f26793p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f26792o;
        g6 g6Var = this.f26783e;
        if (z10) {
            return 1.0f - g6Var.d(1.0f, false);
        }
        if (!this.f26791n) {
            return 1.0f;
        }
        return g6Var.d(1.0f, false);
    }

    public final void c(String str) {
        r11 r11Var = new r11(str, 11.0f, AndroidUtilities.bold());
        r11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        r11Var.a();
        this.f26789l = r11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        ki0 ki0Var = this.f26801y;
        if (i10 != 0) {
            fk0 fk0Var = new fk0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            fk0Var.R(ki0Var);
            fk0Var.start();
            this.f26788k = fk0Var;
        } else {
            this.f26788k = null;
        }
        if (i11 != 0) {
            drawable = ki0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f26786i = drawable;
        if (i12 != 0) {
            drawable2 = ki0Var.getResources().getDrawable(i12).mutate();
        }
        this.f26787j = drawable2;
        fk0 fk0Var2 = this.f26788k;
        Rect rect = this.h;
        if (fk0Var2 != null) {
            fk0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f26786i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f26787j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public hi0(ki0 ki0Var, ii0 ii0Var) {
        this.f26801y = ki0Var;
        this.f26781b = new ad(ki0Var);
        this.f26783e = new g6(ki0Var, 0L, 250L, js.f27627f);
        d(0, ii0Var.f27174b, ii0Var.f27175c);
        c(LocaleController.getString(ii0Var.f27173a));
    }
}
