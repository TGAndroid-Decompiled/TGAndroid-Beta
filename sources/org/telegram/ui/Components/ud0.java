package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ud0 extends FrameLayout {
    public final fi.fb f38624a;
    public final fi.d f38625b;
    public final os f38626c;
    public t51 d;
    public long f38627e;
    public float f38628f;
    public fi.j3 h;
    public org.telegram.messenger.c20 f38629n;
    public Runnable f38630r;

    public ud0(Context context, org.telegram.ui.ActionBar.h6 h6Var, x9 x9Var) {
        super(context);
        this.f38627e = -1L;
        this.f38628f = 1.39f;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, h6Var);
        lVar.setBackButtonImage(2131231240);
        lVar.setTitle(org.telegram.messenger.id.M0(2131751205, null));
        lVar.G(-1, false);
        lVar.E(587202559, false);
        lVar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 15));
        addView(lVar, c8.ha.e(-1, -2, 55));
        fi.fb fbVar = new fi.fb(context, null, null, h6Var, x9Var);
        this.f38624a = fbVar;
        fbVar.X0 = true;
        addView(fbVar, c8.ha.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        fi.d dVar = new fi.d(context, h6Var, true);
        this.f38625b = dVar;
        dVar.i(org.telegram.messenger.id.M0(2131751206, null), false, true);
        dVar.f();
        addView(dVar, c8.ha.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        os osVar = new os(context, org.telegram.messenger.id.M0(2131751207, null));
        this.f38626c = osVar;
        osVar.setOnClickListener(new td0(this, context, h6Var, 0));
        addView(osVar, c8.ha.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        fbVar.setDelegate(new j2.n(this));
    }

    public final void a(org.telegram.messenger.gf gfVar, t51 t51Var, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        fi.d dVar = this.f38625b;
        dVar.f11751a = h6Var;
        dVar.E = false;
        dVar.updateColors();
        int i10 = gfVar.F;
        if (i10 > 0 && (i7 = gfVar.G) > 0) {
            this.f38628f = Utilities.i(i7 / i10, 1.39f, 0.85f);
        } else {
            this.f38628f = 1.39f;
        }
        this.d = t51Var;
        long j3 = gfVar.d;
        if (j3 >= 0) {
            this.f38627e = j3;
            t51Var.q0(j3, false);
        } else {
            this.f38627e = t51Var.S();
        }
        String path = t51Var.F.getPath();
        long U = t51Var.U();
        l2.i0 i0Var = t51Var.d;
        i0Var.F1();
        this.f38624a.o(false, path, U, i0Var.f17855b0);
        long U2 = t51Var.U();
        float max = 2.8f / ((float) Math.max(60L, U2));
        float max2 = (1.0f - max) * (((float) this.f38627e) / ((float) Math.max(1L, t51Var.U())));
        fi.fb fbVar = this.f38624a;
        fbVar.setVideoLeft(max2);
        fbVar.setVideoRight(max2 + max);
        fbVar.Z0 = 0L;
        fbVar.f11999a1 = U2;
        fi.ab abVar = fbVar.h;
        if (abVar != null) {
            fi.ab.a(abVar, true);
        }
        fbVar.k();
    }

    public long getTime() {
        return this.f38627e;
    }

    public void setOnClose(Runnable runnable) {
        this.f38630r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.c20 c20Var) {
        this.f38629n = c20Var;
    }
}
