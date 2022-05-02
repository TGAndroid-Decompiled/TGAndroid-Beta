package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.ContextLinkCell;
import org.telegram.p009ui.Cells.EmptyCell;
import org.telegram.p009ui.Cells.FeaturedStickerSetInfoCell;
import org.telegram.p009ui.Cells.StickerEmojiCell;
import org.telegram.p009ui.Cells.StickerSetGroupInfoCell;
import org.telegram.p009ui.Cells.StickerSetNameCell;
import org.telegram.p009ui.Components.EmojiView;
import org.telegram.p009ui.Components.PagerSlidingTabStrip;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.ScrollSlidingTabStrip;
import org.telegram.p009ui.Components.TrendingStickersLayout;
import org.telegram.p009ui.ContentPreviewViewer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_contacts_resolveUsername;
import org.telegram.tgnet.TLRPC$TL_contacts_resolvedPeer;
import org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_emojiURL;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_foundStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_getEmojiURL;
import org.telegram.tgnet.TLRPC$TL_messages_getInlineBotResults;
import org.telegram.tgnet.TLRPC$TL_messages_getStickers;
import org.telegram.tgnet.TLRPC$TL_messages_reorderStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_searchStickerSets;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_stickers;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebDocument;
import org.telegram.tgnet.TLRPC$messages_BotResults;

public class EmojiView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final ViewTreeObserver.OnScrollChangedListener NOP;
    private static final Field superListenerField;
    private ImageView backspaceButton;
    private AnimatorSet backspaceButtonAnimation;
    private boolean backspaceOnce;
    private boolean backspacePressed;
    private FrameLayout bottomTabContainer;
    private AnimatorSet bottomTabContainerAnimation;
    private View bottomTabContainerBackground;
    private ChooseStickerActionTracker chooseStickerActionTracker;
    private long currentChatId;
    private int currentPage;
    private EmojiViewDelegate delegate;
    private Paint dotPaint;
    private DragListener dragListener;
    private EmojiGridAdapter emojiAdapter;
    private FrameLayout emojiContainer;
    private RecyclerListView emojiGridView;
    private Drawable[] emojiIcons;
    private float emojiLastX;
    private float emojiLastY;
    private GridLayoutManager emojiLayoutManager;
    private EmojiSearchAdapter emojiSearchAdapter;
    private SearchField emojiSearchField;
    private int emojiSize;
    private AnimatorSet emojiTabShadowAnimator;
    private ScrollSlidingTabStrip emojiTabs;
    private View emojiTabsShadow;
    private ImageViewEmoji emojiTouchedView;
    private float emojiTouchedX;
    private float emojiTouchedY;
    private boolean expandStickersByDragg;
    private boolean firstTabUpdate;
    private ImageView floatingButton;
    private boolean forseMultiwindowLayout;
    private GifAdapter gifAdapter;
    private FrameLayout gifContainer;
    private RecyclerListView gifGridView;
    private Drawable[] gifIcons;
    private GifLayoutManager gifLayoutManager;
    private RecyclerListView.OnItemClickListener gifOnItemClickListener;
    private GifAdapter gifSearchAdapter;
    private SearchField gifSearchField;
    private ScrollSlidingTabStrip gifTabs;
    private int groupStickerPackNum;
    private int groupStickerPackPosition;
    private TLRPC$TL_messages_stickerSet groupStickerSet;
    private boolean groupStickersHidden;
    private boolean hasChatStickers;
    private boolean ignoreStickersScroll;
    private TLRPC$ChatFull info;
    private boolean isLayout;
    private float lastBottomScrollDy;
    private int lastNotifyHeight;
    private int lastNotifyHeight2;
    private int lastNotifyWidth;
    private String[] lastSearchKeyboardLanguage;
    private float lastStickersX;
    private TextView mediaBanTooltip;
    private boolean needEmojiSearch;
    private Object outlineProvider;
    private ViewPager pager;
    private EmojiColorPickerView pickerView;
    private EmojiPopupWindow pickerViewPopup;
    private int popupHeight;
    private int popupWidth;
    private final Theme.ResourcesProvider resourcesProvider;
    private RecyclerAnimationScrollHelper scrollHelper;
    private AnimatorSet searchAnimation;
    private ImageView searchButton;
    private Drawable searchIconDotDrawable;
    private Drawable searchIconDrawable;
    private View shadowLine;
    private boolean showing;
    private Drawable[] stickerIcons;
    private ImageView stickerSettingsButton;
    private AnimatorSet stickersButtonAnimation;
    private FrameLayout stickersContainer;
    private boolean stickersContainerAttached;
    private StickersGridAdapter stickersGridAdapter;
    private RecyclerListView stickersGridView;
    private GridLayoutManager stickersLayoutManager;
    private RecyclerListView.OnItemClickListener stickersOnItemClickListener;
    private SearchField stickersSearchField;
    private StickersSearchGridAdapter stickersSearchGridAdapter;
    private ScrollSlidingTabStrip stickersTab;
    private FrameLayout stickersTabContainer;
    private int stickersTabOffset;
    private Drawable[] tabIcons;
    private View topShadow;
    private TrendingAdapter trendingAdapter;
    private PagerSlidingTabStrip typeTabs;
    private ArrayList<View> views = new ArrayList<>();
    private boolean firstEmojiAttach = true;
    private int hasRecentEmoji = -1;
    private GifSearchPreloader gifSearchPreloader = new GifSearchPreloader();
    private final Map<String, TLRPC$messages_BotResults> gifCache = new HashMap();
    private boolean firstGifAttach = true;
    private int gifRecentTabNum = -2;
    private int gifTrendingTabNum = -2;
    private int gifFirstEmojiTabNum = -2;
    private boolean firstStickersAttach = true;
    private final int[] tabsMinusDy = new int[3];
    private ObjectAnimator[] tabsYAnimators = new ObjectAnimator[3];
    private int currentAccount = UserConfig.selectedAccount;
    private ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = new ArrayList<>();
    private ArrayList<TLRPC$Document> recentGifs = new ArrayList<>();
    private ArrayList<TLRPC$Document> recentStickers = new ArrayList<>();
    private ArrayList<TLRPC$Document> favouriteStickers = new ArrayList<>();
    private ArrayList<TLRPC$StickerSetCovered> featuredStickerSets = new ArrayList<>();
    private TLRPC$StickerSetCovered[] primaryInstallingStickerSets = new TLRPC$StickerSetCovered[10];
    private LongSparseArray<TLRPC$StickerSetCovered> installingStickerSets = new LongSparseArray<>();
    private LongSparseArray<TLRPC$StickerSetCovered> removingStickerSets = new LongSparseArray<>();
    private int[] location = new int[2];
    private int recentTabBum = -2;
    private int favTabBum = -2;
    private int trendingTabNum = -2;
    private int currentBackgroundType = -1;
    private Runnable checkExpandStickerTabsRunnable = new Runnable() {
        {
            EmojiView.this = this;
        }

        @Override
        public void run() {
            if (!EmojiView.this.stickersTab.isDragging()) {
                EmojiView.this.expandStickersByDragg = false;
                EmojiView.this.updateStickerTabsPosition();
            }
        }
    };
    private ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate = new ContentPreviewViewer.ContentPreviewViewerDelegate() {
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
        public boolean needSend() {
            return true;
        }

        @Override
        public void remove(SendMessagesHelper.ImportingSticker importingSticker) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$remove(this, importingSticker);
        }

        {
            EmojiView.this = this;
        }

        @Override
        public void sendSticker(TLRPC$Document tLRPC$Document, String str, Object obj, boolean z, int i) {
            EmojiView.this.delegate.onStickerSelected(null, tLRPC$Document, str, obj, null, z, i);
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
        public void openSet(TLRPC$InputStickerSet tLRPC$InputStickerSet, boolean z) {
            if (tLRPC$InputStickerSet != null) {
                EmojiView.this.delegate.onShowStickerSet(null, tLRPC$InputStickerSet);
            }
        }

        @Override
        public void sendGif(Object obj, Object obj2, boolean z, int i) {
            if (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifAdapter) {
                EmojiView.this.delegate.onGifSelected(null, obj, null, obj2, z, i);
            } else if (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifSearchAdapter) {
                EmojiView.this.delegate.onGifSelected(null, obj, null, obj2, z, i);
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
            } else if (EmojiView.this.emojiGridView.getAdapter() == EmojiView.this.emojiSearchAdapter) {
                return EmojiView.this.emojiSearchAdapter.lastSearchEmojiString;
            } else {
                return null;
            }
        }
    };
    Rect rect = new Rect();
    private int searchFieldHeight = AndroidUtilities.m34dp(64.0f);
    private String[] emojiTitles = {LocaleController.getString("Emoji1", C0952R.string.Emoji1), LocaleController.getString("Emoji2", C0952R.string.Emoji2), LocaleController.getString("Emoji3", C0952R.string.Emoji3), LocaleController.getString("Emoji4", C0952R.string.Emoji4), LocaleController.getString("Emoji5", C0952R.string.Emoji5), LocaleController.getString("Emoji6", C0952R.string.Emoji6), LocaleController.getString("Emoji7", C0952R.string.Emoji7), LocaleController.getString("Emoji8", C0952R.string.Emoji8)};

    public interface DragListener {
        void onDrag(int i);

        void onDragCancel();

        void onDragEnd(float f);

        void onDragStart();
    }

    public interface EmojiViewDelegate {

        public final class CC {
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

            public static void $default$onClearEmojiRecent(EmojiViewDelegate emojiViewDelegate) {
            }

            public static void $default$onGifSelected(EmojiViewDelegate emojiViewDelegate, View view, Object obj, String str, Object obj2, boolean z, int i) {
            }

            public static void $default$onSearchOpenClose(EmojiViewDelegate emojiViewDelegate, int i) {
            }

            public static void $default$onShowStickerSet(EmojiViewDelegate emojiViewDelegate, TLRPC$StickerSet tLRPC$StickerSet, TLRPC$InputStickerSet tLRPC$InputStickerSet) {
            }

            public static void $default$onStickerSelected(EmojiViewDelegate emojiViewDelegate, View view, TLRPC$Document tLRPC$Document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i) {
            }

            public static void $default$onStickerSetAdd(EmojiViewDelegate emojiViewDelegate, TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
            }

            public static void $default$onStickerSetRemove(EmojiViewDelegate emojiViewDelegate, TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
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

        boolean canSchedule();

        long getDialogId();

        float getProgressToSearchOpened();

        int getThreadId();

        void invalidateEnterView();

        boolean isExpanded();

        boolean isInScheduleMode();

        boolean isSearchOpened();

        boolean onBackspace();

        void onClearEmojiRecent();

        void onEmojiSelected(String str);

        void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i);

        void onSearchOpenClose(int i);

        void onShowStickerSet(TLRPC$StickerSet tLRPC$StickerSet, TLRPC$InputStickerSet tLRPC$InputStickerSet);

        void onStickerSelected(View view, TLRPC$Document tLRPC$Document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i);

        void onStickerSetAdd(TLRPC$StickerSetCovered tLRPC$StickerSetCovered);

        void onStickerSetRemove(TLRPC$StickerSetCovered tLRPC$StickerSetCovered);

        void onStickersGroupClick(long j);

        void onStickersSettingsClick();

        void onTabOpened(int i);

        void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout);
    }

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
        NOP = EmojiView$$ExternalSyntheticLambda4.INSTANCE;
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

    public class SearchField extends FrameLayout {
        private View backgroundView;
        private ImageView clearSearchImageView;
        private CloseProgressDrawable2 progressDrawable;
        private View searchBackground;
        private EditTextBoldCursor searchEditText;
        private ImageView searchIconImageView;
        private AnimatorSet shadowAnimator;
        private View shadowView;

        public SearchField(Context context, int i) {
            super(context);
            EmojiView.this = r13;
            View view = new View(context);
            this.shadowView = view;
            view.setAlpha(0.0f);
            this.shadowView.setTag(1);
            this.shadowView.setBackgroundColor(r13.getThemedColor("chat_emojiPanelShadowLine"));
            addView(this.shadowView, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83));
            View view2 = new View(context);
            this.backgroundView = view2;
            view2.setBackgroundColor(r13.getThemedColor("chat_emojiPanelBackground"));
            addView(this.backgroundView, new FrameLayout.LayoutParams(-1, r13.searchFieldHeight));
            View view3 = new View(context);
            this.searchBackground = view3;
            view3.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.m34dp(18.0f), r13.getThemedColor("chat_emojiSearchBackground")));
            addView(this.searchBackground, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 14.0f, 14.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.searchIconImageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.searchIconImageView.setImageResource(C0952R.C0953drawable.smiles_inputsearch);
            this.searchIconImageView.setColorFilter(new PorterDuffColorFilter(r13.getThemedColor("chat_emojiSearchIcon"), PorterDuff.Mode.MULTIPLY));
            addView(this.searchIconImageView, LayoutHelper.createFrame(36, 36.0f, 51, 16.0f, 14.0f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.clearSearchImageView = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            ImageView imageView3 = this.clearSearchImageView;
            CloseProgressDrawable2 closeProgressDrawable2 = new CloseProgressDrawable2(r13) {
                {
                    SearchField.this = this;
                }

                @Override
                protected int getCurrentColor() {
                    return EmojiView.this.getThemedColor("chat_emojiSearchIcon");
                }
            };
            this.progressDrawable = closeProgressDrawable2;
            imageView3.setImageDrawable(closeProgressDrawable2);
            this.progressDrawable.setSide(AndroidUtilities.m34dp(7.0f));
            this.clearSearchImageView.setScaleX(0.1f);
            this.clearSearchImageView.setScaleY(0.1f);
            this.clearSearchImageView.setAlpha(0.0f);
            addView(this.clearSearchImageView, LayoutHelper.createFrame(36, 36.0f, 53, 14.0f, 14.0f, 14.0f, 0.0f));
            this.clearSearchImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view4) {
                    EmojiView.SearchField.this.lambda$new$0(view4);
                }
            });
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context, r13, i) {
                final int val$type;

                {
                    SearchField.this = this;
                    this.val$type = i;
                }

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
                        EmojiViewDelegate emojiViewDelegate = EmojiView.this.delegate;
                        int i2 = 1;
                        if (this.val$type == 1) {
                            i2 = 2;
                        }
                        emojiViewDelegate.onSearchOpenClose(i2);
                        SearchField.this.searchEditText.requestFocus();
                        AndroidUtilities.showKeyboard(SearchField.this.searchEditText);
                    }
                    return super.onTouchEvent(motionEvent);
                }
            };
            this.searchEditText = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 16.0f);
            this.searchEditText.setHintTextColor(r13.getThemedColor("chat_emojiSearchIcon"));
            this.searchEditText.setTextColor(r13.getThemedColor("windowBackgroundWhiteBlackText"));
            this.searchEditText.setBackgroundDrawable(null);
            this.searchEditText.setPadding(0, 0, 0, 0);
            this.searchEditText.setMaxLines(1);
            this.searchEditText.setLines(1);
            this.searchEditText.setSingleLine(true);
            this.searchEditText.setImeOptions(268435459);
            if (i == 0) {
                this.searchEditText.setHint(LocaleController.getString("SearchStickersHint", C0952R.string.SearchStickersHint));
            } else if (i == 1) {
                this.searchEditText.setHint(LocaleController.getString("SearchEmojiHint", C0952R.string.SearchEmojiHint));
            } else if (i == 2) {
                this.searchEditText.setHint(LocaleController.getString("SearchGifsTitle", C0952R.string.SearchGifsTitle));
            }
            this.searchEditText.setCursorColor(r13.getThemedColor("featuredStickers_addedIcon"));
            this.searchEditText.setCursorSize(AndroidUtilities.m34dp(20.0f));
            this.searchEditText.setCursorWidth(1.5f);
            addView(this.searchEditText, LayoutHelper.createFrame(-1, 40.0f, 51, 54.0f, 12.0f, 46.0f, 0.0f));
            this.searchEditText.addTextChangedListener(new TextWatcher(r13, i) {
                final int val$type;

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                {
                    SearchField.this = this;
                    this.val$type = i;
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    boolean z = false;
                    boolean z2 = SearchField.this.searchEditText.length() > 0;
                    float f = 0.0f;
                    if (SearchField.this.clearSearchImageView.getAlpha() != 0.0f) {
                        z = true;
                    }
                    if (z2 != z) {
                        ViewPropertyAnimator animate = SearchField.this.clearSearchImageView.animate();
                        float f2 = 1.0f;
                        if (z2) {
                            f = 1.0f;
                        }
                        ViewPropertyAnimator scaleX = animate.alpha(f).setDuration(150L).scaleX(z2 ? 1.0f : 0.1f);
                        if (!z2) {
                            f2 = 0.1f;
                        }
                        scaleX.scaleY(f2).start();
                    }
                    int i2 = this.val$type;
                    if (i2 == 0) {
                        EmojiView.this.stickersSearchGridAdapter.search(SearchField.this.searchEditText.getText().toString());
                    } else if (i2 == 1) {
                        EmojiView.this.emojiSearchAdapter.search(SearchField.this.searchEditText.getText().toString());
                    } else if (i2 == 2) {
                        EmojiView.this.gifSearchAdapter.search(SearchField.this.searchEditText.getText().toString());
                    }
                }
            });
        }

        public void lambda$new$0(View view) {
            this.searchEditText.setText("");
            AndroidUtilities.showKeyboard(this.searchEditText);
        }

        public void hideKeyboard() {
            AndroidUtilities.hideKeyboard(this.searchEditText);
        }

        public void showShadow(boolean z, boolean z2) {
            if (z && this.shadowView.getTag() == null) {
                return;
            }
            if (z || this.shadowView.getTag() == null) {
                AnimatorSet animatorSet = this.shadowAnimator;
                Integer num = null;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.shadowAnimator = null;
                }
                View view = this.shadowView;
                if (!z) {
                    num = 1;
                }
                view.setTag(num);
                float f = 1.0f;
                if (z2) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.shadowAnimator = animatorSet2;
                    Animator[] animatorArr = new Animator[1];
                    View view2 = this.shadowView;
                    Property property = View.ALPHA;
                    float[] fArr = new float[1];
                    if (!z) {
                        f = 0.0f;
                    }
                    fArr[0] = f;
                    animatorArr[0] = ObjectAnimator.ofFloat(view2, property, fArr);
                    animatorSet2.playTogether(animatorArr);
                    this.shadowAnimator.setDuration(200L);
                    this.shadowAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    this.shadowAnimator.addListener(new AnimatorListenerAdapter() {
                        {
                            SearchField.this = this;
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            SearchField.this.shadowAnimator = null;
                        }
                    });
                    this.shadowAnimator.start();
                    return;
                }
                View view3 = this.shadowView;
                if (!z) {
                    f = 0.0f;
                }
                view3.setAlpha(f);
            }
        }
    }

    public class TypedScrollListener extends RecyclerView.OnScrollListener {
        private boolean smoothScrolling;
        private final int type;

        public TypedScrollListener(int i) {
            EmojiView.this = r1;
            this.type = i;
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (recyclerView.getLayoutManager().isSmoothScrolling()) {
                this.smoothScrolling = true;
            } else if (i == 0) {
                if (!this.smoothScrolling) {
                    EmojiView.this.animateTabsY(this.type);
                }
                if (EmojiView.this.ignoreStickersScroll) {
                    EmojiView.this.ignoreStickersScroll = false;
                }
                this.smoothScrolling = false;
            } else {
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
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            EmojiView.this.checkScroll(this.type);
            EmojiView.this.checkTabsY(this.type, i2);
            checkSearchFieldScroll();
            if (!this.smoothScrolling) {
                EmojiView.this.checkBottomTabScroll(i2);
            }
        }

        private void checkSearchFieldScroll() {
            int i = this.type;
            if (i == 0) {
                EmojiView.this.checkStickersSearchFieldScroll(false);
            } else if (i == 1) {
                EmojiView.this.checkEmojiSearchFieldScroll(false);
            } else if (i == 2) {
                EmojiView.this.checkGifSearchFieldScroll(false);
            }
        }
    }

    public class DraggableScrollSlidingTabStrip extends ScrollSlidingTabStrip {
        private float downX;
        private float downY;
        private boolean draggingHorizontally;
        private boolean draggingVertically;
        private boolean first = true;
        private float lastTranslateX;
        private float lastX;
        private boolean startedScroll;
        private final int touchSlop;
        private VelocityTracker vTracker;

        public DraggableScrollSlidingTabStrip(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            EmojiView.this = r1;
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
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
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
                } else {
                    EmojiView.this.dragListener.onDrag(Math.round(motionEvent.getRawY() - this.downY));
                }
                cancelLongPress();
                return true;
            }
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.startedScroll || this.lastX - motionEvent.getX() >= 0.0f) {
                    if (this.startedScroll && this.lastX - motionEvent.getX() > 0.0f && EmojiView.this.pager.isFakeDragging()) {
                        EmojiView.this.pager.endFakeDrag();
                        this.startedScroll = false;
                    }
                } else if (EmojiView.this.pager.beginFakeDrag()) {
                    this.startedScroll = true;
                    this.lastTranslateX = getTranslationX();
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
                    FileLog.m30e(e);
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

    private class ImageViewEmoji extends ImageView {
        private boolean isRecent;

        public ImageViewEmoji(Context context) {
            super(context);
            EmojiView.this = r2;
            setScaleType(ImageView.ScaleType.CENTER);
            setBackground(Theme.createRadSelectorDrawable(r2.getThemedColor("listSelectorSDK21"), AndroidUtilities.m34dp(2.0f), AndroidUtilities.m34dp(2.0f)));
        }

        public void sendEmoji(String str) {
            String str2;
            EmojiView.this.showBottomTab(true, true);
            String str3 = str != null ? str : (String) getTag();
            new SpannableStringBuilder().append((CharSequence) str3);
            if (str == null) {
                if (!this.isRecent && (str2 = Emoji.emojiColor.get(str3)) != null) {
                    str3 = EmojiView.addColorToCode(str3, str2);
                }
                EmojiView.this.addEmojiToRecent(str3);
                if (EmojiView.this.delegate != null) {
                    EmojiView.this.delegate.onEmojiSelected(Emoji.fixEmoji(str3));
                }
            } else if (EmojiView.this.delegate != null) {
                EmojiView.this.delegate.onEmojiSelected(Emoji.fixEmoji(str));
            }
        }

        public void setImageDrawable(Drawable drawable, boolean z) {
            super.setImageDrawable(drawable);
            this.isRecent = z;
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        }
    }

    public class EmojiPopupWindow extends PopupWindow {
        private ViewTreeObserver.OnScrollChangedListener mSuperScrollListener;
        private ViewTreeObserver mViewTreeObserver;

        public EmojiPopupWindow(EmojiView emojiView, View view, int i, int i2) {
            super(view, i, i2);
            init();
        }

        private void init() {
            if (EmojiView.superListenerField != null) {
                try {
                    this.mSuperScrollListener = (ViewTreeObserver.OnScrollChangedListener) EmojiView.superListenerField.get(this);
                    EmojiView.superListenerField.set(this, EmojiView.NOP);
                } catch (Exception unused) {
                    this.mSuperScrollListener = null;
                }
            }
        }

        private void unregisterListener() {
            ViewTreeObserver viewTreeObserver;
            if (this.mSuperScrollListener != null && (viewTreeObserver = this.mViewTreeObserver) != null) {
                if (viewTreeObserver.isAlive()) {
                    this.mViewTreeObserver.removeOnScrollChangedListener(this.mSuperScrollListener);
                }
                this.mViewTreeObserver = null;
            }
        }

        private void registerListener(View view) {
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

        @Override
        public void showAsDropDown(View view, int i, int i2) {
            try {
                super.showAsDropDown(view, i, i2);
                registerListener(view);
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }

        @Override
        public void update(View view, int i, int i2, int i3, int i4) {
            super.update(view, i, i2, i3, i4);
            registerListener(view);
        }

        @Override
        public void update(View view, int i, int i2) {
            super.update(view, i, i2);
            registerListener(view);
        }

        @Override
        public void showAtLocation(View view, int i, int i2, int i3) {
            super.showAtLocation(view, i, i2, i3);
            unregisterListener();
        }

        @Override
        public void dismiss() {
            setFocusable(false);
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            unregisterListener();
        }
    }

    public class EmojiColorPickerView extends View {
        private int arrowX;
        private String currentEmoji;
        private int selection;
        private Paint rectPaint = new Paint(1);
        private RectF rect = new RectF();
        private Drawable backgroundDrawable = getResources().getDrawable(C0952R.C0953drawable.stickers_back_all);
        private Drawable arrowDrawable = getResources().getDrawable(C0952R.C0953drawable.stickers_back_arrow);

        public void setEmoji(String str, int i) {
            this.currentEmoji = str;
            this.arrowX = i;
            this.rectPaint.setColor(788529152);
            invalidate();
        }

        public void setSelection(int i) {
            if (this.selection != i) {
                this.selection = i;
                invalidate();
            }
        }

        public int getSelection() {
            return this.selection;
        }

        public EmojiColorPickerView(Context context) {
            super(context);
            EmojiView.this = r3;
            Theme.setDrawableColor(this.backgroundDrawable, r3.getThemedColor("dialogBackground"));
            Theme.setDrawableColor(this.arrowDrawable, r3.getThemedColor("dialogBackground"));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int i = 0;
            this.backgroundDrawable.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.m34dp(AndroidUtilities.isTablet() ? 60.0f : 52.0f));
            this.backgroundDrawable.draw(canvas);
            Drawable drawable = this.arrowDrawable;
            int dp = this.arrowX - AndroidUtilities.m34dp(9.0f);
            float f = 55.5f;
            int dp2 = AndroidUtilities.m34dp(AndroidUtilities.isTablet() ? 55.5f : 47.5f);
            int dp3 = this.arrowX + AndroidUtilities.m34dp(9.0f);
            if (!AndroidUtilities.isTablet()) {
                f = 47.5f;
            }
            drawable.setBounds(dp, dp2, dp3, AndroidUtilities.m34dp(f + 8.0f));
            this.arrowDrawable.draw(canvas);
            if (this.currentEmoji != null) {
                while (i < 6) {
                    int dp4 = (EmojiView.this.emojiSize * i) + AndroidUtilities.m34dp((i * 4) + 5);
                    int dp5 = AndroidUtilities.m34dp(9.0f);
                    if (this.selection == i) {
                        this.rect.set(dp4, dp5 - ((int) AndroidUtilities.dpf2(3.5f)), EmojiView.this.emojiSize + dp4, EmojiView.this.emojiSize + dp5 + AndroidUtilities.m34dp(3.0f));
                        canvas.drawRoundRect(this.rect, AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(4.0f), this.rectPaint);
                    }
                    String str = this.currentEmoji;
                    if (i != 0) {
                        str = EmojiView.addColorToCode(str, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "🏿" : "🏾" : "🏽" : "🏼" : "🏻");
                    }
                    Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
                    if (emojiBigDrawable != null) {
                        emojiBigDrawable.setBounds(dp4, dp5, EmojiView.this.emojiSize + dp4, EmojiView.this.emojiSize + dp5);
                        emojiBigDrawable.draw(canvas);
                    }
                    i++;
                }
            }
        }
    }

    public EmojiView(boolean z, boolean z2, Context context, boolean z3, TLRPC$ChatFull tLRPC$ChatFull, ViewGroup viewGroup, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        int themedColor = getThemedColor("chat_emojiBottomPanelIcon");
        int argb = Color.argb(30, Color.red(themedColor), Color.green(themedColor), Color.blue(themedColor));
        this.needEmojiSearch = z3;
        this.tabIcons = new Drawable[]{Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.smiles_tab_smiles, getThemedColor("chat_emojiBottomPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.smiles_tab_gif, getThemedColor("chat_emojiBottomPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.smiles_tab_stickers, getThemedColor("chat_emojiBottomPanelIcon"), getThemedColor("chat_emojiPanelIconSelected"))};
        this.emojiIcons = new Drawable[]{Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.smiles_panel_recent, getThemedColor("chat_emojiPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.smiles_panel_smiles, getThemedColor("chat_emojiPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.smiles_panel_cat, getThemedColor("chat_emojiPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.smiles_panel_food, getThemedColor("chat_emojiPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.smiles_panel_activities, getThemedColor("chat_emojiPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.smiles_panel_travel, getThemedColor("chat_emojiPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.smiles_panel_objects, getThemedColor("chat_emojiPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.smiles_panel_other, getThemedColor("chat_emojiPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.smiles_panel_flags, getThemedColor("chat_emojiPanelIcon"), getThemedColor("chat_emojiPanelIconSelected"))};
        Drawable createEmojiIconSelectorDrawable = Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.emoji_tabs_new1, getThemedColor("chat_emojiBottomPanelIcon"), getThemedColor("chat_emojiPanelIconSelected"));
        this.searchIconDrawable = createEmojiIconSelectorDrawable;
        Drawable createEmojiIconSelectorDrawable2 = Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.emoji_tabs_new2, getThemedColor("chat_emojiPanelStickerPackSelectorLine"), getThemedColor("chat_emojiPanelStickerPackSelectorLine"));
        this.searchIconDotDrawable = createEmojiIconSelectorDrawable2;
        this.stickerIcons = new Drawable[]{Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.emoji_tabs_recent, getThemedColor("chat_emojiBottomPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.emoji_tabs_faves, getThemedColor("chat_emojiBottomPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.emoji_tabs_new3, getThemedColor("chat_emojiBottomPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), new LayerDrawable(new Drawable[]{createEmojiIconSelectorDrawable, createEmojiIconSelectorDrawable2})};
        this.gifIcons = new Drawable[]{Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.stickers_recent, getThemedColor("chat_emojiBottomPanelIcon"), getThemedColor("chat_emojiPanelIconSelected")), Theme.createEmojiIconSelectorDrawable(context, C0952R.C0953drawable.stickers_gifs_trending, getThemedColor("chat_emojiBottomPanelIcon"), getThemedColor("chat_emojiPanelIconSelected"))};
        this.info = tLRPC$ChatFull;
        Paint paint = new Paint(1);
        this.dotPaint = paint;
        paint.setColor(getThemedColor("chat_emojiPanelNewTrending"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            this.outlineProvider = new ViewOutlineProvider(this) {
                @Override
                @TargetApi(C0952R.styleable.MapAttrs_uiZoomGestures)
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getMeasuredWidth() - view.getPaddingRight(), view.getMeasuredHeight() - view.getPaddingBottom(), AndroidUtilities.m34dp(6.0f));
                }
            };
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.emojiContainer = frameLayout;
        this.views.add(frameLayout);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            private boolean ignoreLayout;

            {
                EmojiView.this = this;
            }

            @Override
            public void onMeasure(int i2, int i3) {
                this.ignoreLayout = true;
                EmojiView.this.emojiLayoutManager.setSpanCount(Math.max(1, View.MeasureSpec.getSize(i2) / AndroidUtilities.m34dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
                this.ignoreLayout = false;
                super.onMeasure(i2, i3);
            }

            @Override
            public void onLayout(boolean z4, int i2, int i3, int i4, int i5) {
                if (EmojiView.this.needEmojiSearch && EmojiView.this.firstEmojiAttach) {
                    this.ignoreLayout = true;
                    EmojiView.this.emojiLayoutManager.scrollToPositionWithOffset(1, 0);
                    EmojiView.this.firstEmojiAttach = false;
                    this.ignoreLayout = false;
                }
                super.onLayout(z4, i2, i3, i4, i5);
                EmojiView.this.checkEmojiSearchFieldScroll(true);
            }

            @Override
            public void requestLayout() {
                if (!this.ignoreLayout) {
                    super.requestLayout();
                }
            }

            @Override
            public boolean onTouchEvent(android.view.MotionEvent r12) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.EmojiView.C20074.onTouchEvent(android.view.MotionEvent):boolean");
            }
        };
        this.emojiGridView = recyclerListView;
        recyclerListView.setInstantClick(true);
        RecyclerListView recyclerListView2 = this.emojiGridView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 8);
        this.emojiLayoutManager = gridLayoutManager;
        recyclerListView2.setLayoutManager(gridLayoutManager);
        this.emojiGridView.setTopGlowOffset(AndroidUtilities.m34dp(38.0f));
        this.emojiGridView.setBottomGlowOffset(AndroidUtilities.m34dp(48.0f));
        this.emojiGridView.setPadding(0, AndroidUtilities.m34dp(38.0f), 0, AndroidUtilities.m34dp(44.0f));
        this.emojiGridView.setGlowColor(getThemedColor("chat_emojiPanelBackground"));
        this.emojiGridView.setSelectorDrawableColor(0);
        this.emojiGridView.setClipToPadding(false);
        this.emojiLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            {
                EmojiView.this = this;
            }

            @Override
            public int getSpanSize(int i2) {
                if (EmojiView.this.emojiGridView.getAdapter() == EmojiView.this.emojiSearchAdapter) {
                    if (i2 == 0 || (i2 == 1 && EmojiView.this.emojiSearchAdapter.searchWas && EmojiView.this.emojiSearchAdapter.result.isEmpty())) {
                        return EmojiView.this.emojiLayoutManager.getSpanCount();
                    }
                } else if ((EmojiView.this.needEmojiSearch && i2 == 0) || EmojiView.this.emojiAdapter.positionToSection.indexOfKey(i2) >= 0) {
                    return EmojiView.this.emojiLayoutManager.getSpanCount();
                }
                return 1;
            }
        });
        RecyclerListView recyclerListView3 = this.emojiGridView;
        EmojiGridAdapter emojiGridAdapter = new EmojiGridAdapter();
        this.emojiAdapter = emojiGridAdapter;
        recyclerListView3.setAdapter(emojiGridAdapter);
        this.emojiSearchAdapter = new EmojiSearchAdapter();
        this.emojiContainer.addView(this.emojiGridView, LayoutHelper.createFrame(-1, -1.0f));
        this.emojiGridView.setOnScrollListener(new TypedScrollListener(1) {
            {
                EmojiView.this = this;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                int i4;
                int findFirstVisibleItemPosition = EmojiView.this.emojiLayoutManager.findFirstVisibleItemPosition();
                if (findFirstVisibleItemPosition != -1) {
                    int size = Emoji.recentEmoji.size() + (EmojiView.this.needEmojiSearch ? 1 : 0);
                    if (findFirstVisibleItemPosition >= size) {
                        int i5 = 0;
                        while (true) {
                            String[][] strArr = EmojiData.dataColored;
                            if (i5 >= strArr.length) {
                                break;
                            }
                            size += strArr[i5].length + 1;
                            if (findFirstVisibleItemPosition < size) {
                                i4 = i5 + (!Emoji.recentEmoji.isEmpty() ? 1 : 0);
                                break;
                            }
                            i5++;
                        }
                        EmojiView.this.emojiTabs.onPageScrolled(i4, 0);
                    }
                    i4 = 0;
                    EmojiView.this.emojiTabs.onPageScrolled(i4, 0);
                }
                super.onScrolled(recyclerView, i2, i3);
            }
        });
        this.emojiGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            {
                EmojiView.this = this;
            }

            @Override
            public void onItemClick(View view, int i2) {
                if (view instanceof ImageViewEmoji) {
                    ((ImageViewEmoji) view).sendEmoji(null);
                    EmojiView.this.performHapticFeedback(3, 1);
                }
            }
        });
        this.emojiGridView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            {
                EmojiView.this = this;
            }

            @Override
            public boolean onItemClick(android.view.View r18, int r19) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.EmojiView.C20118.onItemClick(android.view.View, int):boolean");
            }
        });
        this.emojiTabs = new ScrollSlidingTabStrip(context, resourcesProvider) {
            {
                EmojiView.this = this;
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                if (EmojiView.this.emojiTabsShadow != null) {
                    EmojiView.this.emojiTabsShadow.setTranslationY(f);
                }
            }
        };
        if (z3) {
            SearchField searchField = new SearchField(context, 1);
            this.emojiSearchField = searchField;
            this.emojiContainer.addView(searchField, new FrameLayout.LayoutParams(-1, this.searchFieldHeight + AndroidUtilities.getShadowHeight()));
            this.emojiSearchField.searchEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                {
                    EmojiView.this = this;
                }

                @Override
                public void onFocusChange(View view, boolean z4) {
                    if (z4) {
                        EmojiView.this.lastSearchKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                        MediaDataController.getInstance(EmojiView.this.currentAccount).fetchNewEmojiKeywords(EmojiView.this.lastSearchKeyboardLanguage);
                    }
                }
            });
        }
        this.emojiTabs.setShouldExpand(true);
        this.emojiTabs.setIndicatorHeight(-1);
        this.emojiTabs.setUnderlineHeight(-1);
        this.emojiTabs.setBackgroundColor(getThemedColor("chat_emojiPanelBackground"));
        this.emojiContainer.addView(this.emojiTabs, LayoutHelper.createFrame(-1, 38.0f));
        this.emojiTabs.setDelegate(new ScrollSlidingTabStrip.ScrollSlidingTabStripDelegate() {
            {
                EmojiView.this = this;
            }

            @Override
            public void onPageSelected(int i2) {
                if (!Emoji.recentEmoji.isEmpty()) {
                    if (i2 == 0) {
                        EmojiView.this.emojiLayoutManager.scrollToPositionWithOffset(EmojiView.this.needEmojiSearch ? 1 : 0, 0);
                        return;
                    }
                    i2--;
                }
                EmojiView.this.emojiGridView.stopScroll();
                EmojiView.this.emojiLayoutManager.scrollToPositionWithOffset(EmojiView.this.emojiAdapter.sectionToPosition.get(i2), 0);
                EmojiView.this.checkEmojiTabY(null, 0);
            }
        });
        View view = new View(context);
        this.emojiTabsShadow = view;
        view.setAlpha(0.0f);
        this.emojiTabsShadow.setTag(1);
        this.emojiTabsShadow.setBackgroundColor(getThemedColor("chat_emojiPanelShadowLine"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.m34dp(38.0f);
        this.emojiContainer.addView(this.emojiTabsShadow, layoutParams);
        if (z) {
            if (z2) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.gifContainer = frameLayout2;
                this.views.add(frameLayout2);
                RecyclerListView recyclerListView4 = new RecyclerListView(context) {
                    private boolean ignoreLayout;
                    private boolean wasMeasured;

                    {
                        EmojiView.this = this;
                    }

                    @Override
                    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                        return super.onInterceptTouchEvent(motionEvent) || ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, EmojiView.this.gifGridView, 0, EmojiView.this.contentPreviewViewerDelegate, this.resourcesProvider);
                    }

                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, i3);
                        if (!this.wasMeasured) {
                            EmojiView.this.gifAdapter.notifyDataSetChanged();
                            this.wasMeasured = true;
                        }
                    }

                    @Override
                    public void onLayout(boolean z4, int i2, int i3, int i4, int i5) {
                        if (EmojiView.this.firstGifAttach && EmojiView.this.gifAdapter.getItemCount() > 1) {
                            this.ignoreLayout = true;
                            EmojiView.this.gifLayoutManager.scrollToPositionWithOffset(1, 0);
                            EmojiView.this.gifSearchField.setVisibility(0);
                            EmojiView.this.gifTabs.onPageScrolled(0, 0);
                            EmojiView.this.firstGifAttach = false;
                            this.ignoreLayout = false;
                        }
                        super.onLayout(z4, i2, i3, i4, i5);
                        EmojiView.this.checkGifSearchFieldScroll(true);
                    }

                    @Override
                    public void requestLayout() {
                        if (!this.ignoreLayout) {
                            super.requestLayout();
                        }
                    }
                };
                this.gifGridView = recyclerListView4;
                recyclerListView4.setClipToPadding(false);
                RecyclerListView recyclerListView5 = this.gifGridView;
                GifLayoutManager gifLayoutManager = new GifLayoutManager(context);
                this.gifLayoutManager = gifLayoutManager;
                recyclerListView5.setLayoutManager(gifLayoutManager);
                this.gifGridView.addItemDecoration(new RecyclerView.ItemDecoration() {
                    {
                        EmojiView.this = this;
                    }

                    @Override
                    public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                        int i2 = 0;
                        if (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifAdapter && childAdapterPosition == EmojiView.this.gifAdapter.trendingSectionItem) {
                            rect.set(0, 0, 0, 0);
                        } else if (childAdapterPosition != 0) {
                            rect.left = 0;
                            rect.bottom = 0;
                            rect.top = AndroidUtilities.m34dp(2.0f);
                            if (!EmojiView.this.gifLayoutManager.isLastInRow(childAdapterPosition - 1)) {
                                i2 = AndroidUtilities.m34dp(2.0f);
                            }
                            rect.right = i2;
                        } else {
                            rect.set(0, 0, 0, 0);
                        }
                    }
                });
                this.gifGridView.setPadding(0, AndroidUtilities.m34dp(52.0f), 0, AndroidUtilities.m34dp(44.0f));
                this.gifGridView.setOverScrollMode(2);
                ((SimpleItemAnimator) this.gifGridView.getItemAnimator()).setSupportsChangeAnimations(false);
                RecyclerListView recyclerListView6 = this.gifGridView;
                GifAdapter gifAdapter = new GifAdapter(this, context, true);
                this.gifAdapter = gifAdapter;
                recyclerListView6.setAdapter(gifAdapter);
                this.gifSearchAdapter = new GifAdapter(this, context);
                this.gifGridView.setOnScrollListener(new TypedScrollListener(2));
                this.gifGridView.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        boolean lambda$new$1;
                        lambda$new$1 = EmojiView.this.lambda$new$1(resourcesProvider, view2, motionEvent);
                        return lambda$new$1;
                    }
                });
                RecyclerListView.OnItemClickListener emojiView$$ExternalSyntheticLambda7 = new RecyclerListView.OnItemClickListener() {
                    @Override
                    public final void onItemClick(View view2, int i2) {
                        EmojiView.this.lambda$new$2(view2, i2);
                    }
                };
                this.gifOnItemClickListener = emojiView$$ExternalSyntheticLambda7;
                this.gifGridView.setOnItemClickListener(emojiView$$ExternalSyntheticLambda7);
                this.gifContainer.addView(this.gifGridView, LayoutHelper.createFrame(-1, -1.0f));
                SearchField searchField2 = new SearchField(context, 2);
                this.gifSearchField = searchField2;
                searchField2.setVisibility(4);
                this.gifContainer.addView(this.gifSearchField, new FrameLayout.LayoutParams(-1, this.searchFieldHeight + AndroidUtilities.getShadowHeight()));
                DraggableScrollSlidingTabStrip draggableScrollSlidingTabStrip = new DraggableScrollSlidingTabStrip(context, resourcesProvider);
                this.gifTabs = draggableScrollSlidingTabStrip;
                draggableScrollSlidingTabStrip.setType(ScrollSlidingTabStrip.Type.TAB);
                this.gifTabs.setUnderlineHeight(AndroidUtilities.getShadowHeight());
                this.gifTabs.setIndicatorColor(getThemedColor("chat_emojiPanelStickerPackSelectorLine"));
                this.gifTabs.setUnderlineColor(getThemedColor("chat_emojiPanelShadowLine"));
                this.gifTabs.setBackgroundColor(getThemedColor("chat_emojiPanelBackground"));
                this.gifContainer.addView(this.gifTabs, LayoutHelper.createFrame(-1, 36, 51));
                updateGifTabs();
                this.gifTabs.setDelegate(new ScrollSlidingTabStrip.ScrollSlidingTabStripDelegate() {
                    @Override
                    public final void onPageSelected(int i2) {
                        EmojiView.this.lambda$new$3(i2);
                    }
                });
                this.gifAdapter.loadTrendingGifs();
            }
            this.stickersContainer = new FrameLayout(context) {
                {
                    EmojiView.this = this;
                }

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
            };
            MediaDataController.getInstance(this.currentAccount).checkStickers(0);
            MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
            RecyclerListView recyclerListView7 = new RecyclerListView(context) {
                boolean ignoreLayout;

                {
                    EmojiView.this = this;
                }

                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    return super.onInterceptTouchEvent(motionEvent) || ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, EmojiView.this.stickersGridView, EmojiView.this.getMeasuredHeight(), EmojiView.this.contentPreviewViewerDelegate, this.resourcesProvider);
                }

                @Override
                public void setVisibility(int i2) {
                    super.setVisibility(i2);
                }

                @Override
                public void onLayout(boolean z4, int i2, int i3, int i4, int i5) {
                    if (EmojiView.this.firstStickersAttach && EmojiView.this.stickersGridAdapter.getItemCount() > 0) {
                        this.ignoreLayout = true;
                        EmojiView.this.stickersLayoutManager.scrollToPositionWithOffset(1, 0);
                        EmojiView.this.firstStickersAttach = false;
                        this.ignoreLayout = false;
                    }
                    super.onLayout(z4, i2, i3, i4, i5);
                    EmojiView.this.checkStickersSearchFieldScroll(true);
                }

                @Override
                public void requestLayout() {
                    if (!this.ignoreLayout) {
                        super.requestLayout();
                    }
                }
            };
            this.stickersGridView = recyclerListView7;
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(context, 5) {
                {
                    EmojiView.this = this;
                }

                @Override
                public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
                    try {
                        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 2);
                        linearSmoothScrollerCustom.setTargetPosition(i2);
                        startSmoothScroll(linearSmoothScrollerCustom);
                    } catch (Exception e) {
                        FileLog.m30e(e);
                    }
                }

                @Override
                public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    int scrollVerticallyBy = super.scrollVerticallyBy(i2, recycler, state);
                    if (scrollVerticallyBy != 0 && EmojiView.this.stickersGridView.getScrollState() == 1) {
                        EmojiView.this.expandStickersByDragg = false;
                        EmojiView.this.updateStickerTabsPosition();
                    }
                    if (EmojiView.this.chooseStickerActionTracker == null) {
                        EmojiView.this.createStickersChooseActionTracker();
                    }
                    EmojiView.this.chooseStickerActionTracker.doSomeAction();
                    return scrollVerticallyBy;
                }
            };
            this.stickersLayoutManager = gridLayoutManager2;
            recyclerListView7.setLayoutManager(gridLayoutManager2);
            this.stickersLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                {
                    EmojiView.this = this;
                }

                @Override
                public int getSpanSize(int i2) {
                    if (EmojiView.this.stickersGridView.getAdapter() == EmojiView.this.stickersGridAdapter) {
                        if (i2 == 0) {
                            return EmojiView.this.stickersGridAdapter.stickersPerRow;
                        }
                        if (i2 == EmojiView.this.stickersGridAdapter.totalItems || (EmojiView.this.stickersGridAdapter.cache.get(i2) != null && !(EmojiView.this.stickersGridAdapter.cache.get(i2) instanceof TLRPC$Document))) {
                            return EmojiView.this.stickersGridAdapter.stickersPerRow;
                        }
                        return 1;
                    } else if (i2 == EmojiView.this.stickersSearchGridAdapter.totalItems || (EmojiView.this.stickersSearchGridAdapter.cache.get(i2) != null && !(EmojiView.this.stickersSearchGridAdapter.cache.get(i2) instanceof TLRPC$Document))) {
                        return EmojiView.this.stickersGridAdapter.stickersPerRow;
                    } else {
                        return 1;
                    }
                }
            });
            this.stickersGridView.setPadding(0, AndroidUtilities.m34dp(52.0f), 0, AndroidUtilities.m34dp(44.0f));
            this.stickersGridView.setClipToPadding(false);
            this.views.add(this.stickersContainer);
            this.stickersSearchGridAdapter = new StickersSearchGridAdapter(context);
            RecyclerListView recyclerListView8 = this.stickersGridView;
            StickersGridAdapter stickersGridAdapter = new StickersGridAdapter(context);
            this.stickersGridAdapter = stickersGridAdapter;
            recyclerListView8.setAdapter(stickersGridAdapter);
            this.stickersGridView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean lambda$new$4;
                    lambda$new$4 = EmojiView.this.lambda$new$4(resourcesProvider, view2, motionEvent);
                    return lambda$new$4;
                }
            });
            RecyclerListView.OnItemClickListener emojiView$$ExternalSyntheticLambda8 = new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view2, int i2) {
                    EmojiView.this.lambda$new$5(view2, i2);
                }
            };
            this.stickersOnItemClickListener = emojiView$$ExternalSyntheticLambda8;
            this.stickersGridView.setOnItemClickListener(emojiView$$ExternalSyntheticLambda8);
            this.stickersGridView.setGlowColor(getThemedColor("chat_emojiPanelBackground"));
            this.stickersContainer.addView(this.stickersGridView);
            this.scrollHelper = new RecyclerAnimationScrollHelper(this.stickersGridView, this.stickersLayoutManager);
            SearchField searchField3 = new SearchField(context, 0);
            this.stickersSearchField = searchField3;
            this.stickersContainer.addView(searchField3, new FrameLayout.LayoutParams(-1, this.searchFieldHeight + AndroidUtilities.getShadowHeight()));
            C198518 r5 = new C198518(context, resourcesProvider);
            this.stickersTab = r5;
            r5.setDragEnabled(true);
            this.stickersTab.setWillNotDraw(false);
            this.stickersTab.setType(ScrollSlidingTabStrip.Type.TAB);
            this.stickersTab.setUnderlineHeight(AndroidUtilities.getShadowHeight());
            this.stickersTab.setIndicatorColor(getThemedColor("chat_emojiPanelStickerPackSelectorLine"));
            this.stickersTab.setUnderlineColor(getThemedColor("chat_emojiPanelShadowLine"));
            if (viewGroup != null) {
                FrameLayout frameLayout3 = new FrameLayout(context) {
                    Paint paint = new Paint();

                    {
                        EmojiView.this = this;
                    }

                    @Override
                    protected void dispatchDraw(Canvas canvas) {
                        EmojiView.this.delegate.getProgressToSearchOpened();
                        float dp = AndroidUtilities.m34dp(50.0f) * EmojiView.this.delegate.getProgressToSearchOpened();
                        if (dp <= getMeasuredHeight()) {
                            canvas.save();
                            if (dp != 0.0f) {
                                canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
                            }
                            this.paint.setColor(EmojiView.this.getThemedColor("chat_emojiPanelBackground"));
                            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.m34dp(48.0f) + EmojiView.this.stickersTab.getExpandedOffset(), this.paint);
                            super.dispatchDraw(canvas);
                            EmojiView.this.stickersTab.drawOverlays(canvas);
                            canvas.restore();
                        }
                    }

                    @Override
                    protected void onLayout(boolean z4, int i2, int i3, int i4, int i5) {
                        super.onLayout(z4, i2, i3, i4, i5);
                        EmojiView.this.updateStickerTabsPosition();
                    }
                };
                this.stickersTabContainer = frameLayout3;
                frameLayout3.addView(this.stickersTab, LayoutHelper.createFrame(-1, 48, 51));
                viewGroup.addView(this.stickersTabContainer, LayoutHelper.createFrame(-1, -2.0f));
            } else {
                this.stickersContainer.addView(this.stickersTab, LayoutHelper.createFrame(-1, 48, 51));
            }
            updateStickerTabs();
            this.stickersTab.setDelegate(new ScrollSlidingTabStrip.ScrollSlidingTabStripDelegate() {
                @Override
                public final void onPageSelected(int i2) {
                    EmojiView.this.lambda$new$6(i2);
                }
            });
            this.stickersGridView.setOnScrollListener(new TypedScrollListener(0));
        }
        ViewPager viewPager = new ViewPager(context) {
            {
                EmojiView.this = this;
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public void setCurrentItem(int i2, boolean z4) {
                EmojiView.this.startStopVisibleGifs(i2 == 1);
                if (i2 != getCurrentItem()) {
                    super.setCurrentItem(i2, z4);
                } else if (i2 == 0) {
                    EmojiView.this.emojiGridView.smoothScrollToPosition(EmojiView.this.needEmojiSearch ? 1 : 0);
                } else if (i2 == 1) {
                    EmojiView.this.gifGridView.smoothScrollToPosition(1);
                } else {
                    EmojiView.this.stickersGridView.smoothScrollToPosition(1);
                }
            }
        };
        this.pager = viewPager;
        viewPager.setAdapter(new EmojiPagesAdapter());
        View view2 = new View(context);
        this.topShadow = view2;
        view2.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, -1907225));
        addView(this.topShadow, LayoutHelper.createFrame(-1, 6.0f));
        ImageView imageView = new ImageView(context) {
            {
                EmojiView.this = this;
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    EmojiView.this.backspacePressed = true;
                    EmojiView.this.backspaceOnce = false;
                    EmojiView.this.postBackspaceRunnable(350);
                } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    EmojiView.this.backspacePressed = false;
                    if (!EmojiView.this.backspaceOnce && EmojiView.this.delegate != null && EmojiView.this.delegate.onBackspace()) {
                        EmojiView.this.backspaceButton.performHapticFeedback(3);
                    }
                }
                super.onTouchEvent(motionEvent);
                return true;
            }
        };
        this.backspaceButton = imageView;
        imageView.setHapticFeedbackEnabled(true);
        this.backspaceButton.setImageResource(C0952R.C0953drawable.smiles_tab_clear);
        this.backspaceButton.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_emojiPanelBackspace"), PorterDuff.Mode.MULTIPLY));
        this.backspaceButton.setScaleType(ImageView.ScaleType.CENTER);
        this.backspaceButton.setContentDescription(LocaleController.getString("AccDescrBackspace", C0952R.string.AccDescrBackspace));
        this.backspaceButton.setFocusable(true);
        this.backspaceButton.setOnClickListener(new View.OnClickListener(this) {
            @Override
            public void onClick(View view3) {
            }
        });
        this.bottomTabContainer = new FrameLayout(this, context) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        View view3 = new View(context);
        this.shadowLine = view3;
        view3.setBackgroundColor(getThemedColor("chat_emojiPanelShadowLine"));
        this.bottomTabContainer.addView(this.shadowLine, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight()));
        View view4 = new View(context);
        this.bottomTabContainerBackground = view4;
        this.bottomTabContainer.addView(view4, new FrameLayout.LayoutParams(-1, AndroidUtilities.m34dp(44.0f), 83));
        int i2 = 40;
        int i3 = 44;
        if (z3) {
            addView(this.bottomTabContainer, new FrameLayout.LayoutParams(-1, AndroidUtilities.m34dp(44.0f) + AndroidUtilities.getShadowHeight(), 83));
            this.bottomTabContainer.addView(this.backspaceButton, LayoutHelper.createFrame(52, 44, 85));
            if (i >= 21) {
                this.backspaceButton.setBackground(Theme.createSelectorDrawable(argb));
            }
            ImageView imageView2 = new ImageView(context);
            this.stickerSettingsButton = imageView2;
            imageView2.setImageResource(C0952R.C0953drawable.smiles_tab_settings);
            this.stickerSettingsButton.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_emojiPanelBackspace"), PorterDuff.Mode.MULTIPLY));
            this.stickerSettingsButton.setScaleType(ImageView.ScaleType.CENTER);
            this.stickerSettingsButton.setFocusable(true);
            if (i >= 21) {
                this.stickerSettingsButton.setBackground(Theme.createSelectorDrawable(argb));
            }
            this.stickerSettingsButton.setContentDescription(LocaleController.getString("Settings", C0952R.string.Settings));
            this.bottomTabContainer.addView(this.stickerSettingsButton, LayoutHelper.createFrame(52, 44, 85));
            this.stickerSettingsButton.setOnClickListener(new View.OnClickListener() {
                {
                    EmojiView.this = this;
                }

                @Override
                public void onClick(View view5) {
                    if (EmojiView.this.delegate != null) {
                        EmojiView.this.delegate.onStickersSettingsClick();
                    }
                }
            });
            PagerSlidingTabStrip pagerSlidingTabStrip = new PagerSlidingTabStrip(context, resourcesProvider);
            this.typeTabs = pagerSlidingTabStrip;
            pagerSlidingTabStrip.setViewPager(this.pager);
            this.typeTabs.setShouldExpand(false);
            this.typeTabs.setIndicatorHeight(0);
            this.typeTabs.setUnderlineHeight(0);
            this.typeTabs.setTabPaddingLeftRight(AndroidUtilities.m34dp(10.0f));
            this.bottomTabContainer.addView(this.typeTabs, LayoutHelper.createFrame(-2, 44, 81));
            this.typeTabs.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrollStateChanged(int i4) {
                }

                {
                    EmojiView.this = this;
                }

                @Override
                public void onPageScrolled(int i4, float f, int i5) {
                    EmojiView.this.checkGridVisibility(i4, f);
                    EmojiView emojiView = EmojiView.this;
                    emojiView.onPageScrolled(i4, (emojiView.getMeasuredWidth() - EmojiView.this.getPaddingLeft()) - EmojiView.this.getPaddingRight(), i5);
                    boolean z4 = true;
                    EmojiView.this.showBottomTab(true, true);
                    int currentItem = EmojiView.this.pager.getCurrentItem();
                    SearchField searchField4 = currentItem == 0 ? EmojiView.this.emojiSearchField : currentItem == 1 ? EmojiView.this.gifSearchField : EmojiView.this.stickersSearchField;
                    String obj = searchField4.searchEditText.getText().toString();
                    int i6 = 0;
                    while (i6 < 3) {
                        SearchField searchField5 = i6 == 0 ? EmojiView.this.emojiSearchField : i6 == 1 ? EmojiView.this.gifSearchField : EmojiView.this.stickersSearchField;
                        if (!(searchField5 == null || searchField5 == searchField4 || searchField5.searchEditText == null || searchField5.searchEditText.getText().toString().equals(obj))) {
                            searchField5.searchEditText.setText(obj);
                            searchField5.searchEditText.setSelection(obj.length());
                        }
                        i6++;
                    }
                    EmojiView emojiView2 = EmojiView.this;
                    if ((i4 != 0 || f <= 0.0f) && i4 != 1) {
                        z4 = false;
                    }
                    emojiView2.startStopVisibleGifs(z4);
                    EmojiView.this.updateStickerTabsPosition();
                }

                @Override
                public void onPageSelected(int i4) {
                    EmojiView.this.saveNewPage();
                    boolean z4 = false;
                    EmojiView.this.showBackspaceButton(i4 == 0, true);
                    EmojiView emojiView = EmojiView.this;
                    if (i4 == 2) {
                        z4 = true;
                    }
                    emojiView.showStickerSettingsButton(z4, true);
                    if (!EmojiView.this.delegate.isSearchOpened()) {
                        return;
                    }
                    if (i4 == 0) {
                        if (EmojiView.this.emojiSearchField != null) {
                            EmojiView.this.emojiSearchField.searchEditText.requestFocus();
                        }
                    } else if (i4 == 1) {
                        if (EmojiView.this.gifSearchField != null) {
                            EmojiView.this.gifSearchField.searchEditText.requestFocus();
                        }
                    } else if (EmojiView.this.stickersSearchField != null) {
                        EmojiView.this.stickersSearchField.searchEditText.requestFocus();
                    }
                }
            });
            ImageView imageView3 = new ImageView(context);
            this.searchButton = imageView3;
            imageView3.setImageResource(C0952R.C0953drawable.smiles_tab_search);
            this.searchButton.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_emojiPanelBackspace"), PorterDuff.Mode.MULTIPLY));
            this.searchButton.setScaleType(ImageView.ScaleType.CENTER);
            this.searchButton.setContentDescription(LocaleController.getString("Search", C0952R.string.Search));
            this.searchButton.setFocusable(true);
            if (i >= 21) {
                this.searchButton.setBackground(Theme.createSelectorDrawable(argb));
            }
            this.bottomTabContainer.addView(this.searchButton, LayoutHelper.createFrame(52, 44, 83));
            this.searchButton.setOnClickListener(new View.OnClickListener() {
                {
                    EmojiView.this = this;
                }

                @Override
                public void onClick(View view5) {
                    int currentItem = EmojiView.this.pager.getCurrentItem();
                    SearchField searchField4 = currentItem == 0 ? EmojiView.this.emojiSearchField : currentItem == 1 ? EmojiView.this.gifSearchField : EmojiView.this.stickersSearchField;
                    if (searchField4 != null) {
                        searchField4.searchEditText.requestFocus();
                        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
                        searchField4.searchEditText.onTouchEvent(obtain);
                        obtain.recycle();
                        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
                        searchField4.searchEditText.onTouchEvent(obtain2);
                        obtain2.recycle();
                    }
                }
            });
        } else {
            addView(this.bottomTabContainer, LayoutHelper.createFrame((i >= 21 ? 40 : 44) + 20, (i >= 21 ? 40 : 44) + 12, (LocaleController.isRTL ? 3 : 5) | 80, 0.0f, 0.0f, 2.0f, 0.0f));
            Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.m34dp(56.0f), getThemedColor("chat_emojiPanelBackground"), getThemedColor("chat_emojiPanelBackground"));
            if (i < 21) {
                Drawable mutate = context.getResources().getDrawable(C0952R.C0953drawable.floating_shadow).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, createSimpleSelectorCircleDrawable, 0, 0);
                combinedDrawable.setIconSize(AndroidUtilities.m34dp(40.0f), AndroidUtilities.m34dp(40.0f));
                createSimpleSelectorCircleDrawable = combinedDrawable;
            } else {
                StateListAnimator stateListAnimator = new StateListAnimator();
                ImageView imageView4 = this.floatingButton;
                Property property = View.TRANSLATION_Z;
                stateListAnimator.addState(new int[]{16842919}, ObjectAnimator.ofFloat(imageView4, property, AndroidUtilities.m34dp(2.0f), AndroidUtilities.m34dp(4.0f)).setDuration(200L));
                stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this.floatingButton, property, AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(2.0f)).setDuration(200L));
                this.backspaceButton.setStateListAnimator(stateListAnimator);
                this.backspaceButton.setOutlineProvider(new ViewOutlineProvider(this) {
                    @Override
                    @SuppressLint({"NewApi"})
                    public void getOutline(View view5, Outline outline) {
                        outline.setOval(0, 0, AndroidUtilities.m34dp(40.0f), AndroidUtilities.m34dp(40.0f));
                    }
                });
            }
            this.backspaceButton.setPadding(0, 0, AndroidUtilities.m34dp(2.0f), 0);
            this.backspaceButton.setBackground(createSimpleSelectorCircleDrawable);
            this.backspaceButton.setContentDescription(LocaleController.getString("AccDescrBackspace", C0952R.string.AccDescrBackspace));
            this.backspaceButton.setFocusable(true);
            this.bottomTabContainer.addView(this.backspaceButton, LayoutHelper.createFrame(i >= 21 ? 40 : 44, i >= 21 ? 40 : i3, 51, 10.0f, 0.0f, 10.0f, 0.0f));
            this.shadowLine.setVisibility(8);
            this.bottomTabContainerBackground.setVisibility(8);
        }
        addView(this.pager, 0, LayoutHelper.createFrame(-1, -1, 51));
        CorrectlyMeasuringTextView correctlyMeasuringTextView = new CorrectlyMeasuringTextView(context);
        this.mediaBanTooltip = correctlyMeasuringTextView;
        correctlyMeasuringTextView.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.m34dp(3.0f), getThemedColor("chat_gifSaveHintBackground")));
        this.mediaBanTooltip.setTextColor(getThemedColor("chat_gifSaveHintText"));
        this.mediaBanTooltip.setPadding(AndroidUtilities.m34dp(8.0f), AndroidUtilities.m34dp(7.0f), AndroidUtilities.m34dp(8.0f), AndroidUtilities.m34dp(7.0f));
        this.mediaBanTooltip.setGravity(16);
        this.mediaBanTooltip.setTextSize(1, 14.0f);
        this.mediaBanTooltip.setVisibility(4);
        addView(this.mediaBanTooltip, LayoutHelper.createFrame(-2, -2.0f, 81, 5.0f, 0.0f, 5.0f, 53.0f));
        this.emojiSize = AndroidUtilities.m34dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        this.pickerView = new EmojiColorPickerView(context);
        EmojiColorPickerView emojiColorPickerView = this.pickerView;
        int dp = AndroidUtilities.m34dp(((!AndroidUtilities.isTablet() ? 32 : i2) * 6) + 10 + 20);
        this.popupWidth = dp;
        int dp2 = AndroidUtilities.m34dp(AndroidUtilities.isTablet() ? 64.0f : 56.0f);
        this.popupHeight = dp2;
        EmojiPopupWindow emojiPopupWindow = new EmojiPopupWindow(this, emojiColorPickerView, dp, dp2);
        this.pickerViewPopup = emojiPopupWindow;
        emojiPopupWindow.setOutsideTouchable(true);
        this.pickerViewPopup.setClippingEnabled(true);
        this.pickerViewPopup.setInputMethodMode(2);
        this.pickerViewPopup.setSoftInputMode(0);
        this.pickerViewPopup.getContentView().setFocusableInTouchMode(true);
        this.pickerViewPopup.getContentView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public final boolean onKey(View view5, int i4, KeyEvent keyEvent) {
                boolean lambda$new$7;
                lambda$new$7 = EmojiView.this.lambda$new$7(view5, i4, keyEvent);
                return lambda$new$7;
            }
        });
        this.currentPage = MessagesController.getGlobalEmojiSettings().getInt("selected_page", 0);
        Emoji.loadRecentEmoji();
        this.emojiAdapter.notifyDataSetChanged();
        if (this.typeTabs == null) {
            return;
        }
        if (this.views.size() == 1 && this.typeTabs.getVisibility() == 0) {
            this.typeTabs.setVisibility(4);
        } else if (this.views.size() != 1 && this.typeTabs.getVisibility() != 0) {
            this.typeTabs.setVisibility(0);
        }
    }

    public boolean lambda$new$1(Theme.ResourcesProvider resourcesProvider, View view, MotionEvent motionEvent) {
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.gifGridView, 0, this.gifOnItemClickListener, this.contentPreviewViewerDelegate, resourcesProvider);
    }

    public void lambda$new$2(View view, int i) {
        if (this.delegate != null) {
            int i2 = i - 1;
            RecyclerView.Adapter adapter = this.gifGridView.getAdapter();
            GifAdapter gifAdapter = this.gifAdapter;
            if (adapter != gifAdapter) {
                RecyclerView.Adapter adapter2 = this.gifGridView.getAdapter();
                GifAdapter gifAdapter2 = this.gifSearchAdapter;
                if (adapter2 == gifAdapter2 && i2 >= 0 && i2 < gifAdapter2.results.size()) {
                    this.delegate.onGifSelected(view, this.gifSearchAdapter.results.get(i2), this.gifSearchAdapter.lastSearchImageString, this.gifSearchAdapter.bot, true, 0);
                    updateRecentGifs();
                }
            } else if (i2 >= 0) {
                if (i2 < gifAdapter.recentItemsCount) {
                    this.delegate.onGifSelected(view, this.recentGifs.get(i2), null, "gif", true, 0);
                    return;
                }
                if (this.gifAdapter.recentItemsCount > 0) {
                    i2 = (i2 - this.gifAdapter.recentItemsCount) - 1;
                }
                if (i2 >= 0 && i2 < this.gifAdapter.results.size()) {
                    this.delegate.onGifSelected(view, this.gifAdapter.results.get(i2), null, this.gifAdapter.bot, true, 0);
                }
            }
        }
    }

    public void lambda$new$3(int i) {
        if (i != this.gifTrendingTabNum || !this.gifAdapter.results.isEmpty()) {
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
                    this.gifLayoutManager.scrollToPositionWithOffset(this.gifAdapter.trendingSectionItem, -AndroidUtilities.m34dp(4.0f));
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
                int i3 = this.gifFirstEmojiTabNum;
                if (i - i3 > 0) {
                    this.gifSearchPreloader.preload(arrayList2.get((i - i3) - 1));
                }
                if (i - this.gifFirstEmojiTabNum < arrayList2.size() - 1) {
                    this.gifSearchPreloader.preload(arrayList2.get((i - this.gifFirstEmojiTabNum) + 1));
                }
            }
            resetTabsY(2);
        }
    }

    public boolean lambda$new$4(Theme.ResourcesProvider resourcesProvider, View view, MotionEvent motionEvent) {
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.stickersGridView, getMeasuredHeight(), this.stickersOnItemClickListener, this.contentPreviewViewerDelegate, resourcesProvider);
    }

    public void lambda$new$5(View view, int i) {
        String str;
        RecyclerView.Adapter adapter = this.stickersGridView.getAdapter();
        StickersSearchGridAdapter stickersSearchGridAdapter = this.stickersSearchGridAdapter;
        if (adapter == stickersSearchGridAdapter) {
            String str2 = stickersSearchGridAdapter.searchQuery;
            TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) this.stickersSearchGridAdapter.positionsToSets.get(i);
            if (tLRPC$StickerSetCovered != null) {
                this.delegate.onShowStickerSet(tLRPC$StickerSetCovered.set, null);
                return;
            }
            str = str2;
        } else {
            str = null;
        }
        if (view instanceof StickerEmojiCell) {
            StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
            if (stickerEmojiCell.getSticker() == null || !MessageObject.isPremiumSticker(stickerEmojiCell.getSticker()) || AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium()) {
                ContentPreviewViewer.getInstance().reset();
                if (!stickerEmojiCell.isDisabled()) {
                    stickerEmojiCell.disable();
                    this.delegate.onStickerSelected(stickerEmojiCell, stickerEmojiCell.getSticker(), str, stickerEmojiCell.getParentObject(), stickerEmojiCell.getSendAnimationData(), true, 0);
                    return;
                }
                return;
            }
            ContentPreviewViewer.getInstance().showMenuFor(stickerEmojiCell);
        }
    }

    public class C198518 extends DraggableScrollSlidingTabStrip {
        public static void lambda$sendReorder$0(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        }

        C198518(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            EmojiView.this = r1;
        }

        @Override
        protected void updatePosition() {
            EmojiView.this.updateStickerTabsPosition();
            EmojiView.this.stickersTabContainer.invalidate();
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
            if (EmojiView.this.hasChatStickers) {
                swapListElements(mediaDataController.getStickerSets(0), i3 - 1, i4 - 1);
            } else {
                swapListElements(mediaDataController.getStickerSets(0), i3, i4);
            }
            EmojiView.this.reloadStickersAdapter();
            AndroidUtilities.cancelRunOnUIThread(EmojiView.this.checkExpandStickerTabsRunnable);
            AndroidUtilities.runOnUIThread(EmojiView.this.checkExpandStickerTabsRunnable, 1500L);
            sendReorder();
            EmojiView.this.updateStickerTabs();
        }

        private void swapListElements(List<TLRPC$TL_messages_stickerSet> list, int i, int i2) {
            list.add(i2, list.remove(i));
        }

        private void sendReorder() {
            MediaDataController.getInstance(EmojiView.this.currentAccount).calcNewHash(0);
            TLRPC$TL_messages_reorderStickerSets tLRPC$TL_messages_reorderStickerSets = new TLRPC$TL_messages_reorderStickerSets();
            tLRPC$TL_messages_reorderStickerSets.masks = false;
            for (int i = EmojiView.this.hasChatStickers; i < EmojiView.this.stickerSets.size(); i++) {
                tLRPC$TL_messages_reorderStickerSets.order.add(Long.valueOf(((TLRPC$TL_messages_stickerSet) EmojiView.this.stickerSets.get(i)).set.f886id));
            }
            ConnectionsManager.getInstance(EmojiView.this.currentAccount).sendRequest(tLRPC$TL_messages_reorderStickerSets, EmojiView$18$$ExternalSyntheticLambda0.INSTANCE);
            NotificationCenter.getInstance(EmojiView.this.currentAccount).postNotificationName(NotificationCenter.stickersDidLoad, 0);
        }

        @Override
        protected void invalidateOverlays() {
            EmojiView.this.stickersTabContainer.invalidate();
        }
    }

    public void lambda$new$6(int i) {
        if (!this.firstTabUpdate) {
            if (i == this.trendingTabNum) {
                openTrendingStickers(null);
            } else if (i == this.recentTabBum) {
                this.stickersGridView.stopScroll();
                scrollStickersToPosition(this.stickersGridAdapter.getPositionForPack("recent"), 0);
                resetTabsY(0);
                ScrollSlidingTabStrip scrollSlidingTabStrip = this.stickersTab;
                int i2 = this.recentTabBum;
                scrollSlidingTabStrip.onPageScrolled(i2, i2 > 0 ? i2 : this.stickersTabOffset);
            } else if (i == this.favTabBum) {
                this.stickersGridView.stopScroll();
                scrollStickersToPosition(this.stickersGridAdapter.getPositionForPack("fav"), 0);
                resetTabsY(0);
                ScrollSlidingTabStrip scrollSlidingTabStrip2 = this.stickersTab;
                int i3 = this.favTabBum;
                scrollSlidingTabStrip2.onPageScrolled(i3, i3 > 0 ? i3 : this.stickersTabOffset);
            } else {
                int i4 = i - this.stickersTabOffset;
                if (i4 < this.stickerSets.size()) {
                    if (i4 >= this.stickerSets.size()) {
                        i4 = this.stickerSets.size() - 1;
                    }
                    this.firstStickersAttach = false;
                    this.stickersGridView.stopScroll();
                    scrollStickersToPosition(this.stickersGridAdapter.getPositionForPack(this.stickerSets.get(i4)), 0);
                    resetTabsY(0);
                    checkScroll(0);
                    int i5 = this.favTabBum;
                    if (i5 <= 0 && (i5 = this.recentTabBum) <= 0) {
                        i5 = this.stickersTabOffset;
                    }
                    this.stickersTab.onPageScrolled(i, i5);
                    this.expandStickersByDragg = false;
                    updateStickerTabsPosition();
                }
            }
        }
    }

    public boolean lambda$new$7(View view, int i, KeyEvent keyEvent) {
        EmojiPopupWindow emojiPopupWindow;
        if (i != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || (emojiPopupWindow = this.pickerViewPopup) == null || !emojiPopupWindow.isShowing()) {
            return false;
        }
        this.pickerViewPopup.dismiss();
        return true;
    }

    public void createStickersChooseActionTracker() {
        ChooseStickerActionTracker chooseStickerActionTracker = new ChooseStickerActionTracker(this.currentAccount, this.delegate.getDialogId(), this.delegate.getThreadId()) {
            {
                EmojiView.this = this;
            }

            @Override
            public boolean isShown() {
                return EmojiView.this.delegate != null && EmojiView.this.getVisibility() == 0 && EmojiView.this.stickersContainerAttached;
            }
        };
        this.chooseStickerActionTracker = chooseStickerActionTracker;
        chooseStickerActionTracker.checkVisibility();
    }

    public void checkGridVisibility(int i, float f) {
        if (this.stickersContainer != null && this.gifContainer != null) {
            int i2 = 0;
            if (i == 0) {
                this.emojiGridView.setVisibility(0);
                this.gifGridView.setVisibility(f == 0.0f ? 8 : 0);
                ScrollSlidingTabStrip scrollSlidingTabStrip = this.gifTabs;
                if (f == 0.0f) {
                    i2 = 8;
                }
                scrollSlidingTabStrip.setVisibility(i2);
                this.stickersGridView.setVisibility(8);
                this.stickersTab.setVisibility(8);
            } else if (i == 1) {
                this.emojiGridView.setVisibility(8);
                this.gifGridView.setVisibility(0);
                this.gifTabs.setVisibility(0);
                this.stickersGridView.setVisibility(f == 0.0f ? 8 : 0);
                ScrollSlidingTabStrip scrollSlidingTabStrip2 = this.stickersTab;
                if (f == 0.0f) {
                    i2 = 8;
                }
                scrollSlidingTabStrip2.setVisibility(i2);
            } else if (i == 2) {
                this.emojiGridView.setVisibility(8);
                this.gifGridView.setVisibility(8);
                this.gifTabs.setVisibility(8);
                this.stickersGridView.setVisibility(0);
                this.stickersTab.setVisibility(0);
            }
        }
    }

    public static String addColorToCode(String str, String str2) {
        String str3;
        int length = str.length();
        if (length > 2 && str.charAt(str.length() - 2) == 8205) {
            str3 = str.substring(str.length() - 2);
            str = str.substring(0, str.length() - 2);
        } else if (length <= 3 || str.charAt(str.length() - 3) != 8205) {
            str3 = null;
        } else {
            str3 = str.substring(str.length() - 3);
            str = str.substring(0, str.length() - 3);
        }
        String str4 = str + str2;
        if (str3 == null) {
            return str4;
        }
        return str4 + str3;
    }

    public void openTrendingStickers(TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
        this.delegate.showTrendingStickersAlert(new TrendingStickersLayout(getContext(), new TrendingStickersLayout.Delegate() {
            @Override
            public boolean canSendSticker() {
                return true;
            }

            {
                EmojiView.this = this;
            }

            @Override
            public void onStickerSetAdd(TLRPC$StickerSetCovered tLRPC$StickerSetCovered2, boolean z) {
                EmojiView.this.delegate.onStickerSetAdd(tLRPC$StickerSetCovered2);
                if (z) {
                    EmojiView.this.updateStickerTabs();
                }
            }

            @Override
            public void onStickerSetRemove(TLRPC$StickerSetCovered tLRPC$StickerSetCovered2) {
                EmojiView.this.delegate.onStickerSetRemove(tLRPC$StickerSetCovered2);
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
            public void onStickerSelected(TLRPC$Document tLRPC$Document, Object obj, boolean z, boolean z2, int i) {
                EmojiView.this.delegate.onStickerSelected(null, tLRPC$Document, null, obj, null, z2, i);
            }

            @Override
            public boolean canSchedule() {
                return EmojiView.this.delegate.canSchedule();
            }

            @Override
            public boolean isInScheduleMode() {
                return EmojiView.this.delegate.isInScheduleMode();
            }
        }, this.primaryInstallingStickerSets, this.installingStickerSets, this.removingStickerSets, tLRPC$StickerSetCovered, this.resourcesProvider));
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        updateStickerTabsPosition();
        updateBottomTabContainerPosition();
    }

    private void updateBottomTabContainerPosition() {
        View view;
        int i;
        if (this.bottomTabContainer.getTag() == null) {
            EmojiViewDelegate emojiViewDelegate = this.delegate;
            if (emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) {
                ViewPager viewPager = this.pager;
                if ((viewPager == null || viewPager.getCurrentItem() != 0) && (view = (View) getParent()) != null) {
                    float y = getY() - view.getHeight();
                    if (getLayoutParams().height > 0) {
                        i = getLayoutParams().height;
                    } else {
                        i = getMeasuredHeight();
                    }
                    float f = y + i;
                    if (this.bottomTabContainer.getTop() - f < 0.0f) {
                        f = this.bottomTabContainer.getTop();
                    }
                    this.bottomTabContainer.setTranslationY(-f);
                }
            }
        }
    }

    public void updateStickerTabsPosition() {
        if (this.stickersTabContainer != null) {
            boolean z = getVisibility() == 0 && this.stickersContainerAttached && this.delegate.getProgressToSearchOpened() != 1.0f;
            this.stickersTabContainer.setVisibility(z ? 0 : 8);
            if (z) {
                this.rect.setEmpty();
                this.pager.getChildVisibleRect(this.stickersContainer, this.rect, null);
                float dp = AndroidUtilities.m34dp(50.0f) * this.delegate.getProgressToSearchOpened();
                int i = this.rect.left;
                if (!(i == 0 && dp == 0.0f)) {
                    this.expandStickersByDragg = false;
                }
                this.stickersTabContainer.setTranslationX(i);
                float top = (((getTop() + getTranslationY()) - this.stickersTabContainer.getTop()) - this.stickersTab.getExpandedOffset()) - dp;
                if (this.stickersTabContainer.getTranslationY() != top) {
                    this.stickersTabContainer.setTranslationY(top);
                    this.stickersTabContainer.invalidate();
                }
            }
            if (!this.expandStickersByDragg || !z || !this.showing) {
                this.expandStickersByDragg = false;
                this.stickersTab.expandStickers(this.lastStickersX, false);
                return;
            }
            this.stickersTab.expandStickers(this.lastStickersX, true);
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        updateBottomTabContainerPosition();
        super.dispatchDraw(canvas);
    }

    public void startStopVisibleGifs(boolean z) {
        RecyclerListView recyclerListView = this.gifGridView;
        if (recyclerListView != null) {
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
    }

    public void addEmojiToRecent(String str) {
        if (Emoji.isValidEmoji(str)) {
            Emoji.recentEmoji.size();
            Emoji.addRecentEmoji(str);
            if (!(getVisibility() == 0 && this.pager.getCurrentItem() == 0)) {
                Emoji.sortEmoji();
                this.emojiAdapter.notifyDataSetChanged();
            }
            Emoji.saveRecentEmoji();
        }
    }

    public void showSearchField(boolean z) {
        for (int i = 0; i < 3; i++) {
            GridLayoutManager layoutManagerForType = getLayoutManagerForType(i);
            int findFirstVisibleItemPosition = layoutManagerForType.findFirstVisibleItemPosition();
            if (z) {
                if (findFirstVisibleItemPosition == 1 || findFirstVisibleItemPosition == 2) {
                    layoutManagerForType.scrollToPosition(0);
                    resetTabsY(i);
                }
            } else if (findFirstVisibleItemPosition == 0) {
                layoutManagerForType.scrollToPositionWithOffset(1, 0);
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
        LinearLayoutManager linearLayoutManager;
        ScrollSlidingTabStrip scrollSlidingTabStrip;
        final RecyclerListView recyclerListView;
        SearchField searchField2;
        EmojiViewDelegate emojiViewDelegate;
        AnimatorSet animatorSet = this.searchAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.searchAnimation = null;
        }
        this.firstStickersAttach = false;
        this.firstGifAttach = false;
        this.firstEmojiAttach = false;
        for (int i = 0; i < 3; i++) {
            boolean z = true;
            if (i == 0) {
                searchField2 = this.emojiSearchField;
                recyclerListView = this.emojiGridView;
                scrollSlidingTabStrip = this.emojiTabs;
                linearLayoutManager = this.emojiLayoutManager;
            } else if (i == 1) {
                searchField2 = this.gifSearchField;
                recyclerListView = this.gifGridView;
                scrollSlidingTabStrip = this.gifTabs;
                linearLayoutManager = this.gifLayoutManager;
            } else {
                searchField2 = this.stickersSearchField;
                recyclerListView = this.stickersGridView;
                scrollSlidingTabStrip = this.stickersTab;
                linearLayoutManager = this.stickersLayoutManager;
            }
            if (searchField2 != null) {
                if (searchField != searchField2 || (emojiViewDelegate = this.delegate) == null || !emojiViewDelegate.isExpanded()) {
                    searchField2.setTranslationY(AndroidUtilities.m34dp(0.0f));
                    if (!(scrollSlidingTabStrip == null || i == 2)) {
                        scrollSlidingTabStrip.setTranslationY(-AndroidUtilities.m34dp(48.0f));
                    }
                    if (recyclerListView == this.stickersGridView) {
                        recyclerListView.setPadding(0, AndroidUtilities.m34dp(4.0f), 0, 0);
                    } else if (recyclerListView == this.emojiGridView || recyclerListView == this.gifGridView) {
                        recyclerListView.setPadding(0, 0, 0, 0);
                    }
                    if (recyclerListView == this.gifGridView) {
                        GifAdapter gifAdapter = this.gifSearchAdapter;
                        if (this.gifAdapter.results.size() <= 0) {
                            z = false;
                        }
                        if (gifAdapter.showTrendingWhenSearchEmpty = z) {
                            this.gifSearchAdapter.search("");
                            RecyclerView.Adapter adapter = this.gifGridView.getAdapter();
                            GifAdapter gifAdapter2 = this.gifSearchAdapter;
                            if (adapter != gifAdapter2) {
                                this.gifGridView.setAdapter(gifAdapter2);
                            }
                        }
                    }
                    linearLayoutManager.scrollToPositionWithOffset(0, 0);
                } else {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.searchAnimation = animatorSet2;
                    if (scrollSlidingTabStrip == null || i == 2) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(recyclerListView, View.TRANSLATION_Y, -AndroidUtilities.m34dp(48.0f)), ObjectAnimator.ofFloat(searchField2, View.TRANSLATION_Y, AndroidUtilities.m34dp(0.0f)));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(scrollSlidingTabStrip, View.TRANSLATION_Y, -AndroidUtilities.m34dp(48.0f)), ObjectAnimator.ofFloat(recyclerListView, View.TRANSLATION_Y, -AndroidUtilities.m34dp(48.0f)), ObjectAnimator.ofFloat(searchField2, View.TRANSLATION_Y, AndroidUtilities.m34dp(0.0f)));
                    }
                    this.searchAnimation.setDuration(220L);
                    this.searchAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    this.searchAnimation.addListener(new AnimatorListenerAdapter() {
                        {
                            EmojiView.this = this;
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (animator.equals(EmojiView.this.searchAnimation)) {
                                recyclerListView.setTranslationY(0.0f);
                                if (recyclerListView == EmojiView.this.stickersGridView) {
                                    recyclerListView.setPadding(0, AndroidUtilities.m34dp(4.0f), 0, 0);
                                } else if (recyclerListView == EmojiView.this.emojiGridView || recyclerListView == EmojiView.this.gifGridView) {
                                    recyclerListView.setPadding(0, 0, 0, 0);
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
                }
            }
        }
    }

    private void showEmojiShadow(boolean z, boolean z2) {
        if (z && this.emojiTabsShadow.getTag() == null) {
            return;
        }
        if (z || this.emojiTabsShadow.getTag() == null) {
            AnimatorSet animatorSet = this.emojiTabShadowAnimator;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.emojiTabShadowAnimator = null;
            }
            View view = this.emojiTabsShadow;
            if (!z) {
                num = 1;
            }
            view.setTag(num);
            float f = 1.0f;
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.emojiTabShadowAnimator = animatorSet2;
                Animator[] animatorArr = new Animator[1];
                View view2 = this.emojiTabsShadow;
                Property property = View.ALPHA;
                float[] fArr = new float[1];
                if (!z) {
                    f = 0.0f;
                }
                fArr[0] = f;
                animatorArr[0] = ObjectAnimator.ofFloat(view2, property, fArr);
                animatorSet2.playTogether(animatorArr);
                this.emojiTabShadowAnimator.setDuration(200L);
                this.emojiTabShadowAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.emojiTabShadowAnimator.addListener(new AnimatorListenerAdapter() {
                    {
                        EmojiView.this = this;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        EmojiView.this.emojiTabShadowAnimator = null;
                    }
                });
                this.emojiTabShadowAnimator.start();
                return;
            }
            View view3 = this.emojiTabsShadow;
            if (!z) {
                f = 0.0f;
            }
            view3.setAlpha(f);
        }
    }

    public void closeSearch(boolean z) {
        closeSearch(z, -1L);
    }

    private void scrollStickersToPosition(int i, int i2) {
        View findViewByPosition = this.stickersLayoutManager.findViewByPosition(i);
        int findFirstVisibleItemPosition = this.stickersLayoutManager.findFirstVisibleItemPosition();
        if (findViewByPosition != null || Math.abs(i - findFirstVisibleItemPosition) <= 40) {
            this.ignoreStickersScroll = true;
            this.stickersGridView.smoothScrollToPosition(i);
            return;
        }
        this.scrollHelper.setScrollDirection(this.stickersLayoutManager.findFirstVisibleItemPosition() < i ? 0 : 1);
        this.scrollHelper.scrollToPosition(i, i2, false, true);
    }

    public void closeSearch(boolean z, long j) {
        ScrollSlidingTabStrip scrollSlidingTabStrip;
        final GridLayoutManager gridLayoutManager;
        final RecyclerListView recyclerListView;
        SearchField searchField;
        TLRPC$TL_messages_stickerSet stickerSetById;
        int positionForPack;
        AnimatorSet animatorSet = this.searchAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.searchAnimation = null;
        }
        int currentItem = this.pager.getCurrentItem();
        int i = 2;
        if (currentItem == 2 && j != -1 && (stickerSetById = MediaDataController.getInstance(this.currentAccount).getStickerSetById(j)) != null && (positionForPack = this.stickersGridAdapter.getPositionForPack(stickerSetById)) >= 0 && positionForPack < this.stickersGridAdapter.getItemCount()) {
            scrollStickersToPosition(positionForPack, AndroidUtilities.m34dp(60.0f));
        }
        GifAdapter gifAdapter = this.gifSearchAdapter;
        if (gifAdapter != null) {
            gifAdapter.showTrendingWhenSearchEmpty = false;
        }
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 == 0) {
                searchField = this.emojiSearchField;
                recyclerListView = this.emojiGridView;
                gridLayoutManager = this.emojiLayoutManager;
                scrollSlidingTabStrip = this.emojiTabs;
            } else if (i2 == 1) {
                searchField = this.gifSearchField;
                recyclerListView = this.gifGridView;
                gridLayoutManager = this.gifLayoutManager;
                scrollSlidingTabStrip = this.gifTabs;
            } else {
                searchField = this.stickersSearchField;
                recyclerListView = this.stickersGridView;
                gridLayoutManager = this.stickersLayoutManager;
                scrollSlidingTabStrip = this.stickersTab;
            }
            if (searchField != null) {
                searchField.searchEditText.setText("");
                if (i2 != currentItem || !z) {
                    searchField.setTranslationY(AndroidUtilities.m34dp(48.0f) - this.searchFieldHeight);
                    i = 2;
                    if (!(scrollSlidingTabStrip == null || i2 == 2)) {
                        scrollSlidingTabStrip.setTranslationY(0.0f);
                    }
                    if (recyclerListView == this.stickersGridView) {
                        recyclerListView.setPadding(0, AndroidUtilities.m34dp(52.0f), 0, AndroidUtilities.m34dp(44.0f));
                    } else if (recyclerListView == this.gifGridView) {
                        recyclerListView.setPadding(0, AndroidUtilities.m34dp(52.0f), 0, AndroidUtilities.m34dp(44.0f));
                    } else if (recyclerListView == this.emojiGridView) {
                        recyclerListView.setPadding(0, AndroidUtilities.m34dp(38.0f), 0, AndroidUtilities.m34dp(44.0f));
                    }
                    gridLayoutManager.scrollToPositionWithOffset(1, 0);
                } else {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.searchAnimation = animatorSet2;
                    if (scrollSlidingTabStrip == null || i2 == i) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(recyclerListView, View.TRANSLATION_Y, AndroidUtilities.m34dp(48.0f) - this.searchFieldHeight), ObjectAnimator.ofFloat(searchField, View.TRANSLATION_Y, -this.searchFieldHeight));
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(scrollSlidingTabStrip, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(recyclerListView, View.TRANSLATION_Y, AndroidUtilities.m34dp(48.0f) - this.searchFieldHeight), ObjectAnimator.ofFloat(searchField, View.TRANSLATION_Y, AndroidUtilities.m34dp(48.0f) - this.searchFieldHeight));
                    }
                    this.searchAnimation.setDuration(200L);
                    this.searchAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.searchAnimation.addListener(new AnimatorListenerAdapter() {
                        {
                            EmojiView.this = this;
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (animator.equals(EmojiView.this.searchAnimation)) {
                                int findFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
                                int top = findFirstVisibleItemPosition != -1 ? (int) (gridLayoutManager.findViewByPosition(findFirstVisibleItemPosition).getTop() + recyclerListView.getTranslationY()) : 0;
                                recyclerListView.setTranslationY(0.0f);
                                if (recyclerListView == EmojiView.this.stickersGridView) {
                                    recyclerListView.setPadding(0, AndroidUtilities.m34dp(52.0f), 0, AndroidUtilities.m34dp(44.0f));
                                } else if (recyclerListView == EmojiView.this.gifGridView) {
                                    recyclerListView.setPadding(0, AndroidUtilities.m34dp(52.0f), 0, AndroidUtilities.m34dp(44.0f));
                                } else if (recyclerListView == EmojiView.this.emojiGridView) {
                                    recyclerListView.setPadding(0, AndroidUtilities.m34dp(38.0f), 0, AndroidUtilities.m34dp(44.0f));
                                }
                                if (findFirstVisibleItemPosition != -1) {
                                    gridLayoutManager.scrollToPositionWithOffset(findFirstVisibleItemPosition, top - recyclerListView.getPaddingTop());
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
                    i = 2;
                }
            }
        }
        if (!z) {
            this.delegate.onSearchOpenClose(0);
        }
        showBottomTab(true, z);
    }

    public void checkStickersSearchFieldScroll(boolean z) {
        RecyclerListView recyclerListView;
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        boolean z2 = false;
        if (emojiViewDelegate != null && emojiViewDelegate.isSearchOpened()) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.stickersGridView.findViewHolderForAdapterPosition(0);
            if (findViewHolderForAdapterPosition == null) {
                this.stickersSearchField.showShadow(true, !z);
                return;
            }
            SearchField searchField = this.stickersSearchField;
            if (findViewHolderForAdapterPosition.itemView.getTop() < this.stickersGridView.getPaddingTop()) {
                z2 = true;
            }
            searchField.showShadow(z2, !z);
        } else if (this.stickersSearchField != null && (recyclerListView = this.stickersGridView) != null) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = recyclerListView.findViewHolderForAdapterPosition(0);
            if (findViewHolderForAdapterPosition2 != null) {
                this.stickersSearchField.setTranslationY(findViewHolderForAdapterPosition2.itemView.getTop());
            } else {
                this.stickersSearchField.setTranslationY(-this.searchFieldHeight);
            }
            this.stickersSearchField.showShadow(false, !z);
        }
    }

    public void checkBottomTabScroll(float f) {
        int i;
        this.lastBottomScrollDy += f;
        if (this.pager.getCurrentItem() == 0) {
            i = AndroidUtilities.m34dp(38.0f);
        } else {
            i = AndroidUtilities.m34dp(48.0f);
        }
        float f2 = this.lastBottomScrollDy;
        if (f2 >= i) {
            showBottomTab(false, true);
        } else if (f2 <= (-i)) {
            showBottomTab(true, true);
        } else if ((this.bottomTabContainer.getTag() == null && this.lastBottomScrollDy < 0.0f) || (this.bottomTabContainer.getTag() != null && this.lastBottomScrollDy > 0.0f)) {
            this.lastBottomScrollDy = 0.0f;
        }
    }

    public void showBackspaceButton(final boolean z, boolean z2) {
        if (z && this.backspaceButton.getTag() == null) {
            return;
        }
        if (z || this.backspaceButton.getTag() == null) {
            AnimatorSet animatorSet = this.backspaceButtonAnimation;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.backspaceButtonAnimation = null;
            }
            ImageView imageView = this.backspaceButton;
            if (!z) {
                num = 1;
            }
            imageView.setTag(num);
            int i = 0;
            float f = 1.0f;
            if (z2) {
                if (z) {
                    this.backspaceButton.setVisibility(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.backspaceButtonAnimation = animatorSet2;
                Animator[] animatorArr = new Animator[3];
                ImageView imageView2 = this.backspaceButton;
                Property property = View.ALPHA;
                float[] fArr = new float[1];
                fArr[0] = z ? 1.0f : 0.0f;
                animatorArr[0] = ObjectAnimator.ofFloat(imageView2, property, fArr);
                ImageView imageView3 = this.backspaceButton;
                Property property2 = View.SCALE_X;
                float[] fArr2 = new float[1];
                fArr2[0] = z ? 1.0f : 0.0f;
                animatorArr[1] = ObjectAnimator.ofFloat(imageView3, property2, fArr2);
                ImageView imageView4 = this.backspaceButton;
                Property property3 = View.SCALE_Y;
                float[] fArr3 = new float[1];
                if (!z) {
                    f = 0.0f;
                }
                fArr3[0] = f;
                animatorArr[2] = ObjectAnimator.ofFloat(imageView4, property3, fArr3);
                animatorSet2.playTogether(animatorArr);
                this.backspaceButtonAnimation.setDuration(200L);
                this.backspaceButtonAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.backspaceButtonAnimation.addListener(new AnimatorListenerAdapter() {
                    {
                        EmojiView.this = this;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (!z) {
                            EmojiView.this.backspaceButton.setVisibility(4);
                        }
                    }
                });
                this.backspaceButtonAnimation.start();
                return;
            }
            this.backspaceButton.setAlpha(z ? 1.0f : 0.0f);
            this.backspaceButton.setScaleX(z ? 1.0f : 0.0f);
            ImageView imageView5 = this.backspaceButton;
            if (!z) {
                f = 0.0f;
            }
            imageView5.setScaleY(f);
            ImageView imageView6 = this.backspaceButton;
            if (!z) {
                i = 4;
            }
            imageView6.setVisibility(i);
        }
    }

    public void showStickerSettingsButton(final boolean z, boolean z2) {
        ImageView imageView = this.stickerSettingsButton;
        if (imageView != null) {
            if (z && imageView.getTag() == null) {
                return;
            }
            if (z || this.stickerSettingsButton.getTag() == null) {
                AnimatorSet animatorSet = this.stickersButtonAnimation;
                Integer num = null;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.stickersButtonAnimation = null;
                }
                ImageView imageView2 = this.stickerSettingsButton;
                if (!z) {
                    num = 1;
                }
                imageView2.setTag(num);
                int i = 0;
                float f = 1.0f;
                if (z2) {
                    if (z) {
                        this.stickerSettingsButton.setVisibility(0);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.stickersButtonAnimation = animatorSet2;
                    Animator[] animatorArr = new Animator[3];
                    ImageView imageView3 = this.stickerSettingsButton;
                    Property property = View.ALPHA;
                    float[] fArr = new float[1];
                    fArr[0] = z ? 1.0f : 0.0f;
                    animatorArr[0] = ObjectAnimator.ofFloat(imageView3, property, fArr);
                    ImageView imageView4 = this.stickerSettingsButton;
                    Property property2 = View.SCALE_X;
                    float[] fArr2 = new float[1];
                    fArr2[0] = z ? 1.0f : 0.0f;
                    animatorArr[1] = ObjectAnimator.ofFloat(imageView4, property2, fArr2);
                    ImageView imageView5 = this.stickerSettingsButton;
                    Property property3 = View.SCALE_Y;
                    float[] fArr3 = new float[1];
                    if (!z) {
                        f = 0.0f;
                    }
                    fArr3[0] = f;
                    animatorArr[2] = ObjectAnimator.ofFloat(imageView5, property3, fArr3);
                    animatorSet2.playTogether(animatorArr);
                    this.stickersButtonAnimation.setDuration(200L);
                    this.stickersButtonAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    this.stickersButtonAnimation.addListener(new AnimatorListenerAdapter() {
                        {
                            EmojiView.this = this;
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (!z) {
                                EmojiView.this.stickerSettingsButton.setVisibility(4);
                            }
                        }
                    });
                    this.stickersButtonAnimation.start();
                    return;
                }
                this.stickerSettingsButton.setAlpha(z ? 1.0f : 0.0f);
                this.stickerSettingsButton.setScaleX(z ? 1.0f : 0.0f);
                ImageView imageView6 = this.stickerSettingsButton;
                if (!z) {
                    f = 0.0f;
                }
                imageView6.setScaleY(f);
                ImageView imageView7 = this.stickerSettingsButton;
                if (!z) {
                    i = 4;
                }
                imageView7.setVisibility(i);
            }
        }
    }

    public void showBottomTab(boolean z, boolean z2) {
        float f;
        float f2;
        float f3 = 0.0f;
        this.lastBottomScrollDy = 0.0f;
        if (z && this.bottomTabContainer.getTag() == null) {
            return;
        }
        if (z || this.bottomTabContainer.getTag() == null) {
            EmojiViewDelegate emojiViewDelegate = this.delegate;
            if (emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) {
                AnimatorSet animatorSet = this.bottomTabContainerAnimation;
                Integer num = null;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.bottomTabContainerAnimation = null;
                }
                FrameLayout frameLayout = this.bottomTabContainer;
                if (!z) {
                    num = 1;
                }
                frameLayout.setTag(num);
                float f4 = 54.0f;
                if (z2) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.bottomTabContainerAnimation = animatorSet2;
                    Animator[] animatorArr = new Animator[2];
                    FrameLayout frameLayout2 = this.bottomTabContainer;
                    Property property = View.TRANSLATION_Y;
                    float[] fArr = new float[1];
                    if (z) {
                        f2 = 0.0f;
                    } else {
                        if (this.needEmojiSearch) {
                            f4 = 49.0f;
                        }
                        f2 = AndroidUtilities.m34dp(f4);
                    }
                    fArr[0] = f2;
                    animatorArr[0] = ObjectAnimator.ofFloat(frameLayout2, property, fArr);
                    View view = this.shadowLine;
                    Property property2 = View.TRANSLATION_Y;
                    float[] fArr2 = new float[1];
                    if (!z) {
                        f3 = AndroidUtilities.m34dp(49.0f);
                    }
                    fArr2[0] = f3;
                    animatorArr[1] = ObjectAnimator.ofFloat(view, property2, fArr2);
                    animatorSet2.playTogether(animatorArr);
                    this.bottomTabContainerAnimation.setDuration(200L);
                    this.bottomTabContainerAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    this.bottomTabContainerAnimation.start();
                    return;
                }
                FrameLayout frameLayout3 = this.bottomTabContainer;
                if (z) {
                    f = 0.0f;
                } else {
                    if (this.needEmojiSearch) {
                        f4 = 49.0f;
                    }
                    f = AndroidUtilities.m34dp(f4);
                }
                frameLayout3.setTranslationY(f);
                View view2 = this.shadowLine;
                if (!z) {
                    f3 = AndroidUtilities.m34dp(49.0f);
                }
                view2.setTranslationY(f3);
            }
        }
    }

    public void checkTabsY(int i, int i2) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        if (i == 1) {
            checkEmojiTabY(this.emojiGridView, i2);
            return;
        }
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if ((emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) && !this.ignoreStickersScroll) {
            RecyclerListView listViewForType = getListViewForType(i);
            if (i2 <= 0 || listViewForType == null || listViewForType.getVisibility() != 0 || (findViewHolderForAdapterPosition = listViewForType.findViewHolderForAdapterPosition(0)) == null || findViewHolderForAdapterPosition.itemView.getTop() + this.searchFieldHeight < listViewForType.getPaddingTop()) {
                int[] iArr = this.tabsMinusDy;
                iArr[i] = iArr[i] - i2;
                if (iArr[i] > 0) {
                    iArr[i] = 0;
                } else if (iArr[i] < (-AndroidUtilities.m34dp(288.0f))) {
                    this.tabsMinusDy[i] = -AndroidUtilities.m34dp(288.0f);
                }
                if (i == 0) {
                    updateStickerTabsPosition();
                } else {
                    getTabsForType(i).setTranslationY(Math.max(-AndroidUtilities.m34dp(48.0f), this.tabsMinusDy[i]));
                }
            }
        }
    }

    private void resetTabsY(int i) {
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if ((emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) && i != 0) {
            ScrollSlidingTabStrip tabsForType = getTabsForType(i);
            this.tabsMinusDy[i] = 0;
            tabsForType.setTranslationY(0);
        }
    }

    public void animateTabsY(final int i) {
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if ((emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) && i != 0) {
            float dpf2 = AndroidUtilities.dpf2(i == 1 ? 38.0f : 48.0f);
            float f = this.tabsMinusDy[i] / (-dpf2);
            if (f <= 0.0f || f >= 1.0f) {
                animateSearchField(i);
                return;
            }
            ScrollSlidingTabStrip tabsForType = getTabsForType(i);
            int i2 = f > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
            if (f > 0.5f) {
                animateSearchField(i, false, i2);
            }
            if (i == 1) {
                checkEmojiShadow(i2);
            }
            ObjectAnimator[] objectAnimatorArr = this.tabsYAnimators;
            if (objectAnimatorArr[i] == null) {
                objectAnimatorArr[i] = ObjectAnimator.ofFloat(tabsForType, View.TRANSLATION_Y, tabsForType.getTranslationY(), i2);
                this.tabsYAnimators[i].addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        EmojiView.this.lambda$animateTabsY$8(i, valueAnimator);
                    }
                });
                this.tabsYAnimators[i].setDuration(200L);
            } else {
                objectAnimatorArr[i].setFloatValues(tabsForType.getTranslationY(), i2);
            }
            this.tabsYAnimators[i].start();
        }
    }

    public void lambda$animateTabsY$8(int i, ValueAnimator valueAnimator) {
        this.tabsMinusDy[i] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void stopAnimatingTabsY(int i) {
        ObjectAnimator[] objectAnimatorArr = this.tabsYAnimators;
        if (objectAnimatorArr[i] != null && objectAnimatorArr[i].isRunning()) {
            this.tabsYAnimators[i].cancel();
        }
    }

    private void animateSearchField(int i) {
        RecyclerListView listViewForType = getListViewForType(i);
        boolean z = true;
        int dp = AndroidUtilities.m34dp(i == 1 ? 38.0f : 48.0f);
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = listViewForType.findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition != null) {
            int bottom = findViewHolderForAdapterPosition.itemView.getBottom();
            int[] iArr = this.tabsMinusDy;
            float f = (bottom - (dp + iArr[i])) / this.searchFieldHeight;
            if (f > 0.0f || f < 1.0f) {
                if (f <= 0.5f) {
                    z = false;
                }
                animateSearchField(i, z, iArr[i]);
            }
        }
    }

    private void animateSearchField(int i, boolean z, final int i2) {
        if (getListViewForType(i).findViewHolderForAdapterPosition(0) != null) {
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(this, getContext()) {
                @Override
                public int getVerticalSnapPreference() {
                    return -1;
                }

                @Override
                public int calculateTimeForDeceleration(int i3) {
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
    }

    private ScrollSlidingTabStrip getTabsForType(int i) {
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

    private RecyclerListView getListViewForType(int i) {
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

    public void checkEmojiSearchFieldScroll(boolean z) {
        RecyclerListView recyclerListView;
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate != null && emojiViewDelegate.isSearchOpened()) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.emojiGridView.findViewHolderForAdapterPosition(0);
            if (findViewHolderForAdapterPosition == null) {
                this.emojiSearchField.showShadow(true, !z);
            } else {
                this.emojiSearchField.showShadow(findViewHolderForAdapterPosition.itemView.getTop() < this.emojiGridView.getPaddingTop(), !z);
            }
            showEmojiShadow(false, !z);
        } else if (this.emojiSearchField != null && (recyclerListView = this.emojiGridView) != null) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = recyclerListView.findViewHolderForAdapterPosition(0);
            if (findViewHolderForAdapterPosition2 != null) {
                this.emojiSearchField.setTranslationY(findViewHolderForAdapterPosition2.itemView.getTop());
            } else {
                this.emojiSearchField.setTranslationY(-this.searchFieldHeight);
            }
            this.emojiSearchField.showShadow(false, !z);
            checkEmojiShadow(Math.round(this.emojiTabs.getTranslationY()));
        }
    }

    private void checkEmojiShadow(int i) {
        ObjectAnimator[] objectAnimatorArr = this.tabsYAnimators;
        if (objectAnimatorArr[1] == null || !objectAnimatorArr[1].isRunning()) {
            boolean z = false;
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.emojiGridView.findViewHolderForAdapterPosition(0);
            int dp = AndroidUtilities.m34dp(38.0f) + i;
            if (dp > 0 && (findViewHolderForAdapterPosition == null || findViewHolderForAdapterPosition.itemView.getBottom() < dp)) {
                z = true;
            }
            showEmojiShadow(z, !this.isLayout);
        }
    }

    public void checkEmojiTabY(View view, int i) {
        RecyclerListView recyclerListView;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        if (view == null) {
            ScrollSlidingTabStrip scrollSlidingTabStrip = this.emojiTabs;
            this.tabsMinusDy[1] = 0;
            scrollSlidingTabStrip.setTranslationY(0);
        } else if (view.getVisibility() == 0) {
            EmojiViewDelegate emojiViewDelegate = this.delegate;
            if (emojiViewDelegate == null || !emojiViewDelegate.isSearchOpened()) {
                if (i > 0 && (recyclerListView = this.emojiGridView) != null && recyclerListView.getVisibility() == 0 && (findViewHolderForAdapterPosition = this.emojiGridView.findViewHolderForAdapterPosition(0)) != null) {
                    if (findViewHolderForAdapterPosition.itemView.getTop() + (this.needEmojiSearch ? this.searchFieldHeight : 0) >= this.emojiGridView.getPaddingTop()) {
                        return;
                    }
                }
                int[] iArr = this.tabsMinusDy;
                iArr[1] = iArr[1] - i;
                if (iArr[1] > 0) {
                    iArr[1] = 0;
                } else if (iArr[1] < (-AndroidUtilities.m34dp(288.0f))) {
                    this.tabsMinusDy[1] = -AndroidUtilities.m34dp(288.0f);
                }
                this.emojiTabs.setTranslationY(Math.max(-AndroidUtilities.m34dp(38.0f), this.tabsMinusDy[1]));
            }
        }
    }

    public void checkGifSearchFieldScroll(boolean z) {
        RecyclerListView recyclerListView;
        int findLastVisibleItemPosition;
        RecyclerListView recyclerListView2 = this.gifGridView;
        if (recyclerListView2 != null && (recyclerListView2.getAdapter() instanceof GifAdapter)) {
            GifAdapter gifAdapter = (GifAdapter) this.gifGridView.getAdapter();
            if (!gifAdapter.searchEndReached && gifAdapter.reqId == 0 && !gifAdapter.results.isEmpty() && (findLastVisibleItemPosition = this.gifLayoutManager.findLastVisibleItemPosition()) != -1 && findLastVisibleItemPosition > this.gifLayoutManager.getItemCount() - 5) {
                gifAdapter.search(gifAdapter.lastSearchImageString, gifAdapter.nextSearchOffset, true, gifAdapter.lastSearchIsEmoji, gifAdapter.lastSearchIsEmoji);
            }
        }
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        boolean z2 = false;
        if (emojiViewDelegate != null && emojiViewDelegate.isSearchOpened()) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.gifGridView.findViewHolderForAdapterPosition(0);
            if (findViewHolderForAdapterPosition == null) {
                this.gifSearchField.showShadow(true, !z);
                return;
            }
            SearchField searchField = this.gifSearchField;
            if (findViewHolderForAdapterPosition.itemView.getTop() < this.gifGridView.getPaddingTop()) {
                z2 = true;
            }
            searchField.showShadow(z2, !z);
        } else if (this.gifSearchField != null && (recyclerListView = this.gifGridView) != null) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = recyclerListView.findViewHolderForAdapterPosition(0);
            if (findViewHolderForAdapterPosition2 != null) {
                this.gifSearchField.setTranslationY(findViewHolderForAdapterPosition2.itemView.getTop());
            } else {
                this.gifSearchField.setTranslationY(-this.searchFieldHeight);
            }
            this.gifSearchField.showShadow(false, !z);
        }
    }

    public void scrollGifsToTop() {
        GifLayoutManager gifLayoutManager = this.gifLayoutManager;
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        gifLayoutManager.scrollToPositionWithOffset((emojiViewDelegate == null || !emojiViewDelegate.isExpanded()) ? 1 : 0, 0);
        resetTabsY(2);
    }

    public void checkScroll(int i) {
        int findFirstVisibleItemPosition;
        int findFirstVisibleItemPosition2;
        if (i == 0) {
            if (!this.ignoreStickersScroll && (findFirstVisibleItemPosition2 = this.stickersLayoutManager.findFirstVisibleItemPosition()) != -1 && this.stickersGridView != null) {
                int i2 = this.favTabBum;
                if (i2 <= 0 && (i2 = this.recentTabBum) <= 0) {
                    i2 = this.stickersTabOffset;
                }
                this.stickersTab.onPageScrolled(this.stickersGridAdapter.getTabForPosition(findFirstVisibleItemPosition2), i2);
            }
        } else if (i == 2) {
            RecyclerView.Adapter adapter = this.gifGridView.getAdapter();
            GifAdapter gifAdapter = this.gifAdapter;
            if (adapter == gifAdapter && gifAdapter.trendingSectionItem >= 0 && this.gifTrendingTabNum >= 0 && this.gifRecentTabNum >= 0 && (findFirstVisibleItemPosition = this.gifLayoutManager.findFirstVisibleItemPosition()) != -1) {
                this.gifTabs.onPageScrolled(findFirstVisibleItemPosition >= this.gifAdapter.trendingSectionItem ? this.gifTrendingTabNum : this.gifRecentTabNum, 0);
            }
        }
    }

    public void saveNewPage() {
        ViewPager viewPager = this.pager;
        if (viewPager != null) {
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
    }

    public void clearRecentEmoji() {
        Emoji.clearRecentEmoji();
        this.emojiAdapter.notifyDataSetChanged();
    }

    public void onPageScrolled(int i, int i2, int i3) {
        EmojiViewDelegate emojiViewDelegate = this.delegate;
        if (emojiViewDelegate != null) {
            int i4 = 0;
            if (i == 1) {
                if (i3 != 0) {
                    i4 = 2;
                }
                emojiViewDelegate.onTabOpened(i4);
            } else if (i == 2) {
                emojiViewDelegate.onTabOpened(3);
            } else {
                emojiViewDelegate.onTabOpened(0);
            }
        }
    }

    public void postBackspaceRunnable(final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                EmojiView.this.lambda$postBackspaceRunnable$9(i);
            }
        }, i);
    }

    public void lambda$postBackspaceRunnable$9(int i) {
        if (this.backspacePressed) {
            EmojiViewDelegate emojiViewDelegate = this.delegate;
            if (emojiViewDelegate != null && emojiViewDelegate.onBackspace()) {
                this.backspaceButton.performHapticFeedback(3);
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

    public void updateEmojiTabs() {
        int i = !Emoji.recentEmoji.isEmpty() ? 1 : 0;
        int i2 = this.hasRecentEmoji;
        if (i2 == -1 || i2 != i) {
            this.hasRecentEmoji = i;
            this.emojiTabs.removeTabs();
            String[] strArr = {LocaleController.getString("RecentStickers", C0952R.string.RecentStickers), LocaleController.getString("Emoji1", C0952R.string.Emoji1), LocaleController.getString("Emoji2", C0952R.string.Emoji2), LocaleController.getString("Emoji3", C0952R.string.Emoji3), LocaleController.getString("Emoji4", C0952R.string.Emoji4), LocaleController.getString("Emoji5", C0952R.string.Emoji5), LocaleController.getString("Emoji6", C0952R.string.Emoji6), LocaleController.getString("Emoji7", C0952R.string.Emoji7), LocaleController.getString("Emoji8", C0952R.string.Emoji8)};
            for (int i3 = 0; i3 < this.emojiIcons.length; i3++) {
                if (i3 != 0 || !Emoji.recentEmoji.isEmpty()) {
                    this.emojiTabs.addIconTab(i3, this.emojiIcons[i3]).setContentDescription(strArr[i3]);
                }
            }
            this.emojiTabs.updateTabStyles();
        }
    }

    public void updateStickerTabs() {
        ArrayList<TLRPC$Document> arrayList;
        ArrayList<TLRPC$Document> arrayList2;
        ScrollSlidingTabStrip scrollSlidingTabStrip = this.stickersTab;
        if (!(scrollSlidingTabStrip == null || scrollSlidingTabStrip.isDragging())) {
            this.recentTabBum = -2;
            this.favTabBum = -2;
            this.trendingTabNum = -2;
            this.hasChatStickers = false;
            this.stickersTabOffset = 0;
            int currentPosition = this.stickersTab.getCurrentPosition();
            this.stickersTab.beginUpdate((getParent() == null || getVisibility() != 0 || (this.installingStickerSets.size() == 0 && this.removingStickerSets.size() == 0)) ? false : true);
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            SharedPreferences emojiSettings = MessagesController.getEmojiSettings(this.currentAccount);
            this.featuredStickerSets.clear();
            ArrayList<TLRPC$StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int size = featuredStickerSets.size();
            for (int i = 0; i < size; i++) {
                TLRPC$StickerSetCovered tLRPC$StickerSetCovered = featuredStickerSets.get(i);
                if (!mediaDataController.isStickerPackInstalled(tLRPC$StickerSetCovered.set.f886id)) {
                    this.featuredStickerSets.add(tLRPC$StickerSetCovered);
                }
            }
            TrendingAdapter trendingAdapter = this.trendingAdapter;
            if (trendingAdapter != null) {
                trendingAdapter.notifyDataSetChanged();
            }
            if (!featuredStickerSets.isEmpty() && (this.featuredStickerSets.isEmpty() || emojiSettings.getLong("featured_hidden", 0L) == featuredStickerSets.get(0).set.f886id)) {
                int i2 = mediaDataController.getUnreadStickerSets().isEmpty() ? 2 : 3;
                StickerTabView addStickerIconTab = this.stickersTab.addStickerIconTab(i2, this.stickerIcons[i2]);
                addStickerIconTab.textView.setText(LocaleController.getString("FeaturedStickersShort", C0952R.string.FeaturedStickersShort));
                addStickerIconTab.setContentDescription(LocaleController.getString("FeaturedStickers", C0952R.string.FeaturedStickers));
                int i3 = this.stickersTabOffset;
                this.trendingTabNum = i3;
                this.stickersTabOffset = i3 + 1;
            }
            if (!this.favouriteStickers.isEmpty()) {
                int i4 = this.stickersTabOffset;
                this.favTabBum = i4;
                this.stickersTabOffset = i4 + 1;
                StickerTabView addStickerIconTab2 = this.stickersTab.addStickerIconTab(1, this.stickerIcons[1]);
                addStickerIconTab2.textView.setText(LocaleController.getString("FavoriteStickersShort", C0952R.string.FavoriteStickersShort));
                addStickerIconTab2.setContentDescription(LocaleController.getString("FavoriteStickers", C0952R.string.FavoriteStickers));
            }
            if (!this.recentStickers.isEmpty()) {
                int i5 = this.stickersTabOffset;
                this.recentTabBum = i5;
                this.stickersTabOffset = i5 + 1;
                StickerTabView addStickerIconTab3 = this.stickersTab.addStickerIconTab(0, this.stickerIcons[0]);
                addStickerIconTab3.textView.setText(LocaleController.getString("RecentStickersShort", C0952R.string.RecentStickersShort));
                addStickerIconTab3.setContentDescription(LocaleController.getString("RecentStickers", C0952R.string.RecentStickers));
            }
            this.stickerSets.clear();
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = null;
            this.groupStickerSet = null;
            this.groupStickerPackPosition = -1;
            this.groupStickerPackNum = -10;
            ArrayList<TLRPC$TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(0);
            int i6 = 0;
            while (true) {
                TLRPC$StickerSetCovered[] tLRPC$StickerSetCoveredArr = this.primaryInstallingStickerSets;
                if (i6 >= tLRPC$StickerSetCoveredArr.length) {
                    break;
                }
                TLRPC$StickerSetCovered tLRPC$StickerSetCovered2 = tLRPC$StickerSetCoveredArr[i6];
                if (tLRPC$StickerSetCovered2 != null) {
                    TLRPC$TL_messages_stickerSet stickerSetById = mediaDataController.getStickerSetById(tLRPC$StickerSetCovered2.set.f886id);
                    if (stickerSetById == null || stickerSetById.set.archived) {
                        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = new TLRPC$TL_messages_stickerSet();
                        tLRPC$TL_messages_stickerSet2.set = tLRPC$StickerSetCovered2.set;
                        TLRPC$Document tLRPC$Document = tLRPC$StickerSetCovered2.cover;
                        if (tLRPC$Document != null) {
                            tLRPC$TL_messages_stickerSet2.documents.add(tLRPC$Document);
                        } else if (!tLRPC$StickerSetCovered2.covers.isEmpty()) {
                            tLRPC$TL_messages_stickerSet2.documents.addAll(tLRPC$StickerSetCovered2.covers);
                        }
                        if (!tLRPC$TL_messages_stickerSet2.documents.isEmpty()) {
                            this.stickerSets.add(tLRPC$TL_messages_stickerSet2);
                        }
                    } else {
                        this.primaryInstallingStickerSets[i6] = null;
                    }
                }
                i6++;
            }
            for (int i7 = 0; i7 < stickerSets.size(); i7++) {
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet3 = stickerSets.get(i7);
                if (!tLRPC$TL_messages_stickerSet3.set.archived && (arrayList2 = tLRPC$TL_messages_stickerSet3.documents) != null && !arrayList2.isEmpty()) {
                    this.stickerSets.add(tLRPC$TL_messages_stickerSet3);
                }
            }
            if (this.info != null) {
                long j = MessagesController.getEmojiSettings(this.currentAccount).getLong("group_hide_stickers_" + this.info.f855id, -1L);
                TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.info.f855id));
                if (chat == null || this.info.stickerset == null || !ChatObject.hasAdminRights(chat)) {
                    this.groupStickersHidden = j != -1;
                } else {
                    TLRPC$StickerSet tLRPC$StickerSet = this.info.stickerset;
                    if (tLRPC$StickerSet != null) {
                        this.groupStickersHidden = j == tLRPC$StickerSet.f886id;
                    }
                }
                TLRPC$ChatFull tLRPC$ChatFull = this.info;
                TLRPC$StickerSet tLRPC$StickerSet2 = tLRPC$ChatFull.stickerset;
                if (tLRPC$StickerSet2 != null) {
                    TLRPC$TL_messages_stickerSet groupStickerSetById = mediaDataController.getGroupStickerSetById(tLRPC$StickerSet2);
                    if (!(groupStickerSetById == null || (arrayList = groupStickerSetById.documents) == null || arrayList.isEmpty() || groupStickerSetById.set == null)) {
                        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet4 = new TLRPC$TL_messages_stickerSet();
                        tLRPC$TL_messages_stickerSet4.documents = groupStickerSetById.documents;
                        tLRPC$TL_messages_stickerSet4.packs = groupStickerSetById.packs;
                        tLRPC$TL_messages_stickerSet4.set = groupStickerSetById.set;
                        if (this.groupStickersHidden) {
                            this.groupStickerPackNum = this.stickerSets.size();
                            this.stickerSets.add(tLRPC$TL_messages_stickerSet4);
                        } else {
                            this.groupStickerPackNum = 0;
                            this.stickerSets.add(0, tLRPC$TL_messages_stickerSet4);
                        }
                        if (this.info.can_set_stickers) {
                            tLRPC$TL_messages_stickerSet = tLRPC$TL_messages_stickerSet4;
                        }
                        this.groupStickerSet = tLRPC$TL_messages_stickerSet;
                    }
                } else if (tLRPC$ChatFull.can_set_stickers) {
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet5 = new TLRPC$TL_messages_stickerSet();
                    if (this.groupStickersHidden) {
                        this.groupStickerPackNum = this.stickerSets.size();
                        this.stickerSets.add(tLRPC$TL_messages_stickerSet5);
                    } else {
                        this.groupStickerPackNum = 0;
                        this.stickerSets.add(0, tLRPC$TL_messages_stickerSet5);
                    }
                }
            }
            int i8 = 0;
            while (i8 < this.stickerSets.size()) {
                if (i8 == this.groupStickerPackNum) {
                    TLRPC$Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.info.f855id));
                    if (chat2 == null) {
                        this.stickerSets.remove(0);
                        i8--;
                    } else {
                        this.hasChatStickers = true;
                        this.stickersTab.addStickerTab(chat2);
                    }
                } else {
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet6 = this.stickerSets.get(i8);
                    TLRPC$Document tLRPC$Document2 = tLRPC$TL_messages_stickerSet6.documents.get(0);
                    TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_messages_stickerSet6.set.thumbs, 90);
                    if (closestPhotoSizeWithSize == null || tLRPC$TL_messages_stickerSet6.set.gifs) {
                        closestPhotoSizeWithSize = tLRPC$Document2;
                    }
                    this.stickersTab.addStickerTab(closestPhotoSizeWithSize, tLRPC$Document2, tLRPC$TL_messages_stickerSet6).setContentDescription(tLRPC$TL_messages_stickerSet6.set.title + ", " + LocaleController.getString("AccDescrStickerSet", C0952R.string.AccDescrStickerSet));
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
    }

    private void checkPanels() {
        int findFirstVisibleItemPosition;
        if (this.stickersTab != null && (findFirstVisibleItemPosition = this.stickersLayoutManager.findFirstVisibleItemPosition()) != -1) {
            int i = this.favTabBum;
            if (i <= 0 && (i = this.recentTabBum) <= 0) {
                i = this.stickersTabOffset;
            }
            this.stickersTab.onPageScrolled(this.stickersGridAdapter.getTabForPosition(findFirstVisibleItemPosition), i);
        }
    }

    private void updateGifTabs() {
        int i;
        int currentPosition = this.gifTabs.getCurrentPosition();
        int i2 = this.gifRecentTabNum;
        boolean z = currentPosition == i2;
        boolean z2 = i2 >= 0;
        boolean z3 = !this.recentGifs.isEmpty();
        this.gifTabs.beginUpdate(false);
        this.gifRecentTabNum = -2;
        this.gifTrendingTabNum = -2;
        this.gifFirstEmojiTabNum = -2;
        if (z3) {
            this.gifRecentTabNum = 0;
            this.gifTabs.addIconTab(0, this.gifIcons[0]).setContentDescription(LocaleController.getString("RecentStickers", C0952R.string.RecentStickers));
            i = 1;
        } else {
            i = 0;
        }
        this.gifTrendingTabNum = i;
        this.gifTabs.addIconTab(1, this.gifIcons[1]).setContentDescription(LocaleController.getString("FeaturedGifs", C0952R.string.FeaturedGifs));
        this.gifFirstEmojiTabNum = i + 1;
        AndroidUtilities.m34dp(13.0f);
        AndroidUtilities.m34dp(11.0f);
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
        if (z && !z3) {
            this.gifTabs.selectTab(this.gifTrendingTabNum);
        } else if (ViewCompat.isLaidOut(this.gifTabs)) {
            if (z3 && !z2) {
                this.gifTabs.onPageScrolled(currentPosition + 1, 0);
            } else if (!z3 && z2) {
                this.gifTabs.onPageScrolled(currentPosition - 1, 0);
            }
        }
    }

    public void addRecentSticker(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null) {
            MediaDataController.getInstance(this.currentAccount).addRecentSticker(0, null, tLRPC$Document, (int) (System.currentTimeMillis() / 1000), false);
            boolean isEmpty = this.recentStickers.isEmpty();
            this.recentStickers = MediaDataController.getInstance(this.currentAccount).getRecentStickers(0);
            StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
            if (stickersGridAdapter != null) {
                stickersGridAdapter.notifyDataSetChanged();
            }
            if (isEmpty) {
                updateStickerTabs();
            }
        }
    }

    public void addRecentGif(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null) {
            boolean isEmpty = this.recentGifs.isEmpty();
            updateRecentGifs();
            if (isEmpty) {
                updateStickerTabs();
            }
        }
    }

    @Override
    public void requestLayout() {
        if (!this.isLayout) {
            super.requestLayout();
        }
    }

    public void updateColors() {
        SearchField searchField;
        if (AndroidUtilities.isInMultiwindow || this.forseMultiwindowLayout) {
            Drawable background = getBackground();
            if (background != null) {
                background.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_emojiPanelBackground"), PorterDuff.Mode.MULTIPLY));
            }
        } else {
            setBackgroundColor(getThemedColor("chat_emojiPanelBackground"));
            if (this.needEmojiSearch) {
                this.bottomTabContainerBackground.setBackgroundColor(getThemedColor("chat_emojiPanelBackground"));
            }
        }
        ScrollSlidingTabStrip scrollSlidingTabStrip = this.emojiTabs;
        if (scrollSlidingTabStrip != null) {
            scrollSlidingTabStrip.setBackgroundColor(getThemedColor("chat_emojiPanelBackground"));
            this.emojiTabsShadow.setBackgroundColor(getThemedColor("chat_emojiPanelShadowLine"));
        }
        EmojiColorPickerView emojiColorPickerView = this.pickerView;
        if (emojiColorPickerView != null) {
            Theme.setDrawableColor(emojiColorPickerView.backgroundDrawable, getThemedColor("dialogBackground"));
            Theme.setDrawableColor(this.pickerView.arrowDrawable, getThemedColor("dialogBackground"));
        }
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                searchField = this.stickersSearchField;
            } else if (i == 1) {
                searchField = this.emojiSearchField;
            } else {
                searchField = this.gifSearchField;
            }
            if (searchField != null) {
                searchField.backgroundView.setBackgroundColor(getThemedColor("chat_emojiPanelBackground"));
                searchField.shadowView.setBackgroundColor(getThemedColor("chat_emojiPanelShadowLine"));
                searchField.clearSearchImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_emojiSearchIcon"), PorterDuff.Mode.MULTIPLY));
                searchField.searchIconImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_emojiSearchIcon"), PorterDuff.Mode.MULTIPLY));
                Theme.setDrawableColorByKey(searchField.searchBackground.getBackground(), "chat_emojiSearchBackground");
                searchField.searchBackground.invalidate();
                searchField.searchEditText.setHintTextColor(getThemedColor("chat_emojiSearchIcon"));
                searchField.searchEditText.setTextColor(getThemedColor("windowBackgroundWhiteBlackText"));
            }
        }
        Paint paint = this.dotPaint;
        if (paint != null) {
            paint.setColor(getThemedColor("chat_emojiPanelNewTrending"));
        }
        RecyclerListView recyclerListView = this.emojiGridView;
        if (recyclerListView != null) {
            recyclerListView.setGlowColor(getThemedColor("chat_emojiPanelBackground"));
        }
        RecyclerListView recyclerListView2 = this.stickersGridView;
        if (recyclerListView2 != null) {
            recyclerListView2.setGlowColor(getThemedColor("chat_emojiPanelBackground"));
        }
        ScrollSlidingTabStrip scrollSlidingTabStrip2 = this.stickersTab;
        if (scrollSlidingTabStrip2 != null) {
            scrollSlidingTabStrip2.setIndicatorColor(getThemedColor("chat_emojiPanelStickerPackSelectorLine"));
            this.stickersTab.setUnderlineColor(getThemedColor("chat_emojiPanelShadowLine"));
            this.stickersTab.setBackgroundColor(getThemedColor("chat_emojiPanelBackground"));
        }
        ScrollSlidingTabStrip scrollSlidingTabStrip3 = this.gifTabs;
        if (scrollSlidingTabStrip3 != null) {
            scrollSlidingTabStrip3.setIndicatorColor(getThemedColor("chat_emojiPanelStickerPackSelectorLine"));
            this.gifTabs.setUnderlineColor(getThemedColor("chat_emojiPanelShadowLine"));
            this.gifTabs.setBackgroundColor(getThemedColor("chat_emojiPanelBackground"));
        }
        ImageView imageView = this.backspaceButton;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_emojiPanelBackspace"), PorterDuff.Mode.MULTIPLY));
            if (this.emojiSearchField == null) {
                Theme.setSelectorDrawableColor(this.backspaceButton.getBackground(), getThemedColor("chat_emojiPanelBackground"), false);
                Theme.setSelectorDrawableColor(this.backspaceButton.getBackground(), getThemedColor("chat_emojiPanelBackground"), true);
            }
        }
        ImageView imageView2 = this.stickerSettingsButton;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_emojiPanelBackspace"), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView3 = this.searchButton;
        if (imageView3 != null) {
            imageView3.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_emojiPanelBackspace"), PorterDuff.Mode.MULTIPLY));
        }
        View view = this.shadowLine;
        if (view != null) {
            view.setBackgroundColor(getThemedColor("chat_emojiPanelShadowLine"));
        }
        TextView textView = this.mediaBanTooltip;
        if (textView != null) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(getThemedColor("chat_gifSaveHintBackground"));
            this.mediaBanTooltip.setTextColor(getThemedColor("chat_gifSaveHintText"));
        }
        GifAdapter gifAdapter = this.gifSearchAdapter;
        if (gifAdapter != null) {
            gifAdapter.progressEmptyView.imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_emojiPanelEmptyText"), PorterDuff.Mode.MULTIPLY));
            this.gifSearchAdapter.progressEmptyView.textView.setTextColor(getThemedColor("chat_emojiPanelEmptyText"));
            this.gifSearchAdapter.progressEmptyView.progressView.setProgressColor(getThemedColor("progressCircle"));
        }
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.tabIcons;
            if (i2 >= drawableArr.length) {
                break;
            }
            Theme.setEmojiDrawableColor(drawableArr[i2], getThemedColor("chat_emojiBottomPanelIcon"), false);
            Theme.setEmojiDrawableColor(this.tabIcons[i2], getThemedColor("chat_emojiPanelIconSelected"), true);
            i2++;
        }
        int i3 = 0;
        while (true) {
            Drawable[] drawableArr2 = this.emojiIcons;
            if (i3 >= drawableArr2.length) {
                break;
            }
            Theme.setEmojiDrawableColor(drawableArr2[i3], getThemedColor("chat_emojiPanelIcon"), false);
            Theme.setEmojiDrawableColor(this.emojiIcons[i3], getThemedColor("chat_emojiPanelIconSelected"), true);
            i3++;
        }
        int i4 = 0;
        while (true) {
            Drawable[] drawableArr3 = this.stickerIcons;
            if (i4 >= drawableArr3.length) {
                break;
            }
            Theme.setEmojiDrawableColor(drawableArr3[i4], getThemedColor("chat_emojiPanelIcon"), false);
            Theme.setEmojiDrawableColor(this.stickerIcons[i4], getThemedColor("chat_emojiPanelIconSelected"), true);
            i4++;
        }
        int i5 = 0;
        while (true) {
            Drawable[] drawableArr4 = this.gifIcons;
            if (i5 >= drawableArr4.length) {
                break;
            }
            Theme.setEmojiDrawableColor(drawableArr4[i5], getThemedColor("chat_emojiPanelIcon"), false);
            Theme.setEmojiDrawableColor(this.gifIcons[i5], getThemedColor("chat_emojiPanelIconSelected"), true);
            i5++;
        }
        Drawable drawable = this.searchIconDrawable;
        if (drawable != null) {
            Theme.setEmojiDrawableColor(drawable, getThemedColor("chat_emojiBottomPanelIcon"), false);
            Theme.setEmojiDrawableColor(this.searchIconDrawable, getThemedColor("chat_emojiPanelIconSelected"), true);
        }
        Drawable drawable2 = this.searchIconDotDrawable;
        if (drawable2 != null) {
            Theme.setEmojiDrawableColor(drawable2, getThemedColor("chat_emojiPanelStickerPackSelectorLine"), false);
            Theme.setEmojiDrawableColor(this.searchIconDotDrawable, getThemedColor("chat_emojiPanelStickerPackSelectorLine"), true);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        this.isLayout = true;
        if (AndroidUtilities.isInMultiwindow || this.forseMultiwindowLayout) {
            if (this.currentBackgroundType != 1) {
                if (Build.VERSION.SDK_INT >= 21) {
                    setOutlineProvider((ViewOutlineProvider) this.outlineProvider);
                    setClipToOutline(true);
                    setElevation(AndroidUtilities.m34dp(2.0f));
                }
                setBackgroundResource(C0952R.C0953drawable.smiles_popup);
                getBackground().setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_emojiPanelBackground"), PorterDuff.Mode.MULTIPLY));
                if (this.needEmojiSearch) {
                    this.bottomTabContainerBackground.setBackgroundColor(getThemedColor("chat_emojiPanelBackground"));
                }
                this.currentBackgroundType = 1;
            }
        } else if (this.currentBackgroundType != 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOutlineProvider(null);
                setClipToOutline(false);
                setElevation(0.0f);
            }
            setBackgroundColor(getThemedColor("chat_emojiPanelBackground"));
            if (this.needEmojiSearch) {
                this.bottomTabContainerBackground.setBackgroundColor(getThemedColor("chat_emojiPanelBackground"));
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
        View view = (View) getParent();
        if (view != null) {
            int i6 = i4 - i2;
            int height = view.getHeight();
            if (!(this.lastNotifyHeight == i6 && this.lastNotifyHeight2 == height)) {
                EmojiViewDelegate emojiViewDelegate = this.delegate;
                if (emojiViewDelegate != null && emojiViewDelegate.isSearchOpened()) {
                    this.bottomTabContainer.setTranslationY(AndroidUtilities.m34dp(49.0f));
                } else if (this.bottomTabContainer.getTag() == null && i6 <= this.lastNotifyHeight) {
                    this.bottomTabContainer.setTranslationY(0.0f);
                }
                this.lastNotifyHeight = i6;
                this.lastNotifyHeight2 = height;
            }
        }
        super.onLayout(z, i, i2, i3, i4);
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

    public void setChatInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.info = tLRPC$ChatFull;
        updateStickerTabs();
    }

    public void invalidateViews() {
        this.emojiGridView.invalidateViews();
    }

    public void setForseMultiwindowLayout(boolean z) {
        this.forseMultiwindowLayout = z;
    }

    public void onOpen(boolean z) {
        if (!(this.currentPage == 0 || this.currentChatId == 0)) {
            this.currentPage = 0;
        }
        if (this.currentPage == 0 || z || this.views.size() == 1) {
            showBackspaceButton(true, false);
            showStickerSettingsButton(false, false);
            if (this.pager.getCurrentItem() != 0) {
                this.pager.setCurrentItem(0, !z);
                return;
            }
            return;
        }
        int i = this.currentPage;
        if (i == 1) {
            showBackspaceButton(false, false);
            showStickerSettingsButton(true, false);
            if (this.pager.getCurrentItem() != 2) {
                this.pager.setCurrentItem(2, false);
            }
            ScrollSlidingTabStrip scrollSlidingTabStrip = this.stickersTab;
            if (scrollSlidingTabStrip != null) {
                this.firstTabUpdate = true;
                int i2 = this.favTabBum;
                if (i2 >= 0) {
                    scrollSlidingTabStrip.selectTab(i2);
                } else {
                    int i3 = this.recentTabBum;
                    if (i3 >= 0) {
                        scrollSlidingTabStrip.selectTab(i3);
                    } else {
                        scrollSlidingTabStrip.selectTab(this.stickersTabOffset);
                    }
                }
                this.firstTabUpdate = false;
                this.stickersLayoutManager.scrollToPositionWithOffset(1, 0);
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
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        if (this.stickersGridAdapter != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    EmojiView.this.lambda$onAttachedToWindow$10();
                }
            });
        }
    }

    public void lambda$onAttachedToWindow$10() {
        updateStickerTabs();
        reloadStickersAdapter();
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 8) {
            Emoji.sortEmoji();
            this.emojiAdapter.notifyDataSetChanged();
            if (this.stickersGridAdapter != null) {
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
                updateStickerTabs();
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

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void onDestroy() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.newEmojiSuggestionsAvailable);
        if (this.stickersGridAdapter != null) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EmojiPopupWindow emojiPopupWindow = this.pickerViewPopup;
        if (emojiPopupWindow != null && emojiPopupWindow.isShowing()) {
            this.pickerViewPopup.dismiss();
        }
    }

    private void checkDocuments(boolean z) {
        if (z) {
            updateRecentGifs();
            return;
        }
        int size = this.recentStickers.size();
        int size2 = this.favouriteStickers.size();
        this.recentStickers = MediaDataController.getInstance(this.currentAccount).getRecentStickers(0);
        this.favouriteStickers = MediaDataController.getInstance(this.currentAccount).getRecentStickers(2);
        for (int i = 0; i < this.favouriteStickers.size(); i++) {
            TLRPC$Document tLRPC$Document = this.favouriteStickers.get(i);
            int i2 = 0;
            while (true) {
                if (i2 < this.recentStickers.size()) {
                    TLRPC$Document tLRPC$Document2 = this.recentStickers.get(i2);
                    if (tLRPC$Document2.dc_id == tLRPC$Document.dc_id && tLRPC$Document2.f861id == tLRPC$Document.f861id) {
                        this.recentStickers.remove(i2);
                        break;
                    }
                    i2++;
                }
            }
        }
        if (!(size == this.recentStickers.size() && size2 == this.favouriteStickers.size())) {
            updateStickerTabs();
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
        long calcDocumentsHash = MediaDataController.calcDocumentsHash(this.recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayList<TLRPC$Document> recentGifs = MediaDataController.getInstance(this.currentAccount).getRecentGifs();
        this.recentGifs = recentGifs;
        long calcDocumentsHash2 = MediaDataController.calcDocumentsHash(recentGifs, ConnectionsManager.DEFAULT_DATACENTER_ID);
        if ((this.gifTabs != null && size == 0 && !this.recentGifs.isEmpty()) || (size != 0 && this.recentGifs.isEmpty())) {
            updateGifTabs();
        }
        if ((size != this.recentGifs.size() || calcDocumentsHash != calcDocumentsHash2) && (gifAdapter = this.gifAdapter) != null) {
            gifAdapter.notifyDataSetChanged();
        }
    }

    public void setStickersBanned(boolean z, long j) {
        PagerSlidingTabStrip pagerSlidingTabStrip = this.typeTabs;
        if (pagerSlidingTabStrip != null) {
            if (z) {
                this.currentChatId = j;
            } else {
                this.currentChatId = 0L;
            }
            View tab = pagerSlidingTabStrip.getTab(2);
            if (tab != null) {
                tab.setAlpha(this.currentChatId != 0 ? 0.5f : 1.0f);
                if (this.currentChatId != 0 && this.pager.getCurrentItem() != 0) {
                    showBackspaceButton(true, true);
                    showStickerSettingsButton(false, true);
                    this.pager.setCurrentItem(0, false);
                }
            }
        }
    }

    public void showStickerBanHint(boolean z) {
        TLRPC$Chat chat;
        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights;
        if (this.mediaBanTooltip.getVisibility() != 0 && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.currentChatId))) != null) {
            if (ChatObject.hasAdminRights(chat) || (tLRPC$TL_chatBannedRights = chat.default_banned_rights) == null || !tLRPC$TL_chatBannedRights.send_stickers) {
                TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2 = chat.banned_rights;
                if (tLRPC$TL_chatBannedRights2 != null) {
                    if (AndroidUtilities.isBannedForever(tLRPC$TL_chatBannedRights2)) {
                        if (z) {
                            this.mediaBanTooltip.setText(LocaleController.getString("AttachGifRestrictedForever", C0952R.string.AttachGifRestrictedForever));
                        } else {
                            this.mediaBanTooltip.setText(LocaleController.getString("AttachStickersRestrictedForever", C0952R.string.AttachStickersRestrictedForever));
                        }
                    } else if (z) {
                        this.mediaBanTooltip.setText(LocaleController.formatString("AttachGifRestricted", C0952R.string.AttachGifRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    } else {
                        this.mediaBanTooltip.setText(LocaleController.formatString("AttachStickersRestricted", C0952R.string.AttachStickersRestricted, LocaleController.formatDateForBan(chat.banned_rights.until_date)));
                    }
                } else {
                    return;
                }
            } else if (z) {
                this.mediaBanTooltip.setText(LocaleController.getString("GlobalAttachGifRestricted", C0952R.string.GlobalAttachGifRestricted));
            } else {
                this.mediaBanTooltip.setText(LocaleController.getString("GlobalAttachStickersRestricted", C0952R.string.GlobalAttachStickersRestricted));
            }
            this.mediaBanTooltip.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.mediaBanTooltip, View.ALPHA, 0.0f, 1.0f));
            animatorSet.addListener(new C200536());
            animatorSet.setDuration(300L);
            animatorSet.start();
        }
    }

    public class C200536 extends AnimatorListenerAdapter {
        C200536() {
            EmojiView.this = r1;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    EmojiView.C200536.this.lambda$onAnimationEnd$0();
                }
            }, 5000L);
        }

        public void lambda$onAnimationEnd$0() {
            if (EmojiView.this.mediaBanTooltip != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(EmojiView.this.mediaBanTooltip, View.ALPHA, 0.0f));
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    {
                        C200536.this = this;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (EmojiView.this.mediaBanTooltip != null) {
                            EmojiView.this.mediaBanTooltip.setVisibility(4);
                        }
                    }
                });
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    private void updateVisibleTrendingSets() {
        boolean z;
        RecyclerListView recyclerListView = this.stickersGridView;
        if (recyclerListView != null) {
            try {
                int childCount = recyclerListView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.stickersGridView.getChildAt(i);
                    if ((childAt instanceof FeaturedStickerSetInfoCell) && ((RecyclerListView.Holder) this.stickersGridView.getChildViewHolder(childAt)) != null) {
                        FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) childAt;
                        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(this.currentAccount).getUnreadStickerSets();
                        TLRPC$StickerSetCovered stickerSet = featuredStickerSetInfoCell.getStickerSet();
                        boolean z2 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSet.set.f886id));
                        int i2 = 0;
                        while (true) {
                            TLRPC$StickerSetCovered[] tLRPC$StickerSetCoveredArr = this.primaryInstallingStickerSets;
                            if (i2 >= tLRPC$StickerSetCoveredArr.length) {
                                z = false;
                                break;
                            }
                            if (tLRPC$StickerSetCoveredArr[i2] != null && tLRPC$StickerSetCoveredArr[i2].set.f886id == stickerSet.set.f886id) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                        featuredStickerSetInfoCell.setStickerSet(stickerSet, z2, true, 0, 0, z);
                        if (z2) {
                            MediaDataController.getInstance(this.currentAccount).markFaturedStickersByIdAsRead(stickerSet.set.f886id);
                        }
                        boolean z3 = this.installingStickerSets.indexOfKey(stickerSet.set.f886id) >= 0;
                        boolean z4 = this.removingStickerSets.indexOfKey(stickerSet.set.f886id) >= 0;
                        if (z3 || z4) {
                            if (z3 && featuredStickerSetInfoCell.isInstalled()) {
                                this.installingStickerSets.remove(stickerSet.set.f886id);
                                z3 = false;
                            } else if (z4 && !featuredStickerSetInfoCell.isInstalled()) {
                                this.removingStickerSets.remove(stickerSet.set.f886id);
                            }
                        }
                        featuredStickerSetInfoCell.setAddDrawProgress(!z && z3, true);
                    }
                }
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
    }

    public boolean areThereAnyStickers() {
        StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
        return stickersGridAdapter != null && stickersGridAdapter.getItemCount() > 0;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC$StickerSet tLRPC$StickerSet;
        int i3 = 0;
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == 0) {
                updateStickerTabs();
                updateVisibleTrendingSets();
                reloadStickersAdapter();
                checkPanels();
            }
        } else if (i == NotificationCenter.recentDocumentsDidLoad) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            int intValue = ((Integer) objArr[1]).intValue();
            if (booleanValue || intValue == 0 || intValue == 2) {
                checkDocuments(booleanValue);
            }
        } else if (i == NotificationCenter.featuredStickersDidLoad) {
            updateVisibleTrendingSets();
            PagerSlidingTabStrip pagerSlidingTabStrip = this.typeTabs;
            if (pagerSlidingTabStrip != null) {
                int childCount = pagerSlidingTabStrip.getChildCount();
                while (i3 < childCount) {
                    this.typeTabs.getChildAt(i3).invalidate();
                    i3++;
                }
            }
            updateStickerTabs();
        } else if (i == NotificationCenter.groupStickersDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull = this.info;
            if (tLRPC$ChatFull != null && (tLRPC$StickerSet = tLRPC$ChatFull.stickerset) != null && tLRPC$StickerSet.f886id == ((Long) objArr[0]).longValue()) {
                updateStickerTabs();
            }
        } else if (i == NotificationCenter.emojiLoaded) {
            RecyclerListView recyclerListView = this.stickersGridView;
            if (recyclerListView != null) {
                int childCount2 = recyclerListView.getChildCount();
                while (i3 < childCount2) {
                    View childAt = this.stickersGridView.getChildAt(i3);
                    if ((childAt instanceof StickerSetNameCell) || (childAt instanceof StickerEmojiCell)) {
                        childAt.invalidate();
                    }
                    i3++;
                }
            }
            EmojiColorPickerView emojiColorPickerView = this.pickerView;
            if (emojiColorPickerView != null) {
                emojiColorPickerView.invalidate();
            }
            ScrollSlidingTabStrip scrollSlidingTabStrip = this.gifTabs;
            if (scrollSlidingTabStrip != null) {
                scrollSlidingTabStrip.invalidateTabs();
            }
        } else if (i == NotificationCenter.newEmojiSuggestionsAvailable && this.emojiGridView != null && this.needEmojiSearch) {
            if ((this.emojiSearchField.progressDrawable.isAnimating() || this.emojiGridView.getAdapter() == this.emojiSearchAdapter) && !TextUtils.isEmpty(this.emojiSearchAdapter.lastSearchEmojiString)) {
                EmojiSearchAdapter emojiSearchAdapter = this.emojiSearchAdapter;
                emojiSearchAdapter.search(emojiSearchAdapter.lastSearchEmojiString);
            }
        }
    }

    public int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    public class TrendingAdapter extends RecyclerListView.SelectionAdapter {
        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        private TrendingAdapter() {
            EmojiView.this = r1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            BackupImageView backupImageView = new BackupImageView(EmojiView.this.getContext()) {
                {
                    TrendingAdapter.this = this;
                }

                @Override
                public void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    if (MediaDataController.getInstance(EmojiView.this.currentAccount).isStickerPackUnread(((TLRPC$StickerSetCovered) getTag()).set.f886id) && EmojiView.this.dotPaint != null) {
                        canvas.drawCircle(canvas.getWidth() - AndroidUtilities.m34dp(8.0f), AndroidUtilities.m34dp(14.0f), AndroidUtilities.m34dp(3.0f), EmojiView.this.dotPaint);
                    }
                }
            };
            backupImageView.setSize(AndroidUtilities.m34dp(30.0f), AndroidUtilities.m34dp(30.0f));
            backupImageView.setLayerNum(1);
            backupImageView.setAspectFit(true);
            backupImageView.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.m34dp(52.0f), AndroidUtilities.m34dp(52.0f)));
            return new RecyclerListView.Holder(backupImageView);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ImageLocation forSticker;
            BackupImageView backupImageView = (BackupImageView) viewHolder.itemView;
            TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) EmojiView.this.featuredStickerSets.get(i);
            backupImageView.setTag(tLRPC$StickerSetCovered);
            TLRPC$Document tLRPC$Document = tLRPC$StickerSetCovered.cover;
            if (!tLRPC$StickerSetCovered.covers.isEmpty()) {
                tLRPC$Document = tLRPC$StickerSetCovered.covers.get(0);
            }
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$StickerSetCovered.set.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$StickerSetCovered.set.thumbs, "emptyListPlaceholder", 0.2f);
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            if (closestPhotoSizeWithSize == null || MessageObject.isVideoSticker(tLRPC$Document)) {
                closestPhotoSizeWithSize = tLRPC$Document;
            }
            boolean z = closestPhotoSizeWithSize instanceof TLRPC$Document;
            if (z) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90), tLRPC$Document);
            } else if (closestPhotoSizeWithSize instanceof TLRPC$PhotoSize) {
                forSticker = ImageLocation.getForSticker((TLRPC$PhotoSize) closestPhotoSizeWithSize, tLRPC$Document, tLRPC$StickerSetCovered.set.thumb_version);
            } else {
                return;
            }
            ImageLocation imageLocation = forSticker;
            if (imageLocation != null) {
                if (!z || (!MessageObject.isAnimatedStickerDocument(tLRPC$Document, true) && !MessageObject.isVideoSticker(tLRPC$Document))) {
                    if (imageLocation.imageType == 1) {
                        backupImageView.setImage(imageLocation, "30_30", "tgs", svgThumb, tLRPC$StickerSetCovered);
                    } else {
                        backupImageView.setImage(imageLocation, (String) null, "webp", svgThumb, tLRPC$StickerSetCovered);
                    }
                } else if (svgThumb != null) {
                    backupImageView.setImage(ImageLocation.getForDocument(tLRPC$Document), "30_30", svgThumb, 0, tLRPC$StickerSetCovered);
                } else {
                    backupImageView.setImage(ImageLocation.getForDocument(tLRPC$Document), "30_30", imageLocation, (String) null, 0, tLRPC$StickerSetCovered);
                }
            }
        }

        @Override
        public int getItemCount() {
            return EmojiView.this.featuredStickerSets.size();
        }
    }

    public class StickersGridAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private int stickersPerRow;
        private int totalItems;
        private SparseArray<Object> rowStartPack = new SparseArray<>();
        private HashMap<Object, Integer> packStartPosition = new HashMap<>();
        private SparseArray<Object> cache = new SparseArray<>();
        private SparseArray<Object> cacheParents = new SparseArray<>();
        private SparseIntArray positionToRow = new SparseIntArray();

        public StickersGridAdapter(Context context) {
            EmojiView.this = r1;
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
            Integer num = this.packStartPosition.get(obj);
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
            if (obj instanceof TLRPC$Document) {
                return 0;
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
            if (!"search".equals(obj) && !"trend1".equals(obj) && !"trend2".equals(obj)) {
                if (i == 0) {
                    i = 1;
                }
                if (this.stickersPerRow == 0) {
                    int measuredWidth = EmojiView.this.getMeasuredWidth();
                    if (measuredWidth == 0) {
                        measuredWidth = AndroidUtilities.displaySize.x;
                    }
                    this.stickersPerRow = measuredWidth / AndroidUtilities.m34dp(72.0f);
                }
                int i2 = this.positionToRow.get(i, Integer.MIN_VALUE);
                if (i2 == Integer.MIN_VALUE) {
                    return (EmojiView.this.stickerSets.size() - 1) + EmojiView.this.stickersTabOffset;
                }
                Object obj2 = this.rowStartPack.get(i2);
                if (obj2 instanceof String) {
                    return "recent".equals(obj2) ? EmojiView.this.recentTabBum : EmojiView.this.favTabBum;
                }
                return EmojiView.this.stickerSets.indexOf((TLRPC$TL_messages_stickerSet) obj2) + EmojiView.this.stickersTabOffset;
            } else if (EmojiView.this.favTabBum >= 0) {
                return EmojiView.this.favTabBum;
            } else {
                if (EmojiView.this.recentTabBum >= 0) {
                    return EmojiView.this.recentTabBum;
                }
                return 0;
            }
        }

        public void lambda$onCreateViewHolder$0(View view) {
            if (EmojiView.this.groupStickerSet == null) {
                SharedPreferences.Editor edit = MessagesController.getEmojiSettings(EmojiView.this.currentAccount).edit();
                edit.putLong("group_hide_stickers_" + EmojiView.this.info.f855id, EmojiView.this.info.stickerset != null ? EmojiView.this.info.stickerset.f886id : 0L).commit();
                EmojiView.this.updateStickerTabs();
                if (EmojiView.this.stickersGridAdapter != null) {
                    EmojiView.this.stickersGridAdapter.notifyDataSetChanged();
                }
            } else if (EmojiView.this.delegate != null) {
                EmojiView.this.delegate.onStickersGroupClick(EmojiView.this.info.f855id);
            }
        }

        public void lambda$onCreateViewHolder$1(View view) {
            if (EmojiView.this.delegate != null) {
                EmojiView.this.delegate.onStickersGroupClick(EmojiView.this.info.f855id);
            }
        }

        public void lambda$onCreateViewHolder$2(View view) {
            ArrayList<TLRPC$StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(EmojiView.this.currentAccount).getFeaturedStickerSets();
            if (!featuredStickerSets.isEmpty()) {
                MessagesController.getEmojiSettings(EmojiView.this.currentAccount).edit().putLong("featured_hidden", featuredStickerSets.get(0).set.f886id).commit();
                if (EmojiView.this.stickersGridAdapter != null) {
                    EmojiView.this.stickersGridAdapter.notifyItemRangeRemoved(1, 2);
                }
                EmojiView.this.updateStickerTabs();
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerListView recyclerListView = null;
            switch (i) {
                case 0:
                    recyclerListView = new StickerEmojiCell(this, this.context, true) {
                        @Override
                        public void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(82.0f), 1073741824));
                        }
                    };
                    break;
                case 1:
                    recyclerListView = new EmptyCell(this.context);
                    break;
                case 2:
                    StickerSetNameCell stickerSetNameCell = new StickerSetNameCell(this.context, false, EmojiView.this.resourcesProvider);
                    stickerSetNameCell.setOnIconClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            EmojiView.StickersGridAdapter.this.lambda$onCreateViewHolder$0(view);
                        }
                    });
                    recyclerListView = stickerSetNameCell;
                    break;
                case 3:
                    StickerSetGroupInfoCell stickerSetGroupInfoCell = new StickerSetGroupInfoCell(this.context);
                    stickerSetGroupInfoCell.setAddOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            EmojiView.StickersGridAdapter.this.lambda$onCreateViewHolder$1(view);
                        }
                    });
                    stickerSetGroupInfoCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    recyclerListView = stickerSetGroupInfoCell;
                    break;
                case 4:
                    View view = new View(this.context);
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, EmojiView.this.searchFieldHeight));
                    recyclerListView = view;
                    break;
                case 5:
                    StickerSetNameCell stickerSetNameCell2 = new StickerSetNameCell(this.context, false, EmojiView.this.resourcesProvider);
                    stickerSetNameCell2.setOnIconClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            EmojiView.StickersGridAdapter.this.lambda$onCreateViewHolder$2(view2);
                        }
                    });
                    recyclerListView = stickerSetNameCell2;
                    break;
                case 6:
                    RecyclerListView recyclerListView2 = new RecyclerListView(this.context) {
                        {
                            StickersGridAdapter.this = this;
                        }

                        @Override
                        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                            if (!(getParent() == null || getParent().getParent() == null)) {
                                getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1) || canScrollHorizontally(1));
                                EmojiView.this.pager.requestDisallowInterceptTouchEvent(true);
                            }
                            return super.onInterceptTouchEvent(motionEvent);
                        }
                    };
                    recyclerListView2.setSelectorRadius(AndroidUtilities.m34dp(4.0f));
                    recyclerListView2.setSelectorDrawableColor(EmojiView.this.getThemedColor("listSelectorSDK21"));
                    recyclerListView2.setTag(9);
                    recyclerListView2.setItemAnimator(null);
                    recyclerListView2.setLayoutAnimation(null);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, this.context) {
                        @Override
                        public boolean supportsPredictiveItemAnimations() {
                            return false;
                        }
                    };
                    linearLayoutManager.setOrientation(0);
                    recyclerListView2.setLayoutManager(linearLayoutManager);
                    EmojiView emojiView = EmojiView.this;
                    recyclerListView2.setAdapter(emojiView.trendingAdapter = new TrendingAdapter());
                    recyclerListView2.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                        @Override
                        public final void onItemClick(View view2, int i2) {
                            EmojiView.StickersGridAdapter.this.lambda$onCreateViewHolder$3(view2, i2);
                        }
                    });
                    recyclerListView2.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.m34dp(52.0f)));
                    recyclerListView = recyclerListView2;
                    break;
            }
            return new RecyclerListView.Holder(recyclerListView);
        }

        public void lambda$onCreateViewHolder$3(View view, int i) {
            EmojiView.this.openTrendingStickers((TLRPC$StickerSetCovered) view.getTag());
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            boolean z = false;
            if (itemViewType != 0) {
                ArrayList<TLRPC$Document> arrayList = null;
                TLRPC$Chat tLRPC$Chat = null;
                int i2 = 1;
                if (itemViewType != 1) {
                    int i3 = C0952R.C0953drawable.stickerset_close;
                    if (itemViewType == 2) {
                        StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
                        if (i == EmojiView.this.groupStickerPackPosition) {
                            if (EmojiView.this.groupStickersHidden && EmojiView.this.groupStickerSet == null) {
                                i3 = 0;
                            } else if (EmojiView.this.groupStickerSet != null) {
                                i3 = C0952R.C0953drawable.stickersclose;
                            }
                            if (EmojiView.this.info != null) {
                                tLRPC$Chat = MessagesController.getInstance(EmojiView.this.currentAccount).getChat(Long.valueOf(EmojiView.this.info.f855id));
                            }
                            Object[] objArr = new Object[1];
                            objArr[0] = tLRPC$Chat != null ? tLRPC$Chat.title : "Group Stickers";
                            stickerSetNameCell.setText(LocaleController.formatString("CurrentGroupStickers", C0952R.string.CurrentGroupStickers, objArr), i3);
                            return;
                        }
                        Object obj = this.cache.get(i);
                        if (obj instanceof TLRPC$TL_messages_stickerSet) {
                            TLRPC$StickerSet tLRPC$StickerSet = ((TLRPC$TL_messages_stickerSet) obj).set;
                            if (tLRPC$StickerSet != null) {
                                stickerSetNameCell.setText(tLRPC$StickerSet.title, 0);
                            }
                        } else if (obj == EmojiView.this.recentStickers) {
                            stickerSetNameCell.setText(LocaleController.getString("RecentStickers", C0952R.string.RecentStickers), 0);
                        } else if (obj == EmojiView.this.favouriteStickers) {
                            stickerSetNameCell.setText(LocaleController.getString("FavoriteStickers", C0952R.string.FavoriteStickers), 0);
                        }
                    } else if (itemViewType == 3) {
                        StickerSetGroupInfoCell stickerSetGroupInfoCell = (StickerSetGroupInfoCell) viewHolder.itemView;
                        if (i == this.totalItems - 1) {
                            z = true;
                        }
                        stickerSetGroupInfoCell.setIsLast(z);
                    } else if (itemViewType == 5) {
                        ((StickerSetNameCell) viewHolder.itemView).setText(LocaleController.getString("FeaturedStickers", C0952R.string.FeaturedStickers), C0952R.C0953drawable.stickerset_close);
                    }
                } else {
                    EmptyCell emptyCell = (EmptyCell) viewHolder.itemView;
                    if (i == this.totalItems) {
                        int i4 = this.positionToRow.get(i - 1, Integer.MIN_VALUE);
                        if (i4 == Integer.MIN_VALUE) {
                            emptyCell.setHeight(1);
                            return;
                        }
                        Object obj2 = this.rowStartPack.get(i4);
                        if (obj2 instanceof TLRPC$TL_messages_stickerSet) {
                            arrayList = ((TLRPC$TL_messages_stickerSet) obj2).documents;
                        } else if (obj2 instanceof String) {
                            arrayList = "recent".equals(obj2) ? EmojiView.this.recentStickers : EmojiView.this.favouriteStickers;
                        }
                        if (arrayList == null) {
                            emptyCell.setHeight(1);
                        } else if (arrayList.isEmpty()) {
                            emptyCell.setHeight(AndroidUtilities.m34dp(8.0f));
                        } else {
                            int height = EmojiView.this.pager.getHeight() - (((int) Math.ceil(arrayList.size() / this.stickersPerRow)) * AndroidUtilities.m34dp(82.0f));
                            if (height > 0) {
                                i2 = height;
                            }
                            emptyCell.setHeight(i2);
                        }
                    } else {
                        emptyCell.setHeight(AndroidUtilities.m34dp(82.0f));
                    }
                }
            } else {
                TLRPC$Document tLRPC$Document = (TLRPC$Document) this.cache.get(i);
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) viewHolder.itemView;
                stickerEmojiCell.setSticker(tLRPC$Document, this.cacheParents.get(i), false);
                stickerEmojiCell.setRecent(EmojiView.this.recentStickers.contains(tLRPC$Document));
            }
        }

        private void updateItems() {
            Object obj;
            ArrayList<TLRPC$Document> arrayList;
            int i;
            int measuredWidth = EmojiView.this.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            this.stickersPerRow = measuredWidth / AndroidUtilities.m34dp(72.0f);
            EmojiView.this.stickersLayoutManager.setSpanCount(this.stickersPerRow);
            this.rowStartPack.clear();
            this.packStartPosition.clear();
            this.positionToRow.clear();
            this.cache.clear();
            int i2 = 0;
            this.totalItems = 0;
            ArrayList arrayList2 = EmojiView.this.stickerSets;
            int i3 = -4;
            int i4 = -4;
            int i5 = 0;
            while (i4 < arrayList2.size()) {
                if (i4 == i3) {
                    SparseArray<Object> sparseArray = this.cache;
                    int i6 = this.totalItems;
                    this.totalItems = i6 + 1;
                    sparseArray.put(i6, "search");
                    i5++;
                } else if (i4 == -3) {
                    MediaDataController mediaDataController = MediaDataController.getInstance(EmojiView.this.currentAccount);
                    SharedPreferences emojiSettings = MessagesController.getEmojiSettings(EmojiView.this.currentAccount);
                    ArrayList<TLRPC$StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                    if (!EmojiView.this.featuredStickerSets.isEmpty() && emojiSettings.getLong("featured_hidden", 0L) != featuredStickerSets.get(i2).set.f886id) {
                        SparseArray<Object> sparseArray2 = this.cache;
                        int i7 = this.totalItems;
                        this.totalItems = i7 + 1;
                        sparseArray2.put(i7, "trend1");
                        SparseArray<Object> sparseArray3 = this.cache;
                        int i8 = this.totalItems;
                        this.totalItems = i8 + 1;
                        sparseArray3.put(i8, "trend2");
                        i5 += 2;
                    }
                } else {
                    TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = null;
                    if (i4 == -2) {
                        arrayList = EmojiView.this.favouriteStickers;
                        this.packStartPosition.put("fav", Integer.valueOf(this.totalItems));
                        obj = "fav";
                    } else if (i4 == -1) {
                        arrayList = EmojiView.this.recentStickers;
                        this.packStartPosition.put("recent", Integer.valueOf(this.totalItems));
                        obj = "recent";
                    } else {
                        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet2 = (TLRPC$TL_messages_stickerSet) arrayList2.get(i4);
                        ArrayList<TLRPC$Document> arrayList3 = tLRPC$TL_messages_stickerSet2.documents;
                        this.packStartPosition.put(tLRPC$TL_messages_stickerSet2, Integer.valueOf(this.totalItems));
                        tLRPC$TL_messages_stickerSet = tLRPC$TL_messages_stickerSet2;
                        arrayList = arrayList3;
                        obj = null;
                    }
                    if (i4 == EmojiView.this.groupStickerPackNum) {
                        EmojiView.this.groupStickerPackPosition = this.totalItems;
                        if (arrayList.isEmpty()) {
                            this.rowStartPack.put(i5, tLRPC$TL_messages_stickerSet);
                            int i9 = i5 + 1;
                            this.positionToRow.put(this.totalItems, i5);
                            this.rowStartPack.put(i9, tLRPC$TL_messages_stickerSet);
                            i5 = i9 + 1;
                            this.positionToRow.put(this.totalItems + 1, i9);
                            SparseArray<Object> sparseArray4 = this.cache;
                            int i10 = this.totalItems;
                            this.totalItems = i10 + 1;
                            sparseArray4.put(i10, tLRPC$TL_messages_stickerSet);
                            SparseArray<Object> sparseArray5 = this.cache;
                            int i11 = this.totalItems;
                            this.totalItems = i11 + 1;
                            sparseArray5.put(i11, "group");
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        int ceil = (int) Math.ceil(arrayList.size() / this.stickersPerRow);
                        if (tLRPC$TL_messages_stickerSet != null) {
                            this.cache.put(this.totalItems, tLRPC$TL_messages_stickerSet);
                        } else {
                            this.cache.put(this.totalItems, arrayList);
                        }
                        this.positionToRow.put(this.totalItems, i5);
                        int i12 = 0;
                        while (i12 < arrayList.size()) {
                            int i13 = i12 + 1;
                            int i14 = this.totalItems + i13;
                            this.cache.put(i14, arrayList.get(i12));
                            if (tLRPC$TL_messages_stickerSet != null) {
                                this.cacheParents.put(i14, tLRPC$TL_messages_stickerSet);
                            } else {
                                this.cacheParents.put(i14, obj);
                            }
                            this.positionToRow.put(this.totalItems + i13, i5 + 1 + (i12 / this.stickersPerRow));
                            i12 = i13;
                        }
                        int i15 = 0;
                        while (true) {
                            i = ceil + 1;
                            if (i15 >= i) {
                                break;
                            }
                            if (tLRPC$TL_messages_stickerSet != null) {
                                this.rowStartPack.put(i5 + i15, tLRPC$TL_messages_stickerSet);
                            } else {
                                this.rowStartPack.put(i5 + i15, i4 == -1 ? "recent" : "fav");
                            }
                            i15++;
                        }
                        this.totalItems += (ceil * this.stickersPerRow) + 1;
                        i5 += i;
                    }
                }
                i4++;
                i2 = 0;
                i3 = -4;
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

    public class EmojiGridAdapter extends RecyclerListView.SelectionAdapter {
        private int itemCount;
        private SparseIntArray positionToSection;
        private SparseIntArray sectionToPosition;

        @Override
        public long getItemId(int i) {
            return i;
        }

        private EmojiGridAdapter() {
            EmojiView.this = r1;
            this.positionToSection = new SparseIntArray();
            this.sectionToPosition = new SparseIntArray();
        }

        @Override
        public int getItemCount() {
            return this.itemCount;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                EmojiView emojiView = EmojiView.this;
                view = new ImageViewEmoji(emojiView.getContext());
            } else if (i != 1) {
                view = new View(EmojiView.this.getContext());
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, EmojiView.this.searchFieldHeight));
            } else {
                view = new StickerSetNameCell(EmojiView.this.getContext(), true, EmojiView.this.resourcesProvider);
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.EmojiView.EmojiGridAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override
        public int getItemViewType(int i) {
            if (!EmojiView.this.needEmojiSearch || i != 0) {
                return this.positionToSection.indexOfKey(i) >= 0 ? 1 : 0;
            }
            return 2;
        }

        @Override
        public void notifyDataSetChanged() {
            this.positionToSection.clear();
            this.itemCount = Emoji.recentEmoji.size() + (EmojiView.this.needEmojiSearch ? 1 : 0);
            int i = 0;
            while (true) {
                String[][] strArr = EmojiData.dataColored;
                if (i < strArr.length) {
                    this.positionToSection.put(this.itemCount, i);
                    this.sectionToPosition.put(i, this.itemCount);
                    this.itemCount += strArr[i].length + 1;
                    i++;
                } else {
                    EmojiView.this.updateEmojiTabs();
                    super.notifyDataSetChanged();
                    return;
                }
            }
        }
    }

    public class EmojiSearchAdapter extends RecyclerListView.SelectionAdapter {
        private String lastSearchAlias;
        private String lastSearchEmojiString;
        private ArrayList<MediaDataController.KeywordResult> result;
        private Runnable searchRunnable;
        private boolean searchWas;

        private EmojiSearchAdapter() {
            EmojiView.this = r1;
            this.result = new ArrayList<>();
        }

        @Override
        public int getItemCount() {
            int size;
            if (this.result.isEmpty() && !this.searchWas) {
                size = Emoji.recentEmoji.size();
            } else if (this.result.isEmpty()) {
                return 2;
            } else {
                size = this.result.size();
            }
            return size + 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout frameLayout;
            if (i == 0) {
                EmojiView emojiView = EmojiView.this;
                frameLayout = new ImageViewEmoji(emojiView.getContext());
            } else if (i != 1) {
                FrameLayout frameLayout2 = new FrameLayout(EmojiView.this.getContext()) {
                    {
                        EmojiSearchAdapter.this = this;
                    }

                    @Override
                    protected void onMeasure(int i2, int i3) {
                        int i4;
                        View view = (View) EmojiView.this.getParent();
                        if (view != null) {
                            i4 = (int) (view.getMeasuredHeight() - EmojiView.this.getY());
                        } else {
                            i4 = AndroidUtilities.m34dp(120.0f);
                        }
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(i4 - EmojiView.this.searchFieldHeight, 1073741824));
                    }
                };
                TextView textView = new TextView(EmojiView.this.getContext());
                textView.setText(LocaleController.getString("NoEmojiFound", C0952R.string.NoEmojiFound));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(EmojiView.this.getThemedColor("chat_emojiPanelEmptyText"));
                frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(EmojiView.this.getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(C0952R.C0953drawable.smiles_panel_question);
                imageView.setColorFilter(new PorterDuffColorFilter(EmojiView.this.getThemedColor("chat_emojiPanelEmptyText"), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView, LayoutHelper.createFrame(48, 48, 85));
                imageView.setOnClickListener(new View.OnClickListener() {
                    {
                        EmojiSearchAdapter.this = this;
                    }

                    @Override
                    public void onClick(View view) {
                        Object obj;
                        boolean[] zArr = new boolean[1];
                        BottomSheet.Builder builder = new BottomSheet.Builder(EmojiView.this.getContext());
                        LinearLayout linearLayout = new LinearLayout(EmojiView.this.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setPadding(AndroidUtilities.m34dp(21.0f), 0, AndroidUtilities.m34dp(21.0f), 0);
                        ImageView imageView2 = new ImageView(EmojiView.this.getContext());
                        imageView2.setImageResource(C0952R.C0953drawable.smiles_info);
                        linearLayout.addView(imageView2, LayoutHelper.createLinear(-2, -2, 49, 0, 15, 0, 0));
                        TextView textView2 = new TextView(EmojiView.this.getContext());
                        textView2.setText(LocaleController.getString("EmojiSuggestions", C0952R.string.EmojiSuggestions));
                        textView2.setTextSize(1, 15.0f);
                        textView2.setTextColor(EmojiView.this.getThemedColor("dialogTextBlue2"));
                        int i2 = 5;
                        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 51, 0, 24, 0, 0));
                        TextView textView3 = new TextView(EmojiView.this.getContext());
                        textView3.setText(AndroidUtilities.replaceTags(LocaleController.getString("EmojiSuggestionsInfo", C0952R.string.EmojiSuggestionsInfo)));
                        textView3.setTextSize(1, 15.0f);
                        textView3.setTextColor(EmojiView.this.getThemedColor("dialogTextBlack"));
                        textView3.setGravity(LocaleController.isRTL ? 5 : 3);
                        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 51, 0, 11, 0, 0));
                        TextView textView4 = new TextView(EmojiView.this.getContext());
                        Object[] objArr = new Object[1];
                        if (EmojiSearchAdapter.this.lastSearchAlias != null) {
                            obj = EmojiSearchAdapter.this.lastSearchAlias;
                        } else {
                            obj = EmojiView.this.lastSearchKeyboardLanguage;
                        }
                        objArr[0] = obj;
                        textView4.setText(LocaleController.formatString("EmojiSuggestionsUrl", C0952R.string.EmojiSuggestionsUrl, objArr));
                        textView4.setTextSize(1, 15.0f);
                        textView4.setTextColor(EmojiView.this.getThemedColor("dialogTextLink"));
                        if (!LocaleController.isRTL) {
                            i2 = 3;
                        }
                        textView4.setGravity(i2);
                        linearLayout.addView(textView4, LayoutHelper.createLinear(-2, -2, 51, 0, 18, 0, 16));
                        textView4.setOnClickListener(new View$OnClickListenerC20151(zArr, builder));
                        builder.setCustomView(linearLayout);
                        builder.show();
                    }

                    public class View$OnClickListenerC20151 implements View.OnClickListener {
                        final BottomSheet.Builder val$builder;
                        final boolean[] val$loadingUrl;

                        View$OnClickListenerC20151(boolean[] zArr, BottomSheet.Builder builder) {
                            View$OnClickListenerC20142.this = r1;
                            this.val$loadingUrl = zArr;
                            this.val$builder = builder;
                        }

                        @Override
                        public void onClick(View view) {
                            String str;
                            boolean[] zArr = this.val$loadingUrl;
                            if (!zArr[0]) {
                                zArr[0] = true;
                                final AlertDialog[] alertDialogArr = {new AlertDialog(EmojiView.this.getContext(), 3)};
                                TLRPC$TL_messages_getEmojiURL tLRPC$TL_messages_getEmojiURL = new TLRPC$TL_messages_getEmojiURL();
                                if (EmojiSearchAdapter.this.lastSearchAlias != null) {
                                    str = EmojiSearchAdapter.this.lastSearchAlias;
                                } else {
                                    str = EmojiView.this.lastSearchKeyboardLanguage[0];
                                }
                                tLRPC$TL_messages_getEmojiURL.lang_code = str;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(EmojiView.this.currentAccount);
                                final BottomSheet.Builder builder = this.val$builder;
                                final int sendRequest = connectionsManager.sendRequest(tLRPC$TL_messages_getEmojiURL, new RequestDelegate() {
                                    @Override
                                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                        EmojiView.EmojiSearchAdapter.View$OnClickListenerC20142.View$OnClickListenerC20151.this.lambda$onClick$1(alertDialogArr, builder, tLObject, tLRPC$TL_error);
                                    }
                                });
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        EmojiView.EmojiSearchAdapter.View$OnClickListenerC20142.View$OnClickListenerC20151.this.lambda$onClick$3(alertDialogArr, sendRequest);
                                    }
                                }, 1000L);
                            }
                        }

                        public void lambda$onClick$1(final AlertDialog[] alertDialogArr, final BottomSheet.Builder builder, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    EmojiView.EmojiSearchAdapter.View$OnClickListenerC20142.View$OnClickListenerC20151.this.lambda$onClick$0(alertDialogArr, tLObject, builder);
                                }
                            });
                        }

                        public void lambda$onClick$0(AlertDialog[] alertDialogArr, TLObject tLObject, BottomSheet.Builder builder) {
                            try {
                                alertDialogArr[0].dismiss();
                            } catch (Throwable unused) {
                            }
                            alertDialogArr[0] = null;
                            if (tLObject instanceof TLRPC$TL_emojiURL) {
                                Browser.openUrl(EmojiView.this.getContext(), ((TLRPC$TL_emojiURL) tLObject).url);
                                builder.getDismissRunnable().run();
                            }
                        }

                        public void lambda$onClick$3(AlertDialog[] alertDialogArr, final int i) {
                            if (alertDialogArr[0] != null) {
                                alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
                                    @Override
                                    public final void onCancel(DialogInterface dialogInterface) {
                                        EmojiView.EmojiSearchAdapter.View$OnClickListenerC20142.View$OnClickListenerC20151.this.lambda$onClick$2(i, dialogInterface);
                                    }
                                });
                                alertDialogArr[0].show();
                            }
                        }

                        public void lambda$onClick$2(int i, DialogInterface dialogInterface) {
                            ConnectionsManager.getInstance(EmojiView.this.currentAccount).cancelRequest(i, true);
                        }
                    }
                });
                frameLayout2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                frameLayout = frameLayout2;
            } else {
                View view = new View(EmojiView.this.getContext());
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, EmojiView.this.searchFieldHeight));
                frameLayout = view;
            }
            return new RecyclerListView.Holder(frameLayout);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            boolean z;
            if (viewHolder.getItemViewType() == 0) {
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) viewHolder.itemView;
                int i2 = i - 1;
                if (!this.result.isEmpty() || this.searchWas) {
                    str = this.result.get(i2).emoji;
                    z = false;
                } else {
                    str = Emoji.recentEmoji.get(i2);
                    z = true;
                }
                imageViewEmoji.setImageDrawable(Emoji.getEmojiBigDrawable(str), z);
                imageViewEmoji.setTag(str);
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 1;
            }
            return (i != 1 || !this.searchWas || !this.result.isEmpty()) ? 0 : 2;
        }

        public void search(String str) {
            if (TextUtils.isEmpty(str)) {
                this.lastSearchEmojiString = null;
                if (EmojiView.this.emojiGridView.getAdapter() != EmojiView.this.emojiAdapter) {
                    EmojiView.this.emojiGridView.setAdapter(EmojiView.this.emojiAdapter);
                    this.searchWas = false;
                }
                notifyDataSetChanged();
            } else {
                this.lastSearchEmojiString = str.toLowerCase();
            }
            Runnable runnable = this.searchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            if (!TextUtils.isEmpty(this.lastSearchEmojiString)) {
                Runnable runnable2 = new Runnable() {
                    {
                        EmojiSearchAdapter.this = this;
                    }

                    @Override
                    public void run() {
                        EmojiView.this.emojiSearchField.progressDrawable.startAnimation();
                        final String str2 = EmojiSearchAdapter.this.lastSearchEmojiString;
                        String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                        if (!Arrays.equals(EmojiView.this.lastSearchKeyboardLanguage, currentKeyboardLanguage)) {
                            MediaDataController.getInstance(EmojiView.this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                        }
                        EmojiView.this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                        MediaDataController.getInstance(EmojiView.this.currentAccount).getEmojiSuggestions(EmojiView.this.lastSearchKeyboardLanguage, EmojiSearchAdapter.this.lastSearchEmojiString, false, new MediaDataController.KeywordResultCallback() {
                            {
                                RunnableC20163.this = this;
                            }

                            @Override
                            public void run(ArrayList<MediaDataController.KeywordResult> arrayList, String str3) {
                                if (str2.equals(EmojiSearchAdapter.this.lastSearchEmojiString)) {
                                    EmojiSearchAdapter.this.lastSearchAlias = str3;
                                    EmojiView.this.emojiSearchField.progressDrawable.stopAnimation();
                                    EmojiSearchAdapter.this.searchWas = true;
                                    if (EmojiView.this.emojiGridView.getAdapter() != EmojiView.this.emojiSearchAdapter) {
                                        EmojiView.this.emojiGridView.setAdapter(EmojiView.this.emojiSearchAdapter);
                                    }
                                    EmojiSearchAdapter.this.result = arrayList;
                                    EmojiSearchAdapter.this.notifyDataSetChanged();
                                }
                            }
                        });
                    }
                };
                this.searchRunnable = runnable2;
                AndroidUtilities.runOnUIThread(runnable2, 300L);
            }
        }
    }

    public class EmojiPagesAdapter extends PagerAdapter implements PagerSlidingTabStrip.IconTabProvider {
        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        private EmojiPagesAdapter() {
            EmojiView.this = r1;
        }

        @Override
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) EmojiView.this.views.get(i));
        }

        @Override
        public boolean canScrollToTab(int i) {
            boolean z = true;
            if ((i != 1 && i != 2) || EmojiView.this.currentChatId == 0) {
                return true;
            }
            EmojiView emojiView = EmojiView.this;
            if (i != 1) {
                z = false;
            }
            emojiView.showStickerBanHint(z);
            return false;
        }

        @Override
        public int getCount() {
            return EmojiView.this.views.size();
        }

        @Override
        public Drawable getPageIconDrawable(int i) {
            return EmojiView.this.tabIcons[i];
        }

        @Override
        public CharSequence getPageTitle(int i) {
            if (i == 0) {
                return LocaleController.getString("Emoji", C0952R.string.Emoji);
            }
            if (i == 1) {
                return LocaleController.getString("AccDescrGIFs", C0952R.string.AccDescrGIFs);
            }
            if (i != 2) {
                return null;
            }
            return LocaleController.getString("AccDescrStickers", C0952R.string.AccDescrStickers);
        }

        @Override
        public void customOnDraw(Canvas canvas, int i) {
            if (i == 2 && !MediaDataController.getInstance(EmojiView.this.currentAccount).getUnreadStickerSets().isEmpty() && EmojiView.this.dotPaint != null) {
                canvas.drawCircle((canvas.getWidth() / 2) + AndroidUtilities.m34dp(9.0f), (canvas.getHeight() / 2) - AndroidUtilities.m34dp(8.0f), AndroidUtilities.m34dp(5.0f), EmojiView.this.dotPaint);
            }
        }

        @Override
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View view = (View) EmojiView.this.views.get(i);
            viewGroup.addView(view);
            return view;
        }
    }

    public class GifAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC$User bot;
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
        private ArrayList<TLRPC$BotInlineResult> results;
        private HashMap<String, TLRPC$BotInlineResult> resultsMap;
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
            this(context, z, z ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0);
        }

        public GifAdapter(Context context, boolean z, int i) {
            EmojiView.this = r2;
            this.results = new ArrayList<>();
            this.resultsMap = new HashMap<>();
            this.trendingSectionItem = -1;
            this.firstResultItem = -1;
            this.context = context;
            this.withRecent = z;
            this.maxRecentRowsCount = i;
            this.progressEmptyView = z ? null : new GifProgressEmptyView(context);
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
            if (i == 0) {
                return 1;
            }
            boolean z = this.withRecent;
            if (!z || i != this.trendingSectionItem) {
                return (z || !this.results.isEmpty()) ? 0 : 3;
            }
            return 2;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            StickerSetNameCell stickerSetNameCell;
            if (i == 0) {
                ContextLinkCell contextLinkCell = new ContextLinkCell(this.context);
                contextLinkCell.setCanPreviewGif(true);
                stickerSetNameCell = contextLinkCell;
            } else if (i == 1) {
                View view = new View(EmojiView.this.getContext());
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, EmojiView.this.searchFieldHeight));
                stickerSetNameCell = view;
            } else if (i != 2) {
                GifProgressEmptyView gifProgressEmptyView = this.progressEmptyView;
                gifProgressEmptyView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                stickerSetNameCell = gifProgressEmptyView;
            } else {
                StickerSetNameCell stickerSetNameCell2 = new StickerSetNameCell(this.context, false, EmojiView.this.resourcesProvider);
                stickerSetNameCell2.setText(LocaleController.getString("FeaturedGifs", C0952R.string.FeaturedGifs), 0);
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AndroidUtilities.m34dp(2.5f);
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AndroidUtilities.m34dp(5.5f);
                stickerSetNameCell2.setLayoutParams(layoutParams);
                stickerSetNameCell = stickerSetNameCell2;
            }
            return new RecyclerListView.Holder(stickerSetNameCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ContextLinkCell contextLinkCell = (ContextLinkCell) viewHolder.itemView;
                int i2 = this.firstResultItem;
                if (i2 < 0 || i < i2) {
                    contextLinkCell.setGif((TLRPC$Document) EmojiView.this.recentGifs.get(i - 1), false);
                } else {
                    contextLinkCell.setLink(this.results.get(i - i2), this.bot, true, false, false, true);
                }
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
            this.itemsCount = 1;
            if (this.withRecent) {
                this.itemsCount = this.recentItemsCount + 1;
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
            } else if (!this.withRecent) {
                this.itemsCount++;
            }
        }

        private void updateRecentItemsCount() {
            int i;
            if (this.withRecent && (i = this.maxRecentRowsCount) != 0) {
                if (i == Integer.MAX_VALUE) {
                    this.recentItemsCount = EmojiView.this.recentGifs.size();
                } else if (EmojiView.this.gifGridView.getMeasuredWidth() != 0) {
                    int measuredWidth = EmojiView.this.gifGridView.getMeasuredWidth();
                    int spanCount = EmojiView.this.gifLayoutManager.getSpanCount();
                    int dp = AndroidUtilities.m34dp(100.0f);
                    this.recentItemsCount = 0;
                    int size = EmojiView.this.recentGifs.size();
                    int i2 = spanCount;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        Size fixSize = EmojiView.this.gifLayoutManager.fixSize(EmojiView.this.gifLayoutManager.getSizeForItem((TLRPC$Document) EmojiView.this.recentGifs.get(i5)));
                        int min = Math.min(spanCount, (int) Math.floor(spanCount * (((fixSize.width / fixSize.height) * dp) / measuredWidth)));
                        if (i2 < min) {
                            this.recentItemsCount += i3;
                            i4++;
                            if (i4 == this.maxRecentRowsCount) {
                                break;
                            }
                            i2 = spanCount;
                            i3 = 0;
                        }
                        i3++;
                        i2 -= min;
                    }
                    if (i4 < this.maxRecentRowsCount) {
                        this.recentItemsCount += i3;
                    }
                }
            }
        }

        public void loadTrendingGifs() {
            search("", "", true, true, true);
        }

        private void searchBotUser() {
            if (!this.searchingUser) {
                this.searchingUser = true;
                TLRPC$TL_contacts_resolveUsername tLRPC$TL_contacts_resolveUsername = new TLRPC$TL_contacts_resolveUsername();
                tLRPC$TL_contacts_resolveUsername.username = MessagesController.getInstance(EmojiView.this.currentAccount).gifSearchBot;
                ConnectionsManager.getInstance(EmojiView.this.currentAccount).sendRequest(tLRPC$TL_contacts_resolveUsername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        EmojiView.GifAdapter.this.lambda$searchBotUser$1(tLObject, tLRPC$TL_error);
                    }
                });
            }
        }

        public void lambda$searchBotUser$1(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        EmojiView.GifAdapter.this.lambda$searchBotUser$0(tLObject);
                    }
                });
            }
        }

        public void lambda$searchBotUser$0(TLObject tLObject) {
            TLRPC$TL_contacts_resolvedPeer tLRPC$TL_contacts_resolvedPeer = (TLRPC$TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(EmojiView.this.currentAccount).putUsers(tLRPC$TL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(EmojiView.this.currentAccount).putChats(tLRPC$TL_contacts_resolvedPeer.chats, false);
            MessagesStorage.getInstance(EmojiView.this.currentAccount).putUsersAndChats(tLRPC$TL_contacts_resolvedPeer.users, tLRPC$TL_contacts_resolvedPeer.chats, true, true);
            String str = this.lastSearchImageString;
            this.lastSearchImageString = null;
            search(str, "", false);
        }

        public void search(final String str) {
            if (!this.withRecent) {
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
                    if (this.showTrendingWhenSearchEmpty) {
                        loadTrendingGifs();
                        return;
                    }
                    int currentPosition = EmojiView.this.gifTabs.getCurrentPosition();
                    if (currentPosition != EmojiView.this.gifRecentTabNum && currentPosition != EmojiView.this.gifTrendingTabNum) {
                        searchEmoji(MessagesController.getInstance(EmojiView.this.currentAccount).gifSearchEmojies.get(currentPosition - EmojiView.this.gifFirstEmojiTabNum));
                    } else if (EmojiView.this.gifGridView.getAdapter() != EmojiView.this.gifAdapter) {
                        EmojiView.this.gifGridView.setAdapter(EmojiView.this.gifAdapter);
                    }
                } else {
                    String lowerCase = str.toLowerCase();
                    this.lastSearchImageString = lowerCase;
                    if (!TextUtils.isEmpty(lowerCase)) {
                        Runnable runnable2 = new Runnable() {
                            {
                                GifAdapter.this = this;
                            }

                            @Override
                            public void run() {
                                GifAdapter.this.search(str, "", true);
                            }
                        };
                        this.searchRunnable = runnable2;
                        AndroidUtilities.runOnUIThread(runnable2, 300L);
                    }
                }
            }
        }

        public void searchEmoji(String str) {
            if (!this.lastSearchIsEmoji || !TextUtils.equals(this.lastSearchImageString, str)) {
                search(str, "", true, true, true);
            } else {
                EmojiView.this.gifLayoutManager.scrollToPositionWithOffset(1, 0);
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
            if (userOrChat instanceof TLRPC$User) {
                if (!this.withRecent && TextUtils.isEmpty(str2)) {
                    EmojiView.this.gifSearchField.progressDrawable.startAnimation();
                }
                this.bot = (TLRPC$User) userOrChat;
                final String str3 = "gif_search_" + str + "_" + str2;
                RequestDelegate emojiView$GifAdapter$$ExternalSyntheticLambda3 = new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        EmojiView.GifAdapter.this.lambda$search$3(str, str2, z, z2, z3, str3, tLObject, tLRPC$TL_error);
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
                if (z3 && EmojiView.this.gifCache.containsKey(str3)) {
                    lambda$search$2(str, str2, z, z2, true, str3, (TLObject) EmojiView.this.gifCache.get(str3));
                } else if (!EmojiView.this.gifSearchPreloader.isLoading(str3)) {
                    if (z3) {
                        this.reqId = -1;
                        MessagesStorage.getInstance(EmojiView.this.currentAccount).getBotCache(str3, emojiView$GifAdapter$$ExternalSyntheticLambda3);
                        return;
                    }
                    TLRPC$TL_messages_getInlineBotResults tLRPC$TL_messages_getInlineBotResults = new TLRPC$TL_messages_getInlineBotResults();
                    if (str == null) {
                        str = "";
                    }
                    tLRPC$TL_messages_getInlineBotResults.query = str;
                    tLRPC$TL_messages_getInlineBotResults.bot = MessagesController.getInstance(EmojiView.this.currentAccount).getInputUser(this.bot);
                    tLRPC$TL_messages_getInlineBotResults.offset = str2;
                    tLRPC$TL_messages_getInlineBotResults.peer = new TLRPC$TL_inputPeerEmpty();
                    this.reqId = ConnectionsManager.getInstance(EmojiView.this.currentAccount).sendRequest(tLRPC$TL_messages_getInlineBotResults, emojiView$GifAdapter$$ExternalSyntheticLambda3, 2);
                }
            } else if (z) {
                searchBotUser();
                if (!this.withRecent) {
                    EmojiView.this.gifSearchField.progressDrawable.startAnimation();
                }
            }
        }

        public void lambda$search$3(final String str, final String str2, final boolean z, final boolean z2, final boolean z3, final String str3, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    EmojiView.GifAdapter.this.lambda$search$2(str, str2, z, z2, z3, str3, tLObject);
                }
            });
        }

        public void lambda$search$2(String str, String str2, boolean z, boolean z2, boolean z3, String str3, TLObject tLObject) {
            if (str != null && str.equals(this.lastSearchImageString)) {
                boolean z4 = false;
                this.reqId = 0;
                if (!z3 || ((tLObject instanceof TLRPC$messages_BotResults) && !((TLRPC$messages_BotResults) tLObject).results.isEmpty())) {
                    if (!this.withRecent && TextUtils.isEmpty(str2)) {
                        this.results.clear();
                        this.resultsMap.clear();
                        EmojiView.this.gifSearchField.progressDrawable.stopAnimation();
                    }
                    if (tLObject instanceof TLRPC$messages_BotResults) {
                        int size = this.results.size();
                        TLRPC$messages_BotResults tLRPC$messages_BotResults = (TLRPC$messages_BotResults) tLObject;
                        if (!EmojiView.this.gifCache.containsKey(str3)) {
                            EmojiView.this.gifCache.put(str3, tLRPC$messages_BotResults);
                        }
                        if (!z3 && tLRPC$messages_BotResults.cache_time != 0) {
                            MessagesStorage.getInstance(EmojiView.this.currentAccount).saveBotCache(str3, tLRPC$messages_BotResults);
                        }
                        this.nextSearchOffset = tLRPC$messages_BotResults.next_offset;
                        int i = 0;
                        for (int i2 = 0; i2 < tLRPC$messages_BotResults.results.size(); i2++) {
                            TLRPC$BotInlineResult tLRPC$BotInlineResult = tLRPC$messages_BotResults.results.get(i2);
                            if (!this.resultsMap.containsKey(tLRPC$BotInlineResult.f852id)) {
                                tLRPC$BotInlineResult.query_id = tLRPC$messages_BotResults.query_id;
                                this.results.add(tLRPC$BotInlineResult);
                                this.resultsMap.put(tLRPC$BotInlineResult.f852id, tLRPC$BotInlineResult);
                                i++;
                            }
                        }
                        if (size == this.results.size() || TextUtils.isEmpty(this.nextSearchOffset)) {
                            z4 = true;
                        }
                        this.searchEndReached = z4;
                        if (i != 0) {
                            if (!z2 || size != 0) {
                                updateItems();
                                if (!this.withRecent) {
                                    if (size != 0) {
                                        notifyItemChanged(size);
                                    }
                                    notifyItemRangeInserted(size + 1, i);
                                } else if (size != 0) {
                                    notifyItemChanged(this.recentItemsCount + 1 + size);
                                    notifyItemRangeInserted(this.recentItemsCount + 1 + size + 1, i);
                                } else {
                                    notifyItemRangeInserted(this.recentItemsCount + 1, i + 1);
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
                    if (!this.withRecent) {
                        if (EmojiView.this.gifGridView.getAdapter() != this) {
                            EmojiView.this.gifGridView.setAdapter(this);
                        }
                        if (z2 && !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                            EmojiView.this.scrollGifsToTop();
                            return;
                        }
                        return;
                    }
                    return;
                }
                search(str, str2, z, z2, false);
            }
        }
    }

    public class GifSearchPreloader {
        private final List<String> loadingKeys;

        private GifSearchPreloader() {
            EmojiView.this = r1;
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
            if (!z || !EmojiView.this.gifCache.containsKey(str3)) {
                RequestDelegate emojiView$GifSearchPreloader$$ExternalSyntheticLambda1 = new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        EmojiView.GifSearchPreloader.this.lambda$preload$1(str, str2, z, str3, tLObject, tLRPC$TL_error);
                    }
                };
                if (z) {
                    this.loadingKeys.add(str3);
                    MessagesStorage.getInstance(EmojiView.this.currentAccount).getBotCache(str3, emojiView$GifSearchPreloader$$ExternalSyntheticLambda1);
                    return;
                }
                MessagesController messagesController = MessagesController.getInstance(EmojiView.this.currentAccount);
                TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
                if (userOrChat instanceof TLRPC$User) {
                    this.loadingKeys.add(str3);
                    TLRPC$TL_messages_getInlineBotResults tLRPC$TL_messages_getInlineBotResults = new TLRPC$TL_messages_getInlineBotResults();
                    if (str == null) {
                        str = "";
                    }
                    tLRPC$TL_messages_getInlineBotResults.query = str;
                    tLRPC$TL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC$User) userOrChat);
                    tLRPC$TL_messages_getInlineBotResults.offset = str2;
                    tLRPC$TL_messages_getInlineBotResults.peer = new TLRPC$TL_inputPeerEmpty();
                    ConnectionsManager.getInstance(EmojiView.this.currentAccount).sendRequest(tLRPC$TL_messages_getInlineBotResults, emojiView$GifSearchPreloader$$ExternalSyntheticLambda1, 2);
                }
            }
        }

        public void lambda$preload$1(final String str, final String str2, final boolean z, final String str3, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    EmojiView.GifSearchPreloader.this.lambda$preload$0(str, str2, z, str3, tLObject);
                }
            });
        }

        public void lambda$preload$0(String str, String str2, boolean z, String str3, TLObject tLObject) {
            this.loadingKeys.remove(str3);
            if (EmojiView.this.gifSearchAdapter.lastSearchIsEmoji && EmojiView.this.gifSearchAdapter.lastSearchImageString.equals(str)) {
                EmojiView.this.gifSearchAdapter.lambda$search$2(str, str2, false, true, z, str3, tLObject);
            } else if (z && (!(tLObject instanceof TLRPC$messages_BotResults) || ((TLRPC$messages_BotResults) tLObject).results.isEmpty())) {
                preload(str, str2, false);
            } else if ((tLObject instanceof TLRPC$messages_BotResults) && !EmojiView.this.gifCache.containsKey(str3)) {
                EmojiView.this.gifCache.put(str3, (TLRPC$messages_BotResults) tLObject);
            }
        }
    }

    public class GifLayoutManager extends ExtendedGridLayoutManager {
        private Size size = new Size();

        public GifLayoutManager(Context context) {
            super(context, 100, true);
            EmojiView.this = r3;
            setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(r3) {
                {
                    GifLayoutManager.this = this;
                }

                @Override
                public int getSpanSize(int i) {
                    if (i == 0 || (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifSearchAdapter && EmojiView.this.gifSearchAdapter.results.isEmpty())) {
                        return GifLayoutManager.this.getSpanCount();
                    }
                    return GifLayoutManager.this.getSpanSizeForItem(i - 1);
                }
            });
        }

        @Override
        protected Size getSizeForItem(int i) {
            List<TLRPC$DocumentAttribute> list;
            TLRPC$Document tLRPC$Document;
            TLRPC$Document tLRPC$Document2;
            TLRPC$Document tLRPC$Document3 = null;
            if (EmojiView.this.gifGridView.getAdapter() == EmojiView.this.gifAdapter) {
                if (i > EmojiView.this.gifAdapter.recentItemsCount) {
                    TLRPC$BotInlineResult tLRPC$BotInlineResult = (TLRPC$BotInlineResult) EmojiView.this.gifAdapter.results.get((i - EmojiView.this.gifAdapter.recentItemsCount) - 1);
                    tLRPC$Document = tLRPC$BotInlineResult.document;
                    if (tLRPC$Document != null) {
                        tLRPC$Document2 = tLRPC$Document.attributes;
                    } else {
                        TLRPC$WebDocument tLRPC$WebDocument = tLRPC$BotInlineResult.content;
                        if (tLRPC$WebDocument != null) {
                            tLRPC$Document2 = tLRPC$WebDocument.attributes;
                        } else {
                            TLRPC$WebDocument tLRPC$WebDocument2 = tLRPC$BotInlineResult.thumb;
                            if (tLRPC$WebDocument2 != null) {
                                tLRPC$Document2 = tLRPC$WebDocument2.attributes;
                            }
                            list = tLRPC$Document3;
                            tLRPC$Document3 = tLRPC$Document;
                            return getSizeForItem(tLRPC$Document3, list);
                        }
                    }
                    tLRPC$Document3 = tLRPC$Document2;
                    list = tLRPC$Document3;
                    tLRPC$Document3 = tLRPC$Document;
                    return getSizeForItem(tLRPC$Document3, list);
                } else if (i == EmojiView.this.gifAdapter.recentItemsCount) {
                    return null;
                } else {
                    tLRPC$Document3 = (TLRPC$Document) EmojiView.this.recentGifs.get(i);
                    list = tLRPC$Document3.attributes;
                    return getSizeForItem(tLRPC$Document3, list);
                }
            } else if (!EmojiView.this.gifSearchAdapter.results.isEmpty()) {
                TLRPC$BotInlineResult tLRPC$BotInlineResult2 = (TLRPC$BotInlineResult) EmojiView.this.gifSearchAdapter.results.get(i);
                tLRPC$Document = tLRPC$BotInlineResult2.document;
                if (tLRPC$Document != null) {
                    tLRPC$Document2 = tLRPC$Document.attributes;
                } else {
                    TLRPC$WebDocument tLRPC$WebDocument3 = tLRPC$BotInlineResult2.content;
                    if (tLRPC$WebDocument3 != null) {
                        tLRPC$Document2 = tLRPC$WebDocument3.attributes;
                    } else {
                        TLRPC$WebDocument tLRPC$WebDocument4 = tLRPC$BotInlineResult2.thumb;
                        if (tLRPC$WebDocument4 != null) {
                            tLRPC$Document2 = tLRPC$WebDocument4.attributes;
                        }
                        list = tLRPC$Document3;
                        tLRPC$Document3 = tLRPC$Document;
                        return getSizeForItem(tLRPC$Document3, list);
                    }
                }
                tLRPC$Document3 = tLRPC$Document2;
                list = tLRPC$Document3;
                tLRPC$Document3 = tLRPC$Document;
                return getSizeForItem(tLRPC$Document3, list);
            } else {
                list = null;
                return getSizeForItem(tLRPC$Document3, list);
            }
        }

        @Override
        public int getFlowItemCount() {
            if (EmojiView.this.gifGridView.getAdapter() != EmojiView.this.gifSearchAdapter || !EmojiView.this.gifSearchAdapter.results.isEmpty()) {
                return getItemCount() - 1;
            }
            return 0;
        }

        public Size getSizeForItem(TLRPC$Document tLRPC$Document) {
            return getSizeForItem(tLRPC$Document, tLRPC$Document.attributes);
        }

        public Size getSizeForItem(TLRPC$Document tLRPC$Document, List<TLRPC$DocumentAttribute> list) {
            TLRPC$PhotoSize closestPhotoSizeWithSize;
            int i;
            int i2;
            Size size = this.size;
            size.height = 100.0f;
            size.width = 100.0f;
            if (!(tLRPC$Document == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90)) == null || (i = closestPhotoSizeWithSize.f884w) == 0 || (i2 = closestPhotoSizeWithSize.f883h) == 0)) {
                Size size2 = this.size;
                size2.width = i;
                size2.height = i2;
            }
            if (list != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    TLRPC$DocumentAttribute tLRPC$DocumentAttribute = list.get(i3);
                    if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo)) {
                        Size size3 = this.size;
                        size3.width = tLRPC$DocumentAttribute.f864w;
                        size3.height = tLRPC$DocumentAttribute.f863h;
                        break;
                    }
                }
            }
            return this.size;
        }
    }

    public class GifProgressEmptyView extends FrameLayout {
        private final ImageView imageView;
        private boolean loadingState;
        private final RadialProgressView progressView;
        private final TextView textView;

        public GifProgressEmptyView(Context context) {
            super(context);
            EmojiView.this = r13;
            ImageView imageView = new ImageView(getContext());
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(C0952R.C0953drawable.gif_empty);
            imageView.setColorFilter(new PorterDuffColorFilter(r13.getThemedColor("chat_emojiPanelEmptyText"), PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 59.0f));
            TextView textView = new TextView(getContext());
            this.textView = textView;
            textView.setText(LocaleController.getString("NoGIFsFound", C0952R.string.NoGIFsFound));
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(r13.getThemedColor("chat_emojiPanelEmptyText"));
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 9.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, r13.resourcesProvider);
            this.progressView = radialProgressView;
            radialProgressView.setVisibility(8);
            radialProgressView.setProgressColor(r13.getThemedColor("progressCircle"));
            addView(radialProgressView, LayoutHelper.createFrame(-2, -2, 17));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            int measuredHeight = EmojiView.this.gifGridView.getMeasuredHeight();
            if (!this.loadingState) {
                i3 = (int) ((((measuredHeight - EmojiView.this.searchFieldHeight) - AndroidUtilities.m34dp(8.0f)) / 3) * 1.7f);
            } else {
                i3 = measuredHeight - AndroidUtilities.m34dp(92.0f);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }

        public void setLoadingState(boolean z) {
            if (this.loadingState != z) {
                this.loadingState = z;
                int i = 8;
                this.imageView.setVisibility(z ? 8 : 0);
                this.textView.setVisibility(z ? 8 : 0);
                RadialProgressView radialProgressView = this.progressView;
                if (z) {
                    i = 0;
                }
                radialProgressView.setVisibility(i);
            }
        }
    }

    public class StickersSearchGridAdapter extends RecyclerListView.SelectionAdapter {
        boolean cleared;
        private Context context;
        private int emojiSearchId;
        private int reqId;
        private int reqId2;
        private String searchQuery;
        private int totalItems;
        private SparseArray<Object> rowStartPack = new SparseArray<>();
        private SparseArray<Object> cache = new SparseArray<>();
        private SparseArray<Object> cacheParent = new SparseArray<>();
        private SparseIntArray positionToRow = new SparseIntArray();
        private SparseArray<String> positionToEmoji = new SparseArray<>();
        private ArrayList<TLRPC$StickerSetCovered> serverPacks = new ArrayList<>();
        private ArrayList<TLRPC$TL_messages_stickerSet> localPacks = new ArrayList<>();
        private HashMap<TLRPC$TL_messages_stickerSet, Boolean> localPacksByShortName = new HashMap<>();
        private HashMap<TLRPC$TL_messages_stickerSet, Integer> localPacksByName = new HashMap<>();
        private HashMap<ArrayList<TLRPC$Document>, String> emojiStickers = new HashMap<>();
        private ArrayList<ArrayList<TLRPC$Document>> emojiArrays = new ArrayList<>();
        private SparseArray<TLRPC$StickerSetCovered> positionsToSets = new SparseArray<>();
        private Runnable searchRunnable = new RunnableC20271();

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        static int access$16204(StickersSearchGridAdapter stickersSearchGridAdapter) {
            int i = stickersSearchGridAdapter.emojiSearchId + 1;
            stickersSearchGridAdapter.emojiSearchId = i;
            return i;
        }

        public class RunnableC20271 implements Runnable {
            RunnableC20271() {
                StickersSearchGridAdapter.this = r1;
            }

            public void clear() {
                StickersSearchGridAdapter stickersSearchGridAdapter = StickersSearchGridAdapter.this;
                if (!stickersSearchGridAdapter.cleared) {
                    stickersSearchGridAdapter.cleared = true;
                    stickersSearchGridAdapter.emojiStickers.clear();
                    StickersSearchGridAdapter.this.emojiArrays.clear();
                    StickersSearchGridAdapter.this.localPacks.clear();
                    StickersSearchGridAdapter.this.serverPacks.clear();
                    StickersSearchGridAdapter.this.localPacksByShortName.clear();
                    StickersSearchGridAdapter.this.localPacksByName.clear();
                }
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.EmojiView.StickersSearchGridAdapter.RunnableC20271.run():void");
            }

            public void lambda$run$1(final TLRPC$TL_messages_searchStickerSets tLRPC$TL_messages_searchStickerSets, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                if (tLObject instanceof TLRPC$TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            EmojiView.StickersSearchGridAdapter.RunnableC20271.this.lambda$run$0(tLRPC$TL_messages_searchStickerSets, tLObject);
                        }
                    });
                }
            }

            public void lambda$run$0(TLRPC$TL_messages_searchStickerSets tLRPC$TL_messages_searchStickerSets, TLObject tLObject) {
                if (tLRPC$TL_messages_searchStickerSets.f953q.equals(StickersSearchGridAdapter.this.searchQuery)) {
                    clear();
                    EmojiView.this.stickersSearchField.progressDrawable.stopAnimation();
                    StickersSearchGridAdapter.this.reqId = 0;
                    if (EmojiView.this.stickersGridView.getAdapter() != EmojiView.this.stickersSearchGridAdapter) {
                        EmojiView.this.stickersGridView.setAdapter(EmojiView.this.stickersSearchGridAdapter);
                    }
                    StickersSearchGridAdapter.this.serverPacks.addAll(((TLRPC$TL_messages_foundStickerSets) tLObject).sets);
                    StickersSearchGridAdapter.this.notifyDataSetChanged();
                }
            }

            public void lambda$run$3(final TLRPC$TL_messages_getStickers tLRPC$TL_messages_getStickers, final ArrayList arrayList, final LongSparseArray longSparseArray, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        EmojiView.StickersSearchGridAdapter.RunnableC20271.this.lambda$run$2(tLRPC$TL_messages_getStickers, tLObject, arrayList, longSparseArray);
                    }
                });
            }

            public void lambda$run$2(TLRPC$TL_messages_getStickers tLRPC$TL_messages_getStickers, TLObject tLObject, ArrayList arrayList, LongSparseArray longSparseArray) {
                if (tLRPC$TL_messages_getStickers.emoticon.equals(StickersSearchGridAdapter.this.searchQuery)) {
                    StickersSearchGridAdapter.this.reqId2 = 0;
                    if (tLObject instanceof TLRPC$TL_messages_stickers) {
                        TLRPC$TL_messages_stickers tLRPC$TL_messages_stickers = (TLRPC$TL_messages_stickers) tLObject;
                        int size = arrayList.size();
                        int size2 = tLRPC$TL_messages_stickers.stickers.size();
                        for (int i = 0; i < size2; i++) {
                            TLRPC$Document tLRPC$Document = tLRPC$TL_messages_stickers.stickers.get(i);
                            if (longSparseArray.indexOfKey(tLRPC$Document.f861id) < 0) {
                                arrayList.add(tLRPC$Document);
                            }
                        }
                        if (size != arrayList.size()) {
                            StickersSearchGridAdapter.this.emojiStickers.put(arrayList, StickersSearchGridAdapter.this.searchQuery);
                            if (size == 0) {
                                StickersSearchGridAdapter.this.emojiArrays.add(arrayList);
                            }
                            StickersSearchGridAdapter.this.notifyDataSetChanged();
                        }
                    }
                }
            }
        }

        public StickersSearchGridAdapter(Context context) {
            EmojiView.this = r1;
            this.context = context;
        }

        @Override
        public int getItemCount() {
            int i = this.totalItems;
            if (i != 1) {
                return i + 1;
            }
            return 2;
        }

        public void search(String str) {
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
                this.serverPacks.clear();
                if (EmojiView.this.stickersGridView.getAdapter() != EmojiView.this.stickersGridAdapter) {
                    EmojiView.this.stickersGridView.setAdapter(EmojiView.this.stickersGridAdapter);
                }
                notifyDataSetChanged();
            } else {
                this.searchQuery = str.toLowerCase();
            }
            AndroidUtilities.cancelRunOnUIThread(this.searchRunnable);
            AndroidUtilities.runOnUIThread(this.searchRunnable, 300L);
        }

        @Override
        public int getItemViewType(int i) {
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
            if (obj instanceof TLRPC$Document) {
                return 0;
            }
            return obj instanceof TLRPC$StickerSetCovered ? 3 : 2;
        }

        public void lambda$onCreateViewHolder$0(View view) {
            FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) view.getParent();
            TLRPC$StickerSetCovered stickerSet = featuredStickerSetInfoCell.getStickerSet();
            if (EmojiView.this.installingStickerSets.indexOfKey(stickerSet.set.f886id) < 0 && EmojiView.this.removingStickerSets.indexOfKey(stickerSet.set.f886id) < 0) {
                if (featuredStickerSetInfoCell.isInstalled()) {
                    EmojiView.this.removingStickerSets.put(stickerSet.set.f886id, stickerSet);
                    EmojiView.this.delegate.onStickerSetRemove(featuredStickerSetInfoCell.getStickerSet());
                    return;
                }
                featuredStickerSetInfoCell.setAddDrawProgress(true, true);
                EmojiView.this.installingStickerSets.put(stickerSet.set.f886id, stickerSet);
                EmojiView.this.delegate.onStickerSetAdd(featuredStickerSetInfoCell.getStickerSet());
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FeaturedStickerSetInfoCell featuredStickerSetInfoCell;
            ?? r15;
            if (i != 0) {
                if (i == 1) {
                    featuredStickerSetInfoCell = new EmptyCell(this.context);
                } else if (i == 2) {
                    featuredStickerSetInfoCell = new StickerSetNameCell(this.context, false, EmojiView.this.resourcesProvider);
                } else if (i == 3) {
                    FeaturedStickerSetInfoCell featuredStickerSetInfoCell2 = new FeaturedStickerSetInfoCell(this.context, 17, false, true, EmojiView.this.resourcesProvider);
                    featuredStickerSetInfoCell2.setAddOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            EmojiView.StickersSearchGridAdapter.this.lambda$onCreateViewHolder$0(view);
                        }
                    });
                    featuredStickerSetInfoCell = featuredStickerSetInfoCell2;
                } else if (i == 4) {
                    View view = new View(this.context);
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, EmojiView.this.searchFieldHeight));
                    featuredStickerSetInfoCell = view;
                } else if (i != 5) {
                    featuredStickerSetInfoCell = null;
                } else {
                    r15 = new FrameLayout(this.context) {
                        {
                            StickersSearchGridAdapter.this = this;
                        }

                        @Override
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec((int) ((((EmojiView.this.stickersGridView.getMeasuredHeight() - EmojiView.this.searchFieldHeight) - AndroidUtilities.m34dp(8.0f)) / 3) * 1.7f), 1073741824));
                        }
                    };
                    ImageView imageView = new ImageView(this.context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(C0952R.C0953drawable.stickers_empty);
                    imageView.setColorFilter(new PorterDuffColorFilter(EmojiView.this.getThemedColor("chat_emojiPanelEmptyText"), PorterDuff.Mode.MULTIPLY));
                    r15.addView(imageView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 59.0f));
                    TextView textView = new TextView(this.context);
                    textView.setText(LocaleController.getString("NoStickersFound", C0952R.string.NoStickersFound));
                    textView.setTextSize(1, 16.0f);
                    textView.setTextColor(EmojiView.this.getThemedColor("chat_emojiPanelEmptyText"));
                    r15.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 9.0f));
                    r15.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                }
                return new RecyclerListView.Holder(featuredStickerSetInfoCell);
            }
            r15 = new StickerEmojiCell(this, this.context, true) {
                @Override
                public void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(82.0f), 1073741824));
                }
            };
            featuredStickerSetInfoCell = r15;
            return new RecyclerListView.Holder(featuredStickerSetInfoCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            boolean z = true;
            char c = 1;
            int i2 = 1;
            z = true;
            if (itemViewType != 0) {
                Integer num = null;
                if (itemViewType == 1) {
                    EmptyCell emptyCell = (EmptyCell) viewHolder.itemView;
                    if (i == this.totalItems) {
                        int i3 = this.positionToRow.get(i - 1, Integer.MIN_VALUE);
                        if (i3 == Integer.MIN_VALUE) {
                            emptyCell.setHeight(1);
                            return;
                        }
                        Object obj = this.rowStartPack.get(i3);
                        if (obj instanceof TLRPC$TL_messages_stickerSet) {
                            num = Integer.valueOf(((TLRPC$TL_messages_stickerSet) obj).documents.size());
                        } else if (obj instanceof Integer) {
                            num = (Integer) obj;
                        }
                        if (num == null) {
                            emptyCell.setHeight(1);
                        } else if (num.intValue() == 0) {
                            emptyCell.setHeight(AndroidUtilities.m34dp(8.0f));
                        } else {
                            int height = EmojiView.this.pager.getHeight() - (((int) Math.ceil(num.intValue() / EmojiView.this.stickersGridAdapter.stickersPerRow)) * AndroidUtilities.m34dp(82.0f));
                            if (height > 0) {
                                i2 = height;
                            }
                            emptyCell.setHeight(i2);
                        }
                    } else {
                        emptyCell.setHeight(AndroidUtilities.m34dp(82.0f));
                    }
                } else if (itemViewType == 2) {
                    StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
                    Object obj2 = this.cache.get(i);
                    if (obj2 instanceof TLRPC$TL_messages_stickerSet) {
                        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = (TLRPC$TL_messages_stickerSet) obj2;
                        if (TextUtils.isEmpty(this.searchQuery) || !this.localPacksByShortName.containsKey(tLRPC$TL_messages_stickerSet)) {
                            Integer num2 = this.localPacksByName.get(tLRPC$TL_messages_stickerSet);
                            TLRPC$StickerSet tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set;
                            if (!(tLRPC$StickerSet == null || num2 == null)) {
                                stickerSetNameCell.setText(tLRPC$StickerSet.title, 0, num2.intValue(), !TextUtils.isEmpty(this.searchQuery) ? this.searchQuery.length() : 0);
                            }
                            stickerSetNameCell.setUrl(null, 0);
                            return;
                        }
                        TLRPC$StickerSet tLRPC$StickerSet2 = tLRPC$TL_messages_stickerSet.set;
                        if (tLRPC$StickerSet2 != null) {
                            stickerSetNameCell.setText(tLRPC$StickerSet2.title, 0);
                        }
                        stickerSetNameCell.setUrl(tLRPC$TL_messages_stickerSet.set.short_name, this.searchQuery.length());
                    }
                } else if (itemViewType == 3) {
                    TLRPC$StickerSetCovered tLRPC$StickerSetCovered = (TLRPC$StickerSetCovered) this.cache.get(i);
                    FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) viewHolder.itemView;
                    boolean z2 = EmojiView.this.installingStickerSets.indexOfKey(tLRPC$StickerSetCovered.set.f886id) >= 0;
                    if (EmojiView.this.removingStickerSets.indexOfKey(tLRPC$StickerSetCovered.set.f886id) < 0) {
                        c = 0;
                    }
                    if (z2 || c != 0) {
                        if (z2 && featuredStickerSetInfoCell.isInstalled()) {
                            EmojiView.this.installingStickerSets.remove(tLRPC$StickerSetCovered.set.f886id);
                            z2 = false;
                        } else if (c != 0 && !featuredStickerSetInfoCell.isInstalled()) {
                            EmojiView.this.removingStickerSets.remove(tLRPC$StickerSetCovered.set.f886id);
                        }
                    }
                    featuredStickerSetInfoCell.setAddDrawProgress(z2, false);
                    int indexOfIgnoreCase = TextUtils.isEmpty(this.searchQuery) ? -1 : AndroidUtilities.indexOfIgnoreCase(tLRPC$StickerSetCovered.set.title, this.searchQuery);
                    if (indexOfIgnoreCase >= 0) {
                        featuredStickerSetInfoCell.setStickerSet(tLRPC$StickerSetCovered, false, false, indexOfIgnoreCase, this.searchQuery.length());
                        return;
                    }
                    featuredStickerSetInfoCell.setStickerSet(tLRPC$StickerSetCovered, false);
                    if (!TextUtils.isEmpty(this.searchQuery) && AndroidUtilities.indexOfIgnoreCase(tLRPC$StickerSetCovered.set.short_name, this.searchQuery) == 0) {
                        featuredStickerSetInfoCell.setUrl(tLRPC$StickerSetCovered.set.short_name, this.searchQuery.length());
                    }
                }
            } else {
                TLRPC$Document tLRPC$Document = (TLRPC$Document) this.cache.get(i);
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) viewHolder.itemView;
                stickerEmojiCell.setSticker(tLRPC$Document, null, this.cacheParent.get(i), this.positionToEmoji.get(i), false);
                if (!EmojiView.this.recentStickers.contains(tLRPC$Document) && !EmojiView.this.favouriteStickers.contains(tLRPC$Document)) {
                    z = false;
                }
                stickerEmojiCell.setRecent(z);
            }
        }

        @Override
        public void notifyDataSetChanged() {
            int i;
            ArrayList<TLRPC$Document> arrayList;
            TLRPC$StickerSetCovered tLRPC$StickerSetCovered;
            this.rowStartPack.clear();
            this.positionToRow.clear();
            this.cache.clear();
            this.positionsToSets.clear();
            this.positionToEmoji.clear();
            this.totalItems = 0;
            int size = this.serverPacks.size();
            int size2 = this.localPacks.size();
            int i2 = !this.emojiArrays.isEmpty() ? 1 : 0;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            while (i4 < size + size2 + i2) {
                if (i4 == i3) {
                    SparseArray<Object> sparseArray = this.cache;
                    int i6 = this.totalItems;
                    this.totalItems = i6 + 1;
                    sparseArray.put(i6, "search");
                    i5++;
                    i = size;
                } else {
                    if (i4 < size2) {
                        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = this.localPacks.get(i4);
                        arrayList = tLRPC$TL_messages_stickerSet.documents;
                        i = size;
                        tLRPC$StickerSetCovered = tLRPC$TL_messages_stickerSet;
                    } else {
                        int i7 = i4 - size2;
                        if (i7 < i2) {
                            int size3 = this.emojiArrays.size();
                            String str = "";
                            int i8 = 0;
                            for (int i9 = 0; i9 < size3; i9++) {
                                ArrayList<TLRPC$Document> arrayList2 = this.emojiArrays.get(i9);
                                String str2 = this.emojiStickers.get(arrayList2);
                                if (str2 != null && !str.equals(str2)) {
                                    this.positionToEmoji.put(this.totalItems + i8, str2);
                                    str = str2;
                                }
                                int size4 = arrayList2.size();
                                for (int i10 = 0; i10 < size4; i10++) {
                                    int i11 = this.totalItems + i8;
                                    int i12 = (i8 / EmojiView.this.stickersGridAdapter.stickersPerRow) + i5;
                                    TLRPC$Document tLRPC$Document = arrayList2.get(i10);
                                    size = size;
                                    this.cache.put(i11, tLRPC$Document);
                                    size3 = size3;
                                    str = str;
                                    TLRPC$TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSetById(MediaDataController.getStickerSetId(tLRPC$Document));
                                    if (stickerSetById != null) {
                                        this.cacheParent.put(i11, stickerSetById);
                                    }
                                    this.positionToRow.put(i11, i12);
                                    i8++;
                                }
                            }
                            i = size;
                            int ceil = (int) Math.ceil(i8 / EmojiView.this.stickersGridAdapter.stickersPerRow);
                            for (int i13 = 0; i13 < ceil; i13++) {
                                this.rowStartPack.put(i5 + i13, Integer.valueOf(i8));
                            }
                            this.totalItems += EmojiView.this.stickersGridAdapter.stickersPerRow * ceil;
                            i5 += ceil;
                        } else {
                            i = size;
                            TLRPC$StickerSetCovered tLRPC$StickerSetCovered2 = this.serverPacks.get(i7 - i2);
                            arrayList = tLRPC$StickerSetCovered2.covers;
                            tLRPC$StickerSetCovered = tLRPC$StickerSetCovered2;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        int ceil2 = (int) Math.ceil(arrayList.size() / EmojiView.this.stickersGridAdapter.stickersPerRow);
                        this.cache.put(this.totalItems, tLRPC$StickerSetCovered);
                        if (i4 >= size2 && (tLRPC$StickerSetCovered instanceof TLRPC$StickerSetCovered)) {
                            this.positionsToSets.put(this.totalItems, tLRPC$StickerSetCovered);
                        }
                        this.positionToRow.put(this.totalItems, i5);
                        int size5 = arrayList.size();
                        int i14 = 0;
                        while (i14 < size5) {
                            int i15 = i14 + 1;
                            int i16 = this.totalItems + i15;
                            int i17 = i5 + 1 + (i14 / EmojiView.this.stickersGridAdapter.stickersPerRow);
                            this.cache.put(i16, arrayList.get(i14));
                            this.cacheParent.put(i16, tLRPC$StickerSetCovered);
                            this.positionToRow.put(i16, i17);
                            if (i4 >= size2 && (tLRPC$StickerSetCovered instanceof TLRPC$StickerSetCovered)) {
                                this.positionsToSets.put(i16, tLRPC$StickerSetCovered);
                            }
                            i14 = i15;
                        }
                        int i18 = ceil2 + 1;
                        for (int i19 = 0; i19 < i18; i19++) {
                            this.rowStartPack.put(i5 + i19, tLRPC$StickerSetCovered);
                        }
                        this.totalItems += (ceil2 * EmojiView.this.stickersGridAdapter.stickersPerRow) + 1;
                        i5 += i18;
                    }
                }
                i4++;
                size = i;
                i3 = -1;
            }
            super.notifyDataSetChanged();
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
        private final int threadId;
        boolean typingWasSent;
        boolean visible = false;
        long lastActionTime = -1;

        public abstract boolean isShown();

        public ChooseStickerActionTracker(int i, long j, int i2) {
            this.currentAccount = i;
            this.dialogId = j;
            this.threadId = i2;
        }

        public void doSomeAction() {
            if (!this.visible) {
                return;
            }
            if (this.lastActionTime == -1) {
                this.lastActionTime = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.lastActionTime > 2000) {
                this.typingWasSent = true;
                this.lastActionTime = System.currentTimeMillis();
                MessagesController.getInstance(this.currentAccount).sendTyping(this.dialogId, this.threadId, 10, 0);
            }
        }

        public void reset() {
            if (this.typingWasSent) {
                MessagesController.getInstance(this.currentAccount).sendTyping(this.dialogId, this.threadId, 2, 0);
            }
            this.lastActionTime = -1L;
        }

        public void checkVisibility() {
            boolean isShown = isShown();
            this.visible = isShown;
            if (!isShown) {
                reset();
            }
        }
    }
}
