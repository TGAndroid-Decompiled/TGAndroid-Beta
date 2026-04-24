package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import androidx.core.graphics.ColorUtils;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.StoryViewer;

public abstract class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    private float actionBarProgress;
    private boolean attached;
    private final View avatarContainer;
    private final ProfileActivity.AvatarImageView avatarImage;
    private float bounceScale;
    private final ArrayList circles;
    private final Paint clipOutAvatar;
    private final Path clipPath;
    private int count;
    private final int currentAccount;
    private float cy;
    private final long dialogId;
    private float expandProgress;
    private float expandRight;
    private boolean expandRightPad;
    private final AnimatedFloat expandRightPadAnimated;
    private float expandY;
    private final Matrix forumRoundRectMatrix;
    private final Path forumRoundRectPath;
    private final PathMeasure forumRoundRectPathMeasure;
    private final Path forumSegmentPath;
    private float fragmentTransitionProgress;
    private final StoriesUtilities.StoryGradientTools gradientTools;
    private final boolean isTopic;
    private StoriesController.UploadingStory lastUploadingStory;
    private float left;
    private final Paint livePaint;
    private StoryCircle mainCircle;
    private ValueAnimator newStoryBounce;
    private float newStoryBounceT;
    private Runnable onLongPressRunnable;
    Paint paint;
    private TL_stories.PeerStories peerStories;
    private boolean progressIsDone;
    private float progressToInsets;
    private final AnimatedFloat progressToUploading;
    private boolean progressWasDrawn;
    private final StoryViewer.PlaceProvider provider;
    private RadialProgress radialProgress;
    private final Paint readPaint;
    private int readPaintAlpha;
    private final RectF rect1;
    private final RectF rect2;
    private final RectF rect3;
    private float right;
    private final AnimatedFloat rightAnimated;
    private final AnimatedFloat segmentsCountAnimated;
    private final AnimatedFloat segmentsUnreadCountAnimated;
    StoriesController storiesController;
    private long tapTime;
    private float tapX;
    private float tapY;
    private final AnimatedTextView.AnimatedTextDrawable titleDrawable;
    private int unreadCount;
    private int uploadingStoriesCount;
    float w;
    private final Paint whitePaint;

    public abstract void lambda$new$4();

    protected abstract void onTap(StoryViewer.PlaceProvider placeProvider);

    public void setProgressToStoriesInsets(float f) {
        if (this.progressToInsets == f) {
            return;
        }
        this.progressToInsets = f;
        invalidate();
    }

    class StoryCircle {
        final RectF borderRect;
        float cachedIndex;
        float cachedRead;
        final RectF cachedRect;
        float cachedScale;
        final AnimatedFloat indexAnimated;
        boolean live;
        final AnimatedFloat readAnimated;
        final AnimatedFloat scaleAnimated;
        int storyId;
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        ImageReceiver imageReceiver = new ImageReceiver();
        int index = 0;
        boolean read = false;
        float scale = 1.0f;

        public StoryCircle(TL_stories.StoryItem storyItem) {
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.readAnimated = new AnimatedFloat(ProfileStoriesView.this, 420L, cubicBezierInterpolator);
            this.indexAnimated = new AnimatedFloat(ProfileStoriesView.this, 420L, cubicBezierInterpolator);
            this.scaleAnimated = new AnimatedFloat(ProfileStoriesView.this, 420L, cubicBezierInterpolator);
            this.cachedRect = new RectF();
            this.borderRect = new RectF();
            this.storyId = storyItem.id;
            this.imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
            this.imageReceiver.setParentView(ProfileStoriesView.this);
            this.live = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
            if (ProfileStoriesView.this.attached) {
                this.imageReceiver.onAttachedToWindow();
            }
            StoriesUtilities.setThumbImage(this.avatarDrawable, this.imageReceiver, storyItem, 25, 25);
        }

        public void destroy() {
            this.imageReceiver.onDetachedFromWindow();
        }

        public void apply() {
            this.readAnimated.set(this.read, true);
            this.indexAnimated.set(this.index, true);
            this.scaleAnimated.set(this.scale, true);
        }
    }

    public ProfileStoriesView(Context context, int i, long j, boolean z, View view, ProfileActivity.AvatarImageView avatarImageView, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        Paint paint = new Paint(1);
        this.readPaint = paint;
        Paint paint2 = new Paint(1);
        this.livePaint = paint2;
        Paint paint3 = new Paint(1);
        this.whitePaint = paint3;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.titleDrawable = animatedTextDrawable;
        Paint paint4 = new Paint(1);
        this.clipOutAvatar = paint4;
        this.circles = new ArrayList();
        this.paint = new Paint(1);
        this.bounceScale = 1.0f;
        this.progressToInsets = 1.0f;
        this.gradientTools = new StoriesUtilities.StoryGradientTools((View) this, false);
        this.rect1 = new RectF();
        this.rect2 = new RectF();
        this.rect3 = new RectF();
        this.clipPath = new Path();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.segmentsCountAnimated = new AnimatedFloat(this, 0L, 480L, cubicBezierInterpolator);
        this.segmentsUnreadCountAnimated = new AnimatedFloat(this, 0L, 240L, cubicBezierInterpolator);
        this.progressToUploading = new AnimatedFloat(this, 0L, 150L, CubicBezierInterpolator.DEFAULT);
        this.newStoryBounceT = 1.0f;
        this.forumRoundRectPath = new Path();
        this.forumRoundRectMatrix = new Matrix();
        this.forumRoundRectPathMeasure = new PathMeasure();
        this.forumSegmentPath = new Path();
        this.expandRightPadAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.rightAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.provider = new AnonymousClass3();
        this.onLongPressRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$4();
            }
        };
        this.currentAccount = i;
        this.dialogId = j;
        this.isTopic = z;
        this.avatarContainer = view;
        this.avatarImage = avatarImageView;
        avatarImageView.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                this.f$0.invalidate();
            }
        });
        this.storiesController = MessagesController.getInstance(i).getStoriesController();
        paint.setColor(1526726655);
        this.readPaintAlpha = paint.getAlpha();
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(Theme.getColor(Theme.key_stories_circle_live1, resourcesProvider));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(18.0f));
        animatedTextDrawable.setAnimationProperties(0.4f, 0L, 320L, cubicBezierInterpolator);
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setTextColor(-1);
        animatedTextDrawable.setEllipsizeByGradient(true);
        animatedTextDrawable.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.paint.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        this.paint.setStyle(style);
        updateStories(false, false);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.titleDrawable || super.verifyDrawable(drawable);
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        this.peerStories = peerStories;
        updateStories(true, false);
    }

    public void update() {
        updateStories(true, true);
    }

    public void updateStories(boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.updateStories(boolean, boolean):void");
    }

    public void setExpandProgress(float f) {
        if (this.expandProgress != f) {
            this.expandProgress = f;
            invalidate();
        }
    }

    public void setActionBarActionMode(float f) {
        if (Theme.isCurrentThemeDark()) {
            return;
        }
        this.actionBarProgress = f;
        invalidate();
    }

    public void vibrateNewStory() {
        if (SharedConfig.getDevicePerformanceClass() <= 0) {
            return;
        }
        AndroidUtilities.vibrateCursor(this);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$vibrateNewStory$0();
            }
        }, 180L);
    }

    public void lambda$vibrateNewStory$0() {
        AndroidUtilities.vibrateCursor(this);
    }

    public void animateNewStory() {
        ValueAnimator valueAnimator = this.newStoryBounce;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = {false};
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.newStoryBounce = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$animateNewStory$1(zArr, valueAnimator2);
            }
        });
        this.newStoryBounce.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                boolean[] zArr2 = zArr;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ProfileStoriesView.this.vibrateNewStory();
                }
                ProfileStoriesView.this.newStoryBounceT = 1.0f;
                ProfileStoriesView.this.invalidate();
            }
        });
        this.newStoryBounce.setInterpolator(new OvershootInterpolator(3.0f));
        this.newStoryBounce.setDuration(400L);
        this.newStoryBounce.setStartDelay(120L);
        this.newStoryBounce.start();
    }

    public void lambda$animateNewStory$1(boolean[] zArr, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!zArr[0] && fFloatValue > 0.2f) {
            zArr[0] = true;
            vibrateNewStory();
        }
        this.newStoryBounceT = Math.max(1.0f, fFloatValue);
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float f;
        Paint paint;
        StoryCircle storyCircle;
        float f2;
        int i;
        float f3;
        boolean z;
        float f4;
        float f5;
        int i2;
        int i3;
        Paint paint2;
        float f6;
        Paint paint3;
        Paint paint4;
        float size;
        StoriesController.UploadingStory uploadingStory;
        float f7 = this.rightAnimated.set(this.right);
        float fClamp = Utilities.clamp((this.avatarContainer.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), fClamp) * this.progressToInsets;
        float x = this.avatarContainer.getX() + (this.avatarContainer.getScaleX() * fLerp);
        float y = this.avatarContainer.getY() + (this.avatarContainer.getScaleY() * fLerp);
        float f8 = fLerp * 2.0f;
        this.rect1.set(x, y, ((this.avatarContainer.getWidth() - f8) * this.avatarContainer.getScaleX()) + x, ((this.avatarContainer.getHeight() - f8) * this.avatarContainer.getScaleY()) + y);
        float fMax = this.left;
        int i4 = 0;
        while (true) {
            if (i4 >= this.circles.size()) {
                break;
            }
            StoryCircle storyCircle2 = (StoryCircle) this.circles.get(i4);
            float f9 = storyCircle2.scaleAnimated.set(storyCircle2.scale);
            storyCircle2.cachedScale = f9;
            if (f9 <= 0.0f && storyCircle2.scale <= 0.0f) {
                storyCircle2.destroy();
                this.circles.remove(i4);
                i4--;
            } else {
                storyCircle2.cachedIndex = storyCircle2.indexAnimated.set(storyCircle2.index);
                storyCircle2.cachedRead = storyCircle2.readAnimated.set(storyCircle2.read);
                if (i4 > 0 && ((StoryCircle) this.circles.get(i4 - 1)).cachedIndex > storyCircle2.cachedIndex) {
                    Collections.sort(this.circles, new Comparator() {
                        @Override
                        public final int compare(Object obj, Object obj2) {
                            return ProfileStoriesView.lambda$dispatchDraw$2((ProfileStoriesView.StoryCircle) obj, (ProfileStoriesView.StoryCircle) obj2);
                        }
                    });
                    break;
                }
            }
            i4++;
        }
        float fClamp2 = Utilities.clamp(1.0f - (this.expandProgress / 0.2f), 1.0f, 0.0f);
        boolean zIsLastUploadingFailed = this.storiesController.isLastUploadingFailed(this.dialogId);
        boolean zHasUploadingStories = this.storiesController.hasUploadingStories(this.dialogId);
        if (!zHasUploadingStories && (uploadingStory = this.lastUploadingStory) != null && uploadingStory.canceled) {
            this.progressWasDrawn = false;
            this.progressIsDone = false;
            this.progressToUploading.set(false, true);
        }
        float fLerp2 = AndroidUtilities.lerp(0.0f, this.progressToUploading.set((zHasUploadingStories && !zIsLastUploadingFailed) || (this.progressWasDrawn && !this.progressIsDone)), this.fragmentTransitionProgress);
        canvas.save();
        float f10 = this.bounceScale;
        canvas.scale(f10, f10, this.rect1.centerX(), this.rect1.centerY());
        float fLerp3 = AndroidUtilities.lerp(this.rect1.centerY(), this.expandY, this.expandProgress);
        this.lastUploadingStory = null;
        if (fLerp2 > 0.0f) {
            this.rect2.set(this.rect1);
            this.rect2.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            Paint paint5 = this.gradientTools.getPaint(this.rect2);
            if (this.radialProgress == null) {
                RadialProgress radialProgress = new RadialProgress(this);
                this.radialProgress = radialProgress;
                radialProgress.setBackground(null, true, false);
                this.radialProgress.setRoundRectProgress(ChatObject.isForum(UserConfig.selectedAccount, this.dialogId));
            }
            if (!this.storiesController.hasUploadingStories(this.dialogId) || this.storiesController.isLastUploadingFailed(this.dialogId)) {
                size = 1.0f;
            } else {
                ArrayList uploadingStories = this.storiesController.getUploadingStories(this.dialogId);
                if (uploadingStories != null) {
                    if (uploadingStories.size() > 0) {
                        this.lastUploadingStory = (StoriesController.UploadingStory) uploadingStories.get(0);
                    }
                    float f11 = 0.0f;
                    for (int i5 = 0; i5 < uploadingStories.size(); i5++) {
                        f11 += ((StoriesController.UploadingStory) uploadingStories.get(i5)).progress;
                    }
                    size = f11 / uploadingStories.size();
                } else {
                    size = 0.0f;
                }
            }
            this.radialProgress.setDiff(0);
            int alpha = paint5.getAlpha();
            paint5.setAlpha((int) (alpha * fClamp2 * fLerp2));
            paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
            this.radialProgress.setPaint(paint5);
            RadialProgress radialProgress2 = this.radialProgress;
            RectF rectF = this.rect2;
            f = fClamp2;
            radialProgress2.setProgressRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.radialProgress.setProgress(Utilities.clamp(size, 1.0f, 0.0f), true);
            if (this.avatarImage.drawAvatar) {
                this.radialProgress.draw(canvas);
            }
            paint5.setAlpha(alpha);
            this.progressWasDrawn = true;
            boolean z2 = this.progressIsDone;
            boolean z3 = this.radialProgress.getAnimatedProgress() >= 0.98f;
            this.progressIsDone = z3;
            if (z2 != z3) {
                this.segmentsCountAnimated.set(this.count, true);
                this.segmentsUnreadCountAnimated.set(this.unreadCount, true);
                animateBounce();
            }
            paint = paint5;
        } else {
            f = fClamp2;
            this.progressWasDrawn = false;
            paint = null;
        }
        if (fLerp2 < 1.0f) {
            float fClamp3 = Utilities.clamp(1.0f - (this.expandProgress / 0.2f), 1.0f, 0.0f) * (1.0f - fLerp2);
            float f12 = this.segmentsCountAnimated.set(this.count);
            float f13 = this.segmentsUnreadCountAnimated.set(this.unreadCount);
            if (zIsLastUploadingFailed) {
                this.rect2.set(this.rect1);
                this.rect2.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                Paint errorPaint = StoriesUtilities.getErrorPaint(this.rect2);
                errorPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                errorPaint.setAlpha((int) (fClamp3 * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, this.dialogId)) {
                    float fHeight = this.rect2.height() * 0.32f;
                    canvas.drawRoundRect(this.rect2, fHeight, fHeight, errorPaint);
                } else {
                    canvas.drawCircle(this.rect2.centerX(), this.rect2.centerY(), this.rect2.width() / 2.0f, errorPaint);
                }
            } else if ((this.mainCircle != null || this.uploadingStoriesCount > 0) && fClamp3 > 0.0f) {
                this.rect2.set(this.rect1);
                this.rect2.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                this.rect3.set(this.rect1);
                this.rect3.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                RectF rectF2 = this.rect2;
                RectF rectF3 = this.rect3;
                AndroidUtilities.lerp(rectF2, rectF3, fClamp, rectF3);
                float fLerp4 = AndroidUtilities.lerp(0.0f, (float) ((AndroidUtilities.dpf2(4.23f) / (this.rect1.width() * 3.141592653589793d)) * 360.0d), Utilities.clamp(f12 - 1.0f, 1.0f, 0.0f) * fClamp3);
                int iMin = Math.min(this.count, 50);
                float fMin = Math.min(f12, 50.0f);
                int i6 = iMin > 20 ? 3 : 5;
                if (iMin <= 1) {
                    i6 = 0;
                }
                float fLerp5 = AndroidUtilities.lerp(i6 * 2, fLerp4, fClamp);
                float fMax2 = (360.0f - (Math.max(0.0f, fMin) * fLerp5)) / Math.max(1.0f, fMin);
                this.readPaint.setColor(ColorUtils.blendARGB(1526726655, 973078528, this.actionBarProgress));
                this.readPaintAlpha = this.readPaint.getAlpha();
                float f14 = (-90.0f) - (fLerp5 / 2.0f);
                boolean z4 = false;
                for (int i7 = 0; i7 < iMin; i7++) {
                    if (i7 < this.circles.size() && ((StoryCircle) this.circles.get(i7)).live) {
                        z4 = true;
                    }
                }
                if (z4) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(this.rect3);
                    rectF4.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                    canvas.saveLayerAlpha(rectF4, 255, 31);
                    float f15 = ((this.newStoryBounceT - 1.0f) / 2.5f) + 1.0f;
                    if (f15 != 1.0f) {
                        canvas.save();
                        canvas.scale(f15, f15, this.rect2.centerX(), this.rect2.centerY());
                    }
                    int alpha2 = this.livePaint.getAlpha();
                    this.livePaint.setAlpha((int) (alpha2 * fClamp3));
                    rectF4.set(this.rect3);
                    rectF4.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                    this.livePaint.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
                    f2 = fClamp3;
                    storyCircle = null;
                    drawArc(canvas, this.rect3, 0.0f, 360.0f, false, this.livePaint);
                    this.livePaint.setAlpha(alpha2);
                    if (f15 != 1.0f) {
                        canvas.restore();
                    }
                } else {
                    f2 = fClamp3;
                    storyCircle = null;
                    float f16 = f14;
                    int i8 = 0;
                    while (i8 < iMin) {
                        float f17 = i8;
                        float fClamp4 = 1.0f - Utilities.clamp(f13 - f17, 1.0f, 0.0f);
                        float fClamp5 = 1.0f - Utilities.clamp((iMin - fMin) - f17, 1.0f, 0.0f);
                        if (fClamp5 < 0.0f) {
                            f6 = fMax2;
                            f5 = fMin;
                            i2 = iMin;
                            i3 = i8;
                        } else {
                            float f18 = i8 == 0 ? ((this.newStoryBounceT - 1.0f) / 2.5f) + 1.0f : 1.0f;
                            if (f18 != 1.0f) {
                                canvas.save();
                                canvas.scale(f18, f18, this.rect2.centerX(), this.rect2.centerY());
                            }
                            if (i8 >= this.circles.size() || !((StoryCircle) this.circles.get(i8)).live) {
                                f3 = 1.0f;
                                z = false;
                            } else {
                                f3 = 1.0f;
                                z = true;
                            }
                            if (fClamp4 < f3) {
                                if (z) {
                                    paint4 = paint;
                                    paint3 = this.livePaint;
                                } else {
                                    paint3 = this.gradientTools.getPaint(this.rect2);
                                    paint4 = paint3;
                                }
                                int alpha3 = paint3.getAlpha();
                                paint3.setAlpha((int) (alpha3 * (f3 - fClamp4) * f2));
                                paint3.setStrokeWidth(AndroidUtilities.dpf2(z ? 3.0f : 2.33f));
                                f4 = fMax2;
                                f5 = fMin;
                                i2 = iMin;
                                i3 = i8;
                                drawArc(canvas, this.rect2, f16, (-fMax2) * fClamp5, false, paint3);
                                paint3.setAlpha(alpha3);
                                paint = paint4;
                            } else {
                                f4 = fMax2;
                                f5 = fMin;
                                i2 = iMin;
                                i3 = i8;
                            }
                            if (fClamp4 > 0.0f) {
                                Paint paint6 = z ? this.livePaint : this.readPaint;
                                int alpha4 = paint6.getAlpha();
                                paint6.setAlpha((int) (alpha4 * fClamp4 * f2));
                                paint6.setStrokeWidth(AndroidUtilities.dpf2(z ? 3.0f : 1.5f));
                                float f19 = f4;
                                f6 = f19;
                                paint2 = paint;
                                drawArc(canvas, this.rect3, f16, (-f19) * fClamp5, false, paint6);
                                paint6.setAlpha(alpha4);
                            } else {
                                paint2 = paint;
                                f6 = f4;
                            }
                            if (f18 != 1.0f) {
                                canvas.restore();
                            }
                            f16 -= (f6 * fClamp5) + (fClamp5 * fLerp5);
                            paint = paint2;
                        }
                        i8 = i3 + 1;
                        fMax2 = f6;
                        iMin = i2;
                        fMin = f5;
                    }
                }
                if (z4) {
                    StoriesUtilities.drawLive(canvas, this.rect3, f2, this.avatarImage.getImageReceiver().getVisible(), this.fragmentTransitionProgress);
                    canvas.restore();
                }
            }
            f2 = fClamp3;
            storyCircle = null;
        } else {
            storyCircle = null;
            f2 = f;
        }
        getExpandRight();
        float f20 = 18.0f;
        if (this.expandProgress > 0.0f && f2 < 1.0f) {
            this.w = 0.0f;
            for (int i9 = 0; i9 < this.circles.size(); i9++) {
                this.w += AndroidUtilities.dp(14.0f) * ((StoryCircle) this.circles.get(i9)).cachedScale;
            }
            float fDp = 0.0f;
            int i10 = 0;
            while (i10 < this.circles.size()) {
                StoryCircle storyCircle3 = (StoryCircle) this.circles.get(i10);
                float f21 = storyCircle3.cachedScale;
                float f22 = storyCircle3.cachedRead;
                float fDp2 = (AndroidUtilities.dp(28.0f) / 2.0f) * f21;
                float f23 = this.left + fDp2 + fDp;
                fDp += AndroidUtilities.dp(f20) * f21;
                float f24 = f23 + fDp2;
                fMax = Math.max(fMax, f24);
                this.rect2.set(f23 - fDp2, fLerp3 - fDp2, f24, fDp2 + fLerp3);
                lerpCentered(this.rect1, this.rect2, this.expandProgress, this.rect3);
                storyCircle3.cachedRect.set(this.rect3);
                storyCircle3.borderRect.set(this.rect3);
                float f25 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), this.expandProgress), f22 * this.expandProgress)) * f21;
                storyCircle3.borderRect.inset(f25, f25);
                i10++;
                f20 = 18.0f;
            }
            this.readPaint.setColor(ColorUtils.blendARGB(1526726655, -2135178036, this.expandProgress));
            this.readPaintAlpha = this.readPaint.getAlpha();
            paint = this.gradientTools.getPaint(this.rect2);
            paint.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(1.5f), this.expandProgress));
            this.readPaint.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(1.5f), this.expandProgress));
            this.livePaint.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(1.5f), this.expandProgress));
            for (int i11 = 0; i11 < this.circles.size(); i11 = i) {
                StoryCircle storyCircle4 = (StoryCircle) this.circles.get(i11);
                int i12 = i11 - 2;
                int i13 = i11 - 1;
                StoryCircle storyCircleNearest = nearest(i12 >= 0 ? (StoryCircle) this.circles.get(i12) : storyCircle, i13 >= 0 ? (StoryCircle) this.circles.get(i13) : storyCircle, storyCircle4);
                int i14 = i11 + 1;
                int i15 = i11 + 2;
                StoryCircle storyCircleNearest2 = nearest(i14 < this.circles.size() ? (StoryCircle) this.circles.get(i14) : storyCircle, i15 < this.circles.size() ? (StoryCircle) this.circles.get(i15) : storyCircle, storyCircle4);
                StoryCircle storyCircle5 = (storyCircleNearest == null || (Math.abs(storyCircleNearest.borderRect.centerX() - storyCircle4.borderRect.centerX()) >= Math.abs((storyCircle4.borderRect.width() / 2.0f) - (storyCircleNearest.borderRect.width() / 2.0f)) && Math.abs(storyCircleNearest.borderRect.centerX() - storyCircle4.borderRect.centerX()) <= (storyCircleNearest.borderRect.width() / 2.0f) + (storyCircle4.borderRect.width() / 2.0f))) ? storyCircleNearest : storyCircle;
                StoryCircle storyCircle6 = (storyCircleNearest2 == null || (Math.abs(storyCircleNearest2.borderRect.centerX() - storyCircle4.borderRect.centerX()) >= Math.abs((storyCircle4.borderRect.width() / 2.0f) - (storyCircleNearest2.borderRect.width() / 2.0f)) && Math.abs(storyCircleNearest2.borderRect.centerX() - storyCircle4.borderRect.centerX()) <= (storyCircleNearest2.borderRect.width() / 2.0f) + (storyCircle4.borderRect.width() / 2.0f))) ? storyCircleNearest2 : storyCircle;
                if (storyCircle4.cachedRead < 1.0f) {
                    int alpha5 = paint.getAlpha();
                    paint.setAlpha((int) (alpha5 * storyCircle4.cachedScale * (1.0f - storyCircle4.cachedRead) * (1.0f - f2)));
                    i = i14;
                    drawArcs(canvas, storyCircle5, storyCircle4, storyCircle6, paint);
                    paint.setAlpha(alpha5);
                } else {
                    i = i14;
                }
                if (storyCircle4.cachedRead > 0.0f) {
                    Paint paint7 = storyCircle4.live ? this.livePaint : this.readPaint;
                    int alpha6 = paint7.getAlpha();
                    paint7.setAlpha((int) (alpha6 * storyCircle4.cachedScale * storyCircle4.cachedRead * (1.0f - f2)));
                    drawArcs(canvas, storyCircle5, storyCircle4, storyCircle6, paint7);
                    paint7.setAlpha(alpha6);
                }
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.expandProgress * 255.0f * (1.0f - f2)), 31);
            for (int size2 = this.circles.size() - 1; size2 >= 0; size2--) {
                StoryCircle storyCircle7 = (StoryCircle) this.circles.get(size2);
                if (storyCircle7.imageReceiver.getVisible()) {
                    int saveCount = canvas.getSaveCount();
                    int i16 = size2 - 1;
                    StoryCircle storyCircle8 = i16 >= 0 ? (StoryCircle) this.circles.get(i16) : storyCircle;
                    int i17 = size2 - 2;
                    clipCircle(canvas, storyCircle7, nearest(storyCircle8, i17 >= 0 ? (StoryCircle) this.circles.get(i17) : storyCircle, storyCircle7));
                    storyCircle7.imageReceiver.setImageCoords(storyCircle7.cachedRect);
                    storyCircle7.imageReceiver.draw(canvas);
                    canvas.restoreToCount(saveCount);
                }
            }
            canvas.restore();
        }
        if (paint != null) {
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
        }
        canvas.restore();
        float fMax3 = Math.max(0.0f, (this.expandProgress - 0.5f) * 2.0f);
        if (fMax3 > 0.0f) {
            float fLerp6 = AndroidUtilities.lerp(this.rect1.right + AndroidUtilities.dp(16.0f), fMax + AndroidUtilities.dp(12.0f), this.expandProgress);
            float fLerp7 = AndroidUtilities.lerp(getWidth(), f7, this.expandProgress);
            float fLerp8 = AndroidUtilities.lerp(this.rect1.centerY(), this.cy, this.expandProgress);
            this.titleDrawable.setBounds((int) fLerp6, (int) (fLerp8 - AndroidUtilities.dp(18.0f)), (int) fLerp7, (int) (fLerp8 + AndroidUtilities.dp(18.0f)));
            this.titleDrawable.setAlpha((int) (fMax3 * 255.0f));
            this.titleDrawable.draw(canvas);
        }
    }

    public static int lambda$dispatchDraw$2(StoryCircle storyCircle, StoryCircle storyCircle2) {
        return (int) (storyCircle2.cachedIndex - storyCircle.cachedIndex);
    }

    private void animateBounce() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.setInterpolator(new OvershootInterpolator());
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$animateBounce$3(valueAnimator);
            }
        };
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfFloat2.addUpdateListener(animatorUpdateListener);
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ProfileStoriesView.this.avatarImage.bounceScale = ProfileStoriesView.this.bounceScale = 1.0f;
                ProfileStoriesView.this.avatarImage.invalidate();
                ProfileStoriesView.this.invalidate();
            }
        });
        animatorSet.start();
    }

    public void lambda$animateBounce$3(ValueAnimator valueAnimator) {
        ProfileActivity.AvatarImageView avatarImageView = this.avatarImage;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.bounceScale = fFloatValue;
        avatarImageView.bounceScale = fFloatValue;
        this.avatarImage.invalidate();
        invalidate();
    }

    public void clipCircle(Canvas canvas, StoryCircle storyCircle, StoryCircle storyCircle2) {
        if (storyCircle2 == null) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(storyCircle2.cachedRect);
        float f = -(AndroidUtilities.dpf2(1.66f) * storyCircle2.cachedScale);
        rectF.inset(f, f);
        float fCenterX = storyCircle2.cachedRect.centerX();
        float fWidth = storyCircle2.cachedRect.width() / 2.0f;
        float fCenterX2 = storyCircle.cachedRect.centerX();
        float fWidth2 = storyCircle.cachedRect.width() / 2.0f;
        this.clipPath.rewind();
        if (fCenterX > fCenterX2) {
            float degrees = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX - fWidth) + (fCenterX2 + fWidth2)) / 2.0f) - fCenterX2) / fWidth2));
            this.clipPath.arcTo(rectF, 180.0f + degrees, (-degrees) * 2.0f);
            this.clipPath.arcTo(storyCircle.cachedRect, degrees, 360.0f - (2.0f * degrees));
        } else {
            float degrees2 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX + fWidth) + (fCenterX2 - fWidth2)) / 2.0f) - fCenterX2) / fWidth2));
            float f2 = 2.0f * degrees2;
            this.clipPath.arcTo(rectF, -degrees2, f2);
            this.clipPath.arcTo(storyCircle.cachedRect, 180.0f - degrees2, -(360.0f - f2));
        }
        this.clipPath.close();
        canvas.save();
        canvas.clipPath(this.clipPath);
    }

    public StoryCircle nearest(StoryCircle storyCircle, StoryCircle storyCircle2, StoryCircle storyCircle3) {
        if (storyCircle3 == null) {
            return null;
        }
        if (storyCircle == null && storyCircle2 == null) {
            return null;
        }
        return (storyCircle == null || storyCircle2 == null) ? storyCircle != null ? storyCircle : storyCircle2 : Math.min(Math.abs(storyCircle.borderRect.left - storyCircle3.borderRect.right), Math.abs(storyCircle.borderRect.right - storyCircle3.borderRect.left)) > Math.min(Math.abs(storyCircle2.borderRect.left - storyCircle3.borderRect.right), Math.abs(storyCircle2.borderRect.right - storyCircle3.borderRect.left)) ? storyCircle : storyCircle2;
    }

    private void drawArc(Canvas canvas, RectF rectF, float f, float f2, boolean z, Paint paint) {
        if (ChatObject.isForum(UserConfig.selectedAccount, this.dialogId)) {
            float fHeight = rectF.height() * 0.32f;
            if (Math.abs(f2) == 360.0f) {
                canvas.drawRoundRect(rectF, fHeight, fHeight, paint);
                return;
            }
            float f3 = f + f2;
            float f4 = (((int) f3) / 90) * 90;
            float f5 = (-199.0f) + f4;
            this.forumRoundRectPath.rewind();
            this.forumRoundRectPath.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
            this.forumRoundRectMatrix.reset();
            this.forumRoundRectMatrix.postRotate(f4, rectF.centerX(), rectF.centerY());
            this.forumRoundRectPath.transform(this.forumRoundRectMatrix);
            this.forumRoundRectPathMeasure.setPath(this.forumRoundRectPath, false);
            float length = this.forumRoundRectPathMeasure.getLength();
            this.forumSegmentPath.reset();
            this.forumRoundRectPathMeasure.getSegment(((f3 - f5) / 360.0f) * length, length * (((f3 - f2) - f5) / 360.0f), this.forumSegmentPath, true);
            this.forumSegmentPath.rLineTo(0.0f, 0.0f);
            canvas.drawPath(this.forumSegmentPath, paint);
            return;
        }
        canvas.drawArc(rectF, f, f2, z, paint);
    }

    private void drawArcs(Canvas canvas, StoryCircle storyCircle, StoryCircle storyCircle2, StoryCircle storyCircle3, Paint paint) {
        double degrees;
        double degrees2;
        StoryCircle storyCircle4 = storyCircle;
        if (storyCircle4 == null && storyCircle3 == null) {
            drawArc(canvas, storyCircle2.borderRect, 0.0f, 360.0f, false, paint);
            return;
        }
        if (storyCircle4 == null || storyCircle3 == null) {
            if (storyCircle4 == null && storyCircle3 == null) {
                return;
            }
            if (storyCircle4 == null) {
                storyCircle4 = storyCircle3;
            }
            float fCenterX = storyCircle4.borderRect.centerX();
            float fWidth = storyCircle4.borderRect.width() / 2.0f;
            float fCenterX2 = storyCircle2.borderRect.centerX();
            if (Math.abs(fCenterX - fCenterX2) > fWidth + (storyCircle2.borderRect.width() / 2.0f)) {
                drawArc(canvas, storyCircle2.borderRect, 0.0f, 360.0f, false, paint);
                return;
            } else if (fCenterX > fCenterX2) {
                float degrees3 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX - fWidth) + (fCenterX2 + r7)) / 2.0f) - fCenterX2) / r7));
                drawArc(canvas, storyCircle2.borderRect, degrees3, 360.0f - (2.0f * degrees3), false, paint);
                return;
            } else {
                float degrees4 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX + fWidth) + (fCenterX2 - r7)) / 2.0f) - fCenterX2) / r7));
                drawArc(canvas, storyCircle2.borderRect, degrees4 + 180.0f, 360.0f - (degrees4 * 2.0f), false, paint);
                return;
            }
        }
        float fCenterX3 = storyCircle4.borderRect.centerX();
        float fWidth2 = storyCircle4.borderRect.width() / 2.0f;
        float fCenterX4 = storyCircle2.borderRect.centerX();
        float fWidth3 = storyCircle2.borderRect.width() / 2.0f;
        float fCenterX5 = storyCircle3.borderRect.centerX();
        float fWidth4 = storyCircle3.borderRect.width() / 2.0f;
        boolean z = fCenterX3 > fCenterX4;
        if (z) {
            degrees = Math.toDegrees(Math.acos(Math.abs((((fCenterX3 - fWidth2) + (fCenterX4 + fWidth3)) / 2.0f) - fCenterX4) / fWidth3));
        } else {
            degrees = Math.toDegrees(Math.acos(Math.abs((((fCenterX3 + fWidth2) + (fCenterX4 - fWidth3)) / 2.0f) - fCenterX4) / fWidth3));
        }
        float f = (float) degrees;
        boolean z2 = fCenterX5 > fCenterX4;
        if (z2) {
            degrees2 = Math.toDegrees(Math.acos(Math.abs((((fCenterX5 - fWidth4) + (fCenterX4 + fWidth3)) / 2.0f) - fCenterX4) / fWidth3));
        } else {
            degrees2 = Math.toDegrees(Math.acos(Math.abs((((fCenterX5 + fWidth4) + (fCenterX4 - fWidth3)) / 2.0f) - fCenterX4) / fWidth3));
        }
        float f2 = (float) degrees2;
        if (z && z2) {
            float fMax = Math.max(f, f2);
            drawArc(canvas, storyCircle2.borderRect, fMax, 360.0f - (2.0f * fMax), false, paint);
        } else if (z) {
            drawArc(canvas, storyCircle2.borderRect, f2 + 180.0f, 180.0f - (f + f2), false, paint);
            drawArc(canvas, storyCircle2.borderRect, f, (180.0f - f2) - f, false, paint);
        } else if (z2) {
            drawArc(canvas, storyCircle2.borderRect, f + 180.0f, 180.0f - (f2 + f), false, paint);
            drawArc(canvas, storyCircle2.borderRect, f2, (180.0f - f2) - f, false, paint);
        } else {
            float fMax2 = Math.max(f, f2);
            drawArc(canvas, storyCircle2.borderRect, fMax2 + 180.0f, 360.0f - (fMax2 * 2.0f), false, paint);
        }
    }

    private void lerpCentered(RectF rectF, RectF rectF2, float f, RectF rectF3) {
        float fLerp = AndroidUtilities.lerp(rectF.centerX(), rectF2.centerX(), f);
        float fLerp2 = AndroidUtilities.lerp(rectF.centerY(), rectF2.centerY(), f);
        float fLerp3 = AndroidUtilities.lerp(Math.min(rectF.width(), rectF.height()), Math.min(rectF2.width(), rectF2.height()), f) / 2.0f;
        rectF3.set(fLerp - fLerp3, fLerp2 - fLerp3, fLerp + fLerp3, fLerp2 + fLerp3);
    }

    public void setBounds(float f, float f2, float f3, boolean z) {
        boolean z2 = Math.abs(f - this.left) > 0.1f || Math.abs(f2 - this.right) > 0.1f || Math.abs(f3 - this.cy) > 0.1f;
        this.left = f;
        this.right = f2;
        if (!z) {
            this.rightAnimated.set(f2, true);
        }
        this.cy = f3;
        if (z2) {
            invalidate();
        }
    }

    public void setExpandCoords(float f, boolean z, float f2) {
        this.expandRight = f;
        this.expandRightPad = z;
        this.expandY = f2;
        invalidate();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesUpdated) {
            updateStories(true, true);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        for (int i = 0; i < this.circles.size(); i++) {
            ((StoryCircle) this.circles.get(i)).imageReceiver.onAttachedToWindow();
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        for (int i = 0; i < this.circles.size(); i++) {
            ((StoryCircle) this.circles.get(i)).imageReceiver.onDetachedFromWindow();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    class AnonymousClass3 implements StoryViewer.PlaceProvider {
        @Override
        public void loadNext(boolean z) {
            StoryViewer.PlaceProvider.CC.$default$loadNext(this, z);
        }

        AnonymousClass3() {
        }

        @Override
        public boolean findView(long j, int i, int i2, int i3, StoryViewer.TransitionViewHolder transitionViewHolder) {
            ImageReceiver imageReceiver;
            final StoryCircle storyCircle;
            final StoryCircle storyCircle2;
            transitionViewHolder.avatarImage = null;
            transitionViewHolder.storyImage = null;
            if (ProfileStoriesView.this.expandProgress < 0.2f) {
                transitionViewHolder.avatarImage = ProfileStoriesView.this.avatarImage.getImageReceiver();
                transitionViewHolder.storyImage = null;
                transitionViewHolder.view = ProfileStoriesView.this.avatarImage;
                transitionViewHolder.clipTop = 0.0f;
                transitionViewHolder.clipBottom = AndroidUtilities.displaySize.y;
                transitionViewHolder.clipParent = (View) ProfileStoriesView.this.getParent();
                transitionViewHolder.radialProgressUpload = ProfileStoriesView.this.radialProgress;
                transitionViewHolder.checkParentScale = true;
                return true;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= ProfileStoriesView.this.circles.size()) {
                    imageReceiver = null;
                    storyCircle = null;
                    storyCircle2 = null;
                    break;
                }
                StoryCircle storyCircle3 = (StoryCircle) ProfileStoriesView.this.circles.get(i4);
                if (storyCircle3.scale < 1.0f || storyCircle3.storyId != i2) {
                    i4++;
                } else {
                    ProfileStoriesView profileStoriesView = ProfileStoriesView.this;
                    int i5 = i4 - 1;
                    int i6 = i4 - 2;
                    StoryCircle storyCircleNearest = profileStoriesView.nearest(i5 >= 0 ? (StoryCircle) profileStoriesView.circles.get(i5) : null, i6 >= 0 ? (StoryCircle) ProfileStoriesView.this.circles.get(i6) : null, storyCircle3);
                    imageReceiver = storyCircle3.imageReceiver;
                    storyCircle2 = storyCircleNearest;
                    storyCircle = storyCircle3;
                }
            }
            if (imageReceiver == null) {
                return false;
            }
            transitionViewHolder.storyImage = imageReceiver;
            transitionViewHolder.avatarImage = null;
            ProfileStoriesView profileStoriesView2 = ProfileStoriesView.this;
            transitionViewHolder.view = profileStoriesView2;
            transitionViewHolder.clipTop = 0.0f;
            transitionViewHolder.clipBottom = AndroidUtilities.displaySize.y;
            transitionViewHolder.clipParent = (View) profileStoriesView2.getParent();
            if (storyCircle != null && storyCircle2 != null) {
                final RectF rectF = new RectF(storyCircle.cachedRect);
                final RectF rectF2 = new RectF(storyCircle2.cachedRect);
                transitionViewHolder.drawClip = new StoryViewer.HolderClip() {
                    @Override
                    public final void clip(Canvas canvas, RectF rectF3, float f, boolean z) {
                        this.f$0.lambda$findView$0(rectF, storyCircle, rectF2, storyCircle2, canvas, rectF3, f, z);
                    }
                };
            } else {
                transitionViewHolder.drawClip = null;
            }
            return true;
        }

        public void lambda$findView$0(RectF rectF, StoryCircle storyCircle, RectF rectF2, StoryCircle storyCircle2, Canvas canvas, RectF rectF3, float f, boolean z) {
            rectF.set(storyCircle.cachedRect);
            rectF2.set(storyCircle2.cachedRect);
            storyCircle.cachedRect.set(rectF3);
            try {
                float fWidth = rectF3.width() / rectF.width();
                float fCenterX = rectF3.centerX() - ((rectF.centerX() - rectF2.centerX()) * (((1.0f - f) * 2.0f) + fWidth));
                float fCenterY = rectF3.centerY();
                float fWidth2 = (rectF2.width() / 2.0f) * fWidth;
                float fHeight = (rectF2.height() / 2.0f) * fWidth;
                storyCircle2.cachedRect.set(fCenterX - fWidth2, fCenterY - fHeight, fCenterX + fWidth2, fCenterY + fHeight);
            } catch (Exception unused) {
            }
            ProfileStoriesView.this.clipCircle(canvas, storyCircle, storyCircle2);
            storyCircle.cachedRect.set(rectF);
            storyCircle2.cachedRect.set(rectF2);
        }

        @Override
        public void preLayout(long j, int i, Runnable runnable) {
            ProfileStoriesView.this.updateStories(true, false);
            runnable.run();
        }
    }

    public boolean isEmpty() {
        return this.circles.isEmpty();
    }

    private float getExpandRight() {
        return this.expandRight - (this.expandRightPadAnimated.set(this.expandRightPad) * AndroidUtilities.dp(71.0f));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zContains;
        if (this.expandProgress < 0.9f) {
            zContains = this.rect2.contains(motionEvent.getX(), motionEvent.getY());
        } else {
            zContains = motionEvent.getX() >= this.left && motionEvent.getX() <= this.right && Math.abs(motionEvent.getY() - this.cy) < ((float) AndroidUtilities.dp(32.0f));
        }
        if (zContains && motionEvent.getAction() == 0) {
            this.tapTime = System.currentTimeMillis();
            this.tapX = motionEvent.getX();
            this.tapY = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(this.onLongPressRunnable);
            AndroidUtilities.runOnUIThread(this.onLongPressRunnable, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(this.onLongPressRunnable);
            if (zContains && System.currentTimeMillis() - this.tapTime <= ViewConfiguration.getTapTimeout() && MathUtils.distance(this.tapX, this.tapY, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f) && (this.storiesController.hasUploadingStories(this.dialogId) || this.storiesController.hasStories(this.dialogId) || !this.circles.isEmpty())) {
                onTap(this.provider);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            this.tapTime = -1L;
            AndroidUtilities.cancelRunOnUIThread(this.onLongPressRunnable);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setFragmentTransitionProgress(float f) {
        if (this.fragmentTransitionProgress == f) {
            return;
        }
        this.fragmentTransitionProgress = f;
        invalidate();
    }

    public float getFragmentTransitionProgress() {
        return this.fragmentTransitionProgress;
    }
}
