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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
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

    public class StoryCircle {
        final RectF borderRect;
        float cachedIndex;
        float cachedRead;
        final RectF cachedRect;
        float cachedScale;
        final AnimatedFloat indexAnimated;
        final AnimatedFloat readAnimated;
        final AnimatedFloat scaleAnimated;
        int storyId;
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
            if (ProfileStoriesView.this.attached) {
                this.imageReceiver.onAttachedToWindow();
            }
            StoriesUtilities.setThumbImage(this.imageReceiver, storyItem, 25, 25);
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
        this.whitePaint = paint2;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.titleDrawable = animatedTextDrawable;
        Paint paint3 = new Paint(1);
        this.clipOutAvatar = paint3;
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
                ProfileStoriesView.this.lambda$new$4();
            }
        };
        this.currentAccount = i;
        this.dialogId = j;
        this.isTopic = z;
        this.avatarContainer = view;
        this.avatarImage = avatarImageView;
        this.storiesController = MessagesController.getInstance(i).getStoriesController();
        paint.setColor(1526726655);
        this.readPaintAlpha = paint.getAlpha();
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(18.0f));
        animatedTextDrawable.setAnimationProperties(0.4f, 0L, 320L, cubicBezierInterpolator);
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setTextColor(Theme.getColor(Theme.key_actionBarDefaultTitle, resourcesProvider));
        animatedTextDrawable.setEllipsizeByGradient(true);
        animatedTextDrawable.setCallback(this);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
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
                ProfileStoriesView.this.lambda$vibrateNewStory$0();
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.newStoryBounce = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProfileStoriesView.this.lambda$animateNewStory$1(zArr, valueAnimator2);
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
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!zArr[0] && floatValue > 0.2f) {
            zArr[0] = true;
            vibrateNewStory();
        }
        this.newStoryBounceT = Math.max(1.0f, floatValue);
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f;
        StoryCircle storyCircle;
        float f2;
        float f3;
        int i;
        float f4;
        int i2;
        float f5;
        float f6;
        Paint paint2;
        float f7;
        StoriesController.UploadingStory uploadingStory;
        float f8 = this.rightAnimated.set(this.right);
        float clamp = Utilities.clamp((this.avatarContainer.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), clamp) * this.progressToInsets;
        float x = this.avatarContainer.getX() + (this.avatarContainer.getScaleX() * lerp);
        float y = this.avatarContainer.getY() + (this.avatarContainer.getScaleY() * lerp);
        float f9 = lerp * 2.0f;
        this.rect1.set(x, y, ((this.avatarContainer.getWidth() - f9) * this.avatarContainer.getScaleX()) + x, ((this.avatarContainer.getHeight() - f9) * this.avatarContainer.getScaleY()) + y);
        float f10 = this.left;
        int i3 = 0;
        while (true) {
            if (i3 >= this.circles.size()) {
                break;
            }
            StoryCircle storyCircle2 = (StoryCircle) this.circles.get(i3);
            float f11 = storyCircle2.scaleAnimated.set(storyCircle2.scale);
            storyCircle2.cachedScale = f11;
            if (f11 <= 0.0f && storyCircle2.scale <= 0.0f) {
                storyCircle2.destroy();
                this.circles.remove(i3);
                i3--;
            } else {
                storyCircle2.cachedIndex = storyCircle2.indexAnimated.set(storyCircle2.index);
                storyCircle2.cachedRead = storyCircle2.readAnimated.set(storyCircle2.read);
                if (i3 > 0 && ((StoryCircle) this.circles.get(i3 - 1)).cachedIndex > storyCircle2.cachedIndex) {
                    Collections.sort(this.circles, new Comparator() {
                        @Override
                        public final int compare(Object obj, Object obj2) {
                            int lambda$dispatchDraw$2;
                            lambda$dispatchDraw$2 = ProfileStoriesView.lambda$dispatchDraw$2((ProfileStoriesView.StoryCircle) obj, (ProfileStoriesView.StoryCircle) obj2);
                            return lambda$dispatchDraw$2;
                        }
                    });
                    break;
                }
            }
            i3++;
        }
        float clamp2 = Utilities.clamp(1.0f - (this.expandProgress / 0.2f), 1.0f, 0.0f);
        boolean isLastUploadingFailed = this.storiesController.isLastUploadingFailed(this.dialogId);
        boolean hasUploadingStories = this.storiesController.hasUploadingStories(this.dialogId);
        if (!hasUploadingStories && (uploadingStory = this.lastUploadingStory) != null && uploadingStory.canceled) {
            this.progressWasDrawn = false;
            this.progressIsDone = false;
            this.progressToUploading.set(false, true);
        }
        float lerp2 = AndroidUtilities.lerp(0.0f, this.progressToUploading.set((hasUploadingStories && !isLastUploadingFailed) || (this.progressWasDrawn && !this.progressIsDone)), this.fragmentTransitionProgress);
        canvas.save();
        float f12 = this.bounceScale;
        canvas.scale(f12, f12, this.rect1.centerX(), this.rect1.centerY());
        float lerp3 = AndroidUtilities.lerp(this.rect1.centerY(), this.expandY, this.expandProgress);
        this.lastUploadingStory = null;
        if (lerp2 > 0.0f) {
            this.rect2.set(this.rect1);
            this.rect2.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            paint = this.gradientTools.getPaint(this.rect2);
            if (this.radialProgress == null) {
                RadialProgress radialProgress = new RadialProgress(this);
                this.radialProgress = radialProgress;
                radialProgress.setBackground(null, true, false);
                this.radialProgress.setRoundRectProgress(ChatObject.isForum(UserConfig.selectedAccount, this.dialogId));
            }
            if (!this.storiesController.hasUploadingStories(this.dialogId) || this.storiesController.isLastUploadingFailed(this.dialogId)) {
                f7 = 1.0f;
            } else {
                ArrayList uploadingStories = this.storiesController.getUploadingStories(this.dialogId);
                if (uploadingStories != null) {
                    if (uploadingStories.size() > 0) {
                        this.lastUploadingStory = (StoriesController.UploadingStory) uploadingStories.get(0);
                    }
                    float f13 = 0.0f;
                    for (int i4 = 0; i4 < uploadingStories.size(); i4++) {
                        f13 += ((StoriesController.UploadingStory) uploadingStories.get(i4)).progress;
                    }
                    f7 = f13 / uploadingStories.size();
                } else {
                    f7 = 0.0f;
                }
            }
            this.radialProgress.setDiff(0);
            paint.setAlpha((int) (clamp2 * 255.0f * lerp2));
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
            this.radialProgress.setPaint(paint);
            RadialProgress radialProgress2 = this.radialProgress;
            RectF rectF = this.rect2;
            radialProgress2.setProgressRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.radialProgress.setProgress(Utilities.clamp(f7, 1.0f, 0.0f), true);
            if (this.avatarImage.drawAvatar) {
                this.radialProgress.draw(canvas);
            }
            this.progressWasDrawn = true;
            boolean z = this.progressIsDone;
            boolean z2 = this.radialProgress.getAnimatedProgress() >= 0.98f;
            this.progressIsDone = z2;
            if (z != z2) {
                this.segmentsCountAnimated.set(this.count, true);
                this.segmentsUnreadCountAnimated.set(this.unreadCount, true);
                animateBounce();
            }
        } else {
            this.progressWasDrawn = false;
            paint = null;
        }
        if (lerp2 < 1.0f) {
            f2 = Utilities.clamp(1.0f - (this.expandProgress / 0.2f), 1.0f, 0.0f) * (1.0f - lerp2);
            float f14 = this.segmentsCountAnimated.set(this.count);
            float f15 = this.segmentsUnreadCountAnimated.set(this.unreadCount);
            if (isLastUploadingFailed) {
                this.rect2.set(this.rect1);
                this.rect2.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                Paint errorPaint = StoriesUtilities.getErrorPaint(this.rect2);
                errorPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                errorPaint.setAlpha((int) (f2 * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, this.dialogId)) {
                    float height = this.rect2.height() * 0.32f;
                    canvas.drawRoundRect(this.rect2, height, height, errorPaint);
                } else {
                    canvas.drawCircle(this.rect2.centerX(), this.rect2.centerY(), this.rect2.width() / 2.0f, errorPaint);
                }
            } else if ((this.mainCircle != null || this.uploadingStoriesCount > 0) && f2 > 0.0f) {
                this.rect2.set(this.rect1);
                this.rect2.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                this.rect3.set(this.rect1);
                this.rect3.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                RectF rectF2 = this.rect2;
                RectF rectF3 = this.rect3;
                AndroidUtilities.lerp(rectF2, rectF3, clamp, rectF3);
                float lerp4 = AndroidUtilities.lerp(0.0f, (float) ((AndroidUtilities.dpf2(4.23f) / (this.rect1.width() * 3.141592653589793d)) * 360.0d), Utilities.clamp(f14 - 1.0f, 1.0f, 0.0f) * f2);
                int min = Math.min(this.count, 50);
                float min2 = Math.min(f14, 50.0f);
                int i5 = min > 20 ? 3 : 5;
                if (min <= 1) {
                    i5 = 0;
                }
                float lerp5 = AndroidUtilities.lerp(i5 * 2, lerp4, clamp);
                float max = (360.0f - (Math.max(0.0f, min2) * lerp5)) / Math.max(1.0f, min2);
                this.readPaint.setColor(ColorUtils.blendARGB(1526726655, 973078528, this.actionBarProgress));
                this.readPaintAlpha = this.readPaint.getAlpha();
                float f16 = (-90.0f) - (lerp5 / 2.0f);
                int i6 = 0;
                while (i6 < min) {
                    float f17 = i6;
                    float clamp3 = 1.0f - Utilities.clamp(f15 - f17, 1.0f, 0.0f);
                    float clamp4 = 1.0f - Utilities.clamp((min - min2) - f17, 1.0f, 0.0f);
                    if (clamp4 < 0.0f) {
                        i = i6;
                        f4 = min2;
                        i2 = min;
                        f5 = f10;
                        f6 = max;
                    } else {
                        float f18 = i6 == 0 ? ((this.newStoryBounceT - 1.0f) / 2.5f) + 1.0f : 1.0f;
                        if (f18 != 1.0f) {
                            canvas.save();
                            canvas.scale(f18, f18, this.rect2.centerX(), this.rect2.centerY());
                        }
                        if (clamp3 < 1.0f) {
                            paint2 = this.gradientTools.getPaint(this.rect2);
                            paint2.setAlpha((int) ((1.0f - clamp3) * 255.0f * f2));
                            paint2.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
                            i = i6;
                            f5 = f10;
                            f6 = max;
                            f4 = min2;
                            i2 = min;
                            drawArc(canvas, this.rect2, f16, (-max) * clamp4, false, paint2);
                        } else {
                            i = i6;
                            f4 = min2;
                            i2 = min;
                            f5 = f10;
                            f6 = max;
                            paint2 = paint;
                        }
                        if (clamp3 > 0.0f) {
                            this.readPaint.setAlpha((int) (this.readPaintAlpha * clamp3 * f2));
                            this.readPaint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                            drawArc(canvas, this.rect3, f16, (-f6) * clamp4, false, this.readPaint);
                        }
                        if (f18 != 1.0f) {
                            canvas.restore();
                        }
                        f16 -= (f6 * clamp4) + (clamp4 * lerp5);
                        paint = paint2;
                    }
                    i6 = i + 1;
                    min2 = f4;
                    max = f6;
                    min = i2;
                    f10 = f5;
                }
            }
            f = f10;
            storyCircle = null;
        } else {
            f = f10;
            storyCircle = null;
            f2 = clamp2;
        }
        getExpandRight();
        float f19 = 18.0f;
        if (this.expandProgress <= 0.0f || f2 >= 1.0f) {
            f3 = f;
        } else {
            this.w = 0.0f;
            for (int i7 = 0; i7 < this.circles.size(); i7++) {
                this.w += AndroidUtilities.dp(14.0f) * ((StoryCircle) this.circles.get(i7)).cachedScale;
            }
            f3 = f;
            float f20 = 0.0f;
            int i8 = 0;
            while (i8 < this.circles.size()) {
                StoryCircle storyCircle3 = (StoryCircle) this.circles.get(i8);
                float f21 = storyCircle3.cachedScale;
                float f22 = storyCircle3.cachedRead;
                float dp = (AndroidUtilities.dp(28.0f) / 2.0f) * f21;
                float f23 = this.left + dp + f20;
                f20 += AndroidUtilities.dp(f19) * f21;
                float f24 = f23 + dp;
                f3 = Math.max(f3, f24);
                this.rect2.set(f23 - dp, lerp3 - dp, f24, dp + lerp3);
                lerpCentered(this.rect1, this.rect2, this.expandProgress, this.rect3);
                storyCircle3.cachedRect.set(this.rect3);
                storyCircle3.borderRect.set(this.rect3);
                float f25 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), this.expandProgress), f22 * this.expandProgress)) * f21;
                storyCircle3.borderRect.inset(f25, f25);
                i8++;
                f19 = 18.0f;
            }
            this.readPaint.setColor(ColorUtils.blendARGB(1526726655, -2135178036, this.expandProgress));
            this.readPaintAlpha = this.readPaint.getAlpha();
            Paint paint3 = this.gradientTools.getPaint(this.rect2);
            paint3.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(1.5f), this.expandProgress));
            this.readPaint.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(1.5f), this.expandProgress));
            int i9 = 0;
            while (i9 < this.circles.size()) {
                StoryCircle storyCircle4 = (StoryCircle) this.circles.get(i9);
                int i10 = i9 - 2;
                int i11 = i9 - 1;
                StoryCircle nearest = nearest(i10 >= 0 ? (StoryCircle) this.circles.get(i10) : storyCircle, i11 >= 0 ? (StoryCircle) this.circles.get(i11) : storyCircle, storyCircle4);
                int i12 = i9 + 1;
                int i13 = i9 + 2;
                StoryCircle nearest2 = nearest(i12 < this.circles.size() ? (StoryCircle) this.circles.get(i12) : storyCircle, i13 < this.circles.size() ? (StoryCircle) this.circles.get(i13) : storyCircle, storyCircle4);
                StoryCircle storyCircle5 = (nearest == null || (Math.abs(nearest.borderRect.centerX() - storyCircle4.borderRect.centerX()) >= Math.abs((storyCircle4.borderRect.width() / 2.0f) - (nearest.borderRect.width() / 2.0f)) && Math.abs(nearest.borderRect.centerX() - storyCircle4.borderRect.centerX()) <= (nearest.borderRect.width() / 2.0f) + (storyCircle4.borderRect.width() / 2.0f))) ? nearest : storyCircle;
                StoryCircle storyCircle6 = (nearest2 == null || (Math.abs(nearest2.borderRect.centerX() - storyCircle4.borderRect.centerX()) >= Math.abs((storyCircle4.borderRect.width() / 2.0f) - (nearest2.borderRect.width() / 2.0f)) && Math.abs(nearest2.borderRect.centerX() - storyCircle4.borderRect.centerX()) <= (nearest2.borderRect.width() / 2.0f) + (storyCircle4.borderRect.width() / 2.0f))) ? nearest2 : storyCircle;
                float f26 = storyCircle4.cachedRead;
                if (f26 < 1.0f) {
                    paint3.setAlpha((int) (storyCircle4.cachedScale * 255.0f * (1.0f - f26) * (1.0f - f2)));
                    drawArcs(canvas, storyCircle5, storyCircle4, storyCircle6, paint3);
                }
                float f27 = storyCircle4.cachedRead;
                if (f27 > 0.0f) {
                    this.readPaint.setAlpha((int) (this.readPaintAlpha * storyCircle4.cachedScale * f27 * (1.0f - f2)));
                    drawArcs(canvas, storyCircle5, storyCircle4, storyCircle6, this.readPaint);
                }
                i9 = i12;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.expandProgress * 255.0f * (1.0f - f2)), 31);
            for (int size = this.circles.size() - 1; size >= 0; size--) {
                StoryCircle storyCircle7 = (StoryCircle) this.circles.get(size);
                if (storyCircle7.imageReceiver.getVisible()) {
                    int saveCount = canvas.getSaveCount();
                    int i14 = size - 1;
                    StoryCircle storyCircle8 = i14 >= 0 ? (StoryCircle) this.circles.get(i14) : storyCircle;
                    int i15 = size - 2;
                    clipCircle(canvas, storyCircle7, nearest(storyCircle8, i15 >= 0 ? (StoryCircle) this.circles.get(i15) : storyCircle, storyCircle7));
                    storyCircle7.imageReceiver.setImageCoords(storyCircle7.cachedRect);
                    storyCircle7.imageReceiver.draw(canvas);
                    canvas.restoreToCount(saveCount);
                }
            }
            canvas.restore();
            paint = paint3;
        }
        if (paint != null) {
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
        }
        canvas.restore();
        float max2 = Math.max(0.0f, (this.expandProgress - 0.5f) * 2.0f);
        if (max2 > 0.0f) {
            float lerp6 = AndroidUtilities.lerp(this.rect1.right + AndroidUtilities.dp(16.0f), f3 + AndroidUtilities.dp(12.0f), this.expandProgress);
            float lerp7 = AndroidUtilities.lerp(getWidth(), f8, this.expandProgress);
            float lerp8 = AndroidUtilities.lerp(this.rect1.centerY(), this.cy, this.expandProgress);
            this.titleDrawable.setBounds((int) lerp6, (int) (lerp8 - AndroidUtilities.dp(18.0f)), (int) lerp7, (int) (lerp8 + AndroidUtilities.dp(18.0f)));
            this.titleDrawable.setAlpha((int) (max2 * 255.0f));
            this.titleDrawable.draw(canvas);
        }
    }

    public static int lambda$dispatchDraw$2(StoryCircle storyCircle, StoryCircle storyCircle2) {
        return (int) (storyCircle2.cachedIndex - storyCircle.cachedIndex);
    }

    private void animateBounce() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(new OvershootInterpolator());
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProfileStoriesView.this.lambda$animateBounce$3(valueAnimator);
            }
        };
        ofFloat.addUpdateListener(animatorUpdateListener);
        ofFloat2.addUpdateListener(animatorUpdateListener);
        animatorSet.playSequentially(ofFloat, ofFloat2);
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
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.bounceScale = floatValue;
        avatarImageView.bounceScale = floatValue;
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
        float centerX = storyCircle2.cachedRect.centerX();
        float width = storyCircle2.cachedRect.width() / 2.0f;
        float centerX2 = storyCircle.cachedRect.centerX();
        float width2 = storyCircle.cachedRect.width() / 2.0f;
        this.clipPath.rewind();
        if (centerX > centerX2) {
            float degrees = (float) Math.toDegrees(Math.acos(Math.abs((((centerX - width) + (centerX2 + width2)) / 2.0f) - centerX2) / width2));
            this.clipPath.arcTo(rectF, 180.0f + degrees, (-degrees) * 2.0f);
            this.clipPath.arcTo(storyCircle.cachedRect, degrees, 360.0f - (2.0f * degrees));
        } else {
            float degrees2 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX + width) + (centerX2 - width2)) / 2.0f) - centerX2) / width2));
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
            float height = rectF.height() * 0.32f;
            if (Math.abs(f2) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f3 = f + f2;
            float f4 = (((int) f3) / 90) * 90;
            float f5 = (-199.0f) + f4;
            this.forumRoundRectPath.rewind();
            this.forumRoundRectPath.addRoundRect(rectF, height, height, Path.Direction.CW);
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
            float centerX = storyCircle4.borderRect.centerX();
            float width = storyCircle4.borderRect.width() / 2.0f;
            float centerX2 = storyCircle2.borderRect.centerX();
            if (Math.abs(centerX - centerX2) > width + (storyCircle2.borderRect.width() / 2.0f)) {
                drawArc(canvas, storyCircle2.borderRect, 0.0f, 360.0f, false, paint);
                return;
            } else if (centerX > centerX2) {
                float degrees3 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX - width) + (centerX2 + r7)) / 2.0f) - centerX2) / r7));
                drawArc(canvas, storyCircle2.borderRect, degrees3, 360.0f - (2.0f * degrees3), false, paint);
                return;
            } else {
                float degrees4 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX + width) + (centerX2 - r7)) / 2.0f) - centerX2) / r7));
                drawArc(canvas, storyCircle2.borderRect, degrees4 + 180.0f, 360.0f - (degrees4 * 2.0f), false, paint);
                return;
            }
        }
        float centerX3 = storyCircle4.borderRect.centerX();
        float width2 = storyCircle4.borderRect.width() / 2.0f;
        float centerX4 = storyCircle2.borderRect.centerX();
        float width3 = storyCircle2.borderRect.width() / 2.0f;
        float centerX5 = storyCircle3.borderRect.centerX();
        float width4 = storyCircle3.borderRect.width() / 2.0f;
        boolean z = centerX3 > centerX4;
        if (z) {
            degrees = Math.toDegrees(Math.acos(Math.abs((((centerX3 - width2) + (centerX4 + width3)) / 2.0f) - centerX4) / width3));
        } else {
            degrees = Math.toDegrees(Math.acos(Math.abs((((centerX3 + width2) + (centerX4 - width3)) / 2.0f) - centerX4) / width3));
        }
        float f = (float) degrees;
        boolean z2 = centerX5 > centerX4;
        if (z2) {
            degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX5 - width4) + (centerX4 + width3)) / 2.0f) - centerX4) / width3));
        } else {
            degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX5 + width4) + (centerX4 - width3)) / 2.0f) - centerX4) / width3));
        }
        float f2 = (float) degrees2;
        if (z && z2) {
            float max = Math.max(f, f2);
            drawArc(canvas, storyCircle2.borderRect, max, 360.0f - (2.0f * max), false, paint);
        } else if (z) {
            drawArc(canvas, storyCircle2.borderRect, f2 + 180.0f, 180.0f - (f + f2), false, paint);
            drawArc(canvas, storyCircle2.borderRect, f, (180.0f - f2) - f, false, paint);
        } else if (z2) {
            drawArc(canvas, storyCircle2.borderRect, f + 180.0f, 180.0f - (f2 + f), false, paint);
            drawArc(canvas, storyCircle2.borderRect, f2, (180.0f - f2) - f, false, paint);
        } else {
            float max2 = Math.max(f, f2);
            drawArc(canvas, storyCircle2.borderRect, max2 + 180.0f, 360.0f - (max2 * 2.0f), false, paint);
        }
    }

    private void lerpCentered(RectF rectF, RectF rectF2, float f, RectF rectF3) {
        float lerp = AndroidUtilities.lerp(rectF.centerX(), rectF2.centerX(), f);
        float lerp2 = AndroidUtilities.lerp(rectF.centerY(), rectF2.centerY(), f);
        float lerp3 = AndroidUtilities.lerp(Math.min(rectF.width(), rectF.height()), Math.min(rectF2.width(), rectF2.height()), f) / 2.0f;
        rectF3.set(lerp - lerp3, lerp2 - lerp3, lerp + lerp3, lerp2 + lerp3);
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

    public class AnonymousClass3 implements StoryViewer.PlaceProvider {
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
                    StoryCircle nearest = profileStoriesView.nearest(i5 >= 0 ? (StoryCircle) profileStoriesView.circles.get(i5) : null, i6 >= 0 ? (StoryCircle) ProfileStoriesView.this.circles.get(i6) : null, storyCircle3);
                    imageReceiver = storyCircle3.imageReceiver;
                    storyCircle2 = nearest;
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
                        ProfileStoriesView.AnonymousClass3.this.lambda$findView$0(rectF, storyCircle, rectF2, storyCircle2, canvas, rectF3, f, z);
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
                float width = rectF3.width() / rectF.width();
                float centerX = rectF3.centerX() - ((rectF.centerX() - rectF2.centerX()) * (((1.0f - f) * 2.0f) + width));
                float centerY = rectF3.centerY();
                float width2 = (rectF2.width() / 2.0f) * width;
                float height = (rectF2.height() / 2.0f) * width;
                storyCircle2.cachedRect.set(centerX - width2, centerY - height, centerX + width2, centerY + height);
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
        boolean z;
        if (this.expandProgress < 0.9f) {
            z = this.rect2.contains(motionEvent.getX(), motionEvent.getY());
        } else {
            z = motionEvent.getX() >= this.left && motionEvent.getX() <= this.right && Math.abs(motionEvent.getY() - this.cy) < ((float) AndroidUtilities.dp(32.0f));
        }
        if (z && motionEvent.getAction() == 0) {
            this.tapTime = System.currentTimeMillis();
            this.tapX = motionEvent.getX();
            this.tapY = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(this.onLongPressRunnable);
            AndroidUtilities.runOnUIThread(this.onLongPressRunnable, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(this.onLongPressRunnable);
            if (z && System.currentTimeMillis() - this.tapTime <= ViewConfiguration.getTapTimeout() && MathUtils.distance(this.tapX, this.tapY, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f) && (this.storiesController.hasUploadingStories(this.dialogId) || this.storiesController.hasStories(this.dialogId) || !this.circles.isEmpty())) {
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
