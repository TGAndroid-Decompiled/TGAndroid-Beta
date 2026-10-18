package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class dg0 extends FrameLayout {
    public final ei.gc f25590a;
    public final ei.d f25591b;
    public final xt f25592c;
    public a81 d;
    public long e;
    public float f25593f;
    public ei.u3 h;
    public Utilities.Callback f25594n;
    public Runnable f25595r;

    public dg0(Context context, org.telegram.ui.ActionBar.d6 d6Var, ja jaVar) {
        super(context);
        this.e = -1L;
        this.f25593f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.C(-1, false);
        kVar.B(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 13));
        addView(kVar, w7.z5.e(-1, -2, 55));
        ei.gc gcVar = new ei.gc(context, null, null, d6Var, jaVar);
        this.f25590a = gcVar;
        gcVar.X0 = true;
        addView(gcVar, w7.z5.a(388, 0.0f, 0.0f, 0.0f, 74.0f, -1, 87));
        ei.d dVar = new ei.d(context, d6Var, true);
        this.f25591b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.z5.a(48.0f, 16.0f, 10.0f, 16.0f, 16.0f, -1, 87));
        xt xtVar = new xt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f25592c = xtVar;
        xtVar.setOnClickListener(new ai.v0(this, context, d6Var, 29));
        addView(xtVar, w7.z5.a(32.0f, 60.0f, 0.0f, 60.0f, 134.0f, -1, 87));
        gcVar.setDelegate(new mi.q(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, a81 a81Var, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        ei.d dVar = this.f25591b;
        dVar.f8851a = d6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f25593f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f25593f = 1.39f;
        }
        this.d = a81Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.e = j10;
            a81Var.L(j10, false);
        } else {
            this.e = a81Var.n();
        }
        String path = a81Var.F.getPath();
        long p5 = a81Var.p();
        i2.h0 h0Var = a81Var.d;
        h0Var.F1();
        this.f25590a.o(false, path, p5, h0Var.f12383b0);
        long p9 = a81Var.p();
        float max = 2.8f / ((float) Math.max(60L, p9));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, a81Var.p())));
        ei.gc gcVar = this.f25590a;
        gcVar.setVideoLeft(max2);
        gcVar.setVideoRight(max2 + max);
        gcVar.Z0 = 0L;
        gcVar.f9084a1 = p9;
        ei.ac acVar = gcVar.h;
        if (acVar != null) {
            ei.ac.a(acVar, true);
        }
        gcVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.f25595r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f25594n = callback;
    }
}
