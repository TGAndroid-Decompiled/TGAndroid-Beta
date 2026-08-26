package org.telegram.ui.Components;

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
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
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
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumLockIconView;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.Reactions.HwEmojis;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Stories.recorder.PaintView;

public class ReactionsContainerLayout extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final PhotoViewer.AnonymousClass13 TRANSITION_PROGRESS_VALUE = new PhotoViewer.AnonymousClass13(Float.class, "transitionProgress", 5);
    public boolean allReactionsAvailable;
    public boolean allReactionsIsDefault;
    public final ArrayList allReactionsList;
    public final HashSet alwaysSelectedReactions;
    public boolean animatePopup;
    public final boolean animationEnabled;
    public BlurredBackgroundProviderBuilder backgroundColorProvider;
    public BlurredBackgroundDrawableViewFactory backgroundFactory;
    public final Paint bgPaint;
    public int bigCircleOffset;
    public final float bigCircleRadius;
    public BlurredBackgroundDrawable blurredBackgroundDrawable;
    public BlurredBackgroundDrawable blurredBackgroundDrawable1;
    public BlurredBackgroundDrawable blurredBackgroundDrawable2;
    public float bubblesOffset;
    public ValueAnimator cancelPressedAnimation;
    public float cancelPressedProgress;
    public boolean channelReactions;
    public ChatScrimPopupContainerLayout chatScrimPopupContainerLayout;
    public boolean clicked;
    public int currentAccount;
    public float customEmojiReactionsEnterProgress;
    public CustomPhoneKeyboardView.AnonymousClass1 customEmojiReactionsIconView;
    public IntroActivity.AnonymousClass1 customReactionsContainer;
    public ReactionsContainerDelegate delegate;
    public final float durationScale;
    public float flipVerticalProgress;
    public boolean forceAttachToParent;
    public BaseFragment fragment;
    public boolean hasHint;
    public boolean hasStar;
    public boolean hintMeasured;
    public LinkSpanDrawable.LinksTextView hintView;
    public int hintViewHeight;
    public int hintViewWidth;
    public boolean hitLimit;
    public boolean isFlippedVertically;
    public boolean isHiddenNextReaction;
    public boolean isTop;
    public final ArrayList items;
    public long lastReactionSentTime;
    public long lastUpdate;
    public final HashSet lastVisibleViews;
    public final HashSet lastVisibleViewsTmp;
    public float leftAlpha;
    public final Paint leftShadowPaint;
    public final StickersActivity.AnonymousClass2 linearLayoutManager;
    public final Adapter listAdapter;
    public final int[] location;
    public final Path mPath;
    public MessageObject messageObject;
    public float miniBubblesOffset;
    public boolean mirrorX;
    public final ReactionHolderView nextRecentReaction;
    public final AnimationNotificationsLocker notificationsLocker;
    public final ArrayList oldItems;
    public Runnable onSwitchedToLoopView;
    public float otherViewsScale;
    public ChatScrimPopupContainerLayout parentLayout;
    public boolean paused;
    public boolean pausedExceptSelected;
    public FrameLayout premiumLockContainer;
    public PremiumLockIconView premiumLockIconView;
    public final ArrayList premiumLockedReactions;
    public boolean prepareAnimation;
    public float pressedProgress;
    public ReactionsLayoutInBubble.VisibleReaction pressedReaction;
    public int pressedReactionPosition;
    public float pressedViewScale;
    public ValueAnimator pullingDownBackAnimator;
    public float pullingLeftOffset;
    public float radius;
    public CustomEmojiReactionsWindow reactionsWindow;
    public final RectF rect;
    public final RectF rectF;
    public final ChatActivity.AnonymousClass34 recyclerListView;
    public final Theme.ResourcesProvider resourcesProvider;
    public float rightAlpha;
    public final Paint rightShadowPaint;
    public final Paint selectedPaint;
    public final HashSet selectedReactions;
    public final Drawable shadow;
    public final Rect shadowPad;
    public boolean showExpandableReactions;
    public boolean skipDraw;
    public boolean skipEnterAnimation;
    public final float smallCircleRadius;
    public LinearGradient starSelectedGradient;
    public Matrix starSelectedGradientMatrix;
    public Paint starSelectedGradientPaint;
    public final Paint starSelectedPaint;
    public float transitionProgress;
    public final int type;
    public final ArrayList visibleReactionsList;
    public long waitingLoadingChatId;

    public final class Adapter extends AdapterWithDiffUtils {
        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return ReactionsContainerLayout.this.items.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return ((InnerItem) ReactionsContainerLayout.this.items.get(i)).viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            if (i2 == 0 || i2 == 3) {
                ReactionHolderView reactionHolderView = (ReactionHolderView) viewHolder.itemView;
                reactionHolderView.setScaleX(1.0f);
                reactionHolderView.setScaleY(1.0f);
                ReactionHolderView.access$900(reactionHolderView, ((InnerItem) ReactionsContainerLayout.this.items.get(i)).reaction, i);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View reactionHolderView;
            ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
            if (i == 1) {
                reactionsContainerLayout.premiumLockContainer = new FrameLayout(reactionsContainerLayout.getContext());
                PremiumLockIconView premiumLockIconView = new PremiumLockIconView(reactionsContainerLayout.getContext(), 0, null);
                reactionsContainerLayout.premiumLockIconView = premiumLockIconView;
                int color = Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItemIcon, false);
                int i2 = Theme.key_dialogBackground;
                premiumLockIconView.setColor(ColorUtils.blendARGB(0.7f, color, Theme.getColor(null, i2, false)));
                reactionsContainerLayout.premiumLockIconView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), PorterDuff.Mode.MULTIPLY));
                reactionsContainerLayout.premiumLockIconView.setScaleX(0.0f);
                reactionsContainerLayout.premiumLockIconView.setScaleY(0.0f);
                reactionsContainerLayout.premiumLockIconView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                reactionsContainerLayout.premiumLockContainer.addView(reactionsContainerLayout.premiumLockIconView, LayoutHelper.createFrame(26, 26, 17));
                final int i3 = 1;
                reactionsContainerLayout.premiumLockIconView.setOnClickListener(new View.OnClickListener(this) {
                    public final ReactionsContainerLayout.Adapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                ReactionsContainerLayout.this.showCustomEmojiReactionDialog();
                                break;
                            default:
                                ReactionsContainerLayout.Adapter adapter = this.f$0;
                                adapter.getClass();
                                view.getLocationOnScreen(new int[2]);
                                view.getMeasuredWidth();
                                view.getMeasuredHeight();
                                ReactionsContainerLayout reactionsContainerLayout2 = ReactionsContainerLayout.this;
                                reactionsContainerLayout2.getClass();
                                new PremiumFeatureBottomSheet(reactionsContainerLayout2.fragment, 4, true).show();
                                break;
                        }
                    }
                });
                reactionHolderView = reactionsContainerLayout.premiumLockContainer;
            } else if (i != 2) {
                reactionHolderView = reactionsContainerLayout.new ReactionHolderView(reactionsContainerLayout.getContext());
            } else {
                reactionsContainerLayout.customReactionsContainer = new IntroActivity.AnonymousClass1(reactionsContainerLayout, reactionsContainerLayout.getContext());
                CustomPhoneKeyboardView.AnonymousClass1 anonymousClass1 = new CustomPhoneKeyboardView.AnonymousClass1(reactionsContainerLayout, reactionsContainerLayout.getContext());
                reactionsContainerLayout.customEmojiReactionsIconView = anonymousClass1;
                anonymousClass1.setImageResource(R.drawable.msg_reactions_expand);
                reactionsContainerLayout.customEmojiReactionsIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int i4 = reactionsContainerLayout.type;
                if (i4 == 1 || i4 == 2 || i4 == 4) {
                    reactionsContainerLayout.customEmojiReactionsIconView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
                } else {
                    reactionsContainerLayout.customEmojiReactionsIconView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogBackground, false), PorterDuff.Mode.MULTIPLY));
                }
                reactionsContainerLayout.customEmojiReactionsIconView.setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(28.0f), 0, ColorUtils.setAlphaComponent(Theme.getColor(null, Theme.key_listSelector, false), 40)));
                reactionsContainerLayout.customEmojiReactionsIconView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                reactionsContainerLayout.customEmojiReactionsIconView.setContentDescription(LocaleController.getString(R.string.AccDescrExpandPanel));
                reactionsContainerLayout.customReactionsContainer.addView(reactionsContainerLayout.customEmojiReactionsIconView, LayoutHelper.createFrame(30, 30, 17));
                final int i5 = 0;
                reactionsContainerLayout.customEmojiReactionsIconView.setOnClickListener(new View.OnClickListener(this) {
                    public final ReactionsContainerLayout.Adapter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i5) {
                            case 0:
                                ReactionsContainerLayout.this.showCustomEmojiReactionDialog();
                                break;
                            default:
                                ReactionsContainerLayout.Adapter adapter = this.f$0;
                                adapter.getClass();
                                view.getLocationOnScreen(new int[2]);
                                view.getMeasuredWidth();
                                view.getMeasuredHeight();
                                ReactionsContainerLayout reactionsContainerLayout2 = ReactionsContainerLayout.this;
                                reactionsContainerLayout2.getClass();
                                new PremiumFeatureBottomSheet(reactionsContainerLayout2.fragment, 4, true).show();
                                break;
                        }
                    }
                });
                reactionHolderView = reactionsContainerLayout.customReactionsContainer;
            }
            int topOffset = ((reactionsContainerLayout.getLayoutParams().height - ((int) reactionsContainerLayout.getTopOffset())) - reactionsContainerLayout.getPaddingTop()) - reactionsContainerLayout.getPaddingBottom();
            reactionHolderView.setLayoutParams(new RecyclerView.LayoutParams(topOffset - AndroidUtilities.dp(12.0f), topOffset));
            return new RecyclerListView.Holder(reactionHolderView);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition;
            int i = viewHolder.mItemViewType;
            if ((i == 0 || i == 3) && (adapterPosition = viewHolder.getAdapterPosition()) >= 0) {
                ArrayList arrayList = ReactionsContainerLayout.this.items;
                if (adapterPosition < arrayList.size()) {
                    ((ReactionHolderView) viewHolder.itemView).updateSelected(((InnerItem) arrayList.get(adapterPosition)).reaction, false);
                }
            }
        }
    }

    public final class InnerItem extends AdapterWithDiffUtils.Item {
        public final ReactionsLayoutInBubble.VisibleReaction reaction;

        public InnerItem(int i, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            super(i, false);
            this.reaction = visibleReaction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && InnerItem.class == obj.getClass()) {
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

    public final class LeftRightShadowsListener extends RecyclerView.OnScrollListener {
        public ValueAnimator leftAnimator;
        public boolean leftVisible;
        public ValueAnimator rightAnimator;
        public boolean rightVisible;

        public LeftRightShadowsListener() {
        }

        public static ValueAnimator startAnimator(float f, float f2, Consumer consumer, Runnable runnable) {
            ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration((long) (Math.abs(f2 - f) * 150.0f));
            duration.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(consumer, 8));
            duration.addListener(new ItemOptions.AnonymousClass3(runnable, 26));
            duration.start();
            return duration;
        }

        @Override
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
            StickersActivity.AnonymousClass2 anonymousClass2 = reactionsContainerLayout.linearLayoutManager;
            boolean z = anonymousClass2.findFirstVisibleItemPosition() != 0;
            if (z != this.leftVisible) {
                ValueAnimator valueAnimator = this.leftAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i3 = 0;
                final int i4 = 0;
                this.leftAnimator = startAnimator(reactionsContainerLayout.leftAlpha, z ? 1.0f : 0.0f, new Consumer(this) {
                    public final ReactionsContainerLayout.LeftRightShadowsListener f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void accept(Object obj) {
                        Float f = (Float) obj;
                        switch (i3) {
                            case 0:
                                ReactionsContainerLayout reactionsContainerLayout2 = ReactionsContainerLayout.this;
                                Paint paint = reactionsContainerLayout2.leftShadowPaint;
                                float fFloatValue = f.floatValue();
                                reactionsContainerLayout2.leftAlpha = fFloatValue;
                                paint.setAlpha((int) (fFloatValue * 255.0f));
                                reactionsContainerLayout2.invalidate();
                                break;
                            default:
                                ReactionsContainerLayout reactionsContainerLayout3 = ReactionsContainerLayout.this;
                                Paint paint2 = reactionsContainerLayout3.rightShadowPaint;
                                float fFloatValue2 = f.floatValue();
                                reactionsContainerLayout3.rightAlpha = fFloatValue2;
                                paint2.setAlpha((int) (fFloatValue2 * 255.0f));
                                reactionsContainerLayout3.invalidate();
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
                                this.f$0.leftAnimator = null;
                                break;
                            default:
                                this.f$0.rightAnimator = null;
                                break;
                        }
                    }
                });
                this.leftVisible = z;
            }
            boolean z2 = anonymousClass2.findLastVisibleItemPosition() != ReactionsContainerLayout.this.items.size() - 1;
            if (z2 != this.rightVisible) {
                ValueAnimator valueAnimator2 = this.rightAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i5 = 1;
                final int i6 = 1;
                this.rightAnimator = startAnimator(reactionsContainerLayout.rightAlpha, z2 ? 1.0f : 0.0f, new Consumer(this) {
                    public final ReactionsContainerLayout.LeftRightShadowsListener f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void accept(Object obj) {
                        Float f = (Float) obj;
                        switch (i5) {
                            case 0:
                                ReactionsContainerLayout reactionsContainerLayout2 = ReactionsContainerLayout.this;
                                Paint paint = reactionsContainerLayout2.leftShadowPaint;
                                float fFloatValue = f.floatValue();
                                reactionsContainerLayout2.leftAlpha = fFloatValue;
                                paint.setAlpha((int) (fFloatValue * 255.0f));
                                reactionsContainerLayout2.invalidate();
                                break;
                            default:
                                ReactionsContainerLayout reactionsContainerLayout3 = ReactionsContainerLayout.this;
                                Paint paint2 = reactionsContainerLayout3.rightShadowPaint;
                                float fFloatValue2 = f.floatValue();
                                reactionsContainerLayout3.rightAlpha = fFloatValue2;
                                paint2.setAlpha((int) (fFloatValue2 * 255.0f));
                                reactionsContainerLayout3.invalidate();
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
                                this.f$0.leftAnimator = null;
                                break;
                            default:
                                this.f$0.rightAnimator = null;
                                break;
                        }
                    }
                });
                this.rightVisible = z2;
            }
        }
    }

    public interface ReactionsContainerDelegate {
        boolean allowLongPress();

        boolean drawBackground();

        void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z);

        boolean needEnterText();

        void onEmojiWindowDismissed();

        void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2);
    }

    public ReactionsContainerLayout(int i, int i2, Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.forceAttachToParent = false;
        this.items = new ArrayList();
        this.oldItems = new ArrayList();
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
        this.selectedReactions = new HashSet();
        this.alwaysSelectedReactions = new HashSet();
        this.location = new int[2];
        Rect rect = new Rect();
        this.shadowPad = rect;
        new ArrayList();
        this.lastVisibleViews = new HashSet();
        this.lastVisibleViewsTmp = new HashSet();
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
        ReactionHolderView reactionHolderView = new ReactionHolderView(context);
        this.nextRecentReaction = reactionHolderView;
        reactionHolderView.setVisibility(8);
        reactionHolderView.touchable = false;
        reactionHolderView.pressedBackupImageView.setVisibility(8);
        addView(reactionHolderView);
        this.animationEnabled = SharedConfig.animationsEnabled() && SharedConfig.getDevicePerformanceClass() != 0;
        Drawable drawableMutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.shadow = drawableMutate;
        int iDp = AndroidUtilities.dp(7.0f);
        rect.bottom = iDp;
        rect.right = iDp;
        rect.top = iDp;
        rect.left = iDp;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelShadow, false), PorterDuff.Mode.MULTIPLY));
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, 14);
        this.recyclerListView = anonymousClass34;
        anonymousClass34.setClipChildren(false);
        anonymousClass34.setClipToPadding(false);
        StickersActivity.AnonymousClass2 anonymousClass2 = new StickersActivity.AnonymousClass2((ViewGroup) this, 6);
        this.linearLayoutManager = anonymousClass2;
        final int i3 = 0;
        anonymousClass34.addItemDecoration(new RecyclerView.ItemDecoration(this) {
            public final ReactionsContainerLayout this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void getItemOffsets(Rect rect2, View view, RecyclerView recyclerView, RecyclerView.State state) {
                switch (i3) {
                    case 0:
                        super.getItemOffsets(rect2, view, recyclerView, state);
                        ReactionsContainerLayout reactionsContainerLayout = this.this$0;
                        if (!reactionsContainerLayout.showCustomEmojiReaction()) {
                            recyclerView.getClass();
                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                            if (childAdapterPosition == 0) {
                                rect2.left = AndroidUtilities.dp(6.0f);
                            }
                            rect2.right = AndroidUtilities.dp(4.0f);
                            if (childAdapterPosition == ReactionsContainerLayout.this.items.size() - 1) {
                                if (!(reactionsContainerLayout.premiumLockedReactions.isEmpty() || MessagesController.getInstance(reactionsContainerLayout.currentAccount).premiumFeaturesBlocked()) || reactionsContainerLayout.showCustomEmojiReaction()) {
                                    rect2.right = AndroidUtilities.dp(2.0f);
                                } else {
                                    rect2.right = AndroidUtilities.dp(6.0f);
                                }
                            }
                        } else {
                            rect2.left = 0;
                            rect2.right = 0;
                        }
                        break;
                    default:
                        recyclerView.getClass();
                        int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(view);
                        if (childAdapterPosition2 == 0) {
                            rect2.left = AndroidUtilities.dp(8.0f);
                        }
                        if (childAdapterPosition2 == ReactionsContainerLayout.this.items.size() - 1) {
                            rect2.right = AndroidUtilities.dp(8.0f);
                        }
                        break;
                }
            }
        });
        anonymousClass34.setLayoutManager(anonymousClass2);
        anonymousClass34.setOverScrollMode(2);
        Adapter adapter = new Adapter();
        this.listAdapter = adapter;
        anonymousClass34.setAdapter(adapter);
        anonymousClass34.addOnScrollListener(new LeftRightShadowsListener());
        anonymousClass34.addOnScrollListener(new LocationActivity.AnonymousClass10(this, 4));
        final int i4 = 1;
        anonymousClass34.addItemDecoration(new RecyclerView.ItemDecoration(this) {
            public final ReactionsContainerLayout this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void getItemOffsets(Rect rect2, View view, RecyclerView recyclerView, RecyclerView.State state) {
                switch (i4) {
                    case 0:
                        super.getItemOffsets(rect2, view, recyclerView, state);
                        ReactionsContainerLayout reactionsContainerLayout = this.this$0;
                        if (!reactionsContainerLayout.showCustomEmojiReaction()) {
                            recyclerView.getClass();
                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                            if (childAdapterPosition == 0) {
                                rect2.left = AndroidUtilities.dp(6.0f);
                            }
                            rect2.right = AndroidUtilities.dp(4.0f);
                            if (childAdapterPosition == ReactionsContainerLayout.this.items.size() - 1) {
                                if (!(reactionsContainerLayout.premiumLockedReactions.isEmpty() || MessagesController.getInstance(reactionsContainerLayout.currentAccount).premiumFeaturesBlocked()) || reactionsContainerLayout.showCustomEmojiReaction()) {
                                    rect2.right = AndroidUtilities.dp(2.0f);
                                } else {
                                    rect2.right = AndroidUtilities.dp(6.0f);
                                }
                            }
                        } else {
                            rect2.left = 0;
                            rect2.right = 0;
                        }
                        break;
                    default:
                        recyclerView.getClass();
                        int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(view);
                        if (childAdapterPosition2 == 0) {
                            rect2.left = AndroidUtilities.dp(8.0f);
                        }
                        if (childAdapterPosition2 == ReactionsContainerLayout.this.items.size() - 1) {
                            rect2.right = AndroidUtilities.dp(8.0f);
                        }
                        break;
                }
            }
        });
        anonymousClass34.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 25));
        anonymousClass34.setOnItemLongClickListener((RecyclerListView.OnItemLongClickListener) new LaunchActivity$$ExternalSyntheticLambda9(this, i, 8));
        addView(anonymousClass34, LayoutHelper.createFrame(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        invalidateShaders();
        int paddingTop = (anonymousClass34.getLayoutParams().height - anonymousClass34.getPaddingTop()) - anonymousClass34.getPaddingBottom();
        reactionHolderView.getLayoutParams().width = paddingTop - AndroidUtilities.dp(12.0f);
        reactionHolderView.getLayoutParams().height = paddingTop;
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

    public static HashSet getInclusiveReactions(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        int i = 0;
        boolean z = true;
        while (i < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i);
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
        HashSet hashSet2 = new HashSet();
        for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
            if (longSparseArray.valueAt(i4) != null) {
                hashSet2.add((ReactionsLayoutInBubble.VisibleReaction) longSparseArray.valueAt(i4));
            }
        }
        return hashSet2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id != this.waitingLoadingChatId || getVisibility() == 0 || (chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                return;
            }
            setMessage(this.messageObject, null, true);
            setVisibility(0);
            startEnterAnimation(false);
            return;
        }
        if (i != NotificationCenter.emojiLoaded) {
            if (i == NotificationCenter.availableEffectsUpdate) {
                setMessage(this.messageObject, null, true);
            }
        } else {
            if (this.type != 4) {
                return;
            }
            invalidate();
            ChatActivity.AnonymousClass34 anonymousClass34 = this.recyclerListView;
            anonymousClass34.invalidate();
            anonymousClass34.invalidateViews();
            for (int i3 = 0; i3 < anonymousClass34.getChildCount(); i3++) {
                View childAt = anonymousClass34.getChildAt(i3);
                if (childAt instanceof ReactionHolderView) {
                    ReactionHolderView reactionHolderView = (ReactionHolderView) childAt;
                    reactionHolderView.enterImageView.invalidate();
                    reactionHolderView.loopImageView.invalidate();
                } else {
                    childAt.invalidate();
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float width;
        float f2;
        float fMax;
        float fMax2;
        float f3;
        float f4;
        float f5;
        int i;
        float f6;
        int i2;
        RectF rectF;
        float f7;
        ChatActivity.AnonymousClass34 anonymousClass34;
        int i3;
        RectF rectF2;
        float f8;
        float f9;
        float f10;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        PhotoViewer.AnonymousClass11 anonymousClass11;
        ReactionsContainerDelegate reactionsContainerDelegate;
        Canvas canvas2 = canvas;
        long jMin = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
        this.lastUpdate = System.currentTimeMillis();
        boolean z = this.isFlippedVertically;
        if (z) {
            float f11 = this.flipVerticalProgress;
            if (f11 != 1.0f) {
                this.flipVerticalProgress = Math.min(1.0f, (jMin / 220.0f) + f11);
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
        LinkSpanDrawable.LinksTextView linksTextView = this.hintView;
        if (linksTextView != null) {
            linksTextView.setTranslationY(-expandSize());
        }
        float fMax3 = (Math.max(0.25f, Math.min(this.transitionProgress, 1.0f)) - 0.25f) / 0.75f;
        float f12 = this.bigCircleRadius * fMax3;
        float f13 = this.smallCircleRadius * fMax3;
        HashSet hashSet = this.lastVisibleViewsTmp;
        hashSet.clear();
        HashSet hashSet2 = this.lastVisibleViews;
        hashSet.addAll(hashSet2);
        hashSet2.clear();
        if (this.prepareAnimation) {
            invalidate();
        }
        ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.pressedReaction;
        int i4 = this.type;
        if (visibleReaction != null && i4 != 5 && ((reactionsContainerDelegate = this.delegate) == null || reactionsContainerDelegate.allowLongPress())) {
            float f14 = this.pressedProgress;
            if (f14 != 1.0f) {
                float longPressTimeout = (16.0f / (this.pressedReaction.isStar ? ViewConfiguration.getLongPressTimeout() : 1500.0f)) + f14;
                this.pressedProgress = longPressTimeout;
                if (longPressTimeout >= 1.0f) {
                    this.pressedProgress = 1.0f;
                }
                invalidate();
            }
        }
        ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = this.pressedReaction;
        if (visibleReaction2 == null || !visibleReaction2.isStar) {
            float f15 = this.pressedProgress;
            this.pressedViewScale = (f15 * 2.0f) + 1.0f;
            this.otherViewsScale = 1.0f - (f15 * 0.15f);
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
        float f16 = width * f2;
        float f17 = this.transitionProgress;
        if (f17 != 1.0f) {
            canvas2.scale(f17, f17, f16, getHeight() / 2.0f);
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
        float width2 = (getWidth() - getPaddingRight()) * Math.min(1.0f, fMax2);
        float topOffset = getTopOffset();
        HashSet hashSet3 = hashSet2;
        RectF rectF3 = this.rect;
        float paddingLeft = getPaddingLeft() + width2;
        float paddingTop = getPaddingTop();
        ChatActivity.AnonymousClass34 anonymousClass35 = this.recyclerListView;
        HashSet hashSet4 = hashSet;
        float f18 = fMax2;
        ChatActivity.AnonymousClass34 anonymousClass36 = anonymousClass35;
        rectF3.set(paddingLeft, (((1.0f - this.otherViewsScale) * anonymousClass35.getMeasuredHeight()) + paddingTop) - fExpandSize, (getWidth() - getPaddingRight()) * fMax, (getHeight() - getPaddingBottom()) + fExpandSize);
        this.radius = SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(fExpandSize, 2.0f, rectF3.height() - topOffset, 2.0f);
        if (i4 != 1) {
            int iClamp = (int) (Utilities.clamp(1.0f - (this.customEmojiReactionsEnterProgress / 0.05f), 1.0f, 0.0f) * 255.0f);
            Drawable drawable = this.shadow;
            drawable.setAlpha(iClamp);
            float paddingLeft2 = getPaddingLeft();
            int width3 = getWidth() - getPaddingRight();
            f3 = 255.0f;
            Rect rect = this.shadowPad;
            int i5 = (int) fExpandSize;
            drawable.setBounds((int) ((((width3 + rect.right) * f18) + paddingLeft2) - rect.left), (getPaddingTop() - rect.top) - i5, (int) (((getWidth() - getPaddingRight()) + rect.right) * fMax), (getHeight() - getPaddingBottom()) + rect.bottom + i5);
            if (this.blurredBackgroundDrawable == null) {
                drawable.draw(canvas2);
            }
        } else {
            f3 = 255.0f;
        }
        canvas2.restoreToCount(iSave);
        if (this.skipDraw) {
            fMax3 = fMax3;
            hashSet3 = hashSet3;
            hashSet4 = hashSet4;
            f4 = 8.0f;
            f5 = 2.0f;
            i = i4;
            pullingLeftProgress = pullingLeftProgress;
            f6 = f16;
        } else {
            int iSave2 = canvas2.save();
            float f19 = this.transitionProgress;
            if (f19 != 1.0f) {
                canvas2.scale(f19, f19, f16, getHeight() / 2.0f);
            }
            if (i4 == 1 || this.delegate.drawBackground()) {
                f4 = 8.0f;
                f5 = 2.0f;
                i = i4;
                f6 = f16;
                this.delegate.drawRoundRect(canvas, rectF3, this.radius, getX(), getY(), 255, false);
                canvas2 = canvas;
            } else {
                BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredBackgroundDrawable;
                Paint paint = this.bgPaint;
                if (blurredBackgroundDrawable != null) {
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rectF3.round(rect2);
                    rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                    this.blurredBackgroundDrawable.setBounds(rect2);
                    this.blurredBackgroundDrawable.setAlpha(paint.getAlpha());
                    this.blurredBackgroundDrawable.draw(canvas2);
                } else {
                    float f20 = this.radius;
                    canvas2.drawRoundRect(rectF3, f20, f20, paint);
                }
                f4 = 8.0f;
                f5 = 2.0f;
                i = i4;
                f6 = f16;
            }
            if (this.hasStar) {
                Iterator it = this.selectedReactions.iterator();
                do {
                    if (!it.hasNext()) {
                        float f21 = this.radius;
                        float fClamp01 = Utilities.clamp01(1.0f - getPullingLeftProgress());
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
                        this.starSelectedGradientMatrix.postTranslate(rectF3.left, rectF3.top);
                        this.starSelectedGradient.setLocalMatrix(this.starSelectedGradientMatrix);
                        this.starSelectedGradientPaint.setAlpha((int) (fClamp01 * f3));
                        canvas2.drawRoundRect(rectF3, f21, f21, this.starSelectedGradientPaint);
                        break;
                    }
                } while (!((ReactionsLayoutInBubble.VisibleReaction) it.next()).isStar);
            }
            canvas2.restoreToCount(iSave2);
        }
        Path path = this.mPath;
        path.rewind();
        float f22 = this.radius;
        path.addRoundRect(rectF3, f22, f22, Path.Direction.CW);
        int iSave3 = canvas2.save();
        float f23 = this.transitionProgress;
        if (f23 != 1.0f) {
            canvas2.scale(f23, f23, f6, getHeight() / f5);
        }
        if (this.transitionProgress != 0.0f) {
            float f24 = 1.0f;
            if (getAlpha() == 1.0f || i == 5) {
                int i6 = 0;
                int left = 0;
                int iAbs = 0;
                while (i6 < anonymousClass36.getChildCount()) {
                    ChatActivity.AnonymousClass34 anonymousClass37 = anonymousClass36;
                    View childAt = anonymousClass37.getChildAt(i6);
                    if (this.transitionProgress != f24 && SharedConfig.deviceIsHigh()) {
                        iAbs = (int) (Math.abs((((childAt.getMeasuredWidth() / f5) + childAt.getLeft()) / anonymousClass37.getMeasuredWidth()) - 0.8f) * 200.0f);
                    }
                    int i7 = iSave3;
                    RectF rectF4 = rectF3;
                    if (childAt instanceof ReactionHolderView) {
                        ReactionHolderView reactionHolderView = (ReactionHolderView) anonymousClass37.getChildAt(i6);
                        float fDp = this.pullingLeftOffset != 0.0f ? AndroidUtilities.dp(46.0f) * Utilities.clamp(reactionHolderView.getLeft() / (getMeasuredWidth() - AndroidUtilities.dp(34.0f)), 1.0f, 0.0f) * getPullingLeftProgress() : 0.0f;
                        boolean zEquals = reactionHolderView.currentReaction.equals(this.pressedReaction);
                        ReactionHolderView.AnonymousClass2 anonymousClass2 = reactionHolderView.enterImageView;
                        float f25 = fDp;
                        ReactionHolderView.AnonymousClass2 anonymousClass3 = reactionHolderView.pressedBackupImageView;
                        if (zEquals) {
                            ReactionHolderView.AnonymousClass2 anonymousClass4 = reactionHolderView.loopImageView;
                            if (anonymousClass4.getVisibility() != 0) {
                                anonymousClass4 = anonymousClass2;
                            }
                            reactionHolderView.setPivotX(reactionHolderView.getMeasuredWidth() >> 1);
                            reactionHolderView.setPivotY(anonymousClass4.getY() + anonymousClass4.getMeasuredHeight());
                            reactionHolderView.setScaleX(this.pressedViewScale);
                            reactionHolderView.setScaleY(this.pressedViewScale);
                            if (!this.clicked) {
                                if (this.cancelPressedAnimation == null) {
                                    anonymousClass3.setVisibility(0);
                                    anonymousClass3.setAlpha(1.0f);
                                    if (anonymousClass3.getImageReceiver().hasBitmapImage() || ((animatedEmojiDrawable = anonymousClass3.animatedEmojiDrawable) != null && (anonymousClass11 = animatedEmojiDrawable.imageReceiver) != null && anonymousClass11.hasBitmapImage())) {
                                        anonymousClass4.setAlpha(0.0f);
                                    }
                                    f10 = 1.0f;
                                } else {
                                    f10 = 1.0f;
                                    anonymousClass3.setAlpha(1.0f - this.cancelPressedProgress);
                                    anonymousClass4.setAlpha(this.cancelPressedProgress);
                                }
                                if (this.pressedProgress == f10) {
                                    this.clicked = true;
                                    if (System.currentTimeMillis() - this.lastReactionSentTime > 300) {
                                        this.lastReactionSentTime = System.currentTimeMillis();
                                        this.delegate.onReactionClicked(reactionHolderView, reactionHolderView.currentReaction, true, false);
                                    }
                                }
                            }
                            canvas2.save();
                            float x = reactionHolderView.getX() + anonymousClass37.getX();
                            float scaleX = ((reactionHolderView.getScaleX() * reactionHolderView.getMeasuredWidth()) - reactionHolderView.getMeasuredWidth()) / f5;
                            float f26 = x - scaleX;
                            if (f26 < 0.0f && reactionHolderView.getTranslationX() >= 0.0f) {
                                reactionHolderView.setTranslationX((-f26) - f25);
                            } else if (reactionHolderView.getMeasuredWidth() + x + scaleX <= getMeasuredWidth() || reactionHolderView.getTranslationX() > 0.0f) {
                                reactionHolderView.setTranslationX(0.0f - f25);
                            } else {
                                reactionHolderView.setTranslationX((((getMeasuredWidth() - x) - reactionHolderView.getMeasuredWidth()) - scaleX) - f25);
                            }
                            canvas2.translate(reactionHolderView.getX() + anonymousClass37.getX(), reactionHolderView.getY() + anonymousClass37.getY());
                            canvas2.scale(reactionHolderView.getScaleX(), reactionHolderView.getScaleY(), reactionHolderView.getPivotX(), reactionHolderView.getPivotY());
                            reactionHolderView.draw(canvas2);
                            canvas2.restore();
                        } else {
                            anonymousClass37 = anonymousClass37;
                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(reactionHolderView);
                            float measuredWidth = (((this.pressedViewScale - 1.0f) * reactionHolderView.getMeasuredWidth()) / 3.0f) - (((1.0f - this.otherViewsScale) * reactionHolderView.getMeasuredWidth()) * (Math.abs(this.pressedReactionPosition - childAdapterPosition) - 1));
                            if (childAdapterPosition < this.pressedReactionPosition) {
                                reactionHolderView.setPivotX(0.0f);
                                reactionHolderView.setTranslationX(-measuredWidth);
                            } else {
                                reactionHolderView.setPivotX(reactionHolderView.getMeasuredWidth() - f25);
                                reactionHolderView.setTranslationX(measuredWidth - f25);
                            }
                            reactionHolderView.setPivotY(anonymousClass2.getY() + anonymousClass2.getMeasuredHeight());
                            reactionHolderView.setScaleX(this.otherViewsScale);
                            reactionHolderView.setScaleY(this.otherViewsScale);
                            anonymousClass3.setVisibility(4);
                            anonymousClass2.setAlpha(1.0f);
                        }
                        if (childAt.getLeft() > left) {
                            left = childAt.getLeft();
                        }
                        if (!this.skipEnterAnimation && (!reactionHolderView.hasEnterAnimation || anonymousClass2.getImageReceiver().getLottieAnimation() != null)) {
                            if ((reactionHolderView.getMeasuredWidth() / f5) + reactionHolderView.getX() > 0.0f && (reactionHolderView.getMeasuredWidth() / f5) + reactionHolderView.getX() < anonymousClass37.getWidth()) {
                                if (!hashSet4.contains(reactionHolderView)) {
                                    reactionHolderView.play(iAbs);
                                    iAbs += 30;
                                }
                                hashSet3.add(reactionHolderView);
                            } else if (!reactionHolderView.isEnter) {
                                reactionHolderView.resetAnimation();
                            }
                        }
                    } else {
                        i6 = i6;
                        anonymousClass37 = anonymousClass37;
                        f12 = f12;
                        if (childAt != this.premiumLockContainer) {
                            f8 = 0.0f;
                        } else if ((childAt.getMeasuredWidth() / f5) + childAt.getX() <= 0.0f || (childAt.getMeasuredWidth() / f5) + childAt.getX() >= anonymousClass37.getWidth()) {
                            PremiumLockIconView premiumLockIconView = this.premiumLockIconView;
                            f8 = 0.0f;
                            premiumLockIconView.setScaleX(0.0f);
                            premiumLockIconView.setScaleY(0.0f);
                        } else {
                            if (!hashSet4.contains(childAt)) {
                                if (this.transitionProgress != 1.0f) {
                                    PremiumLockIconView premiumLockIconView2 = this.premiumLockIconView;
                                    f9 = 0.0f;
                                    premiumLockIconView2.setScaleX(0.0f);
                                    premiumLockIconView2.setScaleY(0.0f);
                                } else {
                                    f9 = 0.0f;
                                }
                                PremiumLockIconView premiumLockIconView3 = this.premiumLockIconView;
                                CellFlickerDrawable cellFlickerDrawable = premiumLockIconView3.cellFlickerDrawable;
                                if (cellFlickerDrawable != null) {
                                    cellFlickerDrawable.progress = f9;
                                    cellFlickerDrawable.repeatEnabled = false;
                                }
                                premiumLockIconView3.invalidate();
                                premiumLockIconView3.animate().scaleX(1.1f).scaleY(1.1f).setStartDelay(iAbs).setInterpolator(AndroidUtilities.overshootInterpolator).setDuration(300L);
                                iAbs += 30;
                            }
                            hashSet3.add(childAt);
                            f8 = 0.0f;
                        }
                        if (childAt == this.customReactionsContainer) {
                            if ((childAt.getMeasuredWidth() / f5) + childAt.getX() <= f8 || (childAt.getMeasuredWidth() / f5) + childAt.getX() >= anonymousClass37.getWidth()) {
                                CustomPhoneKeyboardView.AnonymousClass1 anonymousClass1 = this.customEmojiReactionsIconView;
                                anonymousClass1.setScaleX(0.0f);
                                anonymousClass1.setScaleY(0.0f);
                                ((ReactionsContainerLayout) anonymousClass1.this$0).customReactionsContainer.invalidate();
                                ValueAnimator valueAnimator = (ValueAnimator) anonymousClass1.val$backDetector;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                            } else {
                                if (!hashSet4.contains(childAt)) {
                                    if (this.transitionProgress != 1.0f) {
                                        CustomPhoneKeyboardView.AnonymousClass1 anonymousClass5 = this.customEmojiReactionsIconView;
                                        anonymousClass5.setScaleX(0.0f);
                                        anonymousClass5.setScaleY(0.0f);
                                        ((ReactionsContainerLayout) anonymousClass5.this$0).customReactionsContainer.invalidate();
                                        ValueAnimator valueAnimator2 = (ValueAnimator) anonymousClass5.val$backDetector;
                                        if (valueAnimator2 != null) {
                                            valueAnimator2.cancel();
                                        }
                                    }
                                    CustomPhoneKeyboardView.AnonymousClass1 anonymousClass6 = this.customEmojiReactionsIconView;
                                    boolean z2 = LiteMode.isEnabled(8200) || SharedConfig.getDevicePerformanceClass() >= 1;
                                    anonymousClass6.invalidate();
                                    ValueAnimator valueAnimator3 = (ValueAnimator) anonymousClass6.val$backDetector;
                                    if (valueAnimator3 != null) {
                                        valueAnimator3.removeAllListeners();
                                        ((ValueAnimator) anonymousClass6.val$backDetector).cancel();
                                    }
                                    if (z2) {
                                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(anonymousClass6.getScaleX(), 1.0f);
                                        anonymousClass6.val$backDetector = valueAnimatorOfFloat;
                                        valueAnimatorOfFloat.setInterpolator(AndroidUtilities.overshootInterpolator);
                                        ((ValueAnimator) anonymousClass6.val$backDetector).addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(anonymousClass6, 7));
                                        ((ValueAnimator) anonymousClass6.val$backDetector).setStartDelay((long) (iAbs * ((ReactionsContainerLayout) anonymousClass6.this$0).durationScale));
                                        ((ValueAnimator) anonymousClass6.val$backDetector).setDuration(300L);
                                        ((ValueAnimator) anonymousClass6.val$backDetector).start();
                                    } else {
                                        anonymousClass6.setScaleX(1.0f);
                                        anonymousClass6.setScaleY(1.0f);
                                    }
                                    iAbs += 30;
                                }
                                hashSet3.add(childAt);
                            }
                        }
                        int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(childAt);
                        float measuredWidth2 = (((this.pressedViewScale - 1.0f) * childAt.getMeasuredWidth()) / 3.0f) - (((1.0f - this.otherViewsScale) * childAt.getMeasuredWidth()) * (Math.abs(this.pressedReactionPosition - childAdapterPosition2) - 1));
                        if (childAdapterPosition2 < this.pressedReactionPosition) {
                            childAt.setPivotX(0.0f);
                            childAt.setTranslationX(-measuredWidth2);
                        } else {
                            childAt.setPivotX(childAt.getMeasuredWidth());
                            childAt.setTranslationX(measuredWidth2);
                        }
                        childAt.setScaleX(this.otherViewsScale);
                        childAt.setScaleY(this.otherViewsScale);
                    }
                    i6++;
                    canvas2 = canvas;
                    rectF3 = rectF4;
                    iSave3 = i7;
                    f12 = f12;
                    anonymousClass36 = anonymousClass37;
                    f24 = 1.0f;
                }
                i2 = iSave3;
                rectF = rectF3;
                f7 = f12;
                anonymousClass34 = anonymousClass36;
                ReactionHolderView reactionHolderView2 = this.nextRecentReaction;
                if (pullingLeftProgress > 0.0f) {
                    float pullingLeftProgress2 = getPullingLeftProgress();
                    int measuredWidth3 = reactionHolderView2.getMeasuredWidth() - AndroidUtilities.dp(f5);
                    float f27 = left + measuredWidth3;
                    float fClamp = Utilities.clamp(f27 / (getMeasuredWidth() - reactionHolderView2.getMeasuredWidth()), 1.0f, 0.0f) * pullingLeftProgress2 * measuredWidth3;
                    if (reactionHolderView2.getTag() == null) {
                        reactionHolderView2.setTag(Float.valueOf(1.0f));
                        reactionHolderView2.resetAnimation();
                        reactionHolderView2.play(0);
                    }
                    float fClamp2 = Utilities.clamp(pullingLeftProgress2, 1.0f, 0.0f);
                    reactionHolderView2.setScaleX(fClamp2);
                    reactionHolderView2.setScaleY(fClamp2);
                    i3 = 1;
                    reactionHolderView2.setTranslationX(((anonymousClass34.getX() + f27) - fClamp) + (-((i == 1 || i == 2) ? AndroidUtilities.dp(f4) : AndroidUtilities.dp(20.0f))));
                    if (reactionHolderView2.getVisibility() != 0) {
                        reactionHolderView2.setVisibility(0);
                    }
                } else {
                    i3 = 1;
                    if (reactionHolderView2.getVisibility() != 8 && this.isHiddenNextReaction) {
                        reactionHolderView2.setVisibility(8);
                    }
                    if (reactionHolderView2.getTag() != null) {
                        reactionHolderView2.setTag(null);
                    }
                }
            } else {
                i2 = iSave3;
                rectF = rectF3;
                f7 = f12;
                anonymousClass34 = anonymousClass36;
                i3 = 1;
            }
        } else {
            i2 = iSave3;
            rectF = rectF3;
            f7 = f12;
            anonymousClass34 = anonymousClass36;
            i3 = 1;
        }
        if (this.skipDraw && this.reactionsWindow != null) {
            int iM = (int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, this.customEmojiReactionsEnterProgress, Utilities.clamp(1.0f - (this.customEmojiReactionsEnterProgress / 0.2f), 1.0f, 0.0f), 255.0f);
            canvas.save();
            drawBubbles(f7, fMax3, f13, iM, canvas);
            canvas.restore();
            return;
        }
        float f28 = fMax3;
        boolean zShowCustomEmojiReaction = showCustomEmojiReaction();
        if (!zShowCustomEmojiReaction) {
            canvas.clipPath(path);
        }
        if (LocaleController.isRTL || this.mirrorX) {
            i3 = -1;
        }
        canvas.translate((1.0f - this.transitionProgress) * getWidth() * i3, 0.0f);
        anonymousClass34.setTranslationX(-width2);
        super.dispatchDraw(canvas);
        if (!zShowCustomEmojiReaction) {
            Paint paint2 = this.leftShadowPaint;
            if (paint2 != null) {
                paint2.setAlpha((int) (Utilities.clamp(this.leftAlpha * this.transitionProgress, 1.0f, 0.0f) * 255.0f));
                rectF2 = rectF;
                canvas.drawRect(rectF2, paint2);
            } else {
                rectF2 = rectF;
            }
            Paint paint3 = this.rightShadowPaint;
            if (paint3 != null) {
                paint3.setAlpha((int) (Utilities.clamp(this.rightAlpha * this.transitionProgress, 1.0f, 0.0f) * 255.0f));
                canvas.drawRect(rectF2, paint3);
            }
        }
        canvas.restoreToCount(i2);
        drawBubbles(f7, f28, f13, 255, canvas);
        invalidate();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void drawBubbles(float f, float f2, float f3, int i, Canvas canvas) {
        float f4;
        if (this.type == 1) {
            return;
        }
        canvas.save();
        boolean z = this.isTop;
        RectF rectF = this.rect;
        if (z) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.lerp(rectF.top, getMeasuredHeight(), CubicBezierInterpolator.DEFAULT.getInterpolation(this.flipVerticalProgress)) - ((int) Math.ceil((1.0f - this.transitionProgress) * (rectF.height() / 2.0f)))) + 1.0f);
        } else {
            float f5 = rectF.bottom;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            canvas.clipRect(0.0f, (AndroidUtilities.lerp(f5, 0.0f, cubicBezierInterpolator.getInterpolation(this.flipVerticalProgress)) - ((int) Math.ceil((1.0f - this.transitionProgress) * (rectF.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f) + getMeasuredHeight(), getPaddingTop() - expandSize(), cubicBezierInterpolator.getInterpolation(this.flipVerticalProgress)));
        }
        float width = ((LocaleController.isRTL || this.mirrorX) ? this.bigCircleOffset : getWidth() - this.bigCircleOffset) + this.bubblesOffset;
        float paddingTop = this.isTop ? getPaddingTop() - expandSize() : (getHeight() - getPaddingBottom()) + expandSize();
        int iDp = AndroidUtilities.dp(3.0f);
        Drawable drawable = this.shadow;
        drawable.setAlpha(i);
        Paint paint = this.bgPaint;
        paint.setAlpha(i);
        float f6 = width - f;
        float f7 = iDp;
        float f8 = f7 * f2;
        float f9 = paddingTop - f;
        float f10 = width + f;
        float f11 = paddingTop + f;
        drawable.setBounds((int) (f6 - f8), (int) (f9 - f8), (int) (f10 + f8), (int) (f8 + f11));
        drawable.draw(canvas);
        boolean zDrawBackground = this.delegate.drawBackground();
        float f12 = paddingTop;
        RectF rectF2 = this.rectF;
        if (zDrawBackground) {
            rectF2.set(f6, f9, f10, f11);
            f4 = f;
            this.delegate.drawRoundRect(canvas, rectF2, f4, getX(), getY(), i, false);
        } else {
            f4 = f;
            if (this.blurredBackgroundDrawable1 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(f6, f9, f10, f11);
                Rect rect = AndroidUtilities.rectTmp2;
                rectF3.round(rect);
                rect.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                this.blurredBackgroundDrawable1.setBounds(rect);
                this.blurredBackgroundDrawable1.setAlpha(paint.getAlpha());
                this.blurredBackgroundDrawable1.draw(canvas);
            } else {
                canvas.drawCircle(width, f12, f4, paint);
            }
        }
        boolean z2 = LocaleController.isRTL;
        float f13 = this.bigCircleRadius;
        float width2 = this.bubblesOffset + this.miniBubblesOffset + ((z2 || this.mirrorX) ? this.bigCircleOffset - f13 : (getWidth() - this.bigCircleOffset) + f13);
        boolean z3 = this.isTop;
        float f14 = this.smallCircleRadius;
        float fLerp = AndroidUtilities.lerp(z3 ? (getPaddingTop() - expandSize()) - AndroidUtilities.dp(16.0f) : ((getHeight() - f14) - f7) + expandSize(), (f14 + f7) - expandSize(), CubicBezierInterpolator.DEFAULT.getInterpolation(this.flipVerticalProgress));
        float f15 = (-AndroidUtilities.dp(1.0f)) * f2;
        drawable.setBounds((int) ((width2 - f4) - f15), (int) ((fLerp - f4) - f15), (int) (width2 + f4 + f15), (int) (f4 + fLerp + f15));
        drawable.draw(canvas);
        if (this.delegate.drawBackground()) {
            rectF2.set(width2 - f3, fLerp - f3, width2 + f3, fLerp + f3);
            this.delegate.drawRoundRect(canvas, rectF2, f3, getX(), getY(), i, false);
        } else if (this.blurredBackgroundDrawable2 != null) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(width2 - f3, fLerp - f3, width2 + f3, fLerp + f3);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rectF4.round(rect2);
            rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
            this.blurredBackgroundDrawable2.setBounds(rect2);
            this.blurredBackgroundDrawable2.setAlpha(paint.getAlpha());
            this.blurredBackgroundDrawable2.draw(canvas);
        } else {
            canvas.drawCircle(width2, fLerp, f3, paint);
        }
        canvas.restore();
        drawable.setAlpha(255);
        paint.setAlpha(255);
    }

    public final float expandSize() {
        return (int) (getPullingLeftProgress() * AndroidUtilities.dp(6.0f));
    }

    public final void fillRecentReactionsList(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int i = 0;
        int i2 = this.type;
        if (i2 == 4) {
            int i3 = 0;
            for (ReactionsLayoutInBubble.VisibleReaction visibleReaction : this.selectedReactions) {
                if (!hashSet.contains(visibleReaction)) {
                    hashSet.add(visibleReaction);
                    arrayList.add(visibleReaction);
                    i3++;
                    if (i3 >= 8) {
                        return;
                    }
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList();
            while (i < enabledReactionsList.size()) {
                TLRPC.TL_availableReaction tL_availableReaction = enabledReactionsList.get(i);
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = new ReactionsLayoutInBubble.VisibleReaction();
                String str = tL_availableReaction.reaction;
                visibleReaction2.emojicon = str;
                visibleReaction2.hash = str.hashCode();
                if (!hashSet.contains(visibleReaction2)) {
                    hashSet.add(visibleReaction2);
                    arrayList.add(visibleReaction2);
                    i3++;
                    if (i3 >= 8) {
                        return;
                    }
                }
                i++;
            }
            return;
        }
        if (!this.allReactionsAvailable || i2 == 4) {
            if (i2 != 3) {
                List<TLRPC.TL_availableReaction> enabledReactionsList2 = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList();
                while (i < enabledReactionsList2.size()) {
                    TLRPC.TL_availableReaction tL_availableReaction2 = enabledReactionsList2.get(i);
                    ReactionsLayoutInBubble.VisibleReaction visibleReaction3 = new ReactionsLayoutInBubble.VisibleReaction();
                    String str2 = tL_availableReaction2.reaction;
                    visibleReaction3.emojicon = str2;
                    visibleReaction3.hash = str2.hashCode();
                    arrayList.add(visibleReaction3);
                    i++;
                }
                return;
            }
            ArrayList<TLRPC.Reaction> savedReactions = MediaDataController.getInstance(this.currentAccount).getSavedReactions();
            int i4 = 0;
            while (i < savedReactions.size()) {
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(savedReactions.get(i));
                if (!hashSet.contains(visibleReactionFromTL)) {
                    hashSet.add(visibleReactionFromTL);
                    arrayList.add(visibleReactionFromTL);
                    i4++;
                }
                if (i4 == 16) {
                    return;
                } else {
                    i++;
                }
            }
            return;
        }
        if (i2 == 5) {
            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.currentAccount).getAvailableEffects();
            if (availableEffects != null) {
                while (i < availableEffects.effects.size()) {
                    ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL2 = ReactionsLayoutInBubble.VisibleReaction.fromTL(availableEffects.effects.get(i));
                    if (!hashSet.contains(visibleReactionFromTL2)) {
                        hashSet.add(visibleReactionFromTL2);
                        arrayList.add(visibleReactionFromTL2);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        ArrayList<TLRPC.Reaction> savedReactions2 = i2 == 3 ? MediaDataController.getInstance(this.currentAccount).getSavedReactions() : MediaDataController.getInstance(this.currentAccount).getTopReactions();
        if (i2 == 3) {
            TLRPC.TL_messages_savedReactionsTags savedReactionTags = MessagesController.getInstance(this.currentAccount).getSavedReactionTags(0L);
            if (savedReactionTags != null) {
                for (int i5 = 0; i5 < savedReactionTags.tags.size(); i5++) {
                    ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL3 = ReactionsLayoutInBubble.VisibleReaction.fromTL(savedReactionTags.tags.get(i5).reaction);
                    if (!hashSet.contains(visibleReactionFromTL3)) {
                        hashSet.add(visibleReactionFromTL3);
                        arrayList.add(visibleReactionFromTL3);
                    }
                }
            }
            for (int i6 = 0; i6 < savedReactions2.size(); i6++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL4 = ReactionsLayoutInBubble.VisibleReaction.fromTL(savedReactions2.get(i6));
                if (!hashSet.contains(visibleReactionFromTL4)) {
                    hashSet.add(visibleReactionFromTL4);
                    arrayList.add(visibleReactionFromTL4);
                }
            }
        } else {
            for (int i7 = 0; i7 < savedReactions2.size(); i7++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL5 = ReactionsLayoutInBubble.VisibleReaction.fromTL(savedReactions2.get(i7));
                if (!hashSet.contains(visibleReactionFromTL5) && (i2 == 3 || UserConfig.getInstance(this.currentAccount).isPremium() || visibleReactionFromTL5.documentId == 0)) {
                    hashSet.add(visibleReactionFromTL5);
                    arrayList.add(visibleReactionFromTL5);
                }
            }
        }
        if (i2 != 3 || UserConfig.getInstance(this.currentAccount).isPremium()) {
            ArrayList<TLRPC.Reaction> recentReactions = MediaDataController.getInstance(this.currentAccount).getRecentReactions();
            for (int i8 = 0; i8 < recentReactions.size(); i8++) {
                ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL6 = ReactionsLayoutInBubble.VisibleReaction.fromTL(recentReactions.get(i8));
                if (!hashSet.contains(visibleReactionFromTL6)) {
                    hashSet.add(visibleReactionFromTL6);
                    arrayList.add(visibleReactionFromTL6);
                }
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList3 = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList();
            while (i < enabledReactionsList3.size()) {
                TLRPC.TL_availableReaction tL_availableReaction3 = enabledReactionsList3.get(i);
                ReactionsLayoutInBubble.VisibleReaction visibleReaction4 = new ReactionsLayoutInBubble.VisibleReaction();
                String str3 = tL_availableReaction3.reaction;
                visibleReaction4.emojicon = str3;
                visibleReaction4.hash = str3.hashCode();
                if (!hashSet.contains(visibleReaction4)) {
                    hashSet.add(visibleReaction4);
                    arrayList.add(visibleReaction4);
                }
                i++;
            }
        }
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
        HashSet hashSet = this.selectedReactions;
        if (hashSet.isEmpty()) {
            return "";
        }
        ReactionsLayoutInBubble.VisibleReaction visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) hashSet.iterator().next();
        long j = visibleReaction.documentId;
        String strFindAnimatedEmojiEmoticon = null;
        if (j != 0 && (documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, j)) != null) {
            strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(documentFindDocument, null);
        }
        if (TextUtils.isEmpty(strFindAnimatedEmojiEmoticon)) {
            strFindAnimatedEmojiEmoticon = visibleReaction.emojicon;
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
        return AndroidUtilities.dp(16.0f) + zzkv.m(itemsCount, 1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(36.0f) * itemsCount);
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
        int i = 0;
        while (true) {
            ChatActivity.AnonymousClass34 anonymousClass34 = this.recyclerListView;
            if (i >= anonymousClass34.getChildCount()) {
                return;
            }
            View childAt = anonymousClass34.getChildAt(i);
            if (childAt instanceof ReactionHolderView) {
                ((ReactionHolderView) childAt).loopImageView.invalidate();
            }
            i++;
        }
    }

    public final void invalidateShaders() {
        int iDp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int color = Theme.getColor(null, Theme.key_actionBarDefaultSubmenuBackground, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.leftShadowPaint.setShader(new LinearGradient(0.0f, height, iDp, height, color, 0, tileMode));
        this.rightShadowPaint.setShader(new LinearGradient(getWidth(), height, getWidth() - iDp, height, color, 0, tileMode));
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.type == 5) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.type == 5) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        }
    }

    public final void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z) {
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
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateShaders();
    }

    public final void reset() {
        this.isHiddenNextReaction = true;
        this.pressedReactionPosition = 0;
        this.pressedProgress = 0.0f;
        this.pullingLeftOffset = 0.0f;
        this.pressedReaction = null;
        this.clicked = false;
        ReactionsContainerLayout$$ExternalSyntheticLambda2 reactionsContainerLayout$$ExternalSyntheticLambda2 = new ReactionsContainerLayout$$ExternalSyntheticLambda2(this, 1);
        ChatActivity.AnonymousClass34 anonymousClass34 = this.recyclerListView;
        AndroidUtilities.forEachViews((RecyclerView) anonymousClass34, (com.google.android.exoplayer2.util.Consumer) reactionsContainerLayout$$ExternalSyntheticLambda2);
        this.lastVisibleViews.clear();
        anonymousClass34.invalidate();
        IntroActivity.AnonymousClass1 anonymousClass1 = this.customReactionsContainer;
        if (anonymousClass1 != null) {
            anonymousClass1.invalidate();
        }
        invalidate();
    }

    @Override
    public void setAlpha(float f) {
        if (getAlpha() != f && f == 0.0f) {
            this.lastVisibleViews.clear();
            int i = 0;
            while (true) {
                ChatActivity.AnonymousClass34 anonymousClass34 = this.recyclerListView;
                if (i >= anonymousClass34.getChildCount()) {
                    break;
                }
                if (anonymousClass34.getChildAt(i) instanceof ReactionHolderView) {
                    ((ReactionHolderView) anonymousClass34.getChildAt(i)).resetAnimation();
                }
                i++;
            }
        }
        super.setAlpha(f);
    }

    public final void setBackgroundFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder) {
        this.backgroundFactory = blurredBackgroundDrawableViewFactory;
        this.backgroundColorProvider = blurredBackgroundProviderBuilder;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this, null, true);
        blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProviderBuilder);
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(24.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
        this.blurredBackgroundDrawable = blurredBackgroundDrawableCreate;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = blurredBackgroundDrawableViewFactory.create(this, null, true);
        blurredBackgroundDrawableCreate2.setColorProvider(blurredBackgroundProviderBuilder);
        blurredBackgroundDrawableCreate2.setRadius(AndroidUtilities.dp(8.0f));
        blurredBackgroundDrawableCreate2.setPadding(AndroidUtilities.dp(8.0f));
        this.blurredBackgroundDrawable1 = blurredBackgroundDrawableCreate2;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = blurredBackgroundDrawableViewFactory.create(this, null, true);
        blurredBackgroundDrawableCreate3.setColorProvider(blurredBackgroundProviderBuilder);
        blurredBackgroundDrawableCreate3.setRadius(AndroidUtilities.dp(4.0f));
        blurredBackgroundDrawableCreate3.setPadding(AndroidUtilities.dp(8.0f));
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
            Context context = getContext();
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            this.hintView = linksTextView;
            linksTextView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.hintView.setClickable(true);
            this.hintView.setTextSize(1, 12.0f);
            int i = this.type;
            if (i == 1 || i == 2 || i == 4) {
                this.hintView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                this.hintView.setAlpha(0.5f);
            } else {
                this.hintView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            }
            this.hintView.setGravity(1);
            addView(this.hintView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.hintView.setText(charSequence);
        this.hintMeasured = false;
        ((FrameLayout.LayoutParams) this.nextRecentReaction.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
        ((FrameLayout.LayoutParams) this.recyclerListView.getLayoutParams()).topMargin = AndroidUtilities.dp(20.0f);
    }

    public final void setMessage(MessageObject messageObject, TLRPC.ChatFull chatFull, boolean z) {
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
        int i3 = this.type;
        this.hitLimit = i3 == 0 && this.messageObject != null && i >= MessagesController.getInstance(this.currentAccount).getChatMaxUniqReactions(this.messageObject.getDialogId());
        this.channelReactions = i3 == 0 && this.messageObject != null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.messageObject.getDialogId())));
        ArrayList arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.isForwardedChannelPost() && (chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-messageObject.getFromChatId())) == null) {
            this.waitingLoadingChatId = -messageObject.getFromChatId();
            MessagesController.getInstance(this.currentAccount).loadFullChat(-messageObject.getFromChatId(), 0, true);
            setVisibility(4);
            return;
        }
        this.hasStar = false;
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
        HashSet hashSet = new HashSet();
        int i6 = 0;
        while (i6 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i6))) {
                i6--;
                arrayList2.remove(i6);
            } else {
                hashSet.add((ReactionsLayoutInBubble.VisibleReaction) arrayList2.get(i6));
            }
            i6++;
        }
        this.showExpandableReactions = !this.hitLimit && ((!this.allReactionsAvailable && arrayList2.size() > 16) || (this.allReactionsAvailable && !UserConfig.getInstance(this.currentAccount).isPremium() && MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()));
        if (i3 == 3 && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.showExpandableReactions = false;
        }
        if (i3 == 4) {
            this.showExpandableReactions = true;
        }
        ArrayList arrayList5 = this.visibleReactionsList;
        arrayList5.clear();
        if (showCustomEmojiReaction()) {
            int iDp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) / AndroidUtilities.dp(34.0f);
            if (iDp > 7) {
                iDp = 7;
            }
            if (iDp < 1) {
                iDp = 1;
            }
            int i7 = 0;
            while (i7 < Math.min(arrayList2.size(), iDp)) {
                arrayList5.add((ReactionsLayoutInBubble.VisibleReaction) arrayList2.get(i7));
                i7++;
            }
            if (i7 < arrayList2.size()) {
                ReactionHolderView.access$900(this.nextRecentReaction, (ReactionsLayoutInBubble.VisibleReaction) arrayList2.get(i7), -1);
            }
        } else {
            arrayList5.addAll(arrayList2);
        }
        this.allReactionsIsDefault = true;
        for (int i8 = 0; i8 < arrayList5.size(); i8++) {
            if (((ReactionsLayoutInBubble.VisibleReaction) arrayList5.get(i8)).documentId != 0) {
                this.allReactionsIsDefault = false;
            }
        }
        ArrayList arrayList6 = this.allReactionsList;
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        Adapter adapter = this.listAdapter;
        ReactionsContainerLayout.this.oldItems.clear();
        ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
        ArrayList arrayList7 = reactionsContainerLayout.oldItems;
        ArrayList arrayList8 = reactionsContainerLayout.items;
        arrayList7.addAll(arrayList8);
        arrayList8.clear();
        int i9 = 0;
        while (true) {
            ArrayList arrayList9 = reactionsContainerLayout.visibleReactionsList;
            if (i9 >= arrayList9.size()) {
                break;
            }
            ReactionsLayoutInBubble.VisibleReaction visibleReaction3 = (ReactionsLayoutInBubble.VisibleReaction) arrayList9.get(i9);
            arrayList8.add(new InnerItem(visibleReaction3.emojicon == null ? 3 : 0, visibleReaction3));
            i9++;
        }
        if (!reactionsContainerLayout.premiumLockedReactions.isEmpty() && !MessagesController.getInstance(reactionsContainerLayout.currentAccount).premiumFeaturesBlocked()) {
            arrayList8.add(new InnerItem(1, null));
        }
        if (reactionsContainerLayout.showCustomEmojiReaction()) {
            arrayList8.add(new InnerItem(2, null));
        }
        if (z) {
            adapter.setItems(arrayList7, arrayList8);
        } else {
            adapter.mObservable.notifyChanged();
        }
        if (messageObject == null || (tL_messageReactions = messageObject.messageOwner.reactions) == null || tL_messageReactions.results == null) {
            return;
        }
        for (int i10 = 0; i10 < messageObject.messageOwner.reactions.results.size(); i10++) {
            if (messageObject.messageOwner.reactions.results.get(i10).chosen) {
                this.selectedReactions.add(ReactionsLayoutInBubble.VisibleReaction.fromTL(messageObject.messageOwner.reactions.results.get(i10).reaction));
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

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.selectedReactions;
        hashSet.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            ReactionsLayoutInBubble.VisibleReaction visibleReactionFromEmojicon = ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(str);
            hashSet.add(visibleReactionFromEmojicon);
            this.alwaysSelectedReactions.add(visibleReactionFromEmojicon);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, (com.google.android.exoplayer2.util.Consumer) new ReactionsContainerLayout$$ExternalSyntheticLambda2(this, 0));
    }

    public void setSelectedReaction(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        HashSet hashSet = this.selectedReactions;
        hashSet.clear();
        if (visibleReaction != null) {
            hashSet.add(visibleReaction);
        }
        this.listAdapter.mObservable.notifyChanged();
    }

    public void setSelectedReactionAnimated(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        HashSet hashSet = this.selectedReactions;
        hashSet.clear();
        if (visibleReaction != null) {
            hashSet.add(visibleReaction);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, (com.google.android.exoplayer2.util.Consumer) new ReactionsContainerLayout$$ExternalSyntheticLambda2(this, 0));
    }

    public void setSelectedReactionInclusive(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        HashSet hashSet = this.selectedReactions;
        hashSet.clear();
        if (visibleReaction != null) {
            hashSet.add(visibleReaction);
        }
        AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, (com.google.android.exoplayer2.util.Consumer) new ReactionsContainerLayout$$ExternalSyntheticLambda2(this, 0));
    }

    public void setSelectedReactions(ArrayList<MessageObject> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.selectedReactions;
        hashSet.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = arrayList.get(i);
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null && tL_messageReactions.results != null) {
                for (int i2 = 0; i2 < messageObject.messageOwner.reactions.results.size(); i2++) {
                    if (messageObject.messageOwner.reactions.results.get(i2).chosen) {
                        hashSet.add(ReactionsLayoutInBubble.VisibleReaction.fromTL(messageObject.messageOwner.reactions.results.get(i2).reaction));
                    }
                }
            }
        }
        this.listAdapter.mObservable.notifyChanged();
    }

    public void setSelectedReactionsInclusive(ArrayList<MessageObject> arrayList) {
        HashSet hashSet = this.selectedReactions;
        hashSet.clear();
        hashSet.addAll(getInclusiveReactions(arrayList));
        AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, (com.google.android.exoplayer2.util.Consumer) new ReactionsContainerLayout$$ExternalSyntheticLambda2(this, 0));
    }

    public void setSkipDraw(boolean z) {
        if (this.skipDraw != z) {
            this.skipDraw = z;
            if (!z) {
                int i = 0;
                while (true) {
                    ChatActivity.AnonymousClass34 anonymousClass34 = this.recyclerListView;
                    if (i >= anonymousClass34.getChildCount()) {
                        break;
                    }
                    if (anonymousClass34.getChildAt(i) instanceof ReactionHolderView) {
                        ReactionHolderView reactionHolderView = (ReactionHolderView) anonymousClass34.getChildAt(i);
                        if (reactionHolderView.hasEnterAnimation) {
                            ReactionHolderView.AnonymousClass2 anonymousClass2 = reactionHolderView.loopImageView;
                            if (anonymousClass2.getImageReceiver().getLottieAnimation() != null || anonymousClass2.getImageReceiver().getAnimation() != null) {
                                anonymousClass2.setVisibility(0);
                                reactionHolderView.enterImageView.setVisibility(4);
                                if (reactionHolderView.shouldSwitchToLoopView) {
                                    reactionHolderView.switchedToLoopView = true;
                                }
                            }
                        }
                        reactionHolderView.invalidate();
                    }
                    i++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.selectedReactions;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction));
        }
        this.listAdapter.mObservable.notifyChanged();
    }

    public void setTop(boolean z) {
        this.isTop = z;
    }

    public void setTransitionProgress(float f) {
        this.transitionProgress = f;
        ChatScrimPopupContainerLayout chatScrimPopupContainerLayout = this.parentLayout;
        if (chatScrimPopupContainerLayout != null) {
            if (!this.animatePopup || !SharedConfig.deviceIsHigh()) {
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

    public final boolean showCustomEmojiReaction() {
        return this.allReactionsAvailable || this.showExpandableReactions;
    }

    public final void showCustomEmojiReactionDialog() {
        if (this.reactionsWindow != null) {
            return;
        }
        CustomEmojiReactionsWindow customEmojiReactionsWindow = new CustomEmojiReactionsWindow(this.type, this.fragment, this.allReactionsList, this.selectedReactions, this, this.resourcesProvider, this.forceAttachToParent);
        this.reactionsWindow = customEmojiReactionsWindow;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.backgroundFactory;
        boolean z = true;
        if (blurredBackgroundDrawableViewFactory != null) {
            BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = this.backgroundColorProvider;
            customEmojiReactionsWindow.selectAnimatedEmojiDialog.searchBox.setUseCustomBackground();
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(customEmojiReactionsWindow.containerView, null, true);
            blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProviderBuilder);
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(12.0f));
            blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
            customEmojiReactionsWindow.blurredBackgroundDrawable = blurredBackgroundDrawableCreate;
        }
        CustomEmojiReactionsWindow customEmojiReactionsWindow2 = this.reactionsWindow;
        ReactionsContainerDelegate reactionsContainerDelegate = this.delegate;
        if (reactionsContainerDelegate != null && !reactionsContainerDelegate.allowLongPress()) {
            z = false;
        }
        customEmojiReactionsWindow2.selectAnimatedEmojiDialog.setLongPressEnabled(z);
        invalidateLoopViews();
        this.reactionsWindow.onDismiss = new SeekBarView$$ExternalSyntheticLambda1(this, 2);
        onShownCustomEmojiReactionDialog();
    }

    public final void startEnterAnimation(boolean z) {
        ObjectAnimator duration;
        this.animatePopup = z;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.notificationsLocker.lock();
        boolean zDeviceIsHigh = SharedConfig.deviceIsHigh();
        PhotoViewer.AnonymousClass13 anonymousClass13 = TRANSITION_PROGRESS_VALUE;
        if (zDeviceIsHigh) {
            duration = ObjectAnimator.ofFloat(this, anonymousClass13, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, anonymousClass13, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new PaintView.AnonymousClass15(this, 1));
        duration.start();
    }

    public final class ReactionHolderView extends FrameLayout {
        public ReactionsLayoutInBubble.VisibleReaction currentReaction;
        public boolean drawSelected;
        public ValueAnimator enterAnimator;
        public final AnonymousClass2 enterImageView;
        public float enterScale;
        public boolean hasEnterAnimation;
        public boolean isEnter;
        public boolean isLocked;
        public PremiumLockIconView lockIconView;
        public final AnonymousClass1 longPressRunnable;
        public final AnonymousClass2 loopImageView;
        public StarsReactionsSheet.Particles particles;
        public final AnonymousClass1 playRunnable;
        public int position;
        public final ImageReceiver preloadImageReceiver;
        public boolean pressed;
        public final AnonymousClass2 pressedBackupImageView;
        public float pressedX;
        public float pressedY;
        public boolean selected;
        public boolean shouldSwitchToLoopView;
        public float sideScale;
        public boolean switchedToLoopView;
        public boolean touchable;
        public boolean waitingAnimation;

        public final class AnonymousClass1 implements Runnable {
            public final int $r8$classId;
            public final ReactionHolderView this$1;

            public AnonymousClass1(ReactionHolderView reactionHolderView, int i) {
                this.$r8$classId = i;
                this.this$1 = reactionHolderView;
            }

            @Override
            public final void run() {
                switch (this.$r8$classId) {
                    case 0:
                        if (this.this$1.enterImageView.getImageReceiver().getLottieAnimation() != null && !this.this$1.enterImageView.getImageReceiver().getLottieAnimation().isRunning && !this.this$1.enterImageView.getImageReceiver().getLottieAnimation().isGeneratingCache()) {
                            this.this$1.enterImageView.getImageReceiver().getLottieAnimation().start();
                        }
                        this.this$1.waitingAnimation = false;
                        break;
                    default:
                        ReactionHolderView reactionHolderView = this.this$1;
                        try {
                            reactionHolderView.performHapticFeedback(0);
                            break;
                        } catch (Exception unused) {
                        }
                        ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                        reactionsContainerLayout.pressedReactionPosition = reactionsContainerLayout.visibleReactionsList.indexOf(reactionHolderView.currentReaction);
                        ReactionsContainerLayout reactionsContainerLayout2 = ReactionsContainerLayout.this;
                        reactionsContainerLayout2.pressedReaction = reactionHolderView.currentReaction;
                        reactionsContainerLayout2.invalidate();
                        break;
                }
            }
        }

        public ReactionHolderView(Context context) {
            super(context);
            this.preloadImageReceiver = new ImageReceiver();
            this.sideScale = 1.0f;
            this.drawSelected = true;
            this.playRunnable = new AnonymousClass1(this, 0);
            this.enterScale = 1.0f;
            int i = 1;
            this.longPressRunnable = new AnonymousClass1(this, i);
            this.touchable = true;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, context, 0);
            this.enterImageView = anonymousClass2;
            AnonymousClass2 anonymousClass3 = new AnonymousClass2(this, context, i);
            this.loopImageView = anonymousClass3;
            anonymousClass2.getImageReceiver().setAutoRepeat(0);
            anonymousClass2.getImageReceiver().setAllowStartLottieAnimation(false);
            AnonymousClass2 anonymousClass4 = new AnonymousClass2(this, context, 2);
            this.pressedBackupImageView = anonymousClass4;
            addView(anonymousClass2, LayoutHelper.createFrame(34, 34, 17));
            addView(anonymousClass4, LayoutHelper.createFrame(34, 34, 17));
            addView(anonymousClass3, LayoutHelper.createFrame(34, 34, 17));
            if (ReactionsContainerLayout.this.type == 4) {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setDuration(100L);
                layoutTransition.enableTransitionType(4);
                setLayoutTransition(layoutTransition);
            }
            anonymousClass2.setLayerNum(Integer.MAX_VALUE);
            anonymousClass3.setLayerNum(Integer.MAX_VALUE);
            anonymousClass3.imageReceiver.setAutoRepeat(0);
            anonymousClass3.imageReceiver.setAllowStartAnimation(false);
            anonymousClass3.imageReceiver.setAllowStartLottieAnimation(false);
            anonymousClass4.setLayerNum(Integer.MAX_VALUE);
        }

        public static void access$900(ReactionHolderView reactionHolderView, ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i) {
            reactionHolderView.updateSelected(visibleReaction, false);
            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = reactionHolderView.currentReaction;
            if (visibleReaction2 != null && visibleReaction2.equals(visibleReaction)) {
                reactionHolderView.position = i;
                reactionHolderView.updateImage(visibleReaction);
                return;
            }
            ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
            boolean zIsPremium = UserConfig.getInstance(reactionsContainerLayout.currentAccount).isPremium();
            int i2 = reactionsContainerLayout.type;
            boolean z = (i2 == 3 && !zIsPremium) || (i2 == 5 && visibleReaction.premium && !zIsPremium);
            reactionHolderView.isLocked = z;
            AnonymousClass2 anonymousClass2 = reactionHolderView.loopImageView;
            if (z && reactionHolderView.lockIconView == null) {
                PremiumLockIconView premiumLockIconView = new PremiumLockIconView(reactionHolderView.getContext(), 1, null);
                reactionHolderView.lockIconView = premiumLockIconView;
                premiumLockIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                reactionHolderView.lockIconView.setImageReceiver(anonymousClass2.getImageReceiver());
                reactionHolderView.addView(reactionHolderView.lockIconView, LayoutHelper.createFrame(18, 18.0f, 17, 8.0f, 8.0f, 0.0f, 0.0f));
            }
            PremiumLockIconView premiumLockIconView2 = reactionHolderView.lockIconView;
            if (premiumLockIconView2 != null) {
                premiumLockIconView2.setVisibility(reactionHolderView.isLocked ? 0 : 8);
            }
            reactionHolderView.resetAnimation();
            reactionHolderView.currentReaction = visibleReaction;
            reactionHolderView.hasEnterAnimation = visibleReaction.isStar || (visibleReaction.emojicon != null && ((reactionsContainerLayout.showCustomEmojiReaction() || reactionsContainerLayout.allReactionsIsDefault) && LiteMode.isEnabled(8200)));
            if (i2 == 4 || reactionHolderView.currentReaction.isEffect) {
                reactionHolderView.hasEnterAnimation = false;
            }
            ReactionsLayoutInBubble.VisibleReaction visibleReaction3 = reactionHolderView.currentReaction;
            boolean z2 = visibleReaction3.isStar;
            AnonymousClass2 anonymousClass3 = reactionHolderView.pressedBackupImageView;
            AnonymousClass2 anonymousClass4 = reactionHolderView.enterImageView;
            if (z2 || visibleReaction3.emojicon != null) {
                reactionHolderView.updateImage(visibleReaction);
                anonymousClass3.setAnimatedEmojiDrawable(null);
                if (anonymousClass4.getImageReceiver().getLottieAnimation() != null) {
                    anonymousClass4.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false, false);
                }
                PremiumLockIconView premiumLockIconView3 = reactionHolderView.lockIconView;
                if (premiumLockIconView3 != null) {
                    premiumLockIconView3.setAnimatedEmojiDrawable(null);
                }
            } else {
                anonymousClass3.getImageReceiver().clearImage();
                anonymousClass2.getImageReceiver().clearImage();
                AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(4, reactionsContainerLayout.currentAccount, reactionHolderView.currentReaction.documentId);
                AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(3, reactionsContainerLayout.currentAccount, reactionHolderView.currentReaction.documentId);
                if (i2 == 1 || i2 == 2 || i2 == 4) {
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
                    animatedEmojiDrawable2.setColorFilter(new PorterDuffColorFilter(-1, mode));
                } else {
                    int i3 = Theme.key_windowBackgroundWhiteBlueIcon;
                    Theme.ResourcesProvider resourcesProvider = reactionsContainerLayout.resourcesProvider;
                    int color = Theme.getColor(i3, resourcesProvider);
                    PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
                    animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(color, mode2));
                    animatedEmojiDrawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3, resourcesProvider), mode2));
                }
                anonymousClass3.setAnimatedEmojiDrawable(animatedEmojiDrawable);
                anonymousClass2.setAnimatedEmojiDrawable(animatedEmojiDrawable2);
                PremiumLockIconView premiumLockIconView4 = reactionHolderView.lockIconView;
                if (premiumLockIconView4 != null) {
                    premiumLockIconView4.setAnimatedEmojiDrawable(animatedEmojiDrawable2);
                }
            }
            reactionHolderView.setFocusable(true);
            boolean z3 = reactionHolderView.hasEnterAnimation;
            reactionHolderView.shouldSwitchToLoopView = z3;
            if (z3) {
                reactionHolderView.switchedToLoopView = false;
                anonymousClass4.setVisibility(0);
                anonymousClass2.setVisibility(8);
            } else {
                anonymousClass4.setVisibility(8);
                anonymousClass2.setVisibility(0);
                reactionHolderView.switchedToLoopView = true;
            }
            ViewGroup.LayoutParams layoutParams = anonymousClass2.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = anonymousClass2.getLayoutParams();
            int iDp = AndroidUtilities.dp(34.0f);
            layoutParams2.height = iDp;
            layoutParams.width = iDp;
            ViewGroup.LayoutParams layoutParams3 = anonymousClass4.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = anonymousClass4.getLayoutParams();
            int iDp2 = AndroidUtilities.dp(34.0f);
            layoutParams4.height = iDp2;
            layoutParams3.width = iDp2;
        }

        public final void checkPlayLoopImage() {
            AnonymousClass2 anonymousClass2 = this.loopImageView;
            AnimatedEmojiDrawable animatedEmojiDrawable = anonymousClass2.animatedEmojiDrawable;
            ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.imageReceiver : anonymousClass2.imageReceiver;
            if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
                return;
            }
            ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
            if (reactionsContainerLayout.reactionsWindow != null || this.pressed || !reactionsContainerLayout.allReactionsIsDefault) {
                imageReceiver.getLottieAnimation().start();
            } else if (imageReceiver.getLottieAnimation().currentFrame <= 2) {
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                lottieAnimation.isRunning = false;
                lottieAnimation.checkChoreographer$1();
            }
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            int i;
            PhotoViewer.AnonymousClass11 anonymousClass11;
            if (this.selected && this.drawSelected) {
                float measuredWidth = getMeasuredWidth() >> 1;
                float measuredHeight = getMeasuredHeight() >> 1;
                float measuredWidth2 = (getMeasuredWidth() >> 1) - AndroidUtilities.dp(1.0f);
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.currentReaction;
                ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth2, (visibleReaction == null || !visibleReaction.isStar) ? reactionsContainerLayout.selectedPaint : reactionsContainerLayout.starSelectedPaint);
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = this.loopImageView.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null && (anonymousClass11 = animatedEmojiDrawable.imageReceiver) != null) {
                if (this.position == 0) {
                    anonymousClass11.setRoundRadius(AndroidUtilities.dp(6.0f), 0, 0, AndroidUtilities.dp(6.0f));
                } else {
                    anonymousClass11.setRoundRadius(this.selected ? AndroidUtilities.dp(6.0f) : 0);
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
                particles.visibleCount = (int) (particles.particles.size() * ((lottieAnimation == null || (i = lottieAnimation.currentFrame) <= 30) ? 0.0f : Utilities.clamp01((i - 30) / 30.0f)));
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
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            resetAnimation();
            this.preloadImageReceiver.onAttachedToWindow();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.preloadImageReceiver.onDetachedFromWindow();
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
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
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i;
            ReactionsContainerDelegate reactionsContainerDelegate;
            int i2 = 2;
            if (this.touchable) {
                final ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                if (reactionsContainerLayout.cancelPressedAnimation == null) {
                    int action = motionEvent.getAction();
                    AnonymousClass1 anonymousClass1 = this.longPressRunnable;
                    if (action == 0) {
                        this.pressed = true;
                        this.pressedX = motionEvent.getX();
                        this.pressedY = motionEvent.getY();
                        if (this.sideScale == 1.0f && !this.isLocked && (i = reactionsContainerLayout.type) != 3 && i != 4 && i != 5 && ((reactionsContainerDelegate = reactionsContainerLayout.delegate) == null || reactionsContainerDelegate.allowLongPress())) {
                            AndroidUtilities.runOnUIThread(anonymousClass1, ViewConfiguration.getLongPressTimeout());
                        }
                    }
                    float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
                    if ((motionEvent.getAction() != 2 || (Math.abs(this.pressedX - motionEvent.getX()) <= scaledTouchSlop && Math.abs(this.pressedY - motionEvent.getY()) <= scaledTouchSlop)) && motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return true;
                    }
                    if (motionEvent.getAction() == 1 && this.pressed && ((reactionsContainerLayout.pressedReaction == null || reactionsContainerLayout.pressedProgress > 0.8f) && reactionsContainerLayout.delegate != null)) {
                        reactionsContainerLayout.clicked = true;
                        if (System.currentTimeMillis() - reactionsContainerLayout.lastReactionSentTime > 300) {
                            reactionsContainerLayout.lastReactionSentTime = System.currentTimeMillis();
                            reactionsContainerLayout.delegate.onReactionClicked(this, this.currentReaction, reactionsContainerLayout.pressedProgress > 0.8f, false);
                        }
                    }
                    if (!reactionsContainerLayout.clicked && reactionsContainerLayout.pressedReaction != null) {
                        reactionsContainerLayout.cancelPressedProgress = 0.0f;
                        final float f = reactionsContainerLayout.pressedProgress;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        reactionsContainerLayout.cancelPressedAnimation = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ReactionsContainerLayout reactionsContainerLayout2 = ReactionsContainerLayout.this;
                                reactionsContainerLayout2.cancelPressedProgress = fFloatValue;
                                reactionsContainerLayout2.pressedProgress = (1.0f - reactionsContainerLayout2.cancelPressedProgress) * f;
                                reactionsContainerLayout2.invalidate();
                            }
                        });
                        reactionsContainerLayout.cancelPressedAnimation.addListener(new PaintView.AnonymousClass15(reactionsContainerLayout, i2));
                        reactionsContainerLayout.cancelPressedAnimation.setDuration(150L);
                        reactionsContainerLayout.cancelPressedAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        reactionsContainerLayout.cancelPressedAnimation.start();
                    }
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                    this.pressed = false;
                    return true;
                }
            }
            return false;
        }

        public final void play(int i) {
            if (!ReactionsContainerLayout.this.animationEnabled) {
                resetAnimation();
                this.isEnter = true;
                if (this.hasEnterAnimation) {
                    return;
                }
                this.loopImageView.setVisibility(0);
                this.loopImageView.setScaleY(this.enterScale * (this.selected ? 0.76f : 1.0f));
                this.loopImageView.setScaleX(this.enterScale * (this.selected ? 0.76f : 1.0f));
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.playRunnable);
            if (!this.hasEnterAnimation) {
                if (this.isEnter) {
                    return;
                }
                this.enterScale = 0.0f;
                this.loopImageView.setScaleX(0.0f);
                this.loopImageView.setScaleY(0.0f);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.enterAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 9));
                this.enterAnimator.setDuration(150L);
                this.enterAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.enterAnimator.setStartDelay((long) (i * ReactionsContainerLayout.this.durationScale));
                this.enterAnimator.start();
                this.isEnter = true;
                return;
            }
            if (this.enterImageView.getImageReceiver().getLottieAnimation() == null || this.enterImageView.getImageReceiver().getLottieAnimation().isGeneratingCache() || this.isEnter) {
                if (this.enterImageView.getImageReceiver().getLottieAnimation() != null && this.isEnter && !this.enterImageView.getImageReceiver().getLottieAnimation().isRunning && !this.enterImageView.getImageReceiver().getLottieAnimation().isGeneratingCache()) {
                    this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(this.enterImageView.getImageReceiver().getLottieAnimation().metaData[0] - 1, false, false);
                }
                this.loopImageView.setScaleY(this.enterScale * (this.selected ? 0.76f : 1.0f));
                this.loopImageView.setScaleX(this.enterScale * (this.selected ? 0.76f : 1.0f));
                return;
            }
            this.isEnter = true;
            if (i == 0) {
                this.waitingAnimation = false;
                RLottieDrawable lottieAnimation = this.enterImageView.getImageReceiver().getLottieAnimation();
                lottieAnimation.isRunning = false;
                lottieAnimation.checkChoreographer$1();
                this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false, false);
                this.playRunnable.run();
                return;
            }
            this.waitingAnimation = true;
            RLottieDrawable lottieAnimation2 = this.enterImageView.getImageReceiver().getLottieAnimation();
            lottieAnimation2.isRunning = false;
            lottieAnimation2.checkChoreographer$1();
            this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false, false);
            AndroidUtilities.runOnUIThread(this.playRunnable, i);
        }

        public final void resetAnimation() {
            if (this.hasEnterAnimation) {
                AndroidUtilities.cancelRunOnUIThread(this.playRunnable);
                if (this.enterImageView.getImageReceiver().getLottieAnimation() != null && !this.enterImageView.getImageReceiver().getLottieAnimation().isGeneratingCache()) {
                    RLottieDrawable lottieAnimation = this.enterImageView.getImageReceiver().getLottieAnimation();
                    lottieAnimation.isRunning = false;
                    lottieAnimation.checkChoreographer$1();
                    if (ReactionsContainerLayout.this.animationEnabled) {
                        this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false, true);
                    } else {
                        this.enterImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(this.enterImageView.getImageReceiver().getLottieAnimation().metaData[0] - 1, false, true);
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

        public final void updateImage(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            TLRPC.TL_availableReaction tL_availableReaction;
            AnonymousClass2 anonymousClass2 = this.enterImageView;
            AnonymousClass2 anonymousClass3 = this.loopImageView;
            if (visibleReaction != null && visibleReaction.isStar) {
                anonymousClass2.getImageReceiver().setImageBitmap(new RLottieDrawable(R.raw.star_reaction, "star_reaction", AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), true, null));
                anonymousClass3.getImageReceiver().setImageBitmap(getContext().getResources().getDrawable(R.drawable.star_reaction));
                if (this.particles == null) {
                    this.particles = new StarsReactionsSheet.Particles(1, SharedConfig.getDevicePerformanceClass() == 2 ? 45 : 18);
                    return;
                }
                return;
            }
            ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
            int i = reactionsContainerLayout.type;
            if (i == 4 && visibleReaction != null && visibleReaction.emojicon != null) {
                anonymousClass2.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(visibleReaction.emojicon));
                anonymousClass3.getImageReceiver().setImageBitmap(Emoji.getEmojiDrawable(visibleReaction.emojicon));
                return;
            }
            ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = this.currentReaction;
            if (visibleReaction2.isEffect) {
                TLRPC.Document effectDocument = MessagesController.getInstance(reactionsContainerLayout.currentAccount).getEffectDocument(this.currentReaction.documentId);
                anonymousClass3.getImageReceiver().setImage(ImageLocation.getForDocument(effectDocument), "60_60_firstframe", null, null, this.hasEnterAnimation ? null : DocumentObject.getSvgThumb(effectDocument, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f), 0L, "tgs", this.currentReaction, 0);
                return;
            }
            if (visibleReaction2.emojicon != null) {
                TLRPC.TL_availableReaction tL_availableReaction2 = MediaDataController.getInstance(reactionsContainerLayout.currentAccount).getReactionsMap().get(this.currentReaction.emojicon);
                if (tL_availableReaction2 != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction2.activate_animation, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                    if (!LiteMode.isEnabled(8200) || i == 4) {
                        tL_availableReaction = tL_availableReaction2;
                        if (SharedConfig.getDevicePerformanceClass() <= 0 || i == 4) {
                            anonymousClass3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.hasEnterAnimation ? null : svgThumb, 0L, "tgs", this.currentReaction, 0);
                        } else {
                            anonymousClass2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", visibleReaction, 0);
                            anonymousClass3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_firstframe", null, null, this.hasEnterAnimation ? null : svgThumb, 0L, "tgs", this.currentReaction, 0);
                        }
                    } else {
                        tL_availableReaction = tL_availableReaction2;
                        anonymousClass2.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction2.appear_animation), "30_30_nolimit", null, null, svgThumb, 0L, "tgs", visibleReaction, 0);
                        anonymousClass3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, this.hasEnterAnimation ? null : svgThumb, 0L, "tgs", this.currentReaction, 0);
                    }
                    if (anonymousClass2.getImageReceiver().getLottieAnimation() != null) {
                        anonymousClass2.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false, true);
                    }
                    this.pressedBackupImageView.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60_pcache", null, null, svgThumb, 0L, "tgs", visibleReaction, 0);
                    ImageReceiver imageReceiver = this.preloadImageReceiver;
                    imageReceiver.setAllowStartLottieAnimation(false);
                    MediaDataController.getInstance(reactionsContainerLayout.currentAccount).preloadImage(imageReceiver, ImageLocation.getForDocument(tL_availableReaction.around_animation), ReactionsEffectOverlay.getFilterForAroundAnimation());
                }
                PremiumLockIconView premiumLockIconView = this.lockIconView;
                if (premiumLockIconView != null) {
                    premiumLockIconView.setImageReceiver(anonymousClass3.getImageReceiver());
                }
            }
        }

        public final void updateSelected(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z) {
            boolean z2 = this.selected;
            boolean zContains = ReactionsContainerLayout.this.selectedReactions.contains(visibleReaction);
            this.selected = zContains;
            if (zContains != z2) {
                AnonymousClass2 anonymousClass2 = this.enterImageView;
                AnonymousClass2 anonymousClass3 = this.loopImageView;
                if (z) {
                    ViewPropertyAnimator duration = anonymousClass3.animate().scaleX(this.enterScale * (this.selected ? 0.76f : 1.0f)).scaleY(this.enterScale * (this.selected ? 0.76f : 1.0f)).setDuration(240L);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    duration.setInterpolator(cubicBezierInterpolator).start();
                    anonymousClass2.animate().scaleX(this.enterScale * (this.selected ? 0.76f : 1.0f)).scaleY(this.enterScale * (this.selected ? 0.76f : 1.0f)).setDuration(240L).setInterpolator(cubicBezierInterpolator).start();
                } else {
                    anonymousClass3.setScaleX(this.enterScale * (zContains ? 0.76f : 1.0f));
                    anonymousClass3.setScaleY(this.enterScale * (this.selected ? 0.76f : 1.0f));
                    anonymousClass2.setScaleX(this.enterScale * (this.selected ? 0.76f : 1.0f));
                    anonymousClass2.setScaleY(this.enterScale * (this.selected ? 0.76f : 1.0f));
                }
                requestLayout();
                invalidate();
            }
        }

        public final class AnonymousClass2 extends BackupImageView {
            public final int $r8$classId;
            public final ReactionHolderView this$1;

            public AnonymousClass2(ReactionHolderView reactionHolderView, Context context, int i) {
                super(context);
                this.$r8$classId = i;
                this.this$1 = reactionHolderView;
            }

            @Override
            public ImageReceiver createImageReciever() {
                switch (this.$r8$classId) {
                    case 0:
                        final int i = 0;
                        return new ImageReceiver(this) {
                            @Override
                            public final boolean setImageBitmapByKey(Drawable drawable, String str, int i2, boolean z, int i3) {
                                switch (i) {
                                    case 0:
                                        if (drawable instanceof RLottieDrawable) {
                                            ((RLottieDrawable) drawable).setCurrentFrame(0, false, true);
                                        }
                                        return super.setImageBitmapByKey(drawable, str, i2, z, i3);
                                    default:
                                        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i2, z, i3);
                                        if (imageBitmapByKey && (drawable instanceof RLottieDrawable)) {
                                            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                                            rLottieDrawable.setCurrentFrame(0, false, true);
                                            rLottieDrawable.isRunning = false;
                                            rLottieDrawable.checkChoreographer$1();
                                        }
                                        return imageBitmapByKey;
                                }
                            }
                        };
                    case 1:
                        final int i2 = 1;
                        return new ImageReceiver(this) {
                            @Override
                            public final boolean setImageBitmapByKey(Drawable drawable, String str, int i3, boolean z, int i4) {
                                switch (i2) {
                                    case 0:
                                        if (drawable instanceof RLottieDrawable) {
                                            ((RLottieDrawable) drawable).setCurrentFrame(0, false, true);
                                        }
                                        return super.setImageBitmapByKey(drawable, str, i3, z, i4);
                                    default:
                                        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i3, z, i4);
                                        if (imageBitmapByKey && (drawable instanceof RLottieDrawable)) {
                                            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                                            rLottieDrawable.setCurrentFrame(0, false, true);
                                            rLottieDrawable.isRunning = false;
                                            rLottieDrawable.checkChoreographer$1();
                                        }
                                        return imageBitmapByKey;
                                }
                            }
                        };
                    default:
                        return super.createImageReciever();
                }
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                switch (this.$r8$classId) {
                    case 0:
                        super.dispatchDraw(canvas);
                        RLottieDrawable lottieAnimation = this.imageReceiver.getLottieAnimation();
                        ReactionHolderView reactionHolderView = this.this$1;
                        if (lottieAnimation != null && !reactionHolderView.waitingAnimation) {
                            this.imageReceiver.getLottieAnimation().start();
                        }
                        if (reactionHolderView.shouldSwitchToLoopView && !reactionHolderView.switchedToLoopView && this.imageReceiver.getLottieAnimation() != null && this.imageReceiver.getLottieAnimation().isLastFrame()) {
                            AnonymousClass2 anonymousClass2 = reactionHolderView.loopImageView;
                            if (anonymousClass2.imageReceiver.getLottieAnimation() != null && anonymousClass2.imageReceiver.getLottieAnimation().hasBitmap()) {
                                reactionHolderView.switchedToLoopView = true;
                                anonymousClass2.imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                                anonymousClass2.setVisibility(0);
                                Runnable runnable = ReactionsContainerLayout.this.onSwitchedToLoopView;
                                if (runnable != null) {
                                    runnable.run();
                                }
                                AndroidUtilities.runOnUIThread(new SeekBarView$$ExternalSyntheticLambda1(this, 3));
                            }
                        }
                        invalidate();
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public final void invalidate() {
                ReactionHolderView reactionHolderView = this.this$1;
                switch (this.$r8$classId) {
                    case 0:
                        if (!HwEmojis.grabIfWeakDevice(this, ReactionsContainerLayout.this)) {
                            super.invalidate();
                            ReactionsContainerLayout.this.invalidate();
                            break;
                        }
                        break;
                    case 1:
                        if (!HwEmojis.grabIfWeakDevice(this)) {
                            super.invalidate();
                            break;
                        }
                        break;
                    default:
                        super.invalidate();
                        ReactionsContainerLayout.this.invalidate();
                        break;
                }
            }

            @Override
            public void onDraw(Canvas canvas) {
                switch (this.$r8$classId) {
                    case 1:
                        this.this$1.checkPlayLoopImage();
                        super.onDraw(canvas);
                        break;
                    case 2:
                        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
                        ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.imageReceiver : this.imageReceiver;
                        if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
                            imageReceiver.getLottieAnimation().start();
                        }
                        super.onDraw(canvas);
                        break;
                    default:
                        super.onDraw(canvas);
                        break;
                }
            }

            @Override
            public void invalidate(int i, int i2, int i3, int i4) {
                switch (this.$r8$classId) {
                    case 0:
                        if (!HwEmojis.grabIfWeakDevice(this)) {
                            super.invalidate(i, i2, i3, i4);
                            break;
                        }
                        break;
                    case 1:
                        if (!HwEmojis.grabIfWeakDevice(this)) {
                            super.invalidate(i, i2, i3, i4);
                            break;
                        }
                        break;
                    default:
                        super.invalidate(i, i2, i3, i4);
                        break;
                }
            }

            @Override
            public void invalidate(Rect rect) {
                switch (this.$r8$classId) {
                    case 0:
                        ReactionHolderView reactionHolderView = this.this$1;
                        if (!HwEmojis.grabIfWeakDevice(this, ReactionsContainerLayout.this)) {
                            super.invalidate(rect);
                            ReactionsContainerLayout.this.invalidate();
                            break;
                        }
                        break;
                    default:
                        super.invalidate(rect);
                        break;
                }
            }
        }
    }
}
