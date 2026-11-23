package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
public final class fe0 extends FrameLayout {
    public final hi.db f35185a;
    public final hi.d f35186b;
    public final et f35187c;
    public i61 d;
    public long f35188e;
    public float f35189f;
    public hi.h3 h;
    public org.telegram.messenger.y10 f35190n;
    public Runnable f35191r;

    public fe0(Context context, org.telegram.ui.ActionBar.h6 h6Var, ca caVar) {
        super(context);
        this.f35188e = -1L;
        this.f35189f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, h6Var);
        kVar.setBackButtonImage(2131231240);
        kVar.setTitle(org.telegram.messenger.hd.N0(2131751193, null));
        kVar.G(-1, false);
        kVar.F(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 18));
        addView(kVar, c8.na.e(-1, -2, 55));
        hi.db dbVar = new hi.db(context, null, null, h6Var, caVar);
        this.f35185a = dbVar;
        dbVar.Y0 = true;
        addView(dbVar, c8.na.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        hi.d dVar = new hi.d(context, h6Var, true);
        this.f35186b = dVar;
        dVar.i(org.telegram.messenger.hd.N0(2131751194, null), false, true);
        dVar.f();
        addView(dVar, c8.na.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        et etVar = new et(context, org.telegram.messenger.hd.N0(2131751195, null));
        this.f35187c = etVar;
        etVar.setOnClickListener(new st(this, context, h6Var, 5));
        addView(etVar, c8.na.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        dbVar.setDelegate(new ji.k(this));
    }

    public final void a(org.telegram.messenger.ff ffVar, i61 i61Var, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        hi.d dVar = this.f35186b;
        dVar.f14295a = h6Var;
        dVar.F = false;
        dVar.updateColors();
        int i10 = ffVar.F;
        if (i10 > 0 && (i7 = ffVar.G) > 0) {
            this.f35189f = Utilities.i(i7 / i10, 1.39f, 0.85f);
        } else {
            this.f35189f = 1.39f;
        }
        this.d = i61Var;
        long j3 = ffVar.d;
        if (j3 >= 0) {
            this.f35188e = j3;
            i61Var.q0(j3, false);
        } else {
            this.f35188e = i61Var.S();
        }
        String path = i61Var.G.getPath();
        long U = i61Var.U();
        l2.f0 f0Var = i61Var.d;
        f0Var.F1();
        this.f35185a.o(false, path, U, f0Var.f19311b0);
        long U2 = i61Var.U();
        float max = 2.8f / ((float) Math.max(60L, U2));
        float max2 = (1.0f - max) * (((float) this.f35188e) / ((float) Math.max(1L, i61Var.U())));
        hi.db dbVar = this.f35185a;
        dbVar.setVideoLeft(max2);
        dbVar.setVideoRight(max2 + max);
        dbVar.f14423a1 = 0L;
        dbVar.f14426b1 = U2;
        hi.ya yaVar = dbVar.h;
        if (yaVar != null) {
            hi.ya.a(yaVar, true);
        }
        dbVar.k();
    }

    public long getTime() {
        return this.f35188e;
    }

    public void setOnClose(Runnable runnable) {
        this.f35191r = runnable;
    }

    public void setOnGalleryImage(org.telegram.messenger.y10 y10Var) {
        this.f35190n = y10Var;
    }
}
