package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.MetricAffectingSpan;
import android.util.Property;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
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
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.p004ui.AspectRatioFrameLayout;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ActionBar.BackDrawable;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ArticleViewer;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.TextSelectionHelper;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.AnchorSpan;
import org.telegram.p009ui.Components.AnimatedArrowDrawable;
import org.telegram.p009ui.Components.AnimationProperties;
import org.telegram.p009ui.Components.AvatarDrawable;
import org.telegram.p009ui.Components.BulletinFactory;
import org.telegram.p009ui.Components.CloseProgressDrawable2;
import org.telegram.p009ui.Components.CombinedDrawable;
import org.telegram.p009ui.Components.ContextProgressView;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.EditTextBoldCursor;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.LineProgressView;
import org.telegram.p009ui.Components.LinkPath;
import org.telegram.p009ui.Components.LinkSpanDrawable;
import org.telegram.p009ui.Components.RadialProgress2;
import org.telegram.p009ui.Components.RadioButton;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.SeekBar;
import org.telegram.p009ui.Components.SeekBarView;
import org.telegram.p009ui.Components.ShareAlert;
import org.telegram.p009ui.Components.StaticLayoutEx;
import org.telegram.p009ui.Components.TableLayout;
import org.telegram.p009ui.Components.TextPaintImageReceiverSpan;
import org.telegram.p009ui.Components.TextPaintMarkSpan;
import org.telegram.p009ui.Components.TextPaintSpan;
import org.telegram.p009ui.Components.TextPaintUrlSpan;
import org.telegram.p009ui.Components.TextPaintWebpageUrlSpan;
import org.telegram.p009ui.Components.TranslateAlert;
import org.telegram.p009ui.Components.TypefaceSpan;
import org.telegram.p009ui.Components.WebPlayerView;
import org.telegram.p009ui.PhotoViewer;
import org.telegram.p009ui.PinchToZoomHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$GeoPoint;
import org.telegram.tgnet.TLRPC$Page;
import org.telegram.tgnet.TLRPC$PageBlock;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$RichText;
import org.telegram.tgnet.TLRPC$TL_channels_joinChannel;
import org.telegram.tgnet.TLRPC$TL_contacts_resolveUsername;
import org.telegram.tgnet.TLRPC$TL_contacts_resolvedPeer;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messageActionChatAddUser;
import org.telegram.tgnet.TLRPC$TL_messages_getWebPage;
import org.telegram.tgnet.TLRPC$TL_messages_messages;
import org.telegram.tgnet.TLRPC$TL_page;
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
import org.telegram.tgnet.TLRPC$TL_pageBlockVideo;
import org.telegram.tgnet.TLRPC$TL_pageCaption;
import org.telegram.tgnet.TLRPC$TL_pageRelatedArticle;
import org.telegram.tgnet.TLRPC$TL_pageTableCell;
import org.telegram.tgnet.TLRPC$TL_pageTableRow;
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
    private WebpageAdapter[] adapter;
    private int anchorsOffsetMeasuredWidth;
    private Runnable animationEndRunnable;
    private int animationInProgress;
    private boolean attachedToWindow;
    private ImageView backButton;
    private BackDrawable backDrawable;
    private Paint backgroundPaint;
    private ImageView clearButton;
    private boolean closeAnimationInProgress;
    private boolean collapsed;
    private FrameLayout containerView;
    private int currentAccount;
    private int currentHeaderHeight;
    private WebPlayerView currentPlayingVideo;
    private int currentSearchIndex;
    private View customView;
    private WebChromeClient.CustomViewCallback customViewCallback;
    private TextView deleteView;
    private boolean drawBlockSelection;
    private AspectRatioFrameLayout fullscreenAspectRatioView;
    private TextureView fullscreenTextureView;
    private FrameLayout fullscreenVideoContainer;
    private WebPlayerView fullscreenedVideo;
    private boolean hasCutout;
    private FrameLayout headerView;
    private boolean ignoreOnTextChange;
    private boolean isVisible;
    private boolean keyboardVisible;
    private Object lastInsets;
    private int lastReqId;
    private Drawable layerShadowDrawable;
    private LinearLayoutManager[] layoutManager;
    private Runnable lineProgressTickRunnable;
    private LineProgressView lineProgressView;
    private BottomSheet linkSheet;
    private RecyclerListView[] listView;
    private TLRPC$Chat loadedChannel;
    private boolean loadingChannel;
    private ActionBarMenuItem menuButton;
    private FrameLayout menuContainer;
    private int openUrlReqId;
    private AnimatorSet pageSwitchAnimation;
    private Activity parentActivity;
    private BaseFragment parentFragment;
    PinchToZoomHelper pinchToZoomHelper;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    private Rect popupRect;
    private ActionBarPopupWindow popupWindow;
    private int pressedLayoutY;
    private LinkSpanDrawable<TextPaintUrlSpan> pressedLink;
    private DrawingText pressedLinkOwnerLayout;
    private View pressedLinkOwnerView;
    private int previewsReqId;
    private ContextProgressView progressView;
    private AnimatorSet progressViewAnimation;
    private AnimatorSet runAfterKeyboardClose;
    private Paint scrimPaint;
    private FrameLayout searchContainer;
    private SimpleTextView searchCountText;
    private ImageView searchDownButton;
    private EditTextBoldCursor searchField;
    private FrameLayout searchPanel;
    private Runnable searchRunnable;
    private View searchShadow;
    private String searchText;
    private ImageView searchUpButton;
    private Drawable slideDotBigDrawable;
    private Drawable slideDotDrawable;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelperBottomSheet;
    private SimpleTextView titleTextView;
    private long transitionAnimationStartTime;
    private Dialog visibleDialog;
    private WindowManager.LayoutParams windowLayoutParams;
    private WindowView windowView;
    public static final Property<WindowView, Float> ARTICLE_VIEWER_INNER_TRANSLATION_X = new AnimationProperties.FloatProperty<WindowView>("innerTranslationX") {
        public void setValue(WindowView windowView, float f) {
            windowView.setInnerTranslationX(f);
        }

        public Float get(WindowView windowView) {
            return Float.valueOf(windowView.getInnerTranslationX());
        }
    };
    private static TextPaint audioTimePaint = new TextPaint(1);
    private static SparseArray<TextPaint> photoCaptionTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> photoCreditTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> titleTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> kickerTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> headerTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> subtitleTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> subheaderTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> authorTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> footerTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> paragraphTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> listTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> preformattedTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> quoteTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> embedPostTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> embedPostCaptionTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> mediaCaptionTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> mediaCreditTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> relatedArticleTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> detailsTextPaints = new SparseArray<>();
    private static SparseArray<TextPaint> tableTextPaints = new SparseArray<>();
    private ArrayList<BlockEmbedCell> createdWebViews = new ArrayList<>();
    private int lastBlockNum = 1;
    private DecelerateInterpolator interpolator = new DecelerateInterpolator(1.5f);
    private ArrayList<TLRPC$WebPage> pagesStack = new ArrayList<>();
    private boolean animateClear = true;
    private Paint headerPaint = new Paint();
    private Paint statusBarPaint = new Paint();
    private Paint navigationBarPaint = new Paint();
    private Paint headerProgressPaint = new Paint();
    private boolean checkingForLongPress = false;
    private CheckForLongPress pendingCheckForLongPress = null;
    private int pressCount = 0;
    private CheckForTap pendingCheckForTap = null;
    private LinkSpanDrawable.LinkCollector links = new LinkSpanDrawable.LinkCollector();
    private int allowAnimationIndex = -1;
    private int selectedFont = 0;
    private FontCell[] fontCells = new FontCell[2];
    private ArrayList<SearchResult> searchResults = new ArrayList<>();
    private int lastSearchIndex = -1;

    public static boolean lambda$setParentActivity$21(View view, MotionEvent motionEvent) {
        return true;
    }

    public void updateWindowLayoutParamsForSearch() {
    }

    public ArticleViewer() {
        new LinkPath();
    }

    static int access$13208(ArticleViewer articleViewer) {
        int i = articleViewer.lastBlockNum;
        articleViewer.lastBlockNum = i + 1;
        return i;
    }

    static int access$2104(ArticleViewer articleViewer) {
        int i = articleViewer.pressCount + 1;
        articleViewer.pressCount = i;
        return i;
    }

    public static ArticleViewer getInstance() {
        ArticleViewer articleViewer = Instance;
        if (articleViewer == null) {
            synchronized (ArticleViewer.class) {
                articleViewer = Instance;
                if (articleViewer == null) {
                    articleViewer = new ArticleViewer();
                    Instance = articleViewer;
                }
            }
        }
        return articleViewer;
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

    public class TL_pageBlockListParent extends TLRPC$PageBlock {
        private ArrayList<TL_pageBlockListItem> items;
        private int lastFontSize;
        private int lastMaxNumCalcWidth;
        private int level;
        private int maxNumWidth;
        private TLRPC$TL_pageBlockList pageBlockList;

        private TL_pageBlockListParent(ArticleViewer articleViewer) {
            this.items = new ArrayList<>();
        }
    }

    public class TL_pageBlockListItem extends TLRPC$PageBlock {
        private TLRPC$PageBlock blockItem;
        private int index;
        private String num;
        private DrawingText numLayout;
        private TL_pageBlockListParent parent;
        private TLRPC$RichText textItem;

        private TL_pageBlockListItem(ArticleViewer articleViewer) {
            this.index = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
    }

    public class TL_pageBlockOrderedListParent extends TLRPC$PageBlock {
        private ArrayList<TL_pageBlockOrderedListItem> items;
        private int lastFontSize;
        private int lastMaxNumCalcWidth;
        private int level;
        private int maxNumWidth;
        private TLRPC$TL_pageBlockOrderedList pageBlockOrderedList;

        private TL_pageBlockOrderedListParent(ArticleViewer articleViewer) {
            this.items = new ArrayList<>();
        }
    }

    public class TL_pageBlockOrderedListItem extends TLRPC$PageBlock {
        private TLRPC$PageBlock blockItem;
        private int index;
        private String num;
        private DrawingText numLayout;
        private TL_pageBlockOrderedListParent parent;
        private TLRPC$RichText textItem;

        private TL_pageBlockOrderedListItem(ArticleViewer articleViewer) {
            this.index = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
    }

    public static class TL_pageBlockEmbedPostCaption extends TLRPC$TL_pageBlockEmbedPost {
        private TLRPC$TL_pageBlockEmbedPost parent;

        private TL_pageBlockEmbedPostCaption() {
        }
    }

    public class DrawingText implements TextSelectionHelper.TextLayoutBlock {
        public View latestParentView;
        public LinkPath markPath;
        public TLRPC$PageBlock parentBlock;
        public Object parentText;
        public CharSequence prefix;
        public int row;
        public int searchIndex = -1;
        public LinkPath searchPath;
        public StaticLayout textLayout;
        public LinkPath textPath;
        public int f1001x;
        public int f1002y;

        public DrawingText() {
        }

        public void draw(Canvas canvas, View view) {
            float f;
            this.latestParentView = view;
            float f2 = 0.0f;
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
                    f = getLineWidth(0);
                    f2 = getLineLeft(0);
                } else {
                    f = getWidth();
                }
                canvas.drawRect((-AndroidUtilities.m34dp(2.0f)) + f2, 0.0f, f2 + f + AndroidUtilities.m34dp(2.0f), getHeight(), ArticleViewer.urlPaint);
            }
            this.textLayout.draw(canvas);
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
            return this.f1001x;
        }

        @Override
        public int getY() {
            return this.f1002y;
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
        private int lastWidth;
        private SeekBarView sizeBar;
        private TextPaint textPaint;
        private int startFontSize = 12;
        private int endFontSize = 30;

        public TextSizeCell(Context context) {
            super(context);
            setWillNotDraw(false);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.m34dp(16.0f));
            SeekBarView seekBarView = new SeekBarView(context);
            this.sizeBar = seekBarView;
            seekBarView.setReportChanges(true);
            this.sizeBar.setDelegate(new SeekBarView.SeekBarViewDelegate(ArticleViewer.this) {
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
                        ArticleViewer.this.adapter[0].searchTextOffset.clear();
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
            this.textPaint.setColor(Theme.getColor("windowBackgroundWhiteValueText"));
            canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.m34dp(39.0f), AndroidUtilities.m34dp(28.0f), this.textPaint);
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

    public static class FontCell extends FrameLayout {
        private RadioButton radioButton;
        private TextView textView;

        public FontCell(Context context) {
            super(context);
            setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor("listSelectorSDK21"), 2));
            RadioButton radioButton = new RadioButton(context);
            this.radioButton = radioButton;
            radioButton.setSize(AndroidUtilities.m34dp(20.0f));
            this.radioButton.setColor(Theme.getColor("dialogRadioBackground"), Theme.getColor("dialogRadioBackgroundChecked"));
            RadioButton radioButton2 = this.radioButton;
            boolean z = LocaleController.isRTL;
            int i = 5;
            addView(radioButton2, LayoutHelper.createFrame(22, 22.0f, (z ? 5 : 3) | 48, z ? 0 : 22, 13.0f, z ? 22 : 0, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setLines(1);
            this.textView.setMaxLines(1);
            this.textView.setSingleLine(true);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextView textView2 = this.textView;
            boolean z2 = LocaleController.isRTL;
            addView(textView2, LayoutHelper.createFrame(-1, -1.0f, (!z2 ? 3 : i) | 48, z2 ? 17 : 62, 0.0f, z2 ? 62 : 17, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(48.0f), 1073741824));
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
            ArticleViewer.this.pendingCheckForLongPress.currentPressCount = ArticleViewer.access$2104(ArticleViewer.this);
            if (ArticleViewer.this.windowView != null) {
                ArticleViewer.this.windowView.postDelayed(ArticleViewer.this.pendingCheckForLongPress, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
            }
        }
    }

    public class WindowView extends FrameLayout {
        private float alpha;
        private int bHeight;
        private int bWidth;
        private int f1003bX;
        private int f1004bY;
        private final Paint blackPaint = new Paint();
        private float innerTranslationX;
        private boolean maybeStartTracking;
        private boolean movingPage;
        private boolean selfLayout;
        private int startMovingHeaderHeight;
        private boolean startedTracking;
        private int startedTrackingPointerId;
        private int startedTrackingX;
        private int startedTrackingY;
        private VelocityTracker tracker;

        public WindowView(Context context) {
            super(context);
        }

        @Override
        @TargetApi(C0952R.styleable.MapAttrs_uiZoomGestures)
        public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
            DisplayCutout displayCutout;
            List<Rect> boundingRects;
            WindowInsets windowInsets2 = (WindowInsets) ArticleViewer.this.lastInsets;
            ArticleViewer.this.lastInsets = windowInsets;
            if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && ArticleViewer.this.windowView != null) {
                ArticleViewer.this.windowView.requestLayout();
            }
            if (!(Build.VERSION.SDK_INT < 28 || ArticleViewer.this.parentActivity == null || (displayCutout = ArticleViewer.this.parentActivity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) == null || (boundingRects = displayCutout.getBoundingRects()) == null || boundingRects.isEmpty())) {
                ArticleViewer articleViewer = ArticleViewer.this;
                boolean z = false;
                if (boundingRects.get(0).height() != 0) {
                    z = true;
                }
                articleViewer.hasCutout = z;
            }
            return super.dispatchApplyWindowInsets(windowInsets);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 21 || ArticleViewer.this.lastInsets == null) {
                setMeasuredDimension(size, size2);
            } else {
                setMeasuredDimension(size, size2);
                WindowInsets windowInsets = (WindowInsets) ArticleViewer.this.lastInsets;
                if (AndroidUtilities.incorrectDisplaySizeFix) {
                    int i4 = AndroidUtilities.displaySize.y;
                    if (size2 > i4) {
                        size2 = i4;
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
            }
            boolean z = false;
            ArticleViewer.this.menuButton.setAdditionalYOffset(((-(ArticleViewer.this.currentHeaderHeight - AndroidUtilities.m34dp(56.0f))) / 2) + (i3 < 21 ? AndroidUtilities.statusBarHeight : 0));
            ArticleViewer articleViewer = ArticleViewer.this;
            if (size2 < AndroidUtilities.displaySize.y - AndroidUtilities.m34dp(100.0f)) {
                z = true;
            }
            articleViewer.keyboardVisible = z;
            ArticleViewer.this.containerView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            ArticleViewer.this.fullscreenVideoContainer.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.pinchToZoomHelper.isInOverlayMode()) {
                motionEvent.offsetLocation(-ArticleViewer.this.containerView.getX(), -ArticleViewer.this.containerView.getY());
                return ArticleViewer.this.pinchToZoomHelper.onTouchEvent(motionEvent);
            }
            TextSelectionHelper<Cell>.TextSelectionOverlay overlayView = ArticleViewer.this.textSelectionHelper.getOverlayView(getContext());
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.offsetLocation(-ArticleViewer.this.containerView.getX(), -ArticleViewer.this.containerView.getY());
            if (ArticleViewer.this.textSelectionHelper.isSelectionMode() && ArticleViewer.this.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(obtain)) {
                return true;
            }
            if (overlayView.checkOnTap(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getAction() != 0 || !ArticleViewer.this.textSelectionHelper.isSelectionMode() || (motionEvent.getY() >= ArticleViewer.this.containerView.getTop() && motionEvent.getY() <= ArticleViewer.this.containerView.getBottom())) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (ArticleViewer.this.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(obtain)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return true;
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            if (!this.selfLayout) {
                int i6 = i3 - i;
                int i7 = 0;
                if (ArticleViewer.this.anchorsOffsetMeasuredWidth != i6) {
                    for (int i8 = 0; i8 < ArticleViewer.this.listView.length; i8++) {
                        for (Map.Entry entry : ArticleViewer.this.adapter[i8].anchorsOffset.entrySet()) {
                            entry.setValue(-1);
                        }
                    }
                    ArticleViewer.this.anchorsOffsetMeasuredWidth = i6;
                }
                if (Build.VERSION.SDK_INT < 21 || ArticleViewer.this.lastInsets == null) {
                    i5 = 0;
                } else {
                    WindowInsets windowInsets = (WindowInsets) ArticleViewer.this.lastInsets;
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        this.f1003bX = i6 - this.bWidth;
                        this.f1004bY = 0;
                    } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                        this.f1003bX = 0;
                        this.f1004bY = 0;
                    } else {
                        this.f1003bX = 0;
                        this.f1004bY = (i4 - i2) - this.bHeight;
                    }
                    i5 = 0 + windowInsets.getSystemWindowInsetTop();
                    i7 = systemWindowInsetLeft;
                }
                ArticleViewer.this.containerView.layout(i7, i5, ArticleViewer.this.containerView.getMeasuredWidth() + i7, ArticleViewer.this.containerView.getMeasuredHeight() + i5);
                ArticleViewer.this.fullscreenVideoContainer.layout(i7, i5, ArticleViewer.this.fullscreenVideoContainer.getMeasuredWidth() + i7, ArticleViewer.this.fullscreenVideoContainer.getMeasuredHeight() + i5);
                if (ArticleViewer.this.runAfterKeyboardClose != null) {
                    ArticleViewer.this.runAfterKeyboardClose.start();
                    ArticleViewer.this.runAfterKeyboardClose = null;
                }
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
                float max = Math.max(0.0f, Math.min(f / AndroidUtilities.m34dp(20.0f), 1.0f));
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
            if (ArticleViewer.this.pagesStack.size() > 1) {
                this.movingPage = true;
                this.startMovingHeaderHeight = ArticleViewer.this.currentHeaderHeight;
                ArticleViewer.this.listView[1].setVisibility(0);
                ArticleViewer.this.listView[1].setAlpha(1.0f);
                ArticleViewer.this.listView[1].setTranslationX(0.0f);
                ArticleViewer.this.listView[0].setBackgroundColor(ArticleViewer.this.backgroundPaint.getColor());
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.updateInterfaceForCurrentPage((TLRPC$WebPage) articleViewer.pagesStack.get(ArticleViewer.this.pagesStack.size() - 2), true, -1);
            } else {
                this.movingPage = false;
            }
            ArticleViewer.this.cancelCheckLongPress();
        }

        public boolean handleTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.pageSwitchAnimation != null || ArticleViewer.this.closeAnimationInProgress || ArticleViewer.this.fullscreenVideoContainer.getVisibility() == 0 || ArticleViewer.this.textSelectionHelper.isSelectionMode()) {
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
                if (this.maybeStartTracking && !this.startedTracking && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                    prepareForMoving(motionEvent);
                } else if (this.startedTracking) {
                    ArticleViewer.this.pressedLinkOwnerLayout = null;
                    ArticleViewer.this.pressedLinkOwnerView = null;
                    if (this.movingPage) {
                        ArticleViewer.this.listView[0].setTranslationX(max);
                    } else {
                        float f = max;
                        ArticleViewer.this.containerView.setTranslationX(f);
                        setInnerTranslationX(f);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.tracker == null) {
                    this.tracker = VelocityTracker.obtain();
                }
                this.tracker.computeCurrentVelocity(1000);
                float xVelocity = this.tracker.getXVelocity();
                float yVelocity = this.tracker.getYVelocity();
                if (!this.startedTracking && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    prepareForMoving(motionEvent);
                }
                if (this.startedTracking) {
                    View view = this.movingPage ? ArticleViewer.this.listView[0] : ArticleViewer.this.containerView;
                    float x = view.getX();
                    final boolean z = x < ((float) view.getMeasuredWidth()) / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (!z) {
                        x = view.getMeasuredWidth() - x;
                        if (this.movingPage) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.listView[0], View.TRANSLATION_X, view.getMeasuredWidth()));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.containerView, View.TRANSLATION_X, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, ArticleViewer.ARTICLE_VIEWER_INNER_TRANSLATION_X, view.getMeasuredWidth()));
                        }
                    } else if (this.movingPage) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.listView[0], View.TRANSLATION_X, 0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.containerView, View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this, ArticleViewer.ARTICLE_VIEWER_INNER_TRANSLATION_X, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((200.0f / view.getMeasuredWidth()) * x), 50));
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (WindowView.this.movingPage) {
                                ArticleViewer.this.listView[0].setBackgroundDrawable(null);
                                if (!z) {
                                    WebpageAdapter webpageAdapter = ArticleViewer.this.adapter[1];
                                    ArticleViewer.this.adapter[1] = ArticleViewer.this.adapter[0];
                                    ArticleViewer.this.adapter[0] = webpageAdapter;
                                    RecyclerListView recyclerListView = ArticleViewer.this.listView[1];
                                    ArticleViewer.this.listView[1] = ArticleViewer.this.listView[0];
                                    ArticleViewer.this.listView[0] = recyclerListView;
                                    LinearLayoutManager linearLayoutManager = ArticleViewer.this.layoutManager[1];
                                    ArticleViewer.this.layoutManager[1] = ArticleViewer.this.layoutManager[0];
                                    ArticleViewer.this.layoutManager[0] = linearLayoutManager;
                                    ArticleViewer.this.pagesStack.remove(ArticleViewer.this.pagesStack.size() - 1);
                                    ArticleViewer articleViewer = ArticleViewer.this;
                                    articleViewer.textSelectionHelper.setParentView(articleViewer.listView[0]);
                                    ArticleViewer articleViewer2 = ArticleViewer.this;
                                    articleViewer2.textSelectionHelper.layoutManager = articleViewer2.layoutManager[0];
                                    ArticleViewer.this.titleTextView.setText(ArticleViewer.this.adapter[0].currentPage.site_name == null ? "" : ArticleViewer.this.adapter[0].currentPage.site_name);
                                    ArticleViewer.this.textSelectionHelper.clear(true);
                                    ArticleViewer.this.headerView.invalidate();
                                }
                                ArticleViewer.this.listView[1].setVisibility(8);
                                ArticleViewer.this.headerView.invalidate();
                            } else if (!z) {
                                ArticleViewer.this.saveCurrentPagePosition();
                                ArticleViewer.this.onClosed();
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
                if (articleTextSelectionHelper != null && !articleTextSelectionHelper.isSelectionMode()) {
                    ArticleViewer.this.textSelectionHelper.clear();
                }
            }
            return this.startedTracking;
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            int i;
            super.dispatchDraw(canvas);
            if ((Build.VERSION.SDK_INT < 21 || ArticleViewer.this.lastInsets == null) && this.bWidth != 0 && this.bHeight != 0) {
                this.blackPaint.setAlpha((int) (ArticleViewer.this.windowView.getAlpha() * 255.0f));
                int i2 = this.f1003bX;
                if (i2 == 0 && (i = this.f1004bY) == 0) {
                    canvas.drawRect(i2, i, i2 + this.bWidth, i + this.bHeight, this.blackPaint);
                } else {
                    canvas.drawRect(i2 - getTranslationX(), this.f1004bY, (this.f1003bX + this.bWidth) - getTranslationX(), this.f1004bY + this.bHeight, this.blackPaint);
                }
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int measuredHeight;
            int systemWindowInsetRight;
            int measuredWidth = getMeasuredWidth();
            float f = measuredWidth;
            float measuredHeight2 = getMeasuredHeight();
            canvas.drawRect(this.innerTranslationX, 0.0f, f, measuredHeight2, ArticleViewer.this.backgroundPaint);
            if (Build.VERSION.SDK_INT >= 21 && ArticleViewer.this.lastInsets != null) {
                WindowInsets windowInsets = (WindowInsets) ArticleViewer.this.lastInsets;
                canvas.drawRect(this.innerTranslationX, 0.0f, f, windowInsets.getSystemWindowInsetTop(), ArticleViewer.this.statusBarPaint);
                if (ArticleViewer.this.hasCutout) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight2, ArticleViewer.this.statusBarPaint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f, measuredHeight2, ArticleViewer.this.statusBarPaint);
                    }
                }
                canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f, measuredHeight2, ArticleViewer.this.navigationBarPaint);
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
            if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                return super.dispatchKeyEventPreIme(keyEvent);
            }
            if (ArticleViewer.this.searchField.isFocused()) {
                ArticleViewer.this.searchField.clearFocus();
                AndroidUtilities.hideKeyboard(ArticleViewer.this.searchField);
            } else {
                ArticleViewer.this.close(true, false);
            }
            return true;
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
            if (ArticleViewer.this.checkingForLongPress && ArticleViewer.this.windowView != null) {
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
                        if (ArticleViewer.this.pressedLinkOwnerView.getTag() == null || ArticleViewer.this.pressedLinkOwnerView.getTag() != "bottomSheet" || (articleTextSelectionHelper = (articleViewer = ArticleViewer.this).textSelectionHelperBottomSheet) == null) {
                            ArticleViewer articleViewer4 = ArticleViewer.this;
                            articleViewer4.textSelectionHelper.trySelect(articleViewer4.pressedLinkOwnerView);
                        } else {
                            articleTextSelectionHelper.trySelect(articleViewer.pressedLinkOwnerView);
                        }
                        if (ArticleViewer.this.textSelectionHelper.isSelectionMode()) {
                            ArticleViewer.this.windowView.performHapticFeedback(0, 2);
                            return;
                        }
                        return;
                    }
                }
                if (ArticleViewer.this.pressedLinkOwnerLayout != null && ArticleViewer.this.pressedLinkOwnerView != null) {
                    ArticleViewer.this.windowView.performHapticFeedback(0, 2);
                    int[] iArr = new int[2];
                    ArticleViewer.this.pressedLinkOwnerView.getLocationInWindow(iArr);
                    int dp = (iArr[1] + ArticleViewer.this.pressedLayoutY) - AndroidUtilities.m34dp(54.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    ArticleViewer.this.pressedLinkOwnerView.invalidate();
                    ArticleViewer.this.drawBlockSelection = true;
                    ArticleViewer articleViewer5 = ArticleViewer.this;
                    articleViewer5.showPopup(articleViewer5.pressedLinkOwnerView, 48, 0, dp);
                    ArticleViewer.this.listView[0].setLayoutFrozen(true);
                    ArticleViewer.this.listView[0].setLayoutFrozen(false);
                }
            }
        }
    }

    private void createPaint(boolean z) {
        if (quoteLinePaint == null) {
            quoteLinePaint = new Paint();
            preformattedBackgroundPaint = new Paint();
            Paint paint = new Paint(1);
            tableLinePaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            tableLinePaint.setStrokeWidth(AndroidUtilities.m34dp(1.0f));
            Paint paint2 = new Paint();
            tableHalfLinePaint = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            tableHalfLinePaint.setStrokeWidth(AndroidUtilities.m34dp(1.0f) / 2.0f);
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
        int color = Theme.getColor("windowBackgroundWhite");
        webpageSearchPaint.setColor((((((float) Color.red(color)) * 0.2126f) + (((float) Color.green(color)) * 0.7152f)) + (((float) Color.blue(color)) * 0.0722f)) / 255.0f <= 0.705f ? -3041234 : -6551);
        webpageUrlPaint.setColor(Theme.getColor("windowBackgroundWhiteLinkSelection") & 872415231);
        webpageUrlPaint.setPathEffect(LinkPath.getRoundedEffect());
        urlPaint.setColor(Theme.getColor("windowBackgroundWhiteLinkSelection") & 872415231);
        urlPaint.setPathEffect(LinkPath.getRoundedEffect());
        tableHalfLinePaint.setColor(Theme.getColor("windowBackgroundWhiteInputField"));
        tableLinePaint.setColor(Theme.getColor("windowBackgroundWhiteInputField"));
        photoBackgroundPaint.setColor(AndroidUtilities.LIGHT_STATUS_BAR_OVERLAY);
        dividerPaint.setColor(Theme.getColor("divider"));
        webpageMarkPaint.setColor(Theme.getColor("windowBackgroundWhiteLinkSelection") & 872415231);
        webpageMarkPaint.setPathEffect(LinkPath.getRoundedEffect());
        int color2 = Theme.getColor("switchTrack");
        int red = Color.red(color2);
        int green = Color.green(color2);
        int blue = Color.blue(color2);
        tableStripPaint.setColor(Color.argb(20, red, green, blue));
        tableHeaderPaint.setColor(Color.argb(34, red, green, blue));
        int color3 = Theme.getColor("windowBackgroundWhiteLinkSelection");
        preformattedBackgroundPaint.setColor(Color.argb(20, Color.red(color3), Color.green(color3), Color.blue(color3)));
        quoteLinePaint.setColor(Theme.getColor("chat_inReplyLine"));
    }

    public void showCopyPopup(final String str) {
        if (this.parentActivity != null) {
            BottomSheet bottomSheet = this.linkSheet;
            if (bottomSheet != null) {
                bottomSheet.dismiss();
                this.linkSheet = null;
            }
            BottomSheet.Builder builder = new BottomSheet.Builder(this.parentActivity);
            builder.setTitle(str);
            builder.setItems(new CharSequence[]{LocaleController.getString("Open", C0952R.string.Open), LocaleController.getString("Copy", C0952R.string.Copy)}, new DialogInterface.OnClickListener() {
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
    }

    public void lambda$showCopyPopup$0(String str, DialogInterface dialogInterface, int i) {
        String str2;
        if (this.parentActivity != null) {
            if (i == 0) {
                int lastIndexOf = str.lastIndexOf(35);
                if (lastIndexOf != -1) {
                    String lowerCase = !TextUtils.isEmpty(this.adapter[0].currentPage.cached_page.url) ? this.adapter[0].currentPage.cached_page.url.toLowerCase() : this.adapter[0].currentPage.url.toLowerCase();
                    try {
                        str2 = URLDecoder.decode(str.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                        str2 = "";
                    }
                    if (str.toLowerCase().contains(lowerCase)) {
                        if (TextUtils.isEmpty(str2)) {
                            this.layoutManager[0].scrollToPositionWithOffset(0, 0);
                            checkScrollAnimated();
                            return;
                        }
                        scrollToAnchor(str2);
                        return;
                    }
                }
                Browser.openUrl(this.parentActivity, str);
            } else if (i == 1) {
                if (str.startsWith("mailto:")) {
                    str = str.substring(7);
                } else if (str.startsWith("tel:")) {
                    str = str.substring(4);
                }
                AndroidUtilities.addToClipboard(str);
            }
        }
    }

    public void lambda$showCopyPopup$1(DialogInterface dialogInterface) {
        this.links.clear();
    }

    public void showPopup(View view, int i, int i2, int i3) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            if (this.popupLayout == null) {
                this.popupRect = new Rect();
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity);
                this.popupLayout = actionBarPopupWindowLayout;
                actionBarPopupWindowLayout.setPadding(AndroidUtilities.m34dp(1.0f), AndroidUtilities.m34dp(1.0f), AndroidUtilities.m34dp(1.0f), AndroidUtilities.m34dp(1.0f));
                this.popupLayout.setBackgroundDrawable(this.parentActivity.getResources().getDrawable(C0952R.C0953drawable.menu_copy));
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
                this.popupLayout.setShownFromBotton(false);
                TextView textView = new TextView(this.parentActivity);
                this.deleteView = textView;
                textView.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor("listSelectorSDK21"), 2));
                this.deleteView.setGravity(16);
                this.deleteView.setPadding(AndroidUtilities.m34dp(20.0f), 0, AndroidUtilities.m34dp(20.0f), 0);
                this.deleteView.setTextSize(1, 15.0f);
                this.deleteView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                this.deleteView.setText(LocaleController.getString("Copy", C0952R.string.Copy).toUpperCase());
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
                this.popupWindow.setAnimationStyle(C0952R.style.PopupContextAnimation);
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
            this.deleteView.setTextColor(Theme.getColor("actionBarDefaultSubmenuItem"));
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.popupLayout;
            if (actionBarPopupWindowLayout2 != null) {
                actionBarPopupWindowLayout2.setBackgroundColor(Theme.getColor("actionBarDefaultSubmenuBackground"));
            }
            this.popupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(1000.0f), Integer.MIN_VALUE));
            this.popupWindow.setFocusable(true);
            this.popupWindow.showAtLocation(view, i, i2, i3);
            this.popupWindow.startAnimation();
            return;
        }
        this.popupWindow.dismiss();
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
            if (Build.VERSION.SDK_INT < 31) {
                Toast.makeText(this.parentActivity, LocaleController.getString("TextCopied", C0952R.string.TextCopied), 0).show();
            }
        }
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss(true);
        }
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
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockBlockquote) {
            return ((TLRPC$TL_pageBlockBlockquote) tLRPC$PageBlock).caption;
        } else {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
                TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock;
                if (i == 0) {
                    return tLRPC$TL_pageBlockVideo.caption.text;
                }
                if (i == 1) {
                    return tLRPC$TL_pageBlockVideo.caption.credit;
                }
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPullquote) {
                return ((TLRPC$TL_pageBlockPullquote) tLRPC$PageBlock).caption;
            } else {
                if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAudio) {
                    TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio = (TLRPC$TL_pageBlockAudio) tLRPC$PageBlock;
                    if (i == 0) {
                        return tLRPC$TL_pageBlockAudio.caption.text;
                    }
                    if (i == 1) {
                        return tLRPC$TL_pageBlockAudio.caption.credit;
                    }
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                    return getBlockCaption(((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover, i);
                } else {
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
        } else if (!(view instanceof BlockOrderedListItemCell)) {
            return view;
        } else {
            BlockOrderedListItemCell blockOrderedListItemCell = (BlockOrderedListItemCell) view;
            return blockOrderedListItemCell.blockLayout != null ? getLastNonListCell(blockOrderedListItemCell.blockLayout.itemView) : view;
        }
    }

    public boolean isListItemBlock(TLRPC$PageBlock tLRPC$PageBlock) {
        return (tLRPC$PageBlock instanceof TL_pageBlockListItem) || (tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem);
    }

    public TLRPC$PageBlock getLastNonListPageBlock(TLRPC$PageBlock tLRPC$PageBlock) {
        if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
            TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) tLRPC$PageBlock;
            return tL_pageBlockListItem.blockItem != null ? getLastNonListPageBlock(tL_pageBlockListItem.blockItem) : tL_pageBlockListItem.blockItem;
        } else if (!(tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem)) {
            return tLRPC$PageBlock;
        } else {
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) tLRPC$PageBlock;
            return tL_pageBlockOrderedListItem.blockItem != null ? getLastNonListPageBlock(tL_pageBlockOrderedListItem.blockItem) : tL_pageBlockOrderedListItem.blockItem;
        }
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
        } else if (!(lastNonListPageBlock instanceof TL_pageBlockDetailsChild)) {
            return false;
        } else {
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
            if (!openAllParentBlocks(tL_pageBlockDetailsChild2)) {
            }
        }
    }

    public TLRPC$PageBlock fixListBlock(TLRPC$PageBlock tLRPC$PageBlock, TLRPC$PageBlock tLRPC$PageBlock2) {
        if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
            ((TL_pageBlockListItem) tLRPC$PageBlock).blockItem = tLRPC$PageBlock2;
            return tLRPC$PageBlock;
        } else if (!(tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem)) {
            return tLRPC$PageBlock2;
        } else {
            ((TL_pageBlockOrderedListItem) tLRPC$PageBlock).blockItem = tLRPC$PageBlock2;
            return tLRPC$PageBlock;
        }
    }

    public TLRPC$PageBlock wrapInTableBlock(TLRPC$PageBlock tLRPC$PageBlock, TLRPC$PageBlock tLRPC$PageBlock2) {
        if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
            TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) tLRPC$PageBlock;
            TL_pageBlockListItem tL_pageBlockListItem2 = new TL_pageBlockListItem();
            tL_pageBlockListItem2.parent = tL_pageBlockListItem.parent;
            tL_pageBlockListItem2.blockItem = wrapInTableBlock(tL_pageBlockListItem.blockItem, tLRPC$PageBlock2);
            return tL_pageBlockListItem2;
        } else if (!(tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem)) {
            return tLRPC$PageBlock2;
        } else {
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) tLRPC$PageBlock;
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = new TL_pageBlockOrderedListItem();
            tL_pageBlockOrderedListItem2.parent = tL_pageBlockOrderedListItem.parent;
            tL_pageBlockOrderedListItem2.blockItem = wrapInTableBlock(tL_pageBlockOrderedListItem.blockItem, tLRPC$PageBlock2);
            return tL_pageBlockOrderedListItem2;
        }
    }

    public void updateInterfaceForCurrentPage(TLRPC$WebPage tLRPC$WebPage, boolean z, int i) {
        TLRPC$WebPage tLRPC$WebPage2;
        int i2;
        if (tLRPC$WebPage != null && tLRPC$WebPage.cached_page != null) {
            boolean z2 = true;
            if (z == 0 && i != 0) {
                WebpageAdapter[] webpageAdapterArr = this.adapter;
                WebpageAdapter webpageAdapter = webpageAdapterArr[1];
                webpageAdapterArr[1] = webpageAdapterArr[0];
                webpageAdapterArr[0] = webpageAdapter;
                RecyclerListView[] recyclerListViewArr = this.listView;
                RecyclerListView recyclerListView = recyclerListViewArr[1];
                recyclerListViewArr[1] = recyclerListViewArr[0];
                recyclerListViewArr[0] = recyclerListView;
                LinearLayoutManager[] linearLayoutManagerArr = this.layoutManager;
                LinearLayoutManager linearLayoutManager = linearLayoutManagerArr[1];
                linearLayoutManagerArr[1] = linearLayoutManagerArr[0];
                linearLayoutManagerArr[0] = linearLayoutManager;
                int indexOfChild = this.containerView.indexOfChild(recyclerListViewArr[0]);
                int indexOfChild2 = this.containerView.indexOfChild(this.listView[1]);
                if (i == 1) {
                    if (indexOfChild < indexOfChild2) {
                        this.containerView.removeView(this.listView[0]);
                        this.containerView.addView(this.listView[0], indexOfChild2);
                    }
                } else if (indexOfChild2 < indexOfChild) {
                    this.containerView.removeView(this.listView[0]);
                    this.containerView.addView(this.listView[0], indexOfChild);
                }
                this.pageSwitchAnimation = new AnimatorSet();
                this.listView[0].setVisibility(0);
                final int i3 = i == 1 ? 0 : 1;
                this.listView[i3].setBackgroundColor(this.backgroundPaint.getColor());
                if (Build.VERSION.SDK_INT >= 18) {
                    this.listView[i3].setLayerType(2, null);
                }
                if (i == 1) {
                    this.pageSwitchAnimation.playTogether(ObjectAnimator.ofFloat(this.listView[0], View.TRANSLATION_X, AndroidUtilities.m34dp(56.0f), 0.0f), ObjectAnimator.ofFloat(this.listView[0], View.ALPHA, 0.0f, 1.0f));
                } else if (i == -1) {
                    this.listView[0].setAlpha(1.0f);
                    this.listView[0].setTranslationX(0.0f);
                    this.pageSwitchAnimation.playTogether(ObjectAnimator.ofFloat(this.listView[1], View.TRANSLATION_X, 0.0f, AndroidUtilities.m34dp(56.0f)), ObjectAnimator.ofFloat(this.listView[1], View.ALPHA, 1.0f, 0.0f));
                }
                this.pageSwitchAnimation.setDuration(150L);
                this.pageSwitchAnimation.setInterpolator(this.interpolator);
                this.pageSwitchAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ArticleViewer.this.listView[1].setVisibility(8);
                        ArticleViewer articleViewer = ArticleViewer.this;
                        articleViewer.textSelectionHelper.setParentView(articleViewer.listView[0]);
                        ArticleViewer articleViewer2 = ArticleViewer.this;
                        articleViewer2.textSelectionHelper.layoutManager = articleViewer2.layoutManager[0];
                        ArticleViewer.this.listView[i3].setBackgroundDrawable(null);
                        if (Build.VERSION.SDK_INT >= 18) {
                            ArticleViewer.this.listView[i3].setLayerType(0, null);
                        }
                        ArticleViewer.this.pageSwitchAnimation = null;
                    }
                });
                this.pageSwitchAnimation.start();
            }
            if (z == 0) {
                SimpleTextView simpleTextView = this.titleTextView;
                String str = tLRPC$WebPage.site_name;
                if (str == null) {
                    str = "";
                }
                simpleTextView.setText(str);
                this.textSelectionHelper.clear(true);
                this.headerView.invalidate();
            }
            if (z != 0) {
                ArrayList<TLRPC$WebPage> arrayList = this.pagesStack;
                tLRPC$WebPage2 = arrayList.get(arrayList.size() - 2);
            } else {
                tLRPC$WebPage2 = tLRPC$WebPage;
            }
            this.adapter[z ? 1 : 0].isRtl = tLRPC$WebPage.cached_page.rtl;
            this.adapter[z].cleanup();
            this.adapter[z].currentPage = tLRPC$WebPage2;
            int size = tLRPC$WebPage2.cached_page.blocks.size();
            int i4 = 0;
            while (i4 < size) {
                TLRPC$PageBlock tLRPC$PageBlock = tLRPC$WebPage2.cached_page.blocks.get(i4);
                if (i4 == 0) {
                    tLRPC$PageBlock.first = true;
                    if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                        TLRPC$TL_pageBlockCover tLRPC$TL_pageBlockCover = (TLRPC$TL_pageBlockCover) tLRPC$PageBlock;
                        TLRPC$RichText blockCaption = getBlockCaption(tLRPC$TL_pageBlockCover, 0);
                        TLRPC$RichText blockCaption2 = getBlockCaption(tLRPC$TL_pageBlockCover, 1);
                        if (((blockCaption != null && !(blockCaption instanceof TLRPC$TL_textEmpty)) || (blockCaption2 != null && !(blockCaption2 instanceof TLRPC$TL_textEmpty))) && size > 1) {
                            TLRPC$PageBlock tLRPC$PageBlock2 = tLRPC$WebPage2.cached_page.blocks.get(1);
                            if (tLRPC$PageBlock2 instanceof TLRPC$TL_pageBlockChannel) {
                                this.adapter[z].channelBlock = (TLRPC$TL_pageBlockChannel) tLRPC$PageBlock2;
                            }
                        }
                    }
                } else if (i4 == 1 && this.adapter[z].channelBlock != null) {
                    i4++;
                }
                WebpageAdapter[] webpageAdapterArr2 = this.adapter;
                webpageAdapterArr2[z].addBlock(webpageAdapterArr2[z], tLRPC$PageBlock, 0, 0, i4 == size + (-1) ? i4 : 0);
                i4++;
            }
            this.adapter[z].notifyDataSetChanged();
            if (this.pagesStack.size() == 1 || i == -1) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0);
                String str2 = "article" + tLRPC$WebPage2.f994id;
                int i5 = sharedPreferences.getInt(str2, -1);
                boolean z3 = sharedPreferences.getBoolean(str2 + "r", true);
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y) {
                    z2 = false;
                }
                if (z3 == z2) {
                    i2 = sharedPreferences.getInt(str2 + "o", 0) - this.listView[z].getPaddingTop();
                } else {
                    i2 = AndroidUtilities.m34dp(10.0f);
                }
                if (i5 != -1) {
                    this.layoutManager[z].scrollToPositionWithOffset(i5, i2);
                }
            } else {
                this.layoutManager[z].scrollToPositionWithOffset(0, 0);
            }
            if (z == 0) {
                checkScrollAnimated();
            }
        }
    }

    private boolean addPageToStack(TLRPC$WebPage tLRPC$WebPage, String str, int i) {
        saveCurrentPagePosition();
        this.pagesStack.add(tLRPC$WebPage);
        showSearch(false);
        updateInterfaceForCurrentPage(tLRPC$WebPage, false, i);
        return scrollToAnchor(str);
    }

    private boolean scrollToAnchor(String str) {
        Integer num = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        Integer num2 = (Integer) this.adapter[0].anchors.get(lowerCase);
        if (num2 != null) {
            TLRPC$TL_textAnchor tLRPC$TL_textAnchor = (TLRPC$TL_textAnchor) this.adapter[0].anchorsParent.get(lowerCase);
            if (tLRPC$TL_textAnchor != null) {
                TLRPC$TL_pageBlockParagraph tLRPC$TL_pageBlockParagraph = new TLRPC$TL_pageBlockParagraph();
                tLRPC$TL_pageBlockParagraph.text = tLRPC$TL_textAnchor.text;
                int typeForBlock = this.adapter[0].getTypeForBlock(tLRPC$TL_pageBlockParagraph);
                RecyclerView.ViewHolder onCreateViewHolder = this.adapter[0].onCreateViewHolder(null, typeForBlock);
                this.adapter[0].bindBlockToHolder(typeForBlock, onCreateViewHolder, tLRPC$TL_pageBlockParagraph, 0, 0);
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
                    public void onStateChanged(boolean z) {
                        if (ArticleViewer.this.linkSheet != null) {
                            ArticleViewer.this.linkSheet.setDisableScroll(z);
                        }
                    }
                });
                TextView textView = new TextView(this, this.parentActivity) {
                    @Override
                    protected void onDraw(Canvas canvas) {
                        canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, ArticleViewer.dividerPaint);
                        super.onDraw(canvas);
                    }
                };
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                textView.setText(LocaleController.getString("InstantViewReference", C0952R.string.InstantViewReference));
                textView.setGravity((this.adapter[0].isRtl ? 5 : 3) | 16);
                textView.setTextColor(getTextColor());
                textView.setPadding(AndroidUtilities.m34dp(18.0f), 0, AndroidUtilities.m34dp(18.0f), 0);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, AndroidUtilities.m34dp(48.0f) + 1));
                onCreateViewHolder.itemView.setTag("bottomSheet");
                linearLayout.addView(onCreateViewHolder.itemView, LayoutHelper.createLinear(-1, -2, 0.0f, 7.0f, 0.0f, 0.0f));
                TextSelectionHelper<Cell>.TextSelectionOverlay overlayView = this.textSelectionHelperBottomSheet.getOverlayView(this.parentActivity);
                FrameLayout frameLayout = new FrameLayout(this.parentActivity) {
                    @Override
                    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                        TextSelectionHelper<Cell>.TextSelectionOverlay overlayView2 = ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext());
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                        if (ArticleViewer.this.textSelectionHelperBottomSheet.isSelectionMode() && ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext()).onTouchEvent(obtain)) {
                            return true;
                        }
                        if (overlayView2.checkOnTap(motionEvent)) {
                            motionEvent.setAction(3);
                        }
                        if (motionEvent.getAction() != 0 || !ArticleViewer.this.textSelectionHelperBottomSheet.isSelectionMode() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        if (ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext()).onTouchEvent(obtain)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return true;
                    }

                    @Override
                    protected void onMeasure(int i, int i2) {
                        super.onMeasure(i, i2);
                        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredHeight() + AndroidUtilities.m34dp(8.0f), 1073741824));
                    }
                };
                builder.setDelegate(new BottomSheet.BottomSheetDelegate() {
                    @Override
                    public boolean canDismiss() {
                        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper2 = ArticleViewer.this.textSelectionHelperBottomSheet;
                        if (articleTextSelectionHelper2 == null || !articleTextSelectionHelper2.isSelectionMode()) {
                            return true;
                        }
                        ArticleViewer.this.textSelectionHelperBottomSheet.clear();
                        return false;
                    }
                });
                frameLayout.addView(linearLayout, -1, -2);
                frameLayout.addView(overlayView, -1, -2);
                builder.setCustomView(frameLayout);
                if (this.textSelectionHelper.isSelectionMode()) {
                    this.textSelectionHelper.clear();
                }
                BottomSheet create = builder.create();
                this.linkSheet = create;
                showDialog(create);
            } else if (num2.intValue() >= 0 && num2.intValue() < this.adapter[0].blocks.size()) {
                TLRPC$PageBlock tLRPC$PageBlock = (TLRPC$PageBlock) this.adapter[0].blocks.get(num2.intValue());
                TLRPC$PageBlock lastNonListPageBlock = getLastNonListPageBlock(tLRPC$PageBlock);
                if ((lastNonListPageBlock instanceof TL_pageBlockDetailsChild) && openAllParentBlocks((TL_pageBlockDetailsChild) lastNonListPageBlock)) {
                    this.adapter[0].updateRows();
                    this.adapter[0].notifyDataSetChanged();
                }
                int indexOf = this.adapter[0].localBlocks.indexOf(tLRPC$PageBlock);
                if (indexOf != -1) {
                    num2 = Integer.valueOf(indexOf);
                }
                Integer num3 = (Integer) this.adapter[0].anchorsOffset.get(lowerCase);
                if (num3 != null) {
                    if (num3.intValue() == -1) {
                        int typeForBlock2 = this.adapter[0].getTypeForBlock(tLRPC$PageBlock);
                        RecyclerView.ViewHolder onCreateViewHolder2 = this.adapter[0].onCreateViewHolder(null, typeForBlock2);
                        this.adapter[0].bindBlockToHolder(typeForBlock2, onCreateViewHolder2, tLRPC$PageBlock, 0, 0);
                        onCreateViewHolder2.itemView.measure(View.MeasureSpec.makeMeasureSpec(this.listView[0].getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        Integer num4 = (Integer) this.adapter[0].anchorsOffset.get(lowerCase);
                        if (num4.intValue() != -1) {
                            num = num4;
                        }
                    } else {
                        num = num3;
                    }
                }
                this.layoutManager[0].scrollToPositionWithOffset(num2.intValue(), (this.currentHeaderHeight - AndroidUtilities.m34dp(56.0f)) - num.intValue());
            }
            return true;
        }
        return false;
    }

    private boolean removeLastPageFromStack() {
        if (this.pagesStack.size() < 2) {
            return false;
        }
        ArrayList<TLRPC$WebPage> arrayList = this.pagesStack;
        arrayList.remove(arrayList.size() - 1);
        ArrayList<TLRPC$WebPage> arrayList2 = this.pagesStack;
        updateInterfaceForCurrentPage(arrayList2.get(arrayList2.size() - 1), false, -1);
        return true;
    }

    protected void startCheckLongPress(float f, float f2, View view) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
        if (!this.checkingForLongPress) {
            this.checkingForLongPress = true;
            if (this.pendingCheckForTap == null) {
                this.pendingCheckForTap = new CheckForTap();
            }
            if (view.getTag() == null || view.getTag() != "bottomSheet" || (articleTextSelectionHelper = this.textSelectionHelperBottomSheet) == null) {
                this.textSelectionHelper.setMaybeView((int) f, (int) f2, view);
            } else {
                articleTextSelectionHelper.setMaybeView((int) f, (int) f2, view);
            }
            this.windowView.postDelayed(this.pendingCheckForTap, ViewConfiguration.getTapTimeout());
        }
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
        } else if (tLRPC$RichText instanceof TLRPC$TL_textSubscript) {
            return getTextFlags(tLRPC$RichText.parentRichText) | ConnectionsManager.RequestFlagNeedQuickAck;
        } else {
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
            return tLRPC$RichText;
        } else if (tLRPC$RichText instanceof TLRPC$TL_textSubscript) {
            return getLastRichText(((TLRPC$TL_textSubscript) tLRPC$RichText).text);
        } else {
            if (tLRPC$RichText instanceof TLRPC$TL_textSuperscript) {
                return getLastRichText(((TLRPC$TL_textSuperscript) tLRPC$RichText).text);
            }
            if (tLRPC$RichText instanceof TLRPC$TL_textMarked) {
                return getLastRichText(((TLRPC$TL_textMarked) tLRPC$RichText).text);
            }
            return tLRPC$RichText instanceof TLRPC$TL_textPhone ? getLastRichText(((TLRPC$TL_textPhone) tLRPC$RichText).text) : tLRPC$RichText;
        }
    }

    public CharSequence getText(WebpageAdapter webpageAdapter, View view, TLRPC$RichText tLRPC$RichText, TLRPC$RichText tLRPC$RichText2, TLRPC$PageBlock tLRPC$PageBlock, int i) {
        return getText(webpageAdapter.currentPage, view, tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock, i);
    }

    public CharSequence getText(TLRPC$WebPage tLRPC$WebPage, View view, TLRPC$RichText tLRPC$RichText, TLRPC$RichText tLRPC$RichText2, TLRPC$PageBlock tLRPC$PageBlock, int i) {
        int i2;
        int i3;
        Object obj;
        Object obj2;
        TextPaint textPaint = null;
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
                if (metricAffectingSpanArr == null || metricAffectingSpanArr.length == 0) {
                    textPaint = getTextPaint(tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock);
                }
                spannableStringBuilder.setSpan(new TextPaintUrlSpan(textPaint, "mailto:" + getUrl(tLRPC$RichText2)), 0, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j = 0;
        if (tLRPC$RichText2 instanceof TLRPC$TL_textUrl) {
            TLRPC$TL_textUrl tLRPC$TL_textUrl = (TLRPC$TL_textUrl) tLRPC$RichText2;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, tLRPC$TL_textUrl.text, tLRPC$PageBlock, i));
            MetricAffectingSpan[] metricAffectingSpanArr2 = (MetricAffectingSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), MetricAffectingSpan.class);
            TextPaint textPaint2 = (metricAffectingSpanArr2 == null || metricAffectingSpanArr2.length == 0) ? getTextPaint(tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock) : null;
            if (tLRPC$TL_textUrl.webpage_id != 0) {
                obj2 = new TextPaintWebpageUrlSpan(textPaint2, getUrl(tLRPC$RichText2));
            } else {
                obj2 = new TextPaintUrlSpan(textPaint2, getUrl(tLRPC$RichText2));
            }
            if (spannableStringBuilder2.length() != 0) {
                spannableStringBuilder2.setSpan(obj2, 0, spannableStringBuilder2.length(), 33);
            }
            return spannableStringBuilder2;
        } else if (tLRPC$RichText2 instanceof TLRPC$TL_textPlain) {
            return ((TLRPC$TL_textPlain) tLRPC$RichText2).text;
        } else {
            if (tLRPC$RichText2 instanceof TLRPC$TL_textAnchor) {
                TLRPC$TL_textAnchor tLRPC$TL_textAnchor = (TLRPC$TL_textAnchor) tLRPC$RichText2;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, tLRPC$TL_textAnchor.text, tLRPC$PageBlock, i));
                spannableStringBuilder3.setSpan(new AnchorSpan(tLRPC$TL_textAnchor.name), 0, spannableStringBuilder3.length(), 17);
                return spannableStringBuilder3;
            }
            ?? r2 = "";
            if (tLRPC$RichText2 instanceof TLRPC$TL_textEmpty) {
                return r2;
            }
            if (tLRPC$RichText2 instanceof TLRPC$TL_textConcat) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                int size = tLRPC$RichText2.texts.size();
                int i4 = 0;
                while (i4 < size) {
                    TLRPC$RichText tLRPC$RichText3 = tLRPC$RichText2.texts.get(i4);
                    TLRPC$RichText lastRichText = getLastRichText(tLRPC$RichText3);
                    boolean z = i >= 0 && (tLRPC$RichText3 instanceof TLRPC$TL_textUrl) && ((TLRPC$TL_textUrl) tLRPC$RichText3).webpage_id != j;
                    if (!(!z || spannableStringBuilder4.length() == 0 || spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) == '\n')) {
                        spannableStringBuilder4.append((CharSequence) " ");
                        spannableStringBuilder4.setSpan(new TextSelectionHelper.IgnoreCopySpannable(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                    }
                    int i5 = i4;
                    int i6 = size;
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
                                obj = new TextPaintWebpageUrlSpan(getTextPaint(tLRPC$RichText, lastRichText, tLRPC$PageBlock), url);
                            } else {
                                obj = new TextPaintUrlSpan(getTextPaint(tLRPC$RichText, lastRichText, tLRPC$PageBlock), url);
                            }
                            if (length != spannableStringBuilder4.length()) {
                                spannableStringBuilder4.setSpan(obj, length, spannableStringBuilder4.length(), 33);
                            }
                        } else if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(new TextPaintSpan(getTextPaint(tLRPC$RichText, lastRichText, tLRPC$PageBlock)), length, spannableStringBuilder4.length(), 33);
                        }
                    }
                    if (z && i5 != i6 - 1) {
                        spannableStringBuilder4.append((CharSequence) " ");
                        spannableStringBuilder4.setSpan(new TextSelectionHelper.IgnoreCopySpannable(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                    }
                    i4 = i5 + 1;
                    size = i6;
                    j = 0;
                }
                return spannableStringBuilder4;
            } else if (tLRPC$RichText2 instanceof TLRPC$TL_textSubscript) {
                return getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textSubscript) tLRPC$RichText2).text, tLRPC$PageBlock, i);
            } else {
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
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textPhone) {
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(getText(tLRPC$WebPage, view, tLRPC$RichText, ((TLRPC$TL_textPhone) tLRPC$RichText2).text, tLRPC$PageBlock, i));
                    MetricAffectingSpan[] metricAffectingSpanArr4 = (MetricAffectingSpan[]) spannableStringBuilder6.getSpans(0, spannableStringBuilder6.length(), MetricAffectingSpan.class);
                    if (spannableStringBuilder6.length() != 0) {
                        TextPaint textPaint3 = (metricAffectingSpanArr4 == null || metricAffectingSpanArr4.length == 0) ? getTextPaint(tLRPC$RichText, tLRPC$RichText2, tLRPC$PageBlock) : null;
                        spannableStringBuilder6.setSpan(new TextPaintUrlSpan(textPaint3, "tel:" + getUrl(tLRPC$RichText2)), 0, spannableStringBuilder6.length(), 33);
                    }
                    return spannableStringBuilder6;
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textImage) {
                    TLRPC$TL_textImage tLRPC$TL_textImage = (TLRPC$TL_textImage) tLRPC$RichText2;
                    TLRPC$Document documentWithId = WebPageUtils.getDocumentWithId(tLRPC$WebPage, tLRPC$TL_textImage.document_id);
                    if (documentWithId != null) {
                        r2 = new SpannableStringBuilder("*");
                        int dp = AndroidUtilities.m34dp(tLRPC$TL_textImage.f975w);
                        int dp2 = AndroidUtilities.m34dp(tLRPC$TL_textImage.f974h);
                        int abs = Math.abs(i);
                        if (dp > abs) {
                            i2 = (int) (dp2 * (abs / dp));
                            i3 = abs;
                        } else {
                            i2 = dp2;
                            i3 = dp;
                        }
                        if (view != null) {
                            int color = Theme.getColor("windowBackgroundWhite");
                            r2.setSpan(new TextPaintImageReceiverSpan(view, documentWithId, tLRPC$WebPage, i3, i2, false, (((((float) Color.red(color)) * 0.2126f) + (((float) Color.green(color)) * 0.7152f)) + (((float) Color.blue(color)) * 0.0722f)) / 255.0f <= 0.705f), 0, r2.length(), 33);
                        }
                    }
                    return r2;
                } else {
                    return "not supported " + tLRPC$RichText2;
                }
            }
        }
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
        } else if (tLRPC$RichText instanceof TLRPC$TL_textSubscript) {
            return getPlainText(((TLRPC$TL_textSubscript) tLRPC$RichText).text);
        } else {
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
        return Theme.getColor("windowBackgroundWhiteBlackText");
    }

    public int getLinkTextColor() {
        return Theme.getColor("windowBackgroundWhiteLinkText");
    }

    public static int getGrayTextColor() {
        return Theme.getColor("windowBackgroundWhiteGrayText");
    }

    private TextPaint getTextPaint(TLRPC$RichText tLRPC$RichText, TLRPC$RichText tLRPC$RichText2, TLRPC$PageBlock tLRPC$PageBlock) {
        int i;
        int i2;
        SparseArray<TextPaint> sparseArray;
        int i3;
        SparseArray<TextPaint> sparseArray2;
        int i4;
        SparseArray<TextPaint> sparseArray3;
        int i5;
        SparseArray<TextPaint> sparseArray4;
        int i6;
        SparseArray<TextPaint> sparseArray5;
        int i7;
        SparseArray<TextPaint> sparseArray6;
        int i8;
        SparseArray<TextPaint> sparseArray7;
        int textFlags = getTextFlags(tLRPC$RichText2);
        int dp = AndroidUtilities.m34dp(14.0f);
        int dp2 = AndroidUtilities.m34dp(SharedConfig.ivFontSize - 16);
        SparseArray<TextPaint> sparseArray8 = null;
        if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
            TLRPC$RichText tLRPC$RichText3 = ((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock).caption.text;
            if (tLRPC$RichText3 == tLRPC$RichText2 || tLRPC$RichText3 == tLRPC$RichText) {
                sparseArray7 = photoCaptionTextPaints;
                i8 = AndroidUtilities.m34dp(14.0f);
            } else {
                sparseArray7 = photoCreditTextPaints;
                i8 = AndroidUtilities.m34dp(12.0f);
            }
            sparseArray8 = sparseArray7;
            dp = i8;
            i = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockMap) {
            TLRPC$RichText tLRPC$RichText4 = ((TLRPC$TL_pageBlockMap) tLRPC$PageBlock).caption.text;
            if (tLRPC$RichText4 == tLRPC$RichText2 || tLRPC$RichText4 == tLRPC$RichText) {
                sparseArray6 = photoCaptionTextPaints;
                i7 = AndroidUtilities.m34dp(14.0f);
            } else {
                sparseArray6 = photoCreditTextPaints;
                i7 = AndroidUtilities.m34dp(12.0f);
            }
            sparseArray8 = sparseArray6;
            dp = i7;
            i = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTitle) {
            sparseArray8 = titleTextPaints;
            dp = AndroidUtilities.m34dp(23.0f);
            i = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockKicker) {
            sparseArray8 = kickerTextPaints;
            dp = AndroidUtilities.m34dp(14.0f);
            i = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAuthorDate) {
            sparseArray8 = authorTextPaints;
            dp = AndroidUtilities.m34dp(14.0f);
            i = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockFooter) {
            sparseArray8 = footerTextPaints;
            dp = AndroidUtilities.m34dp(14.0f);
            i = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubtitle) {
            sparseArray8 = subtitleTextPaints;
            dp = AndroidUtilities.m34dp(20.0f);
            i = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockHeader) {
            sparseArray8 = headerTextPaints;
            dp = AndroidUtilities.m34dp(20.0f);
            i = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubheader) {
            sparseArray8 = subheaderTextPaints;
            dp = AndroidUtilities.m34dp(17.0f);
            i = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockBlockquote) {
            TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote = (TLRPC$TL_pageBlockBlockquote) tLRPC$PageBlock;
            if (tLRPC$TL_pageBlockBlockquote.text == tLRPC$RichText) {
                sparseArray8 = quoteTextPaints;
                dp = AndroidUtilities.m34dp(15.0f);
                i = getTextColor();
            } else {
                if (tLRPC$TL_pageBlockBlockquote.caption == tLRPC$RichText) {
                    sparseArray8 = photoCaptionTextPaints;
                    dp = AndroidUtilities.m34dp(14.0f);
                    i = getGrayTextColor();
                }
                i = -65536;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPullquote) {
            TLRPC$TL_pageBlockPullquote tLRPC$TL_pageBlockPullquote = (TLRPC$TL_pageBlockPullquote) tLRPC$PageBlock;
            if (tLRPC$TL_pageBlockPullquote.text == tLRPC$RichText) {
                sparseArray8 = quoteTextPaints;
                dp = AndroidUtilities.m34dp(15.0f);
                i = getTextColor();
            } else {
                if (tLRPC$TL_pageBlockPullquote.caption == tLRPC$RichText) {
                    sparseArray8 = photoCaptionTextPaints;
                    dp = AndroidUtilities.m34dp(14.0f);
                    i = getGrayTextColor();
                }
                i = -65536;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPreformatted) {
            sparseArray8 = preformattedTextPaints;
            dp = AndroidUtilities.m34dp(14.0f);
            i = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockParagraph) {
            sparseArray8 = paragraphTextPaints;
            dp = AndroidUtilities.m34dp(16.0f);
            i = getTextColor();
        } else if (isListItemBlock(tLRPC$PageBlock)) {
            sparseArray8 = listTextPaints;
            dp = AndroidUtilities.m34dp(16.0f);
            i = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbed) {
            TLRPC$RichText tLRPC$RichText5 = ((TLRPC$TL_pageBlockEmbed) tLRPC$PageBlock).caption.text;
            if (tLRPC$RichText5 == tLRPC$RichText2 || tLRPC$RichText5 == tLRPC$RichText) {
                sparseArray5 = photoCaptionTextPaints;
                i6 = AndroidUtilities.m34dp(14.0f);
            } else {
                sparseArray5 = photoCreditTextPaints;
                i6 = AndroidUtilities.m34dp(12.0f);
            }
            sparseArray8 = sparseArray5;
            dp = i6;
            i = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSlideshow) {
            TLRPC$RichText tLRPC$RichText6 = ((TLRPC$TL_pageBlockSlideshow) tLRPC$PageBlock).caption.text;
            if (tLRPC$RichText6 == tLRPC$RichText2 || tLRPC$RichText6 == tLRPC$RichText) {
                sparseArray4 = photoCaptionTextPaints;
                i5 = AndroidUtilities.m34dp(14.0f);
            } else {
                sparseArray4 = photoCreditTextPaints;
                i5 = AndroidUtilities.m34dp(12.0f);
            }
            sparseArray8 = sparseArray4;
            dp = i5;
            i = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
            TLRPC$RichText tLRPC$RichText7 = ((TLRPC$TL_pageBlockCollage) tLRPC$PageBlock).caption.text;
            if (tLRPC$RichText7 == tLRPC$RichText2 || tLRPC$RichText7 == tLRPC$RichText) {
                sparseArray3 = photoCaptionTextPaints;
                i4 = AndroidUtilities.m34dp(14.0f);
            } else {
                sparseArray3 = photoCreditTextPaints;
                i4 = AndroidUtilities.m34dp(12.0f);
            }
            sparseArray8 = sparseArray3;
            dp = i4;
            i = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbedPost) {
            TLRPC$TL_pageCaption tLRPC$TL_pageCaption = ((TLRPC$TL_pageBlockEmbedPost) tLRPC$PageBlock).caption;
            if (tLRPC$RichText2 == tLRPC$TL_pageCaption.text) {
                sparseArray8 = photoCaptionTextPaints;
                dp = AndroidUtilities.m34dp(14.0f);
                i = getGrayTextColor();
            } else if (tLRPC$RichText2 == tLRPC$TL_pageCaption.credit) {
                sparseArray8 = photoCreditTextPaints;
                dp = AndroidUtilities.m34dp(12.0f);
                i = getGrayTextColor();
            } else {
                if (tLRPC$RichText2 != null) {
                    sparseArray8 = embedPostTextPaints;
                    dp = AndroidUtilities.m34dp(14.0f);
                    i = getTextColor();
                }
                i = -65536;
            }
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
            if (tLRPC$RichText2 == ((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock).caption.text) {
                sparseArray2 = mediaCaptionTextPaints;
                i3 = AndroidUtilities.m34dp(14.0f);
            } else {
                sparseArray2 = mediaCreditTextPaints;
                i3 = AndroidUtilities.m34dp(12.0f);
            }
            sparseArray8 = sparseArray2;
            dp = i3;
            i = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAudio) {
            if (tLRPC$RichText2 == ((TLRPC$TL_pageBlockAudio) tLRPC$PageBlock).caption.text) {
                sparseArray = mediaCaptionTextPaints;
                i2 = AndroidUtilities.m34dp(14.0f);
            } else {
                sparseArray = mediaCreditTextPaints;
                i2 = AndroidUtilities.m34dp(12.0f);
            }
            sparseArray8 = sparseArray;
            dp = i2;
            i = getTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockRelatedArticles) {
            sparseArray8 = relatedArticleTextPaints;
            dp = AndroidUtilities.m34dp(15.0f);
            i = getGrayTextColor();
        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockDetails) {
            sparseArray8 = detailsTextPaints;
            dp = AndroidUtilities.m34dp(15.0f);
            i = getTextColor();
        } else {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTable) {
                sparseArray8 = tableTextPaints;
                dp = AndroidUtilities.m34dp(15.0f);
                i = getTextColor();
            }
            i = -65536;
        }
        int i9 = textFlags & 256;
        if (!(i9 == 0 && (textFlags & ConnectionsManager.RequestFlagNeedQuickAck) == 0)) {
            dp -= AndroidUtilities.m34dp(4.0f);
        }
        if (sparseArray8 == null) {
            if (errorTextPaint == null) {
                TextPaint textPaint = new TextPaint(1);
                errorTextPaint = textPaint;
                textPaint.setColor(-65536);
            }
            errorTextPaint.setTextSize(AndroidUtilities.m34dp(14.0f));
            return errorTextPaint;
        }
        TextPaint textPaint2 = sparseArray8.get(textFlags);
        if (textPaint2 == null) {
            textPaint2 = new TextPaint(1);
            if ((textFlags & 4) != 0) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockRelatedArticles) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            } else if (this.selectedFont != 1 && !(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTitle) && !(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockKicker) && !(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockHeader) && !(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubtitle) && !(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubheader)) {
                int i10 = textFlags & 1;
                if (i10 != 0 && (textFlags & 2) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf"));
                } else if (i10 != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                } else if ((textFlags & 2) != 0) {
                    textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                }
            } else if ((tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTitle) || (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockHeader) || (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubtitle) || (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubheader)) {
                textPaint2.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
            } else {
                int i11 = textFlags & 1;
                if (i11 != 0 && (textFlags & 2) != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 3));
                } else if (i11 != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 1));
                } else if ((textFlags & 2) != 0) {
                    textPaint2.setTypeface(Typeface.create("serif", 2));
                } else {
                    textPaint2.setTypeface(Typeface.create("serif", 0));
                }
            }
            if ((textFlags & 32) != 0) {
                textPaint2.setFlags(textPaint2.getFlags() | 16);
            }
            if ((textFlags & 16) != 0) {
                textPaint2.setFlags(textPaint2.getFlags() | 8);
            }
            if (!((textFlags & 8) == 0 && (textFlags & 512) == 0)) {
                textPaint2.setFlags(textPaint2.getFlags());
                i = getLinkTextColor();
            }
            if (i9 != 0) {
                textPaint2.baselineShift -= AndroidUtilities.m34dp(6.0f);
            } else if ((textFlags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                textPaint2.baselineShift += AndroidUtilities.m34dp(2.0f);
            }
            textPaint2.setColor(i);
            sparseArray8.put(textFlags, textPaint2);
        }
        textPaint2.setTextSize(dp + dp2);
        return textPaint2;
    }

    public DrawingText createLayoutForText(View view, CharSequence charSequence, TLRPC$RichText tLRPC$RichText, int i, int i2, TLRPC$PageBlock tLRPC$PageBlock, Layout.Alignment alignment, WebpageAdapter webpageAdapter) {
        return createLayoutForText(view, charSequence, tLRPC$RichText, i, 0, tLRPC$PageBlock, alignment, 0, webpageAdapter);
    }

    public DrawingText createLayoutForText(View view, CharSequence charSequence, TLRPC$RichText tLRPC$RichText, int i, int i2, TLRPC$PageBlock tLRPC$PageBlock, WebpageAdapter webpageAdapter) {
        return createLayoutForText(view, charSequence, tLRPC$RichText, i, i2, tLRPC$PageBlock, Layout.Alignment.ALIGN_NORMAL, 0, webpageAdapter);
    }

    public org.telegram.p009ui.ArticleViewer.DrawingText createLayoutForText(android.view.View r23, java.lang.CharSequence r24, org.telegram.tgnet.TLRPC$RichText r25, int r26, int r27, org.telegram.tgnet.TLRPC$PageBlock r28, android.text.Layout.Alignment r29, int r30, org.telegram.p009ui.ArticleViewer.WebpageAdapter r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.createLayoutForText(android.view.View, java.lang.CharSequence, org.telegram.tgnet.TLRPC$RichText, int, int, org.telegram.tgnet.TLRPC$PageBlock, android.text.Layout$Alignment, int, org.telegram.ui.ArticleViewer$WebpageAdapter):org.telegram.ui.ArticleViewer$DrawingText");
    }

    public boolean checkLayoutForLinks(org.telegram.p009ui.ArticleViewer.WebpageAdapter r17, android.view.MotionEvent r18, android.view.View r19, org.telegram.p009ui.ArticleViewer.DrawingText r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.checkLayoutForLinks(org.telegram.ui.ArticleViewer$WebpageAdapter, android.view.MotionEvent, android.view.View, org.telegram.ui.ArticleViewer$DrawingText, int, int):boolean");
    }

    public void removePressedLink() {
        if (this.pressedLink != null || this.pressedLinkOwnerView != null) {
            View view = this.pressedLinkOwnerView;
            this.links.clear();
            this.pressedLink = null;
            this.pressedLinkOwnerLayout = null;
            this.pressedLinkOwnerView = null;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void openWebpageUrl(String str, final String str2) {
        if (this.openUrlReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.openUrlReqId, false);
            this.openUrlReqId = 0;
        }
        final int i = this.lastReqId + 1;
        this.lastReqId = i;
        showProgressView(true, true);
        final TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage = new TLRPC$TL_messages_getWebPage();
        tLRPC$TL_messages_getWebPage.url = str;
        tLRPC$TL_messages_getWebPage.hash = 0;
        this.openUrlReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getWebPage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ArticleViewer.this.lambda$openWebpageUrl$7(i, str2, tLRPC$TL_messages_getWebPage, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$openWebpageUrl$7(final int i, final String str, final TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$openWebpageUrl$6(i, tLObject, str, tLRPC$TL_messages_getWebPage);
            }
        });
    }

    public void lambda$openWebpageUrl$6(int i, TLObject tLObject, String str, TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage) {
        if (this.openUrlReqId != 0 && i == this.lastReqId) {
            this.openUrlReqId = 0;
            showProgressView(true, false);
            if (this.isVisible) {
                if (tLObject instanceof TLRPC$TL_webPage) {
                    TLRPC$TL_webPage tLRPC$TL_webPage = (TLRPC$TL_webPage) tLObject;
                    if (tLRPC$TL_webPage.cached_page instanceof TLRPC$TL_page) {
                        addPageToStack(tLRPC$TL_webPage, str, 1);
                        return;
                    }
                }
                Browser.openUrl(this.parentActivity, tLRPC$TL_messages_getWebPage.url);
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        BlockAudioCell blockAudioCell;
        MessageObject messageObject;
        if (i == NotificationCenter.messagePlayingDidStart) {
            MessageObject messageObject2 = (MessageObject) objArr[0];
            if (this.listView != null) {
                int i3 = 0;
                while (true) {
                    RecyclerListView[] recyclerListViewArr = this.listView;
                    if (i3 < recyclerListViewArr.length) {
                        int childCount = recyclerListViewArr[i3].getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            View childAt = this.listView[i3].getChildAt(i4);
                            if (childAt instanceof BlockAudioCell) {
                                ((BlockAudioCell) childAt).updateButtonState(true);
                            }
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.messagePlayingPlayStateChanged) {
            if (this.listView != null) {
                int i5 = 0;
                while (true) {
                    RecyclerListView[] recyclerListViewArr2 = this.listView;
                    if (i5 < recyclerListViewArr2.length) {
                        int childCount2 = recyclerListViewArr2[i5].getChildCount();
                        for (int i6 = 0; i6 < childCount2; i6++) {
                            View childAt2 = this.listView[i5].getChildAt(i6);
                            if (childAt2 instanceof BlockAudioCell) {
                                BlockAudioCell blockAudioCell2 = (BlockAudioCell) childAt2;
                                if (blockAudioCell2.getMessageObject() != null) {
                                    blockAudioCell2.updateButtonState(true);
                                }
                            }
                        }
                        i5++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i == NotificationCenter.messagePlayingProgressDidChanged) {
            Integer num = (Integer) objArr[0];
            if (this.listView != null) {
                int i7 = 0;
                while (true) {
                    RecyclerListView[] recyclerListViewArr3 = this.listView;
                    if (i7 < recyclerListViewArr3.length) {
                        int childCount3 = recyclerListViewArr3[i7].getChildCount();
                        int i8 = 0;
                        while (true) {
                            if (i8 < childCount3) {
                                View childAt3 = this.listView[i7].getChildAt(i8);
                                if (!(childAt3 instanceof BlockAudioCell) || (messageObject = (blockAudioCell = (BlockAudioCell) childAt3).getMessageObject()) == null || messageObject.getId() != num.intValue()) {
                                    i8++;
                                } else {
                                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                                    if (playingMessageObject != null) {
                                        messageObject.audioProgress = playingMessageObject.audioProgress;
                                        messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                                        messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                                        blockAudioCell.updatePlayingMessageProgress();
                                    }
                                }
                            }
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void updateThemeColors(float f) {
        refreshThemeColors();
        updatePaintColors();
        if (this.windowView != null) {
            this.listView[0].invalidateViews();
            this.listView[1].invalidateViews();
            this.windowView.invalidate();
            this.searchPanel.invalidate();
            if (f == 1.0f) {
                this.adapter[0].notifyDataSetChanged();
                this.adapter[1].notifyDataSetChanged();
            }
        }
    }

    public void updatePaintSize() {
        for (int i = 0; i < 2; i++) {
            this.adapter[i].notifyDataSetChanged();
        }
    }

    private void updatePaintFonts() {
        ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", this.selectedFont).commit();
        int i = this.selectedFont;
        Typeface typeface = i == 0 ? Typeface.DEFAULT : Typeface.SERIF;
        Typeface typeface2 = i == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
        Typeface typeface3 = this.selectedFont == 0 ? AndroidUtilities.getTypeface("fonts/rmedium.ttf") : Typeface.create("serif", 1);
        Typeface typeface4 = this.selectedFont == 0 ? AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf") : Typeface.create("serif", 3);
        for (int i2 = 0; i2 < quoteTextPaints.size(); i2++) {
            updateFontEntry(quoteTextPaints.keyAt(i2), quoteTextPaints.valueAt(i2), typeface, typeface4, typeface3, typeface2);
        }
        for (int i3 = 0; i3 < preformattedTextPaints.size(); i3++) {
            updateFontEntry(preformattedTextPaints.keyAt(i3), preformattedTextPaints.valueAt(i3), typeface, typeface4, typeface3, typeface2);
        }
        for (int i4 = 0; i4 < paragraphTextPaints.size(); i4++) {
            updateFontEntry(paragraphTextPaints.keyAt(i4), paragraphTextPaints.valueAt(i4), typeface, typeface4, typeface3, typeface2);
        }
        for (int i5 = 0; i5 < listTextPaints.size(); i5++) {
            updateFontEntry(listTextPaints.keyAt(i5), listTextPaints.valueAt(i5), typeface, typeface4, typeface3, typeface2);
        }
        for (int i6 = 0; i6 < embedPostTextPaints.size(); i6++) {
            updateFontEntry(embedPostTextPaints.keyAt(i6), embedPostTextPaints.valueAt(i6), typeface, typeface4, typeface3, typeface2);
        }
        for (int i7 = 0; i7 < mediaCaptionTextPaints.size(); i7++) {
            updateFontEntry(mediaCaptionTextPaints.keyAt(i7), mediaCaptionTextPaints.valueAt(i7), typeface, typeface4, typeface3, typeface2);
        }
        for (int i8 = 0; i8 < mediaCreditTextPaints.size(); i8++) {
            updateFontEntry(mediaCreditTextPaints.keyAt(i8), mediaCreditTextPaints.valueAt(i8), typeface, typeface4, typeface3, typeface2);
        }
        for (int i9 = 0; i9 < photoCaptionTextPaints.size(); i9++) {
            updateFontEntry(photoCaptionTextPaints.keyAt(i9), photoCaptionTextPaints.valueAt(i9), typeface, typeface4, typeface3, typeface2);
        }
        for (int i10 = 0; i10 < photoCreditTextPaints.size(); i10++) {
            updateFontEntry(photoCreditTextPaints.keyAt(i10), photoCreditTextPaints.valueAt(i10), typeface, typeface4, typeface3, typeface2);
        }
        for (int i11 = 0; i11 < authorTextPaints.size(); i11++) {
            updateFontEntry(authorTextPaints.keyAt(i11), authorTextPaints.valueAt(i11), typeface, typeface4, typeface3, typeface2);
        }
        for (int i12 = 0; i12 < footerTextPaints.size(); i12++) {
            updateFontEntry(footerTextPaints.keyAt(i12), footerTextPaints.valueAt(i12), typeface, typeface4, typeface3, typeface2);
        }
        for (int i13 = 0; i13 < embedPostCaptionTextPaints.size(); i13++) {
            updateFontEntry(embedPostCaptionTextPaints.keyAt(i13), embedPostCaptionTextPaints.valueAt(i13), typeface, typeface4, typeface3, typeface2);
        }
        for (int i14 = 0; i14 < relatedArticleTextPaints.size(); i14++) {
            updateFontEntry(relatedArticleTextPaints.keyAt(i14), relatedArticleTextPaints.valueAt(i14), typeface, typeface4, typeface3, typeface2);
        }
        for (int i15 = 0; i15 < detailsTextPaints.size(); i15++) {
            updateFontEntry(detailsTextPaints.keyAt(i15), detailsTextPaints.valueAt(i15), typeface, typeface4, typeface3, typeface2);
        }
        for (int i16 = 0; i16 < tableTextPaints.size(); i16++) {
            updateFontEntry(tableTextPaints.keyAt(i16), tableTextPaints.valueAt(i16), typeface, typeface4, typeface3, typeface2);
        }
    }

    private void updateFontEntry(int i, TextPaint textPaint, Typeface typeface, Typeface typeface2, Typeface typeface3, Typeface typeface4) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 2) != 0) {
            textPaint.setTypeface(typeface2);
        } else if (i2 != 0) {
            textPaint.setTypeface(typeface3);
        } else if ((i & 2) != 0) {
            textPaint.setTypeface(typeface4);
        } else if ((i & 4) == 0) {
            textPaint.setTypeface(typeface);
        }
    }

    private void updatePaintColors() {
        this.backgroundPaint.setColor(Theme.getColor("windowBackgroundWhite"));
        int i = 0;
        while (true) {
            RecyclerListView[] recyclerListViewArr = this.listView;
            if (i >= recyclerListViewArr.length) {
                break;
            }
            recyclerListViewArr[i].setGlowColor(Theme.getColor("windowBackgroundWhite"));
            i++;
        }
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
            if ((keyAt & 8) == 0 && (keyAt & 512) == 0) {
                valueAt.setColor(getTextColor());
            } else {
                valueAt.setColor(getLinkTextColor());
            }
        }
    }

    public void setParentActivity(Activity activity, BaseFragment baseFragment) {
        this.parentFragment = baseFragment;
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
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
        this.layerShadowDrawable = activity.getResources().getDrawable(C0952R.C0953drawable.layer_shadow);
        this.slideDotDrawable = activity.getResources().getDrawable(C0952R.C0953drawable.slide_dot_small);
        this.slideDotBigDrawable = activity.getResources().getDrawable(C0952R.C0953drawable.slide_dot_big);
        this.scrimPaint = new Paint();
        WindowView windowView = new WindowView(activity);
        this.windowView = windowView;
        windowView.setWillNotDraw(false);
        this.windowView.setClipChildren(true);
        this.windowView.setFocusable(false);
        FrameLayout frameLayout = new FrameLayout(activity) {
            @Override
            protected boolean drawChild(android.graphics.Canvas r11, android.view.View r12, long r13) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.C11577.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
            }
        };
        this.containerView = frameLayout;
        this.windowView.addView(frameLayout, LayoutHelper.createFrame(-1, -1, 51));
        if (Build.VERSION.SDK_INT >= 21) {
            this.windowView.setFitsSystemWindows(true);
            this.containerView.setOnApplyWindowInsetsListener(ArticleViewer$$ExternalSyntheticLambda4.INSTANCE);
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.fullscreenVideoContainer = frameLayout2;
        frameLayout2.setBackgroundColor(-16777216);
        this.fullscreenVideoContainer.setVisibility(4);
        this.windowView.addView(this.fullscreenVideoContainer, LayoutHelper.createFrame(-1, -1.0f));
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(activity);
        this.fullscreenAspectRatioView = aspectRatioFrameLayout;
        aspectRatioFrameLayout.setVisibility(8);
        this.fullscreenVideoContainer.addView(this.fullscreenAspectRatioView, LayoutHelper.createFrame(-1, -1, 17));
        this.fullscreenTextureView = new TextureView(activity);
        this.listView = new RecyclerListView[2];
        this.adapter = new WebpageAdapter[2];
        this.layoutManager = new LinearLayoutManager[2];
        int i2 = 0;
        while (i2 < this.listView.length) {
            WebpageAdapter[] webpageAdapterArr = this.adapter;
            final WebpageAdapter webpageAdapter = new WebpageAdapter(this.parentActivity);
            webpageAdapterArr[i2] = webpageAdapter;
            this.listView[i2] = new RecyclerListView(activity) {
                @Override
                public void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                    super.onLayout(z, i3, i4, i5, i6);
                    int childCount = getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = getChildAt(i7);
                        if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 90 && childAt.getBottom() < getMeasuredHeight()) {
                            int measuredHeight = getMeasuredHeight();
                            childAt.layout(0, measuredHeight - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), measuredHeight);
                            return;
                        }
                    }
                }

                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (ArticleViewer.this.pressedLinkOwnerLayout != null && ArticleViewer.this.pressedLink == null && ((ArticleViewer.this.popupWindow == null || !ArticleViewer.this.popupWindow.isShowing()) && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                        ArticleViewer.this.pressedLink = null;
                        ArticleViewer.this.pressedLinkOwnerLayout = null;
                        ArticleViewer.this.pressedLinkOwnerView = null;
                    } else if (!(ArticleViewer.this.pressedLinkOwnerLayout == null || ArticleViewer.this.pressedLink == null || motionEvent.getAction() != 1)) {
                        ArticleViewer articleViewer = ArticleViewer.this;
                        articleViewer.checkLayoutForLinks(webpageAdapter, motionEvent, articleViewer.pressedLinkOwnerView, ArticleViewer.this.pressedLinkOwnerLayout, 0, 0);
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
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    if (ArticleViewer.this.windowView.movingPage) {
                        ArticleViewer.this.containerView.invalidate();
                        float measuredWidth = f / getMeasuredWidth();
                        ArticleViewer articleViewer = ArticleViewer.this;
                        articleViewer.setCurrentHeaderHeight((int) (articleViewer.windowView.startMovingHeaderHeight + ((AndroidUtilities.m34dp(56.0f) - ArticleViewer.this.windowView.startMovingHeaderHeight) * measuredWidth)));
                    }
                }
            };
            ((DefaultItemAnimator) this.listView[i2].getItemAnimator()).setDelayAnimations(false);
            RecyclerListView recyclerListView = this.listView[i2];
            LinearLayoutManager[] linearLayoutManagerArr = this.layoutManager;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.parentActivity, 1, false);
            linearLayoutManagerArr[i2] = linearLayoutManager;
            recyclerListView.setLayoutManager(linearLayoutManager);
            this.listView[i2].setAdapter(webpageAdapter);
            this.listView[i2].setClipToPadding(false);
            this.listView[i2].setVisibility(i2 == 0 ? 0 : 8);
            this.listView[i2].setPadding(0, AndroidUtilities.m34dp(56.0f), 0, 0);
            this.listView[i2].setTopGlowOffset(AndroidUtilities.m34dp(56.0f));
            this.containerView.addView(this.listView[i2], LayoutHelper.createFrame(-1, -1.0f));
            this.listView[i2].setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
                @Override
                public final boolean onItemClick(View view, int i3) {
                    boolean lambda$setParentActivity$9;
                    lambda$setParentActivity$9 = ArticleViewer.this.lambda$setParentActivity$9(view, i3);
                    return lambda$setParentActivity$9;
                }
            });
            this.listView[i2].setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
                @Override
                public boolean hasDoubleTap(View view, int i3) {
                    return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i3);
                }

                @Override
                public void onDoubleTap(View view, int i3, float f, float f2) {
                    RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i3, f, f2);
                }

                @Override
                public final void onItemClick(View view, int i3, float f, float f2) {
                    ArticleViewer.this.lambda$setParentActivity$12(webpageAdapter, view, i3, f, f2);
                }
            });
            this.listView[i2].setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                    if (i3 == 0) {
                        ArticleViewer.this.textSelectionHelper.stopScrolling();
                    }
                }

                @Override
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    if (recyclerView.getChildCount() != 0) {
                        ArticleViewer.this.textSelectionHelper.onParentScrolled();
                        ArticleViewer.this.headerView.invalidate();
                        ArticleViewer.this.checkScroll(i4);
                    }
                }
            });
            i2++;
        }
        this.headerPaint.setColor(-16777216);
        this.statusBarPaint.setColor(-16777216);
        this.headerProgressPaint.setColor(-14408666);
        this.navigationBarPaint.setColor(-16777216);
        FrameLayout frameLayout3 = new FrameLayout(activity) {
            @Override
            protected void onDraw(Canvas canvas) {
                int itemCount;
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                canvas.drawRect(0.0f, 0.0f, measuredWidth, measuredHeight, ArticleViewer.this.headerPaint);
                if (ArticleViewer.this.layoutManager != null) {
                    int findFirstVisibleItemPosition = ArticleViewer.this.layoutManager[0].findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = ArticleViewer.this.layoutManager[0].findLastVisibleItemPosition();
                    int itemCount2 = ArticleViewer.this.layoutManager[0].getItemCount() - 2;
                    View findViewByPosition = findLastVisibleItemPosition >= itemCount2 ? ArticleViewer.this.layoutManager[0].findViewByPosition(itemCount2) : ArticleViewer.this.layoutManager[0].findViewByPosition(findFirstVisibleItemPosition);
                    if (findViewByPosition != null) {
                        float f = measuredWidth / (itemCount - 1);
                        ArticleViewer.this.layoutManager[0].getChildCount();
                        float measuredHeight2 = findViewByPosition.getMeasuredHeight();
                        canvas.drawRect(0.0f, 0.0f, (findFirstVisibleItemPosition * f) + (findLastVisibleItemPosition >= itemCount2 ? (((itemCount2 - findFirstVisibleItemPosition) * f) * (ArticleViewer.this.listView[0].getMeasuredHeight() - findViewByPosition.getTop())) / measuredHeight2 : (1.0f - ((Math.min(0, findViewByPosition.getTop() - ArticleViewer.this.listView[0].getPaddingTop()) + measuredHeight2) / measuredHeight2)) * f), measuredHeight, ArticleViewer.this.headerProgressPaint);
                    }
                }
            }
        };
        this.headerView = frameLayout3;
        frameLayout3.setWillNotDraw(false);
        this.containerView.addView(this.headerView, LayoutHelper.createFrame(-1, 56.0f));
        this.headerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ArticleViewer.this.lambda$setParentActivity$13(view);
            }
        });
        SimpleTextView simpleTextView = new SimpleTextView(activity);
        this.titleTextView = simpleTextView;
        simpleTextView.setGravity(19);
        this.titleTextView.setTextSize(20);
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.titleTextView.setTextColor(-5000269);
        this.titleTextView.setPivotX(0.0f);
        this.titleTextView.setPivotY(AndroidUtilities.m34dp(28.0f));
        this.headerView.addView(this.titleTextView, LayoutHelper.createFrame(-1, 56.0f, 51, 72.0f, 0.0f, 96.0f, 0.0f));
        LineProgressView lineProgressView = new LineProgressView(activity);
        this.lineProgressView = lineProgressView;
        lineProgressView.setProgressColor(-1);
        this.lineProgressView.setPivotX(0.0f);
        this.lineProgressView.setPivotY(AndroidUtilities.m34dp(2.0f));
        this.headerView.addView(this.lineProgressView, LayoutHelper.createFrame(-1, 2.0f, 83, 0.0f, 0.0f, 0.0f, 1.0f));
        this.lineProgressTickRunnable = new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$setParentActivity$14();
            }
        };
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.menuContainer = frameLayout4;
        this.headerView.addView(frameLayout4, LayoutHelper.createFrame(48, 56, 53));
        View view = new View(activity);
        this.searchShadow = view;
        view.setBackgroundResource(C0952R.C0953drawable.header_shadow);
        this.searchShadow.setAlpha(0.0f);
        this.containerView.addView(this.searchShadow, LayoutHelper.createFrame(-1, 3.0f, 51, 0.0f, 56.0f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(this.parentActivity);
        this.searchContainer = frameLayout5;
        frameLayout5.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        this.searchContainer.setVisibility(4);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 21) {
            this.searchContainer.setAlpha(0.0f);
        }
        this.headerView.addView(this.searchContainer, LayoutHelper.createFrame(-1, 56.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(this, this.parentActivity) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.searchField = editTextBoldCursor;
        editTextBoldCursor.setCursorWidth(1.5f);
        this.searchField.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.searchField.setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.searchField.setTextSize(1, 18.0f);
        this.searchField.setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText"));
        this.searchField.setSingleLine(true);
        this.searchField.setHint(LocaleController.getString("Search", C0952R.string.Search));
        this.searchField.setBackgroundResource(0);
        this.searchField.setPadding(0, 0, 0, 0);
        this.searchField.setInputType(this.searchField.getInputType() | 524288);
        if (i3 < 23) {
            this.searchField.setCustomSelectionActionModeCallback(new ActionMode.Callback(this) {
                @Override
                public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                    return false;
                }

                @Override
                public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }

                @Override
                public void onDestroyActionMode(ActionMode actionMode) {
                }

                @Override
                public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }
            });
        }
        this.searchField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                boolean lambda$setParentActivity$15;
                lambda$setParentActivity$15 = ArticleViewer.this.lambda$setParentActivity$15(textView, i4, keyEvent);
                return lambda$setParentActivity$15;
            }
        });
        this.searchField.addTextChangedListener(new C113913());
        this.searchField.setImeOptions(33554435);
        this.searchField.setTextIsSelectable(false);
        this.searchContainer.addView(this.searchField, LayoutHelper.createFrame(-1, 36.0f, 16, 72.0f, 0.0f, 48.0f, 0.0f));
        ImageView imageView = new ImageView(this.parentActivity) {
            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                clearAnimation();
                if (getTag() == null) {
                    ArticleViewer.this.clearButton.setVisibility(4);
                    ArticleViewer.this.clearButton.setAlpha(0.0f);
                    ArticleViewer.this.clearButton.setRotation(45.0f);
                    ArticleViewer.this.clearButton.setScaleX(0.0f);
                    ArticleViewer.this.clearButton.setScaleY(0.0f);
                    return;
                }
                ArticleViewer.this.clearButton.setAlpha(1.0f);
                ArticleViewer.this.clearButton.setRotation(0.0f);
                ArticleViewer.this.clearButton.setScaleX(1.0f);
                ArticleViewer.this.clearButton.setScaleY(1.0f);
            }
        };
        this.clearButton = imageView;
        imageView.setImageDrawable(new CloseProgressDrawable2(this) {
            @Override
            protected int getCurrentColor() {
                return Theme.getColor("windowBackgroundWhiteBlackText");
            }
        });
        this.clearButton.setScaleType(ImageView.ScaleType.CENTER);
        this.clearButton.setAlpha(0.0f);
        this.clearButton.setRotation(45.0f);
        this.clearButton.setScaleX(0.0f);
        this.clearButton.setScaleY(0.0f);
        this.clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ArticleViewer.this.lambda$setParentActivity$16(view2);
            }
        });
        this.clearButton.setContentDescription(LocaleController.getString("ClearButton", C0952R.string.ClearButton));
        this.searchContainer.addView(this.clearButton, LayoutHelper.createFrame(48, -1, 21));
        ImageView imageView2 = new ImageView(activity);
        this.backButton = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        backDrawable.setAnimationTime(200.0f);
        this.backDrawable.setColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.backDrawable.setRotatedColor(-5000269);
        this.backDrawable.setRotation(1.0f, false);
        this.backButton.setImageDrawable(this.backDrawable);
        this.backButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.headerView.addView(this.backButton, LayoutHelper.createFrame(54, 56.0f));
        this.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ArticleViewer.this.lambda$setParentActivity$17(view2);
            }
        });
        this.backButton.setContentDescription(LocaleController.getString("AccDescrGoBack", C0952R.string.AccDescrGoBack));
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(this.parentActivity, null, 1090519039, -5000269) {
            @Override
            public void toggleSubMenu() {
                super.toggleSubMenu();
                ArticleViewer.this.listView[0].stopScroll();
                ArticleViewer.this.checkScrollAnimated();
            }
        };
        this.menuButton = actionBarMenuItem;
        actionBarMenuItem.setLayoutInScreen(true);
        this.menuButton.setDuplicateParentStateEnabled(false);
        this.menuButton.setClickable(true);
        this.menuButton.setIcon(C0952R.C0953drawable.ic_ab_other);
        this.menuButton.addSubItem(1, C0952R.C0953drawable.msg_search, LocaleController.getString("Search", C0952R.string.Search));
        this.menuButton.addSubItem(2, C0952R.C0953drawable.msg_share, LocaleController.getString("ShareFile", C0952R.string.ShareFile));
        this.menuButton.addSubItem(3, C0952R.C0953drawable.msg_openin, LocaleController.getString("OpenInExternalApp", C0952R.string.OpenInExternalApp));
        this.menuButton.addSubItem(4, C0952R.C0953drawable.menu_settings, LocaleController.getString("Settings", C0952R.string.Settings));
        this.menuButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.menuButton.setContentDescription(LocaleController.getString("AccDescrMoreOptions", C0952R.string.AccDescrMoreOptions));
        this.menuContainer.addView(this.menuButton, LayoutHelper.createFrame(48, 56.0f));
        ContextProgressView contextProgressView = new ContextProgressView(activity, 2);
        this.progressView = contextProgressView;
        contextProgressView.setVisibility(8);
        this.menuContainer.addView(this.progressView, LayoutHelper.createFrame(48, 56.0f));
        this.menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ArticleViewer.this.lambda$setParentActivity$18(view2);
            }
        });
        this.menuButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
            @Override
            public final void onItemClick(int i4) {
                ArticleViewer.this.lambda$setParentActivity$20(i4);
            }
        });
        FrameLayout frameLayout6 = new FrameLayout(this, this.parentActivity) {
            @Override
            public void onDraw(Canvas canvas) {
                int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                Theme.chat_composeShadowDrawable.draw(canvas);
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), Theme.chat_composeBackgroundPaint);
            }
        };
        this.searchPanel = frameLayout6;
        frameLayout6.setOnTouchListener(ArticleViewer$$ExternalSyntheticLambda14.INSTANCE);
        this.searchPanel.setWillNotDraw(false);
        this.searchPanel.setVisibility(4);
        this.searchPanel.setFocusable(true);
        this.searchPanel.setFocusableInTouchMode(true);
        this.searchPanel.setClickable(true);
        this.searchPanel.setPadding(0, AndroidUtilities.m34dp(3.0f), 0, 0);
        this.containerView.addView(this.searchPanel, LayoutHelper.createFrame(-1, 51, 80));
        ImageView imageView3 = new ImageView(this.parentActivity);
        this.searchUpButton = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        this.searchUpButton.setImageResource(C0952R.C0953drawable.msg_go_up);
        this.searchUpButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteBlackText"), PorterDuff.Mode.MULTIPLY));
        this.searchUpButton.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor("actionBarActionModeDefaultSelector"), 1));
        this.searchPanel.addView(this.searchUpButton, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.searchUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ArticleViewer.this.lambda$setParentActivity$22(view2);
            }
        });
        this.searchUpButton.setContentDescription(LocaleController.getString("AccDescrSearchNext", C0952R.string.AccDescrSearchNext));
        ImageView imageView4 = new ImageView(this.parentActivity);
        this.searchDownButton = imageView4;
        imageView4.setScaleType(ImageView.ScaleType.CENTER);
        this.searchDownButton.setImageResource(C0952R.C0953drawable.msg_go_down);
        this.searchDownButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteBlackText"), PorterDuff.Mode.MULTIPLY));
        this.searchDownButton.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor("actionBarActionModeDefaultSelector"), 1));
        this.searchPanel.addView(this.searchDownButton, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.searchDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ArticleViewer.this.lambda$setParentActivity$23(view2);
            }
        });
        this.searchDownButton.setContentDescription(LocaleController.getString("AccDescrSearchPrev", C0952R.string.AccDescrSearchPrev));
        SimpleTextView simpleTextView2 = new SimpleTextView(this.parentActivity);
        this.searchCountText = simpleTextView2;
        simpleTextView2.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.searchCountText.setTextSize(15);
        this.searchCountText.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.searchCountText.setGravity(3);
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
        int i4 = 1792;
        int color = Theme.getColor("windowBackgroundGray", null, true);
        boolean z = AndroidUtilities.computePerceivedBrightness(color) >= 0.721f;
        if (z && i3 >= 26) {
            i4 = 1808;
            this.navigationBarPaint.setColor(color);
        } else if (!z) {
            this.navigationBarPaint.setColor(color);
        }
        WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
        layoutParams2.systemUiVisibility = i4;
        if (i3 >= 21) {
            layoutParams2.flags |= -2147417856;
            if (i3 >= 28) {
                layoutParams2.layoutInDisplayCutoutMode = 1;
            }
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper();
        this.textSelectionHelper = articleTextSelectionHelper;
        articleTextSelectionHelper.setParentView(this.listView[0]);
        if (MessagesController.getGlobalMainSettings().getBoolean("translate_button", false)) {
            this.textSelectionHelper.setOnTranslate(new TextSelectionHelper.OnTranslateListener() {
                @Override
                public final void run(CharSequence charSequence, String str, String str2, Runnable runnable) {
                    ArticleViewer.this.lambda$setParentActivity$24(charSequence, str, str2, runnable);
                }
            });
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper2 = this.textSelectionHelper;
        articleTextSelectionHelper2.layoutManager = this.layoutManager[0];
        articleTextSelectionHelper2.setCallback(new TextSelectionHelper.Callback() {
            @Override
            public void onStateChanged(boolean z2) {
                if (z2) {
                    ArticleViewer.this.showSearch(false);
                }
            }

            @Override
            public void onTextCopied() {
                if (Build.VERSION.SDK_INT < 31) {
                    BulletinFactory.m14of(ArticleViewer.this.containerView, null).createCopyBulletin(LocaleController.getString("TextCopied", C0952R.string.TextCopied)).show();
                }
            }
        });
        this.containerView.addView(this.textSelectionHelper.getOverlayView(activity));
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper(this.containerView, this.windowView);
        this.pinchToZoomHelper = pinchToZoomHelper;
        pinchToZoomHelper.setClipBoundsListener(new PinchToZoomHelper.ClipBoundsListener() {
            @Override
            public void getClipTopBottom(float[] fArr) {
                fArr[0] = ArticleViewer.this.currentHeaderHeight;
                fArr[1] = ArticleViewer.this.listView[0].getMeasuredHeight();
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
                if (ArticleViewer.this.listView[0] != null) {
                    ArticleViewer.this.listView[0].cancelClickRunnables(true);
                }
            }
        });
        updatePaintColors();
    }

    public static WindowInsets lambda$setParentActivity$8(View view, WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public boolean lambda$setParentActivity$9(View view, int i) {
        if (!(view instanceof BlockRelatedArticlesCell)) {
            return false;
        }
        BlockRelatedArticlesCell blockRelatedArticlesCell = (BlockRelatedArticlesCell) view;
        showCopyPopup(blockRelatedArticlesCell.currentBlock.parent.articles.get(blockRelatedArticlesCell.currentBlock.num).url);
        return true;
    }

    public void lambda$setParentActivity$12(WebpageAdapter webpageAdapter, View view, int i, float f, float f2) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = this.textSelectionHelper;
        if (articleTextSelectionHelper != null) {
            if (articleTextSelectionHelper.isSelectionMode()) {
                this.textSelectionHelper.clear();
                return;
            }
            this.textSelectionHelper.clear();
        }
        if ((view instanceof ReportCell) && webpageAdapter.currentPage != null) {
            ReportCell reportCell = (ReportCell) view;
            if (this.previewsReqId != 0) {
                return;
            }
            if (!reportCell.hasViews || f >= view.getMeasuredWidth() / 2) {
                TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat("previews");
                if (userOrChat instanceof TLRPC$TL_user) {
                    openPreviewsChat((TLRPC$User) userOrChat, webpageAdapter.currentPage.f994id);
                    return;
                }
                final int i2 = UserConfig.selectedAccount;
                final long j = webpageAdapter.currentPage.f994id;
                showProgressView(true, true);
                TLRPC$TL_contacts_resolveUsername tLRPC$TL_contacts_resolveUsername = new TLRPC$TL_contacts_resolveUsername();
                tLRPC$TL_contacts_resolveUsername.username = "previews";
                this.previewsReqId = ConnectionsManager.getInstance(i2).sendRequest(tLRPC$TL_contacts_resolveUsername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        ArticleViewer.this.lambda$setParentActivity$11(i2, j, tLObject, tLRPC$TL_error);
                    }
                });
            }
        } else if (i >= 0 && i < webpageAdapter.localBlocks.size()) {
            TLRPC$PageBlock tLRPC$PageBlock = (TLRPC$PageBlock) webpageAdapter.localBlocks.get(i);
            TLRPC$PageBlock lastNonListPageBlock = getLastNonListPageBlock(tLRPC$PageBlock);
            if (lastNonListPageBlock instanceof TL_pageBlockDetailsChild) {
                lastNonListPageBlock = ((TL_pageBlockDetailsChild) lastNonListPageBlock).block;
            }
            if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockChannel) {
                MessagesController.getInstance(this.currentAccount).openByUserName(((TLRPC$TL_pageBlockChannel) lastNonListPageBlock).channel.username, this.parentFragment, 2);
                close(false, true);
            } else if (lastNonListPageBlock instanceof TL_pageBlockRelatedArticlesChild) {
                TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = (TL_pageBlockRelatedArticlesChild) lastNonListPageBlock;
                openWebpageUrl(tL_pageBlockRelatedArticlesChild.parent.articles.get(tL_pageBlockRelatedArticlesChild.num).url, null);
            } else if (lastNonListPageBlock instanceof TLRPC$TL_pageBlockDetails) {
                View lastNonListCell = getLastNonListCell(view);
                if (lastNonListCell instanceof BlockDetailsCell) {
                    this.pressedLinkOwnerLayout = null;
                    this.pressedLinkOwnerView = null;
                    if (webpageAdapter.blocks.indexOf(tLRPC$PageBlock) >= 0) {
                        TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = (TLRPC$TL_pageBlockDetails) lastNonListPageBlock;
                        tLRPC$TL_pageBlockDetails.open = !tLRPC$TL_pageBlockDetails.open;
                        int itemCount = webpageAdapter.getItemCount();
                        webpageAdapter.updateRows();
                        int abs = Math.abs(webpageAdapter.getItemCount() - itemCount);
                        BlockDetailsCell blockDetailsCell = (BlockDetailsCell) lastNonListCell;
                        blockDetailsCell.arrow.setAnimationProgressAnimated(tLRPC$TL_pageBlockDetails.open ? 0.0f : 1.0f);
                        blockDetailsCell.invalidate();
                        if (abs == 0) {
                            return;
                        }
                        if (tLRPC$TL_pageBlockDetails.open) {
                            webpageAdapter.notifyItemRangeInserted(i + 1, abs);
                        } else {
                            webpageAdapter.notifyItemRangeRemoved(i + 1, abs);
                        }
                    }
                }
            }
        }
    }

    public void lambda$setParentActivity$11(final int i, final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$setParentActivity$10(tLObject, i, j);
            }
        });
    }

    public void lambda$setParentActivity$10(TLObject tLObject, int i, long j) {
        if (this.previewsReqId != 0) {
            this.previewsReqId = 0;
            showProgressView(true, false);
            if (tLObject != null) {
                TLRPC$TL_contacts_resolvedPeer tLRPC$TL_contacts_resolvedPeer = (TLRPC$TL_contacts_resolvedPeer) tLObject;
                MessagesController.getInstance(i).putUsers(tLRPC$TL_contacts_resolvedPeer.users, false);
                MessagesStorage.getInstance(i).putUsersAndChats(tLRPC$TL_contacts_resolvedPeer.users, tLRPC$TL_contacts_resolvedPeer.chats, false, true);
                if (!tLRPC$TL_contacts_resolvedPeer.users.isEmpty()) {
                    openPreviewsChat(tLRPC$TL_contacts_resolvedPeer.users.get(0), j);
                }
            }
        }
    }

    public void lambda$setParentActivity$13(View view) {
        this.listView[0].smoothScrollToPosition(0);
    }

    public void lambda$setParentActivity$14() {
        float currentProgress = 0.7f - this.lineProgressView.getCurrentProgress();
        if (currentProgress > 0.0f) {
            float f = currentProgress < 0.25f ? 0.01f : 0.02f;
            LineProgressView lineProgressView = this.lineProgressView;
            lineProgressView.setProgress(lineProgressView.getCurrentProgress() + f, true);
            AndroidUtilities.runOnUIThread(this.lineProgressTickRunnable, 100L);
        }
    }

    public boolean lambda$setParentActivity$15(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        AndroidUtilities.hideKeyboard(this.searchField);
        return false;
    }

    public class C113913 implements TextWatcher {
        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C113913() {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (ArticleViewer.this.ignoreOnTextChange) {
                ArticleViewer.this.ignoreOnTextChange = false;
                return;
            }
            ArticleViewer.this.processSearch(charSequence.toString().toLowerCase());
            if (ArticleViewer.this.clearButton == null) {
                return;
            }
            if (TextUtils.isEmpty(charSequence)) {
                if (ArticleViewer.this.clearButton.getTag() != null) {
                    ArticleViewer.this.clearButton.setTag(null);
                    ArticleViewer.this.clearButton.clearAnimation();
                    if (ArticleViewer.this.animateClear) {
                        ArticleViewer.this.clearButton.animate().setInterpolator(new DecelerateInterpolator()).alpha(0.0f).setDuration(180L).scaleY(0.0f).scaleX(0.0f).rotation(45.0f).withEndAction(new Runnable() {
                            @Override
                            public final void run() {
                                ArticleViewer.C113913.this.lambda$onTextChanged$0();
                            }
                        }).start();
                        return;
                    }
                    ArticleViewer.this.clearButton.setAlpha(0.0f);
                    ArticleViewer.this.clearButton.setRotation(45.0f);
                    ArticleViewer.this.clearButton.setScaleX(0.0f);
                    ArticleViewer.this.clearButton.setScaleY(0.0f);
                    ArticleViewer.this.clearButton.setVisibility(4);
                    ArticleViewer.this.animateClear = true;
                }
            } else if (ArticleViewer.this.clearButton.getTag() == null) {
                ArticleViewer.this.clearButton.setTag(1);
                ArticleViewer.this.clearButton.clearAnimation();
                ArticleViewer.this.clearButton.setVisibility(0);
                if (ArticleViewer.this.animateClear) {
                    ArticleViewer.this.clearButton.animate().setInterpolator(new DecelerateInterpolator()).alpha(1.0f).setDuration(180L).scaleY(1.0f).scaleX(1.0f).rotation(0.0f).start();
                    return;
                }
                ArticleViewer.this.clearButton.setAlpha(1.0f);
                ArticleViewer.this.clearButton.setRotation(0.0f);
                ArticleViewer.this.clearButton.setScaleX(1.0f);
                ArticleViewer.this.clearButton.setScaleY(1.0f);
                ArticleViewer.this.animateClear = true;
            }
        }

        public void lambda$onTextChanged$0() {
            ArticleViewer.this.clearButton.setVisibility(4);
        }
    }

    public void lambda$setParentActivity$16(View view) {
        if (this.searchField.length() != 0) {
            this.searchField.setText("");
        }
        this.searchField.requestFocus();
        AndroidUtilities.showKeyboard(this.searchField);
    }

    public void lambda$setParentActivity$17(View view) {
        if (this.searchContainer.getTag() != null) {
            showSearch(false);
        } else {
            close(true, true);
        }
    }

    public void lambda$setParentActivity$18(View view) {
        this.menuButton.toggleSubMenu();
    }

    public void lambda$setParentActivity$20(int i) {
        Activity activity;
        if (this.adapter[0].currentPage != null && (activity = this.parentActivity) != null) {
            if (i == 1) {
                showSearch(true);
            } else if (i == 2) {
                showDialog(new ShareAlert(this.parentActivity, null, this.adapter[0].currentPage.url, false, this.adapter[0].currentPage.url, false));
            } else if (i == 3) {
                Browser.openUrl((Context) this.parentActivity, !TextUtils.isEmpty(this.adapter[0].currentPage.cached_page.url) ? this.adapter[0].currentPage.cached_page.url : this.adapter[0].currentPage.url, true, false);
            } else if (i == 4) {
                BottomSheet.Builder builder = new BottomSheet.Builder(activity);
                builder.setApplyTopPadding(false);
                LinearLayout linearLayout = new LinearLayout(this.parentActivity);
                linearLayout.setPadding(0, 0, 0, AndroidUtilities.m34dp(4.0f));
                linearLayout.setOrientation(1);
                HeaderCell headerCell = new HeaderCell(this.parentActivity);
                headerCell.setText(LocaleController.getString("FontSize", C0952R.string.FontSize));
                linearLayout.addView(headerCell, LayoutHelper.createLinear(-2, -2, 51, 3, 1, 3, 0));
                linearLayout.addView(new TextSizeCell(this.parentActivity), LayoutHelper.createLinear(-1, -2, 51, 3, 0, 3, 0));
                HeaderCell headerCell2 = new HeaderCell(this.parentActivity);
                headerCell2.setText(LocaleController.getString("FontType", C0952R.string.FontType));
                linearLayout.addView(headerCell2, LayoutHelper.createLinear(-2, -2, 51, 3, 4, 3, 2));
                int i2 = 0;
                while (i2 < 2) {
                    this.fontCells[i2] = new FontCell(this.parentActivity);
                    if (i2 == 0) {
                        this.fontCells[i2].setTextAndTypeface(LocaleController.getString("Default", C0952R.string.Default), Typeface.DEFAULT);
                    } else if (i2 == 1) {
                        this.fontCells[i2].setTextAndTypeface("Serif", Typeface.SERIF);
                    }
                    this.fontCells[i2].select(i2 == this.selectedFont, false);
                    this.fontCells[i2].setTag(Integer.valueOf(i2));
                    this.fontCells[i2].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ArticleViewer.this.lambda$setParentActivity$19(view);
                        }
                    });
                    linearLayout.addView(this.fontCells[i2], LayoutHelper.createLinear(-1, 50));
                    i2++;
                }
                builder.setCustomView(linearLayout);
                BottomSheet create = builder.create();
                this.linkSheet = create;
                showDialog(create);
            }
        }
    }

    public void lambda$setParentActivity$19(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        this.selectedFont = intValue;
        int i = 0;
        while (i < 2) {
            this.fontCells[i].select(i == intValue, true);
            i++;
        }
        updatePaintFonts();
        for (int i2 = 0; i2 < this.listView.length; i2++) {
            this.adapter[i2].notifyDataSetChanged();
        }
    }

    public void lambda$setParentActivity$22(View view) {
        scrollToSearchIndex(this.currentSearchIndex - 1);
    }

    public void lambda$setParentActivity$23(View view) {
        scrollToSearchIndex(this.currentSearchIndex + 1);
    }

    public void lambda$setParentActivity$24(CharSequence charSequence, String str, String str2, Runnable runnable) {
        TranslateAlert.showAlert(this.parentActivity, this.parentFragment, str, str2, charSequence, false, null, runnable);
    }

    public void showSearch(final boolean z) {
        FrameLayout frameLayout = this.searchContainer;
        if (frameLayout != null) {
            if ((frameLayout.getTag() != null) != z) {
                this.searchContainer.setTag(z ? 1 : null);
                this.searchResults.clear();
                this.searchText = null;
                this.adapter[0].searchTextOffset.clear();
                this.currentSearchIndex = 0;
                float f = 1.0f;
                if (this.attachedToWindow) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    if (z) {
                        this.searchContainer.setVisibility(0);
                        this.backDrawable.setRotation(0.0f, true);
                    } else {
                        this.menuButton.setVisibility(0);
                        this.listView[0].invalidateViews();
                        AndroidUtilities.hideKeyboard(this.searchField);
                        updateWindowLayoutParamsForSearch();
                    }
                    ArrayList arrayList = new ArrayList();
                    if (Build.VERSION.SDK_INT >= 21) {
                        if (z) {
                            this.searchContainer.setAlpha(1.0f);
                        }
                        int left = this.menuContainer.getLeft() + (this.menuContainer.getMeasuredWidth() / 2);
                        int top = this.menuContainer.getTop() + (this.menuContainer.getMeasuredHeight() / 2);
                        float sqrt = (float) Math.sqrt((left * left) + (top * top));
                        FrameLayout frameLayout2 = this.searchContainer;
                        float f2 = z ? 0.0f : sqrt;
                        if (!z) {
                            sqrt = 0.0f;
                        }
                        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(frameLayout2, left, top, f2, sqrt);
                        arrayList.add(createCircularReveal);
                        createCircularReveal.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (!z) {
                                    ArticleViewer.this.searchContainer.setAlpha(0.0f);
                                }
                            }
                        });
                    } else {
                        FrameLayout frameLayout3 = this.searchContainer;
                        Property property = View.ALPHA;
                        float[] fArr = new float[1];
                        fArr[0] = z ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property, fArr));
                    }
                    if (!z) {
                        arrayList.add(ObjectAnimator.ofFloat(this.searchPanel, View.ALPHA, 0.0f));
                    }
                    View view = this.searchShadow;
                    Property property2 = View.ALPHA;
                    float[] fArr2 = new float[1];
                    if (!z) {
                        f = 0.0f;
                    }
                    fArr2[0] = f;
                    arrayList.add(ObjectAnimator.ofFloat(view, property2, fArr2));
                    animatorSet.playTogether(arrayList);
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (z) {
                                ArticleViewer.this.updateWindowLayoutParamsForSearch();
                                ArticleViewer.this.searchField.requestFocus();
                                AndroidUtilities.showKeyboard(ArticleViewer.this.searchField);
                                ArticleViewer.this.menuButton.setVisibility(4);
                                return;
                            }
                            ArticleViewer.this.searchContainer.setVisibility(4);
                            ArticleViewer.this.searchPanel.setVisibility(4);
                            ArticleViewer.this.searchField.setText("");
                        }

                        @Override
                        public void onAnimationStart(Animator animator) {
                            if (!z) {
                                ArticleViewer.this.backDrawable.setRotation(1.0f, true);
                            }
                        }
                    });
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    if (z || AndroidUtilities.usingHardwareInput || !this.keyboardVisible) {
                        animatorSet.start();
                        return;
                    }
                    this.runAfterKeyboardClose = animatorSet;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ArticleViewer.this.lambda$showSearch$25();
                        }
                    }, 300L);
                    return;
                }
                this.searchContainer.setAlpha(z ? 1.0f : 0.0f);
                this.menuButton.setVisibility(z ? 4 : 0);
                this.backDrawable.setRotation(z ? 0.0f : 1.0f, false);
                View view2 = this.searchShadow;
                if (!z) {
                    f = 0.0f;
                }
                view2.setAlpha(f);
                if (z) {
                    this.searchContainer.setVisibility(0);
                } else {
                    this.searchContainer.setVisibility(4);
                    this.searchPanel.setVisibility(4);
                    this.searchField.setText("");
                }
                updateWindowLayoutParamsForSearch();
            }
        }
    }

    public void lambda$showSearch$25() {
        AnimatorSet animatorSet = this.runAfterKeyboardClose;
        if (animatorSet != null) {
            animatorSet.start();
            this.runAfterKeyboardClose = null;
        }
    }

    private void updateSearchButtons() {
        ArrayList<SearchResult> arrayList = this.searchResults;
        if (arrayList != null) {
            this.searchUpButton.setEnabled(!arrayList.isEmpty() && this.currentSearchIndex != 0);
            this.searchDownButton.setEnabled(!this.searchResults.isEmpty() && this.currentSearchIndex != this.searchResults.size() - 1);
            ImageView imageView = this.searchUpButton;
            float f = 1.0f;
            imageView.setAlpha(imageView.isEnabled() ? 1.0f : 0.5f);
            ImageView imageView2 = this.searchDownButton;
            if (!imageView2.isEnabled()) {
                f = 0.5f;
            }
            imageView2.setAlpha(f);
            int size = this.searchResults.size();
            if (size < 0) {
                this.searchCountText.setText("");
            } else if (size == 0) {
                this.searchCountText.setText(LocaleController.getString("NoResult", C0952R.string.NoResult));
            } else if (size == 1) {
                this.searchCountText.setText(LocaleController.getString("OneResult", C0952R.string.OneResult));
            } else {
                this.searchCountText.setText(String.format(LocaleController.getPluralString("CountOfResults", size), Integer.valueOf(this.currentSearchIndex + 1), Integer.valueOf(size)));
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
            this.adapter[0].searchTextOffset.clear();
            this.searchPanel.setVisibility(4);
            this.listView[0].invalidateViews();
            scrollToSearchIndex(0);
            this.lastSearchIndex = -1;
            return;
        }
        final int i = this.lastSearchIndex + 1;
        this.lastSearchIndex = i;
        Runnable articleViewer$$ExternalSyntheticLambda27 = new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$processSearch$28(str, i);
            }
        };
        this.searchRunnable = articleViewer$$ExternalSyntheticLambda27;
        AndroidUtilities.runOnUIThread(articleViewer$$ExternalSyntheticLambda27, 400L);
    }

    public void lambda$processSearch$28(final String str, final int i) {
        final HashMap hashMap = new HashMap(this.adapter[0].textToBlocks);
        final ArrayList arrayList = new ArrayList(this.adapter[0].textBlocks);
        this.searchRunnable = null;
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$processSearch$27(arrayList, hashMap, str, i);
            }
        });
    }

    public void lambda$processSearch$27(java.util.ArrayList r19, java.util.HashMap r20, final java.lang.String r21, final int r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.lambda$processSearch$27(java.util.ArrayList, java.util.HashMap, java.lang.String, int):void");
    }

    public void lambda$processSearch$26(int i, ArrayList arrayList, String str) {
        if (i == this.lastSearchIndex) {
            this.searchPanel.setAlpha(1.0f);
            this.searchPanel.setVisibility(0);
            this.searchResults = arrayList;
            this.searchText = str;
            this.adapter[0].searchTextOffset.clear();
            this.listView[0].invalidateViews();
            scrollToSearchIndex(0);
        }
    }

    private void scrollToSearchIndex(int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.scrollToSearchIndex(int):void");
    }

    public void checkScrollAnimated() {
        if (this.currentHeaderHeight != AndroidUtilities.m34dp(56.0f)) {
            ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.currentHeaderHeight), Integer.valueOf(AndroidUtilities.m34dp(56.0f))).setDuration(180L);
            duration.setInterpolator(new DecelerateInterpolator());
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ArticleViewer.this.lambda$checkScrollAnimated$29(valueAnimator);
                }
            });
            duration.start();
        }
    }

    public void lambda$checkScrollAnimated$29(ValueAnimator valueAnimator) {
        setCurrentHeaderHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public void setCurrentHeaderHeight(int i) {
        if (this.searchContainer.getTag() == null) {
            int dp = AndroidUtilities.m34dp(56.0f);
            int max = Math.max(AndroidUtilities.statusBarHeight, AndroidUtilities.m34dp(24.0f));
            if (i < max) {
                i = max;
            } else if (i > dp) {
                i = dp;
            }
            float f = dp - max;
            if (f == 0.0f) {
                f = 1.0f;
            }
            this.currentHeaderHeight = i;
            float f2 = (((i - max) / f) * 0.2f) + 0.8f;
            this.backButton.setScaleX(f2);
            this.backButton.setScaleY(f2);
            this.backButton.setTranslationY((dp - this.currentHeaderHeight) / 2);
            this.menuContainer.setScaleX(f2);
            this.menuContainer.setScaleY(f2);
            this.titleTextView.setScaleX(f2);
            this.titleTextView.setScaleY(f2);
            this.lineProgressView.setScaleY((((i - max) / f) * 0.5f) + 0.5f);
            this.menuContainer.setTranslationY((dp - this.currentHeaderHeight) / 2);
            this.titleTextView.setTranslationY((dp - this.currentHeaderHeight) / 2);
            this.headerView.setTranslationY(this.currentHeaderHeight - dp);
            this.searchShadow.setTranslationY(this.currentHeaderHeight - dp);
            int i2 = 0;
            this.menuButton.setAdditionalYOffset(((-(this.currentHeaderHeight - dp)) / 2) + (Build.VERSION.SDK_INT < 21 ? AndroidUtilities.statusBarHeight : 0));
            this.textSelectionHelper.setTopOffset(this.currentHeaderHeight);
            while (true) {
                RecyclerListView[] recyclerListViewArr = this.listView;
                if (i2 < recyclerListViewArr.length) {
                    recyclerListViewArr[i2].setTopGlowOffset(this.currentHeaderHeight);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void checkScroll(int i) {
        setCurrentHeaderHeight(this.currentHeaderHeight - i);
    }

    private void openPreviewsChat(TLRPC$User tLRPC$User, long j) {
        if (tLRPC$User != null && (this.parentActivity instanceof LaunchActivity)) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", tLRPC$User.f985id);
            bundle.putString("botUser", "webpage" + j);
            ((LaunchActivity) this.parentActivity).presentFragment(new ChatActivity(bundle), false, true);
            close(false, true);
        }
    }

    public boolean open(MessageObject messageObject) {
        return open(messageObject, null, null, true);
    }

    public boolean open(TLRPC$TL_webPage tLRPC$TL_webPage, String str) {
        return open(null, tLRPC$TL_webPage, str, true);
    }

    private boolean open(final org.telegram.messenger.MessageObject r12, org.telegram.tgnet.TLRPC$WebPage r13, java.lang.String r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.open(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$WebPage, java.lang.String, boolean):boolean");
    }

    public void lambda$open$31(final TLRPC$WebPage tLRPC$WebPage, final MessageObject messageObject, final int i, final String str, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$open$30(tLObject, tLRPC$WebPage, messageObject, i, str);
            }
        });
    }

    public void lambda$open$30(TLObject tLObject, TLRPC$WebPage tLRPC$WebPage, MessageObject messageObject, int i, String str) {
        TLRPC$Page tLRPC$Page;
        int i2 = 0;
        if (tLObject instanceof TLRPC$TL_webPage) {
            TLRPC$TL_webPage tLRPC$TL_webPage = (TLRPC$TL_webPage) tLObject;
            if (tLRPC$TL_webPage.cached_page != null) {
                if (!this.pagesStack.isEmpty() && this.pagesStack.get(0) == tLRPC$WebPage) {
                    if (messageObject != null) {
                        messageObject.messageOwner.media.webpage = tLRPC$TL_webPage;
                        TLRPC$TL_messages_messages tLRPC$TL_messages_messages = new TLRPC$TL_messages_messages();
                        tLRPC$TL_messages_messages.messages.add(messageObject.messageOwner);
                        MessagesStorage.getInstance(i).putMessages((TLRPC$messages_Messages) tLRPC$TL_messages_messages, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled);
                    }
                    this.pagesStack.set(0, tLRPC$TL_webPage);
                    if (this.pagesStack.size() == 1) {
                        ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().remove("article" + tLRPC$TL_webPage.f994id).commit();
                        updateInterfaceForCurrentPage(tLRPC$TL_webPage, false, 0);
                        if (str != null) {
                            scrollToAnchor(str);
                        }
                    }
                }
                LongSparseArray<TLRPC$WebPage> longSparseArray = new LongSparseArray<>(1);
                longSparseArray.put(tLRPC$TL_webPage.f994id, tLRPC$TL_webPage);
                MessagesStorage.getInstance(i).putWebPages(longSparseArray);
            }
        } else if (tLObject instanceof TLRPC$TL_webPageNotModified) {
            TLRPC$TL_webPageNotModified tLRPC$TL_webPageNotModified = (TLRPC$TL_webPageNotModified) tLObject;
            if (tLRPC$WebPage != null && (tLRPC$Page = tLRPC$WebPage.cached_page) != null) {
                int i3 = tLRPC$Page.views;
                int i4 = tLRPC$TL_webPageNotModified.cached_page_views;
                if (i3 != i4) {
                    tLRPC$Page.views = i4;
                    tLRPC$Page.flags |= 8;
                    while (true) {
                        WebpageAdapter[] webpageAdapterArr = this.adapter;
                        if (i2 >= webpageAdapterArr.length) {
                            break;
                        }
                        if (webpageAdapterArr[i2].currentPage == tLRPC$WebPage) {
                            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView[i2].findViewHolderForAdapterPosition(this.adapter[i2].getItemCount() - 1);
                            if (findViewHolderForAdapterPosition != null) {
                                this.adapter[i2].onViewAttachedToWindow(findViewHolderForAdapterPosition);
                            }
                        }
                        i2++;
                    }
                    if (messageObject != null) {
                        TLRPC$TL_messages_messages tLRPC$TL_messages_messages2 = new TLRPC$TL_messages_messages();
                        tLRPC$TL_messages_messages2.messages.add(messageObject.messageOwner);
                        MessagesStorage.getInstance(i).putMessages((TLRPC$messages_Messages) tLRPC$TL_messages_messages2, messageObject.getDialogId(), -2, 0, false, messageObject.scheduled);
                    }
                }
            }
        }
    }

    public void lambda$open$32() {
        FrameLayout frameLayout = this.containerView;
        if (frameLayout != null && this.windowView != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                frameLayout.setLayerType(0, null);
            }
            this.animationInProgress = 0;
            AndroidUtilities.hideKeyboard(this.parentActivity.getCurrentFocus());
        }
    }

    public class C115023 extends AnimatorListenerAdapter {
        C115023() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.C115023.this.lambda$onAnimationEnd$0();
                }
            });
        }

        public void lambda$onAnimationEnd$0() {
            NotificationCenter.getInstance(ArticleViewer.this.currentAccount).onAnimationFinish(ArticleViewer.this.allowAnimationIndex);
            if (ArticleViewer.this.animationEndRunnable != null) {
                ArticleViewer.this.animationEndRunnable.run();
                ArticleViewer.this.animationEndRunnable = null;
            }
        }
    }

    public void lambda$open$33(AnimatorSet animatorSet) {
        this.allowAnimationIndex = NotificationCenter.getInstance(this.currentAccount).setAnimationInProgress(this.allowAnimationIndex, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        animatorSet.start();
    }

    private void showProgressView(boolean z, final boolean z2) {
        if (z) {
            AndroidUtilities.cancelRunOnUIThread(this.lineProgressTickRunnable);
            if (z2) {
                this.lineProgressView.setProgress(0.0f, false);
                this.lineProgressView.setProgress(0.3f, true);
                AndroidUtilities.runOnUIThread(this.lineProgressTickRunnable, 100L);
                return;
            }
            this.lineProgressView.setProgress(1.0f, true);
            return;
        }
        AnimatorSet animatorSet = this.progressViewAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.progressViewAnimation = new AnimatorSet();
        if (z2) {
            this.progressView.setVisibility(0);
            this.menuContainer.setEnabled(false);
            this.progressViewAnimation.playTogether(ObjectAnimator.ofFloat(this.menuButton, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.menuButton, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.menuButton, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.progressView, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.progressView, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.progressView, View.ALPHA, 1.0f));
        } else {
            this.menuButton.setVisibility(0);
            this.menuContainer.setEnabled(true);
            this.progressViewAnimation.playTogether(ObjectAnimator.ofFloat(this.progressView, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.progressView, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.progressView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.menuButton, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.menuButton, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.menuButton, View.ALPHA, 1.0f));
        }
        this.progressViewAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ArticleViewer.this.progressViewAnimation != null && ArticleViewer.this.progressViewAnimation.equals(animator)) {
                    if (!z2) {
                        ArticleViewer.this.progressView.setVisibility(4);
                    } else {
                        ArticleViewer.this.menuButton.setVisibility(4);
                    }
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (ArticleViewer.this.progressViewAnimation != null && ArticleViewer.this.progressViewAnimation.equals(animator)) {
                    ArticleViewer.this.progressViewAnimation = null;
                }
            }
        });
        this.progressViewAnimation.setDuration(150L);
        this.progressViewAnimation.start();
    }

    public void saveCurrentPagePosition() {
        int findFirstVisibleItemPosition;
        boolean z = false;
        if (this.adapter[0].currentPage != null && (findFirstVisibleItemPosition = this.layoutManager[0].findFirstVisibleItemPosition()) != -1) {
            View findViewByPosition = this.layoutManager[0].findViewByPosition(findFirstVisibleItemPosition);
            int top = findViewByPosition != null ? findViewByPosition.getTop() : 0;
            String str = "article" + this.adapter[0].currentPage.f994id;
            SharedPreferences.Editor putInt = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt(str, findFirstVisibleItemPosition).putInt(str + "o", top);
            String str2 = str + "r";
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                z = true;
            }
            putInt.putBoolean(str2, z).commit();
        }
    }

    private void refreshThemeColors() {
        TextView textView = this.deleteView;
        if (textView != null) {
            textView.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor("listSelectorSDK21"), 2));
            this.deleteView.setTextColor(Theme.getColor("actionBarDefaultSubmenuItem"));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout != null) {
            actionBarPopupWindowLayout.setBackgroundColor(Theme.getColor("actionBarDefaultSubmenuBackground"));
        }
        FrameLayout frameLayout = this.searchContainer;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        }
        EditTextBoldCursor editTextBoldCursor = this.searchField;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.searchField.setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.searchField.setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText"));
        }
        ImageView imageView = this.searchUpButton;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteBlackText"), PorterDuff.Mode.MULTIPLY));
            this.searchUpButton.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor("actionBarActionModeDefaultSelector"), 1));
        }
        ImageView imageView2 = this.searchDownButton;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteBlackText"), PorterDuff.Mode.MULTIPLY));
            this.searchDownButton.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor("actionBarActionModeDefaultSelector"), 1));
        }
        SimpleTextView simpleTextView = this.searchCountText;
        if (simpleTextView != null) {
            simpleTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        }
        ActionBarMenuItem actionBarMenuItem = this.menuButton;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.redrawPopup(Theme.getColor("actionBarDefaultSubmenuBackground"));
            this.menuButton.setPopupItemsColor(Theme.getColor("actionBarDefaultSubmenuItem"), false);
            this.menuButton.setPopupItemsColor(Theme.getColor("actionBarDefaultSubmenuItemIcon"), true);
        }
        ImageView imageView3 = this.clearButton;
        if (imageView3 != null) {
            imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteBlackText"), PorterDuff.Mode.MULTIPLY));
        }
        BackDrawable backDrawable = this.backDrawable;
        if (backDrawable != null) {
            backDrawable.setColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        }
    }

    public void close(boolean z, boolean z2) {
        if (this.parentActivity != null && !this.closeAnimationInProgress && this.isVisible && !checkAnimation()) {
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
            if (this.textSelectionHelper.isSelectionMode()) {
                this.textSelectionHelper.clear();
            } else if (this.searchContainer.getTag() != null) {
                showSearch(false);
            } else {
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
                if (!z || z2 || !removeLastPageFromStack()) {
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
                        FileLog.m30e(e);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.windowView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.containerView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.windowView, View.TRANSLATION_X, 0.0f, AndroidUtilities.m34dp(56.0f)));
                    this.animationInProgress = 2;
                    this.animationEndRunnable = new Runnable() {
                        @Override
                        public final void run() {
                            ArticleViewer.this.lambda$close$36();
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
                    if (Build.VERSION.SDK_INT >= 18) {
                        this.containerView.setLayerType(2, null);
                    }
                    animatorSet.start();
                }
            }
        }
    }

    public void lambda$close$36() {
        FrameLayout frameLayout = this.containerView;
        if (frameLayout != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                frameLayout.setLayerType(0, null);
            }
            this.animationInProgress = 0;
            onClosed();
        }
    }

    public void onClosed() {
        this.isVisible = false;
        for (int i = 0; i < this.listView.length; i++) {
            this.adapter[i].cleanup();
        }
        try {
            this.parentActivity.getWindow().clearFlags(ConnectionsManager.RequestFlagNeedQuickAck);
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        for (int i2 = 0; i2 < this.createdWebViews.size(); i2++) {
            this.createdWebViews.get(i2).destroyWebView(false);
        }
        this.containerView.post(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$onClosed$37();
            }
        });
    }

    public void lambda$onClosed$37() {
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
            }
        } catch (Exception e) {
            FileLog.m30e(e);
        }
    }

    public void loadChannel(final BlockChannelCell blockChannelCell, final WebpageAdapter webpageAdapter, TLRPC$Chat tLRPC$Chat) {
        if (!this.loadingChannel && !TextUtils.isEmpty(tLRPC$Chat.username)) {
            this.loadingChannel = true;
            TLRPC$TL_contacts_resolveUsername tLRPC$TL_contacts_resolveUsername = new TLRPC$TL_contacts_resolveUsername();
            tLRPC$TL_contacts_resolveUsername.username = tLRPC$Chat.username;
            final int i = UserConfig.selectedAccount;
            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_contacts_resolveUsername, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ArticleViewer.this.lambda$loadChannel$39(webpageAdapter, i, blockChannelCell, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadChannel$39(final WebpageAdapter webpageAdapter, final int i, final BlockChannelCell blockChannelCell, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ArticleViewer.this.lambda$loadChannel$38(webpageAdapter, tLRPC$TL_error, tLObject, i, blockChannelCell);
            }
        });
    }

    public void lambda$loadChannel$38(WebpageAdapter webpageAdapter, TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, int i, BlockChannelCell blockChannelCell) {
        this.loadingChannel = false;
        if (this.parentFragment != null && !webpageAdapter.blocks.isEmpty()) {
            if (tLRPC$TL_error == null) {
                TLRPC$TL_contacts_resolvedPeer tLRPC$TL_contacts_resolvedPeer = (TLRPC$TL_contacts_resolvedPeer) tLObject;
                if (!tLRPC$TL_contacts_resolvedPeer.chats.isEmpty()) {
                    MessagesController.getInstance(i).putUsers(tLRPC$TL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(i).putChats(tLRPC$TL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(i).putUsersAndChats(tLRPC$TL_contacts_resolvedPeer.users, tLRPC$TL_contacts_resolvedPeer.chats, false, true);
                    TLRPC$Chat tLRPC$Chat = tLRPC$TL_contacts_resolvedPeer.chats.get(0);
                    this.loadedChannel = tLRPC$Chat;
                    if (!tLRPC$Chat.left || tLRPC$Chat.kicked) {
                        blockChannelCell.setState(4, false);
                    } else {
                        blockChannelCell.setState(0, false);
                    }
                } else {
                    blockChannelCell.setState(4, false);
                }
            } else {
                blockChannelCell.setState(4, false);
            }
        }
    }

    public void joinChannel(final BlockChannelCell blockChannelCell, final TLRPC$Chat tLRPC$Chat) {
        final TLRPC$TL_channels_joinChannel tLRPC$TL_channels_joinChannel = new TLRPC$TL_channels_joinChannel();
        tLRPC$TL_channels_joinChannel.channel = MessagesController.getInputChannel(tLRPC$Chat);
        final int i = UserConfig.selectedAccount;
        ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_channels_joinChannel, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ArticleViewer.this.lambda$joinChannel$43(blockChannelCell, i, tLRPC$TL_channels_joinChannel, tLRPC$Chat, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$joinChannel$43(final BlockChannelCell blockChannelCell, final int i, final TLRPC$TL_channels_joinChannel tLRPC$TL_channels_joinChannel, final TLRPC$Chat tLRPC$Chat, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        boolean z;
        if (tLRPC$TL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ArticleViewer.this.lambda$joinChannel$40(blockChannelCell, i, tLRPC$TL_error, tLRPC$TL_channels_joinChannel);
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
            MessagesController.getInstance(i).generateJoinMessage(tLRPC$Chat.f854id, true);
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
                ArticleViewer.lambda$joinChannel$42(i, tLRPC$Chat);
            }
        }, 1000L);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
        long j = tLRPC$Chat.f854id;
        messagesStorage.updateDialogsWithDeletedMessages(-j, j, new ArrayList<>(), null, true);
    }

    public void lambda$joinChannel$40(BlockChannelCell blockChannelCell, int i, TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_channels_joinChannel tLRPC$TL_channels_joinChannel) {
        blockChannelCell.setState(0, false);
        AlertsCreator.processError(i, tLRPC$TL_error, this.parentFragment, tLRPC$TL_channels_joinChannel, Boolean.TRUE);
    }

    public static void lambda$joinChannel$42(int i, TLRPC$Chat tLRPC$Chat) {
        MessagesController.getInstance(i).loadFullChat(tLRPC$Chat.f854id, 0, true);
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
        if (!(this.parentActivity == null || (windowView = this.windowView) == null)) {
            try {
                if (windowView.getParent() != null) {
                    ((WindowManager) this.parentActivity.getSystemService("window")).removeViewImmediate(this.windowView);
                }
                this.windowView = null;
            } catch (Exception e) {
                FileLog.m30e(e);
            }
            for (int i = 0; i < this.createdWebViews.size(); i++) {
                this.createdWebViews.get(i).destroyWebView(true);
            }
            this.createdWebViews.clear();
            try {
                this.parentActivity.getWindow().clearFlags(ConnectionsManager.RequestFlagNeedQuickAck);
            } catch (Exception e2) {
                FileLog.m30e(e2);
            }
            this.parentActivity = null;
            this.parentFragment = null;
            Instance = null;
        }
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void showDialog(Dialog dialog) {
        if (this.parentActivity != null) {
            try {
                Dialog dialog2 = this.visibleDialog;
                if (dialog2 != null) {
                    dialog2.dismiss();
                    this.visibleDialog = null;
                }
            } catch (Exception e) {
                FileLog.m30e(e);
            }
            try {
                this.visibleDialog = dialog;
                dialog.setCanceledOnTouchOutside(true);
                this.visibleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        ArticleViewer.this.lambda$showDialog$44(dialogInterface);
                    }
                });
                dialog.show();
            } catch (Exception e2) {
                FileLog.m30e(e2);
            }
        }
    }

    public void lambda$showDialog$44(DialogInterface dialogInterface) {
        this.visibleDialog = null;
    }

    public static final class WebPageUtils {
        public static TLRPC$Photo getPhotoWithId(TLRPC$WebPage tLRPC$WebPage, long j) {
            if (!(tLRPC$WebPage == null || tLRPC$WebPage.cached_page == null)) {
                TLRPC$Photo tLRPC$Photo = tLRPC$WebPage.photo;
                if (tLRPC$Photo != null && tLRPC$Photo.f882id == j) {
                    return tLRPC$Photo;
                }
                for (int i = 0; i < tLRPC$WebPage.cached_page.photos.size(); i++) {
                    TLRPC$Photo tLRPC$Photo2 = tLRPC$WebPage.cached_page.photos.get(i);
                    if (tLRPC$Photo2.f882id == j) {
                        return tLRPC$Photo2;
                    }
                }
            }
            return null;
        }

        public static TLRPC$Document getDocumentWithId(TLRPC$WebPage tLRPC$WebPage, long j) {
            if (!(tLRPC$WebPage == null || tLRPC$WebPage.cached_page == null)) {
                TLRPC$Document tLRPC$Document = tLRPC$WebPage.document;
                if (tLRPC$Document != null && tLRPC$Document.f861id == j) {
                    return tLRPC$Document;
                }
                for (int i = 0; i < tLRPC$WebPage.cached_page.documents.size(); i++) {
                    TLRPC$Document tLRPC$Document2 = tLRPC$WebPage.cached_page.documents.get(i);
                    if (tLRPC$Document2.f861id == j) {
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
            } else if (!(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) || (documentWithId = getDocumentWithId(tLRPC$WebPage, ((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock).video_id)) == null) {
                return null;
            } else {
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(documentWithId, true);
            }
        }
    }

    public class WebpageAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC$TL_pageBlockChannel channelBlock;
        private Context context;
        private TLRPC$WebPage currentPage;
        private boolean isRtl;
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

        public WebpageAdapter(Context context) {
            this.context = context;
        }

        public TLRPC$Photo getPhotoWithId(long j) {
            return WebPageUtils.getPhotoWithId(this.currentPage, j);
        }

        public TLRPC$Document getDocumentWithId(long j) {
            return WebPageUtils.getDocumentWithId(this.currentPage, j);
        }

        private void setRichTextParents(TLRPC$RichText tLRPC$RichText, TLRPC$RichText tLRPC$RichText2) {
            if (tLRPC$RichText2 != null) {
                tLRPC$RichText2.parentRichText = tLRPC$RichText;
                if (tLRPC$RichText2 instanceof TLRPC$TL_textFixed) {
                    setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textFixed) tLRPC$RichText2).text);
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textItalic) {
                    setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textItalic) tLRPC$RichText2).text);
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textBold) {
                    setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textBold) tLRPC$RichText2).text);
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textUnderline) {
                    setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textUnderline) tLRPC$RichText2).text);
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textStrike) {
                    setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textStrike) tLRPC$RichText2).text);
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textEmail) {
                    setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textEmail) tLRPC$RichText2).text);
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textPhone) {
                    setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textPhone) tLRPC$RichText2).text);
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textUrl) {
                    setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textUrl) tLRPC$RichText2).text);
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textConcat) {
                    int size = tLRPC$RichText2.texts.size();
                    for (int i = 0; i < size; i++) {
                        setRichTextParents(tLRPC$RichText2, tLRPC$RichText2.texts.get(i));
                    }
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textSubscript) {
                    setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textSubscript) tLRPC$RichText2).text);
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textSuperscript) {
                    setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textSuperscript) tLRPC$RichText2).text);
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textMarked) {
                    setRichTextParents(tLRPC$RichText2, ((TLRPC$TL_textMarked) tLRPC$RichText2).text);
                } else if (tLRPC$RichText2 instanceof TLRPC$TL_textAnchor) {
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
        }

        private void addTextBlock(Object obj, TLRPC$PageBlock tLRPC$PageBlock) {
            if (!(obj instanceof TLRPC$TL_textEmpty) && !this.textToBlocks.containsKey(obj)) {
                this.textToBlocks.put(obj, tLRPC$PageBlock);
                this.textBlocks.add(obj);
            }
        }

        private void setRichTextParents(TLRPC$PageBlock tLRPC$PageBlock) {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbedPost) {
                TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost = (TLRPC$TL_pageBlockEmbedPost) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockEmbedPost.caption.text);
                setRichTextParents(null, tLRPC$TL_pageBlockEmbedPost.caption.credit);
                addTextBlock(tLRPC$TL_pageBlockEmbedPost.caption.text, tLRPC$TL_pageBlockEmbedPost);
                addTextBlock(tLRPC$TL_pageBlockEmbedPost.caption.credit, tLRPC$TL_pageBlockEmbedPost);
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockParagraph) {
                TLRPC$TL_pageBlockParagraph tLRPC$TL_pageBlockParagraph = (TLRPC$TL_pageBlockParagraph) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockParagraph.text);
                addTextBlock(tLRPC$TL_pageBlockParagraph.text, tLRPC$TL_pageBlockParagraph);
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockKicker) {
                TLRPC$TL_pageBlockKicker tLRPC$TL_pageBlockKicker = (TLRPC$TL_pageBlockKicker) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockKicker.text);
                addTextBlock(tLRPC$TL_pageBlockKicker.text, tLRPC$TL_pageBlockKicker);
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockFooter) {
                TLRPC$TL_pageBlockFooter tLRPC$TL_pageBlockFooter = (TLRPC$TL_pageBlockFooter) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockFooter.text);
                addTextBlock(tLRPC$TL_pageBlockFooter.text, tLRPC$TL_pageBlockFooter);
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockHeader) {
                TLRPC$TL_pageBlockHeader tLRPC$TL_pageBlockHeader = (TLRPC$TL_pageBlockHeader) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockHeader.text);
                addTextBlock(tLRPC$TL_pageBlockHeader.text, tLRPC$TL_pageBlockHeader);
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPreformatted) {
                TLRPC$TL_pageBlockPreformatted tLRPC$TL_pageBlockPreformatted = (TLRPC$TL_pageBlockPreformatted) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockPreformatted.text);
                addTextBlock(tLRPC$TL_pageBlockPreformatted.text, tLRPC$TL_pageBlockPreformatted);
            } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubheader) {
                TLRPC$TL_pageBlockSubheader tLRPC$TL_pageBlockSubheader = (TLRPC$TL_pageBlockSubheader) tLRPC$PageBlock;
                setRichTextParents(null, tLRPC$TL_pageBlockSubheader.text);
                addTextBlock(tLRPC$TL_pageBlockSubheader.text, tLRPC$TL_pageBlockSubheader);
            } else {
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
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                    TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto = (TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockPhoto.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockPhoto.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockPhoto.caption.text, tLRPC$TL_pageBlockPhoto);
                    addTextBlock(tLRPC$TL_pageBlockPhoto.caption.credit, tLRPC$TL_pageBlockPhoto);
                } else if (tLRPC$PageBlock instanceof TL_pageBlockListItem) {
                    TL_pageBlockListItem tL_pageBlockListItem = (TL_pageBlockListItem) tLRPC$PageBlock;
                    if (tL_pageBlockListItem.textItem != null) {
                        setRichTextParents(null, tL_pageBlockListItem.textItem);
                        addTextBlock(tL_pageBlockListItem.textItem, tL_pageBlockListItem);
                    } else if (tL_pageBlockListItem.blockItem != null) {
                        setRichTextParents(tL_pageBlockListItem.blockItem);
                    }
                } else if (tLRPC$PageBlock instanceof TL_pageBlockOrderedListItem) {
                    TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = (TL_pageBlockOrderedListItem) tLRPC$PageBlock;
                    if (tL_pageBlockOrderedListItem.textItem != null) {
                        setRichTextParents(null, tL_pageBlockOrderedListItem.textItem);
                        addTextBlock(tL_pageBlockOrderedListItem.textItem, tL_pageBlockOrderedListItem);
                    } else if (tL_pageBlockOrderedListItem.blockItem != null) {
                        setRichTextParents(tL_pageBlockOrderedListItem.blockItem);
                    }
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
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
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockEmbed) {
                    TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed = (TLRPC$TL_pageBlockEmbed) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockEmbed.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockEmbed.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockEmbed.caption.text, tLRPC$TL_pageBlockEmbed);
                    addTextBlock(tLRPC$TL_pageBlockEmbed.caption.credit, tLRPC$TL_pageBlockEmbed);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockSubtitle) {
                    TLRPC$TL_pageBlockSubtitle tLRPC$TL_pageBlockSubtitle = (TLRPC$TL_pageBlockSubtitle) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockSubtitle.text);
                    addTextBlock(tLRPC$TL_pageBlockSubtitle.text, tLRPC$TL_pageBlockSubtitle);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockBlockquote) {
                    TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote = (TLRPC$TL_pageBlockBlockquote) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockBlockquote.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockBlockquote.caption);
                    addTextBlock(tLRPC$TL_pageBlockBlockquote.text, tLRPC$TL_pageBlockBlockquote);
                    addTextBlock(tLRPC$TL_pageBlockBlockquote.caption, tLRPC$TL_pageBlockBlockquote);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockDetails) {
                    TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = (TLRPC$TL_pageBlockDetails) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockDetails.title);
                    addTextBlock(tLRPC$TL_pageBlockDetails.title, tLRPC$TL_pageBlockDetails);
                    int size3 = tLRPC$TL_pageBlockDetails.blocks.size();
                    while (i < size3) {
                        setRichTextParents(tLRPC$TL_pageBlockDetails.blocks.get(i));
                        i++;
                    }
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) {
                    TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockVideo.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockVideo.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockVideo.caption.text, tLRPC$TL_pageBlockVideo);
                    addTextBlock(tLRPC$TL_pageBlockVideo.caption.credit, tLRPC$TL_pageBlockVideo);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPullquote) {
                    TLRPC$TL_pageBlockPullquote tLRPC$TL_pageBlockPullquote = (TLRPC$TL_pageBlockPullquote) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockPullquote.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockPullquote.caption);
                    addTextBlock(tLRPC$TL_pageBlockPullquote.text, tLRPC$TL_pageBlockPullquote);
                    addTextBlock(tLRPC$TL_pageBlockPullquote.caption, tLRPC$TL_pageBlockPullquote);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAudio) {
                    TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio = (TLRPC$TL_pageBlockAudio) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockAudio.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockAudio.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockAudio.caption.text, tLRPC$TL_pageBlockAudio);
                    addTextBlock(tLRPC$TL_pageBlockAudio.caption.credit, tLRPC$TL_pageBlockAudio);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTable) {
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
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockTitle) {
                    TLRPC$TL_pageBlockTitle tLRPC$TL_pageBlockTitle = (TLRPC$TL_pageBlockTitle) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockTitle.text);
                    addTextBlock(tLRPC$TL_pageBlockTitle.text, tLRPC$TL_pageBlockTitle);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                    setRichTextParents(((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAuthorDate) {
                    TLRPC$TL_pageBlockAuthorDate tLRPC$TL_pageBlockAuthorDate = (TLRPC$TL_pageBlockAuthorDate) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockAuthorDate.author);
                    addTextBlock(tLRPC$TL_pageBlockAuthorDate.author, tLRPC$TL_pageBlockAuthorDate);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockMap) {
                    TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap = (TLRPC$TL_pageBlockMap) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockMap.caption.text);
                    setRichTextParents(null, tLRPC$TL_pageBlockMap.caption.credit);
                    addTextBlock(tLRPC$TL_pageBlockMap.caption.text, tLRPC$TL_pageBlockMap);
                    addTextBlock(tLRPC$TL_pageBlockMap.caption.credit, tLRPC$TL_pageBlockMap);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockRelatedArticles) {
                    TLRPC$TL_pageBlockRelatedArticles tLRPC$TL_pageBlockRelatedArticles = (TLRPC$TL_pageBlockRelatedArticles) tLRPC$PageBlock;
                    setRichTextParents(null, tLRPC$TL_pageBlockRelatedArticles.title);
                    addTextBlock(tLRPC$TL_pageBlockRelatedArticles.title, tLRPC$TL_pageBlockRelatedArticles);
                }
            }
        }

        public void addBlock(org.telegram.p009ui.ArticleViewer.WebpageAdapter r25, org.telegram.tgnet.TLRPC$PageBlock r26, int r27, int r28, int r29) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.WebpageAdapter.addBlock(org.telegram.ui.ArticleViewer$WebpageAdapter, org.telegram.tgnet.TLRPC$PageBlock, int, int, int):void");
        }

        private void addAllMediaFromBlock(WebpageAdapter webpageAdapter, TLRPC$PageBlock tLRPC$PageBlock) {
            if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockPhoto) {
                TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto = (TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock;
                TLRPC$Photo photoWithId = getPhotoWithId(tLRPC$TL_pageBlockPhoto.photo_id);
                if (photoWithId != null) {
                    tLRPC$TL_pageBlockPhoto.thumb = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, 56, true);
                    tLRPC$TL_pageBlockPhoto.thumbObject = photoWithId;
                    this.photoBlocks.add(tLRPC$PageBlock);
                }
            } else if (!(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) || !WebPageUtils.isVideo(webpageAdapter.currentPage, tLRPC$PageBlock)) {
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
                    ArticleViewer.access$13208(ArticleViewer.this);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCollage) {
                    TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage = (TLRPC$TL_pageBlockCollage) tLRPC$PageBlock;
                    int size2 = tLRPC$TL_pageBlockCollage.items.size();
                    while (i < size2) {
                        TLRPC$PageBlock tLRPC$PageBlock3 = tLRPC$TL_pageBlockCollage.items.get(i);
                        tLRPC$PageBlock3.groupId = ArticleViewer.this.lastBlockNum;
                        addAllMediaFromBlock(webpageAdapter, tLRPC$PageBlock3);
                        i++;
                    }
                    ArticleViewer.access$13208(ArticleViewer.this);
                } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover) {
                    addAllMediaFromBlock(webpageAdapter, ((TLRPC$TL_pageBlockCover) tLRPC$PageBlock).cover);
                }
            } else {
                TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo = (TLRPC$TL_pageBlockVideo) tLRPC$PageBlock;
                TLRPC$Document documentWithId = getDocumentWithId(tLRPC$TL_pageBlockVideo.video_id);
                if (documentWithId != null) {
                    tLRPC$TL_pageBlockVideo.thumb = FileLoader.getClosestPhotoSizeWithSize(documentWithId.thumbs, 56, true);
                    tLRPC$TL_pageBlockVideo.thumbObject = documentWithId;
                    this.photoBlocks.add(tLRPC$PageBlock);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            TextView textView;
            View view;
            if (i != 90) {
                switch (i) {
                    case 0:
                        textView = new BlockParagraphCell(this.context, this);
                        break;
                    case 1:
                        textView = new BlockHeaderCell(this.context, this);
                        break;
                    case 2:
                        textView = new BlockDividerCell(this.context);
                        break;
                    case 3:
                        textView = new BlockEmbedCell(this.context, this);
                        break;
                    case 4:
                        textView = new BlockSubtitleCell(this.context, this);
                        break;
                    case 5:
                        view = new BlockVideoCell(this.context, this, 0);
                        textView = view;
                        break;
                    case 6:
                        textView = new BlockPullquoteCell(this.context, this);
                        break;
                    case 7:
                        textView = new BlockBlockquoteCell(this.context, this);
                        break;
                    case 8:
                        textView = new BlockSlideshowCell(this.context, this);
                        break;
                    case 9:
                        view = new BlockPhotoCell(this.context, this, 0);
                        textView = view;
                        break;
                    case 10:
                        textView = new BlockAuthorDateCell(this.context, this);
                        break;
                    case 11:
                        textView = new BlockTitleCell(this.context, this);
                        break;
                    case 12:
                        textView = new BlockListItemCell(this.context, this);
                        break;
                    case 13:
                        textView = new BlockFooterCell(this.context, this);
                        break;
                    case 14:
                        textView = new BlockPreformattedCell(this.context, this);
                        break;
                    case 15:
                        textView = new BlockSubheaderCell(this.context, this);
                        break;
                    case 16:
                        textView = new BlockEmbedPostCell(this.context, this);
                        break;
                    case 17:
                        textView = new BlockCollageCell(this.context, this);
                        break;
                    case C0952R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom:
                        view = new BlockChannelCell(this.context, this, 0);
                        textView = view;
                        break;
                    case C0952R.styleable.MapAttrs_uiTiltGestures:
                        textView = new BlockAudioCell(this.context, this);
                        break;
                    case C0952R.styleable.MapAttrs_uiZoomControls:
                        textView = new BlockKickerCell(this.context, this);
                        break;
                    case C0952R.styleable.MapAttrs_uiZoomGestures:
                        textView = new BlockOrderedListItemCell(this.context, this);
                        break;
                    case C0952R.styleable.MapAttrs_useViewLifecycle:
                        view = new BlockMapCell(this.context, this, 0);
                        textView = view;
                        break;
                    case C0952R.styleable.MapAttrs_zOrderOnTop:
                        textView = new BlockRelatedArticlesCell(this.context, this);
                        break;
                    case 24:
                        textView = new BlockDetailsCell(this.context, this);
                        break;
                    case 25:
                        textView = new BlockTableCell(this.context, this);
                        break;
                    case 26:
                        textView = new BlockRelatedArticlesHeaderCell(this.context, this);
                        break;
                    case 27:
                        textView = new BlockDetailsBottomCell(this.context);
                        break;
                    case 28:
                        textView = new BlockRelatedArticlesShadowCell(this.context);
                        break;
                    default:
                        TextView textView2 = new TextView(this.context);
                        textView2.setBackgroundColor(-65536);
                        textView2.setTextColor(-16777216);
                        textView2.setTextSize(1, 20.0f);
                        textView = textView2;
                        break;
                }
            } else {
                textView = new ReportCell(this.context);
            }
            textView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            textView.setFocusable(true);
            return new RecyclerListView.Holder(textView);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 23 || itemViewType == 24;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < this.localBlocks.size()) {
                bindBlockToHolder(viewHolder.getItemViewType(), viewHolder, this.localBlocks.get(i), i, this.localBlocks.size());
            }
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
                boolean z = false;
                switch (i) {
                    case 0:
                        ((BlockParagraphCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockParagraph) tLRPC$PageBlock2);
                        return;
                    case 1:
                        ((BlockHeaderCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockHeader) tLRPC$PageBlock2);
                        return;
                    case 2:
                        BlockDividerCell blockDividerCell = (BlockDividerCell) viewHolder.itemView;
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
                        boolean z2 = i2 == 0;
                        if (i2 == i3 - 1) {
                            z = true;
                        }
                        blockVideoCell.setBlock(tLRPC$TL_pageBlockVideo, z2, z);
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
                        TLRPC$TL_pageBlockPhoto tLRPC$TL_pageBlockPhoto = (TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock2;
                        boolean z3 = i2 == 0;
                        if (i2 == i3 - 1) {
                            z = true;
                        }
                        blockPhotoCell.setBlock(tLRPC$TL_pageBlockPhoto, z3, z);
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
                    case C0952R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom:
                        ((BlockChannelCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockChannel) tLRPC$PageBlock2);
                        return;
                    case C0952R.styleable.MapAttrs_uiTiltGestures:
                        BlockAudioCell blockAudioCell = (BlockAudioCell) viewHolder.itemView;
                        TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio = (TLRPC$TL_pageBlockAudio) tLRPC$PageBlock2;
                        boolean z4 = i2 == 0;
                        if (i2 == i3 - 1) {
                            z = true;
                        }
                        blockAudioCell.setBlock(tLRPC$TL_pageBlockAudio, z4, z);
                        return;
                    case C0952R.styleable.MapAttrs_uiZoomControls:
                        ((BlockKickerCell) viewHolder.itemView).setBlock((TLRPC$TL_pageBlockKicker) tLRPC$PageBlock2);
                        return;
                    case C0952R.styleable.MapAttrs_uiZoomGestures:
                        ((BlockOrderedListItemCell) viewHolder.itemView).setBlock((TL_pageBlockOrderedListItem) tLRPC$PageBlock2);
                        return;
                    case C0952R.styleable.MapAttrs_useViewLifecycle:
                        BlockMapCell blockMapCell = (BlockMapCell) viewHolder.itemView;
                        TLRPC$TL_pageBlockMap tLRPC$TL_pageBlockMap = (TLRPC$TL_pageBlockMap) tLRPC$PageBlock2;
                        boolean z5 = i2 == 0;
                        if (i2 == i3 - 1) {
                            z = true;
                        }
                        blockMapCell.setBlock(tLRPC$TL_pageBlockMap, z5, z);
                        return;
                    case C0952R.styleable.MapAttrs_zOrderOnTop:
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
                        BlockDetailsBottomCell blockDetailsBottomCell = (BlockDetailsBottomCell) viewHolder.itemView;
                        return;
                    default:
                        return;
                }
            } else {
                ((TextView) viewHolder.itemView).setText("unsupported block " + tLRPC$PageBlock2);
            }
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
            if (i == this.localBlocks.size()) {
                return 90;
            }
            return getTypeForBlock(this.localBlocks.get(i));
        }

        @Override
        public int getItemCount() {
            TLRPC$WebPage tLRPC$WebPage = this.currentPage;
            if (tLRPC$WebPage == null || tLRPC$WebPage.cached_page == null) {
                return 0;
            }
            return this.localBlocks.size() + 1;
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

    public class BlockVideoCell extends FrameLayout implements DownloadController.FileDownloadProgressListener, TextSelectionHelper.ArticleSelectableView {
        private int TAG;
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
            BlockChannelCell blockChannelCell = new BlockChannelCell(context, this.parentAdapter, 1);
            this.channelCell = blockChannelCell;
            addView(blockChannelCell, LayoutHelper.createFrame(-1, -2.0f));
        }

        public void setBlock(TLRPC$TL_pageBlockVideo tLRPC$TL_pageBlockVideo, boolean z, boolean z2) {
            this.currentBlock = tLRPC$TL_pageBlockVideo;
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
            if (tLRPC$TL_pageBlockChannel != null && (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockCover)) {
                this.channelCell.setBlock(tLRPC$TL_pageBlockChannel);
                this.channelCell.setVisibility(0);
            }
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.BlockVideoCell.onTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        @android.annotation.SuppressLint({"NewApi"})
        protected void onMeasure(int r31, int r32) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.BlockVideoCell.onMeasure(int, int):void");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock != null) {
                if (!this.imageView.hasBitmapImage() || this.imageView.getCurrentAlpha() != 1.0f) {
                    canvas.drawRect(this.imageView.getDrawRegion(), ArticleViewer.photoBackgroundPaint);
                }
                if (!ArticleViewer.this.pinchToZoomHelper.isInOverlayModeFor(this)) {
                    this.imageView.draw(canvas);
                    if (this.imageView.getVisible()) {
                        this.radialProgress.draw(canvas);
                    }
                }
                int i2 = 0;
                if (this.captionLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    i = 1;
                    ArticleViewer.this.drawTextSelection(canvas, this, 0);
                    this.captionLayout.draw(canvas, this);
                    canvas.restore();
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
                    float dp = AndroidUtilities.m34dp(18.0f);
                    float dp2 = AndroidUtilities.m34dp(20.0f);
                    int measuredHeight = getMeasuredHeight();
                    if (this.currentBlock.bottom) {
                        i2 = AndroidUtilities.m34dp(6.0f);
                    }
                    canvas.drawRect(dp, 0.0f, dp2, measuredHeight - i2, ArticleViewer.quoteLinePaint);
                }
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
            String attachFileName = FileLoader.getAttachFileName(this.currentDocument);
            boolean z2 = true;
            boolean exists = FileLoader.getInstance(ArticleViewer.this.currentAccount).getPathToAttach(this.currentDocument, true).exists();
            if (TextUtils.isEmpty(attachFileName)) {
                this.radialProgress.setIcon(4, false, false);
                return;
            }
            if (exists) {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).removeLoadingFileObserver(this);
                if (!this.isGif) {
                    this.buttonState = 3;
                } else {
                    this.buttonState = -1;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(ArticleViewer.this.currentAccount).addLoadingFileObserver(attachFileName, null, this);
                float f = 0.0f;
                if (FileLoader.getInstance(ArticleViewer.this.currentAccount).isLoadingFile(attachFileName)) {
                    this.buttonState = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        f = fileProgress.floatValue();
                    }
                } else if (this.cancelLoading || !this.autoDownload || !this.isGif) {
                    this.buttonState = 0;
                    z2 = false;
                } else {
                    this.buttonState = 1;
                }
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
                if (this.isGif) {
                    this.imageView.setImage(ImageLocation.getForDocument(this.currentDocument), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.currentDocument.thumbs, 40), this.currentDocument), "80_80_b", this.currentDocument.size, null, this.parentAdapter.currentPage, 1);
                } else {
                    FileLoader.getInstance(ArticleViewer.this.currentAccount).loadFile(this.currentDocument, this.parentAdapter.currentPage, 1, 1);
                }
                this.buttonState = 1;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                invalidate();
            } else if (i == 1) {
                this.cancelLoading = true;
                if (this.isGif) {
                    this.imageView.cancelLoadImage();
                } else {
                    FileLoader.getInstance(ArticleViewer.this.currentAccount).cancelLoadFile(this.currentDocument);
                }
                this.buttonState = 0;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                invalidate();
            } else if (i == 2) {
                this.imageView.setAllowStartAnimation(true);
                this.imageView.startAnimation();
                this.buttonState = -1;
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else if (i == 3) {
                ArticleViewer.this.openPhoto(this.currentBlock, this.parentAdapter);
            }
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
            if (this.isGif) {
                this.buttonState = 2;
                didPressedButton(true);
                return;
            }
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
            StringBuilder sb = new StringBuilder(LocaleController.getString("AttachVideo", C0952R.string.AttachVideo));
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
        private int textY = AndroidUtilities.m34dp(58.0f);
        private DrawingText titleLayout;

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        public BlockAudioCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            RadialProgress2 radialProgress2 = new RadialProgress2(this);
            this.radialProgress = radialProgress2;
            radialProgress2.setCircleRadius(AndroidUtilities.m34dp(24.0f));
            this.TAG = DownloadController.getInstance(ArticleViewer.this.currentAccount).generateObserverTag();
            SeekBar seekBar = new SeekBar(this);
            this.seekBar = seekBar;
            seekBar.setDelegate(new SeekBar.SeekBarDelegate() {
                @Override
                public void onSeekBarContinuousDrag(float f) {
                    SeekBar.SeekBarDelegate.CC.$default$onSeekBarContinuousDrag(this, f);
                }

                @Override
                public final void onSeekBarDrag(float f) {
                    ArticleViewer.BlockAudioCell.this.lambda$new$0(f);
                }
            });
        }

        public void lambda$new$0(float f) {
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject != null) {
                messageObject.audioProgress = f;
                MediaController.getInstance().seekToProgress(this.currentMessageObject, f);
            }
        }

        public void setBlock(TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio, boolean z, boolean z2) {
            this.currentBlock = tLRPC$TL_pageBlockAudio;
            MessageObject messageObject = (MessageObject) this.parentAdapter.audioBlocks.get(this.currentBlock);
            this.currentMessageObject = messageObject;
            if (messageObject != null) {
                this.currentDocument = messageObject.getDocument();
            }
            this.isFirst = z;
            this.seekBar.setColors(Theme.getColor("chat_inAudioSeekbar"), Theme.getColor("chat_inAudioCacheSeekbar"), Theme.getColor("chat_inAudioSeekbarFill"), Theme.getColor("chat_inAudioSeekbarFill"), Theme.getColor("chat_inAudioSeekbarSelected"));
            updateButtonState(false);
            requestLayout();
        }

        public MessageObject getMessageObject() {
            return this.currentMessageObject;
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.BlockAudioCell.onTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        @SuppressLint({"DrawAllocation", "NewApi"})
        protected void onMeasure(int i, int i2) {
            SpannableStringBuilder spannableStringBuilder;
            int size = View.MeasureSpec.getSize(i);
            int dp = AndroidUtilities.m34dp(54.0f);
            TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio = this.currentBlock;
            int i3 = 1;
            if (tLRPC$TL_pageBlockAudio != null) {
                int i4 = tLRPC$TL_pageBlockAudio.level;
                if (i4 > 0) {
                    this.textX = AndroidUtilities.m34dp(i4 * 14) + AndroidUtilities.m34dp(18.0f);
                } else {
                    this.textX = AndroidUtilities.m34dp(18.0f);
                }
                int dp2 = (size - this.textX) - AndroidUtilities.m34dp(18.0f);
                int dp3 = AndroidUtilities.m34dp(44.0f);
                this.buttonX = AndroidUtilities.m34dp(16.0f);
                int dp4 = AndroidUtilities.m34dp(5.0f);
                this.buttonY = dp4;
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i5 = this.buttonX;
                radialProgress2.setProgressRect(i5, dp4, i5 + dp3, dp4 + dp3);
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio2 = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockAudio2.caption.text, dp2, this.textY, tLRPC$TL_pageBlockAudio2, this.parentAdapter);
                this.captionLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp5 = AndroidUtilities.m34dp(8.0f) + this.captionLayout.getHeight();
                    this.creditOffset = dp5;
                    dp += dp5 + AndroidUtilities.m34dp(8.0f);
                }
                int i6 = dp;
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TLRPC$TL_pageBlockAudio tLRPC$TL_pageBlockAudio3 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockAudio3.caption.credit, dp2, this.textY + this.creditOffset, tLRPC$TL_pageBlockAudio3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i6 += AndroidUtilities.m34dp(4.0f) + this.creditLayout.getHeight();
                }
                if (!this.isFirst && this.currentBlock.level <= 0) {
                    i6 += AndroidUtilities.m34dp(8.0f);
                }
                String musicAuthor = this.currentMessageObject.getMusicAuthor(false);
                String musicTitle = this.currentMessageObject.getMusicTitle(false);
                int dp6 = this.buttonX + AndroidUtilities.m34dp(50.0f) + dp3;
                this.seekBarX = dp6;
                int dp7 = (size - dp6) - AndroidUtilities.m34dp(18.0f);
                if (!TextUtils.isEmpty(musicTitle) || !TextUtils.isEmpty(musicAuthor)) {
                    if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                        spannableStringBuilder = new SpannableStringBuilder(String.format("%s - %s", musicAuthor, musicTitle));
                    } else if (!TextUtils.isEmpty(musicTitle)) {
                        spannableStringBuilder = new SpannableStringBuilder(musicTitle);
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(musicAuthor);
                    }
                    if (!TextUtils.isEmpty(musicAuthor)) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface("fonts/rmedium.ttf")), 0, musicAuthor.length(), 18);
                    }
                    CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, Theme.chat_audioTitlePaint, dp7, TextUtils.TruncateAt.END);
                    DrawingText drawingText = new DrawingText();
                    this.titleLayout = drawingText;
                    drawingText.textLayout = new StaticLayout(ellipsize, ArticleViewer.audioTimePaint, dp7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.titleLayout.parentBlock = this.currentBlock;
                    this.seekBarY = this.buttonY + ((dp3 - AndroidUtilities.m34dp(30.0f)) / 2) + AndroidUtilities.m34dp(11.0f);
                } else {
                    this.titleLayout = null;
                    this.seekBarY = this.buttonY + ((dp3 - AndroidUtilities.m34dp(30.0f)) / 2);
                }
                this.seekBar.setSize(dp7, AndroidUtilities.m34dp(30.0f));
                i3 = i6;
            }
            setMeasuredDimension(size, i3);
            updatePlayingMessageProgress();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            int i2;
            int i3;
            if (this.currentBlock != null) {
                this.radialProgress.setColors("chat_inLoader", "chat_inLoaderSelected", "chat_inMediaIcon", "chat_inMediaIconSelected");
                this.radialProgress.setProgressColor(Theme.getColor("chat_inFileProgress"));
                this.radialProgress.draw(canvas);
                canvas.save();
                canvas.translate(this.seekBarX, this.seekBarY);
                this.seekBar.draw(canvas);
                canvas.restore();
                if (this.durationLayout != null) {
                    canvas.save();
                    canvas.translate(this.buttonX + AndroidUtilities.m34dp(54.0f), this.seekBarY + AndroidUtilities.m34dp(6.0f));
                    this.durationLayout.draw(canvas);
                    canvas.restore();
                }
                int i4 = 0;
                if (this.titleLayout != null) {
                    canvas.save();
                    this.titleLayout.f1001x = this.buttonX + AndroidUtilities.m34dp(54.0f);
                    this.titleLayout.f1002y = this.seekBarY - AndroidUtilities.m34dp(16.0f);
                    DrawingText drawingText = this.titleLayout;
                    canvas.translate(drawingText.f1001x, drawingText.f1002y);
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
                    int i5 = this.textX;
                    drawingText2.f1001x = i5;
                    int i6 = this.textY;
                    drawingText2.f1002y = i6;
                    canvas.translate(i5, i6);
                    i++;
                    ArticleViewer.this.drawTextSelection(canvas, this, i);
                    this.captionLayout.draw(canvas, this);
                    canvas.restore();
                }
                if (this.creditLayout != null) {
                    canvas.save();
                    DrawingText drawingText3 = this.creditLayout;
                    int i7 = this.textX;
                    drawingText3.f1001x = i7;
                    drawingText3.f1002y = this.textY + this.creditOffset;
                    canvas.translate(i7, i2 + i3);
                    ArticleViewer.this.drawTextSelection(canvas, this, i);
                    this.creditLayout.draw(canvas, this);
                    canvas.restore();
                }
                if (this.currentBlock.level > 0) {
                    float dp = AndroidUtilities.m34dp(18.0f);
                    float dp2 = AndroidUtilities.m34dp(20.0f);
                    int measuredHeight = getMeasuredHeight();
                    if (this.currentBlock.bottom) {
                        i4 = AndroidUtilities.m34dp(6.0f);
                    }
                    canvas.drawRect(dp, 0.0f, dp2, measuredHeight - i4, ArticleViewer.quoteLinePaint);
                }
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
            if (this.currentDocument != null && this.currentMessageObject != null) {
                if (!this.seekBar.isDragging()) {
                    this.seekBar.setProgress(this.currentMessageObject.audioProgress);
                }
                int i = 0;
                if (!MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= this.currentDocument.attributes.size()) {
                            break;
                        }
                        TLRPC$DocumentAttribute tLRPC$DocumentAttribute = this.currentDocument.attributes.get(i2);
                        if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                            i = tLRPC$DocumentAttribute.duration;
                            break;
                        }
                        i2++;
                    }
                } else {
                    i = this.currentMessageObject.audioProgressSec;
                }
                String formatShortDuration = AndroidUtilities.formatShortDuration(i);
                String str = this.lastTimeString;
                if (str == null || (str != null && !str.equals(formatShortDuration))) {
                    this.lastTimeString = formatShortDuration;
                    ArticleViewer.audioTimePaint.setTextSize(AndroidUtilities.m34dp(16.0f));
                    this.durationLayout = new StaticLayout(formatShortDuration, ArticleViewer.audioTimePaint, (int) Math.ceil(ArticleViewer.audioTimePaint.measureText(formatShortDuration)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                ArticleViewer.audioTimePaint.setColor(ArticleViewer.this.getTextColor());
                invalidate();
            }
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
                }
            } else if (i == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.currentMessageObject)) {
                    this.buttonState = 0;
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                    invalidate();
                }
            } else if (i == 2) {
                this.radialProgress.setProgress(0.0f, false);
                FileLoader.getInstance(ArticleViewer.this.currentAccount).loadFile(this.currentDocument, this.parentAdapter.currentPage, 1, 1);
                this.buttonState = 3;
                this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                invalidate();
            } else if (i == 3) {
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
        private AvatarDrawable avatarDrawable = new AvatarDrawable();
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
            imageReceiver.setRoundRadius(AndroidUtilities.m34dp(20.0f));
            this.avatarImageView.setImageCoords(AndroidUtilities.m34dp(32.0f), AndroidUtilities.m34dp(8.0f), AndroidUtilities.m34dp(40.0f), AndroidUtilities.m34dp(40.0f));
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
                int i4 = 0;
                if (tLRPC$TL_pageBlockEmbedPost instanceof TL_pageBlockEmbedPostCaption) {
                    this.textX = AndroidUtilities.m34dp(18.0f);
                    this.textY = AndroidUtilities.m34dp(4.0f);
                    int dp = size - AndroidUtilities.m34dp(50.0f);
                    ArticleViewer articleViewer = ArticleViewer.this;
                    TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost2 = this.currentBlock;
                    DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbedPost2.caption.text, dp, this.textY, tLRPC$TL_pageBlockEmbedPost2, this.parentAdapter);
                    this.captionLayout = createLayoutForText;
                    if (createLayoutForText != null) {
                        int dp2 = AndroidUtilities.m34dp(4.0f) + this.captionLayout.getHeight();
                        this.creditOffset = dp2;
                        i4 = 0 + dp2 + AndroidUtilities.m34dp(4.0f);
                    }
                    ArticleViewer articleViewer2 = ArticleViewer.this;
                    TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost3 = this.currentBlock;
                    DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbedPost3.caption.credit, dp, this.textY + this.creditOffset, tLRPC$TL_pageBlockEmbedPost3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                    this.creditLayout = createLayoutForText2;
                    if (createLayoutForText2 != null) {
                        i4 += AndroidUtilities.m34dp(4.0f) + this.creditLayout.getHeight();
                    }
                    i3 = i4;
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
                            this.avatarImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.m34dp(40.0f), true), photoWithId), "40_40", this.avatarDrawable, 0, (String) null, this.parentAdapter.currentPage, 1);
                        }
                    }
                    DrawingText createLayoutForText3 = ArticleViewer.this.createLayoutForText(this, this.currentBlock.author, null, size - AndroidUtilities.m34dp((this.avatarVisible ? 54 : 0) + 50), 0, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 1, this.parentAdapter);
                    this.nameLayout = createLayoutForText3;
                    if (createLayoutForText3 != null) {
                        createLayoutForText3.f1001x = AndroidUtilities.m34dp((this.avatarVisible ? 54 : 0) + 32);
                        this.nameLayout.f1002y = AndroidUtilities.m34dp(this.dateLayout != null ? 10.0f : 19.0f);
                    }
                    if (this.currentBlock.date != 0) {
                        this.dateLayout = ArticleViewer.this.createLayoutForText(this, LocaleController.getInstance().chatFullDate.format(this.currentBlock.date * 1000), null, size - AndroidUtilities.m34dp((this.avatarVisible ? 54 : 0) + 50), AndroidUtilities.m34dp(29.0f), this.currentBlock, this.parentAdapter);
                    } else {
                        this.dateLayout = null;
                    }
                    int dp3 = AndroidUtilities.m34dp(56.0f);
                    if (this.currentBlock.blocks.isEmpty()) {
                        this.textX = AndroidUtilities.m34dp(32.0f);
                        this.textY = AndroidUtilities.m34dp(56.0f);
                        int dp4 = size - AndroidUtilities.m34dp(50.0f);
                        ArticleViewer articleViewer3 = ArticleViewer.this;
                        TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost4 = this.currentBlock;
                        DrawingText createLayoutForText4 = articleViewer3.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbedPost4.caption.text, dp4, this.textY, tLRPC$TL_pageBlockEmbedPost4, this.parentAdapter);
                        this.captionLayout = createLayoutForText4;
                        if (createLayoutForText4 != null) {
                            int dp5 = AndroidUtilities.m34dp(4.0f) + this.captionLayout.getHeight();
                            this.creditOffset = dp5;
                            dp3 += dp5 + AndroidUtilities.m34dp(4.0f);
                        }
                        int i5 = dp3;
                        ArticleViewer articleViewer4 = ArticleViewer.this;
                        TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost5 = this.currentBlock;
                        DrawingText createLayoutForText5 = articleViewer4.createLayoutForText(this, null, tLRPC$TL_pageBlockEmbedPost5.caption.credit, dp4, this.textY + this.creditOffset, tLRPC$TL_pageBlockEmbedPost5, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                        this.creditLayout = createLayoutForText5;
                        if (createLayoutForText5 != null) {
                            i5 += AndroidUtilities.m34dp(4.0f) + this.creditLayout.getHeight();
                        }
                        dp3 = i5;
                    } else {
                        this.captionLayout = null;
                        this.creditLayout = null;
                    }
                    DrawingText drawingText = this.dateLayout;
                    if (drawingText != null) {
                        if (this.avatarVisible) {
                            i4 = 54;
                        }
                        drawingText.f1001x = AndroidUtilities.m34dp(i4 + 32);
                        this.dateLayout.f1002y = AndroidUtilities.m34dp(29.0f);
                    }
                    DrawingText drawingText2 = this.captionLayout;
                    if (drawingText2 != null) {
                        drawingText2.f1001x = this.textX;
                        drawingText2.f1002y = this.textY;
                    }
                    DrawingText drawingText3 = this.creditLayout;
                    if (drawingText3 != null) {
                        drawingText3.f1001x = this.textX;
                        drawingText3.f1002y = this.textY;
                    }
                    i3 = dp3;
                }
                this.lineHeight = i3;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            TLRPC$TL_pageBlockEmbedPost tLRPC$TL_pageBlockEmbedPost = this.currentBlock;
            if (tLRPC$TL_pageBlockEmbedPost != null) {
                int i2 = 0;
                if (!(tLRPC$TL_pageBlockEmbedPost instanceof TL_pageBlockEmbedPostCaption)) {
                    if (this.avatarVisible) {
                        this.avatarImageView.draw(canvas);
                    }
                    int i3 = 54;
                    if (this.nameLayout != null) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.m34dp((this.avatarVisible ? 54 : 0) + 32), AndroidUtilities.m34dp(this.dateLayout != null ? 10.0f : 19.0f));
                        ArticleViewer.this.drawTextSelection(canvas, this, 0);
                        this.nameLayout.draw(canvas, this);
                        canvas.restore();
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (this.dateLayout != null) {
                        canvas.save();
                        if (!this.avatarVisible) {
                            i3 = 0;
                        }
                        canvas.translate(AndroidUtilities.m34dp(i3 + 32), AndroidUtilities.m34dp(29.0f));
                        i++;
                        ArticleViewer.this.drawTextSelection(canvas, this, i);
                        this.dateLayout.draw(canvas, this);
                        canvas.restore();
                    }
                    float dp = AndroidUtilities.m34dp(18.0f);
                    float dp2 = AndroidUtilities.m34dp(6.0f);
                    float dp3 = AndroidUtilities.m34dp(20.0f);
                    int i4 = this.lineHeight;
                    if (this.currentBlock.level == 0) {
                        i2 = AndroidUtilities.m34dp(6.0f);
                    }
                    canvas.drawRect(dp, dp2, dp3, i4 - i2, ArticleViewer.quoteLinePaint);
                    i2 = i;
                }
                if (this.captionLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    i2++;
                    ArticleViewer.this.drawTextSelection(canvas, this, i2);
                    this.captionLayout.draw(canvas, this);
                    canvas.restore();
                }
                if (this.creditLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY + this.creditOffset);
                    ArticleViewer.this.drawTextSelection(canvas, this, i2);
                    this.creditLayout.draw(canvas, this);
                    canvas.restore();
                }
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
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockParagraph tLRPC$TL_pageBlockParagraph = this.currentBlock;
            int i4 = 0;
            if (tLRPC$TL_pageBlockParagraph != null) {
                int i5 = tLRPC$TL_pageBlockParagraph.level;
                if (i5 == 0) {
                    this.textY = AndroidUtilities.m34dp(8.0f);
                    this.textX = AndroidUtilities.m34dp(18.0f);
                } else {
                    this.textY = 0;
                    this.textX = AndroidUtilities.m34dp((i5 * 14) + 18);
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.text, (size - AndroidUtilities.m34dp(18.0f)) - this.textX, this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, 0, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int height = createLayoutForText.getHeight();
                    if (this.currentBlock.level > 0) {
                        i3 = AndroidUtilities.m34dp(8.0f);
                    } else {
                        i3 = AndroidUtilities.m34dp(16.0f);
                    }
                    i4 = height + i3;
                    DrawingText drawingText = this.textLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                }
            } else {
                i4 = 1;
            }
            setMeasuredDimension(size, i4);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null) {
                if (this.textLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    ArticleViewer.this.drawTextSelection(canvas, this);
                    this.textLayout.draw(canvas, this);
                    canvas.restore();
                }
                if (this.currentBlock.level > 0) {
                    canvas.drawRect(AndroidUtilities.m34dp(18.0f), 0.0f, AndroidUtilities.m34dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.m34dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
                }
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                accessibilityNodeInfo.setText(drawingText.getText());
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
        private WebPlayerView videoView;
        private boolean wasUserInteraction;
        private TouchyWebView webView;

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
                        BlockEmbedCell.this.exactWebViewHeight = Utilities.parseInt(jSONObject.getString("height")).intValue();
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
                    if (BlockEmbedCell.this.currentBlock.allow_scrolling) {
                        requestDisallowInterceptTouchEvent(true);
                    } else {
                        ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(true);
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
            WebPlayerView webPlayerView = new WebPlayerView(context, false, false, new WebPlayerView.WebPlayerViewDelegate(ArticleViewer.this) {
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
                    if (ArticleViewer.this.parentActivity != null) {
                        ArticleViewer.this.showDialog(new ShareAlert(ArticleViewer.this.parentActivity, null, BlockEmbedCell.this.currentBlock.url, false, BlockEmbedCell.this.currentBlock.url, false));
                    }
                }

                @Override
                public void onPlayStateChanged(WebPlayerView webPlayerView2, boolean z) {
                    if (z) {
                        if (!(ArticleViewer.this.currentPlayingVideo == null || ArticleViewer.this.currentPlayingVideo == webPlayerView2)) {
                            ArticleViewer.this.currentPlayingVideo.pause();
                        }
                        ArticleViewer.this.currentPlayingVideo = webPlayerView2;
                        try {
                            ArticleViewer.this.parentActivity.getWindow().addFlags(ConnectionsManager.RequestFlagNeedQuickAck);
                        } catch (Exception e) {
                            FileLog.m30e(e);
                        }
                    } else {
                        if (ArticleViewer.this.currentPlayingVideo == webPlayerView2) {
                            ArticleViewer.this.currentPlayingVideo = null;
                        }
                        try {
                            ArticleViewer.this.parentActivity.getWindow().clearFlags(ConnectionsManager.RequestFlagNeedQuickAck);
                        } catch (Exception e2) {
                            FileLog.m30e(e2);
                        }
                    }
                }
            });
            this.videoView = webPlayerView;
            addView(webPlayerView);
            ArticleViewer.this.createdWebViews.add(this);
            TouchyWebView touchyWebView = new TouchyWebView(context);
            this.webView = touchyWebView;
            touchyWebView.getSettings().setJavaScriptEnabled(true);
            this.webView.getSettings().setDomStorageEnabled(true);
            this.webView.getSettings().setAllowContentAccess(true);
            int i = Build.VERSION.SDK_INT;
            if (i >= 17) {
                this.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                this.webView.addJavascriptInterface(new TelegramWebviewProxy(), "TelegramWebviewProxy");
            }
            if (i >= 21) {
                this.webView.getSettings().setMixedContentMode(0);
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
            }
            this.webView.setWebChromeClient(new C11662(ArticleViewer.this));
            this.webView.setWebViewClient(new WebViewClient(ArticleViewer.this) {
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
            });
            addView(this.webView);
        }

        public class C11662 extends WebChromeClient {
            C11662(ArticleViewer articleViewer) {
            }

            @Override
            public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
                onShowCustomView(view, customViewCallback);
            }

            @Override
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                if (ArticleViewer.this.customView != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                ArticleViewer.this.customView = view;
                ArticleViewer.this.customViewCallback = customViewCallback;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ArticleViewer.BlockEmbedCell.C11662.this.lambda$onShowCustomView$0();
                    }
                }, 100L);
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
                if (ArticleViewer.this.customView != null) {
                    ArticleViewer.this.fullscreenVideoContainer.setVisibility(4);
                    ArticleViewer.this.fullscreenVideoContainer.removeView(ArticleViewer.this.customView);
                    if (ArticleViewer.this.customViewCallback != null && !ArticleViewer.this.customViewCallback.getClass().getName().contains(".chromium.")) {
                        ArticleViewer.this.customViewCallback.onCustomViewHidden();
                    }
                    ArticleViewer.this.customView = null;
                }
            }
        }

        public void destroyWebView(boolean z) {
            try {
                this.webView.stopLoading();
                this.webView.loadUrl("about:blank");
                if (z) {
                    this.webView.destroy();
                }
                this.currentBlock = null;
            } catch (Exception e) {
                FileLog.m30e(e);
            }
            this.videoView.destroy();
        }

        public void setBlock(TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed) {
            TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed2 = this.currentBlock;
            this.currentBlock = tLRPC$TL_pageBlockEmbed;
            this.webView.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed3 = this.currentBlock;
            if (tLRPC$TL_pageBlockEmbed2 != tLRPC$TL_pageBlockEmbed3) {
                this.wasUserInteraction = false;
                if (tLRPC$TL_pageBlockEmbed3.allow_scrolling) {
                    this.webView.setVerticalScrollBarEnabled(true);
                    this.webView.setHorizontalScrollBarEnabled(true);
                } else {
                    this.webView.setVerticalScrollBarEnabled(false);
                    this.webView.setHorizontalScrollBarEnabled(false);
                }
                this.exactWebViewHeight = 0;
                try {
                    this.webView.loadUrl("about:blank");
                } catch (Exception e) {
                    FileLog.m30e(e);
                }
                try {
                    TLRPC$TL_pageBlockEmbed tLRPC$TL_pageBlockEmbed4 = this.currentBlock;
                    String str = tLRPC$TL_pageBlockEmbed4.html;
                    if (str != null) {
                        this.webView.loadDataWithBaseURL("https://telegram.org/embed", str, "text/html", "UTF-8", null);
                        this.videoView.setVisibility(4);
                        this.videoView.loadVideo(null, null, null, null, false);
                        this.webView.setVisibility(0);
                    } else {
                        long j = tLRPC$TL_pageBlockEmbed4.poster_photo_id;
                        if (this.videoView.loadVideo(tLRPC$TL_pageBlockEmbed.url, j != 0 ? this.parentAdapter.getPhotoWithId(j) : null, this.parentAdapter.currentPage, null, false)) {
                            this.webView.setVisibility(4);
                            this.videoView.setVisibility(0);
                            this.webView.stopLoading();
                            this.webView.loadUrl("about:blank");
                        } else {
                            this.webView.setVisibility(0);
                            this.videoView.setVisibility(4);
                            this.videoView.loadVideo(null, null, null, null, false);
                            HashMap hashMap = new HashMap();
                            hashMap.put("Referer", ApplicationLoader.applicationContext.getPackageName());
                            this.webView.loadUrl(this.currentBlock.url, hashMap);
                        }
                    }
                } catch (Exception e2) {
                    FileLog.m30e(e2);
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
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.BlockEmbedCell.onMeasure(int, int):void");
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            TouchyWebView touchyWebView = this.webView;
            int i5 = this.listX;
            touchyWebView.layout(i5, 0, touchyWebView.getMeasuredWidth() + i5, this.webView.getMeasuredHeight());
            if (this.videoView.getParent() == this) {
                WebPlayerView webPlayerView = this.videoView;
                int i6 = this.listX;
                webPlayerView.layout(i6, 0, webPlayerView.getMeasuredWidth() + i6, this.videoView.getMeasuredHeight());
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock != null) {
                int i2 = 0;
                if (this.captionLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    i = 1;
                    ArticleViewer.this.drawTextSelection(canvas, this, 0);
                    this.captionLayout.draw(canvas, this);
                    canvas.restore();
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
                    float dp = AndroidUtilities.m34dp(18.0f);
                    float dp2 = AndroidUtilities.m34dp(20.0f);
                    int measuredHeight = getMeasuredHeight();
                    if (this.currentBlock.bottom) {
                        i2 = AndroidUtilities.m34dp(6.0f);
                    }
                    canvas.drawRect(dp, 0.0f, dp2, measuredHeight - i2, ArticleViewer.quoteLinePaint);
                }
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
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context, ArticleViewer.this) {
                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
                    if (BlockTableCell.this.tableLayout.getMeasuredWidth() > getMeasuredWidth() - AndroidUtilities.m34dp(36.0f) && onInterceptTouchEvent) {
                        ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(true);
                    }
                    return onInterceptTouchEvent;
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (BlockTableCell.this.tableLayout.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.m34dp(36.0f)) {
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
                    if (articleTextSelectionHelper != null && articleTextSelectionHelper.isSelectionMode()) {
                        ArticleViewer.this.textSelectionHelper.invalidate();
                    }
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
            horizontalScrollView.setPadding(AndroidUtilities.m34dp(18.0f), 0, AndroidUtilities.m34dp(18.0f), 0);
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
            if (drawingText != null && !ArticleViewer.this.searchResults.isEmpty() && ArticleViewer.this.searchText != null) {
                String lowerCase = drawingText.textLayout.getText().toString().toLowerCase();
                int i3 = 0;
                while (true) {
                    int indexOf = lowerCase.indexOf(ArticleViewer.this.searchText, i3);
                    if (indexOf >= 0) {
                        i3 = ArticleViewer.this.searchText.length() + indexOf;
                        if (indexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(indexOf - 1))) {
                            StaticLayout staticLayout = drawingText.textLayout;
                            ArticleViewer.this.adapter[0].searchTextOffset.put(ArticleViewer.this.searchText + this.currentBlock + drawingText.parentText + indexOf, Integer.valueOf(staticLayout.getLineTop(staticLayout.getLineForOffset(indexOf)) + i2));
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public void setBlock(TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable) {
            int i;
            this.currentBlock = tLRPC$TL_pageBlockTable;
            AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, Theme.getColor("windowBackgroundWhite"));
            this.tableLayout.removeAllChildrens();
            this.tableLayout.setDrawLines(this.currentBlock.bordered);
            this.tableLayout.setStriped(this.currentBlock.striped);
            this.tableLayout.setRtl(this.parentAdapter.isRtl);
            if (!this.currentBlock.rows.isEmpty()) {
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
            } else {
                i = 0;
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
            int i4;
            int i5;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable = this.currentBlock;
            if (tLRPC$TL_pageBlockTable != null) {
                int i6 = tLRPC$TL_pageBlockTable.level;
                if (i6 > 0) {
                    int dp = AndroidUtilities.m34dp(i6 * 14);
                    this.listX = dp;
                    i4 = dp + AndroidUtilities.m34dp(18.0f);
                    this.textX = i4;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.m34dp(18.0f);
                    i4 = AndroidUtilities.m34dp(36.0f);
                }
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable2 = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockTable2.title, size - i4, 0, tLRPC$TL_pageBlockTable2, Layout.Alignment.ALIGN_CENTER, 0, this.parentAdapter);
                this.titleLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    this.textY = 0;
                    i5 = createLayoutForText.getHeight() + AndroidUtilities.m34dp(8.0f) + 0;
                    this.listY = i5;
                    DrawingText drawingText = this.titleLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                } else {
                    this.listY = AndroidUtilities.m34dp(8.0f);
                    i5 = 0;
                }
                this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size - this.listX, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                i3 = i5 + this.scrollView.getMeasuredHeight() + AndroidUtilities.m34dp(8.0f);
                TLRPC$TL_pageBlockTable tLRPC$TL_pageBlockTable3 = this.currentBlock;
                if (tLRPC$TL_pageBlockTable3.level > 0 && !tLRPC$TL_pageBlockTable3.bottom) {
                    i3 += AndroidUtilities.m34dp(8.0f);
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
                    drawingText.f1001x = ((childAt.getTextX() + this.listX) + AndroidUtilities.m34dp(18.0f)) - this.scrollView.getScrollX();
                    childAt.textLayout.f1002y = childAt.getTextY() + this.listY;
                    childAt.textLayout.row = childAt.getRow();
                    i++;
                    childAt.setSelectionIndex(i);
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
                    this.scrollView.setScrollX((this.tableLayout.getMeasuredWidth() - this.scrollView.getMeasuredWidth()) + AndroidUtilities.m34dp(36.0f));
                } else {
                    this.scrollView.setScrollX(0);
                }
                this.firstLayout = false;
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null) {
                int i = 0;
                if (this.titleLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    ArticleViewer.this.drawTextSelection(canvas, this, 0);
                    this.titleLayout.draw(canvas, this);
                    canvas.restore();
                }
                if (this.currentBlock.level > 0) {
                    float dp = AndroidUtilities.m34dp(18.0f);
                    float dp2 = AndroidUtilities.m34dp(20.0f);
                    int measuredHeight = getMeasuredHeight();
                    if (this.currentBlock.bottom) {
                        i = AndroidUtilities.m34dp(6.0f);
                    }
                    canvas.drawRect(dp, 0.0f, dp2, measuredHeight - i, ArticleViewer.quoteLinePaint);
                }
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
        private GroupedMessages group = new GroupedMessages();
        private boolean inLayout;
        private RecyclerView.Adapter innerAdapter;
        private RecyclerListView innerListView;
        private int listX;
        private WebpageAdapter parentAdapter;
        private int textX;
        private int textY;

        public class GroupedMessages {
            public ArrayList<MessageObject.GroupedMessagePosition> posArray = new ArrayList<>();
            public HashMap<TLObject, MessageObject.GroupedMessagePosition> positions = new HashMap<>();
            private int maxSizeWidth = 1000;

            public GroupedMessages() {
            }

            public class MessageGroupedLayoutAttempt {
                public float[] heights;
                public int[] lineCounts;

                public MessageGroupedLayoutAttempt(GroupedMessages groupedMessages, int i, int i2, float f, float f2) {
                    this.lineCounts = new int[]{i, i2};
                    this.heights = new float[]{f, f2};
                }

                public MessageGroupedLayoutAttempt(GroupedMessages groupedMessages, int i, int i2, int i3, float f, float f2, float f3) {
                    this.lineCounts = new int[]{i, i2, i3};
                    this.heights = new float[]{f, f2, f3};
                }

                public MessageGroupedLayoutAttempt(GroupedMessages groupedMessages, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
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
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.BlockCollageCell.GroupedMessages.calculate():void");
            }
        }

        public BlockCollageCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            RecyclerListView recyclerListView = new RecyclerListView(context, ArticleViewer.this) {
                @Override
                public void requestLayout() {
                    if (!BlockCollageCell.this.inLayout) {
                        super.requestLayout();
                    }
                }
            };
            this.innerListView = recyclerListView;
            recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration(ArticleViewer.this) {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition;
                    int i = 0;
                    rect.bottom = 0;
                    if (view instanceof BlockPhotoCell) {
                        groupedMessagePosition = BlockCollageCell.this.group.positions.get(((BlockPhotoCell) view).currentBlock);
                    } else {
                        groupedMessagePosition = view instanceof BlockVideoCell ? BlockCollageCell.this.group.positions.get(((BlockVideoCell) view).currentBlock) : null;
                    }
                    if (groupedMessagePosition != null && groupedMessagePosition.siblingHeights != null) {
                        Point point = AndroidUtilities.displaySize;
                        float max = Math.max(point.x, point.y) * 0.5f;
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            float[] fArr = groupedMessagePosition.siblingHeights;
                            if (i2 >= fArr.length) {
                                break;
                            }
                            i3 += (int) Math.ceil(fArr[i2] * max);
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
                                    dp2 -= ((int) Math.ceil(max * groupedMessagePosition2.f815ph)) - AndroidUtilities.m34dp(4.0f);
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                        rect.bottom = -dp2;
                    }
                }
            });
            GridLayoutManagerFixed gridLayoutManagerFixed = new GridLayoutManagerFixed(context, 1000, 1, true, ArticleViewer.this) {
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
                    if (!(groupedMessagePosition.minX == groupedMessagePosition.maxX || (b = groupedMessagePosition.minY) != groupedMessagePosition.maxY || b == 0)) {
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
            gridLayoutManagerFixed.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(ArticleViewer.this) {
                @Override
                public int getSpanSize(int i) {
                    return BlockCollageCell.this.group.positions.get(BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1)).spanSize;
                }
            });
            this.innerListView.setLayoutManager(gridLayoutManagerFixed);
            RecyclerListView recyclerListView2 = this.innerListView;
            RecyclerView.Adapter adapter = new RecyclerView.Adapter(ArticleViewer.this) {
                @Override
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    View view;
                    if (i != 0) {
                        BlockCollageCell blockCollageCell = BlockCollageCell.this;
                        view = new BlockVideoCell(blockCollageCell.getContext(), BlockCollageCell.this.parentAdapter, 2);
                    } else {
                        BlockCollageCell blockCollageCell2 = BlockCollageCell.this;
                        view = new BlockPhotoCell(blockCollageCell2.getContext(), BlockCollageCell.this.parentAdapter, 2);
                    }
                    return new RecyclerListView.Holder(view);
                }

                @Override
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    TLRPC$PageBlock tLRPC$PageBlock = BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1);
                    if (viewHolder.getItemViewType() != 0) {
                        BlockVideoCell blockVideoCell = (BlockVideoCell) viewHolder.itemView;
                        blockVideoCell.groupPosition = BlockCollageCell.this.group.positions.get(tLRPC$PageBlock);
                        blockVideoCell.setBlock((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock, true, true);
                        return;
                    }
                    BlockPhotoCell blockPhotoCell = (BlockPhotoCell) viewHolder.itemView;
                    blockPhotoCell.groupPosition = BlockCollageCell.this.group.positions.get(tLRPC$PageBlock);
                    blockPhotoCell.setBlock((TLRPC$TL_pageBlockPhoto) tLRPC$PageBlock, true, true);
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
            this.innerListView.setGlowColor(Theme.getColor("windowBackgroundWhite"));
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
            int i4;
            int i5 = 1;
            this.inLayout = true;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage = this.currentBlock;
            if (tLRPC$TL_pageBlockCollage != null) {
                int i6 = tLRPC$TL_pageBlockCollage.level;
                if (i6 > 0) {
                    int dp = AndroidUtilities.m34dp(i6 * 14) + AndroidUtilities.m34dp(18.0f);
                    this.listX = dp;
                    this.textX = dp;
                    i3 = size - (dp + AndroidUtilities.m34dp(18.0f));
                    i4 = i3;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.m34dp(18.0f);
                    i4 = size - AndroidUtilities.m34dp(36.0f);
                    i3 = size;
                }
                this.innerListView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = this.innerListView.getMeasuredHeight();
                int dp2 = measuredHeight + AndroidUtilities.m34dp(8.0f);
                this.textY = dp2;
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage2 = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockCollage2.caption.text, i4, dp2, tLRPC$TL_pageBlockCollage2, this.parentAdapter);
                this.captionLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp3 = AndroidUtilities.m34dp(4.0f) + this.captionLayout.getHeight();
                    this.creditOffset = dp3;
                    measuredHeight += dp3 + AndroidUtilities.m34dp(4.0f);
                    DrawingText drawingText = this.captionLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                } else {
                    this.creditOffset = 0;
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage3 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockCollage3.caption.credit, i4, this.textY + this.creditOffset, tLRPC$TL_pageBlockCollage3, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    measuredHeight += AndroidUtilities.m34dp(4.0f) + this.creditLayout.getHeight();
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.f1001x = this.textX;
                    drawingText2.f1002y = this.textY + this.creditOffset;
                }
                i5 = measuredHeight + AndroidUtilities.m34dp(16.0f);
                TLRPC$TL_pageBlockCollage tLRPC$TL_pageBlockCollage4 = this.currentBlock;
                if (tLRPC$TL_pageBlockCollage4.level > 0 && !tLRPC$TL_pageBlockCollage4.bottom) {
                    i5 += AndroidUtilities.m34dp(8.0f);
                }
            }
            setMeasuredDimension(size, i5);
            this.inLayout = false;
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.innerListView.layout(this.listX, AndroidUtilities.m34dp(8.0f), this.listX + this.innerListView.getMeasuredWidth(), this.innerListView.getMeasuredHeight() + AndroidUtilities.m34dp(8.0f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock != null) {
                int i2 = 0;
                if (this.captionLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    i = 1;
                    ArticleViewer.this.drawTextSelection(canvas, this, 0);
                    this.captionLayout.draw(canvas, this);
                    canvas.restore();
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
                    float dp = AndroidUtilities.m34dp(18.0f);
                    float dp2 = AndroidUtilities.m34dp(20.0f);
                    int measuredHeight = getMeasuredHeight();
                    if (this.currentBlock.bottom) {
                        i2 = AndroidUtilities.m34dp(6.0f);
                    }
                    canvas.drawRect(dp, 0.0f, dp2, measuredHeight - i2, ArticleViewer.quoteLinePaint);
                }
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
        private int textX = AndroidUtilities.m34dp(18.0f);
        private int textY;

        public BlockSlideshowCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            if (ArticleViewer.dotsPaint == null) {
                Paint unused = ArticleViewer.dotsPaint = new Paint(1);
                ArticleViewer.dotsPaint.setColor(-1);
            }
            ViewPager viewPager = new ViewPager(context, ArticleViewer.this) {
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
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(ArticleViewer.this) {
                @Override
                public void onPageScrollStateChanged(int i) {
                }

                @Override
                public void onPageScrolled(int i, float f, int i2) {
                    BlockSlideshowCell blockSlideshowCell;
                    float measuredWidth = BlockSlideshowCell.this.innerListView.getMeasuredWidth();
                    if (measuredWidth != 0.0f) {
                        BlockSlideshowCell.this.pageOffset = (((i * measuredWidth) + i2) - (blockSlideshowCell.currentPage * measuredWidth)) / measuredWidth;
                        BlockSlideshowCell.this.dotsContainer.invalidate();
                    }
                }

                @Override
                public void onPageSelected(int i) {
                    BlockSlideshowCell.this.currentPage = i;
                    BlockSlideshowCell.this.dotsContainer.invalidate();
                }
            });
            ViewPager viewPager2 = this.innerListView;
            PagerAdapter pagerAdapter = new PagerAdapter(ArticleViewer.this) {

                class ObjectContainer {
                    private TLRPC$PageBlock block;
                    private View view;

                    ObjectContainer(C11723 r1) {
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
                        blockVideoCell2.setBlock((TLRPC$TL_pageBlockVideo) tLRPC$PageBlock, true, true);
                        blockVideoCell = blockVideoCell2;
                    }
                    viewGroup.addView(blockVideoCell);
                    ObjectContainer objectContainer = new ObjectContainer(this);
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
            AndroidUtilities.setViewPagerEdgeEffectColor(this.innerListView, Theme.getColor("windowBackgroundWhite"));
            addView(this.innerListView);
            View view = new View(context, ArticleViewer.this) {
                @Override
                protected void onDraw(Canvas canvas) {
                    int i;
                    int i2;
                    if (BlockSlideshowCell.this.currentBlock != null) {
                        int count = BlockSlideshowCell.this.innerAdapter.getCount();
                        int dp = (AndroidUtilities.m34dp(7.0f) * count) + ((count - 1) * AndroidUtilities.m34dp(6.0f)) + AndroidUtilities.m34dp(4.0f);
                        if (dp < getMeasuredWidth()) {
                            i = (getMeasuredWidth() - dp) / 2;
                        } else {
                            int dp2 = AndroidUtilities.m34dp(4.0f);
                            int dp3 = AndroidUtilities.m34dp(13.0f);
                            int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.m34dp(8.0f)) / 2) / dp3;
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
                            int dp4 = AndroidUtilities.m34dp(4.0f) + i + (AndroidUtilities.m34dp(13.0f) * i4);
                            Drawable drawable = BlockSlideshowCell.this.currentPage == i4 ? ArticleViewer.this.slideDotBigDrawable : ArticleViewer.this.slideDotDrawable;
                            drawable.setBounds(dp4 - AndroidUtilities.m34dp(5.0f), 0, dp4 + AndroidUtilities.m34dp(5.0f), AndroidUtilities.m34dp(10.0f));
                            drawable.draw(canvas);
                            i4++;
                        }
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
                int dp = AndroidUtilities.m34dp(310.0f);
                this.innerListView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                this.currentBlock.items.size();
                this.dotsContainer.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(10.0f), 1073741824));
                int dp2 = size - AndroidUtilities.m34dp(36.0f);
                int dp3 = dp + AndroidUtilities.m34dp(16.0f);
                this.textY = dp3;
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockSlideshow.caption.text, dp2, dp3, tLRPC$TL_pageBlockSlideshow, this.parentAdapter);
                this.captionLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int dp4 = AndroidUtilities.m34dp(4.0f) + this.captionLayout.getHeight();
                    this.creditOffset = dp4;
                    dp += dp4 + AndroidUtilities.m34dp(4.0f);
                    DrawingText drawingText = this.captionLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                } else {
                    this.creditOffset = 0;
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TLRPC$TL_pageBlockSlideshow tLRPC$TL_pageBlockSlideshow2 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockSlideshow2.caption.credit, dp2, this.textY + this.creditOffset, tLRPC$TL_pageBlockSlideshow2, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    dp += AndroidUtilities.m34dp(4.0f) + this.creditLayout.getHeight();
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.f1001x = this.textX;
                    drawingText2.f1002y = this.textY + this.creditOffset;
                }
                i3 = dp + AndroidUtilities.m34dp(16.0f);
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.innerListView.layout(0, AndroidUtilities.m34dp(8.0f), this.innerListView.getMeasuredWidth(), AndroidUtilities.m34dp(8.0f) + this.innerListView.getMeasuredHeight());
            int bottom = this.innerListView.getBottom() - AndroidUtilities.m34dp(23.0f);
            View view = this.dotsContainer;
            view.layout(0, bottom, view.getMeasuredWidth(), this.dotsContainer.getMeasuredHeight() + bottom);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null) {
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
        @android.annotation.SuppressLint({"NewApi"})
        protected void onMeasure(int r17, int r18) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.BlockListItemCell.onMeasure(int, int):void");
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
            if (this.currentBlock != null) {
                int measuredWidth = getMeasuredWidth();
                if (this.currentBlock.numLayout != null) {
                    canvas.save();
                    int i = 0;
                    if (this.parentAdapter.isRtl) {
                        float dp = ((measuredWidth - AndroidUtilities.m34dp(15.0f)) - this.currentBlock.parent.maxNumWidth) - (this.currentBlock.parent.level * AndroidUtilities.m34dp(12.0f));
                        int i2 = this.textY + this.numOffsetY;
                        if (this.drawDot) {
                            i = AndroidUtilities.m34dp(1.0f);
                        }
                        canvas.translate(dp, i2 - i);
                    } else {
                        float dp2 = ((AndroidUtilities.m34dp(15.0f) + this.currentBlock.parent.maxNumWidth) - ((int) Math.ceil(this.currentBlock.numLayout.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.m34dp(12.0f));
                        int i3 = this.textY + this.numOffsetY;
                        if (this.drawDot) {
                            i = AndroidUtilities.m34dp(1.0f);
                        }
                        canvas.translate(dp2, i3 - i);
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
            if (drawingText != null) {
                accessibilityNodeInfo.setText(drawingText.getText());
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                if (view instanceof TextSelectionHelper.ArticleSelectableView) {
                    ((TextSelectionHelper.ArticleSelectableView) view).fillTextLayoutBlocks(arrayList);
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
        @android.annotation.SuppressLint({"NewApi"})
        protected void onMeasure(int r17, int r18) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.BlockOrderedListItemCell.onMeasure(int, int):void");
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
            if (this.currentBlock != null) {
                int measuredWidth = getMeasuredWidth();
                if (this.currentBlock.numLayout != null) {
                    canvas.save();
                    if (this.parentAdapter.isRtl) {
                        canvas.translate(((measuredWidth - AndroidUtilities.m34dp(18.0f)) - this.currentBlock.parent.maxNumWidth) - (this.currentBlock.parent.level * AndroidUtilities.m34dp(20.0f)), this.textY + this.numOffsetY);
                    } else {
                        canvas.translate(((AndroidUtilities.m34dp(18.0f) + this.currentBlock.parent.maxNumWidth) - ((int) Math.ceil(this.currentBlock.numLayout.getLineWidth(0)))) + (this.currentBlock.parent.level * AndroidUtilities.m34dp(20.0f)), this.textY + this.numOffsetY);
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
            if (drawingText != null) {
                accessibilityNodeInfo.setText(drawingText.getText());
            }
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                if (view instanceof TextSelectionHelper.ArticleSelectableView) {
                    ((TextSelectionHelper.ArticleSelectableView) view).fillTextLayoutBlocks(arrayList);
                }
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }
    }

    public class BlockDetailsCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockDetails currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX = AndroidUtilities.m34dp(50.0f);
        private int textY = AndroidUtilities.m34dp(11.0f) + 1;
        private AnimatedArrowDrawable arrow = new AnimatedArrowDrawable(ArticleViewer.getGrayTextColor(), true);

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        public BlockDetailsCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
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
            int dp = AndroidUtilities.m34dp(39.0f);
            TLRPC$TL_pageBlockDetails tLRPC$TL_pageBlockDetails = this.currentBlock;
            if (tLRPC$TL_pageBlockDetails != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockDetails.title, size - AndroidUtilities.m34dp(52.0f), 0, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    dp = Math.max(dp, AndroidUtilities.m34dp(21.0f) + this.textLayout.getHeight());
                    int height = ((this.textLayout.getHeight() + AndroidUtilities.m34dp(21.0f)) - this.textLayout.getHeight()) / 2;
                    this.textY = height;
                    DrawingText drawingText = this.textLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = height;
                }
            }
            setMeasuredDimension(size, dp + 1);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.m34dp(18.0f), ((getMeasuredHeight() - AndroidUtilities.m34dp(13.0f)) - 1) / 2);
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
        public BlockDetailsBottomCell(Context context) {
            super(context);
            new RectF();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.m34dp(4.0f) + 1);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), 0.0f, ArticleViewer.dividerPaint);
        }
    }

    public static class BlockRelatedArticlesShadowCell extends View {
        private CombinedDrawable shadowDrawable;

        public BlockRelatedArticlesShadowCell(Context context) {
            super(context);
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, -16777216));
            this.shadowDrawable = combinedDrawable;
            combinedDrawable.setFullsize(true);
            setBackgroundDrawable(this.shadowDrawable);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.m34dp(12.0f));
            Theme.setCombinedDrawableColor(this.shadowDrawable, Theme.getColor("windowBackgroundGray"), false);
        }
    }

    public class BlockRelatedArticlesHeaderCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockRelatedArticles currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX = AndroidUtilities.m34dp(18.0f);
        private int textY;

        public BlockRelatedArticlesHeaderCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
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
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockRelatedArticles.title, size - AndroidUtilities.m34dp(52.0f), 0, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 1, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    this.textY = AndroidUtilities.m34dp(6.0f) + ((AndroidUtilities.m34dp(32.0f) - this.textLayout.getHeight()) / 2);
                }
            }
            if (this.textLayout != null) {
                setMeasuredDimension(size, AndroidUtilities.m34dp(38.0f));
                DrawingText drawingText = this.textLayout;
                drawingText.f1001x = this.textX;
                drawingText.f1002y = this.textY;
                return;
            }
            setMeasuredDimension(size, 1);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null && this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
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

    public class BlockRelatedArticlesCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TL_pageBlockRelatedArticlesChild currentBlock;
        private boolean divider;
        private boolean drawImage;
        private ImageReceiver imageView;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textOffset;
        private int textX = AndroidUtilities.m34dp(18.0f);
        private int textY = AndroidUtilities.m34dp(10.0f);

        public BlockRelatedArticlesCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.imageView = imageReceiver;
            imageReceiver.setRoundRadius(AndroidUtilities.m34dp(6.0f));
        }

        public void setBlock(TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild) {
            this.currentBlock = tL_pageBlockRelatedArticlesChild;
            requestLayout();
        }

        @Override
        @SuppressLint({"DrawAllocation", "NewApi"})
        protected void onMeasure(int i, int i2) {
            int i3;
            int i4;
            boolean z;
            String str;
            int dp;
            int size = View.MeasureSpec.getSize(i);
            this.divider = this.currentBlock.num != this.currentBlock.parent.articles.size() - 1;
            TLRPC$TL_pageRelatedArticle tLRPC$TL_pageRelatedArticle = this.currentBlock.parent.articles.get(this.currentBlock.num);
            int dp2 = AndroidUtilities.m34dp(SharedConfig.ivFontSize - 16);
            long j = tLRPC$TL_pageRelatedArticle.photo_id;
            TLRPC$PhotoSize tLRPC$PhotoSize = null;
            TLRPC$Photo photoWithId = j != 0 ? this.parentAdapter.getPhotoWithId(j) : null;
            if (photoWithId != null) {
                this.drawImage = true;
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize());
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, 80, true);
                if (closestPhotoSizeWithSize != closestPhotoSizeWithSize2) {
                    tLRPC$PhotoSize = closestPhotoSizeWithSize2;
                }
                this.imageView.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photoWithId), "64_64", ImageLocation.getForPhoto(tLRPC$PhotoSize, photoWithId), "64_64_b", closestPhotoSizeWithSize.size, null, this.parentAdapter.currentPage, 1);
            } else {
                this.drawImage = false;
            }
            int dp3 = AndroidUtilities.m34dp(60.0f);
            int dp4 = size - AndroidUtilities.m34dp(36.0f);
            if (this.drawImage) {
                float dp5 = AndroidUtilities.m34dp(44.0f);
                this.imageView.setImageCoords((size - dp) - AndroidUtilities.m34dp(8.0f), AndroidUtilities.m34dp(8.0f), dp5, dp5);
                dp4 = (int) (dp4 - (this.imageView.getImageWidth() + AndroidUtilities.m34dp(6.0f)));
            }
            int i5 = dp4;
            int dp6 = AndroidUtilities.m34dp(18.0f);
            String str2 = tLRPC$TL_pageRelatedArticle.title;
            if (str2 != null) {
                i3 = dp3;
                this.textLayout = ArticleViewer.this.createLayoutForText(this, str2, null, i5, this.textY, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 3, this.parentAdapter);
            } else {
                i3 = dp3;
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                int lineCount = drawingText.getLineCount();
                i4 = 4 - lineCount;
                this.textOffset = this.textLayout.getHeight() + AndroidUtilities.m34dp(6.0f) + dp2;
                dp6 += this.textLayout.getHeight();
                int i6 = 0;
                while (true) {
                    if (i6 >= lineCount) {
                        z = false;
                        break;
                    } else if (this.textLayout.getLineLeft(i6) != 0.0f) {
                        z = true;
                        break;
                    } else {
                        i6++;
                    }
                }
                DrawingText drawingText2 = this.textLayout;
                drawingText2.f1001x = this.textX;
                drawingText2.f1002y = this.textY;
            } else {
                this.textOffset = 0;
                z = false;
                i4 = 4;
            }
            if (tLRPC$TL_pageRelatedArticle.published_date != 0 && !TextUtils.isEmpty(tLRPC$TL_pageRelatedArticle.author)) {
                str = LocaleController.formatString("ArticleDateByAuthor", C0952R.string.ArticleDateByAuthor, LocaleController.getInstance().chatFullDate.format(tLRPC$TL_pageRelatedArticle.published_date * 1000), tLRPC$TL_pageRelatedArticle.author);
            } else if (!TextUtils.isEmpty(tLRPC$TL_pageRelatedArticle.author)) {
                str = LocaleController.formatString("ArticleByAuthor", C0952R.string.ArticleByAuthor, tLRPC$TL_pageRelatedArticle.author);
            } else if (tLRPC$TL_pageRelatedArticle.published_date != 0) {
                str = LocaleController.getInstance().chatFullDate.format(tLRPC$TL_pageRelatedArticle.published_date * 1000);
            } else if (!TextUtils.isEmpty(tLRPC$TL_pageRelatedArticle.description)) {
                str = tLRPC$TL_pageRelatedArticle.description;
            } else {
                str = tLRPC$TL_pageRelatedArticle.url;
            }
            DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, str, null, i5, this.textOffset + this.textY, this.currentBlock, (this.parentAdapter.isRtl || z) ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, i4, this.parentAdapter);
            this.textLayout2 = createLayoutForText;
            if (createLayoutForText != null) {
                dp6 += createLayoutForText.getHeight();
                if (this.textLayout != null) {
                    dp6 += AndroidUtilities.m34dp(6.0f) + dp2;
                }
                DrawingText drawingText3 = this.textLayout2;
                drawingText3.f1001x = this.textX;
                drawingText3.f1002y = this.textY + this.textOffset;
            }
            setMeasuredDimension(size, Math.max(i3, dp6) + (this.divider ? 1 : 0));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock != null) {
                if (this.drawImage) {
                    this.imageView.draw(canvas);
                }
                canvas.save();
                canvas.translate(this.textX, AndroidUtilities.m34dp(10.0f));
                int i2 = 0;
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
                    float dp = this.parentAdapter.isRtl ? 0.0f : AndroidUtilities.m34dp(17.0f);
                    float measuredHeight = getMeasuredHeight() - 1;
                    int measuredWidth = getMeasuredWidth();
                    if (this.parentAdapter.isRtl) {
                        i2 = AndroidUtilities.m34dp(17.0f);
                    }
                    canvas.drawLine(dp, measuredHeight, measuredWidth - i2, getMeasuredHeight() - 1, ArticleViewer.dividerPaint);
                }
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
        private int textX = AndroidUtilities.m34dp(18.0f);
        private int textY = AndroidUtilities.m34dp(8.0f);

        public BlockHeaderCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
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
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockHeader tLRPC$TL_pageBlockHeader = this.currentBlock;
            int i3 = 0;
            if (tLRPC$TL_pageBlockHeader != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockHeader.text, size - AndroidUtilities.m34dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = 0 + AndroidUtilities.m34dp(16.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null && this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.textLayout != null) {
                accessibilityNodeInfo.setText(((Object) this.textLayout.getText()) + ", " + LocaleController.getString("AccDescrIVHeading", C0952R.string.AccDescrIVHeading));
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

    public static class BlockDividerCell extends View {
        private RectF rect = new RectF();

        public BlockDividerCell(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.m34dp(18.0f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int measuredWidth = getMeasuredWidth() / 3;
            this.rect.set(measuredWidth, AndroidUtilities.m34dp(8.0f), measuredWidth * 2, AndroidUtilities.m34dp(10.0f));
            canvas.drawRoundRect(this.rect, AndroidUtilities.m34dp(1.0f), AndroidUtilities.m34dp(1.0f), ArticleViewer.dividerPaint);
        }
    }

    public class BlockSubtitleCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockSubtitle currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX = AndroidUtilities.m34dp(18.0f);
        private int textY = AndroidUtilities.m34dp(8.0f);

        public BlockSubtitleCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
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
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockSubtitle tLRPC$TL_pageBlockSubtitle = this.currentBlock;
            int i3 = 0;
            if (tLRPC$TL_pageBlockSubtitle != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockSubtitle.text, size - AndroidUtilities.m34dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = 0 + AndroidUtilities.m34dp(16.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null && this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.textLayout != null) {
                accessibilityNodeInfo.setText(((Object) this.textLayout.getText()) + ", " + LocaleController.getString("AccDescrIVHeading", C0952R.string.AccDescrIVHeading));
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

    public class BlockPullquoteCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockPullquote currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private DrawingText textLayout2;
        private int textX = AndroidUtilities.m34dp(18.0f);
        private int textY = AndroidUtilities.m34dp(8.0f);
        private int textY2;

        public BlockPullquoteCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
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
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockPullquote.text, size - AndroidUtilities.m34dp(36.0f), this.textY, this.currentBlock, this.parentAdapter);
                this.textLayout = createLayoutForText;
                i3 = 0;
                if (createLayoutForText != null) {
                    i3 = 0 + AndroidUtilities.m34dp(8.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                }
                this.textY2 = AndroidUtilities.m34dp(2.0f) + i3;
                DrawingText createLayoutForText2 = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.caption, size - AndroidUtilities.m34dp(36.0f), this.textY2, this.currentBlock, this.parentAdapter);
                this.textLayout2 = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i3 += AndroidUtilities.m34dp(8.0f) + this.textLayout2.getHeight();
                    DrawingText drawingText2 = this.textLayout2;
                    drawingText2.f1001x = this.textX;
                    drawingText2.f1002y = this.textY2;
                }
                if (i3 != 0) {
                    i3 += AndroidUtilities.m34dp(8.0f);
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null) {
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
        private int textY = AndroidUtilities.m34dp(8.0f);
        private int textY2;

        public BlockBlockquoteCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
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
                int dp = size - AndroidUtilities.m34dp(50.0f);
                int i4 = this.currentBlock.level;
                if (i4 > 0) {
                    dp -= AndroidUtilities.m34dp(i4 * 14);
                }
                ArticleViewer articleViewer = ArticleViewer.this;
                TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote = this.currentBlock;
                DrawingText createLayoutForText = articleViewer.createLayoutForText(this, null, tLRPC$TL_pageBlockBlockquote.text, dp, this.textY, tLRPC$TL_pageBlockBlockquote, this.parentAdapter);
                this.textLayout = createLayoutForText;
                i3 = createLayoutForText != null ? 0 + AndroidUtilities.m34dp(8.0f) + this.textLayout.getHeight() : 0;
                if (this.currentBlock.level > 0) {
                    if (this.parentAdapter.isRtl) {
                        this.textX = AndroidUtilities.m34dp((this.currentBlock.level * 14) + 14);
                    } else {
                        this.textX = AndroidUtilities.m34dp(this.currentBlock.level * 14) + AndroidUtilities.m34dp(32.0f);
                    }
                } else if (this.parentAdapter.isRtl) {
                    this.textX = AndroidUtilities.m34dp(14.0f);
                } else {
                    this.textX = AndroidUtilities.m34dp(32.0f);
                }
                int dp2 = i3 + AndroidUtilities.m34dp(8.0f);
                this.textY2 = dp2;
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TLRPC$TL_pageBlockBlockquote tLRPC$TL_pageBlockBlockquote2 = this.currentBlock;
                DrawingText createLayoutForText2 = articleViewer2.createLayoutForText(this, null, tLRPC$TL_pageBlockBlockquote2.caption, dp, dp2, tLRPC$TL_pageBlockBlockquote2, this.parentAdapter);
                this.textLayout2 = createLayoutForText2;
                if (createLayoutForText2 != null) {
                    i3 += AndroidUtilities.m34dp(8.0f) + this.textLayout2.getHeight();
                }
                if (i3 != 0) {
                    i3 += AndroidUtilities.m34dp(8.0f);
                }
                DrawingText drawingText = this.textLayout;
                if (drawingText != null) {
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                }
                DrawingText drawingText2 = this.textLayout2;
                if (drawingText2 != null) {
                    drawingText2.f1001x = this.textX;
                    drawingText2.f1002y = this.textY2;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            int measuredWidth;
            if (this.currentBlock != null) {
                int i2 = 0;
                if (this.textLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    i = 1;
                    ArticleViewer.this.drawTextSelection(canvas, this, 0);
                    this.textLayout.draw(canvas, this);
                    canvas.restore();
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
                if (this.parentAdapter.isRtl) {
                    canvas.drawRect(getMeasuredWidth() - AndroidUtilities.m34dp(20.0f), AndroidUtilities.m34dp(6.0f), measuredWidth + AndroidUtilities.m34dp(2.0f), getMeasuredHeight() - AndroidUtilities.m34dp(6.0f), ArticleViewer.quoteLinePaint);
                } else {
                    canvas.drawRect(AndroidUtilities.m34dp((this.currentBlock.level * 14) + 18), AndroidUtilities.m34dp(6.0f), AndroidUtilities.m34dp((this.currentBlock.level * 14) + 20), getMeasuredHeight() - AndroidUtilities.m34dp(6.0f), ArticleViewer.quoteLinePaint);
                }
                if (this.currentBlock.level > 0) {
                    float dp = AndroidUtilities.m34dp(18.0f);
                    float dp2 = AndroidUtilities.m34dp(20.0f);
                    int measuredHeight = getMeasuredHeight();
                    if (this.currentBlock.bottom) {
                        i2 = AndroidUtilities.m34dp(6.0f);
                    }
                    canvas.drawRect(dp, 0.0f, dp2, measuredHeight - i2, ArticleViewer.quoteLinePaint);
                }
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
        private ImageReceiver imageView = new ImageReceiver(this);
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
                this.linkDrawable = getResources().getDrawable(C0952R.C0953drawable.instant_link);
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
            if (this.parentAdapter.channelBlock != null && (this.parentBlock instanceof TLRPC$TL_pageBlockCover)) {
                this.channelCell.setBlock(this.parentAdapter.channelBlock);
                this.channelCell.setVisibility(0);
            }
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.BlockPhotoCell.onTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        @android.annotation.SuppressLint({"NewApi"})
        protected void onMeasure(int r28, int r29) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.BlockPhotoCell.onMeasure(int, int):void");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock != null) {
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
                    int measuredWidth = getMeasuredWidth() - AndroidUtilities.m34dp(35.0f);
                    int imageY = (int) (this.imageView.getImageY() + AndroidUtilities.m34dp(11.0f));
                    this.linkDrawable.setBounds(measuredWidth, imageY, AndroidUtilities.m34dp(24.0f) + measuredWidth, AndroidUtilities.m34dp(24.0f) + imageY);
                    this.linkDrawable.draw(canvas);
                }
                int i2 = 0;
                if (this.captionLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    i = 1;
                    ArticleViewer.this.drawTextSelection(canvas, this, 0);
                    this.captionLayout.draw(canvas, this);
                    canvas.restore();
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
                    float dp = AndroidUtilities.m34dp(18.0f);
                    float dp2 = AndroidUtilities.m34dp(20.0f);
                    int measuredHeight = getMeasuredHeight();
                    if (this.currentBlock.bottom) {
                        i2 = AndroidUtilities.m34dp(6.0f);
                    }
                    canvas.drawRect(dp, 0.0f, dp2, measuredHeight - i2, ArticleViewer.quoteLinePaint);
                }
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
            } else if (i == 1) {
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
            StringBuilder sb = new StringBuilder(LocaleController.getString("AttachPhoto", C0952R.string.AttachPhoto));
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
        private ImageReceiver imageView = new ImageReceiver(this);
        private boolean isFirst;
        private WebpageAdapter parentAdapter;
        private boolean photoPressed;
        private int textX;
        private int textY;

        public BlockMapCell(Context context, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
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
                    Activity activity = ArticleViewer.this.parentActivity;
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                } catch (Exception e) {
                    FileLog.m30e(e);
                }
            } else if (motionEvent.getAction() == 3) {
                this.photoPressed = false;
            }
            return this.photoPressed || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        @Override
        @android.annotation.SuppressLint({"NewApi"})
        protected void onMeasure(int r25, int r26) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.BlockMapCell.onMeasure(int, int):void");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i;
            if (this.currentBlock != null) {
                Theme.chat_docBackPaint.setColor(Theme.getColor("chat_inLocationBackground"));
                canvas.drawRect(this.imageView.getImageX(), this.imageView.getImageY(), this.imageView.getImageX2(), this.imageView.getImageY2(), Theme.chat_docBackPaint);
                int i2 = 0;
                int centerX = (int) (this.imageView.getCenterX() - (Theme.chat_locationDrawable[0].getIntrinsicWidth() / 2));
                int centerY = (int) (this.imageView.getCenterY() - (Theme.chat_locationDrawable[0].getIntrinsicHeight() / 2));
                Drawable[] drawableArr = Theme.chat_locationDrawable;
                drawableArr[0].setBounds(centerX, centerY, drawableArr[0].getIntrinsicWidth() + centerX, Theme.chat_locationDrawable[0].getIntrinsicHeight() + centerY);
                Theme.chat_locationDrawable[0].draw(canvas);
                this.imageView.draw(canvas);
                if (this.currentMapProvider == 2 && this.imageView.hasNotThumb()) {
                    int intrinsicWidth = (int) (Theme.chat_redLocationIcon.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (Theme.chat_redLocationIcon.getIntrinsicHeight() * 0.8f);
                    int imageX = (int) (this.imageView.getImageX() + ((this.imageView.getImageWidth() - intrinsicWidth) / 2.0f));
                    int imageY = (int) (this.imageView.getImageY() + ((this.imageView.getImageHeight() / 2.0f) - intrinsicHeight));
                    Theme.chat_redLocationIcon.setAlpha((int) (this.imageView.getCurrentAlpha() * 255.0f));
                    Theme.chat_redLocationIcon.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                    Theme.chat_redLocationIcon.draw(canvas);
                }
                if (this.captionLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    i = 1;
                    ArticleViewer.this.drawTextSelection(canvas, this, 0);
                    this.captionLayout.draw(canvas, this);
                    canvas.restore();
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
                    float dp = AndroidUtilities.m34dp(18.0f);
                    float dp2 = AndroidUtilities.m34dp(20.0f);
                    int measuredHeight = getMeasuredHeight();
                    if (this.currentBlock.bottom) {
                        i2 = AndroidUtilities.m34dp(6.0f);
                    }
                    canvas.drawRect(dp, 0.0f, dp2, measuredHeight - i2, ArticleViewer.quoteLinePaint);
                }
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            StringBuilder sb = new StringBuilder(LocaleController.getString("Map", C0952R.string.Map));
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
        private int textX2;
        private int textX = AndroidUtilities.m34dp(18.0f);
        private int textY = AndroidUtilities.m34dp(11.0f);
        private Paint backgroundPaint = new Paint();

        public BlockChannelCell(Context context, WebpageAdapter webpageAdapter, int i) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
            this.currentType = i;
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 14.0f);
            this.textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            this.textView.setText(LocaleController.getString("ChannelJoin", C0952R.string.ChannelJoin));
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
            imageView.setImageResource(C0952R.C0953drawable.list_check);
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.imageView, LayoutHelper.createFrame(39, 39, 53));
            ContextProgressView contextProgressView = new ContextProgressView(context, 0);
            this.progressView = contextProgressView;
            addView(contextProgressView, LayoutHelper.createFrame(39, 39, 53));
        }

        public void lambda$new$0(View view) {
            if (this.currentState == 0) {
                setState(1, true);
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.joinChannel(this, articleViewer.loadedChannel);
            }
        }

        public void setBlock(TLRPC$TL_pageBlockChannel tLRPC$TL_pageBlockChannel) {
            this.currentBlock = tLRPC$TL_pageBlockChannel;
            if (this.currentType == 0) {
                int color = Theme.getColor("switchTrack");
                int red = Color.red(color);
                int green = Color.green(color);
                int blue = Color.blue(color);
                this.textView.setTextColor(ArticleViewer.this.getLinkTextColor());
                this.backgroundPaint.setColor(Color.argb(34, red, green, blue));
                this.imageView.setColorFilter(new PorterDuffColorFilter(ArticleViewer.getGrayTextColor(), PorterDuff.Mode.MULTIPLY));
            } else {
                this.textView.setTextColor(-1);
                this.backgroundPaint.setColor(2130706432);
                this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            }
            TLRPC$Chat chat = MessagesController.getInstance(ArticleViewer.this.currentAccount).getChat(Long.valueOf(tLRPC$TL_pageBlockChannel.channel.f854id));
            if (chat == null || chat.min) {
                ArticleViewer.this.loadChannel(this, this.parentAdapter, tLRPC$TL_pageBlockChannel.channel);
                setState(1, false);
            } else {
                ArticleViewer.this.loadedChannel = chat;
                if (!chat.left || chat.kicked) {
                    setState(4, false);
                } else {
                    setState(0, false);
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
            float f = 0.0f;
            float f2 = 0.1f;
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.currentAnimation = animatorSet2;
                Animator[] animatorArr = new Animator[9];
                TextView textView = this.textView;
                Property property = View.ALPHA;
                float[] fArr = new float[1];
                fArr[0] = i == 0 ? 1.0f : 0.0f;
                animatorArr[0] = ObjectAnimator.ofFloat(textView, property, fArr);
                TextView textView2 = this.textView;
                Property property2 = View.SCALE_X;
                float[] fArr2 = new float[1];
                fArr2[0] = i == 0 ? 1.0f : 0.1f;
                animatorArr[1] = ObjectAnimator.ofFloat(textView2, property2, fArr2);
                TextView textView3 = this.textView;
                Property property3 = View.SCALE_Y;
                float[] fArr3 = new float[1];
                fArr3[0] = i == 0 ? 1.0f : 0.1f;
                animatorArr[2] = ObjectAnimator.ofFloat(textView3, property3, fArr3);
                ContextProgressView contextProgressView = this.progressView;
                Property property4 = View.ALPHA;
                float[] fArr4 = new float[1];
                fArr4[0] = i == 1 ? 1.0f : 0.0f;
                animatorArr[3] = ObjectAnimator.ofFloat(contextProgressView, property4, fArr4);
                ContextProgressView contextProgressView2 = this.progressView;
                Property property5 = View.SCALE_X;
                float[] fArr5 = new float[1];
                fArr5[0] = i == 1 ? 1.0f : 0.1f;
                animatorArr[4] = ObjectAnimator.ofFloat(contextProgressView2, property5, fArr5);
                ContextProgressView contextProgressView3 = this.progressView;
                Property property6 = View.SCALE_Y;
                float[] fArr6 = new float[1];
                fArr6[0] = i == 1 ? 1.0f : 0.1f;
                animatorArr[5] = ObjectAnimator.ofFloat(contextProgressView3, property6, fArr6);
                ImageView imageView = this.imageView;
                Property property7 = View.ALPHA;
                float[] fArr7 = new float[1];
                if (i == 2) {
                    f = 1.0f;
                }
                fArr7[0] = f;
                animatorArr[6] = ObjectAnimator.ofFloat(imageView, property7, fArr7);
                ImageView imageView2 = this.imageView;
                Property property8 = View.SCALE_X;
                float[] fArr8 = new float[1];
                fArr8[0] = i == 2 ? 1.0f : 0.1f;
                animatorArr[7] = ObjectAnimator.ofFloat(imageView2, property8, fArr8);
                ImageView imageView3 = this.imageView;
                Property property9 = View.SCALE_Y;
                float[] fArr9 = new float[1];
                if (i == 2) {
                    f2 = 1.0f;
                }
                fArr9[0] = f2;
                animatorArr[8] = ObjectAnimator.ofFloat(imageView3, property9, fArr9);
                animatorSet2.playTogether(animatorArr);
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
            ImageView imageView4 = this.imageView;
            if (i == 2) {
                f = 1.0f;
            }
            imageView4.setAlpha(f);
            this.imageView.setScaleX(i == 2 ? 1.0f : 0.1f);
            ImageView imageView5 = this.imageView;
            if (i == 2) {
                f2 = 1.0f;
            }
            imageView5.setScaleY(f2);
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
            setMeasuredDimension(size, AndroidUtilities.m34dp(48.0f));
            this.textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(39.0f), 1073741824));
            this.buttonWidth = this.textView.getMeasuredWidth();
            this.progressView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(39.0f), 1073741824));
            this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(39.0f), 1073741824));
            TLRPC$TL_pageBlockChannel tLRPC$TL_pageBlockChannel = this.currentBlock;
            if (tLRPC$TL_pageBlockChannel != null) {
                this.textLayout = ArticleViewer.this.createLayoutForText(this, tLRPC$TL_pageBlockChannel.channel.title, null, (size - AndroidUtilities.m34dp(52.0f)) - this.buttonWidth, this.textY, this.currentBlock, StaticLayoutEx.ALIGN_LEFT(), this.parentAdapter);
                if (this.parentAdapter.isRtl) {
                    this.textX2 = this.textX;
                } else {
                    this.textX2 = (getMeasuredWidth() - this.textX) - this.buttonWidth;
                }
                DrawingText drawingText = this.textLayout;
                if (drawingText != null) {
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                }
            }
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.imageView.layout((this.textX2 + (this.buttonWidth / 2)) - AndroidUtilities.m34dp(19.0f), 0, this.textX2 + (this.buttonWidth / 2) + AndroidUtilities.m34dp(20.0f), AndroidUtilities.m34dp(39.0f));
            this.progressView.layout((this.textX2 + (this.buttonWidth / 2)) - AndroidUtilities.m34dp(19.0f), 0, this.textX2 + (this.buttonWidth / 2) + AndroidUtilities.m34dp(20.0f), AndroidUtilities.m34dp(39.0f));
            TextView textView = this.textView;
            int i5 = this.textX2;
            textView.layout(i5, 0, textView.getMeasuredWidth() + i5, this.textView.getMeasuredHeight());
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.m34dp(39.0f), this.backgroundPaint);
                DrawingText drawingText = this.textLayout;
                if (drawingText != null && drawingText.getLineCount() > 0) {
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

    public class BlockAuthorDateCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockAuthorDate currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX;
        private int textY = AndroidUtilities.m34dp(8.0f);

        public BlockAuthorDateCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
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
            Spannable spannable2;
            int indexOf;
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockAuthorDate tLRPC$TL_pageBlockAuthorDate = this.currentBlock;
            int i3 = 1;
            if (tLRPC$TL_pageBlockAuthorDate != null) {
                ArticleViewer articleViewer = ArticleViewer.this;
                WebpageAdapter webpageAdapter = this.parentAdapter;
                TLRPC$RichText tLRPC$RichText = tLRPC$TL_pageBlockAuthorDate.author;
                CharSequence text = articleViewer.getText(webpageAdapter, this, tLRPC$RichText, tLRPC$RichText, tLRPC$TL_pageBlockAuthorDate, size);
                MetricAffectingSpan[] metricAffectingSpanArr = null;
                if (text instanceof Spannable) {
                    Spannable spannable3 = (Spannable) text;
                    metricAffectingSpanArr = (MetricAffectingSpan[]) spannable3.getSpans(0, text.length(), MetricAffectingSpan.class);
                    spannable = spannable3;
                } else {
                    spannable = null;
                }
                if (this.currentBlock.published_date != 0 && !TextUtils.isEmpty(text)) {
                    spannable2 = LocaleController.formatString("ArticleDateByAuthor", C0952R.string.ArticleDateByAuthor, LocaleController.getInstance().chatFullDate.format(this.currentBlock.published_date * 1000), text);
                } else if (!TextUtils.isEmpty(text)) {
                    spannable2 = LocaleController.formatString("ArticleByAuthor", C0952R.string.ArticleByAuthor, text);
                } else {
                    spannable2 = LocaleController.getInstance().chatFullDate.format(this.currentBlock.published_date * 1000);
                }
                if (metricAffectingSpanArr != null) {
                    try {
                        if (metricAffectingSpanArr.length > 0 && (indexOf = TextUtils.indexOf(spannable2, text)) != -1) {
                            spannable2 = Spannable.Factory.getInstance().newSpannable(spannable2);
                            for (int i4 = 0; i4 < metricAffectingSpanArr.length; i4++) {
                                spannable2.setSpan(metricAffectingSpanArr[i4], spannable.getSpanStart(metricAffectingSpanArr[i4]) + indexOf, spannable.getSpanEnd(metricAffectingSpanArr[i4]) + indexOf, 33);
                            }
                        }
                    } catch (Exception e) {
                        FileLog.m30e(e);
                    }
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, spannable2, null, size - AndroidUtilities.m34dp(36.0f), this.textY, this.currentBlock, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = AndroidUtilities.m34dp(16.0f) + this.textLayout.getHeight() + 0;
                    if (this.parentAdapter.isRtl) {
                        this.textX = (int) Math.floor((size - this.textLayout.getLineWidth(0)) - AndroidUtilities.m34dp(16.0f));
                    } else {
                        this.textX = AndroidUtilities.m34dp(18.0f);
                    }
                    DrawingText drawingText = this.textLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                } else {
                    i3 = 0;
                }
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null && this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                accessibilityNodeInfo.setText(drawingText.getText());
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

    public class BlockTitleCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockTitle currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX = AndroidUtilities.m34dp(18.0f);
        private int textY;

        public BlockTitleCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
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
                i3 = 0;
                if (tLRPC$TL_pageBlockTitle.first) {
                    i3 = 0 + AndroidUtilities.m34dp(8.0f);
                    this.textY = AndroidUtilities.m34dp(16.0f);
                } else {
                    this.textY = AndroidUtilities.m34dp(8.0f);
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.text, size - AndroidUtilities.m34dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 += AndroidUtilities.m34dp(16.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null && this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.textLayout != null) {
                accessibilityNodeInfo.setText(((Object) this.textLayout.getText()) + ", " + LocaleController.getString("AccDescrIVTitle", C0952R.string.AccDescrIVTitle));
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

    public class BlockKickerCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockKicker currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX = AndroidUtilities.m34dp(18.0f);
        private int textY;

        public BlockKickerCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
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
                i3 = 0;
                if (tLRPC$TL_pageBlockKicker.first) {
                    this.textY = AndroidUtilities.m34dp(16.0f);
                    i3 = 0 + AndroidUtilities.m34dp(8.0f);
                } else {
                    this.textY = AndroidUtilities.m34dp(8.0f);
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.text, size - AndroidUtilities.m34dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 += AndroidUtilities.m34dp(16.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null && this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
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

    public class BlockFooterCell extends View implements TextSelectionHelper.ArticleSelectableView {
        private TLRPC$TL_pageBlockFooter currentBlock;
        private WebpageAdapter parentAdapter;
        private DrawingText textLayout;
        private int textX = AndroidUtilities.m34dp(18.0f);
        private int textY = AndroidUtilities.m34dp(8.0f);

        public BlockFooterCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
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
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockFooter tLRPC$TL_pageBlockFooter = this.currentBlock;
            int i4 = 0;
            if (tLRPC$TL_pageBlockFooter != null) {
                int i5 = tLRPC$TL_pageBlockFooter.level;
                if (i5 == 0) {
                    this.textY = AndroidUtilities.m34dp(8.0f);
                    this.textX = AndroidUtilities.m34dp(18.0f);
                } else {
                    this.textY = 0;
                    this.textX = AndroidUtilities.m34dp((i5 * 14) + 18);
                }
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, this.currentBlock.text, (size - AndroidUtilities.m34dp(18.0f)) - this.textX, this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    int height = createLayoutForText.getHeight();
                    if (this.currentBlock.level > 0) {
                        i3 = AndroidUtilities.m34dp(8.0f);
                    } else {
                        i3 = AndroidUtilities.m34dp(16.0f);
                    }
                    i4 = height + i3;
                    DrawingText drawingText = this.textLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                }
            } else {
                i4 = 1;
            }
            setMeasuredDimension(size, i4);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null) {
                if (this.textLayout != null) {
                    canvas.save();
                    canvas.translate(this.textX, this.textY);
                    ArticleViewer.this.drawTextSelection(canvas, this);
                    this.textLayout.draw(canvas, this);
                    canvas.restore();
                }
                if (this.currentBlock.level > 0) {
                    canvas.drawRect(AndroidUtilities.m34dp(18.0f), 0.0f, AndroidUtilities.m34dp(20.0f), getMeasuredHeight() - (this.currentBlock.bottom ? AndroidUtilities.m34dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
                }
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
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context, ArticleViewer.this) {
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
            horizontalScrollView.setPadding(0, AndroidUtilities.m34dp(8.0f), 0, AndroidUtilities.m34dp(8.0f));
            addView(this.scrollView, LayoutHelper.createFrame(-1, -2.0f));
            this.textContainer = new View(context, ArticleViewer.this) {
                @Override
                protected void onMeasure(int i, int i2) {
                    int i3 = 0;
                    int i4 = 1;
                    if (BlockPreformattedCell.this.currentBlock != null) {
                        BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                        blockPreformattedCell.textLayout = ArticleViewer.this.createLayoutForText(this, null, blockPreformattedCell.currentBlock.text, AndroidUtilities.m34dp(5000.0f), 0, BlockPreformattedCell.this.currentBlock, BlockPreformattedCell.this.parentAdapter);
                        if (BlockPreformattedCell.this.textLayout != null) {
                            i3 = BlockPreformattedCell.this.textLayout.getHeight() + 0;
                            int lineCount = BlockPreformattedCell.this.textLayout.getLineCount();
                            while (i3 < lineCount) {
                                i4 = Math.max((int) Math.ceil(BlockPreformattedCell.this.textLayout.getLineWidth(i3)), i4);
                                i3++;
                            }
                        }
                    } else {
                        i3 = 1;
                    }
                    setMeasuredDimension(i4 + AndroidUtilities.m34dp(32.0f), i3);
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
                        BlockPreformattedCell.this.textLayout.f1001x = (int) getX();
                        BlockPreformattedCell.this.textLayout.f1002y = (int) getY();
                    }
                }
            };
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
            int dp = AndroidUtilities.m34dp(16.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
            int dp2 = AndroidUtilities.m34dp(12.0f);
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
            if (articleTextSelectionHelper != null && articleTextSelectionHelper.isSelectionMode()) {
                ArticleViewer.this.textSelectionHelper.invalidate();
            }
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
            if (this.currentBlock != null) {
                canvas.drawRect(0.0f, AndroidUtilities.m34dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.m34dp(8.0f), ArticleViewer.preformattedBackgroundPaint);
            }
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
        private int textX = AndroidUtilities.m34dp(18.0f);
        private int textY = AndroidUtilities.m34dp(8.0f);

        public BlockSubheaderCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
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
            int size = View.MeasureSpec.getSize(i);
            TLRPC$TL_pageBlockSubheader tLRPC$TL_pageBlockSubheader = this.currentBlock;
            int i3 = 0;
            if (tLRPC$TL_pageBlockSubheader != null) {
                DrawingText createLayoutForText = ArticleViewer.this.createLayoutForText(this, null, tLRPC$TL_pageBlockSubheader.text, size - AndroidUtilities.m34dp(36.0f), this.textY, this.currentBlock, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.textLayout = createLayoutForText;
                if (createLayoutForText != null) {
                    i3 = 0 + AndroidUtilities.m34dp(16.0f) + this.textLayout.getHeight();
                    DrawingText drawingText = this.textLayout;
                    drawingText.f1001x = this.textX;
                    drawingText.f1002y = this.textY;
                }
            } else {
                i3 = 1;
            }
            setMeasuredDimension(size, i3);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.currentBlock != null && this.textLayout != null) {
                canvas.save();
                canvas.translate(this.textX, this.textY);
                ArticleViewer.this.drawTextSelection(canvas, this);
                this.textLayout.draw(canvas, this);
                canvas.restore();
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            if (this.textLayout != null) {
                accessibilityNodeInfo.setText(((Object) this.textLayout.getText()) + ", " + LocaleController.getString("AccDescrIVHeading", C0952R.string.AccDescrIVHeading));
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

    public static class ReportCell extends FrameLayout {
        private boolean hasViews;
        private TextView textView;
        private TextView viewsTextView;

        public ReportCell(Context context) {
            super(context);
            setTag(90);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setText(LocaleController.getString("PreviewFeedback2", C0952R.string.PreviewFeedback2));
            this.textView.setTextSize(1, 12.0f);
            this.textView.setGravity(17);
            this.textView.setPadding(AndroidUtilities.m34dp(18.0f), 0, AndroidUtilities.m34dp(18.0f), 0);
            addView(this.textView, LayoutHelper.createFrame(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.viewsTextView = textView2;
            textView2.setTextSize(1, 12.0f);
            this.viewsTextView.setGravity(19);
            this.viewsTextView.setPadding(AndroidUtilities.m34dp(18.0f), 0, AndroidUtilities.m34dp(18.0f), 0);
            addView(this.viewsTextView, LayoutHelper.createFrame(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(44.0f), 1073741824));
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
            int color = Theme.getColor("switchTrack");
            this.textView.setTextColor(ArticleViewer.getGrayTextColor());
            this.viewsTextView.setTextColor(ArticleViewer.getGrayTextColor());
            this.textView.setBackgroundColor(Color.argb(34, Color.red(color), Color.green(color), Color.blue(color)));
        }
    }

    public void drawTextSelection(Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView) {
        drawTextSelection(canvas, articleSelectableView, 0);
    }

    public void drawTextSelection(Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView, int i) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
        View view = (View) articleSelectableView;
        if (view.getTag() == null || view.getTag() != "bottomSheet" || (articleTextSelectionHelper = this.textSelectionHelperBottomSheet) == null) {
            this.textSelectionHelper.draw(canvas, articleSelectableView, i);
        } else {
            articleTextSelectionHelper.draw(canvas, articleSelectableView, i);
        }
    }

    public boolean openPhoto(TLRPC$PageBlock tLRPC$PageBlock, WebpageAdapter webpageAdapter) {
        List list;
        int i;
        if (!(tLRPC$PageBlock instanceof TLRPC$TL_pageBlockVideo) || WebPageUtils.isVideo(webpageAdapter.currentPage, tLRPC$PageBlock)) {
            ArrayList arrayList = new ArrayList(webpageAdapter.photoBlocks);
            i = webpageAdapter.photoBlocks.indexOf(tLRPC$PageBlock);
            list = arrayList;
        } else {
            list = Collections.singletonList(tLRPC$PageBlock);
            i = 0;
        }
        PhotoViewer photoViewer = PhotoViewer.getInstance();
        photoViewer.setParentActivity(this.parentActivity);
        return photoViewer.openPhoto(i, new RealPageBlocksAdapter(webpageAdapter.currentPage, list), new PageBlocksPhotoViewerProvider(list));
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
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ArticleViewer.RealPageBlocksAdapter.getCaption(int):java.lang.CharSequence");
        }

        @Override
        public TLRPC$PhotoSize getFileLocation(TLObject tLObject, int[] iArr) {
            TLRPC$PhotoSize closestPhotoSizeWithSize;
            if (tLObject instanceof TLRPC$Photo) {
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(((TLRPC$Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize2 != null) {
                    iArr[0] = closestPhotoSizeWithSize2.size;
                    if (iArr[0] == 0) {
                        iArr[0] = -1;
                    }
                    return closestPhotoSizeWithSize2;
                }
                iArr[0] = -1;
                return null;
            } else if (!(tLObject instanceof TLRPC$Document) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC$Document) tLObject).thumbs, 90)) == null) {
                return null;
            } else {
                iArr[0] = closestPhotoSizeWithSize.size;
                if (iArr[0] == 0) {
                    iArr[0] = -1;
                }
                return closestPhotoSizeWithSize;
            }
        }

        @Override
        public void updateSlideshowCell(TLRPC$PageBlock tLRPC$PageBlock) {
            int childCount = ArticleViewer.this.listView[0].getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ArticleViewer.this.listView[0].getChildAt(i);
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
            if (i < 0 || i >= this.pageBlocks.size() || (imageReceiverFromListView = getImageReceiverFromListView(ArticleViewer.this.listView[0], this.pageBlocks.get(i), this.tempArr)) == null) {
                return null;
            }
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            int[] iArr = this.tempArr;
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1];
            placeProviderObject.parentView = ArticleViewer.this.listView[0];
            placeProviderObject.imageReceiver = imageReceiverFromListView;
            placeProviderObject.thumb = imageReceiverFromListView.getBitmapSafe();
            placeProviderObject.radius = imageReceiverFromListView.getRoundRadius();
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
            if (view instanceof BlockPhotoCell) {
                BlockPhotoCell blockPhotoCell = (BlockPhotoCell) view;
                if (blockPhotoCell.currentBlock != tLRPC$PageBlock) {
                    return null;
                }
                view.getLocationInWindow(iArr);
                return blockPhotoCell.imageView;
            } else if (view instanceof BlockVideoCell) {
                BlockVideoCell blockVideoCell = (BlockVideoCell) view;
                if (blockVideoCell.currentBlock != tLRPC$PageBlock) {
                    return null;
                }
                view.getLocationInWindow(iArr);
                return blockVideoCell.imageView;
            } else if (view instanceof BlockCollageCell) {
                ImageReceiver imageReceiverFromListView = getImageReceiverFromListView(((BlockCollageCell) view).innerListView, tLRPC$PageBlock, iArr);
                if (imageReceiverFromListView != null) {
                    return imageReceiverFromListView;
                }
                return null;
            } else if (view instanceof BlockSlideshowCell) {
                ImageReceiver imageReceiverFromListView2 = getImageReceiverFromListView(((BlockSlideshowCell) view).innerListView, tLRPC$PageBlock, iArr);
                if (imageReceiverFromListView2 != null) {
                    return imageReceiverFromListView2;
                }
                return null;
            } else if (view instanceof BlockListItemCell) {
                BlockListItemCell blockListItemCell = (BlockListItemCell) view;
                if (blockListItemCell.blockLayout == null || (imageReceiverView2 = getImageReceiverView(blockListItemCell.blockLayout.itemView, tLRPC$PageBlock, iArr)) == null) {
                    return null;
                }
                return imageReceiverView2;
            } else if (!(view instanceof BlockOrderedListItemCell)) {
                return null;
            } else {
                BlockOrderedListItemCell blockOrderedListItemCell = (BlockOrderedListItemCell) view;
                if (blockOrderedListItemCell.blockLayout == null || (imageReceiverView = getImageReceiverView(blockOrderedListItemCell.blockLayout.itemView, tLRPC$PageBlock, iArr)) == null) {
                    return null;
                }
                return imageReceiverView;
            }
        }
    }
}
