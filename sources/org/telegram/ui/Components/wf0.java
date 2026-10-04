package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class wf0 extends FrameLayout {
    public final ci.vc f32531a;
    public final ci.d f32532b;
    public final st f32533c;
    public d81 d;
    public long f32534e;
    public float f32535f;
    public ci.a4 h;
    public Utilities.Callback f32536n;
    public Runnable f32537r;

    public wf0(Context context, org.telegram.ui.ActionBar.d6 d6Var, ka kaVar) {
        super(context);
        this.f32534e = -1L;
        this.f32535f = 1.39f;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.setTitle(LocaleController.getString(R.string.EditorSetCoverTitle));
        kVar.B(-1, false);
        kVar.A(587202559, false);
        kVar.setActionBarMenuOnItemClick(new org.telegram.ui.qo(this, 10));
        addView(kVar, w7.z5.e(-1, -2, 55));
        ci.vc vcVar = new ci.vc(context, null, null, d6Var, kaVar);
        this.f32531a = vcVar;
        vcVar.X0 = true;
        addView(vcVar, w7.z5.d(-1, 388, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        ci.d dVar = new ci.d(context, d6Var, true);
        this.f32532b = dVar;
        dVar.g(LocaleController.getString(R.string.EditorSetCoverSave), false, true);
        dVar.e();
        addView(dVar, w7.z5.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        st stVar = new st(context, LocaleController.getString(R.string.EditorSetCoverGallery));
        this.f32533c = stVar;
        stVar.setOnClickListener(new ai.d0(this, context, d6Var, 26));
        addView(stVar, w7.z5.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        vcVar.setDelegate(new n7.z0(this));
    }

    public final void a(MediaController.PhotoEntry photoEntry, d81 d81Var, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        ci.d dVar = this.f32532b;
        dVar.f4851a = d6Var;
        dVar.j();
        int i11 = photoEntry.width;
        if (i11 > 0 && (i10 = photoEntry.height) > 0) {
            this.f32535f = Utilities.clamp(i10 / i11, 1.39f, 0.85f);
        } else {
            this.f32535f = 1.39f;
        }
        this.d = d81Var;
        long j3 = photoEntry.coverSavedPosition;
        if (j3 >= 0) {
            this.f32534e = j3;
            d81Var.L(j3, false);
        } else {
            this.f32534e = d81Var.n();
        }
        String path = d81Var.F.getPath();
        long p5 = d81Var.p();
        i2.f0 f0Var = d81Var.d;
        f0Var.B1();
        this.f32531a.o(false, path, p5, f0Var.Z);
        long p10 = d81Var.p();
        float max = 2.8f / ((float) Math.max(60L, p10));
        float max2 = (1.0f - max) * (((float) this.f32534e) / ((float) Math.max(1L, d81Var.p())));
        ci.vc vcVar = this.f32531a;
        vcVar.setVideoLeft(max2);
        vcVar.setVideoRight(max2 + max);
        vcVar.Z0 = 0L;
        vcVar.f6137a1 = p10;
        ci.pc pcVar = vcVar.h;
        if (pcVar != null) {
            ci.pc.a(pcVar, true);
        }
        vcVar.k();
    }

    public long getTime() {
        return this.f32534e;
    }

    public void setOnClose(Runnable runnable) {
        this.f32537r = runnable;
    }

    public void setOnGalleryImage(Utilities.Callback<MediaController.PhotoEntry> callback) {
        this.f32536n = callback;
    }
}
