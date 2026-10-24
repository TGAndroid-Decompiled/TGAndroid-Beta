package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class yh0 {
    public int f32916a;
    public final wc f32917b;
    public final d6 e;
    public Drawable f32921i;
    public Drawable f32922j;
    public xj0 f32923k;
    public h11 f32924l;
    public aa0 f32930r;
    public boolean f32931s;
    public boolean f32932t;
    public int f32933u;
    public long f32934w;
    public int f32935x;
    public final bi0 f32936y;
    public final RectF f32918c = new RectF();
    public final RectF d = new RectF();
    public final RectF f32919f = new RectF();
    public final RectF f32920g = new RectF();
    public final Rect h = new Rect();
    public float f32925m = 1.0f;
    public boolean f32926n = false;
    public boolean f32927o = false;
    public boolean f32928p = false;
    public final float f32929q = 1.0f;
    public int v = 0;

    public yh0(bi0 bi0Var) {
        this.f32936y = bi0Var;
        this.f32917b = new wc(bi0Var);
        this.e = new d6(bi0Var, 0L, 250L, zr.f33337f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f32920g;
            float f7 = rectF.left;
            RectF rectF2 = this.f32919f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f32926n = false;
        if (this.f32927o) {
            this.f32928p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f32927o;
        d6 d6Var = this.e;
        if (z10) {
            return 1.0f - d6Var.d(1.0f, false);
        }
        if (!this.f32926n) {
            return 1.0f;
        }
        return d6Var.d(1.0f, false);
    }

    public final void c(String str) {
        h11 h11Var = new h11(str, 11.0f, AndroidUtilities.bold());
        h11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        h11Var.a();
        this.f32924l = h11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        bi0 bi0Var = this.f32936y;
        if (i10 != 0) {
            xj0 xj0Var = new xj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            xj0Var.R(bi0Var);
            xj0Var.start();
            this.f32923k = xj0Var;
        } else {
            this.f32923k = null;
        }
        if (i11 != 0) {
            drawable = bi0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f32921i = drawable;
        if (i12 != 0) {
            drawable2 = bi0Var.getResources().getDrawable(i12).mutate();
        }
        this.f32922j = drawable2;
        xj0 xj0Var2 = this.f32923k;
        Rect rect = this.h;
        if (xj0Var2 != null) {
            xj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f32921i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f32922j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public yh0(bi0 bi0Var, zh0 zh0Var) {
        this.f32936y = bi0Var;
        this.f32917b = new wc(bi0Var);
        this.e = new d6(bi0Var, 0L, 250L, zr.f33337f);
        d(0, zh0Var.f33272b, zh0Var.f33273c);
        c(LocaleController.getString(zh0Var.f33271a));
    }
}
