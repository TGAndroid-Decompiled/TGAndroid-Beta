package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class nh0 {
    public int f26765a;
    public final yc f26766b;
    public final e6 e;
    public Drawable f26770i;
    public Drawable f26771j;
    public kj0 f26772k;
    public v01 f26773l;
    public t90 f26779r;
    public boolean f26780s;
    public boolean f26781t;
    public int f26782u;
    public long f26783w;
    public int f26784x;
    public final qh0 f26785y;
    public final RectF f26767c = new RectF();
    public final RectF d = new RectF();
    public final RectF f26768f = new RectF();
    public final RectF f26769g = new RectF();
    public final Rect h = new Rect();
    public float f26774m = 1.0f;
    public boolean f26775n = false;
    public boolean f26776o = false;
    public boolean f26777p = false;
    public final float f26778q = 1.0f;
    public int v = 0;

    public nh0(qh0 qh0Var) {
        this.f26785y = qh0Var;
        this.f26766b = new yc(qh0Var);
        this.e = new e6(qh0Var, 0L, 250L, sr.f28348f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f26769g;
            float f7 = rectF.left;
            RectF rectF2 = this.f26768f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f26775n = false;
        if (this.f26776o) {
            this.f26777p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f26776o;
        e6 e6Var = this.e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f26775n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        v01 v01Var = new v01(str, 11.0f, AndroidUtilities.bold());
        v01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        v01Var.a();
        this.f26773l = v01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        qh0 qh0Var = this.f26785y;
        if (i10 != 0) {
            kj0 kj0Var = new kj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            kj0Var.R(qh0Var);
            kj0Var.start();
            this.f26772k = kj0Var;
        } else {
            this.f26772k = null;
        }
        if (i11 != 0) {
            drawable = qh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f26770i = drawable;
        if (i12 != 0) {
            drawable2 = qh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f26771j = drawable2;
        kj0 kj0Var2 = this.f26772k;
        Rect rect = this.h;
        if (kj0Var2 != null) {
            kj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f26770i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f26771j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public nh0(qh0 qh0Var, oh0 oh0Var) {
        this.f26785y = qh0Var;
        this.f26766b = new yc(qh0Var);
        this.e = new e6(qh0Var, 0L, 250L, sr.f28348f);
        d(0, oh0Var.f27073b, oh0Var.f27074c);
        c(LocaleController.getString(oh0Var.f27072a));
    }
}
