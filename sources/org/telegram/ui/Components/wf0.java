package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class wf0 extends FrameLayout {
    public final ci.wc f29912a;
    public final ci.d f29913b;
    public final rt f29914c;
    public u71 d;
    public long e;
    public float f29915f;
    public ci.a4 h;
    public Utilities.Callback f29916n;
    public Runnable f29917r;

    public wf0(Context context, org.telegram.ui.ActionBar.d6 d6Var, ja jaVar) {
        super(context);
        this.e = -1L;
        this.f29915f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.B(-1, false);
        kVar.A(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.oo(this, 10));
        addView(kVar, w7.y5.e(-1, -2, 55));
        ci.wc wcVar = new ci.wc(context, null, null, d6Var, jaVar);
        this.f29912a = wcVar;
        wcVar.X0 = true;
        addView(wcVar, w7.y5.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        ci.d dVar = new ci.d(context, d6Var, true);
        this.f29913b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.y5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        rt rtVar = new rt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f29914c = rtVar;
        rtVar.setOnClickListener(new ai.d0(this, context, d6Var, 26));
        addView(rtVar, w7.y5.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        wcVar.setDelegate(new n7.z0(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, u71 u71Var, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        ci.d dVar = this.f29913b;
        dVar.f4461a = d6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f29915f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f29915f = 1.39f;
        }
        this.d = u71Var;
        long j3 = photoEntry.coverSavedPosition;
        if (j3 >= 0) {
            this.e = j3;
            u71Var.L(j3, false);
        } else {
            this.e = u71Var.n();
        }
        String path = u71Var.F.getPath();
        long p5 = u71Var.p();
        i2.f0 f0Var = u71Var.d;
        f0Var.B1();
        this.f29912a.o(false, path, p5, f0Var.Z);
        long p10 = u71Var.p();
        float max = 2.8f / ((float) Math.max(60L, p10));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, u71Var.p())));
        ci.wc wcVar = this.f29912a;
        wcVar.setVideoLeft(max2);
        wcVar.setVideoRight(max2 + max);
        wcVar.Z0 = 0L;
        wcVar.f5745a1 = p10;
        ci.qc qcVar = wcVar.h;
        if (qcVar != null) {
            ci.qc.a(qcVar, true);
        }
        wcVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.f29917r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f29916n = callback;
    }
}
