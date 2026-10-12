package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class bi0 {
    public int f23767a;
    public final ad f23768b;
    public final g6 e;
    public Drawable f23772i;
    public Drawable f23773j;
    public yj0 f23774k;
    public h11 f23775l;
    public ha0 f23781r;
    public boolean f23782s;
    public boolean f23783t;
    public int f23784u;
    public long f23785w;
    public int f23786x;
    public final ei0 f23787y;
    public final RectF f23769c = new RectF();
    public final RectF d = new RectF();
    public final RectF f23770f = new RectF();
    public final RectF f23771g = new RectF();
    public final Rect h = new Rect();
    public float f23776m = 1.0f;
    public boolean f23777n = false;
    public boolean f23778o = false;
    public boolean f23779p = false;
    public final float f23780q = 1.0f;
    public int v = 0;

    public bi0(ei0 ei0Var) {
        this.f23787y = ei0Var;
        this.f23768b = new ad(ei0Var);
        this.e = new g6(ei0Var, 0L, 250L, es.f24771f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f23771g;
            float f7 = rectF.left;
            RectF rectF2 = this.f23770f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f23777n = false;
        if (this.f23778o) {
            this.f23779p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f23778o;
        g6 g6Var = this.e;
        if (z10) {
            return 1.0f - g6Var.d(1.0f, false);
        }
        if (!this.f23777n) {
            return 1.0f;
        }
        return g6Var.d(1.0f, false);
    }

    public final void c(String str) {
        h11 h11Var = new h11(str, 11.0f, AndroidUtilities.bold());
        h11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        h11Var.a();
        this.f23775l = h11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        ei0 ei0Var = this.f23787y;
        if (i10 != 0) {
            yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            yj0Var.R(ei0Var);
            yj0Var.start();
            this.f23774k = yj0Var;
        } else {
            this.f23774k = null;
        }
        if (i11 != 0) {
            drawable = ei0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f23772i = drawable;
        if (i12 != 0) {
            drawable2 = ei0Var.getResources().getDrawable(i12).mutate();
        }
        this.f23773j = drawable2;
        yj0 yj0Var2 = this.f23774k;
        Rect rect = this.h;
        if (yj0Var2 != null) {
            yj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f23772i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f23773j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public bi0(ei0 ei0Var, ci0 ci0Var) {
        this.f23787y = ei0Var;
        this.f23768b = new ad(ei0Var);
        this.e = new g6(ei0Var, 0L, 250L, es.f24771f);
        d(0, ci0Var.f24085b, ci0Var.f24086c);
        c(LocaleController.getString(ci0Var.f24084a));
    }
}
