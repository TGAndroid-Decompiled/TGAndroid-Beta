package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
public class PipRoundVideoView implements NotificationCenter.NotificationCenterDelegate {
    @SuppressLint({"StaticFieldLeak"})
    private static PipRoundVideoView instance;
    private AspectRatioFrameLayout aspectRatioFrameLayout;
    private Bitmap bitmap;
    private int currentAccount;
    private DecelerateInterpolator decelerateInterpolator;
    private AnimatorSet hideShowAnimation;
    private ImageView imageView;
    private Runnable onCloseRunnable;
    private Activity parentActivity;
    private SharedPreferences preferences;
    private RectF rect = new RectF();
    private TextureView textureView;
    private int videoHeight;
    private int videoWidth;
    private WindowManager.LayoutParams windowLayoutParams;
    private WindowManager windowManager;
    private FrameLayout windowView;

    public class PipFrameLayout extends FrameLayout {
        public PipFrameLayout(Context context) {
            super(context);
        }
    }

    public void show(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        instance = this;
        this.onCloseRunnable = runnable;
        PipFrameLayout pipFrameLayout = new PipFrameLayout(activity) {
            private boolean dragging;
            private boolean startDragging;
            private float startX;
            private float startY;

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    this.startX = motionEvent.getRawX();
                    this.startY = motionEvent.getRawY();
                    this.startDragging = true;
                }
                return true;
            }

            @Override
            public void requestDisallowInterceptTouchEvent(boolean z) {
                super.requestDisallowInterceptTouchEvent(z);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                MessageObject playingMessageObject;
                if (this.startDragging || this.dragging) {
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    if (motionEvent.getAction() == 2) {
                        float f = rawX - this.startX;
                        float f2 = rawY - this.startY;
                        if (this.startDragging) {
                            if (Math.abs(f) >= AndroidUtilities.getPixelsInCM(0.3f, true) || Math.abs(f2) >= AndroidUtilities.getPixelsInCM(0.3f, false)) {
                                this.dragging = true;
                                this.startDragging = false;
                            }
                        } else if (this.dragging) {
                            WindowManager.LayoutParams layoutParams = PipRoundVideoView.this.windowLayoutParams;
                            layoutParams.x = (int) (layoutParams.x + f);
                            WindowManager.LayoutParams layoutParams2 = PipRoundVideoView.this.windowLayoutParams;
                            layoutParams2.y = (int) (layoutParams2.y + f2);
                            int i = PipRoundVideoView.this.videoWidth / 2;
                            int i2 = -i;
                            if (PipRoundVideoView.this.windowLayoutParams.x < i2) {
                                PipRoundVideoView.this.windowLayoutParams.x = i2;
                            } else if (PipRoundVideoView.this.windowLayoutParams.x > (AndroidUtilities.displaySize.x - PipRoundVideoView.this.windowLayoutParams.width) + i) {
                                PipRoundVideoView.this.windowLayoutParams.x = (AndroidUtilities.displaySize.x - PipRoundVideoView.this.windowLayoutParams.width) + i;
                            }
                            float f3 = 1.0f;
                            if (PipRoundVideoView.this.windowLayoutParams.x < 0) {
                                f3 = 1.0f + ((PipRoundVideoView.this.windowLayoutParams.x / i) * 0.5f);
                            } else if (PipRoundVideoView.this.windowLayoutParams.x > AndroidUtilities.displaySize.x - PipRoundVideoView.this.windowLayoutParams.width) {
                                f3 = 1.0f - ((((PipRoundVideoView.this.windowLayoutParams.x - AndroidUtilities.displaySize.x) + PipRoundVideoView.this.windowLayoutParams.width) / i) * 0.5f);
                            }
                            if (PipRoundVideoView.this.windowView.getAlpha() != f3) {
                                PipRoundVideoView.this.windowView.setAlpha(f3);
                            }
                            if (PipRoundVideoView.this.windowLayoutParams.y < 0) {
                                PipRoundVideoView.this.windowLayoutParams.y = 0;
                            } else if (PipRoundVideoView.this.windowLayoutParams.y > (AndroidUtilities.displaySize.y - PipRoundVideoView.this.windowLayoutParams.height) + 0) {
                                PipRoundVideoView.this.windowLayoutParams.y = (AndroidUtilities.displaySize.y - PipRoundVideoView.this.windowLayoutParams.height) + 0;
                            }
                            PipRoundVideoView.this.windowManager.updateViewLayout(PipRoundVideoView.this.windowView, PipRoundVideoView.this.windowLayoutParams);
                            this.startX = rawX;
                            this.startY = rawY;
                        }
                    } else if (motionEvent.getAction() == 1) {
                        if (this.startDragging && !this.dragging && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(playingMessageObject);
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(playingMessageObject);
                            }
                        }
                        this.dragging = false;
                        this.startDragging = false;
                        PipRoundVideoView.this.animateToBoundsMaybe();
                    }
                    return true;
                }
                return false;
            }

            @Override
            protected void onDraw(Canvas canvas) {
                Drawable drawable = Theme.chat_roundVideoShadow;
                if (drawable != null) {
                    drawable.setAlpha((int) (getAlpha() * 255.0f));
                    Theme.chat_roundVideoShadow.setBounds(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(125.0f), AndroidUtilities.dp(125.0f));
                    Theme.chat_roundVideoShadow.draw(canvas);
                    Theme.chat_docBackPaint.setColor(Theme.getColor(Theme.key_chat_inBubble));
                    Theme.chat_docBackPaint.setAlpha((int) (getAlpha() * 255.0f));
                    canvas.drawCircle(AndroidUtilities.dp(63.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(59.5f), Theme.chat_docBackPaint);
                }
            }
        };
        this.windowView = pipFrameLayout;
        pipFrameLayout.setWillNotDraw(false);
        this.videoWidth = AndroidUtilities.dp(126.0f);
        this.videoHeight = AndroidUtilities.dp(126.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(activity) {
                @Override
                protected boolean drawChild(Canvas canvas, View view, long j) {
                    MessageObject playingMessageObject;
                    boolean drawChild = super.drawChild(canvas, view, j);
                    if (view == PipRoundVideoView.this.textureView && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                        PipRoundVideoView.this.rect.set(AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), getMeasuredWidth() - AndroidUtilities.dpf2(1.5f), getMeasuredHeight() - AndroidUtilities.dpf2(1.5f));
                        canvas.drawArc(PipRoundVideoView.this.rect, -90.0f, playingMessageObject.audioProgress * 360.0f, false, Theme.chat_radialProgressPaint);
                    }
                    return drawChild;
                }
            };
            this.aspectRatioFrameLayout = aspectRatioFrameLayout;
            aspectRatioFrameLayout.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                @TargetApi(21)
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
                }
            });
            this.aspectRatioFrameLayout.setClipToOutline(true);
        } else {
            final Paint paint = new Paint(1);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            AspectRatioFrameLayout aspectRatioFrameLayout2 = new AspectRatioFrameLayout(activity) {
                private Path aspectPath = new Path();

                @Override
                protected void onSizeChanged(int i, int i2, int i3, int i4) {
                    super.onSizeChanged(i, i2, i3, i4);
                    this.aspectPath.reset();
                    float f = i / 2;
                    this.aspectPath.addCircle(f, i2 / 2, f, Path.Direction.CW);
                    this.aspectPath.toggleInverseFillType();
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    super.dispatchDraw(canvas);
                    canvas.drawPath(this.aspectPath, paint);
                }

                @Override
                protected boolean drawChild(Canvas canvas, View view, long j) {
                    boolean z;
                    MessageObject playingMessageObject;
                    try {
                        z = super.drawChild(canvas, view, j);
                    } catch (Throwable unused) {
                        z = false;
                    }
                    if (view == PipRoundVideoView.this.textureView && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                        PipRoundVideoView.this.rect.set(AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), getMeasuredWidth() - AndroidUtilities.dpf2(1.5f), getMeasuredHeight() - AndroidUtilities.dpf2(1.5f));
                        canvas.drawArc(PipRoundVideoView.this.rect, -90.0f, playingMessageObject.audioProgress * 360.0f, false, Theme.chat_radialProgressPaint);
                    }
                    return z;
                }
            };
            this.aspectRatioFrameLayout = aspectRatioFrameLayout2;
            aspectRatioFrameLayout2.setLayerType(2, null);
        }
        this.aspectRatioFrameLayout.setAspectRatio(1.0f, 0);
        this.windowView.addView(this.aspectRatioFrameLayout, LayoutHelper.createFrame(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.windowView.setAlpha(1.0f);
        this.windowView.setScaleX(0.8f);
        this.windowView.setScaleY(0.8f);
        this.textureView = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(120.0f) + AndroidUtilities.dpf2(2.0f)) / AndroidUtilities.dpf2(120.0f);
        this.textureView.setScaleX(dpf2);
        this.textureView.setScaleY(dpf2);
        this.aspectRatioFrameLayout.addView(this.textureView, LayoutHelper.createFrame(-1, -1.0f));
        ImageView imageView = new ImageView(activity);
        this.imageView = imageView;
        this.aspectRatioFrameLayout.addView(imageView, LayoutHelper.createFrame(-1, -1.0f));
        this.imageView.setVisibility(4);
        this.windowManager = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.preferences = sharedPreferences;
        int i = sharedPreferences.getInt("sidex", 1);
        int i2 = this.preferences.getInt("sidey", 0);
        float f = this.preferences.getFloat("px", 0.0f);
        float f2 = this.preferences.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.windowLayoutParams = layoutParams;
            int i3 = this.videoWidth;
            layoutParams.width = i3;
            layoutParams.height = this.videoHeight;
            layoutParams.x = getSideCoord(true, i, f, i3);
            this.windowLayoutParams.y = getSideCoord(false, i2, f2, this.videoHeight);
            WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            this.windowManager.addView(this.windowView, layoutParams2);
            this.parentActivity = activity;
            int i4 = UserConfig.selectedAccount;
            this.currentAccount = i4;
            NotificationCenter.getInstance(i4).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            runShowHideAnimation(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private static int getSideCoord(boolean z, int i, float f, int i2) {
        int i3;
        int round;
        if (z) {
            i3 = AndroidUtilities.displaySize.x;
        } else {
            i3 = AndroidUtilities.displaySize.y - i2;
            i2 = ActionBar.getCurrentActionBarHeight();
        }
        int i4 = i3 - i2;
        if (i == 0) {
            round = AndroidUtilities.dp(10.0f);
        } else if (i == 1) {
            round = i4 - AndroidUtilities.dp(10.0f);
        } else {
            round = Math.round((i4 - AndroidUtilities.dp(20.0f)) * f) + AndroidUtilities.dp(10.0f);
        }
        return !z ? round + ActionBar.getCurrentActionBarHeight() : round;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        AspectRatioFrameLayout aspectRatioFrameLayout;
        if (i != NotificationCenter.messagePlayingProgressDidChanged || (aspectRatioFrameLayout = this.aspectRatioFrameLayout) == null) {
            return;
        }
        aspectRatioFrameLayout.invalidate();
    }

    public TextureView getTextureView() {
        return this.textureView;
    }

    public void close(boolean z) {
        if (z) {
            TextureView textureView = this.textureView;
            if (textureView == null || textureView.getParent() == null) {
                return;
            }
            if (this.textureView.getWidth() > 0 && this.textureView.getHeight() > 0) {
                this.bitmap = Bitmaps.createBitmap(this.textureView.getWidth(), this.textureView.getHeight(), Bitmap.Config.ARGB_8888);
            }
            try {
                this.textureView.getBitmap(this.bitmap);
            } catch (Throwable unused) {
                this.bitmap = null;
            }
            this.imageView.setImageBitmap(this.bitmap);
            try {
                this.aspectRatioFrameLayout.removeView(this.textureView);
            } catch (Exception unused2) {
            }
            this.imageView.setVisibility(0);
            runShowHideAnimation(false);
            return;
        }
        if (this.bitmap != null) {
            this.imageView.setImageDrawable(null);
            this.bitmap.recycle();
            this.bitmap = null;
        }
        try {
            this.windowManager.removeView(this.windowView);
        } catch (Exception unused3) {
        }
        if (instance == this) {
            instance = null;
        }
        this.parentActivity = null;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public void onConfigurationChanged() {
        int i = this.preferences.getInt("sidex", 1);
        int i2 = this.preferences.getInt("sidey", 0);
        float f = this.preferences.getFloat("px", 0.0f);
        float f2 = this.preferences.getFloat("py", 0.0f);
        this.windowLayoutParams.x = getSideCoord(true, i, f, this.videoWidth);
        this.windowLayoutParams.y = getSideCoord(false, i2, f2, this.videoHeight);
        this.windowManager.updateViewLayout(this.windowView, this.windowLayoutParams);
    }

    public void showTemporary(boolean z) {
        AnimatorSet animatorSet = this.hideShowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.hideShowAnimation = animatorSet2;
        Animator[] animatorArr = new Animator[3];
        FrameLayout frameLayout = this.windowView;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        animatorArr[0] = ObjectAnimator.ofFloat(frameLayout, property, fArr);
        FrameLayout frameLayout2 = this.windowView;
        Property property2 = View.SCALE_X;
        float[] fArr2 = new float[1];
        fArr2[0] = z ? 1.0f : 0.8f;
        animatorArr[1] = ObjectAnimator.ofFloat(frameLayout2, property2, fArr2);
        FrameLayout frameLayout3 = this.windowView;
        Property property3 = View.SCALE_Y;
        float[] fArr3 = new float[1];
        fArr3[0] = z ? 1.0f : 0.8f;
        animatorArr[2] = ObjectAnimator.ofFloat(frameLayout3, property3, fArr3);
        animatorSet2.playTogether(animatorArr);
        this.hideShowAnimation.setDuration(150L);
        if (this.decelerateInterpolator == null) {
            this.decelerateInterpolator = new DecelerateInterpolator();
        }
        this.hideShowAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(PipRoundVideoView.this.hideShowAnimation)) {
                    PipRoundVideoView.this.hideShowAnimation = null;
                }
            }
        });
        this.hideShowAnimation.setInterpolator(this.decelerateInterpolator);
        this.hideShowAnimation.start();
    }

    private void runShowHideAnimation(final boolean z) {
        AnimatorSet animatorSet = this.hideShowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.hideShowAnimation = animatorSet2;
        Animator[] animatorArr = new Animator[3];
        FrameLayout frameLayout = this.windowView;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        animatorArr[0] = ObjectAnimator.ofFloat(frameLayout, property, fArr);
        FrameLayout frameLayout2 = this.windowView;
        Property property2 = View.SCALE_X;
        float[] fArr2 = new float[1];
        fArr2[0] = z ? 1.0f : 0.8f;
        animatorArr[1] = ObjectAnimator.ofFloat(frameLayout2, property2, fArr2);
        FrameLayout frameLayout3 = this.windowView;
        Property property3 = View.SCALE_Y;
        float[] fArr3 = new float[1];
        fArr3[0] = z ? 1.0f : 0.8f;
        animatorArr[2] = ObjectAnimator.ofFloat(frameLayout3, property3, fArr3);
        animatorSet2.playTogether(animatorArr);
        this.hideShowAnimation.setDuration(150L);
        if (this.decelerateInterpolator == null) {
            this.decelerateInterpolator = new DecelerateInterpolator();
        }
        this.hideShowAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(PipRoundVideoView.this.hideShowAnimation)) {
                    if (!z) {
                        PipRoundVideoView.this.close(false);
                    }
                    PipRoundVideoView.this.hideShowAnimation = null;
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (animator.equals(PipRoundVideoView.this.hideShowAnimation)) {
                    PipRoundVideoView.this.hideShowAnimation = null;
                }
            }
        });
        this.hideShowAnimation.setInterpolator(this.decelerateInterpolator);
        this.hideShowAnimation.start();
    }

    public void animateToBoundsMaybe() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.PipRoundVideoView.animateToBoundsMaybe():void");
    }

    @Keep
    public int getX() {
        return this.windowLayoutParams.x;
    }

    @Keep
    public int getY() {
        return this.windowLayoutParams.y;
    }

    @Keep
    public void setX(int i) {
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        layoutParams.x = i;
        try {
            this.windowManager.updateViewLayout(this.windowView, layoutParams);
        } catch (Exception unused) {
        }
    }

    @Keep
    public void setY(int i) {
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        layoutParams.y = i;
        try {
            this.windowManager.updateViewLayout(this.windowView, layoutParams);
        } catch (Exception unused) {
        }
    }

    public static PipRoundVideoView getInstance() {
        return instance;
    }
}
