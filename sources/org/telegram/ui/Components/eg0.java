package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class eg0 extends FrameLayout {
    public final ei.gc f25899a;
    public final ei.d f25900b;
    public final xt f25901c;
    public c81 d;
    public long e;
    public float f25902f;
    public ei.u3 h;
    public Utilities.Callback f25903n;
    public Runnable f25904r;

    public eg0(Context context, org.telegram.ui.ActionBar.d6 d6Var, ja jaVar) {
        super(context);
        this.e = -1L;
        this.f25902f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.C(-1, false);
        kVar.B(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 13));
        addView(kVar, w7.z5.e(-1, -2, 55));
        ei.gc gcVar = new ei.gc(context, null, null, d6Var, jaVar);
        this.f25899a = gcVar;
        gcVar.X0 = true;
        addView(gcVar, w7.z5.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        ei.d dVar = new ei.d(context, d6Var, true);
        this.f25900b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.z5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        xt xtVar = new xt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f25901c = xtVar;
        xtVar.setOnClickListener(new ai.v0(this, context, d6Var, 29));
        addView(xtVar, w7.z5.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        gcVar.setDelegate(new mi.q(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, c81 c81Var, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        ei.d dVar = this.f25900b;
        dVar.f8848a = d6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f25902f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f25902f = 1.39f;
        }
        this.d = c81Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.e = j10;
            c81Var.L(j10, false);
        } else {
            this.e = c81Var.n();
        }
        String path = c81Var.F.getPath();
        long p5 = c81Var.p();
        i2.i0 i0Var = c81Var.d;
        i0Var.F1();
        this.f25899a.o(false, path, p5, i0Var.f12384b0);
        long p9 = c81Var.p();
        float max = 2.8f / ((float) Math.max(60L, p9));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, c81Var.p())));
        ei.gc gcVar = this.f25899a;
        gcVar.setVideoLeft(max2);
        gcVar.setVideoRight(max2 + max);
        gcVar.Z0 = 0L;
        gcVar.f9081a1 = p9;
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
        this.f25904r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f25903n = callback;
    }
}
