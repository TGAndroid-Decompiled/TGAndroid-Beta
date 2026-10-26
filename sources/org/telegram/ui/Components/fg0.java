package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class fg0 extends FrameLayout {
    public final fi.cc f28183a;
    public final fi.d f28184b;
    public final zt f28185c;
    public s81 d;
    public long e;
    public float f28186f;
    public fi.s3 h;
    public Utilities.Callback f28187n;
    public Runnable f28188r;

    public fg0(Context context, org.telegram.ui.ActionBar.u6 u6Var, la laVar) {
        super(context);
        this.e = -1L;
        this.f28186f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, u6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.y(-1, false);
        kVar.x(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 14));
        addView(kVar, gb1.i(-1, -2, 55));
        fi.cc ccVar = new fi.cc(context, null, null, u6Var, laVar);
        this.f28183a = ccVar;
        ccVar.X0 = true;
        addView(ccVar, gb1.h(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        fi.d dVar = new fi.d(context, u6Var, true);
        this.f28184b = dVar;
        dVar.i(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.f();
        addView(dVar, gb1.h(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        zt ztVar = new zt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f28185c = ztVar;
        ztVar.setOnClickListener(new bi.w0(this, context, u6Var, 29));
        addView(ztVar, gb1.h(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        ccVar.setDelegate(new m4.w1(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, s81 s81Var, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10;
        fi.d dVar = this.f28184b;
        dVar.f10682a = u6Var;
        dVar.E = false;
        dVar.updateColors();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f28186f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f28186f = 1.39f;
        }
        this.d = s81Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.e = j10;
            s81Var.L(j10, false);
        } else {
            this.e = s81Var.n();
        }
        String path = s81Var.F.getPath();
        long p10 = s81Var.p();
        i2.j0 j0Var = s81Var.d;
        j0Var.F1();
        this.f28183a.o(false, path, p10, j0Var.f13585b0);
        long p11 = s81Var.p();
        float max = 2.8f / ((float) Math.max(60L, p11));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, s81Var.p())));
        fi.cc ccVar = this.f28183a;
        ccVar.setVideoLeft(max2);
        ccVar.setVideoRight(max2 + max);
        ccVar.Z0 = 0L;
        ccVar.f10624a1 = p11;
        fi.xb xbVar = ccVar.h;
        if (xbVar != null) {
            fi.xb.a(xbVar, true);
        }
        ccVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.f28188r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f28187n = callback;
    }
}
