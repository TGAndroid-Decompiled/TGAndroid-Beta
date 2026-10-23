package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class ig0 extends FrameLayout {
    public final ei.gc f27313a;
    public final ei.d f27314b;
    public final xt f27315c;
    public j81 d;
    public long e;
    public float f27316f;
    public ei.u3 h;
    public Utilities.Callback f27317n;
    public Runnable f27318r;

    public ig0(Context context, org.telegram.ui.ActionBar.g6 g6Var, ja jaVar) {
        super(context);
        this.e = -1L;
        this.f27316f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.B(-1, false);
        kVar.A(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 13));
        addView(kVar, w7.z5.e(-1, -2, 55));
        ei.gc gcVar = new ei.gc(context, null, null, g6Var, jaVar);
        this.f27313a = gcVar;
        gcVar.X0 = true;
        addView(gcVar, w7.z5.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        ei.d dVar = new ei.d(context, g6Var, true);
        this.f27314b = dVar;
        dVar.i(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.f();
        addView(dVar, w7.z5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        xt xtVar = new xt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f27315c = xtVar;
        xtVar.setOnClickListener(new ai.v0(this, context, g6Var, 29));
        addView(xtVar, w7.z5.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        gcVar.setDelegate(new n2.e(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, j81 j81Var, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        ei.d dVar = this.f27314b;
        dVar.f8857a = g6Var;
        dVar.E = false;
        dVar.updateColors();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f27316f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f27316f = 1.39f;
        }
        this.d = j81Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.e = j10;
            j81Var.L(j10, false);
        } else {
            this.e = j81Var.n();
        }
        String path = j81Var.F.getPath();
        long p5 = j81Var.p();
        i2.h0 h0Var = j81Var.d;
        h0Var.F1();
        this.f27313a.o(false, path, p5, h0Var.f12413b0);
        long p9 = j81Var.p();
        float max = 2.8f / ((float) Math.max(60L, p9));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, j81Var.p())));
        ei.gc gcVar = this.f27313a;
        gcVar.setVideoLeft(max2);
        gcVar.setVideoRight(max2 + max);
        gcVar.Z0 = 0L;
        gcVar.f9091a1 = p9;
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
        this.f27318r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f27317n = callback;
    }
}
