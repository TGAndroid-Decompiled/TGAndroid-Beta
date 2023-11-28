package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatReactions;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_chatReactionsAll;
import org.telegram.tgnet.TLRPC$TL_chatReactionsNone;
import org.telegram.tgnet.TLRPC$TL_chatReactionsSome;
import org.telegram.tgnet.TLRPC$TL_messageReactions;
import org.telegram.tgnet.TLRPC$TL_reactionCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_reactionEmoji;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.HwEmojis;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
public class ReactionsContainerLayout extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    private boolean allReactionsAvailable;
    private boolean allReactionsIsDefault;
    private List<ReactionsLayoutInBubble.VisibleReaction> allReactionsList;
    private boolean animatePopup;
    private final boolean animationEnabled;
    private Paint bgPaint;
    public int bigCircleOffset;
    private float bigCircleRadius;
    private float bubblesOffset;
    ValueAnimator cancelPressedAnimation;
    private float cancelPressedProgress;
    ChatScrimPopupContainerLayout chatScrimPopupContainerLayout;
    private boolean clicked;
    private int currentAccount;
    private float customEmojiReactionsEnterProgress;
    private InternalImageView customEmojiReactionsIconView;
    FrameLayout customReactionsContainer;
    private ReactionsContainerDelegate delegate;
    public final float durationScale;
    private float flipVerticalProgress;
    BaseFragment fragment;
    private boolean hasHint;
    public TextView hintView;
    private boolean isFlippedVertically;
    public boolean isHiddenNextReaction;
    private boolean isTop;
    long lastReactionSentTime;
    private long lastUpdate;
    HashSet<View> lastVisibleViews;
    HashSet<View> lastVisibleViewsTmp;
    private float leftAlpha;
    private Paint leftShadowPaint;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView.Adapter listAdapter;
    private int[] location;
    private Path mPath;
    private MessageObject messageObject;
    private boolean mirrorX;
    public ReactionHolderView nextRecentReaction;
    final AnimationNotificationsLocker notificationsLocker;
    private Runnable onSwitchedToLoopView;
    private float otherViewsScale;
    ChatScrimPopupContainerLayout parentLayout;
    FrameLayout premiumLockContainer;
    private PremiumLockIconView premiumLockIconView;
    private List<TLRPC$TL_availableReaction> premiumLockedReactions;
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
    private Paint rightShadowPaint;
    private Paint selectedPaint;
    HashSet<ReactionsLayoutInBubble.VisibleReaction> selectedReactions;
    private Drawable shadow;
    private android.graphics.Rect shadowPad;
    private boolean showExpandableReactions;
    boolean skipDraw;
    public boolean skipEnterAnimation;
    private float smallCircleRadius;
    private float transitionProgress;
    private final int type;
    private List<ReactionsLayoutInBubble.VisibleReaction> visibleReactionsList;
    private long waitingLoadingChatId;

    public interface ReactionsContainerDelegate {

        public final class CC {
            public static boolean $default$drawBackground(ReactionsContainerDelegate reactionsContainerDelegate) {
                return false;
            }

            public static void $default$drawRoundRect(ReactionsContainerDelegate reactionsContainerDelegate, Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
            }

            public static boolean $default$needEnterText(ReactionsContainerDelegate reactionsContainerDelegate) {
                return false;
            }

            public static void $default$onEmojiWindowDismissed(ReactionsContainerDelegate reactionsContainerDelegate) {
            }
        }

        boolean drawBackground();

        void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z);

        boolean needEnterText();

        void onEmojiWindowDismissed();

        void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2);
    }

    public ReactionsContainerLayout(int i, BaseFragment baseFragment, Context context, int i2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        boolean z = true;
        this.bgPaint = new Paint(1);
        this.leftShadowPaint = new Paint(1);
        this.rightShadowPaint = new Paint(1);
        this.transitionProgress = 1.0f;
        this.rect = new RectF();
        this.mPath = new Path();
        this.radius = AndroidUtilities.dp(72.0f);
        float dp = AndroidUtilities.dp(8.0f);
        this.bigCircleRadius = dp;
        this.smallCircleRadius = dp / 2.0f;
        this.bigCircleOffset = AndroidUtilities.dp(36.0f);
        this.visibleReactionsList = new ArrayList(20);
        this.premiumLockedReactions = new ArrayList(10);
        this.allReactionsList = new ArrayList(20);
        this.rectF = new RectF();
        this.selectedReactions = new HashSet<>();
        this.location = new int[2];
        this.shadowPad = new android.graphics.Rect();
        new ArrayList();
        this.lastVisibleViews = new HashSet<>();
        this.lastVisibleViewsTmp = new HashSet<>();
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.isHiddenNextReaction = true;
        this.type = i;
        this.durationScale = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        Paint paint = new Paint(1);
        this.selectedPaint = paint;
        paint.setColor(Theme.getColor(Theme.key_listSelector, resourcesProvider));
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
        this.animationEnabled = (!SharedConfig.animationsEnabled() || SharedConfig.getDevicePerformanceClass() == 0) ? false : false;
        this.shadow = ContextCompat.getDrawable(context, R.drawable.reactions_bubble_shadow).mutate();
        android.graphics.Rect rect = this.shadowPad;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        this.shadow.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelShadow), PorterDuff.Mode.MULTIPLY));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            {
                ReactionsContainerLayout.this = this;
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (ReactionsContainerLayout.this.pressedReaction != null && (view instanceof ReactionHolderView) && ((ReactionHolderView) view).currentReaction.equals(ReactionsContainerLayout.this.pressedReaction)) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }

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
        };
        this.recyclerListView = recyclerListView;
        recyclerListView.setClipChildren(false);
        recyclerListView.setClipToPadding(false);
        this.linearLayoutManager = new LinearLayoutManager(context, 0, false) {
            {
                ReactionsContainerLayout.this = this;
            }

            @Override
            public int scrollHorizontallyBy(int i3, RecyclerView.Recycler recycler, RecyclerView.State state) {
                int i4;
                if (i3 < 0) {
                    ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                    if (reactionsContainerLayout.pullingLeftOffset != 0.0f) {
                        float pullingLeftProgress = reactionsContainerLayout.getPullingLeftProgress();
                        ReactionsContainerLayout reactionsContainerLayout2 = ReactionsContainerLayout.this;
                        reactionsContainerLayout2.pullingLeftOffset += i3;
                        if ((pullingLeftProgress > 1.0f) != (reactionsContainerLayout2.getPullingLeftProgress() > 1.0f)) {
                            ReactionsContainerLayout.this.recyclerListView.performHapticFeedback(3);
                        }
                        ReactionsContainerLayout reactionsContainerLayout3 = ReactionsContainerLayout.this;
                        float f = reactionsContainerLayout3.pullingLeftOffset;
                        if (f < 0.0f) {
                            i4 = (int) f;
                            reactionsContainerLayout3.pullingLeftOffset = 0.0f;
                        } else {
                            i4 = 0;
                        }
                        FrameLayout frameLayout = reactionsContainerLayout3.customReactionsContainer;
                        if (frameLayout != null) {
                            frameLayout.invalidate();
                        }
                        ReactionsContainerLayout.this.recyclerListView.invalidate();
                        i3 = i4;
                    }
                }
                int scrollHorizontallyBy = super.scrollHorizontallyBy(i3, recycler, state);
                if (i3 > 0 && scrollHorizontallyBy == 0 && ReactionsContainerLayout.this.recyclerListView.getScrollState() == 1 && ReactionsContainerLayout.this.showCustomEmojiReaction()) {
                    ValueAnimator valueAnimator = ReactionsContainerLayout.this.pullingDownBackAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ReactionsContainerLayout.this.pullingDownBackAnimator.cancel();
                    }
                    float pullingLeftProgress2 = ReactionsContainerLayout.this.getPullingLeftProgress();
                    float f2 = pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f;
                    ReactionsContainerLayout reactionsContainerLayout4 = ReactionsContainerLayout.this;
                    reactionsContainerLayout4.pullingLeftOffset += i3 * f2;
                    if ((pullingLeftProgress2 > 1.0f) != (reactionsContainerLayout4.getPullingLeftProgress() > 1.0f)) {
                        ReactionsContainerLayout.this.recyclerListView.performHapticFeedback(3);
                    }
                    FrameLayout frameLayout2 = ReactionsContainerLayout.this.customReactionsContainer;
                    if (frameLayout2 != null) {
                        frameLayout2.invalidate();
                    }
                    ReactionsContainerLayout.this.recyclerListView.invalidate();
                }
                return scrollHorizontallyBy;
            }
        };
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            {
                ReactionsContainerLayout.this = this;
            }

            @Override
            public void getItemOffsets(android.graphics.Rect rect2, View view, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect2, view, recyclerView, state);
                if (!ReactionsContainerLayout.this.showCustomEmojiReaction()) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    if (childAdapterPosition == 0) {
                        rect2.left = AndroidUtilities.dp(6.0f);
                    }
                    rect2.right = AndroidUtilities.dp(4.0f);
                    if (childAdapterPosition == ReactionsContainerLayout.this.listAdapter.getItemCount() - 1) {
                        if (ReactionsContainerLayout.this.showUnlockPremiumButton() || ReactionsContainerLayout.this.showCustomEmojiReaction()) {
                            rect2.right = AndroidUtilities.dp(2.0f);
                            return;
                        } else {
                            rect2.right = AndroidUtilities.dp(6.0f);
                            return;
                        }
                    }
                    return;
                }
                rect2.left = 0;
                rect2.right = 0;
            }
        });
        recyclerListView.setLayoutManager(this.linearLayoutManager);
        recyclerListView.setOverScrollMode(2);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context, i);
        this.listAdapter = anonymousClass5;
        recyclerListView.setAdapter(anonymousClass5);
        recyclerListView.addOnScrollListener(new LeftRightShadowsListener());
        recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            {
                ReactionsContainerLayout.this = this;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(ReactionsContainerLayout.this.location);
                    int i5 = ReactionsContainerLayout.this.location[0];
                    View childAt = recyclerView.getChildAt(0);
                    childAt.getLocationInWindow(ReactionsContainerLayout.this.location);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(ReactionsContainerLayout.this.location[0] - i5, 0.0f)) / childAt.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    ReactionsContainerLayout.this.setChildScale(childAt, min);
                    View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt2.getLocationInWindow(ReactionsContainerLayout.this.location);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((i5 + recyclerView.getWidth()) - (ReactionsContainerLayout.this.location[0] + childAt2.getWidth()), 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    ReactionsContainerLayout.this.setChildScale(childAt2, min2);
                }
                for (int i6 = 1; i6 < ReactionsContainerLayout.this.recyclerListView.getChildCount() - 1; i6++) {
                    ReactionsContainerLayout.this.setChildScale(ReactionsContainerLayout.this.recyclerListView.getChildAt(i6), 1.0f);
                }
                ReactionsContainerLayout.this.invalidate();
            }
        });
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            {
                ReactionsContainerLayout.this = this;
            }

            @Override
            public void getItemOffsets(android.graphics.Rect rect2, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition == 0) {
                    rect2.left = AndroidUtilities.dp(8.0f);
                }
                if (childAdapterPosition == ReactionsContainerLayout.this.listAdapter.getItemCount() - 1) {
                    rect2.right = AndroidUtilities.dp(8.0f);
                }
            }
        });
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                ReactionsContainerLayout.this.lambda$new$0(view, i3);
            }
        });
        recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i3) {
                boolean lambda$new$1;
                lambda$new$1 = ReactionsContainerLayout.this.lambda$new$1(view, i3);
                return lambda$new$1;
            }
        });
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
        setClipChildren(false);
        setClipToPadding(false);
        invalidateShaders();
        int paddingTop = (recyclerListView.getLayoutParams().height - recyclerListView.getPaddingTop()) - recyclerListView.getPaddingBottom();
        this.nextRecentReaction.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        this.nextRecentReaction.getLayoutParams().height = paddingTop;
        if (i == 2) {
            this.bgPaint.setColor(ColorUtils.blendARGB(-16777216, -1, 0.13f));
        } else {
            this.bgPaint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
        }
        MediaDataController.getInstance(i2).preloadDefaultReactions();
    }

    public class AnonymousClass5 extends AdapterWithDiffUtils {
        ArrayList<InnerItem> items = new ArrayList<>();
        ArrayList<InnerItem> oldItems = new ArrayList<>();
        final Context val$context;
        final int val$type;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        AnonymousClass5(Context context, int i) {
            ReactionsContainerLayout.this = r1;
            this.val$context = context;
            this.val$type = i;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 1) {
                ReactionsContainerLayout.this.premiumLockContainer = new FrameLayout(this.val$context);
                ReactionsContainerLayout.this.premiumLockIconView = new PremiumLockIconView(this.val$context, PremiumLockIconView.TYPE_REACTIONS);
                PremiumLockIconView premiumLockIconView = ReactionsContainerLayout.this.premiumLockIconView;
                int color = Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon);
                int i2 = Theme.key_dialogBackground;
                premiumLockIconView.setColor(ColorUtils.blendARGB(color, Theme.getColor(i2), 0.7f));
                ReactionsContainerLayout.this.premiumLockIconView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), PorterDuff.Mode.MULTIPLY));
                ReactionsContainerLayout.this.premiumLockIconView.setScaleX(0.0f);
                ReactionsContainerLayout.this.premiumLockIconView.setScaleY(0.0f);
                ReactionsContainerLayout.this.premiumLockIconView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                reactionsContainerLayout.premiumLockContainer.addView(reactionsContainerLayout.premiumLockIconView, LayoutHelper.createFrame(26, 26, 17));
                ReactionsContainerLayout.this.premiumLockIconView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ReactionsContainerLayout.AnonymousClass5.this.lambda$onCreateViewHolder$0(view2);
                    }
                });
                view = ReactionsContainerLayout.this.premiumLockContainer;
            } else if (i != 2) {
                view = new ReactionHolderView(this.val$context, true);
            } else {
                ReactionsContainerLayout.this.customReactionsContainer = new CustomReactionsContainer(this.val$context);
                ReactionsContainerLayout.this.customEmojiReactionsIconView = new InternalImageView(this.val$context);
                ReactionsContainerLayout.this.customEmojiReactionsIconView.setImageResource(R.drawable.msg_reactions_expand);
                ReactionsContainerLayout.this.customEmojiReactionsIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i3 = this.val$type;
                if (i3 == 1 || i3 == 2) {
                    ReactionsContainerLayout.this.customEmojiReactionsIconView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                } else {
                    ReactionsContainerLayout.this.customEmojiReactionsIconView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
                }
                ReactionsContainerLayout.this.customEmojiReactionsIconView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(28.0f), 0, ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_listSelector), 40)));
                ReactionsContainerLayout.this.customEmojiReactionsIconView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                ReactionsContainerLayout.this.customEmojiReactionsIconView.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                ReactionsContainerLayout reactionsContainerLayout2 = ReactionsContainerLayout.this;
                reactionsContainerLayout2.customReactionsContainer.addView(reactionsContainerLayout2.customEmojiReactionsIconView, LayoutHelper.createFrame(30, 30, 17));
                ReactionsContainerLayout.this.customEmojiReactionsIconView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ReactionsContainerLayout.AnonymousClass5.this.lambda$onCreateViewHolder$1(view2);
                    }
                });
                view = ReactionsContainerLayout.this.customReactionsContainer;
            }
            int dp = ((ReactionsContainerLayout.this.getLayoutParams().height - (ReactionsContainerLayout.this.hasHint ? AndroidUtilities.dp(20.0f) : 0)) - ReactionsContainerLayout.this.getPaddingTop()) - ReactionsContainerLayout.this.getPaddingBottom();
            view.setLayoutParams(new RecyclerView.LayoutParams(dp - AndroidUtilities.dp(12.0f), dp));
            return new RecyclerListView.Holder(view);
        }

        public void lambda$onCreateViewHolder$0(View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            ReactionsContainerLayout.this.showUnlockPremium(iArr[0] + (view.getMeasuredWidth() / 2.0f), iArr[1] + (view.getMeasuredHeight() / 2.0f));
        }

        public void lambda$onCreateViewHolder$1(View view) {
            ReactionsContainerLayout.this.showCustomEmojiReactionDialog();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 3) {
                ReactionHolderView reactionHolderView = (ReactionHolderView) viewHolder.itemView;
                reactionHolderView.setScaleX(1.0f);
                reactionHolderView.setScaleY(1.0f);
                reactionHolderView.setReaction(this.items.get(i).reaction, i);
            }
        }

        @Override
        public int getItemCount() {
            return this.items.size();
        }

        @Override
        public int getItemViewType(int i) {
            return this.items.get(i).viewType;
        }

        @Override
        public void notifyDataSetChanged() {
            this.oldItems.clear();
            this.oldItems.addAll(this.items);
            this.items.clear();
            for (int i = 0; i < ReactionsContainerLayout.this.visibleReactionsList.size(); i++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) ReactionsContainerLayout.this.visibleReactionsList.get(i);
                this.items.add(new InnerItem(this, visibleReaction.emojicon == null ? 3 : 0, visibleReaction));
            }
            if (ReactionsContainerLayout.this.showUnlockPremiumButton()) {
                this.items.add(new InnerItem(this, 1, null));
            }
            if (ReactionsContainerLayout.this.showCustomEmojiReaction()) {
                this.items.add(new InnerItem(this, 2, null));
            }
            setItems(this.oldItems, this.items);
        }

        public class InnerItem extends AdapterWithDiffUtils.Item {
            ReactionsLayoutInBubble.VisibleReaction reaction;

            public InnerItem(AnonymousClass5 anonymousClass5, int i, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
                super(i, false);
                this.reaction = visibleReaction;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || InnerItem.class != obj.getClass()) {
                    return false;
                }
                InnerItem innerItem = (InnerItem) obj;
                int i = this.viewType;
                int i2 = innerItem.viewType;
                if (i != i2 || (i != 0 && i != 3)) {
                    return i == i2;
                }
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.reaction;
                return visibleReaction != null && visibleReaction.equals(innerItem.reaction);
            }
        }
    }

    public void lambda$new$0(View view, int i) {
        ReactionsContainerDelegate reactionsContainerDelegate = this.delegate;
        if (reactionsContainerDelegate == null || !(view instanceof ReactionHolderView)) {
            return;
        }
        reactionsContainerDelegate.onReactionClicked(this, ((ReactionHolderView) view).currentReaction, false, false);
    }

    public boolean lambda$new$1(View view, int i) {
        ReactionsContainerDelegate reactionsContainerDelegate = this.delegate;
        if (reactionsContainerDelegate == null || !(view instanceof ReactionHolderView)) {
            return false;
        }
        reactionsContainerDelegate.onReactionClicked(this, ((ReactionHolderView) view).currentReaction, true, false);
        return true;
    }

    public boolean showExpandableReactions() {
        return this.showExpandableReactions;
    }

    public void animatePullingBack() {
        float f = this.pullingLeftOffset;
        if (f != 0.0f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
            this.pullingDownBackAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ReactionsContainerLayout.this.lambda$animatePullingBack$2(valueAnimator);
                }
            });
            this.pullingDownBackAnimator.setDuration(150L);
            this.pullingDownBackAnimator.start();
        }
    }

    public void lambda$animatePullingBack$2(ValueAnimator valueAnimator) {
        this.pullingLeftOffset = ((Float) this.pullingDownBackAnimator.getAnimatedValue()).floatValue();
        FrameLayout frameLayout = this.customReactionsContainer;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.onSwitchedToLoopView = runnable;
    }

    public void dismissWindow() {
        this.reactionsWindow.dismiss();
    }

    public CustomEmojiReactionsWindow getReactionsWindow() {
        return this.reactionsWindow;
    }

    public void showCustomEmojiReactionDialog() {
        if (this.reactionsWindow != null) {
            return;
        }
        this.reactionsWindow = new CustomEmojiReactionsWindow(this.type, this.fragment, this.allReactionsList, this.selectedReactions, this, this.resourcesProvider);
        invalidateLoopViews();
        this.reactionsWindow.onDismissListener(new Runnable() {
            @Override
            public final void run() {
                ReactionsContainerLayout.this.lambda$showCustomEmojiReactionDialog$3();
            }
        });
    }

    public void lambda$showCustomEmojiReactionDialog$3() {
        this.reactionsWindow = null;
        invalidateLoopViews();
        ReactionsContainerDelegate reactionsContainerDelegate = this.delegate;
        if (reactionsContainerDelegate != null) {
            reactionsContainerDelegate.onEmojiWindowDismissed();
        }
    }

    private void invalidateLoopViews() {
        for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            if (childAt instanceof ReactionHolderView) {
                ((ReactionHolderView) childAt).loopImageView.invalidate();
            }
        }
    }

    public boolean showCustomEmojiReaction() {
        return (!MessagesController.getInstance(this.currentAccount).premiumLocked && this.allReactionsAvailable) || this.showExpandableReactions;
    }

    public boolean showUnlockPremiumButton() {
        return (this.premiumLockedReactions.isEmpty() || MessagesController.getInstance(this.currentAccount).premiumLocked) ? false : true;
    }

    public void showUnlockPremium(float f, float f2) {
        new PremiumFeatureBottomSheet(this.fragment, 4, true).show();
    }

    public void setChildScale(View view, float f) {
        if (view instanceof ReactionHolderView) {
            ((ReactionHolderView) view).sideScale = f;
            return;
        }
        view.setScaleX(f);
        view.setScaleY(f);
    }

    public void setDelegate(ReactionsContainerDelegate reactionsContainerDelegate) {
        this.delegate = reactionsContainerDelegate;
    }

    public boolean isFlippedVertically() {
        return this.isFlippedVertically;
    }

    public void setFlippedVertically(boolean z) {
        this.isFlippedVertically = z;
        invalidate();
    }

    public void setMirrorX(boolean z) {
        this.mirrorX = z;
        invalidate();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void setVisibleReactionsList(List<ReactionsLayoutInBubble.VisibleReaction> list) {
        this.visibleReactionsList.clear();
        if (showCustomEmojiReaction()) {
            int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) / AndroidUtilities.dp(34.0f);
            if (dp > 7) {
                dp = 7;
            }
            if (dp < 1) {
                dp = 1;
            }
            int i = 0;
            while (i < Math.min(list.size(), dp)) {
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
        if ((((getLayoutParams().height - (this.hasHint ? AndroidUtilities.dp(20.0f) : 0)) - getPaddingTop()) - getPaddingBottom()) * list.size() < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        this.listAdapter.notifyDataSetChanged();
    }

    @Override
    protected void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ReactionsContainerLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public void drawBubbles(Canvas canvas) {
        float max = (Math.max(0.25f, Math.min(this.transitionProgress, 1.0f)) - 0.25f) / 0.75f;
        drawBubbles(canvas, this.bigCircleRadius * max, max, this.smallCircleRadius * max, (int) (Utilities.clamp(this.customEmojiReactionsEnterProgress / 0.2f, 1.0f, 0.0f) * (1.0f - this.customEmojiReactionsEnterProgress) * 255.0f));
    }

    private void drawBubbles(Canvas canvas, float f, float f2, float f3, int i) {
        if (this.type == 1) {
            return;
        }
        canvas.save();
        if (this.isTop) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(this.rect.top, getMeasuredHeight(), CubicBezierInterpolator.DEFAULT.getInterpolation(this.flipVerticalProgress)) - ((int) Math.ceil((this.rect.height() / 2.0f) * (1.0f - this.transitionProgress)))) + 1.0f);
        } else {
            float f4 = this.rect.bottom;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f4, 0.0f, cubicBezierInterpolator.getInterpolation(this.flipVerticalProgress)) - ((int) Math.ceil((this.rect.height() / 2.0f) * (1.0f - this.transitionProgress)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight() + AndroidUtilities.dp(8.0f), getPaddingTop() - expandSize(), cubicBezierInterpolator.getInterpolation(this.flipVerticalProgress)));
        }
        float width = ((LocaleController.isRTL || this.mirrorX) ? this.bigCircleOffset : getWidth() - this.bigCircleOffset) + this.bubblesOffset;
        float paddingTop = this.isTop ? getPaddingTop() - expandSize() : (getHeight() - getPaddingBottom()) + expandSize();
        int dp = AndroidUtilities.dp(3.0f);
        this.shadow.setAlpha(i);
        this.bgPaint.setAlpha(i);
        float f5 = width - f;
        float f6 = dp;
        float f7 = f6 * f2;
        float f8 = paddingTop - f;
        float f9 = width + f;
        float f10 = paddingTop + f;
        this.shadow.setBounds((int) (f5 - f7), (int) (f8 - f7), (int) (f9 + f7), (int) (f7 + f10));
        this.shadow.draw(canvas);
        if (this.delegate.drawBackground()) {
            this.rectF.set(f5, f8, f9, f10);
            this.delegate.drawRoundRect(canvas, this.rectF, f, getX(), getY(), i, false);
        } else {
            canvas.drawCircle(width, paddingTop, f, this.bgPaint);
        }
        float width2 = ((LocaleController.isRTL || this.mirrorX) ? this.bigCircleOffset - this.bigCircleRadius : (getWidth() - this.bigCircleOffset) + this.bigCircleRadius) + this.bubblesOffset;
        float lerp = AndroidUtilities.lerp(this.isTop ? (getPaddingTop() - expandSize()) - AndroidUtilities.dp(16.0f) : ((getHeight() - this.smallCircleRadius) - f6) + expandSize(), (this.smallCircleRadius + f6) - expandSize(), CubicBezierInterpolator.DEFAULT.getInterpolation(this.flipVerticalProgress));
        float f11 = (-AndroidUtilities.dp(1.0f)) * f2;
        this.shadow.setBounds((int) ((width2 - f) - f11), (int) ((lerp - f) - f11), (int) (width2 + f + f11), (int) (lerp + f + f11));
        this.shadow.draw(canvas);
        if (this.delegate.drawBackground()) {
            this.rectF.set(width2 - f3, lerp - f3, width2 + f3, lerp + f3);
            this.delegate.drawRoundRect(canvas, this.rectF, f3, getX(), getY(), i, false);
        } else {
            canvas.drawCircle(width2, lerp, f3, this.bgPaint);
        }
        canvas.restore();
        this.shadow.setAlpha(255);
        this.bgPaint.setAlpha(255);
    }

    private void checkPressedProgressForOtherViews(View view) {
        int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(view);
        float measuredWidth = ((view.getMeasuredWidth() * (this.pressedViewScale - 1.0f)) / 3.0f) - ((view.getMeasuredWidth() * (1.0f - this.otherViewsScale)) * (Math.abs(this.pressedReactionPosition - childAdapterPosition) - 1));
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

    private void checkPressedProgress(Canvas canvas, ReactionHolderView reactionHolderView) {
        AnimatedEmojiDrawable animatedEmojiDrawable;
        float clamp = this.pullingLeftOffset != 0.0f ? Utilities.clamp(reactionHolderView.getLeft() / (getMeasuredWidth() - AndroidUtilities.dp(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress() * AndroidUtilities.dp(46.0f) : 0.0f;
        if (reactionHolderView.currentReaction.equals(this.pressedReaction)) {
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
            float x = this.recyclerListView.getX() + reactionHolderView.getX();
            float measuredWidth = ((reactionHolderView.getMeasuredWidth() * reactionHolderView.getScaleX()) - reactionHolderView.getMeasuredWidth()) / 2.0f;
            float f = x - measuredWidth;
            if (f < 0.0f && reactionHolderView.getTranslationX() >= 0.0f) {
                reactionHolderView.setTranslationX((-f) - clamp);
            } else if (reactionHolderView.getMeasuredWidth() + x + measuredWidth > getMeasuredWidth() && reactionHolderView.getTranslationX() <= 0.0f) {
                reactionHolderView.setTranslationX((((getMeasuredWidth() - x) - reactionHolderView.getMeasuredWidth()) - measuredWidth) - clamp);
            } else {
                reactionHolderView.setTranslationX(0.0f - clamp);
            }
            canvas.translate(this.recyclerListView.getX() + reactionHolderView.getX(), this.recyclerListView.getY() + reactionHolderView.getY());
            canvas.scale(reactionHolderView.getScaleX(), reactionHolderView.getScaleY(), reactionHolderView.getPivotX(), reactionHolderView.getPivotY());
            reactionHolderView.draw(canvas);
            canvas.restore();
            return;
        }
        int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(reactionHolderView);
        float measuredWidth2 = ((reactionHolderView.getMeasuredWidth() * (this.pressedViewScale - 1.0f)) / 3.0f) - ((reactionHolderView.getMeasuredWidth() * (1.0f - this.otherViewsScale)) * (Math.abs(this.pressedReactionPosition - childAdapterPosition) - 1));
        if (childAdapterPosition < this.pressedReactionPosition) {
            reactionHolderView.setPivotX(0.0f);
            reactionHolderView.setTranslationX(-measuredWidth2);
        } else {
            reactionHolderView.setPivotX(reactionHolderView.getMeasuredWidth() - clamp);
            reactionHolderView.setTranslationX(measuredWidth2 - clamp);
        }
        reactionHolderView.setPivotY(reactionHolderView.enterImageView.getY() + reactionHolderView.enterImageView.getMeasuredHeight());
        reactionHolderView.setScaleX(this.otherViewsScale);
        reactionHolderView.setScaleY(this.otherViewsScale);
        reactionHolderView.enterImageView.setScaleX(reactionHolderView.sideScale);
        reactionHolderView.enterImageView.setScaleY(reactionHolderView.sideScale);
        reactionHolderView.pressedBackupImageView.setVisibility(4);
        reactionHolderView.enterImageView.setAlpha(1.0f);
    }

    public float getPullingLeftProgress() {
        return Utilities.clamp(this.pullingLeftOffset / AndroidUtilities.dp(42.0f), 2.0f, 0.0f);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateShaders();
    }

    private void invalidateShaders() {
        int dp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int color = Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground);
        this.leftShadowPaint.setShader(new LinearGradient(0.0f, height, dp, height, color, 0, Shader.TileMode.CLAMP));
        this.rightShadowPaint.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, color, 0, Shader.TileMode.CLAMP));
        invalidate();
    }

    public void setTransitionProgress(float f) {
        this.transitionProgress = f;
        ChatScrimPopupContainerLayout chatScrimPopupContainerLayout = this.parentLayout;
        if (chatScrimPopupContainerLayout != null) {
            chatScrimPopupContainerLayout.setReactionsTransitionProgress((this.animatePopup && allowSmoothEnterTransition()) ? 1.0f : 1.0f);
        }
        invalidate();
    }

    public void setMessage(MessageObject messageObject, TLRPC$ChatFull tLRPC$ChatFull) {
        TLRPC$TL_messageReactions tLRPC$TL_messageReactions;
        this.messageObject = messageObject;
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        if (messageObject != null && messageObject.isForwardedChannelPost() && (tLRPC$ChatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-messageObject.getFromChatId())) == null) {
            this.waitingLoadingChatId = -messageObject.getFromChatId();
            MessagesController.getInstance(this.currentAccount).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        if (tLRPC$ChatFull != null) {
            TLRPC$ChatReactions tLRPC$ChatReactions = tLRPC$ChatFull.available_reactions;
            if (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsAll) {
                TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(tLRPC$ChatFull.id));
                if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    this.allReactionsAvailable = true;
                } else {
                    this.allReactionsAvailable = false;
                }
                fillRecentReactionsList(arrayList);
            } else if (tLRPC$ChatReactions instanceof TLRPC$TL_chatReactionsSome) {
                Iterator<TLRPC$Reaction> it = ((TLRPC$TL_chatReactionsSome) tLRPC$ChatReactions).reactions.iterator();
                while (it.hasNext()) {
                    TLRPC$Reaction next = it.next();
                    Iterator<TLRPC$TL_availableReaction> it2 = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            TLRPC$TL_availableReaction next2 = it2.next();
                            if ((next instanceof TLRPC$TL_reactionEmoji) && next2.reaction.equals(((TLRPC$TL_reactionEmoji) next).emoticon)) {
                                arrayList.add(ReactionsLayoutInBubble.VisibleReaction.fromTLReaction(next));
                                break;
                            } else if (next instanceof TLRPC$TL_reactionCustomEmoji) {
                                arrayList.add(ReactionsLayoutInBubble.VisibleReaction.fromTLReaction(next));
                                break;
                            }
                        }
                    }
                }
            } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
                throw new RuntimeException("Unknown chat reactions type: " + tLRPC$ChatFull.available_reactions);
            }
        } else {
            this.allReactionsAvailable = true;
            fillRecentReactionsList(arrayList);
        }
        filterReactions(arrayList);
        this.showExpandableReactions = (this.allReactionsAvailable || arrayList.size() <= 16) ? false : false;
        setVisibleReactionsList(arrayList);
        if (messageObject == null || (tLRPC$TL_messageReactions = messageObject.messageOwner.reactions) == null || tLRPC$TL_messageReactions.results == null) {
            return;
        }
        for (int i = 0; i < messageObject.messageOwner.reactions.results.size(); i++) {
            if (messageObject.messageOwner.reactions.results.get(i).chosen) {
                this.selectedReactions.add(ReactionsLayoutInBubble.VisibleReaction.fromTLReaction(messageObject.messageOwner.reactions.results.get(i).reaction));
            }
        }
    }

    public void setStoryItem(TL_stories$StoryItem tL_stories$StoryItem) {
        TLRPC$Reaction tLRPC$Reaction;
        this.selectedReactions.clear();
        if (tL_stories$StoryItem != null && (tLRPC$Reaction = tL_stories$StoryItem.sent_reaction) != null) {
            this.selectedReactions.add(ReactionsLayoutInBubble.VisibleReaction.fromTLReaction(tLRPC$Reaction));
        }
        this.listAdapter.notifyDataSetChanged();
    }

    public void setSelectedReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        this.selectedReactions.clear();
        if (visibleReaction != null) {
            this.selectedReactions.add(visibleReaction);
        }
        this.listAdapter.notifyDataSetChanged();
    }

    private void filterReactions(List<ReactionsLayoutInBubble.VisibleReaction> list) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < list.size()) {
            if (hashSet.contains(list.get(i))) {
                i--;
                list.remove(i);
            }
            hashSet.add(list.get(i));
            i++;
        }
    }

    private void fillRecentReactionsList(List<ReactionsLayoutInBubble.VisibleReaction> list) {
        int i = 0;
        if (!this.allReactionsAvailable) {
            List<TLRPC$TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList();
            while (i < enabledReactionsList.size()) {
                list.add(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(enabledReactionsList.get(i)));
                i++;
            }
            return;
        }
        ArrayList<TLRPC$Reaction> topReactions = MediaDataController.getInstance(this.currentAccount).getTopReactions();
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (int i3 = 0; i3 < topReactions.size(); i3++) {
            ReactionsLayoutInBubble.VisibleReaction fromTLReaction = ReactionsLayoutInBubble.VisibleReaction.fromTLReaction(topReactions.get(i3));
            if (!hashSet.contains(fromTLReaction) && (UserConfig.getInstance(this.currentAccount).isPremium() || fromTLReaction.documentId == 0)) {
                hashSet.add(fromTLReaction);
                list.add(fromTLReaction);
                i2++;
            }
            if (i2 == 16) {
                break;
            }
        }
        ArrayList<TLRPC$Reaction> recentReactions = MediaDataController.getInstance(this.currentAccount).getRecentReactions();
        for (int i4 = 0; i4 < recentReactions.size(); i4++) {
            ReactionsLayoutInBubble.VisibleReaction fromTLReaction2 = ReactionsLayoutInBubble.VisibleReaction.fromTLReaction(recentReactions.get(i4));
            if (!hashSet.contains(fromTLReaction2)) {
                hashSet.add(fromTLReaction2);
                list.add(fromTLReaction2);
            }
        }
        List<TLRPC$TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList();
        while (i < enabledReactionsList2.size()) {
            ReactionsLayoutInBubble.VisibleReaction fromEmojicon = ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(enabledReactionsList2.get(i));
            if (!hashSet.contains(fromEmojicon)) {
                hashSet.add(fromEmojicon);
                list.add(fromEmojicon);
            }
            i++;
        }
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
            {
                ReactionsContainerLayout.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ReactionsContainerLayout.this.notificationsLocker.unlock();
            }
        });
        duration.start();
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (!showCustomEmojiReaction()) {
            return (AndroidUtilities.dp(36.0f) * itemsCount) + (AndroidUtilities.dp(2.0f) * (itemsCount - 1)) + AndroidUtilities.dp(16.0f);
        }
        return (AndroidUtilities.dp(36.0f) * itemsCount) - AndroidUtilities.dp(4.0f);
    }

    public int getItemsCount() {
        return this.visibleReactionsList.size() + (showCustomEmojiReaction() ? 1 : 0) + 1;
    }

    public void setCustomEmojiEnterProgress(float f) {
        this.customEmojiReactionsEnterProgress = f;
        ChatScrimPopupContainerLayout chatScrimPopupContainerLayout = this.chatScrimPopupContainerLayout;
        if (chatScrimPopupContainerLayout != null) {
            chatScrimPopupContainerLayout.setPopupAlpha(1.0f - f);
        }
        invalidate();
    }

    public void dismissParent(boolean z) {
        CustomEmojiReactionsWindow customEmojiReactionsWindow = this.reactionsWindow;
        if (customEmojiReactionsWindow != null) {
            customEmojiReactionsWindow.dismiss(z);
            this.reactionsWindow = null;
        }
    }

    public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z) {
        ReactionsContainerDelegate reactionsContainerDelegate = this.delegate;
        if (reactionsContainerDelegate != null) {
            reactionsContainerDelegate.onReactionClicked(view, visibleReaction, z, true);
        }
    }

    public void prepareAnimation(boolean z) {
        this.prepareAnimation = z;
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z) {
        if (z) {
            this.customEmojiReactionsIconView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(28.0f), 0, ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_listSelector), 40)));
        } else {
            this.customEmojiReactionsIconView.setBackground(null);
        }
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

    public void onCustomEmojiWindowOpened() {
        this.pullingLeftOffset = 0.0f;
        FrameLayout frameLayout = this.customReactionsContainer;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
        invalidate();
    }

    public void clearRecentReactions() {
        AlertDialog create = new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(R.string.ClearRecentReactionsAlertTitle)).setMessage(LocaleController.getString(R.string.ClearRecentReactionsAlertMessage)).setPositiveButton(LocaleController.getString(R.string.ClearButton), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                ReactionsContainerLayout.this.lambda$clearRecentReactions$4(dialogInterface, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public void lambda$clearRecentReactions$4(DialogInterface dialogInterface, int i) {
        MediaDataController.getInstance(this.currentAccount).clearRecentReactions();
        ArrayList arrayList = new ArrayList();
        fillRecentReactionsList(arrayList);
        setVisibleReactionsList(arrayList);
        this.lastVisibleViews.clear();
        this.reactionsWindow.setRecentReactions(arrayList);
    }

    public void setChatScrimView(ChatScrimPopupContainerLayout chatScrimPopupContainerLayout) {
        this.chatScrimPopupContainerLayout = chatScrimPopupContainerLayout;
    }

    public ReactionsContainerDelegate getDelegate() {
        return this.delegate;
    }

    public void setCurrentAccount(int i) {
        this.currentAccount = i;
    }

    public void setFragment(BaseFragment baseFragment) {
        this.fragment = baseFragment;
    }

    public void reset() {
        this.isHiddenNextReaction = true;
        this.pressedReactionPosition = 0;
        this.pressedProgress = 0.0f;
        this.pullingLeftOffset = 0.0f;
        this.pressedReaction = null;
        this.clicked = false;
        AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, (Consumer<View>) new Consumer() {
            @Override
            public final void accept(Object obj) {
                ReactionsContainerLayout.this.lambda$reset$5((View) obj);
            }
        });
        this.lastVisibleViews.clear();
        this.recyclerListView.invalidate();
        FrameLayout frameLayout = this.customReactionsContainer;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
        invalidate();
    }

    public void lambda$reset$5(View view) {
        if (view instanceof ReactionHolderView) {
            ReactionHolderView reactionHolderView = (ReactionHolderView) view;
            reactionHolderView.pressed = false;
            reactionHolderView.loopImageView.setAlpha(1.0f);
            if (this.skipEnterAnimation) {
                reactionHolderView.loopImageView.setScaleX(1.0f);
                reactionHolderView.loopImageView.setScaleY(1.0f);
                return;
            }
            reactionHolderView.resetAnimation();
        }
    }

    public void setHint(String str) {
        this.hasHint = true;
        TextView textView = new TextView(getContext());
        this.hintView = textView;
        textView.setTextSize(1, 12.0f);
        this.hintView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        this.hintView.setText(str);
        this.hintView.setAlpha(0.5f);
        this.hintView.setGravity(1);
        addView(this.hintView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        ((FrameLayout.LayoutParams) this.nextRecentReaction.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.recyclerListView.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public void setTop(boolean z) {
        this.isTop = z;
    }

    public float getTopOffset() {
        if (this.hasHint) {
            return AndroidUtilities.dp(20.0f);
        }
        return 0.0f;
    }

    public void setBubbleOffset(float f) {
        this.bubblesOffset = f;
    }

    public final class LeftRightShadowsListener extends RecyclerView.OnScrollListener {
        private ValueAnimator leftAnimator;
        private boolean leftVisible;
        private ValueAnimator rightAnimator;
        private boolean rightVisible;

        private LeftRightShadowsListener() {
            ReactionsContainerLayout.this = r1;
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z = ReactionsContainerLayout.this.linearLayoutManager.findFirstVisibleItemPosition() != 0;
            if (z != this.leftVisible) {
                ValueAnimator valueAnimator = this.leftAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.leftAnimator = startAnimator(ReactionsContainerLayout.this.leftAlpha, z ? 1.0f : 0.0f, new androidx.core.util.Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        ReactionsContainerLayout.LeftRightShadowsListener.this.lambda$onScrolled$0((Float) obj);
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        ReactionsContainerLayout.LeftRightShadowsListener.this.lambda$onScrolled$1();
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
                this.rightAnimator = startAnimator(ReactionsContainerLayout.this.rightAlpha, z2 ? 1.0f : 0.0f, new androidx.core.util.Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        ReactionsContainerLayout.LeftRightShadowsListener.this.lambda$onScrolled$2((Float) obj);
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        ReactionsContainerLayout.LeftRightShadowsListener.this.lambda$onScrolled$3();
                    }
                });
                this.rightVisible = z2;
            }
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

        private ValueAnimator startAnimator(float f, float f2, final androidx.core.util.Consumer<Float> consumer, final Runnable runnable) {
            ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration(Math.abs(f2 - f) * 150.0f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ReactionsContainerLayout.LeftRightShadowsListener.lambda$startAnimator$4(androidx.core.util.Consumer.this, valueAnimator);
                }
            });
            duration.addListener(new AnimatorListenerAdapter(this) {
                @Override
                public void onAnimationEnd(Animator animator) {
                    runnable.run();
                }
            });
            duration.start();
            return duration;
        }

        public static void lambda$startAnimator$4(androidx.core.util.Consumer consumer, ValueAnimator valueAnimator) {
            consumer.accept((Float) valueAnimator.getAnimatedValue());
        }
    }

    public final class ReactionHolderView extends FrameLayout {
        public ReactionsLayoutInBubble.VisibleReaction currentReaction;
        public boolean drawSelected;
        public BackupImageView enterImageView;
        public boolean hasEnterAnimation;
        private boolean isEnter;
        Runnable longPressRunnable;
        public BackupImageView loopImageView;
        Runnable playRunnable;
        public int position;
        private ImageReceiver preloadImageReceiver;
        boolean pressed;
        public BackupImageView pressedBackupImageView;
        float pressedX;
        float pressedY;
        public boolean selected;
        public boolean shouldSwitchToLoopView;
        public float sideScale;
        public boolean switchedToLoopView;
        boolean touchable;
        public boolean waitingAnimation;

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.currentReaction;
            if (visibleReaction != null) {
                String str = visibleReaction.emojicon;
                if (str != null) {
                    accessibilityNodeInfo.setText(str);
                    accessibilityNodeInfo.setEnabled(true);
                    return;
                }
                accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrCustomEmoji));
                accessibilityNodeInfo.setEnabled(true);
            }
        }

        ReactionHolderView(Context context, boolean z) {
            super(context);
            ReactionsContainerLayout.this = r3;
            this.preloadImageReceiver = new ImageReceiver();
            this.sideScale = 1.0f;
            this.drawSelected = true;
            this.playRunnable = new Runnable() {
                {
                    ReactionHolderView.this = this;
                }

                @Override
                public void run() {
                    if (ReactionHolderView.this.enterImageView.getImageReceiver().getLottieAnimation() != null && !ReactionHolderView.this.enterImageView.getImageReceiver().getLottieAnimation().isRunning() && !ReactionHolderView.this.enterImageView.getImageReceiver().getLottieAnimation().isGeneratingCache()) {
                        ReactionHolderView.this.enterImageView.getImageReceiver().getLottieAnimation().start();
                    }
                    ReactionHolderView.this.waitingAnimation = false;
                }
            };
            this.longPressRunnable = new Runnable() {
                {
                    ReactionHolderView.this = this;
                }

                @Override
                public void run() {
                    ReactionHolderView.this.performHapticFeedback(0);
                    ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                    reactionsContainerLayout.pressedReactionPosition = reactionsContainerLayout.visibleReactionsList.indexOf(ReactionHolderView.this.currentReaction);
                    ReactionHolderView reactionHolderView = ReactionHolderView.this;
                    ReactionsContainerLayout.this.pressedReaction = reactionHolderView.currentReaction;
                    ReactionsContainerLayout.this.invalidate();
                }
            };
            this.touchable = true;
            this.enterImageView = new AnonymousClass2(context, r3);
            this.loopImageView = new BackupImageView(context, r3) {
                {
                    ReactionHolderView.this = this;
                }

                @Override
                public void onDraw(Canvas canvas) {
                    ReactionHolderView.this.checkPlayLoopImage();
                    super.onDraw(canvas);
                }

                @Override
                protected ImageReceiver createImageReciever() {
                    return new ImageReceiver(this, this) {
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
                public void invalidate(int i, int i2, int i3, int i4) {
                    if (HwEmojis.grabIfWeakDevice(this)) {
                        return;
                    }
                    super.invalidate(i, i2, i3, i4);
                }
            };
            this.enterImageView.getImageReceiver().setAutoRepeat(0);
            this.enterImageView.getImageReceiver().setAllowStartLottieAnimation(false);
            this.pressedBackupImageView = new BackupImageView(context, r3) {
                {
                    ReactionHolderView.this = this;
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

                @Override
                public void invalidate() {
                    super.invalidate();
                    ReactionsContainerLayout.this.invalidate();
                }
            };
            addView(this.enterImageView, LayoutHelper.createFrame(34, 34, 17));
            addView(this.pressedBackupImageView, LayoutHelper.createFrame(34, 34, 17));
            addView(this.loopImageView, LayoutHelper.createFrame(34, 34, 17));
            this.enterImageView.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.loopImageView.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
            this.loopImageView.imageReceiver.setAutoRepeat(0);
            this.loopImageView.imageReceiver.setAllowStartAnimation(false);
            this.loopImageView.imageReceiver.setAllowStartLottieAnimation(false);
            this.pressedBackupImageView.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
        }

        public class AnonymousClass2 extends BackupImageView {
            AnonymousClass2(Context context, ReactionsContainerLayout reactionsContainerLayout) {
                super(context);
                ReactionHolderView.this = r1;
            }

            @Override
            protected ImageReceiver createImageReciever() {
                return new ImageReceiver(this, this) {
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
            protected void dispatchDraw(Canvas canvas) {
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
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ReactionsContainerLayout.ReactionHolderView.AnonymousClass2.this.lambda$dispatchDraw$0();
                        }
                    });
                }
                invalidate();
            }

            public void lambda$dispatchDraw$0() {
                ReactionHolderView.this.enterImageView.setVisibility(4);
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
            public void invalidate(android.graphics.Rect rect) {
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

        public void setReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i) {
            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = this.currentReaction;
            if (visibleReaction2 != null && visibleReaction2.equals(visibleReaction)) {
                this.position = i;
                this.selected = ReactionsContainerLayout.this.selectedReactions.contains(visibleReaction);
                updateImage(visibleReaction);
                return;
            }
            resetAnimation();
            this.currentReaction = visibleReaction;
            this.selected = ReactionsContainerLayout.this.selectedReactions.contains(visibleReaction);
            this.hasEnterAnimation = this.currentReaction.emojicon != null && (ReactionsContainerLayout.this.showCustomEmojiReaction() || ReactionsContainerLayout.this.allReactionsIsDefault) && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
            if (this.currentReaction.emojicon != null) {
                updateImage(visibleReaction);
                this.pressedBackupImageView.setAnimatedEmojiDrawable(null);
                if (this.enterImageView.getImageReceiver().getLottieAnimation() != null) {
                    this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                }
            } else {
                this.pressedBackupImageView.getImageReceiver().clearImage();
                this.loopImageView.getImageReceiver().clearImage();
                AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(4, ReactionsContainerLayout.this.currentAccount, this.currentReaction.documentId);
                animatedEmojiDrawable.setColorFilter(Theme.getAnimatedEmojiColorFilter(ReactionsContainerLayout.this.resourcesProvider));
                this.pressedBackupImageView.setAnimatedEmojiDrawable(animatedEmojiDrawable);
                AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(3, ReactionsContainerLayout.this.currentAccount, this.currentReaction.documentId);
                animatedEmojiDrawable2.setColorFilter(Theme.getAnimatedEmojiColorFilter(ReactionsContainerLayout.this.resourcesProvider));
                this.loopImageView.setAnimatedEmojiDrawable(animatedEmojiDrawable2);
            }
            setFocusable(true);
            boolean z = this.hasEnterAnimation;
            this.shouldSwitchToLoopView = z;
            if (!z) {
                this.enterImageView.setVisibility(8);
                this.loopImageView.setVisibility(0);
                this.switchedToLoopView = true;
            } else {
                this.switchedToLoopView = false;
                this.enterImageView.setVisibility(0);
                this.loopImageView.setVisibility(8);
            }
            if (this.selected) {
                ViewGroup.LayoutParams layoutParams = this.loopImageView.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = this.loopImageView.getLayoutParams();
                int dp = AndroidUtilities.dp(26.0f);
                layoutParams2.height = dp;
                layoutParams.width = dp;
                ViewGroup.LayoutParams layoutParams3 = this.enterImageView.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = this.enterImageView.getLayoutParams();
                int dp2 = AndroidUtilities.dp(26.0f);
                layoutParams4.height = dp2;
                layoutParams3.width = dp2;
                return;
            }
            ViewGroup.LayoutParams layoutParams5 = this.loopImageView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams6 = this.loopImageView.getLayoutParams();
            int dp3 = AndroidUtilities.dp(34.0f);
            layoutParams6.height = dp3;
            layoutParams5.width = dp3;
            ViewGroup.LayoutParams layoutParams7 = this.enterImageView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams8 = this.enterImageView.getLayoutParams();
            int dp4 = AndroidUtilities.dp(34.0f);
            layoutParams8.height = dp4;
            layoutParams7.width = dp4;
        }

        private void updateImage(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            TLRPC$TL_availableReaction tLRPC$TL_availableReaction;
            if (this.currentReaction.emojicon == null || (tLRPC$TL_availableReaction = MediaDataController.getInstance(ReactionsContainerLayout.this.currentAccount).getReactionsMap().get(this.currentReaction.emojicon)) == null) {
                return;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$TL_availableReaction.activate_animation, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
            if (!LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS)) {
                if (SharedConfig.getDevicePerformanceClass() <= 0) {
                    this.loopImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.select_animation), "60_60_firstframe", null, null, this.hasEnterAnimation ? null : svgThumb, 0L, "tgs", this.currentReaction, 0);
                } else {
                    this.enterImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", visibleReaction, 0);
                    this.loopImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.select_animation), "60_60_firstframe", null, null, this.hasEnterAnimation ? null : svgThumb, 0L, "tgs", this.currentReaction, 0);
                }
            } else {
                this.enterImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", visibleReaction, 0);
                this.loopImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.select_animation), "60_60_pcache", null, null, this.hasEnterAnimation ? null : svgThumb, 0L, "tgs", this.currentReaction, 0);
            }
            if (this.enterImageView.getImageReceiver().getLottieAnimation() != null) {
                this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false, true);
            }
            this.pressedBackupImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", visibleReaction, 0);
            this.preloadImageReceiver.setAllowStartLottieAnimation(false);
            MediaDataController.getInstance(ReactionsContainerLayout.this.currentAccount).preloadImage(this.preloadImageReceiver, ImageLocation.getForDocument(tLRPC$TL_availableReaction.around_animation), ReactionsEffectOverlay.getFilterForAroundAnimation());
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            resetAnimation();
            this.preloadImageReceiver.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.preloadImageReceiver.onDetachedFromWindow();
        }

        public boolean play(int i) {
            if (!ReactionsContainerLayout.this.animationEnabled) {
                resetAnimation();
                this.isEnter = true;
                if (!this.hasEnterAnimation) {
                    this.loopImageView.setVisibility(0);
                    this.loopImageView.setScaleY(1.0f);
                    this.loopImageView.setScaleX(1.0f);
                }
                return false;
            }
            AndroidUtilities.cancelRunOnUIThread(this.playRunnable);
            if (this.hasEnterAnimation) {
                if (this.enterImageView.getImageReceiver().getLottieAnimation() != null && !this.enterImageView.getImageReceiver().getLottieAnimation().isGeneratingCache() && !this.isEnter) {
                    this.isEnter = true;
                    if (i == 0) {
                        this.waitingAnimation = false;
                        this.enterImageView.getImageReceiver().getLottieAnimation().stop();
                        this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                        this.playRunnable.run();
                    } else {
                        this.waitingAnimation = true;
                        this.enterImageView.getImageReceiver().getLottieAnimation().stop();
                        this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                        AndroidUtilities.runOnUIThread(this.playRunnable, i);
                    }
                    return true;
                }
                if (this.enterImageView.getImageReceiver().getLottieAnimation() != null && this.isEnter && !this.enterImageView.getImageReceiver().getLottieAnimation().isRunning() && !this.enterImageView.getImageReceiver().getLottieAnimation().isGeneratingCache()) {
                    this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(this.enterImageView.getImageReceiver().getLottieAnimation().getFramesCount() - 1, false);
                }
                this.loopImageView.setScaleY(1.0f);
                this.loopImageView.setScaleX(1.0f);
            } else if (!this.isEnter) {
                this.loopImageView.setScaleY(0.0f);
                this.loopImageView.setScaleX(0.0f);
                this.loopImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setStartDelay(i * ReactionsContainerLayout.this.durationScale).start();
                this.isEnter = true;
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
                this.loopImageView.setScaleY(1.0f);
                this.loopImageView.setScaleX(1.0f);
            } else {
                this.loopImageView.animate().cancel();
                if (ReactionsContainerLayout.this.skipEnterAnimation) {
                    this.loopImageView.setScaleY(1.0f);
                    this.loopImageView.setScaleX(1.0f);
                } else {
                    this.loopImageView.setScaleY(0.0f);
                    this.loopImageView.setScaleX(0.0f);
                }
            }
            this.isEnter = false;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.touchable && ReactionsContainerLayout.this.cancelPressedAnimation == null) {
                if (motionEvent.getAction() == 0) {
                    this.pressed = true;
                    this.pressedX = motionEvent.getX();
                    this.pressedY = motionEvent.getY();
                    if (this.sideScale == 1.0f) {
                        AndroidUtilities.runOnUIThread(this.longPressRunnable, ViewConfiguration.getLongPressTimeout());
                    }
                }
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                if ((motionEvent.getAction() == 2 && (Math.abs(this.pressedX - motionEvent.getX()) > scaledTouchSlop || Math.abs(this.pressedY - motionEvent.getY()) > scaledTouchSlop)) || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getAction() == 1 && this.pressed && ((ReactionsContainerLayout.this.pressedReaction == null || ReactionsContainerLayout.this.pressedProgress > 0.8f) && ReactionsContainerLayout.this.delegate != null)) {
                        ReactionsContainerLayout.this.clicked = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                        if (currentTimeMillis - reactionsContainerLayout.lastReactionSentTime > 300) {
                            reactionsContainerLayout.lastReactionSentTime = System.currentTimeMillis();
                            ReactionsContainerLayout.this.delegate.onReactionClicked(this, this.currentReaction, ReactionsContainerLayout.this.pressedProgress > 0.8f, false);
                        }
                    }
                    if (!ReactionsContainerLayout.this.clicked) {
                        ReactionsContainerLayout.this.cancelPressed();
                    }
                    AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
                    this.pressed = false;
                }
                return true;
            }
            return false;
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (this.selected && this.drawSelected) {
                canvas.drawCircle(getMeasuredWidth() >> 1, getMeasuredHeight() >> 1, (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f), ReactionsContainerLayout.this.selectedPaint);
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = this.loopImageView.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null) {
                if (this.position == 0) {
                    this.loopImageView.animatedEmojiDrawable.getImageReceiver().setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
                } else {
                    this.loopImageView.animatedEmojiDrawable.getImageReceiver().setRoundRadius(this.selected ? AndroidUtilities.dp(6.0f) : 0);
                }
            }
            super.dispatchDraw(canvas);
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
    }

    public void cancelPressed() {
        if (this.pressedReaction != null) {
            this.cancelPressedProgress = 0.0f;
            final float f = this.pressedProgress;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.cancelPressedAnimation = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                {
                    ReactionsContainerLayout.this = this;
                }

                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ReactionsContainerLayout.this.cancelPressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                    reactionsContainerLayout.pressedProgress = f * (1.0f - reactionsContainerLayout.cancelPressedProgress);
                    ReactionsContainerLayout.this.invalidate();
                }
            });
            this.cancelPressedAnimation.addListener(new AnimatorListenerAdapter() {
                {
                    ReactionsContainerLayout.this = this;
                }

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

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) objArr[0];
            if (tLRPC$ChatFull.id != this.waitingLoadingChatId || getVisibility() == 0 || (tLRPC$ChatFull.available_reactions instanceof TLRPC$TL_chatReactionsNone)) {
                return;
            }
            setMessage(this.messageObject, null);
            setVisibility(0);
            startEnterAnimation(false);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
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

    @Override
    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
        }
    }

    public class InternalImageView extends ImageView {
        ValueAnimator valueAnimator;

        public InternalImageView(Context context) {
            super(context);
            ReactionsContainerLayout.this = r1;
        }

        public void play(int i, boolean z) {
            invalidate();
            ValueAnimator valueAnimator = this.valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.valueAnimator.cancel();
            }
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
                this.valueAnimator = ofFloat;
                ofFloat.setInterpolator(AndroidUtilities.overshootInterpolator);
                this.valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ReactionsContainerLayout.InternalImageView.this.lambda$play$0(valueAnimator2);
                    }
                });
                this.valueAnimator.setStartDelay(i * ReactionsContainerLayout.this.durationScale);
                this.valueAnimator.setDuration(300L);
                this.valueAnimator.start();
                return;
            }
            setScaleX(1.0f);
            setScaleY(1.0f);
        }

        public void lambda$play$0(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            setScaleX(floatValue);
            setScaleY(floatValue);
            ReactionsContainerLayout.this.customReactionsContainer.invalidate();
        }

        public void resetAnimation() {
            setScaleX(0.0f);
            setScaleY(0.0f);
            ReactionsContainerLayout.this.customReactionsContainer.invalidate();
            ValueAnimator valueAnimator = this.valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
    }

    private class CustomReactionsContainer extends FrameLayout {
        Paint backgroundPaint;

        public CustomReactionsContainer(Context context) {
            super(context);
            ReactionsContainerLayout.this = r1;
            this.backgroundPaint = new Paint(1);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            int alphaComponent;
            if (ReactionsContainerLayout.this.type == 1 || ReactionsContainerLayout.this.type == 2) {
                alphaComponent = ColorUtils.setAlphaComponent(-1, 30);
            } else {
                alphaComponent = ColorUtils.blendARGB(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, ReactionsContainerLayout.this.resourcesProvider), Theme.getColor(Theme.key_dialogBackground, ReactionsContainerLayout.this.resourcesProvider), 0.7f);
            }
            this.backgroundPaint.setColor(alphaComponent);
            float measuredHeight = getMeasuredHeight() / 2.0f;
            float measuredWidth = getMeasuredWidth() / 2.0f;
            View childAt = getChildAt(0);
            float measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
            float expandSize = ReactionsContainerLayout.this.expandSize();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth - measuredWidth2, (measuredHeight - measuredWidth2) - expandSize, measuredWidth + measuredWidth2, measuredHeight + measuredWidth2 + expandSize);
            canvas.save();
            canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth, measuredHeight);
            canvas.drawRoundRect(rectF, measuredWidth2, measuredWidth2, this.backgroundPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(0.0f, expandSize);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    public float expandSize() {
        return (int) (getPullingLeftProgress() * AndroidUtilities.dp(6.0f));
    }

    public void setParentLayout(ChatScrimPopupContainerLayout chatScrimPopupContainerLayout) {
        this.parentLayout = chatScrimPopupContainerLayout;
    }

    public static boolean allowSmoothEnterTransition() {
        return SharedConfig.deviceIsHigh();
    }
}
