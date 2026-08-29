package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class ff0 extends FrameLayout {
    public final nh.qb f28390a;
    public final nh.d f28391b;
    public final ht f28392c;
    public x61 d;
    public long f28393e;
    public float f28394f;
    public nh.r3 h;
    public Utilities.Callback f28395n;
    public Runnable f28396r;

    public ff0(Context context, org.telegram.ui.ActionBar.c6 c6Var, ga gaVar) {
        super(context);
        this.f28393e = -1L;
        this.f28394f = 1.39f;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, c6Var);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        lVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        lVar.C(-1, false);
        lVar.B(587202559, false);
        lVar.setActionBarMenuOnItemClick(new cg.n1(this, 27));
        addView(lVar, i7.f6.e(-1, -2, 55));
        nh.qb qbVar = new nh.qb(context, null, null, c6Var, gaVar);
        this.f28390a = qbVar;
        qbVar.T0 = true;
        addView(qbVar, i7.f6.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        nh.d dVar = new nh.d(context, c6Var, true);
        this.f28391b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, i7.f6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        ht htVar = new ht(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f28392c = htVar;
        htVar.setOnClickListener(new ya0(this, context, c6Var, 2));
        addView(htVar, i7.f6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        qbVar.setDelegate(new oc.i(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, x61 x61Var, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        nh.d dVar = this.f28391b;
        dVar.f17490a = c6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f28394f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f28394f = 1.39f;
        }
        this.d = x61Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.f28393e = j10;
            x61Var.M(j10, false);
        } else {
            this.f28393e = x61Var.o();
        }
        String path = x61Var.B.getPath();
        long q6 = x61Var.q();
        j3.k0 k0Var = x61Var.d;
        k0Var.q0();
        this.f28390a.o(false, path, q6, k0Var.f10568a0);
        long q9 = x61Var.q();
        float max = 2.8f / ((float) Math.max(60L, q9));
        float max2 = (1.0f - max) * (((float) this.f28393e) / ((float) Math.max(1L, x61Var.q())));
        nh.qb qbVar = this.f28390a;
        qbVar.setVideoLeft(max2);
        qbVar.setVideoRight(max2 + max);
        qbVar.V0 = 0L;
        qbVar.W0 = q9;
        nh.lb lbVar = qbVar.h;
        if (lbVar != null) {
            nh.lb.a(lbVar, true);
        }
        qbVar.k();
    }

    public long getTime() {
        return this.f28393e;
    }

    public void setOnClose(Runnable runnable) {
        this.f28396r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f28395n = callback;
    }
}
