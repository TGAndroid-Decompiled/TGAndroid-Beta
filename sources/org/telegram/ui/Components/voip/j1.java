package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.i20;
import org.telegram.messenger.r3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.zj;
import org.webrtc.RendererCommon;
public final class j1 extends FrameLayout {
    public final o2 f40671a;
    public boolean f40672b;
    public boolean f40673c;
    public final long d;
    public final zj f40674e;
    public final k1 f40675f;

    public j1(k1 k1Var, Context context) {
        super(context);
        this.f40675f = k1Var;
        this.f40673c = true;
        this.d = SystemClock.elapsedRealtime();
        this.f40674e = new zj(this, 24);
        setBackgroundColor(-16777216);
        h hVar = new h(context);
        addView(hVar, ja.c(-1.0f, -1));
        o2 o2Var = new o2(context, false, false, false, false);
        this.f40671a = o2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        n2 n2Var = o2Var.d;
        n2Var.setScalingType(scalingType);
        o2Var.f40829b0 = 0;
        n2Var.setRotateTextureWithScreen(true);
        n2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = o2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(o2Var, ja.c(-1.0f, -1));
        r3 g10 = k1.g();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (g10 != null && sharedInstance != null && sharedInstance.getChat() != null) {
            sharedInstance.getAccount();
            hVar.a(sharedInstance.getChat());
        }
    }

    public final void a() {
        float f10;
        boolean a10 = this.f40675f.f40712b.a(this.d);
        if (this.f40673c == a10) {
            return;
        }
        this.f40673c = a10;
        o2 o2Var = this.f40671a;
        o2Var.animate().cancel();
        ViewPropertyAnimator animate = o2Var.animate();
        if (a10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        i20.m(animate, f10, 200L);
    }
}
