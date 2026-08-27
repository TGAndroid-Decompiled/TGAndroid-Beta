package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public final class we0 extends FrameLayout {

    public final lh.cc f34166a;

    public final lh.d f34167b;

    public final at f34168c;
    public m61 d;

    public long f34169e;

    public float f34170f;
    public lh.t3 h;

    public Utilities.Callback f34171n;

    public Runnable f34172r;

    public we0(Context context, org.telegram.ui.ActionBar.c6 c6Var, z9 z9Var) {
        super(context);
        this.f34169e = -1L;
        this.f34170f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.D(-1, false);
        kVar.C(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, 6));
        addView(kVar, h7.z5.e(-1, -2, 55));
        lh.cc ccVar = new lh.cc(context, null, null, c6Var, z9Var);
        this.f34166a = ccVar;
        ccVar.T0 = true;
        addView(ccVar, h7.z5.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        lh.d dVar = new lh.d(context, c6Var, true);
        this.f34167b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, h7.z5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        at atVar = new at(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f34168c = atVar;
        atVar.setOnClickListener(new ld0(this, context, c6Var, 1));
        addView(atVar, h7.z5.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        ccVar.setDelegate(new org.telegram.ui.i6(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, m61 m61Var, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        lh.d dVar = this.f34167b;
        dVar.f15821a = c6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 <= 0 || (i10 = photoEntry.height) <= 0) {
            this.f34170f = 1.39f;
        } else {
            this.f34170f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        }
        this.d = m61Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.f34169e = j10;
            m61Var.M(j10, false);
        } else {
            this.f34169e = m61Var.o();
        }
        String path = m61Var.B.getPath();
        long jQ = m61Var.q();
        h3.k0 k0Var = m61Var.d;
        k0Var.q0();
        this.f34166a.o(false, path, jQ, k0Var.f7961a0);
        long jQ2 = m61Var.q();
        float fMax = 2.8f / Math.max(60L, jQ2);
        float fMax2 = (1.0f - fMax) * (this.f34169e / Math.max(1L, m61Var.q()));
        lh.cc ccVar = this.f34166a;
        ccVar.setVideoLeft(fMax2);
        ccVar.setVideoRight(fMax2 + fMax);
        ccVar.V0 = 0L;
        ccVar.W0 = jQ2;
        lh.xb xbVar = ccVar.h;
        if (xbVar != null) {
            lh.xb.a(xbVar, true);
        }
        ccVar.k();
    }

    public long getTime() {
        return this.f34169e;
    }

    public void setOnClose(Runnable runnable) {
        this.f34172r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f34171n = callback;
    }
}
