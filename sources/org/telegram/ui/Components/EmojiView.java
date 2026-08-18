package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.FeaturedStickerSetInfoCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Cells.StickerSetGroupInfoCell;
import org.telegram.ui.Cells.StickerSetNameCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ListView.RecyclerListViewWithOverlayDraw;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.emojiview.FoundEmojiPacksRecyclerView;
import org.telegram.ui.Components.emojiview.FoundStickerPackButton;
import org.telegram.ui.Components.emojiview.FoundStickerPackButtonContainer;
import org.telegram.ui.Components.emojiview.FoundStickerPackCell;
import org.telegram.ui.Components.emojiview.FoundStickerPacksHeaderCell;
import org.telegram.ui.Components.inset.InAppKeyboardInsetView;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public class EmojiView extends FrameLayout implements FactorAnimator.Target, NotificationCenter.NotificationCenterDelegate, InAppKeyboardInsetView {
    private ArrayList allTabs;
    private boolean allowAnimatedEmoji;
    private boolean allowEmojisForNonPremium;
    private View animateExpandFromButton;
    private int animateExpandFromPosition;
    private long animateExpandStartTime;
    private int animateExpandToPosition;
    private LongSparseArray animatedEmojiDrawables;
    private PorterDuffColorFilter animatedEmojiTextColorFilter;
    private final BoolAnimator animatorSearchEmojiPackSelected;
    private final BoolAnimator animatorSearchStickerPackSelected;
    private ImageView backspaceButton;
    private AnimatorSet backspaceButtonAnimation;
    private boolean backspaceOnce;
    private boolean backspacePressed;
    private final IBlur3Capture blurCaptureMethod;
    private final BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableFactory;
    private final BlurredBackgroundSourceColor blurredBackgroundSourceColor;
    private final BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
    private final RectF blurredRectF;
    private final ArrayList blurredRectList;
    private int bottomInset;
    private FrameLayout bottomTabContainer;
    private View bottomTabContainerBackground;
    private final BoolAnimator bottomTabVisibility;
    private FrameLayout bulletinContainer;
    private FrameLayout bulletinContainer2;
    private Runnable checkExpandStickerTabsRunnable;
    private ChooseStickerActionTracker chooseStickerActionTracker;
    private EmojiColorPickerWindow colorPickerView;
    private ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate;
    public int currentAccount;
    private int currentBackgroundType;
    private long currentChatId;
    private int currentPage;
    private ArrayList currentTabs;
    public boolean customOutline;
    private EmojiViewDelegate delegate;
    private boolean disableStickerEditor;
    private Paint dotPaint;
    private DragListener dragListener;
    private EmojiGridAdapter emojiAdapter;
    private FoundStickerPackButton emojiAddPackButton;
    private FoundStickerPackButtonContainer emojiAddPackButtonContainer;
    boolean emojiBanned;
    public int emojiCacheType;
    private FrameLayout emojiContainer;
    private EmojiGridView emojiGridView;
    private float emojiLastX;
    private float emojiLastY;
    private GridLayoutManager emojiLayoutManager;
    private Drawable emojiLockDrawable;
    private Paint emojiLockPaint;
    private boolean emojiPackAlertOpened;
    EmojiPagesAdapter emojiPagerAdapter;
    private RecyclerAnimationScrollHelper emojiScrollHelper;
    private EmojiSearchAdapter emojiSearchAdapter;
    private SearchField emojiSearchField;
    private FoundStickerPacksHeaderCell emojiSearchHeader;
    private int emojiSize;
    private boolean emojiSmoothScrolling;
    private AnimatorSet emojiTabShadowAnimator;
    private EmojiTabsStrip emojiTabs;
    private View emojiTabsShadow;
    private String[] emojiTitles;
    private ImageViewEmoji emojiTouchedView;
    private float emojiTouchedX;
    private float emojiTouchedY;
    private ArrayList emojipacksProcessed;
    private boolean expandStickersByDragg;
    private ArrayList expandedEmojiSets;
    private final GradientDrawable fadeDrawable;
    private int favTabNum;
    private ArrayList favouriteStickers;
    private ArrayList featuredEmojiSets;
    private ArrayList featuredStickerSets;
    private boolean firstEmojiAttach;
    private boolean firstGifAttach;
    private boolean firstStickersAttach;
    private boolean firstTabUpdate;
    public boolean fixBottomTabContainerTranslation;
    private boolean forseMultiwindowLayout;
    private BaseFragment fragment;
    private boolean frozen;
    ArrayList frozenStickerSets;
    private GifAdapter gifAdapter;
    private final Map gifCache;
    private FrameLayout gifContainer;
    private int gifFirstEmojiTabNum;
    private RecyclerListView gifGridView;
    private Drawable[] gifIcons;
    private GifLayoutManager gifLayoutManager;
    private RecyclerListView.OnItemClickListener gifOnItemClickListener;
    private int gifRecentTabNum;
    private GifAdapter gifSearchAdapter;
    private SearchField gifSearchField;
    private GifSearchPreloader gifSearchPreloader;
    private ScrollSlidingTabStrip gifTabs;
    private int gifTrendingTabNum;
    private boolean glassDesign;
    private int groupStickerPackNum;
    private int groupStickerPackPosition;
    private TLRPC.TL_messages_stickerSet groupStickerSet;
    private boolean groupStickersHidden;
    private boolean hasChatStickers;
    private int hasRecentEmoji;
    private Runnable hideStickersBan;
    private boolean ignorePagerScroll;
    private boolean ignoreStickersScroll;
    private TLRPC.ChatFull info;
    public ArrayList installedEmojiSets;
    private LongSparseArray installingStickerSets;
    private boolean isLayout;
    public boolean isNewHeightControl;
    private ArrayList keepFeaturedDuplicate;
    private float lastBottomScrollDy;
    private int lastFadeColor;
    private int lastNotifyWidth;
    private ArrayList lastRecentArray;
    private int lastRecentCount;
    private String[] lastSearchKeyboardLanguage;
    private float lastStickersX;
    private int[] location;
    private boolean mForceHideBackspaceButton;
    private boolean mForceHideSettingsButton;
    private TextView mediaBanTooltip;
    private final Paint navbarFillPaint;
    private boolean needEmojiSearch;
    private Object outlineProvider;
    private ViewPager pager;
    private boolean premiumBulletin;
    private ArrayList premiumStickers;
    private int premiumTabNum;
    private TLRPC.StickerSetCovered[] primaryInstallingStickerSets;
    private ArrayList recentGifs;
    private ArrayList recentStickers;
    private int recentTabNum;
    Rect rect;
    private LongSparseArray removingStickerSets;
    private final Theme.ResourcesProvider resourcesProvider;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private AnimatorSet searchAnimation;
    private ImageView searchButton;
    private int searchFieldHeight;
    private Drawable searchIconDotDrawable;
    private Drawable searchIconDrawable;
    private boolean shouldDrawBackground;
    public boolean shouldDrawStickerSettings;
    public boolean shouldLightenBackground;
    private boolean showGifs;
    private AnimatorSet showStickersBanAnimator;
    private boolean showing;
    private long shownBottomTabAfterClick;
    private FoundStickerPackButton stickerAddPackButton;
    private FoundStickerPackButtonContainer stickerAddPackButtonContainer;
    private Drawable[] stickerIcons;
    private FoundStickerPacksHeaderCell stickerSearchHeader;
    private ArrayList stickerSets;
    private ImageView stickerSettingsButton;
    boolean stickersBanned;
    private AnimatorSet stickersButtonAnimation;
    private FrameLayout stickersContainer;
    private boolean stickersContainerAttached;
    private StickersGridAdapter stickersGridAdapter;
    private RecyclerListView stickersGridView;
    private GridLayoutManager stickersLayoutManager;
    private RecyclerListView.OnItemClickListener stickersOnItemClickListener;
    private RecyclerAnimationScrollHelper stickersScrollHelper;
    private SearchField stickersSearchField;
    private StickersSearchGridAdapter stickersSearchGridAdapter;
    private ScrollSlidingTabStrip stickersTab;
    private FrameLayout stickersTabContainer;
    private int stickersTabOffset;
    private Drawable[] tabIcons;
    private final int[] tabsMinusDy;
    private ObjectAnimator[] tabsYAnimators;
    private HashMap toInstall;
    private TrendingAdapter trendingAdapter;
    private TrendingAdapter trendingEmojiAdapter;
    private int trendingTabNum;
    private PagerSlidingTabStrip typeTabs;
    private Runnable updateStickersLoadedDelayed;
    private float visibleInAppKeyboardHeight;

    public interface DragListener {
        void onDrag(int i);

        void onDragCancel();

        void onDragEnd(float f);

        void onDragStart();
    }

    public static class EmojiPack {
        public ArrayList documents = new ArrayList();
        public boolean expanded;
        public boolean featured;
        public boolean forGroup;
        public boolean free;
        public int index;
        public boolean installed;
        public TLRPC.InputStickerSet needLoadSet;
        public int resId;
        public TLRPC.StickerSet set;
        public Long thumbDocumentId;
    }

    public interface EmojiViewDelegate {

        public abstract class CC {
            public static boolean $default$canAddCaptionToGif(EmojiViewDelegate emojiViewDelegate, TLRPC.Document document) {
                return false;
            }

            public static boolean $default$canSchedule(EmojiViewDelegate emojiViewDelegate) {
                return false;
            }

            public static long $default$getDialogId(EmojiViewDelegate emojiViewDelegate) {
                return 0L;
            }

            public static float $default$getProgressToSearchOpened(EmojiViewDelegate emojiViewDelegate) {
                return 0.0f;
            }

            public static int $default$getThreadId(EmojiViewDelegate emojiViewDelegate) {
                return 0;
            }

            public static void $default$invalidateEnterView(EmojiViewDelegate emojiViewDelegate) {
            }

            public static boolean $default$isExpanded(EmojiViewDelegate emojiViewDelegate) {
                return false;
            }

            public static boolean $default$isInScheduleMode(EmojiViewDelegate emojiViewDelegate) {
                return false;
            }

            public static boolean $default$isSearchOpened(EmojiViewDelegate emojiViewDelegate) {
                return false;
            }

            public static boolean $default$isUserSelf(EmojiViewDelegate emojiViewDelegate) {
                return false;
            }

            public static void $default$onAnimatedEmojiUnlockClick(EmojiViewDelegate emojiViewDelegate) {
            }

            public static boolean $default$onBackspace(EmojiViewDelegate emojiViewDelegate) {
                return false;
            }

            public static void $default$onClearEmojiRecent(EmojiViewDelegate emojiViewDelegate) {
            }

            public static void $default$onEmojiSelected(EmojiViewDelegate emojiViewDelegate, String str) {
            }

            public static void $default$onEmojiSettingsClick(EmojiViewDelegate emojiViewDelegate, ArrayList arrayList) {
            }

            public static void $default$onGifSelected(EmojiViewDelegate emojiViewDelegate, View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            }

            public static void $default$onGifSelectedForAddCaption(EmojiViewDelegate emojiViewDelegate, View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            }

            public static void $default$onSearchOpenClose(EmojiViewDelegate emojiViewDelegate, int i) {
            }

            public static void $default$onShowStickerSet(EmojiViewDelegate emojiViewDelegate, TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
            }

            public static void $default$onStickerSelected(EmojiViewDelegate emojiViewDelegate, View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2) {
            }

            public static void $default$onStickerSetAdd(EmojiViewDelegate emojiViewDelegate, TLRPC.StickerSetCovered stickerSetCovered) {
            }

            public static void $default$onStickerSetRemove(EmojiViewDelegate emojiViewDelegate, TLRPC.StickerSetCovered stickerSetCovered) {
            }

            public static void $default$onStickersGroupClick(EmojiViewDelegate emojiViewDelegate, long j) {
            }

            public static void $default$onStickersSettingsClick(EmojiViewDelegate emojiViewDelegate) {
            }

            public static void $default$onTabOpened(EmojiViewDelegate emojiViewDelegate, int i) {
            }

            public static void $default$showTrendingStickersAlert(EmojiViewDelegate emojiViewDelegate, TrendingStickersLayout trendingStickersLayout) {
            }
        }

        boolean canAddCaptionToGif(TLRPC.Document document);

        boolean canSchedule();

        long getDialogId();

        float getProgressToSearchOpened();

        int getThreadId();

        void invalidateEnterView();

        boolean isExpanded();

        boolean isInScheduleMode();

        boolean isSearchOpened();

        boolean isUserSelf();

        void onAnimatedEmojiUnlockClick();

        boolean onBackspace();

        void onClearEmojiRecent();

        void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z);

        void onEmojiSelected(String str);

        void onEmojiSettingsClick(ArrayList arrayList);

        void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2);

        void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z, int i, int i2);

        void onSearchOpenClose(int i);

        void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z);

        void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2);

        void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered);

        void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered);

        void onStickersGroupClick(long j);

        void onStickersSettingsClick();

        void onTabOpened(int i);

        void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout);
    }

    interface SearchRunnable extends Runnable {
        boolean isCompleted();

        boolean isLoading();

        void loadNext();
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    public void setAllow(boolean z, boolean z2, boolean z3) {
        setAllow(true, z, z2, z3);
    }

    public void setAllow(boolean z, boolean z2, boolean z3, boolean z4) {
        this.currentTabs.clear();
        for (int i = 0; i < this.allTabs.size(); i++) {
            if (((Tab) this.allTabs.get(i)).type == 0 && z) {
                this.currentTabs.add((Tab) this.allTabs.get(i));
            }
            if (((Tab) this.allTabs.get(i)).type == 1 && z3) {
                this.currentTabs.add((Tab) this.allTabs.get(i));
            }
            if (((Tab) this.allTabs.get(i)).type == 2 && z2) {
                this.currentTabs.add((Tab) this.allTabs.get(i));
            }
        }
        PagerSlidingTabStrip pagerSlidingTabStrip = this.typeTabs;
        if (pagerSlidingTabStrip != null) {
            AndroidUtilities.updateViewVisibilityAnimated(pagerSlidingTabStrip, this.currentTabs.size() > 1, 1.0f, z4);
        }
        ViewPager viewPager = this.pager;
        if (viewPager != null) {
            viewPager.setAdapter(null);
            this.pager.setAdapter(this.emojiPagerAdapter);
            PagerSlidingTabStrip pagerSlidingTabStrip2 = this.typeTabs;
            if (pagerSlidingTabStrip2 != null) {
                pagerSlidingTabStrip2.setViewPager(this.pager);
            }
        }
    }

    public void allowEmojisForNonPremium(boolean z) {
        this.allowEmojisForNonPremium = z;
    }

    public void setShouldDrawBackground(boolean z) {
        if (this.shouldDrawBackground != z) {
            this.shouldDrawBackground = z;
            updateColors();
        }
    }

    class AnonymousClass2 implements ContentPreviewViewer.ContentPreviewViewerDelegate {
        @Override
        public void addToFavoriteSelected(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addToFavoriteSelected(this, str);
        }

        @Override
        public boolean canDeleteSticker(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canDeleteSticker(this, document);
        }

        @Override
        public boolean canEditSticker() {
            return true;
        }

        @Override
        public boolean canSendSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSendSticker(this);
        }

        @Override
        public ItemOptions getCustomItemOptions(ViewGroup viewGroup, View view) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getCustomItemOptions(this, viewGroup, view);
        }

        @Override
        public TLRPC.TL_messageMediaPoll getPoll() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPoll(this);
        }

        @Override
        public TLRPC.PollAnswer getPollAnswer() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPollAnswer(this);
        }

        @Override
        public MessageObject getPollMessageObject() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPollMessageObject(this);
        }

        @Override
        public boolean isPhotoEditor() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isPhotoEditor(this);
        }

        @Override
        public boolean isReplacedSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isReplacedSticker(this);
        }

        @Override
        public boolean isSettingIntroSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isSettingIntroSticker(this);
        }

        @Override
        public boolean isStickerEditor() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isStickerEditor(this);
        }

        @Override
        public boolean needCopy(TLRPC.Document document) {
            return true;
        }

        @Override
        public boolean needMenu() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needMenu(this);
        }

        @Override
        public boolean needOpen() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needOpen(this);
        }

        @Override
        public boolean needRemove() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemove(this);
        }

        @Override
        public void newStickerPackSelected(CharSequence charSequence, String str, Utilities.Callback callback) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$newStickerPackSelected(this, charSequence, str, callback);
        }

        @Override
        public void remove(SendMessagesHelper.ImportingSticker importingSticker) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$remove(this, importingSticker);
        }

        @Override
        public void retractVote() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$retractVote(this);
        }

        @Override
        public void sendSticker(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this, str);
        }

        @Override
        public void sendVote() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendVote(this);
        }

        @Override
        public void setIntroSticker(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setIntroSticker(this, str);
        }

        @Override
        public void stickerSetSelected(TLRPC.StickerSet stickerSet, String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$stickerSetSelected(this, stickerSet, str);
        }

        AnonymousClass2() {
        }

        @Override
        public boolean can() {
            return (EmojiView.this.fragment == null && EmojiView.this.shouldDrawBackground) ? false : true;
        }

        @Override
        public void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
            EmojiView.this.delegate.onStickerSelected(null, document, str, obj, null, z, i, 0);
        }

        @Override
        public void resetTouch() {
            if (EmojiView.this.emojiGridView != null) {
                EmojiView.this.emojiGridView.clearAllTouches();
            }
        }

        @Override
        public void sendEmoji(TLRPC.Document document) {
            if (EmojiView.this.fragment instanceof ChatActivity) {
                ((ChatActivity) EmojiView.this.fragment).sendAnimatedEmoji(document, true, 0);
            }
        }

        @Override
        public void setAsEmojiStatus(TLRPC.Document document, Integer num) {
            TLRPC.EmojiStatus tL_emojiStatusEmpty;
            if (document == null) {
                tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = document.id;
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                tL_emojiStatusEmpty = tL_emojiStatus;
            }
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            final TLRPC.EmojiStatus tL_emojiStatusEmpty2 = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
            MessagesController.getInstance(EmojiView.this.currentAccount).updateEmojiStatus(tL_emojiStatusEmpty);
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setAsEmojiStatus$0(tL_emojiStatusEmpty2);
                }
            };
            if (document == null) {
                Bulletin.SimpleLayout simpleLayout = new Bulletin.SimpleLayout(EmojiView.this.getContext(), EmojiView.this.resourcesProvider);
                simpleLayout.textView.setText(LocaleController.getString(R.string.RemoveStatusInfo));
                simpleLayout.imageView.setImageResource(R.drawable.msg_settings_premium);
                simpleLayout.imageView.setScaleX(0.8f);
                simpleLayout.imageView.setScaleY(0.8f);
                simpleLayout.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_verifiedBackground, EmojiView.this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                Bulletin.UndoButton undoButton = new Bulletin.UndoButton(EmojiView.this.getContext(), true, EmojiView.this.resourcesProvider);
                undoButton.setUndoAction(runnable);
                simpleLayout.setButton(undoButton);
                if (EmojiView.this.fragment != null) {
                    Bulletin.make(EmojiView.this.fragment, simpleLayout, 1500).show();
                    return;
                } else {
                    Bulletin.make(EmojiView.this.bulletinContainer, simpleLayout, 1500).show();
                    return;
                }
            }
            (EmojiView.this.fragment != null ? BulletinFactory.of(EmojiView.this.fragment) : BulletinFactory.of(EmojiView.this.bulletinContainer, EmojiView.this.resourcesProvider)).createEmojiBulletin(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), runnable).show();
        }

        public void lambda$setAsEmojiStatus$0(TLRPC.EmojiStatus emojiStatus) {
            MessagesController.getInstance(EmojiView.this.currentAccount).updateEmojiStatus(emojiStatus);
        }

        @Override
        public void copyEmoji(TLRPC.Document document) {
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
            spannableStringBuilderValueOf.setSpan(new AnimatedEmojiSpan(document, (Paint.FontMetricsInt) null), 0, spannableStringBuilderValueOf.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableStringBuilderValueOf)) {
                (EmojiView.this.fragment != null ? BulletinFactory.of(EmojiView.this.fragment) : BulletinFactory.of(EmojiView.this.bulletinContainer, EmojiView.this.resourcesProvider)).createCopyBulletin(LocaleController.getString(R.string.EmojiCopied)).show();
            }
        }

        @Override
        public boolean needRemoveFromRecent(TLRPC.Document document) {
            if (document != null) {
                if (Emoji.recentEmoji.contains("animated_" + document.id)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public void removeFromRecent(TLRPC.Document document) {
            if (document != null) {
                Emoji.removeRecentEmoji("animated_" + document.id);
                if (EmojiView.this.emojiAdapter != null) {
                    EmojiView.this.emojiAdapter.notifyDataSetChanged();
                }
            }
        }

        @Override
        public Boolean canSetAsStatus(TLRPC.Document document) {
            TLRPC.User currentUser;
            if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
                return null;
            }
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
            return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
        }

        @Override
        public boolean needSend(int i) {
            if (i != 2) {
                return true;
            }
            if ((EmojiView.this.fragment instanceof ChatActivity) && ((ChatActivity) EmojiView.this.fragment).canSendMessage()) {
                if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    return true;
                }
                if (((ChatActivity) EmojiView.this.fragment).getCurrentUser() != null && UserObject.isUserSelf(((ChatActivity) EmojiView.this.fragment).getCurrentUser())) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public void editSticker(TLRPC.Document document) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                    StickersAlert.editSticker(EmojiView.this.fragment, MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet(inputStickerSet, true), document);
                }
            }
            TLRPC.InputStickerSet inputStickerSet = null;
            StickersAlert.editSticker(EmojiView.this.fragment, MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet(inputStickerSet, true), document);
        }

        @Override
        public boolean canSchedule() {
            return EmojiView.this.delegate.canSchedule();
        }

        @Override
        public boolean isInScheduleMode() {
            return EmojiView.this.delegate.isInScheduleMode();
        }

        @Override
        public void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
            if (inputStickerSet == null) {
                return;
            }
            EmojiView.this.delegate.onShowStickerSet(null, inputStickerSet, false);
        }

        @Override
        public void sendGif(Object obj, Object obj2, boolean z, int i, int i2) {
            if (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifAdapter) {
                EmojiView.this.delegate.onGifSelected(null, obj, null, obj2, z, i, i2);
            } else if (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifSearchAdapter) {
                EmojiView.this.delegate.onGifSelected(null, obj, null, obj2, z, i, i2);
            }
        }

        @Override
        public boolean canAddCaption(TLRPC.Document document) {
            return EmojiView.this.delegate.canAddCaptionToGif(document);
        }

        @Override
        public void addCaptionToGif(Object obj, Object obj2, boolean z, int i, int i2) {
            if (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifAdapter || EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifSearchAdapter) {
                EmojiView.this.delegate.onGifSelectedForAddCaption(null, obj, null, obj2, z, i, i2);
            }
        }

        @Override
        public void gifAddedOrDeleted() {
            EmojiView.this.updateRecentGifs();
        }

        @Override
        public long getDialogId() {
            return EmojiView.this.delegate.getDialogId();
        }

        @Override
        public String getQuery(boolean z) {
            if (z) {
                if (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifSearchAdapter) {
                    return EmojiView.this.gifSearchAdapter.lastSearchImageString;
                }
                return null;
            }
            if (EmojiView.this.emojiGridView.getAdapter() == EmojiView.this.emojiSearchAdapter) {
                return EmojiView.this.emojiSearchAdapter.lastSearchEmojiString;
            }
            return null;
        }

        @Override
        public void deleteSticker(TLRPC.Document document) {
            TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
            tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
            ConnectionsManager.getInstance(EmojiView.this.currentAccount).sendRequest(tL_stickers_removeStickerFromSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$deleteSticker$2(tLObject, tL_error);
                }
            });
        }

        public void lambda$deleteSticker$2(final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$deleteSticker$1(tLObject);
                }
            });
        }

        public void lambda$deleteSticker$1(TLObject tLObject) {
            if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                MediaDataController.getInstance(EmojiView.this.currentAccount).putStickerSet(tL_messages_stickerSet);
                MediaDataController.getInstance(EmojiView.this.currentAccount).replaceStickerSet(tL_messages_stickerSet);
            }
        }
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        SearchField searchField = this.stickersSearchField;
        if (searchField != null) {
            searchField.searchEditText.setEnabled(z);
        }
        SearchField searchField2 = this.gifSearchField;
        if (searchField2 != null) {
            searchField2.searchEditText.setEnabled(z);
        }
        SearchField searchField3 = this.emojiSearchField;
        if (searchField3 != null) {
            searchField3.searchEditText.setEnabled(z);
        }
    }

    class SearchField extends FrameLayout implements FactorAnimator.Target {
        private final BoolAnimator animatorShadowVisibility;
        private View backgroundView;
        private FrameLayout box;
        private StickerCategoriesListView categoriesListView;
        private ImageView clear;
        private Runnable delayedToggle;
        private FrameLayout inputBox;
        private View inputBoxGradient;
        private float inputBoxGradientAlpha;
        ValueAnimator inputBoxGradientAnimator;
        private boolean inputBoxShown;
        private boolean isprogress;
        private StickerCategoriesListView.EmojiCategory recent;
        private EditTextBoldCursor searchEditText;
        private ImageView searchImageView;
        private SearchStateDrawable searchStateDrawable;
        private View shadowView;
        private StickerCategoriesListView.EmojiCategory trending;
        private int type;

        @Override
        public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
            FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
        }

        public SearchField(Context context, final int i) {
            super(context);
            this.animatorShadowVisibility = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT, 200L);
            this.inputBoxShown = false;
            this.type = i;
            View view = new View(context);
            this.shadowView = view;
            view.setVisibility(4);
            this.shadowView.setBackgroundColor(EmojiView.this.getThemedColor(Theme.key_chat_emojiPanelShadowLine));
            addView(this.shadowView, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
            this.backgroundView = new View(context);
            if (EmojiView.this.shouldDrawBackground) {
                this.backgroundView.setBackgroundColor(EmojiView.this.getThemedColor(Theme.key_chat_emojiPanelBackground));
            }
            addView(this.backgroundView, new FrameLayout.LayoutParams(-1, EmojiView.this.searchFieldHeight));
            FrameLayout frameLayout = new FrameLayout(context);
            this.box = frameLayout;
            frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), EmojiView.this.glassDesign ? EmojiView.this.getGlassIconColor(0.06f) : EmojiView.this.getThemedColor(Theme.key_chat_emojiSearchBackground)));
            this.box.setClipToOutline(true);
            this.box.setOutlineProvider(ViewOutlineProviderImpl.boundsWithPaddingRoundRect(0, AndroidUtilities.dp(18.0f)));
            if (i == 2) {
                addView(this.box, LayoutHelper.createFrame(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
            } else {
                addView(this.box, LayoutHelper.createFrame(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
            }
            FrameLayout frameLayout2 = new FrameLayout(context) {
                Paint fadePaint;

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    if (!EmojiView.this.shouldDrawBackground && SearchField.this.inputBoxGradientAlpha > 0.0f) {
                        if (this.fadePaint == null) {
                            Paint paint = new Paint();
                            this.fadePaint = paint;
                            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                            this.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        }
                        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                        super.dispatchDraw(canvas);
                        this.fadePaint.setAlpha((int) (SearchField.this.inputBoxGradientAlpha * 255.0f));
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), this.fadePaint);
                        canvas.restore();
                        return;
                    }
                    super.dispatchDraw(canvas);
                }
            };
            this.inputBox = frameLayout2;
            this.box.addView(frameLayout2, LayoutHelper.createFrame(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
            this.searchImageView = new ImageView(context);
            SearchStateDrawable searchStateDrawable = new SearchStateDrawable();
            this.searchStateDrawable = searchStateDrawable;
            searchStateDrawable.setIconState(0, false);
            this.searchStateDrawable.setColor(EmojiView.this.glassDesign ? EmojiView.this.getGlassIconColor(0.4f) : EmojiView.this.getThemedColor(Theme.key_chat_emojiSearchIcon));
            ImageView imageView = this.searchImageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            this.searchImageView.setImageDrawable(this.searchStateDrawable);
            this.searchImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$new$0(view2);
                }
            });
            this.box.addView(this.searchImageView, LayoutHelper.createFrame(36, 36, 51));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (!SearchField.this.searchEditText.isEnabled()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (motionEvent.getAction() == 0) {
                        if (!EmojiView.this.delegate.isSearchOpened()) {
                            SearchField searchField = SearchField.this;
                            EmojiView.this.openSearch(searchField);
                        }
                        EmojiView.this.delegate.onSearchOpenClose(i == 1 ? 2 : 1);
                        SearchField.this.searchEditText.requestFocus();
                        AndroidUtilities.showKeyboard(SearchField.this.searchEditText);
                    }
                    return super.onTouchEvent(motionEvent);
                }
            };
            this.searchEditText = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 16.0f);
            this.searchEditText.setHintTextColor(EmojiView.this.glassDesign ? EmojiView.this.getGlassIconColor(0.45f) : EmojiView.this.getThemedColor(Theme.key_chat_emojiSearchIcon));
            this.searchEditText.setTextColor(EmojiView.this.glassDesign ? EmojiView.this.getGlassIconColor(0.8f) : EmojiView.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.searchEditText.setBackgroundDrawable(null);
            this.searchEditText.setPadding(0, 0, 0, 0);
            this.searchEditText.setMaxLines(1);
            this.searchEditText.setLines(1);
            this.searchEditText.setSingleLine(true);
            this.searchEditText.setImeOptions(268435459);
            this.searchEditText.setHint(LocaleController.getString(R.string.Search));
            this.searchEditText.setCursorColor(EmojiView.this.getThemedColor(Theme.key_featuredStickers_addedIcon));
            this.searchEditText.setCursorSize(AndroidUtilities.dp(20.0f));
            this.searchEditText.setCursorWidth(1.5f);
            this.searchEditText.setTranslationY(AndroidUtilities.dp(-2.0f));
            this.inputBox.addView(this.searchEditText, LayoutHelper.createFrame(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
            this.searchEditText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    SearchField.this.updateButton();
                    String string = SearchField.this.searchEditText.getText().toString();
                    SearchField.this.search(string, true);
                    if (SearchField.this.categoriesListView != null) {
                        SearchField.this.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                        SearchField.this.categoriesListView.updateCategoriesShown(TextUtils.isEmpty(string), true);
                    }
                    SearchField.this.toggleClear(!TextUtils.isEmpty(string));
                    if (SearchField.this.searchEditText != null) {
                        SearchField.this.searchEditText.clearAnimation();
                        SearchField.this.searchEditText.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                    }
                    SearchField.this.showInputBoxGradient(false);
                }
            });
            if (EmojiView.this.shouldDrawBackground) {
                this.inputBoxGradient = new View(context);
                Drawable drawableMutate = context.getResources().getDrawable(R.drawable.gradient_right).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.blendOver(EmojiView.this.getThemedColor(Theme.key_chat_emojiPanelBackground), EmojiView.this.getThemedColor(Theme.key_chat_emojiSearchBackground)), PorterDuff.Mode.MULTIPLY));
                this.inputBoxGradient.setBackground(drawableMutate);
                this.inputBoxGradient.setAlpha(0.0f);
                this.inputBox.addView(this.inputBoxGradient, LayoutHelper.createFrame(18, -1, 3));
            }
            ImageView imageView2 = new ImageView(context);
            this.clear = imageView2;
            imageView2.setScaleType(scaleType);
            this.clear.setImageDrawable(new CloseProgressDrawable2(1.25f) {
                {
                    setSide(AndroidUtilities.dp(7.0f));
                }

                @Override
                protected int getCurrentColor() {
                    return Theme.getColor(Theme.key_chat_emojiSearchIcon, EmojiView.this.resourcesProvider);
                }
            });
            this.clear.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, EmojiView.this.resourcesProvider), 1, AndroidUtilities.dp(15.0f)));
            this.clear.setAlpha(0.0f);
            this.clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$new$1(view2);
                }
            });
            this.box.addView(this.clear, LayoutHelper.createFrame(36, 36, 53));
            if (i != 1 || (EmojiView.this.allowAnimatedEmoji && UserConfig.getInstance(UserConfig.selectedAccount).isPremium())) {
                StickerCategoriesListView stickerCategoriesListView = new StickerCategoriesListView(context, null, i != 0 ? 0 : 3, EmojiView.this.resourcesProvider) {
                    @Override
                    public void selectCategory(int i2) {
                        super.selectCategory(i2);
                        SearchField searchField = SearchField.this;
                        EmojiView.this.showBottomTab(searchField.categoriesListView.getSelectedCategory() == null, true);
                        if (i == 1 && EmojiView.this.emojiTabs != null) {
                            EmojiView.this.emojiTabs.showSelected(SearchField.this.categoriesListView.getSelectedCategory() == null);
                        } else if (i == 0 && EmojiView.this.stickersTab != null) {
                            EmojiView.this.stickersTab.showSelected(SearchField.this.categoriesListView.getSelectedCategory() == null);
                        }
                        SearchField.this.updateButton();
                    }

                    @Override
                    protected boolean isTabIconsAnimationEnabled(boolean z) {
                        return LiteMode.isEnabled(8200);
                    }
                };
                this.categoriesListView = stickerCategoriesListView;
                stickerCategoriesListView.isGlassDesign = EmojiView.this.glassDesign;
                this.categoriesListView.setDontOccupyWidth(((int) this.searchEditText.getPaint().measureText(((Object) this.searchEditText.getHint()) + "")) + AndroidUtilities.dp(16.0f));
                if (EmojiView.this.shouldDrawBackground) {
                    this.categoriesListView.setBackgroundColor(Theme.blendOver(EmojiView.this.getThemedColor(Theme.key_chat_emojiPanelBackground), EmojiView.this.getThemedColor(Theme.key_chat_emojiSearchBackground)));
                }
                this.categoriesListView.setOnScrollIntoOccupiedWidth(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$new$2((Integer) obj);
                    }
                });
                this.categoriesListView.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view2, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            EmojiView.this.ignorePagerScroll = true;
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            EmojiView.this.ignorePagerScroll = false;
                        }
                        return false;
                    }
                });
                this.categoriesListView.setOnCategoryClick(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$new$3((StickerCategoriesListView.EmojiCategory) obj);
                    }
                });
                this.box.addView(this.categoriesListView, LayoutHelper.createFrame(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
            }
        }

        public void lambda$new$0(View view) {
            if (this.searchStateDrawable.getIconState() == 1) {
                this.searchEditText.setText("");
                search(null, false);
                StickerCategoriesListView stickerCategoriesListView = this.categoriesListView;
                if (stickerCategoriesListView != null) {
                    stickerCategoriesListView.scrollToStart();
                    this.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                    this.categoriesListView.updateCategoriesShown(true, true);
                }
                toggleClear(false);
                EditTextBoldCursor editTextBoldCursor = this.searchEditText;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.clearAnimation();
                    this.searchEditText.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                }
                showInputBoxGradient(false);
            }
        }

        public void lambda$new$1(View view) {
            this.searchEditText.setText("");
            search(null, false);
            StickerCategoriesListView stickerCategoriesListView = this.categoriesListView;
            if (stickerCategoriesListView != null) {
                stickerCategoriesListView.scrollToStart();
                this.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                this.categoriesListView.updateCategoriesShown(true, true);
            }
            toggleClear(false);
            EditTextBoldCursor editTextBoldCursor = this.searchEditText;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.clearAnimation();
                this.searchEditText.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
            showInputBoxGradient(false);
        }

        public void lambda$new$2(Integer num) {
            this.searchEditText.setTranslationX(-Math.max(0, num.intValue()));
            showInputBoxGradient(num.intValue() > 0);
            updateButton();
        }

        public void lambda$new$3(StickerCategoriesListView.EmojiCategory emojiCategory) {
            if (emojiCategory == this.recent) {
                showInputBoxGradient(false);
                this.categoriesListView.selectCategory(this.recent);
                EmojiView.this.gifSearchField.searchEditText.setText("");
                EmojiView.this.gifLayoutManager.scrollToPositionWithOffset(0, 0);
                return;
            }
            if (emojiCategory == this.trending) {
                showInputBoxGradient(false);
                EmojiView.this.gifSearchField.searchEditText.setText("");
                EmojiView.this.gifLayoutManager.scrollToPositionWithOffset(EmojiView.this.gifAdapter.trendingSectionItem, -AndroidUtilities.dp(4.0f));
                this.categoriesListView.selectCategory(this.trending);
                ArrayList<String> arrayList = MessagesController.getInstance(EmojiView.this.currentAccount).gifSearchEmojies;
                if (arrayList.isEmpty()) {
                    return;
                }
                EmojiView.this.gifSearchPreloader.preload(arrayList.get(0));
                return;
            }
            if (this.categoriesListView.getSelectedCategory() == emojiCategory) {
                search(null, false);
                this.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
            } else {
                search(emojiCategory.emojis, false);
                this.categoriesListView.selectCategory(emojiCategory);
            }
        }

        public boolean isCategorySelected() {
            StickerCategoriesListView stickerCategoriesListView = this.categoriesListView;
            return (stickerCategoriesListView == null || stickerCategoriesListView.getSelectedCategory() == null) ? false : true;
        }

        public void search(String str, boolean z) {
            int i = this.type;
            if (i == 0) {
                EmojiView.this.stickersSearchGridAdapter.search(str, z);
            } else if (i == 1) {
                EmojiView.this.emojiSearchAdapter.search(str, z);
            } else if (i == 2) {
                EmojiView.this.gifSearchAdapter.search(str, z);
            }
        }

        public void showInputBoxGradient(boolean z) {
            if (z == this.inputBoxShown) {
                return;
            }
            this.inputBoxShown = z;
            ValueAnimator valueAnimator = this.inputBoxGradientAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.inputBoxGradientAlpha, z ? 1.0f : 0.0f);
            this.inputBoxGradientAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$showInputBoxGradient$4(valueAnimator2);
                }
            });
            this.inputBoxGradientAnimator.setDuration(120L);
            this.inputBoxGradientAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.inputBoxGradientAnimator.start();
        }

        public void lambda$showInputBoxGradient$4(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.inputBoxGradientAlpha = fFloatValue;
            View view = this.inputBoxGradient;
            if (view != null) {
                view.setAlpha(fFloatValue);
                return;
            }
            FrameLayout frameLayout = this.inputBox;
            if (frameLayout != null) {
                frameLayout.invalidate();
            }
        }

        public boolean isInProgress() {
            return this.isprogress;
        }

        public void toggleClear(boolean z) {
            if (z) {
                if (this.delayedToggle == null) {
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$toggleClear$5();
                        }
                    };
                    this.delayedToggle = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 340L);
                    return;
                }
                return;
            }
            Runnable runnable2 = this.delayedToggle;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                this.delayedToggle = null;
            }
            AndroidUtilities.updateViewShow(this.clear, false);
        }

        public void lambda$toggleClear$5() {
            AndroidUtilities.updateViewShow(this.clear, true);
        }

        public void showProgress(boolean z) {
            this.isprogress = z;
            if (z) {
                this.searchStateDrawable.setIconState(2);
            } else {
                updateButton(true);
            }
        }

        public void updateButton() {
            updateButton(false);
        }

        private void updateButton(boolean z) {
            StickerCategoriesListView stickerCategoriesListView;
            StickerCategoriesListView stickerCategoriesListView2;
            if (!isInProgress() || ((this.searchEditText.length() == 0 && ((stickerCategoriesListView2 = this.categoriesListView) == null || stickerCategoriesListView2.getSelectedCategory() == null)) || z)) {
                this.searchStateDrawable.setIconState((this.searchEditText.length() > 0 || ((stickerCategoriesListView = this.categoriesListView) != null && stickerCategoriesListView.isCategoriesShown() && (this.categoriesListView.isScrolledIntoOccupiedWidth() || this.categoriesListView.getSelectedCategory() != null))) ? 1 : 0);
                this.isprogress = false;
            }
        }

        public void hideKeyboard() {
            AndroidUtilities.hideKeyboard(this.searchEditText);
        }

        public void showShadow(boolean z, boolean z2) {
            this.animatorShadowVisibility.setValue(z, z2);
        }

        @Override
        public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            if (i == 0) {
                this.shadowView.setAlpha(f);
                this.shadowView.setVisibility(f > 0.0f ? 0 : 4);
            }
        }
    }

    private class TypedScrollListener extends RecyclerView.OnScrollListener {
        private boolean smoothScrolling;
        private final int type;

        public TypedScrollListener(int i) {
            this.type = i;
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (recyclerView.getLayoutManager().isSmoothScrolling()) {
                this.smoothScrolling = true;
                return;
            }
            if (i == 0) {
                if (!this.smoothScrolling) {
                    EmojiView.this.animateTabsY(this.type);
                }
                if (EmojiView.this.ignoreStickersScroll) {
                    EmojiView.this.ignoreStickersScroll = false;
                }
                this.smoothScrolling = false;
                return;
            }
            if (i == 1) {
                if (EmojiView.this.ignoreStickersScroll) {
                    EmojiView.this.ignoreStickersScroll = false;
                }
                SearchField searchFieldForType = EmojiView.this.getSearchFieldForType(this.type);
                if (searchFieldForType != null) {
                    searchFieldForType.hideKeyboard();
                }
                this.smoothScrolling = false;
            }
            if (!this.smoothScrolling) {
                EmojiView.this.stopAnimatingTabsY(this.type);
            }
            if (this.type == 0) {
                if (EmojiView.this.chooseStickerActionTracker == null) {
                    EmojiView.this.createStickersChooseActionTracker();
                }
                EmojiView.this.chooseStickerActionTracker.doSomeAction();
            }
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            EmojiView.this.checkScroll(this.type);
            EmojiView.this.checkTabsY(this.type, i2);
            checkSearchFieldScroll();
            if (this.smoothScrolling) {
                return;
            }
            EmojiView.this.checkBottomTabScroll(i2);
        }

        private void checkSearchFieldScroll() {
            int i = this.type;
            if (i == 0) {
                EmojiView.this.checkStickersSearchFieldScroll(false);
            } else if (i == 1) {
                EmojiView.this.checkEmojiSearchFieldScroll(false);
            } else {
                if (i != 2) {
                    return;
                }
                EmojiView.this.checkGifSearchFieldScroll(false);
            }
        }
    }

    private class DraggableScrollSlidingTabStrip extends ScrollSlidingTabStrip {
        private float downX;
        private float downY;
        private boolean draggingHorizontally;
        private boolean draggingVertically;
        private boolean first;
        private float lastTranslateX;
        private float lastX;
        private boolean startedScroll;
        private final int touchSlop;
        private VelocityTracker vTracker;

        public DraggableScrollSlidingTabStrip(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider, EmojiView.this.glassDesign);
            this.first = true;
            this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (isDragging()) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 0) {
                this.draggingHorizontally = false;
                this.draggingVertically = false;
                this.downX = motionEvent.getRawX();
                this.downY = motionEvent.getRawY();
            } else if (!this.draggingVertically && !this.draggingHorizontally && EmojiView.this.dragListener != null && Math.abs(motionEvent.getRawY() - this.downY) >= this.touchSlop) {
                this.draggingVertically = true;
                this.downY = motionEvent.getRawY();
                EmojiView.this.dragListener.onDragStart();
                if (this.startedScroll) {
                    EmojiView.this.pager.endFakeDrag();
                    this.startedScroll = false;
                }
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (isDragging()) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.first) {
                this.first = false;
                this.lastX = motionEvent.getX();
            }
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                EmojiView.this.lastStickersX = motionEvent.getRawX();
            }
            if (motionEvent.getAction() == 0) {
                this.draggingHorizontally = false;
                this.draggingVertically = false;
                this.downX = motionEvent.getRawX();
                this.downY = motionEvent.getRawY();
            } else if (!this.draggingVertically && !this.draggingHorizontally && EmojiView.this.dragListener != null) {
                if (Math.abs(motionEvent.getRawX() - this.downX) >= this.touchSlop && canScrollHorizontally((int) (this.downX - motionEvent.getRawX()))) {
                    this.draggingHorizontally = true;
                    AndroidUtilities.cancelRunOnUIThread(EmojiView.this.checkExpandStickerTabsRunnable);
                    EmojiView.this.expandStickersByDragg = true;
                    EmojiView.this.updateStickerTabsPosition();
                } else if (Math.abs(motionEvent.getRawY() - this.downY) >= this.touchSlop) {
                    this.draggingVertically = true;
                    this.downY = motionEvent.getRawY();
                    EmojiView.this.dragListener.onDragStart();
                    if (this.startedScroll) {
                        EmojiView.this.pager.endFakeDrag();
                        this.startedScroll = false;
                    }
                }
            }
            if (EmojiView.this.expandStickersByDragg && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                AndroidUtilities.runOnUIThread(EmojiView.this.checkExpandStickerTabsRunnable, 1500L);
            }
            if (this.draggingVertically) {
                if (this.vTracker == null) {
                    this.vTracker = VelocityTracker.obtain();
                }
                this.vTracker.addMovement(motionEvent);
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    EmojiView.this.dragListener.onDrag(Math.round(motionEvent.getRawY() - this.downY));
                } else {
                    this.vTracker.computeCurrentVelocity(1000);
                    float yVelocity = this.vTracker.getYVelocity();
                    this.vTracker.recycle();
                    this.vTracker = null;
                    if (motionEvent.getAction() == 1) {
                        EmojiView.this.dragListener.onDragEnd(yVelocity);
                    } else {
                        EmojiView.this.dragListener.onDragCancel();
                    }
                    this.first = true;
                    this.draggingHorizontally = false;
                    this.draggingVertically = false;
                }
                cancelLongPress();
                return true;
            }
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (!this.startedScroll && this.lastX - motionEvent.getX() < 0.0f) {
                    if (EmojiView.this.pager.beginFakeDrag()) {
                        this.startedScroll = true;
                        this.lastTranslateX = getTranslationX();
                    }
                } else if (this.startedScroll && this.lastX - motionEvent.getX() > 0.0f && EmojiView.this.pager.isFakeDragging()) {
                    EmojiView.this.pager.endFakeDrag();
                    this.startedScroll = false;
                }
            }
            if (this.startedScroll) {
                motionEvent.getX();
                try {
                    this.lastTranslateX = translationX;
                } catch (Exception e) {
                    try {
                        EmojiView.this.pager.endFakeDrag();
                    } catch (Exception unused) {
                    }
                    this.startedScroll = false;
                    FileLog.e(e);
                }
            }
            this.lastX = motionEvent.getX();
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.first = true;
                this.draggingHorizontally = false;
                this.draggingVertically = false;
                if (this.startedScroll) {
                    EmojiView.this.pager.endFakeDrag();
                    this.startedScroll = false;
                }
            }
            return this.startedScroll || super.onTouchEvent(motionEvent);
        }
    }

    public void sendEmoji(ImageViewEmoji imageViewEmoji, String str) {
        String str2;
        EmojiViewDelegate emojiViewDelegate;
        if (imageViewEmoji == null) {
            return;
        }
        if (imageViewEmoji.getSpan() != null) {
            if (this.delegate != null) {
                long j = imageViewEmoji.getSpan().documentId;
                TLRPC.Document documentFindDocument = imageViewEmoji.getSpan().document;
                boolean z = imageViewEmoji.pack != null && imageViewEmoji.pack.forGroup;
                if (documentFindDocument == null) {
                    for (int i = 0; i < this.emojipacksProcessed.size(); i++) {
                        EmojiPack emojiPack = (EmojiPack) this.emojipacksProcessed.get(i);
                        int i2 = 0;
                        while (true) {
                            ArrayList arrayList = emojiPack.documents;
                            if (arrayList == null || i2 >= arrayList.size()) {
                                break;
                            }
                            if (((TLRPC.Document) emojiPack.documents.get(i2)).id == j) {
                                documentFindDocument = (TLRPC.Document) emojiPack.documents.get(i2);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (documentFindDocument == null) {
                    documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, j);
                }
                TLRPC.Document document = documentFindDocument;
                String strFindAnimatedEmojiEmoticon = document != null ? MessageObject.findAnimatedEmojiEmoticon(document) : null;
                if (!MessageObject.isFreeEmoji(document) && !UserConfig.getInstance(this.currentAccount).isPremium() && (((emojiViewDelegate = this.delegate) == null || !emojiViewDelegate.isUserSelf()) && !this.allowEmojisForNonPremium && !z)) {
                    showBottomTab(false, true);
                    BaseFragment baseFragment = this.fragment;
                    BulletinFactory bulletinFactoryOf = baseFragment != null ? BulletinFactory.of(baseFragment) : BulletinFactory.of(this.bulletinContainer, this.resourcesProvider);
                    if (this.premiumBulletin || this.fragment == null) {
                        bulletinFactoryOf.createEmojiBulletin(document, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.openPremiumAnimatedEmojiFeature();
                            }
                        }).show();
                    } else {
                        bulletinFactoryOf.createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint2)), LocaleController.getString(R.string.Open), new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$sendEmoji$0();
                            }
                        }).show();
                    }
                    this.premiumBulletin = !this.premiumBulletin;
                    return;
                }
                this.shownBottomTabAfterClick = SystemClock.elapsedRealtime();
                showBottomTab(true, true);
                addEmojiToRecent("animated_" + j);
                this.delegate.onCustomEmojiSelected(j, document, strFindAnimatedEmojiEmoticon, imageViewEmoji.isRecent);
                return;
            }
            return;
        }
        this.shownBottomTabAfterClick = SystemClock.elapsedRealtime();
        showBottomTab(true, true);
        String strAddColorToCode = str != null ? str : (String) imageViewEmoji.getTag();
        new SpannableStringBuilder().append((CharSequence) strAddColorToCode);
        if (str != null) {
            EmojiViewDelegate emojiViewDelegate2 = this.delegate;
            if (emojiViewDelegate2 != null) {
                emojiViewDelegate2.onEmojiSelected(Emoji.fixEmoji(str));
                return;
            }
            return;
        }
        if (!imageViewEmoji.isRecent && (str2 = Emoji.emojiColor.get(strAddColorToCode)) != null) {
            strAddColorToCode = addColorToCode(strAddColorToCode, str2);
        }
        addEmojiToRecent(strAddColorToCode);
        EmojiViewDelegate emojiViewDelegate3 = this.delegate;
        if (emojiViewDelegate3 != null) {
            emojiViewDelegate3.onEmojiSelected(Emoji.fixEmoji(strAddColorToCode));
        }
    }

    public void lambda$sendEmoji$0() {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
        this.fragment.presentFragment(new AnonymousClass3(bundle));
    }

    class AnonymousClass3 extends ChatActivity {
        AnonymousClass3(Bundle bundle) {
            super(bundle);
        }

        @Override
        public void onTransitionAnimationEnd(boolean z, boolean z2) {
            ChatActivityEnterView chatActivityEnterView;
            super.onTransitionAnimationEnd(z, z2);
            if (!z || (chatActivityEnterView = this.chatActivityEnterView) == null) {
                return;
            }
            chatActivityEnterView.showEmojiView();
            this.chatActivityEnterView.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onTransitionAnimationEnd$0();
                }
            }, 100L);
        }

        public void lambda$onTransitionAnimationEnd$0() {
            if (this.chatActivityEnterView.getEmojiView() != null) {
                this.chatActivityEnterView.getEmojiView().scrollEmojisToAnimated();
            }
        }
    }

    public static class ImageViewEmoji extends ImageView {
        ValueAnimator backAnimator;
        private ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolder;
        public AnimatedEmojiDrawable drawable;
        public boolean ignoring;
        public ImageReceiver imageReceiver;
        private boolean isRecent;
        private EmojiPack pack;
        public int position;
        float pressedProgress;
        private AnimatedEmojiSpan span;

        public ImageViewEmoji(Context context) {
            super(context);
            this.backgroundThreadDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
            setScaleType(ImageView.ScaleType.CENTER);
            setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        }

        public void setImageDrawable(Drawable drawable, boolean z) {
            super.setImageDrawable(drawable);
            this.isRecent = z;
        }

        public void setSpan(AnimatedEmojiSpan animatedEmojiSpan) {
            this.span = animatedEmojiSpan;
        }

        public AnimatedEmojiSpan getSpan() {
            return this.span;
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.view.View");
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
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            this.f$0.lambda$setPressed$0(valueAnimator2);
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
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    float fMin = f + (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f);
                    this.pressedProgress = fMin;
                    this.pressedProgress = Utilities.clamp(fMin, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float f2 = ((1.0f - this.pressedProgress) * 0.2f) + 0.8f;
            canvas.save();
            canvas.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            super.onDraw(canvas);
            canvas.restore();
        }
    }

    public EmojiView(BaseFragment baseFragment, boolean z, boolean z2, boolean z3, Context context, boolean z4, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z5, Theme.ResourcesProvider resourcesProvider, boolean z6) {
        this(baseFragment, z, z2, z3, context, z4, chatFull, viewGroup, z5, resourcesProvider, z6, false);
    }

    public EmojiView(BaseFragment baseFragment, boolean z, boolean z2, boolean z3, Context context, boolean z4, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z5, final Theme.ResourcesProvider resourcesProvider, boolean z6, boolean z7) {
        final Theme.ResourcesProvider resourcesProvider2;
        ?? r6;
        int i;
        int i2;
        final boolean z8;
        int i3;
        char c;
        boolean z9;
        int i4;
        AnonymousClass1 anonymousClass1;
        int i5;
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSearchStickerPackSelected = new BoolAnimator(0, this, cubicBezierInterpolator, 320L);
        this.animatorSearchEmojiPackSelected = new BoolAnimator(1, this, cubicBezierInterpolator, 320L);
        this.emojiCacheType = 2;
        this.allTabs = new ArrayList();
        this.currentTabs = new ArrayList();
        this.firstEmojiAttach = true;
        this.hasRecentEmoji = -1;
        this.gifSearchPreloader = new GifSearchPreloader();
        this.gifCache = new HashMap();
        this.firstGifAttach = true;
        this.gifRecentTabNum = -2;
        this.gifTrendingTabNum = -2;
        this.gifFirstEmojiTabNum = -2;
        this.shouldDrawBackground = true;
        this.shouldLightenBackground = true;
        this.firstStickersAttach = true;
        this.tabsMinusDy = new int[3];
        this.tabsYAnimators = new ObjectAnimator[3];
        this.currentAccount = UserConfig.selectedAccount;
        this.stickerSets = new ArrayList();
        this.recentGifs = new ArrayList();
        this.recentStickers = new ArrayList();
        this.favouriteStickers = new ArrayList();
        this.premiumStickers = new ArrayList();
        this.featuredStickerSets = new ArrayList();
        this.featuredEmojiSets = new ArrayList();
        this.keepFeaturedDuplicate = new ArrayList();
        this.expandedEmojiSets = new ArrayList();
        this.installedEmojiSets = new ArrayList();
        this.emojipacksProcessed = new ArrayList();
        this.toInstall = new HashMap();
        this.primaryInstallingStickerSets = new TLRPC.StickerSetCovered[10];
        this.installingStickerSets = new LongSparseArray();
        this.removingStickerSets = new LongSparseArray();
        this.location = new int[2];
        this.recentTabNum = -2;
        this.favTabNum = -2;
        this.trendingTabNum = -2;
        this.premiumTabNum = -2;
        this.currentBackgroundType = -1;
        this.checkExpandStickerTabsRunnable = new Runnable() {
            @Override
            public void run() {
                if (EmojiView.this.stickersTab.isDragging()) {
                    return;
                }
                EmojiView.this.expandStickersByDragg = false;
                EmojiView.this.updateStickerTabsPosition();
            }
        };
        this.contentPreviewViewerDelegate = new AnonymousClass2();
        this.premiumBulletin = true;
        this.visibleInAppKeyboardHeight = -1.0f;
        this.animateExpandFromPosition = -1;
        this.animateExpandToPosition = -1;
        this.animateExpandStartTime = -1L;
        this.emojiPackAlertOpened = false;
        this.fixBottomTabContainerTranslation = true;
        this.rect = new Rect();
        RectF rectF = new RectF();
        this.blurredRectF = rectF;
        ArrayList arrayList = new ArrayList(1);
        this.blurredRectList = arrayList;
        arrayList.add(rectF);
        this.navbarFillPaint = new Paint(1);
        this.fadeDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.bottomTabVisibility = new BoolAnimator(0, new FactorAnimator.Target() {
            @Override
            public void onFactorChangeFinished(int i6, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i6, f, factorAnimator);
            }

            @Override
            public final void onFactorChanged(int i6, float f, float f2, FactorAnimator factorAnimator) {
                this.f$0.lambda$new$22(i6, f, f2, factorAnimator);
            }
        }, cubicBezierInterpolator, 380L, true);
        this.updateStickersLoadedDelayed = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$28();
            }
        };
        this.disableStickerEditor = false;
        this.shouldDrawBackground = z5;
        this.fragment = baseFragment;
        this.allowAnimatedEmoji = z;
        this.resourcesProvider = resourcesProvider;
        this.glassDesign = z7;
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.blurredBackgroundSourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (z6) {
            freeze(true);
        }
        ColorUtils.setAlphaComponent(getThemedColor(Theme.key_glass_defaultIcon), 30);
        this.searchFieldHeight = AndroidUtilities.dp(50.0f);
        this.needEmojiSearch = z4;
        this.tabIcons = new Drawable[]{Theme.createEmojiIconSelectorDrawable(context, R.drawable.smiles_tab_smiles, z7 ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiPanelBackspace), z7 ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected)), Theme.createEmojiIconSelectorDrawable(context, R.drawable.smiles_tab_gif, z7 ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiPanelBackspace), z7 ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected)), Theme.createEmojiIconSelectorDrawable(context, R.drawable.smiles_tab_stickers, z7 ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiPanelBackspace), z7 ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected))};
        int i6 = R.drawable.msg_emoji_recent;
        Drawable drawableCreateEmojiIconSelectorDrawable = Theme.createEmojiIconSelectorDrawable(context, i6, z7 ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiPanelIcon), z7 ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected));
        Drawable drawableCreateEmojiIconSelectorDrawable2 = Theme.createEmojiIconSelectorDrawable(context, R.drawable.emoji_tabs_faves, z7 ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiPanelIcon), z7 ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected));
        Drawable drawableCreateEmojiIconSelectorDrawable3 = Theme.createEmojiIconSelectorDrawable(context, R.drawable.emoji_tabs_new3, z7 ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiPanelIcon), z7 ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected));
        Drawable drawableCreateEmojiIconSelectorDrawable4 = Theme.createEmojiIconSelectorDrawable(context, R.drawable.emoji_tabs_new1, z7 ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiPanelIcon), z7 ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected));
        this.searchIconDrawable = drawableCreateEmojiIconSelectorDrawable4;
        int i7 = R.drawable.emoji_tabs_new2;
        int i8 = Theme.key_chat_emojiPanelStickerPackSelectorLine;
        Drawable drawableCreateEmojiIconSelectorDrawable5 = Theme.createEmojiIconSelectorDrawable(context, i7, getThemedColor(i8), getThemedColor(i8));
        this.searchIconDotDrawable = drawableCreateEmojiIconSelectorDrawable5;
        this.stickerIcons = new Drawable[]{drawableCreateEmojiIconSelectorDrawable, drawableCreateEmojiIconSelectorDrawable2, drawableCreateEmojiIconSelectorDrawable3, new LayerDrawable(new Drawable[]{drawableCreateEmojiIconSelectorDrawable4, drawableCreateEmojiIconSelectorDrawable5})};
        this.gifIcons = new Drawable[]{Theme.createEmojiIconSelectorDrawable(context, i6, z7 ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiPanelIcon), z7 ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected)), Theme.createEmojiIconSelectorDrawable(context, R.drawable.stickers_gifs_trending, z7 ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiPanelIcon), z7 ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected))};
        this.emojiTitles = new String[]{LocaleController.getString(R.string.Emoji1), LocaleController.getString(R.string.Emoji2), LocaleController.getString(R.string.Emoji3), LocaleController.getString(R.string.Emoji4), LocaleController.getString(R.string.Emoji5), LocaleController.getString(R.string.Emoji6), LocaleController.getString(R.string.Emoji7), LocaleController.getString(R.string.Emoji8)};
        this.showGifs = z3;
        this.info = chatFull;
        Paint paint = new Paint(1);
        this.dotPaint = paint;
        paint.setColor(getThemedColor(Theme.key_chat_emojiPanelNewTrending));
        this.outlineProvider = ViewOutlineProviderImpl.boundsWithPaddingFromViewAndRoundRect(AndroidUtilities.dp(6.0f));
        this.emojiContainer = new FrameLayout(context) {
            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == EmojiView.this.emojiGridView || view == EmojiView.this.emojiSearchField) {
                    canvas.save();
                    float y = EmojiView.this.emojiTabs.getY() + EmojiView.this.emojiTabs.getMeasuredHeight() + 1.0f;
                    if (view == EmojiView.this.emojiGridView && EmojiView.this.emojiSearchField != null) {
                        y = Math.max(y, EmojiView.this.emojiSearchField.getY() + EmojiView.this.emojiSearchField.getMeasuredHeight() + 1.0f);
                    }
                    canvas.clipRect(0.0f, y - (AndroidUtilities.dp(16.0f) * EmojiView.this.animatorSearchEmojiPackSelected.getFloatValue()), getMeasuredWidth(), getMeasuredHeight());
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        Tab tab = new Tab();
        tab.type = 0;
        tab.view = this.emojiContainer;
        this.allTabs.add(tab);
        if (z) {
            MediaDataController.getInstance(this.currentAccount).checkStickers(5);
            MediaDataController.getInstance(this.currentAccount).checkFeaturedEmoji();
            this.animatedEmojiTextColorFilter = new PorterDuffColorFilter(getThemedColor(Theme.key_featuredStickers_addButton), PorterDuff.Mode.SRC_IN);
        }
        this.emojiGridView = new EmojiGridView(context) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (EmojiView.this.ignorePagerScroll) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setAddDelay(0L);
        defaultItemAnimator.setAddDuration(220L);
        defaultItemAnimator.setMoveDuration(220L);
        defaultItemAnimator.setChangeDuration(160L);
        defaultItemAnimator.setMoveInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.emojiGridView.setItemAnimator(defaultItemAnimator);
        this.emojiGridView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.lambda$new$1(resourcesProvider, view, motionEvent);
            }
        });
        this.emojiGridView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i9) {
                return this.f$0.lambda$new$2(view, i9);
            }
        });
        this.emojiGridView.setInstantClick(true);
        EmojiGridView emojiGridView = this.emojiGridView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 8) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i9) {
                try {
                    LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2) {
                        @Override
                        public void onEnd() {
                            EmojiView.this.emojiSmoothScrolling = false;
                        }
                    };
                    linearSmoothScrollerCustom.setTargetPosition(i9);
                    startSmoothScroll(linearSmoothScrollerCustom);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        };
        this.emojiLayoutManager = gridLayoutManager;
        emojiGridView.setLayoutManager(gridLayoutManager);
        this.emojiGridView.setTopGlowOffset(AndroidUtilities.dp(38.0f));
        this.emojiGridView.setBottomGlowOffset(AndroidUtilities.dp(36.0f));
        this.emojiGridView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f));
        EmojiGridView emojiGridView2 = this.emojiGridView;
        int i9 = Theme.key_chat_emojiPanelBackground;
        emojiGridView2.setGlowColor(getThemedColor(i9));
        this.emojiGridView.setItemSelectorColorProvider(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                return EmojiView.lambda$new$3((Integer) obj);
            }
        });
        this.emojiGridView.setClipToPadding(false);
        this.emojiLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i10) {
                if (EmojiView.this.emojiGridView.getAdapter() == EmojiView.this.emojiSearchAdapter) {
                    int itemViewType = EmojiView.this.emojiSearchAdapter.getItemViewType(i10);
                    if (itemViewType == 1 || itemViewType == 3 || itemViewType == 2 || itemViewType == 4 || itemViewType == 5) {
                        return EmojiView.this.emojiLayoutManager.getSpanCount();
                    }
                } else if ((EmojiView.this.needEmojiSearch && i10 == 0) || i10 == EmojiView.this.emojiAdapter.trendingRow || i10 == EmojiView.this.emojiAdapter.trendingHeaderRow || i10 == EmojiView.this.emojiAdapter.recentlyUsedHeaderRow || EmojiView.this.emojiAdapter.positionToSection.indexOfKey(i10) >= 0 || EmojiView.this.emojiAdapter.positionToUnlock.indexOfKey(i10) >= 0) {
                    return EmojiView.this.emojiLayoutManager.getSpanCount();
                }
                return 1;
            }

            @Override
            public int getSpanGroupIndex(int i10, int i11) {
                return super.getSpanGroupIndex(i10, i11);
            }
        });
        EmojiGridView emojiGridView3 = this.emojiGridView;
        EmojiGridAdapter emojiGridAdapter = new EmojiGridAdapter();
        this.emojiAdapter = emojiGridAdapter;
        emojiGridView3.setAdapter(emojiGridAdapter);
        this.emojiGridView.addItemDecoration(new EmojiGridSpacing());
        this.emojiSearchAdapter = new EmojiSearchAdapter(context);
        this.emojiContainer.addView(this.emojiGridView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.emojiGridView, this.emojiLayoutManager);
        this.emojiScrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.setAnimationCallback(new RecyclerAnimationScrollHelper.AnimationCallback() {
            @Override
            public void onPreAnimation() {
                EmojiView.this.emojiGridView.updateEmojiDrawables();
                EmojiView.this.emojiSmoothScrolling = true;
            }

            @Override
            public void onEndAnimation() {
                EmojiView.this.emojiSmoothScrolling = false;
                EmojiView.this.emojiGridView.updateEmojiDrawables();
            }

            @Override
            public void ignoreView(View view, boolean z10) {
                if (view instanceof ImageViewEmoji) {
                    ((ImageViewEmoji) view).ignoring = z10;
                }
            }
        });
        this.emojiGridView.setOnScrollListener(new TypedScrollListener(1) {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                EmojiView.this.updateEmojiTabsPosition();
                if (Build.VERSION.SDK_INT >= 31 && EmojiView.this.scrollableViewNoiseSuppressor != null) {
                    EmojiView.this.scrollableViewNoiseSuppressor.onScrolled(i10, i11);
                    EmojiView.this.invalidateBlurCaptures();
                }
                super.onScrolled(recyclerView, i10, i11);
                if (EmojiView.this.emojiSearchAdapter == null || EmojiView.this.emojiGridView.getAdapter() != EmojiView.this.emojiSearchAdapter || EmojiView.this.emojiSearchAdapter.searchRunnable.isLoading() || EmojiView.this.emojiSearchAdapter.searchRunnable.isCompleted()) {
                    return;
                }
                if (EmojiView.this.emojiLayoutManager.findLastVisibleItemPosition() + 20 > EmojiView.this.emojiSearchAdapter.getItemCount()) {
                    SearchRunnable searchRunnable = EmojiView.this.emojiSearchAdapter.searchRunnable;
                    Objects.requireNonNull(searchRunnable);
                    AndroidUtilities.runOnUIThread(new EmojiView$19$$ExternalSyntheticLambda0(searchRunnable));
                }
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
                if (i10 == 0) {
                    EmojiView.this.emojiSmoothScrolling = false;
                }
                super.onScrollStateChanged(recyclerView, i10);
            }
        });
        this.emojiTabs = new EmojiTabsStrip(context, resourcesProvider, true, false, true, z, 0, baseFragment != null ? new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$4();
            }
        } : null, z7) {
            @Override
            protected boolean isInstalled(EmojiPack emojiPack) {
                return emojiPack.installed || EmojiView.this.installedEmojiSets.contains(Long.valueOf(emojiPack.set.id));
            }

            @Override
            protected boolean allowEmojisForNonPremium() {
                return EmojiView.this.allowEmojisForNonPremium;
            }

            @Override
            public void setTranslationY(float f) {
                if (getTranslationY() != f) {
                    super.setTranslationY(f);
                    if (EmojiView.this.emojiTabsShadow != null) {
                        EmojiView.this.emojiTabsShadow.setTranslationY(f);
                    }
                    EmojiView.this.emojiContainer.invalidate();
                }
            }

            @Override
            protected boolean doIncludeFeatured() {
                return EmojiView.this.featuredEmojiSets.size() <= 0 || ((TLRPC.StickerSetCovered) EmojiView.this.featuredEmojiSets.get(0)).set == null || MessagesController.getEmojiSettings(EmojiView.this.currentAccount).getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) EmojiView.this.featuredEmojiSets.get(0)).set.id || !UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
            }

            @Override
            protected boolean onTabClick(int i10) {
                Integer numValueOf;
                int iDp;
                if (EmojiView.this.emojiSmoothScrolling) {
                    return false;
                }
                if (EmojiView.this.emojiSearchAdapter != null) {
                    EmojiView.this.emojiSearchAdapter.search(null);
                }
                if (EmojiView.this.emojiSearchField != null && EmojiView.this.emojiSearchField.categoriesListView != null) {
                    EmojiView.this.emojiSearchField.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                }
                if (i10 == 0) {
                    numValueOf = Integer.valueOf(EmojiView.this.needEmojiSearch ? 1 : 0);
                } else {
                    i10--;
                    numValueOf = null;
                }
                if (numValueOf == null && i10 < EmojiData.dataColored.length && EmojiView.this.emojiAdapter.sectionToPosition.indexOfKey(i10) >= 0) {
                    numValueOf = Integer.valueOf(EmojiView.this.emojiAdapter.sectionToPosition.get(i10));
                }
                if (numValueOf == null) {
                    ArrayList<EmojiPack> emojipacks = EmojiView.this.getEmojipacks();
                    int length = i10 - EmojiData.dataColored.length;
                    if (emojipacks == null || length < 0 || length >= emojipacks.size()) {
                        iDp = 0;
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= EmojiView.this.emojipacksProcessed.size()) {
                                i11 = -1;
                                break;
                            }
                            if (((EmojiPack) EmojiView.this.emojipacksProcessed.get(i11)).set.id == emojipacks.get(length).set.id) {
                                break;
                            }
                            i11++;
                        }
                        numValueOf = Integer.valueOf(EmojiView.this.emojiAdapter.sectionToPosition.get(i11 + EmojiData.dataColored.length));
                        iDp = AndroidUtilities.dp(-9.0f);
                    }
                } else {
                    iDp = 0;
                }
                if (numValueOf == null) {
                    return true;
                }
                EmojiView.this.emojiGridView.stopScroll();
                EmojiView.this.updateEmojiTabsPosition(numValueOf.intValue());
                EmojiView.this.scrollEmojisToPosition(numValueOf.intValue(), iDp);
                EmojiView.this.checkEmojiTabY(null, 0);
                return true;
            }

            @Override
            protected ColorFilter getEmojiColorFilter() {
                return EmojiView.this.animatedEmojiTextColorFilter;
            }
        };
        if (z4) {
            r6 = 1;
            SearchField searchField = new SearchField(context, 1 == true ? 1 : 0) {
                @Override
                public void setTranslationY(float f) {
                    if (f != getTranslationY()) {
                        super.setTranslationY(f);
                        EmojiView.this.emojiContainer.invalidate();
                    }
                }
            };
            this.emojiSearchField = searchField;
            i = -1;
            this.emojiContainer.addView(searchField, new FrameLayout.LayoutParams(-1, this.searchFieldHeight + AndroidUtilities.getShadowHeight()));
            this.emojiSearchField.searchEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean z10) {
                    if (z10) {
                        EmojiView.this.lastSearchKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                        MediaDataController.getInstance(EmojiView.this.currentAccount).fetchNewEmojiKeywords(EmojiView.this.lastSearchKeyboardLanguage);
                    }
                }
            });
            resourcesProvider2 = resourcesProvider;
            FoundStickerPacksHeaderCell foundStickerPacksHeaderCell = new FoundStickerPacksHeaderCell(context, resourcesProvider2);
            this.emojiSearchHeader = foundStickerPacksHeaderCell;
            i2 = 8;
            foundStickerPacksHeaderCell.setVisibility(8);
            this.emojiSearchHeader.setOnBackClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$5(view);
                }
            });
            this.emojiContainer.addView(this.emojiSearchHeader, new FrameLayout.LayoutParams(-1, this.searchFieldHeight));
        } else {
            resourcesProvider2 = resourcesProvider;
            r6 = 1;
            i = -1;
            i2 = 8;
        }
        int themedColor = getThemedColor(i9);
        if (Color.alpha(themedColor) >= 255) {
            this.emojiTabs.setBackgroundColor(themedColor);
        }
        this.emojiAdapter.processEmoji(r6);
        this.emojiTabs.updateEmojiPacks(getEmojipacks());
        this.emojiContainer.addView(this.emojiTabs, LayoutHelper.createFrame(i, 36.0f));
        View view = new View(context);
        this.emojiTabsShadow = view;
        view.setAlpha(0.0f);
        this.emojiTabsShadow.setTag(Integer.valueOf((int) r6));
        View view2 = this.emojiTabsShadow;
        int i10 = Theme.key_chat_emojiPanelShadowLine;
        view2.setBackgroundColor(getThemedColor(i10));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(36.0f);
        this.emojiContainer.addView(this.emojiTabsShadow, layoutParams);
        this.emojiAddPackButton = new FoundStickerPackButton(context, resourcesProvider2);
        FoundStickerPackButtonContainer foundStickerPackButtonContainer = new FoundStickerPackButtonContainer(context, resourcesProvider2);
        this.emojiAddPackButtonContainer = foundStickerPackButtonContainer;
        foundStickerPackButtonContainer.setVisibility(i2);
        this.emojiAddPackButtonContainer.addView(this.emojiAddPackButton, LayoutHelper.createFrame(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
        this.emojiContainer.addView(this.emojiAddPackButtonContainer, LayoutHelper.createFrame(i, -2, 80));
        if (z2) {
            if (z3) {
                this.gifContainer = new FrameLayout(context) {
                    @Override
                    protected boolean drawChild(Canvas canvas, View view3, long j) {
                        if (view3 == EmojiView.this.gifGridView) {
                            canvas.save();
                            canvas.clipRect(0.0f, EmojiView.this.gifSearchField.getY() + EmojiView.this.gifSearchField.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                            boolean zDrawChild = super.drawChild(canvas, view3, j);
                            canvas.restore();
                            return zDrawChild;
                        }
                        return super.drawChild(canvas, view3, j);
                    }
                };
                anonymousClass1 = null;
                Tab tab2 = new Tab();
                tab2.type = r6;
                tab2.view = this.gifContainer;
                this.allTabs.add(tab2);
                RecyclerListView recyclerListView = new RecyclerListView(context) {
                    private boolean ignoreLayout;
                    private boolean wasMeasured;

                    @Override
                    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                        return super.onInterceptTouchEvent(motionEvent) || ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, EmojiView.this.gifGridView, 0, EmojiView.this.contentPreviewViewerDelegate, this.resourcesProvider);
                    }

                    @Override
                    protected void onMeasure(int i11, int i12) {
                        super.onMeasure(i11, i12);
                        if (this.wasMeasured) {
                            return;
                        }
                        EmojiView.this.gifAdapter.notifyDataSetChanged();
                        this.wasMeasured = true;
                    }

                    @Override
                    protected void onLayout(boolean z10, int i11, int i12, int i13, int i14) {
                        if (EmojiView.this.firstGifAttach && EmojiView.this.gifAdapter.getItemCount() > 1) {
                            this.ignoreLayout = true;
                            EmojiView.this.gifLayoutManager.scrollToPositionWithOffset(0, 0);
                            EmojiView.this.gifSearchField.setVisibility(0);
                            EmojiView.this.gifTabs.onPageScrolled(0, 0);
                            EmojiView.this.firstGifAttach = false;
                            this.ignoreLayout = false;
                        }
                        super.onLayout(z10, i11, i12, i13, i14);
                        EmojiView.this.checkGifSearchFieldScroll(true);
                    }

                    @Override
                    public void requestLayout() {
                        if (this.ignoreLayout) {
                            return;
                        }
                        super.requestLayout();
                    }
                };
                this.gifGridView = recyclerListView;
                recyclerListView.setClipToPadding(false);
                RecyclerListView recyclerListView2 = this.gifGridView;
                GifLayoutManager gifLayoutManager = new GifLayoutManager(context);
                this.gifLayoutManager = gifLayoutManager;
                recyclerListView2.setLayoutManager(gifLayoutManager);
                this.gifGridView.addItemDecoration(new RecyclerView.ItemDecoration() {
                    @Override
                    public void getItemOffsets(Rect rect, View view3, RecyclerView recyclerView, RecyclerView.State state) {
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view3);
                        if (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifAdapter && childAdapterPosition == EmojiView.this.gifAdapter.trendingSectionItem) {
                            rect.set(0, 0, 0, 0);
                            return;
                        }
                        if (childAdapterPosition != 0 || !EmojiView.this.gifAdapter.addSearch) {
                            rect.left = 0;
                            rect.bottom = 0;
                            rect.top = AndroidUtilities.dp(2.0f);
                            rect.right = EmojiView.this.gifLayoutManager.isLastInRow(childAdapterPosition - (EmojiView.this.gifAdapter.addSearch ? 1 : 0)) ? 0 : AndroidUtilities.dp(2.0f);
                            return;
                        }
                        rect.set(0, 0, 0, 0);
                    }
                });
                this.gifGridView.setPadding(0, this.searchFieldHeight, 0, AndroidUtilities.dp(44.0f) + this.bottomInset);
                i5 = 2;
                this.gifGridView.setOverScrollMode(2);
                ((SimpleItemAnimator) this.gifGridView.getItemAnimator()).setSupportsChangeAnimations(false);
                RecyclerListView recyclerListView3 = this.gifGridView;
                GifAdapter gifAdapter = new GifAdapter(this, context, r6);
                this.gifAdapter = gifAdapter;
                recyclerListView3.setAdapter(gifAdapter);
                this.gifSearchAdapter = new GifAdapter(this, context);
                this.gifGridView.setOnScrollListener(new TypedScrollListener(i5) {
                    @Override
                    public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
                        super.onScrolled(recyclerView, i11, i12);
                        if (Build.VERSION.SDK_INT < 31 || EmojiView.this.scrollableViewNoiseSuppressor == null) {
                            return;
                        }
                        EmojiView.this.scrollableViewNoiseSuppressor.onScrolled(i11, i12);
                        EmojiView.this.invalidateBlurCaptures();
                    }
                });
                this.gifGridView.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        return this.f$0.lambda$new$6(resourcesProvider2, view3, motionEvent);
                    }
                });
                RecyclerListView.OnItemClickListener onItemClickListener = new RecyclerListView.OnItemClickListener() {
                    @Override
                    public final void onItemClick(View view3, int i11) {
                        this.f$0.lambda$new$7(view3, i11);
                    }
                };
                this.gifOnItemClickListener = onItemClickListener;
                this.gifGridView.setOnItemClickListener(onItemClickListener);
                this.gifContainer.addView(this.gifGridView, LayoutHelper.createFrame(i, -1.0f));
                SearchField searchField2 = new SearchField(context, i5) {
                    @Override
                    public void setTranslationY(float f) {
                        if (getTranslationY() != f) {
                            super.setTranslationY(f);
                            EmojiView.this.gifContainer.invalidate();
                        }
                    }
                };
                this.gifSearchField = searchField2;
                this.gifContainer.addView(searchField2, new FrameLayout.LayoutParams(i, this.searchFieldHeight + AndroidUtilities.getShadowHeight()));
                DraggableScrollSlidingTabStrip draggableScrollSlidingTabStrip = new DraggableScrollSlidingTabStrip(context, resourcesProvider2);
                this.gifTabs = draggableScrollSlidingTabStrip;
                draggableScrollSlidingTabStrip.setType(ScrollSlidingTabStrip.Type.TAB);
                this.gifTabs.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                i4 = i8;
                this.gifTabs.setIndicatorColor(getThemedColor(i4));
                this.gifTabs.setUnderlineColor(getThemedColor(i10));
                this.gifTabs.setBackgroundColor(getThemedColor(i9));
                updateGifTabs();
                this.gifTabs.setDelegate(new ScrollSlidingTabStrip.ScrollSlidingTabStripDelegate() {
                    @Override
                    public final void onPageSelected(int i11) {
                        this.f$0.lambda$new$8(i11);
                    }
                });
                this.gifAdapter.loadTrendingGifs();
            } else {
                i4 = i8;
                anonymousClass1 = null;
                i5 = 2;
            }
            z8 = z5;
            this.stickersContainer = new FrameLayout(context) {
                @Override
                protected void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    EmojiView.this.stickersContainerAttached = true;
                    EmojiView.this.updateStickerTabsPosition();
                    if (EmojiView.this.chooseStickerActionTracker != null) {
                        EmojiView.this.chooseStickerActionTracker.checkVisibility();
                    }
                }

                @Override
                protected void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    EmojiView.this.stickersContainerAttached = false;
                    EmojiView.this.updateStickerTabsPosition();
                    if (EmojiView.this.chooseStickerActionTracker != null) {
                        EmojiView.this.chooseStickerActionTracker.checkVisibility();
                    }
                }

                @Override
                protected boolean drawChild(Canvas canvas, View view3, long j) {
                    if (!z8 && (view3 == EmojiView.this.stickersGridView || view3 == EmojiView.this.stickersSearchField)) {
                        canvas.save();
                        float y = EmojiView.this.stickersTab.getY() + EmojiView.this.stickersTab.getMeasuredHeight() + 1.0f;
                        if (view3 == EmojiView.this.stickersGridView) {
                            y = Math.max(y, EmojiView.this.stickersSearchField.getY() + EmojiView.this.stickersSearchField.getMeasuredHeight() + 1.0f);
                        }
                        canvas.clipRect(0.0f, y - (AndroidUtilities.dp(16.0f) * EmojiView.this.animatorSearchStickerPackSelected.getFloatValue()), getMeasuredWidth(), getMeasuredHeight());
                        boolean zDrawChild = super.drawChild(canvas, view3, j);
                        canvas.restore();
                        return zDrawChild;
                    }
                    return super.drawChild(canvas, view3, j);
                }
            };
            MediaDataController.getInstance(this.currentAccount).checkStickers(0);
            MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
            RecyclerListViewWithOverlayDraw recyclerListViewWithOverlayDraw = new RecyclerListViewWithOverlayDraw(context) {
                boolean ignoreLayout;

                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (EmojiView.this.ignorePagerScroll) {
                        return false;
                    }
                    return super.onInterceptTouchEvent(motionEvent) || ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, EmojiView.this.stickersGridView, EmojiView.this.getMeasuredHeight(), EmojiView.this.contentPreviewViewerDelegate, this.resourcesProvider);
                }

                @Override
                public void setVisibility(int i11) {
                    super.setVisibility(i11);
                }

                @Override
                protected void onLayout(boolean z10, int i11, int i12, int i13, int i14) {
                    if (EmojiView.this.firstStickersAttach && EmojiView.this.stickersGridAdapter.getItemCount() > 0) {
                        this.ignoreLayout = true;
                        EmojiView.this.stickersLayoutManager.scrollToPositionWithOffset(0, 0);
                        EmojiView.this.firstStickersAttach = false;
                        this.ignoreLayout = false;
                    }
                    super.onLayout(z10, i11, i12, i13, i14);
                    EmojiView.this.checkStickersSearchFieldScroll(true);
                }

                @Override
                public void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }

                @Override
                public void onScrolled(int i11, int i12) {
                    super.onScrolled(i11, i12);
                    if (Build.VERSION.SDK_INT >= 31 && EmojiView.this.scrollableViewNoiseSuppressor != null) {
                        EmojiView.this.scrollableViewNoiseSuppressor.onScrolled(i11, i12);
                        EmojiView.this.invalidateBlurCaptures();
                    }
                    if (EmojiView.this.stickersTabContainer != null) {
                        EmojiView.this.stickersTab.setUnderlineHeight(EmojiView.this.stickersGridView.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
                    }
                    if (EmojiView.this.stickersSearchGridAdapter == null || getAdapter() != EmojiView.this.stickersSearchGridAdapter || EmojiView.this.stickersSearchGridAdapter.selectedPackId != 0 || EmojiView.this.stickersSearchGridAdapter.searchRunnable.isLoading() || EmojiView.this.stickersSearchGridAdapter.searchRunnable.isCompleted()) {
                        return;
                    }
                    if (EmojiView.this.stickersLayoutManager.findLastVisibleItemPosition() + 50 > EmojiView.this.stickersSearchGridAdapter.getItemCount()) {
                        SearchRunnable searchRunnable = EmojiView.this.stickersSearchGridAdapter.searchRunnable;
                        Objects.requireNonNull(searchRunnable);
                        AndroidUtilities.runOnUIThread(new EmojiView$19$$ExternalSyntheticLambda0(searchRunnable));
                    }
                }
            };
            this.stickersGridView = recyclerListViewWithOverlayDraw;
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(context, 5) {
                @Override
                public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i11) {
                    try {
                        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2);
                        linearSmoothScrollerCustom.setTargetPosition(i11);
                        startSmoothScroll(linearSmoothScrollerCustom);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }

                @Override
                public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    int iScrollVerticallyBy = super.scrollVerticallyBy(i11, recycler, state);
                    if (iScrollVerticallyBy != 0 && EmojiView.this.stickersGridView.getScrollState() == 1) {
                        EmojiView.this.expandStickersByDragg = false;
                        EmojiView.this.updateStickerTabsPosition();
                    }
                    if (EmojiView.this.chooseStickerActionTracker == null) {
                        EmojiView.this.createStickersChooseActionTracker();
                    }
                    EmojiView.this.chooseStickerActionTracker.doSomeAction();
                    return iScrollVerticallyBy;
                }
            };
            this.stickersLayoutManager = gridLayoutManager2;
            recyclerListViewWithOverlayDraw.setLayoutManager(gridLayoutManager2);
            this.stickersLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i11) {
                    if (EmojiView.this.stickersGridView.getAdapter() != EmojiView.this.stickersGridAdapter) {
                        if (i11 == EmojiView.this.stickersSearchGridAdapter.totalItems || !(EmojiView.this.stickersSearchGridAdapter.cache.get(i11) == null || (EmojiView.this.stickersSearchGridAdapter.cache.get(i11) instanceof TLRPC.Document))) {
                            return EmojiView.this.stickersGridAdapter.stickersPerRow;
                        }
                        return 1;
                    }
                    if (i11 == 0) {
                        return EmojiView.this.stickersGridAdapter.stickersPerRow;
                    }
                    if (i11 == EmojiView.this.stickersGridAdapter.totalItems || !(EmojiView.this.stickersGridAdapter.cache.get(i11) == null || (EmojiView.this.stickersGridAdapter.cache.get(i11) instanceof TLRPC.Document))) {
                        return EmojiView.this.stickersGridAdapter.stickersPerRow;
                    }
                    return 1;
                }
            });
            this.stickersGridView.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f));
            this.stickersGridView.setClipToPadding(false);
            Tab tab3 = new Tab();
            tab3.type = i5;
            tab3.view = this.stickersContainer;
            this.allTabs.add(tab3);
            this.stickersSearchGridAdapter = new StickersSearchGridAdapter(context);
            RecyclerListView recyclerListView4 = this.stickersGridView;
            StickersGridAdapter stickersGridAdapter = new StickersGridAdapter(context);
            this.stickersGridAdapter = stickersGridAdapter;
            recyclerListView4.setAdapter(stickersGridAdapter);
            this.stickersGridView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    return this.f$0.lambda$new$9(resourcesProvider2, view3, motionEvent);
                }
            });
            RecyclerListView.OnItemClickListener onItemClickListener2 = new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view3, int i11) {
                    this.f$0.lambda$new$10(view3, i11);
                }
            };
            this.stickersOnItemClickListener = onItemClickListener2;
            this.stickersGridView.setOnItemClickListener(onItemClickListener2);
            this.stickersGridView.setGlowColor(getThemedColor(i9));
            this.stickersContainer.addView(this.stickersGridView);
            this.stickersScrollHelper = new RecyclerAnimationScrollHelper(this.stickersGridView, this.stickersLayoutManager);
            SearchField searchField3 = new SearchField(context, 0) {
                @Override
                public void setTranslationY(float f) {
                    if (f != getTranslationY()) {
                        super.setTranslationY(f);
                        EmojiView.this.stickersContainer.invalidate();
                    }
                }
            };
            this.stickersSearchField = searchField3;
            this.stickersContainer.addView(searchField3, new FrameLayout.LayoutParams(-1, this.searchFieldHeight + AndroidUtilities.getShadowHeight()));
            FoundStickerPacksHeaderCell foundStickerPacksHeaderCell2 = new FoundStickerPacksHeaderCell(context, resourcesProvider2);
            this.stickerSearchHeader = foundStickerPacksHeaderCell2;
            foundStickerPacksHeaderCell2.setVisibility(8);
            this.stickerSearchHeader.setOnBackClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    this.f$0.lambda$new$11(view3);
                }
            });
            this.stickersContainer.addView(this.stickerSearchHeader, new FrameLayout.LayoutParams(-1, this.searchFieldHeight));
            c = 2;
            i3 = 51;
            AnonymousClass23 anonymousClass23 = new AnonymousClass23(context, resourcesProvider, baseFragment, z5);
            this.stickersTab = anonymousClass23;
            anonymousClass23.setDragEnabled(true);
            this.stickersTab.setWillNotDraw(false);
            this.stickersTab.setType(ScrollSlidingTabStrip.Type.TAB);
            this.stickersTab.setUnderlineHeight(this.stickersGridView.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
            this.stickersTab.setIndicatorColor(getThemedColor(i4));
            this.stickersTab.setUnderlineColor(getThemedColor(i10));
            if (viewGroup != null && z8) {
                FrameLayout frameLayout = new FrameLayout(context) {
                    Paint paint = new Paint();

                    @Override
                    protected void dispatchDraw(Canvas canvas) {
                        float fDp = AndroidUtilities.dp(50.0f) * EmojiView.this.delegate.getProgressToSearchOpened();
                        if (fDp > getMeasuredHeight()) {
                            return;
                        }
                        canvas.save();
                        if (fDp != 0.0f) {
                            canvas.clipRect(0.0f, fDp, getMeasuredWidth(), getMeasuredHeight());
                        }
                        this.paint.setColor(EmojiView.this.getThemedColor(Theme.key_chat_emojiPanelBackground));
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(36.0f) + EmojiView.this.stickersTab.getExpandedOffset(), this.paint);
                        super.dispatchDraw(canvas);
                        EmojiView.this.stickersTab.drawOverlays(canvas);
                        canvas.restore();
                    }

                    @Override
                    protected void onLayout(boolean z10, int i11, int i12, int i13, int i14) {
                        super.onLayout(z10, i11, i12, i13, i14);
                        EmojiView.this.updateStickerTabsPosition();
                    }
                };
                this.stickersTabContainer = frameLayout;
                frameLayout.addView(this.stickersTab, LayoutHelper.createFrame(-1, 36, 51));
                viewGroup.addView(this.stickersTabContainer, LayoutHelper.createFrame(-1, -2.0f));
            } else {
                this.stickersContainer.addView(this.stickersTab, LayoutHelper.createFrame(-1, 36, 51));
            }
            updateStickerTabs(true);
            this.stickersTab.setDelegate(new ScrollSlidingTabStrip.ScrollSlidingTabStripDelegate() {
                @Override
                public final void onPageSelected(int i11) {
                    this.f$0.lambda$new$12(i11);
                }
            });
            this.stickersGridView.setOnScrollListener(new TypedScrollListener(0));
            this.stickerAddPackButton = new FoundStickerPackButton(context, resourcesProvider2);
            FoundStickerPackButtonContainer foundStickerPackButtonContainer2 = new FoundStickerPackButtonContainer(context, resourcesProvider2);
            this.stickerAddPackButtonContainer = foundStickerPackButtonContainer2;
            foundStickerPackButtonContainer2.setVisibility(8);
            this.stickerAddPackButtonContainer.addView(this.stickerAddPackButton, LayoutHelper.createFrame(-1, 48.0f, 80, 10.0f, 5.0f, 10.0f, 10.0f));
            this.stickersContainer.addView(this.stickerAddPackButtonContainer, LayoutHelper.createFrame(-1, -2, 80));
        } else {
            z8 = z5;
            i3 = 51;
            c = 2;
        }
        this.currentTabs.clear();
        this.currentTabs.addAll(this.allTabs);
        ViewPager viewPager = new ViewPager(context) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (EmojiView.this.ignorePagerScroll) {
                    return false;
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                try {
                    return super.onInterceptTouchEvent(motionEvent);
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            }

            @Override
            public void setCurrentItem(int i11, boolean z10) {
                EmojiView.this.startStopVisibleGifs(i11 == 1);
                if (i11 != getCurrentItem()) {
                    super.setCurrentItem(i11, z10);
                    return;
                }
                if (i11 != 0) {
                    if (i11 == 1) {
                        EmojiView.this.gifGridView.smoothScrollToPosition(0);
                        return;
                    } else {
                        EmojiView.this.stickersGridView.smoothScrollToPosition(1);
                        return;
                    }
                }
                EmojiView.this.tabsMinusDy[1] = 0;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(EmojiView.this.emojiTabs, (Property<EmojiTabsStrip, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                objectAnimatorOfFloat.start();
                EmojiView.this.scrollEmojisToPosition(1, 0);
                if (EmojiView.this.emojiTabs != null) {
                    EmojiView.this.emojiTabs.select(0);
                }
            }
        };
        this.pager = viewPager;
        EmojiPagesAdapter emojiPagesAdapter = new EmojiPagesAdapter();
        this.emojiPagerAdapter = emojiPagesAdapter;
        viewPager.setAdapter(emojiPagesAdapter);
        ImageView imageView = new ImageView(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    EmojiView.this.backspacePressed = true;
                    EmojiView.this.backspaceOnce = false;
                    EmojiView.this.postBackspaceRunnable(350);
                } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    EmojiView.this.backspacePressed = false;
                    if (!EmojiView.this.backspaceOnce && EmojiView.this.delegate != null && EmojiView.this.delegate.onBackspace()) {
                        try {
                            EmojiView.this.backspaceButton.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                }
                super.onTouchEvent(motionEvent);
                return true;
            }
        };
        this.backspaceButton = imageView;
        imageView.setHapticFeedbackEnabled(true);
        this.backspaceButton.setImageResource(R.drawable.smiles_tab_clear);
        ImageView imageView2 = this.backspaceButton;
        int glassIconColor = z7 ? getGlassIconColor(0.6f) : getThemedColor(Theme.key_chat_emojiPanelBackspace);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(glassIconColor, mode));
        ImageView imageView3 = this.backspaceButton;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        ImageView imageView4 = this.backspaceButton;
        int i11 = R.string.AccDescrBackspace;
        imageView4.setContentDescription(LocaleController.getString(i11));
        this.backspaceButton.setFocusable(true);
        this.backspaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
            }
        });
        ScaleStateListAnimator.apply(this.backspaceButton);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bulletinContainer = frameLayout2;
        if (z4) {
            addView(frameLayout2, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, (AndroidUtilities.getShadowHeight() / AndroidUtilities.density) + 40.0f));
        } else {
            addView(frameLayout2, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bulletinContainer2 = frameLayout3;
        addView(frameLayout3, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        this.bottomTabContainer = new FrameLayout(context);
        View view3 = new View(context);
        this.bottomTabContainerBackground = view3;
        this.bottomTabContainer.addView(view3, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(40.0f), 83));
        if (z4) {
            addView(this.bottomTabContainer, LayoutHelper.createFrame(-1, 48, 80));
            this.bottomTabContainer.addView(this.backspaceButton, LayoutHelper.createFrame(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
            z9 = z2;
            if (z9) {
                ImageView imageView5 = new ImageView(context);
                this.stickerSettingsButton = imageView5;
                imageView5.setImageResource(R.drawable.smiles_tab_settings);
                this.stickerSettingsButton.setColorFilter(new PorterDuffColorFilter(z7 ? getGlassIconColor(0.6f) : getThemedColor(Theme.key_chat_emojiPanelBackspace), mode));
                this.stickerSettingsButton.setScaleType(scaleType);
                this.stickerSettingsButton.setFocusable(true);
                this.stickerSettingsButton.setContentDescription(LocaleController.getString(R.string.Settings));
                ScaleStateListAnimator.apply(this.stickerSettingsButton);
                this.bottomTabContainer.addView(this.stickerSettingsButton, LayoutHelper.createFrame(48, 48.0f, 85, 2.0f, 0.0f, 2.0f, 0.0f));
                this.stickerSettingsButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view4) {
                        this.f$0.lambda$new$13(view4);
                    }
                });
            }
            PagerSlidingTabStrip pagerSlidingTabStrip = new PagerSlidingTabStrip(context, resourcesProvider2);
            this.typeTabs = pagerSlidingTabStrip;
            pagerSlidingTabStrip.setViewPager(this.pager);
            this.typeTabs.setShouldExpand(false);
            this.typeTabs.setIndicatorHeight(AndroidUtilities.dp(3.0f));
            this.typeTabs.setIndicatorColor(ColorUtils.setAlphaComponent(getThemedColor(Theme.key_chat_emojiPanelIconSelected), 20));
            this.typeTabs.setUnderlineHeight(0);
            this.typeTabs.setTabPaddingLeftRight(AndroidUtilities.dp(11.0f));
            this.typeTabs.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
            this.bottomTabContainer.addView(this.typeTabs, LayoutHelper.createFrame(-2, 48, 81));
            this.typeTabs.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrollStateChanged(int i12) {
                }

                @Override
                public void onPageScrolled(int i12, float f, int i13) {
                    SearchField searchField4;
                    SearchField searchField5;
                    EmojiView.this.checkGridVisibility(i12, f);
                    EmojiView emojiView = EmojiView.this;
                    emojiView.onPageScrolled(i12, (emojiView.getMeasuredWidth() - EmojiView.this.getPaddingLeft()) - EmojiView.this.getPaddingRight(), i13);
                    boolean z10 = true;
                    EmojiView.this.showBottomTab(true, true);
                    int currentItem = EmojiView.this.pager.getCurrentItem();
                    if (currentItem == 0) {
                        searchField4 = EmojiView.this.emojiSearchField;
                    } else {
                        searchField4 = currentItem == 1 ? EmojiView.this.gifSearchField : EmojiView.this.stickersSearchField;
                    }
                    String string = searchField4.searchEditText.getText().toString();
                    int i14 = 0;
                    while (i14 < 3) {
                        if (i14 == 0) {
                            searchField5 = EmojiView.this.emojiSearchField;
                        } else {
                            searchField5 = i14 == 1 ? EmojiView.this.gifSearchField : EmojiView.this.stickersSearchField;
                        }
                        if (searchField5 != null && searchField5 != searchField4 && searchField5.searchEditText != null && !searchField5.searchEditText.getText().toString().equals(string)) {
                            searchField5.searchEditText.setText(string);
                            searchField5.searchEditText.setSelection(string.length());
                        }
                        i14++;
                    }
                    EmojiView emojiView2 = EmojiView.this;
                    if ((i12 != 0 || f <= 0.0f) && i12 != 1) {
                        z10 = false;
                    }
                    emojiView2.startStopVisibleGifs(z10);
                    EmojiView.this.updateStickerTabsPosition();
                }

                @Override
                public void onPageSelected(int i12) {
                    EmojiView.this.saveNewPage();
                    boolean z10 = false;
                    EmojiView.this.showBackspaceButton(i12 == 0, true);
                    EmojiView emojiView = EmojiView.this;
                    if (i12 == 2 && (z8 || emojiView.shouldDrawStickerSettings)) {
                        z10 = true;
                    }
                    emojiView.showStickerSettingsButton(z10, true);
                    if (EmojiView.this.delegate.isSearchOpened()) {
                        if (i12 == 0) {
                            if (EmojiView.this.emojiSearchField != null) {
                                EmojiView.this.emojiSearchField.searchEditText.requestFocus();
                            }
                        } else if (i12 == 1) {
                            if (EmojiView.this.gifSearchField != null) {
                                EmojiView.this.gifSearchField.searchEditText.requestFocus();
                            }
                        } else if (EmojiView.this.stickersSearchField != null) {
                            EmojiView.this.stickersSearchField.searchEditText.requestFocus();
                        }
                    }
                }
            });
            ImageView imageView6 = new ImageView(context);
            this.searchButton = imageView6;
            imageView6.setImageResource(R.drawable.smiles_tab_search);
            this.searchButton.setColorFilter(new PorterDuffColorFilter(z7 ? getGlassIconColor(0.6f) : getThemedColor(Theme.key_chat_emojiPanelBackspace), mode));
            this.searchButton.setScaleType(scaleType);
            this.searchButton.setContentDescription(LocaleController.getString(R.string.Search));
            this.searchButton.setFocusable(true);
            this.searchButton.setVisibility(8);
            this.bottomTabContainer.addView(this.searchButton, LayoutHelper.createFrame(48, 48.0f, 83, 2.0f, 0.0f, 2.0f, 0.0f));
            this.searchButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view4) {
                    this.f$0.lambda$new$14(view4);
                }
            });
        } else {
            z9 = z2;
            addView(this.bottomTabContainer, LayoutHelper.createFrame(56, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            Drawable drawableCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), getThemedColor(i9), getThemedColor(i9));
            ScaleStateListAnimator.apply(this.backspaceButton);
            this.backspaceButton.setPadding(0, 0, AndroidUtilities.dp(2.0f), 0);
            this.backspaceButton.setBackground(drawableCreateSimpleSelectorCircleDrawable);
            this.backspaceButton.setContentDescription(LocaleController.getString(i11));
            this.backspaceButton.setFocusable(true);
            this.bottomTabContainer.addView(this.backspaceButton, LayoutHelper.createFrame(48, 48.0f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
            this.bottomTabContainerBackground.setVisibility(8);
        }
        addView(this.pager, 0, LayoutHelper.createFrame(-1, -1, i3));
        CorrectlyMeasuringTextView correctlyMeasuringTextView = new CorrectlyMeasuringTextView(context);
        this.mediaBanTooltip = correctlyMeasuringTextView;
        correctlyMeasuringTextView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), getThemedColor(Theme.key_chat_gifSaveHintBackground)));
        this.mediaBanTooltip.setTextColor(getThemedColor(Theme.key_chat_gifSaveHintText));
        this.mediaBanTooltip.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f));
        this.mediaBanTooltip.setGravity(16);
        this.mediaBanTooltip.setTextSize(1, 14.0f);
        this.mediaBanTooltip.setVisibility(4);
        addView(this.mediaBanTooltip, LayoutHelper.createFrame(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.emojiSize = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        EmojiColorPickerWindow emojiColorPickerWindowCreate = EmojiColorPickerWindow.create(context, resourcesProvider2);
        this.colorPickerView = emojiColorPickerWindowCreate;
        emojiColorPickerWindowCreate.setOnSelectionUpdateListener(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$new$15((Integer) obj, (Integer) obj2);
            }
        });
        this.currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        this.emojiAdapter.notifyDataSetChanged();
        setAllow(z9, z3, false);
        if (Build.VERSION.SDK_INT >= 31) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.blurredBackgroundSourceRenderNode = blurredBackgroundSourceRenderNode;
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.blurredBackgroundDrawableFactory = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
        } else {
            this.blurredBackgroundSourceRenderNode = null;
            this.blurredBackgroundDrawableFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            this.scrollableViewNoiseSuppressor = null;
        }
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this);
        PagerSlidingTabStrip pagerSlidingTabStrip2 = this.typeTabs;
        if (pagerSlidingTabStrip2 != null) {
            viewPositionWatcher.subscribe(pagerSlidingTabStrip2, this, new ViewPositionWatcher.OnChangedListener() {
                @Override
                public final void onPositionChanged(View view4, RectF rectF2) {
                    this.f$0.lambda$new$16(view4, rectF2);
                }
            });
        }
        this.blurredBackgroundDrawableFactory.setSourceRootView(viewPositionWatcher, this);
        final IBlur3Capture[] iBlur3CaptureArr = new IBlur3Capture[3];
        EmojiGridView emojiGridView4 = this.emojiGridView;
        if (emojiGridView4 != null) {
            emojiGridView4.addEdgeEffectListener(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$17();
                }
            });
            final EmojiGridView emojiGridView5 = this.emojiGridView;
            Objects.requireNonNull(emojiGridView5);
            iBlur3CaptureArr[0] = new ViewGroupPartRenderer(emojiGridView5, this, new ViewGroupPartRenderer.DrawChildMethod() {
                @Override
                public final boolean drawChild(Canvas canvas, View view4, long j) {
                    return emojiGridView5.drawChild(canvas, view4, j);
                }
            });
        }
        RecyclerListView recyclerListView5 = this.gifGridView;
        if (recyclerListView5 != null) {
            recyclerListView5.addEdgeEffectListener(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$18();
                }
            });
            RecyclerListView recyclerListView6 = this.gifGridView;
            Objects.requireNonNull(recyclerListView6);
            iBlur3CaptureArr[1] = new ViewGroupPartRenderer(recyclerListView6, this, new EmojiView$$ExternalSyntheticLambda15(recyclerListView6));
        }
        RecyclerListView recyclerListView7 = this.stickersGridView;
        if (recyclerListView7 != null) {
            recyclerListView7.addEdgeEffectListener(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$19();
                }
            });
            iBlur3CaptureArr[c] = new ViewGroupPartRenderer(this.stickersGridView, this, new ViewGroupPartRenderer.DrawChildMethod() {
                @Override
                public final boolean drawChild(Canvas canvas, View view4, long j) {
                    return this.f$0.lambda$new$20(canvas, view4, j);
                }
            });
        }
        this.blurCaptureMethod = new IBlur3Capture() {
            @Override
            public final void capture(Canvas canvas, RectF rectF2) {
                EmojiView.lambda$new$21(iBlur3CaptureArr, canvas, rectF2);
            }

            @Override
            public void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF2) {
                iBlur3Hash.unsupported();
            }
        };
        setBlurredBackgroundDrawableFactory(this.blurredBackgroundDrawableFactory);
    }

    public boolean lambda$new$1(Theme.ResourcesProvider resourcesProvider, View view, MotionEvent motionEvent) {
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.emojiGridView, getMeasuredHeight(), null, this.contentPreviewViewerDelegate, resourcesProvider);
    }

    public boolean lambda$new$2(View view, int i) {
        String str;
        int iDp;
        if (view instanceof ImageViewEmoji) {
            ImageViewEmoji imageViewEmoji = (ImageViewEmoji) view;
            if (imageViewEmoji.isRecent) {
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = this.emojiGridView.findContainingViewHolder(view);
                if (viewHolderFindContainingViewHolder != null && viewHolderFindContainingViewHolder.getAdapterPosition() <= getRecentEmoji().size()) {
                    this.delegate.onClearEmojiRecent();
                }
                this.emojiGridView.clearTouchesFor(view);
                return true;
            }
            if (imageViewEmoji.getSpan() != null || (str = (String) imageViewEmoji.getTag()) == null) {
                return false;
            }
            String strReplace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
            String str2 = !imageViewEmoji.isRecent ? Emoji.emojiColor.get(strReplace) : null;
            boolean zIsCompound = CompoundEmoji.isCompound(strReplace);
            if (zIsCompound || EmojiData.emojiColoredMap.contains(strReplace)) {
                this.emojiTouchedView = imageViewEmoji;
                this.emojiTouchedX = this.emojiLastX;
                this.emojiTouchedY = this.emojiLastY;
                if (zIsCompound) {
                    strReplace = addColorToCode(strReplace, str2);
                } else {
                    this.colorPickerView.setSelection(CompoundEmoji.skinTones.indexOf(str2) + 1);
                }
                this.colorPickerView.setEmoji(strReplace);
                int popupWidth = this.colorPickerView.getPopupWidth();
                int popupHeight = this.colorPickerView.getPopupHeight();
                imageViewEmoji.getLocationOnScreen(this.location);
                if (this.colorPickerView.isCompound()) {
                    iDp = 0;
                } else {
                    iDp = (this.emojiSize * this.colorPickerView.getSelection()) + AndroidUtilities.dp((this.colorPickerView.getSelection() * 4) - (AndroidUtilities.isTablet() ? 5 : 1));
                }
                if (this.location[0] - iDp < AndroidUtilities.dp(5.0f)) {
                    iDp += (this.location[0] - iDp) - AndroidUtilities.dp(5.0f);
                } else if ((this.location[0] - iDp) + popupWidth > AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f)) {
                    iDp += ((this.location[0] - iDp) + popupWidth) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(5.0f));
                }
                int i2 = -iDp;
                int top = imageViewEmoji.getTop() < 0 ? imageViewEmoji.getTop() : 0;
                this.colorPickerView.setupArrow((AndroidUtilities.dp(AndroidUtilities.isTablet() ? 30.0f : 22.0f) - i2) + ((int) AndroidUtilities.dpf2(0.5f)));
                this.colorPickerView.setFocusable(true);
                this.colorPickerView.showAsDropDown(view, i2, (((-view.getMeasuredHeight()) - popupHeight) + ((view.getMeasuredHeight() - this.emojiSize) / 2)) - top);
                this.pager.requestDisallowInterceptTouchEvent(true);
                this.emojiGridView.hideSelector(true);
                this.emojiGridView.clearTouchesFor(view);
                return true;
            }
        }
        return false;
    }

    public static Integer lambda$new$3(Integer num) {
        return 0;
    }

    public void lambda$new$4() {
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate != null) {
            emojiViewDelegate.onEmojiSettingsClick(this.emojiAdapter.frozenEmojiPacks);
        }
    }

    public void lambda$new$5(View view) {
        this.emojiSearchAdapter.resetSelectedPackId();
    }

    public boolean lambda$new$6(Theme.ResourcesProvider resourcesProvider, View view, MotionEvent motionEvent) {
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.gifGridView, 0, this.gifOnItemClickListener, this.contentPreviewViewerDelegate, resourcesProvider);
    }

    public void lambda$new$7(View view, int i) {
        if (this.delegate == null) {
            return;
        }
        if (this.gifAdapter.addSearch) {
            i--;
        }
        RecyclerView.Adapter adapter = this.gifGridView.getAdapter();
        GifAdapter gifAdapter = this.gifAdapter;
        if (adapter != gifAdapter) {
            RecyclerView.Adapter adapter2 = this.gifGridView.getAdapter();
            GifAdapter gifAdapter2 = this.gifSearchAdapter;
            if (adapter2 != gifAdapter2 || i < 0 || i >= gifAdapter2.results.size()) {
                return;
            }
            this.delegate.onGifSelected(view, this.gifSearchAdapter.results.get(i), this.gifSearchAdapter.lastSearchImageString, this.gifSearchAdapter.bot, true, 0, 0);
            updateRecentGifs();
            return;
        }
        if (i < 0) {
            return;
        }
        if (i < gifAdapter.recentItemsCount) {
            this.delegate.onGifSelected(view, this.recentGifs.get(i), null, "gif", true, 0, 0);
            return;
        }
        if (this.gifAdapter.recentItemsCount > 0) {
            i = (i - this.gifAdapter.recentItemsCount) - 1;
        }
        if (i < 0 || i >= this.gifAdapter.results.size()) {
            return;
        }
        this.delegate.onGifSelected(view, this.gifAdapter.results.get(i), null, this.gifAdapter.bot, true, 0, 0);
    }

    public void lambda$new$8(int i) {
        if (i == this.gifTrendingTabNum && this.gifAdapter.results.isEmpty()) {
            return;
        }
        this.gifGridView.stopScroll();
        this.gifTabs.onPageScrolled(i, 0);
        int i2 = 1;
        if (i == this.gifRecentTabNum || i == this.gifTrendingTabNum) {
            this.gifSearchField.searchEditText.setText("");
            if (i != this.gifTrendingTabNum || this.gifAdapter.trendingSectionItem < 1) {
                GifLayoutManager gifLayoutManager = this.gifLayoutManager;
                EmojiViewDelegate emojiViewDelegate = this.delegate;
                if (emojiViewDelegate != null && emojiViewDelegate.isExpanded()) {
                    i2 = 0;
                }
                gifLayoutManager.scrollToPositionWithOffset(i2, 0);
            } else {
                this.gifLayoutManager.scrollToPositionWithOffset(this.gifAdapter.trendingSectionItem, -AndroidUtilities.dp(4.0f));
            }
            if (i == this.gifTrendingTabNum) {
                ArrayList<String> arrayList = MessagesController.getInstance(this.currentAccount).gifSearchEmojies;
                if (!arrayList.isEmpty()) {
                    this.gifSearchPreloader.preload(arrayList.get(0));
                }
            }
        } else {
            ArrayList<String> arrayList2 = MessagesController.getInstance(this.currentAccount).gifSearchEmojies;
            this.gifSearchAdapter.searchEmoji(arrayList2.get(i - this.gifFirstEmojiTabNum));
            int i3 = i - this.gifFirstEmojiTabNum;
            if (i3 > 0) {
                this.gifSearchPreloader.preload(arrayList2.get(i3 - 1));
            }
            if (i - this.gifFirstEmojiTabNum < arrayList2.size() - 1) {
                this.gifSearchPreloader.preload(arrayList2.get((i - this.gifFirstEmojiTabNum) + 1));
            }
        }
        resetTabsY(2);
    }

    public boolean lambda$new$9(Theme.ResourcesProvider resourcesProvider, View view, MotionEvent motionEvent) {
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.stickersGridView, getMeasuredHeight(), this.stickersOnItemClickListener, this.contentPreviewViewerDelegate, resourcesProvider);
    }

    public void lambda$new$10(View view, int i) {
        RecyclerView.Adapter adapter = this.stickersGridView.getAdapter();
        StickersSearchGridAdapter stickersSearchGridAdapter = this.stickersSearchGridAdapter;
        String str = adapter == stickersSearchGridAdapter ? stickersSearchGridAdapter.searchQuery : null;
        if (view instanceof StickerEmojiCell) {
            StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
            if (stickerEmojiCell.getSticker() != null && MessageObject.isPremiumSticker(stickerEmojiCell.getSticker()) && !AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium()) {
                ContentPreviewViewer.getInstance().showMenuFor(stickerEmojiCell);
                return;
            }
            ContentPreviewViewer.getInstance().reset();
            if (stickerEmojiCell.isDisabled()) {
                return;
            }
            stickerEmojiCell.disable();
            this.delegate.onStickerSelected(stickerEmojiCell, stickerEmojiCell.getSticker(), str, stickerEmojiCell.getParentObject(), stickerEmojiCell.getSendAnimationData(), true, 0, 0);
        }
    }

    public void lambda$new$11(View view) {
        this.stickersSearchGridAdapter.resetSelectedPackId();
    }

    class AnonymousClass23 extends DraggableScrollSlidingTabStrip {
        final BaseFragment val$fragment;
        final boolean val$shouldDrawBackground;

        public static void lambda$sendReorder$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        AnonymousClass23(Context context, Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment, boolean z) {
            super(context, resourcesProvider);
            this.val$fragment = baseFragment;
            this.val$shouldDrawBackground = z;
        }

        @Override
        protected void updatePosition() {
            EmojiView.this.updateStickerTabsPosition();
            if (EmojiView.this.stickersTabContainer != null) {
                EmojiView.this.stickersTabContainer.invalidate();
            }
            invalidate();
            if (EmojiView.this.delegate != null) {
                EmojiView.this.delegate.invalidateEnterView();
            }
        }

        @Override
        protected void stickerSetPositionChanged(int i, int i2) {
            int i3 = i - EmojiView.this.stickersTabOffset;
            int i4 = i2 - EmojiView.this.stickersTabOffset;
            MediaDataController mediaDataController = MediaDataController.getInstance(EmojiView.this.currentAccount);
            swapListElements(EmojiView.this.stickerSets, i3, i4);
            Collections.sort(mediaDataController.getStickerSets(0), new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return this.f$0.lambda$stickerSetPositionChanged$0((TLRPC.TL_messages_stickerSet) obj, (TLRPC.TL_messages_stickerSet) obj2);
                }
            });
            ArrayList arrayList = EmojiView.this.frozenStickerSets;
            if (arrayList != null) {
                arrayList.clear();
                EmojiView emojiView = EmojiView.this;
                emojiView.frozenStickerSets.addAll(emojiView.stickerSets);
            }
            EmojiView.this.reloadStickersAdapter();
            AndroidUtilities.cancelRunOnUIThread(EmojiView.this.checkExpandStickerTabsRunnable);
            AndroidUtilities.runOnUIThread(EmojiView.this.checkExpandStickerTabsRunnable, 1500L);
            sendReorder();
            EmojiView.this.updateStickerTabs(true);
            if (SharedConfig.updateStickersOrderOnSend) {
                SharedConfig.toggleUpdateStickersOrderOnSend();
                BaseFragment baseFragment = this.val$fragment;
                if (baseFragment == null) {
                    if (EmojiView.this.bulletinContainer != null) {
                        BulletinFactory.of(EmojiView.this.bulletinContainer, EmojiView.this.resourcesProvider).createSimpleBulletin(R.raw.filter_reorder, LocaleController.getString(R.string.DynamicPackOrderOff), LocaleController.getString(R.string.DynamicPackOrderOffInfo)).show();
                        return;
                    }
                    return;
                }
                BulletinFactory bulletinFactoryOf = BulletinFactory.of(baseFragment);
                int i5 = R.raw.filter_reorder;
                String string = LocaleController.getString(R.string.DynamicPackOrderOff);
                String string2 = LocaleController.getString(R.string.DynamicPackOrderOffInfo);
                String string3 = LocaleController.getString("Settings");
                final BaseFragment baseFragment2 = this.val$fragment;
                bulletinFactoryOf.createSimpleBulletin(i5, string, string2, string3, new Runnable() {
                    @Override
                    public final void run() {
                        EmojiView.AnonymousClass23.lambda$stickerSetPositionChanged$1(baseFragment2);
                    }
                }).show();
            }
        }

        public int lambda$stickerSetPositionChanged$0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet2) {
            int iIndexOf = EmojiView.this.stickerSets.indexOf(tL_messages_stickerSet);
            int iIndexOf2 = EmojiView.this.stickerSets.indexOf(tL_messages_stickerSet2);
            if (iIndexOf < 0 || iIndexOf2 < 0) {
                return 0;
            }
            return iIndexOf - iIndexOf2;
        }

        public static void lambda$stickerSetPositionChanged$1(BaseFragment baseFragment) {
            baseFragment.presentFragment(new StickersActivity(0, null));
        }

        private void swapListElements(List list, int i, int i2) {
            list.add(i2, (TLRPC.TL_messages_stickerSet) list.remove(i));
        }

        private void sendReorder() {
            MediaDataController.getInstance(EmojiView.this.currentAccount).calcNewHash(0);
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            tL_messages_reorderStickerSets.masks = false;
            tL_messages_reorderStickerSets.emojis = false;
            for (?? r3 = EmojiView.this.hasChatStickers; r3 < EmojiView.this.stickerSets.size(); r3++) {
                tL_messages_reorderStickerSets.order.add(Long.valueOf(((TLRPC.TL_messages_stickerSet) EmojiView.this.stickerSets.get(r3)).set.id));
            }
            ConnectionsManager.getInstance(EmojiView.this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    EmojiView.AnonymousClass23.lambda$sendReorder$2(tLObject, tL_error);
                }
            });
            NotificationCenter.getInstance(EmojiView.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stickersDidLoad, 0, Boolean.TRUE);
        }

        @Override
        protected void invalidateOverlays() {
            if (EmojiView.this.stickersTabContainer != null) {
                EmojiView.this.stickersTabContainer.invalidate();
            }
        }

        @Override
        public void setTranslationY(float f) {
            if (getTranslationY() != f) {
                super.setTranslationY(f);
                if (this.val$shouldDrawBackground) {
                    return;
                }
                EmojiView.this.stickersContainer.invalidate();
            }
        }
    }

    public void lambda$new$12(int i) {
        if (this.firstTabUpdate) {
            return;
        }
        if (i == this.trendingTabNum) {
            openTrendingStickers(null);
            return;
        }
        SearchField searchField = this.stickersSearchField;
        if (searchField != null && searchField.isCategorySelected()) {
            this.stickersSearchField.search(null, false);
            this.stickersSearchField.categoriesListView.selectCategory((StickerCategoriesListView.EmojiCategory) null);
        }
        if (i == this.recentTabNum) {
            this.stickersGridView.stopScroll();
            scrollStickersToPosition(this.stickersGridAdapter.getPositionForPack("recent"), 0);
            resetTabsY(0);
            ScrollSlidingTabStrip scrollSlidingTabStrip = this.stickersTab;
            int i2 = this.recentTabNum;
            scrollSlidingTabStrip.onPageScrolled(i2, i2 > 0 ? i2 : this.stickersTabOffset);
            return;
        }
        if (i == this.favTabNum) {
            this.stickersGridView.stopScroll();
            scrollStickersToPosition(this.stickersGridAdapter.getPositionForPack("fav"), 0);
            resetTabsY(0);
            ScrollSlidingTabStrip scrollSlidingTabStrip2 = this.stickersTab;
            int i3 = this.favTabNum;
            scrollSlidingTabStrip2.onPageScrolled(i3, i3 > 0 ? i3 : this.stickersTabOffset);
            return;
        }
        if (i == this.premiumTabNum) {
            this.stickersGridView.stopScroll();
            scrollStickersToPosition(this.stickersGridAdapter.getPositionForPack("premium"), 0);
            resetTabsY(0);
            ScrollSlidingTabStrip scrollSlidingTabStrip3 = this.stickersTab;
            int i4 = this.premiumTabNum;
            scrollSlidingTabStrip3.onPageScrolled(i4, i4 > 0 ? i4 : this.stickersTabOffset);
            return;
        }
        int size = i - this.stickersTabOffset;
        if (size >= this.stickerSets.size()) {
            return;
        }
        if (size >= this.stickerSets.size()) {
            size = this.stickerSets.size() - 1;
        }
        this.firstStickersAttach = false;
        this.stickersGridView.stopScroll();
        scrollStickersToPosition(this.stickersGridAdapter.getPositionForPack(this.stickerSets.get(size)), 0);
        resetTabsY(0);
        checkScroll(0);
        int i5 = this.favTabNum;
        if (i5 <= 0 && (i5 = this.recentTabNum) <= 0) {
            i5 = this.stickersTabOffset;
        }
        this.stickersTab.onPageScrolled(i, i5);
        this.expandStickersByDragg = false;
        updateStickerTabsPosition();
    }

    public void lambda$new$13(View view) {
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate != null) {
            emojiViewDelegate.onStickersSettingsClick();
        }
    }

    public void lambda$new$14(View view) {
        SearchField searchField;
        int currentItem = this.pager.getCurrentItem();
        if (currentItem == 0) {
            searchField = this.emojiSearchField;
        } else if (currentItem == 1) {
            searchField = this.gifSearchField;
        } else {
            searchField = this.stickersSearchField;
        }
        if (searchField == null) {
            return;
        }
        searchField.searchEditText.requestFocus();
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
        searchField.searchEditText.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
        searchField.searchEditText.onTouchEvent(motionEventObtain2);
        motionEventObtain2.recycle();
    }

    public void lambda$new$15(Integer num, Integer num2) {
        ImageViewEmoji imageViewEmoji = this.emojiTouchedView;
        if (imageViewEmoji == null || !(imageViewEmoji.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            return;
        }
        ((CompoundEmoji.CompoundEmojiDrawable) this.emojiTouchedView.getDrawable()).update(num.intValue(), num2.intValue());
        String str = (String) this.emojiTouchedView.getTag();
        if (num.intValue() == -1 && num2.intValue() == -1) {
            Emoji.emojiColor.remove(str);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(num.intValue() >= 0 ? CompoundEmoji.skinTones.get(num.intValue()) : "");
            sb.append("\u200d");
            sb.append(num2.intValue() >= 0 ? CompoundEmoji.skinTones.get(num2.intValue()) : "");
            Emoji.emojiColor.put(str, sb.toString());
        }
        Emoji.saveEmojiColors();
    }

    public void lambda$new$16(View view, RectF rectF) {
        invalidateBlurCaptures();
    }

    public void lambda$new$17() {
        this.emojiGridView.postOnAnimation(new EmojiView$$ExternalSyntheticLambda27(this));
    }

    public void lambda$new$18() {
        this.gifGridView.postOnAnimation(new EmojiView$$ExternalSyntheticLambda27(this));
    }

    public void lambda$new$19() {
        this.stickersGridView.postOnAnimation(new EmojiView$$ExternalSyntheticLambda27(this));
    }

    public boolean lambda$new$20(Canvas canvas, View view, long j) {
        if (view instanceof RecyclerListViewWithOverlayDraw.OverlayView) {
            canvas.save();
            canvas.translate(view.getX(), view.getY());
            ((RecyclerListViewWithOverlayDraw.OverlayView) view).preDraw(this.stickersGridView, canvas);
            canvas.restore();
        }
        return this.stickersGridView.drawChild(canvas, view, j);
    }

    public static void lambda$new$21(IBlur3Capture[] iBlur3CaptureArr, Canvas canvas, RectF rectF) {
        for (IBlur3Capture iBlur3Capture : iBlur3CaptureArr) {
            if (iBlur3Capture != null) {
                iBlur3Capture.capture(canvas, rectF);
            }
        }
    }

    public void forceHideSettingsButton() {
        this.mForceHideSettingsButton = true;
        ImageView imageView = this.stickerSettingsButton;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void forceHideBackspaceButton() {
        this.mForceHideBackspaceButton = true;
        ImageView imageView = this.backspaceButton;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void hideBottomTabContainerBackground() {
        View view = this.bottomTabContainerBackground;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void setBlurredBackgroundDrawableFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        ImageView imageView = this.backspaceButton;
        if (imageView != null) {
            imageView.setBackground(blurredBackgroundDrawableViewFactory.create(imageView).setColorProvider(BlurredBackgroundProviderImpl.emojiViewButton(this.resourcesProvider)).setRadius(AndroidUtilities.dp(18.0f)).setPadding(AndroidUtilities.dp(6.0f)));
        }
        ImageView imageView2 = this.searchButton;
        if (imageView2 != null) {
            imageView2.setBackground(blurredBackgroundDrawableViewFactory.create(imageView2).setColorProvider(BlurredBackgroundProviderImpl.emojiViewButton(this.resourcesProvider)).setRadius(AndroidUtilities.dp(18.0f)).setPadding(AndroidUtilities.dp(6.0f)));
        }
        PagerSlidingTabStrip pagerSlidingTabStrip = this.typeTabs;
        if (pagerSlidingTabStrip != null) {
            pagerSlidingTabStrip.setBackground(blurredBackgroundDrawableViewFactory.create(pagerSlidingTabStrip).setColorProvider(BlurredBackgroundProviderImpl.emojiViewButton(this.resourcesProvider)).setRadius(AndroidUtilities.dp(18.0f)).setPadding(AndroidUtilities.dp(6.0f)));
        }
        ImageView imageView3 = this.stickerSettingsButton;
        if (imageView3 != null) {
            imageView3.setBackground(blurredBackgroundDrawableViewFactory.create(imageView3).setColorProvider(BlurredBackgroundProviderImpl.emojiViewButton(this.resourcesProvider)).setRadius(AndroidUtilities.dp(18.0f)).setPadding(AndroidUtilities.dp(6.0f)));
        }
    }

    public void setBottomInset(int i) {
        if (this.bottomInset != i) {
            this.bottomInset = i;
            applyBottomInsetAsPadding(this.emojiAddPackButtonContainer, i);
            applyBottomInsetAsPadding(this.stickerAddPackButtonContainer, i);
            applyBottomInsetAsPadding(this.emojiGridView, AndroidUtilities.dp(44.0f) + i);
            applyBottomInsetAsPadding(this.stickersGridView, AndroidUtilities.dp(44.0f) + i);
            applyBottomInsetAsPadding(this.gifGridView, AndroidUtilities.dp(44.0f) + i);
            FrameLayout frameLayout = this.bulletinContainer2;
            if (frameLayout != null) {
                frameLayout.setTranslationY(-i);
            }
            updateBottomTabContainerPosition();
            invalidate();
        }
    }

    @Override
    public void applyNavigationBarHeight(int i) {
        setBottomInset(i);
    }

    @Override
    public void applyInAppKeyboardAnimatedHeight(float f) {
        this.visibleInAppKeyboardHeight = f;
        updateBottomTabContainerPosition();
    }

    private static void applyBottomInsetAsPadding(View view, int i) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    class EmojiGridView extends RecyclerListView {
        private SparseIntArray headerWidthsCache;
        private boolean ignoreLayout;
        private int lastChildCount;
        ArrayList lineDrawables;
        ArrayList lineDrawablesTmp;
        private AnimatedFloat premiumT;
        private SparseArray touches;
        ArrayList unusedArrays;
        ArrayList unusedLineDrawables;
        SparseArray viewsGroupedByLines;

        public EmojiGridView(Context context) {
            super(context);
            this.viewsGroupedByLines = new SparseArray();
            this.lineDrawables = new ArrayList();
            this.lineDrawablesTmp = new ArrayList();
            this.unusedArrays = new ArrayList();
            this.unusedLineDrawables = new ArrayList();
            this.lastChildCount = -1;
            this.headerWidthsCache = new SparseIntArray();
            this.premiumT = new AnimatedFloat(this, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(motionEvent) || ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, this, 0, EmojiView.this.contentPreviewViewerDelegate, this.resourcesProvider);
        }

        private AnimatedEmojiSpan[] getAnimatedEmojiSpans() {
            AnimatedEmojiSpan[] animatedEmojiSpanArr = new AnimatedEmojiSpan[EmojiView.this.emojiGridView.getChildCount()];
            for (int i = 0; i < EmojiView.this.emojiGridView.getChildCount(); i++) {
                View childAt = EmojiView.this.emojiGridView.getChildAt(i);
                if (childAt instanceof ImageViewEmoji) {
                    animatedEmojiSpanArr[i] = ((ImageViewEmoji) childAt).getSpan();
                }
            }
            return animatedEmojiSpanArr;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            this.ignoreLayout = true;
            int size = View.MeasureSpec.getSize(i);
            int spanCount = EmojiView.this.emojiLayoutManager.getSpanCount();
            EmojiView.this.emojiLayoutManager.setSpanCount(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
            this.ignoreLayout = false;
            super.onMeasure(i, i2);
            if (spanCount != EmojiView.this.emojiLayoutManager.getSpanCount()) {
                EmojiView.this.emojiAdapter.notifyDataSetChanged();
            }
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            if (EmojiView.this.needEmojiSearch && EmojiView.this.firstEmojiAttach) {
                this.ignoreLayout = true;
                EmojiView.this.emojiLayoutManager.scrollToPositionWithOffset(0, 0);
                EmojiView.this.firstEmojiAttach = false;
                this.ignoreLayout = false;
            }
            super.onLayout(z, i, i2, i3, i4);
            EmojiView.this.checkEmojiSearchFieldScroll(true);
            updateEmojiDrawables();
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (EmojiView.this.emojiTouchedView != null && EmojiView.this.colorPickerView != null) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (EmojiView.this.colorPickerView != null && EmojiView.this.colorPickerView.isShowing() && !EmojiView.this.colorPickerView.isCompound()) {
                        EmojiView.this.colorPickerView.dismiss();
                        String skinTone = EmojiView.this.colorPickerView.getSkinTone(0);
                        String strAddColorToCode = (String) EmojiView.this.emojiTouchedView.getTag();
                        if (!EmojiView.this.emojiTouchedView.isRecent) {
                            if (skinTone != null) {
                                Emoji.emojiColor.put(strAddColorToCode, skinTone);
                                strAddColorToCode = EmojiView.addColorToCode(strAddColorToCode, skinTone);
                            } else {
                                Emoji.emojiColor.remove(strAddColorToCode);
                            }
                            EmojiView.this.emojiTouchedView.setImageDrawable(Emoji.getEmojiBigDrawable(strAddColorToCode), EmojiView.this.emojiTouchedView.isRecent);
                            EmojiView emojiView = EmojiView.this;
                            emojiView.sendEmoji(emojiView.emojiTouchedView, null);
                            try {
                                performHapticFeedback(3, 1);
                            } catch (Exception unused) {
                            }
                            Emoji.saveEmojiColors();
                        } else {
                            String strReplace = strAddColorToCode.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                            if (skinTone != null) {
                                EmojiView emojiView2 = EmojiView.this;
                                emojiView2.sendEmoji(emojiView2.emojiTouchedView, EmojiView.addColorToCode(strReplace, skinTone));
                            } else {
                                EmojiView emojiView3 = EmojiView.this;
                                emojiView3.sendEmoji(emojiView3.emojiTouchedView, strReplace);
                            }
                        }
                    }
                    if (EmojiView.this.colorPickerView == null || !EmojiView.this.colorPickerView.isCompound()) {
                        EmojiView.this.emojiTouchedView = null;
                    }
                    EmojiView.this.emojiTouchedX = -10000.0f;
                    EmojiView.this.emojiTouchedY = -10000.0f;
                } else if (motionEvent.getAction() == 2) {
                    if (EmojiView.this.emojiTouchedX == -10000.0f) {
                        getLocationOnScreen(EmojiView.this.location);
                        float x = EmojiView.this.location[0] + motionEvent.getX();
                        EmojiView.this.colorPickerView.pickerView.getLocationOnScreen(EmojiView.this.location);
                        EmojiView.this.colorPickerView.onTouchMove((int) (x - (EmojiView.this.location[0] + AndroidUtilities.dp(3.0f))));
                    } else if (Math.abs(EmojiView.this.emojiTouchedX - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(EmojiView.this.emojiTouchedY - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        EmojiView.this.emojiTouchedX = -10000.0f;
                        EmojiView.this.emojiTouchedY = -10000.0f;
                        getLocationOnScreen(EmojiView.this.location);
                        float x2 = EmojiView.this.location[0] + motionEvent.getX();
                        EmojiView.this.colorPickerView.pickerView.getLocationOnScreen(EmojiView.this.location);
                        EmojiView.this.colorPickerView.onTouchMove((int) (x2 - (EmojiView.this.location[0] + AndroidUtilities.dp(3.0f))));
                    }
                }
                if (EmojiView.this.colorPickerView == null || !EmojiView.this.colorPickerView.isCompound() || EmojiView.this.colorPickerView.isShowing()) {
                    return true;
                }
            }
            EmojiView.this.emojiLastX = motionEvent.getX();
            EmojiView.this.emojiLastY = motionEvent.getY();
            return super.onTouchEvent(motionEvent);
        }

        public void updateEmojiDrawables() {
            EmojiView emojiView = EmojiView.this;
            emojiView.animatedEmojiDrawables = AnimatedEmojiSpan.update(emojiView.emojiCacheType, this, getAnimatedEmojiSpans(), (LongSparseArray<AnimatedEmojiDrawable>) EmojiView.this.animatedEmojiDrawables);
        }

        @Override
        public void onScrollStateChanged(int i) {
            super.onScrollStateChanged(i);
            if (i == 0) {
                if (!canScrollVertically(-1) || !canScrollVertically(1)) {
                    EmojiView.this.showBottomTab(true, true);
                }
                if (canScrollVertically(1)) {
                    return;
                }
                EmojiView.this.checkTabsY(1, AndroidUtilities.dp(36.0f));
            }
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.lastChildCount != getChildCount()) {
                updateEmojiDrawables();
                this.lastChildCount = getChildCount();
            }
            for (int i = 0; i < this.viewsGroupedByLines.size(); i++) {
                ArrayList arrayList = (ArrayList) this.viewsGroupedByLines.valueAt(i);
                arrayList.clear();
                this.unusedArrays.add(arrayList);
            }
            this.viewsGroupedByLines.clear();
            boolean z = EmojiView.this.animateExpandStartTime > 0 && SystemClock.elapsedRealtime() - EmojiView.this.animateExpandStartTime < animateExpandDuration() && EmojiView.this.animateExpandFromButton != null && EmojiView.this.animateExpandFromPosition >= 0;
            if (EmojiView.this.animatedEmojiDrawables != null && EmojiView.this.emojiGridView != null) {
                for (int i2 = 0; i2 < EmojiView.this.emojiGridView.getChildCount(); i2++) {
                    View childAt = EmojiView.this.emojiGridView.getChildAt(i2);
                    if (childAt instanceof ImageViewEmoji) {
                        int top = childAt.getTop() + ((int) childAt.getTranslationY());
                        ArrayList arrayList2 = (ArrayList) this.viewsGroupedByLines.get(top);
                        if (arrayList2 == null) {
                            if (!this.unusedArrays.isEmpty()) {
                                ArrayList arrayList3 = this.unusedArrays;
                                arrayList2 = (ArrayList) arrayList3.remove(arrayList3.size() - 1);
                            } else {
                                arrayList2 = new ArrayList();
                            }
                            this.viewsGroupedByLines.put(top, arrayList2);
                        }
                        arrayList2.add((ImageViewEmoji) childAt);
                    }
                    if (z && childAt != null && getChildAdapterPosition(childAt) == EmojiView.this.animateExpandFromPosition - 1) {
                        float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((SystemClock.elapsedRealtime() - EmojiView.this.animateExpandStartTime) / 140.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f = 1.0f - interpolation;
                            canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f), 31);
                            canvas.translate(childAt.getLeft(), childAt.getTop());
                            float f2 = (f * 0.5f) + 0.5f;
                            canvas.scale(f2, f2, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                            EmojiView.this.animateExpandFromButton.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            this.lineDrawablesTmp.clear();
            this.lineDrawablesTmp.addAll(this.lineDrawables);
            this.lineDrawables.clear();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i3 = 0;
            while (true) {
                DrawingInBackgroundLine drawingInBackgroundLine = null;
                if (i3 >= this.viewsGroupedByLines.size()) {
                    break;
                }
                ArrayList arrayList4 = (ArrayList) this.viewsGroupedByLines.valueAt(i3);
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) arrayList4.get(0);
                int i4 = imageViewEmoji.position;
                for (int i5 = 0; i5 < this.lineDrawablesTmp.size(); i5++) {
                    if (((DrawingInBackgroundLine) this.lineDrawablesTmp.get(i5)).position == i4) {
                        drawingInBackgroundLine = (DrawingInBackgroundLine) this.lineDrawablesTmp.get(i5);
                        this.lineDrawablesTmp.remove(i5);
                        break;
                    }
                }
                if (drawingInBackgroundLine == null) {
                    if (!this.unusedLineDrawables.isEmpty()) {
                        ArrayList arrayList5 = this.unusedLineDrawables;
                        drawingInBackgroundLine = (DrawingInBackgroundLine) arrayList5.remove(arrayList5.size() - 1);
                    } else {
                        drawingInBackgroundLine = new DrawingInBackgroundLine();
                    }
                    drawingInBackgroundLine.position = i4;
                    drawingInBackgroundLine.onAttachToWindow();
                }
                this.lineDrawables.add(drawingInBackgroundLine);
                drawingInBackgroundLine.imageViewEmojis = arrayList4;
                canvas.save();
                canvas.translate(imageViewEmoji.getLeft(), imageViewEmoji.getY() + imageViewEmoji.getPaddingTop());
                drawingInBackgroundLine.startOffset = imageViewEmoji.getLeft();
                int measuredWidth = getMeasuredWidth() - (imageViewEmoji.getLeft() * 2);
                int measuredHeight = imageViewEmoji.getMeasuredHeight() - imageViewEmoji.getPaddingBottom();
                if (measuredWidth > 0 && measuredHeight > 0) {
                    drawingInBackgroundLine.draw(canvas, jCurrentTimeMillis, measuredWidth, measuredHeight, 1.0f);
                }
                canvas.restore();
                invalidate();
                i3++;
            }
            for (int i6 = 0; i6 < this.lineDrawablesTmp.size(); i6++) {
                if (this.unusedLineDrawables.size() < 3) {
                    this.unusedLineDrawables.add((DrawingInBackgroundLine) this.lineDrawablesTmp.get(i6));
                    ((DrawingInBackgroundLine) this.lineDrawablesTmp.get(i6)).imageViewEmojis = null;
                    ((DrawingInBackgroundLine) this.lineDrawablesTmp.get(i6)).reset();
                } else {
                    ((DrawingInBackgroundLine) this.lineDrawablesTmp.get(i6)).onDetachFromWindow();
                }
            }
            this.lineDrawablesTmp.clear();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateEmojiDrawables();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AnimatedEmojiSpan.release(this, (LongSparseArray<AnimatedEmojiDrawable>) EmojiView.this.animatedEmojiDrawables);
            for (int i = 0; i < this.lineDrawables.size(); i++) {
                ((DrawingInBackgroundLine) this.lineDrawables.get(i)).onDetachFromWindow();
            }
            for (int i2 = 0; i2 < this.unusedLineDrawables.size(); i2++) {
                ((DrawingInBackgroundLine) this.unusedLineDrawables.get(i2)).onDetachFromWindow();
            }
            this.unusedLineDrawables.addAll(this.lineDrawables);
            this.lineDrawables.clear();
        }

        class TouchDownInfo {
            long time;
            View view;
            float x;
            float y;

            TouchDownInfo() {
            }
        }

        public void clearTouchesFor(View view) {
            if (this.touches != null) {
                int i = 0;
                while (i < this.touches.size()) {
                    TouchDownInfo touchDownInfo = (TouchDownInfo) this.touches.valueAt(i);
                    if (touchDownInfo.view == view) {
                        this.touches.removeAt(i);
                        i--;
                        View view2 = touchDownInfo.view;
                        if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                            touchDownInfo.view.getBackground().setState(new int[0]);
                        }
                        View view3 = touchDownInfo.view;
                        if (view3 != null) {
                            view3.setPressed(false);
                        }
                    }
                    i++;
                }
            }
        }

        public void clearAllTouches() {
            if (this.touches != null) {
                while (this.touches.size() > 0) {
                    TouchDownInfo touchDownInfo = (TouchDownInfo) this.touches.valueAt(0);
                    this.touches.removeAt(0);
                    if (touchDownInfo != null) {
                        View view = touchDownInfo.view;
                        if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                            touchDownInfo.view.getBackground().setState(new int[0]);
                        }
                        View view2 = touchDownInfo.view;
                        if (view2 != null) {
                            view2.setPressed(false);
                        }
                    }
                }
            }
        }

        public long animateExpandDuration() {
            return animateExpandAppearDuration() + animateExpandCrossfadeDuration() + 150;
        }

        public long animateExpandAppearDuration() {
            return Math.max(600L, ((long) Math.min(55, EmojiView.this.animateExpandToPosition - EmojiView.this.animateExpandFromPosition)) * 40);
        }

        public long animateExpandCrossfadeDuration() {
            return Math.max(400L, ((long) Math.min(45, EmojiView.this.animateExpandToPosition - EmojiView.this.animateExpandFromPosition)) * 35);
        }

        class DrawingInBackgroundLine extends DrawingInBackgroundThreadDrawable {
            ArrayList imageViewEmojis;
            public int position;
            public int startOffset;
            ArrayList drawInBackgroundViews = new ArrayList();
            private OvershootInterpolator appearScaleInterpolator = new OvershootInterpolator(3.0f);

            DrawingInBackgroundLine() {
            }

            @Override
            public void draw(Canvas canvas, long j, int i, int i2, float f) {
                ArrayList arrayList = this.imageViewEmojis;
                if (arrayList == null) {
                    return;
                }
                int i3 = 0;
                boolean z = true;
                boolean z2 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(16388);
                if (!z2) {
                    boolean z3 = EmojiView.this.animateExpandStartTime > 0 && SystemClock.elapsedRealtime() - EmojiView.this.animateExpandStartTime < EmojiGridView.this.animateExpandDuration();
                    while (true) {
                        if (i3 >= this.imageViewEmojis.size()) {
                            z = z2;
                            break;
                        }
                        ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.imageViewEmojis.get(i3);
                        if (imageViewEmoji.pressedProgress != 0.0f || imageViewEmoji.backAnimator != null || (imageViewEmoji.position > EmojiView.this.animateExpandFromPosition && imageViewEmoji.position < EmojiView.this.animateExpandToPosition && z3)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else {
                    z = z2;
                    break;
                }
                if (z) {
                    prepareDraw(System.currentTimeMillis());
                    drawInUiThread(canvas, f);
                    reset();
                    return;
                }
                super.draw(canvas, j, i, i2, f);
            }

            @Override
            public void prepareDraw(long j) {
                AnimatedEmojiDrawable animatedEmojiDrawable;
                this.drawInBackgroundViews.clear();
                for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.imageViewEmojis.get(i);
                    if (imageViewEmoji.getSpan() != null && (animatedEmojiDrawable = (AnimatedEmojiDrawable) EmojiView.this.animatedEmojiDrawables.get(imageViewEmoji.span.getDocumentId())) != null && animatedEmojiDrawable.getImageReceiver() != null) {
                        animatedEmojiDrawable.update(j);
                        ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = imageViewEmoji.backgroundThreadDrawHolder;
                        int i2 = this.threadIndex;
                        ImageReceiver imageReceiver = animatedEmojiDrawable.getImageReceiver();
                        ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = imageViewEmoji.backgroundThreadDrawHolder;
                        int i3 = this.threadIndex;
                        backgroundThreadDrawHolderArr[i2] = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr2[i3], i3);
                        imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].time = j;
                        imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].overrideAlpha = 1.0f;
                        animatedEmojiDrawable.setAlpha(255);
                        int height = (int) (imageViewEmoji.getHeight() * 0.03f);
                        Rect rect = AndroidUtilities.rectTmp2;
                        rect.set((imageViewEmoji.getLeft() + imageViewEmoji.getPaddingLeft()) - this.startOffset, height, (imageViewEmoji.getRight() - imageViewEmoji.getPaddingRight()) - this.startOffset, ((imageViewEmoji.getMeasuredHeight() + height) - imageViewEmoji.getPaddingTop()) - imageViewEmoji.getPaddingBottom());
                        imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].setBounds(rect);
                        imageViewEmoji.drawable = animatedEmojiDrawable;
                        imageViewEmoji.imageReceiver = animatedEmojiDrawable.getImageReceiver();
                        imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].colorFilter = animatedEmojiDrawable.canOverrideColor() ? EmojiView.this.animatedEmojiTextColorFilter : null;
                        this.drawInBackgroundViews.add(imageViewEmoji);
                    }
                }
            }

            @Override
            public void drawInBackground(Canvas canvas) {
                for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.drawInBackgroundViews.get(i);
                    AnimatedEmojiDrawable animatedEmojiDrawable = imageViewEmoji.drawable;
                    if (animatedEmojiDrawable != null) {
                        animatedEmojiDrawable.draw(canvas, imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex], false);
                    }
                }
            }

            @Override
            protected void drawInUiThread(Canvas canvas, float f) {
                AnimatedEmojiDrawable animatedEmojiDrawable;
                if (this.imageViewEmojis != null) {
                    canvas.save();
                    float f2 = 0.0f;
                    canvas.translate(-this.startOffset, 0.0f);
                    float f3 = f;
                    int i = 0;
                    while (i < this.imageViewEmojis.size()) {
                        ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.imageViewEmojis.get(i);
                        if (imageViewEmoji.getSpan() != null && (animatedEmojiDrawable = (AnimatedEmojiDrawable) EmojiView.this.animatedEmojiDrawables.get(imageViewEmoji.span.getDocumentId())) != null) {
                            int height = (int) (imageViewEmoji.getHeight() * 0.03f);
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(imageViewEmoji.getLeft() + imageViewEmoji.getPaddingLeft(), height, imageViewEmoji.getRight() - imageViewEmoji.getPaddingRight(), ((imageViewEmoji.getMeasuredHeight() + height) - imageViewEmoji.getPaddingBottom()) - imageViewEmoji.getPaddingTop());
                            float f4 = imageViewEmoji.pressedProgress;
                            float interpolation = f4 != f2 ? (((1.0f - f4) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                            if (EmojiView.this.animateExpandStartTime > 0 && SystemClock.elapsedRealtime() - EmojiView.this.animateExpandStartTime < EmojiGridView.this.animateExpandDuration() && EmojiView.this.animateExpandFromPosition >= 0 && EmojiView.this.animateExpandToPosition >= 0 && EmojiView.this.animateExpandStartTime > 0) {
                                int childAdapterPosition = EmojiGridView.this.getChildAdapterPosition(imageViewEmoji) - EmojiView.this.animateExpandFromPosition;
                                int i2 = EmojiView.this.animateExpandToPosition - EmojiView.this.animateExpandFromPosition;
                                if (childAdapterPosition >= 0 && childAdapterPosition < i2) {
                                    float fAnimateExpandAppearDuration = EmojiGridView.this.animateExpandAppearDuration();
                                    float fClamp = MathUtils.clamp(((SystemClock.elapsedRealtime() - EmojiView.this.animateExpandStartTime) - (0.45f * fAnimateExpandAppearDuration)) / EmojiGridView.this.animateExpandCrossfadeDuration(), f2, 1.0f);
                                    float interpolation2 = CubicBezierInterpolator.EASE_OUT.getInterpolation(MathUtils.clamp((SystemClock.elapsedRealtime() - EmojiView.this.animateExpandStartTime) / fAnimateExpandAppearDuration, 0.0f, 1.0f));
                                    float f5 = childAdapterPosition;
                                    float f6 = i2;
                                    AndroidUtilities.cascade(fClamp, f5, f6, f6 / 5.0f);
                                    float f7 = f6 / 4.0f;
                                    float fCascade = AndroidUtilities.cascade(interpolation2, f5, f6, f7);
                                    int i3 = i2 / 4;
                                    interpolation *= (this.appearScaleInterpolator.getInterpolation(AndroidUtilities.cascade(interpolation2, childAdapterPosition + i3, i2 + i3, f7)) * 0.5f) + 0.5f;
                                    f3 *= fCascade;
                                }
                            }
                            animatedEmojiDrawable.setAlpha((int) (255.0f * f3));
                            animatedEmojiDrawable.setBounds(rect);
                            animatedEmojiDrawable.setColorFilter(EmojiView.this.animatedEmojiTextColorFilter);
                            if (interpolation != 1.0f) {
                                canvas.save();
                                canvas.scale(interpolation, interpolation, rect.centerX(), rect.centerY());
                                animatedEmojiDrawable.draw(canvas);
                                canvas.restore();
                            } else {
                                animatedEmojiDrawable.draw(canvas);
                            }
                        }
                        i++;
                        f2 = 0.0f;
                    }
                    canvas.restore();
                }
            }

            @Override
            public void onFrameReady() {
                super.onFrameReady();
                for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                    ImageViewEmoji imageViewEmoji = (ImageViewEmoji) this.drawInBackgroundViews.get(i);
                    if (imageViewEmoji.backgroundThreadDrawHolder != null) {
                        imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].release();
                    }
                }
                EmojiView.this.emojiGridView.invalidate();
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            View view;
            View view2;
            boolean z = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
            boolean z2 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
            boolean z3 = motionEvent.getActionMasked() == 3;
            if (z || z2 || z3) {
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                if (this.touches == null) {
                    this.touches = new SparseArray();
                }
                float x = motionEvent.getX(actionIndex);
                float y = motionEvent.getY(actionIndex);
                View viewFindChildViewUnder = findChildViewUnder(x, y);
                if (!z) {
                    TouchDownInfo touchDownInfo = (TouchDownInfo) this.touches.get(pointerId);
                    this.touches.remove(pointerId);
                    if (viewFindChildViewUnder != null && touchDownInfo != null && Math.sqrt(Math.pow(x - touchDownInfo.x, 2.0d) + Math.pow(y - touchDownInfo.y, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z3 && (!EmojiView.this.colorPickerView.isShowing() || SystemClock.elapsedRealtime() - touchDownInfo.time < ViewConfiguration.getLongPressTimeout())) {
                        View view3 = touchDownInfo.view;
                        int childAdapterPosition = getChildAdapterPosition(view3);
                        try {
                            if (view3 instanceof ImageViewEmoji) {
                                EmojiView.this.sendEmoji((ImageViewEmoji) view3, null);
                                performHapticFeedback(3, 1);
                            } else if (view3 instanceof EmojiPackExpand) {
                                EmojiView.this.emojiAdapter.expand(childAdapterPosition, (EmojiPackExpand) view3);
                                performHapticFeedback(3, 1);
                            } else if (view3 != null) {
                                view3.callOnClick();
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (touchDownInfo != null && (view2 = touchDownInfo.view) != null && (view2.getBackground() instanceof RippleDrawable)) {
                        touchDownInfo.view.getBackground().setState(new int[0]);
                    }
                    if (touchDownInfo != null && (view = touchDownInfo.view) != null) {
                        view.setPressed(false);
                    }
                } else if (viewFindChildViewUnder != null) {
                    TouchDownInfo touchDownInfo2 = new TouchDownInfo();
                    touchDownInfo2.x = x;
                    touchDownInfo2.y = y;
                    touchDownInfo2.time = SystemClock.elapsedRealtime();
                    touchDownInfo2.view = viewFindChildViewUnder;
                    if (viewFindChildViewUnder.getBackground() instanceof RippleDrawable) {
                        viewFindChildViewUnder.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    touchDownInfo2.view.setPressed(true);
                    this.touches.put(pointerId, touchDownInfo2);
                    stopScroll();
                }
            }
            return super.dispatchTouchEvent(motionEvent) || (!z3 && this.touches.size() > 0);
        }
    }

    public void createStickersChooseActionTracker() {
        ChooseStickerActionTracker chooseStickerActionTracker = new ChooseStickerActionTracker(this.currentAccount, this.delegate.getDialogId(), this.delegate.getThreadId()) {
            @Override
            public boolean isShown() {
                return EmojiView.this.delegate != null && EmojiView.this.getVisibility() == 0 && EmojiView.this.stickersContainerAttached;
            }
        };
        this.chooseStickerActionTracker = chooseStickerActionTracker;
        chooseStickerActionTracker.checkVisibility();
    }

    public void updateEmojiTabsPosition() {
        updateEmojiTabsPosition(this.emojiLayoutManager.findFirstCompletelyVisibleItemPosition());
    }

    public void updateEmojiTabsPosition(int i) {
        if (this.emojiSmoothScrolling) {
            return;
        }
        int i2 = -1;
        if (i != -1) {
            int length = 0;
            int size = getRecentEmoji().size() + (this.needEmojiSearch ? 1 : 0) + (this.emojiAdapter.trendingHeaderRow >= 0 ? 3 : 0);
            if (i >= size) {
                int i3 = 0;
                while (true) {
                    String[][] strArr = EmojiData.dataColored;
                    if (i3 >= strArr.length) {
                        break;
                    }
                    size += strArr[i3].length + 1;
                    if (i < size) {
                        i2 = i3 + 1;
                        break;
                    }
                    i3++;
                }
                if (i2 >= 0) {
                    length = i2;
                    break;
                }
                ArrayList<EmojiPack> emojipacks = getEmojipacks();
                int size2 = this.emojiAdapter.packStartPosition.size() - 1;
                while (true) {
                    if (size2 >= 0) {
                        if (((Integer) this.emojiAdapter.packStartPosition.get(size2)).intValue() <= i) {
                            EmojiPack emojiPack = (EmojiPack) this.emojipacksProcessed.get(size2);
                            while (true) {
                                if (length < emojipacks.size()) {
                                    long j = emojipacks.get(length).set.id;
                                    long j2 = emojiPack.set.id;
                                    if (j == j2 && (!emojiPack.featured || (!emojiPack.installed && !this.installedEmojiSets.contains(Long.valueOf(j2))))) {
                                        length += EmojiData.dataColored.length + 1;
                                        break;
                                    }
                                    length++;
                                }
                            }
                        } else {
                            size2--;
                        }
                    }
                    length = i2;
                    break;
                }
            }
            if (length >= 0) {
                this.emojiTabs.select(length);
            }
        }
    }

    public void checkGridVisibility(int i, float f) {
        if (this.stickersContainer == null || this.gifContainer == null) {
            return;
        }
        if (i == 0) {
            this.emojiGridView.setVisibility(0);
            this.gifGridView.setVisibility(f == 0.0f ? 8 : 0);
            this.gifTabs.setVisibility(f == 0.0f ? 8 : 0);
            this.stickersGridView.setVisibility(8);
            FrameLayout frameLayout = this.stickersTabContainer;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (i == 1) {
            this.emojiGridView.setVisibility(8);
            this.gifGridView.setVisibility(0);
            this.gifTabs.setVisibility(0);
            this.stickersGridView.setVisibility(f == 0.0f ? 8 : 0);
            FrameLayout frameLayout2 = this.stickersTabContainer;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(f == 0.0f ? 8 : 0);
                return;
            }
            return;
        }
        if (i == 2) {
            this.emojiGridView.setVisibility(8);
            this.gifGridView.setVisibility(8);
            this.gifTabs.setVisibility(8);
            this.stickersGridView.setVisibility(0);
            FrameLayout frameLayout3 = this.stickersTabContainer;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
        }
    }

    public void openPremiumAnimatedEmojiFeature() {
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate != null) {
            emojiViewDelegate.onAnimatedEmojiUnlockClick();
        }
    }

    private class EmojiPackButton extends FrameLayout {
        AnimatedTextView addButtonTextView;
        FrameLayout addButtonView;
        PremiumButtonView premiumButtonView;

        public EmojiPackButton(Context context) {
            super(context);
            AnimatedTextView animatedTextView = new AnimatedTextView(getContext());
            this.addButtonTextView = animatedTextView;
            animatedTextView.setAnimationProperties(0.3f, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.addButtonTextView.setTextSize(AndroidUtilities.dp(14.0f));
            this.addButtonTextView.setTypeface(AndroidUtilities.bold());
            this.addButtonTextView.setTextColor(EmojiView.this.getThemedColor(Theme.key_featuredStickers_buttonText));
            this.addButtonTextView.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.addButtonView = frameLayout;
            frameLayout.setBackground(Theme.AdaptiveRipple.filledRect(EmojiView.this.getThemedColor(Theme.key_featuredStickers_addButton), 8.0f));
            this.addButtonView.addView(this.addButtonTextView, LayoutHelper.createFrame(-1, -2, 17));
            addView(this.addButtonView, LayoutHelper.createFrame(-1, -1.0f));
            PremiumButtonView premiumButtonView = new PremiumButtonView(getContext(), false, EmojiView.this.resourcesProvider);
            this.premiumButtonView = premiumButtonView;
            premiumButtonView.setIcon(R.raw.unlock_icon);
            addView(this.premiumButtonView, LayoutHelper.createFrame(-1, -1.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f));
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f) + getPaddingTop() + getPaddingBottom(), 1073741824));
        }
    }

    class EmojiPackHeader extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        TextView addButtonView;
        FrameLayout buttonsView;
        private int currentButtonState;
        boolean divider;
        private Paint dividerPaint;
        SimpleTextView headerView;
        RLottieImageView lockView;
        TextView markView;
        private EmojiPack pack;
        PremiumButtonView premiumButtonView;
        TextView removeButtonView;
        private AnimatorSet stateAnimator;
        private TLRPC.InputStickerSet toInstall;
        private TLRPC.InputStickerSet toUninstall;

        public EmojiPackHeader(Context context) {
            super(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.lockView = rLottieImageView;
            int i = R.raw.unlock_icon;
            rLottieImageView.setAnimation(i, 24, 24);
            RLottieImageView rLottieImageView2 = this.lockView;
            int i2 = Theme.key_chat_emojiPanelStickerSetName;
            rLottieImageView2.setColorFilter(EmojiView.this.getThemedColor(i2));
            addView(this.lockView, LayoutHelper.createFrameRelatively(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.headerView = simpleTextView;
            simpleTextView.setTextSize(15);
            this.headerView.setTextColor(EmojiView.this.getThemedColor(i2));
            this.headerView.setTypeface(AndroidUtilities.bold());
            this.headerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(view);
                }
            });
            TextView textView = new TextView(context);
            this.markView = textView;
            textView.setTextSize(1, 11.0f);
            this.markView.setTextColor(EmojiView.this.getThemedColor(i2));
            this.markView.setTypeface(AndroidUtilities.bold());
            this.markView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.multAlpha(EmojiView.this.getThemedColor(Theme.key_chat_emojiPanelIcon), 0.12f)));
            this.markView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.5f));
            this.markView.setText(LocaleController.getString(R.string.GroupEmoji));
            this.headerView.setEllipsizeByGradient(true);
            addView(this.headerView, LayoutHelper.createFrameRelatively(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
            addView(this.markView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            this.buttonsView = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), 0);
            this.buttonsView.setClipToPadding(false);
            this.buttonsView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$1(view);
                }
            });
            addView(this.buttonsView, LayoutHelper.createFrameRelatively(-2.0f, -1.0f, 8388725));
            TextView textView2 = new TextView(context);
            this.addButtonView = textView2;
            textView2.setTextSize(1, 14.0f);
            this.addButtonView.setTypeface(AndroidUtilities.bold());
            this.addButtonView.setText(LocaleController.getString(R.string.Add));
            this.addButtonView.setTextColor(EmojiView.this.getThemedColor(Theme.key_featuredStickers_buttonText));
            TextView textView3 = this.addButtonView;
            int i3 = Theme.key_featuredStickers_addButton;
            textView3.setBackground(Theme.AdaptiveRipple.createRect(EmojiView.this.getThemedColor(i3), EmojiView.this.getThemedColor(Theme.key_featuredStickers_addButtonPressed), 16.0f));
            this.addButtonView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            this.addButtonView.setGravity(17);
            this.addButtonView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$2(view);
                }
            });
            this.buttonsView.addView(this.addButtonView, LayoutHelper.createFrameRelatively(-2.0f, 26.0f, 8388661));
            TextView textView4 = new TextView(context);
            this.removeButtonView = textView4;
            textView4.setTextSize(1, 14.0f);
            this.removeButtonView.setTypeface(AndroidUtilities.bold());
            this.removeButtonView.setText(LocaleController.getString(R.string.StickersRemove));
            this.removeButtonView.setTextColor(EmojiView.this.getThemedColor(Theme.key_featuredStickers_removeButtonText));
            this.removeButtonView.setBackground(Theme.AdaptiveRipple.createRect(0, EmojiView.this.getThemedColor(i3) & 452984831, 16.0f));
            this.removeButtonView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            this.removeButtonView.setGravity(17);
            this.removeButtonView.setTranslationX(AndroidUtilities.dp(4.0f));
            this.removeButtonView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$3(view);
                }
            });
            this.buttonsView.addView(this.removeButtonView, LayoutHelper.createFrameRelatively(-2.0f, 26.0f, 8388661));
            PremiumButtonView premiumButtonView = new PremiumButtonView(context, AndroidUtilities.dp(16.0f), false, EmojiView.this.resourcesProvider);
            this.premiumButtonView = premiumButtonView;
            premiumButtonView.setIcon(i);
            this.premiumButtonView.setButton(LocaleController.getString(R.string.Unlock), new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$4(view);
                }
            });
            try {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.premiumButtonView.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                int iDp = AndroidUtilities.dp(20.0f);
                marginLayoutParams.height = iDp;
                marginLayoutParams.width = iDp;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.premiumButtonView.getTextView().getLayoutParams();
                marginLayoutParams2.leftMargin = AndroidUtilities.dp(5.0f);
                marginLayoutParams2.topMargin = AndroidUtilities.dp(-0.5f);
                this.premiumButtonView.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            } catch (Exception unused) {
            }
            this.buttonsView.addView(this.premiumButtonView, LayoutHelper.createFrameRelatively(-2.0f, 26.0f, 8388661));
            setWillNotDraw(false);
        }

        public void lambda$new$0(View view) {
            TLRPC.StickerSet stickerSet;
            EmojiPack emojiPack = this.pack;
            if (emojiPack == null || (stickerSet = emojiPack.set) == null) {
                return;
            }
            EmojiView.this.openEmojiPackAlert(stickerSet);
        }

        public void lambda$new$1(View view) {
            TextView textView = this.addButtonView;
            if (textView != null && textView.getVisibility() == 0 && this.addButtonView.isEnabled()) {
                this.addButtonView.performClick();
                return;
            }
            TextView textView2 = this.removeButtonView;
            if (textView2 != null && textView2.getVisibility() == 0 && this.removeButtonView.isEnabled()) {
                this.removeButtonView.performClick();
                return;
            }
            PremiumButtonView premiumButtonView = this.premiumButtonView;
            if (premiumButtonView != null && premiumButtonView.getVisibility() == 0 && this.premiumButtonView.isEnabled()) {
                this.premiumButtonView.performClick();
            }
        }

        public void lambda$new$2(View view) {
            TLRPC.StickerSet stickerSet;
            View childAt;
            Integer numValueOf;
            int childAdapterPosition;
            int i;
            EmojiPack emojiPack = this.pack;
            if (emojiPack == null || (stickerSet = emojiPack.set) == null) {
                return;
            }
            emojiPack.installed = true;
            if (!EmojiView.this.installedEmojiSets.contains(Long.valueOf(stickerSet.id))) {
                EmojiView.this.installedEmojiSets.add(Long.valueOf(this.pack.set.id));
            }
            updateState(true);
            int i2 = 0;
            while (true) {
                if (i2 >= EmojiView.this.emojiGridView.getChildCount()) {
                    childAt = null;
                    numValueOf = null;
                    break;
                } else {
                    if ((EmojiView.this.emojiGridView.getChildAt(i2) instanceof EmojiPackExpand) && (childAdapterPosition = EmojiView.this.emojiGridView.getChildAdapterPosition((childAt = EmojiView.this.emojiGridView.getChildAt(i2)))) >= 0 && (i = EmojiView.this.emojiAdapter.positionToExpand.get(childAdapterPosition)) >= 0 && i < EmojiView.this.emojipacksProcessed.size() && EmojiView.this.emojipacksProcessed.get(i) != null && this.pack != null && ((EmojiPack) EmojiView.this.emojipacksProcessed.get(i)).set.id == this.pack.set.id) {
                        numValueOf = Integer.valueOf(childAdapterPosition);
                        break;
                    }
                    i2++;
                }
            }
            if (numValueOf != null) {
                EmojiView.this.emojiAdapter.expand(numValueOf.intValue(), childAt);
            }
            if (this.toInstall != null) {
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = this.pack.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
            if (stickerSet3 == null || stickerSet3.set == null) {
                NotificationCenter.getInstance(EmojiView.this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
                MediaDataController mediaDataController = MediaDataController.getInstance(EmojiView.this.currentAccount);
                this.toInstall = tL_inputStickerSetID;
                mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, false);
                return;
            }
            install(stickerSet3);
        }

        public void lambda$new$3(View view) {
            TLRPC.StickerSet stickerSet;
            EmojiPack emojiPack = this.pack;
            if (emojiPack == null || (stickerSet = emojiPack.set) == null) {
                return;
            }
            emojiPack.installed = false;
            EmojiView.this.installedEmojiSets.remove(Long.valueOf(stickerSet.id));
            updateState(true);
            if (EmojiView.this.emojiTabs != null) {
                EmojiView.this.emojiTabs.updateEmojiPacks(EmojiView.this.getEmojipacks());
            }
            EmojiView.this.updateEmojiTabsPosition();
            if (this.toUninstall != null) {
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet2 = this.pack.set;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
            if (stickerSet3 == null || stickerSet3.set == null) {
                NotificationCenter.getInstance(EmojiView.this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
                MediaDataController mediaDataController = MediaDataController.getInstance(EmojiView.this.currentAccount);
                this.toUninstall = tL_inputStickerSetID;
                mediaDataController.getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, false);
                return;
            }
            uninstall(stickerSet3);
        }

        public void lambda$new$4(View view) {
            EmojiView.this.openPremiumAnimatedEmojiFeature();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            ((ViewGroup.MarginLayoutParams) this.headerView.getLayoutParams()).topMargin = AndroidUtilities.dp(this.currentButtonState == 0 ? 10.0f : 15.0f);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.currentButtonState == 0 ? 32.0f : 42.0f), 1073741824));
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int width = this.buttonsView.getWidth() + AndroidUtilities.dp(11.0f) + (this.markView.getVisibility() == 0 ? this.markView.getMeasuredWidth() : 0);
            this.headerView.setRightPadding(width);
            if (this.markView.getVisibility() == 0) {
                this.markView.setTranslationX(this.headerView.getTextWidth() + AndroidUtilities.dp(4.0f));
                float maxTextWidth = (this.headerView.getMaxTextWidth() - width) + AndroidUtilities.dp(4.0f);
                if (this.markView.getTranslationX() > maxTextWidth) {
                    this.markView.setTranslationX(maxTextWidth);
                }
            }
        }

        public void setStickerSet(EmojiPack emojiPack, boolean z) {
            if (emojiPack == null) {
                return;
            }
            this.pack = emojiPack;
            this.divider = z;
            this.headerView.setText(emojiPack.set.title);
            this.markView.setVisibility(emojiPack.forGroup ? 0 : 8);
            if (emojiPack.installed && !emojiPack.set.official) {
                this.premiumButtonView.setButton(LocaleController.getString(R.string.Restore), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$setStickerSet$5(view);
                    }
                });
            } else {
                this.premiumButtonView.setButton(LocaleController.getString(R.string.Unlock), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$setStickerSet$6(view);
                    }
                });
            }
            updateState(false);
        }

        public void lambda$setStickerSet$5(View view) {
            EmojiView.this.openPremiumAnimatedEmojiFeature();
        }

        public void lambda$setStickerSet$6(View view) {
            EmojiView.this.openPremiumAnimatedEmojiFeature();
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            TLRPC.TL_messages_stickerSet stickerSetById;
            TLRPC.TL_messages_stickerSet stickerSetById2;
            if (i == NotificationCenter.groupStickersDidLoad) {
                if (this.toInstall != null && (stickerSetById2 = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSetById(this.toInstall.id)) != null && stickerSetById2.set != null) {
                    install(stickerSetById2);
                    this.toInstall = null;
                }
                if (this.toUninstall == null || (stickerSetById = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSetById(this.toUninstall.id)) == null || stickerSetById.set == null) {
                    return;
                }
                uninstall(stickerSetById);
                this.toUninstall = null;
            }
        }

        private BaseFragment getFragment() {
            if (EmojiView.this.fragment != null) {
                return EmojiView.this.fragment;
            }
            return new BaseFragment() {
                @Override
                public int getCurrentAccount() {
                    return EmojiView.this.currentAccount;
                }

                @Override
                public View getFragmentView() {
                    return EmojiView.this.bulletinContainer;
                }

                @Override
                public FrameLayout getLayoutContainer() {
                    return EmojiView.this.bulletinContainer;
                }

                @Override
                public Theme.ResourcesProvider getResourceProvider() {
                    return EmojiView.this.resourcesProvider;
                }
            };
        }

        private void install(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            EmojiPacksAlert.installSet(getFragment(), tL_messages_stickerSet, true, null, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$install$7();
                }
            });
        }

        public void lambda$install$7() {
            this.pack.installed = true;
            updateState(true);
        }

        private void uninstall(final TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            EmojiPacksAlert.uninstallSet(getFragment(), tL_messages_stickerSet, true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$uninstall$8(tL_messages_stickerSet);
                }
            }, false);
        }

        public void lambda$uninstall$8(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            this.pack.installed = true;
            if (!EmojiView.this.installedEmojiSets.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                EmojiView.this.installedEmojiSets.add(Long.valueOf(tL_messages_stickerSet.set.id));
            }
            updateState(true);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(EmojiView.this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.divider) {
                if (this.dividerPaint == null) {
                    Paint paint = new Paint(1);
                    this.dividerPaint = paint;
                    paint.setStrokeWidth(1.0f);
                    this.dividerPaint.setColor(EmojiView.this.getThemedColor(Theme.key_divider));
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.dividerPaint);
            }
            super.onDraw(canvas);
        }

        public void updateState(boolean z) {
            EmojiPack emojiPack = this.pack;
            if (emojiPack == null) {
                return;
            }
            int i = 1;
            boolean z2 = emojiPack.installed || EmojiView.this.installedEmojiSets.contains(Long.valueOf(emojiPack.set.id));
            if (this.pack.free || UserConfig.getInstance(EmojiView.this.currentAccount).isPremium() || EmojiView.this.allowEmojisForNonPremium) {
                if (this.pack.featured) {
                    i = z2 ? 3 : 2;
                } else {
                    i = 0;
                }
            }
            updateState(i, z);
        }

        public void updateState(final int i, boolean z) {
            int i2;
            float f;
            int i3;
            float f2;
            if ((i == 0) != (this.currentButtonState == 0)) {
                requestLayout();
            }
            this.currentButtonState = i;
            AnimatorSet animatorSet = this.stateAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.stateAnimator = null;
            }
            this.premiumButtonView.setEnabled(i == 1);
            this.addButtonView.setEnabled(i == 2);
            this.removeButtonView.setEnabled(i == 3);
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.stateAnimator = animatorSet2;
                RLottieImageView rLottieImageView = this.lockView;
                Property property = FrameLayout.TRANSLATION_X;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property, i == 1 ? 0.0f : -AndroidUtilities.dp(16.0f));
                RLottieImageView rLottieImageView2 = this.lockView;
                Property property2 = FrameLayout.ALPHA;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(rLottieImageView2, (Property<RLottieImageView, Float>) property2, i == 1 ? 1.0f : 0.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.headerView, (Property<SimpleTextView, Float>) property, i == 1 ? AndroidUtilities.dp(16.0f) : 0.0f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.premiumButtonView, (Property<PremiumButtonView, Float>) property2, i == 1 ? 1.0f : 0.0f);
                PremiumButtonView premiumButtonView = this.premiumButtonView;
                Property property3 = FrameLayout.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(premiumButtonView, (Property<PremiumButtonView, Float>) property3, i == 1 ? 1.0f : 0.6f);
                PremiumButtonView premiumButtonView2 = this.premiumButtonView;
                Property property4 = FrameLayout.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(premiumButtonView2, (Property<PremiumButtonView, Float>) property4, i == 1 ? 1.0f : 0.6f);
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.addButtonView, (Property<TextView, Float>) property2, i == 2 ? 1.0f : 0.0f);
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.addButtonView, (Property<TextView, Float>) property3, i == 2 ? 1.0f : 0.6f);
                TextView textView = this.addButtonView;
                if (i == 2) {
                    i2 = 1;
                    f = 1.0f;
                } else {
                    i2 = 1;
                    f = 0.6f;
                }
                float[] fArr = new float[i2];
                fArr[0] = f;
                ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr);
                TextView textView2 = this.removeButtonView;
                if (i == 3) {
                    i3 = 1;
                    f2 = 1.0f;
                } else {
                    i3 = 1;
                    f2 = 0.0f;
                }
                float[] fArr2 = new float[i3];
                fArr2[0] = f2;
                ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr2);
                TextView textView3 = this.removeButtonView;
                float[] fArr3 = new float[i3];
                fArr3[0] = i == 3 ? 1.0f : 0.6f;
                ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr3);
                TextView textView4 = this.removeButtonView;
                float[] fArr4 = new float[i3];
                fArr4[0] = i == 3 ? 1.0f : 0.6f;
                ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property4, fArr4);
                Animator[] animatorArr = new Animator[12];
                animatorArr[0] = objectAnimatorOfFloat;
                animatorArr[i3] = objectAnimatorOfFloat2;
                animatorArr[2] = objectAnimatorOfFloat3;
                animatorArr[3] = objectAnimatorOfFloat4;
                animatorArr[4] = objectAnimatorOfFloat5;
                animatorArr[5] = objectAnimatorOfFloat6;
                animatorArr[6] = objectAnimatorOfFloat7;
                animatorArr[7] = objectAnimatorOfFloat8;
                animatorArr[8] = objectAnimatorOfFloat9;
                animatorArr[9] = objectAnimatorOfFloat10;
                animatorArr[10] = objectAnimatorOfFloat11;
                animatorArr[11] = objectAnimatorOfFloat12;
                animatorSet2.playTogether(animatorArr);
                this.stateAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        EmojiPackHeader.this.premiumButtonView.setVisibility(0);
                        EmojiPackHeader.this.addButtonView.setVisibility(0);
                        EmojiPackHeader.this.removeButtonView.setVisibility(0);
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        EmojiPackHeader.this.premiumButtonView.setVisibility(i == 1 ? 0 : 8);
                        EmojiPackHeader.this.addButtonView.setVisibility(i == 2 ? 0 : 8);
                        EmojiPackHeader.this.removeButtonView.setVisibility(i == 3 ? 0 : 8);
                    }
                });
                this.stateAnimator.setDuration(250L);
                this.stateAnimator.setInterpolator(new OvershootInterpolator(1.02f));
                this.stateAnimator.start();
                return;
            }
            this.lockView.setAlpha(i == 1 ? 1.0f : 0.0f);
            this.lockView.setTranslationX(i == 1 ? 0.0f : -AndroidUtilities.dp(16.0f));
            this.headerView.setTranslationX(i == 1 ? AndroidUtilities.dp(16.0f) : 0.0f);
            this.premiumButtonView.setAlpha(i == 1 ? 1.0f : 0.0f);
            this.premiumButtonView.setScaleX(i == 1 ? 1.0f : 0.6f);
            this.premiumButtonView.setScaleY(i == 1 ? 1.0f : 0.6f);
            this.premiumButtonView.setVisibility(i == 1 ? 0 : 8);
            this.addButtonView.setAlpha(i == 2 ? 1.0f : 0.0f);
            this.addButtonView.setScaleX(i == 2 ? 1.0f : 0.6f);
            this.addButtonView.setScaleY(i == 2 ? 1.0f : 0.6f);
            this.addButtonView.setVisibility(i == 2 ? 0 : 8);
            this.removeButtonView.setAlpha(i == 3 ? 1.0f : 0.0f);
            this.removeButtonView.setScaleX(i == 3 ? 1.0f : 0.6f);
            this.removeButtonView.setScaleY(i == 3 ? 1.0f : 0.6f);
            this.removeButtonView.setVisibility(i == 3 ? 0 : 8);
        }
    }

    public void openEmojiPackAlert(final TLRPC.StickerSet stickerSet) {
        if (this.emojiPackAlertOpened) {
            return;
        }
        this.emojiPackAlertOpened = true;
        ArrayList arrayList = new ArrayList(1);
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.id = stickerSet.id;
        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
        arrayList.add(tL_inputStickerSetID);
        new EmojiPacksAlert(this.fragment, getContext(), this.resourcesProvider, arrayList) {
            @Override
            public void dismiss() {
                EmojiView.this.emojiPackAlertOpened = false;
                super.dismiss();
            }

            @Override
            protected void onButtonClicked(boolean z) {
                if (z) {
                    if (!EmojiView.this.installedEmojiSets.contains(Long.valueOf(stickerSet.id))) {
                        EmojiView.this.installedEmojiSets.add(Long.valueOf(stickerSet.id));
                    }
                } else {
                    EmojiView.this.installedEmojiSets.remove(Long.valueOf(stickerSet.id));
                }
                EmojiView.this.updateEmojiHeaders();
            }
        }.show();
    }

    public class EmojiGridSpacing extends RecyclerView.ItemDecoration {
        public EmojiGridSpacing() {
        }

        @Override
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (view instanceof StickerSetNameCell) {
                rect.left = AndroidUtilities.dp(5.0f);
                rect.right = AndroidUtilities.dp(5.0f);
                if (recyclerView.getChildAdapterPosition(view) + 1 <= EmojiView.this.emojiAdapter.plainEmojisCount || UserConfig.getInstance(EmojiView.this.currentAccount).isPremium() || EmojiView.this.allowEmojisForNonPremium) {
                    return;
                }
                rect.top = AndroidUtilities.dp(10.0f);
                return;
            }
            if ((view instanceof RecyclerListView) || (view instanceof EmojiPackHeader)) {
                rect.left = -EmojiView.this.emojiGridView.getPaddingLeft();
                rect.right = -EmojiView.this.emojiGridView.getPaddingRight();
                if (view instanceof EmojiPackHeader) {
                    rect.top = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
            }
            if (view instanceof BackupImageView) {
                rect.bottom = AndroidUtilities.dp(12.0f);
            }
        }
    }

    public static String addColorToCode(String str, String str2) {
        boolean z;
        String strSubstring;
        if (CompoundEmoji.isHandshake(str) != null) {
            return CompoundEmoji.applyColor(str, str2);
        }
        if (Emoji.endsWithRightArrow(str)) {
            str = str.substring(0, str.length() - 2);
            z = true;
        } else {
            z = false;
        }
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            strSubstring = str.substring(str.length() - 2);
            str = str.substring(0, str.length() - 2);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            strSubstring = null;
        } else {
            strSubstring = str.substring(str.length() - 3);
            str = str.substring(0, str.length() - 3);
        }
        String str3 = str + str2;
        if (strSubstring != null) {
            str3 = str3 + strSubstring;
        }
        if (!z) {
            return str3;
        }
        return str3 + "\u200d➡";
    }

    public void openTrendingStickers(TLRPC.StickerSetCovered stickerSetCovered) {
        this.delegate.showTrendingStickersAlert(new TrendingStickersLayout(getContext(), new TrendingStickersLayout.Delegate() {
            @Override
            public boolean canSendSticker() {
                return true;
            }

            @Override
            public void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered2, boolean z) {
                EmojiView.this.delegate.onStickerSetAdd(stickerSetCovered2);
                if (z) {
                    EmojiView.this.updateStickerTabs(true);
                }
            }

            @Override
            public void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered2) {
                EmojiView.this.delegate.onStickerSetRemove(stickerSetCovered2);
            }

            @Override
            public boolean onListViewInterceptTouchEvent(RecyclerListView recyclerListView, MotionEvent motionEvent) {
                return ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, recyclerListView, EmojiView.this.getMeasuredHeight(), EmojiView.this.contentPreviewViewerDelegate, EmojiView.this.resourcesProvider);
            }

            @Override
            public boolean onListViewTouchEvent(RecyclerListView recyclerListView, RecyclerListView.OnItemClickListener onItemClickListener, MotionEvent motionEvent) {
                return ContentPreviewViewer.getInstance().onTouch(motionEvent, recyclerListView, EmojiView.this.getMeasuredHeight(), onItemClickListener, EmojiView.this.contentPreviewViewerDelegate, EmojiView.this.resourcesProvider);
            }

            @Override
            public String[] getLastSearchKeyboardLanguage() {
                return EmojiView.this.lastSearchKeyboardLanguage;
            }

            @Override
            public void setLastSearchKeyboardLanguage(String[] strArr) {
                EmojiView.this.lastSearchKeyboardLanguage = strArr;
            }

            @Override
            public void onStickerSelected(TLRPC.Document document, Object obj, boolean z, boolean z2, int i) {
                EmojiView.this.delegate.onStickerSelected(null, document, null, obj, null, z2, i, 0);
            }

            @Override
            public boolean canSchedule() {
                return EmojiView.this.delegate.canSchedule();
            }

            @Override
            public boolean isInScheduleMode() {
                return EmojiView.this.delegate.isInScheduleMode();
            }
        }, this.primaryInstallingStickerSets, this.installingStickerSets, this.removingStickerSets, stickerSetCovered, this.resourcesProvider));
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        updateStickerTabsPosition();
        updateBottomTabContainerPosition();
    }

    private void updateBottomTabContainerPosition() {
        int measuredHeight;
        int iDp;
        BaseFragment baseFragment;
        View view = (View) getParent();
        if (view != null) {
            float y = getY();
            if (getLayoutParams().height > 0) {
                measuredHeight = getLayoutParams().height;
            } else {
                measuredHeight = getMeasuredHeight();
            }
            float f = y + measuredHeight;
            if ((!AndroidUtilities.isInMultiwindow && ((baseFragment = this.fragment) == null || !baseFragment.isInBubbleMode())) || this.isNewHeightControl) {
                iDp = view.getHeight();
            } else {
                iDp = AndroidUtilities.dp(1.0f);
            }
            float measuredHeight2 = f - iDp;
            if (this.visibleInAppKeyboardHeight >= 0.0f) {
                measuredHeight2 += getMeasuredHeight() - this.visibleInAppKeyboardHeight;
            } else if (this.bottomTabContainer.getTop() - measuredHeight2 < 0.0f || !this.fixBottomTabContainerTranslation) {
                measuredHeight2 = 0.0f;
            }
            float fLerp = (-measuredHeight2) + AndroidUtilities.lerp(AndroidUtilities.dp(this.needEmojiSearch ? 45.0f : 50.0f), -this.bottomInset, this.bottomTabVisibility.getFloatValue());
            this.bottomTabContainer.setTranslationY(fLerp);
            if (this.needEmojiSearch) {
                this.bulletinContainer.setTranslationY(fLerp);
            }
        }
    }

    public void updateStickerTabsPosition() {
        ScrollSlidingTabStrip scrollSlidingTabStrip = this.stickersTab;
        if (scrollSlidingTabStrip != null && this.stickersTabContainer == null && this.delegate != null) {
            scrollSlidingTabStrip.setTranslationY((-AndroidUtilities.dp(50.0f)) * this.delegate.getProgressToSearchOpened());
        }
        if (this.stickersTabContainer == null) {
            return;
        }
        boolean z = getVisibility() == 0 && this.stickersContainerAttached && this.delegate.getProgressToSearchOpened() != 1.0f;
        this.stickersTabContainer.setVisibility(z ? 0 : 8);
        if (z) {
            this.rect.setEmpty();
            this.pager.getChildVisibleRect(this.stickersContainer, this.rect, null);
            float fDp = AndroidUtilities.dp(50.0f) * this.delegate.getProgressToSearchOpened();
            int i = this.rect.left;
            if (i != 0 || fDp != 0.0f) {
                this.expandStickersByDragg = false;
            }
            this.stickersTabContainer.setTranslationX(i);
            float top = (((getTop() + getTranslationY()) - this.stickersTabContainer.getTop()) - this.stickersTab.getExpandedOffset()) - fDp;
            if (this.stickersTabContainer.getTranslationY() != top) {
                this.stickersTabContainer.setTranslationY(top);
                this.stickersTabContainer.invalidate();
            }
        }
        if (this.expandStickersByDragg && z && this.showing) {
            this.stickersTab.expandStickers(this.lastStickersX, true);
        } else {
            this.expandStickersByDragg = false;
            this.stickersTab.expandStickers(this.lastStickersX, false);
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 31 && this.blurredBackgroundSourceRenderNode != null && this.scrollableViewNoiseSuppressor != null) {
            invalidateBlurCaptures();
            RecordingCanvas recordingCanvasBeginRecording = this.blurredBackgroundSourceRenderNode.beginRecording(getMeasuredWidth(), getMeasuredHeight());
            recordingCanvasBeginRecording.drawColor(getThemedColor(Theme.key_windowBackgroundWhite));
            if (SharedConfig.chatBlurEnabled()) {
                this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording, -2);
            }
            this.blurredBackgroundSourceRenderNode.endRecording();
        }
        updateBottomTabContainerPosition();
        super.dispatchDraw(canvas);
    }

    public void invalidateBlurCaptures() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        ViewPositionWatcher.computeRectInParent(this.typeTabs, this, this.blurredRectF);
        this.blurredRectF.inset(LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f), LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.blurredRectF.right = getMeasuredWidth();
        RectF rectF = this.blurredRectF;
        rectF.bottom = Math.min(rectF.bottom, getMeasuredHeight());
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.blurredRectList, 1);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.blurCaptureMethod, getWidth(), getHeight());
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.pager) {
            canvas.save();
            if (this.bottomTabContainer.getVisibility() != 8 && !this.shouldDrawBackground && this.shouldLightenBackground) {
                canvas.drawColor(ColorUtils.setAlphaComponent(-1, 25));
            }
            boolean zDrawChild = super.drawChild(canvas, view, j);
            float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.bottomInset);
            if (navigationBarThirdButtonsFactor > 0.0f) {
                int iMultAlpha = Theme.multAlpha(getThemedColor(Theme.key_chat_emojiPanelBackground), navigationBarThirdButtonsFactor);
                if (this.lastFadeColor != iMultAlpha) {
                    this.fadeDrawable.setColors(new int[]{iMultAlpha, Theme.multAlpha(iMultAlpha, 0.66f), ColorUtils.setAlphaComponent(iMultAlpha, 0)});
                    this.lastFadeColor = iMultAlpha;
                }
                this.fadeDrawable.setBounds(0, getMeasuredHeight() - this.bottomInset, getMeasuredWidth(), getMeasuredHeight());
                this.fadeDrawable.draw(canvas);
            }
            canvas.restore();
            return zDrawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public void startStopVisibleGifs(boolean z) {
        RecyclerListView recyclerListView = this.gifGridView;
        if (recyclerListView == null) {
            return;
        }
        int childCount = recyclerListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.gifGridView.getChildAt(i);
            if (childAt instanceof ContextLinkCell) {
                ImageReceiver photoImage = ((ContextLinkCell) childAt).getPhotoImage();
                if (z) {
                    photoImage.setAllowStartAnimation(true);
                    photoImage.startAnimation();
                } else {
                    photoImage.setAllowStartAnimation(false);
                    photoImage.stopAnimation();
                }
            }
        }
    }

    public ArrayList<String> getRecentEmoji() {
        if (this.allowAnimatedEmoji) {
            return Emoji.recentEmoji;
        }
        if (this.lastRecentArray == null) {
            this.lastRecentArray = new ArrayList();
        }
        if (Emoji.recentEmoji.size() != this.lastRecentCount) {
            this.lastRecentArray.clear();
            int i = 0;
            while (true) {
                ArrayList<String> arrayList = Emoji.recentEmoji;
                if (i >= arrayList.size()) {
                    break;
                }
                if (!arrayList.get(i).startsWith("animated_")) {
                    this.lastRecentArray.add(arrayList.get(i));
                }
                i++;
            }
            this.lastRecentCount = this.lastRecentArray.size();
        }
        return this.lastRecentArray;
    }

    public void addEmojiToRecent(String str) {
        if (str == null) {
            return;
        }
        if (!str.startsWith("animated_") && !Emoji.isValidEmoji(str)) {
            return;
        }
        Emoji.addRecentEmoji(str);
        if (getVisibility() != 0 || this.pager.getCurrentItem() != 0) {
            Emoji.sortEmoji();
            this.emojiAdapter.notifyDataSetChanged();
        }
        Emoji.saveRecentEmoji();
        if (this.allowAnimatedEmoji) {
            return;
        }
        ArrayList arrayList = this.lastRecentArray;
        if (arrayList == null) {
            this.lastRecentArray = new ArrayList();
        } else {
            arrayList.clear();
        }
        int i = 0;
        while (true) {
            ArrayList<String> arrayList2 = Emoji.recentEmoji;
            if (i < arrayList2.size()) {
                if (!arrayList2.get(i).startsWith("animated_")) {
                    this.lastRecentArray.add(arrayList2.get(i));
                }
                i++;
            } else {
                this.lastRecentCount = this.lastRecentArray.size();
                return;
            }
        }
    }

    public void showSearchField(boolean z) {
        for (int i = 0; i < 3; i++) {
            GridLayoutManager layoutManagerForType = getLayoutManagerForType(i);
            int iFindFirstVisibleItemPosition = layoutManagerForType.findFirstVisibleItemPosition();
            if (z) {
                if (iFindFirstVisibleItemPosition == 1 || iFindFirstVisibleItemPosition == 2) {
                    layoutManagerForType.scrollToPosition(0);
                    resetTabsY(i);
                }
            } else if (iFindFirstVisibleItemPosition == 0) {
                layoutManagerForType.scrollToPositionWithOffset(0, 0);
            }
        }
    }

    public void hideSearchKeyboard() {
        SearchField searchField = this.stickersSearchField;
        if (searchField != null) {
            searchField.hideKeyboard();
        }
        SearchField searchField2 = this.gifSearchField;
        if (searchField2 != null) {
            searchField2.hideKeyboard();
        }
        SearchField searchField3 = this.emojiSearchField;
        if (searchField3 != null) {
            searchField3.hideKeyboard();
        }
    }

    public void openSearch(SearchField searchField) {
        SearchField searchField2;
        final RecyclerListView recyclerListView;
        View view;
        LinearLayoutManager linearLayoutManager;
        EmojiViewDelegate emojiViewDelegate;
        AnimatorSet animatorSet = this.searchAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.searchAnimation = null;
        }
        this.firstStickersAttach = false;
        this.firstGifAttach = false;
        this.firstEmojiAttach = false;
        int i = 0;
        while (i < 3) {
            if (i == 0) {
                searchField2 = this.emojiSearchField;
                recyclerListView = this.emojiGridView;
                view = this.emojiTabs;
                linearLayoutManager = this.emojiLayoutManager;
            } else if (i == 1) {
                searchField2 = this.gifSearchField;
                recyclerListView = this.gifGridView;
                view = this.gifTabs;
                linearLayoutManager = this.gifLayoutManager;
            } else {
                searchField2 = this.stickersSearchField;
                recyclerListView = this.stickersGridView;
                view = this.stickersTab;
                linearLayoutManager = this.stickersLayoutManager;
            }
            if (searchField2 != null) {
                if (searchField == searchField2 && (emojiViewDelegate = this.delegate) != null && emojiViewDelegate.isExpanded()) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.searchAnimation = animatorSet2;
                    if (view != null && i != 2) {
                        Property property = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, -AndroidUtilities.dp(40.0f)), ObjectAnimator.ofFloat(recyclerListView, (Property<RecyclerListView, Float>) property, -AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(searchField2, (Property<SearchField, Float>) property, AndroidUtilities.dp(0.0f)));
                    } else {
                        Property property2 = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(recyclerListView, (Property<RecyclerListView, Float>) property2, i == 2 ? 0.0f : -AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(searchField2, (Property<SearchField, Float>) property2, AndroidUtilities.dp(0.0f)));
                    }
                    this.searchAnimation.setDuration(220L);
                    this.searchAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    this.searchAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (animator.equals(EmojiView.this.searchAnimation)) {
                                recyclerListView.setTranslationY(0.0f);
                                if (recyclerListView == EmojiView.this.stickersGridView) {
                                    recyclerListView.setPadding(0, 0, 0, EmojiView.this.bottomInset);
                                } else if (recyclerListView == EmojiView.this.emojiGridView) {
                                    recyclerListView.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), EmojiView.this.bottomInset);
                                } else if (recyclerListView == EmojiView.this.gifGridView) {
                                    recyclerListView.setPadding(0, EmojiView.this.searchFieldHeight, 0, EmojiView.this.bottomInset);
                                }
                                EmojiView.this.searchAnimation = null;
                            }
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {
                            if (animator.equals(EmojiView.this.searchAnimation)) {
                                EmojiView.this.searchAnimation = null;
                            }
                        }
                    });
                    this.searchAnimation.start();
                } else {
                    searchField2.setTranslationY(AndroidUtilities.dp(0.0f));
                    if (view != null && i != 2) {
                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                    }
                    if (recyclerListView == this.stickersGridView) {
                        recyclerListView.setPadding(0, 0, 0, this.bottomInset);
                    } else if (recyclerListView == this.emojiGridView) {
                        recyclerListView.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), this.bottomInset);
                    } else if (recyclerListView == this.gifGridView) {
                        recyclerListView.setPadding(0, this.searchFieldHeight, 0, this.bottomInset);
                    }
                    if (recyclerListView == this.gifGridView) {
                        if (this.gifSearchAdapter.showTrendingWhenSearchEmpty = this.gifAdapter.results.size() > 0) {
                            this.gifSearchAdapter.search("");
                            RecyclerView.Adapter adapter = this.gifGridView.getAdapter();
                            GifAdapter gifAdapter = this.gifSearchAdapter;
                            if (adapter != gifAdapter) {
                                this.gifGridView.setAdapter(gifAdapter);
                            }
                        }
                    }
                    linearLayoutManager.scrollToPositionWithOffset(0, 0);
                }
            }
            i++;
        }
        showBottomTab(false, true);
    }

    private void showEmojiShadow(boolean z, boolean z2) {
        if (z && this.emojiTabsShadow.getTag() == null) {
            return;
        }
        if (z || this.emojiTabsShadow.getTag() == null) {
            AnimatorSet animatorSet = this.emojiTabShadowAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.emojiTabShadowAnimator = null;
            }
            this.emojiTabsShadow.setTag(z ? null : 1);
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.emojiTabShadowAnimator = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.emojiTabsShadow, (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
                this.emojiTabShadowAnimator.setDuration(200L);
                this.emojiTabShadowAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.emojiTabShadowAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        EmojiView.this.emojiTabShadowAnimator = null;
                    }
                });
                this.emojiTabShadowAnimator.start();
                return;
            }
            this.emojiTabsShadow.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    public void closeSearch(boolean z) {
        closeSearch(z, -1L);
    }

    private void scrollStickersToPosition(int i, int i2) {
        View viewFindViewByPosition = this.stickersLayoutManager.findViewByPosition(i);
        int iFindFirstVisibleItemPosition = this.stickersLayoutManager.findFirstVisibleItemPosition();
        if (viewFindViewByPosition == null && Math.abs(i - iFindFirstVisibleItemPosition) > 40) {
            this.stickersScrollHelper.setScrollDirection(this.stickersLayoutManager.findFirstVisibleItemPosition() < i ? 0 : 1);
            this.stickersScrollHelper.scrollToPosition(i, i2, false, true);
        } else {
            this.ignoreStickersScroll = true;
            this.stickersGridView.smoothScrollToPosition(i);
        }
    }

    public void scrollEmojisToAnimated() {
        if (this.emojiSmoothScrolling) {
            return;
        }
        try {
            int i = this.emojiAdapter.sectionToPosition.get(EmojiData.dataColored.length);
            if (i > 0) {
                this.emojiGridView.stopScroll();
                updateEmojiTabsPosition(i);
                scrollEmojisToPosition(i, AndroidUtilities.dp(-9.0f));
                checkEmojiTabY(null, 0);
            }
        } catch (Exception unused) {
        }
    }

    public void scrollEmojisToPosition(int i, int i2) {
        View viewFindViewByPosition = this.emojiLayoutManager.findViewByPosition(i);
        int iFindFirstVisibleItemPosition = this.emojiLayoutManager.findFirstVisibleItemPosition();
        if ((viewFindViewByPosition == null && Math.abs(i - iFindFirstVisibleItemPosition) > this.emojiLayoutManager.getSpanCount() * 9.0f) || !SharedConfig.animationsEnabled()) {
            this.emojiScrollHelper.setScrollDirection(this.emojiLayoutManager.findFirstVisibleItemPosition() < i ? 0 : 1);
            this.emojiScrollHelper.scrollToPosition(i, i2, false, true);
            return;
        }
        this.ignoreStickersScroll = true;
        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(this.emojiGridView.getContext(), 2) {
            @Override
            public void onEnd() {
                EmojiView.this.emojiSmoothScrolling = false;
            }

            @Override
            protected void onStart() {
                EmojiView.this.emojiSmoothScrolling = true;
            }
        };
        linearSmoothScrollerCustom.setTargetPosition(i);
        linearSmoothScrollerCustom.setOffset(i2);
        this.emojiLayoutManager.startSmoothScroll(linearSmoothScrollerCustom);
    }

    public void closeSearch(boolean z, long j) {
        SearchField searchField;
        final RecyclerListView recyclerListView;
        final GridLayoutManager gridLayoutManager;
        View view;
        TLRPC.TL_messages_stickerSet stickerSetById;
        int positionForPack;
        AnimatorSet animatorSet = this.searchAnimation;
        StickerCategoriesListView.EmojiCategory emojiCategory = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.searchAnimation = null;
        }
        int currentItem = this.pager.getCurrentItem();
        if (currentItem == 2 && j != -1 && (stickerSetById = MediaDataController.getInstance(this.currentAccount).getStickerSetById(j)) != null && (positionForPack = this.stickersGridAdapter.getPositionForPack(stickerSetById)) >= 0 && positionForPack < this.stickersGridAdapter.getItemCount()) {
            scrollStickersToPosition(positionForPack, AndroidUtilities.dp(48.0f));
        }
        GifAdapter gifAdapter = this.gifSearchAdapter;
        if (gifAdapter != null) {
            gifAdapter.showTrendingWhenSearchEmpty = false;
        }
        int i = 0;
        while (i < 3) {
            if (i == 0) {
                searchField = this.emojiSearchField;
                recyclerListView = this.emojiGridView;
                gridLayoutManager = this.emojiLayoutManager;
                view = this.emojiTabs;
            } else if (i == 1) {
                searchField = this.gifSearchField;
                recyclerListView = this.gifGridView;
                gridLayoutManager = this.gifLayoutManager;
                view = this.gifTabs;
            } else {
                searchField = this.stickersSearchField;
                recyclerListView = this.stickersGridView;
                gridLayoutManager = this.stickersLayoutManager;
                view = this.stickersTab;
            }
            if (searchField != null) {
                searchField.searchEditText.setText("");
                if (searchField.categoriesListView != null) {
                    searchField.categoriesListView.selectCategory(emojiCategory);
                    searchField.categoriesListView.scrollToStart();
                }
                if (i == currentItem && z) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.searchAnimation = animatorSet2;
                    if (view != null && i != 1) {
                        Property property = View.TRANSLATION_Y;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f), ObjectAnimator.ofFloat(recyclerListView, (Property<RecyclerListView, Float>) property, AndroidUtilities.dp(36.0f)), ObjectAnimator.ofFloat(searchField, (Property<SearchField, Float>) property, AndroidUtilities.dp(36.0f)));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(recyclerListView, (Property<RecyclerListView, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(36.0f) - this.searchFieldHeight));
                    }
                    this.searchAnimation.setDuration(200L);
                    this.searchAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.searchAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (animator.equals(EmojiView.this.searchAnimation)) {
                                int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
                                recyclerListView.setTranslationY(0.0f);
                                if (recyclerListView == EmojiView.this.stickersGridView) {
                                    recyclerListView.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + EmojiView.this.bottomInset);
                                } else if (recyclerListView == EmojiView.this.gifGridView) {
                                    recyclerListView.setPadding(0, EmojiView.this.searchFieldHeight, 0, AndroidUtilities.dp(44.0f) + EmojiView.this.bottomInset);
                                } else if (recyclerListView == EmojiView.this.emojiGridView) {
                                    recyclerListView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + EmojiView.this.bottomInset);
                                }
                                if (iFindFirstVisibleItemPosition != -1) {
                                    gridLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, 0);
                                }
                                EmojiView.this.searchAnimation = null;
                            }
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {
                            if (animator.equals(EmojiView.this.searchAnimation)) {
                                EmojiView.this.searchAnimation = null;
                            }
                        }
                    });
                    this.searchAnimation.start();
                } else {
                    if (searchField != this.gifSearchField) {
                        searchField.setTranslationY(AndroidUtilities.dp(36.0f) - this.searchFieldHeight);
                    }
                    if (view != null && i != 2) {
                        view.setTranslationY(0.0f);
                    }
                    if (recyclerListView == this.stickersGridView) {
                        recyclerListView.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + this.bottomInset);
                    } else if (recyclerListView == this.gifGridView) {
                        recyclerListView.setPadding(0, AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(44.0f) + this.bottomInset);
                    } else if (recyclerListView == this.emojiGridView) {
                        recyclerListView.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + this.bottomInset);
                    }
                    gridLayoutManager.scrollToPositionWithOffset(0, 0);
                }
            }
            i++;
            emojiCategory = null;
        }
        if (z) {
            return;
        }
        this.delegate.onSearchOpenClose(0);
    }

    public void checkStickersSearchFieldScroll(boolean z) {
        RecyclerListView recyclerListView;
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate != null && emojiViewDelegate.isSearchOpened()) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.stickersGridView.findViewHolderForAdapterPosition(0);
            if (viewHolderFindViewHolderForAdapterPosition == null) {
                this.stickersSearchField.showShadow(true, !z);
            } else {
                this.stickersSearchField.showShadow(viewHolderFindViewHolderForAdapterPosition.itemView.getTop() < this.stickersGridView.getPaddingTop(), !z);
            }
            this.stickersSearchField.setTranslationY(this.animatorSearchStickerPackSelected.getFloatValue() * AndroidUtilities.dp(15.0f));
            return;
        }
        if (this.stickersSearchField == null || (recyclerListView = this.stickersGridView) == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerListView.findViewHolderForAdapterPosition(0);
        this.stickersSearchField.setTranslationY((viewHolderFindViewHolderForAdapterPosition2 != null ? viewHolderFindViewHolderForAdapterPosition2.itemView.getTop() : -this.searchFieldHeight) + (this.animatorSearchStickerPackSelected.getFloatValue() * AndroidUtilities.dp(15.0f)));
        this.stickersSearchField.showShadow(false, !z);
    }

    private void checkStickersSearchFieldVisibility() {
        float floatValue = 1.0f - this.animatorSearchStickerPackSelected.getFloatValue();
        this.stickersSearchField.setAlpha(floatValue);
        this.stickersSearchField.setVisibility(floatValue > 0.0f ? 0 : 4);
        float f = 1.0f - floatValue;
        this.stickerSearchHeader.setAlpha(f);
        this.stickerSearchHeader.setTranslationY((-AndroidUtilities.dp(15.0f)) * floatValue);
        this.stickerSearchHeader.setVisibility(f > 0.0f ? 0 : 4);
        this.stickerAddPackButtonContainer.setAlpha(f);
        this.stickerAddPackButtonContainer.setTranslationY(AndroidUtilities.dp(30.0f) * floatValue);
        this.stickerAddPackButtonContainer.setVisibility(f > 0.0f ? 0 : 4);
    }

    private void checkEmojiSearchFieldVisibility() {
        float floatValue = 1.0f - this.animatorSearchEmojiPackSelected.getFloatValue();
        this.emojiSearchField.setAlpha(floatValue);
        this.emojiSearchField.setVisibility(floatValue > 0.0f ? 0 : 4);
        float f = 1.0f - floatValue;
        this.emojiSearchHeader.setAlpha(f);
        this.emojiSearchHeader.setTranslationY((-AndroidUtilities.dp(15.0f)) * floatValue);
        this.emojiSearchHeader.setVisibility(f > 0.0f ? 0 : 4);
        this.emojiAddPackButtonContainer.setAlpha(f);
        this.emojiAddPackButtonContainer.setTranslationY(AndroidUtilities.dp(30.0f) * floatValue);
        this.emojiAddPackButtonContainer.setVisibility(f > 0.0f ? 0 : 4);
    }

    public void checkBottomTabScroll(float f) {
        int iDp;
        if (SystemClock.elapsedRealtime() - this.shownBottomTabAfterClick < ViewConfiguration.getTapTimeout()) {
            return;
        }
        this.lastBottomScrollDy += f;
        if (this.pager.getCurrentItem() == 0) {
            iDp = AndroidUtilities.dp(38.0f);
        } else {
            iDp = AndroidUtilities.dp(48.0f);
        }
        float f2 = this.lastBottomScrollDy;
        if (f2 >= iDp) {
            showBottomTab(false, true);
            return;
        }
        if (f2 <= (-iDp)) {
            showBottomTab(true, true);
        } else {
            if ((this.bottomTabContainer.getTag() != null || this.lastBottomScrollDy >= 0.0f) && (this.bottomTabContainer.getTag() == null || this.lastBottomScrollDy <= 0.0f)) {
                return;
            }
            this.lastBottomScrollDy = 0.0f;
        }
    }

    public void showBackspaceButton(final boolean z, boolean z2) {
        if (z && this.backspaceButton.getTag() == null) {
            return;
        }
        if ((z || this.backspaceButton.getTag() == null) && !this.mForceHideBackspaceButton) {
            AnimatorSet animatorSet = this.backspaceButtonAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.backspaceButtonAnimation = null;
            }
            this.backspaceButton.setTag(z ? null : 1);
            if (z2) {
                if (z) {
                    this.backspaceButton.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.backspaceButtonAnimation = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.backspaceButton, (Property<ImageView, Float>) View.ALPHA, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.backspaceButton, (Property<ImageView, Float>) View.SCALE_X, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.backspaceButton, (Property<ImageView, Float>) View.SCALE_Y, z ? 1.0f : 0.0f));
                this.backspaceButtonAnimation.setDuration(200L);
                this.backspaceButtonAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.backspaceButtonAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (z) {
                            return;
                        }
                        EmojiView.this.backspaceButton.setVisibility(4);
                    }
                });
                this.backspaceButtonAnimation.start();
                return;
            }
            this.backspaceButton.setAlpha(z ? 1.0f : 0.0f);
            this.backspaceButton.setScaleX(z ? 1.0f : 0.0f);
            this.backspaceButton.setScaleY(z ? 1.0f : 0.0f);
            this.backspaceButton.setVisibility(z ? 0 : 4);
        }
    }

    public void showStickerSettingsButton(final boolean z, boolean z2) {
        ImageView imageView = this.stickerSettingsButton;
        if (imageView == null || this.mForceHideSettingsButton) {
            return;
        }
        if (z && imageView.getTag() == null) {
            return;
        }
        if (z || this.stickerSettingsButton.getTag() == null) {
            AnimatorSet animatorSet = this.stickersButtonAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.stickersButtonAnimation = null;
            }
            this.stickerSettingsButton.setTag(z ? null : 1);
            if (z2) {
                if (z) {
                    this.stickerSettingsButton.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.stickersButtonAnimation = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.stickerSettingsButton, (Property<ImageView, Float>) View.ALPHA, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.stickerSettingsButton, (Property<ImageView, Float>) View.SCALE_X, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.stickerSettingsButton, (Property<ImageView, Float>) View.SCALE_Y, z ? 1.0f : 0.0f));
                this.stickersButtonAnimation.setDuration(200L);
                this.stickersButtonAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.stickersButtonAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (z) {
                            return;
                        }
                        EmojiView.this.stickerSettingsButton.setVisibility(4);
                    }
                });
                this.stickersButtonAnimation.start();
                return;
            }
            this.stickerSettingsButton.setAlpha(z ? 1.0f : 0.0f);
            this.stickerSettingsButton.setScaleX(z ? 1.0f : 0.0f);
            this.stickerSettingsButton.setScaleY(z ? 1.0f : 0.0f);
            this.stickerSettingsButton.setVisibility(z ? 0 : 4);
        }
    }

    public void lambda$new$22(int i, float f, float f2, FactorAnimator factorAnimator) {
        updateBottomTabContainerPosition();
    }

    public void showBottomTab(boolean z, boolean z2) {
        this.lastBottomScrollDy = 0.0f;
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate != null && emojiViewDelegate.isSearchOpened()) {
            z = false;
        }
        if (z && this.bottomTabContainer.getTag() == null) {
            return;
        }
        if (z || this.bottomTabContainer.getTag() == null) {
            this.bottomTabContainer.setTag(z ? null : 1);
            this.bottomTabVisibility.setValue(z, z2);
        }
    }

    public void checkTabsY(int i, int i2) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (i == 1) {
            checkEmojiTabY(this.emojiGridView, i2);
            return;
        }
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if ((emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) && !this.ignoreStickersScroll) {
            RecyclerListView listViewForType = getListViewForType(i);
            if (i2 <= 0 || listViewForType == null || listViewForType.getVisibility() != 0 || (viewHolderFindViewHolderForAdapterPosition = listViewForType.findViewHolderForAdapterPosition(0)) == null || viewHolderFindViewHolderForAdapterPosition.itemView.getTop() + this.searchFieldHeight < listViewForType.getPaddingTop()) {
                int[] iArr = this.tabsMinusDy;
                int i3 = iArr[i] - i2;
                iArr[i] = i3;
                if (i3 > 0) {
                    iArr[i] = 0;
                } else if (i3 < (-AndroidUtilities.dp(288.0f))) {
                    this.tabsMinusDy[i] = -AndroidUtilities.dp(288.0f);
                }
                if (i == 0) {
                    updateStickerTabsPosition();
                } else {
                    getTabsForType(i).setTranslationY(Math.max(-AndroidUtilities.dp(48.0f), this.tabsMinusDy[i]));
                }
            }
        }
    }

    private void resetTabsY(int i) {
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if ((emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) && i != 0) {
            View tabsForType = getTabsForType(i);
            this.tabsMinusDy[i] = 0;
            tabsForType.setTranslationY(0);
        }
    }

    public void animateTabsY(final int i) {
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if ((emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) && i != 0) {
            float fDpf2 = AndroidUtilities.dpf2(i == 1 ? 36.0f : 48.0f);
            float f = this.tabsMinusDy[i] / (-fDpf2);
            if (f <= 0.0f || f >= 1.0f) {
                animateSearchField(i);
                return;
            }
            View tabsForType = getTabsForType(i);
            int i2 = f > 0.5f ? (int) (-Math.ceil(fDpf2)) : 0;
            if (f > 0.5f) {
                animateSearchField(i, false, i2);
            }
            if (i == 1) {
                checkEmojiShadow(i2);
            }
            ObjectAnimator[] objectAnimatorArr = this.tabsYAnimators;
            ObjectAnimator objectAnimator = objectAnimatorArr[i];
            if (objectAnimator == null) {
                objectAnimatorArr[i] = ObjectAnimator.ofFloat(tabsForType, (Property<View, Float>) View.TRANSLATION_Y, tabsForType.getTranslationY(), i2);
                this.tabsYAnimators[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$animateTabsY$23(i, valueAnimator);
                    }
                });
                this.tabsYAnimators[i].setDuration(200L);
            } else {
                objectAnimator.setFloatValues(tabsForType.getTranslationY(), i2);
            }
            this.tabsYAnimators[i].start();
        }
    }

    public void lambda$animateTabsY$23(int i, ValueAnimator valueAnimator) {
        this.tabsMinusDy[i] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void stopAnimatingTabsY(int i) {
        ObjectAnimator objectAnimator = this.tabsYAnimators[i];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        this.tabsYAnimators[i].cancel();
    }

    private void animateSearchField(int i) {
        RecyclerListView listViewForType = getListViewForType(i);
        int iDp = AndroidUtilities.dp(i == 1 ? 38.0f : 48.0f);
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = listViewForType.findViewHolderForAdapterPosition(0);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            int bottom = viewHolderFindViewHolderForAdapterPosition.itemView.getBottom();
            int i2 = this.tabsMinusDy[i];
            float f = (bottom - (iDp + i2)) / this.searchFieldHeight;
            if (f > 0.0f || f < 1.0f) {
                animateSearchField(i, f > 0.5f, i2);
            }
        }
    }

    private void animateSearchField(int i, boolean z, final int i2) {
        if (i == 2 || getListViewForType(i).findViewHolderForAdapterPosition(0) == null) {
            return;
        }
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(getContext()) {
            @Override
            protected int getVerticalSnapPreference() {
                return -1;
            }

            @Override
            protected int calculateTimeForDeceleration(int i3) {
                return super.calculateTimeForDeceleration(i3) * 16;
            }

            @Override
            public int calculateDtToFit(int i3, int i4, int i5, int i6, int i7) {
                return super.calculateDtToFit(i3, i4, i5, i6, i7) + i2;
            }
        };
        linearSmoothScroller.setTargetPosition(!z ? 1 : 0);
        getLayoutManagerForType(i).startSmoothScroll(linearSmoothScroller);
    }

    public View getTabsForType(int i) {
        if (i == 0) {
            return this.stickersTab;
        }
        if (i == 1) {
            return this.emojiTabs;
        }
        if (i == 2) {
            return this.gifTabs;
        }
        throw new IllegalArgumentException("Unexpected argument: " + i);
    }

    public RecyclerListView getListViewForType(int i) {
        if (i == 0) {
            return this.stickersGridView;
        }
        if (i == 1) {
            return this.emojiGridView;
        }
        if (i == 2) {
            return this.gifGridView;
        }
        throw new IllegalArgumentException("Unexpected argument: " + i);
    }

    private GridLayoutManager getLayoutManagerForType(int i) {
        if (i == 0) {
            return this.stickersLayoutManager;
        }
        if (i == 1) {
            return this.emojiLayoutManager;
        }
        if (i == 2) {
            return this.gifLayoutManager;
        }
        throw new IllegalArgumentException("Unexpected argument: " + i);
    }

    public SearchField getSearchFieldForType(int i) {
        if (i == 0) {
            return this.stickersSearchField;
        }
        if (i == 1) {
            return this.emojiSearchField;
        }
        if (i == 2) {
            return this.gifSearchField;
        }
        throw new IllegalArgumentException("Unexpected argument: " + i);
    }

    public void scrollEmojiToTop() {
        this.emojiGridView.stopScroll();
        this.emojiTabs.scrollTo(0, 0);
        resetTabsY(1);
        this.emojiLayoutManager.scrollToPositionWithOffset(0, 0);
    }

    public void checkEmojiSearchFieldScroll(boolean z) {
        EmojiGridView emojiGridView;
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate != null && emojiViewDelegate.isSearchOpened()) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.emojiGridView.findViewHolderForAdapterPosition(0);
            if (viewHolderFindViewHolderForAdapterPosition == null) {
                this.emojiSearchField.showShadow(true, !z);
            } else {
                this.emojiSearchField.showShadow(viewHolderFindViewHolderForAdapterPosition.itemView.getTop() < this.emojiGridView.getPaddingTop(), !z);
            }
            showEmojiShadow(false, !z);
            this.emojiSearchField.setTranslationY(this.animatorSearchEmojiPackSelected.getFloatValue() * AndroidUtilities.dp(15.0f));
            return;
        }
        if (this.emojiSearchField == null || (emojiGridView = this.emojiGridView) == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = emojiGridView.findViewHolderForAdapterPosition(0);
        this.emojiSearchField.setTranslationY((viewHolderFindViewHolderForAdapterPosition2 != null ? viewHolderFindViewHolderForAdapterPosition2.itemView.getTop() : -this.searchFieldHeight) + (this.animatorSearchEmojiPackSelected.getFloatValue() * AndroidUtilities.dp(15.0f)));
        this.emojiSearchField.showShadow(false, !z);
        checkEmojiShadow(Math.round(this.emojiTabs.getTranslationY()));
    }

    private void checkEmojiShadow(int i) {
        ObjectAnimator objectAnimator = this.tabsYAnimators[1];
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            boolean z = false;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.emojiGridView.findViewHolderForAdapterPosition(0);
            int iDp = AndroidUtilities.dp(38.0f) + i;
            if (iDp > 0 && (viewHolderFindViewHolderForAdapterPosition == null || viewHolderFindViewHolderForAdapterPosition.itemView.getBottom() < iDp)) {
                z = true;
            }
            showEmojiShadow(z, !this.isLayout);
        }
    }

    public void checkEmojiTabY(View view, int i) {
        EmojiGridView emojiGridView;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (view == null) {
            EmojiTabsStrip emojiTabsStrip = this.emojiTabs;
            this.tabsMinusDy[1] = 0;
            emojiTabsStrip.setTranslationY(0);
            return;
        }
        if (view.getVisibility() != 0 || this.emojiSmoothScrolling) {
            return;
        }
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) {
            if (i > 0 && (emojiGridView = this.emojiGridView) != null && emojiGridView.getVisibility() == 0 && (viewHolderFindViewHolderForAdapterPosition = this.emojiGridView.findViewHolderForAdapterPosition(0)) != null) {
                if (viewHolderFindViewHolderForAdapterPosition.itemView.getTop() + (this.needEmojiSearch ? this.searchFieldHeight : 0) >= this.emojiGridView.getPaddingTop()) {
                    return;
                }
            }
            int[] iArr = this.tabsMinusDy;
            int i2 = iArr[1] - i;
            iArr[1] = i2;
            if (i2 > 0) {
                iArr[1] = 0;
            } else if (i2 < (-AndroidUtilities.dp(108.0f))) {
                this.tabsMinusDy[1] = -AndroidUtilities.dp(108.0f);
            }
            this.emojiTabs.setTranslationY(Math.max(-AndroidUtilities.dp(36.0f), this.tabsMinusDy[1]));
        }
    }

    public void checkGifSearchFieldScroll(boolean z) {
        int iFindLastVisibleItemPosition;
        RecyclerListView recyclerListView = this.gifGridView;
        if (recyclerListView != null && (recyclerListView.getAdapter() instanceof GifAdapter)) {
            GifAdapter gifAdapter = (GifAdapter) this.gifGridView.getAdapter();
            if (!gifAdapter.searchEndReached && gifAdapter.reqId == 0 && !gifAdapter.results.isEmpty() && (iFindLastVisibleItemPosition = this.gifLayoutManager.findLastVisibleItemPosition()) != -1 && iFindLastVisibleItemPosition > this.gifLayoutManager.getItemCount() - 5) {
                gifAdapter.search(gifAdapter.lastSearchImageString, gifAdapter.nextSearchOffset, true, gifAdapter.lastSearchIsEmoji, gifAdapter.lastSearchIsEmoji);
            }
        }
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate != null && emojiViewDelegate.isSearchOpened()) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.gifGridView.findViewHolderForAdapterPosition(0);
            if (viewHolderFindViewHolderForAdapterPosition == null) {
                this.gifSearchField.showShadow(true, !z);
                return;
            } else {
                this.gifSearchField.showShadow(viewHolderFindViewHolderForAdapterPosition.itemView.getTop() < this.gifGridView.getPaddingTop(), !z);
                return;
            }
        }
        SearchField searchField = this.gifSearchField;
        if (searchField == null || this.gifGridView == null) {
            return;
        }
        searchField.showShadow(true, !z);
    }

    public void scrollGifsToTop() {
        this.gifLayoutManager.scrollToPositionWithOffset(0, 0);
        resetTabsY(2);
    }

    public void checkScroll(int i) {
        int iFindFirstVisibleItemPosition;
        int iFindFirstVisibleItemPosition2;
        if (i == 0) {
            if (this.ignoreStickersScroll || (iFindFirstVisibleItemPosition2 = this.stickersLayoutManager.findFirstVisibleItemPosition()) == -1 || this.stickersGridView == null) {
                return;
            }
            int i2 = this.favTabNum;
            if (i2 <= 0 && (i2 = this.recentTabNum) <= 0) {
                i2 = this.stickersTabOffset;
            }
            this.stickersTab.onPageScrolled(this.stickersGridAdapter.getTabForPosition(iFindFirstVisibleItemPosition2), i2);
            return;
        }
        if (i == 2) {
            RecyclerView.Adapter adapter = this.gifGridView.getAdapter();
            GifAdapter gifAdapter = this.gifAdapter;
            if (adapter != gifAdapter || gifAdapter.trendingSectionItem < 0 || this.gifTrendingTabNum < 0 || this.gifRecentTabNum < 0 || (iFindFirstVisibleItemPosition = this.gifLayoutManager.findFirstVisibleItemPosition()) == -1) {
                return;
            }
            this.gifTabs.onPageScrolled(iFindFirstVisibleItemPosition >= this.gifAdapter.trendingSectionItem ? this.gifTrendingTabNum : this.gifRecentTabNum, 0);
        }
    }

    public void saveNewPage() {
        ViewPager viewPager = this.pager;
        if (viewPager == null) {
            return;
        }
        int currentItem = viewPager.getCurrentItem();
        int i = 1;
        if (currentItem != 2) {
            i = currentItem == 1 ? 2 : 0;
        }
        if (this.currentPage != i) {
            this.currentPage = i;
            MessagesController.getGlobalEmojiSettings().edit().putInt("selected_page", i).commit();
        }
    }

    public void clearRecentEmoji() {
        Emoji.clearRecentEmoji();
        this.emojiAdapter.notifyDataSetChanged();
    }

    public void onPageScrolled(int i, int i2, int i3) {
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate == null) {
            return;
        }
        if (i == 1) {
            emojiViewDelegate.onTabOpened(i3 != 0 ? 2 : 0);
        } else if (i == 2) {
            emojiViewDelegate.onTabOpened(3);
        } else {
            emojiViewDelegate.onTabOpened(0);
        }
    }

    public void postBackspaceRunnable(final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$postBackspaceRunnable$24(i);
            }
        }, i);
    }

    public void lambda$postBackspaceRunnable$24(int i) {
        if (this.backspacePressed) {
            EmojiViewDelegate emojiViewDelegate = this.delegate;
            if (emojiViewDelegate != null && emojiViewDelegate.onBackspace()) {
                try {
                    this.backspaceButton.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            this.backspaceOnce = true;
            postBackspaceRunnable(Math.max(50, i - 100));
        }
    }

    public void switchToGifRecent() {
        showBackspaceButton(false, false);
        showStickerSettingsButton(false, false);
        this.pager.setCurrentItem(1, false);
    }

    public void updateEmojiHeaders() {
        if (this.emojiGridView == null) {
            return;
        }
        for (int i = 0; i < this.emojiGridView.getChildCount(); i++) {
            View childAt = this.emojiGridView.getChildAt(i);
            if (childAt instanceof EmojiPackHeader) {
                ((EmojiPackHeader) childAt).updateState(true);
            }
        }
    }

    public void updateStickerTabs(boolean z) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet;
        ScrollSlidingTabStrip scrollSlidingTabStrip = this.stickersTab;
        if (scrollSlidingTabStrip == null || scrollSlidingTabStrip.isDragging()) {
            return;
        }
        this.recentTabNum = -2;
        this.favTabNum = -2;
        this.trendingTabNum = -2;
        this.premiumTabNum = -2;
        this.hasChatStickers = false;
        this.stickersTabOffset = 0;
        int currentPosition = this.stickersTab.getCurrentPosition();
        this.stickersTab.beginUpdate((getParent() == null || getVisibility() != 0 || (this.installingStickerSets.size() == 0 && this.removingStickerSets.size() == 0)) ? false : true);
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        SharedPreferences emojiSettings = MessagesController.getEmojiSettings(this.currentAccount);
        this.featuredStickerSets.clear();
        ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
        int size = featuredStickerSets.size();
        for (int i = 0; i < size; i++) {
            TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i);
            if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id)) {
                this.featuredStickerSets.add(stickerSetCovered);
            }
        }
        TrendingAdapter trendingAdapter = this.trendingAdapter;
        if (trendingAdapter != null) {
            trendingAdapter.notifyDataSetChanged();
        }
        if (!featuredStickerSets.isEmpty() && (this.featuredStickerSets.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.id)) {
            int i2 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
            StickerTabView stickerTabViewAddStickerIconTab = this.stickersTab.addStickerIconTab(i2, this.stickerIcons[i2]);
            stickerTabViewAddStickerIconTab.textView.setText(LocaleController.getString(R.string.FeaturedStickersShort));
            stickerTabViewAddStickerIconTab.setContentDescription(LocaleController.getString(R.string.FeaturedStickers));
            int i3 = this.stickersTabOffset;
            this.trendingTabNum = i3;
            this.stickersTabOffset = i3 + 1;
        }
        if (!this.favouriteStickers.isEmpty()) {
            int i4 = this.stickersTabOffset;
            this.favTabNum = i4;
            this.stickersTabOffset = i4 + 1;
            StickerTabView stickerTabViewAddStickerIconTab2 = this.stickersTab.addStickerIconTab(1, this.stickerIcons[1]);
            stickerTabViewAddStickerIconTab2.textView.setText(LocaleController.getString(R.string.FavoriteStickersShort));
            stickerTabViewAddStickerIconTab2.setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
        }
        if (!this.recentStickers.isEmpty()) {
            int i5 = this.stickersTabOffset;
            this.recentTabNum = i5;
            this.stickersTabOffset = i5 + 1;
            StickerTabView stickerTabViewAddStickerIconTab3 = this.stickersTab.addStickerIconTab(0, this.stickerIcons[0]);
            stickerTabViewAddStickerIconTab3.textView.setText(LocaleController.getString(R.string.RecentStickersShort));
            stickerTabViewAddStickerIconTab3.setContentDescription(LocaleController.getString(R.string.RecentStickers));
        }
        this.stickerSets.clear();
        this.groupStickerSet = null;
        this.groupStickerPackPosition = -1;
        this.groupStickerPackNum = -10;
        if (this.frozenStickerSets == null || z) {
            this.frozenStickerSets = new ArrayList(mediaDataController.getStickerSets(0));
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayList3 = this.frozenStickerSets;
        int i6 = 0;
        while (true) {
            TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.primaryInstallingStickerSets;
            if (i6 >= stickerSetCoveredArr.length) {
                break;
            }
            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCoveredArr[i6];
            if (stickerSetCovered2 != null) {
                TLRPC.TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(stickerSetCovered2.set.id);
                if (stickerSetById != null && (stickerSet = stickerSetById.set) != null && !stickerSet.archived) {
                    this.primaryInstallingStickerSets[i6] = null;
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                    tL_messages_stickerSet.set = stickerSetCovered2.set;
                    TLRPC.Document document2 = stickerSetCovered2.cover;
                    if (document2 != null) {
                        tL_messages_stickerSet.documents.add(document2);
                    } else if (!stickerSetCovered2.covers.isEmpty()) {
                        tL_messages_stickerSet.documents.addAll(stickerSetCovered2.covers);
                    }
                    if (!tL_messages_stickerSet.documents.isEmpty()) {
                        this.stickerSets.add(tL_messages_stickerSet);
                    }
                }
            }
            i6++;
        }
        ArrayList<TLRPC.TL_messages_stickerSet> arrayListFilterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(arrayList3);
        for (int i7 = 0; i7 < arrayListFilterPremiumStickers.size(); i7++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayListFilterPremiumStickers.get(i7);
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
            if ((stickerSet2 == null || !stickerSet2.archived) && (arrayList2 = tL_messages_stickerSet2.documents) != null && !arrayList2.isEmpty()) {
                this.stickerSets.add(tL_messages_stickerSet2);
            }
        }
        if (this.info != null) {
            long j = MessagesController.getEmojiSettings(this.currentAccount).getLong("group_hide_stickers_" + this.info.id, -1L);
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.info.id));
            if (chat == null || this.info.stickerset == null || !ChatObject.hasAdminRights(chat)) {
                this.groupStickersHidden = j != -1;
            } else {
                TLRPC.StickerSet stickerSet3 = this.info.stickerset;
                if (stickerSet3 != null) {
                    this.groupStickersHidden = j == stickerSet3.id;
                }
            }
            TLRPC.ChatFull chatFull = this.info;
            TLRPC.StickerSet stickerSet4 = chatFull.stickerset;
            if (stickerSet4 != null) {
                TLRPC.TL_messages_stickerSet groupStickerSetById = mediaDataController.getGroupStickerSetById(stickerSet4);
                if (groupStickerSetById != null && (arrayList = groupStickerSetById.documents) != null && !arrayList.isEmpty() && groupStickerSetById.set != null) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = new TLRPC.TL_messages_stickerSet();
                    tL_messages_stickerSet3.documents = groupStickerSetById.documents;
                    tL_messages_stickerSet3.packs = groupStickerSetById.packs;
                    tL_messages_stickerSet3.set = groupStickerSetById.set;
                    if (this.groupStickersHidden) {
                        this.groupStickerPackNum = this.stickerSets.size();
                        this.stickerSets.add(tL_messages_stickerSet3);
                    } else {
                        this.groupStickerPackNum = 0;
                        this.stickerSets.add(0, tL_messages_stickerSet3);
                    }
                    if (!this.info.can_set_stickers) {
                        tL_messages_stickerSet3 = null;
                    }
                    this.groupStickerSet = tL_messages_stickerSet3;
                }
            } else if (chatFull.can_set_stickers) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = new TLRPC.TL_messages_stickerSet();
                if (this.groupStickersHidden) {
                    this.groupStickerPackNum = this.stickerSets.size();
                    this.stickerSets.add(tL_messages_stickerSet4);
                } else {
                    this.groupStickerPackNum = 0;
                    this.stickerSets.add(0, tL_messages_stickerSet4);
                }
            }
        }
        int i8 = 0;
        while (i8 < this.stickerSets.size()) {
            if (i8 == this.groupStickerPackNum) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.info.id));
                if (chat2 == null) {
                    this.stickerSets.remove(0);
                    i8--;
                } else {
                    this.hasChatStickers = true;
                    this.stickersTab.addStickerTab(chat2);
                }
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = (TLRPC.TL_messages_stickerSet) this.stickerSets.get(i8);
                TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet5.set;
                if (stickerSet5 == null || stickerSet5.thumb_document_id == 0) {
                    document = null;
                    break;
                }
                int i9 = 0;
                while (true) {
                    if (i9 >= tL_messages_stickerSet5.documents.size()) {
                        document = null;
                        break;
                    }
                    document = tL_messages_stickerSet5.documents.get(i9);
                    if (document != null && tL_messages_stickerSet5.set.thumb_document_id == document.id) {
                        break;
                    } else {
                        i9++;
                    }
                }
                if (document == null) {
                    document = tL_messages_stickerSet5.documents.get(0);
                }
                TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet5.set.thumbs, 90);
                if (closestPhotoSizeWithSize == null || tL_messages_stickerSet5.set.gifs) {
                    closestPhotoSizeWithSize = document;
                }
                this.stickersTab.addStickerTab(closestPhotoSizeWithSize, document, tL_messages_stickerSet5).setContentDescription(tL_messages_stickerSet5.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
            }
            i8++;
        }
        this.stickersTab.commitUpdate();
        this.stickersTab.updateTabStyles();
        if (currentPosition != 0) {
            this.stickersTab.onPageScrolled(currentPosition, currentPosition);
        }
        checkPanels();
    }

    private void checkPanels() {
        int iFindFirstVisibleItemPosition;
        if (this.stickersTab == null || (iFindFirstVisibleItemPosition = this.stickersLayoutManager.findFirstVisibleItemPosition()) == -1) {
            return;
        }
        int i = this.favTabNum;
        if (i <= 0 && (i = this.recentTabNum) <= 0) {
            i = this.stickersTabOffset;
        }
        this.stickersTab.onPageScrolled(this.stickersGridAdapter.getTabForPosition(iFindFirstVisibleItemPosition), i);
    }

    private void updateGifTabs() {
        int i;
        int currentPosition = this.gifTabs.getCurrentPosition();
        int i2 = this.gifRecentTabNum;
        boolean z = currentPosition == i2;
        boolean z2 = i2 >= 0;
        boolean zIsEmpty = this.recentGifs.isEmpty();
        this.gifTabs.beginUpdate(false);
        this.gifRecentTabNum = -2;
        this.gifTrendingTabNum = -2;
        this.gifFirstEmojiTabNum = -2;
        if (zIsEmpty) {
            i = 0;
        } else {
            this.gifRecentTabNum = 0;
            this.gifTabs.addIconTab(0, this.gifIcons[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
            i = 1;
        }
        this.gifTrendingTabNum = i;
        this.gifTabs.addIconTab(1, this.gifIcons[1]).setContentDescription(LocaleController.getString(R.string.FeaturedGifs));
        this.gifFirstEmojiTabNum = i + 1;
        AndroidUtilities.dp(13.0f);
        AndroidUtilities.dp(11.0f);
        ArrayList<String> arrayList = MessagesController.getInstance(this.currentAccount).gifSearchEmojies;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            String str = arrayList.get(i3);
            Emoji.EmojiDrawable emojiDrawable = Emoji.getEmojiDrawable(str);
            if (emojiDrawable != null) {
                this.gifTabs.addEmojiTab(i3 + 3, emojiDrawable, MediaDataController.getInstance(this.currentAccount).getEmojiAnimatedSticker(str)).setContentDescription(str);
            }
        }
        this.gifTabs.commitUpdate();
        this.gifTabs.updateTabStyles();
        if (z && zIsEmpty) {
            this.gifTabs.selectTab(this.gifTrendingTabNum);
            SearchField searchField = this.gifSearchField;
            if (searchField == null || searchField.categoriesListView == null) {
                return;
            }
            this.gifSearchField.categoriesListView.selectCategory(this.gifSearchField.trending);
            return;
        }
        if (ViewCompat.isLaidOut(this.gifTabs)) {
            if (zIsEmpty || z2) {
                if (zIsEmpty && z2) {
                    this.gifTabs.onPageScrolled(currentPosition - 1, 0);
                }
            } else {
                this.gifTabs.onPageScrolled(currentPosition + 1, 0);
            }
        }
    }

    public void addRecentSticker(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        MediaDataController.getInstance(this.currentAccount).addRecentSticker(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean zIsEmpty = this.recentStickers.isEmpty();
        this.recentStickers = MediaDataController.getInstance(this.currentAccount).getRecentStickers(0, true);
        StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
        if (stickersGridAdapter != null) {
            stickersGridAdapter.notifyDataSetChanged();
        }
        if (zIsEmpty) {
            updateStickerTabs(false);
        }
    }

    public void addRecentGif(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        boolean zIsEmpty = this.recentGifs.isEmpty();
        updateRecentGifs();
        if (zIsEmpty) {
            updateStickerTabs(false);
        }
    }

    @Override
    public void requestLayout() {
        if (this.isLayout) {
            return;
        }
        super.requestLayout();
    }

    public void updateColors() {
        SearchField searchField;
        if (!this.shouldDrawBackground) {
            setBackground(null);
            this.bottomTabContainerBackground.setBackground(null);
        } else if (AndroidUtilities.isInMultiwindow || this.forseMultiwindowLayout) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_emojiPanelBackground), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            int i = Theme.key_chat_emojiPanelBackground;
            setBackgroundColor(getThemedColor(i));
            if (this.needEmojiSearch) {
                this.bottomTabContainerBackground.setBackgroundColor(getThemedColor(i));
            }
        }
        EmojiTabsStrip emojiTabsStrip = this.emojiTabs;
        if (emojiTabsStrip != null) {
            if (this.shouldDrawBackground) {
                emojiTabsStrip.setBackgroundColor(getThemedColor(Theme.key_chat_emojiPanelBackground));
                this.emojiTabsShadow.setBackgroundColor(getThemedColor(Theme.key_chat_emojiPanelShadowLine));
            } else {
                emojiTabsStrip.setBackground(null);
            }
        }
        EmojiColorPickerWindow emojiColorPickerWindow = this.colorPickerView;
        if (emojiColorPickerWindow != null) {
            emojiColorPickerWindow.updateColors();
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 == 0) {
                searchField = this.stickersSearchField;
            } else if (i2 == 1) {
                searchField = this.emojiSearchField;
            } else {
                searchField = this.gifSearchField;
            }
            if (searchField != null) {
                if (this.shouldDrawBackground) {
                    searchField.backgroundView.setBackgroundColor(getThemedColor(Theme.key_chat_emojiPanelBackground));
                } else {
                    searchField.backgroundView.setBackground(null);
                }
                searchField.shadowView.setBackgroundColor(getThemedColor(Theme.key_chat_emojiPanelShadowLine));
                searchField.searchStateDrawable.setColor(this.glassDesign ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiSearchIcon));
                Theme.setDrawableColor(searchField.box.getBackground(), this.glassDesign ? getGlassIconColor(0.06f) : getThemedColor(Theme.key_chat_emojiSearchBackground));
                searchField.box.invalidate();
                searchField.searchEditText.setHintTextColor(this.glassDesign ? getGlassIconColor(0.45f) : getThemedColor(Theme.key_chat_emojiSearchIcon));
                searchField.searchEditText.setTextColor(this.glassDesign ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            }
        }
        Paint paint = this.dotPaint;
        if (paint != null) {
            paint.setColor(getThemedColor(Theme.key_chat_emojiPanelNewTrending));
        }
        EmojiGridView emojiGridView = this.emojiGridView;
        if (emojiGridView != null) {
            emojiGridView.setGlowColor(getThemedColor(Theme.key_chat_emojiPanelBackground));
        }
        RecyclerListView recyclerListView = this.stickersGridView;
        if (recyclerListView != null) {
            recyclerListView.setGlowColor(getThemedColor(Theme.key_chat_emojiPanelBackground));
        }
        ScrollSlidingTabStrip scrollSlidingTabStrip = this.stickersTab;
        if (scrollSlidingTabStrip != null) {
            scrollSlidingTabStrip.setIndicatorColor(getThemedColor(Theme.key_chat_emojiPanelStickerPackSelectorLine));
            this.stickersTab.setUnderlineColor(getThemedColor(Theme.key_chat_emojiPanelShadowLine));
            if (this.shouldDrawBackground) {
                this.stickersTab.setBackgroundColor(getThemedColor(Theme.key_chat_emojiPanelBackground));
            } else {
                this.stickersTab.setBackground(null);
            }
        }
        ScrollSlidingTabStrip scrollSlidingTabStrip2 = this.gifTabs;
        if (scrollSlidingTabStrip2 != null) {
            scrollSlidingTabStrip2.setIndicatorColor(getThemedColor(Theme.key_chat_emojiPanelStickerPackSelectorLine));
            this.gifTabs.setUnderlineColor(getThemedColor(Theme.key_chat_emojiPanelShadowLine));
            if (this.shouldDrawBackground) {
                this.gifTabs.setBackgroundColor(getThemedColor(Theme.key_chat_emojiPanelBackground));
            } else {
                this.gifTabs.setBackground(null);
            }
        }
        ImageView imageView = this.backspaceButton;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(this.glassDesign ? getGlassIconColor(0.6f) : getThemedColor(Theme.key_chat_emojiPanelBackspace), PorterDuff.Mode.MULTIPLY));
            if (this.emojiSearchField == null) {
                Drawable background2 = this.backspaceButton.getBackground();
                int i3 = Theme.key_chat_emojiPanelBackground;
                Theme.setSelectorDrawableColor(background2, getThemedColor(i3), false);
                Theme.setSelectorDrawableColor(this.backspaceButton.getBackground(), getThemedColor(i3), true);
            }
        }
        ImageView imageView2 = this.stickerSettingsButton;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(this.glassDesign ? getGlassIconColor(0.6f) : getThemedColor(Theme.key_chat_emojiPanelBackspace), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView3 = this.searchButton;
        if (imageView3 != null) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.glassDesign ? getGlassIconColor(0.6f) : getThemedColor(Theme.key_chat_emojiPanelBackspace), PorterDuff.Mode.MULTIPLY));
        }
        TextView textView = this.mediaBanTooltip;
        if (textView != null) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(getThemedColor(Theme.key_chat_gifSaveHintBackground));
            this.mediaBanTooltip.setTextColor(getThemedColor(Theme.key_chat_gifSaveHintText));
        }
        GifAdapter gifAdapter = this.gifSearchAdapter;
        if (gifAdapter != null) {
            ImageView imageView4 = gifAdapter.progressEmptyView.imageView;
            int i4 = Theme.key_chat_emojiPanelEmptyText;
            imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), PorterDuff.Mode.MULTIPLY));
            this.gifSearchAdapter.progressEmptyView.textView.setTextColor(getThemedColor(i4));
            this.gifSearchAdapter.progressEmptyView.progressView.setProgressColor(getThemedColor(Theme.key_progressCircle));
        }
        this.animatedEmojiTextColorFilter = new PorterDuffColorFilter(getThemedColor(Theme.key_featuredStickers_addButton), PorterDuff.Mode.SRC_IN);
        int i5 = 0;
        while (true) {
            Drawable[] drawableArr = this.tabIcons;
            if (i5 >= drawableArr.length) {
                break;
            }
            Theme.setEmojiDrawableColor(drawableArr[i5], this.glassDesign ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiBottomPanelIcon), false);
            Theme.setEmojiDrawableColor(this.tabIcons[i5], this.glassDesign ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected), true);
            i5++;
        }
        EmojiTabsStrip emojiTabsStrip2 = this.emojiTabs;
        if (emojiTabsStrip2 != null) {
            emojiTabsStrip2.updateColors();
        }
        int i6 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.stickerIcons;
            if (i6 >= drawableArr2.length) {
                break;
            }
            Theme.setEmojiDrawableColor(drawableArr2[i6], this.glassDesign ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiPanelIcon), false);
            Theme.setEmojiDrawableColor(this.stickerIcons[i6], this.glassDesign ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected), true);
            i6++;
        }
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.gifIcons;
            if (i7 >= drawableArr3.length) {
                break;
            }
            Theme.setEmojiDrawableColor(drawableArr3[i7], this.glassDesign ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiPanelIcon), false);
            Theme.setEmojiDrawableColor(this.gifIcons[i7], this.glassDesign ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected), true);
            i7++;
        }
        Drawable drawable = this.searchIconDrawable;
        if (drawable != null) {
            Theme.setEmojiDrawableColor(drawable, this.glassDesign ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiBottomPanelIcon), false);
            Theme.setEmojiDrawableColor(this.searchIconDrawable, this.glassDesign ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelIconSelected), true);
        }
        Drawable drawable2 = this.searchIconDotDrawable;
        if (drawable2 != null) {
            Theme.setEmojiDrawableColor(drawable2, this.glassDesign ? getGlassIconColor(0.4f) : getThemedColor(Theme.key_chat_emojiPanelStickerPackSelectorLine), false);
            Theme.setEmojiDrawableColor(this.searchIconDotDrawable, this.glassDesign ? getGlassIconColor(0.8f) : getThemedColor(Theme.key_chat_emojiPanelStickerPackSelectorLine), true);
        }
        Paint paint2 = this.emojiLockPaint;
        if (paint2 != null) {
            paint2.setColor(getThemedColor(Theme.key_chat_emojiPanelStickerSetName));
            Paint paint3 = this.emojiLockPaint;
            paint3.setAlpha((int) (paint3.getAlpha() * 0.5f));
        }
        Drawable drawable3 = this.emojiLockDrawable;
        if (drawable3 != null) {
            drawable3.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_emojiPanelStickerSetName), PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        this.isLayout = true;
        if (AndroidUtilities.isInMultiwindow || this.forseMultiwindowLayout) {
            if (this.currentBackgroundType != 1) {
                if (!this.customOutline) {
                    setOutlineProvider((ViewOutlineProvider) this.outlineProvider);
                    setClipToOutline(true);
                    setElevation(AndroidUtilities.dp(2.0f));
                }
                setBackgroundResource(R.drawable.smiles_popup);
                Drawable background = getBackground();
                int i3 = Theme.key_chat_emojiPanelBackground;
                background.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), PorterDuff.Mode.MULTIPLY));
                if (this.needEmojiSearch && this.shouldDrawBackground) {
                    this.bottomTabContainerBackground.setBackgroundColor(getThemedColor(i3));
                }
                this.currentBackgroundType = 1;
            }
        } else if (this.currentBackgroundType != 0) {
            if (!this.customOutline) {
                setOutlineProvider(null);
                setClipToOutline(false);
                setElevation(0.0f);
            }
            if (this.shouldDrawBackground) {
                int i4 = Theme.key_chat_emojiPanelBackground;
                setBackgroundColor(getThemedColor(i4));
                if (this.needEmojiSearch) {
                    this.bottomTabContainerBackground.setBackgroundColor(getThemedColor(i4));
                }
            }
            this.currentBackgroundType = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        this.isLayout = false;
        setTranslationY(getTranslationY());
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (this.lastNotifyWidth != i5) {
            this.lastNotifyWidth = i5;
            reloadStickersAdapter();
        }
        super.onLayout(z, i, i2, i3, i4);
        updateBottomTabContainerPosition();
        updateStickerTabsPosition();
    }

    public void reloadStickersAdapter() {
        StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
        if (stickersGridAdapter != null) {
            stickersGridAdapter.notifyDataSetChanged();
        }
        StickersSearchGridAdapter stickersSearchGridAdapter = this.stickersSearchGridAdapter;
        if (stickersSearchGridAdapter != null) {
            stickersSearchGridAdapter.notifyDataSetChanged();
        }
        if (ContentPreviewViewer.getInstance().isVisible()) {
            ContentPreviewViewer.getInstance().close();
        }
        ContentPreviewViewer.getInstance().reset();
    }

    public void setDelegate(EmojiViewDelegate emojiViewDelegate) {
        this.delegate = emojiViewDelegate;
    }

    public void setDragListener(DragListener dragListener) {
        this.dragListener = dragListener;
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        updateStickerTabs(false);
    }

    public void invalidateViews() {
        this.emojiGridView.invalidateViews();
    }

    public void setForseMultiwindowLayout(boolean z) {
        this.forseMultiwindowLayout = z;
    }

    public void onOpen(boolean z, boolean z2) {
        if (this.currentPage != 0 && this.stickersBanned) {
            this.currentPage = 0;
        }
        if (this.currentPage == 0 && this.emojiBanned) {
            this.currentPage = 1;
        }
        if (this.currentPage == 0 || z || this.currentTabs.size() == 1) {
            showBackspaceButton(true, false);
            showStickerSettingsButton(false, false);
            if (this.pager.getCurrentItem() != 0) {
                this.pager.setCurrentItem(0, !z);
            }
            if (z2) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onOpen$25();
                    }
                }, 350L);
            }
        } else {
            int i = this.currentPage;
            if (i == 1) {
                showBackspaceButton(false, false);
                showStickerSettingsButton(this.shouldDrawBackground || this.shouldDrawStickerSettings, false);
                if (this.pager.getCurrentItem() != 2) {
                    this.pager.setCurrentItem(2, false);
                }
                ScrollSlidingTabStrip scrollSlidingTabStrip = this.stickersTab;
                if (scrollSlidingTabStrip != null) {
                    this.firstTabUpdate = true;
                    int i2 = this.favTabNum;
                    if (i2 >= 0) {
                        scrollSlidingTabStrip.selectTab(i2);
                    } else {
                        int i3 = this.recentTabNum;
                        if (i3 >= 0) {
                            scrollSlidingTabStrip.selectTab(i3);
                        } else {
                            scrollSlidingTabStrip.selectTab(this.stickersTabOffset);
                        }
                    }
                    this.firstTabUpdate = false;
                    this.stickersLayoutManager.scrollToPositionWithOffset(0, 0);
                }
            } else if (i == 2) {
                showBackspaceButton(false, false);
                showStickerSettingsButton(false, false);
                if (this.pager.getCurrentItem() != 1) {
                    this.pager.setCurrentItem(1, false);
                }
                ScrollSlidingTabStrip scrollSlidingTabStrip2 = this.gifTabs;
                if (scrollSlidingTabStrip2 != null) {
                    scrollSlidingTabStrip2.selectTab(0);
                }
                SearchField searchField = this.gifSearchField;
                if (searchField != null && searchField.categoriesListView != null) {
                    this.gifSearchField.categoriesListView.selectCategory(this.gifSearchField.recent);
                }
            }
        }
        showBottomTab(true, true);
    }

    public void lambda$onOpen$25() {
        ArrayList<EmojiPack> emojipacks = getEmojipacks();
        for (int i = 0; i < emojipacks.size(); i++) {
            if (emojipacks.get(i).forGroup) {
                int i2 = this.emojiAdapter.sectionToPosition.get(EmojiData.dataColored.length + i);
                this.emojiGridView.stopScroll();
                updateEmojiTabsPosition(i2);
                scrollEmojisToPosition(i2, AndroidUtilities.dp(-9.0f));
                checkEmojiTabY(null, 0);
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupPackUpdated);
        if (this.stickersGridAdapter != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onAttachedToWindow$26();
                }
            });
        }
    }

    public void lambda$onAttachedToWindow$26() {
        updateStickerTabs(false);
        reloadStickersAdapter();
    }

    @Override
    public void setVisibility(int i) {
        boolean z = getVisibility() != i;
        super.setVisibility(i);
        if (z) {
            if (i != 8) {
                Emoji.sortEmoji();
                this.emojiAdapter.notifyDataSetChanged();
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
                if (this.stickersGridAdapter != null) {
                    NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
                    updateStickerTabs(false);
                    reloadStickersAdapter();
                }
                checkDocuments(true);
                checkDocuments(false);
                MediaDataController.getInstance(this.currentAccount).loadRecents(0, true, true, false);
                MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
                MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
            }
            ChooseStickerActionTracker chooseStickerActionTracker = this.chooseStickerActionTracker;
            if (chooseStickerActionTracker != null) {
                chooseStickerActionTracker.checkVisibility();
            }
        }
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void onDestroy() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupPackUpdated);
        if (this.stickersGridAdapter != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EmojiColorPickerWindow emojiColorPickerWindow = this.colorPickerView;
        if (emojiColorPickerWindow != null && emojiColorPickerWindow.isShowing()) {
            this.colorPickerView.dismiss();
        }
        ContentPreviewViewer.getInstance().clearDelegate(this.contentPreviewViewerDelegate);
    }

    private void checkDocuments(boolean z) {
        if (z) {
            updateRecentGifs();
            return;
        }
        int size = this.recentStickers.size();
        int size2 = this.favouriteStickers.size();
        this.recentStickers = MediaDataController.getInstance(this.currentAccount).getRecentStickers(0, true);
        this.favouriteStickers = MediaDataController.getInstance(this.currentAccount).getRecentStickers(2);
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.premiumStickers = MediaDataController.getInstance(this.currentAccount).getRecentStickers(7);
        } else {
            this.premiumStickers = new ArrayList();
        }
        for (int i = 0; i < this.favouriteStickers.size(); i++) {
            TLRPC.Document document = (TLRPC.Document) this.favouriteStickers.get(i);
            for (int i2 = 0; i2 < this.recentStickers.size(); i2++) {
                TLRPC.Document document2 = (TLRPC.Document) this.recentStickers.get(i2);
                if (document2.dc_id == document.dc_id && document2.id == document.id) {
                    this.recentStickers.remove(i2);
                    break;
                }
            }
        }
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            int i3 = 0;
            while (i3 < this.favouriteStickers.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.favouriteStickers.get(i3))) {
                    this.favouriteStickers.remove(i3);
                    i3--;
                }
                i3++;
            }
            int i4 = 0;
            while (i4 < this.recentStickers.size()) {
                if (MessageObject.isPremiumSticker((TLRPC.Document) this.recentStickers.get(i4))) {
                    this.recentStickers.remove(i4);
                    i4--;
                }
                i4++;
            }
        }
        if (size != this.recentStickers.size() || size2 != this.favouriteStickers.size()) {
            updateStickerTabs(false);
        }
        StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
        if (stickersGridAdapter != null) {
            stickersGridAdapter.notifyDataSetChanged();
        }
        checkPanels();
    }

    public void updateRecentGifs() {
        GifAdapter gifAdapter;
        int size = this.recentGifs.size();
        long jCalcDocumentsHash = MediaDataController.calcDocumentsHash(this.recentGifs, Integer.MAX_VALUE);
        ArrayList<TLRPC.Document> recentGifs = MediaDataController.getInstance(this.currentAccount).getRecentGifs();
        this.recentGifs = recentGifs;
        long jCalcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, Integer.MAX_VALUE);
        if ((this.gifTabs != null && size == 0 && !this.recentGifs.isEmpty()) || (size != 0 && this.recentGifs.isEmpty())) {
            updateGifTabs();
        }
        if ((size == this.recentGifs.size() && jCalcDocumentsHash == jCalcDocumentsHash2) || (gifAdapter = this.gifAdapter) == null) {
            return;
        }
        gifAdapter.notifyDataSetChanged();
    }

    public void setStickersBanned(boolean z, boolean z2, long j) {
        PagerSlidingTabStrip pagerSlidingTabStrip = this.typeTabs;
        if (pagerSlidingTabStrip == null) {
            return;
        }
        this.emojiBanned = z;
        this.stickersBanned = z2;
        if (z2 || z) {
            this.currentChatId = j;
        } else {
            this.currentChatId = 0L;
        }
        View tab = pagerSlidingTabStrip.getTab(z2 ? 2 : 0);
        if (tab != null) {
            tab.setAlpha(this.currentChatId != 0 ? 0.15f : 1.0f);
            if (z2) {
                if (this.currentChatId == 0 || this.pager.getCurrentItem() == 0) {
                    return;
                }
                showBackspaceButton(true, true);
                showStickerSettingsButton(false, true);
                this.pager.setCurrentItem(0, false);
                return;
            }
            if (this.currentChatId == 0 || this.pager.getCurrentItem() == 1) {
                return;
            }
            showBackspaceButton(false, true);
            showStickerSettingsButton(false, true);
            this.pager.setCurrentItem(1, false);
        }
    }

    public void showStickerBanHint(boolean z, final boolean z2, final boolean z3) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.currentChatId));
        if (chat == null) {
            return;
        }
        if (z) {
            if (!ChatObject.hasAdminRights(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && (tL_chatBannedRights.send_stickers || (z2 && tL_chatBannedRights.send_plain))) {
                BaseFragment baseFragment = this.fragment;
                if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (z2) {
                    this.mediaBanTooltip.setText(LocaleController.getString(R.string.GlobalAttachEmojiRestricted));
                } else if (z3) {
                    this.mediaBanTooltip.setText(LocaleController.getString(R.string.GlobalAttachGifRestricted));
                } else {
                    this.mediaBanTooltip.setText(LocaleController.getString(R.string.GlobalAttachStickersRestricted));
                }
            } else {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                if (tL_chatBannedRights2 == null) {
                    return;
                }
                if (!AndroidUtilities.isBannedForever(tL_chatBannedRights2)) {
                    if (z2) {
                        this.mediaBanTooltip.setText(LocaleController.formatString("AttachPlainRestricted", R.string.AttachPlainRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                    if (z3) {
                        this.mediaBanTooltip.setText(LocaleController.formatString("AttachGifRestricted", R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        this.mediaBanTooltip.setText(LocaleController.formatString("AttachStickersRestricted", R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else if (z2) {
                    this.mediaBanTooltip.setText(LocaleController.getString(R.string.AttachPlainRestrictedForever));
                } else if (z3) {
                    this.mediaBanTooltip.setText(LocaleController.getString(R.string.AttachGifRestrictedForever));
                } else {
                    this.mediaBanTooltip.setText(LocaleController.getString(R.string.AttachStickersRestrictedForever));
                }
            }
            this.mediaBanTooltip.setVisibility(0);
        }
        AnimatorSet animatorSet = this.showStickersBanAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.showStickersBanAnimator = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.showStickersBanAnimator = animatorSet2;
        TextView textView = this.mediaBanTooltip;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? textView.getAlpha() : 1.0f, z ? 1.0f : 0.0f);
        TextView textView2 = this.mediaBanTooltip;
        animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) View.TRANSLATION_Y, z ? AndroidUtilities.dp(12.0f) : textView2.getTranslationY(), z ? 0.0f : AndroidUtilities.dp(12.0f)));
        Runnable runnable = this.hideStickersBan;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        if (z) {
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showStickerBanHint$27(z2, z3);
                }
            };
            this.hideStickersBan = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 3500L);
        }
        this.showStickersBanAnimator.setDuration(320L);
        this.showStickersBanAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.showStickersBanAnimator.start();
    }

    public void lambda$showStickerBanHint$27(boolean z, boolean z2) {
        showStickerBanHint(false, z, z2);
    }

    private void updateVisibleTrendingSets() {
        boolean z;
        RecyclerListView recyclerListView = this.stickersGridView;
        if (recyclerListView == null) {
            return;
        }
        try {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.stickersGridView.getChildAt(i);
                if ((childAt instanceof FeaturedStickerSetInfoCell) && ((RecyclerListView.Holder) this.stickersGridView.getChildViewHolder(childAt)) != null) {
                    FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) childAt;
                    ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(this.currentAccount).getUnreadStickerSets();
                    TLRPC.StickerSetCovered stickerSet = featuredStickerSetInfoCell.getStickerSet();
                    boolean z2 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.id));
                    int i2 = 0;
                    while (true) {
                        TLRPC.StickerSetCovered[] stickerSetCoveredArr = this.primaryInstallingStickerSets;
                        if (i2 >= stickerSetCoveredArr.length) {
                            z = false;
                            break;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered = stickerSetCoveredArr[i2];
                        if (stickerSetCovered != null && stickerSetCovered.set.id == stickerSet.set.id) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    featuredStickerSetInfoCell.setStickerSet(stickerSet, z2, true, 0, 0, z);
                    if (z2) {
                        MediaDataController.getInstance(this.currentAccount).markFeaturedStickersByIdAsRead(false, stickerSet.set.id);
                    }
                    boolean z3 = this.installingStickerSets.indexOfKey(stickerSet.set.id) >= 0;
                    boolean z4 = this.removingStickerSets.indexOfKey(stickerSet.set.id) >= 0;
                    if (z3 || z4) {
                        if (z3 && featuredStickerSetInfoCell.isInstalled()) {
                            this.installingStickerSets.remove(stickerSet.set.id);
                            z3 = false;
                        } else if (z4 && !featuredStickerSetInfoCell.isInstalled()) {
                            this.removingStickerSets.remove(stickerSet.set.id);
                        }
                    }
                    featuredStickerSetInfoCell.setAddDrawProgress(!z && z3, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean areThereAnyStickers() {
        StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
        return stickersGridAdapter != null && stickersGridAdapter.getItemCount() > 0;
    }

    public void lambda$new$28() {
        EmojiGridAdapter emojiGridAdapter = this.emojiAdapter;
        if (emojiGridAdapter != null) {
            emojiGridAdapter.notifyDataSetChanged(true);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        Utilities.Callback callback;
        TLRPC.StickerSet stickerSet;
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (this.stickersGridAdapter != null) {
                    updateStickerTabs(((Boolean) objArr[1]).booleanValue());
                    updateVisibleTrendingSets();
                    reloadStickersAdapter();
                    checkPanels();
                    return;
                }
                return;
            }
            if (((Integer) objArr[0]).intValue() == 5) {
                if (((Boolean) objArr[1]).booleanValue()) {
                    AndroidUtilities.cancelRunOnUIThread(this.updateStickersLoadedDelayed);
                    AndroidUtilities.runOnUIThread(this.updateStickersLoadedDelayed, 100L);
                    return;
                } else {
                    this.emojiAdapter.notifyDataSetChanged(false);
                    return;
                }
            }
            return;
        }
        if (i == NotificationCenter.groupPackUpdated) {
            long jLongValue = ((Long) objArr[0]).longValue();
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null && chatFull.id == jLongValue && zBooleanValue) {
                this.emojiAdapter.notifyDataSetChanged(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.recentDocumentsDidLoad) {
            boolean zBooleanValue2 = ((Boolean) objArr[0]).booleanValue();
            int iIntValue = ((Integer) objArr[1]).intValue();
            if (zBooleanValue2 || iIntValue == 0 || iIntValue == 2) {
                checkDocuments(zBooleanValue2);
                return;
            }
            return;
        }
        if (i == NotificationCenter.featuredStickersDidLoad) {
            updateVisibleTrendingSets();
            PagerSlidingTabStrip pagerSlidingTabStrip = this.typeTabs;
            if (pagerSlidingTabStrip != null) {
                int childCount = pagerSlidingTabStrip.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    this.typeTabs.getChildAt(i3).invalidate();
                }
            }
            updateStickerTabs(false);
            return;
        }
        if (i == NotificationCenter.featuredEmojiDidLoad) {
            EmojiGridAdapter emojiGridAdapter = this.emojiAdapter;
            if (emojiGridAdapter != null) {
                emojiGridAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i == NotificationCenter.groupStickersDidLoad) {
            Long l = (Long) objArr[0];
            long jLongValue2 = l.longValue();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = objArr.length > 1 ? (TLRPC.TL_messages_stickerSet) objArr[1] : null;
            if (tL_messages_stickerSet != null) {
                StickersSearchGridAdapter stickersSearchGridAdapter = this.stickersSearchGridAdapter;
                if (stickersSearchGridAdapter != null && stickersSearchGridAdapter.selectedPackId == jLongValue2 && this.stickersSearchGridAdapter.selectedPackStickers.size() < tL_messages_stickerSet.documents.size()) {
                    this.stickersSearchGridAdapter.selectedPackStickers = tL_messages_stickerSet.documents;
                    this.stickersSearchGridAdapter.notifyDataSetChanged();
                }
                EmojiSearchAdapter emojiSearchAdapter = this.emojiSearchAdapter;
                if (emojiSearchAdapter != null && emojiSearchAdapter.selectedPackId == jLongValue2 && this.emojiSearchAdapter.selectedPackStickers.size() < tL_messages_stickerSet.documents.size()) {
                    this.emojiSearchAdapter.selectedPackStickers = tL_messages_stickerSet.documents;
                    this.emojiSearchAdapter.notifyDataSetChanged();
                }
            }
            TLRPC.ChatFull chatFull2 = this.info;
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null && stickerSet.id == jLongValue2) {
                updateStickerTabs(false);
            }
            if (this.toInstall.containsKey(l) && objArr.length >= 2 && ((Utilities.Callback) this.toInstall.get(l)) != null && tL_messages_stickerSet != null && (callback = (Utilities.Callback) this.toInstall.remove(l)) != null) {
                callback.run(tL_messages_stickerSet);
            }
            AndroidUtilities.cancelRunOnUIThread(this.updateStickersLoadedDelayed);
            AndroidUtilities.runOnUIThread(this.updateStickersLoadedDelayed, 100L);
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            RecyclerListView recyclerListView = this.stickersGridView;
            if (recyclerListView != null) {
                int childCount2 = recyclerListView.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt = this.stickersGridView.getChildAt(i4);
                    if ((childAt instanceof StickerSetNameCell) || (childAt instanceof StickerEmojiCell)) {
                        childAt.invalidate();
                    }
                }
            }
            EmojiGridView emojiGridView = this.emojiGridView;
            if (emojiGridView != null) {
                emojiGridView.invalidate();
                int childCount3 = this.emojiGridView.getChildCount();
                for (int i5 = 0; i5 < childCount3; i5++) {
                    View childAt2 = this.emojiGridView.getChildAt(i5);
                    if (childAt2 instanceof ImageViewEmoji) {
                        childAt2.invalidate();
                    }
                }
            }
            EmojiColorPickerWindow emojiColorPickerWindow = this.colorPickerView;
            if (emojiColorPickerWindow != null) {
                emojiColorPickerWindow.pickerView.invalidate();
            }
            ScrollSlidingTabStrip scrollSlidingTabStrip = this.gifTabs;
            if (scrollSlidingTabStrip != null) {
                scrollSlidingTabStrip.invalidateTabs();
                return;
            }
            return;
        }
        if (i == NotificationCenter.newEmojiSuggestionsAvailable) {
            if (this.emojiGridView == null || !this.needEmojiSearch) {
                return;
            }
            if ((this.emojiSearchField.searchStateDrawable.getIconState() == 2 || this.emojiGridView.getAdapter() == this.emojiSearchAdapter) && !TextUtils.isEmpty(this.emojiSearchAdapter.lastSearchEmojiString)) {
                EmojiSearchAdapter emojiSearchAdapter2 = this.emojiSearchAdapter;
                emojiSearchAdapter2.search(emojiSearchAdapter2.lastSearchEmojiString);
                return;
            }
            return;
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            EmojiGridAdapter emojiGridAdapter2 = this.emojiAdapter;
            if (emojiGridAdapter2 != null) {
                emojiGridAdapter2.notifyDataSetChanged();
            }
            updateEmojiHeaders();
            updateStickerTabs(false);
        }
    }

    public int getThemedColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return Theme.getColor(i);
    }

    private class TrendingAdapter extends RecyclerListView.SelectionAdapter {
        private boolean emoji;

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public TrendingAdapter(boolean z) {
            this.emoji = z;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            BackupImageView backupImageView = new BackupImageView(EmojiView.this.getContext()) {
                @Override
                protected void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    if (TrendingAdapter.this.emoji) {
                        return;
                    }
                    if (!MediaDataController.getInstance(EmojiView.this.currentAccount).isStickerPackUnread(TrendingAdapter.this.emoji, ((TLRPC.StickerSetCovered) getTag()).set.id) || EmojiView.this.dotPaint == null) {
                        return;
                    }
                    canvas.drawCircle(canvas.getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), EmojiView.this.dotPaint);
                }
            };
            backupImageView.setSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            backupImageView.setLayerNum(1);
            backupImageView.setAspectFit(true);
            backupImageView.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f)));
            return new RecyclerListView.Holder(backupImageView);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ArrayList<TLRPC.Document> arrayList;
            ImageLocation forSticker;
            BackupImageView backupImageView = (BackupImageView) viewHolder.itemView;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (this.emoji ? EmojiView.this.featuredEmojiSets : EmojiView.this.featuredStickerSets).get(i);
            backupImageView.setTag(stickerSetCovered);
            if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), false);
                arrayList = stickerSet == null ? null : stickerSet.documents;
            } else {
                arrayList = stickerSetCovered.covers;
            }
            TLRPC.Document document = stickerSetCovered.cover;
            if (document == null) {
                if (arrayList == null || arrayList.isEmpty()) {
                    document = null;
                } else {
                    if (stickerSetCovered.set == null) {
                        document = null;
                        break;
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            document = null;
                            break;
                        } else {
                            if (arrayList.get(i2).id == stickerSetCovered.set.thumb_document_id) {
                                document = arrayList.get(i2);
                                break;
                            }
                            i2++;
                        }
                    }
                    if (document == null) {
                        document = arrayList.get(0);
                    }
                }
            }
            if (document == null) {
                return;
            }
            if (this.emoji) {
                backupImageView.setColorFilter(MessageObject.isTextColorEmoji(document) ? Theme.getAnimatedEmojiColorFilter(EmojiView.this.resourcesProvider) : null);
            }
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, Theme.key_emptyListPlaceholder, 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            if (closestPhotoSizeWithSize == null || MessageObject.isVideoSticker(document)) {
                closestPhotoSizeWithSize = document;
            }
            boolean z = closestPhotoSizeWithSize instanceof TLRPC.Document;
            if (z) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
            } else if (!(closestPhotoSizeWithSize instanceof TLRPC.PhotoSize)) {
                return;
            } else {
                forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
            }
            if (forSticker == null) {
                return;
            }
            String str = !LiteMode.isEnabled(this.emoji ? 16388 : 1) ? "30_30_firstframe" : "30_30";
            if (z && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
                if (svgThumb != null) {
                    backupImageView.setImage(ImageLocation.getForDocument(document), str, svgThumb, 0, stickerSetCovered);
                    return;
                } else {
                    backupImageView.setImage(ImageLocation.getForDocument(document), str, forSticker, (String) null, 0, stickerSetCovered);
                    return;
                }
            }
            if (forSticker.imageType == 1) {
                backupImageView.setImage(forSticker, str, "tgs", svgThumb, stickerSetCovered);
            } else {
                backupImageView.setImage(forSticker, (String) null, "webp", svgThumb, stickerSetCovered);
            }
        }

        @Override
        public int getItemCount() {
            return (this.emoji ? EmojiView.this.featuredEmojiSets : EmojiView.this.featuredStickerSets).size();
        }
    }

    private class TrendingListView extends RecyclerListView {
        public TrendingListView(Context context, RecyclerView.Adapter adapter) {
            super(context);
            setNestedScrollingEnabled(true);
            setSelectorRadius(AndroidUtilities.dp(4.0f));
            setSelectorDrawableColor(getThemedColor(Theme.key_listSelector));
            setTag(9);
            setItemAnimator(null);
            setLayoutAnimation(null);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) {
                @Override
                public boolean supportsPredictiveItemAnimations() {
                    return false;
                }
            };
            linearLayoutManager.setOrientation(0);
            setLayoutManager(linearLayoutManager);
            setAdapter(adapter);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (getParent() != null && getParent().getParent() != null) {
                getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                EmojiView.this.pager.requestDisallowInterceptTouchEvent(true);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void setDisableStickerEditor() {
        this.disableStickerEditor = true;
    }

    class StickersGridAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private int stickersPerRow;
        private int totalItems;
        private SparseArray rowStartPack = new SparseArray();
        private HashMap packStartPosition = new HashMap();
        private SparseArray cache = new SparseArray();
        private SparseArray cacheParents = new SparseArray();
        private SparseIntArray positionToRow = new SparseIntArray();

        public StickersGridAdapter(Context context) {
            this.context = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.itemView instanceof RecyclerListView;
        }

        @Override
        public int getItemCount() {
            int i = this.totalItems;
            if (i != 0) {
                return i + 1;
            }
            return 0;
        }

        public int getPositionForPack(Object obj) {
            Integer num = (Integer) this.packStartPosition.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 4;
            }
            Object obj = this.cache.get(i);
            if (obj == null) {
                return 1;
            }
            if (obj instanceof TLRPC.Document) {
                return obj instanceof TLRPC.TL_documentEmpty ? 7 : 0;
            }
            if (!(obj instanceof String)) {
                return 2;
            }
            if ("trend1".equals(obj)) {
                return 5;
            }
            return "trend2".equals(obj) ? 6 : 3;
        }

        public int getTabForPosition(int i) {
            Object obj = this.cache.get(i);
            if ("search".equals(obj) || "trend1".equals(obj) || "trend2".equals(obj)) {
                if (EmojiView.this.favTabNum >= 0) {
                    return EmojiView.this.favTabNum;
                }
                if (EmojiView.this.recentTabNum >= 0) {
                    return EmojiView.this.recentTabNum;
                }
                return 0;
            }
            if (i == 0) {
                i = 1;
            }
            if (this.stickersPerRow == 0) {
                int measuredWidth = EmojiView.this.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.stickersPerRow = measuredWidth / AndroidUtilities.dp(72.0f);
            }
            int i2 = this.positionToRow.get(i, Integer.MIN_VALUE);
            if (i2 == Integer.MIN_VALUE) {
                return (EmojiView.this.stickerSets.size() - 1) + EmojiView.this.stickersTabOffset;
            }
            Object obj2 = this.rowStartPack.get(i2);
            if (!(obj2 instanceof String)) {
                return EmojiView.this.stickerSets.indexOf((TLRPC.TL_messages_stickerSet) obj2) + EmojiView.this.stickersTabOffset;
            }
            if ("premium".equals(obj2)) {
                return EmojiView.this.premiumTabNum;
            }
            return "recent".equals(obj2) ? EmojiView.this.recentTabNum : EmojiView.this.favTabNum;
        }

        public void lambda$onCreateViewHolder$1(StickerSetNameCell stickerSetNameCell, View view) {
            RecyclerView.ViewHolder childViewHolder;
            if (EmojiView.this.stickersGridView.indexOfChild(stickerSetNameCell) == -1 || (childViewHolder = EmojiView.this.stickersGridView.getChildViewHolder(stickerSetNameCell)) == null) {
                return;
            }
            if (childViewHolder.getAdapterPosition() == EmojiView.this.groupStickerPackPosition) {
                if (EmojiView.this.groupStickerSet != null) {
                    if (EmojiView.this.delegate != null) {
                        EmojiView.this.delegate.onStickersGroupClick(EmojiView.this.info.id);
                        return;
                    }
                    return;
                }
                MessagesController.getEmojiSettings(EmojiView.this.currentAccount).edit().putLong("group_hide_stickers_" + EmojiView.this.info.id, EmojiView.this.info.stickerset != null ? EmojiView.this.info.stickerset.id : 0L).apply();
                EmojiView.this.updateStickerTabs(false);
                if (EmojiView.this.stickersGridAdapter != null) {
                    EmojiView.this.stickersGridAdapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
            if (this.cache.get(childViewHolder.getAdapterPosition()) == EmojiView.this.recentStickers) {
                AlertDialog alertDialogCreate = new AlertDialog.Builder(this.context).setTitle(LocaleController.getString(R.string.ClearRecentStickersAlertTitle)).setMessage(LocaleController.getString(R.string.ClearRecentStickersAlertMessage)).setPositiveButton(LocaleController.getString(R.string.ClearButton), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        this.f$0.lambda$onCreateViewHolder$0(alertDialog, i);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
                alertDialogCreate.show();
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                }
            }
        }

        public void lambda$onCreateViewHolder$0(AlertDialog alertDialog, int i) {
            MediaDataController.getInstance(EmojiView.this.currentAccount).clearRecentStickers();
        }

        public void lambda$onCreateViewHolder$2(View view) {
            if (EmojiView.this.delegate != null) {
                EmojiView.this.delegate.onStickersGroupClick(EmojiView.this.info.id);
            }
        }

        public void lambda$onCreateViewHolder$3(View view) {
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(EmojiView.this.currentAccount).getFeaturedStickerSets();
            if (featuredStickerSets.isEmpty()) {
                return;
            }
            MessagesController.getEmojiSettings(EmojiView.this.currentAccount).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.id).commit();
            if (EmojiView.this.stickersGridAdapter != null) {
                EmojiView.this.stickersGridAdapter.notifyItemRangeRemoved(1, 2);
            }
            EmojiView.this.updateStickerTabs(false);
        }

        public void lambda$onCreateViewHolder$4(View view, int i) {
            EmojiView.this.openTrendingStickers((TLRPC.StickerSetCovered) view.getTag());
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Object obj;
            ?? emptyCell;
            boolean z = true;
            switch (i) {
                case 0:
                    emptyCell = new StickerEmojiCell(this.context, z, EmojiView.this.resourcesProvider) {
                        @Override
                        public void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                        }
                    };
                    break;
                case 1:
                    emptyCell = new EmptyCell(this.context);
                    break;
                case 2:
                    final StickerSetNameCell stickerSetNameCell = new StickerSetNameCell(this.context, false, EmojiView.this.resourcesProvider, EmojiView.this.glassDesign);
                    stickerSetNameCell.setOnIconClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$onCreateViewHolder$1(stickerSetNameCell, view);
                        }
                    });
                    emptyCell = stickerSetNameCell;
                    break;
                case 3:
                    StickerSetGroupInfoCell stickerSetGroupInfoCell = new StickerSetGroupInfoCell(this.context);
                    stickerSetGroupInfoCell.setAddOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$onCreateViewHolder$2(view);
                        }
                    });
                    stickerSetGroupInfoCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    obj = stickerSetGroupInfoCell;
                    emptyCell = obj;
                    break;
                case 4:
                    View view = new View(this.context);
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, EmojiView.this.searchFieldHeight));
                    obj = view;
                    emptyCell = obj;
                    break;
                case 5:
                    StickerSetNameCell stickerSetNameCell2 = new StickerSetNameCell(this.context, false, EmojiView.this.resourcesProvider, EmojiView.this.glassDesign);
                    stickerSetNameCell2.setOnIconClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            this.f$0.lambda$onCreateViewHolder$3(view2);
                        }
                    });
                    emptyCell = stickerSetNameCell2;
                    break;
                case 6:
                    EmojiView emojiView = EmojiView.this;
                    TrendingListView trendingListView = emojiView.new TrendingListView(this.context, emojiView.trendingAdapter = emojiView.new TrendingAdapter(false));
                    trendingListView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                    trendingListView.setClipToPadding(false);
                    trendingListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                        @Override
                        public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                            rect.right = AndroidUtilities.dp(2.0f);
                        }
                    });
                    trendingListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                        @Override
                        public final void onItemClick(View view2, int i2) {
                            this.f$0.lambda$onCreateViewHolder$4(view2, i2);
                        }
                    });
                    trendingListView.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(52.0f)));
                    obj = trendingListView;
                    emptyCell = obj;
                    break;
                case 7:
                    ?? frameLayout = new FrameLayout(this.context);
                    LinearLayout linearLayout = new LinearLayout(this.context);
                    linearLayout.setOrientation(1);
                    linearLayout.setGravity(17);
                    int iDp = AndroidUtilities.dp(13.0f);
                    EmojiView emojiView2 = EmojiView.this;
                    int i2 = Theme.key_chat_emojiPanelIcon;
                    linearLayout.setBackground(Theme.createRoundRectDrawable(iDp, Theme.multAlpha(emojiView2.getThemedColor(i2), 0.12f)));
                    ScaleStateListAnimator.apply(linearLayout, 0.1f, 1.5f);
                    linearLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            this.f$0.lambda$onCreateViewHolder$5(view2);
                        }
                    });
                    ImageView imageView = new ImageView(this.context);
                    imageView.setImageResource(R.drawable.menu_sticker_add);
                    imageView.setColorFilter(new PorterDuffColorFilter(EmojiView.this.getThemedColor(i2), PorterDuff.Mode.SRC_IN));
                    linearLayout.addView(imageView, LayoutHelper.createLinear(24, 24, 17, 0, 0, 0, 0));
                    TextView textView = new TextView(this.context);
                    textView.setGravity(17);
                    textView.setTextColor(EmojiView.this.getThemedColor(i2));
                    textView.setTextSize(1, 11.0f);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setText(LocaleController.getString(R.string.Create));
                    linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 0, 3, 0, 0));
                    frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 8.0f, 8.0f, 8.0f, 8.0f));
                    emptyCell = frameLayout;
                    break;
                default:
                    emptyCell = 0;
                    break;
            }
            return new RecyclerListView.Holder(emptyCell);
        }

        public void lambda$onCreateViewHolder$5(View view) {
            if (EmojiView.this.fragment instanceof ChatActivity) {
                ((ChatActivity) EmojiView.this.fragment).openAttachMenuForCreatingSticker();
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                TLRPC.Document document = (TLRPC.Document) this.cache.get(i);
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) viewHolder.itemView;
                stickerEmojiCell.setSticker(document, this.cacheParents.get(i), false);
                stickerEmojiCell.setRecent(EmojiView.this.recentStickers.contains(document));
                return;
            }
            ArrayList<TLRPC.Document> arrayList = null;
            if (itemViewType == 1) {
                EmptyCell emptyCell = (EmptyCell) viewHolder.itemView;
                if (i == this.totalItems) {
                    int i3 = this.positionToRow.get(i - 1, Integer.MIN_VALUE);
                    if (i3 == Integer.MIN_VALUE) {
                        emptyCell.setHeight(1);
                        return;
                    }
                    Object obj = this.rowStartPack.get(i3);
                    if (obj instanceof TLRPC.TL_messages_stickerSet) {
                        arrayList = ((TLRPC.TL_messages_stickerSet) obj).documents;
                    } else if (obj instanceof String) {
                        arrayList = "recent".equals(obj) ? EmojiView.this.recentStickers : EmojiView.this.favouriteStickers;
                    }
                    if (arrayList == null) {
                        emptyCell.setHeight(1);
                        return;
                    } else if (!arrayList.isEmpty()) {
                        int height = EmojiView.this.pager.getHeight() - (((int) Math.ceil(arrayList.size() / this.stickersPerRow)) * AndroidUtilities.dp(82.0f));
                        emptyCell.setHeight(height > 0 ? height : 1);
                        return;
                    } else {
                        emptyCell.setHeight(AndroidUtilities.dp(8.0f));
                        return;
                    }
                }
                emptyCell.setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            if (itemViewType != 2) {
                if (itemViewType == 3) {
                    ((StickerSetGroupInfoCell) viewHolder.itemView).setIsLast(i == this.totalItems - 1);
                    return;
                } else {
                    if (itemViewType != 5) {
                        return;
                    }
                    ((StickerSetNameCell) viewHolder.itemView).setText(LocaleController.getString(MediaDataController.getInstance(EmojiView.this.currentAccount).loadFeaturedPremium ? R.string.FeaturedStickersPremium : R.string.FeaturedStickers), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingStickers));
                    return;
                }
            }
            StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
            stickerSetNameCell.setHeaderOnClick(null);
            if (i == EmojiView.this.groupStickerPackPosition) {
                if (EmojiView.this.groupStickersHidden && EmojiView.this.groupStickerSet == null) {
                    i2 = 0;
                } else {
                    i2 = EmojiView.this.groupStickerSet != null ? R.drawable.msg_mini_customize : R.drawable.msg_close;
                }
                TLRPC.Chat chat = EmojiView.this.info != null ? MessagesController.getInstance(EmojiView.this.currentAccount).getChat(Long.valueOf(EmojiView.this.info.id)) : null;
                stickerSetNameCell.setText(LocaleController.formatString("CurrentGroupStickers", R.string.CurrentGroupStickers, chat != null ? chat.title : "Group Stickers"), i2);
                return;
            }
            Object obj2 = this.cache.get(i);
            if (!(obj2 instanceof TLRPC.TL_messages_stickerSet)) {
                if (obj2 != EmojiView.this.recentStickers) {
                    if (obj2 != EmojiView.this.favouriteStickers) {
                        if (obj2 == EmojiView.this.premiumStickers) {
                            stickerSetNameCell.setText(LocaleController.getString(R.string.PremiumStickers), 0);
                            return;
                        }
                        return;
                    }
                    stickerSetNameCell.setText(LocaleController.getString(R.string.FavoriteStickers), 0);
                    return;
                }
                stickerSetNameCell.setText(LocaleController.getString(R.string.RecentStickers), R.drawable.msg_close, LocaleController.getString(R.string.ClearRecentStickersAlertTitle));
                return;
            }
            final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet != null) {
                stickerSetNameCell.setText(stickerSet.title, 0);
                if (tL_messages_stickerSet.set.creator && !EmojiView.this.disableStickerEditor) {
                    stickerSetNameCell.setEdit(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$onBindViewHolder$6(tL_messages_stickerSet, view);
                        }
                    });
                }
                stickerSetNameCell.setHeaderOnClick(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$onBindViewHolder$7(tL_messages_stickerSet, view);
                    }
                });
            }
        }

        public void lambda$onBindViewHolder$6(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, View view) {
            EmojiView.this.delegate.onShowStickerSet(tL_messages_stickerSet.set, null, true);
        }

        public void lambda$onBindViewHolder$7(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, View view) {
            EmojiView.this.delegate.onShowStickerSet(tL_messages_stickerSet.set, null, false);
        }

        private void updateItems() {
            Object obj;
            ArrayList<TLRPC.Document> arrayList;
            int iCeil;
            int i;
            int i2;
            int i3;
            int i4;
            if (EmojiView.this.frozen) {
                return;
            }
            int measuredWidth = EmojiView.this.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            this.stickersPerRow = measuredWidth / AndroidUtilities.dp(72.0f);
            EmojiView.this.stickersLayoutManager.setSpanCount(this.stickersPerRow);
            this.rowStartPack.clear();
            this.packStartPosition.clear();
            this.positionToRow.clear();
            this.cache.clear();
            int i5 = 0;
            this.totalItems = 0;
            ArrayList arrayList2 = EmojiView.this.stickerSets;
            int i6 = -5;
            int i7 = -5;
            int i8 = 0;
            boolean z = false;
            while (i7 < arrayList2.size()) {
                if (i7 == i6) {
                    SparseArray sparseArray = this.cache;
                    int i9 = this.totalItems;
                    this.totalItems = i9 + 1;
                    sparseArray.put(i9, "search");
                    i8++;
                } else if (i7 != -4) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
                    if (i7 == -3) {
                        arrayList = EmojiView.this.favouriteStickers;
                        this.packStartPosition.put("fav", Integer.valueOf(this.totalItems));
                        obj = "fav";
                    } else if (i7 == -2) {
                        arrayList = EmojiView.this.recentStickers;
                        if (!arrayList.isEmpty() && !EmojiView.this.disableStickerEditor) {
                            z = true;
                        }
                        this.packStartPosition.put("recent", Integer.valueOf(this.totalItems));
                        obj = "recent";
                    } else if (i7 != -1) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList2.get(i7);
                        ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet2.documents;
                        if (!z && !EmojiView.this.disableStickerEditor) {
                            ArrayList<TLRPC.Document> arrayList4 = new ArrayList<>(arrayList3);
                            arrayList4.add(i5, new TLRPC.TL_documentEmpty());
                            arrayList3 = arrayList4;
                            z = true;
                        }
                        this.packStartPosition.put(tL_messages_stickerSet2, Integer.valueOf(this.totalItems));
                        obj = null;
                        tL_messages_stickerSet = tL_messages_stickerSet2;
                        arrayList = arrayList3;
                    }
                    if (i7 == EmojiView.this.groupStickerPackNum) {
                        EmojiView.this.groupStickerPackPosition = this.totalItems;
                        if (arrayList.isEmpty()) {
                            this.rowStartPack.put(i8, tL_messages_stickerSet);
                            int i10 = i8 + 1;
                            this.positionToRow.put(this.totalItems, i8);
                            this.rowStartPack.put(i10, tL_messages_stickerSet);
                            i8 += 2;
                            this.positionToRow.put(this.totalItems + 1, i10);
                            SparseArray sparseArray2 = this.cache;
                            int i11 = this.totalItems;
                            this.totalItems = i11 + 1;
                            sparseArray2.put(i11, tL_messages_stickerSet);
                            SparseArray sparseArray3 = this.cache;
                            int i12 = this.totalItems;
                            this.totalItems = i12 + 1;
                            sparseArray3.put(i12, "group");
                        } else if (arrayList.isEmpty()) {
                            iCeil = (int) Math.ceil(arrayList.size() / this.stickersPerRow);
                            if (tL_messages_stickerSet != null) {
                                this.cache.put(this.totalItems, tL_messages_stickerSet);
                            } else {
                                this.cache.put(this.totalItems, arrayList);
                            }
                            this.positionToRow.put(this.totalItems, i8);
                            i = 0;
                            while (i < arrayList.size()) {
                                int i13 = i + 1;
                                i4 = this.totalItems + i13;
                                this.cache.put(i4, arrayList.get(i));
                                if (tL_messages_stickerSet != null) {
                                    this.cacheParents.put(i4, tL_messages_stickerSet);
                                } else {
                                    this.cacheParents.put(i4, obj);
                                }
                                this.positionToRow.put(this.totalItems + i13, i8 + 1 + (i / this.stickersPerRow));
                                i = i13;
                                obj = obj;
                            }
                            i2 = 0;
                            while (true) {
                                i3 = iCeil + 1;
                                if (i2 < i3) {
                                    break;
                                }
                                if (tL_messages_stickerSet != null) {
                                    this.rowStartPack.put(i8 + i2, tL_messages_stickerSet);
                                } else {
                                    if (i7 == -1) {
                                        this.rowStartPack.put(i8 + i2, "premium");
                                    } else if (i7 == -2) {
                                        this.rowStartPack.put(i8 + i2, "recent");
                                    } else {
                                        this.rowStartPack.put(i8 + i2, "fav");
                                    }
                                    i2++;
                                }
                                i2++;
                            }
                            this.totalItems += (iCeil * this.stickersPerRow) + 1;
                            i8 += i3;
                        }
                    } else if (arrayList.isEmpty()) {
                        iCeil = (int) Math.ceil(arrayList.size() / this.stickersPerRow);
                        if (tL_messages_stickerSet != null) {
                            this.cache.put(this.totalItems, tL_messages_stickerSet);
                        } else {
                            this.cache.put(this.totalItems, arrayList);
                        }
                        this.positionToRow.put(this.totalItems, i8);
                        i = 0;
                        while (i < arrayList.size()) {
                            int i14 = i + 1;
                            i4 = this.totalItems + i14;
                            this.cache.put(i4, arrayList.get(i));
                            if (tL_messages_stickerSet != null) {
                                this.cacheParents.put(i4, tL_messages_stickerSet);
                            } else {
                                this.cacheParents.put(i4, obj);
                            }
                            this.positionToRow.put(this.totalItems + i14, i8 + 1 + (i / this.stickersPerRow));
                            i = i14;
                            obj = obj;
                        }
                        i2 = 0;
                        while (true) {
                            i3 = iCeil + 1;
                            if (i2 < i3) {
                                break;
                                break;
                            }
                            if (tL_messages_stickerSet != null) {
                                this.rowStartPack.put(i8 + i2, tL_messages_stickerSet);
                            } else {
                                if (i7 == -1) {
                                    this.rowStartPack.put(i8 + i2, "premium");
                                } else if (i7 == -2) {
                                    this.rowStartPack.put(i8 + i2, "recent");
                                } else {
                                    this.rowStartPack.put(i8 + i2, "fav");
                                }
                                i2++;
                            }
                            i2++;
                        }
                        this.totalItems += (iCeil * this.stickersPerRow) + 1;
                        i8 += i3;
                    }
                } else {
                    MediaDataController mediaDataController = MediaDataController.getInstance(EmojiView.this.currentAccount);
                    SharedPreferences emojiSettings = MessagesController.getEmojiSettings(EmojiView.this.currentAccount);
                    ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                    if (!EmojiView.this.featuredStickerSets.isEmpty() && emojiSettings.getLong("featured_hidden", 0L) != featuredStickerSets.get(i5).set.id) {
                        SparseArray sparseArray4 = this.cache;
                        int i15 = this.totalItems;
                        this.totalItems = i15 + 1;
                        sparseArray4.put(i15, "trend1");
                        SparseArray sparseArray5 = this.cache;
                        int i16 = this.totalItems;
                        this.totalItems = i16 + 1;
                        sparseArray5.put(i16, "trend2");
                        i8 += 2;
                    }
                }
                i7++;
                i5 = 0;
                i6 = -5;
            }
        }

        @Override
        public void notifyItemRangeRemoved(int i, int i2) {
            updateItems();
            super.notifyItemRangeRemoved(i, i2);
        }

        @Override
        public void notifyDataSetChanged() {
            updateItems();
            super.notifyDataSetChanged();
        }
    }

    public static class EmojiPackExpand extends FrameLayout {
        public TextView textView;

        public EmojiPackExpand(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 13.0f);
            this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            this.textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(11.0f), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chat_emojiPanelStickerSetName, resourcesProvider), 99)));
            this.textView.setTypeface(AndroidUtilities.bold());
            this.textView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.66f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f));
            addView(this.textView, LayoutHelper.createFrame(-2, -2, 17));
        }
    }

    public static class CustomEmoji {
        public long documentId;
        public String emoticon;
        public TLRPC.TL_messages_stickerSet stickerSet;

        public TLRPC.Document getDocument() {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSet;
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
                for (int i = 0; i < this.stickerSet.documents.size(); i++) {
                    TLRPC.Document document = this.stickerSet.documents.get(i);
                    if (document != null && document.id == this.documentId) {
                        return document;
                    }
                }
            }
            return null;
        }
    }

    class EmojiGridAdapter extends RecyclerListView.SelectionAdapter {
        private int firstTrendingRow;
        private ArrayList frozenEmojiPacks;
        private int itemCount;
        private ArrayList packStartPosition;
        public int plainEmojisCount;
        private SparseIntArray positionToExpand;
        private SparseIntArray positionToSection;
        private SparseIntArray positionToUnlock;
        private int recentlyUsedHeaderRow;
        private ArrayList rowHashCodes;
        private SparseIntArray sectionToPosition;
        private int trendingHeaderRow;
        private int trendingRow;

        @Override
        public long getItemId(int i) {
            return i;
        }

        private EmojiGridAdapter() {
            this.trendingHeaderRow = -1;
            this.trendingRow = -1;
            this.firstTrendingRow = -1;
            this.recentlyUsedHeaderRow = -1;
            this.rowHashCodes = new ArrayList();
            this.positionToSection = new SparseIntArray();
            this.sectionToPosition = new SparseIntArray();
            this.positionToUnlock = new SparseIntArray();
            this.positionToExpand = new SparseIntArray();
            this.packStartPosition = new ArrayList();
        }

        @Override
        public int getItemCount() {
            return this.itemCount;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == 4 || itemViewType == 3 || itemViewType == 6;
        }

        public void lambda$onCreateViewHolder$0(View view) {
            if (EmojiView.this.featuredEmojiSets == null || EmojiView.this.featuredEmojiSets.isEmpty() || ((TLRPC.StickerSetCovered) EmojiView.this.featuredEmojiSets.get(0)).set == null) {
                return;
            }
            MessagesController.getEmojiSettings(EmojiView.this.currentAccount).edit().putLong("emoji_featured_hidden", ((TLRPC.StickerSetCovered) EmojiView.this.featuredEmojiSets.get(0)).set.id).commit();
            if (EmojiView.this.emojiAdapter != null) {
                EmojiView.this.emojiAdapter.notifyItemRangeRemoved(1, 3);
            }
            if (EmojiView.this.emojiTabs != null) {
                EmojiView.this.emojiTabs.updateEmojiPacks(EmojiView.this.getEmojipacks());
            }
            updateRows();
        }

        public void lambda$onCreateViewHolder$1(View view, int i) {
            TLRPC.StickerSet stickerSet;
            if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) view.getTag();
                ArrayList arrayList = new ArrayList();
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(EmojiView.this.currentAccount).getFeaturedEmojiSets();
                int i2 = -1;
                for (int i3 = 0; i3 < featuredEmojiSets.size(); i3++) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = featuredEmojiSets.get(i3);
                    if (stickerSetCovered2 != null && stickerSetCovered2.set != null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = stickerSetCovered2.set;
                        tL_inputStickerSetID.id = stickerSet2.id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        arrayList.add(tL_inputStickerSetID);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.id == stickerSetCovered2.set.id) {
                            i2 = i3;
                        }
                    }
                }
                MediaDataController.getInstance(EmojiView.this.currentAccount).markFeaturedStickersAsRead(true, true);
                EmojiPacksAlert emojiPacksAlert = new EmojiPacksAlert(EmojiView.this.fragment, EmojiView.this.getContext(), EmojiView.this.fragment == null ? EmojiView.this.resourcesProvider : EmojiView.this.fragment.getResourceProvider(), arrayList);
                if (i2 >= 0) {
                    emojiPacksAlert.highlight(i2);
                }
                if (EmojiView.this.fragment != null) {
                    EmojiView.this.fragment.showDialog(emojiPacksAlert);
                } else {
                    emojiPacksAlert.show();
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View imageViewEmoji;
            View view;
            if (i != 0) {
                if (i == 1) {
                    StickerSetNameCell stickerSetNameCell = new StickerSetNameCell(EmojiView.this.getContext(), true, EmojiView.this.resourcesProvider, EmojiView.this.glassDesign);
                    stickerSetNameCell.setOnIconClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            this.f$0.lambda$onCreateViewHolder$0(view2);
                        }
                    });
                    view = stickerSetNameCell;
                } else if (i == 3) {
                    EmojiView emojiView = EmojiView.this;
                    imageViewEmoji = emojiView.new EmojiPackButton(emojiView.getContext());
                } else if (i == 4) {
                    EmojiView emojiView2 = EmojiView.this;
                    Context context = emojiView2.getContext();
                    EmojiView emojiView3 = EmojiView.this;
                    TrendingListView trendingListView = emojiView2.new TrendingListView(context, emojiView3.trendingEmojiAdapter = emojiView3.new TrendingAdapter(true));
                    trendingListView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
                    trendingListView.setClipToPadding(false);
                    trendingListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                        @Override
                        public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                            rect.right = AndroidUtilities.dp(2.0f);
                        }
                    });
                    trendingListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                        @Override
                        public final void onItemClick(View view2, int i2) {
                            this.f$0.lambda$onCreateViewHolder$1(view2, i2);
                        }
                    });
                    view = trendingListView;
                } else if (i == 5) {
                    EmojiView emojiView4 = EmojiView.this;
                    imageViewEmoji = emojiView4.new EmojiPackHeader(emojiView4.getContext());
                } else if (i == 6) {
                    imageViewEmoji = new EmojiPackExpand(EmojiView.this.getContext(), EmojiView.this.resourcesProvider);
                } else {
                    View view2 = new View(EmojiView.this.getContext());
                    view2.setLayoutParams(new RecyclerView.LayoutParams(-1, EmojiView.this.searchFieldHeight));
                    imageViewEmoji = view2;
                }
                imageViewEmoji = view;
            } else {
                imageViewEmoji = new ImageViewEmoji(EmojiView.this.getContext());
            }
            return new RecyclerListView.Holder(imageViewEmoji);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String strAddColorToCode;
            String str;
            Long lValueOf;
            TLRPC.Document document;
            String str2;
            TLRPC.Document document2;
            String str3;
            int itemViewType = viewHolder.getItemViewType();
            boolean z = true;
            EmojiPack emojiPack = null;
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
                    stickerSetNameCell.position = i;
                    int i2 = this.positionToSection.get(i);
                    if (i == this.trendingHeaderRow) {
                        stickerSetNameCell.setText(LocaleController.getString(R.string.FeaturedEmojiPacks), R.drawable.msg_close, LocaleController.getString(R.string.AccDescrCloseTrendingEmoji));
                        return;
                    }
                    if (i != this.recentlyUsedHeaderRow) {
                        if (i2 >= EmojiView.this.emojiTitles.length) {
                            try {
                                stickerSetNameCell.setText(((EmojiPack) EmojiView.this.emojipacksProcessed.get(i2 - EmojiView.this.emojiTitles.length)).set.title, 0);
                                return;
                            } catch (Exception unused) {
                                stickerSetNameCell.setText("", 0);
                                return;
                            }
                        }
                        stickerSetNameCell.setText(EmojiView.this.emojiTitles[i2], 0);
                        return;
                    }
                    stickerSetNameCell.setText(LocaleController.getString(R.string.RecentlyUsed), 0);
                    return;
                }
                if (itemViewType != 5) {
                    if (itemViewType != 6) {
                        return;
                    }
                    EmojiPackExpand emojiPackExpand = (EmojiPackExpand) viewHolder.itemView;
                    int i3 = this.positionToExpand.get(i);
                    int spanCount = EmojiView.this.emojiLayoutManager.getSpanCount() * 3;
                    if (i3 >= 0 && i3 < EmojiView.this.emojipacksProcessed.size()) {
                        emojiPack = (EmojiPack) EmojiView.this.emojipacksProcessed.get(i3);
                    }
                    if (emojiPack != null) {
                        emojiPackExpand.textView.setText("+" + ((emojiPack.documents.size() - spanCount) + 1));
                        return;
                    }
                    return;
                }
                EmojiPackHeader emojiPackHeader = (EmojiPackHeader) viewHolder.itemView;
                int length = this.positionToSection.get(i) - EmojiView.this.emojiTitles.length;
                EmojiPack emojiPack2 = (EmojiPack) EmojiView.this.emojipacksProcessed.get(length);
                int i4 = length - 1;
                EmojiPack emojiPack3 = i4 >= 0 ? (EmojiPack) EmojiView.this.emojipacksProcessed.get(i4) : null;
                if (emojiPack2 == null || !emojiPack2.featured || (emojiPack3 != null && !emojiPack3.free && emojiPack3.installed && !UserConfig.getInstance(EmojiView.this.currentAccount).isPremium())) {
                    z = false;
                }
                if (emojiPack2 != null && emojiPack2.needLoadSet != null) {
                    MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet(emojiPack2.needLoadSet, false);
                    emojiPack2.needLoadSet = null;
                }
                emojiPackHeader.setStickerSet(emojiPack2, z);
                return;
            }
            ImageViewEmoji imageViewEmoji = (ImageViewEmoji) viewHolder.itemView;
            imageViewEmoji.position = i;
            imageViewEmoji.pack = null;
            if (EmojiView.this.needEmojiSearch) {
                i--;
            }
            if (this.recentlyUsedHeaderRow >= 0) {
                i--;
            }
            if (this.trendingRow >= 0) {
                i -= 2;
            }
            int size = EmojiView.this.getRecentEmoji().size();
            if (i < size) {
                String str4 = EmojiView.this.getRecentEmoji().get(i);
                if (str4 == null || !str4.startsWith("animated_")) {
                    strAddColorToCode = str4;
                    str3 = strAddColorToCode;
                    lValueOf = null;
                } else {
                    try {
                        lValueOf = Long.valueOf(Long.parseLong(str4.substring(9)));
                        strAddColorToCode = null;
                        str3 = null;
                    } catch (Exception unused2) {
                        strAddColorToCode = str4;
                        str3 = strAddColorToCode;
                        lValueOf = null;
                    }
                }
                str2 = str3;
                document2 = null;
            } else {
                int i5 = 0;
                while (true) {
                    String[][] strArr = EmojiData.dataColored;
                    if (i5 < strArr.length) {
                        String[] strArr2 = strArr[i5];
                        int length2 = strArr2.length + 1;
                        int i6 = (i - size) - 1;
                        if (i6 < 0 || i >= size + length2) {
                            size += length2;
                            i5++;
                        } else {
                            String str5 = strArr2[i6];
                            String str6 = Emoji.emojiColor.get(str5);
                            if (str6 != null) {
                                strAddColorToCode = EmojiView.addColorToCode(str5, str6);
                                str = str5;
                                break;
                            }
                            strAddColorToCode = str5;
                        }
                    } else {
                        strAddColorToCode = null;
                    }
                    str = strAddColorToCode;
                    break;
                }
                if (str != null) {
                    lValueOf = null;
                    document = null;
                    break;
                }
                boolean zIsPremium = UserConfig.getInstance(EmojiView.this.currentAccount).isPremium();
                int spanCount2 = EmojiView.this.emojiLayoutManager.getSpanCount() * 3;
                int i7 = 0;
                while (true) {
                    if (i7 >= this.packStartPosition.size()) {
                        lValueOf = null;
                        document = null;
                        break;
                    }
                    EmojiPack emojiPack4 = (EmojiPack) EmojiView.this.emojipacksProcessed.get(i7);
                    int iIntValue = ((Integer) this.packStartPosition.get(i7)).intValue() + 1;
                    int size2 = ((emojiPack4.installed && !emojiPack4.featured && (emojiPack4.free || zIsPremium)) || emojiPack4.expanded) ? emojiPack4.documents.size() : Math.min(spanCount2, emojiPack4.documents.size());
                    int i8 = imageViewEmoji.position;
                    if (i8 >= iIntValue && i8 - iIntValue < size2) {
                        imageViewEmoji.pack = emojiPack4;
                        TLRPC.Document document3 = (TLRPC.Document) emojiPack4.documents.get(imageViewEmoji.position - iIntValue);
                        if (document3 != null) {
                            document = document3;
                            lValueOf = Long.valueOf(document3.id);
                            break;
                        } else {
                            document = document3;
                            lValueOf = null;
                            break;
                        }
                    }
                    i7++;
                }
                str2 = str;
                document2 = document;
                z = false;
            }
            if (lValueOf != null) {
                imageViewEmoji.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            } else {
                imageViewEmoji.setPadding(0, 0, 0, 0);
            }
            if (lValueOf != null) {
                imageViewEmoji.setImageDrawable(null, z);
                if (imageViewEmoji.getSpan() == null || imageViewEmoji.getSpan().getDocumentId() != lValueOf.longValue()) {
                    if (document2 != null) {
                        imageViewEmoji.setSpan(new AnimatedEmojiSpan(document2, (Paint.FontMetricsInt) null));
                    } else {
                        imageViewEmoji.setSpan(new AnimatedEmojiSpan(lValueOf.longValue(), (Paint.FontMetricsInt) null));
                    }
                }
            } else {
                imageViewEmoji.setImageDrawable(Emoji.getEmojiBigDrawable(strAddColorToCode), z);
                imageViewEmoji.setSpan(null);
            }
            imageViewEmoji.setTag(str2);
            imageViewEmoji.setContentDescription(strAddColorToCode);
        }

        @Override
        public int getItemViewType(int i) {
            if (i == this.trendingRow) {
                return 4;
            }
            if (i == this.trendingHeaderRow || i == this.recentlyUsedHeaderRow) {
                return 1;
            }
            if (this.positionToSection.indexOfKey(i) >= 0) {
                return this.positionToSection.get(i) >= EmojiData.dataColored.length ? 5 : 1;
            }
            if (EmojiView.this.needEmojiSearch && i == 0) {
                return 2;
            }
            if (this.positionToUnlock.indexOfKey(i) >= 0) {
                return 3;
            }
            return this.positionToExpand.indexOfKey(i) >= 0 ? 6 : 0;
        }

        private void removeGroupEmojiPackFromInstalled(TLRPC.StickerSet stickerSet, ArrayList arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i);
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set.id == stickerSet.id) {
                    arrayList.remove(i);
                    return;
                }
            }
        }

        public void processEmoji(boolean z) {
            int i;
            boolean z2;
            TLRPC.TL_messages_stickerSet groupStickerSetById;
            EmojiView.this.emojipacksProcessed.clear();
            if (EmojiView.this.allowAnimatedEmoji) {
                MediaDataController mediaDataController = MediaDataController.getInstance(EmojiView.this.currentAccount);
                if (z || this.frozenEmojiPacks == null) {
                    this.frozenEmojiPacks = new ArrayList(mediaDataController.getStickerSets(5));
                }
                ArrayList arrayList = this.frozenEmojiPacks;
                boolean z3 = UserConfig.getInstance(EmojiView.this.currentAccount).isPremium() || EmojiView.this.allowEmojisForNonPremium;
                if (EmojiView.this.info == null || EmojiView.this.info.emojiset == null || (groupStickerSetById = mediaDataController.getGroupStickerSetById(EmojiView.this.info.emojiset)) == null) {
                    i = 0;
                } else {
                    EmojiPack emojiPack = new EmojiPack();
                    emojiPack.index = 0;
                    emojiPack.set = EmojiView.this.info.emojiset;
                    emojiPack.documents = new ArrayList(groupStickerSetById.documents);
                    emojiPack.free = true;
                    emojiPack.installed = true;
                    emojiPack.featured = false;
                    emojiPack.expanded = true;
                    emojiPack.forGroup = true;
                    EmojiView.this.emojipacksProcessed.add(emojiPack);
                    removeGroupEmojiPackFromInstalled(emojiPack.set, arrayList);
                    i = 1;
                }
                if (!z3) {
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i2);
                        if (tL_messages_stickerSet != null && !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet)) {
                            EmojiPack emojiPack2 = new EmojiPack();
                            emojiPack2.index = i;
                            emojiPack2.set = tL_messages_stickerSet.set;
                            emojiPack2.documents = new ArrayList(tL_messages_stickerSet.documents);
                            emojiPack2.free = true;
                            emojiPack2.installed = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.id);
                            emojiPack2.featured = false;
                            emojiPack2.expanded = true;
                            EmojiView.this.emojipacksProcessed.add(emojiPack2);
                            arrayList.remove(i2);
                            i2--;
                            i++;
                        }
                        i2++;
                    }
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
                    if (z3) {
                        EmojiPack emojiPack3 = new EmojiPack();
                        int i4 = i + 1;
                        emojiPack3.index = i;
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet2.set;
                        emojiPack3.set = stickerSet;
                        emojiPack3.documents = tL_messages_stickerSet2.documents;
                        emojiPack3.free = false;
                        emojiPack3.installed = mediaDataController.isStickerPackInstalled(stickerSet.id);
                        emojiPack3.featured = false;
                        emojiPack3.expanded = true;
                        EmojiView.this.emojipacksProcessed.add(emojiPack3);
                        i = i4;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
                            for (int i5 = 0; i5 < tL_messages_stickerSet2.documents.size(); i5++) {
                                if (MessageObject.isFreeEmoji(tL_messages_stickerSet2.documents.get(i5))) {
                                    arrayList2.add(tL_messages_stickerSet2.documents.get(i5));
                                } else {
                                    arrayList3.add(tL_messages_stickerSet2.documents.get(i5));
                                }
                            }
                        }
                        if (arrayList2.size() > 0) {
                            EmojiPack emojiPack4 = new EmojiPack();
                            emojiPack4.index = i;
                            emojiPack4.set = tL_messages_stickerSet2.set;
                            emojiPack4.documents = new ArrayList(arrayList2);
                            emojiPack4.free = true;
                            emojiPack4.installed = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                            emojiPack4.featured = false;
                            emojiPack4.expanded = true;
                            EmojiView.this.emojipacksProcessed.add(emojiPack4);
                            i++;
                        }
                        if (arrayList3.size() > 0) {
                            EmojiPack emojiPack5 = new EmojiPack();
                            emojiPack5.index = i;
                            emojiPack5.set = tL_messages_stickerSet2.set;
                            emojiPack5.documents = new ArrayList(arrayList3);
                            emojiPack5.free = false;
                            emojiPack5.installed = mediaDataController.isStickerPackInstalled(tL_messages_stickerSet2.set.id);
                            emojiPack5.featured = false;
                            emojiPack5.expanded = EmojiView.this.expandedEmojiSets.contains(Long.valueOf(emojiPack5.set.id));
                            EmojiView.this.emojipacksProcessed.add(emojiPack5);
                            i++;
                        }
                    }
                }
                for (int i6 = 0; i6 < EmojiView.this.featuredEmojiSets.size(); i6++) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) EmojiView.this.featuredEmojiSets.get(i6);
                    EmojiPack emojiPack6 = new EmojiPack();
                    emojiPack6.installed = mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id);
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    emojiPack6.set = stickerSet2;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        emojiPack6.documents = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet3 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSet2), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet3 != null) {
                            emojiPack6.documents = stickerSet3.documents;
                        } else {
                            emojiPack6.needLoadSet = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                        }
                    } else {
                        emojiPack6.documents = stickerSetCovered.covers;
                    }
                    ArrayList arrayList4 = emojiPack6.documents;
                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                        int i7 = i + 1;
                        emojiPack6.index = i;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= emojiPack6.documents.size()) {
                                z2 = false;
                                break;
                            } else {
                                if (!MessageObject.isFreeEmoji((TLRPC.Document) emojiPack6.documents.get(i8))) {
                                    z2 = true;
                                    break;
                                }
                                i8++;
                            }
                        }
                        emojiPack6.free = !z2;
                        emojiPack6.expanded = EmojiView.this.expandedEmojiSets.contains(Long.valueOf(emojiPack6.set.id));
                        emojiPack6.featured = true;
                        EmojiView.this.emojipacksProcessed.add(emojiPack6);
                        i = i7;
                    }
                }
                if (EmojiView.this.emojiTabs != null) {
                    EmojiView.this.emojiTabs.updateEmojiPacks(EmojiView.this.getEmojipacks());
                }
            }
        }

        public void expand(int i, View view) {
            int i2 = this.positionToExpand.get(i);
            if (i2 < 0 || i2 >= EmojiView.this.emojipacksProcessed.size()) {
                return;
            }
            EmojiPack emojiPack = (EmojiPack) EmojiView.this.emojipacksProcessed.get(i2);
            if (emojiPack.expanded) {
                return;
            }
            boolean z = i2 + 1 == EmojiView.this.emojipacksProcessed.size();
            int iIntValue = ((Integer) this.packStartPosition.get(i2)).intValue();
            EmojiView.this.expandedEmojiSets.add(Long.valueOf(emojiPack.set.id));
            boolean z2 = UserConfig.getInstance(EmojiView.this.currentAccount).isPremium() || EmojiView.this.allowEmojisForNonPremium;
            int spanCount = EmojiView.this.emojiLayoutManager.getSpanCount() * 3;
            int size = ((emojiPack.installed && !emojiPack.featured && (emojiPack.free || z2)) || emojiPack.expanded) ? emojiPack.documents.size() : Math.min(spanCount, emojiPack.documents.size());
            Integer numValueOf = null;
            Integer numValueOf2 = emojiPack.documents.size() > spanCount ? Integer.valueOf(iIntValue + 1 + size) : null;
            emojiPack.expanded = true;
            int size2 = emojiPack.documents.size() - size;
            if (size2 > 0) {
                numValueOf2 = Integer.valueOf(iIntValue + 1 + size);
                numValueOf = Integer.valueOf(size2);
            }
            processEmoji(false);
            updateRows();
            if (numValueOf2 == null || numValueOf == null) {
                return;
            }
            EmojiView.this.animateExpandFromButton = view;
            EmojiView.this.animateExpandFromPosition = numValueOf2.intValue();
            EmojiView.this.animateExpandToPosition = numValueOf2.intValue() + numValueOf.intValue();
            EmojiView.this.animateExpandStartTime = SystemClock.elapsedRealtime();
            notifyItemRangeInserted(numValueOf2.intValue(), numValueOf.intValue());
            notifyItemChanged(numValueOf2.intValue());
            if (z) {
                final int iIntValue2 = numValueOf2.intValue();
                final float f = numValueOf.intValue() > spanCount / 2 ? 1.5f : 4.0f;
                EmojiView.this.post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$expand$2(f, iIntValue2);
                    }
                });
            }
        }

        public void lambda$expand$2(float f, int i) {
            try {
                LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(EmojiView.this.emojiGridView.getContext(), 0, f);
                linearSmoothScrollerCustom.setTargetPosition(i);
                EmojiView.this.emojiLayoutManager.startSmoothScroll(linearSmoothScrollerCustom);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void updateRows() {
            this.positionToSection.clear();
            this.sectionToPosition.clear();
            this.positionToUnlock.clear();
            this.positionToExpand.clear();
            this.packStartPosition.clear();
            this.rowHashCodes.clear();
            this.itemCount = 0;
            boolean z = UserConfig.getInstance(EmojiView.this.currentAccount).isPremium() || EmojiView.this.allowEmojisForNonPremium;
            if (EmojiView.this.needEmojiSearch) {
                this.itemCount++;
                this.rowHashCodes.add(-1);
            }
            if (z && EmojiView.this.allowAnimatedEmoji && EmojiView.this.featuredEmojiSets.size() > 0 && ((TLRPC.StickerSetCovered) EmojiView.this.featuredEmojiSets.get(0)).set != null && MessagesController.getEmojiSettings(EmojiView.this.currentAccount).getLong("emoji_featured_hidden", 0L) != ((TLRPC.StickerSetCovered) EmojiView.this.featuredEmojiSets.get(0)).set.id && EmojiView.this.needEmojiSearch) {
                int i = this.itemCount;
                this.trendingHeaderRow = i;
                this.trendingRow = i + 1;
                this.itemCount = i + 3;
                this.recentlyUsedHeaderRow = i + 2;
                this.rowHashCodes.add(324953);
                this.rowHashCodes.add(123342);
                this.rowHashCodes.add(929132);
            } else {
                this.trendingHeaderRow = -1;
                this.trendingRow = -1;
                this.recentlyUsedHeaderRow = -1;
            }
            ArrayList<String> recentEmoji = EmojiView.this.getRecentEmoji();
            if (EmojiView.this.emojiTabs != null) {
                EmojiView.this.emojiTabs.showRecent(!recentEmoji.isEmpty());
            }
            this.itemCount += recentEmoji.size();
            for (int i2 = 0; i2 < recentEmoji.size(); i2++) {
                this.rowHashCodes.add(Integer.valueOf(Objects.hash(-43263, recentEmoji.get(i2))));
            }
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[][] strArr = EmojiData.dataColored;
                if (i3 >= strArr.length) {
                    break;
                }
                this.positionToSection.put(this.itemCount, i4);
                this.sectionToPosition.put(i4, this.itemCount);
                this.itemCount += strArr[i3].length + 1;
                this.rowHashCodes.add(Integer.valueOf(Objects.hash(43245, Integer.valueOf(i3))));
                int i5 = 0;
                while (true) {
                    String[] strArr2 = EmojiData.dataColored[i3];
                    if (i5 < strArr2.length) {
                        this.rowHashCodes.add(Integer.valueOf(strArr2[i5].hashCode()));
                        i5++;
                    }
                }
                i3++;
                i4++;
            }
            int spanCount = EmojiView.this.emojiLayoutManager.getSpanCount() * 3;
            this.plainEmojisCount = this.itemCount;
            this.firstTrendingRow = -1;
            if (EmojiView.this.emojipacksProcessed != null) {
                int i6 = 0;
                while (i6 < EmojiView.this.emojipacksProcessed.size()) {
                    this.positionToSection.put(this.itemCount, i4);
                    this.sectionToPosition.put(i4, this.itemCount);
                    this.packStartPosition.add(Integer.valueOf(this.itemCount));
                    EmojiPack emojiPack = (EmojiPack) EmojiView.this.emojipacksProcessed.get(i6);
                    boolean z2 = emojiPack.featured;
                    if (z2 && this.firstTrendingRow < 0) {
                        this.firstTrendingRow = this.itemCount;
                    }
                    int size = ((emojiPack.installed && !z2 && (emojiPack.free || z)) || emojiPack.expanded) ? emojiPack.documents.size() : Math.min(spanCount, emojiPack.documents.size());
                    int i7 = 1 + size;
                    if (emojiPack.expanded || emojiPack.documents.size() <= spanCount) {
                        size = i7;
                    }
                    ArrayList arrayList = this.rowHashCodes;
                    Integer numValueOf = Integer.valueOf(emojiPack.featured ? 56345 : -495231);
                    TLRPC.StickerSet stickerSet = emojiPack.set;
                    arrayList.add(Integer.valueOf(Objects.hash(numValueOf, Long.valueOf(stickerSet == null ? i6 : stickerSet.id), Boolean.valueOf(emojiPack.forGroup))));
                    for (int i8 = 1; i8 < size; i8++) {
                        this.rowHashCodes.add(Integer.valueOf(Objects.hash(Integer.valueOf(emojiPack.featured ? 3442 : -9964), Long.valueOf(((TLRPC.Document) emojiPack.documents.get(i8 - 1)).id))));
                    }
                    this.itemCount += size;
                    if (!emojiPack.expanded && emojiPack.documents.size() > spanCount) {
                        this.positionToExpand.put(this.itemCount, i6);
                        this.rowHashCodes.add(Integer.valueOf(Objects.hash(Integer.valueOf(emojiPack.featured ? -65174 : 92242), Long.valueOf(emojiPack.set.id))));
                        this.itemCount++;
                    }
                    i6++;
                    i4++;
                }
            }
        }

        @Override
        public void notifyDataSetChanged() {
            notifyDataSetChanged(false);
        }

        public void notifyDataSetChanged(boolean z) {
            if (EmojiView.this.frozen) {
                return;
            }
            final ArrayList arrayList = new ArrayList(this.rowHashCodes);
            MediaDataController mediaDataController = MediaDataController.getInstance(EmojiView.this.currentAccount);
            ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = mediaDataController.getFeaturedEmojiSets();
            EmojiView.this.featuredEmojiSets.clear();
            int size = featuredEmojiSets.size();
            for (int i = 0; i < size; i++) {
                TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i);
                if (!mediaDataController.isStickerPackInstalled(stickerSetCovered.set.id) || EmojiView.this.installedEmojiSets.contains(Long.valueOf(stickerSetCovered.set.id))) {
                    EmojiView.this.featuredEmojiSets.add(stickerSetCovered);
                }
            }
            processEmoji(z);
            updateRows();
            if (EmojiView.this.trendingEmojiAdapter != null) {
                EmojiView.this.trendingEmojiAdapter.notifyDataSetChanged();
            }
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
                    return EmojiGridAdapter.this.rowHashCodes.size();
                }

                @Override
                public boolean areItemsTheSame(int i2, int i3) {
                    return ((Integer) arrayList.get(i2)).equals(EmojiGridAdapter.this.rowHashCodes.get(i3));
                }
            }, false).dispatchUpdatesTo(this);
        }
    }

    public ArrayList<EmojiPack> getEmojipacks() {
        ArrayList<EmojiPack> arrayList = new ArrayList<>();
        for (int i = 0; i < this.emojipacksProcessed.size(); i++) {
            EmojiPack emojiPack = (EmojiPack) this.emojipacksProcessed.get(i);
            if ((!emojiPack.featured && (emojiPack.installed || this.installedEmojiSets.contains(Long.valueOf(emojiPack.set.id)))) || (emojiPack.featured && !emojiPack.installed && !this.installedEmojiSets.contains(Long.valueOf(emojiPack.set.id)))) {
                arrayList.add(emojiPack);
            }
        }
        return arrayList;
    }

    private static class EmojiPackInfo {
        private final ArrayList documents;
        private final TLRPC.Document firstDocument;
        private final TLRPC.StickerSet set;
        private final TLRPC.TL_messages_stickerSet stickerSet;
        private final TLRPC.StickerSetCovered stickerSetCovered;

        private EmojiPackInfo(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
            TLRPC.Document document = null;
            this.stickerSetCovered = null;
            this.stickerSet = tL_messages_stickerSet;
            this.set = tL_messages_stickerSet.set;
            this.documents = arrayList;
            if (arrayList != null && !arrayList.isEmpty()) {
                document = (TLRPC.Document) arrayList.get(0);
            }
            this.firstDocument = document;
        }

        private EmojiPackInfo(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
            this.stickerSetCovered = stickerSetCovered;
            TLRPC.Document document = null;
            this.stickerSet = null;
            this.set = stickerSetCovered.set;
            this.documents = arrayList;
            if (arrayList != null && !arrayList.isEmpty()) {
                document = (TLRPC.Document) arrayList.get(0);
            }
            this.firstDocument = document;
        }
    }

    class EmojiSearchAdapter extends RecyclerListView.SelectionAdapter {
        private FoundEmojiPacksRecyclerView foundPacksListView;
        private boolean isCompleted;
        private String lastSearchAlias;
        private String lastSearchEmojiString;
        private SearchRunnable searchRunnable;
        private boolean searchWas;
        private long selectedPackId;
        private TLRPC.StickerSet selectedPackStickerSet;
        private ArrayList selectedPackStickers;
        private final ArrayList result = new ArrayList();
        private final ArrayList resultPre = new ArrayList();
        private final ArrayList resultGlobal = new ArrayList();
        private final ArrayList packs = new ArrayList();

        public EmojiSearchAdapter(Context context) {
            FoundEmojiPacksRecyclerView foundEmojiPacksRecyclerView = new FoundEmojiPacksRecyclerView(context, EmojiView.this.currentAccount, -1, false, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.foundPackListFillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    this.f$0.foundPackListOnClickItem((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, null, EmojiView.this.resourcesProvider, -1, 0) {
            };
            this.foundPacksListView = foundEmojiPacksRecyclerView;
            foundEmojiPacksRecyclerView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
            this.foundPacksListView.setClipToPadding(false);
            this.foundPacksListView.adapter.setApplyBackground(false);
            this.foundPacksListView.setNestedScrollingEnabled(false);
            this.foundPacksListView.setDrawSelection(false);
            this.foundPacksListView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        EmojiView.this.ignorePagerScroll = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        EmojiView.this.ignorePagerScroll = false;
                    }
                    return false;
                }
            });
        }

        public void foundPackListOnClickItem(UItem uItem, View view, int i, float f, float f2) {
            TLRPC.StickerSet stickerSet;
            TLRPC.StickerSet stickerSet2;
            TLRPC.TL_messages_stickerSet stickerSet3;
            Object obj = uItem.object;
            TLRPC.Document document = null;
            if (obj instanceof TLRPC.StickerSetCovered) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj;
                EmojiPackInfo emojiPackInfo = (EmojiPackInfo) uItem.object2;
                long j = this.selectedPackId;
                stickerSet = stickerSetCovered.set;
                long j2 = stickerSet.id;
                if (j == j2) {
                    this.selectedPackId = 0L;
                    stickerSet2 = null;
                } else {
                    this.selectedPackId = j2;
                    this.selectedPackStickers = emojiPackInfo.documents;
                    this.selectedPackStickerSet = stickerSetCovered.set;
                    stickerSet2 = stickerSet;
                }
            } else {
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    long j3 = this.selectedPackId;
                    stickerSet = tL_messages_stickerSet.set;
                    long j4 = stickerSet.id;
                    if (j3 == j4) {
                        this.selectedPackId = 0L;
                    } else {
                        this.selectedPackId = j4;
                        this.selectedPackStickers = tL_messages_stickerSet.documents;
                        this.selectedPackStickerSet = stickerSet;
                        stickerSet2 = stickerSet;
                    }
                }
                stickerSet2 = null;
            }
            int childCount = this.foundPacksListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                FoundStickerPackCell foundStickerPackCell = (FoundStickerPackCell) this.foundPacksListView.getChildAt(i2);
                if (foundStickerPackCell != view) {
                    foundStickerPackCell.setSelected(false, true);
                }
            }
            if (this.selectedPackId != 0 && this.selectedPackStickers.size() < this.selectedPackStickerSet.count && (stickerSet3 = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet(this.selectedPackStickerSet, false)) != null) {
                this.selectedPackStickers = stickerSet3.documents;
            }
            TLObject tLObject = (TLObject) uItem.object;
            EmojiView emojiView = EmojiView.this;
            FoundStickerPackButton foundStickerPackButton = emojiView.emojiAddPackButton;
            ArrayList arrayList = this.selectedPackStickers;
            if (arrayList != null && !arrayList.isEmpty()) {
                document = (TLRPC.Document) this.selectedPackStickers.get(0);
            }
            emojiView.setFoundPackButtonText(foundStickerPackButton, tLObject, stickerSet2, document, true, EmojiView.this.animatorSearchEmojiPackSelected.getFloatValue() > 0.0f);
            ((FoundStickerPackCell) view).setSelected(this.selectedPackId != 0, true);
            EmojiView.this.animatorSearchEmojiPackSelected.setValue(this.selectedPackId != 0, true);
            notifyDataSetChanged();
            EmojiView.this.emojiSearchField.hideKeyboard();
            if (this.selectedPackId != 0) {
                this.foundPacksListView.scrollOnSelect(view);
            }
        }

        public void resetSelectedPackId() {
            int childCount = this.foundPacksListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ((FoundStickerPackCell) this.foundPacksListView.getChildAt(i)).setSelected(false, true);
            }
            this.selectedPackId = 0L;
            EmojiView.this.animatorSearchEmojiPackSelected.setValue(false, true);
            notifyDataSetChanged();
        }

        public void foundPackListFillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            for (EmojiPackInfo emojiPackInfo : this.packs) {
                if (emojiPackInfo.stickerSet != null) {
                    arrayList.add(FoundStickerPackFactory.of(emojiPackInfo.stickerSet, emojiPackInfo.stickerSet.set.id == this.selectedPackId));
                } else if (emojiPackInfo.stickerSetCovered != null) {
                    arrayList.add(FoundStickerPackFactory.of(emojiPackInfo.stickerSetCovered, emojiPackInfo, emojiPackInfo.stickerSetCovered.set.id == this.selectedPackId));
                }
            }
        }

        private int globalSectionStart() {
            int i;
            if (this.packs.isEmpty()) {
                i = !this.result.isEmpty() ? 2 : 1;
            } else {
                i = 3;
            }
            return i + this.result.size();
        }

        @Override
        public int getItemCount() {
            if (this.selectedPackId != 0) {
                return this.selectedPackStickers.size() + 4;
            }
            int i = 1;
            if (this.result.isEmpty() && this.resultGlobal.isEmpty() && this.packs.isEmpty() && !this.searchWas) {
                return EmojiView.this.getRecentEmoji().size() + 1;
            }
            if (this.result.isEmpty() && this.resultGlobal.isEmpty() && this.packs.isEmpty()) {
                return 2;
            }
            if (!this.packs.isEmpty()) {
                i = 3;
            } else if (!this.result.isEmpty()) {
                i = 2;
            }
            int size = i + this.result.size();
            return !this.resultGlobal.isEmpty() ? size + 1 + this.resultGlobal.size() : size;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 4;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View imageViewEmoji;
            if (i == 0) {
                imageViewEmoji = new ImageViewEmoji(EmojiView.this.getContext());
            } else if (i == 1) {
                View view = new View(EmojiView.this.getContext());
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, EmojiView.this.searchFieldHeight));
                imageViewEmoji = view;
            } else if (i == 3) {
                imageViewEmoji = new StickerSetNameCell(EmojiView.this.getContext(), true, EmojiView.this.resourcesProvider, EmojiView.this.glassDesign);
            } else if (i == 4) {
                FoundEmojiPacksRecyclerView foundEmojiPacksRecyclerView = this.foundPacksListView;
                foundEmojiPacksRecyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(79.0f)));
                imageViewEmoji = foundEmojiPacksRecyclerView;
            } else if (i == 5) {
                View view2 = new View(EmojiView.this.getContext());
                view2.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(68.0f)));
                imageViewEmoji = view2;
            } else {
                FrameLayout frameLayout = new FrameLayout(EmojiView.this.getContext()) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        int iDp;
                        View view3 = (View) EmojiView.this.getParent();
                        if (view3 != null) {
                            iDp = (int) (view3.getMeasuredHeight() - EmojiView.this.getY());
                        } else {
                            iDp = AndroidUtilities.dp(120.0f);
                        }
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(iDp - EmojiView.this.searchFieldHeight, 1073741824));
                    }
                };
                TextView textView = new TextView(EmojiView.this.getContext());
                textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                textView.setTextSize(1, 16.0f);
                EmojiView emojiView = EmojiView.this;
                int i2 = Theme.key_chat_emojiPanelEmptyText;
                textView.setTextColor(emojiView.getThemedColor(i2));
                frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(EmojiView.this.getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.msg_emoji_question);
                imageView.setColorFilter(new PorterDuffColorFilter(EmojiView.this.getThemedColor(i2), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(imageView, LayoutHelper.createFrame(48, 48, 85));
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view3) {
                        Object obj;
                        boolean[] zArr = new boolean[1];
                        BottomSheet.Builder builder = new BottomSheet.Builder(EmojiView.this.getContext());
                        LinearLayout linearLayout = new LinearLayout(EmojiView.this.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        ImageView imageView2 = new ImageView(EmojiView.this.getContext());
                        imageView2.setImageResource(R.drawable.smiles_info);
                        linearLayout.addView(imageView2, LayoutHelper.createLinear(-2, -2, 49, 0, 15, 0, 0));
                        TextView textView2 = new TextView(EmojiView.this.getContext());
                        textView2.setText(LocaleController.getString(R.string.EmojiSuggestions));
                        textView2.setTextSize(1, 15.0f);
                        textView2.setTextColor(EmojiView.this.getThemedColor(Theme.key_dialogTextBlue2));
                        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                        textView2.setTypeface(AndroidUtilities.bold());
                        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 51, 0, 24, 0, 0));
                        TextView textView3 = new TextView(EmojiView.this.getContext());
                        textView3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EmojiSuggestionsInfo)));
                        textView3.setTextSize(1, 15.0f);
                        textView3.setTextColor(EmojiView.this.getThemedColor(Theme.key_dialogTextBlack));
                        textView3.setGravity(LocaleController.isRTL ? 5 : 3);
                        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 51, 0, 11, 0, 0));
                        TextView textView4 = new TextView(EmojiView.this.getContext());
                        int i3 = R.string.EmojiSuggestionsUrl;
                        if (EmojiSearchAdapter.this.lastSearchAlias == null) {
                            obj = EmojiView.this.lastSearchKeyboardLanguage;
                        } else {
                            obj = EmojiSearchAdapter.this.lastSearchAlias;
                        }
                        textView4.setText(LocaleController.formatString("EmojiSuggestionsUrl", i3, obj));
                        textView4.setTextSize(1, 15.0f);
                        textView4.setTextColor(EmojiView.this.getThemedColor(Theme.key_dialogTextLink));
                        textView4.setGravity(LocaleController.isRTL ? 5 : 3);
                        linearLayout.addView(textView4, LayoutHelper.createLinear(-2, -2, 51, 0, 18, 0, 16));
                        textView4.setOnClickListener(new AnonymousClass1(zArr, builder));
                        builder.setCustomView(linearLayout);
                        builder.show();
                    }

                    class AnonymousClass1 implements View.OnClickListener {
                        final BottomSheet.Builder val$builder;
                        final boolean[] val$loadingUrl;

                        AnonymousClass1(boolean[] zArr, BottomSheet.Builder builder) {
                            this.val$loadingUrl = zArr;
                            this.val$builder = builder;
                        }

                        @Override
                        public void onClick(View view) {
                            String str;
                            boolean[] zArr = this.val$loadingUrl;
                            if (zArr[0]) {
                                return;
                            }
                            zArr[0] = true;
                            final AlertDialog[] alertDialogArr = {new AlertDialog(EmojiView.this.getContext(), 3)};
                            TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
                            if (EmojiSearchAdapter.this.lastSearchAlias == null) {
                                str = EmojiView.this.lastSearchKeyboardLanguage[0];
                            } else {
                                str = EmojiSearchAdapter.this.lastSearchAlias;
                            }
                            tL_messages_getEmojiURL.lang_code = str;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(EmojiView.this.currentAccount);
                            final BottomSheet.Builder builder = this.val$builder;
                            final int iSendRequest = connectionsManager.sendRequest(tL_messages_getEmojiURL, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    this.f$0.lambda$onClick$1(alertDialogArr, builder, tLObject, tL_error);
                                }
                            });
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$onClick$3(alertDialogArr, iSendRequest);
                                }
                            }, 1000L);
                        }

                        public void lambda$onClick$1(final AlertDialog[] alertDialogArr, final BottomSheet.Builder builder, final TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$onClick$0(alertDialogArr, tLObject, builder);
                                }
                            });
                        }

                        public void lambda$onClick$0(AlertDialog[] alertDialogArr, TLObject tLObject, BottomSheet.Builder builder) {
                            try {
                                alertDialogArr[0].dismiss();
                            } catch (Throwable unused) {
                            }
                            alertDialogArr[0] = null;
                            if (tLObject instanceof TLRPC.TL_emojiURL) {
                                Browser.openUrl(EmojiView.this.getContext(), ((TLRPC.TL_emojiURL) tLObject).url);
                                builder.getDismissRunnable().run();
                            }
                        }

                        public void lambda$onClick$3(AlertDialog[] alertDialogArr, final int i) {
                            AlertDialog alertDialog = alertDialogArr[0];
                            if (alertDialog == null) {
                                return;
                            }
                            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                                @Override
                                public final void onCancel(DialogInterface dialogInterface) {
                                    this.f$0.lambda$onClick$2(i, dialogInterface);
                                }
                            });
                            alertDialogArr[0].show();
                        }

                        public void lambda$onClick$2(int i, DialogInterface dialogInterface) {
                            ConnectionsManager.getInstance(EmojiView.this.currentAccount).cancelRequest(i, true);
                        }
                    }
                });
                frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                imageViewEmoji = frameLayout;
            }
            return new RecyclerListView.Holder(imageViewEmoji);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            String str2;
            TLRPC.Document document;
            boolean z;
            String str3;
            String str4;
            Long lValueOf;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 3) {
                    return;
                }
                StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
                if (this.selectedPackId != 0) {
                    stickerSetNameCell.setText(LocaleController.formatPluralString("EmojiCount", this.selectedPackStickers.size(), new Object[0]), 0);
                    return;
                } else if (i == globalSectionStart()) {
                    stickerSetNameCell.setText(LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult), 0);
                    return;
                } else {
                    stickerSetNameCell.setText(LocaleController.getString(R.string.StickerOrEmojiSearchResult), 0);
                    return;
                }
            }
            ImageViewEmoji imageViewEmoji = (ImageViewEmoji) viewHolder.itemView;
            imageViewEmoji.position = i;
            imageViewEmoji.pack = null;
            int i2 = i - 1;
            if (!this.packs.isEmpty() || this.selectedPackId != 0) {
                i2 = i - 3;
            } else if (!this.result.isEmpty()) {
                i2 = i - 2;
            }
            if (this.selectedPackId != 0) {
                document = (TLRPC.Document) this.selectedPackStickers.get(i2);
                str = null;
                str2 = null;
            } else {
                if (this.result.isEmpty() && this.resultGlobal.isEmpty() && !this.searchWas) {
                    str = EmojiView.this.getRecentEmoji().get(i2);
                    str2 = str;
                    document = null;
                    z = true;
                } else {
                    if (i2 < this.result.size()) {
                        str = ((MediaDataController.KeywordResult) this.result.get(i2)).emoji;
                    } else {
                        str = ((MediaDataController.KeywordResult) this.resultGlobal.get((i2 - this.result.size()) - 1)).emoji;
                    }
                    str2 = str;
                    document = null;
                }
                if (str == null && str.startsWith("animated_")) {
                    try {
                        lValueOf = Long.valueOf(Long.parseLong(str.substring(9)));
                        str4 = null;
                        str3 = null;
                    } catch (Exception unused) {
                        str3 = str2;
                        str4 = str;
                        lValueOf = null;
                    }
                } else {
                    str3 = str2;
                    str4 = str;
                    lValueOf = null;
                }
                if (document == null || lValueOf != null) {
                    imageViewEmoji.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                } else {
                    imageViewEmoji.setPadding(0, 0, 0, 0);
                }
                if (document != null) {
                    imageViewEmoji.setImageDrawable(null, z);
                    if (imageViewEmoji.getSpan() != null || imageViewEmoji.getSpan().document != document) {
                        imageViewEmoji.setSpan(new AnimatedEmojiSpan(document, (Paint.FontMetricsInt) null));
                    }
                } else if (lValueOf != null) {
                    imageViewEmoji.setImageDrawable(null, z);
                    if (imageViewEmoji.getSpan() != null || imageViewEmoji.getSpan().getDocumentId() != lValueOf.longValue()) {
                        imageViewEmoji.setSpan(new AnimatedEmojiSpan(lValueOf.longValue(), (Paint.FontMetricsInt) null));
                    }
                } else if (str3 != null) {
                    imageViewEmoji.setImageDrawable(Emoji.getEmojiBigDrawable(str3), z);
                    imageViewEmoji.setSpan(null);
                } else {
                    imageViewEmoji.setImageDrawable(null, z);
                    imageViewEmoji.setSpan(null);
                }
                imageViewEmoji.setTag(str4);
            }
            z = false;
            if (str == null) {
                str3 = str2;
                str4 = str;
                lValueOf = null;
            } else {
                str3 = str2;
                str4 = str;
                lValueOf = null;
            }
            if (document == null) {
                imageViewEmoji.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            } else {
                imageViewEmoji.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            }
            if (document != null) {
                imageViewEmoji.setImageDrawable(null, z);
                if (imageViewEmoji.getSpan() != null) {
                    imageViewEmoji.setSpan(new AnimatedEmojiSpan(document, (Paint.FontMetricsInt) null));
                } else {
                    imageViewEmoji.setSpan(new AnimatedEmojiSpan(document, (Paint.FontMetricsInt) null));
                }
            } else if (lValueOf != null) {
                imageViewEmoji.setImageDrawable(null, z);
                if (imageViewEmoji.getSpan() != null) {
                    imageViewEmoji.setSpan(new AnimatedEmojiSpan(lValueOf.longValue(), (Paint.FontMetricsInt) null));
                } else {
                    imageViewEmoji.setSpan(new AnimatedEmojiSpan(lValueOf.longValue(), (Paint.FontMetricsInt) null));
                }
            } else if (str3 != null) {
                imageViewEmoji.setImageDrawable(Emoji.getEmojiBigDrawable(str3), z);
                imageViewEmoji.setSpan(null);
            } else {
                imageViewEmoji.setImageDrawable(null, z);
                imageViewEmoji.setSpan(null);
            }
            imageViewEmoji.setTag(str4);
        }

        @Override
        public int getItemViewType(int i) {
            if (this.selectedPackId != 0) {
                if (i == 0) {
                    return 1;
                }
                if (i == 1) {
                    return 4;
                }
                if (i == 2) {
                    return 3;
                }
                return i == getItemCount() - 1 ? 5 : 0;
            }
            if (i == 0) {
                return 1;
            }
            if (i == 1 && this.searchWas && this.result.isEmpty() && this.resultGlobal.isEmpty() && this.packs.isEmpty()) {
                return 2;
            }
            if (this.packs.isEmpty()) {
                if (!this.result.isEmpty() && i == 1) {
                    return 3;
                }
            } else {
                if (i == 1) {
                    return 4;
                }
                if (i == 2) {
                    return 3;
                }
            }
            return (this.resultGlobal.isEmpty() || i != globalSectionStart()) ? 0 : 3;
        }

        public void search(String str) {
            search(str, true);
        }

        public void search(String str, boolean z) {
            if (TextUtils.isEmpty(str)) {
                this.lastSearchEmojiString = null;
                if (EmojiView.this.emojiGridView.getAdapter() != EmojiView.this.emojiAdapter) {
                    EmojiView.this.emojiGridView.setAdapter(EmojiView.this.emojiAdapter);
                    this.searchWas = false;
                }
                this.selectedPackId = 0L;
                EmojiView.this.animatorSearchEmojiPackSelected.setValue(false, true);
                notifyDataSetChanged();
            } else {
                this.lastSearchEmojiString = str.toLowerCase();
            }
            SearchRunnable searchRunnable = this.searchRunnable;
            if (searchRunnable != null) {
                AndroidUtilities.cancelRunOnUIThread(searchRunnable);
            }
            if (TextUtils.isEmpty(this.lastSearchEmojiString)) {
                return;
            }
            this.resultPre.clear();
            this.isCompleted = false;
            EmojiView.this.emojiSearchField.showProgress(true);
            AnonymousClass5 anonymousClass5 = new AnonymousClass5();
            this.searchRunnable = anonymousClass5;
            AndroidUtilities.runOnUIThread(anonymousClass5, z ? 300L : 0L);
        }

        class AnonymousClass5 implements SearchRunnable {
            AnonymousClass5() {
            }

            @Override
            public void loadNext() {
                if (isLoading()) {
                    return;
                }
                final ArrayList arrayList = new ArrayList();
                EmojiView.this.emojiSearchField.showProgress(true);
                EmojiSearchAdapter.this.searchEmoji(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$loadNext$0(arrayList);
                    }
                }, arrayList, true);
            }

            public void lambda$loadNext$0(ArrayList arrayList) {
                EmojiView.this.emojiSearchField.showProgress(false);
                EmojiSearchAdapter emojiSearchAdapter = EmojiSearchAdapter.this;
                emojiSearchAdapter.isCompleted = emojiSearchAdapter.resultGlobal.size() >= arrayList.size();
                EmojiSearchAdapter.this.resultGlobal.clear();
                EmojiSearchAdapter.this.resultGlobal.addAll(arrayList);
                EmojiSearchAdapter.this.notifyDataSetChanged();
            }

            @Override
            public boolean isLoading() {
                return EmojiView.this.emojiSearchField.isInProgress();
            }

            @Override
            public boolean isCompleted() {
                return EmojiSearchAdapter.this.isCompleted;
            }

            @Override
            public void run() {
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                final String str = EmojiSearchAdapter.this.lastSearchEmojiString;
                final Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$run$8(str);
                    }
                };
                if (Emoji.fullyConsistsOfEmojis(str)) {
                    StickerCategoriesListView.search.fetch(UserConfig.selectedAccount, str, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            EmojiView.EmojiSearchAdapter.AnonymousClass5.lambda$run$9(linkedHashSet, runnable, (TLRPC.TL_emojiList) obj);
                        }
                    });
                } else {
                    runnable.run();
                }
            }

            public void lambda$run$8(final String str) {
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                if (!Arrays.equals(EmojiView.this.lastSearchKeyboardLanguage, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(EmojiView.this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                EmojiView.this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                Utilities.doCallbacks(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$run$2(str, arrayList3, (Runnable) obj);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$run$4(str, (Runnable) obj);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$run$5(str, arrayList2, (Runnable) obj);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$run$6(arrayList, (Runnable) obj);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$run$7(str, arrayList, arrayList2, arrayList3, (Runnable) obj);
                    }
                });
            }

            public void lambda$run$2(String str, final ArrayList arrayList, final Runnable runnable) {
                MediaDataController.getInstance(EmojiView.this.currentAccount).searchStickerSets(true, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$run$1(arrayList, runnable, (ArrayList) obj);
                    }
                });
            }

            public void lambda$run$1(ArrayList arrayList, Runnable runnable, ArrayList arrayList2) {
                ArrayList<TLRPC.Document> arrayList3;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) it.next();
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList3 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList3 = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList3 = stickerSetCovered.covers;
                    }
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        arrayList.add(new EmojiPackInfo(stickerSetCovered, arrayList3));
                    }
                }
                runnable.run();
            }

            public void lambda$run$4(final String str, final Runnable runnable) {
                MediaDataController.getInstance(EmojiView.this.currentAccount).getEmojiSuggestions(EmojiView.this.lastSearchKeyboardLanguage, EmojiSearchAdapter.this.lastSearchEmojiString, false, new MediaDataController.KeywordResultCallback() {
                    @Override
                    public final void run(ArrayList arrayList, String str2) {
                        this.f$0.lambda$run$3(str, runnable, arrayList, str2);
                    }
                }, null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(EmojiView.this.currentAccount).isPremium(), false, true, 25);
            }

            public void lambda$run$3(String str, Runnable runnable, ArrayList arrayList, String str2) {
                if (str.equals(EmojiSearchAdapter.this.lastSearchEmojiString)) {
                    EmojiSearchAdapter.this.lastSearchAlias = str2;
                    EmojiSearchAdapter.this.resultPre.addAll(arrayList);
                    runnable.run();
                }
            }

            public void lambda$run$5(String str, ArrayList arrayList, Runnable runnable) {
                TLRPC.StickerSet stickerSet;
                ArrayList<TLRPC.Document> arrayList2;
                TLRPC.TL_messages_stickerSet stickerSet2;
                TLRPC.StickerSet stickerSet3;
                ArrayList<TLRPC.Document> arrayList3;
                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(EmojiView.this.currentAccount).isPremium()) {
                    String strTranslitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSets(5);
                    HashSet hashSet = new HashSet();
                    if (stickerSets != null) {
                        for (int i = 0; i < stickerSets.size(); i++) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i);
                            if (tL_messages_stickerSet != null && (stickerSet3 = tL_messages_stickerSet.set) != null && stickerSet3.title != null && (arrayList3 = tL_messages_stickerSet.documents) != null && !arrayList3.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                                String strTranslitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet.set.title.toLowerCase());
                                if (strTranslitSafe2.startsWith(strTranslitSafe)) {
                                    arrayList.add(new EmojiPackInfo(tL_messages_stickerSet, tL_messages_stickerSet.documents));
                                    hashSet.add(Long.valueOf(tL_messages_stickerSet.set.id));
                                } else {
                                    if (strTranslitSafe2.contains(" " + strTranslitSafe)) {
                                        arrayList.add(new EmojiPackInfo(tL_messages_stickerSet, tL_messages_stickerSet.documents));
                                        hashSet.add(Long.valueOf(tL_messages_stickerSet.set.id));
                                    }
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(EmojiView.this.currentAccount).getFeaturedEmojiSets();
                    if (featuredEmojiSets != null) {
                        for (int i2 = 0; i2 < featuredEmojiSets.size(); i2++) {
                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i2);
                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                String strTranslitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                if (strTranslitSafe3.startsWith(strTranslitSafe)) {
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                        stickerSet2 = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                        if (stickerSet2 != null) {
                                            arrayList2 = stickerSet2.documents;
                                        } else {
                                            arrayList2 = null;
                                        }
                                    } else {
                                        arrayList2 = stickerSetCovered.covers;
                                    }
                                    if (arrayList2 == null) {
                                    }
                                } else {
                                    if (strTranslitSafe3.contains(" " + strTranslitSafe)) {
                                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                            stickerSet2 = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                            if (stickerSet2 != null) {
                                                arrayList2 = stickerSet2.documents;
                                            } else {
                                                arrayList2 = null;
                                            }
                                        } else {
                                            arrayList2 = stickerSetCovered.covers;
                                        }
                                        if (arrayList2 == null && !arrayList2.isEmpty()) {
                                            arrayList.add(new EmojiPackInfo(stickerSetCovered, arrayList2));
                                            hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                runnable.run();
            }

            public void lambda$run$6(ArrayList arrayList, Runnable runnable) {
                if (ConnectionsManager.getInstance(EmojiView.this.currentAccount).getConnectionState() == 3) {
                    EmojiSearchAdapter.this.searchEmoji(runnable, arrayList, false);
                } else {
                    runnable.run();
                }
            }

            public void lambda$run$7(String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Runnable runnable) {
                if (str.equals(EmojiSearchAdapter.this.lastSearchEmojiString)) {
                    EmojiView.this.emojiSearchField.showProgress(false);
                    EmojiSearchAdapter.this.searchWas = true;
                    if (EmojiView.this.emojiGridView.getAdapter() != EmojiView.this.emojiSearchAdapter) {
                        EmojiView.this.emojiGridView.setAdapter(EmojiView.this.emojiSearchAdapter);
                    }
                    EmojiSearchAdapter.this.result.clear();
                    EmojiSearchAdapter.this.result.addAll(EmojiSearchAdapter.this.resultPre);
                    EmojiSearchAdapter.this.resultGlobal.clear();
                    EmojiSearchAdapter.this.resultGlobal.addAll(arrayList);
                    EmojiSearchAdapter.this.packs.clear();
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        EmojiPackInfo emojiPackInfo = (EmojiPackInfo) it.next();
                        if (longSparseIntArray.indexOfKey(emojiPackInfo.set.id) < 0) {
                            longSparseIntArray.append(emojiPackInfo.set.id, 1);
                            EmojiSearchAdapter.this.packs.add(emojiPackInfo);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        EmojiPackInfo emojiPackInfo2 = (EmojiPackInfo) it2.next();
                        if (longSparseIntArray.indexOfKey(emojiPackInfo2.set.id) < 0) {
                            longSparseIntArray.append(emojiPackInfo2.set.id, 1);
                            EmojiSearchAdapter.this.packs.add(emojiPackInfo2);
                        }
                    }
                    EmojiSearchAdapter.this.notifyDataSetChanged();
                }
            }

            public static void lambda$run$9(LinkedHashSet linkedHashSet, Runnable runnable, TLRPC.TL_emojiList tL_emojiList) {
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                runnable.run();
            }
        }

        public void searchEmoji(final Runnable runnable, final ArrayList arrayList, boolean z) {
            String[] strArr = EmojiView.this.lastSearchKeyboardLanguage;
            String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
            final String str2 = this.lastSearchEmojiString;
            if (str2 == null) {
                return;
            }
            MediaDataController.getInstance(EmojiView.this.currentAccount).searchStickers(true, str, str2, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$searchEmoji$0(str2, arrayList, runnable, (ArrayList) obj);
                }
            }, z);
        }

        public void lambda$searchEmoji$0(String str, ArrayList arrayList, Runnable runnable, ArrayList arrayList2) {
            if (str.equals(this.lastSearchEmojiString)) {
                AnimatedEmojiDrawable.getDocumentFetcher(EmojiView.this.currentAccount).putDocuments(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    TLRPC.Document document = (TLRPC.Document) it.next();
                    MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                    keywordResult.emoji = "animated_" + document.id;
                    keywordResult.keyword = null;
                    arrayList.add(keywordResult);
                }
                runnable.run();
            }
        }

        @Override
        public void notifyDataSetChanged() {
            this.foundPacksListView.adapter.update(false);
            super.notifyDataSetChanged();
        }
    }

    private class EmojiPagesAdapter extends PagerAdapter implements PagerSlidingTabStrip.IconTabProvider {
        @Override
        public void customOnDraw(Canvas canvas, View view, int i) {
        }

        @Override
        public Drawable getPageIconDrawable(int i) {
            return null;
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        private EmojiPagesAdapter() {
        }

        @Override
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override
        public boolean canScrollToTab(int i) {
            if (i == 1 || i == 2) {
                EmojiView emojiView = EmojiView.this;
                if (emojiView.stickersBanned) {
                    emojiView.showStickerBanHint(true, false, i == 1);
                    return false;
                }
            }
            if (i == 0) {
                EmojiView emojiView2 = EmojiView.this;
                if (emojiView2.emojiBanned) {
                    emojiView2.showStickerBanHint(true, true, false);
                    return false;
                }
            }
            return true;
        }

        @Override
        public int getCount() {
            return EmojiView.this.currentTabs.size();
        }

        @Override
        public CharSequence getPageTitle(int i) {
            if (i == 0) {
                return LocaleController.getString(R.string.Emoji);
            }
            if (i == 1) {
                return LocaleController.getString(R.string.AccDescrGIFs);
            }
            if (i != 2) {
                return null;
            }
            return LocaleController.getString(R.string.AccDescrStickers);
        }

        @Override
        public int getTabPadding(int i) {
            return AndroidUtilities.dp(i == 1 ? 12.0f : 18.0f);
        }

        @Override
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View view = ((Tab) EmojiView.this.currentTabs.get(i)).view;
            viewGroup.addView(view);
            return view;
        }
    }

    class GifAdapter extends RecyclerListView.SelectionAdapter {
        private boolean addSearch;
        private TLRPC.User bot;
        private final Context context;
        private int firstResultItem;
        private int itemsCount;
        private String lastSearchImageString;
        private boolean lastSearchIsEmoji;
        private final int maxRecentRowsCount;
        private String nextSearchOffset;
        private final GifProgressEmptyView progressEmptyView;
        private int recentItemsCount;
        private int reqId;
        private ArrayList results;
        private HashMap resultsMap;
        private boolean searchEndReached;
        private Runnable searchRunnable;
        private boolean searchingUser;
        private boolean showTrendingWhenSearchEmpty;
        private int trendingSectionItem;
        private final boolean withRecent;

        public GifAdapter(EmojiView emojiView, Context context) {
            this(context, false, 0);
        }

        public GifAdapter(EmojiView emojiView, Context context, boolean z) {
            this(context, z, z ? Integer.MAX_VALUE : 0);
        }

        public GifAdapter(Context context, boolean z, int i) {
            this.results = new ArrayList();
            this.resultsMap = new HashMap();
            this.trendingSectionItem = -1;
            this.firstResultItem = -1;
            this.context = context;
            this.withRecent = z;
            this.maxRecentRowsCount = i;
            this.progressEmptyView = z ? null : EmojiView.this.new GifProgressEmptyView(context);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public int getItemCount() {
            return this.itemsCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0 && this.addSearch) {
                return 1;
            }
            boolean z = this.withRecent;
            if (z && i == this.trendingSectionItem) {
                return 2;
            }
            return (z || !this.results.isEmpty()) ? 0 : 3;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                ContextLinkCell contextLinkCell = new ContextLinkCell(this.context);
                contextLinkCell.setIsKeyboard(true);
                contextLinkCell.setCanPreviewGif(true);
                view = contextLinkCell;
            } else if (i == 1) {
                View view2 = new View(EmojiView.this.getContext());
                view2.setLayoutParams(new RecyclerView.LayoutParams(-1, EmojiView.this.searchFieldHeight));
                view = view2;
            } else if (i == 2) {
                StickerSetNameCell stickerSetNameCell = new StickerSetNameCell(this.context, false, EmojiView.this.resourcesProvider, EmojiView.this.glassDesign);
                stickerSetNameCell.setText(LocaleController.getString(R.string.FeaturedGifs), 0);
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AndroidUtilities.dp(2.5f);
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AndroidUtilities.dp(5.5f);
                stickerSetNameCell.setLayoutParams(layoutParams);
                view = stickerSetNameCell;
            } else {
                GifProgressEmptyView gifProgressEmptyView = this.progressEmptyView;
                gifProgressEmptyView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                view = gifProgressEmptyView;
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() != 0) {
                return;
            }
            ContextLinkCell contextLinkCell = (ContextLinkCell) viewHolder.itemView;
            int i2 = this.firstResultItem;
            if (i2 < 0 || i < i2) {
                contextLinkCell.setGif((TLRPC.Document) EmojiView.this.recentGifs.get(i - (this.addSearch ? 1 : 0)), false);
            } else {
                contextLinkCell.setLink((TLRPC.BotInlineResult) this.results.get(i - i2), this.bot, true, false, false, true);
            }
        }

        @Override
        public void notifyDataSetChanged() {
            updateRecentItemsCount();
            updateItems();
            super.notifyDataSetChanged();
        }

        private void updateItems() {
            this.trendingSectionItem = -1;
            this.firstResultItem = -1;
            this.itemsCount = 0;
            if (this.addSearch) {
                this.itemsCount = 1;
            }
            if (this.withRecent) {
                this.itemsCount += this.recentItemsCount;
            }
            if (!this.results.isEmpty()) {
                if (this.withRecent && this.recentItemsCount > 0) {
                    int i = this.itemsCount;
                    this.itemsCount = i + 1;
                    this.trendingSectionItem = i;
                }
                int i2 = this.itemsCount;
                this.firstResultItem = i2;
                this.itemsCount = i2 + this.results.size();
                return;
            }
            if (this.withRecent) {
                return;
            }
            this.itemsCount++;
        }

        private void updateRecentItemsCount() {
            int i;
            if (!this.withRecent || (i = this.maxRecentRowsCount) == 0) {
                return;
            }
            if (i == Integer.MAX_VALUE) {
                this.recentItemsCount = EmojiView.this.recentGifs.size();
                return;
            }
            if (EmojiView.this.gifGridView.getMeasuredWidth() == 0) {
                return;
            }
            int measuredWidth = EmojiView.this.gifGridView.getMeasuredWidth();
            int spanCount = EmojiView.this.gifLayoutManager.getSpanCount();
            int iDp = AndroidUtilities.dp(100.0f);
            this.recentItemsCount = 0;
            int size = EmojiView.this.recentGifs.size();
            int i2 = spanCount;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Size sizeFixSize = EmojiView.this.gifLayoutManager.fixSize(EmojiView.this.gifLayoutManager.getSizeForItem((TLRPC.Document) EmojiView.this.recentGifs.get(i5)));
                int iMin = Math.min(spanCount, (int) Math.floor(spanCount * (((sizeFixSize.width / sizeFixSize.height) * iDp) / measuredWidth)));
                if (i2 < iMin) {
                    this.recentItemsCount += i3;
                    i4++;
                    if (i4 == this.maxRecentRowsCount) {
                        break;
                    }
                    i2 = spanCount;
                    i3 = 0;
                }
                i3++;
                i2 -= iMin;
            }
            if (i4 < this.maxRecentRowsCount) {
                this.recentItemsCount += i3;
            }
        }

        public void loadTrendingGifs() {
            search("", "", true, true, true);
        }

        private void searchBotUser() {
            if (this.searchingUser) {
                return;
            }
            this.searchingUser = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = MessagesController.getInstance(EmojiView.this.currentAccount).gifSearchBot;
            ConnectionsManager.getInstance(EmojiView.this.currentAccount).sendRequest(tL_contacts_resolveUsername, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$searchBotUser$1(tLObject, tL_error);
                }
            });
        }

        public void lambda$searchBotUser$1(final TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$searchBotUser$0(tLObject);
                    }
                });
            }
        }

        public void lambda$searchBotUser$0(TLObject tLObject) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(EmojiView.this.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(EmojiView.this.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            MessagesStorage.getInstance(EmojiView.this.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
            String str = this.lastSearchImageString;
            this.lastSearchImageString = null;
            search(str, "", false);
        }

        public void search(String str) {
            search(str, true);
        }

        public void search(final String str, boolean z) {
            if (this.withRecent) {
                return;
            }
            int i = this.reqId;
            if (i != 0) {
                if (i >= 0) {
                    ConnectionsManager.getInstance(EmojiView.this.currentAccount).cancelRequest(this.reqId, true);
                }
                this.reqId = 0;
            }
            this.lastSearchIsEmoji = false;
            GifProgressEmptyView gifProgressEmptyView = this.progressEmptyView;
            if (gifProgressEmptyView != null) {
                gifProgressEmptyView.setLoadingState(false);
            }
            Runnable runnable = this.searchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            if (TextUtils.isEmpty(str)) {
                this.lastSearchImageString = null;
                if (!this.showTrendingWhenSearchEmpty) {
                    int currentPosition = EmojiView.this.gifTabs.getCurrentPosition();
                    if (currentPosition == EmojiView.this.gifRecentTabNum || currentPosition == EmojiView.this.gifTrendingTabNum) {
                        if (EmojiView.this.gifGridView.getAdapter() != EmojiView.this.gifAdapter) {
                            EmojiView.this.gifGridView.setAdapter(EmojiView.this.gifAdapter);
                            return;
                        }
                        return;
                    }
                    searchEmoji(MessagesController.getInstance(EmojiView.this.currentAccount).gifSearchEmojies.get(currentPosition - EmojiView.this.gifFirstEmojiTabNum));
                    return;
                }
                loadTrendingGifs();
                return;
            }
            String lowerCase = str.toLowerCase();
            this.lastSearchImageString = lowerCase;
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$search$2(str);
                }
            };
            this.searchRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, z ? 300L : 0L);
        }

        public void lambda$search$2(String str) {
            search(str, "", true);
        }

        public void searchEmoji(String str) {
            if (this.lastSearchIsEmoji && TextUtils.equals(this.lastSearchImageString, str)) {
                EmojiView.this.gifLayoutManager.scrollToPositionWithOffset(0, 0);
            } else {
                search(str, "", true, true, true);
            }
        }

        protected void search(String str, String str2, boolean z) {
            search(str, str2, z, false, false);
        }

        protected void search(final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
            int i = this.reqId;
            if (i != 0) {
                if (i >= 0) {
                    ConnectionsManager.getInstance(EmojiView.this.currentAccount).cancelRequest(this.reqId, true);
                }
                this.reqId = 0;
            }
            this.lastSearchImageString = str;
            this.lastSearchIsEmoji = z2;
            GifProgressEmptyView gifProgressEmptyView = this.progressEmptyView;
            if (gifProgressEmptyView != null) {
                gifProgressEmptyView.setLoadingState(z2);
            }
            TLObject userOrChat = MessagesController.getInstance(EmojiView.this.currentAccount).getUserOrChat(MessagesController.getInstance(EmojiView.this.currentAccount).gifSearchBot);
            if (!(userOrChat instanceof TLRPC.User)) {
                if (z) {
                    searchBotUser();
                    if (this.withRecent) {
                        return;
                    }
                    EmojiView.this.gifSearchField.showProgress(true);
                    return;
                }
                return;
            }
            if (!this.withRecent && TextUtils.isEmpty(str2)) {
                EmojiView.this.gifSearchField.showProgress(true);
            }
            this.bot = (TLRPC.User) userOrChat;
            final String str3 = "gif_search_" + str + "_" + str2;
            RequestDelegate requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$search$4(str, str2, z, z2, z3, str3, tLObject, tL_error);
                }
            };
            if (!z3 && !this.withRecent && z2 && TextUtils.isEmpty(str2)) {
                this.results.clear();
                this.resultsMap.clear();
                if (EmojiView.this.gifGridView.getAdapter() != this) {
                    EmojiView.this.gifGridView.setAdapter(this);
                }
                notifyDataSetChanged();
                EmojiView.this.scrollGifsToTop();
            }
            if (!z3 || !EmojiView.this.gifCache.containsKey(str3)) {
                if (EmojiView.this.gifSearchPreloader.isLoading(str3)) {
                    return;
                }
                if (z3) {
                    this.reqId = -1;
                    MessagesStorage.getInstance(EmojiView.this.currentAccount).getBotCache(str3, requestDelegate);
                    return;
                }
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                if (str == null) {
                    str = "";
                }
                tL_messages_getInlineBotResults.query = str;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(EmojiView.this.currentAccount).getInputUser(this.bot);
                tL_messages_getInlineBotResults.offset = str2;
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                this.reqId = ConnectionsManager.getInstance(EmojiView.this.currentAccount).sendRequest(tL_messages_getInlineBotResults, requestDelegate);
                return;
            }
            lambda$search$3(str, str2, z, z2, true, str3, (TLObject) EmojiView.this.gifCache.get(str3));
        }

        public void lambda$search$4(final String str, final String str2, final boolean z, final boolean z2, final boolean z3, final String str3, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$search$3(str, str2, z, z2, z3, str3, tLObject);
                }
            });
        }

        public void lambda$search$3(String str, String str2, boolean z, boolean z2, boolean z3, String str3, TLObject tLObject) {
            if (str == null || !str.equals(this.lastSearchImageString)) {
                return;
            }
            this.reqId = 0;
            if (z3 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                search(str, str2, z, z2, false);
                return;
            }
            if (!this.withRecent && TextUtils.isEmpty(str2)) {
                this.results.clear();
                this.resultsMap.clear();
                EmojiView.this.gifSearchField.showProgress(false);
            }
            if (tLObject instanceof TLRPC.messages_BotResults) {
                int size = this.results.size();
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                if (!EmojiView.this.gifCache.containsKey(str3)) {
                    EmojiView.this.gifCache.put(str3, messages_botresults);
                }
                if (!z3 && messages_botresults.cache_time != 0) {
                    MessagesStorage.getInstance(EmojiView.this.currentAccount).saveBotCache(str3, messages_botresults);
                }
                this.nextSearchOffset = messages_botresults.next_offset;
                int i = 0;
                for (int i2 = 0; i2 < messages_botresults.results.size(); i2++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i2);
                    if (!this.resultsMap.containsKey(botInlineResult.id)) {
                        botInlineResult.query_id = messages_botresults.query_id;
                        this.results.add(botInlineResult);
                        this.resultsMap.put(botInlineResult.id, botInlineResult);
                        i++;
                    }
                }
                this.searchEndReached = size == this.results.size() || TextUtils.isEmpty(this.nextSearchOffset);
                if (i != 0) {
                    if (!z2 || size != 0) {
                        updateItems();
                        if (!this.withRecent) {
                            if (size != 0) {
                                notifyItemChanged(size);
                            }
                            notifyItemRangeInserted(size + (EmojiView.this.gifAdapter.addSearch ? 1 : 0), i);
                        } else if (size != 0) {
                            notifyItemChanged(this.recentItemsCount + (EmojiView.this.gifAdapter.addSearch ? 1 : 0) + size);
                            notifyItemRangeInserted(this.recentItemsCount + (EmojiView.this.gifAdapter.addSearch ? 1 : 0) + size + 1, i);
                        } else {
                            notifyItemRangeInserted(this.recentItemsCount + (EmojiView.this.gifAdapter.addSearch ? 1 : 0), i + 1);
                        }
                    } else {
                        notifyDataSetChanged();
                    }
                } else if (this.results.isEmpty()) {
                    notifyDataSetChanged();
                }
            } else {
                notifyDataSetChanged();
            }
            if (this.withRecent) {
                return;
            }
            if (EmojiView.this.gifGridView.getAdapter() != this) {
                EmojiView.this.gifGridView.setAdapter(this);
            }
            if (z2 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                EmojiView.this.scrollGifsToTop();
            }
        }
    }

    class GifSearchPreloader {
        private final List loadingKeys;

        private GifSearchPreloader() {
            this.loadingKeys = new ArrayList();
        }

        public boolean isLoading(String str) {
            return this.loadingKeys.contains(str);
        }

        public void preload(String str) {
            preload(str, "", true);
        }

        private void preload(final String str, final String str2, final boolean z) {
            final String str3 = "gif_search_" + str + "_" + str2;
            if (z && EmojiView.this.gifCache.containsKey(str3)) {
                return;
            }
            RequestDelegate requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$preload$1(str, str2, z, str3, tLObject, tL_error);
                }
            };
            if (z) {
                this.loadingKeys.add(str3);
                MessagesStorage.getInstance(EmojiView.this.currentAccount).getBotCache(str3, requestDelegate);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(EmojiView.this.currentAccount);
            TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                this.loadingKeys.add(str3);
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                if (str == null) {
                    str = "";
                }
                tL_messages_getInlineBotResults.query = str;
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
                tL_messages_getInlineBotResults.offset = str2;
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                ConnectionsManager.getInstance(EmojiView.this.currentAccount).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
            }
        }

        public void lambda$preload$1(final String str, final String str2, final boolean z, final String str3, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$preload$0(str, str2, z, str3, tLObject);
                }
            });
        }

        public void lambda$preload$0(String str, String str2, boolean z, String str3, TLObject tLObject) {
            this.loadingKeys.remove(str3);
            if (EmojiView.this.gifSearchAdapter.lastSearchIsEmoji && EmojiView.this.gifSearchAdapter.lastSearchImageString.equals(str)) {
                EmojiView.this.gifSearchAdapter.lambda$search$3(str, str2, false, true, z, str3, tLObject);
                return;
            }
            if (z && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
                preload(str, str2, false);
            } else {
                if (!(tLObject instanceof TLRPC.messages_BotResults) || EmojiView.this.gifCache.containsKey(str3)) {
                    return;
                }
                EmojiView.this.gifCache.put(str3, (TLRPC.messages_BotResults) tLObject);
            }
        }
    }

    private class GifLayoutManager extends ExtendedGridLayoutManager {
        private Size size;

        public GifLayoutManager(Context context) {
            super(context, 100, true);
            this.size = new Size();
            setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i) {
                    if ((i == 0 && EmojiView.this.gifAdapter.addSearch) || (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifSearchAdapter && EmojiView.this.gifSearchAdapter.results.isEmpty())) {
                        return GifLayoutManager.this.getSpanCount();
                    }
                    GifLayoutManager gifLayoutManager = GifLayoutManager.this;
                    return gifLayoutManager.getSpanSizeForItem(i - (EmojiView.this.gifAdapter.addSearch ? 1 : 0));
                }
            });
        }

        @Override
        protected Size getSizeForItem(int i) {
            ArrayList<TLRPC.DocumentAttribute> arrayList;
            TLRPC.Document document;
            TLRPC.Document document2 = null;
            arrayList = null;
            ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
            if (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifAdapter) {
                if (i > EmojiView.this.gifAdapter.recentItemsCount) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) EmojiView.this.gifAdapter.results.get((i - EmojiView.this.gifAdapter.recentItemsCount) - 1);
                    document = botInlineResult.document;
                    if (document != null) {
                        arrayList2 = document.attributes;
                    } else {
                        TLRPC.WebDocument webDocument = botInlineResult.content;
                        if (webDocument != null) {
                            arrayList2 = webDocument.attributes;
                        } else {
                            TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                            if (webDocument2 != null) {
                                arrayList2 = webDocument2.attributes;
                            }
                        }
                    }
                    arrayList = arrayList2;
                    document2 = document;
                } else {
                    if (i == EmojiView.this.gifAdapter.recentItemsCount) {
                        return null;
                    }
                    document2 = (TLRPC.Document) EmojiView.this.recentGifs.get(i);
                    arrayList = document2.attributes;
                }
            } else if (EmojiView.this.gifSearchAdapter.results.isEmpty()) {
                arrayList = null;
            } else {
                TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) EmojiView.this.gifSearchAdapter.results.get(i);
                document = botInlineResult2.document;
                if (document != null) {
                    arrayList2 = document.attributes;
                } else {
                    TLRPC.WebDocument webDocument3 = botInlineResult2.content;
                    if (webDocument3 != null) {
                        arrayList2 = webDocument3.attributes;
                    } else {
                        TLRPC.WebDocument webDocument4 = botInlineResult2.thumb;
                        if (webDocument4 != null) {
                            arrayList2 = webDocument4.attributes;
                        }
                    }
                }
                arrayList = arrayList2;
                document2 = document;
            }
            return getSizeForItem(document2, arrayList);
        }

        @Override
        protected int getFlowItemCount() {
            if (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifSearchAdapter && EmojiView.this.gifSearchAdapter.results.isEmpty()) {
                return 0;
            }
            return getItemCount() - 1;
        }

        public Size getSizeForItem(TLRPC.Document document) {
            return getSizeForItem(document, document.attributes);
        }

        public Size getSizeForItem(TLRPC.Document document, List list) {
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            int i;
            int i2;
            Size size = this.size;
            size.height = 100.0f;
            size.width = 100.0f;
            if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i = closestPhotoSizeWithSize.w) != 0 && (i2 = closestPhotoSizeWithSize.h) != 0) {
                Size size2 = this.size;
                size2.width = i;
                size2.height = i2;
            }
            if (list != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i3);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        Size size3 = this.size;
                        size3.width = documentAttribute.w;
                        size3.height = documentAttribute.h;
                        break;
                    }
                }
            }
            return this.size;
        }
    }

    private class GifProgressEmptyView extends FrameLayout {
        private final ImageView imageView;
        private boolean loadingState;
        private final RadialProgressView progressView;
        private final TextView textView;

        public GifProgressEmptyView(Context context) {
            super(context);
            ImageView imageView = new ImageView(getContext());
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.gif_empty);
            int i = Theme.key_chat_emojiPanelEmptyText;
            imageView.setColorFilter(new PorterDuffColorFilter(EmojiView.this.getThemedColor(i), PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.textView = textView;
            textView.setText(LocaleController.getString(R.string.NoGIFsFound));
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(EmojiView.this.getThemedColor(i));
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, EmojiView.this.resourcesProvider);
            this.progressView = radialProgressView;
            radialProgressView.setVisibility(8);
            radialProgressView.setProgressColor(EmojiView.this.getThemedColor(Theme.key_progressCircle));
            addView(radialProgressView, LayoutHelper.createFrame(-2, -2, 17));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iDp;
            int measuredHeight = EmojiView.this.gifGridView.getMeasuredHeight();
            if (!this.loadingState) {
                iDp = (int) ((((measuredHeight - EmojiView.this.searchFieldHeight) - AndroidUtilities.dp(8.0f)) / 3) * 1.7f);
            } else {
                iDp = measuredHeight - AndroidUtilities.dp(80.0f);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
        }

        public void setLoadingState(boolean z) {
            if (this.loadingState != z) {
                this.loadingState = z;
                this.imageView.setVisibility(z ? 8 : 0);
                this.textView.setVisibility(z ? 8 : 0);
                this.progressView.setVisibility(z ? 0 : 8);
            }
        }
    }

    class StickersSearchGridAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private int emojiSearchId;
        private FoundEmojiPacksRecyclerView foundPacksListView;
        private boolean isCompleted;
        private int reqId;
        private int reqId2;
        private String searchQuery;
        private long selectedPackId;
        private TLRPC.StickerSet selectedPackStickerSet;
        private ArrayList selectedPackStickers;
        private int totalItems;
        private SparseArray rowStartPack = new SparseArray();
        private SparseArray cache = new SparseArray();
        private SparseArray cacheParent = new SparseArray();
        private SparseIntArray positionToRow = new SparseIntArray();
        private SparseArray positionToEmoji = new SparseArray();
        private ArrayList localPacks = new ArrayList();
        private HashMap localPacksByShortName = new HashMap();
        private HashMap localPacksByName = new HashMap();
        private HashMap emojiStickers = new HashMap();
        private ArrayList emojiArrays = new ArrayList();
        private ArrayList foundEmojiPacks = new ArrayList();
        private ArrayList globalSearchArray = new ArrayList();
        private final SearchRunnable searchRunnable = new AnonymousClass1();
        private int foundPacksRow = -1;

        static int access$21404(StickersSearchGridAdapter stickersSearchGridAdapter) {
            int i = stickersSearchGridAdapter.emojiSearchId + 1;
            stickersSearchGridAdapter.emojiSearchId = i;
            return i;
        }

        class AnonymousClass1 implements SearchRunnable {
            int lastId;
            String query;
            final ArrayList localPacks = new ArrayList();
            final HashMap localPacksByShortName = new HashMap();
            final HashMap localPacksByName = new HashMap();
            final HashMap emojiStickers = new HashMap();
            final ArrayList emojiArrays = new ArrayList();
            final ArrayList foundEmojiPacks = new ArrayList();
            final ArrayList emojiStickersArray = new ArrayList(0);
            final ArrayList emojiStickersArray2 = new ArrayList(0);
            final LongSparseArray emojiStickersMap = new LongSparseArray(0);

            AnonymousClass1() {
            }

            public void searchFinish() {
                if (StickersSearchGridAdapter.this.emojiSearchId != this.lastId) {
                    return;
                }
                this.emojiArrays.remove(this.emojiStickersArray);
                StickersSearchGridAdapter.this.localPacks = this.localPacks;
                StickersSearchGridAdapter.this.localPacksByShortName = this.localPacksByShortName;
                StickersSearchGridAdapter.this.localPacksByName = this.localPacksByName;
                StickersSearchGridAdapter.this.emojiStickers = this.emojiStickers;
                StickersSearchGridAdapter.this.emojiArrays = this.emojiArrays;
                StickersSearchGridAdapter.this.foundEmojiPacks = this.foundEmojiPacks;
                StickersSearchGridAdapter.this.globalSearchArray = new ArrayList(this.emojiStickersArray);
                EmojiView.this.stickersSearchField.showProgress(false);
                if (EmojiView.this.stickersGridView.getAdapter() != EmojiView.this.stickersSearchGridAdapter) {
                    EmojiView.this.stickersGridView.setAdapter(EmojiView.this.stickersSearchGridAdapter);
                }
                StickersSearchGridAdapter.this.notifyDataSetChanged();
            }

            public void addFromAllStickers(Runnable runnable) {
                int i;
                if (this.query.length() <= 14) {
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(EmojiView.this.currentAccount).getAllStickers();
                    CharSequence charSequenceConcat = this.query;
                    int length = charSequenceConcat.length();
                    int i2 = 0;
                    while (i2 < length) {
                        if (i2 < length - 1) {
                            if (charSequenceConcat.charAt(i2) == 55356) {
                                int i3 = i2 + 1;
                                if (charSequenceConcat.charAt(i3) < 57339 || charSequenceConcat.charAt(i3) > 57343) {
                                    if (charSequenceConcat.charAt(i2) == 8205) {
                                        i = i2 + 1;
                                        if (charSequenceConcat.charAt(i) != 9792 || charSequenceConcat.charAt(i) == 9794) {
                                        }
                                        i2--;
                                    }
                                    if (charSequenceConcat.charAt(i2) == 65039) {
                                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 1, charSequenceConcat.length()));
                                        length--;
                                        i2--;
                                    }
                                }
                                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 2, charSequenceConcat.length()));
                                length -= 2;
                                i2--;
                            } else {
                                if (charSequenceConcat.charAt(i2) == 8205) {
                                    i = i2 + 1;
                                    if (charSequenceConcat.charAt(i) != 9792) {
                                    }
                                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 2, charSequenceConcat.length()));
                                    length -= 2;
                                    i2--;
                                }
                                if (charSequenceConcat.charAt(i2) == 65039) {
                                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 1, charSequenceConcat.length()));
                                    length--;
                                    i2--;
                                }
                            }
                        } else if (charSequenceConcat.charAt(i2) == 65039) {
                            charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i2), charSequenceConcat.subSequence(i2 + 1, charSequenceConcat.length()));
                            length--;
                            i2--;
                        }
                        i2++;
                    }
                    ArrayList<TLRPC.Document> arrayList = allStickers != null ? allStickers.get(charSequenceConcat.toString()) : null;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        this.emojiStickersArray2.addAll(arrayList);
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            TLRPC.Document document = arrayList.get(i4);
                            this.emojiStickersMap.put(document.id, document);
                        }
                        this.emojiStickers.put(this.emojiStickersArray2, StickersSearchGridAdapter.this.searchQuery);
                        this.emojiArrays.add(this.emojiStickersArray2);
                    }
                }
                runnable.run();
            }

            public void addFromSuggestions(final Runnable runnable) {
                final HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(EmojiView.this.currentAccount).getAllStickers();
                if (allStickers != null && !allStickers.isEmpty() && this.query.length() > 1) {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    if (!Arrays.equals(EmojiView.this.lastSearchKeyboardLanguage, currentKeyboardLanguage)) {
                        MediaDataController.getInstance(EmojiView.this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    EmojiView.this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                    MediaDataController.getInstance(EmojiView.this.currentAccount).getEmojiSuggestions(EmojiView.this.lastSearchKeyboardLanguage, StickersSearchGridAdapter.this.searchQuery, true, new MediaDataController.KeywordResultCallback() {
                        @Override
                        public final void run(ArrayList arrayList, String str) {
                            this.f$0.lambda$addFromSuggestions$0(allStickers, runnable, arrayList, str);
                        }
                    }, false);
                    return;
                }
                runnable.run();
            }

            public void lambda$addFromSuggestions$0(HashMap map, Runnable runnable, ArrayList arrayList, String str) {
                if (StickersSearchGridAdapter.this.emojiSearchId != this.lastId) {
                    return;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i)).emoji;
                    ArrayList arrayList2 = (ArrayList) map.get(str2);
                    if (arrayList2 != null && !arrayList2.isEmpty() && !this.emojiStickers.containsKey(arrayList2)) {
                        this.emojiStickers.put(arrayList2, str2);
                        this.emojiArrays.add(arrayList2);
                    }
                }
                runnable.run();
            }

            public void addPremiumStickers(Runnable runnable) {
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(EmojiView.this.currentAccount).getAllStickers();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator<ArrayList<TLRPC.Document>> it = allStickers.values().iterator();
                while (it.hasNext()) {
                    for (TLRPC.Document document : it.next()) {
                        if (!hashSet.contains(Long.valueOf(document.id)) && MessageObject.isPremiumSticker(document)) {
                            hashSet.add(Long.valueOf(document.id));
                            arrayList.add(document);
                            this.emojiStickersMap.put(document.id, document);
                        }
                    }
                }
                for (TLRPC.StickerSetCovered stickerSetCovered : MediaDataController.getInstance(EmojiView.this.currentAccount).getFeaturedStickerSets()) {
                    TLRPC.Document document2 = stickerSetCovered.cover;
                    if (document2 != null && !hashSet.contains(Long.valueOf(document2.id)) && MessageObject.isPremiumSticker(stickerSetCovered.cover)) {
                        hashSet.add(Long.valueOf(stickerSetCovered.cover.id));
                        arrayList.add(stickerSetCovered.cover);
                        LongSparseArray longSparseArray = this.emojiStickersMap;
                        TLRPC.Document document3 = stickerSetCovered.cover;
                        longSparseArray.put(document3.id, document3);
                    }
                    ArrayList<TLRPC.Document> arrayList2 = stickerSetCovered.covers;
                    if (arrayList2 != null) {
                        for (TLRPC.Document document4 : arrayList2) {
                            if (!hashSet.contains(Long.valueOf(document4.id)) && MessageObject.isPremiumSticker(document4)) {
                                hashSet.add(Long.valueOf(document4.id));
                                arrayList.add(document4);
                                this.emojiStickersMap.put(document4.id, document4);
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.emojiStickersArray2.addAll(arrayList);
                    this.emojiStickers.put(this.emojiStickersArray2, StickersSearchGridAdapter.this.searchQuery);
                    this.emojiArrays.add(this.emojiStickersArray2);
                }
                runnable.run();
            }

            public void addLocalPacks(Runnable runnable) {
                int iIndexOfIgnoreCase;
                int iIndexOfIgnoreCase2;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSets(0);
                MessagesController.getInstance(EmojiView.this.currentAccount).filterPremiumStickers(stickerSets);
                int size = stickerSets.size();
                for (int i = 0; i < size; i++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i);
                    int iIndexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, StickersSearchGridAdapter.this.searchQuery);
                    if (iIndexOfIgnoreCase3 >= 0) {
                        if (iIndexOfIgnoreCase3 == 0 || tL_messages_stickerSet.set.title.charAt(iIndexOfIgnoreCase3 - 1) == ' ') {
                            this.localPacks.add(tL_messages_stickerSet);
                            this.localPacksByName.put(tL_messages_stickerSet, Integer.valueOf(iIndexOfIgnoreCase3));
                        }
                    } else {
                        String str = tL_messages_stickerSet.set.short_name;
                        if (str != null && (iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str, StickersSearchGridAdapter.this.searchQuery)) >= 0 && (iIndexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(iIndexOfIgnoreCase2 - 1) == ' ')) {
                            this.localPacks.add(tL_messages_stickerSet);
                            this.localPacksByShortName.put(tL_messages_stickerSet, Boolean.TRUE);
                        }
                    }
                }
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSets(3);
                MessagesController.getInstance(EmojiView.this.currentAccount).filterPremiumStickers(stickerSets2);
                int size2 = stickerSets2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets2.get(i2);
                    int iIndexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, StickersSearchGridAdapter.this.searchQuery);
                    if (iIndexOfIgnoreCase4 >= 0) {
                        if (iIndexOfIgnoreCase4 == 0 || tL_messages_stickerSet2.set.title.charAt(iIndexOfIgnoreCase4 - 1) == ' ') {
                            this.localPacks.add(tL_messages_stickerSet2);
                            this.localPacksByName.put(tL_messages_stickerSet2, Integer.valueOf(iIndexOfIgnoreCase4));
                        }
                    } else {
                        String str2 = tL_messages_stickerSet2.set.short_name;
                        if (str2 != null && (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str2, StickersSearchGridAdapter.this.searchQuery)) >= 0 && (iIndexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(iIndexOfIgnoreCase - 1) == ' ')) {
                            this.localPacks.add(tL_messages_stickerSet2);
                            this.localPacksByShortName.put(tL_messages_stickerSet2, Boolean.TRUE);
                        }
                    }
                }
                runnable.run();
            }

            public void searchStickerSetsByName(final Runnable runnable) {
                MediaDataController.getInstance(EmojiView.this.currentAccount).searchStickerSets(false, this.query, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$searchStickerSetsByName$1(runnable, (ArrayList) obj);
                    }
                });
            }

            public void lambda$searchStickerSetsByName$1(Runnable runnable, ArrayList arrayList) {
                ArrayList<TLRPC.Document> arrayList2;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) it.next();
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList2 = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList2 = stickerSetCovered.covers;
                    }
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        this.foundEmojiPacks.add(new EmojiPackInfo(stickerSetCovered, arrayList2));
                    }
                }
                runnable.run();
            }

            public void searchStickerSets(Runnable runnable) {
                searchStickerSets(runnable, false);
            }

            private void searchStickerSets(final Runnable runnable, final boolean z) {
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                MediaDataController.getInstance(EmojiView.this.currentAccount).searchStickers(false, (currentKeyboardLanguage == null || currentKeyboardLanguage.length == 0) ? "" : currentKeyboardLanguage[0], this.query, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$searchStickerSets$2(z, runnable, (ArrayList) obj);
                    }
                }, z);
            }

            public void lambda$searchStickerSets$2(boolean z, Runnable runnable, ArrayList arrayList) {
                if (StickersSearchGridAdapter.this.emojiSearchId != this.lastId) {
                    return;
                }
                if (z) {
                    int size = this.emojiStickersArray.size();
                    this.emojiStickersArray.clear();
                    StickersSearchGridAdapter.this.isCompleted = size == arrayList.size();
                }
                this.emojiStickersArray.addAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TLRPC.Document document = (TLRPC.Document) it.next();
                    this.emojiStickersMap.put(document.id, document);
                }
                this.emojiStickers.put(this.emojiStickersArray, StickersSearchGridAdapter.this.searchQuery);
                runnable.run();
            }

            public void searchStickers(final Runnable runnable) {
                if (Emoji.fullyConsistsOfEmojis(StickersSearchGridAdapter.this.searchQuery)) {
                    final TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = this.query;
                    tL_messages_getStickers.hash = 0L;
                    StickersSearchGridAdapter stickersSearchGridAdapter = StickersSearchGridAdapter.this;
                    stickersSearchGridAdapter.reqId2 = ConnectionsManager.getInstance(EmojiView.this.currentAccount).sendRequest(tL_messages_getStickers, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$searchStickers$4(tL_messages_getStickers, runnable, tLObject, tL_error);
                        }
                    });
                    return;
                }
                runnable.run();
            }

            public void lambda$searchStickers$4(final TLRPC.TL_messages_getStickers tL_messages_getStickers, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$searchStickers$3(tL_messages_getStickers, tLObject, runnable);
                    }
                });
            }

            public void lambda$searchStickers$3(TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, Runnable runnable) {
                if (StickersSearchGridAdapter.this.emojiSearchId != this.lastId) {
                    return;
                }
                StickersSearchGridAdapter.this.reqId2 = 0;
                if (tL_messages_getStickers.emoticon.equals(this.query)) {
                    if (!(tLObject instanceof TLRPC.TL_messages_stickers)) {
                        runnable.run();
                        return;
                    }
                    TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                    int size = this.emojiStickersArray2.size();
                    int size2 = tL_messages_stickers.stickers.size();
                    for (int i = 0; i < size2; i++) {
                        TLRPC.Document document = tL_messages_stickers.stickers.get(i);
                        if (this.emojiStickersMap.indexOfKey(document.id) < 0) {
                            this.emojiStickersArray2.add(document);
                        }
                    }
                    if (size != this.emojiStickersArray2.size()) {
                        this.emojiStickers.put(this.emojiStickersArray2, StickersSearchGridAdapter.this.searchQuery);
                        if (size == 0) {
                            this.emojiArrays.add(this.emojiStickersArray2);
                        }
                    }
                }
                runnable.run();
            }

            @Override
            public void run() {
                if (TextUtils.isEmpty(StickersSearchGridAdapter.this.searchQuery)) {
                    if (EmojiView.this.stickersGridView.getAdapter() != EmojiView.this.stickersGridAdapter) {
                        EmojiView.this.stickersGridView.setAdapter(EmojiView.this.stickersGridAdapter);
                    }
                    StickersSearchGridAdapter.this.notifyDataSetChanged();
                    return;
                }
                this.lastId = StickersSearchGridAdapter.access$21404(StickersSearchGridAdapter.this);
                this.query = StickersSearchGridAdapter.this.searchQuery;
                StickersSearchGridAdapter.this.isCompleted = false;
                this.localPacks.clear();
                this.localPacksByShortName.clear();
                this.localPacksByName.clear();
                this.emojiStickers.clear();
                this.emojiArrays.clear();
                this.emojiStickersArray.clear();
                this.emojiStickersArray2.clear();
                this.emojiStickersMap.clear();
                EmojiView.this.stickersSearchField.showProgress(true);
                if ("premium".equalsIgnoreCase(this.query)) {
                    Utilities.raceCallbacks(new EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda0(this), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.addPremiumStickers((Runnable) obj);
                        }
                    });
                } else {
                    Utilities.raceCallbacks(new EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda0(this), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.searchStickerSets((Runnable) obj);
                        }
                    }, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.searchStickerSetsByName((Runnable) obj);
                        }
                    }, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.addFromAllStickers((Runnable) obj);
                        }
                    }, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.addFromSuggestions((Runnable) obj);
                        }
                    }, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.addLocalPacks((Runnable) obj);
                        }
                    }, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.searchStickers((Runnable) obj);
                        }
                    });
                }
            }

            @Override
            public boolean isLoading() {
                return EmojiView.this.stickersSearchField.isInProgress();
            }

            @Override
            public boolean isCompleted() {
                return StickersSearchGridAdapter.this.isCompleted;
            }

            @Override
            public void loadNext() {
                if (isLoading()) {
                    return;
                }
                EmojiView.this.stickersSearchField.showProgress(true);
                Utilities.raceCallbacks(new EmojiView$StickersSearchGridAdapter$1$$ExternalSyntheticLambda0(this), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$loadNext$5((Runnable) obj);
                    }
                });
            }

            public void lambda$loadNext$5(Runnable runnable) {
                searchStickerSets(runnable, true);
            }
        }

        public StickersSearchGridAdapter(Context context) {
            this.context = context;
            FoundEmojiPacksRecyclerView foundEmojiPacksRecyclerView = new FoundEmojiPacksRecyclerView(context, EmojiView.this.currentAccount, -1, false, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.foundPackListFillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    this.f$0.foundPackListOnClickItem((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, null, EmojiView.this.resourcesProvider, -1, 0) {
            };
            this.foundPacksListView = foundEmojiPacksRecyclerView;
            foundEmojiPacksRecyclerView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
            this.foundPacksListView.setClipToPadding(false);
            this.foundPacksListView.adapter.setApplyBackground(false);
            this.foundPacksListView.setNestedScrollingEnabled(false);
            this.foundPacksListView.setDrawSelection(false);
            this.foundPacksListView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        EmojiView.this.ignorePagerScroll = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        EmojiView.this.ignorePagerScroll = false;
                    }
                    return false;
                }
            });
        }

        public void foundPackListOnClickItem(UItem uItem, View view, int i, float f, float f2) {
            TLRPC.StickerSet stickerSet;
            TLRPC.StickerSet stickerSet2;
            TLRPC.TL_messages_stickerSet stickerSet3;
            Object obj = uItem.object;
            TLRPC.Document document = null;
            if (obj instanceof TLRPC.StickerSetCovered) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj;
                EmojiPackInfo emojiPackInfo = (EmojiPackInfo) uItem.object2;
                long j = this.selectedPackId;
                stickerSet = stickerSetCovered.set;
                long j2 = stickerSet.id;
                if (j == j2) {
                    this.selectedPackId = 0L;
                    stickerSet2 = null;
                } else {
                    this.selectedPackId = j2;
                    this.selectedPackStickers = emojiPackInfo.documents;
                    this.selectedPackStickerSet = stickerSetCovered.set;
                    stickerSet2 = stickerSet;
                }
            } else {
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    long j3 = this.selectedPackId;
                    stickerSet = tL_messages_stickerSet.set;
                    long j4 = stickerSet.id;
                    if (j3 == j4) {
                        this.selectedPackId = 0L;
                    } else {
                        this.selectedPackId = j4;
                        this.selectedPackStickers = tL_messages_stickerSet.documents;
                        this.selectedPackStickerSet = stickerSet;
                        stickerSet2 = stickerSet;
                    }
                }
                stickerSet2 = null;
            }
            int childCount = this.foundPacksListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                FoundStickerPackCell foundStickerPackCell = (FoundStickerPackCell) this.foundPacksListView.getChildAt(i2);
                if (foundStickerPackCell != view) {
                    foundStickerPackCell.setSelected(false, true);
                }
            }
            if (this.selectedPackId != 0 && this.selectedPackStickers.size() < this.selectedPackStickerSet.count && (stickerSet3 = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet(this.selectedPackStickerSet, false)) != null) {
                this.selectedPackStickers = stickerSet3.documents;
            }
            TLObject tLObject = (TLObject) uItem.object;
            EmojiView emojiView = EmojiView.this;
            FoundStickerPackButton foundStickerPackButton = emojiView.stickerAddPackButton;
            ArrayList arrayList = this.selectedPackStickers;
            if (arrayList != null && !arrayList.isEmpty()) {
                document = (TLRPC.Document) this.selectedPackStickers.get(0);
            }
            emojiView.setFoundPackButtonText(foundStickerPackButton, tLObject, stickerSet2, document, false, EmojiView.this.animatorSearchStickerPackSelected.getFloatValue() > 0.0f);
            ((FoundStickerPackCell) view).setSelected(this.selectedPackId != 0, true);
            EmojiView.this.animatorSearchStickerPackSelected.setValue(this.selectedPackId != 0, true);
            notifyDataSetChanged();
            EmojiView.this.stickersSearchField.hideKeyboard();
            if (this.selectedPackId != 0) {
                this.foundPacksListView.scrollOnSelect(view);
            }
        }

        public void resetSelectedPackId() {
            int childCount = this.foundPacksListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ((FoundStickerPackCell) this.foundPacksListView.getChildAt(i)).setSelected(false, true);
            }
            this.selectedPackId = 0L;
            EmojiView.this.animatorSearchStickerPackSelected.setValue(false, true);
            notifyDataSetChanged();
        }

        public void foundPackListFillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
            Iterator it = this.localPacks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) it.next();
                if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                    longSparseIntArray.append(tL_messages_stickerSet.set.id, 1);
                    arrayList.add(FoundStickerPackFactory.of(tL_messages_stickerSet, tL_messages_stickerSet.set.id == this.selectedPackId));
                }
            }
            for (EmojiPackInfo emojiPackInfo : this.foundEmojiPacks) {
                if (longSparseIntArray.indexOfKey(emojiPackInfo.set.id) < 0) {
                    longSparseIntArray.append(emojiPackInfo.set.id, 1);
                    arrayList.add(FoundStickerPackFactory.of(emojiPackInfo.stickerSetCovered, emojiPackInfo, emojiPackInfo.set.id == this.selectedPackId));
                }
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 7;
        }

        @Override
        public int getItemCount() {
            int i = this.totalItems;
            if (i != 1) {
                return i + 1;
            }
            return 2;
        }

        public void search(String str, boolean z) {
            if (this.reqId != 0) {
                ConnectionsManager.getInstance(EmojiView.this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = 0;
            }
            if (this.reqId2 != 0) {
                ConnectionsManager.getInstance(EmojiView.this.currentAccount).cancelRequest(this.reqId2, true);
                this.reqId2 = 0;
            }
            if (TextUtils.isEmpty(str)) {
                this.searchQuery = null;
                this.localPacks.clear();
                this.emojiStickers.clear();
                this.globalSearchArray = new ArrayList();
                if (EmojiView.this.stickersGridView.getAdapter() != EmojiView.this.stickersGridAdapter) {
                    EmojiView.this.stickersGridView.setAdapter(EmojiView.this.stickersGridAdapter);
                }
                this.selectedPackId = 0L;
                EmojiView.this.animatorSearchStickerPackSelected.setValue(false, true);
                notifyDataSetChanged();
                EmojiView.this.stickersSearchField.showProgress(false);
            } else {
                this.searchQuery = str.toLowerCase();
                EmojiView.this.stickersSearchField.showProgress(true);
            }
            AndroidUtilities.cancelRunOnUIThread(this.searchRunnable);
            AndroidUtilities.runOnUIThread(this.searchRunnable, 300L);
        }

        @Override
        public int getItemViewType(int i) {
            if (this.selectedPackId != 0 && i == getItemCount() - 1) {
                return 8;
            }
            if (i == this.foundPacksRow) {
                return 7;
            }
            if (i == 0) {
                return 4;
            }
            if (i == 1 && this.totalItems == 1) {
                return 5;
            }
            Object obj = this.cache.get(i);
            if (obj == null) {
                return 1;
            }
            if (obj instanceof TLRPC.Document) {
                return 0;
            }
            return obj instanceof TLRPC.StickerSetCovered ? 3 : 2;
        }

        public void lambda$onCreateViewHolder$0(View view) {
            FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) view.getParent();
            TLRPC.StickerSetCovered stickerSet = featuredStickerSetInfoCell.getStickerSet();
            if (EmojiView.this.installingStickerSets.indexOfKey(stickerSet.set.id) >= 0 || EmojiView.this.removingStickerSets.indexOfKey(stickerSet.set.id) >= 0) {
                return;
            }
            if (featuredStickerSetInfoCell.isInstalled()) {
                EmojiView.this.removingStickerSets.put(stickerSet.set.id, stickerSet);
                EmojiView.this.delegate.onStickerSetRemove(featuredStickerSetInfoCell.getStickerSet());
            } else {
                featuredStickerSetInfoCell.setAddDrawProgress(true, true);
                EmojiView.this.installingStickerSets.put(stickerSet.set.id, stickerSet);
                EmojiView.this.delegate.onStickerSetAdd(featuredStickerSetInfoCell.getStickerSet());
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout frameLayout;
            View emptyCell;
            boolean z = true;
            switch (i) {
                case 0:
                    frameLayout = new StickerEmojiCell(this.context, z, EmojiView.this.resourcesProvider) {
                        @Override
                        public void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                        }
                    };
                    emptyCell = frameLayout;
                    break;
                case 1:
                    emptyCell = new EmptyCell(this.context);
                    break;
                case 2:
                    emptyCell = new StickerSetNameCell(this.context, false, EmojiView.this.resourcesProvider, EmojiView.this.glassDesign);
                    break;
                case 3:
                    FeaturedStickerSetInfoCell featuredStickerSetInfoCell = new FeaturedStickerSetInfoCell(this.context, 17, false, true, EmojiView.this.resourcesProvider);
                    featuredStickerSetInfoCell.setAddOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$onCreateViewHolder$0(view);
                        }
                    });
                    emptyCell = featuredStickerSetInfoCell;
                    break;
                case 4:
                    View view = new View(this.context);
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, EmojiView.this.searchFieldHeight));
                    emptyCell = view;
                    break;
                case 5:
                    frameLayout = new FrameLayout(this.context) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec((int) ((((EmojiView.this.stickersGridView.getMeasuredHeight() - EmojiView.this.searchFieldHeight) - AndroidUtilities.dp(8.0f)) / 3) * 1.7f), 1073741824));
                        }
                    };
                    ImageView imageView = new ImageView(this.context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(R.drawable.stickers_empty);
                    EmojiView emojiView = EmojiView.this;
                    int i2 = Theme.key_chat_emojiPanelEmptyText;
                    imageView.setColorFilter(new PorterDuffColorFilter(emojiView.getThemedColor(i2), PorterDuff.Mode.MULTIPLY));
                    imageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                    frameLayout.addView(imageView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 28.0f));
                    TextView textView = new TextView(this.context);
                    textView.setText(LocaleController.getString(R.string.NoStickersFound));
                    textView.setTextSize(1, 16.0f);
                    textView.setTextColor(EmojiView.this.getThemedColor(i2));
                    frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 9.0f));
                    frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    emptyCell = frameLayout;
                    break;
                case 6:
                default:
                    emptyCell = null;
                    break;
                case 7:
                    FoundEmojiPacksRecyclerView foundEmojiPacksRecyclerView = this.foundPacksListView;
                    foundEmojiPacksRecyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(79.0f)));
                    emptyCell = foundEmojiPacksRecyclerView;
                    break;
                case 8:
                    View view2 = new View(EmojiView.this.getContext());
                    view2.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(68.0f)));
                    emptyCell = view2;
                    break;
            }
            return new RecyclerListView.Holder(emptyCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            boolean z = true;
            z = true;
            if (itemViewType == 0) {
                TLRPC.Document document = (TLRPC.Document) this.cache.get(i);
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) viewHolder.itemView;
                stickerEmojiCell.setSticker(document, null, this.cacheParent.get(i), (String) this.positionToEmoji.get(i), false);
                if (!EmojiView.this.recentStickers.contains(document) && !EmojiView.this.favouriteStickers.contains(document)) {
                    z = false;
                }
                stickerEmojiCell.setRecent(z);
                return;
            }
            Integer numValueOf = null;
            if (itemViewType == 1) {
                EmptyCell emptyCell = (EmptyCell) viewHolder.itemView;
                if (i == this.totalItems) {
                    int i2 = this.positionToRow.get(i - 1, Integer.MIN_VALUE);
                    if (i2 == Integer.MIN_VALUE) {
                        emptyCell.setHeight(1);
                        return;
                    }
                    Object obj = this.rowStartPack.get(i2);
                    if (obj instanceof TLRPC.TL_messages_stickerSet) {
                        numValueOf = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj).documents.size());
                    } else if (obj instanceof Integer) {
                        numValueOf = (Integer) obj;
                    }
                    if (numValueOf == null) {
                        emptyCell.setHeight(1);
                        return;
                    } else if (numValueOf.intValue() != 0) {
                        int height = EmojiView.this.pager.getHeight() - (((int) Math.ceil(numValueOf.intValue() / EmojiView.this.stickersGridAdapter.stickersPerRow)) * AndroidUtilities.dp(82.0f));
                        emptyCell.setHeight(height > 0 ? height : 1);
                        return;
                    } else {
                        emptyCell.setHeight(AndroidUtilities.dp(8.0f));
                        return;
                    }
                }
                emptyCell.setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            if (itemViewType == 2) {
                StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
                Object obj2 = this.cache.get(i);
                if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
                    if (!TextUtils.isEmpty(this.searchQuery) && this.localPacksByShortName.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            stickerSetNameCell.setText(stickerSet.title, 0);
                        }
                        stickerSetNameCell.setUrl(tL_messages_stickerSet.set.short_name, this.searchQuery.length());
                        return;
                    }
                    Integer num = (Integer) this.localPacksByName.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num != null) {
                        stickerSetNameCell.setText(stickerSet2.title, 0, num.intValue(), !TextUtils.isEmpty(this.searchQuery) ? this.searchQuery.length() : 0);
                    }
                    stickerSetNameCell.setUrl(null, 0);
                    return;
                }
                if (obj2 instanceof String) {
                    stickerSetNameCell.setText((String) obj2, 0);
                    stickerSetNameCell.setUrl(null, 0);
                    return;
                }
                return;
            }
            if (itemViewType != 3) {
                return;
            }
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.cache.get(i);
            FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) viewHolder.itemView;
            boolean z2 = EmojiView.this.installingStickerSets.indexOfKey(stickerSetCovered.set.id) >= 0;
            char c = EmojiView.this.removingStickerSets.indexOfKey(stickerSetCovered.set.id) < 0 ? (char) 0 : (char) 1;
            if (z2 || c != 0) {
                if (z2 && featuredStickerSetInfoCell.isInstalled()) {
                    EmojiView.this.installingStickerSets.remove(stickerSetCovered.set.id);
                    z2 = false;
                } else if (c != 0 && !featuredStickerSetInfoCell.isInstalled()) {
                    EmojiView.this.removingStickerSets.remove(stickerSetCovered.set.id);
                }
            }
            featuredStickerSetInfoCell.setAddDrawProgress(z2, false);
            int iIndexOfIgnoreCase = TextUtils.isEmpty(this.searchQuery) ? -1 : AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.title, this.searchQuery);
            if (iIndexOfIgnoreCase >= 0) {
                featuredStickerSetInfoCell.setStickerSet(stickerSetCovered, false, false, iIndexOfIgnoreCase, this.searchQuery.length());
                return;
            }
            featuredStickerSetInfoCell.setStickerSet(stickerSetCovered, false);
            if (TextUtils.isEmpty(this.searchQuery) || AndroidUtilities.indexOfIgnoreCase(stickerSetCovered.set.short_name, this.searchQuery) != 0) {
                return;
            }
            featuredStickerSetInfoCell.setUrl(stickerSetCovered.set.short_name, this.searchQuery.length());
        }

        @Override
        public void notifyDataSetChanged() {
            rebuild();
            super.notifyDataSetChanged();
        }

        private void rebuild() {
            int i;
            int i2;
            this.foundPacksRow = -1;
            this.rowStartPack.clear();
            this.positionToRow.clear();
            this.cache.clear();
            this.positionToEmoji.clear();
            this.totalItems = 0;
            int size = this.localPacks.size() + this.localPacksByName.size();
            this.foundPacksListView.adapter.update(false);
            String str = "";
            if (this.selectedPackId != 0) {
                ArrayList arrayList = this.selectedPackStickers;
                SparseArray sparseArray = this.cache;
                int i3 = this.totalItems;
                this.totalItems = i3 + 1;
                sparseArray.put(i3, "search");
                if (size > 0) {
                    SparseArray sparseArray2 = this.cache;
                    int i4 = this.totalItems;
                    this.totalItems = i4 + 1;
                    this.foundPacksRow = i4;
                    sparseArray2.put(i4, "packs");
                    SparseArray sparseArray3 = this.cache;
                    int i5 = this.totalItems;
                    this.totalItems = i5 + 1;
                    sparseArray3.put(i5, LocaleController.formatPluralString("Stickers", this.selectedPackStickerSet.count, new Object[0]));
                    i2 = 3;
                } else {
                    i2 = 1;
                }
                String str2 = (String) this.emojiStickers.get(arrayList);
                if (str2 != null && !"".equals(str2)) {
                    this.positionToEmoji.put(this.totalItems, str2);
                }
                int size2 = arrayList.size();
                int i6 = 0;
                for (int i7 = 0; i7 < size2; i7++) {
                    int i8 = this.totalItems + i6;
                    int i9 = (i6 / EmojiView.this.stickersGridAdapter.stickersPerRow) + i2;
                    TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
                    this.cache.put(i8, document);
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSetById(MediaDataController.getStickerSetId(document));
                    if (stickerSetById != null) {
                        this.cacheParent.put(i8, stickerSetById);
                    }
                    this.positionToRow.put(i8, i9);
                    i6++;
                }
                int iCeil = (int) Math.ceil(i6 / EmojiView.this.stickersGridAdapter.stickersPerRow);
                for (int i10 = 0; i10 < iCeil; i10++) {
                    this.rowStartPack.put(i2 + i10, Integer.valueOf(i6));
                }
                this.totalItems += iCeil * EmojiView.this.stickersGridAdapter.stickersPerRow;
                return;
            }
            boolean zIsEmpty = this.emojiArrays.isEmpty();
            ArrayList arrayList2 = this.globalSearchArray;
            boolean z = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            SparseArray sparseArray4 = this.cache;
            int i11 = this.totalItems;
            this.totalItems = i11 + 1;
            sparseArray4.put(i11, "search");
            if (size > 0) {
                SparseArray sparseArray5 = this.cache;
                int i12 = this.totalItems;
                this.totalItems = i12 + 1;
                this.foundPacksRow = i12;
                sparseArray5.put(i12, "packs");
                i = 2;
            } else {
                i = 1;
            }
            if (!zIsEmpty) {
                SparseArray sparseArray6 = this.cache;
                int i13 = this.totalItems;
                this.totalItems = i13 + 1;
                sparseArray6.put(i13, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                int i14 = i + 1;
                int size3 = this.emojiArrays.size();
                int i15 = 0;
                for (int i16 = 0; i16 < size3; i16++) {
                    ArrayList arrayList3 = (ArrayList) this.emojiArrays.get(i16);
                    String str3 = (String) this.emojiStickers.get(arrayList3);
                    if (str3 != null && !str.equals(str3)) {
                        this.positionToEmoji.put(this.totalItems + i15, str3);
                        str = str3;
                    }
                    int size4 = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size4) {
                        int i18 = this.totalItems + i15;
                        int i19 = (i15 / EmojiView.this.stickersGridAdapter.stickersPerRow) + i14;
                        TLRPC.Document document2 = (TLRPC.Document) arrayList3.get(i17);
                        this.cache.put(i18, document2);
                        int i20 = size3;
                        String str4 = str;
                        TLRPC.TL_messages_stickerSet stickerSetById2 = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSetById(MediaDataController.getStickerSetId(document2));
                        if (stickerSetById2 != null) {
                            this.cacheParent.put(i18, stickerSetById2);
                        }
                        this.positionToRow.put(i18, i19);
                        i15++;
                        i17++;
                        size3 = i20;
                        str = str4;
                    }
                }
                int iCeil2 = (int) Math.ceil(i15 / EmojiView.this.stickersGridAdapter.stickersPerRow);
                for (int i21 = 0; i21 < iCeil2; i21++) {
                    this.rowStartPack.put(i14 + i21, Integer.valueOf(i15));
                }
                this.totalItems += EmojiView.this.stickersGridAdapter.stickersPerRow * iCeil2;
                i = i14 + iCeil2;
            }
            if (z) {
                SparseArray sparseArray7 = this.cache;
                int i22 = this.totalItems;
                this.totalItems = i22 + 1;
                sparseArray7.put(i22, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                int i23 = i + 1;
                String str5 = (String) this.emojiStickers.get(this.globalSearchArray);
                if (str5 != null) {
                    this.positionToEmoji.put(this.totalItems, str5);
                }
                int size5 = this.globalSearchArray.size();
                int i24 = 0;
                for (int i25 = 0; i25 < size5; i25++) {
                    int i26 = this.totalItems + i24;
                    int i27 = (i24 / EmojiView.this.stickersGridAdapter.stickersPerRow) + i23;
                    TLRPC.Document document3 = (TLRPC.Document) this.globalSearchArray.get(i25);
                    this.cache.put(i26, document3);
                    TLRPC.TL_messages_stickerSet stickerSetById3 = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSetById(MediaDataController.getStickerSetId(document3));
                    if (stickerSetById3 != null) {
                        this.cacheParent.put(i26, stickerSetById3);
                    }
                    this.positionToRow.put(i26, i27);
                    i24++;
                }
                int iCeil3 = (int) Math.ceil(i24 / EmojiView.this.stickersGridAdapter.stickersPerRow);
                for (int i28 = 0; i28 < iCeil3; i28++) {
                    this.rowStartPack.put(i23 + i28, Integer.valueOf(i24));
                }
                this.totalItems += iCeil3 * EmojiView.this.stickersGridAdapter.stickersPerRow;
            }
            if (zIsEmpty && !z && size == 0) {
                this.totalItems = 1;
            }
        }
    }

    public void searchProgressChanged() {
        updateStickerTabsPosition();
    }

    public float getStickersExpandOffset() {
        ScrollSlidingTabStrip scrollSlidingTabStrip = this.stickersTab;
        if (scrollSlidingTabStrip == null) {
            return 0.0f;
        }
        return scrollSlidingTabStrip.getExpandedOffset();
    }

    public void setShowing(boolean z) {
        this.showing = z;
        updateStickerTabsPosition();
    }

    public void onMessageSend() {
        ChooseStickerActionTracker chooseStickerActionTracker = this.chooseStickerActionTracker;
        if (chooseStickerActionTracker != null) {
            chooseStickerActionTracker.reset();
        }
    }

    public static abstract class ChooseStickerActionTracker {
        private final int currentAccount;
        private final long dialogId;
        private final long threadId;
        boolean typingWasSent;
        boolean visible = false;
        long lastActionTime = -1;

        public abstract boolean isShown();

        public ChooseStickerActionTracker(int i, long j, long j2) {
            this.currentAccount = i;
            this.dialogId = j;
            this.threadId = j2;
        }

        public void doSomeAction() {
            if (this.visible) {
                if (this.lastActionTime == -1) {
                    this.lastActionTime = System.currentTimeMillis();
                } else if (System.currentTimeMillis() - this.lastActionTime > 2000) {
                    this.typingWasSent = true;
                    this.lastActionTime = System.currentTimeMillis();
                    MessagesController.getInstance(this.currentAccount).sendTyping(this.dialogId, this.threadId, 10, 0);
                }
            }
        }

        public void reset() {
            if (this.typingWasSent) {
                MessagesController.getInstance(this.currentAccount).sendTyping(this.dialogId, this.threadId, 2, 0);
            }
            this.lastActionTime = -1L;
        }

        public void checkVisibility() {
            boolean zIsShown = isShown();
            this.visible = zIsShown;
            if (zIsShown) {
                return;
            }
            reset();
        }
    }

    private class Tab {
        int type;
        View view;

        private Tab() {
        }
    }

    public void freeze(boolean z) {
        StickersGridAdapter stickersGridAdapter;
        boolean z2 = this.frozen;
        this.frozen = z;
        if (!z2 || z) {
            return;
        }
        int i = this.currentPage;
        if (i == 0) {
            EmojiGridAdapter emojiGridAdapter = this.emojiAdapter;
            if (emojiGridAdapter != null) {
                emojiGridAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i == 1) {
            GifAdapter gifAdapter = this.gifAdapter;
            if (gifAdapter != null) {
                gifAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i != 2 || (stickersGridAdapter = this.stickersGridAdapter) == null) {
            return;
        }
        stickersGridAdapter.notifyDataSetChanged();
    }

    public int getGlassIconColor(float f) {
        return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), (int) (f * 255.0f));
    }

    private static class FoundStickerPackFactory extends UItem.UItemFactory {
        private FoundStickerPackFactory() {
        }

        static {
            UItem.UItemFactory.setup(new FoundStickerPackFactory());
        }

        @Override
        public FoundStickerPackCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            FoundStickerPackCell foundStickerPackCell = new FoundStickerPackCell(context, resourcesProvider);
            foundStickerPackCell.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(64.0f), -1));
            return foundStickerPackCell;
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            FoundStickerPackCell foundStickerPackCell = (FoundStickerPackCell) view;
            Object obj = uItem.object;
            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                foundStickerPackCell.setPack((TLRPC.TL_messages_stickerSet) obj);
            } else if (obj instanceof TLRPC.StickerSetCovered) {
                foundStickerPackCell.setPack((TLRPC.StickerSetCovered) obj, ((EmojiPackInfo) uItem.object2).firstDocument);
            }
            foundStickerPackCell.setSelected(uItem.checked, false);
        }

        public static UItem of(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
            UItem uItemOfFactory = UItem.ofFactory(FoundStickerPackFactory.class);
            uItemOfFactory.id = SessionDetails$$ExternalSyntheticBackport0.m(tL_messages_stickerSet.set.id);
            uItemOfFactory.longValue = tL_messages_stickerSet.set.id;
            uItemOfFactory.object = tL_messages_stickerSet;
            uItemOfFactory.checked = z;
            return uItemOfFactory;
        }

        public static UItem of(TLRPC.StickerSetCovered stickerSetCovered, EmojiPackInfo emojiPackInfo, boolean z) {
            UItem uItemOfFactory = UItem.ofFactory(FoundStickerPackFactory.class);
            uItemOfFactory.id = SessionDetails$$ExternalSyntheticBackport0.m(stickerSetCovered.set.id + 1);
            uItemOfFactory.longValue = stickerSetCovered.set.id;
            uItemOfFactory.object = stickerSetCovered;
            uItemOfFactory.object2 = emojiPackInfo;
            uItemOfFactory.checked = z;
            return uItemOfFactory;
        }

        @Override
        public boolean equals(UItem uItem, UItem uItem2) {
            return uItem.longValue == uItem2.longValue;
        }

        @Override
        public boolean contentsEquals(UItem uItem, UItem uItem2) {
            return uItem.longValue == uItem2.longValue && uItem.checked == uItem2.checked;
        }
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            checkStickersSearchFieldScroll(false);
            checkStickersSearchFieldVisibility();
            updateBottomTabContainerPosition();
            this.stickersContainer.invalidate();
            return;
        }
        if (i == 1) {
            checkEmojiSearchFieldScroll(false);
            checkEmojiSearchFieldVisibility();
            updateBottomTabContainerPosition();
            this.emojiContainer.invalidate();
        }
    }

    public void setFoundPackButtonText(final FoundStickerPackButton foundStickerPackButton, final TLObject tLObject, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final boolean z, boolean z2) {
        String pluralString;
        StickersSearchGridAdapter stickersSearchGridAdapter;
        EmojiSearchAdapter emojiSearchAdapter;
        if (stickerSet == null) {
            return;
        }
        if (!z || (emojiSearchAdapter = this.emojiSearchAdapter) == null || emojiSearchAdapter.selectedPackId == stickerSet.id) {
            if (z || (stickersSearchGridAdapter = this.stickersSearchGridAdapter) == null || stickersSearchGridAdapter.selectedPackId == stickerSet.id) {
                final boolean zIsStickerPackInstalled = MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(stickerSet.id);
                if (zIsStickerPackInstalled) {
                    if (stickerSet.masks) {
                        pluralString = LocaleController.formatPluralString("RemoveManyMasksCount", stickerSet.count, new Object[0]);
                    } else if (stickerSet.emojis) {
                        pluralString = LocaleController.formatPluralString("RemoveManyEmojiCount", stickerSet.count, new Object[0]);
                    } else {
                        pluralString = LocaleController.formatPluralString("RemoveManyStickersCount", stickerSet.count, new Object[0]);
                    }
                } else if (stickerSet.masks) {
                    pluralString = LocaleController.formatPluralString("AddManyMasksCount", stickerSet.count, new Object[0]);
                } else if (stickerSet.emojis) {
                    pluralString = LocaleController.formatPluralString("AddManyEmojiCount", stickerSet.count, new Object[0]);
                } else {
                    pluralString = LocaleController.formatPluralString("AddManyStickersCount", stickerSet.count, new Object[0]);
                }
                foundStickerPackButton.setText(pluralString, z2);
                foundStickerPackButton.setIsPrimary(!zIsStickerPackInstalled, z2);
                foundStickerPackButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$setFoundPackButtonText$30(tLObject, document, zIsStickerPackInstalled, foundStickerPackButton, stickerSet, z, view);
                    }
                });
            }
        }
    }

    public void lambda$setFoundPackButtonText$30(final TLObject tLObject, final TLRPC.Document document, boolean z, final FoundStickerPackButton foundStickerPackButton, final TLRPC.StickerSet stickerSet, final boolean z2, View view) {
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), tLObject, document, z ? 0 : 2, this.fragment, this.bulletinContainer2, false, true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setFoundPackButtonText$29(foundStickerPackButton, tLObject, stickerSet, document, z2);
            }
        }, false);
        setFoundPackButtonText(foundStickerPackButton, tLObject, stickerSet, document, z2, true);
    }

    public void lambda$setFoundPackButtonText$29(FoundStickerPackButton foundStickerPackButton, TLObject tLObject, TLRPC.StickerSet stickerSet, TLRPC.Document document, boolean z) {
        setFoundPackButtonText(foundStickerPackButton, tLObject, stickerSet, document, z, true);
    }
}
