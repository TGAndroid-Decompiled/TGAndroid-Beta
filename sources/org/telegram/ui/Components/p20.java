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
public final class p20 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public final int A;
    public final pi0 B;
    public final mi0 C;
    public long D;
    public final boolean E;
    public final Random F;
    public boolean G;
    public final o20[] H;
    public boolean I;
    public float J;
    public float K;
    public final OvershootInterpolator L;
    public float M;
    public final Paint f31516a;
    public final t9 f31517b;
    public final t9 f31518c;
    public float d;
    public float f31519e;
    public float f31520f;
    public o20 h;
    public o20 f31521n;
    public float f31522r;
    public boolean f31523s;
    public float v;
    public final LinearGradient f31524w;
    public final Matrix f31525x;
    public float f31526y;

    public p20(int i9, Context context, boolean z10) {
        super(context);
        this.f31516a = new Paint(1);
        this.f31517b = new t9(8);
        this.f31518c = new t9(9);
        this.f31522r = 1.0f;
        this.f31525x = new Matrix();
        this.f31526y = 0.0f;
        this.F = new Random();
        this.H = new o20[4];
        this.L = new OvershootInterpolator();
        this.E = z10;
        this.A = i9;
        for (int i10 = 0; i10 < 4; i10++) {
            this.H[i10] = new o20(i10);
        }
        this.f31517b.f32648b = AndroidUtilities.dp(37.0f);
        this.f31517b.f32647a = AndroidUtilities.dp(32.0f);
        this.f31518c.f32648b = AndroidUtilities.dp(37.0f);
        this.f31518c.f32647a = AndroidUtilities.dp(32.0f);
        this.f31517b.b();
        this.f31518c.b();
        int i11 = R.raw.voice_outlined;
        mi0 mi0Var = new mi0(i11, "" + R.raw.voice_outlined, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(30.0f), true, null);
        this.C = mi0Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.B = imageView;
        imageView.setAnimation(mi0Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.f31524w = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        if (z10) {
            setState(0);
        }
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.f31519e = min;
        this.f31520f = (min - this.d) / 265.0f;
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.webRtcMicAmplitudeEvent) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i9 == NotificationCenter.groupCallUpdated) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        int i9;
        super.onAttachedToWindow();
        if (!this.E) {
            setAmplitude(0.0d);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getInstance(this.A).addObserver(this, NotificationCenter.groupCallUpdated);
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (z10) {
                i9 = 13;
            } else {
                i9 = 24;
            }
            mi0 mi0Var = this.C;
            mi0Var.N(i9);
            mi0Var.L(mi0Var.f30849f - 1, false, true);
            a();
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z10;
        int i9;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i9 = 13;
        } else {
            i9 = 24;
        }
        mi0 mi0Var = this.C;
        if (mi0Var.N(i9)) {
            if (z10) {
                mi0Var.K(0);
            } else {
                mi0Var.K(12);
            }
        }
        this.B.d();
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
        if (!this.E) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getInstance(this.A).removeObserver(this, NotificationCenter.groupCallUpdated);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p20.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j20 j20Var = j20.Z;
        if (j20Var != null) {
            if (j20Var.f29606w) {
                i9 = R.string.AccDescrCloseMenu;
            } else {
                i9 = R.string.AccDescrOpenMenu2;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(i9)));
        }
    }

    @Override
    public final void onMediaStateUpdated(int i9, int i10) {
        org.telegram.messenger.voip.u0.d(this, i9, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i9) {
        org.telegram.messenger.voip.u0.f(this, i9);
    }

    @Override
    public final void onStateChanged(int i9) {
        a();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public void setPinnedProgress(float f10) {
        this.K = f10;
    }

    public void setPressedState(boolean z10) {
        this.I = z10;
    }

    public void setRemoveAngle(double d) {
        this.M = (float) d;
    }

    public void setState(int i9) {
        String string;
        o20 o20Var = this.h;
        if (o20Var != null && o20Var.f31271i == i9) {
            return;
        }
        this.f31521n = o20Var;
        o20 o20Var2 = this.H[i9];
        this.h = o20Var2;
        float f10 = 0.0f;
        if (o20Var != null) {
            this.f31522r = 0.0f;
        } else {
            this.f31522r = 1.0f;
            int i10 = o20Var2.f31271i;
            if (i10 != 3 && i10 != 2) {
                f10 = 1.0f;
            }
            this.f31526y = f10;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && ChatObject.isChannelOrGiga(sharedInstance.getChat())) {
            string = LocaleController.getString(R.string.VoipChannelVoiceChat);
        } else {
            string = LocaleController.getString(R.string.VoipGroupVoiceChat);
        }
        if (i9 == 0) {
            string = org.telegram.messenger.l0.h(R.string.VoipTapToMute, ta.b.e(string, ", "));
        } else if (i9 == 2) {
            string = org.telegram.messenger.l0.h(R.string.Connecting, ta.b.e(string, ", "));
        } else if (i9 == 3) {
            string = org.telegram.messenger.l0.h(R.string.VoipMutedByAdmin, ta.b.e(string, ", "));
        }
        setContentDescription(string);
        invalidate();
    }
}
