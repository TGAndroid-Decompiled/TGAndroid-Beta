package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class wh0 {
    public int f32106a;
    public final yc f32107b;
    public final f6 e;
    public Drawable f32111i;
    public Drawable f32112j;
    public vj0 f32113k;
    public f11 f32114l;
    public ba0 f32120r;
    public boolean f32121s;
    public boolean f32122t;
    public int f32123u;
    public long f32124w;
    public int f32125x;
    public final zh0 f32126y;
    public final RectF f32108c = new RectF();
    public final RectF d = new RectF();
    public final RectF f32109f = new RectF();
    public final RectF f32110g = new RectF();
    public final Rect h = new Rect();
    public float f32115m = 1.0f;
    public boolean f32116n = false;
    public boolean f32117o = false;
    public boolean f32118p = false;
    public final float f32119q = 1.0f;
    public int v = 0;

    public wh0(zh0 zh0Var) {
        this.f32126y = zh0Var;
        this.f32107b = new yc(zh0Var);
        this.e = new f6(zh0Var, 0L, 250L, bs.f25021f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f32110g;
            float f7 = rectF.left;
            RectF rectF2 = this.f32109f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f32116n = false;
        if (this.f32117o) {
            this.f32118p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f32117o;
        f6 f6Var = this.e;
        if (z10) {
            return 1.0f - f6Var.d(1.0f, false);
        }
        if (!this.f32116n) {
            return 1.0f;
        }
        return f6Var.d(1.0f, false);
    }

    public final void c(String str) {
        f11 f11Var = new f11(str, 11.0f, AndroidUtilities.bold());
        f11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f11Var.a();
        this.f32114l = f11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        zh0 zh0Var = this.f32126y;
        if (i10 != 0) {
            vj0 vj0Var = new vj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            vj0Var.R(zh0Var);
            vj0Var.start();
            this.f32113k = vj0Var;
        } else {
            this.f32113k = null;
        }
        if (i11 != 0) {
            drawable = zh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f32111i = drawable;
        if (i12 != 0) {
            drawable2 = zh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f32112j = drawable2;
        vj0 vj0Var2 = this.f32113k;
        Rect rect = this.h;
        if (vj0Var2 != null) {
            vj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f32111i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f32112j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public wh0(zh0 zh0Var, xh0 xh0Var) {
        this.f32126y = zh0Var;
        this.f32107b = new yc(zh0Var);
        this.e = new f6(zh0Var, 0L, 250L, bs.f25021f);
        d(0, xh0Var.f32431b, xh0Var.f32432c);
        c(LocaleController.getString(xh0Var.f32430a));
    }
}
