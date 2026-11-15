package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class ud0 extends FrameLayout {
    public final hi.cb f39999a;
    public final hi.d f40000b;
    public final ws f40001c;
    public u51 d;
    public long f40002e;
    public float f40003f;
    public hi.h3 h;
    public org.telegram.messenger.z10 f40004n;
    public Runnable f40005r;

    public ud0(Context context, org.telegram.ui.ActionBar.e6 e6Var, u9 u9Var) {
        super(context);
        this.f40002e = -1L;
        this.f40003f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        kVar.setBackButtonImage(2131231240);
        kVar.setTitle(org.telegram.messenger.hd.M0(2131751205, null));
        kVar.H(-1, false);
        kVar.F(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.p9(this, 16));
        addView(kVar, c8.ja.e(-1, -2, 55));
        hi.cb cbVar = new hi.cb(context, null, null, e6Var, u9Var);
        this.f39999a = cbVar;
        cbVar.Y0 = true;
        addView(cbVar, c8.ja.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        hi.d dVar = new hi.d(context, e6Var, true);
        this.f40000b = dVar;
        dVar.i(org.telegram.messenger.hd.M0(2131751206, null), false, true);
        dVar.f();
        addView(dVar, c8.ja.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        ws wsVar = new ws(context, org.telegram.messenger.hd.M0(2131751207, null));
        this.f40001c = wsVar;
        wsVar.setOnClickListener(new lt(this, context, e6Var, 5));
        addView(wsVar, c8.ja.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        cbVar.setDelegate(new ji.j(this));
    }

    public final void a(org.telegram.messenger.ff ffVar, u51 u51Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i7;
        hi.d dVar = this.f40000b;
        dVar.f14050a = e6Var;
        dVar.F = false;
        dVar.updateColors();
        int i10 = ffVar.F;
        if (i10 > 0 && (i7 = ffVar.G) > 0) {
            this.f40003f = Utilities.i(i7 / i10, 1.39f, 0.85f);
        } else {
            this.f40003f = 1.39f;
        }
        this.d = u51Var;
        long j3 = ffVar.d;
        if (j3 >= 0) {
            this.f40002e = j3;
            u51Var.q0(j3, false);
        } else {
            this.f40002e = u51Var.S();
        }
        String path = u51Var.G.getPath();
        long U = u51Var.U();
        l2.f0 f0Var = u51Var.d;
        f0Var.F1();
        this.f39999a.o(false, path, U, f0Var.f18950b0);
        long U2 = u51Var.U();
        float max = 2.8f / ((float) Math.max(60L, U2));
        float max2 = (1.0f - max) * (((float) this.f40002e) / ((float) Math.max(1L, u51Var.U())));
        hi.cb cbVar = this.f39999a;
        cbVar.setVideoLeft(max2);
        cbVar.setVideoRight(max2 + max);
        cbVar.f13992a1 = 0L;
        cbVar.f13995b1 = U2;
        hi.xa xaVar = cbVar.h;
        if (xaVar != null) {
            hi.xa.a(xaVar, true);
        }
        cbVar.k();
    }

    public long getTime() {
        return this.f40002e;
    }

    public void setOnClose(Runnable runnable) {
        this.f40005r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.z10 z10Var) {
        this.f40004n = z10Var;
    }
}
