package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ee0 extends FrameLayout {
    public final hi.xb f34695a;
    public final hi.e f34696b;
    public final ct f34697c;
    public h61 d;
    public long f34698e;
    public float f34699f;
    public hi.q3 h;
    public org.telegram.messenger.w10 f34700n;
    public Runnable f34701r;

    public ee0(Context context, org.telegram.ui.ActionBar.i6 i6Var, ba baVar) {
        super(context);
        this.f34698e = -1L;
        this.f34699f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, i6Var);
        kVar.setBackButtonImage(2131231243);
        kVar.setTitle(org.telegram.messenger.gd.N0(2131751193, null));
        kVar.F(-1, false);
        kVar.E(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.y7(this, 18));
        addView(kVar, c8.na.e(-1, -2, 55));
        hi.xb xbVar = new hi.xb(context, null, null, i6Var, baVar);
        this.f34695a = xbVar;
        xbVar.Y0 = true;
        addView(xbVar, c8.na.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        hi.e eVar = new hi.e(context, i6Var, true);
        this.f34696b = eVar;
        eVar.i(org.telegram.messenger.gd.N0(2131751194, null), false, true);
        eVar.f();
        addView(eVar, c8.na.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        ct ctVar = new ct(context, org.telegram.messenger.gd.N0(2131751195, null));
        this.f34697c = ctVar;
        ctVar.setOnClickListener(new qt(this, context, i6Var, 5));
        addView(ctVar, c8.na.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        xbVar.setDelegate(new j6.k(this));
    }

    public final void a(org.telegram.messenger.ef efVar, h61 h61Var, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        hi.e eVar = this.f34696b;
        eVar.f14332a = i6Var;
        eVar.F = false;
        eVar.updateColors();
        int i10 = efVar.F;
        if (i10 > 0 && (i7 = efVar.G) > 0) {
            this.f34699f = Utilities.i(i7 / i10, 1.39f, 0.85f);
        } else {
            this.f34699f = 1.39f;
        }
        this.d = h61Var;
        long j3 = efVar.d;
        if (j3 >= 0) {
            this.f34698e = j3;
            h61Var.q0(j3, false);
        } else {
            this.f34698e = h61Var.S();
        }
        String path = h61Var.G.getPath();
        long U = h61Var.U();
        l2.g0 g0Var = h61Var.d;
        g0Var.F1();
        this.f34695a.o(false, path, U, g0Var.f19415b0);
        long U2 = h61Var.U();
        float max = 2.8f / ((float) Math.max(60L, U2));
        float max2 = (1.0f - max) * (((float) this.f34698e) / ((float) Math.max(1L, h61Var.U())));
        hi.xb xbVar = this.f34695a;
        xbVar.setVideoLeft(max2);
        xbVar.setVideoRight(max2 + max);
        xbVar.f15794a1 = 0L;
        xbVar.f15797b1 = U2;
        hi.sb sbVar = xbVar.h;
        if (sbVar != null) {
            hi.sb.a(sbVar, true);
        }
        xbVar.k();
    }

    public long getTime() {
        return this.f34698e;
    }

    public void setOnClose(Runnable runnable) {
        this.f34701r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.w10 w10Var) {
        this.f34700n = w10Var;
    }
}
