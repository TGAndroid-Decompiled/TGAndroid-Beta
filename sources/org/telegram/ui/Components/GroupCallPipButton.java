package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC$TL_groupCallParticipant;
import org.telegram.ui.ActionBar.Theme;

public class GroupCallPipButton extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    float amplitude;
    float animateAmplitudeDiff;
    float animateToAmplitude;
    private RLottieDrawable bigMicDrawable;
    private final int currentAccount;
    WeavingState currentState;
    long lastStubUpdateAmplitude;
    private RLottieImageView muteButton;
    float pinnedProgress;
    boolean prepareToRemove;
    private final LinearGradient prepareToRemoveShader;
    float pressedProgress;
    boolean pressedState;
    WeavingState previousState;
    float progressToPrepareRemove;
    float removeAngle;
    public boolean removed;
    private boolean stub;
    Paint paint = new Paint(1);
    BlobDrawable blobDrawable = new BlobDrawable(8);
    BlobDrawable blobDrawable2 = new BlobDrawable(9);
    float progressToState = 1.0f;
    Matrix matrix = new Matrix();
    float wavesEnter = 0.0f;
    Random random = new Random();
    WeavingState[] states = new WeavingState[4];
    OvershootInterpolator overshootInterpolator = new OvershootInterpolator();

    @Override
    public void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public void onCameraSwitch(boolean z) {
        VoIPService.StateListener.CC.$default$onCameraSwitch(this, z);
    }

    @Override
    public void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override
    public void onScreenOnChange(boolean z) {
        VoIPService.StateListener.CC.$default$onScreenOnChange(this, z);
    }

    @Override
    public void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override
    public void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    public GroupCallPipButton(Context context, int i, boolean z) {
        super(context);
        this.stub = z;
        this.currentAccount = i;
        for (int i2 = 0; i2 < 4; i2++) {
            this.states[i2] = new WeavingState(i2);
        }
        this.blobDrawable.maxRadius = AndroidUtilities.dp(37.0f);
        this.blobDrawable.minRadius = AndroidUtilities.dp(32.0f);
        this.blobDrawable2.maxRadius = AndroidUtilities.dp(37.0f);
        this.blobDrawable2.minRadius = AndroidUtilities.dp(32.0f);
        this.blobDrawable.generateBlob();
        this.blobDrawable2.generateBlob();
        this.bigMicDrawable = new RLottieDrawable(R.raw.voice_outlined, "2131558566", AndroidUtilities.dp(22.0f), AndroidUtilities.dp(30.0f), true, null);
        setWillNotDraw(false);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.muteButton = rLottieImageView;
        rLottieImageView.setAnimation(this.bigMicDrawable);
        this.muteButton.setScaleType(ImageView.ScaleType.CENTER);
        addView(this.muteButton);
        this.prepareToRemoveShader = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        if (z) {
            setState(0);
        }
    }

    public void setPressedState(boolean z) {
        this.pressedState = z;
    }

    public void setPinnedProgress(float f) {
        this.pinnedProgress = f;
    }

    public static class WeavingState {
        int color1;
        int color2;
        int color3;
        private final int currentState;
        private float duration;
        public Shader shader;
        private float startX;
        private float startY;
        private float time;
        private float targetX = -1.0f;
        private float targetY = -1.0f;
        private final Matrix matrix = new Matrix();

        public WeavingState(int i) {
            this.currentState = i;
        }

        public void update(long j, float f) {
            int i = this.currentState;
            if (i == 0) {
                if (!(this.color1 == Theme.getColor("voipgroup_overlayGreen1") && this.color2 == Theme.getColor("voipgroup_overlayGreen2"))) {
                    int color = Theme.getColor("voipgroup_overlayGreen1");
                    this.color1 = color;
                    int color2 = Theme.getColor("voipgroup_overlayGreen2");
                    this.color2 = color2;
                    this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color, color2}, (float[]) null, Shader.TileMode.CLAMP);
                }
            } else if (i == 1) {
                if (!(this.color1 == Theme.getColor("voipgroup_overlayBlue1") && this.color2 == Theme.getColor("voipgroup_overlayBlue2"))) {
                    int color3 = Theme.getColor("voipgroup_overlayBlue1");
                    this.color1 = color3;
                    int color4 = Theme.getColor("voipgroup_overlayBlue2");
                    this.color2 = color4;
                    this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color3, color4}, (float[]) null, Shader.TileMode.CLAMP);
                }
            } else if (i != 3) {
                return;
            } else {
                if (!(this.color1 == Theme.getColor("voipgroup_mutedByAdminGradient") && this.color2 == Theme.getColor("voipgroup_mutedByAdminGradient2") && this.color3 == Theme.getColor("voipgroup_mutedByAdminGradient3"))) {
                    int color5 = Theme.getColor("voipgroup_mutedByAdminGradient2");
                    this.color2 = color5;
                    int color6 = Theme.getColor("voipgroup_mutedByAdminGradient3");
                    this.color3 = color6;
                    int color7 = Theme.getColor("voipgroup_mutedByAdminGradient");
                    this.color1 = color7;
                    this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color5, color6, color7}, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
            int dp = AndroidUtilities.dp(130.0f);
            float f2 = this.duration;
            if (f2 == 0.0f || this.time >= f2) {
                this.duration = Utilities.random.nextInt(700) + 500;
                this.time = 0.0f;
                if (this.targetX == -1.0f) {
                    updateTargets();
                }
                this.startX = this.targetX;
                this.startY = this.targetY;
                updateTargets();
            }
            float f3 = (float) j;
            float f4 = 2.0f;
            float f5 = this.time + ((BlobDrawable.GRADIENT_SPEED_MIN + 0.5f) * f3) + (f3 * BlobDrawable.GRADIENT_SPEED_MAX * 2.0f * f);
            this.time = f5;
            float f6 = this.duration;
            if (f5 > f6) {
                this.time = f6;
            }
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f6);
            float f7 = dp;
            float f8 = this.startX;
            float f9 = ((f8 + ((this.targetX - f8) * interpolation)) * f7) - 200.0f;
            float f10 = this.startY;
            float f11 = ((f10 + ((this.targetY - f10) * interpolation)) * f7) - 200.0f;
            if (this.currentState != 3) {
                f4 = 1.5f;
            }
            float f12 = (f7 / 400.0f) * f4;
            this.matrix.reset();
            this.matrix.postTranslate(f9, f11);
            this.matrix.postScale(f12, f12, f9 + 200.0f, f11 + 200.0f);
            this.shader.setLocalMatrix(this.matrix);
        }

        private void updateTargets() {
            int i = this.currentState;
            if (i == 0) {
                this.targetX = ((Utilities.random.nextInt(100) * 0.1f) / 100.0f) + 0.2f;
                this.targetY = ((Utilities.random.nextInt(100) * 0.1f) / 100.0f) + 0.7f;
            } else if (i == 3) {
                this.targetX = ((Utilities.random.nextInt(100) * 0.1f) / 100.0f) + 0.6f;
                this.targetY = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
            } else {
                this.targetX = ((Utilities.random.nextInt(100) / 100.0f) * 0.2f) + 0.8f;
                this.targetY = Utilities.random.nextInt(100) / 100.0f;
            }
        }

        public void setToPaint(Paint paint) {
            if (this.currentState == 2) {
                paint.setShader(null);
                paint.setColor(Theme.getColor("voipgroup_topPanelGray"));
                return;
            }
            paint.setShader(this.shader);
        }
    }

    @Override
    protected void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.GroupCallPipButton.onDraw(android.graphics.Canvas):void");
    }

    private void setAmplitude(double d) {
        float min = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.animateToAmplitude = min;
        this.animateAmplitudeDiff = (min - this.amplitude) / ((BlobDrawable.AMPLITUDE_SPEED * 500.0f) + 100.0f);
    }

    public void setState(int i) {
        String str;
        WeavingState weavingState = this.currentState;
        if (weavingState == null || weavingState.currentState != i) {
            WeavingState weavingState2 = this.currentState;
            this.previousState = weavingState2;
            WeavingState weavingState3 = this.states[i];
            this.currentState = weavingState3;
            float f = 0.0f;
            if (weavingState2 != null) {
                this.progressToState = 0.0f;
            } else {
                this.progressToState = 1.0f;
                boolean z = true;
                if (weavingState3.currentState == 3 || this.currentState.currentState == 2) {
                    z = false;
                }
                if (z) {
                    f = 1.0f;
                }
                this.wavesEnter = f;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null || !ChatObject.isChannelOrGiga(sharedInstance.getChat())) {
                str = LocaleController.getString("VoipGroupVoiceChat", R.string.VoipGroupVoiceChat);
            } else {
                str = LocaleController.getString("VoipChannelVoiceChat", R.string.VoipChannelVoiceChat);
            }
            if (i == 0) {
                str = str + ", " + LocaleController.getString("VoipTapToMute", R.string.VoipTapToMute);
            } else if (i == 2) {
                str = str + ", " + LocaleController.getString("Connecting", R.string.Connecting);
            } else if (i == 3) {
                str = str + ", " + LocaleController.getString("VoipMutedByAdmin", R.string.VoipMutedByAdmin);
            }
            setContentDescription(str);
            invalidate();
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 21 && GroupCallPip.getInstance() != null) {
            if (GroupCallPip.getInstance().showAlert) {
                i = R.string.AccDescrCloseMenu;
                str = "AccDescrCloseMenu";
            } else {
                i = R.string.AccDescrOpenMenu2;
                str = "AccDescrOpenMenu2";
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(str, i)));
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.stub) {
            setAmplitude(0.0d);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupCallUpdated);
            boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            this.bigMicDrawable.setCustomEndFrame(z ? 13 : 24);
            RLottieDrawable rLottieDrawable = this.bigMicDrawable;
            rLottieDrawable.setCurrentFrame(rLottieDrawable.getCustomEndFrame() - 1, false, true);
            updateButtonState();
        }
    }

    private void updateButtonState() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null) {
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5) {
                setState(2);
                return;
            }
            TLRPC$TL_groupCallParticipant tLRPC$TL_groupCallParticipant = sharedInstance.groupCall.participants.get(sharedInstance.getSelfId());
            if (tLRPC$TL_groupCallParticipant == null || tLRPC$TL_groupCallParticipant.can_self_unmute || !tLRPC$TL_groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                setState(sharedInstance.isMicMute() ? 1 : 0);
                return;
            }
            if (!sharedInstance.isMicMute()) {
                sharedInstance.setMicMute(true, false, false);
            }
            setState(3);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            if (getParent() != null) {
                ((View) getParent()).dispatchTouchEvent(obtain);
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.stub) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.webRtcMicAmplitudeEvent) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i == NotificationCenter.groupCallUpdated) {
            updateButtonState();
        }
    }

    @Override
    public void onAudioSettingsChanged() {
        boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        if (this.bigMicDrawable.setCustomEndFrame(z ? 13 : 24)) {
            if (z) {
                this.bigMicDrawable.setCurrentFrame(0);
            } else {
                this.bigMicDrawable.setCurrentFrame(12);
            }
        }
        this.muteButton.playAnimation();
        updateButtonState();
    }

    @Override
    public void onStateChanged(int i) {
        updateButtonState();
    }

    public void setRemoveAngle(double d) {
        this.removeAngle = (float) d;
    }

    public void prepareToRemove(boolean z) {
        if (this.prepareToRemove != z) {
            invalidate();
        }
        this.prepareToRemove = z;
    }
}
