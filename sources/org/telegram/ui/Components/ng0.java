package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class ng0 extends FrameLayout {
    public final ci.wc f29115a;
    public final ci.d f29116b;
    public final gu f29117c;
    public l81 d;
    public long f29118e;
    public float f29119f;
    public ci.z3 h;
    public Utilities.Callback f29120n;
    public Runnable f29121r;

    public ng0(Context context, org.telegram.ui.ActionBar.e6 e6Var, ma maVar) {
        super(context);
        this.f29118e = -1L;
        this.f29119f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.D(-1, false);
        kVar.C(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 10));
        addView(kVar, w7.x5.e(-1, -2, 55));
        ci.wc wcVar = new ci.wc(context, null, null, e6Var, maVar);
        this.f29115a = wcVar;
        wcVar.X0 = true;
        addView(wcVar, w7.x5.a(388, 0.0f, 0.0f, 0.0f, 74.0f, -1, 87));
        ci.d dVar = new ci.d(context, e6Var, true);
        this.f29116b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.x5.a(48.0f, 16.0f, 10.0f, 16.0f, 16.0f, -1, 87));
        gu guVar = new gu(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f29117c = guVar;
        guVar.setOnClickListener(new ai.d0(this, context, e6Var, 26));
        addView(guVar, w7.x5.a(32.0f, 60.0f, 0.0f, 60.0f, 134.0f, -1, 87));
        wcVar.setDelegate(new org.telegram.ui.ActionBar.b5(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, l81 l81Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        ci.d dVar = this.f29116b;
        dVar.f4861a = e6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f29119f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f29119f = 1.39f;
        }
        this.d = l81Var;
        long j3 = photoEntry.coverSavedPosition;
        if (j3 >= 0) {
            this.f29118e = j3;
            l81Var.L(j3, false);
        } else {
            this.f29118e = l81Var.n();
        }
        String path = l81Var.F.getPath();
        long p5 = l81Var.p();
        i2.f0 f0Var = l81Var.d;
        f0Var.D1();
        this.f29115a.o(false, path, p5, f0Var.Z);
        long p10 = l81Var.p();
        float max = 2.8f / ((float) Math.max(60L, p10));
        float max2 = (1.0f - max) * (((float) this.f29118e) / ((float) Math.max(1L, l81Var.p())));
        ci.wc wcVar = this.f29115a;
        wcVar.setVideoLeft(max2);
        wcVar.setVideoRight(max2 + max);
        wcVar.Z0 = 0L;
        wcVar.f6229a1 = p10;
        ci.qc qcVar = wcVar.h;
        if (qcVar != null) {
            ci.qc.a(qcVar, true);
        }
        wcVar.k();
    }

    public long getTime() {
        return this.f29118e;
    }

    public void setOnClose(Runnable runnable) {
        this.f29121r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f29120n = callback;
    }
}
