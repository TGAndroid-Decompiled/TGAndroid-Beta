package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class nh0 {
    public int f28965a;
    public final zc f28966b;
    public final e6 f28968e;
    public Drawable f28971i;
    public Drawable f28972j;
    public kj0 f28973k;
    public e11 f28974l;
    public u90 f28980r;
    public boolean f28981s;
    public boolean f28982t;
    public int f28983u;
    public long f28984w;
    public int f28985x;
    public final qh0 f28986y;
    public final RectF f28967c = new RectF();
    public final RectF d = new RectF();
    public final RectF f28969f = new RectF();
    public final RectF f28970g = new RectF();
    public final Rect h = new Rect();
    public float f28975m = 1.0f;
    public boolean f28976n = false;
    public boolean f28977o = false;
    public boolean f28978p = false;
    public final float f28979q = 1.0f;
    public int v = 0;

    public nh0(qh0 qh0Var) {
        this.f28986y = qh0Var;
        this.f28966b = new zc(qh0Var);
        this.f28968e = new e6(qh0Var, 0L, 250L, tr.f31140f);
    }

    public final void a() {
        float d = this.f28968e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f28970g;
            float f7 = rectF.left;
            RectF rectF2 = this.f28969f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f28976n = false;
        if (this.f28977o) {
            this.f28978p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f28977o;
        e6 e6Var = this.f28968e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f28976n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        e11 e11Var = new e11(str, 11.0f, AndroidUtilities.bold());
        e11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        e11Var.a();
        this.f28974l = e11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        qh0 qh0Var = this.f28986y;
        if (i10 != 0) {
            kj0 kj0Var = new kj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            kj0Var.R(qh0Var);
            kj0Var.start();
            this.f28973k = kj0Var;
        } else {
            this.f28973k = null;
        }
        if (i11 != 0) {
            drawable = qh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f28971i = drawable;
        if (i12 != 0) {
            drawable2 = qh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f28972j = drawable2;
        kj0 kj0Var2 = this.f28973k;
        Rect rect = this.h;
        if (kj0Var2 != null) {
            kj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f28971i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f28972j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public nh0(qh0 qh0Var, oh0 oh0Var) {
        this.f28986y = qh0Var;
        this.f28966b = new zc(qh0Var);
        this.f28968e = new e6(qh0Var, 0L, 250L, tr.f31140f);
        d(0, oh0Var.f29359b, oh0Var.f29360c);
        c(LocaleController.getString(oh0Var.f29358a));
    }
}
