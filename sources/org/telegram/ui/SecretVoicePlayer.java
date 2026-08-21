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
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AudioVisualizerDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EarListener;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SeekBarWaveform;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Components.TimerParticles;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
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
                Canvas canvas2;
                if (SecretVoicePlayer.this.openProgress <= 0.0f || SecretVoicePlayer.this.blurBitmapPaint == null) {
                    canvas2 = canvas;
                } else {
                    SecretVoicePlayer.this.blurMatrix.reset();
                    float width = getWidth() / SecretVoicePlayer.this.blurBitmap.getWidth();
                    SecretVoicePlayer.this.blurMatrix.postScale(width, width);
                    SecretVoicePlayer.this.blurBitmapShader.setLocalMatrix(SecretVoicePlayer.this.blurMatrix);
                    SecretVoicePlayer.this.blurBitmapPaint.setAlpha((int) (SecretVoicePlayer.this.openProgress * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), SecretVoicePlayer.this.blurBitmapPaint);
                }
                if (SecretVoicePlayer.this.setCellInvisible && SecretVoicePlayer.this.cell != null) {
                    SecretVoicePlayer.this.cell.setVisibility(4);
                    SecretVoicePlayer.this.setCellInvisible = false;
                }
                super.dispatchDraw(canvas2);
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
                SecretVoicePlayer.m4001$r8$lambda$LeF4wIGXatYvPasvsipyHHniC8(this.f$0, view);
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
                return SecretVoicePlayer.$r8$lambda$t2vFV0Ft9twosv66n5FYiIaR3CE(this.f$0, view, windowInsetsCompat);
            }
        });
        if (SharedConfig.raiseToListen) {
            this.earListener = new EarListener(context);
        }
    }

    public static void m4001$r8$lambda$LeF4wIGXatYvPasvsipyHHniC8(SecretVoicePlayer secretVoicePlayer, View view) {
        if (secretVoicePlayer.closeAction == null) {
            secretVoicePlayer.dismiss();
        }
    }

    public static WindowInsetsCompat $r8$lambda$t2vFV0Ft9twosv66n5FYiIaR3CE(SecretVoicePlayer secretVoicePlayer, View view, WindowInsetsCompat windowInsetsCompat) {
        secretVoicePlayer.getClass();
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        secretVoicePlayer.insets = defaultWindowInsets;
        secretVoicePlayer.containerView.setPadding(defaultWindowInsets.left, defaultWindowInsets.top, defaultWindowInsets.right, defaultWindowInsets.bottom);
        secretVoicePlayer.windowView.requestLayout();
        return WindowInsetsCompat.CONSUMED;
    }

    private void prepareBlur(final View view) {
        if (view != null) {
            view.setVisibility(4);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                SecretVoicePlayer.m4002$r8$lambda$RsyRmTAcJKWZBeOcrZYnYy5pas(this.f$0, view, (Bitmap) obj);
            }
        }, 14.0f);
    }

    public static void m4002$r8$lambda$RsyRmTAcJKWZBeOcrZYnYy5pas(SecretVoicePlayer secretVoicePlayer, View view, Bitmap bitmap) {
        if (view != null) {
            secretVoicePlayer.getClass();
            view.setVisibility(0);
        }
        secretVoicePlayer.blurBitmap = bitmap;
        Paint paint = new Paint(1);
        secretVoicePlayer.blurBitmapPaint = paint;
        Bitmap bitmap2 = secretVoicePlayer.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        secretVoicePlayer.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.05f : 0.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.02f : -0.04f);
        secretVoicePlayer.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        secretVoicePlayer.blurMatrix = new Matrix();
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

    public void setCell(ChatMessageCell chatMessageCell, Runnable runnable, Runnable runnable2) {
        int iCeil;
        ChatMessageCell chatMessageCell2;
        String firstName;
        this.openAction = runnable;
        this.closeAction = runnable2;
        ChatMessageCell chatMessageCell3 = this.myCell;
        if (chatMessageCell3 != null) {
            this.containerView.removeView(chatMessageCell3);
            this.myCell = null;
        }
        this.cell = chatMessageCell;
        MessageObject messageObject = chatMessageCell != null ? chatMessageCell.getMessageObject() : null;
        this.messageObject = messageObject;
        this.isRound = messageObject != null && messageObject.isRoundVideo();
        ChatMessageCell chatMessageCell4 = this.cell;
        this.resourcesProvider = chatMessageCell4 != null ? chatMessageCell4.getResourcesProvider() : null;
        if (this.cell != null) {
            this.clipTop = chatMessageCell.parentBoundsTop;
            this.clipBottom = chatMessageCell.parentBoundsBottom;
            if (chatMessageCell.getParent() instanceof View) {
                View view = (View) chatMessageCell.getParent();
                this.clipTop += view.getY();
                this.clipBottom += view.getY();
            }
            final int width = this.cell.getWidth();
            int height = this.cell.getHeight();
            if (this.isRound) {
                height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
            }
            final int i = height;
            this.heightdiff = i - this.cell.getHeight();
            iCeil = (int) Math.ceil((Math.min(width, i) * 0.92f) / AndroidUtilities.density);
            ChatMessageCell chatMessageCell5 = new ChatMessageCell(getContext(), UserConfig.selectedAccount, false, null, this.cell.getResourcesProvider()) {
                private Paint clipPaint;
                private RadialGradient radialGradient;
                private Matrix radialMatrix;
                private Paint radialPaint;
                private TimerParticles timerParticles;
                private boolean setRect = false;
                final RectF fromRect = new RectF();
                final RectF toRect = new RectF();
                private Path clipPath = new Path();
                private Paint progressPaint = new Paint(1);
                private AnimatedFloat renderedFirstFrameT = new AnimatedFloat(0.0f, this, 0, 120, new LinearInterpolator());

                @Override
                public int getBoundsLeft() {
                    return 0;
                }

                @Override
                public void setPressed(boolean z) {
                }

                @Override
                public int getBoundsRight() {
                    return getWidth();
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    Canvas canvas2;
                    if (SecretVoicePlayer.this.isRound) {
                        if (!this.setRect) {
                            this.fromRect.set(getPhotoImage().getImageX(), getPhotoImage().getImageY(), getPhotoImage().getImageX2(), getPhotoImage().getImageY2());
                            float fMin = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                            this.toRect.set((getMeasuredWidth() - fMin) / 2.0f, (getMeasuredHeight() - fMin) / 2.0f, (getMeasuredWidth() + fMin) / 2.0f, (getMeasuredHeight() + fMin) / 2.0f);
                            this.setRect = true;
                            this.radialGradient = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                            Paint paint = new Paint(1);
                            this.radialPaint = paint;
                            paint.setShader(this.radialGradient);
                            this.radialPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                            this.radialMatrix = new Matrix();
                        }
                        AndroidUtilities.lerp(this.fromRect, this.toRect, SecretVoicePlayer.this.openProgress, SecretVoicePlayer.this.rect);
                        setImageCoords(SecretVoicePlayer.this.rect.left, SecretVoicePlayer.this.rect.top, SecretVoicePlayer.this.rect.width(), SecretVoicePlayer.this.rect.height());
                        getPhotoImage().setRoundRadius((int) SecretVoicePlayer.this.rect.width());
                        if (SecretVoicePlayer.this.openProgress <= 0.0f || !SecretVoicePlayer.this.renderedFirstFrame) {
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                        }
                        this.radialProgressAlpha = 1.0f - SecretVoicePlayer.this.openProgress;
                    } else {
                        canvas2 = canvas;
                    }
                    super.onDraw(canvas2);
                    if (SecretVoicePlayer.this.isRound && SecretVoicePlayer.this.openProgress > 0.0f && SecretVoicePlayer.this.renderedFirstFrame) {
                        canvas2.restore();
                    }
                }

                @Override
                public void drawReactionsLayout(Canvas canvas, float f, Integer num) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.lerp(0, -this.reactionsLayoutInBubble.x, SecretVoicePlayer.this.openProgress), AndroidUtilities.lerp(SecretVoicePlayer.this.cell.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), this.reactionsLayoutInBubble.totalHeight, SecretVoicePlayer.this.openProgress));
                    super.drawReactionsLayout(canvas, (1.0f - SecretVoicePlayer.this.openProgress) * f, num);
                    canvas.restore();
                }

                @Override
                public void drawTime(Canvas canvas, float f, boolean z) {
                    canvas.save();
                    if (SecretVoicePlayer.this.isRound) {
                        int i2 = this.timeWidth;
                        int i3 = 0;
                        if (SecretVoicePlayer.this.messageObject != null && SecretVoicePlayer.this.messageObject.isOutOwner()) {
                            if (SecretVoicePlayer.this.messageObject != null && SecretVoicePlayer.this.messageObject.type == 19) {
                                i3 = 4;
                            }
                            i3 += 20;
                        }
                        canvas.translate(((this.toRect.right - (i2 + AndroidUtilities.dp(8 + i3))) - this.timeX) * SecretVoicePlayer.this.openProgress, 0.0f);
                    }
                    super.drawTime(canvas, f, z);
                    canvas.restore();
                }

                @Override
                protected void drawRadialProgress(Canvas canvas) {
                    super.drawRadialProgress(canvas);
                }

                @Override
                public void setVisibility(int i2) {
                    super.setVisibility(i2);
                    if (SecretVoicePlayer.this.textureView == null || i2 != 8) {
                        return;
                    }
                    SecretVoicePlayer.this.textureView.setVisibility(i2);
                }

                private Paint getClipPaint() {
                    if (this.clipPaint == null) {
                        Paint paint = new Paint(1);
                        this.clipPaint = paint;
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    return this.clipPaint;
                }

                @Override
                public void drawBlurredPhoto(Canvas canvas) {
                    if (this.radialPaint != null) {
                        if (SecretVoicePlayer.this.openProgress > 0.0f) {
                            if (SecretVoicePlayer.this.renderedFirstFrame) {
                                if (this.drawingToBitmap) {
                                    Bitmap bitmap = SecretVoicePlayer.this.textureView.getBitmap();
                                    if (bitmap != null) {
                                        canvas.save();
                                        this.clipPath.rewind();
                                        this.clipPath.addCircle(SecretVoicePlayer.this.rect.centerX(), SecretVoicePlayer.this.rect.centerY(), SecretVoicePlayer.this.rect.width() / 2.0f, Path.Direction.CW);
                                        canvas.clipPath(this.clipPath);
                                        canvas.scale(SecretVoicePlayer.this.rect.width() / bitmap.getWidth(), SecretVoicePlayer.this.rect.height() / bitmap.getHeight());
                                        canvas.translate(SecretVoicePlayer.this.rect.left, SecretVoicePlayer.this.rect.top);
                                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                        canvas.restore();
                                        bitmap.recycle();
                                    }
                                } else {
                                    canvas.drawCircle(SecretVoicePlayer.this.rect.centerX(), SecretVoicePlayer.this.rect.centerY(), SecretVoicePlayer.this.rect.width() / 2.0f, getClipPaint());
                                }
                                getPhotoImage().setAlpha(Math.max(1.0f - this.renderedFirstFrameT.set(SecretVoicePlayer.this.renderedFirstFrame), 1.0f - SecretVoicePlayer.this.openProgress));
                                getPhotoImage().draw(canvas);
                            } else {
                                getPhotoImage().draw(canvas);
                            }
                        }
                        this.radialMatrix.reset();
                        float fWidth = (SecretVoicePlayer.this.rect.width() / 76.8f) * SecretVoicePlayer.this.openProgress2;
                        this.radialMatrix.postScale(fWidth, fWidth);
                        this.radialMatrix.postTranslate(SecretVoicePlayer.this.rect.centerX(), SecretVoicePlayer.this.rect.centerY());
                        this.radialGradient.setLocalMatrix(this.radialMatrix);
                        canvas.saveLayerAlpha(SecretVoicePlayer.this.rect, 255, 31);
                        super.drawBlurredPhoto(canvas);
                        canvas.save();
                        canvas.drawRect(SecretVoicePlayer.this.rect, this.radialPaint);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        super.drawBlurredPhoto(canvas);
                    }
                    canvas.saveLayerAlpha(SecretVoicePlayer.this.rect, (int) (SecretVoicePlayer.this.openProgress2 * 178.0f), 31);
                    this.progressPaint.setStyle(Paint.Style.STROKE);
                    this.progressPaint.setStrokeWidth(AndroidUtilities.dp(3.33f));
                    this.progressPaint.setColor(-1);
                    this.progressPaint.setStrokeCap(Paint.Cap.ROUND);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(SecretVoicePlayer.this.rect);
                    rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
                    canvas.drawArc(rectF, -90.0f, (1.0f - SecretVoicePlayer.this.progress) * (-360.0f), false, this.progressPaint);
                    if (this.timerParticles == null) {
                        TimerParticles timerParticles = new TimerParticles(120);
                        this.timerParticles = timerParticles;
                        timerParticles.big = true;
                    }
                    this.progressPaint.setStrokeWidth(AndroidUtilities.dp(2.8f));
                    this.timerParticles.draw(canvas, this.progressPaint, rectF, (1.0f - SecretVoicePlayer.this.progress) * (-360.0f), 1.0f);
                    canvas.restore();
                }

                @Override
                public void drawBlurredPhotoParticles(Canvas canvas) {
                    AndroidUtilities.lerp(1.0f, 1.5f, SecretVoicePlayer.this.openProgress2);
                    super.drawBlurredPhotoParticles(canvas);
                }

                @Override
                protected void onMeasure(int i2, int i3) {
                    setMeasuredDimension(width, i);
                }
            };
            this.myCell = chatMessageCell5;
            this.cell.copyVisiblePartTo(chatMessageCell5);
            this.myCell.copySpoilerEffect2AttachIndexFrom(this.cell);
            this.myCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                @Override
                public boolean allowAddPollOptions() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$allowAddPollOptions(this);
                }

                @Override
                public boolean canDrawOutboundsContent() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canDrawOutboundsContent(this);
                }

                @Override
                public boolean canPerformActions() {
                    return false;
                }

                @Override
                public boolean canPerformReply() {
                    return canPerformActions();
                }

                @Override
                public boolean canSaveRichDocument(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canSaveRichDocument(this, chatMessageCell6);
                }

                @Override
                public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canToggleRichMessageCheckbox(this, chatMessageCell6);
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didLongPressBotButton(ChatMessageCell chatMessageCell6, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell6, keyboardButtonProto);
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell6, TLRPC.Chat chat, int i2, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell6, chat, i2, f, f2);
                }

                @Override
                public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell6, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressCustomBotButton(this, chatMessageCell6, buttonCustom);
                }

                @Override
                public boolean didLongPressPollOption(ChatMessageCell chatMessageCell6, TLRPC.PollAnswer pollAnswer) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressPollOption(this, chatMessageCell6, pollAnswer);
                }

                @Override
                public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell6, TLRPC.TodoItem todoItem) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressToDoButton(this, chatMessageCell6, todoItem);
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell6, TLRPC.User user, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell6, user, f, f2);
                }

                @Override
                public void didPressAboutRevenueSharingAds() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAboutRevenueSharingAds(this);
                }

                @Override
                public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAddPollOptionButton(this, chatMessageCell6);
                }

                @Override
                public void didPressAdmin(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAdmin(this, chatMessageCell6);
                }

                @Override
                public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell6, AnimatedEmojiSpan animatedEmojiSpan) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell6, animatedEmojiSpan);
                }

                @Override
                public void didPressAppUpdateButton() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAppUpdateButton(this);
                }

                @Override
                public void didPressBoostCounter(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBoostCounter(this, chatMessageCell6);
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell6, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell6, keyboardButtonProto);
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell6);
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell6, TLRPC.Chat chat, int i2, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell6, chat, i2, f, f2, z);
                }

                @Override
                public void didPressChannelRecommendation(ChatMessageCell chatMessageCell6, TLObject tLObject, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell6, tLObject, z);
                }

                @Override
                public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell6);
                }

                @Override
                public void didPressCodeCopy(ChatMessageCell chatMessageCell6, MessageObject.TextLayoutBlock textLayoutBlock) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCodeCopy(this, chatMessageCell6, textLayoutBlock);
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell6);
                }

                @Override
                public void didPressCustomBotButton(ChatMessageCell chatMessageCell6, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCustomBotButton(this, chatMessageCell6, buttonCustom);
                }

                @Override
                public void didPressEffect(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressEffect(this, chatMessageCell6);
                }

                @Override
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell6, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell6, keyboardInlineButton);
                }

                @Override
                public void didPressFactCheck(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheck(this, chatMessageCell6);
                }

                @Override
                public void didPressFactCheckWhat(ChatMessageCell chatMessageCell6, int i2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheckWhat(this, chatMessageCell6, i2, i3);
                }

                @Override
                public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell6, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGiveawayChatButton(this, chatMessageCell6, i2);
                }

                @Override
                public void didPressGroupImage(ChatMessageCell chatMessageCell6, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGroupImage(this, chatMessageCell6, imageReceiver, messageExtendedMedia, f, f2);
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell6);
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell6, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell6, i2);
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell6, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell6, f, f2, z);
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell6, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressInstantButton(this, chatMessageCell6, i2);
                }

                @Override
                public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell6);
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didPressPollMedia(ChatMessageCell chatMessageCell6, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressPollMedia(this, chatMessageCell6, imageReceiver, pollAnswer, messageMedia, f, f2, i2);
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell6, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell6, reactionCount, z, f, f2);
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell6, int i2, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell6, i2, f, f2, z);
                }

                @Override
                public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRevealSensitiveContent(this, chatMessageCell6);
                }

                @Override
                public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell6, TLRPC.Document document, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRichDocumentOptions(this, chatMessageCell6, document, f, f2);
                }

                @Override
                public void didPressShowMore(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressShowMore(this, chatMessageCell6);
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSideButton(this, chatMessageCell6);
                }

                @Override
                public void didPressSponsoredClose(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredClose(this, chatMessageCell6);
                }

                @Override
                public void didPressSponsoredInfo(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredInfo(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didPressSummarize(ChatMessageCell chatMessageCell6, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSummarize(this, chatMessageCell6, z);
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell6);
                }

                @Override
                public boolean didPressToDoButton(ChatMessageCell chatMessageCell6, TLRPC.TodoItem todoItem, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressToDoButton(this, chatMessageCell6, todoItem, z);
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell6, CharacterStyle characterStyle, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell6, characterStyle, z);
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell6, TLRPC.User user, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell6, user, f, f2, z);
                }

                @Override
                public void didPressUserStatus(ChatMessageCell chatMessageCell6, TLRPC.User user, TLRPC.Document document, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserStatus(this, chatMessageCell6, user, document, str);
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell6, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBot(this, chatMessageCell6, str);
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell6, long j) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell6, j);
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell6, ArrayList arrayList, int i2, int i3, int i4) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell6, arrayList, i2, i3, i4);
                }

                @Override
                public void didPressWebPage(ChatMessageCell chatMessageCell6, TLRPC.WebPage webPage, String str, boolean z) {
                    Browser.openUrl(chatMessageCell6.getContext(), str);
                }

                @Override
                public void didQuickShareEnd(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareEnd(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didQuickShareMove(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareMove(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didQuickShareStart(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareStart(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject2);
                }

                @Override
                public void didTogglePollPreview(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didTogglePollPreview(this, chatMessageCell6);
                }

                @Override
                public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell6, boolean z, Runnable runnable3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didToggleRichMessageCheckbox(this, chatMessageCell6, z, runnable3);
                }

                @Override
                public boolean doNotShowLoadingReply(MessageObject messageObject2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$doNotShowLoadingReply(this, messageObject2);
                }

                @Override
                public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$drawPollMode(this, canvas, chatMessageCell6);
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell6, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdate(this, chatMessageCell6, z);
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell6, boolean z, boolean z2) {
                    forceUpdate(chatMessageCell6, z);
                }

                @Override
                public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell6, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdateNoAnimation(this, chatMessageCell6, z);
                }

                @Override
                public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell6);
                }

                @Override
                public String getAdminRank(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAdminRank(this, j);
                }

                @Override
                public int getChatMode() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getChatMode(this);
                }

                @Override
                public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getDraftMessageMeasureController(this);
                }

                @Override
                public PinchToZoomHelper getPinchToZoomHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getPinchToZoomHelper(this);
                }

                @Override
                public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell6);
                }

                @Override
                public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingLink(this, chatMessageCell6);
                }

                @Override
                public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getTextSelectionHelper(this);
                }

                @Override
                public boolean hasSelectedMessages() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$hasSelectedMessages(this);
                }

                @Override
                public void invalidateBlur() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$invalidateBlur(this);
                }

                @Override
                public boolean isAdmin(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isAdmin(this, j);
                }

                @Override
                public boolean isLandscape() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isLandscape(this);
                }

                @Override
                public boolean isOwner(long j) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isOwner(this, j);
                }

                @Override
                public boolean isProgressLoading(ChatMessageCell chatMessageCell6, int i2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isProgressLoading(this, chatMessageCell6, i2);
                }

                @Override
                public boolean isReplyOrSelf() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isReplyOrSelf(this);
                }

                @Override
                public boolean keyboardIsOpened() {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$keyboardIsOpened(this);
                }

                @Override
                public void needOpenWebView(MessageObject messageObject2, String str, String str2, String str3, String str4, int i2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needOpenWebView(this, messageObject2, str, str2, str3, str4, i2, i3);
                }

                @Override
                public boolean needPlayMessage(ChatMessageCell chatMessageCell6, MessageObject messageObject2, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, chatMessageCell6, messageObject2, z);
                }

                @Override
                public void needReloadPolls() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
                }

                @Override
                public void needShowPremiumBulletin(int i2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needShowPremiumBulletin(this, i2);
                }

                @Override
                public boolean onAccessibilityAction(int i2, Bundle bundle) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$onAccessibilityAction(this, i2, bundle);
                }

                @Override
                public void onDiceFinished() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$onDiceFinished(this);
                }

                @Override
                public boolean openArticlePhoto(ChatMessageCell chatMessageCell6, TL_iv.PageBlock pageBlock) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$openArticlePhoto(this, chatMessageCell6, pageBlock);
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject2);
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell6, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell6, z);
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject2);
                }

                @Override
                public void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                }
            });
            ChatMessageCell chatMessageCell6 = this.myCell;
            MessageObject messageObject2 = this.messageObject;
            MessageObject.GroupedMessages currentMessagesGroup = this.cell.getCurrentMessagesGroup();
            ChatMessageCell chatMessageCell7 = this.cell;
            chatMessageCell6.setMessageObject(messageObject2, currentMessagesGroup, chatMessageCell7.pinnedBottom, chatMessageCell7.pinnedTop, false);
            if (!this.isRound) {
                AudioVisualizerDrawable audioVisualizerDrawable = new AudioVisualizerDrawable();
                this.audioVisualizerDrawable = audioVisualizerDrawable;
                audioVisualizerDrawable.setParentView(this.myCell);
                this.myCell.overrideAudioVisualizer(this.audioVisualizerDrawable);
                if (this.myCell.getSeekBarWaveform() != null) {
                    this.myCell.getSeekBarWaveform().setExplosionRate(this.openProgress);
                }
            }
            this.hasTranslation = false;
            this.containerView.addView(this.myCell, new FrameLayout.LayoutParams(this.cell.getWidth(), i, 17));
        } else {
            iCeil = 360;
        }
        TextureView textureView = this.textureView;
        if (textureView != null) {
            this.containerView.removeView(textureView);
            this.textureView = null;
        }
        if (this.isRound) {
            this.renderedFirstFrame = false;
            TextureView textureView2 = new TextureView(this.context);
            this.textureView = textureView2;
            this.containerView.addView(textureView2, 0, LayoutHelper.createFrame(iCeil, iCeil));
        }
        MediaController.getInstance().pauseByRewind();
        VideoPlayer videoPlayer = this.player;
        if (videoPlayer != null) {
            videoPlayer.pause();
            this.player.releasePlayer(true);
            this.player = null;
        }
        ChatMessageCell chatMessageCell8 = this.cell;
        if (chatMessageCell8 != null && chatMessageCell8.getMessageObject() != null) {
            File pathToAttach = FileLoader.getInstance(this.cell.getMessageObject().currentAccount).getPathToAttach(this.cell.getMessageObject().getDocument());
            if (pathToAttach != null && !pathToAttach.exists()) {
                pathToAttach = new File(pathToAttach.getPath() + ".enc");
            }
            if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(this.cell.getMessageObject().currentAccount).getPathToMessage(this.cell.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                pathToAttach = new File(pathToAttach.getPath() + ".enc");
            }
            if ((pathToAttach == null || !pathToAttach.exists()) && this.cell.getMessageObject().messageOwner.attachPath != null) {
                pathToAttach = new File(this.cell.getMessageObject().messageOwner.attachPath);
            }
            if (pathToAttach == null || !pathToAttach.exists()) {
                return;
            }
            VideoPlayer videoPlayer2 = new VideoPlayer();
            this.player = videoPlayer2;
            videoPlayer2.setDelegate(new AnonymousClass5());
            if (this.audioVisualizerDrawable != null) {
                this.player.setAudioVisualizerDelegate(new VideoPlayer.AudioVisualizerDelegate() {
                    @Override
                    public void onVisualizerUpdate(boolean z, boolean z2, float[] fArr) {
                        SecretVoicePlayer.this.audioVisualizerDrawable.setWaveform(z, z2, fArr);
                    }

                    @Override
                    public boolean needUpdate() {
                        return SecretVoicePlayer.this.audioVisualizerDrawable.getParentView() != null;
                    }
                });
            }
            if (this.isRound) {
                this.player.setTextureView(this.textureView);
            }
            this.player.preparePlayer(Uri.fromFile(pathToAttach), "other");
            this.player.play();
            EarListener earListener = this.earListener;
            if (earListener != null) {
                earListener.attachPlayer(this.player);
            }
        }
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            this.containerView.removeView(hintView2);
            this.hintView = null;
        }
        MessageObject messageObject3 = this.messageObject;
        boolean z = messageObject3 != null && messageObject3.isOutOwner();
        MessageObject messageObject4 = this.messageObject;
        if (messageObject4 != null && messageObject4.getDialogId() != UserConfig.getInstance(this.messageObject.currentAccount).getClientUserId()) {
            HintView2 hintView3 = new HintView2(this.context, 3);
            this.hintView = hintView3;
            hintView3.setMultilineText(true);
            if (z) {
                long dialogId = this.messageObject.getDialogId();
                if (dialogId > 0) {
                    TLRPC.User user = MessagesController.getInstance(this.messageObject.currentAccount).getUser(Long.valueOf(dialogId));
                    if (user != null) {
                        firstName = UserObject.getFirstName(user);
                    } else {
                        firstName = "";
                    }
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
                    if (chat != null) {
                        firstName = chat.title;
                    } else {
                        firstName = "";
                    }
                }
                this.hintView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(this.isRound ? R.string.VideoOnceOutHint : R.string.VoiceOnceOutHint, firstName)));
            } else {
                this.hintView.setText(AndroidUtilities.replaceTags(LocaleController.getString(this.isRound ? R.string.VideoOnceHint : R.string.VoiceOnceHint)));
            }
            this.hintView.setRounding(12.0f);
            this.hintView.setPadding(AndroidUtilities.dp((z || this.cell.pinnedBottom) ? 0.0f : 6.0f), 0, 0, 0);
            if (this.isRound) {
                this.hintView.setJointPx(0.5f, 0.0f);
                this.hintView.setTextAlign(Layout.Alignment.ALIGN_CENTER);
            } else {
                this.hintView.setJointPx(0.0f, AndroidUtilities.dp(34.0f));
                this.hintView.setTextAlign(Layout.Alignment.ALIGN_NORMAL);
            }
            this.hintView.setTextSize(14.0f);
            HintView2 hintView4 = this.hintView;
            hintView4.setMaxWidthPx(HintView2.cutInFancyHalf(hintView4.getText(), this.hintView.getTextPaint()));
            if (this.isRound) {
                this.containerView.addView(this.hintView, LayoutHelper.createFrame((int) ((this.cell.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((this.cell.getHeight() + this.heightdiff) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
            } else {
                this.containerView.addView(this.hintView, LayoutHelper.createFrame((int) ((this.cell.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((this.cell.getWidth() * (-0.39999998f)) / 2.0f) + this.cell.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((this.cell.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
            }
            this.hintView.show();
        }
        TextView textView = this.closeButton;
        if (textView != null) {
            this.containerView.removeView(textView);
            this.closeButton = null;
        }
        TextView textView2 = new TextView(this.context);
        this.closeButton = textView2;
        textView2.setTextColor(-1);
        this.closeButton.setTypeface(AndroidUtilities.bold());
        if (Theme.isCurrentThemeDark()) {
            this.closeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(64, 553648127, 872415231));
        } else {
            this.closeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(64, 771751936, 1140850688));
        }
        this.closeButton.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
        ScaleStateListAnimator.apply(this.closeButton);
        this.closeButton.setText(LocaleController.getString(z ? R.string.VoiceOnceClose : R.string.VoiceOnceDeleteClose));
        this.closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.dismiss();
            }
        });
        this.containerView.addView(this.closeButton, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
        if (z || (chatMessageCell2 = this.myCell) == null || chatMessageCell2.getMessageObject() == null || this.myCell.getMessageObject().messageOwner == null) {
            return;
        }
        this.myCell.getMessageObject().messageOwner.media_unread = false;
        this.myCell.invalidate();
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
            return VideoPlayer.VideoPlayerDelegate.CC.$default$onSurfaceDestroyed(this, surfaceTexture);
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSurfaceTextureUpdated(this, surfaceTexture);
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
                    SecretVoicePlayer.AnonymousClass5.m4007$r8$lambda$pqKvCZgsToISh77meG8KWXRdc(this.f$0);
                }
            });
        }

        public static void m4007$r8$lambda$pqKvCZgsToISh77meG8KWXRdc(AnonymousClass5 anonymousClass5) {
            SecretVoicePlayer.this.renderedFirstFrame = true;
            SecretVoicePlayer.this.myCell.invalidate();
        }
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
        VideoPlayer videoPlayer = this.player;
        if (videoPlayer == null) {
            return;
        }
        this.progress = videoPlayer.getCurrentPosition() / this.player.getDuration();
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
                    SecretVoicePlayer.$r8$lambda$ztEMBOpEXkVr11YSJszXsUcWo8E(this.f$0, alertDialog2, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog2, int i) {
                    SecretVoicePlayer.m4004$r8$lambda$l1puDsHIvlT0hcExnAVKlRXVic(this.f$0, alertDialog2, i);
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

    public static void $r8$lambda$ztEMBOpEXkVr11YSJszXsUcWo8E(SecretVoicePlayer secretVoicePlayer, AlertDialog alertDialog, int i) {
        AlertDialog alertDialog2 = secretVoicePlayer.backDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
    }

    public static void m4004$r8$lambda$l1puDsHIvlT0hcExnAVKlRXVic(SecretVoicePlayer secretVoicePlayer, AlertDialog alertDialog, int i) {
        AlertDialog alertDialog2 = secretVoicePlayer.backDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
            secretVoicePlayer.backDialog = null;
        }
        secretVoicePlayer.dismiss();
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
                SecretVoicePlayer.m4000$r8$lambda$GrEIy_oOLoY8yBhY2AG0Np6xpI(this.f$0);
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
                    super/*android.app.Dialog*/.dismiss();
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

    public static void m4000$r8$lambda$GrEIy_oOLoY8yBhY2AG0Np6xpI(final SecretVoicePlayer secretVoicePlayer) {
        if (secretVoicePlayer.thanosEffect == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    super/*android.app.Dialog*/.dismiss();
                }
            });
            ChatMessageCell chatMessageCell = secretVoicePlayer.cell;
            if (chatMessageCell != null) {
                chatMessageCell.setVisibility(0);
                secretVoicePlayer.cell.invalidate();
            }
        }
        MediaController.getInstance().tryResumePausedAudio();
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
                SecretVoicePlayer.$r8$lambda$gNtiSWXegUFfj1GneDKy3QcECoc(this.f$0, z, valueAnimator3);
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
                SecretVoicePlayer.m4005$r8$lambda$qNEYvQh4pCHZyDIEAhrI7UsV8o(this.f$0, valueAnimator4);
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

    public static void $r8$lambda$gNtiSWXegUFfj1GneDKy3QcECoc(SecretVoicePlayer secretVoicePlayer, boolean z, ValueAnimator valueAnimator) {
        ChatMessageCell chatMessageCell;
        secretVoicePlayer.getClass();
        secretVoicePlayer.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        secretVoicePlayer.windowView.invalidate();
        secretVoicePlayer.containerView.invalidate();
        if (secretVoicePlayer.isRound) {
            secretVoicePlayer.myCell.invalidate();
        }
        secretVoicePlayer.updateTranslation();
        TextView textView = secretVoicePlayer.closeButton;
        if (textView != null) {
            textView.setAlpha(secretVoicePlayer.openProgress);
        }
        if (secretVoicePlayer.isRound || (chatMessageCell = secretVoicePlayer.myCell) == null || chatMessageCell.getSeekBarWaveform() == null) {
            return;
        }
        secretVoicePlayer.myCell.getSeekBarWaveform().setExplosionRate((z ? CubicBezierInterpolator.EASE_OUT : CubicBezierInterpolator.EASE_IN).getInterpolation(Utilities.clamp(secretVoicePlayer.openProgress * 1.25f, 1.0f, 0.0f)));
    }

    public static void m4005$r8$lambda$qNEYvQh4pCHZyDIEAhrI7UsV8o(SecretVoicePlayer secretVoicePlayer, ValueAnimator valueAnimator) {
        secretVoicePlayer.getClass();
        secretVoicePlayer.openProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (secretVoicePlayer.isRound) {
            secretVoicePlayer.myCell.invalidate();
        }
    }
}
