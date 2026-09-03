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
public final class h30 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public final int B;
    public final jj0 C;
    public final gj0 D;
    public long E;
    public final boolean F;
    public final Random G;
    public boolean H;
    public final g30[] I;
    public boolean J;
    public float K;
    public float L;
    public final OvershootInterpolator M;
    public float N;
    public final Paint f25300a;
    public final u9 f25301b;
    public final u9 f25302c;
    public float d;
    public float e;
    public float f25303f;
    public g30 h;
    public g30 f25304n;
    public float f25305r;
    public boolean f25306s;
    public float v;
    public final LinearGradient f25307w;
    public final Matrix f25308x;
    public float f25309y;

    public h30(int i10, Context context, boolean z4) {
        super(context);
        this.f25300a = new Paint(1);
        this.f25301b = new u9(8);
        this.f25302c = new u9(9);
        this.f25305r = 1.0f;
        this.f25308x = new Matrix();
        this.f25309y = 0.0f;
        this.G = new Random();
        this.I = new g30[4];
        this.M = new OvershootInterpolator();
        this.F = z4;
        this.B = i10;
        for (int i11 = 0; i11 < 4; i11++) {
            this.I[i11] = new g30(i11);
        }
        this.f25301b.f29140b = AndroidUtilities.dp(37.0f);
        this.f25301b.f29139a = AndroidUtilities.dp(32.0f);
        this.f25302c.f29140b = AndroidUtilities.dp(37.0f);
        this.f25302c.f29139a = AndroidUtilities.dp(32.0f);
        this.f25301b.b();
        this.f25302c.b();
        gj0 gj0Var = new gj0(R.raw.voice_outlined, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(30.0f), true, null);
        this.D = gj0Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.C = imageView;
        imageView.setAnimation(gj0Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.f25307w = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        if (z4) {
            setState(0);
        }
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.e = min;
        this.f25303f = (min - this.d) / 265.0f;
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
        boolean z4;
        int i10;
        super.onAttachedToWindow();
        if (!this.F) {
            setAmplitude(0.0d);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getInstance(this.B).addObserver(this, NotificationCenter.groupCallUpdated);
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (z4) {
                i10 = 13;
            } else {
                i10 = 24;
            }
            gj0 gj0Var = this.D;
            gj0Var.N(i10);
            gj0Var.L(gj0Var.f25160f - 1, false, true);
            a();
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z4;
        int i10;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i10 = 13;
        } else {
            i10 = 24;
        }
        gj0 gj0Var = this.D;
        if (gj0Var.N(i10)) {
            if (z4) {
                gj0Var.K(0);
            } else {
                gj0Var.K(12);
            }
        }
        this.C.d();
        a();
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z4) {
        org.telegram.messenger.voip.v0.c(this, z4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.F) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.groupCallUpdated);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h30.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        b30 b30Var = b30.f23530a0;
        if (b30Var != null) {
            if (b30Var.f23539w) {
                i10 = R.string.AccDescrCloseMenu;
            } else {
                i10 = R.string.AccDescrOpenMenu2;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(i10)));
        }
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.v0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z4) {
        org.telegram.messenger.voip.v0.e(this, z4);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.v0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        a();
    }

    @Override
    public final void onVideoAvailableChange(boolean z4) {
        org.telegram.messenger.voip.v0.h(this, z4);
    }

    public void setPinnedProgress(float f10) {
        this.L = f10;
    }

    public void setPressedState(boolean z4) {
        this.J = z4;
    }

    public void setRemoveAngle(double d) {
        this.N = (float) d;
    }

    public void setState(int i10) {
        String string;
        g30 g30Var = this.h;
        if (g30Var != null && g30Var.f25034i == i10) {
            return;
        }
        this.f25304n = g30Var;
        g30 g30Var2 = this.I[i10];
        this.h = g30Var2;
        float f10 = 0.0f;
        if (g30Var != null) {
            this.f25305r = 0.0f;
        } else {
            this.f25305r = 1.0f;
            int i11 = g30Var2.f25034i;
            if (i11 != 3 && i11 != 2) {
                f10 = 1.0f;
            }
            this.f25309y = f10;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && ChatObject.isChannelOrGiga(sharedInstance.getChat())) {
            string = LocaleController.getString(R.string.VoipChannelVoiceChat);
        } else {
            string = LocaleController.getString(R.string.VoipGroupVoiceChat);
        }
        if (i10 == 0) {
            string = org.telegram.messenger.y3.h(R.string.VoipTapToMute, vh.w2.f(string, ", "));
        } else if (i10 == 2) {
            string = org.telegram.messenger.y3.h(R.string.Connecting, vh.w2.f(string, ", "));
        } else if (i10 == 3) {
            string = org.telegram.messenger.y3.h(R.string.VoipMutedByAdmin, vh.w2.f(string, ", "));
        }
        setContentDescription(string);
        invalidate();
    }
}
