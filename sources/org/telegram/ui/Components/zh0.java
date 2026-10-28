package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class zh0 {
    public int f35342a;
    public final xc f35343b;
    public final h6 e;
    public Drawable f35347i;
    public Drawable f35348j;
    public yj0 f35349k;
    public r11 f35350l;
    public ea0 f35356r;
    public boolean f35357s;
    public boolean f35358t;
    public int f35359u;
    public long f35360w;
    public int f35361x;
    public final ci0 f35362y;
    public final RectF f35344c = new RectF();
    public final RectF d = new RectF();
    public final RectF f35345f = new RectF();
    public final RectF f35346g = new RectF();
    public final Rect h = new Rect();
    public float f35351m = 1.0f;
    public boolean f35352n = false;
    public boolean f35353o = false;
    public boolean f35354p = false;
    public final float f35355q = 1.0f;
    public int v = 0;

    public zh0(ci0 ci0Var) {
        this.f35362y = ci0Var;
        this.f35343b = new xc(ci0Var);
        this.e = new h6(ci0Var, 0L, 250L, ds.f27530f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f35346g;
            float f7 = rectF.left;
            RectF rectF2 = this.f35345f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f35352n = false;
        if (this.f35353o) {
            this.f35354p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f35353o;
        h6 h6Var = this.e;
        if (z10) {
            return 1.0f - h6Var.d(1.0f, false);
        }
        if (!this.f35352n) {
            return 1.0f;
        }
        return h6Var.d(1.0f, false);
    }

    public final void c(String str) {
        r11 r11Var = new r11(str, 11.0f, AndroidUtilities.bold());
        r11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        r11Var.a();
        this.f35350l = r11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        ci0 ci0Var = this.f35362y;
        if (i10 != 0) {
            yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            yj0Var.R(ci0Var);
            yj0Var.start();
            this.f35349k = yj0Var;
        } else {
            this.f35349k = null;
        }
        if (i11 != 0) {
            drawable = ci0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f35347i = drawable;
        if (i12 != 0) {
            drawable2 = ci0Var.getResources().getDrawable(i12).mutate();
        }
        this.f35348j = drawable2;
        yj0 yj0Var2 = this.f35349k;
        Rect rect = this.h;
        if (yj0Var2 != null) {
            yj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f35347i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f35348j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public zh0(ci0 ci0Var, ai0 ai0Var) {
        this.f35362y = ci0Var;
        this.f35343b = new xc(ci0Var);
        this.e = new h6(ci0Var, 0L, 250L, ds.f27530f);
        d(0, ai0Var.f26569b, ai0Var.f26570c);
        c(LocaleController.getString(ai0Var.f26568a));
    }
}
