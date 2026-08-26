package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Choreographer;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AudioVisualizerDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EarListener;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SeekBarWaveform;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Stories.recorder.HintView2;

public final class SecretVoicePlayer extends Dialog {
    public AudioVisualizerDrawable audioVisualizerDrawable;
    public AlertDialog backDialog;
    public Bitmap blurBitmap;
    public Paint blurBitmapPaint;
    public BitmapShader blurBitmapShader;
    public Matrix blurMatrix;
    public ChatMessageCell cell;
    public final SecretVoicePlayer$$ExternalSyntheticLambda6 checkTimeRunnable;
    public float clipBottom;
    public float clipTop;
    public PollItemMenu$$ExternalSyntheticLambda12 closeAction;
    public TextView closeButton;
    public final IntroActivity.AnonymousClass1 containerView;
    public final Activity context;
    public boolean dismissing;
    public float dty;
    public final EarListener earListener;
    public boolean hasDestTranslation;
    public boolean hasTranslation;
    public float heightdiff;
    public HintView2 hintView;
    public Insets insets;
    public boolean isRound;
    public MessageObject messageObject;
    public AnonymousClass3 myCell;
    public ValueAnimator open2Animator;
    public ChatActivity$$ExternalSyntheticLambda6 openAction;
    public ValueAnimator openAnimator;
    public float openProgress;
    public float openProgress2;
    public VideoPlayer player;
    public float progress;
    public final RectF rect;
    public boolean renderedFirstFrame;
    public Theme.ResourcesProvider resourcesProvider;
    public boolean setCellInvisible;
    public TextureView textureView;
    public ThanosEffect thanosEffect;
    public float tx;
    public float ty;
    public final LoginActivity.AnonymousClass4 windowView;

    public SecretVoicePlayer(Activity activity) {
        super(activity, R.style.TransparentDialog);
        this.insets = Insets.NONE;
        this.rect = new RectF();
        this.clipTop = 0.0f;
        this.clipBottom = 0.0f;
        this.checkTimeRunnable = new SecretVoicePlayer$$ExternalSyntheticLambda6(this, 3);
        this.progress = 0.0f;
        this.dismissing = false;
        this.context = activity;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, activity, 18);
        this.windowView = anonymousClass4;
        anonymousClass4.setOnClickListener(new SecretVoicePlayer$$ExternalSyntheticLambda5(this, 1));
        IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(this, activity);
        this.containerView = anonymousClass1;
        anonymousClass1.setClipToPadding(false);
        anonymousClass4.addView(anonymousClass1, LayoutHelper.createFrame(-1, -1, 119));
        SecretVoicePlayer$$ExternalSyntheticLambda3 secretVoicePlayer$$ExternalSyntheticLambda3 = new SecretVoicePlayer$$ExternalSyntheticLambda3(this, 1);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(anonymousClass4, secretVoicePlayer$$ExternalSyntheticLambda3);
        if (SharedConfig.raiseToListen) {
            this.earListener = new EarListener();
        }
    }

    public final void animateOpenTo(SecretVoicePlayer$$ExternalSyntheticLambda6 secretVoicePlayer$$ExternalSyntheticLambda6, boolean z) {
        int i = 0;
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.open2Animator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        setupTranslation();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SecretVoicePlayer$$ExternalSyntheticLambda1(i, this, z));
        this.openAnimator.addListener(new ChatActivity.AnonymousClass63(this, z, secretVoicePlayer$$ExternalSyntheticLambda6, 11));
        long j = (z || this.closeAction != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.openAnimator;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        valueAnimator3.setInterpolator(cubicBezierInterpolator);
        this.openAnimator.setDuration(j);
        this.openAnimator.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.openProgress2, z ? 1.0f : 0.0f);
        this.open2Animator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 6));
        this.open2Animator.addListener(new LoginActivity.AnonymousClass9(26, this, z));
        this.open2Animator.setDuration((long) (j * 1.5f));
        this.open2Animator.setInterpolator(cubicBezierInterpolator);
        this.open2Animator.start();
    }

    @Override
    public final void dismiss() {
        AnonymousClass3 anonymousClass3;
        if (this.dismissing) {
            return;
        }
        AlertDialog alertDialog = this.backDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.backDialog = null;
        }
        this.dismissing = true;
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.hide(true);
        }
        VideoPlayer videoPlayer = this.player;
        if (videoPlayer != null) {
            videoPlayer.pause();
            this.player.releasePlayer();
            this.player = null;
        }
        if (!this.isRound && (anonymousClass3 = this.myCell) != null && anonymousClass3.getSeekBarWaveform() != null) {
            SeekBarWaveform seekBarWaveform = getSeekBarWaveform();
            seekBarWaveform.explosionRate = this.openProgress;
            ChatMessageCell chatMessageCell = seekBarWaveform.parentView;
            if (chatMessageCell != null) {
                chatMessageCell.invalidate();
            }
        }
        this.hasTranslation = false;
        setupTranslation();
        animateOpenTo(new SecretVoicePlayer$$ExternalSyntheticLambda6(this, 0), false);
        LoginActivity.AnonymousClass4 anonymousClass4 = this.windowView;
        anonymousClass4.invalidate();
        PollItemMenu$$ExternalSyntheticLambda12 pollItemMenu$$ExternalSyntheticLambda12 = this.closeAction;
        if (pollItemMenu$$ExternalSyntheticLambda12 != null) {
            ChatMessageCell chatMessageCell2 = this.cell;
            if (chatMessageCell2 != null) {
                chatMessageCell2.makeVisibleAfterChange = true;
            }
            AndroidUtilities.runOnUIThread(pollItemMenu$$ExternalSyntheticLambda12);
            this.closeAction = null;
            ThanosEffect thanosEffect = new ThanosEffect(this.context, null);
            this.thanosEffect = thanosEffect;
            anonymousClass4.addView(thanosEffect, LayoutHelper.createFrame(-1, -1, 119));
            ThanosEffect thanosEffect2 = this.thanosEffect;
            AnonymousClass3 anonymousClass5 = this.myCell;
            SecretVoicePlayer$$ExternalSyntheticLambda6 secretVoicePlayer$$ExternalSyntheticLambda6 = new SecretVoicePlayer$$ExternalSyntheticLambda6(this, 2);
            ThanosEffect.DrawingThread drawingThread = thanosEffect2.drawThread;
            if (drawingThread != null) {
                drawingThread.animate(anonymousClass5, 1.5f, secretVoicePlayer$$ExternalSyntheticLambda6);
                Choreographer.getInstance().postFrameCallback(thanosEffect2.frameCallback);
            } else {
                ThanosEffect.ToSet toSet = new ThanosEffect.ToSet(anonymousClass5, secretVoicePlayer$$ExternalSyntheticLambda6);
                toSet.durationMultiplier = 1.5f;
                thanosEffect2.toSet.add(toSet);
            }
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        EarListener earListener = this.earListener;
        if (earListener == null || !earListener.attached) {
            return;
        }
        SensorManager sensorManager = earListener.sensorManager;
        Sensor sensor = earListener.gravitySensor;
        if (sensor != null) {
            sensorManager.unregisterListener(earListener, sensor);
        }
        Sensor sensor2 = earListener.linearSensor;
        if (sensor2 != null) {
            sensorManager.unregisterListener(earListener, sensor2);
        }
        Sensor sensor3 = earListener.accelerometerSensor;
        if (sensor3 != null) {
            sensorManager.unregisterListener(earListener, sensor3);
        }
        sensorManager.unregisterListener(earListener, earListener.proximitySensor);
        PowerManager.WakeLock wakeLock = earListener.proximityWakeLock;
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
        }
        earListener.attached = false;
    }

    public final void lambda$dismiss$6() {
        super.dismiss();
    }

    public final void lambda$dismiss$8() {
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        MessageObject messageObject;
        AlertDialog alertDialog = this.backDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.backDialog = null;
            return;
        }
        if (this.dismissing || (messageObject = this.messageObject) == null || messageObject.isOutOwner()) {
            super.onBackPressed();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        String string = LocaleController.getString(this.isRound ? R.string.VideoOnceCloseTitle : R.string.VoiceOnceCloseTitle);
        AlertDialog alertDialog2 = builder.alertDialog;
        alertDialog2.title = string;
        alertDialog2.message = LocaleController.getString(this.isRound ? R.string.VideoOnceCloseMessage : R.string.VoiceOnceCloseMessage);
        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new SecretVoicePlayer$$ExternalSyntheticLambda3(this, 0));
        builder.setNegativeButton(LocaleController.getString(R.string.Delete), new SecretVoicePlayer$$ExternalSyntheticLambda3(this, 2));
        this.backDialog = alertDialog2;
        alertDialog2.show();
        TextView textView = (TextView) this.backDialog.getButton(-2);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LoginActivity.AnonymousClass4 anonymousClass4 = this.windowView;
        setContentView(anonymousClass4, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i | (-2013060864);
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= 1152;
        window.setAttributes(attributes);
        anonymousClass4.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(anonymousClass4, !Theme.currentTheme.isDark());
    }

    public final void setupTranslation() {
        if (this.hasTranslation) {
            return;
        }
        LoginActivity.AnonymousClass4 anonymousClass4 = this.windowView;
        if (anonymousClass4.getWidth() <= 0) {
            return;
        }
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell != null) {
            int[] iArr = new int[2];
            chatMessageCell.getLocationOnScreen(iArr);
            float f = iArr[0] - this.insets.left;
            int width = anonymousClass4.getWidth();
            Insets insets = this.insets;
            this.tx = f - ((((width - insets.left) - insets.right) - this.cell.getWidth()) / 2.0f);
            float f2 = iArr[1] - this.insets.top;
            int height = anonymousClass4.getHeight();
            Insets insets2 = this.insets;
            this.ty = ImageReceiver$$ExternalSyntheticOutline1.m(((height - insets2.top) - insets2.bottom) - this.cell.getHeight(), this.heightdiff, 2.0f, f2);
            if (!this.hasDestTranslation) {
                this.hasDestTranslation = true;
                float fClamp = (Utilities.clamp((this.cell.getHeight() / 2.0f) + iArr[1], anonymousClass4.getHeight() * 0.7f, anonymousClass4.getHeight() * 0.3f) - (this.cell.getHeight() / 2.0f)) - ((anonymousClass4.getHeight() - this.cell.getHeight()) / 2.0f);
                this.dty = fClamp;
                if (this.isRound) {
                    this.dty = 0.0f;
                } else {
                    this.dty = AndroidUtilities.lerp(0.0f, fClamp, 0.78f);
                }
            }
            updateTranslation();
        } else {
            this.ty = 0.0f;
            this.tx = 0.0f;
        }
        this.hasTranslation = true;
    }

    @Override
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            ChatMessageCell chatMessageCell = this.cell;
            if (chatMessageCell != null) {
                chatMessageCell.setVisibility(4);
            }
            AndroidUtilities.makeGlobalBlurBitmap(new OAuthSheet$$ExternalSyntheticLambda13(24, this, chatMessageCell), 14.0f);
            this.setCellInvisible = true;
            animateOpenTo(null, true);
            ChatActivity$$ExternalSyntheticLambda6 chatActivity$$ExternalSyntheticLambda6 = this.openAction;
            if (chatActivity$$ExternalSyntheticLambda6 != null) {
                AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda6);
                this.openAction = null;
            }
            EarListener earListener = this.earListener;
            if (earListener == null || earListener.attached) {
                return;
            }
            SensorManager sensorManager = earListener.sensorManager;
            Sensor sensor = earListener.gravitySensor;
            if (sensor != null) {
                sensorManager.registerListener(earListener, sensor, 30000);
            }
            Sensor sensor2 = earListener.linearSensor;
            if (sensor2 != null) {
                sensorManager.registerListener(earListener, sensor2, 30000);
            }
            Sensor sensor3 = earListener.accelerometerSensor;
            if (sensor3 != null) {
                sensorManager.registerListener(earListener, sensor3, 30000);
            }
            sensorManager.registerListener(earListener, earListener.proximitySensor, 3);
            PowerManager.WakeLock wakeLock = earListener.proximityWakeLock;
            if (wakeLock != null && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                wakeLock.acquire();
            }
            earListener.attached = true;
        }
    }

    public final void updateTranslation() {
        if (this.thanosEffect != null) {
            return;
        }
        setTranslationX(AndroidUtilities.lerp(this.tx, 0.0f, this.openProgress));
        setTranslationY(AndroidUtilities.lerp(this.ty, this.dty, this.openProgress));
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.setTranslationX(AndroidUtilities.lerp(this.tx, 0.0f, this.openProgress));
            this.hintView.setTranslationY(AndroidUtilities.lerp(this.ty, this.dty, this.openProgress));
        }
    }
}
