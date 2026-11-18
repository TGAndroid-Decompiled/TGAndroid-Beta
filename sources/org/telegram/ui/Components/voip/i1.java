package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.n10;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.gk;
import org.webrtc.RendererCommon;
public final class i1 extends FrameLayout {
    public final n2 f40919a;
    public boolean f40920b;
    public boolean f40921c;
    public final long d;
    public final gk f40922e;
    public final j1 f40923f;

    public i1(j1 j1Var, Context context) {
        super(context);
        this.f40923f = j1Var;
        this.f40921c = true;
        this.d = SystemClock.elapsedRealtime();
        this.f40922e = new gk(this, 24);
        setBackgroundColor(-16777216);
        h hVar = new h(context);
        addView(hVar, ma.c(-1.0f, -1));
        n2 n2Var = new n2(context, false, false, false, false);
        this.f40919a = n2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        m2 m2Var = n2Var.d;
        m2Var.setScalingType(scalingType);
        n2Var.f41077b0 = 0;
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
        boolean a10 = this.f40923f.f40951b.a(this.d);
        if (this.f40921c == a10) {
            return;
        }
        this.f40921c = a10;
        n2 n2Var = this.f40919a;
        n2Var.animate().cancel();
        ViewPropertyAnimator animate = n2Var.animate();
        if (a10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        n10.n(animate, f10, 200L);
    }
}
