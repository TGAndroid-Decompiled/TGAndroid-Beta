package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class vh0 {
    public int f31279a;
    public final yc f31280b;
    public final f6 e;
    public Drawable f31284i;
    public Drawable f31285j;
    public uj0 f31286k;
    public d11 f31287l;
    public ba0 f31293r;
    public boolean f31294s;
    public boolean f31295t;
    public int f31296u;
    public long f31297w;
    public int f31298x;
    public final yh0 f31299y;
    public final RectF f31281c = new RectF();
    public final RectF d = new RectF();
    public final RectF f31282f = new RectF();
    public final RectF f31283g = new RectF();
    public final Rect h = new Rect();
    public float f31288m = 1.0f;
    public boolean f31289n = false;
    public boolean f31290o = false;
    public boolean f31291p = false;
    public final float f31292q = 1.0f;
    public int v = 0;

    public vh0(yh0 yh0Var) {
        this.f31299y = yh0Var;
        this.f31280b = new yc(yh0Var);
        this.e = new f6(yh0Var, 0L, 250L, bs.f25030f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f31283g;
            float f7 = rectF.left;
            RectF rectF2 = this.f31282f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f31289n = false;
        if (this.f31290o) {
            this.f31291p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f31290o;
        f6 f6Var = this.e;
        if (z10) {
            return 1.0f - f6Var.d(1.0f, false);
        }
        if (!this.f31289n) {
            return 1.0f;
        }
        return f6Var.d(1.0f, false);
    }

    public final void c(String str) {
        d11 d11Var = new d11(str, 11.0f, AndroidUtilities.bold());
        d11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        d11Var.a();
        this.f31287l = d11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        yh0 yh0Var = this.f31299y;
        if (i10 != 0) {
            uj0 uj0Var = new uj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            uj0Var.R(yh0Var);
            uj0Var.start();
            this.f31286k = uj0Var;
        } else {
            this.f31286k = null;
        }
        if (i11 != 0) {
            drawable = yh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f31284i = drawable;
        if (i12 != 0) {
            drawable2 = yh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f31285j = drawable2;
        uj0 uj0Var2 = this.f31286k;
        Rect rect = this.h;
        if (uj0Var2 != null) {
            uj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f31284i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f31285j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public vh0(yh0 yh0Var, wh0 wh0Var) {
        this.f31299y = yh0Var;
        this.f31280b = new yc(yh0Var);
        this.e = new f6(yh0Var, 0L, 250L, bs.f25030f);
        d(0, wh0Var.f32126b, wh0Var.f32127c);
        c(LocaleController.getString(wh0Var.f32125a));
    }
}
