package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class vd0 extends FrameLayout {
    public final fi.fb f39039a;
    public final fi.d f39040b;
    public final ps f39041c;
    public u51 d;
    public long f39042e;
    public float f39043f;
    public fi.j3 h;
    public org.telegram.messenger.c20 f39044n;
    public Runnable f39045r;

    public vd0(Context context, org.telegram.ui.ActionBar.g6 g6Var, y9 y9Var) {
        super(context);
        this.f39042e = -1L;
        this.f39043f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        kVar.setBackButtonImage(2131231240);
        kVar.setTitle(org.telegram.messenger.id.M0(2131751205, null));
        kVar.E(-1, false);
        kVar.D(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 15));
        addView(kVar, c8.ha.e(-1, -2, 55));
        fi.fb fbVar = new fi.fb(context, null, null, g6Var, y9Var);
        this.f39039a = fbVar;
        fbVar.X0 = true;
        addView(fbVar, c8.ha.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        fi.d dVar = new fi.d(context, g6Var, true);
        this.f39040b = dVar;
        dVar.i(org.telegram.messenger.id.M0(2131751206, null), false, true);
        dVar.f();
        addView(dVar, c8.ha.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        ps psVar = new ps(context, org.telegram.messenger.id.M0(2131751207, null));
        this.f39041c = psVar;
        psVar.setOnClickListener(new ud0(this, context, g6Var, 0));
        addView(psVar, c8.ha.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        fbVar.setDelegate(new j2.n(this));
    }

    public final void a(org.telegram.messenger.gf gfVar, u51 u51Var, org.telegram.ui.ActionBar.g6 g6Var) {
        int i7;
        fi.d dVar = this.f39040b;
        dVar.f11747a = g6Var;
        dVar.E = false;
        dVar.updateColors();
        int i10 = gfVar.F;
        if (i10 > 0 && (i7 = gfVar.G) > 0) {
            this.f39043f = Utilities.i(i7 / i10, 1.39f, 0.85f);
        } else {
            this.f39043f = 1.39f;
        }
        this.d = u51Var;
        long j3 = gfVar.d;
        if (j3 >= 0) {
            this.f39042e = j3;
            u51Var.q0(j3, false);
        } else {
            this.f39042e = u51Var.S();
        }
        String path = u51Var.F.getPath();
        long U = u51Var.U();
        l2.i0 i0Var = u51Var.d;
        i0Var.F1();
        this.f39039a.o(false, path, U, i0Var.f17852b0);
        long U2 = u51Var.U();
        float max = 2.8f / ((float) Math.max(60L, U2));
        float max2 = (1.0f - max) * (((float) this.f39042e) / ((float) Math.max(1L, u51Var.U())));
        fi.fb fbVar = this.f39039a;
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
        return this.f39042e;
    }

    public void setOnClose(Runnable runnable) {
        this.f39045r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.c20 c20Var) {
        this.f39044n = c20Var;
    }
}
