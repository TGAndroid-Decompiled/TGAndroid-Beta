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
public final class c30 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public final int A;
    public final aj0 B;
    public final xi0 C;
    public long D;
    public final boolean E;
    public final Random F;
    public boolean G;
    public final b30[] H;
    public boolean I;
    public float J;
    public float K;
    public final OvershootInterpolator L;
    public float M;
    public final Paint f27294a;
    public final y9 f27295b;
    public final y9 f27296c;
    public float d;
    public float f27297e;
    public float f27298f;
    public b30 h;
    public b30 f27299n;
    public float f27300r;
    public boolean f27301s;
    public float v;
    public final LinearGradient f27302w;
    public final Matrix f27303x;
    public float f27304y;

    public c30(int i10, Context context, boolean z10) {
        super(context);
        this.f27294a = new Paint(1);
        this.f27295b = new y9(8);
        this.f27296c = new y9(9);
        this.f27300r = 1.0f;
        this.f27303x = new Matrix();
        this.f27304y = 0.0f;
        this.F = new Random();
        this.H = new b30[4];
        this.L = new OvershootInterpolator();
        this.E = z10;
        this.A = i10;
        for (int i11 = 0; i11 < 4; i11++) {
            this.H[i11] = new b30(i11);
        }
        this.f27295b.f34976b = AndroidUtilities.dp(37.0f);
        this.f27295b.f34975a = AndroidUtilities.dp(32.0f);
        this.f27296c.f34976b = AndroidUtilities.dp(37.0f);
        this.f27296c.f34975a = AndroidUtilities.dp(32.0f);
        this.f27295b.b();
        this.f27296c.b();
        int i12 = R.raw.voice_outlined;
        xi0 xi0Var = new xi0(i12, "" + R.raw.voice_outlined, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(30.0f), true, null);
        this.C = xi0Var;
        setWillNotDraw(false);
        ?? imageView = new ImageView(context);
        this.B = imageView;
        imageView.setAnimation(xi0Var);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        this.f27302w = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        if (z10) {
            setState(0);
        }
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.f27297e = min;
        this.f27298f = (min - this.d) / 265.0f;
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
                i10 = 13;
            } else {
                i10 = 24;
            }
            xi0 xi0Var = this.C;
            xi0Var.N(i10);
            xi0Var.L(xi0Var.f34739f - 1, false, true);
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
        xi0 xi0Var = this.C;
        if (xi0Var.N(i10)) {
            if (z10) {
                xi0Var.K(0);
            } else {
                xi0Var.K(12);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c30.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        w20 w20Var = w20.Z;
        if (w20Var != null) {
            if (w20Var.f34283w) {
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

    public void setPinnedProgress(float f9) {
        this.K = f9;
    }

    public void setPressedState(boolean z10) {
        this.I = z10;
    }

    public void setRemoveAngle(double d) {
        this.M = (float) d;
    }

    public void setState(int i10) {
        String string;
        b30 b30Var = this.h;
        if (b30Var != null && b30Var.f26966i == i10) {
            return;
        }
        this.f27299n = b30Var;
        b30 b30Var2 = this.H[i10];
        this.h = b30Var2;
        float f9 = 0.0f;
        if (b30Var != null) {
            this.f27300r = 0.0f;
        } else {
            this.f27300r = 1.0f;
            int i11 = b30Var2.f26966i;
            if (i11 != 3 && i11 != 2) {
                f9 = 1.0f;
            }
            this.f27304y = f9;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && ChatObject.isChannelOrGiga(sharedInstance.getChat())) {
            string = LocaleController.getString(R.string.VoipChannelVoiceChat);
        } else {
            string = LocaleController.getString(R.string.VoipGroupVoiceChat);
        }
        if (i10 == 0) {
            string = org.telegram.messenger.x3.i(R.string.VoipTapToMute, u3.c.f(string, ", "));
        } else if (i10 == 2) {
            string = org.telegram.messenger.x3.i(R.string.Connecting, u3.c.f(string, ", "));
        } else if (i10 == 3) {
            string = org.telegram.messenger.x3.i(R.string.VoipMutedByAdmin, u3.c.f(string, ", "));
        }
        setContentDescription(string);
        invalidate();
    }
}
