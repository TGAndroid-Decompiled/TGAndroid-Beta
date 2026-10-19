package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class vh0 {
    public int f31290a;
    public final yc f31291b;
    public final f6 e;
    public Drawable f31295i;
    public Drawable f31296j;
    public uj0 f31297k;
    public e11 f31298l;
    public ba0 f31304r;
    public boolean f31305s;
    public boolean f31306t;
    public int f31307u;
    public long f31308w;
    public int f31309x;
    public final yh0 f31310y;
    public final RectF f31292c = new RectF();
    public final RectF d = new RectF();
    public final RectF f31293f = new RectF();
    public final RectF f31294g = new RectF();
    public final Rect h = new Rect();
    public float f31299m = 1.0f;
    public boolean f31300n = false;
    public boolean f31301o = false;
    public boolean f31302p = false;
    public final float f31303q = 1.0f;
    public int v = 0;

    public vh0(yh0 yh0Var) {
        this.f31310y = yh0Var;
        this.f31291b = new yc(yh0Var);
        this.e = new f6(yh0Var, 0L, 250L, bs.f25014f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f31294g;
            float f7 = rectF.left;
            RectF rectF2 = this.f31293f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f31300n = false;
        if (this.f31301o) {
            this.f31302p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f31301o;
        f6 f6Var = this.e;
        if (z10) {
            return 1.0f - f6Var.d(1.0f, false);
        }
        if (!this.f31300n) {
            return 1.0f;
        }
        return f6Var.d(1.0f, false);
    }

    public final void c(String str) {
        e11 e11Var = new e11(str, 11.0f, AndroidUtilities.bold());
        e11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        e11Var.a();
        this.f31298l = e11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        yh0 yh0Var = this.f31310y;
        if (i10 != 0) {
            uj0 uj0Var = new uj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            uj0Var.R(yh0Var);
            uj0Var.start();
            this.f31297k = uj0Var;
        } else {
            this.f31297k = null;
        }
        if (i11 != 0) {
            drawable = yh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f31295i = drawable;
        if (i12 != 0) {
            drawable2 = yh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f31296j = drawable2;
        uj0 uj0Var2 = this.f31297k;
        Rect rect = this.h;
        if (uj0Var2 != null) {
            uj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f31295i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f31296j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public vh0(yh0 yh0Var, wh0 wh0Var) {
        this.f31310y = yh0Var;
        this.f31291b = new yc(yh0Var);
        this.e = new f6(yh0Var, 0L, 250L, bs.f25014f);
        d(0, wh0Var.f32125b, wh0Var.f32126c);
        c(LocaleController.getString(wh0Var.f32124a));
    }
}
