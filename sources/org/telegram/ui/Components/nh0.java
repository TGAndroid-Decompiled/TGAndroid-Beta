package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class nh0 {
    public int f28966a;
    public final zc f28967b;
    public final e6 f28969e;
    public Drawable f28972i;
    public Drawable f28973j;
    public kj0 f28974k;
    public e11 f28975l;
    public u90 f28981r;
    public boolean f28982s;
    public boolean f28983t;
    public int f28984u;
    public long f28985w;
    public int f28986x;
    public final qh0 f28987y;
    public final RectF f28968c = new RectF();
    public final RectF d = new RectF();
    public final RectF f28970f = new RectF();
    public final RectF f28971g = new RectF();
    public final Rect h = new Rect();
    public float f28976m = 1.0f;
    public boolean f28977n = false;
    public boolean f28978o = false;
    public boolean f28979p = false;
    public final float f28980q = 1.0f;
    public int v = 0;

    public nh0(qh0 qh0Var) {
        this.f28987y = qh0Var;
        this.f28967b = new zc(qh0Var);
        this.f28969e = new e6(qh0Var, 0L, 250L, tr.f31141f);
    }

    public final void a() {
        float d = this.f28969e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f28971g;
            float f7 = rectF.left;
            RectF rectF2 = this.f28970f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f28977n = false;
        if (this.f28978o) {
            this.f28979p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f28978o;
        e6 e6Var = this.f28969e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f28977n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        e11 e11Var = new e11(str, 11.0f, AndroidUtilities.bold());
        e11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        e11Var.a();
        this.f28975l = e11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        qh0 qh0Var = this.f28987y;
        if (i10 != 0) {
            kj0 kj0Var = new kj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            kj0Var.R(qh0Var);
            kj0Var.start();
            this.f28974k = kj0Var;
        } else {
            this.f28974k = null;
        }
        if (i11 != 0) {
            drawable = qh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f28972i = drawable;
        if (i12 != 0) {
            drawable2 = qh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f28973j = drawable2;
        kj0 kj0Var2 = this.f28974k;
        Rect rect = this.h;
        if (kj0Var2 != null) {
            kj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f28972i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f28973j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public nh0(qh0 qh0Var, oh0 oh0Var) {
        this.f28987y = qh0Var;
        this.f28967b = new zc(qh0Var);
        this.f28969e = new e6(qh0Var, 0L, 250L, tr.f31141f);
        d(0, oh0Var.f29360b, oh0Var.f29361c);
        c(LocaleController.getString(oh0Var.f29359a));
    }
}
