package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.webrtc.RendererCommon;
public final class m extends FrameLayout {
    public final n2 f41171a;
    public final h f41172b;
    public final TextView f41173c;
    public final TextView d;
    public final ImageView f41174e;
    public final k f41175f;
    public TLRPC.User h;
    public boolean f41176n;
    public long f41177r;

    public m(Context context) {
        super(context);
        this.f41176n = false;
        this.f41177r = SystemClock.elapsedRealtime();
        setBackgroundColor(-14999773);
        n2 n2Var = new n2(context, false, true, false, false);
        this.f41171a = n2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        m2 m2Var = n2Var.d;
        m2Var.setScalingType(scalingType);
        m2Var.setEnableHardwareScaler(true);
        m2Var.setRotateTextureWithScreen(true);
        n2Var.f41214b0 = 1;
        m2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = n2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(n2Var, ma.c(-1.0f, -1));
        h hVar = new h(context);
        this.f41172b = hVar;
        addView(hVar, ma.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f41173c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        addView(textView, ma.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(-1275068417);
        textView2.setTextSize(1, 11.0f);
        textView2.setSingleLine();
        textView2.setGravity(1);
        textView2.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        textView2.setVisibility(8);
        addView(textView2, ma.d(-1, -2.0f, 49, 32.0f, 8.0f, 32.0f, 0.0f));
        k kVar = new k(context);
        this.f41175f = kVar;
        addView(kVar, ma.c(-1.0f, -1));
        kVar.a();
        ImageView imageView = new ImageView(context);
        this.f41174e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(m6.L(org.telegram.messenger.g0.L(28.0f), 1711276032));
        addView(imageView, ma.d(28, 28.0f, 51, 6.0f, 6.0f, 0.0f, 0.0f));
    }

    public static boolean a(VoIPService voIPService) {
        if (voIPService != null && voIPService.getRemoteVideoState() == 2) {
            return true;
        }
        return false;
    }

    public final void b() {
        boolean z10;
        int i7;
        int i10;
        int i11;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.User user = sharedInstance.getUser();
        TextView textView = this.f41173c;
        h hVar = this.f41172b;
        if (user != null && user != this.h) {
            this.h = user;
            sharedInstance.getAccount();
            hVar.a(user);
            textView.setText(p10.q(user));
        }
        boolean a10 = a(sharedInstance);
        boolean z11 = true;
        n2 n2Var = this.f41171a;
        if (a10 && !n2Var.d.isFirstFrameRendered() && SystemClock.elapsedRealtime() - this.f41177r < 1200) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!a10 || (!n2Var.d.isFirstFrameRendered() && !z10)) {
            z11 = false;
        }
        if (this.f41176n != z11) {
            this.f41176n = z11;
            if (z11) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            hVar.setVisibility(i10);
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            textView.setVisibility(i11);
        }
        if (sharedInstance.isMicMute()) {
            i7 = 2131232429;
        } else {
            i7 = 2131232433;
        }
        this.f41174e.setImageResource(i7);
        this.f41175f.c();
        int callState = sharedInstance.getCallState();
        TextView textView2 = this.d;
        if (callState == 5) {
            textView2.setText(hd.N0(2131743008, null));
            textView2.setVisibility(0);
        } else if (callState != 3) {
            textView2.setText(hd.N0(2131743174, null));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }
}
