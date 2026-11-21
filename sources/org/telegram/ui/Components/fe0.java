package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class fe0 extends FrameLayout {
    public final hi.cb f35208a;
    public final hi.e f35209b;
    public final et f35210c;
    public i61 d;
    public long f35211e;
    public float f35212f;
    public hi.h3 h;
    public org.telegram.messenger.x10 f35213n;
    public Runnable f35214r;

    public fe0(Context context, org.telegram.ui.ActionBar.h6 h6Var, ca caVar) {
        super(context);
        this.f35211e = -1L;
        this.f35212f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, h6Var);
        kVar.setBackButtonImage(2131231240);
        kVar.setTitle(org.telegram.messenger.gd.N0(2131751193, null));
        kVar.G(-1, false);
        kVar.F(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 18));
        addView(kVar, c8.ma.e(-1, -2, 55));
        hi.cb cbVar = new hi.cb(context, null, null, h6Var, caVar);
        this.f35208a = cbVar;
        cbVar.Y0 = true;
        addView(cbVar, c8.ma.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        hi.e eVar = new hi.e(context, h6Var, true);
        this.f35209b = eVar;
        eVar.i(org.telegram.messenger.gd.N0(2131751194, null), false, true);
        eVar.f();
        addView(eVar, c8.ma.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        et etVar = new et(context, org.telegram.messenger.gd.N0(2131751195, null));
        this.f35210c = etVar;
        etVar.setOnClickListener(new st(this, context, h6Var, 5));
        addView(etVar, c8.ma.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        cbVar.setDelegate(new ji.l(this));
    }

    public final void a(org.telegram.messenger.ef efVar, i61 i61Var, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        hi.e eVar = this.f35209b;
        eVar.f14556a = h6Var;
        eVar.F = false;
        eVar.updateColors();
        int i10 = efVar.F;
        if (i10 > 0 && (i7 = efVar.G) > 0) {
            this.f35212f = Utilities.i(i7 / i10, 1.39f, 0.85f);
        } else {
            this.f35212f = 1.39f;
        }
        this.d = i61Var;
        long j3 = efVar.d;
        if (j3 >= 0) {
            this.f35211e = j3;
            i61Var.q0(j3, false);
        } else {
            this.f35211e = i61Var.S();
        }
        String path = i61Var.G.getPath();
        long U = i61Var.U();
        l2.f0 f0Var = i61Var.d;
        f0Var.F1();
        this.f35208a.o(false, path, U, f0Var.f19342b0);
        long U2 = i61Var.U();
        float max = 2.8f / ((float) Math.max(60L, U2));
        float max2 = (1.0f - max) * (((float) this.f35211e) / ((float) Math.max(1L, i61Var.U())));
        hi.cb cbVar = this.f35208a;
        cbVar.setVideoLeft(max2);
        cbVar.setVideoRight(max2 + max);
        cbVar.f14396a1 = 0L;
        cbVar.f14399b1 = U2;
        hi.xa xaVar = cbVar.h;
        if (xaVar != null) {
            hi.xa.a(xaVar, true);
        }
        cbVar.k();
    }

    public long getTime() {
        return this.f35211e;
    }

    public void setOnClose(Runnable runnable) {
        this.f35214r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.x10 x10Var) {
        this.f35213n = x10Var;
    }
}
