package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class re0 extends FrameLayout {
    public final kh.gc f32146a;
    public final kh.d f32147b;
    public final bt f32148c;
    public k61 d;
    public long f32149e;
    public float f32150f;
    public kh.u3 h;
    public Utilities.Callback f32151n;
    public Runnable f32152r;

    public re0(Context context, org.telegram.ui.ActionBar.b6 b6Var, ba baVar) {
        super(context);
        this.f32149e = -1L;
        this.f32150f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, b6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.C(-1, false);
        kVar.A(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, 5));
        addView(kVar, g7.e6.e(-1, -2, 55));
        kh.gc gcVar = new kh.gc(context, null, null, b6Var, baVar);
        this.f32146a = gcVar;
        gcVar.T0 = true;
        addView(gcVar, g7.e6.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        kh.d dVar = new kh.d(context, b6Var, true);
        this.f32147b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, g7.e6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        bt btVar = new bt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f32148c = btVar;
        btVar.setOnClickListener(new gd0(this, context, b6Var, 1));
        addView(btVar, g7.e6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        gcVar.setDelegate(new org.telegram.ui.Cells.e3(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, k61 k61Var, org.telegram.ui.ActionBar.b6 b6Var) {
        int i9;
        kh.d dVar = this.f32147b;
        dVar.f15063a = b6Var;
        dVar.j();
        int i10 = photoEntry.width;
        if (i10 > 0 && (i9 = photoEntry.height) > 0) {
            this.f32150f = Utilities.clamp(i9 / i10, 1.39f, 0.85f);
        } else {
            this.f32150f = 1.39f;
        }
        this.d = k61Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.f32149e = j10;
            k61Var.M(j10, false);
        } else {
            this.f32149e = k61Var.o();
        }
        String path = k61Var.B.getPath();
        long q10 = k61Var.q();
        h3.k0 k0Var = k61Var.d;
        k0Var.q0();
        this.f32146a.o(false, path, q10, k0Var.f9531a0);
        long q11 = k61Var.q();
        float max = 2.8f / ((float) Math.max(60L, q11));
        float max2 = (1.0f - max) * (((float) this.f32149e) / ((float) Math.max(1L, k61Var.q())));
        kh.gc gcVar = this.f32146a;
        gcVar.setVideoLeft(max2);
        gcVar.setVideoRight(max2 + max);
        gcVar.V0 = 0L;
        gcVar.W0 = q11;
        kh.bc bcVar = gcVar.h;
        if (bcVar != null) {
            kh.bc.a(bcVar, true);
        }
        gcVar.k();
    }

    public long getTime() {
        return this.f32149e;
    }

    public void setOnClose(Runnable runnable) {
        this.f32152r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f32151n = callback;
    }
}
