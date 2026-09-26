package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class lh0 {
    public int f26095a;
    public final yc f26096b;
    public final e6 e;
    public Drawable f26100i;
    public Drawable f26101j;
    public ij0 f26102k;
    public t01 f26103l;
    public r90 f26109r;
    public boolean f26110s;
    public boolean f26111t;
    public int f26112u;
    public long f26113w;
    public int f26114x;
    public final oh0 f26115y;
    public final RectF f26097c = new RectF();
    public final RectF d = new RectF();
    public final RectF f26098f = new RectF();
    public final RectF f26099g = new RectF();
    public final Rect h = new Rect();
    public float f26104m = 1.0f;
    public boolean f26105n = false;
    public boolean f26106o = false;
    public boolean f26107p = false;
    public final float f26108q = 1.0f;
    public int v = 0;

    public lh0(oh0 oh0Var) {
        this.f26115y = oh0Var;
        this.f26096b = new yc(oh0Var);
        this.e = new e6(oh0Var, 0L, 250L, rr.f28030f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f26099g;
            float f7 = rectF.left;
            RectF rectF2 = this.f26098f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f26105n = false;
        if (this.f26106o) {
            this.f26107p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f26106o;
        e6 e6Var = this.e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f26105n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        t01 t01Var = new t01(str, 11.0f, AndroidUtilities.bold());
        t01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        t01Var.a();
        this.f26103l = t01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        oh0 oh0Var = this.f26115y;
        if (i10 != 0) {
            ij0 ij0Var = new ij0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            ij0Var.R(oh0Var);
            ij0Var.start();
            this.f26102k = ij0Var;
        } else {
            this.f26102k = null;
        }
        if (i11 != 0) {
            drawable = oh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f26100i = drawable;
        if (i12 != 0) {
            drawable2 = oh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f26101j = drawable2;
        ij0 ij0Var2 = this.f26102k;
        Rect rect = this.h;
        if (ij0Var2 != null) {
            ij0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f26100i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f26101j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public lh0(oh0 oh0Var, mh0 mh0Var) {
        this.f26115y = oh0Var;
        this.f26096b = new yc(oh0Var);
        this.e = new e6(oh0Var, 0L, 250L, rr.f28030f);
        d(0, mh0Var.f26500b, mh0Var.f26501c);
        c(LocaleController.getString(mh0Var.f26499a));
    }
}
