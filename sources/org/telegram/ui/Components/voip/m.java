package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.t10;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l6;
import org.webrtc.RendererCommon;
public final class m extends FrameLayout {
    public final k2 f39450a;
    public final h f39451b;
    public final TextView f39452c;
    public final TextView d;
    public final ImageView f39453e;
    public final k f39454f;
    public TLRPC.User h;
    public boolean f39455n;
    public long f39456r;

    public m(Context context) {
        super(context);
        this.f39455n = false;
        this.f39456r = SystemClock.elapsedRealtime();
        setBackgroundColor(-14999773);
        k2 k2Var = new k2(context, false, true, false, false);
        this.f39450a = k2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        j2 j2Var = k2Var.d;
        j2Var.setScalingType(scalingType);
        j2Var.setEnableHardwareScaler(true);
        j2Var.setRotateTextureWithScreen(true);
        k2Var.f39420a0 = 1;
        j2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = k2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(k2Var, ha.c(-1.0f, -1));
        h hVar = new h(context);
        this.f39451b = hVar;
        addView(hVar, ha.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f39452c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        addView(textView, ha.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(-1275068417);
        textView2.setTextSize(1, 11.0f);
        textView2.setSingleLine();
        textView2.setGravity(1);
        textView2.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        textView2.setVisibility(8);
        addView(textView2, ha.d(-1, -2.0f, 49, 32.0f, 8.0f, 32.0f, 0.0f));
        k kVar = new k(context);
        this.f39454f = kVar;
        addView(kVar, ha.c(-1.0f, -1));
        kVar.a();
        ImageView imageView = new ImageView(context);
        this.f39453e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(l6.L(org.telegram.messenger.g0.L(28.0f), 1711276032));
        addView(imageView, ha.d(28, 28.0f, 51, 6.0f, 6.0f, 0.0f, 0.0f));
    }

    public static boolean a(VoIPService voIPService) {
        if (voIPService != null && voIPService.getRemoteVideoState() == 2) {
            return true;
        }
        return false;
    }

    public final void b() {
        boolean z9;
        int i7;
        int i10;
        int i11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.User user = sharedInstance.getUser();
        TextView textView = this.f39452c;
        h hVar = this.f39451b;
        if (user != null && user != this.h) {
            this.h = user;
            sharedInstance.getAccount();
            hVar.a(user);
            textView.setText(t10.p(user));
        }
        boolean a10 = a(sharedInstance);
        boolean z10 = true;
        k2 k2Var = this.f39450a;
        if (a10 && !k2Var.d.isFirstFrameRendered() && SystemClock.elapsedRealtime() - this.f39456r < 1200) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!a10 || (!k2Var.d.isFirstFrameRendered() && !z9)) {
            z10 = false;
        }
        if (this.f39455n != z10) {
            this.f39455n = z10;
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            hVar.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            textView.setVisibility(i11);
        }
        if (sharedInstance.isMicMute()) {
            i7 = 2131232427;
        } else {
            i7 = 2131232431;
        }
        this.f39453e.setImageResource(i7);
        this.f39454f.c();
        int callState = sharedInstance.getCallState();
        TextView textView2 = this.d;
        if (callState == 5) {
            textView2.setText(id.M0(2131743253, null));
            textView2.setVisibility(0);
        } else if (callState != 3) {
            textView2.setText(id.M0(2131743419, null));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }
}
