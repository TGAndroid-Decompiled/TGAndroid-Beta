package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.LinkEditActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.iv.RichEditor;

public final class PipRoundVideoView implements NotificationCenter.NotificationCenterDelegate {
    public static PipRoundVideoView instance;
    public WebPlayerView.AnonymousClass4 aspectRatioFrameLayout;
    public Bitmap bitmap;
    public int currentAccount;
    public DecelerateInterpolator decelerateInterpolator;
    public AnimatorSet hideShowAnimation;
    public ImageView imageView;
    public Runnable onCloseRunnable;
    public SharedPreferences preferences;
    public final RectF rect = new RectF();
    public TextureView textureView;
    public int videoHeight;
    public int videoWidth;
    public WindowManager.LayoutParams windowLayoutParams;
    public WindowManager windowManager;
    public AnonymousClass1 windowView;

    public final class AnonymousClass5 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final PipRoundVideoView this$0;

        public AnonymousClass5(PipRoundVideoView pipRoundVideoView, int i) {
            this.$r8$classId = i;
            this.this$0 = pipRoundVideoView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    PipRoundVideoView pipRoundVideoView = this.this$0;
                    if (animator.equals(pipRoundVideoView.hideShowAnimation)) {
                        pipRoundVideoView.hideShowAnimation = null;
                    }
                    break;
                default:
                    PipRoundVideoView pipRoundVideoView2 = this.this$0;
                    pipRoundVideoView2.close(false);
                    Runnable runnable = pipRoundVideoView2.onCloseRunnable;
                    if (runnable != null) {
                        runnable.run();
                    }
                    break;
            }
        }
    }

    public static int getSideCoord(boolean z, int i, float f, int i2) {
        int i3;
        int iDp;
        if (z) {
            i3 = AndroidUtilities.displaySize.x;
        } else {
            i3 = AndroidUtilities.displaySize.y - i2;
            i2 = ActionBar.getCurrentActionBarHeight();
        }
        int i4 = i3 - i2;
        if (i == 0) {
            iDp = AndroidUtilities.dp(10.0f);
        } else {
            iDp = i == 1 ? i4 - AndroidUtilities.dp(10.0f) : Math.round((i4 - AndroidUtilities.dp(20.0f)) * f) + AndroidUtilities.dp(10.0f);
        }
        return !z ? ActionBar.getCurrentActionBarHeight() + iDp : iDp;
    }

    public final void close(boolean z) {
        if (!z) {
            if (this.bitmap != null) {
                this.imageView.setImageDrawable(null);
                this.bitmap.recycle();
                this.bitmap = null;
            }
            try {
                this.windowManager.removeView(this.windowView);
            } catch (Exception unused) {
            }
            if (instance == this) {
                instance = null;
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            return;
        }
        TextureView textureView = this.textureView;
        if (textureView == null || textureView.getParent() == null) {
            return;
        }
        if (this.textureView.getWidth() > 0 && this.textureView.getHeight() > 0) {
            this.bitmap = Bitmaps.createBitmap(this.textureView.getWidth(), this.textureView.getHeight(), Bitmap.Config.ARGB_8888);
        }
        try {
            this.textureView.getBitmap(this.bitmap);
        } catch (Throwable unused2) {
            this.bitmap = null;
        }
        this.imageView.setImageBitmap(this.bitmap);
        try {
            this.aspectRatioFrameLayout.removeView(this.textureView);
        } catch (Exception unused3) {
        }
        this.imageView.setVisibility(0);
        runShowHideAnimation(false);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        WebPlayerView.AnonymousClass4 anonymousClass4;
        if (i != NotificationCenter.messagePlayingProgressDidChanged || (anonymousClass4 = this.aspectRatioFrameLayout) == null) {
            return;
        }
        anonymousClass4.invalidate();
    }

    public final void runShowHideAnimation(boolean z) {
        int i = 3;
        AnimatorSet animatorSet = this.hideShowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.hideShowAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.windowView, (Property<AnonymousClass1, Float>) View.ALPHA, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.windowView, (Property<AnonymousClass1, Float>) View.SCALE_X, z ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.windowView, (Property<AnonymousClass1, Float>) View.SCALE_Y, z ? 1.0f : 0.8f));
        this.hideShowAnimation.setDuration(150L);
        if (this.decelerateInterpolator == null) {
            this.decelerateInterpolator = new DecelerateInterpolator();
        }
        this.hideShowAnimation.addListener(new LoginActivity.AnonymousClass9(i, this, z));
        this.hideShowAnimation.setInterpolator(this.decelerateInterpolator);
        this.hideShowAnimation.start();
    }

    public final void show(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        instance = this;
        this.onCloseRunnable = runnable;
        ?? r13 = new FrameLayout(activity) {
            public boolean dragging;
            public boolean startDragging;
            public float startX;
            public float startY;

            @Override
            public final void onDraw(Canvas canvas) {
                LinkEditActivity.AnonymousClass2 anonymousClass2 = Theme.chat_roundVideoShadow;
                if (anonymousClass2 != null) {
                    anonymousClass2.p.setAlpha((int) (getAlpha() * 255.0f));
                    Theme.chat_roundVideoShadow.setBounds(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(125.0f), AndroidUtilities.dp(125.0f));
                    Theme.chat_roundVideoShadow.draw(canvas);
                    Theme.chat_docBackPaint.setColor(Theme.getColor(null, Theme.key_chat_inBubble, false));
                    Theme.chat_docBackPaint.setAlpha((int) (getAlpha() * 255.0f));
                    canvas.drawCircle(AndroidUtilities.dp(63.0f), AndroidUtilities.dp(63.0f), AndroidUtilities.dp(59.5f), Theme.chat_docBackPaint);
                }
            }

            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    this.startX = motionEvent.getRawX();
                    this.startY = motionEvent.getRawY();
                    this.startDragging = true;
                }
                return true;
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                float f;
                boolean z;
                ArrayList arrayList;
                AnimatorSet animatorSet;
                boolean z2;
                char c;
                MessageObject playingMessageObject;
                if (!this.startDragging && !this.dragging) {
                    return false;
                }
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                int action = motionEvent.getAction();
                float fM = 1.0f;
                PipRoundVideoView pipRoundVideoView = PipRoundVideoView.this;
                if (action == 2) {
                    float f2 = rawX - this.startX;
                    float f3 = rawY - this.startY;
                    if (this.startDragging) {
                        if (Math.abs(f2) >= AndroidUtilities.getPixelsInCM(0.3f, true) || Math.abs(f3) >= AndroidUtilities.getPixelsInCM(0.3f, false)) {
                            this.dragging = true;
                            this.startDragging = false;
                            return true;
                        }
                    } else if (this.dragging) {
                        WindowManager.LayoutParams layoutParams = pipRoundVideoView.windowLayoutParams;
                        int i = (int) (layoutParams.x + f2);
                        layoutParams.x = i;
                        layoutParams.y = (int) (layoutParams.y + f3);
                        int i2 = pipRoundVideoView.videoWidth / 2;
                        int i3 = -i2;
                        if (i < i3) {
                            layoutParams.x = i3;
                        } else {
                            int i4 = (AndroidUtilities.displaySize.x - layoutParams.width) + i2;
                            if (i > i4) {
                                layoutParams.x = i4;
                            }
                        }
                        int i5 = layoutParams.x;
                        if (i5 < 0) {
                            fM = zzjd.m(i5, i2, 0.5f, 1.0f);
                        } else {
                            int i6 = AndroidUtilities.displaySize.x;
                            int i7 = layoutParams.width;
                            if (i5 > i6 - i7) {
                                fM = TextureRenderer$$ExternalSyntheticOutline0.m((i5 - i6) + i7, i2, 0.5f, 1.0f);
                            }
                        }
                        if (pipRoundVideoView.windowView.getAlpha() != fM) {
                            pipRoundVideoView.windowView.setAlpha(fM);
                        }
                        WindowManager.LayoutParams layoutParams2 = pipRoundVideoView.windowLayoutParams;
                        int i8 = layoutParams2.y;
                        if (i8 < 0) {
                            layoutParams2.y = 0;
                        } else {
                            int i9 = AndroidUtilities.displaySize.y - layoutParams2.height;
                            if (i8 > i9) {
                                layoutParams2.y = i9;
                            }
                        }
                        pipRoundVideoView.windowManager.updateViewLayout(pipRoundVideoView.windowView, layoutParams2);
                        this.startX = rawX;
                        this.startY = rawY;
                        return true;
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
                    int sideCoord = PipRoundVideoView.getSideCoord(true, 0, 0.0f, pipRoundVideoView.videoWidth);
                    int sideCoord2 = PipRoundVideoView.getSideCoord(true, 1, 0.0f, pipRoundVideoView.videoWidth);
                    int sideCoord3 = PipRoundVideoView.getSideCoord(false, 0, 0.0f, pipRoundVideoView.videoHeight);
                    int sideCoord4 = PipRoundVideoView.getSideCoord(false, 1, 0.0f, pipRoundVideoView.videoHeight);
                    SharedPreferences.Editor editorEdit = pipRoundVideoView.preferences.edit();
                    int iDp = AndroidUtilities.dp(20.0f);
                    int iAbs = Math.abs(sideCoord - pipRoundVideoView.windowLayoutParams.x);
                    Property property = View.ALPHA;
                    if (iAbs > iDp) {
                        int i10 = pipRoundVideoView.windowLayoutParams.x;
                        f = 1.0f;
                        if (i10 >= 0 || i10 <= (-pipRoundVideoView.videoWidth) / 4) {
                            if (Math.abs(sideCoord2 - i10) > iDp) {
                                int i11 = pipRoundVideoView.windowLayoutParams.x;
                                int i12 = AndroidUtilities.displaySize.x;
                                c = 0;
                                int i13 = pipRoundVideoView.videoWidth;
                                if (i11 <= i12 - i13 || i11 >= i12 - ((i13 / 4) * 3)) {
                                    if (pipRoundVideoView.windowView.getAlpha() != 1.0f) {
                                        arrayList = new ArrayList();
                                        if (pipRoundVideoView.windowLayoutParams.x < 0) {
                                            arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", -pipRoundVideoView.videoWidth));
                                        } else {
                                            arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", AndroidUtilities.displaySize.x));
                                        }
                                        z = true;
                                    } else {
                                        editorEdit.putFloat("px", (pipRoundVideoView.windowLayoutParams.x - sideCoord) / (sideCoord2 - sideCoord));
                                        editorEdit.putInt("sidex", 2);
                                        arrayList = null;
                                    }
                                    if (!z) {
                                        if (Math.abs(sideCoord3 - pipRoundVideoView.windowLayoutParams.y) > iDp || pipRoundVideoView.windowLayoutParams.y <= ActionBar.getCurrentActionBarHeight()) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            editorEdit.putInt("sidey", 0);
                                            arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", sideCoord3));
                                        } else if (Math.abs(sideCoord4 - pipRoundVideoView.windowLayoutParams.y) <= iDp) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            editorEdit.putInt("sidey", 1);
                                            arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", sideCoord4));
                                        } else {
                                            editorEdit.putFloat("py", (pipRoundVideoView.windowLayoutParams.y - sideCoord3) / (sideCoord4 - sideCoord3));
                                            editorEdit.putInt("sidey", 2);
                                        }
                                        editorEdit.commit();
                                    }
                                    if (arrayList != null) {
                                        if (pipRoundVideoView.decelerateInterpolator == null) {
                                            pipRoundVideoView.decelerateInterpolator = new DecelerateInterpolator();
                                        }
                                        animatorSet = new AnimatorSet();
                                        animatorSet.setInterpolator(pipRoundVideoView.decelerateInterpolator);
                                        animatorSet.setDuration(150L);
                                        if (z) {
                                            z2 = true;
                                            arrayList.add(ObjectAnimator.ofFloat(pipRoundVideoView.windowView, (Property<AnonymousClass1, Float>) property, 0.0f));
                                            animatorSet.addListener(new AnonymousClass5(pipRoundVideoView, 1 == true ? 1 : 0));
                                        } else {
                                            z2 = true;
                                        }
                                        animatorSet.playTogether(arrayList);
                                        animatorSet.start();
                                        return z2;
                                    }
                                }
                            } else {
                                c = 0;
                            }
                            arrayList = new ArrayList();
                            editorEdit.putInt("sidex", 1);
                            if (pipRoundVideoView.windowView.getAlpha() != 1.0f) {
                                AnonymousClass1 anonymousClass1 = pipRoundVideoView.windowView;
                                float[] fArr = new float[1];
                                fArr[c] = 1.0f;
                                arrayList.add(ObjectAnimator.ofFloat(anonymousClass1, (Property<AnonymousClass1, Float>) property, fArr));
                            }
                            arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", sideCoord2));
                        }
                        z = false;
                        if (!z) {
                            if (Math.abs(sideCoord3 - pipRoundVideoView.windowLayoutParams.y) > iDp) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                editorEdit.putInt("sidey", 0);
                                arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", sideCoord3));
                            } else {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                editorEdit.putInt("sidey", 0);
                                arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", sideCoord3));
                            }
                            editorEdit.commit();
                        }
                        if (arrayList != null) {
                            if (pipRoundVideoView.decelerateInterpolator == null) {
                                pipRoundVideoView.decelerateInterpolator = new DecelerateInterpolator();
                            }
                            animatorSet = new AnimatorSet();
                            animatorSet.setInterpolator(pipRoundVideoView.decelerateInterpolator);
                            animatorSet.setDuration(150L);
                            if (z) {
                                z2 = true;
                                arrayList.add(ObjectAnimator.ofFloat(pipRoundVideoView.windowView, (Property<AnonymousClass1, Float>) property, 0.0f));
                                animatorSet.addListener(new AnonymousClass5(pipRoundVideoView, 1 == true ? 1 : 0));
                            } else {
                                z2 = true;
                            }
                            animatorSet.playTogether(arrayList);
                            animatorSet.start();
                            return z2;
                        }
                    } else {
                        f = 1.0f;
                    }
                    arrayList = new ArrayList();
                    editorEdit.putInt("sidex", 0);
                    if (pipRoundVideoView.windowView.getAlpha() != f) {
                        arrayList.add(ObjectAnimator.ofFloat(pipRoundVideoView.windowView, (Property<AnonymousClass1, Float>) property, f));
                    }
                    arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "x", sideCoord));
                    z = false;
                    if (!z) {
                        if (Math.abs(sideCoord3 - pipRoundVideoView.windowLayoutParams.y) > iDp) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            editorEdit.putInt("sidey", 0);
                            arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", sideCoord3));
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            editorEdit.putInt("sidey", 0);
                            arrayList.add(ObjectAnimator.ofInt(pipRoundVideoView, "y", sideCoord3));
                        }
                        editorEdit.commit();
                    }
                    if (arrayList != null) {
                        if (pipRoundVideoView.decelerateInterpolator == null) {
                            pipRoundVideoView.decelerateInterpolator = new DecelerateInterpolator();
                        }
                        animatorSet = new AnimatorSet();
                        animatorSet.setInterpolator(pipRoundVideoView.decelerateInterpolator);
                        animatorSet.setDuration(150L);
                        if (z) {
                            z2 = true;
                            arrayList.add(ObjectAnimator.ofFloat(pipRoundVideoView.windowView, (Property<AnonymousClass1, Float>) property, 0.0f));
                            animatorSet.addListener(new AnonymousClass5(pipRoundVideoView, 1 == true ? 1 : 0));
                        } else {
                            z2 = true;
                        }
                        animatorSet.playTogether(arrayList);
                        animatorSet.start();
                        return z2;
                    }
                }
                return true;
            }
        };
        this.windowView = r13;
        r13.setWillNotDraw(false);
        this.videoWidth = AndroidUtilities.dp(126.0f);
        this.videoHeight = AndroidUtilities.dp(126.0f);
        WebPlayerView.AnonymousClass4 anonymousClass4 = new WebPlayerView.AnonymousClass4(this, activity, 1);
        this.aspectRatioFrameLayout = anonymousClass4;
        anonymousClass4.setOutlineProvider(new RichEditor.AnonymousClass5(8));
        this.aspectRatioFrameLayout.setClipToOutline(true);
        this.aspectRatioFrameLayout.setAspectRatio(1.0f, 0);
        addView(this.aspectRatioFrameLayout, LayoutHelper.createFrame(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        setAlpha(1.0f);
        setScaleX(0.8f);
        setScaleY(0.8f);
        this.textureView = new TextureView(activity);
        float fDpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.textureView.setScaleX(fDpf2);
        this.textureView.setScaleY(fDpf2);
        this.aspectRatioFrameLayout.addView(this.textureView, LayoutHelper.createFrame(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.imageView = imageView;
        this.aspectRatioFrameLayout.addView(imageView, LayoutHelper.createFrame(-1.0f, -1));
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
            int i4 = UserConfig.selectedAccount;
            this.currentAccount = i4;
            NotificationCenter.getInstance(i4).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            runShowHideAnimation(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void showTemporary(boolean z) {
        int i = 0;
        AnimatorSet animatorSet = this.hideShowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.hideShowAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.windowView, (Property<AnonymousClass1, Float>) View.ALPHA, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.windowView, (Property<AnonymousClass1, Float>) View.SCALE_X, z ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.windowView, (Property<AnonymousClass1, Float>) View.SCALE_Y, z ? 1.0f : 0.8f));
        this.hideShowAnimation.setDuration(150L);
        if (this.decelerateInterpolator == null) {
            this.decelerateInterpolator = new DecelerateInterpolator();
        }
        this.hideShowAnimation.addListener(new AnonymousClass5(this, i));
        this.hideShowAnimation.setInterpolator(this.decelerateInterpolator);
        this.hideShowAnimation.start();
    }
}
