package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
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

public class SecretVoicePlayer extends Dialog {
    private AudioVisualizerDrawable audioVisualizerDrawable;
    private AlertDialog backDialog;
    private Bitmap blurBitmap;
    private Paint blurBitmapPaint;
    private BitmapShader blurBitmapShader;
    private Matrix blurMatrix;
    private ChatMessageCell cell;
    private Runnable checkTimeRunnable;
    private float clipBottom;
    private float clipTop;
    private Runnable closeAction;
    private TextView closeButton;
    private FrameLayout containerView;
    public final Context context;
    private boolean dismissing;
    private float dtx;
    private float dty;
    private EarListener earListener;
    private boolean hasDestTranslation;
    private boolean hasTranslation;
    private float heightdiff;
    private HintView2 hintView;
    private Insets insets;
    private boolean isRound;
    private MessageObject messageObject;
    private ChatMessageCell myCell;
    private boolean open;
    private ValueAnimator open2Animator;
    private Runnable openAction;
    private ValueAnimator openAnimator;
    private float openProgress;
    private float openProgress2;
    private VideoPlayer player;
    private float progress;
    private final RectF rect;
    private boolean renderedFirstFrame;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean setCellInvisible;
    private TextureView textureView;
    private ThanosEffect thanosEffect;
    private float tx;
    private float ty;
    private FrameLayout windowView;

    public SecretVoicePlayer(Context context) {
        super(context, R.style.TransparentDialog);
        this.insets = Insets.NONE;
        this.rect = new RectF();
        this.clipTop = 0.0f;
        this.clipBottom = 0.0f;
        this.checkTimeRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.checkTime();
            }
        };
        this.progress = 0.0f;
        this.dismissing = false;
        this.context = context;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (SecretVoicePlayer.this.openProgress > 0.0f && SecretVoicePlayer.this.blurBitmapPaint != null) {
                    SecretVoicePlayer.this.blurMatrix.reset();
                    float width = getWidth() / SecretVoicePlayer.this.blurBitmap.getWidth();
                    SecretVoicePlayer.this.blurMatrix.postScale(width, width);
                    SecretVoicePlayer.this.blurBitmapShader.setLocalMatrix(SecretVoicePlayer.this.blurMatrix);
                    SecretVoicePlayer.this.blurBitmapPaint.setAlpha((int) (SecretVoicePlayer.this.openProgress * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), SecretVoicePlayer.this.blurBitmapPaint);
                }
                if (SecretVoicePlayer.this.setCellInvisible && SecretVoicePlayer.this.cell != null) {
                    SecretVoicePlayer.this.cell.setVisibility(4);
                    SecretVoicePlayer.this.setCellInvisible = false;
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    SecretVoicePlayer.this.dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                SecretVoicePlayer.this.setupTranslation();
            }
        };
        this.windowView = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context) {
            private final Path clipPath = new Path();

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view != SecretVoicePlayer.this.myCell && view != SecretVoicePlayer.this.hintView) {
                    if (view == SecretVoicePlayer.this.textureView) {
                        canvas.save();
                        this.clipPath.rewind();
                        this.clipPath.addCircle(SecretVoicePlayer.this.myCell.getX() + SecretVoicePlayer.this.rect.centerX(), SecretVoicePlayer.this.myCell.getY() + SecretVoicePlayer.this.rect.centerY(), SecretVoicePlayer.this.rect.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(this.clipPath);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(SecretVoicePlayer.this.clipTop, 0.0f, SecretVoicePlayer.this.openProgress), getWidth(), AndroidUtilities.lerp(SecretVoicePlayer.this.clipBottom, getHeight(), SecretVoicePlayer.this.openProgress));
                        canvas.translate(-SecretVoicePlayer.this.textureView.getX(), -SecretVoicePlayer.this.textureView.getY());
                        canvas.translate(SecretVoicePlayer.this.myCell.getX() + SecretVoicePlayer.this.rect.left, SecretVoicePlayer.this.myCell.getY() + SecretVoicePlayer.this.rect.top);
                        canvas.scale(SecretVoicePlayer.this.rect.width() / SecretVoicePlayer.this.textureView.getMeasuredWidth(), SecretVoicePlayer.this.rect.height() / SecretVoicePlayer.this.textureView.getMeasuredHeight(), SecretVoicePlayer.this.textureView.getX(), SecretVoicePlayer.this.textureView.getY());
                        boolean zDrawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return zDrawChild;
                    }
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(SecretVoicePlayer.this.clipTop, 0.0f, SecretVoicePlayer.this.openProgress), getWidth(), AndroidUtilities.lerp(SecretVoicePlayer.this.clipBottom, getHeight(), SecretVoicePlayer.this.openProgress));
                boolean zDrawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild2;
            }
        };
        this.containerView = frameLayout2;
        frameLayout2.setClipToPadding(false);
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1, 119));
        ViewCompat.setOnApplyWindowInsetsListener(this.windowView, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.lambda$new$1(view, windowInsetsCompat);
            }
        });
        if (SharedConfig.raiseToListen) {
            this.earListener = new EarListener(context);
        }
    }

    public void lambda$new$0(View view) {
        if (this.closeAction == null) {
            dismiss();
        }
    }

    public WindowInsetsCompat lambda$new$1(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        this.insets = defaultWindowInsets;
        this.containerView.setPadding(defaultWindowInsets.left, defaultWindowInsets.top, defaultWindowInsets.right, defaultWindowInsets.bottom);
        this.windowView.requestLayout();
        return WindowInsetsCompat.CONSUMED;
    }

    private void prepareBlur(final View view) {
        if (view != null) {
            view.setVisibility(4);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$prepareBlur$2(view, (Bitmap) obj);
            }
        }, 14.0f);
    }

    public void lambda$prepareBlur$2(View view, Bitmap bitmap) {
        if (view != null) {
            view.setVisibility(0);
        }
        this.blurBitmap = bitmap;
        Paint paint = new Paint(1);
        this.blurBitmapPaint = paint;
        Bitmap bitmap2 = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        this.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.05f : 0.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.02f : -0.04f);
        this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.blurMatrix = new Matrix();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
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
        this.windowView.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(this.windowView, !Theme.isCurrentThemeDark());
    }

    public void setupTranslation() {
        if (this.hasTranslation || this.windowView.getWidth() <= 0) {
            return;
        }
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell != null) {
            int[] iArr = new int[2];
            chatMessageCell.getLocationOnScreen(iArr);
            float f = iArr[0] - this.insets.left;
            int width = this.windowView.getWidth();
            Insets insets = this.insets;
            this.tx = f - ((((width - insets.left) - insets.right) - this.cell.getWidth()) / 2.0f);
            float f2 = iArr[1] - this.insets.top;
            int height = this.windowView.getHeight();
            Insets insets2 = this.insets;
            this.ty = f2 - (((((height - insets2.top) - insets2.bottom) - this.cell.getHeight()) - this.heightdiff) / 2.0f);
            if (!this.hasDestTranslation) {
                this.hasDestTranslation = true;
                this.dtx = 0.0f;
                float fClamp = (Utilities.clamp(iArr[1] + (this.cell.getHeight() / 2.0f), this.windowView.getHeight() * 0.7f, this.windowView.getHeight() * 0.3f) - (this.cell.getHeight() / 2.0f)) - ((this.windowView.getHeight() - this.cell.getHeight()) / 2.0f);
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

    public void updateTranslation() {
        if (this.thanosEffect != null) {
            return;
        }
        this.myCell.setTranslationX(AndroidUtilities.lerp(this.tx, this.dtx, this.openProgress));
        this.myCell.setTranslationY(AndroidUtilities.lerp(this.ty, this.dty, this.openProgress));
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.setTranslationX(AndroidUtilities.lerp(this.tx, this.dtx, this.openProgress));
            this.hintView.setTranslationY(AndroidUtilities.lerp(this.ty, this.dty, this.openProgress));
        }
    }

    public void setCell(org.telegram.ui.Cells.ChatMessageCell r21, java.lang.Runnable r22, java.lang.Runnable r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SecretVoicePlayer.setCell(org.telegram.ui.Cells.ChatMessageCell, java.lang.Runnable, java.lang.Runnable):void");
    }

    class AnonymousClass5 implements VideoPlayer.VideoPlayerDelegate {
        @Override
        public void onError(VideoPlayer videoPlayer, Exception exc) {
        }

        @Override
        public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onRenderedFirstFrame(this, eventTime);
        }

        @Override
        public void onSeekFinished(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
        }

        @Override
        public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        }

        AnonymousClass5() {
        }

        @Override
        public void onStateChanged(boolean z, int i) {
            if (i != 4) {
                AndroidUtilities.cancelRunOnUIThread(SecretVoicePlayer.this.checkTimeRunnable);
                AndroidUtilities.runOnUIThread(SecretVoicePlayer.this.checkTimeRunnable, 16L);
            } else {
                SecretVoicePlayer.this.dismiss();
            }
        }

        @Override
        public void onRenderedFirstFrame() {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onRenderedFirstFrame$0();
                }
            });
        }

        public void lambda$onRenderedFirstFrame$0() {
            SecretVoicePlayer.this.renderedFirstFrame = true;
            SecretVoicePlayer.this.myCell.invalidate();
        }
    }

    public void lambda$setCell$3(View view) {
        dismiss();
    }

    @Override
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            prepareBlur(this.cell);
            this.setCellInvisible = true;
            this.open = true;
            animateOpenTo(true, null);
            Runnable runnable = this.openAction;
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                this.openAction = null;
            }
            EarListener earListener = this.earListener;
            if (earListener != null) {
                earListener.attach();
            }
        }
    }

    public void checkTime() {
        if (this.player == null) {
            return;
        }
        this.progress = r0.getCurrentPosition() / this.player.getDuration();
        ChatMessageCell chatMessageCell = this.myCell;
        if (chatMessageCell != null) {
            chatMessageCell.overrideDuration((this.player.getDuration() - this.player.getCurrentPosition()) / 1000);
            this.myCell.updatePlayingMessageProgress();
            SeekBarWaveform seekBarWaveform = this.myCell.getSeekBarWaveform();
            if (seekBarWaveform != null) {
                seekBarWaveform.explodeAt(this.progress);
            }
        }
        if (this.player.isPlaying()) {
            AndroidUtilities.cancelRunOnUIThread(this.checkTimeRunnable);
            AndroidUtilities.runOnUIThread(this.checkTimeRunnable, 16L);
        }
    }

    public boolean isShown() {
        return !this.dismissing;
    }

    @Override
    public void onBackPressed() {
        MessageObject messageObject;
        AlertDialog alertDialog = this.backDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.backDialog = null;
            return;
        }
        if (!this.dismissing && (messageObject = this.messageObject) != null && !messageObject.isOutOwner()) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(this.isRound ? R.string.VideoOnceCloseTitle : R.string.VoiceOnceCloseTitle)).setMessage(LocaleController.getString(this.isRound ? R.string.VideoOnceCloseMessage : R.string.VoiceOnceCloseMessage)).setPositiveButton(LocaleController.getString(R.string.Continue), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog2, int i) {
                    this.f$0.lambda$onBackPressed$4(alertDialog2, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog2, int i) {
                    this.f$0.lambda$onBackPressed$5(alertDialog2, i);
                }
            }).create();
            this.backDialog = alertDialogCreate;
            alertDialogCreate.show();
            TextView textView = (TextView) this.backDialog.getButton(-2);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    public void lambda$onBackPressed$4(AlertDialog alertDialog, int i) {
        AlertDialog alertDialog2 = this.backDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
    }

    public void lambda$onBackPressed$5(AlertDialog alertDialog, int i) {
        AlertDialog alertDialog2 = this.backDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
            this.backDialog = null;
        }
        dismiss();
    }

    @Override
    public void dismiss() {
        ChatMessageCell chatMessageCell;
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
            hintView2.hide();
        }
        VideoPlayer videoPlayer = this.player;
        if (videoPlayer != null) {
            videoPlayer.pause();
            this.player.releasePlayer(true);
            this.player = null;
        }
        if (!this.isRound && (chatMessageCell = this.myCell) != null && chatMessageCell.getSeekBarWaveform() != null) {
            this.myCell.getSeekBarWaveform().setExplosionRate(this.openProgress);
        }
        this.hasTranslation = false;
        setupTranslation();
        this.open = false;
        animateOpenTo(false, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$dismiss$7();
            }
        });
        this.windowView.invalidate();
        Runnable runnable = this.closeAction;
        if (runnable != null) {
            ChatMessageCell chatMessageCell2 = this.cell;
            if (chatMessageCell2 != null) {
                chatMessageCell2.makeVisibleAfterChange = true;
            }
            AndroidUtilities.runOnUIThread(runnable);
            this.closeAction = null;
            ThanosEffect thanosEffect = new ThanosEffect(this.context, null);
            this.thanosEffect = thanosEffect;
            this.windowView.addView(thanosEffect, LayoutHelper.createFrame(-1, -1, 119));
            this.thanosEffect.animate(this.myCell, 1.5f, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$dismiss$8();
                }
            });
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        }
        EarListener earListener = this.earListener;
        if (earListener != null) {
            earListener.detach();
        }
    }

    public void lambda$dismiss$7() {
        if (this.thanosEffect == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$dismiss$6();
                }
            });
            ChatMessageCell chatMessageCell = this.cell;
            if (chatMessageCell != null) {
                chatMessageCell.setVisibility(0);
                this.cell.invalidate();
            }
        }
        MediaController.getInstance().tryResumePausedAudio();
    }

    public void lambda$dismiss$6() {
        super.dismiss();
    }

    public void lambda$dismiss$8() {
        super.dismiss();
    }

    private void animateOpenTo(final boolean z, final Runnable runnable) {
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
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                this.f$0.lambda$animateOpenTo$9(z, valueAnimator3);
            }
        });
        this.openAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SecretVoicePlayer.this.openProgress = z ? 1.0f : 0.0f;
                SecretVoicePlayer.this.windowView.invalidate();
                SecretVoicePlayer.this.containerView.invalidate();
                SecretVoicePlayer.this.updateTranslation();
                if (SecretVoicePlayer.this.closeButton != null) {
                    SecretVoicePlayer.this.closeButton.setAlpha(SecretVoicePlayer.this.openProgress);
                }
                if (SecretVoicePlayer.this.isRound) {
                    SecretVoicePlayer.this.myCell.invalidate();
                }
                if (!SecretVoicePlayer.this.isRound && SecretVoicePlayer.this.myCell != null && SecretVoicePlayer.this.myCell.getSeekBarWaveform() != null) {
                    SecretVoicePlayer.this.myCell.getSeekBarWaveform().setExplosionRate(SecretVoicePlayer.this.openProgress);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        long j = (z || this.closeAction != null) ? 520L : 330L;
        ValueAnimator valueAnimator3 = this.openAnimator;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        valueAnimator3.setInterpolator(cubicBezierInterpolator);
        this.openAnimator.setDuration(j);
        this.openAnimator.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.openProgress2, z ? 1.0f : 0.0f);
        this.open2Animator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                this.f$0.lambda$animateOpenTo$10(valueAnimator4);
            }
        });
        this.open2Animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SecretVoicePlayer.this.openProgress2 = z ? 1.0f : 0.0f;
                if (SecretVoicePlayer.this.isRound) {
                    SecretVoicePlayer.this.myCell.invalidate();
                }
            }
        });
        this.open2Animator.setDuration((long) (j * 1.5f));
        this.open2Animator.setInterpolator(cubicBezierInterpolator);
        this.open2Animator.start();
    }

    public void lambda$animateOpenTo$9(boolean z, ValueAnimator valueAnimator) {
        ChatMessageCell chatMessageCell;
        this.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.windowView.invalidate();
        this.containerView.invalidate();
        if (this.isRound) {
            this.myCell.invalidate();
        }
        updateTranslation();
        TextView textView = this.closeButton;
        if (textView != null) {
            textView.setAlpha(this.openProgress);
        }
        if (this.isRound || (chatMessageCell = this.myCell) == null || chatMessageCell.getSeekBarWaveform() == null) {
            return;
        }
        this.myCell.getSeekBarWaveform().setExplosionRate((z ? CubicBezierInterpolator.EASE_OUT : CubicBezierInterpolator.EASE_IN).getInterpolation(Utilities.clamp(this.openProgress * 1.25f, 1.0f, 0.0f)));
    }

    public void lambda$animateOpenTo$10(ValueAnimator valueAnimator) {
        this.openProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.isRound) {
            this.myCell.invalidate();
        }
    }
}
