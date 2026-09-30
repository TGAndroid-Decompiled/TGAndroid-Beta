package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class oh0 {
    public int f27082a;
    public final zc f27083b;
    public final e6 e;
    public Drawable f27087i;
    public Drawable f27088j;
    public lj0 f27089k;
    public w01 f27090l;
    public u90 f27096r;
    public boolean f27097s;
    public boolean f27098t;
    public int f27099u;
    public long f27100w;
    public int f27101x;
    public final rh0 f27102y;
    public final RectF f27084c = new RectF();
    public final RectF d = new RectF();
    public final RectF f27085f = new RectF();
    public final RectF f27086g = new RectF();
    public final Rect h = new Rect();
    public float f27091m = 1.0f;
    public boolean f27092n = false;
    public boolean f27093o = false;
    public boolean f27094p = false;
    public final float f27095q = 1.0f;
    public int v = 0;

    public oh0(rh0 rh0Var) {
        this.f27102y = rh0Var;
        this.f27083b = new zc(rh0Var);
        this.e = new e6(rh0Var, 0L, 250L, tr.f28636f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f27086g;
            float f7 = rectF.left;
            RectF rectF2 = this.f27085f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f27092n = false;
        if (this.f27093o) {
            this.f27094p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f27093o;
        e6 e6Var = this.e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f27092n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        w01 w01Var = new w01(str, 11.0f, AndroidUtilities.bold());
        w01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        w01Var.a();
        this.f27090l = w01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        rh0 rh0Var = this.f27102y;
        if (i10 != 0) {
            lj0 lj0Var = new lj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            lj0Var.R(rh0Var);
            lj0Var.start();
            this.f27089k = lj0Var;
        } else {
            this.f27089k = null;
        }
        if (i11 != 0) {
            drawable = rh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f27087i = drawable;
        if (i12 != 0) {
            drawable2 = rh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f27088j = drawable2;
        lj0 lj0Var2 = this.f27089k;
        Rect rect = this.h;
        if (lj0Var2 != null) {
            lj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f27087i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f27088j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public oh0(rh0 rh0Var, ph0 ph0Var) {
        this.f27102y = rh0Var;
        this.f27083b = new zc(rh0Var);
        this.e = new e6(rh0Var, 0L, 250L, tr.f28636f);
        d(0, ph0Var.f27359b, ph0Var.f27360c);
        c(LocaleController.getString(ph0Var.f27358a));
    }
}
