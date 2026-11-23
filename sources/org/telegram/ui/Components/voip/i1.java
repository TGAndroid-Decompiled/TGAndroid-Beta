package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.o10;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.ik;
import org.webrtc.RendererCommon;
public final class i1 extends FrameLayout {
    public final n2 f41056a;
    public boolean f41057b;
    public boolean f41058c;
    public final long d;
    public final ik f41059e;
    public final j1 f41060f;

    public i1(j1 j1Var, Context context) {
        super(context);
        this.f41060f = j1Var;
        this.f41058c = true;
        this.d = SystemClock.elapsedRealtime();
        this.f41059e = new ik(this, 24);
        setBackgroundColor(-16777216);
        h hVar = new h(context);
        addView(hVar, ma.c(-1.0f, -1));
        n2 n2Var = new n2(context, false, false, false, false);
        this.f41056a = n2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        m2 m2Var = n2Var.d;
        m2Var.setScalingType(scalingType);
        n2Var.f41214b0 = 0;
        m2Var.setRotateTextureWithScreen(true);
        m2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = n2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(n2Var, ma.c(-1.0f, -1));
        t3 g10 = j1.g();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (g10 != null && sharedInstance != null && sharedInstance.getChat() != null) {
            sharedInstance.getAccount();
            hVar.a(sharedInstance.getChat());
        }
    }

    public final void a() {
        float f10;
        boolean a10 = this.f41060f.f41088b.a(this.d);
        if (this.f41058c == a10) {
            return;
        }
        this.f41058c = a10;
        n2 n2Var = this.f41056a;
        n2Var.animate().cancel();
        ViewPropertyAnimator animate = n2Var.animate();
        if (a10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        o10.n(animate, f10, 200L);
    }
}
