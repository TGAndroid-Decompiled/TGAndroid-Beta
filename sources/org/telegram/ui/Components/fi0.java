package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class fi0 {
    public int f26373a;
    public final bd f26374b;
    public final g6 f26376e;
    public Drawable f26379i;
    public Drawable f26380j;
    public ck0 f26381k;
    public l11 f26382l;
    public ia0 f26388r;
    public boolean f26389s;
    public boolean f26390t;
    public int f26391u;
    public long f26392w;
    public int f26393x;
    public final ii0 f26394y;
    public final RectF f26375c = new RectF();
    public final RectF d = new RectF();
    public final RectF f26377f = new RectF();
    public final RectF f26378g = new RectF();
    public final Rect h = new Rect();
    public float f26383m = 1.0f;
    public boolean f26384n = false;
    public boolean f26385o = false;
    public boolean f26386p = false;
    public final float f26387q = 1.0f;
    public int v = 0;

    public fi0(ii0 ii0Var) {
        this.f26394y = ii0Var;
        this.f26374b = new bd(ii0Var);
        this.f26376e = new g6(ii0Var, 0L, 250L, hs.f27118f);
    }

    public final void a() {
        float d = this.f26376e.d(1.0f, false);
        if (d != 1.0f) {
            RectF rectF = this.f26378g;
            float f7 = rectF.left;
            RectF rectF2 = this.f26377f;
            float lerp = AndroidUtilities.lerp(f7, rectF2.left, d);
            RectF rectF3 = this.d;
            rectF3.left = lerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, d);
            return;
        }
        this.f26384n = false;
        if (this.f26385o) {
            this.f26386p = true;
        }
    }

    public final float b() {
        boolean z10 = this.f26385o;
        g6 g6Var = this.f26376e;
        if (z10) {
            return 1.0f - g6Var.d(1.0f, false);
        }
        if (!this.f26384n) {
            return 1.0f;
        }
        return g6Var.d(1.0f, false);
    }

    public final void c(String str) {
        l11 l11Var = new l11(str, 11.0f, AndroidUtilities.bold());
        l11Var.n(3);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        l11Var.a();
        this.f26382l = l11Var;
    }

    public final void d(int i10, int i11, int i12) {
        Drawable drawable;
        Drawable drawable2 = null;
        ii0 ii0Var = this.f26394y;
        if (i10 != 0) {
            ck0 ck0Var = new ck0(i10, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
            ck0Var.R(ii0Var);
            ck0Var.start();
            this.f26381k = ck0Var;
        } else {
            this.f26381k = null;
        }
        if (i11 != 0) {
            drawable = ii0Var.getResources().getDrawable(i11).mutate();
        } else {
            drawable = null;
        }
        this.f26379i = drawable;
        if (i12 != 0) {
            drawable2 = ii0Var.getResources().getDrawable(i12).mutate();
        }
        this.f26380j = drawable2;
        ck0 ck0Var2 = this.f26381k;
        Rect rect = this.h;
        if (ck0Var2 != null) {
            ck0Var2.setBounds(rect);
        }
        Drawable drawable3 = this.f26379i;
        if (drawable3 != null) {
            drawable3.setBounds(rect);
        }
        Drawable drawable4 = this.f26380j;
        if (drawable4 != null) {
            drawable4.setBounds(rect);
        }
    }

    public fi0(ii0 ii0Var, gi0 gi0Var) {
        this.f26394y = ii0Var;
        this.f26374b = new bd(ii0Var);
        this.f26376e = new g6(ii0Var, 0L, 250L, hs.f27118f);
        d(0, gi0Var.f26733b, gi0Var.f26734c);
        c(LocaleController.getString(gi0Var.f26732a));
    }
}
