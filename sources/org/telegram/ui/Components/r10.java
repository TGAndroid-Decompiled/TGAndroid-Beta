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
public final class r10 extends FrameLayout implements org.telegram.messenger.cs, VoIPService.StateListener {
    public float E;
    public final int F;
    public final fh0 G;
    public final ch0 H;
    public long I;
    public final boolean J;
    public final Random K;
    public boolean L;
    public final q10[] M;
    public boolean N;
    public float O;
    public float P;
    public final OvershootInterpolator Q;
    public float R;
    public final Paint f37597a;
    public final q9 f37598b;
    public final q9 f37599c;
    public float d;
    public float f37600e;
    public float f37601f;
    public q10 h;
    public q10 f37602n;
    public float f37603r;
    public boolean f37604s;
    public float f37605w;
    public final LinearGradient f37606x;
    public final Matrix f37607y;

    public r10(int i3, Context context, boolean z10) {
        super(context);
        this.f37597a = new Paint(1);
        this.f37598b = new q9(8);
        this.f37599c = new q9(9);
        this.f37603r = 1.0f;
        this.f37607y = new Matrix();
        this.E = 0.0f;
        this.K = new Random();
        this.M = new q10[4];
        this.Q = new OvershootInterpolator();
        this.J = z10;
        this.F = i3;
        for (int i10 = 0; i10 < 4; i10++) {
            this.M[i10] = new q10(i10);
        }
        this.f37598b.f37382b = org.telegram.messenger.g0.L(37.0f);
        this.f37598b.f37381a = org.telegram.messenger.g0.L(32.0f);
        this.f37599c.f37382b = org.telegram.messenger.g0.L(37.0f);
        this.f37599c.f37381a = org.telegram.messenger.g0.L(32.0f);
        this.f37598b.b();
        this.f37599c.b();
        ch0 ch0Var = new ch0(2131624333, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(30.0f), true, null);
        this.H = ch0Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.G = imageView;
        imageView.setAnimation(ch0Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.f37606x = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        if (z10) {
            setState(0);
        }
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.f37600e = min;
        this.f37601f = (min - this.d) / 265.0f;
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
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.N4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i3 == org.telegram.messenger.hs.f23328w2) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        int i3;
        super.onAttachedToWindow();
        if (!this.J) {
            setAmplitude(0.0d);
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.N4);
            org.telegram.messenger.hs.f(this.F).c(this, org.telegram.messenger.hs.f23328w2);
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (z10) {
                i3 = 13;
            } else {
                i3 = 24;
            }
            ch0 ch0Var = this.H;
            ch0Var.P(i3);
            ch0Var.N(ch0Var.f32727f - 1, false, true);
            a();
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z10;
        int i3;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i3 = 13;
        } else {
            i3 = 24;
        }
        ch0 ch0Var = this.H;
        if (ch0Var.P(i3)) {
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
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.s0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.J) {
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.N4);
            org.telegram.messenger.hs.f(this.F).n(this, org.telegram.messenger.hs.f23328w2);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r10.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        l10 l10Var = l10.f35545e0;
        if (l10Var != null) {
            if (l10Var.f35560x) {
                i3 = 2131754901;
            } else {
                i3 = 2131754816;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.bd.M0(i3, null)));
        }
    }

    @Override
    public final void onMediaStateUpdated(int i3, int i10) {
        org.telegram.messenger.voip.s0.d(this, i3, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.s0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i3) {
        org.telegram.messenger.voip.s0.f(this, i3);
    }

    @Override
    public final void onStateChanged(int i3) {
        a();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.s0.h(this, z10);
    }

    public void setPinnedProgress(float f10) {
        this.P = f10;
    }

    public void setPressedState(boolean z10) {
        this.N = z10;
    }

    public void setRemoveAngle(double d) {
        this.R = (float) d;
    }

    public void setState(int i3) {
        String M0;
        q10 q10Var = this.h;
        if (q10Var != null && q10Var.f37316i == i3) {
            return;
        }
        this.f37602n = q10Var;
        q10 q10Var2 = this.M[i3];
        this.h = q10Var2;
        float f10 = 0.0f;
        if (q10Var != null) {
            this.f37603r = 0.0f;
        } else {
            this.f37603r = 1.0f;
            int i10 = q10Var2.f37316i;
            if (i10 != 3 && i10 != 2) {
                f10 = 1.0f;
            }
            this.E = f10;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && org.telegram.messenger.t3.W(sharedInstance.getChat())) {
            M0 = org.telegram.messenger.bd.M0(2131743457, null);
        } else {
            M0 = org.telegram.messenger.bd.M0(2131743316, null);
        }
        if (i3 == 0) {
            M0 = k2.p1.k(2131743243, null, t4.c.h(M0, ", "));
        } else if (i3 == 2) {
            M0 = k2.p1.k(2131751809, null, t4.c.h(M0, ", "));
        } else if (i3 == 3) {
            M0 = k2.p1.k(2131743302, null, t4.c.h(M0, ", "));
        }
        setContentDescription(M0);
        invalidate();
    }
}
