package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class kf0 extends FrameLayout {
    public final di.zc f27815a;
    public final di.d f27816b;
    public final nt f27817c;
    public g71 d;
    public long f27818e;
    public float f27819f;
    public di.b4 h;
    public Utilities.Callback f27820n;
    public Runnable f27821r;

    public kf0(Context context, org.telegram.ui.ActionBar.f6 f6Var, ja jaVar) {
        super(context);
        this.f27818e = -1L;
        this.f27819f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.C(-1, false);
        kVar.B(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.ic(this, 11));
        addView(kVar, w7.x5.e(-1, -2, 55));
        di.zc zcVar = new di.zc(context, null, null, f6Var, jaVar);
        this.f27815a = zcVar;
        zcVar.X0 = true;
        addView(zcVar, w7.x5.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        di.d dVar = new di.d(context, f6Var, true);
        this.f27816b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.x5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        nt ntVar = new nt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f27817c = ntVar;
        ntVar.setOnClickListener(new bi.x(this, context, f6Var, 26));
        addView(ntVar, w7.x5.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        zcVar.setDelegate(new n7.z0(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, g71 g71Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        di.d dVar = this.f27816b;
        dVar.f7007a = f6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f27819f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f27819f = 1.39f;
        }
        this.d = g71Var;
        long j3 = photoEntry.coverSavedPosition;
        if (j3 >= 0) {
            this.f27818e = j3;
            g71Var.L(j3, false);
        } else {
            this.f27818e = g71Var.n();
        }
        String path = g71Var.F.getPath();
        long p5 = g71Var.p();
        i2.f0 f0Var = g71Var.d;
        f0Var.B1();
        this.f27815a.o(false, path, p5, f0Var.Z);
        long p10 = g71Var.p();
        float max = 2.8f / ((float) Math.max(60L, p10));
        float max2 = (1.0f - max) * (((float) this.f27818e) / ((float) Math.max(1L, g71Var.p())));
        di.zc zcVar = this.f27815a;
        zcVar.setVideoLeft(max2);
        zcVar.setVideoRight(max2 + max);
        zcVar.Z0 = 0L;
        zcVar.f8537a1 = p10;
        di.uc ucVar = zcVar.h;
        if (ucVar != null) {
            di.uc.a(ucVar, true);
        }
        zcVar.k();
    }

    public long getTime() {
        return this.f27818e;
    }

    public void setOnClose(Runnable runnable) {
        this.f27821r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f27820n = callback;
    }
}
