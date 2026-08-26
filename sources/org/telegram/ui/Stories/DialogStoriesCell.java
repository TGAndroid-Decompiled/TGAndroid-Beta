package org.telegram.ui.Stories;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.ListAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarAnimatedSubtitleOverlayContainer;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda25;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stars.BalanceCloud$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda105;
import org.telegram.ui.Stars.SuperRipple$$ExternalSyntheticLambda7;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TON.TONIntroActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda48;
import org.telegram.ui.iv.RichMediaCell$$ExternalSyntheticLambda1;
import org.telegram.ui.web.HistoryFragment$1$$ExternalSyntheticLambda0;

public abstract class DialogStoriesCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    private static final int ANIMATOR_ID_HAS_TITLE_TEXT = 1;
    private static final float COLLAPSED_DIS = 16.0f;
    public static final float COLLAPSED_SIZE = 26.33f;
    private static final int COLLAPSED_STATE = 2;
    private static final int EXPANDED_STATE = 0;
    private static final int FAKE_TOP_PADDING = 4;
    public static final int HEIGHT_IN_DP = 81;
    private static final float ITEM_WIDTH = 70.0f;
    private static final int TRANSITION_STATE = 1;
    public static final int TYPE_ARCHIVE = 1;
    public static final int TYPE_DIALOGS = 0;
    public float K;
    private ActionBar actionBar;
    Adapter adapter;
    Paint addCirclePaint;
    private final Drawable addNewStoryDrawable;
    private int addNewStoryLastColor;
    ArrayList<Runnable> afterNextLayout;
    public boolean allowGlobalUpdates;
    ArrayList<Long> animateToDialogIds;
    private Runnable animationRunnable;
    private final BoolAnimator animatorHasTitleText;
    Paint backgroundPaint;
    private long checkedStoryNotificationDeletion;
    private int clipTop;
    boolean collapsed;
    private ValueAnimator collapsedOvershootAnimator;
    private float collapsedOvershootProgress;
    float collapsedProgress;
    private float collapsedProgress1;
    private float collapsedProgress2;
    private float collapsedSpringCoef;
    Comparator<StoryCell> comparator;
    int currentAccount;
    public int currentCellWidth;
    int currentState;
    private CharSequence currentTitle;
    boolean drawCircleForce;
    private LinearGradient ellipsizeGradient;
    private Matrix ellipsizeGradientMatrix;
    private Paint ellipsizePaint;
    EllipsizeSpanAnimator ellipsizeSpanAnimator;
    ImageView emojiStatusView;
    private ValueAnimator expandOvershootAnimator;
    private float expandOvershootAnimatorProgress;
    private float expandedSpringCoef;
    BaseFragment fragment;
    private StoriesUtilities.EnsureStoryFileLoadedObject globalCancelable;
    Paint grayPaint;
    private boolean hasOverlayText;
    DefaultItemAnimator itemAnimator;
    ArrayList<Item> items;
    private boolean lastUploadingCloseFriends;
    LinearLayoutManager layoutManager;
    RecyclerListView listViewMini;
    private float menuItemsOffset;
    Adapter miniAdapter;
    private final DefaultItemAnimator miniItemAnimator;
    ArrayList<Item> miniItems;
    CanvasButton miniItemsClickArea;
    ArrayList<Item> oldItems;
    ArrayList<Item> oldMiniItems;
    private float overScrollCoef;
    private int overlayTextId;
    private float overscrollProgress;
    private int overscrollSelectedPosition;
    private StoryCell overscrollSelectedView;
    private HintView2 premiumHint;
    private Drawable premiumStar;
    public RadialProgress radialProgress;
    public RecyclerListView recyclerListView;
    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusDrawable;
    AnimatorSet storiesAnimatorSet;
    private OvershootInterpolator storiesCollapseInterpolator;
    StoriesController storiesController;
    private OvershootInterpolator storiesExpandInterpolator;
    ActionBarAnimatedSubtitleOverlayContainer subtitleOverlayContainer;
    ImageView telegramLogoView;
    private ValueAnimator textAnimator;
    AnimatedTextView titleView;
    private final int type;
    boolean updateOnIdleState;
    private SpannableStringBuilder uploadingString;
    private ValueAnimator valueAnimator;
    ArrayList<StoryCell> viewsDrawInParent;
    private ValueAnimator yStoriesAnimator;
    private float yStoriesProgress;

    public final class AnonymousClass12 extends AnimatedEmojiDrawable.WrapSizeDrawable {
        @Override
        public final void draw(Canvas canvas) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f));
            super.draw(canvas);
            canvas.restore();
        }
    }

    public final class AnonymousClass9 extends DefaultItemAnimator {
        @Override
        public final float animateByScale(View view) {
            return 0.6f;
        }
    }

    public final class Adapter extends AdapterWithDiffUtils {
        public final boolean mini;

        public Adapter(boolean z) {
            this.mini = z;
        }

        @Override
        public final int getItemCount() {
            DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
            return (this.mini ? dialogStoriesCell.miniItems : dialogStoriesCell.items).size();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            StoryCell storyCell = (StoryCell) viewHolder.itemView;
            storyCell.position = i;
            DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
            if (this.mini) {
                storyCell.setDialogId(dialogStoriesCell.miniItems.get(i).dialogId);
            } else {
                storyCell.setDialogId(dialogStoriesCell.items.get(i).dialogId);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            StoryCell storyCell = DialogStoriesCell.this.new StoryCell(viewGroup.getContext());
            boolean z = this.mini;
            storyCell.mini = z;
            if (z) {
                storyCell.setProgressToCollapsed(1.0f, 1.0f, 0.0f, false);
            }
            return new RecyclerListView.Holder(storyCell);
        }
    }

    public final class Item extends AdapterWithDiffUtils.Item {
        public final long dialogId;

        public Item(long j) {
            super(0, false);
            this.dialogId = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Item) && this.dialogId == ((Item) obj).dialogId;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.dialogId));
        }
    }

    public DialogStoriesCell(Context context, BaseFragment baseFragment, int i, int i2) {
        super(context);
        this.animatorHasTitleText = new BoolAnimator(1, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
        this.oldItems = new ArrayList<>();
        this.oldMiniItems = new ArrayList<>();
        this.items = new ArrayList<>();
        this.miniItems = new ArrayList<>();
        this.adapter = new Adapter(false);
        this.miniAdapter = new Adapter(true);
        this.grayPaint = new Paint();
        this.addCirclePaint = new Paint(1);
        this.backgroundPaint = new Paint(1);
        this.miniItemsClickArea = new CanvasButton(this);
        this.collapsedProgress = -1.0f;
        this.currentState = -1;
        this.viewsDrawInParent = new ArrayList<>();
        this.animateToDialogIds = new ArrayList<>();
        this.afterNextLayout = new ArrayList<>();
        this.collapsedProgress1 = -1.0f;
        this.allowGlobalUpdates = true;
        this.overScrollCoef = 1.0f;
        this.collapsedSpringCoef = 0.95f;
        this.expandedSpringCoef = 0.9f;
        this.comparator = new CacheModel$$ExternalSyntheticLambda0(9);
        this.K = 0.3f;
        this.collapsedOvershootProgress = 1.0f;
        this.storiesExpandInterpolator = new OvershootInterpolator(this.expandedSpringCoef);
        this.storiesCollapseInterpolator = new OvershootInterpolator(this.collapsedSpringCoef);
        this.ellipsizeSpanAnimator = new EllipsizeSpanAnimator(this);
        this.type = i2;
        this.currentAccount = i;
        this.fragment = baseFragment;
        this.menuItemsOffset = AndroidUtilities.dp(68.0f);
        this.storiesController = MessagesController.getInstance(i).getStoriesController();
        LiveCommentsView.AnonymousClass1 anonymousClass1 = new LiveCommentsView.AnonymousClass1(this, context, 1);
        this.recyclerListView = anonymousClass1;
        anonymousClass1.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setClipChildren(false);
        this.miniItemsClickArea.setDelegate(new DialogStoriesCell$$ExternalSyntheticLambda8(this, 2));
        this.miniItemsClickArea.setLongPress(new DialogStoriesCell$$ExternalSyntheticLambda8(this, 3));
        this.recyclerListView.addOnScrollListener(new StarGiftSheet.AnonymousClass8(this, 15));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        this.itemAnimator = defaultItemAnimator;
        defaultItemAnimator.setDelayAnimations(false);
        this.itemAnimator.setDurations(150L);
        this.itemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.lambda$onCellEnter$52(this.itemAnimator);
        RecyclerListView recyclerListView = this.recyclerListView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        this.recyclerListView.setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 14));
        this.recyclerListView.setOnItemLongClickListener(new GiftSheet$$ExternalSyntheticLambda6(this, 25));
        this.recyclerListView.setAdapter(this.adapter);
        addView(this.recyclerListView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), true, true, false);
        this.titleView = animatedTextView;
        animatedTextView.setGravity(3);
        this.titleView.setTextColor(getTextLogoColor());
        this.titleView.setTypeface(AndroidUtilities.bold());
        this.titleView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.titleView.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.titleView.setImportantForAccessibility(1);
        this.titleView.setFocusableInTouchMode(true);
        addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f));
        ImageView imageView = new ImageView(context);
        this.telegramLogoView = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        this.telegramLogoView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.telegramLogoView.setImageResource(R.drawable.telegram_logo_2);
        this.telegramLogoView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        this.telegramLogoView.setImportantForAccessibility(1);
        this.telegramLogoView.setFocusableInTouchMode(true);
        addView(this.telegramLogoView, LayoutHelper.createFrame(90, 22.0f));
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(null, AndroidUtilities.dp(26.0f));
        this.statusDrawable = swapAnimatedEmojiDrawable;
        swapAnimatedEmojiDrawable.center = true;
        swapAnimatedEmojiDrawable.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.emojiStatusView = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        this.emojiStatusView.setImageDrawable(this.statusDrawable);
        addView(this.emojiStatusView, LayoutHelper.createFrame(40, 40.0f));
        ActionBar.AnonymousClass9 anonymousClass9 = new ActionBar.AnonymousClass9(this, context, this.ellipsizeSpanAnimator);
        this.subtitleOverlayContainer = anonymousClass9;
        addView(anonymousClass9, LayoutHelper.createFrame(-2, -2.0f));
        this.grayPaint.setColor(-2762018);
        this.grayPaint.setStyle(Paint.Style.STROKE);
        this.grayPaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.addNewStoryDrawable = getContext().getDrawable(R.drawable.msg_mini_addstory);
        LiveCommentsView.AnonymousClass1 anonymousClass2 = new LiveCommentsView.AnonymousClass1(this, getContext(), 2);
        this.listViewMini = anonymousClass2;
        getContext();
        anonymousClass2.setLayoutManager(new LinearLayoutManager(0, false));
        this.listViewMini.addItemDecoration(new FiltersView.AnonymousClass2(2));
        AnonymousClass9 anonymousClass10 = new AnonymousClass9();
        this.miniItemAnimator = anonymousClass10;
        anonymousClass10.setDelayAnimations(false);
        anonymousClass10.setSupportsChangeAnimations(false);
        this.listViewMini.lambda$onCellEnter$52(anonymousClass10);
        this.listViewMini.setAdapter(this.miniAdapter);
        this.listViewMini.setClipChildren(false);
        addView(this.listViewMini, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        checkUi_titleVisibility();
        updateItems(false, false);
    }

    public static Drawable access$1100(DialogStoriesCell dialogStoriesCell) {
        final Drawable drawableMutate = dialogStoriesCell.getContext().getDrawable(R.drawable.verified_area).mutate();
        final Drawable drawableMutate2 = dialogStoriesCell.getContext().getDrawable(R.drawable.verified_check).mutate();
        CombinedDrawable combinedDrawable = new CombinedDrawable(drawableMutate, drawableMutate2) {
            public int lastColor;

            @Override
            public final void draw(Canvas canvas) {
                DialogStoriesCell dialogStoriesCell2 = DialogStoriesCell.this;
                int themedColor$6 = dialogStoriesCell2.getThemedColor$6(dialogStoriesCell2.type == 0 ? Theme.key_actionBarDefault : Theme.key_actionBarDefaultArchived);
                if (this.lastColor != themedColor$6) {
                    this.lastColor = themedColor$6;
                    int iBlendARGB = ColorUtils.blendARGB(0.1f, dialogStoriesCell2.getThemedColor$6(dialogStoriesCell2.type == 0 ? Theme.key_actionBarDefaultTitle : Theme.key_actionBarDefaultArchivedTitle), themedColor$6);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(iBlendARGB, mode));
                    drawableMutate2.setColorFilter(new PorterDuffColorFilter(themedColor$6, mode));
                }
                super.draw(canvas);
            }
        };
        combinedDrawable.setFullsize(true);
        return combinedDrawable;
    }

    public static float getAvatarRight(int i, float f) {
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f) / 2.0f;
        return (fLerp * 2.0f) + AndroidUtilities.lerp((i / 2.0f) - fLerp, 0.0f, f);
    }

    public int getTextColor() {
        return this.type == 0 ? getThemedColor$6(Theme.key_actionBarDefaultTitle) : getThemedColor$6(Theme.key_actionBarDefaultArchivedTitle);
    }

    private int getTextLogoColor() {
        return getThemedColor$6(Theme.key_telegram_color_dialogsLogo);
    }

    public static int lambda$new$6(StoryCell storyCell, StoryCell storyCell2) {
        return storyCell2.position - storyCell.position;
    }

    public static void lambda$updateColors$12(int i, View view) {
        StoryCell storyCell = (StoryCell) view;
        storyCell.invalidate();
        storyCell.textView.setTextColor(i);
    }

    public static void lambda$updateCurrentState$16(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void afterNextLayout(Runnable runnable) {
        this.afterNextLayout.add(runnable);
    }

    public final void checkCollapsedProgress() {
        int i;
        this.collapsedProgress = 1.0f - AndroidUtilities.lerp(1.0f - this.collapsedProgress1, 1.0f, 1.0f - this.collapsedProgress2);
        checkUi_titleVisibility();
        float f = this.collapsedProgress;
        if (f == 1.0f) {
            i = 2;
        } else {
            i = f != 0.0f ? 1 : 0;
        }
        updateCurrentState(i);
        invalidate();
    }

    public final void checkLoadMore() {
        int iFindLastVisibleItemPosition;
        if (this.layoutManager.findLastVisibleItemPosition() + 10 > this.items.size() || ((iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition() + 9) < this.items.size() && this.storiesController.getUnreadState(0, this.items.get(iFindLastVisibleItemPosition).dialogId) == 0)) {
            boolean z = this.type == 1;
            StoriesController storiesController = this.storiesController;
            if (z) {
                if (!storiesController.hasMoreHidden) {
                    return;
                }
            } else if (!storiesController.hasMore) {
                return;
            }
            storiesController.loadFromServer(z);
        }
    }

    public final void checkUi_titleVisibility() {
        float fClamp = MathUtils.clamp(Math.min(this.collapsedProgress, this.collapsedProgress2), 0.0f, 1.0f);
        float f = this.animatorHasTitleText.floatValue;
        float f2 = 1.0f - f;
        float f3 = f * fClamp;
        float f4 = f2 * fClamp;
        AnimatedTextView animatedTextView = this.titleView;
        if (animatedTextView != null) {
            animatedTextView.setAlpha(f3);
            this.titleView.setVisibility(f3 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.telegramLogoView;
        if (imageView != null) {
            imageView.setAlpha(f4);
            this.telegramLogoView.setVisibility(f4 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.emojiStatusView;
        if (imageView2 != null) {
            imageView2.setAlpha(f4);
            this.emojiStatusView.setVisibility(f4 > 0.0f ? 0 : 8);
        }
        ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = this.subtitleOverlayContainer;
        if (actionBarAnimatedSubtitleOverlayContainer != null) {
            actionBarAnimatedSubtitleOverlayContainer.setAlpha(fClamp);
            this.subtitleOverlayContainer.setVisibility(fClamp > 0.0f ? 0 : 8);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesUpdated && this.allowGlobalUpdates) {
            updateItems(getVisibility() == 0, false);
            AndroidUtilities.runOnUIThread(new DialogStoriesCell$$ExternalSyntheticLambda8(this, 1));
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int childAdapterPosition;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        Canvas canvas2;
        boolean z;
        float f6;
        float f7;
        float fLerp;
        float f8;
        float fLerp2;
        float f9;
        float f10;
        float fLerp3;
        float f11;
        float fLerp4;
        float fLerp5;
        int i2;
        int i3;
        float fDp;
        boolean z2;
        boolean z3;
        boolean z4;
        float f12;
        int childAdapterPosition2;
        canvas.save();
        int i4 = this.clipTop;
        if (i4 > 0) {
            canvas.clipRect(0, i4, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(4.0f);
        float f13 = 0.0f;
        float fLerp6 = AndroidUtilities.lerp(0.0f, measuredHeight, this.collapsedProgress1);
        this.recyclerListView.setTranslationY(fLerp6);
        this.listViewMini.setTranslationY(fLerp6);
        this.listViewMini.setTranslationX(this.menuItemsOffset);
        for (int i5 = 0; i5 < this.viewsDrawInParent.size(); i5++) {
            this.viewsDrawInParent.get(i5).drawInParent = false;
        }
        this.viewsDrawInParent.clear();
        int i6 = this.currentState;
        int i7 = -1;
        if ((i6 == 1 || i6 == 0) && !this.animateToDialogIds.isEmpty()) {
            childAdapterPosition = -1;
            for (int i8 = 0; i8 < this.recyclerListView.getChildCount(); i8++) {
                StoryCell storyCell = (StoryCell) this.recyclerListView.getChildAt(i8);
                if (storyCell.dialogId == this.animateToDialogIds.get(0).longValue()) {
                    childAdapterPosition = this.recyclerListView.getChildAdapterPosition(storyCell);
                }
            }
        } else {
            childAdapterPosition = this.currentState == 2 ? 0 : -1;
        }
        int i9 = this.currentState;
        if (i9 < 0 || i9 == 2) {
            f = fLerp6;
            f2 = 4.0f;
            f3 = 16.0f;
            f4 = 2.0f;
            float f14 = 0.0f;
            for (int i10 = 0; i10 < this.listViewMini.getChildCount(); i10++) {
                StoryCell storyCell2 = (StoryCell) this.listViewMini.getChildAt(i10);
                float x = storyCell2.getX() + this.listViewMini.getX() + storyCell2.getMeasuredWidth();
                if (f14 == 0.0f || x > f14) {
                    f14 = x;
                }
            }
            f5 = f14;
        } else {
            if (childAdapterPosition == -1) {
                childAdapterPosition = this.layoutManager.findFirstCompletelyVisibleItemPosition();
                if (childAdapterPosition == -1) {
                    childAdapterPosition = this.layoutManager.findFirstVisibleItemPosition();
                }
                z = true;
            } else {
                z = false;
            }
            f2 = 4.0f;
            f3 = 16.0f;
            this.recyclerListView.setAlpha(1.0f - Utilities.clamp(this.collapsedProgress / this.K, 1.0f, 0.0f));
            this.overscrollSelectedPosition = -1;
            if (this.overscrollProgress != 0.0f) {
                int i11 = 0;
                int i12 = -1;
                while (i11 < this.recyclerListView.getChildCount()) {
                    View childAt = this.recyclerListView.getChildAt(i11);
                    if (childAt.getX() >= f13 && childAt.getX() + childAt.getMeasuredWidth() <= getMeasuredWidth() && (childAdapterPosition2 = this.recyclerListView.getChildAdapterPosition(childAt)) >= 0 && (i12 == i7 || childAdapterPosition2 < i12)) {
                        fLerp6 = fLerp6;
                        if (this.items.get(childAdapterPosition2).dialogId != UserConfig.getInstance(this.currentAccount).clientUserId) {
                            this.overscrollSelectedView = (StoryCell) childAt;
                            i12 = childAdapterPosition2;
                        }
                    }
                    i11++;
                    fLerp6 = fLerp6;
                    i7 = -1;
                    f13 = 0.0f;
                }
                f = fLerp6;
                f4 = 2.0f;
                this.overscrollSelectedPosition = i12;
            } else {
                f = fLerp6;
                f4 = 2.0f;
            }
            float f15 = 0.0f;
            int i13 = 0;
            while (i13 < this.recyclerListView.getChildCount()) {
                StoryCell storyCell3 = (StoryCell) this.recyclerListView.getChildAt(i13);
                storyCell3.setClipInParent(false);
                int childAdapterPosition3 = this.recyclerListView.getChildAdapterPosition(storyCell3);
                float fPow = this.collapsedProgress;
                if (childAdapterPosition3 >= childAdapterPosition && childAdapterPosition3 < this.animateToDialogIds.size() + childAdapterPosition) {
                    int i14 = childAdapterPosition3 - childAdapterPosition;
                    fPow = i14 == childAdapterPosition + 2 ? this.collapsedProgress : (float) (i14 == childAdapterPosition + 1 ? Math.pow(this.collapsedProgress, 0.5d) : Math.pow(this.collapsedProgress, 0.25d));
                }
                if (childAdapterPosition3 < childAdapterPosition) {
                    fPow = (float) Math.pow(this.collapsedProgress, 0.25d);
                }
                storyCell3.setProgressToCollapsed(fPow, this.collapsedProgress2, this.overscrollProgress, this.overscrollSelectedPosition == storyCell3.position);
                StoriesUtilities.AvatarStoryParams avatarStoryParams = storyCell3.params;
                if (childAdapterPosition3 <= childAdapterPosition || childAdapterPosition3 >= this.animateToDialogIds.size() + childAdapterPosition) {
                    z = z;
                    f15 = f15;
                    f6 = 0.0f;
                    avatarStoryParams.rightTopAngleToExclude = 0.0f;
                    avatarStoryParams.rightBottomAngleToExclude = 0.0f;
                    avatarStoryParams.leftTopAngleToExclude = 0.0f;
                    avatarStoryParams.leftBottomAngleToExclude = 0.0f;
                    avatarStoryParams.useArcProgress = false;
                } else {
                    StoryCell storyCell4 = (StoryCell) this.recyclerListView.getChildAt(i13 - 1);
                    if (storyCell4 != null) {
                        float fDp2 = AndroidUtilities.dp(48.0f);
                        float fDp3 = AndroidUtilities.dp(26.33f);
                        float fLerp7 = AndroidUtilities.lerp(fDp2, fDp3, storyCell4.progressToCollapsed) + AndroidUtilities.dp(8.0f);
                        float fLerp8 = (AndroidUtilities.lerp(fDp2, fDp3, storyCell3.progressToCollapsed) + AndroidUtilities.dp(8.0f)) / f4;
                        StoriesUtilities.AvatarStoryParams avatarStoryParams2 = storyCell4.params;
                        float x2 = storyCell4.getX() + avatarStoryParams2.originalAvatarRect.centerX();
                        float y = storyCell4.getY() + avatarStoryParams2.originalAvatarRect.centerY();
                        float x3 = (storyCell3.getX() + avatarStoryParams.originalAvatarRect.centerX()) - x2;
                        float y2 = (storyCell3.getY() + avatarStoryParams.originalAvatarRect.centerY()) - y;
                        float fSqrt = (float) Math.sqrt((y2 * y2) + (x3 * x3));
                        float f16 = (fLerp7 / f4) + fLerp8;
                        if (fSqrt < f16) {
                            float degrees = (float) Math.toDegrees(Math.acos(fSqrt / f16) * 2.0d);
                            float degrees2 = (float) Math.toDegrees(Math.atan2(y2, x3));
                            float f17 = degrees / f4;
                            avatarStoryParams2.rightTopAngleToExclude = degrees2 - f17;
                            avatarStoryParams2.rightBottomAngleToExclude = degrees2 + f17;
                            float degrees3 = (float) Math.toDegrees(Math.atan2(-y2, -x3));
                            float f18 = -Math.abs(degrees3 - f17);
                            float fAbs = Math.abs(degrees3 + f17);
                            avatarStoryParams.leftTopAngleToExclude = f18;
                            avatarStoryParams.leftBottomAngleToExclude = fAbs;
                            f6 = 0.0f;
                        } else {
                            f6 = 0.0f;
                            avatarStoryParams2.rightTopAngleToExclude = 0.0f;
                            avatarStoryParams2.rightBottomAngleToExclude = 0.0f;
                            avatarStoryParams.leftTopAngleToExclude = 0.0f;
                            avatarStoryParams.leftBottomAngleToExclude = 0.0f;
                        }
                        avatarStoryParams2.useArcProgress = false;
                        avatarStoryParams.useArcProgress = false;
                    } else {
                        z = z;
                        f15 = f15;
                        f6 = 0.0f;
                    }
                }
                float fClamp = Utilities.clamp((this.overscrollProgress - 0.5f) / 0.5f, 1.0f, f6);
                float fDp4 = AndroidUtilities.dp(16.0f) * fClamp;
                float f19 = (float) (((double) ((1.0f - fClamp) * 0.5f)) + 0.5d);
                if (childAdapterPosition3 <= childAdapterPosition) {
                    f7 = 0.0f;
                    fLerp = 0.0f;
                } else if (childAdapterPosition3 == childAdapterPosition + 1) {
                    fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), 0.0f, this.collapsedProgress) + ((AndroidUtilities.dp(16.0f) * fPow) - AndroidUtilities.dpf2(0.5f));
                    f7 = 0.0f;
                } else {
                    float fDp5 = ((AndroidUtilities.dp(16.0f) * fPow) + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dpf2(0.5f);
                    f7 = 0.0f;
                    fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), 0.0f, this.collapsedProgress) + fDp5;
                }
                float f20 = fLerp + this.menuItemsOffset;
                if (this.collapsed) {
                    f8 = 0.0f;
                    fLerp2 = AndroidUtilities.lerp(0.0f, f20 - storyCell3.getLeft(), this.storiesCollapseInterpolator.getInterpolation(this.collapsedOvershootProgress));
                } else {
                    if (this.overscrollProgress <= f7) {
                        f12 = 0.0f;
                    } else {
                        int i15 = storyCell3.position;
                        int i16 = this.overscrollSelectedPosition;
                        if (i15 < i16) {
                            f12 = -fDp4;
                        } else if (i15 > i16) {
                            f12 = fDp4;
                        } else {
                            f12 = 0.0f;
                        }
                    }
                    fLerp2 = AndroidUtilities.lerp(f20 - storyCell3.getLeft(), f12, 1.0f - this.expandOvershootAnimatorProgress);
                    f8 = 0.0f;
                }
                float fClamp2 = MathUtils.clamp((this.collapsedProgress1 - 0.2f) / 0.1f, f8, 1.0f);
                int i17 = childAdapterPosition3 - childAdapterPosition;
                if (i17 == 0) {
                    f9 = 0.65f;
                    fLerp3 = AndroidUtilities.lerp(f8, f - measuredHeight, CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.collapsedProgress));
                } else {
                    f9 = 0.65f;
                    if (i17 == 1) {
                        fLerp3 = AndroidUtilities.lerp(f8, (f - measuredHeight) * 0.65f, CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.collapsedProgress));
                    } else {
                        f10 = 0.0f;
                    }
                    if (storyCell3.position == this.overscrollSelectedPosition || this.overscrollProgress <= f8) {
                        f11 = 0.0f;
                    } else {
                        f11 = (-fDp4) / f4;
                    }
                    if (i17 == 0) {
                        fLerp4 = AndroidUtilities.lerp(f11, f - measuredHeight, this.yStoriesProgress);
                    } else if (i17 == 1) {
                        fLerp4 = AndroidUtilities.lerp(f11, (f - measuredHeight) * f9, this.yStoriesProgress);
                    } else {
                        fLerp4 = 0.0f;
                    }
                    fLerp5 = AndroidUtilities.lerp(fLerp4, f10, fClamp2);
                    if (this.collapsedProgress > 0.0f) {
                        if (childAdapterPosition3 >= childAdapterPosition || childAdapterPosition3 > childAdapterPosition + 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z || i17 < 0 || i17 >= this.animateToDialogIds.size()) {
                            storyCell3.setCrossfadeTo(-1L);
                        } else {
                            storyCell3.setCrossfadeTo(this.animateToDialogIds.get(i17).longValue());
                        }
                        storyCell3.drawInParent = z2;
                        if (childAdapterPosition3 == childAdapterPosition) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        storyCell3.isFirst = z3;
                        if (childAdapterPosition3 >= (this.animateToDialogIds.size() + childAdapterPosition) - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        storyCell3.isLast = z4;
                        storyCell3.setTranslationX(fLerp2);
                        storyCell3.setTranslationY(fLerp5);
                        if (z2) {
                            this.viewsDrawInParent.add(storyCell3);
                        }
                    } else if (this.recyclerListView.getItemAnimator() != null || !this.recyclerListView.getItemAnimator().isRunning()) {
                        if (this.overscrollProgress > 0.0f) {
                            i2 = storyCell3.position;
                            i3 = this.overscrollSelectedPosition;
                            if (i2 < i3 && i2 <= i3) {
                                storyCell3.setAlpha(1.0f);
                            } else {
                                storyCell3.setAlpha(f19);
                            }
                        } else {
                            storyCell3.setAlpha(1.0f);
                        }
                        storyCell3.setTranslationX(fLerp2);
                        storyCell3.setTranslationY(fLerp5);
                    }
                    if (storyCell3.drawInParent) {
                        fDp = (AndroidUtilities.dp(70.0f) / f4) + (storyCell3.getMeasuredWidth() / f4) + storyCell3.getX() + this.recyclerListView.getX();
                        if (f15 != 0.0f || fDp > f15) {
                            f15 = fDp;
                        } else {
                            f15 = f15;
                        }
                    } else {
                        f15 = f15;
                    }
                    i13++;
                    z = z;
                    measuredHeight = measuredHeight;
                }
                f10 = fLerp3;
                if (storyCell3.position == this.overscrollSelectedPosition) {
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                }
                if (i17 == 0) {
                    fLerp4 = AndroidUtilities.lerp(f11, f - measuredHeight, this.yStoriesProgress);
                } else if (i17 == 1) {
                    fLerp4 = AndroidUtilities.lerp(f11, (f - measuredHeight) * f9, this.yStoriesProgress);
                } else {
                    fLerp4 = 0.0f;
                }
                fLerp5 = AndroidUtilities.lerp(fLerp4, f10, fClamp2);
                if (this.collapsedProgress > 0.0f) {
                    if (childAdapterPosition3 >= childAdapterPosition) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        storyCell3.setCrossfadeTo(-1L);
                    } else {
                        storyCell3.setCrossfadeTo(-1L);
                    }
                    storyCell3.drawInParent = z2;
                    if (childAdapterPosition3 == childAdapterPosition) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    storyCell3.isFirst = z3;
                    if (childAdapterPosition3 >= (this.animateToDialogIds.size() + childAdapterPosition) - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    storyCell3.isLast = z4;
                    storyCell3.setTranslationX(fLerp2);
                    storyCell3.setTranslationY(fLerp5);
                    if (z2) {
                        this.viewsDrawInParent.add(storyCell3);
                    }
                } else if (this.recyclerListView.getItemAnimator() != null) {
                    if (this.overscrollProgress > 0.0f) {
                        i2 = storyCell3.position;
                        i3 = this.overscrollSelectedPosition;
                        if (i2 < i3) {
                            storyCell3.setAlpha(f19);
                        } else {
                            storyCell3.setAlpha(1.0f);
                        }
                    } else {
                        storyCell3.setAlpha(1.0f);
                    }
                    storyCell3.setTranslationX(fLerp2);
                    storyCell3.setTranslationY(fLerp5);
                } else {
                    if (this.overscrollProgress > 0.0f) {
                        i2 = storyCell3.position;
                        i3 = this.overscrollSelectedPosition;
                        if (i2 < i3) {
                            storyCell3.setAlpha(f19);
                        } else {
                            storyCell3.setAlpha(1.0f);
                        }
                    } else {
                        storyCell3.setAlpha(1.0f);
                    }
                    storyCell3.setTranslationX(fLerp2);
                    storyCell3.setTranslationY(fLerp5);
                }
                if (storyCell3.drawInParent) {
                    fDp = (AndroidUtilities.dp(70.0f) / f4) + (storyCell3.getMeasuredWidth() / f4) + storyCell3.getX() + this.recyclerListView.getX();
                    if (f15 != 0.0f) {
                    }
                    f15 = fDp;
                } else {
                    f15 = f15;
                }
                i13++;
                z = z;
                measuredHeight = measuredHeight;
            }
            f5 = f15;
        }
        if (this.premiumHint != null) {
            float fLerp9 = AndroidUtilities.lerp(29, 74, CubicBezierInterpolator.EASE_OUT.getInterpolation(this.collapsedProgress));
            if (this.recyclerListView.getChildCount() > 0) {
                i = 0;
                fLerp9 += this.recyclerListView.getChildAt(0).getLeft();
            } else {
                i = 0;
            }
            this.premiumHint.setJoint(0.0f, fLerp9);
        } else {
            i = 0;
        }
        float fMin = Math.min(this.collapsedProgress, this.collapsedProgress2);
        float visibleItemsMeasuredWidthWithAlpha = (this.actionBar.menu.getVisibleItemsMeasuredWidthWithAlpha() * fMin) - AndroidUtilities.dp(6.0f);
        boolean z5 = fMin != 0.0f && visibleItemsMeasuredWidthWithAlpha > 0.0f;
        if (z5) {
            float width = getWidth() - visibleItemsMeasuredWidthWithAlpha;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, width, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (fMin != 0.0f) {
            float totalVisibility = this.subtitleOverlayContainer.getTotalVisibility() * (-AndroidUtilities.dp(10.0f));
            float measuredHeight2 = (this.titleView.getMeasuredHeight() - this.titleView.getTextHeight()) / f4;
            this.titleView.setPivotX(0.0f);
            this.titleView.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.subtitleOverlayContainer.getTotalVisibility()));
            this.titleView.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.subtitleOverlayContainer.getTotalVisibility()));
            this.titleView.setTranslationY((((f + AndroidUtilities.dp(14.0f)) - measuredHeight2) + AndroidUtilities.dp(f2)) - (this.subtitleOverlayContainer.getTotalVisibility() * AndroidUtilities.dp(6.0f)));
            int iDp = AndroidUtilities.dp(72.0f);
            float avatarRight = getAvatarRight(iDp, this.collapsedProgress) + (-iDp) + AndroidUtilities.dp(12.0f) + f5;
            this.titleView.setTranslationX(avatarRight);
            this.titleView.getDrawable().setRightPadding((this.actionBar.menu.getVisibleItemsMeasuredWidthWithAlpha() * fMin) + (avatarRight - AndroidUtilities.dp(12.0f)));
            this.telegramLogoView.setTranslationX(this.titleView.getTranslationX() + AndroidUtilities.dp(1.0f));
            this.telegramLogoView.setTranslationY(f + AndroidUtilities.dp(22.333f) + totalVisibility);
            this.emojiStatusView.setTranslationX((this.titleView.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + this.telegramLogoView.getMeasuredWidth());
            this.emojiStatusView.setTranslationY(f + AndroidUtilities.dp(11.333f) + totalVisibility);
            this.subtitleOverlayContainer.setTranslationX(this.titleView.getTranslationX());
            this.subtitleOverlayContainer.setTranslationY(f + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i18 = this.currentState;
        if (i18 >= 0 && i18 != 2) {
            Collections.sort(this.viewsDrawInParent, this.comparator);
            while (i < this.viewsDrawInParent.size()) {
                StoryCell storyCell5 = this.viewsDrawInParent.get(i);
                canvas2.save();
                canvas2.translate(storyCell5.getX() + this.recyclerListView.getX(), storyCell5.getY() + this.recyclerListView.getY());
                storyCell5.draw(canvas2);
                canvas2.restore();
                i++;
            }
        }
        if (z5) {
            float fDp6 = AndroidUtilities.dp(f3);
            if (this.ellipsizeGradient == null) {
                this.ellipsizeGradient = new LinearGradient(0.0f, 0.0f, fDp6, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.ellipsizeGradientMatrix = new Matrix();
                Paint paint = new Paint(1);
                this.ellipsizePaint = paint;
                paint.setShader(this.ellipsizeGradient);
                this.ellipsizePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            this.ellipsizeGradientMatrix.reset();
            this.ellipsizeGradientMatrix.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - fDp6, 0.0f);
            this.ellipsizeGradient.setLocalMatrix(this.ellipsizeGradientMatrix);
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - fDp6, 0.0f, AndroidUtilities.dp(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.ellipsizePaint);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public StoryCell findStoryCell(long j) {
        RecyclerListView recyclerListView = this.recyclerListView;
        if (this.currentState == 2) {
            recyclerListView = this.listViewMini;
        }
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            View childAt = recyclerListView.getChildAt(i);
            if (childAt instanceof StoryCell) {
                StoryCell storyCell = (StoryCell) childAt;
                if (storyCell.dialogId == j) {
                    return storyCell;
                }
            }
        }
        return null;
    }

    public float getCollapsedProgress() {
        return this.collapsedProgress;
    }

    public float getOverScrollCoef() {
        return this.overScrollCoef;
    }

    public HintView2 getPremiumHint() {
        return this.premiumHint;
    }

    public final int getThemedColor$6(int i) {
        BaseFragment baseFragment = this.fragment;
        return (baseFragment == null || baseFragment.getResourceProvider() == null) ? Theme.getColor(null, i, false) : this.fragment.getThemedColor(i);
    }

    public boolean isExpanded() {
        int i = this.currentState;
        return i == 0 || i == 1;
    }

    public boolean isFullExpanded() {
        return this.currentState == 0;
    }

    public final void lambda$makePremiumHint$17() {
        HintView2 hintView2 = this.premiumHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        this.fragment.presentFragment(new PremiumPreviewFragment("stories"));
    }

    public final void lambda$new$0$8() {
    }

    public final void lambda$new$1$3(View view, int i) {
        openStoryForCell((StoryCell) view, false);
    }

    public final boolean lambda$new$2(View view, int i) {
        if (this.collapsedProgress != 0.0f || this.overscrollProgress != 0.0f) {
            return false;
        }
        onUserLongPressed(view, ((StoryCell) view).dialogId);
        return false;
    }

    public final void lambda$openStoryForCell$3(long j) {
        this.storiesController.setLoading(j, false);
    }

    public final void lambda$openStoryForCell$4(boolean z, boolean z2) {
        if (!z && z2) {
            boolean z3 = this.type == 1;
            StoriesController storiesController = this.storiesController;
            if (z3) {
                if (!storiesController.hasMoreHidden) {
                    return;
                }
            } else if (!storiesController.hasMore) {
                return;
            }
            storiesController.loadFromServer(z3);
        }
    }

    public final void lambda$openStoryForCell$5(StoryCell storyCell, long j) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        int size = storyCell.position;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            if (i2 >= this.items.size()) {
                z = true;
                break;
            }
            long j2 = this.items.get(i2).dialogId;
            if (j2 != UserConfig.getInstance(this.currentAccount).clientUserId && this.storiesController.hasUnreadStories(j2)) {
                z = false;
                break;
            }
            i2++;
        }
        if (!storyCell.isSelf || (z && this.items.size() != 1)) {
            if (storyCell.isSelf || !this.storiesController.hasUnreadStories(storyCell.dialogId)) {
                for (int i3 = 0; i3 < this.items.size(); i3++) {
                    if (this.storiesController.hasStories(this.items.get(i3).dialogId)) {
                        arrayList.add(Long.valueOf(this.items.get(i3).dialogId));
                    } else if (i3 <= size) {
                        size--;
                    }
                }
                i = size;
                z2 = false;
            } else {
                for (int i4 = 0; i4 < this.items.size(); i4++) {
                    long j3 = this.items.get(i4).dialogId;
                    if (!storyCell.isSelf && this.storiesController.hasUnreadStories(j3)) {
                        arrayList.add(Long.valueOf(j3));
                    }
                    if (j3 == storyCell.dialogId) {
                        size = arrayList.size() - 1;
                    }
                }
                i = size;
                z2 = false;
                z3 = true;
            }
            StoryViewer orCreateStoryViewer = this.fragment.getOrCreateStoryViewer();
            orCreateStoryViewer.doOnAnimationReadyRunnables.add(new RichEditor$$ExternalSyntheticLambda48(this, j, 12));
            Context context = getContext();
            StoriesListPlaceProvider storiesListPlaceProvider = new StoriesListPlaceProvider(this.recyclerListView, false);
            storiesListPlaceProvider.loadNextInterface = new ChatMessageCell$$ExternalSyntheticLambda25(this, z2);
            storiesListPlaceProvider.hiddedStories = this.type == 1;
            storiesListPlaceProvider.onlyUnreadStories = z3;
            storiesListPlaceProvider.onlySelfStories = z2;
            storiesListPlaceProvider.hasPaginationParams = true;
            orCreateStoryViewer.open(UserConfig.selectedAccount, context, null, arrayList, i, null, null, storiesListPlaceProvider, false);
        }
        arrayList.add(Long.valueOf(storyCell.dialogId));
        i = size;
        z2 = true;
        z3 = false;
        StoryViewer orCreateStoryViewer2 = this.fragment.getOrCreateStoryViewer();
        orCreateStoryViewer2.doOnAnimationReadyRunnables.add(new RichEditor$$ExternalSyntheticLambda48(this, j, 12));
        Context context2 = getContext();
        StoriesListPlaceProvider storiesListPlaceProvider2 = new StoriesListPlaceProvider(this.recyclerListView, false);
        storiesListPlaceProvider2.loadNextInterface = new ChatMessageCell$$ExternalSyntheticLambda25(this, z2);
        storiesListPlaceProvider2.hiddedStories = this.type == 1;
        storiesListPlaceProvider2.onlyUnreadStories = z3;
        storiesListPlaceProvider2.onlySelfStories = z2;
        storiesListPlaceProvider2.hasPaginationParams = true;
        orCreateStoryViewer2.open(UserConfig.selectedAccount, context2, null, arrayList, i, null, null, storiesListPlaceProvider2, false);
    }

    public final void lambda$openStoryRecorder$14(AlertDialog alertDialog, long j, StoryCell storyCell, Boolean bool) {
        alertDialog.dismiss();
        if (bool.booleanValue()) {
            StoryRecorder storyRecorder = StoryRecorder.getInstance(this.fragment.getParentActivity(), this.currentAccount);
            storyRecorder.selectedDialogId = j;
            StoryRecorder.AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
            if (anonymousClass8 != null) {
                anonymousClass8.setDialogId(j);
            }
            storyRecorder.canChangePeer = false;
            storyRecorder.open(StoryRecorder.SourceView.fromStoryCell(storyCell));
        }
    }

    public final void lambda$setProgressToCollapse$10(ValueAnimator valueAnimator) {
        this.expandOvershootAnimatorProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final void lambda$setProgressToCollapse$7(ValueAnimator valueAnimator) {
        this.collapsedProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        checkCollapsedProgress();
    }

    public final void lambda$setProgressToCollapse$8(ValueAnimator valueAnimator) {
        this.yStoriesProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public final void lambda$setProgressToCollapse$9(ValueAnimator valueAnimator) {
        this.collapsedOvershootProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public final void lambda$updateCurrentState$15() {
        updateItems(true, false);
    }

    public final void makePremiumHint() {
        if (this.premiumHint != null) {
            return;
        }
        this.premiumHint = new HintView2(getContext(), 1).setBgColor(getThemedColor$6(Theme.key_undo_background)).setMultilineText(true).setTextAlign(Layout.Alignment.ALIGN_CENTER).setJoint(0.0f, 29.0f);
        SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), Theme.key_undo_cancelColor, 0, new DialogStoriesCell$$ExternalSyntheticLambda8(this, 0));
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilderReplaceSingleTag.getSpans(0, spannableStringBuilderReplaceSingleTag.length(), ClickableSpan.class);
        if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
            spannableStringBuilderReplaceSingleTag.setSpan(new TypefaceSpan(AndroidUtilities.bold()), spannableStringBuilderReplaceSingleTag.getSpanStart(clickableSpanArr[0]), spannableStringBuilderReplaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
        }
        HintView2 hintView2 = this.premiumHint;
        hintView2.setMaxWidthPx(HintView2.cutInFancyHalf(spannableStringBuilderReplaceSingleTag, hintView2.getTextPaint()));
        this.premiumHint.setText(spannableStringBuilderReplaceSingleTag);
        this.premiumHint.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
        if (getParent() instanceof FrameLayout) {
            ((FrameLayout) getParent()).addView(this.premiumHint, LayoutHelper.createFrame(-1, 150, 51));
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateItems(false, false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        this.ellipsizeSpanAnimator.onAttachedToWindow();
        this.statusDrawable.attach();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        this.ellipsizeSpanAnimator.onDetachedFromWindow();
        StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.globalCancelable;
        if (ensureStoryFileLoadedObject != null) {
            ensureStoryFileLoadedObject.cancelled = true;
            ensureStoryFileLoadedObject.storiesController.setLoading(ensureStoryFileLoadedObject.dialogId, false);
            this.globalCancelable = null;
        }
        this.statusDrawable.detach();
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 1) {
            checkUi_titleVisibility();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        this.titleView.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.currentCellWidth = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), 1073741824));
    }

    public abstract void onMiniListClicked();

    public void onResume() {
        StoriesController storiesController = this.storiesController;
        storiesController.checkExpireStories(storiesController.dialogListStories);
        storiesController.checkExpireStories(storiesController.hiddenListStories);
        for (int i = 0; i < this.items.size(); i++) {
            StoriesController storiesController2 = this.storiesController;
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController2.allStoriesMap.get(this.items.get(i).dialogId);
            if (peerStories != null) {
                this.storiesController.preloadUserStories(peerStories);
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.currentState == 2) {
            int size = this.miniItems.size();
            this.miniItemsClickArea.setRect((int) this.listViewMini.getX(), (int) this.listViewMini.getY(), (int) (this.listViewMini.getX() + AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f))), (int) (this.listViewMini.getY() + this.listViewMini.getHeight()));
            if (this.miniItemsClickArea.checkTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public abstract void onUserLongPressed(View view, long j);

    public boolean openOverscrollSelectedStory() {
        ValueAnimator valueAnimator = this.expandOvershootAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return false;
        }
        openStoryForCell(this.overscrollSelectedView, true);
        return true;
    }

    public void openSelfStories() {
        if (this.storiesController.hasSelfStories()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.currentAccount).clientUserId));
            this.fragment.getOrCreateStoryViewer().open(UserConfig.selectedAccount, getContext(), null, arrayList, 0, null, null, new StoriesListPlaceProvider(this.listViewMini, false), false);
        }
    }

    public void openStoryForCell(StoryCell storyCell) {
        openStoryForCell(storyCell, false);
    }

    public void openStoryRecorder() {
        openStoryRecorder(0L);
    }

    public float overscrollProgress() {
        return this.overscrollProgress;
    }

    public boolean scrollTo(long j) {
        int i = 0;
        while (true) {
            if (i >= this.items.size()) {
                i = -1;
                break;
            }
            if (this.items.get(i).dialogId == j) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            if (i < this.layoutManager.findFirstCompletelyVisibleItemPosition()) {
                this.layoutManager.scrollToPositionWithOffset(i, 0);
                return true;
            }
            if (i > this.layoutManager.findLastCompletelyVisibleItemPosition()) {
                this.layoutManager.scrollToPositionWithOffset(i, 0, true);
                return true;
            }
        }
        return false;
    }

    public boolean scrollToFirst() {
        if (this.layoutManager.findFirstVisibleItemPosition() == 0) {
            return false;
        }
        this.recyclerListView.smoothScrollToPosition(0);
        return true;
    }

    public void scrollToFirstCell() {
        this.layoutManager.scrollToPositionWithOffset(0, 0);
    }

    public void setActionBar(ActionBar actionBar) {
        this.actionBar = actionBar;
    }

    public void setClipTop(int i) {
        if (i < 0) {
            i = 0;
        }
        if (this.clipTop != i) {
            this.clipTop = i;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f) {
        this.menuItemsOffset = f;
    }

    public void setOverscroll(float f) {
        this.overscrollProgress = f / AndroidUtilities.dp(90.0f);
        invalidate();
        this.recyclerListView.invalidate();
    }

    public void setProgressToCollapse(float f) {
        setProgressToCollapse(f, true);
    }

    public void setTitleOverlayText(String str, int i) {
        this.subtitleOverlayContainer.setText(i == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null, true);
        if (str != null) {
            this.hasOverlayText = true;
            if (this.overlayTextId != i) {
                this.overlayTextId = i;
                this.titleView.setText(LocaleController.getString(str, i), !LocaleController.isRTL);
            }
        } else {
            this.hasOverlayText = false;
            this.overlayTextId = 0;
            this.titleView.setText(this.currentTitle, !LocaleController.isRTL);
        }
        this.animatorHasTitleText.setValue(this.hasOverlayText, true);
        this.ellipsizeSpanAnimator.removeView(this.titleView);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        HintView2 hintView2 = this.premiumHint;
        if (hintView2 != null) {
            hintView2.setTranslationY(f);
        }
    }

    public void showPremiumHint() {
        makePremiumHint();
        HintView2 hintView2 = this.premiumHint;
        if (hintView2 != null) {
            if (hintView2.shown()) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
            this.premiumHint.show();
        }
    }

    public void updateColors() {
        GradientTools gradientTools = StoriesUtilities.closeFriendsGradientTools;
        int i = 0;
        if (gradientTools != null) {
            gradientTools.setColors(Theme.getColor(null, Theme.key_stories_circle_closeFriends1, false), Theme.getColor(null, Theme.key_stories_circle_closeFriends2, false));
        }
        GradientTools gradientTools2 = StoriesUtilities.liveGradientTools;
        if (gradientTools2 != null) {
            gradientTools2.setColors(Theme.getColor(null, Theme.key_stories_circle_live1, false), Theme.getColor(null, Theme.key_stories_circle_live2, false));
        }
        GradientTools[] gradientToolsArr = StoriesUtilities.storiesGradientTools;
        GradientTools gradientTools3 = gradientToolsArr[0];
        if (gradientTools3 != null) {
            gradientTools3.setColors(Theme.getColor(null, Theme.key_stories_circle_dialog1, false), Theme.getColor(null, Theme.key_stories_circle_dialog2, false));
        }
        GradientTools gradientTools4 = gradientToolsArr[1];
        if (gradientTools4 != null) {
            gradientTools4.setColors(Theme.getColor(null, Theme.key_stories_circle1, false), Theme.getColor(null, Theme.key_stories_circle2, false));
        }
        if (StoriesUtilities.errorGradientTools != null) {
            int color = Theme.getColor(null, Theme.key_color_orange, false);
            int color2 = Theme.getColor(null, Theme.key_text_RedBold, false);
            StoriesUtilities.errorGradientTools.setColors(ColorUtils.blendARGB(0.25f, color, color2), color2);
        }
        final int textColor = getTextColor();
        this.titleView.setTextColor(getTextLogoColor());
        ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = this.subtitleOverlayContainer;
        if (actionBarAnimatedSubtitleOverlayContainer != null) {
            ArrayList arrayList = actionBarAnimatedSubtitleOverlayContainer.titleOverlayAnimator.list.entries;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ListAnimator.Entry entry = (ListAnimator.Entry) obj;
                ActionBarAnimatedSubtitleOverlayContainer.SimpleTextViewReplaceable simpleTextViewReplaceable = (ActionBarAnimatedSubtitleOverlayContainer.SimpleTextViewReplaceable) entry.item;
                int i2 = Theme.key_telegram_color_dialogsLogo;
                Theme.ResourcesProvider resourcesProvider = actionBarAnimatedSubtitleOverlayContainer.resourcesProvider;
                simpleTextViewReplaceable.setTextColor(Theme.getColor(i2, resourcesProvider));
                ((ActionBarAnimatedSubtitleOverlayContainer.SimpleTextViewReplaceable) entry.item).setLinkTextColor(Theme.getColor(i2, resourcesProvider));
            }
        }
        this.telegramLogoView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, new Consumer() {
            @Override
            public final void accept(Object obj2) {
                DialogStoriesCell.lambda$updateColors$12(textColor, (View) obj2);
            }
        });
        AndroidUtilities.forEachViews((RecyclerView) this.listViewMini, (Consumer) new HistoryFragment$1$$ExternalSyntheticLambda0(5));
    }

    public final void updateCurrentState(int i) {
        if (this.currentState == i) {
            return;
        }
        this.currentState = i;
        if (i != 1 && this.updateOnIdleState) {
            AndroidUtilities.runOnUIThread(new DialogStoriesCell$$ExternalSyntheticLambda8(this, 4));
        }
        int i2 = this.currentState;
        if (i2 == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, (Consumer) new HistoryFragment$1$$ExternalSyntheticLambda0(6));
            this.listViewMini.setVisibility(4);
            this.recyclerListView.setVisibility(0);
            if (System.currentTimeMillis() >= this.checkedStoryNotificationDeletion) {
                this.checkedStoryNotificationDeletion = System.currentTimeMillis() + 60000;
            }
        } else if (i2 == 1) {
            this.animateToDialogIds.clear();
            for (int i3 = 0; i3 < this.items.size(); i3++) {
                if (this.items.get(i3).dialogId != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    this.animateToDialogIds.add(Long.valueOf(this.items.get(i3).dialogId));
                    if (this.animateToDialogIds.size() == 3) {
                        break;
                        break;
                    }
                } else {
                    if (this.storiesController.hasUnreadStories(UserConfig.getInstance(this.currentAccount).clientUserId) || (this.storiesController.hasSelfStories() && this.storiesController.dialogListStories.size() <= 3)) {
                        this.animateToDialogIds.add(Long.valueOf(this.items.get(i3).dialogId));
                        if (this.animateToDialogIds.size() == 3) {
                            break;
                        }
                    }
                }
            }
            this.listViewMini.setVisibility(4);
            this.recyclerListView.setVisibility(0);
        } else if (i2 == 2) {
            this.listViewMini.setVisibility(0);
            this.recyclerListView.setVisibility(4);
            this.layoutManager.scrollToPositionWithOffset(0, 0);
            StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
            AndroidUtilities.cancelRunOnUIThread(storiesController.sortStoriesRunnable);
            storiesController.sortStoriesRunnable.run();
            StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.globalCancelable;
            if (ensureStoryFileLoadedObject != null) {
                ensureStoryFileLoadedObject.cancelled = true;
                ensureStoryFileLoadedObject.storiesController.setLoading(ensureStoryFileLoadedObject.dialogId, false);
                this.globalCancelable = null;
            }
        }
        invalidate();
    }

    public void updateItems(boolean z, boolean z2) {
        boolean z3 = true;
        if ((this.currentState == 1 || this.overscrollProgress != 0.0f) && !z2) {
            this.updateOnIdleState = true;
            return;
        }
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.oldMiniItems.clear();
        this.oldMiniItems.addAll(this.miniItems);
        this.items.clear();
        if (this.type != 1) {
            this.items.add(new Item(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        }
        ArrayList arrayList = this.type == 1 ? this.storiesController.hiddenListStories : this.storiesController.dialogListStories;
        for (int i = 0; i < arrayList.size(); i++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (peerDialogId != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                this.items.add(new Item(peerDialogId));
            }
        }
        int size = this.items.size();
        if (!this.storiesController.hasSelfStories()) {
            size--;
        }
        int iMax = Math.max(1, Math.max(this.storiesController.getTotalStoriesCount(this.type == 1), size));
        this.currentTitle = null;
        if (!this.storiesController.hasOnlySelfStories()) {
            this.currentTitle = this.menuItemsOffset < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.formatPluralString("Stories", iMax, new Object[0]);
        } else if (this.storiesController.hasUploadingStories(UserConfig.getInstance(this.currentAccount).getClientUserId())) {
            String string = LocaleController.getString(R.string.UploadingStory);
            if (string.indexOf("…") > 0) {
                if (this.uploadingString == null) {
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
                    UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
                    spannableStringBuilderValueOf.setSpan(uploadingDotsSpannable, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 0);
                    uploadingDotsSpannable.parent = this.titleView;
                    uploadingDotsSpannable.isMediumTypeface = true;
                    this.uploadingString = spannableStringBuilderValueOf;
                }
                this.currentTitle = this.uploadingString;
            } else {
                this.currentTitle = string;
            }
        } else {
            this.currentTitle = this.menuItemsOffset < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.getString(R.string.MyStory);
        }
        if (!this.hasOverlayText) {
            this.titleView.setText(this.currentTitle, z && !LocaleController.isRTL);
        }
        BoolAnimator boolAnimator = this.animatorHasTitleText;
        if (TextUtils.isEmpty(this.currentTitle) && !this.hasOverlayText) {
            z3 = false;
        }
        boolAnimator.setValue(z3, z);
        this.miniItems.clear();
        for (int i2 = 0; i2 < this.items.size(); i2++) {
            if (this.items.get(i2).dialogId != UserConfig.getInstance(this.currentAccount).clientUserId) {
                this.miniItems.add(this.items.get(i2));
                if (this.miniItems.size() >= 3) {
                    break;
                    break;
                }
            } else if (this.storiesController.hasUnreadStories(UserConfig.getInstance(this.currentAccount).clientUserId) || (this.storiesController.hasSelfStories() && this.storiesController.dialogListStories.size() <= 3)) {
                this.miniItems.add(this.items.get(i2));
                if (this.miniItems.size() >= 3) {
                    break;
                }
            }
        }
        if (!z) {
            this.recyclerListView.lambda$onCellEnter$52(null);
            this.listViewMini.lambda$onCellEnter$52(null);
        } else if (this.currentState == 2) {
            this.listViewMini.lambda$onCellEnter$52(this.miniItemAnimator);
            this.recyclerListView.lambda$onCellEnter$52(null);
        } else {
            this.recyclerListView.lambda$onCellEnter$52(this.itemAnimator);
            this.listViewMini.lambda$onCellEnter$52(null);
        }
        this.adapter.setItems(this.oldItems, this.items);
        this.miniAdapter.setItems(this.oldMiniItems, this.miniItems);
        this.oldItems.clear();
        invalidate();
    }

    public void updateStatus(TLRPC.User user, boolean z) {
        if (this.statusDrawable == null || this.actionBar == null) {
            return;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
        if (emojiStatusDocumentId != null) {
            boolean z2 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.statusDrawable.set(emojiStatusDocumentId.longValue(), z);
            this.statusDrawable.setParticles(z2, z);
        } else if (user == null || !MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            this.statusDrawable.set((Drawable) null, z);
            this.statusDrawable.setParticles(false, z);
        } else {
            if (this.premiumStar == null) {
                this.premiumStar = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.premiumStar = new AnonymousClass12(this.premiumStar, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
            }
            this.premiumStar.setColorFilter(new PorterDuffColorFilter(getThemedColor$6(Theme.key_profile_verifiedBackground), PorterDuff.Mode.MULTIPLY));
            this.statusDrawable.set(this.premiumStar, z);
            this.statusDrawable.setParticles(false, z);
        }
        this.statusDrawable.setColor(Integer.valueOf(getThemedColor$6(Theme.key_profile_verifiedBackground)));
        this.emojiStatusView.invalidate();
    }

    public final void openStoryForCell(StoryCell storyCell, boolean z) {
        ValueAnimator valueAnimator;
        if ((!z || (valueAnimator = this.expandOvershootAnimator) == null || !valueAnimator.isRunning()) && storyCell != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            if (!storyCell.isSelf || this.storiesController.hasSelfStories()) {
                if (this.storiesController.hasStories(storyCell.dialogId) || this.storiesController.hasUploadingStories(storyCell.dialogId)) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.storiesController.allStoriesMap.get(storyCell.dialogId);
                    long j = storyCell.dialogId;
                    StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.globalCancelable;
                    if (ensureStoryFileLoadedObject != null) {
                        ensureStoryFileLoadedObject.cancelled = true;
                        ensureStoryFileLoadedObject.storiesController.setLoading(ensureStoryFileLoadedObject.dialogId, false);
                        this.globalCancelable = null;
                    }
                    GiftSheet$$ExternalSyntheticLambda17 giftSheet$$ExternalSyntheticLambda17 = new GiftSheet$$ExternalSyntheticLambda17(this, storyCell, j, 10);
                    if (z) {
                        giftSheet$$ExternalSyntheticLambda17.run();
                        return;
                    }
                    StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObjectEnsureStoryFileLoaded = StoriesUtilities.ensureStoryFileLoaded(peerStories, giftSheet$$ExternalSyntheticLambda17);
                    storyCell.cancellable = ensureStoryFileLoadedObjectEnsureStoryFileLoaded;
                    this.globalCancelable = ensureStoryFileLoadedObjectEnsureStoryFileLoaded;
                    if (ensureStoryFileLoadedObjectEnsureStoryFileLoaded != null) {
                        this.storiesController.setLoading(storyCell.dialogId, true);
                    }
                }
            } else if (MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
                openStoryRecorder();
            } else {
                showPremiumHint();
            }
        }
    }

    public void openStoryRecorder(long j) {
        StoryCell storyCell;
        StoriesController.StoryLimit storyLimitCheckStoryLimit;
        if (j == 0 && (storyLimitCheckStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit()) != null && storyLimitCheckStoryLimit.active(this.currentAccount, 1)) {
            this.fragment.showDialog(new LimitReachedBottomSheet(storyLimitCheckStoryLimit.getLimitReachedType(), this.fragment, getContext(), this.currentAccount, null));
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.recyclerListView.getChildCount()) {
                storyCell = null;
                break;
            }
            StoryCell storyCell2 = (StoryCell) this.recyclerListView.getChildAt(i);
            if (j == 0) {
                if (storyCell2.isSelf) {
                    storyCell = storyCell2;
                    break;
                }
                i++;
            } else {
                if (storyCell2.dialogId == j) {
                    storyCell = storyCell2;
                    break;
                }
                i++;
            }
        }
        if (storyCell == null) {
            return;
        }
        if (j == 0) {
            StoryRecorder.getInstance(this.fragment.getParentActivity(), this.currentAccount).open(StoryRecorder.SourceView.fromStoryCell(storyCell));
            return;
        }
        BaseFragment baseFragment = this.fragment;
        Theme.ResourcesProvider resourceProvider = baseFragment != null ? baseFragment.getResourceProvider() : null;
        AlertDialog alertDialog = new AlertDialog(getContext(), 3, resourceProvider);
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
        MessagesController.getInstance(this.currentAccount).getStoriesController().canSendStoryFor(j, new StarGiftSheet$$ExternalSyntheticLambda105(this, alertDialog, j, storyCell, 1), true, resourceProvider);
    }

    public void setProgressToCollapse(float f, boolean z) {
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        if (this.collapsedProgress1 == f) {
            return;
        }
        this.collapsedProgress1 = f;
        checkCollapsedProgress();
        boolean z2 = f > this.K;
        if (z2 != this.collapsed) {
            this.collapsed = z2;
            AnimatorSet animatorSet = this.storiesAnimatorSet;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.storiesAnimatorSet.cancel();
                this.storiesAnimatorSet = null;
            }
            if (!z) {
                this.collapsedProgress2 = z2 ? 1.0f : 0.0f;
                checkCollapsedProgress();
                AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, (Consumer) new HistoryFragment$1$$ExternalSyntheticLambda0(7));
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.collapsedProgress2, z2 ? 1.0f : 0.0f);
            this.valueAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final DialogStoriesCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$setProgressToCollapse$7(valueAnimator);
                            break;
                        case 1:
                            this.f$0.lambda$setProgressToCollapse$8(valueAnimator);
                            break;
                        case 2:
                            this.f$0.lambda$setProgressToCollapse$9(valueAnimator);
                            break;
                        default:
                            this.f$0.lambda$setProgressToCollapse$10(valueAnimator);
                            break;
                    }
                }
            });
            this.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            float f2 = this.collapsedProgress1;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, z2 ? f2 : 0.0f);
            this.yStoriesAnimator = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final DialogStoriesCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$setProgressToCollapse$7(valueAnimator);
                            break;
                        case 1:
                            this.f$0.lambda$setProgressToCollapse$8(valueAnimator);
                            break;
                        case 2:
                            this.f$0.lambda$setProgressToCollapse$9(valueAnimator);
                            break;
                        default:
                            this.f$0.lambda$setProgressToCollapse$10(valueAnimator);
                            break;
                    }
                }
            });
            this.yStoriesAnimator.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.storiesAnimatorSet = animatorSet2;
            animatorSet2.addListener(new StoryViewer.AnonymousClass7(this, z2, 8));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.valueAnimator);
            arrayList.add(this.yStoriesAnimator);
            if (this.collapsed) {
                this.storiesAnimatorSet.setDuration(1000L);
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.collapsedProgress2, z2 ? 1.0f : 0.0f);
                this.collapsedOvershootAnimator = valueAnimatorOfFloat3;
                valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final DialogStoriesCell f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i) {
                            case 0:
                                this.f$0.lambda$setProgressToCollapse$7(valueAnimator);
                                break;
                            case 1:
                                this.f$0.lambda$setProgressToCollapse$8(valueAnimator);
                                break;
                            case 2:
                                this.f$0.lambda$setProgressToCollapse$9(valueAnimator);
                                break;
                            default:
                                this.f$0.lambda$setProgressToCollapse$10(valueAnimator);
                                break;
                        }
                    }
                });
                OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.collapsedSpringCoef);
                this.storiesCollapseInterpolator = overshootInterpolator;
                this.collapsedOvershootAnimator.setInterpolator(overshootInterpolator);
                this.collapsedOvershootAnimator.setDuration(750L);
                arrayList.add(this.collapsedOvershootAnimator);
            } else {
                this.expandOvershootAnimator = ValueAnimator.ofFloat(this.collapsedProgress2, z2 ? 1.0f : 0.0f);
                OvershootInterpolator overshootInterpolator2 = new OvershootInterpolator(this.expandedSpringCoef);
                this.storiesExpandInterpolator = overshootInterpolator2;
                this.expandOvershootAnimator.setInterpolator(overshootInterpolator2);
                this.expandOvershootAnimator.setDuration(350L);
                final int i4 = 3;
                this.expandOvershootAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final DialogStoriesCell f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$setProgressToCollapse$7(valueAnimator);
                                break;
                            case 1:
                                this.f$0.lambda$setProgressToCollapse$8(valueAnimator);
                                break;
                            case 2:
                                this.f$0.lambda$setProgressToCollapse$9(valueAnimator);
                                break;
                            default:
                                this.f$0.lambda$setProgressToCollapse$10(valueAnimator);
                                break;
                        }
                    }
                });
                arrayList.add(this.expandOvershootAnimator);
            }
            this.storiesAnimatorSet.playTogether(arrayList);
            this.storiesAnimatorSet.start();
        }
    }

    public final class StoryCell extends FrameLayout {
        public final AvatarDrawable avatarDrawable;
        public final ImageReceiver avatarImage;
        public final float bounceScale;
        public StoriesUtilities.EnsureStoryFileLoadedObject cancellable;
        public TLRPC.Chat chat;
        public final AvatarDrawable crossfadeAvatarDrawable;
        public final ImageReceiver crossfadeToAvatarImage;
        public boolean crossfadeToDialog;
        public long crossfadeToDialogId;
        public float cx;
        public float cy;
        public long dialogId;
        public boolean drawAvatar;
        public boolean drawInParent;
        public final AnimatedFloat failT;
        public boolean isFail;
        public boolean isFirst;
        public boolean isLast;
        public boolean isSelf;
        public boolean isUploadingState;
        public boolean mini;
        public final StoriesUtilities.AvatarStoryParams params;
        public int position;
        public float progressToCollapsed;
        public float progressToCollapsed2;
        public boolean progressWasDrawn;
        public RadialProgress radialProgress;
        public boolean selectedForOverscroll;
        public float textAlpha;
        public float textAlphaTransition;
        public SimpleTextView textView;
        public final FrameLayout textViewContainer;
        public TLRPC.User user;
        public Drawable verifiedDrawable;

        public StoryCell(Context context) {
            super(context);
            this.avatarDrawable = new AvatarDrawable();
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.avatarImage = imageReceiver;
            ImageReceiver imageReceiver2 = new ImageReceiver(this);
            this.crossfadeToAvatarImage = imageReceiver2;
            this.crossfadeAvatarDrawable = new AvatarDrawable();
            this.drawAvatar = true;
            StoriesUtilities.AvatarStoryParams avatarStoryParams = new StoriesUtilities.AvatarStoryParams(true, null);
            this.params = avatarStoryParams;
            this.textAlpha = 1.0f;
            this.textAlphaTransition = 1.0f;
            this.bounceScale = 1.0f;
            this.failT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            avatarStoryParams.isArchive = DialogStoriesCell.this.type == 1;
            avatarStoryParams.isDialogStoriesCell = true;
            imageReceiver.setInvalidateAll(true);
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.textViewContainer = frameLayout;
            frameLayout.setClipChildren(false);
            if (!this.mini) {
                setClipChildren(false);
            }
            createTextView();
            addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f));
            imageReceiver.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
            imageReceiver2.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        }

        public void setClipInParent(boolean z) {
            if (getParent() != null) {
                ((ViewGroup) getParent()).setClipChildren(z);
            }
            if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null) {
                return;
            }
            ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z);
        }

        public final void createTextView() {
            SimpleTextView simpleTextView = new SimpleTextView(getContext());
            this.textView = simpleTextView;
            simpleTextView.setTypeface(AndroidUtilities.bold());
            this.textView.setGravity(17);
            this.textView.setTextSize(11);
            this.textView.setTextColor(DialogStoriesCell.this.getTextColor());
            NotificationCenter.listenEmojiLoading(this.textView);
            this.textView.setMaxLines(1);
            this.textViewContainer.addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
            this.avatarImage.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
            this.crossfadeToAvatarImage.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f;
            float size;
            boolean z;
            float degrees;
            float f2;
            RadialProgress radialProgress;
            Canvas canvas2 = canvas;
            float fDp = AndroidUtilities.dp(48.0f);
            float fDp2 = AndroidUtilities.dp(26.33f);
            float fDp3 = AndroidUtilities.dp(8.0f);
            DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
            float fClamp = Utilities.clamp(dialogStoriesCell.overscrollProgress / 0.5f, 1.0f, 0.0f) * fDp3;
            if (this.selectedForOverscroll) {
                fClamp += Utilities.clamp((dialogStoriesCell.overscrollProgress - 0.5f) / 0.5f, 1.0f, 0.0f) * AndroidUtilities.dp(16.0f);
            }
            float fLerp = AndroidUtilities.lerp(fDp + fClamp, fDp2, this.progressToCollapsed);
            float f3 = fLerp / 2.0f;
            float measuredWidth = (getMeasuredWidth() / 2.0f) - f3;
            float fLerp2 = AndroidUtilities.lerp(measuredWidth, 0.0f, this.progressToCollapsed);
            float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (ActionBar.getCurrentActionBarHeight() - fDp2) / 2.0f, this.progressToCollapsed);
            float fClamp2 = Utilities.clamp(this.progressToCollapsed / 0.5f, 1.0f, 0.0f);
            StoriesUtilities.AvatarStoryParams avatarStoryParams = this.params;
            avatarStoryParams.drawSegments = true;
            if (!avatarStoryParams.forceAnimateProgressToSegments) {
                avatarStoryParams.progressToSegments = 1.0f - dialogStoriesCell.collapsedProgress2;
            }
            float f4 = fLerp3 + fLerp;
            avatarStoryParams.originalAvatarRect.set(fLerp2, fLerp3, fLerp2 + fLerp, f4);
            avatarStoryParams.additionalInset = AndroidUtilities.dpf2(1.33f) * this.progressToCollapsed;
            float f5 = fLerp2;
            ImageReceiver imageReceiver = this.avatarImage;
            imageReceiver.setAlpha(1.0f);
            imageReceiver.setRoundRadius((int) f3);
            float f6 = f5 + f3;
            this.cx = f6;
            float f7 = fLerp3 + f3;
            this.cy = f7;
            if (dialogStoriesCell.type == 0) {
                f = 0.0f;
                dialogStoriesCell.backgroundPaint.setColor(dialogStoriesCell.getThemedColor$6(Theme.key_actionBarDefault));
            } else {
                f = 0.0f;
                dialogStoriesCell.backgroundPaint.setColor(dialogStoriesCell.getThemedColor$6(Theme.key_actionBarDefaultArchived));
            }
            if (this.progressToCollapsed != f) {
                canvas2.drawCircle(this.cx, this.cy, AndroidUtilities.dpf2(1.5f) + f3, dialogStoriesCell.backgroundPaint);
            }
            canvas2.save();
            float f8 = this.cx;
            float f9 = this.cy;
            float f10 = this.bounceScale;
            canvas2.scale(f10, f10, f8, f9);
            if (this.radialProgress == null) {
                this.radialProgress = dialogStoriesCell.radialProgress;
            }
            ArrayList arrayList = (ArrayList) dialogStoriesCell.storiesController.uploadingAndEditingStories.get(this.dialogId);
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            if (z2 || (this.progressWasDrawn && (radialProgress = this.radialProgress) != null && radialProgress.getAnimatedProgress() < 0.98f)) {
                f5 = f5;
                if (z2) {
                    float f11 = 0.0f;
                    for (int i = 0; i < arrayList.size(); i++) {
                        f11 += ((StoriesController.UploadingStory) arrayList.get(i)).progress;
                    }
                    int i2 = dialogStoriesCell.storiesController.uploadedStories;
                    size = (i2 + f11) / (arrayList.size() + i2);
                    z = ((StoriesController.UploadingStory) Fragment$$ExternalSyntheticOutline0.m(1, arrayList)).isCloseFriends;
                    dialogStoriesCell.lastUploadingCloseFriends = z;
                } else {
                    z = dialogStoriesCell.lastUploadingCloseFriends;
                    size = 1.0f;
                }
                invalidate();
                if (this.radialProgress == null) {
                    RadialProgress radialProgress2 = dialogStoriesCell.radialProgress;
                    if (radialProgress2 != null) {
                        this.radialProgress = radialProgress2;
                    } else {
                        RadialProgress radialProgress3 = new RadialProgress(this);
                        this.radialProgress = radialProgress3;
                        dialogStoriesCell.radialProgress = radialProgress3;
                        radialProgress3.setBackground(null, true, false);
                    }
                }
                if (this.drawAvatar) {
                    canvas2.save();
                    canvas2.scale(avatarStoryParams.getScale(), avatarStoryParams.getScale(), avatarStoryParams.originalAvatarRect.centerX(), avatarStoryParams.originalAvatarRect.centerY());
                    imageReceiver.setImageCoords(avatarStoryParams.originalAvatarRect);
                    imageReceiver.draw(canvas2);
                    canvas2.restore();
                }
                this.radialProgress.setDiff(0);
                Paint closeFriendsPaint = z ? StoriesUtilities.getCloseFriendsPaint(imageReceiver) : StoriesUtilities.getUnreadCirclePaint(imageReceiver, true);
                closeFriendsPaint.setAlpha(255);
                this.radialProgress.setPaint(closeFriendsPaint);
                this.radialProgress.setProgressRect((int) (imageReceiver.getImageX() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver.getImageY() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver.getImageX2() + AndroidUtilities.dp(3.0f)), (int) (imageReceiver.getImageY2() + AndroidUtilities.dp(3.0f)));
                this.radialProgress.setProgress(Utilities.clamp(size, 1.0f, 0.0f), this.progressWasDrawn);
                if (imageReceiver.getVisible()) {
                    this.radialProgress.draw(canvas2);
                }
                this.progressWasDrawn = true;
                dialogStoriesCell.drawCircleForce = true;
                invalidate();
            } else {
                float f12 = this.failT.set(this.isFail);
                if (this.drawAvatar) {
                    if (this.progressWasDrawn) {
                        avatarStoryParams.forceAnimateProgressToSegments = true;
                        avatarStoryParams.progressToSegments = 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new RichMediaCell$$ExternalSyntheticLambda1(this, 3));
                        valueAnimatorOfFloat.addListener(new BaseChartView.AnonymousClass4(this, 19));
                        valueAnimatorOfFloat.setDuration(100L);
                        valueAnimatorOfFloat.start();
                    }
                    float f13 = f12 * avatarStoryParams.progressToSegments;
                    avatarStoryParams.animate = !this.progressWasDrawn;
                    if (this.isLast || dialogStoriesCell.overscrollProgress > 0.0f) {
                        degrees = 0.0f;
                    } else {
                        float fLerp4 = AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(16.0f), CubicBezierInterpolator.EASE_OUT.getInterpolation(this.progressToCollapsed));
                        float fDpf2 = AndroidUtilities.dpf2(3.5f) + f3;
                        if (fLerp4 < fDpf2 * 2.0f) {
                            degrees = ((float) Math.toDegrees(Math.acos((fLerp4 / 2.0f) / fDpf2))) * 2.0f;
                        } else {
                            degrees = 0.0f;
                        }
                    }
                    avatarStoryParams.progressToArc = degrees;
                    avatarStoryParams.isLast = this.isLast;
                    avatarStoryParams.isFirst = this.isFirst;
                    avatarStoryParams.alpha = 1.0f - f13;
                    boolean z3 = this.isSelf;
                    if (z3 || !this.crossfadeToDialog) {
                        avatarStoryParams.crossfadeToDialog = 0L;
                    } else {
                        avatarStoryParams.crossfadeToDialog = this.crossfadeToDialogId;
                        avatarStoryParams.crossfadeToDialogProgress = this.progressToCollapsed2;
                    }
                    if (z3) {
                        f2 = fLerp3;
                        StoriesUtilities.drawAvatarWithStory(this.dialogId, canvas2, imageReceiver, dialogStoriesCell.storiesController.hasSelfStories(), avatarStoryParams);
                        canvas2 = canvas;
                    } else {
                        f2 = fLerp3;
                        long j = this.dialogId;
                        canvas2 = canvas;
                        StoriesUtilities.drawAvatarWithStory(j, canvas2, imageReceiver, dialogStoriesCell.storiesController.hasStories(j), avatarStoryParams);
                    }
                    if (f13 > 0.0f) {
                        if (StoriesUtilities.errorGradientTools == null) {
                            GradientTools gradientTools = new GradientTools();
                            StoriesUtilities.errorGradientTools = gradientTools;
                            gradientTools.isDiagonal = true;
                            gradientTools.isRotate = true;
                            int color = Theme.getColor(null, Theme.key_color_orange, false);
                            int color2 = Theme.getColor(null, Theme.key_text_RedBold, false);
                            StoriesUtilities.errorGradientTools.setColors(ColorUtils.blendARGB(0.25f, color, color2), color2);
                            StoriesUtilities.errorGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                            StoriesUtilities.errorGradientTools.paint.setStyle(Paint.Style.STROKE);
                            StoriesUtilities.errorGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
                        }
                        StoriesUtilities.errorGradientTools.setBounds(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
                        Paint paint = StoriesUtilities.errorGradientTools.paint;
                        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        paint.setAlpha((int) (f13 * 255.0f));
                        canvas2.drawCircle(f6, f7, avatarStoryParams.getScale() * (f3 + AndroidUtilities.dp(4.0f)), paint);
                    } else {
                        f13 = f13;
                    }
                    fLerp3 = f2;
                    f12 = f13;
                } else {
                    f5 = f5;
                }
                this.progressWasDrawn = false;
                if (this.drawAvatar) {
                    canvas2.save();
                    float f14 = 1.0f - fClamp2;
                    canvas2.scale(f14, f14, this.cx + AndroidUtilities.dp(16.0f), this.cy + AndroidUtilities.dp(16.0f));
                    drawPlus(canvas2, this.cx, this.cy, 1.0f);
                    float f15 = this.cx;
                    float f16 = this.cy;
                    if (f12 > 0.0f) {
                        float fDp4 = f15 + AndroidUtilities.dp(17.0f);
                        float fDp5 = f16 + AndroidUtilities.dp(17.0f);
                        dialogStoriesCell.addCirclePaint.setColor(Theme.multAlpha(f12, dialogStoriesCell.getThemedColor$6(Theme.key_text_RedBold)));
                        if (dialogStoriesCell.type == 0) {
                            dialogStoriesCell.backgroundPaint.setColor(Theme.multAlpha(f12, dialogStoriesCell.getThemedColor$6(Theme.key_actionBarDefault)));
                        } else {
                            dialogStoriesCell.backgroundPaint.setColor(Theme.multAlpha(f12, dialogStoriesCell.getThemedColor$6(Theme.key_actionBarDefaultArchived)));
                        }
                        float interpolation = CubicBezierInterpolator.EASE_OUT_BACK.getInterpolation(f12) * AndroidUtilities.dp(9.0f);
                        canvas2.drawCircle(fDp4, fDp5, AndroidUtilities.dp(2.0f) + interpolation, dialogStoriesCell.backgroundPaint);
                        canvas2.drawCircle(fDp4, fDp5, interpolation, dialogStoriesCell.addCirclePaint);
                        dialogStoriesCell.addCirclePaint.setColor(Theme.multAlpha(f12, dialogStoriesCell.getTextColor()));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(fDp4 - AndroidUtilities.dp(1.0f), fDp5 - AndroidUtilities.dpf2(4.6f), AndroidUtilities.dp(1.0f) + fDp4, AndroidUtilities.dpf2(1.6f) + fDp5);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), dialogStoriesCell.addCirclePaint);
                        rectF.set(fDp4 - AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(2.6f) + fDp5, fDp4 + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(4.6f) + fDp5);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), dialogStoriesCell.addCirclePaint);
                    }
                    canvas2.restore();
                }
            }
            canvas2.restore();
            if (this.crossfadeToDialog && this.progressToCollapsed2 > 0.0f) {
                ImageReceiver imageReceiver2 = this.crossfadeToAvatarImage;
                imageReceiver2.setImageCoords(f5, fLerp3, fLerp, fLerp);
                imageReceiver2.setAlpha(this.progressToCollapsed2);
                imageReceiver2.draw(canvas2);
            }
            FrameLayout frameLayout = this.textViewContainer;
            frameLayout.setTranslationY(((1.0f - this.progressToCollapsed) * AndroidUtilities.dp(7.0f)) + f4);
            frameLayout.setTranslationX(f5 - measuredWidth);
            if (!this.mini) {
                if (this.isSelf) {
                    this.textAlpha = 1.0f;
                } else {
                    this.textAlpha = avatarStoryParams.globalState == 2 ? 0.7f : 1.0f;
                }
                float f17 = this.textAlphaTransition * this.textAlpha;
                frameLayout.setAlpha(f17);
                frameLayout.setVisibility(f17 > 0.0f ? 0 : 4);
            }
            super.dispatchDraw(canvas);
        }

        public final void drawPlus(Canvas canvas, float f, float f2, float f3) {
            if (this.isSelf) {
                DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
                if (dialogStoriesCell.storiesController.hasStories(this.dialogId)) {
                    return;
                }
                if (Utilities.isNullOrEmpty((ArrayList) dialogStoriesCell.storiesController.uploadingStoriesByDialogId.get(this.dialogId))) {
                    float fDp = f + AndroidUtilities.dp(16.0f);
                    float fDp2 = f2 + AndroidUtilities.dp(16.0f);
                    dialogStoriesCell.addCirclePaint.setColor(Theme.multAlpha(f3, dialogStoriesCell.getThemedColor$6(Theme.key_telegram_color)));
                    if (dialogStoriesCell.type == 0) {
                        dialogStoriesCell.backgroundPaint.setColor(Theme.multAlpha(f3, dialogStoriesCell.getThemedColor$6(Theme.key_actionBarDefault)));
                    } else {
                        dialogStoriesCell.backgroundPaint.setColor(Theme.multAlpha(f3, dialogStoriesCell.getThemedColor$6(Theme.key_actionBarDefaultArchived)));
                    }
                    canvas.drawCircle(fDp, fDp2, AndroidUtilities.dp(11.0f), dialogStoriesCell.backgroundPaint);
                    canvas.drawCircle(fDp, fDp2, AndroidUtilities.dp(9.0f), dialogStoriesCell.addCirclePaint);
                    int themedColor$6 = dialogStoriesCell.getThemedColor$6(dialogStoriesCell.type == 0 ? Theme.key_actionBarDefault : Theme.key_actionBarDefaultArchived);
                    if (themedColor$6 != dialogStoriesCell.addNewStoryLastColor) {
                        dialogStoriesCell.addNewStoryDrawable.setColorFilter(new PorterDuffColorFilter(dialogStoriesCell.addNewStoryLastColor = themedColor$6, PorterDuff.Mode.MULTIPLY));
                    }
                    dialogStoriesCell.addNewStoryDrawable.setAlpha((int) (f3 * 255.0f));
                    dialogStoriesCell.addNewStoryDrawable.setBounds((int) (fDp - (dialogStoriesCell.addNewStoryDrawable.getIntrinsicWidth() / 2.0f)), (int) (fDp2 - (dialogStoriesCell.addNewStoryDrawable.getIntrinsicHeight() / 2.0f)), (int) ((dialogStoriesCell.addNewStoryDrawable.getIntrinsicWidth() / 2.0f) + fDp), (int) ((dialogStoriesCell.addNewStoryDrawable.getIntrinsicHeight() / 2.0f) + fDp2));
                    dialogStoriesCell.addNewStoryDrawable.draw(canvas);
                }
            }
        }

        public float getCy() {
            float fDp = AndroidUtilities.dp(48.0f);
            float fDp2 = AndroidUtilities.dp(26.33f);
            return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (ActionBar.getCurrentActionBarHeight() - fDp2) / 2.0f, DialogStoriesCell.this.collapsedProgress1) + (AndroidUtilities.lerp(fDp, fDp2, this.progressToCollapsed) / 2.0f);
        }

        @Override
        public final void invalidate() {
            if (this.mini || (this.drawInParent && getParent() != null)) {
                ViewParent parent = getParent();
                DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
                RecyclerListView recyclerListView = dialogStoriesCell.listViewMini;
                if (parent == recyclerListView) {
                    recyclerListView.invalidate();
                } else {
                    dialogStoriesCell.invalidate();
                }
            }
            super.invalidate();
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.avatarImage.onAttachedToWindow();
            this.crossfadeToAvatarImage.onAttachedToWindow();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.avatarImage.onDetachedFromWindow();
            this.crossfadeToAvatarImage.onDetachedFromWindow();
            this.params.onDetachFromWindow();
            StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.cancellable;
            if (ensureStoryFileLoadedObject != null) {
                ensureStoryFileLoadedObject.cancelled = true;
                ensureStoryFileLoadedObject.storiesController.setLoading(ensureStoryFileLoadedObject.dialogId, false);
                this.cancellable = null;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.mini ? AndroidUtilities.dp(70.0f) : DialogStoriesCell.this.currentCellWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
        }

        public void setCrossfadeTo(long j) {
            TLRPC.Chat chat;
            TLObject tLObject;
            TLRPC.User user;
            if (this.crossfadeToDialogId != j) {
                this.crossfadeToDialogId = j;
                boolean z = j != -1;
                this.crossfadeToDialog = z;
                ImageReceiver imageReceiver = this.crossfadeToAvatarImage;
                if (!z) {
                    imageReceiver.clearImage();
                    return;
                }
                DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
                if (j > 0) {
                    user = MessagesController.getInstance(dialogStoriesCell.currentAccount).getUser(Long.valueOf(j));
                    this.user = user;
                    this.chat = null;
                } else {
                    chat = MessagesController.getInstance(dialogStoriesCell.currentAccount).getChat(Long.valueOf(-j));
                    this.chat = chat;
                    this.user = null;
                }
                if (tLObject == null) {
                    tLObject = chat;
                    tLObject = user;
                    return;
                }
                tLObject = chat;
                tLObject = user;
                AvatarDrawable avatarDrawable = this.crossfadeAvatarDrawable;
                avatarDrawable.setInfo(dialogStoriesCell.currentAccount, tLObject);
                imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            }
        }

        public void setDialogId(long j) {
            TLObject tLObject;
            StoriesController.UploadingStory uploadingStory;
            long j2 = this.dialogId;
            boolean z = j2 == j;
            DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
            if (!z && this.cancellable != null) {
                dialogStoriesCell.storiesController.setLoading(j2, false);
                StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.cancellable;
                ensureStoryFileLoadedObject.cancelled = true;
                ensureStoryFileLoadedObject.storiesController.setLoading(ensureStoryFileLoadedObject.dialogId, false);
                this.cancellable = null;
            }
            this.dialogId = j;
            this.isSelf = j == UserConfig.getInstance(dialogStoriesCell.currentAccount).getClientUserId();
            this.isFail = dialogStoriesCell.storiesController.isLastUploadingFailed(j);
            if (j > 0) {
                TLRPC.User user = MessagesController.getInstance(dialogStoriesCell.currentAccount).getUser(Long.valueOf(j));
                this.user = user;
                this.chat = null;
                tLObject = user;
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(dialogStoriesCell.currentAccount).getChat(Long.valueOf(-j));
                this.chat = chat;
                this.user = null;
                tLObject = chat;
            }
            ImageReceiver imageReceiver = this.avatarImage;
            if (tLObject == null) {
                this.textView.setText("");
                imageReceiver.clearImage();
                return;
            }
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            avatarDrawable.setInfo(dialogStoriesCell.currentAccount, tLObject);
            imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            if (this.mini) {
                return;
            }
            this.textView.setRightDrawable((Drawable) null);
            if (dialogStoriesCell.storiesController.isLastUploadingFailed(j)) {
                this.textView.setTextSize(10);
                this.textView.setText(LocaleController.getString(R.string.FailedStory));
                this.isUploadingState = false;
                return;
            }
            if (!Utilities.isNullOrEmpty((ArrayList) dialogStoriesCell.storiesController.uploadingStoriesByDialogId.get(j))) {
                this.textView.setTextSize(10);
                SimpleTextView simpleTextView = this.textView;
                GradientTools[] gradientToolsArr = StoriesUtilities.storiesGradientTools;
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
                    UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
                    spannableStringBuilderValueOf.setSpan(uploadingDotsSpannable, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 0);
                    uploadingDotsSpannable.parent = simpleTextView;
                    uploadingDotsSpannable.isMediumTypeface = true;
                    simpleTextView.setText(spannableStringBuilderValueOf);
                } else {
                    simpleTextView.setText(string);
                }
                this.isUploadingState = true;
                return;
            }
            HashMap map = (HashMap) dialogStoriesCell.storiesController.editingStories.get(j);
            if (map == null || map.isEmpty()) {
                uploadingStory = null;
            } else {
                Collection collectionValues = map.values();
                if (collectionValues.isEmpty()) {
                    uploadingStory = null;
                } else {
                    uploadingStory = (StoriesController.UploadingStory) collectionValues.iterator().next();
                }
            }
            if (uploadingStory != null) {
                this.textView.setTextSize(10);
                SimpleTextView simpleTextView2 = this.textView;
                GradientTools[] gradientToolsArr2 = StoriesUtilities.storiesGradientTools;
                String string2 = LocaleController.getString(R.string.UploadingStory);
                if (string2.indexOf("…") > 0) {
                    SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(string2);
                    UploadingDotsSpannable uploadingDotsSpannable2 = new UploadingDotsSpannable();
                    spannableStringBuilderValueOf2.setSpan(uploadingDotsSpannable2, spannableStringBuilderValueOf2.length() - 1, spannableStringBuilderValueOf2.length(), 0);
                    uploadingDotsSpannable2.parent = simpleTextView2;
                    uploadingDotsSpannable2.isMediumTypeface = true;
                    simpleTextView2.setText(spannableStringBuilderValueOf2);
                } else {
                    simpleTextView2.setText(string2);
                }
                this.isUploadingState = true;
                return;
            }
            if (this.isSelf) {
                if (z && this.isUploadingState && !this.mini) {
                    SimpleTextView simpleTextView3 = this.textView;
                    createTextView();
                    if (dialogStoriesCell.textAnimator != null) {
                        dialogStoriesCell.textAnimator.cancel();
                        dialogStoriesCell.textAnimator = null;
                    }
                    dialogStoriesCell.textAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                    dialogStoriesCell.textAnimator.addUpdateListener(new SuperRipple$$ExternalSyntheticLambda7(13, this, simpleTextView3));
                    dialogStoriesCell.textAnimator.addListener(new RichEditor.AnonymousClass1(15, this, simpleTextView3));
                    dialogStoriesCell.textAnimator.setDuration(150L);
                    this.textView.setAlpha(0.0f);
                    this.textView.setTranslationY(AndroidUtilities.dp(5.0f));
                    dialogStoriesCell.animationRunnable = new BalanceCloud$$ExternalSyntheticLambda1(this, 18);
                }
                AndroidUtilities.runOnUIThread(dialogStoriesCell.animationRunnable, 500L);
                this.isUploadingState = false;
                this.textView.setTextSize(10);
                this.textView.setText(LocaleController.getString(R.string.MyStory));
                return;
            }
            if (this.user == null) {
                this.textView.setTextSize(11);
                this.textView.setText(Emoji.replaceEmoji(this.chat.title, this.textView.getPaint().getFontMetricsInt(), false));
                this.textView.setRightDrawable((Drawable) null);
                return;
            }
            this.textView.setTextSize(11);
            String str = this.user.first_name;
            String strTrim = str != null ? str.trim() : "";
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf > 0) {
                strTrim = strTrim.substring(0, iIndexOf);
            }
            if (!this.user.verified) {
                this.textView.setText(Emoji.replaceEmoji(strTrim, this.textView.getPaint().getFontMetricsInt(), false));
                this.textView.setRightDrawable((Drawable) null);
            } else {
                if (this.verifiedDrawable == null) {
                    this.verifiedDrawable = DialogStoriesCell.access$1100(dialogStoriesCell);
                }
                this.textView.setText(Emoji.replaceEmoji(strTrim, this.textView.getPaint().getFontMetricsInt(), false));
                this.textView.setRightDrawable(this.verifiedDrawable);
            }
        }

        @Override
        public void setPressed(boolean z) {
            super.setPressed(z);
            StoriesUtilities.AvatarStoryParams avatarStoryParams = this.params;
            if (z && avatarStoryParams.buttonBounce == null) {
                avatarStoryParams.buttonBounce = new ButtonBounce(this, 1.5f, 5.0f);
            }
            ButtonBounce buttonBounce = avatarStoryParams.buttonBounce;
            if (buttonBounce != null) {
                buttonBounce.setPressed(z);
            }
        }

        public final void setProgressToCollapsed(float f, float f2, float f3, boolean z) {
            float f4 = this.progressToCollapsed;
            DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
            if (f4 != f || this.progressToCollapsed2 != f2 || 0.0f != f3 || this.selectedForOverscroll != z) {
                this.selectedForOverscroll = z;
                this.progressToCollapsed = f;
                this.progressToCollapsed2 = f2;
                invalidate();
                dialogStoriesCell.recyclerListView.invalidate();
            }
            float fClamp = this.mini ? 0.0f : 1.0f - Utilities.clamp(dialogStoriesCell.collapsedProgress / dialogStoriesCell.K, 1.0f, 0.0f);
            this.textAlphaTransition = fClamp;
            float f5 = fClamp * this.textAlpha;
            FrameLayout frameLayout = this.textViewContainer;
            frameLayout.setAlpha(f5);
            frameLayout.setVisibility(f5 > 0.0f ? 0 : 4);
        }

        @Override
        public final void invalidate(int i, int i2, int i3, int i4) {
            if (this.mini || (this.drawInParent && getParent() != null)) {
                ViewParent parent = getParent();
                DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
                RecyclerListView recyclerListView = dialogStoriesCell.listViewMini;
                if (parent == recyclerListView) {
                    recyclerListView.invalidate();
                }
                dialogStoriesCell.invalidate();
            }
            super.invalidate(i, i2, i3, i4);
        }
    }
}
