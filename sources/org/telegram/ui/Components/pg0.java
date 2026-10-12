package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class pg0 extends FrameLayout {
    public final ci.wc f29497a;
    public final ci.d f29498b;
    public final iu f29499c;
    public q81 d;
    public long f29500e;
    public float f29501f;
    public ci.z3 h;
    public Utilities.Callback f29502n;
    public Runnable f29503r;

    public pg0(Context context, org.telegram.ui.ActionBar.c6 c6Var, la laVar) {
        super(context);
        this.f29500e = -1L;
        this.f29501f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.E(-1, false);
        kVar.D(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.lc(this, 11));
        addView(kVar, w7.w5.e(-1, -2, 55));
        ci.wc wcVar = new ci.wc(context, null, null, c6Var, laVar);
        this.f29497a = wcVar;
        wcVar.X0 = true;
        addView(wcVar, w7.w5.a(388, 0.0f, 0.0f, 0.0f, 74.0f, -1, 87));
        ci.d dVar = new ci.d(context, c6Var, true);
        this.f29498b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.w5.a(48.0f, 16.0f, 10.0f, 16.0f, 16.0f, -1, 87));
        iu iuVar = new iu(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f29499c = iuVar;
        iuVar.setOnClickListener(new ai.d0(this, context, c6Var, 26));
        addView(iuVar, w7.w5.a(32.0f, 60.0f, 0.0f, 60.0f, 134.0f, -1, 87));
        wcVar.setDelegate(new n7.z0(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, q81 q81Var, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        ci.d dVar = this.f29498b;
        dVar.f4859a = c6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f29501f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f29501f = 1.39f;
        }
        this.d = q81Var;
        long j3 = photoEntry.coverSavedPosition;
        if (j3 >= 0) {
            this.f29500e = j3;
            q81Var.L(j3, false);
        } else {
            this.f29500e = q81Var.n();
        }
        String path = q81Var.F.getPath();
        long p5 = q81Var.p();
        i2.f0 f0Var = q81Var.d;
        f0Var.D1();
        this.f29497a.o(false, path, p5, f0Var.Z);
        long p10 = q81Var.p();
        float max = 2.8f / ((float) Math.max(60L, p10));
        float max2 = (1.0f - max) * (((float) this.f29500e) / ((float) Math.max(1L, q81Var.p())));
        ci.wc wcVar = this.f29497a;
        wcVar.setVideoLeft(max2);
        wcVar.setVideoRight(max2 + max);
        wcVar.Z0 = 0L;
        wcVar.f6227a1 = p10;
        ci.qc qcVar = wcVar.h;
        if (qcVar != null) {
            ci.qc.a(qcVar, true);
        }
        wcVar.k();
    }

    public long getTime() {
        return this.f29500e;
    }

    public void setOnClose(Runnable runnable) {
        this.f29503r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f29502n = callback;
    }
}
