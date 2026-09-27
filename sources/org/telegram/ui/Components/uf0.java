package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class uf0 extends FrameLayout {
    public final ci.vc f28869a;
    public final ci.d f28870b;
    public final rt f28871c;
    public u71 d;
    public long e;
    public float f28872f;
    public ci.a4 h;
    public Utilities.Callback f28873n;
    public Runnable f28874r;

    public uf0(Context context, org.telegram.ui.ActionBar.e6 e6Var, ja jaVar) {
        super(context);
        this.e = -1L;
        this.f28872f = 1.39f;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, e6Var);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        lVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        lVar.E(-1, false);
        lVar.B(587202559, false);
        lVar.setActionBarMenuOnItemClick(new org.telegram.ui.po(this, 10));
        addView(lVar, w7.y5.e(-1, -2, 55));
        ci.vc vcVar = new ci.vc(context, null, null, e6Var, jaVar);
        this.f28869a = vcVar;
        vcVar.X0 = true;
        addView(vcVar, w7.y5.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        ci.d dVar = new ci.d(context, e6Var, true);
        this.f28870b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.y5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        rt rtVar = new rt(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f28871c = rtVar;
        rtVar.setOnClickListener(new ai.d0(this, context, e6Var, 26));
        addView(rtVar, w7.y5.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        vcVar.setDelegate(new n7.z0(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, u71 u71Var, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        ci.d dVar = this.f28870b;
        dVar.f4488a = e6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f28872f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f28872f = 1.39f;
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
        this.f28869a.o(false, path, p5, f0Var.Z);
        long p10 = u71Var.p();
        float max = 2.8f / ((float) Math.max(60L, p10));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, u71Var.p())));
        ci.vc vcVar = this.f28869a;
        vcVar.setVideoLeft(max2);
        vcVar.setVideoRight(max2 + max);
        vcVar.Z0 = 0L;
        vcVar.f5695a1 = p10;
        ci.pc pcVar = vcVar.h;
        if (pcVar != null) {
            ci.pc.a(pcVar, true);
        }
        vcVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.f28874r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f28873n = callback;
    }
}
