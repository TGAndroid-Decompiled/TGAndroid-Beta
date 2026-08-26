package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CalendarActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow$$ExternalSyntheticLambda5;
import org.telegram.ui.Components.Reactions.HwEmojis;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProvider;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.recorder.HintView2;

public class ReactionsContainerLayout extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final int ALPHA_DURATION = 150;
    private static final float CLIP_PROGRESS = 0.25f;
    private static final float SIDE_SCALE = 0.6f;
    public static final Property<ReactionsContainerLayout, Float> TRANSITION_PROGRESS_VALUE = new Property<ReactionsContainerLayout, Float>(Float.class, "transitionProgress") {
        @Override
        public Float get(ReactionsContainerLayout reactionsContainerLayout) {
            return Float.valueOf(reactionsContainerLayout.transitionProgress);
        }

        @Override
        public void set(ReactionsContainerLayout reactionsContainerLayout, Float f) {
            reactionsContainerLayout.setTransitionProgress(f.floatValue());
        }
    };
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_MESSAGE_EFFECTS = 5;
    public static final int TYPE_STICKER_SET_EMOJI = 4;
    public static final int TYPE_STORY = 1;
    public static final int TYPE_STORY_LIKES = 2;
    public static final int TYPE_TAGS = 3;
    private static final int VIEW_TYPE_CUSTOM_EMOJI_BUTTON = 2;
    private static final int VIEW_TYPE_CUSTOM_REACTION = 3;
    private static final int VIEW_TYPE_PREMIUM_BUTTON = 1;
    private static final int VIEW_TYPE_REACTION = 0;
    private boolean allReactionsAvailable;
    private boolean allReactionsIsDefault;
    public List<ReactionsLayoutInBubble.VisibleReaction> allReactionsList;
    final HashSet<ReactionsLayoutInBubble.VisibleReaction> alwaysSelectedReactions;
    private boolean animatePopup;
    private final boolean animationEnabled;
    private BlurredBackgroundProvider backgroundColorProvider;
    private BlurredBackgroundDrawableViewFactory backgroundFactory;
    private final Paint bgPaint;
    public int bigCircleOffset;
    private float bigCircleRadius;
    private BlurredBackgroundDrawable blurredBackgroundDrawable;
    private BlurredBackgroundDrawable blurredBackgroundDrawable1;
    private BlurredBackgroundDrawable blurredBackgroundDrawable2;
    public float bubblesOffset;
    ValueAnimator cancelPressedAnimation;
    private float cancelPressedProgress;
    public boolean channelReactions;
    ChatScrimPopupContainerLayout chatScrimPopupContainerLayout;
    private boolean clicked;
    private int currentAccount;
    private float customEmojiReactionsEnterProgress;
    private InternalImageView customEmojiReactionsIconView;
    FrameLayout customReactionsContainer;
    private ReactionsContainerDelegate delegate;
    public final float durationScale;
    private float flipVerticalProgress;
    public boolean forceAttachToParent;
    BaseFragment fragment;
    public boolean hasHint;
    private boolean hasStar;
    private boolean hintMeasured;
    public TextView hintView;
    public int hintViewHeight;
    public int hintViewWidth;
    public boolean hitLimit;
    private boolean isFlippedVertically;
    public boolean isHiddenNextReaction;
    private boolean isTop;
    public ArrayList<InnerItem> items;
    long lastReactionSentTime;
    private long lastUpdate;
    HashSet<View> lastVisibleViews;
    HashSet<View> lastVisibleViewsTmp;
    private float leftAlpha;
    private final Paint leftShadowPaint;
    private LinearLayoutManager linearLayoutManager;
    private Adapter listAdapter;
    private int[] location;
    private Path mPath;
    public MessageObject messageObject;
    private float miniBubblesOffset;
    private boolean mirrorX;
    public ReactionHolderView nextRecentReaction;
    public final AnimationNotificationsLocker notificationsLocker;
    public ArrayList<InnerItem> oldItems;
    private Runnable onSwitchedToLoopView;
    private float otherViewsScale;
    ChatScrimPopupContainerLayout parentLayout;
    public boolean paused;
    public boolean pausedExceptSelected;
    FrameLayout premiumLockContainer;
    private PremiumLockIconView premiumLockIconView;
    private List<TLRPC.TL_availableReaction> premiumLockedReactions;
    private boolean prepareAnimation;
    private float pressedProgress;
    private ReactionsLayoutInBubble.VisibleReaction pressedReaction;
    private int pressedReactionPosition;
    private float pressedViewScale;
    ValueAnimator pullingDownBackAnimator;
    float pullingLeftOffset;
    public float radius;
    CustomEmojiReactionsWindow reactionsWindow;
    public RectF rect;
    RectF rectF;
    public final RecyclerListView recyclerListView;
    Theme.ResourcesProvider resourcesProvider;
    private float rightAlpha;
    private final Paint rightShadowPaint;
    private final Paint selectedPaint;
    final HashSet<ReactionsLayoutInBubble.VisibleReaction> selectedReactions;
    private Drawable shadow;
    private Rect shadowPad;
    private boolean showExpandableReactions;
    boolean skipDraw;
    public boolean skipEnterAnimation;
    private float smallCircleRadius;
    private LinearGradient starSelectedGradient;
    private Matrix starSelectedGradientMatrix;
    private Paint starSelectedGradientPaint;
    private final Paint starSelectedPaint;
    private float transitionProgress;
    private List<String> triggeredReactions;
    private final int type;
    private List<ReactionsLayoutInBubble.VisibleReaction> visibleReactionsList;
    private long waitingLoadingChatId;

    public class Adapter extends AdapterWithDiffUtils {
        public Adapter() {
        }

        public void lambda$onCreateViewHolder$0(View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            ReactionsContainerLayout.this.showUnlockPremium((view.getMeasuredWidth() / 2.0f) + iArr[0], (view.getMeasuredHeight() / 2.0f) + iArr[1]);
        }

        public void lambda$onCreateViewHolder$1(View view) {
            ReactionsContainerLayout.this.showCustomEmojiReactionDialog();
        }

        @Override
        public int getItemCount() {
            return ReactionsContainerLayout.this.items.size();
        }

        @Override
        public int getItemViewType(int i) {
            return ReactionsContainerLayout.this.items.get(i).viewType;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 3) {
                ReactionHolderView reactionHolderView = (ReactionHolderView) viewHolder.itemView;
                reactionHolderView.setScaleX(1.0f);
                reactionHolderView.setScaleY(1.0f);
                reactionHolderView.setReaction(ReactionsContainerLayout.this.items.get(i).reaction, i);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View reactionHolderView;
            if (i == 1) {
                ReactionsContainerLayout.this.premiumLockContainer = new FrameLayout(ReactionsContainerLayout.this.getContext());
                ReactionsContainerLayout.this.premiumLockIconView = new PremiumLockIconView(ReactionsContainerLayout.this.getContext(), PremiumLockIconView.TYPE_REACTIONS, null);
                PremiumLockIconView premiumLockIconView = ReactionsContainerLayout.this.premiumLockIconView;
                int color = Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItemIcon, false);
                int i2 = Theme.key_dialogBackground;
                premiumLockIconView.setColor(ColorUtils.blendARGB(0.7f, color, Theme.getColor(null, i2, false)));
                ReactionsContainerLayout.this.premiumLockIconView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), PorterDuff.Mode.MULTIPLY));
                ReactionsContainerLayout.this.premiumLockIconView.setScaleX(0.0f);
                ReactionsContainerLayout.this.premiumLockIconView.setScaleY(0.0f);
                ReactionsContainerLayout.this.premiumLockIconView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                reactionsContainerLayout.premiumLockContainer.addView(reactionsContainerLayout.premiumLockIconView, LayoutHelper.createFrame(26, 26, 17));
                final int i3 = 1;
                ReactionsContainerLayout.this.premiumLockIconView.setOnClickListener(new View.OnClickListener(this) {
                    public final ReactionsContainerLayout.Adapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$onCreateViewHolder$1(view);
                                break;
                            default:
                                this.f$0.lambda$onCreateViewHolder$0(view);
                                break;
                        }
                    }
                });
                reactionHolderView = ReactionsContainerLayout.this.premiumLockContainer;
            } else if (i != 2) {
                ReactionsContainerLayout reactionsContainerLayout2 = ReactionsContainerLayout.this;
                reactionHolderView = reactionsContainerLayout2.new ReactionHolderView(reactionsContainerLayout2.getContext(), true);
            } else {
                ReactionsContainerLayout reactionsContainerLayout3 = ReactionsContainerLayout.this;
                ReactionsContainerLayout reactionsContainerLayout4 = ReactionsContainerLayout.this;
                reactionsContainerLayout3.customReactionsContainer = reactionsContainerLayout4.new CustomReactionsContainer(reactionsContainerLayout4.getContext());
                ReactionsContainerLayout reactionsContainerLayout5 = ReactionsContainerLayout.this;
                ReactionsContainerLayout reactionsContainerLayout6 = ReactionsContainerLayout.this;
                reactionsContainerLayout5.customEmojiReactionsIconView = reactionsContainerLayout6.new InternalImageView(reactionsContainerLayout6.getContext());
                ReactionsContainerLayout.this.customEmojiReactionsIconView.setImageResource(R.drawable.msg_reactions_expand);
                ReactionsContainerLayout.this.customEmojiReactionsIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                if (ReactionsContainerLayout.this.type == 1 || ReactionsContainerLayout.this.type == 2 || ReactionsContainerLayout.this.type == 4) {
                    ReactionsContainerLayout.this.customEmojiReactionsIconView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                } else {
                    ReactionsContainerLayout.this.customEmojiReactionsIconView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogBackground, false), PorterDuff.Mode.MULTIPLY));
                }
                ReactionsContainerLayout.this.customEmojiReactionsIconView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(28.0f), 0, ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_listSelector, false), 40)));
                ReactionsContainerLayout.this.customEmojiReactionsIconView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                ReactionsContainerLayout.this.customEmojiReactionsIconView.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                ReactionsContainerLayout reactionsContainerLayout7 = ReactionsContainerLayout.this;
                reactionsContainerLayout7.customReactionsContainer.addView(reactionsContainerLayout7.customEmojiReactionsIconView, LayoutHelper.createFrame(30, 30, 17));
                final int i4 = 0;
                ReactionsContainerLayout.this.customEmojiReactionsIconView.setOnClickListener(new View.OnClickListener(this) {
                    public final ReactionsContainerLayout.Adapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$onCreateViewHolder$1(view);
                                break;
                            default:
                                this.f$0.lambda$onCreateViewHolder$0(view);
                                break;
                        }
                    }
                });
                reactionHolderView = ReactionsContainerLayout.this.customReactionsContainer;
            }
            int topOffset = ((ReactionsContainerLayout.this.getLayoutParams().height - ((int) ReactionsContainerLayout.this.getTopOffset())) - ReactionsContainerLayout.this.getPaddingTop()) - ReactionsContainerLayout.this.getPaddingBottom();
            reactionHolderView.setLayoutParams(new RecyclerView.LayoutParams(topOffset - AndroidUtilities.dp(12.0f), topOffset));
            return new RecyclerListView.Holder(reactionHolderView);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition;
            if ((viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 3) && (adapterPosition = viewHolder.getAdapterPosition()) >= 0 && adapterPosition < ReactionsContainerLayout.this.items.size()) {
                ((ReactionHolderView) viewHolder.itemView).updateSelected(ReactionsContainerLayout.this.items.get(adapterPosition).reaction, false);
            }
            super.onViewAttachedToWindow(viewHolder);
        }

        public void updateItems(boolean z) {
            ReactionsContainerLayout.this.oldItems.clear();
            ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
            reactionsContainerLayout.oldItems.addAll(reactionsContainerLayout.items);
            ReactionsContainerLayout.this.items.clear();
            for (int i = 0; i < ReactionsContainerLayout.this.visibleReactionsList.size(); i++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) ReactionsContainerLayout.this.visibleReactionsList.get(i);
                ReactionsContainerLayout reactionsContainerLayout2 = ReactionsContainerLayout.this;
                reactionsContainerLayout2.items.add(reactionsContainerLayout2.new InnerItem(visibleReaction.emojicon == null ? 3 : 0, visibleReaction));
            }
            if (ReactionsContainerLayout.this.showUnlockPremiumButton()) {
                ReactionsContainerLayout reactionsContainerLayout3 = ReactionsContainerLayout.this;
                reactionsContainerLayout3.items.add(reactionsContainerLayout3.new InnerItem(1, null));
            }
            if (ReactionsContainerLayout.this.showCustomEmojiReaction()) {
                ReactionsContainerLayout reactionsContainerLayout4 = ReactionsContainerLayout.this;
                reactionsContainerLayout4.items.add(reactionsContainerLayout4.new InnerItem(2, null));
            }
            if (!z) {
                super.notifyDataSetChanged();
            } else {
                ReactionsContainerLayout reactionsContainerLayout5 = ReactionsContainerLayout.this;
                setItems(reactionsContainerLayout5.oldItems, reactionsContainerLayout5.items);
            }
        }
    }

    public class CustomReactionsContainer extends FrameLayout {
        Paint backgroundPaint;

        public CustomReactionsContainer(Context context) {
            super(context);
            this.backgroundPaint = new Paint(1);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            this.backgroundPaint.setColor((ReactionsContainerLayout.this.type == 1 || ReactionsContainerLayout.this.type == 2 || ReactionsContainerLayout.this.type == 4) ? ColorUtils.setAlphaComponent(-1, 30) : ColorUtils.blendARGB(0.7f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, ReactionsContainerLayout.this.resourcesProvider), Theme.getColor(Theme.key_dialogBackground, ReactionsContainerLayout.this.resourcesProvider)));
            float measuredHeight = getMeasuredHeight() / 2.0f;
            float measuredWidth = getMeasuredWidth() / 2.0f;
            View childAt = getChildAt(0);
            float measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
            float fExpandSize = ReactionsContainerLayout.this.expandSize();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth - measuredWidth2, (measuredHeight - measuredWidth2) - fExpandSize, measuredWidth + measuredWidth2, measuredHeight + measuredWidth2 + fExpandSize);
            canvas.save();
            canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth, measuredHeight);
            canvas.drawRoundRect(rectF, measuredWidth2, measuredWidth2, this.backgroundPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(0.0f, fExpandSize);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    public class InnerItem extends AdapterWithDiffUtils.Item {
        ReactionsLayoutInBubble.VisibleReaction reaction;

        public InnerItem(int i, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            super(i, false);
            this.reaction = visibleReaction;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                InnerItem innerItem = (InnerItem) obj;
                int i = this.viewType;
                int i2 = innerItem.viewType;
                if (i == i2 && (i == 0 || i == 3)) {
                    ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.reaction;
                    return visibleReaction != null && visibleReaction.equals(innerItem.reaction);
                }
                if (i == i2) {
                    return true;
                }
            }
            return false;
        }
    }

    public class InternalImageView extends ImageView {
        boolean isEnter;
        ValueAnimator valueAnimator;

        public InternalImageView(Context context) {
            super(context);
        }

        public void lambda$play$0(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            setScaleX(fFloatValue);
            setScaleY(fFloatValue);
            ReactionsContainerLayout.this.customReactionsContainer.invalidate();
        }

        public void play(int i, boolean z) {
            this.isEnter = true;
            invalidate();
            ValueAnimator valueAnimator = this.valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.valueAnimator.cancel();
            }
            if (!z) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
            this.valueAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setInterpolator(AndroidUtilities.overshootInterpolator);
            this.valueAnimator.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 12));
            this.valueAnimator.setStartDelay((long) (i * ReactionsContainerLayout.this.durationScale));
            this.valueAnimator.setDuration(300L);
            this.valueAnimator.start();
        }

        public void resetAnimation() {
            this.isEnter = false;
            setScaleX(0.0f);
            setScaleY(0.0f);
            ReactionsContainerLayout.this.customReactionsContainer.invalidate();
            ValueAnimator valueAnimator = this.valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
    }

    public final class LeftRightShadowsListener extends RecyclerView.OnScrollListener {
        private ValueAnimator leftAnimator;
        private boolean leftVisible;
        private ValueAnimator rightAnimator;
        private boolean rightVisible;

        private LeftRightShadowsListener() {
        }

        public void lambda$onScrolled$0(Float f) {
            ReactionsContainerLayout.this.leftShadowPaint.setAlpha((int) (ReactionsContainerLayout.this.leftAlpha = f.floatValue() * 255.0f));
            ReactionsContainerLayout.this.invalidate();
        }

        public void lambda$onScrolled$1() {
            this.leftAnimator = null;
        }

        public void lambda$onScrolled$2(Float f) {
            ReactionsContainerLayout.this.rightShadowPaint.setAlpha((int) (ReactionsContainerLayout.this.rightAlpha = f.floatValue() * 255.0f));
            ReactionsContainerLayout.this.invalidate();
        }

        public void lambda$onScrolled$3() {
            this.rightAnimator = null;
        }

        public static void lambda$startAnimator$4(Consumer consumer, ValueAnimator valueAnimator) {
            consumer.accept((Float) valueAnimator.getAnimatedValue());
        }

        private ValueAnimator startAnimator(float f, float f2, Consumer consumer, final Runnable runnable) {
            ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration((long) (Math.abs(f2 - f) * 150.0f));
            duration.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(consumer, 13));
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    runnable.run();
                }
            });
            duration.start();
            return duration;
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z = ReactionsContainerLayout.this.linearLayoutManager.findFirstVisibleItemPosition() != 0;
            if (z != this.leftVisible) {
                ValueAnimator valueAnimator = this.leftAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i3 = 0;
                final int i4 = 0;
                this.leftAnimator = startAnimator(ReactionsContainerLayout.this.leftAlpha, z ? 1.0f : 0.0f, new Consumer(this) {
                    public final ReactionsContainerLayout.LeftRightShadowsListener f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void accept(Object obj) {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$onScrolled$0((Float) obj);
                                break;
                            default:
                                this.f$0.lambda$onScrolled$2((Float) obj);
                                break;
                        }
                    }
                }, new Runnable(this) {
                    public final ReactionsContainerLayout.LeftRightShadowsListener f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$onScrolled$1();
                                break;
                            default:
                                this.f$0.lambda$onScrolled$3();
                                break;
                        }
                    }
                });
                this.leftVisible = z;
            }
            boolean z2 = ReactionsContainerLayout.this.linearLayoutManager.findLastVisibleItemPosition() != ReactionsContainerLayout.this.listAdapter.getItemCount() - 1;
            if (z2 != this.rightVisible) {
                ValueAnimator valueAnimator2 = this.rightAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i5 = 1;
                final int i6 = 1;
                this.rightAnimator = startAnimator(ReactionsContainerLayout.this.rightAlpha, z2 ? 1.0f : 0.0f, new Consumer(this) {
                    public final ReactionsContainerLayout.LeftRightShadowsListener f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void accept(Object obj) {
                        switch (i5) {
                            case 0:
                                this.f$0.lambda$onScrolled$0((Float) obj);
                                break;
                            default:
                                this.f$0.lambda$onScrolled$2((Float) obj);
                                break;
                        }
                    }
                }, new Runnable(this) {
                    public final ReactionsContainerLayout.LeftRightShadowsListener f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i6) {
                            case 0:
                                this.f$0.lambda$onScrolled$1();
                                break;
                            default:
                                this.f$0.lambda$onScrolled$3();
                                break;
                        }
                    }
                });
                this.rightVisible = z2;
            }
        }
    }

    public ReactionsContainerLayout(int i, BaseFragment baseFragment, Context context, int i2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        int i3 = 0;
        Object[] objArr = 0;
        this.forceAttachToParent = false;
        this.items = new ArrayList<>();
        this.oldItems = new ArrayList<>();
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        this.leftShadowPaint = new Paint(1);
        this.rightShadowPaint = new Paint(1);
        this.transitionProgress = 1.0f;
        this.rect = new RectF();
        this.mPath = new Path();
        this.radius = AndroidUtilities.dp(72.0f);
        float fDp = AndroidUtilities.dp(8.0f);
        this.bigCircleRadius = fDp;
        this.smallCircleRadius = fDp / 2.0f;
        this.bigCircleOffset = AndroidUtilities.dp(36.0f);
        this.visibleReactionsList = new ArrayList(20);
        this.premiumLockedReactions = new ArrayList(10);
        this.allReactionsList = new ArrayList(20);
        this.rectF = new RectF();
        this.hasStar = false;
        this.selectedReactions = new HashSet<>();
        this.alwaysSelectedReactions = new HashSet<>();
        this.location = new int[2];
        this.shadowPad = new Rect();
        this.triggeredReactions = new ArrayList();
        this.lastVisibleViews = new HashSet<>();
        this.lastVisibleViewsTmp = new HashSet<>();
        Paint paint2 = new Paint(1);
        this.selectedPaint = paint2;
        Paint paint3 = new Paint(1);
        this.starSelectedPaint = paint3;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.isHiddenNextReaction = true;
        this.paused = false;
        this.type = i;
        this.durationScale = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(Theme.getColor(Theme.key_listSelector, resourcesProvider));
        paint3.setColor(Theme.getColor(Theme.key_reactionStarSelector, resourcesProvider));
        this.resourcesProvider = resourcesProvider;
        this.currentAccount = i2;
        this.fragment = baseFragment;
        ReactionHolderView reactionHolderView = new ReactionHolderView(context, false);
        this.nextRecentReaction = reactionHolderView;
        reactionHolderView.setVisibility(8);
        ReactionHolderView reactionHolderView2 = this.nextRecentReaction;
        reactionHolderView2.touchable = false;
        reactionHolderView2.pressedBackupImageView.setVisibility(8);
        addView(this.nextRecentReaction);
        this.animationEnabled = SharedConfig.animationsEnabled() && SharedConfig.getDevicePerformanceClass() != 0;
        this.shadow = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        Rect rect = this.shadowPad;
        int iDp = AndroidUtilities.dp(7.0f);
        rect.bottom = iDp;
        rect.right = iDp;
        rect.top = iDp;
        rect.left = iDp;
        this.shadow.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelShadow, false), PorterDuff.Mode.MULTIPLY));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() != 1 || ReactionsContainerLayout.this.getPullingLeftProgress() <= 0.95f) {
                        ReactionsContainerLayout.this.animatePullingBack();
                    } else {
                        ReactionsContainerLayout.this.showCustomEmojiReactionDialog();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (ReactionsContainerLayout.this.pressedReaction != null && (view instanceof ReactionHolderView) && ((ReactionHolderView) view).currentReaction.equals(ReactionsContainerLayout.this.pressedReaction)) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.recyclerListView = recyclerListView;
        recyclerListView.setClipChildren(false);
        recyclerListView.setClipToPadding(false);
        this.linearLayoutManager = new LinearLayoutManager(context, i3, objArr == true ? 1 : 0) {
            {
                super(i3, z);
            }

            @Override
            public int scrollHorizontallyBy(int i4, RecyclerView.Recycler recycler, RecyclerView.State state) {
                int i5;
                if (i4 < 0) {
                    ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                    if (reactionsContainerLayout.pullingLeftOffset != 0.0f) {
                        float pullingLeftProgress = reactionsContainerLayout.getPullingLeftProgress();
                        ReactionsContainerLayout reactionsContainerLayout2 = ReactionsContainerLayout.this;
                        reactionsContainerLayout2.pullingLeftOffset += i4;
                        if ((pullingLeftProgress > 1.0f) != (reactionsContainerLayout2.getPullingLeftProgress() > 1.0f)) {
                            try {
                                ReactionsContainerLayout.this.recyclerListView.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                        ReactionsContainerLayout reactionsContainerLayout3 = ReactionsContainerLayout.this;
                        float f = reactionsContainerLayout3.pullingLeftOffset;
                        if (f < 0.0f) {
                            i5 = (int) f;
                            reactionsContainerLayout3.pullingLeftOffset = 0.0f;
                        } else {
                            i5 = 0;
                        }
                        FrameLayout frameLayout = reactionsContainerLayout3.customReactionsContainer;
                        if (frameLayout != null) {
                            frameLayout.invalidate();
                        }
                        ReactionsContainerLayout.this.recyclerListView.invalidate();
                        i4 = i5;
                    }
                }
                int iScrollHorizontallyBy = super.scrollHorizontallyBy(i4, recycler, state);
                if (i4 > 0 && iScrollHorizontallyBy == 0 && ReactionsContainerLayout.this.recyclerListView.getScrollState() == 1 && ReactionsContainerLayout.this.showCustomEmojiReaction()) {
                    ValueAnimator valueAnimator = ReactionsContainerLayout.this.pullingDownBackAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ReactionsContainerLayout.this.pullingDownBackAnimator.cancel();
                    }
                    float pullingLeftProgress2 = ReactionsContainerLayout.this.getPullingLeftProgress();
                    float f2 = pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f;
                    ReactionsContainerLayout reactionsContainerLayout4 = ReactionsContainerLayout.this;
                    reactionsContainerLayout4.pullingLeftOffset = (i4 * f2) + reactionsContainerLayout4.pullingLeftOffset;
                    if ((pullingLeftProgress2 > 1.0f) != (reactionsContainerLayout4.getPullingLeftProgress() > 1.0f)) {
                        try {
                            ReactionsContainerLayout.this.recyclerListView.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    FrameLayout frameLayout2 = ReactionsContainerLayout.this.customReactionsContainer;
                    if (frameLayout2 != null) {
                        frameLayout2.invalidate();
                    }
                    ReactionsContainerLayout.this.recyclerListView.invalidate();
                }
                return iScrollHorizontallyBy;
            }
        };
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect2, View view, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect2, view, recyclerView, state);
                if (ReactionsContainerLayout.this.showCustomEmojiReaction()) {
                    rect2.left = 0;
                    rect2.right = 0;
                    return;
                }
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition == 0) {
                    rect2.left = AndroidUtilities.dp(6.0f);
                }
                rect2.right = AndroidUtilities.dp(4.0f);
                if (childAdapterPosition == ReactionsContainerLayout.this.listAdapter.getItemCount() - 1) {
                    if (ReactionsContainerLayout.this.showUnlockPremiumButton() || ReactionsContainerLayout.this.showCustomEmojiReaction()) {
                        rect2.right = AndroidUtilities.dp(2.0f);
                    } else {
                        rect2.right = AndroidUtilities.dp(6.0f);
                    }
                }
            }
        });
        recyclerListView.setLayoutManager(this.linearLayoutManager);
        recyclerListView.setOverScrollMode(2);
        Adapter adapter = new Adapter();
        this.listAdapter = adapter;
        recyclerListView.setAdapter(adapter);
        recyclerListView.addOnScrollListener(new LeftRightShadowsListener());
        recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(ReactionsContainerLayout.this.location);
                    int i6 = ReactionsContainerLayout.this.location[0];
                    View childAt = recyclerView.getChildAt(0);
                    childAt.getLocationInWindow(ReactionsContainerLayout.this.location);
                    float fMin = ((1.0f - Math.min(1.0f, (-Math.min(ReactionsContainerLayout.this.location[0] - i6, 0.0f)) / childAt.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(fMin)) {
                        fMin = 1.0f;
                    }
                    ReactionsContainerLayout.this.setChildScale(childAt, fMin);
                    View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt2.getLocationInWindow(ReactionsContainerLayout.this.location);
                    float fMin2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i6) - (childAt2.getWidth() + ReactionsContainerLayout.this.location[0]), 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(fMin2)) {
                        fMin2 = 1.0f;
                    }
                    ReactionsContainerLayout.this.setChildScale(childAt2, fMin2);
                }
                for (int i7 = 1; i7 < ReactionsContainerLayout.this.recyclerListView.getChildCount() - 1; i7++) {
                    ReactionsContainerLayout.this.setChildScale(ReactionsContainerLayout.this.recyclerListView.getChildAt(i7), 1.0f);
                }
                ReactionsContainerLayout.this.invalidate();
            }
        });
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect2, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition == 0) {
                    rect2.left = AndroidUtilities.dp(8.0f);
                }
                if (childAdapterPosition == ReactionsContainerLayout.this.listAdapter.getItemCount() - 1) {
                    rect2.right = AndroidUtilities.dp(8.0f);
                }
            }
        });
        recyclerListView.setOnItemClickListener(new StarAppsSheet$$ExternalSyntheticLambda0(this, 12));
        recyclerListView.setOnItemLongClickListener(new AlertsCreator$$ExternalSyntheticLambda139(this, i, 5));
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
        setClipChildren(false);
        setClipToPadding(false);
        invalidateShaders();
        int paddingTop = (recyclerListView.getLayoutParams().height - recyclerListView.getPaddingTop()) - recyclerListView.getPaddingBottom();
        this.nextRecentReaction.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        this.nextRecentReaction.getLayoutParams().height = paddingTop;
        if (i == 2 || i == 4) {
            paint.setColor(ColorUtils.blendARGB(0.13f, -16777216, -1));
        } else {
            paint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
        }
        MediaDataController.getInstance(i2).preloadDefaultReactions();
    }

    public static boolean allowSmoothEnterTransition() {
        return SharedConfig.deviceIsHigh();
    }

    public void animatePullingBack() {
        if (this.pullingLeftOffset != 0.0f) {
            ValueAnimator valueAnimator = this.pullingDownBackAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pullingLeftOffset, 0.0f);
            this.pullingDownBackAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 18));
            this.pullingDownBackAnimator.setDuration(150L);
            this.pullingDownBackAnimator.start();
        }
    }

    public void cancelPressed() {
        if (this.pressedReaction != null) {
            this.cancelPressedProgress = 0.0f;
            final float f = this.pressedProgress;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.cancelPressedAnimation = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ReactionsContainerLayout.this.cancelPressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                    reactionsContainerLayout.pressedProgress = (1.0f - reactionsContainerLayout.cancelPressedProgress) * f;
                    ReactionsContainerLayout.this.invalidate();
                }
            });
            this.cancelPressedAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                    reactionsContainerLayout.cancelPressedAnimation = null;
                    reactionsContainerLayout.pressedProgress = 0.0f;
                    ReactionsContainerLayout.this.pressedReaction = null;
                    ReactionsContainerLayout.this.invalidate();
                }
            });
            this.cancelPressedAnimation.setDuration(150L);
            this.cancelPressedAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.cancelPressedAnimation.start();
        }
    }

    private void checkPremiumReactions(List<TLRPC.TL_availableReaction> list) {
        this.premiumLockedReactions.clear();
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            return;
        }
        int i = 0;
        while (i < list.size()) {
            try {
                if (list.get(i).premium) {
                    this.premiumLockedReactions.add(list.remove(i));
                    i--;
                }
                i++;
            } catch (Exception unused) {
                return;
            }
        }
    }

    private void checkPressedProgress(Canvas canvas, ReactionHolderView reactionHolderView) {
        AnimatedEmojiDrawable animatedEmojiDrawable;
        float fClamp = this.pullingLeftOffset != 0.0f ? Utilities.clamp(reactionHolderView.getLeft() / (getMeasuredWidth() - AndroidUtilities.dp(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress() * AndroidUtilities.dp(46.0f) : 0.0f;
        if (!reactionHolderView.currentReaction.equals(this.pressedReaction)) {
            int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(reactionHolderView);
            float measuredWidth = (((this.pressedViewScale - 1.0f) * reactionHolderView.getMeasuredWidth()) / 3.0f) - (((1.0f - this.otherViewsScale) * reactionHolderView.getMeasuredWidth()) * (Math.abs(this.pressedReactionPosition - childAdapterPosition) - 1));
            if (childAdapterPosition < this.pressedReactionPosition) {
                reactionHolderView.setPivotX(0.0f);
                reactionHolderView.setTranslationX(-measuredWidth);
            } else {
                reactionHolderView.setPivotX(reactionHolderView.getMeasuredWidth() - fClamp);
                reactionHolderView.setTranslationX(measuredWidth - fClamp);
            }
            reactionHolderView.setPivotY(reactionHolderView.enterImageView.getY() + reactionHolderView.enterImageView.getMeasuredHeight());
            reactionHolderView.setScaleX(this.otherViewsScale);
            reactionHolderView.setScaleY(this.otherViewsScale);
            reactionHolderView.pressedBackupImageView.setVisibility(4);
            reactionHolderView.enterImageView.setAlpha(1.0f);
            return;
        }
        BackupImageView backupImageView = reactionHolderView.loopImageView.getVisibility() == 0 ? reactionHolderView.loopImageView : reactionHolderView.enterImageView;
        reactionHolderView.setPivotX(reactionHolderView.getMeasuredWidth() >> 1);
        reactionHolderView.setPivotY(backupImageView.getY() + backupImageView.getMeasuredHeight());
        reactionHolderView.setScaleX(this.pressedViewScale);
        reactionHolderView.setScaleY(this.pressedViewScale);
        if (!this.clicked) {
            if (this.cancelPressedAnimation == null) {
                reactionHolderView.pressedBackupImageView.setVisibility(0);
                reactionHolderView.pressedBackupImageView.setAlpha(1.0f);
                if (reactionHolderView.pressedBackupImageView.getImageReceiver().hasBitmapImage() || ((animatedEmojiDrawable = reactionHolderView.pressedBackupImageView.animatedEmojiDrawable) != null && animatedEmojiDrawable.getImageReceiver() != null && reactionHolderView.pressedBackupImageView.animatedEmojiDrawable.getImageReceiver().hasBitmapImage())) {
                    backupImageView.setAlpha(0.0f);
                }
            } else {
                reactionHolderView.pressedBackupImageView.setAlpha(1.0f - this.cancelPressedProgress);
                backupImageView.setAlpha(this.cancelPressedProgress);
            }
            if (this.pressedProgress == 1.0f) {
                this.clicked = true;
                if (System.currentTimeMillis() - this.lastReactionSentTime > 300) {
                    this.lastReactionSentTime = System.currentTimeMillis();
                    this.delegate.onReactionClicked(reactionHolderView, reactionHolderView.currentReaction, true, false);
                }
            }
        }
        canvas.save();
        float x = reactionHolderView.getX() + this.recyclerListView.getX();
        float scaleX = ((reactionHolderView.getScaleX() * reactionHolderView.getMeasuredWidth()) - reactionHolderView.getMeasuredWidth()) / 2.0f;
        float f = x - scaleX;
        if (f < 0.0f && reactionHolderView.getTranslationX() >= 0.0f) {
            reactionHolderView.setTranslationX((-f) - fClamp);
        } else if (reactionHolderView.getMeasuredWidth() + x + scaleX <= getMeasuredWidth() || reactionHolderView.getTranslationX() > 0.0f) {
            reactionHolderView.setTranslationX(0.0f - fClamp);
        } else {
            reactionHolderView.setTranslationX((((getMeasuredWidth() - x) - reactionHolderView.getMeasuredWidth()) - scaleX) - fClamp);
        }
        canvas.translate(reactionHolderView.getX() + this.recyclerListView.getX(), reactionHolderView.getY() + this.recyclerListView.getY());
        canvas.scale(reactionHolderView.getScaleX(), reactionHolderView.getScaleY(), reactionHolderView.getPivotX(), reactionHolderView.getPivotY());
        reactionHolderView.draw(canvas);
        canvas.restore();
    }

    private void checkPressedProgressForOtherViews(View view) {
        int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(view);
        float measuredWidth = (((this.pressedViewScale - 1.0f) * view.getMeasuredWidth()) / 3.0f) - (((1.0f - this.otherViewsScale) * view.getMeasuredWidth()) * (Math.abs(this.pressedReactionPosition - childAdapterPosition) - 1));
        if (childAdapterPosition < this.pressedReactionPosition) {
            view.setPivotX(0.0f);
            view.setTranslationX(-measuredWidth);
        } else {
            view.setPivotX(view.getMeasuredWidth());
            view.setTranslationX(measuredWidth);
        }
        view.setScaleX(this.otherViewsScale);
        view.setScaleY(this.otherViewsScale);
    }

    private void fillRecentReactionsList(List<ReactionsLayoutInBubble.VisibleReaction> list) {
        HashSet hashSet = new HashSet();
        int i = this.type;
        int i2 = 0;
        if (i == 4) {
            int i3 = 0;
            for (ReactionsLayoutInBubble.VisibleReaction visibleReaction : this.selectedReactions) {
                if (!hashSet.contains(visibleReaction)) {
                    hashSet.add(visibleReaction);
                    list.add(visibleReaction);
                    i3++;
                    if (i3 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList();
            while (i2 < enabledReactionsList.size()) {
                TLRPC.TL_availableReaction tL_availableReaction = enabledReactionsList.get(i2);
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = new ReactionsLayoutInBubble.VisibleReaction();
                String str = tL_availableReaction.reaction;
                visibleReaction2.emojicon = str;
                visibleReaction2.hash = str.hashCode();
                if (!hashSet.contains(visibleReaction2)) {
                    hashSet.add(visibleReaction2);
                    list.add(visibleReaction2);
                    i3++;
                    if (i3 >= 8) {
                        return;
                    }
                }
                i2++;
            }
            return;
        }
        if (!this.allReactionsAvailable || i == 4) {
            if (i != 3) {
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList();
                while (i2 < enabledReactionsList2.size()) {
                    TLRPC.TL_availableReaction tL_availableReaction2 = enabledReactionsList2.get(i2);
                    ReactionsLayoutInBubble.VisibleReaction visibleReaction3 = new ReactionsLayoutInBubble.VisibleReaction();
                    String str2 = tL_availableReaction2.reaction;
                    visibleReaction3.emojicon = str2;
                    visibleReaction3.hash = str2.hashCode();
                    list.add(visibleReaction3);
                    i2++;
                }
                return;
            }
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.currentAccount).getSavedReactions();
            int i4 = 0;
            while (i2 < savedReactions.size()) {
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(savedReactions.get(i2));
                if (!hashSet.contains(visibleReactionFromTL)) {
                    hashSet.add(visibleReactionFromTL);
                    list.add(visibleReactionFromTL);
                    i4++;
                }
                if (i4 == 16) {
                    return;
                } else {
                    i2++;
                }
            }
            return;
        }
        if (i == 5) {
            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.currentAccount).getAvailableEffects();
            if (availableEffects != null) {
                while (i2 < availableEffects.effects.size()) {
                    ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL2 = ReactionsLayoutInBubble.VisibleReaction.fromTL(availableEffects.effects.get(i2));
                    if (!hashSet.contains(visibleReactionFromTL2)) {
                        hashSet.add(visibleReactionFromTL2);
                        list.add(visibleReactionFromTL2);
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        ArrayList<TLRPC.Reaction> savedReactions2 = i == 3 ? MediaDataController.getInstance(this.currentAccount).getSavedReactions() : MediaDataController.getInstance(this.currentAccount).getTopReactions();
        if (this.type == 3) {
            TLRPC.TL_messages_savedReactionsTags savedReactionTags = MessagesController.getInstance(this.currentAccount).getSavedReactionTags(0L);
            if (savedReactionTags != null) {
                for (int i5 = 0; i5 < savedReactionTags.tags.size(); i5++) {
                    ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL3 = ReactionsLayoutInBubble.VisibleReaction.fromTL(savedReactionTags.tags.get(i5).reaction);
                    if (!hashSet.contains(visibleReactionFromTL3)) {
                        hashSet.add(visibleReactionFromTL3);
                        list.add(visibleReactionFromTL3);
                    }
                }
            }
            for (int i6 = 0; i6 < savedReactions2.size(); i6++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL4 = ReactionsLayoutInBubble.VisibleReaction.fromTL(savedReactions2.get(i6));
                if (!hashSet.contains(visibleReactionFromTL4)) {
                    hashSet.add(visibleReactionFromTL4);
                    list.add(visibleReactionFromTL4);
                }
            }
        } else {
            for (int i7 = 0; i7 < savedReactions2.size(); i7++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL5 = ReactionsLayoutInBubble.VisibleReaction.fromTL(savedReactions2.get(i7));
                if (!hashSet.contains(visibleReactionFromTL5) && (this.type == 3 || UserConfig.getInstance(this.currentAccount).isPremium() || visibleReactionFromTL5.documentId == 0)) {
                    hashSet.add(visibleReactionFromTL5);
                    list.add(visibleReactionFromTL5);
                }
            }
        }
        if (this.type != 3 || UserConfig.getInstance(this.currentAccount).isPremium()) {
            ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.currentAccount).getRecentReactions();
            for (int i8 = 0; i8 < recentReactions.size(); i8++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL6 = ReactionsLayoutInBubble.VisibleReaction.fromTL(recentReactions.get(i8));
                if (!hashSet.contains(visibleReactionFromTL6)) {
                    hashSet.add(visibleReactionFromTL6);
                    list.add(visibleReactionFromTL6);
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList();
            while (i2 < enabledReactionsList3.size()) {
                TLRPC.TL_availableReaction tL_availableReaction3 = enabledReactionsList3.get(i2);
                ReactionsLayoutInBubble.VisibleReaction visibleReaction4 = new ReactionsLayoutInBubble.VisibleReaction();
                String str3 = tL_availableReaction3.reaction;
                visibleReaction4.emojicon = str3;
                visibleReaction4.hash = str3.hashCode();
                if (!hashSet.contains(visibleReaction4)) {
                    hashSet.add(visibleReaction4);
                    list.add(visibleReaction4);
                }
                i2++;
            }
        }
    }

    private void filterReactions(List<ReactionsLayoutInBubble.VisibleReaction> list) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < list.size()) {
            if (hashSet.contains(list.get(i))) {
                i--;
                list.remove(i);
            } else {
                hashSet.add(list.get(i));
            }
            i++;
        }
    }

    public static HashSet<ReactionsLayoutInBubble.VisibleReaction> getInclusiveReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        int i = 0;
        boolean z = true;
        while (i < arrayList.size()) {
            MessageObject messageObject = arrayList.get(i);
            hashSet.clear();
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i2 = 0; i2 < messageObject.messageOwner.reactions.results.size(); i2++) {
                    if (messageObject.messageOwner.reactions.results.get(i2).chosen) {
                        ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(messageObject.messageOwner.reactions.results.get(i2).reaction);
                        if (z || longSparseArray.indexOfKey(visibleReactionFromTL.hash) >= 0) {
                            hashSet.add(Long.valueOf(visibleReactionFromTL.hash));
                            longSparseArray.put(visibleReactionFromTL.hash, visibleReactionFromTL);
                        }
                    }
                }
            }
            int i3 = 0;
            while (i3 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i3)))) {
                    longSparseArray.removeAt(i3);
                    i3--;
                }
                i3++;
            }
            i++;
            z = false;
        }
        HashSet<ReactionsLayoutInBubble.VisibleReaction> hashSet2 = new HashSet<>();
        for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
            if (longSparseArray.valueAt(i4) != null) {
                hashSet2.add((ReactionsLayoutInBubble.VisibleReaction) longSparseArray.valueAt(i4));
            }
        }
        return hashSet2;
    }

    private Paint getStarGradientPaint(RectF rectF, float f) {
        if (this.starSelectedGradientPaint == null) {
            this.starSelectedGradientPaint = new Paint(1);
        }
        if (this.starSelectedGradientMatrix == null) {
            this.starSelectedGradientMatrix = new Matrix();
        }
        if (this.starSelectedGradient == null) {
            int color = Theme.getColor(Theme.key_reactionStarSelector, this.resourcesProvider);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(64.0f), 0.0f, new int[]{color, Theme.multAlpha(0.0f, color)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.starSelectedGradient = linearGradient;
            this.starSelectedGradientPaint.setShader(linearGradient);
        }
        this.starSelectedGradientMatrix.reset();
        this.starSelectedGradientMatrix.postTranslate(rectF.left, rectF.top);
        this.starSelectedGradient.setLocalMatrix(this.starSelectedGradientMatrix);
        this.starSelectedGradientPaint.setAlpha((int) (f * 255.0f));
        return this.starSelectedGradientPaint;
    }

    private void invalidateEmojis() {
        if (this.type != 4) {
            return;
        }
        invalidate();
        this.recyclerListView.invalidate();
        this.recyclerListView.invalidateViews();
        for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            if (childAt instanceof ReactionHolderView) {
                ReactionHolderView reactionHolderView = (ReactionHolderView) childAt;
                reactionHolderView.enterImageView.invalidate();
                reactionHolderView.loopImageView.invalidate();
            } else {
                childAt.invalidate();
            }
        }
    }

    private void invalidateShaders() {
        int iDp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int color = Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
        Paint paint = this.leftShadowPaint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new LinearGradient(0.0f, height, iDp, height, color, 0, tileMode));
        this.rightShadowPaint.setShader(new LinearGradient(getWidth(), height, getWidth() - iDp, height, color, 0, tileMode));
        invalidate();
    }

    public void lambda$animatePullingBack$2(ValueAnimator valueAnimator) {
        this.pullingLeftOffset = ((Float) this.pullingDownBackAnimator.getAnimatedValue()).floatValue();
        FrameLayout frameLayout = this.customReactionsContainer;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
        invalidate();
    }

    public void lambda$clearRecentReactions$5(AlertDialog alertDialog, int i) {
        MediaDataController.getInstance(this.currentAccount).clearRecentReactions();
        ArrayList arrayList = new ArrayList();
        fillRecentReactionsList(arrayList);
        setVisibleReactionsList(arrayList, true);
        this.lastVisibleViews.clear();
        this.reactionsWindow.selectAnimatedEmojiDialog.setRecentReactions(arrayList);
    }

    public void lambda$new$0(View view, int i) {
        ReactionsContainerDelegate reactionsContainerDelegate = this.delegate;
        if (reactionsContainerDelegate == null || !(view instanceof ReactionHolderView)) {
            return;
        }
        reactionsContainerDelegate.onReactionClicked(this, ((ReactionHolderView) view).currentReaction, false, false);
    }

    public boolean lambda$new$1(int i, View view, int i2) {
        ReactionsContainerDelegate reactionsContainerDelegate;
        if (i == 5 || (reactionsContainerDelegate = this.delegate) == null || !(view instanceof ReactionHolderView)) {
            return false;
        }
        reactionsContainerDelegate.onReactionClicked(this, ((ReactionHolderView) view).currentReaction, true, false);
        return true;
    }

    public void lambda$reset$6(View view) {
        if (view instanceof ReactionHolderView) {
            ReactionHolderView reactionHolderView = (ReactionHolderView) view;
            reactionHolderView.pressed = false;
            reactionHolderView.loopImageView.setAlpha(1.0f);
            if (!this.skipEnterAnimation) {
                reactionHolderView.resetAnimation();
            } else {
                reactionHolderView.loopImageView.setScaleX(reactionHolderView.enterScale * (reactionHolderView.selected ? 0.76f : 1.0f));
                reactionHolderView.loopImageView.setScaleY(reactionHolderView.enterScale * (reactionHolderView.selected ? 0.76f : 1.0f));
            }
        }
    }

    public void lambda$showCustomEmojiReactionDialog$3() {
        this.reactionsWindow = null;
        invalidateLoopViews();
        ReactionsContainerDelegate reactionsContainerDelegate = this.delegate;
        if (reactionsContainerDelegate != null) {
            reactionsContainerDelegate.onEmojiWindowDismissed();
        }
    }

    public void lambda$updateSelected$4(boolean z, View view) {
        int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(view);
        if (childAdapterPosition < 0 || childAdapterPosition >= this.items.size() || !(view instanceof ReactionHolderView)) {
            return;
        }
        ((ReactionHolderView) view).updateSelected(this.items.get(childAdapterPosition).reaction, z);
    }

    public void setChildScale(View view, float f) {
        if (view instanceof ReactionHolderView) {
            ((ReactionHolderView) view).sideScale = f;
        } else {
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    private void setVisibleReactionsList(List<ReactionsLayoutInBubble.VisibleReaction> list, boolean z) {
        this.visibleReactionsList.clear();
        if (showCustomEmojiReaction()) {
            int iDp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) / AndroidUtilities.dp(34.0f);
            if (iDp > 7) {
                iDp = 7;
            }
            if (iDp < 1) {
                iDp = 1;
            }
            int i = 0;
            while (i < Math.min(list.size(), iDp)) {
                this.visibleReactionsList.add(list.get(i));
                i++;
            }
            if (i < list.size()) {
                this.nextRecentReaction.setReaction(list.get(i), -1);
            }
        } else {
            this.visibleReactionsList.addAll(list);
        }
        this.allReactionsIsDefault = true;
        for (int i2 = 0; i2 < this.visibleReactionsList.size(); i2++) {
            if (this.visibleReactionsList.get(i2).documentId != 0) {
                this.allReactionsIsDefault = false;
            }
        }
        this.allReactionsList.clear();
        this.allReactionsList.addAll(list);
        if (list.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        this.listAdapter.updateItems(z);
    }

    public void showCustomEmojiReactionDialog() {
        if (this.reactionsWindow != null) {
            return;
        }
        CustomEmojiReactionsWindow customEmojiReactionsWindow = new CustomEmojiReactionsWindow(this.type, this.fragment, this.allReactionsList, this.selectedReactions, this, this.resourcesProvider, this.forceAttachToParent);
        this.reactionsWindow = customEmojiReactionsWindow;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.backgroundFactory;
        boolean z = true;
        if (blurredBackgroundDrawableViewFactory != null) {
            BlurredBackgroundProvider blurredBackgroundProvider = this.backgroundColorProvider;
            customEmojiReactionsWindow.selectAnimatedEmojiDialog.searchBox.setUseCustomBackground();
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(customEmojiReactionsWindow.containerView, null, true);
            blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProvider);
            Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate, AndroidUtilities.dp(12.0f), 8.0f);
            customEmojiReactionsWindow.blurredBackgroundDrawable = blurredBackgroundDrawableCreate;
        }
        CustomEmojiReactionsWindow customEmojiReactionsWindow2 = this.reactionsWindow;
        ReactionsContainerDelegate reactionsContainerDelegate = this.delegate;
        if (reactionsContainerDelegate != null && !reactionsContainerDelegate.allowLongPress()) {
            z = false;
        }
        customEmojiReactionsWindow2.selectAnimatedEmojiDialog.setLongPressEnabled(z);
        invalidateLoopViews();
        this.reactionsWindow.onDismiss = new Tooltip$$ExternalSyntheticLambda0(this, 4);
        onShownCustomEmojiReactionDialog();
    }

    public void showUnlockPremium(float f, float f2) {
        new PremiumFeatureBottomSheet(this.fragment, 4, true).show();
    }

    public boolean showUnlockPremiumButton() {
        return (this.premiumLockedReactions.isEmpty() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) ? false : true;
    }

    private void updateSelected(boolean z) {
        AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, (com.google.android.exoplayer2.util.Consumer) new ViewPagerFixed$TabsView$$ExternalSyntheticLambda3(this, z, 1));
    }

    public void clearRecentReactions() {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext(), 0, null).setTitle(LocaleController.getString(R.string.ClearRecentReactionsAlertTitle)).setMessage(LocaleController.getString(R.string.ClearRecentReactionsAlertMessage)).setPositiveButton(LocaleController.getString(R.string.ClearButton), new ColorPicker$$ExternalSyntheticLambda5(this, 13)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
        alertDialogCreate.show();
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.chatInfoDidLoad) {
            if (i == NotificationCenter.emojiLoaded) {
                invalidateEmojis();
                return;
            } else {
                if (i == NotificationCenter.availableEffectsUpdate) {
                    setMessage(this.messageObject, null, true);
                    return;
                }
                return;
            }
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        if (chatFull.id != this.waitingLoadingChatId || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
            return;
        }
        setMessage(this.messageObject, null, true);
        setVisibility(0);
        startEnterAnimation(false);
    }

    public void dismissParent(boolean z) {
        int i = 0;
        CustomEmojiReactionsWindow customEmojiReactionsWindow = this.reactionsWindow;
        if (customEmojiReactionsWindow != null) {
            if (!customEmojiReactionsWindow.dismissed || !z) {
                customEmojiReactionsWindow.dismissed = true;
                if (z) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new CustomEmojiReactionsWindow$$ExternalSyntheticLambda5(customEmojiReactionsWindow, i));
                    valueAnimatorOfFloat.addListener(new CustomEmojiReactionsWindow.AnonymousClass8(customEmojiReactionsWindow, i));
                    valueAnimatorOfFloat.setDuration(150L);
                    valueAnimatorOfFloat.start();
                } else {
                    customEmojiReactionsWindow.removeView();
                }
            }
            this.reactionsWindow = null;
        }
    }

    public void dismissWindow() {
        CustomEmojiReactionsWindow customEmojiReactionsWindow = this.reactionsWindow;
        if (customEmojiReactionsWindow != null) {
            customEmojiReactionsWindow.dismiss();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f;
        float width;
        float f2;
        float fMax;
        float fMax2;
        float f3;
        float f4;
        float f5;
        ReactionsContainerDelegate reactionsContainerDelegate;
        Canvas canvas2 = canvas;
        long jMin = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
        this.lastUpdate = System.currentTimeMillis();
        boolean z = this.isFlippedVertically;
        if (z) {
            float f6 = this.flipVerticalProgress;
            if (f6 != 1.0f) {
                this.flipVerticalProgress = Math.min(1.0f, (jMin / 220.0f) + f6);
                invalidate();
            } else if (!z) {
                f = this.flipVerticalProgress;
                if (f != 0.0f) {
                    this.flipVerticalProgress = Math.max(0.0f, f - (jMin / 220.0f));
                    invalidate();
                }
            }
        } else if (!z) {
            f = this.flipVerticalProgress;
            if (f != 0.0f) {
                this.flipVerticalProgress = Math.max(0.0f, f - (jMin / 220.0f));
                invalidate();
            }
        }
        TextView textView = this.hintView;
        if (textView != null) {
            textView.setTranslationY(-expandSize());
        }
        float fMax3 = (Math.max(0.25f, Math.min(this.transitionProgress, 1.0f)) - 0.25f) / 0.75f;
        float f7 = this.bigCircleRadius * fMax3;
        float f8 = this.smallCircleRadius * fMax3;
        this.lastVisibleViewsTmp.clear();
        this.lastVisibleViewsTmp.addAll(this.lastVisibleViews);
        this.lastVisibleViews.clear();
        if (this.prepareAnimation) {
            invalidate();
        }
        if (this.pressedReaction != null && this.type != 5 && ((reactionsContainerDelegate = this.delegate) == null || reactionsContainerDelegate.allowLongPress())) {
            float f9 = this.pressedProgress;
            if (f9 != 1.0f) {
                float longPressTimeout = (16.0f / (this.pressedReaction.isStar ? ViewConfiguration.getLongPressTimeout() : 1500.0f)) + f9;
                this.pressedProgress = longPressTimeout;
                if (longPressTimeout >= 1.0f) {
                    this.pressedProgress = 1.0f;
                }
                invalidate();
            }
        }
        ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.pressedReaction;
        if (visibleReaction == null || !visibleReaction.isStar) {
            float f10 = this.pressedProgress;
            this.pressedViewScale = (f10 * 2.0f) + 1.0f;
            this.otherViewsScale = 1.0f - (f10 * 0.15f);
        } else {
            this.pressedViewScale = 1.0f;
            this.otherViewsScale = 1.0f;
        }
        int iSave = canvas2.save();
        if (LocaleController.isRTL || this.mirrorX) {
            width = getWidth();
            f2 = 0.125f;
        } else {
            width = getWidth();
            f2 = 0.875f;
        }
        float f11 = width * f2;
        float f12 = this.transitionProgress;
        if (f12 != 1.0f) {
            canvas2.scale(f12, f12, f11, getHeight() / 2.0f);
        }
        if (LocaleController.isRTL || this.mirrorX) {
            fMax = Math.max(0.25f, this.transitionProgress);
            fMax2 = 0.0f;
        } else {
            fMax2 = 1.0f - Math.max(0.25f, this.transitionProgress);
            fMax = 1.0f;
        }
        float pullingLeftProgress = getPullingLeftProgress();
        float fExpandSize = expandSize();
        ChatScrimPopupContainerLayout chatScrimPopupContainerLayout = this.chatScrimPopupContainerLayout;
        if (chatScrimPopupContainerLayout != null) {
            chatScrimPopupContainerLayout.setExpandSize(fExpandSize);
        }
        float fMin = Math.min(1.0f, fMax2) * (getWidth() - getPaddingRight());
        float topOffset = getTopOffset();
        float f13 = fMax2;
        this.rect.set(getPaddingLeft() + fMin, (((1.0f - this.otherViewsScale) * this.recyclerListView.getMeasuredHeight()) + getPaddingTop()) - fExpandSize, (getWidth() - getPaddingRight()) * fMax, (getHeight() - getPaddingBottom()) + fExpandSize);
        this.radius = SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(fExpandSize, 2.0f, this.rect.height() - topOffset, 2.0f);
        if (this.type != 1) {
            this.shadow.setAlpha((int) (Utilities.clamp(1.0f - (this.customEmojiReactionsEnterProgress / 0.05f), 1.0f, 0.0f) * 255.0f));
            Drawable drawable = this.shadow;
            float paddingLeft = getPaddingLeft();
            int width2 = getWidth() - getPaddingRight();
            Rect rect = this.shadowPad;
            int i = (int) fExpandSize;
            drawable.setBounds((int) ((((width2 + rect.right) * f13) + paddingLeft) - rect.left), (getPaddingTop() - this.shadowPad.top) - i, (int) (((getWidth() - getPaddingRight()) + this.shadowPad.right) * fMax), (getHeight() - getPaddingBottom()) + this.shadowPad.bottom + i);
            if (this.blurredBackgroundDrawable == null) {
                this.shadow.draw(canvas2);
            }
        }
        canvas2.restoreToCount(iSave);
        if (this.skipDraw) {
            f3 = f11;
            f4 = fMin;
            f5 = 8.0f;
        } else {
            int iSave2 = canvas2.save();
            float f14 = this.transitionProgress;
            if (f14 != 1.0f) {
                canvas2.scale(f14, f14, f11, getHeight() / 2.0f);
            }
            if (this.type == 1 || this.delegate.drawBackground()) {
                f4 = fMin;
                f5 = 8.0f;
                f3 = f11;
                this.delegate.drawRoundRect(canvas, this.rect, this.radius, getX(), getY(), 255, false);
                canvas2 = canvas;
            } else {
                if (this.blurredBackgroundDrawable != null) {
                    RectF rectF = this.rect;
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rectF.round(rect2);
                    rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                    this.blurredBackgroundDrawable.setBounds(rect2);
                    this.blurredBackgroundDrawable.setAlpha(this.bgPaint.getAlpha());
                    this.blurredBackgroundDrawable.draw(canvas2);
                } else {
                    RectF rectF2 = this.rect;
                    float f15 = this.radius;
                    canvas2.drawRoundRect(rectF2, f15, f15, this.bgPaint);
                }
                f3 = f11;
                f4 = fMin;
                f5 = 8.0f;
            }
            if (this.hasStar) {
                Iterator<ReactionsLayoutInBubble.VisibleReaction> it = this.selectedReactions.iterator();
                do {
                    if (!it.hasNext()) {
                        RectF rectF3 = this.rect;
                        float f16 = this.radius;
                        canvas2.drawRoundRect(rectF3, f16, f16, getStarGradientPaint(rectF3, Utilities.clamp01(1.0f - getPullingLeftProgress())));
                        break;
                    }
                } while (!it.next().isStar);
            }
            canvas2.restoreToCount(iSave2);
        }
        this.mPath.rewind();
        Path path = this.mPath;
        RectF rectF4 = this.rect;
        float f17 = this.radius;
        path.addRoundRect(rectF4, f17, f17, Path.Direction.CW);
        int iSave3 = canvas2.save();
        float f18 = this.transitionProgress;
        if (f18 != 1.0f) {
            canvas2.scale(f18, f18, f3, getHeight() / 2.0f);
        }
        if (this.transitionProgress != 0.0f && (getAlpha() == 1.0f || this.type == 5)) {
            int left = 0;
            int iAbs = 0;
            for (int i2 = 0; i2 < this.recyclerListView.getChildCount(); i2++) {
                View childAt = this.recyclerListView.getChildAt(i2);
                if (this.transitionProgress != 1.0f && allowSmoothEnterTransition()) {
                    iAbs = (int) (Math.abs((((childAt.getMeasuredWidth() / 2.0f) + childAt.getLeft()) / this.recyclerListView.getMeasuredWidth()) - 0.8f) * 200.0f);
                }
                if (childAt instanceof ReactionHolderView) {
                    ReactionHolderView reactionHolderView = (ReactionHolderView) this.recyclerListView.getChildAt(i2);
                    checkPressedProgress(canvas2, reactionHolderView);
                    if (childAt.getLeft() > left) {
                        left = childAt.getLeft();
                    }
                    if (!this.skipEnterAnimation && (!reactionHolderView.hasEnterAnimation || reactionHolderView.enterImageView.getImageReceiver().getLottieAnimation() != null)) {
                        if ((reactionHolderView.getMeasuredWidth() / 2.0f) + reactionHolderView.getX() > 0.0f) {
                            if ((reactionHolderView.getMeasuredWidth() / 2.0f) + reactionHolderView.getX() < this.recyclerListView.getWidth()) {
                                if (!this.lastVisibleViewsTmp.contains(reactionHolderView)) {
                                    reactionHolderView.play(iAbs);
                                    iAbs += 30;
                                }
                                this.lastVisibleViews.add(reactionHolderView);
                            } else if (!reactionHolderView.isEnter) {
                                reactionHolderView.resetAnimation();
                            }
                        } else if (!reactionHolderView.isEnter) {
                            reactionHolderView.resetAnimation();
                        }
                    }
                } else {
                    if (childAt == this.premiumLockContainer) {
                        if ((childAt.getMeasuredWidth() / 2.0f) + childAt.getX() <= 0.0f) {
                            this.premiumLockIconView.resetAnimation();
                        } else if ((childAt.getMeasuredWidth() / 2.0f) + childAt.getX() < this.recyclerListView.getWidth()) {
                            if (!this.lastVisibleViewsTmp.contains(childAt)) {
                                if (this.transitionProgress != 1.0f) {
                                    this.premiumLockIconView.resetAnimation();
                                }
                                this.premiumLockIconView.play(iAbs);
                                iAbs += 30;
                            }
                            this.lastVisibleViews.add(childAt);
                        } else {
                            this.premiumLockIconView.resetAnimation();
                        }
                    }
                    if (childAt == this.customReactionsContainer) {
                        if ((childAt.getMeasuredWidth() / 2.0f) + childAt.getX() <= 0.0f) {
                            this.customEmojiReactionsIconView.resetAnimation();
                        } else if ((childAt.getMeasuredWidth() / 2.0f) + childAt.getX() < this.recyclerListView.getWidth()) {
                            if (!this.lastVisibleViewsTmp.contains(childAt)) {
                                if (this.transitionProgress != 1.0f) {
                                    this.customEmojiReactionsIconView.resetAnimation();
                                }
                                this.customEmojiReactionsIconView.play(iAbs, LiteMode.isEnabled(8200) || SharedConfig.getDevicePerformanceClass() >= 1);
                                iAbs += 30;
                            }
                            this.lastVisibleViews.add(childAt);
                        } else {
                            this.customEmojiReactionsIconView.resetAnimation();
                        }
                    }
                    checkPressedProgressForOtherViews(childAt);
                }
            }
            if (pullingLeftProgress > 0.0f) {
                float pullingLeftProgress2 = getPullingLeftProgress();
                int measuredWidth = this.nextRecentReaction.getMeasuredWidth() - AndroidUtilities.dp(2.0f);
                float f19 = left + measuredWidth;
                float fClamp = Utilities.clamp(f19 / (getMeasuredWidth() - this.nextRecentReaction.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth;
                if (this.nextRecentReaction.getTag() == null) {
                    this.nextRecentReaction.setTag(Float.valueOf(1.0f));
                    this.nextRecentReaction.resetAnimation();
                    this.nextRecentReaction.play(0);
                }
                float fClamp2 = Utilities.clamp(pullingLeftProgress2, 1.0f, 0.0f);
                this.nextRecentReaction.setScaleX(fClamp2);
                this.nextRecentReaction.setScaleY(fClamp2);
                int i3 = this.type;
                this.nextRecentReaction.setTranslationX(((this.recyclerListView.getX() + f19) - fClamp) + (-((i3 == 1 || i3 == 2) ? AndroidUtilities.dp(f5) : AndroidUtilities.dp(20.0f))));
                if (this.nextRecentReaction.getVisibility() != 0) {
                    this.nextRecentReaction.setVisibility(0);
                }
            } else {
                if (this.nextRecentReaction.getVisibility() != 8 && this.isHiddenNextReaction) {
                    this.nextRecentReaction.setVisibility(8);
                }
                if (this.nextRecentReaction.getTag() != null) {
                    this.nextRecentReaction.setTag(null);
                }
            }
        }
        if (this.skipDraw && this.reactionsWindow != null) {
            int iM = (int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, this.customEmojiReactionsEnterProgress, Utilities.clamp(1.0f - (this.customEmojiReactionsEnterProgress / 0.2f), 1.0f, 0.0f), 255.0f);
            canvas2.save();
            drawBubbles(canvas2, f7, fMax3, f8, iM);
            canvas2.restore();
            return;
        }
        boolean zShowCustomEmojiReaction = showCustomEmojiReaction();
        if (!zShowCustomEmojiReaction) {
            canvas2.clipPath(this.mPath);
        }
        canvas2.translate((1.0f - this.transitionProgress) * getWidth() * ((LocaleController.isRTL || this.mirrorX) ? -1 : 1), 0.0f);
        this.recyclerListView.setTranslationX(-f4);
        super.dispatchDraw(canvas);
        if (!zShowCustomEmojiReaction) {
            if (this.leftShadowPaint != null) {
                this.leftShadowPaint.setAlpha((int) (Utilities.clamp(this.leftAlpha * this.transitionProgress, 1.0f, 0.0f) * 255.0f));
                canvas2.drawRect(this.rect, this.leftShadowPaint);
            }
            if (this.rightShadowPaint != null) {
                this.rightShadowPaint.setAlpha((int) (Utilities.clamp(this.rightAlpha * this.transitionProgress, 1.0f, 0.0f) * 255.0f));
                canvas2.drawRect(this.rect, this.rightShadowPaint);
            }
        }
        canvas2.restoreToCount(iSave3);
        drawBubbles(canvas2, f7, fMax3, f8, 255);
        invalidate();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void drawBubbles(Canvas canvas) {
        int iM;
        float fMax = (Math.max(0.25f, Math.min(this.transitionProgress, 1.0f)) - 0.25f) / 0.75f;
        float f = this.bigCircleRadius * fMax;
        float f2 = this.smallCircleRadius * fMax;
        if (this.type == 5) {
            iM = 255;
        } else {
            iM = (int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, this.customEmojiReactionsEnterProgress, Utilities.clamp(this.customEmojiReactionsEnterProgress / 0.2f, 1.0f, 0.0f), 255.0f);
        }
        drawBubbles(canvas, f, fMax, f2, iM);
    }

    public float expandSize() {
        return (int) (getPullingLeftProgress() * AndroidUtilities.dp(6.0f));
    }

    public ReactionsContainerDelegate getDelegate() {
        return this.delegate;
    }

    public int getHintTextWidth() {
        return this.hintViewWidth;
    }

    public int getItemsCount() {
        return (showCustomEmojiReaction() ? 1 : 0) + this.visibleReactionsList.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.clamp(this.pullingLeftOffset / AndroidUtilities.dp(42.0f), 2.0f, 0.0f);
    }

    public CustomEmojiReactionsWindow getReactionsWindow() {
        return this.reactionsWindow;
    }

    public String getSelectedEmoji() {
        TLRPC.Document documentFindDocument;
        if (this.selectedReactions.isEmpty()) {
            return "";
        }
        ReactionsLayoutInBubble.VisibleReaction next = this.selectedReactions.iterator().next();
        long j = next.documentId;
        String strFindAnimatedEmojiEmoticon = null;
        if (j != 0 && (documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, j)) != null) {
            strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(documentFindDocument, null);
        }
        if (TextUtils.isEmpty(strFindAnimatedEmojiEmoticon)) {
            strFindAnimatedEmojiEmoticon = next.emojicon;
        }
        return TextUtils.isEmpty(strFindAnimatedEmojiEmoticon) ? "👍" : strFindAnimatedEmojiEmoticon;
    }

    public HashSet<ReactionsLayoutInBubble.VisibleReaction> getSelectedReactions() {
        return this.selectedReactions;
    }

    public float getTopOffset() {
        if (this.hasHint) {
            return ((FrameLayout.LayoutParams) this.recyclerListView.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (showCustomEmojiReaction()) {
            return (AndroidUtilities.dp(36.0f) * itemsCount) - AndroidUtilities.dp(4.0f);
        }
        return AndroidUtilities.dp(16.0f) + CalendarActivity$$ExternalSyntheticOutline0.m(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
    }

    public List<ReactionsLayoutInBubble.VisibleReaction> getVisibleReactionsList() {
        return this.visibleReactionsList;
    }

    public int getWindowType() {
        int i = this.type;
        if (i == 4) {
            return 13;
        }
        if (i == 3) {
            return 11;
        }
        if (i == 5) {
            return 14;
        }
        return this.showExpandableReactions ? 8 : 1;
    }

    public View getWindowView() {
        CustomEmojiReactionsWindow customEmojiReactionsWindow = this.reactionsWindow;
        if (customEmojiReactionsWindow == null) {
            return null;
        }
        return customEmojiReactionsWindow.windowView;
    }

    public void invalidateLoopViews() {
        for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            if (childAt instanceof ReactionHolderView) {
                ((ReactionHolderView) childAt).loopImageView.invalidate();
            }
        }
    }

    public boolean isFlippedVertically() {
        return this.isFlippedVertically;
    }

    public void measureHint() {
        if (this.hintMeasured || !this.hasHint || getMeasuredWidth() <= 0) {
            return;
        }
        int iMin = Math.min(AndroidUtilities.dp(320.0f), getMeasuredWidth() - AndroidUtilities.dp(16.0f));
        StaticLayout staticLayout = new StaticLayout(this.hintView.getText(), this.hintView.getPaint(), iMin, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.hintViewHeight = staticLayout.getHeight();
        this.hintViewWidth = 0;
        for (int i = 0; i < staticLayout.getLineCount(); i++) {
            this.hintViewWidth = Math.max(this.hintViewWidth, (int) Math.ceil(staticLayout.getLineWidth(i)));
        }
        if (staticLayout.getLineCount() <= 1 || this.hintView.getText().toString().contains("\n")) {
            this.hintView.setWidth(AndroidUtilities.dp(16.0f) + iMin);
        } else {
            int iCutInFancyHalf = HintView2.cutInFancyHalf(this.hintView.getText(), this.hintView.getPaint());
            StaticLayout staticLayout2 = new StaticLayout(this.hintView.getText(), this.hintView.getPaint(), iCutInFancyHalf, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.hintViewHeight = staticLayout2.getHeight();
            this.hintViewWidth = 0;
            for (int i2 = 0; i2 < staticLayout2.getLineCount(); i2++) {
                this.hintViewWidth = Math.max(this.hintViewWidth, (int) Math.ceil(staticLayout2.getLineWidth(i2)));
            }
            this.hintView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
            this.hintView.setWidth(AndroidUtilities.dp(48.0f) + iCutInFancyHalf);
        }
        int iMax = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(7.0f) + this.hintViewHeight);
        int i3 = this.type;
        if (i3 == 1 || i3 == 2) {
            iMax = AndroidUtilities.dp(20.0f);
        } else {
            getLayoutParams().height = AndroidUtilities.dp(22.0f) + AndroidUtilities.dp(52.0f) + iMax;
        }
        ((FrameLayout.LayoutParams) this.nextRecentReaction.getLayoutParams()).topMargin = iMax;
        ((FrameLayout.LayoutParams) this.recyclerListView.getLayoutParams()).topMargin = iMax;
        this.hintMeasured = true;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.type == 5) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    public void onCustomEmojiWindowClosing() {
        ValueAnimator valueAnimator = this.pullingDownBackAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.pullingLeftOffset = 0.0f;
        FrameLayout frameLayout = this.customReactionsContainer;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
        invalidate();
    }

    public void onCustomEmojiWindowOpened() {
        ValueAnimator valueAnimator = this.pullingDownBackAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.pullingLeftOffset = 0.0f;
        FrameLayout frameLayout = this.customReactionsContainer;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
        invalidate();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.type == 5) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z) {
        ReactionsContainerDelegate reactionsContainerDelegate = this.delegate;
        if (reactionsContainerDelegate != null) {
            reactionsContainerDelegate.onReactionClicked(view, visibleReaction, z, true);
        }
        if (this.type == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public void onShownCustomEmojiReactionDialog() {
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateShaders();
    }

    public void prepareAnimation(boolean z) {
        this.prepareAnimation = z;
        invalidate();
    }

    public void reset() {
        this.isHiddenNextReaction = true;
        this.pressedReactionPosition = 0;
        this.pressedProgress = 0.0f;
        this.pullingLeftOffset = 0.0f;
        this.pressedReaction = null;
        this.clicked = false;
        AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, (com.google.android.exoplayer2.util.Consumer) new UniversalRecyclerView$$ExternalSyntheticLambda3(this, 2));
        this.lastVisibleViews.clear();
        this.recyclerListView.invalidate();
        FrameLayout frameLayout = this.customReactionsContainer;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
        invalidate();
    }

    @Override
    public void setAlpha(float f) {
        if (getAlpha() != f && f == 0.0f) {
            this.lastVisibleViews.clear();
            for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
                if (this.recyclerListView.getChildAt(i) instanceof ReactionHolderView) {
                    ((ReactionHolderView) this.recyclerListView.getChildAt(i)).resetAnimation();
                }
            }
        }
        super.setAlpha(f);
    }

    public void setBackgroundFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundProvider blurredBackgroundProvider) {
        this.backgroundFactory = blurredBackgroundDrawableViewFactory;
        this.backgroundColorProvider = blurredBackgroundProvider;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this, null, true);
        blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProvider);
        Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate, AndroidUtilities.dp(24.0f), 8.0f);
        this.blurredBackgroundDrawable = blurredBackgroundDrawableCreate;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = blurredBackgroundDrawableViewFactory.create(this, null, true);
        blurredBackgroundDrawableCreate2.setColorProvider(blurredBackgroundProvider);
        Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate2, AndroidUtilities.dp(8.0f), 8.0f);
        this.blurredBackgroundDrawable1 = blurredBackgroundDrawableCreate2;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = blurredBackgroundDrawableViewFactory.create(this, null, true);
        blurredBackgroundDrawableCreate3.setColorProvider(blurredBackgroundProvider);
        Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate3, AndroidUtilities.dp(4.0f), 8.0f);
        this.blurredBackgroundDrawable2 = blurredBackgroundDrawableCreate3;
    }

    public void setBubbleOffset(float f) {
        this.bubblesOffset = f;
    }

    public void setChatScrimView(ChatScrimPopupContainerLayout chatScrimPopupContainerLayout) {
        this.chatScrimPopupContainerLayout = chatScrimPopupContainerLayout;
    }

    public void setCurrentAccount(int i) {
        this.currentAccount = i;
    }

    public void setCustomEmojiEnterProgress(float f) {
        this.customEmojiReactionsEnterProgress = f;
        ChatScrimPopupContainerLayout chatScrimPopupContainerLayout = this.chatScrimPopupContainerLayout;
        if (chatScrimPopupContainerLayout != null) {
            chatScrimPopupContainerLayout.setPopupAlpha(1.0f - f);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z) {
        if (z) {
            this.customEmojiReactionsIconView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(28.0f), 0, ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_listSelector, false), 40)));
        } else {
            this.customEmojiReactionsIconView.setBackground(null);
        }
    }

    public void setDelegate(ReactionsContainerDelegate reactionsContainerDelegate) {
        this.delegate = reactionsContainerDelegate;
    }

    public void setFlippedVertically(boolean z) {
        this.isFlippedVertically = z;
        invalidate();
    }

    public void setFragment(BaseFragment baseFragment) {
        this.fragment = baseFragment;
    }

    public void setHint(CharSequence charSequence) {
        this.hasHint = true;
        if (this.hintView == null) {
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext(), this.resourcesProvider);
            this.hintView = linksTextView;
            linksTextView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.hintView.setClickable(true);
            this.hintView.setTextSize(1, 12.0f);
            int i = this.type;
            if (i == 1 || i == 2 || i == 4) {
                this.hintView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
                this.hintView.setAlpha(0.5f);
            } else {
                this.hintView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider));
            }
            this.hintView.setGravity(1);
            addView(this.hintView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.hintView.setText(charSequence);
        this.hintMeasured = false;
        ((FrameLayout.LayoutParams) this.nextRecentReaction.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.recyclerListView.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public void setMessage(MessageObject messageObject, TLRPC.ChatFull chatFull, boolean z) {
        int i;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.messageObject = messageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (tL_messageReactions2 = message.reactions) == null) {
            i = 0;
        } else {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            int i2 = 0;
            i = 0;
            while (i2 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i2);
                i2++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i++;
                }
            }
        }
        this.hitLimit = this.type == 0 && this.messageObject != null && i >= MessagesController.getInstance(this.currentAccount).getChatMaxUniqReactions(this.messageObject.getDialogId());
        this.channelReactions = this.type == 0 && this.messageObject != null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.messageObject.getDialogId())));
        ArrayList arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.isForwardedChannelPost() && (chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-messageObject.getFromChatId())) == null) {
            this.waitingLoadingChatId = -messageObject.getFromChatId();
            MessagesController.getInstance(this.currentAccount).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        this.hasStar = false;
        int i3 = this.type;
        if (i3 == 3) {
            this.allReactionsAvailable = UserConfig.getInstance(this.currentAccount).isPremium();
            fillRecentReactionsList(arrayList2);
        } else if (i3 == 5) {
            this.allReactionsAvailable = true;
            fillRecentReactionsList(arrayList2);
        } else if (this.hitLimit) {
            this.allReactionsAvailable = false;
            if (chatFull != null && chatFull.paid_reactions_available) {
                this.hasStar = true;
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = new ReactionsLayoutInBubble.VisibleReaction();
                visibleReaction.isStar = true;
                arrayList2.add(visibleReaction);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.messageObject.messageOwner.reactions.results;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i4);
                i4++;
                arrayList2.add(ReactionsLayoutInBubble.VisibleReaction.fromTL(reactionCount2.reaction));
            }
        } else if (chatFull != null) {
            if (chatFull.paid_reactions_available) {
                this.hasStar = true;
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = new ReactionsLayoutInBubble.VisibleReaction();
                visibleReaction2.isStar = true;
                arrayList2.add(visibleReaction2);
            }
            TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chatFull.id));
                if (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) {
                    this.allReactionsAvailable = false;
                } else {
                    this.allReactionsAvailable = true;
                }
                fillRecentReactionsList(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i5);
                    i5++;
                    TLRPC.Reaction reaction2 = reaction;
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList()) {
                        if (!(reaction2 instanceof TLRPC.TL_reactionEmoji) || !tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                            if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction2));
                                break;
                            }
                        } else {
                            arrayList2.add(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction2));
                            break;
                        }
                    }
                }
            }
        } else {
            this.allReactionsAvailable = true;
            fillRecentReactionsList(arrayList2);
        }
        filterReactions(arrayList2);
        this.showExpandableReactions = !this.hitLimit && ((!this.allReactionsAvailable && arrayList2.size() > 16) || (this.allReactionsAvailable && !UserConfig.getInstance(this.currentAccount).isPremium() && MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()));
        if (this.type == 3 && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.showExpandableReactions = false;
        }
        if (this.type == 4) {
            this.showExpandableReactions = true;
        }
        setVisibleReactionsList(arrayList2, z);
        if (messageObject == null || (tL_messageReactions = messageObject.messageOwner.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i6 = 0; i6 < messageObject.messageOwner.reactions.results.size(); i6++) {
            if (messageObject.messageOwner.reactions.results.get(i6).chosen) {
                this.selectedReactions.add(ReactionsLayoutInBubble.VisibleReaction.fromTL(messageObject.messageOwner.reactions.results.get(i6).reaction));
            }
        }
    }

    public void setMiniBubblesOffset(float f) {
        this.miniBubblesOffset = f;
    }

    public void setMirrorX(boolean z) {
        this.mirrorX = z;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.onSwitchedToLoopView = runnable;
    }

    public void setParentLayout(ChatScrimPopupContainerLayout chatScrimPopupContainerLayout) {
        this.parentLayout = chatScrimPopupContainerLayout;
    }

    public void setPaused(boolean z, boolean z2) {
        CustomEmojiReactionsWindow.AnonymousClass2 anonymousClass2;
        if (this.paused == z) {
            return;
        }
        this.paused = z;
        this.pausedExceptSelected = z2;
        CustomEmojiReactionsWindow customEmojiReactionsWindow = this.reactionsWindow;
        if (customEmojiReactionsWindow == null || (anonymousClass2 = customEmojiReactionsWindow.selectAnimatedEmojiDialog) == null) {
            return;
        }
        anonymousClass2.setPaused(z, z2);
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        this.selectedReactions.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            ReactionsLayoutInBubble.VisibleReaction visibleReactionFromEmojicon = ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(str);
            this.selectedReactions.add(visibleReactionFromEmojicon);
            this.alwaysSelectedReactions.add(visibleReactionFromEmojicon);
        }
        updateSelected(true);
    }

    public void setSelectedReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        this.selectedReactions.clear();
        if (visibleReaction != null) {
            this.selectedReactions.add(visibleReaction);
        }
        this.listAdapter.notifyDataSetChanged();
    }

    public void setSelectedReactionAnimated(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        this.selectedReactions.clear();
        if (visibleReaction != null) {
            this.selectedReactions.add(visibleReaction);
        }
        updateSelected(true);
    }

    public void setSelectedReactionInclusive(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        this.selectedReactions.clear();
        if (visibleReaction != null) {
            this.selectedReactions.add(visibleReaction);
        }
        updateSelected(true);
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        this.selectedReactions.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = arrayList.get(i);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i2 = 0; i2 < messageObject.messageOwner.reactions.results.size(); i2++) {
                    if (messageObject.messageOwner.reactions.results.get(i2).chosen) {
                        this.selectedReactions.add(ReactionsLayoutInBubble.VisibleReaction.fromTL(messageObject.messageOwner.reactions.results.get(i2).reaction));
                    }
                }
            }
        }
        this.listAdapter.notifyDataSetChanged();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        this.selectedReactions.clear();
        this.selectedReactions.addAll(getInclusiveReactions(arrayList));
        updateSelected(true);
    }

    public void setSkipDraw(boolean z) {
        if (this.skipDraw != z) {
            this.skipDraw = z;
            if (!z) {
                for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
                    if (this.recyclerListView.getChildAt(i) instanceof ReactionHolderView) {
                        ReactionHolderView reactionHolderView = (ReactionHolderView) this.recyclerListView.getChildAt(i);
                        if (reactionHolderView.hasEnterAnimation && (reactionHolderView.loopImageView.getImageReceiver().getLottieAnimation() != null || reactionHolderView.loopImageView.getImageReceiver().getAnimation() != null)) {
                            reactionHolderView.loopImageView.setVisibility(0);
                            reactionHolderView.enterImageView.setVisibility(4);
                            if (reactionHolderView.shouldSwitchToLoopView) {
                                reactionHolderView.switchedToLoopView = true;
                            }
                        }
                        reactionHolderView.invalidate();
                    }
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        this.selectedReactions.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            this.selectedReactions.add(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction));
        }
        this.listAdapter.notifyDataSetChanged();
    }

    public void setTop(boolean z) {
        this.isTop = z;
    }

    public void setTransitionProgress(float f) {
        this.transitionProgress = f;
        ChatScrimPopupContainerLayout chatScrimPopupContainerLayout = this.parentLayout;
        if (chatScrimPopupContainerLayout != null) {
            if (!this.animatePopup || !allowSmoothEnterTransition()) {
                f = 1.0f;
            }
            chatScrimPopupContainerLayout.setReactionsTransitionProgress(f);
        }
        invalidate();
    }

    @Override
    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
        }
    }

    public boolean showCustomEmojiReaction() {
        return this.allReactionsAvailable || this.showExpandableReactions;
    }

    public boolean showExpandableReactions() {
        return this.showExpandableReactions;
    }

    public void startEnterAnimation(boolean z) {
        ObjectAnimator duration;
        this.animatePopup = z;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.notificationsLocker.lock();
        if (allowSmoothEnterTransition()) {
            duration = ObjectAnimator.ofFloat(this, TRANSITION_PROGRESS_VALUE, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, TRANSITION_PROGRESS_VALUE, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ReactionsContainerLayout.this.notificationsLocker.unlock();
            }
        });
        duration.start();
    }

    public final class ReactionHolderView extends FrameLayout {
        public ReactionsLayoutInBubble.VisibleReaction currentReaction;
        public boolean drawSelected;
        public ValueAnimator enterAnimator;
        public BackupImageView enterImageView;
        public float enterScale;
        public boolean hasEnterAnimation;
        private boolean isEnter;
        public boolean isLocked;
        public PremiumLockIconView lockIconView;
        Runnable longPressRunnable;
        public BackupImageView loopImageView;
        public StarsReactionsSheet.Particles particles;
        Runnable playRunnable;
        public int position;
        private ImageReceiver preloadImageReceiver;
        boolean pressed;
        public BackupImageView pressedBackupImageView;
        float pressedX;
        float pressedY;
        private final boolean recyclerReaction;
        public boolean selected;
        public boolean shouldSwitchToLoopView;
        public float sideScale;
        public boolean switchedToLoopView;
        boolean touchable;
        public boolean waitingAnimation;

        public ReactionHolderView(Context context, boolean z) {
            super(context);
            this.preloadImageReceiver = new ImageReceiver();
            this.sideScale = 1.0f;
            this.drawSelected = true;
            this.playRunnable = new Runnable() {
                @Override
                public void run() {
                    if (ReactionHolderView.this.enterImageView.getImageReceiver().getLottieAnimation() != null && !ReactionHolderView.this.enterImageView.getImageReceiver().getLottieAnimation().isRunning() && !ReactionHolderView.this.enterImageView.getImageReceiver().getLottieAnimation().isGeneratingCache()) {
                        ReactionHolderView.this.enterImageView.getImageReceiver().getLottieAnimation().start();
                    }
                    ReactionHolderView.this.waitingAnimation = false;
                }
            };
            this.enterScale = 1.0f;
            this.longPressRunnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        ReactionHolderView.this.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                    reactionsContainerLayout.pressedReactionPosition = reactionsContainerLayout.visibleReactionsList.indexOf(ReactionHolderView.this.currentReaction);
                    ReactionHolderView reactionHolderView = ReactionHolderView.this;
                    ReactionsContainerLayout.this.pressedReaction = reactionHolderView.currentReaction;
                    ReactionsContainerLayout.this.invalidate();
                }
            };
            this.touchable = true;
            this.recyclerReaction = z;
            this.enterImageView = new AnonymousClass2(context, ReactionsContainerLayout.this);
            this.loopImageView = new BackupImageView(context) {
                @Override
                public ImageReceiver createImageReciever() {
                    return new ImageReceiver(this) {
                        @Override
                        public boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z2, int i2) {
                            boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i, z2, i2);
                            if (imageBitmapByKey && (drawable instanceof RLottieDrawable)) {
                                RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                                rLottieDrawable.setCurrentFrame(0, false, true);
                                rLottieDrawable.stop();
                            }
                            return imageBitmapByKey;
                        }
                    };
                }

                @Override
                public void invalidate() {
                    if (HwEmojis.grabIfWeakDevice(this)) {
                        return;
                    }
                    super.invalidate();
                }

                @Override
                public void onDraw(Canvas canvas) {
                    ReactionHolderView.this.checkPlayLoopImage();
                    super.onDraw(canvas);
                }

                @Override
                public void invalidate(int i, int i2, int i3, int i4) {
                    if (HwEmojis.grabIfWeakDevice(this)) {
                        return;
                    }
                    super.invalidate(i, i2, i3, i4);
                }
            };
            this.enterImageView.getImageReceiver().setAutoRepeat(0);
            this.enterImageView.getImageReceiver().setAllowStartLottieAnimation(false);
            this.pressedBackupImageView = new BackupImageView(context) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    ReactionsContainerLayout.this.invalidate();
                }

                @Override
                public void onDraw(Canvas canvas) {
                    AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
                    ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.getImageReceiver() : this.imageReceiver;
                    if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().start();
                    }
                    super.onDraw(canvas);
                }
            };
            addView(this.enterImageView, LayoutHelper.createFrame(34, 34, 17));
            addView(this.pressedBackupImageView, LayoutHelper.createFrame(34, 34, 17));
            addView(this.loopImageView, LayoutHelper.createFrame(34, 34, 17));
            if (ReactionsContainerLayout.this.type == 4) {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setDuration(100L);
                layoutTransition.enableTransitionType(4);
                setLayoutTransition(layoutTransition);
            }
            this.enterImageView.setLayerNum(Integer.MAX_VALUE);
            this.loopImageView.setLayerNum(Integer.MAX_VALUE);
            this.loopImageView.imageReceiver.setAutoRepeat(0);
            this.loopImageView.imageReceiver.setAllowStartAnimation(false);
            this.loopImageView.imageReceiver.setAllowStartLottieAnimation(false);
            this.pressedBackupImageView.setLayerNum(Integer.MAX_VALUE);
        }

        public void lambda$play$0(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.enterScale = fFloatValue;
            this.loopImageView.setScaleY(fFloatValue * (this.selected ? 0.76f : 1.0f));
            this.loopImageView.setScaleX(this.enterScale * (this.selected ? 0.76f : 1.0f));
        }

        public void setReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i) {
            updateSelected(visibleReaction, false);
            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = this.currentReaction;
            if (visibleReaction2 != null && visibleReaction2.equals(visibleReaction)) {
                this.position = i;
                updateImage(visibleReaction);
                return;
            }
            boolean zIsPremium = UserConfig.getInstance(ReactionsContainerLayout.this.currentAccount).isPremium();
            boolean z = (ReactionsContainerLayout.this.type == 3 && !zIsPremium) || (ReactionsContainerLayout.this.type == 5 && visibleReaction.premium && !zIsPremium);
            this.isLocked = z;
            if (z && this.lockIconView == null) {
                PremiumLockIconView premiumLockIconView = new PremiumLockIconView(getContext(), PremiumLockIconView.TYPE_STICKERS_PREMIUM_LOCKED, null);
                this.lockIconView = premiumLockIconView;
                premiumLockIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                this.lockIconView.setImageReceiver(this.loopImageView.getImageReceiver());
                addView(this.lockIconView, LayoutHelper.createFrame(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
            }
            PremiumLockIconView premiumLockIconView2 = this.lockIconView;
            if (premiumLockIconView2 != null) {
                premiumLockIconView2.setVisibility(this.isLocked ? 0 : 8);
            }
            resetAnimation();
            this.currentReaction = visibleReaction;
            this.hasEnterAnimation = visibleReaction.isStar || (visibleReaction.emojicon != null && ((ReactionsContainerLayout.this.showCustomEmojiReaction() || ReactionsContainerLayout.this.allReactionsIsDefault) && LiteMode.isEnabled(8200)));
            if (ReactionsContainerLayout.this.type == 4 || this.currentReaction.isEffect) {
                this.hasEnterAnimation = false;
            }
            ReactionsLayoutInBubble.VisibleReaction visibleReaction3 = this.currentReaction;
            if (visibleReaction3.isStar || visibleReaction3.emojicon != null) {
                updateImage(visibleReaction);
                this.pressedBackupImageView.setAnimatedEmojiDrawable(null);
                if (this.enterImageView.getImageReceiver().getLottieAnimation() != null) {
                    this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                }
                PremiumLockIconView premiumLockIconView3 = this.lockIconView;
                if (premiumLockIconView3 != null) {
                    premiumLockIconView3.setAnimatedEmojiDrawable(null);
                }
            } else {
                this.pressedBackupImageView.getImageReceiver().clearImage();
                this.loopImageView.getImageReceiver().clearImage();
                AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(4, ReactionsContainerLayout.this.currentAccount, this.currentReaction.documentId);
                AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(3, ReactionsContainerLayout.this.currentAccount, this.currentReaction.documentId);
                if (ReactionsContainerLayout.this.type == 1 || ReactionsContainerLayout.this.type == 2 || ReactionsContainerLayout.this.type == 4) {
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
                    animatedEmojiDrawable2.setColorFilter(new PorterDuffColorFilter(-1, mode));
                } else {
                    int i2 = Theme.key_windowBackgroundWhiteBlueIcon;
                    int color = Theme.getColor(i2, ReactionsContainerLayout.this.resourcesProvider);
                    PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                    animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(color, mode2));
                    animatedEmojiDrawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, ReactionsContainerLayout.this.resourcesProvider), mode2));
                }
                this.pressedBackupImageView.setAnimatedEmojiDrawable(animatedEmojiDrawable);
                this.loopImageView.setAnimatedEmojiDrawable(animatedEmojiDrawable2);
                PremiumLockIconView premiumLockIconView4 = this.lockIconView;
                if (premiumLockIconView4 != null) {
                    premiumLockIconView4.setAnimatedEmojiDrawable(animatedEmojiDrawable2);
                }
            }
            setFocusable(true);
            boolean z2 = this.hasEnterAnimation;
            this.shouldSwitchToLoopView = z2;
            if (z2) {
                this.switchedToLoopView = false;
                this.enterImageView.setVisibility(0);
                this.loopImageView.setVisibility(8);
            } else {
                this.enterImageView.setVisibility(8);
                this.loopImageView.setVisibility(0);
                this.switchedToLoopView = true;
            }
            ViewGroup.LayoutParams layoutParams = this.loopImageView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.loopImageView.getLayoutParams();
            int iDp = AndroidUtilities.dp(34.0f);
            layoutParams2.height = iDp;
            layoutParams.width = iDp;
            ViewGroup.LayoutParams layoutParams3 = this.enterImageView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = this.enterImageView.getLayoutParams();
            int iDp2 = AndroidUtilities.dp(34.0f);
            layoutParams4.height = iDp2;
            layoutParams3.width = iDp2;
        }

        private void updateImage(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            if (visibleReaction != null && visibleReaction.isStar) {
                this.enterImageView.getImageReceiver().setImageBitmap(new RLottieDrawable(R.raw.star_reaction, "star_reaction", AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f)));
                this.loopImageView.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
                if (this.particles == null) {
                    this.particles = new StarsReactionsSheet.Particles(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                    return;
                }
                return;
            }
            if (ReactionsContainerLayout.this.type == 4 && visibleReaction != null && visibleReaction.emojicon != null) {
                this.enterImageView.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(visibleReaction.emojicon));
                this.loopImageView.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(visibleReaction.emojicon));
                return;
            }
            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = this.currentReaction;
            if (visibleReaction2.isEffect) {
                TLRPC.Document effectDocument = MessagesController.getInstance(ReactionsContainerLayout.this.currentAccount).getEffectDocument(this.currentReaction.documentId);
                this.loopImageView.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.hasEnterAnimation ? null : DocumentObject.getSvgThumb(effectDocument, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f), 0L, "tgs", this.currentReaction, 0);
                return;
            }
            if (visibleReaction2.emojicon != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(ReactionsContainerLayout.this.currentAccount).getReactionsMap().get(this.currentReaction.emojicon);
                if (tL_availableReaction != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.activate_animation, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                    if (LiteMode.isEnabled(8200) && ReactionsContainerLayout.this.type != 4) {
                        this.enterImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", visibleReaction, 0);
                        this.loopImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.hasEnterAnimation ? null : svgThumb, 0L, "tgs", this.currentReaction, 0);
                    } else if (SharedConfig.getDevicePerformanceClass() <= 0 || ReactionsContainerLayout.this.type == 4) {
                        this.loopImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.hasEnterAnimation ? null : svgThumb, 0L, "tgs", this.currentReaction, 0);
                    } else {
                        this.enterImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", visibleReaction, 0);
                        this.loopImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.hasEnterAnimation ? null : svgThumb, 0L, "tgs", this.currentReaction, 0);
                    }
                    if (this.enterImageView.getImageReceiver().getLottieAnimation() != null) {
                        this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false, true);
                    }
                    this.pressedBackupImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", visibleReaction, 0);
                    this.preloadImageReceiver.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(ReactionsContainerLayout.this.currentAccount).preloadImage(this.preloadImageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ReactionsEffectOverlay.getFilterForAroundAnimation());
                }
                PremiumLockIconView premiumLockIconView = this.lockIconView;
                if (premiumLockIconView != null) {
                    premiumLockIconView.setImageReceiver(this.loopImageView.getImageReceiver());
                }
            }
        }

        public void checkPlayLoopImage() {
            BackupImageView backupImageView = this.loopImageView;
            AnimatedEmojiDrawable animatedEmojiDrawable = backupImageView.animatedEmojiDrawable;
            ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.getImageReceiver() : backupImageView.imageReceiver;
            if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
                return;
            }
            ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
            if (reactionsContainerLayout.reactionsWindow != null || this.pressed || !reactionsContainerLayout.allReactionsIsDefault) {
                imageReceiver.getLottieAnimation().start();
            } else if (imageReceiver.getLottieAnimation().getCurrentFrame() <= 2) {
                imageReceiver.getLottieAnimation().stop();
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            if (this.selected && this.drawSelected) {
                float measuredWidth = getMeasuredWidth() >> 1;
                float measuredHeight = getMeasuredHeight() >> 1;
                float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.currentReaction;
                canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (visibleReaction == null || !visibleReaction.isStar) ? ReactionsContainerLayout.this.selectedPaint : ReactionsContainerLayout.this.starSelectedPaint);
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = this.loopImageView.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null) {
                if (this.position == 0) {
                    this.loopImageView.animatedEmojiDrawable.getImageReceiver().setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
                } else {
                    this.loopImageView.animatedEmojiDrawable.getImageReceiver().setRoundRadius(this.selected ? AndroidUtilities.dp(6.0f) : 0);
                }
            }
            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = this.currentReaction;
            if (visibleReaction2 != null && visibleReaction2.isStar && this.particles != null && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                int height = (int) (getHeight() * 0.7f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f = height / 2.0f;
                rectF.set((getWidth() / 2.0f) - f, (getHeight() / 2.0f) - f, (getWidth() / 2.0f) + f, (getHeight() / 2.0f) + f);
                RLottieDrawable lottieAnimation = this.enterImageView.getImageReceiver().getLottieAnimation();
                StarsReactionsSheet.Particles particles = this.particles;
                particles.visibleCount = (int) (particles.particles.size() * ((lottieAnimation == null || lottieAnimation.getCurrentFrame() <= 30) ? 0.0f : Utilities.clamp01((lottieAnimation.getCurrentFrame() - 30) / 30.0f)));
                StarsReactionsSheet.Particles particles2 = this.particles;
                particles2.bounds.set(rectF);
                particles2.removeParticlesOutside();
                this.particles.process();
                this.particles.draw(canvas, -673522, 1.0f);
                invalidate();
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            resetAnimation();
            this.preloadImageReceiver.onAttachedToWindow();
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.preloadImageReceiver.onDetachedFromWindow();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.currentReaction;
            if (visibleReaction != null) {
                String str = visibleReaction.emojicon;
                if (str != null) {
                    accessibilityNodeInfo.setText(str);
                    accessibilityNodeInfo.setEnabled(true);
                } else {
                    accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrCustomEmoji));
                    accessibilityNodeInfo.setEnabled(true);
                }
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!this.touchable || ReactionsContainerLayout.this.cancelPressedAnimation != null) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                this.pressed = true;
                this.pressedX = motionEvent.getX();
                this.pressedY = motionEvent.getY();
                if (this.sideScale == 1.0f && !this.isLocked && ReactionsContainerLayout.this.type != 3 && ReactionsContainerLayout.this.type != 4 && ReactionsContainerLayout.this.type != 5 && (ReactionsContainerLayout.this.delegate == null || ReactionsContainerLayout.this.delegate.allowLongPress())) {
                    AndroidUtilities.runOnUIThread(this.longPressRunnable, ViewConfiguration.getLongPressTimeout());
                }
            }
            float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
            if ((motionEvent.getAction() != 2 || (Math.abs(this.pressedX - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.pressedY - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return true;
            }
            if (motionEvent.getAction() == 1 && this.pressed && ((ReactionsContainerLayout.this.pressedReaction == null || ReactionsContainerLayout.this.pressedProgress > 0.8f) && ReactionsContainerLayout.this.delegate != null)) {
                ReactionsContainerLayout.this.clicked = true;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                if (jCurrentTimeMillis - reactionsContainerLayout.lastReactionSentTime > 300) {
                    reactionsContainerLayout.lastReactionSentTime = System.currentTimeMillis();
                    ReactionsContainerLayout.this.delegate.onReactionClicked(this, this.currentReaction, ReactionsContainerLayout.this.pressedProgress > 0.8f, false);
                }
            }
            if (!ReactionsContainerLayout.this.clicked) {
                ReactionsContainerLayout.this.cancelPressed();
            }
            AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
            this.pressed = false;
            return true;
        }

        public boolean play(int i) {
            if (ReactionsContainerLayout.this.animationEnabled) {
                AndroidUtilities.cancelRunOnUIThread(this.playRunnable);
                if (this.hasEnterAnimation) {
                    if (this.enterImageView.getImageReceiver().getLottieAnimation() == null || this.enterImageView.getImageReceiver().getLottieAnimation().isGeneratingCache() || this.isEnter) {
                        if (this.enterImageView.getImageReceiver().getLottieAnimation() != null && this.isEnter && !this.enterImageView.getImageReceiver().getLottieAnimation().isRunning() && !this.enterImageView.getImageReceiver().getLottieAnimation().isGeneratingCache()) {
                            this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(this.enterImageView.getImageReceiver().getLottieAnimation().getFramesCount() - 1, false);
                        }
                        this.loopImageView.setScaleY(this.enterScale * (this.selected ? 0.76f : 1.0f));
                        this.loopImageView.setScaleX(this.enterScale * (this.selected ? 0.76f : 1.0f));
                        return false;
                    }
                    this.isEnter = true;
                    if (i == 0) {
                        this.waitingAnimation = false;
                        this.enterImageView.getImageReceiver().getLottieAnimation().stop();
                        this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                        this.playRunnable.run();
                        return true;
                    }
                    this.waitingAnimation = true;
                    this.enterImageView.getImageReceiver().getLottieAnimation().stop();
                    this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                    AndroidUtilities.runOnUIThread(this.playRunnable, i);
                    return true;
                }
                if (!this.isEnter) {
                    this.enterScale = 0.0f;
                    this.loopImageView.setScaleX(0.0f);
                    this.loopImageView.setScaleY(0.0f);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.enterAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 19));
                    this.enterAnimator.setDuration(150L);
                    this.enterAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.enterAnimator.setStartDelay((long) (i * ReactionsContainerLayout.this.durationScale));
                    this.enterAnimator.start();
                    this.isEnter = true;
                }
            } else {
                resetAnimation();
                this.isEnter = true;
                if (!this.hasEnterAnimation) {
                    this.loopImageView.setVisibility(0);
                    this.loopImageView.setScaleY(this.enterScale * (this.selected ? 0.76f : 1.0f));
                    this.loopImageView.setScaleX(this.enterScale * (this.selected ? 0.76f : 1.0f));
                    return false;
                }
            }
            return false;
        }

        public void resetAnimation() {
            if (this.hasEnterAnimation) {
                AndroidUtilities.cancelRunOnUIThread(this.playRunnable);
                if (this.enterImageView.getImageReceiver().getLottieAnimation() != null && !this.enterImageView.getImageReceiver().getLottieAnimation().isGeneratingCache()) {
                    this.enterImageView.getImageReceiver().getLottieAnimation().stop();
                    if (ReactionsContainerLayout.this.animationEnabled) {
                        this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false, true);
                    } else {
                        this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(this.enterImageView.getImageReceiver().getLottieAnimation().getFramesCount() - 1, false, true);
                    }
                }
                this.loopImageView.setVisibility(4);
                this.enterImageView.setVisibility(0);
                this.switchedToLoopView = false;
                this.loopImageView.setScaleY(this.enterScale * (this.selected ? 0.76f : 1.0f));
                this.loopImageView.setScaleX(this.enterScale * (this.selected ? 0.76f : 1.0f));
            } else {
                this.loopImageView.animate().cancel();
                if (ReactionsContainerLayout.this.skipEnterAnimation) {
                    this.loopImageView.setScaleY(this.enterScale * (this.selected ? 0.76f : 1.0f));
                    this.loopImageView.setScaleX(this.enterScale * (this.selected ? 0.76f : 1.0f));
                } else {
                    this.loopImageView.setScaleY(0.0f);
                    this.loopImageView.setScaleX(0.0f);
                }
            }
            this.isEnter = false;
        }

        public void updateSelected(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z) {
            boolean z2 = this.selected;
            boolean zContains = ReactionsContainerLayout.this.selectedReactions.contains(visibleReaction);
            this.selected = zContains;
            if (zContains != z2) {
                if (z) {
                    ViewPropertyAnimator duration = this.loopImageView.animate().scaleX(this.enterScale * (this.selected ? 0.76f : 1.0f)).scaleY(this.enterScale * (this.selected ? 0.76f : 1.0f)).setDuration(240L);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    duration.setInterpolator(cubicBezierInterpolator).start();
                    this.enterImageView.animate().scaleX(this.enterScale * (this.selected ? 0.76f : 1.0f)).scaleY(this.enterScale * (this.selected ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(cubicBezierInterpolator).start();
                } else {
                    this.loopImageView.setScaleX(this.enterScale * (zContains ? 0.76f : 1.0f));
                    this.loopImageView.setScaleY(this.enterScale * (this.selected ? 0.76f : 1.0f));
                    this.enterImageView.setScaleX(this.enterScale * (this.selected ? 0.76f : 1.0f));
                    this.enterImageView.setScaleY(this.enterScale * (this.selected ? 0.76f : 1.0f));
                }
                requestLayout();
                invalidate();
            }
        }

        public class AnonymousClass2 extends BackupImageView {
            final ReactionsContainerLayout val$this$0;

            public AnonymousClass2(Context context, ReactionsContainerLayout reactionsContainerLayout) {
                super(context);
                this.val$this$0 = reactionsContainerLayout;
            }

            public void lambda$dispatchDraw$0() {
                ReactionHolderView.this.enterImageView.setVisibility(4);
            }

            @Override
            public ImageReceiver createImageReciever() {
                return new ImageReceiver(this) {
                    @Override
                    public boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
                        if (drawable instanceof RLottieDrawable) {
                            ((RLottieDrawable) drawable).setCurrentFrame(0, false, true);
                        }
                        return super.setImageBitmapByKey(drawable, str, i, z, i2);
                    }
                };
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (this.imageReceiver.getLottieAnimation() != null && !ReactionHolderView.this.waitingAnimation) {
                    this.imageReceiver.getLottieAnimation().start();
                }
                ReactionHolderView reactionHolderView = ReactionHolderView.this;
                if (reactionHolderView.shouldSwitchToLoopView && !reactionHolderView.switchedToLoopView && this.imageReceiver.getLottieAnimation() != null && this.imageReceiver.getLottieAnimation().isLastFrame() && ReactionHolderView.this.loopImageView.imageReceiver.getLottieAnimation() != null && ReactionHolderView.this.loopImageView.imageReceiver.getLottieAnimation().hasBitmap()) {
                    ReactionHolderView reactionHolderView2 = ReactionHolderView.this;
                    reactionHolderView2.switchedToLoopView = true;
                    reactionHolderView2.loopImageView.imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                    ReactionHolderView.this.loopImageView.setVisibility(0);
                    if (ReactionsContainerLayout.this.onSwitchedToLoopView != null) {
                        ReactionsContainerLayout.this.onSwitchedToLoopView.run();
                    }
                    AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(this, 28));
                }
                invalidate();
            }

            @Override
            public void invalidate() {
                if (HwEmojis.grabIfWeakDevice(this, ReactionsContainerLayout.this)) {
                    return;
                }
                super.invalidate();
                ReactionsContainerLayout.this.invalidate();
            }

            @Override
            public void invalidate(Rect rect) {
                if (HwEmojis.grabIfWeakDevice(this, ReactionsContainerLayout.this)) {
                    return;
                }
                super.invalidate(rect);
                ReactionsContainerLayout.this.invalidate();
            }

            @Override
            public void invalidate(int i, int i2, int i3, int i4) {
                if (HwEmojis.grabIfWeakDevice(this)) {
                    return;
                }
                super.invalidate(i, i2, i3, i4);
            }
        }
    }

    private void drawBubbles(Canvas canvas, float f, float f2, float f3, int i) {
        float f4;
        if (this.type == 1) {
            return;
        }
        canvas.save();
        if (this.isTop) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(this.rect.top, getMeasuredHeight(), CubicBezierInterpolator.DEFAULT.getInterpolation(this.flipVerticalProgress)) - ((int) Math.ceil((1.0f - this.transitionProgress) * (this.rect.height() / 2.0f)))) + 1.0f);
        } else {
            float f5 = this.rect.bottom;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f5, 0.0f, cubicBezierInterpolator.getInterpolation(this.flipVerticalProgress)) - ((int) Math.ceil((1.0f - this.transitionProgress) * (this.rect.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - expandSize(), cubicBezierInterpolator.getInterpolation(this.flipVerticalProgress)));
        }
        float width = ((LocaleController.isRTL || this.mirrorX) ? this.bigCircleOffset : getWidth() - this.bigCircleOffset) + this.bubblesOffset;
        float paddingTop = this.isTop ? getPaddingTop() - expandSize() : (getHeight() - getPaddingBottom()) + expandSize();
        int iDp = AndroidUtilities.dp(3.0f);
        this.shadow.setAlpha(i);
        this.bgPaint.setAlpha(i);
        float f6 = width - f;
        float f7 = iDp;
        float f8 = f7 * f2;
        float f9 = paddingTop - f;
        float f10 = width + f;
        float f11 = paddingTop + f;
        this.shadow.setBounds((int) (f6 - f8), (int) (f9 - f8), (int) (f10 + f8), (int) (f8 + f11));
        this.shadow.draw(canvas);
        if (this.delegate.drawBackground()) {
            this.rectF.set(f6, f9, f10, f11);
            f4 = f;
            this.delegate.drawRoundRect(canvas, this.rectF, f4, getX(), getY(), i, false);
        } else {
            f4 = f;
            if (this.blurredBackgroundDrawable1 != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f6, f9, f10, f11);
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                this.blurredBackgroundDrawable1.setBounds(rect);
                this.blurredBackgroundDrawable1.setAlpha(this.bgPaint.getAlpha());
                this.blurredBackgroundDrawable1.draw(canvas);
            } else {
                canvas.drawCircle(width, paddingTop, f4, this.bgPaint);
            }
        }
        float width2 = this.bubblesOffset + this.miniBubblesOffset + ((LocaleController.isRTL || this.mirrorX) ? this.bigCircleOffset - this.bigCircleRadius : (getWidth() - this.bigCircleOffset) + this.bigCircleRadius);
        float fLerp = AndroidUtilities.lerp(this.isTop ? (getPaddingTop() - expandSize()) - AndroidUtilities.dp(16.0f) : ((getHeight() - this.smallCircleRadius) - f7) + expandSize(), (this.smallCircleRadius + f7) - expandSize(), CubicBezierInterpolator.DEFAULT.getInterpolation(this.flipVerticalProgress));
        float f12 = (-AndroidUtilities.dp(1.0f)) * f2;
        this.shadow.setBounds((int) ((width2 - f4) - f12), (int) ((fLerp - f4) - f12), (int) (width2 + f4 + f12), (int) (f4 + fLerp + f12));
        this.shadow.draw(canvas);
        if (this.delegate.drawBackground()) {
            this.rectF.set(width2 - f3, fLerp - f3, width2 + f3, fLerp + f3);
            this.delegate.drawRoundRect(canvas, this.rectF, f3, getX(), getY(), i, false);
        } else if (this.blurredBackgroundDrawable2 != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(width2 - f3, fLerp - f3, width2 + f3, fLerp + f3);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rectF2.round(rect2);
            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
            this.blurredBackgroundDrawable2.setBounds(rect2);
            this.blurredBackgroundDrawable2.setAlpha(this.bgPaint.getAlpha());
            this.blurredBackgroundDrawable2.draw(canvas);
        } else {
            canvas.drawCircle(width2, fLerp, f3, this.bgPaint);
        }
        canvas.restore();
        this.shadow.setAlpha(255);
        this.bgPaint.setAlpha(255);
    }

    public interface ReactionsContainerDelegate {
        boolean allowLongPress();

        boolean drawBackground();

        void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z);

        void hideMenu();

        boolean needEnterText();

        void onEmojiWindowDismissed();

        void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2);

        public abstract class CC {
            public static boolean $default$allowLongPress(ReactionsContainerDelegate reactionsContainerDelegate) {
                return true;
            }

            public static boolean $default$drawBackground(ReactionsContainerDelegate reactionsContainerDelegate) {
                return false;
            }

            public static boolean $default$needEnterText(ReactionsContainerDelegate reactionsContainerDelegate) {
                return false;
            }

            public static void $default$hideMenu(ReactionsContainerDelegate reactionsContainerDelegate) {
            }

            public static void $default$onEmojiWindowDismissed(ReactionsContainerDelegate reactionsContainerDelegate) {
            }

            public static void $default$drawRoundRect(ReactionsContainerDelegate reactionsContainerDelegate, Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
            }
        }
    }
}
