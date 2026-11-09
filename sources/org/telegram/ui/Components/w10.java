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
public final class w10 extends FrameLayout implements org.telegram.messenger.ls, VoIPService.StateListener {
    public float D;
    public final int E;
    public final dh0 F;
    public final ah0 G;
    public boolean H;
    public final v10[] I;
    public boolean J;
    public float K;
    public float L;
    public final OvershootInterpolator M;
    public float N;
    public final Paint f39866a;
    public final r9 f39867b;
    public final r9 f39868c;
    public float d;
    public float f39869e;
    public float f39870f;
    public v10 h;
    public v10 f39871n;
    public float f39872r;
    public boolean f39873s;
    public float f39874w;
    public final LinearGradient f39875x;
    public final Matrix f39876y;

    public w10(Context context, int i7) {
        super(context);
        this.f39866a = new Paint(1);
        this.f39867b = new r9(8);
        this.f39868c = new r9(9);
        this.f39872r = 1.0f;
        this.f39876y = new Matrix();
        this.D = 0.0f;
        new Random();
        this.I = new v10[4];
        this.M = new OvershootInterpolator();
        this.E = i7;
        for (int i10 = 0; i10 < 4; i10++) {
            this.I[i10] = new v10(i10);
        }
        this.f39867b.f37588b = org.telegram.messenger.g0.L(37.0f);
        this.f39867b.f37587a = org.telegram.messenger.g0.L(32.0f);
        this.f39868c.f37588b = org.telegram.messenger.g0.L(37.0f);
        this.f39868c.f37587a = org.telegram.messenger.g0.L(32.0f);
        this.f39867b.b();
        this.f39868c.b();
        ah0 ah0Var = new ah0(2131624333, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(30.0f), true, null);
        this.G = ah0Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.F = imageView;
        imageView.setAnimation(ah0Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.f39875x = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.f39869e = min;
        this.f39870f = (min - this.d) / 265.0f;
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
        if (i7 == org.telegram.messenger.qs.N4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i7 == org.telegram.messenger.qs.f25099w2) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z9;
        int i7;
        super.onAttachedToWindow();
        setAmplitude(0.0d);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.N4);
        org.telegram.messenger.qs.f(this.E).c(this, org.telegram.messenger.qs.f25099w2);
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        if (z9) {
            i7 = 13;
        } else {
            i7 = 24;
        }
        ah0 ah0Var = this.G;
        ah0Var.P(i7);
        ah0Var.N(ah0Var.f31828f - 1, false, true);
        a();
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z9;
        int i7;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i7 = 13;
        } else {
            i7 = 24;
        }
        ah0 ah0Var = this.G;
        if (ah0Var.P(i7)) {
            if (z9) {
                ah0Var.M(0);
            } else {
                ah0Var.M(12);
            }
        }
        this.F.d();
        a();
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z9) {
        org.telegram.messenger.voip.s0.c(this, z9);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.N4);
        org.telegram.messenger.qs.f(this.E).n(this, org.telegram.messenger.qs.f25099w2);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w10.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q10 q10Var = q10.f37162e0;
        if (q10Var != null) {
            if (q10Var.f37178y) {
                i7 = 2131754901;
            } else {
                i7 = 2131754816;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.id.M0(i7, null)));
        }
    }

    @Override
    public final void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.s0.d(this, i7, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z9) {
        org.telegram.messenger.voip.s0.e(this, z9);
    }

    @Override
    public final void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.s0.f(this, i7);
    }

    @Override
    public final void onStateChanged(int i7) {
        a();
    }

    @Override
    public final void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }

    public void setPinnedProgress(float f10) {
        this.L = f10;
    }

    public void setPressedState(boolean z9) {
        this.J = z9;
    }

    public void setRemoveAngle(double d) {
        this.N = (float) d;
    }

    public void setState(int i7) {
        String M0;
        v10 v10Var = this.h;
        if (v10Var != null && v10Var.f38886i == i7) {
            return;
        }
        this.f39871n = v10Var;
        v10 v10Var2 = this.I[i7];
        this.h = v10Var2;
        float f10 = 0.0f;
        if (v10Var != null) {
            this.f39872r = 0.0f;
        } else {
            this.f39872r = 1.0f;
            int i10 = v10Var2.f38886i;
            if (i10 != 3 && i10 != 2) {
                f10 = 1.0f;
            }
            this.D = f10;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && org.telegram.messenger.t3.W(sharedInstance.getChat())) {
            M0 = org.telegram.messenger.id.M0(2131743447, null);
        } else {
            M0 = org.telegram.messenger.id.M0(2131743306, null);
        }
        if (i7 == 0) {
            M0 = jg.g.l(2131743233, null, rf.b.j(M0, ", "));
        } else if (i7 == 2) {
            M0 = jg.g.l(2131751809, null, rf.b.j(M0, ", "));
        } else if (i7 == 3) {
            M0 = jg.g.l(2131743292, null, rf.b.j(M0, ", "));
        }
        setContentDescription(M0);
        invalidate();
    }
}
