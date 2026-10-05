package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class nh0 {
    public int f29060a;
    public final zc f29061b;
    public final e6 f29063e;
    public Drawable f29066i;
    public Drawable f29067j;
    public kj0 f29068k;
    public f11 f29069l;
    public u90 f29075r;
    public boolean f29076s;
    public boolean f29077t;
    public int f29078u;
    public long f29079w;
    public int f29080x;
    public final qh0 f29081y;
    public final RectF f29062c = new RectF();
    public final RectF d = new RectF();
    public final RectF f29064f = new RectF();
    public final RectF f29065g = new RectF();
    public final Rect h = new Rect();
    public float f29070m = 1.0f;
    public boolean f29071n = false;
    public boolean f29072o = false;
    public boolean f29073p = false;
    public final float f29074q = 1.0f;
    public int v = 0;

    public nh0(qh0 qh0Var) {
        this.f29081y = qh0Var;
        this.f29061b = new zc(qh0Var);
        this.f29063e = new e6(qh0Var, 0L, 250L, tr.f31215f);
    }

    public final void a() {
        float d = this.f29063e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f29065g;
            float f7 = rectF.left;
            RectF rectF2 = this.f29064f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f29071n = false;
        if (this.f29072o) {
            this.f29073p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f29072o;
        e6 e6Var = this.f29063e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f29071n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        f11 f11Var = new f11(str, 11.0f, AndroidUtilities.bold());
        f11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f11Var.a();
        this.f29069l = f11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        qh0 qh0Var = this.f29081y;
        if (i10 != 0) {
            kj0 kj0Var = new kj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            kj0Var.R(qh0Var);
            kj0Var.start();
            this.f29068k = kj0Var;
        } else {
            this.f29068k = null;
        }
        if (i11 != 0) {
            drawable = qh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f29066i = drawable;
        if (i12 != 0) {
            drawable2 = qh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f29067j = drawable2;
        kj0 kj0Var2 = this.f29068k;
        Rect rect = this.h;
        if (kj0Var2 != null) {
            kj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f29066i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f29067j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public nh0(qh0 qh0Var, oh0 oh0Var) {
        this.f29081y = qh0Var;
        this.f29061b = new zc(qh0Var);
        this.f29063e = new e6(qh0Var, 0L, 250L, tr.f31215f);
        d(0, oh0Var.f29465b, oh0Var.f29466c);
        c(LocaleController.getString(oh0Var.f29464a));
    }
}
