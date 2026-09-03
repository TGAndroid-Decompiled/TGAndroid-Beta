package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class pf0 extends FrameLayout {
    public final ph.oa f27844a;
    public final ph.d f27845b;
    public final kt f27846c;
    public i71 d;
    public long e;
    public float f27847f;
    public ph.d3 h;
    public Utilities.Callback f27848n;
    public Runnable f27849r;

    public pf0(Context context, org.telegram.ui.ActionBar.f6 f6Var, ba baVar) {
        super(context);
        this.e = -1L;
        this.f27847f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.C(-1, false);
        kVar.B(587202559, false);
        kVar.setActionBarMenuOnItemClick(new eg.m1(this, 27));
        addView(kVar, k7.b6.e(-1, -2, 55));
        ph.oa oaVar = new ph.oa(context, null, null, f6Var, baVar);
        this.f27844a = oaVar;
        oaVar.U0 = true;
        addView(oaVar, k7.b6.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        ph.d dVar = new ph.d(context, f6Var, true);
        this.f27845b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, k7.b6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        kt ktVar = new kt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f27846c = ktVar;
        ktVar.setOnClickListener(new dg.p(this, context, f6Var, 29));
        addView(ktVar, k7.b6.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        oaVar.setDelegate(new n7.qa(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, i71 i71Var, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        ph.d dVar = this.f27845b;
        dVar.f41451a = f6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f27847f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f27847f = 1.39f;
        }
        this.d = i71Var;
        long j10 = photoEntry.coverSavedPosition;
        if (j10 >= 0) {
            this.e = j10;
            i71Var.L(j10, false);
        } else {
            this.e = i71Var.n();
        }
        String path = i71Var.C.getPath();
        long p10 = i71Var.p();
        j3.f0 f0Var = i71Var.d;
        f0Var.j0();
        this.f27844a.o(false, path, p10, f0Var.Y);
        long p11 = i71Var.p();
        float max = 2.8f / ((float) Math.max(60L, p11));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, i71Var.p())));
        ph.oa oaVar = this.f27844a;
        oaVar.setVideoLeft(max2);
        oaVar.setVideoRight(max2 + max);
        oaVar.W0 = 0L;
        oaVar.X0 = p11;
        ph.ja jaVar = oaVar.h;
        if (jaVar != null) {
            ph.ja.a(jaVar, true);
        }
        oaVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.f27849r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f27848n = callback;
    }
}
