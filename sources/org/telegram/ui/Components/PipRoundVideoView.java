package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import java.util.ArrayList;
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
                if (!this.startDragging && !this.dragging) {
                    return false;
                }
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
                        } else if (PipRoundVideoView.this.windowLayoutParams.y > AndroidUtilities.displaySize.y - PipRoundVideoView.this.windowLayoutParams.height) {
                            PipRoundVideoView.this.windowLayoutParams.y = AndroidUtilities.displaySize.y - PipRoundVideoView.this.windowLayoutParams.height;
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
                            MediaController.getInstance().pauseMessage(playingMessageObject);
                        }
                    }
                    this.dragging = false;
                    this.startDragging = false;
                    PipRoundVideoView.this.animateToBoundsMaybe();
                }
                return true;
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
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(activity) {
            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                MessageObject playingMessageObject;
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if (view == PipRoundVideoView.this.textureView && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                    PipRoundVideoView.this.rect.set(AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), getMeasuredWidth() - AndroidUtilities.dpf2(1.5f), getMeasuredHeight() - AndroidUtilities.dpf2(1.5f));
                    canvas.drawArc(PipRoundVideoView.this.rect, -90.0f, playingMessageObject.audioProgress * 360.0f, false, Theme.chat_radialProgressPaint);
                }
                return zDrawChild;
            }
        };
        this.aspectRatioFrameLayout = aspectRatioFrameLayout;
        aspectRatioFrameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setOval(0, 0, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
            }
        });
        this.aspectRatioFrameLayout.setClipToOutline(true);
        this.aspectRatioFrameLayout.setAspectRatio(1.0f, 0);
        this.windowView.addView(this.aspectRatioFrameLayout, LayoutHelper.createFrame(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.windowView.setAlpha(1.0f);
        this.windowView.setScaleX(0.8f);
        this.windowView.setScaleY(0.8f);
        this.textureView = new TextureView(activity);
        float fDpf2 = (AndroidUtilities.dpf2(120.0f) + AndroidUtilities.dpf2(2.0f)) / AndroidUtilities.dpf2(120.0f);
        this.textureView.setScaleX(fDpf2);
        this.textureView.setScaleY(fDpf2);
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
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, layoutParams2);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
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
        int iRound;
        if (z) {
            i3 = AndroidUtilities.displaySize.x;
        } else {
            i3 = AndroidUtilities.displaySize.y - i2;
            i2 = ActionBar.getCurrentActionBarHeight();
        }
        int i4 = i3 - i2;
        if (i == 0) {
            iRound = AndroidUtilities.dp(10.0f);
        } else if (i == 1) {
            iRound = i4 - AndroidUtilities.dp(10.0f);
        } else {
            iRound = Math.round((i4 - AndroidUtilities.dp(20.0f)) * f) + AndroidUtilities.dp(10.0f);
        }
        return !z ? iRound + ActionBar.getCurrentActionBarHeight() : iRound;
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.ALPHA, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.SCALE_X, z ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.SCALE_Y, z ? 1.0f : 0.8f));
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.ALPHA, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.SCALE_X, z ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.SCALE_Y, z ? 1.0f : 0.8f));
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
        float f;
        ArrayList arrayList;
        boolean z;
        AnimatorSet animatorSet;
        int i;
        float f2;
        int sideCoord = getSideCoord(true, 0, 0.0f, this.videoWidth);
        int sideCoord2 = getSideCoord(true, 1, 0.0f, this.videoWidth);
        int sideCoord3 = getSideCoord(false, 0, 0.0f, this.videoHeight);
        int sideCoord4 = getSideCoord(false, 1, 0.0f, this.videoHeight);
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        int iDp = AndroidUtilities.dp(20.0f);
        if (Math.abs(sideCoord - this.windowLayoutParams.x) <= iDp || ((i = this.windowLayoutParams.x) < 0 && i > (-this.videoWidth) / 4)) {
            f = 0.0f;
            ArrayList arrayList2 = new ArrayList();
            editorEdit.putInt("sidex", 0);
            if (this.windowView.getAlpha() != 1.0f) {
                arrayList2.add(ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f));
            }
            arrayList2.add(ObjectAnimator.ofInt(this, "x", sideCoord));
            arrayList = arrayList2;
        } else {
            if (Math.abs(sideCoord2 - i) > iDp) {
                int i2 = this.windowLayoutParams.x;
                int i3 = AndroidUtilities.displaySize.x;
                f = 0.0f;
                int i4 = this.videoWidth;
                f2 = 1.0f;
                if (i2 <= i3 - i4 || i2 >= i3 - ((i4 / 4) * 3)) {
                    if (this.windowView.getAlpha() != 1.0f) {
                        arrayList = new ArrayList();
                        if (this.windowLayoutParams.x < 0) {
                            arrayList.add(ObjectAnimator.ofInt(this, "x", -this.videoWidth));
                        } else {
                            arrayList.add(ObjectAnimator.ofInt(this, "x", AndroidUtilities.displaySize.x));
                        }
                        z = true;
                    } else {
                        editorEdit.putFloat("px", (this.windowLayoutParams.x - sideCoord) / (sideCoord2 - sideCoord));
                        editorEdit.putInt("sidex", 2);
                        arrayList = null;
                    }
                    if (!z) {
                        if (Math.abs(sideCoord3 - this.windowLayoutParams.y) > iDp || this.windowLayoutParams.y <= ActionBar.getCurrentActionBarHeight()) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            editorEdit.putInt("sidey", 0);
                            arrayList.add(ObjectAnimator.ofInt(this, "y", sideCoord3));
                        } else if (Math.abs(sideCoord4 - this.windowLayoutParams.y) <= iDp) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            editorEdit.putInt("sidey", 1);
                            arrayList.add(ObjectAnimator.ofInt(this, "y", sideCoord4));
                        } else {
                            editorEdit.putFloat("py", (this.windowLayoutParams.y - sideCoord3) / (sideCoord4 - sideCoord3));
                            editorEdit.putInt("sidey", 2);
                        }
                        editorEdit.commit();
                    }
                    if (arrayList != null) {
                        if (this.decelerateInterpolator == null) {
                            this.decelerateInterpolator = new DecelerateInterpolator();
                        }
                        animatorSet = new AnimatorSet();
                        animatorSet.setInterpolator(this.decelerateInterpolator);
                        animatorSet.setDuration(150L);
                        if (z) {
                            arrayList.add(ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.ALPHA, f));
                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    PipRoundVideoView.this.close(false);
                                    if (PipRoundVideoView.this.onCloseRunnable != null) {
                                        PipRoundVideoView.this.onCloseRunnable.run();
                                    }
                                }
                            });
                        }
                        animatorSet.playTogether(arrayList);
                        animatorSet.start();
                    }
                }
            } else {
                f = 0.0f;
                f2 = 1.0f;
            }
            arrayList = new ArrayList();
            editorEdit.putInt("sidex", 1);
            if (this.windowView.getAlpha() != f2) {
                arrayList.add(ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.ALPHA, f2));
            }
            arrayList.add(ObjectAnimator.ofInt(this, "x", sideCoord2));
        }
        z = false;
        if (!z) {
            if (Math.abs(sideCoord3 - this.windowLayoutParams.y) > iDp) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                editorEdit.putInt("sidey", 0);
                arrayList.add(ObjectAnimator.ofInt(this, "y", sideCoord3));
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                editorEdit.putInt("sidey", 0);
                arrayList.add(ObjectAnimator.ofInt(this, "y", sideCoord3));
            }
            editorEdit.commit();
        }
        if (arrayList != null) {
            if (this.decelerateInterpolator == null) {
                this.decelerateInterpolator = new DecelerateInterpolator();
            }
            animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(this.decelerateInterpolator);
            animatorSet.setDuration(150L);
            if (z) {
                arrayList.add(ObjectAnimator.ofFloat(this.windowView, (Property<FrameLayout, Float>) View.ALPHA, f));
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PipRoundVideoView.this.close(false);
                        if (PipRoundVideoView.this.onCloseRunnable != null) {
                            PipRoundVideoView.this.onCloseRunnable.run();
                        }
                    }
                });
            }
            animatorSet.playTogether(arrayList);
            animatorSet.start();
        }
    }

    public static PipRoundVideoView getInstance() {
        return instance;
    }
}
