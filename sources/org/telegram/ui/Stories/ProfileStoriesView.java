package org.telegram.ui.Stories;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import androidx.core.graphics.ColorUtils;
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
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.QrActivity;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda18;

public abstract class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public float actionBarProgress;
    public boolean attached;
    public final ProfileActivity.AnonymousClass19 avatarContainer;
    public final ProfileActivity.AnonymousClass21 avatarImage;
    public float bounceScale;
    public final ArrayList circles;
    public final Path clipPath;
    public int count;
    public final int currentAccount;
    public float cy;
    public final long dialogId;
    public float expandProgress;
    public float expandRight;
    public boolean expandRightPad;
    public final AnimatedFloat expandRightPadAnimated;
    public float expandY;
    public final Matrix forumRoundRectMatrix;
    public final Path forumRoundRectPath;
    public final PathMeasure forumRoundRectPathMeasure;
    public final Path forumSegmentPath;
    public float fragmentTransitionProgress;
    public final StoriesUtilities.StoryGradientTools gradientTools;
    public final boolean isTopic;
    public StoriesController.UploadingStory lastUploadingStory;
    public float left;
    public final Paint livePaint;
    public StoryCircle mainCircle;
    public ValueAnimator newStoryBounce;
    public float newStoryBounceT;
    public final ProfileStoriesView$$ExternalSyntheticLambda1 onLongPressRunnable;
    public boolean progressIsDone;
    public float progressToInsets;
    public final AnimatedFloat progressToUploading;
    public boolean progressWasDrawn;
    public final PhotoViewer.AnonymousClass49 provider;
    public RadialProgress radialProgress;
    public final Paint readPaint;
    public final RectF rect1;
    public final RectF rect2;
    public final RectF rect3;
    public float right;
    public final AnimatedFloat rightAnimated;
    public final AnimatedFloat segmentsCountAnimated;
    public final AnimatedFloat segmentsUnreadCountAnimated;
    public final StoriesController storiesController;
    public long tapTime;
    public float tapX;
    public float tapY;
    public final AnimatedTextView.AnimatedTextDrawable titleDrawable;
    public int unreadCount;
    public int uploadingStoriesCount;

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
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            this.index = 0;
            this.read = false;
            this.scale = 1.0f;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.readAnimated = new AnimatedFloat(420L, profileStoriesView, cubicBezierInterpolator);
            this.indexAnimated = new AnimatedFloat(420L, profileStoriesView, cubicBezierInterpolator);
            this.scaleAnimated = new AnimatedFloat(420L, profileStoriesView, cubicBezierInterpolator);
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

    public ProfileStoriesView(Context context, int i, long j, boolean z, ProfileActivity.AnonymousClass19 anonymousClass19, ProfileActivity.AnonymousClass21 anonymousClass21, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        Paint paint = new Paint(1);
        this.readPaint = paint;
        Paint paint2 = new Paint(1);
        this.livePaint = paint2;
        Paint paint3 = new Paint(1);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.titleDrawable = animatedTextDrawable;
        Paint paint4 = new Paint(1);
        this.circles = new ArrayList();
        Paint paint5 = new Paint(1);
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
        this.provider = new PhotoViewer.AnonymousClass49((ProfileActivity.AnonymousClass27) this, 12);
        final ProfileActivity.AnonymousClass27 anonymousClass27 = (ProfileActivity.AnonymousClass27) this;
        final int i2 = 0;
        this.onLongPressRunnable = new Runnable() {
            @Override
            public final void run() throws Throwable {
                switch (i2) {
                    case 0:
                        ProfileActivity.this.openAvatar(false);
                        break;
                    default:
                        anonymousClass27.invalidate();
                        break;
                }
            }
        };
        this.currentAccount = i;
        this.dialogId = j;
        this.isTopic = z;
        this.avatarContainer = anonymousClass19;
        this.avatarImage = anonymousClass21;
        final int i3 = 1;
        anonymousClass21.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() throws Throwable {
                switch (i3) {
                    case 0:
                        ProfileActivity.this.openAvatar(false);
                        break;
                    default:
                        anonymousClass27.invalidate();
                        break;
                }
            }
        });
        this.storiesController = MessagesController.getInstance(i).getStoriesController();
        paint.setColor(1526726655);
        paint.getAlpha();
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
        animatedTextDrawable.moveAmplitude = 0.4f;
        animatedTextDrawable.animateDuration = 320L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        Typeface typefaceBold = AndroidUtilities.bold();
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setTypeface(typefaceBold);
        textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        animatedTextDrawable.ellipsizeByGradient = true;
        animatedTextDrawable.invalidateSelf();
        animatedTextDrawable.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        updateStories(false, false);
    }

    private float getExpandRight() {
        return this.expandRight - (this.expandRightPadAnimated.set(this.expandRightPad) * AndroidUtilities.dp(71.0f));
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
        RectF rectF3 = storyCircle.cachedRect;
        float fCenterX2 = rectF3.centerX();
        float fWidth2 = rectF3.width() / 2.0f;
        Path path = this.clipPath;
        path.rewind();
        if (fCenterX > fCenterX2) {
            float degrees = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX2 + fWidth2) + (fCenterX - fWidth)) / 2.0f) - fCenterX2) / fWidth2));
            path.arcTo(rectF, 180.0f + degrees, (-degrees) * 2.0f);
            path.arcTo(rectF3, degrees, 360.0f - (2.0f * degrees));
        } else {
            float degrees2 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX2 - fWidth2) + (fCenterX + fWidth)) / 2.0f) - fCenterX2) / fWidth2));
            float f2 = 2.0f * degrees2;
            path.arcTo(rectF, -degrees2, f2);
            path.arcTo(rectF3, 180.0f - degrees2, -(360.0f - f2));
        }
        path.close();
        canvas.save();
        canvas.clipPath(path);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesUpdated) {
            updateStories(true, true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        float f;
        float f2;
        Paint paint;
        Paint paint2;
        Paint paint3;
        RectF rectF;
        StoriesUtilities.StoryGradientTools storyGradientTools;
        ArrayList arrayList2;
        float f3;
        float f4;
        RectF rectF2;
        float fClamp;
        ProfileStoriesView profileStoriesView;
        float f5;
        float f6;
        StoryCircle storyCircle;
        StoryCircle storyCircle2;
        Paint paint4;
        ProfileStoriesView profileStoriesView2;
        Paint paint5;
        RectF rectF3;
        StoriesUtilities.StoryGradientTools storyGradientTools2;
        RectF rectF4;
        RectF rectF5;
        boolean z;
        float f7;
        StoriesUtilities.StoryGradientTools storyGradientTools3;
        ProfileStoriesView profileStoriesView3;
        RectF rectF6;
        float f8;
        StoriesUtilities.StoryGradientTools storyGradientTools4;
        Paint paint6;
        int i;
        ArrayList arrayList3;
        float size;
        StoriesController.UploadingStory uploadingStory;
        ProfileStoriesView profileStoriesView4 = this;
        Canvas canvas2 = canvas;
        float f9 = profileStoriesView4.rightAnimated.set(profileStoriesView4.right, false);
        ProfileActivity.AnonymousClass19 anonymousClass19 = profileStoriesView4.avatarContainer;
        float fClamp2 = Utilities.clamp((anonymousClass19.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), fClamp2) * profileStoriesView4.progressToInsets;
        float scaleX = (anonymousClass19.getScaleX() * fLerp) + anonymousClass19.getX();
        float scaleY = (anonymousClass19.getScaleY() * fLerp) + anonymousClass19.getY();
        float f10 = fLerp * 2.0f;
        float scaleX2 = anonymousClass19.getScaleX() * (anonymousClass19.getWidth() - f10);
        float scaleY2 = anonymousClass19.getScaleY() * (anonymousClass19.getHeight() - f10);
        RectF rectF7 = profileStoriesView4.rect1;
        rectF7.set(scaleX, scaleY, scaleX2 + scaleX, scaleY2 + scaleY);
        float f11 = profileStoriesView4.left;
        int i2 = 0;
        while (true) {
            arrayList = profileStoriesView4.circles;
            if (i2 >= arrayList.size()) {
                f = 2.0f;
                break;
            }
            StoryCircle storyCircle3 = (StoryCircle) arrayList.get(i2);
            f = 2.0f;
            float f12 = storyCircle3.scaleAnimated.set(storyCircle3.scale, false);
            storyCircle3.cachedScale = f12;
            if (f12 > 0.0f || storyCircle3.scale > 0.0f) {
                storyCircle3.cachedIndex = storyCircle3.indexAnimated.set(storyCircle3.index, false);
                storyCircle3.cachedRead = storyCircle3.readAnimated.set(storyCircle3.read);
                if (i2 > 0 && ((StoryCircle) arrayList.get(i2 - 1)).cachedIndex > storyCircle3.cachedIndex) {
                    Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda3(15));
                    break;
                }
            } else {
                storyCircle3.imageReceiver.onDetachedFromWindow();
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        float fClamp3 = Utilities.clamp(1.0f - (profileStoriesView4.expandProgress / 0.2f), 1.0f, 0.0f);
        StoriesController storiesController = profileStoriesView4.storiesController;
        long j = profileStoriesView4.dialogId;
        boolean zIsLastUploadingFailed = storiesController.isLastUploadingFailed(j);
        boolean zHasUploadingStories = storiesController.hasUploadingStories(j);
        AnimatedFloat animatedFloat = profileStoriesView4.progressToUploading;
        if (!zHasUploadingStories && (uploadingStory = profileStoriesView4.lastUploadingStory) != null && uploadingStory.canceled) {
            profileStoriesView4.progressWasDrawn = false;
            profileStoriesView4.progressIsDone = false;
            animatedFloat.getClass();
            animatedFloat.set(0.0f, true);
        }
        float fLerp2 = AndroidUtilities.lerp(0.0f, animatedFloat.set((zHasUploadingStories && !zIsLastUploadingFailed) || (profileStoriesView4.progressWasDrawn && !profileStoriesView4.progressIsDone)), profileStoriesView4.fragmentTransitionProgress);
        canvas2.save();
        float f13 = profileStoriesView4.bounceScale;
        canvas2.scale(f13, f13, rectF7.centerX(), rectF7.centerY());
        float fLerp3 = AndroidUtilities.lerp(rectF7.centerY(), profileStoriesView4.expandY, profileStoriesView4.expandProgress);
        profileStoriesView4.lastUploadingStory = null;
        RectF rectF8 = profileStoriesView4.rect2;
        AnimatedFloat animatedFloat2 = profileStoriesView4.segmentsUnreadCountAnimated;
        AnimatedFloat animatedFloat3 = profileStoriesView4.segmentsCountAnimated;
        ProfileActivity.AnonymousClass21 anonymousClass21 = profileStoriesView4.avatarImage;
        StoriesUtilities.StoryGradientTools storyGradientTools5 = profileStoriesView4.gradientTools;
        if (fLerp2 > 0.0f) {
            rectF8.set(rectF7);
            f2 = fLerp2;
            rectF8.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
            Paint paint7 = storyGradientTools5.getPaint(rectF8);
            if (profileStoriesView4.radialProgress == null) {
                RadialProgress radialProgress = new RadialProgress(profileStoriesView4);
                profileStoriesView4.radialProgress = radialProgress;
                radialProgress.setBackground(null, true, false);
                profileStoriesView4.radialProgress.roundRectProgress = ChatObject.isForum(UserConfig.selectedAccount, j);
            }
            if (!storiesController.hasUploadingStories(j) || storiesController.isLastUploadingFailed(j)) {
                size = 1.0f;
            } else {
                ArrayList arrayList4 = (ArrayList) storiesController.uploadingStoriesByDialogId.get(j);
                if (arrayList4 != null) {
                    if (arrayList4.size() > 0) {
                        profileStoriesView4.lastUploadingStory = (StoriesController.UploadingStory) arrayList4.get(0);
                    }
                    float f14 = 0.0f;
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        f14 += ((StoriesController.UploadingStory) arrayList4.get(i3)).progress;
                    }
                    size = f14 / arrayList4.size();
                } else {
                    size = 0.0f;
                }
            }
            profileStoriesView4.radialProgress.diff = 0;
            int alpha = paint7.getAlpha();
            paint7.setAlpha((int) (alpha * fClamp3 * f2));
            paint7.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
            RadialProgress radialProgress2 = profileStoriesView4.radialProgress;
            radialProgress2.overridePaint = paint7;
            radialProgress2.setProgressRect((int) rectF8.left, (int) rectF8.top, (int) rectF8.right, (int) rectF8.bottom);
            profileStoriesView4.radialProgress.setProgress(Utilities.clamp(size, 1.0f, 0.0f), true);
            if (anonymousClass21.drawAvatar) {
                profileStoriesView4.radialProgress.draw(canvas2);
            }
            paint7.setAlpha(alpha);
            profileStoriesView4.progressWasDrawn = true;
            boolean z2 = profileStoriesView4.progressIsDone;
            boolean z3 = profileStoriesView4.radialProgress.animatedProgressValue >= 0.98f;
            profileStoriesView4.progressIsDone = z3;
            if (z2 != z3) {
                animatedFloat3.set(profileStoriesView4.count, true);
                animatedFloat2.set(profileStoriesView4.unreadCount, true);
                AnimatorSet animatorSet = new AnimatorSet();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.05f);
                valueAnimatorOfFloat.setDuration(100L);
                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
                valueAnimatorOfFloat2.setDuration(250L);
                valueAnimatorOfFloat2.setInterpolator(new OvershootInterpolator());
                QrActivity$$ExternalSyntheticLambda18 qrActivity$$ExternalSyntheticLambda18 = new QrActivity$$ExternalSyntheticLambda18(profileStoriesView4, 28);
                valueAnimatorOfFloat.addUpdateListener(qrActivity$$ExternalSyntheticLambda18);
                valueAnimatorOfFloat2.addUpdateListener(qrActivity$$ExternalSyntheticLambda18);
                animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                animatorSet.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(profileStoriesView4, 22));
                animatorSet.start();
            }
            paint = paint7;
        } else {
            f2 = fLerp2;
            f9 = f9;
            storyGradientTools5 = storyGradientTools5;
            arrayList = arrayList;
            rectF8 = rectF8;
            profileStoriesView4.progressWasDrawn = false;
            paint = null;
        }
        Paint paint8 = profileStoriesView4.readPaint;
        Paint paint9 = profileStoriesView4.livePaint;
        RectF rectF9 = profileStoriesView4.rect3;
        if (f2 < 1.0f) {
            f4 = 255.0f;
            f3 = 1.5f;
            fClamp = (1.0f - f2) * Utilities.clamp(1.0f - (profileStoriesView4.expandProgress / 0.2f), 1.0f, 0.0f);
            float f15 = animatedFloat3.set(profileStoriesView4.count, false);
            float f16 = animatedFloat2.set(profileStoriesView4.unreadCount, false);
            if (zIsLastUploadingFailed) {
                rectF8.set(rectF7);
                rectF8.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                if (StoriesUtilities.errorGradientTools == null) {
                    GradientTools gradientTools = new GradientTools();
                    StoriesUtilities.errorGradientTools = gradientTools;
                    gradientTools.isDiagonal = true;
                    gradientTools.isRotate = true;
                    int color = Theme.getColor(null, Theme.key_color_orange, false);
                    int color2 = Theme.getColor(null, Theme.key_text_RedBold, false);
                    StoriesUtilities.errorGradientTools.setColors(ColorUtils.blendARGB(0.25f, color, color2), color2, 0, 0);
                    StoriesUtilities.errorGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(f));
                    StoriesUtilities.errorGradientTools.paint.setStyle(Paint.Style.STROKE);
                    StoriesUtilities.errorGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
                }
                GradientTools gradientTools2 = StoriesUtilities.errorGradientTools;
                float f17 = rectF8.left;
                float f18 = rectF8.top;
                float f19 = rectF8.right;
                float f20 = rectF8.bottom;
                gradientTools2.getClass();
                RectF rectF10 = AndroidUtilities.rectTmp;
                rectF10.set(f17, f18, f19, f20);
                gradientTools2.setBounds(rectF10);
                Paint paint10 = StoriesUtilities.errorGradientTools.paint;
                paint10.setStrokeWidth(AndroidUtilities.dp(f));
                paint10.setAlpha((int) (fClamp * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, j)) {
                    float fHeight = rectF8.height() * 0.32f;
                    canvas2.drawRoundRect(rectF8, fHeight, fHeight, paint10);
                } else {
                    canvas2.drawCircle(rectF8.centerX(), rectF8.centerY(), rectF8.width() / f, paint10);
                }
            } else if ((profileStoriesView4.mainCircle != null || profileStoriesView4.uploadingStoriesCount > 0) && fClamp > 0.0f) {
                rectF8.set(rectF7);
                rectF8.inset(-AndroidUtilities.dpf2(3.775f), -AndroidUtilities.dpf2(3.775f));
                rectF9.set(rectF7);
                rectF9.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                AndroidUtilities.lerp(rectF8, rectF9, fClamp2, rectF9);
                float fLerp4 = AndroidUtilities.lerp(0.0f, (float) ((((double) AndroidUtilities.dpf2(4.23f)) / (((double) rectF7.width()) * 3.141592653589793d)) * 360.0d), Utilities.clamp(f15 - 1.0f, 1.0f, 0.0f) * fClamp);
                int iMin = Math.min(profileStoriesView4.count, 50);
                float fMin = Math.min(f15, 50.0f);
                int i4 = iMin > 20 ? 3 : 5;
                if (iMin <= 1) {
                    i4 = 0;
                }
                float fLerp5 = AndroidUtilities.lerp(i4 * 2, fLerp4, fClamp2);
                float fMax = (360.0f - (Math.max(0.0f, fMin) * fLerp5)) / Math.max(1.0f, fMin);
                RectF rectF11 = rectF7;
                paint8.setColor(ColorUtils.blendARGB(profileStoriesView4.actionBarProgress, 1526726655, 973078528));
                paint8.getAlpha();
                float f21 = (-90.0f) - (fLerp5 / f);
                int i5 = 0;
                boolean z4 = false;
                while (i5 < iMin) {
                    float f22 = f21;
                    if (i5 < arrayList.size()) {
                        arrayList3 = arrayList;
                        i = i5;
                        if (((StoryCircle) arrayList3.get(i5)).live) {
                            z4 = true;
                        }
                    } else {
                        i = i5;
                        arrayList3 = arrayList;
                    }
                    i5 = i + 1;
                    arrayList = arrayList3;
                    f21 = f22;
                }
                float f23 = f21;
                ArrayList arrayList5 = arrayList;
                if (z4) {
                    RectF rectF12 = AndroidUtilities.rectTmp;
                    rectF12.set(rectF9);
                    rectF12.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    float fM = ImageReceiver$$ExternalSyntheticOutline0.m(profileStoriesView4.newStoryBounceT, 1.0f, 2.5f, 1.0f);
                    if (fM != 1.0f) {
                        canvas2.save();
                        canvas2.scale(fM, fM, rectF8.centerX(), rectF8.centerY());
                    }
                    int alpha2 = paint9.getAlpha();
                    paint9.setAlpha((int) (alpha2 * fClamp));
                    rectF12.set(rectF9);
                    rectF12.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                    paint9.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
                    profileStoriesView4.drawArc(0.0f, 360.0f, canvas2, paint9, rectF9);
                    profileStoriesView2 = profileStoriesView4;
                    paint5 = paint9;
                    rectF3 = rectF9;
                    paint5.setAlpha(alpha2);
                    if (fM != 1.0f) {
                        canvas2.restore();
                    }
                    storyGradientTools2 = storyGradientTools5;
                    arrayList2 = arrayList5;
                } else {
                    profileStoriesView2 = profileStoriesView4;
                    paint5 = paint9;
                    rectF3 = rectF9;
                    int i6 = 0;
                    while (i6 < iMin) {
                        float f24 = i6;
                        Paint paint11 = paint5;
                        float f25 = f16;
                        float fClamp4 = 1.0f - Utilities.clamp(f16 - f24, 1.0f, 0.0f);
                        Paint paint12 = paint;
                        float fClamp5 = 1.0f - Utilities.clamp((iMin - fMin) - f24, 1.0f, 0.0f);
                        if (fClamp5 < 0.0f) {
                            profileStoriesView3 = profileStoriesView2;
                            f8 = f23;
                            storyGradientTools3 = storyGradientTools5;
                            paint11 = paint11;
                            arrayList5 = arrayList5;
                            fLerp5 = fLerp5;
                            rectF4 = rectF8;
                            rectF5 = rectF11;
                            i6 = i6;
                            rectF6 = rectF3;
                        } else {
                            float fM2 = i6 == 0 ? ImageReceiver$$ExternalSyntheticOutline0.m(profileStoriesView2.newStoryBounceT, 1.0f, 2.5f, 1.0f) : 1.0f;
                            if (fM2 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(fM2, fM2, rectF8.centerX(), rectF8.centerY());
                            }
                            boolean z5 = i6 < arrayList5.size() && ((StoryCircle) arrayList5.get(i6)).live;
                            if (fClamp4 < 1.0f) {
                                if (z5) {
                                    storyGradientTools4 = storyGradientTools5;
                                    paint6 = paint11;
                                } else {
                                    storyGradientTools4 = storyGradientTools5;
                                    paint6 = storyGradientTools4.getPaint(rectF8);
                                    paint12 = paint6;
                                }
                                z = z5;
                                int alpha3 = paint6.getAlpha();
                                Paint paint13 = paint6;
                                paint13.setAlpha((int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, fClamp4, alpha3, fClamp));
                                paint13.setStrokeWidth(AndroidUtilities.dpf2(z ? 3.0f : 2.33f));
                                rectF4 = rectF8;
                                rectF5 = rectF11;
                                f7 = f23;
                                storyGradientTools3 = storyGradientTools4;
                                drawArc(f7, (-fMax) * fClamp5, canvas2, paint13, rectF4);
                                paint13.setAlpha(alpha3);
                            } else {
                                rectF4 = rectF8;
                                rectF5 = rectF11;
                                z = z5;
                                f7 = f23;
                                storyGradientTools3 = storyGradientTools5;
                            }
                            if (fClamp4 > 0.0f) {
                                Paint paint14 = z ? paint11 : paint8;
                                int alpha4 = paint14.getAlpha();
                                paint14.setAlpha((int) (alpha4 * fClamp4 * fClamp));
                                paint14.setStrokeWidth(AndroidUtilities.dpf2(z ? 3.0f : 1.5f));
                                profileStoriesView3 = this;
                                canvas2 = canvas;
                                rectF6 = rectF3;
                                profileStoriesView3.drawArc(f7, (-fMax) * fClamp5, canvas2, paint14, rectF6);
                                paint14.setAlpha(alpha4);
                            } else {
                                profileStoriesView3 = this;
                                canvas2 = canvas;
                                rectF6 = rectF3;
                            }
                            if (fM2 != 1.0f) {
                                canvas2.restore();
                            }
                            f8 = f7 - ((fLerp5 * fClamp5) + (fMax * fClamp5));
                        }
                        int i7 = i6 + 1;
                        rectF3 = rectF6;
                        rectF11 = rectF5;
                        rectF8 = rectF4;
                        arrayList5 = arrayList5;
                        fLerp5 = fLerp5;
                        f16 = f25;
                        i6 = i7;
                        storyGradientTools5 = storyGradientTools3;
                        profileStoriesView2 = profileStoriesView3;
                        f23 = f8;
                        paint5 = paint11;
                        paint = paint12;
                    }
                    storyGradientTools2 = storyGradientTools5;
                    arrayList2 = arrayList5;
                }
                rectF = rectF8;
                Paint paint15 = paint;
                rectF2 = rectF11;
                rectF9 = rectF3;
                paint2 = paint5;
                profileStoriesView4 = profileStoriesView2;
                if (z4) {
                    StoriesUtilities.drawLive(canvas2, rectF9, fClamp, anonymousClass21.getImageReceiver().getVisible(), profileStoriesView4.fragmentTransitionProgress);
                    canvas2.restore();
                }
                storyGradientTools = storyGradientTools2;
                paint3 = paint15;
            }
            Paint paint16 = paint;
            paint2 = paint9;
            paint3 = paint16;
            rectF = rectF8;
            storyGradientTools = storyGradientTools5;
            arrayList2 = arrayList;
            rectF2 = rectF7;
        } else {
            Paint paint17 = paint;
            paint2 = paint9;
            paint3 = paint17;
            rectF = rectF8;
            storyGradientTools = storyGradientTools5;
            arrayList2 = arrayList;
            f3 = 1.5f;
            f4 = 255.0f;
            rectF2 = rectF7;
            fClamp = fClamp3;
        }
        profileStoriesView4.getExpandRight();
        if (profileStoriesView4.expandProgress <= 0.0f || fClamp >= 1.0f) {
            profileStoriesView = profileStoriesView4;
            f5 = 18.0f;
            f6 = f11;
        } else {
            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                float f26 = ((StoryCircle) arrayList2.get(i8)).cachedScale;
                AndroidUtilities.dp(14.0f);
            }
            ArrayList arrayList6 = arrayList2;
            float fMax2 = f11;
            int i9 = 0;
            float f27 = 0.0f;
            while (i9 < arrayList6.size()) {
                StoryCircle storyCircle4 = (StoryCircle) arrayList6.get(i9);
                float f28 = storyCircle4.cachedScale;
                float f29 = storyCircle4.cachedRead;
                int i10 = i9;
                float fDp = (AndroidUtilities.dp(28.0f) / f) * f28;
                float f30 = profileStoriesView4.left + fDp + f27;
                float fDp2 = f27 + (AndroidUtilities.dp(18.0f) * f28);
                float f31 = f30 + fDp;
                fMax2 = Math.max(fMax2, f31);
                rectF.set(f30 - fDp, fLerp3 - fDp, f31, fLerp3 + fDp);
                float f32 = profileStoriesView4.expandProgress;
                float fLerp6 = AndroidUtilities.lerp(rectF2.centerX(), rectF.centerX(), f32);
                float fLerp7 = AndroidUtilities.lerp(rectF2.centerY(), rectF.centerY(), f32);
                float fLerp8 = AndroidUtilities.lerp(Math.min(rectF2.width(), rectF2.height()), Math.min(rectF.width(), rectF.height()), f32) / f;
                rectF9.set(fLerp6 - fLerp8, fLerp7 - fLerp8, fLerp6 + fLerp8, fLerp7 + fLerp8);
                storyCircle4.cachedRect.set(rectF9);
                RectF rectF13 = storyCircle4.borderRect;
                rectF13.set(rectF9);
                float f33 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), profileStoriesView4.expandProgress), f29 * profileStoriesView4.expandProgress)) * f28;
                rectF13.inset(f33, f33);
                i9 = i10 + 1;
                f27 = fDp2;
            }
            f5 = 18.0f;
            paint8.setColor(ColorUtils.blendARGB(profileStoriesView4.expandProgress, 1526726655, -2135178036));
            paint8.getAlpha();
            Paint paint18 = storyGradientTools.getPaint(rectF);
            paint18.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(f3), profileStoriesView4.expandProgress));
            paint8.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f3), profileStoriesView4.expandProgress));
            paint2.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f3), profileStoriesView4.expandProgress));
            int i11 = 0;
            while (i11 < arrayList6.size()) {
                StoryCircle storyCircle5 = (StoryCircle) arrayList6.get(i11);
                int i12 = i11 - 2;
                StoryCircle storyCircle6 = i12 >= 0 ? (StoryCircle) arrayList6.get(i12) : null;
                int i13 = i11 - 1;
                StoryCircle storyCircleNearest = nearest(storyCircle6, i13 >= 0 ? (StoryCircle) arrayList6.get(i13) : null, storyCircle5);
                int i14 = i11 + 1;
                int i15 = i11 + 2;
                StoryCircle storyCircleNearest2 = nearest(i14 < arrayList6.size() ? (StoryCircle) arrayList6.get(i14) : null, i15 < arrayList6.size() ? (StoryCircle) arrayList6.get(i15) : null, storyCircle5);
                if (storyCircleNearest != null) {
                    RectF rectF14 = storyCircleNearest.borderRect;
                    float fAbs = Math.abs(rectF14.centerX() - storyCircle5.borderRect.centerX());
                    RectF rectF15 = storyCircle5.borderRect;
                    if (fAbs < Math.abs((rectF15.width() / f) - (rectF14.width() / f)) || Math.abs(rectF14.centerX() - rectF15.centerX()) > (rectF15.width() / f) + (rectF14.width() / f)) {
                        storyCircle = null;
                    } else {
                        storyCircle = storyCircleNearest;
                    }
                } else {
                    storyCircle = storyCircleNearest;
                }
                if (storyCircleNearest2 != null) {
                    RectF rectF16 = storyCircleNearest2.borderRect;
                    float fAbs2 = Math.abs(rectF16.centerX() - storyCircle5.borderRect.centerX());
                    RectF rectF17 = storyCircle5.borderRect;
                    if (fAbs2 < Math.abs((rectF17.width() / f) - (rectF16.width() / f)) || Math.abs(rectF16.centerX() - rectF17.centerX()) > (rectF17.width() / f) + (rectF16.width() / f)) {
                        storyCircle2 = null;
                    } else {
                        storyCircle2 = storyCircleNearest2;
                    }
                } else {
                    storyCircle2 = storyCircleNearest2;
                }
                if (storyCircle5.cachedRead < 1.0f) {
                    int alpha5 = paint18.getAlpha();
                    paint18.setAlpha((int) ((1.0f - fClamp) * (1.0f - storyCircle5.cachedRead) * alpha5 * storyCircle5.cachedScale));
                    profileStoriesView4.drawArcs(canvas, storyCircle, storyCircle5, storyCircle2, paint18);
                    paint4 = paint18;
                    paint4.setAlpha(alpha5);
                } else {
                    paint4 = paint18;
                }
                if (storyCircle5.cachedRead > 0.0f) {
                    Paint paint19 = storyCircle5.live ? paint2 : paint8;
                    int alpha6 = paint19.getAlpha();
                    paint19.setAlpha((int) ((1.0f - fClamp) * alpha6 * storyCircle5.cachedScale * storyCircle5.cachedRead));
                    profileStoriesView4 = this;
                    profileStoriesView4.drawArcs(canvas, storyCircle, storyCircle5, storyCircle2, paint19);
                    paint19.setAlpha(alpha6);
                } else {
                    profileStoriesView4 = this;
                }
                paint18 = paint4;
                i11 = i14;
            }
            Paint paint20 = paint18;
            profileStoriesView = profileStoriesView4;
            canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView4.getWidth(), profileStoriesView4.getHeight(), (int) ((1.0f - fClamp) * profileStoriesView4.expandProgress * f4), 31);
            canvas2 = canvas;
            for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                StoryCircle storyCircle7 = (StoryCircle) arrayList6.get(size2);
                if (storyCircle7.imageReceiver.getVisible()) {
                    int saveCount = canvas2.getSaveCount();
                    int i16 = size2 - 1;
                    int i17 = size2 - 2;
                    profileStoriesView.clipCircle(canvas2, storyCircle7, nearest(i16 >= 0 ? (StoryCircle) arrayList6.get(i16) : null, i17 >= 0 ? (StoryCircle) arrayList6.get(i17) : null, storyCircle7));
                    ImageReceiver imageReceiver = storyCircle7.imageReceiver;
                    imageReceiver.setImageCoords(storyCircle7.cachedRect);
                    imageReceiver.draw(canvas2);
                    canvas2.restoreToCount(saveCount);
                }
            }
            canvas2.restore();
            paint3 = paint20;
            f6 = fMax2;
        }
        if (paint3 != null) {
            paint3.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
        }
        canvas2.restore();
        float fMax3 = Math.max(0.0f, (profileStoriesView.expandProgress - 0.5f) * f);
        if (fMax3 > 0.0f) {
            float fLerp9 = AndroidUtilities.lerp(rectF2.right + AndroidUtilities.dp(16.0f), f6 + AndroidUtilities.dp(12.0f), profileStoriesView.expandProgress);
            float fLerp10 = AndroidUtilities.lerp(profileStoriesView.getWidth(), f9, profileStoriesView.expandProgress);
            float fLerp11 = AndroidUtilities.lerp(rectF2.centerY(), profileStoriesView.cy, profileStoriesView.expandProgress);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = profileStoriesView.titleDrawable;
            animatedTextDrawable.setBounds((int) fLerp9, (int) (fLerp11 - AndroidUtilities.dp(f5)), (int) fLerp10, (int) (fLerp11 + AndroidUtilities.dp(f5)));
            animatedTextDrawable.alpha = (int) (fMax3 * f4);
            animatedTextDrawable.draw(canvas2);
        }
    }

    public final void drawArc(float f, float f2, Canvas canvas, Paint paint, RectF rectF) {
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
        Path path = this.forumRoundRectPath;
        path.rewind();
        path.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
        Matrix matrix = this.forumRoundRectMatrix;
        matrix.reset();
        matrix.postRotate(f4, rectF.centerX(), rectF.centerY());
        path.transform(matrix);
        PathMeasure pathMeasure = this.forumRoundRectPathMeasure;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        Path path2 = this.forumSegmentPath;
        path2.reset();
        pathMeasure.getSegment(((f3 - f5) / 360.0f) * length, length * (((f3 - f2) - f5) / 360.0f), path2, true);
        path2.rLineTo(0.0f, 0.0f);
        canvas.drawPath(path2, paint);
    }

    public final void drawArcs(Canvas canvas, StoryCircle storyCircle, StoryCircle storyCircle2, StoryCircle storyCircle3, Paint paint) {
        double degrees;
        StoryCircle storyCircle4 = storyCircle;
        RectF rectF = storyCircle2.borderRect;
        if (storyCircle4 == null && storyCircle3 == null) {
            drawArc(0.0f, 360.0f, canvas, paint, rectF);
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
            float fCenterX2 = rectF.centerX();
            float fWidth2 = rectF.width() / 2.0f;
            if (Math.abs(fCenterX - fCenterX2) > fWidth + fWidth2) {
                drawArc(0.0f, 360.0f, canvas, paint, rectF);
                return;
            } else if (fCenterX > fCenterX2) {
                float degrees2 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX2 + fWidth2) + (fCenterX - fWidth)) / 2.0f) - fCenterX2) / fWidth2));
                drawArc(degrees2, 360.0f - (2.0f * degrees2), canvas, paint, rectF);
                return;
            } else {
                float degrees3 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX2 - fWidth2) + (fCenterX + fWidth)) / 2.0f) - fCenterX2) / fWidth2));
                drawArc(degrees3 + 180.0f, 360.0f - (degrees3 * 2.0f), canvas, paint, rectF);
                return;
            }
        }
        RectF rectF2 = storyCircle4.borderRect;
        float fCenterX3 = rectF2.centerX();
        float fWidth3 = rectF2.width() / 2.0f;
        float fCenterX4 = rectF.centerX();
        float fWidth4 = rectF.width() / 2.0f;
        RectF rectF3 = storyCircle3.borderRect;
        float fCenterX5 = rectF3.centerX();
        float fWidth5 = rectF3.width() / 2.0f;
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
            drawArc(fMax, 360.0f - (2.0f * fMax), canvas, paint, rectF);
        } else if (z) {
            drawArc(degrees4 + 180.0f, 180.0f - (f + degrees4), canvas, paint, rectF);
            drawArc(f, (180.0f - degrees4) - f, canvas, paint, rectF);
        } else if (z2) {
            drawArc(f + 180.0f, 180.0f - (degrees4 + f), canvas, paint, rectF);
            drawArc(degrees4, (180.0f - degrees4) - f, canvas, paint, rectF);
        } else {
            float fMax2 = Math.max(f, degrees4);
            drawArc(fMax2 + 180.0f, 360.0f - (fMax2 * 2.0f), canvas, paint, rectF);
        }
    }

    public float getFragmentTransitionProgress() {
        return this.fragmentTransitionProgress;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.circles;
            if (i >= arrayList.size()) {
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            } else {
                ((StoryCircle) arrayList.get(i)).imageReceiver.onAttachedToWindow();
                i++;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.attached = false;
        while (true) {
            ArrayList arrayList = this.circles;
            if (i >= arrayList.size()) {
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            } else {
                ((StoryCircle) arrayList.get(i)).imageReceiver.onDetachedFromWindow();
                i++;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zContains;
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        if (this.expandProgress < 0.9f) {
            zContains = this.rect2.contains(motionEvent.getX(), motionEvent.getY());
        } else {
            zContains = motionEvent.getX() >= this.left && motionEvent.getX() <= this.right && Math.abs(motionEvent.getY() - this.cy) < ((float) AndroidUtilities.dp(32.0f));
        }
        ProfileStoriesView$$ExternalSyntheticLambda1 profileStoriesView$$ExternalSyntheticLambda1 = this.onLongPressRunnable;
        if (zContains && motionEvent.getAction() == 0) {
            this.tapTime = System.currentTimeMillis();
            this.tapX = motionEvent.getX();
            this.tapY = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(profileStoriesView$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(profileStoriesView$$ExternalSyntheticLambda1, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(profileStoriesView$$ExternalSyntheticLambda1);
            if (zContains && System.currentTimeMillis() - this.tapTime <= ViewConfiguration.getTapTimeout() && MathUtils.distance(this.tapX, this.tapY, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                StoriesController storiesController = this.storiesController;
                long j = this.dialogId;
                if (storiesController.hasUploadingStories(j) || storiesController.hasStories(j) || !this.circles.isEmpty()) {
                    ProfileActivity.AnonymousClass27 anonymousClass27 = (ProfileActivity.AnonymousClass27) this;
                    ProfileActivity profileActivity = ProfileActivity.this;
                    long dialogId = profileActivity.getDialogId();
                    StoriesController storiesController2 = profileActivity.getMessagesController().getStoriesController();
                    boolean zHasStories = storiesController2.hasStories(dialogId);
                    PhotoViewer.AnonymousClass49 anonymousClass49 = this.provider;
                    Context context = anonymousClass27.val$context;
                    if (zHasStories || storiesController2.hasUploadingStories(dialogId) || storiesController2.isLastUploadingFailed(dialogId)) {
                        profileActivity.getOrCreateStoryViewer().open(context, dialogId, anonymousClass49);
                        return true;
                    }
                    TLRPC.UserFull userFull = profileActivity.userInfo;
                    if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.stories.isEmpty() && profileActivity.userId != profileActivity.getUserConfig().clientUserId) {
                        profileActivity.getOrCreateStoryViewer().open(context, profileActivity.userInfo.stories, anonymousClass49);
                        return true;
                    }
                    TLRPC.ChatFull chatFull = profileActivity.chatInfo;
                    if (chatFull == null || (peerStories = chatFull.stories) == null || peerStories.stories.isEmpty()) {
                        profileActivity.expandAvatar();
                        return true;
                    }
                    profileActivity.getOrCreateStoryViewer().open(context, profileActivity.chatInfo.stories, anonymousClass49);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.tapTime = -1L;
            AndroidUtilities.cancelRunOnUIThread(profileStoriesView$$ExternalSyntheticLambda1);
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
        updateStories(true, false);
    }

    public final void updateStories(boolean z, boolean z2) {
        ArrayList<TL_stories.StoryItem> arrayList;
        boolean z3;
        int i;
        ArrayList arrayList2;
        StoriesController storiesController;
        int i2;
        int i3;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        TLRPC.PeerColor peerColor;
        int i4;
        MessagesController.PeerColors peerColors2;
        MessagesController.PeerColor color2;
        TLRPC.PeerColor peerColor2;
        int i5;
        TL_stories.StoryItem storyItem;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (this.isTopic) {
            return;
        }
        int i11 = this.currentAccount;
        long clientUserId = UserConfig.getInstance(i11).getClientUserId();
        long j = this.dialogId;
        boolean z4 = j == clientUserId;
        int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        TL_stories.PeerStories storiesFromFullPeer = MessagesController.getInstance(i11).getStoriesController().getStoriesFromFullPeer(j);
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) MessagesController.getInstance(i11).getStoriesController().allStoriesMap.get(j);
        TL_stories.PeerStories peerStories2 = j == 0 ? null : storiesFromFullPeer;
        int iMax = storiesFromFullPeer != null ? Math.max(0, storiesFromFullPeer.max_read_id) : 0;
        if (peerStories != null) {
            iMax = Math.max(iMax, peerStories.max_read_id);
        }
        if (peerStories2 == null || (arrayList = peerStories2.stories) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList3 = new ArrayList();
        int i12 = this.unreadCount;
        this.unreadCount = 0;
        int i13 = 0;
        while (i10 < arrayList.size()) {
            TL_stories.StoryItem storyItem2 = arrayList.get(i10);
            int i14 = i10;
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                if (storyItem2.id > iMax) {
                    this.unreadCount++;
                }
                i13++;
            }
            i10 = i14 + 1;
        }
        int i15 = 0;
        while (true) {
            z3 = z4;
            if (i15 >= arrayList.size()) {
                i = 3;
                break;
            }
            TL_stories.StoryItem storyItem3 = arrayList.get(i15);
            if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                i9 = i15;
            } else {
                if (storyItem3 instanceof TL_stories.TL_storyItemSkipped) {
                    int i16 = storyItem3.id;
                    i9 = i15;
                    if (peerStories == null) {
                        storyItem3 = storyItem3;
                        break;
                    }
                    int i17 = 0;
                    while (true) {
                        if (i17 >= peerStories.stories.size()) {
                            storyItem3 = storyItem3;
                            break;
                        } else {
                            if (peerStories.stories.get(i17).id == i16) {
                                storyItem3 = peerStories.stories.get(i17);
                                break;
                            }
                            i17++;
                        }
                    }
                    boolean z5 = storyItem3 instanceof TL_stories.TL_storyItemSkipped;
                    if (z5) {
                        if (storiesFromFullPeer != null) {
                            for (int i18 = 0; i18 < storiesFromFullPeer.stories.size(); i18++) {
                                if (storiesFromFullPeer.stories.get(i18).id == i16) {
                                    storiesFromFullPeer.stories.get(i18);
                                    break;
                                }
                            }
                        }
                    } else if (z5) {
                        continue;
                    }
                } else {
                    i9 = i15;
                }
                int i19 = storyItem3.expire_date;
                if ((i19 == 0 || currentTime <= i19) && (z3 || storyItem3.id > iMax)) {
                    arrayList3.add(storyItem3);
                    i = 3;
                    if (arrayList3.size() >= 3) {
                        break;
                    }
                }
            }
            i15 = i9 + 1;
            z4 = z3;
        }
        if (arrayList3.size() < i) {
            for (int i20 = 0; i20 < arrayList.size(); i20 = i7 + 1) {
                TL_stories.StoryItem storyItem4 = arrayList.get(i20);
                if (storyItem4 instanceof TL_stories.TL_storyItemSkipped) {
                    int i21 = storyItem4.id;
                    i7 = i20;
                    if (peerStories != null) {
                        for (int i22 = 0; i22 < peerStories.stories.size(); i22++) {
                            if (peerStories.stories.get(i22).id == i21) {
                                storyItem4 = peerStories.stories.get(i22);
                                break;
                            }
                        }
                    }
                    boolean z6 = storyItem4 instanceof TL_stories.TL_storyItemSkipped;
                    if (!z6) {
                        if (z6) {
                            break;
                        }
                    } else if (storiesFromFullPeer != null) {
                        for (int i23 = 0; i23 < storiesFromFullPeer.stories.size(); i23++) {
                            if (storiesFromFullPeer.stories.get(i23).id == i21) {
                                storiesFromFullPeer.stories.get(i23);
                                break;
                            }
                        }
                    }
                } else {
                    i7 = i20;
                }
                if (!(storyItem4 instanceof TL_stories.TL_storyItemDeleted) && (((i8 = storyItem4.expire_date) == 0 || currentTime <= i8) && !arrayList3.contains(storyItem4))) {
                    arrayList3.add(storyItem4);
                    if (arrayList3.size() >= 3) {
                        break;
                    }
                }
            }
        }
        int i24 = 0;
        while (true) {
            arrayList2 = this.circles;
            int size = arrayList2.size();
            storiesController = this.storiesController;
            i2 = -1;
            if (i24 >= size) {
                break;
            }
            StoryCircle storyCircle = (StoryCircle) arrayList2.get(i24);
            int i25 = 0;
            while (true) {
                if (i25 >= arrayList3.size()) {
                    i25 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i25);
                    if (storyItem.id == storyCircle.storyId) {
                        break;
                    } else {
                        i25++;
                    }
                }
            }
            if (i25 == -1) {
                storyCircle.scale = 0.0f;
            } else {
                storyCircle.index = i25;
                storyCircle.read = z3 || !(peerStories2 == null || storyItem == null || storyItem.id > storiesController.getMaxStoriesReadId(j));
            }
            if (z) {
                i6 = 1;
            } else {
                i6 = 1;
                storyCircle.readAnimated.set(storyCircle.read, true);
                storyCircle.indexAnimated.set(storyCircle.index, true);
                storyCircle.scaleAnimated.set(storyCircle.scale, true);
            }
            i24 += i6;
        }
        int i26 = 0;
        while (i26 < arrayList3.size()) {
            TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) arrayList3.get(i26);
            int i27 = 0;
            while (true) {
                if (i27 >= arrayList2.size()) {
                    i27 = -1;
                    break;
                } else if (((StoryCircle) arrayList2.get(i27)).storyId == storyItem5.id) {
                    break;
                } else {
                    i27++;
                }
            }
            if (i27 == i2) {
                storyItem5.dialogId = j;
                StoryCircle storyCircle2 = new StoryCircle(this, storyItem5);
                storyCircle2.index = i26;
                storyCircle2.scale = 1.0f;
                AnimatedFloat animatedFloat = storyCircle2.scaleAnimated;
                animatedFloat.set(0.0f, true);
                boolean z7 = z3 || (peerStories2 != null && storyItem5.id <= peerStories2.max_read_id);
                storyCircle2.read = z7;
                if (z) {
                    i5 = 1;
                } else {
                    i5 = 1;
                    storyCircle2.readAnimated.set(z7, true);
                    storyCircle2.indexAnimated.set(storyCircle2.index, true);
                    animatedFloat.set(storyCircle2.scale, true);
                }
                arrayList2.add(storyCircle2);
            } else {
                i5 = 1;
            }
            i26 += i5;
            i2 = -1;
        }
        this.mainCircle = null;
        for (int i28 = 0; i28 < arrayList2.size(); i28++) {
            StoryCircle storyCircle3 = (StoryCircle) arrayList2.get(i28);
            if (storyCircle3.scale > 0.0f) {
                this.mainCircle = storyCircle3;
                break;
            }
        }
        ArrayList arrayList4 = (ArrayList) storiesController.uploadingStoriesByDialogId.get(j);
        this.uploadingStoriesCount = arrayList4 == null ? 0 : arrayList4.size();
        int iMax2 = Math.max(arrayList3.size(), i13);
        int i29 = (iMax2 != 0 || this.uploadingStoriesCount == 0) ? iMax2 : 1;
        if (z2 && z && i29 == this.count + 1 && this.unreadCount == i12 + 1) {
            ValueAnimator valueAnimator = this.newStoryBounce;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean[] zArr = {false};
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.newStoryBounce = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(27, this, zArr));
            this.newStoryBounce.addListener(new QrActivity.AnonymousClass4(16, this, zArr));
            this.newStoryBounce.setInterpolator(new OvershootInterpolator(3.0f));
            this.newStoryBounce.setDuration(400L);
            this.newStoryBounce.setStartDelay(120L);
            this.newStoryBounce.start();
        }
        this.count = i29;
        boolean z8 = false;
        String pluralString = i29 > 0 ? LocaleController.formatPluralString("Stories", i29, new Object[0]) : "";
        if (z && !LocaleController.isRTL) {
            z8 = true;
        }
        this.titleDrawable.setText(pluralString, z8, true);
        StoriesUtilities.StoryGradientTools storyGradientTools = this.gradientTools;
        if (j >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(j));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    storyGradientTools.setColor(MessagesController.PeerColor.fromCollectible(emojiStatus), z);
                } else {
                    if (user != null) {
                        storyGradientTools.getClass();
                        peerColor2 = user.profile_color;
                        if (peerColor2 != null) {
                            i4 = peerColor2.color;
                        } else {
                            i4 = -1;
                        }
                    } else {
                        i4 = -1;
                    }
                    peerColors2 = MessagesController.getInstance(storyGradientTools.currentAccount).profilePeerColors;
                    if (peerColors2 == null) {
                        color2 = null;
                    } else {
                        color2 = peerColors2.getColor(i4);
                    }
                    storyGradientTools.setColor(color2, z);
                }
            } else {
                if (user != null) {
                    storyGradientTools.getClass();
                    peerColor2 = user.profile_color;
                    if (peerColor2 != null) {
                        i4 = peerColor2.color;
                    } else {
                        i4 = -1;
                    }
                } else {
                    i4 = -1;
                }
                peerColors2 = MessagesController.getInstance(storyGradientTools.currentAccount).profilePeerColors;
                if (peerColors2 == null) {
                    color2 = null;
                } else {
                    color2 = peerColors2.getColor(i4);
                }
                storyGradientTools.setColor(color2, z);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    storyGradientTools.setColor(MessagesController.PeerColor.fromCollectible(emojiStatus2), z);
                } else {
                    if (chat != null) {
                        storyGradientTools.getClass();
                        peerColor = chat.profile_color;
                        if (peerColor != null) {
                            i3 = peerColor.color;
                        } else {
                            i3 = -1;
                        }
                    } else {
                        i3 = -1;
                    }
                    peerColors = MessagesController.getInstance(storyGradientTools.currentAccount).profilePeerColors;
                    if (peerColors == null) {
                        color = null;
                    } else {
                        color = peerColors.getColor(i3);
                    }
                    storyGradientTools.setColor(color, z);
                }
            } else {
                if (chat != null) {
                    storyGradientTools.getClass();
                    peerColor = chat.profile_color;
                    if (peerColor != null) {
                        i3 = peerColor.color;
                    } else {
                        i3 = -1;
                    }
                } else {
                    i3 = -1;
                }
                peerColors = MessagesController.getInstance(storyGradientTools.currentAccount).profilePeerColors;
                if (peerColors == null) {
                    color = null;
                } else {
                    color = peerColors.getColor(i3);
                }
                storyGradientTools.setColor(color, z);
            }
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.titleDrawable || super.verifyDrawable(drawable);
    }
}
