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
public final class j30 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public final int E;
    public final oj0 F;
    public final lj0 G;
    public long H;
    public final boolean I;
    public final Random J;
    public boolean K;
    public final i30[] L;
    public boolean M;
    public float N;
    public float O;
    public final OvershootInterpolator P;
    public float Q;
    public final Paint f25275a;
    public final ca f25276b;
    public final ca f25277c;
    public float d;
    public float e;
    public float f25278f;
    public i30 h;
    public i30 f25279n;
    public float f25280r;
    public boolean f25281s;
    public float v;
    public final LinearGradient f25282w;
    public final Matrix f25283x;
    public float f25284y;

    public j30(int i10, Context context, boolean z10) {
        super(context);
        this.f25275a = new Paint(1);
        this.f25276b = new ca(8);
        this.f25277c = new ca(9);
        this.f25280r = 1.0f;
        this.f25283x = new Matrix();
        this.f25284y = 0.0f;
        this.J = new Random();
        this.L = new i30[4];
        this.P = new OvershootInterpolator();
        this.I = z10;
        this.E = i10;
        for (int i11 = 0; i11 < 4; i11++) {
            this.L[i11] = new i30(i11);
        }
        this.f25276b.f23221b = AndroidUtilities.dp(37.0f);
        this.f25276b.f23220a = AndroidUtilities.dp(32.0f);
        this.f25277c.f23221b = AndroidUtilities.dp(37.0f);
        this.f25277c.f23220a = AndroidUtilities.dp(32.0f);
        this.f25276b.b();
        this.f25277c.b();
        lj0 lj0Var = new lj0(R.raw.voice_outlined, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(30.0f), true, null);
        this.G = lj0Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.F = imageView;
        imageView.setAnimation(lj0Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.f25282w = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        if (z10) {
            setState(0);
        }
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.e = min;
        this.f25278f = (min - this.d) / 265.0f;
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
            lj0 lj0Var = this.G;
            lj0Var.P(i10);
            lj0Var.N(lj0Var.f26015f - 1, false, true);
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
        lj0 lj0Var = this.G;
        if (lj0Var.P(i10)) {
            if (z10) {
                lj0Var.M(0);
            } else {
                lj0Var.M(12);
            }
        }
        this.F.d();
        a();
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.u0.c(this, z10);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j30.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d30 d30Var = d30.f23497d0;
        if (d30Var != null) {
            if (d30Var.f23509w) {
                i10 = R.string.AccDescrCloseMenu;
            } else {
                i10 = R.string.AccDescrOpenMenu2;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(i10)));
        }
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        a();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
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
        i30 i30Var = this.h;
        if (i30Var != null && i30Var.f24998i == i10) {
            return;
        }
        this.f25279n = i30Var;
        i30 i30Var2 = this.L[i10];
        this.h = i30Var2;
        float f7 = 0.0f;
        if (i30Var != null) {
            this.f25280r = 0.0f;
        } else {
            this.f25280r = 1.0f;
            int i11 = i30Var2.f24998i;
            if (i11 != 3 && i11 != 2) {
                f7 = 1.0f;
            }
            this.f25284y = f7;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && ChatObject.isChannelOrGiga(sharedInstance.getChat())) {
            string = LocaleController.getString(R.string.VoipChannelVoiceChat);
        } else {
            string = LocaleController.getString(R.string.VoipGroupVoiceChat);
        }
        if (i10 == 0) {
            string = org.telegram.messenger.f0.g(R.string.VoipTapToMute, v7.j.h(string, ", "));
        } else if (i10 == 2) {
            string = org.telegram.messenger.f0.g(R.string.Connecting, v7.j.h(string, ", "));
        } else if (i10 == 3) {
            string = org.telegram.messenger.f0.g(R.string.VoipMutedByAdmin, v7.j.h(string, ", "));
        }
        setContentDescription(string);
        invalidate();
    }
}
