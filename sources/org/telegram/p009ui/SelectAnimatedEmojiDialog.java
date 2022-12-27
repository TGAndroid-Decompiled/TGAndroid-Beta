package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.FixedHeightEmptyCell;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.AnimatedEmojiDrawable;
import org.telegram.p009ui.Components.AnimatedEmojiSpan;
import org.telegram.p009ui.Components.AnimatedTextView;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.CloseProgressDrawable2;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.DrawingInBackgroundThreadDrawable;
import org.telegram.p009ui.Components.EditTextCaption;
import org.telegram.p009ui.Components.EmojiPacksAlert;
import org.telegram.p009ui.Components.EmojiTabsStrip;
import org.telegram.p009ui.Components.EmojiView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Premium.PremiumButtonView;
import org.telegram.p009ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.p009ui.Components.Premium.PremiumLockIconView;
import org.telegram.p009ui.Components.RLottieImageView;
import org.telegram.p009ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.p009ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.SelectAnimatedEmojiDialog;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$EmojiStatus;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_emojiStatus;
import org.telegram.tgnet.TLRPC$TL_emojiStatusUntil;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetEmojiDefaultStatuses;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_stickerSetFullCovered;

public class SelectAnimatedEmojiDialog extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static String[] lastSearchKeyboardLanguage;
    private static HashMap<Integer, Parcelable> listStates = new HashMap<>();
    private Adapter adapter;
    private View animateExpandFromButton;
    private float animateExpandFromButtonTranslate;
    private int animateExpandFromPosition;
    private long animateExpandStartTime;
    private int animateExpandToPosition;
    private boolean animationsEnabled;
    private BaseFragment baseFragment;
    AnimatedEmojiDrawable bigReactionAnimatedEmoji;
    ImageReceiver bigReactionImageReceiver;
    public onLongPressedListener bigReactionListener;
    private boolean bottomGradientShown;
    private View bottomGradientView;
    private View bubble1View;
    private View bubble2View;
    public boolean cancelPressed;
    private Runnable clearSearchRunnable;
    private FrameLayout contentView;
    private View contentViewForeground;
    private int currentAccount;
    private boolean defaultSetLoading;
    private ArrayList<AnimatedEmojiSpan> defaultStatuses;
    private int defaultTopicIconRow;
    private ValueAnimator dimAnimator;
    private Runnable dismiss;
    private boolean drawBackground;
    private Rect drawableToBounds;
    public EmojiListView emojiGridView;
    DefaultItemAnimator emojiItemAnimator;
    public FrameLayout emojiSearchEmptyView;
    private BackupImageView emojiSearchEmptyViewImageView;
    public EmojiListView emojiSearchGridView;
    private float emojiSelectAlpha;
    private ValueAnimator emojiSelectAnimator;
    private Rect emojiSelectRect;
    private ImageViewEmoji emojiSelectView;
    private EmojiTabsStrip emojiTabs;
    private View emojiTabsShadow;
    private Integer emojiX;
    private ArrayList<String> emptyViewEmojis;
    private ArrayList<Long> expandedEmojiSets;
    private Drawable forumIconDrawable;
    private ImageViewEmoji forumIconImage;
    private ArrayList<TLRPC$TL_messages_stickerSet> frozenEmojiPacks;
    private boolean gridSearch;
    private ValueAnimator gridSwitchAnimator;
    public FrameLayout gridViewContainer;
    private ValueAnimator hideAnimator;
    private Integer hintExpireDate;
    private boolean includeEmpty;
    private boolean includeHint;
    private ArrayList<Long> installedEmojiSets;
    private boolean isAttached;
    private String lastQuery;
    private GridLayoutManager layoutManager;
    private Integer listStateId;
    private int longtapHintRow;
    public onRecentClearedListener onRecentClearedListener;
    private OvershootInterpolator overshootInterpolator;
    private ArrayList<EmojiView.EmojiPack> packs;
    Paint paint;
    private int popularSectionRow;
    private SparseIntArray positionToButton;
    private SparseIntArray positionToExpand;
    private SparseIntArray positionToSection;
    private Drawable premiumStar;
    private ColorFilter premiumStarColorFilter;
    float pressedProgress;
    private ArrayList<AnimatedEmojiSpan> recent;
    private EmojiPackExpand recentExpandButton;
    private boolean recentExpanded;
    private ArrayList<ReactionsLayoutInBubble.VisibleReaction> recentReactions;
    private int recentReactionsEndRow;
    private int recentReactionsSectionRow;
    private int recentReactionsStartRow;
    private List<ReactionsLayoutInBubble.VisibleReaction> recentReactionsToSet;
    private Theme.ResourcesProvider resourcesProvider;
    private ArrayList<Integer> rowHashCodes;
    private float scaleX;
    private float scaleY;
    private float scrimAlpha;
    private int scrimColor;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable scrimDrawable;
    private View scrimDrawableParent;
    private RecyclerAnimationScrollHelper scrollHelper;
    private SearchAdapter searchAdapter;
    private SearchBox searchBox;
    private ValueAnimator searchEmptyViewAnimator;
    private boolean searchEmptyViewVisible;
    private ArrayList<ReactionsLayoutInBubble.VisibleReaction> searchResult;
    private int searchRow;
    private Runnable searchRunnable;
    public boolean searched;
    public boolean searching;
    private SparseIntArray sectionToPosition;
    private SelectStatusDurationDialog selectStatusDateDialog;
    HashSet<Long> selectedDocumentIds;
    ImageViewEmoji selectedReactionView;
    HashSet<ReactionsLayoutInBubble.VisibleReaction> selectedReactions;
    public Paint selectorAccentPaint;
    public Paint selectorPaint;
    private ValueAnimator showAnimator;
    private boolean smoothScrolling;
    private View topGradientView;
    private int topMarginDp;
    private ArrayList<ReactionsLayoutInBubble.VisibleReaction> topReactions;
    private int topReactionsEndRow;
    private int topReactionsStartRow;
    private int topicEmojiHeaderRow;
    private int totalCount;
    private int type;

    public interface onLongPressedListener {
        void onLongPressed(ImageViewEmoji imageViewEmoji);
    }

    public interface onRecentClearedListener {
        void onRecentCleared();
    }

    protected void onEmojiSelected(View view, Long l, TLRPC$Document tLRPC$Document, Integer num) {
    }

    protected void onInputFocus() {
    }

    protected void onReactionClick(ImageViewEmoji imageViewEmoji, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
    }

    protected void onSettings() {
    }

    @Override
    public void setPressed(boolean z) {
    }

    public void setSelectedReactions(HashSet<ReactionsLayoutInBubble.VisibleReaction> hashSet) {
        this.selectedReactions = hashSet;
        this.selectedDocumentIds.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i = 0; i < arrayList.size(); i++) {
            if (((ReactionsLayoutInBubble.VisibleReaction) arrayList.get(i)).documentId != 0) {
                this.selectedDocumentIds.add(Long.valueOf(((ReactionsLayoutInBubble.VisibleReaction) arrayList.get(i)).documentId));
            }
        }
    }

    public static class SelectAnimatedEmojiDialogWindow extends PopupWindow {
        private static final ViewTreeObserver.OnScrollChangedListener NOP = ViewTreeObserver$OnScrollChangedListenerC4049xd29219.INSTANCE;
        private static final Field superListenerField;
        private ViewTreeObserver.OnScrollChangedListener mSuperScrollListener;
        private ViewTreeObserver mViewTreeObserver;

        public static void lambda$static$0() {
        }

        static {
            Field field = null;
            try {
                field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
                field.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            superListenerField = field;
        }

        public SelectAnimatedEmojiDialogWindow(View view, int i, int i2) {
            super(view, i, i2);
            init();
        }

        private void init() {
            setFocusable(true);
            setAnimationStyle(0);
            setOutsideTouchable(true);
            setClippingEnabled(true);
            setInputMethodMode(0);
            setSoftInputMode(4);
            Field field = superListenerField;
            if (field != null) {
                try {
                    this.mSuperScrollListener = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                    field.set(this, NOP);
                } catch (Exception unused) {
                    this.mSuperScrollListener = null;
                }
            }
        }

        private void unregisterListener() {
            ViewTreeObserver viewTreeObserver;
            if (this.mSuperScrollListener == null || (viewTreeObserver = this.mViewTreeObserver) == null) {
                return;
            }
            if (viewTreeObserver.isAlive()) {
                this.mViewTreeObserver.removeOnScrollChangedListener(this.mSuperScrollListener);
            }
            this.mViewTreeObserver = null;
        }

        private void registerListener(View view) {
            if (getContentView() instanceof SelectAnimatedEmojiDialog) {
                ((SelectAnimatedEmojiDialog) getContentView()).onShow(new Runnable() {
                    @Override
                    public final void run() {
                        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow.this.dismiss();
                    }
                });
            }
            if (this.mSuperScrollListener != null) {
                ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
                ViewTreeObserver viewTreeObserver2 = this.mViewTreeObserver;
                if (viewTreeObserver != viewTreeObserver2) {
                    if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                        this.mViewTreeObserver.removeOnScrollChangedListener(this.mSuperScrollListener);
                    }
                    this.mViewTreeObserver = viewTreeObserver;
                    if (viewTreeObserver != null) {
                        viewTreeObserver.addOnScrollChangedListener(this.mSuperScrollListener);
                    }
                }
            }
        }

        public void dimBehind() {
            View rootView = getContentView().getRootView();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            layoutParams.flags |= 2;
            layoutParams.dimAmount = 0.2f;
            ((WindowManager) getContentView().getContext().getSystemService("window")).updateViewLayout(rootView, layoutParams);
        }

        private void dismissDim() {
            View rootView = getContentView().getRootView();
            WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
            if (rootView.getLayoutParams() == null || !(rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
                return;
            }
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            try {
                int i = layoutParams.flags;
                if ((i & 2) != 0) {
                    layoutParams.flags = i & (-3);
                    layoutParams.dimAmount = 0.0f;
                    windowManager.updateViewLayout(rootView, layoutParams);
                }
            } catch (Exception unused) {
            }
        }

        @Override
        public void showAsDropDown(View view) {
            super.showAsDropDown(view);
            registerListener(view);
        }

        @Override
        public void showAsDropDown(View view, int i, int i2) {
            super.showAsDropDown(view, i, i2);
            registerListener(view);
        }

        @Override
        public void showAsDropDown(View view, int i, int i2, int i3) {
            super.showAsDropDown(view, i, i2, i3);
            registerListener(view);
        }

        @Override
        public void showAtLocation(View view, int i, int i2, int i3) {
            super.showAtLocation(view, i, i2, i3);
            unregisterListener();
        }

        @Override
        public void dismiss() {
            if (getContentView() instanceof SelectAnimatedEmojiDialog) {
                ((SelectAnimatedEmojiDialog) getContentView()).onDismiss(new Runnable() {
                    @Override
                    public final void run() {
                        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow.this.lambda$dismiss$1();
                    }
                });
                dismissDim();
                return;
            }
            super.dismiss();
        }

        public void lambda$dismiss$1() {
            super.dismiss();
        }
    }

    public SelectAnimatedEmojiDialog(BaseFragment baseFragment, Context context, boolean z, Integer num, int i, Theme.ResourcesProvider resourcesProvider) {
        this(baseFragment, context, z, num, i, resourcesProvider, 16);
    }

    public SelectAnimatedEmojiDialog(final BaseFragment baseFragment, Context context, boolean z, Integer num, final int i, final Theme.ResourcesProvider resourcesProvider, int i2) {
        super(context);
        this.selectedReactions = new HashSet<>();
        this.selectedDocumentIds = new HashSet<>();
        this.selectorPaint = new Paint(1);
        this.selectorAccentPaint = new Paint(1);
        this.currentAccount = UserConfig.selectedAccount;
        this.rowHashCodes = new ArrayList<>();
        this.positionToSection = new SparseIntArray();
        this.sectionToPosition = new SparseIntArray();
        this.positionToExpand = new SparseIntArray();
        this.positionToButton = new SparseIntArray();
        this.expandedEmojiSets = new ArrayList<>();
        this.installedEmojiSets = new ArrayList<>();
        this.recentExpanded = false;
        this.recent = new ArrayList<>();
        this.topReactions = new ArrayList<>();
        this.recentReactions = new ArrayList<>();
        this.defaultStatuses = new ArrayList<>();
        this.frozenEmojiPacks = new ArrayList<>();
        this.packs = new ArrayList<>();
        this.includeEmpty = false;
        this.includeHint = false;
        this.drawBackground = true;
        this.bigReactionImageReceiver = new ImageReceiver();
        this.scrimAlpha = 1.0f;
        this.emojiSelectAlpha = 1.0f;
        this.overshootInterpolator = new OvershootInterpolator(2.0f);
        this.bottomGradientShown = false;
        this.smoothScrolling = false;
        this.searching = false;
        this.searched = false;
        this.gridSearch = false;
        ArrayList<String> arrayList = new ArrayList<>(4);
        this.emptyViewEmojis = arrayList;
        arrayList.add("😖");
        this.emptyViewEmojis.add("😫");
        this.emptyViewEmojis.add("\u1fae0");
        this.emptyViewEmojis.add("😨");
        this.emptyViewEmojis.add("❓");
        this.searchEmptyViewVisible = false;
        this.animateExpandFromPosition = -1;
        this.animateExpandToPosition = -1;
        this.animateExpandStartTime = -1L;
        this.defaultSetLoading = false;
        this.paint = new Paint();
        this.resourcesProvider = resourcesProvider;
        this.type = i;
        this.includeEmpty = z;
        this.baseFragment = baseFragment;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        StringBuilder sb = new StringBuilder();
        sb.append("emoji");
        sb.append(i == 0 ? "status" : "reaction");
        sb.append("usehint");
        this.includeHint = globalMainSettings.getInt(sb.toString(), 0) < 3;
        this.selectorPaint.setColor(Theme.getColor("listSelectorSDK21", resourcesProvider));
        this.selectorAccentPaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor("windowBackgroundWhiteBlueIcon", resourcesProvider), 30));
        this.premiumStarColorFilter = new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteBlueIcon", resourcesProvider), PorterDuff.Mode.SRC_IN);
        this.emojiX = num;
        final Integer valueOf = num == null ? null : Integer.valueOf(MathUtils.clamp(num.intValue(), AndroidUtilities.m35dp(26.0f), AndroidUtilities.m35dp(292.0f)));
        boolean z2 = valueOf != null && valueOf.intValue() > AndroidUtilities.m35dp(170.0f);
        setFocusableInTouchMode(true);
        if (i == 0 || i == 2) {
            this.topMarginDp = i2;
            setPadding(AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f));
            setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$new$0;
                    lambda$new$0 = SelectAnimatedEmojiDialog.this.lambda$new$0(view, motionEvent);
                    return lambda$new$0;
                }
            });
        }
        if (valueOf != null) {
            this.bubble1View = new View(context);
            Drawable mutate = getResources().getDrawable(C1072R.C1073drawable.shadowed_bubble1).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor("actionBarDefaultSubmenuBackground", resourcesProvider), PorterDuff.Mode.MULTIPLY));
            this.bubble1View.setBackground(mutate);
            addView(this.bubble1View, LayoutHelper.createFrame(10, 10.0f, 51, (valueOf.intValue() / AndroidUtilities.density) + (z2 ? -12 : 4), this.topMarginDp, 0.0f, 0.0f));
        }
        FrameLayout frameLayout = new FrameLayout(context) {
            private Path path = new Path();
            private Paint paint = new Paint(1);

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (!SelectAnimatedEmojiDialog.this.drawBackground) {
                    super.dispatchDraw(canvas);
                    return;
                }
                canvas.save();
                this.paint.setShadowLayer(AndroidUtilities.m35dp(2.0f), 0.0f, AndroidUtilities.m35dp(-0.66f), 503316480);
                this.paint.setColor(Theme.getColor("actionBarDefaultSubmenuBackground", resourcesProvider));
                this.paint.setAlpha((int) (getAlpha() * 255.0f));
                Integer num2 = valueOf;
                float width = (num2 == null ? getWidth() / 2.0f : num2.intValue()) + AndroidUtilities.m35dp(20.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getPaddingLeft() + (width - (SelectAnimatedEmojiDialog.this.scaleX * width)), getPaddingTop(), getPaddingLeft() + width + ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - width) * SelectAnimatedEmojiDialog.this.scaleX), getPaddingTop() + (((getHeight() - getPaddingBottom()) - getPaddingTop()) * SelectAnimatedEmojiDialog.this.scaleY));
                this.path.rewind();
                this.path.addRoundRect(rectF, AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(12.0f), Path.Direction.CW);
                canvas.drawPath(this.path, this.paint);
                canvas.clipPath(this.path);
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        };
        this.contentView = frameLayout;
        if (i == 0 || i == 2) {
            frameLayout.setPadding(AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f));
        }
        addView(this.contentView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, (i == 0 || i == 2) ? this.topMarginDp + 6 : 0.0f, 0.0f, 0.0f));
        if (valueOf != null) {
            this.bubble2View = new View(this, context) {
                @Override
                protected void onMeasure(int i3, int i4) {
                    super.onMeasure(i3, i4);
                    setPivotX(getMeasuredWidth() / 2);
                    setPivotY(getMeasuredHeight());
                }
            };
            Drawable drawable = getResources().getDrawable(C1072R.C1073drawable.shadowed_bubble2_half);
            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("actionBarDefaultSubmenuBackground", resourcesProvider), PorterDuff.Mode.MULTIPLY));
            this.bubble2View.setBackground(drawable);
            addView(this.bubble2View, LayoutHelper.createFrame(17, 9.0f, 51, (valueOf.intValue() / AndroidUtilities.density) + (z2 ? -25 : 10), this.topMarginDp + 5, 0.0f, 0.0f));
        }
        final Integer num2 = valueOf;
        EmojiTabsStrip emojiTabsStrip = new EmojiTabsStrip(context, null, false, true, i, baseFragment != null && i != 3 ? new Runnable() {
            @Override
            public final void run() {
                SelectAnimatedEmojiDialog.this.lambda$new$1(baseFragment);
            }
        } : null) {
            @Override
            protected ColorFilter getEmojiColorFilter() {
                return SelectAnimatedEmojiDialog.this.premiumStarColorFilter;
            }

            @Override
            protected boolean onTabClick(int i3) {
                if (SelectAnimatedEmojiDialog.this.smoothScrolling) {
                    return false;
                }
                int i4 = SelectAnimatedEmojiDialog.this.searchRow == -1 ? 1 : 0;
                if (i3 > 0) {
                    int i5 = i3 - 1;
                    if (SelectAnimatedEmojiDialog.this.sectionToPosition.indexOfKey(i5) >= 0) {
                        i4 = SelectAnimatedEmojiDialog.this.sectionToPosition.get(i5);
                    }
                }
                SelectAnimatedEmojiDialog.this.scrollToPosition(i4, AndroidUtilities.m35dp(-2.0f));
                SelectAnimatedEmojiDialog.this.emojiTabs.select(i3);
                SelectAnimatedEmojiDialog.this.emojiGridView.scrolledByUserOnce = true;
                return true;
            }

            @Override
            protected void onTabCreate(EmojiTabsStrip.EmojiTabButton emojiTabButton) {
                if (SelectAnimatedEmojiDialog.this.showAnimator == null || SelectAnimatedEmojiDialog.this.showAnimator.isRunning()) {
                    emojiTabButton.setScaleX(0.0f);
                    emojiTabButton.setScaleY(0.0f);
                }
            }
        };
        this.emojiTabs = emojiTabsStrip;
        emojiTabsStrip.recentTab.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean lambda$new$2;
                lambda$new$2 = SelectAnimatedEmojiDialog.this.lambda$new$2(view);
                return lambda$new$2;
            }
        });
        EmojiTabsStrip emojiTabsStrip2 = this.emojiTabs;
        emojiTabsStrip2.updateButtonDrawables = false;
        emojiTabsStrip2.setAnimatedEmojiCacheType((i == 0 || i == 2) ? 6 : 5);
        EmojiTabsStrip emojiTabsStrip3 = this.emojiTabs;
        emojiTabsStrip3.animateAppear = num2 == null;
        emojiTabsStrip3.setPaddingLeft(5.0f);
        this.contentView.addView(this.emojiTabs, LayoutHelper.createFrame(-1, 36.0f));
        View view = new View(this, context) {
            @Override
            protected void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
                Integer num3 = num2;
                if (num3 != null) {
                    setPivotX(num3.intValue());
                }
            }
        };
        this.emojiTabsShadow = view;
        view.setBackgroundColor(Theme.getColor("divider", resourcesProvider));
        this.contentView.addView(this.emojiTabsShadow, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.emojiTabsShadow, true, 1.0f, false);
        this.emojiGridView = new EmojiListView(context) {
            @Override
            public void onScrolled(int i3, int i4) {
                super.onScrolled(i3, i4);
                SelectAnimatedEmojiDialog.this.checkScroll();
                if (!SelectAnimatedEmojiDialog.this.smoothScrolling) {
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                    selectAnimatedEmojiDialog.updateTabsPosition(selectAnimatedEmojiDialog.layoutManager.findFirstCompletelyVisibleItemPosition());
                }
                SelectAnimatedEmojiDialog.this.updateSearchBox();
                AndroidUtilities.updateViewVisibilityAnimated(SelectAnimatedEmojiDialog.this.emojiTabsShadow, SelectAnimatedEmojiDialog.this.emojiGridView.computeVerticalScrollOffset() != 0, 1.0f, true);
            }

            @Override
            public void onScrollStateChanged(int i3) {
                if (i3 == 0) {
                    SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                    if (SelectAnimatedEmojiDialog.this.searchRow != -1 && SelectAnimatedEmojiDialog.this.searchBox.getVisibility() == 0 && SelectAnimatedEmojiDialog.this.searchBox.getTranslationY() > (-AndroidUtilities.m35dp(51.0f))) {
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                        selectAnimatedEmojiDialog.scrollToPosition(selectAnimatedEmojiDialog.searchBox.getTranslationY() > ((float) (-AndroidUtilities.m35dp(16.0f))) ? 0 : 1, 0);
                    }
                }
                super.onScrollStateChanged(i3);
            }
        };
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator(this) {
            @Override
            protected float animateByScale(View view2) {
                return view2 instanceof EmojiPackExpand ? 0.6f : 0.0f;
            }
        };
        this.emojiItemAnimator = defaultItemAnimator;
        defaultItemAnimator.setAddDuration(220L);
        this.emojiItemAnimator.setMoveDuration(260L);
        this.emojiItemAnimator.setChangeDuration(160L);
        this.emojiItemAnimator.setSupportsChangeAnimations(false);
        DefaultItemAnimator defaultItemAnimator2 = this.emojiItemAnimator;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator2.setMoveInterpolator(cubicBezierInterpolator);
        this.emojiItemAnimator.setDelayAnimations(false);
        this.emojiGridView.setItemAnimator(this.emojiItemAnimator);
        this.emojiGridView.setPadding(AndroidUtilities.m35dp(5.0f), AndroidUtilities.m35dp(2.0f), AndroidUtilities.m35dp(5.0f), AndroidUtilities.m35dp(38.0f));
        EmojiListView emojiListView = this.emojiGridView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        emojiListView.setAdapter(adapter);
        EmojiListView emojiListView2 = this.emojiGridView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 8) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i3) {
                try {
                    LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2) {
                        @Override
                        public void onEnd() {
                            SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                        }
                    };
                    linearSmoothScrollerCustom.setTargetPosition(i3);
                    startSmoothScroll(linearSmoothScrollerCustom);
                } catch (Exception e) {
                    FileLog.m31e(e);
                }
            }
        };
        this.layoutManager = gridLayoutManager;
        emojiListView2.setLayoutManager(gridLayoutManager);
        this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i3) {
                if (SelectAnimatedEmojiDialog.this.positionToSection.indexOfKey(i3) >= 0 || SelectAnimatedEmojiDialog.this.positionToButton.indexOfKey(i3) >= 0 || i3 == SelectAnimatedEmojiDialog.this.recentReactionsSectionRow || i3 == SelectAnimatedEmojiDialog.this.popularSectionRow || i3 == SelectAnimatedEmojiDialog.this.longtapHintRow || i3 == SelectAnimatedEmojiDialog.this.searchRow || i3 == SelectAnimatedEmojiDialog.this.topicEmojiHeaderRow) {
                    return SelectAnimatedEmojiDialog.this.layoutManager.getSpanCount();
                }
                return 1;
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(this, context) {
            @Override
            protected void onMeasure(int i3, int i4) {
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) + AndroidUtilities.m35dp(36.0f), 1073741824));
            }
        };
        this.gridViewContainer = frameLayout2;
        frameLayout2.addView(this.emojiGridView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        EmojiListView emojiListView3 = new EmojiListView(context) {
            @Override
            public void onScrolled(int i3, int i4) {
                super.onScrolled(i3, i4);
                SelectAnimatedEmojiDialog.this.checkScroll();
            }
        };
        this.emojiSearchGridView = emojiListView3;
        if (emojiListView3.getItemAnimator() != null) {
            this.emojiSearchGridView.getItemAnimator().setDurations(180L);
            this.emojiSearchGridView.getItemAnimator().setMoveInterpolator(cubicBezierInterpolator);
        }
        TextView textView = new TextView(context);
        if (i == 0) {
            textView.setText(LocaleController.getString("NoEmojiFound", C1072R.string.NoEmojiFound));
        } else if (i == 1 || i == 2) {
            textView.setText(LocaleController.getString("NoReactionsFound", C1072R.string.NoReactionsFound));
        } else {
            textView.setText(LocaleController.getString("NoIconsFound", C1072R.string.NoIconsFound));
        }
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(Theme.getColor("chat_emojiPanelEmptyText", resourcesProvider));
        this.emojiSearchEmptyViewImageView = new BackupImageView(context);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.emojiSearchEmptyView = frameLayout3;
        frameLayout3.addView(this.emojiSearchEmptyViewImageView, LayoutHelper.createFrame(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        this.emojiSearchEmptyView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        this.emojiSearchEmptyView.setVisibility(8);
        this.emojiSearchEmptyView.setAlpha(0.0f);
        this.gridViewContainer.addView(this.emojiSearchEmptyView, LayoutHelper.createFrame(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        this.emojiSearchGridView.setPadding(AndroidUtilities.m35dp(5.0f), AndroidUtilities.m35dp(54.0f), AndroidUtilities.m35dp(5.0f), AndroidUtilities.m35dp(2.0f));
        EmojiListView emojiListView4 = this.emojiSearchGridView;
        SearchAdapter searchAdapter = new SearchAdapter();
        this.searchAdapter = searchAdapter;
        emojiListView4.setAdapter(searchAdapter);
        this.emojiSearchGridView.setLayoutManager(new GridLayoutManager(context, 8) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i3) {
                try {
                    LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2) {
                        @Override
                        public void onEnd() {
                            SelectAnimatedEmojiDialog.this.smoothScrolling = false;
                        }
                    };
                    linearSmoothScrollerCustom.setTargetPosition(i3);
                    startSmoothScroll(linearSmoothScrollerCustom);
                } catch (Exception e) {
                    FileLog.m31e(e);
                }
            }
        });
        this.emojiSearchGridView.setVisibility(8);
        this.gridViewContainer.addView(this.emojiSearchGridView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.contentView.addView(this.gridViewContainer, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.emojiGridView, this.layoutManager);
        this.scrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.setAnimationCallback(new RecyclerAnimationScrollHelper.AnimationCallback() {
            @Override
            public void onPreAnimation() {
                SelectAnimatedEmojiDialog.this.smoothScrolling = true;
            }

            @Override
            public void onEndAnimation() {
                SelectAnimatedEmojiDialog.this.smoothScrolling = false;
            }
        });
        C401213 c401213 = new C401213(i, context, resourcesProvider, num);
        this.emojiGridView.setOnItemLongClickListener(c401213, ViewConfiguration.getLongPressTimeout() * 0.25f);
        this.emojiSearchGridView.setOnItemLongClickListener(c401213, ViewConfiguration.getLongPressTimeout() * 0.25f);
        RecyclerListView.OnItemClickListener onItemClickListener = new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i3) {
                SelectAnimatedEmojiDialog.this.lambda$new$3(i, view2, i3);
            }
        };
        this.emojiGridView.setOnItemClickListener(onItemClickListener);
        this.emojiSearchGridView.setOnItemClickListener(onItemClickListener);
        SearchBox searchBox = new SearchBox(context);
        this.searchBox = searchBox;
        searchBox.setTranslationY(-AndroidUtilities.m35dp(56.0f));
        this.searchBox.setVisibility(4);
        this.gridViewContainer.addView(this.searchBox, LayoutHelper.createFrame(-1, 52.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.topGradientView = new View(this, context) {
            @Override
            protected void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
                Integer num3 = num2;
                if (num3 != null) {
                    setPivotX(num3.intValue());
                }
            }
        };
        Drawable drawable2 = getResources().getDrawable(C1072R.C1073drawable.gradient_top);
        drawable2.setColorFilter(new PorterDuffColorFilter(AndroidUtilities.multiplyAlphaComponent(Theme.getColor("actionBarDefaultSubmenuBackground", resourcesProvider), 0.8f), PorterDuff.Mode.SRC_IN));
        this.topGradientView.setBackground(drawable2);
        this.topGradientView.setAlpha(0.0f);
        this.contentView.addView(this.topGradientView, LayoutHelper.createFrame(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        this.bottomGradientView = new View(context);
        Drawable drawable3 = getResources().getDrawable(C1072R.C1073drawable.gradient_bottom);
        drawable3.setColorFilter(new PorterDuffColorFilter(AndroidUtilities.multiplyAlphaComponent(Theme.getColor("actionBarDefaultSubmenuBackground", resourcesProvider), 0.8f), PorterDuff.Mode.SRC_IN));
        this.bottomGradientView.setBackground(drawable3);
        this.bottomGradientView.setAlpha(0.0f);
        this.contentView.addView(this.bottomGradientView, LayoutHelper.createFrame(-1, 20, 87));
        View view2 = new View(context);
        this.contentViewForeground = view2;
        view2.setAlpha(0.0f);
        this.contentViewForeground.setBackgroundColor(-16777216);
        this.contentView.addView(this.contentViewForeground, LayoutHelper.createFrame(-1, -1.0f));
        preload(i, this.currentAccount);
        this.bigReactionImageReceiver.setLayerNum(7);
        updateRows(true, false);
    }

    public boolean lambda$new$0(View view, MotionEvent motionEvent) {
        Runnable runnable;
        if (motionEvent.getAction() != 0 || (runnable = this.dismiss) == null) {
            return false;
        }
        runnable.run();
        return true;
    }

    public void lambda$new$1(BaseFragment baseFragment) {
        onSettings();
        baseFragment.presentFragment(new StickersActivity(5, this.frozenEmojiPacks));
        Runnable runnable = this.dismiss;
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean lambda$new$2(View view) {
        onRecentLongClick();
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        return true;
    }

    public class C401213 implements RecyclerListView.OnItemLongClickListenerExtended {
        final Context val$context;
        final Integer val$emojiX;
        final Theme.ResourcesProvider val$resourcesProvider;
        final int val$type;

        @Override
        public void onMove(float f, float f2) {
            RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onMove(this, f, f2);
        }

        C401213(int i, Context context, Theme.ResourcesProvider resourcesProvider, Integer num) {
            SelectAnimatedEmojiDialog.this = r1;
            this.val$type = i;
            this.val$context = context;
            this.val$resourcesProvider = resourcesProvider;
            this.val$emojiX = num;
        }

        @Override
        public boolean onItemClick(final View view, int i, float f, float f2) {
            boolean z = view instanceof ImageViewEmoji;
            if (!z || this.val$type != 1) {
                if (z) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
                    if (imageViewEmoji.span != null && this.val$type == 0) {
                        SelectAnimatedEmojiDialog.this.selectStatusDateDialog = new SelectStatusDurationDialog(this.val$context, SelectAnimatedEmojiDialog.this.dismiss, SelectAnimatedEmojiDialog.this, imageViewEmoji, this.val$resourcesProvider) {
                            {
                                C401213.this = this;
                                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                            }

                            @Override
                            protected boolean getOutBounds(Rect rect) {
                                if (SelectAnimatedEmojiDialog.this.scrimDrawable != null) {
                                    C401213 c401213 = C401213.this;
                                    if (c401213.val$emojiX != null) {
                                        rect.set(SelectAnimatedEmojiDialog.this.drawableToBounds);
                                        return true;
                                    }
                                    return false;
                                }
                                return false;
                            }

                            @Override
                            protected void onEndPartly(Integer num) {
                                SelectAnimatedEmojiDialog.this.incrementHintUse();
                                TLRPC$TL_emojiStatus tLRPC$TL_emojiStatus = new TLRPC$TL_emojiStatus();
                                View view2 = view;
                                long j = ((ImageViewEmoji) view2).span.documentId;
                                tLRPC$TL_emojiStatus.document_id = j;
                                SelectAnimatedEmojiDialog.this.onEmojiSelected(view2, Long.valueOf(j), ((ImageViewEmoji) view).span.document, num);
                                MediaDataController.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).pushRecentEmojiStatus(tLRPC$TL_emojiStatus);
                            }

                            @Override
                            protected void onEnd(Integer num) {
                                if (num == null || SelectAnimatedEmojiDialog.this.dismiss == null) {
                                    return;
                                }
                                SelectAnimatedEmojiDialog.this.dismiss.run();
                            }

                            @Override
                            public void dismiss() {
                                super.dismiss();
                                SelectAnimatedEmojiDialog.this.selectStatusDateDialog = null;
                            }
                        }.show();
                        try {
                            view.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                        return true;
                    }
                }
                return false;
            }
            SelectAnimatedEmojiDialog.this.incrementHintUse();
            SelectAnimatedEmojiDialog.this.performHapticFeedback(0);
            ImageViewEmoji imageViewEmoji2 = (ImageViewEmoji) view;
            if (!imageViewEmoji2.isDefaultReaction && !UserConfig.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).isPremium()) {
                TLRPC$Document tLRPC$Document = imageViewEmoji2.span.document;
                if (tLRPC$Document == null) {
                    tLRPC$Document = AnimatedEmojiDrawable.findDocument(SelectAnimatedEmojiDialog.this.currentAccount, imageViewEmoji2.span.documentId);
                }
                SelectAnimatedEmojiDialog.this.onEmojiSelected(imageViewEmoji2, Long.valueOf(imageViewEmoji2.span.documentId), tLRPC$Document, null);
                return true;
            }
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            selectAnimatedEmojiDialog.selectedReactionView = imageViewEmoji2;
            selectAnimatedEmojiDialog.pressedProgress = 0.0f;
            selectAnimatedEmojiDialog.cancelPressed = false;
            if (imageViewEmoji2.isDefaultReaction) {
                TLRPC$TL_availableReaction tLRPC$TL_availableReaction = MediaDataController.getInstance(selectAnimatedEmojiDialog.currentAccount).getReactionsMap().get(SelectAnimatedEmojiDialog.this.selectedReactionView.reaction.emojicon);
                if (tLRPC$TL_availableReaction != null) {
                    SelectAnimatedEmojiDialog.this.bigReactionImageReceiver.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", SelectAnimatedEmojiDialog.this.selectedReactionView.reaction, 0);
                }
            } else {
                selectAnimatedEmojiDialog.setBigReactionAnimatedEmoji(new AnimatedEmojiDrawable(4, SelectAnimatedEmojiDialog.this.currentAccount, SelectAnimatedEmojiDialog.this.selectedReactionView.span.documentId));
            }
            SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
            return true;
        }

        @Override
        public void onLongClickRelease() {
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (selectAnimatedEmojiDialog.selectedReactionView != null) {
                selectAnimatedEmojiDialog.cancelPressed = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(selectAnimatedEmojiDialog.pressedProgress, 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SelectAnimatedEmojiDialog.C401213.this.lambda$onLongClickRelease$0(valueAnimator);
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                        selectAnimatedEmojiDialog2.selectedReactionView.bigReactionSelectedProgress = 0.0f;
                        selectAnimatedEmojiDialog2.selectedReactionView = null;
                        selectAnimatedEmojiDialog2.emojiGridView.invalidate();
                    }
                });
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ofFloat.start();
            }
        }

        public void lambda$onLongClickRelease$0(ValueAnimator valueAnimator) {
            SelectAnimatedEmojiDialog.this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    public void lambda$new$3(int i, View view, int i2) {
        try {
            if (view instanceof ImageViewEmoji) {
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
                if (imageViewEmoji.isDefaultReaction) {
                    incrementHintUse();
                    onReactionClick(imageViewEmoji, imageViewEmoji.reaction);
                } else {
                    onEmojiClick(imageViewEmoji, imageViewEmoji.span);
                }
                if (i == 1) {
                    return;
                }
                performHapticFeedback(3, 1);
            } else if (view instanceof ImageView) {
                onEmojiClick(view, null);
                if (i == 1) {
                    return;
                }
                performHapticFeedback(3, 1);
            } else if (!(view instanceof EmojiPackExpand)) {
                if (view != null) {
                    view.callOnClick();
                }
            } else {
                expand(i2, (EmojiPackExpand) view);
                if (i == 1) {
                    return;
                }
                performHapticFeedback(3, 1);
            }
        } catch (Exception unused) {
        }
    }

    public void setExpireDateHint(int i) {
        this.includeHint = true;
        this.hintExpireDate = Integer.valueOf(i);
        updateRows(true, false);
    }

    public void setBigReactionAnimatedEmoji(AnimatedEmojiDrawable animatedEmojiDrawable) {
        AnimatedEmojiDrawable animatedEmojiDrawable2;
        if (this.isAttached && (animatedEmojiDrawable2 = this.bigReactionAnimatedEmoji) != animatedEmojiDrawable) {
            if (animatedEmojiDrawable2 != null) {
                animatedEmojiDrawable2.removeView(this);
            }
            this.bigReactionAnimatedEmoji = animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
        }
    }

    private void onRecentLongClick() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), null);
        builder.setTitle(LocaleController.getString("ClearRecentEmojiStatusesTitle", C1072R.string.ClearRecentEmojiStatusesTitle));
        builder.setMessage(LocaleController.getString("ClearRecentEmojiStatusesText", C1072R.string.ClearRecentEmojiStatusesText));
        builder.setPositiveButton(LocaleController.getString("Clear", C1072R.string.Clear), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                SelectAnimatedEmojiDialog.this.lambda$onRecentLongClick$4(dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", C1072R.string.Cancel), null);
        builder.setDimEnabled(false);
        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                SelectAnimatedEmojiDialog.this.lambda$onRecentLongClick$5(dialogInterface);
            }
        });
        builder.show();
        setDim(1.0f, true);
    }

    public void lambda$onRecentLongClick$4(DialogInterface dialogInterface, int i) {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            public static int constructor = 404757166;

            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i2, boolean z) {
                return TLRPC$Bool.TLdeserialize(abstractSerializedData, i2, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(constructor);
            }
        }, null);
        MediaDataController.getInstance(this.currentAccount).clearRecentEmojiStatuses();
        updateRows(false, true);
    }

    public void lambda$onRecentLongClick$5(DialogInterface dialogInterface) {
        setDim(0.0f, true);
    }

    private void setDim(float f, boolean z) {
        ValueAnimator valueAnimator = this.dimAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.dimAnimator = null;
        }
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.contentViewForeground.getAlpha(), f * 0.25f);
            this.dimAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelectAnimatedEmojiDialog.this.lambda$setDim$6(valueAnimator2);
                }
            });
            this.dimAnimator.setDuration(200L);
            this.dimAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.dimAnimator.start();
            return;
        }
        this.contentViewForeground.setAlpha(f * 0.25f);
        int blendOver = Theme.blendOver(Theme.getColor("actionBarDefaultSubmenuBackground", this.resourcesProvider), ColorUtils.setAlphaComponent(-16777216, (int) (f * 255.0f * 0.25f)));
        View view = this.bubble1View;
        if (view != null) {
            view.getBackground().setColorFilter(new PorterDuffColorFilter(blendOver, PorterDuff.Mode.MULTIPLY));
        }
        View view2 = this.bubble2View;
        if (view2 != null) {
            view2.getBackground().setColorFilter(new PorterDuffColorFilter(blendOver, PorterDuff.Mode.MULTIPLY));
        }
    }

    public void lambda$setDim$6(ValueAnimator valueAnimator) {
        View view = this.contentViewForeground;
        if (view != null) {
            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
        int blendOver = Theme.blendOver(Theme.getColor("actionBarDefaultSubmenuBackground", this.resourcesProvider), ColorUtils.setAlphaComponent(-16777216, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
        View view2 = this.bubble1View;
        if (view2 != null) {
            view2.getBackground().setColorFilter(new PorterDuffColorFilter(blendOver, PorterDuff.Mode.MULTIPLY));
        }
        View view3 = this.bubble2View;
        if (view3 != null) {
            view3.getBackground().setColorFilter(new PorterDuffColorFilter(blendOver, PorterDuff.Mode.MULTIPLY));
        }
    }

    public void updateTabsPosition(int i) {
        if (i != -1) {
            int spanCount = this.layoutManager.getSpanCount() * 5;
            if (this.recent.size() <= spanCount || this.recentExpanded) {
                spanCount = this.recent.size() + (this.includeEmpty ? 1 : 0);
            }
            if (i <= spanCount || i <= this.recentReactions.size()) {
                this.emojiTabs.select(0);
                return;
            }
            int spanCount2 = this.layoutManager.getSpanCount() * 3;
            for (int i2 = 0; i2 < this.positionToSection.size(); i2++) {
                int keyAt = this.positionToSection.keyAt(i2);
                int i3 = i2 - (!this.defaultStatuses.isEmpty() ? 1 : 0);
                EmojiView.EmojiPack emojiPack = i3 >= 0 ? this.packs.get(i3) : null;
                if (emojiPack != null) {
                    boolean z = emojiPack.expanded;
                    int size = emojiPack.documents.size();
                    if (!z) {
                        size = Math.min(spanCount2, size);
                    }
                    if (i > keyAt && i <= keyAt + 1 + size) {
                        this.emojiTabs.select(i2 + 1);
                        return;
                    }
                }
            }
        }
    }

    public void updateSearchBox() {
        SearchBox searchBox = this.searchBox;
        if (searchBox == null) {
            return;
        }
        if (this.searched) {
            searchBox.clearAnimation();
            this.searchBox.setVisibility(0);
            this.searchBox.animate().translationY(-AndroidUtilities.m35dp(4.0f)).start();
        } else if (this.emojiGridView.getChildCount() > 0) {
            View childAt = this.emojiGridView.getChildAt(0);
            if (this.emojiGridView.getChildAdapterPosition(childAt) == this.searchRow && "searchbox".equals(childAt.getTag())) {
                this.searchBox.setVisibility(0);
                this.searchBox.setTranslationY(childAt.getY() - AndroidUtilities.m35dp(4.0f));
                return;
            }
            this.searchBox.setTranslationY(-AndroidUtilities.m35dp(56.0f));
        } else {
            this.searchBox.setTranslationY(-AndroidUtilities.m35dp(56.0f));
        }
    }

    public Drawable getPremiumStar() {
        if (this.premiumStar == null) {
            Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(C1072R.C1073drawable.msg_settings_premium).mutate();
            this.premiumStar = mutate;
            mutate.setColorFilter(this.premiumStarColorFilter);
        }
        return this.premiumStar;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.scrimDrawable;
        if (swapAnimatedEmojiDrawable != null && this.emojiX != null) {
            Rect bounds = swapAnimatedEmojiDrawable.getBounds();
            View view = this.scrimDrawableParent;
            float scaleY = view == null ? 1.0f : view.getScaleY();
            int alpha = Build.VERSION.SDK_INT >= 19 ? this.scrimDrawable.getAlpha() : 255;
            View view2 = this.scrimDrawableParent;
            int height = view2 == null ? bounds.height() : view2.getHeight();
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.scrimDrawable;
            double d = alpha;
            double pow = Math.pow(this.contentView.getAlpha(), 0.25d);
            Double.isNaN(d);
            double d2 = d * pow;
            double d3 = this.scrimAlpha;
            Double.isNaN(d3);
            swapAnimatedEmojiDrawable2.setAlpha((int) (d2 * d3));
            if (this.drawableToBounds == null) {
                this.drawableToBounds = new Rect();
            }
            this.drawableToBounds.set((int) (((bounds.centerX() - ((bounds.width() / 2.0f) * scaleY)) - bounds.centerX()) + this.emojiX.intValue() + ((scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2)), (int) (((((((height - (height - bounds.bottom)) * scaleY) - (scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f)) - bounds.top) - (bounds.height() / 2.0f)) + AndroidUtilities.m35dp(this.topMarginDp)) - (bounds.height() * scaleY)), (int) (((bounds.centerX() + ((bounds.width() / 2.0f) * scaleY)) - bounds.centerX()) + this.emojiX.intValue() + ((scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2)), (int) ((((((height - (height - bounds.bottom)) * scaleY) - (scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f)) - bounds.top) - (bounds.height() / 2.0f)) + AndroidUtilities.m35dp(this.topMarginDp)));
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable3 = this.scrimDrawable;
            Rect rect = this.drawableToBounds;
            int i = rect.left;
            Rect rect2 = this.drawableToBounds;
            swapAnimatedEmojiDrawable3.setBounds(i, rect.top, (int) (i + (rect.width() / scaleY)), (int) (rect2.top + (rect2.height() / scaleY)));
            Rect rect3 = this.drawableToBounds;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.scrimDrawable.draw(canvas);
            this.scrimDrawable.setAlpha(alpha);
            this.scrimDrawable.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        ImageViewEmoji imageViewEmoji = this.emojiSelectView;
        if (imageViewEmoji == null || this.emojiSelectRect == null || this.drawableToBounds == null || imageViewEmoji.drawable == null) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, -getTranslationY());
        this.emojiSelectView.drawable.setAlpha((int) (this.emojiSelectAlpha * 255.0f));
        this.emojiSelectView.drawable.setBounds(this.emojiSelectRect);
        this.emojiSelectView.drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(Theme.getColor("windowBackgroundWhiteBlueIcon", this.resourcesProvider), this.scrimColor, 1.0f - this.scrimAlpha), PorterDuff.Mode.SRC_IN));
        this.emojiSelectView.drawable.draw(canvas);
        canvas.restore();
    }

    public void animateEmojiSelect(final ImageViewEmoji imageViewEmoji, final Runnable runnable) {
        if (this.emojiSelectAnimator != null || this.scrimDrawable == null) {
            runnable.run();
            return;
        }
        imageViewEmoji.notDraw = true;
        final Rect rect = new Rect();
        rect.set(this.contentView.getLeft() + this.emojiGridView.getLeft() + imageViewEmoji.getLeft(), this.contentView.getTop() + this.emojiGridView.getTop() + imageViewEmoji.getTop(), this.contentView.getLeft() + this.emojiGridView.getLeft() + imageViewEmoji.getRight(), this.contentView.getTop() + this.emojiGridView.getTop() + imageViewEmoji.getBottom());
        Drawable drawable = imageViewEmoji.drawable;
        final AnimatedEmojiDrawable make = drawable instanceof AnimatedEmojiDrawable ? AnimatedEmojiDrawable.make(this.currentAccount, 7, ((AnimatedEmojiDrawable) drawable).getDocumentId()) : null;
        this.emojiSelectView = imageViewEmoji;
        Rect rect2 = new Rect();
        this.emojiSelectRect = rect2;
        rect2.set(rect);
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.emojiSelectAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SelectAnimatedEmojiDialog.this.lambda$animateEmojiSelect$7(rect, imageViewEmoji, zArr, runnable, make, valueAnimator);
            }
        });
        this.emojiSelectAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SelectAnimatedEmojiDialog.this.emojiSelectView = null;
                SelectAnimatedEmojiDialog.this.invalidate();
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                runnable.run();
            }
        });
        this.emojiSelectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.emojiSelectAnimator.setDuration(260L);
        this.emojiSelectAnimator.start();
    }

    public void lambda$animateEmojiSelect$7(Rect rect, ImageViewEmoji imageViewEmoji, boolean[] zArr, Runnable runnable, AnimatedEmojiDrawable animatedEmojiDrawable, ValueAnimator valueAnimator) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.scrimAlpha = 1.0f - ((floatValue * floatValue) * floatValue);
        this.emojiSelectAlpha = 1.0f - ((float) Math.pow(floatValue, 10.0d));
        AndroidUtilities.lerp(rect, this.drawableToBounds, floatValue, this.emojiSelectRect);
        float max = Math.max(1.0f, this.overshootInterpolator.getInterpolation(MathUtils.clamp((3.0f * floatValue) - 2.0f, 0.0f, 1.0f))) * imageViewEmoji.getScaleX();
        Rect rect2 = this.emojiSelectRect;
        rect2.set((int) (rect2.centerX() - ((this.emojiSelectRect.width() / 2.0f) * max)), (int) (this.emojiSelectRect.centerY() - ((this.emojiSelectRect.height() / 2.0f) * max)), (int) (this.emojiSelectRect.centerX() + ((this.emojiSelectRect.width() / 2.0f) * max)), (int) (this.emojiSelectRect.centerY() + ((this.emojiSelectRect.height() / 2.0f) * max)));
        invalidate();
        if (floatValue <= 0.85f || zArr[0]) {
            return;
        }
        zArr[0] = true;
        runnable.run();
        if (animatedEmojiDrawable == null || (swapAnimatedEmojiDrawable = this.scrimDrawable) == null) {
            return;
        }
        swapAnimatedEmojiDrawable.play();
    }

    public void checkScroll() {
        boolean canScrollVertically = (this.gridSearch ? this.emojiSearchGridView : this.emojiGridView).canScrollVertically(1);
        if (canScrollVertically != this.bottomGradientShown) {
            this.bottomGradientShown = canScrollVertically;
            this.bottomGradientView.animate().alpha(canScrollVertically ? 1.0f : 0.0f).setDuration(200L).start();
        }
    }

    public void scrollToPosition(int i, int i2) {
        View findViewByPosition = this.layoutManager.findViewByPosition(i);
        int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        if ((findViewByPosition == null && Math.abs(i - findFirstVisibleItemPosition) > this.layoutManager.getSpanCount() * 9.0f) || !SharedConfig.animationsEnabled()) {
            this.scrollHelper.setScrollDirection(this.layoutManager.findFirstVisibleItemPosition() < i ? 0 : 1);
            this.scrollHelper.scrollToPosition(i, i2, false, true);
            return;
        }
        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(this.emojiGridView.getContext(), 2) {
            @Override
            public void onEnd() {
                SelectAnimatedEmojiDialog.this.smoothScrolling = false;
            }

            @Override
            protected void onStart() {
                SelectAnimatedEmojiDialog.this.smoothScrolling = true;
            }
        };
        linearSmoothScrollerCustom.setTargetPosition(i);
        linearSmoothScrollerCustom.setOffset(i2);
        this.layoutManager.startSmoothScroll(linearSmoothScrollerCustom);
    }

    public void switchGrids(final boolean z) {
        if (this.gridSearch == z) {
            return;
        }
        this.gridSearch = z;
        this.emojiGridView.setVisibility(0);
        this.emojiSearchGridView.setVisibility(0);
        ValueAnimator valueAnimator = this.gridSwitchAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.searchEmptyViewAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.searchEmptyViewAnimator = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.gridSwitchAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                SelectAnimatedEmojiDialog.this.lambda$switchGrids$8(z, valueAnimator3);
            }
        });
        this.gridSwitchAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SelectAnimatedEmojiDialog.this.emojiSearchGridView.setVisibility(z ? 0 : 8);
                SelectAnimatedEmojiDialog.this.emojiGridView.setVisibility(z ? 8 : 0);
                SelectAnimatedEmojiDialog.this.gridSwitchAnimator = null;
                if (z || SelectAnimatedEmojiDialog.this.searchResult == null) {
                    return;
                }
                SelectAnimatedEmojiDialog.this.searchResult.clear();
                SelectAnimatedEmojiDialog.this.searchAdapter.updateRows(false);
            }
        });
        this.gridSwitchAnimator.setDuration(280L);
        this.gridSwitchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.gridSwitchAnimator.start();
        ((View) this.emojiGridView.getParent()).animate().translationY(this.gridSearch ? -AndroidUtilities.m35dp(36.0f) : 0.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).setDuration(160L).start();
        checkScroll();
    }

    public void lambda$switchGrids$8(boolean z, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!z) {
            floatValue = 1.0f - floatValue;
        }
        this.emojiGridView.setAlpha(1.0f - floatValue);
        this.emojiSearchGridView.setAlpha(floatValue);
        this.emojiSearchEmptyView.setAlpha(this.emojiSearchGridView.getAlpha() * floatValue);
    }

    public void updateSearchEmptyViewImage() {
        ImageLocation forDocument;
        if (this.emojiSearchEmptyViewImageView == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).getFeaturedEmojiSets());
        Collections.shuffle(arrayList);
        TLRPC$Document tLRPC$Document = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if ((arrayList.get(i) instanceof TLRPC$TL_stickerSetFullCovered) && ((TLRPC$TL_stickerSetFullCovered) arrayList.get(i)).documents != null) {
                ArrayList arrayList2 = new ArrayList(((TLRPC$TL_stickerSetFullCovered) arrayList.get(i)).documents);
                Collections.shuffle(arrayList2);
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    TLRPC$Document tLRPC$Document2 = (TLRPC$Document) arrayList2.get(i2);
                    if (tLRPC$Document2 != null && this.emptyViewEmojis.contains(MessageObject.findAnimatedEmojiEmoticon(tLRPC$Document2, null))) {
                        tLRPC$Document = tLRPC$Document2;
                        break;
                    }
                    i2++;
                }
            }
            if (tLRPC$Document != null) {
                break;
            }
        }
        if (tLRPC$Document == null) {
            ArrayList arrayList3 = new ArrayList(MediaDataController.getInstance(this.currentAccount).getStickerSets(5));
            Collections.shuffle(arrayList3);
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                if (arrayList3.get(i3) != null && ((TLRPC$TL_messages_stickerSet) arrayList3.get(i3)).documents != null) {
                    ArrayList arrayList4 = new ArrayList(((TLRPC$TL_messages_stickerSet) arrayList3.get(i3)).documents);
                    Collections.shuffle(arrayList4);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList4.size()) {
                            break;
                        }
                        TLRPC$Document tLRPC$Document3 = (TLRPC$Document) arrayList4.get(i4);
                        if (tLRPC$Document3 != null && this.emptyViewEmojis.contains(MessageObject.findAnimatedEmojiEmoticon(tLRPC$Document3, null))) {
                            tLRPC$Document = tLRPC$Document3;
                            break;
                        }
                        i4++;
                    }
                }
                if (tLRPC$Document != null) {
                    break;
                }
            }
        }
        TLRPC$Document tLRPC$Document4 = tLRPC$Document;
        if (tLRPC$Document4 != null) {
            String str = "36_36";
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$Document4.thumbs, "windowBackgroundWhiteGrayIcon", 0.2f);
            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document4.thumbs, 90);
            if ("video/webm".equals(tLRPC$Document4.mime_type)) {
                forDocument = ImageLocation.getForDocument(tLRPC$Document4);
                str = "36_36_" + ImageLoader.AUTOPLAY_FILTER;
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
            } else {
                if (svgThumb != null && MessageObject.isAnimatedStickerDocument(tLRPC$Document4, false)) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                forDocument = ImageLocation.getForDocument(tLRPC$Document4);
            }
            String str2 = str;
            ImageLocation imageLocation = forDocument;
            this.emojiSearchEmptyViewImageView.setLayerNum(7);
            this.emojiSearchEmptyViewImageView.setRoundRadius(AndroidUtilities.m35dp(4.0f));
            this.emojiSearchEmptyViewImageView.setImage(imageLocation, str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document4), "36_36", svgThumb, tLRPC$Document4);
        }
    }

    public void switchSearchEmptyView(final boolean z) {
        if (this.searchEmptyViewVisible == z) {
            return;
        }
        this.searchEmptyViewVisible = z;
        ValueAnimator valueAnimator = this.searchEmptyViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.searchEmptyViewAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SelectAnimatedEmojiDialog.this.lambda$switchSearchEmptyView$9(z, valueAnimator2);
            }
        });
        this.searchEmptyViewAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                selectAnimatedEmojiDialog.emojiSearchEmptyView.setVisibility((z && selectAnimatedEmojiDialog.emojiSearchGridView.getVisibility() == 0) ? 0 : 8);
                SelectAnimatedEmojiDialog.this.searchEmptyViewAnimator = null;
            }
        });
        this.searchEmptyViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.searchEmptyViewAnimator.setDuration(100L);
        this.searchEmptyViewAnimator.start();
        if (z) {
            updateSearchEmptyViewImage();
        }
    }

    public void lambda$switchSearchEmptyView$9(boolean z, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!z) {
            floatValue = 1.0f - floatValue;
        }
        this.emojiSearchEmptyView.setAlpha(this.emojiSearchGridView.getAlpha() * floatValue);
    }

    public void search(final String str) {
        Runnable runnable = this.clearSearchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.clearSearchRunnable = null;
        }
        Runnable runnable2 = this.searchRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.searchRunnable = null;
        }
        if (str == null) {
            this.searching = false;
            this.searched = false;
            switchGrids(false);
            SearchBox searchBox = this.searchBox;
            if (searchBox != null && searchBox.clearDrawable != null) {
                this.searchBox.clearDrawable.stopAnimation();
            }
            this.searchAdapter.updateRows(true);
            this.lastQuery = null;
        } else {
            final boolean z = !this.searching;
            this.searching = true;
            this.searched = false;
            SearchBox searchBox2 = this.searchBox;
            if (searchBox2 != null && searchBox2.clearDrawable != null) {
                this.searchBox.clearDrawable.startAnimation();
            }
            if (z) {
                ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList = this.searchResult;
                if (arrayList != null) {
                    arrayList.clear();
                }
                this.searchAdapter.updateRows(false);
            } else if (!str.equals(this.lastQuery)) {
                Runnable runnable3 = new Runnable() {
                    @Override
                    public final void run() {
                        SelectAnimatedEmojiDialog.this.lambda$search$10();
                    }
                };
                this.clearSearchRunnable = runnable3;
                AndroidUtilities.runOnUIThread(runnable3, 120L);
            }
            this.lastQuery = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, lastSearchKeyboardLanguage)) {
                MediaDataController.getInstance(this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            lastSearchKeyboardLanguage = currentKeyboardLanguage;
            Runnable runnable4 = new Runnable() {
                @Override
                public final void run() {
                    SelectAnimatedEmojiDialog.this.lambda$search$14(str, z);
                }
            };
            this.searchRunnable = runnable4;
            AndroidUtilities.runOnUIThread(runnable4, 425L);
        }
        updateSearchBox();
        SearchBox searchBox3 = this.searchBox;
        if (searchBox3 == null || searchBox3.clear == null) {
            return;
        }
        if (this.searching != (this.searchBox.clear.getAlpha() != 0.0f)) {
            this.searchBox.clear.animate().alpha(this.searching ? 1.0f : 0.0f).setDuration(150L).scaleX(this.searching ? 1.0f : 0.1f).scaleY(this.searching ? 1.0f : 0.1f).start();
        }
    }

    public void lambda$search$10() {
        ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList = this.searchResult;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.searchAdapter.updateRows(true);
    }

    public void lambda$search$14(final String str, final boolean z) {
        MediaDataController.getInstance(this.currentAccount).getAnimatedEmojiByKeywords(str, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                SelectAnimatedEmojiDialog.this.lambda$search$13(str, z, (ArrayList) obj);
            }
        });
    }

    public void lambda$search$13(final String str, final boolean z, ArrayList arrayList) {
        ArrayList<TLRPC$Document> arrayList2;
        ArrayList<TLRPC$Document> arrayList3;
        final ArrayList arrayList4 = arrayList == null ? new ArrayList() : arrayList;
        final HashMap<String, TLRPC$TL_availableReaction> reactionsMap = MediaDataController.getInstance(this.currentAccount).getReactionsMap();
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(5);
            for (int i = 0; i < stickerSets.size(); i++) {
                if (stickerSets.get(i).documents != null && (arrayList3 = stickerSets.get(i).documents) != null) {
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList3.get(i2), null);
                        long j = arrayList3.get(i2).f865id;
                        if (findAnimatedEmojiEmoticon != null && !arrayList4.contains(Long.valueOf(j)) && str.contains(findAnimatedEmojiEmoticon.toLowerCase())) {
                            arrayList4.add(Long.valueOf(j));
                        }
                    }
                }
            }
            ArrayList<TLRPC$StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(this.currentAccount).getFeaturedEmojiSets();
            for (int i3 = 0; i3 < featuredEmojiSets.size(); i3++) {
                if ((featuredEmojiSets.get(i3) instanceof TLRPC$TL_stickerSetFullCovered) && ((TLRPC$TL_stickerSetFullCovered) featuredEmojiSets.get(i3)).keywords != null && (arrayList2 = ((TLRPC$TL_stickerSetFullCovered) featuredEmojiSets.get(i3)).documents) != null) {
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        String findAnimatedEmojiEmoticon2 = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i4), null);
                        long j2 = arrayList2.get(i4).f865id;
                        if (findAnimatedEmojiEmoticon2 != null && !arrayList4.contains(Long.valueOf(j2)) && str.contains(findAnimatedEmojiEmoticon2)) {
                            arrayList4.add(Long.valueOf(j2));
                        }
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SelectAnimatedEmojiDialog.this.lambda$search$11(str, reactionsMap, arrayList4, z);
                }
            });
            return;
        }
        final ArrayList arrayList5 = arrayList4;
        MediaDataController.getInstance(this.currentAccount).getEmojiSuggestions(lastSearchKeyboardLanguage, str, false, new MediaDataController.KeywordResultCallback() {
            @Override
            public final void run(ArrayList arrayList6, String str2) {
                SelectAnimatedEmojiDialog.this.lambda$search$12(str, arrayList5, reactionsMap, z, arrayList6, str2);
            }
        }, null, true, this.type == 3, 30);
    }

    public void lambda$search$11(String str, HashMap hashMap, ArrayList arrayList, boolean z) {
        TLRPC$TL_availableReaction tLRPC$TL_availableReaction;
        Runnable runnable = this.clearSearchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.clearSearchRunnable = null;
        }
        if (str != this.lastQuery) {
            return;
        }
        this.searched = true;
        switchGrids(true);
        SearchBox searchBox = this.searchBox;
        if (searchBox != null && searchBox.clearDrawable != null) {
            this.searchBox.clearDrawable.stopAnimation();
        }
        ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList2 = this.searchResult;
        if (arrayList2 == null) {
            this.searchResult = new ArrayList<>();
        } else {
            arrayList2.clear();
        }
        this.emojiSearchGridView.scrollToPosition(0);
        this.searched = true;
        int i = this.type;
        if ((i == 1 || i == 2) && (tLRPC$TL_availableReaction = (TLRPC$TL_availableReaction) hashMap.get(str)) != null) {
            this.searchResult.add(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(tLRPC$TL_availableReaction));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.searchResult.add(ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji((Long) arrayList.get(i2)));
        }
        this.searchAdapter.updateRows(!z);
    }

    public void lambda$search$12(String str, ArrayList arrayList, HashMap hashMap, boolean z, ArrayList arrayList2, String str2) {
        TLRPC$TL_availableReaction tLRPC$TL_availableReaction;
        Runnable runnable = this.clearSearchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.clearSearchRunnable = null;
        }
        if (str != this.lastQuery) {
            return;
        }
        this.searched = true;
        switchGrids(true);
        SearchBox searchBox = this.searchBox;
        if (searchBox != null && searchBox.clearDrawable != null) {
            this.searchBox.clearDrawable.stopAnimation();
        }
        ArrayList<ReactionsLayoutInBubble.VisibleReaction> arrayList3 = this.searchResult;
        if (arrayList3 == null) {
            this.searchResult = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList2.get(i)).emoji.startsWith("animated_")) {
                    arrayList.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList2.get(i)).emoji.substring(9))));
                } else {
                    int i2 = this.type;
                    if ((i2 == 1 || i2 == 2) && (tLRPC$TL_availableReaction = (TLRPC$TL_availableReaction) hashMap.get(((MediaDataController.KeywordResult) arrayList2.get(i)).emoji)) != null) {
                        this.searchResult.add(ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(tLRPC$TL_availableReaction));
                    }
                }
            } catch (Exception unused) {
            }
        }
        this.emojiSearchGridView.scrollToPosition(0);
        this.searched = true;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.searchResult.add(ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji((Long) arrayList.get(i3)));
        }
        this.searchAdapter.updateRows(true ^ z);
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        public int VIEW_TYPE_EMOJI;
        public int VIEW_TYPE_REACTION;
        public int VIEW_TYPE_SEARCH;
        private int count;
        private ArrayList<Integer> rowHashCodes;

        private SearchAdapter() {
            SelectAnimatedEmojiDialog.this = r1;
            this.VIEW_TYPE_SEARCH = 7;
            this.VIEW_TYPE_EMOJI = 3;
            this.VIEW_TYPE_REACTION = 4;
            this.count = 1;
            this.rowHashCodes = new ArrayList<>();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == this.VIEW_TYPE_EMOJI || viewHolder.getItemViewType() == this.VIEW_TYPE_REACTION;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View imageViewEmoji;
            if (i == this.VIEW_TYPE_SEARCH) {
                imageViewEmoji = new View(this, SelectAnimatedEmojiDialog.this.getContext()) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(52.0f), 1073741824));
                    }
                };
                imageViewEmoji.setTag("searchbox");
            } else {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                imageViewEmoji = new ImageViewEmoji(selectAnimatedEmojiDialog.getContext());
            }
            if (SelectAnimatedEmojiDialog.this.showAnimator != null && SelectAnimatedEmojiDialog.this.showAnimator.isRunning()) {
                imageViewEmoji.setScaleX(0.0f);
                imageViewEmoji.setScaleY(0.0f);
            }
            return new RecyclerListView.Holder(imageViewEmoji);
        }

        @Override
        public int getItemViewType(int i) {
            if (SelectAnimatedEmojiDialog.this.searchResult == null || i < 0 || i >= SelectAnimatedEmojiDialog.this.searchResult.size() || ((ReactionsLayoutInBubble.VisibleReaction) SelectAnimatedEmojiDialog.this.searchResult.get(i)).emojicon == null) {
                return this.VIEW_TYPE_EMOJI;
            }
            return this.VIEW_TYPE_REACTION;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            if (viewHolder.getItemViewType() == this.VIEW_TYPE_REACTION) {
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) viewHolder.itemView;
                imageViewEmoji.position = i;
                if (SelectAnimatedEmojiDialog.this.searchResult == null || i < 0 || i >= SelectAnimatedEmojiDialog.this.searchResult.size()) {
                    return;
                }
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) SelectAnimatedEmojiDialog.this.searchResult.get(i);
                if (imageViewEmoji.imageReceiver == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    imageViewEmoji.imageReceiver = imageReceiver;
                    imageReceiver.setLayerNum(7);
                    imageViewEmoji.imageReceiver.onAttachedToWindow();
                }
                imageViewEmoji.imageReceiver.setParentView(SelectAnimatedEmojiDialog.this.emojiSearchGridView);
                imageViewEmoji.reaction = visibleReaction;
                imageViewEmoji.setViewSelected(SelectAnimatedEmojiDialog.this.selectedReactions.contains(visibleReaction), false);
                imageViewEmoji.notDraw = false;
                imageViewEmoji.invalidate();
                if (visibleReaction.emojicon != null) {
                    imageViewEmoji.isDefaultReaction = true;
                    TLRPC$TL_availableReaction tLRPC$TL_availableReaction = MediaDataController.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).getReactionsMap().get(visibleReaction.emojicon);
                    if (tLRPC$TL_availableReaction != null) {
                        imageViewEmoji.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.select_animation), "60_60_pcache", null, null, DocumentObject.getSvgThumb(tLRPC$TL_availableReaction.activate_animation, "windowBackgroundWhiteGrayIcon", 0.2f), 0L, "tgs", visibleReaction, 0);
                    } else {
                        imageViewEmoji.imageReceiver.clearImage();
                    }
                    imageViewEmoji.span = null;
                    imageViewEmoji.document = null;
                    imageViewEmoji.setDrawable(null);
                    PremiumLockIconView premiumLockIconView = imageViewEmoji.premiumLockIconView;
                    if (premiumLockIconView != null) {
                        premiumLockIconView.setVisibility(8);
                        imageViewEmoji.premiumLockIconView.setImageReceiver(null);
                        return;
                    }
                    return;
                }
                imageViewEmoji.isDefaultReaction = false;
                imageViewEmoji.span = new AnimatedEmojiSpan(visibleReaction.documentId, (Paint.FontMetricsInt) null);
                imageViewEmoji.document = null;
                imageViewEmoji.imageReceiver.clearImage();
                AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) SelectAnimatedEmojiDialog.this.emojiSearchGridView.animatedEmojiDrawables.get(imageViewEmoji.span.getDocumentId());
                if (animatedEmojiDrawable == null) {
                    animatedEmojiDrawable = AnimatedEmojiDrawable.make(SelectAnimatedEmojiDialog.this.currentAccount, SelectAnimatedEmojiDialog.this.getCacheType(), imageViewEmoji.span.getDocumentId());
                    animatedEmojiDrawable.addView(SelectAnimatedEmojiDialog.this.emojiSearchGridView);
                    SelectAnimatedEmojiDialog.this.emojiSearchGridView.animatedEmojiDrawables.put(imageViewEmoji.span.getDocumentId(), animatedEmojiDrawable);
                }
                imageViewEmoji.setDrawable(animatedEmojiDrawable);
                if (UserConfig.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).isPremium()) {
                    return;
                }
                if (imageViewEmoji.premiumLockIconView == null) {
                    PremiumLockIconView premiumLockIconView2 = new PremiumLockIconView(SelectAnimatedEmojiDialog.this.getContext(), PremiumLockIconView.TYPE_STICKERS_PREMIUM_LOCKED);
                    imageViewEmoji.premiumLockIconView = premiumLockIconView2;
                    imageViewEmoji.addView(premiumLockIconView2, LayoutHelper.createFrame(12, 12, 85));
                }
                imageViewEmoji.premiumLockIconView.setVisibility(0);
            } else if (viewHolder.getItemViewType() == this.VIEW_TYPE_EMOJI) {
                ImageViewEmoji imageViewEmoji2 = (ImageViewEmoji) viewHolder.itemView;
                imageViewEmoji2.empty = false;
                imageViewEmoji2.position = i;
                imageViewEmoji2.setPadding(AndroidUtilities.m35dp(1.0f), AndroidUtilities.m35dp(1.0f), AndroidUtilities.m35dp(1.0f), AndroidUtilities.m35dp(1.0f));
                imageViewEmoji2.setDrawable(null);
                if (SelectAnimatedEmojiDialog.this.searchResult == null || i < 0 || i >= SelectAnimatedEmojiDialog.this.searchResult.size()) {
                    z = false;
                } else {
                    long j = ((ReactionsLayoutInBubble.VisibleReaction) SelectAnimatedEmojiDialog.this.searchResult.get(i)).documentId;
                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(j, (Paint.FontMetricsInt) null);
                    imageViewEmoji2.span = animatedEmojiSpan;
                    imageViewEmoji2.document = animatedEmojiSpan.document;
                    z = SelectAnimatedEmojiDialog.this.selectedDocumentIds.contains(Long.valueOf(j));
                    AnimatedEmojiDrawable animatedEmojiDrawable2 = (AnimatedEmojiDrawable) SelectAnimatedEmojiDialog.this.emojiSearchGridView.animatedEmojiDrawables.get(imageViewEmoji2.span.getDocumentId());
                    if (animatedEmojiDrawable2 == null) {
                        animatedEmojiDrawable2 = AnimatedEmojiDrawable.make(SelectAnimatedEmojiDialog.this.currentAccount, SelectAnimatedEmojiDialog.this.getCacheType(), imageViewEmoji2.span.getDocumentId());
                        animatedEmojiDrawable2.addView(SelectAnimatedEmojiDialog.this.emojiSearchGridView);
                        SelectAnimatedEmojiDialog.this.emojiSearchGridView.animatedEmojiDrawables.put(imageViewEmoji2.span.getDocumentId(), animatedEmojiDrawable2);
                    }
                    imageViewEmoji2.setDrawable(animatedEmojiDrawable2);
                }
                imageViewEmoji2.setViewSelected(z, false);
            }
        }

        @Override
        public int getItemCount() {
            return this.count;
        }

        public void updateRows(boolean z) {
            boolean z2 = false;
            if (!SelectAnimatedEmojiDialog.this.isAttached) {
                z = false;
            }
            final ArrayList arrayList = new ArrayList(this.rowHashCodes);
            this.count = 0;
            this.rowHashCodes.clear();
            if (SelectAnimatedEmojiDialog.this.searchResult != null) {
                for (int i = 0; i < SelectAnimatedEmojiDialog.this.searchResult.size(); i++) {
                    this.count++;
                    this.rowHashCodes.add(Integer.valueOf(Objects.hash(-4342, SelectAnimatedEmojiDialog.this.searchResult.get(i))));
                }
            }
            if (z) {
                DiffUtil.calculateDiff(new DiffUtil.Callback() {
                    @Override
                    public boolean areContentsTheSame(int i2, int i3) {
                        return true;
                    }

                    @Override
                    public int getOldListSize() {
                        return arrayList.size();
                    }

                    @Override
                    public int getNewListSize() {
                        return SearchAdapter.this.rowHashCodes.size();
                    }

                    @Override
                    public boolean areItemsTheSame(int i2, int i3) {
                        return ((Integer) arrayList.get(i2)).equals(SearchAdapter.this.rowHashCodes.get(i3));
                    }
                }, false).dispatchUpdatesTo(this);
            } else {
                notifyDataSetChanged();
            }
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (selectAnimatedEmojiDialog.searched && this.count == 0) {
                z2 = true;
            }
            selectAnimatedEmojiDialog.switchSearchEmptyView(z2);
        }
    }

    public class Adapter extends RecyclerListView.SelectionAdapter {
        public int VIEW_TYPE_BUTTON;
        public int VIEW_TYPE_EMOJI;
        public int VIEW_TYPE_EXPAND;
        public int VIEW_TYPE_HEADER;
        public int VIEW_TYPE_HINT;
        public int VIEW_TYPE_IMAGE;
        public int VIEW_TYPE_REACTION;
        public int VIEW_TYPE_SEARCH;
        public int VIEW_TYPE_TOPIC_ICON;

        private Adapter() {
            SelectAnimatedEmojiDialog.this = r1;
            this.VIEW_TYPE_HEADER = 0;
            this.VIEW_TYPE_REACTION = 1;
            this.VIEW_TYPE_IMAGE = 2;
            this.VIEW_TYPE_EMOJI = 3;
            this.VIEW_TYPE_EXPAND = 4;
            this.VIEW_TYPE_BUTTON = 5;
            this.VIEW_TYPE_HINT = 6;
            this.VIEW_TYPE_SEARCH = 7;
            this.VIEW_TYPE_TOPIC_ICON = 8;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == this.VIEW_TYPE_IMAGE || itemViewType == this.VIEW_TYPE_REACTION || itemViewType == this.VIEW_TYPE_EMOJI || itemViewType == this.VIEW_TYPE_TOPIC_ICON;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            TextView textView;
            if (i == this.VIEW_TYPE_HEADER) {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                textView = new HeaderView(selectAnimatedEmojiDialog, selectAnimatedEmojiDialog.getContext());
            } else if (i == this.VIEW_TYPE_IMAGE) {
                textView = new ImageView(SelectAnimatedEmojiDialog.this.getContext());
            } else if (i == this.VIEW_TYPE_EMOJI || i == this.VIEW_TYPE_REACTION || i == this.VIEW_TYPE_TOPIC_ICON) {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = SelectAnimatedEmojiDialog.this;
                ImageViewEmoji imageViewEmoji = new ImageViewEmoji(selectAnimatedEmojiDialog2.getContext());
                textView = imageViewEmoji;
                if (i == this.VIEW_TYPE_TOPIC_ICON) {
                    imageViewEmoji.isStaticIcon = true;
                    ImageReceiver imageReceiver = new ImageReceiver(this, imageViewEmoji) {
                        @Override
                        public boolean draw(Canvas canvas) {
                            return super.draw(canvas);
                        }
                    };
                    imageViewEmoji.imageReceiver = imageReceiver;
                    imageViewEmoji.imageReceiverToDraw = imageReceiver;
                    imageReceiver.setImageBitmap(SelectAnimatedEmojiDialog.this.forumIconDrawable);
                    SelectAnimatedEmojiDialog.this.forumIconImage = imageViewEmoji;
                    imageViewEmoji.setPadding(AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f));
                    textView = imageViewEmoji;
                }
            } else if (i == this.VIEW_TYPE_EXPAND) {
                textView = new EmojiPackExpand(SelectAnimatedEmojiDialog.this.getContext(), null);
            } else if (i == this.VIEW_TYPE_BUTTON) {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog3 = SelectAnimatedEmojiDialog.this;
                textView = new EmojiPackButton(selectAnimatedEmojiDialog3, selectAnimatedEmojiDialog3.getContext());
            } else if (i == this.VIEW_TYPE_HINT) {
                TextView textView2 = new TextView(this, SelectAnimatedEmojiDialog.this.getContext()) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(AndroidUtilities.m35dp(26.0f)), 1073741824));
                    }
                };
                textView2.setTextSize(1, 13.0f);
                if (SelectAnimatedEmojiDialog.this.type != 3) {
                    if (SelectAnimatedEmojiDialog.this.type == 0) {
                        textView2.setText(LocaleController.getString("EmojiLongtapHint", C1072R.string.EmojiLongtapHint));
                    } else {
                        textView2.setText(LocaleController.getString("ReactionsLongtapHint", C1072R.string.ReactionsLongtapHint));
                    }
                } else {
                    textView2.setText(LocaleController.getString("SelectTopicIconHint", C1072R.string.SelectTopicIconHint));
                }
                textView2.setGravity(17);
                textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText", SelectAnimatedEmojiDialog.this.resourcesProvider));
                textView = textView2;
            } else if (i == this.VIEW_TYPE_SEARCH) {
                View fixedHeightEmptyCell = new FixedHeightEmptyCell(SelectAnimatedEmojiDialog.this.getContext(), 52);
                fixedHeightEmptyCell.setTag("searchbox");
                textView = fixedHeightEmptyCell;
            } else {
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog4 = SelectAnimatedEmojiDialog.this;
                textView = new ImageViewEmoji(selectAnimatedEmojiDialog4.getContext());
            }
            if (SelectAnimatedEmojiDialog.this.showAnimator != null && SelectAnimatedEmojiDialog.this.showAnimator.isRunning()) {
                textView.setScaleX(0.0f);
                textView.setScaleY(0.0f);
            }
            return new RecyclerListView.Holder(textView);
        }

        @Override
        public int getItemViewType(int i) {
            if (i != SelectAnimatedEmojiDialog.this.searchRow) {
                if ((i < SelectAnimatedEmojiDialog.this.recentReactionsStartRow || i >= SelectAnimatedEmojiDialog.this.recentReactionsEndRow) && (i < SelectAnimatedEmojiDialog.this.topReactionsStartRow || i >= SelectAnimatedEmojiDialog.this.topReactionsEndRow)) {
                    if (SelectAnimatedEmojiDialog.this.positionToExpand.indexOfKey(i) < 0) {
                        if (SelectAnimatedEmojiDialog.this.positionToButton.indexOfKey(i) < 0) {
                            if (i != SelectAnimatedEmojiDialog.this.longtapHintRow) {
                                if (SelectAnimatedEmojiDialog.this.positionToSection.indexOfKey(i) < 0 && i != SelectAnimatedEmojiDialog.this.recentReactionsSectionRow && i != SelectAnimatedEmojiDialog.this.popularSectionRow && i != SelectAnimatedEmojiDialog.this.topicEmojiHeaderRow) {
                                    if (i == SelectAnimatedEmojiDialog.this.defaultTopicIconRow) {
                                        return this.VIEW_TYPE_TOPIC_ICON;
                                    }
                                    return this.VIEW_TYPE_EMOJI;
                                }
                                return this.VIEW_TYPE_HEADER;
                            }
                            return this.VIEW_TYPE_HINT;
                        }
                        return this.VIEW_TYPE_BUTTON;
                    }
                    return this.VIEW_TYPE_EXPAND;
                }
                return this.VIEW_TYPE_REACTION;
            }
            return this.VIEW_TYPE_SEARCH;
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r22, int r23) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.SelectAnimatedEmojiDialog.Adapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        public void lambda$onBindViewHolder$0(View view) {
            SelectAnimatedEmojiDialog.this.clearRecent();
        }

        public void lambda$onBindViewHolder$1(EmojiView.EmojiPack emojiPack, int i, View view) {
            Integer num;
            View view2;
            int childAdapterPosition;
            if (!emojiPack.free && !UserConfig.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).isPremium()) {
                new PremiumFeatureBottomSheet(SelectAnimatedEmojiDialog.this.baseFragment, SelectAnimatedEmojiDialog.this.getContext(), SelectAnimatedEmojiDialog.this.currentAccount, 11, false).show();
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= SelectAnimatedEmojiDialog.this.emojiGridView.getChildCount()) {
                    num = null;
                    view2 = null;
                    break;
                } else if ((SelectAnimatedEmojiDialog.this.emojiGridView.getChildAt(i2) instanceof EmojiPackExpand) && (childAdapterPosition = SelectAnimatedEmojiDialog.this.emojiGridView.getChildAdapterPosition((view2 = SelectAnimatedEmojiDialog.this.emojiGridView.getChildAt(i2)))) >= 0 && SelectAnimatedEmojiDialog.this.positionToExpand.get(childAdapterPosition) == i) {
                    num = Integer.valueOf(childAdapterPosition);
                    break;
                } else {
                    i2++;
                }
            }
            if (num != null) {
                SelectAnimatedEmojiDialog.this.expand(num.intValue(), view2);
            }
            EmojiPacksAlert.installSet(null, emojiPack.set, false);
            SelectAnimatedEmojiDialog.this.installedEmojiSets.add(Long.valueOf(emojiPack.set.f890id));
            SelectAnimatedEmojiDialog.this.updateRows(true, true);
        }

        @Override
        public int getItemCount() {
            return SelectAnimatedEmojiDialog.this.totalCount;
        }
    }

    public void clearRecent() {
        onRecentClearedListener onrecentclearedlistener;
        if (this.type != 1 || (onrecentclearedlistener = this.onRecentClearedListener) == null) {
            return;
        }
        onrecentclearedlistener.onRecentCleared();
    }

    public class HeaderView extends FrameLayout {
        ImageView closeIcon;
        private LinearLayout layoutView;
        private ValueAnimator lockAnimator;
        private float lockT;
        private RLottieImageView lockView;
        private TextView textView;

        public HeaderView(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Context context) {
            super(context);
            LinearLayout linearLayout = new LinearLayout(context);
            this.layoutView = linearLayout;
            linearLayout.setOrientation(0);
            addView(this.layoutView, LayoutHelper.createFrame(-2, -2, 17));
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.lockView = rLottieImageView;
            rLottieImageView.setAnimation(C1072R.raw.unlock_icon, 20, 20);
            this.lockView.setColorFilter(Theme.getColor("chat_emojiPanelStickerSetName", selectAnimatedEmojiDialog.resourcesProvider));
            this.layoutView.addView(this.lockView, LayoutHelper.createLinear(20, 20));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor("chat_emojiPanelStickerSetName", selectAnimatedEmojiDialog.resourcesProvider));
            this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.textView.setTextSize(1, 14.0f);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            this.layoutView.addView(this.textView, LayoutHelper.createLinear(-2, -2, 17));
            ImageView imageView = new ImageView(context);
            this.closeIcon = imageView;
            imageView.setImageResource(C1072R.C1073drawable.msg_close);
            this.closeIcon.setScaleType(ImageView.ScaleType.CENTER);
            this.closeIcon.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chat_emojiPanelStickerSetNameIcon", selectAnimatedEmojiDialog.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            addView(this.closeIcon, LayoutHelper.createFrame(24, 24, 21));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(30.0f), 1073741824));
        }

        public void setText(String str, boolean z) {
            this.textView.setText(str);
            updateLock(z, false);
        }

        public void updateLock(boolean z, boolean z2) {
            ValueAnimator valueAnimator = this.lockAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.lockAnimator = null;
            }
            if (z2) {
                float[] fArr = new float[2];
                fArr[0] = this.lockT;
                fArr[1] = z ? 1.0f : 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                this.lockAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        SelectAnimatedEmojiDialog.HeaderView.this.lambda$updateLock$0(valueAnimator2);
                    }
                });
                this.lockAnimator.setDuration(200L);
                this.lockAnimator.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                this.lockAnimator.start();
                return;
            }
            this.lockT = z ? 1.0f : 0.0f;
            this.lockView.setTranslationX(AndroidUtilities.m35dp(-8.0f) * (1.0f - this.lockT));
            this.textView.setTranslationX(AndroidUtilities.m35dp(-8.0f) * (1.0f - this.lockT));
            this.lockView.setAlpha(this.lockT);
        }

        public void lambda$updateLock$0(ValueAnimator valueAnimator) {
            this.lockT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.lockView.setTranslationX(AndroidUtilities.m35dp(-8.0f) * (1.0f - this.lockT));
            this.textView.setTranslationX(AndroidUtilities.m35dp(-8.0f) * (1.0f - this.lockT));
            this.lockView.setAlpha(this.lockT);
        }
    }

    public class EmojiPackButton extends FrameLayout {
        AnimatedTextView addButtonTextView;
        FrameLayout addButtonView;
        private ValueAnimator installFadeAway;
        private String lastTitle;
        private ValueAnimator lockAnimator;
        private Boolean lockShow;
        private float lockT;
        PremiumButtonView premiumButtonView;

        public EmojiPackButton(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, Context context) {
            super(context);
            AnimatedTextView animatedTextView = new AnimatedTextView(getContext());
            this.addButtonTextView = animatedTextView;
            animatedTextView.setAnimationProperties(0.3f, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.addButtonTextView.setTextSize(AndroidUtilities.m35dp(14.0f));
            this.addButtonTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.addButtonTextView.setTextColor(Theme.getColor("featuredStickers_buttonText", selectAnimatedEmojiDialog.resourcesProvider));
            this.addButtonTextView.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.addButtonView = frameLayout;
            frameLayout.setBackground(Theme.AdaptiveRipple.filledRect(Theme.getColor("featuredStickers_addButton", selectAnimatedEmojiDialog.resourcesProvider), 8.0f));
            this.addButtonView.addView(this.addButtonTextView, LayoutHelper.createFrame(-1, -2, 17));
            addView(this.addButtonView, LayoutHelper.createFrame(-1, -1.0f));
            PremiumButtonView premiumButtonView = new PremiumButtonView(getContext(), false);
            this.premiumButtonView = premiumButtonView;
            premiumButtonView.setIcon(C1072R.raw.unlock_icon);
            addView(this.premiumButtonView, LayoutHelper.createFrame(-1, -1.0f));
        }

        public void set(String str, boolean z, boolean z2, View.OnClickListener onClickListener) {
            this.lastTitle = str;
            if (z) {
                this.addButtonView.setVisibility(8);
                this.premiumButtonView.setVisibility(0);
                this.premiumButtonView.setButton(LocaleController.formatString("UnlockPremiumEmojiPack", C1072R.string.UnlockPremiumEmojiPack, str), onClickListener);
            } else {
                this.premiumButtonView.setVisibility(8);
                this.addButtonView.setVisibility(0);
                this.addButtonView.setOnClickListener(onClickListener);
            }
            updateInstall(z2, false);
            updateLock(z, false);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setPadding(AndroidUtilities.m35dp(5.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(5.0f), AndroidUtilities.m35dp(8.0f));
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(44.0f) + getPaddingTop() + getPaddingBottom(), 1073741824));
        }

        public void updateInstall(boolean z, boolean z2) {
            String formatString;
            if (z) {
                formatString = LocaleController.getString("Added", C1072R.string.Added);
            } else {
                formatString = LocaleController.formatString("AddStickersCount", C1072R.string.AddStickersCount, this.lastTitle);
            }
            this.addButtonTextView.setText(formatString, z2);
            ValueAnimator valueAnimator = this.installFadeAway;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.installFadeAway = null;
            }
            this.addButtonView.setEnabled(!z);
            if (z2) {
                float[] fArr = new float[2];
                fArr[0] = this.addButtonView.getAlpha();
                fArr[1] = z ? 0.6f : 1.0f;
                this.installFadeAway = ValueAnimator.ofFloat(fArr);
                FrameLayout frameLayout = this.addButtonView;
                frameLayout.setAlpha(frameLayout.getAlpha());
                this.installFadeAway.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        SelectAnimatedEmojiDialog.EmojiPackButton.this.lambda$updateInstall$0(valueAnimator2);
                    }
                });
                this.installFadeAway.setDuration(450L);
                this.installFadeAway.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.installFadeAway.start();
                return;
            }
            this.addButtonView.setAlpha(z ? 0.6f : 1.0f);
        }

        public void lambda$updateInstall$0(ValueAnimator valueAnimator) {
            FrameLayout frameLayout = this.addButtonView;
            if (frameLayout != null) {
                frameLayout.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        private void updateLock(final boolean z, boolean z2) {
            ValueAnimator valueAnimator = this.lockAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.lockAnimator = null;
            }
            Boolean bool = this.lockShow;
            if (bool == null || bool.booleanValue() != z) {
                Boolean valueOf = Boolean.valueOf(z);
                this.lockShow = valueOf;
                if (z2) {
                    this.premiumButtonView.setVisibility(0);
                    float[] fArr = new float[2];
                    fArr[0] = this.lockT;
                    fArr[1] = z ? 1.0f : 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.lockAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            SelectAnimatedEmojiDialog.EmojiPackButton.this.lambda$updateLock$1(valueAnimator2);
                        }
                    });
                    this.lockAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (z) {
                                return;
                            }
                            EmojiPackButton.this.premiumButtonView.setVisibility(8);
                        }
                    });
                    this.lockAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.lockAnimator.setDuration(350L);
                    this.lockAnimator.start();
                    return;
                }
                float f = valueOf.booleanValue() ? 1.0f : 0.0f;
                this.lockT = f;
                this.addButtonView.setAlpha(1.0f - f);
                this.premiumButtonView.setAlpha(this.lockT);
                this.premiumButtonView.setScaleX(this.lockT);
                this.premiumButtonView.setScaleY(this.lockT);
                this.premiumButtonView.setVisibility(this.lockShow.booleanValue() ? 0 : 8);
            }
        }

        public void lambda$updateLock$1(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.lockT = floatValue;
            FrameLayout frameLayout = this.addButtonView;
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f - floatValue);
            }
            PremiumButtonView premiumButtonView = this.premiumButtonView;
            if (premiumButtonView != null) {
                premiumButtonView.setAlpha(this.lockT);
            }
        }
    }

    public static class EmojiPackExpand extends FrameLayout {
        public TextView textView;

        public EmojiPackExpand(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 12.0f);
            this.textView.setTextColor(-1);
            this.textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.m35dp(11.0f), ColorUtils.setAlphaComponent(Theme.getColor("chat_emojiPanelStickerSetName", resourcesProvider), 99)));
            this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.textView.setPadding(AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(1.66f), AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(2.0f));
            addView(this.textView, LayoutHelper.createFrame(-2, -2, 17));
        }
    }

    public long animateExpandDuration() {
        return animateExpandAppearDuration() + animateExpandCrossfadeDuration() + 16;
    }

    public long animateExpandAppearDuration() {
        return Math.max(450L, Math.min(55, this.animateExpandToPosition - this.animateExpandFromPosition) * 30);
    }

    public long animateExpandCrossfadeDuration() {
        return Math.max(300L, Math.min(45, this.animateExpandToPosition - this.animateExpandFromPosition) * 25);
    }

    public class ImageViewEmoji extends FrameLayout {
        public boolean attached;
        ValueAnimator backAnimator;
        public ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolder;
        public float bigReactionSelectedProgress;
        public TLRPC$Document document;
        public Drawable drawable;
        public Rect drawableBounds;
        public boolean empty;
        public ImageReceiver imageReceiver;
        public ImageReceiver imageReceiverToDraw;
        final AnimatedEmojiSpan.InvalidateHolder invalidateHolder;
        public boolean isDefaultReaction;
        public boolean isStaticIcon;
        public boolean notDraw;
        public int position;
        PremiumLockIconView premiumLockIconView;
        private float pressedProgress;
        public ReactionsLayoutInBubble.VisibleReaction reaction;
        public boolean selected;
        private float selectedProgress;
        public float skewAlpha;
        public int skewIndex;
        public AnimatedEmojiSpan span;

        public ImageViewEmoji(Context context) {
            super(context);
            SelectAnimatedEmojiDialog.this = r1;
            this.empty = false;
            this.notDraw = false;
            this.backgroundThreadDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
            this.invalidateHolder = new AnimatedEmojiSpan.InvalidateHolder() {
                @Override
                public void invalidate() {
                    EmojiListView emojiListView = SelectAnimatedEmojiDialog.this.emojiGridView;
                    if (emojiListView != null) {
                        emojiListView.invalidate();
                    }
                }
            };
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824));
        }

        @Override
        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            if (isPressed() != z) {
                super.setPressed(z);
                invalidate();
                if (z && (valueAnimator = this.backAnimator) != null) {
                    valueAnimator.removeAllListeners();
                    this.backAnimator.cancel();
                }
                if (z) {
                    return;
                }
                float f = this.pressedProgress;
                if (f != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            SelectAnimatedEmojiDialog.ImageViewEmoji.this.lambda$setPressed$0(valueAnimator2);
                        }
                    });
                    this.backAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            ImageViewEmoji.this.backAnimator = null;
                        }
                    });
                    this.backAnimator.setInterpolator(new OvershootInterpolator(5.0f));
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }

        public void lambda$setPressed$0(ValueAnimator valueAnimator) {
            this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
        }

        public void updatePressedProgress() {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    this.pressedProgress = Utilities.clamp(f + 0.16f, 1.0f, 0.0f);
                    invalidate();
                }
            }
        }

        public void update(long j) {
            ImageReceiver imageReceiver = this.imageReceiverToDraw;
            if (imageReceiver != null) {
                if (imageReceiver.getLottieAnimation() != null) {
                    this.imageReceiverToDraw.getLottieAnimation().updateCurrentFrame(j, true);
                }
                if (this.imageReceiverToDraw.getAnimation() != null) {
                    this.imageReceiverToDraw.getAnimation().updateCurrentFrame(j, true);
                }
            }
        }

        public void setViewSelected(boolean z, boolean z2) {
            if (this.selected != z) {
                this.selected = z;
                if (z2) {
                    return;
                }
                this.selectedProgress = z ? 1.0f : 0.0f;
            }
        }

        public void drawSelected(Canvas canvas, View view) {
            Paint paint;
            boolean z = this.selected;
            if ((z || this.selectedProgress > 0.0f) && !this.notDraw) {
                if (z) {
                    float f = this.selectedProgress;
                    if (f < 1.0f) {
                        this.selectedProgress = f + 0.053333335f;
                        view.invalidate();
                    }
                }
                if (!this.selected) {
                    float f2 = this.selectedProgress;
                    if (f2 > 0.0f) {
                        this.selectedProgress = f2 - 0.053333335f;
                        view.invalidate();
                    }
                }
                this.selectedProgress = Utilities.clamp(this.selectedProgress, 1.0f, 0.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rectF.inset(AndroidUtilities.m35dp(1.0f), AndroidUtilities.m35dp(1.0f));
                if (!this.empty) {
                    Drawable drawable = this.drawable;
                    if (!(drawable instanceof AnimatedEmojiDrawable) || !((AnimatedEmojiDrawable) drawable).canOverrideColor()) {
                        paint = SelectAnimatedEmojiDialog.this.selectorPaint;
                        int alpha = paint.getAlpha();
                        paint.setAlpha((int) (alpha * getAlpha() * this.selectedProgress));
                        canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint);
                        paint.setAlpha(alpha);
                    }
                }
                paint = SelectAnimatedEmojiDialog.this.selectorAccentPaint;
                int alpha2 = paint.getAlpha();
                paint.setAlpha((int) (alpha2 * getAlpha() * this.selectedProgress));
                canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint);
                paint.setAlpha(alpha2);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attached = true;
            Drawable drawable = this.drawable;
            if (drawable instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable).addView(this.invalidateHolder);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.attached = false;
            Drawable drawable = this.drawable;
            if (drawable instanceof AnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable) drawable).removeView(this.invalidateHolder);
            }
        }

        public void setDrawable(Drawable drawable) {
            Drawable drawable2 = this.drawable;
            if (drawable2 != drawable) {
                if (drawable2 != null && (drawable2 instanceof AnimatedEmojiDrawable)) {
                    ((AnimatedEmojiDrawable) drawable2).removeView(this.invalidateHolder);
                }
                this.drawable = drawable;
                if (this.attached && (drawable instanceof AnimatedEmojiDrawable)) {
                    ((AnimatedEmojiDrawable) drawable).addView(this.invalidateHolder);
                }
            }
        }
    }

    public void onEmojiClick(final View view, final AnimatedEmojiSpan animatedEmojiSpan) {
        incrementHintUse();
        if (animatedEmojiSpan == null) {
            onEmojiSelected(view, null, null, null);
            return;
        }
        TLRPC$TL_emojiStatus tLRPC$TL_emojiStatus = new TLRPC$TL_emojiStatus();
        tLRPC$TL_emojiStatus.document_id = animatedEmojiSpan.getDocumentId();
        final TLRPC$Document tLRPC$Document = animatedEmojiSpan.document;
        if (tLRPC$Document == null) {
            tLRPC$Document = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.documentId);
        }
        if (view instanceof ImageViewEmoji) {
            if (this.type == 0) {
                MediaDataController.getInstance(this.currentAccount).pushRecentEmojiStatus(tLRPC$TL_emojiStatus);
            }
            int i = this.type;
            if (i == 0 || i == 2) {
                animateEmojiSelect((ImageViewEmoji) view, new Runnable() {
                    @Override
                    public final void run() {
                        SelectAnimatedEmojiDialog.this.lambda$onEmojiClick$15(view, animatedEmojiSpan, tLRPC$Document);
                    }
                });
                return;
            } else {
                onEmojiSelected(view, Long.valueOf(animatedEmojiSpan.documentId), tLRPC$Document, null);
                return;
            }
        }
        onEmojiSelected(view, Long.valueOf(animatedEmojiSpan.documentId), tLRPC$Document, null);
    }

    public void lambda$onEmojiClick$15(View view, AnimatedEmojiSpan animatedEmojiSpan, TLRPC$Document tLRPC$Document) {
        onEmojiSelected(view, Long.valueOf(animatedEmojiSpan.documentId), tLRPC$Document, null);
    }

    public void incrementHintUse() {
        if (this.type == 2) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("emoji");
        sb.append(this.type == 0 ? "status" : "reaction");
        sb.append("usehint");
        String sb2 = sb.toString();
        int i = MessagesController.getGlobalMainSettings().getInt(sb2, 0);
        if (i <= 3) {
            MessagesController.getGlobalMainSettings().edit().putInt(sb2, i + 1).apply();
        }
    }

    public void preload(int i, int i2) {
        if (MediaDataController.getInstance(i2) == null) {
            return;
        }
        MediaDataController.getInstance(i2).checkStickers(5);
        if (i == 1 || i == 2) {
            MediaDataController.getInstance(i2).checkReactions();
        } else if (i == 0) {
            MediaDataController.getInstance(i2).fetchEmojiStatuses(0, true);
        } else if (i == 3) {
            MediaDataController.getInstance(i2).checkDefaultTopicIcons();
        }
        MediaDataController.getInstance(i2).getStickerSet(new TLRPC$TL_inputStickerSetEmojiDefaultStatuses(), false);
    }

    public static void preload(int i) {
        if (MediaDataController.getInstance(i) == null) {
            return;
        }
        MediaDataController.getInstance(i).checkStickers(5);
        MediaDataController.getInstance(i).fetchEmojiStatuses(0, true);
        MediaDataController.getInstance(i).checkReactions();
        MediaDataController.getInstance(i).getStickerSet(new TLRPC$TL_inputStickerSetEmojiDefaultStatuses(), false);
        MediaDataController.getInstance(i).checkDefaultTopicIcons();
    }

    public void updateRows(boolean z, boolean z2) {
        int i;
        long j;
        boolean z3;
        long j2;
        boolean z4;
        int i2;
        int i3;
        boolean z5;
        TLRPC$StickerSet tLRPC$StickerSet;
        boolean z6;
        int i4;
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet;
        boolean z7 = !this.animationsEnabled ? false : z2;
        MediaDataController mediaDataController = MediaDataController.getInstance(UserConfig.selectedAccount);
        if (mediaDataController == null) {
            return;
        }
        if (z || this.frozenEmojiPacks == null) {
            this.frozenEmojiPacks = new ArrayList<>(mediaDataController.getStickerSets(5));
        }
        ArrayList<TLRPC$TL_messages_stickerSet> arrayList = this.frozenEmojiPacks;
        ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedEmojiSets());
        final ArrayList arrayList3 = new ArrayList(this.rowHashCodes);
        this.totalCount = 0;
        this.recentReactionsSectionRow = -1;
        this.recentReactionsStartRow = -1;
        this.recentReactionsEndRow = -1;
        this.popularSectionRow = -1;
        this.longtapHintRow = -1;
        this.defaultTopicIconRow = -1;
        this.topicEmojiHeaderRow = -1;
        this.recent.clear();
        this.defaultStatuses.clear();
        this.topReactions.clear();
        this.recentReactions.clear();
        this.packs.clear();
        this.positionToSection.clear();
        this.sectionToPosition.clear();
        this.positionToExpand.clear();
        this.rowHashCodes.clear();
        this.positionToButton.clear();
        if (!arrayList.isEmpty()) {
            int i5 = this.totalCount;
            this.totalCount = i5 + 1;
            this.searchRow = i5;
            this.rowHashCodes.add(9);
        } else {
            this.searchRow = -1;
        }
        if (this.type == 3) {
            int i6 = this.totalCount;
            this.totalCount = i6 + 1;
            this.topicEmojiHeaderRow = i6;
            this.rowHashCodes.add(12);
            int i7 = this.totalCount;
            this.totalCount = i7 + 1;
            this.defaultTopicIconRow = i7;
            this.rowHashCodes.add(7);
            String str = UserConfig.getInstance(this.currentAccount).defaultTopicIcons;
            if (str != null) {
                tLRPC$TL_messages_stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSetByName(str);
                if (tLRPC$TL_messages_stickerSet == null) {
                    tLRPC$TL_messages_stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(str);
                }
            } else {
                tLRPC$TL_messages_stickerSet = null;
            }
            if (tLRPC$TL_messages_stickerSet == null) {
                this.defaultSetLoading = true;
            } else {
                if (this.includeEmpty) {
                    this.totalCount++;
                    this.rowHashCodes.add(2);
                }
                ArrayList<TLRPC$Document> arrayList4 = tLRPC$TL_messages_stickerSet.documents;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    for (int i8 = 0; i8 < tLRPC$TL_messages_stickerSet.documents.size(); i8++) {
                        this.recent.add(new AnimatedEmojiSpan(tLRPC$TL_messages_stickerSet.documents.get(i8), (Paint.FontMetricsInt) null));
                    }
                }
                for (int i9 = 0; i9 < this.recent.size(); i9++) {
                    this.rowHashCodes.add(Integer.valueOf(Objects.hash(43223, Long.valueOf(this.recent.get(i9).getDocumentId()))));
                    this.totalCount++;
                }
            }
        }
        if (this.includeHint && (i4 = this.type) != 2 && i4 != 3) {
            int i10 = this.totalCount;
            this.totalCount = i10 + 1;
            this.longtapHintRow = i10;
            this.rowHashCodes.add(6);
        }
        if (this.recentReactionsToSet != null) {
            this.topReactionsStartRow = this.totalCount;
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(this.recentReactionsToSet);
            for (int i11 = 0; i11 < 16; i11++) {
                if (!arrayList5.isEmpty()) {
                    this.topReactions.add((ReactionsLayoutInBubble.VisibleReaction) arrayList5.remove(0));
                }
            }
            for (int i12 = 0; i12 < this.topReactions.size(); i12++) {
                this.rowHashCodes.add(Integer.valueOf(Objects.hash(-5632, Integer.valueOf(this.topReactions.get(i12).hashCode()))));
            }
            int size = this.totalCount + this.topReactions.size();
            this.totalCount = size;
            this.topReactionsEndRow = size;
            if (!arrayList5.isEmpty()) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList5.size()) {
                        z6 = true;
                        break;
                    } else if (((ReactionsLayoutInBubble.VisibleReaction) arrayList5.get(i13)).documentId != 0) {
                        z6 = false;
                        break;
                    } else {
                        i13++;
                    }
                }
                if (z6) {
                    if (UserConfig.getInstance(this.currentAccount).isPremium()) {
                        int i14 = this.totalCount;
                        this.totalCount = i14 + 1;
                        this.popularSectionRow = i14;
                        this.rowHashCodes.add(5);
                    }
                } else {
                    int i15 = this.totalCount;
                    this.totalCount = i15 + 1;
                    this.recentReactionsSectionRow = i15;
                    this.rowHashCodes.add(4);
                }
                this.recentReactionsStartRow = this.totalCount;
                this.recentReactions.addAll(arrayList5);
                for (int i16 = 0; i16 < this.recentReactions.size(); i16++) {
                    ArrayList<Integer> arrayList6 = this.rowHashCodes;
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(z6 ? 4235 : -3142);
                    objArr[1] = Integer.valueOf(this.recentReactions.get(i16).hashCode());
                    arrayList6.add(Integer.valueOf(Objects.hash(objArr)));
                }
                int size2 = this.totalCount + this.recentReactions.size();
                this.totalCount = size2;
                this.recentReactionsEndRow = size2;
            }
        } else if (this.type == 0) {
            ArrayList<TLRPC$EmojiStatus> recentEmojiStatuses = MediaDataController.getInstance(this.currentAccount).getRecentEmojiStatuses();
            TLRPC$TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(new TLRPC$TL_inputStickerSetEmojiDefaultStatuses(), false);
            if (stickerSet == null) {
                this.defaultSetLoading = true;
            } else {
                if (this.includeEmpty) {
                    this.totalCount++;
                    this.rowHashCodes.add(2);
                }
                ArrayList<TLRPC$EmojiStatus> defaultEmojiStatuses = MediaDataController.getInstance(this.currentAccount).getDefaultEmojiStatuses();
                int spanCount = this.layoutManager.getSpanCount() * 13;
                ArrayList<TLRPC$Document> arrayList7 = stickerSet.documents;
                if (arrayList7 != null && !arrayList7.isEmpty()) {
                    for (int i17 = 0; i17 < Math.min(this.layoutManager.getSpanCount() - 1, stickerSet.documents.size()); i17++) {
                        this.recent.add(new AnimatedEmojiSpan(stickerSet.documents.get(i17), (Paint.FontMetricsInt) null));
                        if (this.recent.size() + (this.includeEmpty ? 1 : 0) >= spanCount) {
                            break;
                        }
                    }
                }
                if (recentEmojiStatuses != null && !recentEmojiStatuses.isEmpty()) {
                    Iterator<TLRPC$EmojiStatus> it = recentEmojiStatuses.iterator();
                    while (it.hasNext()) {
                        TLRPC$EmojiStatus next = it.next();
                        if (next instanceof TLRPC$TL_emojiStatus) {
                            j2 = ((TLRPC$TL_emojiStatus) next).document_id;
                        } else if (next instanceof TLRPC$TL_emojiStatusUntil) {
                            TLRPC$TL_emojiStatusUntil tLRPC$TL_emojiStatusUntil = (TLRPC$TL_emojiStatusUntil) next;
                            if (tLRPC$TL_emojiStatusUntil.until > ((int) (System.currentTimeMillis() / 1000))) {
                                j2 = tLRPC$TL_emojiStatusUntil.document_id;
                            }
                        } else {
                            continue;
                        }
                        int i18 = 0;
                        while (true) {
                            if (i18 >= this.recent.size()) {
                                z4 = false;
                                break;
                            } else if (this.recent.get(i18).getDocumentId() == j2) {
                                z4 = true;
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (!z4) {
                            this.recent.add(new AnimatedEmojiSpan(j2, (Paint.FontMetricsInt) null));
                            if (this.recent.size() + (this.includeEmpty ? 1 : 0) >= spanCount) {
                                break;
                            }
                        }
                    }
                }
                if (defaultEmojiStatuses != null && !defaultEmojiStatuses.isEmpty()) {
                    Iterator<TLRPC$EmojiStatus> it2 = defaultEmojiStatuses.iterator();
                    while (it2.hasNext()) {
                        TLRPC$EmojiStatus next2 = it2.next();
                        if (next2 instanceof TLRPC$TL_emojiStatus) {
                            j = ((TLRPC$TL_emojiStatus) next2).document_id;
                        } else if (next2 instanceof TLRPC$TL_emojiStatusUntil) {
                            TLRPC$TL_emojiStatusUntil tLRPC$TL_emojiStatusUntil2 = (TLRPC$TL_emojiStatusUntil) next2;
                            if (tLRPC$TL_emojiStatusUntil2.until > ((int) (System.currentTimeMillis() / 1000))) {
                                j = tLRPC$TL_emojiStatusUntil2.document_id;
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                        int i19 = 0;
                        while (true) {
                            if (i19 >= this.recent.size()) {
                                z3 = false;
                                break;
                            } else if (this.recent.get(i19).getDocumentId() == j) {
                                z3 = true;
                                break;
                            } else {
                                i19++;
                            }
                        }
                        if (!z3) {
                            this.recent.add(new AnimatedEmojiSpan(j, (Paint.FontMetricsInt) null));
                            if (this.recent.size() + (this.includeEmpty ? 1 : 0) >= spanCount) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                int spanCount2 = this.layoutManager.getSpanCount() * 5;
                int i20 = spanCount2 - (this.includeEmpty ? 1 : 0);
                if (this.recent.size() > i20 && !this.recentExpanded) {
                    for (int i21 = 0; i21 < i20 - 1; i21++) {
                        this.rowHashCodes.add(Integer.valueOf(Objects.hash(43223, Long.valueOf(this.recent.get(i21).getDocumentId()))));
                        this.totalCount++;
                    }
                    this.rowHashCodes.add(Integer.valueOf(Objects.hash(-5531, -1, Integer.valueOf((this.recent.size() - spanCount2) + (this.includeEmpty ? 1 : 0) + 1))));
                    EmojiPackExpand emojiPackExpand = this.recentExpandButton;
                    if (emojiPackExpand != null) {
                        TextView textView = emojiPackExpand.textView;
                        StringBuilder sb = new StringBuilder();
                        sb.append("+");
                        int size3 = (this.recent.size() - spanCount2) + (this.includeEmpty ? 1 : 0);
                        i = 1;
                        sb.append(size3 + 1);
                        textView.setText(sb.toString());
                    } else {
                        i = 1;
                    }
                    this.positionToExpand.put(this.totalCount, -1);
                    this.totalCount += i;
                } else {
                    for (int i22 = 0; i22 < this.recent.size(); i22++) {
                        this.rowHashCodes.add(Integer.valueOf(Objects.hash(43223, Long.valueOf(this.recent.get(i22).getDocumentId()))));
                        this.totalCount++;
                    }
                }
            }
        }
        int i23 = 0;
        while (true) {
            i2 = 9211;
            i3 = 3212;
            if (i23 >= arrayList.size()) {
                break;
            }
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = arrayList.get(i23);
            if (tLRPC$TL_messages_stickerSet2 != null && (tLRPC$StickerSet = tLRPC$TL_messages_stickerSet2.set) != null && tLRPC$StickerSet.emojis && !this.installedEmojiSets.contains(Long.valueOf(tLRPC$StickerSet.f890id))) {
                this.positionToSection.put(this.totalCount, this.packs.size());
                this.sectionToPosition.put(this.packs.size(), this.totalCount);
                this.totalCount++;
                this.rowHashCodes.add(Integer.valueOf(Objects.hash(9211, Long.valueOf(tLRPC$TL_messages_stickerSet2.set.f890id))));
                EmojiView.EmojiPack emojiPack = new EmojiView.EmojiPack();
                emojiPack.installed = true;
                emojiPack.featured = false;
                emojiPack.expanded = true;
                emojiPack.free = !MessageObject.isPremiumEmojiPack(tLRPC$TL_messages_stickerSet2);
                emojiPack.set = tLRPC$TL_messages_stickerSet2.set;
                emojiPack.documents = tLRPC$TL_messages_stickerSet2.documents;
                this.packs.size();
                this.packs.add(emojiPack);
                this.totalCount += emojiPack.documents.size();
                for (int i24 = 0; i24 < emojiPack.documents.size(); i24++) {
                    this.rowHashCodes.add(Integer.valueOf(Objects.hash(3212, Long.valueOf(emojiPack.documents.get(i24).f865id))));
                }
            }
            i23++;
        }
        int spanCount3 = this.layoutManager.getSpanCount() * 3;
        int i25 = 0;
        while (i25 < arrayList2.size()) {
            TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) arrayList2.get(i25);
            if (tLRPC$StickerSetCovered instanceof TLRPC$TL_stickerSetFullCovered) {
                TLRPC$TL_stickerSetFullCovered tLRPC$TL_stickerSetFullCovered = (TLRPC$TL_stickerSetFullCovered) tLRPC$StickerSetCovered;
                int i26 = 0;
                while (true) {
                    if (i26 >= this.packs.size()) {
                        z5 = false;
                        break;
                    } else if (this.packs.get(i26).set.f890id == tLRPC$TL_stickerSetFullCovered.set.f890id) {
                        z5 = true;
                        break;
                    } else {
                        i26++;
                    }
                }
                if (!z5) {
                    this.positionToSection.put(this.totalCount, this.packs.size());
                    this.sectionToPosition.put(this.packs.size(), this.totalCount);
                    this.totalCount++;
                    this.rowHashCodes.add(Integer.valueOf(Objects.hash(Integer.valueOf(i2), Long.valueOf(tLRPC$TL_stickerSetFullCovered.set.f890id))));
                    EmojiView.EmojiPack emojiPack2 = new EmojiView.EmojiPack();
                    emojiPack2.installed = this.installedEmojiSets.contains(Long.valueOf(tLRPC$TL_stickerSetFullCovered.set.f890id));
                    emojiPack2.featured = true;
                    emojiPack2.free = !MessageObject.isPremiumEmojiPack(tLRPC$TL_stickerSetFullCovered);
                    emojiPack2.set = tLRPC$TL_stickerSetFullCovered.set;
                    emojiPack2.documents = tLRPC$TL_stickerSetFullCovered.documents;
                    this.packs.size();
                    emojiPack2.expanded = this.expandedEmojiSets.contains(Long.valueOf(emojiPack2.set.f890id));
                    if (emojiPack2.documents.size() > spanCount3 && !emojiPack2.expanded) {
                        this.totalCount += spanCount3;
                        for (int i27 = 0; i27 < spanCount3 - 1; i27++) {
                            this.rowHashCodes.add(Integer.valueOf(Objects.hash(Integer.valueOf(i3), Long.valueOf(emojiPack2.documents.get(i27).f865id))));
                        }
                        this.rowHashCodes.add(Integer.valueOf(Objects.hash(-5531, Long.valueOf(tLRPC$TL_stickerSetFullCovered.set.f890id), Integer.valueOf((emojiPack2.documents.size() - spanCount3) + 1))));
                        this.positionToExpand.put(this.totalCount - 1, this.packs.size());
                    } else {
                        this.totalCount += emojiPack2.documents.size();
                        int i28 = 0;
                        while (i28 < emojiPack2.documents.size()) {
                            this.rowHashCodes.add(Integer.valueOf(Objects.hash(Integer.valueOf(i3), Long.valueOf(emojiPack2.documents.get(i28).f865id))));
                            i28++;
                            i3 = 3212;
                        }
                    }
                    if (!emojiPack2.installed) {
                        this.positionToButton.put(this.totalCount, this.packs.size());
                        this.totalCount++;
                        this.rowHashCodes.add(Integer.valueOf(Objects.hash(3321, Long.valueOf(tLRPC$TL_stickerSetFullCovered.set.f890id))));
                    }
                    this.packs.add(emojiPack2);
                    i25++;
                    i2 = 9211;
                    i3 = 3212;
                }
            }
            i25++;
            i2 = 9211;
            i3 = 3212;
        }
        post(new Runnable() {
            @Override
            public final void run() {
                SelectAnimatedEmojiDialog.this.lambda$updateRows$16();
            }
        });
        if (z7) {
            this.emojiGridView.setItemAnimator(this.emojiItemAnimator);
        } else {
            this.emojiGridView.setItemAnimator(null);
        }
        DiffUtil.calculateDiff(new DiffUtil.Callback() {
            @Override
            public boolean areContentsTheSame(int i29, int i30) {
                return true;
            }

            @Override
            public int getOldListSize() {
                return arrayList3.size();
            }

            @Override
            public int getNewListSize() {
                return SelectAnimatedEmojiDialog.this.rowHashCodes.size();
            }

            @Override
            public boolean areItemsTheSame(int i29, int i30) {
                return ((Integer) arrayList3.get(i29)).equals(SelectAnimatedEmojiDialog.this.rowHashCodes.get(i30));
            }
        }, false).dispatchUpdatesTo(this.adapter);
        EmojiListView emojiListView = this.emojiGridView;
        if (emojiListView.scrolledByUserOnce) {
            return;
        }
        emojiListView.scrollToPosition(1);
    }

    public void lambda$updateRows$16() {
        this.emojiTabs.updateEmojiPacks(this.packs);
    }

    public void expand(int i, View view) {
        int min;
        int i2;
        int size;
        Integer num;
        boolean z;
        int i3;
        int i4;
        int i5 = this.positionToExpand.get(i);
        this.animateExpandFromButtonTranslate = 0.0f;
        Integer num2 = null;
        if (i5 >= 0 && i5 < this.packs.size()) {
            i3 = this.layoutManager.getSpanCount() * 3;
            EmojiView.EmojiPack emojiPack = this.packs.get(i5);
            if (emojiPack.expanded) {
                return;
            }
            z = i5 + 1 == this.packs.size();
            i4 = this.sectionToPosition.get(i5);
            this.expandedEmojiSets.add(Long.valueOf(emojiPack.set.f890id));
            i2 = emojiPack.expanded ? emojiPack.documents.size() : Math.min(i3, emojiPack.documents.size());
            num = emojiPack.documents.size() > i3 ? Integer.valueOf(i4 + 1 + i2) : null;
            emojiPack.expanded = true;
            size = emojiPack.documents.size();
        } else if (i5 != -1) {
            return;
        } else {
            int spanCount = this.layoutManager.getSpanCount() * 5;
            boolean z2 = this.recentExpanded;
            if (z2) {
                return;
            }
            int i6 = (this.searchRow != -1 ? 1 : 0) + (this.includeHint ? 1 : 0);
            boolean z3 = this.includeEmpty;
            int i7 = i6 + (z3 ? 1 : 0);
            if (z2) {
                min = this.recent.size();
            } else {
                min = Math.min((spanCount - (z3 ? 1 : 0)) - 2, this.recent.size());
            }
            i2 = min;
            size = this.recent.size();
            this.recentExpanded = true;
            num = null;
            z = false;
            i3 = spanCount;
            i4 = i7;
        }
        if (size > i2) {
            num = Integer.valueOf(i4 + 1 + i2);
            num2 = Integer.valueOf(size - i2);
        }
        updateRows(false, true);
        if (num == null || num2 == null) {
            return;
        }
        this.animateExpandFromButton = view;
        this.animateExpandFromPosition = num.intValue();
        this.animateExpandToPosition = num.intValue() + num2.intValue();
        this.animateExpandStartTime = SystemClock.elapsedRealtime();
        if (z) {
            final int intValue = num.intValue();
            final float f = num2.intValue() > i3 / 2 ? 1.5f : 3.5f;
            post(new Runnable() {
                @Override
                public final void run() {
                    SelectAnimatedEmojiDialog.this.lambda$expand$17(f, intValue);
                }
            });
        }
    }

    public void lambda$expand$17(float f, int i) {
        try {
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(this.emojiGridView.getContext(), 0, f);
            linearSmoothScrollerCustom.setTargetPosition(i);
            this.layoutManager.startSmoothScroll(linearSmoothScrollerCustom);
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.drawBackground && this.type != 3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.m35dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.m35dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public int getCacheType() {
        int i = this.type;
        return (i == 0 || i == 2) ? 2 : 3;
    }

    public class EmojiListView extends RecyclerListView {
        private LongSparseArray<AnimatedEmojiDrawable> animatedEmojiDrawables;
        private int lastChildCount;
        ArrayList<DrawingInBackgroundLine> lineDrawables;
        ArrayList<DrawingInBackgroundLine> lineDrawablesTmp;
        ArrayList<ArrayList<ImageViewEmoji>> unusedArrays;
        ArrayList<DrawingInBackgroundLine> unusedLineDrawables;
        SparseArray<ArrayList<ImageViewEmoji>> viewsGroupedByLines;

        public EmojiListView(Context context) {
            super(context);
            SelectAnimatedEmojiDialog.this = r1;
            this.viewsGroupedByLines = new SparseArray<>();
            this.unusedArrays = new ArrayList<>();
            this.unusedLineDrawables = new ArrayList<>();
            this.lineDrawables = new ArrayList<>();
            this.lineDrawablesTmp = new ArrayList<>();
            this.animatedEmojiDrawables = new LongSparseArray<>();
            this.lastChildCount = -1;
            setDrawSelectorBehind(true);
            setClipToPadding(false);
            setSelectorRadius(AndroidUtilities.m35dp(4.0f));
            setSelectorDrawableColor(Theme.getColor("listSelectorSDK21", this.resourcesProvider));
        }

        private AnimatedEmojiSpan[] getAnimatedEmojiSpans() {
            AnimatedEmojiSpan[] animatedEmojiSpanArr = new AnimatedEmojiSpan[getChildCount()];
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof ImageViewEmoji) {
                    animatedEmojiSpanArr[i] = ((ImageViewEmoji) childAt).span;
                }
            }
            return animatedEmojiSpanArr;
        }

        public void updateEmojiDrawables() {
            this.animatedEmojiDrawables = AnimatedEmojiSpan.update(SelectAnimatedEmojiDialog.this.getCacheType(), this, getAnimatedEmojiSpans(), this.animatedEmojiDrawables);
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            return super.drawChild(canvas, view, j);
        }

        @Override
        public boolean canHighlightChildAt(android.view.View r3, float r4, float r5) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.SelectAnimatedEmojiDialog.EmojiListView.canHighlightChildAt(android.view.View, float, float):boolean");
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (SelectAnimatedEmojiDialog.this.showAnimator == null || !SelectAnimatedEmojiDialog.this.showAnimator.isRunning()) {
                updateEmojiDrawables();
                this.lastChildCount = getChildCount();
            }
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            ImageReceiver imageReceiver;
            if (getVisibility() != 0) {
                return;
            }
            int saveCount = canvas.getSaveCount();
            if (this.lastChildCount != getChildCount() && SelectAnimatedEmojiDialog.this.showAnimator != null && !SelectAnimatedEmojiDialog.this.showAnimator.isRunning()) {
                updateEmojiDrawables();
                this.lastChildCount = getChildCount();
            }
            if (!this.selectorRect.isEmpty()) {
                this.selectorDrawable.setBounds(this.selectorRect);
                canvas.save();
                Consumer<Canvas> consumer = this.selectorTransformer;
                if (consumer != null) {
                    consumer.accept(canvas);
                }
                this.selectorDrawable.draw(canvas);
                canvas.restore();
            }
            for (int i = 0; i < this.viewsGroupedByLines.size(); i++) {
                ArrayList<ImageViewEmoji> valueAt = this.viewsGroupedByLines.valueAt(i);
                valueAt.clear();
                this.unusedArrays.add(valueAt);
            }
            this.viewsGroupedByLines.clear();
            boolean z = ((SelectAnimatedEmojiDialog.this.animateExpandStartTime > 0L ? 1 : (SelectAnimatedEmojiDialog.this.animateExpandStartTime == 0L ? 0 : -1)) > 0 && ((SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime) > SelectAnimatedEmojiDialog.this.animateExpandDuration() ? 1 : ((SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime) == SelectAnimatedEmojiDialog.this.animateExpandDuration() ? 0 : -1)) < 0) && SelectAnimatedEmojiDialog.this.animateExpandFromButton != null && SelectAnimatedEmojiDialog.this.animateExpandFromPosition >= 0;
            if (this.animatedEmojiDrawables != null) {
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof ImageViewEmoji) {
                        ImageViewEmoji imageViewEmoji = (ImageViewEmoji) childAt;
                        imageViewEmoji.updatePressedProgress();
                        int y = SelectAnimatedEmojiDialog.this.smoothScrolling ? (int) childAt.getY() : childAt.getTop();
                        ArrayList<ImageViewEmoji> arrayList = this.viewsGroupedByLines.get(y);
                        canvas.save();
                        canvas.translate(imageViewEmoji.getX(), imageViewEmoji.getY());
                        imageViewEmoji.drawSelected(canvas, this);
                        canvas.restore();
                        if (imageViewEmoji.getBackground() != null) {
                            imageViewEmoji.getBackground().setBounds((int) imageViewEmoji.getX(), (int) imageViewEmoji.getY(), ((int) imageViewEmoji.getX()) + imageViewEmoji.getWidth(), ((int) imageViewEmoji.getY()) + imageViewEmoji.getHeight());
                            imageViewEmoji.getBackground().setAlpha((int) (255 * imageViewEmoji.getAlpha()));
                            imageViewEmoji.getBackground().draw(canvas);
                            imageViewEmoji.getBackground().setAlpha(255);
                        }
                        if (arrayList == null) {
                            if (!this.unusedArrays.isEmpty()) {
                                ArrayList<ArrayList<ImageViewEmoji>> arrayList2 = this.unusedArrays;
                                arrayList = arrayList2.remove(arrayList2.size() - 1);
                            } else {
                                arrayList = new ArrayList<>();
                            }
                            this.viewsGroupedByLines.put(y, arrayList);
                        }
                        arrayList.add(imageViewEmoji);
                        PremiumLockIconView premiumLockIconView = imageViewEmoji.premiumLockIconView;
                        if (premiumLockIconView != null && premiumLockIconView.getVisibility() == 0 && imageViewEmoji.premiumLockIconView.getImageReceiver() == null && (imageReceiver = imageViewEmoji.imageReceiverToDraw) != null) {
                            imageViewEmoji.premiumLockIconView.setImageReceiver(imageReceiver);
                        }
                    }
                    if (z && childAt != null) {
                        if (getChildAdapterPosition(childAt) == SelectAnimatedEmojiDialog.this.animateExpandFromPosition - (SelectAnimatedEmojiDialog.this.animateExpandFromButtonTranslate > 0.0f ? 0 : 1)) {
                            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp(((float) (SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime)) / 200.0f, 0.0f, 1.0f));
                            if (interpolation < 1.0f) {
                                float f = 1.0f - interpolation;
                                canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f), 31);
                                canvas.translate(childAt.getLeft(), childAt.getTop() + SelectAnimatedEmojiDialog.this.animateExpandFromButtonTranslate);
                                float f2 = (f * 0.5f) + 0.5f;
                                canvas.scale(f2, f2, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                                SelectAnimatedEmojiDialog.this.animateExpandFromButton.draw(canvas);
                                canvas.restore();
                            }
                        }
                    }
                }
            }
            this.lineDrawablesTmp.clear();
            this.lineDrawablesTmp.addAll(this.lineDrawables);
            this.lineDrawables.clear();
            long currentTimeMillis = System.currentTimeMillis();
            int i3 = 0;
            while (true) {
                DrawingInBackgroundLine drawingInBackgroundLine = null;
                if (i3 >= this.viewsGroupedByLines.size()) {
                    break;
                }
                ArrayList<ImageViewEmoji> valueAt2 = this.viewsGroupedByLines.valueAt(i3);
                ImageViewEmoji imageViewEmoji2 = valueAt2.get(0);
                int childAdapterPosition = getChildAdapterPosition(imageViewEmoji2);
                int i4 = 0;
                while (true) {
                    if (i4 >= this.lineDrawablesTmp.size()) {
                        break;
                    } else if (this.lineDrawablesTmp.get(i4).position == childAdapterPosition) {
                        drawingInBackgroundLine = this.lineDrawablesTmp.get(i4);
                        this.lineDrawablesTmp.remove(i4);
                        break;
                    } else {
                        i4++;
                    }
                }
                if (drawingInBackgroundLine == null) {
                    if (!this.unusedLineDrawables.isEmpty()) {
                        ArrayList<DrawingInBackgroundLine> arrayList3 = this.unusedLineDrawables;
                        drawingInBackgroundLine = arrayList3.remove(arrayList3.size() - 1);
                    } else {
                        drawingInBackgroundLine = new DrawingInBackgroundLine();
                    }
                    drawingInBackgroundLine.position = childAdapterPosition;
                    drawingInBackgroundLine.onAttachToWindow();
                }
                this.lineDrawables.add(drawingInBackgroundLine);
                drawingInBackgroundLine.imageViewEmojis = valueAt2;
                canvas.save();
                canvas.translate(imageViewEmoji2.getLeft(), imageViewEmoji2.getY());
                drawingInBackgroundLine.startOffset = imageViewEmoji2.getLeft();
                int measuredWidth = getMeasuredWidth() - (imageViewEmoji2.getLeft() * 2);
                int measuredHeight = imageViewEmoji2.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    drawingInBackgroundLine.draw(canvas, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
                }
                canvas.restore();
                i3++;
            }
            for (int i5 = 0; i5 < this.lineDrawablesTmp.size(); i5++) {
                if (this.unusedLineDrawables.size() < 3) {
                    this.unusedLineDrawables.add(this.lineDrawablesTmp.get(i5));
                    this.lineDrawablesTmp.get(i5).imageViewEmojis = null;
                    this.lineDrawablesTmp.get(i5).reset();
                } else {
                    this.lineDrawablesTmp.get(i5).onDetachFromWindow();
                }
            }
            this.lineDrawablesTmp.clear();
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt2 = getChildAt(i6);
                if (!(childAt2 instanceof ImageViewEmoji)) {
                    if (childAt2 != null && childAt2 != SelectAnimatedEmojiDialog.this.animateExpandFromButton) {
                        canvas.save();
                        canvas.translate((int) childAt2.getX(), (int) childAt2.getY());
                        childAt2.draw(canvas);
                        canvas.restore();
                    }
                } else {
                    ImageViewEmoji imageViewEmoji3 = (ImageViewEmoji) childAt2;
                    if (imageViewEmoji3.premiumLockIconView != null) {
                        canvas.save();
                        canvas.translate((int) (imageViewEmoji3.getX() + imageViewEmoji3.premiumLockIconView.getX()), (int) (imageViewEmoji3.getY() + imageViewEmoji3.premiumLockIconView.getY()));
                        imageViewEmoji3.premiumLockIconView.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            canvas.restoreToCount(saveCount);
        }

        public class DrawingInBackgroundLine extends DrawingInBackgroundThreadDrawable {
            ArrayList<ImageViewEmoji> imageViewEmojis;
            public int position;
            public int startOffset;
            ArrayList<ImageViewEmoji> drawInBackgroundViews = new ArrayList<>();
            float skewAlpha = 1.0f;
            boolean skewBelow = false;
            private OvershootInterpolator appearScaleInterpolator = new OvershootInterpolator(3.0f);

            public DrawingInBackgroundLine() {
                EmojiListView.this = r2;
            }

            @Override
            public void draw(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.SelectAnimatedEmojiDialog.EmojiListView.DrawingInBackgroundLine.draw(android.graphics.Canvas, long, int, int, float):void");
            }

            @Override
            public void drawBitmap(Canvas canvas, Bitmap bitmap, Paint paint) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }

            @Override
            public void prepareDraw(long j) {
                float alpha;
                ImageReceiver imageReceiver;
                this.drawInBackgroundViews.clear();
                for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                    ImageViewEmoji imageViewEmoji = this.imageViewEmojis.get(i);
                    if (!imageViewEmoji.notDraw) {
                        float f = 1.0f;
                        if (imageViewEmoji.empty) {
                            Drawable premiumStar = SelectAnimatedEmojiDialog.this.getPremiumStar();
                            if (imageViewEmoji.pressedProgress != 0.0f || imageViewEmoji.selected) {
                                f = 1.0f * (((1.0f - (imageViewEmoji.selected ? 0.7f : imageViewEmoji.pressedProgress)) * 0.2f) + 0.8f);
                            }
                            if (premiumStar != null) {
                                premiumStar.setAlpha(255);
                                int width = (imageViewEmoji.getWidth() - imageViewEmoji.getPaddingLeft()) - imageViewEmoji.getPaddingRight();
                                int height = (imageViewEmoji.getHeight() - imageViewEmoji.getPaddingTop()) - imageViewEmoji.getPaddingBottom();
                                Rect rect = AndroidUtilities.rectTmp2;
                                float f2 = width / 2.0f;
                                float f3 = height / 2.0f;
                                rect.set((int) ((imageViewEmoji.getWidth() / 2.0f) - ((imageViewEmoji.getScaleX() * f2) * f)), (int) ((imageViewEmoji.getHeight() / 2.0f) - ((imageViewEmoji.getScaleY() * f3) * f)), (int) ((imageViewEmoji.getWidth() / 2.0f) + (f2 * imageViewEmoji.getScaleX() * f)), (int) ((imageViewEmoji.getHeight() / 2.0f) + (f3 * imageViewEmoji.getScaleY() * f)));
                                rect.offset(imageViewEmoji.getLeft() - this.startOffset, 0);
                                if (imageViewEmoji.drawableBounds == null) {
                                    imageViewEmoji.drawableBounds = new Rect();
                                }
                                imageViewEmoji.drawableBounds.set(rect);
                                imageViewEmoji.drawable = premiumStar;
                                this.drawInBackgroundViews.add(imageViewEmoji);
                            }
                        } else {
                            if ((imageViewEmoji.pressedProgress != 0.0f || imageViewEmoji.selected) && !imageViewEmoji.selected) {
                                float unused = imageViewEmoji.pressedProgress;
                            }
                            if ((SelectAnimatedEmojiDialog.this.animateExpandStartTime > 0 && SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime < SelectAnimatedEmojiDialog.this.animateExpandDuration()) && SelectAnimatedEmojiDialog.this.animateExpandFromPosition >= 0 && SelectAnimatedEmojiDialog.this.animateExpandToPosition >= 0 && SelectAnimatedEmojiDialog.this.animateExpandStartTime > 0) {
                                int childAdapterPosition = EmojiListView.this.getChildAdapterPosition(imageViewEmoji) - SelectAnimatedEmojiDialog.this.animateExpandFromPosition;
                                int i2 = SelectAnimatedEmojiDialog.this.animateExpandToPosition - SelectAnimatedEmojiDialog.this.animateExpandFromPosition;
                                if (childAdapterPosition < 0 || childAdapterPosition >= i2) {
                                    alpha = 1.0f;
                                } else {
                                    float clamp = MathUtils.clamp(((float) (SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime)) / ((float) SelectAnimatedEmojiDialog.this.animateExpandAppearDuration()), 0.0f, 1.0f);
                                    float f4 = childAdapterPosition;
                                    float f5 = i2;
                                    float f6 = f5 / 4.0f;
                                    float cascade = AndroidUtilities.cascade(clamp, f4, f5, f6);
                                    this.appearScaleInterpolator.getInterpolation(AndroidUtilities.cascade(clamp, f4, f5, f6));
                                    alpha = cascade * 1.0f;
                                }
                            } else {
                                alpha = imageViewEmoji.getAlpha();
                            }
                            if (!imageViewEmoji.isDefaultReaction && !imageViewEmoji.isStaticIcon) {
                                if (imageViewEmoji.span != null) {
                                    Drawable drawable = imageViewEmoji.drawable;
                                    AnimatedEmojiDrawable animatedEmojiDrawable = drawable instanceof AnimatedEmojiDrawable ? (AnimatedEmojiDrawable) drawable : null;
                                    if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null) {
                                        imageReceiver = animatedEmojiDrawable.getImageReceiver();
                                        animatedEmojiDrawable.setAlpha((int) (alpha * 255.0f));
                                        imageViewEmoji.setDrawable(animatedEmojiDrawable);
                                        imageViewEmoji.drawable.setColorFilter(SelectAnimatedEmojiDialog.this.premiumStarColorFilter);
                                    }
                                }
                            } else {
                                imageReceiver = imageViewEmoji.imageReceiver;
                                imageReceiver.setAlpha(alpha);
                            }
                            if (imageReceiver != null) {
                                if (imageViewEmoji.selected) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.m35dp(4.0f));
                                } else {
                                    imageReceiver.setRoundRadius(0);
                                }
                                ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = imageViewEmoji.backgroundThreadDrawHolder;
                                int i3 = this.threadIndex;
                                backgroundThreadDrawHolderArr[i3] = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i3], i3);
                                imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].time = j;
                                imageViewEmoji.imageReceiverToDraw = imageReceiver;
                                imageViewEmoji.update(j);
                                imageViewEmoji.getWidth();
                                imageViewEmoji.getPaddingLeft();
                                imageViewEmoji.getPaddingRight();
                                imageViewEmoji.getHeight();
                                imageViewEmoji.getPaddingTop();
                                imageViewEmoji.getPaddingBottom();
                                Rect rect2 = AndroidUtilities.rectTmp2;
                                rect2.set(imageViewEmoji.getPaddingLeft(), imageViewEmoji.getPaddingTop(), imageViewEmoji.getWidth() - imageViewEmoji.getPaddingRight(), imageViewEmoji.getHeight() - imageViewEmoji.getPaddingBottom());
                                if (imageViewEmoji.selected && SelectAnimatedEmojiDialog.this.type != 3) {
                                    rect2.set(Math.round(rect2.centerX() - ((rect2.width() / 2.0f) * 0.86f)), Math.round(rect2.centerY() - ((rect2.height() / 2.0f) * 0.86f)), Math.round(rect2.centerX() + ((rect2.width() / 2.0f) * 0.86f)), Math.round(rect2.centerY() + ((rect2.height() / 2.0f) * 0.86f)));
                                }
                                rect2.offset((imageViewEmoji.getLeft() + ((int) imageViewEmoji.getTranslationX())) - this.startOffset, 0);
                                imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].setBounds(rect2);
                                imageViewEmoji.skewAlpha = 1.0f;
                                imageViewEmoji.skewIndex = i;
                                this.drawInBackgroundViews.add(imageViewEmoji);
                            }
                        }
                    }
                }
            }

            @Override
            public void drawInBackground(Canvas canvas) {
                for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                    ImageViewEmoji imageViewEmoji = this.drawInBackgroundViews.get(i);
                    if (!imageViewEmoji.notDraw) {
                        if (imageViewEmoji.empty) {
                            imageViewEmoji.drawable.setBounds(imageViewEmoji.drawableBounds);
                            imageViewEmoji.drawable.draw(canvas);
                        } else {
                            ImageReceiver imageReceiver = imageViewEmoji.imageReceiverToDraw;
                            if (imageReceiver != null) {
                                imageReceiver.draw(canvas, imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex]);
                            }
                        }
                    }
                }
            }

            @Override
            protected void drawInUiThread(Canvas canvas, float f) {
                if (this.imageViewEmojis != null) {
                    canvas.save();
                    canvas.translate(-this.startOffset, 0.0f);
                    float f2 = f;
                    for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                        ImageViewEmoji imageViewEmoji = this.imageViewEmojis.get(i);
                        if (!imageViewEmoji.notDraw) {
                            float scaleX = imageViewEmoji.getScaleX();
                            if (imageViewEmoji.pressedProgress != 0.0f || imageViewEmoji.selected) {
                                scaleX *= 0.8f + (0.2f * (1.0f - ((!imageViewEmoji.selected || SelectAnimatedEmojiDialog.this.type == 3) ? imageViewEmoji.pressedProgress : 0.7f)));
                            }
                            boolean z = true;
                            boolean z2 = SelectAnimatedEmojiDialog.this.animateExpandStartTime > 0 && SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime < SelectAnimatedEmojiDialog.this.animateExpandDuration();
                            if ((!z2 || SelectAnimatedEmojiDialog.this.animateExpandFromPosition < 0 || SelectAnimatedEmojiDialog.this.animateExpandToPosition < 0 || SelectAnimatedEmojiDialog.this.animateExpandStartTime <= 0) ? false : false) {
                                int childAdapterPosition = EmojiListView.this.getChildAdapterPosition(imageViewEmoji) - SelectAnimatedEmojiDialog.this.animateExpandFromPosition;
                                int i2 = SelectAnimatedEmojiDialog.this.animateExpandToPosition - SelectAnimatedEmojiDialog.this.animateExpandFromPosition;
                                if (childAdapterPosition >= 0 && childAdapterPosition < i2) {
                                    float clamp = MathUtils.clamp(((float) (SystemClock.elapsedRealtime() - SelectAnimatedEmojiDialog.this.animateExpandStartTime)) / ((float) SelectAnimatedEmojiDialog.this.animateExpandAppearDuration()), 0.0f, 1.0f);
                                    float f3 = childAdapterPosition;
                                    float f4 = i2;
                                    float f5 = f4 / 4.0f;
                                    float cascade = AndroidUtilities.cascade(clamp, f3, f4, f5);
                                    scaleX *= (this.appearScaleInterpolator.getInterpolation(AndroidUtilities.cascade(clamp, f3, f4, f5)) * 0.5f) + 0.5f;
                                    f2 = cascade;
                                }
                            } else {
                                f2 = imageViewEmoji.getAlpha();
                            }
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(((int) imageViewEmoji.getX()) + imageViewEmoji.getPaddingLeft(), imageViewEmoji.getPaddingTop(), (((int) imageViewEmoji.getX()) + imageViewEmoji.getWidth()) - imageViewEmoji.getPaddingRight(), imageViewEmoji.getHeight() - imageViewEmoji.getPaddingBottom());
                            if (!SelectAnimatedEmojiDialog.this.smoothScrolling && !z2) {
                                rect.offset(0, (int) imageViewEmoji.getTranslationY());
                            }
                            Drawable drawable = null;
                            if (imageViewEmoji.empty) {
                                drawable = SelectAnimatedEmojiDialog.this.getPremiumStar();
                                drawable.setBounds(rect);
                                drawable.setAlpha(255);
                            } else if (!imageViewEmoji.isDefaultReaction && !imageViewEmoji.isStaticIcon) {
                                if (imageViewEmoji.span != null && !imageViewEmoji.notDraw && (drawable = imageViewEmoji.drawable) != null) {
                                    drawable.setAlpha(255);
                                    drawable.setBounds(rect);
                                }
                            } else {
                                ImageReceiver imageReceiver = imageViewEmoji.imageReceiver;
                                if (imageReceiver != null) {
                                    imageReceiver.setImageCoords(rect);
                                }
                            }
                            Drawable drawable2 = imageViewEmoji.drawable;
                            if (drawable2 instanceof AnimatedEmojiDrawable) {
                                drawable2.setColorFilter(SelectAnimatedEmojiDialog.this.premiumStarColorFilter);
                            }
                            float f6 = this.skewAlpha;
                            imageViewEmoji.skewAlpha = f6;
                            imageViewEmoji.skewIndex = i;
                            if (scaleX != 1.0f || f6 < 1.0f) {
                                canvas.save();
                                canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                                skew(canvas, i, imageViewEmoji.getHeight());
                                drawImage(canvas, drawable, imageViewEmoji, f2);
                                canvas.restore();
                            } else {
                                drawImage(canvas, drawable, imageViewEmoji, f2);
                            }
                        }
                    }
                    canvas.restore();
                }
            }

            private void skew(Canvas canvas, int i, int i2) {
                float f = this.skewAlpha;
                if (f < 1.0f) {
                    if (this.skewBelow) {
                        canvas.translate(0.0f, i2);
                        canvas.skew((1.0f - ((i * 2.0f) / this.imageViewEmojis.size())) * (-(1.0f - this.skewAlpha)), 0.0f);
                        canvas.translate(0.0f, -i2);
                        return;
                    }
                    canvas.scale(1.0f, f, 0.0f, 0.0f);
                    canvas.skew((1.0f - ((i * 2.0f) / this.imageViewEmojis.size())) * (1.0f - this.skewAlpha), 0.0f);
                }
            }

            private void drawImage(Canvas canvas, Drawable drawable, ImageViewEmoji imageViewEmoji, float f) {
                ImageReceiver imageReceiver;
                if (drawable != null) {
                    drawable.setAlpha((int) (f * 255.0f));
                    drawable.draw(canvas);
                    drawable.setColorFilter(SelectAnimatedEmojiDialog.this.premiumStarColorFilter);
                    PremiumLockIconView premiumLockIconView = imageViewEmoji.premiumLockIconView;
                } else if ((imageViewEmoji.isDefaultReaction || imageViewEmoji.isStaticIcon) && (imageReceiver = imageViewEmoji.imageReceiver) != null) {
                    imageReceiver.setAlpha(f);
                    imageViewEmoji.imageReceiver.draw(canvas);
                }
            }

            @Override
            public void onFrameReady() {
                super.onFrameReady();
                for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                    ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = this.drawInBackgroundViews.get(i).backgroundThreadDrawHolder;
                    int i2 = this.threadIndex;
                    if (backgroundThreadDrawHolderArr[i2] != null) {
                        backgroundThreadDrawHolderArr[i2].release();
                    }
                }
                SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (this == selectAnimatedEmojiDialog.emojiGridView) {
                selectAnimatedEmojiDialog.bigReactionImageReceiver.onAttachedToWindow();
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
            if (this == selectAnimatedEmojiDialog.emojiGridView) {
                selectAnimatedEmojiDialog.bigReactionImageReceiver.onDetachedFromWindow();
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttached = true;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.isAttached = false;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.scrimDrawable;
        if (swapAnimatedEmojiDrawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
            swapAnimatedEmojiDrawable.removeParentView(this);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == 5) {
                updateRows(true, true);
            }
        } else if (i == NotificationCenter.featuredEmojiDidLoad) {
            updateRows(false, true);
        } else if (i == NotificationCenter.recentEmojiStatusesUpdate) {
            updateRows(false, true);
        } else if (i == NotificationCenter.groupStickersDidLoad && this.defaultSetLoading) {
            updateRows(true, true);
            this.defaultSetLoading = false;
        }
    }

    public void onShow(Runnable runnable) {
        Integer num = this.listStateId;
        if (num != null) {
            listStates.get(num);
        }
        this.dismiss = runnable;
        if (!this.drawBackground) {
            checkScroll();
            while (r0 < this.emojiGridView.getChildCount()) {
                View childAt = this.emojiGridView.getChildAt(r0);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
                r0++;
            }
            return;
        }
        ValueAnimator valueAnimator = this.showAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.showAnimator = null;
        }
        ValueAnimator valueAnimator2 = this.hideAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.hideAnimator = null;
        }
        if ((this.type != 3 ? 1 : 0) != 0) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.showAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    SelectAnimatedEmojiDialog.this.lambda$onShow$18(valueAnimator3);
                }
            });
            this.showAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SelectAnimatedEmojiDialog.this.checkScroll();
                    SelectAnimatedEmojiDialog.this.updateShow(1.0f);
                    for (int i = 0; i < SelectAnimatedEmojiDialog.this.emojiGridView.getChildCount(); i++) {
                        View childAt2 = SelectAnimatedEmojiDialog.this.emojiGridView.getChildAt(i);
                        childAt2.setScaleX(1.0f);
                        childAt2.setScaleY(1.0f);
                    }
                    for (int i2 = 0; i2 < SelectAnimatedEmojiDialog.this.emojiTabs.contentView.getChildCount(); i2++) {
                        View childAt3 = SelectAnimatedEmojiDialog.this.emojiTabs.contentView.getChildAt(i2);
                        childAt3.setScaleX(1.0f);
                        childAt3.setScaleY(1.0f);
                    }
                    SelectAnimatedEmojiDialog.this.emojiTabs.contentView.invalidate();
                    SelectAnimatedEmojiDialog.this.emojiGridView.updateEmojiDrawables();
                }
            });
            updateShow(0.0f);
            this.showAnimator.setDuration(800L);
            this.showAnimator.start();
            return;
        }
        checkScroll();
        updateShow(1.0f);
    }

    public void lambda$onShow$18(ValueAnimator valueAnimator) {
        updateShow(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public class SearchBox extends FrameLayout {
        private FrameLayout box;
        private ImageView clear;
        private CloseProgressDrawable2 clearDrawable;
        private EditTextCaption input;
        private ImageView search;

        public SearchBox(Context context) {
            super(context);
            SelectAnimatedEmojiDialog.this = r14;
            setBackgroundColor(Theme.getColor("actionBarDefaultSubmenuBackground", r14.resourcesProvider));
            FrameLayout frameLayout = new FrameLayout(context);
            this.box = frameLayout;
            frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.m35dp(18.0f), Theme.getColor("chat_emojiPanelBackground", r14.resourcesProvider)));
            if (Build.VERSION.SDK_INT >= 21) {
                this.box.setClipToOutline(true);
                this.box.setOutlineProvider(new ViewOutlineProvider(this, r14) {
                    @Override
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.m35dp(18.0f));
                    }
                });
            }
            addView(this.box, LayoutHelper.createFrame(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
            ImageView imageView = new ImageView(context);
            this.search = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.search.setImageResource(C1072R.C1073drawable.smiles_inputsearch);
            this.search.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chat_emojiSearchIcon", r14.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            this.box.addView(this.search, LayoutHelper.createFrame(36, 36, 51));
            C40402 c40402 = new C40402(context, r14.resourcesProvider, r14);
            this.input = c40402;
            c40402.addTextChangedListener(new TextWatcher(r14) {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    SearchBox searchBox = SearchBox.this;
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                    String str = null;
                    if (searchBox.input.getText() != null && AndroidUtilities.trim(SearchBox.this.input.getText(), null).length() != 0) {
                        str = SearchBox.this.input.getText().toString();
                    }
                    selectAnimatedEmojiDialog.search(str);
                }
            });
            this.input.setBackground(null);
            this.input.setPadding(0, 0, AndroidUtilities.m35dp(4.0f), 0);
            this.input.setTextSize(1, 16.0f);
            if (r14.type != 0) {
                if (r14.type == 1 || r14.type == 2) {
                    this.input.setHint(LocaleController.getString(C1072R.string.SearchReactionsHint));
                } else {
                    this.input.setHint(LocaleController.getString(C1072R.string.SearchIconsHint));
                }
            } else {
                this.input.setHint(LocaleController.getString(C1072R.string.SearchEmojiHint));
            }
            this.input.setHintTextColor(Theme.getColor("chat_emojiSearchIcon", r14.resourcesProvider));
            this.input.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", r14.resourcesProvider));
            this.input.setImeOptions(268435459);
            this.input.setCursorColor(Theme.getColor("featuredStickers_addedIcon", r14.resourcesProvider));
            this.input.setCursorSize(AndroidUtilities.m35dp(20.0f));
            this.input.setGravity(19);
            this.input.setCursorWidth(1.5f);
            this.input.setMaxLines(1);
            this.input.setSingleLine(true);
            this.input.setLines(1);
            this.box.addView(this.input, LayoutHelper.createFrame(-1, -1.0f, 119, 36.0f, -1.0f, 32.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.clear = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            ImageView imageView3 = this.clear;
            CloseProgressDrawable2 closeProgressDrawable2 = new CloseProgressDrawable2(1.25f, r14) {
                @Override
                protected int getCurrentColor() {
                    return Theme.getColor("chat_emojiSearchIcon", SelectAnimatedEmojiDialog.this.resourcesProvider);
                }
            };
            this.clearDrawable = closeProgressDrawable2;
            imageView3.setImageDrawable(closeProgressDrawable2);
            this.clearDrawable.setSide(AndroidUtilities.m35dp(7.0f));
            this.clear.setScaleX(0.1f);
            this.clear.setScaleY(0.1f);
            this.clear.setAlpha(0.0f);
            this.box.addView(this.clear, LayoutHelper.createFrame(36, 36, 53));
            this.clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SelectAnimatedEmojiDialog.SearchBox.this.lambda$new$0(view);
                }
            });
            setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SelectAnimatedEmojiDialog.SearchBox.this.lambda$new$1(view);
                }
            });
        }

        public class C40402 extends EditTextCaption {
            C40402(Context context, Theme.ResourcesProvider resourcesProvider, SelectAnimatedEmojiDialog selectAnimatedEmojiDialog) {
                super(context, resourcesProvider);
                SearchBox.this = r1;
            }

            @Override
            public void onFocusChanged(boolean z, int i, Rect rect) {
                if (z) {
                    SelectAnimatedEmojiDialog.this.onInputFocus();
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            SelectAnimatedEmojiDialog.SearchBox.C40402.this.lambda$onFocusChanged$0();
                        }
                    }, 200L);
                }
                super.onFocusChanged(z, i, rect);
            }

            public void lambda$onFocusChanged$0() {
                AndroidUtilities.showKeyboard(SearchBox.this.input);
            }
        }

        public void lambda$new$0(View view) {
            this.input.setText("");
            SelectAnimatedEmojiDialog.this.search(null);
        }

        public void lambda$new$1(View view) {
            SelectAnimatedEmojiDialog.this.onInputFocus();
            this.input.requestFocus();
            SelectAnimatedEmojiDialog.this.scrollToPosition(0, 0);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(56.0f), 1073741824));
        }
    }

    public void updateShow(float f) {
        if (this.bubble1View != null) {
            float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((((f * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            this.bubble1View.setAlpha(interpolation);
            this.bubble1View.setScaleX(interpolation);
            this.bubble1View.setScaleY(interpolation);
        }
        if (this.bubble2View != null) {
            float clamp = MathUtils.clamp((((f * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            this.bubble2View.setAlpha(clamp);
            this.bubble2View.setScaleX(clamp);
            this.bubble2View.setScaleY(clamp);
        }
        float f2 = f * 800.0f;
        float f3 = f2 - 40.0f;
        float clamp2 = MathUtils.clamp(f3 / 700.0f, 0.0f, 1.0f);
        float clamp3 = MathUtils.clamp((f2 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float clamp4 = MathUtils.clamp(f3 / 750.0f, 0.0f, 1.0f);
        float clamp5 = MathUtils.clamp((f2 - 30.0f) / 120.0f, 0.0f, 1.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        float interpolation2 = cubicBezierInterpolator.getInterpolation(clamp2);
        float interpolation3 = cubicBezierInterpolator.getInterpolation(clamp3);
        this.contentView.setAlpha(clamp5);
        if (this.scrimDrawable != null) {
            invalidate();
        }
        float f4 = 1.0f - clamp5;
        this.contentView.setTranslationY(AndroidUtilities.m35dp(-5.0f) * f4);
        View view = this.bubble2View;
        if (view != null) {
            view.setTranslationY(AndroidUtilities.m35dp(-5.0f) * f4);
        }
        this.scaleX = (interpolation2 * 0.85f) + 0.15f;
        this.scaleY = (interpolation3 * 0.925f) + 0.075f;
        View view2 = this.bubble2View;
        if (view2 != null) {
            view2.setAlpha(clamp5);
        }
        this.contentView.invalidate();
        this.emojiTabsShadow.setAlpha(clamp5);
        this.emojiTabsShadow.setScaleX(Math.min(this.scaleX, 1.0f));
        float pivotX = this.emojiTabsShadow.getPivotX();
        double d = pivotX * pivotX;
        double pow = Math.pow(this.contentView.getHeight(), 2.0d);
        Double.isNaN(d);
        float sqrt = (float) Math.sqrt(Math.max(d + pow, Math.pow(this.contentView.getWidth() - pivotX, 2.0d) + Math.pow(this.contentView.getHeight(), 2.0d)));
        for (int i = 0; i < this.emojiTabs.contentView.getChildCount(); i++) {
            View childAt = this.emojiTabs.contentView.getChildAt(i);
            float top = childAt.getTop() + (childAt.getHeight() / 2.0f);
            float left = (childAt.getLeft() + (childAt.getWidth() / 2.0f)) - pivotX;
            float cascade = AndroidUtilities.cascade(clamp4, (float) Math.sqrt((left * left) + (top * top * 0.4f)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        this.emojiTabs.contentView.invalidate();
        for (int i2 = 0; i2 < this.emojiGridView.getChildCount(); i2++) {
            View childAt2 = this.emojiGridView.getChildAt(i2);
            float top2 = childAt2.getTop() + (childAt2.getHeight() / 2.0f);
            float left2 = (childAt2.getLeft() + (childAt2.getWidth() / 2.0f)) - pivotX;
            float cascade2 = AndroidUtilities.cascade(clamp4, (float) Math.sqrt((left2 * left2) + (top2 * top2 * 0.2f)), sqrt, childAt2.getHeight() * 1.75f);
            if (Float.isNaN(cascade2)) {
                cascade2 = 0.0f;
            }
            childAt2.setScaleX(cascade2);
            childAt2.setScaleY(cascade2);
        }
        this.emojiGridView.invalidate();
    }

    public void onDismiss(final Runnable runnable) {
        Integer num = this.listStateId;
        if (num != null) {
            listStates.put(num, this.layoutManager.onSaveInstanceState());
        }
        ValueAnimator valueAnimator = this.hideAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.hideAnimator = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.hideAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SelectAnimatedEmojiDialog.this.lambda$onDismiss$19(valueAnimator2);
            }
        });
        this.hideAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                runnable.run();
                if (SelectAnimatedEmojiDialog.this.selectStatusDateDialog != null) {
                    SelectAnimatedEmojiDialog.this.selectStatusDateDialog.dismiss();
                    SelectAnimatedEmojiDialog.this.selectStatusDateDialog = null;
                }
            }
        });
        this.hideAnimator.setDuration(200L);
        this.hideAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.hideAnimator.start();
        SearchBox searchBox = this.searchBox;
        if (searchBox != null) {
            AndroidUtilities.hideKeyboard(searchBox.input);
        }
    }

    public void lambda$onDismiss$19(ValueAnimator valueAnimator) {
        float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setTranslationY(AndroidUtilities.m35dp(8.0f) * (1.0f - floatValue));
        View view = this.bubble1View;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        View view2 = this.bubble2View;
        if (view2 != null) {
            view2.setAlpha(floatValue * floatValue);
        }
        this.contentView.setAlpha(floatValue);
        this.contentView.invalidate();
        invalidate();
    }

    public void setDrawBackground(boolean z) {
        this.drawBackground = z;
    }

    public void setRecentReactions(List<ReactionsLayoutInBubble.VisibleReaction> list) {
        this.recentReactionsToSet = list;
        updateRows(false, true);
    }

    public void resetBackgroundBitmaps() {
        for (int i = 0; i < this.emojiGridView.lineDrawables.size(); i++) {
            EmojiListView.DrawingInBackgroundLine drawingInBackgroundLine = this.emojiGridView.lineDrawables.get(i);
            for (int i2 = 0; i2 < drawingInBackgroundLine.imageViewEmojis.size(); i2++) {
                if (drawingInBackgroundLine.imageViewEmojis.get(i2).notDraw) {
                    drawingInBackgroundLine.imageViewEmojis.get(i2).notDraw = false;
                    drawingInBackgroundLine.imageViewEmojis.get(i2).invalidate();
                    drawingInBackgroundLine.reset();
                }
            }
        }
        this.emojiGridView.invalidate();
        for (int i3 = 0; i3 < this.emojiSearchGridView.lineDrawables.size(); i3++) {
            EmojiListView.DrawingInBackgroundLine drawingInBackgroundLine2 = this.emojiSearchGridView.lineDrawables.get(i3);
            for (int i4 = 0; i4 < drawingInBackgroundLine2.imageViewEmojis.size(); i4++) {
                if (drawingInBackgroundLine2.imageViewEmojis.get(i4).notDraw) {
                    drawingInBackgroundLine2.imageViewEmojis.get(i4).notDraw = false;
                    drawingInBackgroundLine2.imageViewEmojis.get(i4).invalidate();
                    drawingInBackgroundLine2.reset();
                }
            }
        }
        this.emojiSearchGridView.invalidate();
    }

    public void setSelected(Long l) {
        this.selectedDocumentIds.clear();
        this.selectedDocumentIds.add(l);
        if (this.emojiGridView != null) {
            for (int i = 0; i < this.emojiGridView.getChildCount(); i++) {
                if (this.emojiGridView.getChildAt(i) instanceof ImageViewEmoji) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.emojiGridView.getChildAt(i);
                    AnimatedEmojiSpan animatedEmojiSpan = imageViewEmoji.span;
                    if (animatedEmojiSpan != null) {
                        imageViewEmoji.setViewSelected(this.selectedDocumentIds.contains(Long.valueOf(animatedEmojiSpan.getDocumentId())), true);
                    } else {
                        imageViewEmoji.setViewSelected(this.selectedDocumentIds.contains(0L), true);
                    }
                }
            }
            this.emojiGridView.invalidate();
        }
    }

    public void setScrimDrawable(AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable, View view) {
        this.scrimColor = swapAnimatedEmojiDrawable == null ? 0 : swapAnimatedEmojiDrawable.getColor().intValue();
        this.scrimDrawable = swapAnimatedEmojiDrawable;
        this.scrimDrawableParent = view;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.addParentView(this);
        }
        invalidate();
    }

    public void drawBigReaction(Canvas canvas, View view) {
        if (this.selectedReactionView == null) {
            return;
        }
        this.bigReactionImageReceiver.setParentView(view);
        ImageViewEmoji imageViewEmoji = this.selectedReactionView;
        if (imageViewEmoji != null) {
            float f = this.pressedProgress;
            if (f != 1.0f && !this.cancelPressed) {
                float f2 = f + 0.010666667f;
                this.pressedProgress = f2;
                if (f2 >= 1.0f) {
                    this.pressedProgress = 1.0f;
                    onLongPressedListener onlongpressedlistener = this.bigReactionListener;
                    if (onlongpressedlistener != null) {
                        onlongpressedlistener.onLongPressed(imageViewEmoji);
                    }
                }
                this.selectedReactionView.bigReactionSelectedProgress = this.pressedProgress;
            }
            float f3 = (this.pressedProgress * 2.0f) + 1.0f;
            canvas.save();
            canvas.translate(this.emojiGridView.getX() + this.selectedReactionView.getX(), this.gridViewContainer.getY() + this.emojiGridView.getY() + this.selectedReactionView.getY());
            this.paint.setColor(Theme.getColor("actionBarDefaultSubmenuBackground", this.resourcesProvider));
            canvas.drawRect(0.0f, 0.0f, this.selectedReactionView.getMeasuredWidth(), this.selectedReactionView.getMeasuredHeight(), this.paint);
            canvas.scale(f3, f3, this.selectedReactionView.getMeasuredWidth() / 2.0f, this.selectedReactionView.getMeasuredHeight());
            ImageViewEmoji imageViewEmoji2 = this.selectedReactionView;
            ImageReceiver imageReceiver = imageViewEmoji2.isDefaultReaction ? this.bigReactionImageReceiver : imageViewEmoji2.imageReceiverToDraw;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.bigReactionAnimatedEmoji;
            if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null && this.bigReactionAnimatedEmoji.getImageReceiver().hasBitmapImage()) {
                imageReceiver = this.bigReactionAnimatedEmoji.getImageReceiver();
            }
            if (imageReceiver != null) {
                imageReceiver.setImageCoords(0.0f, 0.0f, this.selectedReactionView.getMeasuredWidth(), this.selectedReactionView.getMeasuredHeight());
                imageReceiver.draw(canvas);
            }
            canvas.restore();
            view.invalidate();
        }
    }

    public void setSaveState(int i) {
        this.listStateId = Integer.valueOf(i);
    }

    public void setOnLongPressedListener(onLongPressedListener onlongpressedlistener) {
        this.bigReactionListener = onlongpressedlistener;
    }

    public void setOnRecentClearedListener(onRecentClearedListener onrecentclearedlistener) {
        this.onRecentClearedListener = onrecentclearedlistener;
    }

    public class SelectStatusDurationDialog extends Dialog {
        private Bitmap blurBitmap;
        private Paint blurBitmapPaint;
        private boolean changeToScrimColor;
        private int clipBottom;
        private ContentView contentView;
        private Rect current;
        private BottomSheet dateBottomSheet;
        private boolean dismissed;
        private boolean done;
        private View emojiPreviewView;
        private Rect from;
        private ImageReceiver imageReceiver;
        private ImageViewEmoji imageViewEmoji;
        private WindowInsets lastInsets;
        private LinearLayout linearLayoutView;
        private ActionBarPopupWindow.ActionBarPopupWindowLayout menuView;
        private Runnable parentDialogDismiss;
        private View parentDialogView;
        private int parentDialogX;
        private int parentDialogY;
        private Theme.ResourcesProvider resourcesProvider;
        private ValueAnimator showAnimator;
        private ValueAnimator showMenuAnimator;
        private float showMenuT;
        private float showT;
        private boolean showing;
        private boolean showingMenu;
        private int[] tempLocation;
        private Rect f1167to;

        protected boolean getOutBounds(Rect rect) {
            throw null;
        }

        protected void onEnd(Integer num) {
            throw null;
        }

        protected void onEndPartly(Integer num) {
            throw null;
        }

        public class ContentView extends FrameLayout {
            public ContentView(Context context) {
                super(context);
                SelectStatusDurationDialog.this = r1;
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                float f;
                if (SelectStatusDurationDialog.this.blurBitmap != null && SelectStatusDurationDialog.this.blurBitmapPaint != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    SelectStatusDurationDialog.this.blurBitmapPaint.setAlpha((int) (SelectStatusDurationDialog.this.showT * 255.0f));
                    canvas.drawBitmap(SelectStatusDurationDialog.this.blurBitmap, 0.0f, 0.0f, SelectStatusDurationDialog.this.blurBitmapPaint);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (SelectStatusDurationDialog.this.imageViewEmoji != null) {
                    Drawable drawable = SelectStatusDurationDialog.this.imageViewEmoji.drawable;
                    if (drawable != null) {
                        if (!SelectStatusDurationDialog.this.changeToScrimColor) {
                            drawable.setColorFilter(SelectAnimatedEmojiDialog.this.premiumStarColorFilter);
                        } else {
                            drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(SelectAnimatedEmojiDialog.this.scrimColor, Theme.getColor("windowBackgroundWhiteBlueIcon", SelectStatusDurationDialog.this.resourcesProvider), SelectStatusDurationDialog.this.showT), PorterDuff.Mode.MULTIPLY));
                        }
                        drawable.setAlpha((int) ((1.0f - SelectStatusDurationDialog.this.showT) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(SelectStatusDurationDialog.this.current);
                        if (SelectStatusDurationDialog.this.imageViewEmoji.pressedProgress != 0.0f || SelectStatusDurationDialog.this.imageViewEmoji.selected) {
                            f = (((1.0f - (SelectStatusDurationDialog.this.imageViewEmoji.selected ? 0.7f : SelectStatusDurationDialog.this.imageViewEmoji.pressedProgress)) * 0.2f) + 0.8f) * 1.0f;
                        } else {
                            f = 1.0f;
                        }
                        Rect rect = AndroidUtilities.rectTmp2;
                        rect.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * f)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * f)), (int) (rectF.centerX() + ((rectF.width() / 2.0f) * f)), (int) (rectF.centerY() + ((rectF.height() / 2.0f) * f)));
                        float f2 = 1.0f - ((1.0f - SelectStatusDurationDialog.this.imageViewEmoji.skewAlpha) * (1.0f - SelectStatusDurationDialog.this.showT));
                        canvas.save();
                        if (f2 < 1.0f) {
                            canvas.translate(rect.left, rect.top);
                            canvas.scale(1.0f, f2, 0.0f, 0.0f);
                            canvas.skew((1.0f - ((SelectStatusDurationDialog.this.imageViewEmoji.skewIndex * 2.0f) / SelectAnimatedEmojiDialog.this.layoutManager.getSpanCount())) * (1.0f - f2), 0.0f);
                            canvas.translate(-rect.left, -rect.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), SelectStatusDurationDialog.this.clipBottom + (SelectStatusDurationDialog.this.showT * AndroidUtilities.m35dp(45.0f)));
                        drawable.setBounds(rect);
                        drawable.draw(canvas);
                        canvas.restore();
                        if (SelectStatusDurationDialog.this.imageViewEmoji.skewIndex != 0) {
                            if (SelectStatusDurationDialog.this.imageViewEmoji.skewIndex != 1) {
                                if (SelectStatusDurationDialog.this.imageViewEmoji.skewIndex != SelectAnimatedEmojiDialog.this.layoutManager.getSpanCount() - 2) {
                                    if (SelectStatusDurationDialog.this.imageViewEmoji.skewIndex == SelectAnimatedEmojiDialog.this.layoutManager.getSpanCount() - 1) {
                                        rect.offset(AndroidUtilities.m35dp(f2 * (-8.0f)), 0);
                                    }
                                } else {
                                    rect.offset(-AndroidUtilities.m35dp(f2 * (-4.0f)), 0);
                                }
                            } else {
                                rect.offset(AndroidUtilities.m35dp(f2 * 4.0f), 0);
                            }
                        } else {
                            rect.offset(AndroidUtilities.m35dp(f2 * 8.0f), 0);
                        }
                        canvas.saveLayerAlpha(rect.left, rect.top, rect.right, rect.bottom, (int) ((1.0f - SelectStatusDurationDialog.this.showT) * 255.0f), 31);
                        canvas.clipRect(rect);
                        canvas.translate((int) (SelectAnimatedEmojiDialog.this.bottomGradientView.getX() + SelectAnimatedEmojiDialog.this.contentView.getX() + SelectStatusDurationDialog.this.parentDialogX), ((int) SelectAnimatedEmojiDialog.this.bottomGradientView.getY()) + SelectAnimatedEmojiDialog.this.contentView.getY() + SelectStatusDurationDialog.this.parentDialogY);
                        SelectAnimatedEmojiDialog.this.bottomGradientView.draw(canvas);
                        canvas.restore();
                    } else if (SelectStatusDurationDialog.this.imageViewEmoji.isDefaultReaction && SelectStatusDurationDialog.this.imageViewEmoji.imageReceiver != null) {
                        SelectStatusDurationDialog.this.imageViewEmoji.imageReceiver.setAlpha(1.0f - SelectStatusDurationDialog.this.showT);
                        SelectStatusDurationDialog.this.imageViewEmoji.imageReceiver.setImageCoords(SelectStatusDurationDialog.this.current);
                        SelectStatusDurationDialog.this.imageViewEmoji.imageReceiver.draw(canvas);
                    }
                }
                if (SelectStatusDurationDialog.this.imageReceiver != null) {
                    SelectStatusDurationDialog.this.imageReceiver.setAlpha(SelectStatusDurationDialog.this.showT);
                    SelectStatusDurationDialog.this.imageReceiver.setImageCoords(SelectStatusDurationDialog.this.current);
                    SelectStatusDurationDialog.this.imageReceiver.draw(canvas);
                }
            }

            @Override
            protected void onConfigurationChanged(Configuration configuration) {
                SelectStatusDurationDialog.this.lastInsets = null;
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                if (SelectStatusDurationDialog.this.imageReceiver != null) {
                    SelectStatusDurationDialog.this.imageReceiver.onAttachedToWindow();
                }
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                if (SelectStatusDurationDialog.this.imageReceiver != null) {
                    SelectStatusDurationDialog.this.imageReceiver.onDetachedFromWindow();
                }
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                Activity parentActivity = SelectStatusDurationDialog.this.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                View decorView = parentActivity.getWindow().getDecorView();
                if (SelectStatusDurationDialog.this.blurBitmap != null && SelectStatusDurationDialog.this.blurBitmap.getWidth() == decorView.getMeasuredWidth() && SelectStatusDurationDialog.this.blurBitmap.getHeight() == decorView.getMeasuredHeight()) {
                    return;
                }
                SelectStatusDurationDialog.this.prepareBlurBitmap();
            }
        }

        public SelectStatusDurationDialog(final Context context, Runnable runnable, View view, ImageViewEmoji imageViewEmoji, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            String str;
            ImageLocation forDocument;
            SelectAnimatedEmojiDialog.this = r30;
            this.from = new Rect();
            this.f1167to = new Rect();
            this.current = new Rect();
            this.tempLocation = new int[2];
            this.done = false;
            this.dismissed = false;
            this.imageViewEmoji = imageViewEmoji;
            this.resourcesProvider = resourcesProvider;
            this.parentDialogDismiss = runnable;
            this.parentDialogView = view;
            ContentView contentView = new ContentView(context);
            this.contentView = contentView;
            setContentView(contentView, new ViewGroup.LayoutParams(-1, -1));
            LinearLayout linearLayout = new LinearLayout(context);
            this.linearLayoutView = linearLayout;
            linearLayout.setOrientation(1);
            View view2 = new View(context, r30) {
                @Override
                protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    super.onLayout(z, i, i2, i3, i4);
                    getLocationOnScreen(SelectStatusDurationDialog.this.tempLocation);
                    SelectStatusDurationDialog.this.f1167to.set(SelectStatusDurationDialog.this.tempLocation[0], SelectStatusDurationDialog.this.tempLocation[1], SelectStatusDurationDialog.this.tempLocation[0] + getWidth(), SelectStatusDurationDialog.this.tempLocation[1] + getHeight());
                    AndroidUtilities.lerp(SelectStatusDurationDialog.this.from, SelectStatusDurationDialog.this.f1167to, SelectStatusDurationDialog.this.showT, SelectStatusDurationDialog.this.current);
                }
            };
            this.emojiPreviewView = view2;
            this.linearLayoutView.addView(view2, LayoutHelper.createLinear(160, 160, 17, 0, 0, 0, 16));
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context, C1072R.C1073drawable.popup_fixed_alert2, resourcesProvider);
            this.menuView = actionBarPopupWindowLayout;
            this.linearLayoutView.addView(actionBarPopupWindowLayout, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 0));
            ActionBarMenuItem.addItem(true, false, this.menuView, 0, LocaleController.getString("SetEmojiStatusUntil1Hour", C1072R.string.SetEmojiStatusUntil1Hour), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog.this.lambda$new$0(view3);
                }
            });
            ActionBarMenuItem.addItem(false, false, this.menuView, 0, LocaleController.getString("SetEmojiStatusUntil2Hours", C1072R.string.SetEmojiStatusUntil2Hours), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog.this.lambda$new$1(view3);
                }
            });
            ActionBarMenuItem.addItem(false, false, this.menuView, 0, LocaleController.getString("SetEmojiStatusUntil8Hours", C1072R.string.SetEmojiStatusUntil8Hours), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog.this.lambda$new$2(view3);
                }
            });
            ActionBarMenuItem.addItem(false, false, this.menuView, 0, LocaleController.getString("SetEmojiStatusUntil2Days", C1072R.string.SetEmojiStatusUntil2Days), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog.this.lambda$new$3(view3);
                }
            });
            ActionBarMenuItem.addItem(false, true, this.menuView, 0, LocaleController.getString("SetEmojiStatusUntilOther", C1072R.string.SetEmojiStatusUntilOther), false, resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog.this.lambda$new$6(context, view3);
                }
            });
            this.contentView.addView(this.linearLayoutView, LayoutHelper.createFrame(-2, -2, 17));
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(C1072R.style.DialogNoAnimation);
                window.setBackgroundDrawable(null);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.gravity = 51;
                attributes.dimAmount = 0.0f;
                int i = attributes.flags & (-3);
                attributes.flags = i;
                int i2 = i | 131072;
                attributes.flags = i2;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 21) {
                    attributes.flags = i2 | (-2147417856);
                    this.contentView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                        @Override
                        public final WindowInsets onApplyWindowInsets(View view3, WindowInsets windowInsets) {
                            WindowInsets lambda$new$7;
                            lambda$new$7 = SelectAnimatedEmojiDialog.SelectStatusDurationDialog.this.lambda$new$7(view3, windowInsets);
                            return lambda$new$7;
                        }
                    });
                }
                attributes.flags |= ConnectionsManager.RequestFlagDoNotWaitFloodWait;
                this.contentView.setFitsSystemWindows(true);
                this.contentView.setSystemUiVisibility(1284);
                attributes.height = -1;
                if (i3 >= 28) {
                    attributes.layoutInDisplayCutoutMode = 1;
                }
                window.setAttributes(attributes);
            }
            if (imageViewEmoji != null) {
                imageViewEmoji.notDraw = true;
            }
            prepareBlurBitmap();
            ImageReceiver imageReceiver = new ImageReceiver();
            this.imageReceiver = imageReceiver;
            imageReceiver.setParentView(this.contentView);
            this.imageReceiver.setLayerNum(7);
            TLRPC$Document tLRPC$Document = imageViewEmoji.document;
            if (tLRPC$Document == null) {
                Drawable drawable = imageViewEmoji.drawable;
                if (drawable instanceof AnimatedEmojiDrawable) {
                    tLRPC$Document = ((AnimatedEmojiDrawable) drawable).getDocument();
                }
            }
            if (tLRPC$Document != null) {
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$Document.thumbs, "windowBackgroundWhiteGrayIcon", 0.2f);
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90);
                if ("video/webm".equals(tLRPC$Document.mime_type)) {
                    ImageLocation forDocument2 = ImageLocation.getForDocument(tLRPC$Document);
                    String str2 = "160_160_" + ImageLoader.AUTOPLAY_FILTER;
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    forDocument = forDocument2;
                    str = str2;
                } else {
                    if (svgThumb != null && MessageObject.isAnimatedStickerDocument(tLRPC$Document, false)) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    str = "160_160";
                    forDocument = ImageLocation.getForDocument(tLRPC$Document);
                }
                this.imageReceiver.setImage(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, tLRPC$Document), "160_160", null, null, svgThumb, tLRPC$Document.size, null, tLRPC$Document, 1);
                Drawable drawable2 = imageViewEmoji.drawable;
                if ((drawable2 instanceof AnimatedEmojiDrawable) && ((AnimatedEmojiDrawable) drawable2).canOverrideColor()) {
                    this.imageReceiver.setColorFilter(AnimatedEmojiDrawable.isDefaultStatusEmoji((AnimatedEmojiDrawable) imageViewEmoji.drawable) ? r30.premiumStarColorFilter : Theme.chat_animatedEmojiTextColorFilter);
                }
            }
            imageViewEmoji.getLocationOnScreen(this.tempLocation);
            this.from.left = this.tempLocation[0] + imageViewEmoji.getPaddingLeft();
            this.from.top = this.tempLocation[1] + imageViewEmoji.getPaddingTop();
            this.from.right = (this.tempLocation[0] + imageViewEmoji.getWidth()) - imageViewEmoji.getPaddingRight();
            this.from.bottom = (this.tempLocation[1] + imageViewEmoji.getHeight()) - imageViewEmoji.getPaddingBottom();
            AndroidUtilities.lerp(this.from, this.f1167to, this.showT, this.current);
            view.getLocationOnScreen(this.tempLocation);
            int[] iArr = this.tempLocation;
            this.parentDialogX = iArr[0];
            int i4 = iArr[1];
            this.parentDialogY = i4;
            this.clipBottom = i4 + view.getHeight();
        }

        public void lambda$new$0(View view) {
            done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
        }

        public void lambda$new$1(View view) {
            done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
        }

        public void lambda$new$2(View view) {
            done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
        }

        public void lambda$new$3(View view) {
            done(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
        }

        public void lambda$new$6(Context context, View view) {
            if (this.dateBottomSheet != null) {
                return;
            }
            final boolean[] zArr = new boolean[1];
            BottomSheet.Builder createStatusUntilDatePickerDialog = AlertsCreator.createStatusUntilDatePickerDialog(context, System.currentTimeMillis() / 1000, new AlertsCreator.StatusUntilDatePickerDelegate() {
                @Override
                public final void didSelectDate(int i) {
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog.this.lambda$new$4(zArr, i);
                }
            });
            createStatusUntilDatePickerDialog.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog.this.lambda$new$5(zArr, dialogInterface);
                }
            });
            this.dateBottomSheet = createStatusUntilDatePickerDialog.show();
            animateMenuShow(false, null);
        }

        public void lambda$new$4(boolean[] zArr, int i) {
            zArr[0] = true;
            done(Integer.valueOf(i));
        }

        public void lambda$new$5(boolean[] zArr, DialogInterface dialogInterface) {
            if (!zArr[0]) {
                animateMenuShow(true, null);
            }
            this.dateBottomSheet = null;
        }

        public WindowInsets lambda$new$7(View view, WindowInsets windowInsets) {
            view.requestLayout();
            return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
        }

        private void done(final Integer num) {
            Runnable runnable;
            if (this.done) {
                return;
            }
            this.done = true;
            boolean z = num != null && getOutBounds(this.from);
            this.changeToScrimColor = z;
            if (z) {
                this.parentDialogView.getLocationOnScreen(this.tempLocation);
                Rect rect = this.from;
                int[] iArr = this.tempLocation;
                rect.offset(iArr[0], iArr[1]);
            } else {
                this.imageViewEmoji.getLocationOnScreen(this.tempLocation);
                this.from.left = this.tempLocation[0] + this.imageViewEmoji.getPaddingLeft();
                this.from.top = this.tempLocation[1] + this.imageViewEmoji.getPaddingTop();
                this.from.right = (this.tempLocation[0] + this.imageViewEmoji.getWidth()) - this.imageViewEmoji.getPaddingRight();
                this.from.bottom = (this.tempLocation[1] + this.imageViewEmoji.getHeight()) - this.imageViewEmoji.getPaddingBottom();
            }
            if (num != null && (runnable = this.parentDialogDismiss) != null) {
                runnable.run();
            }
            animateShow(false, new Runnable() {
                @Override
                public final void run() {
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog.this.lambda$done$8(num);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog.this.lambda$done$9(num);
                }
            }, !z);
            animateMenuShow(false, null);
        }

        public void lambda$done$8(Integer num) {
            onEnd(num);
            super.dismiss();
        }

        public void lambda$done$9(Integer num) {
            if (num != null) {
                try {
                    SelectAnimatedEmojiDialog.this.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                onEndPartly(num);
            }
        }

        public Activity getParentActivity() {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            return null;
        }

        public void prepareBlurBitmap() {
            Activity parentActivity = getParentActivity();
            if (parentActivity == null) {
                return;
            }
            View decorView = parentActivity.getWindow().getDecorView();
            int measuredWidth = (int) (decorView.getMeasuredWidth() / 12.0f);
            int measuredHeight = (int) (decorView.getMeasuredHeight() / 12.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.083333336f, 0.083333336f);
            canvas.drawColor(Theme.getColor("windowBackgroundWhite"));
            decorView.draw(canvas);
            if (parentActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) parentActivity;
                if (launchActivity.getActionBarLayout().getLastFragment().getVisibleDialog() != null) {
                    launchActivity.getActionBarLayout().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
                }
            }
            View view = this.parentDialogView;
            if (view != null) {
                view.getLocationOnScreen(this.tempLocation);
                canvas.save();
                int[] iArr = this.tempLocation;
                canvas.translate(iArr[0], iArr[1]);
                this.parentDialogView.draw(canvas);
                canvas.restore();
            }
            Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / 180));
            this.blurBitmapPaint = new Paint(1);
            this.blurBitmap = createBitmap;
        }

        private void animateShow(final boolean z, final Runnable runnable, final Runnable runnable2, final boolean z2) {
            if (this.imageViewEmoji == null) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator = this.showAnimator;
            if (valueAnimator != null) {
                if (this.showing == z) {
                    return;
                }
                valueAnimator.cancel();
            }
            this.showing = z;
            if (z) {
                this.imageViewEmoji.notDraw = true;
            }
            final boolean[] zArr = new boolean[1];
            float[] fArr = new float[2];
            fArr[0] = this.showT;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.showAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog.this.lambda$animateShow$10(z, z2, runnable2, zArr, valueAnimator2);
                }
            });
            this.showAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    Runnable runnable3;
                    SelectStatusDurationDialog.this.showT = z ? 1.0f : 0.0f;
                    AndroidUtilities.lerp(SelectStatusDurationDialog.this.from, SelectStatusDurationDialog.this.f1167to, SelectStatusDurationDialog.this.showT, SelectStatusDurationDialog.this.current);
                    SelectStatusDurationDialog.this.contentView.invalidate();
                    if (!z) {
                        SelectStatusDurationDialog.this.menuView.setAlpha(SelectStatusDurationDialog.this.showT);
                    }
                    if (SelectStatusDurationDialog.this.showT < 0.5f && !z && (runnable3 = runnable2) != null) {
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            runnable3.run();
                        }
                    }
                    if (!z) {
                        if (z2) {
                            SelectStatusDurationDialog.this.imageViewEmoji.notDraw = false;
                            SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
                        }
                        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 4);
                    }
                    SelectStatusDurationDialog.this.showAnimator = null;
                    SelectStatusDurationDialog.this.contentView.invalidate();
                    Runnable runnable4 = runnable;
                    if (runnable4 != null) {
                        runnable4.run();
                    }
                }
            });
            this.showAnimator.setDuration(420L);
            this.showAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.showAnimator.start();
        }

        public void lambda$animateShow$10(boolean z, boolean z2, Runnable runnable, boolean[] zArr, ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.showT = floatValue;
            AndroidUtilities.lerp(this.from, this.f1167to, floatValue, this.current);
            this.contentView.invalidate();
            if (!z) {
                this.menuView.setAlpha(this.showT);
            }
            if (this.showT < 0.025f && !z) {
                if (z2) {
                    this.imageViewEmoji.notDraw = false;
                    SelectAnimatedEmojiDialog.this.emojiGridView.invalidate();
                }
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 4);
            }
            if (this.showT >= 0.5f || z || runnable == null || zArr[0]) {
                return;
            }
            zArr[0] = true;
            runnable.run();
        }

        private void animateMenuShow(final boolean z, final Runnable runnable) {
            ValueAnimator valueAnimator = this.showMenuAnimator;
            if (valueAnimator != null) {
                if (this.showingMenu == z) {
                    return;
                }
                valueAnimator.cancel();
            }
            this.showingMenu = z;
            float[] fArr = new float[2];
            fArr[0] = this.showMenuT;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.showMenuAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SelectAnimatedEmojiDialog.SelectStatusDurationDialog.this.lambda$animateMenuShow$11(valueAnimator2);
                }
            });
            this.showMenuAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SelectStatusDurationDialog.this.showMenuT = z ? 1.0f : 0.0f;
                    SelectStatusDurationDialog.this.menuView.setBackScaleY(SelectStatusDurationDialog.this.showMenuT);
                    SelectStatusDurationDialog.this.menuView.setAlpha(CubicBezierInterpolator.EASE_OUT.getInterpolation(SelectStatusDurationDialog.this.showMenuT));
                    int itemsCount = SelectStatusDurationDialog.this.menuView.getItemsCount();
                    for (int i = 0; i < itemsCount; i++) {
                        float cascade = AndroidUtilities.cascade(SelectStatusDurationDialog.this.showMenuT, i, itemsCount, 4.0f);
                        SelectStatusDurationDialog.this.menuView.getItemAt(i).setTranslationY((1.0f - cascade) * AndroidUtilities.m35dp(-12.0f));
                        SelectStatusDurationDialog.this.menuView.getItemAt(i).setAlpha(cascade);
                    }
                    SelectStatusDurationDialog.this.showMenuAnimator = null;
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
            if (z) {
                this.showMenuAnimator.setDuration(360L);
                this.showMenuAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else {
                this.showMenuAnimator.setDuration(240L);
                this.showMenuAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            }
            this.showMenuAnimator.start();
        }

        public void lambda$animateMenuShow$11(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.showMenuT = floatValue;
            this.menuView.setBackScaleY(floatValue);
            this.menuView.setAlpha(CubicBezierInterpolator.EASE_OUT.getInterpolation(this.showMenuT));
            int itemsCount = this.menuView.getItemsCount();
            for (int i = 0; i < itemsCount; i++) {
                float cascade = AndroidUtilities.cascade(this.showMenuT, i, itemsCount, 4.0f);
                this.menuView.getItemAt(i).setTranslationY((1.0f - cascade) * AndroidUtilities.m35dp(-12.0f));
                this.menuView.getItemAt(i).setAlpha(cascade);
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (dispatchTouchEvent || motionEvent.getAction() != 0) {
                return dispatchTouchEvent;
            }
            dismiss();
            return false;
        }

        @Override
        public void show() {
            super.show();
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 4);
            animateShow(true, null, null, true);
            animateMenuShow(true, null);
        }

        @Override
        public void dismiss() {
            if (this.dismissed) {
                return;
            }
            done(null);
            this.dismissed = true;
        }
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.forumIconDrawable = drawable;
        ImageViewEmoji imageViewEmoji = this.forumIconImage;
        if (imageViewEmoji != null) {
            imageViewEmoji.imageReceiver.setImageBitmap(drawable);
        }
    }

    public void setAnimationsEnabled(boolean z) {
        this.animationsEnabled = z;
    }
}
