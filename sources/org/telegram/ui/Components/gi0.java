package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class gi0 {
    public int f26721a;
    public final bd f26722b;
    public final g6 f26724e;
    public Drawable f26727i;
    public Drawable f26728j;
    public dk0 f26729k;
    public m11 f26730l;
    public ja0 f26736r;
    public boolean f26737s;
    public boolean f26738t;
    public int f26739u;
    public long f26740w;
    public int f26741x;
    public final ji0 f26742y;
    public final RectF f26723c = new RectF();
    public final RectF d = new RectF();
    public final RectF f26725f = new RectF();
    public final RectF f26726g = new RectF();
    public final Rect h = new Rect();
    public float f26731m = 1.0f;
    public boolean f26732n = false;
    public boolean f26733o = false;
    public boolean f26734p = false;
    public final float f26735q = 1.0f;
    public int v = 0;

    public gi0(ji0 ji0Var) {
        this.f26742y = ji0Var;
        this.f26722b = new bd(ji0Var);
        this.f26724e = new g6(ji0Var, 0L, 250L, is.f27443f);
    }

    public final void a() {
        float d = this.f26724e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f26726g;
            float f7 = rectF.left;
            RectF rectF2 = this.f26725f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f26732n = false;
        if (this.f26733o) {
            this.f26734p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f26733o;
        g6 g6Var = this.f26724e;
        if (z10) {
            return 1.0f - g6Var.d(1.0f, false);
        }
        if (!this.f26732n) {
            return 1.0f;
        }
        return g6Var.d(1.0f, false);
    }

    public final void c(String str) {
        m11 m11Var = new m11(str, 11.0f, AndroidUtilities.bold());
        m11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        m11Var.a();
        this.f26730l = m11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        ji0 ji0Var = this.f26742y;
        if (i10 != 0) {
            dk0 dk0Var = new dk0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            dk0Var.R(ji0Var);
            dk0Var.start();
            this.f26729k = dk0Var;
        } else {
            this.f26729k = null;
        }
        if (i11 != 0) {
            drawable = ji0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f26727i = drawable;
        if (i12 != 0) {
            drawable2 = ji0Var.getResources().getDrawable(i12).mutate();
        }
        this.f26728j = drawable2;
        dk0 dk0Var2 = this.f26729k;
        Rect rect = this.h;
        if (dk0Var2 != null) {
            dk0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f26727i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f26728j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public gi0(ji0 ji0Var, hi0 hi0Var) {
        this.f26742y = ji0Var;
        this.f26722b = new bd(ji0Var);
        this.f26724e = new g6(ji0Var, 0L, 250L, is.f27443f);
        d(0, hi0Var.f27047b, hi0Var.f27048c);
        c(LocaleController.getString(hi0Var.f27046a));
    }
}
