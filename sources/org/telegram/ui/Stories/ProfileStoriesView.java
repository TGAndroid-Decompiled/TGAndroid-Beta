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
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda103;
import org.telegram.ui.Stars.SuperRipple$$ExternalSyntheticLambda7;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichMediaCell$$ExternalSyntheticLambda1;

public abstract class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    private static final int CIRCLES_MAX = 3;
    public static final String FRAGMENT_TRANSITION_PROPERTY = "fragmentTransitionProgress";
    private float actionBarProgress;
    private boolean attached;
    private final View avatarContainer;
    private final ProfileActivity.AvatarImageView avatarImage;
    private float bounceScale;
    private final ArrayList<StoryCircle> circles;
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
    private boolean lastDrawnStateIsFailed;
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

    public final class AnonymousClass3 implements StoryViewer.PlaceProvider {
        public AnonymousClass3() {
        }

        @Override
        public final boolean findView(long j, int i, int i2, int i3, StoryViewer.TransitionViewHolder transitionViewHolder) {
            ImageReceiver imageReceiver;
            StoryCircle storyCircle;
            StoryCircle storyCircle2;
            transitionViewHolder.avatarImage = null;
            transitionViewHolder.storyImage = null;
            ProfileStoriesView profileStoriesView = ProfileStoriesView.this;
            if (profileStoriesView.expandProgress < 0.2f) {
                transitionViewHolder.avatarImage = profileStoriesView.avatarImage.getImageReceiver();
                transitionViewHolder.storyImage = null;
                transitionViewHolder.view = profileStoriesView.avatarImage;
                transitionViewHolder.clipTop = 0.0f;
                transitionViewHolder.clipBottom = AndroidUtilities.displaySize.y;
                transitionViewHolder.clipParent = (View) profileStoriesView.getParent();
                transitionViewHolder.radialProgressUpload = profileStoriesView.radialProgress;
                transitionViewHolder.checkParentScale = true;
                return true;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= profileStoriesView.circles.size()) {
                    imageReceiver = null;
                    storyCircle = null;
                    storyCircle2 = null;
                    break;
                }
                StoryCircle storyCircle3 = (StoryCircle) profileStoriesView.circles.get(i4);
                if (storyCircle3.scale >= 1.0f && storyCircle3.storyId == i2) {
                    int i5 = i4 - 1;
                    int i6 = i4 - 2;
                    StoryCircle storyCircleAccess$800 = ProfileStoriesView.access$800(profileStoriesView, i5 >= 0 ? (StoryCircle) profileStoriesView.circles.get(i5) : null, i6 >= 0 ? (StoryCircle) profileStoriesView.circles.get(i6) : null, storyCircle3);
                    imageReceiver = storyCircle3.imageReceiver;
                    storyCircle2 = storyCircleAccess$800;
                    storyCircle = storyCircle3;
                    break;
                }
                i4++;
            }
            if (imageReceiver == null) {
                return false;
            }
            transitionViewHolder.storyImage = imageReceiver;
            transitionViewHolder.avatarImage = null;
            transitionViewHolder.view = profileStoriesView;
            transitionViewHolder.clipTop = 0.0f;
            transitionViewHolder.clipBottom = AndroidUtilities.displaySize.y;
            transitionViewHolder.clipParent = (View) profileStoriesView.getParent();
            if (storyCircle == null || storyCircle2 == null) {
                transitionViewHolder.drawClip = null;
                return true;
            }
            transitionViewHolder.drawClip = new StarsController$$ExternalSyntheticLambda103(this, new RectF(storyCircle.cachedRect), storyCircle, new RectF(storyCircle2.cachedRect), storyCircle2);
            return true;
        }

        @Override
        public final void loadNext(boolean z) {
        }

        @Override
        public final void preLayout(long j, int i, Runnable runnable) {
            ProfileStoriesView.this.updateStories(true, false);
            ((StoryViewer$$ExternalSyntheticLambda2) runnable).run();
        }
    }

    public final class StoryCircle {
        public final RectF borderRect;
        public float cachedIndex;
        public float cachedRead;
        public final RectF cachedRect;
        public float cachedScale;
        public final ImageReceiver imageReceiver;
        public int index;
        public final AnimatedFloat indexAnimated;
        public final boolean live;
        public boolean read;
        public final AnimatedFloat readAnimated;
        public float scale;
        public final AnimatedFloat scaleAnimated;
        public final int storyId;

        public StoryCircle(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
            ArrayList<TLRPC.PhotoSize> arrayList;
            TLRPC.Document document;
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            this.index = 0;
            this.read = false;
            this.scale = 1.0f;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.readAnimated = new AnimatedFloat(profileStoriesView, 420L, cubicBezierInterpolator);
            this.indexAnimated = new AnimatedFloat(profileStoriesView, 420L, cubicBezierInterpolator);
            this.scaleAnimated = new AnimatedFloat(profileStoriesView, 420L, cubicBezierInterpolator);
            this.cachedRect = new RectF();
            this.borderRect = new RectF();
            this.storyId = storyItem.id;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
            imageReceiver.setParentView(profileStoriesView);
            this.live = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
            if (profileStoriesView.attached) {
                imageReceiver.onAttachedToWindow();
            }
            GradientTools[] gradientToolsArr = StoriesUtilities.storiesGradientTools;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
                avatarDrawable.setInfo(userOrChat);
                imageReceiver.setForUserOrChat(userOrChat, avatarDrawable);
            } else {
                if (messageMedia != null && (document = messageMedia.document) != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
                    return;
                }
                TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
                if (photo == null || (arrayList = photo.sizes) == null) {
                    imageReceiver.clearImage();
                } else {
                    imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
                }
            }
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
        this.circles = new ArrayList<>();
        this.paint = new Paint(1);
        this.bounceScale = 1.0f;
        this.progressToInsets = 1.0f;
        this.gradientTools = new StoriesUtilities.StoryGradientTools(this);
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
        this.onLongPressRunnable = new ProfileStoriesView$$ExternalSyntheticLambda1(this, 0);
        this.currentAccount = i;
        this.dialogId = j;
        this.isTopic = z;
        this.avatarContainer = view;
        this.avatarImage = avatarImageView;
        avatarImageView.getImageReceiver().setVisibleInvalidate(new ProfileStoriesView$$ExternalSyntheticLambda1(this, 1));
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

    public static StoryCircle access$800(ProfileStoriesView profileStoriesView, StoryCircle storyCircle, StoryCircle storyCircle2, StoryCircle storyCircle3) {
        profileStoriesView.getClass();
        return nearest(storyCircle, storyCircle2, storyCircle3);
    }

    private float getExpandRight() {
        return this.expandRight - (this.expandRightPadAnimated.set(this.expandRightPad) * AndroidUtilities.dp(71.0f));
    }

    public static int lambda$dispatchDraw$2(StoryCircle storyCircle, StoryCircle storyCircle2) {
        return (int) (storyCircle2.cachedIndex - storyCircle.cachedIndex);
    }

    public static StoryCircle nearest(StoryCircle storyCircle, StoryCircle storyCircle2, StoryCircle storyCircle3) {
        if (storyCircle3 == null) {
            return null;
        }
        if (storyCircle == null && storyCircle2 == null) {
            return null;
        }
        if (storyCircle == null || storyCircle2 == null) {
            return storyCircle != null ? storyCircle : storyCircle2;
        }
        RectF rectF = storyCircle.borderRect;
        float f = rectF.left;
        RectF rectF2 = storyCircle3.borderRect;
        float fMin = Math.min(Math.abs(f - rectF2.right), Math.abs(rectF.right - rectF2.left));
        RectF rectF3 = storyCircle2.borderRect;
        return fMin > Math.min(Math.abs(rectF3.left - rectF2.right), Math.abs(rectF3.right - rectF2.left)) ? storyCircle : storyCircle2;
    }

    public final void animateBounce() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.setInterpolator(new OvershootInterpolator());
        RichMediaCell$$ExternalSyntheticLambda1 richMediaCell$$ExternalSyntheticLambda1 = new RichMediaCell$$ExternalSyntheticLambda1(this, 11);
        valueAnimatorOfFloat.addUpdateListener(richMediaCell$$ExternalSyntheticLambda1);
        valueAnimatorOfFloat2.addUpdateListener(richMediaCell$$ExternalSyntheticLambda1);
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationEnd(Animator animator) {
                ProfileStoriesView profileStoriesView = ProfileStoriesView.this;
                profileStoriesView.avatarImage.bounceScale = profileStoriesView.bounceScale = 1.0f;
                profileStoriesView.avatarImage.invalidate();
                profileStoriesView.invalidate();
            }
        });
        animatorSet.start();
    }

    public void animateNewStory() {
        ValueAnimator valueAnimator = this.newStoryBounce;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean[] zArr = {false};
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.newStoryBounce = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SuperRipple$$ExternalSyntheticLambda7(14, this, zArr));
        this.newStoryBounce.addListener(new RichEditor.AnonymousClass1(16, this, zArr));
        zzkk.m(3.0f, this.newStoryBounce);
        this.newStoryBounce.setDuration(400L);
        this.newStoryBounce.setStartDelay(120L);
        this.newStoryBounce.start();
    }

    public final void clipCircle(Canvas canvas, StoryCircle storyCircle, StoryCircle storyCircle2) {
        if (storyCircle2 == null) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        RectF rectF2 = storyCircle2.cachedRect;
        rectF.set(rectF2);
        float f = -(AndroidUtilities.dpf2(1.66f) * storyCircle2.cachedScale);
        rectF.inset(f, f);
        float fCenterX = rectF2.centerX();
        float fWidth = rectF2.width() / 2.0f;
        float fCenterX2 = storyCircle.cachedRect.centerX();
        RectF rectF3 = storyCircle.cachedRect;
        float fWidth2 = rectF3.width() / 2.0f;
        this.clipPath.rewind();
        if (fCenterX > fCenterX2) {
            float degrees = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX2 + fWidth2) + (fCenterX - fWidth)) / 2.0f) - fCenterX2) / fWidth2));
            this.clipPath.arcTo(rectF, 180.0f + degrees, (-degrees) * 2.0f);
            this.clipPath.arcTo(rectF3, degrees, 360.0f - (2.0f * degrees));
        } else {
            float degrees2 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX2 - fWidth2) + (fCenterX + fWidth)) / 2.0f) - fCenterX2) / fWidth2));
            float f2 = 2.0f * degrees2;
            this.clipPath.arcTo(rectF, -degrees2, f2);
            this.clipPath.arcTo(rectF3, 180.0f - degrees2, -(360.0f - f2));
        }
        this.clipPath.close();
        canvas.save();
        canvas.clipPath(this.clipPath);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesUpdated) {
            updateStories(true, true);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        Paint paint;
        float f3;
        float f4;
        float f5;
        StoryCircle storyCircle;
        float fClamp;
        ProfileStoriesView profileStoriesView;
        float f6;
        StoryCircle storyCircle2;
        StoryCircle storyCircle3;
        Paint paint2;
        float f7;
        Paint paint3;
        float size;
        StoriesController.UploadingStory uploadingStory;
        ProfileStoriesView profileStoriesView2 = this;
        Canvas canvas2 = canvas;
        float f8 = profileStoriesView2.rightAnimated.set(profileStoriesView2.right);
        float fClamp2 = Utilities.clamp((profileStoriesView2.avatarContainer.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), fClamp2) * profileStoriesView2.progressToInsets;
        float scaleX = (profileStoriesView2.avatarContainer.getScaleX() * fLerp) + profileStoriesView2.avatarContainer.getX();
        float scaleY = (profileStoriesView2.avatarContainer.getScaleY() * fLerp) + profileStoriesView2.avatarContainer.getY();
        float f9 = fLerp * 2.0f;
        profileStoriesView2.rect1.set(scaleX, scaleY, (profileStoriesView2.avatarContainer.getScaleX() * (profileStoriesView2.avatarContainer.getWidth() - f9)) + scaleX, (profileStoriesView2.avatarContainer.getScaleY() * (profileStoriesView2.avatarContainer.getHeight() - f9)) + scaleY);
        float fMax = profileStoriesView2.left;
        int i = 0;
        while (i < profileStoriesView2.circles.size()) {
            StoryCircle storyCircle4 = profileStoriesView2.circles.get(i);
            float f10 = storyCircle4.scaleAnimated.set(storyCircle4.scale);
            storyCircle4.cachedScale = f10;
            if (f10 > 0.0f || storyCircle4.scale > 0.0f) {
                storyCircle4.cachedIndex = storyCircle4.indexAnimated.set(storyCircle4.index);
                storyCircle4.cachedRead = storyCircle4.readAnimated.set(storyCircle4.read);
                if (i > 0 && profileStoriesView2.circles.get(i - 1).cachedIndex > storyCircle4.cachedIndex) {
                    Collections.sort(profileStoriesView2.circles, new CacheModel$$ExternalSyntheticLambda0(14));
                    break;
                }
            } else {
                storyCircle4.imageReceiver.onDetachedFromWindow();
                profileStoriesView2.circles.remove(i);
                i--;
            }
            i++;
        }
        float fClamp3 = Utilities.clamp(1.0f - (profileStoriesView2.expandProgress / 0.2f), 1.0f, 0.0f);
        boolean zIsLastUploadingFailed = profileStoriesView2.storiesController.isLastUploadingFailed(profileStoriesView2.dialogId);
        boolean zHasUploadingStories = profileStoriesView2.storiesController.hasUploadingStories(profileStoriesView2.dialogId);
        if (!zHasUploadingStories && (uploadingStory = profileStoriesView2.lastUploadingStory) != null && uploadingStory.canceled) {
            profileStoriesView2.progressWasDrawn = false;
            profileStoriesView2.progressIsDone = false;
            profileStoriesView2.progressToUploading.set(false, true);
        }
        float fLerp2 = AndroidUtilities.lerp(0.0f, profileStoriesView2.progressToUploading.set((zHasUploadingStories && !zIsLastUploadingFailed) || (profileStoriesView2.progressWasDrawn && !profileStoriesView2.progressIsDone)), profileStoriesView2.fragmentTransitionProgress);
        canvas2.save();
        float f11 = profileStoriesView2.bounceScale;
        canvas2.scale(f11, f11, profileStoriesView2.rect1.centerX(), profileStoriesView2.rect1.centerY());
        float fLerp3 = AndroidUtilities.lerp(profileStoriesView2.rect1.centerY(), profileStoriesView2.expandY, profileStoriesView2.expandProgress);
        profileStoriesView2.lastUploadingStory = null;
        if (fLerp2 > 0.0f) {
            f = 3.775f;
            f2 = 2.0f;
            profileStoriesView2.rect2.set(profileStoriesView2.rect1);
            profileStoriesView2.rect2.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            Paint paint4 = profileStoriesView2.gradientTools.getPaint(profileStoriesView2.rect2);
            if (profileStoriesView2.radialProgress == null) {
                RadialProgress radialProgress = new RadialProgress(profileStoriesView2);
                profileStoriesView2.radialProgress = radialProgress;
                radialProgress.setBackground(null, true, false);
                profileStoriesView2.radialProgress.setRoundRectProgress(ChatObject.isForum(UserConfig.selectedAccount, profileStoriesView2.dialogId));
            }
            if (!profileStoriesView2.storiesController.hasUploadingStories(profileStoriesView2.dialogId) || profileStoriesView2.storiesController.isLastUploadingFailed(profileStoriesView2.dialogId)) {
                size = 1.0f;
            } else {
                ArrayList arrayList = (ArrayList) profileStoriesView2.storiesController.uploadingStoriesByDialogId.get(profileStoriesView2.dialogId);
                if (arrayList != null) {
                    if (arrayList.size() > 0) {
                        profileStoriesView2.lastUploadingStory = (StoriesController.UploadingStory) arrayList.get(0);
                    }
                    float f12 = 0.0f;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        f12 += ((StoriesController.UploadingStory) arrayList.get(i2)).progress;
                    }
                    size = f12 / arrayList.size();
                } else {
                    size = 0.0f;
                }
            }
            profileStoriesView2.radialProgress.setDiff(0);
            int alpha = paint4.getAlpha();
            paint4.setAlpha((int) (alpha * fClamp3 * fLerp2));
            paint4.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
            profileStoriesView2.radialProgress.setPaint(paint4);
            RadialProgress radialProgress2 = profileStoriesView2.radialProgress;
            RectF rectF = profileStoriesView2.rect2;
            radialProgress2.setProgressRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            profileStoriesView2.radialProgress.setProgress(Utilities.clamp(size, 1.0f, 0.0f), true);
            if (profileStoriesView2.avatarImage.drawAvatar) {
                profileStoriesView2.radialProgress.draw(canvas2);
            }
            paint4.setAlpha(alpha);
            profileStoriesView2.progressWasDrawn = true;
            boolean z = profileStoriesView2.progressIsDone;
            boolean z2 = profileStoriesView2.radialProgress.getAnimatedProgress() >= 0.98f;
            profileStoriesView2.progressIsDone = z2;
            if (z != z2) {
                profileStoriesView2.segmentsCountAnimated.set(profileStoriesView2.count, true);
                profileStoriesView2.segmentsUnreadCountAnimated.set(profileStoriesView2.unreadCount, true);
                profileStoriesView2.animateBounce();
            }
            paint = paint4;
        } else {
            fLerp2 = fLerp2;
            f = 3.775f;
            f2 = 2.0f;
            profileStoriesView2.progressWasDrawn = false;
            paint = null;
        }
        if (fLerp2 < 1.0f) {
            fClamp = (1.0f - fLerp2) * Utilities.clamp(1.0f - (profileStoriesView2.expandProgress / 0.2f), 1.0f, 0.0f);
            float f13 = profileStoriesView2.segmentsCountAnimated.set(profileStoriesView2.count);
            float f14 = profileStoriesView2.segmentsUnreadCountAnimated.set(profileStoriesView2.unreadCount);
            if (zIsLastUploadingFailed) {
                profileStoriesView2.rect2.set(profileStoriesView2.rect1);
                profileStoriesView2.rect2.inset(-AndroidUtilities.dpf2(f), -AndroidUtilities.dpf2(f));
                RectF rectF2 = profileStoriesView2.rect2;
                if (StoriesUtilities.errorGradientTools == null) {
                    GradientTools gradientTools = new GradientTools();
                    StoriesUtilities.errorGradientTools = gradientTools;
                    gradientTools.isDiagonal = true;
                    gradientTools.isRotate = true;
                    int color = Theme.getColor(null, Theme.key_color_orange, false);
                    int color2 = Theme.getColor(null, Theme.key_text_RedBold, false);
                    StoriesUtilities.errorGradientTools.setColors(ColorUtils.blendARGB(0.25f, color, color2), color2);
                    StoriesUtilities.errorGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(f2));
                    StoriesUtilities.errorGradientTools.paint.setStyle(Paint.Style.STROKE);
                    StoriesUtilities.errorGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
                }
                StoriesUtilities.errorGradientTools.setBounds(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
                Paint paint5 = StoriesUtilities.errorGradientTools.paint;
                paint5.setStrokeWidth(AndroidUtilities.dp(f2));
                paint5.setAlpha((int) (fClamp * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, profileStoriesView2.dialogId)) {
                    float fHeight = profileStoriesView2.rect2.height() * 0.32f;
                    canvas2.drawRoundRect(profileStoriesView2.rect2, fHeight, fHeight, paint5);
                } else {
                    canvas2.drawCircle(profileStoriesView2.rect2.centerX(), profileStoriesView2.rect2.centerY(), profileStoriesView2.rect2.width() / f2, paint5);
                }
            } else if ((profileStoriesView2.mainCircle != null || profileStoriesView2.uploadingStoriesCount > 0) && fClamp > 0.0f) {
                profileStoriesView2.rect2.set(profileStoriesView2.rect1);
                f3 = 12.0f;
                profileStoriesView2.rect2.inset(-AndroidUtilities.dpf2(f), -AndroidUtilities.dpf2(f));
                profileStoriesView2.rect3.set(profileStoriesView2.rect1);
                profileStoriesView2.rect3.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                RectF rectF3 = profileStoriesView2.rect2;
                RectF rectF4 = profileStoriesView2.rect3;
                AndroidUtilities.lerp(rectF3, rectF4, fClamp2, rectF4);
                f4 = 255.0f;
                f5 = 1.5f;
                float fLerp4 = AndroidUtilities.lerp(0.0f, (float) ((((double) AndroidUtilities.dpf2(4.23f)) / (((double) profileStoriesView2.rect1.width()) * 3.141592653589793d)) * 360.0d), Utilities.clamp(f13 - 1.0f, 1.0f, 0.0f) * fClamp);
                int iMin = Math.min(profileStoriesView2.count, 50);
                float fMin = Math.min(f13, 50.0f);
                int i3 = iMin > 20 ? 3 : 5;
                if (iMin <= 1) {
                    i3 = 0;
                }
                float fLerp5 = AndroidUtilities.lerp(i3 * 2, fLerp4, fClamp2);
                float fMax2 = (360.0f - (Math.max(0.0f, fMin) * fLerp5)) / Math.max(1.0f, fMin);
                profileStoriesView2.readPaint.setColor(ColorUtils.blendARGB(profileStoriesView2.actionBarProgress, 1526726655, 973078528));
                profileStoriesView2.readPaintAlpha = profileStoriesView2.readPaint.getAlpha();
                float f15 = (-90.0f) - (fLerp5 / f2);
                boolean z3 = false;
                for (int i4 = 0; i4 < iMin; i4++) {
                    if (i4 < profileStoriesView2.circles.size() && profileStoriesView2.circles.get(i4).live) {
                        z3 = true;
                    }
                }
                if (z3) {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(profileStoriesView2.rect3);
                    rectF5.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                    canvas2.saveLayerAlpha(rectF5, 255, 31);
                    float fM = ImageReceiver$$ExternalSyntheticOutline0.m(profileStoriesView2.newStoryBounceT, 1.0f, 2.5f, 1.0f);
                    if (fM != 1.0f) {
                        canvas2.save();
                        canvas2.scale(fM, fM, profileStoriesView2.rect2.centerX(), profileStoriesView2.rect2.centerY());
                    }
                    int alpha2 = profileStoriesView2.livePaint.getAlpha();
                    profileStoriesView2.livePaint.setAlpha((int) (alpha2 * fClamp));
                    rectF5.set(profileStoriesView2.rect3);
                    rectF5.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                    profileStoriesView2.livePaint.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
                    storyCircle = null;
                    profileStoriesView2.drawArc(canvas2, profileStoriesView2.rect3, 0.0f, 360.0f, profileStoriesView2.livePaint);
                    profileStoriesView2.livePaint.setAlpha(alpha2);
                    if (fM != 1.0f) {
                        canvas2.restore();
                    }
                } else {
                    storyCircle = null;
                    Paint paint6 = paint;
                    int i5 = 0;
                    while (i5 < iMin) {
                        float f16 = i5;
                        float f17 = f15;
                        Paint paint7 = paint6;
                        float fClamp4 = 1.0f - Utilities.clamp(f14 - f16, 1.0f, 0.0f);
                        float fClamp5 = 1.0f - Utilities.clamp((iMin - fMin) - f16, 1.0f, 0.0f);
                        if (fClamp5 < 0.0f) {
                            i5 = i5;
                            f15 = f17;
                            fMax2 = fMax2;
                        } else {
                            float fM2 = i5 == 0 ? ImageReceiver$$ExternalSyntheticOutline0.m(profileStoriesView2.newStoryBounceT, 1.0f, 2.5f, 1.0f) : 1.0f;
                            if (fM2 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(fM2, fM2, profileStoriesView2.rect2.centerX(), profileStoriesView2.rect2.centerY());
                            }
                            boolean z4 = i5 < profileStoriesView2.circles.size() && profileStoriesView2.circles.get(i5).live;
                            if (fClamp4 < 1.0f) {
                                if (z4) {
                                    paint3 = profileStoriesView2.livePaint;
                                } else {
                                    paint3 = profileStoriesView2.gradientTools.getPaint(profileStoriesView2.rect2);
                                    paint7 = paint3;
                                }
                                int alpha3 = paint3.getAlpha();
                                paint3.setAlpha((int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, fClamp4, alpha3, fClamp));
                                paint3.setStrokeWidth(AndroidUtilities.dpf2(z4 ? 3.0f : 2.33f));
                                f7 = f17;
                                profileStoriesView2.drawArc(canvas, profileStoriesView2.rect2, f7, (-fMax2) * fClamp5, paint3);
                                paint3.setAlpha(alpha3);
                            } else {
                                f7 = f17;
                            }
                            if (fClamp4 > 0.0f) {
                                Paint paint8 = z4 != 0 ? profileStoriesView2.livePaint : profileStoriesView2.readPaint;
                                int alpha4 = paint8.getAlpha();
                                paint8.setAlpha((int) (alpha4 * fClamp4 * fClamp));
                                paint8.setStrokeWidth(AndroidUtilities.dpf2(z4 ? 3.0f : 1.5f));
                                canvas2 = canvas;
                                profileStoriesView2.drawArc(canvas2, profileStoriesView2.rect3, f7, (-fMax2) * fClamp5, paint8);
                                paint8.setAlpha(alpha4);
                            } else {
                                canvas2 = canvas;
                            }
                            if (fM2 != 1.0f) {
                                canvas2.restore();
                            }
                            f15 = f7 - ((fClamp5 * fLerp5) + (fMax2 * fClamp5));
                        }
                        paint6 = paint7;
                        float f18 = fMax2;
                        i5++;
                        fMax2 = f18;
                    }
                    paint = paint6;
                }
                if (z3) {
                    StoriesUtilities.drawLive(canvas2, profileStoriesView2.rect3, fClamp, profileStoriesView2.avatarImage.getImageReceiver().getVisible(), profileStoriesView2.fragmentTransitionProgress);
                    canvas2.restore();
                }
            }
            f3 = 12.0f;
            f4 = 255.0f;
            f5 = 1.5f;
            storyCircle = null;
        } else {
            f3 = 12.0f;
            f4 = 255.0f;
            f5 = 1.5f;
            storyCircle = null;
            fClamp = fClamp3;
        }
        profileStoriesView2.getExpandRight();
        float f19 = 18.0f;
        if (profileStoriesView2.expandProgress <= 0.0f || fClamp >= 1.0f) {
            profileStoriesView = profileStoriesView2;
            f6 = 18.0f;
        } else {
            profileStoriesView2.w = 0.0f;
            for (int i6 = 0; i6 < profileStoriesView2.circles.size(); i6++) {
                profileStoriesView2.w = (AndroidUtilities.dp(14.0f) * profileStoriesView2.circles.get(i6).cachedScale) + profileStoriesView2.w;
            }
            float fDp = 0.0f;
            int i7 = 0;
            while (i7 < profileStoriesView2.circles.size()) {
                StoryCircle storyCircle5 = profileStoriesView2.circles.get(i7);
                float f20 = storyCircle5.cachedScale;
                float f21 = storyCircle5.cachedRead;
                float fDp2 = (AndroidUtilities.dp(28.0f) / f2) * f20;
                float f22 = profileStoriesView2.left + fDp2 + fDp;
                fDp += AndroidUtilities.dp(f19) * f20;
                float f23 = f22 + fDp2;
                fMax = Math.max(fMax, f23);
                profileStoriesView2.rect2.set(f22 - fDp2, fLerp3 - fDp2, f23, fDp2 + fLerp3);
                RectF rectF6 = profileStoriesView2.rect1;
                RectF rectF7 = profileStoriesView2.rect2;
                float f24 = profileStoriesView2.expandProgress;
                RectF rectF8 = profileStoriesView2.rect3;
                float fLerp6 = AndroidUtilities.lerp(rectF6.centerX(), rectF7.centerX(), f24);
                float fLerp7 = AndroidUtilities.lerp(rectF6.centerY(), rectF7.centerY(), f24);
                float fLerp8 = AndroidUtilities.lerp(Math.min(rectF6.width(), rectF6.height()), Math.min(rectF7.width(), rectF7.height()), f24) / f2;
                rectF8.set(fLerp6 - fLerp8, fLerp7 - fLerp8, fLerp6 + fLerp8, fLerp7 + fLerp8);
                storyCircle5.cachedRect.set(profileStoriesView2.rect3);
                RectF rectF9 = storyCircle5.borderRect;
                rectF9.set(profileStoriesView2.rect3);
                float f25 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), profileStoriesView2.expandProgress), f21 * profileStoriesView2.expandProgress)) * f20;
                rectF9.inset(f25, f25);
                i7++;
                f19 = 18.0f;
            }
            f6 = 18.0f;
            profileStoriesView2.readPaint.setColor(ColorUtils.blendARGB(profileStoriesView2.expandProgress, 1526726655, -2135178036));
            profileStoriesView2.readPaintAlpha = profileStoriesView2.readPaint.getAlpha();
            Paint paint9 = profileStoriesView2.gradientTools.getPaint(profileStoriesView2.rect2);
            paint9.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(f5), profileStoriesView2.expandProgress));
            profileStoriesView2.readPaint.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f5), profileStoriesView2.expandProgress));
            profileStoriesView2.livePaint.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f5), profileStoriesView2.expandProgress));
            int i8 = 0;
            while (i8 < profileStoriesView2.circles.size()) {
                StoryCircle storyCircle6 = profileStoriesView2.circles.get(i8);
                int i9 = i8 - 2;
                int i10 = i8 - 1;
                StoryCircle storyCircleNearest = nearest(i9 >= 0 ? profileStoriesView2.circles.get(i9) : storyCircle, i10 >= 0 ? profileStoriesView2.circles.get(i10) : storyCircle, storyCircle6);
                int i11 = i8 + 1;
                int i12 = i8 + 2;
                StoryCircle storyCircleNearest2 = nearest(i11 < profileStoriesView2.circles.size() ? profileStoriesView2.circles.get(i11) : storyCircle, i12 < profileStoriesView2.circles.size() ? profileStoriesView2.circles.get(i12) : storyCircle, storyCircle6);
                if (storyCircleNearest != null) {
                    RectF rectF10 = storyCircleNearest.borderRect;
                    float fAbs = Math.abs(rectF10.centerX() - storyCircle6.borderRect.centerX());
                    RectF rectF11 = storyCircle6.borderRect;
                    if (fAbs < Math.abs((rectF11.width() / f2) - (rectF10.width() / f2))) {
                        storyCircleNearest = storyCircle;
                    } else if (Math.abs(rectF10.centerX() - rectF11.centerX()) > (rectF11.width() / f2) + (rectF10.width() / f2)) {
                        storyCircleNearest = storyCircle;
                    }
                }
                if (storyCircleNearest2 != null) {
                    RectF rectF12 = storyCircleNearest2.borderRect;
                    float fAbs2 = Math.abs(rectF12.centerX() - storyCircle6.borderRect.centerX());
                    RectF rectF13 = storyCircle6.borderRect;
                    if (fAbs2 >= Math.abs((rectF13.width() / f2) - (rectF12.width() / f2))) {
                        if (Math.abs(rectF12.centerX() - rectF13.centerX()) <= (rectF13.width() / f2) + (rectF12.width() / f2)) {
                            storyCircle2 = storyCircleNearest2;
                        }
                    }
                    storyCircle2 = storyCircle;
                } else {
                    storyCircle2 = storyCircleNearest2;
                }
                if (storyCircle6.cachedRead < 1.0f) {
                    int alpha5 = paint9.getAlpha();
                    paint9.setAlpha((int) ((1.0f - fClamp) * (1.0f - storyCircle6.cachedRead) * alpha5 * storyCircle6.cachedScale));
                    storyCircle3 = storyCircleNearest;
                    profileStoriesView2.drawArcs(canvas, storyCircle3, storyCircle6, storyCircle2, paint9);
                    paint2 = paint9;
                    paint2.setAlpha(alpha5);
                } else {
                    storyCircle3 = storyCircleNearest;
                    paint2 = paint9;
                }
                if (storyCircle6.cachedRead > 0.0f) {
                    Paint paint10 = storyCircle6.live ? profileStoriesView2.livePaint : profileStoriesView2.readPaint;
                    int alpha6 = paint10.getAlpha();
                    paint10.setAlpha((int) ((1.0f - fClamp) * alpha6 * storyCircle6.cachedScale * storyCircle6.cachedRead));
                    profileStoriesView2.drawArcs(canvas, storyCircle3, storyCircle6, storyCircle2, paint10);
                    paint10.setAlpha(alpha6);
                }
                paint9 = paint2;
                profileStoriesView2 = profileStoriesView2;
                i8 = i11;
            }
            profileStoriesView = profileStoriesView2;
            Paint paint11 = paint9;
            canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView.getWidth(), profileStoriesView.getHeight(), (int) ((1.0f - fClamp) * profileStoriesView.expandProgress * f4), 31);
            canvas2 = canvas;
            for (int size2 = profileStoriesView.circles.size() - 1; size2 >= 0; size2--) {
                StoryCircle storyCircle7 = profileStoriesView.circles.get(size2);
                if (storyCircle7.imageReceiver.getVisible()) {
                    int saveCount = canvas2.getSaveCount();
                    int i13 = size2 - 1;
                    StoryCircle storyCircle8 = i13 >= 0 ? profileStoriesView.circles.get(i13) : storyCircle;
                    int i14 = size2 - 2;
                    profileStoriesView.clipCircle(canvas2, storyCircle7, nearest(storyCircle8, i14 >= 0 ? profileStoriesView.circles.get(i14) : storyCircle, storyCircle7));
                    ImageReceiver imageReceiver = storyCircle7.imageReceiver;
                    imageReceiver.setImageCoords(storyCircle7.cachedRect);
                    imageReceiver.draw(canvas2);
                    canvas2.restoreToCount(saveCount);
                }
            }
            canvas2.restore();
            paint = paint11;
        }
        if (paint != null) {
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
        }
        canvas2.restore();
        float fMax3 = Math.max(0.0f, (profileStoriesView.expandProgress - 0.5f) * f2);
        if (fMax3 > 0.0f) {
            float fLerp9 = AndroidUtilities.lerp(profileStoriesView.rect1.right + AndroidUtilities.dp(16.0f), fMax + AndroidUtilities.dp(f3), profileStoriesView.expandProgress);
            float fLerp10 = AndroidUtilities.lerp(profileStoriesView.getWidth(), f8, profileStoriesView.expandProgress);
            float fLerp11 = AndroidUtilities.lerp(profileStoriesView.rect1.centerY(), profileStoriesView.cy, profileStoriesView.expandProgress);
            profileStoriesView.titleDrawable.setBounds((int) fLerp9, (int) (fLerp11 - AndroidUtilities.dp(f6)), (int) fLerp10, (int) (fLerp11 + AndroidUtilities.dp(f6)));
            profileStoriesView.titleDrawable.setAlpha((int) (fMax3 * f4));
            profileStoriesView.titleDrawable.draw(canvas2);
        }
    }

    public final void drawArc(Canvas canvas, RectF rectF, float f, float f2, Paint paint) {
        if (!ChatObject.isForum(UserConfig.selectedAccount, this.dialogId)) {
            canvas.drawArc(rectF, f, f2, false, paint);
            return;
        }
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
    }

    public final void drawArcs(Canvas canvas, StoryCircle storyCircle, StoryCircle storyCircle2, StoryCircle storyCircle3, Paint paint) {
        double degrees;
        StoryCircle storyCircle4 = storyCircle;
        if (storyCircle4 == null && storyCircle3 == null) {
            drawArc(canvas, storyCircle2.borderRect, 0.0f, 360.0f, paint);
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
            RectF rectF = storyCircle2.borderRect;
            float fWidth2 = rectF.width() / 2.0f;
            if (Math.abs(fCenterX - fCenterX2) > fWidth + fWidth2) {
                drawArc(canvas, rectF, 0.0f, 360.0f, paint);
                return;
            } else if (fCenterX > fCenterX2) {
                float degrees2 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX2 + fWidth2) + (fCenterX - fWidth)) / 2.0f) - fCenterX2) / fWidth2));
                drawArc(canvas, rectF, degrees2, 360.0f - (2.0f * degrees2), paint);
                return;
            } else {
                float degrees3 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX2 - fWidth2) + (fCenterX + fWidth)) / 2.0f) - fCenterX2) / fWidth2));
                drawArc(canvas, rectF, degrees3 + 180.0f, 360.0f - (degrees3 * 2.0f), paint);
                return;
            }
        }
        RectF rectF2 = storyCircle4.borderRect;
        float fCenterX3 = rectF2.centerX();
        float fWidth3 = rectF2.width() / 2.0f;
        float fCenterX4 = storyCircle2.borderRect.centerX();
        RectF rectF3 = storyCircle2.borderRect;
        float fWidth4 = rectF3.width() / 2.0f;
        RectF rectF4 = storyCircle3.borderRect;
        float fCenterX5 = rectF4.centerX();
        float fWidth5 = rectF4.width() / 2.0f;
        boolean z = fCenterX3 > fCenterX4;
        if (z) {
            degrees = Math.toDegrees(Math.acos(Math.abs((((fCenterX4 + fWidth4) + (fCenterX3 - fWidth3)) / 2.0f) - fCenterX4) / fWidth4));
        } else {
            degrees = Math.toDegrees(Math.acos(Math.abs((((fCenterX4 - fWidth4) + (fCenterX3 + fWidth3)) / 2.0f) - fCenterX4) / fWidth4));
        }
        float f = (float) degrees;
        boolean z2 = fCenterX5 > fCenterX4;
        float degrees4 = (float) (z2 ? Math.toDegrees(Math.acos(Math.abs((((fCenterX4 + fWidth4) + (fCenterX5 - fWidth5)) / 2.0f) - fCenterX4) / fWidth4)) : Math.toDegrees(Math.acos(Math.abs((((fCenterX4 - fWidth4) + (fCenterX5 + fWidth5)) / 2.0f) - fCenterX4) / fWidth4)));
        if (z && z2) {
            float fMax = Math.max(f, degrees4);
            drawArc(canvas, rectF3, fMax, 360.0f - (2.0f * fMax), paint);
        } else if (z) {
            drawArc(canvas, rectF3, degrees4 + 180.0f, 180.0f - (f + degrees4), paint);
            drawArc(canvas, rectF3, f, (180.0f - degrees4) - f, paint);
        } else if (z2) {
            drawArc(canvas, rectF3, f + 180.0f, 180.0f - (degrees4 + f), paint);
            drawArc(canvas, rectF3, degrees4, (180.0f - degrees4) - f, paint);
        } else {
            float fMax2 = Math.max(f, degrees4);
            drawArc(canvas, rectF3, fMax2 + 180.0f, 360.0f - (fMax2 * 2.0f), paint);
        }
    }

    public float getFragmentTransitionProgress() {
        return this.fragmentTransitionProgress;
    }

    public boolean isEmpty() {
        return this.circles.isEmpty();
    }

    public final void lambda$animateBounce$3(ValueAnimator valueAnimator) {
        ProfileActivity.AvatarImageView avatarImageView = this.avatarImage;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.bounceScale = fFloatValue;
        avatarImageView.bounceScale = fFloatValue;
        this.avatarImage.invalidate();
        invalidate();
    }

    public final void lambda$animateNewStory$1(boolean[] zArr, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!zArr[0] && fFloatValue > 0.2f) {
            zArr[0] = true;
            vibrateNewStory();
        }
        this.newStoryBounceT = Math.max(1.0f, fFloatValue);
        invalidate();
    }

    public final void lambda$vibrateNewStory$0() {
        AndroidUtilities.vibrateCursor(this);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        for (int i = 0; i < this.circles.size(); i++) {
            this.circles.get(i).imageReceiver.onAttachedToWindow();
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        for (int i = 0; i < this.circles.size(); i++) {
            this.circles.get(i).imageReceiver.onDetachedFromWindow();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public abstract void lambda$new$4$3();

    public abstract void onTap(StoryViewer.PlaceProvider placeProvider);

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

    public void setActionBarActionMode(float f) {
        if (Theme.currentTheme.isDark()) {
            return;
        }
        this.actionBarProgress = f;
        invalidate();
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

    public void setExpandProgress(float f) {
        if (this.expandProgress != f) {
            this.expandProgress = f;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f) {
        if (this.fragmentTransitionProgress == f) {
            return;
        }
        this.fragmentTransitionProgress = f;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f) {
        if (this.progressToInsets == f) {
            return;
        }
        this.progressToInsets = f;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        this.peerStories = peerStories;
        updateStories(true, false);
    }

    public void update() {
        updateStories(true, true);
    }

    public void updateColors() {
    }

    public final void updateStories(boolean z, boolean z2) {
        ArrayList<TL_stories.StoryItem> arrayList;
        boolean z3;
        int i;
        int i2;
        StoriesUtilities.StoryGradientTools storyGradientTools;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        TLRPC.PeerColor peerColor;
        StoriesUtilities.StoryGradientTools storyGradientTools2;
        MessagesController.PeerColors peerColors2;
        MessagesController.PeerColor color2;
        TLRPC.PeerColor peerColor2;
        TL_stories.StoryItem storyItem;
        int i3;
        if (this.isTopic) {
            return;
        }
        boolean z4 = this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        TL_stories.PeerStories storiesFromFullPeer = MessagesController.getInstance(this.currentAccount).getStoriesController().getStoriesFromFullPeer(this.dialogId);
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) MessagesController.getInstance(this.currentAccount).getStoriesController().allStoriesMap.get(this.dialogId);
        TL_stories.PeerStories peerStories2 = this.dialogId == 0 ? null : storiesFromFullPeer;
        int iMax = storiesFromFullPeer != null ? Math.max(0, storiesFromFullPeer.max_read_id) : 0;
        if (peerStories != null) {
            iMax = Math.max(iMax, peerStories.max_read_id);
        }
        if (peerStories2 == null || (arrayList = peerStories2.stories) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList();
        int i4 = this.unreadCount;
        this.unreadCount = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            TL_stories.StoryItem storyItem2 = arrayList.get(i6);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                if (storyItem2.id > iMax) {
                    this.unreadCount++;
                }
                i5++;
            }
        }
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                z3 = z4;
                i = 3;
                break;
            }
            TL_stories.StoryItem storyItem3 = arrayList.get(i7);
            if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                z3 = z4;
            } else {
                if (storyItem3 instanceof TL_stories.TL_storyItemSkipped) {
                    int i8 = storyItem3.id;
                    z3 = z4;
                    if (peerStories != null) {
                        for (int i9 = 0; i9 < peerStories.stories.size(); i9++) {
                            if (peerStories.stories.get(i9).id == i8) {
                                storyItem3 = peerStories.stories.get(i9);
                                break;
                            }
                        }
                    }
                    boolean z5 = storyItem3 instanceof TL_stories.TL_storyItemSkipped;
                    if (z5) {
                        if (storiesFromFullPeer != null) {
                            for (int i10 = 0; i10 < storiesFromFullPeer.stories.size(); i10++) {
                                if (storiesFromFullPeer.stories.get(i10).id == i8) {
                                    storiesFromFullPeer.stories.get(i10);
                                    break;
                                }
                            }
                        }
                    } else if (z5) {
                        continue;
                    }
                } else {
                    z3 = z4;
                }
                int i11 = storyItem3.expire_date;
                if ((i11 == 0 || currentTime <= i11) && (z3 || storyItem3.id > iMax)) {
                    arrayList2.add(storyItem3);
                    i = 3;
                    if (arrayList2.size() >= 3) {
                        break;
                    }
                }
            }
            i7++;
            z4 = z3;
        }
        if (arrayList2.size() < i) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TL_stories.StoryItem storyItem4 = arrayList.get(i12);
                if (storyItem4 instanceof TL_stories.TL_storyItemSkipped) {
                    int i13 = storyItem4.id;
                    if (peerStories != null) {
                        for (int i14 = 0; i14 < peerStories.stories.size(); i14++) {
                            if (peerStories.stories.get(i14).id == i13) {
                                storyItem4 = peerStories.stories.get(i14);
                                break;
                            }
                        }
                    }
                    boolean z6 = storyItem4 instanceof TL_stories.TL_storyItemSkipped;
                    if (!z6) {
                        if (z6) {
                            break;
                        }
                        if (!(storyItem4 instanceof TL_stories.TL_storyItemDeleted) && (((i3 = storyItem4.expire_date) == 0 || currentTime <= i3) && !arrayList2.contains(storyItem4))) {
                            arrayList2.add(storyItem4);
                            if (arrayList2.size() >= 3) {
                                break;
                            }
                        }
                    } else if (storiesFromFullPeer != null) {
                        for (int i15 = 0; i15 < storiesFromFullPeer.stories.size(); i15++) {
                            if (storiesFromFullPeer.stories.get(i15).id == i13) {
                                storiesFromFullPeer.stories.get(i15);
                                break;
                            }
                        }
                    }
                } else if (!(storyItem4 instanceof TL_stories.TL_storyItemDeleted)) {
                    arrayList2.add(storyItem4);
                    if (arrayList2.size() >= 3) {
                        break;
                        break;
                    }
                }
            }
        }
        int i16 = 0;
        while (true) {
            i2 = -1;
            if (i16 >= this.circles.size()) {
                break;
            }
            StoryCircle storyCircle = this.circles.get(i16);
            int i17 = 0;
            while (true) {
                if (i17 >= arrayList2.size()) {
                    i17 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList2.get(i17);
                    if (storyItem.id == storyCircle.storyId) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (i17 == -1) {
                storyCircle.scale = 0.0f;
            } else {
                storyCircle.index = i17;
                storyCircle.read = z3 || !(peerStories2 == null || storyItem == null || storyItem.id > this.storiesController.getMaxStoriesReadId(this.dialogId));
            }
            if (!z) {
                storyCircle.readAnimated.set(storyCircle.read, true);
                storyCircle.indexAnimated.set(storyCircle.index, true);
                storyCircle.scaleAnimated.set(storyCircle.scale, true);
            }
            i16++;
        }
        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
            TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) arrayList2.get(i18);
            int i19 = 0;
            while (true) {
                if (i19 >= this.circles.size()) {
                    i19 = -1;
                    break;
                } else if (this.circles.get(i19).storyId == storyItem5.id) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 == -1) {
                storyItem5.dialogId = this.dialogId;
                StoryCircle storyCircle2 = new StoryCircle(this, storyItem5);
                storyCircle2.index = i18;
                storyCircle2.scale = 1.0f;
                AnimatedFloat animatedFloat = storyCircle2.scaleAnimated;
                animatedFloat.set(0.0f, true);
                boolean z7 = z3 || (peerStories2 != null && storyItem5.id <= peerStories2.max_read_id);
                storyCircle2.read = z7;
                if (!z) {
                    storyCircle2.readAnimated.set(z7, true);
                    storyCircle2.indexAnimated.set(storyCircle2.index, true);
                    animatedFloat.set(storyCircle2.scale, true);
                }
                this.circles.add(storyCircle2);
            }
        }
        this.mainCircle = null;
        for (int i20 = 0; i20 < this.circles.size(); i20++) {
            StoryCircle storyCircle3 = this.circles.get(i20);
            if (storyCircle3.scale > 0.0f) {
                this.mainCircle = storyCircle3;
                break;
            }
        }
        ArrayList arrayList3 = (ArrayList) this.storiesController.uploadingStoriesByDialogId.get(this.dialogId);
        this.uploadingStoriesCount = arrayList3 == null ? 0 : arrayList3.size();
        int iMax2 = Math.max(arrayList2.size(), i5);
        if (iMax2 == 0 && this.uploadingStoriesCount != 0) {
            iMax2 = 1;
        }
        if (z2 && z) {
            if (iMax2 == this.count + 1 && this.unreadCount == i4 + 1) {
                animateNewStory();
            }
        }
        this.count = iMax2;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.titleDrawable;
        boolean z8 = false;
        String pluralString = iMax2 > 0 ? LocaleController.formatPluralString("Stories", iMax2, new Object[0]) : "";
        if (z && !LocaleController.isRTL) {
            z8 = true;
        }
        animatedTextDrawable.setText(pluralString, z8);
        if (this.dialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.gradientTools.setColor(MessagesController.PeerColor.fromCollectible(emojiStatus), z);
                } else {
                    storyGradientTools2 = this.gradientTools;
                    if (user != null) {
                        storyGradientTools2.getClass();
                        peerColor2 = user.profile_color;
                        if (peerColor2 != null) {
                            i2 = peerColor2.color;
                        }
                    }
                    peerColors2 = MessagesController.getInstance(storyGradientTools2.currentAccount).profilePeerColors;
                    if (peerColors2 == null) {
                        color2 = null;
                    } else {
                        color2 = peerColors2.getColor(i2);
                    }
                    storyGradientTools2.setColor(color2, z);
                }
            } else {
                storyGradientTools2 = this.gradientTools;
                if (user != null) {
                    storyGradientTools2.getClass();
                    peerColor2 = user.profile_color;
                    if (peerColor2 != null) {
                        i2 = peerColor2.color;
                    }
                }
                peerColors2 = MessagesController.getInstance(storyGradientTools2.currentAccount).profilePeerColors;
                if (peerColors2 == null) {
                    color2 = null;
                } else {
                    color2 = peerColors2.getColor(i2);
                }
                storyGradientTools2.setColor(color2, z);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.gradientTools.setColor(MessagesController.PeerColor.fromCollectible(emojiStatus2), z);
                } else {
                    storyGradientTools = this.gradientTools;
                    if (chat != null) {
                        storyGradientTools.getClass();
                        peerColor = chat.profile_color;
                        if (peerColor != null) {
                            i2 = peerColor.color;
                        }
                    }
                    peerColors = MessagesController.getInstance(storyGradientTools.currentAccount).profilePeerColors;
                    if (peerColors == null) {
                        color = null;
                    } else {
                        color = peerColors.getColor(i2);
                    }
                    storyGradientTools.setColor(color, z);
                }
            } else {
                storyGradientTools = this.gradientTools;
                if (chat != null) {
                    storyGradientTools.getClass();
                    peerColor = chat.profile_color;
                    if (peerColor != null) {
                        i2 = peerColor.color;
                    }
                }
                peerColors = MessagesController.getInstance(storyGradientTools.currentAccount).profilePeerColors;
                if (peerColors == null) {
                    color = null;
                } else {
                    color = peerColors.getColor(i2);
                }
                storyGradientTools.setColor(color, z);
            }
        }
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.titleDrawable || super.verifyDrawable(drawable);
    }

    public final void vibrateNewStory() {
        if (SharedConfig.getDevicePerformanceClass() <= 0) {
            return;
        }
        AndroidUtilities.vibrateCursor(this);
        AndroidUtilities.runOnUIThread(new ProfileStoriesView$$ExternalSyntheticLambda1(this, 2), 180L);
    }
}
