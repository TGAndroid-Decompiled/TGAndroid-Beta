package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.r3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.dt;
import org.webrtc.RendererCommon;
public final class f1 extends FrameLayout {
    public final k2 f39132a;
    public boolean f39133b;
    public boolean f39134c;
    public final long d;
    public final dt f39135e;
    public final g1 f39136f;

    public f1(g1 g1Var, Context context) {
        super(context);
        this.f39136f = g1Var;
        this.f39134c = true;
        this.d = SystemClock.elapsedRealtime();
        this.f39135e = new dt(this, 21);
        setBackgroundColor(-16777216);
        h hVar = new h(context);
        addView(hVar, ha.c(-1.0f, -1));
        k2 k2Var = new k2(context, false, false, false, false);
        this.f39132a = k2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        j2 j2Var = k2Var.d;
        j2Var.setScalingType(scalingType);
        k2Var.f39275a0 = 0;
        j2Var.setRotateTextureWithScreen(true);
        j2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = k2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(k2Var, ha.c(-1.0f, -1));
        r3 d = g1.d();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (d != null && sharedInstance != null && sharedInstance.getChat() != null) {
            sharedInstance.getAccount();
            hVar.a(sharedInstance.getChat());
        }
    }

    public final void a() {
        float f10;
        boolean a10 = this.f39136f.f39163b.a(this.d);
        if (this.f39134c == a10) {
            return;
        }
        this.f39134c = a10;
        k2 k2Var = this.f39132a;
        k2Var.animate().cancel();
        ViewPropertyAnimator animate = k2Var.animate();
        if (a10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.messenger.camera.q.k(animate, f10, 200L);
    }
}
