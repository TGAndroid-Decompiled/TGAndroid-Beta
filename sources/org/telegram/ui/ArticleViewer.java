package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.MetricAffectingSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.core.view.WindowInsetsCompat$$ExternalSyntheticApiModelOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$GeoPoint;
import org.telegram.tgnet.TLRPC$InputInvoice;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$Page;
import org.telegram.tgnet.TLRPC$PageBlock;
import org.telegram.tgnet.TLRPC$PageListItem;
import org.telegram.tgnet.TLRPC$PageListOrderedItem;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$RichText;
import org.telegram.tgnet.TLRPC$TL_channels_joinChannel;
import org.telegram.tgnet.TLRPC$TL_contacts_resolveUsername;
import org.telegram.tgnet.TLRPC$TL_contacts_resolvedPeer;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageActionChatAddUser;
import org.telegram.tgnet.TLRPC$TL_messageEntityUrl;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_messages_getWebPage;
import org.telegram.tgnet.TLRPC$TL_messages_messages;
import org.telegram.tgnet.TLRPC$TL_messages_webPage;
import org.telegram.tgnet.TLRPC$TL_page;
import org.telegram.tgnet.TLRPC$TL_pageBlockAnchor;
import org.telegram.tgnet.TLRPC$TL_pageBlockAudio;
import org.telegram.tgnet.TLRPC$TL_pageBlockAuthorDate;
import org.telegram.tgnet.TLRPC$TL_pageBlockBlockquote;
import org.telegram.tgnet.TLRPC$TL_pageBlockChannel;
import org.telegram.tgnet.TLRPC$TL_pageBlockCollage;
import org.telegram.tgnet.TLRPC$TL_pageBlockCover;
import org.telegram.tgnet.TLRPC$TL_pageBlockDetails;
import org.telegram.tgnet.TLRPC$TL_pageBlockDivider;
import org.telegram.tgnet.TLRPC$TL_pageBlockEmbed;
import org.telegram.tgnet.TLRPC$TL_pageBlockEmbedPost;
import org.telegram.tgnet.TLRPC$TL_pageBlockFooter;
import org.telegram.tgnet.TLRPC$TL_pageBlockHeader;
import org.telegram.tgnet.TLRPC$TL_pageBlockKicker;
import org.telegram.tgnet.TLRPC$TL_pageBlockList;
import org.telegram.tgnet.TLRPC$TL_pageBlockMap;
import org.telegram.tgnet.TLRPC$TL_pageBlockOrderedList;
import org.telegram.tgnet.TLRPC$TL_pageBlockParagraph;
import org.telegram.tgnet.TLRPC$TL_pageBlockPhoto;
import org.telegram.tgnet.TLRPC$TL_pageBlockPreformatted;
import org.telegram.tgnet.TLRPC$TL_pageBlockPullquote;
import org.telegram.tgnet.TLRPC$TL_pageBlockRelatedArticles;
import org.telegram.tgnet.TLRPC$TL_pageBlockSlideshow;
import org.telegram.tgnet.TLRPC$TL_pageBlockSubheader;
import org.telegram.tgnet.TLRPC$TL_pageBlockSubtitle;
import org.telegram.tgnet.TLRPC$TL_pageBlockTable;
import org.telegram.tgnet.TLRPC$TL_pageBlockTitle;
import org.telegram.tgnet.TLRPC$TL_pageBlockUnsupported;
import org.telegram.tgnet.TLRPC$TL_pageBlockVideo;
import org.telegram.tgnet.TLRPC$TL_pageListItemBlocks;
import org.telegram.tgnet.TLRPC$TL_pageListItemText;
import org.telegram.tgnet.TLRPC$TL_pageListOrderedItemBlocks;
import org.telegram.tgnet.TLRPC$TL_pageListOrderedItemText;
import org.telegram.tgnet.TLRPC$TL_pagePart_layer82;
import org.telegram.tgnet.TLRPC$TL_pageRelatedArticle;
import org.telegram.tgnet.TLRPC$TL_pageTableCell;
import org.telegram.tgnet.TLRPC$TL_pageTableRow;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_photo;
import org.telegram.tgnet.TLRPC$TL_textAnchor;
import org.telegram.tgnet.TLRPC$TL_textBold;
import org.telegram.tgnet.TLRPC$TL_textConcat;
import org.telegram.tgnet.TLRPC$TL_textEmail;
import org.telegram.tgnet.TLRPC$TL_textEmpty;
import org.telegram.tgnet.TLRPC$TL_textFixed;
import org.telegram.tgnet.TLRPC$TL_textImage;
import org.telegram.tgnet.TLRPC$TL_textItalic;
import org.telegram.tgnet.TLRPC$TL_textMarked;
import org.telegram.tgnet.TLRPC$TL_textPhone;
import org.telegram.tgnet.TLRPC$TL_textPlain;
import org.telegram.tgnet.TLRPC$TL_textStrike;
import org.telegram.tgnet.TLRPC$TL_textSubscript;
import org.telegram.tgnet.TLRPC$TL_textSuperscript;
import org.telegram.tgnet.TLRPC$TL_textUnderline;
import org.telegram.tgnet.TLRPC$TL_textUrl;
import org.telegram.tgnet.TLRPC$TL_updateNewChannelMessage;
import org.telegram.tgnet.TLRPC$TL_user;
import org.telegram.tgnet.TLRPC$TL_webPage;
import org.telegram.tgnet.TLRPC$TL_webPageNotModified;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.BottomSheetTabDialog;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.BottomSheetTabsOverlay;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnchorSpan;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBar;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SmoothScroller;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.TableLayout;
import org.telegram.ui.Components.TextPaintImageReceiverSpan;
import org.telegram.ui.Components.TextPaintMarkSpan;
import org.telegram.ui.Components.TextPaintSpan;
import org.telegram.ui.Components.TextPaintUrlSpan;
import org.telegram.ui.Components.TextPaintWebpageUrlSpan;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.WebPlayerView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.BookmarksFragment;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.RestrictedDomainsList;
import org.telegram.ui.web.SearchEngine;
import org.telegram.ui.web.WebActionBar;
import org.telegram.ui.web.WebBrowserSettings;

public class ArticleViewer implements NotificationCenter.NotificationCenterDelegate {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ArticleViewer Instance;
    private static TextPaint channelNamePaint;
    private static TextPaint channelNamePhotoPaint;
    private static Paint dividerPaint;
    private static Paint dotsPaint;
    private static TextPaint embedPostAuthorPaint;
    private static TextPaint embedPostDatePaint;
    private static TextPaint errorTextPaint;
    private static TextPaint listTextNumPaint;
    private static TextPaint listTextPointerPaint;
    private static Paint photoBackgroundPaint;
    private static Paint preformattedBackgroundPaint;
    private static Paint quoteLinePaint;
    private static TextPaint relatedArticleHeaderPaint;
    private static TextPaint relatedArticleTextPaint;
    private static Paint tableHalfLinePaint;
    private static Paint tableHeaderPaint;
    private static Paint tableLinePaint;
    private static Paint tableStripPaint;
    private static Paint urlPaint;
    private static Paint webpageMarkPaint;
    private static Paint webpageSearchPaint;
    private static Paint webpageUrlPaint;
    private final String BOTTOM_SHEET_VIEW_TAG;
    private WebActionBar actionBar;
    private AddressBarList addressBarList;
    private int anchorsOffsetMeasuredWidth;
    private Runnable animationEndRunnable;
    private int animationInProgress;
    private boolean attachedToWindow;
    private Paint backgroundPaint;
    private FrameLayout bulletinContainer;
    private Drawable chat_redLocationIcon;
    private boolean checkingForLongPress;
    private boolean closeAnimationInProgress;
    private boolean collapsed;
    private FrameLayout containerView;
    private ArrayList<BlockEmbedCell> createdWebViews;
    private int currentAccount;
    private int currentHeaderHeight;
    BlockVideoCell currentPlayer;
    private WebPlayerView currentPlayingVideo;
    private int currentSearchIndex;
    private View customView;
    private WebChromeClient.CustomViewCallback customViewCallback;
    private TextView deleteView;
    private boolean drawBlockSelection;
    private FontCell[] fontCells;
    private AspectRatioFrameLayout fullscreenAspectRatioView;
    private TextureView fullscreenTextureView;
    private FrameLayout fullscreenVideoContainer;
    private WebPlayerView fullscreenedVideo;
    private boolean hasCutout;
    private Paint headerPaint;
    private Paint headerProgressPaint;
    private DecelerateInterpolator interpolator;
    public final boolean isSheet;
    private boolean isVisible;
    private boolean keyboardVisible;
    private int lastBlockNum;
    private Object lastInsets;
    private int lastReqId;
    private int lastSearchIndex;
    private Drawable layerShadowDrawable;
    private Runnable lineProgressTickRunnable;
    private BottomSheet linkSheet;
    private LinkSpanDrawable.LinkCollector links;
    private TLRPC$Chat loadedChannel;
    private boolean loadingChannel;
    private TextPaintUrlSpan loadingLink;
    private LoadingDrawable loadingLinkDrawable;
    private View loadingLinkView;
    private Browser.Progress loadingProgress;
    private DrawingText loadingText;
    private Paint navigationBarPaint;
    private final AnimationNotificationsLocker notificationsLocker;
    private int openUrlReqId;
    private final AnimatedColor page0Background;
    private final AnimatedColor page1Background;
    private AnimatorSet pageSwitchAnimation;
    public PageLayout[] pages;
    public final ArrayList<Object> pagesStack;
    private Activity parentActivity;
    private BaseFragment parentFragment;
    private CheckForLongPress pendingCheckForLongPress;
    private CheckForTap pendingCheckForTap;
    PinchToZoomHelper pinchToZoomHelper;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    private Rect popupRect;
    private ActionBarPopupWindow popupWindow;
    private int pressCount;
    private int pressedLayoutY;
    private LinkSpanDrawable<TextPaintUrlSpan> pressedLink;
    private DrawingText pressedLinkOwnerLayout;
    private View pressedLinkOwnerView;
    private int previewsReqId;
    private ContextProgressView progressView;
    private AnimatorSet progressViewAnimation;
    private AnimatorSet runAfterKeyboardClose;
    private Paint scrimPaint;
    private AnimatedTextView searchCountText;
    private ImageView searchDownButton;
    private FrameLayout searchPanel;
    private float searchPanelAlpha;
    private ValueAnimator searchPanelAnimator;
    private float searchPanelTranslation;
    private ArrayList<SearchResult> searchResults;
    private Runnable searchRunnable;
    private String searchText;
    private ImageView searchUpButton;
    private int selectedFont;
    public final Sheet sheet;
    private boolean showRestrictedToastOnResume;
    private Drawable slideDotBigDrawable;
    private Drawable slideDotDrawable;
    private Paint statusBarPaint;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelperBottomSheet;
    private long transitionAnimationStartTime;
    private LinkPath urlPath;
    VideoPlayerHolderBase videoPlayer;
    private LongSparseArray<BlockVideoCellState> videoStates;
    private Dialog visibleDialog;
    private WindowManager.LayoutParams windowLayoutParams;
    private WindowView windowView;
    public static final Property<WindowView, Float> ARTICLE_VIEWER_INNER_TRANSLATION_X = new AnimationProperties.FloatProperty<WindowView>("innerTranslationX") {
        @Override
        public void setValue(WindowView windowView, float f) {
            windowView.setInnerTranslationX(f);
        }

        @Override
        public Float get(WindowView windowView) {
            return Float.valueOf(windowView.getInnerTranslationX());
        }
    };
    private static final TextPaint audioTimePaint = new TextPaint(1);
    private static final SparseArray<TextPaint> photoCaptionTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> photoCreditTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> titleTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> kickerTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> headerTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> subtitleTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> subheaderTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> authorTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> footerTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> paragraphTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> listTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> preformattedTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> quoteTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> embedPostTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> embedPostCaptionTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> mediaCaptionTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> mediaCreditTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> relatedArticleTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> detailsTextPaints = new SparseArray<>();
    private static final SparseArray<TextPaint> tableTextPaints = new SparseArray<>();

    public static boolean lambda$setParentActivity$41(View view, MotionEvent motionEvent) {
        return true;
    }

    public Theme.ResourcesProvider getResourcesProvider() {
        return null;
    }

    static int access$12508(ArticleViewer articleViewer) {
        int i = articleViewer.lastBlockNum;
        articleViewer.lastBlockNum = i + 1;
        return i;
    }

    static int access$2004(ArticleViewer articleViewer) {
        int i = articleViewer.pressCount + 1;
        articleViewer.pressCount = i;
        return i;
    }

    public ArticleViewer() {
        this.createdWebViews = new ArrayList<>();
        this.lastBlockNum = 1;
        this.interpolator = new DecelerateInterpolator(1.5f);
        this.pagesStack = new ArrayList<>();
        this.headerPaint = new Paint();
        this.statusBarPaint = new Paint();
        this.navigationBarPaint = new Paint();
        this.headerProgressPaint = new Paint();
        this.checkingForLongPress = false;
        this.pendingCheckForLongPress = null;
        this.pressCount = 0;
        this.pendingCheckForTap = null;
        this.links = new LinkSpanDrawable.LinkCollector();
        this.urlPath = new LinkPath();
        this.notificationsLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.BOTTOM_SHEET_VIEW_TAG = "bottomSheet";
        this.selectedFont = 0;
        this.fontCells = new FontCell[2];
        this.searchResults = new ArrayList<>();
        this.lastSearchIndex = -1;
        this.videoStates = new LongSparseArray<>();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$new$65();
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.page0Background = new AnimatedColor(runnable, 320L, cubicBezierInterpolator);
        this.page1Background = new AnimatedColor(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$new$66();
            }
        }, 320L, cubicBezierInterpolator);
        this.isSheet = false;
        this.sheet = null;
    }

    public ArticleViewer(BaseFragment baseFragment) {
        this.createdWebViews = new ArrayList<>();
        this.lastBlockNum = 1;
        this.interpolator = new DecelerateInterpolator(1.5f);
        this.pagesStack = new ArrayList<>();
        this.headerPaint = new Paint();
        this.statusBarPaint = new Paint();
        this.navigationBarPaint = new Paint();
        this.headerProgressPaint = new Paint();
        this.checkingForLongPress = false;
        this.pendingCheckForLongPress = null;
        this.pressCount = 0;
        this.pendingCheckForTap = null;
        this.links = new LinkSpanDrawable.LinkCollector();
        this.urlPath = new LinkPath();
        this.notificationsLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.BOTTOM_SHEET_VIEW_TAG = "bottomSheet";
        this.selectedFont = 0;
        this.fontCells = new FontCell[2];
        this.searchResults = new ArrayList<>();
        this.lastSearchIndex = -1;
        this.videoStates = new LongSparseArray<>();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$new$65();
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.page0Background = new AnimatedColor(runnable, 320L, cubicBezierInterpolator);
        this.page1Background = new AnimatedColor(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$new$66();
            }
        }, 320L, cubicBezierInterpolator);
        this.isSheet = true;
        this.sheet = new Sheet(baseFragment);
        setParentActivity(baseFragment.getParentActivity(), baseFragment);
    }

    public boolean isLastArticle() {
        if (this.pagesStack.isEmpty()) {
            return false;
        }
        return this.pagesStack.get(r0.size() - 1) instanceof TLRPC$WebPage;
    }

    public static ArticleViewer getInstance() {
        ArticleViewer articleViewer = Instance;
        if (articleViewer == null) {
            synchronized (ArticleViewer.class) {
                try {
                    articleViewer = Instance;
                    if (articleViewer == null) {
                        articleViewer = new ArticleViewer();
                        Instance = articleViewer;
                    }
                } finally {
                }
            }
        }
        return articleViewer;
    }

    public static ArticleViewer makeSheet(BaseFragment baseFragment) {
        return new ArticleViewer(baseFragment);
    }

    public static boolean hasInstance() {
        return Instance != null;
    }

    public static class TL_pageBlockRelatedArticlesChild extends TLRPC$PageBlock {
        private int num;
        private TLRPC$TL_pageBlockRelatedArticles parent;

        private TL_pageBlockRelatedArticlesChild() {
        }
    }

    public static class TL_pageBlockRelatedArticlesShadow extends TLRPC$PageBlock {
        private TLRPC$TL_pageBlockRelatedArticles parent;

        private TL_pageBlockRelatedArticlesShadow() {
        }
    }

    public static class TL_pageBlockDetailsChild extends TLRPC$PageBlock {
        private TLRPC$PageBlock block;
        private TLRPC$PageBlock parent;

        private TL_pageBlockDetailsChild() {
        }
    }

    public static class TL_pageBlockListParent extends TLRPC$PageBlock {
        private ArrayList<TL_pageBlockListItem> items;
        private int lastFontSize;
        private int lastMaxNumCalcWidth;
        private int level;
        private int maxNumWidth;
        private TLRPC$TL_pageBlockList pageBlockList;

        private TL_pageBlockListParent() {
            this.items = new ArrayList<>();
        }
    }

    public static class TL_pageBlockListItem extends TLRPC$PageBlock {
        private TLRPC$PageBlock blockItem;
        private int index;
        private String num;
        private DrawingText numLayout;
        private TL_pageBlockListParent parent;
        private TLRPC$RichText textItem;

        private TL_pageBlockListItem() {
            this.index = Integer.MAX_VALUE;
        }
    }

    public static class TL_pageBlockOrderedListParent extends TLRPC$PageBlock {
        private ArrayList<TL_pageBlockOrderedListItem> items;
        private int lastFontSize;
        private int lastMaxNumCalcWidth;
        private int level;
        private int maxNumWidth;
        private TLRPC$TL_pageBlockOrderedList pageBlockOrderedList;

        private TL_pageBlockOrderedListParent() {
            this.items = new ArrayList<>();
        }
    }

    public static class TL_pageBlockOrderedListItem extends TLRPC$PageBlock {
        private TLRPC$PageBlock blockItem;
        private int index;
        private String num;
        private DrawingText numLayout;
        private TL_pageBlockOrderedListParent parent;
        private TLRPC$RichText textItem;

        private TL_pageBlockOrderedListItem() {
            this.index = Integer.MAX_VALUE;
        }
    }

    public static class TL_pageBlockEmbedPostCaption extends TLRPC$TL_pageBlockEmbedPost {
        private TLRPC$TL_pageBlockEmbedPost parent;

        private TL_pageBlockEmbedPostCaption() {
        }
    }

    public class DrawingText implements TextSelectionHelper.TextLayoutBlock {
        private boolean isDrawing;
        private View latestParentView;
        public LinkPath markPath;
        public TLRPC$PageBlock parentBlock;
        public Object parentText;
        public CharSequence prefix;
        public int row;
        public int searchIndex = -1;
        public LinkPath searchPath;
        public StaticLayout textLayout;
        public LinkPath textPath;
        public int x;
        public int y;

        public DrawingText() {
        }

        public void draw(Canvas canvas, View view) {
            float width;
            this.isDrawing = true;
            this.latestParentView = view;
            float f = 0.0f;
            if (!ArticleViewer.this.searchResults.isEmpty()) {
                SearchResult searchResult = (SearchResult) ArticleViewer.this.searchResults.get(ArticleViewer.this.currentSearchIndex);
                if (searchResult.block != this.parentBlock || (searchResult.text != this.parentText && (!(searchResult.text instanceof String) || this.parentText != null))) {
                    this.searchIndex = -1;
                    this.searchPath = null;
                } else if (this.searchIndex != searchResult.index) {
                    LinkPath linkPath = new LinkPath(true);
                    this.searchPath = linkPath;
                    linkPath.setAllowReset(false);
                    this.searchPath.setCurrentLayout(this.textLayout, searchResult.index, 0.0f);
                    this.searchPath.setBaselineShift(0);
                    this.textLayout.getSelectionPath(searchResult.index, searchResult.index + ArticleViewer.this.searchText.length(), this.searchPath);
                    this.searchPath.setAllowReset(true);
                }
            } else {
                this.searchIndex = -1;
                this.searchPath = null;
            }
            LinkPath linkPath2 = this.searchPath;
            if (linkPath2 != null) {
                canvas.drawPath(linkPath2, ArticleViewer.webpageSearchPaint);
            }
            LinkPath linkPath3 = this.textPath;
            if (linkPath3 != null) {
                canvas.drawPath(linkPath3, ArticleViewer.webpageUrlPaint);
            }
            LinkPath linkPath4 = this.markPath;
            if (linkPath4 != null) {
                canvas.drawPath(linkPath4, ArticleViewer.webpageMarkPaint);
            }
            if (ArticleViewer.this.links.draw(canvas, this)) {
                view.invalidate();
            }
            if (ArticleViewer.this.pressedLinkOwnerLayout == this && ArticleViewer.this.pressedLink == null && ArticleViewer.this.drawBlockSelection) {
                if (getLineCount() == 1) {
                    width = getLineWidth(0);
                    f = getLineLeft(0);
                } else {
                    width = getWidth();
                }
                canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f, 0.0f, f + width + AndroidUtilities.dp(2.0f), getHeight(), ArticleViewer.urlPaint);
            }
            this.textLayout.draw(canvas);
            this.isDrawing = false;
        }

        public void invalidateParent() {
            View view;
            if (this.isDrawing || (view = this.latestParentView) == null) {
                return;
            }
            view.invalidate();
        }

        public CharSequence getText() {
            return this.textLayout.getText();
        }

        public int getLineCount() {
            return this.textLayout.getLineCount();
        }

        public int getLineAscent(int i) {
            return this.textLayout.getLineAscent(i);
        }

        public float getLineLeft(int i) {
            return this.textLayout.getLineLeft(i);
        }

        public float getLineWidth(int i) {
            return this.textLayout.getLineWidth(i);
        }

        public int getHeight() {
            return this.textLayout.getHeight();
        }

        public int getWidth() {
            return this.textLayout.getWidth();
        }

        @Override
        public StaticLayout getLayout() {
            return this.textLayout;
        }

        @Override
        public int getX() {
            return this.x;
        }

        @Override
        public int getY() {
            return this.y;
        }

        @Override
        public int getRow() {
            return this.row;
        }

        @Override
        public CharSequence getPrefix() {
            return this.prefix;
        }
    }

    public class TextSizeCell extends FrameLayout {
        private int endFontSize;
        private int lastWidth;
        private SeekBarView sizeBar;
        private int startFontSize;
        private TextPaint textPaint;

        public TextSizeCell(Context context) {
            super(context);
            this.startFontSize = 12;
            this.endFontSize = 30;
            setWillNotDraw(false);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SeekBarView seekBarView = new SeekBarView(context, ArticleViewer.this.getResourcesProvider());
            this.sizeBar = seekBarView;
            seekBarView.setReportChanges(true);
            this.sizeBar.setSeparatorsCount((this.endFontSize - this.startFontSize) + 1);
            this.sizeBar.setDelegate(new SeekBarView.SeekBarViewDelegate() {
                @Override
                public void onSeekBarPressed(boolean z) {
                }

                @Override
                public void onSeekBarDrag(boolean z, float f) {
                    int round = Math.round(TextSizeCell.this.startFontSize + ((TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize) * f));
                    if (round != SharedConfig.ivFontSize) {
                        SharedConfig.ivFontSize = round;
                        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                        edit.putInt("iv_font_size", SharedConfig.ivFontSize);
                        edit.commit();
                        ArticleViewer.this.pages[0].getAdapter().searchTextOffset.clear();
                        ArticleViewer.this.updatePaintSize();
                        TextSizeCell.this.invalidate();
                    }
                }

                @Override
                public CharSequence getContentDescription() {
                    return String.valueOf(Math.round(TextSizeCell.this.startFontSize + ((TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize) * TextSizeCell.this.sizeBar.getProgress())));
                }

                @Override
                public int getStepsCount() {
                    return TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize;
                }
            });
            addView(this.sizeBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            this.textPaint.setColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhiteValueText));
            canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), this.textPaint);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int size = View.MeasureSpec.getSize(i);
            if (this.lastWidth != size) {
                SeekBarView seekBarView = this.sizeBar;
                int i3 = SharedConfig.ivFontSize;
                int i4 = this.startFontSize;
                seekBarView.setProgress((i3 - i4) / (this.endFontSize - i4));
                this.lastWidth = size;
            }
        }

        @Override
        public void invalidate() {
            super.invalidate();
            this.sizeBar.invalidate();
        }
    }

    public class FontCell extends FrameLayout {
        private RadioButton radioButton;
        private TextView textView;

        public FontCell(Context context) {
            super(context);
            setBackgroundDrawable(Theme.createSelectorDrawable(ArticleViewer.this.getThemedColor(Theme.key_listSelector), 2));
            RadioButton radioButton = new RadioButton(context);
            this.radioButton = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            this.radioButton.setColor(ArticleViewer.this.getThemedColor(Theme.key_dialogRadioBackground), ArticleViewer.this.getThemedColor(Theme.key_dialogRadioBackgroundChecked));
            RadioButton radioButton2 = this.radioButton;
            boolean z = LocaleController.isRTL;
            addView(radioButton2, LayoutHelper.createFrame(22, 22.0f, (z ? 5 : 3) | 48, z ? 0 : 22, 13.0f, z ? 22 : 0, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextView textView2 = this.textView;
            boolean z2 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 17 : 62, 0.0f, z2 ? 62 : 17, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public void select(boolean z, boolean z2) {
            this.radioButton.setChecked(z, z2);
        }

        public void setTextAndTypeface(String str, Typeface typeface) {
            this.textView.setText(str);
            this.textView.setTypeface(typeface);
            setContentDescription(str);
            invalidate();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setChecked(this.radioButton.isChecked());
            accessibilityNodeInfo.setCheckable(true);
        }
    }

    public final class CheckForTap implements Runnable {
        private CheckForTap() {
        }

        @Override
        public void run() {
            if (ArticleViewer.this.pendingCheckForLongPress == null) {
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.pendingCheckForLongPress = new CheckForLongPress();
            }
            ArticleViewer.this.pendingCheckForLongPress.currentPressCount = ArticleViewer.access$2004(ArticleViewer.this);
            if (ArticleViewer.this.windowView != null) {
                ArticleViewer.this.windowView.postDelayed(ArticleViewer.this.pendingCheckForLongPress, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
            }
        }
    }

    public class WindowView extends FrameLayout {
        private float alpha;
        private int bHeight;
        private int bWidth;
        private int bX;
        private int bY;
        private final Paint blackPaint;
        private float innerTranslationX;
        private boolean lastWebviewAllowedScroll;
        private boolean maybeStartTracking;
        private boolean movingPage;
        private boolean openingPage;
        private boolean selfLayout;
        private int startMovingHeaderHeight;
        private boolean startedTracking;
        private int startedTrackingPointerId;
        private int startedTrackingX;
        private int startedTrackingY;
        private VelocityTracker tracker;

        public WindowView(Context context) {
            super(context);
            this.blackPaint = new Paint();
        }

        @Override
        @android.annotation.TargetApi(21)
        public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r4) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.WindowView.dispatchApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int systemWindowInsetBottom;
            int systemWindowInsetRight;
            int systemWindowInsetLeft;
            int systemWindowInsetRight2;
            int systemWindowInsetLeft2;
            int stableInsetBottom;
            int systemWindowInsetLeft3;
            int systemWindowInsetTop;
            int systemWindowInsetRight3;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (Build.VERSION.SDK_INT >= 21 && ArticleViewer.this.lastInsets != null) {
                setMeasuredDimension(size, size2);
                WindowInsets m = WindowInsetsCompat$$ExternalSyntheticApiModelOutline0.m(ArticleViewer.this.lastInsets);
                if (AndroidUtilities.incorrectDisplaySizeFix) {
                    int i3 = AndroidUtilities.displaySize.y;
                    if (size2 > i3) {
                        size2 = i3;
                    }
                    size2 += AndroidUtilities.statusBarHeight;
                }
                systemWindowInsetBottom = m.getSystemWindowInsetBottom();
                int i4 = size2 - systemWindowInsetBottom;
                systemWindowInsetRight = m.getSystemWindowInsetRight();
                systemWindowInsetLeft = m.getSystemWindowInsetLeft();
                size -= systemWindowInsetRight + systemWindowInsetLeft;
                systemWindowInsetRight2 = m.getSystemWindowInsetRight();
                if (systemWindowInsetRight2 != 0) {
                    systemWindowInsetRight3 = m.getSystemWindowInsetRight();
                    this.bWidth = systemWindowInsetRight3;
                    this.bHeight = i4;
                } else {
                    systemWindowInsetLeft2 = m.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft2 != 0) {
                        systemWindowInsetLeft3 = m.getSystemWindowInsetLeft();
                        this.bWidth = systemWindowInsetLeft3;
                        this.bHeight = i4;
                    } else {
                        this.bWidth = size;
                        stableInsetBottom = m.getStableInsetBottom();
                        this.bHeight = stableInsetBottom;
                    }
                }
                systemWindowInsetTop = m.getSystemWindowInsetTop();
                size2 = i4 - systemWindowInsetTop;
            } else {
                setMeasuredDimension(size, size2);
            }
            ArticleViewer articleViewer = ArticleViewer.this;
            if (articleViewer.sheet == null) {
                articleViewer.keyboardVisible = size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f);
            }
            ArticleViewer.this.containerView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            ArticleViewer.this.fullscreenVideoContainer.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            PageLayout pageLayout;
            ArrayList<Object> arrayList;
            if (ArticleViewer.this.pinchToZoomHelper.isInOverlayMode()) {
                motionEvent.offsetLocation(-ArticleViewer.this.containerView.getX(), -ArticleViewer.this.containerView.getY());
                return ArticleViewer.this.pinchToZoomHelper.onTouchEvent(motionEvent);
            }
            TextSelectionHelper<Cell>.TextSelectionOverlay overlayView = ArticleViewer.this.textSelectionHelper.getOverlayView(getContext());
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.offsetLocation(-ArticleViewer.this.containerView.getX(), -ArticleViewer.this.containerView.getY());
            if (ArticleViewer.this.textSelectionHelper.isInSelectionMode() && ArticleViewer.this.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(obtain)) {
                return true;
            }
            if (overlayView.checkOnTap(motionEvent)) {
                PageLayout[] pageLayoutArr = ArticleViewer.this.pages;
                if (pageLayoutArr != null && (pageLayout = pageLayoutArr[0]) != null && pageLayout.isWeb() && (arrayList = ArticleViewer.this.pagesStack) != null && arrayList.size() <= 1) {
                    motionEvent.setAction(1);
                } else {
                    motionEvent.setAction(3);
                }
            }
            if (motionEvent.getAction() == 0 && ArticleViewer.this.textSelectionHelper.isInSelectionMode() && (motionEvent.getY() < ArticleViewer.this.containerView.getTop() || motionEvent.getY() > ArticleViewer.this.containerView.getBottom())) {
                if (ArticleViewer.this.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(obtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int systemWindowInsetLeft;
            int systemWindowInsetRight;
            int systemWindowInsetLeft2;
            int systemWindowInsetTop;
            ArticleViewer articleViewer;
            if (this.selfLayout) {
                return;
            }
            int i6 = i3 - i;
            int i7 = 0;
            if (ArticleViewer.this.anchorsOffsetMeasuredWidth != i6) {
                int i8 = 0;
                while (true) {
                    articleViewer = ArticleViewer.this;
                    PageLayout[] pageLayoutArr = articleViewer.pages;
                    if (i8 >= pageLayoutArr.length) {
                        break;
                    }
                    Iterator it = pageLayoutArr[i8].adapter.anchorsOffset.entrySet().iterator();
                    while (it.hasNext()) {
                        ((Map.Entry) it.next()).setValue(-1);
                    }
                    i8++;
                }
                articleViewer.anchorsOffsetMeasuredWidth = i6;
            }
            if (Build.VERSION.SDK_INT < 21 || ArticleViewer.this.lastInsets == null) {
                i5 = 0;
            } else {
                WindowInsets m = WindowInsetsCompat$$ExternalSyntheticApiModelOutline0.m(ArticleViewer.this.lastInsets);
                systemWindowInsetLeft = m.getSystemWindowInsetLeft();
                systemWindowInsetRight = m.getSystemWindowInsetRight();
                if (systemWindowInsetRight != 0) {
                    this.bX = i6 - this.bWidth;
                    this.bY = 0;
                } else {
                    systemWindowInsetLeft2 = m.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft2 != 0) {
                        this.bX = 0;
                        this.bY = 0;
                    } else {
                        this.bX = 0;
                        this.bY = (i4 - i2) - this.bHeight;
                    }
                }
                systemWindowInsetTop = m.getSystemWindowInsetTop();
                i5 = systemWindowInsetTop;
                i7 = systemWindowInsetLeft;
            }
            ArticleViewer.this.containerView.layout(i7, i5, ArticleViewer.this.containerView.getMeasuredWidth() + i7, ArticleViewer.this.containerView.getMeasuredHeight() + i5);
            ArticleViewer.this.fullscreenVideoContainer.layout(i7, i5, ArticleViewer.this.fullscreenVideoContainer.getMeasuredWidth() + i7, ArticleViewer.this.fullscreenVideoContainer.getMeasuredHeight() + i5);
            if (ArticleViewer.this.runAfterKeyboardClose != null) {
                ArticleViewer.this.runAfterKeyboardClose.start();
                ArticleViewer.this.runAfterKeyboardClose = null;
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            ArticleViewer.this.attachedToWindow = true;
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ArticleViewer.this.attachedToWindow = false;
            VideoPlayerHolderBase videoPlayerHolderBase = ArticleViewer.this.videoPlayer;
            if (videoPlayerHolderBase != null) {
                videoPlayerHolderBase.release(null);
                ArticleViewer.this.videoPlayer = null;
            }
            ArticleViewer.this.currentPlayer = null;
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            handleTouchEvent(null);
            super.requestDisallowInterceptTouchEvent(z);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return !ArticleViewer.this.collapsed && (handleTouchEvent(motionEvent) || super.onInterceptTouchEvent(motionEvent));
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return !ArticleViewer.this.collapsed && (handleTouchEvent(motionEvent) || super.onTouchEvent(motionEvent));
        }

        @Keep
        public void setInnerTranslationX(float f) {
            this.innerTranslationX = f;
            if (ArticleViewer.this.parentActivity instanceof LaunchActivity) {
                ((LaunchActivity) ArticleViewer.this.parentActivity).drawerLayoutContainer.setAllowDrawContent((ArticleViewer.this.isVisible && this.alpha == 1.0f && this.innerTranslationX == 0.0f) ? false : true);
            }
            invalidate();
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            int measuredWidth = getMeasuredWidth();
            int i = (int) this.innerTranslationX;
            int save = canvas.save();
            canvas.clipRect(i, 0, measuredWidth, getHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restoreToCount(save);
            if (i != 0 && view == ArticleViewer.this.containerView) {
                float f = measuredWidth - i;
                float min = Math.min(0.8f, f / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                ArticleViewer.this.scrimPaint.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i, getHeight(), ArticleViewer.this.scrimPaint);
                float max = Math.max(0.0f, Math.min(f / AndroidUtilities.dp(20.0f), 1.0f));
                ArticleViewer.this.layerShadowDrawable.setBounds(i - ArticleViewer.this.layerShadowDrawable.getIntrinsicWidth(), view.getTop(), i, view.getBottom());
                ArticleViewer.this.layerShadowDrawable.setAlpha((int) (max * 255.0f));
                ArticleViewer.this.layerShadowDrawable.draw(canvas);
            }
            return drawChild;
        }

        @Keep
        public float getInnerTranslationX() {
            return this.innerTranslationX;
        }

        private void prepareForMoving(MotionEvent motionEvent) {
            this.maybeStartTracking = false;
            this.startedTracking = true;
            this.startedTrackingX = (int) motionEvent.getX();
            if (ArticleViewer.this.pagesStack.size() > 1 && (ArticleViewer.this.actionBar == null || (!ArticleViewer.this.actionBar.isSearching() && !ArticleViewer.this.actionBar.isAddressing()))) {
                this.movingPage = true;
                this.startMovingHeaderHeight = ArticleViewer.this.currentHeaderHeight;
                ArticleViewer.this.pages[1].setVisibility(0);
                ArticleViewer.this.pages[1].setAlpha(1.0f);
                ArticleViewer.this.pages[1].setTranslationX(0.0f);
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.pages[0].setBackgroundColor(articleViewer.sheet == null ? 0 : articleViewer.backgroundPaint.getColor());
                ArticleViewer articleViewer2 = ArticleViewer.this;
                articleViewer2.updateInterfaceForCurrentPage(articleViewer2.pagesStack.get(r2.size() - 2), true, -1);
                if (ArticleViewer.this.containerView.indexOfChild(ArticleViewer.this.pages[0]) < ArticleViewer.this.containerView.indexOfChild(ArticleViewer.this.pages[1])) {
                    int indexOfChild = ArticleViewer.this.containerView.indexOfChild(ArticleViewer.this.pages[0]);
                    ArticleViewer.this.containerView.removeView(ArticleViewer.this.pages[1]);
                    ArticleViewer.this.containerView.addView(ArticleViewer.this.pages[1], indexOfChild);
                }
            } else {
                this.movingPage = false;
            }
            ArticleViewer.this.cancelCheckLongPress();
        }

        public boolean handleTouchEvent(MotionEvent motionEvent) {
            Sheet sheet;
            PageLayout pageLayout;
            if (ArticleViewer.this.pageSwitchAnimation != null || ArticleViewer.this.closeAnimationInProgress || ArticleViewer.this.fullscreenVideoContainer.getVisibility() == 0 || ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                return false;
            }
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.startedTracking && !this.maybeStartTracking) {
                this.startedTrackingPointerId = motionEvent.getPointerId(0);
                this.maybeStartTracking = true;
                this.startedTrackingX = (int) motionEvent.getX();
                this.startedTrackingY = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.tracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                if (this.tracker == null) {
                    this.tracker = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.startedTrackingX));
                int abs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
                this.tracker.addMovement(motionEvent);
                PageLayout pageLayout2 = ArticleViewer.this.pages[0];
                this.lastWebviewAllowedScroll = pageLayout2 == null || !pageLayout2.isWeb() || (ArticleViewer.this.pages[0].swipeContainer.allowingScroll(true) && !ArticleViewer.this.pages[0].swipeContainer.isScrolling);
                Sheet sheet2 = ArticleViewer.this.sheet;
                if ((sheet2 == null || !sheet2.nestedVerticalScroll) && this.maybeStartTracking && !this.startedTracking && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.lastWebviewAllowedScroll) {
                    prepareForMoving(motionEvent);
                } else if (this.startedTracking) {
                    ArticleViewer.this.pressedLinkOwnerLayout = null;
                    ArticleViewer.this.pressedLinkOwnerView = null;
                    if (this.movingPage && (pageLayout = ArticleViewer.this.pages[0]) != null) {
                        pageLayout.setTranslationX(max);
                    } else {
                        ArticleViewer articleViewer = ArticleViewer.this;
                        Sheet sheet3 = articleViewer.sheet;
                        if (sheet3 == null) {
                            float f = max;
                            articleViewer.containerView.setTranslationX(f);
                            setInnerTranslationX(f);
                        } else {
                            sheet3.setBackProgress(max / getWidth());
                        }
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.tracker == null) {
                    this.tracker = VelocityTracker.obtain();
                }
                this.tracker.computeCurrentVelocity(1000);
                float xVelocity = this.tracker.getXVelocity();
                float yVelocity = this.tracker.getYVelocity();
                Sheet sheet4 = ArticleViewer.this.sheet;
                if ((sheet4 == null || !sheet4.nestedVerticalScroll) && !this.startedTracking && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    prepareForMoving(motionEvent);
                }
                if (this.startedTracking) {
                    FrameLayout frameLayout = this.movingPage ? ArticleViewer.this.pages[0] : ArticleViewer.this.containerView;
                    float x = (this.movingPage || (sheet = ArticleViewer.this.sheet) == null) ? frameLayout.getX() : sheet.getBackProgress() * ArticleViewer.this.sheet.windowView.getWidth();
                    final boolean z = (x < ((float) frameLayout.getMeasuredWidth()) * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.lastWebviewAllowedScroll;
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (!z) {
                        x = frameLayout.getMeasuredWidth() - x;
                        if (this.movingPage) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.pages[0], (Property<PageLayout, Float>) View.TRANSLATION_X, frameLayout.getMeasuredWidth()));
                        } else {
                            ArticleViewer articleViewer2 = ArticleViewer.this;
                            Sheet sheet5 = articleViewer2.sheet;
                            if (sheet5 != null) {
                                animatorSet.playTogether(sheet5.animateBackProgressTo(1.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer2.containerView, (Property<FrameLayout, Float>) View.TRANSLATION_X, frameLayout.getMeasuredWidth()), ObjectAnimator.ofFloat(this, ArticleViewer.ARTICLE_VIEWER_INNER_TRANSLATION_X, frameLayout.getMeasuredWidth()));
                            }
                        }
                    } else if (this.movingPage) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.pages[0], (Property<PageLayout, Float>) View.TRANSLATION_X, 0.0f));
                    } else {
                        ArticleViewer articleViewer3 = ArticleViewer.this;
                        Sheet sheet6 = articleViewer3.sheet;
                        if (sheet6 != null) {
                            animatorSet.playTogether(sheet6.animateBackProgressTo(0.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer3.containerView, (Property<FrameLayout, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this, ArticleViewer.ARTICLE_VIEWER_INNER_TRANSLATION_X, 0.0f));
                        }
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / frameLayout.getMeasuredWidth()) * x), 250));
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (WindowView.this.movingPage) {
                                Object obj = null;
                                ArticleViewer.this.pages[0].setBackgroundDrawable(null);
                                if (!z) {
                                    ArticleViewer articleViewer4 = ArticleViewer.this;
                                    PageLayout[] pageLayoutArr = articleViewer4.pages;
                                    PageLayout pageLayout3 = pageLayoutArr[1];
                                    pageLayoutArr[1] = pageLayoutArr[0];
                                    pageLayoutArr[0] = pageLayout3;
                                    articleViewer4.actionBar.swap();
                                    ArticleViewer.this.page0Background.set(ArticleViewer.this.pages[0].getBackgroundColor(), true);
                                    ArticleViewer.this.page1Background.set(ArticleViewer.this.pages[1].getBackgroundColor(), true);
                                    Sheet sheet7 = ArticleViewer.this.sheet;
                                    if (sheet7 != null) {
                                        sheet7.updateLastVisible();
                                    }
                                    ArrayList<Object> arrayList = ArticleViewer.this.pagesStack;
                                    obj = arrayList.remove(arrayList.size() - 1);
                                    ArticleViewer articleViewer5 = ArticleViewer.this;
                                    articleViewer5.textSelectionHelper.setParentView(articleViewer5.pages[0].listView);
                                    ArticleViewer articleViewer6 = ArticleViewer.this;
                                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer6.textSelectionHelper;
                                    articleTextSelectionHelper.layoutManager = articleViewer6.pages[0].layoutManager;
                                    articleTextSelectionHelper.clear(true);
                                    ArticleViewer.this.updateTitle(false);
                                    ArticleViewer.this.updatePages();
                                }
                                ArticleViewer.this.pages[1].cleanup();
                                ArticleViewer.this.pages[1].setVisibility(8);
                                if (obj instanceof CachedWeb) {
                                    ((CachedWeb) obj).destroy();
                                }
                            } else if (!z) {
                                ArticleViewer articleViewer7 = ArticleViewer.this;
                                Sheet sheet8 = articleViewer7.sheet;
                                if (sheet8 == null) {
                                    articleViewer7.saveCurrentPagePosition();
                                    ArticleViewer.this.onClosed();
                                } else {
                                    sheet8.release();
                                    ArticleViewer.this.destroy();
                                }
                            }
                            WindowView.this.movingPage = false;
                            WindowView.this.startedTracking = false;
                            ArticleViewer.this.closeAnimationInProgress = false;
                        }
                    });
                    animatorSet.start();
                    ArticleViewer.this.closeAnimationInProgress = true;
                } else {
                    this.maybeStartTracking = false;
                    this.startedTracking = false;
                    this.movingPage = false;
                }
                VelocityTracker velocityTracker2 = this.tracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.tracker = null;
                }
            } else if (motionEvent == null) {
                this.maybeStartTracking = false;
                this.startedTracking = false;
                this.movingPage = false;
                VelocityTracker velocityTracker3 = this.tracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.tracker = null;
                }
                TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = ArticleViewer.this.textSelectionHelper;
                if (articleTextSelectionHelper != null && !articleTextSelectionHelper.isInSelectionMode()) {
                    ArticleViewer.this.textSelectionHelper.clear();
                }
            }
            return this.startedTracking && this.lastWebviewAllowedScroll;
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            int i;
            super.dispatchDraw(canvas);
            if ((Build.VERSION.SDK_INT >= 21 && ArticleViewer.this.lastInsets != null) || this.bWidth == 0 || this.bHeight == 0) {
                return;
            }
            this.blackPaint.setAlpha((int) (ArticleViewer.this.windowView.getAlpha() * 255.0f));
            int i2 = this.bX;
            if (i2 == 0 && (i = this.bY) == 0) {
                canvas.drawRect(i2, i, i2 + this.bWidth, i + this.bHeight, this.blackPaint);
            } else {
                canvas.drawRect(i2 - getTranslationX(), this.bY, (this.bX + this.bWidth) - getTranslationX(), this.bY + this.bHeight, this.blackPaint);
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int systemWindowInsetTop;
            int stableInsetBottom;
            int systemWindowInsetLeft;
            int systemWindowInsetRight;
            if (ArticleViewer.this.sheet == null) {
                int measuredWidth = getMeasuredWidth();
                float f = measuredWidth;
                float measuredHeight = getMeasuredHeight();
                canvas.drawRect(this.innerTranslationX, 0.0f, f, measuredHeight, ArticleViewer.this.backgroundPaint);
                if (Build.VERSION.SDK_INT < 21 || ArticleViewer.this.lastInsets == null) {
                    return;
                }
                WindowInsets m = WindowInsetsCompat$$ExternalSyntheticApiModelOutline0.m(ArticleViewer.this.lastInsets);
                float f2 = this.innerTranslationX;
                systemWindowInsetTop = m.getSystemWindowInsetTop();
                canvas.drawRect(f2, 0.0f, f, systemWindowInsetTop, ArticleViewer.this.statusBarPaint);
                if (ArticleViewer.this.hasCutout) {
                    systemWindowInsetLeft = m.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight, ArticleViewer.this.statusBarPaint);
                    }
                    systemWindowInsetRight = m.getSystemWindowInsetRight();
                    if (systemWindowInsetRight != 0) {
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f, measuredHeight, ArticleViewer.this.statusBarPaint);
                    }
                }
                stableInsetBottom = m.getStableInsetBottom();
                canvas.drawRect(0.0f, r1 - stableInsetBottom, f, measuredHeight, ArticleViewer.this.navigationBarPaint);
            }
        }

        @Override
        @Keep
        public void setAlpha(float f) {
            int i = (int) (255.0f * f);
            ArticleViewer.this.backgroundPaint.setAlpha(i);
            ArticleViewer.this.statusBarPaint.setAlpha(i);
            this.alpha = f;
            if (ArticleViewer.this.parentActivity instanceof LaunchActivity) {
                ((LaunchActivity) ArticleViewer.this.parentActivity).drawerLayoutContainer.setAllowDrawContent((ArticleViewer.this.isVisible && this.alpha == 1.0f && this.innerTranslationX == 0.0f) ? false : true);
            }
            invalidate();
        }

        @Override
        @Keep
        public float getAlpha() {
            return this.alpha;
        }

        @Override
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                if (ArticleViewer.this.actionBar.searchEditText.isFocused()) {
                    ArticleViewer.this.actionBar.searchEditText.clearFocus();
                    AndroidUtilities.hideKeyboard(ArticleViewer.this.actionBar.searchEditText);
                } else if (ArticleViewer.this.actionBar.addressEditText.isFocused()) {
                    ArticleViewer.this.actionBar.addressEditText.clearFocus();
                    AndroidUtilities.hideKeyboard(ArticleViewer.this.actionBar.addressEditText);
                } else if (ArticleViewer.this.keyboardVisible) {
                    AndroidUtilities.hideKeyboard(this);
                } else {
                    PageLayout pageLayout = ArticleViewer.this.pages[0];
                    if (pageLayout != null && pageLayout.isWeb() && ArticleViewer.this.pages[0].getWebView() != null && ArticleViewer.this.pages[0].getWebView().canGoBack()) {
                        ArticleViewer.this.pages[0].getWebView().goBack();
                    } else {
                        ArticleViewer.this.close(true, false);
                    }
                }
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    public class CheckForLongPress implements Runnable {
        public int currentPressCount;

        CheckForLongPress() {
        }

        @Override
        public void run() {
            ArticleViewer articleViewer;
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
            if (!ArticleViewer.this.checkingForLongPress || ArticleViewer.this.windowView == null) {
                return;
            }
            ArticleViewer.this.checkingForLongPress = false;
            if (ArticleViewer.this.pressedLink != null) {
                ArticleViewer.this.windowView.performHapticFeedback(0, 2);
                ArticleViewer articleViewer2 = ArticleViewer.this;
                articleViewer2.showCopyPopup(((TextPaintUrlSpan) articleViewer2.pressedLink.getSpan()).getUrl());
                ArticleViewer.this.pressedLink = null;
                ArticleViewer.this.pressedLinkOwnerLayout = null;
                if (ArticleViewer.this.pressedLinkOwnerView != null) {
                    ArticleViewer.this.pressedLinkOwnerView.invalidate();
                    return;
                }
                return;
            }
            if (ArticleViewer.this.pressedLinkOwnerView != null) {
                ArticleViewer articleViewer3 = ArticleViewer.this;
                if (articleViewer3.textSelectionHelper.isSelectable(articleViewer3.pressedLinkOwnerView)) {
                    if (ArticleViewer.this.pressedLinkOwnerView.getTag() != null && ArticleViewer.this.pressedLinkOwnerView.getTag() == "bottomSheet" && (articleTextSelectionHelper = (articleViewer = ArticleViewer.this).textSelectionHelperBottomSheet) != null) {
                        articleTextSelectionHelper.trySelect(articleViewer.pressedLinkOwnerView);
                    } else {
                        ArticleViewer articleViewer4 = ArticleViewer.this;
                        articleViewer4.textSelectionHelper.trySelect(articleViewer4.pressedLinkOwnerView);
                    }
                    if (ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                        ArticleViewer.this.windowView.performHapticFeedback(0, 2);
                        return;
                    }
                    return;
                }
            }
            if (ArticleViewer.this.pressedLinkOwnerLayout == null || ArticleViewer.this.pressedLinkOwnerView == null) {
                return;
            }
            ArticleViewer.this.windowView.performHapticFeedback(0, 2);
            int[] iArr = new int[2];
            ArticleViewer.this.pressedLinkOwnerView.getLocationInWindow(iArr);
            int dp = (iArr[1] + ArticleViewer.this.pressedLayoutY) - AndroidUtilities.dp(54.0f);
            if (dp < 0) {
                dp = 0;
            }
            ArticleViewer.this.pressedLinkOwnerView.invalidate();
            ArticleViewer.this.drawBlockSelection = true;
            ArticleViewer articleViewer5 = ArticleViewer.this;
            articleViewer5.showPopup(articleViewer5.pressedLinkOwnerView, 48, 0, dp);
            ArticleViewer.this.pages[0].listView.setLayoutFrozen(true);
            ArticleViewer.this.pages[0].listView.setLayoutFrozen(false);
        }
    }

    private void createPaint(boolean z) {
        if (quoteLinePaint == null) {
            quoteLinePaint = new Paint();
            preformattedBackgroundPaint = new Paint();
            Paint paint = new Paint(1);
            tableLinePaint = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            tableLinePaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
            Paint paint2 = new Paint();
            tableHalfLinePaint = paint2;
            paint2.setStyle(style);
            tableHalfLinePaint.setStrokeWidth(AndroidUtilities.dp(1.0f) / 2.0f);
            tableHeaderPaint = new Paint();
            tableStripPaint = new Paint();
            urlPaint = new Paint();
            webpageUrlPaint = new Paint(1);
            webpageSearchPaint = new Paint(1);
            photoBackgroundPaint = new Paint();
            dividerPaint = new Paint();
            webpageMarkPaint = new Paint(1);
        } else if (!z) {
            return;
        }
        int themedColor = getThemedColor(Theme.key_windowBackgroundWhite);
        webpageSearchPaint.setColor((((((float) Color.red(themedColor)) * 0.2126f) + (((float) Color.green(themedColor)) * 0.7152f)) + (((float) Color.blue(themedColor)) * 0.0722f)) / 255.0f <= 0.705f ? -3041234 : -6551);
        Paint paint3 = webpageUrlPaint;
        int i = Theme.key_windowBackgroundWhiteLinkSelection;
        paint3.setColor(getThemedColor(i) & 872415231);
        webpageUrlPaint.setPathEffect(LinkPath.getRoundedEffect());
        urlPaint.setColor(getThemedColor(i) & 872415231);
        urlPaint.setPathEffect(LinkPath.getRoundedEffect());
        Paint paint4 = tableHalfLinePaint;
        int i2 = Theme.key_windowBackgroundWhiteInputField;
        paint4.setColor(getThemedColor(i2));
        tableLinePaint.setColor(getThemedColor(i2));
        photoBackgroundPaint.setColor(251658240);
        dividerPaint.setColor(getThemedColor(Theme.key_divider));
        webpageMarkPaint.setColor(getThemedColor(i) & 872415231);
        webpageMarkPaint.setPathEffect(LinkPath.getRoundedEffect());
        int themedColor2 = getThemedColor(Theme.key_switchTrack);
        int red = Color.red(themedColor2);
        int green = Color.green(themedColor2);
        int blue = Color.blue(themedColor2);
        tableStripPaint.setColor(Color.argb(20, red, green, blue));
        tableHeaderPaint.setColor(Color.argb(34, red, green, blue));
        int themedColor3 = getThemedColor(i);
        preformattedBackgroundPaint.setColor(Color.argb(20, Color.red(themedColor3), Color.green(themedColor3), Color.blue(themedColor3)));
        quoteLinePaint.setColor(getThemedColor(Theme.key_chat_inReplyLine));
    }

    public void showCopyPopup(final String str) {
        String str2;
        if (this.parentActivity == null) {
            return;
        }
        BottomSheet bottomSheet = this.linkSheet;
        if (bottomSheet != null) {
            bottomSheet.dismiss();
            this.linkSheet = null;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(this.parentActivity);
        try {
            str2 = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            FileLog.e(e);
            str2 = str;
        }
        builder.setTitle(str2);
        builder.setTitleMultipleLines(true);
        builder.setItems(new CharSequence[]{LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)}, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                ArticleViewer.this.lambda$showCopyPopup$0(str, dialogInterface, i);
            }
        });
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ArticleViewer.this.lambda$showCopyPopup$1(dialogInterface);
            }
        });
        showDialog(builder.create());
    }

    public void lambda$showCopyPopup$0(String str, DialogInterface dialogInterface, int i) {
        String str2;
        if (this.parentActivity != null) {
            if (this.pages[0].adapter.currentPage == null) {
                return;
            }
            if (i != 0) {
                if (i == 1) {
                    if (str.startsWith("mailto:")) {
                        str = str.substring(7);
                    } else if (str.startsWith("tel:")) {
                        str = str.substring(4);
                    }
                    AndroidUtilities.addToClipboard(str);
                    return;
                }
                return;
            }
            int lastIndexOf = str.lastIndexOf(35);
            if (lastIndexOf != -1) {
                String lowerCase = !TextUtils.isEmpty(this.pages[0].adapter.currentPage.cached_page.url) ? this.pages[0].adapter.currentPage.cached_page.url.toLowerCase() : this.pages[0].adapter.currentPage.url.toLowerCase();
                try {
                    str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
                } catch (Exception unused) {
                    str2 = "";
                }
                if (str.toLowerCase().contains(lowerCase)) {
                    if (TextUtils.isEmpty(str2)) {
                        LinearLayoutManager linearLayoutManager = this.pages[0].layoutManager;
                        Sheet sheet = this.sheet;
                        linearLayoutManager.scrollToPositionWithOffset((sheet == null || !sheet.halfSize()) ? 0 : 1, this.sheet != null ? AndroidUtilities.dp(32.0f) : 0);
                        checkScrollAnimated();
                        return;
                    }
                    scrollToAnchor(str2, false);
                    return;
                }
            }
            Browser.openUrl(this.parentActivity, str);
        }
    }

    public void lambda$showCopyPopup$1(DialogInterface dialogInterface) {
        this.links.clear();
    }

    public void showPopup(View view, int i, int i2, int i3) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
            return;
        }
        if (this.popupLayout == null) {
            this.popupRect = new Rect();
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity);
            this.popupLayout = actionBarPopupWindowLayout;
            actionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            this.popupLayout.setBackgroundDrawable(this.parentActivity.getResources().getDrawable(R.drawable.menu_copy));
            this.popupLayout.setAnimationEnabled(false);
            this.popupLayout.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean lambda$showPopup$2;
                    lambda$showPopup$2 = ArticleViewer.this.lambda$showPopup$2(view2, motionEvent);
                    return lambda$showPopup$2;
                }
            });
            this.popupLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
                @Override
                public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                    ArticleViewer.this.lambda$showPopup$3(keyEvent);
                }
            });
            this.popupLayout.setShownFromBottom(false);
            TextView textView = new TextView(this.parentActivity);
            this.deleteView = textView;
            textView.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 2));
            this.deleteView.setGravity(16);
            this.deleteView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.deleteView.setTextSize(1, 15.0f);
            this.deleteView.setTypeface(AndroidUtilities.bold());
            this.deleteView.setText(LocaleController.getString("Copy", R.string.Copy).toUpperCase());
            this.deleteView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ArticleViewer.this.lambda$showPopup$4(view2);
                }
            });
            this.popupLayout.addView(this.deleteView, LayoutHelper.createFrame(-2, 48.0f));
            ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(this.popupLayout, -2, -2);
            this.popupWindow = actionBarPopupWindow2;
            actionBarPopupWindow2.setAnimationEnabled(false);
            this.popupWindow.setAnimationStyle(R.style.PopupContextAnimation);
            this.popupWindow.setOutsideTouchable(true);
            this.popupWindow.setClippingEnabled(true);
            this.popupWindow.setInputMethodMode(2);
            this.popupWindow.setSoftInputMode(0);
            this.popupWindow.getContentView().setFocusableInTouchMode(true);
            this.popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    ArticleViewer.this.lambda$showPopup$5();
                }
            });
        }
        this.deleteView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.popupLayout;
        if (actionBarPopupWindowLayout2 != null) {
            actionBarPopupWindowLayout2.setBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        }
        this.popupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.popupWindow.setFocusable(true);
        this.popupWindow.showAtLocation(view, i, i2, i3);
        this.popupWindow.startAnimation();
    }

    public boolean lambda$showPopup$2(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow = this.popupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        view.getHitRect(this.popupRect);
        if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        this.popupWindow.dismiss();
        return false;
    }

    public void lambda$showPopup$3(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    public void lambda$showPopup$4(View view) {
        DrawingText drawingText = this.pressedLinkOwnerLayout;
        if (drawingText != null) {
            AndroidUtilities.addToClipboard(drawingText.getText());
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(this.parentActivity, LocaleController.getString("TextCopied", R.string.TextCopied), 0).show();
            }
        }
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    public void lambda$showPopup$5() {
        View view = this.pressedLinkOwnerView;
        if (view != null) {
            this.pressedLinkOwnerLayout = null;
            view.invalidate();
            this.pressedLinkOwnerView = null;
        }
    }

    public TLRPC$RichText getBlockCaption(TLRPC$PageBlock tLRPC$PageBlock, int i) {
        if (i == 2) {
            TLRPC$RichText blockCaption = getBlockCaption(tLRPC$PageBlock, 0);
            if (blockCaption instanceof TLRPC$TL_textEmpty) {
                blockCaption = null;
            }
            TLRPC$RichText blockCaption2 = getBlockCaption(tLRPC$PageBlock, 1);
            if (blockCaption2 instanceof TLRPC$TL_textEmpty) {
                blockCaption2 = null;
            }
            if (blockCaption != null && blockCaption2 == null) {
                return blockCaption;
            }
            if (blockCaption == null && blockCaption2 != null) {
                return blockCaption2;
            }
            if (blockCaption == null || blockCaption2 == null) {
                return null;
            }
            TLRPC$TL_textPlain tLRPC$TL_textPlain = new TLRPC$TL_textPlain();
            tLRPC$TL_textPlain.text = " ";
            TLRPC$TL_textConcat tLRPC$TL_textConcat = new TLRPC$TL_textConcat();
            tLRPC$TL_textConcat.texts.add(blockCaption);
            tLRPC$TL_textConcat.texts.add(tLRPC$TL_textPlain);
            tLRPC$TL_textConcat.texts.add(blockCaption2);
            return tLRPC$TL_textConcat;
        }
        if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbedPost) {
            TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost = (TLRPC$TL_pageBlockEmbedPost) tLRPC$PageBlock;
            if (i == 0) {
                return tLRPC$TL_pageBlockEmbedPost.caption.text;
            }
            if (i == 1) {
                return tLRPC$TL_pageBlockEmbedPost.caption.credit;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSlideshow) {
            TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow = (TLRPC$TL_pageBlockSlideshow) tLRPC$PageBlock;
            if (i == 0) {
                return tLRPC$TL_pageBlockSlideshow.caption.text;
            }
            if (i == 1) {
                return tLRPC$TL_pageBlockSlideshow.caption.credit;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
            TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto = (TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock;
            if (i == 0) {
                return tLRPC$TL_pageBlockPhoto.caption.text;
            }
            if (i == 1) {
                return tLRPC$TL_pageBlockPhoto.caption.credit;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
            TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage = (TLRPC$TL_pageBlockCollage) tLRPC$PageBlock;
            if (i == 0) {
                return tLRPC$TL_pageBlockCollage.caption.text;
            }
            if (i == 1) {
                return tLRPC$TL_pageBlockCollage.caption.credit;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbed) {
            TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed = (TLRPC$TL_pageBlockEmbed) tLRPC$PageBlock;
            if (i == 0) {
                return tLRPC$TL_pageBlockEmbed.caption.text;
            }
            if (i == 1) {
                return tLRPC$TL_pageBlockEmbed.caption.credit;
            }
        } else {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockBlockquote) {
                return ((TLRPC$TL_pageBlockBlockquote) tLRPC$PageBlock).caption;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
                TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock;
                if (i == 0) {
                    return tLRPC$TL_pageBlockVideo.caption.text;
                }
                if (i == 1) {
                    return tLRPC$TL_pageBlockVideo.caption.credit;
                }
            } else {
                if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPullquote) {
                    return ((TLRPC$TL_pageBlockPullquote) tLRPC$PageBlock).caption;
                }
                if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAudio) {
                    TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio = (TLRPC$TL_pageBlockAudio) tLRPC$PageBlock;
                    if (i == 0) {
                        return tLRPC$TL_pageBlockAudio.caption.text;
                    }
                    if (i == 1) {
                        return tLRPC$TL_pageBlockAudio.caption.credit;
                    }
                } else {
                    if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                        return getBlockCaption(((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover, i);
                    }
                    if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockMap) {
                        TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap = (TLRPC$TL_pageBlockMap) tLRPC$PageBlock;
                        if (i == 0) {
                            return tLRPC$TL_pageBlockMap.caption.text;
                        }
                        if (i == 1) {
                            return tLRPC$TL_pageBlockMap.caption.credit;
                        }
                    }
                }
            }
        }
        return null;
    }

    private View getLastNonListCell(View view) {
        if (view instanceof BlockListItemCell) {
            BlockListItemCell blockListItemCell = (BlockListItemCell) view;
            return blockListItemCell.blockLayout != null ? getLastNonListCell(blockListItemCell.blockLayout.itemView) : view;
        }
        if (!(view instanceof BlockOrderedListItemCell)) {
            return view;
        }
        BlockOrderedListItemCell blockOrderedListItemCell = (BlockOrderedListItemCell) view;
        return blockOrderedListItemCell.blockLayout != null ? getLastNonListCell(blockOrderedListItemCell.blockLayout.itemView) : view;
    }

    public boolean isListItemBlock(TLRPC$PageBlock tLRPC$PageBlock) {
        return (tLRPC$PageBlock instanceof TL_pageBlockListItem) || (tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem);
    }

    public TLRPC$PageBlock getLastNonListPageBlock(TLRPC$PageBlock tLRPC$PageBlock) {
        if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
            TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) tLRPC$PageBlock;
            return tL_pageBlockListItem.blockItem != null ? getLastNonListPageBlock(tL_pageBlockListItem.blockItem) : tL_pageBlockListItem.blockItem;
        }
        if (!(tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem)) {
            return tLRPC$PageBlock;
        }
        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) tLRPC$PageBlock;
        return tL_pageBlockOrderedListItem.blockItem != null ? getLastNonListPageBlock(tL_pageBlockOrderedListItem.blockItem) : tL_pageBlockOrderedListItem.blockItem;
    }

    private boolean openAllParentBlocks(TL_pageBlockDetailsChild tL_pageBlockDetailsChild) {
        boolean z;
        TLRPC$PageBlock lastNonListPageBlock = getLastNonListPageBlock(tL_pageBlockDetailsChild.parent);
        if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockDetails) {
            TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = (TLRPC$TL_pageBlockDetails) lastNonListPageBlock;
            if (tLRPC$TL_pageBlockDetails.open) {
                return false;
            }
            tLRPC$TL_pageBlockDetails.open = true;
            return true;
        }
        if (!(lastNonListPageBlock instanceof TL_pageBlockDetailsChild)) {
            return false;
        }
        TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = (TL_pageBlockDetailsChild) lastNonListPageBlock;
        TLRPC$PageBlock lastNonListPageBlock2 = getLastNonListPageBlock(tL_pageBlockDetailsChild2.block);
        if (lastNonListPageBlock2 instanceof TLRPC$TL_pageBlockDetails) {
            TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails2 = (TLRPC$TL_pageBlockDetails) lastNonListPageBlock2;
            if (!tLRPC$TL_pageBlockDetails2.open) {
                tLRPC$TL_pageBlockDetails2.open = true;
                z = true;
                return !openAllParentBlocks(tL_pageBlockDetailsChild2) || z;
            }
        }
        z = false;
        if (openAllParentBlocks(tL_pageBlockDetailsChild2)) {
        }
    }

    public TLRPC$PageBlock fixListBlock(TLRPC$PageBlock tLRPC$PageBlock, TLRPC$PageBlock tLRPC$PageBlock2) {
        if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
            ((TL_pageBlockListItem) tLRPC$PageBlock).blockItem = tLRPC$PageBlock2;
            return tLRPC$PageBlock;
        }
        if (!(tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem)) {
            return tLRPC$PageBlock2;
        }
        ((TL_pageBlockOrderedListItem) tLRPC$PageBlock).blockItem = tLRPC$PageBlock2;
        return tLRPC$PageBlock;
    }

    public TLRPC$PageBlock wrapInTableBlock(TLRPC$PageBlock tLRPC$PageBlock, TLRPC$PageBlock tLRPC$PageBlock2) {
        if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
            TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) tLRPC$PageBlock;
            TL_pageBlockListItem tL_pageBlockListItem2 = new TL_pageBlockListItem();
            tL_pageBlockListItem2.parent = tL_pageBlockListItem.parent;
            tL_pageBlockListItem2.blockItem = wrapInTableBlock(tL_pageBlockListItem.blockItem, tLRPC$PageBlock2);
            return tL_pageBlockListItem2;
        }
        if (!(tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem)) {
            return tLRPC$PageBlock2;
        }
        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) tLRPC$PageBlock;
        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = new TL_pageBlockOrderedListItem();
        tL_pageBlockOrderedListItem2.parent = tL_pageBlockOrderedListItem.parent;
        tL_pageBlockOrderedListItem2.blockItem = wrapInTableBlock(tL_pageBlockOrderedListItem.blockItem, tLRPC$PageBlock2);
        return tL_pageBlockOrderedListItem2;
    }

    public void updateInterfaceForCurrentPage(Object obj, boolean z, int i) {
        int i2;
        int dp;
        if (obj != null) {
            if ((!(obj instanceof TLRPC$WebPage) || ((TLRPC$WebPage) obj).cached_page == null) && !(obj instanceof CachedWeb)) {
                return;
            }
            if (!z && i != 0) {
                PageLayout[] pageLayoutArr = this.pages;
                PageLayout pageLayout = pageLayoutArr[1];
                pageLayoutArr[1] = pageLayoutArr[0];
                pageLayoutArr[0] = pageLayout;
                this.actionBar.swap();
                this.page0Background.set(this.pages[0].getBackgroundColor(), true);
                this.page1Background.set(this.pages[1].getBackgroundColor(), true);
                Sheet sheet = this.sheet;
                if (sheet != null) {
                    sheet.updateLastVisible();
                }
                int indexOfChild = this.containerView.indexOfChild(this.pages[0]);
                int indexOfChild2 = this.containerView.indexOfChild(this.pages[1]);
                if (i == 1) {
                    if (indexOfChild < indexOfChild2) {
                        this.containerView.removeView(this.pages[0]);
                        this.containerView.addView(this.pages[0], indexOfChild2);
                    }
                } else if (indexOfChild2 < indexOfChild) {
                    this.containerView.removeView(this.pages[0]);
                    this.containerView.addView(this.pages[0], indexOfChild);
                }
                this.pageSwitchAnimation = new AnimatorSet();
                this.pages[0].setVisibility(0);
                final int i3 = i == 1 ? 0 : 1;
                this.pages[i3].setBackgroundColor(this.sheet == null ? 0 : this.backgroundPaint.getColor());
                this.pages[i3].setLayerType(2, null);
                if (i == 1) {
                    this.pages[0].setTranslationX(AndroidUtilities.displaySize.x);
                    this.pageSwitchAnimation.playTogether(ObjectAnimator.ofFloat(this.pages[0], (Property<PageLayout, Float>) View.TRANSLATION_X, AndroidUtilities.displaySize.x, 0.0f));
                } else if (i == -1) {
                    this.pages[0].setTranslationX(0.0f);
                    this.pageSwitchAnimation.playTogether(ObjectAnimator.ofFloat(this.pages[1], (Property<PageLayout, Float>) View.TRANSLATION_X, 0.0f, AndroidUtilities.displaySize.x));
                }
                this.pageSwitchAnimation.setDuration(320L);
                this.pageSwitchAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.pageSwitchAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ArticleViewer.this.pages[1].cleanup();
                        ArticleViewer.this.pages[1].setVisibility(8);
                        ArticleViewer articleViewer = ArticleViewer.this;
                        articleViewer.textSelectionHelper.setParentView(articleViewer.pages[0].listView);
                        ArticleViewer articleViewer2 = ArticleViewer.this;
                        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer2.textSelectionHelper;
                        PageLayout[] pageLayoutArr2 = articleViewer2.pages;
                        articleTextSelectionHelper.layoutManager = pageLayoutArr2[0].layoutManager;
                        pageLayoutArr2[i3].setBackgroundDrawable(null);
                        ArticleViewer.this.pages[i3].setLayerType(0, null);
                        ArticleViewer.this.pageSwitchAnimation = null;
                        ArticleViewer.this.windowView.openingPage = false;
                    }
                });
                this.windowView.openingPage = true;
                WebActionBar webActionBar = this.actionBar;
                PageLayout pageLayout2 = this.pages[0];
                webActionBar.setMenuColors((pageLayout2 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout2.getBackgroundColor());
                WebActionBar webActionBar2 = this.actionBar;
                PageLayout pageLayout3 = this.pages[0];
                webActionBar2.setColors((pageLayout3 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout3.getActionBarColor(), true);
                WebActionBar webActionBar3 = this.actionBar;
                PageLayout pageLayout4 = this.pages[0];
                webActionBar3.setIsTonsite(pageLayout4 != null && pageLayout4.isTonsite());
                AnimatorSet animatorSet = this.pageSwitchAnimation;
                Objects.requireNonNull(animatorSet);
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda14(animatorSet));
            }
            if (!z) {
                this.textSelectionHelper.clear(true);
            }
            WebpageAdapter webpageAdapter = this.pages[z ? 1 : 0].adapter;
            if (z) {
                ArrayList<Object> arrayList = this.pagesStack;
                obj = arrayList.get(arrayList.size() - 2);
            }
            this.pages[z ? 1 : 0].cleanup();
            if (obj instanceof TLRPC$WebPage) {
                TLRPC$WebPage tLRPC$WebPage = (TLRPC$WebPage) obj;
                this.pages[z ? 1 : 0].setWeb(null);
                this.pages[z ? 1 : 0].setType(0);
                webpageAdapter.isRtl = tLRPC$WebPage.cached_page.rtl;
                webpageAdapter.currentPage = tLRPC$WebPage;
                int size = tLRPC$WebPage.cached_page.blocks.size();
                while (i2 < size) {
                    TLRPC$PageBlock tLRPC$PageBlock = tLRPC$WebPage.cached_page.blocks.get(i2);
                    if (i2 == 0) {
                        tLRPC$PageBlock.first = true;
                        if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                            TLRPC$TL_pageBlockCover tLRPC$TL_pageBlockCover = (TLRPC$TL_pageBlockCover) tLRPC$PageBlock;
                            TLRPC$RichText blockCaption = getBlockCaption(tLRPC$TL_pageBlockCover, 0);
                            TLRPC$RichText blockCaption2 = getBlockCaption(tLRPC$TL_pageBlockCover, 1);
                            if (((blockCaption != null && !(blockCaption instanceof TLRPC$TL_textEmpty)) || (blockCaption2 != null && !(blockCaption2 instanceof TLRPC$TL_textEmpty))) && size > 1) {
                                TLRPC$PageBlock tLRPC$PageBlock2 = tLRPC$WebPage.cached_page.blocks.get(1);
                                if (tLRPC$PageBlock2 instanceof TLRPC$TL_pageBlockChannel) {
                                    webpageAdapter.channelBlock = (TLRPC$TL_pageBlockChannel) tLRPC$PageBlock2;
                                }
                            }
                        }
                    } else {
                        i2 = (i2 == 1 && webpageAdapter.channelBlock != null) ? i2 + 1 : 0;
                    }
                    webpageAdapter.addBlock(webpageAdapter, tLRPC$PageBlock, 0, 0, i2 == size + (-1) ? i2 : 0);
                }
                webpageAdapter.notifyDataSetChanged();
                if (this.pagesStack.size() == 1 || i == -1) {
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                    String str = "article" + tLRPC$WebPage.id;
                    int i4 = sharedPreferences.getInt(str, -1);
                    boolean z2 = sharedPreferences.getBoolean(str + "r", true);
                    Point point = AndroidUtilities.displaySize;
                    if (z2 == (point.x <= point.y ? 0 : 1)) {
                        dp = sharedPreferences.getInt(str + "o", 0) - this.pages[z ? 1 : 0].listView.getPaddingTop();
                    } else {
                        dp = AndroidUtilities.dp(10.0f);
                    }
                    if (i4 != -1) {
                        this.pages[z ? 1 : 0].layoutManager.scrollToPositionWithOffset(i4, dp);
                    }
                } else {
                    LinearLayoutManager linearLayoutManager = this.pages[z ? 1 : 0].layoutManager;
                    Sheet sheet2 = this.sheet;
                    linearLayoutManager.scrollToPositionWithOffset((sheet2 == null || !sheet2.halfSize()) ? 0 : 1, this.sheet != null ? AndroidUtilities.dp(32.0f) : 0);
                }
            } else if (obj instanceof CachedWeb) {
                this.pages[z ? 1 : 0].setType(1);
                this.pages[z ? 1 : 0].scrollToTop(false);
                this.pages[z ? 1 : 0].setWeb((CachedWeb) obj);
            }
            if (!z) {
                checkScrollAnimated();
            }
            updateTitle(false);
            updatePages();
        }
    }

    public BotWebViewContainer.MyWebView getLastWebView() {
        PageLayout pageLayout = this.pages[0];
        if (pageLayout == null || !pageLayout.isWeb()) {
            return null;
        }
        if (this.pages[0].getWebView() == null) {
            this.pages[0].webViewContainer.checkCreateWebView();
        }
        return this.pages[0].getWebView();
    }

    private boolean addPageToStack(TLRPC$WebPage tLRPC$WebPage, String str, int i) {
        saveCurrentPagePosition();
        this.pagesStack.add(tLRPC$WebPage);
        this.actionBar.showSearch(false, true);
        updateInterfaceForCurrentPage(tLRPC$WebPage, false, i);
        return scrollToAnchor(str, false);
    }

    private boolean addPageToStack(String str, int i) {
        saveCurrentPagePosition();
        CachedWeb cachedWeb = new CachedWeb(str);
        this.pagesStack.add(cachedWeb);
        this.actionBar.showSearch(false, true);
        updateInterfaceForCurrentPage(cachedWeb, false, i);
        return false;
    }

    public void goBack() {
        boolean z = false;
        if (this.pagesStack.size() <= 1) {
            this.windowView.movingPage = false;
            this.windowView.startedTracking = false;
            FrameLayout frameLayout = this.containerView;
            Sheet sheet = this.sheet;
            float backProgress = sheet != null ? sheet.getBackProgress() * this.sheet.windowView.getWidth() : frameLayout.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = frameLayout.getMeasuredWidth() - backProgress;
            Sheet sheet2 = this.sheet;
            if (sheet2 != null) {
                animatorSet.playTogether(sheet2.animateBackProgressTo(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayout, Float>) View.TRANSLATION_X, frameLayout.getMeasuredWidth()), ObjectAnimator.ofFloat(this.windowView, ARTICLE_VIEWER_INNER_TRANSLATION_X, frameLayout.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / frameLayout.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ArticleViewer.this.windowView.movingPage) {
                        ArticleViewer.this.pages[0].setBackgroundDrawable(null);
                        ArticleViewer articleViewer = ArticleViewer.this;
                        PageLayout[] pageLayoutArr = articleViewer.pages;
                        PageLayout pageLayout = pageLayoutArr[1];
                        pageLayoutArr[1] = pageLayoutArr[0];
                        pageLayoutArr[0] = pageLayout;
                        articleViewer.actionBar.swap();
                        ArticleViewer.this.page0Background.set(ArticleViewer.this.pages[0].getBackgroundColor(), true);
                        ArticleViewer.this.page1Background.set(ArticleViewer.this.pages[1].getBackgroundColor(), true);
                        Sheet sheet3 = ArticleViewer.this.sheet;
                        if (sheet3 != null) {
                            sheet3.updateLastVisible();
                        }
                        ArrayList<Object> arrayList = ArticleViewer.this.pagesStack;
                        Object remove = arrayList.remove(arrayList.size() - 1);
                        ArticleViewer articleViewer2 = ArticleViewer.this;
                        articleViewer2.textSelectionHelper.setParentView(articleViewer2.pages[0].listView);
                        ArticleViewer articleViewer3 = ArticleViewer.this;
                        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer3.textSelectionHelper;
                        articleTextSelectionHelper.layoutManager = articleViewer3.pages[0].layoutManager;
                        articleTextSelectionHelper.clear(true);
                        ArticleViewer.this.updateTitle(false);
                        ArticleViewer.this.updatePages();
                        ArticleViewer.this.pages[1].cleanup();
                        ArticleViewer.this.pages[1].setVisibility(8);
                        if (remove instanceof CachedWeb) {
                            ((CachedWeb) remove).destroy();
                        }
                    } else {
                        ArticleViewer articleViewer4 = ArticleViewer.this;
                        Sheet sheet4 = articleViewer4.sheet;
                        if (sheet4 == null) {
                            articleViewer4.saveCurrentPagePosition();
                            ArticleViewer.this.onClosed();
                        } else {
                            sheet4.release();
                            ArticleViewer.this.destroy();
                        }
                    }
                    ArticleViewer.this.windowView.movingPage = false;
                    ArticleViewer.this.windowView.startedTracking = false;
                    ArticleViewer.this.closeAnimationInProgress = false;
                }
            });
            animatorSet.start();
            this.closeAnimationInProgress = true;
            return;
        }
        this.windowView.openingPage = true;
        this.pages[1].setVisibility(0);
        this.pages[1].setAlpha(1.0f);
        this.pages[1].setTranslationX(0.0f);
        this.pages[0].setBackgroundColor(this.sheet == null ? 0 : this.backgroundPaint.getColor());
        ArrayList<Object> arrayList = this.pagesStack;
        updateInterfaceForCurrentPage(arrayList.get(arrayList.size() - 2), true, -1);
        PageLayout pageLayout = this.pages[0];
        pageLayout.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        pageLayout.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.pages[0], (Property<PageLayout, Float>) View.TRANSLATION_X, pageLayout.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (!ArticleViewer.this.windowView.openingPage) {
                    ArticleViewer.this.saveCurrentPagePosition();
                    ArticleViewer.this.onClosed();
                } else {
                    ArticleViewer.this.pages[0].setBackgroundDrawable(null);
                    ArticleViewer articleViewer = ArticleViewer.this;
                    PageLayout[] pageLayoutArr = articleViewer.pages;
                    PageLayout pageLayout2 = pageLayoutArr[1];
                    pageLayoutArr[1] = pageLayoutArr[0];
                    pageLayoutArr[0] = pageLayout2;
                    articleViewer.actionBar.swap();
                    ArticleViewer.this.page0Background.set(ArticleViewer.this.pages[0].getBackgroundColor(), true);
                    ArticleViewer.this.page1Background.set(ArticleViewer.this.pages[1].getBackgroundColor(), true);
                    Sheet sheet3 = ArticleViewer.this.sheet;
                    if (sheet3 != null) {
                        sheet3.updateLastVisible();
                    }
                    ArrayList<Object> arrayList2 = ArticleViewer.this.pagesStack;
                    Object remove = arrayList2.remove(arrayList2.size() - 1);
                    ArticleViewer articleViewer2 = ArticleViewer.this;
                    articleViewer2.textSelectionHelper.setParentView(articleViewer2.pages[0].listView);
                    ArticleViewer articleViewer3 = ArticleViewer.this;
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer3.textSelectionHelper;
                    articleTextSelectionHelper.layoutManager = articleViewer3.pages[0].layoutManager;
                    articleTextSelectionHelper.clear(true);
                    ArticleViewer.this.updateTitle(false);
                    ArticleViewer.this.updatePages();
                    ArticleViewer.this.pages[1].cleanup();
                    ArticleViewer.this.pages[1].setVisibility(8);
                    if (remove instanceof CachedWeb) {
                        ((CachedWeb) remove).destroy();
                    }
                }
                ArticleViewer.this.windowView.openingPage = false;
                ArticleViewer.this.windowView.startedTracking = false;
                ArticleViewer.this.closeAnimationInProgress = false;
            }
        });
        animatorSet2.start();
        WebActionBar webActionBar = this.actionBar;
        PageLayout pageLayout2 = this.pages[0];
        webActionBar.setMenuColors((pageLayout2 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout2.getBackgroundColor());
        WebActionBar webActionBar2 = this.actionBar;
        PageLayout pageLayout3 = this.pages[0];
        webActionBar2.setColors((pageLayout3 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout3.getActionBarColor(), true);
        WebActionBar webActionBar3 = this.actionBar;
        PageLayout pageLayout4 = this.pages[0];
        if (pageLayout4 != null && pageLayout4.isTonsite()) {
            z = true;
        }
        webActionBar3.setIsTonsite(z);
        this.closeAnimationInProgress = true;
    }

    public void lambda$setParentActivity$26(final int i) {
        boolean z = false;
        if (this.pagesStack.size() <= 1) {
            this.windowView.movingPage = false;
            this.windowView.startedTracking = false;
            FrameLayout frameLayout = this.containerView;
            Sheet sheet = this.sheet;
            float backProgress = sheet != null ? sheet.getBackProgress() * this.sheet.windowView.getWidth() : frameLayout.getX();
            AnimatorSet animatorSet = new AnimatorSet();
            float measuredWidth = frameLayout.getMeasuredWidth() - backProgress;
            Sheet sheet2 = this.sheet;
            if (sheet2 != null) {
                animatorSet.playTogether(sheet2.animateBackProgressTo(1.0f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayout, Float>) View.TRANSLATION_X, frameLayout.getMeasuredWidth()), ObjectAnimator.ofFloat(this.windowView, ARTICLE_VIEWER_INNER_TRANSLATION_X, frameLayout.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / frameLayout.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (ArticleViewer.this.windowView.movingPage) {
                        ArticleViewer.this.pages[0].setBackgroundDrawable(null);
                        ArticleViewer articleViewer = ArticleViewer.this;
                        PageLayout[] pageLayoutArr = articleViewer.pages;
                        PageLayout pageLayout = pageLayoutArr[1];
                        pageLayoutArr[1] = pageLayoutArr[0];
                        pageLayoutArr[0] = pageLayout;
                        articleViewer.actionBar.swap();
                        ArticleViewer.this.page0Background.set(ArticleViewer.this.pages[0].getBackgroundColor(), true);
                        ArticleViewer.this.page1Background.set(ArticleViewer.this.pages[1].getBackgroundColor(), true);
                        Sheet sheet3 = ArticleViewer.this.sheet;
                        if (sheet3 != null) {
                            sheet3.updateLastVisible();
                        }
                        ArrayList<Object> arrayList = ArticleViewer.this.pagesStack;
                        Object remove = arrayList.remove(arrayList.size() - 1);
                        ArticleViewer articleViewer2 = ArticleViewer.this;
                        articleViewer2.textSelectionHelper.setParentView(articleViewer2.pages[0].listView);
                        ArticleViewer articleViewer3 = ArticleViewer.this;
                        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer3.textSelectionHelper;
                        articleTextSelectionHelper.layoutManager = articleViewer3.pages[0].layoutManager;
                        articleTextSelectionHelper.clear(true);
                        ArticleViewer.this.updateTitle(false);
                        ArticleViewer.this.updatePages();
                        ArticleViewer.this.pages[1].cleanup();
                        ArticleViewer.this.pages[1].setVisibility(8);
                        if (remove instanceof CachedWeb) {
                            ((CachedWeb) remove).destroy();
                        }
                    } else {
                        ArticleViewer articleViewer4 = ArticleViewer.this;
                        Sheet sheet4 = articleViewer4.sheet;
                        if (sheet4 == null) {
                            articleViewer4.saveCurrentPagePosition();
                            ArticleViewer.this.onClosed();
                        } else {
                            sheet4.release();
                            ArticleViewer.this.destroy();
                        }
                    }
                    ArticleViewer.this.windowView.movingPage = false;
                    ArticleViewer.this.windowView.startedTracking = false;
                    ArticleViewer.this.closeAnimationInProgress = false;
                }
            });
            animatorSet.start();
            this.closeAnimationInProgress = true;
            return;
        }
        this.windowView.openingPage = true;
        this.pages[1].setVisibility(0);
        this.pages[1].setAlpha(1.0f);
        this.pages[1].setTranslationX(0.0f);
        this.pages[0].setBackgroundColor(this.sheet == null ? 0 : this.backgroundPaint.getColor());
        updateInterfaceForCurrentPage(this.pagesStack.get(i), true, -1);
        PageLayout pageLayout = this.pages[0];
        pageLayout.getX();
        AnimatorSet animatorSet2 = new AnimatorSet();
        pageLayout.getMeasuredWidth();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.pages[0], (Property<PageLayout, Float>) View.TRANSLATION_X, pageLayout.getMeasuredWidth()));
        animatorSet2.setDuration(420L);
        animatorSet2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (!ArticleViewer.this.windowView.openingPage) {
                    ArticleViewer.this.saveCurrentPagePosition();
                    ArticleViewer.this.onClosed();
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArticleViewer.this.pages[0].setBackgroundDrawable(null);
                    ArticleViewer articleViewer = ArticleViewer.this;
                    PageLayout[] pageLayoutArr = articleViewer.pages;
                    PageLayout pageLayout2 = pageLayoutArr[1];
                    pageLayoutArr[1] = pageLayoutArr[0];
                    pageLayoutArr[0] = pageLayout2;
                    articleViewer.actionBar.swap();
                    ArticleViewer.this.page0Background.set(ArticleViewer.this.pages[0].getBackgroundColor(), true);
                    ArticleViewer.this.page1Background.set(ArticleViewer.this.pages[1].getBackgroundColor(), true);
                    Sheet sheet3 = ArticleViewer.this.sheet;
                    if (sheet3 != null) {
                        sheet3.updateLastVisible();
                    }
                    for (int size = ArticleViewer.this.pagesStack.size() - 1; size > i; size--) {
                        arrayList.add(ArticleViewer.this.pagesStack.remove(size));
                    }
                    ArticleViewer articleViewer2 = ArticleViewer.this;
                    articleViewer2.textSelectionHelper.setParentView(articleViewer2.pages[0].listView);
                    ArticleViewer articleViewer3 = ArticleViewer.this;
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer3.textSelectionHelper;
                    articleTextSelectionHelper.layoutManager = articleViewer3.pages[0].layoutManager;
                    articleTextSelectionHelper.clear(true);
                    ArticleViewer.this.updateTitle(false);
                    ArticleViewer.this.updatePages();
                    ArticleViewer.this.pages[1].cleanup();
                    ArticleViewer.this.pages[1].setVisibility(8);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof CachedWeb) {
                            ((CachedWeb) next).destroy();
                        }
                    }
                }
                ArticleViewer.this.windowView.openingPage = false;
                ArticleViewer.this.windowView.startedTracking = false;
                ArticleViewer.this.closeAnimationInProgress = false;
            }
        });
        animatorSet2.start();
        WebActionBar webActionBar = this.actionBar;
        PageLayout pageLayout2 = this.pages[0];
        webActionBar.setMenuColors((pageLayout2 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout2.getBackgroundColor());
        WebActionBar webActionBar2 = this.actionBar;
        PageLayout pageLayout3 = this.pages[0];
        webActionBar2.setColors((pageLayout3 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout3.getActionBarColor(), true);
        WebActionBar webActionBar3 = this.actionBar;
        PageLayout pageLayout4 = this.pages[0];
        if (pageLayout4 != null && pageLayout4.isTonsite()) {
            z = true;
        }
        webActionBar3.setIsTonsite(z);
        this.closeAnimationInProgress = true;
    }

    private boolean scrollToAnchor(String str, boolean z) {
        Integer num = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        Integer num2 = (Integer) this.pages[0].adapter.anchors.get(lowerCase);
        if (num2 != null) {
            TLRPC$TL_textAnchor tLRPC$TL_textAnchor = (TLRPC$TL_textAnchor) this.pages[0].adapter.anchorsParent.get(lowerCase);
            if (tLRPC$TL_textAnchor != null) {
                TLRPC$TL_pageBlockParagraph tLRPC$TL_pageBlockParagraph = new TLRPC$TL_pageBlockParagraph();
                tLRPC$TL_pageBlockParagraph.text = tLRPC$TL_textAnchor.text;
                int typeForBlock = this.pages[0].adapter.getTypeForBlock(tLRPC$TL_pageBlockParagraph);
                RecyclerView.ViewHolder onCreateViewHolder = this.pages[0].adapter.onCreateViewHolder(null, typeForBlock);
                this.pages[0].adapter.bindBlockToHolder(typeForBlock, onCreateViewHolder, tLRPC$TL_pageBlockParagraph, 0, 0);
                BottomSheet.Builder builder = new BottomSheet.Builder(this.parentActivity);
                builder.setApplyTopPadding(false);
                builder.setApplyBottomPadding(false);
                final LinearLayout linearLayout = new LinearLayout(this.parentActivity);
                linearLayout.setOrientation(1);
                TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper();
                this.textSelectionHelperBottomSheet = articleTextSelectionHelper;
                articleTextSelectionHelper.setParentView(linearLayout);
                this.textSelectionHelperBottomSheet.setCallback(new TextSelectionHelper.Callback() {
                    @Override
                    public void onStateChanged(boolean z2) {
                        if (ArticleViewer.this.linkSheet != null) {
                            ArticleViewer.this.linkSheet.setDisableScroll(z2);
                        }
                    }
                });
                TextView textView = new TextView(this.parentActivity) {
                    @Override
                    protected void onDraw(Canvas canvas) {
                        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, ArticleViewer.dividerPaint);
                        super.onDraw(canvas);
                    }
                };
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setText(LocaleController.getString("InstantViewReference", R.string.InstantViewReference));
                textView.setGravity((this.pages[0].adapter.isRtl ? 5 : 3) | 16);
                textView.setTextColor(getTextColor());
                textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                onCreateViewHolder.itemView.setTag("bottomSheet");
                linearLayout.addView(onCreateViewHolder.itemView, LayoutHelper.createLinear(-1, -2, 0.0f, 7.0f, 0.0f, 0.0f));
                TextSelectionHelper<Cell>.TextSelectionOverlay overlayView = this.textSelectionHelperBottomSheet.getOverlayView(this.parentActivity);
                FrameLayout frameLayout = new FrameLayout(this.parentActivity) {
                    @Override
                    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                        TextSelectionHelper<Cell>.TextSelectionOverlay overlayView2 = ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext());
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                        if (ArticleViewer.this.textSelectionHelperBottomSheet.isInSelectionMode() && ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext()).onTouchEvent(obtain)) {
                            return true;
                        }
                        if (overlayView2.checkOnTap(motionEvent)) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 && ArticleViewer.this.textSelectionHelperBottomSheet.isInSelectionMode() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                            if (ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext()).onTouchEvent(obtain)) {
                                return super.dispatchTouchEvent(motionEvent);
                            }
                            return true;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }

                    @Override
                    protected void onMeasure(int i, int i2) {
                        super.onMeasure(i, i2);
                        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredHeight() + AndroidUtilities.dp(8.0f), 1073741824));
                    }
                };
                builder.setDelegate(new BottomSheet.BottomSheetDelegate() {
                    @Override
                    public boolean canDismiss() {
                        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper2 = ArticleViewer.this.textSelectionHelperBottomSheet;
                        if (articleTextSelectionHelper2 == null || !articleTextSelectionHelper2.isInSelectionMode()) {
                            return true;
                        }
                        ArticleViewer.this.textSelectionHelperBottomSheet.clear();
                        return false;
                    }
                });
                frameLayout.addView(linearLayout, -1, -2);
                frameLayout.addView(overlayView, -1, -2);
                builder.setCustomView(frameLayout);
                if (this.textSelectionHelper.isInSelectionMode()) {
                    this.textSelectionHelper.clear();
                }
                BottomSheet create = builder.create();
                this.linkSheet = create;
                showDialog(create);
            } else if (num2.intValue() >= 0 && num2.intValue() < this.pages[0].adapter.blocks.size()) {
                TLRPC$PageBlock tLRPC$PageBlock = (TLRPC$PageBlock) this.pages[0].adapter.blocks.get(num2.intValue());
                TLRPC$PageBlock lastNonListPageBlock = getLastNonListPageBlock(tLRPC$PageBlock);
                if ((lastNonListPageBlock instanceof TL_pageBlockDetailsChild) && openAllParentBlocks((TL_pageBlockDetailsChild) lastNonListPageBlock)) {
                    this.pages[0].adapter.updateRows();
                    this.pages[0].adapter.notifyDataSetChanged();
                }
                int indexOf = this.pages[0].adapter.localBlocks.indexOf(tLRPC$PageBlock);
                if (indexOf != -1) {
                    num2 = Integer.valueOf(indexOf);
                }
                Integer num3 = (Integer) this.pages[0].adapter.anchorsOffset.get(lowerCase);
                if (num3 != null) {
                    if (num3.intValue() == -1) {
                        int typeForBlock2 = this.pages[0].adapter.getTypeForBlock(tLRPC$PageBlock);
                        RecyclerView.ViewHolder onCreateViewHolder2 = this.pages[0].adapter.onCreateViewHolder(null, typeForBlock2);
                        this.pages[0].adapter.bindBlockToHolder(typeForBlock2, onCreateViewHolder2, tLRPC$PageBlock, 0, 0);
                        onCreateViewHolder2.itemView.measure(View.MeasureSpec.makeMeasureSpec(this.pages[0].listView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        Integer num4 = (Integer) this.pages[0].adapter.anchorsOffset.get(lowerCase);
                        if (num4.intValue() != -1) {
                            num = num4;
                        }
                    } else {
                        num = num3;
                    }
                }
                if (z) {
                    SmoothScroller smoothScroller = new SmoothScroller(this.pages[0].getContext());
                    int intValue = num2.intValue();
                    Sheet sheet = this.sheet;
                    smoothScroller.setTargetPosition(intValue + ((sheet == null || !sheet.halfSize()) ? 0 : 1));
                    smoothScroller.setOffset((-AndroidUtilities.dp(56.0f)) - num.intValue());
                    this.pages[0].layoutManager.startSmoothScroll(smoothScroller);
                } else {
                    this.pages[0].layoutManager.scrollToPositionWithOffset(num2.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                }
            }
            return true;
        }
        return false;
    }

    private boolean removeLastPageFromStack() {
        if (this.pagesStack.size() < 2) {
            return false;
        }
        ArrayList<Object> arrayList = this.pagesStack;
        Object remove = arrayList.remove(arrayList.size() - 1);
        if (remove instanceof CachedWeb) {
            ((CachedWeb) remove).destroy();
        }
        ArrayList<Object> arrayList2 = this.pagesStack;
        updateInterfaceForCurrentPage(arrayList2.get(arrayList2.size() - 1), false, -1);
        return true;
    }

    protected void startCheckLongPress(float f, float f2, View view) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
        if (this.checkingForLongPress) {
            return;
        }
        this.checkingForLongPress = true;
        if (this.pendingCheckForTap == null) {
            this.pendingCheckForTap = new CheckForTap();
        }
        if (view.getTag() != null && view.getTag() == "bottomSheet" && (articleTextSelectionHelper = this.textSelectionHelperBottomSheet) != null) {
            articleTextSelectionHelper.setMaybeView((int) f, (int) f2, view);
        } else {
            this.textSelectionHelper.setMaybeView((int) f, (int) f2, view);
        }
        this.windowView.postDelayed(this.pendingCheckForTap, ViewConfiguration.getTapTimeout());
    }

    protected void cancelCheckLongPress() {
        this.checkingForLongPress = false;
        CheckForLongPress checkForLongPress = this.pendingCheckForLongPress;
        if (checkForLongPress != null) {
            this.windowView.removeCallbacks(checkForLongPress);
            this.pendingCheckForLongPress = null;
        }
        CheckForTap checkForTap = this.pendingCheckForTap;
        if (checkForTap != null) {
            this.windowView.removeCallbacks(checkForTap);
            this.pendingCheckForTap = null;
        }
    }

    private int getTextFlags(TLRPC$RichText tLRPC$RichText) {
        if (tLRPC$RichText instanceof TLRPC$TL_textFixed) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 4;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textItalic) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 2;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textBold) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 1;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUnderline) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 16;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textStrike) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 32;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textEmail) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 8;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textPhone) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 8;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUrl) {
            if (((TLRPC$TL_textUrl) tLRPC$RichText).webpage_id != 0) {
                return getTextFlags(tLRPC$RichText.parentRichText) | 512;
            }
            return getTextFlags(tLRPC$RichText.parentRichText) | 8;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textSubscript) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 128;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textSuperscript) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 256;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textMarked) {
            return getTextFlags(tLRPC$RichText.parentRichText) | 64;
        }
        if (tLRPC$RichText != null) {
            return getTextFlags(tLRPC$RichText.parentRichText);
        }
        return 0;
    }

    private TLRPC$RichText getLastRichText(TLRPC$RichText tLRPC$RichText) {
        if (tLRPC$RichText == null) {
            return null;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textFixed) {
            return getLastRichText(((TLRPC$TL_textFixed) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textItalic) {
            return getLastRichText(((TLRPC$TL_textItalic) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textBold) {
            return getLastRichText(((TLRPC$TL_textBold) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUnderline) {
            return getLastRichText(((TLRPC$TL_textUnderline) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textStrike) {
            return getLastRichText(((TLRPC$TL_textStrike) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textEmail) {
            return getLastRichText(((TLRPC$TL_textEmail) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUrl) {
            return getLastRichText(((TLRPC$TL_textUrl) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textAnchor) {
            getLastRichText(((TLRPC$TL_textAnchor) tLRPC$RichText).text);
        } else {
            if (tLRPC$RichText instanceof TLRPC$TL_textSubscript) {
                return getLastRichText(((TLRPC$TL_textSubscript) tLRPC$RichText).text);
            }
            if (tLRPC$RichText instanceof TLRPC$TL_textSuperscript) {
                return getLastRichText(((TLRPC$TL_textSuperscript) tLRPC$RichText).text);
            }
            if (tLRPC$RichText instanceof TLRPC$TL_textMarked) {
                return getLastRichText(((TLRPC$TL_textMarked) tLRPC$RichText).text);
            }
            if (tLRPC$RichText instanceof TLRPC$TL_textPhone) {
                return getLastRichText(((TLRPC$TL_textPhone) tLRPC$RichText).text);
            }
        }
        return tLRPC$RichText;
    }

    public CharSequence getText(WebpageAdapter webpageAdapter, View view, TLRPC$RichText tLRPC$RichText, TLRPC$RichText tLRPC$RichText2, TLRPC$PageBlock tLRPC$PageBlock, int i) {
        return getText(webpageAdapter.currentPage, view, tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock, i);
    }

    public CharSequence getText(TLRPC$WebPage tLRPC$WebPage, View view, TLRPC$RichText tLRPC$RichText, TLRPC$RichText tLRPC$RichText2, TLRPC$PageBlock tLRPC$PageBlock, int i) {
        int i2;
        int i3;
        Object textPaintUrlSpan;
        Object textPaintUrlSpan2;
        if (tLRPC$RichText2 == null) {
            return null;
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textFixed) {
            return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textFixed) tLRPC$RichText2).text, tLRPC$PageBlock, i);
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textItalic) {
            return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textItalic) tLRPC$RichText2).text, tLRPC$PageBlock, i);
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textBold) {
            return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textBold) tLRPC$RichText2).text, tLRPC$PageBlock, i);
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textUnderline) {
            return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textUnderline) tLRPC$RichText2).text, tLRPC$PageBlock, i);
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textStrike) {
            return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textStrike) tLRPC$RichText2).text, tLRPC$PageBlock, i);
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textEmail) tLRPC$RichText2).text, tLRPC$PageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.setSpan(new TextPaintUrlSpan((metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) ? getTextPaint(tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock) : null, "mailto:" + getUrl(tLRPC$RichText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j = 0;
        if (tLRPC$RichText2 instanceof TLRPC$TL_textUrl) {
            TLRPC$TL_textUrl tLRPC$TL_textUrl = (TLRPC$TL_textUrl) tLRPC$RichText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, tLRPC$TL_textUrl.text, tLRPC$PageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            TextPaint textPaint = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? getTextPaint(tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock) : null;
            if (tLRPC$TL_textUrl.webpage_id != 0) {
                textPaintUrlSpan2 = new TextPaintWebpageUrlSpan(textPaint, getUrl(tLRPC$RichText2));
            } else {
                textPaintUrlSpan2 = new TextPaintUrlSpan(textPaint, getUrl(tLRPC$RichText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(textPaintUrlSpan2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textPlain) {
            return ((TLRPC$TL_textPlain) tLRPC$RichText2).text;
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textAnchor) {
            TLRPC$TL_textAnchor tLRPC$TL_textAnchor = (TLRPC$TL_textAnchor) tLRPC$RichText2;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, tLRPC$TL_textAnchor.text, tLRPC$PageBlock, i));
            spannableStringBuilder3.setSpan(new AnchorSpan(tLRPC$TL_textAnchor.name), 0, spannableStringBuilder3.length(), 17);
            return spannableStringBuilder3;
        }
        ?? r2 = "";
        if (tLRPC$RichText2 instanceof TLRPC$TL_textEmpty) {
            return "";
        }
        int i4 = 1;
        if (tLRPC$RichText2 instanceof TLRPC$TL_textConcat) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = tLRPC$RichText2.texts.size();
            int i5 = 0;
            while (i5 < size) {
                TLRPC$RichText tLRPC$RichText3 = tLRPC$RichText2.texts.get(i5);
                TLRPC$RichText lastRichText = getLastRichText(tLRPC$RichText3);
                boolean z = i >= 0 && (tLRPC$RichText3 instanceof TLRPC$TL_textUrl) && ((TLRPC$TL_textUrl) tLRPC$RichText3).webpage_id != j;
                if (z && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - i4) != '\n') {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new TextSelectionHelper.IgnoreCopySpannable(), spannableStringBuilder4.length() - i4, spannableStringBuilder4.length(), 33);
                }
                int i6 = i5;
                CharSequence text = getText(tLRPC$WebPage, view, tLRPC$RichText, tLRPC$RichText3, tLRPC$PageBlock, i);
                int textFlags = getTextFlags(lastRichText);
                int length = spannableStringBuilder4.length();
                spannableStringBuilder4.append(text);
                if (textFlags != 0 && !(text instanceof SpannableStringBuilder)) {
                    if ((textFlags & 8) != 0 || (textFlags & 512) != 0) {
                        String url = getUrl(tLRPC$RichText3);
                        if (url == null) {
                            url = getUrl(tLRPC$RichText);
                        }
                        if ((textFlags & 512) != 0) {
                            textPaintUrlSpan = new TextPaintWebpageUrlSpan(getTextPaint(tLRPC$RichText, lastRichText, tLRPC$PageBlock), url);
                        } else {
                            textPaintUrlSpan = new TextPaintUrlSpan(getTextPaint(tLRPC$RichText, lastRichText, tLRPC$PageBlock), url);
                        }
                        if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(textPaintUrlSpan, length, spannableStringBuilder4.length(), 33);
                        }
                    } else if (length != spannableStringBuilder4.length()) {
                        spannableStringBuilder4.setSpan(new TextPaintSpan(getTextPaint(tLRPC$RichText, lastRichText, tLRPC$PageBlock)), length, spannableStringBuilder4.length(), 33);
                    }
                }
                if (z && i6 != size - 1) {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new TextSelectionHelper.IgnoreCopySpannable(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                i5 = i6 + 1;
                i4 = 1;
                j = 0;
            }
            return spannableStringBuilder4;
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textSubscript) {
            return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textSubscript) tLRPC$RichText2).text, tLRPC$PageBlock, i);
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textSuperscript) {
            return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textSuperscript) tLRPC$RichText2).text, tLRPC$PageBlock, i);
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textMarked) {
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textMarked) tLRPC$RichText2).text, tLRPC$PageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder5.length() != 0) {
                spannableStringBuilder5.setSpan(new TextPaintMarkSpan((metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? getTextPaint(tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock) : null), 0, spannableStringBuilder5.length(), 33);
            }
            return spannableStringBuilder5;
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textPhone) {
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textPhone) tLRPC$RichText2).text, tLRPC$PageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder6.getSpans(0, spannableStringBuilder6.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder6.length() != 0) {
                spannableStringBuilder6.setSpan(new TextPaintUrlSpan((metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? getTextPaint(tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock) : null, "tel:" + getUrl(tLRPC$RichText2)), 0, spannableStringBuilder6.length(), 33);
            }
            return spannableStringBuilder6;
        }
        if (tLRPC$RichText2 instanceof TLRPC$TL_textImage) {
            TLRPC$Document documentWithId = WebPageUtils.getDocumentWithId(tLRPC$WebPage, ((TLRPC$TL_textImage) tLRPC$RichText2).document_id);
            if (documentWithId != null) {
                r2 = new SpannableStringBuilder("*");
                int dp = AndroidUtilities.dp(r0.w);
                int dp2 = AndroidUtilities.dp(r0.h);
                int abs = Math.abs(i);
                if (dp > abs) {
                    i2 = (int) (dp2 * (abs / dp));
                    i3 = abs;
                } else {
                    i2 = dp2;
                    i3 = dp;
                }
                if (view != null) {
                    int themedColor = getThemedColor(Theme.key_windowBackgroundWhite);
                    r2.setSpan(new TextPaintImageReceiverSpan(view, documentWithId, tLRPC$WebPage, i3, i2, false, (((((float) Color.red(themedColor)) * 0.2126f) + (((float) Color.green(themedColor)) * 0.7152f)) + (((float) Color.blue(themedColor)) * 0.0722f)) / 255.0f <= 0.705f), 0, r2.length(), 33);
                }
            }
            return r2;
        }
        return "not supported " + tLRPC$RichText2;
    }

    public static CharSequence getPlainText(TLRPC$RichText tLRPC$RichText) {
        if (tLRPC$RichText == null) {
            return "";
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textFixed) {
            return getPlainText(((TLRPC$TL_textFixed) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textItalic) {
            return getPlainText(((TLRPC$TL_textItalic) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textBold) {
            return getPlainText(((TLRPC$TL_textBold) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUnderline) {
            return getPlainText(((TLRPC$TL_textUnderline) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textStrike) {
            return getPlainText(((TLRPC$TL_textStrike) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textEmail) {
            return getPlainText(((TLRPC$TL_textEmail) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUrl) {
            return getPlainText(((TLRPC$TL_textUrl) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textPlain) {
            return ((TLRPC$TL_textPlain) tLRPC$RichText).text;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textAnchor) {
            return getPlainText(((TLRPC$TL_textAnchor) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textEmpty) {
            return "";
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textConcat) {
            StringBuilder sb = new StringBuilder();
            int size = tLRPC$RichText.texts.size();
            for (int i = 0; i < size; i++) {
                sb.append(getPlainText(tLRPC$RichText.texts.get(i)));
            }
            return sb;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textSubscript) {
            return getPlainText(((TLRPC$TL_textSubscript) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textSuperscript) {
            return getPlainText(((TLRPC$TL_textSuperscript) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textMarked) {
            return getPlainText(((TLRPC$TL_textMarked) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textPhone) {
            return getPlainText(((TLRPC$TL_textPhone) tLRPC$RichText).text);
        }
        boolean z = tLRPC$RichText instanceof TLRPC$TL_textImage;
        return "";
    }

    public static String getUrl(TLRPC$RichText tLRPC$RichText) {
        if (tLRPC$RichText instanceof TLRPC$TL_textFixed) {
            return getUrl(((TLRPC$TL_textFixed) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textItalic) {
            return getUrl(((TLRPC$TL_textItalic) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textBold) {
            return getUrl(((TLRPC$TL_textBold) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUnderline) {
            return getUrl(((TLRPC$TL_textUnderline) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textStrike) {
            return getUrl(((TLRPC$TL_textStrike) tLRPC$RichText).text);
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textEmail) {
            return ((TLRPC$TL_textEmail) tLRPC$RichText).email;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textUrl) {
            return ((TLRPC$TL_textUrl) tLRPC$RichText).url;
        }
        if (tLRPC$RichText instanceof TLRPC$TL_textPhone) {
            return ((TLRPC$TL_textPhone) tLRPC$RichText).phone;
        }
        return null;
    }

    public int getTextColor() {
        return getThemedColor(Theme.key_windowBackgroundWhiteBlackText);
    }

    public int getLinkTextColor() {
        return getThemedColor(Theme.key_windowBackgroundWhiteLinkText);
    }

    public int getGrayTextColor() {
        return getThemedColor(Theme.key_windowBackgroundWhiteGrayText);
    }

    private android.text.TextPaint getTextPaint(org.telegram.tgnet.TLRPC$RichText r11, org.telegram.tgnet.TLRPC$RichText r12, org.telegram.tgnet.TLRPC$PageBlock r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.getTextPaint(org.telegram.tgnet.TLRPC$RichText, org.telegram.tgnet.TLRPC$RichText, org.telegram.tgnet.TLRPC$PageBlock):android.text.TextPaint");
    }

    public DrawingText createLayoutForText(View view, CharSequence charSequence, TLRPC$RichText tLRPC$RichText, int i, int i2, TLRPC$PageBlock tLRPC$PageBlock, Layout.Alignment alignment, WebpageAdapter webpageAdapter) {
        return createLayoutForText(view, charSequence, tLRPC$RichText, i, 0, tLRPC$PageBlock, alignment, 0, webpageAdapter);
    }

    public DrawingText createLayoutForText(View view, CharSequence charSequence, TLRPC$RichText tLRPC$RichText, int i, int i2, TLRPC$PageBlock tLRPC$PageBlock, WebpageAdapter webpageAdapter) {
        return createLayoutForText(view, charSequence, tLRPC$RichText, i, i2, tLRPC$PageBlock, Layout.Alignment.ALIGN_NORMAL, 0, webpageAdapter);
    }

    public org.telegram.ui.ArticleViewer.DrawingText createLayoutForText(android.view.View r23, java.lang.CharSequence r24, org.telegram.tgnet.TLRPC$RichText r25, int r26, int r27, org.telegram.tgnet.TLRPC$PageBlock r28, android.text.Layout.Alignment r29, int r30, org.telegram.ui.ArticleViewer.WebpageAdapter r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.createLayoutForText(android.view.View, java.lang.CharSequence, org.telegram.tgnet.TLRPC$RichText, int, int, org.telegram.tgnet.TLRPC$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.ArticleViewer$WebpageAdapter):org.telegram.ui.ArticleViewer$DrawingText");
    }

    public boolean checkLayoutForLinks(org.telegram.ui.ArticleViewer.WebpageAdapter r17, android.view.MotionEvent r18, android.view.View r19, org.telegram.ui.ArticleViewer.DrawingText r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.checkLayoutForLinks(org.telegram.ui.ArticleViewer$WebpageAdapter, android.view.MotionEvent, android.view.View, org.telegram.ui.ArticleViewer$DrawingText, int, int):boolean");
    }

    public Browser.Progress makeProgress(final LinkSpanDrawable<TextPaintUrlSpan> linkSpanDrawable, final DrawingText drawingText) {
        if (linkSpanDrawable == null) {
            return null;
        }
        return new Browser.Progress() {
            @Override
            public void init() {
                ArticleViewer.this.loadingText = drawingText;
                ArticleViewer articleViewer = ArticleViewer.this;
                DrawingText drawingText2 = drawingText;
                articleViewer.loadingLinkView = drawingText2 != null ? drawingText2.latestParentView : null;
                ArticleViewer.this.loadingLink = (TextPaintUrlSpan) linkSpanDrawable.getSpan();
                ArticleViewer.this.links.removeLoading(ArticleViewer.this.loadingLinkDrawable, true);
                DrawingText drawingText3 = drawingText;
                if (drawingText3 != null) {
                    ArticleViewer.this.loadingLinkDrawable = LinkSpanDrawable.LinkCollector.makeLoading(drawingText3.textLayout, linkSpanDrawable.getSpan(), 0.0f);
                    int themedColor = ArticleViewer.this.getThemedColor(Theme.key_chat_linkSelectBackground);
                    ArticleViewer.this.loadingLinkDrawable.setColors(Theme.multAlpha(themedColor, 0.8f), Theme.multAlpha(themedColor, 1.3f), Theme.multAlpha(themedColor, 1.0f), Theme.multAlpha(themedColor, 4.0f));
                    ArticleViewer.this.loadingLinkDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    ArticleViewer.this.links.addLoading(ArticleViewer.this.loadingLinkDrawable, drawingText);
                }
                if (ArticleViewer.this.loadingLinkView != null) {
                    ArticleViewer.this.loadingLinkView.invalidate();
                }
                super.init();
            }

            @Override
            public void end() {
                ArticleViewer.this.links.removeLoading(ArticleViewer.this.loadingLinkDrawable, true);
                if (ArticleViewer.this.loadingLinkView != null) {
                    ArticleViewer.this.loadingLinkView.invalidate();
                }
                ArticleViewer.this.loadingLink = null;
                super.end();
            }
        };
    }

    public void removePressedLink() {
        if (this.pressedLink == null && this.pressedLinkOwnerView == null) {
            return;
        }
        View view = this.pressedLinkOwnerView;
        this.links.clear();
        this.pressedLink = null;
        this.pressedLinkOwnerLayout = null;
        this.pressedLinkOwnerView = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public void openWebpageUrl(final String str, final String str2, final Browser.Progress progress) {
        Sheet sheet;
        Browser.Progress progress2 = this.loadingProgress;
        if (progress2 != null) {
            progress2.cancel();
        }
        this.loadingProgress = progress;
        if (this.openUrlReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.openUrlReqId, false);
            this.openUrlReqId = 0;
        }
        final boolean[] zArr = new boolean[1];
        if (Browser.openInExternalApp(this.parentActivity, str, false)) {
            if (!this.pagesStack.isEmpty() || (sheet = this.sheet) == null) {
                return;
            }
            sheet.dismiss(false);
            return;
        }
        final Utilities.Callback0Return callback0Return = new Utilities.Callback0Return() {
            @Override
            public final Object run() {
                Boolean lambda$openWebpageUrl$7;
                lambda$openWebpageUrl$7 = ArticleViewer.this.lambda$openWebpageUrl$7(str, zArr, progress);
                return lambda$openWebpageUrl$7;
            }
        };
        final int i = this.lastReqId + 1;
        this.lastReqId = i;
        showProgressView(true, true);
        final TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage = new TLRPC$TL_messages_getWebPage();
        tLRPC$TL_messages_getWebPage.url = str;
        tLRPC$TL_messages_getWebPage.hash = 0;
        this.openUrlReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getWebPage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ArticleViewer.this.lambda$openWebpageUrl$9(i, progress, str2, callback0Return, tLRPC$TL_messages_getWebPage, tLObject, tLRPC$TL_error);
            }
        });
        if (progress != null) {
            progress.onCancel(new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.this.lambda$openWebpageUrl$10(i, progress);
                }
            });
            progress.init();
        }
    }

    public Boolean lambda$openWebpageUrl$7(String str, boolean[] zArr, final Browser.Progress progress) {
        if (!Browser.isInternalUri(Uri.parse(str), zArr)) {
            return Boolean.FALSE;
        }
        if (progress != null) {
            progress.onEnd(new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.this.lambda$openWebpageUrl$6(progress);
                }
            });
        } else {
            Sheet sheet = this.sheet;
            if (sheet != null) {
                sheet.dismiss(true);
            }
        }
        Browser.openUrl(this.parentActivity, Uri.parse(str), true, true, false, progress, null, true);
        return Boolean.TRUE;
    }

    public void lambda$openWebpageUrl$6(Browser.Progress progress) {
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.dismiss(true);
        }
        if (this.loadingProgress == progress) {
            this.loadingProgress = null;
        }
    }

    public void lambda$openWebpageUrl$9(final int i, final Browser.Progress progress, final String str, final Utilities.Callback0Return callback0Return, final TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$openWebpageUrl$8(i, progress, tLObject, str, callback0Return, tLRPC$TL_messages_getWebPage);
            }
        });
    }

    public void lambda$openWebpageUrl$8(int i, Browser.Progress progress, TLObject tLObject, String str, Utilities.Callback0Return callback0Return, TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage) {
        if (this.openUrlReqId == 0 || i != this.lastReqId) {
            return;
        }
        if (progress != null) {
            progress.end();
        }
        this.openUrlReqId = 0;
        showProgressView(true, false);
        if (this.isVisible) {
            if (tLObject instanceof TLRPC$TL_messages_webPage) {
                TLRPC$TL_messages_webPage tLRPC$TL_messages_webPage = (TLRPC$TL_messages_webPage) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_messages_webPage.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(tLRPC$TL_messages_webPage.chats, false);
                TLRPC$WebPage tLRPC$WebPage = tLRPC$TL_messages_webPage.webpage;
                if (tLRPC$WebPage != null && (tLRPC$WebPage.cached_page instanceof TLRPC$TL_page)) {
                    addPageToStack(tLRPC$WebPage, str, 1);
                    return;
                } else {
                    if (((Boolean) callback0Return.run()).booleanValue()) {
                        return;
                    }
                    addPageToStack(tLRPC$TL_messages_getWebPage.url, 1);
                    return;
                }
            }
            if (tLObject instanceof TLRPC$TL_webPage) {
                TLRPC$TL_webPage tLRPC$TL_webPage = (TLRPC$TL_webPage) tLObject;
                if (tLRPC$TL_webPage.cached_page instanceof TLRPC$TL_page) {
                    addPageToStack(tLRPC$TL_webPage, str, 1);
                    return;
                }
            }
            if (((Boolean) callback0Return.run()).booleanValue()) {
                return;
            }
            addPageToStack(tLRPC$TL_messages_getWebPage.url, 1);
        }
    }

    public void lambda$openWebpageUrl$10(int i, Browser.Progress progress) {
        if (this.lastReqId == i && this.openUrlReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.openUrlReqId, false);
            this.openUrlReqId = 0;
        }
        if (this.loadingProgress == progress) {
            this.loadingProgress = null;
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        BlockAudioCell blockAudioCell;
        MessageObject messageObject;
        if (i == NotificationCenter.messagePlayingDidStart) {
            if (this.pages == null) {
                return;
            }
            int i3 = 0;
            while (true) {
                PageLayout[] pageLayoutArr = this.pages;
                if (i3 >= pageLayoutArr.length) {
                    return;
                }
                int childCount = pageLayoutArr[i3].listView.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.pages[i3].listView.getChildAt(i4);
                    if (childAt instanceof BlockAudioCell) {
                        ((BlockAudioCell) childAt).updateButtonState(true);
                    }
                }
                i3++;
            }
        } else if (i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.messagePlayingPlayStateChanged) {
            if (this.pages == null) {
                return;
            }
            int i5 = 0;
            while (true) {
                PageLayout[] pageLayoutArr2 = this.pages;
                if (i5 >= pageLayoutArr2.length) {
                    return;
                }
                int childCount2 = pageLayoutArr2[i5].listView.getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt2 = this.pages[i5].listView.getChildAt(i6);
                    if (childAt2 instanceof BlockAudioCell) {
                        BlockAudioCell blockAudioCell2 = (BlockAudioCell) childAt2;
                        if (blockAudioCell2.getMessageObject() != null) {
                            blockAudioCell2.updateButtonState(true);
                        }
                    }
                }
                i5++;
            }
        } else {
            if (i != NotificationCenter.messagePlayingProgressDidChanged) {
                return;
            }
            Integer num = (Integer) objArr[0];
            if (this.pages == null) {
                return;
            }
            int i7 = 0;
            while (true) {
                PageLayout[] pageLayoutArr3 = this.pages;
                if (i7 >= pageLayoutArr3.length) {
                    return;
                }
                int childCount3 = pageLayoutArr3[i7].listView.getChildCount();
                int i8 = 0;
                while (true) {
                    if (i8 < childCount3) {
                        View childAt3 = this.pages[i7].listView.getChildAt(i8);
                        if ((childAt3 instanceof BlockAudioCell) && (messageObject = (blockAudioCell = (BlockAudioCell) childAt3).getMessageObject()) != null && messageObject.getId() == num.intValue()) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (playingMessageObject != null) {
                                messageObject.audioProgress = playingMessageObject.audioProgress;
                                messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                                blockAudioCell.updatePlayingMessageProgress();
                            }
                        } else {
                            i8++;
                        }
                    }
                }
                i7++;
            }
        }
    }

    public void updateThemeColors(float f) {
        refreshThemeColors();
        updatePaintColors();
        if (this.windowView != null) {
            this.pages[0].listView.invalidateViews();
            this.pages[1].listView.invalidateViews();
            this.windowView.invalidate();
            this.searchPanel.invalidate();
            if (f == 1.0f) {
                this.pages[0].adapter.notifyDataSetChanged();
                this.pages[1].adapter.notifyDataSetChanged();
            }
        }
    }

    public void updatePaintSize() {
        for (int i = 0; i < 2; i++) {
            this.pages[i].adapter.notifyDataSetChanged();
            this.pages[i].adapter.resetCachedHeights();
        }
    }

    private void updatePaintFonts() {
        int i = 0;
        ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", this.selectedFont).commit();
        int i2 = this.selectedFont;
        Typeface typeface = i2 == 0 ? Typeface.DEFAULT : Typeface.SERIF;
        Typeface typeface2 = i2 == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
        Typeface bold = this.selectedFont == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
        Typeface typeface3 = this.selectedFont == 0 ? AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf") : Typeface.create("serif", 3);
        int i3 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray = quoteTextPaints;
            if (i3 >= sparseArray.size()) {
                break;
            }
            updateFontEntry(sparseArray.keyAt(i3), sparseArray.valueAt(i3), typeface, typeface3, bold, typeface2);
            i3++;
        }
        int i4 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray2 = preformattedTextPaints;
            if (i4 >= sparseArray2.size()) {
                break;
            }
            updateFontEntry(sparseArray2.keyAt(i4), sparseArray2.valueAt(i4), typeface, typeface3, bold, typeface2);
            i4++;
        }
        int i5 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray3 = paragraphTextPaints;
            if (i5 >= sparseArray3.size()) {
                break;
            }
            updateFontEntry(sparseArray3.keyAt(i5), sparseArray3.valueAt(i5), typeface, typeface3, bold, typeface2);
            i5++;
        }
        int i6 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray4 = listTextPaints;
            if (i6 >= sparseArray4.size()) {
                break;
            }
            updateFontEntry(sparseArray4.keyAt(i6), sparseArray4.valueAt(i6), typeface, typeface3, bold, typeface2);
            i6++;
        }
        int i7 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray5 = embedPostTextPaints;
            if (i7 >= sparseArray5.size()) {
                break;
            }
            updateFontEntry(sparseArray5.keyAt(i7), sparseArray5.valueAt(i7), typeface, typeface3, bold, typeface2);
            i7++;
        }
        int i8 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray6 = mediaCaptionTextPaints;
            if (i8 >= sparseArray6.size()) {
                break;
            }
            updateFontEntry(sparseArray6.keyAt(i8), sparseArray6.valueAt(i8), typeface, typeface3, bold, typeface2);
            i8++;
        }
        int i9 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray7 = mediaCreditTextPaints;
            if (i9 >= sparseArray7.size()) {
                break;
            }
            updateFontEntry(sparseArray7.keyAt(i9), sparseArray7.valueAt(i9), typeface, typeface3, bold, typeface2);
            i9++;
        }
        int i10 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray8 = photoCaptionTextPaints;
            if (i10 >= sparseArray8.size()) {
                break;
            }
            updateFontEntry(sparseArray8.keyAt(i10), sparseArray8.valueAt(i10), typeface, typeface3, bold, typeface2);
            i10++;
        }
        int i11 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray9 = photoCreditTextPaints;
            if (i11 >= sparseArray9.size()) {
                break;
            }
            updateFontEntry(sparseArray9.keyAt(i11), sparseArray9.valueAt(i11), typeface, typeface3, bold, typeface2);
            i11++;
        }
        int i12 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray10 = authorTextPaints;
            if (i12 >= sparseArray10.size()) {
                break;
            }
            updateFontEntry(sparseArray10.keyAt(i12), sparseArray10.valueAt(i12), typeface, typeface3, bold, typeface2);
            i12++;
        }
        int i13 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray11 = footerTextPaints;
            if (i13 >= sparseArray11.size()) {
                break;
            }
            updateFontEntry(sparseArray11.keyAt(i13), sparseArray11.valueAt(i13), typeface, typeface3, bold, typeface2);
            i13++;
        }
        int i14 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray12 = embedPostCaptionTextPaints;
            if (i14 >= sparseArray12.size()) {
                break;
            }
            updateFontEntry(sparseArray12.keyAt(i14), sparseArray12.valueAt(i14), typeface, typeface3, bold, typeface2);
            i14++;
        }
        int i15 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray13 = relatedArticleTextPaints;
            if (i15 >= sparseArray13.size()) {
                break;
            }
            updateFontEntry(sparseArray13.keyAt(i15), sparseArray13.valueAt(i15), typeface, typeface3, bold, typeface2);
            i15++;
        }
        int i16 = 0;
        while (true) {
            SparseArray<TextPaint> sparseArray14 = detailsTextPaints;
            if (i16 >= sparseArray14.size()) {
                break;
            }
            updateFontEntry(sparseArray14.keyAt(i16), sparseArray14.valueAt(i16), typeface, typeface3, bold, typeface2);
            i16++;
        }
        while (true) {
            SparseArray<TextPaint> sparseArray15 = tableTextPaints;
            if (i >= sparseArray15.size()) {
                return;
            }
            updateFontEntry(sparseArray15.keyAt(i), sparseArray15.valueAt(i), typeface, typeface3, bold, typeface2);
            i++;
        }
    }

    private void updateFontEntry(int i, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 2) != 0) {
            textPaint.setTypeface(typeface2);
            return;
        }
        if (i2 != 0) {
            textPaint.setTypeface(typeface3);
        } else if ((i & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else {
            if ((i & 4) != 0) {
                return;
            }
            textPaint.setTypeface(typeface);
        }
    }

    private void updatePaintColors() {
        this.backgroundPaint.setColor(getThemedColor(Theme.key_iv_background));
        TextPaint textPaint = listTextPointerPaint;
        if (textPaint != null) {
            textPaint.setColor(getTextColor());
        }
        TextPaint textPaint2 = listTextNumPaint;
        if (textPaint2 != null) {
            textPaint2.setColor(getTextColor());
        }
        TextPaint textPaint3 = embedPostAuthorPaint;
        if (textPaint3 != null) {
            textPaint3.setColor(getTextColor());
        }
        TextPaint textPaint4 = channelNamePaint;
        if (textPaint4 != null) {
            textPaint4.setColor(getTextColor());
        }
        TextPaint textPaint5 = channelNamePhotoPaint;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = relatedArticleHeaderPaint;
        if (textPaint6 != null) {
            textPaint6.setColor(getTextColor());
        }
        TextPaint textPaint7 = relatedArticleTextPaint;
        if (textPaint7 != null) {
            textPaint7.setColor(getGrayTextColor());
        }
        TextPaint textPaint8 = embedPostDatePaint;
        if (textPaint8 != null) {
            textPaint8.setColor(getGrayTextColor());
        }
        createPaint(true);
        setMapColors(titleTextPaints);
        setMapColors(kickerTextPaints);
        setMapColors(subtitleTextPaints);
        setMapColors(headerTextPaints);
        setMapColors(subheaderTextPaints);
        setMapColors(quoteTextPaints);
        setMapColors(preformattedTextPaints);
        setMapColors(paragraphTextPaints);
        setMapColors(listTextPaints);
        setMapColors(embedPostTextPaints);
        setMapColors(mediaCaptionTextPaints);
        setMapColors(mediaCreditTextPaints);
        setMapColors(photoCaptionTextPaints);
        setMapColors(photoCreditTextPaints);
        setMapColors(authorTextPaints);
        setMapColors(footerTextPaints);
        setMapColors(embedPostCaptionTextPaints);
        setMapColors(relatedArticleTextPaints);
        setMapColors(detailsTextPaints);
        setMapColors(tableTextPaints);
    }

    private void setMapColors(SparseArray<TextPaint> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            TextPaint valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                if ((keyAt & 8) != 0 || (keyAt & 512) != 0) {
                    valueAt.setColor(getLinkTextColor());
                } else {
                    valueAt.setColor(getTextColor());
                }
            }
        }
    }

    public void setParentActivity(final Activity activity, BaseFragment baseFragment) {
        this.parentFragment = baseFragment;
        int currentAccount = (baseFragment == null || (baseFragment instanceof EmptyBaseFragment)) ? UserConfig.selectedAccount : baseFragment.getCurrentAccount();
        this.currentAccount = currentAccount;
        NotificationCenter.getInstance(currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        if (this.parentActivity == activity) {
            updatePaintColors();
            refreshThemeColors();
            return;
        }
        this.parentActivity = activity;
        this.selectedFont = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
        createPaint(false);
        this.backgroundPaint = new Paint();
        this.layerShadowDrawable = activity.getResources().getDrawable(R.drawable.layer_shadow);
        this.slideDotDrawable = activity.getResources().getDrawable(R.drawable.slide_dot_small);
        this.slideDotBigDrawable = activity.getResources().getDrawable(R.drawable.slide_dot_big);
        this.scrimPaint = new Paint();
        WindowView windowView = new WindowView(activity);
        this.windowView = windowView;
        windowView.setWillNotDraw(false);
        this.windowView.setClipChildren(true);
        this.windowView.setFocusable(false);
        FrameLayout frameLayout = new FrameLayout(activity) {
            @Override
            protected boolean drawChild(android.graphics.Canvas r13, android.view.View r14, long r15) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.AnonymousClass12.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
            }

            @Override
            public void invalidate() {
                super.invalidate();
            }
        };
        this.containerView = frameLayout;
        this.windowView.addView(frameLayout, LayoutHelper.createFrame(-1, -1, 51));
        if (Build.VERSION.SDK_INT >= 21 && this.sheet == null) {
            this.windowView.setFitsSystemWindows(true);
            this.containerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets lambda$setParentActivity$11;
                    lambda$setParentActivity$11 = ArticleViewer.lambda$setParentActivity$11(view, windowInsets);
                    return lambda$setParentActivity$11;
                }
            });
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.fullscreenVideoContainer = frameLayout2;
        frameLayout2.setBackgroundColor(-16777216);
        this.fullscreenVideoContainer.setVisibility(4);
        this.windowView.addView(this.fullscreenVideoContainer, LayoutHelper.createFrame(-1, -1.0f));
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(activity);
        this.fullscreenAspectRatioView = aspectRatioFrameLayout;
        aspectRatioFrameLayout.setVisibility(0);
        this.fullscreenAspectRatioView.setBackgroundColor(-16777216);
        this.fullscreenVideoContainer.addView(this.fullscreenAspectRatioView, LayoutHelper.createFrame(-1, -1, 17));
        this.fullscreenTextureView = new TextureView(activity);
        this.pages = new PageLayout[2];
        int i = 0;
        while (true) {
            PageLayout[] pageLayoutArr = this.pages;
            if (i >= pageLayoutArr.length) {
                break;
            }
            final PageLayout pageLayout = new PageLayout(activity, getResourcesProvider());
            pageLayoutArr[i] = pageLayout;
            pageLayout.setVisibility(i == 0 ? 0 : 8);
            FrameLayout frameLayout3 = this.containerView;
            Sheet sheet = this.sheet;
            frameLayout3.addView(pageLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, (sheet == null || sheet.halfSize()) ? 0.0f : 56.0f, 0.0f, 0.0f));
            pageLayout.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
                @Override
                public final boolean onItemClick(View view, int i2) {
                    boolean lambda$setParentActivity$12;
                    lambda$setParentActivity$12 = ArticleViewer.this.lambda$setParentActivity$12(view, i2);
                    return lambda$setParentActivity$12;
                }
            });
            pageLayout.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
                @Override
                public boolean hasDoubleTap(View view, int i2) {
                    return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i2);
                }

                @Override
                public void onDoubleTap(View view, int i2, float f, float f2) {
                    RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i2, f, f2);
                }

                @Override
                public final void onItemClick(View view, int i2, float f, float f2) {
                    ArticleViewer.this.lambda$setParentActivity$15(pageLayout, view, i2, f, f2);
                }
            });
            i++;
        }
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.bulletinContainer = frameLayout4;
        FrameLayout frameLayout5 = this.containerView;
        Sheet sheet2 = this.sheet;
        frameLayout5.addView(frameLayout4, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, (sheet2 == null || sheet2.halfSize()) ? 0.0f : 56.0f, 0.0f, 0.0f));
        this.headerPaint.setColor(-16777216);
        this.statusBarPaint.setColor(-16777216);
        this.headerProgressPaint.setColor(-14408666);
        this.navigationBarPaint.setColor(-16777216);
        WebActionBar webActionBar = new WebActionBar(activity, getResourcesProvider()) {
            @Override
            protected void onSearchUpdated(String str) {
                ArticleViewer.this.processSearch(str.toLowerCase());
            }

            @Override
            protected void onColorsUpdated() {
                Sheet sheet3 = ArticleViewer.this.sheet;
                if (sheet3 != null) {
                    sheet3.checkNavColor();
                }
            }

            @Override
            protected void onScrolledProgress(float f) {
                ArticleViewer.this.pages[0].addProgress(f);
            }

            @Override
            protected void onAddressColorsChanged(int i2, int i3) {
                if (ArticleViewer.this.addressBarList != null) {
                    ArticleViewer.this.addressBarList.setColors(i2, i3);
                }
            }

            @Override
            protected void onAddressingProgress(float f) {
                super.onAddressingProgress(f);
                if (ArticleViewer.this.addressBarList != null) {
                    ArticleViewer.this.addressBarList.setOpenProgress(f);
                }
                Sheet sheet3 = ArticleViewer.this.sheet;
                if (sheet3 != null) {
                    sheet3.checkNavColor();
                }
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                ((ViewGroup.MarginLayoutParams) ArticleViewer.this.addressBarList.getLayoutParams()).topMargin = getMeasuredHeight();
            }

            @Override
            public void showAddress(boolean z, boolean z2) {
                super.showAddress(z, z2);
                if (ArticleViewer.this.addressBarList != null) {
                    ArticleViewer.this.addressBarList.setOpened(z);
                }
            }
        };
        this.actionBar = webActionBar;
        webActionBar.occupyStatusBar(this.sheet != null);
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        this.actionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ArticleViewer.this.lambda$setParentActivity$21(activity, view);
            }
        });
        this.actionBar.addressEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (ArticleViewer.this.actionBar.isAddressing() && ArticleViewer.this.addressBarList != null) {
                    ArticleViewer.this.addressBarList.setInput(editable == null ? null : editable.toString());
                }
            }
        });
        AddressBarList addressBarList = new AddressBarList(activity);
        this.addressBarList = addressBarList;
        addressBarList.setOpenProgress(0.0f);
        this.addressBarList.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                if (ArticleViewer.this.addressBarList.listView.scrollingByUser) {
                    AndroidUtilities.hideKeyboard(ArticleViewer.this.actionBar.addressEditText);
                }
            }
        });
        this.containerView.addView(this.addressBarList, LayoutHelper.createFrame(-1, -1.0f));
        this.lineProgressTickRunnable = new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$setParentActivity$22();
            }
        };
        this.actionBar.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ArticleViewer.this.lambda$setParentActivity$23(view);
            }
        });
        this.actionBar.backButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean lambda$setParentActivity$29;
                lambda$setParentActivity$29 = ArticleViewer.this.lambda$setParentActivity$29(view);
                return lambda$setParentActivity$29;
            }
        });
        this.actionBar.setMenuListener(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArticleViewer.this.lambda$setParentActivity$39(activity, (Integer) obj);
            }
        });
        this.actionBar.forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ArticleViewer.this.lambda$setParentActivity$40(view);
            }
        });
        FrameLayout frameLayout6 = new FrameLayout(this.parentActivity) {
            @Override
            public void onDraw(Canvas canvas) {
                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                Theme.chat_composeShadowDrawable.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), Theme.chat_composeBackgroundPaint);
            }
        };
        this.searchPanel = frameLayout6;
        frameLayout6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$setParentActivity$41;
                lambda$setParentActivity$41 = ArticleViewer.lambda$setParentActivity$41(view, motionEvent);
                return lambda$setParentActivity$41;
            }
        });
        this.searchPanel.setWillNotDraw(false);
        this.searchPanel.setTranslationY(AndroidUtilities.dp(51.0f));
        this.searchPanel.setVisibility(4);
        this.searchPanel.setFocusable(true);
        this.searchPanel.setFocusableInTouchMode(true);
        this.searchPanel.setClickable(true);
        this.searchPanel.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.containerView.addView(this.searchPanel, LayoutHelper.createFrame(-1, 51, 80));
        new KeyboardNotifier(this.windowView, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ArticleViewer.this.lambda$setParentActivity$42((Integer) obj);
            }
        });
        ImageView imageView = new ImageView(this.parentActivity);
        this.searchUpButton = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.searchUpButton.setImageResource(R.drawable.msg_go_up);
        ImageView imageView2 = this.searchUpButton;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        int themedColor = getThemedColor(i2);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ImageView imageView3 = this.searchUpButton;
        int i3 = Theme.key_actionBarActionModeDefaultSelector;
        imageView3.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i3), 1));
        this.searchPanel.addView(this.searchUpButton, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.searchUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ArticleViewer.this.lambda$setParentActivity$43(view);
            }
        });
        this.searchUpButton.setContentDescription(LocaleController.getString("AccDescrSearchNext", R.string.AccDescrSearchNext));
        ImageView imageView4 = new ImageView(this.parentActivity);
        this.searchDownButton = imageView4;
        imageView4.setScaleType(scaleType);
        this.searchDownButton.setImageResource(R.drawable.msg_go_down);
        this.searchDownButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), mode));
        this.searchDownButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i3), 1));
        this.searchPanel.addView(this.searchDownButton, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.searchDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ArticleViewer.this.lambda$setParentActivity$44(view);
            }
        });
        this.searchDownButton.setContentDescription(LocaleController.getString("AccDescrSearchPrev", R.string.AccDescrSearchPrev));
        AnimatedTextView animatedTextView = new AnimatedTextView(this.parentActivity, true, true, true);
        this.searchCountText = animatedTextView;
        animatedTextView.setScaleProperty(0.6f);
        this.searchCountText.setAnimationProperties(0.4f, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.searchCountText.setTextColor(getThemedColor(i2));
        this.searchCountText.setTextSize(AndroidUtilities.dp(15.0f));
        this.searchCountText.setTypeface(AndroidUtilities.bold());
        this.searchCountText.setGravity(3);
        this.searchCountText.getDrawable().setOverrideFullWidth(AndroidUtilities.displaySize.x);
        this.searchPanel.addView(this.searchCountText, LayoutHelper.createFrame(-2, -2.0f, 19, 18.0f, 0.0f, 108.0f, 0.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.windowLayoutParams = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 98;
        layoutParams.softInputMode = 48;
        layoutParams.flags = 131072;
        int color = this.sheet == null ? Theme.getColor(Theme.key_windowBackgroundGray, null, true) : getThemedColor(Theme.key_windowBackgroundGray);
        int i4 = (AndroidUtilities.computePerceivedBrightness(color) < 0.721f || Build.VERSION.SDK_INT < 26) ? 1792 : 1808;
        this.navigationBarPaint.setColor(color);
        WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
        layoutParams2.systemUiVisibility = i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 21) {
            layoutParams2.flags |= -2147417856;
            if (i5 >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper();
        this.textSelectionHelper = articleTextSelectionHelper;
        articleTextSelectionHelper.setParentView(this.pages[0].listView);
        if (MessagesController.getInstance(this.currentAccount).getTranslateController().isContextTranslateEnabled()) {
            this.textSelectionHelper.setOnTranslate(new TextSelectionHelper.OnTranslateListener() {
                @Override
                public final void run(CharSequence charSequence, String str, String str2, Runnable runnable) {
                    ArticleViewer.this.lambda$setParentActivity$45(charSequence, str, str2, runnable);
                }
            });
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper2 = this.textSelectionHelper;
        articleTextSelectionHelper2.layoutManager = this.pages[0].layoutManager;
        articleTextSelectionHelper2.setCallback(new TextSelectionHelper.Callback() {
            @Override
            public void onStateChanged(boolean z) {
                if (z) {
                    ArticleViewer.this.actionBar.showSearch(false, true);
                }
            }

            @Override
            public void onTextCopied() {
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    BulletinFactory.of(ArticleViewer.this.containerView, null).createCopyBulletin(LocaleController.getString("TextCopied", R.string.TextCopied)).show();
                }
            }
        });
        this.containerView.addView(this.textSelectionHelper.getOverlayView(activity));
        FrameLayout frameLayout7 = this.containerView;
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper(frameLayout7, frameLayout7);
        this.pinchToZoomHelper = pinchToZoomHelper;
        pinchToZoomHelper.setClipBoundsListener(new PinchToZoomHelper.ClipBoundsListener() {
            @Override
            public final void getClipTopBottom(float[] fArr) {
                ArticleViewer.this.lambda$setParentActivity$46(fArr);
            }
        });
        this.pinchToZoomHelper.setCallback(new PinchToZoomHelper.Callback() {
            @Override
            public TextureView getCurrentTextureView() {
                return PinchToZoomHelper.Callback.CC.$default$getCurrentTextureView(this);
            }

            @Override
            public void onZoomFinished(MessageObject messageObject) {
                PinchToZoomHelper.Callback.CC.$default$onZoomFinished(this, messageObject);
            }

            @Override
            public void onZoomStarted(MessageObject messageObject) {
                PageLayout pageLayout2 = ArticleViewer.this.pages[0];
                if (pageLayout2 != null) {
                    pageLayout2.listView.cancelClickRunnables(true);
                }
            }
        });
        updatePaintColors();
    }

    public static WindowInsets lambda$setParentActivity$11(View view, WindowInsets windowInsets) {
        WindowInsets consumeSystemWindowInsets;
        WindowInsets windowInsets2;
        if (Build.VERSION.SDK_INT >= 30) {
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
        consumeSystemWindowInsets = windowInsets.consumeSystemWindowInsets();
        return consumeSystemWindowInsets;
    }

    public boolean lambda$setParentActivity$12(View view, int i) {
        if (!(view instanceof BlockRelatedArticlesCell)) {
            return false;
        }
        BlockRelatedArticlesCell blockRelatedArticlesCell = (BlockRelatedArticlesCell) view;
        showCopyPopup(blockRelatedArticlesCell.currentBlock.parent.articles.get(blockRelatedArticlesCell.currentBlock.num).url);
        return true;
    }

    public void lambda$setParentActivity$15(PageLayout pageLayout, View view, int i, float f, float f2) {
        if (this.sheet == null || i - 1 >= 0) {
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
            if (articleTextSelectionHelper != null) {
                if (articleTextSelectionHelper.isInSelectionMode()) {
                    this.textSelectionHelper.clear();
                    return;
                }
                this.textSelectionHelper.clear();
            }
            WebpageAdapter adapter = pageLayout.getAdapter();
            if ((view instanceof ReportCell) && adapter.currentPage != null) {
                ReportCell reportCell = (ReportCell) view;
                if (this.previewsReqId == 0) {
                    if (!reportCell.hasViews || f >= view.getMeasuredWidth() / 2) {
                        TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat("previews");
                        if (!(userOrChat instanceof TLRPC$TL_user)) {
                            final int i2 = UserConfig.selectedAccount;
                            final long j = adapter.currentPage.id;
                            showProgressView(true, true);
                            TLRPC$TL_contacts_resolveUsername tLRPC$TL_contacts_resolveUsername = new TLRPC$TL_contacts_resolveUsername();
                            tLRPC$TL_contacts_resolveUsername.username = "previews";
                            this.previewsReqId = ConnectionsManager.getInstance(i2).sendRequest(tLRPC$TL_contacts_resolveUsername, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    ArticleViewer.this.lambda$setParentActivity$14(i2, j, tLObject, tLRPC$TL_error);
                                }
                            });
                            return;
                        }
                        openPreviewsChat((TLRPC$User) userOrChat, adapter.currentPage.id);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i < 0 || i >= adapter.localBlocks.size()) {
                return;
            }
            TLRPC$PageBlock tLRPC$PageBlock = (TLRPC$PageBlock) adapter.localBlocks.get(i);
            TLRPC$PageBlock lastNonListPageBlock = getLastNonListPageBlock(tLRPC$PageBlock);
            if (lastNonListPageBlock instanceof TL_pageBlockDetailsChild) {
                lastNonListPageBlock = ((TL_pageBlockDetailsChild) lastNonListPageBlock).block;
            }
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockChannel) {
                MessagesController.getInstance(this.currentAccount).openByUserName(ChatObject.getPublicUsername(((TLRPC$TL_pageBlockChannel) lastNonListPageBlock).channel), this.parentFragment, 2);
                close(false, true);
                return;
            }
            if (lastNonListPageBlock instanceof TL_pageBlockRelatedArticlesChild) {
                TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = (TL_pageBlockRelatedArticlesChild) lastNonListPageBlock;
                openWebpageUrl(tL_pageBlockRelatedArticlesChild.parent.articles.get(tL_pageBlockRelatedArticlesChild.num).url, null, null);
                return;
            }
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockDetails) {
                View lastNonListCell = getLastNonListCell(view);
                if (lastNonListCell instanceof BlockDetailsCell) {
                    this.pressedLinkOwnerLayout = null;
                    this.pressedLinkOwnerView = null;
                    if (adapter.blocks.indexOf(tLRPC$PageBlock) < 0) {
                        return;
                    }
                    TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = (TLRPC$TL_pageBlockDetails) lastNonListPageBlock;
                    tLRPC$TL_pageBlockDetails.open = !tLRPC$TL_pageBlockDetails.open;
                    int itemCount = adapter.getItemCount();
                    adapter.updateRows();
                    int abs = Math.abs(adapter.getItemCount() - itemCount);
                    BlockDetailsCell blockDetailsCell = (BlockDetailsCell) lastNonListCell;
                    blockDetailsCell.arrow.setAnimationProgressAnimated(tLRPC$TL_pageBlockDetails.open ? 0.0f : 1.0f);
                    blockDetailsCell.invalidate();
                    if (abs != 0) {
                        if (tLRPC$TL_pageBlockDetails.open) {
                            adapter.notifyItemRangeInserted(i + 1, abs);
                        } else {
                            adapter.notifyItemRangeRemoved(i + 1, abs);
                        }
                    }
                }
            }
        }
    }

    public void lambda$setParentActivity$14(final int i, final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$setParentActivity$13(tLObject, i, j);
            }
        });
    }

    public void lambda$setParentActivity$13(TLObject tLObject, int i, long j) {
        if (this.previewsReqId == 0) {
            return;
        }
        this.previewsReqId = 0;
        showProgressView(true, false);
        if (tLObject != null) {
            TLRPC$TL_contacts_resolvedPeer tLRPC$TL_contacts_resolvedPeer = (TLRPC$TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(i).putUsers(tLRPC$TL_contacts_resolvedPeer.users, false);
            MessagesStorage.getInstance(i).putUsersAndChats(tLRPC$TL_contacts_resolvedPeer.users, tLRPC$TL_contacts_resolvedPeer.chats, false, true);
            if (tLRPC$TL_contacts_resolvedPeer.users.isEmpty()) {
                return;
            }
            openPreviewsChat(tLRPC$TL_contacts_resolvedPeer.users.get(0), j);
        }
    }

    public void lambda$setParentActivity$21(final Activity activity, View view) {
        if (this.actionBar.longClicked) {
            return;
        }
        final PageLayout pageLayout = this.pages[0];
        if (pageLayout.isWeb()) {
            if (pageLayout.getWebView() == null || this.actionBar.isAddressing()) {
                return;
            }
            if (this.addressBarList != null) {
                BotWebViewContainer.MyWebView webView = pageLayout.getWebView();
                String title = webView != null ? webView.getTitle() : null;
                final String magic2tonsite = BotWebViewContainer.magic2tonsite(webView != null ? webView.getUrl() : null);
                AddressBarList addressBarList = this.addressBarList;
                Bitmap favicon = webView != null ? webView.getFavicon() : null;
                if (TextUtils.isEmpty(title)) {
                    title = LocaleController.getString(R.string.WebEmpty);
                }
                addressBarList.setCurrent(favicon, title, TextUtils.isEmpty(magic2tonsite) ? "about:blank" : magic2tonsite, new Runnable() {
                    @Override
                    public final void run() {
                        ArticleViewer.this.lambda$setParentActivity$16(magic2tonsite);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ArticleViewer.this.lambda$setParentActivity$17(pageLayout, activity, (String) obj);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ArticleViewer.this.lambda$setParentActivity$18((String) obj);
                    }
                }, new ArticleViewer$$ExternalSyntheticLambda44(this), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ArticleViewer.this.lambda$setParentActivity$19(magic2tonsite, pageLayout, view2);
                    }
                });
            }
            this.actionBar.showAddress("", new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ArticleViewer.lambda$setParentActivity$20(ArticleViewer.PageLayout.this, activity, (String) obj);
                }
            });
            return;
        }
        if (this.sheet != null) {
            SmoothScroller smoothScroller = new SmoothScroller(activity);
            if (this.sheet.halfSize()) {
                smoothScroller.setTargetPosition(1);
                smoothScroller.setOffset(-AndroidUtilities.dp(32.0f));
            } else {
                smoothScroller.setTargetPosition(0);
            }
            pageLayout.layoutManager.startSmoothScroll(smoothScroller);
            return;
        }
        pageLayout.listView.smoothScrollToPosition(0);
    }

    public void lambda$setParentActivity$16(String str) {
        EditTextBoldCursor editTextBoldCursor = this.actionBar.addressEditText;
        if (TextUtils.isEmpty(str)) {
            str = "about:blank";
        }
        editTextBoldCursor.setText(str);
        EditTextBoldCursor editTextBoldCursor2 = this.actionBar.addressEditText;
        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
        AndroidUtilities.showKeyboard(this.actionBar.addressEditText);
    }

    public void lambda$setParentActivity$17(PageLayout pageLayout, Activity activity, String str) {
        if (TextUtils.isEmpty(str) || pageLayout.getWebView() == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.trim());
        AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        int length = spannableStringBuilder.length();
        int i = 0;
        for (int i2 = 0; i2 < uRLSpanArr.length; i2++) {
            length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i2]), length);
            i = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i2]), i);
        }
        this.actionBar.showAddress(false, true);
        Uri uriParseSafe = Utilities.uriParseSafe(str);
        if ((uRLSpanArr.length > 0 && length == 0 && i > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                str = Browser.replace(uriParseSafe, "https", uriParseSafe.getPath(), "/");
            }
            pageLayout.getWebView().loadUrl(str);
            return;
        }
        AddressBarList.pushRecentSearch(activity, str);
        pageLayout.getWebView().loadUrl(SearchEngine.getCurrent().getSearchURL(str));
    }

    public void lambda$setParentActivity$18(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.actionBar.addressEditText.setText(str);
        EditTextBoldCursor editTextBoldCursor = this.actionBar.addressEditText;
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
        AndroidUtilities.showKeyboard(this.actionBar.addressEditText);
    }

    public void lambda$setParentActivity$19(String str, PageLayout pageLayout, View view) {
        this.actionBar.showAddress(false, true);
        AndroidUtilities.hideKeyboard(this.actionBar.addressEditText);
        if (TextUtils.isEmpty(str)) {
            str = "about:blank";
        }
        AndroidUtilities.addToClipboard(str);
        BulletinFactory.of(pageLayout.webViewContainer, getResourcesProvider()).createCopyLinkBulletin().show(true);
    }

    public static void lambda$setParentActivity$20(PageLayout pageLayout, Activity activity, String str) {
        if (TextUtils.isEmpty(str) || pageLayout.getWebView() == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.trim());
        AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        int length = spannableStringBuilder.length();
        int i = 0;
        for (int i2 = 0; i2 < uRLSpanArr.length; i2++) {
            length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i2]), length);
            i = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i2]), i);
        }
        Uri uriParseSafe = Utilities.uriParseSafe(str);
        if ((uRLSpanArr.length > 0 && length == 0 && i > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
            if (uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                str = Browser.replace(uriParseSafe, "https", uriParseSafe.getPath(), "/");
            }
            pageLayout.getWebView().loadUrl(str);
            return;
        }
        AddressBarList.pushRecentSearch(activity, str);
        pageLayout.getWebView().loadUrl(SearchEngine.getCurrent().getSearchURL(str));
    }

    public void lambda$setParentActivity$22() {
        float currentProgress = 0.7f - this.actionBar.lineProgressView.getCurrentProgress();
        if (currentProgress > 0.0f) {
            float f = currentProgress < 0.25f ? 0.01f : 0.02f;
            LineProgressView lineProgressView = this.actionBar.lineProgressView;
            lineProgressView.setProgress(lineProgressView.getCurrentProgress() + f, true);
            AndroidUtilities.runOnUIThread(this.lineProgressTickRunnable, 100L);
        }
    }

    public void lambda$setParentActivity$23(View view) {
        if (this.actionBar.isSearching()) {
            this.actionBar.showSearch(false, true);
            return;
        }
        if (this.actionBar.isAddressing()) {
            this.actionBar.showAddress(false, true);
            return;
        }
        if (isFirstArticle() && this.pages[0].hasBackButton()) {
            this.pages[0].back();
            return;
        }
        if (this.pagesStack.size() > 1) {
            goBack();
            return;
        }
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.dismiss(false);
        } else {
            close(true, true);
        }
    }

    public boolean lambda$setParentActivity$29(View view) {
        if (this.pages[0] == null) {
            return false;
        }
        final float rotation = this.actionBar.backButtonDrawable.getRotation();
        Sheet sheet = this.sheet;
        final ItemOptions makeOptions = ItemOptions.makeOptions(sheet != null ? sheet.windowView : this.windowView, view);
        int color = SharedConfig.adaptableColorInBrowser ? Theme.getColor(Theme.key_iv_background) : this.pages[0].getBackgroundColor();
        int color2 = SharedConfig.adaptableColorInBrowser ? Theme.getColor(Theme.key_windowBackgroundWhiteBlackText) : AndroidUtilities.computePerceivedBrightness(this.pages[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
        int multAlpha = Theme.multAlpha(color2, 0.65f);
        final BotWebViewContainer.MyWebView webView = this.pages[0].getWebView();
        int i = 3;
        if (webView != null) {
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            final int currentIndex = copyBackForwardList.getCurrentIndex();
            if (copyBackForwardList.getCurrentIndex() > 0) {
                final int i2 = 0;
                while (i2 < currentIndex) {
                    WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i2);
                    makeOptions.add(itemAtIndex.getTitle(), new Runnable() {
                        @Override
                        public final void run() {
                            ArticleViewer.lambda$setParentActivity$24(currentIndex, i2, webView);
                        }
                    });
                    ActionBarMenuSubItem last = makeOptions.getLast();
                    if (last != null) {
                        last.setSubtext(itemAtIndex.getUrl());
                        final Bitmap favicon = webView.getFavicon(itemAtIndex.getUrl());
                        if (favicon == null) {
                            favicon = itemAtIndex.getFavicon();
                        }
                        final Paint paint = new Paint(i);
                        last.setTextAndIcon(itemAtIndex.getTitle(), 0, new Drawable() {
                            @Override
                            public int getOpacity() {
                                return -2;
                            }

                            @Override
                            public void setAlpha(int i3) {
                            }

                            @Override
                            public void setColorFilter(ColorFilter colorFilter) {
                            }

                            @Override
                            public void draw(Canvas canvas) {
                                if (favicon != null) {
                                    canvas.save();
                                    canvas.translate(getBounds().left, getBounds().top);
                                    canvas.scale(getBounds().width() / favicon.getWidth(), getBounds().height() / favicon.getHeight());
                                    canvas.drawBitmap(favicon, 0.0f, 0.0f, paint);
                                    canvas.restore();
                                }
                            }

                            @Override
                            public int getIntrinsicHeight() {
                                return AndroidUtilities.dp(24.0f);
                            }

                            @Override
                            public int getIntrinsicWidth() {
                                return AndroidUtilities.dp(24.0f);
                            }
                        });
                        last.setTextColor(color2);
                        last.setSubtextColor(multAlpha);
                    }
                    i2++;
                    i = 3;
                }
            }
        }
        for (final int size = this.pagesStack.size() - 2; size >= 0; size--) {
            Object obj = this.pagesStack.get(size);
            if (obj instanceof CachedWeb) {
                CachedWeb cachedWeb = (CachedWeb) obj;
                makeOptions.add(cachedWeb.getTitle(), new Runnable() {
                    @Override
                    public final void run() {
                        ArticleViewer.this.lambda$setParentActivity$25(size);
                    }
                });
                ActionBarMenuSubItem last2 = makeOptions.getLast();
                if (last2 != null) {
                    last2.setSubtext(cachedWeb.lastUrl);
                    final Bitmap favicon2 = webView != null ? webView.getFavicon(cachedWeb.lastUrl) : null;
                    if (favicon2 == null) {
                        favicon2 = cachedWeb.favicon;
                    }
                    final Paint paint2 = new Paint(3);
                    last2.setTextAndIcon(cachedWeb.getTitle(), 0, new Drawable() {
                        @Override
                        public int getOpacity() {
                            return -2;
                        }

                        @Override
                        public void setAlpha(int i3) {
                        }

                        @Override
                        public void setColorFilter(ColorFilter colorFilter) {
                        }

                        @Override
                        public void draw(Canvas canvas) {
                            if (favicon2 != null) {
                                canvas.save();
                                canvas.translate(getBounds().left, getBounds().top);
                                canvas.scale(getBounds().width() / favicon2.getWidth(), getBounds().height() / favicon2.getHeight());
                                canvas.drawBitmap(favicon2, 0.0f, 0.0f, paint2);
                                canvas.restore();
                            }
                        }

                        @Override
                        public int getIntrinsicHeight() {
                            return AndroidUtilities.dp(24.0f);
                        }

                        @Override
                        public int getIntrinsicWidth() {
                            return AndroidUtilities.dp(24.0f);
                        }
                    });
                    last2.setTextColor(color2);
                    last2.setSubtextColor(multAlpha);
                    last2.setColors(color2, color2);
                }
            } else if (obj instanceof TLRPC$WebPage) {
                TLRPC$WebPage tLRPC$WebPage = (TLRPC$WebPage) obj;
                makeOptions.add(tLRPC$WebPage.title, new Runnable() {
                    @Override
                    public final void run() {
                        ArticleViewer.this.lambda$setParentActivity$26(size);
                    }
                });
                ActionBarMenuSubItem last3 = makeOptions.getLast();
                if (last3 != null) {
                    last3.setTextAndIcon(tLRPC$WebPage.title, R.drawable.msg_instant);
                    last3.setTextColor(color2);
                    if (!TextUtils.isEmpty(tLRPC$WebPage.site_name)) {
                        last3.setSubtext(tLRPC$WebPage.site_name);
                    }
                    last3.setSubtextColor(multAlpha);
                    last3.imageView.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                    last3.imageView.setScaleX(1.45f);
                    last3.imageView.setScaleY(1.45f);
                    last3.setColors(color2, color2);
                }
            }
        }
        makeOptions.setScrimViewBackground(Theme.createCircleDrawable(AndroidUtilities.dp(40.0f), this.actionBar.getBackgroundColor()));
        makeOptions.setBackgroundColor(color);
        makeOptions.updateColors();
        if (makeOptions.getItemsCount() <= 0) {
            return false;
        }
        checkScrollAnimated(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$setParentActivity$28(makeOptions, rotation);
            }
        });
        return true;
    }

    public static void lambda$setParentActivity$24(int i, int i2, BotWebViewContainer.MyWebView myWebView) {
        for (int i3 = 0; i3 < i - i2; i3++) {
            myWebView.goBack();
        }
    }

    public void lambda$setParentActivity$28(ItemOptions itemOptions, final float f) {
        this.actionBar.backButtonDrawable.setRotation(0.0f, true);
        itemOptions.setOnDismiss(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$setParentActivity$27(f);
            }
        });
        itemOptions.show();
    }

    public void lambda$setParentActivity$27(float f) {
        this.actionBar.backButtonDrawable.setRotation(f, true);
    }

    public void lambda$setParentActivity$39(Activity activity, Integer num) {
        final String str;
        String str2;
        String str3;
        FrameLayout frameLayout;
        String str4;
        if ((this.pages[0].isArticle() && this.pages[0].adapter.currentPage == null) || this.parentActivity == null) {
            return;
        }
        if (num.intValue() == 1) {
            this.actionBar.showSearch(true, true);
            return;
        }
        if (num.intValue() == 2) {
            if (this.pages[0].isWeb()) {
                if (this.pages[0].getWebView() == null) {
                    return;
                } else {
                    str4 = this.pages[0].getWebView().getUrl();
                }
            } else if (this.pages[0].adapter.currentPage == null) {
                return;
            } else {
                str4 = this.pages[0].adapter.currentPage.url;
            }
            String magic2tonsite = BotWebViewContainer.magic2tonsite(str4);
            showDialog(new ShareAlert(this.parentActivity, null, magic2tonsite, false, magic2tonsite, false, AndroidUtilities.computePerceivedBrightness(this.actionBar.getBackgroundColor()) < 0.721f ? new DarkThemeResourceProvider() : null));
            return;
        }
        if (num.intValue() == 6) {
            if (this.pages[0].isWeb()) {
                if (this.pages[0].getWebView() == null) {
                    return;
                }
                str3 = this.pages[0].getWebView().getUrl();
                frameLayout = this.pages[0].webViewContainer;
            } else {
                if (this.pages[0].adapter.currentPage == null) {
                    return;
                }
                str3 = this.pages[0].adapter.currentPage.url;
                frameLayout = this.pages[0];
            }
            String magic2tonsite2 = BotWebViewContainer.magic2tonsite(str3);
            final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(magic2tonsite2, clientUserId));
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
            tLRPC$TL_message.peer_id = tLRPC$TL_peerUser;
            tLRPC$TL_peerUser.user_id = clientUserId;
            TLRPC$TL_peerUser tLRPC$TL_peerUser2 = new TLRPC$TL_peerUser();
            tLRPC$TL_message.from_id = tLRPC$TL_peerUser2;
            tLRPC$TL_peerUser2.user_id = clientUserId;
            tLRPC$TL_message.message = magic2tonsite2;
            TLRPC$TL_messageMediaWebPage tLRPC$TL_messageMediaWebPage = new TLRPC$TL_messageMediaWebPage();
            tLRPC$TL_message.media = tLRPC$TL_messageMediaWebPage;
            tLRPC$TL_messageMediaWebPage.webpage = new TLRPC$TL_webPage();
            TLRPC$WebPage tLRPC$WebPage = tLRPC$TL_message.media.webpage;
            tLRPC$WebPage.url = magic2tonsite2;
            tLRPC$WebPage.display_url = magic2tonsite2;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.bookmarkAdded, new MessageObject(this.currentAccount, tLRPC$TL_message, false, false));
            BulletinFactory.of(frameLayout, getResourcesProvider()).createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.this.lambda$setParentActivity$30(clientUserId);
                }
            })).show(true);
            return;
        }
        if (num.intValue() == 7) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.showAsSheet(new BookmarksFragment(this.sheet != null ? new Runnable() {
                    @Override
                    public final void run() {
                        ArticleViewer.this.lambda$setParentActivity$31();
                    }
                } : null, new ArticleViewer$$ExternalSyntheticLambda44(this)), bottomSheetParams);
                return;
            }
            return;
        }
        if (num.intValue() == 8) {
            BaseFragment.BottomSheetParams bottomSheetParams2 = new BaseFragment.BottomSheetParams();
            bottomSheetParams2.transitionFromLeft = true;
            BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment2 != null) {
                safeLastFragment2.showAsSheet(new HistoryFragment(this.sheet != null ? new Runnable() {
                    @Override
                    public final void run() {
                        ArticleViewer.this.lambda$setParentActivity$32();
                    }
                } : null, new ArticleViewer$$ExternalSyntheticLambda57(this)), bottomSheetParams2);
                return;
            }
            return;
        }
        if (num.intValue() == 9) {
            if (this.pages[0].getWebView() != null) {
                this.pages[0].getWebView().goForward();
                return;
            }
            return;
        }
        if (num.intValue() == 3) {
            if (this.pages[0].isWeb()) {
                if (this.pages[0].getWebView() == null) {
                    return;
                }
                str = this.pages[0].getWebView().getUrl();
                str2 = this.pages[0].getWebView().getOpenURL();
                BotWebViewContainer botWebViewContainer = this.pages[0].webViewContainer;
            } else {
                if (this.pages[0].adapter.currentPage == null) {
                    return;
                }
                str = this.pages[0].adapter.currentPage.url;
                PageLayout pageLayout = this.pages[0];
                str2 = null;
            }
            Activity activity2 = this.parentActivity;
            if (activity2 == null || activity2.isFinishing() || str == null) {
                return;
            }
            final String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
            final String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.this.lambda$setParentActivity$33(str);
                }
            };
            final Utilities.Callback callback = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ArticleViewer.this.lambda$setParentActivity$34(hostAuthority2, hostAuthority, (Boolean) obj);
                }
            };
            if (this.pages[0].isWeb() && !RestrictedDomainsList.getInstance().isRestricted(hostAuthority2) && RestrictedDomainsList.getInstance().incrementOpen(hostAuthority2) >= 2) {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity, getResourcesProvider());
                builder.setTitle(LocaleController.getString(R.string.BrowserExternalTitle));
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(activity);
                if (Build.VERSION.SDK_INT >= 21) {
                    textView.setLetterSpacing(0.025f);
                }
                textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
                textView.setTextSize(1, 16.0f);
                linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0, 24, 0, 24, 0));
                final CheckBoxCell checkBoxCell = new CheckBoxCell(activity, 1, null);
                checkBoxCell.setMultiline(true);
                checkBoxCell.getTextView().getLayoutParams().width = -1;
                checkBoxCell.getTextView().setSingleLine(false);
                checkBoxCell.getTextView().setMaxLines(3);
                checkBoxCell.getTextView().setTextSize(1, 16.0f);
                checkBoxCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ArticleViewer.lambda$setParentActivity$35(CheckBoxCell.this, view);
                    }
                });
                checkBoxCell.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector), 9, 9));
                linearLayout.addView(checkBoxCell, LayoutHelper.createLinear(-1, -2, 3, 8, 6, 8, 4));
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BrowserExternalText)));
                checkBoxCell.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BrowserExternalCheck, hostAuthority2)), "", false, false);
                builder.setView(linearLayout);
                builder.setPositiveButton(LocaleController.getString(R.string.Continue), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ArticleViewer.lambda$setParentActivity$36(CheckBoxCell.this, callback, runnable, dialogInterface, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ArticleViewer.lambda$setParentActivity$37(CheckBoxCell.this, callback, dialogInterface, i);
                    }
                });
                builder.show();
                return;
            }
            runnable.run();
            return;
        }
        if (num.intValue() == 4) {
            if (this.pages[0].isWeb()) {
                openWebSettings();
                return;
            }
            BottomSheet.Builder builder2 = new BottomSheet.Builder(this.parentActivity);
            builder2.setApplyTopPadding(false);
            LinearLayout linearLayout2 = new LinearLayout(this.parentActivity);
            linearLayout2.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
            linearLayout2.setOrientation(1);
            HeaderCell headerCell = new HeaderCell(this.parentActivity, getResourcesProvider());
            headerCell.setText(LocaleController.getString(R.string.FontSize));
            linearLayout2.addView(headerCell, LayoutHelper.createLinear(-2, -2, 51, 3, 1, 3, 0));
            linearLayout2.addView(new TextSizeCell(this.parentActivity), LayoutHelper.createLinear(-1, -2, 51, 3, 0, 3, 0));
            HeaderCell headerCell2 = new HeaderCell(this.parentActivity, getResourcesProvider());
            headerCell2.setText(LocaleController.getString("FontType", R.string.FontType));
            linearLayout2.addView(headerCell2, LayoutHelper.createLinear(-2, -2, 51, 3, 4, 3, 2));
            int i = 0;
            while (i < 2) {
                this.fontCells[i] = new FontCell(this.parentActivity);
                if (i == 0) {
                    this.fontCells[i].setTextAndTypeface(LocaleController.getString("Default", R.string.Default), Typeface.DEFAULT);
                } else if (i == 1) {
                    this.fontCells[i].setTextAndTypeface("Serif", Typeface.SERIF);
                }
                this.fontCells[i].select(i == this.selectedFont, false);
                this.fontCells[i].setTag(Integer.valueOf(i));
                this.fontCells[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ArticleViewer.this.lambda$setParentActivity$38(view);
                    }
                });
                linearLayout2.addView(this.fontCells[i], LayoutHelper.createLinear(-1, 50));
                i++;
            }
            builder2.setCustomView(linearLayout2);
            BottomSheet create = builder2.create();
            this.linkSheet = create;
            showDialog(create);
            return;
        }
        if (num.intValue() == 5 && this.pages[0].isWeb() && this.pages[0].getWebView() != null) {
            this.pages[0].getWebView().reload();
        }
    }

    public void lambda$setParentActivity$30(long j) {
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.dismiss(true);
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", j);
            safeLastFragment.presentFragment(new ChatActivity(bundle));
        }
    }

    public void lambda$setParentActivity$31() {
        this.sheet.dismiss(true);
    }

    public void lambda$setParentActivity$32() {
        this.sheet.dismiss(true);
    }

    public void lambda$setParentActivity$33(String str) {
        Browser.openInExternalBrowser(this.parentActivity, str, false);
    }

    public void lambda$setParentActivity$34(String str, String str2, Boolean bool) {
        RestrictedDomainsList restrictedDomainsList = RestrictedDomainsList.getInstance();
        if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, str)) {
            str2 = null;
        }
        restrictedDomainsList.setRestricted(true, str, str2);
        if (!bool.booleanValue()) {
            showRestrictedWebsiteToast();
        } else {
            LaunchActivity.whenResumed = new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.this.showRestrictedWebsiteToast();
                }
            };
        }
    }

    public static void lambda$setParentActivity$35(CheckBoxCell checkBoxCell, View view) {
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
    }

    public static void lambda$setParentActivity$36(CheckBoxCell checkBoxCell, Utilities.Callback callback, Runnable runnable, DialogInterface dialogInterface, int i) {
        if (checkBoxCell.isChecked()) {
            callback.run(Boolean.TRUE);
        }
        runnable.run();
    }

    public static void lambda$setParentActivity$37(CheckBoxCell checkBoxCell, Utilities.Callback callback, DialogInterface dialogInterface, int i) {
        if (checkBoxCell.isChecked()) {
            callback.run(Boolean.FALSE);
        }
    }

    public void lambda$setParentActivity$38(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        this.selectedFont = intValue;
        int i = 0;
        int i2 = 0;
        while (i2 < 2) {
            this.fontCells[i2].select(i2 == intValue, true);
            i2++;
        }
        updatePaintFonts();
        while (true) {
            PageLayout[] pageLayoutArr = this.pages;
            if (i >= pageLayoutArr.length) {
                return;
            }
            pageLayoutArr[i].adapter.notifyDataSetChanged();
            i++;
        }
    }

    public void lambda$setParentActivity$40(View view) {
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.dismiss(true);
        }
    }

    public void lambda$setParentActivity$42(Integer num) {
        FrameLayout frameLayout = this.searchPanel;
        float f = -num.intValue();
        this.searchPanelTranslation = f;
        frameLayout.setTranslationY(f + (AndroidUtilities.dp(51.0f) * (1.0f - this.searchPanelAlpha)));
    }

    public void lambda$setParentActivity$43(View view) {
        if (this.pages[0].isWeb()) {
            if (this.pages[0].getWebView() != null) {
                this.pages[0].getWebView().findNext(false);
                return;
            }
            return;
        }
        scrollToSearchIndex(this.currentSearchIndex - 1);
    }

    public void lambda$setParentActivity$44(View view) {
        if (this.pages[0].isWeb()) {
            if (this.pages[0].getWebView() != null) {
                this.pages[0].getWebView().findNext(true);
                return;
            }
            return;
        }
        scrollToSearchIndex(this.currentSearchIndex + 1);
    }

    public void lambda$setParentActivity$45(CharSequence charSequence, String str, String str2, Runnable runnable) {
        TranslateAlert2.showAlert(this.parentActivity, this.parentFragment, this.currentAccount, str, str2, charSequence, null, false, null, runnable);
    }

    public void lambda$setParentActivity$46(float[] fArr) {
        fArr[0] = this.currentHeaderHeight;
        fArr[1] = this.pages[0].listView.getMeasuredHeight();
    }

    public void showRestrictedWebsiteToast() {
        LaunchActivity launchActivity;
        FrameLayout frameLayout;
        this.showRestrictedToastOnResume = false;
        if (!this.attachedToWindow || (launchActivity = LaunchActivity.instance) == null || launchActivity.isFinishing()) {
            return;
        }
        if (this.pages[0].isWeb()) {
            if (this.pages[0].getWebView() == null) {
                return;
            } else {
                frameLayout = this.pages[0].webViewContainer;
            }
        } else if (this.pages[0].adapter.currentPage == null) {
            return;
        } else {
            frameLayout = this.pages[0];
        }
        BulletinFactory.of(frameLayout, getResourcesProvider()).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.openWebSettings();
            }
        }), 4).show(true);
    }

    public void openBookmark(String str) {
        if (this.parentActivity == null || str == null) {
            return;
        }
        this.actionBar.showAddress(false, true);
        if (Browser.isInternalUri(Uri.parse(str), null)) {
            Sheet sheet = this.sheet;
            if (sheet != null) {
                sheet.dismiss(true);
            }
            Browser.openAsInternalIntent(this.parentActivity, str);
            return;
        }
        if (Browser.openInExternalApp(this.parentActivity, str, false)) {
            return;
        }
        PageLayout pageLayout = this.pages[0];
        if (pageLayout == null || pageLayout.getWebView() == null) {
            Browser.openInTelegramBrowser(this.parentActivity, str, null);
        } else {
            this.pages[0].getWebView().loadUrl(str);
        }
    }

    public void openHistoryEntry(BrowserHistory.Entry entry) {
        if (this.parentActivity == null || entry == null) {
            return;
        }
        this.actionBar.showAddress(false, true);
        PageLayout pageLayout = this.pages[0];
        if (pageLayout == null || pageLayout.getWebView() == null) {
            Browser.openInTelegramBrowser(this.parentActivity, entry.url, null);
        } else {
            this.pages[0].getWebView().loadUrl(entry.url, entry.meta);
        }
    }

    public void openWebSettings() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            safeLastFragment.showAsSheet(new WebBrowserSettings(new ArticleViewer$$ExternalSyntheticLambda57(this)), bottomSheetParams);
        }
    }

    public void checkVideoPlayer() {
        BlockVideoCell blockVideoCell;
        RecyclerListView recyclerListView = this.pages[0].listView;
        if (recyclerListView == null || !this.attachedToWindow) {
            return;
        }
        float measuredHeight = recyclerListView.getMeasuredHeight() / 2.0f;
        float f = 0.0f;
        BlockVideoCell blockVideoCell2 = null;
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            View childAt = recyclerListView.getChildAt(i);
            if (childAt instanceof BlockVideoCell) {
                float top = childAt.getTop() + (childAt.getMeasuredHeight() / 2.0f);
                if (blockVideoCell2 == null || Math.abs(measuredHeight - top) < Math.abs(measuredHeight - f)) {
                    blockVideoCell2 = (BlockVideoCell) childAt;
                    f = top;
                }
            }
        }
        boolean z = !PhotoViewer.getInstance().isVisibleOrAnimating();
        if (!z || ((blockVideoCell = this.currentPlayer) != null && blockVideoCell != blockVideoCell2 && this.videoPlayer != null)) {
            if (this.videoPlayer != null) {
                LongSparseArray<BlockVideoCellState> longSparseArray = this.videoStates;
                long j = this.currentPlayer.currentBlock.video_id;
                BlockVideoCell blockVideoCell3 = this.currentPlayer;
                longSparseArray.put(j, blockVideoCell3.setState(BlockVideoCellState.fromPlayer(this.videoPlayer, blockVideoCell3)));
                if (this.currentPlayer.videoState != null) {
                    if (this.currentPlayer.videoState.lastFrameBitmap != null) {
                        this.currentPlayer.imageView.setImageBitmap(this.currentPlayer.videoState.lastFrameBitmap);
                    }
                    this.currentPlayer.updateButtonState(false);
                }
                this.videoPlayer.release(null);
            }
            this.videoPlayer = null;
            this.currentPlayer = null;
        }
        if (!z || blockVideoCell2 == null) {
            return;
        }
        blockVideoCell2.startVideoPlayer();
        this.currentPlayer = blockVideoCell2;
    }

    public void updateSearchButtons() {
        int i;
        int size;
        if (this.searchResults != null || this.pages[0].isWeb()) {
            if (this.pages[0].isWeb()) {
                i = this.pages[0].getWebView() == null ? 0 : this.pages[0].getWebView().getSearchIndex();
                size = this.pages[0].getWebView() == null ? 0 : this.pages[0].getWebView().getSearchCount();
            } else {
                i = this.currentSearchIndex;
                size = this.searchResults.size();
            }
            this.searchUpButton.setEnabled(size > 0 && i != 0);
            this.searchDownButton.setEnabled(size > 0 && i != size + (-1));
            ImageView imageView = this.searchUpButton;
            imageView.setAlpha(imageView.isEnabled() ? 1.0f : 0.5f);
            ImageView imageView2 = this.searchDownButton;
            imageView2.setAlpha(imageView2.isEnabled() ? 1.0f : 0.5f);
            this.searchCountText.cancelAnimation();
            if (size < 0) {
                this.searchCountText.setText("");
                return;
            }
            if (size == 0) {
                this.searchCountText.setText(LocaleController.getString("NoResult", R.string.NoResult));
            } else if (size == 1) {
                this.searchCountText.setText(LocaleController.getString("OneResult", R.string.OneResult));
            } else {
                this.searchCountText.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(i + 1), Integer.valueOf(size)));
            }
        }
    }

    public static class SearchResult {
        private TLRPC$PageBlock block;
        private int index;
        private Object text;

        private SearchResult() {
        }
    }

    public void processSearch(final String str) {
        Runnable runnable = this.searchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.searchRunnable = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.searchResults.clear();
            this.searchText = str;
            this.pages[0].adapter.searchTextOffset.clear();
            showSearchPanel(false);
            if (this.pages[0].isWeb()) {
                if (this.pages[0].getWebView() != null) {
                    this.pages[0].getWebView().search("", new Runnable() {
                        @Override
                        public final void run() {
                            ArticleViewer.this.updateSearchButtons();
                        }
                    });
                    updateSearchButtons();
                }
            } else {
                this.pages[0].listView.invalidateViews();
                scrollToSearchIndex(0);
            }
            this.lastSearchIndex = -1;
            return;
        }
        final int i = this.lastSearchIndex + 1;
        this.lastSearchIndex = i;
        if (this.pages[0].isWeb()) {
            showSearchPanel(true);
            if (this.pages[0].getWebView() != null) {
                this.pages[0].getWebView().search(str, new Runnable() {
                    @Override
                    public final void run() {
                        ArticleViewer.this.updateSearchButtons();
                    }
                });
                updateSearchButtons();
                return;
            }
            return;
        }
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$processSearch$49(str, i);
            }
        };
        this.searchRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 400L);
    }

    public void lambda$processSearch$49(final String str, final int i) {
        final HashMap hashMap = new HashMap(this.pages[0].adapter.textToBlocks);
        final ArrayList arrayList = new ArrayList(this.pages[0].adapter.textBlocks);
        this.searchRunnable = null;
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$processSearch$48(arrayList, hashMap, str, i);
            }
        });
    }

    public void lambda$processSearch$48(ArrayList arrayList, HashMap hashMap, final String str, final int i) {
        TLRPC$PageBlock tLRPC$PageBlock;
        String lowerCase;
        String str2;
        AnonymousClass1 anonymousClass1;
        TLRPC$PageBlock tLRPC$PageBlock2;
        final ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        char c = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            TLRPC$PageBlock tLRPC$PageBlock3 = (TLRPC$PageBlock) hashMap.get(obj);
            if (obj instanceof TLRPC$RichText) {
                TLRPC$RichText tLRPC$RichText = (TLRPC$RichText) obj;
                WebpageAdapter webpageAdapter = this.pages[c].adapter;
                String str3 = null;
                tLRPC$PageBlock = tLRPC$PageBlock3;
                CharSequence text = getText(webpageAdapter, (View) null, tLRPC$RichText, tLRPC$RichText, tLRPC$PageBlock3, 1000);
                str2 = str3;
                if (!TextUtils.isEmpty(text)) {
                    lowerCase = text.toString().toLowerCase();
                    anonymousClass1 = str3;
                }
                lowerCase = str2;
                anonymousClass1 = str2;
            } else {
                String str4 = null;
                tLRPC$PageBlock = tLRPC$PageBlock3;
                str2 = str4;
                if (obj instanceof String) {
                    lowerCase = ((String) obj).toLowerCase();
                    anonymousClass1 = str4;
                }
                lowerCase = str2;
                anonymousClass1 = str2;
            }
            if (lowerCase != null) {
                int i3 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(str, i3);
                    if (indexOf >= 0) {
                        int length = str.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            SearchResult searchResult = new SearchResult();
                            searchResult.index = indexOf;
                            tLRPC$PageBlock2 = tLRPC$PageBlock;
                            searchResult.block = tLRPC$PageBlock2;
                            searchResult.text = obj;
                            arrayList2.add(searchResult);
                        } else {
                            tLRPC$PageBlock2 = tLRPC$PageBlock;
                        }
                        tLRPC$PageBlock = tLRPC$PageBlock2;
                        i3 = length;
                    }
                }
            }
            i2++;
            c = 0;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$processSearch$47(i, arrayList2, str);
            }
        });
    }

    public void lambda$processSearch$47(int i, ArrayList arrayList, String str) {
        if (i == this.lastSearchIndex) {
            showSearchPanel(true);
            this.searchResults = arrayList;
            this.searchText = str;
            this.pages[0].adapter.searchTextOffset.clear();
            this.pages[0].listView.invalidateViews();
            scrollToSearchIndex(0);
        }
    }

    public void showSearchPanel(final boolean z) {
        this.searchPanel.setVisibility(0);
        ValueAnimator valueAnimator = this.searchPanelAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.searchPanelAlpha, z ? 1.0f : 0.0f);
        this.searchPanelAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ArticleViewer.this.lambda$showSearchPanel$50(valueAnimator2);
            }
        });
        this.searchPanelAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ArticleViewer.this.searchPanelAlpha = z ? 1.0f : 0.0f;
                ArticleViewer.this.searchPanel.setTranslationY(ArticleViewer.this.searchPanelTranslation + ((1.0f - ArticleViewer.this.searchPanelAlpha) * AndroidUtilities.dp(51.0f)));
                if (z) {
                    return;
                }
                ArticleViewer.this.searchPanel.setVisibility(8);
            }
        });
        this.searchPanelAnimator.setDuration(320L);
        this.searchPanelAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.searchPanelAnimator.start();
    }

    public void lambda$showSearchPanel$50(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.searchPanelAlpha = floatValue;
        this.searchPanel.setTranslationY(this.searchPanelTranslation + ((1.0f - floatValue) * AndroidUtilities.dp(51.0f)));
    }

    private void scrollToSearchIndex(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.scrollToSearchIndex(int):void");
    }

    private void checkScrollAnimated() {
        checkScrollAnimated(null);
    }

    private void checkScrollAnimated(final Runnable runnable) {
        if (this.currentHeaderHeight == AndroidUtilities.dp(56.0f)) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.currentHeaderHeight), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ArticleViewer.this.lambda$checkScrollAnimated$51(valueAnimator);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        if (runnable != null) {
            duration.setDuration(duration.getDuration() / 2);
        }
        duration.start();
    }

    public void lambda$checkScrollAnimated$51(ValueAnimator valueAnimator) {
        setCurrentHeaderHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public void setCurrentHeaderHeight(int i) {
        WebActionBar webActionBar = this.actionBar;
        if (webActionBar == null || webActionBar.isSearching() || this.actionBar.isAddressing()) {
            return;
        }
        int clamp = Utilities.clamp(i, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
        this.currentHeaderHeight = clamp;
        this.actionBar.setHeight(clamp);
        this.textSelectionHelper.setTopOffset(this.currentHeaderHeight);
        int i2 = 0;
        while (true) {
            PageLayout[] pageLayoutArr = this.pages;
            if (i2 >= pageLayoutArr.length) {
                return;
            }
            pageLayoutArr[i2].listView.setTopGlowOffset(this.currentHeaderHeight);
            i2++;
        }
    }

    public void checkScroll(int i) {
        Sheet sheet = this.sheet;
        if (sheet == null || sheet.attachedToActionBar) {
            setCurrentHeaderHeight(this.currentHeaderHeight - i);
        }
    }

    private void openPreviewsChat(TLRPC$User tLRPC$User, long j) {
        if (tLRPC$User == null || !(this.parentActivity instanceof LaunchActivity)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tLRPC$User.id);
        bundle.putString("botUser", "webpage" + j);
        ((LaunchActivity) this.parentActivity).presentFragment(new ChatActivity(bundle), false, true);
        close(false, true);
    }

    public boolean open(MessageObject messageObject) {
        return open(messageObject, null, null, null, null);
    }

    public boolean open(TLRPC$TL_webPage tLRPC$TL_webPage, String str) {
        return open(null, tLRPC$TL_webPage, str, null, null);
    }

    public boolean open(String str) {
        return open(null, null, null, str, null);
    }

    public boolean open(String str, Browser.Progress progress) {
        return open(null, null, null, str, progress);
    }

    private boolean open(final MessageObject messageObject, TLRPC$WebPage tLRPC$WebPage, String str, String str2, Browser.Progress progress) {
        final TLRPC$WebPage tLRPC$WebPage2;
        int lastIndexOf;
        String substring;
        String str3;
        if (this.parentActivity == null || (this.sheet == null && this.isVisible && !this.collapsed)) {
            return false;
        }
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null && (baseFragment.getParentLayout() instanceof ActionBarLayout)) {
            AndroidUtilities.hideKeyboard((ActionBarLayout) this.parentFragment.getParentLayout());
        }
        if (messageObject != null) {
            TLRPC$WebPage tLRPC$WebPage3 = messageObject.messageOwner.media.webpage;
            for (int i = 0; i < messageObject.messageOwner.entities.size(); i++) {
                TLRPC$MessageEntity tLRPC$MessageEntity = messageObject.messageOwner.entities.get(i);
                if (tLRPC$MessageEntity instanceof TLRPC$TL_messageEntityUrl) {
                    try {
                        String str4 = messageObject.messageOwner.message;
                        int i2 = tLRPC$MessageEntity.offset;
                        String lowerCase = str4.substring(i2, tLRPC$MessageEntity.length + i2).toLowerCase();
                        if (!TextUtils.isEmpty(tLRPC$WebPage3.cached_page.url)) {
                            str3 = tLRPC$WebPage3.cached_page.url.toLowerCase();
                        } else {
                            str3 = tLRPC$WebPage3.url.toLowerCase();
                        }
                        if (lowerCase.contains(str3) || str3.contains(lowerCase)) {
                            int lastIndexOf2 = lowerCase.lastIndexOf(35);
                            if (lastIndexOf2 == -1) {
                                break;
                            }
                            substring = lowerCase.substring(lastIndexOf2 + 1);
                            tLRPC$WebPage2 = tLRPC$WebPage3;
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            tLRPC$WebPage2 = tLRPC$WebPage3;
            substring = null;
        } else if (str == null || (lastIndexOf = str.lastIndexOf(35)) == -1) {
            tLRPC$WebPage2 = tLRPC$WebPage;
            substring = null;
        } else {
            substring = str.substring(lastIndexOf + 1);
            tLRPC$WebPage2 = tLRPC$WebPage;
        }
        int i3 = (this.sheet == null || this.pagesStack.isEmpty()) ? 0 : 1;
        this.collapsed = false;
        if (i3 == 0) {
            this.pagesStack.clear();
            this.containerView.setTranslationX(0.0f);
            Sheet sheet = this.sheet;
            if (sheet != null) {
                sheet.setBackProgress(0.0f);
            }
            this.containerView.setTranslationY(0.0f);
            this.pages[0].setTranslationY(0.0f);
            this.pages[0].setTranslationX(0.0f);
            this.pages[1].setTranslationX(0.0f);
            this.pages[0].setAlpha(1.0f);
            this.windowView.setInnerTranslationX(0.0f);
            this.pages[0].scrollToTop(false);
            setCurrentHeaderHeight(AndroidUtilities.dp(56.0f));
        }
        Sheet sheet2 = this.sheet;
        if (sheet2 != null && BotWebViewContainer.firstWebView) {
            sheet2.animationsLock.lock();
        }
        if (tLRPC$WebPage2 != null) {
            if (addPageToStack(tLRPC$WebPage2, substring, i3) || substring == null) {
                substring = null;
            }
            TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage = new TLRPC$TL_messages_getWebPage();
            tLRPC$TL_messages_getWebPage.url = tLRPC$WebPage2.url;
            TLRPC$Page tLRPC$Page = tLRPC$WebPage2.cached_page;
            if ((tLRPC$Page instanceof TLRPC$TL_pagePart_layer82) || tLRPC$Page.part) {
                tLRPC$TL_messages_getWebPage.hash = 0;
            } else {
                tLRPC$TL_messages_getWebPage.hash = tLRPC$WebPage2.hash;
            }
            final int i4 = UserConfig.selectedAccount;
            final boolean z = i3;
            final String str5 = substring;
            ConnectionsManager.getInstance(i4).sendRequest(tLRPC$TL_messages_getWebPage, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ArticleViewer.this.lambda$open$53(i4, tLRPC$WebPage2, messageObject, z, str5, tLObject, tLRPC$TL_error);
                }
            });
        } else {
            addPageToStack(str2, i3);
        }
        this.lastInsets = null;
        if (this.sheet != null) {
            if (i3 == 0) {
                AndroidUtilities.removeFromParent(this.windowView);
                this.sheet.setContainerView(this.windowView);
                this.sheet.windowView.addView(this.windowView, LayoutHelper.createFrame(-1, -1.0f));
            }
        } else if (!this.isVisible) {
            WindowManager windowManager = (WindowManager) this.parentActivity.getSystemService("window");
            if (this.attachedToWindow) {
                try {
                    windowManager.removeView(this.windowView);
                } catch (Exception unused) {
                }
            }
            try {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 21) {
                    WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
                    layoutParams.flags = -2013200384;
                    if (i5 >= 28) {
                        layoutParams.layoutInDisplayCutoutMode = 1;
                    }
                }
                this.windowView.setFocusable(false);
                this.containerView.setFocusable(false);
                windowManager.addView(this.windowView, this.windowLayoutParams);
            } catch (Exception e2) {
                FileLog.e(e2);
                return false;
            }
        } else {
            this.windowLayoutParams.flags &= -17;
            ((WindowManager) this.parentActivity.getSystemService("window")).updateViewLayout(this.windowView, this.windowLayoutParams);
        }
        this.isVisible = true;
        this.animationInProgress = 1;
        if (i3 == 0) {
            Sheet sheet3 = this.sheet;
            if (sheet3 == null) {
                this.windowView.setAlpha(0.0f);
                this.containerView.setAlpha(0.0f);
                final AnimatorSet animatorSet = new AnimatorSet();
                WindowView windowView = this.windowView;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(windowView, (Property<WindowView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.windowView, (Property<WindowView, Float>) View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.animationEndRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        ArticleViewer.this.lambda$open$54();
                    }
                };
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.interpolator);
                animatorSet.addListener(new AnonymousClass23());
                this.transitionAnimationStartTime = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArticleViewer.this.lambda$open$55(animatorSet);
                    }
                });
            } else if (i3 != 0) {
                sheet3.animationsLock.unlock();
            } else {
                sheet3.show();
            }
        }
        this.containerView.setLayerType(2, null);
        return true;
    }

    public void lambda$open$53(final int i, final TLRPC$WebPage tLRPC$WebPage, final MessageObject messageObject, final boolean z, final String str, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$open$52(tLObject, i, tLRPC$WebPage, messageObject, z, str);
            }
        });
    }

    public void lambda$open$52(TLObject tLObject, int i, TLRPC$WebPage tLRPC$WebPage, MessageObject messageObject, boolean z, String str) {
        TLRPC$Page tLRPC$Page;
        TLObject tLObject2 = tLObject;
        int i2 = 0;
        if (tLObject2 instanceof TLRPC$TL_messages_webPage) {
            TLRPC$TL_messages_webPage tLRPC$TL_messages_webPage = (TLRPC$TL_messages_webPage) tLObject2;
            MessagesController.getInstance(i).putUsers(tLRPC$TL_messages_webPage.users, false);
            MessagesController.getInstance(i).putChats(tLRPC$TL_messages_webPage.chats, false);
            tLObject2 = tLRPC$TL_messages_webPage.webpage;
        }
        if (tLObject2 instanceof TLRPC$TL_webPage) {
            TLRPC$TL_webPage tLRPC$TL_webPage = (TLRPC$TL_webPage) tLObject2;
            if (tLRPC$TL_webPage.cached_page == null) {
                return;
            }
            if (!this.pagesStack.isEmpty() && this.pagesStack.get(0) == tLRPC$WebPage) {
                if (messageObject != null) {
                    messageObject.messageOwner.media.webpage = tLRPC$TL_webPage;
                    TLRPC$TL_messages_messages tLRPC$TL_messages_messages = new TLRPC$TL_messages_messages();
                    tLRPC$TL_messages_messages.messages.add(messageObject.messageOwner);
                    MessagesStorage.getInstance(i).putMessages((TLRPC$messages_Messages) tLRPC$TL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                }
                if (z) {
                    this.pagesStack.add(tLRPC$TL_webPage);
                } else {
                    this.pagesStack.set(0, tLRPC$TL_webPage);
                }
                if (this.pagesStack.size() == 1) {
                    ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tLRPC$TL_webPage.id).commit();
                    updateInterfaceForCurrentPage(tLRPC$TL_webPage, false, z ? 1 : 0);
                    if (str != null) {
                        scrollToAnchor(str, false);
                    }
                }
            }
            LongSparseArray<TLRPC$WebPage> longSparseArray = new LongSparseArray<>(1);
            longSparseArray.put(tLRPC$TL_webPage.id, tLRPC$TL_webPage);
            MessagesStorage.getInstance(i).putWebPages(longSparseArray);
            return;
        }
        if (tLObject2 instanceof TLRPC$TL_webPageNotModified) {
            TLRPC$TL_webPageNotModified tLRPC$TL_webPageNotModified = (TLRPC$TL_webPageNotModified) tLObject2;
            if (tLRPC$WebPage == null || (tLRPC$Page = tLRPC$WebPage.cached_page) == null) {
                return;
            }
            int i3 = tLRPC$Page.views;
            int i4 = tLRPC$TL_webPageNotModified.cached_page_views;
            if (i3 != i4) {
                tLRPC$Page.views = i4;
                tLRPC$Page.flags |= 8;
                while (true) {
                    PageLayout[] pageLayoutArr = this.pages;
                    if (i2 >= pageLayoutArr.length) {
                        break;
                    }
                    if (pageLayoutArr[i2].adapter.currentPage == tLRPC$WebPage) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.pages[i2].listView.findViewHolderForAdapterPosition(this.pages[i2].adapter.getItemCount() - 1);
                        if (findViewHolderForAdapterPosition != null) {
                            this.pages[i2].adapter.onViewAttachedToWindow(findViewHolderForAdapterPosition);
                        }
                    }
                    i2++;
                }
                if (messageObject != null) {
                    TLRPC$TL_messages_messages tLRPC$TL_messages_messages2 = new TLRPC$TL_messages_messages();
                    tLRPC$TL_messages_messages2.messages.add(messageObject.messageOwner);
                    MessagesStorage.getInstance(i).putMessages((TLRPC$messages_Messages) tLRPC$TL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                }
            }
        }
    }

    public void lambda$open$54() {
        FrameLayout frameLayout = this.containerView;
        if (frameLayout == null || this.windowView == null) {
            return;
        }
        frameLayout.setLayerType(0, null);
        this.animationInProgress = 0;
        AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
    }

    public class AnonymousClass23 extends AnimatorListenerAdapter {
        AnonymousClass23() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.AnonymousClass23.this.lambda$onAnimationEnd$0();
                }
            });
        }

        public void lambda$onAnimationEnd$0() {
            ArticleViewer.this.notificationsLocker.unlock();
            if (ArticleViewer.this.animationEndRunnable != null) {
                ArticleViewer.this.animationEndRunnable.run();
                ArticleViewer.this.animationEndRunnable = null;
            }
        }
    }

    public void lambda$open$55(AnimatorSet animatorSet) {
        this.notificationsLocker.lock();
        animatorSet.start();
    }

    private void showProgressView(boolean z, final boolean z2) {
        if (z) {
            AndroidUtilities.cancelRunOnUIThread(this.lineProgressTickRunnable);
            if (z2) {
                this.actionBar.lineProgressView.setProgress(0.0f, false);
                this.actionBar.lineProgressView.setProgress(0.3f, true);
                AndroidUtilities.runOnUIThread(this.lineProgressTickRunnable, 100L);
                return;
            }
            this.actionBar.lineProgressView.setProgress(1.0f, true);
            return;
        }
        AnimatorSet animatorSet = this.progressViewAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.progressViewAnimation = animatorSet2;
        if (z2) {
            this.progressView.setVisibility(0);
            this.progressViewAnimation.playTogether(ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.ALPHA, 0.0f));
        }
        this.progressViewAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ArticleViewer.this.progressViewAnimation == null || !ArticleViewer.this.progressViewAnimation.equals(animator) || z2) {
                    return;
                }
                ArticleViewer.this.progressView.setVisibility(4);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (ArticleViewer.this.progressViewAnimation == null || !ArticleViewer.this.progressViewAnimation.equals(animator)) {
                    return;
                }
                ArticleViewer.this.progressViewAnimation = null;
            }
        });
        this.progressViewAnimation.setDuration(150L);
        this.progressViewAnimation.start();
    }

    public void saveCurrentPagePosition() {
        int findFirstVisibleItemPosition;
        if (this.pages[0].adapter.currentPage == null || (findFirstVisibleItemPosition = this.pages[0].layoutManager.findFirstVisibleItemPosition()) == -1) {
            return;
        }
        View findViewByPosition = this.pages[0].layoutManager.findViewByPosition(findFirstVisibleItemPosition);
        int top = findViewByPosition != null ? findViewByPosition.getTop() : 0;
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit();
        String str = "article" + this.pages[0].adapter.currentPage.id;
        SharedPreferences.Editor putInt = edit.putInt(str, findFirstVisibleItemPosition).putInt(str + "o", top);
        String str2 = str + "r";
        Point point = AndroidUtilities.displaySize;
        putInt.putBoolean(str2, point.x > point.y).commit();
    }

    private void refreshThemeColors() {
        TextView textView = this.deleteView;
        if (textView != null) {
            textView.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 2));
            this.deleteView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout != null) {
            actionBarPopupWindowLayout.setBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        }
        ImageView imageView = this.searchUpButton;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.MULTIPLY));
            this.searchUpButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 1));
        }
        ImageView imageView2 = this.searchDownButton;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.MULTIPLY));
            this.searchDownButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 1));
        }
        AnimatedTextView animatedTextView = this.searchCountText;
        if (animatedTextView != null) {
            animatedTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        }
        WebActionBar webActionBar = this.actionBar;
        if (webActionBar != null) {
            PageLayout pageLayout = this.pages[0];
            webActionBar.setMenuColors((pageLayout == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout.getBackgroundColor());
            WebActionBar webActionBar2 = this.actionBar;
            PageLayout pageLayout2 = this.pages[0];
            webActionBar2.setColors((pageLayout2 == null || !SharedConfig.adaptableColorInBrowser) ? getThemedColor(Theme.key_iv_background) : pageLayout2.getActionBarColor(), true);
        }
    }

    public void close(boolean z, boolean z2) {
        if (this.parentActivity == null || this.closeAnimationInProgress || !this.isVisible || checkAnimation()) {
            return;
        }
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.dismiss(false);
            return;
        }
        if (this.fullscreenVideoContainer.getVisibility() == 0) {
            if (this.customView != null) {
                this.fullscreenVideoContainer.setVisibility(4);
                this.customViewCallback.onCustomViewHidden();
                this.fullscreenVideoContainer.removeView(this.customView);
                this.customView = null;
            } else {
                WebPlayerView webPlayerView = this.fullscreenedVideo;
                if (webPlayerView != null) {
                    webPlayerView.exitFullscreen();
                }
            }
            if (!z2) {
                return;
            }
        }
        if (this.textSelectionHelper.isInSelectionMode()) {
            this.textSelectionHelper.clear();
            return;
        }
        if (this.actionBar.isSearching()) {
            this.actionBar.showSearch(false, true);
            return;
        }
        if (this.actionBar.isAddressing()) {
            this.actionBar.showAddress(false, true);
            return;
        }
        if (this.openUrlReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.openUrlReqId, true);
            this.openUrlReqId = 0;
            showProgressView(true, false);
        }
        if (this.previewsReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.previewsReqId, true);
            this.previewsReqId = 0;
            showProgressView(true, false);
        }
        saveCurrentPagePosition();
        if (z && !z2 && removeLastPageFromStack()) {
            return;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        this.parentFragment = null;
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null) {
                dialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        WindowView windowView = this.windowView;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(windowView, (Property<WindowView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.windowView, (Property<WindowView, Float>) View.TRANSLATION_X, 0.0f, AndroidUtilities.dp(56.0f)));
        this.animationInProgress = 2;
        this.animationEndRunnable = new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$close$56();
            }
        };
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(this.interpolator);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ArticleViewer.this.animationEndRunnable != null) {
                    ArticleViewer.this.animationEndRunnable.run();
                    ArticleViewer.this.animationEndRunnable = null;
                }
            }
        });
        this.transitionAnimationStartTime = System.currentTimeMillis();
        this.containerView.setLayerType(2, null);
        animatorSet.start();
        for (int i = 0; i < this.videoStates.size(); i++) {
            BlockVideoCellState valueAt = this.videoStates.valueAt(i);
            Bitmap bitmap = valueAt.lastFrameBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                valueAt.lastFrameBitmap = null;
            }
        }
        this.videoStates.clear();
    }

    public void lambda$close$56() {
        FrameLayout frameLayout = this.containerView;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setLayerType(0, null);
        this.animationInProgress = 0;
        onClosed();
    }

    public void onClosed() {
        this.isVisible = false;
        int i = 0;
        while (true) {
            PageLayout[] pageLayoutArr = this.pages;
            if (i < pageLayoutArr.length) {
                pageLayoutArr[i].cleanup();
                i++;
            } else {
                try {
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        this.parentActivity.getWindow().clearFlags(128);
        for (int i2 = 0; i2 < this.createdWebViews.size(); i2++) {
            this.createdWebViews.get(i2).destroyWebView(false);
        }
        this.containerView.post(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$onClosed$57();
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
    }

    public void lambda$onClosed$57() {
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void loadChannel(final BlockChannelCell blockChannelCell, final WebpageAdapter webpageAdapter, TLRPC$Chat tLRPC$Chat) {
        if (this.loadingChannel || !ChatObject.isPublic(tLRPC$Chat)) {
            return;
        }
        this.loadingChannel = true;
        TLRPC$TL_contacts_resolveUsername tLRPC$TL_contacts_resolveUsername = new TLRPC$TL_contacts_resolveUsername();
        tLRPC$TL_contacts_resolveUsername.username = tLRPC$Chat.username;
        final int i = UserConfig.selectedAccount;
        ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_contacts_resolveUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ArticleViewer.this.lambda$loadChannel$59(webpageAdapter, i, blockChannelCell, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadChannel$59(final WebpageAdapter webpageAdapter, final int i, final BlockChannelCell blockChannelCell, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$loadChannel$58(webpageAdapter, tLRPC$TL_error, tLObject, i, blockChannelCell);
            }
        });
    }

    public void lambda$loadChannel$58(WebpageAdapter webpageAdapter, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, int i, BlockChannelCell blockChannelCell) {
        this.loadingChannel = false;
        if (this.parentFragment == null || webpageAdapter.blocks.isEmpty()) {
            return;
        }
        if (tLRPC$TL_error == null) {
            TLRPC$TL_contacts_resolvedPeer tLRPC$TL_contacts_resolvedPeer = (TLRPC$TL_contacts_resolvedPeer) tLObject;
            if (!tLRPC$TL_contacts_resolvedPeer.chats.isEmpty()) {
                MessagesController.getInstance(i).putUsers(tLRPC$TL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i).putChats(tLRPC$TL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i).putUsersAndChats(tLRPC$TL_contacts_resolvedPeer.users, tLRPC$TL_contacts_resolvedPeer.chats, false, true);
                TLRPC$Chat tLRPC$Chat = tLRPC$TL_contacts_resolvedPeer.chats.get(0);
                this.loadedChannel = tLRPC$Chat;
                if (tLRPC$Chat.left && !tLRPC$Chat.kicked) {
                    blockChannelCell.setState(0, false);
                    return;
                } else {
                    blockChannelCell.setState(4, false);
                    return;
                }
            }
            blockChannelCell.setState(4, false);
            return;
        }
        blockChannelCell.setState(4, false);
    }

    public void joinChannel(final BlockChannelCell blockChannelCell, final TLRPC$Chat tLRPC$Chat) {
        final TLRPC$TL_channels_joinChannel tLRPC$TL_channels_joinChannel = new TLRPC$TL_channels_joinChannel();
        tLRPC$TL_channels_joinChannel.channel = MessagesController.getInputChannel(tLRPC$Chat);
        final int i = UserConfig.selectedAccount;
        ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_channels_joinChannel, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ArticleViewer.this.lambda$joinChannel$63(blockChannelCell, i, tLRPC$TL_channels_joinChannel, tLRPC$Chat, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$joinChannel$63(final BlockChannelCell blockChannelCell, final int i, final TLRPC$TL_channels_joinChannel tLRPC$TL_channels_joinChannel, final TLRPC$Chat tLRPC$Chat, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        boolean z;
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.this.lambda$joinChannel$60(blockChannelCell, i, tLRPC$TL_error, tLRPC$TL_channels_joinChannel);
                }
            });
            return;
        }
        TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        int i2 = 0;
        while (true) {
            if (i2 >= tLRPC$Updates.updates.size()) {
                z = false;
                break;
            }
            TLRPC$Update tLRPC$Update = tLRPC$Updates.updates.get(i2);
            if ((tLRPC$Update instanceof TLRPC$TL_updateNewChannelMessage) && (((TLRPC$TL_updateNewChannelMessage) tLRPC$Update).message.action instanceof TLRPC$TL_messageActionChatAddUser)) {
                z = true;
                break;
            }
            i2++;
        }
        MessagesController.getInstance(i).processUpdates(tLRPC$Updates, false);
        if (!z) {
            MessagesController.getInstance(i).generateJoinMessage(tLRPC$Chat.id, true);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.BlockChannelCell.this.setState(2, false);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.lambda$joinChannel$62(i, tLRPC$Chat);
            }
        }, 1000L);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
        long j = tLRPC$Chat.id;
        messagesStorage.updateDialogsWithDeletedMessages(-j, j, new ArrayList<>(), null, true);
    }

    public void lambda$joinChannel$60(BlockChannelCell blockChannelCell, int i, TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_channels_joinChannel tLRPC$TL_channels_joinChannel) {
        blockChannelCell.setState(0, false);
        AlertsCreator.processError(i, tLRPC$TL_error, this.parentFragment, tLRPC$TL_channels_joinChannel, Boolean.TRUE);
    }

    public static void lambda$joinChannel$62(int i, TLRPC$Chat tLRPC$Chat) {
        MessagesController.getInstance(i).loadFullChat(tLRPC$Chat.id, 0, true);
    }

    private boolean checkAnimation() {
        if (this.animationInProgress != 0 && Math.abs(this.transitionAnimationStartTime - System.currentTimeMillis()) >= 500) {
            Runnable runnable = this.animationEndRunnable;
            if (runnable != null) {
                runnable.run();
                this.animationEndRunnable = null;
            }
            this.animationInProgress = 0;
        }
        return this.animationInProgress != 0;
    }

    public void destroyArticleViewer() {
        WindowView windowView;
        if (this.parentActivity == null || (windowView = this.windowView) == null) {
            return;
        }
        if (this.sheet == null) {
            try {
                if (windowView.getParent() != null) {
                    ((WindowManager) this.parentActivity.getSystemService("window")).removeViewImmediate(this.windowView);
                }
                this.windowView = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        for (int i = 0; i < this.createdWebViews.size(); i++) {
            this.createdWebViews.get(i).destroyWebView(true);
        }
        this.createdWebViews.clear();
        try {
            this.parentActivity.getWindow().clearFlags(128);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        this.parentActivity = null;
        this.parentFragment = null;
        Instance = null;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void showDialog(Dialog dialog) {
        if (this.parentActivity == null) {
            return;
        }
        try {
            Dialog dialog2 = this.visibleDialog;
            if (dialog2 != null) {
                dialog2.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            this.visibleDialog = dialog;
            dialog.setCanceledOnTouchOutside(true);
            this.visibleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    ArticleViewer.this.lambda$showDialog$64(dialogInterface);
                }
            });
            dialog.show();
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void lambda$showDialog$64(DialogInterface dialogInterface) {
        this.visibleDialog = null;
    }

    public static final class WebPageUtils {
        public static TLRPC$Photo getPhotoWithId(TLRPC$WebPage tLRPC$WebPage, long j) {
            if (tLRPC$WebPage != null && tLRPC$WebPage.cached_page != null) {
                TLRPC$Photo tLRPC$Photo = tLRPC$WebPage.photo;
                if (tLRPC$Photo != null && tLRPC$Photo.id == j) {
                    return tLRPC$Photo;
                }
                for (int i = 0; i < tLRPC$WebPage.cached_page.photos.size(); i++) {
                    TLRPC$Photo tLRPC$Photo2 = tLRPC$WebPage.cached_page.photos.get(i);
                    if (tLRPC$Photo2.id == j) {
                        return tLRPC$Photo2;
                    }
                }
            }
            return null;
        }

        public static TLRPC$Document getDocumentWithId(TLRPC$WebPage tLRPC$WebPage, long j) {
            if (tLRPC$WebPage != null && tLRPC$WebPage.cached_page != null) {
                TLRPC$Document tLRPC$Document = tLRPC$WebPage.document;
                if (tLRPC$Document != null && tLRPC$Document.id == j) {
                    return tLRPC$Document;
                }
                for (int i = 0; i < tLRPC$WebPage.cached_page.documents.size(); i++) {
                    TLRPC$Document tLRPC$Document2 = tLRPC$WebPage.cached_page.documents.get(i);
                    if (tLRPC$Document2.id == j) {
                        return tLRPC$Document2;
                    }
                }
            }
            return null;
        }

        public static boolean isVideo(TLRPC$WebPage tLRPC$WebPage, TLRPC$PageBlock tLRPC$PageBlock) {
            TLRPC$Document documentWithId;
            if (!(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) || (documentWithId = getDocumentWithId(tLRPC$WebPage, ((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock).video_id)) == null) {
                return false;
            }
            return MessageObject.isVideoDocument(documentWithId);
        }

        public static TLObject getMedia(TLRPC$WebPage tLRPC$WebPage, TLRPC$PageBlock tLRPC$PageBlock) {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                return getPhotoWithId(tLRPC$WebPage, ((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock).photo_id);
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
                return getDocumentWithId(tLRPC$WebPage, ((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock).video_id);
            }
            return null;
        }

        public static File getMediaFile(TLRPC$WebPage tLRPC$WebPage, TLRPC$PageBlock tLRPC$PageBlock) {
            TLRPC$Document documentWithId;
            TLRPC$PhotoSize closestPhotoSizeWithSize;
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                TLRPC$Photo photoWithId = getPhotoWithId(tLRPC$WebPage, ((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock).photo_id);
                if (photoWithId == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize())) == null) {
                    return null;
                }
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(closestPhotoSizeWithSize, true);
            }
            if (!(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) || (documentWithId = getDocumentWithId(tLRPC$WebPage, ((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock).video_id)) == null) {
                return null;
            }
            return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(documentWithId, true);
        }
    }

    public class WebpageAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC$TL_pageBlockChannel channelBlock;
        private Context context;
        private TLRPC$WebPage currentPage;
        public int fullHeight;
        private boolean isRtl;
        public int[] itemHeights;
        private final boolean padding;
        public int[] sumItemHeights;
        private ArrayList<TLRPC$PageBlock> localBlocks = new ArrayList<>();
        private ArrayList<TLRPC$PageBlock> blocks = new ArrayList<>();
        private ArrayList<TLRPC$PageBlock> photoBlocks = new ArrayList<>();
        private HashMap<String, Integer> anchors = new HashMap<>();
        private HashMap<String, Integer> anchorsOffset = new HashMap<>();
        private HashMap<String, TLRPC$TL_textAnchor> anchorsParent = new HashMap<>();
        private HashMap<TLRPC$TL_pageBlockAudio, MessageObject> audioBlocks = new HashMap<>();
        private ArrayList<MessageObject> audioMessages = new ArrayList<>();
        private HashMap<Object, TLRPC$PageBlock> textToBlocks = new HashMap<>();
        private ArrayList<Object> textBlocks = new ArrayList<>();
        private HashMap<String, Integer> searchTextOffset = new HashMap<>();
        private final Runnable calculateContentHeightRunnable = new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.WebpageAdapter.this.lambda$new$1();
            }
        };

        public WebpageAdapter(Context context, boolean z) {
            this.context = context;
            this.padding = z;
        }

        public TLRPC$Photo getPhotoWithId(long j) {
            return WebPageUtils.getPhotoWithId(this.currentPage, j);
        }

        public TLRPC$Document getDocumentWithId(long j) {
            return WebPageUtils.getDocumentWithId(this.currentPage, j);
        }

        private void setRichTextParents(TLRPC$RichText tLRPC$RichText, TLRPC$RichText tLRPC$RichText2) {
            if (tLRPC$RichText2 == null) {
                return;
            }
            tLRPC$RichText2.parentRichText = tLRPC$RichText;
            if (tLRPC$RichText2 instanceof TLRPC$TL_textFixed) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textFixed) tLRPC$RichText2).text);
                return;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textItalic) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textItalic) tLRPC$RichText2).text);
                return;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textBold) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textBold) tLRPC$RichText2).text);
                return;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textUnderline) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textUnderline) tLRPC$RichText2).text);
                return;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textStrike) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textStrike) tLRPC$RichText2).text);
                return;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textEmail) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textEmail) tLRPC$RichText2).text);
                return;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textPhone) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textPhone) tLRPC$RichText2).text);
                return;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textUrl) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textUrl) tLRPC$RichText2).text);
                return;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textConcat) {
                int size = tLRPC$RichText2.texts.size();
                for (int i = 0; i < size; i++) {
                    setRichTextParents(tLRPC$RichText2, tLRPC$RichText2.texts.get(i));
                }
                return;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textSubscript) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textSubscript) tLRPC$RichText2).text);
                return;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textSuperscript) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textSuperscript) tLRPC$RichText2).text);
                return;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textMarked) {
                setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textMarked) tLRPC$RichText2).text);
                return;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textAnchor) {
                TLRPC$TL_textAnchor tLRPC$TL_textAnchor = (TLRPC$TL_textAnchor) tLRPC$RichText2;
                setRichTextParents(tLRPC$RichText2, tLRPC$TL_textAnchor.text);
                String lowerCase = tLRPC$TL_textAnchor.name.toLowerCase();
                this.anchors.put(lowerCase, Integer.valueOf(this.blocks.size()));
                TLRPC$RichText tLRPC$RichText3 = tLRPC$TL_textAnchor.text;
                if (tLRPC$RichText3 instanceof TLRPC$TL_textPlain) {
                    if (!TextUtils.isEmpty(((TLRPC$TL_textPlain) tLRPC$RichText3).text)) {
                        this.anchorsParent.put(lowerCase, tLRPC$TL_textAnchor);
                    }
                } else if (!(tLRPC$RichText3 instanceof TLRPC$TL_textEmpty)) {
                    this.anchorsParent.put(lowerCase, tLRPC$TL_textAnchor);
                }
                this.anchorsOffset.put(lowerCase, -1);
            }
        }

        private void addTextBlock(Object obj, TLRPC$PageBlock tLRPC$PageBlock) {
            if ((obj instanceof TLRPC$TL_textEmpty) || this.textToBlocks.containsKey(obj)) {
                return;
            }
            this.textToBlocks.put(obj, tLRPC$PageBlock);
            this.textBlocks.add(obj);
        }

        private void setRichTextParents(TLRPC$PageBlock tLRPC$PageBlock) {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbedPost) {
                TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost = (TLRPC$TL_pageBlockEmbedPost) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockEmbedPost.caption.text);
                setRichTextParents(null, tLRPC$TL_pageBlockEmbedPost.caption.credit);
                addTextBlock(tLRPC$TL_pageBlockEmbedPost.caption.text, tLRPC$TL_pageBlockEmbedPost);
                addTextBlock(tLRPC$TL_pageBlockEmbedPost.caption.credit, tLRPC$TL_pageBlockEmbedPost);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockParagraph) {
                TLRPC$TL_pageBlockParagraph tLRPC$TL_pageBlockParagraph = (TLRPC$TL_pageBlockParagraph) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockParagraph.text);
                addTextBlock(tLRPC$TL_pageBlockParagraph.text, tLRPC$TL_pageBlockParagraph);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockKicker) {
                TLRPC$TL_pageBlockKicker tLRPC$TL_pageBlockKicker = (TLRPC$TL_pageBlockKicker) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockKicker.text);
                addTextBlock(tLRPC$TL_pageBlockKicker.text, tLRPC$TL_pageBlockKicker);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockFooter) {
                TLRPC$TL_pageBlockFooter tLRPC$TL_pageBlockFooter = (TLRPC$TL_pageBlockFooter) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockFooter.text);
                addTextBlock(tLRPC$TL_pageBlockFooter.text, tLRPC$TL_pageBlockFooter);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockHeader) {
                TLRPC$TL_pageBlockHeader tLRPC$TL_pageBlockHeader = (TLRPC$TL_pageBlockHeader) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockHeader.text);
                addTextBlock(tLRPC$TL_pageBlockHeader.text, tLRPC$TL_pageBlockHeader);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPreformatted) {
                TLRPC$TL_pageBlockPreformatted tLRPC$TL_pageBlockPreformatted = (TLRPC$TL_pageBlockPreformatted) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockPreformatted.text);
                addTextBlock(tLRPC$TL_pageBlockPreformatted.text, tLRPC$TL_pageBlockPreformatted);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubheader) {
                TLRPC$TL_pageBlockSubheader tLRPC$TL_pageBlockSubheader = (TLRPC$TL_pageBlockSubheader) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockSubheader.text);
                addTextBlock(tLRPC$TL_pageBlockSubheader.text, tLRPC$TL_pageBlockSubheader);
                return;
            }
            int i = 0;
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSlideshow) {
                TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow = (TLRPC$TL_pageBlockSlideshow) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockSlideshow.caption.text);
                setRichTextParents(null, tLRPC$TL_pageBlockSlideshow.caption.credit);
                addTextBlock(tLRPC$TL_pageBlockSlideshow.caption.text, tLRPC$TL_pageBlockSlideshow);
                addTextBlock(tLRPC$TL_pageBlockSlideshow.caption.credit, tLRPC$TL_pageBlockSlideshow);
                int size = tLRPC$TL_pageBlockSlideshow.items.size();
                while (i < size) {
                    setRichTextParents(tLRPC$TL_pageBlockSlideshow.items.get(i));
                    i++;
                }
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto = (TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockPhoto.caption.text);
                setRichTextParents(null, tLRPC$TL_pageBlockPhoto.caption.credit);
                addTextBlock(tLRPC$TL_pageBlockPhoto.caption.text, tLRPC$TL_pageBlockPhoto);
                addTextBlock(tLRPC$TL_pageBlockPhoto.caption.credit, tLRPC$TL_pageBlockPhoto);
                return;
            }
            if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
                TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) tLRPC$PageBlock;
                if (tL_pageBlockListItem.textItem != null) {
                    setRichTextParents(null, tL_pageBlockListItem.textItem);
                    addTextBlock(tL_pageBlockListItem.textItem, tL_pageBlockListItem);
                    return;
                } else {
                    if (tL_pageBlockListItem.blockItem != null) {
                        setRichTextParents(tL_pageBlockListItem.blockItem);
                        return;
                    }
                    return;
                }
            }
            if (tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem) {
                TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) tLRPC$PageBlock;
                if (tL_pageBlockOrderedListItem.textItem != null) {
                    setRichTextParents(null, tL_pageBlockOrderedListItem.textItem);
                    addTextBlock(tL_pageBlockOrderedListItem.textItem, tL_pageBlockOrderedListItem);
                    return;
                } else {
                    if (tL_pageBlockOrderedListItem.blockItem != null) {
                        setRichTextParents(tL_pageBlockOrderedListItem.blockItem);
                        return;
                    }
                    return;
                }
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
                TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage = (TLRPC$TL_pageBlockCollage) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockCollage.caption.text);
                setRichTextParents(null, tLRPC$TL_pageBlockCollage.caption.credit);
                addTextBlock(tLRPC$TL_pageBlockCollage.caption.text, tLRPC$TL_pageBlockCollage);
                addTextBlock(tLRPC$TL_pageBlockCollage.caption.credit, tLRPC$TL_pageBlockCollage);
                int size2 = tLRPC$TL_pageBlockCollage.items.size();
                while (i < size2) {
                    setRichTextParents(tLRPC$TL_pageBlockCollage.items.get(i));
                    i++;
                }
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbed) {
                TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed = (TLRPC$TL_pageBlockEmbed) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockEmbed.caption.text);
                setRichTextParents(null, tLRPC$TL_pageBlockEmbed.caption.credit);
                addTextBlock(tLRPC$TL_pageBlockEmbed.caption.text, tLRPC$TL_pageBlockEmbed);
                addTextBlock(tLRPC$TL_pageBlockEmbed.caption.credit, tLRPC$TL_pageBlockEmbed);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubtitle) {
                TLRPC$TL_pageBlockSubtitle tLRPC$TL_pageBlockSubtitle = (TLRPC$TL_pageBlockSubtitle) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockSubtitle.text);
                addTextBlock(tLRPC$TL_pageBlockSubtitle.text, tLRPC$TL_pageBlockSubtitle);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockBlockquote) {
                TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote = (TLRPC$TL_pageBlockBlockquote) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockBlockquote.text);
                setRichTextParents(null, tLRPC$TL_pageBlockBlockquote.caption);
                addTextBlock(tLRPC$TL_pageBlockBlockquote.text, tLRPC$TL_pageBlockBlockquote);
                addTextBlock(tLRPC$TL_pageBlockBlockquote.caption, tLRPC$TL_pageBlockBlockquote);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockDetails) {
                TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = (TLRPC$TL_pageBlockDetails) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockDetails.title);
                addTextBlock(tLRPC$TL_pageBlockDetails.title, tLRPC$TL_pageBlockDetails);
                int size3 = tLRPC$TL_pageBlockDetails.blocks.size();
                while (i < size3) {
                    setRichTextParents(tLRPC$TL_pageBlockDetails.blocks.get(i));
                    i++;
                }
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
                TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockVideo.caption.text);
                setRichTextParents(null, tLRPC$TL_pageBlockVideo.caption.credit);
                addTextBlock(tLRPC$TL_pageBlockVideo.caption.text, tLRPC$TL_pageBlockVideo);
                addTextBlock(tLRPC$TL_pageBlockVideo.caption.credit, tLRPC$TL_pageBlockVideo);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPullquote) {
                TLRPC$TL_pageBlockPullquote tLRPC$TL_pageBlockPullquote = (TLRPC$TL_pageBlockPullquote) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockPullquote.text);
                setRichTextParents(null, tLRPC$TL_pageBlockPullquote.caption);
                addTextBlock(tLRPC$TL_pageBlockPullquote.text, tLRPC$TL_pageBlockPullquote);
                addTextBlock(tLRPC$TL_pageBlockPullquote.caption, tLRPC$TL_pageBlockPullquote);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAudio) {
                TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio = (TLRPC$TL_pageBlockAudio) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockAudio.caption.text);
                setRichTextParents(null, tLRPC$TL_pageBlockAudio.caption.credit);
                addTextBlock(tLRPC$TL_pageBlockAudio.caption.text, tLRPC$TL_pageBlockAudio);
                addTextBlock(tLRPC$TL_pageBlockAudio.caption.credit, tLRPC$TL_pageBlockAudio);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTable) {
                TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable = (TLRPC$TL_pageBlockTable) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockTable.title);
                addTextBlock(tLRPC$TL_pageBlockTable.title, tLRPC$TL_pageBlockTable);
                int size4 = tLRPC$TL_pageBlockTable.rows.size();
                for (int i2 = 0; i2 < size4; i2++) {
                    TLRPC$TL_pageTableRow tLRPC$TL_pageTableRow = tLRPC$TL_pageBlockTable.rows.get(i2);
                    int size5 = tLRPC$TL_pageTableRow.cells.size();
                    for (int i3 = 0; i3 < size5; i3++) {
                        TLRPC$TL_pageTableCell tLRPC$TL_pageTableCell = tLRPC$TL_pageTableRow.cells.get(i3);
                        setRichTextParents(null, tLRPC$TL_pageTableCell.text);
                        addTextBlock(tLRPC$TL_pageTableCell.text, tLRPC$TL_pageBlockTable);
                    }
                }
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTitle) {
                TLRPC$TL_pageBlockTitle tLRPC$TL_pageBlockTitle = (TLRPC$TL_pageBlockTitle) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockTitle.text);
                addTextBlock(tLRPC$TL_pageBlockTitle.text, tLRPC$TL_pageBlockTitle);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                setRichTextParents(((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAuthorDate) {
                TLRPC$TL_pageBlockAuthorDate tLRPC$TL_pageBlockAuthorDate = (TLRPC$TL_pageBlockAuthorDate) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockAuthorDate.author);
                addTextBlock(tLRPC$TL_pageBlockAuthorDate.author, tLRPC$TL_pageBlockAuthorDate);
            } else {
                if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockMap) {
                    TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap = (TLRPC$TL_pageBlockMap) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockMap.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockMap.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockMap.caption.text, tLRPC$TL_pageBlockMap);
                    addTextBlock(tLRPC$TL_pageBlockMap.caption.credit, tLRPC$TL_pageBlockMap);
                    return;
                }
                if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockRelatedArticles) {
                    TLRPC$TL_pageBlockRelatedArticles tLRPC$TL_pageBlockRelatedArticles = (TLRPC$TL_pageBlockRelatedArticles) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockRelatedArticles.title);
                    addTextBlock(tLRPC$TL_pageBlockRelatedArticles.title, tLRPC$TL_pageBlockRelatedArticles);
                }
            }
        }

        public void addBlock(WebpageAdapter webpageAdapter, TLRPC$PageBlock tLRPC$PageBlock, int i, int i2, int i3) {
            TLRPC$TL_pageBlockOrderedList tLRPC$TL_pageBlockOrderedList;
            TLRPC$PageListOrderedItem tLRPC$PageListOrderedItem;
            TLRPC$PageListOrderedItem tLRPC$PageListOrderedItem2;
            int i4;
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem;
            int i5;
            int i6;
            TLRPC$PageListItem tLRPC$PageListItem;
            int i7;
            int i8;
            TL_pageBlockListParent tL_pageBlockListParent;
            TLRPC$TL_pageBlockList tLRPC$TL_pageBlockList;
            String str;
            TL_pageBlockListItem tL_pageBlockListItem;
            int i9;
            int i10;
            int i11 = 0;
            int i12 = 1;
            boolean z = tLRPC$PageBlock instanceof TL_pageBlockDetailsChild;
            TLRPC$PageBlock tLRPC$PageBlock2 = z ? ((TL_pageBlockDetailsChild) tLRPC$PageBlock).block : tLRPC$PageBlock;
            if (!(tLRPC$PageBlock2 instanceof TLRPC$TL_pageBlockList) && !(tLRPC$PageBlock2 instanceof TLRPC$TL_pageBlockOrderedList)) {
                setRichTextParents(tLRPC$PageBlock2);
                addAllMediaFromBlock(webpageAdapter, tLRPC$PageBlock2);
            }
            TLRPC$PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(tLRPC$PageBlock2);
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockUnsupported) {
                return;
            }
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockAnchor) {
                this.anchors.put(((TLRPC$TL_pageBlockAnchor) lastNonListPageBlock).name.toLowerCase(), Integer.valueOf(this.blocks.size()));
                return;
            }
            boolean z2 = lastNonListPageBlock instanceof TLRPC$TL_pageBlockList;
            if (!z2 && !(lastNonListPageBlock instanceof TLRPC$TL_pageBlockOrderedList)) {
                this.blocks.add(tLRPC$PageBlock);
            }
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockAudio) {
                TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio = (TLRPC$TL_pageBlockAudio) lastNonListPageBlock;
                TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
                tLRPC$TL_message.out = true;
                int i13 = -Long.valueOf(tLRPC$TL_pageBlockAudio.audio_id).hashCode();
                lastNonListPageBlock.mid = i13;
                tLRPC$TL_message.id = i13;
                tLRPC$TL_message.peer_id = new TLRPC$TL_peerUser();
                TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                tLRPC$TL_message.from_id = tLRPC$TL_peerUser;
                TLRPC$Peer tLRPC$Peer = tLRPC$TL_message.peer_id;
                long clientUserId = UserConfig.getInstance(ArticleViewer.this.currentAccount).getClientUserId();
                tLRPC$Peer.user_id = clientUserId;
                tLRPC$TL_peerUser.user_id = clientUserId;
                tLRPC$TL_message.date = (int) (System.currentTimeMillis() / 1000);
                tLRPC$TL_message.message = "";
                TLRPC$TL_messageMediaDocument tLRPC$TL_messageMediaDocument = new TLRPC$TL_messageMediaDocument();
                tLRPC$TL_message.media = tLRPC$TL_messageMediaDocument;
                tLRPC$TL_messageMediaDocument.webpage = this.currentPage;
                tLRPC$TL_messageMediaDocument.flags |= 3;
                tLRPC$TL_messageMediaDocument.document = getDocumentWithId(tLRPC$TL_pageBlockAudio.audio_id);
                tLRPC$TL_message.flags |= 768;
                MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tLRPC$TL_message, false, true);
                this.audioMessages.add(messageObject);
                this.audioBlocks.put(tLRPC$TL_pageBlockAudio, messageObject);
                String musicAuthor = messageObject.getMusicAuthor(false);
                String musicTitle = messageObject.getMusicTitle(false);
                if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                    return;
                }
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    addTextBlock(String.format("%s - %s", musicAuthor, musicTitle), lastNonListPageBlock);
                    return;
                } else if (!TextUtils.isEmpty(musicTitle)) {
                    addTextBlock(musicTitle, lastNonListPageBlock);
                    return;
                } else {
                    addTextBlock(musicAuthor, lastNonListPageBlock);
                    return;
                }
            }
            AnonymousClass1 anonymousClass1 = null;
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockEmbedPost) {
                TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost = (TLRPC$TL_pageBlockEmbedPost) lastNonListPageBlock;
                if (tLRPC$TL_pageBlockEmbedPost.blocks.isEmpty()) {
                    return;
                }
                lastNonListPageBlock.level = -1;
                while (i11 < tLRPC$TL_pageBlockEmbedPost.blocks.size()) {
                    TLRPC$PageBlock tLRPC$PageBlock3 = tLRPC$TL_pageBlockEmbedPost.blocks.get(i11);
                    if (!(tLRPC$PageBlock3 instanceof TLRPC$TL_pageBlockUnsupported)) {
                        if (tLRPC$PageBlock3 instanceof TLRPC$TL_pageBlockAnchor) {
                            this.anchors.put(((TLRPC$TL_pageBlockAnchor) tLRPC$PageBlock3).name.toLowerCase(), Integer.valueOf(this.blocks.size()));
                        } else {
                            tLRPC$PageBlock3.level = 1;
                            if (i11 == tLRPC$TL_pageBlockEmbedPost.blocks.size() - 1) {
                                tLRPC$PageBlock3.bottom = true;
                            }
                            this.blocks.add(tLRPC$PageBlock3);
                            addAllMediaFromBlock(webpageAdapter, tLRPC$PageBlock3);
                        }
                    }
                    i11++;
                }
                if (TextUtils.isEmpty(ArticleViewer.getPlainText(tLRPC$TL_pageBlockEmbedPost.caption.text)) && TextUtils.isEmpty(ArticleViewer.getPlainText(tLRPC$TL_pageBlockEmbedPost.caption.credit))) {
                    return;
                }
                TL_pageBlockEmbedPostCaption tL_pageBlockEmbedPostCaption = new TL_pageBlockEmbedPostCaption();
                tL_pageBlockEmbedPostCaption.parent = tLRPC$TL_pageBlockEmbedPost;
                tL_pageBlockEmbedPostCaption.caption = tLRPC$TL_pageBlockEmbedPost.caption;
                this.blocks.add(tL_pageBlockEmbedPostCaption);
                return;
            }
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockRelatedArticles) {
                TLRPC$TL_pageBlockRelatedArticles tLRPC$TL_pageBlockRelatedArticles = (TLRPC$TL_pageBlockRelatedArticles) lastNonListPageBlock;
                TL_pageBlockRelatedArticlesShadow tL_pageBlockRelatedArticlesShadow = new TL_pageBlockRelatedArticlesShadow();
                tL_pageBlockRelatedArticlesShadow.parent = tLRPC$TL_pageBlockRelatedArticles;
                ArrayList<TLRPC$PageBlock> arrayList = this.blocks;
                arrayList.add(arrayList.size() - 1, tL_pageBlockRelatedArticlesShadow);
                int size = tLRPC$TL_pageBlockRelatedArticles.articles.size();
                while (i11 < size) {
                    TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = new TL_pageBlockRelatedArticlesChild();
                    tL_pageBlockRelatedArticlesChild.parent = tLRPC$TL_pageBlockRelatedArticles;
                    tL_pageBlockRelatedArticlesChild.num = i11;
                    this.blocks.add(tL_pageBlockRelatedArticlesChild);
                    i11++;
                }
                if (i3 == 0) {
                    TL_pageBlockRelatedArticlesShadow tL_pageBlockRelatedArticlesShadow2 = new TL_pageBlockRelatedArticlesShadow();
                    tL_pageBlockRelatedArticlesShadow2.parent = tLRPC$TL_pageBlockRelatedArticles;
                    this.blocks.add(tL_pageBlockRelatedArticlesShadow2);
                    return;
                }
                return;
            }
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockDetails) {
                TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = (TLRPC$TL_pageBlockDetails) lastNonListPageBlock;
                int size2 = tLRPC$TL_pageBlockDetails.blocks.size();
                while (i11 < size2) {
                    TL_pageBlockDetailsChild tL_pageBlockDetailsChild = new TL_pageBlockDetailsChild();
                    tL_pageBlockDetailsChild.parent = tLRPC$PageBlock;
                    tL_pageBlockDetailsChild.block = tLRPC$TL_pageBlockDetails.blocks.get(i11);
                    addBlock(webpageAdapter, ArticleViewer.this.wrapInTableBlock(tLRPC$PageBlock, tL_pageBlockDetailsChild), i + 1, i2, i3);
                    i11++;
                }
                return;
            }
            String str2 = ".%d";
            if (z2) {
                TLRPC$TL_pageBlockList tLRPC$TL_pageBlockList2 = (TLRPC$TL_pageBlockList) lastNonListPageBlock;
                TL_pageBlockListParent tL_pageBlockListParent2 = new TL_pageBlockListParent();
                tL_pageBlockListParent2.pageBlockList = tLRPC$TL_pageBlockList2;
                tL_pageBlockListParent2.level = i2;
                int size3 = tLRPC$TL_pageBlockList2.items.size();
                int i14 = 0;
                while (i14 < size3) {
                    TLRPC$PageListItem tLRPC$PageListItem2 = tLRPC$TL_pageBlockList2.items.get(i14);
                    TL_pageBlockListItem tL_pageBlockListItem2 = new TL_pageBlockListItem();
                    tL_pageBlockListItem2.index = i14;
                    tL_pageBlockListItem2.parent = tL_pageBlockListParent2;
                    if (!tLRPC$TL_pageBlockList2.ordered) {
                        tL_pageBlockListItem2.num = "•";
                    } else if (this.isRtl) {
                        Object[] objArr = new Object[i12];
                        objArr[0] = Integer.valueOf(i14 + 1);
                        tL_pageBlockListItem2.num = String.format(str2, objArr);
                    } else {
                        Object[] objArr2 = new Object[i12];
                        objArr2[0] = Integer.valueOf(i14 + 1);
                        tL_pageBlockListItem2.num = String.format("%d.", objArr2);
                    }
                    tL_pageBlockListParent2.items.add(tL_pageBlockListItem2);
                    if (tLRPC$PageListItem2 instanceof TLRPC$TL_pageListItemText) {
                        tL_pageBlockListItem2.textItem = ((TLRPC$TL_pageListItemText) tLRPC$PageListItem2).text;
                        tLRPC$PageListItem = tLRPC$PageListItem2;
                    } else {
                        boolean z3 = tLRPC$PageListItem2 instanceof TLRPC$TL_pageListItemBlocks;
                        tLRPC$PageListItem = tLRPC$PageListItem2;
                        if (z3) {
                            TLRPC$TL_pageListItemBlocks tLRPC$TL_pageListItemBlocks = (TLRPC$TL_pageListItemBlocks) tLRPC$PageListItem2;
                            if (!tLRPC$TL_pageListItemBlocks.blocks.isEmpty()) {
                                tL_pageBlockListItem2.blockItem = tLRPC$TL_pageListItemBlocks.blocks.get(0);
                                tLRPC$PageListItem = tLRPC$PageListItem2;
                            } else {
                                TLRPC$TL_pageListItemText tLRPC$TL_pageListItemText = new TLRPC$TL_pageListItemText();
                                TLRPC$TL_textPlain tLRPC$TL_textPlain = new TLRPC$TL_textPlain();
                                tLRPC$TL_textPlain.text = " ";
                                tLRPC$TL_pageListItemText.text = tLRPC$TL_textPlain;
                                tLRPC$PageListItem = tLRPC$TL_pageListItemText;
                            }
                        }
                    }
                    TLRPC$PageListItem tLRPC$PageListItem3 = tLRPC$PageListItem;
                    if (!z) {
                        i7 = i14;
                        i8 = size3;
                        tL_pageBlockListParent = tL_pageBlockListParent2;
                        tLRPC$TL_pageBlockList = tLRPC$TL_pageBlockList2;
                        TL_pageBlockListItem fixListBlock = i7 == 0 ? ArticleViewer.this.fixListBlock(tLRPC$PageBlock, tL_pageBlockListItem2) : tL_pageBlockListItem2;
                        str = str2;
                        addBlock(webpageAdapter, fixListBlock, i, i2 + 1, i3);
                    } else {
                        TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = new TL_pageBlockDetailsChild();
                        tL_pageBlockDetailsChild2.parent = ((TL_pageBlockDetailsChild) tLRPC$PageBlock).parent;
                        tL_pageBlockDetailsChild2.block = tL_pageBlockListItem2;
                        i7 = i14;
                        i8 = size3;
                        tL_pageBlockListParent = tL_pageBlockListParent2;
                        tLRPC$TL_pageBlockList = tLRPC$TL_pageBlockList2;
                        str = str2;
                        addBlock(webpageAdapter, tL_pageBlockDetailsChild2, i, i2 + 1, i3);
                    }
                    if (tLRPC$PageListItem3 instanceof TLRPC$TL_pageListItemBlocks) {
                        TLRPC$TL_pageListItemBlocks tLRPC$TL_pageListItemBlocks2 = (TLRPC$TL_pageListItemBlocks) tLRPC$PageListItem3;
                        int size4 = tLRPC$TL_pageListItemBlocks2.blocks.size();
                        int i15 = 1;
                        while (i15 < size4) {
                            TL_pageBlockListItem tL_pageBlockListItem3 = new TL_pageBlockListItem();
                            tL_pageBlockListItem3.blockItem = tLRPC$TL_pageListItemBlocks2.blocks.get(i15);
                            tL_pageBlockListItem3.parent = tL_pageBlockListParent;
                            if (z) {
                                TL_pageBlockDetailsChild tL_pageBlockDetailsChild3 = new TL_pageBlockDetailsChild();
                                tL_pageBlockDetailsChild3.parent = ((TL_pageBlockDetailsChild) tLRPC$PageBlock).parent;
                                tL_pageBlockDetailsChild3.block = tL_pageBlockListItem3;
                                tL_pageBlockListItem = tL_pageBlockListItem3;
                                i9 = i15;
                                i10 = size4;
                                addBlock(webpageAdapter, tL_pageBlockDetailsChild3, i, i2 + 1, i3);
                            } else {
                                tL_pageBlockListItem = tL_pageBlockListItem3;
                                i9 = i15;
                                i10 = size4;
                                addBlock(webpageAdapter, tL_pageBlockListItem, i, i2 + 1, i3);
                            }
                            tL_pageBlockListParent.items.add(tL_pageBlockListItem);
                            i15 = i9 + 1;
                            size4 = i10;
                        }
                    }
                    i14 = i7 + 1;
                    str2 = str;
                    tL_pageBlockListParent2 = tL_pageBlockListParent;
                    size3 = i8;
                    tLRPC$TL_pageBlockList2 = tLRPC$TL_pageBlockList;
                    i12 = 1;
                    anonymousClass1 = null;
                }
                return;
            }
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockOrderedList) {
                TLRPC$TL_pageBlockOrderedList tLRPC$TL_pageBlockOrderedList2 = (TLRPC$TL_pageBlockOrderedList) lastNonListPageBlock;
                AnonymousClass1 anonymousClass12 = null;
                TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = new TL_pageBlockOrderedListParent();
                tL_pageBlockOrderedListParent.pageBlockOrderedList = tLRPC$TL_pageBlockOrderedList2;
                tL_pageBlockOrderedListParent.level = i2;
                int size5 = tLRPC$TL_pageBlockOrderedList2.items.size();
                int i16 = 0;
                while (i16 < size5) {
                    TLRPC$PageListOrderedItem tLRPC$PageListOrderedItem3 = tLRPC$TL_pageBlockOrderedList2.items.get(i16);
                    TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = new TL_pageBlockOrderedListItem();
                    tL_pageBlockOrderedListItem2.index = i16;
                    tL_pageBlockOrderedListItem2.parent = tL_pageBlockOrderedListParent;
                    tL_pageBlockOrderedListParent.items.add(tL_pageBlockOrderedListItem2);
                    if (tLRPC$PageListOrderedItem3 instanceof TLRPC$TL_pageListOrderedItemText) {
                        TLRPC$TL_pageListOrderedItemText tLRPC$TL_pageListOrderedItemText = (TLRPC$TL_pageListOrderedItemText) tLRPC$PageListOrderedItem3;
                        tL_pageBlockOrderedListItem2.textItem = tLRPC$TL_pageListOrderedItemText.text;
                        if (TextUtils.isEmpty(tLRPC$TL_pageListOrderedItemText.num)) {
                            if (this.isRtl) {
                                tL_pageBlockOrderedListItem2.num = String.format(".%d", Integer.valueOf(i16 + 1));
                                tLRPC$TL_pageBlockOrderedList = tLRPC$TL_pageBlockOrderedList2;
                                tLRPC$PageListOrderedItem2 = tLRPC$PageListOrderedItem3;
                            } else {
                                tL_pageBlockOrderedListItem2.num = String.format("%d.", Integer.valueOf(i16 + 1));
                            }
                        } else if (this.isRtl) {
                            tL_pageBlockOrderedListItem2.num = "." + tLRPC$TL_pageListOrderedItemText.num;
                        } else {
                            tL_pageBlockOrderedListItem2.num = tLRPC$TL_pageListOrderedItemText.num + ".";
                        }
                        tLRPC$TL_pageBlockOrderedList = tLRPC$TL_pageBlockOrderedList2;
                        tLRPC$PageListOrderedItem2 = tLRPC$PageListOrderedItem3;
                    } else {
                        if (tLRPC$PageListOrderedItem3 instanceof TLRPC$TL_pageListOrderedItemBlocks) {
                            TLRPC$TL_pageListOrderedItemBlocks tLRPC$TL_pageListOrderedItemBlocks = (TLRPC$TL_pageListOrderedItemBlocks) tLRPC$PageListOrderedItem3;
                            if (!tLRPC$TL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                                tLRPC$TL_pageBlockOrderedList = tLRPC$TL_pageBlockOrderedList2;
                                tL_pageBlockOrderedListItem2.blockItem = tLRPC$TL_pageListOrderedItemBlocks.blocks.get(0);
                                tLRPC$PageListOrderedItem = tLRPC$PageListOrderedItem3;
                            } else {
                                tLRPC$TL_pageBlockOrderedList = tLRPC$TL_pageBlockOrderedList2;
                                TLRPC$TL_pageListOrderedItemText tLRPC$TL_pageListOrderedItemText2 = new TLRPC$TL_pageListOrderedItemText();
                                TLRPC$TL_textPlain tLRPC$TL_textPlain2 = new TLRPC$TL_textPlain();
                                tLRPC$TL_textPlain2.text = " ";
                                tLRPC$TL_pageListOrderedItemText2.text = tLRPC$TL_textPlain2;
                                tLRPC$PageListOrderedItem = tLRPC$TL_pageListOrderedItemText2;
                            }
                            if (TextUtils.isEmpty(tLRPC$TL_pageListOrderedItemBlocks.num)) {
                                if (this.isRtl) {
                                    tL_pageBlockOrderedListItem2.num = String.format(".%d", Integer.valueOf(i16 + 1));
                                    tLRPC$PageListOrderedItem2 = tLRPC$PageListOrderedItem;
                                } else {
                                    tL_pageBlockOrderedListItem2.num = String.format("%d.", Integer.valueOf(i16 + 1));
                                    tLRPC$PageListOrderedItem2 = tLRPC$PageListOrderedItem;
                                }
                            } else if (this.isRtl) {
                                tL_pageBlockOrderedListItem2.num = "." + tLRPC$TL_pageListOrderedItemBlocks.num;
                                tLRPC$PageListOrderedItem2 = tLRPC$PageListOrderedItem;
                            } else {
                                tL_pageBlockOrderedListItem2.num = tLRPC$TL_pageListOrderedItemBlocks.num + ".";
                                tLRPC$PageListOrderedItem2 = tLRPC$PageListOrderedItem;
                            }
                        }
                        tLRPC$TL_pageBlockOrderedList = tLRPC$TL_pageBlockOrderedList2;
                        tLRPC$PageListOrderedItem2 = tLRPC$PageListOrderedItem3;
                    }
                    TLRPC$PageListOrderedItem tLRPC$PageListOrderedItem4 = tLRPC$PageListOrderedItem2;
                    if (z) {
                        TL_pageBlockDetailsChild tL_pageBlockDetailsChild4 = new TL_pageBlockDetailsChild();
                        tL_pageBlockDetailsChild4.parent = ((TL_pageBlockDetailsChild) tLRPC$PageBlock).parent;
                        tL_pageBlockDetailsChild4.block = tL_pageBlockOrderedListItem2;
                        i4 = i16;
                        addBlock(webpageAdapter, tL_pageBlockDetailsChild4, i, i2 + 1, i3);
                    } else {
                        i4 = i16;
                        if (i4 == 0) {
                            tL_pageBlockOrderedListItem2 = ArticleViewer.this.fixListBlock(tLRPC$PageBlock, tL_pageBlockOrderedListItem2);
                        }
                        addBlock(webpageAdapter, tL_pageBlockOrderedListItem2, i, i2 + 1, i3);
                    }
                    if (tLRPC$PageListOrderedItem4 instanceof TLRPC$TL_pageListOrderedItemBlocks) {
                        TLRPC$TL_pageListOrderedItemBlocks tLRPC$TL_pageListOrderedItemBlocks2 = (TLRPC$TL_pageListOrderedItemBlocks) tLRPC$PageListOrderedItem4;
                        int size6 = tLRPC$TL_pageListOrderedItemBlocks2.blocks.size();
                        int i17 = 1;
                        while (i17 < size6) {
                            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem3 = new TL_pageBlockOrderedListItem();
                            tL_pageBlockOrderedListItem3.blockItem = tLRPC$TL_pageListOrderedItemBlocks2.blocks.get(i17);
                            tL_pageBlockOrderedListItem3.parent = tL_pageBlockOrderedListParent;
                            if (z) {
                                TL_pageBlockDetailsChild tL_pageBlockDetailsChild5 = new TL_pageBlockDetailsChild();
                                tL_pageBlockDetailsChild5.parent = ((TL_pageBlockDetailsChild) tLRPC$PageBlock).parent;
                                tL_pageBlockDetailsChild5.block = tL_pageBlockOrderedListItem3;
                                tL_pageBlockOrderedListItem = tL_pageBlockOrderedListItem3;
                                i5 = i17;
                                i6 = size6;
                                addBlock(webpageAdapter, tL_pageBlockDetailsChild5, i, i2 + 1, i3);
                            } else {
                                tL_pageBlockOrderedListItem = tL_pageBlockOrderedListItem3;
                                i5 = i17;
                                i6 = size6;
                                addBlock(webpageAdapter, tL_pageBlockOrderedListItem, i, i2 + 1, i3);
                            }
                            tL_pageBlockOrderedListParent.items.add(tL_pageBlockOrderedListItem);
                            i17 = i5 + 1;
                            size6 = i6;
                        }
                    }
                    i16 = i4 + 1;
                    tLRPC$TL_pageBlockOrderedList2 = tLRPC$TL_pageBlockOrderedList;
                    anonymousClass12 = null;
                }
            }
        }

        private void addAllMediaFromBlock(WebpageAdapter webpageAdapter, TLRPC$PageBlock tLRPC$PageBlock) {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto = (TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock;
                TLRPC$Photo photoWithId = getPhotoWithId(tLRPC$TL_pageBlockPhoto.photo_id);
                if (photoWithId != null) {
                    tLRPC$TL_pageBlockPhoto.thumb = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, 56, true);
                    tLRPC$TL_pageBlockPhoto.thumbObject = photoWithId;
                    this.photoBlocks.add(tLRPC$PageBlock);
                    return;
                }
                return;
            }
            if ((tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) && WebPageUtils.isVideo(webpageAdapter.currentPage, tLRPC$PageBlock)) {
                TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock;
                TLRPC$Document documentWithId = getDocumentWithId(tLRPC$TL_pageBlockVideo.video_id);
                if (documentWithId != null) {
                    tLRPC$TL_pageBlockVideo.thumb = FileLoader.getClosestPhotoSizeWithSize(documentWithId.thumbs, 56, true);
                    tLRPC$TL_pageBlockVideo.thumbObject = documentWithId;
                    this.photoBlocks.add(tLRPC$PageBlock);
                    return;
                }
                return;
            }
            int i = 0;
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSlideshow) {
                TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow = (TLRPC$TL_pageBlockSlideshow) tLRPC$PageBlock;
                int size = tLRPC$TL_pageBlockSlideshow.items.size();
                while (i < size) {
                    TLRPC$PageBlock tLRPC$PageBlock2 = tLRPC$TL_pageBlockSlideshow.items.get(i);
                    tLRPC$PageBlock2.groupId = ArticleViewer.this.lastBlockNum;
                    addAllMediaFromBlock(webpageAdapter, tLRPC$PageBlock2);
                    i++;
                }
                ArticleViewer.access$12508(ArticleViewer.this);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
                TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage = (TLRPC$TL_pageBlockCollage) tLRPC$PageBlock;
                int size2 = tLRPC$TL_pageBlockCollage.items.size();
                while (i < size2) {
                    TLRPC$PageBlock tLRPC$PageBlock3 = tLRPC$TL_pageBlockCollage.items.get(i);
                    tLRPC$PageBlock3.groupId = ArticleViewer.this.lastBlockNum;
                    addAllMediaFromBlock(webpageAdapter, tLRPC$PageBlock3);
                    i++;
                }
                ArticleViewer.access$12508(ArticleViewer.this);
                return;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                addAllMediaFromBlock(webpageAdapter, ((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View blockVideoCell;
            if (i == 90) {
                view = new ReportCell(this.context);
            } else if (i == 2147483646) {
                view = new View(this.context) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.4f), 1073741824));
                    }
                };
            } else {
                switch (i) {
                    case 0:
                        view = new BlockParagraphCell(this.context, this);
                        break;
                    case 1:
                        view = new BlockHeaderCell(this.context, this);
                        break;
                    case 2:
                        view = new BlockDividerCell(this.context);
                        break;
                    case 3:
                        view = new BlockEmbedCell(this.context, this);
                        break;
                    case 4:
                        view = new BlockSubtitleCell(this.context, this);
                        break;
                    case 5:
                        blockVideoCell = new BlockVideoCell(this.context, this, 0);
                        view = blockVideoCell;
                        break;
                    case 6:
                        view = new BlockPullquoteCell(this.context, this);
                        break;
                    case 7:
                        view = new BlockBlockquoteCell(this.context, this);
                        break;
                    case 8:
                        view = new BlockSlideshowCell(this.context, this);
                        break;
                    case 9:
                        blockVideoCell = new BlockPhotoCell(this.context, this, 0);
                        view = blockVideoCell;
                        break;
                    case 10:
                        view = new BlockAuthorDateCell(this.context, this);
                        break;
                    case 11:
                        view = new BlockTitleCell(this.context, this);
                        break;
                    case 12:
                        view = new BlockListItemCell(this.context, this);
                        break;
                    case 13:
                        view = new BlockFooterCell(this.context, this);
                        break;
                    case 14:
                        view = new BlockPreformattedCell(this.context, this);
                        break;
                    case 15:
                        view = new BlockSubheaderCell(this.context, this);
                        break;
                    case 16:
                        view = new BlockEmbedPostCell(this.context, this);
                        break;
                    case 17:
                        view = new BlockCollageCell(this.context, this);
                        break;
                    case 18:
                        blockVideoCell = new BlockChannelCell(this.context, this, 0);
                        view = blockVideoCell;
                        break;
                    case 19:
                        view = new BlockAudioCell(this.context, this);
                        break;
                    case 20:
                        view = new BlockKickerCell(this.context, this);
                        break;
                    case 21:
                        view = new BlockOrderedListItemCell(this.context, this);
                        break;
                    case 22:
                        blockVideoCell = new BlockMapCell(this.context, this, 0);
                        view = blockVideoCell;
                        break;
                    case 23:
                        view = new BlockRelatedArticlesCell(this.context, this);
                        break;
                    case 24:
                        view = new BlockDetailsCell(this.context, this);
                        break;
                    case 25:
                        view = new BlockTableCell(this.context, this);
                        break;
                    case 26:
                        view = new BlockRelatedArticlesHeaderCell(this.context, this);
                        break;
                    case 27:
                        view = new BlockDetailsBottomCell(this.context);
                        break;
                    case 28:
                        view = new BlockRelatedArticlesShadowCell(this.context);
                        break;
                    default:
                        TextView textView = new TextView(this.context);
                        textView.setBackgroundColor(-65536);
                        textView.setTextColor(-16777216);
                        textView.setTextSize(1, 20.0f);
                        view = textView;
                        break;
                }
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            view.setFocusable(true);
            return new RecyclerListView.Holder(view);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 23 || itemViewType == 24;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (this.padding) {
                i--;
            }
            int i2 = i;
            if (i2 < 0 || i2 >= this.localBlocks.size()) {
                return;
            }
            bindBlockToHolder(viewHolder.getItemViewType(), viewHolder, this.localBlocks.get(i2), i2, this.localBlocks.size());
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 90) {
                ReportCell reportCell = (ReportCell) viewHolder.itemView;
                TLRPC$Page tLRPC$Page = this.currentPage.cached_page;
                reportCell.setViews(tLRPC$Page != null ? tLRPC$Page.views : 0);
            }
        }

        public void bindBlockToHolder(int i, RecyclerView.ViewHolder viewHolder, TLRPC$PageBlock tLRPC$PageBlock, int i2, int i3) {
            TLRPC$PageBlock tLRPC$PageBlock2;
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                tLRPC$PageBlock2 = ((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover;
            } else {
                tLRPC$PageBlock2 = tLRPC$PageBlock instanceof TL_pageBlockDetailsChild ? ((TL_pageBlockDetailsChild) tLRPC$PageBlock).block : tLRPC$PageBlock;
            }
            if (i != 100) {
                switch (i) {
                    case 0:
                        ((BlockParagraphCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockParagraph) tLRPC$PageBlock2);
                        return;
                    case 1:
                        ((BlockHeaderCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockHeader) tLRPC$PageBlock2);
                        return;
                    case 2:
                        return;
                    case 3:
                        ((BlockEmbedCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockEmbed) tLRPC$PageBlock2);
                        return;
                    case 4:
                        ((BlockSubtitleCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockSubtitle) tLRPC$PageBlock2);
                        return;
                    case 5:
                        BlockVideoCell blockVideoCell = (BlockVideoCell) viewHolder.itemView;
                        TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock2;
                        blockVideoCell.setBlock(tLRPC$TL_pageBlockVideo, (BlockVideoCellState) ArticleViewer.this.videoStates.get(tLRPC$TL_pageBlockVideo.video_id), i2 == 0, i2 == i3 - 1);
                        blockVideoCell.setParentBlock(this.channelBlock, tLRPC$PageBlock);
                        return;
                    case 6:
                        ((BlockPullquoteCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockPullquote) tLRPC$PageBlock2);
                        return;
                    case 7:
                        ((BlockBlockquoteCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockBlockquote) tLRPC$PageBlock2);
                        return;
                    case 8:
                        ((BlockSlideshowCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockSlideshow) tLRPC$PageBlock2);
                        return;
                    case 9:
                        BlockPhotoCell blockPhotoCell = (BlockPhotoCell) viewHolder.itemView;
                        blockPhotoCell.setBlock((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock2, i2 == 0, i2 == i3 - 1);
                        blockPhotoCell.setParentBlock(tLRPC$PageBlock);
                        return;
                    case 10:
                        ((BlockAuthorDateCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockAuthorDate) tLRPC$PageBlock2);
                        return;
                    case 11:
                        ((BlockTitleCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockTitle) tLRPC$PageBlock2);
                        return;
                    case 12:
                        ((BlockListItemCell) viewHolder.itemView).setBlock((TL_pageBlockListItem) tLRPC$PageBlock2);
                        return;
                    case 13:
                        ((BlockFooterCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockFooter) tLRPC$PageBlock2);
                        return;
                    case 14:
                        ((BlockPreformattedCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockPreformatted) tLRPC$PageBlock2);
                        return;
                    case 15:
                        ((BlockSubheaderCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockSubheader) tLRPC$PageBlock2);
                        return;
                    case 16:
                        ((BlockEmbedPostCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockEmbedPost) tLRPC$PageBlock2);
                        return;
                    case 17:
                        ((BlockCollageCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockCollage) tLRPC$PageBlock2);
                        return;
                    case 18:
                        ((BlockChannelCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockChannel) tLRPC$PageBlock2);
                        return;
                    case 19:
                        ((BlockAudioCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockAudio) tLRPC$PageBlock2, i2 == 0, i2 == i3 - 1);
                        return;
                    case 20:
                        ((BlockKickerCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockKicker) tLRPC$PageBlock2);
                        return;
                    case 21:
                        ((BlockOrderedListItemCell) viewHolder.itemView).setBlock((TL_pageBlockOrderedListItem) tLRPC$PageBlock2);
                        return;
                    case 22:
                        ((BlockMapCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockMap) tLRPC$PageBlock2, i2 == 0, i2 == i3 - 1);
                        return;
                    case 23:
                        ((BlockRelatedArticlesCell) viewHolder.itemView).setBlock((TL_pageBlockRelatedArticlesChild) tLRPC$PageBlock2);
                        return;
                    case 24:
                        ((BlockDetailsCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockDetails) tLRPC$PageBlock2);
                        return;
                    case 25:
                        ((BlockTableCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockTable) tLRPC$PageBlock2);
                        return;
                    case 26:
                        ((BlockRelatedArticlesHeaderCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockRelatedArticles) tLRPC$PageBlock2);
                        return;
                    case 27:
                        return;
                    default:
                        return;
                }
            }
            ((TextView) viewHolder.itemView).setText("unsupported block " + tLRPC$PageBlock2);
        }

        public int getTypeForBlock(TLRPC$PageBlock tLRPC$PageBlock) {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockParagraph) {
                return 0;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockHeader) {
                return 1;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockDivider) {
                return 2;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbed) {
                return 3;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubtitle) {
                return 4;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
                return 5;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPullquote) {
                return 6;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockBlockquote) {
                return 7;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSlideshow) {
                return 8;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                return 9;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAuthorDate) {
                return 10;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTitle) {
                return 11;
            }
            if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
                return 12;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockFooter) {
                return 13;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPreformatted) {
                return 14;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubheader) {
                return 15;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbedPost) {
                return 16;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
                return 17;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockChannel) {
                return 18;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAudio) {
                return 19;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockKicker) {
                return 20;
            }
            if (tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem) {
                return 21;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockMap) {
                return 22;
            }
            if (tLRPC$PageBlock instanceof TL_pageBlockRelatedArticlesChild) {
                return 23;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockDetails) {
                return 24;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTable) {
                return 25;
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockRelatedArticles) {
                return 26;
            }
            if (tLRPC$PageBlock instanceof TL_pageBlockRelatedArticlesShadow) {
                return 28;
            }
            if (tLRPC$PageBlock instanceof TL_pageBlockDetailsChild) {
                return getTypeForBlock(((TL_pageBlockDetailsChild) tLRPC$PageBlock).block);
            }
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                return getTypeForBlock(((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover);
            }
            return 100;
        }

        @Override
        public int getItemViewType(int i) {
            if (this.padding) {
                if (i == 0) {
                    return 2147483646;
                }
                i--;
            }
            if (i == this.localBlocks.size()) {
                return 90;
            }
            return getTypeForBlock(this.localBlocks.get(i));
        }

        @Override
        public int getItemCount() {
            TLRPC$WebPage tLRPC$WebPage = this.currentPage;
            int size = (tLRPC$WebPage == null || tLRPC$WebPage.cached_page == null) ? 0 : this.localBlocks.size() + 1;
            return this.padding ? size + 1 : size;
        }

        private boolean isBlockOpened(TL_pageBlockDetailsChild tL_pageBlockDetailsChild) {
            TLRPC$PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(tL_pageBlockDetailsChild.parent);
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockDetails) {
                return ((TLRPC$TL_pageBlockDetails) lastNonListPageBlock).open;
            }
            if (!(lastNonListPageBlock instanceof TL_pageBlockDetailsChild)) {
                return false;
            }
            TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = (TL_pageBlockDetailsChild) lastNonListPageBlock;
            TLRPC$PageBlock lastNonListPageBlock2 = ArticleViewer.this.getLastNonListPageBlock(tL_pageBlockDetailsChild2.block);
            if (!(lastNonListPageBlock2 instanceof TLRPC$TL_pageBlockDetails) || ((TLRPC$TL_pageBlockDetails) lastNonListPageBlock2).open) {
                return isBlockOpened(tL_pageBlockDetailsChild2);
            }
            return false;
        }

        public void resetCachedHeights() {
            for (int i = 0; i < this.localBlocks.size(); i++) {
                TLRPC$PageBlock tLRPC$PageBlock = this.localBlocks.get(i);
                if (tLRPC$PageBlock != null) {
                    tLRPC$PageBlock.cachedWidth = 0;
                    tLRPC$PageBlock.cachedHeight = 0;
                }
            }
            calculateContentHeight();
        }

        public void updateRows() {
            this.localBlocks.clear();
            int size = this.blocks.size();
            for (int i = 0; i < size; i++) {
                TLRPC$PageBlock tLRPC$PageBlock = this.blocks.get(i);
                TLRPC$PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(tLRPC$PageBlock);
                if (!(lastNonListPageBlock instanceof TL_pageBlockDetailsChild) || isBlockOpened((TL_pageBlockDetailsChild) lastNonListPageBlock)) {
                    this.localBlocks.add(tLRPC$PageBlock);
                }
            }
            if (this.localBlocks.size() < 100) {
                calculateContentHeight();
            } else {
                this.itemHeights = null;
            }
        }

        public void calculateContentHeight() {
            Utilities.globalQueue.cancelRunnable(this.calculateContentHeightRunnable);
            Utilities.globalQueue.postRunnable(this.calculateContentHeightRunnable, 100L);
        }

        public void lambda$new$1() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.WebpageAdapter.lambda$new$1():void");
        }

        public void lambda$new$0(int i, int[] iArr, int[] iArr2) {
            this.fullHeight = i;
            this.itemHeights = iArr;
            this.sumItemHeights = iArr2;
            ArticleViewer.this.updatePages();
        }

        public void cleanup() {
            this.currentPage = null;
            this.blocks.clear();
            this.photoBlocks.clear();
            this.audioBlocks.clear();
            this.audioMessages.clear();
            this.anchors.clear();
            this.anchorsParent.clear();
            this.anchorsOffset.clear();
            this.textBlocks.clear();
            this.textToBlocks.clear();
            this.channelBlock = null;
            notifyDataSetChanged();
        }

        @Override
        public void notifyDataSetChanged() {
            updateRows();
            super.notifyDataSetChanged();
        }

        @Override
        public void notifyItemChanged(int i) {
            updateRows();
            super.notifyItemChanged(i);
        }

        @Override
        public void notifyItemRangeChanged(int i, int i2) {
            updateRows();
            super.notifyItemRangeChanged(i, i2);
        }

        @Override
        public void notifyItemRangeChanged(int i, int i2, Object obj) {
            updateRows();
            super.notifyItemRangeChanged(i, i2, obj);
        }

        @Override
        public void notifyItemInserted(int i) {
            updateRows();
            super.notifyItemInserted(i);
        }

        @Override
        public void notifyItemMoved(int i, int i2) {
            updateRows();
            super.notifyItemMoved(i, i2);
        }

        @Override
        public void notifyItemRangeInserted(int i, int i2) {
            updateRows();
            super.notifyItemRangeInserted(i, i2);
        }

        @Override
        public void notifyItemRemoved(int i) {
            updateRows();
            super.notifyItemRemoved(i);
        }

        @Override
        public void notifyItemRangeRemoved(int i, int i2) {
            updateRows();
            super.notifyItemRangeRemoved(i, i2);
        }
    }

    public static class BlockVideoCellState {
        Bitmap lastFrameBitmap;
        long playFrom;

        private BlockVideoCellState() {
        }

        public static BlockVideoCellState fromPlayer(VideoPlayerHolderBase videoPlayerHolderBase, BlockVideoCell blockVideoCell) {
            BlockVideoCellState blockVideoCellState = new BlockVideoCellState();
            blockVideoCellState.playFrom = videoPlayerHolderBase.getCurrentPosition();
            if (videoPlayerHolderBase.firstFrameRendered && blockVideoCell.textureView != null && blockVideoCell.textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(blockVideoCell.textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(blockVideoCell.textureView.getMeasuredWidth(), blockVideoCell.textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    blockVideoCellState.lastFrameBitmap = createBitmap;
                } else {
                    blockVideoCellState.lastFrameBitmap = blockVideoCell.textureView.getBitmap();
                }
            }
            return blockVideoCellState;
        }

        public static BlockVideoCellState fromPlayer(VideoPlayer videoPlayer, BlockVideoCell blockVideoCell, TextureView textureView) {
            BlockVideoCellState blockVideoCellState = new BlockVideoCellState();
            blockVideoCellState.playFrom = videoPlayer.getCurrentPosition();
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    blockVideoCellState.lastFrameBitmap = createBitmap;
                } else {
                    blockVideoCellState.lastFrameBitmap = textureView.getBitmap();
                }
            }
            return blockVideoCellState;
        }

        public static BlockVideoCellState fromPlayer(VideoPlayer videoPlayer, BlockVideoCell blockVideoCell, SurfaceView surfaceView) {
            BlockVideoCellState blockVideoCellState = new BlockVideoCellState();
            blockVideoCellState.playFrom = videoPlayer.getCurrentPosition();
            if (surfaceView != null && Build.VERSION.SDK_INT >= 24) {
                Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                AndroidUtilities.getBitmapFromSurface(surfaceView, createBitmap);
                blockVideoCellState.lastFrameBitmap = createBitmap;
            }
            return blockVideoCellState;
        }
    }

    public class BlockVideoCell extends FrameLayout implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
        private AspectRatioFrameLayout aspectRatioFrameLayout;
        FrameLayout aspectRationContainer;
        private boolean autoDownload;
        private int buttonPressed;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private boolean cancelLoading;
        private DrawingText captionLayout;
        private BlockChannelCell channelCell;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockVideo currentBlock;
        private TLRPC$Document currentDocument;
        private int currentType;
        private boolean firstFrameRendered;
        private MessageObject.GroupedMessagePosition groupPosition;
        private ImageReceiver imageView;
        private boolean isFirst;
        private boolean isGif;
        private WebpageAdapter parentAdapter;
        private TLRPC$PageBlock parentBlock;
        private boolean photoPressed;
        private RadialProgress2 radialProgress;
        private int textX;
        private int textY;
        private TextureView textureView;
        private BlockVideoCellState videoState;

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public BlockVideoCell(Context context, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.imageView = imageReceiver;
            imageReceiver.setNeedsQualityThumb(true);
            this.imageView.setShouldGenerateQualityThumb(true);
            this.currentType = i;
            RadialProgress2 radialProgress2 = new RadialProgress2(this);
            this.radialProgress = radialProgress2;
            radialProgress2.setProgressColor(-1);
            this.radialProgress.setColors(1711276032, 2130706432, -1, -2500135);
            this.TAG = DownloadController.getInstance(ArticleViewer.this.currentAccount).generateObserverTag();
            this.channelCell = new BlockChannelCell(context, this.parentAdapter, 1);
            AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context);
            this.aspectRatioFrameLayout = aspectRatioFrameLayout;
            aspectRatioFrameLayout.setResizeMode(0);
            TextureView textureView = new TextureView(context);
            this.textureView = textureView;
            textureView.setOpaque(false);
            this.aspectRationContainer = new FrameLayout(getContext());
            this.aspectRatioFrameLayout.addView(this.textureView, LayoutHelper.createFrame(-1, -2, 1));
            this.aspectRationContainer.addView(this.aspectRatioFrameLayout, LayoutHelper.createFrame(-1, -1, 17));
            addView(this.aspectRationContainer, LayoutHelper.createFrame(-1, -2.0f));
            addView(this.channelCell, LayoutHelper.createFrame(-1, -2.0f));
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.aspectRationContainer && ArticleViewer.this.pinchToZoomHelper.isInOverlayModeFor(this)) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        public void setBlock(TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo, BlockVideoCellState blockVideoCellState, boolean z, boolean z2) {
            if (this.currentBlock != null) {
                ArticleViewer articleViewer = ArticleViewer.this;
                if (articleViewer.videoPlayer != null && articleViewer.currentPlayer == this) {
                    LongSparseArray longSparseArray = articleViewer.videoStates;
                    long j = this.currentBlock.video_id;
                    BlockVideoCellState fromPlayer = BlockVideoCellState.fromPlayer(ArticleViewer.this.videoPlayer, this);
                    this.videoState = fromPlayer;
                    longSparseArray.put(j, fromPlayer);
                }
            }
            this.currentBlock = tLRPC$TL_pageBlockVideo;
            this.videoState = blockVideoCellState;
            this.parentBlock = null;
            TLRPC$Document documentWithId = this.parentAdapter.getDocumentWithId(tLRPC$TL_pageBlockVideo.video_id);
            this.currentDocument = documentWithId;
            this.isGif = MessageObject.isVideoDocument(documentWithId) || MessageObject.isGifDocument(this.currentDocument);
            this.isFirst = z;
            this.channelCell.setVisibility(4);
            updateButtonState(false);
            requestLayout();
        }

        public void setParentBlock(TLRPC$TL_pageBlockChannel tLRPC$TL_pageBlockChannel, TLRPC$PageBlock tLRPC$PageBlock) {
            this.parentBlock = tLRPC$PageBlock;
            if (tLRPC$TL_pageBlockChannel == null || !(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover)) {
                return;
            }
            this.channelCell.setBlock(tLRPC$TL_pageBlockChannel);
            this.channelCell.setVisibility(0);
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockVideoCell.onTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        @android.annotation.SuppressLint({"NewApi"})
        protected void onMeasure(int r31, int r32) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockVideoCell.onMeasure(int, int):void");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            if (!this.imageView.hasBitmapImage() || this.imageView.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(this.imageView.getDrawRegion(), ArticleViewer.photoBackgroundPaint);
            }
            if (!ArticleViewer.this.pinchToZoomHelper.isInOverlayModeFor(this)) {
                this.imageView.draw(canvas);
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            } else {
                i = 0;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
            super.onDraw(canvas);
            if (ArticleViewer.this.pinchToZoomHelper.isInOverlayModeFor(this) || !this.imageView.getVisible()) {
                return;
            }
            this.radialProgress.draw(canvas);
        }

        private int getIconForCurrentState() {
            int i = this.buttonState;
            if (i == 0) {
                return 2;
            }
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 0 : 4;
        }

        public void updateButtonState(boolean z) {
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            boolean z2 = true;
            boolean z3 = FileLoader.getInstance(ArticleViewer.this.currentAccount).getPathToAttach(this.currentDocument).exists() || FileLoader.getInstance(ArticleViewer.this.currentAccount).getPathToAttach(this.currentDocument, true).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (z3) {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
                if (!this.isGif) {
                    this.buttonState = 3;
                } else {
                    this.buttonState = -1;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                BlockVideoCellState blockVideoCellState = this.videoState;
                float f = 0.0f;
                if (blockVideoCellState == null || blockVideoCellState.lastFrameBitmap == null) {
                    if (!FileLoader.getInstance(ArticleViewer.this.currentAccount).isLoadingFile(attachFileName)) {
                        if (!this.cancelLoading && this.autoDownload && this.isGif) {
                            this.buttonState = 1;
                        } else {
                            this.buttonState = 0;
                        }
                    } else {
                        this.buttonState = 1;
                        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                        if (fileProgress != null) {
                            f = fileProgress.floatValue();
                        }
                    }
                    this.radialProgress.setIcon(getIconForCurrentState(), z2, z);
                    this.radialProgress.setProgress(f, false);
                } else {
                    this.buttonState = -1;
                }
                z2 = false;
                this.radialProgress.setIcon(getIconForCurrentState(), z2, z);
                this.radialProgress.setProgress(f, false);
            }
            invalidate();
        }

        private void didPressedButton(boolean z) {
            int i = this.buttonState;
            if (i == 0) {
                this.cancelLoading = false;
                this.radialProgress.setProgress(0.0f, false);
                if (!this.isGif) {
                    FileLoader.getInstance(ArticleViewer.this.currentAccount).loadFile(this.currentDocument, this.parentAdapter.currentPage, 1, 1);
                } else {
                    this.imageView.setImage(ImageLocation.getForDocument(this.currentDocument), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.currentDocument.thumbs, 40), this.currentDocument), "80_80_b", this.currentDocument.size, null, this.parentAdapter.currentPage, 1);
                }
                this.buttonState = 1;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                invalidate();
                return;
            }
            if (i == 1) {
                this.cancelLoading = true;
                if (!this.isGif) {
                    FileLoader.getInstance(ArticleViewer.this.currentAccount).cancelLoadFile(this.currentDocument);
                } else {
                    this.imageView.cancelLoadImage();
                }
                this.buttonState = 0;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    ArticleViewer.this.openPhoto(this.currentBlock, this.parentAdapter);
                }
            } else {
                this.imageView.setAllowStartAnimation(true);
                this.imageView.startAnimation();
                this.buttonState = -1;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            if (this.currentBlock != null) {
                ArticleViewer articleViewer = ArticleViewer.this;
                if (articleViewer.videoPlayer != null && articleViewer.currentPlayer == this) {
                    articleViewer.videoStates.put(this.currentBlock.video_id, setState(BlockVideoCellState.fromPlayer(ArticleViewer.this.videoPlayer, this)));
                }
            }
            super.onDetachedFromWindow();
            this.imageView.onDetachedFromWindow();
            DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
            this.firstFrameRendered = false;
        }

        public BlockVideoCellState setState(BlockVideoCellState blockVideoCellState) {
            Bitmap bitmap;
            Bitmap bitmap2;
            Bitmap bitmap3;
            BlockVideoCellState blockVideoCellState2 = this.videoState;
            if (blockVideoCellState2 != null && blockVideoCellState != null && (bitmap2 = blockVideoCellState.lastFrameBitmap) != null && (bitmap3 = blockVideoCellState2.lastFrameBitmap) != null && bitmap2 != bitmap3) {
                bitmap3.recycle();
                this.videoState.lastFrameBitmap = null;
            }
            BlockVideoCellState blockVideoCellState3 = this.videoState;
            if (blockVideoCellState3 != null && blockVideoCellState != null && blockVideoCellState.lastFrameBitmap == null && (bitmap = blockVideoCellState3.lastFrameBitmap) != null) {
                blockVideoCellState.playFrom = blockVideoCellState3.playFrom;
                blockVideoCellState.lastFrameBitmap = bitmap;
            }
            this.videoState = blockVideoCellState;
            return blockVideoCellState;
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageView.onAttachedToWindow();
            updateButtonState(false);
        }

        public void startVideoPlayer() {
            if (this.currentDocument != null) {
                ArticleViewer articleViewer = ArticleViewer.this;
                if (articleViewer.videoPlayer != null) {
                    return;
                }
                articleViewer.videoPlayer = new VideoPlayerHolderBase() {
                    @Override
                    public boolean needRepeat() {
                        return true;
                    }

                    @Override
                    public void onRenderedFirstFrame() {
                        super.onRenderedFirstFrame();
                        if (this.firstFrameRendered) {
                            return;
                        }
                        this.firstFrameRendered = true;
                        BlockVideoCell.this.textureView.setAlpha(1.0f);
                        if (BlockVideoCell.this.currentBlock != null) {
                            LongSparseArray longSparseArray = ArticleViewer.this.videoStates;
                            long j = BlockVideoCell.this.currentBlock.video_id;
                            BlockVideoCell blockVideoCell = BlockVideoCell.this;
                            longSparseArray.put(j, blockVideoCell.setState(BlockVideoCellState.fromPlayer(ArticleViewer.this.videoPlayer, blockVideoCell)));
                        }
                    }
                }.with(this.textureView);
                TLRPC$Document tLRPC$Document = this.currentDocument;
                for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
                    if (tLRPC$Document.attributes.get(i) instanceof TLRPC$TL_documentAttributeVideo) {
                        TLRPC$TL_documentAttributeVideo tLRPC$TL_documentAttributeVideo = (TLRPC$TL_documentAttributeVideo) tLRPC$Document.attributes.get(i);
                        this.aspectRatioFrameLayout.setAspectRatio(tLRPC$TL_documentAttributeVideo.w / tLRPC$TL_documentAttributeVideo.h, 0);
                    }
                }
                Uri prepareUri = this.parentAdapter.currentPage == null ? null : FileStreamLoadOperation.prepareUri(ArticleViewer.this.currentAccount, tLRPC$Document, this.parentAdapter.currentPage);
                if (prepareUri == null) {
                    return;
                }
                VideoPlayerHolderBase videoPlayerHolderBase = ArticleViewer.this.videoPlayer;
                BlockVideoCellState blockVideoCellState = this.videoState;
                videoPlayerHolderBase.seekTo(blockVideoCellState == null ? 0L : blockVideoCellState.playFrom);
                ArticleViewer.this.videoPlayer.preparePlayer(prepareUri, true, 1.0f);
                ArticleViewer.this.videoPlayer.play();
            }
        }

        @Override
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(false);
        }

        @Override
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            if (this.isGif) {
                this.buttonState = 2;
                didPressedButton(true);
            } else {
                updateButtonState(true);
            }
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, ((float) j) / ((float) j2)), true);
            if (this.buttonState != 1) {
                updateButtonState(true);
            }
        }

        @Override
        public int getObserverTag() {
            return this.TAG;
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString("AttachVideo", R.string.AttachVideo));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            accessibilityNodeInfo.setText(sb.toString());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    public class BlockAudioCell extends View implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
        private int buttonPressed;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockAudio currentBlock;
        private TLRPC$Document currentDocument;
        private MessageObject currentMessageObject;
        private StaticLayout durationLayout;
        private boolean isFirst;
        private String lastTimeString;
        private WebpageAdapter parentAdapter;
        private RadialProgress2 radialProgress;
        private SeekBar seekBar;
        private int seekBarX;
        private int seekBarY;
        private int textX;
        private int textY;
        private DrawingText titleLayout;

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public BlockAudioCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textY = AndroidUtilities.dp(58.0f);
            this.parentAdapter = webpageAdapter;
            RadialProgress2 radialProgress2 = new RadialProgress2(this);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
            this.TAG = DownloadController.getInstance(ArticleViewer.this.currentAccount).generateObserverTag();
            SeekBar seekBar = new SeekBar(this);
            this.seekBar = seekBar;
            seekBar.setDelegate(new SeekBar.SeekBarDelegate() {
                @Override
                public boolean isSeekBarDragAllowed() {
                    return SeekBar.SeekBarDelegate.CC.$default$isSeekBarDragAllowed(this);
                }

                @Override
                public void onSeekBarContinuousDrag(float f) {
                    SeekBar.SeekBarDelegate.CC.$default$onSeekBarContinuousDrag(this, f);
                }

                @Override
                public final void onSeekBarDrag(float f) {
                    ArticleViewer.BlockAudioCell.this.lambda$new$0(f);
                }

                @Override
                public void onSeekBarPressed() {
                    SeekBar.SeekBarDelegate.CC.$default$onSeekBarPressed(this);
                }

                @Override
                public void onSeekBarReleased() {
                    SeekBar.SeekBarDelegate.CC.$default$onSeekBarReleased(this);
                }

                @Override
                public boolean reverseWaveform() {
                    return SeekBar.SeekBarDelegate.CC.$default$reverseWaveform(this);
                }
            });
        }

        public void lambda$new$0(float f) {
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject == null) {
                return;
            }
            messageObject.audioProgress = f;
            MediaController.getInstance().seekToProgress(this.currentMessageObject, f);
        }

        public void setBlock(TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio, boolean z, boolean z2) {
            this.currentBlock = tLRPC$TL_pageBlockAudio;
            MessageObject messageObject = (MessageObject) this.parentAdapter.audioBlocks.get(this.currentBlock);
            this.currentMessageObject = messageObject;
            if (messageObject != null) {
                this.currentDocument = messageObject.getDocument();
            }
            this.isFirst = z;
            SeekBar seekBar = this.seekBar;
            int themedColor = ArticleViewer.this.getThemedColor(Theme.key_chat_inAudioSeekbar);
            int themedColor2 = ArticleViewer.this.getThemedColor(Theme.key_chat_inAudioCacheSeekbar);
            ArticleViewer articleViewer = ArticleViewer.this;
            int i = Theme.key_chat_inAudioSeekbarFill;
            seekBar.setColors(themedColor, themedColor2, articleViewer.getThemedColor(i), ArticleViewer.this.getThemedColor(i), ArticleViewer.this.getThemedColor(Theme.key_chat_inAudioSeekbarSelected));
            updateButtonState(false);
            requestLayout();
        }

        public MessageObject getMessageObject() {
            return this.currentMessageObject;
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockAudioCell.onTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        @SuppressLint({"DrawAllocation", "NewApi"})
        protected void onMeasure(int i, int i2) {
            SpannableStringBuilder spannableStringBuilder;
            int i3 = 1;
            int size = View.MeasureSpec.getSize(i);
            int dp = AndroidUtilities.dp(54.0f);
            TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio = this.currentBlock;
            if (tLRPC$TL_pageBlockAudio != null) {
                if (tLRPC$TL_pageBlockAudio.level > 0) {
                    this.textX = AndroidUtilities.dp(r0 * 14) + AndroidUtilities.dp(18.0f);
                } else {
                    this.textX = AndroidUtilities.dp(18.0f);
                }
                int dp2 = (size - this.textX) - AndroidUtilities.dp(18.0f);
                int dp3 = AndroidUtilities.dp(44.0f);
                this.buttonX = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(5.0f);
                this.buttonY = dp4;
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i4 = this.buttonX;
                radialProgress2.setProgressRect(i4, dp4, i4 + dp3, dp4 + dp3);
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio2 = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockAudio2.caption.text, dp2, this.textY, tLRPC$TL_pageBlockAudio2, this.parentAdapter);
                this.captionLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp5 = AndroidUtilities.dp(8.0f) + this.captionLayout.getHeight();
                    this.creditOffset = dp5;
                    dp += dp5 + AndroidUtilities.dp(8.0f);
                }
                int i5 = dp;
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio3 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockAudio3.caption.credit, dp2, this.textY + this.creditOffset, tLRPC$TL_pageBlockAudio3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i5 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                }
                if (!this.isFirst && this.currentBlock.level <= 0) {
                    i5 += AndroidUtilities.dp(8.0f);
                }
                String musicAuthor = this.currentMessageObject.getMusicAuthor(false);
                String musicTitle = this.currentMessageObject.getMusicTitle(false);
                int dp6 = this.buttonX + AndroidUtilities.dp(50.0f) + dp3;
                this.seekBarX = dp6;
                int dp7 = (size - dp6) - AndroidUtilities.dp(18.0f);
                if (!TextUtils.isEmpty(musicTitle) || !TextUtils.isEmpty(musicAuthor)) {
                    if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                        spannableStringBuilder = new SpannableStringBuilder(String.format("%s - %s", musicAuthor, musicTitle));
                    } else if (!TextUtils.isEmpty(musicTitle)) {
                        spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                    }
                    if (!TextUtils.isEmpty(musicAuthor)) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                    }
                    CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, Theme.chat_audioTitlePaint, dp7, TextUtils.TruncateAt.END);
                    DrawingText drawingText = new DrawingText();
                    this.titleLayout = drawingText;
                    drawingText.textLayout = new StaticLayout(ellipsize, ArticleViewer.audioTimePaint, dp7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.titleLayout.parentBlock = this.currentBlock;
                    this.seekBarY = this.buttonY + ((dp3 - AndroidUtilities.dp(30.0f)) / 2) + AndroidUtilities.dp(11.0f);
                } else {
                    this.titleLayout = null;
                    this.seekBarY = this.buttonY + ((dp3 - AndroidUtilities.dp(30.0f)) / 2);
                }
                this.seekBar.setSize(dp7, AndroidUtilities.dp(30.0f));
                i3 = i5;
            }
            setMeasuredDimension(size, i3);
            updatePlayingMessageProgress();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            this.radialProgress.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
            this.radialProgress.setProgressColor(ArticleViewer.this.getThemedColor(Theme.key_chat_inFileProgress));
            this.radialProgress.draw(canvas);
            canvas.save();
            canvas.translate(this.seekBarX, this.seekBarY);
            this.seekBar.draw(canvas);
            canvas.restore();
            if (this.durationLayout != null) {
                canvas.save();
                canvas.translate(this.buttonX + AndroidUtilities.dp(54.0f), this.seekBarY + AndroidUtilities.dp(6.0f));
                this.durationLayout.draw(canvas);
                canvas.restore();
            }
            if (this.titleLayout != null) {
                canvas.save();
                this.titleLayout.x = this.buttonX + AndroidUtilities.dp(54.0f);
                this.titleLayout.y = this.seekBarY - AndroidUtilities.dp(16.0f);
                DrawingText drawingText = this.titleLayout;
                canvas.translate(drawingText.x, drawingText.y);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.titleLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            } else {
                i = 0;
            }
            if (this.captionLayout != null) {
                canvas.save();
                DrawingText drawingText2 = this.captionLayout;
                int i2 = this.textX;
                drawingText2.x = i2;
                int i3 = this.textY;
                drawingText2.y = i3;
                canvas.translate(i2, i3);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i++;
            }
            if (this.creditLayout != null) {
                canvas.save();
                DrawingText drawingText3 = this.creditLayout;
                int i4 = this.textX;
                drawingText3.x = i4;
                int i5 = this.textY + this.creditOffset;
                drawingText3.y = i5;
                canvas.translate(i4, i5);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        private int getIconForCurrentState() {
            int i = this.buttonState;
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            return i == 3 ? 3 : 0;
        }

        public void updatePlayingMessageProgress() {
            int i;
            if (this.currentDocument == null || this.currentMessageObject == null) {
                return;
            }
            if (!this.seekBar.isDragging()) {
                this.seekBar.setProgress(this.currentMessageObject.audioProgress);
            }
            if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.currentDocument.attributes.size()) {
                        break;
                    }
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = this.currentDocument.attributes.get(i2);
                    if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                        i = (int) tLRPC$DocumentAttribute.duration;
                        break;
                    }
                    i2++;
                }
            } else {
                i = this.currentMessageObject.audioProgressSec;
            }
            String formatShortDuration = AndroidUtilities.formatShortDuration(i);
            String str = this.lastTimeString;
            if (str == null || !str.equals(formatShortDuration)) {
                this.lastTimeString = formatShortDuration;
                ArticleViewer.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.durationLayout = new StaticLayout(formatShortDuration, ArticleViewer.audioTimePaint, (int) Math.ceil(ArticleViewer.audioTimePaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            ArticleViewer.audioTimePaint.setColor(ArticleViewer.this.getTextColor());
            invalidate();
        }

        public void updateButtonState(boolean z) {
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            boolean exists = FileLoader.getInstance(ArticleViewer.this.currentAccount).getPathToAttach(this.currentDocument, true).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (exists) {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
                boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
                if (!isPlayingMessage || (isPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.buttonState = 0;
                } else {
                    this.buttonState = 1;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                if (!FileLoader.getInstance(ArticleViewer.this.currentAccount).isLoadingFile(attachFileName)) {
                    this.buttonState = 2;
                    this.radialProgress.setProgress(0.0f, z);
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                } else {
                    this.buttonState = 3;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        this.radialProgress.setProgress(fileProgress.floatValue(), z);
                    } else {
                        this.radialProgress.setProgress(0.0f, z);
                    }
                    this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                }
            }
            updatePlayingMessageProgress();
        }

        private void didPressedButton(boolean z) {
            int i = this.buttonState;
            if (i == 0) {
                if (MediaController.getInstance().setPlaylist(this.parentAdapter.audioMessages, this.currentMessageObject, 0L, false, null)) {
                    this.buttonState = 1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    invalidate();
                    return;
                }
                return;
            }
            if (i == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    invalidate();
                    return;
                }
                return;
            }
            if (i == 2) {
                this.radialProgress.setProgress(0.0f, false);
                FileLoader.getInstance(ArticleViewer.this.currentAccount).loadFile(this.currentDocument, this.parentAdapter.currentPage, 1, 1);
                this.buttonState = 3;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                invalidate();
                return;
            }
            if (i == 3) {
                FileLoader.getInstance(ArticleViewer.this.currentAccount).cancelLoadFile(this.currentDocument);
                this.buttonState = 2;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateButtonState(false);
        }

        @Override
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(true);
        }

        @Override
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            updateButtonState(true);
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, ((float) j) / ((float) j2)), true);
            if (this.buttonState != 3) {
                updateButtonState(true);
            }
        }

        @Override
        public int getObserverTag() {
            return this.TAG;
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.captionLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
            DrawingText drawingText3 = this.creditLayout;
            if (drawingText3 != null) {
                arrayList.add(drawingText3);
            }
        }
    }

    public class BlockEmbedPostCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private AvatarDrawable avatarDrawable;
        private ImageReceiver avatarImageView;
        private boolean avatarVisible;
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockEmbedPost currentBlock;
        private DrawingText dateLayout;
        private int lineHeight;
        private DrawingText nameLayout;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;

        public BlockEmbedPostCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.avatarImageView = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
            this.avatarImageView.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
            this.avatarDrawable = new AvatarDrawable();
        }

        public void setBlock(TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost) {
            this.currentBlock = tLRPC$TL_pageBlockEmbedPost;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost = this.currentBlock;
            int i3 = 1;
            if (tLRPC$TL_pageBlockEmbedPost != null) {
                if (tLRPC$TL_pageBlockEmbedPost instanceof TL_pageBlockEmbedPostCaption) {
                    this.textX = AndroidUtilities.dp(18.0f);
                    this.textY = AndroidUtilities.dp(4.0f);
                    int dp = size - AndroidUtilities.dp(50.0f);
                    ArticleViewer articleViewer = ArticleViewer.this;
                    TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost2 = this.currentBlock;
                    DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbedPost2.caption.text, dp, this.textY, tLRPC$TL_pageBlockEmbedPost2, this.parentAdapter);
                    this.captionLayout = createLayoutForText;
                    if (createLayoutForText != null) {
                        int dp2 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                        this.creditOffset = dp2;
                        r13 = dp2 + AndroidUtilities.dp(4.0f);
                    }
                    ArticleViewer articleViewer2 = ArticleViewer.this;
                    TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost3 = this.currentBlock;
                    DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbedPost3.caption.credit, dp, this.textY + this.creditOffset, tLRPC$TL_pageBlockEmbedPost3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                    this.creditLayout = createLayoutForText2;
                    if (createLayoutForText2 != null) {
                        r13 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    }
                    i3 = r13;
                } else {
                    long j = tLRPC$TL_pageBlockEmbedPost.author_photo_id;
                    boolean z = j != 0;
                    this.avatarVisible = z;
                    if (z) {
                        TLRPC$Photo photoWithId = this.parentAdapter.getPhotoWithId(j);
                        boolean z2 = photoWithId instanceof TLRPC$TL_photo;
                        this.avatarVisible = z2;
                        if (z2) {
                            this.avatarDrawable.setInfo(0L, this.currentBlock.author, null);
                            this.avatarImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.dp(40.0f), true), photoWithId), "40_40", this.avatarDrawable, 0L, (String) null, this.parentAdapter.currentPage, 1);
                        }
                    }
                    ArticleViewer articleViewer3 = ArticleViewer.this;
                    String str = this.currentBlock.author;
                    int dp3 = size - AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 50);
                    TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost4 = this.currentBlock;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    DrawingText createLayoutForText3 = articleViewer3.createLayoutForText(this, str, null, dp3, 0, tLRPC$TL_pageBlockEmbedPost4, alignment, 1, this.parentAdapter);
                    this.nameLayout = createLayoutForText3;
                    if (createLayoutForText3 != null) {
                        createLayoutForText3.x = AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32);
                        this.nameLayout.y = AndroidUtilities.dp(this.dateLayout != null ? 10.0f : 19.0f);
                    }
                    if (this.currentBlock.date != 0) {
                        this.dateLayout = ArticleViewer.this.createLayoutForText(this, LocaleController.getInstance().getChatFullDate().format(this.currentBlock.date * 1000), null, size - AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 50), AndroidUtilities.dp(29.0f), this.currentBlock, this.parentAdapter);
                    } else {
                        this.dateLayout = null;
                    }
                    int dp4 = AndroidUtilities.dp(56.0f);
                    if (this.currentBlock.blocks.isEmpty()) {
                        this.textX = AndroidUtilities.dp(32.0f);
                        this.textY = AndroidUtilities.dp(56.0f);
                        int dp5 = size - AndroidUtilities.dp(50.0f);
                        ArticleViewer articleViewer4 = ArticleViewer.this;
                        TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost5 = this.currentBlock;
                        DrawingText createLayoutForText4 = articleViewer4.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbedPost5.caption.text, dp5, this.textY, tLRPC$TL_pageBlockEmbedPost5, this.parentAdapter);
                        this.captionLayout = createLayoutForText4;
                        if (createLayoutForText4 != null) {
                            int dp6 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                            this.creditOffset = dp6;
                            dp4 += dp6 + AndroidUtilities.dp(4.0f);
                        }
                        int i4 = dp4;
                        ArticleViewer articleViewer5 = ArticleViewer.this;
                        TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost6 = this.currentBlock;
                        DrawingText createLayoutForText5 = articleViewer5.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbedPost6.caption.credit, dp5, this.textY + this.creditOffset, tLRPC$TL_pageBlockEmbedPost6, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : alignment, this.parentAdapter);
                        this.creditLayout = createLayoutForText5;
                        dp4 = createLayoutForText5 != null ? i4 + AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight() : i4;
                    } else {
                        this.captionLayout = null;
                        this.creditLayout = null;
                    }
                    DrawingText drawingText = this.dateLayout;
                    if (drawingText != null) {
                        drawingText.x = AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32);
                        this.dateLayout.y = AndroidUtilities.dp(29.0f);
                    }
                    DrawingText drawingText2 = this.captionLayout;
                    if (drawingText2 != null) {
                        drawingText2.x = this.textX;
                        drawingText2.y = this.textY;
                    }
                    DrawingText drawingText3 = this.creditLayout;
                    if (drawingText3 != null) {
                        drawingText3.x = this.textX;
                        drawingText3.y = this.textY;
                    }
                    i3 = dp4;
                }
                this.lineHeight = i3;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost = this.currentBlock;
            if (tLRPC$TL_pageBlockEmbedPost == null) {
                return;
            }
            if (!(tLRPC$TL_pageBlockEmbedPost instanceof TL_pageBlockEmbedPostCaption)) {
                if (this.avatarVisible) {
                    this.avatarImageView.draw(canvas);
                }
                if (this.nameLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32), AndroidUtilities.dp(this.dateLayout != null ? 10.0f : 19.0f));
                    ArticleViewer.this.drawTextSelection(canvas, this, 0);
                    this.nameLayout.draw(canvas, this);
                    canvas.restore();
                    i = 1;
                } else {
                    i = 0;
                }
                if (this.dateLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32), AndroidUtilities.dp(29.0f));
                    ArticleViewer.this.drawTextSelection(canvas, this, i);
                    this.dateLayout.draw(canvas, this);
                    canvas.restore();
                    i++;
                }
                canvas.drawRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(20.0f), this.lineHeight - (this.currentBlock.level == 0 ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
                r1 = i;
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, r1);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                r1++;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, r1);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.nameLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.dateLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
            DrawingText drawingText3 = this.captionLayout;
            if (drawingText3 != null) {
                arrayList.add(drawingText3);
            }
            DrawingText drawingText4 = this.creditLayout;
            if (drawingText4 != null) {
                arrayList.add(drawingText4);
            }
        }
    }

    public class BlockParagraphCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockParagraph currentBlock;
        private WebpageAdapter parentAdapter;
        public DrawingText textLayout;
        public int textX;
        public int textY;

        public BlockParagraphCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockParagraph tLRPC$TL_pageBlockParagraph) {
            this.currentBlock = tLRPC$TL_pageBlockParagraph;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            int dp;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockParagraph tLRPC$TL_pageBlockParagraph = this.currentBlock;
            if (tLRPC$TL_pageBlockParagraph != null) {
                i3 = 0;
                if (tLRPC$TL_pageBlockParagraph.level == 0) {
                    this.textY = AndroidUtilities.dp(8.0f);
                    this.textX = AndroidUtilities.dp(18.0f);
                } else {
                    this.textY = 0;
                    this.textX = AndroidUtilities.dp((r15 * 14) + 18);
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.text, (size - AndroidUtilities.dp(18.0f)) - this.textX, this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, 0, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int height = createLayoutForText.getHeight();
                    if (this.currentBlock.level > 0) {
                        dp = AndroidUtilities.dp(8.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    i3 = height + dp;
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(drawingText.getText());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public class BlockEmbedCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockEmbed currentBlock;
        private int exactWebViewHeight;
        private int listX;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;
        private final WebPlayerView videoView;
        private boolean wasUserInteraction;
        private final TouchyWebView webView;

        public class TelegramWebviewProxy {
            private TelegramWebviewProxy() {
            }

            @JavascriptInterface
            public void postEvent(final String str, final String str2) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArticleViewer.BlockEmbedCell.TelegramWebviewProxy.this.lambda$postEvent$0(str, str2);
                    }
                });
            }

            public void lambda$postEvent$0(String str, String str2) {
                if ("resize_frame".equals(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        BlockEmbedCell.this.exactWebViewHeight = Utilities.parseInt((CharSequence) jSONObject.getString("height")).intValue();
                        BlockEmbedCell.this.requestLayout();
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        public class TouchyWebView extends WebView {
            public TouchyWebView(Context context) {
                super(context);
                setFocusable(false);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                BlockEmbedCell.this.wasUserInteraction = true;
                if (BlockEmbedCell.this.currentBlock != null) {
                    if (!BlockEmbedCell.this.currentBlock.allow_scrolling) {
                        ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(true);
                    } else {
                        requestDisallowInterceptTouchEvent(true);
                    }
                }
                return super.onTouchEvent(motionEvent);
            }
        }

        @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
        public BlockEmbedCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                WebPlayerView webPlayerView = new WebPlayerView(context, false, false, new WebPlayerView.WebPlayerViewDelegate() {
                    @Override
                    public boolean checkInlinePermissions() {
                        return false;
                    }

                    @Override
                    public ViewGroup getTextureViewContainer() {
                        return null;
                    }

                    @Override
                    public void onInlineSurfaceTextureReady() {
                    }

                    @Override
                    public TextureView onSwitchInlineMode(View view, boolean z, int i, int i2, int i3, boolean z2) {
                        return null;
                    }

                    @Override
                    public void prepareToSwitchInlineMode(boolean z, Runnable runnable, float f, boolean z2) {
                    }

                    @Override
                    public void onInitFailed() {
                        BlockEmbedCell.this.webView.setVisibility(0);
                        BlockEmbedCell.this.videoView.setVisibility(4);
                        BlockEmbedCell.this.videoView.loadVideo(null, null, null, null, false);
                        HashMap hashMap = new HashMap();
                        hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
                        BlockEmbedCell.this.webView.loadUrl(BlockEmbedCell.this.currentBlock.url, hashMap);
                    }

                    @Override
                    public void onVideoSizeChanged(float f, int i) {
                        ArticleViewer.this.fullscreenAspectRatioView.setAspectRatio(f, i);
                    }

                    @Override
                    public TextureView onSwitchToFullscreen(View view, boolean z, float f, int i, boolean z2) {
                        if (z) {
                            ArticleViewer.this.fullscreenAspectRatioView.addView(ArticleViewer.this.fullscreenTextureView, LayoutHelper.createFrame(-1, -1.0f));
                            ArticleViewer.this.fullscreenAspectRatioView.setVisibility(0);
                            ArticleViewer.this.fullscreenAspectRatioView.setAspectRatio(f, i);
                            BlockEmbedCell blockEmbedCell = BlockEmbedCell.this;
                            ArticleViewer.this.fullscreenedVideo = blockEmbedCell.videoView;
                            ArticleViewer.this.fullscreenVideoContainer.addView(view, LayoutHelper.createFrame(-1, -1.0f));
                            ArticleViewer.this.fullscreenVideoContainer.setVisibility(0);
                        } else {
                            ArticleViewer.this.fullscreenAspectRatioView.removeView(ArticleViewer.this.fullscreenTextureView);
                            ArticleViewer.this.fullscreenedVideo = null;
                            ArticleViewer.this.fullscreenAspectRatioView.setVisibility(8);
                            ArticleViewer.this.fullscreenVideoContainer.setVisibility(4);
                        }
                        return ArticleViewer.this.fullscreenTextureView;
                    }

                    @Override
                    public void onSharePressed() {
                        if (ArticleViewer.this.parentActivity == null) {
                            return;
                        }
                        ArticleViewer.this.showDialog(new ShareAlert(ArticleViewer.this.parentActivity, null, BlockEmbedCell.this.currentBlock.url, false, BlockEmbedCell.this.currentBlock.url, false));
                    }

                    @Override
                    public void onPlayStateChanged(WebPlayerView webPlayerView2, boolean z) {
                        if (z) {
                            if (ArticleViewer.this.currentPlayingVideo != null && ArticleViewer.this.currentPlayingVideo != webPlayerView2) {
                                ArticleViewer.this.currentPlayingVideo.pause();
                            }
                            ArticleViewer.this.currentPlayingVideo = webPlayerView2;
                            try {
                                ArticleViewer.this.parentActivity.getWindow().addFlags(128);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                        if (ArticleViewer.this.currentPlayingVideo == webPlayerView2) {
                            ArticleViewer.this.currentPlayingVideo = null;
                        }
                        try {
                            ArticleViewer.this.parentActivity.getWindow().clearFlags(128);
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                    }
                });
                this.videoView = webPlayerView;
                addView(webPlayerView);
                ArticleViewer.this.createdWebViews.add(this);
                TouchyWebView touchyWebView = new TouchyWebView(context);
                this.webView = touchyWebView;
                touchyWebView.getSettings().setJavaScriptEnabled(true);
                touchyWebView.getSettings().setDomStorageEnabled(true);
                touchyWebView.getSettings().setAllowContentAccess(true);
                int i = Build.VERSION.SDK_INT;
                touchyWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                touchyWebView.addJavascriptInterface(new TelegramWebviewProxy(), "TelegramWebviewProxy");
                if (i >= 21) {
                    touchyWebView.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(touchyWebView, true);
                }
                touchyWebView.setWebChromeClient(new AnonymousClass2(ArticleViewer.this));
                touchyWebView.setWebViewClient(new AnonymousClass3(ArticleViewer.this));
                addView(touchyWebView);
                return;
            }
            this.videoView = null;
            this.webView = null;
        }

        public class AnonymousClass2 extends WebChromeClient {
            final ArticleViewer val$this$0;

            AnonymousClass2(ArticleViewer articleViewer) {
                this.val$this$0 = articleViewer;
            }

            @Override
            public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
                onShowCustomView(view, customViewCallback);
            }

            @Override
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                if (ArticleViewer.this.customView == null) {
                    ArticleViewer.this.customView = view;
                    ArticleViewer.this.customViewCallback = customViewCallback;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ArticleViewer.BlockEmbedCell.AnonymousClass2.this.lambda$onShowCustomView$0();
                        }
                    }, 100L);
                    return;
                }
                customViewCallback.onCustomViewHidden();
            }

            public void lambda$onShowCustomView$0() {
                if (ArticleViewer.this.customView != null) {
                    ArticleViewer.this.fullscreenVideoContainer.addView(ArticleViewer.this.customView, LayoutHelper.createFrame(-1, -1.0f));
                    ArticleViewer.this.fullscreenVideoContainer.setVisibility(0);
                }
            }

            @Override
            public void onHideCustomView() {
                super.onHideCustomView();
                if (ArticleViewer.this.customView == null) {
                    return;
                }
                ArticleViewer.this.fullscreenVideoContainer.setVisibility(4);
                ArticleViewer.this.fullscreenVideoContainer.removeView(ArticleViewer.this.customView);
                if (ArticleViewer.this.customViewCallback != null && !ArticleViewer.this.customViewCallback.getClass().getName().contains(".chromium.")) {
                    ArticleViewer.this.customViewCallback.onCustomViewHidden();
                }
                ArticleViewer.this.customView = null;
            }
        }

        public class AnonymousClass3 extends WebViewClient {
            final ArticleViewer val$this$0;

            AnonymousClass3(ArticleViewer articleViewer) {
                this.val$this$0 = articleViewer;
            }

            @Override
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity != null && launchActivity.isFinishing()) {
                    return true;
                }
                new AlertDialog.Builder(BlockEmbedCell.this.getContext(), null).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() {
                    @Override
                    public final void run() {
                        ArticleViewer.BlockEmbedCell.AnonymousClass3.this.lambda$onRenderProcessGone$0();
                    }
                })).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return true;
            }

            public void lambda$onRenderProcessGone$0() {
                Browser.openUrl(BlockEmbedCell.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
            }

            @Override
            public void onLoadResource(WebView webView, String str) {
                super.onLoadResource(webView, str);
            }

            @Override
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (!BlockEmbedCell.this.wasUserInteraction) {
                    return false;
                }
                Browser.openUrl(ArticleViewer.this.parentActivity, str);
                return true;
            }
        }

        public void destroyWebView(boolean z) {
            try {
                TouchyWebView touchyWebView = this.webView;
                if (touchyWebView != null) {
                    touchyWebView.stopLoading();
                    this.webView.loadUrl("about:blank");
                    if (z) {
                        this.webView.destroy();
                    }
                }
                this.currentBlock = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
            WebPlayerView webPlayerView = this.videoView;
            if (webPlayerView != null) {
                webPlayerView.destroy();
            }
        }

        public void setBlock(TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed) {
            TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed2 = this.currentBlock;
            this.currentBlock = tLRPC$TL_pageBlockEmbed;
            TouchyWebView touchyWebView = this.webView;
            if (touchyWebView != null) {
                touchyWebView.setBackgroundColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite));
            }
            TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed3 = this.currentBlock;
            if (tLRPC$TL_pageBlockEmbed2 != tLRPC$TL_pageBlockEmbed3) {
                this.wasUserInteraction = false;
                TouchyWebView touchyWebView2 = this.webView;
                if (touchyWebView2 != null) {
                    if (tLRPC$TL_pageBlockEmbed3.allow_scrolling) {
                        touchyWebView2.setVerticalScrollBarEnabled(true);
                        this.webView.setHorizontalScrollBarEnabled(true);
                    } else {
                        touchyWebView2.setVerticalScrollBarEnabled(false);
                        this.webView.setHorizontalScrollBarEnabled(false);
                    }
                }
                this.exactWebViewHeight = 0;
                TouchyWebView touchyWebView3 = this.webView;
                if (touchyWebView3 != null) {
                    try {
                        touchyWebView3.loadUrl("about:blank");
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                try {
                    TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed4 = this.currentBlock;
                    String str = tLRPC$TL_pageBlockEmbed4.html;
                    if (str != null) {
                        TouchyWebView touchyWebView4 = this.webView;
                        if (touchyWebView4 != null) {
                            touchyWebView4.loadDataWithBaseURL("https://telegram.org/embed", str, "text/html", "UTF-8", null);
                            this.webView.setVisibility(0);
                        }
                        WebPlayerView webPlayerView = this.videoView;
                        if (webPlayerView != null) {
                            webPlayerView.setVisibility(4);
                            this.videoView.loadVideo(null, null, null, null, false);
                        }
                    } else {
                        long j = tLRPC$TL_pageBlockEmbed4.poster_photo_id;
                        if (this.videoView.loadVideo(tLRPC$TL_pageBlockEmbed.url, j != 0 ? this.parentAdapter.getPhotoWithId(j) : null, this.parentAdapter.currentPage, null, false)) {
                            TouchyWebView touchyWebView5 = this.webView;
                            if (touchyWebView5 != null) {
                                touchyWebView5.setVisibility(4);
                                this.webView.stopLoading();
                                this.webView.loadUrl("about:blank");
                            }
                            WebPlayerView webPlayerView2 = this.videoView;
                            if (webPlayerView2 != null) {
                                webPlayerView2.setVisibility(0);
                            }
                        } else {
                            TouchyWebView touchyWebView6 = this.webView;
                            if (touchyWebView6 != null) {
                                touchyWebView6.setVisibility(0);
                                HashMap hashMap = new HashMap();
                                hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
                                this.webView.loadUrl(this.currentBlock.url, hashMap);
                            }
                            WebPlayerView webPlayerView3 = this.videoView;
                            if (webPlayerView3 != null) {
                                webPlayerView3.setVisibility(4);
                                this.videoView.loadVideo(null, null, null, null, false);
                            }
                        }
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            requestLayout();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (ArticleViewer.this.isVisible) {
                return;
            }
            this.currentBlock = null;
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override
        @android.annotation.SuppressLint({"NewApi"})
        protected void onMeasure(int r13, int r14) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockEmbedCell.onMeasure(int, int):void");
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            TouchyWebView touchyWebView = this.webView;
            if (touchyWebView != null) {
                int i5 = this.listX;
                touchyWebView.layout(i5, 0, touchyWebView.getMeasuredWidth() + i5, this.webView.getMeasuredHeight());
            }
            WebPlayerView webPlayerView = this.videoView;
            if (webPlayerView == null || webPlayerView.getParent() != this) {
                return;
            }
            WebPlayerView webPlayerView2 = this.videoView;
            int i6 = this.listX;
            webPlayerView2.layout(i6, 0, webPlayerView2.getMeasuredWidth() + i6, this.videoView.getMeasuredHeight());
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            } else {
                i = 0;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    public class BlockTableCell extends FrameLayout implements TableLayout.TableLayoutDelegate, TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockTable currentBlock;
        private boolean firstLayout;
        private int listX;
        private int listY;
        private WebpageAdapter parentAdapter;
        private HorizontalScrollView scrollView;
        private TableLayout tableLayout;
        private int textX;
        private int textY;
        private DrawingText titleLayout;

        public BlockTableCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context) {
                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
                    if (BlockTableCell.this.tableLayout.getMeasuredWidth() > getMeasuredWidth() - AndroidUtilities.dp(36.0f) && onInterceptTouchEvent) {
                        ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(true);
                    }
                    return onInterceptTouchEvent;
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (BlockTableCell.this.tableLayout.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
                        return false;
                    }
                    return super.onTouchEvent(motionEvent);
                }

                @Override
                protected void onScrollChanged(int i, int i2, int i3, int i4) {
                    super.onScrollChanged(i, i2, i3, i4);
                    if (ArticleViewer.this.pressedLinkOwnerLayout != null) {
                        ArticleViewer.this.pressedLinkOwnerLayout = null;
                        ArticleViewer.this.pressedLinkOwnerView = null;
                    }
                    BlockTableCell.this.updateChildTextPositions();
                    TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = ArticleViewer.this.textSelectionHelper;
                    if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
                        return;
                    }
                    ArticleViewer.this.textSelectionHelper.invalidate();
                }

                @Override
                protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
                    ArticleViewer.this.removePressedLink();
                    return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
                }

                @Override
                protected void onMeasure(int i, int i2) {
                    BlockTableCell.this.tableLayout.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), 0), i2);
                    setMeasuredDimension(View.MeasureSpec.getSize(i), BlockTableCell.this.tableLayout.getMeasuredHeight());
                }
            };
            this.scrollView = horizontalScrollView;
            horizontalScrollView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            this.scrollView.setClipToPadding(false);
            addView(this.scrollView, LayoutHelper.createFrame(-1, -2.0f));
            TableLayout tableLayout = new TableLayout(context, this, ArticleViewer.this.textSelectionHelper);
            this.tableLayout = tableLayout;
            tableLayout.setOrientation(0);
            this.tableLayout.setRowOrderPreserved(true);
            this.scrollView.addView(this.tableLayout, new FrameLayout.LayoutParams(-2, -2));
            setWillNotDraw(false);
        }

        @Override
        public DrawingText createTextLayout(TLRPC$TL_pageTableCell tLRPC$TL_pageTableCell, int i) {
            Layout.Alignment alignment;
            if (tLRPC$TL_pageTableCell == null) {
                return null;
            }
            if (tLRPC$TL_pageTableCell.align_right) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (tLRPC$TL_pageTableCell.align_center) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            return ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageTableCell.text, i, -1, this.currentBlock, alignment, 0, this.parentAdapter);
        }

        @Override
        public Paint getLinePaint() {
            return ArticleViewer.tableLinePaint;
        }

        public Paint getHalfLinePaint() {
            return ArticleViewer.tableHalfLinePaint;
        }

        @Override
        public Paint getHeaderPaint() {
            return ArticleViewer.tableHeaderPaint;
        }

        @Override
        public Paint getStripPaint() {
            return ArticleViewer.tableStripPaint;
        }

        @Override
        public void onLayoutChild(DrawingText drawingText, int i, int i2) {
            if (drawingText == null || ArticleViewer.this.searchResults.isEmpty() || ArticleViewer.this.searchText == null) {
                return;
            }
            String lowerCase = drawingText.textLayout.getText().toString().toLowerCase();
            int i3 = 0;
            while (true) {
                int indexOf = lowerCase.indexOf(ArticleViewer.this.searchText, i3);
                if (indexOf < 0) {
                    return;
                }
                int length = ArticleViewer.this.searchText.length() + indexOf;
                if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                    HashMap hashMap = ArticleViewer.this.pages[0].adapter.searchTextOffset;
                    String str = ArticleViewer.this.searchText + this.currentBlock + drawingText.parentText + indexOf;
                    StaticLayout staticLayout = drawingText.textLayout;
                    hashMap.put(str, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i2));
                }
                i3 = length;
            }
        }

        public void setBlock(TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable) {
            int i;
            this.currentBlock = tLRPC$TL_pageBlockTable;
            AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite));
            this.tableLayout.removeAllChildrens();
            this.tableLayout.setDrawLines(this.currentBlock.bordered);
            this.tableLayout.setStriped(this.currentBlock.striped);
            this.tableLayout.setRtl(this.parentAdapter.isRtl);
            if (this.currentBlock.rows.isEmpty()) {
                i = 0;
            } else {
                TLRPC$TL_pageTableRow tLRPC$TL_pageTableRow = this.currentBlock.rows.get(0);
                int size = tLRPC$TL_pageTableRow.cells.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = tLRPC$TL_pageTableRow.cells.get(i2).colspan;
                    if (i3 == 0) {
                        i3 = 1;
                    }
                    i += i3;
                }
            }
            int size2 = this.currentBlock.rows.size();
            for (int i4 = 0; i4 < size2; i4++) {
                TLRPC$TL_pageTableRow tLRPC$TL_pageTableRow2 = this.currentBlock.rows.get(i4);
                int size3 = tLRPC$TL_pageTableRow2.cells.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size3; i6++) {
                    TLRPC$TL_pageTableCell tLRPC$TL_pageTableCell = tLRPC$TL_pageTableRow2.cells.get(i6);
                    int i7 = tLRPC$TL_pageTableCell.colspan;
                    if (i7 == 0) {
                        i7 = 1;
                    }
                    int i8 = tLRPC$TL_pageTableCell.rowspan;
                    if (i8 == 0) {
                        i8 = 1;
                    }
                    if (tLRPC$TL_pageTableCell.text != null) {
                        this.tableLayout.addChild(tLRPC$TL_pageTableCell, i5, i4, i7);
                    } else {
                        this.tableLayout.addChild(i5, i4, i7, i8);
                    }
                    i5 += i7;
                }
            }
            this.tableLayout.setColumnCount(i);
            this.firstLayout = true;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i);
                if (ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, childAt.textLayout, (this.scrollView.getPaddingLeft() - this.scrollView.getScrollX()) + this.listX + childAt.getTextX(), this.listY + childAt.getTextY())) {
                    return true;
                }
            }
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.titleLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        public void invalidate() {
            super.invalidate();
            this.tableLayout.invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            int dp;
            int i4;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable = this.currentBlock;
            if (tLRPC$TL_pageBlockTable != null) {
                if (tLRPC$TL_pageBlockTable.level > 0) {
                    int dp2 = AndroidUtilities.dp(r14 * 14);
                    this.listX = dp2;
                    dp = dp2 + AndroidUtilities.dp(18.0f);
                    this.textX = dp;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.dp(18.0f);
                    dp = AndroidUtilities.dp(36.0f);
                }
                int i5 = size - dp;
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable2 = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockTable2.title, i5, 0, tLRPC$TL_pageBlockTable2, Layout.Alignment.ALIGN_CENTER, 0, this.parentAdapter);
                this.titleLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    this.textY = 0;
                    i4 = createLayoutForText.getHeight() + AndroidUtilities.dp(8.0f);
                    this.listY = i4;
                    DrawingText drawingText = this.titleLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    this.listY = AndroidUtilities.dp(8.0f);
                    i4 = 0;
                }
                this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size - this.listX, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                i3 = i4 + this.scrollView.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable3 = this.currentBlock;
                if (tLRPC$TL_pageBlockTable3.level > 0 && !tLRPC$TL_pageBlockTable3.bottom) {
                    i3 += AndroidUtilities.dp(8.0f);
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
            updateChildTextPositions();
        }

        public void updateChildTextPositions() {
            int i = this.titleLayout == null ? 0 : 1;
            int childCount = this.tableLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i2);
                DrawingText drawingText = childAt.textLayout;
                if (drawingText != null) {
                    drawingText.x = ((childAt.getTextX() + this.listX) + AndroidUtilities.dp(18.0f)) - this.scrollView.getScrollX();
                    childAt.textLayout.y = childAt.getTextY() + this.listY;
                    childAt.textLayout.row = childAt.getRow();
                    childAt.setSelectionIndex(i);
                    i++;
                }
            }
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            HorizontalScrollView horizontalScrollView = this.scrollView;
            int i5 = this.listX;
            horizontalScrollView.layout(i5, this.listY, horizontalScrollView.getMeasuredWidth() + i5, this.listY + this.scrollView.getMeasuredHeight());
            if (this.firstLayout) {
                if (this.parentAdapter.isRtl) {
                    this.scrollView.setScrollX((this.tableLayout.getMeasuredWidth() - this.scrollView.getMeasuredWidth()) + AndroidUtilities.dp(36.0f));
                } else {
                    this.scrollView.setScrollX(0);
                }
                this.firstLayout = false;
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            if (this.titleLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.titleLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                DrawingText drawingText2 = this.tableLayout.getChildAt(i).textLayout;
                if (drawingText2 != null) {
                    arrayList.add(drawingText2);
                }
            }
        }
    }

    public class BlockCollageCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockCollage currentBlock;
        private GroupedMessages group;
        private boolean inLayout;
        private RecyclerView.Adapter innerAdapter;
        private RecyclerListView innerListView;
        private int listX;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;

        public class GroupedMessages {
            public boolean hasSibling;
            public ArrayList<MessageObject.GroupedMessagePosition> posArray = new ArrayList<>();
            public HashMap<TLObject, MessageObject.GroupedMessagePosition> positions = new HashMap<>();
            private int maxSizeWidth = 1000;

            public GroupedMessages() {
            }

            public class MessageGroupedLayoutAttempt {
                public float[] heights;
                public int[] lineCounts;

                public MessageGroupedLayoutAttempt(int i, int i2, float f, float f2) {
                    this.lineCounts = new int[]{i, i2};
                    this.heights = new float[]{f, f2};
                }

                public MessageGroupedLayoutAttempt(int i, int i2, int i3, float f, float f2, float f3) {
                    this.lineCounts = new int[]{i, i2, i3};
                    this.heights = new float[]{f, f2, f3};
                }

                public MessageGroupedLayoutAttempt(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
                    this.lineCounts = new int[]{i, i2, i3, i4};
                    this.heights = new float[]{f, f2, f3, f4};
                }
            }

            private float multiHeight(float[] fArr, int i, int i2) {
                float f = 0.0f;
                while (i < i2) {
                    f += fArr[i];
                    i++;
                }
                return this.maxSizeWidth / f;
            }

            public void calculate() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockCollageCell.GroupedMessages.calculate():void");
            }
        }

        public BlockCollageCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.group = new GroupedMessages();
            this.parentAdapter = webpageAdapter;
            RecyclerListView recyclerListView = new RecyclerListView(context) {
                @Override
                public void requestLayout() {
                    if (BlockCollageCell.this.inLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.innerListView = recyclerListView;
            recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition;
                    int i = 0;
                    rect.bottom = 0;
                    if (!(view instanceof BlockPhotoCell)) {
                        groupedMessagePosition = view instanceof BlockVideoCell ? BlockCollageCell.this.group.positions.get(((BlockVideoCell) view).currentBlock) : null;
                    } else {
                        groupedMessagePosition = BlockCollageCell.this.group.positions.get(((BlockPhotoCell) view).currentBlock);
                    }
                    if (groupedMessagePosition == null || groupedMessagePosition.siblingHeights == null) {
                        return;
                    }
                    Point point = AndroidUtilities.displaySize;
                    float max = Math.max(point.x, point.y) * 0.5f;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i2 >= groupedMessagePosition.siblingHeights.length) {
                            break;
                        }
                        i3 += (int) Math.ceil(r2[i2] * max);
                        i2++;
                    }
                    int dp2 = i3 + ((groupedMessagePosition.maxY - groupedMessagePosition.minY) * AndroidUtilities.dp2(11.0f));
                    int size = BlockCollageCell.this.group.posArray.size();
                    while (true) {
                        if (i < size) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = BlockCollageCell.this.group.posArray.get(i);
                            byte b = groupedMessagePosition2.minY;
                            byte b2 = groupedMessagePosition.minY;
                            if (b == b2 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b != b2 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b == b2)) {
                                dp2 -= ((int) Math.ceil(max * groupedMessagePosition2.ph)) - AndroidUtilities.dp(4.0f);
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                    rect.bottom = -dp2;
                }
            });
            GridLayoutManagerFixed gridLayoutManagerFixed = new GridLayoutManagerFixed(context, 1000, 1, true) {
                @Override
                public boolean shouldLayoutChildFromOpositeSide(View view) {
                    return false;
                }

                @Override
                public boolean supportsPredictiveItemAnimations() {
                    return false;
                }

                @Override
                protected boolean hasSiblingChild(int i) {
                    byte b;
                    MessageObject.GroupedMessagePosition groupedMessagePosition = BlockCollageCell.this.group.positions.get(BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1));
                    if (groupedMessagePosition.minX != groupedMessagePosition.maxX && (b = groupedMessagePosition.minY) == groupedMessagePosition.maxY && b != 0) {
                        int size = BlockCollageCell.this.group.posArray.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = BlockCollageCell.this.group.posArray.get(i2);
                            if (groupedMessagePosition2 != groupedMessagePosition) {
                                byte b2 = groupedMessagePosition2.minY;
                                byte b3 = groupedMessagePosition.minY;
                                if (b2 <= b3 && groupedMessagePosition2.maxY >= b3) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            };
            gridLayoutManagerFixed.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i) {
                    return BlockCollageCell.this.group.positions.get(BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1)).spanSize;
                }
            });
            this.innerListView.setLayoutManager(gridLayoutManagerFixed);
            RecyclerListView recyclerListView2 = this.innerListView;
            RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
                @Override
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    View blockPhotoCell;
                    if (i == 0) {
                        BlockCollageCell blockCollageCell = BlockCollageCell.this;
                        blockPhotoCell = new BlockPhotoCell(blockCollageCell.getContext(), BlockCollageCell.this.parentAdapter, 2);
                    } else {
                        BlockCollageCell blockCollageCell2 = BlockCollageCell.this;
                        blockPhotoCell = new BlockVideoCell(blockCollageCell2.getContext(), BlockCollageCell.this.parentAdapter, 2);
                    }
                    return new RecyclerListView.Holder(blockPhotoCell);
                }

                @Override
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    TLRPC$PageBlock tLRPC$PageBlock = BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1);
                    if (viewHolder.getItemViewType() == 0) {
                        BlockPhotoCell blockPhotoCell = (BlockPhotoCell) viewHolder.itemView;
                        blockPhotoCell.groupPosition = BlockCollageCell.this.group.positions.get(tLRPC$PageBlock);
                        blockPhotoCell.setBlock((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock, true, true);
                    } else {
                        BlockVideoCell blockVideoCell = (BlockVideoCell) viewHolder.itemView;
                        blockVideoCell.groupPosition = BlockCollageCell.this.group.positions.get(tLRPC$PageBlock);
                        TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock;
                        blockVideoCell.setBlock(tLRPC$TL_pageBlockVideo, (BlockVideoCellState) ArticleViewer.this.videoStates.get(tLRPC$TL_pageBlockVideo.video_id), true, true);
                    }
                }

                @Override
                public int getItemCount() {
                    if (BlockCollageCell.this.currentBlock == null) {
                        return 0;
                    }
                    return BlockCollageCell.this.currentBlock.items.size();
                }

                @Override
                public int getItemViewType(int i) {
                    return BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1) instanceof TLRPC$TL_pageBlockPhoto ? 0 : 1;
                }
            };
            this.innerAdapter = adapter;
            recyclerListView2.setAdapter(adapter);
            addView(this.innerListView, LayoutHelper.createFrame(-1, -2.0f));
            setWillNotDraw(false);
        }

        public void setBlock(TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage) {
            if (this.currentBlock != tLRPC$TL_pageBlockCollage) {
                this.currentBlock = tLRPC$TL_pageBlockCollage;
                this.group.calculate();
            }
            this.innerAdapter.notifyDataSetChanged();
            this.innerListView.setGlowColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite));
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int dp;
            int i3;
            int i4 = 1;
            this.inLayout = true;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage = this.currentBlock;
            if (tLRPC$TL_pageBlockCollage != null) {
                if (tLRPC$TL_pageBlockCollage.level > 0) {
                    int dp2 = AndroidUtilities.dp(r15 * 14) + AndroidUtilities.dp(18.0f);
                    this.listX = dp2;
                    this.textX = dp2;
                    i3 = size - (dp2 + AndroidUtilities.dp(18.0f));
                    dp = i3;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.dp(18.0f);
                    dp = size - AndroidUtilities.dp(36.0f);
                    i3 = size;
                }
                this.innerListView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = this.innerListView.getMeasuredHeight();
                int dp3 = measuredHeight + AndroidUtilities.dp(8.0f);
                this.textY = dp3;
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage2 = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockCollage2.caption.text, dp, dp3, tLRPC$TL_pageBlockCollage2, this.parentAdapter);
                this.captionLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp4 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                    this.creditOffset = dp4;
                    measuredHeight += dp4 + AndroidUtilities.dp(4.0f);
                    DrawingText drawingText = this.captionLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    this.creditOffset = 0;
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage3 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockCollage3.caption.credit, dp, this.textY + this.creditOffset, tLRPC$TL_pageBlockCollage3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    measuredHeight += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY + this.creditOffset;
                }
                i4 = measuredHeight + AndroidUtilities.dp(16.0f);
                TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage4 = this.currentBlock;
                if (tLRPC$TL_pageBlockCollage4.level > 0 && !tLRPC$TL_pageBlockCollage4.bottom) {
                    i4 += AndroidUtilities.dp(8.0f);
                }
            }
            setMeasuredDimension(size, i4);
            this.inLayout = false;
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.innerListView.layout(this.listX, AndroidUtilities.dp(8.0f), this.listX + this.innerListView.getMeasuredWidth(), this.innerListView.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            } else {
                i = 0;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    public class BlockSlideshowCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockSlideshow currentBlock;
        private int currentPage;
        private View dotsContainer;
        private PagerAdapter innerAdapter;
        private ViewPager innerListView;
        private float pageOffset;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;

        public BlockSlideshowCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.parentAdapter = webpageAdapter;
            if (ArticleViewer.dotsPaint == null) {
                Paint unused = ArticleViewer.dotsPaint = new Paint(1);
                ArticleViewer.dotsPaint.setColor(-1);
            }
            ViewPager viewPager = new ViewPager(context) {
                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    return super.onTouchEvent(motionEvent);
                }

                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(true);
                    ArticleViewer.this.cancelCheckLongPress();
                    return super.onInterceptTouchEvent(motionEvent);
                }
            };
            this.innerListView = viewPager;
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrollStateChanged(int i) {
                }

                @Override
                public void onPageScrolled(int i, float f, int i2) {
                    float measuredWidth = BlockSlideshowCell.this.innerListView.getMeasuredWidth();
                    if (measuredWidth == 0.0f) {
                        return;
                    }
                    BlockSlideshowCell.this.pageOffset = (((i * measuredWidth) + i2) - (r0.currentPage * measuredWidth)) / measuredWidth;
                    BlockSlideshowCell.this.dotsContainer.invalidate();
                }

                @Override
                public void onPageSelected(int i) {
                    BlockSlideshowCell.this.currentPage = i;
                    BlockSlideshowCell.this.dotsContainer.invalidate();
                }
            });
            ViewPager viewPager2 = this.innerListView;
            PagerAdapter pagerAdapter = new PagerAdapter() {

                class ObjectContainer {
                    private TLRPC$PageBlock block;
                    private View view;

                    ObjectContainer() {
                    }
                }

                @Override
                public int getCount() {
                    if (BlockSlideshowCell.this.currentBlock == null) {
                        return 0;
                    }
                    return BlockSlideshowCell.this.currentBlock.items.size();
                }

                @Override
                public boolean isViewFromObject(View view, Object obj) {
                    return ((ObjectContainer) obj).view == view;
                }

                @Override
                public int getItemPosition(Object obj) {
                    return BlockSlideshowCell.this.currentBlock.items.contains(((ObjectContainer) obj).block) ? -1 : -2;
                }

                @Override
                public Object instantiateItem(ViewGroup viewGroup, int i) {
                    BlockVideoCell blockVideoCell;
                    TLRPC$PageBlock tLRPC$PageBlock = BlockSlideshowCell.this.currentBlock.items.get(i);
                    if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                        BlockSlideshowCell blockSlideshowCell = BlockSlideshowCell.this;
                        BlockPhotoCell blockPhotoCell = new BlockPhotoCell(blockSlideshowCell.getContext(), BlockSlideshowCell.this.parentAdapter, 1);
                        blockPhotoCell.setBlock((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock, true, true);
                        blockVideoCell = blockPhotoCell;
                    } else {
                        BlockSlideshowCell blockSlideshowCell2 = BlockSlideshowCell.this;
                        BlockVideoCell blockVideoCell2 = new BlockVideoCell(blockSlideshowCell2.getContext(), BlockSlideshowCell.this.parentAdapter, 1);
                        TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock;
                        blockVideoCell2.setBlock(tLRPC$TL_pageBlockVideo, (BlockVideoCellState) ArticleViewer.this.videoStates.get(tLRPC$TL_pageBlockVideo.video_id), true, true);
                        blockVideoCell = blockVideoCell2;
                    }
                    viewGroup.addView(blockVideoCell);
                    ObjectContainer objectContainer = new ObjectContainer();
                    objectContainer.view = blockVideoCell;
                    objectContainer.block = tLRPC$PageBlock;
                    return objectContainer;
                }

                @Override
                public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
                    viewGroup.removeView(((ObjectContainer) obj).view);
                }
            };
            this.innerAdapter = pagerAdapter;
            viewPager2.setAdapter(pagerAdapter);
            AndroidUtilities.setViewPagerEdgeEffectColor(this.innerListView, ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite));
            addView(this.innerListView);
            View view = new View(context) {
                @Override
                protected void onDraw(Canvas canvas) {
                    int i;
                    int i2;
                    if (BlockSlideshowCell.this.currentBlock == null) {
                        return;
                    }
                    int count = BlockSlideshowCell.this.innerAdapter.getCount();
                    int dp = (AndroidUtilities.dp(7.0f) * count) + ((count - 1) * AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(4.0f);
                    if (dp < getMeasuredWidth()) {
                        i = (getMeasuredWidth() - dp) / 2;
                    } else {
                        int dp2 = AndroidUtilities.dp(4.0f);
                        int dp3 = AndroidUtilities.dp(13.0f);
                        int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(8.0f)) / 2) / dp3;
                        int i3 = (count - measuredWidth) - 1;
                        if (BlockSlideshowCell.this.currentPage != i3 || BlockSlideshowCell.this.pageOffset >= 0.0f) {
                            if (BlockSlideshowCell.this.currentPage >= i3) {
                                i2 = ((count - (measuredWidth * 2)) - 1) * dp3;
                            } else if (BlockSlideshowCell.this.currentPage > measuredWidth) {
                                i2 = ((int) (BlockSlideshowCell.this.pageOffset * dp3)) + ((BlockSlideshowCell.this.currentPage - measuredWidth) * dp3);
                            } else if (BlockSlideshowCell.this.currentPage != measuredWidth || BlockSlideshowCell.this.pageOffset <= 0.0f) {
                                i = dp2;
                            } else {
                                i2 = (int) (BlockSlideshowCell.this.pageOffset * dp3);
                            }
                            i = dp2 - i2;
                        } else {
                            i = dp2 - (((int) (BlockSlideshowCell.this.pageOffset * dp3)) + (((count - (measuredWidth * 2)) - 1) * dp3));
                        }
                    }
                    int i4 = 0;
                    while (i4 < BlockSlideshowCell.this.currentBlock.items.size()) {
                        int dp4 = AndroidUtilities.dp(4.0f) + i + (AndroidUtilities.dp(13.0f) * i4);
                        Drawable drawable = BlockSlideshowCell.this.currentPage == i4 ? ArticleViewer.this.slideDotBigDrawable : ArticleViewer.this.slideDotDrawable;
                        drawable.setBounds(dp4 - AndroidUtilities.dp(5.0f), 0, dp4 + AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f));
                        drawable.draw(canvas);
                        i4++;
                    }
                }
            };
            this.dotsContainer = view;
            addView(view);
            setWillNotDraw(false);
        }

        public void setBlock(TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow) {
            this.currentBlock = tLRPC$TL_pageBlockSlideshow;
            this.innerAdapter.notifyDataSetChanged();
            this.innerListView.setCurrentItem(0, false);
            this.innerListView.forceLayout();
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            if (this.currentBlock != null) {
                int dp = AndroidUtilities.dp(310.0f);
                this.innerListView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                this.currentBlock.items.size();
                this.dotsContainer.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
                int dp2 = size - AndroidUtilities.dp(36.0f);
                int dp3 = dp + AndroidUtilities.dp(16.0f);
                this.textY = dp3;
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockSlideshow.caption.text, dp2, dp3, tLRPC$TL_pageBlockSlideshow, this.parentAdapter);
                this.captionLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp4 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                    this.creditOffset = dp4;
                    dp += dp4 + AndroidUtilities.dp(4.0f);
                    DrawingText drawingText = this.captionLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    this.creditOffset = 0;
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow2 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockSlideshow2.caption.credit, dp2, this.textY + this.creditOffset, tLRPC$TL_pageBlockSlideshow2, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    dp += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY + this.creditOffset;
                }
                i3 = dp + AndroidUtilities.dp(16.0f);
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.innerListView.layout(0, AndroidUtilities.dp(8.0f), this.innerListView.getMeasuredWidth(), AndroidUtilities.dp(8.0f) + this.innerListView.getMeasuredHeight());
            int bottom = this.innerListView.getBottom() - AndroidUtilities.dp(23.0f);
            View view = this.dotsContainer;
            view.layout(0, bottom, view.getMeasuredWidth(), this.dotsContainer.getMeasuredHeight() + bottom);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int i = 0;
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    public class BlockListItemCell extends ViewGroup implements TextSelectionHelper.ArticleSelectableView {
        private RecyclerView.ViewHolder blockLayout;
        private int blockX;
        private int blockY;
        private TL_pageBlockListItem currentBlock;
        private int currentBlockType;
        private boolean drawDot;
        private int numOffsetY;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;
        private boolean verticalAlign;

        public BlockListItemCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
        }

        public void setBlock(TL_pageBlockListItem tL_pageBlockListItem) {
            if (this.currentBlock != tL_pageBlockListItem) {
                this.currentBlock = tL_pageBlockListItem;
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    removeView(viewHolder.itemView);
                    this.blockLayout = null;
                }
                if (this.currentBlock.blockItem != null) {
                    int typeForBlock = this.parentAdapter.getTypeForBlock(this.currentBlock.blockItem);
                    this.currentBlockType = typeForBlock;
                    RecyclerView.ViewHolder onCreateViewHolder = this.parentAdapter.onCreateViewHolder(this, typeForBlock);
                    this.blockLayout = onCreateViewHolder;
                    addView(onCreateViewHolder.itemView);
                }
            }
            if (this.currentBlock.blockItem != null) {
                this.parentAdapter.bindBlockToHolder(this.currentBlockType, this.blockLayout, this.currentBlock.blockItem, 0, 0);
            }
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int dp;
            int i3;
            BlockParagraphCell blockParagraphCell;
            DrawingText drawingText;
            int size = View.MeasureSpec.getSize(i);
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            int i4 = 1;
            if (tL_pageBlockListItem != null) {
                this.textLayout = null;
                int i5 = 0;
                this.textY = (tL_pageBlockListItem.index == 0 && this.currentBlock.parent.level == 0) ? AndroidUtilities.dp(10.0f) : 0;
                this.numOffsetY = 0;
                if (this.currentBlock.parent.lastMaxNumCalcWidth != size || this.currentBlock.parent.lastFontSize != SharedConfig.ivFontSize) {
                    this.currentBlock.parent.lastMaxNumCalcWidth = size;
                    this.currentBlock.parent.lastFontSize = SharedConfig.ivFontSize;
                    this.currentBlock.parent.maxNumWidth = 0;
                    int size2 = this.currentBlock.parent.items.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        TL_pageBlockListItem tL_pageBlockListItem2 = (TL_pageBlockListItem) this.currentBlock.parent.items.get(i6);
                        if (tL_pageBlockListItem2.num != null) {
                            tL_pageBlockListItem2.numLayout = ArticleViewer.this.createLayoutForText(this, tL_pageBlockListItem2.num, null, size - AndroidUtilities.dp(54.0f), this.textY, this.currentBlock, this.parentAdapter);
                            this.currentBlock.parent.maxNumWidth = Math.max(this.currentBlock.parent.maxNumWidth, (int) Math.ceil(tL_pageBlockListItem2.numLayout.getLineWidth(0)));
                        }
                    }
                    this.currentBlock.parent.maxNumWidth = Math.max(this.currentBlock.parent.maxNumWidth, (int) Math.ceil(ArticleViewer.listTextNumPaint.measureText("00.")));
                }
                this.drawDot = !this.currentBlock.parent.pageBlockList.ordered;
                if (!this.parentAdapter.isRtl) {
                    this.textX = AndroidUtilities.dp(24.0f) + this.currentBlock.parent.maxNumWidth + (this.currentBlock.parent.level * AndroidUtilities.dp(12.0f));
                } else {
                    this.textX = AndroidUtilities.dp(18.0f);
                }
                int dp2 = (size - AndroidUtilities.dp(18.0f)) - this.textX;
                if (this.parentAdapter.isRtl) {
                    dp2 -= (AndroidUtilities.dp(6.0f) + this.currentBlock.parent.maxNumWidth) + (this.currentBlock.parent.level * AndroidUtilities.dp(12.0f));
                }
                int i7 = dp2;
                if (this.currentBlock.textItem != null) {
                    DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.textItem, i7, this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                    this.textLayout = createLayoutForText;
                    if (createLayoutForText != null && createLayoutForText.getLineCount() > 0) {
                        if (this.currentBlock.numLayout != null && this.currentBlock.numLayout.getLineCount() > 0) {
                            this.numOffsetY = (this.currentBlock.numLayout.getLineAscent(0) + AndroidUtilities.dp(2.5f)) - this.textLayout.getLineAscent(0);
                        }
                        i5 = this.textLayout.getHeight() + AndroidUtilities.dp(8.0f);
                    }
                } else if (this.currentBlock.blockItem != null) {
                    this.blockX = this.textX;
                    int i8 = this.textY;
                    this.blockY = i8;
                    RecyclerView.ViewHolder viewHolder = this.blockLayout;
                    if (viewHolder != null) {
                        View view = viewHolder.itemView;
                        if (view instanceof BlockParagraphCell) {
                            this.blockY = i8 - AndroidUtilities.dp(8.0f);
                            if (!this.parentAdapter.isRtl) {
                                this.blockX -= AndroidUtilities.dp(18.0f);
                            }
                            i7 += AndroidUtilities.dp(18.0f);
                            i3 = 0 - AndroidUtilities.dp(8.0f);
                        } else {
                            if (!(view instanceof BlockHeaderCell) && !(view instanceof BlockSubheaderCell) && !(view instanceof BlockTitleCell) && !(view instanceof BlockSubtitleCell)) {
                                if (ArticleViewer.this.isListItemBlock(this.currentBlock.blockItem)) {
                                    this.blockX = 0;
                                    this.blockY = 0;
                                    this.textY = 0;
                                    i3 = ((this.currentBlock.index == 0 && this.currentBlock.parent.level == 0) ? 0 - AndroidUtilities.dp(10.0f) : 0) - AndroidUtilities.dp(8.0f);
                                    i7 = size;
                                } else {
                                    if (this.blockLayout.itemView instanceof BlockTableCell) {
                                        this.blockX -= AndroidUtilities.dp(18.0f);
                                        dp = AndroidUtilities.dp(36.0f);
                                    }
                                    i3 = 0;
                                }
                            } else {
                                if (!this.parentAdapter.isRtl) {
                                    this.blockX -= AndroidUtilities.dp(18.0f);
                                }
                                dp = AndroidUtilities.dp(18.0f);
                            }
                            i7 += dp;
                            i3 = 0;
                        }
                        this.blockLayout.itemView.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.blockLayout.itemView instanceof BlockParagraphCell) && this.currentBlock.numLayout != null && this.currentBlock.numLayout.getLineCount() > 0 && (drawingText = (blockParagraphCell = (BlockParagraphCell) this.blockLayout.itemView).textLayout) != null && drawingText.getLineCount() > 0) {
                            this.numOffsetY = (this.currentBlock.numLayout.getLineAscent(0) + AndroidUtilities.dp(2.5f)) - blockParagraphCell.textLayout.getLineAscent(0);
                        }
                        if (this.currentBlock.blockItem instanceof TLRPC$TL_pageBlockDetails) {
                            this.verticalAlign = true;
                            this.blockY = 0;
                            if (this.currentBlock.index == 0 && this.currentBlock.parent.level == 0) {
                                i3 -= AndroidUtilities.dp(10.0f);
                            }
                            i3 -= AndroidUtilities.dp(8.0f);
                        } else {
                            View view2 = this.blockLayout.itemView;
                            if (!(view2 instanceof BlockOrderedListItemCell)) {
                                if (view2 instanceof BlockListItemCell) {
                                    this.verticalAlign = ((BlockListItemCell) view2).verticalAlign;
                                }
                            } else {
                                this.verticalAlign = ((BlockOrderedListItemCell) view2).verticalAlign;
                            }
                        }
                        if (this.verticalAlign && this.currentBlock.numLayout != null) {
                            this.textY = ((this.blockLayout.itemView.getMeasuredHeight() - this.currentBlock.numLayout.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                            this.drawDot = false;
                        }
                        i5 = i3 + this.blockLayout.itemView.getMeasuredHeight();
                    }
                    i5 += AndroidUtilities.dp(8.0f);
                }
                if (this.currentBlock.parent.items.get(this.currentBlock.parent.items.size() - 1) == this.currentBlock) {
                    i5 += AndroidUtilities.dp(8.0f);
                }
                if (this.currentBlock.index == 0 && this.currentBlock.parent.level == 0) {
                    i5 += AndroidUtilities.dp(10.0f);
                }
                i4 = i5;
                DrawingText drawingText2 = this.textLayout;
                if (drawingText2 != null) {
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY;
                }
                RecyclerView.ViewHolder viewHolder2 = this.blockLayout;
                if (viewHolder2 != null && (viewHolder2.itemView instanceof TextSelectionHelper.ArticleSelectableView)) {
                    ArticleViewer.this.textSelectionHelper.arrayList.clear();
                    ((TextSelectionHelper.ArticleSelectableView) this.blockLayout.itemView).fillTextLayoutBlocks(ArticleViewer.this.textSelectionHelper.arrayList);
                    Iterator<TextSelectionHelper.TextLayoutBlock> it = ArticleViewer.this.textSelectionHelper.arrayList.iterator();
                    while (it.hasNext()) {
                        TextSelectionHelper.TextLayoutBlock next = it.next();
                        if (next instanceof DrawingText) {
                            DrawingText drawingText3 = (DrawingText) next;
                            drawingText3.x += this.blockX;
                            drawingText3.y += this.blockY;
                        }
                    }
                }
            }
            setMeasuredDimension(size, i4);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                int i5 = this.blockX;
                view.layout(i5, this.blockY, view.getMeasuredWidth() + i5, this.blockY + this.blockLayout.itemView.getMeasuredHeight());
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (this.currentBlock.numLayout != null) {
                canvas.save();
                if (this.parentAdapter.isRtl) {
                    canvas.translate(((measuredWidth - AndroidUtilities.dp(15.0f)) - this.currentBlock.parent.maxNumWidth) - (this.currentBlock.parent.level * AndroidUtilities.dp(12.0f)), (this.textY + this.numOffsetY) - (this.drawDot ? AndroidUtilities.dp(1.0f) : 0));
                } else {
                    canvas.translate(((AndroidUtilities.dp(15.0f) + this.currentBlock.parent.maxNumWidth) - ((int) Math.ceil(this.currentBlock.numLayout.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.dp(12.0f)), (this.textY + this.numOffsetY) - (this.drawDot ? AndroidUtilities.dp(1.0f) : 0));
                }
                this.currentBlock.numLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override
        public void invalidate() {
            super.invalidate();
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                viewHolder.itemView.invalidate();
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(drawingText.getText());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                KeyEvent.Callback callback = viewHolder.itemView;
                if (callback instanceof TextSelectionHelper.ArticleSelectableView) {
                    ((TextSelectionHelper.ArticleSelectableView) callback).fillTextLayoutBlocks(arrayList);
                }
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public class BlockOrderedListItemCell extends ViewGroup implements TextSelectionHelper.ArticleSelectableView {
        private RecyclerView.ViewHolder blockLayout;
        private int blockX;
        private int blockY;
        private TL_pageBlockOrderedListItem currentBlock;
        private int currentBlockType;
        private int numOffsetY;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;
        private boolean verticalAlign;

        public BlockOrderedListItemCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
        }

        public void setBlock(TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem) {
            if (this.currentBlock != tL_pageBlockOrderedListItem) {
                this.currentBlock = tL_pageBlockOrderedListItem;
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    removeView(viewHolder.itemView);
                    this.blockLayout = null;
                }
                if (this.currentBlock.blockItem != null) {
                    int typeForBlock = this.parentAdapter.getTypeForBlock(this.currentBlock.blockItem);
                    this.currentBlockType = typeForBlock;
                    RecyclerView.ViewHolder onCreateViewHolder = this.parentAdapter.onCreateViewHolder(this, typeForBlock);
                    this.blockLayout = onCreateViewHolder;
                    addView(onCreateViewHolder.itemView);
                }
            }
            if (this.currentBlock.blockItem != null) {
                this.parentAdapter.bindBlockToHolder(this.currentBlockType, this.blockLayout, this.currentBlock.blockItem, 0, 0);
            }
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int dp;
            int i3;
            BlockParagraphCell blockParagraphCell;
            DrawingText drawingText;
            int size = View.MeasureSpec.getSize(i);
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            int i4 = 1;
            if (tL_pageBlockOrderedListItem != null) {
                this.textLayout = null;
                int i5 = 0;
                this.textY = (tL_pageBlockOrderedListItem.index == 0 && this.currentBlock.parent.level == 0) ? AndroidUtilities.dp(10.0f) : 0;
                this.numOffsetY = 0;
                if (this.currentBlock.parent.lastMaxNumCalcWidth != size || this.currentBlock.parent.lastFontSize != SharedConfig.ivFontSize) {
                    this.currentBlock.parent.lastMaxNumCalcWidth = size;
                    this.currentBlock.parent.lastFontSize = SharedConfig.ivFontSize;
                    this.currentBlock.parent.maxNumWidth = 0;
                    int size2 = this.currentBlock.parent.items.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = (TL_pageBlockOrderedListItem) this.currentBlock.parent.items.get(i6);
                        if (tL_pageBlockOrderedListItem2.num != null) {
                            tL_pageBlockOrderedListItem2.numLayout = ArticleViewer.this.createLayoutForText(this, tL_pageBlockOrderedListItem2.num, null, size - AndroidUtilities.dp(54.0f), this.textY, this.currentBlock, this.parentAdapter);
                            this.currentBlock.parent.maxNumWidth = Math.max(this.currentBlock.parent.maxNumWidth, (int) Math.ceil(tL_pageBlockOrderedListItem2.numLayout.getLineWidth(0)));
                        }
                    }
                    this.currentBlock.parent.maxNumWidth = Math.max(this.currentBlock.parent.maxNumWidth, (int) Math.ceil(ArticleViewer.listTextNumPaint.measureText("00.")));
                }
                if (!this.parentAdapter.isRtl) {
                    this.textX = AndroidUtilities.dp(24.0f) + this.currentBlock.parent.maxNumWidth + (this.currentBlock.parent.level * AndroidUtilities.dp(20.0f));
                } else {
                    this.textX = AndroidUtilities.dp(18.0f);
                }
                this.verticalAlign = false;
                int dp2 = (size - AndroidUtilities.dp(18.0f)) - this.textX;
                if (this.parentAdapter.isRtl) {
                    dp2 -= (AndroidUtilities.dp(6.0f) + this.currentBlock.parent.maxNumWidth) + (this.currentBlock.parent.level * AndroidUtilities.dp(20.0f));
                }
                int i7 = dp2;
                if (this.currentBlock.textItem != null) {
                    DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.textItem, i7, this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                    this.textLayout = createLayoutForText;
                    if (createLayoutForText != null && createLayoutForText.getLineCount() > 0) {
                        if (this.currentBlock.numLayout != null && this.currentBlock.numLayout.getLineCount() > 0) {
                            this.numOffsetY = this.currentBlock.numLayout.getLineAscent(0) - this.textLayout.getLineAscent(0);
                        }
                        i5 = this.textLayout.getHeight() + AndroidUtilities.dp(8.0f);
                    }
                } else if (this.currentBlock.blockItem != null) {
                    this.blockX = this.textX;
                    int i8 = this.textY;
                    this.blockY = i8;
                    RecyclerView.ViewHolder viewHolder = this.blockLayout;
                    if (viewHolder != null) {
                        View view = viewHolder.itemView;
                        if (view instanceof BlockParagraphCell) {
                            this.blockY = i8 - AndroidUtilities.dp(8.0f);
                            if (!this.parentAdapter.isRtl) {
                                this.blockX -= AndroidUtilities.dp(18.0f);
                            }
                            i7 += AndroidUtilities.dp(18.0f);
                            i3 = 0 - AndroidUtilities.dp(8.0f);
                        } else {
                            if (!(view instanceof BlockHeaderCell) && !(view instanceof BlockSubheaderCell) && !(view instanceof BlockTitleCell) && !(view instanceof BlockSubtitleCell)) {
                                if (ArticleViewer.this.isListItemBlock(this.currentBlock.blockItem)) {
                                    this.blockX = 0;
                                    this.blockY = 0;
                                    this.textY = 0;
                                    i3 = 0 - AndroidUtilities.dp(8.0f);
                                    i7 = size;
                                } else {
                                    if (this.blockLayout.itemView instanceof BlockTableCell) {
                                        this.blockX -= AndroidUtilities.dp(18.0f);
                                        dp = AndroidUtilities.dp(36.0f);
                                    }
                                    i3 = 0;
                                }
                            } else {
                                if (!this.parentAdapter.isRtl) {
                                    this.blockX -= AndroidUtilities.dp(18.0f);
                                }
                                dp = AndroidUtilities.dp(18.0f);
                            }
                            i7 += dp;
                            i3 = 0;
                        }
                        this.blockLayout.itemView.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if ((this.blockLayout.itemView instanceof BlockParagraphCell) && this.currentBlock.numLayout != null && this.currentBlock.numLayout.getLineCount() > 0 && (drawingText = (blockParagraphCell = (BlockParagraphCell) this.blockLayout.itemView).textLayout) != null && drawingText.getLineCount() > 0) {
                            this.numOffsetY = this.currentBlock.numLayout.getLineAscent(0) - blockParagraphCell.textLayout.getLineAscent(0);
                        }
                        if (this.currentBlock.blockItem instanceof TLRPC$TL_pageBlockDetails) {
                            this.verticalAlign = true;
                            this.blockY = 0;
                            i3 -= AndroidUtilities.dp(8.0f);
                        } else {
                            View view2 = this.blockLayout.itemView;
                            if (view2 instanceof BlockOrderedListItemCell) {
                                this.verticalAlign = ((BlockOrderedListItemCell) view2).verticalAlign;
                            } else if (view2 instanceof BlockListItemCell) {
                                this.verticalAlign = ((BlockListItemCell) view2).verticalAlign;
                            }
                        }
                        if (this.verticalAlign && this.currentBlock.numLayout != null) {
                            this.textY = (this.blockLayout.itemView.getMeasuredHeight() - this.currentBlock.numLayout.getHeight()) / 2;
                        }
                        i5 = i3 + this.blockLayout.itemView.getMeasuredHeight();
                    }
                    i5 += AndroidUtilities.dp(8.0f);
                }
                if (this.currentBlock.parent.items.get(this.currentBlock.parent.items.size() - 1) == this.currentBlock) {
                    i5 += AndroidUtilities.dp(8.0f);
                }
                if (this.currentBlock.index == 0 && this.currentBlock.parent.level == 0) {
                    i5 += AndroidUtilities.dp(10.0f);
                }
                i4 = i5;
                DrawingText drawingText2 = this.textLayout;
                if (drawingText2 != null) {
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY;
                    if (this.currentBlock.numLayout != null) {
                        this.textLayout.prefix = this.currentBlock.numLayout.textLayout.getText();
                    }
                }
                RecyclerView.ViewHolder viewHolder2 = this.blockLayout;
                if (viewHolder2 != null && (viewHolder2.itemView instanceof TextSelectionHelper.ArticleSelectableView)) {
                    ArticleViewer.this.textSelectionHelper.arrayList.clear();
                    ((TextSelectionHelper.ArticleSelectableView) this.blockLayout.itemView).fillTextLayoutBlocks(ArticleViewer.this.textSelectionHelper.arrayList);
                    Iterator<TextSelectionHelper.TextLayoutBlock> it = ArticleViewer.this.textSelectionHelper.arrayList.iterator();
                    while (it.hasNext()) {
                        TextSelectionHelper.TextLayoutBlock next = it.next();
                        if (next instanceof DrawingText) {
                            DrawingText drawingText3 = (DrawingText) next;
                            drawingText3.x += this.blockX;
                            drawingText3.y += this.blockY;
                        }
                    }
                }
            }
            setMeasuredDimension(size, i4);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                int i5 = this.blockX;
                view.layout(i5, this.blockY, view.getMeasuredWidth() + i5, this.blockY + this.blockLayout.itemView.getMeasuredHeight());
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (this.currentBlock.numLayout != null) {
                canvas.save();
                if (this.parentAdapter.isRtl) {
                    canvas.translate(((measuredWidth - AndroidUtilities.dp(18.0f)) - this.currentBlock.parent.maxNumWidth) - (this.currentBlock.parent.level * AndroidUtilities.dp(20.0f)), this.textY + this.numOffsetY);
                } else {
                    canvas.translate(((AndroidUtilities.dp(18.0f) + this.currentBlock.parent.maxNumWidth) - ((int) Math.ceil(this.currentBlock.numLayout.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.dp(20.0f)), this.textY + this.numOffsetY);
                }
                this.currentBlock.numLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override
        public void invalidate() {
            super.invalidate();
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                viewHolder.itemView.invalidate();
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(drawingText.getText());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                KeyEvent.Callback callback = viewHolder.itemView;
                if (callback instanceof TextSelectionHelper.ArticleSelectableView) {
                    ((TextSelectionHelper.ArticleSelectableView) callback).fillTextLayoutBlocks(arrayList);
                }
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public class BlockDetailsCell extends View implements Drawable.Callback, TextSelectionHelper.ArticleSelectableView {
        private AnimatedArrowDrawable arrow;
        private TLRPC$TL_pageBlockDetails currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        public BlockDetailsCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(50.0f);
            this.textY = AndroidUtilities.dp(11.0f) + 1;
            this.parentAdapter = webpageAdapter;
            this.arrow = new AnimatedArrowDrawable(ArticleViewer.this.getGrayTextColor(), true);
        }

        @Override
        public void invalidateDrawable(Drawable drawable) {
            invalidate();
        }

        public void setBlock(TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails) {
            this.currentBlock = tLRPC$TL_pageBlockDetails;
            this.arrow.setAnimationProgress(tLRPC$TL_pageBlockDetails.open ? 0.0f : 1.0f);
            this.arrow.setCallback(this);
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int dp = AndroidUtilities.dp(39.0f);
            TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = this.currentBlock;
            if (tLRPC$TL_pageBlockDetails != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockDetails.title, size - AndroidUtilities.dp(52.0f), 0, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    dp = Math.max(dp, AndroidUtilities.dp(21.0f) + this.textLayout.getHeight());
                    int height = ((this.textLayout.getHeight() + AndroidUtilities.dp(21.0f)) - this.textLayout.getHeight()) / 2;
                    this.textY = height;
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = height;
                }
            }
            setMeasuredDimension(size, dp + 1);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            canvas.save();
            canvas.translate(AndroidUtilities.dp(18.0f), ((getMeasuredHeight() - AndroidUtilities.dp(13.0f)) - 1) / 2);
            this.arrow.draw(canvas);
            canvas.restore();
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
            float measuredHeight = getMeasuredHeight() - 1;
            canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, ArticleViewer.dividerPaint);
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public static class BlockDetailsBottomCell extends View {
        private RectF rect;

        public BlockDetailsBottomCell(Context context) {
            super(context);
            this.rect = new RectF();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(4.0f) + 1);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), 0.0f, ArticleViewer.dividerPaint);
        }
    }

    public class BlockRelatedArticlesShadowCell extends View {
        private CombinedDrawable shadowDrawable;

        public BlockRelatedArticlesShadowCell(Context context) {
            super(context);
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(ArticleViewer.this.getThemedColor(Theme.key_iv_backgroundGray)), Theme.getThemedDrawable(context, R.drawable.greydivider_bottom, -16777216));
            this.shadowDrawable = combinedDrawable;
            combinedDrawable.setFullsize(true);
            setBackgroundDrawable(this.shadowDrawable);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(12.0f));
            Theme.setCombinedDrawableColor(this.shadowDrawable, ArticleViewer.this.getThemedColor(Theme.key_iv_backgroundGray), false);
        }
    }

    public class BlockRelatedArticlesHeaderCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockRelatedArticles currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockRelatedArticlesHeaderCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockRelatedArticles tLRPC$TL_pageBlockRelatedArticles) {
            this.currentBlock = tLRPC$TL_pageBlockRelatedArticles;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockRelatedArticles tLRPC$TL_pageBlockRelatedArticles = this.currentBlock;
            if (tLRPC$TL_pageBlockRelatedArticles != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockRelatedArticles.title, size - AndroidUtilities.dp(52.0f), 0, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 1, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    this.textY = AndroidUtilities.dp(6.0f) + ((AndroidUtilities.dp(32.0f) - this.textLayout.getHeight()) / 2);
                }
            }
            if (this.textLayout != null) {
                setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
                DrawingText drawingText = this.textLayout;
                drawingText.x = this.textX;
                drawingText.y = this.textY;
                return;
            }
            setMeasuredDimension(size, 1);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public class BlockRelatedArticlesCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TL_pageBlockRelatedArticlesChild currentBlock;
        private boolean divider;
        private boolean drawImage;
        private ImageReceiver imageView;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textOffset;
        private int textX;
        private int textY;

        public BlockRelatedArticlesCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(10.0f);
            this.parentAdapter = webpageAdapter;
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.imageView = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        }

        public void setBlock(TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild) {
            this.currentBlock = tL_pageBlockRelatedArticlesChild;
            requestLayout();
        }

        @Override
        @SuppressLint({"DrawAllocation", "NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            boolean z;
            int i4;
            String str;
            int size = View.MeasureSpec.getSize(i);
            this.divider = this.currentBlock.num != this.currentBlock.parent.articles.size() - 1;
            TLRPC$TL_pageRelatedArticle tLRPC$TL_pageRelatedArticle = this.currentBlock.parent.articles.get(this.currentBlock.num);
            int dp = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
            long j = tLRPC$TL_pageRelatedArticle.photo_id;
            TLRPC$Photo photoWithId = j != 0 ? this.parentAdapter.getPhotoWithId(j) : null;
            if (photoWithId != null) {
                this.drawImage = true;
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize());
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, 80, true);
                this.imageView.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photoWithId), "64_64", ImageLocation.getForPhoto(closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null, photoWithId), "64_64_b", closestPhotoSizeWithSize.size, null, this.parentAdapter.currentPage, 1);
            } else {
                this.drawImage = false;
            }
            int dp2 = AndroidUtilities.dp(60.0f);
            int dp3 = size - AndroidUtilities.dp(36.0f);
            if (this.drawImage) {
                float dp4 = AndroidUtilities.dp(44.0f);
                this.imageView.setImageCoords((size - r1) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), dp4, dp4);
                dp3 = (int) (dp3 - (this.imageView.getImageWidth() + AndroidUtilities.dp(6.0f)));
            }
            int i5 = dp3;
            int dp5 = AndroidUtilities.dp(18.0f);
            String str2 = tLRPC$TL_pageRelatedArticle.title;
            if (str2 != null) {
                i3 = dp2;
                this.textLayout = ArticleViewer.this.createLayoutForText(this, str2, null, i5, this.textY, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 3, this.parentAdapter);
            } else {
                i3 = dp2;
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                int lineCount = drawingText.getLineCount();
                int i6 = 4 - lineCount;
                this.textOffset = this.textLayout.getHeight() + AndroidUtilities.dp(6.0f) + dp;
                dp5 += this.textLayout.getHeight();
                int i7 = 0;
                while (true) {
                    if (i7 >= lineCount) {
                        z = false;
                        break;
                    } else {
                        if (this.textLayout.getLineLeft(i7) != 0.0f) {
                            z = true;
                            break;
                        }
                        i7++;
                    }
                }
                DrawingText drawingText2 = this.textLayout;
                drawingText2.x = this.textX;
                drawingText2.y = this.textY;
                i4 = i6;
            } else {
                this.textOffset = 0;
                z = false;
                i4 = 4;
            }
            if (tLRPC$TL_pageRelatedArticle.published_date != 0 && !TextUtils.isEmpty(tLRPC$TL_pageRelatedArticle.author)) {
                str = LocaleController.formatString("ArticleDateByAuthor", R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(tLRPC$TL_pageRelatedArticle.published_date * 1000), tLRPC$TL_pageRelatedArticle.author);
            } else if (!TextUtils.isEmpty(tLRPC$TL_pageRelatedArticle.author)) {
                str = LocaleController.formatString("ArticleByAuthor", R.string.ArticleByAuthor, tLRPC$TL_pageRelatedArticle.author);
            } else if (tLRPC$TL_pageRelatedArticle.published_date != 0) {
                str = LocaleController.getInstance().getChatFullDate().format(tLRPC$TL_pageRelatedArticle.published_date * 1000);
            } else if (!TextUtils.isEmpty(tLRPC$TL_pageRelatedArticle.description)) {
                str = tLRPC$TL_pageRelatedArticle.description;
            } else {
                str = tLRPC$TL_pageRelatedArticle.url;
            }
            DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, str, null, i5, this.textY + this.textOffset, this.currentBlock, (this.parentAdapter.isRtl || z) ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, i4, this.parentAdapter);
            this.textLayout2 = createLayoutForText;
            if (createLayoutForText != null) {
                dp5 += createLayoutForText.getHeight();
                if (this.textLayout != null) {
                    dp5 += AndroidUtilities.dp(6.0f) + dp;
                }
                DrawingText drawingText3 = this.textLayout2;
                drawingText3.x = this.textX;
                drawingText3.y = this.textY + this.textOffset;
            }
            setMeasuredDimension(size, Math.max(i3, dp5) + (this.divider ? 1 : 0));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            if (this.drawImage) {
                this.imageView.draw(canvas);
            }
            canvas.save();
            canvas.translate(this.textX, AndroidUtilities.dp(10.0f));
            if (this.textLayout != null) {
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.textLayout.draw(canvas, this);
                i = 1;
            } else {
                i = 0;
            }
            if (this.textLayout2 != null) {
                canvas.translate(0.0f, this.textOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.textLayout2.draw(canvas, this);
            }
            canvas.restore();
            if (this.divider) {
                canvas.drawLine(this.parentAdapter.isRtl ? 0.0f : AndroidUtilities.dp(17.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (this.parentAdapter.isRtl ? AndroidUtilities.dp(17.0f) : 0), getMeasuredHeight() - 1, ArticleViewer.dividerPaint);
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    public class BlockHeaderCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockHeader currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockHeaderCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockHeader tLRPC$TL_pageBlockHeader) {
            this.currentBlock = tLRPC$TL_pageBlockHeader;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockHeader tLRPC$TL_pageBlockHeader = this.currentBlock;
            if (tLRPC$TL_pageBlockHeader != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockHeader.text, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    i3 = 0;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.textLayout == null) {
                return;
            }
            accessibilityNodeInfo.setText(((Object) this.textLayout.getText()) + ", " + LocaleController.getString("AccDescrIVHeading", R.string.AccDescrIVHeading));
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public static class BlockDividerCell extends View {
        private RectF rect;

        public BlockDividerCell(Context context) {
            super(context);
            this.rect = new RectF();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(18.0f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            this.rect.set(getMeasuredWidth() / 3, AndroidUtilities.dp(8.0f), r0 * 2, AndroidUtilities.dp(10.0f));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), ArticleViewer.dividerPaint);
        }
    }

    public class BlockSubtitleCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockSubtitle currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockSubtitleCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockSubtitle tLRPC$TL_pageBlockSubtitle) {
            this.currentBlock = tLRPC$TL_pageBlockSubtitle;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockSubtitle tLRPC$TL_pageBlockSubtitle = this.currentBlock;
            if (tLRPC$TL_pageBlockSubtitle != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockSubtitle.text, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    i3 = 0;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.textLayout == null) {
                return;
            }
            accessibilityNodeInfo.setText(((Object) this.textLayout.getText()) + ", " + LocaleController.getString("AccDescrIVHeading", R.string.AccDescrIVHeading));
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public class BlockPullquoteCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockPullquote currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textX;
        private int textY;
        private int textY2;

        public BlockPullquoteCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockPullquote tLRPC$TL_pageBlockPullquote) {
            this.currentBlock = tLRPC$TL_pageBlockPullquote;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout2, this.textX, this.textY2) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockPullquote tLRPC$TL_pageBlockPullquote = this.currentBlock;
            if (tLRPC$TL_pageBlockPullquote != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockPullquote.text, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = AndroidUtilities.dp(8.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    i3 = 0;
                }
                this.textY2 = AndroidUtilities.dp(2.0f) + i3;
                DrawingText createLayoutForText2 = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.caption, size - AndroidUtilities.dp(36.0f), this.textY2, this.currentBlock, this.parentAdapter);
                this.textLayout2 = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i3 += AndroidUtilities.dp(8.0f) + this.textLayout2.getHeight();
                    DrawingText drawingText2 = this.textLayout2;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY2;
                }
                if (i3 != 0) {
                    i3 += AndroidUtilities.dp(8.0f);
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int i = 0;
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.textLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.textLayout2 != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY2);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.textLayout2.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    public class BlockBlockquoteCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockBlockquote currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textX;
        private int textY;
        private int textY2;

        public BlockBlockquoteCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote) {
            this.currentBlock = tLRPC$TL_pageBlockBlockquote;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout2, this.textX, this.textY2) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            if (this.currentBlock != null) {
                int dp = size - AndroidUtilities.dp(50.0f);
                if (this.currentBlock.level > 0) {
                    dp -= AndroidUtilities.dp(r0 * 14);
                }
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockBlockquote.text, dp, this.textY, tLRPC$TL_pageBlockBlockquote, this.parentAdapter);
                this.textLayout = createLayoutForText;
                i3 = createLayoutForText != null ? AndroidUtilities.dp(8.0f) + this.textLayout.getHeight() : 0;
                if (this.currentBlock.level > 0) {
                    if (this.parentAdapter.isRtl) {
                        this.textX = AndroidUtilities.dp((this.currentBlock.level * 14) + 14);
                    } else {
                        this.textX = AndroidUtilities.dp(this.currentBlock.level * 14) + AndroidUtilities.dp(32.0f);
                    }
                } else if (this.parentAdapter.isRtl) {
                    this.textX = AndroidUtilities.dp(14.0f);
                } else {
                    this.textX = AndroidUtilities.dp(32.0f);
                }
                int dp2 = i3 + AndroidUtilities.dp(8.0f);
                this.textY2 = dp2;
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote2 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockBlockquote2.caption, dp, dp2, tLRPC$TL_pageBlockBlockquote2, this.parentAdapter);
                this.textLayout2 = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i3 += AndroidUtilities.dp(8.0f) + this.textLayout2.getHeight();
                }
                if (i3 != 0) {
                    i3 += AndroidUtilities.dp(8.0f);
                }
                DrawingText drawingText = this.textLayout;
                if (drawingText != null) {
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
                DrawingText drawingText2 = this.textLayout2;
                if (drawingText2 != null) {
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY2;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.textLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            } else {
                i = 0;
            }
            if (this.textLayout2 != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY2);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.textLayout2.draw(canvas, this);
                canvas.restore();
            }
            if (!this.parentAdapter.isRtl) {
                canvas.drawRect(AndroidUtilities.dp((this.currentBlock.level * 14) + 18), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.currentBlock.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.dp(6.0f), ArticleViewer.quoteLinePaint);
            } else {
                canvas.drawRect(getMeasuredWidth() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f), r0 + AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(6.0f), ArticleViewer.quoteLinePaint);
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    public class BlockPhotoCell extends FrameLayout implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
        boolean autoDownload;
        private int buttonPressed;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private DrawingText captionLayout;
        private BlockChannelCell channelCell;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockPhoto currentBlock;
        private String currentFilter;
        private TLRPC$Photo currentPhoto;
        private TLRPC$PhotoSize currentPhotoObject;
        private TLRPC$PhotoSize currentPhotoObjectThumb;
        private String currentThumbFilter;
        private int currentType;
        private MessageObject.GroupedMessagePosition groupPosition;
        private ImageReceiver imageView;
        private boolean isFirst;
        private Drawable linkDrawable;
        private WebpageAdapter parentAdapter;
        private TLRPC$PageBlock parentBlock;
        private boolean photoPressed;
        private RadialProgress2 radialProgress;
        private int textX;
        private int textY;

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public BlockPhotoCell(Context context, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
            this.imageView = new ImageReceiver(this);
            this.channelCell = new BlockChannelCell(context, this.parentAdapter, 1);
            RadialProgress2 radialProgress2 = new RadialProgress2(this);
            this.radialProgress = radialProgress2;
            radialProgress2.setProgressColor(-1);
            this.radialProgress.setColors(1711276032, 2130706432, -1, -2500135);
            this.TAG = DownloadController.getInstance(ArticleViewer.this.currentAccount).generateObserverTag();
            addView(this.channelCell, LayoutHelper.createFrame(-1, -2.0f));
            this.currentType = i;
        }

        public void setBlock(TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto, boolean z, boolean z2) {
            this.parentBlock = null;
            this.currentBlock = tLRPC$TL_pageBlockPhoto;
            this.isFirst = z;
            this.channelCell.setVisibility(4);
            if (!TextUtils.isEmpty(this.currentBlock.url)) {
                this.linkDrawable = getResources().getDrawable(R.drawable.msg_instant_link);
            }
            TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto2 = this.currentBlock;
            if (tLRPC$TL_pageBlockPhoto2 != null) {
                TLRPC$Photo photoWithId = this.parentAdapter.getPhotoWithId(tLRPC$TL_pageBlockPhoto2.photo_id);
                if (photoWithId != null) {
                    this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize());
                } else {
                    this.currentPhotoObject = null;
                }
            } else {
                this.currentPhotoObject = null;
            }
            updateButtonState(false);
            requestLayout();
        }

        public void setParentBlock(TLRPC$PageBlock tLRPC$PageBlock) {
            this.parentBlock = tLRPC$PageBlock;
            if (this.parentAdapter.channelBlock == null || !(this.parentBlock instanceof TLRPC$TL_pageBlockCover)) {
                return;
            }
            this.channelCell.setBlock(this.parentAdapter.channelBlock);
            this.channelCell.setVisibility(0);
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockPhotoCell.onTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        @android.annotation.SuppressLint({"NewApi"})
        protected void onMeasure(int r28, int r29) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockPhotoCell.onMeasure(int, int):void");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            if (!this.imageView.hasBitmapImage() || this.imageView.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(this.imageView.getImageX(), this.imageView.getImageY(), this.imageView.getImageX2(), this.imageView.getImageY2(), ArticleViewer.photoBackgroundPaint);
            }
            if (!ArticleViewer.this.pinchToZoomHelper.isInOverlayModeFor(this)) {
                this.imageView.draw(canvas);
                if (this.imageView.getVisible()) {
                    this.radialProgress.draw(canvas);
                }
            }
            if (!TextUtils.isEmpty(this.currentBlock.url)) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
                int imageY = (int) (this.imageView.getImageY() + AndroidUtilities.dp(11.0f));
                this.linkDrawable.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
                this.linkDrawable.draw(canvas);
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            } else {
                i = 0;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        private int getIconForCurrentState() {
            int i = this.buttonState;
            if (i == 0) {
                return 2;
            }
            return i == 1 ? 3 : 4;
        }

        private void didPressedButton(boolean z) {
            int i = this.buttonState;
            if (i == 0) {
                this.radialProgress.setProgress(0.0f, z);
                this.imageView.setImage(ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto), this.currentFilter, ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto), this.currentThumbFilter, this.currentPhotoObject.size, null, this.parentAdapter.currentPage, 1);
                this.buttonState = 1;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                invalidate();
                return;
            }
            if (i == 1) {
                this.imageView.cancelLoadImage();
                this.buttonState = 0;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
            }
        }

        public void updateButtonState(boolean z) {
            String attachFileName = FileLoader.getAttachFileName(this.currentPhotoObject);
            boolean exists = FileLoader.getInstance(ArticleViewer.this.currentAccount).getPathToAttach(this.currentPhotoObject, true).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (exists) {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
                this.buttonState = -1;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                float f = 0.0f;
                if (this.autoDownload || FileLoader.getInstance(ArticleViewer.this.currentAccount).isLoadingFile(attachFileName)) {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        f = fileProgress.floatValue();
                    }
                } else {
                    this.buttonState = 0;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                this.radialProgress.setProgress(f, false);
            }
            invalidate();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.imageView.onDetachedFromWindow();
            DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageView.onAttachedToWindow();
            updateButtonState(false);
        }

        @Override
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(false);
        }

        @Override
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            updateButtonState(true);
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, ((float) j) / ((float) j2)), true);
            if (this.buttonState != 1) {
                updateButtonState(true);
            }
        }

        @Override
        public int getObserverTag() {
            return this.TAG;
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString("AttachPhoto", R.string.AttachPhoto));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            accessibilityNodeInfo.setText(sb.toString());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    public class BlockMapCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TLRPC$TL_pageBlockMap currentBlock;
        private int currentMapProvider;
        private int currentType;
        private ImageReceiver imageView;
        private boolean isFirst;
        private WebpageAdapter parentAdapter;
        private boolean photoPressed;
        private int textX;
        private int textY;

        public BlockMapCell(Context context, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
            this.imageView = new ImageReceiver(this);
            this.currentType = i;
        }

        public void setBlock(TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap, boolean z, boolean z2) {
            this.currentBlock = tLRPC$TL_pageBlockMap;
            this.isFirst = z;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (motionEvent.getAction() == 0 && this.imageView.isInsideImage(x, y)) {
                this.photoPressed = true;
            } else if (motionEvent.getAction() == 1 && this.photoPressed) {
                this.photoPressed = false;
                try {
                    TLRPC$GeoPoint tLRPC$GeoPoint = this.currentBlock.geo;
                    double d = tLRPC$GeoPoint.lat;
                    double d2 = tLRPC$GeoPoint._long;
                    ArticleViewer.this.parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (motionEvent.getAction() == 3) {
                this.photoPressed = false;
            }
            return this.photoPressed || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override
        @android.annotation.SuppressLint({"NewApi"})
        protected void onMeasure(int r32, int r33) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockMapCell.onMeasure(int, int):void");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock == null) {
                return;
            }
            Theme.chat_docBackPaint.setColor(ArticleViewer.this.getThemedColor(Theme.key_chat_inLocationBackground));
            canvas.drawRect(this.imageView.getImageX(), this.imageView.getImageY(), this.imageView.getImageX2(), this.imageView.getImageY2(), Theme.chat_docBackPaint);
            int centerX = (int) (this.imageView.getCenterX() - (Theme.chat_locationDrawable[0].getIntrinsicWidth() / 2));
            int centerY = (int) (this.imageView.getCenterY() - (Theme.chat_locationDrawable[0].getIntrinsicHeight() / 2));
            Drawable drawable = Theme.chat_locationDrawable[0];
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, Theme.chat_locationDrawable[0].getIntrinsicHeight() + centerY);
            Theme.chat_locationDrawable[0].draw(canvas);
            this.imageView.draw(canvas);
            if (this.currentMapProvider == 2 && this.imageView.hasNotThumb()) {
                if (ArticleViewer.this.chat_redLocationIcon == null) {
                    ArticleViewer.this.chat_redLocationIcon = ContextCompat.getDrawable(getContext(), R.drawable.map_pin).mutate();
                }
                int intrinsicWidth = (int) (ArticleViewer.this.chat_redLocationIcon.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (ArticleViewer.this.chat_redLocationIcon.getIntrinsicHeight() * 0.8f);
                int imageX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - intrinsicWidth) / 2.0f));
                int imageY = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() / 2.0f) - intrinsicHeight));
                ArticleViewer.this.chat_redLocationIcon.setAlpha((int) (this.imageView.getCurrentAlpha() * 255.0f));
                ArticleViewer.this.chat_redLocationIcon.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                ArticleViewer.this.chat_redLocationIcon.draw(canvas);
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            } else {
                i = 0;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.this.drawTextSelection(canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString("Map", R.string.Map));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            accessibilityNodeInfo.setText(sb.toString());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }
    }

    public class BlockChannelCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private Paint backgroundPaint;
        private int buttonWidth;
        private AnimatorSet currentAnimation;
        private TLRPC$TL_pageBlockChannel currentBlock;
        private int currentState;
        private int currentType;
        private ImageView imageView;
        private WebpageAdapter parentAdapter;
        private ContextProgressView progressView;
        private DrawingText textLayout;
        private TextView textView;
        private int textX;
        private int textX2;
        private int textY;

        public BlockChannelCell(Context context, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(11.0f);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
            this.backgroundPaint = new Paint();
            this.currentType = i;
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 14.0f);
            this.textView.setTypeface(AndroidUtilities.bold());
            this.textView.setText(LocaleController.getString("ChannelJoin", R.string.ChannelJoin));
            this.textView.setGravity(19);
            addView(this.textView, LayoutHelper.createFrame(-2, 39, 53));
            this.textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ArticleViewer.BlockChannelCell.this.lambda$new$0(view);
                }
            });
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setImageResource(R.drawable.list_check);
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.imageView, LayoutHelper.createFrame(39, 39, 53));
            ContextProgressView contextProgressView = new ContextProgressView(context, 0);
            this.progressView = contextProgressView;
            addView(contextProgressView, LayoutHelper.createFrame(39, 39, 53));
        }

        public void lambda$new$0(View view) {
            if (this.currentState != 0) {
                return;
            }
            setState(1, true);
            ArticleViewer articleViewer = ArticleViewer.this;
            articleViewer.joinChannel(this, articleViewer.loadedChannel);
        }

        public void setBlock(TLRPC$TL_pageBlockChannel tLRPC$TL_pageBlockChannel) {
            this.currentBlock = tLRPC$TL_pageBlockChannel;
            if (this.currentType == 0) {
                int themedColor = ArticleViewer.this.getThemedColor(Theme.key_switchTrack);
                int red = Color.red(themedColor);
                int green = Color.green(themedColor);
                int blue = Color.blue(themedColor);
                this.textView.setTextColor(ArticleViewer.this.getLinkTextColor());
                this.backgroundPaint.setColor(Color.argb(34, red, green, blue));
                this.imageView.setColorFilter(new PorterDuffColorFilter(ArticleViewer.this.getGrayTextColor(), PorterDuff.Mode.MULTIPLY));
            } else {
                this.textView.setTextColor(-1);
                this.backgroundPaint.setColor(2130706432);
                this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            }
            TLRPC$Chat chat = MessagesController.getInstance(ArticleViewer.this.currentAccount).getChat(Long.valueOf(tLRPC$TL_pageBlockChannel.channel.id));
            if (chat == null || chat.min) {
                ArticleViewer.this.loadChannel(this, this.parentAdapter, tLRPC$TL_pageBlockChannel.channel);
                setState(1, false);
            } else {
                ArticleViewer.this.loadedChannel = chat;
                if (chat.left && !chat.kicked) {
                    setState(0, false);
                } else {
                    setState(4, false);
                }
            }
            requestLayout();
        }

        public void setState(int i, boolean z) {
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.currentState = i;
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.currentAnimation = animatorSet2;
                TextView textView = this.textView;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, i == 0 ? 1.0f : 0.0f);
                TextView textView2 = this.textView;
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, i == 0 ? 1.0f : 0.1f);
                TextView textView3 = this.textView;
                Property property3 = View.SCALE_Y;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, i == 0 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property, i == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property2, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property3, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.imageView, (Property<ImageView, Float>) property, i == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.imageView, (Property<ImageView, Float>) property2, i == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.imageView, (Property<ImageView, Float>) property3, i == 2 ? 1.0f : 0.1f));
                this.currentAnimation.setDuration(150L);
                this.currentAnimation.start();
                return;
            }
            this.textView.setAlpha(i == 0 ? 1.0f : 0.0f);
            this.textView.setScaleX(i == 0 ? 1.0f : 0.1f);
            this.textView.setScaleY(i == 0 ? 1.0f : 0.1f);
            this.progressView.setAlpha(i == 1 ? 1.0f : 0.0f);
            this.progressView.setScaleX(i == 1 ? 1.0f : 0.1f);
            this.progressView.setScaleY(i == 1 ? 1.0f : 0.1f);
            this.imageView.setAlpha(i == 2 ? 1.0f : 0.0f);
            this.imageView.setScaleX(i == 2 ? 1.0f : 0.1f);
            this.imageView.setScaleY(i == 2 ? 1.0f : 0.1f);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.currentType != 0) {
                return super.onTouchEvent(motionEvent);
            }
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size, AndroidUtilities.dp(48.0f));
            this.textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
            this.buttonWidth = this.textView.getMeasuredWidth();
            this.progressView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
            this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
            TLRPC$TL_pageBlockChannel tLRPC$TL_pageBlockChannel = this.currentBlock;
            if (tLRPC$TL_pageBlockChannel != null) {
                this.textLayout = ArticleViewer.this.createLayoutForText(this, tLRPC$TL_pageBlockChannel.channel.title, null, (size - AndroidUtilities.dp(52.0f)) - this.buttonWidth, this.textY, this.currentBlock, StaticLayoutEx.ALIGN_LEFT(), 1, this.parentAdapter);
                if (this.parentAdapter.isRtl) {
                    this.textX2 = this.textX;
                } else {
                    this.textX2 = (getMeasuredWidth() - this.textX) - this.buttonWidth;
                }
                DrawingText drawingText = this.textLayout;
                if (drawingText != null) {
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            }
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.imageView.layout((this.textX2 + (this.buttonWidth / 2)) - AndroidUtilities.dp(19.0f), 0, this.textX2 + (this.buttonWidth / 2) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(39.0f));
            this.progressView.layout((this.textX2 + (this.buttonWidth / 2)) - AndroidUtilities.dp(19.0f), 0, this.textX2 + (this.buttonWidth / 2) + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(39.0f));
            TextView textView = this.textView;
            int i5 = this.textX2;
            textView.layout(i5, 0, textView.getMeasuredWidth() + i5, this.textView.getMeasuredHeight());
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(39.0f), this.backgroundPaint);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null || drawingText.getLineCount() <= 0) {
                return;
            }
            canvas.save();
            if (this.parentAdapter.isRtl) {
                canvas.translate((getMeasuredWidth() - this.textLayout.getLineWidth(0)) - this.textX, this.textY);
            } else {
                canvas.translate(this.textX, this.textY);
            }
            if (this.currentType == 0) {
                ArticleViewer.this.drawTextSelection(canvas, this);
            }
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public class BlockAuthorDateCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockAuthorDate currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockAuthorDateCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockAuthorDate tLRPC$TL_pageBlockAuthorDate) {
            this.currentBlock = tLRPC$TL_pageBlockAuthorDate;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            Spannable spannable;
            MetricAffectingSpan[] metricAffectingSpanArr;
            CharSequence charSequence;
            int indexOf;
            int i3 = 0;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockAuthorDate tLRPC$TL_pageBlockAuthorDate = this.currentBlock;
            if (tLRPC$TL_pageBlockAuthorDate != null) {
                ArticleViewer articleViewer = ArticleViewer.this;
                WebpageAdapter webpageAdapter = this.parentAdapter;
                TLRPC$RichText tLRPC$RichText = tLRPC$TL_pageBlockAuthorDate.author;
                CharSequence text = articleViewer.getText(webpageAdapter, this, tLRPC$RichText, tLRPC$RichText, tLRPC$TL_pageBlockAuthorDate, size);
                if (text instanceof Spannable) {
                    spannable = (Spannable) text;
                    metricAffectingSpanArr = (MetricAffectingSpan[]) spannable.getSpans(0, text.length(), MetricAffectingSpan.class);
                } else {
                    spannable = null;
                    metricAffectingSpanArr = null;
                }
                if (this.currentBlock.published_date != 0 && !TextUtils.isEmpty(text)) {
                    charSequence = LocaleController.formatString("ArticleDateByAuthor", R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(this.currentBlock.published_date * 1000), text);
                } else if (!TextUtils.isEmpty(text)) {
                    charSequence = LocaleController.formatString("ArticleByAuthor", R.string.ArticleByAuthor, text);
                } else {
                    charSequence = LocaleController.getInstance().getChatFullDate().format(this.currentBlock.published_date * 1000);
                }
                if (metricAffectingSpanArr != null) {
                    try {
                        if (metricAffectingSpanArr.length > 0 && (indexOf = TextUtils.indexOf((CharSequence) charSequence, text)) != -1) {
                            charSequence = Spannable.Factory.getInstance().newSpannable(charSequence);
                            for (int i4 = 0; i4 < metricAffectingSpanArr.length; i4++) {
                                MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i4];
                                charSequence.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i4]) + indexOf, 33);
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, charSequence, null, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp = AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
                    if (this.parentAdapter.isRtl) {
                        this.textX = (int) Math.floor(((size - this.textLayout.getLineLeft(0)) - this.textLayout.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                    } else {
                        this.textX = AndroidUtilities.dp(18.0f);
                    }
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                    i3 = dp;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(drawingText.getText());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public class BlockTitleCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockTitle currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockTitleCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockTitle tLRPC$TL_pageBlockTitle) {
            this.currentBlock = tLRPC$TL_pageBlockTitle;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockTitle tLRPC$TL_pageBlockTitle = this.currentBlock;
            if (tLRPC$TL_pageBlockTitle != null) {
                if (tLRPC$TL_pageBlockTitle.first) {
                    i3 = AndroidUtilities.dp(8.0f);
                    this.textY = AndroidUtilities.dp(16.0f);
                } else {
                    this.textY = AndroidUtilities.dp(8.0f);
                    i3 = 0;
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.text, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 += AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.textLayout == null) {
                return;
            }
            accessibilityNodeInfo.setText(((Object) this.textLayout.getText()) + ", " + LocaleController.getString("AccDescrIVTitle", R.string.AccDescrIVTitle));
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public class BlockKickerCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockKicker currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockKickerCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockKicker tLRPC$TL_pageBlockKicker) {
            this.currentBlock = tLRPC$TL_pageBlockKicker;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockKicker tLRPC$TL_pageBlockKicker = this.currentBlock;
            if (tLRPC$TL_pageBlockKicker != null) {
                if (tLRPC$TL_pageBlockKicker.first) {
                    this.textY = AndroidUtilities.dp(16.0f);
                    i3 = AndroidUtilities.dp(8.0f);
                } else {
                    this.textY = AndroidUtilities.dp(8.0f);
                    i3 = 0;
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.text, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 += AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public class BlockFooterCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockFooter currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockFooterCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockFooter tLRPC$TL_pageBlockFooter) {
            this.currentBlock = tLRPC$TL_pageBlockFooter;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            int dp;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockFooter tLRPC$TL_pageBlockFooter = this.currentBlock;
            if (tLRPC$TL_pageBlockFooter != null) {
                i3 = 0;
                if (tLRPC$TL_pageBlockFooter.level == 0) {
                    this.textY = AndroidUtilities.dp(8.0f);
                    this.textX = AndroidUtilities.dp(18.0f);
                } else {
                    this.textY = 0;
                    this.textX = AndroidUtilities.dp((r14 * 14) + 18);
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.text, (size - AndroidUtilities.dp(18.0f)) - this.textX, this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int height = createLayoutForText.getHeight();
                    if (this.currentBlock.level > 0) {
                        dp = AndroidUtilities.dp(8.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    i3 = height + dp;
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
            if (this.currentBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(18.0f), 0.0f, AndroidUtilities.dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public class BlockPreformattedCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockPreformatted currentBlock;
        private WebpageAdapter parentAdapter;
        private HorizontalScrollView scrollView;
        private View textContainer;
        private DrawingText textLayout;

        public BlockPreformattedCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context) {
                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (BlockPreformattedCell.this.textContainer.getMeasuredWidth() > getMeasuredWidth()) {
                        ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(true);
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }

                @Override
                protected void onScrollChanged(int i, int i2, int i3, int i4) {
                    super.onScrollChanged(i, i2, i3, i4);
                    if (ArticleViewer.this.pressedLinkOwnerLayout != null) {
                        ArticleViewer.this.pressedLinkOwnerLayout = null;
                        ArticleViewer.this.pressedLinkOwnerView = null;
                    }
                }
            };
            this.scrollView = horizontalScrollView;
            horizontalScrollView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            addView(this.scrollView, LayoutHelper.createFrame(-1, -2.0f));
            this.textContainer = new View(context) {
                @Override
                protected void onMeasure(int i, int i2) {
                    int i3;
                    int i4 = 1;
                    if (BlockPreformattedCell.this.currentBlock != null) {
                        BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                        blockPreformattedCell.textLayout = ArticleViewer.this.createLayoutForText(this, null, blockPreformattedCell.currentBlock.text, AndroidUtilities.dp(5000.0f), 0, BlockPreformattedCell.this.currentBlock, BlockPreformattedCell.this.parentAdapter);
                        if (BlockPreformattedCell.this.textLayout != null) {
                            i3 = BlockPreformattedCell.this.textLayout.getHeight();
                            int lineCount = BlockPreformattedCell.this.textLayout.getLineCount();
                            for (int i5 = 0; i5 < lineCount; i5++) {
                                i4 = Math.max((int) Math.ceil(BlockPreformattedCell.this.textLayout.getLineWidth(i5)), i4);
                            }
                        } else {
                            i3 = 0;
                        }
                    } else {
                        i3 = 1;
                    }
                    setMeasuredDimension(i4 + AndroidUtilities.dp(32.0f), i3);
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                    ArticleViewer articleViewer = ArticleViewer.this;
                    WebpageAdapter webpageAdapter2 = blockPreformattedCell.parentAdapter;
                    BlockPreformattedCell blockPreformattedCell2 = BlockPreformattedCell.this;
                    return articleViewer.checkLayoutForLinks(webpageAdapter2, motionEvent, blockPreformattedCell2, blockPreformattedCell2.textLayout, 0, 0) || super.onTouchEvent(motionEvent);
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    if (BlockPreformattedCell.this.textLayout != null) {
                        canvas.save();
                        BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                        ArticleViewer.this.drawTextSelection(canvas, blockPreformattedCell);
                        BlockPreformattedCell.this.textLayout.draw(canvas, this);
                        canvas.restore();
                        BlockPreformattedCell.this.textLayout.x = (int) getX();
                        BlockPreformattedCell.this.textLayout.y = (int) getY();
                    }
                }
            };
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            int dp = AndroidUtilities.dp(16.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
            int dp2 = AndroidUtilities.dp(12.0f);
            layoutParams.bottomMargin = dp2;
            layoutParams.topMargin = dp2;
            this.scrollView.addView(this.textContainer, layoutParams);
            if (Build.VERSION.SDK_INT >= 23) {
                this.scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                    @Override
                    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                        ArticleViewer.BlockPreformattedCell.this.lambda$new$0(view, i, i2, i3, i4);
                    }
                });
            }
            setWillNotDraw(false);
        }

        public void lambda$new$0(View view, int i, int i2, int i3, int i4) {
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = ArticleViewer.this.textSelectionHelper;
            if (articleTextSelectionHelper == null || !articleTextSelectionHelper.isInSelectionMode()) {
                return;
            }
            ArticleViewer.this.textSelectionHelper.invalidate();
        }

        public void setBlock(TLRPC$TL_pageBlockPreformatted tLRPC$TL_pageBlockPreformatted) {
            this.currentBlock = tLRPC$TL_pageBlockPreformatted;
            this.scrollView.setScrollX(0);
            this.textContainer.requestLayout();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size, this.scrollView.getMeasuredHeight());
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), ArticleViewer.preformattedBackgroundPaint);
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public void invalidate() {
            this.textContainer.invalidate();
            super.invalidate();
        }
    }

    public class BlockSubheaderCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockSubheader currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockSubheaderCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parentAdapter = webpageAdapter;
        }

        public void setBlock(TLRPC$TL_pageBlockSubheader tLRPC$TL_pageBlockSubheader) {
            this.currentBlock = tLRPC$TL_pageBlockSubheader;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        @SuppressLint({"NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockSubheader tLRPC$TL_pageBlockSubheader = this.currentBlock;
            if (tLRPC$TL_pageBlockSubheader != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockSubheader.text, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    i3 = 0;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.this.drawTextSelection(canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.textLayout == null) {
                return;
            }
            accessibilityNodeInfo.setText(((Object) this.textLayout.getText()) + ", " + LocaleController.getString("AccDescrIVHeading", R.string.AccDescrIVHeading));
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public class ReportCell extends FrameLayout {
        private boolean hasViews;
        private TextView textView;
        private TextView viewsTextView;

        public ReportCell(Context context) {
            super(context);
            setTag(90);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setText(LocaleController.getString("PreviewFeedback2", R.string.PreviewFeedback2));
            this.textView.setTextSize(1, 12.0f);
            this.textView.setGravity(17);
            this.textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            addView(this.textView, LayoutHelper.createFrame(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.viewsTextView = textView2;
            textView2.setTextSize(1, 12.0f);
            this.viewsTextView.setGravity(19);
            this.viewsTextView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            addView(this.viewsTextView, LayoutHelper.createFrame(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        }

        public void setViews(int i) {
            if (i == 0) {
                this.hasViews = false;
                this.viewsTextView.setVisibility(8);
                this.textView.setGravity(17);
            } else {
                this.hasViews = true;
                this.viewsTextView.setVisibility(0);
                this.textView.setGravity(21);
                this.viewsTextView.setText(LocaleController.formatPluralStringComma("Views", i));
            }
            int themedColor = ArticleViewer.this.getThemedColor(Theme.key_switchTrack);
            this.textView.setTextColor(ArticleViewer.this.getGrayTextColor());
            this.viewsTextView.setTextColor(ArticleViewer.this.getGrayTextColor());
            this.textView.setBackgroundColor(Color.argb(34, Color.red(themedColor), Color.green(themedColor), Color.blue(themedColor)));
        }
    }

    public void drawTextSelection(Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView) {
        drawTextSelection(canvas, articleSelectableView, 0);
    }

    public void drawTextSelection(Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView, int i) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
        View view = (View) articleSelectableView;
        if (view.getTag() != null && view.getTag() == "bottomSheet" && (articleTextSelectionHelper = this.textSelectionHelperBottomSheet) != null) {
            articleTextSelectionHelper.draw(canvas, articleSelectableView, i);
        } else {
            this.textSelectionHelper.draw(canvas, articleSelectableView, i);
        }
    }

    public boolean openPhoto(TLRPC$PageBlock tLRPC$PageBlock, WebpageAdapter webpageAdapter) {
        ArrayList arrayList;
        int indexOf;
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            if (!(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) || WebPageUtils.isVideo(webpageAdapter.currentPage, tLRPC$PageBlock)) {
                arrayList = new ArrayList(webpageAdapter.photoBlocks);
                indexOf = webpageAdapter.photoBlocks.indexOf(tLRPC$PageBlock);
            } else {
                arrayList = Collections.singletonList(tLRPC$PageBlock);
                indexOf = 0;
            }
            PhotoViewer photoViewer = PhotoViewer.getInstance();
            photoViewer.setParentActivity(this.parentFragment);
            if (photoViewer.openPhoto(indexOf, new RealPageBlocksAdapter(webpageAdapter.currentPage, arrayList), new PageBlocksPhotoViewerProvider(arrayList))) {
                checkVideoPlayer();
                return true;
            }
        }
        return false;
    }

    public class RealPageBlocksAdapter implements PhotoViewer.PageBlocksAdapter {
        private final TLRPC$WebPage page;
        private final List<TLRPC$PageBlock> pageBlocks;

        private RealPageBlocksAdapter(TLRPC$WebPage tLRPC$WebPage, List<TLRPC$PageBlock> list) {
            this.page = tLRPC$WebPage;
            this.pageBlocks = list;
        }

        @Override
        public int getItemsCount() {
            return this.pageBlocks.size();
        }

        @Override
        public TLRPC$PageBlock get(int i) {
            return this.pageBlocks.get(i);
        }

        @Override
        public List<TLRPC$PageBlock> getAll() {
            return this.pageBlocks;
        }

        @Override
        public boolean isVideo(int i) {
            return i < this.pageBlocks.size() && i >= 0 && WebPageUtils.isVideo(this.page, get(i));
        }

        @Override
        public boolean isHardwarePlayer(int i) {
            return i < this.pageBlocks.size() && i >= 0 && !WebPageUtils.isVideo(this.page, get(i)) && ArticleViewer.this.pages[0].adapter.getTypeForBlock(get(i)) == 5;
        }

        @Override
        public TLObject getMedia(int i) {
            if (i >= this.pageBlocks.size() || i < 0) {
                return null;
            }
            return WebPageUtils.getMedia(this.page, get(i));
        }

        @Override
        public File getFile(int i) {
            if (i >= this.pageBlocks.size() || i < 0) {
                return null;
            }
            return WebPageUtils.getMediaFile(this.page, get(i));
        }

        @Override
        public String getFileName(int i) {
            TLObject media = getMedia(i);
            if (media instanceof TLRPC$Photo) {
                media = FileLoader.getClosestPhotoSizeWithSize(((TLRPC$Photo) media).sizes, AndroidUtilities.getPhotoSize());
            }
            return FileLoader.getAttachFileName(media);
        }

        @Override
        public java.lang.CharSequence getCaption(int r9) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.RealPageBlocksAdapter.getCaption(int):java.lang.CharSequence");
        }

        @Override
        public TLRPC$PhotoSize getFileLocation(TLObject tLObject, int[] iArr) {
            TLRPC$PhotoSize closestPhotoSizeWithSize;
            if (tLObject instanceof TLRPC$Photo) {
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(((TLRPC$Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize2 != null) {
                    int i = closestPhotoSizeWithSize2.size;
                    iArr[0] = i;
                    if (i == 0) {
                        iArr[0] = -1;
                    }
                    return closestPhotoSizeWithSize2;
                }
                iArr[0] = -1;
                return null;
            }
            if (!(tLObject instanceof TLRPC$Document) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC$Document) tLObject).thumbs, 90)) == null) {
                return null;
            }
            int i2 = closestPhotoSizeWithSize.size;
            iArr[0] = i2;
            if (i2 == 0) {
                iArr[0] = -1;
            }
            return closestPhotoSizeWithSize;
        }

        @Override
        public void updateSlideshowCell(TLRPC$PageBlock tLRPC$PageBlock) {
            int childCount = ArticleViewer.this.pages[0].listView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ArticleViewer.this.pages[0].listView.getChildAt(i);
                if (childAt instanceof BlockSlideshowCell) {
                    BlockSlideshowCell blockSlideshowCell = (BlockSlideshowCell) childAt;
                    int indexOf = blockSlideshowCell.currentBlock.items.indexOf(tLRPC$PageBlock);
                    if (indexOf != -1) {
                        blockSlideshowCell.innerListView.setCurrentItem(indexOf, false);
                        return;
                    }
                }
            }
        }

        @Override
        public Object getParentObject() {
            return this.page;
        }
    }

    public class PageBlocksPhotoViewerProvider extends PhotoViewer.EmptyPhotoViewerProvider {
        private final List<TLRPC$PageBlock> pageBlocks;
        private final int[] tempArr = new int[2];

        public PageBlocksPhotoViewerProvider(List<TLRPC$PageBlock> list) {
            this.pageBlocks = list;
        }

        @Override
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i, boolean z) {
            ImageReceiver imageReceiverFromListView;
            if (i < 0 || i >= this.pageBlocks.size() || (imageReceiverFromListView = getImageReceiverFromListView(ArticleViewer.this.pages[0].listView, this.pageBlocks.get(i), this.tempArr)) == null) {
                return null;
            }
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            int[] iArr = this.tempArr;
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1];
            placeProviderObject.parentView = ArticleViewer.this.pages[0].listView;
            placeProviderObject.imageReceiver = imageReceiverFromListView;
            placeProviderObject.thumb = imageReceiverFromListView.getBitmapSafe();
            placeProviderObject.radius = imageReceiverFromListView.getRoundRadius(true);
            placeProviderObject.clipTopAddition = ArticleViewer.this.currentHeaderHeight;
            return placeProviderObject;
        }

        private ImageReceiver getImageReceiverFromListView(ViewGroup viewGroup, TLRPC$PageBlock tLRPC$PageBlock, int[] iArr) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ImageReceiver imageReceiverView = getImageReceiverView(viewGroup.getChildAt(i), tLRPC$PageBlock, iArr);
                if (imageReceiverView != null) {
                    return imageReceiverView;
                }
            }
            return null;
        }

        private ImageReceiver getImageReceiverView(View view, TLRPC$PageBlock tLRPC$PageBlock, int[] iArr) {
            ImageReceiver imageReceiverView;
            ImageReceiver imageReceiverView2;
            VideoPlayerHolderBase videoPlayerHolderBase;
            if (view instanceof BlockPhotoCell) {
                BlockPhotoCell blockPhotoCell = (BlockPhotoCell) view;
                if (blockPhotoCell.currentBlock != tLRPC$PageBlock) {
                    return null;
                }
                view.getLocationInWindow(iArr);
                return blockPhotoCell.imageView;
            }
            if (view instanceof BlockVideoCell) {
                BlockVideoCell blockVideoCell = (BlockVideoCell) view;
                if (blockVideoCell.currentBlock != tLRPC$PageBlock) {
                    return null;
                }
                view.getLocationInWindow(iArr);
                ArticleViewer articleViewer = ArticleViewer.this;
                if (blockVideoCell == articleViewer.currentPlayer && (videoPlayerHolderBase = articleViewer.videoPlayer) != null && videoPlayerHolderBase.firstFrameRendered && blockVideoCell.textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT < 24) {
                        blockVideoCell.imageView.setImageBitmap(blockVideoCell.textureView.getBitmap());
                    } else {
                        Surface surface = new Surface(blockVideoCell.textureView.getSurfaceTexture());
                        Bitmap createBitmap = Bitmap.createBitmap(blockVideoCell.textureView.getMeasuredWidth(), blockVideoCell.textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                        surface.release();
                        blockVideoCell.imageView.setImageBitmap(createBitmap);
                    }
                    blockVideoCell.firstFrameRendered = false;
                    blockVideoCell.textureView.setAlpha(0.0f);
                }
                return blockVideoCell.imageView;
            }
            if (view instanceof BlockCollageCell) {
                ImageReceiver imageReceiverFromListView = getImageReceiverFromListView(((BlockCollageCell) view).innerListView, tLRPC$PageBlock, iArr);
                if (imageReceiverFromListView != null) {
                    return imageReceiverFromListView;
                }
                return null;
            }
            if (view instanceof BlockSlideshowCell) {
                ImageReceiver imageReceiverFromListView2 = getImageReceiverFromListView(((BlockSlideshowCell) view).innerListView, tLRPC$PageBlock, iArr);
                if (imageReceiverFromListView2 != null) {
                    return imageReceiverFromListView2;
                }
                return null;
            }
            if (view instanceof BlockListItemCell) {
                BlockListItemCell blockListItemCell = (BlockListItemCell) view;
                if (blockListItemCell.blockLayout == null || (imageReceiverView2 = getImageReceiverView(blockListItemCell.blockLayout.itemView, tLRPC$PageBlock, iArr)) == null) {
                    return null;
                }
                return imageReceiverView2;
            }
            if (!(view instanceof BlockOrderedListItemCell)) {
                return null;
            }
            BlockOrderedListItemCell blockOrderedListItemCell = (BlockOrderedListItemCell) view;
            if (blockOrderedListItemCell.blockLayout == null || (imageReceiverView = getImageReceiverView(blockOrderedListItemCell.blockLayout.itemView, tLRPC$PageBlock, iArr)) == null) {
                return null;
            }
            return imageReceiverView;
        }

        @Override
        public void onClose() {
            super.onClose();
            ArticleViewer.this.checkVideoPlayer();
        }

        @Override
        public void onReleasePlayerBeforeClose(int i) {
            TLRPC$PageBlock tLRPC$PageBlock = (i < 0 || i >= this.pageBlocks.size()) ? null : this.pageBlocks.get(i);
            VideoPlayer videoPlayer = PhotoViewer.getInstance().getVideoPlayer();
            TextureView videoTextureView = PhotoViewer.getInstance().getVideoTextureView();
            SurfaceView videoSurfaceView = PhotoViewer.getInstance().getVideoSurfaceView();
            BlockVideoCell viewFromListView = getViewFromListView(ArticleViewer.this.pages[0].listView, tLRPC$PageBlock);
            if (viewFromListView != null && videoPlayer != null && videoTextureView != null) {
                ArticleViewer.this.videoStates.put(viewFromListView.currentBlock.video_id, viewFromListView.setState(BlockVideoCellState.fromPlayer(videoPlayer, viewFromListView, videoTextureView)));
                viewFromListView.firstFrameRendered = false;
                viewFromListView.textureView.setAlpha(0.0f);
                if (viewFromListView.videoState != null && viewFromListView.videoState.lastFrameBitmap != null) {
                    viewFromListView.imageView.setImageBitmap(viewFromListView.videoState.lastFrameBitmap);
                }
            }
            if (viewFromListView != null && videoPlayer != null && videoSurfaceView != null) {
                ArticleViewer.this.videoStates.put(viewFromListView.currentBlock.video_id, viewFromListView.setState(BlockVideoCellState.fromPlayer(videoPlayer, viewFromListView, videoSurfaceView)));
                viewFromListView.firstFrameRendered = false;
                viewFromListView.textureView.setAlpha(0.0f);
                if (viewFromListView.videoState != null && viewFromListView.videoState.lastFrameBitmap != null) {
                    viewFromListView.imageView.setImageBitmap(viewFromListView.videoState.lastFrameBitmap);
                }
            }
            ArticleViewer.this.checkVideoPlayer();
        }

        private BlockVideoCell getViewFromListView(ViewGroup viewGroup, TLRPC$PageBlock tLRPC$PageBlock) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof BlockVideoCell) {
                    BlockVideoCell blockVideoCell = (BlockVideoCell) childAt;
                    if (blockVideoCell.currentBlock == tLRPC$PageBlock) {
                        return blockVideoCell;
                    }
                }
            }
            return null;
        }
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, getResourcesProvider());
    }

    public boolean isFirstArticle() {
        return this.pagesStack.size() > 0 && (this.pagesStack.get(0) instanceof TLRPC$WebPage);
    }

    public void lambda$new$65() {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda20(this));
    }

    public void lambda$new$66() {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda20(this));
    }

    public void updatePages() {
        PageLayout[] pageLayoutArr;
        PageLayout pageLayout;
        if (this.actionBar == null || (pageLayout = (pageLayoutArr = this.pages)[0]) == null || pageLayoutArr[1] == null) {
            return;
        }
        float translationX = pageLayout.getVisibility() != 0 ? 0.0f : 1.0f - (this.pages[0].getTranslationX() / this.pages[0].getWidth());
        float f = 1.0f - translationX;
        this.actionBar.setProgress(0, this.pages[0].getProgress());
        this.actionBar.setProgress(1, this.pages[1].getProgress());
        this.actionBar.setTransitionProgress(f);
        if (!this.actionBar.isAddressing() && !this.actionBar.isSearching() && (this.windowView.movingPage || this.windowView.openingPage)) {
            if (isFirstArticle() || this.pagesStack.size() > 1) {
                float lerp = AndroidUtilities.lerp((this.pages[0].hasBackButton() || this.pagesStack.size() > 1) ? 1.0f : 0.0f, (this.pages[1].hasBackButton() || this.pagesStack.size() > 2) ? 1.0f : 0.0f, f);
                this.actionBar.backButtonDrawable.setRotation(1.0f - lerp, false);
                this.actionBar.forwardButtonDrawable.setState(false);
                this.actionBar.setBackButtonCached(lerp > 0.5f);
            } else {
                this.actionBar.forwardButtonDrawable.setState(false);
                this.actionBar.setBackButtonCached(false);
            }
            this.actionBar.setHasForward(this.pages[0].hasForwardButton());
        }
        this.actionBar.setBackgroundColor(0, this.page0Background.set(this.pages[0].getActionBarColor(), this.windowView.movingPage || this.windowView.openingPage));
        this.actionBar.setBackgroundColor(1, this.page1Background.set(this.pages[1].getActionBarColor(), this.windowView.movingPage || this.windowView.openingPage));
        this.actionBar.setColors(ColorUtils.blendARGB(this.pages[0].getActionBarColor(), this.pages[1].getActionBarColor(), f), false);
        this.actionBar.setMenuType((translationX > 0.5f ? this.pages[0] : this.pages[1]).type);
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.windowView.invalidate();
            return;
        }
        WindowView windowView = this.windowView;
        if (windowView != null) {
            windowView.invalidate();
        }
    }

    public void updateTitle(boolean z) {
        this.actionBar.setTitle(0, this.pages[0].getTitle(), z);
        this.actionBar.setSubtitle(0, this.pages[0].getSubtitle(), false);
        this.actionBar.setIsDangerous(0, this.pages[0].isWeb() && this.pages[0].getWebView() != null && this.pages[0].getWebView().isUrlDangerous(), false);
        this.actionBar.setTitle(1, this.pages[1].getTitle(), z);
        this.actionBar.setSubtitle(1, this.pages[1].getSubtitle(), false);
        this.actionBar.setIsDangerous(1, this.pages[1].isWeb() && this.pages[1].getWebView() != null && this.pages[1].getWebView().isUrlDangerous(), false);
    }

    public void setOpener(BotWebViewContainer.MyWebView myWebView) {
        if (this.pages == null) {
            return;
        }
        int i = 0;
        while (true) {
            PageLayout[] pageLayoutArr = this.pages;
            if (i >= pageLayoutArr.length) {
                return;
            }
            PageLayout pageLayout = pageLayoutArr[i];
            if (pageLayout != null) {
                pageLayout.webViewContainer.setOpener(myWebView);
            }
            i++;
        }
    }

    public class PageLayout extends FrameLayout {
        public final WebpageAdapter adapter;
        public boolean backButton;
        private final GradientClip clip;
        private boolean dangerousShown;
        public ErrorContainer errorContainer;
        private boolean errorShown;
        private int errorShownCode;
        private String errorShownDescription;
        public boolean forwardButton;
        private String lastFormattedUrl;
        private String lastUrl;
        private boolean lastVisible;
        public final LinearLayoutManager layoutManager;
        public final RecyclerListView listView;
        public float overrideProgress;
        public boolean paused;
        private boolean swipeBack;
        public final ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer swipeContainer;
        public int type;
        private CachedWeb web;
        public int webActionBarColor;
        public int webBackgroundColor;
        public final BotWebViewContainer webViewContainer;

        public void pause() {
            if (this.paused) {
                return;
            }
            if (getWebView() != null) {
                getWebView().onPause();
            }
            this.paused = true;
        }

        public void resume() {
            if (this.paused) {
                if (getWebView() != null) {
                    getWebView().onResume();
                }
                this.paused = false;
            }
        }

        public PageLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            int i = Theme.key_iv_background;
            this.webActionBarColor = ArticleViewer.this.getThemedColor(i);
            this.webBackgroundColor = ArticleViewer.this.getThemedColor(i);
            this.paused = false;
            this.overrideProgress = -1.0f;
            this.clip = new GradientClip();
            WebpageListView webpageListView = new WebpageListView(context, resourcesProvider) {
                {
                    ArticleViewer articleViewer = ArticleViewer.this;
                }

                @Override
                protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    super.onLayout(z, i2, i3, i4, i5);
                    PageLayout.this.overrideProgress = -1.0f;
                }
            };
            this.listView = webpageListView;
            webpageListView.setClipToPadding(false);
            float f = 56.0f;
            webpageListView.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
            webpageListView.setTopGlowOffset(AndroidUtilities.dp(56.0f));
            ((DefaultItemAnimator) webpageListView.getItemAnimator()).setDelayAnimations(false);
            Sheet sheet = ArticleViewer.this.sheet;
            WebpageAdapter webpageAdapter = new WebpageAdapter(context, sheet != null && sheet.halfSize());
            this.adapter = webpageAdapter;
            webpageListView.setAdapter(webpageAdapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
            this.layoutManager = linearLayoutManager;
            webpageListView.setLayoutManager(linearLayoutManager);
            webpageListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                    if (i2 == 0) {
                        ArticleViewer.this.textSelectionHelper.stopScrolling();
                    }
                }

                @Override
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    if (recyclerView.getChildCount() == 0) {
                        return;
                    }
                    recyclerView.invalidate();
                    ArticleViewer.this.textSelectionHelper.onParentScrolled();
                    ArticleViewer articleViewer = ArticleViewer.this;
                    Sheet sheet2 = articleViewer.sheet;
                    if (sheet2 == null) {
                        if (articleViewer.windowView != null) {
                            ArticleViewer.this.windowView.invalidate();
                        }
                    } else {
                        sheet2.windowView.invalidate();
                    }
                    ArticleViewer.this.updatePages();
                    ArticleViewer.this.checkScroll(i3);
                }
            });
            addView(webpageListView, LayoutHelper.createFrame(-1, -1.0f));
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer(getContext()) {
                private boolean ignoreLayout;

                @Override
                protected void onMeasure(int i2, int i3) {
                    this.ignoreLayout = true;
                    setOffsetY(View.MeasureSpec.getSize(i3) * 0.4f);
                    this.ignoreLayout = false;
                    int size = View.MeasureSpec.getSize(i3);
                    Sheet sheet2 = ArticleViewer.this.sheet;
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp((sheet2 == null || sheet2.halfSize()) ? 56.0f : 0.0f)) - AndroidUtilities.statusBarHeight, 1073741824));
                }

                @Override
                public void requestLayout() {
                    if (this.ignoreLayout) {
                        return;
                    }
                    super.requestLayout();
                }
            };
            this.swipeContainer = webViewSwipeContainer;
            webViewSwipeContainer.setShouldWaitWebViewScroll(true);
            webViewSwipeContainer.setFullSize(true);
            webViewSwipeContainer.setAllowFullSizeSwipe(true);
            BotWebViewContainer botWebViewContainer = new BotWebViewContainer(getContext(), resourcesProvider, ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite), false) {
                @Override
                public void onWebViewCreated() {
                    super.onWebViewCreated();
                    PageLayout pageLayout = PageLayout.this;
                    pageLayout.swipeContainer.setWebView(pageLayout.webViewContainer.getWebView());
                }

                @Override
                protected void onURLChanged(String str, boolean z, boolean z2) {
                    PageLayout pageLayout = PageLayout.this;
                    pageLayout.backButton = !z;
                    pageLayout.forwardButton = !z2;
                    ArticleViewer.this.updateTitle(true);
                    PageLayout pageLayout2 = PageLayout.this;
                    ArticleViewer articleViewer = ArticleViewer.this;
                    if (pageLayout2 != articleViewer.pages[0] || articleViewer.actionBar.isAddressing() || ArticleViewer.this.actionBar.isSearching() || ArticleViewer.this.windowView.movingPage || ArticleViewer.this.windowView.openingPage) {
                        return;
                    }
                    if (ArticleViewer.this.isFirstArticle() || ArticleViewer.this.pagesStack.size() > 1) {
                        BackDrawable backDrawable = ArticleViewer.this.actionBar.backButtonDrawable;
                        PageLayout pageLayout3 = PageLayout.this;
                        backDrawable.setRotation((pageLayout3.backButton || ArticleViewer.this.pagesStack.size() > 1) ? 0.0f : 1.0f, true);
                        WebActionBar webActionBar = ArticleViewer.this.actionBar;
                        PageLayout pageLayout4 = PageLayout.this;
                        webActionBar.setBackButtonCached(pageLayout4.backButton || ArticleViewer.this.pagesStack.size() > 1);
                        ArticleViewer.this.actionBar.forwardButtonDrawable.setState(false);
                    } else {
                        ArticleViewer.this.actionBar.setBackButtonCached(false);
                        ArticleViewer.this.actionBar.forwardButtonDrawable.setState(false);
                    }
                    ArticleViewer.this.actionBar.setHasForward(PageLayout.this.forwardButton);
                    WebActionBar webActionBar2 = ArticleViewer.this.actionBar;
                    PageLayout pageLayout5 = ArticleViewer.this.pages[0];
                    webActionBar2.setIsTonsite(pageLayout5 != null && pageLayout5.isTonsite());
                }

                @Override
                protected void onTitleChanged(String str) {
                    ArticleViewer.this.updateTitle(true);
                }

                @Override
                protected void onFaviconChanged(Bitmap bitmap) {
                    super.onFaviconChanged(bitmap);
                }

                @Override
                protected void onErrorShown(boolean z, int i2, String str) {
                    if (z) {
                        PageLayout.this.createErrorContainer();
                        PageLayout.this.errorContainer.set(getWebView() != null ? getWebView().getUrl() : null, PageLayout.this.errorShownCode = i2, PageLayout.this.errorShownDescription = str);
                        PageLayout pageLayout = PageLayout.this;
                        ErrorContainer errorContainer = pageLayout.errorContainer;
                        ArticleViewer articleViewer = ArticleViewer.this;
                        int i3 = Theme.key_iv_background;
                        errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(articleViewer.getThemedColor(i3)) <= 0.721f, false);
                        PageLayout pageLayout2 = PageLayout.this;
                        pageLayout2.errorContainer.setBackgroundColor(ArticleViewer.this.getThemedColor(i3));
                    }
                    PageLayout pageLayout3 = PageLayout.this;
                    AndroidUtilities.updateViewVisibilityAnimated(pageLayout3.errorContainer, pageLayout3.errorShown = z, 1.0f, false);
                    invalidate();
                }
            };
            this.webViewContainer = botWebViewContainer;
            botWebViewContainer.setOnCloseRequestedListener(new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.PageLayout.this.lambda$new$0();
                }
            });
            botWebViewContainer.setWebViewProgressListener(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ArticleViewer.PageLayout.this.lambda$new$1((Float) obj);
                }
            });
            botWebViewContainer.setDelegate(new BotWebViewContainer.Delegate() {
                @Override
                public boolean isClipboardAvailable() {
                    return BotWebViewContainer.Delegate.CC.$default$isClipboardAvailable(this);
                }

                @Override
                public void onSendWebViewData(String str) {
                    BotWebViewContainer.Delegate.CC.$default$onSendWebViewData(this, str);
                }

                @Override
                public void onSetBackButtonVisible(boolean z) {
                }

                @Override
                public void onSetSettingsButtonVisible(boolean z) {
                }

                @Override
                public void onSetupMainButton(boolean z, boolean z2, String str, int i2, int i3, boolean z3) {
                }

                @Override
                public void onWebAppExpand() {
                }

                @Override
                public void onWebAppOpenInvoice(TLRPC$InputInvoice tLRPC$InputInvoice, String str, TLObject tLObject) {
                }

                @Override
                public void onWebAppReady() {
                    BotWebViewContainer.Delegate.CC.$default$onWebAppReady(this);
                }

                @Override
                public void onWebAppSetActionBarColor(int i2, int i3, boolean z) {
                }

                @Override
                public void onWebAppSetBackgroundColor(int i2) {
                }

                @Override
                public void onWebAppSetupClosingBehavior(boolean z) {
                }

                @Override
                public void onWebAppSwipingBehavior(boolean z) {
                }

                @Override
                public void onWebAppSwitchInlineQuery(TLRPC$User tLRPC$User, String str, List<String> list) {
                }

                @Override
                public void onCloseRequested(Runnable runnable) {
                    PageLayout pageLayout = PageLayout.this;
                    ArticleViewer articleViewer = ArticleViewer.this;
                    if (articleViewer.pages[0] == pageLayout) {
                        articleViewer.goBack();
                    }
                }

                @Override
                public void onCloseToTabs() {
                    Sheet sheet2 = ArticleViewer.this.sheet;
                    if (sheet2 != null) {
                        sheet2.dismiss(true);
                    }
                }

                @Override
                public void onInstantClose() {
                    PageLayout pageLayout = PageLayout.this;
                    ArticleViewer articleViewer = ArticleViewer.this;
                    Sheet sheet2 = articleViewer.sheet;
                    if (sheet2 != null) {
                        sheet2.dismissInstant();
                    } else if (articleViewer.pages[0] == pageLayout) {
                        articleViewer.goBack();
                    }
                }

                @Override
                public void onWebAppBackgroundChanged(boolean z, int i2) {
                    PageLayout.this.setWebBgColor(z, i2);
                }
            });
            botWebViewContainer.setWebViewScrollListener(new BotWebViewContainer.WebViewScrollListener() {
                @Override
                public void onWebViewScrolled(WebView webView, int i2, int i3) {
                    ArticleViewer.this.updatePages();
                }
            });
            webViewSwipeContainer.addView(botWebViewContainer, LayoutHelper.createFrame(-1, -1.0f));
            webViewSwipeContainer.setScrollEndListener(new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.PageLayout.this.lambda$new$2();
                }
            });
            webViewSwipeContainer.setDelegate(new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate() {
                @Override
                public final void onDismiss() {
                    ArticleViewer.PageLayout.this.lambda$new$3();
                }
            });
            webViewSwipeContainer.setScrollListener(new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.PageLayout.this.lambda$new$4();
                }
            });
            Sheet sheet2 = ArticleViewer.this.sheet;
            if (sheet2 != null && !sheet2.halfSize()) {
                f = 0.0f;
            }
            webViewSwipeContainer.setTopActionBarOffsetY(AndroidUtilities.dp(f) + AndroidUtilities.statusBarHeight);
            addView(webViewSwipeContainer, LayoutHelper.createFrame(-1, -1.0f));
            cleanup();
            setType(0);
        }

        public void lambda$new$0() {
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity == null) {
                return;
            }
            BottomSheetTabs bottomSheetTabs = launchActivity.getBottomSheetTabs();
            if (bottomSheetTabs == null || !bottomSheetTabs.tryRemoveTabWith(ArticleViewer.this)) {
                ArticleViewer.this.close(true, true);
            }
        }

        public void lambda$new$1(Float f) {
            ArticleViewer articleViewer = ArticleViewer.this;
            if (this == articleViewer.pages[0]) {
                if (articleViewer.actionBar.lineProgressView.getCurrentProgress() > f.floatValue()) {
                    ArticleViewer.this.actionBar.lineProgressView.setProgress(0.0f, false);
                }
                ArticleViewer.this.actionBar.lineProgressView.setProgress(f.floatValue(), true);
            }
        }

        public void lambda$new$2() {
            this.webViewContainer.invalidateViewPortHeight(true);
        }

        public void lambda$new$3() {
            Sheet sheet = ArticleViewer.this.sheet;
            if (sheet != null) {
                this.swipeBack = true;
                sheet.dismiss(true);
            }
        }

        public void lambda$new$4() {
            this.webViewContainer.invalidateViewPortHeight();
            ErrorContainer errorContainer = this.errorContainer;
            if (errorContainer != null) {
                errorContainer.layout.setTranslationY((((-this.swipeContainer.getOffsetY()) + this.swipeContainer.getTopActionBarOffsetY()) - this.swipeContainer.getSwipeOffsetY()) / 2.0f);
            }
            ArticleViewer.this.updatePages();
        }

        public void setWebBgColor(boolean z, int i) {
            if (z) {
                this.webActionBarColor = Theme.blendOver(ArticleViewer.this.getThemedColor(Theme.key_iv_background), i);
                ArticleViewer articleViewer = ArticleViewer.this;
                if (this == articleViewer.pages[0]) {
                    if (SharedConfig.adaptableColorInBrowser) {
                        articleViewer.actionBar.setColors(this.webActionBarColor, true);
                    }
                    Sheet sheet = ArticleViewer.this.sheet;
                    if (sheet != null) {
                        sheet.checkNavColor();
                    }
                }
            } else {
                this.webBackgroundColor = Theme.blendOver(-1, i);
                ArticleViewer articleViewer2 = ArticleViewer.this;
                if (this == articleViewer2.pages[0]) {
                    if (SharedConfig.adaptableColorInBrowser) {
                        articleViewer2.actionBar.setMenuColors(this.webBackgroundColor);
                    }
                    Sheet sheet2 = ArticleViewer.this.sheet;
                    if (sheet2 != null) {
                        sheet2.checkNavColor();
                    }
                }
            }
            ArticleViewer.this.updatePages();
        }

        public ErrorContainer createErrorContainer() {
            if (this.errorContainer == null) {
                ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
                ErrorContainer errorContainer = new ErrorContainer(getContext());
                this.errorContainer = errorContainer;
                webViewSwipeContainer.addView(errorContainer, LayoutHelper.createFrame(-1, -1.0f));
                this.errorContainer.buttonView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ArticleViewer.PageLayout.this.lambda$createErrorContainer$5(view);
                    }
                });
                AndroidUtilities.updateViewVisibilityAnimated(this.errorContainer, this.errorShown, 1.0f, false);
            }
            return this.errorContainer;
        }

        public void lambda$createErrorContainer$5(View view) {
            BotWebViewContainer.MyWebView webView = this.webViewContainer.getWebView();
            if (webView != null) {
                webView.reload();
            }
        }

        public boolean isWeb() {
            return this.type == 1;
        }

        public boolean isArticle() {
            return this.type == 0;
        }

        public void setType(int i) {
            if (this.type != i) {
                cleanup();
            }
            this.type = i;
            this.listView.setVisibility(isArticle() ? 0 : 8);
            this.swipeContainer.setVisibility(isWeb() ? 0 : 8);
        }

        public String getTitle() {
            BotWebViewContainer.MyWebView webView;
            if (isArticle() && this.adapter.currentPage != null && this.adapter.currentPage.site_name != null) {
                return this.adapter.currentPage.site_name;
            }
            if (isWeb() && (webView = this.webViewContainer.getWebView()) != null) {
                return webView.getTitle();
            }
            return "";
        }

        public int getBackgroundColor() {
            if (isWeb() && this.dangerousShown) {
                return -5036514;
            }
            if (isWeb() && SharedConfig.adaptableColorInBrowser) {
                if (this.errorShown) {
                    return ArticleViewer.this.getThemedColor(Theme.key_iv_background);
                }
                return this.webBackgroundColor;
            }
            return ArticleViewer.this.getThemedColor(Theme.key_iv_background);
        }

        public int getActionBarColor() {
            if (isWeb() && SharedConfig.adaptableColorInBrowser) {
                return this.webActionBarColor;
            }
            return ArticleViewer.this.getThemedColor(Theme.key_iv_background);
        }

        public String getSubtitle() {
            BotWebViewContainer.MyWebView webView;
            if (isWeb() && (webView = this.webViewContainer.getWebView()) != null) {
                if (TextUtils.equals(this.lastUrl, webView.getUrl())) {
                    return this.lastFormattedUrl;
                }
                try {
                    String url = webView.getUrl();
                    this.lastUrl = url;
                    Uri parse = Uri.parse(BotWebViewContainer.magic2tonsite(url));
                    String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
                    try {
                        if (!isTonsite()) {
                            try {
                                Uri parse2 = Uri.parse(uri);
                                uri = Browser.replaceHostname(parse2, Browser.IDN_toUnicode(parse2.getHost()), null);
                            } catch (Exception e) {
                                FileLog.e((Throwable) e, false);
                            }
                            uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    if (uri.startsWith("//")) {
                        uri = uri.substring(2);
                    }
                    if (uri.startsWith("www.")) {
                        uri = uri.substring(4);
                    }
                    if (uri.endsWith("/")) {
                        uri = uri.substring(0, uri.length() - 1);
                    }
                    int indexOf = uri.indexOf("#");
                    if (indexOf >= 0) {
                        uri = uri.substring(0, indexOf);
                    }
                    this.lastFormattedUrl = uri;
                    return uri;
                } catch (Exception unused) {
                    return webView.getUrl();
                }
            }
            return "";
        }

        public void setLastVisible(boolean z) {
            if (this.lastVisible != z) {
                this.lastVisible = z;
                this.webViewContainer.setKeyboardFocusable(z);
            }
        }

        public boolean hasBackButton() {
            return this.backButton;
        }

        public void back() {
            if (!isWeb() || getWebView() == null) {
                return;
            }
            getWebView().goBack();
        }

        public boolean hasForwardButton() {
            return this.forwardButton;
        }

        public float getListTop() {
            if (isArticle()) {
                float height = this.listView.getHeight();
                for (int i = 0; i < this.listView.getChildCount(); i++) {
                    View childAt = this.listView.getChildAt(i);
                    RecyclerListView recyclerListView = this.listView;
                    if (((recyclerListView == null || recyclerListView.getLayoutManager() == null) ? 0 : this.listView.getLayoutManager().getItemViewType(childAt)) == 2147483646) {
                        height = Math.min(height, childAt.getBottom());
                    } else {
                        height = Math.min(height, childAt.getTop());
                    }
                }
                return height;
            }
            if (isWeb()) {
                return this.swipeContainer.getTranslationY();
            }
            return 0.0f;
        }

        public float getProgress() {
            BotWebViewContainer.MyWebView webView;
            Sheet sheet;
            View findViewByPosition;
            float min;
            if (isArticle()) {
                float f = this.overrideProgress;
                if (f >= 0.0f) {
                    return f;
                }
                int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
                if (this.layoutManager.findViewByPosition(findFirstVisibleItemPosition) == null) {
                    return 0.0f;
                }
                int[] iArr = this.adapter.sumItemHeights;
                if (iArr == null) {
                    int findLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
                    Sheet sheet2 = ArticleViewer.this.sheet;
                    if (sheet2 != null && sheet2.halfSize()) {
                        if (findFirstVisibleItemPosition < 1) {
                            findFirstVisibleItemPosition = 1;
                        }
                        if (findLastVisibleItemPosition < 1) {
                            findLastVisibleItemPosition = 1;
                        }
                    }
                    int itemCount = this.layoutManager.getItemCount() - 2;
                    if (findLastVisibleItemPosition >= itemCount) {
                        findViewByPosition = this.layoutManager.findViewByPosition(itemCount);
                    } else {
                        findViewByPosition = this.layoutManager.findViewByPosition(findFirstVisibleItemPosition);
                    }
                    if (findViewByPosition == null) {
                        return 0.0f;
                    }
                    float width = getWidth() / (r3 - 1);
                    float measuredHeight = findViewByPosition.getMeasuredHeight();
                    if (findLastVisibleItemPosition >= itemCount) {
                        min = (((itemCount - findFirstVisibleItemPosition) * width) * (this.listView.getMeasuredHeight() - findViewByPosition.getTop())) / measuredHeight;
                    } else {
                        min = width * (1.0f - ((Math.min(0, findViewByPosition.getTop() - this.listView.getPaddingTop()) + measuredHeight) / measuredHeight));
                    }
                    return ((findFirstVisibleItemPosition * width) + min) / getWidth();
                }
                int i = findFirstVisibleItemPosition - 1;
                return Utilities.clamp01((((i < 0 || i >= iArr.length) ? 0 : iArr[i]) + ((findFirstVisibleItemPosition == 0 && (sheet = ArticleViewer.this.sheet) != null && sheet.halfSize()) ? 0 : -r2.getTop())) / Math.max(1, this.adapter.fullHeight - this.listView.getHeight()));
            }
            if (!isWeb() || (webView = this.webViewContainer.getWebView()) == null) {
                return 0.0f;
            }
            return webView.getScrollProgress();
        }

        public void addProgress(float f) {
            BotWebViewContainer.MyWebView webView;
            float clamp01 = Utilities.clamp01(getProgress() + f);
            if (isArticle() || !isWeb() || (webView = this.webViewContainer.getWebView()) == null) {
                return;
            }
            webView.setScrollProgress(clamp01);
            ArticleViewer.this.updatePages();
        }

        public boolean isAtTop() {
            if (isArticle()) {
                return !this.listView.canScrollVertically(-1);
            }
            isWeb();
            return false;
        }

        public void scrollToTop(boolean z) {
            if (!isArticle()) {
                if (isWeb()) {
                    if (z) {
                        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
                        webViewSwipeContainer.stickTo((-webViewSwipeContainer.getOffsetY()) + this.swipeContainer.getTopActionBarOffsetY());
                        return;
                    } else {
                        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer2 = this.swipeContainer;
                        webViewSwipeContainer2.setSwipeOffsetY((-webViewSwipeContainer2.getOffsetY()) + this.swipeContainer.getTopActionBarOffsetY());
                        return;
                    }
                }
                return;
            }
            if (z) {
                SmoothScroller smoothScroller = new SmoothScroller(getContext());
                Sheet sheet = ArticleViewer.this.sheet;
                if (sheet != null && sheet.halfSize()) {
                    smoothScroller.setTargetPosition(1);
                    smoothScroller.setOffset(-AndroidUtilities.dp(32.0f));
                } else {
                    smoothScroller.setTargetPosition(0);
                }
                this.layoutManager.startSmoothScroll(smoothScroller);
                return;
            }
            LinearLayoutManager linearLayoutManager = this.layoutManager;
            Sheet sheet2 = ArticleViewer.this.sheet;
            linearLayoutManager.scrollToPositionWithOffset((sheet2 == null || !sheet2.halfSize()) ? 0 : 1, ArticleViewer.this.sheet != null ? AndroidUtilities.dp(32.0f) : 0);
        }

        public RecyclerListView getListView() {
            return this.listView;
        }

        public WebpageAdapter getAdapter() {
            return this.adapter;
        }

        public BotWebViewContainer getWebContainer() {
            return this.webViewContainer;
        }

        public BotWebViewContainer.MyWebView getWebView() {
            BotWebViewContainer botWebViewContainer = this.webViewContainer;
            if (botWebViewContainer != null) {
                return botWebViewContainer.getWebView();
            }
            return null;
        }

        public boolean isTonsite() {
            BotWebViewContainer.MyWebView webView;
            if (isWeb() && (webView = getWebView()) != null) {
                return BotWebViewContainer.isTonsite(BotWebViewContainer.magic2tonsite(webView.getUrl()));
            }
            return false;
        }

        public void cleanup() {
            this.backButton = false;
            this.forwardButton = false;
            setWeb(null);
            this.webViewContainer.destroyWebView();
            this.webViewContainer.resetWebView();
            ArticleViewer articleViewer = ArticleViewer.this;
            int i = Theme.key_iv_background;
            this.webActionBarColor = articleViewer.getThemedColor(i);
            int themedColor = ArticleViewer.this.getThemedColor(i);
            this.webBackgroundColor = themedColor;
            ErrorContainer errorContainer = this.errorContainer;
            if (errorContainer != null) {
                errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(themedColor) <= 0.721f, true);
                this.errorContainer.setBackgroundColor(this.webBackgroundColor);
                ErrorContainer errorContainer2 = this.errorContainer;
                this.errorShown = false;
                AndroidUtilities.updateViewVisibilityAnimated(errorContainer2, false, 1.0f, false);
            }
            this.adapter.cleanup();
            invalidate();
        }

        public void setWeb(CachedWeb cachedWeb) {
            CachedWeb cachedWeb2 = this.web;
            if (cachedWeb2 != cachedWeb) {
                if (cachedWeb2 != null) {
                    cachedWeb2.detach(this);
                }
                this.web = cachedWeb;
                if (cachedWeb != null) {
                    cachedWeb.attach(this);
                }
            }
        }

        @Override
        public void setTranslationX(float f) {
            super.setTranslationX(f);
            ArticleViewer.this.updatePages();
            if (ArticleViewer.this.windowView.openingPage) {
                ArticleViewer.this.containerView.invalidate();
            }
            if (ArticleViewer.this.windowView.movingPage) {
                ArticleViewer.this.containerView.invalidate();
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.setCurrentHeaderHeight((int) (articleViewer.windowView.startMovingHeaderHeight + ((AndroidUtilities.dp(56.0f) - ArticleViewer.this.windowView.startMovingHeaderHeight) * (f / getMeasuredWidth()))));
            }
            Sheet sheet = ArticleViewer.this.sheet;
            if (sheet != null) {
                sheet.updateTranslation();
            }
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
        }

        @Override
        protected void onAttachedToWindow() {
            ErrorContainer errorContainer;
            super.onAttachedToWindow();
            if (!this.errorShown || (errorContainer = this.errorContainer) == null) {
                return;
            }
            ArticleViewer articleViewer = ArticleViewer.this;
            int i = Theme.key_iv_background;
            errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(articleViewer.getThemedColor(i)) <= 0.721f, false);
            this.errorContainer.setBackgroundColor(ArticleViewer.this.getThemedColor(i));
        }
    }

    public class CachedWeb extends BottomSheetTabs.WebTabData {
        public CachedWeb(String str) {
            this.lastUrl = str;
            this.currentUrl = str;
        }

        public void attach(PageLayout pageLayout) {
            if (pageLayout == null) {
                return;
            }
            BotWebViewContainer.MyWebView myWebView = this.webView;
            if (myWebView != null) {
                myWebView.onResume();
                pageLayout.webViewContainer.replaceWebView(this.webView, this.proxy);
                pageLayout.setWebBgColor(true, this.actionBarColor);
                pageLayout.setWebBgColor(false, this.backgroundColor);
                return;
            }
            String str = this.lastUrl;
            if (str != null) {
                pageLayout.webViewContainer.loadUrl(UserConfig.selectedAccount, str);
            }
        }

        public void detach(PageLayout pageLayout) {
            if (pageLayout == null) {
                return;
            }
            pageLayout.webViewContainer.preserveWebView();
            this.webView = pageLayout.webViewContainer.getWebView();
            this.proxy = pageLayout.webViewContainer.getProxy();
            BotWebViewContainer.MyWebView myWebView = this.webView;
            if (myWebView != null) {
                myWebView.onPause();
                this.title = this.webView.getTitle();
                this.favicon = this.webView.getFavicon();
                this.lastUrl = this.webView.getUrl();
                this.actionBarColor = pageLayout.webActionBarColor;
                this.backgroundColor = pageLayout.webBackgroundColor;
            }
        }

        @Override
        public String getTitle() {
            BotWebViewContainer.MyWebView myWebView = this.webView;
            if (myWebView != null && !TextUtils.isEmpty(myWebView.getTitle())) {
                return this.webView.getTitle();
            }
            return super.getTitle();
        }
    }

    public class WebpageListView extends RecyclerListView {
        public WebpageListView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 90 && childAt.getBottom() < getMeasuredHeight()) {
                    int measuredHeight = getMeasuredHeight();
                    childAt.layout(0, measuredHeight - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), measuredHeight);
                    return;
                }
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.pressedLinkOwnerLayout == null || ArticleViewer.this.pressedLink != null || ((ArticleViewer.this.popupWindow != null && ArticleViewer.this.popupWindow.isShowing()) || (motionEvent.getAction() != 1 && motionEvent.getAction() != 3))) {
                if (ArticleViewer.this.pressedLinkOwnerLayout != null && ArticleViewer.this.pressedLink != null && motionEvent.getAction() == 1 && (getAdapter() instanceof WebpageAdapter)) {
                    ArticleViewer.this.checkLayoutForLinks((WebpageAdapter) getAdapter(), motionEvent, ArticleViewer.this.pressedLinkOwnerView, ArticleViewer.this.pressedLinkOwnerLayout, 0, 0);
                }
            } else {
                ArticleViewer.this.pressedLink = null;
                ArticleViewer.this.pressedLinkOwnerLayout = null;
                ArticleViewer.this.pressedLinkOwnerView = null;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.pressedLinkOwnerLayout != null && ArticleViewer.this.pressedLink == null && ((ArticleViewer.this.popupWindow == null || !ArticleViewer.this.popupWindow.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                ArticleViewer.this.pressedLink = null;
                ArticleViewer.this.pressedLinkOwnerLayout = null;
                ArticleViewer.this.pressedLinkOwnerView = null;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            ArticleViewer.this.checkVideoPlayer();
            super.dispatchDraw(canvas);
        }

        @Override
        public void onScrolled(int i, int i2) {
            Sheet.WindowView windowView;
            super.onScrolled(i, i2);
            Sheet sheet = ArticleViewer.this.sheet;
            if (sheet == null || (windowView = sheet.windowView) == null) {
                return;
            }
            windowView.invalidate();
        }
    }

    public class Sheet implements BaseFragment.AttachedSheet, BottomSheetTabsOverlay.Sheet {
        public final AnimationNotificationsLocker animationsLock = new AnimationNotificationsLocker();
        public boolean attachedToActionBar;
        private float backProgress;
        public View containerView;
        public final Context context;
        private BottomSheetTabDialog dialog;
        private ValueAnimator dismissAnimator;
        private float dismissProgress;
        private boolean dismissing;
        private boolean dismissingIntoTabs;
        public BaseFragment fragment;
        public boolean fullyAttachedToActionBar;
        private boolean lastVisible;
        public boolean nestedVerticalScroll;
        private Runnable onDismissListener;
        private ValueAnimator openAnimator;
        private float openProgress;
        public Theme.ResourcesProvider resourcesProvider;
        private boolean wasFullyVisible;
        public final WindowView windowView;

        private boolean imageAtTop() {
            return false;
        }

        public final boolean halfSize() {
            return true;
        }

        @Override
        public boolean isFullSize() {
            return true;
        }

        @Override
        public void setKeyboardHeightFromParent(int i) {
        }

        @Override
        public boolean showDialog(Dialog dialog) {
            return false;
        }

        public ArticleViewer getArticleViewer() {
            return ArticleViewer.this;
        }

        public Sheet(BaseFragment baseFragment) {
            this.fragment = baseFragment;
            this.resourcesProvider = baseFragment.getResourceProvider();
            Context context = baseFragment.getContext();
            this.context = context;
            WindowView windowView = new WindowView(context);
            this.windowView = windowView;
            new KeyboardNotifier(windowView, true, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ArticleViewer.Sheet.this.lambda$new$0((Integer) obj);
                }
            });
        }

        public void lambda$new$0(Integer num) {
            ArticleViewer.this.keyboardVisible = num.intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
        }

        public void setContainerView(View view) {
            this.containerView = view;
            updateTranslation();
        }

        @Override
        public WindowView mo991getWindowView() {
            return this.windowView;
        }

        @Override
        public boolean setDialog(BottomSheetTabDialog bottomSheetTabDialog) {
            this.dialog = bottomSheetTabDialog;
            return true;
        }

        @Override
        public BottomSheetTabs.WebTabData saveState() {
            BottomSheetTabs.WebTabData webTabData = new BottomSheetTabs.WebTabData();
            webTabData.title = ArticleViewer.this.actionBar.getTitle();
            ArticleViewer articleViewer = ArticleViewer.this;
            webTabData.articleViewer = articleViewer;
            PageLayout pageLayout = articleViewer.pages[0];
            webTabData.actionBarColor = (pageLayout == null || !SharedConfig.adaptableColorInBrowser) ? articleViewer.getThemedColor(Theme.key_iv_background) : pageLayout.getActionBarColor();
            ArticleViewer articleViewer2 = ArticleViewer.this;
            PageLayout pageLayout2 = articleViewer2.pages[0];
            webTabData.backgroundColor = (pageLayout2 == null || !SharedConfig.adaptableColorInBrowser) ? articleViewer2.getThemedColor(Theme.key_iv_background) : pageLayout2.getBackgroundColor();
            webTabData.overrideActionBarColor = true;
            webTabData.articleProgress = !this.attachedToActionBar ? 0.0f : ArticleViewer.this.pages[0].getProgress();
            PageLayout pageLayout3 = ArticleViewer.this.pages[0];
            webTabData.view2 = pageLayout3;
            webTabData.favicon = (pageLayout3 == null || pageLayout3.getWebView() == null) ? null : ArticleViewer.this.pages[0].getWebView().getFavicon();
            View view = webTabData.view2;
            if (view != null) {
                webTabData.viewWidth = view.getWidth();
                webTabData.viewHeight = webTabData.view2.getHeight();
            }
            webTabData.viewScroll = getListTop();
            webTabData.themeIsDark = Theme.isCurrentThemeDark();
            return webTabData;
        }

        @Override
        public boolean isShown() {
            return !this.dismissing;
        }

        public void attachInternal(BaseFragment baseFragment) {
            this.fragment = baseFragment;
            this.resourcesProvider = baseFragment.getResourceProvider();
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                if (chatActivity.getChatActivityEnterView() != null) {
                    chatActivity.getChatActivityEnterView().closeKeyboard();
                    chatActivity.getChatActivityEnterView().hidePopup(true, false);
                }
            }
            if (baseFragment.getParentActivity() instanceof LaunchActivity) {
                ((LaunchActivity) baseFragment.getParentActivity()).requestCustomNavigationBar();
            }
            BottomSheetTabDialog bottomSheetTabDialog = this.dialog;
            if (bottomSheetTabDialog != null) {
                bottomSheetTabDialog.attach();
            } else {
                AndroidUtilities.removeFromParent(this.windowView);
                if (baseFragment.getLayoutContainer() != null) {
                    baseFragment.getLayoutContainer().addView(this.windowView);
                }
            }
            PageLayout pageLayout = ArticleViewer.this.pages[0];
            if (pageLayout != null) {
                pageLayout.resume();
            }
            PageLayout pageLayout2 = ArticleViewer.this.pages[1];
            if (pageLayout2 != null) {
                pageLayout2.resume();
            }
        }

        public void show() {
            if (this.dismissing) {
                return;
            }
            attachInternal(this.fragment);
            animateOpen(true, true, null);
        }

        @Override
        public void dismiss() {
            dismiss(true);
        }

        @Override
        public void dismiss(boolean z) {
            if (this.dismissing) {
                return;
            }
            this.dismissing = true;
            this.dismissingIntoTabs = z;
            if (z) {
                LaunchActivity.instance.getBottomSheetTabsOverlay().dismissSheet(this);
            } else {
                animateDismiss(true, true, new Runnable() {
                    @Override
                    public final void run() {
                        ArticleViewer.Sheet.this.lambda$dismiss$1();
                    }
                });
            }
            checkNavColor();
            checkFullyVisible();
        }

        public void lambda$dismiss$1() {
            release();
            ArticleViewer.this.destroy();
        }

        @Override
        public void release() {
            PageLayout pageLayout = ArticleViewer.this.pages[0];
            if (pageLayout != null && pageLayout.swipeBack) {
                ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = ArticleViewer.this.pages[0].swipeContainer;
                webViewSwipeContainer.setSwipeOffsetY((-webViewSwipeContainer.offsetY) + webViewSwipeContainer.topActionBarOffsetY);
                ArticleViewer.this.pages[0].swipeBack = false;
            }
            PageLayout pageLayout2 = ArticleViewer.this.pages[0];
            if (pageLayout2 != null) {
                pageLayout2.pause();
            }
            PageLayout pageLayout3 = ArticleViewer.this.pages[1];
            if (pageLayout3 != null) {
                pageLayout3.pause();
            }
            BottomSheetTabDialog bottomSheetTabDialog = this.dialog;
            if (bottomSheetTabDialog != null) {
                bottomSheetTabDialog.detach();
            }
            BaseFragment baseFragment = this.fragment;
            if (baseFragment != null) {
                baseFragment.removeSheet(this);
                if (this.dialog == null) {
                    AndroidUtilities.removeFromParent(this.windowView);
                }
            }
            Runnable runnable = this.onDismissListener;
            if (runnable != null) {
                runnable.run();
                this.onDismissListener = null;
            }
        }

        public void dismissInstant() {
            if (this.dismissing) {
                return;
            }
            this.dismissing = true;
            release();
            ArticleViewer.this.destroy();
        }

        @Override
        public boolean isFullyVisible() {
            return this.fullyAttachedToActionBar && this.dismissProgress <= 0.0f && this.openProgress >= 1.0f && this.backProgress <= 0.0f && !this.dismissingIntoTabs && !this.dismissing;
        }

        public void checkFullyVisible() {
            if (this.wasFullyVisible != isFullyVisible()) {
                this.wasFullyVisible = isFullyVisible();
                BaseFragment baseFragment = this.fragment;
                if (baseFragment != null && (baseFragment.getParentLayout() instanceof ActionBarLayout)) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) this.fragment.getParentLayout();
                    ActionBarLayout.LayoutContainer layoutContainer = actionBarLayout.containerView;
                    if (layoutContainer != null) {
                        layoutContainer.invalidate();
                    }
                    ActionBarLayout.LayoutContainer layoutContainer2 = actionBarLayout.sheetContainer;
                    if (layoutContainer2 != null) {
                        layoutContainer2.invalidate();
                        return;
                    }
                    return;
                }
                if (this.windowView.getParent() instanceof View) {
                    ((View) this.windowView.getParent()).invalidate();
                }
            }
        }

        @Override
        public boolean attachedToParent() {
            return this.windowView.isAttachedToWindow();
        }

        @Override
        public boolean onAttachedBackPressed() {
            if (!ArticleViewer.this.keyboardVisible) {
                if (ArticleViewer.this.actionBar.isSearching()) {
                    ArticleViewer.this.actionBar.showSearch(false, true);
                    return true;
                }
                if (ArticleViewer.this.actionBar.isAddressing()) {
                    ArticleViewer.this.actionBar.showAddress(false, true);
                    return true;
                }
                if (ArticleViewer.this.isFirstArticle() && ArticleViewer.this.pages[0].hasBackButton()) {
                    ArticleViewer.this.pages[0].back();
                    return true;
                }
                if (ArticleViewer.this.pagesStack.size() > 1) {
                    ArticleViewer.this.goBack();
                    return true;
                }
                dismiss(false);
                return true;
            }
            AndroidUtilities.hideKeyboard(this.windowView);
            return true;
        }

        @Override
        public int getNavigationBarColor(int i) {
            float min = this.dismissingIntoTabs ? 0.0f : Math.min(this.openProgress, 1.0f - this.dismissProgress) * (1.0f - this.backProgress);
            int backgroundColor = getBackgroundColor();
            if (ArticleViewer.this.actionBar != null) {
                backgroundColor = ColorUtils.blendARGB(backgroundColor, ArticleViewer.this.actionBar.addressBackgroundColor, ArticleViewer.this.actionBar.addressingProgress);
            }
            return ColorUtils.blendARGB(i, backgroundColor, min);
        }

        @Override
        public boolean isAttachedLightStatusBar() {
            return this.attachedToActionBar && (this.dismissingIntoTabs ? 0.0f : Math.min(this.openProgress, 1.0f - this.dismissProgress) * (1.0f - this.backProgress)) > 0.25f && AndroidUtilities.computePerceivedBrightness(getActionBarColor()) >= 0.721f;
        }

        @Override
        public void setOnDismissListener(Runnable runnable) {
            this.onDismissListener = runnable;
        }

        public void reset() {
            this.dismissing = false;
            this.dismissingIntoTabs = false;
            ValueAnimator valueAnimator = this.openAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.dismissAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.dismissProgress = 0.0f;
            this.openProgress = 0.0f;
            checkFullyVisible();
            updateTranslation();
            this.windowView.invalidate();
        }

        public void animateOpen(final boolean z, boolean z2, final Runnable runnable) {
            ValueAnimator valueAnimator = this.openAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
                this.openAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ArticleViewer.Sheet.this.lambda$animateOpen$2(valueAnimator2);
                    }
                });
                this.openAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        Sheet.this.openProgress = z ? 1.0f : 0.0f;
                        Sheet.this.updateTranslation();
                        Sheet.this.checkNavColor();
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        Sheet.this.checkFullyVisible();
                        if (z) {
                            Sheet.this.animationsLock.unlock();
                        }
                    }
                });
                if (z) {
                    this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.openAnimator.setDuration(320L);
                } else {
                    this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    this.openAnimator.setDuration(180L);
                }
                this.openAnimator.start();
                return;
            }
            this.openProgress = z ? 1.0f : 0.0f;
            updateTranslation();
            if (runnable != null) {
                runnable.run();
            }
            checkFullyVisible();
            if (z) {
                this.animationsLock.unlock();
            }
        }

        public void lambda$animateOpen$2(ValueAnimator valueAnimator) {
            this.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            updateTranslation();
            checkNavColor();
            checkFullyVisible();
        }

        public void animateDismiss(final boolean z, boolean z2, final Runnable runnable) {
            ValueAnimator valueAnimator = this.dismissAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.dismissProgress, z ? 1.0f : 0.0f);
                this.dismissAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ArticleViewer.Sheet.this.lambda$animateDismiss$3(valueAnimator2);
                    }
                });
                this.dismissAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        Sheet.this.dismissProgress = z ? 1.0f : 0.0f;
                        if (!Sheet.this.dismissingIntoTabs) {
                            Sheet.this.updateTranslation();
                        }
                        Sheet.this.checkNavColor();
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        Sheet.this.checkFullyVisible();
                    }
                });
                this.dismissAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.dismissAnimator.setDuration(250L);
                this.dismissAnimator.start();
                return;
            }
            this.dismissProgress = z ? 1.0f : 0.0f;
            if (!this.dismissingIntoTabs) {
                updateTranslation();
            }
            if (runnable != null) {
                runnable.run();
            }
            checkFullyVisible();
        }

        public void lambda$animateDismiss$3(ValueAnimator valueAnimator) {
            this.dismissProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (!this.dismissingIntoTabs) {
                updateTranslation();
            }
            checkNavColor();
            checkFullyVisible();
        }

        public int getListTop() {
            int i = 0;
            PageLayout pageLayout = ArticleViewer.this.pages[0];
            float translationX = (pageLayout == null || pageLayout.getVisibility() != 0) ? 0.0f : 1.0f - (ArticleViewer.this.pages[0].getTranslationX() / ArticleViewer.this.pages[0].getWidth());
            float f = 1.0f - translationX;
            PageLayout pageLayout2 = ArticleViewer.this.pages[0];
            if (pageLayout2 != null && pageLayout2.getVisibility() == 0) {
                i = (int) (ArticleViewer.this.pages[0].getListTop() * translationX * ArticleViewer.this.pages[0].getAlpha());
            }
            PageLayout pageLayout3 = ArticleViewer.this.pages[1];
            return (pageLayout3 == null || pageLayout3.getVisibility() != 0) ? i : i + ((int) (ArticleViewer.this.pages[1].getListTop() * f * ArticleViewer.this.pages[1].getAlpha()));
        }

        public void checkNavColor() {
            BottomSheetTabDialog bottomSheetTabDialog = this.dialog;
            AndroidUtilities.setLightStatusBar(bottomSheetTabDialog != null ? bottomSheetTabDialog.windowView : this.windowView, isAttachedLightStatusBar());
            BottomSheetTabDialog bottomSheetTabDialog2 = this.dialog;
            if (bottomSheetTabDialog2 != null) {
                bottomSheetTabDialog2.updateNavigationBarColor();
            } else {
                LaunchActivity.instance.checkSystemBarColors(true, true, true, false);
                AndroidUtilities.setLightNavigationBar(mo991getWindowView(), AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundGray))) >= 0.721f);
            }
        }

        public int getBackgroundColor() {
            if (!SharedConfig.adaptableColorInBrowser) {
                return Theme.getColor(Theme.key_iv_navigationBackground);
            }
            return ColorUtils.blendARGB(ArticleViewer.this.pages[0].getBackgroundColor(), ArticleViewer.this.pages[1].getBackgroundColor(), 1.0f - (ArticleViewer.this.pages[0].getVisibility() != 0 ? 0.0f : 1.0f - (ArticleViewer.this.pages[0].getTranslationX() / ArticleViewer.this.pages[0].getWidth())));
        }

        public int getActionBarColor() {
            if (!SharedConfig.adaptableColorInBrowser) {
                return Theme.getColor(Theme.key_iv_background);
            }
            return ColorUtils.blendARGB(ArticleViewer.this.pages[0].getActionBarColor(), ArticleViewer.this.pages[1].getActionBarColor(), 1.0f - (ArticleViewer.this.pages[0].getVisibility() != 0 ? 0.0f : 1.0f - (ArticleViewer.this.pages[0].getTranslationX() / ArticleViewer.this.pages[0].getWidth())));
        }

        public int getListPaddingTop() {
            return AndroidUtilities.dp(imageAtTop() ? 0.0f : 20.0f);
        }

        public int getEmptyPadding() {
            int dp = AndroidUtilities.dp(16.0f);
            View view = this.containerView;
            return (dp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight())) - (getListTop() - getListPaddingTop());
        }

        public void updateTranslation() {
            View view = this.containerView;
            if (view == null) {
                return;
            }
            view.setTranslationY(getEmptyPadding() * Math.max(1.0f - this.openProgress, this.dismissingIntoTabs ? 0.0f : this.dismissProgress));
            this.windowView.invalidate();
        }

        public class WindowView extends SizeNotifierFrameLayout implements BaseFragment.AttachedSheetWindow, BottomSheetTabsOverlay.SheetView {
            private final AnimatedFloat attachedActionBar;
            private final Paint backgroundPaint;
            private final Path clipPath;
            private Path clipPath2;
            private RectF clipRect;
            private boolean drawingFromOverlay;
            private final Paint handlePaint;
            private final Paint headerBackgroundPaint;
            private final RectF rect;
            private final RectF rect2;
            private final Paint scrimPaint;
            private final Paint shadowPaint;
            private boolean stoppedAtFling;

            public WindowView(Context context) {
                super(context);
                this.scrimPaint = new Paint(1);
                this.shadowPaint = new Paint(1);
                this.backgroundPaint = new Paint(1);
                this.handlePaint = new Paint(1);
                this.headerBackgroundPaint = new Paint(1);
                this.attachedActionBar = new AnimatedFloat(this, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.clipPath = new Path();
                this.rect = new RectF();
                this.rect2 = new RectF();
                this.clipRect = new RectF();
                this.clipPath2 = new Path();
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                Sheet.this.updateTranslation();
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                float f;
                if (this.drawingFromOverlay) {
                    return;
                }
                float min = Math.min(Sheet.this.openProgress, 1.0f - Sheet.this.dismissProgress);
                this.scrimPaint.setColor(-16777216);
                this.scrimPaint.setAlpha((int) (96.0f * min * (1.0f - Sheet.this.backProgress)));
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.scrimPaint);
                int listTop = Sheet.this.getListTop() - Sheet.this.getListPaddingTop();
                boolean z = listTop < AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight() && min > 0.95f;
                Sheet sheet = Sheet.this;
                if (sheet.attachedToActionBar != z) {
                    sheet.attachedToActionBar = z;
                    sheet.checkNavColor();
                }
                float f2 = this.attachedActionBar.set(z);
                Sheet sheet2 = Sheet.this;
                if (sheet2.fullyAttachedToActionBar != (f2 >= 0.999f)) {
                    sheet2.fullyAttachedToActionBar = f2 >= 0.999f;
                    sheet2.checkFullyVisible();
                }
                int lerp = AndroidUtilities.lerp(listTop, 0, Utilities.clamp(f2, 1.0f, 0.0f));
                float emptyPadding = Sheet.this.getEmptyPadding() * Math.max(1.0f - Sheet.this.openProgress, Sheet.this.dismissProgress);
                canvas.save();
                canvas.translate(getWidth() * Sheet.this.backProgress, emptyPadding);
                float f3 = lerp;
                this.rect.set(0.0f, f3, getWidth(), getHeight() + AndroidUtilities.dp(16.0f));
                float f4 = 1.0f - f2;
                float dp = AndroidUtilities.dp(16.0f) * f4;
                if (f2 < 1.0f) {
                    this.shadowPaint.setColor(0);
                    this.shadowPaint.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), Theme.multAlpha(-16777216, min * 0.26f));
                    canvas.drawRoundRect(this.rect, dp, dp, this.shadowPaint);
                }
                if (dp <= 0.0f) {
                    canvas.clipRect(this.rect);
                } else {
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(this.rect, dp, dp, Path.Direction.CW);
                    canvas.clipPath(this.clipPath);
                }
                this.backgroundPaint.setColor(ArticleViewer.this.pages[1].getBackgroundColor());
                canvas.drawRect(this.rect, this.backgroundPaint);
                this.backgroundPaint.setColor(ArticleViewer.this.pages[0].getBackgroundColor());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.rect);
                rectF.left = ArticleViewer.this.pages[0].getX();
                canvas.drawRect(rectF, this.backgroundPaint);
                ArticleViewer.this.actionBar.drawShadow = z && Sheet.this.getListPaddingTop() + listTop <= AndroidUtilities.statusBarHeight + ArticleViewer.this.currentHeaderHeight;
                if (f2 > 0.0f) {
                    canvas.save();
                    float lerp2 = AndroidUtilities.lerp(Sheet.this.getListPaddingTop() + listTop + 1, 0, f2);
                    canvas.translate(0.0f, lerp2);
                    f = f3;
                    ArticleViewer.this.actionBar.drawBackground(canvas, ((listTop + Sheet.this.getListPaddingTop()) + 1) - lerp2, 1.0f, f2, true);
                    canvas.restore();
                } else {
                    f = f3;
                }
                canvas.translate(0.0f, -emptyPadding);
                if (!AndroidUtilities.makingGlobalBlurBitmap && (!ArticleViewer.this.pages[0].isWeb() || canvas.isHardwareAccelerated())) {
                    super.dispatchDraw(canvas);
                }
                canvas.translate(0.0f, emptyPadding);
                if (f2 < 1.0f) {
                    this.handlePaint.setColor(ColorUtils.blendARGB(Theme.multAlpha(AndroidUtilities.computePerceivedBrightness(Sheet.this.getBackgroundColor()) < 0.721f ? -1 : -16777216, 0.15f), -16777216, f2));
                    this.handlePaint.setAlpha((int) (r1.getAlpha() * f4));
                    float width = getWidth() / 2.0f;
                    float listPaddingTop = (f + (Sheet.this.getListPaddingTop() / 2.0f)) - (AndroidUtilities.dp(8.0f) * f2);
                    float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), f2) / 2.0f;
                    this.rect.set(width - lerp3, listPaddingTop - AndroidUtilities.dp(2.0f), width + lerp3, listPaddingTop + AndroidUtilities.dp(2.0f));
                    RectF rectF2 = this.rect;
                    canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.rect.height() / 2.0f, this.handlePaint);
                }
                canvas.restore();
            }

            @Override
            public void setDrawingFromOverlay(boolean z) {
                if (this.drawingFromOverlay != z) {
                    this.drawingFromOverlay = z;
                    invalidate();
                }
            }

            @Override
            public RectF getRect() {
                this.clipRect.set(0.0f, (Sheet.this.attachedToActionBar ? 0 : r1.getListTop() - Sheet.this.getListPaddingTop()) + (Sheet.this.getEmptyPadding() * Math.max(1.0f - Sheet.this.openProgress, Sheet.this.dismissProgress)), getWidth(), getHeight());
                return this.clipRect;
            }

            @Override
            public float drawInto(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2, boolean z) {
                rectF2.set(getRect());
                AndroidUtilities.lerp(rectF2, rectF, f, rectF2);
                float min = Math.min(Sheet.this.openProgress, 1.0f - Sheet.this.dismissProgress);
                float f3 = 1.0f - f;
                this.scrimPaint.setColor(-16777216);
                this.scrimPaint.setAlpha((int) (min * f3 * 96.0f * (1.0f - Sheet.this.backProgress)));
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.scrimPaint);
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f), f);
                this.backgroundPaint.setColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite));
                this.clipPath2.rewind();
                this.clipPath2.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(this.clipPath2, this.backgroundPaint);
                if (getChildCount() == 1) {
                    if (Sheet.this.attachedToActionBar) {
                        canvas.save();
                        canvas.clipPath(this.clipPath2);
                        canvas.translate(0.0f, rectF2.top);
                        ArticleViewer.this.actionBar.draw(canvas);
                        canvas.restore();
                    }
                    View childAt = getChildAt(0);
                    canvas.save();
                    float lerp2 = z ? 1.0f : AndroidUtilities.lerp(1.0f, 0.99f, f);
                    float f4 = lerp2 - 1.0f;
                    if (Math.abs(f4) > 0.01f) {
                        canvas.scale(lerp2, lerp2, rectF2.centerX(), rectF2.centerY());
                    }
                    canvas.clipPath(this.clipPath2);
                    if (Math.abs(f4) > 0.01f) {
                        float f5 = 1.0f / lerp2;
                        canvas.scale(f5, f5, rectF2.centerX(), rectF2.centerY());
                    }
                    canvas.translate(0.0f, (-Sheet.this.getListTop()) + rectF2.top + ((Sheet.this.attachedToActionBar ? ArticleViewer.this.actionBar.getMeasuredHeight() : 0) * f3));
                    childAt.draw(canvas);
                    canvas.restore();
                }
                return lerp;
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < (Sheet.this.attachedToActionBar ? 0 : r1.getListTop())) {
                        Sheet.this.dismiss(true);
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public boolean onNestedFling(View view, float f, float f2, boolean z) {
                return super.onNestedFling(view, f, f2, z);
            }

            @Override
            public boolean onNestedPreFling(View view, float f, float f2) {
                boolean onNestedPreFling = super.onNestedPreFling(view, f, f2);
                if (Sheet.this.halfSize()) {
                    if (ArticleViewer.this.pages[0].isAtTop() && f2 < -1000.0f) {
                        Sheet.this.dismiss(true);
                    } else {
                        Sheet.this.animateDismiss(false, true, null);
                    }
                }
                this.stoppedAtFling = true;
                return onNestedPreFling;
            }

            @Override
            public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
                super.onNestedScroll(view, i, i2, i3, i4);
            }

            @Override
            public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
                Sheet sheet = Sheet.this;
                if (!sheet.nestedVerticalScroll) {
                    sheet.nestedVerticalScroll = i2 != 0;
                }
                if (ArticleViewer.this.pages[0].isAtTop() && Sheet.this.halfSize()) {
                    iArr[1] = Math.min((int) (Sheet.this.getEmptyPadding() * Sheet.this.dismissProgress), i2);
                    Sheet sheet2 = Sheet.this;
                    sheet2.dismissProgress = Utilities.clamp(sheet2.dismissProgress - (i2 / Sheet.this.getEmptyPadding()), 1.0f, 0.0f);
                    Sheet.this.updateTranslation();
                    Sheet.this.checkFullyVisible();
                }
            }

            @Override
            public void onNestedScrollAccepted(View view, View view2, int i) {
                super.onNestedScrollAccepted(view, view2, i);
            }

            @Override
            public boolean onStartNestedScroll(View view, View view2, int i) {
                this.stoppedAtFling = false;
                return Sheet.this.halfSize() && i == 2;
            }

            @Override
            public void onStopNestedScroll(View view) {
                Sheet sheet = Sheet.this;
                sheet.nestedVerticalScroll = false;
                if (sheet.halfSize() && !this.stoppedAtFling) {
                    if (Sheet.this.dismissProgress > 0.25f) {
                        Sheet.this.dismiss(true);
                    } else {
                        Sheet.this.animateDismiss(false, true, null);
                    }
                }
                super.onStopNestedScroll(view);
            }
        }

        public void setBackProgress(float f) {
            this.backProgress = f;
            this.windowView.invalidate();
            checkNavColor();
            checkFullyVisible();
        }

        public float getBackProgress() {
            return this.backProgress;
        }

        public ValueAnimator animateBackProgressTo(float f) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.backProgress, f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ArticleViewer.Sheet.this.lambda$animateBackProgressTo$4(valueAnimator);
                }
            });
            return ofFloat;
        }

        public void lambda$animateBackProgressTo$4(ValueAnimator valueAnimator) {
            setBackProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override
        public void setLastVisible(boolean z) {
            this.lastVisible = z;
            ArticleViewer.this.pages[0].setLastVisible(z);
            ArticleViewer.this.pages[1].setLastVisible(false);
        }

        public void updateLastVisible() {
            ArticleViewer.this.pages[0].setLastVisible(this.lastVisible);
            ArticleViewer.this.pages[1].setLastVisible(false);
        }
    }

    public static class ErrorContainer extends FrameLayout {
        private final ButtonWithCounterView buttonView;
        private final TextView codeView;
        private boolean dark;
        private ValueAnimator darkAnimator;
        private final TextView descriptionView;
        private final BackupImageView imageView;
        private boolean imageViewSet;
        public final LinearLayout layout;
        private final TextView titleView;

        public ErrorContainer(Context context) {
            super(context);
            this.dark = true;
            setVisibility(8);
            LinearLayout linearLayout = new LinearLayout(context);
            this.layout = linearLayout;
            linearLayout.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f));
            linearLayout.setOrientation(1);
            linearLayout.setGravity(3);
            addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            linearLayout.addView(backupImageView, LayoutHelper.createLinear(100, 100));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 19.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(-1);
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 3, 0, 4, 0, 2));
            TextView textView2 = new TextView(context);
            this.descriptionView = textView2;
            textView2.setTextSize(1, 15.0f);
            textView2.setTextColor(-1);
            textView2.setSingleLine(false);
            textView2.setMaxLines(3);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 3, 0, 0, 0, 1));
            TextView textView3 = new TextView(context);
            this.codeView = textView3;
            textView3.setTextSize(1, 12.0f);
            textView3.setTextColor(-1);
            textView3.setAlpha(0.4f);
            linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 3));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null);
            this.buttonView = buttonWithCounterView;
            buttonWithCounterView.setMinWidth(AndroidUtilities.dp(140.0f));
            buttonWithCounterView.setText(LocaleController.getString(R.string.Refresh), false);
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-2, 40, 3, 0, 12, 0, 0));
        }

        public void setDark(boolean z, boolean z2) {
            if (this.dark == z) {
                return;
            }
            this.dark = z;
            ValueAnimator valueAnimator = this.darkAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                this.darkAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ArticleViewer.ErrorContainer.this.lambda$setDark$0(valueAnimator2);
                    }
                });
                this.darkAnimator.start();
                return;
            }
            this.titleView.setTextColor(!z ? -16777216 : -1);
            this.descriptionView.setTextColor(!z ? -16777216 : -1);
            this.codeView.setTextColor(z ? -1 : -16777216);
        }

        public void lambda$setDark$0(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.titleView.setTextColor(ColorUtils.blendARGB(-16777216, -1, floatValue));
            this.descriptionView.setTextColor(ColorUtils.blendARGB(-16777216, -1, floatValue));
            this.codeView.setTextColor(ColorUtils.blendARGB(-16777216, -1, floatValue));
        }

        public void set(String str, int i, String str2) {
            this.titleView.setText(LocaleController.getString(R.string.WebErrorTitle));
            String magic2tonsite = BotWebViewContainer.magic2tonsite(str);
            this.descriptionView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((magic2tonsite == null || Uri.parse(magic2tonsite) == null || Uri.parse(magic2tonsite).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(magic2tonsite).getAuthority())), this.descriptionView.getPaint().getFontMetricsInt(), false));
            this.codeView.setText(str2);
        }

        @Override
        public void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0 || this.imageViewSet) {
                return;
            }
            this.imageViewSet = true;
            MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(this.imageView, "tg_placeholders_android", "🧐", "100_100");
        }
    }

    public void destroy() {
        for (int i = 0; i < this.pagesStack.size(); i++) {
            Object obj = this.pagesStack.get(i);
            if (obj instanceof CachedWeb) {
                PageLayout pageLayout = this.pages[0];
                if (pageLayout != null && pageLayout.web == obj) {
                    ((CachedWeb) obj).detach(this.pages[0]);
                }
                PageLayout pageLayout2 = this.pages[1];
                if (pageLayout2 != null && pageLayout2.web == obj) {
                    ((CachedWeb) obj).detach(this.pages[1]);
                }
                ((CachedWeb) obj).destroy();
            }
        }
        this.pagesStack.clear();
        destroyArticleViewer();
    }
}
