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
public final class f20 extends FrameLayout implements org.telegram.messenger.fs, VoIPService.StateListener {
    public float E;
    public final int F;
    public final ph0 G;
    public final mh0 H;
    public boolean I;
    public final e20[] J;
    public boolean K;
    public float L;
    public float M;
    public final OvershootInterpolator N;
    public float O;
    public final Paint f34903a;
    public final w9 f34904b;
    public final w9 f34905c;
    public float d;
    public float f34906e;
    public float f34907f;
    public e20 h;
    public e20 f34908n;
    public float f34909r;
    public boolean f34910s;
    public float f34911w;
    public final LinearGradient f34912x;
    public final Matrix f34913y;

    public f20(Context context, int i7) {
        super(context);
        this.f34903a = new Paint(1);
        this.f34904b = new w9(8);
        this.f34905c = new w9(9);
        this.f34909r = 1.0f;
        this.f34913y = new Matrix();
        this.E = 0.0f;
        new Random();
        this.J = new e20[4];
        this.N = new OvershootInterpolator();
        this.F = i7;
        for (int i10 = 0; i10 < 4; i10++) {
            this.J[i10] = new e20(i10);
        }
        this.f34904b.f41629b = org.telegram.messenger.g0.L(37.0f);
        this.f34904b.f41628a = org.telegram.messenger.g0.L(32.0f);
        this.f34905c.f41629b = org.telegram.messenger.g0.L(37.0f);
        this.f34905c.f41628a = org.telegram.messenger.g0.L(32.0f);
        this.f34904b.b();
        this.f34905c.b();
        mh0 mh0Var = new mh0(2131624334, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(30.0f), true, null);
        this.H = mh0Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setAnimation(mh0Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.f34912x = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.f34906e = min;
        this.f34907f = (min - this.d) / 265.0f;
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
        if (i7 == org.telegram.messenger.ks.P4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i7 == org.telegram.messenger.ks.f25215w2) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        int i7;
        super.onAttachedToWindow();
        setAmplitude(0.0d);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.P4);
        org.telegram.messenger.ks.f(this.F).c(this, org.telegram.messenger.ks.f25215w2);
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
        mh0 mh0Var = this.H;
        mh0Var.P(i7);
        mh0Var.N(mh0Var.f37488f - 1, false, true);
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
        mh0 mh0Var = this.H;
        if (mh0Var.P(i7)) {
            if (z10) {
                mh0Var.M(0);
            } else {
                mh0Var.M(12);
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
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.P4);
        org.telegram.messenger.ks.f(this.F).n(this, org.telegram.messenger.ks.f25215w2);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f20.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z10 z10Var = z10.f42710f0;
        if (z10Var != null) {
            if (z10Var.f42727y) {
                i7 = 2131754901;
            } else {
                i7 = 2131754816;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.gd.M0(i7, null)));
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
        e20 e20Var = this.h;
        if (e20Var != null && e20Var.f34581i == i7) {
            return;
        }
        this.f34908n = e20Var;
        e20 e20Var2 = this.J[i7];
        this.h = e20Var2;
        float f10 = 0.0f;
        if (e20Var != null) {
            this.f34909r = 0.0f;
        } else {
            this.f34909r = 1.0f;
            int i10 = e20Var2.f34581i;
            if (i10 != 3 && i10 != 2) {
                f10 = 1.0f;
            }
            this.E = f10;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && org.telegram.messenger.v3.W(sharedInstance.getChat())) {
            M0 = org.telegram.messenger.gd.M0(2131743210, null);
        } else {
            M0 = org.telegram.messenger.gd.M0(2131743069, null);
        }
        if (i7 == 0) {
            M0 = i5.c.k(2131742996, null, p5.c.n(M0, ", "));
        } else if (i7 == 2) {
            M0 = i5.c.k(2131751798, null, p5.c.n(M0, ", "));
        } else if (i7 == 3) {
            M0 = i5.c.k(2131743055, null, p5.c.n(M0, ", "));
        }
        setContentDescription(M0);
        invalidate();
    }
}
