package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class kh0 {
    public int f25779a;
    public final yc f25780b;
    public final d6 e;
    public Drawable f25784i;
    public Drawable f25785j;
    public hj0 f25786k;
    public u01 f25787l;
    public o90 f25793r;
    public boolean f25794s;
    public boolean f25795t;
    public int f25796u;
    public long f25797w;
    public int f25798x;
    public final nh0 f25799y;
    public final RectF f25781c = new RectF();
    public final RectF d = new RectF();
    public final RectF f25782f = new RectF();
    public final RectF f25783g = new RectF();
    public final Rect h = new Rect();
    public float f25788m = 1.0f;
    public boolean f25789n = false;
    public boolean f25790o = false;
    public boolean f25791p = false;
    public final float f25792q = 1.0f;
    public int v = 0;

    public kh0(nh0 nh0Var) {
        this.f25799y = nh0Var;
        this.f25780b = new yc(nh0Var);
        this.e = new d6(nh0Var, 0L, 250L, qr.f27642f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f25783g;
            float f7 = rectF.left;
            RectF rectF2 = this.f25782f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f25789n = false;
        if (this.f25790o) {
            this.f25791p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f25790o;
        d6 d6Var = this.e;
        if (z10) {
            return 1.0f - d6Var.d(1.0f, false);
        }
        if (!this.f25789n) {
            return 1.0f;
        }
        return d6Var.d(1.0f, false);
    }

    public final void c(String str) {
        u01 u01Var = new u01(str, 11.0f, AndroidUtilities.bold());
        u01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        u01Var.a();
        this.f25787l = u01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        nh0 nh0Var = this.f25799y;
        if (i10 != 0) {
            hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            hj0Var.R(nh0Var);
            hj0Var.start();
            this.f25786k = hj0Var;
        } else {
            this.f25786k = null;
        }
        if (i11 != 0) {
            drawable = nh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f25784i = drawable;
        if (i12 != 0) {
            drawable2 = nh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f25785j = drawable2;
        hj0 hj0Var2 = this.f25786k;
        Rect rect = this.h;
        if (hj0Var2 != null) {
            hj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f25784i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f25785j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public kh0(nh0 nh0Var, lh0 lh0Var) {
        this.f25799y = nh0Var;
        this.f25780b = new yc(nh0Var);
        this.e = new d6(nh0Var, 0L, 250L, qr.f27642f);
        d(0, lh0Var.f26139b, lh0Var.f26140c);
        c(LocaleController.getString(lh0Var.f26138a));
    }
}
