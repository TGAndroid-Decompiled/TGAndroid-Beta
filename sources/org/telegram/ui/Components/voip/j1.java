package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.m10;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.rc;
import org.webrtc.RendererCommon;
public final class j1 extends FrameLayout {
    public final o2 f40950a;
    public boolean f40951b;
    public boolean f40952c;
    public final long d;
    public final rc f40953e;
    public final k1 f40954f;

    public j1(k1 k1Var, Context context) {
        super(context);
        this.f40954f = k1Var;
        this.f40952c = true;
        this.d = SystemClock.elapsedRealtime();
        this.f40953e = new rc(this, 27);
        setBackgroundColor(-16777216);
        h hVar = new h(context);
        addView(hVar, na.c(-1.0f, -1));
        o2 o2Var = new o2(context, false, false, false, false);
        this.f40950a = o2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        n2 n2Var = o2Var.d;
        n2Var.setScalingType(scalingType);
        o2Var.f41109b0 = 0;
        n2Var.setRotateTextureWithScreen(true);
        n2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = o2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(o2Var, na.c(-1.0f, -1));
        t3 d = k1.d();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (d != null && sharedInstance != null && sharedInstance.getChat() != null) {
            sharedInstance.getAccount();
            hVar.a(sharedInstance.getChat());
        }
    }

    public final void a() {
        float f10;
        boolean a10 = this.f40954f.f40991b.a(this.d);
        if (this.f40952c == a10) {
            return;
        }
        this.f40952c = a10;
        o2 o2Var = this.f40950a;
        o2Var.animate().cancel();
        ViewPropertyAnimator animate = o2Var.animate();
        if (a10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        m10.n(animate, f10, 200L);
    }
}
