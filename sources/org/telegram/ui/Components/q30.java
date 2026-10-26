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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class q30 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public final int E;
    public final ak0 F;
    public final xj0 G;
    public long H;
    public final boolean I;
    public final Random J;
    public boolean K;
    public final p30[] L;
    public boolean M;
    public float N;
    public float O;
    public final OvershootInterpolator P;
    public float Q;
    public final Paint f31816a;
    public final fa f31817b;
    public final fa f31818c;
    public float d;
    public float e;
    public float f31819f;
    public p30 h;
    public p30 f31820n;
    public float f31821r;
    public boolean f31822s;
    public float v;
    public final LinearGradient f31823w;
    public final Matrix f31824x;
    public float f31825y;

    public q30(int i10, Context context, boolean z10) {
        super(context);
        this.f31816a = new Paint(1);
        this.f31817b = new fa(8);
        this.f31818c = new fa(9);
        this.f31821r = 1.0f;
        this.f31824x = new Matrix();
        this.f31825y = 0.0f;
        this.J = new Random();
        this.L = new p30[4];
        this.P = new OvershootInterpolator();
        this.I = z10;
        this.E = i10;
        for (int i11 = 0; i11 < 4; i11++) {
            this.L[i11] = new p30(i11);
        }
        this.f31817b.f28112b = AndroidUtilities.dp(37.0f);
        this.f31817b.f28111a = AndroidUtilities.dp(32.0f);
        this.f31818c.f28112b = AndroidUtilities.dp(37.0f);
        this.f31818c.f28111a = AndroidUtilities.dp(32.0f);
        this.f31817b.b();
        this.f31818c.b();
        xj0 xj0Var = new xj0(R.raw.voice_outlined, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(30.0f), true, null);
        this.G = xj0Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.F = imageView;
        imageView.setAnimation(xj0Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.f31823w = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        if (z10) {
            setState(0);
        }
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.e = min;
        this.f31819f = (min - this.d) / 265.0f;
    }

    public final void a() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (callState != 1 && callState != 2 && callState != 6 && callState != 5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId());
                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) {
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
        if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
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
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getInstance(this.E).addObserver(this, NotificationCenter.groupCallUpdated);
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
            xj0 xj0Var = this.G;
            xj0Var.P(i10);
            xj0Var.N(xj0Var.f34743f - 1, false, true);
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
        xj0 xj0Var = this.G;
        if (xj0Var.P(i10)) {
            if (z10) {
                xj0Var.M(0);
            } else {
                xj0Var.M(12);
            }
        }
        this.F.d();
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
        if (!this.I) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getInstance(this.E).removeObserver(this, NotificationCenter.groupCallUpdated);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q30.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        k30 k30Var = k30.f29786d0;
        if (k30Var != null) {
            if (k30Var.f29798w) {
                i10 = R.string.AccDescrCloseMenu;
            } else {
                i10 = R.string.AccDescrOpenMenu2;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(i10)));
        }
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.t0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.t0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        a();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
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
        String string;
        p30 p30Var = this.h;
        if (p30Var != null && p30Var.f31434i == i10) {
            return;
        }
        this.f31820n = p30Var;
        p30 p30Var2 = this.L[i10];
        this.h = p30Var2;
        float f7 = 0.0f;
        if (p30Var != null) {
            this.f31821r = 0.0f;
        } else {
            this.f31821r = 1.0f;
            int i11 = p30Var2.f31434i;
            if (i11 != 3 && i11 != 2) {
                f7 = 1.0f;
            }
            this.f31825y = f7;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && ChatObject.isChannelOrGiga(sharedInstance.getChat())) {
            string = LocaleController.getString(R.string.VoipChannelVoiceChat);
        } else {
            string = LocaleController.getString(R.string.VoipGroupVoiceChat);
        }
        if (i10 == 0) {
            string = org.telegram.messenger.t.h(R.string.VoipTapToMute, b10.l(string, ", "));
        } else if (i10 == 2) {
            string = org.telegram.messenger.t.h(R.string.Connecting, b10.l(string, ", "));
        } else if (i10 == 3) {
            string = org.telegram.messenger.t.h(R.string.VoipMutedByAdmin, b10.l(string, ", "));
        }
        setContentDescription(string);
        invalidate();
    }
}
