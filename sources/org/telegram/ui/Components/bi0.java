package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class bi0 {
    public int f23460a;
    public final ad f23461b;
    public final g6 e;
    public Drawable f23465i;
    public Drawable f23466j;
    public yj0 f23467k;
    public i11 f23468l;
    public ha0 f23474r;
    public boolean f23475s;
    public boolean f23476t;
    public int f23477u;
    public long f23478w;
    public int f23479x;
    public final ei0 f23480y;
    public final RectF f23462c = new RectF();
    public final RectF d = new RectF();
    public final RectF f23463f = new RectF();
    public final RectF f23464g = new RectF();
    public final Rect h = new Rect();
    public float f23469m = 1.0f;
    public boolean f23470n = false;
    public boolean f23471o = false;
    public boolean f23472p = false;
    public final float f23473q = 1.0f;
    public int v = 0;

    public bi0(ei0 ei0Var) {
        this.f23480y = ei0Var;
        this.f23461b = new ad(ei0Var);
        this.e = new g6(ei0Var, 0L, 250L, es.f24465f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f23464g;
            float f7 = rectF.left;
            RectF rectF2 = this.f23463f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f23470n = false;
        if (this.f23471o) {
            this.f23472p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f23471o;
        g6 g6Var = this.e;
        if (z10) {
            return 1.0f - g6Var.d(1.0f, false);
        }
        if (!this.f23470n) {
            return 1.0f;
        }
        return g6Var.d(1.0f, false);
    }

    public final void c(String str) {
        i11 i11Var = new i11(str, 11.0f, AndroidUtilities.bold());
        i11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        i11Var.a();
        this.f23468l = i11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        ei0 ei0Var = this.f23480y;
        if (i10 != 0) {
            yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            yj0Var.R(ei0Var);
            yj0Var.start();
            this.f23467k = yj0Var;
        } else {
            this.f23467k = null;
        }
        if (i11 != 0) {
            drawable = ei0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f23465i = drawable;
        if (i12 != 0) {
            drawable2 = ei0Var.getResources().getDrawable(i12).mutate();
        }
        this.f23466j = drawable2;
        yj0 yj0Var2 = this.f23467k;
        Rect rect = this.h;
        if (yj0Var2 != null) {
            yj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f23465i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f23466j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public bi0(ei0 ei0Var, ci0 ci0Var) {
        this.f23480y = ei0Var;
        this.f23461b = new ad(ei0Var);
        this.e = new g6(ei0Var, 0L, 250L, es.f24465f);
        d(0, ci0Var.f23742b, ci0Var.f23743c);
        c(LocaleController.getString(ci0Var.f23741a));
    }
}
