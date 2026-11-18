package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ee0 extends FrameLayout {
    public final hi.db f34681a;
    public final hi.d f34682b;
    public final ct f34683c;
    public f61 d;
    public long f34684e;
    public float f34685f;
    public hi.i3 h;
    public org.telegram.messenger.x10 f34686n;
    public Runnable f34687r;

    public ee0(Context context, org.telegram.ui.ActionBar.i6 i6Var, ca caVar) {
        super(context);
        this.f34684e = -1L;
        this.f34685f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, i6Var);
        kVar.setBackButtonImage(2131231240);
        kVar.setTitle(org.telegram.messenger.gd.M0(2131751194, null));
        kVar.I(-1, false);
        kVar.G(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 18));
        addView(kVar, c8.ma.e(-1, -2, 55));
        hi.db dbVar = new hi.db(context, null, null, i6Var, caVar);
        this.f34681a = dbVar;
        dbVar.Y0 = true;
        addView(dbVar, c8.ma.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        hi.d dVar = new hi.d(context, i6Var, true);
        this.f34682b = dVar;
        dVar.i(org.telegram.messenger.gd.M0(2131751195, null), false, true);
        dVar.f();
        addView(dVar, c8.ma.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        ct ctVar = new ct(context, org.telegram.messenger.gd.M0(2131751196, null));
        this.f34683c = ctVar;
        ctVar.setOnClickListener(new qt(this, context, i6Var, 5));
        addView(ctVar, c8.ma.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        dbVar.setDelegate(new ji.j(this));
    }

    public final void a(org.telegram.messenger.ef efVar, f61 f61Var, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        hi.d dVar = this.f34682b;
        dVar.f14334a = i6Var;
        dVar.F = false;
        dVar.updateColors();
        int i10 = efVar.F;
        if (i10 > 0 && (i7 = efVar.G) > 0) {
            this.f34685f = Utilities.i(i7 / i10, 1.39f, 0.85f);
        } else {
            this.f34685f = 1.39f;
        }
        this.d = f61Var;
        long j3 = efVar.d;
        if (j3 >= 0) {
            this.f34684e = j3;
            f61Var.q0(j3, false);
        } else {
            this.f34684e = f61Var.S();
        }
        String path = f61Var.G.getPath();
        long U = f61Var.U();
        l2.f0 f0Var = f61Var.d;
        f0Var.F1();
        this.f34681a.o(false, path, U, f0Var.f19317b0);
        long U2 = f61Var.U();
        float max = 2.8f / ((float) Math.max(60L, U2));
        float max2 = (1.0f - max) * (((float) this.f34684e) / ((float) Math.max(1L, f61Var.U())));
        hi.db dbVar = this.f34681a;
        dbVar.setVideoLeft(max2);
        dbVar.setVideoRight(max2 + max);
        dbVar.f14449a1 = 0L;
        dbVar.f14452b1 = U2;
        hi.ya yaVar = dbVar.h;
        if (yaVar != null) {
            hi.ya.a(yaVar, true);
        }
        dbVar.k();
    }

    public long getTime() {
        return this.f34684e;
    }

    public void setOnClose(Runnable runnable) {
        this.f34687r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.x10 x10Var) {
        this.f34686n = x10Var;
    }
}
