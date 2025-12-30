package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.graphics.ColorUtils;
import androidx.core.widget.NestedScrollView;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.ReplyMessageLine;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.StoryEntry;

public class StoryCaptionView extends NestedScrollView {
    private Method abortAnimatedScrollMethod;
    private float backgroundAlpha;
    public int blackoutBottomOffset;
    FrameLayout captionContainer;
    public StoryCaptionTextView captionTextview;
    private boolean disableDraw;
    public boolean disableTouches;
    private boolean dontChangeTopMargin;
    boolean expanded;
    int gradientColor;
    private boolean isLandscape;
    private float lastMotionX;
    private float lastMotionY;
    private boolean nestedScrollStarted;
    private float overScrollY;
    private final Paint paint;
    private int pendingTopMargin;
    private int prevHeight;
    private int replytextHash;
    private int replytitleHash;
    private OverScroller scroller;
    private final SpringAnimation springAnimation;
    private float startMotionX;
    private float startMotionY;
    private int textHash;
    TextSelectionHelper.SimpleTextSelectionHelper textSelectionHelper;
    GradientDrawable topOverlayGradient;
    boolean touched;
    private float velocitySign;
    private float velocityY;

    @Override
    protected float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    protected float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    public void onEmojiClick(AnimatedEmojiSpan animatedEmojiSpan) {
    }

    public void onLinkClick(CharacterStyle characterStyle, View view) {
    }

    public void onLinkLongPress(URLSpan uRLSpan, View view, Runnable runnable) {
    }

    public void onReplyClick(Reply reply) {
    }

    public StoryCaptionView(Context context, Theme.ResourcesProvider resourcesProvider) throws NoSuchFieldException, NoSuchMethodException, SecurityException {
        super(context);
        Paint paint = new Paint(1);
        this.paint = paint;
        this.backgroundAlpha = 1.0f;
        this.pendingTopMargin = -1;
        this.gradientColor = ColorUtils.setAlphaComponent(-16777216, 51);
        this.topOverlayGradient = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, this.gradientColor});
        this.captionContainer = new FrameLayout(context);
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        StoryCaptionTextView storyCaptionTextView = new StoryCaptionTextView(getContext(), resourcesProvider);
        this.captionTextview = storyCaptionTextView;
        TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper = new TextSelectionHelper.SimpleTextSelectionHelper(storyCaptionTextView, resourcesProvider);
        this.textSelectionHelper = simpleTextSelectionHelper;
        simpleTextSelectionHelper.useMovingOffset = false;
        this.captionContainer.addView(this.captionTextview, -1, -2);
        addView(this.captionContainer, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        SpringAnimation springAnimation = new SpringAnimation(this.captionTextview, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.springAnimation = springAnimation;
        springAnimation.getSpring().setStiffness(100.0f);
        springAnimation.setMinimumVisibleChange(1.0f);
        springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                this.f$0.lambda$new$0(dynamicAnimation, f, f2);
            }
        });
        springAnimation.getSpring().setDampingRatio(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("abortAnimatedScroll", null);
            this.abortAnimatedScrollMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            this.abortAnimatedScrollMethod = null;
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            this.scroller = (OverScroller) declaredField.get(this);
        } catch (Exception e2) {
            this.scroller = null;
            FileLog.e(e2);
        }
    }

    public void lambda$new$0(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.overScrollY = f;
        this.velocityY = f2;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.captionTextview.progressToExpand != 1.0f || this.disableTouches || (motionEvent.getAction() == 0 && motionEvent.getY() < (this.captionContainer.getTop() - getScrollY()) + this.captionTextview.getTranslationY())) {
            if (this.touched) {
                this.touched = false;
                invalidate();
            }
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.touched = true;
            invalidate();
        } else if (this.touched && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.touched = false;
            invalidate();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.captionTextview.progressToExpand != 1.0f || this.disableTouches || (motionEvent.getAction() == 0 && motionEvent.getY() < (this.captionContainer.getTop() - getScrollY()) + this.captionTextview.getTranslationY())) {
            if (this.touched) {
                this.touched = false;
                invalidate();
            }
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.touched = true;
            invalidate();
        } else if (this.touched && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.touched = false;
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        updateTopMargin(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    public int getPendingMarginTopDiff() {
        int i = this.pendingTopMargin;
        if (i >= 0) {
            return i - ((ViewGroup.MarginLayoutParams) this.captionContainer.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public void updateTopMargin() {
        updateTopMargin(getWidth(), getHeight());
    }

    private void updateTopMargin(int i, int i2) {
        int iCalculateNewContainerMarginTop = calculateNewContainerMarginTop(i, i2);
        if (iCalculateNewContainerMarginTop >= 0) {
            if (this.dontChangeTopMargin) {
                this.pendingTopMargin = iCalculateNewContainerMarginTop;
            } else {
                ((ViewGroup.MarginLayoutParams) this.captionContainer.getLayoutParams()).topMargin = iCalculateNewContainerMarginTop;
                this.pendingTopMargin = -1;
            }
        }
    }

    public int calculateNewContainerMarginTop(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return -1;
        }
        StoryCaptionTextView storyCaptionTextView = this.captionTextview;
        StoryCaptionTextView.TextState textState = storyCaptionTextView.state[0];
        CharSequence charSequence = textState.text;
        Reply reply = textState.reply;
        CharSequence charSequence2 = reply != null ? reply.title : null;
        CharSequence charSequence3 = reply != null ? reply.text : null;
        int iHashCode = charSequence.hashCode();
        int iHashCode2 = charSequence2 != null ? charSequence2.hashCode() : 0;
        int iHashCode3 = charSequence3 != null ? charSequence3.hashCode() : 0;
        Point point = AndroidUtilities.displaySize;
        boolean z = point.x > point.y;
        if (this.textHash == iHashCode && this.replytitleHash == iHashCode2 && this.replytextHash == iHashCode3 && this.isLandscape == z && this.prevHeight == i2 && !storyCaptionTextView.updating) {
            return -1;
        }
        this.textHash = iHashCode;
        this.replytitleHash = iHashCode2;
        this.replytextHash = iHashCode3;
        this.isLandscape = z;
        this.prevHeight = i2;
        storyCaptionTextView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
        return storyCaptionTextView.collapsedTextHeight(i2);
    }

    public void reset() {
        scrollTo(0, 0);
        this.expanded = false;
        StoryCaptionTextView storyCaptionTextView = this.captionTextview;
        storyCaptionTextView.progressToExpand = 0.0f;
        storyCaptionTextView.invalidate();
    }

    @Override
    public void fling(int i) {
        super.fling(i);
        this.velocitySign = Math.signum(i);
        this.velocityY = 0.0f;
    }

    @Override
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        iArr[1] = 0;
        if (this.nestedScrollStarted) {
            float f = this.overScrollY;
            if ((f > 0.0f && i2 > 0) || (f < 0.0f && i2 < 0)) {
                float f2 = i2;
                float f3 = f - f2;
                if (f > 0.0f) {
                    if (f3 < 0.0f) {
                        this.overScrollY = 0.0f;
                        iArr[1] = (int) (0 + f2 + f3);
                    } else {
                        this.overScrollY = f3;
                        iArr[1] = i2;
                    }
                } else if (f3 > 0.0f) {
                    this.overScrollY = 0.0f;
                    iArr[1] = (int) (0 + f2 + f3);
                } else {
                    this.overScrollY = f3;
                    iArr[1] = i2;
                }
                this.captionTextview.setTranslationY(this.overScrollY);
                this.textSelectionHelper.invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int iRound;
        float f;
        if (i4 != 0 && (iRound = Math.round(i4 * (1.0f - Math.abs((-this.overScrollY) / this.captionContainer.getTop())))) != 0) {
            if (!this.nestedScrollStarted) {
                if (!this.springAnimation.isRunning()) {
                    OverScroller overScroller = this.scroller;
                    float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                    if (Float.isNaN(currVelocity)) {
                        f = 0.0f;
                    } else {
                        Point point = AndroidUtilities.displaySize;
                        float fMin = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                        iRound = (int) ((iRound * fMin) / currVelocity);
                        f = fMin * (-this.velocitySign);
                    }
                    if (iRound != 0) {
                        float f2 = this.overScrollY - iRound;
                        this.overScrollY = f2;
                        this.captionTextview.setTranslationY(f2);
                    }
                    startSpringAnimationIfNotRunning(f);
                }
            } else {
                float f3 = this.overScrollY - iRound;
                this.overScrollY = f3;
                this.captionTextview.setTranslationY(f3);
            }
        }
        this.textSelectionHelper.invalidate();
    }

    private void startSpringAnimationIfNotRunning(float f) {
        if (!this.springAnimation.isRunning()) {
            this.springAnimation.setStartVelocity(f);
            this.springAnimation.start();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            collapse();
        }
    }

    @Override
    public boolean startNestedScroll(int i, int i2) {
        if (i2 == 0) {
            this.springAnimation.cancel();
            this.nestedScrollStarted = true;
            this.overScrollY = this.captionTextview.getTranslationY();
        }
        return true;
    }

    @Override
    public void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (this.nestedScrollStarted || this.overScrollY == 0.0f || (overScroller = this.scroller) == null || !overScroller.isFinished()) {
            return;
        }
        startSpringAnimationIfNotRunning(0.0f);
    }

    @Override
    public void stopNestedScroll(int i) {
        OverScroller overScroller;
        if (this.nestedScrollStarted && i == 0) {
            this.nestedScrollStarted = false;
            if (this.overScrollY == 0.0f || (overScroller = this.scroller) == null || !overScroller.isFinished()) {
                return;
            }
            startSpringAnimationIfNotRunning(this.velocityY);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.disableDraw) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int iSave = canvas.save();
        int i = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.blackoutBottomOffset + i);
        canvas.clipRect(0, scrollY, width, i);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public float getTextTop() {
        return (this.captionContainer.getTop() + this.captionTextview.getTranslationY()) - getScrollY();
    }

    public float getMaxTop() {
        return this.captionContainer.getTop() - (this.captionContainer.getBottom() - getMeasuredHeight());
    }

    public boolean allowInterceptTouchEvent(float f, float f2) {
        return this.captionTextview.progressToExpand == 1.0f && !this.disableTouches && f2 > ((float) (this.captionContainer.getTop() - getScrollY())) + this.captionTextview.getTranslationY();
    }

    @Override
    public void scrollBy(int i, int i2) {
        super.scrollBy(i, i2);
        invalidate();
    }

    @Override
    public void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.textSelectionHelper.invalidate();
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.captionTextview.getTranslationY()) / Math.min(this.prevHeight, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public void expand() {
        expand(false);
    }

    public void expand(boolean z) {
        if (!this.expanded || z) {
            this.expanded = true;
            final float scrollY = getScrollY();
            final float f = this.captionTextview.progressToExpand;
            final float f2 = 1.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$expand$1(scrollY, f, f2, valueAnimator);
                }
            });
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.start();
        }
    }

    public void lambda$expand$1(float f, float f2, float f3, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setScrollY((int) AndroidUtilities.lerp(f, Math.min((getMeasuredHeight() - this.blackoutBottomOffset) - AndroidUtilities.dp(64.0f), this.captionContainer.getBottom() - getMeasuredHeight()), fFloatValue));
        this.captionTextview.progressToExpand = AndroidUtilities.lerp(f2, f3, fFloatValue);
        this.captionTextview.invalidate();
    }

    public void collapse() {
        if (this.expanded) {
            this.expanded = false;
            final float scrollY = getScrollY();
            final float f = this.captionTextview.progressToExpand;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            final float f2 = 0.0f;
            final float f3 = 0.0f;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$collapse$2(scrollY, f2, f, f3, valueAnimator);
                }
            });
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.start();
        }
    }

    public void lambda$collapse$2(float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setScrollY((int) AndroidUtilities.lerp(f, f2, fFloatValue));
        this.captionTextview.progressToExpand = AndroidUtilities.lerp(f3, f4, fFloatValue);
        this.captionTextview.invalidate();
    }

    public void disableDraw(boolean z) {
        if (this.disableDraw != z) {
            this.disableDraw = z;
            invalidate();
        }
    }

    public boolean isTouched() {
        return this.touched;
    }

    public void cancelTouch() {
        this.touched = false;
    }

    public boolean hasScroll() {
        return this.captionContainer.getBottom() - getMeasuredHeight() > 0;
    }

    public void checkCancelTextSelection() {
        if (!this.textSelectionHelper.isInSelectionMode() || Math.abs(this.startMotionX - this.lastMotionX) >= AndroidUtilities.touchSlop || Math.abs(this.startMotionY - this.lastMotionY) >= AndroidUtilities.touchSlop) {
            return;
        }
        this.textSelectionHelper.getOverlayView(getContext()).checkCancel(this.lastMotionX, this.lastMotionY, false);
    }

    public static class Reply {
        private int currentAccount;
        public boolean isRepostMessage;
        private boolean loaded;
        private boolean loading;
        public Integer messageId;
        public Long peerId;
        public ReplyMessageLine repostLine;
        public Integer storyId;
        public CharSequence text;
        public Text textLayout;
        public CharSequence title;
        public Text titleLayout;
        public boolean updateText;
        private View view;
        private Runnable whenLoaded;
        private int width;
        private boolean small = true;
        private final AnimatedFloat animatedSmall = new AnimatedFloat(0, 350, CubicBezierInterpolator.EASE_OUT_QUINT);
        public final ButtonBounce bounce = new ButtonBounce(null);
        public final Drawable ripple = Theme.createRadSelectorDrawable(553648127, 0, 0);
        private final Paint backgroundPaint = new Paint(1);
        private final Paint linePaint = new Paint(1);
        private final Path clipRipple = new Path();
        public final RectF bounds = new RectF();

        public void listen(View view, Runnable runnable) {
            this.view = view;
            this.whenLoaded = runnable;
            this.repostLine = new ReplyMessageLine(view);
            this.ripple.setCallback(view);
            this.animatedSmall.setParent(view);
            this.bounce.setView(view);
            load();
        }

        public void load() {
            if (this.loaded || this.loading || this.peerId == null || this.storyId == null || this.view == null) {
                return;
            }
            this.loading = true;
            MessagesController.getInstance(this.currentAccount).getStoriesController().resolveStoryLink(this.peerId.longValue(), this.storyId.intValue(), new Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f$0.lambda$load$0((TL_stories.StoryItem) obj);
                }
            });
        }

        public void lambda$load$0(TL_stories.StoryItem storyItem) {
            String str;
            this.loaded = true;
            if (storyItem == null || (str = storyItem.caption) == null) {
                return;
            }
            this.updateText = true;
            this.text = str;
            this.small = TextUtils.isEmpty(str);
            View view = this.view;
            if (view != null) {
                view.invalidate();
            }
            Runnable runnable = this.whenLoaded;
            if (runnable != null) {
                runnable.run();
            }
        }

        public static Reply from(int i, TL_stories.StoryItem storyItem) {
            TLRPC.Chat chat;
            Reply reply = null;
            if (storyItem == null) {
                return null;
            }
            if (storyItem.fwd_from != null) {
                Reply reply2 = new Reply();
                reply2.currentAccount = i;
                TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                TLRPC.Peer peer = storyFwdHeader.from;
                if (peer != null) {
                    long peerDialogId = DialogObject.getPeerDialogId(peer);
                    reply2.peerId = Long.valueOf(peerDialogId);
                    if (peerDialogId >= 0) {
                        reply2.title = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId))));
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId));
                        reply2.title = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat2) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) (chat2 != null ? chat2.title : ""));
                    }
                } else if (storyFwdHeader.from_name != null) {
                    reply2.title = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                }
                reply2.small = true;
                TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                if ((storyFwdHeader2.flags & 4) != 0) {
                    reply2.storyId = Integer.valueOf(storyFwdHeader2.story_id);
                }
                reply2.load();
                return reply2;
            }
            if (storyItem.media_areas != null) {
                TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                for (int i2 = 0; i2 < storyItem.media_areas.size(); i2++) {
                    if (storyItem.media_areas.get(i2) instanceof TL_stories.TL_mediaAreaChannelPost) {
                        tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(i2);
                    }
                }
                if (tL_mediaAreaChannelPost != null && (chat = MessagesController.getInstance(i).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                    reply = new Reply();
                    reply.peerId = Long.valueOf(-chat.id);
                    reply.isRepostMessage = true;
                    reply.currentAccount = i;
                    reply.small = true;
                    reply.messageId = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                    reply.title = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
                }
            }
            return reply;
        }

        public static Reply from(StoriesController.UploadingStory uploadingStory) {
            StoryEntry storyEntry;
            ArrayList arrayList;
            TLRPC.Chat chat;
            Reply reply = null;
            if (uploadingStory != null && (storyEntry = uploadingStory.entry) != null) {
                if (storyEntry.isRepost) {
                    Reply reply2 = new Reply();
                    StoryEntry storyEntry2 = uploadingStory.entry;
                    reply2.title = storyEntry2.repostPeerName;
                    String str = storyEntry2.repostCaption;
                    reply2.text = str;
                    reply2.small = TextUtils.isEmpty(str);
                    return reply2;
                }
                if (storyEntry.isRepostMessage && (arrayList = storyEntry.messageObjects) != null && arrayList.size() > 0) {
                    MessageObject messageObject = (MessageObject) uploadingStory.entry.messageObjects.get(0);
                    long repostDialogId = StoryEntry.getRepostDialogId(messageObject);
                    if (repostDialogId < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-repostDialogId))) != null) {
                        reply = new Reply();
                        reply.peerId = Long.valueOf(repostDialogId);
                        reply.isRepostMessage = true;
                        reply.currentAccount = messageObject.currentAccount;
                        reply.small = true;
                        reply.messageId = Integer.valueOf(StoryEntry.getRepostMessageId(messageObject));
                        reply.title = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
                    }
                }
            }
            return reply;
        }

        public int height() {
            return AndroidUtilities.dp(this.small ? 22.0f : 42.0f);
        }

        public int width() {
            return this.width;
        }

        public void setPressed(boolean z, float f, float f2) {
            this.bounce.setPressed(z);
            this.ripple.setState(z ? new int[]{16842919, 16842910} : new int[0]);
            if (z) {
                this.ripple.setHotspot(f, f2);
            }
        }

        public void draw(Canvas canvas, float f) {
            if (this.titleLayout == null) {
                CharSequence charSequence = this.title;
                if (charSequence == null) {
                    charSequence = "";
                }
                this.titleLayout = new Text(charSequence, 14.0f, AndroidUtilities.bold());
            }
            if (this.textLayout == null || this.updateText) {
                ?? r5 = this.text;
                this.textLayout = new Text(r5 != 0 ? r5 : "", 14.0f);
            }
            float f2 = this.animatedSmall.set(this.small);
            this.backgroundPaint.setColor(1073741824);
            int iMin = (int) Math.min(f, AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), f2) + Math.max(this.titleLayout.getCurrentWidth(), this.textLayout.getCurrentWidth()));
            this.width = iMin;
            int iLerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), f2);
            float f3 = iMin;
            this.bounds.set(0.0f, 0.0f, f3, iLerp);
            canvas.save();
            float scale = this.bounce.getScale(0.02f);
            canvas.scale(scale, scale, this.bounds.centerX(), this.bounds.centerY());
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), f2);
            canvas.drawRoundRect(this.bounds, fLerp, fLerp, this.backgroundPaint);
            canvas.save();
            this.clipRipple.rewind();
            this.clipRipple.addRoundRect(this.bounds, fLerp, fLerp, Path.Direction.CW);
            canvas.clipPath(this.clipRipple);
            this.ripple.setBounds(0, 0, iMin, iLerp);
            this.ripple.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
            this.linePaint.setColor(-1);
            float f4 = 1.0f - f2;
            this.linePaint.setAlpha((int) (255.0f * f4));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.linePaint);
            canvas.restore();
            int iDp = iMin - AndroidUtilities.dp(20.0f);
            if (f3 < f) {
                iDp = (int) Math.min(iDp + AndroidUtilities.dp(12.0f), f - AndroidUtilities.dp(20.0f));
            }
            float f5 = iDp;
            this.titleLayout.ellipsize(f5).draw(canvas, AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), f2), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), f2), -1, 1.0f);
            this.textLayout.ellipsize(f5).draw(canvas, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), -1, f4);
            canvas.restore();
        }
    }

    public class StoryCaptionTextView extends View implements TextSelectionHelper.SimpleSelectabeleView {
        public boolean allowClickSpoilers;
        private final PorterDuffColorFilter emojiColorFilter;
        int horizontalPadding;
        private boolean isSpoilersRevealed;
        private Path path;
        float progressToExpand;
        boolean shouldCollapse;
        StaticLayout showMore;
        TextPaint showMorePaint;
        float showMoreX;
        float showMoreY;
        int sizeCached;
        TextState[] state;
        TextPaint textPaint;
        private ValueAnimator updateAnimator;
        public float updateT;
        public boolean updating;
        int verticalPadding;
        private final Paint xRefGradinetPaint;
        private final Paint xRefPaint;

        public int collapsedTextHeight(int i) {
            int iCollapsedTextHeight = this.state[0].collapsedTextHeight(i);
            TextState textState = this.state[1];
            return AndroidUtilities.lerp(iCollapsedTextHeight, textState != null ? textState.collapsedTextHeight(i) : 0, this.updateT);
        }

        public class TextState {
            private final SpoilersClickDetector clickDetector;
            StaticLayout firstLayout;
            private AnimatedEmojiSpan.EmojiGroupedSpans firstLayoutEmoji;
            StaticLayout fullLayout;
            private AnimatedEmojiSpan.EmojiGroupedSpans fullLayoutEmoji;
            private final LinkSpanDrawable.LinkCollector links;
            private final LoadingDrawable loadingDrawable;
            private Path loadingPath;
            LineInfo[] nextLinesLayouts;
            final AtomicReference patchedLayout;
            private AnimatedEmojiSpan pressedEmoji;
            private LinkSpanDrawable pressedLink;
            public Reply reply;
            protected final List spoilers;
            private final Stack spoilersPool;
            CharSequence text;
            int textHeight;
            public final AnimatedFloat translateT;
            public boolean translating;

            public int collapsedTextHeight(int i) {
                int i2;
                int i3;
                Reply reply = this.reply;
                int iHeight = reply != null ? reply.height() + AndroidUtilities.dp(8.0f) : 0;
                StaticLayout staticLayout = this.fullLayout;
                if (staticLayout == null) {
                    i2 = StoryCaptionTextView.this.verticalPadding * 2;
                    i3 = this.textHeight;
                } else {
                    int lineCount = staticLayout.getLineCount();
                    StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                    if (!storyCaptionTextView.shouldCollapse) {
                        i2 = storyCaptionTextView.verticalPadding * 2;
                        i3 = this.textHeight;
                    } else {
                        i -= StoryCaptionTextView.this.textPaint.getFontMetricsInt(null) * (Math.min(3, lineCount) + 1);
                        return i - iHeight;
                    }
                }
                iHeight = i2 + i3;
                return i - iHeight;
            }

            public TextState() {
                this.links = new LinkSpanDrawable.LinkCollector(StoryCaptionTextView.this);
                ArrayList arrayList = new ArrayList();
                this.spoilers = arrayList;
                this.spoilersPool = new Stack();
                this.text = "";
                this.translateT = new AnimatedFloat(StoryCaptionView.this, 0L, 400L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.loadingPath = new Path();
                this.patchedLayout = new AtomicReference();
                this.clickDetector = new SpoilersClickDetector(StoryCaptionTextView.this, arrayList, new SpoilersClickDetector.OnSpoilerClickedListener() {
                    @Override
                    public final void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
                        this.f$0.lambda$new$2(spoilerEffect, f, f2);
                    }
                });
                LoadingDrawable loadingDrawable = new LoadingDrawable();
                this.loadingDrawable = loadingDrawable;
                loadingDrawable.usePath(this.loadingPath);
                loadingDrawable.setRadiiDp(4.0f);
                loadingDrawable.setColors(Theme.multAlpha(-1, 0.3f), Theme.multAlpha(-1, 0.1f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.7f));
                loadingDrawable.setCallback(StoryCaptionTextView.this);
            }

            public void lambda$new$2(SpoilerEffect spoilerEffect, float f, float f2) {
                if (StoryCaptionTextView.this.isSpoilersRevealed) {
                    return;
                }
                spoilerEffect.setOnRippleEndCallback(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$new$1();
                    }
                });
                float fSqrt = (float) Math.sqrt(Math.pow(StoryCaptionTextView.this.getWidth(), 2.0d) + Math.pow(StoryCaptionTextView.this.getHeight(), 2.0d));
                Iterator it = this.spoilers.iterator();
                while (it.hasNext()) {
                    ((SpoilerEffect) it.next()).startRipple(f, f2, fSqrt);
                }
            }

            public void lambda$new$1() {
                StoryCaptionTextView.this.post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$new$0();
                    }
                });
            }

            public void lambda$new$0() {
                StoryCaptionTextView.this.isSpoilersRevealed = true;
            }

            public void setup(CharSequence charSequence, Reply reply) {
                this.text = charSequence;
                this.reply = reply;
                if (reply != null) {
                    reply.listen(StoryCaptionTextView.this, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$setup$3();
                        }
                    });
                }
                StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                storyCaptionTextView.sizeCached = 0;
                storyCaptionTextView.requestLayout();
            }

            public void lambda$setup$3() {
                StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                storyCaptionTextView.sizeCached = 0;
                storyCaptionTextView.requestLayout();
                StoryCaptionView.this.updateTopMargin();
                StoryCaptionView.this.requestLayout();
            }

            public void measure(int i) {
                int iHeight;
                if (TextUtils.isEmpty(this.text)) {
                    this.fullLayout = null;
                    this.textHeight = 0;
                    Reply reply = this.reply;
                    if (reply != null) {
                        this.textHeight = reply.height() + AndroidUtilities.dp(4.0f);
                    }
                    StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                    if (this == storyCaptionTextView.state[0]) {
                        storyCaptionTextView.showMore = null;
                    }
                    this.firstLayout = null;
                    this.spoilersPool.addAll(this.spoilers);
                    this.spoilers.clear();
                    return;
                }
                StoryCaptionTextView storyCaptionTextView2 = StoryCaptionTextView.this;
                StaticLayout staticLayoutMakeTextLayout = storyCaptionTextView2.makeTextLayout(storyCaptionTextView2.textPaint, this.text, i);
                this.fullLayout = staticLayoutMakeTextLayout;
                int height = staticLayoutMakeTextLayout.getHeight();
                this.textHeight = height;
                Reply reply2 = this.reply;
                if (reply2 != null) {
                    iHeight = reply2.height() + AndroidUtilities.dp(8.0f);
                    this.textHeight = height + iHeight;
                } else {
                    iHeight = 0;
                }
                float fMeasureText = StoryCaptionTextView.this.textPaint.measureText(" ");
                StoryCaptionTextView.this.shouldCollapse = this.fullLayout.getLineCount() > 3;
                if (StoryCaptionTextView.this.shouldCollapse && this.fullLayout.getLineCount() == 4) {
                    if (TextUtils.getTrimmedLength(this.text.subSequence(this.fullLayout.getLineStart(2), this.fullLayout.getLineEnd(2))) == 0) {
                        StoryCaptionTextView.this.shouldCollapse = false;
                    }
                }
                StoryCaptionTextView storyCaptionTextView3 = StoryCaptionTextView.this;
                if (storyCaptionTextView3.shouldCollapse) {
                    float lineTop = this.fullLayout.getLineTop(2) + this.fullLayout.getTopPadding();
                    if (this == StoryCaptionTextView.this.state[0]) {
                        String string = LocaleController.getString(R.string.ShowMore);
                        StoryCaptionTextView storyCaptionTextView4 = StoryCaptionTextView.this;
                        storyCaptionTextView4.showMore = storyCaptionTextView4.makeTextLayout(storyCaptionTextView4.showMorePaint, string, i);
                        StoryCaptionTextView.this.showMoreY = ((r8.verticalPadding + iHeight) + lineTop) - AndroidUtilities.dpf2(0.3f);
                        StoryCaptionTextView storyCaptionTextView5 = StoryCaptionTextView.this;
                        storyCaptionTextView5.showMoreX = (storyCaptionTextView5.horizontalPadding + i) - storyCaptionTextView5.showMorePaint.measureText(string);
                    }
                    StoryCaptionTextView storyCaptionTextView6 = StoryCaptionTextView.this;
                    this.firstLayout = storyCaptionTextView6.makeTextLayout(storyCaptionTextView6.textPaint, this.text.subSequence(0, this.fullLayout.getLineEnd(2)), i);
                    this.spoilersPool.addAll(this.spoilers);
                    this.spoilers.clear();
                    SpoilerEffect.addSpoilers(StoryCaptionView.this, this.fullLayout, this.spoilersPool, this.spoilers);
                    float lineRight = this.fullLayout.getLineRight(2) + fMeasureText;
                    if (this.nextLinesLayouts != null) {
                        int i2 = 0;
                        while (true) {
                            LineInfo[] lineInfoArr = this.nextLinesLayouts;
                            if (i2 >= lineInfoArr.length) {
                                break;
                            }
                            LineInfo lineInfo = lineInfoArr[i2];
                            if (lineInfo != null) {
                                AnimatedEmojiSpan.release(StoryCaptionView.this, lineInfo.layoutEmoji);
                            }
                            i2++;
                        }
                    }
                    this.nextLinesLayouts = new LineInfo[this.fullLayout.getLineCount() - 3];
                    if (this.spoilers.isEmpty()) {
                        for (int i3 = 3; i3 < this.fullLayout.getLineCount(); i3++) {
                            int lineStart = this.fullLayout.getLineStart(i3);
                            int lineEnd = this.fullLayout.getLineEnd(i3);
                            CharSequence charSequenceSubSequence = this.text.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                            if (TextUtils.isEmpty(charSequenceSubSequence)) {
                                this.nextLinesLayouts[i3 - 3] = null;
                            } else {
                                StoryCaptionTextView storyCaptionTextView7 = StoryCaptionTextView.this;
                                StaticLayout staticLayoutMakeTextLayout2 = storyCaptionTextView7.makeTextLayout(storyCaptionTextView7.textPaint, charSequenceSubSequence, i);
                                LineInfo lineInfo2 = StoryCaptionTextView.this.new LineInfo();
                                this.nextLinesLayouts[i3 - 3] = lineInfo2;
                                lineInfo2.staticLayout = staticLayoutMakeTextLayout2;
                                lineInfo2.finalX = this.fullLayout.getLineLeft(i3);
                                lineInfo2.finalY = this.fullLayout.getLineTop(i3) + this.fullLayout.getTopPadding();
                                if (lineRight < StoryCaptionTextView.this.showMoreX - AndroidUtilities.dp(16.0f)) {
                                    lineInfo2.collapsedY = lineTop;
                                    lineInfo2.collapsedX = lineRight;
                                    lineRight += Math.abs(staticLayoutMakeTextLayout2.getLineRight(0) - staticLayoutMakeTextLayout2.getLineLeft(0)) + fMeasureText;
                                } else {
                                    lineInfo2.collapsedY = lineInfo2.finalY;
                                    lineInfo2.collapsedX = lineInfo2.finalX;
                                }
                            }
                        }
                    }
                } else {
                    if (this == storyCaptionTextView3.state[0]) {
                        storyCaptionTextView3.showMore = null;
                    }
                    this.firstLayout = null;
                    this.spoilersPool.addAll(this.spoilers);
                    this.spoilers.clear();
                    SpoilerEffect.addSpoilers(StoryCaptionTextView.this, this.fullLayout, this.spoilersPool, this.spoilers);
                }
                SpoilersClickDetector spoilersClickDetector = this.clickDetector;
                StoryCaptionTextView storyCaptionTextView8 = StoryCaptionTextView.this;
                spoilersClickDetector.setAdditionalOffsets(storyCaptionTextView8.horizontalPadding, storyCaptionTextView8.verticalPadding);
            }

            public void draw(Canvas canvas, float f) {
                float f2 = this.translateT.set(this.translating);
                if (f <= 0.0f) {
                    return;
                }
                float fLerp = AndroidUtilities.lerp(f, 0.7f * f, f2);
                if (fLerp >= 1.0f) {
                    drawInternal(canvas, f2);
                } else {
                    canvas.saveLayerAlpha(0.0f, 0.0f, StoryCaptionView.this.getWidth(), StoryCaptionView.this.getHeight(), (int) (fLerp * 255.0f), 31);
                    drawInternal(canvas, f2);
                    canvas.restore();
                }
                if (f2 > 0.0f || this.translating) {
                    this.loadingDrawable.setAlpha((int) (f2 * 255.0f * fLerp));
                    this.loadingDrawable.draw(canvas);
                    StoryCaptionTextView.this.invalidate();
                }
            }

            private void putLayoutRects(Layout layout, float f, float f2) {
                float lineTop = 0.0f;
                int i = 0;
                while (i < layout.getLineCount()) {
                    float lineLeft = layout.getLineLeft(i) - (StoryCaptionTextView.this.horizontalPadding / 3.0f);
                    float lineRight = layout.getLineRight(i) + (StoryCaptionTextView.this.horizontalPadding / 3.0f);
                    if (i == 0) {
                        lineTop = layout.getLineTop(i) - (StoryCaptionTextView.this.verticalPadding / 3.0f);
                    }
                    float lineBottom = layout.getLineBottom(i);
                    if (i >= layout.getLineCount() - 1) {
                        lineBottom += StoryCaptionTextView.this.verticalPadding / 3.0f;
                    }
                    this.loadingPath.addRect(f + lineLeft, f2 + lineTop, f + lineRight, f2 + lineBottom, Path.Direction.CW);
                    i++;
                    lineTop = lineBottom;
                }
            }

            private void drawInternal(Canvas canvas, float f) {
                int i;
                int i2;
                if (this.reply != null) {
                    canvas.save();
                    StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                    canvas.translate(storyCaptionTextView.horizontalPadding, storyCaptionTextView.verticalPadding);
                    Reply reply = this.reply;
                    int width = StoryCaptionTextView.this.getWidth();
                    int i3 = StoryCaptionTextView.this.horizontalPadding;
                    reply.draw(canvas, (width - i3) - i3);
                    int iHeight = this.reply.height() + AndroidUtilities.dp(8.0f);
                    canvas.restore();
                    i = iHeight;
                } else {
                    i = 0;
                }
                canvas.save();
                StoryCaptionTextView storyCaptionTextView2 = StoryCaptionTextView.this;
                canvas.translate(storyCaptionTextView2.horizontalPadding, storyCaptionTextView2.verticalPadding + i);
                if (this.links.draw(canvas)) {
                    StoryCaptionTextView.this.invalidate();
                }
                canvas.restore();
                boolean z = f > 0.0f;
                this.loadingPath.rewind();
                if (!this.spoilers.isEmpty() || this.firstLayout == null) {
                    if (this.fullLayout != null) {
                        canvas.save();
                        StoryCaptionTextView storyCaptionTextView3 = StoryCaptionTextView.this;
                        canvas.translate(storyCaptionTextView3.horizontalPadding, storyCaptionTextView3.verticalPadding + i);
                        if (StoryCaptionView.this.textSelectionHelper.isInSelectionMode()) {
                            StoryCaptionView.this.textSelectionHelper.draw(canvas);
                        }
                        drawLayout(this.fullLayout, canvas, this.spoilers);
                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpansUpdate = AnimatedEmojiSpan.update(0, StoryCaptionTextView.this, this.fullLayoutEmoji, this.fullLayout);
                        this.fullLayoutEmoji = emojiGroupedSpansUpdate;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.fullLayout, emojiGroupedSpansUpdate, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, StoryCaptionTextView.this.emojiColorFilter);
                        canvas.restore();
                        if (z) {
                            StaticLayout staticLayout = this.fullLayout;
                            StoryCaptionTextView storyCaptionTextView4 = StoryCaptionTextView.this;
                            putLayoutRects(staticLayout, storyCaptionTextView4.horizontalPadding, storyCaptionTextView4.verticalPadding + i);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (StoryCaptionView.this.textSelectionHelper.isInSelectionMode()) {
                    canvas.save();
                    StoryCaptionTextView storyCaptionTextView5 = StoryCaptionTextView.this;
                    canvas.translate(storyCaptionTextView5.horizontalPadding, storyCaptionTextView5.verticalPadding + i);
                    StoryCaptionView.this.textSelectionHelper.draw(canvas);
                    canvas.restore();
                }
                if (this.firstLayout != null) {
                    canvas.save();
                    StoryCaptionTextView storyCaptionTextView6 = StoryCaptionTextView.this;
                    canvas.translate(storyCaptionTextView6.horizontalPadding, storyCaptionTextView6.verticalPadding + i);
                    drawLayout(this.firstLayout, canvas, this.spoilers);
                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpansUpdate2 = AnimatedEmojiSpan.update(0, StoryCaptionTextView.this, this.firstLayoutEmoji, this.firstLayout);
                    this.firstLayoutEmoji = emojiGroupedSpansUpdate2;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.firstLayout, emojiGroupedSpansUpdate2, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, StoryCaptionTextView.this.emojiColorFilter);
                    canvas.restore();
                    if (z) {
                        StaticLayout staticLayout2 = this.firstLayout;
                        StoryCaptionTextView storyCaptionTextView7 = StoryCaptionTextView.this;
                        putLayoutRects(staticLayout2, storyCaptionTextView7.horizontalPadding, storyCaptionTextView7.verticalPadding + i);
                    }
                }
                if (this.nextLinesLayouts == null) {
                    return;
                }
                int i4 = 0;
                while (true) {
                    LineInfo[] lineInfoArr = this.nextLinesLayouts;
                    if (i4 >= lineInfoArr.length) {
                        return;
                    }
                    LineInfo lineInfo = lineInfoArr[i4];
                    if (lineInfo == null) {
                        i2 = i4;
                    } else {
                        canvas.save();
                        float f2 = lineInfo.collapsedX;
                        float f3 = lineInfo.finalX;
                        if (f2 == f3) {
                            if (StoryCaptionTextView.this.progressToExpand != 0.0f) {
                                canvas.translate(r1.horizontalPadding + f3, r1.verticalPadding + i + lineInfo.finalY);
                                canvas.saveLayerAlpha(0.0f, 0.0f, lineInfo.staticLayout.getWidth(), lineInfo.staticLayout.getHeight(), (int) (StoryCaptionTextView.this.progressToExpand * 255.0f), 31);
                                drawLayout(lineInfo.staticLayout, canvas, this.spoilers);
                                if (z) {
                                    StaticLayout staticLayout3 = lineInfo.staticLayout;
                                    StoryCaptionTextView storyCaptionTextView8 = StoryCaptionTextView.this;
                                    putLayoutRects(staticLayout3, storyCaptionTextView8.horizontalPadding + lineInfo.finalX, storyCaptionTextView8.verticalPadding + i + lineInfo.finalY);
                                }
                                lineInfo.staticLayout.draw(canvas);
                                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpansUpdate3 = AnimatedEmojiSpan.update(0, StoryCaptionTextView.this, lineInfo.layoutEmoji, lineInfo.staticLayout);
                                lineInfo.layoutEmoji = emojiGroupedSpansUpdate3;
                                StaticLayout staticLayout4 = lineInfo.staticLayout;
                                List list = this.spoilers;
                                StoryCaptionTextView storyCaptionTextView9 = StoryCaptionTextView.this;
                                i2 = i4;
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout4, emojiGroupedSpansUpdate3, 0.0f, list, 0.0f, 0.0f, 0.0f, storyCaptionTextView9.progressToExpand, storyCaptionTextView9.emojiColorFilter);
                                canvas.restore();
                            }
                            i2 = i4;
                        } else {
                            i2 = i4;
                            float fLerp = AndroidUtilities.lerp(f2, f3, StoryCaptionTextView.this.progressToExpand);
                            float fLerp2 = AndroidUtilities.lerp(lineInfo.collapsedY, lineInfo.finalY, CubicBezierInterpolator.EASE_OUT.getInterpolation(StoryCaptionTextView.this.progressToExpand));
                            StoryCaptionTextView storyCaptionTextView10 = StoryCaptionTextView.this;
                            canvas.translate(storyCaptionTextView10.horizontalPadding + fLerp, storyCaptionTextView10.verticalPadding + i + fLerp2);
                            if (z) {
                                StaticLayout staticLayout5 = lineInfo.staticLayout;
                                StoryCaptionTextView storyCaptionTextView11 = StoryCaptionTextView.this;
                                putLayoutRects(staticLayout5, storyCaptionTextView11.horizontalPadding + fLerp, storyCaptionTextView11.verticalPadding + i + fLerp2);
                            }
                            lineInfo.staticLayout.draw(canvas);
                            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpansUpdate4 = AnimatedEmojiSpan.update(0, StoryCaptionTextView.this, lineInfo.layoutEmoji, lineInfo.staticLayout);
                            lineInfo.layoutEmoji = emojiGroupedSpansUpdate4;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, lineInfo.staticLayout, emojiGroupedSpansUpdate4, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, StoryCaptionTextView.this.emojiColorFilter);
                        }
                        canvas.restore();
                    }
                    i4 = i2 + 1;
                }
            }

            private void drawLayout(StaticLayout staticLayout, Canvas canvas, List list) {
                if (!list.isEmpty()) {
                    SpoilerEffect.renderWithRipple(StoryCaptionTextView.this, false, -1, 0, this.patchedLayout, 0, staticLayout, list, canvas, false);
                } else {
                    staticLayout.draw(canvas);
                }
            }

            public boolean touch(android.view.MotionEvent r12) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoryCaptionView.StoryCaptionTextView.TextState.touch(android.view.MotionEvent):boolean");
            }

            public void lambda$touch$4(LinkSpanDrawable linkSpanDrawable) {
                LinkSpanDrawable linkSpanDrawable2 = this.pressedLink;
                if (linkSpanDrawable == linkSpanDrawable2 && linkSpanDrawable2 != null && (linkSpanDrawable2.getSpan() instanceof URLSpan)) {
                    StoryCaptionView storyCaptionView = StoryCaptionView.this;
                    URLSpan uRLSpan = (URLSpan) this.pressedLink.getSpan();
                    StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                    final LinkSpanDrawable.LinkCollector linkCollector = this.links;
                    Objects.requireNonNull(linkCollector);
                    storyCaptionView.onLinkLongPress(uRLSpan, storyCaptionTextView, new Runnable() {
                        @Override
                        public final void run() {
                            linkCollector.clear();
                        }
                    });
                    this.pressedLink = null;
                }
            }

            public void detach() {
                AnimatedEmojiSpan.release(StoryCaptionTextView.this, this.fullLayoutEmoji);
                AnimatedEmojiSpan.release(StoryCaptionTextView.this, this.firstLayoutEmoji);
                if (this.nextLinesLayouts == null) {
                    return;
                }
                int i = 0;
                while (true) {
                    LineInfo[] lineInfoArr = this.nextLinesLayouts;
                    if (i >= lineInfoArr.length) {
                        return;
                    }
                    LineInfo lineInfo = lineInfoArr[i];
                    if (lineInfo != null) {
                        AnimatedEmojiSpan.release(StoryCaptionTextView.this, lineInfo.layoutEmoji);
                    }
                    i++;
                }
            }
        }

        @Override
        public CharSequence getText() {
            return this.state[0].text;
        }

        @Override
        public Layout getStaticTextLayout() {
            return this.state[0].fullLayout;
        }

        public StoryCaptionTextView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.textPaint = new TextPaint(1);
            this.showMorePaint = new TextPaint(1);
            Paint paint = new Paint();
            this.xRefPaint = paint;
            Paint paint2 = new Paint(1);
            this.xRefGradinetPaint = paint2;
            this.state = new TextState[2];
            this.sizeCached = 0;
            this.path = new Path();
            this.allowClickSpoilers = true;
            this.updating = false;
            this.state[0] = new TextState();
            this.state[1] = null;
            this.textPaint.setColor(-1);
            TextPaint textPaint = this.textPaint;
            textPaint.linkColor = -1;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.showMorePaint.setColor(-1);
            this.showMorePaint.setTypeface(AndroidUtilities.bold());
            this.showMorePaint.setTextSize(AndroidUtilities.dp(16.0f));
            paint.setColor(-16777216);
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint.setXfermode(new PorterDuffXfermode(mode));
            paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            paint2.setXfermode(new PorterDuffXfermode(mode));
            this.emojiColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            Reply reply;
            Reply reply2;
            TextState textState = this.state[0];
            if (textState != null && (textState.loadingDrawable == drawable || ((reply2 = this.state[0].reply) != null && reply2.ripple == drawable))) {
                return true;
            }
            TextState textState2 = this.state[1];
            if (textState2 == null || (textState2.loadingDrawable != drawable && ((reply = this.state[1].reply) == null || reply.ripple != drawable))) {
                return super.verifyDrawable(drawable);
            }
            return true;
        }

        public void setText(CharSequence charSequence, Reply reply, boolean z, boolean z2) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (MediaDataController.stringsEqual(this.state[0].text, charSequence)) {
                TextState textState = this.state[0];
                if (textState.reply == reply) {
                    textState.translating = z;
                    invalidate();
                    return;
                }
            }
            this.isSpoilersRevealed = false;
            ValueAnimator valueAnimator = this.updateAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.updating = false;
            if (z2) {
                TextState[] textStateArr = this.state;
                if (textStateArr[1] == null) {
                    textStateArr[1] = new TextState();
                }
                TextState[] textStateArr2 = this.state;
                TextState textState2 = textStateArr2[1];
                TextState textState3 = textStateArr2[0];
                textState2.setup(textState3.text, textState3.reply);
                TextState[] textStateArr3 = this.state;
                TextState textState4 = textStateArr3[1];
                TextState textState5 = textStateArr3[0];
                textState4.translating = textState5.translating;
                textState4.translateT.set(textState5.translateT.get(), true);
                this.state[0].setup(charSequence, reply);
                TextState textState6 = this.state[0];
                textState6.translating = z;
                textState6.translateT.set(0.0f, true);
                this.updateT = 1.0f;
                animateUpdate();
                return;
            }
            this.state[0].setup(charSequence, reply);
            this.state[0].translating = z;
            invalidate();
            this.updateT = 0.0f;
        }

        public void animateUpdate() {
            ValueAnimator valueAnimator = this.updateAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.updating = true;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.updateT, 0.0f);
            this.updateAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$animateUpdate$0(valueAnimator2);
                }
            });
            this.updateAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    StoryCaptionTextView storyCaptionTextView = StoryCaptionTextView.this;
                    storyCaptionTextView.updating = false;
                    storyCaptionTextView.updateT = 0.0f;
                    storyCaptionTextView.invalidate();
                    StoryCaptionTextView.this.requestLayout();
                    StoryCaptionView.this.requestLayout();
                }
            });
            this.updateAnimator.setDuration(180L);
            this.updateAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.updateAnimator.start();
        }

        public void lambda$animateUpdate$0(ValueAnimator valueAnimator) {
            this.updateT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
            requestLayout();
            StoryCaptionView.this.requestLayout();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3 = (i2 + i) << 16;
            this.horizontalPadding = AndroidUtilities.dp(16.0f);
            this.verticalPadding = AndroidUtilities.dp(8.0f);
            if (this.sizeCached != i3) {
                this.sizeCached = i3;
                int iMax = Math.max(0, View.MeasureSpec.getSize(i) - (this.horizontalPadding * 2));
                this.state[0].measure(iMax);
                TextState textState = this.state[1];
                if (textState != null) {
                    textState.measure(iMax);
                }
            }
            int i4 = this.verticalPadding * 2;
            TextState[] textStateArr = this.state;
            int i5 = textStateArr[0].textHeight;
            TextState textState2 = textStateArr[1];
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i4 + AndroidUtilities.lerp(i5, textState2 != null ? textState2.textHeight : 0, this.updateT), 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.showMore != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            } else {
                canvas.save();
            }
            this.state[0].draw(canvas, 1.0f - this.updateT);
            TextState textState = this.state[1];
            if (textState != null) {
                textState.draw(canvas, this.updateT);
            }
            if (this.showMore != null) {
                float scrollY = this.showMoreY + StoryCaptionView.this.getScrollY();
                int iClamp = (int) ((1.0f - Utilities.clamp(this.progressToExpand / 0.5f, 1.0f, 0.0f)) * 255.0f);
                this.xRefGradinetPaint.setAlpha(iClamp);
                this.xRefPaint.setAlpha(iClamp);
                this.showMorePaint.setAlpha(iClamp);
                canvas.save();
                canvas.translate(this.showMoreX - AndroidUtilities.dp(32.0f), scrollY);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(32.0f), this.showMore.getHeight() + this.verticalPadding, this.xRefGradinetPaint);
                canvas.restore();
                canvas.drawRect(this.showMoreX - AndroidUtilities.dp(16.0f), scrollY, getMeasuredWidth(), this.showMore.getHeight() + scrollY + this.verticalPadding, this.xRefPaint);
                canvas.save();
                canvas.translate(this.showMoreX, scrollY);
                this.showMore.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }

        public StaticLayout makeTextLayout(TextPaint textPaint, CharSequence charSequence, int i) {
            if (Build.VERSION.SDK_INT >= 24) {
                return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setBreakStrategy(0).setHyphenationFrequency(0).setAlignment(LocaleController.isRTL ? StaticLayoutEx.ALIGN_RIGHT() : StaticLayoutEx.ALIGN_LEFT()).build();
            }
            return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }

        public Paint getPaint() {
            return this.textPaint;
        }

        public class LineInfo {
            float collapsedX;
            float collapsedY;
            float finalX;
            float finalY;
            public AnimatedEmojiSpan.EmojiGroupedSpans layoutEmoji;
            StaticLayout staticLayout;

            public LineInfo() {
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            TextState[] textStateArr;
            if (StoryCaptionView.this.disableTouches || (textStateArr = this.state) == null) {
                return false;
            }
            TextState textState = textStateArr[0];
            if (textState.fullLayout == null) {
                return false;
            }
            return textState.touch(motionEvent) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.state[0].detach();
        }

        public void clearPressedLinks() {
            this.state[0].links.clear();
            this.state[0].pressedLink = null;
            invalidate();
        }

        @Override
        public void setPressed(boolean z) {
            boolean z2 = z != isPressed();
            super.setPressed(z);
            if (z2) {
                invalidate();
            }
        }

        @Override
        public void setTranslationY(float f) {
            if (getTranslationY() != f) {
                super.setTranslationY(f);
                StoryCaptionView.this.invalidate();
            }
        }

        @Override
        public boolean dispatchTouchEvent(android.view.MotionEvent r10) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.StoryCaptionView.StoryCaptionTextView.dispatchTouchEvent(android.view.MotionEvent):boolean");
        }
    }
}
