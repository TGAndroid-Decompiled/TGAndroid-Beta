package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.webrtc.RendererCommon;
public final class m extends FrameLayout {
    public final o2 f41045a;
    public final h f41046b;
    public final TextView f41047c;
    public final TextView d;
    public final ImageView f41048e;
    public final k f41049f;
    public TLRPC.User h;
    public boolean f41050n;
    public long f41051r;

    public m(Context context) {
        super(context);
        this.f41050n = false;
        this.f41051r = SystemClock.elapsedRealtime();
        setBackgroundColor(-14999773);
        o2 o2Var = new o2(context, false, true, false, false);
        this.f41045a = o2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        n2 n2Var = o2Var.d;
        n2Var.setScalingType(scalingType);
        n2Var.setEnableHardwareScaler(true);
        n2Var.setRotateTextureWithScreen(true);
        o2Var.f41109b0 = 1;
        n2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = o2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(o2Var, na.c(-1.0f, -1));
        h hVar = new h(context);
        this.f41046b = hVar;
        addView(hVar, na.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f41047c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        addView(textView, na.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(-1275068417);
        textView2.setTextSize(1, 11.0f);
        textView2.setSingleLine();
        textView2.setGravity(1);
        textView2.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        textView2.setVisibility(8);
        addView(textView2, na.d(-1, -2.0f, 49, 32.0f, 8.0f, 32.0f, 0.0f));
        k kVar = new k(context);
        this.f41049f = kVar;
        addView(kVar, na.c(-1.0f, -1));
        kVar.a();
        ImageView imageView = new ImageView(context);
        this.f41048e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(n6.L(org.telegram.messenger.g0.L(28.0f), 1711276032));
        addView(imageView, na.d(28, 28.0f, 51, 6.0f, 6.0f, 0.0f, 0.0f));
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
        TextView textView = this.f41047c;
        h hVar = this.f41046b;
        if (user != null && user != this.h) {
            this.h = user;
            sharedInstance.getAccount();
            hVar.a(user);
            textView.setText(n10.q(user));
        }
        boolean a10 = a(sharedInstance);
        boolean z11 = true;
        o2 o2Var = this.f41045a;
        if (a10 && !o2Var.d.isFirstFrameRendered() && SystemClock.elapsedRealtime() - this.f41051r < 1200) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!a10 || (!o2Var.d.isFirstFrameRendered() && !z10)) {
            z11 = false;
        }
        if (this.f41050n != z11) {
            this.f41050n = z11;
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
            i7 = 2131232432;
        } else {
            i7 = 2131232436;
        }
        this.f41048e.setImageResource(i7);
        this.f41049f.c();
        int callState = sharedInstance.getCallState();
        TextView textView2 = this.d;
        if (callState == 5) {
            textView2.setText(gd.N0(2131743003, null));
            textView2.setVisibility(0);
        } else if (callState != 3) {
            textView2.setText(gd.N0(2131743169, null));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }
}
