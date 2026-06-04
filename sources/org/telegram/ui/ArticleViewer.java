package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
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
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
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
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import j$.util.Objects;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CodeHighlighting;
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
import org.telegram.messenger.utils.WindowVisibilityManager;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
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
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnchorSpan;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
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
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.WebPlayerView;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.MultiLayoutTypingAnimator;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.BookmarksFragment;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.SearchEngine;
import org.telegram.ui.web.WebActionBar;
import org.telegram.ui.web.WebBrowserSettings;
import org.telegram.ui.web.WebInstantView;
import ru.noties.jlatexmath.JLatexMathDrawable;

public class ArticleViewer extends IArticleViewer implements NotificationCenter.NotificationCenterDelegate {
    private static TextPaint channelNamePaint;
    private static TextPaint channelNamePhotoPaint;
    public static TLRPC.WebPage debugCopiedRichMessageWebPage;
    private static Paint dividerPaint;
    private static Paint dotsPaint;
    private static TextPaint embedPostAuthorPaint;
    private static TextPaint embedPostDatePaint;
    private static TextPaint listTextNumPaint;
    private static TextPaint listTextPointerPaint;
    private static Paint photoBackgroundPaint;
    private static Paint preformattedBackgroundPaint;
    private static Paint quoteLinePaint;
    private static TextPaint relatedArticleHeaderPaint;
    private static TextPaint relatedArticleTextPaint;
    public static Paint tableHalfLinePaint;
    public static Paint tableHeaderPaint;
    public static Paint tableLinePaint;
    public static Paint tableStripPaint;
    private static Paint urlPaint;
    private static Paint webpageMarkPaint;
    private static Paint webpageSearchPaint;
    private static Paint webpageUrlPaint;
    private final String BOTTOM_SHEET_VIEW_TAG;
    private WebActionBar actionBar;
    private WindowVisibilityManager.Controller activityVisibilityController;
    private AddressBarList addressBarList;
    private int anchorsOffsetMeasuredWidth;
    private Runnable animationEndRunnable;
    private int animationInProgress;
    private boolean attachedToWindow;
    private Paint backgroundPaint;
    private FrameLayout bulletinContainer;
    private boolean checkingForLongPress;
    private boolean closeAnimationInProgress;
    private boolean collapsed;
    private FrameLayout containerView;
    private ArrayList createdWebViews;
    private int currentAccount;
    private int currentHeaderHeight;
    private WebPlayerView currentPlayingVideo;
    private View customView;
    private WebChromeClient.CustomViewCallback customViewCallback;
    private TextView deleteView;
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
    private Browser.Progress loadingProgress;
    private Paint navigationBarPaint;
    private final AnimationNotificationsLocker notificationsLocker;
    private int openUrlReqId;
    private final AnimatedColor page0Background;
    private final AnimatedColor page1Background;
    private AnimatorSet pageSwitchAnimation;
    public PageLayout[] pages;
    public final ArrayList pagesStack;
    private Activity parentActivity;
    private BaseFragment parentFragment;
    private CheckForLongPress pendingCheckForLongPress;
    private CheckForTap pendingCheckForTap;
    PinchToZoomHelper pinchToZoomHelper;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    private Rect popupRect;
    private int pressCount;
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
    private Runnable searchRunnable;
    private ImageView searchUpButton;
    public final Sheet sheet;
    private boolean showRestrictedToastOnResume;
    private Drawable slideDotBigDrawable;
    private Drawable slideDotDrawable;
    private Paint statusBarPaint;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelperBottomSheet;
    private long transitionAnimationStartTime;
    private Dialog visibleDialog;
    private WindowManager.LayoutParams windowLayoutParams;
    private WindowView windowView;
    public static HashSet activeSheets = new HashSet();
    private static volatile ArticleViewer Instance = null;
    public static final Property ARTICLE_VIEWER_INNER_TRANSLATION_X = new AnimationProperties.FloatProperty("innerTranslationX") {
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
    private static final Resources resources = new Resources(false);
    private static final WeakHashMap liveDrawingTexts = new WeakHashMap();

    public static class TL_pageBlockListItem extends TL_iv.PageBlock {
        public TL_iv.PageBlock blockItem;
        public boolean checked;
        public int index = Integer.MAX_VALUE;
        public boolean isCheckbox;
        public String num;
        public DrawingText numLayout;
        public TL_pageBlockListParent parent;
        public TL_iv.RichText textItem;
    }

    public static class TL_pageBlockListParent extends TL_iv.PageBlock {
        public ArrayList items = new ArrayList();
        public int lastFontSize;
        public int lastMaxNumCalcWidth;
        public int level;
        public int maxNumWidth;
        public TL_iv.pageBlockList pageBlockList;
    }

    public static class TL_pageBlockOrderedListItem extends TL_iv.PageBlock {
        public TL_iv.PageBlock blockItem;
        public boolean checked;
        public int index = Integer.MAX_VALUE;
        public boolean isCheckbox;
        public String num;
        public DrawingText numLayout;
        public TL_pageBlockOrderedListParent parent;
        public TL_iv.RichText textItem;
    }

    public static class TL_pageBlockOrderedListParent extends TL_iv.PageBlock {
        public ArrayList items = new ArrayList();
        public int lastFontSize;
        public int lastMaxNumCalcWidth;
        public int level;
        public int maxNumWidth;
        public TL_iv.pageBlockOrderedList pageBlockOrderedList;
    }

    public static class TL_pageBlockRelatedArticlesChild extends TL_iv.PageBlock {
        public int num;
        public TL_iv.pageBlockRelatedArticles parent;
    }

    public static boolean lambda$setParentActivity$41(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public Theme.ResourcesProvider getResourcesProvider() {
        return null;
    }

    static int access$1504(ArticleViewer articleViewer) {
        int i = articleViewer.pressCount + 1;
        articleViewer.pressCount = i;
        return i;
    }

    static int access$9208(ArticleViewer articleViewer) {
        int i = articleViewer.lastBlockNum;
        articleViewer.lastBlockNum = i + 1;
        return i;
    }

    public ArticleViewer() {
        this.createdWebViews = new ArrayList();
        this.lastBlockNum = 1;
        this.interpolator = new DecelerateInterpolator(1.5f);
        this.pagesStack = new ArrayList();
        this.headerPaint = new Paint();
        this.statusBarPaint = new Paint();
        this.navigationBarPaint = new Paint();
        this.headerProgressPaint = new Paint();
        this.checkingForLongPress = false;
        this.pendingCheckForLongPress = null;
        this.pressCount = 0;
        this.pendingCheckForTap = null;
        this.notificationsLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.BOTTOM_SHEET_VIEW_TAG = "bottomSheet";
        this.fontCells = new FontCell[2];
        this.lastSearchIndex = -1;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$67();
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.page0Background = new AnimatedColor(runnable, 320L, cubicBezierInterpolator);
        this.page1Background = new AnimatedColor(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$68();
            }
        }, 320L, cubicBezierInterpolator);
        this.isSheet = false;
        this.sheet = null;
    }

    public ArticleViewer(BaseFragment baseFragment) {
        this.createdWebViews = new ArrayList();
        this.lastBlockNum = 1;
        this.interpolator = new DecelerateInterpolator(1.5f);
        this.pagesStack = new ArrayList();
        this.headerPaint = new Paint();
        this.statusBarPaint = new Paint();
        this.navigationBarPaint = new Paint();
        this.headerProgressPaint = new Paint();
        this.checkingForLongPress = false;
        this.pendingCheckForLongPress = null;
        this.pressCount = 0;
        this.pendingCheckForTap = null;
        this.notificationsLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.BOTTOM_SHEET_VIEW_TAG = "bottomSheet";
        this.fontCells = new FontCell[2];
        this.lastSearchIndex = -1;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$67();
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.page0Background = new AnimatedColor(runnable, 320L, cubicBezierInterpolator);
        this.page1Background = new AnimatedColor(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$68();
            }
        }, 320L, cubicBezierInterpolator);
        this.isSheet = true;
        this.sheet = new Sheet(baseFragment);
        setParentActivity(baseFragment.getParentActivity(), baseFragment);
    }

    @Override
    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public boolean isLastArticle() {
        if (this.pagesStack.isEmpty()) {
            return false;
        }
        ArrayList arrayList = this.pagesStack;
        Object obj = arrayList.get(arrayList.size() - 1);
        if (!(obj instanceof TLRPC.WebPage)) {
            return false;
        }
        TL_iv.Page page = ((TLRPC.WebPage) obj).cached_page;
        return page == null || page.local == null;
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

    private static class TL_pageBlockRelatedArticlesShadow extends TL_iv.PageBlock {
        private TL_iv.pageBlockRelatedArticles parent;

        private TL_pageBlockRelatedArticlesShadow() {
        }
    }

    private static class TL_pageBlockDetailsChild extends TL_iv.PageBlock {
        private TL_iv.PageBlock block;
        private TL_iv.PageBlock parent;

        private TL_pageBlockDetailsChild() {
        }
    }

    private static class TL_pageBlockEmbedPostCaption extends TL_iv.pageBlockEmbedPost {
        private TL_iv.pageBlockEmbedPost parent;

        private TL_pageBlockEmbedPostCaption() {
        }
    }

    public static class DrawingText implements TextSelectionHelper.TextLayoutBlock, MultiLayoutTypingAnimator.Block, TableLayout.CellText {
        private CharSequence accessibilityText;
        public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
        private boolean attached;
        private View attachedToView;
        private boolean isDrawing;
        private View latestParentView;
        public LinkPath markPath;
        private final IArticleViewer parent;
        public TL_iv.PageBlock parentBlock;
        public Object parentText;
        public CharSequence prefix;
        public int row;
        public LinkPath searchPath;
        public List spoilers;
        public AtomicReference spoilersPatchedLayout;
        public Stack spoilersPool;
        public StaticLayout textLayout;
        public LinkPath textPath;
        public MultiLayoutTypingAnimator typingAnimator;
        public int x;
        public int y;
        public int searchIndex = -1;
        private int boundLeft = -1;
        private int boundRight = -1;
        private int lastLineBoundRight = -1;
        public int emojiCacheType = 0;

        public DrawingText(IArticleViewer iArticleViewer) {
            this.parent = iArticleViewer;
        }

        @Override
        public void attach(View view) {
            this.attachedToView = view;
            this.attached = true;
            StaticLayout staticLayout = this.textLayout;
            if (staticLayout != null) {
                this.animatedEmojiStack = AnimatedEmojiSpan.update(this.emojiCacheType, view, false, this.animatedEmojiStack, staticLayout);
            }
        }

        @Override
        public void detach(View view) {
            this.attached = false;
            if (view == null) {
                view = this.attachedToView;
            }
            AnimatedEmojiSpan.release(view, this.animatedEmojiStack);
            this.attachedToView = null;
        }

        @Override
        public Layout getLayout() {
            return this.textLayout;
        }

        @Override
        public View getParentView() {
            View view = this.attachedToView;
            return view != null ? view : this.latestParentView;
        }

        @Override
        public void draw(Canvas canvas, View view) {
            float width;
            this.isDrawing = true;
            this.latestParentView = view;
            MultiLayoutTypingAnimator multiLayoutTypingAnimator = this.typingAnimator;
            boolean z = multiLayoutTypingAnimator != null && multiLayoutTypingAnimator.isRunning() && this.typingAnimator.indexOf(this) >= 0;
            if (z && !this.typingAnimator.needDraw(this)) {
                this.isDrawing = false;
                return;
            }
            float lineLeft = 0.0f;
            if (!this.parent.searchResults.isEmpty()) {
                IArticleViewer iArticleViewer = this.parent;
                SearchResult searchResult = (SearchResult) iArticleViewer.searchResults.get(iArticleViewer.currentSearchIndex);
                if (searchResult.block != this.parentBlock || (searchResult.text != this.parentText && (!(searchResult.text instanceof String) || this.parentText != null))) {
                    this.searchIndex = -1;
                    this.searchPath = null;
                } else if (this.searchIndex != searchResult.index) {
                    LinkPath linkPath = new LinkPath(true);
                    this.searchPath = linkPath;
                    linkPath.setAllowReset(false);
                    this.searchPath.setCurrentLayout(this.textLayout, searchResult.index, 0.0f);
                    this.searchPath.setBaselineShift(0);
                    this.textLayout.getSelectionPath(searchResult.index, searchResult.index + this.parent.searchText.length(), this.searchPath);
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
            if (this.parent.links.draw(canvas, this)) {
                view.invalidate();
            }
            IArticleViewer iArticleViewer2 = this.parent;
            if (iArticleViewer2.pressedLinkOwnerLayout == this && iArticleViewer2.pressedLink == null && iArticleViewer2.drawBlockSelection) {
                if (getLineCount() == 1) {
                    width = getLineWidth(0);
                    lineLeft = getLineLeft(0);
                } else {
                    width = getWidth();
                }
                canvas.drawRect((-AndroidUtilities.dp(2.0f)) + lineLeft, 0.0f, lineLeft + width + AndroidUtilities.dp(2.0f), getHeight(), ArticleViewer.urlPaint);
            }
            if (z && this.typingAnimator.isFadeBlock(this)) {
                MultiLayoutTypingAnimator.drawLayoutWithLastLineFade(canvas, this.textLayout, this.typingAnimator.getFadeLineIndex(this), this.typingAnimator.getFadeXPosition(this));
            } else {
                List list = this.spoilers;
                if (list != null && !list.isEmpty()) {
                    SpoilerEffect.renderWithRipple(view, false, this.textLayout.getPaint().getColor(), 0, this.spoilersPatchedLayout, 0, this.textLayout, this.spoilers, canvas, false);
                } else {
                    this.textLayout.draw(canvas);
                }
            }
            this.isDrawing = false;
        }

        public void invalidateParent() {
            View view;
            if (this.isDrawing || (view = this.latestParentView) == null) {
                return;
            }
            view.invalidate();
        }

        @Override
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

        public int getBoundLeft() {
            int i = this.boundLeft;
            if (i != -1) {
                return i;
            }
            this.boundLeft = this.textLayout.getWidth();
            for (int i2 = 0; i2 < this.textLayout.getLineCount(); i2++) {
                this.boundLeft = Math.min(this.boundLeft, (int) this.textLayout.getLineLeft(i2));
            }
            return this.boundLeft;
        }

        public int getBoundRight() {
            int i = this.boundRight;
            if (i != -1) {
                return i;
            }
            this.boundRight = 0;
            for (int i2 = 0; i2 < this.textLayout.getLineCount(); i2++) {
                this.boundRight = Math.max(this.boundRight, (int) this.textLayout.getLineRight(i2));
            }
            return this.boundRight;
        }

        public int getLastLineBoundRight() {
            int i = this.lastLineBoundRight;
            if (i != -1) {
                return i;
            }
            this.lastLineBoundRight = 0;
            if (this.textLayout.getLineCount() > 0) {
                this.lastLineBoundRight = Math.max(this.lastLineBoundRight, (int) this.textLayout.getLineRight(r1.getLineCount() - 1));
            }
            return this.lastLineBoundRight;
        }

        public int getHeight() {
            return this.textLayout.getHeight();
        }

        public int getWidth() {
            return this.textLayout.getWidth();
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
        public void setX(int i) {
            this.x = i;
        }

        @Override
        public void setY(int i) {
            this.y = i;
        }

        @Override
        public void setRow(int i) {
            this.row = i;
        }

        @Override
        public CharSequence getPrefix() {
            return this.prefix;
        }
    }

    public static CharSequence buildAccessibilityText(final IArticleViewer iArticleViewer, final WebpageAdapter webpageAdapter, DrawingText drawingText) {
        if (drawingText == null || drawingText.textLayout == null) {
            return null;
        }
        if (drawingText.accessibilityText != null) {
            return drawingText.accessibilityText;
        }
        CharSequence text = drawingText.textLayout.getText();
        if (!(text instanceof Spannable)) {
            return text;
        }
        Spannable spannable = (Spannable) text;
        TextPaintUrlSpan[] textPaintUrlSpanArr = (TextPaintUrlSpan[]) spannable.getSpans(0, spannable.length(), TextPaintUrlSpan.class);
        CharSequence charSequence = text;
        if (textPaintUrlSpanArr != null) {
            charSequence = text;
            if (textPaintUrlSpanArr.length != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
                for (final TextPaintUrlSpan textPaintUrlSpan : textPaintUrlSpanArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(textPaintUrlSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(textPaintUrlSpan);
                    if (spanStart >= 0 && spanEnd > spanStart) {
                        spannableStringBuilder.setSpan(new ClickableSpan() {
                            @Override
                            public void onClick(View view) {
                                iArticleViewer.handleLinkClick(webpageAdapter, textPaintUrlSpan);
                            }
                        }, spanStart, spanEnd, 33);
                    }
                }
                drawingText.accessibilityText = spannableStringBuilder;
                charSequence = spannableStringBuilder;
            }
        }
        return charSequence;
    }

    @Override
    public void handleLinkClick(WebpageAdapter webpageAdapter, TextPaintUrlSpan textPaintUrlSpan) throws NoSuchFieldException, InterruptedException, SecurityException, UnsupportedEncodingException {
        String url;
        String strDecode;
        if (textPaintUrlSpan == null || (url = textPaintUrlSpan.getUrl()) == null) {
            return;
        }
        BottomSheet bottomSheet = this.linkSheet;
        if (bottomSheet != null) {
            bottomSheet.dismiss();
            this.linkSheet = null;
        }
        int iLastIndexOf = url.lastIndexOf(35);
        boolean z = false;
        if (iLastIndexOf != -1) {
            String lowerCase = !TextUtils.isEmpty(webpageAdapter.currentPage.cached_page.url) ? webpageAdapter.currentPage.cached_page.url.toLowerCase() : webpageAdapter.currentPage.url.toLowerCase();
            try {
                strDecode = URLDecoder.decode(url.substring(iLastIndexOf + 1), "UTF-8");
            } catch (Exception unused) {
                strDecode = "";
            }
            if (iLastIndexOf == 0 || url.toLowerCase().contains(lowerCase)) {
                z = true;
                scrollToAnchor(strDecode, true);
            }
        } else {
            strDecode = null;
        }
        if (z) {
            return;
        }
        DrawingText drawingText = this.pressedLinkOwnerLayout;
        openWebpageUrl(url, strDecode, drawingText != null ? makeProgress(this.pressedLink, drawingText) : null);
    }

    public static CharSequence appendA11yLabel(CharSequence charSequence, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) ", ");
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i));
        return spannableStringBuilder;
    }

    private class TextSizeCell extends FrameLayout {
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
                public boolean needVisuallyDivideSteps() {
                    return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
                }

                @Override
                public void onSeekBarPressed(boolean z) {
                }

                @Override
                public void onSeekBarDrag(boolean z, float f) {
                    int iRound = Math.round(TextSizeCell.this.startFontSize + ((TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize) * f));
                    if (iRound != SharedConfig.ivFontSize) {
                        SharedConfig.ivFontSize = iRound;
                        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                        editorEdit.putInt("iv_font_size", SharedConfig.ivFontSize);
                        editorEdit.commit();
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

    private final class CheckForTap implements Runnable {
        private CheckForTap() {
        }

        @Override
        public void run() {
            if (ArticleViewer.this.pendingCheckForLongPress == null) {
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.pendingCheckForLongPress = articleViewer.new CheckForLongPress();
            }
            ArticleViewer.this.pendingCheckForLongPress.currentPressCount = ArticleViewer.access$1504(ArticleViewer.this);
            if (ArticleViewer.this.windowView != null) {
                ArticleViewer.this.windowView.postDelayed(ArticleViewer.this.pendingCheckForLongPress, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
            }
        }
    }

    private class WindowView extends FrameLayout {
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
        private int startMovingHeaderHeight;
        private boolean startedTracking;
        private int startedTrackingPointerId;
        private int startedTrackingX;
        private int startedTrackingY;
        private VelocityTracker tracker;

        public WindowView(Context context) {
            super(context);
            this.blackPaint = new Paint();
            this.alpha = 1.0f;
        }

        @Override
        public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
            DisplayCutout displayCutout;
            List boundingRects;
            ArticleViewer articleViewer = ArticleViewer.this;
            if (articleViewer.sheet != null) {
                return super.dispatchApplyWindowInsets(windowInsets);
            }
            WindowInsets windowInsets2 = (WindowInsets) articleViewer.lastInsets;
            ArticleViewer.this.lastInsets = windowInsets;
            if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && ArticleViewer.this.windowView != null) {
                ArticleViewer.this.windowView.requestLayout();
            }
            if (Build.VERSION.SDK_INT >= 28 && ArticleViewer.this.parentActivity != null && (displayCutout = ArticleViewer.this.parentActivity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
                ArticleViewer.this.hasCutout = ((Rect) boundingRects.get(0)).height() != 0;
            }
            return super.dispatchApplyWindowInsets(windowInsets);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (ArticleViewer.this.lastInsets != null) {
                setMeasuredDimension(size, size2);
                WindowInsets windowInsets = (WindowInsets) ArticleViewer.this.lastInsets;
                if (AndroidUtilities.incorrectDisplaySizeFix) {
                    int i3 = AndroidUtilities.displaySize.y;
                    if (size2 > i3) {
                        size2 = i3;
                    }
                    size2 += AndroidUtilities.statusBarHeight;
                }
                int systemWindowInsetBottom = size2 - windowInsets.getSystemWindowInsetBottom();
                size -= windowInsets.getSystemWindowInsetRight() + windowInsets.getSystemWindowInsetLeft();
                if (windowInsets.getSystemWindowInsetRight() != 0) {
                    this.bWidth = windowInsets.getSystemWindowInsetRight();
                    this.bHeight = systemWindowInsetBottom;
                } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                    this.bWidth = windowInsets.getSystemWindowInsetLeft();
                    this.bHeight = systemWindowInsetBottom;
                } else {
                    this.bWidth = size;
                    this.bHeight = windowInsets.getStableInsetBottom();
                }
                size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
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
            ArrayList arrayList;
            if (ArticleViewer.this.pinchToZoomHelper.isInOverlayMode()) {
                motionEvent.offsetLocation(-ArticleViewer.this.containerView.getX(), -ArticleViewer.this.containerView.getY());
                return ArticleViewer.this.pinchToZoomHelper.onTouchEvent(motionEvent);
            }
            TextSelectionHelper.TextSelectionOverlay overlayView = ArticleViewer.this.textSelectionHelper.getOverlayView(getContext());
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.offsetLocation(-ArticleViewer.this.containerView.getX(), -ArticleViewer.this.containerView.getY());
            if (ArticleViewer.this.textSelectionHelper.isInSelectionMode() && ArticleViewer.this.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(motionEventObtain)) {
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
                if (ArticleViewer.this.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(motionEventObtain)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int systemWindowInsetTop;
            ArticleViewer articleViewer;
            int i5 = i3 - i;
            int i6 = 0;
            if (ArticleViewer.this.anchorsOffsetMeasuredWidth != i5) {
                int i7 = 0;
                while (true) {
                    articleViewer = ArticleViewer.this;
                    PageLayout[] pageLayoutArr = articleViewer.pages;
                    if (i7 >= pageLayoutArr.length) {
                        break;
                    }
                    Iterator it = pageLayoutArr[i7].adapter.anchorsOffset.entrySet().iterator();
                    while (it.hasNext()) {
                        ((Map.Entry) it.next()).setValue(-1);
                    }
                    i7++;
                }
                articleViewer.anchorsOffsetMeasuredWidth = i5;
            }
            if (ArticleViewer.this.lastInsets != null) {
                WindowInsets windowInsets = (WindowInsets) ArticleViewer.this.lastInsets;
                int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                if (windowInsets.getSystemWindowInsetRight() != 0) {
                    this.bX = i5 - this.bWidth;
                    this.bY = 0;
                } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                    this.bX = 0;
                    this.bY = 0;
                } else {
                    this.bX = 0;
                    this.bY = (i4 - i2) - this.bHeight;
                }
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
                i6 = systemWindowInsetLeft;
            } else {
                systemWindowInsetTop = 0;
            }
            ArticleViewer.this.containerView.layout(i6, systemWindowInsetTop, ArticleViewer.this.containerView.getMeasuredWidth() + i6, ArticleViewer.this.containerView.getMeasuredHeight() + systemWindowInsetTop);
            ArticleViewer.this.fullscreenVideoContainer.layout(i6, systemWindowInsetTop, ArticleViewer.this.fullscreenVideoContainer.getMeasuredWidth() + i6, ArticleViewer.this.fullscreenVideoContainer.getMeasuredHeight() + systemWindowInsetTop);
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
        public void requestDisallowInterceptTouchEvent(boolean z) throws PackageManager.NameNotFoundException {
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

        public void setInnerTranslationX(float f) {
            this.innerTranslationX = f;
            if (ArticleViewer.this.activityVisibilityController != null) {
                ArticleViewer.this.activityVisibilityController.setHidden(ArticleViewer.this.isVisible && this.alpha == 1.0f && this.innerTranslationX == 0.0f);
            }
            invalidate();
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            int measuredWidth = getMeasuredWidth();
            int i = (int) this.innerTranslationX;
            int iSave = canvas.save();
            canvas.clipRect(i, 0, measuredWidth, getHeight());
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restoreToCount(iSave);
            if (i != 0 && view == ArticleViewer.this.containerView) {
                float f = measuredWidth - i;
                float fMin = Math.min(0.8f, f / measuredWidth);
                if (fMin < 0.0f) {
                    fMin = 0.0f;
                }
                ArticleViewer.this.scrimPaint.setColor(((int) (fMin * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i, getHeight(), ArticleViewer.this.scrimPaint);
                float fMax = Math.max(0.0f, Math.min(f / AndroidUtilities.dp(20.0f), 1.0f));
                ArticleViewer.this.layerShadowDrawable.setBounds(i - ArticleViewer.this.layerShadowDrawable.getIntrinsicWidth(), view.getTop(), i, view.getBottom());
                ArticleViewer.this.layerShadowDrawable.setAlpha((int) (fMax * 255.0f));
                ArticleViewer.this.layerShadowDrawable.draw(canvas);
            }
            return zDrawChild;
        }

        public float getInnerTranslationX() {
            return this.innerTranslationX;
        }

        private void prepareForMoving(MotionEvent motionEvent) throws PackageManager.NameNotFoundException {
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
                    int iIndexOfChild = ArticleViewer.this.containerView.indexOfChild(ArticleViewer.this.pages[0]);
                    ArticleViewer.this.containerView.removeView(ArticleViewer.this.pages[1]);
                    ArticleViewer.this.containerView.addView(ArticleViewer.this.pages[1], iIndexOfChild);
                }
            } else {
                this.movingPage = false;
            }
            ArticleViewer.this.cancelCheckLongPress();
        }

        public boolean handleTouchEvent(MotionEvent motionEvent) throws PackageManager.NameNotFoundException {
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
                int iMax = Math.max(0, (int) (motionEvent.getX() - this.startedTrackingX));
                int iAbs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
                this.tracker.addMovement(motionEvent);
                PageLayout pageLayout2 = ArticleViewer.this.pages[0];
                this.lastWebviewAllowedScroll = pageLayout2 == null || !pageLayout2.isWeb() || (ArticleViewer.this.pages[0].swipeContainer.allowingScroll(true) && !ArticleViewer.this.pages[0].swipeContainer.isScrolling);
                Sheet sheet2 = ArticleViewer.this.sheet;
                if ((sheet2 == null || !sheet2.nestedVerticalScroll) && this.maybeStartTracking && !this.startedTracking && iMax >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(iMax) / 3 > iAbs && this.lastWebviewAllowedScroll) {
                    prepareForMoving(motionEvent);
                } else if (this.startedTracking) {
                    ArticleViewer articleViewer = ArticleViewer.this;
                    articleViewer.pressedLinkOwnerLayout = null;
                    articleViewer.pressedLinkOwnerView = null;
                    if (this.movingPage && (pageLayout = articleViewer.pages[0]) != null) {
                        pageLayout.setTranslationX(iMax);
                    } else {
                        Sheet sheet3 = articleViewer.sheet;
                        if (sheet3 == null) {
                            float f = iMax;
                            articleViewer.containerView.setTranslationX(f);
                            setInnerTranslationX(f);
                        } else {
                            sheet3.setBackProgress(iMax / getWidth());
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
                                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer2.containerView, (Property<FrameLayout, Float>) View.TRANSLATION_X, frameLayout.getMeasuredWidth()), ObjectAnimator.ofFloat(this, (Property<WindowView, Float>) ArticleViewer.ARTICLE_VIEWER_INNER_TRANSLATION_X, frameLayout.getMeasuredWidth()));
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
                            animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer3.containerView, (Property<FrameLayout, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this, (Property<WindowView, Float>) ArticleViewer.ARTICLE_VIEWER_INNER_TRANSLATION_X, 0.0f));
                        }
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / frameLayout.getMeasuredWidth()) * x), 250));
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) throws PackageManager.NameNotFoundException {
                            if (WindowView.this.movingPage) {
                                Object objRemove = null;
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
                                    ArrayList arrayList = ArticleViewer.this.pagesStack;
                                    objRemove = arrayList.remove(arrayList.size() - 1);
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
                                if (objRemove instanceof CachedWeb) {
                                    ((CachedWeb) objRemove).destroy();
                                }
                                if (objRemove instanceof TLRPC.WebPage) {
                                    WebInstantView.recycle((TLRPC.WebPage) objRemove);
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
            if (ArticleViewer.this.lastInsets != null || this.bWidth == 0 || this.bHeight == 0) {
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
            if (ArticleViewer.this.sheet == null) {
                int measuredWidth = getMeasuredWidth();
                float f = measuredWidth;
                float measuredHeight = getMeasuredHeight();
                canvas.drawRect(this.innerTranslationX, 0.0f, f, measuredHeight, ArticleViewer.this.backgroundPaint);
                if (ArticleViewer.this.lastInsets != null) {
                    WindowInsets windowInsets = (WindowInsets) ArticleViewer.this.lastInsets;
                    canvas.drawRect(this.innerTranslationX, 0.0f, f, windowInsets.getSystemWindowInsetTop(), ArticleViewer.this.statusBarPaint);
                    if (ArticleViewer.this.hasCutout) {
                        int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                        if (systemWindowInsetLeft != 0) {
                            canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight, ArticleViewer.this.statusBarPaint);
                        }
                        if (windowInsets.getSystemWindowInsetRight() != 0) {
                            canvas.drawRect(measuredWidth - r3, 0.0f, f, measuredHeight, ArticleViewer.this.statusBarPaint);
                        }
                    }
                    canvas.drawRect(0.0f, r1 - windowInsets.getStableInsetBottom(), f, measuredHeight, ArticleViewer.this.navigationBarPaint);
                }
            }
        }

        @Override
        public void setAlpha(float f) {
            int i = (int) (255.0f * f);
            ArticleViewer.this.backgroundPaint.setAlpha(i);
            ArticleViewer.this.statusBarPaint.setAlpha(i);
            this.alpha = f;
            if (ArticleViewer.this.activityVisibilityController != null) {
                ArticleViewer.this.activityVisibilityController.setHidden(ArticleViewer.this.isVisible && this.alpha == 1.0f && this.innerTranslationX == 0.0f);
            }
            invalidate();
        }

        @Override
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

    class CheckForLongPress implements Runnable {
        public int currentPressCount;

        CheckForLongPress() {
        }

        @Override
        public void run() throws UnsupportedEncodingException {
            ArticleViewer articleViewer;
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
            if (!ArticleViewer.this.checkingForLongPress || ArticleViewer.this.windowView == null) {
                return;
            }
            ArticleViewer.this.checkingForLongPress = false;
            ArticleViewer articleViewer2 = ArticleViewer.this;
            if (articleViewer2.pressedLink != null) {
                try {
                    articleViewer2.windowView.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                ArticleViewer articleViewer3 = ArticleViewer.this;
                articleViewer3.showCopyPopup(((TextPaintUrlSpan) articleViewer3.pressedLink.getSpan()).getUrl());
                ArticleViewer articleViewer4 = ArticleViewer.this;
                articleViewer4.pressedLink = null;
                articleViewer4.pressedLinkOwnerLayout = null;
                View view = articleViewer4.pressedLinkOwnerView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            View view2 = articleViewer2.pressedLinkOwnerView;
            if (view2 != null && articleViewer2.textSelectionHelper.isSelectable(view2)) {
                if (ArticleViewer.this.pressedLinkOwnerView.getTag() != null && ArticleViewer.this.pressedLinkOwnerView.getTag() == "bottomSheet" && (articleTextSelectionHelper = (articleViewer = ArticleViewer.this).textSelectionHelperBottomSheet) != null) {
                    articleTextSelectionHelper.trySelect(articleViewer.pressedLinkOwnerView);
                } else {
                    ArticleViewer articleViewer5 = ArticleViewer.this;
                    articleViewer5.textSelectionHelper.trySelect(articleViewer5.pressedLinkOwnerView);
                }
                if (ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                    try {
                        ArticleViewer.this.windowView.performHapticFeedback(0, 2);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            }
            ArticleViewer articleViewer6 = ArticleViewer.this;
            if (articleViewer6.pressedLinkOwnerLayout == null || articleViewer6.pressedLinkOwnerView == null) {
                return;
            }
            try {
                articleViewer6.windowView.performHapticFeedback(0, 2);
            } catch (Exception unused3) {
            }
            int[] iArr = new int[2];
            ArticleViewer.this.pressedLinkOwnerView.getLocationInWindow(iArr);
            int iDp = (iArr[1] + ArticleViewer.this.pressedLayoutY) - AndroidUtilities.dp(54.0f);
            if (iDp < 0) {
                iDp = 0;
            }
            ArticleViewer.this.pressedLinkOwnerView.invalidate();
            ArticleViewer articleViewer7 = ArticleViewer.this;
            articleViewer7.drawBlockSelection = true;
            articleViewer7.showPopup(articleViewer7.pressedLinkOwnerView, 48, 0, iDp);
            ArticleViewer.this.pages[0].listView.setLayoutFrozen(true);
            ArticleViewer.this.pages[0].listView.setLayoutFrozen(false);
        }
    }

    public static void createPaint(IArticleViewer iArticleViewer, boolean z) {
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
        int themedColor = iArticleViewer.getThemedColor(Theme.key_windowBackgroundWhite);
        webpageSearchPaint.setColor((((((float) Color.red(themedColor)) * 0.2126f) + (((float) Color.green(themedColor)) * 0.7152f)) + (((float) Color.blue(themedColor)) * 0.0722f)) / 255.0f <= 0.705f ? -3041234 : -6551);
        Paint paint3 = webpageUrlPaint;
        int i = Theme.key_windowBackgroundWhiteLinkSelection;
        paint3.setColor(iArticleViewer.getThemedColor(i) & 872415231);
        webpageUrlPaint.setPathEffect(LinkPath.getRoundedEffect());
        urlPaint.setColor(iArticleViewer.getThemedColor(i) & 872415231);
        urlPaint.setPathEffect(LinkPath.getRoundedEffect());
        Paint paint4 = tableHalfLinePaint;
        int i2 = Theme.key_windowBackgroundWhiteInputField;
        paint4.setColor(iArticleViewer.getThemedColor(i2));
        tableLinePaint.setColor(iArticleViewer.getThemedColor(i2));
        photoBackgroundPaint.setColor(251658240);
        dividerPaint.setColor(iArticleViewer.getThemedColor(Theme.key_divider));
        webpageMarkPaint.setColor(iArticleViewer.getThemedColor(i) & 872415231);
        webpageMarkPaint.setPathEffect(LinkPath.getRoundedEffect());
        int themedColor2 = iArticleViewer.getThemedColor(Theme.key_switchTrack);
        int iRed = Color.red(themedColor2);
        int iGreen = Color.green(themedColor2);
        int iBlue = Color.blue(themedColor2);
        tableStripPaint.setColor(Color.argb(20, iRed, iGreen, iBlue));
        tableHeaderPaint.setColor(Color.argb(34, iRed, iGreen, iBlue));
        int themedColor3 = iArticleViewer.getThemedColor(i);
        preformattedBackgroundPaint.setColor(Color.argb(20, Color.red(themedColor3), Color.green(themedColor3), Color.blue(themedColor3)));
        quoteLinePaint.setColor(iArticleViewer.getThemedColor(Theme.key_chat_inReplyLine));
    }

    public void showCopyPopup(final String str) throws UnsupportedEncodingException {
        String strDecode;
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
            strDecode = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            FileLog.e(e);
            strDecode = str;
        }
        builder.setTitle(strDecode);
        builder.setTitleMultipleLines(true);
        builder.setItems(new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)}, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) throws NoSuchFieldException, InterruptedException, SecurityException, UnsupportedEncodingException {
                this.f$0.lambda$showCopyPopup$0(str, dialogInterface, i);
            }
        });
        builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.lambda$showCopyPopup$1(dialogInterface);
            }
        });
        showDialog(builder.create());
    }

    public void lambda$showCopyPopup$0(String str, DialogInterface dialogInterface, int i) throws NoSuchFieldException, InterruptedException, SecurityException, UnsupportedEncodingException {
        String strDecode;
        if (this.parentActivity != null) {
            if (this.pages[0].adapter.currentPage == null) {
                return;
            }
            if (i != 0) {
                if (i != 1 || str == null) {
                    return;
                }
                if (str.startsWith("mailto:")) {
                    str = str.substring(7);
                } else if (str.startsWith("tel:")) {
                    str = str.substring(4);
                }
                AndroidUtilities.addToClipboard(str);
                return;
            }
            int iLastIndexOf = str.lastIndexOf(35);
            if (iLastIndexOf != -1) {
                String lowerCase = !TextUtils.isEmpty(this.pages[0].adapter.currentPage.cached_page.url) ? this.pages[0].adapter.currentPage.cached_page.url.toLowerCase() : this.pages[0].adapter.currentPage.url.toLowerCase();
                try {
                    strDecode = URLDecoder.decode(str.substring(iLastIndexOf + 1), "UTF-8");
                } catch (Exception unused) {
                    strDecode = "";
                }
                if (str.toLowerCase().contains(lowerCase)) {
                    if (TextUtils.isEmpty(strDecode)) {
                        LinearLayoutManager linearLayoutManager = this.pages[0].layoutManager;
                        Sheet sheet = this.sheet;
                        linearLayoutManager.scrollToPositionWithOffset((sheet == null || !sheet.halfSize()) ? 0 : 1, this.sheet != null ? AndroidUtilities.dp(32.0f) : 0);
                        checkScrollAnimated();
                        return;
                    }
                    scrollToAnchor(strDecode, true);
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
                    return this.f$0.lambda$showPopup$2(view2, motionEvent);
                }
            });
            this.popupLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
                @Override
                public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                    this.f$0.lambda$showPopup$3(keyEvent);
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
            this.deleteView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
            this.deleteView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$showPopup$4(view2);
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
                    this.f$0.lambda$showPopup$5();
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
                Toast.makeText(this.parentActivity, LocaleController.getString(R.string.TextCopied), 0).show();
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

    public TL_iv.RichText getBlockCaption(TL_iv.PageBlock pageBlock, int i) {
        if (i == 2) {
            TL_iv.RichText blockCaption = getBlockCaption(pageBlock, 0);
            if (blockCaption instanceof TL_iv.textEmpty) {
                blockCaption = null;
            }
            TL_iv.RichText blockCaption2 = getBlockCaption(pageBlock, 1);
            if (blockCaption2 instanceof TL_iv.textEmpty) {
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
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = " ";
            TL_iv.textConcat textconcat = new TL_iv.textConcat();
            textconcat.texts.add(blockCaption);
            textconcat.texts.add(textplain);
            textconcat.texts.add(blockCaption2);
            return textconcat;
        }
        if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
            TL_iv.pageBlockEmbedPost pageblockembedpost = (TL_iv.pageBlockEmbedPost) pageBlock;
            if (i == 0) {
                return pageblockembedpost.caption.text;
            }
            if (i == 1) {
                return pageblockembedpost.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            if (i == 0) {
                return pageblockslideshow.caption.text;
            }
            if (i == 1) {
                return pageblockslideshow.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            if (i == 0) {
                return pageblockphoto.caption.text;
            }
            if (i == 1) {
                return pageblockphoto.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            if (i == 0) {
                return pageblockcollage.caption.text;
            }
            if (i == 1) {
                return pageblockcollage.caption.credit;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            if (i == 0) {
                return pageblockembed.caption.text;
            }
            if (i == 1) {
                return pageblockembed.caption.credit;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (i == 0) {
                    return pageblockvideo.caption.text;
                }
                if (i == 1) {
                    return pageblockvideo.caption.credit;
                }
            } else {
                if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    return ((TL_iv.pageBlockPullquote) pageBlock).caption;
                }
                if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                    if (i == 0) {
                        return pageblockaudio.caption.text;
                    }
                    if (i == 1) {
                        return pageblockaudio.caption.credit;
                    }
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockCover) {
                        return getBlockCaption(((TL_iv.pageBlockCover) pageBlock).cover, i);
                    }
                    if (pageBlock instanceof TL_iv.pageBlockMap) {
                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                        if (i == 0) {
                            return pageblockmap.caption.text;
                        }
                        if (i == 1) {
                            return pageblockmap.caption.credit;
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

    public static boolean isListItemBlock(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_pageBlockListItem) || (pageBlock instanceof TL_pageBlockOrderedListItem);
    }

    public static boolean isHeadingBlock(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public TL_iv.PageBlock getLastNonListPageBlock(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_pageBlockListItem) {
            TL_iv.PageBlock pageBlock2 = ((TL_pageBlockListItem) pageBlock).blockItem;
            return pageBlock2 != null ? getLastNonListPageBlock(pageBlock2) : pageBlock2;
        }
        if (!(pageBlock instanceof TL_pageBlockOrderedListItem)) {
            return pageBlock;
        }
        TL_iv.PageBlock pageBlock3 = ((TL_pageBlockOrderedListItem) pageBlock).blockItem;
        return pageBlock3 != null ? getLastNonListPageBlock(pageBlock3) : pageBlock3;
    }

    private boolean openAllParentBlocks(org.telegram.ui.ArticleViewer.TL_pageBlockDetailsChild r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.openAllParentBlocks(org.telegram.ui.ArticleViewer$TL_pageBlockDetailsChild):boolean");
    }

    public TL_iv.PageBlock fixListBlock(TL_iv.PageBlock pageBlock, TL_iv.PageBlock pageBlock2) {
        if (pageBlock instanceof TL_pageBlockListItem) {
            ((TL_pageBlockListItem) pageBlock).blockItem = pageBlock2;
            return pageBlock;
        }
        if (!(pageBlock instanceof TL_pageBlockOrderedListItem)) {
            return pageBlock2;
        }
        ((TL_pageBlockOrderedListItem) pageBlock).blockItem = pageBlock2;
        return pageBlock;
    }

    public TL_iv.PageBlock wrapInTableBlock(TL_iv.PageBlock pageBlock, TL_iv.PageBlock pageBlock2) {
        if (pageBlock instanceof TL_pageBlockListItem) {
            TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) pageBlock;
            TL_pageBlockListItem tL_pageBlockListItem2 = new TL_pageBlockListItem();
            tL_pageBlockListItem2.isCheckbox = tL_pageBlockListItem.isCheckbox;
            tL_pageBlockListItem2.checked = tL_pageBlockListItem.checked;
            tL_pageBlockListItem2.parent = tL_pageBlockListItem.parent;
            tL_pageBlockListItem2.blockItem = wrapInTableBlock(tL_pageBlockListItem.blockItem, pageBlock2);
            return tL_pageBlockListItem2;
        }
        if (!(pageBlock instanceof TL_pageBlockOrderedListItem)) {
            return pageBlock2;
        }
        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) pageBlock;
        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = new TL_pageBlockOrderedListItem();
        tL_pageBlockOrderedListItem2.isCheckbox = tL_pageBlockOrderedListItem.isCheckbox;
        tL_pageBlockOrderedListItem2.checked = tL_pageBlockOrderedListItem.checked;
        tL_pageBlockOrderedListItem2.parent = tL_pageBlockOrderedListItem.parent;
        tL_pageBlockOrderedListItem2.blockItem = wrapInTableBlock(tL_pageBlockOrderedListItem.blockItem, pageBlock2);
        return tL_pageBlockOrderedListItem2;
    }

    public void updateInterfaceForCurrentPage(Object obj, boolean z, int i) throws PackageManager.NameNotFoundException {
        int iDp;
        if (obj != null) {
            if ((!(obj instanceof TLRPC.WebPage) || ((TLRPC.WebPage) obj).cached_page == null) && !(obj instanceof CachedWeb)) {
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
                int iIndexOfChild = this.containerView.indexOfChild(this.pages[0]);
                int iIndexOfChild2 = this.containerView.indexOfChild(this.pages[1]);
                if (i == 1) {
                    if (iIndexOfChild < iIndexOfChild2) {
                        this.containerView.removeView(this.pages[0]);
                        this.containerView.addView(this.pages[0], iIndexOfChild2);
                    }
                } else if (iIndexOfChild2 < iIndexOfChild) {
                    this.containerView.removeView(this.pages[0]);
                    this.containerView.addView(this.pages[0], iIndexOfChild);
                }
                this.pageSwitchAnimation = new AnimatorSet();
                this.pages[0].setVisibility(0);
                final int i2 = i == 1 ? 0 : 1;
                this.pages[i2].setBackgroundColor(this.sheet == null ? 0 : this.backgroundPaint.getColor());
                this.pages[i2].setLayerType(2, null);
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
                    public void onAnimationEnd(Animator animator) throws PackageManager.NameNotFoundException {
                        ArticleViewer.this.pages[1].cleanup();
                        ArticleViewer.this.pages[1].setVisibility(8);
                        ArticleViewer articleViewer = ArticleViewer.this;
                        articleViewer.textSelectionHelper.setParentView(articleViewer.pages[0].listView);
                        ArticleViewer articleViewer2 = ArticleViewer.this;
                        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer2.textSelectionHelper;
                        PageLayout[] pageLayoutArr2 = articleViewer2.pages;
                        articleTextSelectionHelper.layoutManager = pageLayoutArr2[0].layoutManager;
                        pageLayoutArr2[i2].setBackgroundDrawable(null);
                        ArticleViewer.this.pages[i2].setLayerType(0, null);
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
                WebActionBar webActionBar4 = this.actionBar;
                PageLayout pageLayout5 = this.pages[0];
                webActionBar4.setIsLocal(pageLayout5 != null && pageLayout5.isLocal());
                AnimatorSet animatorSet = this.pageSwitchAnimation;
                Objects.requireNonNull(animatorSet);
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda23(animatorSet));
            }
            if (!z) {
                this.textSelectionHelper.clear(true);
            }
            WebpageAdapter webpageAdapter = this.pages[z ? 1 : 0].adapter;
            if (z) {
                ArrayList arrayList = this.pagesStack;
                obj = arrayList.get(arrayList.size() - 2);
            }
            this.pages[z ? 1 : 0].cleanup();
            if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                this.pages[z ? 1 : 0].setWeb(null);
                this.pages[z ? 1 : 0].setType(0);
                webpageAdapter.isRtl = webPage.cached_page.rtl;
                webpageAdapter.currentPage = webPage;
                int size = webPage.cached_page.blocks.size();
                int i3 = 0;
                while (i3 < size) {
                    TL_iv.PageBlock pageBlock = webPage.cached_page.blocks.get(i3);
                    if (i3 == 0) {
                        pageBlock.first = true;
                        if (pageBlock instanceof TL_iv.pageBlockCover) {
                            TL_iv.pageBlockCover pageblockcover = (TL_iv.pageBlockCover) pageBlock;
                            TL_iv.RichText blockCaption = getBlockCaption(pageblockcover, 0);
                            TL_iv.RichText blockCaption2 = getBlockCaption(pageblockcover, 1);
                            if (((blockCaption != null && !(blockCaption instanceof TL_iv.textEmpty)) || (blockCaption2 != null && !(blockCaption2 instanceof TL_iv.textEmpty))) && size > 1) {
                                TL_iv.PageBlock pageBlock2 = webPage.cached_page.blocks.get(1);
                                if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
                                    webpageAdapter.channelBlock = (TL_iv.pageBlockChannel) pageBlock2;
                                }
                            }
                        }
                    } else {
                        if (i3 != 1 || webpageAdapter.channelBlock == null) {
                        }
                        i3++;
                    }
                    webpageAdapter.addBlock(webpageAdapter, pageBlock, 0, 0, i3 == size + (-1) ? i3 : 0);
                    i3++;
                }
                webpageAdapter.notifyDataSetChanged();
                if (this.pagesStack.size() == 1 || i == -1) {
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                    String str = "article" + webPage.id;
                    int i4 = sharedPreferences.getInt(str, -1);
                    boolean z2 = sharedPreferences.getBoolean(str + "r", true);
                    Point point = AndroidUtilities.displaySize;
                    if (z2 == (point.x <= point.y ? 0 : 1)) {
                        iDp = sharedPreferences.getInt(str + "o", 0) - this.pages[z ? 1 : 0].listView.getPaddingTop();
                    } else {
                        iDp = AndroidUtilities.dp(10.0f);
                    }
                    if (i4 != -1) {
                        this.pages[z ? 1 : 0].layoutManager.scrollToPositionWithOffset(i4, iDp);
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

    private boolean addPageToStack(TLRPC.WebPage webPage, String str, int i) throws PackageManager.NameNotFoundException {
        saveCurrentPagePosition();
        this.pagesStack.add(webPage);
        this.actionBar.showSearch(false, true);
        updateInterfaceForCurrentPage(webPage, false, i);
        return scrollToAnchor(str, false);
    }

    private boolean addPageToStack(String str, int i) throws PackageManager.NameNotFoundException {
        saveCurrentPagePosition();
        CachedWeb cachedWeb = new CachedWeb(str);
        this.pagesStack.add(cachedWeb);
        this.actionBar.showSearch(false, true);
        updateInterfaceForCurrentPage(cachedWeb, false, i);
        return false;
    }

    public void goBack() throws PackageManager.NameNotFoundException {
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
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayout, Float>) View.TRANSLATION_X, frameLayout.getMeasuredWidth()), ObjectAnimator.ofFloat(this.windowView, (Property<WindowView, Float>) ARTICLE_VIEWER_INNER_TRANSLATION_X, frameLayout.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / frameLayout.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) throws PackageManager.NameNotFoundException {
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
                        ArrayList arrayList = ArticleViewer.this.pagesStack;
                        Object objRemove = arrayList.remove(arrayList.size() - 1);
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
                        if (objRemove instanceof CachedWeb) {
                            ((CachedWeb) objRemove).destroy();
                        }
                        if (objRemove instanceof TLRPC.WebPage) {
                            WebInstantView.recycle((TLRPC.WebPage) objRemove);
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
        this.windowView.movingPage = true;
        this.windowView.startMovingHeaderHeight = this.currentHeaderHeight;
        this.pages[1].setVisibility(0);
        this.pages[1].setAlpha(1.0f);
        this.pages[1].setTranslationX(0.0f);
        this.pages[0].setBackgroundColor(this.sheet == null ? 0 : this.backgroundPaint.getColor());
        ArrayList arrayList = this.pagesStack;
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
            public void onAnimationEnd(Animator animator) throws PackageManager.NameNotFoundException {
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
                    ArrayList arrayList2 = ArticleViewer.this.pagesStack;
                    Object objRemove = arrayList2.remove(arrayList2.size() - 1);
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
                    if (objRemove instanceof CachedWeb) {
                        ((CachedWeb) objRemove).destroy();
                    }
                    if (objRemove instanceof TLRPC.WebPage) {
                        WebInstantView.recycle((TLRPC.WebPage) objRemove);
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
        webActionBar3.setIsTonsite(pageLayout4 != null && pageLayout4.isTonsite());
        WebActionBar webActionBar4 = this.actionBar;
        PageLayout pageLayout5 = this.pages[0];
        if (pageLayout5 != null && pageLayout5.isLocal()) {
            z = true;
        }
        webActionBar4.setIsLocal(z);
        this.closeAnimationInProgress = true;
    }

    public void lambda$setParentActivity$29(final int i) throws PackageManager.NameNotFoundException {
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
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayout, Float>) View.TRANSLATION_X, frameLayout.getMeasuredWidth()), ObjectAnimator.ofFloat(this.windowView, (Property<WindowView, Float>) ARTICLE_VIEWER_INNER_TRANSLATION_X, frameLayout.getMeasuredWidth()));
            }
            animatorSet.setDuration(Math.max((int) ((420.0f / frameLayout.getMeasuredWidth()) * measuredWidth), 250));
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) throws PackageManager.NameNotFoundException {
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
                        ArrayList arrayList = ArticleViewer.this.pagesStack;
                        Object objRemove = arrayList.remove(arrayList.size() - 1);
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
                        if (objRemove instanceof CachedWeb) {
                            ((CachedWeb) objRemove).destroy();
                        }
                        if (objRemove instanceof TLRPC.WebPage) {
                            WebInstantView.recycle((TLRPC.WebPage) objRemove);
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
            public void onAnimationEnd(Animator animator) throws PackageManager.NameNotFoundException {
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
                        if (next instanceof TLRPC.WebPage) {
                            WebInstantView.recycle((TLRPC.WebPage) next);
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
        webActionBar3.setIsTonsite(pageLayout4 != null && pageLayout4.isTonsite());
        WebActionBar webActionBar4 = this.actionBar;
        PageLayout pageLayout5 = this.pages[0];
        if (pageLayout5 != null && pageLayout5.isLocal()) {
            z = true;
        }
        webActionBar4.setIsLocal(z);
        this.closeAnimationInProgress = true;
    }

    public boolean scrollToAnchor(String str, boolean z) throws NoSuchFieldException, InterruptedException, SecurityException {
        Integer num = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        Integer numValueOf = (Integer) this.pages[0].adapter.anchors.get(lowerCase);
        if (numValueOf != null) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) this.pages[0].adapter.anchorsParent.get(lowerCase);
            if (textanchor != null) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = WebInstantView.filterRecursiveAnchorLinks(textanchor.text, !TextUtils.isEmpty(this.pages[0].adapter.currentPage.cached_page.url) ? this.pages[0].adapter.currentPage.cached_page.url.toLowerCase() : this.pages[0].adapter.currentPage.url.toLowerCase(), lowerCase);
                int typeForBlock = this.pages[0].adapter.getTypeForBlock(pageblockparagraph);
                RecyclerView.ViewHolder viewHolderOnCreateViewHolder = this.pages[0].adapter.onCreateViewHolder(null, typeForBlock);
                this.pages[0].adapter.bindBlockToHolder(typeForBlock, viewHolderOnCreateViewHolder, pageblockparagraph, 0, 0, false);
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
                        BottomSheet bottomSheet = ArticleViewer.this.linkSheet;
                        if (bottomSheet != null) {
                            bottomSheet.setDisableScroll(z2);
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
                textView.setText(LocaleController.getString(R.string.InstantViewReference));
                textView.setGravity((this.pages[0].adapter.isRtl ? 5 : 3) | 16);
                textView.setTextColor(getTextColor());
                textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f) + 1));
                viewHolderOnCreateViewHolder.itemView.setTag("bottomSheet");
                linearLayout.addView(viewHolderOnCreateViewHolder.itemView, LayoutHelper.createLinear(-1, -2, 0.0f, 7.0f, 0.0f, 0.0f));
                TextSelectionHelper.TextSelectionOverlay overlayView = this.textSelectionHelperBottomSheet.getOverlayView(this.parentActivity);
                FrameLayout frameLayout = new FrameLayout(this.parentActivity) {
                    @Override
                    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                        TextSelectionHelper.TextSelectionOverlay overlayView2 = ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext());
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                        if (ArticleViewer.this.textSelectionHelperBottomSheet.isInSelectionMode() && ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext()).onTouchEvent(motionEventObtain)) {
                            return true;
                        }
                        if (overlayView2.checkOnTap(motionEvent)) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() == 0 && ArticleViewer.this.textSelectionHelperBottomSheet.isInSelectionMode() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                            if (ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext()).onTouchEvent(motionEventObtain)) {
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
                BottomSheet bottomSheetCreate = builder.create();
                this.linkSheet = bottomSheetCreate;
                showDialog(bottomSheetCreate);
            } else if (numValueOf.intValue() >= 0 && numValueOf.intValue() < this.pages[0].adapter.blocks.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.pages[0].adapter.blocks.get(numValueOf.intValue());
                TL_iv.PageBlock lastNonListPageBlock = getLastNonListPageBlock(pageBlock);
                if ((lastNonListPageBlock instanceof TL_pageBlockDetailsChild) && openAllParentBlocks((TL_pageBlockDetailsChild) lastNonListPageBlock)) {
                    this.pages[0].adapter.updateRows();
                    this.pages[0].adapter.notifyDataSetChanged();
                }
                int iIndexOf = this.pages[0].adapter.localBlocks.indexOf(pageBlock);
                if (iIndexOf != -1) {
                    numValueOf = Integer.valueOf(iIndexOf);
                }
                Integer num2 = (Integer) this.pages[0].adapter.anchorsOffset.get(lowerCase);
                if (num2 != null) {
                    if (num2.intValue() == -1) {
                        int typeForBlock2 = this.pages[0].adapter.getTypeForBlock(pageBlock);
                        RecyclerView.ViewHolder viewHolderOnCreateViewHolder2 = this.pages[0].adapter.onCreateViewHolder(null, typeForBlock2);
                        this.pages[0].adapter.bindBlockToHolder(typeForBlock2, viewHolderOnCreateViewHolder2, pageBlock, 0, 0, false);
                        viewHolderOnCreateViewHolder2.itemView.measure(View.MeasureSpec.makeMeasureSpec(this.pages[0].listView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        Integer num3 = (Integer) this.pages[0].adapter.anchorsOffset.get(lowerCase);
                        if (num3.intValue() != -1) {
                            num = num3;
                        }
                    } else {
                        num = num2;
                    }
                }
                if (this.pages[0].adapter.padding) {
                    numValueOf = Integer.valueOf(numValueOf.intValue() + 1);
                }
                if (z) {
                    SmoothScroller smoothScroller = new SmoothScroller(this.pages[0].getContext()) {
                        @Override
                        protected int getVerticalSnapPreference() {
                            return -1;
                        }
                    };
                    smoothScroller.setTargetPosition(numValueOf.intValue());
                    smoothScroller.setOffset((-AndroidUtilities.dp(56.0f)) - num.intValue());
                    this.pages[0].layoutManager.startSmoothScroll(smoothScroller);
                } else {
                    this.pages[0].layoutManager.scrollToPositionWithOffset(numValueOf.intValue(), (-AndroidUtilities.dp(56.0f)) - num.intValue());
                }
            }
            return true;
        }
        return false;
    }

    private boolean removeLastPageFromStack() throws PackageManager.NameNotFoundException {
        if (this.pagesStack.size() < 2) {
            return false;
        }
        ArrayList arrayList = this.pagesStack;
        Object objRemove = arrayList.remove(arrayList.size() - 1);
        if (objRemove instanceof CachedWeb) {
            ((CachedWeb) objRemove).destroy();
        }
        if (objRemove instanceof TLRPC.WebPage) {
            WebInstantView.recycle((TLRPC.WebPage) objRemove);
        }
        ArrayList arrayList2 = this.pagesStack;
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

    @Override
    public Resources getResources() {
        return resources;
    }

    public static class Resources {
        public TextPaint errorTextPaint;
        public final boolean isRichMessage;
        public final SparseArray photoCaptionTextPaints = new SparseArray();
        public final SparseArray photoCreditTextPaints = new SparseArray();
        public final SparseArray titleTextPaints = new SparseArray();
        public final SparseArray kickerTextPaints = new SparseArray();
        public final SparseArray headerTextPaints = new SparseArray();
        public final SparseArray subtitleTextPaints = new SparseArray();
        public final SparseArray subheaderTextPaints = new SparseArray();
        public final SparseArray heading1TextPaints = new SparseArray();
        public final SparseArray heading2TextPaints = new SparseArray();
        public final SparseArray heading3TextPaints = new SparseArray();
        public final SparseArray heading4TextPaints = new SparseArray();
        public final SparseArray heading5TextPaints = new SparseArray();
        public final SparseArray heading6TextPaints = new SparseArray();
        public final SparseArray authorTextPaints = new SparseArray();
        public final SparseArray footerTextPaints = new SparseArray();
        public final SparseArray paragraphTextPaints = new SparseArray();
        public final SparseArray listTextPaints = new SparseArray();
        public final SparseArray preformattedTextPaints = new SparseArray();
        public final SparseArray quoteTextPaints = new SparseArray();
        public final SparseArray embedPostTextPaints = new SparseArray();
        public final SparseArray embedPostCaptionTextPaints = new SparseArray();
        public final SparseArray mediaCaptionTextPaints = new SparseArray();
        public final SparseArray mediaCreditTextPaints = new SparseArray();
        public final SparseArray relatedArticleTextPaints = new SparseArray();
        public final SparseArray detailsTextPaints = new SparseArray();
        public final SparseArray tableTextPaints = new SparseArray();

        public Resources(boolean z) {
            this.isRichMessage = z;
        }

        public void updatePaintColors(IArticleViewer iArticleViewer) {
            setMapColors(iArticleViewer, this.titleTextPaints);
            setMapColors(iArticleViewer, this.kickerTextPaints);
            setMapColors(iArticleViewer, this.subtitleTextPaints);
            setMapColors(iArticleViewer, this.headerTextPaints);
            setMapColors(iArticleViewer, this.subheaderTextPaints);
            setMapColors(iArticleViewer, this.heading1TextPaints);
            setMapColors(iArticleViewer, this.heading2TextPaints);
            setMapColors(iArticleViewer, this.heading3TextPaints);
            setMapColors(iArticleViewer, this.heading4TextPaints);
            setMapColors(iArticleViewer, this.heading5TextPaints);
            setMapColors(iArticleViewer, this.heading6TextPaints);
            setMapColors(iArticleViewer, this.quoteTextPaints);
            setMapColors(iArticleViewer, this.preformattedTextPaints);
            setMapColors(iArticleViewer, this.paragraphTextPaints);
            setMapColors(iArticleViewer, this.listTextPaints);
            setMapColors(iArticleViewer, this.embedPostTextPaints);
            setMapColors(iArticleViewer, this.mediaCaptionTextPaints);
            setMapColors(iArticleViewer, this.mediaCreditTextPaints);
            setMapColors(iArticleViewer, this.photoCaptionTextPaints);
            setMapColors(iArticleViewer, this.photoCreditTextPaints);
            setMapColors(iArticleViewer, this.authorTextPaints);
            setMapColors(iArticleViewer, this.footerTextPaints);
            setMapColors(iArticleViewer, this.embedPostCaptionTextPaints);
            setMapColors(iArticleViewer, this.relatedArticleTextPaints);
            setMapColors(iArticleViewer, this.detailsTextPaints);
            setMapColors(iArticleViewer, this.tableTextPaints);
        }

        private void setMapColors(IArticleViewer iArticleViewer, SparseArray sparseArray) {
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                TextPaint textPaint = (TextPaint) sparseArray.valueAt(i);
                if (textPaint != null) {
                    if ((iKeyAt & 8) != 0 || (iKeyAt & 512) != 0) {
                        textPaint.setColor(iArticleViewer.getLinkTextColor());
                    } else {
                        textPaint.setColor(iArticleViewer.getTextColor());
                    }
                }
            }
        }

        public void updatePaintFonts(int i) {
            ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i).commit();
            Typeface typeface = i == 0 ? Typeface.DEFAULT : Typeface.SERIF;
            Typeface typeface2 = i == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
            Typeface typefaceBold = i == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
            Typeface typeface3 = i == 0 ? AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf") : Typeface.create("serif", 3);
            for (int i2 = 0; i2 < this.quoteTextPaints.size(); i2++) {
                updateFontEntry(this.quoteTextPaints.keyAt(i2), (TextPaint) this.quoteTextPaints.valueAt(i2), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i3 = 0; i3 < this.preformattedTextPaints.size(); i3++) {
                updateFontEntry(this.preformattedTextPaints.keyAt(i3), (TextPaint) this.preformattedTextPaints.valueAt(i3), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i4 = 0; i4 < this.paragraphTextPaints.size(); i4++) {
                updateFontEntry(this.paragraphTextPaints.keyAt(i4), (TextPaint) this.paragraphTextPaints.valueAt(i4), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i5 = 0; i5 < this.listTextPaints.size(); i5++) {
                updateFontEntry(this.listTextPaints.keyAt(i5), (TextPaint) this.listTextPaints.valueAt(i5), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i6 = 0; i6 < this.embedPostTextPaints.size(); i6++) {
                updateFontEntry(this.embedPostTextPaints.keyAt(i6), (TextPaint) this.embedPostTextPaints.valueAt(i6), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i7 = 0; i7 < this.mediaCaptionTextPaints.size(); i7++) {
                updateFontEntry(this.mediaCaptionTextPaints.keyAt(i7), (TextPaint) this.mediaCaptionTextPaints.valueAt(i7), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i8 = 0; i8 < this.mediaCreditTextPaints.size(); i8++) {
                updateFontEntry(this.mediaCreditTextPaints.keyAt(i8), (TextPaint) this.mediaCreditTextPaints.valueAt(i8), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i9 = 0; i9 < this.photoCaptionTextPaints.size(); i9++) {
                updateFontEntry(this.photoCaptionTextPaints.keyAt(i9), (TextPaint) this.photoCaptionTextPaints.valueAt(i9), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i10 = 0; i10 < this.photoCreditTextPaints.size(); i10++) {
                updateFontEntry(this.photoCreditTextPaints.keyAt(i10), (TextPaint) this.photoCreditTextPaints.valueAt(i10), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i11 = 0; i11 < this.authorTextPaints.size(); i11++) {
                updateFontEntry(this.authorTextPaints.keyAt(i11), (TextPaint) this.authorTextPaints.valueAt(i11), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i12 = 0; i12 < this.footerTextPaints.size(); i12++) {
                updateFontEntry(this.footerTextPaints.keyAt(i12), (TextPaint) this.footerTextPaints.valueAt(i12), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i13 = 0; i13 < this.embedPostCaptionTextPaints.size(); i13++) {
                updateFontEntry(this.embedPostCaptionTextPaints.keyAt(i13), (TextPaint) this.embedPostCaptionTextPaints.valueAt(i13), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i14 = 0; i14 < this.relatedArticleTextPaints.size(); i14++) {
                updateFontEntry(this.relatedArticleTextPaints.keyAt(i14), (TextPaint) this.relatedArticleTextPaints.valueAt(i14), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i15 = 0; i15 < this.detailsTextPaints.size(); i15++) {
                updateFontEntry(this.detailsTextPaints.keyAt(i15), (TextPaint) this.detailsTextPaints.valueAt(i15), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i16 = 0; i16 < this.tableTextPaints.size(); i16++) {
                updateFontEntry(this.tableTextPaints.keyAt(i16), (TextPaint) this.tableTextPaints.valueAt(i16), typeface, typeface3, typefaceBold, typeface2);
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
    }

    public static void drawQuoteLines(Canvas canvas, IArticleViewer iArticleViewer, TL_iv.PageBlock pageBlock, int i) {
        if (pageBlock == null || iArticleViewer == null || quoteLinePaint == null) {
            return;
        }
        int iPadx = iArticleViewer.padx();
        int i2 = 0;
        int iDp = i - (pageBlock.bottom ? AndroidUtilities.dp(6.0f) : 0);
        int i3 = pageBlock.quoteLevels;
        if (i3 == 0) {
            if (pageBlock.level > 0) {
                canvas.drawRect(AndroidUtilities.dp(iPadx), 0.0f, r10 + AndroidUtilities.dp(2.0f), iDp, quoteLinePaint);
                return;
            }
            return;
        }
        while (i3 != 0) {
            if ((i3 & 1) != 0) {
                canvas.drawRect(AndroidUtilities.dp((i2 * 14) + iPadx), 0.0f, r11 + AndroidUtilities.dp(2.0f), iDp, quoteLinePaint);
            }
            i3 >>>= 1;
            i2++;
        }
    }

    public static int getTextFlags(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return getTextFlags(richText.parentRichText) | 4;
        }
        if (richText instanceof TL_iv.textItalic) {
            return getTextFlags(richText.parentRichText) | 2;
        }
        if (richText instanceof TL_iv.textBold) {
            return getTextFlags(richText.parentRichText) | 1;
        }
        if (richText instanceof TL_iv.textUnderline) {
            return getTextFlags(richText.parentRichText) | 16;
        }
        if (richText instanceof TL_iv.textStrike) {
            return getTextFlags(richText.parentRichText) | 32;
        }
        if (richText instanceof TL_iv.textEmail) {
            return getTextFlags(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textPhone) {
            return getTextFlags(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textUrl) {
            if (((TL_iv.textUrl) richText).webpage_id != 0) {
                return getTextFlags(richText.parentRichText) | 512;
            }
            return getTextFlags(richText.parentRichText) | 8;
        }
        if (richText instanceof TL_iv.textSubscript) {
            return getTextFlags(richText.parentRichText) | 128;
        }
        if (richText instanceof TL_iv.textSuperscript) {
            return getTextFlags(richText.parentRichText) | 256;
        }
        if (richText instanceof TL_iv.textMarked) {
            return getTextFlags(richText.parentRichText) | 64;
        }
        if (richText != null) {
            return getTextFlags(richText.parentRichText);
        }
        return 0;
    }

    public static TL_iv.RichText getLastRichText(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textFixed) {
            return getLastRichText(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return getLastRichText(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return getLastRichText(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return getLastRichText(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return getLastRichText(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return getLastRichText(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return getLastRichText(((TL_iv.textUrl) richText).text);
        }
        if (richText instanceof TL_iv.textAnchor) {
            getLastRichText(((TL_iv.textAnchor) richText).text);
        } else {
            if (richText instanceof TL_iv.textSubscript) {
                return getLastRichText(((TL_iv.textSubscript) richText).text);
            }
            if (richText instanceof TL_iv.textSuperscript) {
                return getLastRichText(((TL_iv.textSuperscript) richText).text);
            }
            if (richText instanceof TL_iv.textMarked) {
                return getLastRichText(((TL_iv.textMarked) richText).text);
            }
            if (richText instanceof TL_iv.textPhone) {
                return getLastRichText(((TL_iv.textPhone) richText).text);
            }
            if (richText instanceof TL_iv.textSpoiler) {
                return getLastRichText(((TL_iv.textSpoiler) richText).text);
            }
        }
        return richText;
    }

    private CharSequence getText(WebpageAdapter webpageAdapter, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        return getText(webpageAdapter.currentPage, view, richText, richText2, pageBlock, i);
    }

    public static CharSequence getText(IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        return getText(iArticleViewer, webpageAdapter != null ? webpageAdapter.currentPage : null, view, richText, richText2, pageBlock, i);
    }

    public CharSequence getText(TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        return getText(this, webPage, view, richText, richText2, pageBlock, i);
    }

    public static CharSequence getText(IArticleViewer iArticleViewer, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Object textPaintUrlSpan;
        Object textPaintUrlSpan2;
        if (richText2 == null) {
            return null;
        }
        if (richText2 instanceof TL_iv.textFixed) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textFixed) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textItalic) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textItalic) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textBold) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textBold) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textUnderline) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textUnderline) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textStrike) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textStrike) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textEmail) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText(iArticleViewer, webPage, view, richText, ((TL_iv.textEmail) richText2).text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder.length() != 0) {
                spannableStringBuilder.setSpan(new TextPaintUrlSpan((metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) ? getTextPaint(iArticleViewer, richText, richText2, pageBlock) : null, "mailto:" + getUrl(richText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        if (richText2 instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getText(iArticleViewer, webPage, view, richText, texturl.text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            TextPaint textPaint = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? getTextPaint(iArticleViewer, richText, richText2, pageBlock) : null;
            if (texturl.webpage_id != 0) {
                textPaintUrlSpan2 = new TextPaintWebpageUrlSpan(textPaint, getUrl(richText2));
            } else {
                textPaintUrlSpan2 = new TextPaintUrlSpan(textPaint, getUrl(richText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(textPaintUrlSpan2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        }
        if (richText2 instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText2).text;
        }
        if (richText2 instanceof TL_iv.textAnchor) {
            TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(getText(iArticleViewer, webPage, view, richText, textanchor.text, pageBlock, i));
            spannableStringBuilder3.setSpan(new AnchorSpan(textanchor.name), 0, spannableStringBuilder3.length(), 17);
            return spannableStringBuilder3;
        }
        if (richText2 instanceof TL_iv.textEmpty) {
            return "";
        }
        int i6 = 1;
        if (richText2 instanceof TL_iv.textConcat) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = richText2.texts.size();
            int i7 = 0;
            while (i7 < size) {
                TL_iv.RichText richText3 = richText2.texts.get(i7);
                TL_iv.RichText lastRichText = getLastRichText(richText3);
                boolean z = i >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != 0;
                if (z && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - i6) != '\n') {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new TextSelectionHelper.IgnoreCopySpannable(), spannableStringBuilder4.length() - i6, spannableStringBuilder4.length(), 33);
                }
                int i8 = i7;
                int i9 = size;
                CharSequence text = getText(iArticleViewer, webPage, view, richText, richText3, pageBlock, i);
                int textFlags = getTextFlags(lastRichText);
                int length = spannableStringBuilder4.length();
                spannableStringBuilder4.append(text);
                if (textFlags != 0 && !(text instanceof SpannableStringBuilder)) {
                    if ((textFlags & 8) != 0 || (textFlags & 512) != 0) {
                        String url = getUrl(richText3);
                        if (url == null) {
                            url = getUrl(richText);
                        }
                        if ((textFlags & 512) != 0) {
                            textPaintUrlSpan = new TextPaintWebpageUrlSpan(getTextPaint(iArticleViewer, richText, lastRichText, pageBlock), url);
                        } else {
                            textPaintUrlSpan = new TextPaintUrlSpan(getTextPaint(iArticleViewer, richText, lastRichText, pageBlock), url);
                        }
                        if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(textPaintUrlSpan, length, spannableStringBuilder4.length(), 33);
                        }
                    } else if (length != spannableStringBuilder4.length()) {
                        spannableStringBuilder4.setSpan(new TextPaintSpan(getTextPaint(iArticleViewer, richText, lastRichText, pageBlock)), length, spannableStringBuilder4.length(), 33);
                    }
                }
                if (z && i8 != i9 - 1) {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new TextSelectionHelper.IgnoreCopySpannable(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                i7 = i8 + 1;
                size = i9;
                i6 = 1;
            }
            return spannableStringBuilder4;
        }
        if (richText2 instanceof TL_iv.textSubscript) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textSubscript) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textSuperscript) {
            return getText(iArticleViewer, webPage, view, richText, ((TL_iv.textSuperscript) richText2).text, pageBlock, i);
        }
        if (richText2 instanceof TL_iv.textMarked) {
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(getText(iArticleViewer, webPage, view, richText, ((TL_iv.textMarked) richText2).text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr3 = (MetricAffectingSpan[]) spannableStringBuilder5.getSpans(0, spannableStringBuilder5.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder5.length() != 0) {
                spannableStringBuilder5.setSpan(new TextPaintMarkSpan((metricAffectingSpanArr3 == null || metricAffectingSpanArr3.length == 0) ? getTextPaint(iArticleViewer, richText, richText2, pageBlock) : null), 0, spannableStringBuilder5.length(), 33);
            }
            return spannableStringBuilder5;
        }
        if (richText2 instanceof TL_iv.textSpoiler) {
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(getText(iArticleViewer, webPage, view, richText, ((TL_iv.textSpoiler) richText2).text, pageBlock, i));
            if (spannableStringBuilder6.length() != 0) {
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags |= 256;
                spannableStringBuilder6.setSpan(new TextStyleSpan(textStyleRun), 0, spannableStringBuilder6.length(), 33);
            }
            return spannableStringBuilder6;
        }
        if (richText2 instanceof TL_iv.textPhone) {
            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(getText(iArticleViewer, webPage, view, richText, ((TL_iv.textPhone) richText2).text, pageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder7.getSpans(0, spannableStringBuilder7.length(), MetricAffectingSpan.class);
            if (spannableStringBuilder7.length() != 0) {
                spannableStringBuilder7.setSpan(new TextPaintUrlSpan((metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? getTextPaint(iArticleViewer, richText, richText2, pageBlock) : null, "tel:" + getUrl(richText2)), 0, spannableStringBuilder7.length(), 33);
            }
            return spannableStringBuilder7;
        }
        if (richText2 instanceof TL_iv.textImage) {
            TL_iv.textImage textimage = (TL_iv.textImage) richText2;
            TLRPC.Document documentWithId = WebPageUtils.getDocumentWithId(webPage, textimage.document_id);
            TLRPC.Photo photoWithId = WebPageUtils.getPhotoWithId(webPage, textimage.photo_id);
            if (documentWithId != null) {
                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("*");
                int iDp = AndroidUtilities.dp(textimage.w);
                int iDp2 = AndroidUtilities.dp(textimage.h);
                int iAbs = Math.abs(i);
                if (iDp > iAbs) {
                    i4 = (int) (iDp2 * (iAbs / iDp));
                    i5 = iAbs;
                } else {
                    i4 = iDp2;
                    i5 = iDp;
                }
                if (view != null) {
                    spannableStringBuilder8.setSpan(new TextPaintImageReceiverSpan(view, documentWithId, (Object) webPage, i5, i4, false, AndroidUtilities.computePerceivedBrightness(iArticleViewer.getThemedColor(Theme.key_windowBackgroundWhite)) <= 0.705f), 0, spannableStringBuilder8.length(), 33);
                }
                return spannableStringBuilder8;
            }
            if (!(photoWithId instanceof WebInstantView.WebPhoto)) {
                return "";
            }
            WebInstantView.WebPhoto webPhoto = (WebInstantView.WebPhoto) photoWithId;
            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder("*");
            int iDp3 = AndroidUtilities.dp(textimage.w);
            int iDp4 = AndroidUtilities.dp(textimage.h);
            int iAbs2 = Math.abs(i);
            if (iDp3 > iAbs2) {
                i2 = (int) (iDp4 * (iAbs2 / iDp3));
                i3 = iAbs2;
            } else {
                i2 = iDp4;
                i3 = iDp3;
            }
            if (view != null) {
                spannableStringBuilder9.setSpan(new TextPaintImageReceiverSpan(view, webPhoto, (Object) webPage, i3, i2, false, false), 0, spannableStringBuilder9.length(), 33);
            }
            return spannableStringBuilder9;
        }
        if (richText2 instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
            if (textmath.bitmap == null && !textmath.tried) {
                textmath.tried = true;
                try {
                    JLatexMathDrawable jLatexMathDrawableBuild = JLatexMathDrawable.builder(textmath.source).textSize(AndroidUtilities.dp(20.0f)).build();
                    int intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
                    int intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                        jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        jLatexMathDrawableBuild.draw(new Canvas(bitmapCreateBitmap));
                        textmath.w = intrinsicWidth;
                        textmath.h = intrinsicHeight;
                        try {
                            textmath.depth = jLatexMathDrawableBuild.icon().getIconDepth();
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        textmath.bitmap = bitmapCreateBitmap;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (textmath.bitmap == null) {
                String str = textmath.source;
                return str == null ? "" : str;
            }
            SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder("￼");
            spannableStringBuilder10.setSpan(new TextPaintImageReceiverSpan(view, textmath.bitmap, textmath.w, textmath.h, iArticleViewer.getThemedColor(Theme.key_windowBackgroundWhiteBlackText), textmath.depth), 0, spannableStringBuilder10.length(), 33);
            String str2 = textmath.source;
            if (str2 != null && !str2.isEmpty()) {
                spannableStringBuilder10.setSpan(new TextSelectionHelper.ReplaceCopyTextSpannable(textmath.source), 0, spannableStringBuilder10.length(), 33);
            }
            return spannableStringBuilder10;
        }
        return "not supported " + richText2;
    }

    public static CharSequence getPlainText(TL_iv.RichText richText) {
        if (richText == null) {
            return "";
        }
        if (richText instanceof TL_iv.textFixed) {
            return getPlainText(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return getPlainText(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return getPlainText(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return getPlainText(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return getPlainText(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return getPlainText(((TL_iv.textEmail) richText).text);
        }
        if (richText instanceof TL_iv.textUrl) {
            return getPlainText(((TL_iv.textUrl) richText).text);
        }
        if (richText instanceof TL_iv.textPlain) {
            return ((TL_iv.textPlain) richText).text;
        }
        if (richText instanceof TL_iv.textAnchor) {
            return getPlainText(((TL_iv.textAnchor) richText).text);
        }
        if (richText instanceof TL_iv.textEmpty) {
            return "";
        }
        if (richText instanceof TL_iv.textConcat) {
            StringBuilder sb = new StringBuilder();
            int size = richText.texts.size();
            for (int i = 0; i < size; i++) {
                sb.append(getPlainText(richText.texts.get(i)));
            }
            return sb;
        }
        if (richText instanceof TL_iv.textSubscript) {
            return getPlainText(((TL_iv.textSubscript) richText).text);
        }
        if (richText instanceof TL_iv.textSuperscript) {
            return getPlainText(((TL_iv.textSuperscript) richText).text);
        }
        if (richText instanceof TL_iv.textMarked) {
            return getPlainText(((TL_iv.textMarked) richText).text);
        }
        if (richText instanceof TL_iv.textPhone) {
            return getPlainText(((TL_iv.textPhone) richText).text);
        }
        boolean z = richText instanceof TL_iv.textImage;
        return "";
    }

    public static String getUrl(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textFixed) {
            return getUrl(((TL_iv.textFixed) richText).text);
        }
        if (richText instanceof TL_iv.textItalic) {
            return getUrl(((TL_iv.textItalic) richText).text);
        }
        if (richText instanceof TL_iv.textBold) {
            return getUrl(((TL_iv.textBold) richText).text);
        }
        if (richText instanceof TL_iv.textUnderline) {
            return getUrl(((TL_iv.textUnderline) richText).text);
        }
        if (richText instanceof TL_iv.textStrike) {
            return getUrl(((TL_iv.textStrike) richText).text);
        }
        if (richText instanceof TL_iv.textEmail) {
            return ((TL_iv.textEmail) richText).email;
        }
        if (richText instanceof TL_iv.textUrl) {
            return ((TL_iv.textUrl) richText).url;
        }
        if (richText instanceof TL_iv.textPhone) {
            return ((TL_iv.textPhone) richText).phone;
        }
        return null;
    }

    @Override
    public int getTextColor() {
        return getThemedColor(Theme.key_windowBackgroundWhiteBlackText);
    }

    @Override
    public int getLinkTextColor() {
        return getThemedColor(Theme.key_windowBackgroundWhiteLinkText);
    }

    @Override
    public int getGrayTextColor() {
        return getThemedColor(Theme.key_windowBackgroundWhiteGrayText);
    }

    public static android.text.TextPaint getTextPaint(org.telegram.ui.IArticleViewer r11, org.telegram.tgnet.tl.TL_iv.RichText r12, org.telegram.tgnet.tl.TL_iv.RichText r13, org.telegram.tgnet.tl.TL_iv.PageBlock r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.getTextPaint(org.telegram.ui.IArticleViewer, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$RichText, org.telegram.tgnet.tl.TL_iv$PageBlock):android.text.TextPaint");
    }

    public DrawingText createLayoutForText(View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, WebpageAdapter webpageAdapter) {
        return createLayoutForText(view, charSequence, richText, i, 0, pageBlock, alignment, 0, webpageAdapter);
    }

    public static DrawingText createLayoutForText(IArticleViewer iArticleViewer, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, WebpageAdapter webpageAdapter) {
        return createLayoutForText(iArticleViewer, view, charSequence, richText, i, 0, pageBlock, alignment, 0, webpageAdapter);
    }

    public DrawingText createLayoutForText(View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, WebpageAdapter webpageAdapter) {
        return createLayoutForText(view, charSequence, richText, i, i2, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, webpageAdapter);
    }

    public static DrawingText createLayoutForText(IArticleViewer iArticleViewer, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, WebpageAdapter webpageAdapter) {
        return createLayoutForText(iArticleViewer, view, charSequence, richText, i, i2, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, webpageAdapter);
    }

    private DrawingText createLayoutForText(View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i3, WebpageAdapter webpageAdapter) {
        return createLayoutForText(this, view, charSequence, richText, i, i2, pageBlock, alignment, i3, webpageAdapter);
    }

    public static DrawingText createLayoutForText(IArticleViewer iArticleViewer, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i3, WebpageAdapter webpageAdapter) {
        TextPaint textPaint;
        StaticLayout staticLayout;
        LinkPath linkPath;
        LinkPath linkPath2;
        LinkPath linkPath3;
        TextPaintMarkSpan[] textPaintMarkSpanArr;
        int iDp;
        TextPaintWebpageUrlSpan[] textPaintWebpageUrlSpanArr;
        int iDp2;
        WebpageAdapter adapter;
        if (charSequence == null && (richText == null || (richText instanceof TL_iv.textEmpty))) {
            return null;
        }
        int iDp3 = i < 0 ? AndroidUtilities.dp(10.0f) : i;
        CharSequence text = charSequence != null ? charSequence : getText(iArticleViewer, webpageAdapter, view, richText, richText, pageBlock, iDp3);
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        int iDp4 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        if ((pageBlock instanceof TL_iv.pageBlockEmbedPost) && richText == null) {
            if (((TL_iv.pageBlockEmbedPost) pageBlock).author == charSequence) {
                if (embedPostAuthorPaint == null) {
                    TextPaint textPaint2 = new TextPaint(1);
                    embedPostAuthorPaint = textPaint2;
                    textPaint2.setColor(iArticleViewer.getTextColor());
                }
                embedPostAuthorPaint.setTextSize(AndroidUtilities.dp(15.0f) + iDp4);
                textPaint = embedPostAuthorPaint;
            } else {
                if (embedPostDatePaint == null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    embedPostDatePaint = textPaint3;
                    textPaint3.setColor(iArticleViewer.getGrayTextColor());
                }
                embedPostDatePaint.setTextSize(AndroidUtilities.dp(14.0f) + iDp4);
                textPaint = embedPostDatePaint;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockChannel) {
            if (channelNamePaint == null) {
                TextPaint textPaint4 = new TextPaint(1);
                channelNamePaint = textPaint4;
                textPaint4.setTypeface(AndroidUtilities.bold());
                TextPaint textPaint5 = new TextPaint(1);
                channelNamePhotoPaint = textPaint5;
                textPaint5.setTypeface(AndroidUtilities.bold());
            }
            channelNamePaint.setColor(iArticleViewer.getTextColor());
            channelNamePaint.setTextSize(AndroidUtilities.dp(15.0f));
            channelNamePhotoPaint.setColor(-1);
            channelNamePhotoPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint = (webpageAdapter == null || webpageAdapter.channelBlock == null) ? channelNamePaint : channelNamePhotoPaint;
        } else if (pageBlock instanceof TL_pageBlockRelatedArticlesChild) {
            TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = (TL_pageBlockRelatedArticlesChild) pageBlock;
            if (charSequence == tL_pageBlockRelatedArticlesChild.parent.articles.get(tL_pageBlockRelatedArticlesChild.num).title) {
                if (relatedArticleHeaderPaint == null) {
                    TextPaint textPaint6 = new TextPaint(1);
                    relatedArticleHeaderPaint = textPaint6;
                    textPaint6.setTypeface(AndroidUtilities.bold());
                }
                relatedArticleHeaderPaint.setColor(iArticleViewer.getTextColor());
                relatedArticleHeaderPaint.setTextSize(AndroidUtilities.dp(15.0f) + iDp4);
                textPaint = relatedArticleHeaderPaint;
            } else {
                if (relatedArticleTextPaint == null) {
                    relatedArticleTextPaint = new TextPaint(1);
                }
                relatedArticleTextPaint.setColor(iArticleViewer.getGrayTextColor());
                relatedArticleTextPaint.setTextSize(AndroidUtilities.dp(14.0f) + iDp4);
                textPaint = relatedArticleTextPaint;
            }
        } else if (isListItemBlock(pageBlock) && charSequence != null) {
            if (listTextPointerPaint == null) {
                TextPaint textPaint7 = new TextPaint(1);
                listTextPointerPaint = textPaint7;
                textPaint7.setColor(iArticleViewer.getTextColor());
            }
            if (listTextNumPaint == null) {
                TextPaint textPaint8 = new TextPaint(1);
                listTextNumPaint = textPaint8;
                textPaint8.setColor(iArticleViewer.getTextColor());
            }
            listTextPointerPaint.setTextSize(AndroidUtilities.dp(19.0f) + iDp4);
            listTextNumPaint.setTextSize(AndroidUtilities.dp(16.0f) + iDp4);
            if ((pageBlock instanceof TL_pageBlockListItem) && !((TL_pageBlockListItem) pageBlock).parent.pageBlockList.ordered) {
                textPaint = listTextPointerPaint;
            } else {
                textPaint = listTextNumPaint;
            }
        } else {
            textPaint = getTextPaint(iArticleViewer, richText, richText, pageBlock);
        }
        TextPaint textPaint9 = textPaint;
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(text, textPaint9.getFontMetricsInt(), false, null, 2);
        if (i3 != 0) {
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                staticLayout = StaticLayoutEx.createStaticLayout(charSequenceReplaceEmoji, textPaint9, iDp3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, iDp3, i3);
            } else {
                staticLayout = StaticLayoutEx.createStaticLayout(charSequenceReplaceEmoji, textPaint9, iDp3, alignment, 1.0f, AndroidUtilities.dp(4.0f), false, TextUtils.TruncateAt.END, iDp3, i3);
            }
        } else {
            if (charSequenceReplaceEmoji.charAt(charSequenceReplaceEmoji.length() - 1) == '\n') {
                charSequenceReplaceEmoji = charSequenceReplaceEmoji.subSequence(0, charSequenceReplaceEmoji.length() - 1);
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                staticLayout = new StaticLayout(charSequenceReplaceEmoji, textPaint9, iDp3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            } else {
                staticLayout = new StaticLayout(charSequenceReplaceEmoji, textPaint9, iDp3, alignment, 1.0f, AndroidUtilities.dp(4.0f), false);
            }
        }
        if (staticLayout == null) {
            return null;
        }
        CharSequence text2 = staticLayout.getText();
        if (i2 >= 0 && !iArticleViewer.searchResults.isEmpty() && iArticleViewer.searchText != null && (adapter = iArticleViewer.getAdapter()) != null) {
            String lowerCase = charSequenceReplaceEmoji.toString().toLowerCase();
            int i4 = 0;
            while (true) {
                int iIndexOf = lowerCase.indexOf(iArticleViewer.searchText, i4);
                if (iIndexOf < 0) {
                    break;
                }
                int length = iArticleViewer.searchText.length() + iIndexOf;
                if (iIndexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(iIndexOf - 1))) {
                    adapter.searchTextOffset.put(iArticleViewer.searchText + pageBlock + richText + iIndexOf, Integer.valueOf(i2 + staticLayout.getLineTop(staticLayout.getLineForOffset(iIndexOf))));
                }
                i4 = length;
            }
        }
        boolean z = text2 instanceof Spanned;
        if (z) {
            Spanned spanned = (Spanned) text2;
            try {
                AnchorSpan[] anchorSpanArr = (AnchorSpan[]) spanned.getSpans(0, spanned.length(), AnchorSpan.class);
                int lineCount = staticLayout.getLineCount();
                if (anchorSpanArr != null && anchorSpanArr.length > 0) {
                    for (int i5 = 0; i5 < anchorSpanArr.length; i5++) {
                        if (lineCount <= 1) {
                            webpageAdapter.anchorsOffset.put(anchorSpanArr[i5].getName(), Integer.valueOf(i2));
                        } else {
                            webpageAdapter.anchorsOffset.put(anchorSpanArr[i5].getName(), Integer.valueOf(i2 + staticLayout.getLineTop(staticLayout.getLineForOffset(spanned.getSpanStart(anchorSpanArr[i5])))));
                        }
                    }
                }
            } catch (Exception unused) {
            }
            float f = 0.0f;
            try {
                textPaintWebpageUrlSpanArr = (TextPaintWebpageUrlSpan[]) spanned.getSpans(0, spanned.length(), TextPaintWebpageUrlSpan.class);
            } catch (Exception unused2) {
            }
            if (textPaintWebpageUrlSpanArr == null || textPaintWebpageUrlSpanArr.length <= 0) {
                linkPath3 = null;
            } else {
                linkPath3 = new LinkPath(true);
                try {
                    linkPath3.setAllowReset(false);
                    int i6 = 0;
                    while (i6 < textPaintWebpageUrlSpanArr.length) {
                        int spanStart = spanned.getSpanStart(textPaintWebpageUrlSpanArr[i6]);
                        int spanEnd = spanned.getSpanEnd(textPaintWebpageUrlSpanArr[i6]);
                        linkPath3.setCurrentLayout(staticLayout, spanStart, f);
                        int i7 = textPaintWebpageUrlSpanArr[i6].getTextPaint() != null ? textPaintWebpageUrlSpanArr[i6].getTextPaint().baselineShift : 0;
                        if (i7 != 0) {
                            iDp2 = i7 + AndroidUtilities.dp(i7 > 0 ? 5.0f : -2.0f);
                        } else {
                            iDp2 = 0;
                        }
                        linkPath3.setBaselineShift(iDp2);
                        staticLayout.getSelectionPath(spanStart, spanEnd, linkPath3);
                        i6++;
                        f = 0.0f;
                    }
                    linkPath3.setAllowReset(true);
                } catch (Exception unused3) {
                }
            }
            try {
                textPaintMarkSpanArr = (TextPaintMarkSpan[]) spanned.getSpans(0, spanned.length(), TextPaintMarkSpan.class);
            } catch (Exception unused4) {
            }
            if (textPaintMarkSpanArr == null || textPaintMarkSpanArr.length <= 0) {
                linkPath = null;
                linkPath2 = linkPath3;
            } else {
                LinkPath linkPath4 = new LinkPath(true);
                try {
                    linkPath4.setAllowReset(false);
                    for (int i8 = 0; i8 < textPaintMarkSpanArr.length; i8++) {
                        int spanStart2 = spanned.getSpanStart(textPaintMarkSpanArr[i8]);
                        int spanEnd2 = spanned.getSpanEnd(textPaintMarkSpanArr[i8]);
                        linkPath4.setCurrentLayout(staticLayout, spanStart2, 0.0f);
                        int i9 = textPaintMarkSpanArr[i8].getTextPaint() != null ? textPaintMarkSpanArr[i8].getTextPaint().baselineShift : 0;
                        if (i9 != 0) {
                            iDp = i9 + AndroidUtilities.dp(i9 > 0 ? 5.0f : -2.0f);
                        } else {
                            iDp = 0;
                        }
                        linkPath4.setBaselineShift(iDp);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, linkPath4);
                    }
                    linkPath4.setAllowReset(true);
                } catch (Exception unused5) {
                }
                linkPath = linkPath4;
                linkPath2 = linkPath3;
            }
        } else {
            linkPath = null;
            linkPath2 = null;
        }
        DrawingText drawingText = new DrawingText(iArticleViewer);
        drawingText.textLayout = staticLayout;
        drawingText.textPath = linkPath2;
        drawingText.markPath = linkPath;
        drawingText.parentBlock = pageBlock;
        drawingText.parentText = richText;
        drawingText.spoilersPool = new Stack();
        drawingText.spoilers = new ArrayList();
        drawingText.spoilersPatchedLayout = new AtomicReference();
        if (z) {
            SpoilerEffect.addSpoilers(view, staticLayout, (Spanned) text2, drawingText.spoilersPool, drawingText.spoilers);
        }
        if (view != null) {
            ArrayList arrayList = (ArrayList) liveDrawingTexts.get(view);
            if (arrayList != null) {
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    DrawingText drawingText2 = (DrawingText) arrayList.get(i10);
                    if (drawingText2.parentBlock != pageBlock || (richText != null && drawingText2.parentText == richText)) {
                        drawingText2.detach(view);
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
            }
            if (richText != null) {
                if (arrayList == null) {
                    WeakHashMap weakHashMap = liveDrawingTexts;
                    ArrayList arrayList2 = new ArrayList();
                    weakHashMap.put(view, arrayList2);
                    arrayList = arrayList2;
                }
                arrayList.add(drawingText);
            }
            if (view.isAttachedToWindow()) {
                drawingText.attach(view);
            }
        }
        return drawingText;
    }

    @Override
    public boolean allowTouches() {
        return this.pageSwitchAnimation == null;
    }

    public boolean checkLayoutForLinks(WebpageAdapter webpageAdapter, MotionEvent motionEvent, View view, DrawingText drawingText, int i, int i2) {
        return checkLayoutForLinks(this, webpageAdapter, motionEvent, view, drawingText, i, i2);
    }

    public static boolean checkLayoutForLinks(org.telegram.ui.IArticleViewer r17, org.telegram.ui.ArticleViewer.WebpageAdapter r18, android.view.MotionEvent r19, final android.view.View r20, final org.telegram.ui.ArticleViewer.DrawingText r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.checkLayoutForLinks(org.telegram.ui.IArticleViewer, org.telegram.ui.ArticleViewer$WebpageAdapter, android.view.MotionEvent, android.view.View, org.telegram.ui.ArticleViewer$DrawingText, int, int):boolean");
    }

    public static void lambda$checkLayoutForLinks$7(final View view, final DrawingText drawingText) {
        view.post(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.lambda$checkLayoutForLinks$6(drawingText, view);
            }
        });
    }

    public static void lambda$checkLayoutForLinks$6(DrawingText drawingText, View view) {
        drawingText.spoilers.clear();
        drawingText.spoilersPatchedLayout.set(null);
        view.invalidate();
    }

    @Override
    public void checkLayoutForLinks(MotionEvent motionEvent, View view) {
        if (motionEvent.getAction() == 0) {
            startCheckLongPress(motionEvent.getX(), motionEvent.getY(), view);
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            return;
        }
        cancelCheckLongPress();
    }

    public Browser.Progress makeProgress(LinkSpanDrawable linkSpanDrawable, DrawingText drawingText) {
        return makeProgress(this, linkSpanDrawable, drawingText);
    }

    private static Browser.Progress makeProgress(final IArticleViewer iArticleViewer, final LinkSpanDrawable linkSpanDrawable, final DrawingText drawingText) {
        if (linkSpanDrawable == null) {
            return null;
        }
        return new Browser.Progress() {
            @Override
            public void init() {
                IArticleViewer iArticleViewer2 = iArticleViewer;
                DrawingText drawingText2 = drawingText;
                iArticleViewer2.loadingText = drawingText2;
                iArticleViewer2.loadingLinkView = drawingText2 != null ? drawingText2.latestParentView : null;
                iArticleViewer.loadingLink = (TextPaintUrlSpan) linkSpanDrawable.getSpan();
                IArticleViewer iArticleViewer3 = iArticleViewer;
                iArticleViewer3.links.removeLoading(iArticleViewer3.loadingLinkDrawable, true);
                DrawingText drawingText3 = drawingText;
                if (drawingText3 != null) {
                    iArticleViewer.loadingLinkDrawable = LinkSpanDrawable.LinkCollector.makeLoading(drawingText3.textLayout, linkSpanDrawable.getSpan(), 0.0f);
                    int themedColor = iArticleViewer.getThemedColor(Theme.key_chat_linkSelectBackground);
                    iArticleViewer.loadingLinkDrawable.setColors(Theme.multAlpha(themedColor, 0.8f), Theme.multAlpha(themedColor, 1.3f), Theme.multAlpha(themedColor, 1.0f), Theme.multAlpha(themedColor, 4.0f));
                    iArticleViewer.loadingLinkDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    IArticleViewer iArticleViewer4 = iArticleViewer;
                    iArticleViewer4.links.addLoading(iArticleViewer4.loadingLinkDrawable, drawingText);
                }
                View view = iArticleViewer.loadingLinkView;
                if (view != null) {
                    view.invalidate();
                }
                super.init();
            }

            @Override
            public void end() {
                IArticleViewer iArticleViewer2 = iArticleViewer;
                iArticleViewer2.links.removeLoading(iArticleViewer2.loadingLinkDrawable, true);
                View view = iArticleViewer.loadingLinkView;
                if (view != null) {
                    view.invalidate();
                }
                iArticleViewer.loadingLink = null;
                super.end();
            }
        };
    }

    public static void removePressedLink(IArticleViewer iArticleViewer) {
        if (iArticleViewer.pressedLink == null && iArticleViewer.pressedLinkOwnerView == null) {
            return;
        }
        View view = iArticleViewer.pressedLinkOwnerView;
        iArticleViewer.links.clear();
        iArticleViewer.pressedLink = null;
        iArticleViewer.pressedLinkOwnerLayout = null;
        iArticleViewer.pressedLinkOwnerView = null;
        if (view != null) {
            view.invalidate();
        }
    }

    public void openWebpageUrl(final String str, final String str2, final Browser.Progress progress) {
        Activity activity = this.parentActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        PageLayout pageLayout = this.pages[0];
        if (pageLayout != null && pageLayout.isLocal()) {
            String string = LocaleController.getString(R.string.OpenUrlAlert2);
            int iIndexOf = string.indexOf("%");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
            if (iIndexOf >= 0) {
                spannableStringBuilder.setSpan(new URLSpan(str), iIndexOf, str.length() + iIndexOf, 33);
            }
            new AlertDialog.Builder(this.parentActivity, getResourcesProvider()).setTitle(LocaleController.getString(R.string.OpenUrlTitle)).setMessage(spannableStringBuilder).setMessageTextViewClickable(false).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Open), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$openWebpageUrl$8(str, str2, progress, alertDialog, i);
                }
            }).show();
            return;
        }
        openWebpageUrlInternal(str, str2, progress);
    }

    public void lambda$openWebpageUrl$8(String str, String str2, Browser.Progress progress, AlertDialog alertDialog, int i) {
        openWebpageUrlInternal(str, str2, progress);
    }

    private void openWebpageUrlInternal(final String str, final String str2, final Browser.Progress progress) {
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
                return this.f$0.lambda$openWebpageUrlInternal$10(str, zArr, progress);
            }
        };
        final int i = this.lastReqId + 1;
        this.lastReqId = i;
        showProgressView(true, true);
        final TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.openUrlReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getWebPage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$openWebpageUrlInternal$12(i, progress, str2, callback0Return, tL_messages_getWebPage, tLObject, tL_error);
            }
        });
        if (progress != null) {
            progress.onCancel(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openWebpageUrlInternal$13(i, progress);
                }
            });
            progress.init();
        }
    }

    public Boolean lambda$openWebpageUrlInternal$10(String str, boolean[] zArr, final Browser.Progress progress) {
        if (!Browser.isInternalUri(Uri.parse(str), zArr)) {
            return Boolean.FALSE;
        }
        if (progress != null) {
            progress.onEnd(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openWebpageUrlInternal$9(progress);
                }
            });
        } else {
            Sheet sheet = this.sheet;
            if (sheet != null) {
                sheet.dismiss(true);
            }
        }
        Browser.openUrl(this.parentActivity, Uri.parse(str), true, true, false, progress, null, true, true, false);
        return Boolean.TRUE;
    }

    public void lambda$openWebpageUrlInternal$9(Browser.Progress progress) {
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.dismiss(true);
        }
        if (this.loadingProgress == progress) {
            this.loadingProgress = null;
        }
    }

    public void lambda$openWebpageUrlInternal$12(final int i, final Browser.Progress progress, final String str, final Utilities.Callback0Return callback0Return, final TLRPC.TL_messages_getWebPage tL_messages_getWebPage, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws PackageManager.NameNotFoundException {
                this.f$0.lambda$openWebpageUrlInternal$11(i, progress, tLObject, str, callback0Return, tL_messages_getWebPage);
            }
        });
    }

    public void lambda$openWebpageUrlInternal$11(int i, Browser.Progress progress, TLObject tLObject, String str, Utilities.Callback0Return callback0Return, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) throws PackageManager.NameNotFoundException {
        if (this.openUrlReqId == 0 || i != this.lastReqId) {
            return;
        }
        if (progress != null) {
            progress.end();
        }
        this.openUrlReqId = 0;
        showProgressView(true, false);
        if (this.isVisible) {
            if (tLObject instanceof TLRPC.TL_messages_webPage) {
                TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_webPage.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(tL_messages_webPage.chats, false);
                TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                if (webPage != null && (webPage.cached_page instanceof TL_iv.TL_page)) {
                    addPageToStack(webPage, str, 1);
                    return;
                } else {
                    if (((Boolean) callback0Return.run()).booleanValue()) {
                        return;
                    }
                    if (MessagesController.getInstance(this.currentAccount).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                        addPageToStack(tL_messages_getWebPage.url, 1);
                        return;
                    } else {
                        Browser.openUrl(this.parentActivity, tL_messages_getWebPage.url);
                        return;
                    }
                }
            }
            if (tLObject instanceof TLRPC.TL_webPage) {
                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                    addPageToStack(tL_webPage, str, 1);
                    return;
                }
            }
            if (((Boolean) callback0Return.run()).booleanValue()) {
                return;
            }
            if (MessagesController.getInstance(this.currentAccount).isWebBrowserOpenInApp(tL_messages_getWebPage.url)) {
                addPageToStack(tL_messages_getWebPage.url, 1);
            } else {
                Browser.openUrl(this.parentActivity, tL_messages_getWebPage.url);
            }
        }
    }

    public void lambda$openWebpageUrlInternal$13(int i, Browser.Progress progress) {
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
        } else if (i == NotificationCenter.messagePlayingProgressDidChanged) {
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
        } else {
            if (i != NotificationCenter.emojiLoaded || this.pages == null) {
                return;
            }
            int i9 = 0;
            while (true) {
                PageLayout[] pageLayoutArr4 = this.pages;
                if (i9 >= pageLayoutArr4.length) {
                    return;
                }
                int childCount4 = pageLayoutArr4[i9].listView.getChildCount();
                for (int i10 = 0; i10 < childCount4; i10++) {
                    View childAt4 = this.pages[i9].listView.getChildAt(i10);
                    if (childAt4 instanceof BlockTableCell) {
                        ((BlockTableCell) childAt4).tableLayout.invalidate();
                    } else {
                        childAt4.invalidate();
                    }
                }
                i9++;
            }
        }
    }

    public void updateThemeColors(float f) {
        refreshThemeColors();
        updatePaintColors(this);
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

    public static void updatePaintColors(IArticleViewer iArticleViewer) {
        TextPaint textPaint = listTextPointerPaint;
        if (textPaint != null) {
            textPaint.setColor(iArticleViewer.getTextColor());
        }
        TextPaint textPaint2 = listTextNumPaint;
        if (textPaint2 != null) {
            textPaint2.setColor(iArticleViewer.getTextColor());
        }
        TextPaint textPaint3 = embedPostAuthorPaint;
        if (textPaint3 != null) {
            textPaint3.setColor(iArticleViewer.getTextColor());
        }
        TextPaint textPaint4 = channelNamePaint;
        if (textPaint4 != null) {
            textPaint4.setColor(iArticleViewer.getTextColor());
        }
        TextPaint textPaint5 = channelNamePhotoPaint;
        if (textPaint5 != null) {
            textPaint5.setColor(-1);
        }
        TextPaint textPaint6 = relatedArticleHeaderPaint;
        if (textPaint6 != null) {
            textPaint6.setColor(iArticleViewer.getTextColor());
        }
        TextPaint textPaint7 = relatedArticleTextPaint;
        if (textPaint7 != null) {
            textPaint7.setColor(iArticleViewer.getGrayTextColor());
        }
        TextPaint textPaint8 = embedPostDatePaint;
        if (textPaint8 != null) {
            textPaint8.setColor(iArticleViewer.getGrayTextColor());
        }
        createPaint(iArticleViewer, true);
        resources.updatePaintColors(iArticleViewer);
    }

    public void setParentActivity(final Activity activity, BaseFragment baseFragment) {
        Sheet sheet;
        WindowVisibilityManager.Controller controller = this.activityVisibilityController;
        if (controller != null) {
            controller.destroy();
            this.activityVisibilityController = null;
        }
        this.activityVisibilityController = LaunchActivity.obtainActivityVisibilityController();
        this.parentFragment = baseFragment;
        int currentAccount = (baseFragment == null || (baseFragment instanceof EmptyBaseFragment)) ? UserConfig.selectedAccount : baseFragment.getCurrentAccount();
        this.currentAccount = currentAccount;
        NotificationCenter.getInstance(currentAccount).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.emojiLoaded);
        Activity activity2 = this.parentActivity;
        if (activity2 == activity || (activity2 != null && this.isSheet && (sheet = this.sheet) != null && sheet.dialog != null)) {
            updatePaintColors(this);
            refreshThemeColors();
            return;
        }
        this.parentActivity = activity;
        this.selectedFont = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
        createPaint(this, false);
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
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.AnonymousClass14.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
            }

            @Override
            public void invalidate() {
                super.invalidate();
            }
        };
        this.containerView = frameLayout;
        this.windowView.addView(frameLayout, LayoutHelper.createFrame(-1, -1, 51));
        if (this.sheet == null) {
            this.windowView.setFitsSystemWindows(true);
            this.containerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return ArticleViewer.lambda$setParentActivity$14(view, windowInsets);
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
            this.containerView.addView(pageLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            pageLayout.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
                @Override
                public final boolean onItemClick(View view, int i2) {
                    return this.f$0.lambda$setParentActivity$15(view, i2);
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
                    this.f$0.lambda$setParentActivity$18(pageLayout, view, i2, f, f2);
                }
            });
            i++;
        }
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.bulletinContainer = frameLayout3;
        FrameLayout frameLayout4 = this.containerView;
        Sheet sheet2 = this.sheet;
        frameLayout4.addView(frameLayout3, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, (sheet2 == null || sheet2.halfSize()) ? 0.0f : 56.0f, 0.0f, 0.0f));
        this.headerPaint.setColor(-16777216);
        this.statusBarPaint.setColor(-16777216);
        this.headerProgressPaint.setColor(-14408666);
        this.navigationBarPaint.setColor(-16777216);
        WebActionBar webActionBar = new WebActionBar(activity, getResourcesProvider()) {
            @Override
            protected void onSearchUpdated(String str) throws NoSuchFieldException, InterruptedException, SecurityException {
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

            @Override
            protected WebInstantView.Loader getInstantViewLoader() {
                return ArticleViewer.this.pages[0].loadInstant();
            }
        };
        this.actionBar = webActionBar;
        webActionBar.occupyStatusBar(this.sheet != null);
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        this.actionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$setParentActivity$24(activity, view);
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
                this.f$0.lambda$setParentActivity$25();
            }
        };
        this.actionBar.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) throws PackageManager.NameNotFoundException {
                this.f$0.lambda$setParentActivity$26(view);
            }
        });
        this.actionBar.backButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return this.f$0.lambda$setParentActivity$32(view);
            }
        });
        this.actionBar.setMenuListener(new Utilities.Callback() {
            @Override
            public final void run(Object obj) throws PackageManager.NameNotFoundException {
                this.f$0.lambda$setParentActivity$39(activity, (Integer) obj);
            }
        });
        this.actionBar.forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$setParentActivity$40(view);
            }
        });
        FrameLayout frameLayout5 = new FrameLayout(this.parentActivity) {
            @Override
            public void onDraw(Canvas canvas) {
                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                Theme.chat_composeShadowDrawable.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), Theme.chat_composeBackgroundPaint);
            }
        };
        this.searchPanel = frameLayout5;
        frameLayout5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ArticleViewer.lambda$setParentActivity$41(view, motionEvent);
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
                this.f$0.lambda$setParentActivity$42((Integer) obj);
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
            public final void onClick(View view) throws NoSuchFieldException, InterruptedException, SecurityException {
                this.f$0.lambda$setParentActivity$43(view);
            }
        });
        this.searchUpButton.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
        ImageView imageView4 = new ImageView(this.parentActivity);
        this.searchDownButton = imageView4;
        imageView4.setScaleType(scaleType);
        this.searchDownButton.setImageResource(R.drawable.msg_go_down);
        this.searchDownButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), mode));
        this.searchDownButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i3), 1));
        this.searchPanel.addView(this.searchDownButton, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.searchDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) throws NoSuchFieldException, InterruptedException, SecurityException {
                this.f$0.lambda$setParentActivity$44(view);
            }
        });
        this.searchDownButton.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
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
        layoutParams2.flags |= -2147417856;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 1;
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper();
        this.textSelectionHelper = articleTextSelectionHelper;
        articleTextSelectionHelper.setParentView(this.pages[0].listView);
        if (MessagesController.getInstance(this.currentAccount).getTranslateController().isContextTranslateEnabled()) {
            this.textSelectionHelper.setOnTranslate(new TextSelectionHelper.OnTranslateListener() {
                @Override
                public final void run(CharSequence charSequence, String str, String str2, Runnable runnable) {
                    this.f$0.lambda$setParentActivity$45(charSequence, str, str2, runnable);
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
                    BulletinFactory.of(ArticleViewer.this.containerView, null).createCopyBulletin(LocaleController.getString(R.string.TextCopied)).show();
                }
            }
        });
        this.containerView.addView(this.textSelectionHelper.getOverlayView(activity));
        FrameLayout frameLayout6 = this.containerView;
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper(frameLayout6, frameLayout6);
        this.pinchToZoomHelper = pinchToZoomHelper;
        pinchToZoomHelper.setClipBoundsListener(new PinchToZoomHelper.ClipBoundsListener() {
            @Override
            public final void getClipTopBottom(float[] fArr) {
                this.f$0.lambda$setParentActivity$46(fArr);
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
        this.backgroundPaint.setColor(getThemedColor(Theme.key_iv_background));
        updatePaintColors(this);
    }

    public static WindowInsets lambda$setParentActivity$14(View view, WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public boolean lambda$setParentActivity$15(View view, int i) throws UnsupportedEncodingException {
        if (!(view instanceof BlockRelatedArticlesCell)) {
            return false;
        }
        BlockRelatedArticlesCell blockRelatedArticlesCell = (BlockRelatedArticlesCell) view;
        showCopyPopup(blockRelatedArticlesCell.currentBlock.parent.articles.get(blockRelatedArticlesCell.currentBlock.num).url);
        return true;
    }

    public void lambda$setParentActivity$18(PageLayout pageLayout, View view, int i, float f, float f2) {
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
                    if ((!reportCell.hasViews || f >= view.getMeasuredWidth() / 2) && !reportCell.web) {
                        TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat("previews");
                        if (!(userOrChat instanceof TLRPC.TL_user)) {
                            final int i2 = UserConfig.selectedAccount;
                            final long j = adapter.currentPage.id;
                            showProgressView(true, true);
                            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                            tL_contacts_resolveUsername.username = "previews";
                            this.previewsReqId = ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    this.f$0.lambda$setParentActivity$17(i2, j, tLObject, tL_error);
                                }
                            });
                            return;
                        }
                        openPreviewsChat((TLRPC.User) userOrChat, adapter.currentPage.id);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i < 0 || i >= adapter.localBlocks.size()) {
                return;
            }
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.localBlocks.get(i);
            TL_iv.PageBlock lastNonListPageBlock = getLastNonListPageBlock(pageBlock);
            if (lastNonListPageBlock instanceof TL_pageBlockDetailsChild) {
                lastNonListPageBlock = ((TL_pageBlockDetailsChild) lastNonListPageBlock).block;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockChannel) {
                MessagesController.getInstance(this.currentAccount).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) lastNonListPageBlock).channel), this.parentFragment, 2);
                close(false, true);
                return;
            }
            if (lastNonListPageBlock instanceof TL_pageBlockRelatedArticlesChild) {
                TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = (TL_pageBlockRelatedArticlesChild) lastNonListPageBlock;
                openWebpageUrl(tL_pageBlockRelatedArticlesChild.parent.articles.get(tL_pageBlockRelatedArticlesChild.num).url, null, null);
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockDetails) {
                View lastNonListCell = getLastNonListCell(view);
                if (lastNonListCell instanceof BlockDetailsCell) {
                    this.pressedLinkOwnerLayout = null;
                    this.pressedLinkOwnerView = null;
                    if (adapter.blocks.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) lastNonListPageBlock;
                    pageblockdetails.open = !pageblockdetails.open;
                    int itemCount = adapter.getItemCount();
                    adapter.updateRows();
                    int iAbs = Math.abs(adapter.getItemCount() - itemCount);
                    BlockDetailsCell blockDetailsCell = (BlockDetailsCell) lastNonListCell;
                    blockDetailsCell.arrow.setAnimationProgressAnimated(pageblockdetails.open ? 0.0f : 1.0f);
                    blockDetailsCell.invalidate();
                    if (iAbs != 0) {
                        if (pageblockdetails.open) {
                            adapter.notifyItemRangeInserted(i + 1, iAbs);
                        } else {
                            adapter.notifyItemRangeRemoved(i + 1, iAbs);
                        }
                    }
                }
            }
        }
    }

    public void lambda$setParentActivity$17(final int i, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setParentActivity$16(tLObject, i, j);
            }
        });
    }

    public void lambda$setParentActivity$16(TLObject tLObject, int i, long j) {
        if (this.previewsReqId == 0) {
            return;
        }
        this.previewsReqId = 0;
        showProgressView(true, false);
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(i).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesStorage.getInstance(i).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
            if (tL_contacts_resolvedPeer.users.isEmpty()) {
                return;
            }
            openPreviewsChat(tL_contacts_resolvedPeer.users.get(0), j);
        }
    }

    public void lambda$setParentActivity$24(final Activity activity, View view) {
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
                final String strMagic2tonsite = BotWebViewContainer.magic2tonsite(webView != null ? webView.getUrl() : null);
                AddressBarList addressBarList = this.addressBarList;
                Bitmap favicon = webView != null ? webView.getFavicon() : null;
                if (TextUtils.isEmpty(title)) {
                    title = LocaleController.getString(R.string.WebEmpty);
                }
                addressBarList.setCurrent(favicon, title, TextUtils.isEmpty(strMagic2tonsite) ? "about:blank" : strMagic2tonsite, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setParentActivity$19(strMagic2tonsite);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$setParentActivity$20(pageLayout, activity, (String) obj);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$setParentActivity$21((String) obj);
                    }
                }, new ArticleViewer$$ExternalSyntheticLambda35(this), new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        this.f$0.lambda$setParentActivity$22(strMagic2tonsite, pageLayout, view2);
                    }
                });
            }
            this.actionBar.showAddress("", new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ArticleViewer.lambda$setParentActivity$23(pageLayout, activity, (String) obj);
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

    public void lambda$setParentActivity$19(String str) {
        EditTextBoldCursor editTextBoldCursor = this.actionBar.addressEditText;
        if (TextUtils.isEmpty(str)) {
            str = "about:blank";
        }
        editTextBoldCursor.setText(str);
        EditTextBoldCursor editTextBoldCursor2 = this.actionBar.addressEditText;
        editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
        AndroidUtilities.showKeyboard(this.actionBar.addressEditText);
    }

    public void lambda$setParentActivity$20(PageLayout pageLayout, Activity activity, String str) {
        if (TextUtils.isEmpty(str) || pageLayout.getWebView() == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.trim());
        AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        int length = spannableStringBuilder.length();
        int iMax = 0;
        for (int i = 0; i < uRLSpanArr.length; i++) {
            length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i]), length);
            iMax = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i]), iMax);
        }
        this.actionBar.showAddress(false, true);
        Uri uriUriParseSafe = Utilities.uriParseSafe(str);
        if ((uRLSpanArr.length > 0 && length == 0 && iMax > 0) || (uriUriParseSafe != null && uriUriParseSafe.getScheme() != null)) {
            if (uriUriParseSafe != null && uriUriParseSafe.getScheme() == null && uriUriParseSafe.getHost() == null && uriUriParseSafe.getPath() != null) {
                str = Browser.replace(uriUriParseSafe, "https", null, uriUriParseSafe.getPath(), "/");
            }
            pageLayout.getWebView().loadUrl(str);
            return;
        }
        AddressBarList.pushRecentSearch(activity, str);
        pageLayout.getWebView().loadUrl(SearchEngine.getCurrent().getSearchURL(str));
    }

    public void lambda$setParentActivity$21(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.actionBar.addressEditText.setText(str);
        EditTextBoldCursor editTextBoldCursor = this.actionBar.addressEditText;
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
        AndroidUtilities.showKeyboard(this.actionBar.addressEditText);
    }

    public void lambda$setParentActivity$22(String str, PageLayout pageLayout, View view) {
        this.actionBar.showAddress(false, true);
        AndroidUtilities.hideKeyboard(this.actionBar.addressEditText);
        if (TextUtils.isEmpty(str)) {
            str = "about:blank";
        }
        AndroidUtilities.addToClipboard(str);
        BulletinFactory.of(pageLayout.webViewContainer, getResourcesProvider()).createCopyLinkBulletin().show(true);
    }

    public static void lambda$setParentActivity$23(PageLayout pageLayout, Activity activity, String str) {
        if (TextUtils.isEmpty(str) || pageLayout.getWebView() == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.trim());
        AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        int length = spannableStringBuilder.length();
        int iMax = 0;
        for (int i = 0; i < uRLSpanArr.length; i++) {
            length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i]), length);
            iMax = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i]), iMax);
        }
        Uri uriUriParseSafe = Utilities.uriParseSafe(str);
        if (uriUriParseSafe == null || !TextUtils.equals(uriUriParseSafe.getScheme(), "javascript")) {
            if ((uRLSpanArr.length > 0 && length == 0 && iMax > 0) || (uriUriParseSafe != null && uriUriParseSafe.getScheme() != null)) {
                if (uriUriParseSafe != null && uriUriParseSafe.getScheme() == null && uriUriParseSafe.getHost() == null && uriUriParseSafe.getPath() != null) {
                    str = Browser.replace(uriUriParseSafe, "https", null, uriUriParseSafe.getPath(), "/");
                }
                pageLayout.getWebView().loadUrl(str);
                return;
            }
            AddressBarList.pushRecentSearch(activity, str);
            pageLayout.getWebView().loadUrl(SearchEngine.getCurrent().getSearchURL(str));
        }
    }

    public void lambda$setParentActivity$25() {
        float currentProgress = 0.7f - this.actionBar.lineProgressView.getCurrentProgress();
        if (currentProgress > 0.0f) {
            float f = currentProgress < 0.25f ? 0.01f : 0.02f;
            LineProgressView lineProgressView = this.actionBar.lineProgressView;
            lineProgressView.setProgress(lineProgressView.getCurrentProgress() + f, true);
            AndroidUtilities.runOnUIThread(this.lineProgressTickRunnable, 100L);
        }
    }

    public void lambda$setParentActivity$26(View view) throws PackageManager.NameNotFoundException {
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

    public boolean lambda$setParentActivity$32(View view) {
        if (this.pages[0] == null) {
            return false;
        }
        final float rotation = this.actionBar.backButtonDrawable.getRotation();
        Sheet sheet = this.sheet;
        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(sheet != null ? sheet.windowView : this.windowView, view);
        int color = SharedConfig.adaptableColorInBrowser ? Theme.getColor(Theme.key_iv_background) : this.pages[0].getBackgroundColor();
        int color2 = SharedConfig.adaptableColorInBrowser ? Theme.getColor(Theme.key_windowBackgroundWhiteBlackText) : AndroidUtilities.computePerceivedBrightness(this.pages[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
        int iMultAlpha = Theme.multAlpha(color2, 0.65f);
        final BotWebViewContainer.MyWebView webView = this.pages[0].getWebView();
        int i = 3;
        if (webView != null) {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            final int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            if (webBackForwardListCopyBackForwardList.getCurrentIndex() > 0) {
                final int i2 = 0;
                while (i2 < currentIndex) {
                    WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i2);
                    itemOptionsMakeOptions.add(itemAtIndex.getTitle(), new Runnable() {
                        @Override
                        public final void run() {
                            ArticleViewer.lambda$setParentActivity$27(currentIndex, i2, webView);
                        }
                    });
                    ActionBarMenuSubItem last = itemOptionsMakeOptions.getLast();
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
                        last.setSubtextColor(iMultAlpha);
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
                itemOptionsMakeOptions.add(cachedWeb.getTitle(), new Runnable() {
                    @Override
                    public final void run() throws PackageManager.NameNotFoundException {
                        this.f$0.lambda$setParentActivity$28(size);
                    }
                });
                ActionBarMenuSubItem last2 = itemOptionsMakeOptions.getLast();
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
                    last2.setSubtextColor(iMultAlpha);
                    last2.setColors(color2, color2);
                }
            } else if (obj instanceof TLRPC.WebPage) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                itemOptionsMakeOptions.add(webPage.title, new Runnable() {
                    @Override
                    public final void run() throws PackageManager.NameNotFoundException {
                        this.f$0.lambda$setParentActivity$29(size);
                    }
                });
                ActionBarMenuSubItem last3 = itemOptionsMakeOptions.getLast();
                if (last3 != null) {
                    last3.setTextAndIcon(webPage.title, R.drawable.msg_instant);
                    last3.setTextColor(color2);
                    if (!TextUtils.isEmpty(webPage.site_name)) {
                        last3.setSubtext(webPage.site_name);
                    }
                    last3.setSubtextColor(iMultAlpha);
                    last3.imageView.getLayoutParams().width = AndroidUtilities.dp(24.0f);
                    last3.imageView.setScaleX(1.45f);
                    last3.imageView.setScaleY(1.45f);
                    last3.setColors(color2, color2);
                }
            }
        }
        itemOptionsMakeOptions.setScrimViewBackground(Theme.createCircleDrawable(AndroidUtilities.dp(40.0f), this.actionBar.getBackgroundColor()));
        itemOptionsMakeOptions.setBackgroundColor(color);
        itemOptionsMakeOptions.updateColors();
        if (itemOptionsMakeOptions.getItemsCount() <= 0) {
            return false;
        }
        checkScrollAnimated(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setParentActivity$31(itemOptionsMakeOptions, rotation);
            }
        });
        return true;
    }

    public static void lambda$setParentActivity$27(int i, int i2, BotWebViewContainer.MyWebView myWebView) {
        for (int i3 = 0; i3 < i - i2; i3++) {
            myWebView.goBack();
        }
    }

    public void lambda$setParentActivity$31(ItemOptions itemOptions, final float f) {
        this.actionBar.backButtonDrawable.setRotation(0.0f, true);
        itemOptions.setOnDismiss(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setParentActivity$30(f);
            }
        });
        itemOptions.show();
    }

    public void lambda$setParentActivity$30(float f) {
        this.actionBar.backButtonDrawable.setRotation(f, true);
    }

    public void lambda$setParentActivity$39(Activity activity, Integer num) throws PackageManager.NameNotFoundException {
        WebInstantView.Loader loader;
        final String url;
        File file;
        String url2;
        FrameLayout frameLayout;
        String url3;
        if ((this.pages[0].isArticle() && this.pages[0].adapter.currentPage == null) || this.parentActivity == null) {
            return;
        }
        if (num.intValue() == 1) {
            WebActionBar webActionBar = this.actionBar;
            int iDp = AndroidUtilities.dp(56.0f);
            this.currentHeaderHeight = iDp;
            webActionBar.setHeight(iDp);
            this.actionBar.showSearch(true, true);
            return;
        }
        String openURL = null;
        openURL = null;
        if (num.intValue() == 2) {
            if (this.pages[0].isWeb()) {
                if (this.pages[0].getWebView() == null) {
                    return;
                } else {
                    url3 = this.pages[0].getWebView().getUrl();
                }
            } else if (this.pages[0].adapter.currentPage == null) {
                return;
            } else {
                url3 = this.pages[0].adapter.currentPage.url;
            }
            String strMagic2tonsite = BotWebViewContainer.magic2tonsite(url3);
            showDialog(new ShareAlert(this.parentActivity, null, strMagic2tonsite, false, strMagic2tonsite, false, AndroidUtilities.computePerceivedBrightness(this.actionBar.getBackgroundColor()) < 0.721f ? new DarkThemeResourceProvider() : null));
            return;
        }
        if (num.intValue() == 6) {
            if (this.pages[0].isWeb()) {
                if (this.pages[0].getWebView() == null) {
                    return;
                }
                url2 = this.pages[0].getWebView().getUrl();
                frameLayout = this.pages[0].webViewContainer;
            } else {
                if (this.pages[0].adapter.currentPage == null) {
                    return;
                }
                url2 = this.pages[0].adapter.currentPage.url;
                frameLayout = this.pages[0];
            }
            addBookmark(url2, this.currentAccount, frameLayout, this.sheet, getResourcesProvider());
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
                        this.f$0.lambda$setParentActivity$33();
                    }
                } : null, new ArticleViewer$$ExternalSyntheticLambda35(this)), bottomSheetParams);
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
                        this.f$0.lambda$setParentActivity$34();
                    }
                } : null, new ArticleViewer$$ExternalSyntheticLambda42(this)), bottomSheetParams2);
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
                url = this.pages[0].getWebView().getUrl();
                file = null;
                openURL = this.pages[0].getWebView().getOpenURL();
            } else {
                if (this.pages[0].adapter.currentPage == null) {
                    return;
                }
                url = this.pages[0].adapter.currentPage.url;
                file = this.pages[0].adapter.currentPage.cached_page != null ? this.pages[0].adapter.currentPage.cached_page.local : null;
            }
            Activity activity2 = this.parentActivity;
            if (activity2 == null || activity2.isFinishing()) {
                return;
            }
            if (file != null) {
                AndroidUtilities.openForView(file, null, "text/markdown", this.parentActivity, getResourcesProvider(), true);
                return;
            }
            if (url == null) {
                return;
            }
            final String hostAuthority = AndroidUtilities.getHostAuthority(openURL, true);
            final String hostAuthority2 = AndroidUtilities.getHostAuthority(url, true);
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setParentActivity$35(url);
                }
            };
            final Utilities.Callback callback = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$setParentActivity$36(hostAuthority2, hostAuthority, (Boolean) obj);
                }
            };
            if (this.pages[0].isWeb() && MessagesController.getInstance(this.currentAccount).isWebBrowserOpenInApp(hostAuthority2)) {
                AlertsCreator.showOpenExternalBrowserAlert(activity, getResourcesProvider(), url, true, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        ArticleViewer.lambda$setParentActivity$37(callback, runnable, (Boolean) obj, (Boolean) obj2);
                    }
                });
                return;
            } else {
                runnable.run();
                return;
            }
        }
        if (num.intValue() == 4) {
            if (this.pages[0].isWeb()) {
                openWebSettings();
                return;
            }
            BottomSheet.Builder builder = new BottomSheet.Builder(this.parentActivity);
            builder.setApplyTopPadding(false);
            LinearLayout linearLayout = new LinearLayout(this.parentActivity);
            linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
            linearLayout.setOrientation(1);
            HeaderCell headerCell = new HeaderCell(this.parentActivity, getResourcesProvider());
            headerCell.setText(LocaleController.getString(R.string.FontSize));
            linearLayout.addView(headerCell, LayoutHelper.createLinear(-2, -2, 51, 3, 1, 3, 0));
            linearLayout.addView(new TextSizeCell(this.parentActivity), LayoutHelper.createLinear(-1, -2, 51, 3, 0, 3, 0));
            HeaderCell headerCell2 = new HeaderCell(this.parentActivity, getResourcesProvider());
            headerCell2.setText(LocaleController.getString(R.string.FontType));
            linearLayout.addView(headerCell2, LayoutHelper.createLinear(-2, -2, 51, 3, 4, 3, 2));
            int i = 0;
            while (i < 2) {
                this.fontCells[i] = new FontCell(this.parentActivity);
                if (i == 0) {
                    this.fontCells[i].setTextAndTypeface(LocaleController.getString(R.string.Default), Typeface.DEFAULT);
                } else if (i == 1) {
                    this.fontCells[i].setTextAndTypeface("Serif", Typeface.SERIF);
                }
                this.fontCells[i].select(i == this.selectedFont, false);
                this.fontCells[i].setTag(Integer.valueOf(i));
                this.fontCells[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$setParentActivity$38(view);
                    }
                });
                linearLayout.addView(this.fontCells[i], LayoutHelper.createLinear(-1, 50));
                i++;
            }
            builder.setCustomView(linearLayout);
            BottomSheet bottomSheetCreate = builder.create();
            this.linkSheet = bottomSheetCreate;
            showDialog(bottomSheetCreate);
            return;
        }
        if (num.intValue() == 5) {
            if (!this.pages[0].isWeb() || this.pages[0].getWebView() == null) {
                return;
            }
            this.pages[0].getWebView().reload();
            return;
        }
        if (num.intValue() != 10 || (loader = this.pages[0].currentInstantLoader) == null || loader.getWebPage() == null) {
            return;
        }
        addPageToStack(loader.getWebPage(), null, 1);
    }

    public void lambda$setParentActivity$33() {
        this.sheet.dismiss(true);
    }

    public void lambda$setParentActivity$34() {
        this.sheet.dismiss(true);
    }

    public void lambda$setParentActivity$35(String str) {
        Browser.openInExternalBrowser(this.parentActivity, str, false);
    }

    public void lambda$setParentActivity$36(String str, String str2, Boolean bool) {
        MessagesController.getInstance(this.currentAccount).addWebBrowserException(str, true);
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, str)) {
            MessagesController.getInstance(this.currentAccount).addWebBrowserException(str2, true);
        }
        if (!bool.booleanValue()) {
            showRestrictedWebsiteToast();
        } else {
            LaunchActivity.whenResumed = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.showRestrictedWebsiteToast();
                }
            };
        }
    }

    public static void lambda$setParentActivity$37(Utilities.Callback callback, Runnable runnable, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            if (bool2.booleanValue()) {
                callback.run(Boolean.TRUE);
            }
            runnable.run();
        }
    }

    public void lambda$setParentActivity$38(View view) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        this.selectedFont = iIntValue;
        int i = 0;
        int i2 = 0;
        while (i2 < 2) {
            this.fontCells[i2].select(i2 == iIntValue, true);
            i2++;
        }
        resources.updatePaintFonts(this.selectedFont);
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

    public void lambda$setParentActivity$43(View view) throws NoSuchFieldException, InterruptedException, SecurityException {
        if (this.pages[0].isWeb()) {
            if (this.pages[0].getWebView() != null) {
                this.pages[0].getWebView().findNext(false);
                return;
            }
            return;
        }
        scrollToSearchIndex(this.currentSearchIndex - 1);
    }

    public void lambda$setParentActivity$44(View view) throws NoSuchFieldException, InterruptedException, SecurityException {
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

    public static void addBookmark(String str, int i, FrameLayout frameLayout, final Sheet sheet, Theme.ResourcesProvider resourcesProvider) {
        String strMagic2tonsite = BotWebViewContainer.magic2tonsite(str);
        final long clientUserId = UserConfig.getInstance(i).getClientUserId();
        SendMessagesHelper.getInstance(i).sendMessage(SendMessagesHelper.SendMessageParams.of(strMagic2tonsite, clientUserId));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        tL_peerUser.user_id = clientUserId;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser2;
        tL_peerUser2.user_id = clientUserId;
        tL_message.message = strMagic2tonsite;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
        tL_message.media = tL_messageMediaWebPage;
        tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
        TLRPC.WebPage webPage = tL_message.media.webpage;
        webPage.url = strMagic2tonsite;
        webPage.display_url = strMagic2tonsite;
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.bookmarkAdded, new MessageObject(i, tL_message, false, false));
        BulletinFactory.of(frameLayout, resourcesProvider).createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.lambda$addBookmark$47(sheet, clientUserId);
            }
        })).show(true);
    }

    public static void lambda$addBookmark$47(Sheet sheet, long j) {
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
                this.f$0.openWebSettings();
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
            safeLastFragment.showAsSheet(new WebBrowserSettings(new ArticleViewer$$ExternalSyntheticLambda42(this)), bottomSheetParams);
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
        boolean zIsVisibleOrAnimating = PhotoViewer.getInstance().isVisibleOrAnimating();
        if (zIsVisibleOrAnimating || ((blockVideoCell = this.currentPlayer) != null && blockVideoCell != blockVideoCell2 && this.videoPlayer != null)) {
            if (this.videoPlayer != null) {
                LongSparseArray longSparseArray = this.videoStates;
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
        if (zIsVisibleOrAnimating || blockVideoCell2 == null) {
            return;
        }
        blockVideoCell2.startVideoPlayer();
        this.currentPlayer = blockVideoCell2;
    }

    public void updateSearchButtons() {
        int searchIndex;
        int size;
        if (this.searchResults != null || this.pages[0].isWeb()) {
            if (this.pages[0].isWeb()) {
                searchIndex = this.pages[0].getWebView() == null ? 0 : this.pages[0].getWebView().getSearchIndex();
                size = this.pages[0].getWebView() == null ? 0 : this.pages[0].getWebView().getSearchCount();
            } else {
                searchIndex = this.currentSearchIndex;
                size = this.searchResults.size();
            }
            this.searchUpButton.setEnabled(size > 0 && searchIndex != 0);
            this.searchDownButton.setEnabled(size > 0 && searchIndex != size + (-1));
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
                this.searchCountText.setText(LocaleController.getString(R.string.NoResult));
            } else if (size == 1) {
                this.searchCountText.setText(LocaleController.getString(R.string.OneResult));
            } else {
                this.searchCountText.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(searchIndex + 1), Integer.valueOf(size)));
            }
        }
    }

    public static class SearchResult {
        private TL_iv.PageBlock block;
        private int index;
        private Object text;
    }

    public void processSearch(final String str) throws NoSuchFieldException, InterruptedException, SecurityException {
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
                            this.f$0.updateSearchButtons();
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
                        this.f$0.updateSearchButtons();
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
                this.f$0.lambda$processSearch$50(str, i);
            }
        };
        this.searchRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 400L);
    }

    public void lambda$processSearch$50(final String str, final int i) {
        final HashMap map = new HashMap(this.pages[0].adapter.textToBlocks);
        final ArrayList arrayList = new ArrayList(this.pages[0].adapter.textBlocks);
        this.searchRunnable = null;
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processSearch$49(arrayList, map, str, i);
            }
        });
    }

    public void lambda$processSearch$49(java.util.ArrayList r18, java.util.HashMap r19, final java.lang.String r20, final int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.lambda$processSearch$49(java.util.ArrayList, java.util.HashMap, java.lang.String, int):void");
    }

    public void lambda$processSearch$48(int i, ArrayList arrayList, String str) throws NoSuchFieldException, InterruptedException, SecurityException {
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
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.searchPanelAlpha, z ? 1.0f : 0.0f);
        this.searchPanelAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$showSearchPanel$51(valueAnimator2);
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

    public void lambda$showSearchPanel$51(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.searchPanelAlpha = fFloatValue;
        this.searchPanel.setTranslationY(this.searchPanelTranslation + ((1.0f - fFloatValue) * AndroidUtilities.dp(51.0f)));
    }

    private void scrollToSearchIndex(int r13) throws java.lang.NoSuchFieldException, java.lang.InterruptedException, java.lang.SecurityException {
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
                this.f$0.lambda$checkScrollAnimated$52(valueAnimator);
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

    public void lambda$checkScrollAnimated$52(ValueAnimator valueAnimator) {
        setCurrentHeaderHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public void setCurrentHeaderHeight(int i) {
        WebActionBar webActionBar = this.actionBar;
        if (webActionBar == null || webActionBar.isSearching() || this.actionBar.isAddressing()) {
            return;
        }
        int iClamp = Utilities.clamp(i, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(24.0f));
        this.currentHeaderHeight = iClamp;
        this.actionBar.setHeight(iClamp);
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

    private void openPreviewsChat(TLRPC.User user, long j) {
        if (user == null || !(this.parentActivity instanceof LaunchActivity)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putString("botUser", "webpage" + j);
        ((LaunchActivity) this.parentActivity).presentFragment(new ChatActivity(bundle), false, true);
        close(false, true);
    }

    public boolean open(MessageObject messageObject) {
        return open(messageObject, null, null, null, null);
    }

    public boolean open(MessageObject messageObject, TLRPC.WebPage webPage) {
        return open(messageObject, webPage, null, null, null);
    }

    public boolean open(TLRPC.TL_webPage tL_webPage, String str) {
        return open(null, tL_webPage, str, null, null);
    }

    public boolean open(String str) {
        return open(null, null, null, str, null);
    }

    public boolean open(String str, Browser.Progress progress) {
        return open(null, null, null, str, progress);
    }

    private boolean open(final MessageObject messageObject, TLRPC.WebPage webPage, String str, String str2, Browser.Progress progress) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        final TLRPC.WebPage webPage2;
        String strSubstring;
        boolean z;
        int iLastIndexOf;
        String lowerCase;
        TL_iv.Page page;
        if (this.parentActivity == null || (this.sheet == null && this.isVisible && !this.collapsed)) {
            return false;
        }
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null && (baseFragment.getParentLayout() instanceof ActionBarLayout)) {
            AndroidUtilities.hideKeyboard((ActionBarLayout) this.parentFragment.getParentLayout());
        }
        if (messageObject != null) {
            TLRPC.WebPage webPage3 = webPage == null ? messageObject.messageOwner.media.webpage : webPage;
            z = (webPage3 == null || (page = webPage3.cached_page) == null || page.local == null) ? false : true;
            for (int i = 0; i < messageObject.messageOwner.entities.size(); i++) {
                TLRPC.MessageEntity messageEntity = messageObject.messageOwner.entities.get(i);
                if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                    try {
                        String str3 = messageObject.messageOwner.message;
                        int i2 = messageEntity.offset;
                        String lowerCase2 = str3.substring(i2, messageEntity.length + i2).toLowerCase();
                        if (!TextUtils.isEmpty(webPage3.cached_page.url)) {
                            lowerCase = webPage3.cached_page.url.toLowerCase();
                        } else {
                            lowerCase = webPage3.url.toLowerCase();
                        }
                        if (lowerCase2.contains(lowerCase) || lowerCase.contains(lowerCase2)) {
                            int iLastIndexOf2 = lowerCase2.lastIndexOf(35);
                            if (iLastIndexOf2 == -1) {
                                break;
                            }
                            strSubstring = lowerCase2.substring(iLastIndexOf2 + 1);
                            webPage2 = webPage3;
                            break;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            webPage2 = webPage3;
            strSubstring = null;
        } else {
            if (str == null || (iLastIndexOf = str.lastIndexOf(35)) == -1) {
                webPage2 = webPage;
                strSubstring = null;
            } else {
                strSubstring = str.substring(iLastIndexOf + 1);
                webPage2 = webPage;
            }
            z = false;
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
        if (webPage2 != null) {
            boolean zAddPageToStack = addPageToStack(webPage2, strSubstring, i3);
            if (!z) {
                if (zAddPageToStack || strSubstring == null) {
                    strSubstring = null;
                }
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                tL_messages_getWebPage.url = webPage2.url;
                TL_iv.Page page2 = webPage2.cached_page;
                if ((page2 instanceof TL_iv.TL_pagePart_layer82) || page2.part) {
                    tL_messages_getWebPage.hash = 0;
                } else {
                    tL_messages_getWebPage.hash = webPage2.hash;
                }
                final int i4 = messageObject != null ? messageObject.currentAccount : UserConfig.selectedAccount;
                final boolean z2 = i3;
                final String str4 = strSubstring;
                ConnectionsManager.getInstance(i4).sendRequest(tL_messages_getWebPage, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$open$54(i4, webPage2, messageObject, z2, str4, tLObject, tL_error);
                    }
                });
            }
        } else {
            addPageToStack(str2, i3);
        }
        WebActionBar webActionBar = this.actionBar;
        if (webActionBar != null && i3 == 0) {
            webActionBar.setIsLocal(this.pages[0].isLocal());
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
                WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
                layoutParams.flags = -2013200384;
                if (Build.VERSION.SDK_INT >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
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
                        this.f$0.lambda$open$55();
                    }
                };
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.interpolator);
                animatorSet.addListener(new AnonymousClass26());
                this.transitionAnimationStartTime = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$open$56(animatorSet);
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

    public void lambda$open$54(final int i, final TLRPC.WebPage webPage, final MessageObject messageObject, final boolean z, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws NoSuchFieldException, InterruptedException, PackageManager.NameNotFoundException, SecurityException {
                this.f$0.lambda$open$53(tLObject, i, webPage, messageObject, z, str);
            }
        });
    }

    public void lambda$open$53(TLObject tLObject, int i, TLRPC.WebPage webPage, MessageObject messageObject, boolean z, String str) throws NoSuchFieldException, InterruptedException, PackageManager.NameNotFoundException, SecurityException {
        TL_iv.Page page;
        TLObject tLObject2 = tLObject;
        int i2 = 0;
        if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
            MessagesController.getInstance(i).putUsers(tL_messages_webPage.users, false);
            MessagesController.getInstance(i).putChats(tL_messages_webPage.chats, false);
            tLObject2 = tL_messages_webPage.webpage;
        }
        if (tLObject2 instanceof TLRPC.TL_webPage) {
            TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
            if (tL_webPage.cached_page == null) {
                return;
            }
            if (!this.pagesStack.isEmpty() && this.pagesStack.get(0) == webPage) {
                if (messageObject != null) {
                    messageObject.messageOwner.media.webpage = tL_webPage;
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    tL_messages_messages.messages.add(messageObject.messageOwner);
                    MessagesStorage.getInstance(i).putMessages((TLRPC.messages_Messages) tL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                }
                if (z) {
                    this.pagesStack.add(tL_webPage);
                } else {
                    this.pagesStack.set(0, tL_webPage);
                }
                if (this.pagesStack.size() == 1) {
                    ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tL_webPage.id).commit();
                    updateInterfaceForCurrentPage(tL_webPage, false, z ? 1 : 0);
                    if (str != null) {
                        scrollToAnchor(str, false);
                    }
                }
            }
            LongSparseArray longSparseArray = new LongSparseArray(1);
            longSparseArray.put(tL_webPage.id, tL_webPage);
            MessagesStorage.getInstance(i).putWebPages(longSparseArray);
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_webPageNotModified) {
            TLRPC.TL_webPageNotModified tL_webPageNotModified = (TLRPC.TL_webPageNotModified) tLObject2;
            if (webPage == null || (page = webPage.cached_page) == null) {
                return;
            }
            int i3 = page.views;
            int i4 = tL_webPageNotModified.cached_page_views;
            if (i3 != i4) {
                page.views = i4;
                page.flags |= 8;
                while (true) {
                    PageLayout[] pageLayoutArr = this.pages;
                    if (i2 >= pageLayoutArr.length) {
                        break;
                    }
                    if (pageLayoutArr[i2].adapter.currentPage == webPage) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.pages[i2].listView.findViewHolderForAdapterPosition(this.pages[i2].adapter.getItemCount() - 1);
                        if (viewHolderFindViewHolderForAdapterPosition != null) {
                            this.pages[i2].adapter.onViewAttachedToWindow(viewHolderFindViewHolderForAdapterPosition);
                        }
                    }
                    i2++;
                }
                if (messageObject != null) {
                    TLRPC.TL_messages_messages tL_messages_messages2 = new TLRPC.TL_messages_messages();
                    tL_messages_messages2.messages.add(messageObject.messageOwner);
                    MessagesStorage.getInstance(i).putMessages((TLRPC.messages_Messages) tL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled ? 1 : 0, 0L);
                }
            }
        }
    }

    public void lambda$open$55() {
        FrameLayout frameLayout = this.containerView;
        if (frameLayout == null || this.windowView == null) {
            return;
        }
        frameLayout.setLayerType(0, null);
        this.animationInProgress = 0;
        AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
    }

    class AnonymousClass26 extends AnimatorListenerAdapter {
        AnonymousClass26() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onAnimationEnd$0();
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

    public void lambda$open$56(AnimatorSet animatorSet) {
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
        int iFindFirstVisibleItemPosition;
        if (this.pages[0].adapter.currentPage == null || (iFindFirstVisibleItemPosition = this.pages[0].layoutManager.findFirstVisibleItemPosition()) == -1) {
            return;
        }
        View viewFindViewByPosition = this.pages[0].layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        int top = viewFindViewByPosition != null ? viewFindViewByPosition.getTop() : 0;
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit();
        String str = "article" + this.pages[0].adapter.currentPage.id;
        SharedPreferences.Editor editorPutInt = editorEdit.putInt(str, iFindFirstVisibleItemPosition).putInt(str + "o", top);
        String str2 = str + "r";
        Point point = AndroidUtilities.displaySize;
        editorPutInt.putBoolean(str2, point.x > point.y).commit();
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
        this.backgroundPaint.setColor(getThemedColor(Theme.key_iv_background));
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
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.emojiLoaded);
        WindowVisibilityManager.Controller controller = this.activityVisibilityController;
        if (controller != null) {
            controller.destroy();
            this.activityVisibilityController = null;
        }
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
            public final void run() throws PackageManager.NameNotFoundException {
                this.f$0.lambda$close$57();
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
            BlockVideoCellState blockVideoCellState = (BlockVideoCellState) this.videoStates.valueAt(i);
            Bitmap bitmap = blockVideoCellState.lastFrameBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                blockVideoCellState.lastFrameBitmap = null;
            }
        }
        this.videoStates.clear();
    }

    public void lambda$close$57() throws PackageManager.NameNotFoundException {
        FrameLayout frameLayout = this.containerView;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setLayerType(0, null);
        this.animationInProgress = 0;
        onClosed();
    }

    public void onClosed() throws PackageManager.NameNotFoundException {
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
            ((BlockEmbedCell) this.createdWebViews.get(i2)).destroyWebView(false);
        }
        this.containerView.post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onClosed$58();
            }
        });
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
    }

    public void lambda$onClosed$58() {
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void loadChannel(final IArticleViewer iArticleViewer, final BlockChannelCell blockChannelCell, final WebpageAdapter webpageAdapter, TLRPC.Chat chat) {
        if (iArticleViewer.loadingChannel || !ChatObject.isPublic(chat)) {
            return;
        }
        iArticleViewer.loadingChannel = true;
        final int currentAccount = iArticleViewer.getCurrentAccount();
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = chat.username;
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_contacts_resolveUsername, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArticleViewer.lambda$loadChannel$60(iArticleViewer, webpageAdapter, currentAccount, blockChannelCell, tLObject, tL_error);
            }
        });
    }

    public static void lambda$loadChannel$60(final IArticleViewer iArticleViewer, final WebpageAdapter webpageAdapter, final int i, final BlockChannelCell blockChannelCell, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.lambda$loadChannel$59(iArticleViewer, webpageAdapter, tL_error, tLObject, i, blockChannelCell);
            }
        });
    }

    public static void lambda$loadChannel$59(IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, TLRPC.TL_error tL_error, TLObject tLObject, int i, BlockChannelCell blockChannelCell) {
        iArticleViewer.loadingChannel = false;
        if (webpageAdapter.blocks.isEmpty()) {
            return;
        }
        if (tL_error == null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.chats.isEmpty()) {
                MessagesController.getInstance(i).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                iArticleViewer.loadedChannel = chat;
                if (chat.left && !chat.kicked) {
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

    public static void joinChannel(final int i, final BlockChannelCell blockChannelCell, final TLRPC.Chat chat) {
        final TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
        tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_channels_joinChannel, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ArticleViewer.lambda$joinChannel$65(blockChannelCell, i, tL_channels_joinChannel, chat, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void lambda$joinChannel$65(final BlockChannelCell blockChannelCell, final int i, final TLRPC.TL_channels_joinChannel tL_channels_joinChannel, final TLRPC.Chat chat, TLRPC.ChatInviteJoinResult chatInviteJoinResult, final TLRPC.TL_error tL_error) {
        boolean z;
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.lambda$joinChannel$61(blockChannelCell, i, tL_error, tL_channels_joinChannel);
                }
            });
            return;
        }
        boolean z2 = false;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            int i2 = 0;
            while (true) {
                if (i2 >= updates.updates.size()) {
                    z = false;
                    break;
                }
                TLRPC.Update update = updates.updates.get(i2);
                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                    z = true;
                    break;
                }
                i2++;
            }
            MessagesController.getInstance(i).processUpdates(updates, false);
            z2 = z;
        } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            final TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.lambda$joinChannel$62(i, tL_chatInviteJoinResultWebView, chat);
                }
            });
            z2 = true;
        }
        if (!z2) {
            MessagesController.getInstance(i).generateJoinMessage(chat.id, true);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                blockChannelCell.setState(2, false);
            }
        });
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.lambda$joinChannel$64(i, chat);
            }
        }, 1000L);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
        long j = chat.id;
        messagesStorage.updateDialogsWithDeletedMessages(-j, j, new ArrayList<>(), null);
    }

    public static void lambda$joinChannel$61(BlockChannelCell blockChannelCell, int i, TLRPC.TL_error tL_error, TLRPC.TL_channels_joinChannel tL_channels_joinChannel) {
        blockChannelCell.setState(0, false);
        AlertsCreator.processError(i, tL_error, null, tL_channels_joinChannel, Boolean.TRUE);
    }

    public static void lambda$joinChannel$62(int i, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, TLRPC.Chat chat) {
        MessagesController.getInstance(i).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(i).openGuardBotWebApp(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.webview);
    }

    public static void lambda$joinChannel$64(int i, TLRPC.Chat chat) {
        MessagesController.getInstance(i).loadFullChat(chat.id, 0, true);
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
            ((BlockEmbedCell) this.createdWebViews.get(i)).destroyWebView(true);
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
                    this.f$0.lambda$showDialog$66(dialogInterface);
                }
            });
            dialog.show();
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void lambda$showDialog$66(DialogInterface dialogInterface) {
        this.visibleDialog = null;
    }

    public static final class WebPageUtils {
        public static TLRPC.Photo getPhotoWithId(TLObject tLObject, long j) {
            if (tLObject instanceof TL_iv.RichMessage) {
                return getPhotoWithId((TL_iv.RichMessage) tLObject, j);
            }
            if (tLObject instanceof TL_iv.Page) {
                return getPhotoWithId((TL_iv.Page) tLObject, j);
            }
            if (tLObject instanceof TLRPC.WebPage) {
                return getPhotoWithId((TLRPC.WebPage) tLObject, j);
            }
            return null;
        }

        public static TLRPC.Photo getPhotoWithId(TL_iv.RichMessage richMessage, long j) {
            if (richMessage == null) {
                return null;
            }
            for (int i = 0; i < richMessage.photos.size(); i++) {
                TLRPC.Photo photo = richMessage.photos.get(i);
                if (photo.id == j) {
                    return photo;
                }
            }
            return null;
        }

        public static TLRPC.Photo getPhotoWithId(TL_iv.Page page, long j) {
            if (page == null) {
                return null;
            }
            for (int i = 0; i < page.photos.size(); i++) {
                TLRPC.Photo photo = page.photos.get(i);
                if (photo.id == j) {
                    return photo;
                }
            }
            return null;
        }

        public static TLRPC.Photo getPhotoWithId(TLRPC.WebPage webPage, long j) {
            if (webPage != null && webPage.cached_page != null) {
                TLRPC.Photo photo = webPage.photo;
                if (photo != null && photo.id == j) {
                    return photo;
                }
                for (int i = 0; i < webPage.cached_page.photos.size(); i++) {
                    TLRPC.Photo photo2 = webPage.cached_page.photos.get(i);
                    if (photo2.id == j) {
                        return photo2;
                    }
                }
            }
            return null;
        }

        public static TLRPC.Document getDocumentWithId(TLObject tLObject, long j) {
            if (tLObject instanceof TL_iv.RichMessage) {
                return getDocumentWithId((TL_iv.RichMessage) tLObject, j);
            }
            if (tLObject instanceof TLRPC.WebPage) {
                return getDocumentWithId((TLRPC.WebPage) tLObject, j);
            }
            return null;
        }

        public static TLRPC.Document getDocumentWithId(TL_iv.RichMessage richMessage, long j) {
            if (richMessage == null) {
                return null;
            }
            for (int i = 0; i < richMessage.documents.size(); i++) {
                TLRPC.Document document = richMessage.documents.get(i);
                if (document.id == j) {
                    return document;
                }
            }
            return null;
        }

        public static TLRPC.Document getDocumentWithId(TLRPC.WebPage webPage, long j) {
            if (webPage != null && webPage.cached_page != null) {
                TLRPC.Document document = webPage.document;
                if (document != null && document.id == j) {
                    return document;
                }
                for (int i = 0; i < webPage.cached_page.documents.size(); i++) {
                    TLRPC.Document document2 = webPage.cached_page.documents.get(i);
                    if (document2.id == j) {
                        return document2;
                    }
                }
            }
            return null;
        }

        public static boolean isVideo(TL_iv.RichMessage richMessage, TL_iv.PageBlock pageBlock) {
            TLRPC.Document documentWithId;
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentWithId = getDocumentWithId(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return false;
            }
            return MessageObject.isVideoDocument(documentWithId);
        }

        public static boolean isVideo(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
            TLRPC.Document documentWithId;
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentWithId = getDocumentWithId(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return false;
            }
            return MessageObject.isVideoDocument(documentWithId);
        }

        public static TLObject getMedia(TL_iv.RichMessage richMessage, TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return getPhotoWithId(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return getDocumentWithId(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
            return null;
        }

        public static TLObject getMedia(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return getPhotoWithId(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return getDocumentWithId(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
            return null;
        }

        public static File getMediaFile(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
            TLRPC.Document documentWithId;
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TLRPC.Photo photoWithId = getPhotoWithId(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (photoWithId == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize())) == null) {
                    return null;
                }
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(closestPhotoSizeWithSize, true);
            }
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentWithId = getDocumentWithId(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return null;
            }
            return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(documentWithId, true);
        }

        public static File getMediaFile(TL_iv.RichMessage richMessage, TL_iv.PageBlock pageBlock) {
            TLRPC.Document documentWithId;
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TLRPC.Photo photoWithId = getPhotoWithId(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (photoWithId == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize())) == null) {
                    return null;
                }
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(closestPhotoSizeWithSize, true);
            }
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentWithId = getDocumentWithId(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return null;
            }
            return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(documentWithId, true);
        }
    }

    @Override
    public WebpageAdapter getAdapter() {
        return this.pages[0].adapter;
    }

    public class WebpageAdapter extends RecyclerListView.SelectionAdapter {
        private TL_iv.pageBlockChannel channelBlock;
        private Context context;
        private TLRPC.WebPage currentPage;
        public int fullHeight;
        private boolean isRtl;
        public int[] itemHeights;
        private final boolean padding;
        public int[] sumItemHeights;
        private ArrayList localBlocks = new ArrayList();
        private ArrayList blocks = new ArrayList();
        private ArrayList photoBlocks = new ArrayList();
        private HashMap anchors = new HashMap();
        private HashMap anchorsOffset = new HashMap();
        private HashMap anchorsParent = new HashMap();
        private HashMap audioBlocks = new HashMap();
        private ArrayList audioMessages = new ArrayList();
        private HashMap textToBlocks = new HashMap();
        private ArrayList textBlocks = new ArrayList();
        private HashMap searchTextOffset = new HashMap();
        private final Runnable calculateContentHeightRunnable = new Runnable() {
            @Override
            public final void run() throws NoSuchFieldException, InterruptedException, SecurityException {
                this.f$0.lambda$new$1();
            }
        };

        public WebpageAdapter(Context context, boolean z) {
            this.context = context;
            this.padding = z;
        }

        public TLRPC.Photo getPhotoWithId(long j) {
            return WebPageUtils.getPhotoWithId(this.currentPage, j);
        }

        public TLRPC.Document getDocumentWithId(long j) {
            return WebPageUtils.getDocumentWithId(this.currentPage, j);
        }

        private void setRichTextParents(TL_iv.RichText richText, TL_iv.RichText richText2) {
            if (richText2 == null) {
                return;
            }
            richText2.parentRichText = richText;
            if (richText2 instanceof TL_iv.textFixed) {
                setRichTextParents(richText2, ((TL_iv.textFixed) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textItalic) {
                setRichTextParents(richText2, ((TL_iv.textItalic) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textBold) {
                setRichTextParents(richText2, ((TL_iv.textBold) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textUnderline) {
                setRichTextParents(richText2, ((TL_iv.textUnderline) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textStrike) {
                setRichTextParents(richText2, ((TL_iv.textStrike) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textEmail) {
                setRichTextParents(richText2, ((TL_iv.textEmail) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textPhone) {
                setRichTextParents(richText2, ((TL_iv.textPhone) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textUrl) {
                setRichTextParents(richText2, ((TL_iv.textUrl) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textConcat) {
                int size = richText2.texts.size();
                for (int i = 0; i < size; i++) {
                    setRichTextParents(richText2, richText2.texts.get(i));
                }
                return;
            }
            if (richText2 instanceof TL_iv.textSubscript) {
                setRichTextParents(richText2, ((TL_iv.textSubscript) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textSuperscript) {
                setRichTextParents(richText2, ((TL_iv.textSuperscript) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textMarked) {
                setRichTextParents(richText2, ((TL_iv.textMarked) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textSpoiler) {
                setRichTextParents(richText2, ((TL_iv.textSpoiler) richText2).text);
                return;
            }
            if (richText2 instanceof TL_iv.textAnchor) {
                TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText2;
                setRichTextParents(richText2, textanchor.text);
                String lowerCase = textanchor.name.toLowerCase();
                this.anchors.put(lowerCase, Integer.valueOf(this.blocks.size()));
                TL_iv.RichText richText3 = textanchor.text;
                if (richText3 instanceof TL_iv.textPlain) {
                    if (!TextUtils.isEmpty(((TL_iv.textPlain) richText3).text)) {
                        this.anchorsParent.put(lowerCase, textanchor);
                    }
                } else if (!(richText3 instanceof TL_iv.textEmpty)) {
                    this.anchorsParent.put(lowerCase, textanchor);
                }
                this.anchorsOffset.put(lowerCase, -1);
            }
        }

        private void addTextBlock(Object obj, TL_iv.PageBlock pageBlock) {
            if ((obj instanceof TL_iv.textEmpty) || this.textToBlocks.containsKey(obj)) {
                return;
            }
            this.textToBlocks.put(obj, pageBlock);
            this.textBlocks.add(obj);
        }

        private void setRichTextParents(TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                TL_iv.PageBlock pageBlock2 = (TL_iv.pageBlockEmbedPost) pageBlock;
                setRichTextParents(null, pageBlock2.caption.text);
                setRichTextParents(null, pageBlock2.caption.credit);
                addTextBlock(pageBlock2.caption.text, pageBlock2);
                addTextBlock(pageBlock2.caption.credit, pageBlock2);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                TL_iv.PageBlock pageBlock3 = (TL_iv.pageBlockParagraph) pageBlock;
                setRichTextParents(null, pageBlock3.text);
                addTextBlock(pageBlock3.text, pageBlock3);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockKicker) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.pageBlockKicker) pageBlock;
                setRichTextParents(null, pageBlock4.text);
                addTextBlock(pageBlock4.text, pageBlock4);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockFooter) {
                TL_iv.PageBlock pageBlock5 = (TL_iv.pageBlockFooter) pageBlock;
                setRichTextParents(null, pageBlock5.text);
                addTextBlock(pageBlock5.text, pageBlock5);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockHeader) {
                TL_iv.PageBlock pageBlock6 = (TL_iv.pageBlockHeader) pageBlock;
                setRichTextParents(null, pageBlock6.text);
                addTextBlock(pageBlock6.text, pageBlock6);
                return;
            }
            if (ArticleViewer.isHeadingBlock(pageBlock)) {
                TL_iv.RichText richText = pageBlock.text;
                setRichTextParents(null, richText);
                addTextBlock(richText, pageBlock);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.PageBlock pageBlock7 = (TL_iv.pageBlockPreformatted) pageBlock;
                setRichTextParents(null, pageBlock7.text);
                addTextBlock(pageBlock7.text, pageBlock7);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                TL_iv.PageBlock pageBlock8 = (TL_iv.pageBlockSubheader) pageBlock;
                setRichTextParents(null, pageBlock8.text);
                addTextBlock(pageBlock8.text, pageBlock8);
                return;
            }
            int i = 0;
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                setRichTextParents(null, pageblockslideshow.caption.text);
                setRichTextParents(null, pageblockslideshow.caption.credit);
                addTextBlock(pageblockslideshow.caption.text, pageblockslideshow);
                addTextBlock(pageblockslideshow.caption.credit, pageblockslideshow);
                int size = pageblockslideshow.items.size();
                while (i < size) {
                    setRichTextParents(pageblockslideshow.items.get(i));
                    i++;
                }
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.PageBlock pageBlock9 = (TL_iv.pageBlockPhoto) pageBlock;
                setRichTextParents(null, pageBlock9.caption.text);
                setRichTextParents(null, pageBlock9.caption.credit);
                addTextBlock(pageBlock9.caption.text, pageBlock9);
                addTextBlock(pageBlock9.caption.credit, pageBlock9);
                return;
            }
            if (pageBlock instanceof TL_pageBlockListItem) {
                TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) pageBlock;
                TL_iv.RichText richText2 = tL_pageBlockListItem.textItem;
                if (richText2 != null) {
                    setRichTextParents(null, richText2);
                    addTextBlock(tL_pageBlockListItem.textItem, tL_pageBlockListItem);
                    return;
                } else {
                    TL_iv.PageBlock pageBlock10 = tL_pageBlockListItem.blockItem;
                    if (pageBlock10 != null) {
                        setRichTextParents(pageBlock10);
                        return;
                    }
                    return;
                }
            }
            if (pageBlock instanceof TL_pageBlockOrderedListItem) {
                TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) pageBlock;
                TL_iv.RichText richText3 = tL_pageBlockOrderedListItem.textItem;
                if (richText3 != null) {
                    setRichTextParents(null, richText3);
                    addTextBlock(tL_pageBlockOrderedListItem.textItem, tL_pageBlockOrderedListItem);
                    return;
                } else {
                    TL_iv.PageBlock pageBlock11 = tL_pageBlockOrderedListItem.blockItem;
                    if (pageBlock11 != null) {
                        setRichTextParents(pageBlock11);
                        return;
                    }
                    return;
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                setRichTextParents(null, pageblockcollage.caption.text);
                setRichTextParents(null, pageblockcollage.caption.credit);
                addTextBlock(pageblockcollage.caption.text, pageblockcollage);
                addTextBlock(pageblockcollage.caption.credit, pageblockcollage);
                int size2 = pageblockcollage.items.size();
                while (i < size2) {
                    setRichTextParents(pageblockcollage.items.get(i));
                    i++;
                }
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                TL_iv.PageBlock pageBlock12 = (TL_iv.pageBlockEmbed) pageBlock;
                setRichTextParents(null, pageBlock12.caption.text);
                setRichTextParents(null, pageBlock12.caption.credit);
                addTextBlock(pageBlock12.caption.text, pageBlock12);
                addTextBlock(pageBlock12.caption.credit, pageBlock12);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                TL_iv.PageBlock pageBlock13 = (TL_iv.pageBlockSubtitle) pageBlock;
                setRichTextParents(null, pageBlock13.text);
                addTextBlock(pageBlock13.text, pageBlock13);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                setRichTextParents(null, pageblockblockquote.text);
                setRichTextParents(null, pageblockblockquote.caption);
                addTextBlock(pageblockblockquote.text, pageblockblockquote);
                addTextBlock(pageblockblockquote.caption, pageblockblockquote);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                setRichTextParents(null, pageblockdetails.title);
                addTextBlock(pageblockdetails.title, pageblockdetails);
                int size3 = pageblockdetails.blocks.size();
                while (i < size3) {
                    setRichTextParents(pageblockdetails.blocks.get(i));
                    i++;
                }
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.PageBlock pageBlock14 = (TL_iv.pageBlockVideo) pageBlock;
                setRichTextParents(null, pageBlock14.caption.text);
                setRichTextParents(null, pageBlock14.caption.credit);
                addTextBlock(pageBlock14.caption.text, pageBlock14);
                addTextBlock(pageBlock14.caption.credit, pageBlock14);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                setRichTextParents(null, pageblockpullquote.text);
                setRichTextParents(null, pageblockpullquote.caption);
                addTextBlock(pageblockpullquote.text, pageblockpullquote);
                addTextBlock(pageblockpullquote.caption, pageblockpullquote);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockAudio) {
                TL_iv.PageBlock pageBlock15 = (TL_iv.pageBlockAudio) pageBlock;
                setRichTextParents(null, pageBlock15.caption.text);
                setRichTextParents(null, pageBlock15.caption.credit);
                addTextBlock(pageBlock15.caption.text, pageBlock15);
                addTextBlock(pageBlock15.caption.credit, pageBlock15);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                setRichTextParents(null, pageblocktable.title);
                addTextBlock(pageblocktable.title, pageblocktable);
                int size4 = pageblocktable.rows.size();
                for (int i2 = 0; i2 < size4; i2++) {
                    TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i2);
                    int size5 = pagetablerow.cells.size();
                    for (int i3 = 0; i3 < size5; i3++) {
                        TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i3);
                        setRichTextParents(null, pagetablecell.text);
                        addTextBlock(pagetablecell.text, pageblocktable);
                    }
                }
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockTitle) {
                TL_iv.PageBlock pageBlock16 = (TL_iv.pageBlockTitle) pageBlock;
                setRichTextParents(null, pageBlock16.text);
                addTextBlock(pageBlock16.text, pageBlock16);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                setRichTextParents(((TL_iv.pageBlockCover) pageBlock).cover);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                TL_iv.pageBlockAuthorDate pageblockauthordate = (TL_iv.pageBlockAuthorDate) pageBlock;
                setRichTextParents(null, pageblockauthordate.author);
                addTextBlock(pageblockauthordate.author, pageblockauthordate);
            } else {
                if (pageBlock instanceof TL_iv.pageBlockMap) {
                    TL_iv.PageBlock pageBlock17 = (TL_iv.pageBlockMap) pageBlock;
                    setRichTextParents(null, pageBlock17.caption.text);
                    setRichTextParents(null, pageBlock17.caption.credit);
                    addTextBlock(pageBlock17.caption.text, pageBlock17);
                    addTextBlock(pageBlock17.caption.credit, pageBlock17);
                    return;
                }
                if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                    TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = (TL_iv.pageBlockRelatedArticles) pageBlock;
                    setRichTextParents(null, pageblockrelatedarticles.title);
                    addTextBlock(pageblockrelatedarticles.title, pageblockrelatedarticles);
                }
            }
        }

        public void addBlock(WebpageAdapter webpageAdapter, TL_iv.PageBlock pageBlock, int i, int i2, int i3) {
            TL_iv.pageBlockOrderedList pageblockorderedlist;
            TL_iv.PageListOrderedItem pageListOrderedItem;
            TL_iv.PageListOrderedItem pageListOrderedItem2;
            int i4;
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem;
            int i5;
            int i6;
            TL_iv.PageListItem pageListItem;
            int i7;
            int i8;
            TL_pageBlockListParent tL_pageBlockListParent;
            TL_iv.pageBlockList pageblocklist;
            String str;
            TL_pageBlockListItem tL_pageBlockListItem;
            int i9;
            int i10;
            int i11 = 0;
            int i12 = 1;
            boolean z = pageBlock instanceof TL_pageBlockDetailsChild;
            TL_iv.PageBlock pageBlock2 = z ? ((TL_pageBlockDetailsChild) pageBlock).block : pageBlock;
            if (!(pageBlock2 instanceof TL_iv.pageBlockList) && !(pageBlock2 instanceof TL_iv.pageBlockOrderedList)) {
                setRichTextParents(pageBlock2);
                addAllMediaFromBlock(webpageAdapter, pageBlock2);
            }
            TL_iv.PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(pageBlock2);
            if (lastNonListPageBlock instanceof TL_iv.pageBlockUnsupported) {
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockAnchor) {
                this.anchors.put(((TL_iv.pageBlockAnchor) lastNonListPageBlock).name.toLowerCase(), Integer.valueOf(this.blocks.size()));
                return;
            }
            if ((lastNonListPageBlock instanceof TL_iv.pageBlockTitle) || (lastNonListPageBlock instanceof TL_iv.pageBlockHeader) || ArticleViewer.isHeadingBlock(lastNonListPageBlock)) {
                String strReplaceAll = ArticleViewer.getPlainText(lastNonListPageBlock.text).toString().toLowerCase().replaceAll("[\\[\\]\\(\\)\\{\\}]", "").replaceAll(" ", "-");
                if (!this.anchors.containsKey(strReplaceAll)) {
                    this.anchors.put(strReplaceAll, Integer.valueOf(this.blocks.size()));
                }
            }
            boolean z2 = lastNonListPageBlock instanceof TL_iv.pageBlockList;
            if (!z2 && !(lastNonListPageBlock instanceof TL_iv.pageBlockOrderedList)) {
                this.blocks.add(pageBlock);
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockAudio) {
                TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) lastNonListPageBlock;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                int i13 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                lastNonListPageBlock.mid = i13;
                tL_message.id = i13;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long clientUserId = UserConfig.getInstance(ArticleViewer.this.currentAccount).getClientUserId();
                peer.user_id = clientUserId;
                tL_peerUser.user_id = clientUserId;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.webpage = this.currentPage;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = getDocumentWithId(pageblockaudio.audio_id);
                tL_message.flags |= 768;
                MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
                this.audioMessages.add(messageObject);
                this.audioBlocks.put(pageblockaudio, messageObject);
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
            if (lastNonListPageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) lastNonListPageBlock;
                if (pageblockblockquoteblocks.blocks.isEmpty()) {
                    return;
                }
                int iMax = Math.max(0, lastNonListPageBlock.level);
                int i14 = lastNonListPageBlock.quoteLevels;
                boolean z3 = (i14 == 0 && lastNonListPageBlock.level <= 0) || lastNonListPageBlock.bottom;
                lastNonListPageBlock.level = -1;
                int size = pageblockblockquoteblocks.blocks.size();
                int i15 = 0;
                while (i15 < size) {
                    TL_iv.PageBlock pageBlock3 = pageblockblockquoteblocks.blocks.get(i15);
                    if (pageBlock3 instanceof TL_iv.pageBlockUnsupported) {
                        i10 = i15;
                    } else if (pageBlock3 instanceof TL_iv.pageBlockAnchor) {
                        this.anchors.put(((TL_iv.pageBlockAnchor) pageBlock3).name.toLowerCase(), Integer.valueOf(this.blocks.size()));
                        i10 = i15;
                    } else {
                        pageBlock3.level = iMax + 1;
                        pageBlock3.quoteLevels = (1 << iMax) | i14;
                        pageBlock3.bottom = i15 == size + (-1) && z3;
                        i10 = i15;
                        addBlock(webpageAdapter, pageBlock3, i, i2, i3);
                    }
                    i15 = i10 + 1;
                }
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockEmbedPost) {
                TL_iv.pageBlockEmbedPost pageblockembedpost = (TL_iv.pageBlockEmbedPost) lastNonListPageBlock;
                if (pageblockembedpost.blocks.isEmpty()) {
                    return;
                }
                lastNonListPageBlock.level = -1;
                while (i11 < pageblockembedpost.blocks.size()) {
                    TL_iv.PageBlock pageBlock4 = pageblockembedpost.blocks.get(i11);
                    if (!(pageBlock4 instanceof TL_iv.pageBlockUnsupported)) {
                        if (pageBlock4 instanceof TL_iv.pageBlockAnchor) {
                            this.anchors.put(((TL_iv.pageBlockAnchor) pageBlock4).name.toLowerCase(), Integer.valueOf(this.blocks.size()));
                        } else {
                            pageBlock4.level = 1;
                            if (i11 == pageblockembedpost.blocks.size() - 1) {
                                pageBlock4.bottom = true;
                            }
                            this.blocks.add(pageBlock4);
                            addAllMediaFromBlock(webpageAdapter, pageBlock4);
                        }
                    }
                    i11++;
                }
                if (TextUtils.isEmpty(ArticleViewer.getPlainText(pageblockembedpost.caption.text)) && TextUtils.isEmpty(ArticleViewer.getPlainText(pageblockembedpost.caption.credit))) {
                    return;
                }
                TL_pageBlockEmbedPostCaption tL_pageBlockEmbedPostCaption = new TL_pageBlockEmbedPostCaption();
                tL_pageBlockEmbedPostCaption.parent = pageblockembedpost;
                tL_pageBlockEmbedPostCaption.caption = pageblockembedpost.caption;
                this.blocks.add(tL_pageBlockEmbedPostCaption);
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = (TL_iv.pageBlockRelatedArticles) lastNonListPageBlock;
                TL_pageBlockRelatedArticlesShadow tL_pageBlockRelatedArticlesShadow = new TL_pageBlockRelatedArticlesShadow();
                tL_pageBlockRelatedArticlesShadow.parent = pageblockrelatedarticles;
                ArrayList arrayList = this.blocks;
                arrayList.add(arrayList.size() - 1, tL_pageBlockRelatedArticlesShadow);
                int size2 = pageblockrelatedarticles.articles.size();
                while (i11 < size2) {
                    TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = new TL_pageBlockRelatedArticlesChild();
                    tL_pageBlockRelatedArticlesChild.parent = pageblockrelatedarticles;
                    tL_pageBlockRelatedArticlesChild.num = i11;
                    this.blocks.add(tL_pageBlockRelatedArticlesChild);
                    i11++;
                }
                if (i3 == 0) {
                    TL_pageBlockRelatedArticlesShadow tL_pageBlockRelatedArticlesShadow2 = new TL_pageBlockRelatedArticlesShadow();
                    tL_pageBlockRelatedArticlesShadow2.parent = pageblockrelatedarticles;
                    this.blocks.add(tL_pageBlockRelatedArticlesShadow2);
                    return;
                }
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) lastNonListPageBlock;
                int size3 = pageblockdetails.blocks.size();
                while (i11 < size3) {
                    TL_pageBlockDetailsChild tL_pageBlockDetailsChild = new TL_pageBlockDetailsChild();
                    tL_pageBlockDetailsChild.parent = pageBlock;
                    tL_pageBlockDetailsChild.block = pageblockdetails.blocks.get(i11);
                    addBlock(webpageAdapter, ArticleViewer.this.wrapInTableBlock(pageBlock, tL_pageBlockDetailsChild), i + 1, i2, i3);
                    i11++;
                }
                return;
            }
            String str2 = ".%d";
            if (z2) {
                TL_iv.pageBlockList pageblocklist2 = (TL_iv.pageBlockList) lastNonListPageBlock;
                TL_pageBlockListParent tL_pageBlockListParent2 = new TL_pageBlockListParent();
                tL_pageBlockListParent2.pageBlockList = pageblocklist2;
                tL_pageBlockListParent2.level = i2;
                int size4 = pageblocklist2.items.size();
                int i16 = 0;
                while (i16 < size4) {
                    TL_iv.PageListItem pageListItem2 = pageblocklist2.items.get(i16);
                    TL_pageBlockListItem tL_pageBlockListItem2 = new TL_pageBlockListItem();
                    tL_pageBlockListItem2.index = i16;
                    tL_pageBlockListItem2.parent = tL_pageBlockListParent2;
                    if (pageblocklist2.ordered) {
                        if (this.isRtl) {
                            Object[] objArr = new Object[i12];
                            objArr[0] = Integer.valueOf(i16 + 1);
                            tL_pageBlockListItem2.num = String.format(str2, objArr);
                        } else {
                            Object[] objArr2 = new Object[i12];
                            objArr2[0] = Integer.valueOf(i16 + 1);
                            tL_pageBlockListItem2.num = String.format("%d.", objArr2);
                        }
                    } else {
                        tL_pageBlockListItem2.num = "•";
                    }
                    tL_pageBlockListParent2.items.add(tL_pageBlockListItem2);
                    if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                        TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem2;
                        tL_pageBlockListItem2.textItem = tL_pageListItemText.text;
                        tL_pageBlockListItem2.isCheckbox = tL_pageListItemText.checkbox;
                        tL_pageBlockListItem2.checked = tL_pageListItemText.checked;
                        pageListItem = pageListItem2;
                    } else {
                        boolean z4 = pageListItem2 instanceof TL_iv.TL_pageListItemBlocks;
                        pageListItem = pageListItem2;
                        if (z4) {
                            TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem2;
                            tL_pageBlockListItem2.isCheckbox = tL_pageListItemBlocks.checkbox;
                            tL_pageBlockListItem2.checked = tL_pageListItemBlocks.checked;
                            if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                                tL_pageBlockListItem2.blockItem = tL_pageListItemBlocks.blocks.get(0);
                                pageListItem = pageListItem2;
                            } else {
                                TL_iv.TL_pageListItemText tL_pageListItemText2 = new TL_iv.TL_pageListItemText();
                                TL_iv.textPlain textplain = new TL_iv.textPlain();
                                textplain.text = " ";
                                tL_pageListItemText2.text = textplain;
                                pageListItem = tL_pageListItemText2;
                            }
                        }
                    }
                    TL_iv.PageListItem pageListItem3 = pageListItem;
                    if (z) {
                        TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = new TL_pageBlockDetailsChild();
                        tL_pageBlockDetailsChild2.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                        tL_pageBlockDetailsChild2.block = tL_pageBlockListItem2;
                        i7 = i16;
                        i8 = size4;
                        tL_pageBlockListParent = tL_pageBlockListParent2;
                        pageblocklist = pageblocklist2;
                        str = str2;
                        addBlock(webpageAdapter, tL_pageBlockDetailsChild2, i, i2 + 1, i3);
                    } else {
                        i7 = i16;
                        i8 = size4;
                        tL_pageBlockListParent = tL_pageBlockListParent2;
                        pageblocklist = pageblocklist2;
                        str = str2;
                        addBlock(webpageAdapter, i7 == 0 ? ArticleViewer.this.fixListBlock(pageBlock, tL_pageBlockListItem2) : tL_pageBlockListItem2, i, i2 + 1, i3);
                    }
                    if (pageListItem3 instanceof TL_iv.TL_pageListItemBlocks) {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks2 = (TL_iv.TL_pageListItemBlocks) pageListItem3;
                        int size5 = tL_pageListItemBlocks2.blocks.size();
                        int i17 = 1;
                        while (i17 < size5) {
                            TL_pageBlockListItem tL_pageBlockListItem3 = new TL_pageBlockListItem();
                            tL_pageBlockListItem3.blockItem = tL_pageListItemBlocks2.blocks.get(i17);
                            tL_pageBlockListItem3.parent = tL_pageBlockListParent;
                            if (z) {
                                TL_pageBlockDetailsChild tL_pageBlockDetailsChild3 = new TL_pageBlockDetailsChild();
                                tL_pageBlockDetailsChild3.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                                tL_pageBlockDetailsChild3.block = tL_pageBlockListItem3;
                                tL_pageBlockListItem = tL_pageBlockListItem3;
                                i9 = i17;
                                addBlock(webpageAdapter, tL_pageBlockDetailsChild3, i, i2 + 1, i3);
                            } else {
                                tL_pageBlockListItem = tL_pageBlockListItem3;
                                i9 = i17;
                                addBlock(webpageAdapter, tL_pageBlockListItem, i, i2 + 1, i3);
                            }
                            tL_pageBlockListParent.items.add(tL_pageBlockListItem);
                            i17 = i9 + 1;
                        }
                    }
                    i16 = i7 + 1;
                    tL_pageBlockListParent2 = tL_pageBlockListParent;
                    str2 = str;
                    size4 = i8;
                    pageblocklist2 = pageblocklist;
                    i12 = 1;
                }
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockOrderedList) {
                TL_iv.pageBlockOrderedList pageblockorderedlist2 = (TL_iv.pageBlockOrderedList) lastNonListPageBlock;
                TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = new TL_pageBlockOrderedListParent();
                tL_pageBlockOrderedListParent.pageBlockOrderedList = pageblockorderedlist2;
                tL_pageBlockOrderedListParent.level = i2;
                int size6 = pageblockorderedlist2.items.size();
                int i18 = 0;
                while (i18 < size6) {
                    TL_iv.PageListOrderedItem pageListOrderedItem3 = pageblockorderedlist2.items.get(i18);
                    TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = new TL_pageBlockOrderedListItem();
                    tL_pageBlockOrderedListItem2.index = i18;
                    tL_pageBlockOrderedListItem2.parent = tL_pageBlockOrderedListParent;
                    tL_pageBlockOrderedListParent.items.add(tL_pageBlockOrderedListItem2);
                    if (pageListOrderedItem3 instanceof TL_iv.TL_pageListOrderedItemText) {
                        TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem3;
                        tL_pageBlockOrderedListItem2.textItem = tL_pageListOrderedItemText.text;
                        tL_pageBlockOrderedListItem2.isCheckbox = tL_pageListOrderedItemText.checkbox;
                        tL_pageBlockOrderedListItem2.checked = tL_pageListOrderedItemText.checked;
                        if (TextUtils.isEmpty(tL_pageListOrderedItemText.num)) {
                            if (this.isRtl) {
                                tL_pageBlockOrderedListItem2.num = String.format(".%d", Integer.valueOf(i18 + 1));
                                pageblockorderedlist = pageblockorderedlist2;
                                pageListOrderedItem2 = pageListOrderedItem3;
                            } else {
                                tL_pageBlockOrderedListItem2.num = String.format("%d.", Integer.valueOf(i18 + 1));
                            }
                        } else if (this.isRtl) {
                            tL_pageBlockOrderedListItem2.num = "." + tL_pageListOrderedItemText.num;
                        } else {
                            tL_pageBlockOrderedListItem2.num = tL_pageListOrderedItemText.num + ".";
                        }
                        pageblockorderedlist = pageblockorderedlist2;
                        pageListOrderedItem2 = pageListOrderedItem3;
                    } else if (pageListOrderedItem3 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem3;
                        tL_pageBlockOrderedListItem2.isCheckbox = tL_pageListOrderedItemBlocks.checkbox;
                        tL_pageBlockOrderedListItem2.checked = tL_pageListOrderedItemBlocks.checked;
                        if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                            pageblockorderedlist = pageblockorderedlist2;
                            tL_pageBlockOrderedListItem2.blockItem = tL_pageListOrderedItemBlocks.blocks.get(0);
                            pageListOrderedItem = pageListOrderedItem3;
                        } else {
                            pageblockorderedlist = pageblockorderedlist2;
                            TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText2 = new TL_iv.TL_pageListOrderedItemText();
                            TL_iv.textPlain textplain2 = new TL_iv.textPlain();
                            textplain2.text = " ";
                            tL_pageListOrderedItemText2.text = textplain2;
                            pageListOrderedItem = tL_pageListOrderedItemText2;
                        }
                        if (TextUtils.isEmpty(tL_pageListOrderedItemBlocks.num)) {
                            if (this.isRtl) {
                                tL_pageBlockOrderedListItem2.num = String.format(".%d", Integer.valueOf(i18 + 1));
                                pageListOrderedItem2 = pageListOrderedItem;
                            } else {
                                tL_pageBlockOrderedListItem2.num = String.format("%d.", Integer.valueOf(i18 + 1));
                                pageListOrderedItem2 = pageListOrderedItem;
                            }
                        } else if (this.isRtl) {
                            tL_pageBlockOrderedListItem2.num = "." + tL_pageListOrderedItemBlocks.num;
                            pageListOrderedItem2 = pageListOrderedItem;
                        } else {
                            tL_pageBlockOrderedListItem2.num = tL_pageListOrderedItemBlocks.num + ".";
                            pageListOrderedItem2 = pageListOrderedItem;
                        }
                    } else {
                        pageblockorderedlist = pageblockorderedlist2;
                        pageListOrderedItem2 = pageListOrderedItem3;
                    }
                    TL_iv.PageListOrderedItem pageListOrderedItem4 = pageListOrderedItem2;
                    if (z) {
                        TL_pageBlockDetailsChild tL_pageBlockDetailsChild4 = new TL_pageBlockDetailsChild();
                        tL_pageBlockDetailsChild4.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                        tL_pageBlockDetailsChild4.block = tL_pageBlockOrderedListItem2;
                        i4 = i18;
                        addBlock(webpageAdapter, tL_pageBlockDetailsChild4, i, i2 + 1, i3);
                    } else {
                        i4 = i18;
                        addBlock(webpageAdapter, i4 == 0 ? ArticleViewer.this.fixListBlock(pageBlock, tL_pageBlockOrderedListItem2) : tL_pageBlockOrderedListItem2, i, i2 + 1, i3);
                    }
                    if (pageListOrderedItem4 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks2 = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem4;
                        int size7 = tL_pageListOrderedItemBlocks2.blocks.size();
                        int i19 = 1;
                        while (i19 < size7) {
                            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem3 = new TL_pageBlockOrderedListItem();
                            tL_pageBlockOrderedListItem3.blockItem = tL_pageListOrderedItemBlocks2.blocks.get(i19);
                            tL_pageBlockOrderedListItem3.parent = tL_pageBlockOrderedListParent;
                            if (z) {
                                TL_pageBlockDetailsChild tL_pageBlockDetailsChild5 = new TL_pageBlockDetailsChild();
                                tL_pageBlockDetailsChild5.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                                tL_pageBlockDetailsChild5.block = tL_pageBlockOrderedListItem3;
                                tL_pageBlockOrderedListItem = tL_pageBlockOrderedListItem3;
                                i5 = i19;
                                i6 = size7;
                                addBlock(webpageAdapter, tL_pageBlockDetailsChild5, i, i2 + 1, i3);
                            } else {
                                tL_pageBlockOrderedListItem = tL_pageBlockOrderedListItem3;
                                i5 = i19;
                                i6 = size7;
                                addBlock(webpageAdapter, tL_pageBlockOrderedListItem, i, i2 + 1, i3);
                            }
                            tL_pageBlockOrderedListParent.items.add(tL_pageBlockOrderedListItem);
                            i19 = i5 + 1;
                            size7 = i6;
                        }
                    }
                    i18 = i4 + 1;
                    pageblockorderedlist2 = pageblockorderedlist;
                }
            }
        }

        private void addAllMediaFromBlock(WebpageAdapter webpageAdapter, TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                TLRPC.Photo photoWithId = getPhotoWithId(pageblockphoto.photo_id);
                if (photoWithId != null) {
                    pageblockphoto.thumb = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, 56, true);
                    pageblockphoto.thumbObject = photoWithId;
                    this.photoBlocks.add(pageBlock);
                    return;
                }
                return;
            }
            if ((pageBlock instanceof TL_iv.pageBlockVideo) && WebPageUtils.isVideo(webpageAdapter.currentPage, pageBlock)) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document documentWithId = getDocumentWithId(pageblockvideo.video_id);
                if (documentWithId != null) {
                    pageblockvideo.thumb = FileLoader.getClosestPhotoSizeWithSize(documentWithId.thumbs, 56, true);
                    pageblockvideo.thumbObject = documentWithId;
                    this.photoBlocks.add(pageBlock);
                    return;
                }
                return;
            }
            int i = 0;
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                int size = pageblockslideshow.items.size();
                while (i < size) {
                    TL_iv.PageBlock pageBlock2 = pageblockslideshow.items.get(i);
                    pageBlock2.groupId = ArticleViewer.this.lastBlockNum;
                    addAllMediaFromBlock(webpageAdapter, pageBlock2);
                    i++;
                }
                ArticleViewer.access$9208(ArticleViewer.this);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                int size2 = pageblockcollage.items.size();
                while (i < size2) {
                    TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i);
                    pageBlock3.groupId = ArticleViewer.this.lastBlockNum;
                    addAllMediaFromBlock(webpageAdapter, pageBlock3);
                    i++;
                }
                ArticleViewer.access$9208(ArticleViewer.this);
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                addAllMediaFromBlock(webpageAdapter, ((TL_iv.pageBlockCover) pageBlock).cover);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View blockParagraphCell;
            View blockVideoCell;
            if (i == 2147483646) {
                View view = new View(this.context) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.4f), 1073741824));
                    }
                };
                view.setImportantForAccessibility(2);
                blockParagraphCell = view;
            } else {
                switch (i) {
                    case 0:
                        blockParagraphCell = new BlockParagraphCell(this.context, ArticleViewer.this, this);
                        break;
                    case 1:
                        blockParagraphCell = new BlockHeaderCell(this.context, ArticleViewer.this, this);
                        break;
                    case 2:
                        blockParagraphCell = new BlockDividerCell(this.context);
                        break;
                    case 3:
                        blockParagraphCell = ArticleViewer.this.new BlockEmbedCell(this.context, this);
                        break;
                    case 4:
                        blockParagraphCell = new BlockSubtitleCell(this.context, ArticleViewer.this, this);
                        break;
                    case 5:
                        blockVideoCell = new BlockVideoCell(this.context, ArticleViewer.this, this, 0);
                        blockParagraphCell = blockVideoCell;
                        break;
                    case 6:
                        blockParagraphCell = new BlockPullquoteCell(this.context, ArticleViewer.this, this);
                        break;
                    case 7:
                        blockParagraphCell = new BlockBlockquoteCell(this.context, ArticleViewer.this, this);
                        break;
                    case 8:
                        blockParagraphCell = ArticleViewer.this.new BlockSlideshowCell(this.context, this);
                        break;
                    case 9:
                        blockVideoCell = new BlockPhotoCell(this.context, ArticleViewer.this, this, 0);
                        blockParagraphCell = blockVideoCell;
                        break;
                    case 10:
                        blockParagraphCell = new BlockAuthorDateCell(this.context, ArticleViewer.this, this);
                        break;
                    case 11:
                        blockParagraphCell = new BlockTitleCell(this.context, ArticleViewer.this, this);
                        break;
                    case 12:
                        blockParagraphCell = new BlockListItemCell(this.context, ArticleViewer.this, this);
                        break;
                    case 13:
                        blockParagraphCell = new BlockFooterCell(this.context, ArticleViewer.this, this);
                        break;
                    case 14:
                        blockParagraphCell = new BlockPreformattedCell(this.context, ArticleViewer.this, this);
                        break;
                    case 15:
                        blockParagraphCell = new BlockSubheaderCell(this.context, ArticleViewer.this, this);
                        break;
                    case 16:
                        blockParagraphCell = new BlockEmbedPostCell(this.context, ArticleViewer.this, this);
                        break;
                    case 17:
                        blockParagraphCell = ArticleViewer.this.new BlockCollageCell(this.context, this);
                        break;
                    case 18:
                        blockVideoCell = new BlockChannelCell(this.context, ArticleViewer.this, this, 0);
                        blockParagraphCell = blockVideoCell;
                        break;
                    case 19:
                        blockParagraphCell = new BlockAudioCell(this.context, ArticleViewer.this, this);
                        break;
                    case 20:
                        blockParagraphCell = new BlockKickerCell(this.context, ArticleViewer.this, this);
                        break;
                    case 21:
                        blockParagraphCell = new BlockOrderedListItemCell(this.context, ArticleViewer.this, this);
                        break;
                    case 22:
                        blockVideoCell = new BlockMapCell(this.context, ArticleViewer.this, this, 0);
                        blockParagraphCell = blockVideoCell;
                        break;
                    case 23:
                        blockParagraphCell = new BlockRelatedArticlesCell(this.context, ArticleViewer.this, this);
                        break;
                    case 24:
                        blockParagraphCell = new BlockDetailsCell(this.context, ArticleViewer.this, this);
                        break;
                    case 25:
                        blockParagraphCell = new BlockTableCell(this.context, ArticleViewer.this, this);
                        break;
                    case 26:
                        blockParagraphCell = new BlockRelatedArticlesHeaderCell(this.context, ArticleViewer.this, this);
                        break;
                    case 27:
                        blockParagraphCell = new BlockDetailsBottomCell(this.context);
                        break;
                    case 28:
                        blockParagraphCell = new BlockRelatedArticlesShadowCell(this.context, ArticleViewer.this);
                        break;
                    default:
                        switch (i) {
                            case 90:
                                blockVideoCell = ArticleViewer.this.new ReportCell(this.context, false);
                                blockParagraphCell = blockVideoCell;
                                break;
                            case 91:
                                blockParagraphCell = ArticleViewer.this.new ReportCell(this.context, true);
                                break;
                            case 92:
                                blockParagraphCell = new BlockMathCell(this.context, ArticleViewer.this, this);
                                break;
                            default:
                                TextView textView = new TextView(this.context);
                                textView.setBackgroundColor(-65536);
                                textView.setTextColor(-16777216);
                                textView.setTextSize(1, 20.0f);
                                blockParagraphCell = textView;
                                break;
                        }
                }
            }
            blockParagraphCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            blockParagraphCell.setFocusable(true);
            return new RecyclerListView.Holder(blockParagraphCell);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 23 || itemViewType == 24;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws NoSuchFieldException, InterruptedException, SecurityException {
            if (this.padding) {
                i--;
            }
            int i2 = i;
            if (i2 < 0 || i2 >= this.localBlocks.size()) {
                return;
            }
            bindBlockToHolder(viewHolder.getItemViewType(), viewHolder, (TL_iv.PageBlock) this.localBlocks.get(i2), i2, this.localBlocks.size(), false);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 90 || viewHolder.getItemViewType() == 91) {
                ReportCell reportCell = (ReportCell) viewHolder.itemView;
                TL_iv.Page page = this.currentPage.cached_page;
                reportCell.setViews(page != null ? page.views : 0);
            }
        }

        public void bindBlockToHolder(int i, RecyclerView.ViewHolder viewHolder, TL_iv.PageBlock pageBlock, int i2, int i3, boolean z) throws NoSuchFieldException, InterruptedException, SecurityException {
            TL_iv.PageBlock pageBlock2;
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                pageBlock2 = ((TL_iv.pageBlockCover) pageBlock).cover;
            } else {
                pageBlock2 = pageBlock instanceof TL_pageBlockDetailsChild ? ((TL_pageBlockDetailsChild) pageBlock).block : pageBlock;
            }
            if (i == 92) {
                ((BlockMathCell) viewHolder.itemView).setBlock((TL_iv.pageBlockMath) pageBlock2);
                return;
            }
            if (i != 100) {
                switch (i) {
                    case 0:
                        ((BlockParagraphCell) viewHolder.itemView).setBlock((TL_iv.pageBlockParagraph) pageBlock2);
                        break;
                    case 1:
                        ((BlockHeaderCell) viewHolder.itemView).setBlock(pageBlock2);
                        break;
                    case 2:
                        break;
                    case 3:
                        ((BlockEmbedCell) viewHolder.itemView).setBlock((TL_iv.pageBlockEmbed) pageBlock2);
                        break;
                    case 4:
                        ((BlockSubtitleCell) viewHolder.itemView).setBlock((TL_iv.pageBlockSubtitle) pageBlock2);
                        break;
                    case 5:
                        BlockVideoCell blockVideoCell = (BlockVideoCell) viewHolder.itemView;
                        TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock2;
                        blockVideoCell.setBlock(pageblockvideo, (BlockVideoCellState) ArticleViewer.this.videoStates.get(pageblockvideo.video_id), z, i2 == 0, i2 == i3 - 1);
                        blockVideoCell.setParentBlock(this.channelBlock, pageBlock);
                        break;
                    case 6:
                        ((BlockPullquoteCell) viewHolder.itemView).setBlock((TL_iv.pageBlockPullquote) pageBlock2);
                        break;
                    case 7:
                        ((BlockBlockquoteCell) viewHolder.itemView).setBlock((TL_iv.pageBlockBlockquote) pageBlock2);
                        break;
                    case 8:
                        ((BlockSlideshowCell) viewHolder.itemView).setBlock((TL_iv.pageBlockSlideshow) pageBlock2);
                        break;
                    case 9:
                        BlockPhotoCell blockPhotoCell = (BlockPhotoCell) viewHolder.itemView;
                        blockPhotoCell.setBlock((TL_iv.pageBlockPhoto) pageBlock2, this.currentPage.cached_page, null, z, i2 == 0);
                        blockPhotoCell.setParentBlock(pageBlock);
                        break;
                    case 10:
                        ((BlockAuthorDateCell) viewHolder.itemView).setBlock((TL_iv.pageBlockAuthorDate) pageBlock2);
                        break;
                    case 11:
                        ((BlockTitleCell) viewHolder.itemView).setBlock((TL_iv.pageBlockTitle) pageBlock2);
                        break;
                    case 12:
                        ((BlockListItemCell) viewHolder.itemView).setBlock((TL_pageBlockListItem) pageBlock2);
                        break;
                    case 13:
                        ((BlockFooterCell) viewHolder.itemView).setBlock((TL_iv.pageBlockFooter) pageBlock2);
                        break;
                    case 14:
                        ((BlockPreformattedCell) viewHolder.itemView).setBlock((TL_iv.pageBlockPreformatted) pageBlock2);
                        break;
                    case 15:
                        ((BlockSubheaderCell) viewHolder.itemView).setBlock((TL_iv.pageBlockSubheader) pageBlock2);
                        break;
                    case 16:
                        ((BlockEmbedPostCell) viewHolder.itemView).setBlock((TL_iv.pageBlockEmbedPost) pageBlock2);
                        break;
                    case 17:
                        ((BlockCollageCell) viewHolder.itemView).setBlock((TL_iv.pageBlockCollage) pageBlock2);
                        break;
                    case 18:
                        ((BlockChannelCell) viewHolder.itemView).setBlock((TL_iv.pageBlockChannel) pageBlock2);
                        break;
                    case 19:
                        ((BlockAudioCell) viewHolder.itemView).setBlock((TL_iv.pageBlockAudio) pageBlock2, i2 == 0, i2 == i3 - 1);
                        break;
                    case 20:
                        ((BlockKickerCell) viewHolder.itemView).setBlock((TL_iv.pageBlockKicker) pageBlock2);
                        break;
                    case 21:
                        ((BlockOrderedListItemCell) viewHolder.itemView).setBlock((TL_pageBlockOrderedListItem) pageBlock2);
                        break;
                    case 22:
                        ((BlockMapCell) viewHolder.itemView).setBlock((TL_iv.pageBlockMap) pageBlock2, i2 == 0, i2 == i3 - 1);
                        break;
                    case 23:
                        ((BlockRelatedArticlesCell) viewHolder.itemView).setBlock((TL_pageBlockRelatedArticlesChild) pageBlock2, this.currentPage.cached_page);
                        break;
                    case 24:
                        ((BlockDetailsCell) viewHolder.itemView).setBlock((TL_iv.pageBlockDetails) pageBlock2);
                        break;
                    case 25:
                        ((BlockTableCell) viewHolder.itemView).setBlock((TL_iv.pageBlockTable) pageBlock2);
                        break;
                    case 26:
                        ((BlockRelatedArticlesHeaderCell) viewHolder.itemView).setBlock((TL_iv.pageBlockRelatedArticles) pageBlock2);
                        break;
                    case 27:
                        break;
                }
                return;
            }
            ((TextView) viewHolder.itemView).setText("unsupported block " + pageBlock2);
        }

        public int getTypeForBlock(TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                return 0;
            }
            if ((pageBlock instanceof TL_iv.pageBlockHeader) || ArticleViewer.isHeadingBlock(pageBlock)) {
                return 1;
            }
            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                return 2;
            }
            if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                return 3;
            }
            if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
                return 4;
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return 5;
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return 6;
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return 7;
            }
            if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                return 8;
            }
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return 9;
            }
            if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                return 10;
            }
            if (pageBlock instanceof TL_iv.pageBlockTitle) {
                return 11;
            }
            if (pageBlock instanceof TL_pageBlockListItem) {
                return 12;
            }
            if (pageBlock instanceof TL_iv.pageBlockFooter) {
                return 13;
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return 14;
            }
            if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                return 15;
            }
            if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                return 16;
            }
            if (pageBlock instanceof TL_iv.pageBlockCollage) {
                return 17;
            }
            if (pageBlock instanceof TL_iv.pageBlockChannel) {
                return 18;
            }
            if (pageBlock instanceof TL_iv.pageBlockAudio) {
                return 19;
            }
            if (pageBlock instanceof TL_iv.pageBlockKicker) {
                return 20;
            }
            if (pageBlock instanceof TL_pageBlockOrderedListItem) {
                return 21;
            }
            if (pageBlock instanceof TL_iv.pageBlockMap) {
                return 22;
            }
            if (pageBlock instanceof TL_pageBlockRelatedArticlesChild) {
                return 23;
            }
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return 24;
            }
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                return 25;
            }
            if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                return 26;
            }
            if (pageBlock instanceof TL_pageBlockRelatedArticlesShadow) {
                return 28;
            }
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                return 92;
            }
            if (pageBlock instanceof TL_pageBlockDetailsChild) {
                return getTypeForBlock(((TL_pageBlockDetailsChild) pageBlock).block);
            }
            if (pageBlock instanceof TL_iv.pageBlockCover) {
                return getTypeForBlock(((TL_iv.pageBlockCover) pageBlock).cover);
            }
            return 100;
        }

        @Override
        public int getItemViewType(int i) {
            TL_iv.Page page;
            if (this.padding) {
                if (i == 0) {
                    return 2147483646;
                }
                i--;
            }
            if (i == this.localBlocks.size()) {
                TLRPC.WebPage webPage = this.currentPage;
                return (webPage == null || (page = webPage.cached_page) == null || !page.web) ? 90 : 91;
            }
            return getTypeForBlock((TL_iv.PageBlock) this.localBlocks.get(i));
        }

        @Override
        public int getItemCount() {
            int size;
            TLRPC.WebPage webPage = this.currentPage;
            if (webPage == null || webPage.cached_page == null) {
                size = 0;
            } else {
                size = this.localBlocks.size();
                if (this.currentPage.cached_page.local == null) {
                    size++;
                }
            }
            return this.padding ? size + 1 : size;
        }

        private boolean isBlockOpened(TL_pageBlockDetailsChild tL_pageBlockDetailsChild) {
            TL_iv.PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(tL_pageBlockDetailsChild.parent);
            if (lastNonListPageBlock instanceof TL_iv.pageBlockDetails) {
                return ((TL_iv.pageBlockDetails) lastNonListPageBlock).open;
            }
            if (!(lastNonListPageBlock instanceof TL_pageBlockDetailsChild)) {
                return false;
            }
            TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = (TL_pageBlockDetailsChild) lastNonListPageBlock;
            TL_iv.PageBlock lastNonListPageBlock2 = ArticleViewer.this.getLastNonListPageBlock(tL_pageBlockDetailsChild2.block);
            if (!(lastNonListPageBlock2 instanceof TL_iv.pageBlockDetails) || ((TL_iv.pageBlockDetails) lastNonListPageBlock2).open) {
                return isBlockOpened(tL_pageBlockDetailsChild2);
            }
            return false;
        }

        public void resetCachedHeights() {
            for (int i = 0; i < this.localBlocks.size(); i++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.localBlocks.get(i);
                if (pageBlock != null) {
                    pageBlock.cachedWidth = 0;
                    pageBlock.cachedHeight = 0;
                }
            }
            calculateContentHeight();
        }

        public void updateRows() {
            this.localBlocks.clear();
            int size = this.blocks.size();
            for (int i = 0; i < size; i++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.blocks.get(i);
                TL_iv.PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(pageBlock);
                if (!(lastNonListPageBlock instanceof TL_pageBlockDetailsChild) || isBlockOpened((TL_pageBlockDetailsChild) lastNonListPageBlock)) {
                    this.localBlocks.add(pageBlock);
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

        public void lambda$new$1() throws java.lang.NoSuchFieldException, java.lang.InterruptedException, java.lang.SecurityException {
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
        public void notifyItemRangeRemoved(int i, int i2) {
            updateRows();
            super.notifyItemRangeRemoved(i, i2);
        }
    }

    public static class BlockVideoCellState {
        Bitmap lastFrameBitmap;
        long playFrom;

        public static BlockVideoCellState fromPlayer(VideoPlayerHolderBase videoPlayerHolderBase, BlockVideoCell blockVideoCell) throws InterruptedException {
            BlockVideoCellState blockVideoCellState = new BlockVideoCellState();
            blockVideoCellState.playFrom = videoPlayerHolderBase.getCurrentPosition();
            if (videoPlayerHolderBase.firstFrameRendered && blockVideoCell.textureView != null && blockVideoCell.textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(blockVideoCell.textureView.getSurfaceTexture());
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(blockVideoCell.textureView.getMeasuredWidth(), blockVideoCell.textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, bitmapCreateBitmap);
                    surface.release();
                    blockVideoCellState.lastFrameBitmap = bitmapCreateBitmap;
                } else {
                    blockVideoCellState.lastFrameBitmap = blockVideoCell.textureView.getBitmap();
                }
            }
            return blockVideoCellState;
        }

        public static BlockVideoCellState fromPlayer(VideoPlayer videoPlayer, BlockVideoCell blockVideoCell, TextureView textureView) throws InterruptedException {
            BlockVideoCellState blockVideoCellState = new BlockVideoCellState();
            blockVideoCellState.playFrom = videoPlayer.getCurrentPosition();
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, bitmapCreateBitmap);
                    surface.release();
                    blockVideoCellState.lastFrameBitmap = bitmapCreateBitmap;
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
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getMeasuredWidth(), surfaceView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                AndroidUtilities.getBitmapFromSurface(surfaceView, bitmapCreateBitmap);
                blockVideoCellState.lastFrameBitmap = bitmapCreateBitmap;
            }
            return blockVideoCellState;
        }
    }

    public interface IBlock {
        int getBoundLeft();

        int getBoundRight();

        int getLastLineBoundRight();

        public abstract class CC {
            public static int $default$getMinWidth(IBlock iBlock) {
                int boundLeft = iBlock.getBoundLeft();
                int boundRight = iBlock.getBoundRight();
                if (boundLeft < 0 || boundRight < 0 || boundRight < boundLeft) {
                    return -1;
                }
                return boundRight - boundLeft;
            }
        }
    }

    public static class BlockVideoCell extends FrameLayout implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
        private final WebpageAdapter adapter;
        private AspectRatioFrameLayout aspectRatioFrameLayout;
        FrameLayout aspectRationContainer;
        private boolean attached;
        private boolean autoDownload;
        private int buttonPressed;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private boolean calcHeight;
        private boolean cancelLoading;
        private DrawingText captionLayout;
        private BlockChannelCell channelCell;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockVideo currentBlock;
        private TLRPC.Document currentDocument;
        private int currentType;
        private boolean firstFrameRendered;
        private MessageObject.GroupedMessagePosition groupPosition;
        private ImageReceiver imageView;
        private boolean isFirst;
        private boolean isGif;
        private final IArticleViewer parent;
        private TL_iv.PageBlock parentBlock;
        private boolean photoPressed;
        private RadialProgress2 radialProgress;
        private int textX;
        private int textY;
        private TextureView textureView;
        private BlockVideoCellState videoState;

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public BlockVideoCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
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
            this.TAG = DownloadController.getInstance(iArticleViewer.getCurrentAccount()).generateObserverTag();
            this.channelCell = new BlockChannelCell(context, iArticleViewer, webpageAdapter, 1);
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
            return super.drawChild(canvas, view, j);
        }

        public void setBlock(TL_iv.pageBlockVideo pageblockvideo, BlockVideoCellState blockVideoCellState, boolean z, boolean z2, boolean z3) throws InterruptedException {
            setBlock(pageblockvideo, null, blockVideoCellState, z, z2, z3);
        }

        public void setBlock(TL_iv.pageBlockVideo pageblockvideo, TLObject tLObject, BlockVideoCellState blockVideoCellState, boolean z, boolean z2, boolean z3) throws InterruptedException {
            IArticleViewer iArticleViewer;
            VideoPlayerHolderBase videoPlayerHolderBase;
            TL_iv.pageBlockVideo pageblockvideo2 = this.currentBlock;
            if (pageblockvideo2 != null && (videoPlayerHolderBase = (iArticleViewer = this.parent).videoPlayer) != null && iArticleViewer.currentPlayer == this) {
                LongSparseArray longSparseArray = iArticleViewer.videoStates;
                long j = pageblockvideo2.video_id;
                BlockVideoCellState blockVideoCellStateFromPlayer = BlockVideoCellState.fromPlayer(videoPlayerHolderBase, this);
                this.videoState = blockVideoCellStateFromPlayer;
                longSparseArray.put(j, blockVideoCellStateFromPlayer);
            }
            this.currentBlock = pageblockvideo;
            this.videoState = blockVideoCellState;
            this.parentBlock = null;
            this.calcHeight = z;
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter != null) {
                this.currentDocument = webpageAdapter.getDocumentWithId(pageblockvideo.video_id);
            } else if (tLObject != null) {
                this.currentDocument = WebPageUtils.getDocumentWithId(tLObject, pageblockvideo.video_id);
            } else {
                this.currentDocument = null;
            }
            this.isGif = MessageObject.isVideoDocument(this.currentDocument) || MessageObject.isGifDocument(this.currentDocument);
            this.isFirst = z2;
            this.channelCell.setVisibility(4);
            updateButtonState(false);
            requestLayout();
        }

        public void setParentBlock(TL_iv.pageBlockChannel pageblockchannel, TL_iv.PageBlock pageBlock) {
            this.parentBlock = pageBlock;
            if (pageblockchannel == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
                return;
            }
            this.channelCell.setBlock(pageblockchannel);
            this.channelCell.setVisibility(0);
        }

        public View getChannelCell() {
            return this.channelCell;
        }

        public ImageReceiver getImageView() {
            return this.imageView;
        }

        public TL_iv.pageBlockVideo getCurrentBlock() {
            return this.currentBlock;
        }

        public TextureView getTextureView() {
            return this.textureView;
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockVideoCell.onTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        protected void onMeasure(int r31, int r32) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockVideoCell.onMeasure(int, int):void");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            if (!this.imageView.hasBitmapImage() || this.imageView.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(this.imageView.getDrawRegion(), ArticleViewer.photoBackgroundPaint);
            }
            this.imageView.draw(canvas);
            int i = 0;
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
            super.onDraw(canvas);
            if (this.imageView.getVisible()) {
                this.radialProgress.draw(canvas);
            }
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
            int currentAccount = this.parent.getCurrentAccount();
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            boolean z2 = true;
            boolean z3 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument).exists() || FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument, true).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (z3) {
                DownloadController.getInstance(currentAccount).removeLoadingFileObserver(this);
                if (!this.isGif) {
                    this.buttonState = 3;
                } else {
                    this.buttonState = -1;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(currentAccount).addLoadingFileObserver(attachFileName, null, this);
                BlockVideoCellState blockVideoCellState = this.videoState;
                float fFloatValue = 0.0f;
                if (blockVideoCellState != null && blockVideoCellState.lastFrameBitmap != null) {
                    this.buttonState = -1;
                } else {
                    if (!FileLoader.getInstance(currentAccount).isLoadingFile(attachFileName)) {
                        if (!this.cancelLoading && this.autoDownload && this.isGif) {
                            this.buttonState = 1;
                        } else {
                            this.buttonState = 0;
                        }
                    } else {
                        this.buttonState = 1;
                        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                        if (fileProgress != null) {
                            fFloatValue = fileProgress.floatValue();
                        }
                    }
                    this.radialProgress.setIcon(getIconForCurrentState(), z2, z);
                    this.radialProgress.setProgress(fFloatValue, false);
                }
                z2 = false;
                this.radialProgress.setIcon(getIconForCurrentState(), z2, z);
                this.radialProgress.setProgress(fFloatValue, false);
            }
            invalidate();
        }

        private void didPressedButton(boolean z) {
            int currentAccount = this.parent.getCurrentAccount();
            int i = this.buttonState;
            if (i == 0) {
                this.cancelLoading = false;
                this.radialProgress.setProgress(0.0f, false);
                if (!this.isGif) {
                    FileLoader.getInstance(currentAccount).loadFile(this.currentDocument, this.adapter.currentPage, 1, 1);
                } else {
                    this.imageView.setImage(ImageLocation.getForDocument(this.currentDocument), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.currentDocument.thumbs, 40), this.currentDocument), "80_80_b", this.currentDocument.size, null, this.adapter.currentPage, 1);
                }
                this.buttonState = 1;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                invalidate();
                return;
            }
            if (i != 1) {
                if (i == 2) {
                    this.imageView.setAllowStartAnimation(true);
                    this.imageView.startAnimation();
                    this.buttonState = -1;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    return;
                }
                return;
            }
            this.cancelLoading = true;
            if (this.isGif) {
                this.imageView.cancelLoadImage();
            } else {
                FileLoader.getInstance(currentAccount).cancelLoadFile(this.currentDocument);
            }
            this.buttonState = 0;
            this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            invalidate();
        }

        private void updateAttachedState() {
            if (getVisibility() == 0 && isAttachedToWindow()) {
                attach();
            } else {
                detach();
            }
        }

        private void attach() {
            if (this.attached) {
                return;
            }
            this.attached = true;
            this.imageView.onAttachedToWindow();
            updateButtonState(false);
        }

        private void detach() {
            IArticleViewer iArticleViewer;
            VideoPlayerHolderBase videoPlayerHolderBase;
            if (this.attached) {
                this.attached = false;
                TL_iv.pageBlockVideo pageblockvideo = this.currentBlock;
                if (pageblockvideo != null && (videoPlayerHolderBase = (iArticleViewer = this.parent).videoPlayer) != null && iArticleViewer.currentPlayer == this) {
                    iArticleViewer.videoStates.put(pageblockvideo.video_id, setState(BlockVideoCellState.fromPlayer(videoPlayerHolderBase, this)));
                }
                this.imageView.onDetachedFromWindow();
                DownloadController.getInstance(this.parent.getCurrentAccount()).removeLoadingFileObserver(this);
                this.firstFrameRendered = false;
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            updateAttachedState();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateAttachedState();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override
        public void setVisibility(int i) {
            super.setVisibility(i);
            updateAttachedState();
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

        public void startVideoPlayer() {
            if (this.currentDocument != null) {
                IArticleViewer iArticleViewer = this.parent;
                if (iArticleViewer.videoPlayer != null) {
                    return;
                }
                iArticleViewer.videoPlayer = new VideoPlayerHolderBase() {
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
                            LongSparseArray longSparseArray = BlockVideoCell.this.parent.videoStates;
                            long j = BlockVideoCell.this.currentBlock.video_id;
                            BlockVideoCell blockVideoCell = BlockVideoCell.this;
                            longSparseArray.put(j, blockVideoCell.setState(BlockVideoCellState.fromPlayer(blockVideoCell.parent.videoPlayer, BlockVideoCell.this)));
                        }
                    }
                }.with(this.textureView);
                TLRPC.Document document = this.currentDocument;
                for (int i = 0; i < document.attributes.size(); i++) {
                    if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i);
                        this.aspectRatioFrameLayout.setAspectRatio(tL_documentAttributeVideo.w / tL_documentAttributeVideo.h, 0);
                    }
                }
                Uri uriPrepareUri = this.adapter.currentPage == null ? null : FileStreamLoadOperation.prepareUri(this.parent.getCurrentAccount(), document, this.adapter.currentPage);
                if (uriPrepareUri == null) {
                    return;
                }
                VideoPlayerHolderBase videoPlayerHolderBase = this.parent.videoPlayer;
                BlockVideoCellState blockVideoCellState = this.videoState;
                videoPlayerHolderBase.seekTo(blockVideoCellState == null ? 0L : blockVideoCellState.playFrom);
                this.parent.videoPlayer.preparePlayer(uriPrepareUri, true, 1.0f);
                this.parent.videoPlayer.play();
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
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
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
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AttachVideo));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            accessibilityNodeInfo.setText(sb.toString());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
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

    public static class BlockAudioCell extends View implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
        private final WebpageAdapter adapter;
        private int buttonPressed;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockAudio currentBlock;
        private TLRPC.Document currentDocument;
        private MessageObject currentMessageObject;
        private StaticLayout durationLayout;
        private boolean isFirst;
        private String lastTimeString;
        private final IArticleViewer parent;
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

        public BlockAudioCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.textY = AndroidUtilities.dp(58.0f);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            RadialProgress2 radialProgress2 = new RadialProgress2(this);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
            this.TAG = DownloadController.getInstance(iArticleViewer.getCurrentAccount()).generateObserverTag();
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
                    this.f$0.lambda$new$0(f);
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

        public void setBlock(TL_iv.pageBlockAudio pageblockaudio, boolean z, boolean z2) {
            this.currentBlock = pageblockaudio;
            MessageObject messageObject = (MessageObject) this.adapter.audioBlocks.get(this.currentBlock);
            this.currentMessageObject = messageObject;
            if (messageObject != null) {
                this.currentDocument = messageObject.getDocument();
            }
            this.isFirst = z;
            SeekBar seekBar = this.seekBar;
            int themedColor = this.parent.getThemedColor(Theme.key_chat_inAudioSeekbar);
            int themedColor2 = this.parent.getThemedColor(Theme.key_chat_inAudioCacheSeekbar);
            IArticleViewer iArticleViewer = this.parent;
            int i = Theme.key_chat_inAudioSeekbarFill;
            seekBar.setColors(themedColor, themedColor2, iArticleViewer.getThemedColor(i), this.parent.getThemedColor(i), this.parent.getThemedColor(Theme.key_chat_inAudioSeekbarSelected));
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
        protected void onMeasure(int i, int i2) {
            SpannableStringBuilder spannableStringBuilder;
            int i3 = 1;
            int size = View.MeasureSpec.getSize(i);
            int iDp = AndroidUtilities.dp(54.0f);
            TL_iv.pageBlockAudio pageblockaudio = this.currentBlock;
            if (pageblockaudio != null) {
                if (pageblockaudio.level > 0) {
                    this.textX = AndroidUtilities.dp(r0 * 14) + AndroidUtilities.dp(18.0f);
                } else {
                    this.textX = AndroidUtilities.dp(18.0f);
                }
                int iDp2 = (size - this.textX) - AndroidUtilities.dp(18.0f);
                int iDp3 = AndroidUtilities.dp(44.0f);
                this.buttonX = AndroidUtilities.dp(16.0f);
                int iDp4 = AndroidUtilities.dp(5.0f);
                this.buttonY = iDp4;
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i4 = this.buttonX;
                radialProgress2.setProgressRect(i4, iDp4, i4 + iDp3, iDp4 + iDp3);
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.pageBlockAudio pageblockaudio2 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockaudio2.caption.text, iDp2, this.textY, pageblockaudio2, this.adapter);
                this.captionLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int iDp5 = AndroidUtilities.dp(8.0f) + this.captionLayout.getHeight();
                    this.creditOffset = iDp5;
                    iDp += iDp5 + AndroidUtilities.dp(8.0f);
                }
                int iDp6 = iDp;
                IArticleViewer iArticleViewer2 = this.parent;
                TL_iv.pageBlockAudio pageblockaudio3 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, null, pageblockaudio3.caption.credit, iDp2, this.textY + this.creditOffset, pageblockaudio3, this.adapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, 0, this.adapter);
                this.creditLayout = drawingTextCreateLayoutForText2;
                if (drawingTextCreateLayoutForText2 != null) {
                    iDp6 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                }
                if (!this.isFirst && this.currentBlock.level <= 0) {
                    iDp6 += AndroidUtilities.dp(8.0f);
                }
                String musicAuthor = this.currentMessageObject.getMusicAuthor(false);
                String musicTitle = this.currentMessageObject.getMusicTitle(false);
                int iDp7 = this.buttonX + AndroidUtilities.dp(50.0f) + iDp3;
                this.seekBarX = iDp7;
                int iDp8 = (size - iDp7) - AndroidUtilities.dp(18.0f);
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
                    CharSequence charSequenceEllipsize = TextUtils.ellipsize(spannableStringBuilder, Theme.chat_audioTitlePaint, iDp8, TextUtils.TruncateAt.END);
                    DrawingText drawingText = new DrawingText(this.parent);
                    this.titleLayout = drawingText;
                    drawingText.textLayout = new StaticLayout(charSequenceEllipsize, ArticleViewer.audioTimePaint, iDp8, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.titleLayout.parentBlock = this.currentBlock;
                    this.seekBarY = this.buttonY + ((iDp3 - AndroidUtilities.dp(30.0f)) / 2) + AndroidUtilities.dp(11.0f);
                } else {
                    this.titleLayout = null;
                    this.seekBarY = this.buttonY + ((iDp3 - AndroidUtilities.dp(30.0f)) / 2);
                }
                this.seekBar.setSize(iDp8, AndroidUtilities.dp(30.0f));
                i3 = iDp6;
            }
            setMeasuredDimension(size, i3);
            updatePlayingMessageProgress();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            this.radialProgress.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
            this.radialProgress.setProgressColor(this.parent.getThemedColor(Theme.key_chat_inFileProgress));
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
            int i = 0;
            if (this.titleLayout != null) {
                canvas.save();
                this.titleLayout.x = this.buttonX + AndroidUtilities.dp(54.0f);
                this.titleLayout.y = this.seekBarY - AndroidUtilities.dp(16.0f);
                DrawingText drawingText = this.titleLayout;
                canvas.translate(drawingText.x, drawingText.y);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.titleLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.captionLayout != null) {
                canvas.save();
                DrawingText drawingText2 = this.captionLayout;
                int i2 = this.textX;
                drawingText2.x = i2;
                int i3 = this.textY;
                drawingText2.y = i3;
                canvas.translate(i2, i3);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
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
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
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
                    TLRPC.DocumentAttribute documentAttribute = this.currentDocument.attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i = (int) documentAttribute.duration;
                        break;
                    }
                    i2++;
                }
            } else {
                i = this.currentMessageObject.audioProgressSec;
            }
            String shortDuration = AndroidUtilities.formatShortDuration(i);
            String str = this.lastTimeString;
            if (str == null || !str.equals(shortDuration)) {
                this.lastTimeString = shortDuration;
                ArticleViewer.audioTimePaint.setTextSize(AndroidUtilities.dp(16.0f));
                this.durationLayout = new StaticLayout(shortDuration, ArticleViewer.audioTimePaint, (int) Math.ceil(ArticleViewer.audioTimePaint.measureText(shortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            ArticleViewer.audioTimePaint.setColor(this.parent.getTextColor());
            invalidate();
        }

        public void updateButtonState(boolean z) {
            int currentAccount = this.parent.getCurrentAccount();
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            boolean zExists = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument, true).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (zExists) {
                DownloadController.getInstance(currentAccount).removeLoadingFileObserver(this);
                boolean zIsPlayingMessage = MediaController.getInstance().isPlayingMessage(this.currentMessageObject);
                if (!zIsPlayingMessage || (zIsPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.buttonState = 0;
                } else {
                    this.buttonState = 1;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(currentAccount).addLoadingFileObserver(attachFileName, null, this);
                if (!FileLoader.getInstance(currentAccount).isLoadingFile(attachFileName)) {
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
            int currentAccount = this.parent.getCurrentAccount();
            int i = this.buttonState;
            if (i == 0) {
                if (this.adapter == null || !MediaController.getInstance().setPlaylist(this.adapter.audioMessages, this.currentMessageObject, 0L, false, null)) {
                    return;
                }
                this.buttonState = 1;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
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
            if (i != 2) {
                if (i == 3) {
                    FileLoader.getInstance(currentAccount).cancelLoadFile(this.currentDocument);
                    this.buttonState = 2;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    invalidate();
                    return;
                }
                return;
            }
            this.radialProgress.setProgress(0.0f, false);
            FileLoader fileLoader = FileLoader.getInstance(currentAccount);
            TLRPC.Document document = this.currentDocument;
            WebpageAdapter webpageAdapter = this.adapter;
            fileLoader.loadFile(document, webpageAdapter == null ? null : webpageAdapter.currentPage, 1, 1);
            this.buttonState = 3;
            this.radialProgress.setIcon(getIconForCurrentState(), true, z);
            invalidate();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DownloadController.getInstance(this.parent.getCurrentAccount()).removeLoadingFileObserver(this);
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.captionLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
            DrawingText drawingText3 = this.creditLayout;
            if (drawingText3 != null) {
                drawingText3.detach(this);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateButtonState(false);
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.captionLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
            DrawingText drawingText3 = this.creditLayout;
            if (drawingText3 != null) {
                drawingText3.attach(this);
            }
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
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
            if (this.buttonState != 3) {
                updateButtonState(true);
            }
        }

        @Override
        public int getObserverTag() {
            return this.TAG;
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
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

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVAudio));
            if (this.titleLayout != null) {
                sb.append(", ");
                sb.append(this.titleLayout.getText());
            }
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            if (this.creditLayout != null) {
                sb.append(", ");
                sb.append(this.creditLayout.getText());
            }
            accessibilityNodeInfo.setText(sb);
        }
    }

    public static class BlockEmbedPostCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private final WebpageAdapter adapter;
        private AvatarDrawable avatarDrawable;
        private ImageReceiver avatarImageView;
        private boolean avatarVisible;
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockEmbedPost currentBlock;
        private DrawingText dateLayout;
        private int lineHeight;
        private DrawingText nameLayout;
        private final IArticleViewer parent;
        private int textX;
        private int textY;

        public BlockEmbedPostCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.avatarImageView = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
            this.avatarImageView.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
            this.avatarDrawable = new AvatarDrawable();
        }

        public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
            this.currentBlock = pageblockembedpost;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockEmbedPost pageblockembedpost = this.currentBlock;
            int i3 = 1;
            if (pageblockembedpost != null) {
                if (pageblockembedpost instanceof TL_pageBlockEmbedPostCaption) {
                    this.textX = AndroidUtilities.dp(18.0f);
                    this.textY = AndroidUtilities.dp(4.0f);
                    int iDp = size - AndroidUtilities.dp(50.0f);
                    IArticleViewer iArticleViewer = this.parent;
                    TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.currentBlock;
                    DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockembedpost2.caption.text, iDp, this.textY, pageblockembedpost2, this.adapter);
                    this.captionLayout = drawingTextCreateLayoutForText;
                    if (drawingTextCreateLayoutForText != null) {
                        int iDp2 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                        this.creditOffset = iDp2;
                        iDp = iDp2 + AndroidUtilities.dp(4.0f);
                    }
                    IArticleViewer iArticleViewer2 = this.parent;
                    TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.currentBlock;
                    DrawingText drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, pageblockembedpost3.caption.credit, iDp, this.textY + this.creditOffset, pageblockembedpost3, this.adapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.adapter);
                    this.creditLayout = drawingTextCreateLayoutForText2;
                    if (drawingTextCreateLayoutForText2 != null) {
                        iDp += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    }
                    i3 = iDp;
                } else {
                    long j = pageblockembedpost.author_photo_id;
                    boolean z = j != 0;
                    this.avatarVisible = z;
                    if (z) {
                        TLRPC.Photo photoWithId = this.adapter.getPhotoWithId(j);
                        boolean z2 = photoWithId instanceof TLRPC.TL_photo;
                        this.avatarVisible = z2;
                        if (z2) {
                            this.avatarDrawable.setInfo(0L, this.currentBlock.author, null);
                            this.avatarImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.dp(40.0f), true), photoWithId), "40_40", this.avatarDrawable, 0L, (String) null, this.adapter.currentPage, 1);
                        }
                    }
                    IArticleViewer iArticleViewer3 = this.parent;
                    String str = this.currentBlock.author;
                    int iDp3 = size - AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 50);
                    TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.currentBlock;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    DrawingText drawingTextCreateLayoutForText3 = ArticleViewer.createLayoutForText(iArticleViewer3, this, str, null, iDp3, 0, pageblockembedpost4, alignment, 1, this.adapter);
                    this.nameLayout = drawingTextCreateLayoutForText3;
                    if (drawingTextCreateLayoutForText3 != null) {
                        drawingTextCreateLayoutForText3.x = AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32);
                        this.nameLayout.y = AndroidUtilities.dp(this.dateLayout != null ? 10.0f : 19.0f);
                    }
                    if (this.currentBlock.date != 0) {
                        this.dateLayout = ArticleViewer.createLayoutForText(this.parent, this, LocaleController.getInstance().getChatFullDate().format(this.currentBlock.date * 1000), (TL_iv.RichText) null, size - AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 50), AndroidUtilities.dp(29.0f), this.currentBlock, this.adapter);
                    } else {
                        this.dateLayout = null;
                    }
                    int iDp4 = AndroidUtilities.dp(56.0f);
                    if (this.currentBlock.blocks.isEmpty()) {
                        this.textX = AndroidUtilities.dp(32.0f);
                        this.textY = AndroidUtilities.dp(56.0f);
                        int iDp5 = size - AndroidUtilities.dp(50.0f);
                        IArticleViewer iArticleViewer4 = this.parent;
                        TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.currentBlock;
                        DrawingText drawingTextCreateLayoutForText4 = ArticleViewer.createLayoutForText(iArticleViewer4, this, (CharSequence) null, pageblockembedpost5.caption.text, iDp5, this.textY, pageblockembedpost5, this.adapter);
                        this.captionLayout = drawingTextCreateLayoutForText4;
                        if (drawingTextCreateLayoutForText4 != null) {
                            int iDp6 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                            this.creditOffset = iDp6;
                            iDp4 += iDp6 + AndroidUtilities.dp(4.0f);
                        }
                        int i4 = iDp4;
                        IArticleViewer iArticleViewer5 = this.parent;
                        TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.currentBlock;
                        DrawingText drawingTextCreateLayoutForText5 = ArticleViewer.createLayoutForText(iArticleViewer5, this, (CharSequence) null, pageblockembedpost6.caption.credit, iDp5, this.textY + this.creditOffset, pageblockembedpost6, this.adapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : alignment, this.adapter);
                        this.creditLayout = drawingTextCreateLayoutForText5;
                        iDp4 = drawingTextCreateLayoutForText5 != null ? i4 + AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight() : i4;
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
                    i3 = iDp4;
                }
                this.lineHeight = i3;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            TL_iv.pageBlockEmbedPost pageblockembedpost = this.currentBlock;
            if (pageblockembedpost == null) {
                return;
            }
            if (!(pageblockembedpost instanceof TL_pageBlockEmbedPostCaption)) {
                if (this.avatarVisible) {
                    this.avatarImageView.draw(canvas);
                }
                if (this.nameLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32), AndroidUtilities.dp(this.dateLayout != null ? 10.0f : 19.0f));
                    ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                    this.nameLayout.draw(canvas, this);
                    canvas.restore();
                    i = 1;
                } else {
                    i = 0;
                }
                if (this.dateLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32), AndroidUtilities.dp(29.0f));
                    ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                    this.dateLayout.draw(canvas, this);
                    canvas.restore();
                    i++;
                }
                canvas.drawRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(20.0f), this.lineHeight - (this.currentBlock.level == 0 ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
                i = i;
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i++;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
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

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.nameLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.dateLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
            DrawingText drawingText3 = this.captionLayout;
            if (drawingText3 != null) {
                drawingText3.attach(this);
            }
            DrawingText drawingText4 = this.creditLayout;
            if (drawingText4 != null) {
                drawingText4.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.nameLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.dateLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
            DrawingText drawingText3 = this.captionLayout;
            if (drawingText3 != null) {
                drawingText3.detach(this);
            }
            DrawingText drawingText4 = this.creditLayout;
            if (drawingText4 != null) {
                drawingText4.detach(this);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
            if (this.nameLayout != null) {
                sb.append(", ");
                sb.append(this.nameLayout.getText());
            }
            if (this.dateLayout != null) {
                sb.append(", ");
                sb.append(this.dateLayout.getText());
            }
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            if (this.creditLayout != null) {
                sb.append(", ");
                sb.append(this.creditLayout.getText());
            }
            accessibilityNodeInfo.setText(sb);
        }
    }

    public static class BlockParagraphCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockParagraph currentBlock;
        private final IArticleViewer parent;
        public DrawingText textLayout;
        public int textX;
        public int textY;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockParagraphCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
            this.currentBlock = pageblockparagraph;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            Layout.Alignment alignmentALIGN_RIGHT;
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockParagraph pageblockparagraph = this.currentBlock;
            if (pageblockparagraph != null) {
                i3 = 0;
                if (pageblockparagraph.level == 0) {
                    this.textY = AndroidUtilities.dp(this.parent.pady());
                    this.textX = AndroidUtilities.dp(this.parent.padx());
                } else {
                    this.textY = 0;
                    this.textX = AndroidUtilities.dp(this.parent.padx() + (this.currentBlock.level * 14));
                }
                if (this.currentBlock.text instanceof TL_iv.textMath) {
                    alignmentALIGN_RIGHT = Layout.Alignment.ALIGN_CENTER;
                } else {
                    WebpageAdapter webpageAdapter = this.adapter;
                    alignmentALIGN_RIGHT = (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT();
                }
                Layout.Alignment alignment = alignmentALIGN_RIGHT;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(this.parent, this, null, this.currentBlock.text, (size - AndroidUtilities.dp(r1.padx())) - this.textX, this.textY, this.currentBlock, alignment, 0, this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int height = drawingTextCreateLayoutForText.getHeight();
                    if (this.currentBlock.level > 0) {
                        iDp = AndroidUtilities.dp(this.parent.pady());
                    } else {
                        iDp = AndroidUtilities.dp(this.parent.pady() * 2);
                    }
                    i3 = height + iDp;
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
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText));
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    class BlockEmbedCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockEmbed currentBlock;
        private int exactWebViewHeight;
        private int listX;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;
        private final WebPlayerView videoView;
        private boolean wasUserInteraction;
        private final TouchyWebView webView;

        class TelegramWebviewProxy {
            private TelegramWebviewProxy() {
            }

            @JavascriptInterface
            public void postEvent(final String str, final String str2) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$postEvent$0(str, str2);
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
            public boolean onTouchEvent(MotionEvent motionEvent) throws PackageManager.NameNotFoundException {
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
                        HashMap map = new HashMap();
                        map.put("Referer", ApplicationLoader.applicationContext.getPackageName());
                        BlockEmbedCell.this.webView.loadUrl(BlockEmbedCell.this.currentBlock.url, map);
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
                touchyWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                touchyWebView.addJavascriptInterface(new TelegramWebviewProxy(), "TelegramWebviewProxy");
                touchyWebView.getSettings().setMixedContentMode(0);
                CookieManager.getInstance().setAcceptThirdPartyCookies(touchyWebView, true);
                touchyWebView.setWebChromeClient(new AnonymousClass2(ArticleViewer.this));
                touchyWebView.setWebViewClient(new AnonymousClass3(ArticleViewer.this));
                addView(touchyWebView);
                return;
            }
            this.videoView = null;
            this.webView = null;
        }

        class AnonymousClass2 extends WebChromeClient {
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
                            this.f$0.lambda$onShowCustomView$0();
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

        class AnonymousClass3 extends WebViewClient {
            final ArticleViewer val$this$0;

            AnonymousClass3(ArticleViewer articleViewer) {
                this.val$this$0 = articleViewer;
            }

            @Override
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                try {
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity != null && launchActivity.isFinishing()) {
                        return true;
                    }
                    new AlertDialog.Builder(BlockEmbedCell.this.getContext(), null).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onRenderProcessGone$0();
                        }
                    })).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
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

        public void setBlock(TL_iv.pageBlockEmbed pageblockembed) {
            TL_iv.pageBlockEmbed pageblockembed2 = this.currentBlock;
            this.currentBlock = pageblockembed;
            TouchyWebView touchyWebView = this.webView;
            if (touchyWebView != null) {
                touchyWebView.setBackgroundColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite));
            }
            TL_iv.pageBlockEmbed pageblockembed3 = this.currentBlock;
            if (pageblockembed2 != pageblockembed3) {
                this.wasUserInteraction = false;
                TouchyWebView touchyWebView2 = this.webView;
                if (touchyWebView2 != null) {
                    if (pageblockembed3.allow_scrolling) {
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
                    TL_iv.pageBlockEmbed pageblockembed4 = this.currentBlock;
                    String str = pageblockembed4.html;
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
                        long j = pageblockembed4.poster_photo_id;
                        if (this.videoView.loadVideo(pageblockembed.url, j != 0 ? this.parentAdapter.getPhotoWithId(j) : null, this.parentAdapter.currentPage, null, false)) {
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
                                HashMap map = new HashMap();
                                map.put("Referer", ApplicationLoader.applicationContext.getPackageName());
                                this.webView.loadUrl(this.currentBlock.url, map);
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
            if (!ArticleViewer.this.isVisible) {
                this.currentBlock = null;
            }
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override
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
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbed));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            if (this.creditLayout != null) {
                sb.append(", ");
                sb.append(this.creditLayout.getText());
            }
            accessibilityNodeInfo.setText(sb);
        }
    }

    public static class BlockTableCell extends FrameLayout implements TableLayout.TableLayoutDelegate, TextSelectionHelper.ArticleSelectableView {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockTable currentBlock;
        private boolean firstLayout;
        private int listX;
        private int listY;
        private final IArticleViewer parent;
        private HorizontalScrollView scrollView;
        private float selectionDownX;
        private float selectionDownY;
        private final Runnable selectionLongPress;
        private boolean selectionPending;
        public TableLayout tableLayout;
        private int textX;
        private int textY;
        private DrawingText titleLayout;

        public BlockTableCell(Context context, final IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.selectionLongPress = new Runnable() {
                @Override
                public void run() {
                    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
                    if (BlockTableCell.this.selectionPending) {
                        BlockTableCell.this.selectionPending = false;
                        if (!BlockTableCell.this.parent.canStartSelection(BlockTableCell.this) || (textSelectionHelper = BlockTableCell.this.parent.getTextSelectionHelper(BlockTableCell.this)) == null || textSelectionHelper.isInSelectionMode()) {
                            return;
                        }
                        textSelectionHelper.setMaybeView((int) BlockTableCell.this.selectionDownX, (int) BlockTableCell.this.selectionDownY, BlockTableCell.this);
                        textSelectionHelper.trySelect(BlockTableCell.this);
                        if (textSelectionHelper.isInSelectionMode()) {
                            for (ViewParent parent = BlockTableCell.this.getParent(); parent != null; parent = parent.getParent()) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            try {
                                BlockTableCell.this.performHapticFeedback(0, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            };
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context) {
                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
                    BlockTableCell.this.tableLayout.getMeasuredWidth();
                    getMeasuredWidth();
                    AndroidUtilities.dp(36.0f);
                    return zOnInterceptTouchEvent;
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
                    IArticleViewer iArticleViewer2 = iArticleViewer;
                    if (iArticleViewer2.pressedLinkOwnerLayout != null) {
                        iArticleViewer2.pressedLinkOwnerLayout = null;
                        iArticleViewer2.pressedLinkOwnerView = null;
                    }
                    BlockTableCell.this.updateChildTextPositions();
                    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = iArticleViewer.getTextSelectionHelper(null);
                    if (textSelectionHelper == null || !textSelectionHelper.isInSelectionMode()) {
                        return;
                    }
                    textSelectionHelper.invalidate();
                }

                @Override
                protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
                    ArticleViewer.removePressedLink(iArticleViewer);
                    return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
                }

                @Override
                protected void onMeasure(int i, int i2) {
                    BlockTableCell.this.tableLayout.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), 0), i2);
                    setMeasuredDimension(View.MeasureSpec.getSize(i), BlockTableCell.this.tableLayout.getMeasuredHeight());
                }
            };
            this.scrollView = horizontalScrollView;
            horizontalScrollView.setPadding(AndroidUtilities.dp(iArticleViewer.padx()), 0, AndroidUtilities.dp(iArticleViewer.padx()), 0);
            this.scrollView.setClipToPadding(false);
            addView(this.scrollView, LayoutHelper.createFrame(-1, -2.0f));
            TableLayout tableLayout = new TableLayout(context, this, iArticleViewer.getTextSelectionHelper(null));
            this.tableLayout = tableLayout;
            tableLayout.setOrientation(0);
            this.tableLayout.setRowOrderPreserved(true);
            this.scrollView.addView(this.tableLayout, new FrameLayout.LayoutParams(-2, -2));
            setWillNotDraw(false);
        }

        @Override
        public DrawingText createTextLayout(TL_iv.pageTableCell pagetablecell, int i) {
            Layout.Alignment alignment;
            if (pagetablecell == null) {
                return null;
            }
            if (pagetablecell.align_right) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (pagetablecell.align_center) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            return ArticleViewer.createLayoutForText(this.parent, this, null, pagetablecell.text, i, -1, this.currentBlock, alignment, 0, this.adapter);
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
        public void onLayoutChild(TableLayout.CellText cellText, int i, int i2) {
            if (!(cellText instanceof DrawingText) || this.parent.searchResults.isEmpty() || this.parent.searchText == null) {
                return;
            }
            DrawingText drawingText = (DrawingText) cellText;
            String lowerCase = drawingText.textLayout.getText().toString().toLowerCase();
            int i3 = 0;
            while (true) {
                int iIndexOf = lowerCase.indexOf(this.parent.searchText, i3);
                if (iIndexOf < 0) {
                    return;
                }
                int length = this.parent.searchText.length() + iIndexOf;
                if (iIndexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(iIndexOf - 1))) {
                    HashMap map = this.adapter.searchTextOffset;
                    String str = this.parent.searchText + this.currentBlock + drawingText.parentText + iIndexOf;
                    StaticLayout staticLayout = drawingText.textLayout;
                    map.put(str, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(iIndexOf)) + i2));
                }
                i3 = length;
            }
        }

        public void setBlock(TL_iv.pageBlockTable pageblocktable) throws NoSuchFieldException, SecurityException {
            int i;
            this.currentBlock = pageblocktable;
            AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, this.parent.getThemedColor(Theme.key_windowBackgroundWhite));
            this.tableLayout.removeAllChildrens();
            this.tableLayout.setDrawLines(this.currentBlock.bordered);
            this.tableLayout.setStriped(this.currentBlock.striped);
            TableLayout tableLayout = this.tableLayout;
            WebpageAdapter webpageAdapter = this.adapter;
            tableLayout.setRtl(webpageAdapter != null && webpageAdapter.isRtl);
            if (this.currentBlock.rows.isEmpty()) {
                i = 0;
            } else {
                TL_iv.pageTableRow pagetablerow = this.currentBlock.rows.get(0);
                int size = pagetablerow.cells.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = pagetablerow.cells.get(i2).colspan;
                    if (i3 == 0) {
                        i3 = 1;
                    }
                    i += i3;
                }
            }
            int size2 = this.currentBlock.rows.size();
            for (int i4 = 0; i4 < size2; i4++) {
                TL_iv.pageTableRow pagetablerow2 = this.currentBlock.rows.get(i4);
                int size3 = pagetablerow2.cells.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size3; i6++) {
                    TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i6);
                    int i7 = pagetablecell.colspan;
                    if (i7 == 0) {
                        i7 = 1;
                    }
                    int i8 = pagetablecell.rowspan;
                    if (i8 == 0) {
                        i8 = 1;
                    }
                    if (pagetablecell.text != null) {
                        this.tableLayout.addChild(pagetablecell, i5, i4, i7);
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
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (this.parent.canStartSelection(this)) {
                    this.selectionDownX = motionEvent.getX();
                    this.selectionDownY = motionEvent.getY();
                    this.selectionPending = true;
                    removeCallbacks(this.selectionLongPress);
                    postDelayed(this.selectionLongPress, ViewConfiguration.getLongPressTimeout());
                }
            } else if (actionMasked == 2) {
                if (this.selectionPending) {
                    float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    if (Math.abs(motionEvent.getX() - this.selectionDownX) > scaledTouchSlop || Math.abs(motionEvent.getY() - this.selectionDownY) > scaledTouchSlop) {
                        this.selectionPending = false;
                        removeCallbacks(this.selectionLongPress);
                    }
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.selectionPending = false;
                removeCallbacks(this.selectionLongPress);
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i);
                TableLayout.CellText cellText = childAt.textLayout;
                if ((cellText instanceof DrawingText) && ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, (DrawingText) cellText, (this.scrollView.getPaddingLeft() - this.scrollView.getScrollX()) + this.listX + childAt.getTextX(), this.listY + childAt.getTextY())) {
                    return true;
                }
            }
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.titleLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        public void invalidate() {
            super.invalidate();
            this.tableLayout.invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int measuredHeight;
            int iDp;
            int height;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockTable pageblocktable = this.currentBlock;
            if (pageblocktable != null) {
                if (pageblocktable.level > 0) {
                    int iDp2 = AndroidUtilities.dp(r13 * 14);
                    this.listX = iDp2;
                    iDp = iDp2 + AndroidUtilities.dp(this.parent.padx());
                    this.textX = iDp;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.dp(this.parent.padx());
                    iDp = AndroidUtilities.dp(this.parent.padx() * 2);
                }
                int i3 = size - iDp;
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.pageBlockTable pageblocktable2 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, null, pageblocktable2.title, i3, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.adapter);
                this.titleLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    this.textY = 0;
                    height = drawingTextCreateLayoutForText.getHeight() + AndroidUtilities.dp(8.0f);
                    this.listY = height;
                    DrawingText drawingText = this.titleLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    this.listY = AndroidUtilities.dp(8.0f);
                    height = 0;
                }
                this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size - this.listX, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                measuredHeight = height + this.scrollView.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                TL_iv.pageBlockTable pageblocktable3 = this.currentBlock;
                if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                    measuredHeight += AndroidUtilities.dp(8.0f);
                }
            } else {
                measuredHeight = 1;
            }
            setMeasuredDimension(size, measuredHeight);
            updateChildTextPositions();
        }

        public void updateChildTextPositions() {
            int i = this.titleLayout == null ? 0 : 1;
            int childCount = this.tableLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i2);
                TableLayout.CellText cellText = childAt.textLayout;
                if (cellText != null) {
                    cellText.setX(((childAt.getTextX() + this.listX) + AndroidUtilities.dp(18.0f)) - this.scrollView.getScrollX());
                    childAt.textLayout.setY(childAt.getTextY() + this.listY);
                    childAt.textLayout.setRow(childAt.getRow());
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
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter != null && webpageAdapter.isRtl) {
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
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.titleLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.CellText cellText = this.tableLayout.getChildAt(i).textLayout;
                if (cellText != null) {
                    arrayList.add(cellText);
                }
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.CellText cellText = this.tableLayout.getChildAt(i).textLayout;
                if (cellText != null) {
                    cellText.attach(this);
                }
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.titleLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            int childCount = this.tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TableLayout.CellText cellText = this.tableLayout.getChildAt(i).textLayout;
                if (cellText != null) {
                    cellText.detach(this);
                }
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVTable));
            if (this.titleLayout != null) {
                sb.append(", ");
                sb.append(this.titleLayout.getText());
            }
            accessibilityNodeInfo.setText(sb);
        }
    }

    private class BlockCollageCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockCollage currentBlock;
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
            public ArrayList posArray = new ArrayList();
            public HashMap positions = new HashMap();
            private int maxSizeWidth = 1000;

            public GroupedMessages() {
            }

            private class MessageGroupedLayoutAttempt {
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
                        groupedMessagePosition = view instanceof BlockVideoCell ? (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.positions.get(((BlockVideoCell) view).currentBlock) : null;
                    } else {
                        groupedMessagePosition = (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.positions.get(((BlockPhotoCell) view).currentBlock);
                    }
                    if (groupedMessagePosition == null || groupedMessagePosition.siblingHeights == null) {
                        return;
                    }
                    Point point = AndroidUtilities.displaySize;
                    float fMax = Math.max(point.x, point.y) * 0.5f;
                    int i2 = 0;
                    int iCeil = 0;
                    while (true) {
                        if (i2 >= groupedMessagePosition.siblingHeights.length) {
                            break;
                        }
                        iCeil += (int) Math.ceil(r2[i2] * fMax);
                        i2++;
                    }
                    int iDp2 = iCeil + ((groupedMessagePosition.maxY - groupedMessagePosition.minY) * AndroidUtilities.dp2(11.0f));
                    int size = BlockCollageCell.this.group.posArray.size();
                    while (true) {
                        if (i < size) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.posArray.get(i);
                            byte b = groupedMessagePosition2.minY;
                            byte b2 = groupedMessagePosition.minY;
                            if (b == b2 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b != b2 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b == b2)) {
                                iDp2 -= ((int) Math.ceil(fMax * groupedMessagePosition2.ph)) - AndroidUtilities.dp(4.0f);
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                    rect.bottom = -iDp2;
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
                    MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.positions.get(BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1));
                    if (groupedMessagePosition.minX != groupedMessagePosition.maxX && (b = groupedMessagePosition.minY) == groupedMessagePosition.maxY && b != 0) {
                        int size = BlockCollageCell.this.group.posArray.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.posArray.get(i2);
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
                    return ((MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.positions.get(BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1))).spanSize;
                }
            });
            this.innerListView.setLayoutManager(gridLayoutManagerFixed);
            RecyclerListView recyclerListView2 = this.innerListView;
            RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
                @Override
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    View blockPhotoCell;
                    if (i == 0) {
                        Context context2 = BlockCollageCell.this.getContext();
                        BlockCollageCell blockCollageCell = BlockCollageCell.this;
                        blockPhotoCell = new BlockPhotoCell(context2, ArticleViewer.this, blockCollageCell.parentAdapter, 2);
                    } else {
                        Context context3 = BlockCollageCell.this.getContext();
                        BlockCollageCell blockCollageCell2 = BlockCollageCell.this;
                        blockPhotoCell = new BlockVideoCell(context3, ArticleViewer.this, blockCollageCell2.parentAdapter, 2);
                    }
                    return new RecyclerListView.Holder(blockPhotoCell);
                }

                @Override
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) throws InterruptedException {
                    TL_iv.PageBlock pageBlock = BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1);
                    if (viewHolder.getItemViewType() == 0) {
                        BlockPhotoCell blockPhotoCell = (BlockPhotoCell) viewHolder.itemView;
                        blockPhotoCell.groupPosition = (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.positions.get(pageBlock);
                        blockPhotoCell.setBlock((TL_iv.pageBlockPhoto) pageBlock, BlockCollageCell.this.parentAdapter.currentPage.cached_page, null, false, true);
                    } else {
                        BlockVideoCell blockVideoCell = (BlockVideoCell) viewHolder.itemView;
                        blockVideoCell.groupPosition = (MessageObject.GroupedMessagePosition) BlockCollageCell.this.group.positions.get(pageBlock);
                        TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                        blockVideoCell.setBlock(pageblockvideo, (BlockVideoCellState) ArticleViewer.this.videoStates.get(pageblockvideo.video_id), false, true, true);
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
                    return BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
                }
            };
            this.innerAdapter = adapter;
            recyclerListView2.setAdapter(adapter);
            addView(this.innerListView, LayoutHelper.createFrame(-1, -2.0f));
            setWillNotDraw(false);
        }

        public void setBlock(TL_iv.pageBlockCollage pageblockcollage) {
            if (this.currentBlock != pageblockcollage) {
                this.currentBlock = pageblockcollage;
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
        protected void onMeasure(int i, int i2) {
            int iDp;
            int iDp2;
            int iDp3 = 1;
            this.inLayout = true;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockCollage pageblockcollage = this.currentBlock;
            if (pageblockcollage != null) {
                if (pageblockcollage.level > 0) {
                    int iDp4 = AndroidUtilities.dp(r15 * 14) + AndroidUtilities.dp(18.0f);
                    this.listX = iDp4;
                    this.textX = iDp4;
                    iDp2 = size - (iDp4 + AndroidUtilities.dp(18.0f));
                    iDp = iDp2;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.dp(18.0f);
                    iDp = size - AndroidUtilities.dp(36.0f);
                    iDp2 = size;
                }
                this.innerListView.measure(View.MeasureSpec.makeMeasureSpec(iDp2, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = this.innerListView.getMeasuredHeight();
                int iDp5 = measuredHeight + AndroidUtilities.dp(8.0f);
                this.textY = iDp5;
                ArticleViewer articleViewer = ArticleViewer.this;
                TL_iv.pageBlockCollage pageblockcollage2 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText = articleViewer.createLayoutForText(this, null, pageblockcollage2.caption.text, iDp, iDp5, pageblockcollage2, this.parentAdapter);
                this.captionLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int iDp6 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                    this.creditOffset = iDp6;
                    measuredHeight += iDp6 + AndroidUtilities.dp(4.0f);
                    DrawingText drawingText = this.captionLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    this.creditOffset = 0;
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TL_iv.pageBlockCollage pageblockcollage3 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText2 = articleViewer2.createLayoutForText(this, (CharSequence) null, pageblockcollage3.caption.credit, iDp, this.textY + this.creditOffset, pageblockcollage3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = drawingTextCreateLayoutForText2;
                if (drawingTextCreateLayoutForText2 != null) {
                    measuredHeight += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY + this.creditOffset;
                }
                iDp3 = measuredHeight + AndroidUtilities.dp(16.0f);
                TL_iv.pageBlockCollage pageblockcollage4 = this.currentBlock;
                if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                    iDp3 += AndroidUtilities.dp(8.0f);
                }
            }
            setMeasuredDimension(size, iDp3);
            this.inLayout = false;
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.innerListView.layout(this.listX, AndroidUtilities.dp(8.0f), this.listX + this.innerListView.getMeasuredWidth(), this.innerListView.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
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
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrCollage));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            if (this.creditLayout != null) {
                sb.append(", ");
                sb.append(this.creditLayout.getText());
            }
            accessibilityNodeInfo.setText(sb);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }
    }

    private class BlockSlideshowCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private DrawingText captionLayout;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockSlideshow currentBlock;
        private int currentPage;
        private View dotsContainer;
        private PagerAdapter innerAdapter;
        private ViewPager innerListView;
        private float pageOffset;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;

        public BlockSlideshowCell(Context context, WebpageAdapter webpageAdapter) throws NoSuchFieldException, SecurityException {
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
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws PackageManager.NameNotFoundException {
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
                    private TL_iv.PageBlock block;
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
                public Object instantiateItem(ViewGroup viewGroup, int i) throws InterruptedException {
                    BlockVideoCell blockVideoCell;
                    TL_iv.PageBlock pageBlock = BlockSlideshowCell.this.currentBlock.items.get(i);
                    if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                        Context context2 = BlockSlideshowCell.this.getContext();
                        BlockSlideshowCell blockSlideshowCell = BlockSlideshowCell.this;
                        BlockPhotoCell blockPhotoCell = new BlockPhotoCell(context2, ArticleViewer.this, blockSlideshowCell.parentAdapter, 1);
                        blockPhotoCell.setBlock((TL_iv.pageBlockPhoto) pageBlock, BlockSlideshowCell.this.parentAdapter.currentPage.cached_page, null, false, true);
                        blockVideoCell = blockPhotoCell;
                    } else {
                        Context context3 = BlockSlideshowCell.this.getContext();
                        BlockSlideshowCell blockSlideshowCell2 = BlockSlideshowCell.this;
                        BlockVideoCell blockVideoCell2 = new BlockVideoCell(context3, ArticleViewer.this, blockSlideshowCell2.parentAdapter, 1);
                        TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                        blockVideoCell2.setBlock(pageblockvideo, (BlockVideoCellState) ArticleViewer.this.videoStates.get(pageblockvideo.video_id), false, true, true);
                        blockVideoCell = blockVideoCell2;
                    }
                    viewGroup.addView(blockVideoCell);
                    ObjectContainer objectContainer = new ObjectContainer();
                    objectContainer.view = blockVideoCell;
                    objectContainer.block = pageBlock;
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
                    int measuredWidth;
                    int i;
                    if (BlockSlideshowCell.this.currentBlock == null) {
                        return;
                    }
                    int count = BlockSlideshowCell.this.innerAdapter.getCount();
                    int iDp = (AndroidUtilities.dp(7.0f) * count) + ((count - 1) * AndroidUtilities.dp(6.0f)) + AndroidUtilities.dp(4.0f);
                    if (iDp < getMeasuredWidth()) {
                        measuredWidth = (getMeasuredWidth() - iDp) / 2;
                    } else {
                        int iDp2 = AndroidUtilities.dp(4.0f);
                        int iDp3 = AndroidUtilities.dp(13.0f);
                        int measuredWidth2 = ((getMeasuredWidth() - AndroidUtilities.dp(8.0f)) / 2) / iDp3;
                        int i2 = (count - measuredWidth2) - 1;
                        if (BlockSlideshowCell.this.currentPage != i2 || BlockSlideshowCell.this.pageOffset >= 0.0f) {
                            if (BlockSlideshowCell.this.currentPage >= i2) {
                                i = ((count - (measuredWidth2 * 2)) - 1) * iDp3;
                            } else if (BlockSlideshowCell.this.currentPage > measuredWidth2) {
                                i = ((int) (BlockSlideshowCell.this.pageOffset * iDp3)) + ((BlockSlideshowCell.this.currentPage - measuredWidth2) * iDp3);
                            } else if (BlockSlideshowCell.this.currentPage != measuredWidth2 || BlockSlideshowCell.this.pageOffset <= 0.0f) {
                                measuredWidth = iDp2;
                            } else {
                                i = (int) (BlockSlideshowCell.this.pageOffset * iDp3);
                            }
                            measuredWidth = iDp2 - i;
                        } else {
                            measuredWidth = iDp2 - (((int) (BlockSlideshowCell.this.pageOffset * iDp3)) + (((count - (measuredWidth2 * 2)) - 1) * iDp3));
                        }
                    }
                    int i3 = 0;
                    while (i3 < BlockSlideshowCell.this.currentBlock.items.size()) {
                        int iDp4 = AndroidUtilities.dp(4.0f) + measuredWidth + (AndroidUtilities.dp(13.0f) * i3);
                        Drawable drawable = BlockSlideshowCell.this.currentPage == i3 ? ArticleViewer.this.slideDotBigDrawable : ArticleViewer.this.slideDotDrawable;
                        drawable.setBounds(iDp4 - AndroidUtilities.dp(5.0f), 0, iDp4 + AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f));
                        drawable.draw(canvas);
                        i3++;
                    }
                }
            };
            this.dotsContainer = view;
            addView(view);
            setWillNotDraw(false);
        }

        public void setBlock(TL_iv.pageBlockSlideshow pageblockslideshow) {
            this.currentBlock = pageblockslideshow;
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
        protected void onMeasure(int i, int i2) {
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            if (this.currentBlock != null) {
                int iDp2 = AndroidUtilities.dp(310.0f);
                this.innerListView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp2, 1073741824));
                this.currentBlock.items.size();
                this.dotsContainer.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
                int iDp3 = size - AndroidUtilities.dp(36.0f);
                int iDp4 = iDp2 + AndroidUtilities.dp(16.0f);
                this.textY = iDp4;
                ArticleViewer articleViewer = ArticleViewer.this;
                TL_iv.pageBlockSlideshow pageblockslideshow = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText = articleViewer.createLayoutForText(this, null, pageblockslideshow.caption.text, iDp3, iDp4, pageblockslideshow, this.parentAdapter);
                this.captionLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int iDp5 = AndroidUtilities.dp(4.0f) + this.captionLayout.getHeight();
                    this.creditOffset = iDp5;
                    iDp2 += iDp5 + AndroidUtilities.dp(4.0f);
                    DrawingText drawingText = this.captionLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    this.creditOffset = 0;
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TL_iv.pageBlockSlideshow pageblockslideshow2 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText2 = articleViewer2.createLayoutForText(this, (CharSequence) null, pageblockslideshow2.caption.credit, iDp3, this.textY + this.creditOffset, pageblockslideshow2, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = drawingTextCreateLayoutForText2;
                if (drawingTextCreateLayoutForText2 != null) {
                    iDp2 += AndroidUtilities.dp(4.0f) + this.creditLayout.getHeight();
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY + this.creditOffset;
                }
                iDp = iDp2 + AndroidUtilities.dp(16.0f);
            } else {
                iDp = 1;
            }
            setMeasuredDimension(size, iDp);
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
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVSlideshow));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            if (this.creditLayout != null) {
                sb.append(", ");
                sb.append(this.creditLayout.getText());
            }
            accessibilityNodeInfo.setText(sb);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }
    }

    public static class BlockListItemCell extends ViewGroup implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private RecyclerView.ViewHolder blockLayout;
        private int blockX;
        private int blockY;
        private CheckBoxBase checkbox;
        private TL_pageBlockListItem currentBlock;
        private int currentBlockType;
        private boolean drawDot;
        private int numOffsetY;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;
        private boolean verticalAlign;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockListItemCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
        }

        private int numLayoutX() {
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            if ((tL_pageBlockListItem != null ? tL_pageBlockListItem.numLayout : null) == null) {
                return 0;
            }
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter != null && webpageAdapter.isRtl) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.parent.padx() - 3);
                TL_pageBlockListParent tL_pageBlockListParent = this.currentBlock.parent;
                return (measuredWidth - tL_pageBlockListParent.maxNumWidth) - (tL_pageBlockListParent.level * AndroidUtilities.dp(12.0f));
            }
            return ((AndroidUtilities.dp(this.parent.padx() - 3) + this.currentBlock.parent.maxNumWidth) - ((int) Math.ceil(r0.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.dp(12.0f));
        }

        @Override
        public int getBoundLeft() {
            int boundLeft;
            int iDp = AndroidUtilities.dp(this.parent.padx());
            int iMin = this.checkbox != null ? Math.min(Integer.MAX_VALUE, (this.textX - AndroidUtilities.dp(26.0f)) - iDp) : Integer.MAX_VALUE;
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            if (tL_pageBlockListItem != null && tL_pageBlockListItem.numLayout != null) {
                iMin = Math.min(iMin, (numLayoutX() + this.currentBlock.numLayout.getBoundLeft()) - iDp);
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                iMin = Math.min(iMin, (drawingText.x + drawingText.getBoundLeft()) - iDp);
            }
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                KeyEvent.Callback callback = viewHolder.itemView;
                if ((callback instanceof IBlock) && (boundLeft = ((IBlock) callback).getBoundLeft()) != -1) {
                    iMin = Math.min(iMin, this.blockX + boundLeft);
                }
            }
            if (iMin == Integer.MAX_VALUE) {
                return -1;
            }
            return iMin;
        }

        @Override
        public int getBoundRight() {
            int boundRight;
            int iDp = AndroidUtilities.dp(this.parent.padx());
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            int iMax = (tL_pageBlockListItem == null || tL_pageBlockListItem.numLayout == null) ? Integer.MIN_VALUE : Math.max(Integer.MIN_VALUE, numLayoutX() + this.currentBlock.numLayout.getBoundRight() + iDp);
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                iMax = Math.max(iMax, drawingText.x + drawingText.getBoundRight() + iDp);
            }
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                KeyEvent.Callback callback = viewHolder.itemView;
                if ((callback instanceof IBlock) && (boundRight = ((IBlock) callback).getBoundRight()) != -1) {
                    iMax = Math.max(iMax, this.blockX + boundRight);
                }
            }
            if (iMax == Integer.MIN_VALUE) {
                return -1;
            }
            return iMax;
        }

        @Override
        public int getLastLineBoundRight() {
            int lastLineBoundRight;
            int lastLineBoundRight2;
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    KeyEvent.Callback callback = viewHolder.itemView;
                    if ((callback instanceof IBlock) && (lastLineBoundRight = ((IBlock) callback).getLastLineBoundRight()) != -1) {
                        lastLineBoundRight2 = this.blockX;
                    }
                }
                return -1;
            }
            lastLineBoundRight2 = drawingText.x + drawingText.getLastLineBoundRight();
            lastLineBoundRight = AndroidUtilities.dp(this.parent.padx());
            return lastLineBoundRight2 + lastLineBoundRight;
        }

        public void setBlock(TL_pageBlockListItem tL_pageBlockListItem) throws NoSuchFieldException, SecurityException {
            WebpageAdapter webpageAdapter;
            WebpageAdapter webpageAdapter2;
            if (this.currentBlock != tL_pageBlockListItem) {
                this.currentBlock = tL_pageBlockListItem;
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    removeView(viewHolder.itemView);
                    this.blockLayout = null;
                }
                TL_iv.PageBlock pageBlock = this.currentBlock.blockItem;
                if (pageBlock != null && (webpageAdapter2 = this.adapter) != null) {
                    int typeForBlock = webpageAdapter2.getTypeForBlock(pageBlock);
                    this.currentBlockType = typeForBlock;
                    RecyclerView.ViewHolder viewHolderOnCreateViewHolder = this.adapter.onCreateViewHolder(this, typeForBlock);
                    this.blockLayout = viewHolderOnCreateViewHolder;
                    addView(viewHolderOnCreateViewHolder.itemView);
                }
            }
            TL_iv.PageBlock pageBlock2 = this.currentBlock.blockItem;
            if (pageBlock2 != null && (webpageAdapter = this.adapter) != null) {
                webpageAdapter.bindBlockToHolder(this.currentBlockType, this.blockLayout, pageBlock2, 0, 0, false);
            }
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iDp;
            int iDp2;
            DrawingText drawingText;
            BlockParagraphCell blockParagraphCell;
            DrawingText drawingText2;
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
            int size = View.MeasureSpec.getSize(i);
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            int i3 = 1;
            if (tL_pageBlockListItem != null) {
                this.textLayout = null;
                int iDp3 = 0;
                this.textY = (tL_pageBlockListItem.index == 0 && tL_pageBlockListItem.parent.level == 0) ? AndroidUtilities.dp(this.parent.pady() + 2) : 0;
                this.numOffsetY = 0;
                TL_pageBlockListParent tL_pageBlockListParent = this.currentBlock.parent;
                if (tL_pageBlockListParent.lastMaxNumCalcWidth != size || tL_pageBlockListParent.lastFontSize != SharedConfig.ivFontSize) {
                    tL_pageBlockListParent.lastMaxNumCalcWidth = size;
                    tL_pageBlockListParent.lastFontSize = SharedConfig.ivFontSize;
                    tL_pageBlockListParent.maxNumWidth = 0;
                    int size2 = tL_pageBlockListParent.items.size();
                    boolean z = true;
                    for (int i4 = 0; i4 < size2; i4++) {
                        TL_pageBlockListItem tL_pageBlockListItem2 = (TL_pageBlockListItem) this.currentBlock.parent.items.get(i4);
                        String str = tL_pageBlockListItem2.num;
                        if (str != null) {
                            if (tL_pageBlockListItem2.isCheckbox && "•".equalsIgnoreCase(str)) {
                                tL_pageBlockListItem2.numLayout = null;
                            } else {
                                tL_pageBlockListItem2.numLayout = ArticleViewer.createLayoutForText(this.parent, this, tL_pageBlockListItem2.num, (TL_iv.RichText) null, size - AndroidUtilities.dp(r0.padx() * 3), this.textY, this.currentBlock, this.adapter);
                                TL_pageBlockListParent tL_pageBlockListParent2 = this.currentBlock.parent;
                                tL_pageBlockListParent2.maxNumWidth = Math.max(tL_pageBlockListParent2.maxNumWidth, (int) Math.ceil(r0.getLineWidth(0)));
                                z = false;
                            }
                        }
                    }
                    if (ArticleViewer.listTextNumPaint != null && !z) {
                        TL_pageBlockListParent tL_pageBlockListParent3 = this.currentBlock.parent;
                        tL_pageBlockListParent3.maxNumWidth = Math.max(tL_pageBlockListParent3.maxNumWidth, (int) Math.ceil(ArticleViewer.listTextNumPaint.measureText("00.")));
                    }
                }
                TL_pageBlockListItem tL_pageBlockListItem3 = this.currentBlock;
                this.drawDot = !tL_pageBlockListItem3.parent.pageBlockList.ordered;
                if (tL_pageBlockListItem3.isCheckbox) {
                    if (this.checkbox == null) {
                        CheckBoxBase checkBoxBase = new CheckBoxBase(this, 20, this.parent.getResourcesProvider());
                        this.checkbox = checkBoxBase;
                        checkBoxBase.setColor(Theme.key_telegram_color, Theme.key_dialogCheckboxSquareDisabled, Theme.key_checkboxCheck);
                        this.checkbox.setBackgroundType(10);
                        this.checkbox.setDrawUnchecked(true);
                        this.checkbox.setCustomRadius(AndroidUtilities.dp(5.0f));
                    }
                    this.checkbox.setChecked(this.currentBlock.checked, false);
                } else {
                    this.checkbox = null;
                }
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter == null || !webpageAdapter.isRtl) {
                    int iDp4 = AndroidUtilities.dp(this.parent.padx() + (this.checkbox == null ? 0 : 26) + 6);
                    TL_pageBlockListParent tL_pageBlockListParent4 = this.currentBlock.parent;
                    this.textX = iDp4 + tL_pageBlockListParent4.maxNumWidth + (tL_pageBlockListParent4.level * AndroidUtilities.dp(12.0f));
                } else {
                    this.textX = AndroidUtilities.dp(this.parent.padx() + (this.checkbox == null ? 0 : 26));
                }
                int iDp5 = (size - AndroidUtilities.dp(this.parent.padx())) - this.textX;
                WebpageAdapter webpageAdapter2 = this.adapter;
                if (webpageAdapter2 != null && webpageAdapter2.isRtl) {
                    int iDp6 = AndroidUtilities.dp(6.0f);
                    TL_pageBlockListParent tL_pageBlockListParent5 = this.currentBlock.parent;
                    iDp5 -= (iDp6 + tL_pageBlockListParent5.maxNumWidth) + (tL_pageBlockListParent5.level * AndroidUtilities.dp(12.0f));
                }
                int iDp7 = iDp5;
                TL_pageBlockListItem tL_pageBlockListItem4 = this.currentBlock;
                TL_iv.RichText richText = tL_pageBlockListItem4.textItem;
                if (richText != null) {
                    IArticleViewer iArticleViewer = this.parent;
                    int i5 = this.textY;
                    WebpageAdapter webpageAdapter3 = this.adapter;
                    DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, iDp7, i5, tL_pageBlockListItem4, (webpageAdapter3 == null || !webpageAdapter3.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                    this.textLayout = drawingTextCreateLayoutForText;
                    if (drawingTextCreateLayoutForText != null && drawingTextCreateLayoutForText.getLineCount() > 0) {
                        DrawingText drawingText3 = this.currentBlock.numLayout;
                        if (drawingText3 != null && drawingText3.getLineCount() > 0) {
                            this.numOffsetY = (this.currentBlock.numLayout.getLineAscent(0) + AndroidUtilities.dp(2.5f)) - this.textLayout.getLineAscent(0);
                        }
                        iDp3 = this.textLayout.getHeight() + AndroidUtilities.dp(this.parent.pady());
                    }
                } else {
                    TL_iv.PageBlock pageBlock = tL_pageBlockListItem4.blockItem;
                    if (pageBlock != null) {
                        this.blockX = this.textX;
                        int i6 = this.textY;
                        this.blockY = i6;
                        RecyclerView.ViewHolder viewHolder = this.blockLayout;
                        if (viewHolder != null) {
                            View view = viewHolder.itemView;
                            if (view instanceof BlockParagraphCell) {
                                this.blockY = i6 - AndroidUtilities.dp(this.parent.pady());
                                WebpageAdapter webpageAdapter4 = this.adapter;
                                if (webpageAdapter4 == null || !webpageAdapter4.isRtl) {
                                    this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                }
                                iDp7 += AndroidUtilities.dp(this.parent.padx());
                                iDp2 = 0 - AndroidUtilities.dp(this.parent.pady());
                            } else {
                                if ((view instanceof BlockHeaderCell) || (view instanceof BlockSubheaderCell) || (view instanceof BlockTitleCell) || (view instanceof BlockSubtitleCell)) {
                                    WebpageAdapter webpageAdapter5 = this.adapter;
                                    if (webpageAdapter5 == null || !webpageAdapter5.isRtl) {
                                        this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                    }
                                    iDp = AndroidUtilities.dp(this.parent.padx());
                                } else if (ArticleViewer.isListItemBlock(pageBlock)) {
                                    this.blockX = 0;
                                    this.blockY = 0;
                                    this.textY = 0;
                                    TL_pageBlockListItem tL_pageBlockListItem5 = this.currentBlock;
                                    iDp2 = ((tL_pageBlockListItem5.index == 0 && tL_pageBlockListItem5.parent.level == 0) ? 0 - AndroidUtilities.dp(this.parent.pady() + 2) : 0) - AndroidUtilities.dp(this.parent.pady());
                                    iDp7 = size;
                                } else {
                                    if (this.blockLayout.itemView instanceof BlockTableCell) {
                                        this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                        iDp = AndroidUtilities.dp(this.parent.padx() * 2);
                                    }
                                    iDp2 = 0;
                                }
                                iDp7 += iDp;
                                iDp2 = 0;
                            }
                            this.blockLayout.itemView.measure(View.MeasureSpec.makeMeasureSpec(iDp7, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            if ((this.blockLayout.itemView instanceof BlockParagraphCell) && (drawingText = this.currentBlock.numLayout) != null && drawingText.getLineCount() > 0 && (drawingText2 = (blockParagraphCell = (BlockParagraphCell) this.blockLayout.itemView).textLayout) != null && drawingText2.getLineCount() > 0) {
                                this.numOffsetY = (this.currentBlock.numLayout.getLineAscent(0) + AndroidUtilities.dp(2.5f)) - blockParagraphCell.textLayout.getLineAscent(0);
                            }
                            TL_pageBlockListItem tL_pageBlockListItem6 = this.currentBlock;
                            if (tL_pageBlockListItem6.blockItem instanceof TL_iv.pageBlockDetails) {
                                this.verticalAlign = true;
                                this.blockY = 0;
                                if (tL_pageBlockListItem6.index == 0 && tL_pageBlockListItem6.parent.level == 0) {
                                    iDp2 -= AndroidUtilities.dp(this.parent.pady() + 2);
                                }
                                iDp2 -= AndroidUtilities.dp(this.parent.pady());
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
                            iDp3 = iDp2 + this.blockLayout.itemView.getMeasuredHeight();
                        }
                        iDp3 += AndroidUtilities.dp(this.parent.pady());
                    }
                }
                ArrayList arrayList = this.currentBlock.parent.items;
                if (arrayList.get(arrayList.size() - 1) == this.currentBlock) {
                    iDp3 += AndroidUtilities.dp(this.parent.pady());
                }
                TL_pageBlockListItem tL_pageBlockListItem7 = this.currentBlock;
                if (tL_pageBlockListItem7.index == 0 && tL_pageBlockListItem7.parent.level == 0) {
                    iDp3 += AndroidUtilities.dp(this.parent.pady() + 2);
                }
                i3 = iDp3;
                DrawingText drawingText4 = this.textLayout;
                if (drawingText4 != null) {
                    drawingText4.x = this.textX;
                    drawingText4.y = this.textY;
                }
                RecyclerView.ViewHolder viewHolder2 = this.blockLayout;
                if (viewHolder2 != null && (viewHolder2.itemView instanceof TextSelectionHelper.ArticleSelectableView) && (textSelectionHelper = this.parent.getTextSelectionHelper(null)) != null) {
                    textSelectionHelper.arrayList.clear();
                    ((TextSelectionHelper.ArticleSelectableView) this.blockLayout.itemView).fillTextLayoutBlocks(textSelectionHelper.arrayList);
                    Iterator it = textSelectionHelper.arrayList.iterator();
                    while (it.hasNext()) {
                        TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) it.next();
                        if (textLayoutBlock instanceof DrawingText) {
                            DrawingText drawingText5 = (DrawingText) textLayoutBlock;
                            drawingText5.x += this.blockX;
                            drawingText5.y += this.blockY;
                        }
                    }
                }
            }
            setMeasuredDimension(size, i3);
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
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter != null && webpageAdapter.isRtl) {
                    int iDp = measuredWidth - AndroidUtilities.dp(this.parent.padx() - 3);
                    TL_pageBlockListParent tL_pageBlockListParent = this.currentBlock.parent;
                    canvas.translate((iDp - tL_pageBlockListParent.maxNumWidth) - (tL_pageBlockListParent.level * AndroidUtilities.dp(12.0f)), (this.textY + this.numOffsetY) - (this.drawDot ? AndroidUtilities.dp(1.0f) : 0));
                } else {
                    int iDp2 = AndroidUtilities.dp(this.parent.padx() - 3);
                    TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
                    canvas.translate(((iDp2 + tL_pageBlockListItem.parent.maxNumWidth) - ((int) Math.ceil(tL_pageBlockListItem.numLayout.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.dp(12.0f)), (this.textY + this.numOffsetY) - (this.drawDot ? AndroidUtilities.dp(1.0f) : 0));
                }
                this.currentBlock.numLayout.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.checkbox;
            if (checkBoxBase != null) {
                checkBoxBase.setBounds(this.textX - AndroidUtilities.dp(26.0f), this.textY, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.checkbox.draw(canvas);
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
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
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText));
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
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

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockOrderedListItemCell extends ViewGroup implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private RecyclerView.ViewHolder blockLayout;
        private int blockX;
        private int blockY;
        private CheckBoxBase checkbox;
        private TL_pageBlockOrderedListItem currentBlock;
        private int currentBlockType;
        private int numOffsetY;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;
        private boolean verticalAlign;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockOrderedListItemCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
        }

        private int numLayoutX() {
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            if ((tL_pageBlockOrderedListItem != null ? tL_pageBlockOrderedListItem.numLayout : null) == null) {
                return 0;
            }
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter != null && webpageAdapter.isRtl) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.parent.padx());
                TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = this.currentBlock.parent;
                return (measuredWidth - tL_pageBlockOrderedListParent.maxNumWidth) - (tL_pageBlockOrderedListParent.level * AndroidUtilities.dp(20.0f));
            }
            return ((AndroidUtilities.dp(this.parent.padx()) + this.currentBlock.parent.maxNumWidth) - ((int) Math.ceil(r0.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.dp(20.0f));
        }

        @Override
        public int getBoundLeft() {
            int boundLeft;
            int iDp = AndroidUtilities.dp(this.parent.padx());
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            int iMin = (tL_pageBlockOrderedListItem == null || tL_pageBlockOrderedListItem.numLayout == null) ? Integer.MAX_VALUE : Math.min(Integer.MAX_VALUE, (numLayoutX() + this.currentBlock.numLayout.getBoundLeft()) - iDp);
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                iMin = Math.min(iMin, (drawingText.x + drawingText.getBoundLeft()) - iDp);
            }
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                KeyEvent.Callback callback = viewHolder.itemView;
                if ((callback instanceof IBlock) && (boundLeft = ((IBlock) callback).getBoundLeft()) != -1) {
                    iMin = Math.min(iMin, this.blockX + boundLeft);
                }
            }
            if (iMin == Integer.MAX_VALUE) {
                return -1;
            }
            return iMin;
        }

        @Override
        public int getBoundRight() {
            int boundRight;
            int iDp = AndroidUtilities.dp(this.parent.padx());
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            int iMax = (tL_pageBlockOrderedListItem == null || tL_pageBlockOrderedListItem.numLayout == null) ? Integer.MIN_VALUE : Math.max(Integer.MIN_VALUE, numLayoutX() + this.currentBlock.numLayout.getBoundRight() + iDp);
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                iMax = Math.max(iMax, drawingText.x + drawingText.getBoundRight() + iDp);
            }
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                KeyEvent.Callback callback = viewHolder.itemView;
                if ((callback instanceof IBlock) && (boundRight = ((IBlock) callback).getBoundRight()) != -1) {
                    iMax = Math.max(iMax, this.blockX + boundRight);
                }
            }
            if (iMax == Integer.MIN_VALUE) {
                return -1;
            }
            return iMax;
        }

        @Override
        public int getLastLineBoundRight() {
            int lastLineBoundRight;
            int lastLineBoundRight2;
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    KeyEvent.Callback callback = viewHolder.itemView;
                    if ((callback instanceof IBlock) && (lastLineBoundRight = ((IBlock) callback).getLastLineBoundRight()) != -1) {
                        lastLineBoundRight2 = this.blockX;
                    }
                }
                return -1;
            }
            lastLineBoundRight2 = drawingText.x + drawingText.getLastLineBoundRight();
            lastLineBoundRight = AndroidUtilities.dp(this.parent.padx());
            return lastLineBoundRight2 + lastLineBoundRight;
        }

        public void setBlock(TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem) throws NoSuchFieldException, SecurityException {
            WebpageAdapter webpageAdapter;
            WebpageAdapter webpageAdapter2;
            if (this.currentBlock != tL_pageBlockOrderedListItem) {
                this.currentBlock = tL_pageBlockOrderedListItem;
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    removeView(viewHolder.itemView);
                    this.blockLayout = null;
                }
                TL_iv.PageBlock pageBlock = this.currentBlock.blockItem;
                if (pageBlock != null && (webpageAdapter2 = this.adapter) != null) {
                    int typeForBlock = webpageAdapter2.getTypeForBlock(pageBlock);
                    this.currentBlockType = typeForBlock;
                    RecyclerView.ViewHolder viewHolderOnCreateViewHolder = this.adapter.onCreateViewHolder(this, typeForBlock);
                    this.blockLayout = viewHolderOnCreateViewHolder;
                    addView(viewHolderOnCreateViewHolder.itemView);
                }
            }
            TL_iv.PageBlock pageBlock2 = this.currentBlock.blockItem;
            if (pageBlock2 != null && (webpageAdapter = this.adapter) != null) {
                webpageAdapter.bindBlockToHolder(this.currentBlockType, this.blockLayout, pageBlock2, 0, 0, false);
            }
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iDp;
            int iDp2;
            DrawingText drawingText;
            BlockParagraphCell blockParagraphCell;
            DrawingText drawingText2;
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
            int size = View.MeasureSpec.getSize(i);
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            int i3 = 1;
            if (tL_pageBlockOrderedListItem != null) {
                this.textLayout = null;
                int iDp3 = 0;
                this.textY = (tL_pageBlockOrderedListItem.index == 0 && tL_pageBlockOrderedListItem.parent.level == 0) ? AndroidUtilities.dp(10.0f) : 0;
                this.numOffsetY = 0;
                TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = this.currentBlock.parent;
                if (tL_pageBlockOrderedListParent.lastMaxNumCalcWidth != size || tL_pageBlockOrderedListParent.lastFontSize != SharedConfig.ivFontSize) {
                    tL_pageBlockOrderedListParent.lastMaxNumCalcWidth = size;
                    tL_pageBlockOrderedListParent.lastFontSize = SharedConfig.ivFontSize;
                    tL_pageBlockOrderedListParent.maxNumWidth = 0;
                    int size2 = tL_pageBlockOrderedListParent.items.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = (TL_pageBlockOrderedListItem) this.currentBlock.parent.items.get(i4);
                        String str = tL_pageBlockOrderedListItem2.num;
                        if (str != null) {
                            tL_pageBlockOrderedListItem2.numLayout = ArticleViewer.createLayoutForText(this.parent, this, str, (TL_iv.RichText) null, size - AndroidUtilities.dp(r0.padx() * 3), this.textY, this.currentBlock, this.adapter);
                            TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent2 = this.currentBlock.parent;
                            tL_pageBlockOrderedListParent2.maxNumWidth = Math.max(tL_pageBlockOrderedListParent2.maxNumWidth, (int) Math.ceil(r0.getLineWidth(0)));
                        }
                    }
                    TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent3 = this.currentBlock.parent;
                    tL_pageBlockOrderedListParent3.maxNumWidth = Math.max(tL_pageBlockOrderedListParent3.maxNumWidth, (int) Math.ceil(ArticleViewer.listTextNumPaint.measureText("00.")));
                }
                if (this.currentBlock.isCheckbox) {
                    if (this.checkbox == null) {
                        CheckBoxBase checkBoxBase = new CheckBoxBase(this, 20, this.parent.getResourcesProvider());
                        this.checkbox = checkBoxBase;
                        checkBoxBase.setColor(Theme.key_telegram_color, Theme.key_dialogCheckboxSquareDisabled, Theme.key_checkboxCheck);
                        this.checkbox.setBackgroundType(10);
                        this.checkbox.setDrawUnchecked(true);
                        this.checkbox.setCustomRadius(AndroidUtilities.dp(5.0f));
                    }
                    this.checkbox.setChecked(this.currentBlock.checked, false);
                } else {
                    this.checkbox = null;
                }
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter == null || !webpageAdapter.isRtl) {
                    int iDp4 = AndroidUtilities.dp(this.parent.padx() + (this.checkbox == null ? 0 : 26) + 6);
                    TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent4 = this.currentBlock.parent;
                    this.textX = iDp4 + tL_pageBlockOrderedListParent4.maxNumWidth + (tL_pageBlockOrderedListParent4.level * AndroidUtilities.dp(20.0f));
                } else {
                    this.textX = AndroidUtilities.dp(this.parent.padx() + (this.checkbox == null ? 0 : 26));
                }
                this.verticalAlign = false;
                int iDp5 = (size - AndroidUtilities.dp(this.parent.padx())) - this.textX;
                WebpageAdapter webpageAdapter2 = this.adapter;
                if (webpageAdapter2 != null && webpageAdapter2.isRtl) {
                    int iDp6 = AndroidUtilities.dp(6.0f);
                    TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent5 = this.currentBlock.parent;
                    iDp5 -= (iDp6 + tL_pageBlockOrderedListParent5.maxNumWidth) + (tL_pageBlockOrderedListParent5.level * AndroidUtilities.dp(20.0f));
                }
                int iDp7 = iDp5;
                TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem3 = this.currentBlock;
                TL_iv.RichText richText = tL_pageBlockOrderedListItem3.textItem;
                if (richText != null) {
                    IArticleViewer iArticleViewer = this.parent;
                    int i5 = this.textY;
                    WebpageAdapter webpageAdapter3 = this.adapter;
                    DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, iDp7, i5, tL_pageBlockOrderedListItem3, (webpageAdapter3 == null || !webpageAdapter3.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                    this.textLayout = drawingTextCreateLayoutForText;
                    if (drawingTextCreateLayoutForText != null && drawingTextCreateLayoutForText.getLineCount() > 0) {
                        DrawingText drawingText3 = this.currentBlock.numLayout;
                        if (drawingText3 != null && drawingText3.getLineCount() > 0) {
                            this.numOffsetY = this.currentBlock.numLayout.getLineAscent(0) - this.textLayout.getLineAscent(0);
                        }
                        iDp3 = this.textLayout.getHeight() + AndroidUtilities.dp(8.0f);
                    }
                } else {
                    TL_iv.PageBlock pageBlock = tL_pageBlockOrderedListItem3.blockItem;
                    if (pageBlock != null) {
                        this.blockX = this.textX;
                        int i6 = this.textY;
                        this.blockY = i6;
                        RecyclerView.ViewHolder viewHolder = this.blockLayout;
                        if (viewHolder != null) {
                            View view = viewHolder.itemView;
                            if (view instanceof BlockParagraphCell) {
                                this.blockY = i6 - AndroidUtilities.dp(8.0f);
                                WebpageAdapter webpageAdapter4 = this.adapter;
                                if (webpageAdapter4 == null || !webpageAdapter4.isRtl) {
                                    this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                }
                                iDp7 += AndroidUtilities.dp(18.0f);
                                iDp2 = 0 - AndroidUtilities.dp(8.0f);
                            } else {
                                if ((view instanceof BlockHeaderCell) || (view instanceof BlockSubheaderCell) || (view instanceof BlockTitleCell) || (view instanceof BlockSubtitleCell)) {
                                    WebpageAdapter webpageAdapter5 = this.adapter;
                                    if (webpageAdapter5 == null || !webpageAdapter5.isRtl) {
                                        this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                    }
                                    iDp = AndroidUtilities.dp(this.parent.padx());
                                } else if (ArticleViewer.isListItemBlock(pageBlock)) {
                                    this.blockX = 0;
                                    this.blockY = 0;
                                    this.textY = 0;
                                    iDp2 = 0 - AndroidUtilities.dp(8.0f);
                                    iDp7 = size;
                                } else {
                                    if (this.blockLayout.itemView instanceof BlockTableCell) {
                                        this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                        iDp = AndroidUtilities.dp(36.0f);
                                    }
                                    iDp2 = 0;
                                }
                                iDp7 += iDp;
                                iDp2 = 0;
                            }
                            this.blockLayout.itemView.measure(View.MeasureSpec.makeMeasureSpec(iDp7, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            if ((this.blockLayout.itemView instanceof BlockParagraphCell) && (drawingText = this.currentBlock.numLayout) != null && drawingText.getLineCount() > 0 && (drawingText2 = (blockParagraphCell = (BlockParagraphCell) this.blockLayout.itemView).textLayout) != null && drawingText2.getLineCount() > 0) {
                                this.numOffsetY = this.currentBlock.numLayout.getLineAscent(0) - blockParagraphCell.textLayout.getLineAscent(0);
                            }
                            if (this.currentBlock.blockItem instanceof TL_iv.pageBlockDetails) {
                                this.verticalAlign = true;
                                this.blockY = 0;
                                iDp2 -= AndroidUtilities.dp(8.0f);
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
                            iDp3 = iDp2 + this.blockLayout.itemView.getMeasuredHeight();
                        }
                        iDp3 += AndroidUtilities.dp(8.0f);
                    }
                }
                ArrayList arrayList = this.currentBlock.parent.items;
                if (arrayList.get(arrayList.size() - 1) == this.currentBlock) {
                    iDp3 += AndroidUtilities.dp(8.0f);
                }
                TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem4 = this.currentBlock;
                if (tL_pageBlockOrderedListItem4.index == 0 && tL_pageBlockOrderedListItem4.parent.level == 0) {
                    iDp3 += AndroidUtilities.dp(10.0f);
                }
                i3 = iDp3;
                DrawingText drawingText4 = this.textLayout;
                if (drawingText4 != null) {
                    drawingText4.x = this.textX;
                    drawingText4.y = this.textY;
                    DrawingText drawingText5 = this.currentBlock.numLayout;
                    if (drawingText5 != null) {
                        drawingText4.prefix = drawingText5.textLayout.getText();
                    }
                }
                RecyclerView.ViewHolder viewHolder2 = this.blockLayout;
                if (viewHolder2 != null && (viewHolder2.itemView instanceof TextSelectionHelper.ArticleSelectableView) && (textSelectionHelper = this.parent.getTextSelectionHelper(null)) != null) {
                    textSelectionHelper.arrayList.clear();
                    ((TextSelectionHelper.ArticleSelectableView) this.blockLayout.itemView).fillTextLayoutBlocks(textSelectionHelper.arrayList);
                    Iterator it = textSelectionHelper.arrayList.iterator();
                    while (it.hasNext()) {
                        TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) it.next();
                        if (textLayoutBlock instanceof DrawingText) {
                            DrawingText drawingText6 = (DrawingText) textLayoutBlock;
                            drawingText6.x += this.blockX;
                            drawingText6.y += this.blockY;
                        }
                    }
                }
            }
            setMeasuredDimension(size, i3);
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
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter != null && webpageAdapter.isRtl) {
                    int iDp = measuredWidth - AndroidUtilities.dp(this.parent.padx());
                    TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = this.currentBlock.parent;
                    canvas.translate((iDp - tL_pageBlockOrderedListParent.maxNumWidth) - (tL_pageBlockOrderedListParent.level * AndroidUtilities.dp(20.0f)), this.textY + this.numOffsetY);
                } else {
                    int iDp2 = AndroidUtilities.dp(this.parent.padx());
                    TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
                    canvas.translate(((iDp2 + tL_pageBlockOrderedListItem.parent.maxNumWidth) - ((int) Math.ceil(tL_pageBlockOrderedListItem.numLayout.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.dp(20.0f)), this.textY + this.numOffsetY);
                }
                this.currentBlock.numLayout.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.checkbox;
            if (checkBoxBase != null) {
                checkBoxBase.setBounds(this.textX - AndroidUtilities.dp(26.0f), this.textY, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.checkbox.draw(canvas);
            }
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
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
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText));
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
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

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockDetailsCell extends View implements Drawable.Callback, TextSelectionHelper.ArticleSelectableView {
        private final WebpageAdapter adapter;
        private AnimatedArrowDrawable arrow;
        private TL_iv.pageBlockDetails currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        public BlockDetailsCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            this.arrow = new AnimatedArrowDrawable(iArticleViewer.getGrayTextColor(), true);
        }

        @Override
        public void invalidateDrawable(Drawable drawable) {
            invalidate();
        }

        public void setBlock(TL_iv.pageBlockDetails pageblockdetails) {
            this.currentBlock = pageblockdetails;
            this.arrow.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
            this.arrow.setCallback(this);
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int iDp = AndroidUtilities.dp(39.0f);
            this.textX = AndroidUtilities.dp(50.0f);
            this.textY = AndroidUtilities.dp(11.0f) + 1;
            TL_iv.pageBlockDetails pageblockdetails = this.currentBlock;
            if (pageblockdetails != null) {
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = pageblockdetails.title;
                int iDp2 = size - AndroidUtilities.dp(iArticleViewer.padx() * 3);
                TL_iv.pageBlockDetails pageblockdetails2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, iDp2, 0, pageblockdetails2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    iDp = Math.max(iDp, AndroidUtilities.dp(21.0f) + this.textLayout.getHeight());
                    int height = ((this.textLayout.getHeight() + AndroidUtilities.dp(21.0f)) - this.textLayout.getHeight()) / 2;
                    this.textY = height;
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = height;
                }
            }
            setMeasuredDimension(size, iDp + 1);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            canvas.save();
            canvas.translate(AndroidUtilities.dp(this.parent.padx()), ((getMeasuredHeight() - AndroidUtilities.dp(13.0f)) - 1) / 2);
            this.arrow.draw(canvas);
            canvas.restore();
            if (this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
            float measuredHeight = getMeasuredHeight() - 1;
            canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, ArticleViewer.dividerPaint);
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            CharSequence charSequenceBuildAccessibilityText;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null && (charSequenceBuildAccessibilityText = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText)) != null) {
                spannableStringBuilder.append(charSequenceBuildAccessibilityText).append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AccDescrIVDetails)).append((CharSequence) ", ");
            TL_iv.pageBlockDetails pageblockdetails = this.currentBlock;
            spannableStringBuilder.append((CharSequence) LocaleController.getString((pageblockdetails == null || !pageblockdetails.open) ? R.string.AccDescrIVCollapsed : R.string.AccDescrIVExpanded));
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockDetailsBottomCell extends View {
        private final RectF rect;

        public BlockDetailsBottomCell(Context context) {
            super(context);
            this.rect = new RectF();
            setImportantForAccessibility(2);
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

    public static class BlockRelatedArticlesShadowCell extends View {
        private final IArticleViewer parent;
        private CombinedDrawable shadowDrawable;

        public BlockRelatedArticlesShadowCell(Context context, IArticleViewer iArticleViewer) {
            super(context);
            this.parent = iArticleViewer;
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(iArticleViewer.getThemedColor(Theme.key_iv_backgroundGray)), Theme.getThemedDrawable(context, R.drawable.greydivider_bottom, -16777216));
            this.shadowDrawable = combinedDrawable;
            combinedDrawable.setFullsize(true);
            setBackgroundDrawable(this.shadowDrawable);
            setImportantForAccessibility(2);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(12.0f));
            Theme.setCombinedDrawableColor(this.shadowDrawable, this.parent.getThemedColor(Theme.key_iv_backgroundGray), false);
        }
    }

    public static class BlockRelatedArticlesHeaderCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockRelatedArticles currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockRelatedArticlesHeaderCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
            this.currentBlock = pageblockrelatedarticles;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.currentBlock;
            if (pageblockrelatedarticles != null) {
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(this.parent, this, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 1, this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
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
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVRelatedArticles));
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockRelatedArticlesCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private final WebpageAdapter adapter;
        private TL_pageBlockRelatedArticlesChild currentBlock;
        private TLObject currentPage;
        private boolean divider;
        private boolean drawImage;
        private ImageReceiver imageView;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textOffset;
        private int textX;
        private int textY;

        public BlockRelatedArticlesCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(10.0f);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.imageView = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        }

        public void setBlock(TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild, TLObject tLObject) {
            this.currentBlock = tL_pageBlockRelatedArticlesChild;
            this.currentPage = tLObject;
            requestLayout();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            TLRPC.Photo photoWithId;
            int i3;
            boolean z;
            int i4;
            String string;
            int size = View.MeasureSpec.getSize(i);
            TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = this.currentBlock;
            this.divider = tL_pageBlockRelatedArticlesChild.num != tL_pageBlockRelatedArticlesChild.parent.articles.size() - 1;
            TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild2 = this.currentBlock;
            TL_iv.pageRelatedArticle pagerelatedarticle = tL_pageBlockRelatedArticlesChild2.parent.articles.get(tL_pageBlockRelatedArticlesChild2.num);
            int iDp = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
            long j = pagerelatedarticle.photo_id;
            if (j != 0) {
                WebpageAdapter webpageAdapter = this.adapter;
                photoWithId = webpageAdapter != null ? webpageAdapter.getPhotoWithId(j) : WebPageUtils.getPhotoWithId(this.currentPage, j);
            } else {
                photoWithId = null;
            }
            if (photoWithId != null) {
                this.drawImage = true;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, 80, true);
                this.imageView.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photoWithId), "64_64", ImageLocation.getForPhoto(closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null, photoWithId), "64_64_b", closestPhotoSizeWithSize.size, null, this.currentPage, 1);
            } else {
                this.drawImage = false;
            }
            int iDp2 = AndroidUtilities.dp(60.0f);
            int iDp3 = size - AndroidUtilities.dp(36.0f);
            if (this.drawImage) {
                float fDp = AndroidUtilities.dp(44.0f);
                this.imageView.setImageCoords((size - r1) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), fDp, fDp);
                iDp3 = (int) (iDp3 - (this.imageView.getImageWidth() + AndroidUtilities.dp(6.0f)));
            }
            int i5 = iDp3;
            int iDp4 = AndroidUtilities.dp(18.0f);
            String str = pagerelatedarticle.title;
            if (str != null) {
                i3 = iDp2;
                this.textLayout = ArticleViewer.createLayoutForText(this.parent, this, str, null, i5, this.textY, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 3, this.adapter);
            } else {
                i3 = iDp2;
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                int lineCount = drawingText.getLineCount();
                int i6 = 4 - lineCount;
                this.textOffset = this.textLayout.getHeight() + AndroidUtilities.dp(6.0f) + iDp;
                iDp4 += this.textLayout.getHeight();
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
            if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
                string = LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000), pagerelatedarticle.author);
            } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
                string = LocaleController.formatString(R.string.ArticleByAuthor, pagerelatedarticle.author);
            } else if (pagerelatedarticle.published_date != 0) {
                string = LocaleController.getInstance().getChatFullDate().format(pagerelatedarticle.published_date * 1000);
            } else if (!TextUtils.isEmpty(pagerelatedarticle.description)) {
                string = pagerelatedarticle.description;
            } else {
                string = pagerelatedarticle.url;
            }
            String str2 = string;
            IArticleViewer iArticleViewer = this.parent;
            int i8 = this.textY + this.textOffset;
            TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild3 = this.currentBlock;
            WebpageAdapter webpageAdapter2 = this.adapter;
            DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, str2, null, i5, i8, tL_pageBlockRelatedArticlesChild3, ((webpageAdapter2 == null || !webpageAdapter2.isRtl) && !z) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), i4, this.adapter);
            this.textLayout2 = drawingTextCreateLayoutForText;
            if (drawingTextCreateLayoutForText != null) {
                iDp4 += drawingTextCreateLayoutForText.getHeight();
                if (this.textLayout != null) {
                    iDp4 += AndroidUtilities.dp(6.0f) + iDp;
                }
                DrawingText drawingText3 = this.textLayout2;
                drawingText3.x = this.textX;
                drawingText3.y = this.textY + this.textOffset;
            }
            setMeasuredDimension(size, Math.max(i3, iDp4) + (this.divider ? 1 : 0));
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
            int iDp = 0;
            if (this.textLayout != null) {
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.textLayout.draw(canvas, this);
                i = 1;
            } else {
                i = 0;
            }
            if (this.textLayout2 != null) {
                canvas.translate(0.0f, this.textOffset);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.textLayout2.draw(canvas, this);
            }
            canvas.restore();
            if (this.divider) {
                WebpageAdapter webpageAdapter = this.adapter;
                float fDp = (webpageAdapter == null || !webpageAdapter.isRtl) ? AndroidUtilities.dp(17.0f) : 0.0f;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                WebpageAdapter webpageAdapter2 = this.adapter;
                if (webpageAdapter2 != null && webpageAdapter2.isRtl) {
                    iDp = AndroidUtilities.dp(17.0f);
                }
                canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, ArticleViewer.dividerPaint);
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            CharSequence charSequenceBuildAccessibilityText;
            CharSequence charSequenceBuildAccessibilityText2;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null && (charSequenceBuildAccessibilityText2 = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText)) != null) {
                spannableStringBuilder.append(charSequenceBuildAccessibilityText2);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null && (charSequenceBuildAccessibilityText = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText2)) != null) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append(charSequenceBuildAccessibilityText);
            }
            if (spannableStringBuilder.length() == 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVRelatedArticle));
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }
    }

    public static class BlockHeaderCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.PageBlock currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockHeaderCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        public void setBlock(TL_iv.PageBlock pageBlock) {
            this.currentBlock = pageBlock;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            this.textY = AndroidUtilities.dp(this.parent.pady());
            TL_iv.PageBlock pageBlock = this.currentBlock;
            if (pageBlock != null) {
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = pageBlock.text;
                int iDp2 = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i3 = this.textY;
                TL_iv.PageBlock pageBlock2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, iDp2, i3, pageBlock2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    iDp = AndroidUtilities.dp(this.parent.pady() * 2) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    iDp = 0;
                }
            } else {
                iDp = 1;
            }
            setMeasuredDimension(size, iDp);
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (this.textX + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return this.textX + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return this.textX + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
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
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVHeading));
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockDividerCell extends View {
        private final RectF rect;

        public BlockDividerCell(Context context) {
            super(context);
            this.rect = new RectF();
            setImportantForAccessibility(2);
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

    public static class BlockSubtitleCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockSubtitle currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockSubtitleCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
            this.currentBlock = pageblocksubtitle;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            this.textY = AndroidUtilities.dp(this.parent.pady());
            TL_iv.pageBlockSubtitle pageblocksubtitle = this.currentBlock;
            if (pageblocksubtitle != null) {
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = pageblocksubtitle.text;
                int iDp2 = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i3 = this.textY;
                TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, iDp2, i3, pageblocksubtitle2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    iDp = AndroidUtilities.dp(this.parent.pady() * 2) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    iDp = 0;
                }
            } else {
                iDp = 1;
            }
            setMeasuredDimension(size, iDp);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
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
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVHeading));
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockPullquoteCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockPullquote currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textX;
        private int textY;
        private int textY2;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockPullquoteCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            int iMin = drawingText != null ? Math.min(Integer.MAX_VALUE, drawingText.x + drawingText.getBoundLeft()) : Integer.MAX_VALUE;
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                iMin = Math.min(iMin, drawingText2.x + drawingText2.getBoundLeft());
            }
            if (iMin == Integer.MAX_VALUE) {
                return -1;
            }
            return iMin - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            int iMax = drawingText != null ? Math.max(Integer.MIN_VALUE, drawingText.x + drawingText.getBoundRight()) : Integer.MIN_VALUE;
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                iMax = Math.max(iMax, drawingText2.x + drawingText2.getBoundRight());
            }
            if (iMax == Integer.MIN_VALUE) {
                return -1;
            }
            return iMax + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getLastLineBoundRight() {
            int lastLineBoundRight;
            int iDp;
            DrawingText drawingText = this.textLayout2;
            if (drawingText != null) {
                lastLineBoundRight = drawingText.x + drawingText.getLastLineBoundRight();
                iDp = AndroidUtilities.dp(this.parent.padx());
            } else {
                DrawingText drawingText2 = this.textLayout;
                if (drawingText2 == null) {
                    return -1;
                }
                lastLineBoundRight = drawingText2.x + drawingText2.getLastLineBoundRight();
                iDp = AndroidUtilities.dp(this.parent.padx());
            }
            return lastLineBoundRight + iDp;
        }

        public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
            this.currentBlock = pageblockpullquote;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout2, this.textX, this.textY2) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            this.textY = AndroidUtilities.dp(this.parent.pady());
            TL_iv.pageBlockPullquote pageblockpullquote = this.currentBlock;
            if (pageblockpullquote != null) {
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(this.parent, this, (CharSequence) null, pageblockpullquote.text, size - AndroidUtilities.dp(r0.padx() * 2), this.textY, this.currentBlock, this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    iDp = AndroidUtilities.dp(this.parent.pady()) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    iDp = 0;
                }
                this.textY2 = AndroidUtilities.dp(2.0f) + iDp;
                DrawingText drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(this.parent, this, (CharSequence) null, this.currentBlock.caption, size - AndroidUtilities.dp(r1.padx() * 2), this.textY2, this.currentBlock, this.adapter);
                this.textLayout2 = drawingTextCreateLayoutForText2;
                if (drawingTextCreateLayoutForText2 != null) {
                    iDp += AndroidUtilities.dp(this.parent.pady()) + this.textLayout2.getHeight();
                    DrawingText drawingText2 = this.textLayout2;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY2;
                }
                if (iDp != 0) {
                    iDp += AndroidUtilities.dp(this.parent.pady());
                }
            } else {
                iDp = 1;
            }
            setMeasuredDimension(size, iDp);
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
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.textLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.textLayout2 != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY2);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.textLayout2.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            CharSequence charSequenceBuildAccessibilityText;
            CharSequence charSequenceBuildAccessibilityText2;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null && (charSequenceBuildAccessibilityText2 = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText)) != null) {
                spannableStringBuilder.append(charSequenceBuildAccessibilityText2);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null && (charSequenceBuildAccessibilityText = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText2)) != null) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append(charSequenceBuildAccessibilityText);
            }
            if (spannableStringBuilder.length() == 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVPullquote));
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }
    }

    public static class BlockBlockquoteCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockBlockquote currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textX;
        private int textY;
        private int textY2;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockBlockquoteCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public int getBoundLeft() {
            int iDp = AndroidUtilities.dp(this.parent.padx());
            DrawingText drawingText = this.textLayout;
            int iMin = drawingText != null ? Math.min(Integer.MAX_VALUE, (drawingText.x + drawingText.getBoundLeft()) - iDp) : Integer.MAX_VALUE;
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                iMin = Math.min(iMin, (drawingText2.x + drawingText2.getBoundLeft()) - iDp);
            }
            if (iMin == Integer.MAX_VALUE) {
                return -1;
            }
            return iMin - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            int iDp = AndroidUtilities.dp(this.parent.padx());
            DrawingText drawingText = this.textLayout;
            int iMax = drawingText != null ? Math.max(Integer.MIN_VALUE, drawingText.x + drawingText.getBoundRight() + iDp) : Integer.MIN_VALUE;
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                iMax = Math.max(iMax, drawingText2.x + drawingText2.getBoundRight() + iDp);
            }
            if (iMax == Integer.MIN_VALUE) {
                return -1;
            }
            return iMax + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getLastLineBoundRight() {
            int lastLineBoundRight;
            int iDp;
            DrawingText drawingText = this.textLayout2;
            if (drawingText != null) {
                lastLineBoundRight = drawingText.x + drawingText.getLastLineBoundRight();
                iDp = AndroidUtilities.dp(this.parent.padx());
            } else {
                DrawingText drawingText2 = this.textLayout;
                if (drawingText2 == null) {
                    return -1;
                }
                lastLineBoundRight = drawingText2.x + drawingText2.getLastLineBoundRight();
                iDp = AndroidUtilities.dp(this.parent.padx());
            }
            return lastLineBoundRight + iDp;
        }

        public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
            this.currentBlock = pageblockblockquote;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout2, this.textX, this.textY2) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            this.textY = AndroidUtilities.dp(this.parent.pady());
            if (this.currentBlock != null) {
                int iDp2 = size - AndroidUtilities.dp((this.parent.padx() * 2) + 14);
                if (this.currentBlock.level > 0) {
                    iDp2 -= AndroidUtilities.dp(r0 * 14);
                }
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.pageBlockBlockquote pageblockblockquote = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockblockquote.text, iDp2, this.textY, pageblockblockquote, this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                iDp = drawingTextCreateLayoutForText != null ? AndroidUtilities.dp(this.parent.pady()) + this.textLayout.getHeight() : 0;
                if (this.currentBlock.level > 0) {
                    WebpageAdapter webpageAdapter = this.adapter;
                    if (webpageAdapter != null && webpageAdapter.isRtl) {
                        this.textX = AndroidUtilities.dp((this.currentBlock.level * 14) + 14);
                    } else {
                        this.textX = AndroidUtilities.dp(this.currentBlock.level * 14) + AndroidUtilities.dp(this.parent.padx() + 14);
                    }
                } else {
                    WebpageAdapter webpageAdapter2 = this.adapter;
                    if (webpageAdapter2 != null && webpageAdapter2.isRtl) {
                        this.textX = AndroidUtilities.dp(14.0f);
                    } else {
                        this.textX = AndroidUtilities.dp(this.parent.padx() + 14);
                    }
                }
                int iDp3 = iDp + AndroidUtilities.dp(this.parent.pady());
                this.textY2 = iDp3;
                IArticleViewer iArticleViewer2 = this.parent;
                TL_iv.pageBlockBlockquote pageblockblockquote2 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, pageblockblockquote2.caption, iDp2, iDp3, pageblockblockquote2, this.adapter);
                this.textLayout2 = drawingTextCreateLayoutForText2;
                if (drawingTextCreateLayoutForText2 != null) {
                    iDp += AndroidUtilities.dp(this.parent.pady()) + this.textLayout2.getHeight();
                }
                if (iDp != 0) {
                    iDp += AndroidUtilities.dp(this.parent.pady());
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
                iDp = 1;
            }
            setMeasuredDimension(size, iDp);
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
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.textLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.textLayout2 != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY2);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.textLayout2.draw(canvas, this);
                canvas.restore();
            }
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter == null || !webpageAdapter.isRtl) {
                canvas.drawRect(AndroidUtilities.dp(this.parent.padx() + (this.currentBlock.level * 14)), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.parent.padx() + 2 + (this.currentBlock.level * 14)), getMeasuredHeight() - AndroidUtilities.dp(6.0f), ArticleViewer.quoteLinePaint);
            } else {
                canvas.drawRect(getMeasuredWidth() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f), r0 + AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(6.0f), ArticleViewer.quoteLinePaint);
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            CharSequence charSequenceBuildAccessibilityText;
            CharSequence charSequenceBuildAccessibilityText2;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null && (charSequenceBuildAccessibilityText2 = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText)) != null) {
                spannableStringBuilder.append(charSequenceBuildAccessibilityText2);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null && (charSequenceBuildAccessibilityText = ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText2)) != null) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append(charSequenceBuildAccessibilityText);
            }
            if (spannableStringBuilder.length() == 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) LocaleController.getString(R.string.AccDescrIVBlockquote));
            accessibilityNodeInfo.setText(spannableStringBuilder);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }
    }

    public static class BlockPhotoCell extends FrameLayout implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
        private final WebpageAdapter adapter;
        boolean autoDownload;
        private int buttonPressed;
        private int buttonState;
        private int buttonX;
        private int buttonY;
        private boolean calcHeight;
        private DrawingText captionLayout;
        private BlockChannelCell channelCell;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockPhoto currentBlock;
        private String currentFilter;
        private TLObject currentPage;
        private TLRPC.Photo currentPhoto;
        private TLRPC.PhotoSize currentPhotoObject;
        private TLRPC.PhotoSize currentPhotoObjectThumb;
        private String currentThumbFilter;
        private int currentType;
        private MessageObject.GroupedMessagePosition groupPosition;
        private ImageReceiver imageView;
        private boolean isFirst;
        private Drawable linkDrawable;
        private final IArticleViewer parent;
        private TL_iv.PageBlock parentBlock;
        private Object parentObject;
        private boolean photoPressed;
        private RadialProgress2 radialProgress;
        private int textX;
        private int textY;

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public BlockPhotoCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
            this.imageView = new ImageReceiver(this);
            this.channelCell = new BlockChannelCell(context, iArticleViewer, webpageAdapter, 1);
            RadialProgress2 radialProgress2 = new RadialProgress2(this);
            this.radialProgress = radialProgress2;
            radialProgress2.setProgressColor(-1);
            this.radialProgress.setColors(1711276032, 2130706432, -1, -2500135);
            this.TAG = DownloadController.getInstance(iArticleViewer.getCurrentAccount()).generateObserverTag();
            addView(this.channelCell, LayoutHelper.createFrame(-1, -2.0f));
            this.currentType = i;
        }

        public void setBlock(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, Object obj, boolean z, boolean z2) {
            TLRPC.Photo photoWithId;
            this.parentBlock = null;
            this.currentBlock = pageblockphoto;
            this.currentPage = tLObject;
            this.parentObject = obj;
            this.calcHeight = z;
            this.isFirst = z2;
            this.channelCell.setVisibility(4);
            if (!TextUtils.isEmpty(this.currentBlock.url)) {
                this.linkDrawable = getResources().getDrawable(R.drawable.msg_instant_link);
            }
            TL_iv.pageBlockPhoto pageblockphoto2 = this.currentBlock;
            if (pageblockphoto2 != null && (photoWithId = WebPageUtils.getPhotoWithId(this.currentPage, pageblockphoto2.photo_id)) != null) {
                this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize());
            } else {
                this.currentPhotoObject = null;
            }
            updateButtonState(false);
            requestLayout();
        }

        public void setParentBlock(TL_iv.PageBlock pageBlock) {
            this.parentBlock = pageBlock;
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter == null || webpageAdapter.channelBlock == null || !(this.parentBlock instanceof TL_iv.pageBlockCover)) {
                return;
            }
            this.channelCell.setBlock(this.adapter.channelBlock);
            this.channelCell.setVisibility(0);
        }

        public View getChannelCell() {
            return this.channelCell;
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockPhotoCell.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public ImageReceiver getImageView() {
            return this.imageView;
        }

        public TL_iv.pageBlockPhoto getCurrentBlock() {
            return this.currentBlock;
        }

        public TLObject getCurrentPage() {
            return this.currentPage;
        }

        @Override
        protected void onMeasure(int r29, int r30) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockPhotoCell.onMeasure(int, int):void");
        }

        public void lambda$onMeasure$0() {
            requestLayout();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            if (!this.imageView.hasBitmapImage() || this.imageView.getCurrentAlpha() != 1.0f) {
                canvas.drawRect(this.imageView.getImageX(), this.imageView.getImageY(), this.imageView.getImageX2(), this.imageView.getImageY2(), ArticleViewer.photoBackgroundPaint);
            }
            this.imageView.draw(canvas);
            if (this.imageView.getVisible()) {
                this.radialProgress.draw(canvas);
            }
            if (!TextUtils.isEmpty(this.currentBlock.url) && !(this.currentPhoto instanceof WebInstantView.WebPhoto)) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
                int imageY = (int) (this.imageView.getImageY() + AndroidUtilities.dp(11.0f));
                this.linkDrawable.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
                this.linkDrawable.draw(canvas);
            }
            int i = 0;
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        private int getIconForCurrentState() {
            int i = this.buttonState;
            if (i == 0) {
                return 2;
            }
            return i == 1 ? 3 : 4;
        }

        private void didPressedButton(boolean z) {
            if (this.currentPhotoObject == null) {
                return;
            }
            int i = this.buttonState;
            if (i == 0) {
                this.radialProgress.setProgress(0.0f, z);
                this.imageView.setImage(ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto), this.currentFilter, ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto), this.currentThumbFilter, this.currentPhotoObject.size, null, this.currentPage, 1);
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
            int currentAccount = this.parent.getCurrentAccount();
            String attachFileName = FileLoader.getAttachFileName(this.currentPhotoObject);
            File pathToAttach = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentPhotoObject, true);
            File pathToAttach2 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentPhotoObject, false);
            boolean z2 = pathToAttach.exists() || (pathToAttach2 != null && pathToAttach2.exists());
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (z2) {
                DownloadController.getInstance(currentAccount).removeLoadingFileObserver(this);
                this.buttonState = -1;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(currentAccount).addLoadingFileObserver(attachFileName, null, this);
                float fFloatValue = 0.0f;
                if (this.autoDownload || FileLoader.getInstance(currentAccount).isLoadingFile(attachFileName)) {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        fFloatValue = fileProgress.floatValue();
                    }
                } else {
                    this.buttonState = 0;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                this.radialProgress.setProgress(fFloatValue, false);
            }
            invalidate();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.imageView.onDetachedFromWindow();
            DownloadController.getInstance(this.parent.getCurrentAccount()).removeLoadingFileObserver(this);
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageView.onAttachedToWindow();
            updateButtonState(false);
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
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
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
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
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AttachPhoto));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            accessibilityNodeInfo.setText(sb.toString());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
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

    public static class BlockMapCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private final WebpageAdapter adapter;
        private DrawingText captionLayout;
        private Drawable chat_redLocationIcon;
        private DrawingText creditLayout;
        private int creditOffset;
        private TL_iv.pageBlockMap currentBlock;
        private int currentMapProvider;
        private int currentType;
        private ImageReceiver imageView;
        private boolean isFirst;
        private final IArticleViewer parent;
        private boolean photoPressed;
        private int textX;
        private int textY;

        public BlockMapCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
            this.imageView = new ImageReceiver(this);
            this.currentType = i;
        }

        public void setBlock(TL_iv.pageBlockMap pageblockmap, boolean z, boolean z2) {
            this.currentBlock = pageblockmap;
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
                    TLRPC.GeoPoint geoPoint = this.currentBlock.geo;
                    double d = geoPoint.lat;
                    double d2 = geoPoint._long;
                    getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (motionEvent.getAction() == 3) {
                this.photoPressed = false;
            }
            return this.photoPressed || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int r32, int r33) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.BlockMapCell.onMeasure(int, int):void");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            Theme.chat_docBackPaint.setColor(this.parent.getThemedColor(Theme.key_chat_inLocationBackground));
            canvas.drawRect(this.imageView.getImageX(), this.imageView.getImageY(), this.imageView.getImageX2(), this.imageView.getImageY2(), Theme.chat_docBackPaint);
            int i = 0;
            int centerX = (int) (this.imageView.getCenterX() - (Theme.chat_locationDrawable[0].getIntrinsicWidth() / 2));
            int centerY = (int) (this.imageView.getCenterY() - (Theme.chat_locationDrawable[0].getIntrinsicHeight() / 2));
            Drawable drawable = Theme.chat_locationDrawable[0];
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, Theme.chat_locationDrawable[0].getIntrinsicHeight() + centerY);
            Theme.chat_locationDrawable[0].draw(canvas);
            this.imageView.draw(canvas);
            if (this.currentMapProvider == 2 && this.imageView.hasNotThumb()) {
                if (this.chat_redLocationIcon == null) {
                    this.chat_redLocationIcon = ContextCompat.getDrawable(getContext(), R.drawable.map_pin).mutate();
                }
                int intrinsicWidth = (int) (this.chat_redLocationIcon.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.chat_redLocationIcon.getIntrinsicHeight() * 0.8f);
                int imageX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - intrinsicWidth) / 2.0f));
                int imageY = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() / 2.0f) - intrinsicHeight));
                this.chat_redLocationIcon.setAlpha((int) (this.imageView.getCurrentAlpha() * 255.0f));
                this.chat_redLocationIcon.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                this.chat_redLocationIcon.draw(canvas);
            }
            if (this.captionLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, 0);
                this.captionLayout.draw(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.creditLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.drawTextSelection(this.parent, canvas, this, i);
                this.creditLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.Map));
            if (this.captionLayout != null) {
                sb.append(", ");
                sb.append(this.captionLayout.getText());
            }
            accessibilityNodeInfo.setText(sb.toString());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                arrayList.add(drawingText2);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.captionLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
            DrawingText drawingText2 = this.creditLayout;
            if (drawingText2 != null) {
                drawingText2.detach(this);
            }
        }
    }

    public static class BlockChannelCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
        private final WebpageAdapter adapter;
        private Paint backgroundPaint;
        private int buttonWidth;
        private AnimatorSet currentAnimation;
        private TL_iv.pageBlockChannel currentBlock;
        private int currentState;
        private int currentType;
        private ImageView imageView;
        private final IArticleViewer parent;
        private ContextProgressView progressView;
        private DrawingText textLayout;
        private TextView textView;
        private int textX;
        private int textX2;
        private int textY;

        public BlockChannelCell(Context context, final IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.textY = AndroidUtilities.dp(11.0f);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
            this.backgroundPaint = new Paint();
            this.currentType = i;
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 14.0f);
            this.textView.setTypeface(AndroidUtilities.bold());
            this.textView.setText(LocaleController.getString(R.string.ChannelJoin));
            this.textView.setGravity(19);
            addView(this.textView, LayoutHelper.createFrame(-2, 39, 53));
            this.textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(iArticleViewer, view);
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

        public void lambda$new$0(IArticleViewer iArticleViewer, View view) {
            if (this.currentState != 0) {
                return;
            }
            setState(1, true);
            ArticleViewer.joinChannel(iArticleViewer.getCurrentAccount(), this, iArticleViewer.loadedChannel);
        }

        public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
            this.currentBlock = pageblockchannel;
            if (this.currentType == 0) {
                int themedColor = this.parent.getThemedColor(Theme.key_switchTrack);
                int iRed = Color.red(themedColor);
                int iGreen = Color.green(themedColor);
                int iBlue = Color.blue(themedColor);
                this.textView.setTextColor(this.parent.getLinkTextColor());
                this.backgroundPaint.setColor(Color.argb(34, iRed, iGreen, iBlue));
                this.imageView.setColorFilter(new PorterDuffColorFilter(this.parent.getGrayTextColor(), PorterDuff.Mode.MULTIPLY));
            } else {
                this.textView.setTextColor(-1);
                this.backgroundPaint.setColor(2130706432);
                this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.parent.getCurrentAccount()).getChat(Long.valueOf(pageblockchannel.channel.id));
            if (chat == null || chat.min) {
                ArticleViewer.loadChannel(this.parent, this, this.adapter, pageblockchannel.channel);
                setState(1, false);
            } else {
                this.parent.loadedChannel = chat;
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
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, i == 0 ? 1.0f : 0.0f);
                TextView textView2 = this.textView;
                Property property2 = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, i == 0 ? 1.0f : 0.1f);
                TextView textView3 = this.textView;
                Property property3 = View.SCALE_Y;
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, i == 0 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property, i == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property2, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property3, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.imageView, (Property<ImageView, Float>) property, i == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.imageView, (Property<ImageView, Float>) property2, i == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.imageView, (Property<ImageView, Float>) property3, i == 2 ? 1.0f : 0.1f));
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
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size, AndroidUtilities.dp(48.0f));
            this.textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
            this.buttonWidth = this.textView.getMeasuredWidth();
            this.progressView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
            this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
            TL_iv.pageBlockChannel pageblockchannel = this.currentBlock;
            if (pageblockchannel != null) {
                this.textLayout = ArticleViewer.createLayoutForText(this.parent, this, pageblockchannel.channel.title, null, (size - AndroidUtilities.dp(52.0f)) - this.buttonWidth, this.textY, this.currentBlock, StaticLayoutEx.ALIGN_LEFT(), 1, this.adapter);
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter != null && webpageAdapter.isRtl) {
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
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter != null && webpageAdapter.isRtl) {
                canvas.translate((getMeasuredWidth() - this.textLayout.getLineWidth(0)) - this.textX, this.textY);
            } else {
                canvas.translate(this.textX, this.textY);
            }
            if (this.currentType == 0) {
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
            }
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
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
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrChannel));
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockAuthorDateCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockAuthorDate currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockAuthorDateCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
            this.currentBlock = pageblockauthordate;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            Spannable spannable;
            MetricAffectingSpan[] metricAffectingSpanArr;
            CharSequence charSequenceNewSpannable;
            int iIndexOf;
            int i3 = 0;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockAuthorDate pageblockauthordate = this.currentBlock;
            if (pageblockauthordate != null) {
                IArticleViewer iArticleViewer = this.parent;
                WebpageAdapter webpageAdapter = this.adapter;
                TL_iv.RichText richText = pageblockauthordate.author;
                CharSequence text = ArticleViewer.getText(iArticleViewer, webpageAdapter, this, richText, richText, pageblockauthordate, size);
                if (text instanceof Spannable) {
                    spannable = (Spannable) text;
                    metricAffectingSpanArr = (MetricAffectingSpan[]) spannable.getSpans(0, text.length(), MetricAffectingSpan.class);
                } else {
                    spannable = null;
                    metricAffectingSpanArr = null;
                }
                if (this.currentBlock.published_date != 0 && !TextUtils.isEmpty(text)) {
                    charSequenceNewSpannable = LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(this.currentBlock.published_date * 1000), text);
                } else if (!TextUtils.isEmpty(text)) {
                    charSequenceNewSpannable = LocaleController.formatString(R.string.ArticleByAuthor, text);
                } else {
                    charSequenceNewSpannable = LocaleController.getInstance().getChatFullDate().format(this.currentBlock.published_date * 1000);
                }
                if (metricAffectingSpanArr != null) {
                    try {
                        if (metricAffectingSpanArr.length > 0 && (iIndexOf = TextUtils.indexOf((CharSequence) charSequenceNewSpannable, text)) != -1) {
                            charSequenceNewSpannable = Spannable.Factory.getInstance().newSpannable(charSequenceNewSpannable);
                            for (int i4 = 0; i4 < metricAffectingSpanArr.length; i4++) {
                                MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i4];
                                charSequenceNewSpannable.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + iIndexOf, spannable.getSpanEnd(metricAffectingSpanArr[i4]) + iIndexOf, 33);
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(this.parent, this, charSequenceNewSpannable, (TL_iv.RichText) null, size - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int iDp = AndroidUtilities.dp(16.0f) + this.textLayout.getHeight();
                    WebpageAdapter webpageAdapter2 = this.adapter;
                    if (webpageAdapter2 != null && webpageAdapter2.isRtl) {
                        this.textX = (int) Math.floor(((size - this.textLayout.getLineLeft(0)) - this.textLayout.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                    } else {
                        this.textX = AndroidUtilities.dp(18.0f);
                    }
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                    i3 = iDp;
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
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText));
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockTitleCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockTitle currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockTitleCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
            this.currentBlock = pageblocktitle;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            TL_iv.pageBlockTitle pageblocktitle = this.currentBlock;
            if (pageblocktitle != null) {
                if (pageblocktitle.first) {
                    iDp = AndroidUtilities.dp(this.parent.pady());
                    this.textY = AndroidUtilities.dp(this.parent.pady() * 2);
                } else {
                    this.textY = AndroidUtilities.dp(this.parent.pady());
                    iDp = 0;
                }
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = this.currentBlock.text;
                int iDp2 = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i3 = this.textY;
                TL_iv.pageBlockTitle pageblocktitle2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, iDp2, i3, pageblocktitle2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    iDp += AndroidUtilities.dp(this.parent.pady() * 2) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                iDp = 1;
            }
            setMeasuredDimension(size, iDp);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVTitle));
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockKickerCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockKicker currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockKickerCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
            this.currentBlock = pageblockkicker;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            TL_iv.pageBlockKicker pageblockkicker = this.currentBlock;
            if (pageblockkicker != null) {
                if (pageblockkicker.first) {
                    this.textY = AndroidUtilities.dp(16.0f);
                    iDp = AndroidUtilities.dp(8.0f);
                } else {
                    this.textY = AndroidUtilities.dp(8.0f);
                    iDp = 0;
                }
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = this.currentBlock.text;
                int iDp2 = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i3 = this.textY;
                TL_iv.pageBlockKicker pageblockkicker2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, null, richText, iDp2, i3, pageblockkicker2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), 0, this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    iDp += AndroidUtilities.dp(this.parent.pady() * 2) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                iDp = 1;
            }
            setMeasuredDimension(size, iDp);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock == null || this.textLayout == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.textX, this.textY);
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
            this.textLayout.draw(canvas, this);
            canvas.restore();
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVKicker));
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockFooterCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockFooter currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockFooterCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
            this.currentBlock = pageblockfooter;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockFooter pageblockfooter = this.currentBlock;
            if (pageblockfooter != null) {
                i3 = 0;
                if (pageblockfooter.level == 0) {
                    this.textY = AndroidUtilities.dp(this.parent.pady());
                    this.textX = AndroidUtilities.dp(this.parent.padx());
                } else {
                    this.textY = 0;
                    this.textX = AndroidUtilities.dp(this.parent.padx() + (this.currentBlock.level * 14));
                }
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = this.currentBlock.text;
                int iDp2 = (size - AndroidUtilities.dp(iArticleViewer.padx() * 2)) - this.textX;
                int i4 = this.textY;
                TL_iv.pageBlockFooter pageblockfooter2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, iDp2, i4, pageblockfooter2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int height = drawingTextCreateLayoutForText.getHeight();
                    if (this.currentBlock.level > 0) {
                        iDp = AndroidUtilities.dp(this.parent.pady());
                    } else {
                        iDp = AndroidUtilities.dp(this.parent.pady() * 2);
                    }
                    i3 = height + iDp;
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
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
            ArticleViewer.drawQuoteLines(canvas, this.parent, this.currentBlock, getMeasuredHeight());
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVFooter));
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockPreformattedCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockPreformatted currentBlock;
        private final IArticleViewer parent;
        private HorizontalScrollView scrollView;
        private CharSequence text;
        private View textContainer;
        private DrawingText textLayout;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockPreformattedCell(Context context, final IArticleViewer iArticleViewer, final WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context) {
                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    return super.onInterceptTouchEvent(motionEvent);
                }

                @Override
                protected void onScrollChanged(int i, int i2, int i3, int i4) {
                    super.onScrollChanged(i, i2, i3, i4);
                    IArticleViewer iArticleViewer2 = iArticleViewer;
                    if (iArticleViewer2.pressedLinkOwnerLayout != null) {
                        iArticleViewer2.pressedLinkOwnerLayout = null;
                        iArticleViewer2.pressedLinkOwnerView = null;
                    }
                }
            };
            this.scrollView = horizontalScrollView;
            horizontalScrollView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            addView(this.scrollView, LayoutHelper.createFrame(-1, -2.0f));
            this.textContainer = new View(context) {
                @Override
                protected void onMeasure(int i, int i2) {
                    int height;
                    int iMax = 1;
                    if (BlockPreformattedCell.this.currentBlock != null) {
                        if (BlockPreformattedCell.this.text == null) {
                            BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                            blockPreformattedCell.text = ArticleViewer.getText(iArticleViewer, webpageAdapter, this, blockPreformattedCell.currentBlock.text, BlockPreformattedCell.this.currentBlock.text, BlockPreformattedCell.this.currentBlock, AndroidUtilities.dp(5000.0f));
                            if (!TextUtils.isEmpty(BlockPreformattedCell.this.currentBlock.language)) {
                                BlockPreformattedCell blockPreformattedCell2 = BlockPreformattedCell.this;
                                blockPreformattedCell2.text = CodeHighlighting.getHighlighted(blockPreformattedCell2.text, BlockPreformattedCell.this.currentBlock.language);
                            }
                        }
                        BlockPreformattedCell blockPreformattedCell3 = BlockPreformattedCell.this;
                        blockPreformattedCell3.textLayout = ArticleViewer.createLayoutForText(iArticleViewer, this, blockPreformattedCell3.text, (TL_iv.RichText) null, AndroidUtilities.dp(5000.0f), 0, BlockPreformattedCell.this.currentBlock, webpageAdapter);
                        if (BlockPreformattedCell.this.textLayout != null) {
                            height = BlockPreformattedCell.this.textLayout.getHeight();
                            int lineCount = BlockPreformattedCell.this.textLayout.getLineCount();
                            for (int i3 = 0; i3 < lineCount; i3++) {
                                iMax = Math.max((int) Math.ceil(BlockPreformattedCell.this.textLayout.getLineWidth(i3)), iMax);
                            }
                        } else {
                            height = 0;
                        }
                    } else {
                        height = 1;
                    }
                    setMeasuredDimension(iMax + AndroidUtilities.dp(32.0f), height);
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    IArticleViewer iArticleViewer2 = iArticleViewer;
                    WebpageAdapter webpageAdapter2 = webpageAdapter;
                    BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                    return ArticleViewer.checkLayoutForLinks(iArticleViewer2, webpageAdapter2, motionEvent, blockPreformattedCell, blockPreformattedCell.textLayout, 0, 0) || super.onTouchEvent(motionEvent);
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    if (BlockPreformattedCell.this.textLayout != null) {
                        canvas.save();
                        ArticleViewer.drawTextSelection(iArticleViewer, canvas, BlockPreformattedCell.this);
                        BlockPreformattedCell.this.textLayout.draw(canvas, this);
                        canvas.restore();
                        BlockPreformattedCell.this.textLayout.x = (int) getX();
                        BlockPreformattedCell.this.textLayout.y = (int) getY();
                    }
                }
            };
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            int iDp = AndroidUtilities.dp(16.0f);
            layoutParams.rightMargin = iDp;
            layoutParams.leftMargin = iDp;
            int iDp2 = AndroidUtilities.dp(12.0f);
            layoutParams.bottomMargin = iDp2;
            layoutParams.topMargin = iDp2;
            NotificationCenter.listenEmojiLoading(this.textContainer);
            this.scrollView.addView(this.textContainer, layoutParams);
            if (Build.VERSION.SDK_INT >= 23) {
                this.scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                    @Override
                    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                        ArticleViewer.BlockPreformattedCell.lambda$new$0(iArticleViewer, view, i, i2, i3, i4);
                    }
                });
            }
            setWillNotDraw(false);
        }

        public static void lambda$new$0(IArticleViewer iArticleViewer, View view, int i, int i2, int i3, int i4) {
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = iArticleViewer.getTextSelectionHelper(null);
            if (textSelectionHelper == null || !textSelectionHelper.isInSelectionMode()) {
                return;
            }
            textSelectionHelper.invalidate();
        }

        public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
            this.text = null;
            this.currentBlock = pageblockpreformatted;
            this.scrollView.setScrollX(0);
            this.textContainer.requestLayout();
        }

        @Override
        public int getBoundLeft() {
            if (this.textLayout == null) {
                return -1;
            }
            return (AndroidUtilities.dp(16.0f) + this.textLayout.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            if (this.textLayout == null) {
                return -1;
            }
            return AndroidUtilities.dp(16.0f) + this.textLayout.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getLastLineBoundRight() {
            if (this.textLayout == null) {
                return -1;
            }
            return AndroidUtilities.dp(16.0f) + this.textLayout.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
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
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVCode));
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void invalidate() {
            this.textContainer.invalidate();
            super.invalidate();
        }
    }

    public static class BlockSubheaderCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockSubheader currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        public BlockSubheaderCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.x + drawingText.getBoundLeft()) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return drawingText.x + drawingText.getLastLineBoundRight() + AndroidUtilities.dp(this.parent.padx());
        }

        public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
            this.currentBlock = pageblocksubheader;
            requestLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            this.textY = AndroidUtilities.dp(this.parent.pady());
            TL_iv.pageBlockSubheader pageblocksubheader = this.currentBlock;
            if (pageblocksubheader != null) {
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = pageblocksubheader.text;
                int iDp = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i4 = this.textY;
                TL_iv.pageBlockSubheader pageblocksubheader2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, iDp, i4, pageblocksubheader2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int height = this.textY + drawingTextCreateLayoutForText.getHeight();
                    int i5 = this.textY;
                    i3 = height + i5;
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = i5;
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
            ArticleViewer.drawTextSelection(this.parent, canvas, this);
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
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVHeading));
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }
    }

    public static class BlockMathCell extends HorizontalScrollView implements Theme.Colorable, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockMath currentBlock;
        private ImageView imageView;
        private FrameLayout layout;
        private final IArticleViewer parent;
        private int width;

        public BlockMathCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            FrameLayout frameLayout = new FrameLayout(context);
            this.layout = frameLayout;
            addView(frameLayout, LayoutHelper.createFrame(-2, -2.0f));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.layout.addView(this.imageView, LayoutHelper.createFrame(-2, -2.0f));
            updateColors();
        }

        public void setBlock(TL_iv.pageBlockMath pageblockmath) {
            this.currentBlock = pageblockmath;
            this.imageView.setImageBitmap(null);
            this.imageView.setPadding(AndroidUtilities.dp(this.parent.padx()), 0, AndroidUtilities.dp(this.parent.padx()), 0);
            this.imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
            this.width = AndroidUtilities.dp(this.parent.padx() * 2);
            if (pageblockmath != null) {
                try {
                    JLatexMathDrawable jLatexMathDrawableBuild = JLatexMathDrawable.builder(pageblockmath.source).textSize(AndroidUtilities.dp(20.0f)).build();
                    int intrinsicWidth = jLatexMathDrawableBuild.getIntrinsicWidth();
                    int intrinsicHeight = jLatexMathDrawableBuild.getIntrinsicHeight();
                    if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                        return;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    jLatexMathDrawableBuild.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    jLatexMathDrawableBuild.draw(new Canvas(bitmapCreateBitmap));
                    this.imageView.setImageBitmap(bitmapCreateBitmap);
                    ImageView imageView = this.imageView;
                    int iDp = intrinsicWidth + AndroidUtilities.dp(this.parent.padx() * 2);
                    this.width = iDp;
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(iDp, intrinsicHeight));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }

        @Override
        public void updateColors() {
            this.imageView.setColorFilter(new PorterDuffColorFilter(this.parent.getTextColor(), PorterDuff.Mode.SRC_IN));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = i3 - i;
            int i6 = this.width;
            if (i6 > i5) {
                super.onLayout(z, i, i2, i3, i4);
            } else {
                FrameLayout frameLayout = this.layout;
                frameLayout.layout((i5 - i6) / 2, 0, (i5 + i6) / 2, frameLayout.getMeasuredHeight());
            }
        }

        @Override
        public int getBoundLeft() {
            if (this.width > getMeasuredWidth()) {
                return 0;
            }
            return (getMeasuredWidth() - this.width) / 2;
        }

        @Override
        public int getBoundRight() {
            return this.width > getMeasuredWidth() ? getMeasuredWidth() : (getMeasuredWidth() + this.width) / 2;
        }

        @Override
        public int getLastLineBoundRight() {
            return getBoundRight();
        }

        public int getMinWidth() {
            return this.width;
        }
    }

    private class ReportCell extends FrameLayout {
        private boolean hasViews;
        private TextView textView;
        private TextView viewsTextView;
        public final boolean web;

        public ReportCell(Context context, boolean z) {
            super(context);
            this.web = z;
            setTag(90);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setText(LocaleController.getString(z ? R.string.PreviewFeedbackAuto : R.string.PreviewFeedback2));
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

    @Override
    public TextSelectionHelper.ArticleTextSelectionHelper getTextSelectionHelper(View view) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
        return (view == null || view.getTag() == null || view.getTag() != "bottomSheet" || (articleTextSelectionHelper = this.textSelectionHelperBottomSheet) == null) ? this.textSelectionHelper : articleTextSelectionHelper;
    }

    public static void drawTextSelection(IArticleViewer iArticleViewer, Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView) {
        drawTextSelection(iArticleViewer, canvas, articleSelectableView, 0);
    }

    public void drawTextSelection(Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView, int i) {
        drawTextSelection(this, canvas, articleSelectableView, i);
    }

    public static void drawTextSelection(IArticleViewer iArticleViewer, Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView, int i) {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = iArticleViewer.getTextSelectionHelper((View) articleSelectableView);
        if (textSelectionHelper != null) {
            textSelectionHelper.draw(canvas, articleSelectableView, i);
        }
    }

    @Override
    public boolean openPhoto(TL_iv.PageBlock pageBlock, WebpageAdapter webpageAdapter) {
        ArrayList arrayList;
        int iIndexOf;
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || WebPageUtils.isVideo(webpageAdapter.currentPage, pageBlock)) {
                arrayList = new ArrayList(webpageAdapter.photoBlocks);
                iIndexOf = webpageAdapter.photoBlocks.indexOf(pageBlock);
            } else {
                arrayList = Collections.singletonList(pageBlock);
                iIndexOf = 0;
            }
            PhotoViewer photoViewer = PhotoViewer.getInstance();
            photoViewer.setParentActivity(this.parentFragment);
            if (photoViewer.openPhoto(iIndexOf, new RealPageBlocksAdapter(webpageAdapter.currentPage, arrayList), new PageBlocksPhotoViewerProvider(arrayList))) {
                checkVideoPlayer();
                return true;
            }
        }
        return false;
    }

    private class RealPageBlocksAdapter implements PhotoViewer.PageBlocksAdapter {
        private final TLRPC.WebPage page;
        private final List pageBlocks;

        private RealPageBlocksAdapter(TLRPC.WebPage webPage, List list) {
            this.page = webPage;
            this.pageBlocks = list;
        }

        @Override
        public int getItemsCount() {
            return this.pageBlocks.size();
        }

        @Override
        public TL_iv.PageBlock get(int i) {
            return (TL_iv.PageBlock) this.pageBlocks.get(i);
        }

        @Override
        public List getAll() {
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
            if (media instanceof TLRPC.Photo) {
                media = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) media).sizes, AndroidUtilities.getPhotoSize());
            }
            return FileLoader.getAttachFileName(media);
        }

        @Override
        public java.lang.CharSequence getCaption(int r9) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ArticleViewer.RealPageBlocksAdapter.getCaption(int):java.lang.CharSequence");
        }

        @Override
        public TLRPC.PhotoSize getFileLocation(TLObject tLObject, int[] iArr) {
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
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
            if (!(tLObject instanceof TLRPC.Document) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Document) tLObject).thumbs, 90)) == null) {
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
        public void updateSlideshowCell(TL_iv.PageBlock pageBlock) {
            int childCount = ArticleViewer.this.pages[0].listView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ArticleViewer.this.pages[0].listView.getChildAt(i);
                if (childAt instanceof BlockSlideshowCell) {
                    BlockSlideshowCell blockSlideshowCell = (BlockSlideshowCell) childAt;
                    int iIndexOf = blockSlideshowCell.currentBlock.items.indexOf(pageBlock);
                    if (iIndexOf != -1) {
                        blockSlideshowCell.innerListView.setCurrentItem(iIndexOf, false);
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

    private class PageBlocksPhotoViewerProvider extends PhotoViewer.EmptyPhotoViewerProvider {
        private final List pageBlocks;
        private final int[] tempArr = new int[2];

        public PageBlocksPhotoViewerProvider(List list) {
            this.pageBlocks = list;
        }

        @Override
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
            ImageReceiver imageReceiverFromListView;
            if (i < 0 || i >= this.pageBlocks.size() || (imageReceiverFromListView = getImageReceiverFromListView(ArticleViewer.this.pages[0].listView, (TL_iv.PageBlock) this.pageBlocks.get(i), this.tempArr)) == null) {
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

        private ImageReceiver getImageReceiverFromListView(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) throws InterruptedException {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ImageReceiver imageReceiverView = getImageReceiverView(viewGroup.getChildAt(i), pageBlock, iArr);
                if (imageReceiverView != null) {
                    return imageReceiverView;
                }
            }
            return null;
        }

        private ImageReceiver getImageReceiverView(View view, TL_iv.PageBlock pageBlock, int[] iArr) throws InterruptedException {
            ImageReceiver imageReceiverView;
            ImageReceiver imageReceiverView2;
            VideoPlayerHolderBase videoPlayerHolderBase;
            if (view instanceof BlockPhotoCell) {
                BlockPhotoCell blockPhotoCell = (BlockPhotoCell) view;
                if (blockPhotoCell.currentBlock != pageBlock) {
                    return null;
                }
                view.getLocationInWindow(iArr);
                return blockPhotoCell.imageView;
            }
            if (view instanceof BlockVideoCell) {
                BlockVideoCell blockVideoCell = (BlockVideoCell) view;
                if (blockVideoCell.currentBlock != pageBlock) {
                    return null;
                }
                view.getLocationInWindow(iArr);
                ArticleViewer articleViewer = ArticleViewer.this;
                if (blockVideoCell == articleViewer.currentPlayer && (videoPlayerHolderBase = articleViewer.videoPlayer) != null && videoPlayerHolderBase.firstFrameRendered && blockVideoCell.textureView.getSurfaceTexture() != null) {
                    if (Build.VERSION.SDK_INT < 24) {
                        blockVideoCell.imageView.setImageBitmap(blockVideoCell.textureView.getBitmap());
                    } else {
                        Surface surface = new Surface(blockVideoCell.textureView.getSurfaceTexture());
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(blockVideoCell.textureView.getMeasuredWidth(), blockVideoCell.textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, bitmapCreateBitmap);
                        surface.release();
                        blockVideoCell.imageView.setImageBitmap(bitmapCreateBitmap);
                    }
                    blockVideoCell.firstFrameRendered = false;
                    blockVideoCell.textureView.setAlpha(0.0f);
                }
                return blockVideoCell.imageView;
            }
            if (view instanceof BlockCollageCell) {
                ImageReceiver imageReceiverFromListView = getImageReceiverFromListView(((BlockCollageCell) view).innerListView, pageBlock, iArr);
                if (imageReceiverFromListView != null) {
                    return imageReceiverFromListView;
                }
                return null;
            }
            if (view instanceof BlockSlideshowCell) {
                ImageReceiver imageReceiverFromListView2 = getImageReceiverFromListView(((BlockSlideshowCell) view).innerListView, pageBlock, iArr);
                if (imageReceiverFromListView2 != null) {
                    return imageReceiverFromListView2;
                }
                return null;
            }
            if (view instanceof BlockListItemCell) {
                BlockListItemCell blockListItemCell = (BlockListItemCell) view;
                if (blockListItemCell.blockLayout == null || (imageReceiverView2 = getImageReceiverView(blockListItemCell.blockLayout.itemView, pageBlock, iArr)) == null) {
                    return null;
                }
                return imageReceiverView2;
            }
            if (!(view instanceof BlockOrderedListItemCell)) {
                return null;
            }
            BlockOrderedListItemCell blockOrderedListItemCell = (BlockOrderedListItemCell) view;
            if (blockOrderedListItemCell.blockLayout == null || (imageReceiverView = getImageReceiverView(blockOrderedListItemCell.blockLayout.itemView, pageBlock, iArr)) == null) {
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
            TL_iv.PageBlock pageBlock = (i < 0 || i >= this.pageBlocks.size()) ? null : (TL_iv.PageBlock) this.pageBlocks.get(i);
            VideoPlayer videoPlayer = PhotoViewer.getInstance().getVideoPlayer();
            TextureView videoTextureView = PhotoViewer.getInstance().getVideoTextureView();
            SurfaceView videoSurfaceView = PhotoViewer.getInstance().getVideoSurfaceView();
            BlockVideoCell viewFromListView = getViewFromListView(ArticleViewer.this.pages[0].listView, pageBlock);
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

        private BlockVideoCell getViewFromListView(ViewGroup viewGroup, TL_iv.PageBlock pageBlock) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof BlockVideoCell) {
                    BlockVideoCell blockVideoCell = (BlockVideoCell) childAt;
                    if (blockVideoCell.currentBlock == pageBlock) {
                        return blockVideoCell;
                    }
                }
            }
            return null;
        }
    }

    @Override
    public int getThemedColor(int i) {
        return Theme.getColor(i, getResourcesProvider());
    }

    public boolean isFirstArticle() {
        return this.pagesStack.size() > 0 && (this.pagesStack.get(0) instanceof TLRPC.WebPage);
    }

    public void lambda$new$67() {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda6(this));
    }

    public void lambda$new$68() {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda6(this));
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
                float fLerp = AndroidUtilities.lerp((this.pages[0].hasBackButton() || this.pagesStack.size() > 1) ? 1.0f : 0.0f, (this.pages[1].hasBackButton() || this.pagesStack.size() > 2) ? 1.0f : 0.0f, f);
                this.actionBar.backButtonDrawable.setRotation(1.0f - fLerp, false);
                this.actionBar.forwardButtonDrawable.setState(false);
                this.actionBar.setBackButtonCached(fLerp > 0.5f);
            } else {
                this.actionBar.forwardButtonDrawable.setState(false);
                this.actionBar.setBackButtonCached(false);
            }
            this.actionBar.setHasForward(this.pages[0].hasForwardButton());
            this.actionBar.setIsLocal(this.pages[0].isLocal());
            this.actionBar.setIsLoaded(this.pages[0].getWebView() != null && this.pages[0].getWebView().isPageLoaded());
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
        public WebInstantView.Loader currentInstantLoader;
        public ErrorContainer errorContainer;
        private boolean errorShown;
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

        public PageLayout(Context context, Theme.ResourcesProvider resourcesProvider) throws PackageManager.NameNotFoundException {
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
            WebpageAdapter webpageAdapter = ArticleViewer.this.new WebpageAdapter(context, sheet != null && sheet.halfSize());
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
                public void setPageLoaded(String str, boolean z) {
                    WebInstantView.Loader loader;
                    if (ArticleViewer.this.actionBar != null) {
                        PageLayout pageLayout = PageLayout.this;
                        if (pageLayout == ArticleViewer.this.pages[0] && (loader = pageLayout.currentInstantLoader) != null && loader.getWebPage() == null) {
                            PageLayout.this.currentInstantLoader.retryLocal(getWebView());
                        }
                    }
                    super.setPageLoaded(str, z);
                }

                @Override
                public void onWebViewCreated(BotWebViewContainer.MyWebView myWebView) {
                    super.onWebViewCreated(myWebView);
                    PageLayout.this.swipeContainer.setWebView(myWebView);
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
                    WebActionBar webActionBar3 = ArticleViewer.this.actionBar;
                    PageLayout pageLayout6 = ArticleViewer.this.pages[0];
                    webActionBar3.setIsLocal(pageLayout6 != null && pageLayout6.isLocal());
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
                        PageLayout.this.errorContainer.set(getWebView() != null ? getWebView().getUrl() : null, i2, str);
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
                    this.f$0.lambda$new$0();
                }
            });
            botWebViewContainer.setWebViewProgressListener(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f$0.lambda$new$1((Float) obj);
                }
            });
            botWebViewContainer.setDelegate(new BotWebViewContainer.Delegate() {
                @Override
                public BotSensors getBotSensors() {
                    return BotWebViewContainer.Delegate.CC.$default$getBotSensors(this);
                }

                @Override
                public boolean isClipboardAvailable() {
                    return BotWebViewContainer.Delegate.CC.$default$isClipboardAvailable(this);
                }

                @Override
                public void onEmojiStatusGranted(boolean z) {
                    BotWebViewContainer.Delegate.CC.$default$onEmojiStatusGranted(this, z);
                }

                @Override
                public void onEmojiStatusSet(TLRPC.Document document) {
                    BotWebViewContainer.Delegate.CC.$default$onEmojiStatusSet(this, document);
                }

                @Override
                public String onFullscreenRequested(boolean z, boolean z2) {
                    return BotWebViewContainer.Delegate.CC.$default$onFullscreenRequested(this, z, z2);
                }

                @Override
                public void onLocationGranted(boolean z) {
                    BotWebViewContainer.Delegate.CC.$default$onLocationGranted(this, z);
                }

                @Override
                public void onOpenBackFromTabs() {
                    BotWebViewContainer.Delegate.CC.$default$onOpenBackFromTabs(this);
                }

                @Override
                public void onOrientationLockChanged(boolean z) {
                    BotWebViewContainer.Delegate.CC.$default$onOrientationLockChanged(this, z);
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
                public void onSetupMainButton(boolean z, boolean z2, String str, long j, int i2, int i3, boolean z3, boolean z4) {
                }

                @Override
                public void onSetupSecondaryButton(boolean z, boolean z2, String str, long j, int i2, int i3, boolean z3, boolean z4, String str2) {
                }

                @Override
                public void onSharedTo(ArrayList arrayList) {
                    BotWebViewContainer.Delegate.CC.$default$onSharedTo(this, arrayList);
                }

                @Override
                public void onWebAppExpand() {
                }

                @Override
                public void onWebAppOpenInvoice(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
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
                public void onWebAppSetNavigationBarColor(int i2) {
                    BotWebViewContainer.Delegate.CC.$default$onWebAppSetNavigationBarColor(this, i2);
                }

                @Override
                public void onWebAppSetupClosingBehavior(boolean z) {
                }

                @Override
                public void onWebAppSwipingBehavior(boolean z) {
                }

                @Override
                public void onWebAppSwitchInlineQuery(TLRPC.User user, String str, List list) {
                }

                @Override
                public void onCloseRequested(Runnable runnable) throws PackageManager.NameNotFoundException {
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
                public void onInstantClose() throws PackageManager.NameNotFoundException {
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
                    this.f$0.lambda$new$2();
                }
            });
            webViewSwipeContainer.setDelegate(new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate() {
                @Override
                public final void onDismiss(boolean z) {
                    this.f$0.lambda$new$3(z);
                }
            });
            webViewSwipeContainer.setScrollListener(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$4();
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

        public void lambda$new$3(boolean z) {
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
                        this.f$0.lambda$createErrorContainer$5(view);
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

        public void setType(int i) throws PackageManager.NameNotFoundException {
            if (this.type != i) {
                cleanup();
            }
            this.type = i;
            this.listView.setVisibility(isArticle() ? 0 : 8);
            this.swipeContainer.setVisibility(isWeb() ? 0 : 8);
        }

        public String getTitle() {
            BotWebViewContainer.MyWebView webView;
            if (isArticle()) {
                if (this.adapter.currentPage == null || this.adapter.currentPage.site_name == null) {
                    if (this.adapter.currentPage != null && this.adapter.currentPage.title != null) {
                        return this.adapter.currentPage.title;
                    }
                } else {
                    return this.adapter.currentPage.site_name;
                }
            }
            if (isWeb() && (webView = this.webViewContainer.getWebView()) != null) {
                return webView.getTitle();
            }
            return "";
        }

        public int getBackgroundColor() {
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

        public String getSubtitle() throws UnsupportedEncodingException {
            BotWebViewContainer.MyWebView webView;
            if (!isWeb() || (webView = this.webViewContainer.getWebView()) == null) {
                return "";
            }
            if (TextUtils.equals(this.lastUrl, webView.getUrl())) {
                return this.lastFormattedUrl;
            }
            try {
                String url = webView.getUrl();
                this.lastUrl = url;
                Uri uri = Uri.parse(BotWebViewContainer.magic2tonsite(url));
                String string = (uri.getScheme() == null || !(uri.getScheme().equalsIgnoreCase("http") || uri.getScheme().equalsIgnoreCase("https"))) ? uri.toString() : uri.getSchemeSpecificPart();
                if (!isTonsite()) {
                    try {
                        try {
                            Uri uri2 = Uri.parse(string);
                            if (uri2.getHost() != null) {
                                uri = uri2;
                            }
                            String strIDN_toUnicode = Browser.IDN_toUnicode(uri.getHost());
                            String[] strArrSplit = strIDN_toUnicode.split("\\.");
                            if (strArrSplit.length > 2 && ArticleViewer.this.actionBar != null && HintView2.measureCorrectly(strIDN_toUnicode, ArticleViewer.this.actionBar.titlePaint) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                                strIDN_toUnicode = strArrSplit[strArrSplit.length - 2] + '.' + strArrSplit[strArrSplit.length - 1];
                            }
                            string = Browser.replace(uri, null, "", strIDN_toUnicode, null);
                        } catch (Exception e) {
                            FileLog.e((Throwable) e, false);
                        }
                        string = URLDecoder.decode(string.replaceAll("\\+", "%2b"), "UTF-8");
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }
                if (string.startsWith("//")) {
                    string = string.substring(2);
                }
                if (string.startsWith("www.")) {
                    string = string.substring(4);
                }
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
                int iIndexOf = string.indexOf("#");
                if (iIndexOf >= 0) {
                    string = string.substring(0, iIndexOf);
                }
                this.lastFormattedUrl = string;
                return string;
            } catch (Exception unused) {
                return webView.getUrl();
            }
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
            View viewFindViewByPosition;
            float fMin;
            if (isArticle()) {
                float f = this.overrideProgress;
                if (f >= 0.0f) {
                    return f;
                }
                int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
                if (this.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition) == null) {
                    return 0.0f;
                }
                int[] iArr = this.adapter.sumItemHeights;
                if (iArr == null) {
                    int iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
                    Sheet sheet2 = ArticleViewer.this.sheet;
                    if (sheet2 != null && sheet2.halfSize()) {
                        if (iFindFirstVisibleItemPosition < 1) {
                            iFindFirstVisibleItemPosition = 1;
                        }
                        if (iFindLastVisibleItemPosition < 1) {
                            iFindLastVisibleItemPosition = 1;
                        }
                    }
                    int itemCount = this.layoutManager.getItemCount() - 2;
                    if (iFindLastVisibleItemPosition >= itemCount) {
                        viewFindViewByPosition = this.layoutManager.findViewByPosition(itemCount);
                    } else {
                        viewFindViewByPosition = this.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    }
                    if (viewFindViewByPosition == null) {
                        return 0.0f;
                    }
                    float width = getWidth() / (r3 - 1);
                    float measuredHeight = viewFindViewByPosition.getMeasuredHeight();
                    if (iFindLastVisibleItemPosition >= itemCount) {
                        fMin = (((itemCount - iFindFirstVisibleItemPosition) * width) * (this.listView.getMeasuredHeight() - viewFindViewByPosition.getTop())) / measuredHeight;
                    } else {
                        fMin = width * (1.0f - ((Math.min(0, viewFindViewByPosition.getTop() - this.listView.getPaddingTop()) + measuredHeight) / measuredHeight));
                    }
                    return ((iFindFirstVisibleItemPosition * width) + fMin) / getWidth();
                }
                int i = iFindFirstVisibleItemPosition - 1;
                return Utilities.clamp01((((i < 0 || i >= iArr.length) ? 0 : iArr[i]) + ((iFindFirstVisibleItemPosition == 0 && (sheet = ArticleViewer.this.sheet) != null && sheet.halfSize()) ? 0 : -r2.getTop())) / Math.max(1, this.adapter.fullHeight - this.listView.getHeight()));
            }
            if (!isWeb() || (webView = this.webViewContainer.getWebView()) == null) {
                return 0.0f;
            }
            return webView.getScrollProgress();
        }

        public void addProgress(float f) {
            BotWebViewContainer.MyWebView webView;
            float fClamp01 = Utilities.clamp01(getProgress() + f);
            if (isArticle() || !isWeb() || (webView = this.webViewContainer.getWebView()) == null) {
                return;
            }
            webView.setScrollProgress(fClamp01);
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

        public boolean isLocal() {
            WebpageAdapter webpageAdapter;
            return (isWeb() || (webpageAdapter = this.adapter) == null || webpageAdapter.currentPage == null || this.adapter.currentPage.cached_page == null || this.adapter.currentPage.cached_page.local == null) ? false : true;
        }

        public void cleanup() throws PackageManager.NameNotFoundException {
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

        public void setWeb(CachedWeb cachedWeb) throws PackageManager.NameNotFoundException {
            CachedWeb cachedWeb2 = this.web;
            if (cachedWeb2 != cachedWeb) {
                if (cachedWeb2 != null) {
                    cachedWeb2.detach(this);
                }
                this.web = cachedWeb;
                if (cachedWeb != null) {
                    cachedWeb.attach(this);
                }
                WebInstantView.Loader loader = this.currentInstantLoader;
                if (loader != null) {
                    loader.cancel();
                    this.currentInstantLoader.recycle();
                    this.currentInstantLoader = null;
                }
            }
        }

        public WebInstantView.Loader loadInstant() {
            if (!isWeb()) {
                WebInstantView.Loader loader = this.currentInstantLoader;
                if (loader != null) {
                    loader.cancel();
                    this.currentInstantLoader.recycle();
                    this.currentInstantLoader = null;
                }
                return null;
            }
            if (getWebView() == null) {
                WebInstantView.Loader loader2 = this.currentInstantLoader;
                if (loader2 != null) {
                    loader2.cancel();
                    this.currentInstantLoader.recycle();
                    this.currentInstantLoader = null;
                }
                return null;
            }
            WebInstantView.Loader loader3 = this.currentInstantLoader;
            if (loader3 != null && (loader3.currentIsLoaded != getWebView().isPageLoaded() || this.currentInstantLoader.currentProgress != getWebView().getProgress())) {
                this.currentInstantLoader.retryLocal(getWebView());
                return this.currentInstantLoader;
            }
            if (this.currentInstantLoader != null && TextUtils.equals(getWebView().getUrl(), this.currentInstantLoader.currentUrl)) {
                return this.currentInstantLoader;
            }
            WebInstantView.Loader loader4 = this.currentInstantLoader;
            if (loader4 != null) {
                loader4.cancel();
                this.currentInstantLoader.recycle();
                this.currentInstantLoader = null;
            }
            WebInstantView.Loader loader5 = new WebInstantView.Loader(ArticleViewer.this.currentAccount);
            this.currentInstantLoader = loader5;
            loader5.start(getWebView());
            return this.currentInstantLoader;
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

        public void attach(PageLayout pageLayout) throws PackageManager.NameNotFoundException {
            if (pageLayout == null) {
                return;
            }
            BotWebViewContainer.MyWebView myWebView = this.webView;
            if (myWebView != null) {
                myWebView.onResume();
                pageLayout.webViewContainer.replaceWebView(UserConfig.selectedAccount, this.webView, this.proxy);
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
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
            ActionBarPopupWindow actionBarPopupWindow;
            ArticleViewer articleViewer = ArticleViewer.this;
            if (articleViewer.pressedLinkOwnerLayout != null && articleViewer.pressedLink == null && (((actionBarPopupWindow = articleViewer.popupWindow) == null || !actionBarPopupWindow.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                ArticleViewer articleViewer2 = ArticleViewer.this;
                articleViewer2.pressedLink = null;
                articleViewer2.pressedLinkOwnerLayout = null;
                articleViewer2.pressedLinkOwnerView = null;
            } else {
                ArticleViewer articleViewer3 = ArticleViewer.this;
                if (articleViewer3.pressedLinkOwnerLayout != null && articleViewer3.pressedLink != null && motionEvent.getAction() == 1 && (getAdapter() instanceof WebpageAdapter)) {
                    ArticleViewer articleViewer4 = ArticleViewer.this;
                    WebpageAdapter webpageAdapter = (WebpageAdapter) getAdapter();
                    ArticleViewer articleViewer5 = ArticleViewer.this;
                    articleViewer4.checkLayoutForLinks(webpageAdapter, motionEvent, articleViewer5.pressedLinkOwnerView, articleViewer5.pressedLinkOwnerLayout, 0, 0);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            ActionBarPopupWindow actionBarPopupWindow;
            ArticleViewer articleViewer = ArticleViewer.this;
            if (articleViewer.pressedLinkOwnerLayout != null && articleViewer.pressedLink == null && (((actionBarPopupWindow = articleViewer.popupWindow) == null || !actionBarPopupWindow.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                ArticleViewer articleViewer2 = ArticleViewer.this;
                articleViewer2.pressedLink = null;
                articleViewer2.pressedLinkOwnerLayout = null;
                articleViewer2.pressedLinkOwnerView = null;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
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
        public BottomSheetTabDialog dialog;
        private ValueAnimator dismissAnimator;
        private float dismissProgress;
        private boolean dismissing;
        private boolean dismissingIntoTabs;
        public BaseFragment fragment;
        public boolean fullyAttachedToActionBar;
        private boolean hadDialog;
        private boolean lastVisible;
        public boolean nestedVerticalScroll;
        private Runnable onDismissListener;
        private ValueAnimator openAnimator;
        private float openProgress;
        private boolean released;
        public Theme.ResourcesProvider resourcesProvider;
        private boolean wasFullyVisible;
        public final WindowView windowView;

        public final boolean halfSize() {
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
                    this.f$0.lambda$new$0((Integer) obj);
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
        public WindowView mo1355getWindowView() {
            return this.windowView;
        }

        @Override
        public boolean setDialog(BottomSheetTabDialog bottomSheetTabDialog) {
            this.dialog = bottomSheetTabDialog;
            if (bottomSheetTabDialog != null) {
                this.hadDialog = true;
            }
            return true;
        }

        @Override
        public boolean hadDialog() {
            return this.hadDialog;
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
            WindowView windowView;
            return !this.dismissing && !this.released && this.openProgress > 0.5f && (windowView = this.windowView) != null && windowView.isAttachedToWindow() && this.windowView.isVisible() && this.backProgress < 1.0f;
        }

        public void attachInternal(BaseFragment baseFragment) throws Resources.NotFoundException {
            this.released = false;
            this.fragment = baseFragment;
            this.resourcesProvider = baseFragment.getResourceProvider();
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                if (chatActivity.getChatActivityEnterView() != null) {
                    chatActivity.getChatActivityEnterView().closeKeyboard();
                    chatActivity.getChatActivityEnterView().hidePopup(true, false);
                }
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
            ArticleViewer.activeSheets.add(ArticleViewer.this);
        }

        public void show() throws Resources.NotFoundException {
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
                        this.f$0.lambda$dismiss$1();
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
            this.released = true;
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
            ArticleViewer.activeSheets.remove(ArticleViewer.this);
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
        public boolean onAttachedBackPressed() throws PackageManager.NameNotFoundException {
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
            float fMin = this.dismissingIntoTabs ? 0.0f : Math.min(this.openProgress, 1.0f - this.dismissProgress) * (1.0f - this.backProgress);
            int backgroundColor = getBackgroundColor();
            if (ArticleViewer.this.actionBar != null) {
                backgroundColor = ColorUtils.blendARGB(backgroundColor, ArticleViewer.this.actionBar.addressBackgroundColor, ArticleViewer.this.actionBar.addressingProgress);
            }
            return ColorUtils.blendARGB(i, backgroundColor, fMin);
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
            this.windowView.requestLayout();
        }

        public void animateOpen(final boolean z, boolean z2, final Runnable runnable) {
            ValueAnimator valueAnimator = this.openAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
                this.openAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$animateOpen$2(valueAnimator2);
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
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.dismissProgress, z ? 1.0f : 0.0f);
                this.dismissAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$animateDismiss$3(valueAnimator2);
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
            int listTop = 0;
            PageLayout pageLayout = ArticleViewer.this.pages[0];
            float translationX = (pageLayout == null || pageLayout.getVisibility() != 0) ? 0.0f : 1.0f - (ArticleViewer.this.pages[0].getTranslationX() / ArticleViewer.this.pages[0].getWidth());
            float f = 1.0f - translationX;
            PageLayout pageLayout2 = ArticleViewer.this.pages[0];
            if (pageLayout2 != null && pageLayout2.getVisibility() == 0) {
                listTop = (int) (ArticleViewer.this.pages[0].getListTop() * translationX * ArticleViewer.this.pages[0].getAlpha());
            }
            PageLayout pageLayout3 = ArticleViewer.this.pages[1];
            return (pageLayout3 == null || pageLayout3.getVisibility() != 0) ? listTop : listTop + ((int) (ArticleViewer.this.pages[1].getListTop() * f * ArticleViewer.this.pages[1].getAlpha()));
        }

        public void checkNavColor() {
            BottomSheetTabDialog bottomSheetTabDialog = this.dialog;
            AndroidUtilities.setLightStatusBar(bottomSheetTabDialog != null ? bottomSheetTabDialog.windowView : this.windowView, isAttachedLightStatusBar());
            BottomSheetTabDialog bottomSheetTabDialog2 = this.dialog;
            if (bottomSheetTabDialog2 != null) {
                bottomSheetTabDialog2.updateNavigationBarColor();
            } else {
                LaunchActivity.instance.checkSystemBarColors(true, true, true);
                AndroidUtilities.setLightNavigationBar(mo1355getWindowView(), AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundGray))) >= 0.721f);
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
            return AndroidUtilities.dp(20.0f);
        }

        public int getEmptyPadding() {
            int iDp = AndroidUtilities.dp(16.0f);
            View view = this.containerView;
            return (iDp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight())) - (getListTop() - getListPaddingTop());
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

            public boolean isVisible() {
                return AndroidUtilities.lerp(Sheet.this.getListTop() - Sheet.this.getListPaddingTop(), 0, Utilities.clamp01(this.attachedActionBar.get())) < getHeight();
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                float f;
                if (this.drawingFromOverlay) {
                    return;
                }
                float fMin = Math.min(Sheet.this.openProgress, 1.0f - Sheet.this.dismissProgress);
                this.scrimPaint.setColor(-16777216);
                this.scrimPaint.setAlpha((int) (96.0f * fMin * (1.0f - Sheet.this.backProgress)));
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.scrimPaint);
                int listTop = Sheet.this.getListTop() - Sheet.this.getListPaddingTop();
                boolean z = listTop < AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight() && fMin > 0.95f;
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
                int iLerp = AndroidUtilities.lerp(listTop, 0, Utilities.clamp01(f2));
                float emptyPadding = Sheet.this.getEmptyPadding() * Math.max(1.0f - Sheet.this.openProgress, Sheet.this.dismissProgress);
                canvas.save();
                canvas.translate(getWidth() * Sheet.this.backProgress, emptyPadding);
                float f3 = iLerp;
                this.rect.set(0.0f, f3, getWidth(), getHeight() + AndroidUtilities.dp(16.0f));
                float f4 = 1.0f - f2;
                float fDp = AndroidUtilities.dp(24.0f) * f4;
                if (f2 < 1.0f) {
                    this.shadowPaint.setColor(0);
                    this.shadowPaint.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), Theme.multAlpha(-16777216, fMin * 0.26f));
                    canvas.drawRoundRect(this.rect, fDp, fDp, this.shadowPaint);
                }
                if (fDp <= 0.0f) {
                    canvas.clipRect(this.rect);
                } else {
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(this.rect, fDp, fDp, Path.Direction.CW);
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
                    float fLerp = AndroidUtilities.lerp(Sheet.this.getListPaddingTop() + listTop + 1, 0, f2);
                    canvas.translate(0.0f, fLerp);
                    f = 0.0f;
                    ArticleViewer.this.actionBar.drawBackground(canvas, ((listTop + Sheet.this.getListPaddingTop()) + 1) - fLerp, 1.0f, f2, true);
                    canvas.restore();
                } else {
                    f = 0.0f;
                }
                canvas.translate(f, -emptyPadding);
                if (!AndroidUtilities.makingGlobalBlurBitmap && (!ArticleViewer.this.pages[0].isWeb() || canvas.isHardwareAccelerated())) {
                    super.dispatchDraw(canvas);
                }
                canvas.translate(f, emptyPadding);
                if (f2 < 1.0f) {
                    this.handlePaint.setColor(ColorUtils.blendARGB(Theme.multAlpha(AndroidUtilities.computePerceivedBrightness(Sheet.this.getBackgroundColor()) < 0.721f ? -1 : -16777216, 0.15f), -16777216, f2));
                    this.handlePaint.setAlpha((int) (r1.getAlpha() * f4));
                    float width = getWidth() / 2.0f;
                    float listPaddingTop = (f3 + (Sheet.this.getListPaddingTop() / 2.0f)) - (AndroidUtilities.dp(8.0f) * f2);
                    float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), f2) / 2.0f;
                    this.rect.set(width - fLerp2, listPaddingTop - AndroidUtilities.dp(2.0f), width + fLerp2, listPaddingTop + AndroidUtilities.dp(2.0f));
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
                float fMin = Math.min(Sheet.this.openProgress, 1.0f - Sheet.this.dismissProgress);
                float f3 = 1.0f - f;
                this.scrimPaint.setColor(-16777216);
                this.scrimPaint.setAlpha((int) (fMin * f3 * 96.0f * (1.0f - Sheet.this.backProgress)));
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.scrimPaint);
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f), f);
                this.backgroundPaint.setColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite));
                this.clipPath2.rewind();
                this.clipPath2.addRoundRect(rectF2, fLerp, fLerp, Path.Direction.CW);
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
                    float fLerp2 = z ? 1.0f : AndroidUtilities.lerp(1.0f, 0.99f, f);
                    float f4 = fLerp2 - 1.0f;
                    if (Math.abs(f4) > 0.01f) {
                        canvas.scale(fLerp2, fLerp2, rectF2.centerX(), rectF2.centerY());
                    }
                    canvas.clipPath(this.clipPath2);
                    if (Math.abs(f4) > 0.01f) {
                        float f5 = 1.0f / fLerp2;
                        canvas.scale(f5, f5, rectF2.centerX(), rectF2.centerY());
                    }
                    canvas.translate(0.0f, (-Sheet.this.getListTop()) + rectF2.top + ((Sheet.this.attachedToActionBar ? ArticleViewer.this.actionBar.getMeasuredHeight() : 0) * f3));
                    childAt.draw(canvas);
                    canvas.restore();
                }
                return fLerp;
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
                boolean zOnNestedPreFling = super.onNestedPreFling(view, f, f2);
                if (Sheet.this.halfSize() && !ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                    if (ArticleViewer.this.pages[0].isAtTop() && f2 < -1000.0f) {
                        Sheet.this.dismiss(true);
                    } else {
                        Sheet.this.animateDismiss(false, true, null);
                    }
                }
                if (f != 0.0f || f2 != 0.0f) {
                    ArticleViewer.this.textSelectionHelper.cancelTextSelectionRunnable();
                }
                this.stoppedAtFling = true;
                return zOnNestedPreFling;
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
                if (ArticleViewer.this.pages[0].isAtTop() && Sheet.this.halfSize() && !ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                    iArr[1] = Math.min((int) (Sheet.this.getEmptyPadding() * Sheet.this.dismissProgress), i2);
                    Sheet sheet2 = Sheet.this;
                    sheet2.dismissProgress = Utilities.clamp(sheet2.dismissProgress - (i2 / Sheet.this.getEmptyPadding()), 1.0f, 0.0f);
                    Sheet.this.updateTranslation();
                    Sheet.this.checkFullyVisible();
                }
                if (i == 0 && i2 == 0) {
                    return;
                }
                ArticleViewer.this.textSelectionHelper.cancelTextSelectionRunnable();
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
                if (sheet.halfSize() && !this.stoppedAtFling && !ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.backProgress, f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$animateBackProgressTo$4(valueAnimator);
                }
            });
            return valueAnimatorOfFloat;
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

        @Override
        public BulletinFactory getBulletinFactory() {
            FrameLayout frameLayout;
            if (!ArticleViewer.this.pages[0].isWeb()) {
                if (ArticleViewer.this.pages[0].adapter.currentPage == null) {
                    return null;
                }
                frameLayout = ArticleViewer.this.pages[0];
            } else {
                if (ArticleViewer.this.pages[0].getWebView() == null) {
                    return null;
                }
                frameLayout = ArticleViewer.this.pages[0].webViewContainer;
            }
            return BulletinFactory.of(frameLayout, ArticleViewer.this.getResourcesProvider());
        }
    }

    public static class ErrorContainer extends FrameLayout {
        public final ButtonWithCounterView buttonView;
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
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                this.darkAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$setDark$0(valueAnimator2);
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
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.titleView.setTextColor(ColorUtils.blendARGB(-16777216, -1, fFloatValue));
            this.descriptionView.setTextColor(ColorUtils.blendARGB(-16777216, -1, fFloatValue));
            this.codeView.setTextColor(ColorUtils.blendARGB(-16777216, -1, fFloatValue));
        }

        public void set(String str, String str2) {
            this.titleView.setText(LocaleController.getString(R.string.WebErrorTitle));
            this.descriptionView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebErrorInfoBot, str)));
            this.codeView.setText(str2);
        }

        public void set(String str, int i, String str2) {
            this.titleView.setText(LocaleController.getString(R.string.WebErrorTitle));
            String strMagic2tonsite = BotWebViewContainer.magic2tonsite(str);
            this.descriptionView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((strMagic2tonsite == null || Uri.parse(strMagic2tonsite) == null || Uri.parse(strMagic2tonsite).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(strMagic2tonsite).getAuthority())), this.descriptionView.getPaint().getFontMetricsInt(), false));
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
            } else if (obj instanceof TLRPC.WebPage) {
                WebInstantView.recycle((TLRPC.WebPage) obj);
            }
        }
        this.pagesStack.clear();
        destroyArticleViewer();
    }
}
