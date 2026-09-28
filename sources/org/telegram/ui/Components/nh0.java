package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class nh0 {
    public int f26766a;
    public final yc f26767b;
    public final e6 e;
    public Drawable f26771i;
    public Drawable f26772j;
    public kj0 f26773k;
    public v01 f26774l;
    public t90 f26780r;
    public boolean f26781s;
    public boolean f26782t;
    public int f26783u;
    public long f26784w;
    public int f26785x;
    public final qh0 f26786y;
    public final RectF f26768c = new RectF();
    public final RectF d = new RectF();
    public final RectF f26769f = new RectF();
    public final RectF f26770g = new RectF();
    public final Rect h = new Rect();
    public float f26775m = 1.0f;
    public boolean f26776n = false;
    public boolean f26777o = false;
    public boolean f26778p = false;
    public final float f26779q = 1.0f;
    public int v = 0;

    public nh0(qh0 qh0Var) {
        this.f26786y = qh0Var;
        this.f26767b = new yc(qh0Var);
        this.e = new e6(qh0Var, 0L, 250L, sr.f28349f);
    }

    public final void a() {
        float d = this.e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f26770g;
            float f7 = rectF.left;
            RectF rectF2 = this.f26769f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f26776n = false;
        if (this.f26777o) {
            this.f26778p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f26777o;
        e6 e6Var = this.e;
        if (z10) {
            return 1.0f - e6Var.d(1.0f, false);
        }
        if (!this.f26776n) {
            return 1.0f;
        }
        return e6Var.d(1.0f, false);
    }

    public final void c(String str) {
        v01 v01Var = new v01(str, 11.0f, AndroidUtilities.bold());
        v01Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        v01Var.a();
        this.f26774l = v01Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        qh0 qh0Var = this.f26786y;
        if (i10 != 0) {
            kj0 kj0Var = new kj0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            kj0Var.R(qh0Var);
            kj0Var.start();
            this.f26773k = kj0Var;
        } else {
            this.f26773k = null;
        }
        if (i11 != 0) {
            drawable = qh0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f26771i = drawable;
        if (i12 != 0) {
            drawable2 = qh0Var.getResources().getDrawable(i12).mutate();
        }
        this.f26772j = drawable2;
        kj0 kj0Var2 = this.f26773k;
        Rect rect = this.h;
        if (kj0Var2 != null) {
            kj0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f26771i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f26772j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public nh0(qh0 qh0Var, oh0 oh0Var) {
        this.f26786y = qh0Var;
        this.f26767b = new yc(qh0Var);
        this.e = new e6(qh0Var, 0L, 250L, sr.f28349f);
        d(0, oh0Var.f27074b, oh0Var.f27075c);
        c(LocaleController.getString(oh0Var.f27073a));
    }
}
