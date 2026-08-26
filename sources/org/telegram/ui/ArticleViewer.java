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
import android.database.DataSetObserver;
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
import android.graphics.drawable.BitmapDrawable;
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
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import j$.util.Objects;
import java.io.File;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.FBool;
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
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
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
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.iv.Latex;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.BookmarksFragment;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.SearchEngine;
import org.telegram.ui.web.WebActionBar;
import org.telegram.ui.web.WebBrowserSettings;
import org.telegram.ui.web.WebInstantView;
import org.telegram.ui.web.WebInstantView$Loader$$ExternalSyntheticLambda0;

public class ArticleViewer extends IArticleViewer implements NotificationCenter.NotificationCenterDelegate {
    public static final boolean BOTTOM_ACTION_BAR = false;
    public static final int TEXT_FLAG_ITALIC = 2;
    public static final int TEXT_FLAG_MARKED = 64;
    public static final int TEXT_FLAG_MEDIUM = 1;
    public static final int TEXT_FLAG_MONO = 4;
    public static final int TEXT_FLAG_REGULAR = 0;
    public static final int TEXT_FLAG_STRIKE = 32;
    public static final int TEXT_FLAG_SUB = 128;
    public static final int TEXT_FLAG_SUP = 256;
    public static final int TEXT_FLAG_UNDERLINE = 16;
    public static final int TEXT_FLAG_URL = 8;
    public static final int TEXT_FLAG_WEBPAGE_URL = 512;
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
    private Drawable chat_redLocationIcon;
    private boolean checkingForLongPress;
    private boolean closeAnimationInProgress;
    private boolean collapsed;
    private FrameLayout containerView;
    private ArrayList<BlockEmbedCell> createdWebViews;
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
    public final ArrayList<Object> pagesStack;
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
    private Paint statusBarPaint;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
    TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelperBottomSheet;
    private long transitionAnimationStartTime;
    private Dialog visibleDialog;
    private WindowManager.LayoutParams windowLayoutParams;
    private WindowView windowView;
    public static HashSet<ArticleViewer> activeSheets = new HashSet<>();
    private static volatile ArticleViewer Instance = null;
    public static final Property<WindowView, Float> ARTICLE_VIEWER_INNER_TRANSLATION_X = new AnimationProperties.FloatProperty<WindowView>("innerTranslationX") {
        @Override
        public Float get(WindowView windowView) {
            return Float.valueOf(windowView.getInnerTranslationX());
        }

        @Override
        public void setValue(WindowView windowView, float f) {
            windowView.setInnerTranslationX(f);
        }
    };
    private static final TextPaint audioTimePaint = new TextPaint(1);
    private static final Resources resources = new Resources(false);
    private static final WeakHashMap<View, ArrayList<DrawingText>> liveDrawingTexts = new WeakHashMap<>();

    public class AnonymousClass26 extends AnimatorListenerAdapter {
        public AnonymousClass26() {
        }

        public void lambda$onAnimationEnd$0() {
            ArticleViewer.this.notificationsLocker.unlock();
            if (ArticleViewer.this.animationEndRunnable != null) {
                ArticleViewer.this.animationEndRunnable.run();
                ArticleViewer.this.animationEndRunnable = null;
            }
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AndroidUtilities.runOnUIThread(new ChatActivity$21$$ExternalSyntheticLambda4(this, 1));
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
            seekBar.setDelegate(new PhotoViewer$$ExternalSyntheticLambda96(this, 2));
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

        public void lambda$new$0(float f) {
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject == null) {
                return;
            }
            messageObject.audioProgress = f;
            MediaController.getInstance().seekToProgress(this.currentMessageObject, f);
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

        public MessageObject getMessageObject() {
            return this.currentMessageObject;
        }

        @Override
        public int getObserverTag() {
            return this.TAG;
        }

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
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
        public void onDraw(Canvas canvas) {
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
                canvas.translate(AndroidUtilities.dp(54.0f) + this.buttonX, AndroidUtilities.dp(6.0f) + this.seekBarY);
                this.durationLayout.draw(canvas);
                canvas.restore();
            }
            int i = 0;
            if (this.titleLayout != null) {
                canvas.save();
                this.titleLayout.x = AndroidUtilities.dp(54.0f) + this.buttonX;
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

        @Override
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(true);
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

        @Override
        public void onMeasure(int i, int i2) {
            int iDp;
            SpannableStringBuilder spannableStringBuilder;
            int size = View.MeasureSpec.getSize(i);
            int iDp2 = AndroidUtilities.dp(54.0f);
            TL_iv.pageBlockAudio pageblockaudio = this.currentBlock;
            if (pageblockaudio != null) {
                int i3 = pageblockaudio.level;
                if (i3 > 0) {
                    this.textX = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i3 * 14);
                } else {
                    this.textX = AndroidUtilities.dp(18.0f);
                }
                int iDp3 = (size - this.textX) - AndroidUtilities.dp(18.0f);
                int iDp4 = AndroidUtilities.dp(44.0f);
                this.buttonX = AndroidUtilities.dp(16.0f);
                int iDp5 = AndroidUtilities.dp(5.0f);
                this.buttonY = iDp5;
                RadialProgress2 radialProgress2 = this.radialProgress;
                int i4 = this.buttonX;
                radialProgress2.setProgressRect(i4, iDp5, i4 + iDp4, iDp5 + iDp4);
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.pageBlockAudio pageblockaudio2 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockaudio2.caption.text, iDp3, this.textY, pageblockaudio2, this.adapter);
                this.captionLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int height = this.captionLayout.getHeight() + AndroidUtilities.dp(8.0f);
                    this.creditOffset = height;
                    iDp2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(8.0f, height, iDp2);
                }
                iDp = iDp2;
                IArticleViewer iArticleViewer2 = this.parent;
                TL_iv.pageBlockAudio pageblockaudio3 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, null, pageblockaudio3.caption.credit, iDp3, this.creditOffset + this.textY, pageblockaudio3, this.adapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, 0, this.adapter);
                this.creditLayout = drawingTextCreateLayoutForText2;
                if (drawingTextCreateLayoutForText2 != null) {
                    iDp += this.creditLayout.getHeight() + AndroidUtilities.dp(4.0f);
                }
                if (!this.isFirst && this.currentBlock.level <= 0) {
                    iDp += AndroidUtilities.dp(8.0f);
                }
                String musicAuthor = this.currentMessageObject.getMusicAuthor(false);
                String musicTitle = this.currentMessageObject.getMusicTitle(false);
                int iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(50.0f, this.buttonX, iDp4);
                this.seekBarX = iM;
                int iDp6 = (size - iM) - AndroidUtilities.dp(18.0f);
                if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                    this.titleLayout = null;
                    this.seekBarY = ((iDp4 - AndroidUtilities.dp(30.0f)) / 2) + this.buttonY;
                } else {
                    if (TextUtils.isEmpty(musicTitle) || TextUtils.isEmpty(musicAuthor)) {
                        spannableStringBuilder = !TextUtils.isEmpty(musicTitle) ? new SpannableStringBuilder(musicTitle) : new SpannableStringBuilder(musicAuthor);
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(zzjx.m(musicAuthor, " - ", musicTitle));
                    }
                    if (!TextUtils.isEmpty(musicAuthor)) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, musicAuthor.length(), 18);
                    }
                    CharSequence charSequenceEllipsize = TextUtils.ellipsize(spannableStringBuilder, Theme.chat_audioTitlePaint, iDp6, TextUtils.TruncateAt.END);
                    DrawingText drawingText = new DrawingText(this.parent);
                    this.titleLayout = drawingText;
                    drawingText.textLayout = new StaticLayout(charSequenceEllipsize, ArticleViewer.audioTimePaint, iDp6, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.titleLayout.parentBlock = this.currentBlock;
                    this.seekBarY = AndroidUtilities.dp(11.0f) + ((iDp4 - AndroidUtilities.dp(30.0f)) / 2) + this.buttonY;
                }
                this.seekBar.setSize(iDp6, AndroidUtilities.dp(30.0f));
            } else {
                iDp = 1;
            }
            setMeasuredDimension(size, iDp);
            updatePlayingMessageProgress();
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
            if (this.buttonState != 3) {
                updateButtonState(true);
            }
        }

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        @Override
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            updateButtonState(true);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.seekBar.onTouch(motionEvent.getAction(), motionEvent.getX() - this.seekBarX, motionEvent.getY() - this.seekBarY)) {
                if (motionEvent.getAction() == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
            if (motionEvent.getAction() == 0) {
                if (this.buttonState != -1) {
                    int i = this.buttonX;
                    if (x >= i && x <= AndroidUtilities.dp(48.0f) + i) {
                        int i2 = this.buttonY;
                        if (y >= i2 && y <= AndroidUtilities.dp(48.0f) + i2) {
                            this.buttonPressed = 1;
                            invalidate();
                        } else if (this.buttonState == 0) {
                            this.buttonPressed = 1;
                            invalidate();
                        }
                    } else if (this.buttonState == 0) {
                        this.buttonPressed = 1;
                        invalidate();
                    }
                } else if (this.buttonState == 0) {
                    this.buttonPressed = 1;
                    invalidate();
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.buttonPressed == 1) {
                    this.buttonPressed = 0;
                    playSoundEffect(0);
                    didPressedButton(true);
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.buttonPressed = 0;
            }
            return this.buttonPressed != 0 || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
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
                if (FileLoader.getInstance(currentAccount).isLoadingFile(attachFileName)) {
                    this.buttonState = 3;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        this.radialProgress.setProgress(fileProgress.floatValue(), z);
                    } else {
                        this.radialProgress.setProgress(0.0f, z);
                    }
                    this.radialProgress.setIcon(getIconForCurrentState(), true, z);
                } else {
                    this.buttonState = 2;
                    this.radialProgress.setProgress(0.0f, z);
                    this.radialProgress.setIcon(getIconForCurrentState(), false, z);
                }
            }
            updatePlayingMessageProgress();
        }

        public void updatePlayingMessageProgress() {
            int i;
            if (this.currentDocument == null || this.currentMessageObject == null) {
                return;
            }
            if (!this.seekBar.isDragging()) {
                this.seekBar.setProgress(this.currentMessageObject.audioProgress);
            }
            if (MediaController.getInstance().isPlayingMessage(this.currentMessageObject)) {
                i = this.currentMessageObject.audioProgressSec;
            } else {
                i = 0;
                for (int i2 = 0; i2 < this.currentDocument.attributes.size(); i2++) {
                    TLRPC.DocumentAttribute documentAttribute = this.currentDocument.attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        i = (int) documentAttribute.duration;
                        break;
                    }
                }
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
    }

    public static class BlockAuthorDateCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockAuthorDate currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockAuthorDateCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.textY = AndroidUtilities.dp(8.0f);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.getBoundLeft() + drawingText.x) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getBoundRight() + drawingText.x;
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getLastLineBoundRight() + drawingText.x;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
        public void onMeasure(int i, int i2) {
            int i3;
            Spannable spannable;
            MetricAffectingSpan[] metricAffectingSpanArr;
            String str;
            String string;
            ?? NewSpannable;
            int iIndexOf;
            String string2;
            int i4 = 0;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockAuthorDate pageblockauthordate = this.currentBlock;
            if (pageblockauthordate != null) {
                IArticleViewer iArticleViewer = this.parent;
                WebpageAdapter webpageAdapter = this.adapter;
                TL_iv.RichText richText = pageblockauthordate.author;
                CharSequence text = ArticleViewer.getText(iArticleViewer, webpageAdapter, this, richText, richText, pageblockauthordate, size);
                i3 = size;
                if (text instanceof Spannable) {
                    spannable = (Spannable) text;
                    metricAffectingSpanArr = (MetricAffectingSpan[]) spannable.getSpans(0, text.length(), MetricAffectingSpan.class);
                } else {
                    spannable = null;
                    metricAffectingSpanArr = null;
                }
                if (this.currentBlock.published_date != 0 && !TextUtils.isEmpty(text)) {
                    string2 = LocaleController.formatString(R.string.ArticleDateByAuthor, LocaleController.getInstance().getChatFullDate().format(((long) this.currentBlock.published_date) * 1000), text);
                } else if (TextUtils.isEmpty(text)) {
                    str = LocaleController.getInstance().getChatFullDate().format(((long) this.currentBlock.published_date) * 1000);
                } else {
                    string = LocaleController.formatString(R.string.ArticleByAuthor, text);
                }
                if (metricAffectingSpanArr != null) {
                    try {
                        NewSpannable = str;
                        NewSpannable = string;
                        NewSpannable = string2;
                        if (metricAffectingSpanArr.length > 0 && (iIndexOf = TextUtils.indexOf((CharSequence) NewSpannable, text)) != -1) {
                            NewSpannable = Spannable.Factory.getInstance().newSpannable(NewSpannable);
                            for (int i5 = 0; i5 < metricAffectingSpanArr.length; i5++) {
                                MetricAffectingSpan metricAffectingSpan = metricAffectingSpanArr[i5];
                                NewSpannable.setSpan(metricAffectingSpan, spannable.getSpanStart(metricAffectingSpan) + iIndexOf, spannable.getSpanEnd(metricAffectingSpanArr[i5]) + iIndexOf, 33);
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                NewSpannable = str;
                NewSpannable = string;
                NewSpannable = string2;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(this.parent, this, (CharSequence) NewSpannable, (TL_iv.RichText) null, i3 - AndroidUtilities.dp(36.0f), this.textY, this.currentBlock, this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int height = this.textLayout.getHeight() + AndroidUtilities.dp(16.0f);
                    WebpageAdapter webpageAdapter2 = this.adapter;
                    if (webpageAdapter2 == null || !webpageAdapter2.isRtl) {
                        this.textX = AndroidUtilities.dp(18.0f);
                    } else {
                        this.textX = (int) Math.floor(((i3 - this.textLayout.getLineLeft(0)) - this.textLayout.getLineWidth(0)) - AndroidUtilities.dp(16.0f));
                    }
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                    i4 = height;
                }
            } else {
                i3 = size;
                i4 = 1;
            }
            setMeasuredDimension(i3, i4);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockAuthorDate pageblockauthordate) {
            this.currentBlock = pageblockauthordate;
            requestLayout();
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

        public BlockBlockquoteCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
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

        @Override
        public int getBoundLeft() {
            int iMin;
            int iDp = AndroidUtilities.dp(this.parent.padx());
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                iMin = Math.min(Integer.MAX_VALUE, (drawingText.getBoundLeft() + drawingText.x) - iDp);
            } else {
                iMin = Integer.MAX_VALUE;
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                iMin = Math.min(iMin, (drawingText2.getBoundLeft() + drawingText2.x) - iDp);
            }
            if (iMin == Integer.MAX_VALUE) {
                return -1;
            }
            return iMin - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            int iMax;
            int iDp = AndroidUtilities.dp(this.parent.padx());
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                iMax = Math.max(Integer.MIN_VALUE, drawingText.getBoundRight() + drawingText.x + iDp);
            } else {
                iMax = Integer.MIN_VALUE;
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                iMax = Math.max(iMax, drawingText2.getBoundRight() + drawingText2.x + iDp);
            }
            if (iMax == Integer.MIN_VALUE) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + iMax;
        }

        @Override
        public int getLastLineBoundRight() {
            int lastLineBoundRight;
            int iDp;
            DrawingText drawingText = this.textLayout2;
            if (drawingText != null) {
                lastLineBoundRight = drawingText.getLastLineBoundRight() + drawingText.x;
                iDp = AndroidUtilities.dp(this.parent.padx());
            } else {
                DrawingText drawingText2 = this.textLayout;
                if (drawingText2 == null) {
                    return -1;
                }
                lastLineBoundRight = drawingText2.getLastLineBoundRight() + drawingText2.x;
                iDp = AndroidUtilities.dp(this.parent.padx());
            }
            return iDp + lastLineBoundRight;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
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

        @Override
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
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
                canvas2 = canvas;
                canvas2.drawRect(AndroidUtilities.dp((this.currentBlock.level * 14) + this.parent.padx()), AndroidUtilities.dp(6.0f), AndroidUtilities.dp((this.currentBlock.level * 14) + this.parent.padx() + 2), getMeasuredHeight() - AndroidUtilities.dp(6.0f), ArticleViewer.quoteLinePaint);
            } else {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(20.0f);
                canvas2 = canvas;
                canvas2.drawRect(measuredWidth, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + measuredWidth, getMeasuredHeight() - AndroidUtilities.dp(6.0f), ArticleViewer.quoteLinePaint);
            }
            ArticleViewer.drawQuoteLines(canvas2, this.parent, this.currentBlock, getMeasuredHeight());
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
        public void onMeasure(int i, int i2) {
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            this.textY = AndroidUtilities.dp(this.parent.pady());
            if (this.currentBlock != null) {
                int iDp2 = size - AndroidUtilities.dp((this.parent.padx() * 2) + 14);
                int i3 = this.currentBlock.level;
                if (i3 > 0) {
                    iDp2 -= AndroidUtilities.dp(i3 * 14);
                }
                int i4 = iDp2;
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.pageBlockBlockquote pageblockblockquote = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockblockquote.text, i4, this.textY, pageblockblockquote, this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    iDp = this.textLayout.getHeight() + AndroidUtilities.dp(this.parent.pady());
                } else {
                    iDp = 0;
                }
                if (this.currentBlock.level > 0) {
                    WebpageAdapter webpageAdapter = this.adapter;
                    if (webpageAdapter == null || !webpageAdapter.isRtl) {
                        this.textX = AndroidUtilities.dp(this.parent.padx() + 14) + AndroidUtilities.dp(this.currentBlock.level * 14);
                    } else {
                        this.textX = AndroidUtilities.dp((this.currentBlock.level * 14) + 14);
                    }
                } else {
                    WebpageAdapter webpageAdapter2 = this.adapter;
                    if (webpageAdapter2 == null || !webpageAdapter2.isRtl) {
                        this.textX = AndroidUtilities.dp(this.parent.padx() + 14);
                    } else {
                        this.textX = AndroidUtilities.dp(14.0f);
                    }
                }
                int iDp3 = AndroidUtilities.dp(this.parent.pady()) + iDp;
                this.textY2 = iDp3;
                IArticleViewer iArticleViewer2 = this.parent;
                TL_iv.pageBlockBlockquote pageblockblockquote2 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, pageblockblockquote2.caption, i4, iDp3, pageblockblockquote2, this.adapter);
                this.textLayout2 = drawingTextCreateLayoutForText2;
                if (drawingTextCreateLayoutForText2 != null) {
                    iDp += this.textLayout2.getHeight() + AndroidUtilities.dp(this.parent.pady());
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
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout2, this.textX, this.textY2) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockBlockquote pageblockblockquote) {
            this.currentBlock = pageblockblockquote;
            requestLayout();
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

        public BlockChannelCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, int i) {
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
            this.textView.setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda53(12, this, iArticleViewer));
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

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
            if (webpageAdapter == null || !webpageAdapter.isRtl) {
                canvas.translate(this.textX, this.textY);
            } else {
                canvas.translate((getMeasuredWidth() - this.textLayout.getLineWidth(0)) - this.textX, this.textY);
            }
            if (this.currentType == 0) {
                ArticleViewer.drawTextSelection(this.parent, canvas, this);
            }
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
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrChannel));
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.imageView.layout(((this.buttonWidth / 2) + this.textX2) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.buttonWidth / 2) + this.textX2, AndroidUtilities.dp(39.0f));
            this.progressView.layout(((this.buttonWidth / 2) + this.textX2) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.buttonWidth / 2) + this.textX2, AndroidUtilities.dp(39.0f));
            TextView textView = this.textView;
            int i5 = this.textX2;
            textView.layout(i5, 0, textView.getMeasuredWidth() + i5, this.textView.getMeasuredHeight());
        }

        @Override
        public void onMeasure(int i, int i2) {
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
                if (webpageAdapter == null || !webpageAdapter.isRtl) {
                    this.textX2 = (getMeasuredWidth() - this.textX) - this.buttonWidth;
                } else {
                    this.textX2 = this.textX;
                }
                DrawingText drawingText = this.textLayout;
                if (drawingText != null) {
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.currentType != 0) {
                return super.onTouchEvent(motionEvent);
            }
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
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
            if (!z) {
                this.textView.setAlpha(i == 0 ? 1.0f : 0.0f);
                this.textView.setScaleX(i == 0 ? 1.0f : 0.1f);
                this.textView.setScaleY(i == 0 ? 1.0f : 0.1f);
                this.progressView.setAlpha(i == 1 ? 1.0f : 0.0f);
                this.progressView.setScaleX(i == 1 ? 1.0f : 0.1f);
                this.progressView.setScaleY(i == 1 ? 1.0f : 0.1f);
                this.imageView.setAlpha(i == 2 ? 1.0f : 0.0f);
                this.imageView.setScaleX(i == 2 ? 1.0f : 0.1f);
                this.imageView.setScaleY(i == 2 ? 1.0f : 0.1f);
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            TextView textView = this.textView;
            float[] fArr = {i == 0 ? 1.0f : 0.0f};
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr);
            TextView textView2 = this.textView;
            float[] fArr2 = {i == 0 ? 1.0f : 0.1f};
            Property property2 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr2);
            TextView textView3 = this.textView;
            float[] fArr3 = {i == 0 ? 1.0f : 0.1f};
            Property property3 = View.SCALE_Y;
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, fArr3), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property, i == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property2, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property3, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.imageView, (Property<ImageView, Float>) property, i == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.imageView, (Property<ImageView, Float>) property2, i == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(this.imageView, (Property<ImageView, Float>) property3, i == 2 ? 1.0f : 0.1f));
            this.currentAnimation.setDuration(150L);
            this.currentAnimation.start();
        }
    }

    public class BlockCollageCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
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
                    rect.bottom = 0;
                    MessageObject.GroupedMessagePosition groupedMessagePosition = view instanceof BlockPhotoCell ? BlockCollageCell.this.group.positions.get(((BlockPhotoCell) view).currentBlock) : view instanceof BlockVideoCell ? BlockCollageCell.this.group.positions.get(((BlockVideoCell) view).currentBlock) : null;
                    if (groupedMessagePosition == null || groupedMessagePosition.siblingHeights == null) {
                        return;
                    }
                    Point point = AndroidUtilities.displaySize;
                    float fMax = Math.max(point.x, point.y) * 0.5f;
                    int i = 0;
                    int iCeil = 0;
                    while (true) {
                        float[] fArr = groupedMessagePosition.siblingHeights;
                        if (i >= fArr.length) {
                            break;
                        }
                        iCeil += (int) Math.ceil(fArr[i] * fMax);
                        i++;
                    }
                    int iDp2 = (AndroidUtilities.dp2(11.0f) * (groupedMessagePosition.maxY - groupedMessagePosition.minY)) + iCeil;
                    int size = BlockCollageCell.this.group.posArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition2 = BlockCollageCell.this.group.posArray.get(i2);
                        byte b = groupedMessagePosition2.minY;
                        byte b2 = groupedMessagePosition.minY;
                        if (b == b2 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b != b2 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b == b2)) {
                            iDp2 -= ((int) Math.ceil(fMax * groupedMessagePosition2.ph)) - AndroidUtilities.dp(4.0f);
                            break;
                        }
                    }
                    rect.bottom = -iDp2;
                }
            });
            GridLayoutManagerFixed gridLayoutManagerFixed = new GridLayoutManagerFixed(context, 1000, 1, true, ArticleViewer.this) {
                final ArticleViewer val$this$0;

                {
                    super(i, i, z);
                    this.val$this$0 = articleViewer;
                }

                @Override
                public boolean hasSiblingChild(int i) {
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

                @Override
                public boolean shouldLayoutChildFromOpositeSide(View view) {
                    return false;
                }

                @Override
                public boolean supportsPredictiveItemAnimations() {
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

                @Override
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    TL_iv.PageBlock pageBlock = BlockCollageCell.this.currentBlock.items.get((BlockCollageCell.this.currentBlock.items.size() - i) - 1);
                    if (viewHolder.getItemViewType() == 0) {
                        BlockPhotoCell blockPhotoCell = (BlockPhotoCell) viewHolder.itemView;
                        blockPhotoCell.groupPosition = BlockCollageCell.this.group.positions.get(pageBlock);
                        blockPhotoCell.setBlock((TL_iv.pageBlockPhoto) pageBlock, BlockCollageCell.this.parentAdapter.currentPage.cached_page, null, false, true);
                    } else {
                        BlockVideoCell blockVideoCell = (BlockVideoCell) viewHolder.itemView;
                        blockVideoCell.groupPosition = BlockCollageCell.this.group.positions.get(pageBlock);
                        TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                        blockVideoCell.setBlock(pageblockvideo, (BlockVideoCellState) ArticleViewer.this.videoStates.get(pageblockvideo.video_id), false, true, true);
                    }
                }

                @Override
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    View blockPhotoCell;
                    if (i != 0) {
                        Context context2 = BlockCollageCell.this.getContext();
                        BlockCollageCell blockCollageCell = BlockCollageCell.this;
                        blockPhotoCell = new BlockVideoCell(context2, ArticleViewer.this, blockCollageCell.parentAdapter, 2);
                    } else {
                        Context context3 = BlockCollageCell.this.getContext();
                        BlockCollageCell blockCollageCell2 = BlockCollageCell.this;
                        blockPhotoCell = new BlockPhotoCell(context3, ArticleViewer.this, blockCollageCell2.parentAdapter, 2);
                    }
                    return new RecyclerListView.Holder(blockPhotoCell);
                }
            };
            this.innerAdapter = adapter;
            recyclerListView2.setAdapter(adapter);
            addView(this.innerListView, LayoutHelper.createFrame(-1, -2.0f));
            setWillNotDraw(false);
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

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
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

        @Override
        public void onDraw(Canvas canvas) {
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
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.innerListView.layout(this.listX, AndroidUtilities.dp(8.0f), this.innerListView.getMeasuredWidth() + this.listX, AndroidUtilities.dp(8.0f) + this.innerListView.getMeasuredHeight());
        }

        @Override
        public void onMeasure(int i, int i2) {
            BlockCollageCell blockCollageCell;
            int iDp;
            int iM$1;
            int iDp2 = 1;
            this.inLayout = true;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockCollage pageblockcollage = this.currentBlock;
            if (pageblockcollage != null) {
                int i3 = pageblockcollage.level;
                if (i3 > 0) {
                    int iDp3 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i3 * 14);
                    this.listX = iDp3;
                    this.textX = iDp3;
                    iM$1 = OKLCH.m$1(18.0f, iDp3, size);
                    iDp = iM$1;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.dp(18.0f);
                    iDp = size - AndroidUtilities.dp(36.0f);
                    iM$1 = size;
                }
                this.innerListView.measure(View.MeasureSpec.makeMeasureSpec(iM$1, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = this.innerListView.getMeasuredHeight();
                int iDp4 = AndroidUtilities.dp(8.0f) + measuredHeight;
                this.textY = iDp4;
                ArticleViewer articleViewer = ArticleViewer.this;
                TL_iv.pageBlockCollage pageblockcollage2 = this.currentBlock;
                blockCollageCell = this;
                DrawingText drawingTextCreateLayoutForText = articleViewer.createLayoutForText(blockCollageCell, null, pageblockcollage2.caption.text, iDp, iDp4, pageblockcollage2, this.parentAdapter);
                blockCollageCell.captionLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int height = blockCollageCell.captionLayout.getHeight() + AndroidUtilities.dp(4.0f);
                    blockCollageCell.creditOffset = height;
                    measuredHeight = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(4.0f, height, measuredHeight);
                    DrawingText drawingText = blockCollageCell.captionLayout;
                    drawingText.x = blockCollageCell.textX;
                    drawingText.y = blockCollageCell.textY;
                } else {
                    blockCollageCell.creditOffset = 0;
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TL_iv.pageBlockCollage pageblockcollage3 = blockCollageCell.currentBlock;
                DrawingText drawingTextCreateLayoutForText2 = articleViewer2.createLayoutForText(blockCollageCell, (CharSequence) null, pageblockcollage3.caption.credit, iDp, blockCollageCell.creditOffset + blockCollageCell.textY, pageblockcollage3, blockCollageCell.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, blockCollageCell.parentAdapter);
                blockCollageCell.creditLayout = drawingTextCreateLayoutForText2;
                if (drawingTextCreateLayoutForText2 != null) {
                    measuredHeight += blockCollageCell.creditLayout.getHeight() + AndroidUtilities.dp(4.0f);
                    DrawingText drawingText2 = blockCollageCell.creditLayout;
                    drawingText2.x = blockCollageCell.textX;
                    drawingText2.y = blockCollageCell.textY + blockCollageCell.creditOffset;
                }
                iDp2 = measuredHeight + AndroidUtilities.dp(16.0f);
                TL_iv.pageBlockCollage pageblockcollage4 = blockCollageCell.currentBlock;
                if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                    iDp2 += AndroidUtilities.dp(8.0f);
                }
            } else {
                blockCollageCell = this;
            }
            setMeasuredDimension(size, iDp2);
            blockCollageCell.inLayout = false;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY)) {
                return true;
            }
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.creditOffset + this.textY) || super.onTouchEvent(motionEvent);
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

        public class GroupedMessages {
            public long groupId;
            public boolean hasSibling;
            public ArrayList<MessageObject.GroupedMessagePosition> posArray = new ArrayList<>();
            public HashMap<TLObject, MessageObject.GroupedMessagePosition> positions = new HashMap<>();
            private int maxSizeWidth = 1000;

            public GroupedMessages() {
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
                ?? r14;
                int i;
                ArrayList arrayList;
                float f;
                TLRPC.Document documentWithId;
                TLRPC.PhotoSize closestPhotoSizeWithSize;
                boolean z;
                float f2;
                float f3;
                this.posArray.clear();
                this.positions.clear();
                int size = BlockCollageCell.this.currentBlock.items.size();
                if (size <= 1) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                this.hasSibling = false;
                boolean z2 = false;
                float f4 = 1.0f;
                for (int i2 = 0; i2 < size; i2++) {
                    TL_iv.PageBlock pageBlock = BlockCollageCell.this.currentBlock.items.get(i2);
                    if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                        f = 1.2f;
                        TLRPC.Photo photoWithId = BlockCollageCell.this.parentAdapter.getPhotoWithId(((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                        if (photoWithId != null) {
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize());
                            MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
                            if (i2 == size - 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            groupedMessagePosition.last = z;
                            if (closestPhotoSizeWithSize == null) {
                                f2 = 1.0f;
                            } else {
                                f2 = closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            }
                            groupedMessagePosition.aspectRatio = f2;
                            if (f2 > f) {
                                sb.append("w");
                            } else if (f2 < 0.8f) {
                                sb.append("n");
                            } else {
                                sb.append("q");
                            }
                            f3 = groupedMessagePosition.aspectRatio;
                            f4 += f3;
                            if (f3 > 2.0f) {
                                z2 = true;
                            }
                            this.positions.put(pageBlock, groupedMessagePosition);
                            this.posArray.add(groupedMessagePosition);
                        }
                    } else {
                        f = 1.2f;
                        if ((pageBlock instanceof TL_iv.pageBlockVideo) && (documentWithId = BlockCollageCell.this.parentAdapter.getDocumentWithId(((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(documentWithId.thumbs, 90);
                            MessageObject.GroupedMessagePosition groupedMessagePosition2 = new MessageObject.GroupedMessagePosition();
                            if (i2 == size - 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            groupedMessagePosition2.last = z;
                            if (closestPhotoSizeWithSize == null) {
                                f2 = 1.0f;
                            } else {
                                f2 = closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            }
                            groupedMessagePosition2.aspectRatio = f2;
                            if (f2 > f) {
                                sb.append("w");
                            } else if (f2 < 0.8f) {
                                sb.append("n");
                            } else {
                                sb.append("q");
                            }
                            f3 = groupedMessagePosition2.aspectRatio;
                            f4 += f3;
                            if (f3 > 2.0f) {
                                z2 = true;
                            }
                            this.positions.put(pageBlock, groupedMessagePosition2);
                            this.posArray.add(groupedMessagePosition2);
                        }
                    }
                }
                int iDp = AndroidUtilities.dp(120.0f);
                float fDp = AndroidUtilities.dp(120.0f);
                Point point = AndroidUtilities.displaySize;
                int iMin = (int) (fDp / (Math.min(point.x, point.y) / this.maxSizeWidth));
                float fDp2 = AndroidUtilities.dp(40.0f);
                Point point2 = AndroidUtilities.displaySize;
                float fMin = Math.min(point2.x, point2.y);
                float f5 = this.maxSizeWidth;
                int i3 = (int) (fDp2 / (fMin / f5));
                float f6 = f5 / 814.0f;
                float f7 = f4 / size;
                if (z2 || !(size == 2 || size == 3 || size == 4)) {
                    int size2 = this.posArray.size();
                    float[] fArr = new float[size2];
                    for (int i4 = 0; i4 < size; i4++) {
                        if (f7 > 1.1f) {
                            fArr[i4] = Math.max(1.0f, this.posArray.get(i4).aspectRatio);
                        } else {
                            fArr[i4] = Math.min(1.0f, this.posArray.get(i4).aspectRatio);
                        }
                        fArr[i4] = Math.max(0.66667f, Math.min(1.7f, fArr[i4]));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i5 = 1; i5 < size2; i5++) {
                        int i6 = size2 - i5;
                        if (i5 <= 3 && i6 <= 3) {
                            arrayList2.add(new MessageGroupedLayoutAttempt(i5, i6, multiHeight(fArr, 0, i5), multiHeight(fArr, i5, size2)));
                        }
                    }
                    for (int i7 = 1; i7 < size2 - 1; i7++) {
                        int i8 = 1;
                        while (true) {
                            int i9 = size2 - i7;
                            if (i8 < i9) {
                                int i10 = i9 - i8;
                                if (i7 <= 3) {
                                    if (i8 <= (f7 < 0.85f ? 4 : 3)) {
                                        if (i10 <= 3) {
                                            int i11 = i7 + i8;
                                            arrayList2.add(new MessageGroupedLayoutAttempt(i7, i8, i10, multiHeight(fArr, 0, i7), multiHeight(fArr, i7, i11), multiHeight(fArr, i11, size2)));
                                        }
                                    }
                                }
                                i8++;
                            }
                        }
                    }
                    for (int i12 = 1; i12 < size2 - 2; i12++) {
                        int i13 = 1;
                        while (true) {
                            int i14 = size2 - i12;
                            if (i13 < i14) {
                                int i15 = 1;
                                while (true) {
                                    int i16 = i14 - i13;
                                    if (i15 < i16) {
                                        int i17 = i16 - i15;
                                        if (i12 > 3 || i13 > 3 || i15 > 3) {
                                            i = i14;
                                            arrayList = arrayList2;
                                        } else {
                                            if (i17 > 3) {
                                                i = i14;
                                                arrayList = arrayList2;
                                            } else {
                                                float fMultiHeight = multiHeight(fArr, 0, i12);
                                                int i18 = i12 + i13;
                                                float fMultiHeight2 = multiHeight(fArr, i12, i18);
                                                int i19 = i18 + i15;
                                                float fMultiHeight3 = multiHeight(fArr, i18, i19);
                                                float fMultiHeight4 = multiHeight(fArr, i19, size2);
                                                i = i14;
                                                arrayList = arrayList2;
                                                arrayList.add(new MessageGroupedLayoutAttempt(i12, i13, i15, i17, fMultiHeight, fMultiHeight2, fMultiHeight3, fMultiHeight4));
                                            }
                                            i15++;
                                            arrayList2 = arrayList;
                                            i14 = i;
                                        }
                                        i15++;
                                        arrayList2 = arrayList;
                                        i14 = i;
                                    }
                                }
                                i13++;
                            }
                        }
                    }
                    ArrayList arrayList3 = arrayList2;
                    float f8 = (this.maxSizeWidth / 3) * 4;
                    MessageGroupedLayoutAttempt messageGroupedLayoutAttempt = null;
                    float f9 = 0.0f;
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        MessageGroupedLayoutAttempt messageGroupedLayoutAttempt2 = (MessageGroupedLayoutAttempt) arrayList3.get(i20);
                        int i21 = 0;
                        float f10 = Float.MAX_VALUE;
                        float f11 = 0.0f;
                        while (true) {
                            float[] fArr2 = messageGroupedLayoutAttempt2.heights;
                            if (i21 >= fArr2.length) {
                                break;
                            }
                            float f12 = fArr2[i21];
                            f11 += f12;
                            if (f12 < f10) {
                                f10 = f12;
                            }
                            i21++;
                        }
                        float fAbs = Math.abs(f11 - f8);
                        int[] iArr = messageGroupedLayoutAttempt2.lineCounts;
                        if (iArr.length > 1) {
                            int i22 = iArr[0];
                            int i23 = iArr[1];
                            if (i22 <= i23 && (iArr.length <= 2 || i23 <= iArr[2])) {
                                if (iArr.length > 3 && iArr[2] > iArr[3]) {
                                }
                            }
                            fAbs *= 1.2f;
                        }
                        if (f10 < iMin) {
                            fAbs *= 1.5f;
                        }
                        if (messageGroupedLayoutAttempt == null || fAbs < f9) {
                            f9 = fAbs;
                            messageGroupedLayoutAttempt = messageGroupedLayoutAttempt2;
                        }
                    }
                    if (messageGroupedLayoutAttempt == null) {
                        return;
                    }
                    int i24 = 0;
                    int i25 = 0;
                    while (true) {
                        int[] iArr2 = messageGroupedLayoutAttempt.lineCounts;
                        if (i25 >= iArr2.length) {
                            break;
                        }
                        int i26 = iArr2[i25];
                        float f13 = messageGroupedLayoutAttempt.heights[i25];
                        int i27 = this.maxSizeWidth;
                        int i28 = 0;
                        MessageObject.GroupedMessagePosition groupedMessagePosition3 = null;
                        while (i28 < i26) {
                            int i29 = (int) (fArr[i24] * f13);
                            i27 -= i29;
                            MessageObject.GroupedMessagePosition groupedMessagePosition4 = this.posArray.get(i24);
                            int i30 = i25 == 0 ? 4 : 0;
                            if (i25 == messageGroupedLayoutAttempt.lineCounts.length - 1) {
                                i30 |= 8;
                            }
                            if (i28 == 0) {
                                i30 |= 1;
                            }
                            if (i28 == i26 - 1) {
                                i30 |= 2;
                                groupedMessagePosition3 = groupedMessagePosition4;
                            }
                            int i31 = i28;
                            groupedMessagePosition4.set(i31, i28, i25, i25, i29, f13 / 814.0f, i30);
                            i24++;
                            i28 = i31 + 1;
                        }
                        groupedMessagePosition3.pw += i27;
                        groupedMessagePosition3.spanSize += i27;
                        i25++;
                    }
                    r14 = 1;
                } else {
                    if (size == 2) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition5 = this.posArray.get(0);
                        MessageObject.GroupedMessagePosition groupedMessagePosition6 = this.posArray.get(1);
                        String string = sb.toString();
                        if (string.equals("ww") && f7 > ((double) f6) * 1.4d) {
                            float f14 = groupedMessagePosition5.aspectRatio;
                            float f15 = groupedMessagePosition6.aspectRatio;
                            if (f14 - f15 < 0.2d) {
                                float f16 = this.maxSizeWidth;
                                float fRound = Math.round(Math.min(f16 / f14, Math.min(f16 / f15, 407.0f))) / 814.0f;
                                groupedMessagePosition5.set(0, 0, 0, 0, this.maxSizeWidth, fRound, 7);
                                groupedMessagePosition6.set(0, 0, 1, 1, this.maxSizeWidth, fRound, 11);
                            } else if (string.equals("ww")) {
                                int i32 = this.maxSizeWidth / 2;
                                float f17 = i32;
                                float fRound2 = Math.round(Math.min(f17 / groupedMessagePosition5.aspectRatio, Math.min(f17 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                                groupedMessagePosition5.set(0, 0, 0, 0, i32, fRound2, 13);
                                groupedMessagePosition6.set(1, 1, 0, 0, i32, fRound2, 14);
                            } else {
                                int i33 = this.maxSizeWidth / 2;
                                float f18 = i33;
                                float fRound3 = Math.round(Math.min(f18 / groupedMessagePosition5.aspectRatio, Math.min(f18 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                                groupedMessagePosition5.set(0, 0, 0, 0, i33, fRound3, 13);
                                groupedMessagePosition6.set(1, 1, 0, 0, i33, fRound3, 14);
                            }
                        } else if (string.equals("ww") || string.equals("qq")) {
                            int i34 = this.maxSizeWidth / 2;
                            float f19 = i34;
                            float fRound4 = Math.round(Math.min(f19 / groupedMessagePosition5.aspectRatio, Math.min(f19 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                            groupedMessagePosition5.set(0, 0, 0, 0, i34, fRound4, 13);
                            groupedMessagePosition6.set(1, 1, 0, 0, i34, fRound4, 14);
                        } else {
                            float f20 = this.maxSizeWidth;
                            float f21 = groupedMessagePosition5.aspectRatio;
                            int iMax = (int) Math.max(0.4f * f20, Math.round((f20 / f21) / ((1.0f / groupedMessagePosition6.aspectRatio) + (1.0f / f21))));
                            int i35 = this.maxSizeWidth - iMax;
                            if (i35 < iMin) {
                                iMax -= iMin - i35;
                            } else {
                                iMin = i35;
                            }
                            float fMin2 = Math.min(814.0f, Math.round(Math.min(iMin / groupedMessagePosition5.aspectRatio, iMax / groupedMessagePosition6.aspectRatio))) / 814.0f;
                            groupedMessagePosition5.set(0, 0, 0, 0, iMin, fMin2, 13);
                            groupedMessagePosition6.set(1, 1, 0, 0, iMax, fMin2, 14);
                        }
                    } else if (size == 3) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition7 = this.posArray.get(0);
                        MessageObject.GroupedMessagePosition groupedMessagePosition8 = this.posArray.get(1);
                        MessageObject.GroupedMessagePosition groupedMessagePosition9 = this.posArray.get(2);
                        if (sb.charAt(0) == 'n') {
                            float f22 = groupedMessagePosition8.aspectRatio;
                            float fMin3 = Math.min(407.0f, Math.round((this.maxSizeWidth * f22) / (groupedMessagePosition9.aspectRatio + f22)));
                            float f23 = 814.0f - fMin3;
                            int iMax2 = (int) Math.max(iMin, Math.min(this.maxSizeWidth * 0.5f, Math.round(Math.min(groupedMessagePosition9.aspectRatio * fMin3, groupedMessagePosition8.aspectRatio * f23))));
                            int iRound = Math.round(Math.min((groupedMessagePosition7.aspectRatio * 814.0f) + i3, this.maxSizeWidth - iMax2));
                            groupedMessagePosition7.set(0, 0, 0, 1, iRound, 1.0f, 13);
                            float f24 = f23 / 814.0f;
                            groupedMessagePosition8.set(1, 1, 0, 0, iMax2, f24, 6);
                            float f25 = fMin3 / 814.0f;
                            groupedMessagePosition9.set(0, 1, 1, 1, iMax2, f25, 10);
                            int i36 = this.maxSizeWidth;
                            groupedMessagePosition9.spanSize = i36;
                            groupedMessagePosition7.siblingHeights = new float[]{f25, f24};
                            groupedMessagePosition8.spanSize = i36 - iRound;
                            groupedMessagePosition9.leftSpanOffset = iRound;
                            this.hasSibling = true;
                        } else {
                            float fRound5 = Math.round(Math.min(this.maxSizeWidth / groupedMessagePosition7.aspectRatio, 537.24005f)) / 814.0f;
                            groupedMessagePosition7.set(0, 1, 0, 0, this.maxSizeWidth, fRound5, 7);
                            int i37 = this.maxSizeWidth / 2;
                            float f26 = i37;
                            float fMin4 = Math.min(814.0f - fRound5, Math.round(Math.min(f26 / groupedMessagePosition8.aspectRatio, f26 / groupedMessagePosition9.aspectRatio))) / 814.0f;
                            groupedMessagePosition8.set(0, 0, 1, 1, i37, fMin4, 9);
                            groupedMessagePosition9.set(1, 1, 1, 1, i37, fMin4, 10);
                        }
                    } else if (size == 4) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition10 = this.posArray.get(0);
                        MessageObject.GroupedMessagePosition groupedMessagePosition11 = this.posArray.get(1);
                        MessageObject.GroupedMessagePosition groupedMessagePosition12 = this.posArray.get(2);
                        MessageObject.GroupedMessagePosition groupedMessagePosition13 = this.posArray.get(3);
                        if (sb.charAt(0) == 'w') {
                            float fRound6 = Math.round(Math.min(this.maxSizeWidth / groupedMessagePosition10.aspectRatio, 537.24005f)) / 814.0f;
                            groupedMessagePosition10.set(0, 2, 0, 0, this.maxSizeWidth, fRound6, 7);
                            float fRound7 = Math.round(this.maxSizeWidth / ((groupedMessagePosition11.aspectRatio + groupedMessagePosition12.aspectRatio) + groupedMessagePosition13.aspectRatio));
                            float f27 = iMin;
                            int iMax3 = (int) Math.max(f27, Math.min(this.maxSizeWidth * 0.4f, groupedMessagePosition11.aspectRatio * fRound7));
                            int iMax4 = (int) Math.max(Math.max(f27, this.maxSizeWidth * 0.33f), groupedMessagePosition13.aspectRatio * fRound7);
                            int i38 = (this.maxSizeWidth - iMax3) - iMax4;
                            float fMin5 = Math.min(814.0f - fRound6, fRound7) / 814.0f;
                            groupedMessagePosition11.set(0, 0, 1, 1, iMax3, fMin5, 9);
                            groupedMessagePosition12.set(1, 1, 1, 1, i38, fMin5, 8);
                            groupedMessagePosition13.set(2, 2, 1, 1, iMax4, fMin5, 10);
                        } else {
                            int iMax5 = Math.max(iMin, Math.round(814.0f / ((1.0f / this.posArray.get(3).aspectRatio) + ((1.0f / groupedMessagePosition12.aspectRatio) + (1.0f / groupedMessagePosition11.aspectRatio)))));
                            float f28 = iDp;
                            float f29 = iMax5;
                            float fMin6 = Math.min(0.33f, Math.max(f28, f29 / groupedMessagePosition11.aspectRatio) / 814.0f);
                            float fMin7 = Math.min(0.33f, Math.max(f28, f29 / groupedMessagePosition12.aspectRatio) / 814.0f);
                            float f30 = (1.0f - fMin6) - fMin7;
                            int iRound2 = Math.round(Math.min((814.0f * groupedMessagePosition10.aspectRatio) + i3, this.maxSizeWidth - iMax5));
                            groupedMessagePosition10.set(0, 0, 0, 2, iRound2, fMin6 + fMin7 + f30, 13);
                            groupedMessagePosition11.set(1, 1, 0, 0, iMax5, fMin6, 6);
                            groupedMessagePosition12.set(0, 1, 1, 1, iMax5, fMin7, 2);
                            groupedMessagePosition12.spanSize = this.maxSizeWidth;
                            groupedMessagePosition13.set(0, 1, 2, 2, iMax5, f30, 10);
                            int i39 = this.maxSizeWidth;
                            groupedMessagePosition13.spanSize = i39;
                            groupedMessagePosition11.spanSize = i39 - iRound2;
                            groupedMessagePosition12.leftSpanOffset = iRound2;
                            groupedMessagePosition13.leftSpanOffset = iRound2;
                            groupedMessagePosition10.siblingHeights = new float[]{fMin6, fMin7, f30};
                            this.hasSibling = true;
                        }
                    }
                    r14 = 1;
                }
                for (int i40 = 0; i40 < size; i40 += r14) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition14 = this.posArray.get(i40);
                    if ((groupedMessagePosition14.flags & r14) != 0) {
                        groupedMessagePosition14.edge = r14;
                    }
                }
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
        public void onDraw(Canvas canvas) {
            canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), 0.0f, ArticleViewer.dividerPaint);
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(4.0f) + 1);
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

        public BlockDetailsCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            this.arrow = new AnimatedArrowDrawable(iArticleViewer.getGrayTextColor(), true);
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public void invalidateDrawable(Drawable drawable) {
            invalidate();
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
        public void onMeasure(int i, int i2) {
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
                    iDp = Math.max(iDp, this.textLayout.getHeight() + AndroidUtilities.dp(21.0f));
                    int iDp3 = ((AndroidUtilities.dp(21.0f) + this.textLayout.getHeight()) - this.textLayout.getHeight()) / 2;
                    this.textY = iDp3;
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = iDp3;
                }
            }
            setMeasuredDimension(size, iDp + 1);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        @Override
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        public void setBlock(TL_iv.pageBlockDetails pageblockdetails) {
            this.currentBlock = pageblockdetails;
            this.arrow.setAnimationProgress(pageblockdetails.open ? 0.0f : 1.0f);
            this.arrow.setCallback(this);
            requestLayout();
        }

        @Override
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
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
        public void onDraw(Canvas canvas) {
            int measuredWidth = getMeasuredWidth() / 3;
            this.rect.set(measuredWidth, AndroidUtilities.dp(8.0f), measuredWidth * 2, AndroidUtilities.dp(10.0f));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), ArticleViewer.dividerPaint);
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(18.0f));
        }
    }

    public class BlockEmbedCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
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

        public class AnonymousClass2 extends WebChromeClient {
            final ArticleViewer val$this$0;

            public AnonymousClass2(ArticleViewer articleViewer) {
                this.val$this$0 = articleViewer;
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
                AndroidUtilities.runOnUIThread(new ChatActivity$21$$ExternalSyntheticLambda4(this, 2), 100L);
            }
        }

        public class AnonymousClass3 extends WebViewClient {
            final ArticleViewer val$this$0;

            public AnonymousClass3(ArticleViewer articleViewer) {
                this.val$this$0 = articleViewer;
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
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                try {
                    LaunchActivity launchActivity = LaunchActivity.instance;
                    if (launchActivity != null && launchActivity.isFinishing()) {
                        return true;
                    }
                    new AlertDialog.Builder(BlockEmbedCell.this.getContext(), 0, null).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new ChatActivity$21$$ExternalSyntheticLambda4(this, 3))).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
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

        public class TelegramWebviewProxy {
            private TelegramWebviewProxy() {
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

            @JavascriptInterface
            public void postEvent(String str, String str2) {
                AndroidUtilities.runOnUIThread(new PhotoViewer$86$$ExternalSyntheticLambda0(this, str, str2, 1));
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

        public BlockEmbedCell(Context context, WebpageAdapter webpageAdapter) {
            super(context);
            this.parentAdapter = webpageAdapter;
            setWillNotDraw(false);
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.videoView = null;
                this.webView = null;
                return;
            }
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
                public void onInitFailed() {
                    BlockEmbedCell.this.webView.setVisibility(0);
                    BlockEmbedCell.this.videoView.setVisibility(4);
                    BlockEmbedCell.this.videoView.loadVideo(null, null, null, null, false);
                    HashMap map = new HashMap();
                    map.put("Referer", ApplicationLoader.applicationContext.getPackageName());
                    BlockEmbedCell.this.webView.loadUrl(BlockEmbedCell.this.currentBlock.url, map);
                }

                @Override
                public void onInlineSurfaceTextureReady() {
                }

                @Override
                public void onPlayStateChanged(WebPlayerView webPlayerView2, boolean z) {
                    if (!z) {
                        if (ArticleViewer.this.currentPlayingVideo == webPlayerView2) {
                            ArticleViewer.this.currentPlayingVideo = null;
                        }
                        try {
                            ArticleViewer.this.parentActivity.getWindow().clearFlags(128);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (ArticleViewer.this.currentPlayingVideo != null && ArticleViewer.this.currentPlayingVideo != webPlayerView2) {
                        ArticleViewer.this.currentPlayingVideo.pause();
                    }
                    ArticleViewer.this.currentPlayingVideo = webPlayerView2;
                    try {
                        ArticleViewer.this.parentActivity.getWindow().addFlags(128);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }

                @Override
                public void onSharePressed() {
                    if (ArticleViewer.this.parentActivity == null) {
                        return;
                    }
                    ArticleViewer.this.showDialog(new ShareAlert(ArticleViewer.this.parentActivity, null, BlockEmbedCell.this.currentBlock.url, false, BlockEmbedCell.this.currentBlock.url, false));
                }

                @Override
                public TextureView onSwitchInlineMode(View view, boolean z, int i, int i2, int i3, boolean z2) {
                    return null;
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
                public void onVideoSizeChanged(float f, int i) {
                    ArticleViewer.this.fullscreenAspectRatioView.setAspectRatio(f, i);
                }

                @Override
                public void prepareToSwitchInlineMode(boolean z, Runnable runnable, float f, boolean z2) {
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

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
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
        public void onDraw(Canvas canvas) {
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

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        public void onMeasure(int i, int i2) {
            int iDp;
            int iDp2;
            int i3;
            int iDp3;
            int iDp4;
            DrawingText drawingText;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockEmbed pageblockembed = this.currentBlock;
            if (pageblockembed != null) {
                int i4 = pageblockembed.level;
                if (i4 > 0) {
                    int iDp5 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i4 * 14);
                    this.listX = iDp5;
                    this.textX = iDp5;
                    iDp2 = OKLCH.m$1(18.0f, iDp5, size);
                    i3 = iDp2;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.dp(18.0f);
                    int iDp6 = size - AndroidUtilities.dp(36.0f);
                    if (this.currentBlock.full_width) {
                        iDp2 = size;
                    } else {
                        iDp2 = size - AndroidUtilities.dp(36.0f);
                        this.listX = AndroidUtilities.dp(18.0f) + this.listX;
                    }
                    i3 = iDp6;
                }
                TL_iv.pageBlockEmbed pageblockembed2 = this.currentBlock;
                int i5 = pageblockembed2.w;
                float f = i5 == 0 ? 1.0f : size / i5;
                int i6 = this.exactWebViewHeight;
                if (i6 != 0) {
                    iDp3 = AndroidUtilities.dp(i6);
                } else {
                    iDp3 = (int) ((i5 == 0 ? AndroidUtilities.dp(pageblockembed2.h) : pageblockembed2.h) * f);
                }
                if (iDp3 == 0) {
                    iDp3 = AndroidUtilities.dp(10.0f);
                }
                int iM = iDp3;
                TouchyWebView touchyWebView = this.webView;
                if (touchyWebView != null) {
                    touchyWebView.measure(View.MeasureSpec.makeMeasureSpec(iDp2, 1073741824), View.MeasureSpec.makeMeasureSpec(iM, 1073741824));
                }
                WebPlayerView webPlayerView = this.videoView;
                if (webPlayerView != null && webPlayerView.getParent() == this) {
                    this.videoView.measure(View.MeasureSpec.makeMeasureSpec(iDp2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f) + iM, 1073741824));
                }
                int iDp7 = AndroidUtilities.dp(8.0f) + iM;
                this.textY = iDp7;
                ArticleViewer articleViewer = ArticleViewer.this;
                TL_iv.pageBlockEmbed pageblockembed3 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText = articleViewer.createLayoutForText(this, null, pageblockembed3.caption.text, i3, iDp7, pageblockembed3, this.parentAdapter);
                this.captionLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int height = this.captionLayout.getHeight() + AndroidUtilities.dp(4.0f);
                    this.creditOffset = height;
                    iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(4.0f, height, iM);
                } else {
                    this.creditOffset = 0;
                }
                int height2 = iM;
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TL_iv.pageBlockEmbed pageblockembed4 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText2 = articleViewer2.createLayoutForText(this, (CharSequence) null, pageblockembed4.caption.credit, i3, this.creditOffset + this.textY, pageblockembed4, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = drawingTextCreateLayoutForText2;
                if (drawingTextCreateLayoutForText2 != null) {
                    height2 += this.creditLayout.getHeight() + AndroidUtilities.dp(4.0f);
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.creditOffset;
                }
                iDp = AndroidUtilities.dp(5.0f) + height2;
                TL_iv.pageBlockEmbed pageblockembed5 = this.currentBlock;
                int i7 = pageblockembed5.level;
                if (i7 > 0 && !pageblockembed5.bottom) {
                    iDp4 = AndroidUtilities.dp(8.0f);
                } else if (i7 != 0 || this.captionLayout == null) {
                    drawingText = this.captionLayout;
                    if (drawingText != null) {
                        drawingText.x = this.textX;
                        drawingText.y = this.textY;
                    }
                } else {
                    iDp4 = AndroidUtilities.dp(8.0f);
                }
                iDp += iDp4;
                drawingText = this.captionLayout;
                if (drawingText != null) {
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                iDp = 1;
            }
            setMeasuredDimension(size, iDp);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY)) {
                return true;
            }
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.creditOffset + this.textY) || super.onTouchEvent(motionEvent);
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
        private int dateX;
        private int lineHeight;
        private DrawingText nameLayout;
        private int nameX;
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

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
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
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            int i;
            TL_iv.pageBlockEmbedPost pageblockembedpost = this.currentBlock;
            if (pageblockembedpost == null) {
                return;
            }
            int i2 = 0;
            if (pageblockembedpost instanceof TL_pageBlockEmbedPostCaption) {
                canvas2 = canvas;
            } else {
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
                canvas2 = canvas;
                canvas2.drawRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(20.0f), this.lineHeight - (this.currentBlock.level == 0 ? AndroidUtilities.dp(6.0f) : 0), ArticleViewer.quoteLinePaint);
                i2 = i;
            }
            if (this.captionLayout != null) {
                canvas2.save();
                canvas2.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas2, this, i2);
                this.captionLayout.draw(canvas2, this);
                canvas2.restore();
                i2++;
            }
            if (this.creditLayout != null) {
                canvas2.save();
                canvas2.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.drawTextSelection(this.parent, canvas2, this, i2);
                this.creditLayout.draw(canvas2, this);
                canvas2.restore();
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

        @Override
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockEmbedPost pageblockembedpost = this.currentBlock;
            int iDp = 1;
            if (pageblockembedpost != null) {
                int iDp2 = 0;
                if (pageblockembedpost instanceof TL_pageBlockEmbedPostCaption) {
                    this.textX = AndroidUtilities.dp(18.0f);
                    this.textY = AndroidUtilities.dp(4.0f);
                    int iDp3 = size - AndroidUtilities.dp(50.0f);
                    IArticleViewer iArticleViewer = this.parent;
                    TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.currentBlock;
                    DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockembedpost2.caption.text, iDp3, this.textY, pageblockembedpost2, this.adapter);
                    this.captionLayout = drawingTextCreateLayoutForText;
                    if (drawingTextCreateLayoutForText != null) {
                        int height = this.captionLayout.getHeight() + AndroidUtilities.dp(4.0f);
                        this.creditOffset = height;
                        iDp2 = AndroidUtilities.dp(4.0f) + height;
                    }
                    IArticleViewer iArticleViewer2 = this.parent;
                    TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.currentBlock;
                    DrawingText drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, pageblockembedpost3.caption.credit, iDp3, this.creditOffset + this.textY, pageblockembedpost3, this.adapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.adapter);
                    this.creditLayout = drawingTextCreateLayoutForText2;
                    if (drawingTextCreateLayoutForText2 != null) {
                        iDp = this.creditLayout.getHeight() + AndroidUtilities.dp(4.0f) + iDp2;
                    } else {
                        iDp = iDp2;
                    }
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
                    int iDp4 = size - AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 50);
                    TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.currentBlock;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    DrawingText drawingTextCreateLayoutForText3 = ArticleViewer.createLayoutForText(iArticleViewer3, this, str, null, iDp4, 0, pageblockembedpost4, alignment, 1, this.adapter);
                    this.nameLayout = drawingTextCreateLayoutForText3;
                    if (drawingTextCreateLayoutForText3 != null) {
                        drawingTextCreateLayoutForText3.x = AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 32);
                        this.nameLayout.y = AndroidUtilities.dp(this.dateLayout != null ? 10.0f : 19.0f);
                    }
                    if (this.currentBlock.date != 0) {
                        this.dateLayout = ArticleViewer.createLayoutForText(this.parent, this, LocaleController.getInstance().getChatFullDate().format(((long) this.currentBlock.date) * 1000), (TL_iv.RichText) null, size - AndroidUtilities.dp((this.avatarVisible ? 54 : 0) + 50), AndroidUtilities.dp(29.0f), this.currentBlock, this.adapter);
                    } else {
                        this.dateLayout = null;
                    }
                    iDp = AndroidUtilities.dp(56.0f);
                    if (this.currentBlock.blocks.isEmpty()) {
                        this.textX = AndroidUtilities.dp(32.0f);
                        this.textY = AndroidUtilities.dp(56.0f);
                        int iDp5 = size - AndroidUtilities.dp(50.0f);
                        IArticleViewer iArticleViewer4 = this.parent;
                        TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.currentBlock;
                        int iM = iDp;
                        DrawingText drawingTextCreateLayoutForText4 = ArticleViewer.createLayoutForText(iArticleViewer4, this, (CharSequence) null, pageblockembedpost5.caption.text, iDp5, this.textY, pageblockembedpost5, this.adapter);
                        this.captionLayout = drawingTextCreateLayoutForText4;
                        if (drawingTextCreateLayoutForText4 != null) {
                            int height2 = this.captionLayout.getHeight() + AndroidUtilities.dp(4.0f);
                            this.creditOffset = height2;
                            iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(4.0f, height2, iM);
                        }
                        IArticleViewer iArticleViewer5 = this.parent;
                        TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.currentBlock;
                        DrawingText drawingTextCreateLayoutForText5 = ArticleViewer.createLayoutForText(iArticleViewer5, this, (CharSequence) null, pageblockembedpost6.caption.credit, iDp5, this.creditOffset + this.textY, pageblockembedpost6, this.adapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : alignment, this.adapter);
                        this.creditLayout = drawingTextCreateLayoutForText5;
                        if (drawingTextCreateLayoutForText5 != null) {
                            iDp = this.creditLayout.getHeight() + AndroidUtilities.dp(4.0f) + iM;
                        } else {
                            iDp = iM;
                        }
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
                }
                this.lineHeight = iDp;
            }
            setMeasuredDimension(size, iDp);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.captionLayout, this.textX, this.textY)) {
                return true;
            }
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.creditLayout, this.textX, this.creditOffset + this.textY) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
            this.currentBlock = pageblockembedpost;
            requestLayout();
        }
    }

    public static class BlockFooterCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockFooter currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockFooterCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.getBoundLeft() + drawingText.x) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getBoundRight() + drawingText.x;
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getLastLineBoundRight() + drawingText.x;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setLongClickable(false);
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return;
            }
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVFooter));
        }

        @Override
        public void onMeasure(int i, int i2) {
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockFooter pageblockfooter = this.currentBlock;
            if (pageblockfooter != null) {
                iDp = 0;
                if (pageblockfooter.level == 0) {
                    this.textY = AndroidUtilities.dp(this.parent.pady());
                    this.textX = AndroidUtilities.dp(this.parent.padx());
                } else {
                    this.textY = 0;
                    this.textX = AndroidUtilities.dp((this.currentBlock.level * 14) + this.parent.padx());
                }
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = this.currentBlock.text;
                int iDp2 = (size - AndroidUtilities.dp(iArticleViewer.padx() * 2)) - this.textX;
                int i3 = this.textY;
                TL_iv.pageBlockFooter pageblockfooter2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, iDp2, i3, pageblockfooter2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    iDp = (this.currentBlock.level > 0 ? AndroidUtilities.dp(this.parent.pady()) : AndroidUtilities.dp(this.parent.pady() * 2)) + drawingTextCreateLayoutForText.getHeight();
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
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
            this.currentBlock = pageblockfooter;
            requestLayout();
        }
    }

    public static class BlockHeaderCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.PageBlock currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockHeaderCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.getBoundLeft() + this.textX) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getBoundRight() + this.textX;
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getLastLineBoundRight() + this.textX;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
        public void onMeasure(int i, int i2) {
            int height;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            this.textY = AndroidUtilities.dp(this.parent.pady());
            TL_iv.PageBlock pageBlock = this.currentBlock;
            if (pageBlock != null) {
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = pageBlock.text;
                int iDp = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i3 = this.textY;
                TL_iv.PageBlock pageBlock2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, iDp, i3, pageBlock2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    height = this.textLayout.getHeight() + AndroidUtilities.dp(this.parent.pady() * 2);
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    height = 0;
                }
            } else {
                height = 1;
            }
            setMeasuredDimension(size, height);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.PageBlock pageBlock) {
            this.currentBlock = pageBlock;
            requestLayout();
        }
    }

    public static class BlockKickerCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockKicker currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockKickerCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.getBoundLeft() + drawingText.x) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getBoundRight() + drawingText.x;
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getLastLineBoundRight() + drawingText.x;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVKicker));
        }

        @Override
        public void onMeasure(int i, int i2) {
            int height;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            TL_iv.pageBlockKicker pageblockkicker = this.currentBlock;
            if (pageblockkicker != null) {
                if (pageblockkicker.first) {
                    this.textY = AndroidUtilities.dp(16.0f);
                    height = AndroidUtilities.dp(8.0f);
                } else {
                    this.textY = AndroidUtilities.dp(8.0f);
                    height = 0;
                }
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = this.currentBlock.text;
                int iDp = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i3 = this.textY;
                TL_iv.pageBlockKicker pageblockkicker2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, null, richText, iDp, i3, pageblockkicker2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), 0, this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    height += this.textLayout.getHeight() + AndroidUtilities.dp(this.parent.pady() * 2);
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                height = 1;
            }
            setMeasuredDimension(size, height);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
            this.currentBlock = pageblockkicker;
            requestLayout();
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

        public BlockListItemCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
        }

        private int numLayoutX() {
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            DrawingText drawingText = tL_pageBlockListItem != null ? tL_pageBlockListItem.numLayout : null;
            if (drawingText == null) {
                return 0;
            }
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter == null || !webpageAdapter.isRtl) {
                return RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(12.0f, this.currentBlock.parent.level, (AndroidUtilities.dp(this.parent.padx() - 3) + this.currentBlock.parent.maxNumWidth) - ((int) Math.ceil(drawingText.getLineWidth(0))));
            }
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.parent.padx() - 3);
            TL_pageBlockListParent tL_pageBlockListParent = this.currentBlock.parent;
            return OKLCH.m$3(12.0f, tL_pageBlockListParent.level, measuredWidth - tL_pageBlockListParent.maxNumWidth);
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

        @Override
        public int getBoundLeft() {
            int boundLeft;
            int iDp = AndroidUtilities.dp(this.parent.padx());
            int iMin = this.checkbox != null ? Math.min(Integer.MAX_VALUE, (this.textX - AndroidUtilities.dp(26.0f)) - iDp) : Integer.MAX_VALUE;
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            if (tL_pageBlockListItem != null && tL_pageBlockListItem.numLayout != null) {
                iMin = Math.min(iMin, (this.currentBlock.numLayout.getBoundLeft() + numLayoutX()) - iDp);
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                iMin = Math.min(iMin, (drawingText.getBoundLeft() + drawingText.x) - iDp);
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
            int iMax = (tL_pageBlockListItem == null || tL_pageBlockListItem.numLayout == null) ? Integer.MIN_VALUE : Math.max(Integer.MIN_VALUE, this.currentBlock.numLayout.getBoundRight() + numLayoutX() + iDp);
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                iMax = Math.max(iMax, drawingText.getBoundRight() + drawingText.x + iDp);
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
            int iDp;
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    KeyEvent.Callback callback = viewHolder.itemView;
                    if ((callback instanceof IBlock) && (lastLineBoundRight = ((IBlock) callback).getLastLineBoundRight()) != -1) {
                        iDp = this.blockX;
                    }
                }
                return -1;
            }
            lastLineBoundRight = drawingText.getLastLineBoundRight() + drawingText.x;
            iDp = AndroidUtilities.dp(this.parent.padx());
            return iDp + lastLineBoundRight;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
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
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (this.currentBlock.numLayout != null) {
                canvas.save();
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter == null || !webpageAdapter.isRtl) {
                    int iDp = AndroidUtilities.dp(this.parent.padx() - 3);
                    TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
                    canvas.translate(RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(12.0f, this.currentBlock.parent.level, (iDp + tL_pageBlockListItem.parent.maxNumWidth) - ((int) Math.ceil(tL_pageBlockListItem.numLayout.getLineWidth(0)))), (this.textY + this.numOffsetY) - (this.drawDot ? AndroidUtilities.dp(1.0f) : 0));
                } else {
                    int iDp2 = measuredWidth - AndroidUtilities.dp(this.parent.padx() - 3);
                    TL_pageBlockListParent tL_pageBlockListParent = this.currentBlock.parent;
                    canvas.translate(OKLCH.m$3(12.0f, tL_pageBlockListParent.level, iDp2 - tL_pageBlockListParent.maxNumWidth), (this.textY + this.numOffsetY) - (this.drawDot ? AndroidUtilities.dp(1.0f) : 0));
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
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                int i5 = this.blockX;
                view.layout(i5, this.blockY, view.getMeasuredWidth() + i5, this.blockLayout.itemView.getMeasuredHeight() + this.blockY);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int measuredHeight;
            int iDp;
            int iDp2;
            int iDp3;
            DrawingText drawingText;
            BlockParagraphCell blockParagraphCell;
            DrawingText drawingText2;
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
            int size = View.MeasureSpec.getSize(i);
            TL_pageBlockListItem tL_pageBlockListItem = this.currentBlock;
            int iDp4 = 1;
            if (tL_pageBlockListItem != null) {
                this.textLayout = null;
                int i3 = 0;
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
                        TL_pageBlockListItem tL_pageBlockListItem2 = this.currentBlock.parent.items.get(i4);
                        String str = tL_pageBlockListItem2.num;
                        if (str != null) {
                            if (tL_pageBlockListItem2.isCheckbox && "•".equalsIgnoreCase(str)) {
                                tL_pageBlockListItem2.numLayout = null;
                            } else {
                                IArticleViewer iArticleViewer = this.parent;
                                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, tL_pageBlockListItem2.num, (TL_iv.RichText) null, size - AndroidUtilities.dp(iArticleViewer.padx() * 3), this.textY, this.currentBlock, this.adapter);
                                tL_pageBlockListItem2.numLayout = drawingTextCreateLayoutForText;
                                TL_pageBlockListParent tL_pageBlockListParent2 = this.currentBlock.parent;
                                tL_pageBlockListParent2.maxNumWidth = Math.max(tL_pageBlockListParent2.maxNumWidth, (int) Math.ceil(drawingTextCreateLayoutForText.getLineWidth(0)));
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
                    int iDp5 = AndroidUtilities.dp(this.parent.padx() + (this.checkbox == null ? 0 : 26) + 6);
                    TL_pageBlockListParent tL_pageBlockListParent4 = this.currentBlock.parent;
                    this.textX = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(12.0f, tL_pageBlockListParent4.level, iDp5 + tL_pageBlockListParent4.maxNumWidth);
                } else {
                    this.textX = AndroidUtilities.dp(this.parent.padx() + (this.checkbox == null ? 0 : 26));
                }
                int iDp6 = (size - AndroidUtilities.dp(this.parent.padx())) - this.textX;
                WebpageAdapter webpageAdapter2 = this.adapter;
                if (webpageAdapter2 != null && webpageAdapter2.isRtl) {
                    int iDp7 = AndroidUtilities.dp(6.0f);
                    TL_pageBlockListParent tL_pageBlockListParent5 = this.currentBlock.parent;
                    iDp6 -= (AndroidUtilities.dp(12.0f) * tL_pageBlockListParent5.level) + (iDp7 + tL_pageBlockListParent5.maxNumWidth);
                }
                int iDp8 = iDp6;
                TL_pageBlockListItem tL_pageBlockListItem4 = this.currentBlock;
                TL_iv.RichText richText = tL_pageBlockListItem4.textItem;
                if (richText != null) {
                    IArticleViewer iArticleViewer2 = this.parent;
                    int i5 = this.textY;
                    WebpageAdapter webpageAdapter3 = this.adapter;
                    DrawingText drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, richText, iDp8, i5, tL_pageBlockListItem4, (webpageAdapter3 == null || !webpageAdapter3.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                    this.textLayout = drawingTextCreateLayoutForText2;
                    if (drawingTextCreateLayoutForText2 == null || drawingTextCreateLayoutForText2.getLineCount() <= 0) {
                        iDp = 0;
                    } else {
                        DrawingText drawingText3 = this.currentBlock.numLayout;
                        if (drawingText3 != null && drawingText3.getLineCount() > 0) {
                            this.numOffsetY = (AndroidUtilities.dp(2.5f) + this.currentBlock.numLayout.getLineAscent(0)) - this.textLayout.getLineAscent(0);
                        }
                        iDp = AndroidUtilities.dp(this.parent.pady()) + this.textLayout.getHeight();
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
                                iDp8 += AndroidUtilities.dp(this.parent.padx());
                                iDp3 = 0 - AndroidUtilities.dp(this.parent.pady());
                            } else {
                                if ((view instanceof BlockHeaderCell) || (view instanceof BlockSubheaderCell) || (view instanceof BlockTitleCell) || (view instanceof BlockSubtitleCell)) {
                                    WebpageAdapter webpageAdapter5 = this.adapter;
                                    if (webpageAdapter5 == null || !webpageAdapter5.isRtl) {
                                        this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                    }
                                    iDp2 = AndroidUtilities.dp(this.parent.padx());
                                } else if (ArticleViewer.isListItemBlock(pageBlock)) {
                                    this.blockX = 0;
                                    this.blockY = 0;
                                    this.textY = 0;
                                    TL_pageBlockListItem tL_pageBlockListItem5 = this.currentBlock;
                                    iDp3 = ((tL_pageBlockListItem5.index == 0 && tL_pageBlockListItem5.parent.level == 0) ? 0 - AndroidUtilities.dp(this.parent.pady() + 2) : 0) - AndroidUtilities.dp(this.parent.pady());
                                    iDp8 = size;
                                } else {
                                    if (this.blockLayout.itemView instanceof BlockTableCell) {
                                        this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                        iDp2 = AndroidUtilities.dp(this.parent.padx() * 2);
                                    }
                                    iDp3 = 0;
                                }
                                iDp8 += iDp2;
                                iDp3 = 0;
                            }
                            this.blockLayout.itemView.measure(View.MeasureSpec.makeMeasureSpec(iDp8, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            if ((this.blockLayout.itemView instanceof BlockParagraphCell) && (drawingText = this.currentBlock.numLayout) != null && drawingText.getLineCount() > 0 && (drawingText2 = (blockParagraphCell = (BlockParagraphCell) this.blockLayout.itemView).textLayout) != null && drawingText2.getLineCount() > 0) {
                                this.numOffsetY = (AndroidUtilities.dp(2.5f) + this.currentBlock.numLayout.getLineAscent(0)) - blockParagraphCell.textLayout.getLineAscent(0);
                            }
                            TL_pageBlockListItem tL_pageBlockListItem6 = this.currentBlock;
                            if (tL_pageBlockListItem6.blockItem instanceof TL_iv.pageBlockDetails) {
                                this.verticalAlign = true;
                                this.blockY = 0;
                                if (tL_pageBlockListItem6.index == 0 && tL_pageBlockListItem6.parent.level == 0) {
                                    iDp3 -= AndroidUtilities.dp(this.parent.pady() + 2);
                                }
                                iDp3 -= AndroidUtilities.dp(this.parent.pady());
                            } else {
                                View view2 = this.blockLayout.itemView;
                                if (view2 instanceof BlockOrderedListItemCell) {
                                    this.verticalAlign = ((BlockOrderedListItemCell) view2).verticalAlign;
                                } else if (view2 instanceof BlockListItemCell) {
                                    this.verticalAlign = ((BlockListItemCell) view2).verticalAlign;
                                }
                            }
                            if (this.verticalAlign && this.currentBlock.numLayout != null) {
                                this.textY = ((this.blockLayout.itemView.getMeasuredHeight() - this.currentBlock.numLayout.getHeight()) / 2) - AndroidUtilities.dp(4.0f);
                                this.drawDot = false;
                            }
                            measuredHeight = this.blockLayout.itemView.getMeasuredHeight() + iDp3;
                        } else {
                            measuredHeight = 0;
                        }
                        iDp = measuredHeight + AndroidUtilities.dp(this.parent.pady());
                    } else {
                        iDp = 0;
                    }
                }
                if (zzin.m(1, this.currentBlock.parent.items) == this.currentBlock) {
                    iDp += AndroidUtilities.dp(this.parent.pady());
                }
                TL_pageBlockListItem tL_pageBlockListItem7 = this.currentBlock;
                iDp4 = (tL_pageBlockListItem7.index == 0 && tL_pageBlockListItem7.parent.level == 0) ? AndroidUtilities.dp(this.parent.pady() + 2) + iDp : iDp;
                DrawingText drawingText4 = this.textLayout;
                if (drawingText4 != null) {
                    drawingText4.x = this.textX;
                    drawingText4.y = this.textY;
                }
                RecyclerView.ViewHolder viewHolder2 = this.blockLayout;
                if (viewHolder2 != null && (viewHolder2.itemView instanceof TextSelectionHelper.ArticleSelectableView) && (textSelectionHelper = this.parent.getTextSelectionHelper(null)) != null) {
                    ArrayList arrayList = textSelectionHelper.arrayList;
                    arrayList.clear();
                    ((TextSelectionHelper.ArticleSelectableView) this.blockLayout.itemView).fillTextLayoutBlocks(arrayList);
                    int size3 = arrayList.size();
                    while (i3 < size3) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) obj;
                        if (textLayoutBlock instanceof DrawingText) {
                            DrawingText drawingText5 = (DrawingText) textLayoutBlock;
                            drawingText5.x += this.blockX;
                            drawingText5.y += this.blockY;
                        }
                    }
                }
            }
            setMeasuredDimension(size, iDp4);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_pageBlockListItem tL_pageBlockListItem) {
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

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
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

        @Override
        public void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            Theme.chat_docBackPaint.setColor(this.parent.getThemedColor(Theme.key_chat_inLocationBackground));
            canvas.drawRect(this.imageView.getImageX(), this.imageView.getImageY(), this.imageView.getImageX2(), this.imageView.getImageY2(), Theme.chat_docBackPaint);
            float centerX = this.imageView.getCenterX();
            Drawable[] drawableArr = Theme.chat_locationDrawable;
            int i = 0;
            int intrinsicWidth = (int) (centerX - (drawableArr[0].getIntrinsicWidth() / 2));
            int centerY = (int) (this.imageView.getCenterY() - (drawableArr[0].getIntrinsicHeight() / 2));
            Drawable drawable = drawableArr[0];
            drawable.setBounds(intrinsicWidth, centerY, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + centerY);
            drawableArr[0].draw(canvas);
            this.imageView.draw(canvas);
            if (this.currentMapProvider == 2 && this.imageView.hasNotThumb()) {
                if (this.chat_redLocationIcon == null) {
                    this.chat_redLocationIcon = getContext().getDrawable(R.drawable.map_pin).mutate();
                }
                int intrinsicWidth2 = (int) (this.chat_redLocationIcon.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.chat_redLocationIcon.getIntrinsicHeight() * 0.8f);
                int iM = (int) ImageReceiver$$ExternalSyntheticOutline0.m(this.imageView.getImageWidth(), intrinsicWidth2, 2.0f, this.imageView.getImageX());
                int imageHeight = (int) (((this.imageView.getImageHeight() / 2.0f) - intrinsicHeight) + this.imageView.getImageY());
                this.chat_redLocationIcon.setAlpha((int) (this.imageView.getCurrentAlpha() * 255.0f));
                this.chat_redLocationIcon.setBounds(iM, imageHeight, intrinsicWidth2 + iM, intrinsicHeight + imageHeight);
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
        public void onMeasure(int i, int i2) {
            int measuredWidth;
            int iDp;
            int iM$1;
            int i3;
            int height;
            int i4;
            int i5;
            int size = View.MeasureSpec.getSize(i);
            int i6 = this.currentType;
            int iDp2 = 1;
            if (i6 == 1) {
                measuredWidth = ((View) getParent()).getMeasuredWidth();
                size = ((View) getParent()).getMeasuredHeight();
            } else {
                measuredWidth = size;
                if (i6 != 2) {
                    size = 0;
                }
            }
            TL_iv.pageBlockMap pageblockmap = this.currentBlock;
            if (pageblockmap != null) {
                if (this.currentType != 0 || (i5 = pageblockmap.level) <= 0) {
                    this.textX = AndroidUtilities.dp(18.0f);
                    iDp = measuredWidth - AndroidUtilities.dp(36.0f);
                    iM$1 = measuredWidth;
                    i3 = 0;
                } else {
                    int iDp3 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i5 * 14);
                    this.textX = iDp3;
                    iM$1 = OKLCH.m$1(18.0f, iDp3, measuredWidth);
                    i3 = iDp3;
                    iDp = iM$1;
                }
                if (this.currentType == 0) {
                    TL_iv.pageBlockMap pageblockmap2 = this.currentBlock;
                    size = (int) ((iM$1 / pageblockmap2.w) * pageblockmap2.h);
                    Point point = AndroidUtilities.displaySize;
                    int iMax = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                    if (size > iMax) {
                        TL_iv.pageBlockMap pageblockmap3 = this.currentBlock;
                        iM$1 = (int) ((iMax / pageblockmap3.h) * pageblockmap3.w);
                        i3 += ((measuredWidth - i3) - iM$1) / 2;
                        height = iMax;
                    } else {
                        height = size;
                    }
                } else {
                    height = size;
                }
                ImageReceiver imageReceiver = this.imageView;
                float f = i3;
                float fDp = (this.isFirst || (i4 = this.currentType) == 1 || i4 == 2 || this.currentBlock.level > 0) ? 0.0f : AndroidUtilities.dp(8.0f);
                float f2 = iM$1;
                float f3 = height;
                imageReceiver.setImageCoords(f, fDp, f2, f3);
                int currentAccount = this.parent.getCurrentAccount();
                TLRPC.GeoPoint geoPoint = this.currentBlock.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                float f4 = AndroidUtilities.density;
                String strFormapMapUrl = AndroidUtilities.formapMapUrl(currentAccount, d, d2, (int) (f2 / f4), (int) (f3 / f4), true, 15, -1);
                TLRPC.GeoPoint geoPoint2 = this.currentBlock.geo;
                float f5 = AndroidUtilities.density;
                WebFile webFileCreateWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f2 / f5), (int) (f3 / f5), 15, Math.min(2, (int) Math.ceil(f5)));
                int i7 = MessagesController.getInstance(currentAccount).mapProvider;
                this.currentMapProvider = i7;
                if (i7 == 2) {
                    if (webFileCreateWithGeoPoint != null) {
                        ImageReceiver imageReceiver2 = this.imageView;
                        ImageLocation forWebFile = ImageLocation.getForWebFile(webFileCreateWithGeoPoint);
                        WebpageAdapter webpageAdapter = this.adapter;
                        imageReceiver2.setImage(forWebFile, null, null, null, webpageAdapter != null ? webpageAdapter.currentPage : null, 0);
                    }
                } else if (strFormapMapUrl != null) {
                    this.imageView.setImage(strFormapMapUrl, null, null, null, 0L);
                }
                int imageHeight = (int) (this.imageView.getImageHeight() + this.imageView.getImageY() + AndroidUtilities.dp(8.0f));
                this.textY = imageHeight;
                if (this.currentType == 0) {
                    IArticleViewer iArticleViewer = this.parent;
                    TL_iv.pageBlockMap pageblockmap4 = this.currentBlock;
                    int i8 = iDp;
                    DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockmap4.caption.text, i8, imageHeight, pageblockmap4, this.adapter);
                    this.captionLayout = drawingTextCreateLayoutForText;
                    if (drawingTextCreateLayoutForText != null) {
                        int height2 = this.captionLayout.getHeight() + AndroidUtilities.dp(4.0f);
                        this.creditOffset = height2;
                        height = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(4.0f, height2, height);
                        DrawingText drawingText = this.captionLayout;
                        drawingText.x = this.textX;
                        drawingText.y = this.textY;
                    }
                    int i9 = height;
                    IArticleViewer iArticleViewer2 = this.parent;
                    TL_iv.pageBlockMap pageblockmap5 = this.currentBlock;
                    TL_iv.RichText richText = pageblockmap5.caption.credit;
                    int i10 = this.creditOffset + this.textY;
                    WebpageAdapter webpageAdapter2 = this.adapter;
                    DrawingText drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, richText, i8, i10, pageblockmap5, (webpageAdapter2 == null || !webpageAdapter2.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                    this.creditLayout = drawingTextCreateLayoutForText2;
                    if (drawingTextCreateLayoutForText2 != null) {
                        height = this.creditLayout.getHeight() + AndroidUtilities.dp(4.0f) + i9;
                        DrawingText drawingText2 = this.creditLayout;
                        drawingText2.x = this.textX;
                        drawingText2.y = this.textY + this.creditOffset;
                    } else {
                        height = i9;
                    }
                }
                iDp2 = (this.isFirst || this.currentType != 0 || this.currentBlock.level > 0) ? height : AndroidUtilities.dp(8.0f) + height;
                if (this.currentType != 2) {
                    iDp2 += AndroidUtilities.dp(8.0f);
                }
            }
            setMeasuredDimension(measuredWidth, iDp2);
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

        public void setBlock(TL_iv.pageBlockMap pageblockmap, boolean z, boolean z2) {
            this.currentBlock = pageblockmap;
            this.isFirst = z;
            requestLayout();
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

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public int getLastLineBoundRight() {
            return getBoundRight();
        }

        @Override
        public int getMinWidth() {
            return this.width;
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void setBlock(TL_iv.pageBlockMath pageblockmath) {
            Latex latexRender;
            this.currentBlock = pageblockmath;
            this.imageView.setImageBitmap(null);
            this.imageView.setPadding(AndroidUtilities.dp(this.parent.padx()), 0, AndroidUtilities.dp(this.parent.padx()), 0);
            this.imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
            this.width = AndroidUtilities.dp(this.parent.padx() * 2);
            if (pageblockmath == null || (latexRender = Latex.render(pageblockmath.source, AndroidUtilities.dp(20.0f), false)) == null) {
                return;
            }
            this.imageView.setImageBitmap((Bitmap) latexRender.bitmap);
            ImageView imageView = this.imageView;
            int iDp = AndroidUtilities.dp(this.parent.padx() * 2) + latexRender.width;
            this.width = iDp;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(iDp, latexRender.height));
        }

        @Override
        public void updateColors() {
            this.imageView.setColorFilter(new PorterDuffColorFilter(this.parent.getTextColor(), PorterDuff.Mode.SRC_IN));
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

        public BlockOrderedListItemCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
            setWillNotDraw(false);
        }

        private int numLayoutX() {
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            DrawingText drawingText = tL_pageBlockOrderedListItem != null ? tL_pageBlockOrderedListItem.numLayout : null;
            if (drawingText == null) {
                return 0;
            }
            WebpageAdapter webpageAdapter = this.adapter;
            if (webpageAdapter == null || !webpageAdapter.isRtl) {
                return RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(20.0f, this.currentBlock.parent.level, (AndroidUtilities.dp(this.parent.padx()) + this.currentBlock.parent.maxNumWidth) - ((int) Math.ceil(drawingText.getLineWidth(0))));
            }
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.parent.padx());
            TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = this.currentBlock.parent;
            return OKLCH.m$3(20.0f, tL_pageBlockOrderedListParent.level, measuredWidth - tL_pageBlockOrderedListParent.maxNumWidth);
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

        @Override
        public int getBoundLeft() {
            int boundLeft;
            int iDp = AndroidUtilities.dp(this.parent.padx());
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            int iMin = (tL_pageBlockOrderedListItem == null || tL_pageBlockOrderedListItem.numLayout == null) ? Integer.MAX_VALUE : Math.min(Integer.MAX_VALUE, (this.currentBlock.numLayout.getBoundLeft() + numLayoutX()) - iDp);
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                iMin = Math.min(iMin, (drawingText.getBoundLeft() + drawingText.x) - iDp);
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
            int iMax = (tL_pageBlockOrderedListItem == null || tL_pageBlockOrderedListItem.numLayout == null) ? Integer.MIN_VALUE : Math.max(Integer.MIN_VALUE, this.currentBlock.numLayout.getBoundRight() + numLayoutX() + iDp);
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                iMax = Math.max(iMax, drawingText.getBoundRight() + drawingText.x + iDp);
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
            int iDp;
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                RecyclerView.ViewHolder viewHolder = this.blockLayout;
                if (viewHolder != null) {
                    KeyEvent.Callback callback = viewHolder.itemView;
                    if ((callback instanceof IBlock) && (lastLineBoundRight = ((IBlock) callback).getLastLineBoundRight()) != -1) {
                        iDp = this.blockX;
                    }
                }
                return -1;
            }
            lastLineBoundRight = drawingText.getLastLineBoundRight() + drawingText.x;
            iDp = AndroidUtilities.dp(this.parent.padx());
            return iDp + lastLineBoundRight;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
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
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (this.currentBlock.numLayout != null) {
                canvas.save();
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter == null || !webpageAdapter.isRtl) {
                    int iDp = AndroidUtilities.dp(this.parent.padx());
                    TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
                    canvas.translate(RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(20.0f, this.currentBlock.parent.level, (iDp + tL_pageBlockOrderedListItem.parent.maxNumWidth) - ((int) Math.ceil(tL_pageBlockOrderedListItem.numLayout.getLineWidth(0)))), this.textY + this.numOffsetY);
                } else {
                    int iDp2 = measuredWidth - AndroidUtilities.dp(this.parent.padx());
                    TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = this.currentBlock.parent;
                    canvas.translate(OKLCH.m$3(20.0f, tL_pageBlockOrderedListParent.level, iDp2 - tL_pageBlockOrderedListParent.maxNumWidth), this.textY + this.numOffsetY);
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
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            RecyclerView.ViewHolder viewHolder = this.blockLayout;
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                int i5 = this.blockX;
                view.layout(i5, this.blockY, view.getMeasuredWidth() + i5, this.blockLayout.itemView.getMeasuredHeight() + this.blockY);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int measuredHeight;
            int iDp;
            int iDp2;
            int iDp3;
            DrawingText drawingText;
            BlockParagraphCell blockParagraphCell;
            DrawingText drawingText2;
            TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
            int size = View.MeasureSpec.getSize(i);
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem = this.currentBlock;
            int iDp4 = 1;
            if (tL_pageBlockOrderedListItem != null) {
                this.textLayout = null;
                int i3 = 0;
                this.textY = (tL_pageBlockOrderedListItem.index == 0 && tL_pageBlockOrderedListItem.parent.level == 0) ? AndroidUtilities.dp(10.0f) : 0;
                this.numOffsetY = 0;
                TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = this.currentBlock.parent;
                if (tL_pageBlockOrderedListParent.lastMaxNumCalcWidth != size || tL_pageBlockOrderedListParent.lastFontSize != SharedConfig.ivFontSize) {
                    tL_pageBlockOrderedListParent.lastMaxNumCalcWidth = size;
                    tL_pageBlockOrderedListParent.lastFontSize = SharedConfig.ivFontSize;
                    tL_pageBlockOrderedListParent.maxNumWidth = 0;
                    int size2 = tL_pageBlockOrderedListParent.items.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = this.currentBlock.parent.items.get(i4);
                        String str = tL_pageBlockOrderedListItem2.num;
                        if (str != null) {
                            IArticleViewer iArticleViewer = this.parent;
                            DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, str, (TL_iv.RichText) null, size - AndroidUtilities.dp(iArticleViewer.padx() * 3), this.textY, this.currentBlock, this.adapter);
                            tL_pageBlockOrderedListItem2.numLayout = drawingTextCreateLayoutForText;
                            TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent2 = this.currentBlock.parent;
                            tL_pageBlockOrderedListParent2.maxNumWidth = Math.max(tL_pageBlockOrderedListParent2.maxNumWidth, (int) Math.ceil(drawingTextCreateLayoutForText.getLineWidth(0)));
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
                    int iDp5 = AndroidUtilities.dp(this.parent.padx() + (this.checkbox == null ? 0 : 26) + 6);
                    TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent4 = this.currentBlock.parent;
                    this.textX = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(20.0f, tL_pageBlockOrderedListParent4.level, iDp5 + tL_pageBlockOrderedListParent4.maxNumWidth);
                } else {
                    this.textX = AndroidUtilities.dp(this.parent.padx() + (this.checkbox == null ? 0 : 26));
                }
                this.verticalAlign = false;
                int iDp6 = (size - AndroidUtilities.dp(this.parent.padx())) - this.textX;
                WebpageAdapter webpageAdapter2 = this.adapter;
                if (webpageAdapter2 != null && webpageAdapter2.isRtl) {
                    int iDp7 = AndroidUtilities.dp(6.0f);
                    TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent5 = this.currentBlock.parent;
                    iDp6 -= (AndroidUtilities.dp(20.0f) * tL_pageBlockOrderedListParent5.level) + (iDp7 + tL_pageBlockOrderedListParent5.maxNumWidth);
                }
                int iDp8 = iDp6;
                TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem3 = this.currentBlock;
                TL_iv.RichText richText = tL_pageBlockOrderedListItem3.textItem;
                if (richText != null) {
                    IArticleViewer iArticleViewer2 = this.parent;
                    int i5 = this.textY;
                    WebpageAdapter webpageAdapter3 = this.adapter;
                    DrawingText drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, richText, iDp8, i5, tL_pageBlockOrderedListItem3, (webpageAdapter3 == null || !webpageAdapter3.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                    this.textLayout = drawingTextCreateLayoutForText2;
                    if (drawingTextCreateLayoutForText2 == null || drawingTextCreateLayoutForText2.getLineCount() <= 0) {
                        iDp = 0;
                    } else {
                        DrawingText drawingText3 = this.currentBlock.numLayout;
                        if (drawingText3 != null && drawingText3.getLineCount() > 0) {
                            this.numOffsetY = this.currentBlock.numLayout.getLineAscent(0) - this.textLayout.getLineAscent(0);
                        }
                        iDp = AndroidUtilities.dp(8.0f) + this.textLayout.getHeight();
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
                                iDp8 += AndroidUtilities.dp(18.0f);
                                iDp3 = 0 - AndroidUtilities.dp(8.0f);
                            } else {
                                if ((view instanceof BlockHeaderCell) || (view instanceof BlockSubheaderCell) || (view instanceof BlockTitleCell) || (view instanceof BlockSubtitleCell)) {
                                    WebpageAdapter webpageAdapter5 = this.adapter;
                                    if (webpageAdapter5 == null || !webpageAdapter5.isRtl) {
                                        this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                    }
                                    iDp2 = AndroidUtilities.dp(this.parent.padx());
                                } else if (ArticleViewer.isListItemBlock(pageBlock)) {
                                    this.blockX = 0;
                                    this.blockY = 0;
                                    this.textY = 0;
                                    iDp3 = 0 - AndroidUtilities.dp(8.0f);
                                    iDp8 = size;
                                } else {
                                    if (this.blockLayout.itemView instanceof BlockTableCell) {
                                        this.blockX -= AndroidUtilities.dp(this.parent.padx());
                                        iDp2 = AndroidUtilities.dp(36.0f);
                                    }
                                    iDp3 = 0;
                                }
                                iDp8 += iDp2;
                                iDp3 = 0;
                            }
                            this.blockLayout.itemView.measure(View.MeasureSpec.makeMeasureSpec(iDp8, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                            if ((this.blockLayout.itemView instanceof BlockParagraphCell) && (drawingText = this.currentBlock.numLayout) != null && drawingText.getLineCount() > 0 && (drawingText2 = (blockParagraphCell = (BlockParagraphCell) this.blockLayout.itemView).textLayout) != null && drawingText2.getLineCount() > 0) {
                                this.numOffsetY = this.currentBlock.numLayout.getLineAscent(0) - blockParagraphCell.textLayout.getLineAscent(0);
                            }
                            if (this.currentBlock.blockItem instanceof TL_iv.pageBlockDetails) {
                                this.verticalAlign = true;
                                this.blockY = 0;
                                iDp3 -= AndroidUtilities.dp(8.0f);
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
                            measuredHeight = this.blockLayout.itemView.getMeasuredHeight() + iDp3;
                        } else {
                            measuredHeight = 0;
                        }
                        iDp = measuredHeight + AndroidUtilities.dp(8.0f);
                    } else {
                        iDp = 0;
                    }
                }
                if (zzin.m(1, this.currentBlock.parent.items) == this.currentBlock) {
                    iDp += AndroidUtilities.dp(8.0f);
                }
                TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem4 = this.currentBlock;
                iDp4 = (tL_pageBlockOrderedListItem4.index == 0 && tL_pageBlockOrderedListItem4.parent.level == 0) ? AndroidUtilities.dp(10.0f) + iDp : iDp;
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
                    ArrayList arrayList = textSelectionHelper.arrayList;
                    arrayList.clear();
                    ((TextSelectionHelper.ArticleSelectableView) this.blockLayout.itemView).fillTextLayoutBlocks(arrayList);
                    int size3 = arrayList.size();
                    while (i3 < size3) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        TextSelectionHelper.TextLayoutBlock textLayoutBlock = (TextSelectionHelper.TextLayoutBlock) obj;
                        if (textLayoutBlock instanceof DrawingText) {
                            DrawingText drawingText6 = (DrawingText) textLayoutBlock;
                            drawingText6.x += this.blockX;
                            drawingText6.y += this.blockY;
                        }
                    }
                }
            }
            setMeasuredDimension(size, iDp4);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY)) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem) {
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
    }

    public static class BlockParagraphCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockParagraph currentBlock;
        private final IArticleViewer parent;
        public DrawingText textLayout;
        public int textX;
        public int textY;

        public BlockParagraphCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.getBoundLeft() + drawingText.x) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getBoundRight() + drawingText.x;
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getLastLineBoundRight() + drawingText.x;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
        public void onMeasure(int i, int i2) {
            int iDp;
            Layout.Alignment alignmentALIGN_RIGHT;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockParagraph pageblockparagraph = this.currentBlock;
            if (pageblockparagraph != null) {
                iDp = 0;
                if (pageblockparagraph.level == 0) {
                    this.textY = AndroidUtilities.dp(this.parent.pady());
                    this.textX = AndroidUtilities.dp(this.parent.padx());
                } else {
                    this.textY = 0;
                    this.textX = AndroidUtilities.dp((this.currentBlock.level * 14) + this.parent.padx());
                }
                if (this.currentBlock.text instanceof TL_iv.textMath) {
                    alignmentALIGN_RIGHT = Layout.Alignment.ALIGN_CENTER;
                } else {
                    WebpageAdapter webpageAdapter = this.adapter;
                    alignmentALIGN_RIGHT = (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT();
                }
                Layout.Alignment alignment = alignmentALIGN_RIGHT;
                IArticleViewer iArticleViewer = this.parent;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, null, this.currentBlock.text, (size - AndroidUtilities.dp(iArticleViewer.padx())) - this.textX, this.textY, this.currentBlock, alignment, 0, this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    iDp = (this.currentBlock.level > 0 ? AndroidUtilities.dp(this.parent.pady()) : AndroidUtilities.dp(this.parent.pady() * 2)) + drawingTextCreateLayoutForText.getHeight();
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
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
            this.currentBlock = pageblockparagraph;
            requestLayout();
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

        private int getIconForCurrentState() {
            int i = this.buttonState;
            if (i == 0) {
                return 2;
            }
            return i == 1 ? 3 : 4;
        }

        public void lambda$onMeasure$0() {
            requestLayout();
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

        public View getChannelCell() {
            return this.channelCell;
        }

        public TL_iv.pageBlockPhoto getCurrentBlock() {
            return this.currentBlock;
        }

        public TLObject getCurrentPage() {
            return this.currentPage;
        }

        public ImageReceiver getImageView() {
            return this.imageView;
        }

        @Override
        public int getObserverTag() {
            return this.TAG;
        }

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
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
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            if (this.currentBlock == null) {
                return;
            }
            if (this.imageView.hasBitmapImage() && this.imageView.getCurrentAlpha() == 1.0f) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(this.imageView.getImageX(), this.imageView.getImageY(), this.imageView.getImageX2(), this.imageView.getImageY2(), ArticleViewer.photoBackgroundPaint);
            }
            this.imageView.draw(canvas2);
            if (this.imageView.getVisible()) {
                this.radialProgress.draw(canvas2);
            }
            if (!TextUtils.isEmpty(this.currentBlock.url) && !(this.currentPhoto instanceof WebInstantView.WebPhoto)) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(35.0f);
                int imageY = (int) (this.imageView.getImageY() + AndroidUtilities.dp(11.0f));
                this.linkDrawable.setBounds(measuredWidth, imageY, AndroidUtilities.dp(24.0f) + measuredWidth, AndroidUtilities.dp(24.0f) + imageY);
                this.linkDrawable.draw(canvas2);
            }
            int i = 0;
            if (this.captionLayout != null) {
                canvas2.save();
                canvas2.translate(this.textX, this.textY);
                ArticleViewer.drawTextSelection(this.parent, canvas2, this, 0);
                this.captionLayout.draw(canvas2, this);
                canvas2.restore();
                i = 1;
            }
            if (this.creditLayout != null) {
                canvas2.save();
                canvas2.translate(this.textX, this.textY + this.creditOffset);
                ArticleViewer.drawTextSelection(this.parent, canvas2, this, i);
                this.creditLayout.draw(canvas2, this);
                canvas2.restore();
            }
            ArticleViewer.drawQuoteLines(canvas2, this.parent, this.currentBlock, getMeasuredHeight());
        }

        @Override
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(false);
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
        public void onMeasure(int i, int i2) {
            int i3;
            int iCeil;
            TL_iv.pageBlockPhoto pageblockphoto;
            int iDp;
            int iDp2;
            int iDp3;
            TLRPC.Photo photo;
            float f;
            int iDp4;
            int imageHeight;
            boolean z;
            DrawingText drawingText;
            DrawingText drawingText2;
            WebpageAdapter webpageAdapter;
            DrawingText drawingTextCreateLayoutForText;
            int i4;
            WebpageAdapter webpageAdapter2;
            Layout.Alignment alignmentALIGN_RIGHT;
            DrawingText drawingTextCreateLayoutForText2;
            int i5;
            int i6;
            int iDp5;
            float fDp;
            boolean z2;
            WebpageAdapter webpageAdapter3;
            Object obj;
            WebInstantView.WebPhoto webPhoto;
            ImageReceiver imageReceiver;
            VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1;
            WebInstantView webInstantView;
            int i7;
            int i8;
            int size = View.MeasureSpec.getSize(i);
            int i9 = this.currentType;
            int iDp6 = 1;
            if (i9 != 1) {
                if (i9 == 2) {
                    float f2 = this.groupPosition.ph;
                    Point point = AndroidUtilities.displaySize;
                    iCeil = (int) Math.ceil(f2 * Math.max(point.x, point.y) * 0.5f);
                } else {
                    i3 = size;
                    iCeil = 0;
                }
                pageblockphoto = this.currentBlock;
                if (pageblockphoto != null) {
                    this.currentPhoto = WebPageUtils.getPhotoWithId(this.currentPage, pageblockphoto.photo_id);
                    int iDp7 = AndroidUtilities.dp(48.0f);
                    if (this.currentType == 0 || (i8 = this.currentBlock.level) <= 0) {
                        this.textX = AndroidUtilities.dp(18.0f);
                        iDp = i3 - AndroidUtilities.dp(36.0f);
                        iDp2 = i3;
                        iDp3 = 0;
                    } else {
                        iDp3 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i8 * 14);
                        this.textX = iDp3;
                        iDp2 = OKLCH.m$1(18.0f, iDp3, i3);
                        iDp = iDp2;
                    }
                    photo = this.currentPhoto;
                    if (photo != null || (this.currentPhotoObject == null && !(photo instanceof WebInstantView.WebPhoto))) {
                        f = 8.0f;
                    } else {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40, true);
                        this.currentPhotoObjectThumb = closestPhotoSizeWithSize;
                        TLRPC.PhotoSize photoSize = this.currentPhotoObject;
                        if (photoSize == closestPhotoSizeWithSize) {
                            this.currentPhotoObjectThumb = null;
                        }
                        TLRPC.Photo photo2 = this.currentPhoto;
                        if (photo2 instanceof WebInstantView.WebPhoto) {
                            WebInstantView.WebPhoto webPhoto2 = (WebInstantView.WebPhoto) photo2;
                            i5 = webPhoto2.w;
                            i6 = webPhoto2.h;
                        } else {
                            int i10 = photoSize.w;
                            int i11 = photoSize.h;
                            i5 = i10;
                            i6 = i11;
                        }
                        int i12 = this.currentType;
                        if (i12 == 0) {
                            float f3 = i5;
                            float f4 = i6;
                            iCeil = (int) ((iDp2 / f3) * f4);
                            if (this.parentBlock instanceof TL_iv.pageBlockCover) {
                                iCeil = Math.min(iCeil, iDp2);
                            } else {
                                Point point2 = AndroidUtilities.displaySize;
                                int iMax = (int) ((Math.max(point2.x, point2.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (iCeil > iMax) {
                                    iDp2 = (int) ((iMax / f4) * f3);
                                    iDp3 += ((i3 - iDp3) - iDp2) / 2;
                                    iCeil = iMax;
                                }
                            }
                        } else {
                            if (i12 == 2) {
                                if ((this.groupPosition.flags & 2) == 0) {
                                    iDp2 -= AndroidUtilities.dp(2.0f);
                                }
                                iDp5 = (this.groupPosition.flags & 8) == 0 ? iCeil - AndroidUtilities.dp(2.0f) : iCeil;
                                int i13 = this.groupPosition.leftSpanOffset;
                                if (i13 != 0) {
                                    f = 8.0f;
                                    int iCeil2 = (int) Math.ceil((i13 * i3) / 1000.0f);
                                    iDp2 -= iCeil2;
                                    iDp3 += iCeil2;
                                } else {
                                    f = 8.0f;
                                }
                            }
                            ImageReceiver imageReceiver2 = this.imageView;
                            float f5 = iDp3;
                            if (!this.isFirst || (i7 = this.currentType) == 1 || i7 == 2 || this.currentBlock.level > 0) {
                                fDp = 0.0f;
                            } else {
                                fDp = AndroidUtilities.dp(f);
                            }
                            imageReceiver2.setImageCoords(f5, fDp, iDp2, iDp5);
                            if (this.currentType == 0) {
                                this.currentFilter = null;
                            } else {
                                Locale locale = Locale.US;
                                this.currentFilter = iDp2 + "_" + iDp5;
                            }
                            this.currentThumbFilter = "80_80_b";
                            if ((DownloadController.getInstance(this.parent.getCurrentAccount()).getCurrentDownloadMask() & 1) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.autoDownload = z2;
                            if (!this.calcHeight) {
                                if (this.currentPhoto instanceof WebInstantView.WebPhoto) {
                                    this.autoDownload = true;
                                    this.imageView.setStrippedLocation(null);
                                    webPhoto = (WebInstantView.WebPhoto) this.currentPhoto;
                                    imageReceiver = this.imageView;
                                    voIPFragment$8$$ExternalSyntheticLambda1 = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 24);
                                    HashMap map = WebInstantView.instants;
                                    if (webPhoto != null && (webInstantView = webPhoto.instantView) != null) {
                                        webInstantView.loadPhotoInternal(webPhoto, imageReceiver, voIPFragment$8$$ExternalSyntheticLambda1);
                                    }
                                } else {
                                    File pathToAttach = FileLoader.getInstance(this.parent.getCurrentAccount()).getPathToAttach(this.currentPhotoObject, true);
                                    if (!this.autoDownload || pathToAttach.exists()) {
                                        this.imageView.setStrippedLocation(null);
                                        ImageReceiver imageReceiver3 = this.imageView;
                                        ImageLocation forPhoto = ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto);
                                        String str = this.currentFilter;
                                        ImageLocation forPhoto2 = ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto);
                                        String str2 = this.currentThumbFilter;
                                        long j = this.currentPhotoObject.size;
                                        webpageAdapter3 = this.adapter;
                                        if (webpageAdapter3 != null) {
                                            obj = webpageAdapter3.currentPage;
                                        } else {
                                            obj = this.parentObject;
                                        }
                                        imageReceiver3.setImage(forPhoto, str, forPhoto2, str2, j, null, obj, 1);
                                    } else {
                                        this.imageView.setStrippedLocation(ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto));
                                        ImageReceiver imageReceiver4 = this.imageView;
                                        String str3 = this.currentFilter;
                                        ImageLocation forPhoto3 = ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto);
                                        String str4 = this.currentThumbFilter;
                                        long j2 = this.currentPhotoObject.size;
                                        WebpageAdapter webpageAdapter4 = this.adapter;
                                        imageReceiver4.setImage(null, str3, forPhoto3, str4, j2, null, webpageAdapter4 != null ? webpageAdapter4.currentPage : this.parentObject, 1);
                                    }
                                }
                            }
                            float f6 = iDp7;
                            this.buttonX = (int) ImageReceiver$$ExternalSyntheticOutline0.m(this.imageView.getImageWidth(), f6, 2.0f, this.imageView.getImageX());
                            int imageHeight2 = (int) (((this.imageView.getImageHeight() - f6) / 2.0f) + this.imageView.getImageY());
                            this.buttonY = imageHeight2;
                            RadialProgress2 radialProgress2 = this.radialProgress;
                            int i14 = this.buttonX;
                            radialProgress2.setProgressRect(i14, imageHeight2, i14 + iDp7, iDp7 + imageHeight2);
                        }
                        f = 8.0f;
                        iDp5 = iCeil;
                        ImageReceiver imageReceiver5 = this.imageView;
                        float f7 = iDp3;
                        if (this.isFirst) {
                            fDp = 0.0f;
                        } else {
                            fDp = 0.0f;
                        }
                        imageReceiver5.setImageCoords(f7, fDp, iDp2, iDp5);
                        if (this.currentType == 0) {
                            this.currentFilter = null;
                        } else {
                            Locale locale2 = Locale.US;
                            this.currentFilter = iDp2 + "_" + iDp5;
                        }
                        this.currentThumbFilter = "80_80_b";
                        if ((DownloadController.getInstance(this.parent.getCurrentAccount()).getCurrentDownloadMask() & 1) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.autoDownload = z2;
                        if (!this.calcHeight) {
                            if (this.currentPhoto instanceof WebInstantView.WebPhoto) {
                                this.autoDownload = true;
                                this.imageView.setStrippedLocation(null);
                                webPhoto = (WebInstantView.WebPhoto) this.currentPhoto;
                                imageReceiver = this.imageView;
                                voIPFragment$8$$ExternalSyntheticLambda1 = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 24);
                                HashMap map2 = WebInstantView.instants;
                                if (webPhoto != null) {
                                    webInstantView.loadPhotoInternal(webPhoto, imageReceiver, voIPFragment$8$$ExternalSyntheticLambda1);
                                }
                            } else {
                                File pathToAttach2 = FileLoader.getInstance(this.parent.getCurrentAccount()).getPathToAttach(this.currentPhotoObject, true);
                                if (this.autoDownload) {
                                    this.imageView.setStrippedLocation(null);
                                    ImageReceiver imageReceiver6 = this.imageView;
                                    ImageLocation forPhoto4 = ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto);
                                    String str5 = this.currentFilter;
                                    ImageLocation forPhoto5 = ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto);
                                    String str6 = this.currentThumbFilter;
                                    long j3 = this.currentPhotoObject.size;
                                    webpageAdapter3 = this.adapter;
                                    if (webpageAdapter3 != null) {
                                        obj = webpageAdapter3.currentPage;
                                    } else {
                                        obj = this.parentObject;
                                    }
                                    imageReceiver6.setImage(forPhoto4, str5, forPhoto5, str6, j3, null, obj, 1);
                                } else {
                                    this.imageView.setStrippedLocation(null);
                                    ImageReceiver imageReceiver7 = this.imageView;
                                    ImageLocation forPhoto6 = ImageLocation.getForPhoto(this.currentPhotoObject, this.currentPhoto);
                                    String str7 = this.currentFilter;
                                    ImageLocation forPhoto7 = ImageLocation.getForPhoto(this.currentPhotoObjectThumb, this.currentPhoto);
                                    String str8 = this.currentThumbFilter;
                                    long j4 = this.currentPhotoObject.size;
                                    webpageAdapter3 = this.adapter;
                                    if (webpageAdapter3 != null) {
                                        obj = webpageAdapter3.currentPage;
                                    } else {
                                        obj = this.parentObject;
                                    }
                                    imageReceiver7.setImage(forPhoto6, str7, forPhoto7, str8, j4, null, obj, 1);
                                }
                            }
                        }
                        float f8 = iDp7;
                        this.buttonX = (int) ImageReceiver$$ExternalSyntheticOutline0.m(this.imageView.getImageWidth(), f8, 2.0f, this.imageView.getImageX());
                        int imageHeight3 = (int) (((this.imageView.getImageHeight() - f8) / 2.0f) + this.imageView.getImageY());
                        this.buttonY = imageHeight3;
                        RadialProgress2 radialProgress3 = this.radialProgress;
                        int i15 = this.buttonX;
                        radialProgress3.setProgressRect(i15, imageHeight3, i15 + iDp7, iDp7 + imageHeight3);
                    }
                    iDp4 = iCeil;
                    imageHeight = (int) (this.imageView.getImageHeight() + this.imageView.getImageY() + AndroidUtilities.dp(f));
                    this.textY = imageHeight;
                    if (this.currentType == 0) {
                        IArticleViewer iArticleViewer = this.parent;
                        TL_iv.pageBlockPhoto pageblockphoto2 = this.currentBlock;
                        drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockphoto2.caption.text, iDp, imageHeight, pageblockphoto2, this.adapter);
                        this.captionLayout = drawingTextCreateLayoutForText;
                        if (drawingTextCreateLayoutForText != null) {
                            int height = this.captionLayout.getHeight() + AndroidUtilities.dp(4.0f);
                            this.creditOffset = height;
                            iDp4 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(4.0f, height, iDp4);
                        }
                        i4 = iDp4;
                        IArticleViewer iArticleViewer2 = this.parent;
                        TL_iv.pageBlockPhoto pageblockphoto3 = this.currentBlock;
                        TL_iv.RichText richText = pageblockphoto3.caption.credit;
                        int i16 = this.creditOffset + this.textY;
                        webpageAdapter2 = this.adapter;
                        if (webpageAdapter2 == null && webpageAdapter2.isRtl) {
                            alignmentALIGN_RIGHT = StaticLayoutEx.ALIGN_RIGHT();
                        } else {
                            alignmentALIGN_RIGHT = Layout.Alignment.ALIGN_NORMAL;
                        }
                        drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, null, richText, iDp, i16, pageblockphoto3, alignmentALIGN_RIGHT, 0, this.adapter);
                        this.creditLayout = drawingTextCreateLayoutForText2;
                        if (drawingTextCreateLayoutForText2 != null) {
                            iDp4 = this.creditLayout.getHeight() + AndroidUtilities.dp(4.0f) + i4;
                        } else {
                            iDp4 = i4;
                        }
                    }
                    if (!this.isFirst && this.currentType == 0 && this.currentBlock.level <= 0) {
                        iDp4 += AndroidUtilities.dp(f);
                    }
                    if ((this.parentBlock instanceof TL_iv.pageBlockCover) || (webpageAdapter = this.adapter) == null || webpageAdapter.blocks == null || this.adapter.blocks.size() <= 1 || !(this.adapter.blocks.get(1) instanceof TL_iv.pageBlockChannel)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (this.currentType != 2 || z) {
                        iDp6 = iDp4;
                    } else {
                        iDp6 = AndroidUtilities.dp(f) + iDp4;
                    }
                    drawingText = this.captionLayout;
                    if (drawingText != null) {
                        drawingText.x = this.textX;
                        drawingText.y = this.textY;
                    }
                    drawingText2 = this.creditLayout;
                    if (drawingText2 != null) {
                        drawingText2.x = this.textX;
                        drawingText2.y = this.textY + this.creditOffset;
                    }
                }
                this.channelCell.measure(i, i2);
                this.channelCell.setTranslationY(this.imageView.getImageHeight() - AndroidUtilities.dp(39.0f));
                setMeasuredDimension(i3, iDp6);
            }
            size = ((View) getParent()).getMeasuredWidth();
            iCeil = ((View) getParent()).getMeasuredHeight();
            i3 = size;
            pageblockphoto = this.currentBlock;
            if (pageblockphoto != null) {
                this.currentPhoto = WebPageUtils.getPhotoWithId(this.currentPage, pageblockphoto.photo_id);
                int iDp8 = AndroidUtilities.dp(48.0f);
                if (this.currentType == 0) {
                    this.textX = AndroidUtilities.dp(18.0f);
                    iDp = i3 - AndroidUtilities.dp(36.0f);
                    iDp2 = i3;
                    iDp3 = 0;
                } else {
                    this.textX = AndroidUtilities.dp(18.0f);
                    iDp = i3 - AndroidUtilities.dp(36.0f);
                    iDp2 = i3;
                    iDp3 = 0;
                }
                photo = this.currentPhoto;
                if (photo != null) {
                    f = 8.0f;
                } else {
                    f = 8.0f;
                }
                iDp4 = iCeil;
                imageHeight = (int) (this.imageView.getImageHeight() + this.imageView.getImageY() + AndroidUtilities.dp(f));
                this.textY = imageHeight;
                if (this.currentType == 0) {
                    IArticleViewer iArticleViewer3 = this.parent;
                    TL_iv.pageBlockPhoto pageblockphoto4 = this.currentBlock;
                    drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer3, this, (CharSequence) null, pageblockphoto4.caption.text, iDp, imageHeight, pageblockphoto4, this.adapter);
                    this.captionLayout = drawingTextCreateLayoutForText;
                    if (drawingTextCreateLayoutForText != null) {
                        int height2 = this.captionLayout.getHeight() + AndroidUtilities.dp(4.0f);
                        this.creditOffset = height2;
                        iDp4 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(4.0f, height2, iDp4);
                    }
                    i4 = iDp4;
                    IArticleViewer iArticleViewer4 = this.parent;
                    TL_iv.pageBlockPhoto pageblockphoto5 = this.currentBlock;
                    TL_iv.RichText richText2 = pageblockphoto5.caption.credit;
                    int i17 = this.creditOffset + this.textY;
                    webpageAdapter2 = this.adapter;
                    if (webpageAdapter2 == null) {
                        alignmentALIGN_RIGHT = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignmentALIGN_RIGHT = Layout.Alignment.ALIGN_NORMAL;
                    }
                    drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer4, this, null, richText2, iDp, i17, pageblockphoto5, alignmentALIGN_RIGHT, 0, this.adapter);
                    this.creditLayout = drawingTextCreateLayoutForText2;
                    if (drawingTextCreateLayoutForText2 != null) {
                        iDp4 = this.creditLayout.getHeight() + AndroidUtilities.dp(4.0f) + i4;
                    } else {
                        iDp4 = i4;
                    }
                }
                if (!this.isFirst) {
                    iDp4 += AndroidUtilities.dp(f);
                }
                if (this.parentBlock instanceof TL_iv.pageBlockCover) {
                    z = false;
                } else {
                    z = false;
                }
                if (this.currentType != 2) {
                    iDp6 = iDp4;
                } else {
                    iDp6 = iDp4;
                }
                drawingText = this.captionLayout;
                if (drawingText != null) {
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
                drawingText2 = this.creditLayout;
                if (drawingText2 != null) {
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY + this.creditOffset;
                }
            }
            this.channelCell.measure(i, i2);
            this.channelCell.setTranslationY(this.imageView.getImageHeight() - AndroidUtilities.dp(39.0f));
            setMeasuredDimension(i3, iDp6);
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
            if (this.buttonState != 1) {
                updateButtonState(true);
            }
        }

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        @Override
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            updateButtonState(true);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.channelCell.getVisibility() == 0 && y > this.channelCell.getTranslationY() && y < this.channelCell.getTranslationY() + AndroidUtilities.dp(39.0f)) {
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter != null && webpageAdapter.channelBlock != null) {
                    motionEvent.getAction();
                }
                return true;
            }
            if (motionEvent.getAction() == 0 && this.imageView.isInsideImage(x, y)) {
                if (this.buttonState != -1) {
                    int i = this.buttonX;
                    if (x >= i && x <= AndroidUtilities.dp(48.0f) + i) {
                        int i2 = this.buttonY;
                        if (y >= i2 && y <= AndroidUtilities.dp(48.0f) + i2) {
                            this.buttonPressed = 1;
                            invalidate();
                        } else if (this.buttonState == 0) {
                            this.buttonPressed = 1;
                            invalidate();
                        } else {
                            this.photoPressed = true;
                        }
                    } else if (this.buttonState == 0) {
                        this.buttonPressed = 1;
                        invalidate();
                    } else {
                        this.photoPressed = true;
                    }
                } else if (this.buttonState == 0) {
                    this.buttonPressed = 1;
                    invalidate();
                } else {
                    this.photoPressed = true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.photoPressed) {
                    this.photoPressed = false;
                    this.parent.openPhoto(this.currentBlock, this.adapter);
                } else if (this.buttonPressed == 1) {
                    this.buttonPressed = 0;
                    playSoundEffect(0);
                    didPressedButton(true);
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.photoPressed = false;
                this.buttonPressed = 0;
            }
            return this.photoPressed || this.buttonPressed != 0 || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
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
            if (pageblockphoto2 == null || (photoWithId = WebPageUtils.getPhotoWithId(this.currentPage, pageblockphoto2.photo_id)) == null) {
                this.currentPhotoObject = null;
            } else {
                this.currentPhotoObject = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize());
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
    }

    public static class BlockPreformattedCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockPreformatted currentBlock;
        private final IArticleViewer parent;
        private HorizontalScrollView scrollView;
        private CharSequence text;
        private View textContainer;
        private DrawingText textLayout;

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
                public void onScrollChanged(int i, int i2, int i3, int i4) {
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
                public void onDraw(Canvas canvas) {
                    if (BlockPreformattedCell.this.textLayout != null) {
                        canvas.save();
                        ArticleViewer.drawTextSelection(iArticleViewer, canvas, BlockPreformattedCell.this);
                        BlockPreformattedCell.this.textLayout.draw(canvas, this);
                        canvas.restore();
                        BlockPreformattedCell.this.textLayout.x = (int) getX();
                        BlockPreformattedCell.this.textLayout.y = (int) getY();
                    }
                }

                @Override
                public void onMeasure(int i, int i2) {
                    int height;
                    AnonymousClass2 anonymousClass2;
                    int iMax = 1;
                    if (BlockPreformattedCell.this.currentBlock != null) {
                        if (BlockPreformattedCell.this.text == null) {
                            BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                            anonymousClass2 = this;
                            blockPreformattedCell.text = ArticleViewer.getText(iArticleViewer, webpageAdapter, anonymousClass2, blockPreformattedCell.currentBlock.text, BlockPreformattedCell.this.currentBlock.text, BlockPreformattedCell.this.currentBlock, AndroidUtilities.dp(5000.0f));
                            if (!TextUtils.isEmpty(BlockPreformattedCell.this.currentBlock.language)) {
                                BlockPreformattedCell blockPreformattedCell2 = BlockPreformattedCell.this;
                                blockPreformattedCell2.text = CodeHighlighting.getHighlighted(blockPreformattedCell2.text, BlockPreformattedCell.this.currentBlock.language);
                            }
                        } else {
                            anonymousClass2 = this;
                        }
                        BlockPreformattedCell blockPreformattedCell3 = BlockPreformattedCell.this;
                        blockPreformattedCell3.textLayout = ArticleViewer.createLayoutForText(iArticleViewer, anonymousClass2, blockPreformattedCell3.text, (TL_iv.RichText) null, AndroidUtilities.dp(5000.0f), 0, BlockPreformattedCell.this.currentBlock, webpageAdapter);
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
                    setMeasuredDimension(AndroidUtilities.dp(32.0f) + iMax, height);
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    IArticleViewer iArticleViewer2 = iArticleViewer;
                    WebpageAdapter webpageAdapter2 = webpageAdapter;
                    BlockPreformattedCell blockPreformattedCell = BlockPreformattedCell.this;
                    return ArticleViewer.checkLayoutForLinks(iArticleViewer2, webpageAdapter2, motionEvent, blockPreformattedCell, blockPreformattedCell.textLayout, 0, 0) || super.onTouchEvent(motionEvent);
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

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public int getBoundLeft() {
            if (this.textLayout == null) {
                return -1;
            }
            return (this.textLayout.getBoundLeft() + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            if (this.textLayout == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + this.textLayout.getBoundRight() + AndroidUtilities.dp(16.0f);
        }

        @Override
        public int getLastLineBoundRight() {
            if (this.textLayout == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + this.textLayout.getLastLineBoundRight() + AndroidUtilities.dp(16.0f);
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        @Override
        public void invalidate() {
            this.textContainer.invalidate();
            super.invalidate();
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (this.currentBlock == null) {
                return;
            }
            canvas.drawRect(0.0f, AndroidUtilities.dp(8.0f), getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f), ArticleViewer.preformattedBackgroundPaint);
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
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size, this.scrollView.getMeasuredHeight());
        }

        public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
            this.text = null;
            this.currentBlock = pageblockpreformatted;
            this.scrollView.setScrollX(0);
            this.textContainer.requestLayout();
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

        public BlockPullquoteCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
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

        @Override
        public int getBoundLeft() {
            int iMin;
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                iMin = Math.min(Integer.MAX_VALUE, drawingText.getBoundLeft() + drawingText.x);
            } else {
                iMin = Integer.MAX_VALUE;
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                iMin = Math.min(iMin, drawingText2.getBoundLeft() + drawingText2.x);
            }
            if (iMin == Integer.MAX_VALUE) {
                return -1;
            }
            return iMin - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            int iMax;
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                iMax = Math.max(Integer.MIN_VALUE, drawingText.getBoundRight() + drawingText.x);
            } else {
                iMax = Integer.MIN_VALUE;
            }
            DrawingText drawingText2 = this.textLayout2;
            if (drawingText2 != null) {
                iMax = Math.max(iMax, drawingText2.getBoundRight() + drawingText2.x);
            }
            if (iMax == Integer.MIN_VALUE) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + iMax;
        }

        @Override
        public int getLastLineBoundRight() {
            int lastLineBoundRight;
            int iDp;
            DrawingText drawingText = this.textLayout2;
            if (drawingText != null) {
                lastLineBoundRight = drawingText.getLastLineBoundRight() + drawingText.x;
                iDp = AndroidUtilities.dp(this.parent.padx());
            } else {
                DrawingText drawingText2 = this.textLayout;
                if (drawingText2 == null) {
                    return -1;
                }
                lastLineBoundRight = drawingText2.getLastLineBoundRight() + drawingText2.x;
                iDp = AndroidUtilities.dp(this.parent.padx());
            }
            return iDp + lastLineBoundRight;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
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

        @Override
        public void onDraw(Canvas canvas) {
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
        public void onMeasure(int i, int i2) {
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            this.textY = AndroidUtilities.dp(this.parent.pady());
            TL_iv.pageBlockPullquote pageblockpullquote = this.currentBlock;
            if (pageblockpullquote != null) {
                IArticleViewer iArticleViewer = this.parent;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockpullquote.text, size - AndroidUtilities.dp(iArticleViewer.padx() * 2), this.textY, this.currentBlock, this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int height = this.textLayout.getHeight() + AndroidUtilities.dp(this.parent.pady());
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                    iDp = height;
                } else {
                    iDp = 0;
                }
                this.textY2 = AndroidUtilities.dp(2.0f) + iDp;
                IArticleViewer iArticleViewer2 = this.parent;
                DrawingText drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, this.currentBlock.caption, size - AndroidUtilities.dp(iArticleViewer2.padx() * 2), this.textY2, this.currentBlock, this.adapter);
                this.textLayout2 = drawingTextCreateLayoutForText2;
                if (drawingTextCreateLayoutForText2 != null) {
                    iDp += this.textLayout2.getHeight() + AndroidUtilities.dp(this.parent.pady());
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
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout2, this.textX, this.textY2) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockPullquote pageblockpullquote) {
            this.currentBlock = pageblockpullquote;
            requestLayout();
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

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
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

        @Override
        public void onDraw(Canvas canvas) {
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
        public void onMeasure(int i, int i2) {
            TLRPC.Photo photoWithId;
            int i3;
            char c;
            float f;
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
                int iDp4 = AndroidUtilities.dp(44.0f);
                float f2 = iDp4;
                this.imageView.setImageCoords((size - iDp4) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), f2, f2);
                iDp3 = (int) (iDp3 - (this.imageView.getImageWidth() + AndroidUtilities.dp(6.0f)));
            }
            int iDp5 = AndroidUtilities.dp(18.0f);
            int i5 = iDp3;
            String str = pagerelatedarticle.title;
            if (str != null) {
                i3 = iDp2;
                c = 1;
                f = 6.0f;
                this.textLayout = ArticleViewer.createLayoutForText(this.parent, this, str, null, i5, this.textY, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 3, this.adapter);
            } else {
                i3 = iDp2;
                c = 1;
                f = 6.0f;
            }
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                int lineCount = drawingText.getLineCount();
                int i6 = 4 - lineCount;
                this.textOffset = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(f, this.textLayout.getHeight(), iDp);
                iDp5 = this.textLayout.getHeight() + iDp5;
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
                int i8 = R.string.ArticleDateByAuthor;
                String str2 = LocaleController.getInstance().getChatFullDate().format(((long) pagerelatedarticle.published_date) * 1000);
                String str3 = pagerelatedarticle.author;
                Object[] objArr = new Object[2];
                objArr[0] = str2;
                objArr[c] = str3;
                string = LocaleController.formatString(i8, objArr);
            } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
                string = LocaleController.formatString(R.string.ArticleByAuthor, pagerelatedarticle.author);
            } else if (pagerelatedarticle.published_date != 0) {
                string = LocaleController.getInstance().getChatFullDate().format(((long) pagerelatedarticle.published_date) * 1000);
            } else {
                string = !TextUtils.isEmpty(pagerelatedarticle.description) ? pagerelatedarticle.description : pagerelatedarticle.url;
            }
            boolean z2 = z;
            IArticleViewer iArticleViewer = this.parent;
            int i9 = this.textOffset + this.textY;
            TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild3 = this.currentBlock;
            WebpageAdapter webpageAdapter2 = this.adapter;
            DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, string, null, i5, i9, tL_pageBlockRelatedArticlesChild3, ((webpageAdapter2 == null || !webpageAdapter2.isRtl) && !z2) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), i4, this.adapter);
            this.textLayout2 = drawingTextCreateLayoutForText;
            if (drawingTextCreateLayoutForText != null) {
                int height = drawingTextCreateLayoutForText.getHeight() + iDp5;
                if (this.textLayout != null) {
                    height = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(f, iDp, height);
                }
                iDp5 = height;
                DrawingText drawingText3 = this.textLayout2;
                drawingText3.x = this.textX;
                drawingText3.y = this.textY + this.textOffset;
            }
            setMeasuredDimension(size, Math.max(i3, iDp5) + (this.divider ? 1 : 0));
        }

        public void setBlock(TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild, TLObject tLObject) {
            this.currentBlock = tL_pageBlockRelatedArticlesChild;
            this.currentPage = tLObject;
            requestLayout();
        }
    }

    public static class BlockRelatedArticlesHeaderCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockRelatedArticles currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockRelatedArticlesHeaderCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.textX = AndroidUtilities.dp(18.0f);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.getBoundLeft() + drawingText.x) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getBoundRight() + drawingText.x;
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getLastLineBoundRight() + drawingText.x;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
            accessibilityNodeInfo.setText(ArticleViewer.appendA11yLabel(ArticleViewer.buildAccessibilityText(this.parent, this.adapter, drawingText), R.string.AccDescrIVRelatedArticles));
        }

        @Override
        public void onMeasure(int i, int i2) {
            BlockRelatedArticlesHeaderCell blockRelatedArticlesHeaderCell;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.currentBlock;
            if (pageblockrelatedarticles != null) {
                blockRelatedArticlesHeaderCell = this;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(this.parent, blockRelatedArticlesHeaderCell, null, pageblockrelatedarticles.title, size - AndroidUtilities.dp(52.0f), 0, this.currentBlock, Layout.Alignment.ALIGN_NORMAL, 1, this.adapter);
                blockRelatedArticlesHeaderCell.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    blockRelatedArticlesHeaderCell.textY = ((AndroidUtilities.dp(32.0f) - blockRelatedArticlesHeaderCell.textLayout.getHeight()) / 2) + AndroidUtilities.dp(6.0f);
                }
            } else {
                blockRelatedArticlesHeaderCell = this;
            }
            if (blockRelatedArticlesHeaderCell.textLayout == null) {
                setMeasuredDimension(size, 1);
                return;
            }
            setMeasuredDimension(size, AndroidUtilities.dp(38.0f));
            DrawingText drawingText = blockRelatedArticlesHeaderCell.textLayout;
            drawingText.x = blockRelatedArticlesHeaderCell.textX;
            drawingText.y = blockRelatedArticlesHeaderCell.textY;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
            this.currentBlock = pageblockrelatedarticles;
            requestLayout();
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
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(12.0f));
            Theme.setCombinedDrawableColor(this.shadowDrawable, this.parent.getThemedColor(Theme.key_iv_backgroundGray), false);
        }
    }

    public class BlockSlideshowCell extends FrameLayout implements TextSelectionHelper.ArticleSelectableView {
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
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() == 0) {
                        ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(true);
                    } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                        ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(false);
                    }
                    ArticleViewer.this.cancelCheckLongPress();
                    return super.onInterceptTouchEvent(motionEvent);
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() == 0) {
                        ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(true);
                    }
                    boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                    if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
                        return zOnTouchEvent;
                    }
                    ArticleViewer.this.windowView.requestDisallowInterceptTouchEvent(false);
                    return zOnTouchEvent;
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
                    BlockSlideshowCell blockSlideshowCell = BlockSlideshowCell.this;
                    blockSlideshowCell.pageOffset = SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(blockSlideshowCell.currentPage, measuredWidth, (i * measuredWidth) + i2, measuredWidth);
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

                public class ObjectContainer {
                    private TL_iv.PageBlock block;
                    private View view;

                    public ObjectContainer() {
                    }
                }

                @Override
                public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
                    viewGroup.removeView(((ObjectContainer) obj).view);
                }

                @Override
                public int getCount() {
                    if (BlockSlideshowCell.this.currentBlock == null) {
                        return 0;
                    }
                    return BlockSlideshowCell.this.currentBlock.items.size();
                }

                @Override
                public int getItemPosition(Object obj) {
                    return BlockSlideshowCell.this.currentBlock.items.contains(((ObjectContainer) obj).block) ? -1 : -2;
                }

                @Override
                public Object instantiateItem(ViewGroup viewGroup, int i) {
                    View view;
                    TL_iv.PageBlock pageBlock = BlockSlideshowCell.this.currentBlock.items.get(i);
                    if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                        Context context2 = BlockSlideshowCell.this.getContext();
                        BlockSlideshowCell blockSlideshowCell = BlockSlideshowCell.this;
                        BlockPhotoCell blockPhotoCell = new BlockPhotoCell(context2, ArticleViewer.this, blockSlideshowCell.parentAdapter, 1);
                        blockPhotoCell.setBlock((TL_iv.pageBlockPhoto) pageBlock, BlockSlideshowCell.this.parentAdapter.currentPage.cached_page, null, false, true);
                        view = blockPhotoCell;
                    } else {
                        Context context3 = BlockSlideshowCell.this.getContext();
                        BlockSlideshowCell blockSlideshowCell2 = BlockSlideshowCell.this;
                        BlockVideoCell blockVideoCell = new BlockVideoCell(context3, ArticleViewer.this, blockSlideshowCell2.parentAdapter, 1);
                        TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                        blockVideoCell.setBlock(pageblockvideo, (BlockVideoCellState) ArticleViewer.this.videoStates.get(pageblockvideo.video_id), false, true, true);
                        view = blockVideoCell;
                    }
                    viewGroup.addView(view);
                    ObjectContainer objectContainer = new ObjectContainer();
                    objectContainer.view = view;
                    objectContainer.block = pageBlock;
                    return objectContainer;
                }

                @Override
                public boolean isViewFromObject(View view, Object obj) {
                    return ((ObjectContainer) obj).view == view;
                }

                @Override
                public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
                    if (dataSetObserver != null) {
                        super.unregisterDataSetObserver(dataSetObserver);
                    }
                }
            };
            this.innerAdapter = pagerAdapter;
            viewPager2.setAdapter(pagerAdapter);
            AndroidUtilities.setViewPagerEdgeEffectColor(this.innerListView, ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhite));
            addView(this.innerListView);
            View view = new View(context) {
                @Override
                public void onDraw(Canvas canvas) {
                    float fClamp;
                    if (BlockSlideshowCell.this.currentBlock == null) {
                        return;
                    }
                    int count = BlockSlideshowCell.this.innerAdapter.getCount();
                    int iDp = AndroidUtilities.dp(4.0f) + RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(6.0f, count - 1, AndroidUtilities.dp(7.0f) * count);
                    float f = BlockSlideshowCell.this.currentPage + BlockSlideshowCell.this.pageOffset;
                    if (iDp < getMeasuredWidth()) {
                        fClamp = (getMeasuredWidth() - iDp) / 2.0f;
                    } else {
                        float fDp = AndroidUtilities.dp(4.0f);
                        int iDp2 = AndroidUtilities.dp(13.0f);
                        int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(8.0f)) / 2) / iDp2;
                        fClamp = fDp - (Utilities.clamp(f - measuredWidth, Math.max(0, (count - (measuredWidth * 2)) - 1), 0.0f) * iDp2);
                    }
                    canvas.save();
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    for (int i = 0; i < BlockSlideshowCell.this.currentBlock.items.size(); i++) {
                        float fMax = Math.max(0.0f, 1.0f - Math.abs(i - f));
                        float fDp2 = (AndroidUtilities.dp(1.0f) * fMax) + AndroidUtilities.dp(2.0f);
                        ArticleViewer.dotsPaint.setAlpha((int) ((fMax * 95.0f) + 160.0f));
                        canvas.drawCircle(AndroidUtilities.dp(4.0f) + fClamp + (AndroidUtilities.dp(13.0f) * i), getMeasuredHeight() / 2.0f, fDp2, ArticleViewer.dotsPaint);
                    }
                    canvas.restore();
                }
            };
            this.dotsContainer = view;
            addView(view);
            setWillNotDraw(false);
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

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
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

        @Override
        public void onDraw(Canvas canvas) {
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
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.innerListView.layout(0, AndroidUtilities.dp(8.0f), this.innerListView.getMeasuredWidth(), this.innerListView.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
            int bottom = this.innerListView.getBottom() - AndroidUtilities.dp(23.0f);
            View view = this.dotsContainer;
            view.layout(0, bottom, view.getMeasuredWidth(), this.dotsContainer.getMeasuredHeight() + bottom);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int iDp;
            int size = View.MeasureSpec.getSize(i);
            if (this.currentBlock != null) {
                int iDp2 = AndroidUtilities.dp(310.0f);
                this.innerListView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp2, 1073741824));
                this.currentBlock.items.size();
                this.dotsContainer.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f), 1073741824));
                int iDp3 = size - AndroidUtilities.dp(36.0f);
                int iDp4 = AndroidUtilities.dp(16.0f) + iDp2;
                this.textY = iDp4;
                ArticleViewer articleViewer = ArticleViewer.this;
                TL_iv.pageBlockSlideshow pageblockslideshow = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText = articleViewer.createLayoutForText(this, null, pageblockslideshow.caption.text, iDp3, iDp4, pageblockslideshow, this.parentAdapter);
                this.captionLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    int height = this.captionLayout.getHeight() + AndroidUtilities.dp(4.0f);
                    this.creditOffset = height;
                    iDp2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(4.0f, height, iDp2);
                    DrawingText drawingText = this.captionLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    this.creditOffset = 0;
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                TL_iv.pageBlockSlideshow pageblockslideshow2 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText2 = articleViewer2.createLayoutForText(this, (CharSequence) null, pageblockslideshow2.caption.credit, iDp3, this.creditOffset + this.textY, pageblockslideshow2, this.parentAdapter.isRtl ? StaticLayoutEx.ALIGN_RIGHT() : Layout.Alignment.ALIGN_NORMAL, this.parentAdapter);
                this.creditLayout = drawingTextCreateLayoutForText2;
                if (drawingTextCreateLayoutForText2 != null) {
                    iDp2 += this.creditLayout.getHeight() + AndroidUtilities.dp(4.0f);
                    DrawingText drawingText2 = this.creditLayout;
                    drawingText2.x = this.textX;
                    drawingText2.y = this.textY + this.creditOffset;
                }
                iDp = AndroidUtilities.dp(16.0f) + iDp2;
            } else {
                iDp = 1;
            }
            setMeasuredDimension(size, iDp);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.captionLayout, this.textX, this.textY)) {
                return true;
            }
            return ArticleViewer.this.checkLayoutForLinks(this.parentAdapter, motionEvent, this, this.creditLayout, this.textX, this.creditOffset + this.textY) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockSlideshow pageblockslideshow) {
            this.currentBlock = pageblockslideshow;
            this.innerAdapter.notifyDataSetChanged();
            this.innerListView.setCurrentItem(0, false);
            this.innerListView.forceLayout();
            requestLayout();
        }
    }

    public static class BlockSubheaderCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockSubheader currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockSubheaderCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.getBoundLeft() + drawingText.x) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getBoundRight() + drawingText.x;
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getLastLineBoundRight() + drawingText.x;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
        public void onMeasure(int i, int i2) {
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
                    int height = drawingTextCreateLayoutForText.getHeight() + this.textY;
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
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
            this.currentBlock = pageblocksubheader;
            requestLayout();
        }
    }

    public static class BlockSubtitleCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockSubtitle currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockSubtitleCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.getBoundLeft() + drawingText.x) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getBoundRight() + drawingText.x;
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getLastLineBoundRight() + drawingText.x;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
        public void onMeasure(int i, int i2) {
            int height;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            this.textY = AndroidUtilities.dp(this.parent.pady());
            TL_iv.pageBlockSubtitle pageblocksubtitle = this.currentBlock;
            if (pageblocksubtitle != null) {
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = pageblocksubtitle.text;
                int iDp = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i3 = this.textY;
                TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, iDp, i3, pageblocksubtitle2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    height = this.textLayout.getHeight() + AndroidUtilities.dp(this.parent.pady() * 2);
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    height = 0;
                }
            } else {
                height = 1;
            }
            setMeasuredDimension(size, height);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
            this.currentBlock = pageblocksubtitle;
            requestLayout();
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
                        textSelectionHelper.trySelect();
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
                public void onMeasure(int i, int i2) {
                    BlockTableCell.this.tableLayout.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), 0), i2);
                    setMeasuredDimension(View.MeasureSpec.getSize(i), BlockTableCell.this.tableLayout.getMeasuredHeight());
                }

                @Override
                public void onScrollChanged(int i, int i2, int i3, int i4) {
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
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (BlockTableCell.this.tableLayout.getMeasuredWidth() <= getMeasuredWidth() - AndroidUtilities.dp(36.0f)) {
                        return false;
                    }
                    return super.onTouchEvent(motionEvent);
                }

                @Override
                public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
                    ArticleViewer.removePressedLink(iArticleViewer);
                    return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
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

        public void updateChildTextPositions() {
            int i = this.titleLayout == null ? 0 : 1;
            int childCount = this.tableLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i2);
                TableLayout.CellText cellText = childAt.textLayout;
                if (cellText != null) {
                    cellText.setX((AndroidUtilities.dp(18.0f) + (childAt.getTextX() + this.listX)) - this.scrollView.getScrollX());
                    childAt.textLayout.setY(childAt.getTextY() + this.listY);
                    childAt.textLayout.setRow(childAt.getRow());
                    childAt.setSelectionIndex(i);
                    i++;
                }
            }
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
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
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
        public Paint getHalfLinePaint() {
            return ArticleViewer.tableHalfLinePaint;
        }

        @Override
        public Paint getHeaderPaint() {
            return ArticleViewer.tableHeaderPaint;
        }

        @Override
        public Paint getLinePaint() {
            return ArticleViewer.tableLinePaint;
        }

        @Override
        public Paint getStripPaint() {
            return ArticleViewer.tableStripPaint;
        }

        @Override
        public void invalidate() {
            super.invalidate();
            this.tableLayout.invalidate();
        }

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
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
        public void onDraw(Canvas canvas) {
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

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            HorizontalScrollView horizontalScrollView = this.scrollView;
            int i5 = this.listX;
            horizontalScrollView.layout(i5, this.listY, horizontalScrollView.getMeasuredWidth() + i5, this.scrollView.getMeasuredHeight() + this.listY);
            if (this.firstLayout) {
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter == null || !webpageAdapter.isRtl) {
                    this.scrollView.setScrollX(0);
                } else {
                    this.scrollView.setScrollX(AndroidUtilities.dp(36.0f) + (this.tableLayout.getMeasuredWidth() - this.scrollView.getMeasuredWidth()));
                }
                this.firstLayout = false;
            }
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

        @Override
        public void onMeasure(int i, int i2) {
            int iM;
            int iDp;
            int iDp2;
            int size = View.MeasureSpec.getSize(i);
            TL_iv.pageBlockTable pageblocktable = this.currentBlock;
            if (pageblocktable != null) {
                int i3 = pageblocktable.level;
                if (i3 > 0) {
                    int iDp3 = AndroidUtilities.dp(i3 * 14);
                    this.listX = iDp3;
                    int iDp4 = AndroidUtilities.dp(this.parent.padx()) + iDp3;
                    this.textX = iDp4;
                    iDp = size - iDp4;
                } else {
                    this.listX = 0;
                    this.textX = AndroidUtilities.dp(this.parent.padx());
                    iDp = size - AndroidUtilities.dp(this.parent.padx() * 2);
                }
                int i4 = iDp;
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.pageBlockTable pageblocktable2 = this.currentBlock;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, null, pageblocktable2.title, i4, 0, pageblocktable2, Layout.Alignment.ALIGN_CENTER, 0, this.adapter);
                this.titleLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    this.textY = 0;
                    iDp2 = AndroidUtilities.dp(8.0f) + drawingTextCreateLayoutForText.getHeight();
                    this.listY = iDp2;
                    DrawingText drawingText = this.titleLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                } else {
                    this.listY = AndroidUtilities.dp(8.0f);
                    iDp2 = 0;
                }
                this.scrollView.measure(View.MeasureSpec.makeMeasureSpec(size - this.listX, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(8.0f, this.scrollView.getMeasuredHeight(), iDp2);
                TL_iv.pageBlockTable pageblocktable3 = this.currentBlock;
                if (pageblocktable3.level > 0 && !pageblocktable3.bottom) {
                    iM += AndroidUtilities.dp(8.0f);
                }
            } else {
                iM = 1;
            }
            setMeasuredDimension(size, iM);
            updateChildTextPositions();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            MotionEvent motionEvent2;
            int childCount = this.tableLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                TableLayout.Child childAt = this.tableLayout.getChildAt(i);
                TableLayout.CellText cellText = childAt.textLayout;
                if (cellText instanceof DrawingText) {
                    MotionEvent motionEvent3 = motionEvent;
                    motionEvent2 = motionEvent3;
                    if (ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent3, this, (DrawingText) cellText, childAt.getTextX() + (this.scrollView.getPaddingLeft() - this.scrollView.getScrollX()) + this.listX, childAt.getTextY() + this.listY)) {
                        return true;
                    }
                } else {
                    motionEvent2 = motionEvent;
                }
                i++;
                motionEvent = motionEvent2;
            }
            MotionEvent motionEvent4 = motionEvent;
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent4, this, this.titleLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent4);
        }

        public void setBlock(TL_iv.pageBlockTable pageblocktable) {
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
        public DrawingText createTextLayout(TL_iv.pageTableCell pagetablecell, int i) {
            Layout.Alignment alignment;
            if (pagetablecell == null) {
                return null;
            }
            if (pagetablecell.align_right) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL;
            }
            return ArticleViewer.createLayoutForText(this.parent, this, null, pagetablecell.text, i, -1, this.currentBlock, alignment, 0, this.adapter);
        }
    }

    public static class BlockTitleCell extends View implements TextSelectionHelper.ArticleSelectableView, IBlock {
        private final WebpageAdapter adapter;
        private TL_iv.pageBlockTitle currentBlock;
        private final IArticleViewer parent;
        private DrawingText textLayout;
        private int textX;
        private int textY;

        public BlockTitleCell(Context context, IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter) {
            super(context);
            this.parent = iArticleViewer;
            this.adapter = webpageAdapter;
        }

        @Override
        public void fillTextLayoutBlocks(ArrayList<TextSelectionHelper.TextLayoutBlock> arrayList) {
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                arrayList.add(drawingText);
            }
        }

        @Override
        public int getBoundLeft() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return (drawingText.getBoundLeft() + drawingText.x) - AndroidUtilities.dp(this.parent.padx());
        }

        @Override
        public int getBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getBoundRight() + drawingText.x;
        }

        @Override
        public int getLastLineBoundRight() {
            DrawingText drawingText = this.textLayout;
            if (drawingText == null) {
                return -1;
            }
            return AndroidUtilities.dp(this.parent.padx()) + drawingText.getLastLineBoundRight() + drawingText.x;
        }

        @Override
        public final int getMinWidth() {
            return IBlock.CC.$default$getMinWidth(this);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.attach(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            DrawingText drawingText = this.textLayout;
            if (drawingText != null) {
                drawingText.detach(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
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
        public void onMeasure(int i, int i2) {
            int height;
            int size = View.MeasureSpec.getSize(i);
            this.textX = AndroidUtilities.dp(this.parent.padx());
            TL_iv.pageBlockTitle pageblocktitle = this.currentBlock;
            if (pageblocktitle != null) {
                if (pageblocktitle.first) {
                    height = AndroidUtilities.dp(this.parent.pady());
                    this.textY = AndroidUtilities.dp(this.parent.pady() * 2);
                } else {
                    this.textY = AndroidUtilities.dp(this.parent.pady());
                    height = 0;
                }
                IArticleViewer iArticleViewer = this.parent;
                TL_iv.RichText richText = this.currentBlock.text;
                int iDp = size - AndroidUtilities.dp(iArticleViewer.padx() * 2);
                int i3 = this.textY;
                TL_iv.pageBlockTitle pageblocktitle2 = this.currentBlock;
                WebpageAdapter webpageAdapter = this.adapter;
                DrawingText drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, richText, iDp, i3, pageblocktitle2, (webpageAdapter == null || !webpageAdapter.isRtl) ? Layout.Alignment.ALIGN_NORMAL : StaticLayoutEx.ALIGN_RIGHT(), this.adapter);
                this.textLayout = drawingTextCreateLayoutForText;
                if (drawingTextCreateLayoutForText != null) {
                    height += this.textLayout.getHeight() + AndroidUtilities.dp(this.parent.pady() * 2);
                    DrawingText drawingText = this.textLayout;
                    drawingText.x = this.textX;
                    drawingText.y = this.textY;
                }
            } else {
                height = 1;
            }
            setMeasuredDimension(size, height);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.textLayout, this.textX, this.textY) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
            this.currentBlock = pageblocktitle;
            requestLayout();
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
                    iArticleViewer.videoStates.put(setState(BlockVideoCellState.fromPlayer(videoPlayerHolderBase, this)), pageblockvideo.video_id);
                }
                this.imageView.onDetachedFromWindow();
                DownloadController.getInstance(this.parent.getCurrentAccount()).removeLoadingFileObserver(this);
                this.firstFrameRendered = false;
            }
        }

        private void didPressedButton(boolean z) {
            int currentAccount = this.parent.getCurrentAccount();
            int i = this.buttonState;
            if (i == 0) {
                this.cancelLoading = false;
                this.radialProgress.setProgress(0.0f, false);
                if (this.isGif) {
                    this.imageView.setImage(ImageLocation.getForDocument(this.currentDocument), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.currentDocument.thumbs, 40), this.currentDocument), "80_80_b", this.currentDocument.size, null, this.adapter.currentPage, 1);
                } else {
                    FileLoader.getInstance(currentAccount).loadFile(this.currentDocument, this.adapter.currentPage, 1, 1);
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
                            longSparseArray.put(blockVideoCell.setState(BlockVideoCellState.fromPlayer(blockVideoCell.parent.videoPlayer, BlockVideoCell.this)), j);
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

        private void updateAttachedState() {
            if (getVisibility() == 0 && isAttachedToWindow()) {
                attach();
            } else {
                detach();
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            return super.drawChild(canvas, view, j);
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

        public View getChannelCell() {
            return this.channelCell;
        }

        public TL_iv.pageBlockVideo getCurrentBlock() {
            return this.currentBlock;
        }

        public ImageReceiver getImageView() {
            return this.imageView;
        }

        @Override
        public int getObserverTag() {
            return this.TAG;
        }

        public TextureView getTextureView() {
            return this.textureView;
        }

        public boolean isFirstFrameRendered() {
            return this.firstFrameRendered;
        }

        @Override
        public void onAttachedToWindow() {
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
        public void onDetachedFromWindow() {
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
        public void onDraw(Canvas canvas) {
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

        @Override
        public void onFailedDownload(String str, boolean z) {
            updateButtonState(false);
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
        public void onMeasure(int i, int i2) {
            int i3;
            int iCeil;
            int currentAccount;
            TL_iv.pageBlockVideo pageblockvideo;
            int iDp;
            int iDp2;
            int i4;
            float f;
            int iDp3;
            int imageHeight;
            boolean z;
            WebpageAdapter webpageAdapter;
            DrawingText drawingTextCreateLayoutForText;
            int i5;
            WebpageAdapter webpageAdapter2;
            Layout.Alignment alignmentALIGN_RIGHT;
            DrawingText drawingTextCreateLayoutForText2;
            int iDp4;
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            int i6;
            int iDp5;
            int iDp6;
            BlockVideoCellState blockVideoCellState;
            int i7;
            int size;
            int i8;
            boolean z2;
            float f2;
            float f3;
            float f4;
            int iMax;
            TLRPC.DocumentAttribute documentAttribute;
            int i9;
            int size2 = View.MeasureSpec.getSize(i);
            int i10 = this.currentType;
            int iDp7 = 1;
            if (i10 != 1) {
                if (i10 == 2) {
                    float f5 = this.groupPosition.ph;
                    Point point = AndroidUtilities.displaySize;
                    iCeil = (int) Math.ceil(f5 * Math.max(point.x, point.y) * 0.5f);
                } else {
                    i3 = size2;
                    iCeil = 0;
                }
                currentAccount = this.parent.getCurrentAccount();
                pageblockvideo = this.currentBlock;
                if (pageblockvideo != null) {
                    if (this.currentType == 0 || (i9 = pageblockvideo.level) <= 0) {
                        this.textX = AndroidUtilities.dp(18.0f);
                        iDp = i3 - AndroidUtilities.dp(36.0f);
                        iDp2 = i3;
                        i4 = 0;
                    } else {
                        int iDp8 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i9 * 14);
                        this.textX = iDp8;
                        iDp2 = OKLCH.m$1(18.0f, iDp8, i3);
                        i4 = iDp8;
                        iDp = iDp2;
                    }
                    if (this.currentDocument != null) {
                        iDp4 = AndroidUtilities.dp(48.0f);
                        closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.currentDocument.thumbs, 48);
                        i6 = this.currentType;
                        if (i6 == 0) {
                            size = this.currentDocument.attributes.size();
                            i8 = 0;
                            while (true) {
                                if (i8 < size) {
                                    f = 8.0f;
                                    z2 = false;
                                    break;
                                }
                                documentAttribute = this.currentDocument.attributes.get(i8);
                                f = 8.0f;
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    iCeil = (int) ((iDp2 / documentAttribute.w) * documentAttribute.h);
                                    z2 = true;
                                    break;
                                }
                                i8++;
                            }
                            if (closestPhotoSizeWithSize != null) {
                                f2 = closestPhotoSizeWithSize.w;
                            } else {
                                f2 = 100.0f;
                            }
                            if (closestPhotoSizeWithSize != null) {
                                f3 = closestPhotoSizeWithSize.h;
                            } else {
                                f3 = 100.0f;
                            }
                            if (!z2) {
                                iCeil = (int) ((iDp2 / f2) * f3);
                            }
                            if (this.parentBlock instanceof TL_iv.pageBlockCover) {
                                iCeil = Math.min(iCeil, iDp2);
                                f4 = 100.0f;
                            } else {
                                Point point2 = AndroidUtilities.displaySize;
                                f4 = 100.0f;
                                iMax = (int) ((Math.max(point2.x, point2.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (iCeil > iMax) {
                                    iDp2 = (int) ((iMax / f3) * f2);
                                    i4 += ((i3 - i4) - iDp2) / 2;
                                    iCeil = iMax;
                                }
                            }
                            if (iCeil == 0) {
                                iCeil = AndroidUtilities.dp(f4);
                            } else if (iCeil < iDp4) {
                                iCeil = iDp4;
                            }
                        } else {
                            f = 8.0f;
                            if (i6 != 2) {
                                if ((this.groupPosition.flags & 2) == 0) {
                                    iDp2 -= AndroidUtilities.dp(2.0f);
                                }
                                if ((this.groupPosition.flags & 8) == 0) {
                                    iDp5 = iCeil - AndroidUtilities.dp(2.0f);
                                }
                            }
                            this.imageView.setQualityThumbDocument(this.currentDocument);
                            if (!this.isFirst || (i7 = this.currentType) == 1 || i7 == 2 || this.currentBlock.level > 0) {
                                iDp6 = 0;
                            } else {
                                iDp6 = AndroidUtilities.dp(f);
                            }
                            this.imageView.setImageCoords(i4, iDp6, iDp2, iDp5);
                            if (!this.calcHeight) {
                                if (this.isGif) {
                                    blockVideoCellState = this.videoState;
                                    if (blockVideoCellState != null || blockVideoCellState.lastFrameBitmap == null) {
                                        this.autoDownload = DownloadController.getInstance(currentAccount).canDownloadMedia(4, this.currentDocument.size);
                                        File pathToAttach = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument);
                                        File pathToAttach2 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument, true);
                                        if (!this.autoDownload || pathToAttach.exists() || pathToAttach2.exists()) {
                                            this.imageView.setStrippedLocation(null);
                                            this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                        } else {
                                            this.imageView.setStrippedLocation(ImageLocation.getForDocument(this.currentDocument));
                                            this.imageView.setImage(null, null, null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                        }
                                    } else {
                                        this.imageView.setStrippedLocation(null);
                                        this.imageView.setImageBitmap(this.videoState.lastFrameBitmap);
                                    }
                                } else {
                                    this.imageView.setStrippedLocation(null);
                                    ImageReceiver imageReceiver = this.imageView;
                                    ImageLocation forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument);
                                    WebpageAdapter webpageAdapter3 = this.adapter;
                                    imageReceiver.setImage(null, null, forDocument, "80_80_b", 0L, null, webpageAdapter3 != null ? webpageAdapter3.currentPage : null, 1);
                                }
                            }
                            this.imageView.setAspectFit(true);
                            float f6 = iDp4;
                            this.buttonX = (int) ImageReceiver$$ExternalSyntheticOutline0.m(this.imageView.getImageWidth(), f6, 2.0f, this.imageView.getImageX());
                            int imageHeight2 = (int) (((this.imageView.getImageHeight() - f6) / 2.0f) + this.imageView.getImageY());
                            this.buttonY = imageHeight2;
                            RadialProgress2 radialProgress2 = this.radialProgress;
                            int i11 = this.buttonX;
                            radialProgress2.setProgressRect(i11, imageHeight2, i11 + iDp4, iDp4 + imageHeight2);
                        }
                        iDp5 = iCeil;
                        this.imageView.setQualityThumbDocument(this.currentDocument);
                        if (this.isFirst) {
                            iDp6 = 0;
                        } else {
                            iDp6 = 0;
                        }
                        this.imageView.setImageCoords(i4, iDp6, iDp2, iDp5);
                        if (!this.calcHeight) {
                            if (this.isGif) {
                                blockVideoCellState = this.videoState;
                                if (blockVideoCellState != null) {
                                    this.autoDownload = DownloadController.getInstance(currentAccount).canDownloadMedia(4, this.currentDocument.size);
                                    File pathToAttach3 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument);
                                    File pathToAttach4 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument, true);
                                    if (this.autoDownload) {
                                        this.imageView.setStrippedLocation(null);
                                        this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                    } else {
                                        this.imageView.setStrippedLocation(null);
                                        this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                    }
                                } else {
                                    this.autoDownload = DownloadController.getInstance(currentAccount).canDownloadMedia(4, this.currentDocument.size);
                                    File pathToAttach5 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument);
                                    File pathToAttach6 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument, true);
                                    if (this.autoDownload) {
                                        this.imageView.setStrippedLocation(null);
                                        this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                    } else {
                                        this.imageView.setStrippedLocation(null);
                                        this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                    }
                                }
                            } else {
                                this.imageView.setStrippedLocation(null);
                                ImageReceiver imageReceiver2 = this.imageView;
                                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument);
                                WebpageAdapter webpageAdapter4 = this.adapter;
                                imageReceiver2.setImage(null, null, forDocument2, "80_80_b", 0L, null, webpageAdapter4 != null ? webpageAdapter4.currentPage : null, 1);
                            }
                        }
                        this.imageView.setAspectFit(true);
                        float f7 = iDp4;
                        this.buttonX = (int) ImageReceiver$$ExternalSyntheticOutline0.m(this.imageView.getImageWidth(), f7, 2.0f, this.imageView.getImageX());
                        int imageHeight3 = (int) (((this.imageView.getImageHeight() - f7) / 2.0f) + this.imageView.getImageY());
                        this.buttonY = imageHeight3;
                        RadialProgress2 radialProgress3 = this.radialProgress;
                        int i12 = this.buttonX;
                        radialProgress3.setProgressRect(i12, imageHeight3, i12 + iDp4, iDp4 + imageHeight3);
                    } else {
                        f = 8.0f;
                    }
                    iDp3 = iCeil;
                    imageHeight = (int) (this.imageView.getImageHeight() + this.imageView.getImageY() + AndroidUtilities.dp(f));
                    this.textY = imageHeight;
                    if (this.currentType == 0) {
                        IArticleViewer iArticleViewer = this.parent;
                        TL_iv.pageBlockVideo pageblockvideo2 = this.currentBlock;
                        drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer, this, (CharSequence) null, pageblockvideo2.caption.text, iDp, imageHeight, pageblockvideo2, this.adapter);
                        this.captionLayout = drawingTextCreateLayoutForText;
                        if (drawingTextCreateLayoutForText != null) {
                            int height = this.captionLayout.getHeight() + AndroidUtilities.dp(4.0f);
                            this.creditOffset = height;
                            iDp3 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(4.0f, height, iDp3);
                            DrawingText drawingText = this.captionLayout;
                            drawingText.x = this.textX;
                            drawingText.y = this.textY;
                        }
                        i5 = iDp3;
                        IArticleViewer iArticleViewer2 = this.parent;
                        TL_iv.pageBlockVideo pageblockvideo3 = this.currentBlock;
                        TL_iv.RichText richText = pageblockvideo3.caption.credit;
                        int i13 = this.creditOffset + this.textY;
                        webpageAdapter2 = this.adapter;
                        if (webpageAdapter2 == null && webpageAdapter2.isRtl) {
                            alignmentALIGN_RIGHT = StaticLayoutEx.ALIGN_RIGHT();
                        } else {
                            alignmentALIGN_RIGHT = Layout.Alignment.ALIGN_NORMAL;
                        }
                        drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer2, this, (CharSequence) null, richText, iDp, i13, pageblockvideo3, alignmentALIGN_RIGHT, this.adapter);
                        this.creditLayout = drawingTextCreateLayoutForText2;
                        if (drawingTextCreateLayoutForText2 != null) {
                            iDp3 = this.creditLayout.getHeight() + AndroidUtilities.dp(4.0f) + i5;
                            DrawingText drawingText2 = this.creditLayout;
                            drawingText2.x = this.textX;
                            drawingText2.y = this.textY + this.creditOffset;
                        } else {
                            iDp3 = i5;
                        }
                    }
                    if (!this.isFirst && this.currentType == 0 && this.currentBlock.level <= 0) {
                        iDp3 += AndroidUtilities.dp(f);
                    }
                    if ((this.parentBlock instanceof TL_iv.pageBlockCover) || (webpageAdapter = this.adapter) == null || webpageAdapter.blocks.size() <= 1 || !(this.adapter.blocks.get(1) instanceof TL_iv.pageBlockChannel)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (this.currentType != 2 || z) {
                        iDp7 = iDp3;
                    } else {
                        iDp7 = AndroidUtilities.dp(f) + iDp3;
                    }
                }
                this.channelCell.measure(i, i2);
                this.channelCell.setTranslationY(this.imageView.getImageHeight() - AndroidUtilities.dp(39.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.aspectRationContainer.getLayoutParams();
                layoutParams.leftMargin = (int) this.imageView.getImageX();
                layoutParams.topMargin = (int) this.imageView.getImageY();
                layoutParams.width = (int) this.imageView.getImageWidth();
                layoutParams.height = (int) this.imageView.getImageHeight();
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp7, 1073741824));
            }
            size2 = ((View) getParent()).getMeasuredWidth();
            iCeil = ((View) getParent()).getMeasuredHeight();
            i3 = size2;
            currentAccount = this.parent.getCurrentAccount();
            pageblockvideo = this.currentBlock;
            if (pageblockvideo != null) {
                if (this.currentType == 0) {
                    this.textX = AndroidUtilities.dp(18.0f);
                    iDp = i3 - AndroidUtilities.dp(36.0f);
                    iDp2 = i3;
                    i4 = 0;
                } else {
                    this.textX = AndroidUtilities.dp(18.0f);
                    iDp = i3 - AndroidUtilities.dp(36.0f);
                    iDp2 = i3;
                    i4 = 0;
                }
                if (this.currentDocument != null) {
                    iDp4 = AndroidUtilities.dp(48.0f);
                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.currentDocument.thumbs, 48);
                    i6 = this.currentType;
                    if (i6 == 0) {
                        size = this.currentDocument.attributes.size();
                        i8 = 0;
                        while (true) {
                            if (i8 < size) {
                                f = 8.0f;
                                z2 = false;
                                break;
                            }
                            documentAttribute = this.currentDocument.attributes.get(i8);
                            f = 8.0f;
                            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                iCeil = (int) ((iDp2 / documentAttribute.w) * documentAttribute.h);
                                z2 = true;
                                break;
                            }
                            i8++;
                        }
                        if (closestPhotoSizeWithSize != null) {
                            f2 = closestPhotoSizeWithSize.w;
                        } else {
                            f2 = 100.0f;
                        }
                        if (closestPhotoSizeWithSize != null) {
                            f3 = closestPhotoSizeWithSize.h;
                        } else {
                            f3 = 100.0f;
                        }
                        if (!z2) {
                            iCeil = (int) ((iDp2 / f2) * f3);
                        }
                        if (this.parentBlock instanceof TL_iv.pageBlockCover) {
                            iCeil = Math.min(iCeil, iDp2);
                            f4 = 100.0f;
                        } else {
                            Point point3 = AndroidUtilities.displaySize;
                            f4 = 100.0f;
                            iMax = (int) ((Math.max(point3.x, point3.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                            if (iCeil > iMax) {
                                iDp2 = (int) ((iMax / f3) * f2);
                                i4 += ((i3 - i4) - iDp2) / 2;
                                iCeil = iMax;
                            }
                        }
                        if (iCeil == 0) {
                            iCeil = AndroidUtilities.dp(f4);
                        } else if (iCeil < iDp4) {
                            iCeil = iDp4;
                        }
                    } else {
                        f = 8.0f;
                        if (i6 != 2) {
                            if ((this.groupPosition.flags & 2) == 0) {
                                iDp2 -= AndroidUtilities.dp(2.0f);
                            }
                            if ((this.groupPosition.flags & 8) == 0) {
                                iDp5 = iCeil - AndroidUtilities.dp(2.0f);
                            }
                        }
                        this.imageView.setQualityThumbDocument(this.currentDocument);
                        if (this.isFirst) {
                            iDp6 = 0;
                        } else {
                            iDp6 = 0;
                        }
                        this.imageView.setImageCoords(i4, iDp6, iDp2, iDp5);
                        if (!this.calcHeight) {
                            if (this.isGif) {
                                blockVideoCellState = this.videoState;
                                if (blockVideoCellState != null) {
                                    this.autoDownload = DownloadController.getInstance(currentAccount).canDownloadMedia(4, this.currentDocument.size);
                                    File pathToAttach7 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument);
                                    File pathToAttach8 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument, true);
                                    if (this.autoDownload) {
                                        this.imageView.setStrippedLocation(null);
                                        this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                    } else {
                                        this.imageView.setStrippedLocation(null);
                                        this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                    }
                                } else {
                                    this.autoDownload = DownloadController.getInstance(currentAccount).canDownloadMedia(4, this.currentDocument.size);
                                    File pathToAttach9 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument);
                                    File pathToAttach10 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument, true);
                                    if (this.autoDownload) {
                                        this.imageView.setStrippedLocation(null);
                                        this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                    } else {
                                        this.imageView.setStrippedLocation(null);
                                        this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                    }
                                }
                            } else {
                                this.imageView.setStrippedLocation(null);
                                ImageReceiver imageReceiver3 = this.imageView;
                                ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument);
                                WebpageAdapter webpageAdapter5 = this.adapter;
                                imageReceiver3.setImage(null, null, forDocument3, "80_80_b", 0L, null, webpageAdapter5 != null ? webpageAdapter5.currentPage : null, 1);
                            }
                        }
                        this.imageView.setAspectFit(true);
                        float f8 = iDp4;
                        this.buttonX = (int) ImageReceiver$$ExternalSyntheticOutline0.m(this.imageView.getImageWidth(), f8, 2.0f, this.imageView.getImageX());
                        int imageHeight4 = (int) (((this.imageView.getImageHeight() - f8) / 2.0f) + this.imageView.getImageY());
                        this.buttonY = imageHeight4;
                        RadialProgress2 radialProgress4 = this.radialProgress;
                        int i14 = this.buttonX;
                        radialProgress4.setProgressRect(i14, imageHeight4, i14 + iDp4, iDp4 + imageHeight4);
                    }
                    iDp5 = iCeil;
                    this.imageView.setQualityThumbDocument(this.currentDocument);
                    if (this.isFirst) {
                        iDp6 = 0;
                    } else {
                        iDp6 = 0;
                    }
                    this.imageView.setImageCoords(i4, iDp6, iDp2, iDp5);
                    if (!this.calcHeight) {
                        if (this.isGif) {
                            blockVideoCellState = this.videoState;
                            if (blockVideoCellState != null) {
                                this.autoDownload = DownloadController.getInstance(currentAccount).canDownloadMedia(4, this.currentDocument.size);
                                File pathToAttach11 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument);
                                File pathToAttach12 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument, true);
                                if (this.autoDownload) {
                                    this.imageView.setStrippedLocation(null);
                                    this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                } else {
                                    this.imageView.setStrippedLocation(null);
                                    this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                }
                            } else {
                                this.autoDownload = DownloadController.getInstance(currentAccount).canDownloadMedia(4, this.currentDocument.size);
                                File pathToAttach13 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument);
                                File pathToAttach14 = FileLoader.getInstance(currentAccount).getPathToAttach(this.currentDocument, true);
                                if (this.autoDownload) {
                                    this.imageView.setStrippedLocation(null);
                                    this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                } else {
                                    this.imageView.setStrippedLocation(null);
                                    this.imageView.setImage(null, null, ImageLocation.getForDocument(this.currentDocument), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument), "80_80_b", null, this.currentDocument.size, null, this.adapter.currentPage, 1);
                                }
                            }
                        } else {
                            this.imageView.setStrippedLocation(null);
                            ImageReceiver imageReceiver4 = this.imageView;
                            ImageLocation forDocument4 = ImageLocation.getForDocument(closestPhotoSizeWithSize, this.currentDocument);
                            WebpageAdapter webpageAdapter6 = this.adapter;
                            imageReceiver4.setImage(null, null, forDocument4, "80_80_b", 0L, null, webpageAdapter6 != null ? webpageAdapter6.currentPage : null, 1);
                        }
                    }
                    this.imageView.setAspectFit(true);
                    float f9 = iDp4;
                    this.buttonX = (int) ImageReceiver$$ExternalSyntheticOutline0.m(this.imageView.getImageWidth(), f9, 2.0f, this.imageView.getImageX());
                    int imageHeight5 = (int) (((this.imageView.getImageHeight() - f9) / 2.0f) + this.imageView.getImageY());
                    this.buttonY = imageHeight5;
                    RadialProgress2 radialProgress5 = this.radialProgress;
                    int i15 = this.buttonX;
                    radialProgress5.setProgressRect(i15, imageHeight5, i15 + iDp4, iDp4 + imageHeight5);
                } else {
                    f = 8.0f;
                }
                iDp3 = iCeil;
                imageHeight = (int) (this.imageView.getImageHeight() + this.imageView.getImageY() + AndroidUtilities.dp(f));
                this.textY = imageHeight;
                if (this.currentType == 0) {
                    IArticleViewer iArticleViewer3 = this.parent;
                    TL_iv.pageBlockVideo pageblockvideo4 = this.currentBlock;
                    drawingTextCreateLayoutForText = ArticleViewer.createLayoutForText(iArticleViewer3, this, (CharSequence) null, pageblockvideo4.caption.text, iDp, imageHeight, pageblockvideo4, this.adapter);
                    this.captionLayout = drawingTextCreateLayoutForText;
                    if (drawingTextCreateLayoutForText != null) {
                        int height2 = this.captionLayout.getHeight() + AndroidUtilities.dp(4.0f);
                        this.creditOffset = height2;
                        iDp3 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(4.0f, height2, iDp3);
                        DrawingText drawingText3 = this.captionLayout;
                        drawingText3.x = this.textX;
                        drawingText3.y = this.textY;
                    }
                    i5 = iDp3;
                    IArticleViewer iArticleViewer4 = this.parent;
                    TL_iv.pageBlockVideo pageblockvideo5 = this.currentBlock;
                    TL_iv.RichText richText2 = pageblockvideo5.caption.credit;
                    int i16 = this.creditOffset + this.textY;
                    webpageAdapter2 = this.adapter;
                    if (webpageAdapter2 == null) {
                        alignmentALIGN_RIGHT = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignmentALIGN_RIGHT = Layout.Alignment.ALIGN_NORMAL;
                    }
                    drawingTextCreateLayoutForText2 = ArticleViewer.createLayoutForText(iArticleViewer4, this, (CharSequence) null, richText2, iDp, i16, pageblockvideo5, alignmentALIGN_RIGHT, this.adapter);
                    this.creditLayout = drawingTextCreateLayoutForText2;
                    if (drawingTextCreateLayoutForText2 != null) {
                        iDp3 = this.creditLayout.getHeight() + AndroidUtilities.dp(4.0f) + i5;
                        DrawingText drawingText4 = this.creditLayout;
                        drawingText4.x = this.textX;
                        drawingText4.y = this.textY + this.creditOffset;
                    } else {
                        iDp3 = i5;
                    }
                }
                if (!this.isFirst) {
                    iDp3 += AndroidUtilities.dp(f);
                }
                if (this.parentBlock instanceof TL_iv.pageBlockCover) {
                    z = false;
                } else {
                    z = false;
                }
                if (this.currentType != 2) {
                    iDp7 = iDp3;
                } else {
                    iDp7 = iDp3;
                }
            }
            this.channelCell.measure(i, i2);
            this.channelCell.setTranslationY(this.imageView.getImageHeight() - AndroidUtilities.dp(39.0f));
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.aspectRationContainer.getLayoutParams();
            layoutParams2.leftMargin = (int) this.imageView.getImageX();
            layoutParams2.topMargin = (int) this.imageView.getImageY();
            layoutParams2.width = (int) this.imageView.getImageWidth();
            layoutParams2.height = (int) this.imageView.getImageHeight();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp7, 1073741824));
        }

        @Override
        public void onProgressDownload(String str, long j, long j2) {
            this.radialProgress.setProgress(Math.min(1.0f, j / j2), true);
            if (this.buttonState != 1) {
                updateButtonState(true);
            }
        }

        @Override
        public void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        @Override
        public void onSuccessDownload(String str) {
            this.radialProgress.setProgress(1.0f, true);
            if (!this.isGif) {
                updateButtonState(true);
            } else {
                this.buttonState = 2;
                didPressedButton(true);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.channelCell.getVisibility() == 0 && y > this.channelCell.getTranslationY() && y < this.channelCell.getTranslationY() + AndroidUtilities.dp(39.0f)) {
                WebpageAdapter webpageAdapter = this.adapter;
                if (webpageAdapter != null && webpageAdapter.channelBlock != null) {
                    motionEvent.getAction();
                }
                return true;
            }
            if (motionEvent.getAction() == 0 && this.imageView.isInsideImage(x, y)) {
                if (this.buttonState != -1) {
                    int i = this.buttonX;
                    if (x >= i && x <= AndroidUtilities.dp(48.0f) + i) {
                        int i2 = this.buttonY;
                        if (y >= i2 && y <= AndroidUtilities.dp(48.0f) + i2) {
                            this.buttonPressed = 1;
                            invalidate();
                        } else if (this.buttonState == 0) {
                            this.buttonPressed = 1;
                            invalidate();
                        } else {
                            this.photoPressed = true;
                        }
                    } else if (this.buttonState == 0) {
                        this.buttonPressed = 1;
                        invalidate();
                    } else {
                        this.photoPressed = true;
                    }
                } else if (this.buttonState == 0) {
                    this.buttonPressed = 1;
                    invalidate();
                } else {
                    this.photoPressed = true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.photoPressed) {
                    this.photoPressed = false;
                    this.parent.openPhoto(this.currentBlock, this.adapter);
                } else if (this.buttonPressed == 1) {
                    this.buttonPressed = 0;
                    playSoundEffect(0);
                    didPressedButton(true);
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.photoPressed = false;
            }
            return this.photoPressed || this.buttonPressed != 0 || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.captionLayout, this.textX, this.textY) || ArticleViewer.checkLayoutForLinks(this.parent, this.adapter, motionEvent, this, this.creditLayout, this.textX, this.textY + this.creditOffset) || super.onTouchEvent(motionEvent);
        }

        public void setBlock(TL_iv.pageBlockVideo pageblockvideo, BlockVideoCellState blockVideoCellState, boolean z, boolean z2, boolean z3) {
            setBlock(pageblockvideo, null, blockVideoCellState, z, z2, z3);
        }

        public void setParentBlock(TL_iv.pageBlockChannel pageblockchannel, TL_iv.PageBlock pageBlock) {
            this.parentBlock = pageBlock;
            if (pageblockchannel == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
                return;
            }
            this.channelCell.setBlock(pageblockchannel);
            this.channelCell.setVisibility(0);
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
        public void setVisibility(int i) {
            super.setVisibility(i);
            updateAttachedState();
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
                if (this.isGif) {
                    this.buttonState = -1;
                } else {
                    this.buttonState = 3;
                }
                this.radialProgress.setIcon(getIconForCurrentState(), false, z);
            } else {
                DownloadController.getInstance(currentAccount).addLoadingFileObserver(attachFileName, null, this);
                BlockVideoCellState blockVideoCellState = this.videoState;
                float fFloatValue = 0.0f;
                if (blockVideoCellState == null || blockVideoCellState.lastFrameBitmap == null) {
                    if (FileLoader.getInstance(currentAccount).isLoadingFile(attachFileName)) {
                        this.buttonState = 1;
                        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                        if (fileProgress != null) {
                            fFloatValue = fileProgress.floatValue();
                        }
                    } else if (!this.cancelLoading && this.autoDownload && this.isGif) {
                        this.buttonState = 1;
                    } else {
                        this.buttonState = 0;
                    }
                    this.radialProgress.setIcon(getIconForCurrentState(), z2, z);
                    this.radialProgress.setProgress(fFloatValue, false);
                } else {
                    this.buttonState = -1;
                }
                z2 = false;
                this.radialProgress.setIcon(getIconForCurrentState(), z2, z);
                this.radialProgress.setProgress(fFloatValue, false);
            }
            invalidate();
        }

        public void setBlock(TL_iv.pageBlockVideo pageblockvideo, TLObject tLObject, BlockVideoCellState blockVideoCellState, boolean z, boolean z2, boolean z3) {
            IArticleViewer iArticleViewer;
            VideoPlayerHolderBase videoPlayerHolderBase;
            TL_iv.pageBlockVideo pageblockvideo2 = this.currentBlock;
            if (pageblockvideo2 != null && (videoPlayerHolderBase = (iArticleViewer = this.parent).videoPlayer) != null && iArticleViewer.currentPlayer == this) {
                LongSparseArray longSparseArray = iArticleViewer.videoStates;
                long j = pageblockvideo2.video_id;
                BlockVideoCellState blockVideoCellStateFromPlayer = BlockVideoCellState.fromPlayer(videoPlayerHolderBase, this);
                this.videoState = blockVideoCellStateFromPlayer;
                longSparseArray.put(blockVideoCellStateFromPlayer, j);
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

        public void enrich(PageLayout pageLayout) {
            BotWebViewContainer.MyWebView webView = pageLayout.webViewContainer.getWebView();
            if (webView != null) {
                this.title = webView.getTitle();
                this.favicon = webView.getFavicon();
                this.lastUrl = webView.getUrl();
                this.actionBarColor = pageLayout.webActionBarColor;
                this.backgroundColor = pageLayout.webBackgroundColor;
            }
        }

        @Override
        public String getTitle() {
            BotWebViewContainer.MyWebView myWebView = this.webView;
            return (myWebView == null || TextUtils.isEmpty(myWebView.getTitle())) ? super.getTitle() : this.webView.getTitle();
        }
    }

    public class CheckForLongPress implements Runnable {
        public int currentPressCount;

        public CheckForLongPress() {
        }

        @Override
        public void run() {
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
            if (!ArticleViewer.this.checkingForLongPress || ArticleViewer.this.windowView == null) {
                return;
            }
            ArticleViewer.this.checkingForLongPress = false;
            ArticleViewer articleViewer = ArticleViewer.this;
            if (articleViewer.pressedLink != null) {
                try {
                    articleViewer.windowView.performHapticFeedback(0, 2);
                } catch (Exception unused) {
                }
                ArticleViewer articleViewer2 = ArticleViewer.this;
                articleViewer2.showCopyPopup(((TextPaintUrlSpan) articleViewer2.pressedLink.getSpan()).getUrl());
                ArticleViewer articleViewer3 = ArticleViewer.this;
                articleViewer3.pressedLink = null;
                articleViewer3.pressedLinkOwnerLayout = null;
                View view = articleViewer3.pressedLinkOwnerView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            View view2 = articleViewer.pressedLinkOwnerView;
            if (view2 != null && articleViewer.textSelectionHelper.isSelectable(view2)) {
                if (ArticleViewer.this.pressedLinkOwnerView.getTag() == null || ArticleViewer.this.pressedLinkOwnerView.getTag() != "bottomSheet" || (articleTextSelectionHelper = ArticleViewer.this.textSelectionHelperBottomSheet) == null) {
                    ArticleViewer.this.textSelectionHelper.trySelect();
                } else {
                    articleTextSelectionHelper.trySelect();
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
            ArticleViewer articleViewer4 = ArticleViewer.this;
            if (articleViewer4.pressedLinkOwnerLayout == null || articleViewer4.pressedLinkOwnerView == null) {
                return;
            }
            try {
                articleViewer4.windowView.performHapticFeedback(0, 2);
            } catch (Exception unused3) {
            }
            int[] iArr = new int[2];
            ArticleViewer.this.pressedLinkOwnerView.getLocationInWindow(iArr);
            int iDp = (iArr[1] + ArticleViewer.this.pressedLayoutY) - AndroidUtilities.dp(54.0f);
            if (iDp < 0) {
                iDp = 0;
            }
            ArticleViewer.this.pressedLinkOwnerView.invalidate();
            ArticleViewer articleViewer5 = ArticleViewer.this;
            articleViewer5.drawBlockSelection = true;
            articleViewer5.showPopup(articleViewer5.pressedLinkOwnerView, 48, 0, iDp);
            ArticleViewer.this.pages[0].listView.setLayoutFrozen(true);
            ArticleViewer.this.pages[0].listView.setLayoutFrozen(false);
        }
    }

    public final class CheckForTap implements Runnable {
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
        public List<SpoilerEffect> spoilers;
        public AtomicReference<Layout> spoilersPatchedLayout;
        public Stack<SpoilerEffect> spoilersPool;
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
            if (this.parent.searchResults.isEmpty()) {
                this.searchIndex = -1;
                this.searchPath = null;
            } else {
                IArticleViewer iArticleViewer = this.parent;
                SearchResult searchResult = iArticleViewer.searchResults.get(iArticleViewer.currentSearchIndex);
                if (searchResult.block != this.parentBlock || (searchResult.text != this.parentText && (!(searchResult.text instanceof String) || this.parentText != null))) {
                    this.searchIndex = -1;
                    this.searchPath = null;
                } else if (this.searchIndex != searchResult.index) {
                    LinkPath linkPath = new LinkPath(true);
                    this.searchPath = linkPath;
                    linkPath.setAllowReset(false);
                    this.searchPath.setCurrentLayout(this.textLayout, searchResult.index, 0.0f);
                    this.searchPath.setBaselineShift(0);
                    this.textLayout.getSelectionPath(searchResult.index, this.parent.searchText.length() + searchResult.index, this.searchPath);
                    this.searchPath.setAllowReset(true);
                }
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
                List<SpoilerEffect> list = this.spoilers;
                if (list == null || list.isEmpty()) {
                    this.textLayout.draw(canvas);
                } else {
                    SpoilerEffect.renderWithRipple(view, false, this.textLayout.getPaint().getColor(), 0, this.spoilersPatchedLayout, 0, this.textLayout, this.spoilers, canvas, false);
                }
            }
            this.isDrawing = false;
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

        @Override
        public final int getEmojiOnlyCount() {
            return TableLayout.CellText.CC.$default$getEmojiOnlyCount(this);
        }

        public int getHeight() {
            return this.textLayout.getHeight();
        }

        public int getLastLineBoundRight() {
            int i = this.lastLineBoundRight;
            if (i != -1) {
                return i;
            }
            this.lastLineBoundRight = 0;
            if (this.textLayout.getLineCount() > 0) {
                int i2 = this.lastLineBoundRight;
                StaticLayout staticLayout = this.textLayout;
                this.lastLineBoundRight = Math.max(i2, (int) staticLayout.getLineRight(staticLayout.getLineCount() - 1));
            }
            return this.lastLineBoundRight;
        }

        @Override
        public Layout getLayout() {
            return this.textLayout;
        }

        public int getLineAscent(int i) {
            return this.textLayout.getLineAscent(i);
        }

        public int getLineCount() {
            return this.textLayout.getLineCount();
        }

        public float getLineLeft(int i) {
            return this.textLayout.getLineLeft(i);
        }

        public float getLineWidth(int i) {
            return this.textLayout.getLineWidth(i);
        }

        @Override
        public View getParentView() {
            View view = this.attachedToView;
            return view != null ? view : this.latestParentView;
        }

        @Override
        public CharSequence getPrefix() {
            return this.prefix;
        }

        @Override
        public int getRow() {
            return this.row;
        }

        @Override
        public Rect getSelectionBounds() {
            return null;
        }

        @Override
        public CharSequence getText() {
            return this.textLayout.getText();
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

        public void invalidateParent() {
            View view;
            if (this.isDrawing || (view = this.latestParentView) == null) {
                return;
            }
            view.invalidate();
        }

        public boolean isAttached() {
            return this.attached;
        }

        @Override
        public void setRow(int i) {
            this.row = i;
        }

        @Override
        public void setX(int i) {
            this.x = i;
        }

        @Override
        public void setY(int i) {
            this.y = i;
        }
    }

    public class FontCell extends FrameLayout {
        private RadioButton radioButton;
        private TextView textView;

        public FontCell(Context context) {
            super(context);
            setBackgroundDrawable(Theme.createSelectorDrawable(ArticleViewer.this.getThemedColor(Theme.key_listSelector), 2, -1));
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
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setChecked(this.radioButton.isChecked());
            accessibilityNodeInfo.setCheckable(true);
        }

        @Override
        public void onMeasure(int i, int i2) {
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
    }

    public interface IBlock {

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

        int getBoundLeft();

        int getBoundRight();

        int getLastLineBoundRight();

        int getMinWidth();
    }

    public class PageBlocksPhotoViewerProvider extends PhotoViewer.EmptyPhotoViewerProvider {
        private final List<TL_iv.PageBlock> pageBlocks;
        private final int[] tempArr = new int[2];

        public PageBlocksPhotoViewerProvider(List<TL_iv.PageBlock> list) {
            this.pageBlocks = list;
        }

        private ImageReceiver getImageReceiverFromListView(ViewGroup viewGroup, TL_iv.PageBlock pageBlock, int[] iArr) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ImageReceiver imageReceiverView = getImageReceiverView(viewGroup.getChildAt(i), pageBlock, iArr);
                if (imageReceiverView != null) {
                    return imageReceiverView;
                }
            }
            return null;
        }

        private ImageReceiver getImageReceiverView(View view, TL_iv.PageBlock pageBlock, int[] iArr) {
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
                    if (Build.VERSION.SDK_INT >= 24) {
                        Surface surface = new Surface(blockVideoCell.textureView.getSurfaceTexture());
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(blockVideoCell.textureView.getMeasuredWidth(), blockVideoCell.textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        AndroidUtilities.getBitmapFromSurface(surface, bitmapCreateBitmap);
                        surface.release();
                        blockVideoCell.imageView.setImageBitmap(bitmapCreateBitmap);
                    } else {
                        blockVideoCell.imageView.setImageBitmap(blockVideoCell.textureView.getBitmap());
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

        @Override
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
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

        @Override
        public void onClose() {
            super.onClose();
            ArticleViewer.this.checkVideoPlayer();
        }

        @Override
        public void onReleasePlayerBeforeClose(int i) {
            TL_iv.PageBlock pageBlock = (i < 0 || i >= this.pageBlocks.size()) ? null : this.pageBlocks.get(i);
            VideoPlayer videoPlayer = PhotoViewer.getInstance().getVideoPlayer();
            TextureView videoTextureView = PhotoViewer.getInstance().getVideoTextureView();
            SurfaceView videoSurfaceView = PhotoViewer.getInstance().getVideoSurfaceView();
            BlockVideoCell viewFromListView = getViewFromListView(ArticleViewer.this.pages[0].listView, pageBlock);
            if (viewFromListView != null && videoPlayer != null && videoTextureView != null) {
                ArticleViewer.this.videoStates.put(viewFromListView.setState(BlockVideoCellState.fromPlayer(videoPlayer, viewFromListView, videoTextureView)), viewFromListView.currentBlock.video_id);
                viewFromListView.firstFrameRendered = false;
                viewFromListView.textureView.setAlpha(0.0f);
                if (viewFromListView.videoState != null && viewFromListView.videoState.lastFrameBitmap != null) {
                    viewFromListView.imageView.setImageBitmap(viewFromListView.videoState.lastFrameBitmap);
                }
            }
            if (viewFromListView != null && videoPlayer != null && videoSurfaceView != null) {
                ArticleViewer.this.videoStates.put(viewFromListView.setState(BlockVideoCellState.fromPlayer(videoPlayer, viewFromListView, videoSurfaceView)), viewFromListView.currentBlock.video_id);
                viewFromListView.firstFrameRendered = false;
                viewFromListView.textureView.setAlpha(0.0f);
                if (viewFromListView.videoState != null && viewFromListView.videoState.lastFrameBitmap != null) {
                    viewFromListView.imageView.setImageBitmap(viewFromListView.videoState.lastFrameBitmap);
                }
            }
            ArticleViewer.this.checkVideoPlayer();
        }
    }

    public class PageLayout extends FrameLayout {
        public static final int TYPE_ARTICLE = 0;
        public static final int TYPE_WEB = 1;
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
                public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
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
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
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
                    if (sheet2 != null) {
                        sheet2.windowView.invalidate();
                    } else if (articleViewer.windowView != null) {
                        ArticleViewer.this.windowView.invalidate();
                    }
                    ArticleViewer.this.updatePages();
                    ArticleViewer.this.checkScroll(i3);
                }
            });
            addView(webpageListView, LayoutHelper.createFrame(-1, -1.0f));
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer(getContext()) {
                private boolean ignoreLayout;

                @Override
                public void onMeasure(int i2, int i3) {
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
                public void onErrorShown(boolean z, int i2, String str) {
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

                @Override
                public void onFaviconChanged(Bitmap bitmap) {
                }

                @Override
                public void onTitleChanged(String str) {
                    ArticleViewer.this.updateTitle(true);
                }

                @Override
                public void onURLChanged(String str, boolean z, boolean z2) {
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
                        ArticleViewer.this.actionBar.forwardButtonDrawable.setState();
                    } else {
                        ArticleViewer.this.actionBar.setBackButtonCached(false);
                        ArticleViewer.this.actionBar.forwardButtonDrawable.setState();
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
                public void onWebViewCreated(BotWebViewContainer.MyWebView myWebView) {
                    PageLayout.this.swipeContainer.setWebView(myWebView);
                }

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
            };
            this.webViewContainer = botWebViewContainer;
            final int i2 = 0;
            botWebViewContainer.setOnCloseRequestedListener(new Runnable(this) {
                public final ArticleViewer.PageLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$0();
                            break;
                        case 1:
                            this.f$0.lambda$new$2();
                            break;
                        default:
                            this.f$0.lambda$new$4();
                            break;
                    }
                }
            });
            botWebViewContainer.setWebViewProgressListener(new ChatActivity$$ExternalSyntheticLambda353(this, 2));
            botWebViewContainer.setDelegate(new BotWebViewContainer.Delegate() {
                @Override
                public BotSensors getBotSensors() {
                    return null;
                }

                public String getWebAppName() {
                    return null;
                }

                @Override
                public boolean isClipboardAvailable() {
                    return false;
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
                public void onEmojiStatusGranted(boolean z) {
                }

                @Override
                public void onEmojiStatusSet(TLRPC.Document document) {
                }

                @Override
                public String onFullscreenRequested(boolean z, boolean z2) {
                    return "UNSUPPORTED";
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
                public void onLocationGranted(boolean z) {
                }

                @Override
                public void onOpenBackFromTabs() {
                }

                @Override
                public void onOrientationLockChanged(boolean z) {
                }

                @Override
                public void onSendWebViewData(String str) {
                }

                @Override
                public void onSetBackButtonVisible(boolean z) {
                }

                @Override
                public void onSetSettingsButtonVisible(boolean z) {
                }

                @Override
                public void onSetupMainButton(boolean z, boolean z2, String str, long j, int i3, int i4, boolean z3, boolean z4) {
                }

                @Override
                public void onSetupSecondaryButton(boolean z, boolean z2, String str, long j, int i3, int i4, boolean z3, boolean z4, String str2) {
                }

                @Override
                public void onSharedTo(ArrayList arrayList) {
                }

                @Override
                public void onWebAppBackgroundChanged(boolean z, int i3) {
                    PageLayout.this.setWebBgColor(z, i3);
                }

                @Override
                public void onWebAppExpand() {
                }

                @Override
                public void onWebAppOpenInvoice(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
                }

                @Override
                public void onWebAppReady() {
                }

                @Override
                public void onWebAppSetActionBarColor(int i3, int i4, boolean z) {
                }

                @Override
                public void onWebAppSetBackgroundColor(int i3) {
                }

                @Override
                public void onWebAppSetNavigationBarColor(int i3) {
                }

                @Override
                public void onWebAppSetupClosingBehavior(boolean z) {
                }

                @Override
                public void onWebAppSwipingBehavior(boolean z) {
                }

                @Override
                public void onWebAppSwitchInlineQuery(TLRPC.User user, String str, List<String> list) {
                }
            });
            botWebViewContainer.setWebViewScrollListener(new BotWebViewContainer.WebViewScrollListener() {
                @Override
                public void onWebViewScrolled(WebView webView, int i3, int i4) {
                    ArticleViewer.this.updatePages();
                }
            });
            webViewSwipeContainer.addView(botWebViewContainer, LayoutHelper.createFrame(-1, -1.0f));
            final int i3 = 1;
            webViewSwipeContainer.setScrollEndListener(new Runnable(this) {
                public final ArticleViewer.PageLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$new$0();
                            break;
                        case 1:
                            this.f$0.lambda$new$2();
                            break;
                        default:
                            this.f$0.lambda$new$4();
                            break;
                    }
                }
            });
            webViewSwipeContainer.setDelegate(new PhotoViewer$55$$ExternalSyntheticLambda2(this, 28));
            final int i4 = 2;
            webViewSwipeContainer.setScrollListener(new Runnable(this) {
                public final ArticleViewer.PageLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$new$0();
                            break;
                        case 1:
                            this.f$0.lambda$new$2();
                            break;
                        default:
                            this.f$0.lambda$new$4();
                            break;
                    }
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

        public void lambda$createErrorContainer$5(View view) {
            BotWebViewContainer.MyWebView webView = this.webViewContainer.getWebView();
            if (webView != null) {
                webView.reload();
            }
        }

        public void lambda$new$0() {
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity == null) {
                return;
            }
            BottomSheetTabs bottomSheetTabs = launchActivity.getBottomSheetTabs();
            if (bottomSheetTabs != null) {
                ArticleViewer articleViewer = ArticleViewer.this;
                boolean zRemoveTab = false;
                int i = 0;
                loop0: while (true) {
                    HashMap map = BottomSheetTabs.tabs;
                    if (i >= map.size()) {
                        break;
                    }
                    ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(i));
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            BottomSheetTabs.WebTabData webTabData = (BottomSheetTabs.WebTabData) obj;
                            if (webTabData.articleViewer == articleViewer) {
                                zRemoveTab = bottomSheetTabs.removeTab(i, webTabData, true);
                                break loop0;
                            }
                        }
                    }
                    i++;
                }
                if (zRemoveTab) {
                    return;
                }
            }
            ArticleViewer.this.close(true, true);
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
                errorContainer.layout.setTranslationY(((this.swipeContainer.getTopActionBarOffsetY() + (-this.swipeContainer.getOffsetY())) - this.swipeContainer.getSwipeOffsetY()) / 2.0f);
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

        public void addProgress(float f) {
            BotWebViewContainer.MyWebView webView;
            float fClamp01 = Utilities.clamp01(getProgress() + f);
            if (isArticle() || !isWeb() || (webView = this.webViewContainer.getWebView()) == null) {
                return;
            }
            webView.setScrollProgress(fClamp01);
            ArticleViewer.this.updatePages();
        }

        public void back() {
            if (!isWeb() || getWebView() == null) {
                return;
            }
            getWebView().goBack();
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

        public ErrorContainer createErrorContainer() {
            if (this.errorContainer == null) {
                ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
                ErrorContainer errorContainer = new ErrorContainer(getContext());
                this.errorContainer = errorContainer;
                webViewSwipeContainer.addView(errorContainer, LayoutHelper.createFrame(-1, -1.0f));
                this.errorContainer.buttonView.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 29));
                AndroidUtilities.updateViewVisibilityAnimated(this.errorContainer, this.errorShown, 1.0f, false);
            }
            return this.errorContainer;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
        }

        public void forward() {
        }

        public int getActionBarColor() {
            return (isWeb() && SharedConfig.adaptableColorInBrowser) ? this.webActionBarColor : ArticleViewer.this.getThemedColor(Theme.key_iv_background);
        }

        public WebpageAdapter getAdapter() {
            return this.adapter;
        }

        public int getBackgroundColor() {
            if (isWeb() && SharedConfig.adaptableColorInBrowser) {
                return this.errorShown ? ArticleViewer.this.getThemedColor(Theme.key_iv_background) : this.webBackgroundColor;
            }
            return ArticleViewer.this.getThemedColor(Theme.key_iv_background);
        }

        public float getListTop() {
            if (!isArticle()) {
                if (isWeb()) {
                    return this.swipeContainer.getTranslationY();
                }
                return 0.0f;
            }
            float height = this.listView.getHeight();
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                RecyclerListView recyclerListView = this.listView;
                height = ((recyclerListView == null || recyclerListView.getLayoutManager() == null) ? 0 : this.listView.getLayoutManager().getItemViewType(childAt)) == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
            }
            return height;
        }

        public RecyclerListView getListView() {
            return this.listView;
        }

        public float getProgress() {
            BotWebViewContainer.MyWebView webView;
            Sheet sheet;
            if (!isArticle()) {
                if (!isWeb() || (webView = this.webViewContainer.getWebView()) == null) {
                    return 0.0f;
                }
                return webView.getScrollProgress();
            }
            float f = this.overrideProgress;
            if (f >= 0.0f) {
                return f;
            }
            int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
            View viewFindViewByPosition = this.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition == null) {
                return 0.0f;
            }
            int[] iArr = this.adapter.sumItemHeights;
            if (iArr != null) {
                int i = iFindFirstVisibleItemPosition - 1;
                return Utilities.clamp01((((i < 0 || i >= iArr.length) ? 0 : iArr[i]) + ((iFindFirstVisibleItemPosition == 0 && (sheet = ArticleViewer.this.sheet) != null && sheet.halfSize()) ? 0 : -viewFindViewByPosition.getTop())) / Math.max(1, this.adapter.fullHeight - this.listView.getHeight()));
            }
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
            int itemCount = this.layoutManager.getItemCount();
            int i2 = itemCount - 2;
            View viewFindViewByPosition2 = iFindLastVisibleItemPosition >= i2 ? this.layoutManager.findViewByPosition(i2) : this.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition2 == null) {
                return 0.0f;
            }
            float width = getWidth() / (itemCount - 1);
            float measuredHeight = viewFindViewByPosition2.getMeasuredHeight();
            return ((iFindFirstVisibleItemPosition * width) + (iFindLastVisibleItemPosition >= i2 ? (((i2 - iFindFirstVisibleItemPosition) * width) * (this.listView.getMeasuredHeight() - viewFindViewByPosition2.getTop())) / measuredHeight : (1.0f - ((Math.min(0, viewFindViewByPosition2.getTop() - this.listView.getPaddingTop()) + measuredHeight) / measuredHeight)) * width)) / getWidth();
        }

        public String getSubtitle() {
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

        public String getTitle() {
            BotWebViewContainer.MyWebView webView;
            if (isArticle()) {
                if (this.adapter.currentPage != null && this.adapter.currentPage.site_name != null) {
                    return this.adapter.currentPage.site_name;
                }
                if (this.adapter.currentPage != null && this.adapter.currentPage.title != null) {
                    return this.adapter.currentPage.title;
                }
            }
            return (!isWeb() || (webView = this.webViewContainer.getWebView()) == null) ? "" : webView.getTitle();
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

        public boolean hasBackButton() {
            return this.backButton;
        }

        public boolean hasForwardButton() {
            return this.forwardButton;
        }

        public boolean isArticle() {
            return this.type == 0;
        }

        public boolean isAtTop() {
            if (isArticle()) {
                return !this.listView.canScrollVertically(-1);
            }
            isWeb();
            return false;
        }

        public boolean isLocal() {
            WebpageAdapter webpageAdapter;
            return (isWeb() || (webpageAdapter = this.adapter) == null || webpageAdapter.currentPage == null || this.adapter.currentPage.cached_page == null || this.adapter.currentPage.cached_page.local == null) ? false : true;
        }

        public boolean isTonsite() {
            BotWebViewContainer.MyWebView webView;
            if (isWeb() && (webView = getWebView()) != null) {
                return BotWebViewContainer.isTonsite(BotWebViewContainer.magic2tonsite(webView.getUrl()));
            }
            return false;
        }

        public boolean isWeb() {
            return this.type == 1;
        }

        public WebInstantView.Loader loadInstant() {
            if (!isWeb()) {
                WebInstantView.Loader loader = this.currentInstantLoader;
                if (loader != null) {
                    loader.cancel();
                    WebInstantView.Loader loader2 = this.currentInstantLoader;
                    TLRPC.TL_webPage tL_webPage = loader2.localPage;
                    if (tL_webPage != null) {
                        WebInstantView.recycle(tL_webPage);
                        loader2.localPage = null;
                    }
                    this.currentInstantLoader = null;
                    return null;
                }
            } else {
                if (getWebView() != null) {
                    WebInstantView.Loader loader3 = this.currentInstantLoader;
                    if (loader3 != null && (loader3.currentIsLoaded != getWebView().isPageLoaded || this.currentInstantLoader.currentProgress != getWebView().getProgress())) {
                        this.currentInstantLoader.retryLocal(getWebView());
                        return this.currentInstantLoader;
                    }
                    if (this.currentInstantLoader != null && TextUtils.equals(getWebView().getUrl(), this.currentInstantLoader.currentUrl)) {
                        return this.currentInstantLoader;
                    }
                    WebInstantView.Loader loader4 = this.currentInstantLoader;
                    if (loader4 != null) {
                        loader4.cancel();
                        WebInstantView.Loader loader5 = this.currentInstantLoader;
                        TLRPC.TL_webPage tL_webPage2 = loader5.localPage;
                        if (tL_webPage2 != null) {
                            WebInstantView.recycle(tL_webPage2);
                            loader5.localPage = null;
                        }
                        this.currentInstantLoader = null;
                    }
                    WebInstantView.Loader loader6 = new WebInstantView.Loader(ArticleViewer.this.currentAccount);
                    this.currentInstantLoader = loader6;
                    BotWebViewContainer.MyWebView webView = getWebView();
                    if (!loader6.started) {
                        loader6.started = true;
                        loader6.currentUrl = webView.getUrl();
                        loader6.currentProgress = webView.getProgress();
                        loader6.currentIsLoaded = webView.isPageLoaded;
                        loader6.cancelLocal = WebInstantView.generate(webView, new WebInstantView$Loader$$ExternalSyntheticLambda0(loader6, 0));
                        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                        tL_messages_getWebPage.url = loader6.currentUrl;
                        tL_messages_getWebPage.hash = 0;
                        loader6.reqId = ConnectionsManager.getInstance(loader6.currentAccount).sendRequest(tL_messages_getWebPage, new RichMediaUploader$$ExternalSyntheticLambda0(loader6, 28));
                    }
                    return this.currentInstantLoader;
                }
                WebInstantView.Loader loader7 = this.currentInstantLoader;
                if (loader7 != null) {
                    loader7.cancel();
                    WebInstantView.Loader loader8 = this.currentInstantLoader;
                    TLRPC.TL_webPage tL_webPage3 = loader8.localPage;
                    if (tL_webPage3 != null) {
                        WebInstantView.recycle(tL_webPage3);
                        loader8.localPage = null;
                    }
                    this.currentInstantLoader = null;
                }
            }
            return null;
        }

        @Override
        public void onAttachedToWindow() {
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

        public void scrollToTop(boolean z) {
            if (!isArticle()) {
                if (isWeb()) {
                    if (z) {
                        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
                        webViewSwipeContainer.stickTo(this.swipeContainer.getTopActionBarOffsetY() + (-webViewSwipeContainer.getOffsetY()));
                        return;
                    } else {
                        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer2 = this.swipeContainer;
                        webViewSwipeContainer2.setSwipeOffsetY(this.swipeContainer.getTopActionBarOffsetY() + (-webViewSwipeContainer2.getOffsetY()));
                        return;
                    }
                }
                return;
            }
            if (!z) {
                LinearLayoutManager linearLayoutManager = this.layoutManager;
                Sheet sheet = ArticleViewer.this.sheet;
                linearLayoutManager.scrollToPositionWithOffset((sheet == null || !sheet.halfSize()) ? 0 : 1, ArticleViewer.this.sheet != null ? AndroidUtilities.dp(32.0f) : 0);
                return;
            }
            SmoothScroller smoothScroller = new SmoothScroller(getContext());
            Sheet sheet2 = ArticleViewer.this.sheet;
            if (sheet2 == null || !sheet2.halfSize()) {
                smoothScroller.setTargetPosition(0);
            } else {
                smoothScroller.setTargetPosition(1);
                smoothScroller.setOffset(-AndroidUtilities.dp(32.0f));
            }
            this.layoutManager.startSmoothScroll(smoothScroller);
        }

        public void setLastVisible(boolean z) {
            if (this.lastVisible != z) {
                this.lastVisible = z;
                this.webViewContainer.setKeyboardFocusable(z);
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
                float measuredWidth = f / getMeasuredWidth();
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.setCurrentHeaderHeight((int) (((AndroidUtilities.dp(56.0f) - ArticleViewer.this.windowView.startMovingHeaderHeight) * measuredWidth) + articleViewer.windowView.startMovingHeaderHeight));
            }
            Sheet sheet = ArticleViewer.this.sheet;
            if (sheet != null) {
                sheet.updateTranslation();
            }
        }

        public void setType(int i) {
            if (this.type != i) {
                cleanup();
            }
            this.type = i;
            this.listView.setVisibility(isArticle() ? 0 : 8);
            this.swipeContainer.setVisibility(isWeb() ? 0 : 8);
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
                WebInstantView.Loader loader = this.currentInstantLoader;
                if (loader != null) {
                    loader.cancel();
                    WebInstantView.Loader loader2 = this.currentInstantLoader;
                    TLRPC.TL_webPage tL_webPage = loader2.localPage;
                    if (tL_webPage != null) {
                        WebInstantView.recycle(tL_webPage);
                        loader2.localPage = null;
                    }
                    this.currentInstantLoader = null;
                }
            }
        }

        public void updateWeb() {
            CachedWeb cachedWeb = this.web;
            if (cachedWeb != null) {
                cachedWeb.enrich(this);
            }
        }
    }

    public class RealPageBlocksAdapter implements PhotoViewer.PageBlocksAdapter {
        private final TLRPC.WebPage page;
        private final List<TL_iv.PageBlock> pageBlocks;

        @Override
        public TL_iv.PageBlock get(int i) {
            return this.pageBlocks.get(i);
        }

        @Override
        public List<TL_iv.PageBlock> getAll() {
            return this.pageBlocks;
        }

        @Override
        public CharSequence getCaption(int i) {
            SpannableStringBuilder spannableStringBuilder;
            TL_iv.PageBlock pageBlock = get(i);
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                String str = ((TL_iv.pageBlockPhoto) pageBlock).url;
                if (TextUtils.isEmpty(str)) {
                    spannableStringBuilder = null;
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new URLSpan(str) {
                        @Override
                        public void onClick(View view) {
                            ArticleViewer articleViewer = ArticleViewer.this;
                            String url = getURL();
                            ArticleViewer articleViewer2 = ArticleViewer.this;
                            articleViewer.openWebpageUrl(url, null, articleViewer2.makeProgress(articleViewer2.pressedLink, articleViewer2.pressedLinkOwnerLayout));
                        }
                    }, 0, str.length(), 34);
                }
            } else {
                spannableStringBuilder = null;
            }
            if (spannableStringBuilder != null) {
                return spannableStringBuilder;
            }
            TL_iv.RichText blockCaption = ArticleViewer.this.getBlockCaption(pageBlock, 2);
            CharSequence text = ArticleViewer.this.getText(this.page, (View) null, blockCaption, blockCaption, pageBlock, -AndroidUtilities.dp(100.0f));
            if (!(text instanceof Spannable)) {
                return text;
            }
            Spannable spannable = (Spannable) text;
            TextPaintUrlSpan[] textPaintUrlSpanArr = (TextPaintUrlSpan[]) spannable.getSpans(0, text.length(), TextPaintUrlSpan.class);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(text.toString());
            if (textPaintUrlSpanArr != null && textPaintUrlSpanArr.length > 0) {
                for (int i2 = 0; i2 < textPaintUrlSpanArr.length; i2++) {
                    spannableStringBuilder2.setSpan(new URLSpan(textPaintUrlSpanArr[i2].getUrl()) {
                        @Override
                        public void onClick(View view) {
                            ArticleViewer.this.openWebpageUrl(getURL(), null, null);
                        }
                    }, spannable.getSpanStart(textPaintUrlSpanArr[i2]), spannable.getSpanEnd(textPaintUrlSpanArr[i2]), 33);
                }
            }
            return spannableStringBuilder2;
        }

        @Override
        public File getFile(int i) {
            if (i >= this.pageBlocks.size() || i < 0) {
                return null;
            }
            return WebPageUtils.getMediaFile(this.page, get(i));
        }

        @Override
        public TLRPC.PhotoSize getFileLocation(TLObject tLObject, int[] iArr) {
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            if (!(tLObject instanceof TLRPC.Photo)) {
                if (!(tLObject instanceof TLRPC.Document) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Document) tLObject).thumbs, 90)) == null) {
                    return null;
                }
                int i = closestPhotoSizeWithSize.size;
                iArr[0] = i;
                if (i == 0) {
                    iArr[0] = -1;
                }
                return closestPhotoSizeWithSize;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize2 == null) {
                iArr[0] = -1;
                return null;
            }
            int i2 = closestPhotoSizeWithSize2.size;
            iArr[0] = i2;
            if (i2 == 0) {
                iArr[0] = -1;
            }
            return closestPhotoSizeWithSize2;
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
        public int getItemsCount() {
            return this.pageBlocks.size();
        }

        @Override
        public TLObject getMedia(int i) {
            if (i >= this.pageBlocks.size() || i < 0) {
                return null;
            }
            return WebPageUtils.getMedia(this.page, get(i));
        }

        @Override
        public Object getParentObject() {
            return this.page;
        }

        @Override
        public boolean isHardwarePlayer(int i) {
            return i < this.pageBlocks.size() && i >= 0 && !WebPageUtils.isVideo(this.page, get(i)) && ArticleViewer.this.pages[0].adapter.getTypeForBlock(get(i)) == 5;
        }

        @Override
        public boolean isVideo(int i) {
            return i < this.pageBlocks.size() && i >= 0 && WebPageUtils.isVideo(this.page, get(i));
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

        private RealPageBlocksAdapter(TLRPC.WebPage webPage, List<TL_iv.PageBlock> list) {
            this.page = webPage;
            this.pageBlocks = list;
        }
    }

    public class ReportCell extends FrameLayout {
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
        public void onMeasure(int i, int i2) {
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

    public static class Resources {
        public TextPaint errorTextPaint;
        public final boolean isRichMessage;
        public final SparseArray<TextPaint> photoCaptionTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> photoCreditTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> titleTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> kickerTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> headerTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> subtitleTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> subheaderTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> heading1TextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> heading2TextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> heading3TextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> heading4TextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> heading5TextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> heading6TextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> authorTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> footerTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> paragraphTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> listTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> preformattedTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> quoteTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> embedPostTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> embedPostCaptionTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> mediaCaptionTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> mediaCreditTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> relatedArticleTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> detailsTextPaints = new SparseArray<>();
        public final SparseArray<TextPaint> tableTextPaints = new SparseArray<>();

        public Resources(boolean z) {
            this.isRichMessage = z;
        }

        private void setMapColors(IArticleViewer iArticleViewer, SparseArray<TextPaint> sparseArray) {
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                TextPaint textPaintValueAt = sparseArray.valueAt(i);
                if (textPaintValueAt != null) {
                    if ((iKeyAt & 8) == 0 && (iKeyAt & 512) == 0) {
                        textPaintValueAt.setColor(iArticleViewer.getTextColor());
                    } else {
                        textPaintValueAt.setColor(iArticleViewer.getLinkTextColor());
                    }
                }
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

        public void updatePaintFonts(int i) {
            int i2 = 0;
            ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).edit().putInt("font_type", i).commit();
            Typeface typeface = i == 0 ? Typeface.DEFAULT : Typeface.SERIF;
            Typeface typeface2 = i == 0 ? AndroidUtilities.getTypeface("fonts/ritalic.ttf") : Typeface.create("serif", 2);
            Typeface typefaceBold = i == 0 ? AndroidUtilities.bold() : Typeface.create("serif", 1);
            Typeface typeface3 = i == 0 ? AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf") : Typeface.create("serif", 3);
            for (int i3 = 0; i3 < this.quoteTextPaints.size(); i3++) {
                updateFontEntry(this.quoteTextPaints.keyAt(i3), this.quoteTextPaints.valueAt(i3), typeface, typeface3, typefaceBold, typeface2);
            }
            Resources resources = this;
            for (int i4 = 0; i4 < resources.preformattedTextPaints.size(); i4++) {
                resources.updateFontEntry(resources.preformattedTextPaints.keyAt(i4), resources.preformattedTextPaints.valueAt(i4), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i5 = 0; i5 < resources.paragraphTextPaints.size(); i5++) {
                resources.updateFontEntry(resources.paragraphTextPaints.keyAt(i5), resources.paragraphTextPaints.valueAt(i5), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i6 = 0; i6 < resources.listTextPaints.size(); i6++) {
                resources.updateFontEntry(resources.listTextPaints.keyAt(i6), resources.listTextPaints.valueAt(i6), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i7 = 0; i7 < resources.embedPostTextPaints.size(); i7++) {
                resources.updateFontEntry(resources.embedPostTextPaints.keyAt(i7), resources.embedPostTextPaints.valueAt(i7), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i8 = 0; i8 < resources.mediaCaptionTextPaints.size(); i8++) {
                resources.updateFontEntry(resources.mediaCaptionTextPaints.keyAt(i8), resources.mediaCaptionTextPaints.valueAt(i8), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i9 = 0; i9 < resources.mediaCreditTextPaints.size(); i9++) {
                resources.updateFontEntry(resources.mediaCreditTextPaints.keyAt(i9), resources.mediaCreditTextPaints.valueAt(i9), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i10 = 0; i10 < resources.photoCaptionTextPaints.size(); i10++) {
                resources.updateFontEntry(resources.photoCaptionTextPaints.keyAt(i10), resources.photoCaptionTextPaints.valueAt(i10), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i11 = 0; i11 < resources.photoCreditTextPaints.size(); i11++) {
                resources.updateFontEntry(resources.photoCreditTextPaints.keyAt(i11), resources.photoCreditTextPaints.valueAt(i11), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i12 = 0; i12 < resources.authorTextPaints.size(); i12++) {
                resources.updateFontEntry(resources.authorTextPaints.keyAt(i12), resources.authorTextPaints.valueAt(i12), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i13 = 0; i13 < resources.footerTextPaints.size(); i13++) {
                resources.updateFontEntry(resources.footerTextPaints.keyAt(i13), resources.footerTextPaints.valueAt(i13), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i14 = 0; i14 < resources.embedPostCaptionTextPaints.size(); i14++) {
                resources.updateFontEntry(resources.embedPostCaptionTextPaints.keyAt(i14), resources.embedPostCaptionTextPaints.valueAt(i14), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i15 = 0; i15 < resources.relatedArticleTextPaints.size(); i15++) {
                resources.updateFontEntry(resources.relatedArticleTextPaints.keyAt(i15), resources.relatedArticleTextPaints.valueAt(i15), typeface, typeface3, typefaceBold, typeface2);
            }
            for (int i16 = 0; i16 < resources.detailsTextPaints.size(); i16++) {
                resources.updateFontEntry(resources.detailsTextPaints.keyAt(i16), resources.detailsTextPaints.valueAt(i16), typeface, typeface3, typefaceBold, typeface2);
            }
            while (i2 < resources.tableTextPaints.size()) {
                resources.updateFontEntry(resources.tableTextPaints.keyAt(i2), resources.tableTextPaints.valueAt(i2), typeface, typeface3, typefaceBold, typeface2);
                i2++;
                resources = this;
            }
        }
    }

    public static class ScrollEvaluator extends IntEvaluator {
        @Override
        public Integer evaluate(float f, Integer num, Integer num2) {
            return super.evaluate(f, num, num2);
        }
    }

    public static class SearchResult {
        private TL_iv.PageBlock block;
        private int index;
        private Object text;
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
        public boolean preserve;
        private boolean released;
        public Theme.ResourcesProvider resourcesProvider;
        private boolean wasFullyVisible;
        public final WindowView windowView;

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
            public void dispatchDraw(Canvas canvas) {
                char c;
                char c2;
                boolean z;
                if (this.drawingFromOverlay) {
                    return;
                }
                float fMin = Math.min(Sheet.this.openProgress, 1.0f - Sheet.this.dismissProgress);
                this.scrimPaint.setColor(-16777216);
                this.scrimPaint.setAlpha((int) ((1.0f - Sheet.this.backProgress) * 96.0f * fMin));
                Canvas canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.scrimPaint);
                int listTop = Sheet.this.getListTop() - Sheet.this.getListPaddingTop();
                boolean z2 = listTop < ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight && fMin > 0.95f;
                Sheet sheet = Sheet.this;
                if (sheet.attachedToActionBar != z2) {
                    sheet.attachedToActionBar = z2;
                    sheet.checkNavColor();
                }
                float f = this.attachedActionBar.set(z2);
                Sheet sheet2 = Sheet.this;
                if (sheet2.fullyAttachedToActionBar != (f >= 0.999f)) {
                    sheet2.fullyAttachedToActionBar = f >= 0.999f;
                    sheet2.checkFullyVisible();
                }
                int iLerp = AndroidUtilities.lerp(listTop, 0, Utilities.clamp01(f));
                float fMax = Math.max(1.0f - Sheet.this.openProgress, Sheet.this.dismissProgress) * Sheet.this.getEmptyPadding();
                canvas2.save();
                canvas2.translate(Sheet.this.backProgress * getWidth(), fMax);
                float f2 = iLerp;
                this.rect.set(0.0f, f2, getWidth(), AndroidUtilities.dp(16.0f) + getHeight());
                float f3 = 1.0f - f;
                float fDp = AndroidUtilities.dp(24.0f) * f3;
                if (f < 1.0f) {
                    this.shadowPaint.setColor(0);
                    c = 1;
                    c2 = 0;
                    this.shadowPaint.setShadowLayer(AndroidUtilities.dp(18.0f), 0.0f, -AndroidUtilities.dp(3.0f), Theme.multAlpha(fMin * 0.26f, -16777216));
                    canvas2.drawRoundRect(this.rect, fDp, fDp, this.shadowPaint);
                } else {
                    c = 1;
                    c2 = 0;
                }
                if (fDp <= 0.0f) {
                    canvas2.clipRect(this.rect);
                } else {
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(this.rect, fDp, fDp, Path.Direction.CW);
                    canvas2.clipPath(this.clipPath);
                }
                this.backgroundPaint.setColor(ArticleViewer.this.pages[c].getBackgroundColor());
                canvas2.drawRect(this.rect, this.backgroundPaint);
                this.backgroundPaint.setColor(ArticleViewer.this.pages[c2].getBackgroundColor());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.rect);
                rectF.left = ArticleViewer.this.pages[c2].getX();
                canvas2.drawRect(rectF, this.backgroundPaint);
                WebActionBar webActionBar = ArticleViewer.this.actionBar;
                if (z2) {
                    if (Sheet.this.getListPaddingTop() + listTop <= ArticleViewer.this.currentHeaderHeight + AndroidUtilities.statusBarHeight) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                webActionBar.drawShadow = z;
                if (f > 0.0f) {
                    canvas2.save();
                    float fLerp = AndroidUtilities.lerp(Sheet.this.getListPaddingTop() + listTop + 1, 0, f);
                    canvas2.translate(0.0f, fLerp);
                    ArticleViewer.this.actionBar.drawBackground(canvas, ((Sheet.this.getListPaddingTop() + listTop) + 1) - fLerp, 1.0f, f, true);
                    canvas2 = canvas;
                    canvas2.restore();
                }
                canvas2.translate(0.0f, -fMax);
                if (!AndroidUtilities.makingGlobalBlurBitmap && (!ArticleViewer.this.pages[0].isWeb() || canvas2.isHardwareAccelerated())) {
                    super.dispatchDraw(canvas);
                }
                canvas2.translate(0.0f, fMax);
                if (f < 1.0f) {
                    this.handlePaint.setColor(ColorUtils.blendARGB(f, Theme.multAlpha(0.15f, (AndroidUtilities.computePerceivedBrightness(Sheet.this.getBackgroundColor()) > 0.721f ? 1 : (AndroidUtilities.computePerceivedBrightness(Sheet.this.getBackgroundColor()) == 0.721f ? 0 : -1)) < 0 ? -1 : -16777216), -16777216));
                    Paint paint = this.handlePaint;
                    paint.setAlpha((int) (paint.getAlpha() * f3));
                    float width = getWidth() / 2.0f;
                    float listPaddingTop = ((Sheet.this.getListPaddingTop() / 2.0f) + f2) - (AndroidUtilities.dp(8.0f) * f);
                    float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(48.0f), f) / 2.0f;
                    this.rect.set(width - fLerp2, listPaddingTop - AndroidUtilities.dp(2.0f), width + fLerp2, listPaddingTop + AndroidUtilities.dp(2.0f));
                    RectF rectF2 = this.rect;
                    canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.rect.height() / 2.0f, this.handlePaint);
                }
                canvas2.restore();
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    float y = motionEvent.getY();
                    Sheet sheet = Sheet.this;
                    if (y < (sheet.attachedToActionBar ? 0 : sheet.getListTop())) {
                        Sheet.this.dismiss(true);
                        return true;
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public float drawInto(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2, boolean z) {
                rectF2.set(getRect());
                AndroidUtilities.lerp(rectF2, rectF, f, rectF2);
                float fMin = Math.min(Sheet.this.openProgress, 1.0f - Sheet.this.dismissProgress);
                float f3 = 1.0f - f;
                this.scrimPaint.setColor(-16777216);
                this.scrimPaint.setAlpha((int) ((1.0f - Sheet.this.backProgress) * fMin * f3 * 96.0f));
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
                    float f6 = (-Sheet.this.getListTop()) + rectF2.top;
                    Sheet sheet = Sheet.this;
                    canvas.translate(0.0f, ((sheet.attachedToActionBar ? ArticleViewer.this.actionBar.getMeasuredHeight() : 0) * f3) + f6);
                    childAt.draw(canvas);
                    canvas.restore();
                }
                return fLerp;
            }

            @Override
            public RectF getRect() {
                RectF rectF = this.clipRect;
                Sheet sheet = Sheet.this;
                rectF.set(0.0f, (Math.max(1.0f - Sheet.this.openProgress, Sheet.this.dismissProgress) * Sheet.this.getEmptyPadding()) + (sheet.attachedToActionBar ? 0 : sheet.getListTop() - Sheet.this.getListPaddingTop()), getWidth(), getHeight());
                return this.clipRect;
            }

            public boolean isVisible() {
                return AndroidUtilities.lerp(Sheet.this.getListTop() - Sheet.this.getListPaddingTop(), 0, Utilities.clamp01(this.attachedActionBar.get())) < getHeight();
            }

            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                Sheet.this.updateTranslation();
            }

            @Override
            public boolean onNestedFling(View view, float f, float f2, boolean z) {
                return super.onNestedFling(view, f, f2, z);
            }

            @Override
            public boolean onNestedPreFling(View view, float f, float f2) {
                boolean zOnNestedPreFling = super.onNestedPreFling(view, f, f2);
                if (Sheet.this.halfSize() && !ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                    if (!ArticleViewer.this.pages[0].isAtTop() || f2 >= -1000.0f) {
                        Sheet.this.animateDismiss(false, true, null);
                    } else {
                        Sheet.this.dismiss(true);
                    }
                }
                if (f != 0.0f || f2 != 0.0f) {
                    ArticleViewer.this.textSelectionHelper.cancelTextSelectionRunnable();
                }
                this.stoppedAtFling = true;
                return zOnNestedPreFling;
            }

            @Override
            public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
                Sheet sheet = Sheet.this;
                if (!sheet.nestedVerticalScroll) {
                    sheet.nestedVerticalScroll = i2 != 0;
                }
                if (ArticleViewer.this.pages[0].isAtTop() && Sheet.this.halfSize() && !ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
                    iArr[1] = Math.min((int) (Sheet.this.dismissProgress * Sheet.this.getEmptyPadding()), i2);
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
            public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
                super.onNestedScroll(view, i, i2, i3, i4);
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

            @Override
            public void setDrawingFromOverlay(boolean z) {
                if (this.drawingFromOverlay != z) {
                    this.drawingFromOverlay = z;
                    invalidate();
                }
            }
        }

        public Sheet(BaseFragment baseFragment) {
            this.fragment = baseFragment;
            this.resourcesProvider = baseFragment.getResourceProvider();
            Context context = baseFragment.getContext();
            this.context = context;
            WindowView windowView = new WindowView(context);
            this.windowView = windowView;
            new KeyboardNotifier(windowView, true, new PollItemMenu$$ExternalSyntheticLambda15(this, 5));
        }

        private void dumpTree(StringBuilder sb, View view, int i, int i2) {
            for (int i3 = 0; i3 < i; i3++) {
                sb.append("  ");
            }
            sb.append(view.getClass().getName());
            sb.append(" important=");
            sb.append(view.getImportantForAccessibility());
            sb.append(" vis=");
            sb.append(view.getVisibility());
            sb.append(" size=");
            sb.append(view.getWidth());
            sb.append("x");
            sb.append(view.getHeight());
            sb.append(" focusable=");
            sb.append(view.isFocusable());
            sb.append(" clickable=");
            sb.append(view.isClickable());
            sb.append(" enabled=");
            sb.append(view.isEnabled());
            sb.append(" cd=");
            sb.append(view.getContentDescription());
            sb.append('\n');
            if (i < i2 && (view instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    dumpTree(sb, viewGroup.getChildAt(i4), i + 1, i2);
                }
            }
        }

        public int getListPaddingTop() {
            return AndroidUtilities.dp(20.0f);
        }

        public int getListTop() {
            int alpha = 0;
            PageLayout pageLayout = ArticleViewer.this.pages[0];
            float translationX = (pageLayout == null || pageLayout.getVisibility() != 0) ? 0.0f : 1.0f - (ArticleViewer.this.pages[0].getTranslationX() / ArticleViewer.this.pages[0].getWidth());
            float f = 1.0f - translationX;
            PageLayout pageLayout2 = ArticleViewer.this.pages[0];
            if (pageLayout2 != null && pageLayout2.getVisibility() == 0) {
                alpha = (int) (ArticleViewer.this.pages[0].getAlpha() * ArticleViewer.this.pages[0].getListTop() * translationX);
            }
            PageLayout pageLayout3 = ArticleViewer.this.pages[1];
            if (pageLayout3 == null || pageLayout3.getVisibility() != 0) {
                return alpha;
            }
            return alpha + ((int) (ArticleViewer.this.pages[1].getAlpha() * ArticleViewer.this.pages[1].getListTop() * f));
        }

        private boolean imageAtTop() {
            return false;
        }

        public void lambda$animateBackProgressTo$4(ValueAnimator valueAnimator) {
            setBackProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        public void lambda$animateDismiss$3(ValueAnimator valueAnimator) {
            this.dismissProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (!this.dismissingIntoTabs) {
                updateTranslation();
            }
            checkNavColor();
            checkFullyVisible();
        }

        public void lambda$animateOpen$2(ValueAnimator valueAnimator) {
            this.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            updateTranslation();
            checkNavColor();
            checkFullyVisible();
        }

        public void lambda$dismiss$1() {
            release();
            ArticleViewer.this.destroy();
        }

        public void lambda$new$0(Integer num) {
            ArticleViewer.this.keyboardVisible = num.intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
        }

        public ValueAnimator animateBackProgressTo(float f) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.backProgress, f);
            valueAnimatorOfFloat.addUpdateListener(new ArticleViewer$Sheet$$ExternalSyntheticLambda0(this, 1));
            return valueAnimatorOfFloat;
        }

        public void animateDismiss(final boolean z, boolean z2, final Runnable runnable) {
            int i = 2;
            ValueAnimator valueAnimator = this.dismissAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z2) {
                this.dismissProgress = z ? 1.0f : 0.0f;
                if (!this.dismissingIntoTabs) {
                    updateTranslation();
                }
                if (runnable != null) {
                    runnable.run();
                }
                checkFullyVisible();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.dismissProgress, z ? 1.0f : 0.0f);
            this.dismissAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ArticleViewer$Sheet$$ExternalSyntheticLambda0(this, i));
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
        }

        public void animateOpen(final boolean z, boolean z2, final Runnable runnable) {
            int i = 0;
            ValueAnimator valueAnimator = this.openAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z2) {
                this.openProgress = z ? 1.0f : 0.0f;
                updateTranslation();
                if (runnable != null) {
                    runnable.run();
                }
                checkFullyVisible();
                if (z) {
                    this.animationsLock.unlock();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
            this.openAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ArticleViewer$Sheet$$ExternalSyntheticLambda0(this, i));
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
        }

        public void attachInternal(BaseFragment baseFragment) {
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
            if (bottomSheetTabDialog == null) {
                AndroidUtilities.removeFromParent(this.windowView);
                if (baseFragment.getLayoutContainer() != null) {
                    baseFragment.getLayoutContainer().addView(this.windowView);
                }
            } else if (!bottomSheetTabDialog.attached) {
                bottomSheetTabDialog.attached = true;
                try {
                    bottomSheetTabDialog.show();
                } catch (Exception e) {
                    FileLog.e(e);
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

        @Override
        public boolean attachedToParent() {
            return this.windowView.isAttachedToWindow();
        }

        public void checkFullyVisible() {
            if (this.wasFullyVisible != isFullyVisible()) {
                this.wasFullyVisible = isFullyVisible();
                BaseFragment baseFragment = this.fragment;
                if (baseFragment == null || !(baseFragment.getParentLayout() instanceof ActionBarLayout)) {
                    if (this.windowView.getParent() instanceof View) {
                        ((View) this.windowView.getParent()).invalidate();
                        return;
                    }
                    return;
                }
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.fragment.getParentLayout();
                ActionBarLayout.LayoutContainer layoutContainer = actionBarLayout.containerView;
                if (layoutContainer != null) {
                    layoutContainer.invalidate();
                }
                ActionBarLayout.LayoutContainer layoutContainer2 = actionBarLayout.sheetContainer;
                if (layoutContainer2 != null) {
                    layoutContainer2.invalidate();
                }
            }
        }

        public void checkNavColor() {
            BottomSheetTabDialog bottomSheetTabDialog = this.dialog;
            AndroidUtilities.setLightStatusBar(bottomSheetTabDialog != null ? bottomSheetTabDialog.windowView : this.windowView, isAttachedLightStatusBar());
            BottomSheetTabDialog bottomSheetTabDialog2 = this.dialog;
            if (bottomSheetTabDialog2 == null) {
                LaunchActivity.instance.checkSystemBarColors(true, true, true);
                AndroidUtilities.setLightNavigationBar(mo1107getWindowView(), AndroidUtilities.computePerceivedBrightness(getNavigationBarColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundGray))) >= 0.721f);
                return;
            }
            int navigationBarColor = bottomSheetTabDialog2.sheet.getNavigationBarColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
            bottomSheetTabDialog2.navigationBarPaint.setColor(navigationBarColor);
            bottomSheetTabDialog2.navigationBar.invalidate();
            AndroidUtilities.setNavigationBarColor(bottomSheetTabDialog2, navigationBarColor);
            AndroidUtilities.setLightNavigationBar(bottomSheetTabDialog2, AndroidUtilities.computePerceivedBrightness(navigationBarColor) >= 0.721f);
            LaunchActivity.instance.checkSystemBarColors(true, true, true);
        }

        @Override
        public void lambda$showGiftOfferSheet$15() {
            dismiss(true);
        }

        public void dismissInstant() {
            if (this.dismissing) {
                return;
            }
            this.dismissing = true;
            release();
            ArticleViewer.this.destroy();
        }

        public int getActionBarColor() {
            if (SharedConfig.adaptableColorInBrowser) {
                return ColorUtils.blendARGB(1.0f - (ArticleViewer.this.pages[0].getVisibility() != 0 ? 0.0f : 1.0f - (ArticleViewer.this.pages[0].getTranslationX() / ArticleViewer.this.pages[0].getWidth())), ArticleViewer.this.pages[0].getActionBarColor(), ArticleViewer.this.pages[1].getActionBarColor());
            }
            return Theme.getColor(null, Theme.key_iv_background, false);
        }

        public ArticleViewer getArticleViewer() {
            return ArticleViewer.this;
        }

        public float getBackProgress() {
            return this.backProgress;
        }

        public int getBackgroundColor() {
            if (SharedConfig.adaptableColorInBrowser) {
                return ColorUtils.blendARGB(1.0f - (ArticleViewer.this.pages[0].getVisibility() != 0 ? 0.0f : 1.0f - (ArticleViewer.this.pages[0].getTranslationX() / ArticleViewer.this.pages[0].getWidth())), ArticleViewer.this.pages[0].getBackgroundColor(), ArticleViewer.this.pages[1].getBackgroundColor());
            }
            return Theme.getColor(null, Theme.key_iv_navigationBackground, false);
        }

        @Override
        public BulletinFactory getBulletinFactory() {
            FrameLayout frameLayout;
            if (ArticleViewer.this.pages[0].isWeb()) {
                if (ArticleViewer.this.pages[0].getWebView() == null) {
                    return null;
                }
                frameLayout = ArticleViewer.this.pages[0].webViewContainer;
            } else {
                if (ArticleViewer.this.pages[0].adapter.currentPage == null) {
                    return null;
                }
                frameLayout = ArticleViewer.this.pages[0];
            }
            return BulletinFactory.of(frameLayout, ArticleViewer.this.getResourcesProvider());
        }

        public int getEmptyPadding() {
            int iDp = AndroidUtilities.dp(16.0f);
            View view = this.containerView;
            return (iDp + (view == null ? AndroidUtilities.displaySize.y : view.getHeight())) - (getListTop() - getListPaddingTop());
        }

        @Override
        public int getNavigationBarColor(int i) {
            float fMin = this.dismissingIntoTabs ? 0.0f : Math.min(this.openProgress, 1.0f - this.dismissProgress) * (1.0f - this.backProgress);
            int backgroundColor = getBackgroundColor();
            if (ArticleViewer.this.actionBar != null) {
                backgroundColor = ColorUtils.blendARGB(ArticleViewer.this.actionBar.addressingProgress, backgroundColor, ArticleViewer.this.actionBar.addressBackgroundColor);
            }
            return ColorUtils.blendARGB(fMin, i, backgroundColor);
        }

        @Override
        public boolean hadDialog() {
            return this.hadDialog;
        }

        public final boolean halfSize() {
            return true;
        }

        @Override
        public boolean isAttachedLightStatusBar() {
            return this.attachedToActionBar && (this.dismissingIntoTabs ? 0.0f : Math.min(this.openProgress, 1.0f - this.dismissProgress) * (1.0f - this.backProgress)) > 0.25f && AndroidUtilities.computePerceivedBrightness(getActionBarColor()) >= 0.721f;
        }

        public boolean isFullSize() {
            return true;
        }

        @Override
        public boolean isFullyVisible() {
            return this.fullyAttachedToActionBar && this.dismissProgress <= 0.0f && this.openProgress >= 1.0f && this.backProgress <= 0.0f && !this.dismissingIntoTabs && !this.dismissing;
        }

        @Override
        public boolean isShown() {
            WindowView windowView;
            return !this.dismissing && !this.released && this.openProgress > 0.5f && (windowView = this.windowView) != null && windowView.isAttachedToWindow() && this.windowView.isVisible() && this.backProgress < 1.0f;
        }

        @Override
        public boolean onAttachedBackPressed() {
            if (ArticleViewer.this.keyboardVisible) {
                AndroidUtilities.hideKeyboard(this.windowView);
                return true;
            }
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

        public boolean restoreState(BaseFragment baseFragment, BottomSheetTabs.WebTabData webTabData) {
            return false;
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
            webTabData.themeIsDark = Theme.currentTheme.isDark();
            return webTabData;
        }

        public void setBackProgress(float f) {
            this.backProgress = f;
            this.windowView.invalidate();
            checkNavColor();
            checkFullyVisible();
        }

        public void setContainerView(View view) {
            this.containerView = view;
            updateTranslation();
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
        public void setKeyboardHeightFromParent(int i) {
        }

        @Override
        public void setLastVisible(boolean z) {
            this.lastVisible = z;
            ArticleViewer.this.pages[0].setLastVisible(z);
            ArticleViewer.this.pages[1].setLastVisible(false);
        }

        @Override
        public void setOnDismissListener(Runnable runnable) {
            this.onDismissListener = runnable;
        }

        public void show() {
            if (this.dismissing) {
                return;
            }
            attachInternal(this.fragment);
            animateOpen(true, true, null);
        }

        @Override
        public boolean showDialog(Dialog dialog) {
            return false;
        }

        public void updateLastVisible() {
            ArticleViewer.this.pages[0].setLastVisible(this.lastVisible);
            ArticleViewer.this.pages[1].setLastVisible(false);
        }

        public void updateTranslation() {
            View view = this.containerView;
            if (view == null) {
                return;
            }
            view.setTranslationY(Math.max(1.0f - this.openProgress, this.dismissingIntoTabs ? 0.0f : this.dismissProgress) * getEmptyPadding());
            this.windowView.invalidate();
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
                animateDismiss(true, true, new VoIPFragment$8$$ExternalSyntheticLambda1(this, 25));
            }
            checkNavColor();
            checkFullyVisible();
        }

        @Override
        public WindowView mo1107getWindowView() {
            return this.windowView;
        }
    }

    public static class TL_pageBlockDetailsBottom extends TL_iv.PageBlock {
        private TL_iv.pageBlockDetails parent;

        private TL_pageBlockDetailsBottom() {
        }
    }

    public static class TL_pageBlockDetailsChild extends TL_iv.PageBlock {
        private TL_iv.PageBlock block;
        private TL_iv.PageBlock parent;

        private TL_pageBlockDetailsChild() {
        }
    }

    public static class TL_pageBlockEmbedPostCaption extends TL_iv.pageBlockEmbedPost {
        private TL_iv.pageBlockEmbedPost parent;

        private TL_pageBlockEmbedPostCaption() {
        }
    }

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
        public ArrayList<TL_pageBlockListItem> items = new ArrayList<>();
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
        public ArrayList<TL_pageBlockOrderedListItem> items = new ArrayList<>();
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

    public static class TL_pageBlockRelatedArticlesShadow extends TL_iv.PageBlock {
        private TL_iv.pageBlockRelatedArticles parent;

        private TL_pageBlockRelatedArticlesShadow() {
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
                public CharSequence getContentDescription() {
                    return String.valueOf(Math.round((TextSizeCell.this.sizeBar.getProgress() * (TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize)) + TextSizeCell.this.startFontSize));
                }

                @Override
                public int getStepsCount() {
                    return TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize;
                }

                @Override
                public final boolean needVisuallyDivideSteps() {
                    return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
                }

                @Override
                public void onSeekBarDrag(boolean z, float f) {
                    int iRound = Math.round(((TextSizeCell.this.endFontSize - TextSizeCell.this.startFontSize) * f) + TextSizeCell.this.startFontSize);
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
                public void onSeekBarPressed(boolean z) {
                }
            });
            addView(this.sizeBar, LayoutHelper.createFrame(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        }

        @Override
        public void invalidate() {
            super.invalidate();
            this.sizeBar.invalidate();
        }

        @Override
        public void onDraw(Canvas canvas) {
            this.textPaint.setColor(ArticleViewer.this.getThemedColor(Theme.key_windowBackgroundWhiteValueText));
            canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), this.textPaint);
        }

        @Override
        public void onMeasure(int i, int i2) {
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
    }

    public class WindowView extends FrameLayout {
        private float alpha;
        private Runnable attachRunnable;
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

        private void prepareForMoving(MotionEvent motionEvent) {
            this.maybeStartTracking = false;
            this.startedTracking = true;
            this.startedTrackingX = (int) motionEvent.getX();
            if (ArticleViewer.this.pagesStack.size() <= 1 || (ArticleViewer.this.actionBar != null && (ArticleViewer.this.actionBar.isSearching() || ArticleViewer.this.actionBar.isAddressing()))) {
                this.movingPage = false;
            } else {
                this.movingPage = true;
                this.startMovingHeaderHeight = ArticleViewer.this.currentHeaderHeight;
                ArticleViewer.this.pages[1].setVisibility(0);
                ArticleViewer.this.pages[1].setAlpha(1.0f);
                ArticleViewer.this.pages[1].setTranslationX(0.0f);
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.pages[0].setBackgroundColor(articleViewer.sheet == null ? 0 : articleViewer.backgroundPaint.getColor());
                ArticleViewer articleViewer2 = ArticleViewer.this;
                ArrayList<Object> arrayList = articleViewer2.pagesStack;
                articleViewer2.updateInterfaceForCurrentPage(arrayList.get(arrayList.size() - 2), true, -1);
                if (ArticleViewer.this.containerView.indexOfChild(ArticleViewer.this.pages[0]) < ArticleViewer.this.containerView.indexOfChild(ArticleViewer.this.pages[1])) {
                    int iIndexOfChild = ArticleViewer.this.containerView.indexOfChild(ArticleViewer.this.pages[0]);
                    ArticleViewer.this.containerView.removeView(ArticleViewer.this.pages[1]);
                    ArticleViewer.this.containerView.addView(ArticleViewer.this.pages[1], iIndexOfChild);
                }
            }
            ArticleViewer.this.cancelCheckLongPress();
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
        public void dispatchDraw(Canvas canvas) {
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
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                return super.dispatchKeyEventPreIme(keyEvent);
            }
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
                if (pageLayout == null || !pageLayout.isWeb() || ArticleViewer.this.pages[0].getWebView() == null || !ArticleViewer.this.pages[0].getWebView().canGoBack()) {
                    ArticleViewer.this.close(true, false);
                } else {
                    ArticleViewer.this.pages[0].getWebView().goBack();
                }
            }
            return true;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            PageLayout pageLayout;
            ArrayList<Object> arrayList;
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
                if (pageLayoutArr == null || (pageLayout = pageLayoutArr[0]) == null || !pageLayout.isWeb() || (arrayList = ArticleViewer.this.pagesStack) == null || arrayList.size() > 1) {
                    motionEvent.setAction(3);
                } else {
                    motionEvent.setAction(1);
                }
            }
            if (motionEvent.getAction() != 0 || !ArticleViewer.this.textSelectionHelper.isInSelectionMode() || (motionEvent.getY() >= ArticleViewer.this.containerView.getTop() && motionEvent.getY() <= ArticleViewer.this.containerView.getBottom())) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (ArticleViewer.this.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(motionEventObtain)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return true;
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
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

        @Override
        public float getAlpha() {
            return this.alpha;
        }

        public float getInnerTranslationX() {
            return this.innerTranslationX;
        }

        public boolean handleTouchEvent(MotionEvent motionEvent) {
            Sheet sheet;
            PageLayout pageLayout;
            if (ArticleViewer.this.pageSwitchAnimation == null && !ArticleViewer.this.closeAnimationInProgress && ArticleViewer.this.fullscreenVideoContainer.getVisibility() != 0 && !ArticleViewer.this.textSelectionHelper.isInSelectionMode()) {
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
                        if (!this.movingPage || (pageLayout = articleViewer.pages[0]) == null) {
                            Sheet sheet3 = articleViewer.sheet;
                            if (sheet3 != null) {
                                sheet3.setBackProgress(iMax / getWidth());
                            } else {
                                float f = iMax;
                                articleViewer.containerView.setTranslationX(f);
                                setInnerTranslationX(f);
                            }
                        } else {
                            pageLayout.setTranslationX(iMax);
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
                        Property property = View.TRANSLATION_X;
                        if (!z) {
                            x = frameLayout.getMeasuredWidth() - x;
                            if (this.movingPage) {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.pages[0], (Property<PageLayout, Float>) property, frameLayout.getMeasuredWidth()));
                            } else {
                                ArticleViewer articleViewer2 = ArticleViewer.this;
                                Sheet sheet5 = articleViewer2.sheet;
                                if (sheet5 != null) {
                                    animatorSet.playTogether(sheet5.animateBackProgressTo(1.0f));
                                } else {
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer2.containerView, (Property<FrameLayout, Float>) property, frameLayout.getMeasuredWidth()), ObjectAnimator.ofFloat(this, ArticleViewer.ARTICLE_VIEWER_INNER_TRANSLATION_X, frameLayout.getMeasuredWidth()));
                                }
                            }
                        } else if (this.movingPage) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(ArticleViewer.this.pages[0], (Property<PageLayout, Float>) property, 0.0f));
                        } else {
                            ArticleViewer articleViewer3 = ArticleViewer.this;
                            Sheet sheet6 = articleViewer3.sheet;
                            if (sheet6 != null) {
                                animatorSet.playTogether(sheet6.animateBackProgressTo(0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(articleViewer3.containerView, (Property<FrameLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(this, ArticleViewer.ARTICLE_VIEWER_INNER_TRANSLATION_X, 0.0f));
                            }
                        }
                        animatorSet.setDuration(Math.max((int) ((420.0f / frameLayout.getMeasuredWidth()) * x), 250));
                        animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                        animatorSet.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (WindowView.this.movingPage) {
                                    Object objM = null;
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
                                        objM = DiffUtil.m(ArticleViewer.this.pagesStack);
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
                                    if (objM instanceof CachedWeb) {
                                        ((CachedWeb) objM).destroy();
                                    }
                                    if (objM instanceof TLRPC.WebPage) {
                                        WebInstantView.recycle((TLRPC.WebPage) objM);
                                    }
                                } else if (!z) {
                                    ArticleViewer articleViewer7 = ArticleViewer.this;
                                    Sheet sheet8 = articleViewer7.sheet;
                                    if (sheet8 != null) {
                                        sheet8.release();
                                        ArticleViewer.this.destroy();
                                    } else {
                                        articleViewer7.saveCurrentPagePosition();
                                        ArticleViewer.this.onClosed();
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
                if (this.startedTracking && this.lastWebviewAllowedScroll) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            ArticleViewer.this.attachedToWindow = true;
        }

        @Override
        public void onDetachedFromWindow() {
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
        public void onDraw(Canvas canvas) {
            float f;
            if (ArticleViewer.this.sheet == null) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                float f2 = measuredWidth;
                float f3 = measuredHeight;
                canvas.drawRect(this.innerTranslationX, 0.0f, f2, f3, ArticleViewer.this.backgroundPaint);
                if (ArticleViewer.this.lastInsets != null) {
                    WindowInsets windowInsets = (WindowInsets) ArticleViewer.this.lastInsets;
                    canvas.drawRect(this.innerTranslationX, 0.0f, f2, windowInsets.getSystemWindowInsetTop(), ArticleViewer.this.statusBarPaint);
                    if (ArticleViewer.this.hasCutout) {
                        int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                        if (systemWindowInsetLeft != 0) {
                            canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, f3, ArticleViewer.this.statusBarPaint);
                        }
                        f = f3;
                        int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
                        if (systemWindowInsetRight != 0) {
                            canvas.drawRect(measuredWidth - systemWindowInsetRight, 0.0f, f2, f, ArticleViewer.this.statusBarPaint);
                        }
                    } else {
                        f = f3;
                    }
                    canvas.drawRect(0.0f, measuredHeight - windowInsets.getStableInsetBottom(), f2, f, ArticleViewer.this.navigationBarPaint);
                }
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.collapsed) {
                return false;
            }
            return handleTouchEvent(motionEvent) || super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        public void onMeasure(int i, int i2) {
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
                size -= windowInsets.getSystemWindowInsetLeft() + windowInsets.getSystemWindowInsetRight();
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
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ArticleViewer.this.collapsed) {
                return false;
            }
            return handleTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            handleTouchEvent(null);
            super.requestDisallowInterceptTouchEvent(z);
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

        public void setInnerTranslationX(float f) {
            this.innerTranslationX = f;
            if (ArticleViewer.this.activityVisibilityController != null) {
                ArticleViewer.this.activityVisibilityController.setHidden(ArticleViewer.this.isVisible && this.alpha == 1.0f && this.innerTranslationX == 0.0f);
            }
            invalidate();
        }
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
        this.notificationsLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.BOTTOM_SHEET_VIEW_TAG = "bottomSheet";
        this.fontCells = new FontCell[2];
        this.lastSearchIndex = -1;
        ArticleViewer$$ExternalSyntheticLambda9 articleViewer$$ExternalSyntheticLambda9 = new ArticleViewer$$ExternalSyntheticLambda9(this, 1);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.page0Background = new AnimatedColor(articleViewer$$ExternalSyntheticLambda9, 320L, cubicBezierInterpolator);
        this.page1Background = new AnimatedColor(new ArticleViewer$$ExternalSyntheticLambda9(this, 2), 320L, cubicBezierInterpolator);
        this.isSheet = false;
        this.sheet = null;
    }

    public static int access$1504(ArticleViewer articleViewer) {
        int i = articleViewer.pressCount + 1;
        articleViewer.pressCount = i;
        return i;
    }

    public static int access$9208(ArticleViewer articleViewer) {
        int i = articleViewer.lastBlockNum;
        articleViewer.lastBlockNum = i + 1;
        return i;
    }

    public static void addBookmark(String str, int i, FrameLayout frameLayout, Sheet sheet, Theme.ResourcesProvider resourcesProvider) {
        String strMagic2tonsite = BotWebViewContainer.magic2tonsite(str);
        long clientUserId = UserConfig.getInstance(i).getClientUserId();
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
        BulletinFactory.of(frameLayout, resourcesProvider).createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.WebBookmarkedToast), new LinkManager$3$$ExternalSyntheticLambda0(sheet, clientUserId, 1))).show(true);
    }

    private boolean addPageToStack(TLRPC.WebPage webPage, String str, int i) {
        saveCurrentPagePosition();
        this.pagesStack.add(webPage);
        this.actionBar.showSearch(false, true);
        updateInterfaceForCurrentPage(webPage, false, i);
        return scrollToAnchor(str, false);
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

    public static CharSequence buildAccessibilityText(final IArticleViewer iArticleViewer, final WebpageAdapter webpageAdapter, DrawingText drawingText) {
        CharSequence charSequence;
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
        if (textPaintUrlSpanArr != null && textPaintUrlSpanArr.length != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
            for (final TextPaintUrlSpan textPaintUrlSpan : textPaintUrlSpanArr) {
                int spanStart = spannableStringBuilder.getSpanStart(textPaintUrlSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(textPaintUrlSpan);
                if (spanStart < 0) {
                    charSequence = text;
                    charSequence = text;
                } else if (spanEnd > spanStart) {
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        @Override
                        public void onClick(View view) {
                            iArticleViewer.handleLinkClick(webpageAdapter, textPaintUrlSpan);
                        }
                    }, spanStart, spanEnd, 33);
                }
            }
            charSequence = text;
            charSequence = text;
            drawingText.accessibilityText = spannableStringBuilder;
            charSequence = spannableStringBuilder;
        }
        charSequence = text;
        charSequence = text;
        charSequence = text;
        return charSequence;
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

    public boolean checkLayoutForLinks(WebpageAdapter webpageAdapter, MotionEvent motionEvent, View view, DrawingText drawingText, int i, int i2) {
        return checkLayoutForLinks(this, webpageAdapter, motionEvent, view, drawingText, i, i2);
    }

    public void checkScroll(int i) {
        Sheet sheet = this.sheet;
        if (sheet == null || sheet.attachedToActionBar) {
            setCurrentHeaderHeight(this.currentHeaderHeight - i);
        }
    }

    public void checkScrollAnimated() {
        checkScrollAnimated(null);
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
                float measuredHeight2 = (childAt.getMeasuredHeight() / 2.0f) + childAt.getTop();
                if (blockVideoCell2 == null || Math.abs(measuredHeight - measuredHeight2) < Math.abs(measuredHeight - f)) {
                    blockVideoCell2 = (BlockVideoCell) childAt;
                    f = measuredHeight2;
                }
            }
        }
        boolean zIsVisibleOrAnimating = PhotoViewer.getInstance().isVisibleOrAnimating();
        if (zIsVisibleOrAnimating || ((blockVideoCell = this.currentPlayer) != null && blockVideoCell != blockVideoCell2 && this.videoPlayer != null)) {
            if (this.videoPlayer != null) {
                LongSparseArray longSparseArray = this.videoStates;
                long j = this.currentPlayer.currentBlock.video_id;
                BlockVideoCell blockVideoCell3 = this.currentPlayer;
                longSparseArray.put(blockVideoCell3.setState(BlockVideoCellState.fromPlayer(this.videoPlayer, blockVideoCell3)), j);
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

    public DrawingText createLayoutForText(View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, WebpageAdapter webpageAdapter) {
        return createLayoutForText(view, charSequence, richText, i, 0, pageBlock, alignment, 0, webpageAdapter);
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
        webpageSearchPaint.setColor(Fragment$$ExternalSyntheticOutline0.m((float) Color.blue(themedColor), 0.0722f, (((float) Color.green(themedColor)) * 0.7152f) + (((float) Color.red(themedColor)) * 0.2126f), 255.0f) <= 0.705f ? -3041234 : -6551);
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
                int iDp2 = AndroidUtilities.dp(iPadx);
                canvas.drawRect(iDp2, 0.0f, AndroidUtilities.dp(2.0f) + iDp2, iDp, quoteLinePaint);
                return;
            }
            return;
        }
        while (i3 != 0) {
            if ((i3 & 1) != 0) {
                int iDp3 = AndroidUtilities.dp((i2 * 14) + iPadx);
                canvas.drawRect(iDp3, 0.0f, AndroidUtilities.dp(2.0f) + iDp3, iDp, quoteLinePaint);
            }
            i3 >>>= 1;
            i2++;
        }
    }

    private void drawTextSelection(Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView) {
        drawTextSelection(this, canvas, articleSelectableView, 0);
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

    public static ArticleViewer getInstance() {
        ArticleViewer articleViewer;
        ArticleViewer articleViewer2 = Instance;
        if (articleViewer2 != null) {
            return articleViewer2;
        }
        synchronized (ArticleViewer.class) {
            try {
                articleViewer = Instance;
                if (articleViewer == null) {
                    articleViewer = new ArticleViewer();
                    Instance = articleViewer;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return articleViewer;
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
            return richText;
        }
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
        return richText instanceof TL_iv.textSpoiler ? getLastRichText(((TL_iv.textSpoiler) richText).text) : richText;
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

    private CharSequence getText(WebpageAdapter webpageAdapter, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        return getText(webpageAdapter.currentPage, view, richText, richText2, pageBlock, i);
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
            return ((TL_iv.textUrl) richText).webpage_id != 0 ? getTextFlags(richText.parentRichText) | 512 : getTextFlags(richText.parentRichText) | 8;
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

    private TextPaint getTextPaint(TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
        return getTextPaint(this, richText, richText2, pageBlock);
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
                        Object objM = DiffUtil.m(ArticleViewer.this.pagesStack);
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
                        if (objM instanceof CachedWeb) {
                            ((CachedWeb) objM).destroy();
                        }
                        if (objM instanceof TLRPC.WebPage) {
                            WebInstantView.recycle((TLRPC.WebPage) objM);
                        }
                    } else {
                        ArticleViewer articleViewer4 = ArticleViewer.this;
                        Sheet sheet4 = articleViewer4.sheet;
                        if (sheet4 != null) {
                            sheet4.release();
                            ArticleViewer.this.destroy();
                        } else {
                            articleViewer4.saveCurrentPagePosition();
                            ArticleViewer.this.onClosed();
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
        updateInterfaceForCurrentPage(zzin.m(2, this.pagesStack), true, -1);
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
                if (ArticleViewer.this.windowView.openingPage) {
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
                    Object objM = DiffUtil.m(ArticleViewer.this.pagesStack);
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
                    if (objM instanceof CachedWeb) {
                        ((CachedWeb) objM).destroy();
                    }
                    if (objM instanceof TLRPC.WebPage) {
                        WebInstantView.recycle((TLRPC.WebPage) objM);
                    }
                } else {
                    ArticleViewer.this.saveCurrentPagePosition();
                    ArticleViewer.this.onClosed();
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

    public static boolean hasInstance() {
        return Instance != null;
    }

    public static boolean isHeadingBlock(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean isListItemBlock(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_pageBlockListItem) || (pageBlock instanceof TL_pageBlockOrderedListItem);
    }

    public static void joinChannel(int i, BlockChannelCell blockChannelCell, TLRPC.Chat chat) {
        TLRPC.TL_channels_joinChannel tL_channels_joinChannel = new TLRPC.TL_channels_joinChannel();
        tL_channels_joinChannel.channel = MessagesController.getInputChannel(chat);
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_channels_joinChannel, new ArticleViewer$$ExternalSyntheticLambda17(blockChannelCell, i, tL_channels_joinChannel, chat));
    }

    public static void lambda$addBookmark$47(Sheet sheet, long j) {
        if (sheet != null) {
            sheet.dismiss(true);
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(new ChatActivity(FBool.m(j, "user_id")));
        }
    }

    public static void lambda$checkLayoutForLinks$6(DrawingText drawingText, View view) {
        drawingText.spoilers.clear();
        drawingText.spoilersPatchedLayout.set(null);
        view.invalidate();
    }

    public static void lambda$checkLayoutForLinks$7(View view, DrawingText drawingText) {
        view.post(new ArticleViewer$$ExternalSyntheticLambda12(drawingText, view));
    }

    public void lambda$checkScrollAnimated$52(ValueAnimator valueAnimator) {
        setCurrentHeaderHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public void lambda$close$57() {
        FrameLayout frameLayout = this.containerView;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setLayerType(0, null);
        this.animationInProgress = 0;
        onClosed();
    }

    public static void lambda$joinChannel$61(BlockChannelCell blockChannelCell, int i, TLRPC.TL_error tL_error, TLRPC.TL_channels_joinChannel tL_channels_joinChannel) {
        blockChannelCell.setState(0, false);
        AlertsCreator.processError(i, tL_error, null, tL_channels_joinChannel, Boolean.TRUE);
    }

    public static void lambda$joinChannel$62(int i, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, TLRPC.Chat chat) {
        MessagesController.getInstance(i).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(i).openGuardBotWebApp(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void lambda$joinChannel$64(int i, TLRPC.Chat chat) {
        MessagesController.getInstance(i).loadFullChat(chat.id, 0, true);
    }

    public static void lambda$joinChannel$65(BlockChannelCell blockChannelCell, int i, TLRPC.TL_channels_joinChannel tL_channels_joinChannel, TLRPC.Chat chat, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        boolean z;
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9(blockChannelCell, i, tL_error, tL_channels_joinChannel, 3));
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
            AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(i, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat, 14));
            z2 = true;
        }
        if (!z2) {
            MessagesController.getInstance(i).generateJoinMessage(chat.id, true);
        }
        AndroidUtilities.runOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(blockChannelCell, 22));
        AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda6(i, chat), 1000L);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
        long j = chat.id;
        messagesStorage.updateDialogsWithDeletedMessages(-j, j, new ArrayList<>(), null);
    }

    public static void lambda$loadChannel$59(IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, TLRPC.TL_error tL_error, TLObject tLObject, int i, BlockChannelCell blockChannelCell) {
        iArticleViewer.loadingChannel = false;
        if (webpageAdapter.blocks.isEmpty()) {
            return;
        }
        if (tL_error != null) {
            blockChannelCell.setState(4, false);
            return;
        }
        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
            blockChannelCell.setState(4, false);
            return;
        }
        MessagesController.getInstance(i).putUsers(tL_contacts_resolvedPeer.users, false);
        MessagesController.getInstance(i).putChats(tL_contacts_resolvedPeer.chats, false);
        MessagesStorage.getInstance(i).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
        TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
        iArticleViewer.loadedChannel = chat;
        if (!chat.left || chat.kicked) {
            blockChannelCell.setState(4, false);
        } else {
            blockChannelCell.setState(0, false);
        }
    }

    public static void lambda$loadChannel$60(IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, int i, BlockChannelCell blockChannelCell, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda16(iArticleViewer, webpageAdapter, tL_error, tLObject, i, blockChannelCell, 5));
    }

    public void lambda$new$67() {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda9(this, 5));
    }

    public void lambda$new$68() {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda9(this, 5));
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

    public void lambda$open$53(TLObject tLObject, int i, TLRPC.WebPage webPage, MessageObject messageObject, boolean z, String str) {
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
            longSparseArray.put(tL_webPage, tL_webPage.id);
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

    public void lambda$open$54(int i, TLRPC.WebPage webPage, MessageObject messageObject, boolean z, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda25(this, tLObject, i, webPage, messageObject, z, str));
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

    public void lambda$open$56(AnimatorSet animatorSet) {
        this.notificationsLocker.lock();
        animatorSet.start();
    }

    public void lambda$openWebpageUrl$8(String str, String str2, Browser.Progress progress, AlertDialog alertDialog, int i) {
        openWebpageUrlInternal(str, str2, progress);
    }

    public Boolean lambda$openWebpageUrlInternal$10(String str, boolean[] zArr, Browser.Progress progress) {
        if (!Browser.isInternalUri(Uri.parse(str), false, zArr)) {
            return Boolean.FALSE;
        }
        if (progress != null) {
            progress.onEnd(new PhotoViewer$7$$ExternalSyntheticLambda0(18, this, progress));
        } else {
            Sheet sheet = this.sheet;
            if (sheet != null) {
                sheet.dismiss(true);
            }
        }
        Browser.openUrl(this.parentActivity, Uri.parse(str), true, true, false, progress, null, true, true, false);
        return Boolean.TRUE;
    }

    public void lambda$openWebpageUrlInternal$11(int i, Browser.Progress progress, TLObject tLObject, String str, Utilities.Callback0Return callback0Return, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        if (this.openUrlReqId == 0 || i != this.lastReqId) {
            return;
        }
        if (progress != null) {
            progress.end();
        }
        this.openUrlReqId = 0;
        showProgressView(true, false);
        if (this.isVisible) {
            if (!(tLObject instanceof TLRPC.TL_messages_webPage)) {
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
                    return;
                } else {
                    Browser.openUrl(this.parentActivity, tL_messages_getWebPage.url);
                    return;
                }
            }
            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_webPage.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_messages_webPage.chats, false);
            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
            if (webPage != null && (webPage.cached_page instanceof TL_iv.TL_page)) {
                addPageToStack(webPage, str, 1);
            } else {
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
    }

    public void lambda$openWebpageUrlInternal$12(int i, Browser.Progress progress, String str, Utilities.Callback0Return callback0Return, TLRPC.TL_messages_getWebPage tL_messages_getWebPage, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda20(this, i, progress, tLObject, str, callback0Return, tL_messages_getWebPage, 0));
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

    public void lambda$openWebpageUrlInternal$9(Browser.Progress progress) {
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.dismiss(true);
        }
        if (this.loadingProgress == progress) {
            this.loadingProgress = null;
        }
    }

    public void lambda$processSearch$48(int i, ArrayList arrayList, String str) {
        if (i == this.lastSearchIndex) {
            showSearchPanel(true);
            this.searchResults = arrayList;
            this.searchText = str;
            this.pages[0].adapter.searchTextOffset.clear();
            this.pages[0].listView.invalidateViews();
            scrollToSearchIndex(0);
        }
    }

    public void lambda$processSearch$49(ArrayList arrayList, HashMap map, String str, int i) {
        String lowerCase;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) map.get(obj);
            if (obj instanceof TL_iv.RichText) {
                TL_iv.RichText richText = (TL_iv.RichText) obj;
                CharSequence text = getText(this.pages[0].adapter, (View) null, richText, richText, pageBlock, 1000);
                if (TextUtils.isEmpty(text)) {
                    lowerCase = null;
                } else {
                    lowerCase = text.toString().toLowerCase();
                }
            } else if (obj instanceof String) {
                lowerCase = ((String) obj).toLowerCase();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                int i3 = 0;
                while (true) {
                    int iIndexOf = lowerCase.indexOf(str, i3);
                    if (iIndexOf >= 0) {
                        int length = str.length() + iIndexOf;
                        if (iIndexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(iIndexOf - 1))) {
                            SearchResult searchResult = new SearchResult();
                            searchResult.index = iIndexOf;
                            searchResult.block = pageBlock;
                            searchResult.text = obj;
                            arrayList2.add(searchResult);
                        }
                        i3 = length;
                    }
                }
            }
        }
        AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9(this, i, arrayList2, str, 4));
    }

    public void lambda$processSearch$50(String str, int i) {
        HashMap map = new HashMap(this.pages[0].adapter.textToBlocks);
        ArrayList arrayList = new ArrayList(this.pages[0].adapter.textBlocks);
        this.searchRunnable = null;
        Utilities.searchQueue.postRunnable(new WearAuthSheet$$ExternalSyntheticLambda0(this, arrayList, map, str, i, 3));
    }

    public static WindowInsets lambda$setParentActivity$14(View view, WindowInsets windowInsets) {
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public boolean lambda$setParentActivity$15(View view, int i) {
        if (!(view instanceof BlockRelatedArticlesCell)) {
            return false;
        }
        BlockRelatedArticlesCell blockRelatedArticlesCell = (BlockRelatedArticlesCell) view;
        showCopyPopup(blockRelatedArticlesCell.currentBlock.parent.articles.get(blockRelatedArticlesCell.currentBlock.num).url);
        return true;
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

    public void lambda$setParentActivity$17(int i, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda0(this, tLObject, i, j, 0));
    }

    public void lambda$setParentActivity$18(PageLayout pageLayout, View view, int i, float f, float f2) {
        if (this.sheet == null || (i = i - 1) >= 0) {
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
                        if (userOrChat instanceof TLRPC.TL_user) {
                            openPreviewsChat((TLRPC.User) userOrChat, adapter.currentPage.id);
                            return;
                        }
                        int i2 = UserConfig.selectedAccount;
                        long j = adapter.currentPage.id;
                        showProgressView(true, true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        this.previewsReqId = ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new ArticleViewer$$ExternalSyntheticLambda44(this, i2, j));
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
        BotWebViewContainer.MyWebView webView = pageLayout.getWebView();
        SearchEngine current = SearchEngine.getCurrent();
        webView.loadUrl(current.search_url != null ? current.search_url + URLEncoder.encode(str) : null);
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
            BotWebViewContainer.MyWebView webView = pageLayout.getWebView();
            SearchEngine current = SearchEngine.getCurrent();
            webView.loadUrl(current.search_url != null ? current.search_url + URLEncoder.encode(str) : null);
        }
    }

    public void lambda$setParentActivity$24(Activity activity, View view) {
        String strDecode;
        if (this.actionBar.longClicked) {
            return;
        }
        PageLayout pageLayout = this.pages[0];
        if (!pageLayout.isWeb()) {
            if (this.sheet == null) {
                pageLayout.listView.smoothScrollToPosition(0);
                return;
            }
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
        if (pageLayout.getWebView() == null || this.actionBar.isAddressing()) {
            return;
        }
        if (this.addressBarList != null) {
            BotWebViewContainer.MyWebView webView = pageLayout.getWebView();
            String title = webView != null ? webView.getTitle() : null;
            String strMagic2tonsite = BotWebViewContainer.magic2tonsite(webView != null ? webView.getUrl() : null);
            AddressBarList addressBarList = this.addressBarList;
            Bitmap favicon = webView != null ? webView.getFavicon() : null;
            if (TextUtils.isEmpty(title)) {
                title = LocaleController.getString(R.string.WebEmpty);
            }
            String strReplace = TextUtils.isEmpty(strMagic2tonsite) ? "about:blank" : strMagic2tonsite;
            ArticleViewer$$ExternalSyntheticLambda26 articleViewer$$ExternalSyntheticLambda26 = new ArticleViewer$$ExternalSyntheticLambda26(this, strMagic2tonsite, 0);
            ArticleViewer$$ExternalSyntheticLambda27 articleViewer$$ExternalSyntheticLambda27 = new ArticleViewer$$ExternalSyntheticLambda27(this, pageLayout, activity, 0);
            ArticleViewer$$ExternalSyntheticLambda28 articleViewer$$ExternalSyntheticLambda28 = new ArticleViewer$$ExternalSyntheticLambda28(this, 0);
            ArticleViewer$$ExternalSyntheticLambda28 articleViewer$$ExternalSyntheticLambda29 = new ArticleViewer$$ExternalSyntheticLambda28(this, 1);
            OAuthSheet$$ExternalSyntheticLambda0 oAuthSheet$$ExternalSyntheticLambda0 = new OAuthSheet$$ExternalSyntheticLambda0(this, strMagic2tonsite, pageLayout);
            ImageView imageView = addressBarList.currentIconView;
            if (favicon == null) {
                imageView.setImageResource(R.drawable.msg_language);
                imageView.setColorFilter(new PorterDuffColorFilter(addressBarList.textColor, PorterDuff.Mode.SRC_IN));
            } else {
                imageView.setImageDrawable(new BitmapDrawable(addressBarList.getContext().getResources(), favicon));
                imageView.setColorFilter((ColorFilter) null);
            }
            TextView textView = addressBarList.currentTitleView;
            textView.setText(Emoji.replaceEmoji(title, textView.getPaint().getFontMetricsInt(), false));
            try {
                try {
                    Uri uri = Uri.parse(strReplace);
                    strReplace = Browser.replace(uri, null, null, Browser.IDN_toUnicode(uri.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                strDecode = URLDecoder.decode(strReplace.replaceAll("\\+", "%2b"), "UTF-8");
            } catch (Exception e2) {
                FileLog.e(e2);
                strDecode = strReplace;
            }
            TextView textView2 = addressBarList.currentLinkView;
            textView2.setText(Emoji.replaceEmoji(strDecode, textView2.getPaint().getFontMetricsInt(), false));
            addressBarList.onQueryClick = articleViewer$$ExternalSyntheticLambda27;
            addressBarList.onQueryInsertClick = articleViewer$$ExternalSyntheticLambda28;
            addressBarList.onURLClick = articleViewer$$ExternalSyntheticLambda29;
            addressBarList.currentView.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(24, addressBarList, articleViewer$$ExternalSyntheticLambda26));
            addressBarList.currentCopyView.setOnClickListener(oAuthSheet$$ExternalSyntheticLambda0);
            addressBarList.hideCurrent = false;
            addressBarList.setInput(null);
            AddressBarList.AnonymousClass1 anonymousClass1 = addressBarList.listView;
            anonymousClass1.adapter.update(true);
            anonymousClass1.scrollToPosition(0);
        }
        this.actionBar.showAddress("", new OAuthSheet$$ExternalSyntheticLambda1(10, pageLayout, activity));
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

    public void lambda$setParentActivity$26(View view) {
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

    public static void lambda$setParentActivity$27(int i, int i2, BotWebViewContainer.MyWebView myWebView) {
        for (int i3 = 0; i3 < i - i2; i3++) {
            myWebView.goBack();
        }
    }

    public void lambda$setParentActivity$30(float f) {
        this.actionBar.backButtonDrawable.setRotation(f, true);
    }

    public void lambda$setParentActivity$31(ItemOptions itemOptions, float f) {
        this.actionBar.backButtonDrawable.setRotation(0.0f, true);
        itemOptions.setOnDismiss(new PhotoViewer$6$$ExternalSyntheticLambda0(this, f, 2));
        itemOptions.show();
    }

    public boolean lambda$setParentActivity$32(View view) {
        if (this.pages[0] != null) {
            final float f = this.actionBar.backButtonDrawable.finalRotation;
            Sheet sheet = this.sheet;
            final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(sheet != null ? sheet.windowView : this.windowView, view);
            int color = SharedConfig.adaptableColorInBrowser ? Theme.getColor(null, Theme.key_iv_background, false) : this.pages[0].getBackgroundColor();
            int color2 = SharedConfig.adaptableColorInBrowser ? Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false) : AndroidUtilities.computePerceivedBrightness(this.pages[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
            int iMultAlpha = Theme.multAlpha(0.65f, color2);
            BotWebViewContainer.MyWebView webView = this.pages[0].getWebView();
            int i = 3;
            if (webView != null) {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                if (webBackForwardListCopyBackForwardList.getCurrentIndex() > 0) {
                    int i2 = 0;
                    while (i2 < currentIndex) {
                        WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i2);
                        itemOptionsMakeOptions.add(itemAtIndex.getTitle(), new ArticleViewer$$ExternalSyntheticLambda5(currentIndex, i2, webView));
                        ActionBarMenuSubItem last = itemOptionsMakeOptions.getLast();
                        if (last != null) {
                            last.setSubtext(itemAtIndex.getUrl());
                            final Bitmap favicon = (Bitmap) webView.lastFavicons.get(itemAtIndex.getUrl());
                            if (favicon == null) {
                                favicon = itemAtIndex.getFavicon();
                            }
                            final Paint paint = new Paint(i);
                            last.setTextAndIcon(itemAtIndex.getTitle(), 0, new Drawable() {
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
                    final int i3 = 0;
                    itemOptionsMakeOptions.add(cachedWeb.getTitle(), new Runnable(this) {
                        public final ArticleViewer f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    this.f$0.lambda$setParentActivity$28(size);
                                    break;
                                default:
                                    this.f$0.lambda$setParentActivity$29(size);
                                    break;
                            }
                        }
                    });
                    ActionBarMenuSubItem last2 = itemOptionsMakeOptions.getLast();
                    if (last2 != null) {
                        last2.setSubtext(cachedWeb.lastUrl);
                        final Bitmap bitmap = webView != null ? (Bitmap) webView.lastFavicons.get(cachedWeb.lastUrl) : null;
                        if (bitmap == null) {
                            bitmap = cachedWeb.favicon;
                        }
                        final Paint paint2 = new Paint(3);
                        last2.setTextAndIcon(cachedWeb.getTitle(), 0, new Drawable() {
                            @Override
                            public void draw(Canvas canvas) {
                                if (bitmap != null) {
                                    canvas.save();
                                    canvas.translate(getBounds().left, getBounds().top);
                                    canvas.scale(getBounds().width() / bitmap.getWidth(), getBounds().height() / bitmap.getHeight());
                                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
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

                            @Override
                            public int getOpacity() {
                                return -2;
                            }

                            @Override
                            public void setAlpha(int i4) {
                            }

                            @Override
                            public void setColorFilter(ColorFilter colorFilter) {
                            }
                        });
                        last2.setTextColor(color2);
                        last2.setSubtextColor(iMultAlpha);
                        last2.setColors(color2, color2);
                    }
                } else if (obj instanceof TLRPC.WebPage) {
                    TLRPC.WebPage webPage = (TLRPC.WebPage) obj;
                    final int i4 = 1;
                    itemOptionsMakeOptions.add(webPage.title, new Runnable(this) {
                        public final ArticleViewer f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    this.f$0.lambda$setParentActivity$28(size);
                                    break;
                                default:
                                    this.f$0.lambda$setParentActivity$29(size);
                                    break;
                            }
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
            if (itemOptionsMakeOptions.getItemsCount() > 0) {
                checkScrollAnimated(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setParentActivity$31(itemOptionsMakeOptions, f);
                    }
                });
                return true;
            }
        }
        return false;
    }

    public void lambda$setParentActivity$33() {
        this.sheet.dismiss(true);
    }

    public void lambda$setParentActivity$34() {
        this.sheet.dismiss(true);
    }

    public void lambda$setParentActivity$35(String str) {
        Browser.openInExternalBrowser(this.parentActivity, str, false, null);
    }

    public void lambda$setParentActivity$36(String str, String str2, Boolean bool) {
        MessagesController.getInstance(this.currentAccount).addWebBrowserException(str, true);
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, str)) {
            MessagesController.getInstance(this.currentAccount).addWebBrowserException(str2, true);
        }
        if (bool.booleanValue()) {
            LaunchActivity.whenResumed = new ArticleViewer$$ExternalSyntheticLambda9(this, 0);
        } else {
            showRestrictedWebsiteToast();
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

    public void lambda$setParentActivity$39(Activity activity, Integer num) {
        WebInstantView.Loader loader;
        String url;
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
                safeLastFragment.showAsSheet(new BookmarksFragment(new ArticleViewer$$ExternalSyntheticLambda28(this, 1), this.sheet != null ? new ArticleViewer$$ExternalSyntheticLambda9(this, 9) : null), bottomSheetParams);
                return;
            }
            return;
        }
        if (num.intValue() == 8) {
            BaseFragment.BottomSheetParams bottomSheetParams2 = new BaseFragment.BottomSheetParams();
            bottomSheetParams2.transitionFromLeft = true;
            BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment2 != null) {
                safeLastFragment2.showAsSheet(new HistoryFragment(new ArticleViewer$$ExternalSyntheticLambda28(this, 2), this.sheet != null ? new ArticleViewer$$ExternalSyntheticLambda9(this, 10) : null), bottomSheetParams2);
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
                String str = this.pages[0].adapter.currentPage.url;
                if (this.pages[0].adapter.currentPage.cached_page != null) {
                    url = str;
                    file = this.pages[0].adapter.currentPage.cached_page.local;
                } else {
                    url = str;
                    file = null;
                }
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
            String hostAuthority = AndroidUtilities.getHostAuthority(openURL, true);
            String hostAuthority2 = AndroidUtilities.getHostAuthority(url, true);
            ArticleViewer$$ExternalSyntheticLambda26 articleViewer$$ExternalSyntheticLambda26 = new ArticleViewer$$ExternalSyntheticLambda26(this, url, 1);
            ArticleViewer$$ExternalSyntheticLambda27 articleViewer$$ExternalSyntheticLambda27 = new ArticleViewer$$ExternalSyntheticLambda27(this, hostAuthority2, hostAuthority, 3);
            if (this.pages[0].isWeb() && MessagesController.getInstance(this.currentAccount).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(this.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
                AlertsCreator.showOpenExternalBrowserAlert(activity, getResourcesProvider(), url, true, true, new OAuthSheet$$ExternalSyntheticLambda19(2, articleViewer$$ExternalSyntheticLambda27, articleViewer$$ExternalSyntheticLambda26));
                return;
            } else {
                articleViewer$$ExternalSyntheticLambda26.run();
                return;
            }
        }
        if (num.intValue() != 4) {
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
            return;
        }
        if (this.pages[0].isWeb()) {
            openWebSettings();
            return;
        }
        BottomSheet bottomSheet = new BottomSheet(this.parentActivity, false, false, null);
        bottomSheet.fixNavigationBar();
        bottomSheet.applyTopPadding = false;
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
            this.fontCells[i].setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda15(this, 5));
            linearLayout.addView(this.fontCells[i], LayoutHelper.createLinear(-1, 50));
            i++;
        }
        bottomSheet.customView = linearLayout;
        this.linkSheet = bottomSheet;
        showDialog(bottomSheet);
    }

    public void lambda$setParentActivity$40(View view) {
        Sheet sheet = this.sheet;
        if (sheet != null) {
            sheet.dismiss(true);
        }
    }

    public static boolean lambda$setParentActivity$41(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$setParentActivity$42(Integer num) {
        FrameLayout frameLayout = this.searchPanel;
        float f = -num.intValue();
        this.searchPanelTranslation = f;
        frameLayout.setTranslationY(((1.0f - this.searchPanelAlpha) * AndroidUtilities.dp(51.0f)) + f);
    }

    public void lambda$setParentActivity$43(View view) {
        if (!this.pages[0].isWeb()) {
            scrollToSearchIndex(this.currentSearchIndex - 1);
        } else if (this.pages[0].getWebView() != null) {
            this.pages[0].getWebView().findNext(false);
        }
    }

    public void lambda$setParentActivity$44(View view) {
        if (!this.pages[0].isWeb()) {
            scrollToSearchIndex(this.currentSearchIndex + 1);
        } else if (this.pages[0].getWebView() != null) {
            this.pages[0].getWebView().findNext(true);
        }
    }

    public void lambda$setParentActivity$45(CharSequence charSequence, String str, String str2, Runnable runnable) {
        TranslateAlert2.showAlert(this.parentActivity, this.parentFragment, this.currentAccount, str, str2, charSequence, null, false, null, runnable);
    }

    public void lambda$setParentActivity$46(float[] fArr) {
        fArr[0] = this.currentHeaderHeight;
        fArr[1] = this.pages[0].listView.getMeasuredHeight();
    }

    public void lambda$showCopyPopup$0(String str, DialogInterface dialogInterface, int i) {
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
                    if (!TextUtils.isEmpty(strDecode)) {
                        scrollToAnchor(strDecode, true);
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = this.pages[0].layoutManager;
                    Sheet sheet = this.sheet;
                    linearLayoutManager.scrollToPositionWithOffset((sheet == null || !sheet.halfSize()) ? 0 : 1, this.sheet != null ? AndroidUtilities.dp(32.0f) : 0);
                    checkScrollAnimated();
                    return;
                }
            }
            Browser.openUrl(this.parentActivity, str);
        }
    }

    public void lambda$showCopyPopup$1(DialogInterface dialogInterface) {
        this.links.clear();
    }

    public void lambda$showDialog$66(DialogInterface dialogInterface) {
        this.visibleDialog = null;
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

    public void lambda$showSearchPanel$51(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.searchPanelAlpha = fFloatValue;
        this.searchPanel.setTranslationY(((1.0f - fFloatValue) * AndroidUtilities.dp(51.0f)) + this.searchPanelTranslation);
    }

    public static void loadChannel(IArticleViewer iArticleViewer, BlockChannelCell blockChannelCell, WebpageAdapter webpageAdapter, TLRPC.Chat chat) {
        if (iArticleViewer.loadingChannel || !ChatObject.isPublic(chat)) {
            return;
        }
        iArticleViewer.loadingChannel = true;
        int currentAccount = iArticleViewer.getCurrentAccount();
        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
        tL_contacts_resolveUsername.username = chat.username;
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_contacts_resolveUsername, new ArticleViewer$$ExternalSyntheticLambda39(iArticleViewer, webpageAdapter, currentAccount, blockChannelCell, 0));
    }

    public Browser.Progress makeProgress(LinkSpanDrawable<TextPaintUrlSpan> linkSpanDrawable, DrawingText drawingText) {
        return makeProgress(this, linkSpanDrawable, drawingText);
    }

    public static ArticleViewer makeSheet(BaseFragment baseFragment) {
        return new ArticleViewer(baseFragment);
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
        this.containerView.post(new ArticleViewer$$ExternalSyntheticLambda9(this, 6));
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.articleClosed, new Object[0]);
    }

    private boolean openAllParentBlocks(TL_pageBlockDetailsChild tL_pageBlockDetailsChild) {
        boolean z;
        TL_iv.PageBlock lastNonListPageBlock = getLastNonListPageBlock(tL_pageBlockDetailsChild.parent);
        if (lastNonListPageBlock instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) lastNonListPageBlock;
            if (pageblockdetails.open) {
                return false;
            }
            pageblockdetails.open = true;
            return true;
        }
        if (!(lastNonListPageBlock instanceof TL_pageBlockDetailsChild)) {
            return false;
        }
        TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = (TL_pageBlockDetailsChild) lastNonListPageBlock;
        TL_iv.PageBlock lastNonListPageBlock2 = getLastNonListPageBlock(tL_pageBlockDetailsChild2.block);
        if (lastNonListPageBlock2 instanceof TL_iv.pageBlockDetails) {
            TL_iv.pageBlockDetails pageblockdetails2 = (TL_iv.pageBlockDetails) lastNonListPageBlock2;
            if (pageblockdetails2.open) {
                z = false;
            } else {
                pageblockdetails2.open = true;
                z = true;
            }
        } else {
            z = false;
        }
        return openAllParentBlocks(tL_pageBlockDetailsChild2) || z;
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

    private void openWebpageUrlInternal(final String str, String str2, final Browser.Progress progress) {
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
        ?? r7 = new Utilities.Callback0Return() {
            @Override
            public final Object run() {
                return this.f$0.lambda$openWebpageUrlInternal$10(str, zArr, progress);
            }
        };
        int i = this.lastReqId + 1;
        this.lastReqId = i;
        showProgressView(true, true);
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = str;
        tL_messages_getWebPage.hash = 0;
        this.openUrlReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getWebPage, new ArticleViewer$$ExternalSyntheticLambda33(this, i, progress, str2, (ArticleViewer$$ExternalSyntheticLambda32) r7, tL_messages_getWebPage));
        if (progress != null) {
            progress.onCancel(new TodoItemMenu$$ExternalSyntheticLambda2(this, i, progress, 13));
            progress.init();
        }
    }

    public void processSearch(String str) {
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
            if (!this.pages[0].isWeb()) {
                this.pages[0].listView.invalidateViews();
                scrollToSearchIndex(0);
            } else if (this.pages[0].getWebView() != null) {
                BotWebViewContainer.MyWebView webView = this.pages[0].getWebView();
                webView.searchListener = new ArticleViewer$$ExternalSyntheticLambda9(this, 3);
                webView.findAllAsync("");
                updateSearchButtons();
            }
            this.lastSearchIndex = -1;
            return;
        }
        int i = this.lastSearchIndex + 1;
        this.lastSearchIndex = i;
        if (!this.pages[0].isWeb()) {
            TodoItemMenu$$ExternalSyntheticLambda2 todoItemMenu$$ExternalSyntheticLambda2 = new TodoItemMenu$$ExternalSyntheticLambda2(this, str, i, 12);
            this.searchRunnable = todoItemMenu$$ExternalSyntheticLambda2;
            AndroidUtilities.runOnUIThread(todoItemMenu$$ExternalSyntheticLambda2, 400L);
            return;
        }
        showSearchPanel(true);
        if (this.pages[0].getWebView() != null) {
            BotWebViewContainer.MyWebView webView2 = this.pages[0].getWebView();
            webView2.searchListener = new ArticleViewer$$ExternalSyntheticLambda9(this, 3);
            webView2.findAllAsync(str);
            updateSearchButtons();
        }
    }

    private void refreshThemeColors() {
        TextView textView = this.deleteView;
        if (textView != null) {
            textView.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 2, -1));
            this.deleteView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout != null) {
            actionBarPopupWindowLayout.setBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        }
        ImageView imageView = this.searchUpButton;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.MULTIPLY));
            this.searchUpButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 1, -1));
        }
        ImageView imageView2 = this.searchDownButton;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlackText), PorterDuff.Mode.MULTIPLY));
            this.searchDownButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 1, -1));
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

    private boolean removeLastPageFromStack() {
        if (this.pagesStack.size() < 2) {
            return false;
        }
        Object objM = DiffUtil.m(this.pagesStack);
        if (objM instanceof CachedWeb) {
            ((CachedWeb) objM).destroy();
        }
        if (objM instanceof TLRPC.WebPage) {
            WebInstantView.recycle((TLRPC.WebPage) objM);
        }
        updateInterfaceForCurrentPage(zzin.m(1, this.pagesStack), false, -1);
        return true;
    }

    private void removePressedLink() {
        removePressedLink(this);
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
        String strM = zzhp.m(str, "r");
        Point point = AndroidUtilities.displaySize;
        editorPutInt.putBoolean(strM, point.x > point.y).commit();
    }

    private void scrollToSearchIndex(int i) {
        if (i < 0 || i >= this.searchResults.size()) {
            updateSearchButtons();
            return;
        }
        this.currentSearchIndex = i;
        updateSearchButtons();
        SearchResult searchResult = this.searchResults.get(i);
        TL_iv.PageBlock lastNonListPageBlock = getLastNonListPageBlock(searchResult.block);
        int size = this.pages[0].adapter.blocks.size();
        for (int i2 = 0; i2 < size; i2++) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.pages[0].adapter.blocks.get(i2);
            if (pageBlock instanceof TL_pageBlockDetailsChild) {
                TL_pageBlockDetailsChild tL_pageBlockDetailsChild = (TL_pageBlockDetailsChild) pageBlock;
                if (tL_pageBlockDetailsChild.block == searchResult.block || tL_pageBlockDetailsChild.block == lastNonListPageBlock) {
                    if (!openAllParentBlocks(tL_pageBlockDetailsChild)) {
                        break;
                    }
                    this.pages[0].adapter.updateRows();
                    this.pages[0].adapter.notifyDataSetChanged();
                    break;
                }
            }
        }
        int size2 = this.pages[0].adapter.localBlocks.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                i3 = -1;
                break;
            }
            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) this.pages[0].adapter.localBlocks.get(i3);
            if (pageBlock2 == searchResult.block || pageBlock2 == lastNonListPageBlock) {
                break;
            }
            if (pageBlock2 instanceof TL_pageBlockDetailsChild) {
                TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = (TL_pageBlockDetailsChild) pageBlock2;
                if (tL_pageBlockDetailsChild2.block == searchResult.block || tL_pageBlockDetailsChild2.block == lastNonListPageBlock) {
                    break;
                }
            }
            i3++;
        }
        if (i3 == -1) {
            return;
        }
        if ((lastNonListPageBlock instanceof TL_pageBlockDetailsChild) && openAllParentBlocks((TL_pageBlockDetailsChild) lastNonListPageBlock)) {
            this.pages[0].adapter.updateRows();
            this.pages[0].adapter.notifyDataSetChanged();
        }
        String str = this.searchText + searchResult.block + searchResult.text + searchResult.index;
        Integer num = (Integer) this.pages[0].adapter.searchTextOffset.get(str);
        if (num == null) {
            int typeForBlock = this.pages[0].adapter.getTypeForBlock(searchResult.block);
            RecyclerView.ViewHolder viewHolderOnCreateViewHolder = this.pages[0].adapter.onCreateViewHolder(null, typeForBlock);
            this.pages[0].adapter.bindBlockToHolder(typeForBlock, viewHolderOnCreateViewHolder, searchResult.block, 0, 0, false);
            viewHolderOnCreateViewHolder.itemView.measure(View.MeasureSpec.makeMeasureSpec(this.pages[0].listView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            num = (Integer) this.pages[0].adapter.searchTextOffset.get(str);
            if (num == null) {
                num = 0;
            }
        }
        SmoothScroller smoothScroller = new SmoothScroller(this.pages[0].getContext()) {
            @Override
            public int getVerticalSnapPreference() {
                return -1;
            }
        };
        if (this.pages[0].adapter.padding) {
            i3++;
        }
        smoothScroller.setTargetPosition(i3);
        smoothScroller.setOffset(-(AndroidUtilities.dp(100.0f) + ((this.currentHeaderHeight - AndroidUtilities.dp(56.0f)) - num.intValue())));
        smoothScroller.setDurationScale(1.2f);
        this.pages[0].layoutManager.startSmoothScroll(smoothScroller);
        this.pages[0].listView.invalidateViews();
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

    public void showCopyPopup(String str) {
        String strDecode;
        int i = 0;
        if (this.parentActivity == null) {
            return;
        }
        BottomSheet bottomSheet = this.linkSheet;
        if (bottomSheet != null) {
            bottomSheet.lambda$showGiftOfferSheet$15();
            this.linkSheet = null;
        }
        BottomSheet bottomSheet2 = new BottomSheet(this.parentActivity, false, false, null);
        bottomSheet2.fixNavigationBar();
        try {
            strDecode = URLDecoder.decode(str.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e) {
            FileLog.e(e);
            strDecode = str;
        }
        bottomSheet2.title = strDecode;
        bottomSheet2.bigTitle = false;
        bottomSheet2.multipleLinesTitle = true;
        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
        ArticleViewer$$ExternalSyntheticLambda1 articleViewer$$ExternalSyntheticLambda1 = new ArticleViewer$$ExternalSyntheticLambda1(i, this, str);
        bottomSheet2.items = charSequenceArr;
        bottomSheet2.onClickListener = articleViewer$$ExternalSyntheticLambda1;
        bottomSheet2.setOnHideListener(new ArticleViewer$$ExternalSyntheticLambda2(this, i));
        showDialog(bottomSheet2);
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
            this.popupLayout.setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 2));
            this.popupLayout.setDispatchKeyEventListener(new ArticleViewer$$ExternalSyntheticLambda14(this));
            this.popupLayout.setShownFromBottom(false);
            TextView textView = new TextView(this.parentActivity);
            this.deleteView = textView;
            textView.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 2, -1));
            this.deleteView.setGravity(16);
            this.deleteView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.deleteView.setTextSize(1, 15.0f);
            this.deleteView.setTypeface(AndroidUtilities.bold());
            ArticleViewer$$ExternalSyntheticOutline0.m(R.string.Copy, this.deleteView);
            this.deleteView.setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda15(this, 0));
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
            this.popupWindow.setOnDismissListener(new ChatActivity$$ExternalSyntheticLambda21(this, 2));
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

    private void showProgressView(boolean z, final boolean z2) {
        if (z) {
            AndroidUtilities.cancelRunOnUIThread(this.lineProgressTickRunnable);
            if (!z2) {
                this.actionBar.lineProgressView.setProgress(1.0f, true);
                return;
            }
            this.actionBar.lineProgressView.setProgress(0.0f, false);
            this.actionBar.lineProgressView.setProgress(0.3f, true);
            AndroidUtilities.runOnUIThread(this.lineProgressTickRunnable, 100L);
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
            public void onAnimationCancel(Animator animator) {
                if (ArticleViewer.this.progressViewAnimation == null || !ArticleViewer.this.progressViewAnimation.equals(animator)) {
                    return;
                }
                ArticleViewer.this.progressViewAnimation = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (ArticleViewer.this.progressViewAnimation == null || !ArticleViewer.this.progressViewAnimation.equals(animator) || z2) {
                    return;
                }
                ArticleViewer.this.progressView.setVisibility(4);
            }
        });
        this.progressViewAnimation.setDuration(150L);
        this.progressViewAnimation.start();
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
        BulletinFactory.of(frameLayout, getResourcesProvider()).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BrowserExternalRestricted), new ArticleViewer$$ExternalSyntheticLambda9(this, 11)), 4).show(true);
    }

    public void updateInterfaceForCurrentPage(Object obj, boolean z, int i) {
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
                    public void onAnimationEnd(Animator animator) {
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
                AndroidUtilities.runOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(animatorSet, 23));
            }
            if (!z) {
                this.textSelectionHelper.clear(true);
            }
            WebpageAdapter webpageAdapter = this.pages[z ? 1 : 0].adapter;
            if (z) {
                obj = zzin.m(2, this.pagesStack);
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

    public void updatePaintSize() {
        for (int i = 0; i < 2; i++) {
            this.pages[i].adapter.notifyDataSetChanged();
            this.pages[i].adapter.resetCachedHeights();
        }
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

    private void updateWindowLayoutParamsForSearch() {
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

    @Override
    public boolean allowTouches() {
        return this.pageSwitchAnimation == null;
    }

    public void cancelCheckLongPress() {
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
        this.animationEndRunnable = new ArticleViewer$$ExternalSyntheticLambda9(this, 8);
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
                for (int i8 = 0; i8 < childCount3; i8++) {
                    View childAt3 = this.pages[i7].listView.getChildAt(i8);
                    if ((childAt3 instanceof BlockAudioCell) && (messageObject = (blockAudioCell = (BlockAudioCell) childAt3).getMessageObject()) != null && messageObject.getId() == num.intValue()) {
                        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                        if (playingMessageObject == null) {
                            break;
                        }
                        messageObject.audioProgress = playingMessageObject.audioProgress;
                        messageObject.audioProgressSec = playingMessageObject.audioProgressSec;
                        messageObject.audioPlayerDuration = playingMessageObject.audioPlayerDuration;
                        blockAudioCell.updatePlayingMessageProgress();
                        break;
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

    @Override
    public WebpageAdapter getAdapter() {
        return this.pages[0].adapter;
    }

    @Override
    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public PageLayout getCurrentPageLayout() {
        return this.pages[0];
    }

    @Override
    public int getGrayTextColor() {
        return getThemedColor(Theme.key_windowBackgroundWhiteGrayText);
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

    @Override
    public int getLinkTextColor() {
        return getThemedColor(Theme.key_windowBackgroundWhiteLinkText);
    }

    @Override
    public Resources getResources() {
        return resources;
    }

    @Override
    public Theme.ResourcesProvider getResourcesProvider() {
        return null;
    }

    @Override
    public int getTextColor() {
        return getThemedColor(Theme.key_windowBackgroundWhiteBlackText);
    }

    @Override
    public TextSelectionHelper.ArticleTextSelectionHelper getTextSelectionHelper(View view) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
        return (view == null || view.getTag() == null || view.getTag() != "bottomSheet" || (articleTextSelectionHelper = this.textSelectionHelperBottomSheet) == null) ? this.textSelectionHelper : articleTextSelectionHelper;
    }

    @Override
    public int getThemedColor(int i) {
        return Theme.getColor(i, getResourcesProvider());
    }

    @Override
    public void handleLinkClick(WebpageAdapter webpageAdapter, TextPaintUrlSpan textPaintUrlSpan) {
        String url;
        String strDecode;
        if (textPaintUrlSpan == null || (url = textPaintUrlSpan.getUrl()) == null) {
            return;
        }
        BottomSheet bottomSheet = this.linkSheet;
        if (bottomSheet != null) {
            bottomSheet.lambda$showGiftOfferSheet$15();
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

    public boolean isFirstArticle() {
        return this.pagesStack.size() > 0 && (this.pagesStack.get(0) instanceof TLRPC.WebPage);
    }

    public boolean isLastArticle() {
        if (this.pagesStack.isEmpty()) {
            return false;
        }
        Object objM = zzin.m(1, this.pagesStack);
        if (!(objM instanceof TLRPC.WebPage)) {
            return false;
        }
        TL_iv.Page page = ((TLRPC.WebPage) objM).cached_page;
        return page == null || page.local == null;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public boolean open(MessageObject messageObject) {
        return open(messageObject, null, null, null, null);
    }

    public void openBookmark(String str) {
        if (this.parentActivity == null || str == null) {
            return;
        }
        this.actionBar.showAddress(false, true);
        if (Browser.isInternalUri(Uri.parse(str), false, null)) {
            Sheet sheet = this.sheet;
            if (sheet != null) {
                sheet.dismiss(true);
            }
            Browser.openAsInternalIntent(this.parentActivity, str, false, false, null);
            return;
        }
        if (Browser.openInExternalApp(this.parentActivity, str, false)) {
            return;
        }
        PageLayout pageLayout = this.pages[0];
        if (pageLayout == null || pageLayout.getWebView() == null) {
            Browser.openInTelegramBrowser(str, null);
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
            Browser.openInTelegramBrowser(entry.url, null);
        } else {
            this.pages[0].getWebView().loadUrl(entry.url, entry.meta);
        }
    }

    @Override
    public boolean openPhoto(TL_iv.PageBlock pageBlock, WebpageAdapter webpageAdapter) {
        List arrayList;
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

    public void openWebSettings() {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            safeLastFragment.showAsSheet(new WebBrowserSettings(new ArticleViewer$$ExternalSyntheticLambda28(this, 2)), bottomSheetParams);
        }
    }

    @Override
    public void openWebpageUrl(String str, String str2, Browser.Progress progress) {
        Activity activity = this.parentActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        PageLayout pageLayout = this.pages[0];
        if (pageLayout == null || !pageLayout.isLocal()) {
            openWebpageUrlInternal(str, str2, progress);
            return;
        }
        String string = LocaleController.getString(R.string.OpenUrlAlert2);
        int iIndexOf = string.indexOf("%");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format(string, str));
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new URLSpan(str), iIndexOf, str.length() + iIndexOf, 33);
        }
        new AlertDialog.Builder(this.parentActivity, 0, getResourcesProvider()).setTitle(LocaleController.getString(R.string.OpenUrlTitle)).setMessage(spannableStringBuilder).setMessageTextViewClickable(false).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Open), new ArticleViewer$$ExternalSyntheticLambda11(0, this, str, str2, progress)).show();
    }

    @Override
    public boolean scrollToAnchor(String str, boolean z) {
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
                BottomSheet bottomSheet = new BottomSheet(this.parentActivity, false, false, null);
                bottomSheet.fixNavigationBar();
                bottomSheet.applyTopPadding = false;
                bottomSheet.applyBottomPadding = false;
                final LinearLayout linearLayout = new LinearLayout(this.parentActivity);
                linearLayout.setOrientation(1);
                TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper();
                this.textSelectionHelperBottomSheet = articleTextSelectionHelper;
                articleTextSelectionHelper.setParentView(linearLayout);
                this.textSelectionHelperBottomSheet.setCallback(new TextSelectionHelper.Callback() {
                    @Override
                    public void onStateChanged(boolean z2) {
                        BottomSheet bottomSheet2 = ArticleViewer.this.linkSheet;
                        if (bottomSheet2 != null) {
                            bottomSheet2.setDisableScroll(z2);
                        }
                    }
                });
                TextView textView = new TextView(this.parentActivity) {
                    @Override
                    public void onDraw(Canvas canvas) {
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
                        if (motionEvent.getAction() != 0 || !ArticleViewer.this.textSelectionHelperBottomSheet.isInSelectionMode() || (motionEvent.getY() >= linearLayout.getTop() && motionEvent.getY() <= linearLayout.getBottom())) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        if (ArticleViewer.this.textSelectionHelperBottomSheet.getOverlayView(getContext()).onTouchEvent(motionEventObtain)) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        return true;
                    }

                    @Override
                    public void onMeasure(int i, int i2) {
                        super.onMeasure(i, i2);
                        super.onMeasure(i, ArticleViewer$10$$ExternalSyntheticOutline0.m(8.0f, linearLayout.getMeasuredHeight(), 1073741824));
                    }
                };
                bottomSheet.setDelegate(new BottomSheet.BottomSheetDelegate() {
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
                bottomSheet.customView = frameLayout;
                if (this.textSelectionHelper.isInSelectionMode()) {
                    this.textSelectionHelper.clear();
                }
                this.linkSheet = bottomSheet;
                showDialog(bottomSheet);
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
                        public int getVerticalSnapPreference() {
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

    public void setParentActivity(Activity activity, BaseFragment baseFragment) {
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
        if (activity2 == activity || !(activity2 == null || !this.isSheet || (sheet = this.sheet) == null || sheet.dialog == null)) {
            updatePaintColors(this);
            refreshThemeColors();
            return;
        }
        this.parentActivity = activity;
        this.selectedFont = ApplicationLoader.applicationContext.getSharedPreferences("articles", 0).getInt("font_type", 0);
        createPaint(this, false);
        this.backgroundPaint = new Paint();
        this.layerShadowDrawable = activity.getResources().getDrawable(R.drawable.layer_shadow);
        this.scrimPaint = new Paint();
        WindowView windowView = new WindowView(activity);
        this.windowView = windowView;
        windowView.setWillNotDraw(false);
        this.windowView.setClipChildren(true);
        this.windowView.setFocusable(false);
        FrameLayout frameLayout = new FrameLayout(activity) {
            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                int i;
                int i2;
                boolean zDrawChild;
                PageLayout[] pageLayoutArr;
                if (ArticleViewer.this.windowView == null || !(ArticleViewer.this.windowView.movingPage || ArticleViewer.this.windowView.openingPage)) {
                    return super.drawChild(canvas, view, j);
                }
                int measuredWidth = getMeasuredWidth();
                int translationX = (int) ArticleViewer.this.pages[0].getTranslationX();
                PageLayout[] pageLayoutArr2 = ArticleViewer.this.pages;
                if (view != pageLayoutArr2[1]) {
                    i = measuredWidth;
                    i2 = view == pageLayoutArr2[0] ? translationX : 0;
                    int iSave = canvas.save();
                    canvas.clipRect(i2, 0, i, getHeight());
                    zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restoreToCount(iSave);
                    if (translationX != 0) {
                        pageLayoutArr = ArticleViewer.this.pages;
                        if (view == pageLayoutArr[0]) {
                            float fMax = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                            ArticleViewer.this.layerShadowDrawable.setBounds(translationX - ArticleViewer.this.layerShadowDrawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                            ArticleViewer.this.layerShadowDrawable.setAlpha((int) (fMax * 255.0f));
                            ArticleViewer.this.layerShadowDrawable.draw(canvas);
                            return zDrawChild;
                        }
                        if (view == pageLayoutArr[1]) {
                            float fMin = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                            ArticleViewer.this.scrimPaint.setColor(((int) ((fMin >= 0.0f ? fMin : 0.0f) * 153.0f)) << 24);
                            canvas.drawRect(i2, 0.0f, i, getHeight(), ArticleViewer.this.scrimPaint);
                        }
                    }
                    return zDrawChild;
                }
                i = translationX;
                int iSave2 = canvas.save();
                canvas.clipRect(i2, 0, i, getHeight());
                zDrawChild = super.drawChild(canvas, view, j);
                canvas.restoreToCount(iSave2);
                if (translationX != 0) {
                    pageLayoutArr = ArticleViewer.this.pages;
                    if (view == pageLayoutArr[0]) {
                        float fMax2 = Math.max(0.0f, Math.min((measuredWidth - translationX) / AndroidUtilities.dp(20.0f), 1.0f));
                        ArticleViewer.this.layerShadowDrawable.setBounds(translationX - ArticleViewer.this.layerShadowDrawable.getIntrinsicWidth(), view.getTop(), translationX, view.getBottom());
                        ArticleViewer.this.layerShadowDrawable.setAlpha((int) (fMax2 * 255.0f));
                        ArticleViewer.this.layerShadowDrawable.draw(canvas);
                        return zDrawChild;
                    }
                    if (view == pageLayoutArr[1]) {
                        float fMin2 = Math.min(0.8f, (measuredWidth - translationX) / measuredWidth);
                        ArticleViewer.this.scrimPaint.setColor(((int) ((fMin2 >= 0.0f ? fMin2 : 0.0f) * 153.0f)) << 24);
                        canvas.drawRect(i2, 0.0f, i, getHeight(), ArticleViewer.this.scrimPaint);
                    }
                }
                return zDrawChild;
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
            this.containerView.setOnApplyWindowInsetsListener(new ArticleViewer$$ExternalSyntheticLambda45());
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
            PageLayout pageLayout = new PageLayout(activity, getResourcesProvider());
            pageLayoutArr[i] = pageLayout;
            pageLayout.setVisibility(i == 0 ? 0 : 8);
            this.containerView.addView(pageLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            pageLayout.listView.setOnItemLongClickListener(new ArticleViewer$$ExternalSyntheticLambda14(this));
            pageLayout.listView.setOnItemClickListener(new WearAuthSheet$$ExternalSyntheticLambda3(19, this, pageLayout));
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
            public WebInstantView.Loader getInstantViewLoader() {
                return ArticleViewer.this.pages[0].loadInstant();
            }

            @Override
            public void onAddressColorsChanged(int i2, int i3) {
                if (ArticleViewer.this.addressBarList != null) {
                    ArticleViewer.this.addressBarList.setColors(i2, i3);
                }
            }

            @Override
            public void onAddressingProgress(float f) {
                BackDrawable backDrawable = this.backButtonDrawable;
                backDrawable.color = ColorUtils.blendARGB(this.addressingProgress, this.textColor, this.addressTextColor);
                backDrawable.invalidateSelf();
                BackDrawable backDrawable2 = this.backButtonDrawable;
                backDrawable2.rotatedColor = ColorUtils.blendARGB(this.addressingProgress, this.textColor, this.addressTextColor);
                backDrawable2.invalidateSelf();
                this.backButton.invalidate();
                if (ArticleViewer.this.addressBarList != null) {
                    ArticleViewer.this.addressBarList.setOpenProgress(f);
                }
                Sheet sheet3 = ArticleViewer.this.sheet;
                if (sheet3 != null) {
                    sheet3.checkNavColor();
                }
            }

            @Override
            public void onColorsUpdated() {
                Sheet sheet3 = ArticleViewer.this.sheet;
                if (sheet3 != null) {
                    sheet3.checkNavColor();
                }
            }

            @Override
            public void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                ((ViewGroup.MarginLayoutParams) ArticleViewer.this.addressBarList.getLayoutParams()).topMargin = getMeasuredHeight();
            }

            public void onOpenedMenu() {
                ArticleViewer.this.pages[0].listView.stopScroll();
                ArticleViewer.this.checkScrollAnimated();
            }

            @Override
            public void onScrolledProgress(float f) {
                ArticleViewer.this.pages[0].addProgress(f);
            }

            @Override
            public void onSearchUpdated(String str) {
                ArticleViewer.this.processSearch(str.toLowerCase());
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
        this.actionBar.setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda53(0, this, activity));
        this.actionBar.addressEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                if (ArticleViewer.this.actionBar.isAddressing() && ArticleViewer.this.addressBarList != null) {
                    ArticleViewer.this.addressBarList.setInput(editable == null ? null : editable.toString());
                }
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        AddressBarList addressBarList = new AddressBarList(activity);
        this.addressBarList = addressBarList;
        addressBarList.setOpenProgress(0.0f);
        addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                if (ArticleViewer.this.addressBarList.listView.scrollingByUser) {
                    AndroidUtilities.hideKeyboard(ArticleViewer.this.actionBar.addressEditText);
                }
            }
        });
        this.containerView.addView(this.addressBarList, LayoutHelper.createFrame(-1, -1.0f));
        this.lineProgressTickRunnable = new ArticleViewer$$ExternalSyntheticLambda9(this, 7);
        int i2 = 3;
        this.actionBar.backButton.setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda15(this, i2));
        this.actionBar.backButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda83(this, i2));
        this.actionBar.setMenuListener(new OAuthSheet$$ExternalSyntheticLambda1(11, this, activity));
        this.actionBar.forwardButton.setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda15(this, 4));
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
        frameLayout5.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(0));
        this.searchPanel.setWillNotDraw(false);
        this.searchPanel.setTranslationY(AndroidUtilities.dp(51.0f));
        this.searchPanel.setVisibility(4);
        this.searchPanel.setFocusable(true);
        this.searchPanel.setFocusableInTouchMode(true);
        this.searchPanel.setClickable(true);
        this.searchPanel.setPadding(0, AndroidUtilities.dp(3.0f), 0, 0);
        this.containerView.addView(this.searchPanel, LayoutHelper.createFrame(-1, 51, 80));
        new KeyboardNotifier(this.windowView, false, new ArticleViewer$$ExternalSyntheticLambda28(this, 3));
        ImageView imageView = new ImageView(this.parentActivity);
        this.searchUpButton = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.searchUpButton.setImageResource(R.drawable.msg_go_up);
        ImageView imageView2 = this.searchUpButton;
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        int themedColor = getThemedColor(i3);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        ImageView imageView3 = this.searchUpButton;
        int i4 = Theme.key_actionBarActionModeDefaultSelector;
        imageView3.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i4), 1, -1));
        this.searchPanel.addView(this.searchUpButton, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        this.searchUpButton.setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda15(this, 1));
        this.searchUpButton.setContentDescription(LocaleController.getString(R.string.AccDescrSearchNext));
        ImageView imageView4 = new ImageView(this.parentActivity);
        this.searchDownButton = imageView4;
        imageView4.setScaleType(scaleType);
        this.searchDownButton.setImageResource(R.drawable.msg_go_down);
        this.searchDownButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), mode));
        this.searchDownButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i4), 1, -1));
        this.searchPanel.addView(this.searchDownButton, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        this.searchDownButton.setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda15(this, 2));
        this.searchDownButton.setContentDescription(LocaleController.getString(R.string.AccDescrSearchPrev));
        AnimatedTextView animatedTextView = new AnimatedTextView(this.parentActivity, true, true, true);
        this.searchCountText = animatedTextView;
        animatedTextView.setScaleProperty(0.6f);
        this.searchCountText.setAnimationProperties(0.4f, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.searchCountText.setTextColor(getThemedColor(i3));
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
        int color = this.sheet == null ? Theme.getColor(null, Theme.key_windowBackgroundGray, true) : getThemedColor(Theme.key_windowBackgroundGray);
        int i5 = (AndroidUtilities.computePerceivedBrightness(color) < 0.721f || Build.VERSION.SDK_INT < 26) ? 1792 : 1808;
        this.navigationBarPaint.setColor(color);
        WindowManager.LayoutParams layoutParams2 = this.windowLayoutParams;
        layoutParams2.systemUiVisibility = i5;
        layoutParams2.flags |= -2147417856;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams2.layoutInDisplayCutoutMode = 1;
        }
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = new TextSelectionHelper.ArticleTextSelectionHelper();
        this.textSelectionHelper = articleTextSelectionHelper;
        articleTextSelectionHelper.setParentView(this.pages[0].listView);
        if (MessagesController.getInstance(this.currentAccount).getTranslateController().isContextTranslateEnabled()) {
            this.textSelectionHelper.setOnTranslate(new ArticleViewer$$ExternalSyntheticLambda14(this));
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
                    ArticleViewer$21$$ExternalSyntheticOutline0.m(BulletinFactory.of(ArticleViewer.this.containerView, null), R.string.TextCopied);
                }
            }
        });
        this.containerView.addView(this.textSelectionHelper.getOverlayView(activity));
        FrameLayout frameLayout6 = this.containerView;
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper(frameLayout6, frameLayout6);
        this.pinchToZoomHelper = pinchToZoomHelper;
        pinchToZoomHelper.setClipBoundsListener(new ArticleViewer$$ExternalSyntheticLambda14(this));
        this.pinchToZoomHelper.setCallback(new PinchToZoomHelper.Callback() {
            @Override
            public final TextureView getCurrentTextureView() {
                return PinchToZoomHelper.Callback.CC.$default$getCurrentTextureView(this);
            }

            @Override
            public final void onZoomFinished(MessageObject messageObject) {
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
            this.visibleDialog.setOnDismissListener(new ArticleViewer$$ExternalSyntheticLambda2(this, 1));
            dialog.show();
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void showSearchPanel(final boolean z) {
        int i = 0;
        this.searchPanel.setVisibility(0);
        ValueAnimator valueAnimator = this.searchPanelAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.searchPanelAlpha, z ? 1.0f : 0.0f);
        this.searchPanelAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ArticleViewer$$ExternalSyntheticLambda21(this, i));
        this.searchPanelAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ArticleViewer.this.searchPanelAlpha = z ? 1.0f : 0.0f;
                ArticleViewer.this.searchPanel.setTranslationY(((1.0f - ArticleViewer.this.searchPanelAlpha) * AndroidUtilities.dp(51.0f)) + ArticleViewer.this.searchPanelTranslation);
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

    public void startCheckLongPress(float f, float f2, View view) {
        TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
        if (this.checkingForLongPress) {
            return;
        }
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
                this.actionBar.forwardButtonDrawable.setState();
                this.actionBar.setBackButtonCached(fLerp > 0.5f);
            } else {
                this.actionBar.forwardButtonDrawable.setState();
                this.actionBar.setBackButtonCached(false);
            }
            this.actionBar.setHasForward(this.pages[0].hasForwardButton());
            this.actionBar.setIsLocal(this.pages[0].isLocal());
            this.actionBar.setIsLoaded(this.pages[0].getWebView() != null && this.pages[0].getWebView().isPageLoaded);
        }
        this.actionBar.setBackgroundColor(0, this.page0Background.set(this.pages[0].getActionBarColor(), this.windowView.movingPage || this.windowView.openingPage));
        this.actionBar.setBackgroundColor(1, this.page1Background.set(this.pages[1].getActionBarColor(), this.windowView.movingPage || this.windowView.openingPage));
        this.actionBar.setColors(ColorUtils.blendARGB(f, this.pages[0].getActionBarColor(), this.pages[1].getActionBarColor()), false);
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

    public void updateTitle(boolean z) {
        this.actionBar.setTitle(0, this.pages[0].getTitle(), z);
        this.actionBar.setSubtitle(0, this.pages[0].getSubtitle(), false);
        this.actionBar.setIsDangerous(0, this.pages[0].isWeb() && this.pages[0].getWebView() != null && this.pages[0].getWebView().dangerousUrl, false);
        this.actionBar.setTitle(1, this.pages[1].getTitle(), z);
        this.actionBar.setSubtitle(1, this.pages[1].getSubtitle(), false);
        this.actionBar.setIsDangerous(1, this.pages[1].isWeb() && this.pages[1].getWebView() != null && this.pages[1].getWebView().dangerousUrl, false);
    }

    public static final class WebPageUtils {
        private WebPageUtils() {
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

        private static File getExistingPathToAttach(TLObject tLObject) {
            FileLoader fileLoader = FileLoader.getInstance(UserConfig.selectedAccount);
            File pathToAttach = fileLoader.getPathToAttach(tLObject, false);
            if (pathToAttach != null && pathToAttach.exists()) {
                return pathToAttach;
            }
            File pathToAttach2 = fileLoader.getPathToAttach(tLObject, true);
            return ((pathToAttach2 == null || !pathToAttach2.exists()) && pathToAttach != null) ? pathToAttach : pathToAttach2;
        }

        public static TLObject getMedia(TLObject tLObject, TL_iv.PageBlock pageBlock) {
            if (tLObject instanceof TL_iv.RichMessage) {
                return getMedia((TL_iv.RichMessage) tLObject, pageBlock);
            }
            if (tLObject instanceof TLRPC.WebPage) {
                return getMedia((TLRPC.WebPage) tLObject, pageBlock);
            }
            return null;
        }

        public static File getMediaFile(TLObject tLObject, TL_iv.PageBlock pageBlock) {
            if (tLObject instanceof TL_iv.RichMessage) {
                return getMediaFile((TL_iv.RichMessage) tLObject, pageBlock);
            }
            if (tLObject instanceof TLRPC.WebPage) {
                return getMediaFile((TLRPC.WebPage) tLObject, pageBlock);
            }
            return null;
        }

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

        public static boolean isVideo(TLObject tLObject, long j) {
            if (tLObject instanceof TL_iv.RichMessage) {
                return isVideo((TL_iv.RichMessage) tLObject, j);
            }
            if (tLObject instanceof TLRPC.WebPage) {
                return isVideo((TLRPC.WebPage) tLObject, j);
            }
            return false;
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

        public static TLObject getMedia(TL_iv.RichMessage richMessage, TL_iv.PageBlock pageBlock) {
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                return getPhotoWithId(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return getDocumentWithId(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
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
                return getExistingPathToAttach(closestPhotoSizeWithSize);
            }
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentWithId = getDocumentWithId(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return null;
            }
            return getExistingPathToAttach(documentWithId);
        }

        public static boolean isVideo(TL_iv.RichMessage richMessage, TL_iv.PageBlock pageBlock) {
            TLRPC.Document documentWithId;
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentWithId = getDocumentWithId(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return false;
            }
            return MessageObject.isVideoDocument(documentWithId);
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

        public static boolean isVideo(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
            TLRPC.Document documentWithId;
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentWithId = getDocumentWithId(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return false;
            }
            return MessageObject.isVideoDocument(documentWithId);
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

        public static File getMediaFile(TL_iv.RichMessage richMessage, TL_iv.PageBlock pageBlock) {
            TLRPC.Document documentWithId;
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TLRPC.Photo photoWithId = getPhotoWithId(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (photoWithId == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoWithId.sizes, AndroidUtilities.getPhotoSize())) == null) {
                    return null;
                }
                return getExistingPathToAttach(closestPhotoSizeWithSize);
            }
            if (!(pageBlock instanceof TL_iv.pageBlockVideo) || (documentWithId = getDocumentWithId(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) == null) {
                return null;
            }
            return getExistingPathToAttach(documentWithId);
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
        private ArrayList<TL_iv.PageBlock> localBlocks = new ArrayList<>();
        private ArrayList<TL_iv.PageBlock> blocks = new ArrayList<>();
        private ArrayList<TL_iv.PageBlock> photoBlocks = new ArrayList<>();
        private HashMap<String, Integer> anchors = new HashMap<>();
        private HashMap<String, Integer> anchorsOffset = new HashMap<>();
        private HashMap<String, TL_iv.textAnchor> anchorsParent = new HashMap<>();
        private HashMap<TL_iv.pageBlockAudio, MessageObject> audioBlocks = new HashMap<>();
        private ArrayList<MessageObject> audioMessages = new ArrayList<>();
        private HashMap<Object, TL_iv.PageBlock> textToBlocks = new HashMap<>();
        private ArrayList<Object> textBlocks = new ArrayList<>();
        private HashMap<String, Integer> searchTextOffset = new HashMap<>();
        private final Runnable calculateContentHeightRunnable = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 26);

        public WebpageAdapter(Context context, boolean z) {
            this.context = context;
            this.padding = z;
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
            if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockCover) {
                    addAllMediaFromBlock(webpageAdapter, ((TL_iv.pageBlockCover) pageBlock).cover);
                    return;
                }
                return;
            }
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            int size2 = pageblockcollage.items.size();
            while (i < size2) {
                TL_iv.PageBlock pageBlock3 = pageblockcollage.items.get(i);
                pageBlock3.groupId = ArticleViewer.this.lastBlockNum;
                addAllMediaFromBlock(webpageAdapter, pageBlock3);
                i++;
            }
            ArticleViewer.access$9208(ArticleViewer.this);
        }

        public void addBlock(WebpageAdapter webpageAdapter, TL_iv.PageBlock pageBlock, int i, int i2, int i3) {
            WebpageAdapter webpageAdapter2;
            Object obj;
            Object obj2;
            TL_iv.PageBlock pageBlockFixListBlock;
            TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks;
            int size;
            int i4;
            TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem;
            WebpageAdapter webpageAdapter3;
            Object obj3;
            int i5;
            TL_iv.PageBlock pageBlockFixListBlock2;
            WebpageAdapter webpageAdapter4 = this;
            WebpageAdapter webpageAdapter5 = webpageAdapter;
            int i6 = 0;
            int i7 = 1;
            boolean z = pageBlock instanceof TL_pageBlockDetailsChild;
            TL_iv.PageBlock pageBlock2 = z ? ((TL_pageBlockDetailsChild) pageBlock).block : pageBlock;
            if (!(pageBlock2 instanceof TL_iv.pageBlockList) && !(pageBlock2 instanceof TL_iv.pageBlockOrderedList)) {
                webpageAdapter4.setRichTextParents(pageBlock2);
                webpageAdapter4.addAllMediaFromBlock(webpageAdapter5, pageBlock2);
            }
            TL_iv.PageBlock lastNonListPageBlock = ArticleViewer.this.getLastNonListPageBlock(pageBlock2);
            if (lastNonListPageBlock instanceof TL_iv.pageBlockUnsupported) {
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockAnchor) {
                webpageAdapter4.anchors.put(((TL_iv.pageBlockAnchor) lastNonListPageBlock).name.toLowerCase(), Integer.valueOf(webpageAdapter4.blocks.size()));
                return;
            }
            if ((lastNonListPageBlock instanceof TL_iv.pageBlockTitle) || (lastNonListPageBlock instanceof TL_iv.pageBlockHeader) || ArticleViewer.isHeadingBlock(lastNonListPageBlock)) {
                String strReplaceAll = ArticleViewer.getPlainText(lastNonListPageBlock.text).toString().toLowerCase().replaceAll("[\\[\\]\\(\\)\\{\\}]", "").replaceAll(" ", "-");
                if (!webpageAdapter4.anchors.containsKey(strReplaceAll)) {
                    webpageAdapter4.anchors.put(strReplaceAll, Integer.valueOf(webpageAdapter4.blocks.size()));
                }
            }
            boolean z2 = lastNonListPageBlock instanceof TL_iv.pageBlockList;
            if (!z2 && !(lastNonListPageBlock instanceof TL_iv.pageBlockOrderedList)) {
                webpageAdapter4.blocks.add(pageBlock);
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockAudio) {
                TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) lastNonListPageBlock;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                int i8 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                lastNonListPageBlock.mid = i8;
                tL_message.id = i8;
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
                tL_messageMediaDocument.webpage = webpageAdapter4.currentPage;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = webpageAdapter4.getDocumentWithId(pageblockaudio.audio_id);
                tL_message.flags |= 768;
                MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, true);
                webpageAdapter4.audioMessages.add(messageObject);
                webpageAdapter4.audioBlocks.put(pageblockaudio, messageObject);
                String musicAuthor = messageObject.getMusicAuthor(false);
                String musicTitle = messageObject.getMusicTitle(false);
                if (TextUtils.isEmpty(musicTitle) && TextUtils.isEmpty(musicAuthor)) {
                    return;
                }
                if (!TextUtils.isEmpty(musicTitle) && !TextUtils.isEmpty(musicAuthor)) {
                    webpageAdapter4.addTextBlock(zzjx.m(musicAuthor, " - ", musicTitle), lastNonListPageBlock);
                    return;
                } else if (TextUtils.isEmpty(musicTitle)) {
                    webpageAdapter4.addTextBlock(musicAuthor, lastNonListPageBlock);
                    return;
                } else {
                    webpageAdapter4.addTextBlock(musicTitle, lastNonListPageBlock);
                    return;
                }
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) lastNonListPageBlock;
                if (pageblockblockquoteblocks.blocks.isEmpty()) {
                    return;
                }
                int iMax = Math.max(0, lastNonListPageBlock.level);
                int i9 = lastNonListPageBlock.quoteLevels;
                boolean z3 = (i9 == 0 && lastNonListPageBlock.level <= 0) || lastNonListPageBlock.bottom;
                lastNonListPageBlock.level = -1;
                int size2 = pageblockblockquoteblocks.blocks.size();
                int i10 = 0;
                while (i10 < size2) {
                    TL_iv.PageBlock pageBlock3 = pageblockblockquoteblocks.blocks.get(i10);
                    if (!(pageBlock3 instanceof TL_iv.pageBlockUnsupported)) {
                        if (pageBlock3 instanceof TL_iv.pageBlockAnchor) {
                            webpageAdapter4.anchors.put(((TL_iv.pageBlockAnchor) pageBlock3).name.toLowerCase(), Integer.valueOf(webpageAdapter4.blocks.size()));
                        } else {
                            pageBlock3.level = iMax + 1;
                            pageBlock3.quoteLevels = (1 << iMax) | i9;
                            pageBlock3.bottom = i10 == size2 + (-1) && z3;
                            webpageAdapter4.addBlock(webpageAdapter5, pageBlock3, i, i2, i3);
                        }
                    }
                    i10++;
                }
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockEmbedPost) {
                TL_iv.pageBlockEmbedPost pageblockembedpost = (TL_iv.pageBlockEmbedPost) lastNonListPageBlock;
                if (pageblockembedpost.blocks.isEmpty()) {
                    return;
                }
                lastNonListPageBlock.level = -1;
                while (i6 < pageblockembedpost.blocks.size()) {
                    TL_iv.PageBlock pageBlock4 = pageblockembedpost.blocks.get(i6);
                    if (!(pageBlock4 instanceof TL_iv.pageBlockUnsupported)) {
                        if (pageBlock4 instanceof TL_iv.pageBlockAnchor) {
                            webpageAdapter4.anchors.put(((TL_iv.pageBlockAnchor) pageBlock4).name.toLowerCase(), Integer.valueOf(webpageAdapter4.blocks.size()));
                        } else {
                            pageBlock4.level = 1;
                            if (i6 == pageblockembedpost.blocks.size() - 1) {
                                pageBlock4.bottom = true;
                            }
                            webpageAdapter4.blocks.add(pageBlock4);
                            webpageAdapter4.addAllMediaFromBlock(webpageAdapter5, pageBlock4);
                        }
                    }
                    i6++;
                }
                if (TextUtils.isEmpty(ArticleViewer.getPlainText(pageblockembedpost.caption.text)) && TextUtils.isEmpty(ArticleViewer.getPlainText(pageblockembedpost.caption.credit))) {
                    return;
                }
                TL_pageBlockEmbedPostCaption tL_pageBlockEmbedPostCaption = new TL_pageBlockEmbedPostCaption();
                tL_pageBlockEmbedPostCaption.parent = pageblockembedpost;
                tL_pageBlockEmbedPostCaption.caption = pageblockembedpost.caption;
                webpageAdapter4.blocks.add(tL_pageBlockEmbedPostCaption);
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = (TL_iv.pageBlockRelatedArticles) lastNonListPageBlock;
                TL_pageBlockRelatedArticlesShadow tL_pageBlockRelatedArticlesShadow = new TL_pageBlockRelatedArticlesShadow();
                tL_pageBlockRelatedArticlesShadow.parent = pageblockrelatedarticles;
                ArrayList<TL_iv.PageBlock> arrayList = webpageAdapter4.blocks;
                arrayList.add(arrayList.size() - 1, tL_pageBlockRelatedArticlesShadow);
                int size3 = pageblockrelatedarticles.articles.size();
                while (i6 < size3) {
                    TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = new TL_pageBlockRelatedArticlesChild();
                    tL_pageBlockRelatedArticlesChild.parent = pageblockrelatedarticles;
                    tL_pageBlockRelatedArticlesChild.num = i6;
                    webpageAdapter4.blocks.add(tL_pageBlockRelatedArticlesChild);
                    i6++;
                }
                if (i3 == 0) {
                    TL_pageBlockRelatedArticlesShadow tL_pageBlockRelatedArticlesShadow2 = new TL_pageBlockRelatedArticlesShadow();
                    tL_pageBlockRelatedArticlesShadow2.parent = pageblockrelatedarticles;
                    webpageAdapter4.blocks.add(tL_pageBlockRelatedArticlesShadow2);
                    return;
                }
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) lastNonListPageBlock;
                int size4 = pageblockdetails.blocks.size();
                while (i6 < size4) {
                    TL_pageBlockDetailsChild tL_pageBlockDetailsChild = new TL_pageBlockDetailsChild();
                    tL_pageBlockDetailsChild.parent = pageBlock;
                    tL_pageBlockDetailsChild.block = pageblockdetails.blocks.get(i6);
                    webpageAdapter4.addBlock(webpageAdapter5, ArticleViewer.this.wrapInTableBlock(pageBlock, tL_pageBlockDetailsChild), i + 1, i2, i3);
                    i6++;
                    webpageAdapter5 = webpageAdapter;
                }
                return;
            }
            if (z2) {
                TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) lastNonListPageBlock;
                TL_pageBlockListParent tL_pageBlockListParent = new TL_pageBlockListParent();
                tL_pageBlockListParent.pageBlockList = pageblocklist;
                tL_pageBlockListParent.level = i2;
                int size5 = pageblocklist.items.size();
                int i11 = 0;
                while (i11 < size5) {
                    TL_iv.PageListItem pageListItem = pageblocklist.items.get(i11);
                    TL_pageBlockListItem tL_pageBlockListItem = new TL_pageBlockListItem();
                    tL_pageBlockListItem.index = i11;
                    tL_pageBlockListItem.parent = tL_pageBlockListParent;
                    if (!pageblocklist.ordered) {
                        webpageAdapter3 = webpageAdapter4;
                        tL_pageBlockListItem.num = "•";
                    } else if (webpageAdapter3.isRtl) {
                        webpageAdapter3 = webpageAdapter4;
                        Object[] objArr = new Object[i7];
                        objArr[0] = Integer.valueOf(i11 + 1);
                        tL_pageBlockListItem.num = String.format(".%d", objArr);
                    } else {
                        webpageAdapter3 = webpageAdapter4;
                        Object[] objArr2 = new Object[i7];
                        objArr2[0] = Integer.valueOf(i11 + 1);
                        tL_pageBlockListItem.num = String.format("%d.", objArr2);
                    }
                    tL_pageBlockListParent.items.add(tL_pageBlockListItem);
                    if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                        TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                        tL_pageBlockListItem.textItem = tL_pageListItemText.text;
                        tL_pageBlockListItem.isCheckbox = tL_pageListItemText.checkbox;
                        tL_pageBlockListItem.checked = tL_pageListItemText.checked;
                        obj3 = pageListItem;
                    } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                        tL_pageBlockListItem.isCheckbox = tL_pageListItemBlocks.checkbox;
                        tL_pageBlockListItem.checked = tL_pageListItemBlocks.checked;
                        if (tL_pageListItemBlocks.blocks.isEmpty()) {
                            obj3 = pageListItem;
                            TL_iv.TL_pageListItemText tL_pageListItemText2 = new TL_iv.TL_pageListItemText();
                            TL_iv.textPlain textplain = new TL_iv.textPlain();
                            textplain.text = " ";
                            tL_pageListItemText2.text = textplain;
                            obj3 = tL_pageListItemText2;
                        } else {
                            obj3 = pageListItem;
                            tL_pageBlockListItem.blockItem = tL_pageListItemBlocks.blocks.get(0);
                            obj3 = pageListItem;
                        }
                    }
                    obj3 = pageListItem;
                    Object obj4 = obj3;
                    if (z) {
                        TL_pageBlockDetailsChild tL_pageBlockDetailsChild2 = new TL_pageBlockDetailsChild();
                        tL_pageBlockDetailsChild2.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                        tL_pageBlockDetailsChild2.block = tL_pageBlockListItem;
                        i5 = i11;
                        webpageAdapter3.addBlock(webpageAdapter, tL_pageBlockDetailsChild2, i, i2 + 1, i3);
                    } else {
                        i5 = i11;
                        if (i5 == 0) {
                            pageBlockFixListBlock2 = tL_pageBlockListItem;
                            pageBlockFixListBlock2 = ArticleViewer.this.fixListBlock(pageBlock, tL_pageBlockListItem);
                        }
                        pageBlockFixListBlock2 = tL_pageBlockListItem;
                        webpageAdapter3.addBlock(webpageAdapter, pageBlockFixListBlock2, i, i2 + 1, i3);
                    }
                    if (obj4 instanceof TL_iv.TL_pageListItemBlocks) {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks2 = (TL_iv.TL_pageListItemBlocks) obj4;
                        int i12 = 1;
                        for (int size6 = tL_pageListItemBlocks2.blocks.size(); i12 < size6; size6 = size6) {
                            TL_pageBlockListItem tL_pageBlockListItem2 = new TL_pageBlockListItem();
                            tL_pageBlockListItem2.blockItem = tL_pageListItemBlocks2.blocks.get(i12);
                            tL_pageBlockListItem2.parent = tL_pageBlockListParent;
                            if (z) {
                                TL_pageBlockDetailsChild tL_pageBlockDetailsChild3 = new TL_pageBlockDetailsChild();
                                tL_pageBlockDetailsChild3.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                                tL_pageBlockDetailsChild3.block = tL_pageBlockListItem2;
                                addBlock(webpageAdapter, tL_pageBlockDetailsChild3, i, i2 + 1, i3);
                                tL_pageBlockListItem2 = tL_pageBlockListItem2;
                            } else {
                                addBlock(webpageAdapter, tL_pageBlockListItem2, i, i2 + 1, i3);
                            }
                            tL_pageBlockListParent.items.add(tL_pageBlockListItem2);
                            i12++;
                        }
                    }
                    webpageAdapter3 = this;
                    i11 = i5 + 1;
                    tL_pageBlockListParent = tL_pageBlockListParent;
                    size5 = size5;
                    i7 = 1;
                }
                webpageAdapter3 = webpageAdapter4;
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockOrderedList) {
                TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) lastNonListPageBlock;
                TL_pageBlockOrderedListParent tL_pageBlockOrderedListParent = new TL_pageBlockOrderedListParent();
                tL_pageBlockOrderedListParent.pageBlockOrderedList = pageblockorderedlist;
                tL_pageBlockOrderedListParent.level = i2;
                int size7 = pageblockorderedlist.items.size();
                int i13 = 0;
                while (i13 < size7) {
                    TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i13);
                    TL_pageBlockOrderedListItem tL_pageBlockOrderedListItem2 = new TL_pageBlockOrderedListItem();
                    tL_pageBlockOrderedListItem2.index = i13;
                    tL_pageBlockOrderedListItem2.parent = tL_pageBlockOrderedListParent;
                    tL_pageBlockOrderedListParent.items.add(tL_pageBlockOrderedListItem2);
                    if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                        TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                        tL_pageBlockOrderedListItem2.textItem = tL_pageListOrderedItemText.text;
                        tL_pageBlockOrderedListItem2.isCheckbox = tL_pageListOrderedItemText.checkbox;
                        tL_pageBlockOrderedListItem2.checked = tL_pageListOrderedItemText.checked;
                        if (TextUtils.isEmpty(tL_pageListOrderedItemText.num)) {
                            if (webpageAdapter2.isRtl) {
                                webpageAdapter2 = webpageAdapter4;
                                tL_pageBlockOrderedListItem2.num = String.format(".%d", Integer.valueOf(i13 + 1));
                            } else {
                                webpageAdapter2 = webpageAdapter4;
                                tL_pageBlockOrderedListItem2.num = String.format("%d.", Integer.valueOf(i13 + 1));
                            }
                            obj2 = pageListOrderedItem;
                            if (z) {
                                obj2 = obj;
                                obj2 = obj;
                                obj2 = obj;
                                obj2 = obj;
                                TL_pageBlockDetailsChild tL_pageBlockDetailsChild4 = new TL_pageBlockDetailsChild();
                                tL_pageBlockDetailsChild4.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                                tL_pageBlockDetailsChild4.block = tL_pageBlockOrderedListItem2;
                                webpageAdapter2.addBlock(webpageAdapter, tL_pageBlockDetailsChild4, i, i2 + 1, i3);
                            } else {
                                obj2 = obj;
                                obj2 = obj;
                                obj2 = obj;
                                obj2 = obj;
                                if (i13 == 0) {
                                    pageBlockFixListBlock = tL_pageBlockOrderedListItem2;
                                    pageBlockFixListBlock = ArticleViewer.this.fixListBlock(pageBlock, tL_pageBlockOrderedListItem2);
                                }
                                pageBlockFixListBlock = tL_pageBlockOrderedListItem2;
                                webpageAdapter2.addBlock(webpageAdapter, pageBlockFixListBlock, i, i2 + 1, i3);
                            }
                            if (obj2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                                tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) obj2;
                                i4 = 1;
                                for (size = tL_pageListOrderedItemBlocks.blocks.size(); i4 < size; size = size) {
                                    tL_pageBlockOrderedListItem = new TL_pageBlockOrderedListItem();
                                    tL_pageBlockOrderedListItem.blockItem = tL_pageListOrderedItemBlocks.blocks.get(i4);
                                    tL_pageBlockOrderedListItem.parent = tL_pageBlockOrderedListParent;
                                    if (z) {
                                        TL_pageBlockDetailsChild tL_pageBlockDetailsChild5 = new TL_pageBlockDetailsChild();
                                        tL_pageBlockDetailsChild5.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                                        tL_pageBlockDetailsChild5.block = tL_pageBlockOrderedListItem;
                                        addBlock(webpageAdapter, tL_pageBlockDetailsChild5, i, i2 + 1, i3);
                                        tL_pageBlockOrderedListItem = tL_pageBlockOrderedListItem;
                                    } else {
                                        addBlock(webpageAdapter, tL_pageBlockOrderedListItem, i, i2 + 1, i3);
                                    }
                                    tL_pageBlockOrderedListParent.items.add(tL_pageBlockOrderedListItem);
                                    i4++;
                                }
                            }
                            i13++;
                            webpageAdapter2 = this;
                            pageblockorderedlist = pageblockorderedlist;
                        } else if (webpageAdapter2.isRtl) {
                            webpageAdapter2 = webpageAdapter4;
                            tL_pageBlockOrderedListItem2.num = "." + tL_pageListOrderedItemText.num;
                        } else {
                            webpageAdapter2 = webpageAdapter4;
                            tL_pageBlockOrderedListItem2.num = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), tL_pageListOrderedItemText.num, ".");
                        }
                    } else {
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks2 = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                            tL_pageBlockOrderedListItem2.isCheckbox = tL_pageListOrderedItemBlocks2.checkbox;
                            tL_pageBlockOrderedListItem2.checked = tL_pageListOrderedItemBlocks2.checked;
                            if (tL_pageListOrderedItemBlocks2.blocks.isEmpty()) {
                                webpageAdapter2 = webpageAdapter4;
                                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText2 = new TL_iv.TL_pageListOrderedItemText();
                                TL_iv.textPlain textplain2 = new TL_iv.textPlain();
                                textplain2.text = " ";
                                tL_pageListOrderedItemText2.text = textplain2;
                                obj = tL_pageListOrderedItemText2;
                            } else {
                                webpageAdapter2 = webpageAdapter4;
                                tL_pageBlockOrderedListItem2.blockItem = tL_pageListOrderedItemBlocks2.blocks.get(0);
                                obj = pageListOrderedItem;
                            }
                            if (TextUtils.isEmpty(tL_pageListOrderedItemBlocks2.num)) {
                                if (webpageAdapter2.isRtl) {
                                    tL_pageBlockOrderedListItem2.num = String.format(".%d", Integer.valueOf(i13 + 1));
                                } else {
                                    tL_pageBlockOrderedListItem2.num = String.format("%d.", Integer.valueOf(i13 + 1));
                                }
                            } else if (webpageAdapter2.isRtl) {
                                tL_pageBlockOrderedListItem2.num = "." + tL_pageListOrderedItemBlocks2.num;
                            } else {
                                tL_pageBlockOrderedListItem2.num = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), tL_pageListOrderedItemBlocks2.num, ".");
                            }
                        }
                        if (z) {
                            obj2 = obj;
                            obj2 = obj;
                            obj2 = obj;
                            obj2 = obj;
                            TL_pageBlockDetailsChild tL_pageBlockDetailsChild6 = new TL_pageBlockDetailsChild();
                            tL_pageBlockDetailsChild6.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                            tL_pageBlockDetailsChild6.block = tL_pageBlockOrderedListItem2;
                            webpageAdapter2.addBlock(webpageAdapter, tL_pageBlockDetailsChild6, i, i2 + 1, i3);
                        } else {
                            obj2 = obj;
                            obj2 = obj;
                            obj2 = obj;
                            obj2 = obj;
                            if (i13 == 0) {
                                pageBlockFixListBlock = tL_pageBlockOrderedListItem2;
                                pageBlockFixListBlock = ArticleViewer.this.fixListBlock(pageBlock, tL_pageBlockOrderedListItem2);
                            }
                            pageBlockFixListBlock = tL_pageBlockOrderedListItem2;
                            webpageAdapter2.addBlock(webpageAdapter, pageBlockFixListBlock, i, i2 + 1, i3);
                        }
                        if (obj2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) obj2;
                            i4 = 1;
                            while (i4 < size) {
                                tL_pageBlockOrderedListItem = new TL_pageBlockOrderedListItem();
                                tL_pageBlockOrderedListItem.blockItem = tL_pageListOrderedItemBlocks.blocks.get(i4);
                                tL_pageBlockOrderedListItem.parent = tL_pageBlockOrderedListParent;
                                if (z) {
                                    TL_pageBlockDetailsChild tL_pageBlockDetailsChild7 = new TL_pageBlockDetailsChild();
                                    tL_pageBlockDetailsChild7.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                                    tL_pageBlockDetailsChild7.block = tL_pageBlockOrderedListItem;
                                    addBlock(webpageAdapter, tL_pageBlockDetailsChild7, i, i2 + 1, i3);
                                    tL_pageBlockOrderedListItem = tL_pageBlockOrderedListItem;
                                } else {
                                    addBlock(webpageAdapter, tL_pageBlockOrderedListItem, i, i2 + 1, i3);
                                }
                                tL_pageBlockOrderedListParent.items.add(tL_pageBlockOrderedListItem);
                                i4++;
                            }
                        }
                        i13++;
                        webpageAdapter2 = this;
                        pageblockorderedlist = pageblockorderedlist;
                    }
                    webpageAdapter2 = webpageAdapter4;
                    obj2 = pageListOrderedItem;
                    if (z) {
                        obj2 = obj;
                        obj2 = obj;
                        obj2 = obj;
                        obj2 = obj;
                        TL_pageBlockDetailsChild tL_pageBlockDetailsChild8 = new TL_pageBlockDetailsChild();
                        tL_pageBlockDetailsChild8.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                        tL_pageBlockDetailsChild8.block = tL_pageBlockOrderedListItem2;
                        webpageAdapter2.addBlock(webpageAdapter, tL_pageBlockDetailsChild8, i, i2 + 1, i3);
                    } else {
                        obj2 = obj;
                        obj2 = obj;
                        obj2 = obj;
                        obj2 = obj;
                        if (i13 == 0) {
                            pageBlockFixListBlock = tL_pageBlockOrderedListItem2;
                            pageBlockFixListBlock = ArticleViewer.this.fixListBlock(pageBlock, tL_pageBlockOrderedListItem2);
                        }
                        pageBlockFixListBlock = tL_pageBlockOrderedListItem2;
                        webpageAdapter2.addBlock(webpageAdapter, pageBlockFixListBlock, i, i2 + 1, i3);
                    }
                    if (obj2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) obj2;
                        i4 = 1;
                        while (i4 < size) {
                            tL_pageBlockOrderedListItem = new TL_pageBlockOrderedListItem();
                            tL_pageBlockOrderedListItem.blockItem = tL_pageListOrderedItemBlocks.blocks.get(i4);
                            tL_pageBlockOrderedListItem.parent = tL_pageBlockOrderedListParent;
                            if (z) {
                                TL_pageBlockDetailsChild tL_pageBlockDetailsChild9 = new TL_pageBlockDetailsChild();
                                tL_pageBlockDetailsChild9.parent = ((TL_pageBlockDetailsChild) pageBlock).parent;
                                tL_pageBlockDetailsChild9.block = tL_pageBlockOrderedListItem;
                                addBlock(webpageAdapter, tL_pageBlockDetailsChild9, i, i2 + 1, i3);
                                tL_pageBlockOrderedListItem = tL_pageBlockOrderedListItem;
                            } else {
                                addBlock(webpageAdapter, tL_pageBlockOrderedListItem, i, i2 + 1, i3);
                            }
                            tL_pageBlockOrderedListParent.items.add(tL_pageBlockOrderedListItem);
                            i4++;
                        }
                    }
                    i13++;
                    webpageAdapter2 = this;
                    pageblockorderedlist = pageblockorderedlist;
                }
                webpageAdapter2 = webpageAdapter4;
            }
        }

        private void addTextBlock(Object obj, TL_iv.PageBlock pageBlock) {
            if ((obj instanceof TL_iv.textEmpty) || this.textToBlocks.containsKey(obj)) {
                return;
            }
            this.textToBlocks.put(obj, pageBlock);
            this.textBlocks.add(obj);
        }

        public void bindBlockToHolder(int i, RecyclerView.ViewHolder viewHolder, TL_iv.PageBlock pageBlock, int i2, int i3, boolean z) {
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
            if (i == 100) {
                ((TextView) viewHolder.itemView).setText("unsupported block " + pageBlock2);
                return;
            }
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
                    blockPhotoCell.setBlock((TL_iv.pageBlockPhoto) pageBlock2, this.currentPage, null, z, i2 == 0);
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
                    ((BlockRelatedArticlesCell) viewHolder.itemView).setBlock((TL_pageBlockRelatedArticlesChild) pageBlock2, this.currentPage);
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

        public TLRPC.Document getDocumentWithId(long j) {
            return WebPageUtils.getDocumentWithId(this.currentPage, j);
        }

        public TLRPC.Photo getPhotoWithId(long j) {
            return WebPageUtils.getPhotoWithId(this.currentPage, j);
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
            if (pageBlock instanceof TL_pageBlockDetailsBottom) {
                return 27;
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

        public void lambda$new$0(int i, int[] iArr, int[] iArr2) {
            this.fullHeight = i;
            this.itemHeights = iArr;
            this.sumItemHeights = iArr2;
            ArticleViewer.this.updatePages();
        }

        public void lambda$new$1() {
            RecyclerListView recyclerListView;
            WebpageAdapter webpageAdapter = this;
            ArrayList arrayList = new ArrayList(webpageAdapter.localBlocks);
            int size = arrayList.size();
            Sheet sheet = ArticleViewer.this.sheet;
            int i = size + ((sheet == null || !sheet.halfSize()) ? 0 : 1);
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            PageLayout pageLayout = ArticleViewer.this.pages[0];
            if (pageLayout == null || (recyclerListView = pageLayout.listView) == null) {
                return;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                boolean z = webpageAdapter.padding;
                if (z && i2 == 0) {
                    iArr[0] = 0;
                } else {
                    int i4 = z ? i2 - 1 : i2;
                    TL_iv.PageBlock pageBlock = (i4 < 0 || i4 >= arrayList.size()) ? null : (TL_iv.PageBlock) arrayList.get(i4);
                    if (pageBlock == null || pageBlock.cachedHeight == 0 || pageBlock.cachedWidth != View.MeasureSpec.getSize(iMakeMeasureSpec)) {
                        RecyclerView.ViewHolder viewHolderCreateViewHolder = webpageAdapter.createViewHolder(recyclerListView, webpageAdapter.getTypeForBlock(pageBlock));
                        webpageAdapter.bindBlockToHolder(viewHolderCreateViewHolder.getItemViewType(), viewHolderCreateViewHolder, pageBlock, i4, arrayList.size(), true);
                        viewHolderCreateViewHolder.itemView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        int measuredHeight = viewHolderCreateViewHolder.itemView.getMeasuredHeight();
                        iArr[i2] = measuredHeight;
                        if (pageBlock != null) {
                            pageBlock.cachedHeight = measuredHeight;
                            pageBlock.cachedWidth = View.MeasureSpec.getSize(iMakeMeasureSpec);
                        }
                    } else {
                        iArr[i2] = pageBlock.cachedHeight;
                    }
                }
                int i5 = i2 - 1;
                iArr2[i2] = (i5 < 0 ? 0 : iArr2[i5]) + iArr[i2];
                i3 += iArr[i2];
                i2++;
                webpageAdapter = this;
            }
            AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9(this, i3, iArr, iArr2, 5));
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

        public void updateRows() {
            this.localBlocks.clear();
            int size = this.blocks.size();
            for (int i = 0; i < size; i++) {
                TL_iv.PageBlock pageBlock = this.blocks.get(i);
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

        public TL_iv.PageBlock getItem(int i) {
            return this.localBlocks.get(i);
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

        @Override
        public int getItemViewType(int i) {
            TL_iv.Page page;
            if (this.padding) {
                if (i == 0) {
                    return 2147483646;
                }
                i--;
            }
            if (i != this.localBlocks.size()) {
                return getTypeForBlock(this.localBlocks.get(i));
            }
            TLRPC.WebPage webPage = this.currentPage;
            return (webPage == null || (page = webPage.cached_page) == null || !page.web) ? 90 : 91;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 23 || itemViewType == 24;
        }

        @Override
        public void notifyDataSetChanged() {
            updateRows();
            super.notifyDataSetChanged();
        }

        @Override
        public void lambda$onBindViewHolder$31(int i) {
            updateRows();
            super.lambda$onBindViewHolder$31(i);
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
        public void notifyItemRangeChanged(int i, int i2) {
            updateRows();
            super.notifyItemRangeChanged(i, i2);
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

        @Override
        public void notifyItemRemoved(int i) {
            updateRows();
            super.notifyItemRemoved(i);
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
            bindBlockToHolder(viewHolder.getItemViewType(), viewHolder, this.localBlocks.get(i2), i2, this.localBlocks.size(), false);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View blockParagraphCell;
            View blockVideoCell;
            if (i != 2147483646) {
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
                        break;
                }
            } else {
                View view = new View(this.context) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.4f), 1073741824));
                    }
                };
                view.setImportantForAccessibility(2);
                blockParagraphCell = view;
            }
            blockParagraphCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            blockParagraphCell.setFocusable(true);
            return new RecyclerListView.Holder(blockParagraphCell);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 90 || viewHolder.getItemViewType() == 91) {
                ReportCell reportCell = (ReportCell) viewHolder.itemView;
                TL_iv.Page page = this.currentPage.cached_page;
                reportCell.setViews(page != null ? page.views : 0);
            }
        }

        public void resetCachedHeights() {
            for (int i = 0; i < this.localBlocks.size(); i++) {
                TL_iv.PageBlock pageBlock = this.localBlocks.get(i);
                if (pageBlock != null) {
                    pageBlock.cachedWidth = 0;
                    pageBlock.cachedHeight = 0;
                }
            }
            calculateContentHeight();
        }

        @Override
        public void notifyItemChanged(int i, Object obj) {
            updateRows();
            super.notifyItemChanged(i, obj);
        }

        @Override
        public void notifyItemRangeChanged(int i, int i2, Object obj) {
            updateRows();
            super.notifyItemRangeChanged(i, i2, obj);
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
    }

    public class WebpageListView extends RecyclerListView {
        public WebpageListView(Context context) {
            super(context);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            ArticleViewer.this.checkVideoPlayer();
            super.dispatchDraw(canvas);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            MotionEvent motionEvent2;
            ActionBarPopupWindow actionBarPopupWindow;
            ArticleViewer articleViewer = ArticleViewer.this;
            if (articleViewer.pressedLinkOwnerLayout == null || articleViewer.pressedLink != null || (((actionBarPopupWindow = articleViewer.popupWindow) != null && actionBarPopupWindow.isShowing()) || !(motionEvent.getAction() == 1 || motionEvent.getAction() == 3))) {
                ArticleViewer articleViewer2 = ArticleViewer.this;
                if (articleViewer2.pressedLinkOwnerLayout != null && articleViewer2.pressedLink != null && motionEvent.getAction() == 1 && (getAdapter() instanceof WebpageAdapter)) {
                    ArticleViewer articleViewer3 = ArticleViewer.this;
                    WebpageAdapter webpageAdapter = (WebpageAdapter) getAdapter();
                    ArticleViewer articleViewer4 = ArticleViewer.this;
                    motionEvent2 = motionEvent;
                    articleViewer3.checkLayoutForLinks(webpageAdapter, motionEvent2, articleViewer4.pressedLinkOwnerView, articleViewer4.pressedLinkOwnerLayout, 0, 0);
                }
                return super.onInterceptTouchEvent(motionEvent2);
            }
            ArticleViewer articleViewer5 = ArticleViewer.this;
            articleViewer5.pressedLink = null;
            articleViewer5.pressedLinkOwnerLayout = null;
            articleViewer5.pressedLinkOwnerView = null;
            motionEvent2 = motionEvent;
            return super.onInterceptTouchEvent(motionEvent2);
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
        public void onScrolled(int i, int i2) {
            Sheet.WindowView windowView;
            super.onScrolled(i, i2);
            Sheet sheet = ArticleViewer.this.sheet;
            if (sheet == null || (windowView = sheet.windowView) == null) {
                return;
            }
            windowView.invalidate();
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

        public WebpageListView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }
    }

    public static boolean checkLayoutForLinks(IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, MotionEvent motionEvent, View view, DrawingText drawingText, int i, int i2) {
        ActionBarPopupWindow actionBarPopupWindow;
        List<SpoilerEffect> list;
        TextStyleSpan[] textStyleSpanArr;
        int i3;
        Path path;
        Iterator<SpoilerEffect> it;
        float fSqrt;
        Iterator<SpoilerEffect> it2;
        if (!iArticleViewer.allowTouches() || view == null) {
            return false;
        }
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = iArticleViewer.getTextSelectionHelper(view);
        if (textSelectionHelper != null && !textSelectionHelper.isSelectable(view)) {
            return false;
        }
        iArticleViewer.pressedLinkOwnerView = view;
        if (drawingText != null) {
            StaticLayout staticLayout = drawingText.textLayout;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int lineCount = staticLayout.getLineCount();
                float fMin = 2.1474836E9f;
                float fMax = 0.0f;
                for (int i4 = 0; i4 < lineCount; i4++) {
                    fMax = Math.max(staticLayout.getLineWidth(i4), fMax);
                    fMin = Math.min(staticLayout.getLineLeft(i4), fMin);
                }
                float f = x;
                float f2 = i + fMin;
                if (f >= f2 && f <= f2 + fMax && y >= i2 && y <= staticLayout.getHeight() + i2) {
                    iArticleViewer.pressedLinkOwnerLayout = drawingText;
                    iArticleViewer.pressedLayoutY = i2;
                    if (staticLayout.getText() instanceof Spannable) {
                        int i5 = x - i;
                        int i6 = y - i2;
                        try {
                            int lineForVertical = staticLayout.getLineForVertical(i6);
                            float f3 = i5;
                            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f3);
                            float lineLeft = staticLayout.getLineLeft(lineForVertical);
                            if (lineLeft <= f3 && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f3) {
                                Spannable spannable = (Spannable) staticLayout.getText();
                                TextPaintUrlSpan[] textPaintUrlSpanArr = (TextPaintUrlSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, TextPaintUrlSpan.class);
                                if (textPaintUrlSpanArr == null || textPaintUrlSpanArr.length <= 0) {
                                    list = drawingText.spoilers;
                                    if (list != null && !list.isEmpty() && (textStyleSpanArr = (TextStyleSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, TextStyleSpan.class)) != null) {
                                        for (TextStyleSpan textStyleSpan : textStyleSpanArr) {
                                            if (textStyleSpan.isSpoiler()) {
                                                path = new Path();
                                                it = drawingText.spoilers.iterator();
                                                while (it.hasNext()) {
                                                    Rect bounds = it.next().getBounds();
                                                    path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                                                }
                                                RectF rectF = new RectF();
                                                path.computeBounds(rectF, false);
                                                fSqrt = (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width()));
                                                drawingText.spoilers.get(0).onRippleEndCallback = new ArticleViewer$$ExternalSyntheticLambda12(view, drawingText);
                                                it2 = drawingText.spoilers.iterator();
                                                while (it2.hasNext()) {
                                                    it2.next().startRipple(f3, i6, fSqrt, false);
                                                }
                                                view.invalidate();
                                                if (view.getParent() == null) {
                                                    break;
                                                }
                                                view.getParent().requestDisallowInterceptTouchEvent(true);
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    TextPaintUrlSpan textPaintUrlSpan = textPaintUrlSpanArr[0];
                                    int spanStart = spannable.getSpanStart(textPaintUrlSpan);
                                    int spanEnd = spannable.getSpanEnd(textPaintUrlSpan);
                                    int i7 = 1;
                                    while (i7 < textPaintUrlSpanArr.length) {
                                        TextPaintUrlSpan textPaintUrlSpan2 = textPaintUrlSpanArr[i7];
                                        TextPaintUrlSpan[] textPaintUrlSpanArr2 = textPaintUrlSpanArr;
                                        int spanStart2 = spannable.getSpanStart(textPaintUrlSpan2);
                                        int i8 = i7;
                                        int spanEnd2 = spannable.getSpanEnd(textPaintUrlSpan2);
                                        if (spanStart > spanStart2 || spanEnd2 > spanEnd) {
                                            spanStart = spanStart2;
                                            spanEnd = spanEnd2;
                                            textPaintUrlSpan = textPaintUrlSpan2;
                                        }
                                        i7 = i8 + 1;
                                        textPaintUrlSpanArr = textPaintUrlSpanArr2;
                                    }
                                    LinkSpanDrawable<TextPaintUrlSpan> linkSpanDrawable = iArticleViewer.pressedLink;
                                    if (linkSpanDrawable == null || linkSpanDrawable.getSpan() != textPaintUrlSpan) {
                                        LinkSpanDrawable<TextPaintUrlSpan> linkSpanDrawable2 = iArticleViewer.pressedLink;
                                        if (linkSpanDrawable2 != null) {
                                            iArticleViewer.links.removeLink(linkSpanDrawable2);
                                        }
                                        LinkSpanDrawable<TextPaintUrlSpan> linkSpanDrawable3 = new LinkSpanDrawable<>(textPaintUrlSpan, null, f, y);
                                        iArticleViewer.pressedLink = linkSpanDrawable3;
                                        linkSpanDrawable3.setColor(iArticleViewer.getThemedColor(Theme.key_windowBackgroundWhiteLinkSelection) & 872415231);
                                        iArticleViewer.links.addLink(iArticleViewer.pressedLink, iArticleViewer.pressedLinkOwnerLayout);
                                        try {
                                            LinkPath linkPathObtainNewPath = iArticleViewer.pressedLink.obtainNewPath();
                                            linkPathObtainNewPath.setCurrentLayout(staticLayout, spanStart, 0.0f);
                                            TextPaint textPaint = textPaintUrlSpan.getTextPaint();
                                            int i9 = textPaint != null ? textPaint.baselineShift : 0;
                                            linkPathObtainNewPath.setBaselineShift(i9 != 0 ? i9 + AndroidUtilities.dp(i9 > 0 ? 5.0f : -2.0f) : 0);
                                            staticLayout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                                            view.invalidate();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        list = drawingText.spoilers;
                                        if (list != null) {
                                            while (i3 < textStyleSpanArr.length) {
                                                if (textStyleSpan.isSpoiler()) {
                                                    path = new Path();
                                                    it = drawingText.spoilers.iterator();
                                                    while (it.hasNext()) {
                                                        Rect bounds2 = it.next().getBounds();
                                                        path.addRect(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom, Path.Direction.CW);
                                                    }
                                                    RectF rectF2 = new RectF();
                                                    path.computeBounds(rectF2, false);
                                                    fSqrt = (float) Math.sqrt((rectF2.height() * rectF2.height()) + (rectF2.width() * rectF2.width()));
                                                    drawingText.spoilers.get(0).onRippleEndCallback = new ArticleViewer$$ExternalSyntheticLambda12(view, drawingText);
                                                    it2 = drawingText.spoilers.iterator();
                                                    while (it2.hasNext()) {
                                                        it2.next().startRipple(f3, i6, fSqrt, false);
                                                    }
                                                    view.invalidate();
                                                    if (view.getParent() == null) {
                                                        break;
                                                    }
                                                    view.getParent().requestDisallowInterceptTouchEvent(true);
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        list = drawingText.spoilers;
                                        if (list != null) {
                                            while (i3 < textStyleSpanArr.length) {
                                                if (textStyleSpan.isSpoiler()) {
                                                    path = new Path();
                                                    it = drawingText.spoilers.iterator();
                                                    while (it.hasNext()) {
                                                        Rect bounds3 = it.next().getBounds();
                                                        path.addRect(bounds3.left, bounds3.top, bounds3.right, bounds3.bottom, Path.Direction.CW);
                                                    }
                                                    RectF rectF3 = new RectF();
                                                    path.computeBounds(rectF3, false);
                                                    fSqrt = (float) Math.sqrt((rectF3.height() * rectF3.height()) + (rectF3.width() * rectF3.width()));
                                                    drawingText.spoilers.get(0).onRippleEndCallback = new ArticleViewer$$ExternalSyntheticLambda12(view, drawingText);
                                                    it2 = drawingText.spoilers.iterator();
                                                    while (it2.hasNext()) {
                                                        it2.next().startRipple(f3, i6, fSqrt, false);
                                                    }
                                                    view.invalidate();
                                                    if (view.getParent() == null) {
                                                        break;
                                                    }
                                                    view.getParent().requestDisallowInterceptTouchEvent(true);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                LinkSpanDrawable<TextPaintUrlSpan> linkSpanDrawable4 = iArticleViewer.pressedLink;
                if (linkSpanDrawable4 != null) {
                    iArticleViewer.handleLinkClick(webpageAdapter, (TextPaintUrlSpan) linkSpanDrawable4.getSpan());
                    removePressedLink(iArticleViewer);
                }
            } else if (motionEvent.getAction() == 3 && ((actionBarPopupWindow = iArticleViewer.popupWindow) == null || !actionBarPopupWindow.isShowing())) {
                removePressedLink(iArticleViewer);
            }
            iArticleViewer.checkLayoutForLinks(motionEvent, view);
            if (view instanceof BlockDetailsCell) {
                if (iArticleViewer.pressedLink != null) {
                    return true;
                }
                return false;
            }
            if (iArticleViewer.pressedLinkOwnerLayout != null) {
                return true;
            }
            return false;
        }
        iArticleViewer.checkLayoutForLinks(motionEvent, view);
        if (view instanceof BlockDetailsCell) {
            if (iArticleViewer.pressedLink != null) {
                return true;
            }
            return false;
        }
        if (iArticleViewer.pressedLinkOwnerLayout != null) {
            return true;
        }
        return false;
    }

    private void checkScrollAnimated(final Runnable runnable) {
        int i = 1;
        if (this.currentHeaderHeight == AndroidUtilities.dp(56.0f)) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator duration = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(this.currentHeaderHeight), Integer.valueOf(AndroidUtilities.dp(56.0f))).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new ArticleViewer$$ExternalSyntheticLambda21(this, i));
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

    public static DrawingText createLayoutForText(IArticleViewer iArticleViewer, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, WebpageAdapter webpageAdapter) {
        return createLayoutForText(iArticleViewer, view, charSequence, richText, i, 0, pageBlock, alignment, 0, webpageAdapter);
    }

    public static void drawTextSelection(IArticleViewer iArticleViewer, Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView) {
        drawTextSelection(iArticleViewer, canvas, articleSelectableView, 0);
    }

    public static CharSequence getText(IArticleViewer iArticleViewer, WebpageAdapter webpageAdapter, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        return getText(iArticleViewer, webpageAdapter != null ? webpageAdapter.currentPage : null, view, richText, richText2, pageBlock, i);
    }

    public static TextPaint getTextPaint(IArticleViewer iArticleViewer, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock) {
        SparseArray<TextPaint> sparseArray;
        int iDp;
        int textColor;
        int textColor2;
        int i;
        TextPaint textPaint;
        int textFlags = getTextFlags(richText2);
        int iDp2 = AndroidUtilities.dp(14.0f);
        Resources resources2 = iArticleViewer.getResources();
        int iDp3 = AndroidUtilities.dp((resources2.isRichMessage ? SharedConfig.fontSize : SharedConfig.ivFontSize) - 16);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.RichText richText3 = ((TL_iv.pageBlockPhoto) pageBlock).caption.text;
            if (richText3 == richText2 || richText3 == richText) {
                sparseArray = resources2.photoCaptionTextPaints;
                iDp = AndroidUtilities.dp(14.0f);
            } else {
                sparseArray = resources2.photoCreditTextPaints;
                iDp = AndroidUtilities.dp(12.0f);
            }
            textColor = iArticleViewer.getGrayTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.RichText richText4 = ((TL_iv.pageBlockMap) pageBlock).caption.text;
            if (richText4 == richText2 || richText4 == richText) {
                sparseArray = resources2.photoCaptionTextPaints;
                iDp = AndroidUtilities.dp(14.0f);
            } else {
                sparseArray = resources2.photoCreditTextPaints;
                iDp = AndroidUtilities.dp(12.0f);
            }
            textColor = iArticleViewer.getGrayTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
            sparseArray = resources2.titleTextPaints;
            iDp = AndroidUtilities.dp(23.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockKicker) {
            sparseArray = resources2.kickerTextPaints;
            iDp = AndroidUtilities.dp(14.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            sparseArray = resources2.authorTextPaints;
            iDp = AndroidUtilities.dp(14.0f);
            textColor = iArticleViewer.getGrayTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            sparseArray = resources2.footerTextPaints;
            iDp = AndroidUtilities.dp(14.0f);
            textColor = iArticleViewer.getGrayTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockSubtitle) {
            sparseArray = resources2.subtitleTextPaints;
            iDp = AndroidUtilities.dp(20.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
            sparseArray = resources2.headerTextPaints;
            iDp = AndroidUtilities.dp(20.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
            sparseArray = resources2.subheaderTextPaints;
            iDp = AndroidUtilities.dp(17.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            sparseArray = resources2.heading1TextPaints;
            iDp = AndroidUtilities.dp(18.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            sparseArray = resources2.heading2TextPaints;
            iDp = AndroidUtilities.dp(16.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            sparseArray = resources2.heading3TextPaints;
            iDp = AndroidUtilities.dp(15.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            sparseArray = resources2.heading4TextPaints;
            iDp = AndroidUtilities.dp(14.0f);
            textColor = iArticleViewer.getTextColor();
        } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            sparseArray = resources2.heading5TextPaints;
            iDp = AndroidUtilities.dp(13.0f);
            textColor = iArticleViewer.getTextColor();
        } else {
            if (!(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                    if (pageblockblockquote.text == richText) {
                        sparseArray = resources2.quoteTextPaints;
                        iDp = AndroidUtilities.dp(15.0f);
                        textColor = iArticleViewer.getTextColor();
                    } else if (pageblockblockquote.caption == richText) {
                        sparseArray = resources2.photoCaptionTextPaints;
                        iDp = AndroidUtilities.dp(14.0f);
                        textColor = iArticleViewer.getGrayTextColor();
                    } else {
                        sparseArray = null;
                        textColor2 = -65536;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                    if (pageblockpullquote.text == richText) {
                        sparseArray = resources2.quoteTextPaints;
                        iDp = AndroidUtilities.dp(15.0f);
                        textColor = iArticleViewer.getTextColor();
                    } else if (pageblockpullquote.caption == richText) {
                        sparseArray = resources2.photoCaptionTextPaints;
                        iDp = AndroidUtilities.dp(14.0f);
                        textColor = iArticleViewer.getGrayTextColor();
                    } else {
                        sparseArray = null;
                        textColor2 = -65536;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                    sparseArray = resources2.preformattedTextPaints;
                    iDp2 = AndroidUtilities.dp(14.0f);
                    textColor2 = iArticleViewer.getTextColor();
                    textFlags |= 4;
                } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    sparseArray = resources2.paragraphTextPaints;
                    iDp = AndroidUtilities.dp(16.0f);
                    textColor = iArticleViewer.getTextColor();
                } else if (isListItemBlock(pageBlock)) {
                    sparseArray = resources2.listTextPaints;
                    iDp = AndroidUtilities.dp(16.0f);
                    textColor = iArticleViewer.getTextColor();
                } else if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                    TL_iv.RichText richText5 = ((TL_iv.pageBlockEmbed) pageBlock).caption.text;
                    if (richText5 == richText2 || richText5 == richText) {
                        sparseArray = resources2.photoCaptionTextPaints;
                        iDp = AndroidUtilities.dp(14.0f);
                    } else {
                        sparseArray = resources2.photoCreditTextPaints;
                        iDp = AndroidUtilities.dp(12.0f);
                    }
                    textColor = iArticleViewer.getGrayTextColor();
                } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.RichText richText6 = ((TL_iv.pageBlockSlideshow) pageBlock).caption.text;
                    if (richText6 == richText2 || richText6 == richText) {
                        sparseArray = resources2.photoCaptionTextPaints;
                        iDp = AndroidUtilities.dp(14.0f);
                    } else {
                        sparseArray = resources2.photoCreditTextPaints;
                        iDp = AndroidUtilities.dp(12.0f);
                    }
                    textColor = iArticleViewer.getGrayTextColor();
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    TL_iv.RichText richText7 = ((TL_iv.pageBlockCollage) pageBlock).caption.text;
                    if (richText7 == richText2 || richText7 == richText) {
                        sparseArray = resources2.photoCaptionTextPaints;
                        iDp = AndroidUtilities.dp(14.0f);
                    } else {
                        sparseArray = resources2.photoCreditTextPaints;
                        iDp = AndroidUtilities.dp(12.0f);
                    }
                    textColor = iArticleViewer.getGrayTextColor();
                } else if (pageBlock instanceof TL_iv.pageBlockEmbedPost) {
                    TL_iv.PageCaption pageCaption = ((TL_iv.pageBlockEmbedPost) pageBlock).caption;
                    if (richText2 == pageCaption.text) {
                        sparseArray = resources2.photoCaptionTextPaints;
                        iDp = AndroidUtilities.dp(14.0f);
                        textColor = iArticleViewer.getGrayTextColor();
                    } else if (richText2 == pageCaption.credit) {
                        sparseArray = resources2.photoCreditTextPaints;
                        iDp = AndroidUtilities.dp(12.0f);
                        textColor = iArticleViewer.getGrayTextColor();
                    } else if (richText2 != null) {
                        sparseArray = resources2.embedPostTextPaints;
                        iDp = AndroidUtilities.dp(14.0f);
                        textColor = iArticleViewer.getTextColor();
                    } else {
                        sparseArray = null;
                        textColor2 = -65536;
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    if (richText2 == ((TL_iv.pageBlockVideo) pageBlock).caption.text) {
                        sparseArray = resources2.mediaCaptionTextPaints;
                        iDp = AndroidUtilities.dp(14.0f);
                    } else {
                        sparseArray = resources2.mediaCreditTextPaints;
                        iDp = AndroidUtilities.dp(12.0f);
                    }
                    textColor = iArticleViewer.getTextColor();
                } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                    if (richText2 == ((TL_iv.pageBlockAudio) pageBlock).caption.text) {
                        sparseArray = resources2.mediaCaptionTextPaints;
                        iDp = AndroidUtilities.dp(14.0f);
                    } else {
                        sparseArray = resources2.mediaCreditTextPaints;
                        iDp = AndroidUtilities.dp(12.0f);
                    }
                    textColor = iArticleViewer.getTextColor();
                } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                    sparseArray = resources2.relatedArticleTextPaints;
                    iDp = AndroidUtilities.dp(15.0f);
                    textColor = iArticleViewer.getGrayTextColor();
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    sparseArray = resources2.detailsTextPaints;
                    iDp = AndroidUtilities.dp(15.0f);
                    textColor = iArticleViewer.getTextColor();
                } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                    sparseArray = resources2.tableTextPaints;
                    iDp = AndroidUtilities.dp(15.0f);
                    textColor = iArticleViewer.getTextColor();
                } else {
                    sparseArray = null;
                    textColor2 = -65536;
                }
                i = textFlags & 256;
                if (i == 0 || (textFlags & 128) != 0) {
                    iDp2 -= AndroidUtilities.dp(4.0f);
                }
                if (sparseArray == null) {
                    if (resources2.errorTextPaint == null) {
                        TextPaint textPaint2 = new TextPaint(1);
                        resources2.errorTextPaint = textPaint2;
                        textPaint2.setColor(-65536);
                    }
                    resources2.errorTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
                    return resources2.errorTextPaint;
                }
                textPaint = sparseArray.get(textFlags);
                if (textPaint == null) {
                    textPaint = new TextPaint(1);
                    if ((textFlags & 4) != 0) {
                        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                    } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                        textPaint.setTypeface(AndroidUtilities.bold());
                    } else if (iArticleViewer.selectedFont == 1 && !(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockKicker) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockSubtitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !isHeadingBlock(pageBlock)) {
                        int i2 = textFlags & 1;
                        if (i2 != 0 && (textFlags & 2) != 0) {
                            textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf"));
                        } else if (i2 != 0) {
                            textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                        } else if ((textFlags & 2) != 0) {
                            textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                        }
                    } else if (!(pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || isHeadingBlock(pageBlock)) {
                        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                    } else {
                        int i3 = textFlags & 1;
                        if (i3 != 0 && (textFlags & 2) != 0) {
                            textPaint.setTypeface(Typeface.create("serif", 3));
                        } else if (i3 != 0) {
                            textPaint.setTypeface(Typeface.create("serif", 1));
                        } else if ((textFlags & 2) != 0) {
                            textPaint.setTypeface(Typeface.create("serif", 2));
                        } else {
                            textPaint.setTypeface(Typeface.create("serif", 0));
                        }
                    }
                    if ((textFlags & 32) != 0) {
                        textPaint.setFlags(textPaint.getFlags() | 16);
                    }
                    if ((textFlags & 16) != 0) {
                        textPaint.setFlags(textPaint.getFlags() | 8);
                    }
                    if ((textFlags & 8) == 0 || (textFlags & 512) != 0) {
                        textPaint.setFlags(textPaint.getFlags());
                        textColor2 = iArticleViewer.getLinkTextColor();
                    }
                    if (i != 0) {
                        textPaint.baselineShift -= AndroidUtilities.dp(6.0f);
                    } else if ((textFlags & 128) != 0) {
                        textPaint.baselineShift = AndroidUtilities.dp(2.0f) + textPaint.baselineShift;
                    }
                    textPaint.setColor(textColor2);
                    sparseArray.put(textFlags, textPaint);
                }
                textPaint.setTextSize(iDp2 + iDp3);
                return textPaint;
            }
            sparseArray = resources2.heading6TextPaints;
            iDp = AndroidUtilities.dp(12.0f);
            textColor = iArticleViewer.getTextColor();
        }
        int i4 = textColor;
        iDp2 = iDp;
        textColor2 = i4;
        i = textFlags & 256;
        if (i == 0) {
            iDp2 -= AndroidUtilities.dp(4.0f);
        } else {
            iDp2 -= AndroidUtilities.dp(4.0f);
        }
        if (sparseArray == null) {
            if (resources2.errorTextPaint == null) {
                TextPaint textPaint3 = new TextPaint(1);
                resources2.errorTextPaint = textPaint3;
                textPaint3.setColor(-65536);
            }
            resources2.errorTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
            return resources2.errorTextPaint;
        }
        textPaint = sparseArray.get(textFlags);
        if (textPaint == null) {
            textPaint = new TextPaint(1);
            if ((textFlags & 4) != 0) {
                textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
            } else if (pageBlock instanceof TL_iv.pageBlockRelatedArticles) {
                textPaint.setTypeface(AndroidUtilities.bold());
            } else if (iArticleViewer.selectedFont == 1) {
                if (pageBlock instanceof TL_iv.pageBlockTitle) {
                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                } else {
                    textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
                }
            } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
                textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
            } else {
                textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
            }
            if ((textFlags & 32) != 0) {
                textPaint.setFlags(textPaint.getFlags() | 16);
            }
            if ((textFlags & 16) != 0) {
                textPaint.setFlags(textPaint.getFlags() | 8);
            }
            if ((textFlags & 8) == 0) {
                textPaint.setFlags(textPaint.getFlags());
                textColor2 = iArticleViewer.getLinkTextColor();
            } else {
                textPaint.setFlags(textPaint.getFlags());
                textColor2 = iArticleViewer.getLinkTextColor();
            }
            if (i != 0) {
                textPaint.baselineShift -= AndroidUtilities.dp(6.0f);
            } else if ((textFlags & 128) != 0) {
                textPaint.baselineShift = AndroidUtilities.dp(2.0f) + textPaint.baselineShift;
            }
            textPaint.setColor(textColor2);
            sparseArray.put(textFlags, textPaint);
        }
        textPaint.setTextSize(iDp2 + iDp3);
        return textPaint;
    }

    private static Browser.Progress makeProgress(final IArticleViewer iArticleViewer, final LinkSpanDrawable<TextPaintUrlSpan> linkSpanDrawable, final DrawingText drawingText) {
        if (linkSpanDrawable == null) {
            return null;
        }
        return new Browser.Progress() {
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
                    iArticleViewer.loadingLinkDrawable.setColors(Theme.multAlpha(0.8f, themedColor), Theme.multAlpha(1.3f, themedColor), Theme.multAlpha(1.0f, themedColor), Theme.multAlpha(4.0f, themedColor));
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

    public boolean open(MessageObject messageObject, TLRPC.WebPage webPage) {
        return open(messageObject, webPage, null, null, null);
    }

    public DrawingText createLayoutForText(View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, WebpageAdapter webpageAdapter) {
        return createLayoutForText(view, charSequence, richText, i, i2, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, webpageAdapter);
    }

    public void drawTextSelection(Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView, int i) {
        drawTextSelection(this, canvas, articleSelectableView, i);
    }

    public CharSequence getText(TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        return getText(this, webPage, view, richText, richText2, pageBlock, i);
    }

    public boolean open(TLRPC.TL_webPage tL_webPage, String str) {
        return open(null, tL_webPage, str, null, null);
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
            TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView, LayoutHelper.createLinear(-2, -2, 3, 0, 4, 0, 2), context);
            this.descriptionView = textViewM;
            textViewM.setTextSize(1, 15.0f);
            textViewM.setTextColor(-1);
            textViewM.setSingleLine(false);
            textViewM.setMaxLines(3);
            TextView textViewM2 = Theme.ResourcesProvider.CC.m(linearLayout, textViewM, LayoutHelper.createLinear(-2, -2, 3, 0, 0, 0, 1), context);
            this.codeView = textViewM2;
            textViewM2.setTextSize(1, 12.0f);
            textViewM2.setTextColor(-1);
            textViewM2.setAlpha(0.4f);
            linearLayout.addView(textViewM2, LayoutHelper.createLinear(-2, -2, 3));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, null);
            this.buttonView = buttonWithCounterView;
            buttonWithCounterView.setMinWidth(AndroidUtilities.dp(140.0f));
            buttonWithCounterView.setText(LocaleController.getString(R.string.Refresh), false);
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-2, 40, 3, 0, 12, 0, 0));
        }

        public void lambda$setDark$0(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.titleView.setTextColor(ColorUtils.blendARGB(fFloatValue, -16777216, -1));
            this.descriptionView.setTextColor(ColorUtils.blendARGB(fFloatValue, -16777216, -1));
            this.codeView.setTextColor(ColorUtils.blendARGB(fFloatValue, -16777216, -1));
        }

        public void set(String str, String str2) {
            this.titleView.setText(LocaleController.getString(R.string.WebErrorTitle));
            ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(R.string.WebErrorInfoBot, new Object[]{str}, this.descriptionView);
            this.codeView.setText(str2);
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
            if (!z2) {
                this.titleView.setTextColor(!z ? -16777216 : -1);
                this.descriptionView.setTextColor(!z ? -16777216 : -1);
                this.codeView.setTextColor(z ? -1 : -16777216);
            } else {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                this.darkAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 26));
                this.darkAnimator.start();
            }
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

        public void set(String str, int i, String str2) {
            this.titleView.setText(LocaleController.getString(R.string.WebErrorTitle));
            String strMagic2tonsite = BotWebViewContainer.magic2tonsite(str);
            this.descriptionView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags((strMagic2tonsite == null || Uri.parse(strMagic2tonsite) == null || Uri.parse(strMagic2tonsite).getAuthority() == null) ? LocaleController.getString(R.string.WebErrorInfo) : LocaleController.formatString(R.string.WebErrorInfoDomain, Uri.parse(strMagic2tonsite).getAuthority())), this.descriptionView.getPaint().getFontMetricsInt(), false));
            this.codeView.setText(str2);
        }
    }

    public static DrawingText createLayoutForText(IArticleViewer iArticleViewer, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, WebpageAdapter webpageAdapter) {
        return createLayoutForText(iArticleViewer, view, charSequence, richText, i, i2, pageBlock, Layout.Alignment.ALIGN_NORMAL, 0, webpageAdapter);
    }

    public static void drawTextSelection(IArticleViewer iArticleViewer, Canvas canvas, TextSelectionHelper.ArticleSelectableView articleSelectableView, int i) {
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper = iArticleViewer.getTextSelectionHelper((View) articleSelectableView);
        if (textSelectionHelper != null) {
            textSelectionHelper.draw(canvas, articleSelectableView, i);
        }
    }

    public static CharSequence getText(IArticleViewer iArticleViewer, TLRPC.WebPage webPage, View view, TL_iv.RichText richText, TL_iv.RichText richText2, TL_iv.PageBlock pageBlock, int i) {
        int i2;
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
        long j = 0;
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
        if (richText2 instanceof TL_iv.textConcat) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = richText2.texts.size();
            int i3 = 0;
            while (i3 < size) {
                TL_iv.RichText richText3 = richText2.texts.get(i3);
                TL_iv.RichText lastRichText = getLastRichText(richText3);
                boolean z = i >= 0 && (richText3 instanceof TL_iv.textUrl) && ((TL_iv.textUrl) richText3).webpage_id != j;
                if (z && spannableStringBuilder4.length() != 0 && spannableStringBuilder4.charAt(spannableStringBuilder4.length() - 1) != '\n') {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new TextSelectionHelper.IgnoreCopySpannable(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                CharSequence text = getText(iArticleViewer, webPage, view, richText, richText3, pageBlock, i);
                int textFlags = getTextFlags(lastRichText);
                int length = spannableStringBuilder4.length();
                spannableStringBuilder4.append(text);
                if (textFlags != 0 && !(text instanceof SpannableStringBuilder)) {
                    if ((textFlags & 8) == 0 && (textFlags & 512) == 0) {
                        if (length != spannableStringBuilder4.length()) {
                            spannableStringBuilder4.setSpan(new TextPaintSpan(getTextPaint(iArticleViewer, richText, lastRichText, pageBlock)), length, spannableStringBuilder4.length(), 33);
                        }
                    } else {
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
                    }
                }
                if (z && i3 != size - 1) {
                    spannableStringBuilder4.append((CharSequence) " ");
                    spannableStringBuilder4.setSpan(new TextSelectionHelper.IgnoreCopySpannable(), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                }
                i3++;
                j = 0;
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
                    iDp2 = (int) (iDp2 * (iAbs / iDp));
                    iDp = iAbs;
                }
                int i4 = iDp2;
                if (view != null) {
                    spannableStringBuilder8.setSpan(new TextPaintImageReceiverSpan(view, documentWithId, (Object) webPage, iDp, i4, false, AndroidUtilities.computePerceivedBrightness(iArticleViewer.getThemedColor(Theme.key_windowBackgroundWhite)) <= 0.705f), 0, spannableStringBuilder8.length(), 33);
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
                iDp4 = (int) (iDp4 * (iAbs2 / iDp3));
                i2 = iAbs2;
            } else {
                i2 = iDp3;
            }
            if (view != null) {
                spannableStringBuilder9.setSpan(new TextPaintImageReceiverSpan(view, webPhoto, (Object) webPage, i2, iDp4, false, false), 0, spannableStringBuilder9.length(), 33);
            }
            return spannableStringBuilder9;
        }
        if (richText2 instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText2;
            if (textmath.bitmap == null && !textmath.tried) {
                textmath.tried = true;
                Latex latexRender = Latex.render(textmath.source, AndroidUtilities.dp(20.0f), true);
                if (latexRender != null) {
                    textmath.w = latexRender.width;
                    textmath.h = latexRender.height;
                    textmath.depth = latexRender.depth;
                    textmath.bitmap = (Bitmap) latexRender.bitmap;
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

    public boolean open(String str) {
        return open(null, null, null, str, null);
    }

    private DrawingText createLayoutForText(View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i3, WebpageAdapter webpageAdapter) {
        return createLayoutForText(this, view, charSequence, richText, i, i2, pageBlock, alignment, i3, webpageAdapter);
    }

    public boolean open(String str, Browser.Progress progress) {
        return open(null, null, null, str, progress);
    }

    private boolean addPageToStack(String str, int i) {
        saveCurrentPagePosition();
        CachedWeb cachedWeb = new CachedWeb(str);
        this.pagesStack.add(cachedWeb);
        this.actionBar.showSearch(false, true);
        updateInterfaceForCurrentPage(cachedWeb, false, i);
        return false;
    }

    public static DrawingText createLayoutForText(IArticleViewer iArticleViewer, View view, CharSequence charSequence, TL_iv.RichText richText, int i, int i2, TL_iv.PageBlock pageBlock, Layout.Alignment alignment, int i3, WebpageAdapter webpageAdapter) {
        IArticleViewer iArticleViewer2;
        CharSequence text;
        TL_iv.PageBlock pageBlock2;
        TextPaint textPaint;
        ?? r3;
        CharSequence charSequence2;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        LinkPath linkPath;
        LinkPath linkPath2;
        View view2;
        TL_iv.RichText richText2;
        TL_iv.PageBlock pageBlock3;
        int i4;
        LinkPath linkPath3;
        int iDp;
        int iDp2;
        WebpageAdapter adapter;
        StaticLayout staticLayoutCreateStaticLayout;
        StaticLayout staticLayoutCreateStaticLayout2;
        if (charSequence == null && (richText == null || (richText instanceof TL_iv.textEmpty))) {
            return null;
        }
        int iDp3 = i < 0 ? AndroidUtilities.dp(10.0f) : i;
        if (charSequence != null) {
            iArticleViewer2 = iArticleViewer;
            pageBlock2 = pageBlock;
            text = charSequence;
        } else {
            iArticleViewer2 = iArticleViewer;
            text = getText(iArticleViewer2, webpageAdapter, view, richText, richText, pageBlock, iDp3);
            pageBlock2 = pageBlock;
        }
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        int iDp4 = AndroidUtilities.dp(SharedConfig.ivFontSize - 16);
        if ((pageBlock2 instanceof TL_iv.pageBlockEmbedPost) && richText == null) {
            if (((TL_iv.pageBlockEmbedPost) pageBlock2).author == charSequence) {
                if (embedPostAuthorPaint == null) {
                    TextPaint textPaint2 = new TextPaint(1);
                    embedPostAuthorPaint = textPaint2;
                    textPaint2.setColor(iArticleViewer2.getTextColor());
                }
                embedPostAuthorPaint.setTextSize(AndroidUtilities.dp(15.0f) + iDp4);
                textPaint = embedPostAuthorPaint;
            } else {
                if (embedPostDatePaint == null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    embedPostDatePaint = textPaint3;
                    textPaint3.setColor(iArticleViewer2.getGrayTextColor());
                }
                embedPostDatePaint.setTextSize(AndroidUtilities.dp(14.0f) + iDp4);
                textPaint = embedPostDatePaint;
            }
        } else if (pageBlock2 instanceof TL_iv.pageBlockChannel) {
            if (channelNamePaint == null) {
                TextPaint textPaint4 = new TextPaint(1);
                channelNamePaint = textPaint4;
                textPaint4.setTypeface(AndroidUtilities.bold());
                TextPaint textPaint5 = new TextPaint(1);
                channelNamePhotoPaint = textPaint5;
                textPaint5.setTypeface(AndroidUtilities.bold());
            }
            channelNamePaint.setColor(iArticleViewer2.getTextColor());
            channelNamePaint.setTextSize(AndroidUtilities.dp(15.0f));
            channelNamePhotoPaint.setColor(-1);
            channelNamePhotoPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint = (webpageAdapter == null || webpageAdapter.channelBlock == null) ? channelNamePaint : channelNamePhotoPaint;
        } else if (pageBlock2 instanceof TL_pageBlockRelatedArticlesChild) {
            TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = (TL_pageBlockRelatedArticlesChild) pageBlock2;
            if (charSequence == tL_pageBlockRelatedArticlesChild.parent.articles.get(tL_pageBlockRelatedArticlesChild.num).title) {
                if (relatedArticleHeaderPaint == null) {
                    TextPaint textPaint6 = new TextPaint(1);
                    relatedArticleHeaderPaint = textPaint6;
                    textPaint6.setTypeface(AndroidUtilities.bold());
                }
                relatedArticleHeaderPaint.setColor(iArticleViewer2.getTextColor());
                relatedArticleHeaderPaint.setTextSize(AndroidUtilities.dp(15.0f) + iDp4);
                textPaint = relatedArticleHeaderPaint;
            } else {
                if (relatedArticleTextPaint == null) {
                    relatedArticleTextPaint = new TextPaint(1);
                }
                relatedArticleTextPaint.setColor(iArticleViewer2.getGrayTextColor());
                relatedArticleTextPaint.setTextSize(AndroidUtilities.dp(14.0f) + iDp4);
                textPaint = relatedArticleTextPaint;
            }
        } else if (isListItemBlock(pageBlock2) && charSequence != null) {
            if (listTextPointerPaint == null) {
                TextPaint textPaint7 = new TextPaint(1);
                listTextPointerPaint = textPaint7;
                textPaint7.setColor(iArticleViewer2.getTextColor());
            }
            if (listTextNumPaint == null) {
                TextPaint textPaint8 = new TextPaint(1);
                listTextNumPaint = textPaint8;
                textPaint8.setColor(iArticleViewer2.getTextColor());
            }
            listTextPointerPaint.setTextSize(AndroidUtilities.dp(19.0f) + iDp4);
            listTextNumPaint.setTextSize(AndroidUtilities.dp(16.0f) + iDp4);
            if ((pageBlock2 instanceof TL_pageBlockListItem) && !((TL_pageBlockListItem) pageBlock2).parent.pageBlockList.ordered) {
                textPaint = listTextPointerPaint;
            } else {
                textPaint = listTextNumPaint;
            }
        } else {
            textPaint = getTextPaint(iArticleViewer2, richText, richText, pageBlock2);
        }
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(text, textPaint.getFontMetricsInt(), false, null, 2);
        if (i3 != 0) {
            if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                TextPaint textPaint9 = textPaint;
                r3 = 1;
                staticLayoutCreateStaticLayout2 = StaticLayoutEx.createStaticLayout(charSequenceReplaceEmoji, textPaint9, iDp3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, iDp3, i3);
            } else {
                TextPaint textPaint10 = textPaint;
                r3 = 1;
                staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(charSequenceReplaceEmoji, textPaint10, iDp3, alignment, 1.0f, AndroidUtilities.dp(4.0f), false, TextUtils.TruncateAt.END, iDp3, i3);
            }
        } else {
            TextPaint textPaint11 = textPaint;
            r3 = 1;
            if (charSequenceReplaceEmoji.charAt(charSequenceReplaceEmoji.length() - 1) == '\n') {
                charSequenceReplaceEmoji = charSequenceReplaceEmoji.subSequence(0, charSequenceReplaceEmoji.length() - 1);
            }
            if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                charSequence2 = charSequenceReplaceEmoji;
                staticLayout = new StaticLayout(charSequence2, textPaint11, iDp3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            } else {
                charSequence2 = charSequenceReplaceEmoji;
                staticLayout = new StaticLayout(charSequence2, textPaint11, iDp3, alignment, 1.0f, AndroidUtilities.dp(4.0f), false);
            }
            staticLayout2 = staticLayout;
            charSequenceReplaceEmoji = charSequence2;
        }
        if (staticLayout2 == null) {
            staticLayout2 = staticLayoutCreateStaticLayout;
            staticLayout2 = staticLayoutCreateStaticLayout2;
            return null;
        }
        staticLayout2 = staticLayoutCreateStaticLayout;
        CharSequence text2 = staticLayout2.getText();
        if (i2 >= 0 && !iArticleViewer2.searchResults.isEmpty() && iArticleViewer2.searchText != null && (adapter = iArticleViewer2.getAdapter()) != null) {
            staticLayout2 = staticLayoutCreateStaticLayout2;
            String lowerCase = charSequenceReplaceEmoji.toString().toLowerCase();
            int i5 = 0;
            while (true) {
                int iIndexOf = lowerCase.indexOf(iArticleViewer2.searchText, i5);
                if (iIndexOf < 0) {
                    break;
                }
                int length = iArticleViewer2.searchText.length() + iIndexOf;
                if (iIndexOf == 0 || AndroidUtilities.isPunctuationCharacter(lowerCase.charAt(iIndexOf - 1))) {
                    adapter.searchTextOffset.put(iArticleViewer2.searchText + pageBlock2 + richText + iIndexOf, Integer.valueOf(staticLayout2.getLineTop(staticLayout2.getLineForOffset(iIndexOf)) + i2));
                }
                i5 = length;
            }
        }
        staticLayout2 = staticLayoutCreateStaticLayout2;
        staticLayout2 = staticLayoutCreateStaticLayout2;
        staticLayout2 = staticLayoutCreateStaticLayout2;
        staticLayout2 = staticLayoutCreateStaticLayout2;
        boolean z = text2 instanceof Spanned;
        if (z) {
            Spanned spanned = (Spanned) text2;
            try {
                AnchorSpan[] anchorSpanArr = (AnchorSpan[]) spanned.getSpans(0, spanned.length(), AnchorSpan.class);
                int lineCount = staticLayout2.getLineCount();
                if (anchorSpanArr != null && anchorSpanArr.length > 0) {
                    for (int i6 = 0; i6 < anchorSpanArr.length; i6++) {
                        if (lineCount <= r3) {
                            webpageAdapter.anchorsOffset.put(anchorSpanArr[i6].getName(), Integer.valueOf(i2));
                        } else {
                            webpageAdapter.anchorsOffset.put(anchorSpanArr[i6].getName(), Integer.valueOf(i2 + staticLayout2.getLineTop(staticLayout2.getLineForOffset(spanned.getSpanStart(anchorSpanArr[i6])))));
                        }
                    }
                }
            } catch (Exception unused) {
            }
            try {
                TextPaintWebpageUrlSpan[] textPaintWebpageUrlSpanArr = (TextPaintWebpageUrlSpan[]) spanned.getSpans(0, spanned.length(), TextPaintWebpageUrlSpan.class);
                if (textPaintWebpageUrlSpanArr == null || textPaintWebpageUrlSpanArr.length <= 0) {
                    linkPath3 = 0;
                } else {
                    linkPath3 = new LinkPath(r3);
                    try {
                        linkPath3.setAllowReset(false);
                        for (int i7 = 0; i7 < textPaintWebpageUrlSpanArr.length; i7++) {
                            int spanStart = spanned.getSpanStart(textPaintWebpageUrlSpanArr[i7]);
                            int spanEnd = spanned.getSpanEnd(textPaintWebpageUrlSpanArr[i7]);
                            linkPath3.setCurrentLayout(staticLayout2, spanStart, 0.0f);
                            int i8 = textPaintWebpageUrlSpanArr[i7].getTextPaint() != null ? textPaintWebpageUrlSpanArr[i7].getTextPaint().baselineShift : 0;
                            if (i8 != 0) {
                                iDp2 = i8 + AndroidUtilities.dp(i8 > 0 ? 5.0f : -2.0f);
                            } else {
                                iDp2 = 0;
                            }
                            linkPath3.setBaselineShift(iDp2);
                            staticLayout2.getSelectionPath(spanStart, spanEnd, linkPath3);
                        }
                        linkPath3.setAllowReset(r3);
                    } catch (Exception unused2) {
                    }
                }
            } catch (Exception unused3) {
            }
            try {
                TextPaintMarkSpan[] textPaintMarkSpanArr = (TextPaintMarkSpan[]) spanned.getSpans(0, spanned.length(), TextPaintMarkSpan.class);
                if (textPaintMarkSpanArr == null || textPaintMarkSpanArr.length <= 0) {
                    linkPath = null;
                    linkPath2 = linkPath3;
                } else {
                    LinkPath linkPath4 = new LinkPath(r3);
                    try {
                        linkPath4.setAllowReset(false);
                        for (int i9 = 0; i9 < textPaintMarkSpanArr.length; i9++) {
                            int spanStart2 = spanned.getSpanStart(textPaintMarkSpanArr[i9]);
                            int spanEnd2 = spanned.getSpanEnd(textPaintMarkSpanArr[i9]);
                            linkPath4.setCurrentLayout(staticLayout2, spanStart2, 0.0f);
                            int i10 = textPaintMarkSpanArr[i9].getTextPaint() != null ? textPaintMarkSpanArr[i9].getTextPaint().baselineShift : 0;
                            if (i10 != 0) {
                                iDp = i10 + AndroidUtilities.dp(i10 > 0 ? 5.0f : -2.0f);
                            } else {
                                iDp = 0;
                            }
                            linkPath4.setBaselineShift(iDp);
                            staticLayout2.getSelectionPath(spanStart2, spanEnd2, linkPath4);
                        }
                        linkPath4.setAllowReset(r3);
                    } catch (Exception unused4) {
                    }
                    linkPath = linkPath4;
                    linkPath2 = linkPath3;
                }
            } catch (Exception unused5) {
            }
        } else {
            linkPath = null;
            linkPath2 = 0;
        }
        DrawingText drawingText = new DrawingText(iArticleViewer2);
        drawingText.textLayout = staticLayout2;
        drawingText.textPath = linkPath2;
        drawingText.markPath = linkPath;
        drawingText.parentBlock = pageBlock2;
        drawingText.parentText = richText;
        drawingText.spoilersPool = new Stack<>();
        drawingText.spoilers = new ArrayList();
        drawingText.spoilersPatchedLayout = new AtomicReference<>();
        if (z) {
            view2 = view;
            richText2 = richText;
            pageBlock3 = pageBlock;
            i4 = 1;
            SpoilerEffect.addSpoilers(view2, staticLayout2, -1, -1, (Spanned) text2, drawingText.spoilersPool, drawingText.spoilers, null);
        } else {
            view2 = view;
            richText2 = richText;
            pageBlock3 = pageBlock2;
            i4 = 1;
        }
        if (view2 != null) {
            ArrayList<DrawingText> arrayList = liveDrawingTexts.get(view2);
            if (arrayList != null) {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    DrawingText drawingText2 = arrayList.get(i11);
                    if (drawingText2.parentBlock != pageBlock3 || (richText2 != null && drawingText2.parentText == richText2)) {
                        drawingText2.detach(view2);
                        arrayList.remove(i11);
                        i11--;
                    }
                    i11 += i4;
                }
            }
            if (richText2 != null) {
                if (arrayList == null) {
                    WeakHashMap<View, ArrayList<DrawingText>> weakHashMap = liveDrawingTexts;
                    ArrayList<DrawingText> arrayList2 = new ArrayList<>();
                    weakHashMap.put(view2, arrayList2);
                    arrayList = arrayList2;
                }
                arrayList.add(drawingText);
            }
            if (view2.isAttachedToWindow()) {
                drawingText.attach(view2);
            }
        }
        return drawingText;
    }

    private boolean open(final MessageObject messageObject, final TLRPC.WebPage webPage, String str, String str2, Browser.Progress progress) {
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
            webPage = webPage == null ? messageObject.messageOwner.media.webpage : webPage;
            z = (webPage == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
            int i = 0;
            while (true) {
                if (i < messageObject.messageOwner.entities.size()) {
                    TLRPC.MessageEntity messageEntity = messageObject.messageOwner.entities.get(i);
                    if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                        try {
                            String str3 = messageObject.messageOwner.message;
                            int i2 = messageEntity.offset;
                            String lowerCase2 = str3.substring(i2, messageEntity.length + i2).toLowerCase();
                            if (!TextUtils.isEmpty(webPage.cached_page.url)) {
                                lowerCase = webPage.cached_page.url.toLowerCase();
                            } else {
                                lowerCase = webPage.url.toLowerCase();
                            }
                            if (lowerCase2.contains(lowerCase) || lowerCase.contains(lowerCase2)) {
                                int iLastIndexOf2 = lowerCase2.lastIndexOf(35);
                                if (iLastIndexOf2 != -1) {
                                    strSubstring = lowerCase2.substring(iLastIndexOf2 + 1);
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    i++;
                }
                strSubstring = null;
                break;
            }
        }
        strSubstring = (str == null || (iLastIndexOf = str.lastIndexOf(35)) == -1) ? null : str.substring(iLastIndexOf + 1);
        z = false;
        final ?? r5 = (this.sheet == null || this.pagesStack.isEmpty()) ? 0 : 1;
        this.collapsed = false;
        if (r5 == 0) {
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
        if (webPage != null) {
            boolean zAddPageToStack = addPageToStack(webPage, strSubstring, r5);
            if (!z) {
                final String str4 = (zAddPageToStack || strSubstring == null) ? null : strSubstring;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
                tL_messages_getWebPage.url = webPage.url;
                TL_iv.Page page2 = webPage.cached_page;
                if (!(page2 instanceof TL_iv.TL_pagePart_layer82) && !page2.part) {
                    tL_messages_getWebPage.hash = webPage.hash;
                } else {
                    tL_messages_getWebPage.hash = 0;
                }
                final int i3 = messageObject != null ? messageObject.currentAccount : UserConfig.selectedAccount;
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getWebPage, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$open$54(i3, webPage, messageObject, r5, str4, tLObject, tL_error);
                    }
                });
            }
        } else {
            addPageToStack(str2, r5);
        }
        WebActionBar webActionBar = this.actionBar;
        if (webActionBar != null && r5 == 0) {
            webActionBar.setIsLocal(this.pages[0].isLocal());
        }
        this.lastInsets = null;
        if (this.sheet != null) {
            if (r5 == 0) {
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
        if (r5 == 0) {
            Sheet sheet3 = this.sheet;
            if (sheet3 == null) {
                this.windowView.setAlpha(0.0f);
                this.containerView.setAlpha(0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                WindowView windowView = this.windowView;
                Property property = View.ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(windowView, (Property<WindowView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.windowView, (Property<WindowView, Float>) View.TRANSLATION_X, AndroidUtilities.dp(56.0f), 0.0f));
                this.animationEndRunnable = new ArticleViewer$$ExternalSyntheticLambda9(this, 4);
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(this.interpolator);
                animatorSet.addListener(new AnonymousClass26());
                this.transitionAnimationStartTime = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new PhotoViewer$7$$ExternalSyntheticLambda0(17, this, animatorSet));
            } else if (r5 != 0) {
                sheet3.animationsLock.unlock();
            } else {
                sheet3.show();
            }
        }
        this.containerView.setLayerType(2, null);
        return true;
    }

    public static class BlockVideoCellState {
        Bitmap lastFrameBitmap;
        long playFrom;

        public static BlockVideoCellState fromPlayer(VideoPlayerHolderBase videoPlayerHolderBase, BlockVideoCell blockVideoCell) {
            BlockVideoCellState blockVideoCellState = new BlockVideoCellState();
            blockVideoCellState.playFrom = videoPlayerHolderBase.getCurrentPosition();
            if (videoPlayerHolderBase.firstFrameRendered && blockVideoCell.textureView != null && blockVideoCell.textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(blockVideoCell.textureView.getSurfaceTexture());
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(blockVideoCell.textureView.getMeasuredWidth(), blockVideoCell.textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, bitmapCreateBitmap);
                    surface.release();
                    blockVideoCellState.lastFrameBitmap = bitmapCreateBitmap;
                    return blockVideoCellState;
                }
                blockVideoCellState.lastFrameBitmap = blockVideoCell.textureView.getBitmap();
            }
            return blockVideoCellState;
        }

        public static BlockVideoCellState fromPlayer(VideoPlayer videoPlayer, BlockVideoCell blockVideoCell, TextureView textureView) {
            BlockVideoCellState blockVideoCellState = new BlockVideoCellState();
            blockVideoCellState.playFrom = videoPlayer.getCurrentPosition();
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView.getSurfaceTexture());
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(textureView.getMeasuredWidth(), textureView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, bitmapCreateBitmap);
                    surface.release();
                    blockVideoCellState.lastFrameBitmap = bitmapCreateBitmap;
                    return blockVideoCellState;
                }
                blockVideoCellState.lastFrameBitmap = textureView.getBitmap();
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
        this.notificationsLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats});
        this.BOTTOM_SHEET_VIEW_TAG = "bottomSheet";
        this.fontCells = new FontCell[2];
        this.lastSearchIndex = -1;
        ArticleViewer$$ExternalSyntheticLambda9 articleViewer$$ExternalSyntheticLambda9 = new ArticleViewer$$ExternalSyntheticLambda9(this, 1);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.page0Background = new AnimatedColor(articleViewer$$ExternalSyntheticLambda9, 320L, cubicBezierInterpolator);
        this.page1Background = new AnimatedColor(new ArticleViewer$$ExternalSyntheticLambda9(this, 2), 320L, cubicBezierInterpolator);
        this.isSheet = true;
        this.sheet = new Sheet(baseFragment);
        setParentActivity(baseFragment.getParentActivity(), baseFragment);
    }

    public void lambda$setParentActivity$29(final int i) {
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
                        Object objM = DiffUtil.m(ArticleViewer.this.pagesStack);
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
                        if (objM instanceof CachedWeb) {
                            ((CachedWeb) objM).destroy();
                        }
                        if (objM instanceof TLRPC.WebPage) {
                            WebInstantView.recycle((TLRPC.WebPage) objM);
                        }
                    } else {
                        ArticleViewer articleViewer4 = ArticleViewer.this;
                        Sheet sheet4 = articleViewer4.sheet;
                        if (sheet4 != null) {
                            sheet4.release();
                            ArticleViewer.this.destroy();
                        } else {
                            articleViewer4.saveCurrentPagePosition();
                            ArticleViewer.this.onClosed();
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
                if (ArticleViewer.this.windowView.openingPage) {
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
                    int size2 = arrayList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (obj instanceof CachedWeb) {
                            ((CachedWeb) obj).destroy();
                        }
                        if (obj instanceof TLRPC.WebPage) {
                            WebInstantView.recycle((TLRPC.WebPage) obj);
                        }
                    }
                } else {
                    ArticleViewer.this.saveCurrentPagePosition();
                    ArticleViewer.this.onClosed();
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
}
