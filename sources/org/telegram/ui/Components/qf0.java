package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class qf0 extends FrameLayout {
    public final qh.ma f30384a;
    public final qh.d f30385b;
    public final nt f30386c;
    public k71 d;
    public long f30387e;
    public float f30388f;
    public qh.d3 h;
    public Utilities.Callback f30389n;
    public Runnable f30390r;

    public qf0(Context context, org.telegram.ui.ActionBar.g6 g6Var, ba baVar) {
        super(context);
        this.f30387e = -1L;
        this.f30388f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.C(-1, false);
        kVar.B(587202559, false);
        kVar.setActionBarMenuOnItemClick(new fg.l1(this, 27));
        addView(kVar, k7.c6.e(-1, -2, 55));
        qh.ma maVar = new qh.ma(context, null, null, g6Var, baVar);
        this.f30384a = maVar;
        maVar.U0 = true;
        addView(maVar, k7.c6.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        qh.d dVar = new qh.d(context, g6Var, true);
        this.f30385b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, k7.c6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        nt ntVar = new nt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f30386c = ntVar;
        ntVar.setOnClickListener(new eg.o(this, context, g6Var, 29));
        addView(ntVar, k7.c6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        maVar.setDelegate(new n7.qa(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, k71 k71Var, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        qh.d dVar = this.f30385b;
        dVar.f45160a = g6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f30388f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f30388f = 1.39f;
        }
        this.d = k71Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.f30387e = j10;
            k71Var.L(j10, false);
        } else {
            this.f30387e = k71Var.n();
        }
        String path = k71Var.C.getPath();
        long p10 = k71Var.p();
        j3.f0 f0Var = k71Var.d;
        f0Var.j0();
        this.f30384a.o(false, path, p10, f0Var.Y);
        long p11 = k71Var.p();
        float max = 2.8f / ((float) Math.max(60L, p11));
        float max2 = (1.0f - max) * (((float) this.f30387e) / ((float) Math.max(1L, k71Var.p())));
        qh.ma maVar = this.f30384a;
        maVar.setVideoLeft(max2);
        maVar.setVideoRight(max2 + max);
        maVar.W0 = 0L;
        maVar.X0 = p11;
        qh.ha haVar = maVar.h;
        if (haVar != null) {
            qh.ha.a(haVar, true);
        }
        maVar.k();
    }

    public long getTime() {
        return this.f30387e;
    }

    public void setOnClose(Runnable runnable) {
        this.f30390r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f30389n = callback;
    }
}
