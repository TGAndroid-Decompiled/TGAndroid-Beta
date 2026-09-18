package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class lh0 {
    public int f26141a;
    public final yc f26142b;
    public final e6 e;
    public Drawable f26146i;
    public Drawable f26147j;
    public ij0 f26148k;
    public v01 f26149l;
    public p90 f26155r;
    public boolean f26156s;
    public boolean f26157t;
    public int f26158u;
    public long f26159w;
    public int f26160x;
    public final oh0 f26161y;
    public final RectF f26143c = new RectF();
    public final RectF d = new RectF();
    public final RectF f26144f = new RectF();
    public final RectF f26145g = new RectF();
    public final Rect h = new Rect();
    public float f26150m = 1.0f;
    public boolean f26151n = false;
    public boolean f26152o = false;
    public boolean f26153p = false;
    public final float f26154q = 1.0f;
    public int v = 0;

    public lh0(oh0 oh0Var) {
        this.f26161y = oh0Var;
        this.f26142b = new yc(oh0Var);
        this.e = new e6(oh0Var, 0L, 250L, qr.f27715f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f26145g;
            float f7 = rectF.left;
            RectF rectF2 = this.f26144f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f26151n = false;
        if (this.f26152o) {
            this.f26153p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f26152o;
        e6 e6Var = this.e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f26151n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        v01 v01Var = new v01(str, 11.0f, AndroidUtilities.bold());
        v01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        v01Var.a();
        this.f26149l = v01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        oh0 oh0Var = this.f26161y;
        if (i10 != 0) {
            ij0 ij0Var = new ij0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            ij0Var.R(oh0Var);
            ij0Var.start();
            this.f26148k = ij0Var;
        } else {
            this.f26148k = null;
        }
        if (i11 != 0) {
            drawable = oh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f26146i = drawable;
        if (i12 != 0) {
            drawable2 = oh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f26147j = drawable2;
        ij0 ij0Var2 = this.f26148k;
        Rect rect = this.h;
        if (ij0Var2 != null) {
            ij0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f26146i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f26147j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public lh0(oh0 oh0Var, mh0 mh0Var) {
        this.f26161y = oh0Var;
        this.f26142b = new yc(oh0Var);
        this.e = new e6(oh0Var, 0L, 250L, qr.f27715f);
        d(0, mh0Var.f26417b, mh0Var.f26418c);
        c(LocaleController.getString(mh0Var.f26416a));
    }
}
