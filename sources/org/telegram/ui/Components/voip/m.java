package org.telegram.ui.Components.voip;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.messenger.q10;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.webrtc.RendererCommon;
public final class m extends FrameLayout {
    public final o2 f40766a;
    public final h f40767b;
    public final TextView f40768c;
    public final TextView d;
    public final ImageView f40769e;
    public final k f40770f;
    public TLRPC.User h;
    public boolean f40771n;
    public long f40772r;

    public m(Context context) {
        super(context);
        this.f40771n = false;
        this.f40772r = SystemClock.elapsedRealtime();
        setBackgroundColor(-14999773);
        o2 o2Var = new o2(context, false, true, false, false);
        this.f40766a = o2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        n2 n2Var = o2Var.d;
        n2Var.setScalingType(scalingType);
        n2Var.setEnableHardwareScaler(true);
        n2Var.setRotateTextureWithScreen(true);
        o2Var.f40829b0 = 1;
        n2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = o2Var.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(o2Var, ja.c(-1.0f, -1));
        h hVar = new h(context);
        this.f40767b = hVar;
        addView(hVar, ja.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.f40768c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        addView(textView, ja.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextColor(-1275068417);
        textView2.setTextSize(1, 11.0f);
        textView2.setSingleLine();
        textView2.setGravity(1);
        textView2.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        textView2.setVisibility(8);
        addView(textView2, ja.d(-1, -2.0f, 49, 32.0f, 8.0f, 32.0f, 0.0f));
        k kVar = new k(context);
        this.f40770f = kVar;
        addView(kVar, ja.c(-1.0f, -1));
        kVar.a();
        ImageView imageView = new ImageView(context);
        this.f40769e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(j6.L(org.telegram.messenger.g0.L(28.0f), 1711276032));
        addView(imageView, ja.d(28, 28.0f, 51, 6.0f, 6.0f, 0.0f, 0.0f));
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
        TextView textView = this.f40768c;
        h hVar = this.f40767b;
        if (user != null && user != this.h) {
            this.h = user;
            sharedInstance.getAccount();
            hVar.a(user);
            textView.setText(q10.p(user));
        }
        boolean a10 = a(sharedInstance);
        boolean z11 = true;
        o2 o2Var = this.f40766a;
        if (a10 && !o2Var.d.isFirstFrameRendered() && SystemClock.elapsedRealtime() - this.f40772r < 1200) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!a10 || (!o2Var.d.isFirstFrameRendered() && !z10)) {
            z11 = false;
        }
        if (this.f40771n != z11) {
            this.f40771n = z11;
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
            i7 = 2131232428;
        } else {
            i7 = 2131232432;
        }
        this.f40769e.setImageResource(i7);
        this.f40770f.c();
        int callState = sharedInstance.getCallState();
        TextView textView2 = this.d;
        if (callState == 5) {
            textView2.setText(hd.M0(2131743253, null));
            textView2.setVisibility(0);
        } else if (callState != 3) {
            textView2.setText(hd.M0(2131743419, null));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }
}
