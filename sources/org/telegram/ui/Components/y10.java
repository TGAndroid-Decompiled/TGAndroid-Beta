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
public final class y10 extends FrameLayout implements org.telegram.messenger.is, VoIPService.StateListener {
    public float E;
    public final int F;
    public final fh0 G;
    public final ch0 H;
    public boolean I;
    public final x10[] J;
    public boolean K;
    public float L;
    public float M;
    public final OvershootInterpolator N;
    public float O;
    public final Paint f41833a;
    public final o9 f41834b;
    public final o9 f41835c;
    public float d;
    public float f41836e;
    public float f41837f;
    public x10 h;
    public x10 f41838n;
    public float f41839r;
    public boolean f41840s;
    public float f41841w;
    public final LinearGradient f41842x;
    public final Matrix f41843y;

    public y10(Context context, int i7) {
        super(context);
        this.f41833a = new Paint(1);
        this.f41834b = new o9(8);
        this.f41835c = new o9(9);
        this.f41839r = 1.0f;
        this.f41843y = new Matrix();
        this.E = 0.0f;
        new Random();
        this.J = new x10[4];
        this.N = new OvershootInterpolator();
        this.F = i7;
        for (int i10 = 0; i10 < 4; i10++) {
            this.J[i10] = new x10(i10);
        }
        this.f41834b.f37865b = org.telegram.messenger.g0.L(37.0f);
        this.f41834b.f37864a = org.telegram.messenger.g0.L(32.0f);
        this.f41835c.f37865b = org.telegram.messenger.g0.L(37.0f);
        this.f41835c.f37864a = org.telegram.messenger.g0.L(32.0f);
        this.f41834b.b();
        this.f41835c.b();
        ch0 ch0Var = new ch0(2131624334, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(30.0f), true, null);
        this.H = ch0Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setAnimation(ch0Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.f41842x = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.f41836e = min;
        this.f41837f = (min - this.d) / 265.0f;
    }

    public final void a() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (callState != 1 && callState != 2 && callState != 6 && callState != 5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, sharedInstance.getChat())) {
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
        if (i7 == org.telegram.messenger.ns.N4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i7 == org.telegram.messenger.ns.f25596w2) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        int i7;
        super.onAttachedToWindow();
        setAmplitude(0.0d);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.N4);
        org.telegram.messenger.ns.f(this.F).c(this, org.telegram.messenger.ns.f25596w2);
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
        ch0 ch0Var = this.H;
        ch0Var.P(i7);
        ch0Var.N(ch0Var.f33581f - 1, false, true);
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
        ch0 ch0Var = this.H;
        if (ch0Var.P(i7)) {
            if (z10) {
                ch0Var.M(0);
            } else {
                ch0Var.M(12);
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
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.N4);
        org.telegram.messenger.ns.f(this.F).n(this, org.telegram.messenger.ns.f25596w2);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y10.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s10 s10Var = s10.f39139f0;
        if (s10Var != null) {
            if (s10Var.f39156y) {
                i7 = 2131754901;
            } else {
                i7 = 2131754816;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.M0(i7, null)));
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
        String M0;
        x10 x10Var = this.h;
        if (x10Var != null && x10Var.f41510i == i7) {
            return;
        }
        this.f41838n = x10Var;
        x10 x10Var2 = this.J[i7];
        this.h = x10Var2;
        float f10 = 0.0f;
        if (x10Var != null) {
            this.f41839r = 0.0f;
        } else {
            this.f41839r = 1.0f;
            int i10 = x10Var2.f41510i;
            if (i10 != 3 && i10 != 2) {
                f10 = 1.0f;
            }
            this.E = f10;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && org.telegram.messenger.t3.W(sharedInstance.getChat())) {
            M0 = org.telegram.messenger.hd.M0(2131743447, null);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131743306, null);
        }
        if (i7 == 0) {
            M0 = i5.c.k(2131743233, null, r.b.m(M0, ", "));
        } else if (i7 == 2) {
            M0 = i5.c.k(2131751809, null, r.b.m(M0, ", "));
        } else if (i7 == 3) {
            M0 = i5.c.k(2131743292, null, r.b.m(M0, ", "));
        }
        setContentDescription(M0);
        invalidate();
    }
}
