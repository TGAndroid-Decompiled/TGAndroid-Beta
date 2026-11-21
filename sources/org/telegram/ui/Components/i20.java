package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Random;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class i20 extends FrameLayout implements org.telegram.messenger.fs, VoIPService.StateListener {
    public float E;
    public final int F;
    public final rh0 G;
    public final oh0 H;
    public boolean I;
    public final h20[] J;
    public boolean K;
    public float L;
    public float M;
    public final OvershootInterpolator N;
    public float O;
    public final Paint f36124a;
    public final w9 f36125b;
    public final w9 f36126c;
    public float d;
    public float f36127e;
    public float f36128f;
    public h20 h;
    public h20 f36129n;
    public float f36130r;
    public boolean f36131s;
    public float f36132w;
    public final LinearGradient f36133x;
    public final Matrix f36134y;

    public i20(Context context, int i7) {
        super(context);
        this.f36124a = new Paint(1);
        this.f36125b = new w9(8);
        this.f36126c = new w9(9);
        this.f36130r = 1.0f;
        this.f36134y = new Matrix();
        this.E = 0.0f;
        new Random();
        this.J = new h20[4];
        this.N = new OvershootInterpolator();
        this.F = i7;
        for (int i10 = 0; i10 < 4; i10++) {
            this.J[i10] = new h20(i10);
        }
        this.f36125b.f41720b = org.telegram.messenger.g0.L(37.0f);
        this.f36125b.f41719a = org.telegram.messenger.g0.L(32.0f);
        this.f36126c.f41720b = org.telegram.messenger.g0.L(37.0f);
        this.f36126c.f41719a = org.telegram.messenger.g0.L(32.0f);
        this.f36125b.b();
        this.f36126c.b();
        oh0 oh0Var = new oh0(2131624334, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(30.0f), true, null);
        this.H = oh0Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setAnimation(oh0Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.f36133x = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.f36127e = min;
        this.f36128f = (min - this.d) / 265.0f;
    }

    public final void a() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (callState != 1 && callState != 2 && callState != 6 && callState != 5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, sharedInstance.getChat())) {
                    if (!sharedInstance.isMicMute()) {
                        sharedInstance.setMicMute(true, false, false);
                    }
                    setState(3);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    if (getParent() != null) {
                        ((View) getParent()).dispatchTouchEvent(obtain);
                        return;
                    }
                    return;
                }
                setState(sharedInstance.isMicMute() ? 1 : 0);
                return;
            }
            setState(2);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.Q4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i7 == org.telegram.messenger.ks.f25241w2) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        int i7;
        super.onAttachedToWindow();
        setAmplitude(0.0d);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.Q4);
        org.telegram.messenger.ks.f(this.F).c(this, org.telegram.messenger.ks.f25241w2);
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        if (z10) {
            i7 = 13;
        } else {
            i7 = 24;
        }
        oh0 oh0Var = this.H;
        oh0Var.P(i7);
        oh0Var.N(oh0Var.f38219f - 1, false, true);
        a();
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z10;
        int i7;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i7 = 13;
        } else {
            i7 = 24;
        }
        oh0 oh0Var = this.H;
        if (oh0Var.P(i7)) {
            if (z10) {
                oh0Var.M(0);
            } else {
                oh0Var.M(12);
            }
        }
        this.G.d();
        a();
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.t0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.Q4);
        org.telegram.messenger.ks.f(this.F).n(this, org.telegram.messenger.ks.f25241w2);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i20.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c20 c20Var = c20.f33987f0;
        if (c20Var != null) {
            if (c20Var.f34004y) {
                i7 = 2131754901;
            } else {
                i7 = 2131754815;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.N0(i7, null)));
        }
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.t0.d(this, i7, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.t0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        a();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public void setPinnedProgress(float f10) {
        this.M = f10;
    }

    public void setPressedState(boolean z10) {
        this.K = z10;
    }

    public void setRemoveAngle(double d) {
        this.O = (float) d;
    }

    public void setState(int i7) {
        String N0;
        h20 h20Var = this.h;
        if (h20Var != null && h20Var.f35762i == i7) {
            return;
        }
        this.f36129n = h20Var;
        h20 h20Var2 = this.J[i7];
        this.h = h20Var2;
        float f10 = 0.0f;
        if (h20Var != null) {
            this.f36130r = 0.0f;
        } else {
            this.f36130r = 1.0f;
            int i10 = h20Var2.f35762i;
            if (i10 != 3 && i10 != 2) {
                f10 = 1.0f;
            }
            this.E = f10;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && org.telegram.messenger.v3.W(sharedInstance.getChat())) {
            N0 = org.telegram.messenger.gd.N0(2131743204, null);
        } else {
            N0 = org.telegram.messenger.gd.N0(2131743063, null);
        }
        if (i7 == 0) {
            N0 = i5.c.k(2131742990, null, p5.c.n(N0, ", "));
        } else if (i7 == 2) {
            N0 = i5.c.k(2131751797, null, p5.c.n(N0, ", "));
        } else if (i7 == 3) {
            N0 = i5.c.k(2131743049, null, p5.c.n(N0, ", "));
        }
        setContentDescription(N0);
        invalidate();
    }
}
