package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class qf0 extends FrameLayout {
    public final qh.la f30400a;
    public final qh.d f30401b;
    public final nt f30402c;
    public j71 d;
    public long f30403e;
    public float f30404f;
    public qh.c3 h;
    public Utilities.Callback f30405n;
    public Runnable f30406r;

    public qf0(Context context, org.telegram.ui.ActionBar.g6 g6Var, ba baVar) {
        super(context);
        this.f30403e = -1L;
        this.f30404f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.C(-1, false);
        kVar.B(587202559, false);
        kVar.setActionBarMenuOnItemClick(new fg.l1(this, 27));
        addView(kVar, k7.c6.e(-1, -2, 55));
        qh.la laVar = new qh.la(context, null, null, g6Var, baVar);
        this.f30400a = laVar;
        laVar.U0 = true;
        addView(laVar, k7.c6.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        qh.d dVar = new qh.d(context, g6Var, true);
        this.f30401b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, k7.c6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        nt ntVar = new nt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f30402c = ntVar;
        ntVar.setOnClickListener(new eg.o(this, context, g6Var, 29));
        addView(ntVar, k7.c6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        laVar.setDelegate(new n7.qa(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, j71 j71Var, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        qh.d dVar = this.f30401b;
        dVar.f45200a = g6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f30404f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f30404f = 1.39f;
        }
        this.d = j71Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.f30403e = j10;
            j71Var.L(j10, false);
        } else {
            this.f30403e = j71Var.n();
        }
        String path = j71Var.C.getPath();
        long p10 = j71Var.p();
        j3.f0 f0Var = j71Var.d;
        f0Var.j0();
        this.f30400a.o(false, path, p10, f0Var.Y);
        long p11 = j71Var.p();
        float max = 2.8f / ((float) Math.max(60L, p11));
        float max2 = (1.0f - max) * (((float) this.f30403e) / ((float) Math.max(1L, j71Var.p())));
        qh.la laVar = this.f30400a;
        laVar.setVideoLeft(max2);
        laVar.setVideoRight(max2 + max);
        laVar.W0 = 0L;
        laVar.X0 = p11;
        qh.ga gaVar = laVar.h;
        if (gaVar != null) {
            qh.ga.a(gaVar, true);
        }
        laVar.k();
    }

    public long getTime() {
        return this.f30403e;
    }

    public void setOnClose(Runnable runnable) {
        this.f30406r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f30405n = callback;
    }
}
