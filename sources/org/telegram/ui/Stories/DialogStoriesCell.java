package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import android.graphics.Rect;
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
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
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
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public abstract class DialogStoriesCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public float K;
    private ActionBar actionBar;
    Adapter adapter;
    Paint addCirclePaint;
    private final Drawable addNewStoryDrawable;
    private int addNewStoryLastColor;
    ArrayList afterNextLayout;
    public boolean allowGlobalUpdates;
    ArrayList animateToDialogIds;
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
    Comparator comparator;
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
    ArrayList items;
    private boolean lastUploadingCloseFriends;
    LinearLayoutManager layoutManager;
    RecyclerListView listViewMini;
    private float menuItemsOffset;
    Adapter miniAdapter;
    private final DefaultItemAnimator miniItemAnimator;
    ArrayList miniItems;
    CanvasButton miniItemsClickArea;
    ArrayList oldItems;
    ArrayList oldMiniItems;
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
    ArrayList viewsDrawInParent;
    private ValueAnimator yStoriesAnimator;
    private float yStoriesProgress;

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public abstract void onMiniListClicked();

    public abstract void onUserLongPressed(View view, long j);

    public DialogStoriesCell(Context context, BaseFragment baseFragment, int i, int i2) {
        super(context);
        this.animatorHasTitleText = new BoolAnimator(1, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        this.oldItems = new ArrayList();
        this.oldMiniItems = new ArrayList();
        this.items = new ArrayList();
        this.miniItems = new ArrayList();
        this.adapter = new Adapter(false);
        this.miniAdapter = new Adapter(true);
        this.grayPaint = new Paint();
        this.addCirclePaint = new Paint(1);
        this.backgroundPaint = new Paint(1);
        this.miniItemsClickArea = new CanvasButton(this);
        this.collapsedProgress = -1.0f;
        this.currentState = -1;
        this.viewsDrawInParent = new ArrayList();
        this.animateToDialogIds = new ArrayList();
        this.afterNextLayout = new ArrayList();
        this.collapsedProgress1 = -1.0f;
        this.allowGlobalUpdates = true;
        this.overScrollCoef = 1.0f;
        this.collapsedSpringCoef = 0.95f;
        this.expandedSpringCoef = 0.9f;
        this.comparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return DialogStoriesCell.$r8$lambda$mrKyDE7kqyAfP266l3FH_xwibtA((DialogStoriesCell.StoryCell) obj, (DialogStoriesCell.StoryCell) obj2);
            }
        };
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
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (DialogStoriesCell.this.viewsDrawInParent.contains(view)) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }

            @Override
            protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                super.onLayout(z, i3, i4, i5, i6);
                for (int i7 = 0; i7 < DialogStoriesCell.this.afterNextLayout.size(); i7++) {
                    ((Runnable) DialogStoriesCell.this.afterNextLayout.get(i7)).run();
                }
                DialogStoriesCell.this.afterNextLayout.clear();
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || (DialogStoriesCell.this.collapsedProgress1 <= 0.2f && DialogStoriesCell.this.getAlpha() != 0.0f)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.recyclerListView = recyclerListView;
        recyclerListView.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setClipChildren(false);
        this.miniItemsClickArea.setDelegate(new Runnable() {
            @Override
            public final void run() {
                this.f$0.onMiniListClicked();
            }
        });
        this.miniItemsClickArea.setLongPress(new Runnable() {
            @Override
            public final void run() {
                this.f$0.getClass();
            }
        });
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                super.onScrolled(recyclerView, i3, i4);
                DialogStoriesCell.this.invalidate();
                DialogStoriesCell.this.checkLoadMore();
                if (DialogStoriesCell.this.premiumHint != null) {
                    DialogStoriesCell.this.premiumHint.hide();
                }
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        this.itemAnimator = defaultItemAnimator;
        defaultItemAnimator.setDelayAnimations(false);
        this.itemAnimator.setDurations(150L);
        this.itemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.setItemAnimator(this.itemAnimator);
        RecyclerListView recyclerListView2 = this.recyclerListView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                DialogStoriesCell.$r8$lambda$xFWur6qm8_1KfUznYA6ylL3EWxQ(this.f$0, view, i3);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i3) {
                return DialogStoriesCell.m4306$r8$lambda$iZpO6_i7iOjjkqrorlW7zdmwI4(this.f$0, view, i3);
            }
        });
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
        ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = new ActionBarAnimatedSubtitleOverlayContainer(context, null, this.ellipsizeSpanAnimator) {
            @Override
            public void onItemChanged(ReplaceAnimator replaceAnimator) {
                super.onItemChanged(replaceAnimator);
                DialogStoriesCell.this.invalidate();
            }
        };
        this.subtitleOverlayContainer = actionBarAnimatedSubtitleOverlayContainer;
        addView(actionBarAnimatedSubtitleOverlayContainer, LayoutHelper.createFrame(-2, -2.0f));
        this.grayPaint.setColor(-2762018);
        this.grayPaint.setStyle(Paint.Style.STROKE);
        this.grayPaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.addNewStoryDrawable = ContextCompat.getDrawable(getContext(), R.drawable.msg_mini_addstory);
        RecyclerListView recyclerListView3 = new RecyclerListView(getContext()) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                DialogStoriesCell.this.viewsDrawInParent.clear();
                int i3 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    StoryCell storyCell = (StoryCell) getChildAt(i4);
                    int childAdapterPosition = getChildAdapterPosition(storyCell);
                    storyCell.position = childAdapterPosition;
                    boolean z = true;
                    storyCell.drawInParent = true;
                    storyCell.isFirst = childAdapterPosition == 0;
                    if (childAdapterPosition != DialogStoriesCell.this.miniItems.size() - 1) {
                        z = false;
                    }
                    storyCell.isLast = z;
                    DialogStoriesCell.this.viewsDrawInParent.add(storyCell);
                }
                DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
                Collections.sort(dialogStoriesCell.viewsDrawInParent, dialogStoriesCell.comparator);
                while (i3 < DialogStoriesCell.this.viewsDrawInParent.size()) {
                    StoryCell storyCell2 = (StoryCell) DialogStoriesCell.this.viewsDrawInParent.get(i3);
                    int iSave = canvas.save();
                    canvas.translate(storyCell2.getX(), storyCell2.getY());
                    if (storyCell2.getAlpha() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (storyCell2.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                    }
                    canvas2.scale(storyCell2.getScaleX(), storyCell2.getScaleY(), AndroidUtilities.dp(14.0f), storyCell2.getCy());
                    storyCell2.draw(canvas2);
                    canvas2.restoreToCount(iSave);
                    i3++;
                    canvas = canvas2;
                }
            }

            @Override
            public void onScrolled(int i3, int i4) {
                super.onScrolled(i3, i4);
                if (DialogStoriesCell.this.premiumHint != null) {
                    DialogStoriesCell.this.premiumHint.hide();
                }
            }
        };
        this.listViewMini = recyclerListView3;
        recyclerListView3.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.listViewMini.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
                rect.setEmpty();
                if (childLayoutPosition == 1) {
                    rect.left = (-AndroidUtilities.dp(85.0f)) + AndroidUtilities.dp(31.0f);
                } else if (childLayoutPosition == 2) {
                    rect.left = (-AndroidUtilities.dp(85.0f)) + AndroidUtilities.dp(31.0f);
                }
            }
        });
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() {
            @Override
            protected float animateByScale(View view) {
                return 0.6f;
            }
        };
        this.miniItemAnimator = defaultItemAnimator2;
        defaultItemAnimator2.setDelayAnimations(false);
        defaultItemAnimator2.setSupportsChangeAnimations(false);
        this.listViewMini.setItemAnimator(defaultItemAnimator2);
        this.listViewMini.setAdapter(this.miniAdapter);
        this.listViewMini.setClipChildren(false);
        addView(this.listViewMini, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        checkUi_titleVisibility();
        updateItems(false, false);
    }

    public static void $r8$lambda$xFWur6qm8_1KfUznYA6ylL3EWxQ(DialogStoriesCell dialogStoriesCell, View view, int i) {
        dialogStoriesCell.getClass();
        dialogStoriesCell.openStoryForCell((StoryCell) view, false);
    }

    public static boolean m4306$r8$lambda$iZpO6_i7iOjjkqrorlW7zdmwI4(DialogStoriesCell dialogStoriesCell, View view, int i) {
        if (dialogStoriesCell.collapsedProgress != 0.0f || dialogStoriesCell.overscrollProgress != 0.0f) {
            return false;
        }
        dialogStoriesCell.onUserLongPressed(view, ((StoryCell) view).dialogId);
        return false;
    }

    public void setMenuItemsOffset(float f) {
        this.menuItemsOffset = f;
    }

    public void openStoryForCell(StoryCell storyCell) {
        openStoryForCell(storyCell, false);
    }

    private void openStoryForCell(final StoryCell storyCell, boolean z) {
        ValueAnimator valueAnimator;
        if ((z && (valueAnimator = this.expandOvershootAnimator) != null && valueAnimator.isRunning()) || storyCell == null) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        if (storyCell.isSelf && !this.storiesController.hasSelfStories()) {
            if (!MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
                showPremiumHint();
                return;
            } else {
                openStoryRecorder();
                return;
            }
        }
        if (this.storiesController.hasStories(storyCell.dialogId) || this.storiesController.hasUploadingStories(storyCell.dialogId)) {
            TL_stories.PeerStories stories = this.storiesController.getStories(storyCell.dialogId);
            final long j = storyCell.dialogId;
            StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.globalCancelable;
            if (ensureStoryFileLoadedObject != null) {
                ensureStoryFileLoadedObject.cancel();
                this.globalCancelable = null;
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    DialogStoriesCell.$r8$lambda$8OYoFk9fxNC3d_gkA7fmbD7OTnM(this.f$0, storyCell, j);
                }
            };
            if (z) {
                runnable.run();
                return;
            }
            StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObjectEnsureStoryFileLoaded = StoriesUtilities.ensureStoryFileLoaded(stories, runnable);
            storyCell.cancellable = ensureStoryFileLoadedObjectEnsureStoryFileLoaded;
            this.globalCancelable = ensureStoryFileLoadedObjectEnsureStoryFileLoaded;
            if (ensureStoryFileLoadedObjectEnsureStoryFileLoaded != null) {
                this.storiesController.setLoading(storyCell.dialogId, true);
            }
        }
    }

    public static void $r8$lambda$8OYoFk9fxNC3d_gkA7fmbD7OTnM(final DialogStoriesCell dialogStoriesCell, StoryCell storyCell, final long j) {
        boolean z;
        final boolean z2;
        boolean z3;
        BaseFragment baseFragment = dialogStoriesCell.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        int size = storyCell.position;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= dialogStoriesCell.items.size()) {
                z = true;
                break;
            }
            long j2 = ((Item) dialogStoriesCell.items.get(i)).dialogId;
            if (j2 != UserConfig.getInstance(dialogStoriesCell.currentAccount).clientUserId && dialogStoriesCell.storiesController.hasUnreadStories(j2)) {
                z = false;
                break;
            }
            i++;
        }
        if (storyCell.isSelf && (!z || dialogStoriesCell.items.size() == 1)) {
            arrayList.add(Long.valueOf(storyCell.dialogId));
            z2 = true;
        } else {
            if (!storyCell.isSelf && dialogStoriesCell.storiesController.hasUnreadStories(storyCell.dialogId)) {
                for (int i2 = 0; i2 < dialogStoriesCell.items.size(); i2++) {
                    long j3 = ((Item) dialogStoriesCell.items.get(i2)).dialogId;
                    if (!storyCell.isSelf && dialogStoriesCell.storiesController.hasUnreadStories(j3)) {
                        arrayList.add(Long.valueOf(j3));
                    }
                    if (j3 == storyCell.dialogId) {
                        size = arrayList.size() - 1;
                    }
                }
                z2 = false;
                z3 = true;
            } else {
                for (int i3 = 0; i3 < dialogStoriesCell.items.size(); i3++) {
                    if (dialogStoriesCell.storiesController.hasStories(((Item) dialogStoriesCell.items.get(i3)).dialogId)) {
                        arrayList.add(Long.valueOf(((Item) dialogStoriesCell.items.get(i3)).dialogId));
                    } else if (i3 <= size) {
                        size--;
                    }
                }
                z2 = false;
            }
            StoryViewer orCreateStoryViewer = dialogStoriesCell.fragment.getOrCreateStoryViewer();
            orCreateStoryViewer.doOnAnimationReady(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.storiesController.setLoading(j, false);
                }
            });
            orCreateStoryViewer.open(dialogStoriesCell.getContext(), null, arrayList, size, null, null, StoriesListPlaceProvider.of(dialogStoriesCell.recyclerListView).with(new StoriesListPlaceProvider.LoadNextInterface() {
                @Override
                public final void loadNext(boolean z4) {
                    DialogStoriesCell.m4308$r8$lambda$x0us1vaudtfA_a2EN8Y0lqrdM8(this.f$0, z2, z4);
                }
            }).setPaginationParaments(dialogStoriesCell.type == 1, z3, z2), false);
        }
        z3 = false;
        StoryViewer orCreateStoryViewer2 = dialogStoriesCell.fragment.getOrCreateStoryViewer();
        orCreateStoryViewer2.doOnAnimationReady(new Runnable() {
            @Override
            public final void run() {
                this.f$0.storiesController.setLoading(j, false);
            }
        });
        orCreateStoryViewer2.open(dialogStoriesCell.getContext(), null, arrayList, size, null, null, StoriesListPlaceProvider.of(dialogStoriesCell.recyclerListView).with(new StoriesListPlaceProvider.LoadNextInterface() {
            @Override
            public final void loadNext(boolean z4) {
                DialogStoriesCell.m4308$r8$lambda$x0us1vaudtfA_a2EN8Y0lqrdM8(this.f$0, z2, z4);
            }
        }).setPaginationParaments(dialogStoriesCell.type == 1, z3, z2), false);
    }

    public static void m4308$r8$lambda$x0us1vaudtfA_a2EN8Y0lqrdM8(DialogStoriesCell dialogStoriesCell, boolean z, boolean z2) {
        dialogStoriesCell.getClass();
        if (!z && z2) {
            dialogStoriesCell.storiesController.loadNextStories(dialogStoriesCell.type == 1);
        }
    }

    public void checkLoadMore() {
        if (this.layoutManager.findLastVisibleItemPosition() + 10 > this.items.size() || isReadAtPosition(this.layoutManager.findLastVisibleItemPosition() + 9)) {
            this.storiesController.loadNextStories(this.type == 1);
        }
    }

    private boolean isReadAtPosition(int i) {
        return i < this.items.size() && this.storiesController.getUnreadState(((Item) this.items.get(i)).dialogId) == 0;
    }

    public float getOverScrollCoef() {
        return this.overScrollCoef;
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
        ArrayList hiddenList = this.type == 1 ? this.storiesController.getHiddenList() : this.storiesController.getDialogListStories();
        for (int i = 0; i < hiddenList.size(); i++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) hiddenList.get(i)).peer);
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
        if (this.storiesController.hasOnlySelfStories()) {
            if (this.storiesController.hasUploadingStories(UserConfig.getInstance(this.currentAccount).getClientUserId())) {
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    if (this.uploadingString == null) {
                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
                        UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
                        spannableStringBuilderValueOf.setSpan(uploadingDotsSpannable, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 0);
                        uploadingDotsSpannable.setParent(this.titleView, true);
                        this.uploadingString = spannableStringBuilderValueOf;
                    }
                    this.currentTitle = this.uploadingString;
                } else {
                    this.currentTitle = string;
                }
            } else {
                this.currentTitle = this.menuItemsOffset < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.getString(R.string.MyStory);
            }
        } else {
            this.currentTitle = this.menuItemsOffset < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.formatPluralString("Stories", iMax, new Object[0]);
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
            if (((Item) this.items.get(i2)).dialogId != UserConfig.getInstance(this.currentAccount).clientUserId || shouldDrawSelfInMini()) {
                this.miniItems.add((Item) this.items.get(i2));
                if (this.miniItems.size() >= 3) {
                    break;
                }
            }
        }
        if (z) {
            if (this.currentState == 2) {
                this.listViewMini.setItemAnimator(this.miniItemAnimator);
                this.recyclerListView.setItemAnimator(null);
            } else {
                this.recyclerListView.setItemAnimator(this.itemAnimator);
                this.listViewMini.setItemAnimator(null);
            }
        } else {
            this.recyclerListView.setItemAnimator(null);
            this.listViewMini.setItemAnimator(null);
        }
        this.adapter.setItems(this.oldItems, this.items);
        this.miniAdapter.setItems(this.oldMiniItems, this.miniItems);
        this.oldItems.clear();
        invalidate();
    }

    private boolean shouldDrawSelfInMini() {
        if (this.storiesController.hasUnreadStories(UserConfig.getInstance(this.currentAccount).clientUserId)) {
            return true;
        }
        return this.storiesController.hasSelfStories() && this.storiesController.getDialogListStories().size() <= 3;
    }

    public static int $r8$lambda$mrKyDE7kqyAfP266l3FH_xwibtA(StoryCell storyCell, StoryCell storyCell2) {
        return storyCell2.position - storyCell.position;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        int childAdapterPosition;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Canvas canvas2;
        float f6;
        boolean z;
        float f7;
        float f8;
        float fDp;
        float f9;
        float fLerp;
        float f10;
        float f11;
        float fLerp2;
        float f12;
        float fLerp3;
        float fLerp4;
        int i;
        int i2;
        float x;
        boolean z2;
        boolean z3;
        boolean z4;
        float f13;
        double dPow;
        int childAdapterPosition2;
        canvas.save();
        int i3 = this.clipTop;
        boolean z5 = false;
        if (i3 > 0) {
            canvas.clipRect(0, i3, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(4.0f);
        float f14 = 0.0f;
        float fLerp5 = AndroidUtilities.lerp(0.0f, measuredHeight, this.collapsedProgress1);
        this.recyclerListView.setTranslationY(fLerp5);
        this.listViewMini.setTranslationY(fLerp5);
        this.listViewMini.setTranslationX(this.menuItemsOffset);
        for (int i4 = 0; i4 < this.viewsDrawInParent.size(); i4++) {
            ((StoryCell) this.viewsDrawInParent.get(i4)).drawInParent = false;
        }
        this.viewsDrawInParent.clear();
        int i5 = this.currentState;
        int i6 = -1;
        if ((i5 == 1 || i5 == 0) && !this.animateToDialogIds.isEmpty()) {
            childAdapterPosition = -1;
            for (int i7 = 0; i7 < this.recyclerListView.getChildCount(); i7++) {
                StoryCell storyCell = (StoryCell) this.recyclerListView.getChildAt(i7);
                if (storyCell.dialogId == ((Long) this.animateToDialogIds.get(0)).longValue()) {
                    childAdapterPosition = this.recyclerListView.getChildAdapterPosition(storyCell);
                }
            }
        } else {
            childAdapterPosition = this.currentState == 2 ? 0 : -1;
        }
        int i8 = this.currentState;
        if (i8 >= 0 && i8 != 2) {
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
                int i9 = 0;
                int i10 = -1;
                while (i9 < this.recyclerListView.getChildCount()) {
                    View childAt = this.recyclerListView.getChildAt(i9);
                    if (childAt.getX() >= f14 && childAt.getX() + childAt.getMeasuredWidth() <= getMeasuredWidth() && (childAdapterPosition2 = this.recyclerListView.getChildAdapterPosition(childAt)) >= 0 && (i10 == i6 || childAdapterPosition2 < i10)) {
                        fLerp5 = fLerp5;
                        if (((Item) this.items.get(childAdapterPosition2)).dialogId != UserConfig.getInstance(this.currentAccount).clientUserId) {
                            this.overscrollSelectedView = (StoryCell) childAt;
                            i10 = childAdapterPosition2;
                        }
                    }
                    i9++;
                    fLerp5 = fLerp5;
                    i6 = -1;
                    f14 = 0.0f;
                }
                f = fLerp5;
                f4 = 2.0f;
                this.overscrollSelectedPosition = i10;
            } else {
                f = fLerp5;
                f4 = 2.0f;
            }
            float f15 = 0.0f;
            int i11 = 0;
            while (i11 < this.recyclerListView.getChildCount()) {
                StoryCell storyCell2 = (StoryCell) this.recyclerListView.getChildAt(i11);
                storyCell2.setClipInParent(z5);
                int childAdapterPosition3 = this.recyclerListView.getChildAdapterPosition(storyCell2);
                float fPow = this.collapsedProgress;
                if (childAdapterPosition3 >= childAdapterPosition && childAdapterPosition3 < this.animateToDialogIds.size() + childAdapterPosition) {
                    int i12 = childAdapterPosition3 - childAdapterPosition;
                    if (i12 == childAdapterPosition + 2) {
                        fPow = this.collapsedProgress;
                    } else {
                        if (i12 == childAdapterPosition + 1) {
                            dPow = Math.pow(this.collapsedProgress, 0.5d);
                        } else {
                            dPow = Math.pow(this.collapsedProgress, 0.25d);
                        }
                        fPow = (float) dPow;
                    }
                }
                if (childAdapterPosition3 < childAdapterPosition) {
                    fPow = (float) Math.pow(this.collapsedProgress, 0.25d);
                }
                storyCell2.setProgressToCollapsed(fPow, this.collapsedProgress2, this.overscrollProgress, this.overscrollSelectedPosition == storyCell2.position);
                if (childAdapterPosition3 > childAdapterPosition && childAdapterPosition3 < this.animateToDialogIds.size() + childAdapterPosition) {
                    StoryCell storyCell3 = (StoryCell) this.recyclerListView.getChildAt(i11 - 1);
                    if (storyCell3 != null) {
                        float fDp2 = AndroidUtilities.dp(48.0f);
                        float fDp3 = AndroidUtilities.dp(26.33f);
                        float fLerp6 = AndroidUtilities.lerp(fDp2, fDp3, storyCell3.progressToCollapsed) + AndroidUtilities.dp(8.0f);
                        float fLerp7 = (AndroidUtilities.lerp(fDp2, fDp3, storyCell2.progressToCollapsed) + AndroidUtilities.dp(8.0f)) / f4;
                        float fCenterX = storyCell3.params.originalAvatarRect.centerX() + storyCell3.getX();
                        float fCenterY = storyCell3.params.originalAvatarRect.centerY() + storyCell3.getY();
                        float fCenterX2 = (storyCell2.params.originalAvatarRect.centerX() + storyCell2.getX()) - fCenterX;
                        float fCenterY2 = (storyCell2.params.originalAvatarRect.centerY() + storyCell2.getY()) - fCenterY;
                        float fSqrt = (float) Math.sqrt((fCenterX2 * fCenterX2) + (fCenterY2 * fCenterY2));
                        float f16 = (fLerp6 / f4) + fLerp7;
                        if (fSqrt < f16) {
                            float degrees = (float) Math.toDegrees(Math.acos(fSqrt / f16) * 2.0d);
                            float degrees2 = (float) Math.toDegrees(Math.atan2(fCenterY2, fCenterX2));
                            float f17 = degrees / f4;
                            StoriesUtilities.AvatarStoryParams avatarStoryParams = storyCell3.params;
                            avatarStoryParams.rightTopAngleToExclude = degrees2 - f17;
                            avatarStoryParams.rightBottomAngleToExclude = degrees2 + f17;
                            float degrees3 = (float) Math.toDegrees(Math.atan2(-fCenterY2, -fCenterX2));
                            float f18 = -Math.abs(degrees3 - f17);
                            float fAbs = Math.abs(degrees3 + f17);
                            StoriesUtilities.AvatarStoryParams avatarStoryParams2 = storyCell2.params;
                            avatarStoryParams2.leftTopAngleToExclude = f18;
                            avatarStoryParams2.leftBottomAngleToExclude = fAbs;
                            f7 = 0.0f;
                        } else {
                            StoriesUtilities.AvatarStoryParams avatarStoryParams3 = storyCell3.params;
                            f7 = 0.0f;
                            avatarStoryParams3.rightTopAngleToExclude = 0.0f;
                            avatarStoryParams3.rightBottomAngleToExclude = 0.0f;
                            StoriesUtilities.AvatarStoryParams avatarStoryParams4 = storyCell2.params;
                            avatarStoryParams4.leftTopAngleToExclude = 0.0f;
                            avatarStoryParams4.leftBottomAngleToExclude = 0.0f;
                        }
                        storyCell3.params.useArcProgress = false;
                        storyCell2.params.useArcProgress = false;
                    } else {
                        f7 = 0.0f;
                    }
                } else {
                    f7 = 0.0f;
                    StoriesUtilities.AvatarStoryParams avatarStoryParams5 = storyCell2.params;
                    avatarStoryParams5.rightTopAngleToExclude = 0.0f;
                    avatarStoryParams5.rightBottomAngleToExclude = 0.0f;
                    avatarStoryParams5.leftTopAngleToExclude = 0.0f;
                    avatarStoryParams5.leftBottomAngleToExclude = 0.0f;
                    avatarStoryParams5.useArcProgress = false;
                }
                float fClamp = Utilities.clamp((this.overscrollProgress - 0.5f) / 0.5f, 1.0f, f7);
                float fDp4 = AndroidUtilities.dp(16.0f) * fClamp;
                float f19 = (float) (((double) ((1.0f - fClamp) * 0.5f)) + 0.5d);
                if (childAdapterPosition3 <= childAdapterPosition) {
                    f8 = 0.0f;
                    fDp = 0.0f;
                } else if (childAdapterPosition3 == childAdapterPosition + 1) {
                    fDp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), 0.0f, this.collapsedProgress) + ((AndroidUtilities.dp(16.0f) * fPow) - AndroidUtilities.dpf2(0.5f));
                    f8 = 0.0f;
                } else {
                    f8 = 0.0f;
                    fDp = ((AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(16.0f) * fPow)) - AndroidUtilities.dpf2(0.5f)) + AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), 0.0f, this.collapsedProgress);
                }
                float f20 = fDp + this.menuItemsOffset;
                if (!this.collapsed) {
                    if (this.overscrollProgress <= f8) {
                        f13 = 0.0f;
                    } else {
                        int i13 = storyCell2.position;
                        int i14 = this.overscrollSelectedPosition;
                        if (i13 < i14) {
                            f13 = -fDp4;
                        } else if (i13 > i14) {
                            f13 = fDp4;
                        } else {
                            f13 = 0.0f;
                        }
                    }
                    fLerp = AndroidUtilities.lerp(f20 - storyCell2.getLeft(), f13, 1.0f - this.expandOvershootAnimatorProgress);
                    f9 = 0.0f;
                } else {
                    f9 = 0.0f;
                    fLerp = AndroidUtilities.lerp(0.0f, f20 - storyCell2.getLeft(), this.storiesCollapseInterpolator.getInterpolation(this.collapsedOvershootProgress));
                }
                float fClamp2 = MathUtils.clamp((this.collapsedProgress1 - 0.2f) / 0.1f, f9, 1.0f);
                int i15 = childAdapterPosition3 - childAdapterPosition;
                if (i15 == 0) {
                    f10 = 0.65f;
                    fLerp2 = AndroidUtilities.lerp(f9, f - measuredHeight, CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.collapsedProgress));
                } else {
                    f10 = 0.65f;
                    if (i15 == 1) {
                        fLerp2 = AndroidUtilities.lerp(f9, (f - measuredHeight) * 0.65f, CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.collapsedProgress));
                    } else {
                        f11 = 0.0f;
                    }
                    if (storyCell2.position == this.overscrollSelectedPosition || this.overscrollProgress <= f9) {
                        f12 = 0.0f;
                    } else {
                        f12 = (-fDp4) / f4;
                    }
                    if (i15 == 0) {
                        fLerp3 = AndroidUtilities.lerp(f12, f - measuredHeight, this.yStoriesProgress);
                    } else if (i15 == 1) {
                        fLerp3 = AndroidUtilities.lerp(f12, (f - measuredHeight) * f10, this.yStoriesProgress);
                    } else {
                        fLerp3 = 0.0f;
                    }
                    fLerp4 = AndroidUtilities.lerp(fLerp3, f11, fClamp2);
                    if (this.collapsedProgress > 0.0f) {
                        if (childAdapterPosition3 >= childAdapterPosition || childAdapterPosition3 > childAdapterPosition + 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z && i15 >= 0 && i15 < this.animateToDialogIds.size()) {
                            storyCell2.setCrossfadeTo(((Long) this.animateToDialogIds.get(i15)).longValue());
                        } else {
                            storyCell2.setCrossfadeTo(-1L);
                        }
                        storyCell2.drawInParent = z2;
                        if (childAdapterPosition3 == childAdapterPosition) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        storyCell2.isFirst = z3;
                        if (childAdapterPosition3 >= (this.animateToDialogIds.size() + childAdapterPosition) - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        storyCell2.isLast = z4;
                        storyCell2.setTranslationX(fLerp);
                        storyCell2.setTranslationY(fLerp4);
                        if (z2) {
                            this.viewsDrawInParent.add(storyCell2);
                        }
                    } else if (this.recyclerListView.getItemAnimator() != null || !this.recyclerListView.getItemAnimator().isRunning()) {
                        if (this.overscrollProgress > 0.0f) {
                            i = storyCell2.position;
                            i2 = this.overscrollSelectedPosition;
                            if (i >= i2 || i > i2) {
                                storyCell2.setAlpha(f19);
                            } else {
                                storyCell2.setAlpha(1.0f);
                            }
                        } else {
                            storyCell2.setAlpha(1.0f);
                        }
                        storyCell2.setTranslationX(fLerp);
                        storyCell2.setTranslationY(fLerp4);
                    }
                    if (storyCell2.drawInParent) {
                        x = this.recyclerListView.getX() + storyCell2.getX() + (storyCell2.getMeasuredWidth() / f4) + (AndroidUtilities.dp(70.0f) / f4);
                        if (f15 != 0.0f || x > f15) {
                            f15 = x;
                        }
                    }
                    i11++;
                    measuredHeight = measuredHeight;
                    z = z;
                    z5 = false;
                }
                f11 = fLerp2;
                if (storyCell2.position == this.overscrollSelectedPosition) {
                    f12 = 0.0f;
                } else {
                    f12 = 0.0f;
                }
                if (i15 == 0) {
                    fLerp3 = AndroidUtilities.lerp(f12, f - measuredHeight, this.yStoriesProgress);
                } else if (i15 == 1) {
                    fLerp3 = AndroidUtilities.lerp(f12, (f - measuredHeight) * f10, this.yStoriesProgress);
                } else {
                    fLerp3 = 0.0f;
                }
                fLerp4 = AndroidUtilities.lerp(fLerp3, f11, fClamp2);
                if (this.collapsedProgress > 0.0f) {
                    if (childAdapterPosition3 >= childAdapterPosition) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (!z) {
                        storyCell2.setCrossfadeTo(-1L);
                    } else {
                        storyCell2.setCrossfadeTo(-1L);
                    }
                    storyCell2.drawInParent = z2;
                    if (childAdapterPosition3 == childAdapterPosition) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    storyCell2.isFirst = z3;
                    if (childAdapterPosition3 >= (this.animateToDialogIds.size() + childAdapterPosition) - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    storyCell2.isLast = z4;
                    storyCell2.setTranslationX(fLerp);
                    storyCell2.setTranslationY(fLerp4);
                    if (z2) {
                        this.viewsDrawInParent.add(storyCell2);
                    }
                } else if (this.recyclerListView.getItemAnimator() != null) {
                    if (this.overscrollProgress > 0.0f) {
                        i = storyCell2.position;
                        i2 = this.overscrollSelectedPosition;
                        if (i >= i2) {
                            storyCell2.setAlpha(f19);
                        } else {
                            storyCell2.setAlpha(1.0f);
                        }
                    } else {
                        storyCell2.setAlpha(1.0f);
                    }
                    storyCell2.setTranslationX(fLerp);
                    storyCell2.setTranslationY(fLerp4);
                } else {
                    if (this.overscrollProgress > 0.0f) {
                        i = storyCell2.position;
                        i2 = this.overscrollSelectedPosition;
                        if (i >= i2) {
                            storyCell2.setAlpha(f19);
                        } else {
                            storyCell2.setAlpha(1.0f);
                        }
                    } else {
                        storyCell2.setAlpha(1.0f);
                    }
                    storyCell2.setTranslationX(fLerp);
                    storyCell2.setTranslationY(fLerp4);
                }
                if (storyCell2.drawInParent) {
                    x = this.recyclerListView.getX() + storyCell2.getX() + (storyCell2.getMeasuredWidth() / f4) + (AndroidUtilities.dp(70.0f) / f4);
                    if (f15 != 0.0f) {
                        f15 = x;
                    } else {
                        f15 = x;
                    }
                }
                i11++;
                measuredHeight = measuredHeight;
                z = z;
                z5 = false;
            }
            f5 = f15;
        } else {
            f = fLerp5;
            f2 = 4.0f;
            f3 = 16.0f;
            f4 = 2.0f;
            float f21 = 0.0f;
            for (int i16 = 0; i16 < this.listViewMini.getChildCount(); i16++) {
                StoryCell storyCell4 = (StoryCell) this.listViewMini.getChildAt(i16);
                float x2 = this.listViewMini.getX() + storyCell4.getX() + storyCell4.getMeasuredWidth();
                if (f21 == 0.0f || x2 > f21) {
                    f21 = x2;
                }
            }
            f5 = f21;
        }
        if (this.premiumHint != null) {
            float fLerp8 = AndroidUtilities.lerp(29, 74, CubicBezierInterpolator.EASE_OUT.getInterpolation(this.collapsedProgress));
            if (this.recyclerListView.getChildCount() > 0) {
                fLerp8 += this.recyclerListView.getChildAt(0).getLeft();
            }
            this.premiumHint.setJoint(0.0f, fLerp8);
        }
        float fMin = Math.min(this.collapsedProgress, this.collapsedProgress2);
        float visibleItemsMeasuredWidthWithAlpha = (this.actionBar.menu.getVisibleItemsMeasuredWidthWithAlpha() * fMin) - AndroidUtilities.dp(6.0f);
        boolean z6 = fMin != 0.0f && visibleItemsMeasuredWidthWithAlpha > 0.0f;
        if (z6) {
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
            this.titleView.setTranslationY((((f + AndroidUtilities.dp(14.0f)) - measuredHeight2) + AndroidUtilities.dp(f2)) - (AndroidUtilities.dp(6.0f) * this.subtitleOverlayContainer.getTotalVisibility()));
            int iDp = AndroidUtilities.dp(72.0f);
            float avatarRight = f5 + (-iDp) + getAvatarRight(iDp, this.collapsedProgress) + AndroidUtilities.dp(12.0f);
            this.titleView.setTranslationX(avatarRight);
            this.titleView.getDrawable().setRightPadding((avatarRight - AndroidUtilities.dp(12.0f)) + (this.actionBar.menu.getVisibleItemsMeasuredWidthWithAlpha() * fMin));
            this.telegramLogoView.setTranslationX(this.titleView.getTranslationX() + AndroidUtilities.dp(1.0f));
            this.telegramLogoView.setTranslationY(f + AndroidUtilities.dp(22.333f) + totalVisibility);
            this.emojiStatusView.setTranslationX((this.titleView.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + this.telegramLogoView.getMeasuredWidth());
            this.emojiStatusView.setTranslationY(f + AndroidUtilities.dp(11.333f) + totalVisibility);
            this.subtitleOverlayContainer.setTranslationX(this.titleView.getTranslationX());
            this.subtitleOverlayContainer.setTranslationY(f + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i17 = this.currentState;
        if (i17 >= 0 && i17 != 2) {
            Collections.sort(this.viewsDrawInParent, this.comparator);
            for (int i18 = 0; i18 < this.viewsDrawInParent.size(); i18++) {
                StoryCell storyCell5 = (StoryCell) this.viewsDrawInParent.get(i18);
                canvas2.save();
                canvas2.translate(this.recyclerListView.getX() + storyCell5.getX(), this.recyclerListView.getY() + storyCell5.getY());
                storyCell5.draw(canvas2);
                canvas2.restore();
            }
        }
        if (z6) {
            float fDp5 = AndroidUtilities.dp(f3);
            if (this.ellipsizeGradient == null) {
                f6 = fDp5;
                this.ellipsizeGradient = new LinearGradient(0.0f, 0.0f, f6, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.ellipsizeGradientMatrix = new Matrix();
                Paint paint = new Paint(1);
                this.ellipsizePaint = paint;
                paint.setShader(this.ellipsizeGradient);
                this.ellipsizePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            } else {
                f6 = fDp5;
            }
            this.ellipsizeGradientMatrix.reset();
            this.ellipsizeGradientMatrix.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - f6, 0.0f);
            this.ellipsizeGradient.setLocalMatrix(this.ellipsizeGradientMatrix);
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - f6, 0.0f, AndroidUtilities.dp(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.ellipsizePaint);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateItems(false, false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        this.ellipsizeSpanAnimator.onAttachedToWindow();
        this.statusDrawable.attach();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        this.ellipsizeSpanAnimator.onDetachedFromWindow();
        StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.globalCancelable;
        if (ensureStoryFileLoadedObject != null) {
            ensureStoryFileLoadedObject.cancel();
            this.globalCancelable = null;
        }
        this.statusDrawable.detach();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.titleView.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.currentCellWidth = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), 1073741824));
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesUpdated && this.allowGlobalUpdates) {
            updateItems(getVisibility() == 0, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.checkLoadMore();
                }
            });
        }
    }

    public void setProgressToCollapse(float f) {
        setProgressToCollapse(f, true);
    }

    public void setProgressToCollapse(float f, boolean z) {
        if (this.collapsedProgress1 == f) {
            return;
        }
        this.collapsedProgress1 = f;
        checkCollapsedProgress();
        final boolean z2 = f > this.K;
        if (z2 != this.collapsed) {
            this.collapsed = z2;
            AnimatorSet animatorSet = this.storiesAnimatorSet;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.storiesAnimatorSet.cancel();
                this.storiesAnimatorSet = null;
            }
            if (z) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.collapsedProgress2, z2 ? 1.0f : 0.0f);
                this.valueAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        DialogStoriesCell.$r8$lambda$kIGiKkjtJiH8mQngDb3JNuAxbiI(this.f$0, valueAnimator);
                    }
                });
                this.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                float f2 = this.collapsedProgress1;
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, z2 ? f2 : 0.0f);
                this.yStoriesAnimator = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        DialogStoriesCell.$r8$lambda$bZ_RG7GVZQQHHYuOWKequuNYPmo(this.f$0, valueAnimator);
                    }
                });
                this.yStoriesAnimator.setDuration(100L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.storiesAnimatorSet = animatorSet2;
                animatorSet2.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        DialogStoriesCell.this.collapsedProgress2 = z2 ? 1.0f : 0.0f;
                        DialogStoriesCell.this.checkCollapsedProgress();
                    }

                    @Override
                    public void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        try {
                            DialogStoriesCell.this.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                });
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.valueAnimator);
                arrayList.add(this.yStoriesAnimator);
                if (this.collapsed) {
                    this.storiesAnimatorSet.setDuration(1000L);
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.collapsedProgress2, z2 ? 1.0f : 0.0f);
                    this.collapsedOvershootAnimator = valueAnimatorOfFloat3;
                    valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            DialogStoriesCell.$r8$lambda$zqIIp3EJWOVI4CjAbihX_sd7fcM(this.f$0, valueAnimator);
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
                    this.expandOvershootAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            DialogStoriesCell.$r8$lambda$dxsLqT6ug588TK9Bhx3kN2t3vD0(this.f$0, valueAnimator);
                        }
                    });
                    arrayList.add(this.expandOvershootAnimator);
                }
                this.storiesAnimatorSet.playTogether(arrayList);
                this.storiesAnimatorSet.start();
                return;
            }
            this.collapsedProgress2 = z2 ? 1.0f : 0.0f;
            checkCollapsedProgress();
            AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ((View) obj).setTranslationY(0.0f);
                }
            });
        }
    }

    public static void $r8$lambda$kIGiKkjtJiH8mQngDb3JNuAxbiI(DialogStoriesCell dialogStoriesCell, ValueAnimator valueAnimator) {
        dialogStoriesCell.getClass();
        dialogStoriesCell.collapsedProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dialogStoriesCell.checkCollapsedProgress();
    }

    public static void $r8$lambda$bZ_RG7GVZQQHHYuOWKequuNYPmo(DialogStoriesCell dialogStoriesCell, ValueAnimator valueAnimator) {
        dialogStoriesCell.getClass();
        dialogStoriesCell.yStoriesProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static void $r8$lambda$zqIIp3EJWOVI4CjAbihX_sd7fcM(DialogStoriesCell dialogStoriesCell, ValueAnimator valueAnimator) {
        dialogStoriesCell.getClass();
        dialogStoriesCell.collapsedOvershootProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public static void $r8$lambda$dxsLqT6ug588TK9Bhx3kN2t3vD0(DialogStoriesCell dialogStoriesCell, ValueAnimator valueAnimator) {
        dialogStoriesCell.getClass();
        dialogStoriesCell.expandOvershootAnimatorProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dialogStoriesCell.invalidate();
    }

    public void checkCollapsedProgress() {
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

    public float getCollapsedProgress() {
        return this.collapsedProgress;
    }

    public void scrollToFirstCell() {
        this.layoutManager.scrollToPositionWithOffset(0, 0);
    }

    public void updateColors() {
        StoriesUtilities.updateColors();
        final int textColor = getTextColor();
        this.titleView.setTextColor(getTextLogoColor());
        ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = this.subtitleOverlayContainer;
        if (actionBarAnimatedSubtitleOverlayContainer != null) {
            actionBarAnimatedSubtitleOverlayContainer.updateColors();
        }
        this.telegramLogoView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, new Consumer() {
            @Override
            public final void accept(Object obj) {
                DialogStoriesCell.$r8$lambda$Elfeqd_jiE4bOsxLma6AIZYknaU(textColor, (View) obj);
            }
        });
        AndroidUtilities.forEachViews((RecyclerView) this.listViewMini, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ((DialogStoriesCell.StoryCell) ((View) obj)).invalidate();
            }
        });
    }

    public static void $r8$lambda$Elfeqd_jiE4bOsxLma6AIZYknaU(int i, View view) {
        StoryCell storyCell = (StoryCell) view;
        storyCell.invalidate();
        storyCell.textView.setTextColor(i);
    }

    private int getTextLogoColor() {
        return getThemedColor(Theme.key_telegram_color_dialogsLogo);
    }

    public int getTextColor() {
        if (this.type == 0) {
            return getThemedColor(Theme.key_actionBarDefaultTitle);
        }
        return getThemedColor(Theme.key_actionBarDefaultArchivedTitle);
    }

    public boolean scrollTo(long j) {
        int i = 0;
        while (true) {
            if (i >= this.items.size()) {
                i = -1;
                break;
            }
            if (((Item) this.items.get(i)).dialogId == j) {
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

    public void afterNextLayout(Runnable runnable) {
        this.afterNextLayout.add(runnable);
    }

    public boolean isExpanded() {
        int i = this.currentState;
        return i == 0 || i == 1;
    }

    public boolean isFullExpanded() {
        return this.currentState == 0;
    }

    public boolean scrollToFirst() {
        if (this.layoutManager.findFirstVisibleItemPosition() == 0) {
            return false;
        }
        this.recyclerListView.smoothScrollToPosition(0);
        return true;
    }

    public void openStoryRecorder() {
        openStoryRecorder(0L);
    }

    public void openStoryRecorder(final long j) {
        final StoryCell storyCell;
        StoriesController.StoryLimit storyLimitCheckStoryLimit;
        if (j == 0 && (storyLimitCheckStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit()) != null && storyLimitCheckStoryLimit.active(this.currentAccount)) {
            this.fragment.showDialog(new LimitReachedBottomSheet(this.fragment, getContext(), storyLimitCheckStoryLimit.getLimitReachedType(), this.currentAccount, null));
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
        if (j != 0) {
            BaseFragment baseFragment = this.fragment;
            Theme.ResourcesProvider resourceProvider = baseFragment != null ? baseFragment.getResourceProvider() : null;
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3, resourceProvider);
            alertDialog.showDelayed(500L);
            MessagesController.getInstance(this.currentAccount).getStoriesController().canSendStoryFor(j, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    DialogStoriesCell.$r8$lambda$9dz_S7ZA65t4PpNWPtYlquc69sE(this.f$0, alertDialog, j, storyCell, (Boolean) obj);
                }
            }, true, resourceProvider);
            return;
        }
        StoryRecorder.getInstance(this.fragment.getParentActivity(), this.currentAccount).open(StoryRecorder.SourceView.fromStoryCell(storyCell));
    }

    public static void $r8$lambda$9dz_S7ZA65t4PpNWPtYlquc69sE(DialogStoriesCell dialogStoriesCell, AlertDialog alertDialog, long j, StoryCell storyCell, Boolean bool) {
        dialogStoriesCell.getClass();
        alertDialog.dismiss();
        if (bool.booleanValue()) {
            StoryRecorder.getInstance(dialogStoriesCell.fragment.getParentActivity(), dialogStoriesCell.currentAccount).selectedPeerId(j).canChangePeer(false).open(StoryRecorder.SourceView.fromStoryCell(storyCell));
        }
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

    public void setClipTop(int i) {
        if (i < 0) {
            i = 0;
        }
        if (this.clipTop != i) {
            this.clipTop = i;
            invalidate();
        }
    }

    public void openSelfStories() {
        if (this.storiesController.hasSelfStories()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.currentAccount).clientUserId));
            this.fragment.getOrCreateStoryViewer().open(getContext(), null, arrayList, 0, null, null, StoriesListPlaceProvider.of(this.listViewMini), false);
        }
    }

    public void onResume() {
        this.storiesController.checkExpiredStories();
        for (int i = 0; i < this.items.size(); i++) {
            TL_stories.PeerStories stories = this.storiesController.getStories(((Item) this.items.get(i)).dialogId);
            if (stories != null) {
                this.storiesController.preloadUserStories(stories);
            }
        }
    }

    public void setOverscroll(float f) {
        this.overscrollProgress = f / AndroidUtilities.dp(90.0f);
        invalidate();
        this.recyclerListView.invalidate();
    }

    public boolean openOverscrollSelectedStory() {
        ValueAnimator valueAnimator = this.expandOvershootAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return false;
        }
        openStoryForCell(this.overscrollSelectedView, true);
        return true;
    }

    public void setActionBar(ActionBar actionBar) {
        this.actionBar = actionBar;
    }

    public float overscrollProgress() {
        return this.overscrollProgress;
    }

    private class Adapter extends AdapterWithDiffUtils {
        boolean mini;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public Adapter(boolean z) {
            this.mini = z;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            StoryCell storyCell = DialogStoriesCell.this.new StoryCell(viewGroup.getContext());
            storyCell.mini = this.mini;
            if (this.mini) {
                storyCell.setProgressToCollapsed(1.0f, 1.0f, 0.0f, false);
            }
            return new RecyclerListView.Holder(storyCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            StoryCell storyCell = (StoryCell) viewHolder.itemView;
            storyCell.position = i;
            if (this.mini) {
                storyCell.setDialogId(((Item) DialogStoriesCell.this.miniItems.get(i)).dialogId);
            } else {
                storyCell.setDialogId(((Item) DialogStoriesCell.this.items.get(i)).dialogId);
            }
        }

        @Override
        public int getItemCount() {
            return (this.mini ? DialogStoriesCell.this.miniItems : DialogStoriesCell.this.items).size();
        }
    }

    class Item extends AdapterWithDiffUtils.Item {
        final long dialogId;

        public Item(long j) {
            super(0, false);
            this.dialogId = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Item) && this.dialogId == ((Item) obj).dialogId;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.dialogId));
        }
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

    public class StoryCell extends FrameLayout {
        AvatarDrawable avatarDrawable;
        public ImageReceiver avatarImage;
        private float bounceScale;
        public StoriesUtilities.EnsureStoryFileLoadedObject cancellable;
        TLRPC.Chat chat;
        AvatarDrawable crossfadeAvatarDrawable;
        public ImageReceiver crossfadeToAvatarImage;
        boolean crossfadeToDialog;
        long crossfadeToDialogId;
        private float cx;
        private float cy;
        long dialogId;
        public boolean drawAvatar;
        public boolean drawInParent;
        private final AnimatedFloat failT;
        boolean isFail;
        public boolean isFirst;
        public boolean isLast;
        boolean isSelf;
        private boolean isUploadingState;
        private boolean mini;
        private float overscrollProgress;
        public final StoriesUtilities.AvatarStoryParams params;
        public int position;
        float progressToCollapsed;
        float progressToCollapsed2;
        boolean progressWasDrawn;
        public RadialProgress radialProgress;
        private boolean selectedForOverscroll;
        float textAlpha;
        float textAlphaTransition;
        SimpleTextView textView;
        FrameLayout textViewContainer;
        TLRPC.User user;
        private Drawable verifiedDrawable;

        public StoryCell(Context context) {
            super(context);
            this.avatarDrawable = new AvatarDrawable();
            this.avatarImage = new ImageReceiver(this);
            this.crossfadeToAvatarImage = new ImageReceiver(this);
            this.crossfadeAvatarDrawable = new AvatarDrawable();
            this.drawAvatar = true;
            StoriesUtilities.AvatarStoryParams avatarStoryParams = new StoriesUtilities.AvatarStoryParams(true);
            this.params = avatarStoryParams;
            this.textAlpha = 1.0f;
            this.textAlphaTransition = 1.0f;
            this.bounceScale = 1.0f;
            this.failT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            avatarStoryParams.isArchive = DialogStoriesCell.this.type == 1;
            avatarStoryParams.isDialogStoriesCell = true;
            this.avatarImage.setInvalidateAll(true);
            this.avatarImage.setAllowLoadingOnAttachedOnly(true);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.textViewContainer = frameLayout;
            frameLayout.setClipChildren(false);
            if (!this.mini) {
                setClipChildren(false);
            }
            createTextView();
            addView(this.textViewContainer, LayoutHelper.createFrame(-1, -2.0f));
            this.avatarImage.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
            this.crossfadeToAvatarImage.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        }

        private void createTextView() {
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

        public void setDialogId(long j) {
            TLObject tLObject;
            long j2 = this.dialogId;
            boolean z = j2 == j;
            if (!z && this.cancellable != null) {
                DialogStoriesCell.this.storiesController.setLoading(j2, false);
                this.cancellable.cancel();
                this.cancellable = null;
            }
            this.dialogId = j;
            this.isSelf = j == UserConfig.getInstance(DialogStoriesCell.this.currentAccount).getClientUserId();
            this.isFail = DialogStoriesCell.this.storiesController.isLastUploadingFailed(j);
            if (j > 0) {
                TLRPC.User user = MessagesController.getInstance(DialogStoriesCell.this.currentAccount).getUser(Long.valueOf(j));
                this.user = user;
                this.chat = null;
                tLObject = user;
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(DialogStoriesCell.this.currentAccount).getChat(Long.valueOf(-j));
                this.chat = chat;
                this.user = null;
                tLObject = chat;
            }
            if (tLObject == null) {
                this.textView.setText("");
                this.avatarImage.clearImage();
                return;
            }
            this.avatarDrawable.setInfo(DialogStoriesCell.this.currentAccount, tLObject);
            this.avatarImage.setForUserOrChat(tLObject, this.avatarDrawable);
            if (this.mini) {
                return;
            }
            this.textView.setRightDrawable((Drawable) null);
            if (DialogStoriesCell.this.storiesController.isLastUploadingFailed(j)) {
                this.textView.setTextSize(10);
                this.textView.setText(LocaleController.getString(R.string.FailedStory));
                this.isUploadingState = false;
                return;
            }
            if (!Utilities.isNullOrEmpty(DialogStoriesCell.this.storiesController.getUploadingStories(j))) {
                this.textView.setTextSize(10);
                StoriesUtilities.applyUploadingStr(this.textView, true, false);
                this.isUploadingState = true;
                return;
            }
            if (DialogStoriesCell.this.storiesController.getEditingStory(j) != null) {
                this.textView.setTextSize(10);
                StoriesUtilities.applyUploadingStr(this.textView, true, false);
                this.isUploadingState = true;
                return;
            }
            if (this.isSelf) {
                if (z && this.isUploadingState && !this.mini) {
                    final SimpleTextView simpleTextView = this.textView;
                    createTextView();
                    if (DialogStoriesCell.this.textAnimator != null) {
                        DialogStoriesCell.this.textAnimator.cancel();
                        DialogStoriesCell.this.textAnimator = null;
                    }
                    DialogStoriesCell.this.textAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                    DialogStoriesCell.this.textAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            DialogStoriesCell.StoryCell.$r8$lambda$H8govuMrSExAMNCUjH0izRsRzZQ(this.f$0, simpleTextView, valueAnimator);
                        }
                    });
                    DialogStoriesCell.this.textAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            DialogStoriesCell.this.textAnimator = null;
                            AndroidUtilities.removeFromParent(simpleTextView);
                        }
                    });
                    DialogStoriesCell.this.textAnimator.setDuration(150L);
                    this.textView.setAlpha(0.0f);
                    this.textView.setTranslationY(AndroidUtilities.dp(5.0f));
                    DialogStoriesCell.this.animationRunnable = new Runnable() {
                        @Override
                        public final void run() {
                            DialogStoriesCell.StoryCell.m4309$r8$lambda$Ncll0VsR_VlZQLC9COQA7Mjr0(this.f$0);
                        }
                    };
                }
                AndroidUtilities.runOnUIThread(DialogStoriesCell.this.animationRunnable, 500L);
                this.isUploadingState = false;
                this.textView.setTextSize(10);
                this.textView.setText(LocaleController.getString(R.string.MyStory));
                return;
            }
            if (this.user != null) {
                this.textView.setTextSize(11);
                String str = this.user.first_name;
                String strTrim = str != null ? str.trim() : "";
                int iIndexOf = strTrim.indexOf(" ");
                if (iIndexOf > 0) {
                    strTrim = strTrim.substring(0, iIndexOf);
                }
                if (this.user.verified) {
                    if (this.verifiedDrawable == null) {
                        this.verifiedDrawable = DialogStoriesCell.this.createVerifiedDrawable();
                    }
                    this.textView.setText(Emoji.replaceEmoji(strTrim, this.textView.getPaint().getFontMetricsInt(), false));
                    this.textView.setRightDrawable(this.verifiedDrawable);
                    return;
                }
                this.textView.setText(Emoji.replaceEmoji(strTrim, this.textView.getPaint().getFontMetricsInt(), false));
                this.textView.setRightDrawable((Drawable) null);
                return;
            }
            this.textView.setTextSize(11);
            this.textView.setText(Emoji.replaceEmoji(this.chat.title, this.textView.getPaint().getFontMetricsInt(), false));
            this.textView.setRightDrawable((Drawable) null);
        }

        public static void $r8$lambda$H8govuMrSExAMNCUjH0izRsRzZQ(StoryCell storyCell, View view, ValueAnimator valueAnimator) {
            storyCell.getClass();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = 1.0f - fFloatValue;
            view.setAlpha(f);
            view.setTranslationY((-AndroidUtilities.dp(5.0f)) * fFloatValue);
            storyCell.textView.setAlpha(fFloatValue);
            storyCell.textView.setTranslationY(AndroidUtilities.dp(5.0f) * f);
        }

        public static void m4309$r8$lambda$Ncll0VsR_VlZQLC9COQA7Mjr0(StoryCell storyCell) {
            if (DialogStoriesCell.this.textAnimator != null) {
                DialogStoriesCell.this.textAnimator.start();
            }
            DialogStoriesCell.this.animationRunnable = null;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.mini ? AndroidUtilities.dp(70.0f) : DialogStoriesCell.this.currentCellWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
        }

        float getCy() {
            float fDp = AndroidUtilities.dp(48.0f);
            float fDp2 = AndroidUtilities.dp(26.33f);
            return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (ActionBar.getCurrentActionBarHeight() - fDp2) / 2.0f, DialogStoriesCell.this.collapsedProgress1) + (AndroidUtilities.lerp(fDp, fDp2, this.progressToCollapsed) / 2.0f);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            boolean z;
            Paint unreadCirclePaint;
            boolean z2;
            RadialProgress radialProgress;
            Canvas canvas2 = canvas;
            float fDp = AndroidUtilities.dp(48.0f);
            float fDp2 = AndroidUtilities.dp(26.33f);
            float fDp3 = AndroidUtilities.dp(8.0f) * Utilities.clamp(DialogStoriesCell.this.overscrollProgress / 0.5f, 1.0f, 0.0f);
            if (this.selectedForOverscroll) {
                fDp3 += AndroidUtilities.dp(16.0f) * Utilities.clamp((DialogStoriesCell.this.overscrollProgress - 0.5f) / 0.5f, 1.0f, 0.0f);
            }
            float fLerp = AndroidUtilities.lerp(fDp + fDp3, fDp2, this.progressToCollapsed);
            float f4 = fLerp / 2.0f;
            float measuredWidth = (getMeasuredWidth() / 2.0f) - f4;
            float fLerp2 = AndroidUtilities.lerp(measuredWidth, 0.0f, this.progressToCollapsed);
            float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (ActionBar.getCurrentActionBarHeight() - fDp2) / 2.0f, this.progressToCollapsed);
            float fClamp = Utilities.clamp(this.progressToCollapsed / 0.5f, 1.0f, 0.0f);
            StoriesUtilities.AvatarStoryParams avatarStoryParams = this.params;
            avatarStoryParams.drawSegments = true;
            if (!avatarStoryParams.forceAnimateProgressToSegments) {
                avatarStoryParams.progressToSegments = 1.0f - DialogStoriesCell.this.collapsedProgress2;
            }
            float f5 = fLerp3 + fLerp;
            this.params.originalAvatarRect.set(fLerp2, fLerp3, fLerp2 + fLerp, f5);
            this.params.additionalInset = AndroidUtilities.dpf2(1.33f) * this.progressToCollapsed;
            this.avatarImage.setAlpha(1.0f);
            this.avatarImage.setRoundRadius((int) f4);
            float f6 = fLerp2 + f4;
            this.cx = f6;
            float f7 = fLerp3 + f4;
            this.cy = f7;
            if (DialogStoriesCell.this.type == 0) {
                DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
                f = 1.0f;
                dialogStoriesCell.backgroundPaint.setColor(dialogStoriesCell.getThemedColor(Theme.key_actionBarDefault));
            } else {
                f = 1.0f;
                DialogStoriesCell dialogStoriesCell2 = DialogStoriesCell.this;
                dialogStoriesCell2.backgroundPaint.setColor(dialogStoriesCell2.getThemedColor(Theme.key_actionBarDefaultArchived));
            }
            if (this.progressToCollapsed != 0.0f) {
                canvas2.drawCircle(this.cx, this.cy, AndroidUtilities.dpf2(1.5f) + f4, DialogStoriesCell.this.backgroundPaint);
            }
            canvas2.save();
            float f8 = this.bounceScale;
            canvas2.scale(f8, f8, this.cx, this.cy);
            if (this.radialProgress == null) {
                this.radialProgress = DialogStoriesCell.this.radialProgress;
            }
            ArrayList uploadingAndEditingStories = DialogStoriesCell.this.storiesController.getUploadingAndEditingStories(this.dialogId);
            boolean z3 = (uploadingAndEditingStories == null || uploadingAndEditingStories.isEmpty()) ? false : true;
            if (z3 || (this.progressWasDrawn && (radialProgress = this.radialProgress) != null && radialProgress.getAnimatedProgress() < 0.98f)) {
                fLerp2 = fLerp2;
                f2 = fLerp3;
                if (!z3) {
                    z = DialogStoriesCell.this.lastUploadingCloseFriends;
                    f3 = 1.0f;
                } else {
                    float f9 = 0.0f;
                    for (int i = 0; i < uploadingAndEditingStories.size(); i++) {
                        f9 += ((StoriesController.UploadingStory) uploadingAndEditingStories.get(i)).progress;
                    }
                    int i2 = DialogStoriesCell.this.storiesController.uploadedStories;
                    float size = (i2 + f9) / (i2 + uploadingAndEditingStories.size());
                    DialogStoriesCell dialogStoriesCell3 = DialogStoriesCell.this;
                    boolean zIsCloseFriends = ((StoriesController.UploadingStory) uploadingAndEditingStories.get(uploadingAndEditingStories.size() - 1)).isCloseFriends();
                    dialogStoriesCell3.lastUploadingCloseFriends = zIsCloseFriends;
                    f3 = size;
                    z = zIsCloseFriends;
                }
                invalidate();
                if (this.radialProgress == null) {
                    DialogStoriesCell dialogStoriesCell4 = DialogStoriesCell.this;
                    RadialProgress radialProgress2 = dialogStoriesCell4.radialProgress;
                    if (radialProgress2 != null) {
                        this.radialProgress = radialProgress2;
                    } else {
                        RadialProgress radialProgress3 = new RadialProgress(this);
                        this.radialProgress = radialProgress3;
                        dialogStoriesCell4.radialProgress = radialProgress3;
                        radialProgress3.setBackground(null, true, false);
                    }
                }
                if (this.drawAvatar) {
                    canvas2.save();
                    canvas2.scale(this.params.getScale(), this.params.getScale(), this.params.originalAvatarRect.centerX(), this.params.originalAvatarRect.centerY());
                    this.avatarImage.setImageCoords(this.params.originalAvatarRect);
                    this.avatarImage.draw(canvas2);
                    canvas2.restore();
                }
                this.radialProgress.setDiff(0);
                if (z) {
                    unreadCirclePaint = StoriesUtilities.getCloseFriendsPaint(this.avatarImage);
                } else {
                    unreadCirclePaint = StoriesUtilities.getUnreadCirclePaint(this.avatarImage, true);
                }
                unreadCirclePaint.setAlpha(255);
                this.radialProgress.setPaint(unreadCirclePaint);
                this.radialProgress.setProgressRect((int) (this.avatarImage.getImageX() - AndroidUtilities.dp(3.0f)), (int) (this.avatarImage.getImageY() - AndroidUtilities.dp(3.0f)), (int) (this.avatarImage.getImageX2() + AndroidUtilities.dp(3.0f)), (int) (this.avatarImage.getImageY2() + AndroidUtilities.dp(3.0f)));
                this.radialProgress.setProgress(Utilities.clamp(f3, 1.0f, 0.0f), this.progressWasDrawn);
                if (this.avatarImage.getVisible()) {
                    this.radialProgress.draw(canvas2);
                }
                this.progressWasDrawn = true;
                DialogStoriesCell.this.drawCircleForce = true;
                invalidate();
            } else {
                float f10 = this.failT.set(this.isFail);
                if (this.drawAvatar) {
                    if (this.progressWasDrawn) {
                        StoriesUtilities.AvatarStoryParams avatarStoryParams2 = this.params;
                        avatarStoryParams2.forceAnimateProgressToSegments = true;
                        avatarStoryParams2.progressToSegments = 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                DialogStoriesCell.StoryCell.m4310$r8$lambda$eYeNNiW5WF236pWDrz4A6BMMhs(this.f$0, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                StoryCell.this.params.forceAnimateProgressToSegments = false;
                            }
                        });
                        z2 = true;
                        valueAnimatorOfFloat.setDuration(100L);
                        valueAnimatorOfFloat.start();
                    } else {
                        z2 = true;
                    }
                    StoriesUtilities.AvatarStoryParams avatarStoryParams3 = this.params;
                    float f11 = f10 * avatarStoryParams3.progressToSegments;
                    avatarStoryParams3.animate = this.progressWasDrawn ^ z2;
                    avatarStoryParams3.progressToArc = getArcProgress(this.cx, f4);
                    StoriesUtilities.AvatarStoryParams avatarStoryParams4 = this.params;
                    avatarStoryParams4.isLast = this.isLast;
                    avatarStoryParams4.isFirst = this.isFirst;
                    avatarStoryParams4.alpha = f - f11;
                    boolean z4 = this.isSelf;
                    if (!z4 && this.crossfadeToDialog) {
                        avatarStoryParams4.crossfadeToDialog = this.crossfadeToDialogId;
                        avatarStoryParams4.crossfadeToDialogProgress = this.progressToCollapsed2;
                    } else {
                        avatarStoryParams4.crossfadeToDialog = 0L;
                    }
                    if (z4) {
                        f2 = fLerp3;
                        StoriesUtilities.drawAvatarWithStory(this.dialogId, canvas2, this.avatarImage, DialogStoriesCell.this.storiesController.hasSelfStories(), this.params);
                        canvas2 = canvas;
                    } else {
                        f2 = fLerp3;
                        long j = this.dialogId;
                        canvas2 = canvas;
                        StoriesUtilities.drawAvatarWithStory(j, canvas2, this.avatarImage, DialogStoriesCell.this.storiesController.hasStories(j), this.params);
                    }
                    if (f11 > 0.0f) {
                        Paint errorPaint = StoriesUtilities.getErrorPaint(this.avatarImage);
                        errorPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        errorPaint.setAlpha((int) (255.0f * f11));
                        canvas2.drawCircle(f6, f7, (f4 + AndroidUtilities.dp(4.0f)) * this.params.getScale(), errorPaint);
                    }
                    f10 = f11;
                } else {
                    fLerp2 = fLerp2;
                    fClamp = fClamp;
                    f2 = fLerp3;
                }
                this.progressWasDrawn = false;
                if (this.drawAvatar) {
                    canvas2.save();
                    float f12 = f - fClamp;
                    canvas2.scale(f12, f12, this.cx + AndroidUtilities.dp(16.0f), this.cy + AndroidUtilities.dp(16.0f));
                    drawPlus(canvas2, this.cx, this.cy, 1.0f);
                    drawFail(canvas2, this.cx, this.cy, f10);
                    canvas2.restore();
                }
            }
            canvas2.restore();
            if (this.crossfadeToDialog && this.progressToCollapsed2 > 0.0f) {
                this.crossfadeToAvatarImage.setImageCoords(fLerp2, f2, fLerp, fLerp);
                this.crossfadeToAvatarImage.setAlpha(this.progressToCollapsed2);
                this.crossfadeToAvatarImage.draw(canvas2);
            }
            this.textViewContainer.setTranslationY(f5 + (AndroidUtilities.dp(7.0f) * (1.0f - this.progressToCollapsed)));
            this.textViewContainer.setTranslationX(fLerp2 - measuredWidth);
            if (!this.mini) {
                if (this.isSelf) {
                    this.textAlpha = 1.0f;
                } else {
                    StoriesUtilities.AvatarStoryParams avatarStoryParams5 = this.params;
                    float f13 = avatarStoryParams5.progressToSate;
                    this.textAlpha = avatarStoryParams5.globalState == 2 ? 0.7f : 1.0f;
                }
                float f14 = this.textAlphaTransition * this.textAlpha;
                this.textViewContainer.setAlpha(f14);
                this.textViewContainer.setVisibility(f14 > 0.0f ? 0 : 4);
            }
            super.dispatchDraw(canvas);
        }

        public static void m4310$r8$lambda$eYeNNiW5WF236pWDrz4A6BMMhs(StoryCell storyCell, ValueAnimator valueAnimator) {
            storyCell.params.progressToSegments = AndroidUtilities.lerp(0.0f, 1.0f - DialogStoriesCell.this.collapsedProgress2, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            storyCell.invalidate();
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

        private float getArcProgress(float f, float f2) {
            if (!this.isLast && DialogStoriesCell.this.overscrollProgress <= 0.0f) {
                float fLerp = AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(16.0f), CubicBezierInterpolator.EASE_OUT.getInterpolation(this.progressToCollapsed));
                float fDpf2 = f2 + AndroidUtilities.dpf2(3.5f);
                if (fLerp < fDpf2 * 2.0f) {
                    return ((float) Math.toDegrees(Math.acos((fLerp / 2.0f) / fDpf2))) * 2.0f;
                }
            }
            return 0.0f;
        }

        @Override
        public void setPressed(boolean z) {
            super.setPressed(z);
            if (z) {
                StoriesUtilities.AvatarStoryParams avatarStoryParams = this.params;
                if (avatarStoryParams.buttonBounce == null) {
                    avatarStoryParams.buttonBounce = new ButtonBounce(this, 1.5f, 5.0f);
                }
            }
            ButtonBounce buttonBounce = this.params.buttonBounce;
            if (buttonBounce != null) {
                buttonBounce.setPressed(z);
            }
        }

        @Override
        public void invalidate() {
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
        public void invalidate(int i, int i2, int i3, int i4) {
            if (this.mini || (this.drawInParent && getParent() != null)) {
                ViewParent parent = getParent();
                RecyclerListView recyclerListView = DialogStoriesCell.this.listViewMini;
                if (parent == recyclerListView) {
                    recyclerListView.invalidate();
                }
                DialogStoriesCell.this.invalidate();
            }
            super.invalidate(i, i2, i3, i4);
        }

        public void drawPlus(Canvas canvas, float f, float f2, float f3) {
            DialogStoriesCell dialogStoriesCell;
            int i;
            if (this.isSelf && !DialogStoriesCell.this.storiesController.hasStories(this.dialogId) && Utilities.isNullOrEmpty(DialogStoriesCell.this.storiesController.getUploadingStories(this.dialogId))) {
                float fDp = f + AndroidUtilities.dp(16.0f);
                float fDp2 = f2 + AndroidUtilities.dp(16.0f);
                DialogStoriesCell dialogStoriesCell2 = DialogStoriesCell.this;
                dialogStoriesCell2.addCirclePaint.setColor(Theme.multAlpha(dialogStoriesCell2.getThemedColor(Theme.key_telegram_color), f3));
                if (DialogStoriesCell.this.type == 0) {
                    DialogStoriesCell dialogStoriesCell3 = DialogStoriesCell.this;
                    dialogStoriesCell3.backgroundPaint.setColor(Theme.multAlpha(dialogStoriesCell3.getThemedColor(Theme.key_actionBarDefault), f3));
                } else {
                    DialogStoriesCell dialogStoriesCell4 = DialogStoriesCell.this;
                    dialogStoriesCell4.backgroundPaint.setColor(Theme.multAlpha(dialogStoriesCell4.getThemedColor(Theme.key_actionBarDefaultArchived), f3));
                }
                canvas.drawCircle(fDp, fDp2, AndroidUtilities.dp(11.0f), DialogStoriesCell.this.backgroundPaint);
                canvas.drawCircle(fDp, fDp2, AndroidUtilities.dp(9.0f), DialogStoriesCell.this.addCirclePaint);
                if (DialogStoriesCell.this.type == 0) {
                    dialogStoriesCell = DialogStoriesCell.this;
                    i = Theme.key_actionBarDefault;
                } else {
                    dialogStoriesCell = DialogStoriesCell.this;
                    i = Theme.key_actionBarDefaultArchived;
                }
                int themedColor = dialogStoriesCell.getThemedColor(i);
                if (themedColor != DialogStoriesCell.this.addNewStoryLastColor) {
                    DialogStoriesCell.this.addNewStoryDrawable.setColorFilter(new PorterDuffColorFilter(DialogStoriesCell.this.addNewStoryLastColor = themedColor, PorterDuff.Mode.MULTIPLY));
                }
                DialogStoriesCell.this.addNewStoryDrawable.setAlpha((int) (f3 * 255.0f));
                DialogStoriesCell.this.addNewStoryDrawable.setBounds((int) (fDp - (DialogStoriesCell.this.addNewStoryDrawable.getIntrinsicWidth() / 2.0f)), (int) (fDp2 - (DialogStoriesCell.this.addNewStoryDrawable.getIntrinsicHeight() / 2.0f)), (int) (fDp + (DialogStoriesCell.this.addNewStoryDrawable.getIntrinsicWidth() / 2.0f)), (int) (fDp2 + (DialogStoriesCell.this.addNewStoryDrawable.getIntrinsicHeight() / 2.0f)));
                DialogStoriesCell.this.addNewStoryDrawable.draw(canvas);
            }
        }

        public void drawFail(Canvas canvas, float f, float f2, float f3) {
            if (f3 <= 0.0f) {
                return;
            }
            float fDp = f + AndroidUtilities.dp(17.0f);
            float fDp2 = f2 + AndroidUtilities.dp(17.0f);
            DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
            dialogStoriesCell.addCirclePaint.setColor(Theme.multAlpha(dialogStoriesCell.getThemedColor(Theme.key_text_RedBold), f3));
            if (DialogStoriesCell.this.type == 0) {
                DialogStoriesCell dialogStoriesCell2 = DialogStoriesCell.this;
                dialogStoriesCell2.backgroundPaint.setColor(Theme.multAlpha(dialogStoriesCell2.getThemedColor(Theme.key_actionBarDefault), f3));
            } else {
                DialogStoriesCell dialogStoriesCell3 = DialogStoriesCell.this;
                dialogStoriesCell3.backgroundPaint.setColor(Theme.multAlpha(dialogStoriesCell3.getThemedColor(Theme.key_actionBarDefaultArchived), f3));
            }
            float fDp3 = AndroidUtilities.dp(9.0f) * CubicBezierInterpolator.EASE_OUT_BACK.getInterpolation(f3);
            canvas.drawCircle(fDp, fDp2, AndroidUtilities.dp(2.0f) + fDp3, DialogStoriesCell.this.backgroundPaint);
            canvas.drawCircle(fDp, fDp2, fDp3, DialogStoriesCell.this.addCirclePaint);
            DialogStoriesCell dialogStoriesCell4 = DialogStoriesCell.this;
            dialogStoriesCell4.addCirclePaint.setColor(Theme.multAlpha(dialogStoriesCell4.getTextColor(), f3));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(fDp - AndroidUtilities.dp(1.0f), fDp2 - AndroidUtilities.dpf2(4.6f), AndroidUtilities.dp(1.0f) + fDp, AndroidUtilities.dpf2(1.6f) + fDp2);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), DialogStoriesCell.this.addCirclePaint);
            rectF.set(fDp - AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(2.6f) + fDp2, fDp + AndroidUtilities.dp(1.0f), fDp2 + AndroidUtilities.dpf2(4.6f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), DialogStoriesCell.this.addCirclePaint);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.avatarImage.onAttachedToWindow();
            this.crossfadeToAvatarImage.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.avatarImage.onDetachedFromWindow();
            this.crossfadeToAvatarImage.onDetachedFromWindow();
            this.params.onDetachFromWindow();
            StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.cancellable;
            if (ensureStoryFileLoadedObject != null) {
                ensureStoryFileLoadedObject.cancel();
                this.cancellable = null;
            }
        }

        public void setProgressToCollapsed(float f, float f2, float f3, boolean z) {
            float fClamp;
            if (this.progressToCollapsed != f || this.progressToCollapsed2 != f2 || this.overscrollProgress != f3 || this.selectedForOverscroll != z) {
                this.selectedForOverscroll = z;
                this.progressToCollapsed = f;
                this.progressToCollapsed2 = f2;
                invalidate();
                DialogStoriesCell.this.recyclerListView.invalidate();
            }
            if (this.mini) {
                fClamp = 0.0f;
            } else {
                DialogStoriesCell dialogStoriesCell = DialogStoriesCell.this;
                fClamp = 1.0f - Utilities.clamp(dialogStoriesCell.collapsedProgress / dialogStoriesCell.K, 1.0f, 0.0f);
            }
            this.textAlphaTransition = fClamp;
            float f4 = fClamp * this.textAlpha;
            this.textViewContainer.setAlpha(f4);
            this.textViewContainer.setVisibility(f4 > 0.0f ? 0 : 4);
        }

        public void setCrossfadeTo(long j) {
            TLRPC.Chat chat;
            TLObject tLObject;
            TLRPC.User user;
            if (this.crossfadeToDialogId != j) {
                this.crossfadeToDialogId = j;
                boolean z = j != -1;
                this.crossfadeToDialog = z;
                if (!z) {
                    this.crossfadeToAvatarImage.clearImage();
                    return;
                }
                if (j > 0) {
                    user = MessagesController.getInstance(DialogStoriesCell.this.currentAccount).getUser(Long.valueOf(j));
                    this.user = user;
                    this.chat = null;
                } else {
                    chat = MessagesController.getInstance(DialogStoriesCell.this.currentAccount).getChat(Long.valueOf(-j));
                    this.chat = chat;
                    this.user = null;
                }
                if (tLObject == null) {
                    tLObject = chat;
                    tLObject = user;
                    return;
                } else {
                    tLObject = chat;
                    tLObject = user;
                    this.crossfadeAvatarDrawable.setInfo(DialogStoriesCell.this.currentAccount, tLObject);
                    this.crossfadeToAvatarImage.setForUserOrChat(tLObject, this.crossfadeAvatarDrawable);
                }
            }
        }
    }

    public Drawable createVerifiedDrawable() {
        final Drawable drawableMutate = ContextCompat.getDrawable(getContext(), R.drawable.verified_area).mutate();
        final Drawable drawableMutate2 = ContextCompat.getDrawable(getContext(), R.drawable.verified_check).mutate();
        CombinedDrawable combinedDrawable = new CombinedDrawable(drawableMutate, drawableMutate2) {
            int lastColor;

            @Override
            public void draw(Canvas canvas) {
                DialogStoriesCell dialogStoriesCell;
                int i;
                DialogStoriesCell dialogStoriesCell2;
                int i2;
                if (DialogStoriesCell.this.type == 0) {
                    dialogStoriesCell = DialogStoriesCell.this;
                    i = Theme.key_actionBarDefault;
                } else {
                    dialogStoriesCell = DialogStoriesCell.this;
                    i = Theme.key_actionBarDefaultArchived;
                }
                int themedColor = dialogStoriesCell.getThemedColor(i);
                if (this.lastColor != themedColor) {
                    this.lastColor = themedColor;
                    if (DialogStoriesCell.this.type == 0) {
                        dialogStoriesCell2 = DialogStoriesCell.this;
                        i2 = Theme.key_actionBarDefaultTitle;
                    } else {
                        dialogStoriesCell2 = DialogStoriesCell.this;
                        i2 = Theme.key_actionBarDefaultArchivedTitle;
                    }
                    int themedColor2 = dialogStoriesCell2.getThemedColor(i2);
                    Drawable drawable = drawableMutate;
                    int iBlendARGB = ColorUtils.blendARGB(themedColor2, themedColor, 0.1f);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(iBlendARGB, mode));
                    drawableMutate2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
                }
                super.draw(canvas);
            }
        };
        combinedDrawable.setFullsize(true);
        return combinedDrawable;
    }

    private void updateCurrentState(int i) {
        if (this.currentState == i) {
            return;
        }
        this.currentState = i;
        if (i != 1 && this.updateOnIdleState) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.updateItems(true, false);
                }
            });
        }
        int i2 = this.currentState;
        if (i2 == 0) {
            AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    DialogStoriesCell.$r8$lambda$uphkWwldF1xtsXmD_0Esj8hjJVg((View) obj);
                }
            });
            this.listViewMini.setVisibility(4);
            this.recyclerListView.setVisibility(0);
            checkExpanded();
        } else if (i2 == 1) {
            this.animateToDialogIds.clear();
            for (int i3 = 0; i3 < this.items.size(); i3++) {
                if (((Item) this.items.get(i3)).dialogId != UserConfig.getInstance(this.currentAccount).getClientUserId() || shouldDrawSelfInMini()) {
                    this.animateToDialogIds.add(Long.valueOf(((Item) this.items.get(i3)).dialogId));
                    if (this.animateToDialogIds.size() == 3) {
                        break;
                    }
                }
            }
            this.listViewMini.setVisibility(4);
            this.recyclerListView.setVisibility(0);
        } else if (i2 == 2) {
            this.listViewMini.setVisibility(0);
            this.recyclerListView.setVisibility(4);
            this.layoutManager.scrollToPositionWithOffset(0, 0);
            MessagesController.getInstance(this.currentAccount).getStoriesController().scheduleSort();
            StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.globalCancelable;
            if (ensureStoryFileLoadedObject != null) {
                ensureStoryFileLoadedObject.cancel();
                this.globalCancelable = null;
            }
        }
        invalidate();
    }

    public static void $r8$lambda$uphkWwldF1xtsXmD_0Esj8hjJVg(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    static float getAvatarRight(int i, float f) {
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f) / 2.0f;
        return AndroidUtilities.lerp((i / 2.0f) - fLerp, 0.0f, f) + (fLerp * 2.0f);
    }

    private void checkExpanded() {
        if (System.currentTimeMillis() < this.checkedStoryNotificationDeletion) {
            return;
        }
        this.checkedStoryNotificationDeletion = System.currentTimeMillis() + 60000;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        HintView2 hintView2 = this.premiumHint;
        if (hintView2 != null) {
            hintView2.setTranslationY(f);
        }
    }

    public HintView2 getPremiumHint() {
        return this.premiumHint;
    }

    private HintView2 makePremiumHint() {
        HintView2 hintView2 = this.premiumHint;
        if (hintView2 != null) {
            return hintView2;
        }
        this.premiumHint = new HintView2(getContext(), 1).setBgColor(getThemedColor(Theme.key_undo_background)).setMultilineText(true).setTextAlign(Layout.Alignment.ALIGN_CENTER).setJoint(0.0f, 29.0f);
        SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), Theme.key_undo_cancelColor, 0, new Runnable() {
            @Override
            public final void run() {
                DialogStoriesCell.m4305$r8$lambda$cAxV0LXQaLeTA7TgP2k3qIMUwo(this.f$0);
            }
        });
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilderReplaceSingleTag.getSpans(0, spannableStringBuilderReplaceSingleTag.length(), ClickableSpan.class);
        if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
            spannableStringBuilderReplaceSingleTag.setSpan(new TypefaceSpan(AndroidUtilities.bold()), spannableStringBuilderReplaceSingleTag.getSpanStart(clickableSpanArr[0]), spannableStringBuilderReplaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
        }
        HintView2 hintView3 = this.premiumHint;
        hintView3.setMaxWidthPx(HintView2.cutInFancyHalf(spannableStringBuilderReplaceSingleTag, hintView3.getTextPaint()));
        this.premiumHint.setText(spannableStringBuilderReplaceSingleTag);
        this.premiumHint.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
        if (getParent() instanceof FrameLayout) {
            ((FrameLayout) getParent()).addView(this.premiumHint, LayoutHelper.createFrame(-1, 150, 51));
        }
        return this.premiumHint;
    }

    public static void m4305$r8$lambda$cAxV0LXQaLeTA7TgP2k3qIMUwo(DialogStoriesCell dialogStoriesCell) {
        HintView2 hintView2 = dialogStoriesCell.premiumHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        dialogStoriesCell.fragment.presentFragment(new PremiumPreviewFragment("stories"));
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

    public void updateStatus(TLRPC.User user, boolean z) {
        if (this.statusDrawable == null || this.actionBar == null) {
            return;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
        if (emojiStatusDocumentId != null) {
            boolean z2 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.statusDrawable.set(emojiStatusDocumentId.longValue(), z);
            this.statusDrawable.setParticles(z2, z);
        } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            if (this.premiumStar == null) {
                this.premiumStar = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.premiumStar = new AnimatedEmojiDrawable.WrapSizeDrawable(this.premiumStar, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f)) {
                    @Override
                    public void draw(Canvas canvas) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f));
                        super.draw(canvas);
                        canvas.restore();
                    }
                };
            }
            this.premiumStar.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_profile_verifiedBackground), PorterDuff.Mode.MULTIPLY));
            this.statusDrawable.set(this.premiumStar, z);
            this.statusDrawable.setParticles(false, z);
        } else {
            this.statusDrawable.set((Drawable) null, z);
            this.statusDrawable.setParticles(false, z);
        }
        this.statusDrawable.setColor(Integer.valueOf(getThemedColor(Theme.key_profile_verifiedBackground)));
        this.emojiStatusView.invalidate();
    }

    public int getThemedColor(int i) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getResourceProvider() == null) {
            return Theme.getColor(i);
        }
        return this.fragment.getThemedColor(i);
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 1) {
            checkUi_titleVisibility();
        }
    }

    private void checkUi_titleVisibility() {
        float fClamp = MathUtils.clamp(Math.min(this.collapsedProgress, this.collapsedProgress2), 0.0f, 1.0f);
        float floatValue = this.animatorHasTitleText.getFloatValue();
        float f = 1.0f - floatValue;
        float f2 = floatValue * fClamp;
        float f3 = f * fClamp;
        AnimatedTextView animatedTextView = this.titleView;
        if (animatedTextView != null) {
            animatedTextView.setAlpha(f2);
            this.titleView.setVisibility(f2 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.telegramLogoView;
        if (imageView != null) {
            imageView.setAlpha(f3);
            this.telegramLogoView.setVisibility(f3 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.emojiStatusView;
        if (imageView2 != null) {
            imageView2.setAlpha(f3);
            this.emojiStatusView.setVisibility(f3 > 0.0f ? 0 : 8);
        }
        ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = this.subtitleOverlayContainer;
        if (actionBarAnimatedSubtitleOverlayContainer != null) {
            actionBarAnimatedSubtitleOverlayContainer.setAlpha(fClamp);
            this.subtitleOverlayContainer.setVisibility(fClamp > 0.0f ? 0 : 8);
        }
    }
}
