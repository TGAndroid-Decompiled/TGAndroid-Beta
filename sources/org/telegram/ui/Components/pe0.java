package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class pe0 extends FrameLayout {
    public final vh.z8 f29410a;
    public final vh.d f29411b;
    public final bt f29412c;
    public v61 d;
    public long e;
    public float f29413f;
    public vh.n2 h;
    public org.telegram.messenger.r20 f29414n;
    public Runnable f29415r;

    public pe0(Context context, org.telegram.ui.ActionBar.p6 p6Var, s9 s9Var) {
        super(context);
        this.e = -1L;
        this.f29413f = 1.39f;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, p6Var);
        lVar.setBackButtonImage(2131231241);
        lVar.setTitle(org.telegram.messenger.dd.L0(2131751206, null));
        lVar.D(-1, false);
        lVar.C(587202559, false);
        lVar.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, 6));
        addView(lVar, w7.b6.e(-1, -2, 55));
        vh.z8 z8Var = new vh.z8(context, null, null, p6Var, s9Var);
        this.f29410a = z8Var;
        z8Var.X0 = true;
        addView(z8Var, w7.b6.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        vh.d dVar = new vh.d(context, p6Var, true);
        this.f29411b = dVar;
        dVar.i(org.telegram.messenger.dd.L0(2131751207, null), false, true);
        dVar.f();
        addView(dVar, w7.b6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        bt btVar = new bt(context, org.telegram.messenger.dd.L0(2131751208, null));
        this.f29412c = btVar;
        btVar.setOnClickListener(new ag.i(this, context, p6Var, 20));
        addView(btVar, w7.b6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        z8Var.setDelegate(new m5.e(this));
    }

    public final void a(org.telegram.messenger.ff ffVar, v61 v61Var, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10;
        vh.d dVar = this.f29411b;
        dVar.f51065a = p6Var;
        dVar.E = false;
        dVar.updateColors();
        int i11 = ffVar.F;
        if (i11 > 0 && (i10 = ffVar.G) > 0) {
            this.f29413f = Utilities.i(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f29413f = 1.39f;
        }
        this.d = v61Var;
        long j10 = ffVar.d;
        if (j10 >= 0) {
            this.e = j10;
            v61Var.q0(j10, false);
        } else {
            this.e = v61Var.S();
        }
        String path = v61Var.F.getPath();
        long U = v61Var.U();
        i2.i0 i0Var = v61Var.d;
        i0Var.F1();
        this.f29410a.o(false, path, U, i0Var.f7899b0);
        long U2 = v61Var.U();
        float max = 2.8f / ((float) Math.max(60L, U2));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, v61Var.U())));
        vh.z8 z8Var = this.f29410a;
        z8Var.setVideoLeft(max2);
        z8Var.setVideoRight(max2 + max);
        z8Var.Z0 = 0L;
        z8Var.f52277a1 = U2;
        vh.u8 u8Var = z8Var.h;
        if (u8Var != null) {
            vh.u8.a(u8Var, true);
        }
        z8Var.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.f29415r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.r20 r20Var) {
        this.f29414n = r20Var;
    }
}
