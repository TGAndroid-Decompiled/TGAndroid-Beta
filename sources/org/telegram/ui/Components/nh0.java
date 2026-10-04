package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class nh0 {
    public int f28971a;
    public final zc f28972b;
    public final e6 f28974e;
    public Drawable f28977i;
    public Drawable f28978j;
    public kj0 f28979k;
    public e11 f28980l;
    public u90 f28986r;
    public boolean f28987s;
    public boolean f28988t;
    public int f28989u;
    public long f28990w;
    public int f28991x;
    public final qh0 f28992y;
    public final RectF f28973c = new RectF();
    public final RectF d = new RectF();
    public final RectF f28975f = new RectF();
    public final RectF f28976g = new RectF();
    public final Rect h = new Rect();
    public float f28981m = 1.0f;
    public boolean f28982n = false;
    public boolean f28983o = false;
    public boolean f28984p = false;
    public final float f28985q = 1.0f;
    public int v = 0;

    public nh0(qh0 qh0Var) {
        this.f28992y = qh0Var;
        this.f28972b = new zc(qh0Var);
        this.f28974e = new e6(qh0Var, 0L, 250L, tr.f31147f);
    }

    public final void a() {
        float d = this.f28974e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f28976g;
            float f7 = rectF.left;
            RectF rectF2 = this.f28975f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f28982n = false;
        if (this.f28983o) {
            this.f28984p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f28983o;
        e6 e6Var = this.f28974e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f28982n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        e11 e11Var = new e11(str, 11.0f, AndroidUtilities.bold());
        e11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        e11Var.a();
        this.f28980l = e11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        qh0 qh0Var = this.f28992y;
        if (i10 != 0) {
            kj0 kj0Var = new kj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            kj0Var.R(qh0Var);
            kj0Var.start();
            this.f28979k = kj0Var;
        } else {
            this.f28979k = null;
        }
        if (i11 != 0) {
            drawable = qh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f28977i = drawable;
        if (i12 != 0) {
            drawable2 = qh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f28978j = drawable2;
        kj0 kj0Var2 = this.f28979k;
        Rect rect = this.h;
        if (kj0Var2 != null) {
            kj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f28977i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f28978j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public nh0(qh0 qh0Var, oh0 oh0Var) {
        this.f28992y = qh0Var;
        this.f28972b = new zc(qh0Var);
        this.f28974e = new e6(qh0Var, 0L, 250L, tr.f31147f);
        d(0, oh0Var.f29365b, oh0Var.f29366c);
        c(LocaleController.getString(oh0Var.f29364a));
    }
}
