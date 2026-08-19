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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.ProfileActivity;

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

    public abstract void onLongPress();

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
                this.f$0.onLongPress();
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

    public void updateStories(boolean z, boolean z2) {
        ArrayList<TL_stories.StoryItem> arrayList;
        boolean z3;
        int i;
        TL_stories.StoryItem storyItem;
        int i2;
        if (this.isTopic) {
            return;
        }
        boolean z4 = this.dialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        TL_stories.PeerStories storiesFromFullPeer = MessagesController.getInstance(this.currentAccount).getStoriesController().getStoriesFromFullPeer(this.dialogId);
        TL_stories.PeerStories stories = MessagesController.getInstance(this.currentAccount).getStoriesController().getStories(this.dialogId);
        TL_stories.PeerStories peerStories = this.dialogId == 0 ? null : storiesFromFullPeer;
        int iMax = storiesFromFullPeer != null ? Math.max(0, storiesFromFullPeer.max_read_id) : 0;
        if (stories != null) {
            iMax = Math.max(iMax, stories.max_read_id);
        }
        if (peerStories == null || (arrayList = peerStories.stories) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = this.unreadCount;
        this.unreadCount = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            TL_stories.StoryItem storyItem2 = arrayList.get(i5);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                if (storyItem2.id > iMax) {
                    this.unreadCount++;
                }
                i4++;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= arrayList.size()) {
                z3 = z4;
                i = 3;
                break;
            }
            TL_stories.StoryItem storyItem3 = arrayList.get(i6);
            if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                z3 = z4;
            } else {
                if (storyItem3 instanceof TL_stories.TL_storyItemSkipped) {
                    int i7 = storyItem3.id;
                    z3 = z4;
                    if (stories != null) {
                        for (int i8 = 0; i8 < stories.stories.size(); i8++) {
                            if (stories.stories.get(i8).id == i7) {
                                storyItem3 = stories.stories.get(i8);
                                break;
                            }
                        }
                    }
                    boolean z5 = storyItem3 instanceof TL_stories.TL_storyItemSkipped;
                    if (z5) {
                        if (storiesFromFullPeer != null) {
                            for (int i9 = 0; i9 < storiesFromFullPeer.stories.size(); i9++) {
                                if (storiesFromFullPeer.stories.get(i9).id == i7) {
                                    storiesFromFullPeer.stories.get(i9);
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
                int i10 = storyItem3.expire_date;
                if ((i10 == 0 || currentTime <= i10) && (z3 || storyItem3.id > iMax)) {
                    arrayList2.add(storyItem3);
                    i = 3;
                    if (arrayList2.size() >= 3) {
                        break;
                    }
                }
            }
            i6++;
            z4 = z3;
        }
        if (arrayList2.size() < i) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TL_stories.StoryItem storyItem4 = arrayList.get(i11);
                if (storyItem4 instanceof TL_stories.TL_storyItemSkipped) {
                    int i12 = storyItem4.id;
                    if (stories != null) {
                        for (int i13 = 0; i13 < stories.stories.size(); i13++) {
                            if (stories.stories.get(i13).id == i12) {
                                storyItem4 = stories.stories.get(i13);
                                break;
                            }
                        }
                    }
                    boolean z6 = storyItem4 instanceof TL_stories.TL_storyItemSkipped;
                    if (!z6) {
                        if (z6) {
                            break;
                        }
                        if (!(storyItem4 instanceof TL_stories.TL_storyItemDeleted) && (((i2 = storyItem4.expire_date) == 0 || currentTime <= i2) && !arrayList2.contains(storyItem4))) {
                            arrayList2.add(storyItem4);
                            if (arrayList2.size() >= 3) {
                                break;
                            }
                        }
                    } else if (storiesFromFullPeer != null) {
                        for (int i14 = 0; i14 < storiesFromFullPeer.stories.size(); i14++) {
                            if (storiesFromFullPeer.stories.get(i14).id == i12) {
                                storiesFromFullPeer.stories.get(i14);
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
        for (int i15 = 0; i15 < this.circles.size(); i15++) {
            StoryCircle storyCircle = (StoryCircle) this.circles.get(i15);
            int i16 = 0;
            while (true) {
                if (i16 >= arrayList2.size()) {
                    i16 = -1;
                    storyItem = null;
                    break;
                } else {
                    storyItem = (TL_stories.StoryItem) arrayList2.get(i16);
                    if (storyItem.id == storyCircle.storyId) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            if (i16 == -1) {
                storyCircle.scale = 0.0f;
            } else {
                storyCircle.index = i16;
                storyCircle.read = z3 || !(peerStories == null || storyItem == null || storyItem.id > this.storiesController.getMaxStoriesReadId(this.dialogId));
            }
            if (!z) {
                storyCircle.apply();
            }
        }
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) arrayList2.get(i17);
            int i18 = 0;
            while (true) {
                if (i18 >= this.circles.size()) {
                    i18 = -1;
                    break;
                } else if (((StoryCircle) this.circles.get(i18)).storyId == storyItem5.id) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i18 == -1) {
                storyItem5.dialogId = this.dialogId;
                StoryCircle storyCircle2 = new StoryCircle(storyItem5);
                storyCircle2.index = i17;
                storyCircle2.scale = 1.0f;
                storyCircle2.scaleAnimated.set(0.0f, true);
                storyCircle2.read = z3 || (peerStories != null && storyItem5.id <= peerStories.max_read_id);
                if (!z) {
                    storyCircle2.apply();
                }
                this.circles.add(storyCircle2);
            }
        }
        this.mainCircle = null;
        for (int i19 = 0; i19 < this.circles.size(); i19++) {
            StoryCircle storyCircle3 = (StoryCircle) this.circles.get(i19);
            if (storyCircle3.scale > 0.0f) {
                this.mainCircle = storyCircle3;
                break;
            }
        }
        ArrayList uploadingStories = this.storiesController.getUploadingStories(this.dialogId);
        this.uploadingStoriesCount = uploadingStories == null ? 0 : uploadingStories.size();
        int iMax2 = Math.max(arrayList2.size(), i4);
        if (iMax2 == 0 && this.uploadingStoriesCount != 0) {
            iMax2 = 1;
        }
        if (z2 && z) {
            if (iMax2 == this.count + 1 && this.unreadCount == i3 + 1) {
                animateNewStory();
            }
        }
        this.count = iMax2;
        this.titleDrawable.setText(iMax2 > 0 ? LocaleController.formatPluralString("Stories", iMax2, new Object[0]) : "", z && !LocaleController.isRTL);
        if (this.dialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.gradientTools.setColor(MessagesController.PeerColor.fromCollectible(emojiStatus), z);
                } else {
                    this.gradientTools.setUser(user, z);
                }
            } else {
                this.gradientTools.setUser(user, z);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    this.gradientTools.setColor(MessagesController.PeerColor.fromCollectible(emojiStatus2), z);
                } else {
                    this.gradientTools.setChat(chat, z);
                }
            } else {
                this.gradientTools.setChat(chat, z);
            }
        }
        invalidate();
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
                ProfileStoriesView.$r8$lambda$AmbJGordIoaqtAGHuhomGEcgJqc(this.f$0);
            }
        }, 180L);
    }

    public static void $r8$lambda$AmbJGordIoaqtAGHuhomGEcgJqc(ProfileStoriesView profileStoriesView) {
        profileStoriesView.getClass();
        AndroidUtilities.vibrateCursor(profileStoriesView);
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
                ProfileStoriesView.$r8$lambda$vHRaq9wyhDGyqt31tiC8FhEpfi8(this.f$0, zArr, valueAnimator2);
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

    public static void $r8$lambda$vHRaq9wyhDGyqt31tiC8FhEpfi8(ProfileStoriesView profileStoriesView, boolean[] zArr, ValueAnimator valueAnimator) {
        profileStoriesView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!zArr[0] && fFloatValue > 0.2f) {
            zArr[0] = true;
            profileStoriesView.vibrateNewStory();
        }
        profileStoriesView.newStoryBounceT = Math.max(1.0f, fFloatValue);
        profileStoriesView.invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        Paint paint;
        float f3;
        float f4;
        float f5;
        float f6;
        float fClamp;
        ProfileStoriesView profileStoriesView;
        float fMax;
        Paint paint2;
        Paint paint3;
        float size;
        StoriesController.UploadingStory uploadingStory;
        ProfileStoriesView profileStoriesView2 = this;
        Canvas canvas2 = canvas;
        float f7 = profileStoriesView2.rightAnimated.set(profileStoriesView2.right);
        float fClamp2 = Utilities.clamp((profileStoriesView2.avatarContainer.getScaleX() - 1.0f) / 0.4f, 1.0f, 0.0f);
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(3.5f), fClamp2) * profileStoriesView2.progressToInsets;
        float x = profileStoriesView2.avatarContainer.getX() + (profileStoriesView2.avatarContainer.getScaleX() * fLerp);
        float y = profileStoriesView2.avatarContainer.getY() + (profileStoriesView2.avatarContainer.getScaleY() * fLerp);
        float f8 = fLerp * 2.0f;
        profileStoriesView2.rect1.set(x, y, ((profileStoriesView2.avatarContainer.getWidth() - f8) * profileStoriesView2.avatarContainer.getScaleX()) + x, ((profileStoriesView2.avatarContainer.getHeight() - f8) * profileStoriesView2.avatarContainer.getScaleY()) + y);
        float f9 = profileStoriesView2.left;
        int i = 0;
        while (i < profileStoriesView2.circles.size()) {
            StoryCircle storyCircle = (StoryCircle) profileStoriesView2.circles.get(i);
            float f10 = storyCircle.scaleAnimated.set(storyCircle.scale);
            storyCircle.cachedScale = f10;
            if (f10 <= 0.0f && storyCircle.scale <= 0.0f) {
                storyCircle.destroy();
                profileStoriesView2.circles.remove(i);
                i--;
            } else {
                storyCircle.cachedIndex = storyCircle.indexAnimated.set(storyCircle.index);
                storyCircle.cachedRead = storyCircle.readAnimated.set(storyCircle.read);
                if (i > 0 && ((StoryCircle) profileStoriesView2.circles.get(i - 1)).cachedIndex > storyCircle.cachedIndex) {
                    Collections.sort(profileStoriesView2.circles, new Comparator() {
                        @Override
                        public final int compare(Object obj, Object obj2) {
                            return ProfileStoriesView.m4375$r8$lambda$JQNPIPP51ie698WIdXQXlPmQs((ProfileStoriesView.StoryCircle) obj, (ProfileStoriesView.StoryCircle) obj2);
                        }
                    });
                    break;
                }
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
                ArrayList uploadingStories = profileStoriesView2.storiesController.getUploadingStories(profileStoriesView2.dialogId);
                if (uploadingStories != null) {
                    if (uploadingStories.size() > 0) {
                        profileStoriesView2.lastUploadingStory = (StoriesController.UploadingStory) uploadingStories.get(0);
                    }
                    float f12 = 0.0f;
                    for (int i2 = 0; i2 < uploadingStories.size(); i2++) {
                        f12 += ((StoriesController.UploadingStory) uploadingStories.get(i2)).progress;
                    }
                    size = f12 / uploadingStories.size();
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
            fLerp3 = fLerp3;
            f = 3.775f;
            f2 = 2.0f;
            profileStoriesView2.progressWasDrawn = false;
            paint = null;
        }
        if (fLerp2 < 1.0f) {
            fClamp = Utilities.clamp(1.0f - (profileStoriesView2.expandProgress / 0.2f), 1.0f, 0.0f) * (1.0f - fLerp2);
            float f13 = profileStoriesView2.segmentsCountAnimated.set(profileStoriesView2.count);
            float f14 = profileStoriesView2.segmentsUnreadCountAnimated.set(profileStoriesView2.unreadCount);
            if (zIsLastUploadingFailed) {
                profileStoriesView2.rect2.set(profileStoriesView2.rect1);
                profileStoriesView2.rect2.inset(-AndroidUtilities.dpf2(f), -AndroidUtilities.dpf2(f));
                Paint errorPaint = StoriesUtilities.getErrorPaint(profileStoriesView2.rect2);
                errorPaint.setStrokeWidth(AndroidUtilities.dp(f2));
                errorPaint.setAlpha((int) (fClamp * 255.0f));
                if (ChatObject.isForum(UserConfig.selectedAccount, profileStoriesView2.dialogId)) {
                    float fHeight = profileStoriesView2.rect2.height() * 0.32f;
                    canvas2.drawRoundRect(profileStoriesView2.rect2, fHeight, fHeight, errorPaint);
                } else {
                    canvas2.drawCircle(profileStoriesView2.rect2.centerX(), profileStoriesView2.rect2.centerY(), profileStoriesView2.rect2.width() / f2, errorPaint);
                }
            } else if ((profileStoriesView2.mainCircle != null || profileStoriesView2.uploadingStoriesCount > 0) && fClamp > 0.0f) {
                profileStoriesView2.rect2.set(profileStoriesView2.rect1);
                profileStoriesView2.rect2.inset(-AndroidUtilities.dpf2(f), -AndroidUtilities.dpf2(f));
                profileStoriesView2.rect3.set(profileStoriesView2.rect1);
                profileStoriesView2.rect3.inset(-AndroidUtilities.dpf2(3.41f), -AndroidUtilities.dpf2(3.41f));
                RectF rectF2 = profileStoriesView2.rect2;
                RectF rectF3 = profileStoriesView2.rect3;
                AndroidUtilities.lerp(rectF2, rectF3, fClamp2, rectF3);
                f3 = f9;
                f4 = 12.0f;
                float fLerp4 = AndroidUtilities.lerp(0.0f, (float) ((((double) AndroidUtilities.dpf2(4.23f)) / (((double) profileStoriesView2.rect1.width()) * 3.141592653589793d)) * 360.0d), Utilities.clamp(f13 - 1.0f, 1.0f, 0.0f) * fClamp);
                int iMin = Math.min(profileStoriesView2.count, 50);
                float fMin = Math.min(f13, 50.0f);
                int i3 = iMin > 20 ? 3 : 5;
                if (iMin <= 1) {
                    i3 = 0;
                }
                float fLerp5 = AndroidUtilities.lerp(i3 * 2, fLerp4, fClamp2);
                float fMax2 = (360.0f - (Math.max(0.0f, fMin) * fLerp5)) / Math.max(1.0f, fMin);
                profileStoriesView2.readPaint.setColor(ColorUtils.blendARGB(1526726655, 973078528, profileStoriesView2.actionBarProgress));
                profileStoriesView2.readPaintAlpha = profileStoriesView2.readPaint.getAlpha();
                float f15 = (-90.0f) - (fLerp5 / f2);
                boolean z3 = false;
                for (int i4 = 0; i4 < iMin; i4++) {
                    if (i4 < profileStoriesView2.circles.size() && ((StoryCircle) profileStoriesView2.circles.get(i4)).live) {
                        z3 = true;
                    }
                }
                if (z3) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(profileStoriesView2.rect3);
                    rectF4.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
                    canvas2.saveLayerAlpha(rectF4, 255, 31);
                    float f16 = ((profileStoriesView2.newStoryBounceT - 1.0f) / 2.5f) + 1.0f;
                    if (f16 != 1.0f) {
                        canvas2.save();
                        canvas2.scale(f16, f16, profileStoriesView2.rect2.centerX(), profileStoriesView2.rect2.centerY());
                    }
                    int alpha2 = profileStoriesView2.livePaint.getAlpha();
                    profileStoriesView2.livePaint.setAlpha((int) (alpha2 * fClamp));
                    rectF4.set(profileStoriesView2.rect3);
                    rectF4.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                    profileStoriesView2.livePaint.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
                    profileStoriesView2.drawArc(canvas2, profileStoriesView2.rect3, 0.0f, 360.0f, false, profileStoriesView2.livePaint);
                    profileStoriesView2.livePaint.setAlpha(alpha2);
                    if (f16 != 1.0f) {
                        canvas2.restore();
                    }
                } else {
                    float f17 = f15;
                    int i5 = 0;
                    while (i5 < iMin) {
                        float f18 = i5;
                        float fClamp4 = 1.0f - Utilities.clamp(f14 - f18, 1.0f, 0.0f);
                        float fClamp5 = 1.0f - Utilities.clamp((iMin - fMin) - f18, 1.0f, 0.0f);
                        if (fClamp5 < 0.0f) {
                            fMax2 = fMax2;
                            i5 = i5;
                        } else {
                            float f19 = i5 == 0 ? ((profileStoriesView2.newStoryBounceT - 1.0f) / 2.5f) + 1.0f : 1.0f;
                            if (f19 != 1.0f) {
                                canvas2.save();
                                canvas2.scale(f19, f19, profileStoriesView2.rect2.centerX(), profileStoriesView2.rect2.centerY());
                            }
                            boolean z4 = i5 < profileStoriesView2.circles.size() && ((StoryCircle) profileStoriesView2.circles.get(i5)).live;
                            if (fClamp4 < 1.0f) {
                                if (z4) {
                                    paint3 = profileStoriesView2.livePaint;
                                } else {
                                    paint = profileStoriesView2.gradientTools.getPaint(profileStoriesView2.rect2);
                                    paint3 = paint;
                                }
                                int alpha3 = paint3.getAlpha();
                                paint3.setAlpha((int) (alpha3 * (1.0f - fClamp4) * fClamp));
                                paint3.setStrokeWidth(AndroidUtilities.dpf2(z4 ? 3.0f : 2.33f));
                                profileStoriesView2.drawArc(canvas2, profileStoriesView2.rect2, f17, (-fMax2) * fClamp5, false, paint3);
                                paint3.setAlpha(alpha3);
                                paint = paint;
                            }
                            if (fClamp4 > 0.0f) {
                                Paint paint5 = z4 ? profileStoriesView2.livePaint : profileStoriesView2.readPaint;
                                int alpha4 = paint5.getAlpha();
                                paint5.setAlpha((int) (alpha4 * fClamp4 * fClamp));
                                paint5.setStrokeWidth(AndroidUtilities.dpf2(z4 ? 3.0f : 1.5f));
                                canvas2 = canvas;
                                profileStoriesView2.drawArc(canvas2, profileStoriesView2.rect3, f17, (-fMax2) * fClamp5, false, paint5);
                                paint5.setAlpha(alpha4);
                            } else {
                                canvas2 = canvas;
                            }
                            if (f19 != 1.0f) {
                                canvas2.restore();
                            }
                            f17 -= (fMax2 * fClamp5) + (fClamp5 * fLerp5);
                        }
                        i5++;
                        fMax2 = fMax2;
                    }
                }
                f5 = 255.0f;
                f6 = 1.5f;
                if (z3) {
                    StoriesUtilities.drawLive(canvas2, profileStoriesView2.rect3, fClamp, profileStoriesView2.avatarImage.getImageReceiver().getVisible(), profileStoriesView2.fragmentTransitionProgress);
                    canvas2.restore();
                }
            }
            f3 = f9;
            f4 = 12.0f;
            f5 = 255.0f;
            f6 = 1.5f;
        } else {
            f3 = f9;
            f4 = 12.0f;
            f5 = 255.0f;
            f6 = 1.5f;
            fClamp = fClamp3;
        }
        profileStoriesView2.getExpandRight();
        if (profileStoriesView2.expandProgress <= 0.0f || fClamp >= 1.0f) {
            profileStoriesView = profileStoriesView2;
            fMax = f3;
        } else {
            profileStoriesView2.w = 0.0f;
            for (int i6 = 0; i6 < profileStoriesView2.circles.size(); i6++) {
                profileStoriesView2.w += AndroidUtilities.dp(14.0f) * ((StoryCircle) profileStoriesView2.circles.get(i6)).cachedScale;
            }
            fMax = f3;
            float fDp = 0.0f;
            for (int i7 = 0; i7 < profileStoriesView2.circles.size(); i7++) {
                StoryCircle storyCircle2 = (StoryCircle) profileStoriesView2.circles.get(i7);
                float f20 = storyCircle2.cachedScale;
                float f21 = storyCircle2.cachedRead;
                float fDp2 = (AndroidUtilities.dp(28.0f) / f2) * f20;
                float f22 = profileStoriesView2.left + fDp2 + fDp;
                fDp += AndroidUtilities.dp(18.0f) * f20;
                float f23 = f22 + fDp2;
                fMax = Math.max(fMax, f23);
                profileStoriesView2.rect2.set(f22 - fDp2, fLerp3 - fDp2, f23, fLerp3 + fDp2);
                profileStoriesView2.lerpCentered(profileStoriesView2.rect1, profileStoriesView2.rect2, profileStoriesView2.expandProgress, profileStoriesView2.rect3);
                storyCircle2.cachedRect.set(profileStoriesView2.rect3);
                storyCircle2.borderRect.set(profileStoriesView2.rect3);
                float f24 = (-AndroidUtilities.lerp(AndroidUtilities.dpf2(2.66f), AndroidUtilities.lerp(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(2.33f), profileStoriesView2.expandProgress), f21 * profileStoriesView2.expandProgress)) * f20;
                storyCircle2.borderRect.inset(f24, f24);
            }
            profileStoriesView2.readPaint.setColor(ColorUtils.blendARGB(1526726655, -2135178036, profileStoriesView2.expandProgress));
            profileStoriesView2.readPaintAlpha = profileStoriesView2.readPaint.getAlpha();
            Paint paint6 = profileStoriesView2.gradientTools.getPaint(profileStoriesView2.rect2);
            paint6.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(f6), profileStoriesView2.expandProgress));
            profileStoriesView2.readPaint.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f6), profileStoriesView2.expandProgress));
            profileStoriesView2.livePaint.setStrokeWidth(AndroidUtilities.lerp(AndroidUtilities.dpf2(1.125f), AndroidUtilities.dpf2(f6), profileStoriesView2.expandProgress));
            int i8 = 0;
            while (i8 < profileStoriesView2.circles.size()) {
                StoryCircle storyCircle3 = (StoryCircle) profileStoriesView2.circles.get(i8);
                int i9 = i8 - 2;
                int i10 = i8 - 1;
                StoryCircle storyCircleNearest = profileStoriesView2.nearest(i9 >= 0 ? (StoryCircle) profileStoriesView2.circles.get(i9) : null, i10 >= 0 ? (StoryCircle) profileStoriesView2.circles.get(i10) : null, storyCircle3);
                int i11 = i8 + 1;
                int i12 = i8 + 2;
                StoryCircle storyCircleNearest2 = profileStoriesView2.nearest(i11 < profileStoriesView2.circles.size() ? (StoryCircle) profileStoriesView2.circles.get(i11) : null, i12 < profileStoriesView2.circles.size() ? (StoryCircle) profileStoriesView2.circles.get(i12) : null, storyCircle3);
                if (storyCircleNearest != null && (Math.abs(storyCircleNearest.borderRect.centerX() - storyCircle3.borderRect.centerX()) < Math.abs((storyCircle3.borderRect.width() / f2) - (storyCircleNearest.borderRect.width() / f2)) || Math.abs(storyCircleNearest.borderRect.centerX() - storyCircle3.borderRect.centerX()) > (storyCircleNearest.borderRect.width() / f2) + (storyCircle3.borderRect.width() / f2))) {
                    storyCircleNearest = null;
                }
                if (storyCircleNearest2 != null && (Math.abs(storyCircleNearest2.borderRect.centerX() - storyCircle3.borderRect.centerX()) < Math.abs((storyCircle3.borderRect.width() / f2) - (storyCircleNearest2.borderRect.width() / f2)) || Math.abs(storyCircleNearest2.borderRect.centerX() - storyCircle3.borderRect.centerX()) > (storyCircleNearest2.borderRect.width() / f2) + (storyCircle3.borderRect.width() / f2))) {
                    storyCircleNearest2 = null;
                }
                if (storyCircle3.cachedRead < 1.0f) {
                    int alpha5 = paint6.getAlpha();
                    paint6.setAlpha((int) (alpha5 * storyCircle3.cachedScale * (1.0f - storyCircle3.cachedRead) * (1.0f - fClamp)));
                    profileStoriesView2.drawArcs(canvas2, storyCircleNearest, storyCircle3, storyCircleNearest2, paint6);
                    paint2 = paint6;
                    paint2.setAlpha(alpha5);
                } else {
                    paint2 = paint6;
                }
                if (storyCircle3.cachedRead > 0.0f) {
                    Paint paint7 = storyCircle3.live ? profileStoriesView2.livePaint : profileStoriesView2.readPaint;
                    int alpha6 = paint7.getAlpha();
                    paint7.setAlpha((int) (alpha6 * storyCircle3.cachedScale * storyCircle3.cachedRead * (1.0f - fClamp)));
                    profileStoriesView2.drawArcs(canvas, storyCircleNearest, storyCircle3, storyCircleNearest2, paint7);
                    paint7.setAlpha(alpha6);
                }
                canvas2 = canvas;
                paint6 = paint2;
                profileStoriesView2 = profileStoriesView2;
                i8 = i11;
            }
            profileStoriesView = profileStoriesView2;
            Paint paint8 = paint6;
            canvas.saveLayerAlpha(0.0f, 0.0f, profileStoriesView.getWidth(), profileStoriesView.getHeight(), (int) (profileStoriesView.expandProgress * f5 * (1.0f - fClamp)), 31);
            canvas2 = canvas;
            for (int size2 = profileStoriesView.circles.size() - 1; size2 >= 0; size2--) {
                StoryCircle storyCircle4 = (StoryCircle) profileStoriesView.circles.get(size2);
                if (storyCircle4.imageReceiver.getVisible()) {
                    int saveCount = canvas2.getSaveCount();
                    int i13 = size2 - 1;
                    int i14 = size2 - 2;
                    profileStoriesView.clipCircle(canvas2, storyCircle4, profileStoriesView.nearest(i13 >= 0 ? (StoryCircle) profileStoriesView.circles.get(i13) : null, i14 >= 0 ? (StoryCircle) profileStoriesView.circles.get(i14) : null, storyCircle4));
                    storyCircle4.imageReceiver.setImageCoords(storyCircle4.cachedRect);
                    storyCircle4.imageReceiver.draw(canvas2);
                    canvas2.restoreToCount(saveCount);
                }
            }
            canvas2.restore();
            paint = paint8;
        }
        if (paint != null) {
            paint.setStrokeWidth(AndroidUtilities.dpf2(2.3f));
        }
        canvas2.restore();
        float fMax3 = Math.max(0.0f, (profileStoriesView.expandProgress - 0.5f) * f2);
        if (fMax3 > 0.0f) {
            float fLerp6 = AndroidUtilities.lerp(profileStoriesView.rect1.right + AndroidUtilities.dp(16.0f), fMax + AndroidUtilities.dp(f4), profileStoriesView.expandProgress);
            float fLerp7 = AndroidUtilities.lerp(profileStoriesView.getWidth(), f7, profileStoriesView.expandProgress);
            float fLerp8 = AndroidUtilities.lerp(profileStoriesView.rect1.centerY(), profileStoriesView.cy, profileStoriesView.expandProgress);
            profileStoriesView.titleDrawable.setBounds((int) fLerp6, (int) (fLerp8 - AndroidUtilities.dp(18.0f)), (int) fLerp7, (int) (fLerp8 + AndroidUtilities.dp(18.0f)));
            profileStoriesView.titleDrawable.setAlpha((int) (fMax3 * f5));
            profileStoriesView.titleDrawable.draw(canvas2);
        }
    }

    public static int m4375$r8$lambda$JQNPIPP51ie698WIdXQXlPmQs(StoryCircle storyCircle, StoryCircle storyCircle2) {
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
                ProfileStoriesView.$r8$lambda$Pl8F927pxcrAD7lBvSRsjTu6NK4(this.f$0, valueAnimator);
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

    public static void $r8$lambda$Pl8F927pxcrAD7lBvSRsjTu6NK4(ProfileStoriesView profileStoriesView, ValueAnimator valueAnimator) {
        ProfileActivity.AvatarImageView avatarImageView = profileStoriesView.avatarImage;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        profileStoriesView.bounceScale = fFloatValue;
        avatarImageView.bounceScale = fFloatValue;
        profileStoriesView.avatarImage.invalidate();
        profileStoriesView.invalidate();
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
        if (storyCircle == null || storyCircle2 == null) {
            return storyCircle != null ? storyCircle : storyCircle2;
        }
        return Math.min(Math.abs(storyCircle.borderRect.left - storyCircle3.borderRect.right), Math.abs(storyCircle.borderRect.right - storyCircle3.borderRect.left)) > Math.min(Math.abs(storyCircle2.borderRect.left - storyCircle3.borderRect.right), Math.abs(storyCircle2.borderRect.right - storyCircle3.borderRect.left)) ? storyCircle : storyCircle2;
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
            float fWidth2 = storyCircle2.borderRect.width() / 2.0f;
            if (Math.abs(fCenterX - fCenterX2) > fWidth + fWidth2) {
                drawArc(canvas, storyCircle2.borderRect, 0.0f, 360.0f, false, paint);
                return;
            } else if (fCenterX > fCenterX2) {
                float degrees3 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX - fWidth) + (fCenterX2 + fWidth2)) / 2.0f) - fCenterX2) / fWidth2));
                drawArc(canvas, storyCircle2.borderRect, degrees3, 360.0f - (2.0f * degrees3), false, paint);
                return;
            } else {
                float degrees4 = (float) Math.toDegrees(Math.acos(Math.abs((((fCenterX + fWidth) + (fCenterX2 - fWidth2)) / 2.0f) - fCenterX2) / fWidth2));
                drawArc(canvas, storyCircle2.borderRect, degrees4 + 180.0f, 360.0f - (degrees4 * 2.0f), false, paint);
                return;
            }
        }
        float fCenterX3 = storyCircle4.borderRect.centerX();
        float fWidth3 = storyCircle4.borderRect.width() / 2.0f;
        float fCenterX4 = storyCircle2.borderRect.centerX();
        float fWidth4 = storyCircle2.borderRect.width() / 2.0f;
        float fCenterX5 = storyCircle3.borderRect.centerX();
        float fWidth5 = storyCircle3.borderRect.width() / 2.0f;
        boolean z = fCenterX3 > fCenterX4;
        if (z) {
            degrees = Math.toDegrees(Math.acos(Math.abs((((fCenterX3 - fWidth3) + (fCenterX4 + fWidth4)) / 2.0f) - fCenterX4) / fWidth4));
        } else {
            degrees = Math.toDegrees(Math.acos(Math.abs((((fCenterX3 + fWidth3) + (fCenterX4 - fWidth4)) / 2.0f) - fCenterX4) / fWidth4));
        }
        float f = (float) degrees;
        boolean z2 = fCenterX5 > fCenterX4;
        if (z2) {
            degrees2 = Math.toDegrees(Math.acos(Math.abs((((fCenterX5 - fWidth5) + (fCenterX4 + fWidth4)) / 2.0f) - fCenterX4) / fWidth4));
        } else {
            degrees2 = Math.toDegrees(Math.acos(Math.abs((((fCenterX5 + fWidth5) + (fCenterX4 - fWidth4)) / 2.0f) - fCenterX4) / fWidth4));
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
                if (storyCircle3.scale >= 1.0f && storyCircle3.storyId == i2) {
                    ProfileStoriesView profileStoriesView = ProfileStoriesView.this;
                    int i5 = i4 - 1;
                    int i6 = i4 - 2;
                    StoryCircle storyCircleNearest = profileStoriesView.nearest(i5 >= 0 ? (StoryCircle) profileStoriesView.circles.get(i5) : null, i6 >= 0 ? (StoryCircle) ProfileStoriesView.this.circles.get(i6) : null, storyCircle3);
                    imageReceiver = storyCircle3.imageReceiver;
                    storyCircle2 = storyCircleNearest;
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
                        ProfileStoriesView.AnonymousClass3.m4376$r8$lambda$THKxWddNCIebL9eDb50cle7J1U(this.f$0, rectF, storyCircle, rectF2, storyCircle2, canvas, rectF3, f, z);
                    }
                };
            } else {
                transitionViewHolder.drawClip = null;
            }
            return true;
        }

        public static void m4376$r8$lambda$THKxWddNCIebL9eDb50cle7J1U(AnonymousClass3 anonymousClass3, RectF rectF, StoryCircle storyCircle, RectF rectF2, StoryCircle storyCircle2, Canvas canvas, RectF rectF3, float f, boolean z) {
            anonymousClass3.getClass();
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
