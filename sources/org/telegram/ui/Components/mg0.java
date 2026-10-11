package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class mg0 extends FrameLayout {
    public final ci.wc f28849a;
    public final ci.d f28850b;
    public final gu f28851c;
    public l81 d;
    public long f28852e;
    public float f28853f;
    public ci.z3 h;
    public Utilities.Callback f28854n;
    public Runnable f28855r;

    public mg0(Context context, org.telegram.ui.ActionBar.d6 d6Var, la laVar) {
        super(context);
        this.f28852e = -1L;
        this.f28853f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.D(-1, false);
        kVar.C(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 10));
        addView(kVar, w7.x5.e(-1, -2, 55));
        ci.wc wcVar = new ci.wc(context, null, null, d6Var, laVar);
        this.f28849a = wcVar;
        wcVar.X0 = true;
        addView(wcVar, w7.x5.a(388, 0.0f, 0.0f, 0.0f, 74.0f, -1, 87));
        ci.d dVar = new ci.d(context, d6Var, true);
        this.f28850b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.x5.a(48.0f, 16.0f, 10.0f, 16.0f, 16.0f, -1, 87));
        gu guVar = new gu(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f28851c = guVar;
        guVar.setOnClickListener(new ai.d0(this, context, d6Var, 26));
        addView(guVar, w7.x5.a(32.0f, 60.0f, 0.0f, 60.0f, 134.0f, -1, 87));
        wcVar.setDelegate(new n7.z0(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, l81 l81Var, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        ci.d dVar = this.f28850b;
        dVar.f4860a = d6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f28853f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f28853f = 1.39f;
        }
        this.d = l81Var;
        long j3 = photoEntry.coverSavedPosition;
        if (j3 >= 0) {
            this.f28852e = j3;
            l81Var.L(j3, false);
        } else {
            this.f28852e = l81Var.n();
        }
        String path = l81Var.F.getPath();
        long p5 = l81Var.p();
        i2.f0 f0Var = l81Var.d;
        f0Var.D1();
        this.f28849a.o(false, path, p5, f0Var.Z);
        long p10 = l81Var.p();
        float max = 2.8f / ((float) Math.max(60L, p10));
        float max2 = (1.0f - max) * (((float) this.f28852e) / ((float) Math.max(1L, l81Var.p())));
        ci.wc wcVar = this.f28849a;
        wcVar.setVideoLeft(max2);
        wcVar.setVideoRight(max2 + max);
        wcVar.Z0 = 0L;
        wcVar.f6228a1 = p10;
        ci.qc qcVar = wcVar.h;
        if (qcVar != null) {
            ci.qc.a(qcVar, true);
        }
        wcVar.k();
    }

    public long getTime() {
        return this.f28852e;
    }

    public void setOnClose(Runnable runnable) {
        this.f28855r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f28854n = callback;
    }
}
