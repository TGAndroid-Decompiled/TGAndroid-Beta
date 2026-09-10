package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class tf0 extends FrameLayout {
    public final bi.me f27402a;
    public final bi.d f27403b;
    public final tt f27404c;
    public t71 d;
    public long e;
    public float f27405f;
    public bi.t4 h;
    public Utilities.Callback f27406n;
    public Runnable f27407r;

    public tf0(Context context, org.telegram.ui.ActionBar.f6 f6Var, ia iaVar) {
        super(context);
        this.e = -1L;
        this.f27405f = 1.39f;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, f6Var);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        lVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        lVar.C(-1, false);
        lVar.A(587202559, false);
        lVar.setActionBarMenuOnItemClick(new org.telegram.ui.vo(this, 10));
        addView(lVar, w7.a6.e(-1, -2, 55));
        bi.me meVar = new bi.me(context, null, null, f6Var, iaVar);
        this.f27402a = meVar;
        meVar.X0 = true;
        addView(meVar, w7.a6.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        bi.d dVar = new bi.d(context, f6Var, true);
        this.f27403b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.a6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        tt ttVar = new tt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f27404c = ttVar;
        ttVar.setOnClickListener(new bi.q(this, context, f6Var, 22));
        addView(ttVar, w7.a6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        meVar.setDelegate(new og.u0(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, t71 t71Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        bi.d dVar = this.f27403b;
        dVar.f2518a = f6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f27405f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f27405f = 1.39f;
        }
        this.d = t71Var;
        long j3 = photoEntry.coverSavedPosition;
        if (j3 >= 0) {
            this.e = j3;
            t71Var.L(j3, false);
        } else {
            this.e = t71Var.n();
        }
        String path = t71Var.F.getPath();
        long p5 = t71Var.p();
        i2.e0 e0Var = t71Var.d;
        e0Var.B1();
        this.f27402a.o(false, path, p5, e0Var.Z);
        long p10 = t71Var.p();
        float max = 2.8f / ((float) Math.max(60L, p10));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, t71Var.p())));
        bi.me meVar = this.f27402a;
        meVar.setVideoLeft(max2);
        meVar.setVideoRight(max2 + max);
        meVar.Z0 = 0L;
        meVar.f3150a1 = p10;
        bi.he heVar = meVar.h;
        if (heVar != null) {
            bi.he.a(heVar, true);
        }
        meVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.f27407r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f27406n = callback;
    }
}
