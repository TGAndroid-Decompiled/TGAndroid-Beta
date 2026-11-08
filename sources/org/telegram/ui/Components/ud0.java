package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ud0 extends FrameLayout {
    public final fi.fb f38613a;
    public final fi.d f38614b;
    public final ps f38615c;
    public t51 d;
    public long f38616e;
    public float f38617f;
    public fi.j3 h;
    public org.telegram.messenger.c20 f38618n;
    public Runnable f38619r;

    public ud0(Context context, org.telegram.ui.ActionBar.f6 f6Var, y9 y9Var) {
        super(context);
        this.f38616e = -1L;
        this.f38617f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        kVar.setBackButtonImage(2131231240);
        kVar.setTitle(org.telegram.messenger.id.M0(2131751206, null));
        kVar.D(-1, false);
        kVar.C(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 15));
        addView(kVar, c8.ha.e(-1, -2, 55));
        fi.fb fbVar = new fi.fb(context, null, null, f6Var, y9Var);
        this.f38613a = fbVar;
        fbVar.X0 = true;
        addView(fbVar, c8.ha.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        fi.d dVar = new fi.d(context, f6Var, true);
        this.f38614b = dVar;
        dVar.i(org.telegram.messenger.id.M0(2131751207, null), false, true);
        dVar.f();
        addView(dVar, c8.ha.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        ps psVar = new ps(context, org.telegram.messenger.id.M0(2131751208, null));
        this.f38615c = psVar;
        psVar.setOnClickListener(new td0(this, context, f6Var, 0));
        addView(psVar, c8.ha.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        fbVar.setDelegate(new j2.n(this));
    }

    public final void a(org.telegram.messenger.gf gfVar, t51 t51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i7;
        fi.d dVar = this.f38614b;
        dVar.f11747a = f6Var;
        dVar.E = false;
        dVar.updateColors();
        int i10 = gfVar.F;
        if (i10 > 0 && (i7 = gfVar.G) > 0) {
            this.f38617f = Utilities.i(i7 / i10, 1.39f, 0.85f);
        } else {
            this.f38617f = 1.39f;
        }
        this.d = t51Var;
        long j3 = gfVar.d;
        if (j3 >= 0) {
            this.f38616e = j3;
            t51Var.q0(j3, false);
        } else {
            this.f38616e = t51Var.S();
        }
        String path = t51Var.F.getPath();
        long U = t51Var.U();
        l2.i0 i0Var = t51Var.d;
        i0Var.F1();
        this.f38613a.o(false, path, U, i0Var.f17854b0);
        long U2 = t51Var.U();
        float max = 2.8f / ((float) Math.max(60L, U2));
        float max2 = (1.0f - max) * (((float) this.f38616e) / ((float) Math.max(1L, t51Var.U())));
        fi.fb fbVar = this.f38613a;
        fbVar.setVideoLeft(max2);
        fbVar.setVideoRight(max2 + max);
        fbVar.Z0 = 0L;
        fbVar.f11995a1 = U2;
        fi.ab abVar = fbVar.h;
        if (abVar != null) {
            fi.ab.a(abVar, true);
        }
        fbVar.k();
    }

    public long getTime() {
        return this.f38616e;
    }

    public void setOnClose(Runnable runnable) {
        this.f38619r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.c20 c20Var) {
        this.f38618n = c20Var;
    }
}
