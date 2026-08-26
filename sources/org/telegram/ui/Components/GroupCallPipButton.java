package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import com.google.android.gms.internal.mlkit_vision_label.zzcw;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public final class GroupCallPipButton extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener {
    public float amplitude;
    public float animateAmplitudeDiff;
    public float animateToAmplitude;
    public final RLottieDrawable bigMicDrawable;
    public final BlobDrawable blobDrawable;
    public final BlobDrawable blobDrawable2;
    public final int currentAccount;
    public WeavingState currentState;
    public long lastStubUpdateAmplitude;
    public final Matrix matrix;
    public final RLottieImageView muteButton;
    public final OvershootInterpolator overshootInterpolator;
    public final Paint paint;
    public float pinnedProgress;
    public boolean prepareToRemove;
    public final LinearGradient prepareToRemoveShader;
    public float pressedProgress;
    public boolean pressedState;
    public WeavingState previousState;
    public float progressToPrepareRemove;
    public float progressToState;
    public final Random random;
    public float removeAngle;
    public boolean removed;
    public final WeavingState[] states;
    public final boolean stub;
    public float wavesEnter;

    public final class WeavingState {
        public int color1;
        public int color2;
        public int color3;
        public final int currentState;
        public float duration;
        public RadialGradient shader;
        public float startX;
        public float startY;
        public float time;
        public float targetX = -1.0f;
        public float targetY = -1.0f;
        public final Matrix matrix = new Matrix();

        public WeavingState(int i) {
            this.currentState = i;
        }

        public final void update(float f) {
            int i = this.currentState;
            if (i == 0) {
                int i2 = this.color1;
                int i3 = Theme.key_voipgroup_overlayGreen1;
                if (i2 != Theme.getColor(null, i3, false) || this.color2 != Theme.getColor(null, Theme.key_voipgroup_overlayGreen2, false)) {
                    int color = Theme.getColor(null, i3, false);
                    this.color1 = color;
                    int color2 = Theme.getColor(null, Theme.key_voipgroup_overlayGreen2, false);
                    this.color2 = color2;
                    this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color, color2}, (float[]) null, Shader.TileMode.CLAMP);
                }
            } else if (i == 1) {
                int i4 = this.color1;
                int i5 = Theme.key_voipgroup_overlayBlue1;
                if (i4 != Theme.getColor(null, i5, false) || this.color2 != Theme.getColor(null, Theme.key_voipgroup_overlayBlue2, false)) {
                    int color3 = Theme.getColor(null, i5, false);
                    this.color1 = color3;
                    int color4 = Theme.getColor(null, Theme.key_voipgroup_overlayBlue2, false);
                    this.color2 = color4;
                    this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color3, color4}, (float[]) null, Shader.TileMode.CLAMP);
                }
            } else {
                if (i != 3) {
                    return;
                }
                int i6 = this.color1;
                int i7 = Theme.key_voipgroup_mutedByAdminGradient;
                if (i6 != Theme.getColor(null, i7, false) || this.color2 != Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient2, false) || this.color3 != Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false)) {
                    int color5 = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient2, false);
                    this.color2 = color5;
                    int color6 = Theme.getColor(null, Theme.key_voipgroup_mutedByAdminGradient3, false);
                    this.color3 = color6;
                    int color7 = Theme.getColor(null, i7, false);
                    this.color1 = color7;
                    this.shader = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{color5, color6, color7}, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
            int iDp = AndroidUtilities.dp(130.0f);
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
            float f3 = 16L;
            float f4 = (f3 * 0.02f * f) + (1.0f * f3) + this.time;
            this.time = f4;
            float f5 = this.duration;
            if (f4 > f5) {
                this.time = f5;
            }
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(this.time / f5);
            float f6 = iDp;
            float f7 = this.startX;
            float f8 = ((((this.targetX - f7) * interpolation) + f7) * f6) - 200.0f;
            float f9 = this.startY;
            float f10 = ((((this.targetY - f9) * interpolation) + f9) * f6) - 200.0f;
            float f11 = (f6 / 400.0f) * (i == 3 ? 2.0f : 1.5f);
            Matrix matrix = this.matrix;
            matrix.reset();
            matrix.postTranslate(f8, f10);
            matrix.postScale(f11, f11, f8 + 200.0f, f10 + 200.0f);
            this.shader.setLocalMatrix(matrix);
        }

        public final void updateTargets() {
            int i = this.currentState;
            if (i == 0) {
                this.targetX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.2f);
                this.targetY = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.7f);
            } else if (i == 3) {
                this.targetX = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(Utilities.random.nextInt(100), 0.1f, 100.0f, 0.6f);
                this.targetY = (Utilities.random.nextInt(100) * 0.1f) / 100.0f;
            } else {
                this.targetX = zzjd.m(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
                this.targetY = Utilities.random.nextInt(100) / 100.0f;
            }
        }
    }

    public GroupCallPipButton(int i, Context context, boolean z) {
        super(context);
        this.paint = new Paint(1);
        this.blobDrawable = new BlobDrawable(8, 512);
        this.blobDrawable2 = new BlobDrawable(9, 512);
        this.progressToState = 1.0f;
        this.matrix = new Matrix();
        this.wavesEnter = 0.0f;
        this.random = new Random();
        this.states = new WeavingState[4];
        this.overshootInterpolator = new OvershootInterpolator();
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
        int i3 = R.raw.voice_outlined;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i3, SurfaceContainer$$ExternalSyntheticOutline0.m(i3, ""), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(30.0f), true, null);
        this.bigMicDrawable = rLottieDrawable;
        setWillNotDraw(false);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.muteButton = rLottieImageView;
        rLottieImageView.setAnimation(rLottieDrawable);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(rLottieImageView);
        this.prepareToRemoveShader = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(350.0f), 0.0f, new int[]{-2801343, -561538, 0}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
        if (z) {
            setState(0);
        }
    }

    private void setAmplitude(double d) {
        float fMin = (float) (Math.min(8500.0d, d) / 8500.0d);
        this.animateToAmplitude = fMin;
        this.animateAmplitudeDiff = (fMin - this.amplitude) / 265.0f;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.webRtcMicAmplitudeEvent) {
            setAmplitude(((Float) objArr[0]).floatValue() * 4000.0f);
        } else if (i == NotificationCenter.groupCallUpdated) {
            updateButtonState();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.stub) {
            return;
        }
        setAmplitude(0.0d);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupCallUpdated);
        boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        RLottieDrawable rLottieDrawable = this.bigMicDrawable;
        rLottieDrawable.setCustomEndFrame(z ? 13 : 24);
        rLottieDrawable.setCurrentFrame(rLottieDrawable.customEndFrame - 1, false, true);
        updateButtonState();
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        RLottieDrawable rLottieDrawable = this.bigMicDrawable;
        if (rLottieDrawable.setCustomEndFrame(z ? 13 : 24)) {
            if (z) {
                rLottieDrawable.setCurrentFrame(0, true, false);
            } else {
                rLottieDrawable.setCurrentFrame(12, true, false);
            }
        }
        this.muteButton.playAnimation();
        updateButtonState();
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        VoIPService.StateListener.CC.$default$onCameraFirstFrameAvailable(this);
    }

    @Override
    public final void onCameraSwitch(boolean z) {
        VoIPService.StateListener.CC.$default$onCameraSwitch(this, z);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.stub) {
            return;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i = 1;
        float measuredWidth = getMeasuredWidth() >> 1;
        float measuredHeight = getMeasuredHeight() >> 1;
        boolean z = this.pressedState;
        if (z) {
            float f9 = this.pressedProgress;
            if (f9 != 1.0f) {
                float f10 = f9 + 0.10666667f;
                this.pressedProgress = f10;
                if (f10 > 1.0f) {
                    this.pressedProgress = 1.0f;
                }
            } else if (!z) {
                f = this.pressedProgress;
                if (f != 0.0f) {
                    f2 = f - 0.10666667f;
                    this.pressedProgress = f2;
                    if (f2 < 0.0f) {
                        this.pressedProgress = 0.0f;
                    }
                }
            }
        } else if (!z) {
            f = this.pressedProgress;
            if (f != 0.0f) {
                f2 = f - 0.10666667f;
                this.pressedProgress = f2;
                if (f2 < 0.0f) {
                    this.pressedProgress = 0.0f;
                }
            }
        }
        float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.pressedProgress);
        RLottieImageView rLottieImageView = this.muteButton;
        float f11 = interpolation * 0.1f;
        float f12 = f11 + 1.0f;
        rLottieImageView.setScaleY(f12);
        rLottieImageView.setScaleX(f12);
        boolean z2 = this.stub;
        if (z2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.lastStubUpdateAmplitude > 1000) {
                this.lastStubUpdateAmplitude = jCurrentTimeMillis;
                float fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(zzcw.m(this.random, 100), 0.5f, 100.0f, 0.5f);
                this.animateToAmplitude = fM;
                this.animateAmplitudeDiff = (fM - this.amplitude) / 595.0f;
            }
        }
        float f13 = this.animateToAmplitude;
        float f14 = this.amplitude;
        if (f13 != f14) {
            float f15 = this.animateAmplitudeDiff;
            float f16 = (16.0f * f15) + f14;
            this.amplitude = f16;
            if (f15 > 0.0f) {
                if (f16 > f13) {
                    this.amplitude = f13;
                }
            } else if (f16 < f13) {
                this.amplitude = f13;
            }
        }
        ?? r12 = 0;
        if (this.previousState != null) {
            float f17 = this.progressToState + 0.064f;
            this.progressToState = f17;
            if (f17 > 1.0f) {
                this.progressToState = 1.0f;
                this.previousState = null;
            }
        }
        boolean z3 = this.prepareToRemove;
        if (z3) {
            float f18 = this.progressToPrepareRemove;
            if (f18 != 1.0f) {
                float f19 = f18 + 0.045714285f;
                this.progressToPrepareRemove = f19;
                if (f19 > 1.0f) {
                    this.progressToPrepareRemove = 1.0f;
                }
                if (this.removed) {
                    invalidate();
                }
            } else if (!z3) {
                f3 = this.progressToPrepareRemove;
                if (f3 != 0.0f) {
                    f4 = f3 - 0.045714285f;
                    this.progressToPrepareRemove = f4;
                    if (f4 < 0.0f) {
                        this.progressToPrepareRemove = 0.0f;
                    }
                }
            }
        } else if (!z3) {
            f3 = this.progressToPrepareRemove;
            if (f3 != 0.0f) {
                f4 = f3 - 0.045714285f;
                this.progressToPrepareRemove = f4;
                if (f4 < 0.0f) {
                    this.progressToPrepareRemove = 0.0f;
                }
            }
        }
        int i2 = this.currentState.currentState;
        int i3 = 3;
        int i4 = 2;
        boolean z4 = (i2 == 3 || i2 == 2) ? false : true;
        if (z4) {
            float f20 = this.wavesEnter;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.045714285f;
                this.wavesEnter = f21;
                if (f21 > 1.0f) {
                    this.wavesEnter = 1.0f;
                }
            } else if (!z4) {
                f5 = this.wavesEnter;
                if (f5 != 0.0f) {
                    f6 = f5 - 0.045714285f;
                    this.wavesEnter = f6;
                    if (f6 < 0.0f) {
                        this.wavesEnter = 0.0f;
                    }
                }
            }
        } else if (!z4) {
            f5 = this.wavesEnter;
            if (f5 != 0.0f) {
                f6 = f5 - 0.045714285f;
                this.wavesEnter = f6;
                if (f6 < 0.0f) {
                    this.wavesEnter = 0.0f;
                }
            }
        }
        float interpolation2 = (this.overshootInterpolator.getInterpolation(this.wavesEnter) * 0.35f) + 0.65f;
        BlobDrawable blobDrawable = this.blobDrawable;
        float f22 = 1.0f;
        float f23 = 0.0f;
        blobDrawable.update(this.amplitude, z2 ? 0.1f : 0.8f);
        BlobDrawable blobDrawable2 = this.blobDrawable2;
        blobDrawable2.update(this.amplitude, z2 ? 0.1f : 0.8f);
        int i5 = 0;
        while (i5 < i3) {
            if (i5 != 0 || this.previousState != null) {
                Paint paint = this.paint;
                if (i5 == 0) {
                    if (this.progressToPrepareRemove != f22) {
                        f7 = f22 - this.progressToState;
                        this.previousState.update(this.amplitude);
                        WeavingState weavingState = this.previousState;
                        if (weavingState.currentState == i4) {
                            paint.setShader(r12);
                            paint.setColor(Theme.getColor(r12, Theme.key_voipgroup_topPanelGray, false));
                        } else {
                            paint.setShader(weavingState.shader);
                        }
                        blobDrawable.maxRadius = AndroidUtilities.dp(40.0f);
                        blobDrawable.minRadius = AndroidUtilities.dp(32.0f);
                        blobDrawable2.maxRadius = AndroidUtilities.dp(38.0f);
                        blobDrawable2.minRadius = AndroidUtilities.dp(33.0f);
                        if (i5 != i4) {
                            f8 = 32.0f;
                            paint.setAlpha((int) ((f22 - this.progressToPrepareRemove) * 76.0f * f7));
                        } else {
                            f8 = 32.0f;
                            paint.setAlpha((int) (76.0f * f7 * this.progressToPrepareRemove));
                        }
                        if (this.wavesEnter != 0.0f) {
                            float fMin = Math.min((1.0f - this.pinnedProgress) * OKLCH.m(this.amplitude, 0.3f, 1.0f, f11), 1.3f) * interpolation2;
                            canvas.save();
                            canvas.scale(fMin, fMin, measuredWidth, measuredHeight);
                            blobDrawable.draw(measuredWidth, measuredHeight, canvas, paint);
                            canvas.restore();
                            float fMin2 = Math.min((1.0f - this.pinnedProgress) * OKLCH.m(this.amplitude, 0.26f, 1.0f, f11), 1.3f) * interpolation2;
                            canvas.save();
                            canvas.scale(fMin2, fMin2, measuredWidth, measuredHeight);
                            blobDrawable2.draw(measuredWidth, measuredHeight, canvas, paint);
                            canvas.restore();
                        }
                        i4 = 2;
                        if (i5 == 2) {
                            paint.setAlpha((int) (this.progressToPrepareRemove * 255.0f));
                        } else if (i5 == 1) {
                            paint.setAlpha((int) (f7 * 255.0f));
                        } else {
                            paint.setAlpha(255);
                        }
                        canvas.save();
                        canvas.scale(f12, f12, measuredWidth, measuredHeight);
                        canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f8), paint);
                        canvas.restore();
                    }
                } else if (i5 == i) {
                    WeavingState weavingState2 = this.currentState;
                    if (weavingState2 == null) {
                        return;
                    }
                    if (this.progressToPrepareRemove != f22) {
                        f7 = this.previousState != null ? this.progressToState : 1.0f;
                        weavingState2.update(this.amplitude);
                        WeavingState weavingState3 = this.currentState;
                        if (weavingState3.currentState == i4) {
                            paint.setShader(r12);
                            paint.setColor(Theme.getColor(r12, Theme.key_voipgroup_topPanelGray, false));
                        } else {
                            paint.setShader(weavingState3.shader);
                        }
                        blobDrawable.maxRadius = AndroidUtilities.dp(40.0f);
                        blobDrawable.minRadius = AndroidUtilities.dp(32.0f);
                        blobDrawable2.maxRadius = AndroidUtilities.dp(38.0f);
                        blobDrawable2.minRadius = AndroidUtilities.dp(33.0f);
                        if (i5 != i4) {
                            f8 = 32.0f;
                            paint.setAlpha((int) ((f22 - this.progressToPrepareRemove) * 76.0f * f7));
                        } else {
                            f8 = 32.0f;
                            paint.setAlpha((int) (76.0f * f7 * this.progressToPrepareRemove));
                        }
                        if (this.wavesEnter != 0.0f) {
                            float fMin3 = Math.min((1.0f - this.pinnedProgress) * OKLCH.m(this.amplitude, 0.3f, 1.0f, f11), 1.3f) * interpolation2;
                            canvas.save();
                            canvas.scale(fMin3, fMin3, measuredWidth, measuredHeight);
                            blobDrawable.draw(measuredWidth, measuredHeight, canvas, paint);
                            canvas.restore();
                            float fMin4 = Math.min((1.0f - this.pinnedProgress) * OKLCH.m(this.amplitude, 0.26f, 1.0f, f11), 1.3f) * interpolation2;
                            canvas.save();
                            canvas.scale(fMin4, fMin4, measuredWidth, measuredHeight);
                            blobDrawable2.draw(measuredWidth, measuredHeight, canvas, paint);
                            canvas.restore();
                        }
                        i4 = 2;
                        if (i5 == 2) {
                            paint.setAlpha((int) (this.progressToPrepareRemove * 255.0f));
                        } else if (i5 == 1) {
                            paint.setAlpha((int) (f7 * 255.0f));
                        } else {
                            paint.setAlpha(255);
                        }
                        canvas.save();
                        canvas.scale(f12, f12, measuredWidth, measuredHeight);
                        canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f8), paint);
                        canvas.restore();
                    }
                } else if (this.progressToPrepareRemove != f23) {
                    paint.setColor(-65536);
                    Matrix matrix = this.matrix;
                    matrix.reset();
                    matrix.postTranslate((f22 - this.progressToPrepareRemove) * (-AndroidUtilities.dp(250.0f)), 0.0f);
                    matrix.postRotate(this.removeAngle, measuredWidth, measuredHeight);
                    LinearGradient linearGradient = this.prepareToRemoveShader;
                    linearGradient.setLocalMatrix(matrix);
                    paint.setShader(linearGradient);
                    f7 = 1.0f;
                    blobDrawable.maxRadius = AndroidUtilities.dp(40.0f);
                    blobDrawable.minRadius = AndroidUtilities.dp(32.0f);
                    blobDrawable2.maxRadius = AndroidUtilities.dp(38.0f);
                    blobDrawable2.minRadius = AndroidUtilities.dp(33.0f);
                    if (i5 != i4) {
                        f8 = 32.0f;
                        paint.setAlpha((int) ((f22 - this.progressToPrepareRemove) * 76.0f * f7));
                    } else {
                        f8 = 32.0f;
                        paint.setAlpha((int) (76.0f * f7 * this.progressToPrepareRemove));
                    }
                    if (this.wavesEnter != 0.0f) {
                        float fMin5 = Math.min((1.0f - this.pinnedProgress) * OKLCH.m(this.amplitude, 0.3f, 1.0f, f11), 1.3f) * interpolation2;
                        canvas.save();
                        canvas.scale(fMin5, fMin5, measuredWidth, measuredHeight);
                        blobDrawable.draw(measuredWidth, measuredHeight, canvas, paint);
                        canvas.restore();
                        float fMin6 = Math.min((1.0f - this.pinnedProgress) * OKLCH.m(this.amplitude, 0.26f, 1.0f, f11), 1.3f) * interpolation2;
                        canvas.save();
                        canvas.scale(fMin6, fMin6, measuredWidth, measuredHeight);
                        blobDrawable2.draw(measuredWidth, measuredHeight, canvas, paint);
                        canvas.restore();
                    }
                    i4 = 2;
                    if (i5 == 2) {
                        paint.setAlpha((int) (this.progressToPrepareRemove * 255.0f));
                    } else if (i5 == 1) {
                        paint.setAlpha((int) (f7 * 255.0f));
                    } else {
                        paint.setAlpha(255);
                    }
                    canvas.save();
                    canvas.scale(f12, f12, measuredWidth, measuredHeight);
                    canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(f8), paint);
                    canvas.restore();
                }
            }
            i5++;
            i = 1;
            r12 = 0;
            i3 = 3;
            f22 = 1.0f;
            f23 = 0.0f;
        }
        if (this.removed || this.wavesEnter <= 0.0f) {
            return;
        }
        invalidate();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        GroupCallPip groupCallPip = GroupCallPip.instance;
        if (groupCallPip != null) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(groupCallPip.showAlert ? R.string.AccDescrCloseMenu : R.string.AccDescrOpenMenu2)));
        }
    }

    @Override
    public final void onMediaStateUpdated(int i, int i2) {
        VoIPService.StateListener.CC.$default$onMediaStateUpdated(this, i, i2);
    }

    @Override
    public final void onScreenOnChange(boolean z) {
        VoIPService.StateListener.CC.$default$onScreenOnChange(this, z);
    }

    @Override
    public final void onSignalBarsCountChanged(int i) {
        VoIPService.StateListener.CC.$default$onSignalBarsCountChanged(this, i);
    }

    @Override
    public final void onStateChanged(int i) {
        updateButtonState();
    }

    @Override
    public final void onVideoAvailableChange(boolean z) {
        VoIPService.StateListener.CC.$default$onVideoAvailableChange(this, z);
    }

    public void setPinnedProgress(float f) {
        this.pinnedProgress = f;
    }

    public void setPressedState(boolean z) {
        this.pressedState = z;
    }

    public void setRemoveAngle(double d) {
        this.removeAngle = (float) d;
    }

    public void setState(int i) {
        WeavingState weavingState = this.currentState;
        if (weavingState == null || weavingState.currentState != i) {
            this.previousState = weavingState;
            WeavingState weavingState2 = this.states[i];
            this.currentState = weavingState2;
            float f = 0.0f;
            if (weavingState != null) {
                this.progressToState = 0.0f;
            } else {
                this.progressToState = 1.0f;
                int i2 = weavingState2.currentState;
                if (i2 != 3 && i2 != 2) {
                    f = 1.0f;
                }
                this.wavesEnter = f;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            String string = (sharedInstance == null || !ChatObject.isChannelOrGiga(sharedInstance.getChat())) ? LocaleController.getString(R.string.VoipGroupVoiceChat) : LocaleController.getString(R.string.VoipChannelVoiceChat);
            if (i == 0) {
                string = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(string, ", "), R.string.VoipTapToMute);
            } else if (i == 2) {
                string = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(string, ", "), R.string.Connecting);
            } else if (i == 3) {
                string = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(string, ", "), R.string.VoipMutedByAdmin);
            }
            setContentDescription(string);
            invalidate();
        }
    }

    public final void updateButtonState() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.groupCall == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (callState == 1 || callState == 2 || callState == 6 || callState == 5) {
            setState(2);
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.get(sharedInstance.getSelfId());
        if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
            setState(sharedInstance.isMicMute() ? 1 : 0);
            return;
        }
        if (!sharedInstance.isMicMute()) {
            sharedInstance.setMicMute(true, false, false);
        }
        setState(3);
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        if (getParent() != null) {
            ((View) getParent()).dispatchTouchEvent(motionEventObtain);
        }
    }
}
