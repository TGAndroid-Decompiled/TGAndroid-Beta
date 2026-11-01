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
public final class m20 extends FrameLayout implements org.telegram.messenger.vs, VoIPService.StateListener {
    public float D;
    public final int E;
    public final fi0 F;
    public final ci0 G;
    public long H;
    public final boolean I;
    public final Random J;
    public boolean K;
    public final l20[] L;
    public boolean M;
    public float N;
    public float O;
    public final OvershootInterpolator P;
    public float Q;
    public final Paint f28350a;
    public final m9 f28351b;
    public final m9 f28352c;
    public float d;
    public float e;
    public float f28353f;
    public l20 h;
    public l20 f28354n;
    public float f28355r;
    public boolean f28356s;
    public float f28357w;
    public final LinearGradient f28358x;
    public final Matrix f28359y;

    public m20(int i10, Context context, boolean z10) {
        super(context);
        this.f28350a = new Paint(1);
        this.f28351b = new m9(8);
        this.f28352c = new m9(9);
        this.f28355r = 1.0f;
        this.f28359y = new Matrix();
        this.D = 0.0f;
        this.J = new Random();
        this.L = new l20[4];
        this.P = new OvershootInterpolator();
        this.I = z10;
        this.E = i10;
        for (int i11 = 0; i11 < 4; i11++) {
            this.L[i11] = new l20(i11);
        }
        this.f28351b.f28418b = org.telegram.messenger.i0.L(37.0f);
        this.f28351b.f28417a = org.telegram.messenger.i0.L(32.0f);
        this.f28352c.f28418b = org.telegram.messenger.i0.L(37.0f);
        this.f28352c.f28417a = org.telegram.messenger.i0.L(32.0f);
        this.f28351b.b();
        this.f28352c.b();
        ci0 ci0Var = new ci0(2131624331, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(30.0f), true, null);
        this.G = ci0Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.F = imageView;
        imageView.setAnimation(ci0Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.f28358x = new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        if (z10) {
            setState(0);
        }
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.e = min;
        this.f28353f = (min - this.d) / 265.0f;
    }

    public final void a() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (callState != 1 && callState != 2 && callState != 6 && callState != 5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, sharedInstance.getChat())) {
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.N4) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i10 == org.telegram.messenger.at.f14809w2) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        int i10;
        super.onAttachedToWindow();
        if (!this.I) {
            setAmplitude(0.0d);
            org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.N4);
            org.telegram.messenger.at.f(this.E).c(this, org.telegram.messenger.at.f14809w2);
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 24;
            }
            ci0 ci0Var = this.G;
            ci0Var.P(i10);
            ci0Var.N(ci0Var.f25138f - 1, false, true);
            a();
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z10;
        int i10;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 13;
        } else {
            i10 = 24;
        }
        ci0 ci0Var = this.G;
        if (ci0Var.P(i10)) {
            if (z10) {
                ci0Var.M(0);
            } else {
                ci0Var.M(12);
            }
        }
        this.F.d();
        a();
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.y0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.y0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.I) {
            org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.N4);
            org.telegram.messenger.at.f(this.E).n(this, org.telegram.messenger.at.f14809w2);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m20.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g20 g20Var = g20.f26296d0;
        if (g20Var != null) {
            if (g20Var.f26309x) {
                i10 = 2131754901;
            } else {
                i10 = 2131754816;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.dd.L0(i10, null)));
        }
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.y0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.y0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.y0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        a();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.y0.h(this, z10);
    }

    public void setPinnedProgress(float f7) {
        this.O = f7;
    }

    public void setPressedState(boolean z10) {
        this.M = z10;
    }

    public void setRemoveAngle(double d) {
        this.Q = (float) d;
    }

    public void setState(int i10) {
        String L0;
        l20 l20Var = this.h;
        if (l20Var != null && l20Var.f28031i == i10) {
            return;
        }
        this.f28354n = l20Var;
        l20 l20Var2 = this.L[i10];
        this.h = l20Var2;
        float f7 = 0.0f;
        if (l20Var != null) {
            this.f28355r = 0.0f;
        } else {
            this.f28355r = 1.0f;
            int i11 = l20Var2.f28031i;
            if (i11 != 3 && i11 != 2) {
                f7 = 1.0f;
            }
            this.D = f7;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && org.telegram.messenger.w3.W(sharedInstance.getChat())) {
            L0 = org.telegram.messenger.dd.L0(2131743473, null);
        } else {
            L0 = org.telegram.messenger.dd.L0(2131743332, null);
        }
        if (i10 == 0) {
            L0 = a1.g.m(null, 2131743259, sc.e.i(L0, ", "));
        } else if (i10 == 2) {
            L0 = a1.g.m(null, 2131751809, sc.e.i(L0, ", "));
        } else if (i10 == 3) {
            L0 = a1.g.m(null, 2131743318, sc.e.i(L0, ", "));
        }
        setContentDescription(L0);
        invalidate();
    }
}
