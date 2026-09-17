package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class kf0 extends FrameLayout {
    public final ci.zc f25621a;
    public final ci.d f25622b;
    public final pt f25623c;
    public h71 d;
    public long e;
    public float f25624f;
    public ci.b4 h;
    public Utilities.Callback f25625n;
    public Runnable f25626r;

    public kf0(Context context, org.telegram.ui.ActionBar.f6 f6Var, ha haVar) {
        super(context);
        this.e = -1L;
        this.f25624f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.B(-1, false);
        kVar.A(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.to(this, 10));
        addView(kVar, w7.x5.e(-1, -2, 55));
        ci.zc zcVar = new ci.zc(context, null, null, f6Var, haVar);
        this.f25621a = zcVar;
        zcVar.X0 = true;
        addView(zcVar, w7.x5.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        ci.d dVar = new ci.d(context, f6Var, true);
        this.f25622b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.x5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        pt ptVar = new pt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f25623c = ptVar;
        ptVar.setOnClickListener(new ai.d0(this, context, f6Var, 26));
        addView(ptVar, w7.x5.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        zcVar.setDelegate(new n7.a1(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, h71 h71Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        ci.d dVar = this.f25622b;
        dVar.f4447a = f6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f25624f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f25624f = 1.39f;
        }
        this.d = h71Var;
        long j3 = photoEntry.coverSavedPosition;
        if (j3 >= 0) {
            this.e = j3;
            h71Var.L(j3, false);
        } else {
            this.e = h71Var.n();
        }
        String path = h71Var.F.getPath();
        long p5 = h71Var.p();
        i2.e0 e0Var = h71Var.d;
        e0Var.B1();
        this.f25621a.o(false, path, p5, e0Var.Z);
        long p10 = h71Var.p();
        float max = 2.8f / ((float) Math.max(60L, p10));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, h71Var.p())));
        ci.zc zcVar = this.f25621a;
        zcVar.setVideoLeft(max2);
        zcVar.setVideoRight(max2 + max);
        zcVar.Z0 = 0L;
        zcVar.f5885a1 = p10;
        ci.tc tcVar = zcVar.h;
        if (tcVar != null) {
            ci.tc.a(tcVar, true);
        }
        zcVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.f25626r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f25625n = callback;
    }
}
