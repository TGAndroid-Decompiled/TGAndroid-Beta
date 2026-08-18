package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.arch.core.util.Function;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Cells.ShareTopicCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageStatisticActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public class ShareAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private AnimatorSet animatorSet;
    private View bottomFadeView;
    private FrameLayout bulletinContainer;
    public FrameLayout bulletinContainer2;
    private BlurredBackgroundDrawable captionContainerBg;
    private float captionEditTextTopOffset;
    private float chatActivityEnterViewAnimateFromTop;
    private EditTextEmoji commentTextView;
    private int containerViewTop;
    private boolean copyLinkOnEnd;
    private float currentPanTranslationY;
    private boolean darkTheme;
    private ShareAlertDelegate delegate;
    private BlurredBackgroundDrawable emojiViewChildBg;
    private TLRPC.TL_exportedMessageLink exportedMessageLink;
    private BlurredBackgroundWithFadeDrawable fadeDrawable;
    public boolean forceDarkThemeForHint;
    private FrameLayout frameLayout;
    private FrameLayout frameLayout2;
    private boolean fullyShown;
    private RecyclerListView gridView;
    private int hasPoll;
    private IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFade;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFrostedLiquidGlass;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private boolean includeStory;
    public boolean includeStoryFromMessage;
    private boolean isChannel;
    private int keyboardSize2;
    private float keyboardT;
    int lastOffset;
    private GridLayoutManager layoutManager;
    private LinearLayout linkContainer;
    private TextView linkCopyButton;
    private SimpleTextView linkTextView;
    private String[] linkToCopy;
    private ShareDialogsAdapter listAdapter;
    private boolean loadingLink;
    private Paint paint;
    private boolean panTranslationMoveLayout;
    private Activity parentActivity;
    private ChatActivity parentFragment;
    private FrameLayout pickerBottom;
    private FrameLayout pickerBottomLayout;
    private int previousScrollOffsetY;
    private ArrayList recentSearchObjects;
    private LongSparseArray recentSearchObjectsById;
    private RectF rect;
    RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
    private int scrollOffsetY;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private ShareSearchAdapter searchAdapter;
    private StickerEmptyView searchEmptyView;
    private RecyclerListView searchGridView;
    private boolean searchIsVisible;
    private FillLastGridLayoutManager searchLayoutManager;
    FragmentSearchField searchView;
    private boolean searchWasVisibleBeforeTopics;
    protected Map selectedDialogTopics;
    protected LongSparseArray selectedDialogs;
    private TLRPC.Dialog selectedTopicDialog;
    private ActionBarPopupWindow sendPopupWindow;
    protected ArrayList sendingMessageObjects;
    private String[] sendingText;
    private View[] shadow;
    private AnimatorSet[] shadowAnimation;
    private Drawable shadowDrawable;
    private ShareTopicsAdapter shareTopicsAdapter;
    private LinearLayout sharesCountLayout;
    private int shiftDp;
    private boolean showSendersName;
    private SizeNotifierFrameLayout sizeNotifierFrameLayout;
    TL_stories.StoryItem storyItem;
    private SwitchView switchView;
    private Insets systemInsets;
    private TextPaint textPaint;
    public int timestamp;
    public CheckBox2 timestampCheckbox;
    public FrameLayout timestampFrameLayout;
    public LinearLayout timestampLayout;
    public TextView timestampTextView;
    private ValueAnimator topBackgroundAnimator;
    private int topBeforeSwitch;
    private SpringAnimation topicsAnimation;
    ActionBar topicsBackActionBar;
    private RecyclerListView topicsGridView;
    private GridLayoutManager topicsLayoutManager;
    private boolean updateSearchAdapter;
    private ChatActivityEnterView.SendButton writeButton;
    private FrameLayout writeButtonContainer;

    public static class DialogSearchResult {
        public int date;
        public TLRPC.Dialog dialog = new TLRPC.TL_dialog();
        public CharSequence name;
        public TLObject object;
    }

    public interface ShareAlertDelegate {

        public abstract class CC {
            public static void $default$didShare(ShareAlertDelegate shareAlertDelegate) {
            }
        }

        boolean didCopy();

        void didShare();
    }

    public static boolean lambda$new$15(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
    }

    protected void onShareStory(View view) {
    }

    public void setStoryToShare(TL_stories.StoryItem storyItem) {
        this.storyItem = storyItem;
    }

    class SwitchView extends FrameLayout {
        private AnimatorSet animator;
        private int currentTab;
        private int lastColor;
        private SimpleTextView leftTab;
        private LinearGradient linearGradient;
        private Paint paint;
        private RectF rect;
        private SimpleTextView rightTab;
        private View searchBackground;
        private View slidingView;

        protected abstract void onTabSwitch(int i);

        public SwitchView(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.rect = new RectF();
            View view = new View(context);
            this.searchBackground = view;
            view.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), ShareAlert.this.getThemedColor(Theme.key_dialogSearchBackground)));
            addView(this.searchBackground, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
            View view2 = new View(context) {
                @Override
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    invalidate();
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                    int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                    if (offsetColor != SwitchView.this.lastColor) {
                        SwitchView.this.linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP);
                        SwitchView.this.paint.setShader(SwitchView.this.linearGradient);
                    }
                    SwitchView.this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(SwitchView.this.rect, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), SwitchView.this.paint);
                }
            };
            this.slidingView = view2;
            addView(view2, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.leftTab = simpleTextView;
            int i = Theme.key_voipgroup_nameText;
            simpleTextView.setTextColor(ShareAlert.this.getThemedColor(i));
            this.leftTab.setTextSize(13);
            this.leftTab.setLeftDrawable(R.drawable.msg_tabs_mic1);
            this.leftTab.setText(LocaleController.getString(R.string.VoipGroupInviteCanSpeak));
            this.leftTab.setGravity(17);
            addView(this.leftTab, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
            this.leftTab.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    this.f$0.lambda$new$0(view3);
                }
            });
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.rightTab = simpleTextView2;
            simpleTextView2.setTextColor(ShareAlert.this.getThemedColor(i));
            this.rightTab.setTextSize(13);
            this.rightTab.setLeftDrawable(R.drawable.msg_tabs_mic2);
            this.rightTab.setText(LocaleController.getString(R.string.VoipGroupInviteListenOnly));
            this.rightTab.setGravity(17);
            addView(this.rightTab, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
            this.rightTab.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    this.f$0.lambda$new$1(view3);
                }
            });
        }

        public void lambda$new$0(View view) {
            switchToTab(0);
        }

        public void lambda$new$1(View view) {
            switchToTab(1);
        }

        private void switchToTab(int i) {
            if (this.currentTab == i) {
                return;
            }
            this.currentTab = i;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animator = animatorSet2;
            View view = this.slidingView;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, this.currentTab == 0 ? 0.0f : view.getMeasuredWidth()));
            this.animator.setDuration(180L);
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SwitchView.this.animator = null;
                }
            });
            this.animator.start();
            onTabSwitch(this.currentTab);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(28.0f)) / 2;
            ((FrameLayout.LayoutParams) this.leftTab.getLayoutParams()).width = size;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.rightTab.getLayoutParams();
            layoutParams.width = size;
            layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.slidingView.getLayoutParams();
            layoutParams2.width = size;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.slidingView.setTranslationX(this.currentTab == 0 ? 0.0f : layoutParams2.width);
            super.onMeasure(i, i2);
        }
    }

    public static ShareAlert createShareAlert(Context context, MessageObject messageObject, String str, boolean z, String str2, boolean z2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = new ArrayList();
            arrayList.add(messageObject);
        } else {
            arrayList = null;
        }
        return new ShareAlert(context, null, arrayList, str, null, z, str2, null, z2, false);
    }

    public ShareAlert(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2) {
        this(context, arrayList, str, z, str2, z2, null);
    }

    public ShareAlert(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        this(context, null, arrayList, str, null, z, str2, null, z2, false, false, null, resourcesProvider);
    }

    public ShareAlert(Context context, ChatActivity chatActivity, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3) {
        this(context, chatActivity, arrayList, str, str2, z, str3, str4, z2, z3, false, null, null);
    }

    public ShareAlert(final Context context, ChatActivity chatActivity, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, boolean z4, Integer num, Theme.ResourcesProvider resourcesProvider) {
        LinearLayout linearLayout;
        int i;
        super(context, true, resourcesProvider);
        this.sendingText = new String[2];
        this.shadow = new View[2];
        this.shadowAnimation = new AnimatorSet[2];
        this.selectedDialogs = new LongSparseArray();
        this.selectedDialogTopics = new HashMap();
        this.containerViewTop = -1;
        this.fullyShown = false;
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.linkToCopy = new String[2];
        this.recentSearchObjects = new ArrayList();
        this.recentSearchObjectsById = new LongSparseArray();
        this.systemInsets = Insets.NONE;
        this.shiftDp = 4;
        this.showSendersName = true;
        this.lastOffset = Integer.MAX_VALUE;
        ArrayList arrayList2 = new ArrayList();
        this.iBlur3Positions = arrayList2;
        RectF rectF = new RectF();
        this.iBlur3PositionMainTabs = rectF;
        arrayList2.add(rectF);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        int i2 = Theme.key_windowBackgroundWhite;
        blurredBackgroundSourceColor.setColor(getThemedColor(i2));
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    iBlur3Hash.add(ShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    iBlur3Hash.add(SharedConfig.chatBlurEnabled());
                }

                @Override
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    canvas.drawColor(ShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        ShareAlert.this.scrollableViewNoiseSuppressor.draw(canvas, -2);
                    }
                }
            });
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlassFrosted = blurredBackgroundSourceRenderNode2;
            blurredBackgroundSourceRenderNode2.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    iBlur3Hash.add(ShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    iBlur3Hash.add(SharedConfig.chatBlurEnabled());
                }

                @Override
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    canvas.drawColor(ShareAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        ShareAlert.this.scrollableViewNoiseSuppressor.draw(canvas, -3);
                    }
                }
            });
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode2);
            this.iBlur3FactoryFrostedLiquidGlass = blurredBackgroundDrawableViewFactory2;
            blurredBackgroundDrawableViewFactory2.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            this.iBlur3FactoryFrostedLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        this.iBlur3FactoryFade = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        this.resourcesProvider = resourcesProvider;
        this.includeStory = z4;
        this.parentActivity = AndroidUtilities.findActivity(context);
        this.darkTheme = z3;
        if (z3) {
            this.resourcesProvider = new DarkThemeResourceProvider() {
                @Override
                public void appendColors() {
                    SparseIntArray sparseIntArray = this.sparseIntArray;
                    int i3 = Theme.key_windowBackgroundGray;
                    int i4 = Theme.key_dialogBackground;
                    sparseIntArray.put(i3, getColor(i4));
                    this.sparseIntArray.put(Theme.key_divider, -15264235);
                    this.sparseIntArray.put(Theme.key_chat_messagePanelIcons, Theme.multAlpha(-1, 0.45f));
                    this.sparseIntArray.put(Theme.key_dialogBackgroundGray, 352321535);
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, getColor(i4));
                }
            };
        }
        blurredBackgroundSourceColor.setColor(getThemedColor(i2));
        this.parentFragment = chatActivity;
        this.shadowDrawable = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        int i3 = Theme.key_dialogBackground;
        this.behindKeyboardColorKey = i3;
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), PorterDuff.Mode.MULTIPLY));
        this.occupyNavigationBarWithoutKeyboard = true;
        this.isFullscreen = z2;
        String[] strArr = this.linkToCopy;
        strArr[0] = str3;
        strArr[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(messageObject.getDialogId()));
            if (!TextUtils.isEmpty(publicUsername)) {
                this.linkToCopy[0] = "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + publicUsername + "/" + messageObject.getId();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr2 = this.linkToCopy;
                    sb.append(strArr2[0]);
                    sb.append("?single");
                    strArr2[0] = sb.toString();
                }
            }
        }
        this.sendingMessageObjects = arrayList;
        this.searchAdapter = new ShareSearchAdapter(context);
        this.isChannel = z;
        String[] strArr3 = this.sendingText;
        strArr3[0] = str;
        strArr3[1] = str2;
        this.useSmoothKeyboard = true;
        super.setDelegate(new BottomSheet.BottomSheetDelegate() {
            @Override
            public void onOpenAnimationEnd() {
                ShareAlert.this.fullyShown = true;
            }
        });
        ArrayList arrayList3 = this.sendingMessageObjects;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i4 = 0; i4 < size; i4++) {
                MessageObject messageObject2 = (MessageObject) this.sendingMessageObjects.get(i4);
                if (messageObject2.isTodo()) {
                    this.hasPoll = 3;
                } else if (messageObject2.isPoll()) {
                    int i5 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.hasPoll = i5;
                    if (i5 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z) {
            this.loadingLink = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((MessageObject) arrayList.get(0)).getId();
            tL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(((MessageObject) arrayList.get(0)).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$new$1(context, tLObject, tL_error);
                }
            });
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            private int fromOffsetTop;
            private int fromScrollY;
            private boolean fullHeight;
            private boolean lightStatusBar;
            private final AnimatedFloat pinnedToTop;
            private int previousTopOffset;
            private int toOffsetTop;
            private int toScrollY;
            private int topOffset;
            private boolean ignoreLayout = false;
            private RectF rect1 = new RectF();

            {
                this.adjustPanLayoutHelper = new AdjustPanLayoutHelper(this) {
                    @Override
                    protected void onTransitionStart(boolean z5, int i6) {
                        super.onTransitionStart(z5, i6);
                        if (ShareAlert.this.previousScrollOffsetY == ShareAlert.this.scrollOffsetY) {
                            AnonymousClass5.this.fromScrollY = -1;
                        } else {
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            anonymousClass5.fromScrollY = ShareAlert.this.previousScrollOffsetY;
                            AnonymousClass5 anonymousClass6 = AnonymousClass5.this;
                            anonymousClass6.toScrollY = ShareAlert.this.scrollOffsetY;
                            ShareAlert.this.panTranslationMoveLayout = true;
                            AnonymousClass5 anonymousClass7 = AnonymousClass5.this;
                            ShareAlert.this.scrollOffsetY = anonymousClass7.fromScrollY;
                        }
                        if (AnonymousClass5.this.topOffset != AnonymousClass5.this.previousTopOffset) {
                            AnonymousClass5.this.fromOffsetTop = 0;
                            AnonymousClass5.this.toOffsetTop = 0;
                            ShareAlert.this.panTranslationMoveLayout = true;
                            if (!z5) {
                                AnonymousClass5 anonymousClass8 = AnonymousClass5.this;
                                AnonymousClass5.access$2220(anonymousClass8, anonymousClass8.topOffset - AnonymousClass5.this.previousTopOffset);
                            } else {
                                AnonymousClass5 anonymousClass9 = AnonymousClass5.this;
                                AnonymousClass5.access$2212(anonymousClass9, anonymousClass9.topOffset - AnonymousClass5.this.previousTopOffset);
                            }
                            AnonymousClass5 anonymousClass10 = AnonymousClass5.this;
                            ShareAlert.this.scrollOffsetY = z5 ? anonymousClass10.fromScrollY : anonymousClass10.toScrollY;
                        } else {
                            AnonymousClass5.this.fromOffsetTop = -1;
                        }
                        ShareAlert.this.gridView.setTopGlowOffset((int) (ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY));
                        ShareAlert.this.frameLayout.setTranslationY(ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.searchEmptyView.setTranslationY(ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY);
                        invalidate();
                    }

                    @Override
                    protected void onTransitionEnd() {
                        super.onTransitionEnd();
                        ShareAlert shareAlert = ShareAlert.this;
                        shareAlert.keyboardT = ((shareAlert.commentTextView == null || !ShareAlert.this.commentTextView.isPopupVisible()) && ShareAlert.this.keyboardSize2 <= AndroidUtilities.dp(20.0f)) ? 0.0f : 1.0f;
                        ShareAlert.this.panTranslationMoveLayout = false;
                        ShareAlert shareAlert2 = ShareAlert.this;
                        shareAlert2.previousScrollOffsetY = shareAlert2.scrollOffsetY;
                        ShareAlert.this.gridView.setTopGlowOffset(ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.frameLayout.setTranslationY(ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.searchEmptyView.setTranslationY(ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.gridView.setTranslationY(0.0f);
                        ShareAlert.this.searchGridView.setTranslationY(0.0f);
                        ShareAlert.this.updateBottomOverlay();
                    }

                    @Override
                    protected void onPanTranslationUpdate(float f, float f2, boolean z5) {
                        ShareAlert.this.keyboardT = f2;
                        super.onPanTranslationUpdate(f, f2, z5);
                        for (int i6 = 0; i6 < ((BottomSheet) ShareAlert.this).containerView.getChildCount(); i6++) {
                            View childAt = ((BottomSheet) ShareAlert.this).containerView.getChildAt(i6);
                            if (childAt != ShareAlert.this.pickerBottom && childAt != ShareAlert.this.bulletinContainer && childAt != ShareAlert.this.shadow[1] && childAt != ShareAlert.this.sharesCountLayout && childAt != ShareAlert.this.frameLayout2) {
                                ShareAlert shareAlert = ShareAlert.this;
                                if (childAt != shareAlert.timestampFrameLayout && childAt != shareAlert.writeButtonContainer) {
                                    childAt.setTranslationY(f);
                                }
                            }
                        }
                        ShareAlert.this.currentPanTranslationY = f;
                        if (AnonymousClass5.this.fromScrollY == -1) {
                            if (AnonymousClass5.this.fromOffsetTop != -1) {
                                AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                float f3 = 1.0f - f2;
                                ShareAlert.this.scrollOffsetY = (int) ((anonymousClass5.fromOffsetTop * f3) + (AnonymousClass5.this.toOffsetTop * f2));
                                if (!z5) {
                                    f3 = f2;
                                }
                                if (z5) {
                                    ShareAlert.this.gridView.setTranslationY(ShareAlert.this.currentPanTranslationY - ((AnonymousClass5.this.fromOffsetTop - AnonymousClass5.this.toOffsetTop) * f2));
                                } else {
                                    ShareAlert.this.gridView.setTranslationY(ShareAlert.this.currentPanTranslationY + ((AnonymousClass5.this.toOffsetTop - AnonymousClass5.this.fromOffsetTop) * f3));
                                }
                            }
                        } else {
                            if (!z5) {
                                f2 = 1.0f - f2;
                            }
                            AnonymousClass5 anonymousClass6 = AnonymousClass5.this;
                            float f4 = 1.0f - f2;
                            ShareAlert.this.scrollOffsetY = (int) ((anonymousClass6.fromScrollY * f4) + (AnonymousClass5.this.toScrollY * f2));
                            float f5 = ShareAlert.this.currentPanTranslationY + ((AnonymousClass5.this.fromScrollY - AnonymousClass5.this.toScrollY) * f4);
                            ShareAlert.this.gridView.setTranslationY(f5);
                            if (z5) {
                                ShareAlert.this.searchGridView.setTranslationY(f5);
                            } else {
                                ShareAlert.this.searchGridView.setTranslationY(f5 + ShareAlert.this.gridView.getPaddingTop());
                            }
                        }
                        ShareAlert.this.gridView.setTopGlowOffset((int) (ShareAlert.this.scrollOffsetY + ShareAlert.this.currentPanTranslationY));
                        ShareAlert.this.frameLayout.setTranslationY(ShareAlert.this.scrollOffsetY + ShareAlert.this.currentPanTranslationY);
                        ShareAlert.this.searchEmptyView.setTranslationY(ShareAlert.this.scrollOffsetY + ShareAlert.this.currentPanTranslationY);
                        ShareAlert.this.frameLayout2.invalidate();
                        ShareAlert shareAlert2 = ShareAlert.this;
                        shareAlert2.setCurrentPanTranslationY(shareAlert2.currentPanTranslationY);
                        ShareAlert.this.updateBottomOverlay();
                        invalidate();
                    }

                    @Override
                    protected boolean heightAnimationEnabled() {
                        if (ShareAlert.this.isDismissed() || !ShareAlert.this.fullyShown) {
                            return false;
                        }
                        return !ShareAlert.this.commentTextView.isPopupVisible();
                    }
                };
                this.lightStatusBar = AndroidUtilities.computePerceivedBrightness(ShareAlert.this.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                this.pinnedToTop = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            }

            static int access$2212(AnonymousClass5 anonymousClass5, int i6) {
                int i7 = anonymousClass5.toOffsetTop + i6;
                anonymousClass5.toOffsetTop = i7;
                return i7;
            }

            static int access$2220(AnonymousClass5 anonymousClass5, int i6) {
                int i7 = anonymousClass5.toOffsetTop - i6;
                anonymousClass5.toOffsetTop = i7;
                return i7;
            }

            @Override
            protected void drawList(Canvas canvas, boolean z5, ArrayList arrayList4) {
                if (ShareAlert.this.gridView.getVisibility() == 0 && ShareAlert.this.gridView.getAlpha() >= 0.0f) {
                    canvas.save();
                    canvas.translate(ShareAlert.this.gridView.getX(), ShareAlert.this.gridView.getY());
                    ShareAlert.this.gridView.draw(canvas);
                    canvas.restore();
                }
                if (ShareAlert.this.topicsGridView.getVisibility() == 0 && ShareAlert.this.topicsGridView.getAlpha() >= 0.0f) {
                    canvas.save();
                    canvas.translate(ShareAlert.this.topicsGridView.getX(), ShareAlert.this.topicsGridView.getY());
                    ShareAlert.this.topicsGridView.draw(canvas);
                    canvas.restore();
                }
                if (ShareAlert.this.searchGridView.getVisibility() != 0 || ShareAlert.this.searchGridView.getAlpha() < 0.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(ShareAlert.this.searchGridView.getX(), ShareAlert.this.searchGridView.getY());
                ShareAlert.this.searchGridView.draw(canvas);
                canvas.restore();
            }

            @Override
            protected Theme.ResourcesProvider getResourceProvider() {
                return ((BottomSheet) ShareAlert.this).resourcesProvider;
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.adjustPanLayoutHelper.setResizableView(this);
                this.adjustPanLayoutHelper.onAttach();
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.adjustPanLayoutHelper.onDetach();
            }

            @Override
            protected void onMeasure(int i6, int i7) {
                int size2;
                int iDp;
                if (getLayoutParams().height > 0) {
                    size2 = getLayoutParams().height;
                } else {
                    size2 = View.MeasureSpec.getSize(i7);
                }
                ShareAlert.this.layoutManager.setNeedFixGap(getLayoutParams().height <= 0);
                ShareAlert.this.searchLayoutManager.setNeedFixGap(getLayoutParams().height <= 0);
                if (!((BottomSheet) ShareAlert.this).isFullscreen) {
                    this.ignoreLayout = true;
                    setPadding(((BottomSheet) ShareAlert.this).backgroundPaddingLeft, ShareAlert.this.systemInsets.top, ((BottomSheet) ShareAlert.this).backgroundPaddingLeft, 0);
                    this.ignoreLayout = false;
                }
                int paddingTop = size2 - getPaddingTop();
                int iDp2 = AndroidUtilities.dp(103.0f) + AndroidUtilities.dp(48.0f) + (Math.max(2, (int) Math.ceil(Math.max(ShareAlert.this.searchAdapter.getItemCount(), ShareAlert.this.listAdapter.getItemCount() - 1) / 4.0f)) * AndroidUtilities.dp(103.0f)) + ((BottomSheet) ShareAlert.this).backgroundPaddingTop;
                if (ShareAlert.this.topicsGridView.getVisibility() != 8 && (iDp = AndroidUtilities.dp(103.0f) + AndroidUtilities.dp(48.0f) + (Math.max(2, (int) Math.ceil((ShareAlert.this.shareTopicsAdapter.getItemCount() - 1) / 4.0f)) * AndroidUtilities.dp(103.0f)) + ((BottomSheet) ShareAlert.this).backgroundPaddingTop) > iDp2) {
                    iDp2 = AndroidUtilities.lerp(iDp2, iDp, ShareAlert.this.topicsGridView.getAlpha());
                }
                int i8 = iDp2 < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
                int iDp3 = AndroidUtilities.dp((ShareAlert.this.timestampFrameLayout != null ? 48 : 0) + 100) + ShareAlert.this.systemInsets.bottom;
                if (ShareAlert.this.gridView.getPaddingTop() != i8 || ShareAlert.this.gridView.getPaddingBottom() != iDp3) {
                    this.ignoreLayout = true;
                    ShareAlert.this.gridView.setPadding(0, i8, 0, iDp3);
                    ShareAlert.this.topicsGridView.setPadding(0, i8, 0, iDp3);
                    this.ignoreLayout = false;
                }
                if (((BottomSheet) ShareAlert.this).keyboardVisible && getLayoutParams().height <= 0 && ShareAlert.this.searchGridView.getPaddingTop() != i8) {
                    this.ignoreLayout = true;
                    ShareAlert.this.searchGridView.setPadding(0, 0, 0, AndroidUtilities.dp((ShareAlert.this.timestampFrameLayout == null ? 0 : 48) + 60) + ShareAlert.this.systemInsets.bottom);
                    this.ignoreLayout = false;
                }
                boolean z5 = iDp2 >= size2;
                this.fullHeight = z5;
                this.topOffset = z5 ? 0 : size2 - iDp2;
                this.ignoreLayout = true;
                ShareAlert.this.checkCurrentList(false);
                this.ignoreLayout = false;
                setMeasuredDimension(View.MeasureSpec.getSize(i6), size2);
                onMeasureInternal(i6, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }

            private void onMeasureInternal(int i6, int i7) {
                int size2 = View.MeasureSpec.getSize(i6);
                int size3 = View.MeasureSpec.getSize(i7);
                int i8 = size2 - (((BottomSheet) ShareAlert.this).backgroundPaddingLeft * 2);
                ShareAlert.this.keyboardSize2 = measureKeyboardHeight();
                if (!ShareAlert.this.commentTextView.isWaitingForKeyboardOpen() && ShareAlert.this.keyboardSize2 <= AndroidUtilities.dp(20.0f) && !ShareAlert.this.commentTextView.isPopupShowing() && !ShareAlert.this.commentTextView.isAnimatePopupClosing()) {
                    this.ignoreLayout = true;
                    ShareAlert.this.commentTextView.hideEmojiView();
                    this.ignoreLayout = false;
                }
                this.ignoreLayout = true;
                if (ShareAlert.this.keyboardSize2 > AndroidUtilities.dp(20.0f)) {
                    if (!ShareAlert.this.commentTextView.isPopupVisible()) {
                        ShareAlert.this.commentTextView.hideEmojiView();
                    }
                    if (ShareAlert.this.pickerBottomLayout != null) {
                        ShareAlert.this.pickerBottomLayout.setVisibility(8);
                    }
                } else {
                    if (!AndroidUtilities.isInMultiwindow) {
                        size3 -= ((BottomSheet) ShareAlert.this).keyboardVisible ? 0 : ShareAlert.this.commentTextView.getEmojiPadding();
                        i7 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                    }
                    int i9 = ShareAlert.this.commentTextView.isPopupShowing() ? 8 : 0;
                    if (ShareAlert.this.pickerBottomLayout != null) {
                        ShareAlert.this.pickerBottomLayout.setVisibility(i9);
                    }
                }
                this.ignoreLayout = false;
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() != 8) {
                        if (ShareAlert.this.commentTextView != null && ShareAlert.this.commentTextView.isPopupView(childAt)) {
                            if (AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                                if (AndroidUtilities.isTablet()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), (size3 - ShareAlert.this.systemInsets.top) + getPaddingTop()), 1073741824));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec((size3 - ShareAlert.this.systemInsets.top) + getPaddingTop(), 1073741824));
                                }
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            }
                        } else {
                            measureChildWithMargins(childAt, i6, 0, i7, 0);
                        }
                    }
                }
                ShareAlert.this.updateBottomOverlay();
            }

            @Override
            protected void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
                int paddingRight;
                int i10;
                int paddingLeft;
                int i11;
                int i12;
                int paddingTop;
                int measuredHeight;
                int measuredHeight2;
                int childCount = getChildCount();
                int iMeasureKeyboardHeight = measureKeyboardHeight();
                int iMax = (((BottomSheet) ShareAlert.this).keyboardVisible || iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : Math.max(ShareAlert.this.systemInsets.bottom, ShareAlert.this.commentTextView.getEmojiPadding());
                setBottomClip(iMax);
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        int i14 = layoutParams.gravity;
                        if (i14 == -1) {
                            i14 = 51;
                        }
                        int i15 = i14 & 112;
                        int i16 = i14 & 7;
                        if (i16 != 1) {
                            if (i16 == 5) {
                                paddingRight = (((i8 - i6) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                                i10 = ((BottomSheet) ShareAlert.this).backgroundPaddingLeft;
                            } else {
                                paddingLeft = layoutParams.leftMargin + getPaddingLeft();
                            }
                            if (i15 != 16) {
                                if (i15 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop() + this.topOffset;
                                } else if (i15 != 80) {
                                    i11 = ((i9 - iMax) - i7) - measuredHeight3;
                                    i12 = layoutParams.bottomMargin;
                                } else {
                                    paddingTop = layoutParams.topMargin;
                                }
                                if (ShareAlert.this.commentTextView != null && ShareAlert.this.commentTextView.isPopupView(childAt)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    paddingTop = measuredHeight - measuredHeight2;
                                }
                                if (childAt == ShareAlert.this.bottomFadeView) {
                                    paddingTop += ShareAlert.this.systemInsets.bottom;
                                }
                                childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                            } else {
                                i11 = ((((i9 - iMax) - (this.topOffset + i7)) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i12 = layoutParams.bottomMargin;
                            }
                            paddingTop = i11 - i12;
                            if (ShareAlert.this.commentTextView != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            if (childAt == ShareAlert.this.bottomFadeView) {
                                paddingTop += ShareAlert.this.systemInsets.bottom;
                            }
                            childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                        } else {
                            paddingRight = (((i8 - i6) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i10 = layoutParams.rightMargin;
                        }
                        paddingLeft = paddingRight - i10;
                        if (i15 != 16) {
                            if (i15 != 48) {
                                paddingTop = layoutParams.topMargin + getPaddingTop() + this.topOffset;
                            } else if (i15 != 80) {
                                i11 = ((i9 - iMax) - i7) - measuredHeight3;
                                i12 = layoutParams.bottomMargin;
                            } else {
                                paddingTop = layoutParams.topMargin;
                            }
                            if (ShareAlert.this.commentTextView != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            if (childAt == ShareAlert.this.bottomFadeView) {
                                paddingTop += ShareAlert.this.systemInsets.bottom;
                            }
                            childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                        } else {
                            i11 = ((((i9 - iMax) - (this.topOffset + i7)) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i12 = layoutParams.bottomMargin;
                        }
                        paddingTop = i11 - i12;
                        if (ShareAlert.this.commentTextView != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        if (childAt == ShareAlert.this.bottomFadeView) {
                            paddingTop += ShareAlert.this.systemInsets.bottom;
                        }
                        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                    }
                }
                notifyHeightChanged();
                ShareAlert.this.updateBottomOverlay();
                ShareAlert.this.updateLayout();
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (!this.fullHeight) {
                    if (motionEvent.getAction() == 0 && motionEvent.getY() < this.topOffset - AndroidUtilities.dp(30.0f)) {
                        ShareAlert.this.lambda$new$0();
                        return true;
                    }
                } else if (motionEvent.getAction() == 0 && ShareAlert.this.scrollOffsetY != 0 && motionEvent.getY() < ShareAlert.this.scrollOffsetY - AndroidUtilities.dp(30.0f)) {
                    ShareAlert.this.lambda$new$0();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !ShareAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            protected void onDraw(Canvas canvas) {
                float f;
                canvas.save();
                canvas.translate(0.0f, ShareAlert.this.currentPanTranslationY);
                int iDp = (ShareAlert.this.scrollOffsetY - ((BottomSheet) ShareAlert.this).backgroundPaddingTop) + AndroidUtilities.dp(6.0f) + this.topOffset;
                ShareAlert shareAlert = ShareAlert.this;
                int iLerp = shareAlert.containerViewTop = ((shareAlert.scrollOffsetY - ((BottomSheet) ShareAlert.this).backgroundPaddingTop) - AndroidUtilities.dp(13.0f)) + this.topOffset;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(60.0f) + ((BottomSheet) ShareAlert.this).backgroundPaddingTop;
                if (((BottomSheet) ShareAlert.this).isFullscreen) {
                    f = 0.0f;
                } else {
                    iDp += ShareAlert.this.systemInsets.top;
                    boolean z5 = this.fullHeight && ((BottomSheet) ShareAlert.this).backgroundPaddingTop + iLerp < ShareAlert.this.systemInsets.top;
                    int i6 = iLerp + ShareAlert.this.systemInsets.top;
                    int i7 = -((BottomSheet) ShareAlert.this).backgroundPaddingTop;
                    f = this.pinnedToTop.set(z5);
                    iLerp = AndroidUtilities.lerp(i6, i7, f);
                }
                ShareAlert.this.shadowDrawable.setBounds(0, iLerp, getMeasuredWidth(), measuredHeight);
                ShareAlert.this.shadowDrawable.draw(canvas);
                ShareAlert shareAlert2 = ShareAlert.this;
                if (shareAlert2.bulletinContainer2 != null) {
                    if (iLerp <= shareAlert2.systemInsets.top && ShareAlert.this.bulletinContainer2.getChildCount() > 0) {
                        ShareAlert.this.bulletinContainer2.setTranslationY(0.0f);
                        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
                        if (visibleBulletin != null) {
                            if (visibleBulletin.getLayout() != null) {
                                visibleBulletin.getLayout().setTop(true);
                            }
                            visibleBulletin.hide();
                        }
                    } else {
                        ShareAlert shareAlert3 = ShareAlert.this;
                        shareAlert3.bulletinContainer2.setTranslationY(Math.max(0, ((iLerp + ((BottomSheet) shareAlert3).backgroundPaddingTop) - ShareAlert.this.bulletinContainer2.getTop()) - ShareAlert.this.bulletinContainer2.getMeasuredHeight()));
                    }
                }
                if (f < 1.0f) {
                    int iDp2 = AndroidUtilities.dp(36.0f);
                    this.rect1.set((getMeasuredWidth() - iDp2) / 2, iDp, (getMeasuredWidth() + iDp2) / 2, iDp + AndroidUtilities.dp(4.0f));
                    Theme.dialogs_onlineCirclePaint.setColor(ShareAlert.this.getThemedColor(Theme.key_sheet_scrollUp));
                    Paint paint = Theme.dialogs_onlineCirclePaint;
                    paint.setAlpha((int) (paint.getAlpha() * (1.0f - f)));
                    canvas.drawRoundRect(this.rect1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    int systemUiVisibility = getSystemUiVisibility();
                    boolean z6 = this.lightStatusBar && ((float) 0) > ((float) ShareAlert.this.systemInsets.top) * 0.5f;
                    if (z6 != ((systemUiVisibility & 8192) > 0)) {
                        setSystemUiVisibility(z6 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
                    }
                }
                canvas.restore();
                this.previousTopOffset = this.topOffset;
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && ShareAlert.this.scrollableViewNoiseSuppressor != null) {
                    ShareAlert.this.blur3_InvalidateBlur();
                    if (ShareAlert.this.iBlur3SourceGlassFrosted != null) {
                        ShareAlert.this.iBlur3SourceGlassFrosted.setSize(((BottomSheet) ShareAlert.this).containerView.getMeasuredWidth(), ((BottomSheet) ShareAlert.this).containerView.getMeasuredHeight());
                        ShareAlert.this.iBlur3SourceGlassFrosted.updateDisplayListIfNeeded();
                    }
                    if (ShareAlert.this.iBlur3SourceGlass != null) {
                        ShareAlert.this.iBlur3SourceGlass.setSize(((BottomSheet) ShareAlert.this).containerView.getMeasuredWidth(), ((BottomSheet) ShareAlert.this).containerView.getMeasuredHeight());
                        ShareAlert.this.iBlur3SourceGlass.updateDisplayListIfNeeded();
                    }
                }
                canvas.save();
                canvas.clipRect(0.0f, getPaddingTop() + ShareAlert.this.currentPanTranslationY, getMeasuredWidth(), getMeasuredHeight() + ShareAlert.this.currentPanTranslationY + AndroidUtilities.dp(50.0f));
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if ((view instanceof EmojiView) && ShareAlert.this.emojiViewChildBg != null) {
                    canvas.save();
                    ShareAlert.this.emojiViewChildBg.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                    canvas.clipPath(ShareAlert.this.emojiViewChildBg.getPath());
                    ShareAlert.this.emojiViewChildBg.draw(canvas);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        this.containerView = sizeNotifierFrameLayout;
        this.iBlur3FactoryLiquidGlass.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.iBlur3FactoryFrostedLiquidGlass.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.iBlur3FactoryFade.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.containerView.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i6 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i6, 0, i6, this.systemInsets.bottom);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        int i7 = Theme.key_dialogBackground;
        frameLayout.setBackgroundColor(getThemedColor(i7));
        if (this.darkTheme && this.linkToCopy[1] != null) {
            SwitchView switchView = new SwitchView(context) {
                @Override
                protected void onTabSwitch(int i8) {
                    ShareAlert.this.updateLinkTextView();
                }
            };
            this.switchView = switchView;
            this.frameLayout.addView(switchView, LayoutHelper.createFrame(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, this.resourcesProvider);
        this.searchView = fragmentSearchField;
        fragmentSearchField.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(ShareAlert.this.searchView.editText.getText())) {
                    ShareAlert.this.checkCurrentList(false);
                }
                if (ShareAlert.this.updateSearchAdapter) {
                    String string = ShareAlert.this.searchView.editText.getText().toString();
                    if (string.length() != 0) {
                        if (ShareAlert.this.searchEmptyView != null) {
                            ShareAlert.this.searchEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                        }
                    } else if (ShareAlert.this.gridView.getAdapter() != ShareAlert.this.listAdapter) {
                        int currentTop = ShareAlert.this.getCurrentTop();
                        ShareAlert.this.searchEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                        ShareAlert.this.searchEmptyView.showProgress(false, true);
                        ShareAlert.this.checkCurrentList(false);
                        ShareAlert.this.listAdapter.notifyDataSetChanged();
                        if (currentTop > 0) {
                            ShareAlert.this.layoutManager.scrollToPositionWithOffset(0, -currentTop);
                        }
                    }
                    if (ShareAlert.this.searchAdapter != null) {
                        ShareAlert.this.searchAdapter.searchDialogs(string);
                    }
                }
            }
        });
        this.searchView.editText.setHint(LocaleController.getString(R.string.ShareSendTo));
        this.searchView.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                return this.f$0.lambda$new$2(textView, i8, keyEvent);
            }
        });
        this.searchView.setCloseButtonOnClickListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$3();
            }
        });
        this.frameLayout.addView(this.searchView, LayoutHelper.createFrame(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        ActionBar actionBar = new ActionBar(context);
        this.topicsBackActionBar = actionBar;
        actionBar.setOccupyStatusBar(false);
        this.topicsBackActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ActionBar actionBar2 = this.topicsBackActionBar;
        int i8 = Theme.key_dialogTextBlack;
        actionBar2.setTitleColor(getThemedColor(i8));
        this.topicsBackActionBar.setSubtitleColor(getThemedColor(Theme.key_dialogTextGray2));
        this.topicsBackActionBar.setItemsColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2), false);
        this.topicsBackActionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarWhiteSelector), false);
        this.topicsBackActionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i9) {
                ShareAlert.this.lambda$openCrafting$8();
            }
        });
        this.topicsBackActionBar.setVisibility(8);
        this.frameLayout.addView(this.topicsBackActionBar, LayoutHelper.createFrame(-1, 58, 83));
        RecyclerListView recyclerListView = new RecyclerListView(context, this.resourcesProvider);
        this.topicsGridView = recyclerListView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
        this.topicsLayoutManager = gridLayoutManager;
        recyclerListView.setLayoutManager(gridLayoutManager);
        this.topicsLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i9) {
                if (i9 == 0) {
                    return ShareAlert.this.topicsLayoutManager.getSpanCount();
                }
                return 1;
            }
        });
        this.topicsGridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i9, int i10) {
                if (i10 != 0) {
                    ShareAlert.this.updateLayout();
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                }
            }
        });
        RecyclerListView recyclerListView2 = this.topicsGridView;
        ShareTopicsAdapter shareTopicsAdapter = new ShareTopicsAdapter(context);
        this.shareTopicsAdapter = shareTopicsAdapter;
        recyclerListView2.setAdapter(shareTopicsAdapter);
        RecyclerListView recyclerListView3 = this.topicsGridView;
        int i9 = Theme.key_dialogScrollGlow;
        recyclerListView3.setGlowColor(getThemedColor(i9));
        this.topicsGridView.setVerticalScrollBarEnabled(false);
        this.topicsGridView.setHorizontalScrollBarEnabled(false);
        this.topicsGridView.setOverScrollMode(2);
        this.topicsGridView.setSelectorDrawableColor(0);
        this.topicsGridView.setItemSelectorColorProvider(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                return ShareAlert.lambda$new$4((Integer) obj);
            }
        });
        this.topicsGridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        this.topicsGridView.setClipToPadding(false);
        this.topicsGridView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                if (holder != null) {
                    int adapterPosition = holder.getAdapterPosition() % 4;
                    rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                } else {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                }
            }
        });
        this.topicsGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i10) {
                this.f$0.lambda$new$5(view, i10);
            }
        });
        this.topicsGridView.setVisibility(8);
        this.containerView.addView(this.topicsGridView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView4 = new RecyclerListView(context, this.resourcesProvider) {
            @Override
            protected boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) (AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f) + ShareAlert.this.systemInsets.top));
            }

            @Override
            public void draw(Canvas canvas) {
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, ShareAlert.this.scrollOffsetY + AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f), getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.restore();
                }
            }
        };
        this.gridView = recyclerListView4;
        recyclerListView4.setSelectorDrawableColor(0);
        this.gridView.setItemSelectorColorProvider(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                return ShareAlert.lambda$new$6((Integer) obj);
            }
        });
        this.gridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        this.gridView.setClipToPadding(false);
        RecyclerListView recyclerListView5 = this.gridView;
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(), 4);
        this.layoutManager = gridLayoutManager2;
        recyclerListView5.setLayoutManager(gridLayoutManager2);
        RecyclerListView recyclerListView6 = this.gridView;
        ViewGroup viewGroup2 = this.containerView;
        Objects.requireNonNull(recyclerListView6);
        this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView6, viewGroup2, new EmojiView$$ExternalSyntheticLambda15(recyclerListView6));
        this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i10) {
                if (i10 == 0) {
                    return ShareAlert.this.layoutManager.getSpanCount();
                }
                return 1;
            }
        });
        this.gridView.setHorizontalScrollBarEnabled(false);
        this.gridView.setVerticalScrollBarEnabled(false);
        this.gridView.setOverScrollMode(2);
        this.gridView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                if (holder != null) {
                    int adapterPosition = holder.getAdapterPosition() % 4;
                    rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                } else {
                    rect.left = AndroidUtilities.dp(4.0f);
                    rect.right = AndroidUtilities.dp(4.0f);
                }
            }
        });
        this.containerView.addView(this.gridView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        RecyclerListView recyclerListView7 = this.gridView;
        ShareDialogsAdapter shareDialogsAdapter = new ShareDialogsAdapter(context);
        this.listAdapter = shareDialogsAdapter;
        recyclerListView7.setAdapter(shareDialogsAdapter);
        this.gridView.setGlowColor(getThemedColor(i9));
        this.gridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i10) {
                this.f$0.lambda$new$7(view, i10);
            }
        });
        this.gridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                if (i11 != 0) {
                    ShareAlert.this.updateLayout();
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                }
                if (Bulletin.getVisibleBulletin() != null && Bulletin.getVisibleBulletin().getLayout() != null && (Bulletin.getVisibleBulletin().getLayout().getParent() instanceof View) && ((View) Bulletin.getVisibleBulletin().getLayout().getParent()).getParent() == ShareAlert.this.bulletinContainer2) {
                    Bulletin.hideVisible();
                }
                if (Build.VERSION.SDK_INT < 31 || ShareAlert.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                ShareAlert.this.scrollableViewNoiseSuppressor.onScrolled(i10, i11);
                ShareAlert.this.blur3_InvalidateBlur();
            }
        });
        RecyclerListView recyclerListView8 = new RecyclerListView(context, this.resourcesProvider) {
            @Override
            protected boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) (AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f) + ShareAlert.this.systemInsets.top));
            }

            @Override
            public void draw(Canvas canvas) {
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, ShareAlert.this.scrollOffsetY + AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f), getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.restore();
                }
            }
        };
        this.searchGridView = recyclerListView8;
        recyclerListView8.setItemSelectorColorProvider(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                return ShareAlert.lambda$new$8((Integer) obj);
            }
        });
        this.searchGridView.setSelectorDrawableColor(0);
        this.searchGridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        this.searchGridView.setClipToPadding(false);
        RecyclerListView recyclerListView9 = this.searchGridView;
        FillLastGridLayoutManager fillLastGridLayoutManager = new FillLastGridLayoutManager(getContext(), 4, 0, this.searchGridView);
        this.searchLayoutManager = fillLastGridLayoutManager;
        recyclerListView9.setLayoutManager(fillLastGridLayoutManager);
        this.searchLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i10) {
                return ShareAlert.this.searchAdapter.getSpanSize(4, i10);
            }
        });
        this.searchGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i10) {
                this.f$0.lambda$new$9(view, i10);
            }
        });
        this.searchGridView.setHasFixedSize(true);
        this.searchGridView.setItemAnimator(null);
        this.searchGridView.setHorizontalScrollBarEnabled(false);
        this.searchGridView.setVerticalScrollBarEnabled(false);
        this.searchGridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                if (i11 != 0) {
                    ShareAlert.this.updateLayout();
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                }
            }
        });
        this.searchGridView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                if (holder != null) {
                    if (holder.getItemViewType() != 5) {
                        rect.right = 0;
                        rect.left = 0;
                        return;
                    } else {
                        int adapterPosition = holder.getAdapterPosition() % 4;
                        rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                        rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                        return;
                    }
                }
                rect.left = AndroidUtilities.dp(4.0f);
                rect.right = AndroidUtilities.dp(4.0f);
            }
        });
        this.searchGridView.setAdapter(this.searchAdapter);
        this.searchGridView.setGlowColor(getThemedColor(i9));
        this.recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(this.searchGridView, true);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, this.resourcesProvider);
        flickerLoadingView.setViewType(12);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, 1, this.resourcesProvider);
        this.searchEmptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView, 0);
        this.searchEmptyView.setAnimateLayoutChange(true);
        this.searchEmptyView.showProgress(false, false);
        if (this.darkTheme) {
            this.searchEmptyView.title.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
        }
        this.searchEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
        this.searchGridView.setEmptyView(this.searchEmptyView);
        this.searchGridView.setHideIfEmpty(false);
        this.searchGridView.setAnimateEmptyView(true, 0);
        this.containerView.addView(this.searchEmptyView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(this.searchGridView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context) {
            @Override
            public void draw(Canvas canvas) {
                super.draw(canvas);
                ShareAlert.this.fadeDrawable.setBounds(0, (getMeasuredHeight() - ShareAlert.this.systemInsets.bottom) - AndroidUtilities.dp(72.0f), getMeasuredWidth(), getMeasuredHeight());
                ShareAlert.this.fadeDrawable.draw(canvas);
            }
        };
        this.bottomFadeView = view;
        this.containerView.addView(view, LayoutHelper.createFrame(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.darkTheme || this.linkToCopy[1] == null) ? 58.0f : 111.0f);
        this.shadow[0] = new View(context);
        View view2 = this.shadow[0];
        int i10 = Theme.key_dialogShadowLine;
        view2.setBackgroundColor(getThemedColor(i10));
        this.shadow[0].setAlpha(0.0f);
        this.shadow[0].setTag(1);
        this.containerView.addView(this.shadow[0], layoutParams);
        this.containerView.addView(this.frameLayout, LayoutHelper.createFrame(-1, (!this.darkTheme || this.linkToCopy[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.shadow[1] = new View(context);
        this.shadow[1].setBackgroundColor(getThemedColor(i10));
        this.shadow[1].setLayoutParams(layoutParams2);
        if (this.isChannel || this.linkToCopy[0] != null) {
            if (this.darkTheme) {
                this.pickerBottom = new FrameLayout(context);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.pickerBottomLayout = frameLayout2;
                this.pickerBottom.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                this.pickerBottomLayout.addView(linearLayout2, LayoutHelper.createFrame(-1, -1, 119));
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.linkContainer = linearLayout3;
                linearLayout3.setOrientation(0);
                ScaleStateListAnimator.apply(this.linkContainer, 0.015f, 1.2f);
                this.linkContainer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        this.f$0.lambda$new$10(view3);
                    }
                });
                SimpleTextView simpleTextView = new SimpleTextView(context);
                this.linkTextView = simpleTextView;
                simpleTextView.setTextSize(15);
                this.linkTextView.setTextColor(getThemedColor(Theme.key_share_linkText));
                this.linkTextView.setEllipsizeByGradient(true);
                updateLinkTextView();
                this.linkContainer.addView(this.linkTextView, LayoutHelper.createLinear(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                this.linkCopyButton = textView;
                textView.setTextSize(1, 14.0f);
                this.linkCopyButton.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                this.linkCopyButton.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                this.linkCopyButton.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                this.linkCopyButton.setTypeface(AndroidUtilities.bold());
                this.linkCopyButton.setGravity(17);
                TextView textView2 = this.linkCopyButton;
                int i11 = Theme.key_listSelector;
                textView2.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i11), 4, 4));
                this.linkContainer.addView(this.linkCopyButton, LayoutHelper.createLinear(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                this.linkCopyButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        this.f$0.lambda$new$11(view3);
                    }
                });
                ScaleStateListAnimator.apply(this.linkCopyButton);
                this.containerView.addView(this.pickerBottom, LayoutHelper.createFrame(-1, 58, 83));
                ArrayList arrayList4 = this.sendingMessageObjects;
                if (arrayList4 == null || arrayList4.size() <= 0 || ((MessageObject) this.sendingMessageObjects.get(0)).messageOwner == null || ((MessageObject) this.sendingMessageObjects.get(0)).messageOwner.forwards <= 0) {
                    linearLayout = null;
                    i = 11;
                } else {
                    final MessageObject messageObject3 = (MessageObject) this.sendingMessageObjects.get(0);
                    if (!ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) || messageObject3.isForwarded()) {
                        linearLayout = null;
                        i = 11;
                    } else {
                        linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                this.f$0.lambda$new$12(messageObject3, view3);
                            }
                        });
                        linearLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        linearLayout.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i11), 6, 6));
                        ScaleStateListAnimator.apply(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i12 = Theme.key_share_icon;
                        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), PorterDuff.Mode.SRC_IN));
                        linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 16));
                        TextView textView3 = new TextView(context);
                        textView3.setTextColor(getThemedColor(i12));
                        textView3.setTextSize(1, 15.0f);
                        textView3.setGravity(17);
                        textView3.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i = 8;
                    }
                }
                linearLayout2.addView(this.linkContainer, LayoutHelper.createLinear(-1, 42, 1.0f, 23, 11, 0, i, 0));
                if (linearLayout != null) {
                    linearLayout2.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                }
            } else {
                this.pickerBottom = new FrameLayout(context);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.pickerBottomLayout = frameLayout3;
                this.pickerBottom.addView(frameLayout3, LayoutHelper.createFrame(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView4 = new TextView(context);
                int i13 = Theme.key_listSelector;
                textView4.setBackground(Theme.createSelectorDrawable(getThemedColor(i13), 2, AndroidUtilities.dp(22.0f)));
                textView4.setTextColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2));
                textView4.setTextSize(1, 14.0f);
                textView4.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView4.setTypeface(AndroidUtilities.bold());
                textView4.setGravity(17);
                if (this.darkTheme && this.linkToCopy[1] != null) {
                    textView4.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                } else {
                    textView4.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                }
                textView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        this.f$0.lambda$new$13(view3);
                    }
                });
                this.pickerBottomLayout.addView(textView4, LayoutHelper.createFrame(-1, -1, 119));
                this.containerView.addView(this.pickerBottom, LayoutHelper.createFrame(-1, 58, 87));
                ArrayList arrayList5 = this.sendingMessageObjects;
                if (arrayList5 != null && arrayList5.size() > 0 && ((MessageObject) this.sendingMessageObjects.get(0)).messageOwner != null && ((MessageObject) this.sendingMessageObjects.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.sendingMessageObjects.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.sharesCountLayout = linearLayout4;
                        linearLayout4.setOrientation(0);
                        this.sharesCountLayout.setGravity(16);
                        this.sharesCountLayout.setBackground(Theme.createSelectorDrawable(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listSelector : i13), 2, AndroidUtilities.dp(22.0f)));
                        this.pickerBottomLayout.addView(this.sharesCountLayout, LayoutHelper.createFrame(-2, 48.0f, 85, 6.0f, 0.0f, -6.0f, 0.0f));
                        this.sharesCountLayout.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                this.f$0.lambda$new$14(messageObject4, view3);
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2), PorterDuff.Mode.MULTIPLY));
                        this.sharesCountLayout.addView(imageView2, LayoutHelper.createLinear(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView5 = new TextView(context);
                        textView5.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView5.setTextSize(1, 14.0f);
                        textView5.setTextColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2));
                        textView5.setGravity(16);
                        textView5.setTypeface(AndroidUtilities.bold());
                        this.sharesCountLayout.addView(textView5, LayoutHelper.createLinear(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        } else {
            this.shadow[1].setAlpha(0.0f);
        }
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.bulletinContainer = frameLayout4;
        this.containerView.addView(frameLayout4, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.pickerBottomLayout != null ? 48.0f : 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.bulletinContainer2 = frameLayout5;
        this.containerView.addView(frameLayout5, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        AnonymousClass21 anonymousClass21 = new AnonymousClass21(context);
        this.frameLayout2 = anonymousClass21;
        anonymousClass21.setWillNotDraw(false);
        this.frameLayout2.setAlpha(0.0f);
        this.frameLayout2.setVisibility(4);
        this.containerView.addView(this.frameLayout2, LayoutHelper.createFrame(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        this.frameLayout2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                return ShareAlert.lambda$new$15(view3, motionEvent);
            }
        });
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(i7)) > 0.721f);
        AnonymousClass22 anonymousClass22 = new AnonymousClass22(context, this.sizeNotifierFrameLayout, null, 1, true, this.resourcesProvider);
        this.commentTextView = anonymousClass22;
        anonymousClass22.includeNavigationBar = true;
        if (this.darkTheme) {
            EditTextCaption editText = anonymousClass22.getEditText();
            int i14 = Theme.key_voipgroup_nameText;
            editText.setTextColor(getThemedColor(i14));
            this.commentTextView.getEditText().setCursorColor(getThemedColor(i14));
        }
        this.commentTextView.setHint(LocaleController.getString(R.string.ShareComment));
        this.commentTextView.onResume();
        this.commentTextView.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        this.frameLayout2.addView(this.commentTextView, LayoutHelper.createFrame(-1, -2, 51));
        this.frameLayout2.setClipChildren(false);
        this.frameLayout2.setClipToPadding(false);
        this.commentTextView.setClipChildren(false);
        this.commentTextView.getEditText().addTextChangedListener(new AnonymousClass23());
        FrameLayout frameLayout6 = new FrameLayout(context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ShareAlert.this.selectedDialogs.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
            }
        };
        this.writeButtonContainer = frameLayout6;
        frameLayout6.setFocusable(true);
        this.writeButtonContainer.setFocusableInTouchMode(true);
        this.writeButtonContainer.setVisibility(4);
        this.writeButtonContainer.setScaleX(0.2f);
        this.writeButtonContainer.setScaleY(0.2f);
        this.writeButtonContainer.setAlpha(0.0f);
        this.containerView.addView(this.writeButtonContainer, LayoutHelper.createFrame(110, 50, 85));
        ChatActivityEnterView.SendButton sendButton = new ChatActivityEnterView.SendButton(context, R.drawable.send_plane_24, this.resourcesProvider) {
            @Override
            public boolean isInScheduleMode() {
                return false;
            }

            @Override
            public boolean isInactive() {
                return false;
            }

            @Override
            public boolean isOpen() {
                return true;
            }

            @Override
            public boolean shouldDrawBackground() {
                return true;
            }

            @Override
            public int getFillColor() {
                return ShareAlert.this.getThemedColor(Theme.key_dialogFloatingButton);
            }
        };
        this.writeButton = sendButton;
        sendButton.setCircleSize(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(38.0f));
        this.writeButton.setCirclePadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(6.0f));
        ChatActivityEnterView.SendButton sendButton2 = this.writeButton;
        sendButton2.newCounterPos = true;
        this.writeButtonContainer.addView(sendButton2, LayoutHelper.createFrameMatchParent());
        this.writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                this.f$0.lambda$new$16(view3);
            }
        });
        this.writeButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view3) {
                return this.f$0.lambda$new$17(view3);
            }
        });
        this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        if (num != null) {
            this.timestamp = num.intValue();
            this.timestampFrameLayout = new FrameLayout(context);
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.timestampLayout = linearLayout5;
            linearLayout5.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            this.timestampLayout.setClipToPadding(false);
            this.timestampLayout.setOrientation(0);
            this.timestampLayout.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_listSelector), 6, 6));
            CheckBox2 checkBox2 = new CheckBox2(context, 24, this.resourcesProvider);
            this.timestampCheckbox = checkBox2;
            checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
            this.timestampCheckbox.setDrawUnchecked(true);
            this.timestampCheckbox.setChecked(false, false);
            this.timestampCheckbox.setDrawBackgroundAsArc(10);
            this.timestampLayout.addView(this.timestampCheckbox, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
            TextView textView6 = new TextView(context);
            this.timestampTextView = textView6;
            textView6.setTextColor(getThemedColor(i8));
            this.timestampTextView.setTextSize(1, 14.0f);
            this.timestampTextView.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            this.timestampLayout.addView(this.timestampTextView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
            ScaleStateListAnimator.apply(this.timestampLayout, 0.025f, 1.5f);
            this.timestampLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    this.f$0.lambda$new$18(view3);
                }
            });
            this.timestampFrameLayout.addView(this.timestampLayout, LayoutHelper.createFrame(-2, -2, 17));
            if (this.pickerBottom == null) {
                View view3 = new View(context);
                view3.setBackgroundColor(getThemedColor(Theme.key_divider));
                this.timestampFrameLayout.addView(view3, LayoutHelper.createFrame(-1.0f, this.darkTheme ? 0.66f : 1.0f / AndroidUtilities.density, 55));
            }
            this.containerView.addView(this.timestampFrameLayout, LayoutHelper.createFrame(-1, 58, 83));
            if (this.pickerBottom == null) {
                this.timestampFrameLayout.setAlpha(0.0f);
                this.timestampFrameLayout.setVisibility(4);
            }
        }
        this.fadeDrawable = new BlurredBackgroundWithFadeDrawable(this.iBlur3FactoryFade.create(this.bottomFadeView, (BlurredBackgroundColorProvider) null));
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        this.fadeDrawable.setFadeHeight(AndroidUtilities.dp(72.0f), true);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3FactoryFrostedLiquidGlass.create(this.sizeNotifierFrameLayout, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider));
        this.emojiViewChildBg = blurredBackgroundDrawableCreate;
        blurredBackgroundDrawableCreate.enableInAppKeyboardOptimization();
        this.emojiViewChildBg.setRadius(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.emojiViewChildBg.setThickness(AndroidUtilities.dp(32.0f));
        this.emojiViewChildBg.setIntensity(0.4f);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = this.iBlur3FactoryLiquidGlass.create(this.frameLayout2, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider));
        this.captionContainerBg = blurredBackgroundDrawableCreate2;
        blurredBackgroundDrawableCreate2.setRadius(AndroidUtilities.dp(22.0f));
        this.captionContainerBg.setPadding(AndroidUtilities.dp(9.0f));
        this.frameLayout2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout7 = this.pickerBottomLayout;
        if (frameLayout7 != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = this.iBlur3FactoryLiquidGlass.create(frameLayout7, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider));
            blurredBackgroundDrawableCreate3.setPadding(AndroidUtilities.dp(9.0f));
            blurredBackgroundDrawableCreate3.setRadius(AndroidUtilities.dp(22.0f));
            this.pickerBottomLayout.setBackground(blurredBackgroundDrawableCreate3);
            this.pickerBottomLayout.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        FrameLayout frameLayout8 = this.timestampFrameLayout;
        if (frameLayout8 != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate4 = this.iBlur3FactoryLiquidGlass.create(frameLayout8, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider));
            blurredBackgroundDrawableCreate4.setPadding(AndroidUtilities.dp(9.0f));
            blurredBackgroundDrawableCreate4.setRadius(AndroidUtilities.dp(22.0f));
            this.timestampFrameLayout.setBackground(blurredBackgroundDrawableCreate4);
            this.timestampFrameLayout.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        updateSelectedCount(0);
        DialogsActivity.loadDialogs(AccountInstance.getInstance(this.currentAccount));
        if (this.listAdapter.dialogs.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        DialogsSearchAdapter.loadRecentSearch(this.currentAccount, 0, new DialogsSearchAdapter.OnRecentSearchLoaded() {
            @Override
            public void setRecentSearch(ArrayList arrayList6, LongSparseArray longSparseArray) {
                if (arrayList6 != null) {
                    int i15 = 0;
                    while (i15 < arrayList6.size()) {
                        TLObject tLObject = ((DialogsSearchAdapter.RecentSearchObject) arrayList6.get(i15)).object;
                        if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                            arrayList6.remove(i15);
                            i15--;
                        }
                        i15++;
                    }
                }
                ShareAlert.this.recentSearchObjects = arrayList6;
                ShareAlert.this.recentSearchObjectsById = longSparseArray;
                for (int i16 = 0; i16 < ShareAlert.this.recentSearchObjects.size(); i16++) {
                    DialogsSearchAdapter.RecentSearchObject recentSearchObject = (DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i16);
                    TLObject tLObject2 = recentSearchObject.object;
                    if (tLObject2 instanceof TLRPC.User) {
                        MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putUser((TLRPC.User) recentSearchObject.object, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putChat((TLRPC.Chat) recentSearchObject.object, true);
                    } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                        MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putEncryptedChat((TLRPC.EncryptedChat) recentSearchObject.object, true);
                    }
                }
                ShareAlert.this.searchAdapter.notifyDataSetChanged();
            }
        });
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(this.gridView, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, false, 1.0f, false);
        ViewCompat.setOnApplyWindowInsetsListener(getContainer(), new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view4, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.onApplyWindowInsets(view4, windowInsetsCompat);
            }
        });
    }

    public void lambda$new$1(final Context context, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0(tLObject, context);
            }
        });
    }

    public void lambda$new$0(TLObject tLObject, Context context) {
        if (tLObject != null) {
            this.exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject;
            updateLinkTextView();
            if (this.copyLinkOnEnd) {
                copyLink(context);
            }
        }
        this.loadingLink = false;
    }

    public boolean lambda$new$2(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        AndroidUtilities.hideKeyboard(this.searchView.editText);
        return false;
    }

    public void lambda$new$3() {
        this.updateSearchAdapter = true;
        this.searchView.editText.setText("");
        AndroidUtilities.showKeyboard(this.searchView.editText);
    }

    public static Integer lambda$new$4(Integer num) {
        return 0;
    }

    public void lambda$new$5(View view, int i) {
        if (this.shareTopicsAdapter.isBotForum && i == 1) {
            onTopicCreateCellClick();
            return;
        }
        TLRPC.TL_forumTopic itemTopic = this.shareTopicsAdapter.getItemTopic(i);
        if (itemTopic != null) {
            onTopicCellClick(itemTopic);
        }
    }

    public static Integer lambda$new$6(Integer num) {
        return 0;
    }

    public void lambda$new$7(View view, int i) {
        TLRPC.Dialog item;
        if (i >= 0 && (item = this.listAdapter.getItem(i)) != null) {
            selectDialog(view, item);
        }
    }

    public static Integer lambda$new$8(Integer num) {
        return 0;
    }

    public void lambda$new$9(View view, int i) {
        TLRPC.Dialog item;
        if (i >= 0 && (item = this.searchAdapter.getItem(i)) != null) {
            selectDialog(view, item);
        }
    }

    public void lambda$new$10(View view) {
        if (this.selectedDialogs.size() == 0) {
            if (this.isChannel || this.linkToCopy[0] != null) {
                lambda$new$0();
                PhotoViewer.getInstance().closePhoto(true, false);
                if (this.linkToCopy[0] == null && this.loadingLink) {
                    this.copyLinkOnEnd = true;
                    Toast.makeText(getContext(), LocaleController.getString(R.string.Loading), 0).show();
                } else {
                    copyLink(getContext());
                }
            }
        }
    }

    public void lambda$new$11(View view) {
        if (this.selectedDialogs.size() == 0) {
            if (this.isChannel || this.linkToCopy[0] != null) {
                lambda$new$0();
                if (this.linkToCopy[0] == null && this.loadingLink) {
                    this.copyLinkOnEnd = true;
                    Toast.makeText(getContext(), LocaleController.getString(R.string.Loading), 0).show();
                } else {
                    copyLink(getContext());
                }
            }
        }
    }

    public void lambda$new$12(MessageObject messageObject, View view) {
        BaseFragment safeLastFragment = this.parentFragment;
        if (safeLastFragment == null) {
            safeLastFragment = LaunchActivity.getSafeLastFragment();
        }
        if (safeLastFragment == null) {
            return;
        }
        lambda$new$0();
        safeLastFragment.presentFragment(new MessageStatisticActivity(messageObject));
    }

    public void lambda$new$13(View view) {
        if (this.selectedDialogs.size() == 0) {
            if (this.isChannel || this.linkToCopy[0] != null) {
                lambda$new$0();
                if (this.linkToCopy[0] == null && this.loadingLink) {
                    this.copyLinkOnEnd = true;
                    Toast.makeText(getContext(), LocaleController.getString(R.string.Loading), 0).show();
                } else {
                    copyLink(getContext());
                }
            }
        }
    }

    public void lambda$new$14(MessageObject messageObject, View view) {
        BaseFragment safeLastFragment = this.parentFragment;
        if (safeLastFragment == null) {
            safeLastFragment = LaunchActivity.getSafeLastFragment();
        }
        if (safeLastFragment == null) {
            return;
        }
        lambda$new$0();
        safeLastFragment.presentFragment(new MessageStatisticActivity(messageObject));
    }

    class AnonymousClass21 extends FrameLayout {
        AnonymousClass21(Context context) {
            super(context);
        }

        @Override
        public void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0) {
                ShareAlert.this.shadow[1].setTranslationY(0.0f);
            }
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (ShareAlert.this.chatActivityEnterViewAnimateFromTop != 0.0f && ShareAlert.this.chatActivityEnterViewAnimateFromTop != ShareAlert.this.frameLayout2.getTop() + ShareAlert.this.chatActivityEnterViewAnimateFromTop) {
                if (ShareAlert.this.topBackgroundAnimator != null) {
                    ShareAlert.this.topBackgroundAnimator.cancel();
                }
                ShareAlert shareAlert = ShareAlert.this;
                shareAlert.captionEditTextTopOffset = shareAlert.chatActivityEnterViewAnimateFromTop - (ShareAlert.this.frameLayout2.getTop() + ShareAlert.this.captionEditTextTopOffset);
                ShareAlert shareAlert2 = ShareAlert.this;
                shareAlert2.topBackgroundAnimator = ValueAnimator.ofFloat(shareAlert2.captionEditTextTopOffset, 0.0f);
                ShareAlert.this.topBackgroundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$onDraw$0(valueAnimator);
                    }
                });
                ShareAlert.this.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ShareAlert.this.topBackgroundAnimator.setDuration(200L);
                ShareAlert.this.topBackgroundAnimator.start();
                ShareAlert.this.chatActivityEnterViewAnimateFromTop = 0.0f;
            }
            ShareAlert.this.shadow[1].setTranslationY((-(ShareAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + ShareAlert.this.captionEditTextTopOffset + ShareAlert.this.currentPanTranslationY + ((ShareAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(48.0f)) * (1.0f - getAlpha())));
        }

        public void lambda$onDraw$0(ValueAnimator valueAnimator) {
            ShareAlert.this.captionEditTextTopOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ShareAlert.this.frameLayout2.invalidate();
            invalidate();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            ShareAlert.this.captionContainerBg.setBounds(0, (int) ShareAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            ShareAlert.this.captionContainerBg.draw(canvas);
            canvas.save();
            canvas.clipRect(0.0f, ShareAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    class AnonymousClass22 extends EditTextEmoji {
        private ValueAnimator messageEditTextAnimator;
        private int messageEditTextPredrawHeigth;
        private int messageEditTextPredrawScrollY;
        private boolean shouldAnimateEditTextWithBounds;

        AnonymousClass22(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context, sizeNotifierFrameLayout, baseFragment, i, z, resourcesProvider);
        }

        @Override
        protected void bottomPanelTranslationY(float f) {
            super.bottomPanelTranslationY(f);
            ShareAlert.this.updateBottomOverlay();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (this.shouldAnimateEditTextWithBounds) {
                final EditTextCaption editText = ShareAlert.this.commentTextView.getEditText();
                editText.setOffsetY(editText.getOffsetY() - ((this.messageEditTextPredrawHeigth - editText.getMeasuredHeight()) + (this.messageEditTextPredrawScrollY - editText.getScrollY())));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ShareAlert.AnonymousClass22.lambda$dispatchDraw$0(editText, valueAnimator);
                    }
                });
                ValueAnimator valueAnimator = this.messageEditTextAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.messageEditTextAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                valueAnimatorOfFloat.start();
                this.shouldAnimateEditTextWithBounds = false;
            }
            super.dispatchDraw(canvas);
        }

        public static void lambda$dispatchDraw$0(EditTextCaption editTextCaption, ValueAnimator valueAnimator) {
            editTextCaption.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override
        protected void onLineCountChanged(int i, int i2) {
            if (!TextUtils.isEmpty(getEditText().getText())) {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = getEditText().getMeasuredHeight();
                this.messageEditTextPredrawScrollY = getEditText().getScrollY();
                invalidate();
            } else {
                getEditText().animate().cancel();
                getEditText().setOffsetY(0.0f);
                this.shouldAnimateEditTextWithBounds = false;
            }
            ShareAlert shareAlert = ShareAlert.this;
            shareAlert.chatActivityEnterViewAnimateFromTop = shareAlert.frameLayout2.getTop() + ShareAlert.this.captionEditTextTopOffset;
            ShareAlert.this.frameLayout2.invalidate();
        }

        @Override
        protected void showPopup(int i) {
            super.showPopup(i);
        }

        @Override
        public void hidePopup(boolean z) {
            super.hidePopup(z);
        }

        @Override
        protected void createEmojiView() {
            super.createEmojiView();
            EmojiView emojiView = getEmojiView();
            if (emojiView != null) {
                emojiView.shouldLightenBackground = false;
                emojiView.fixBottomTabContainerTranslation = false;
                emojiView.setShouldDrawBackground(false);
                emojiView.setBottomInset(ShareAlert.this.systemInsets.bottom);
            }
            FrameLayout frameLayout = ShareAlert.this.timestampFrameLayout;
            if (frameLayout != null) {
                frameLayout.bringToFront();
            }
            if (ShareAlert.this.frameLayout2 != null) {
                ShareAlert.this.frameLayout2.bringToFront();
            }
            if (ShareAlert.this.writeButtonContainer != null) {
                ShareAlert.this.writeButtonContainer.bringToFront();
            }
        }
    }

    class AnonymousClass23 implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        AnonymousClass23() {
        }

        @Override
        public void afterTextChanged(Editable editable) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$afterTextChanged$0();
                }
            });
        }

        public void lambda$afterTextChanged$0() {
            ShareAlert.this.updateSelectedCount(1);
        }
    }

    public void lambda$new$16(View view) {
        sendInternal(true);
    }

    public boolean lambda$new$17(View view) {
        return onSendLongClick(this.writeButton);
    }

    public void lambda$new$18(View view) {
        CheckBox2 checkBox2 = this.timestampCheckbox;
        checkBox2.setChecked(!checkBox2.isChecked(), true);
        updateLinkTextView();
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        processLegacyContainerInsets(windowInsetsCompat.toWindowInsets());
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        if (!this.systemInsets.equals(insets)) {
            this.systemInsets = insets;
            this.container.requestLayout();
        }
        return WindowInsetsCompat.CONSUMED;
    }

    public void showPremiumBlockedToast(View view, long j) {
        String userName;
        Bulletin bulletinCreateSimpleBulletin;
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(view, i);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j < 0) {
            userName = "";
        } else {
            userName = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
        }
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            bulletinCreateSimpleBulletin = BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)));
        } else {
            bulletinCreateSimpleBulletin = BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showPremiumBlockedToast$20();
                }
            });
        }
        bulletinCreateSimpleBulletin.show();
    }

    public void lambda$showPremiumBlockedToast$20() {
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ShareAlert.lambda$showPremiumBlockedToast$19();
            }
        };
        if (isKeyboardVisible()) {
            FragmentSearchField fragmentSearchField = this.searchView;
            if (fragmentSearchField != null) {
                AndroidUtilities.hideKeyboard(fragmentSearchField.editText);
            }
            AndroidUtilities.runOnUIThread(runnable, 300L);
            return;
        }
        runnable.run();
    }

    public static void lambda$showPremiumBlockedToast$19() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(new PremiumPreviewFragment("noncontacts"), bottomSheetParams);
        }
    }

    public void selectDialog(View view, final TLRPC.Dialog dialog) {
        DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapterRecycler;
        int i;
        if (dialog instanceof ShareDialogsAdapter.MyStoryDialog) {
            onShareStory(view);
            return;
        }
        if (dialog != null && (((view instanceof ShareDialogCell) && ((ShareDialogCell) view).isBlocked()) || ((view instanceof ProfileSearchCell) && ((ProfileSearchCell) view).isBlocked()))) {
            showPremiumBlockedToast(view, dialog.id);
            return;
        }
        if (this.topicsGridView.getVisibility() != 8 || this.parentActivity == null) {
            return;
        }
        if (DialogObject.isChatDialog(dialog.id)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || (i = this.hasPoll) == 2 || i == 3)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.parentActivity);
                builder.setTitle(LocaleController.getString(R.string.SendMessageTitle));
                int i2 = this.hasPoll;
                if (i2 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedTodoAll));
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedTodo));
                    }
                } else if (i2 == 2) {
                    if (this.isChannel) {
                        builder.setMessage(LocaleController.getString(R.string.PublicPollCantForward));
                    } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPollsAll));
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPolls));
                    }
                } else {
                    builder.setMessage(LocaleController.getString(R.string.ChannelCantSendMessage));
                }
                builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                builder.show();
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && this.hasPoll != 0) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this.parentActivity);
            builder2.setTitle(LocaleController.getString(R.string.SendMessageTitle));
            int i3 = this.hasPoll;
            if (i3 == 3) {
                builder2.setMessage(LocaleController.getString(R.string.TodoCantForwardSecretChat));
            } else if (i3 != 0) {
                builder2.setMessage(LocaleController.getString(R.string.PollCantForwardSecretChat));
            } else {
                builder2.setMessage(LocaleController.getString(R.string.InvoiceCantForwardSecretChat));
            }
            builder2.setNegativeButton(LocaleController.getString(R.string.OK), null);
            builder2.show();
            return;
        }
        if (this.selectedDialogs.indexOfKey(dialog.id) >= 0) {
            this.selectedDialogs.remove(dialog.id);
            this.selectedDialogTopics.remove(dialog);
            if (view instanceof ProfileSearchCell) {
                ((ProfileSearchCell) view).setChecked(false, true);
            } else if (view instanceof ShareDialogCell) {
                ((ShareDialogCell) view).setChecked(false, true);
            }
            updateSelectedCount(1);
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (isBotForumWithNotEmptyTopics(user) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.selectedTopicDialog = dialog;
                this.topicsLayoutManager.scrollToPositionWithOffset(0, this.scrollOffsetY - this.topicsGridView.getPaddingTop());
                final AtomicReference atomicReference = new AtomicReference();
                final AnonymousClass27 anonymousClass27 = new AnonymousClass27(dialog, atomicReference, view);
                atomicReference.set(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$selectDialog$21(atomicReference, anonymousClass27, dialog);
                    }
                });
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i4 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(anonymousClass27, i4);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    anonymousClass27.didReceivedNotification(i4, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            this.selectedDialogs.put(dialog.id, dialog);
            if (view instanceof ProfileSearchCell) {
                ((ProfileSearchCell) view).setChecked(true, true);
            } else if (view instanceof ShareDialogCell) {
                ((ShareDialogCell) view).setChecked(true, true);
            }
            updateSelectedCount(2);
            long j = UserConfig.getInstance(this.currentAccount).clientUserId;
            if (this.searchIsVisible) {
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.listAdapter.dialogsMap.get(dialog.id);
                if (dialog2 == null) {
                    this.listAdapter.dialogsMap.put(dialog.id, dialog);
                    this.listAdapter.dialogs.add(1 ^ (this.listAdapter.dialogs.isEmpty() ? 1 : 0), dialog);
                } else if (dialog2.id != j) {
                    this.listAdapter.dialogs.remove(dialog2);
                    this.listAdapter.dialogs.add(1 ^ (this.listAdapter.dialogs.isEmpty() ? 1 : 0), dialog2);
                }
                this.listAdapter.notifyDataSetChanged();
                this.updateSearchAdapter = false;
                this.searchView.editText.setText("");
                checkCurrentList(false);
                AndroidUtilities.hideKeyboard(this.searchView.editText);
            }
        }
        ShareSearchAdapter shareSearchAdapter = this.searchAdapter;
        if (shareSearchAdapter == null || (categoryAdapterRecycler = shareSearchAdapter.categoryAdapter) == null) {
            return;
        }
        categoryAdapterRecycler.notifyItemRangeChanged(0, categoryAdapterRecycler.getItemCount());
    }

    class AnonymousClass27 implements NotificationCenter.NotificationCenterDelegate {
        final View val$cell;
        final TLRPC.Dialog val$dialog;
        final AtomicReference val$timeoutRef;

        AnonymousClass27(TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
            this.val$dialog = dialog;
            this.val$timeoutRef = atomicReference;
            this.val$cell = view;
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (((Long) objArr[0]).longValue() == (-this.val$dialog.id)) {
                boolean z = (ShareAlert.this.shareTopicsAdapter.topics == null && MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getTopicsController().getTopics(-this.val$dialog.id) != null) || this.val$timeoutRef.get() == null;
                ShareAlert.this.shareTopicsAdapter.topics = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getTopicsController().getTopics(-this.val$dialog.id);
                ShareAlert.this.shareTopicsAdapter.isBotForum = UserObject.isBotForum(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id);
                ShareAlert.this.shareTopicsAdapter.isBotForumWithManageTopics = UserObject.isBotForumWithEditableTopics(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id);
                if (z) {
                    ShareAlert.this.shareTopicsAdapter.notifyDataSetChanged();
                }
                if (ShareAlert.this.shareTopicsAdapter.topics != null) {
                    NotificationCenter.getInstance(((BottomSheet) ShareAlert.this).currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
                }
                if (z) {
                    ShareAlert.this.topicsGridView.setVisibility(0);
                    ShareAlert.this.topicsGridView.setAlpha(0.0f);
                    ShareAlert.this.topicsBackActionBar.setVisibility(0);
                    ShareAlert.this.topicsBackActionBar.setAlpha(0.0f);
                    if (!UserObject.isBotForum(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id)) {
                        if (ChatObject.isMonoForum(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id)) {
                            ShareAlert shareAlert = ShareAlert.this;
                            shareAlert.topicsBackActionBar.setTitle(ForumUtilities.getMonoForumTitle(((BottomSheet) shareAlert).currentAccount, MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(-this.val$dialog.id))));
                            ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                        } else {
                            ShareAlert shareAlert2 = ShareAlert.this;
                            shareAlert2.topicsBackActionBar.setTitle(MessagesController.getInstance(((BottomSheet) shareAlert2).currentAccount).getChat(Long.valueOf(-this.val$dialog.id)).title);
                            ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectTopic));
                        }
                    } else {
                        ShareAlert shareAlert3 = ShareAlert.this;
                        shareAlert3.topicsBackActionBar.setTitle(DialogObject.getShortName(MessagesController.getInstance(((BottomSheet) shareAlert3).currentAccount).getUser(Long.valueOf(this.val$dialog.id))));
                        ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                    }
                    ShareAlert shareAlert4 = ShareAlert.this;
                    shareAlert4.searchWasVisibleBeforeTopics = shareAlert4.searchIsVisible;
                    if (ShareAlert.this.topicsAnimation != null) {
                        ShareAlert.this.topicsAnimation.cancel();
                    }
                    final int[] iArr = new int[2];
                    ShareAlert.this.topicsAnimation = new SpringAnimation(new FloatValueHolder(0.0f)).setSpring(new SpringForce(1000.0f).setStiffness((ShareAlert.this.parentFragment == null || !ShareAlert.this.parentFragment.shareAlertDebugTopicsSlowMotion) ? 800.0f : 10.0f).setDampingRatio(1.0f));
                    SpringAnimation springAnimation = ShareAlert.this.topicsAnimation;
                    final View view = this.val$cell;
                    springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                            this.f$0.lambda$didReceivedNotification$0(view, iArr, dynamicAnimation, f, f2);
                        }
                    });
                    ShareAlert.this.topicsAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                        @Override
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                            this.f$0.lambda$didReceivedNotification$1(dynamicAnimation, z2, f, f2);
                        }
                    });
                    ShareAlert.this.topicsAnimation.start();
                    if (this.val$timeoutRef.get() != null) {
                        AndroidUtilities.cancelRunOnUIThread((Runnable) this.val$timeoutRef.get());
                        this.val$timeoutRef.set(null);
                    }
                }
            }
        }

        public void lambda$didReceivedNotification$0(View view, int[] iArr, DynamicAnimation dynamicAnimation, float f, float f2) {
            ShareAlert.this.invalidateTopicsAnimation(view, iArr, f / 1000.0f);
        }

        public void lambda$didReceivedNotification$1(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            ShareAlert.this.gridView.setVisibility(8);
            ShareAlert.this.searchGridView.setVisibility(8);
            ShareAlert.this.searchView.setVisibility(8);
            ShareAlert.this.topicsAnimation = null;
        }
    }

    public void lambda$selectDialog$21(AtomicReference atomicReference, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        notificationCenterDelegate.didReceivedNotification(NotificationCenter.topicsDidLoaded, this.currentAccount, Long.valueOf(-dialog.id));
    }

    private boolean isBotForumWithNotEmptyTopics(TLRPC.User user) {
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id);
        return ((topics == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id)) ? false : true;
    }

    private void collapseTopics() {
        TLRPC.Dialog dialog = this.selectedTopicDialog;
        if (dialog == null) {
            return;
        }
        final View view = null;
        this.selectedTopicDialog = null;
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if ((childAt instanceof ShareDialogCell) && ((ShareDialogCell) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        SpringAnimation springAnimation = this.topicsAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        getMainGridView().setVisibility(0);
        this.searchView.setVisibility(0);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            this.sizeNotifierFrameLayout.adjustPanLayoutHelper.ignoreOnce();
            this.searchView.editText.requestFocus();
            AndroidUtilities.showKeyboard(this.searchView.editText);
        }
        final int[] iArr = new int[2];
        SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(1000.0f));
        SpringForce springForce = new SpringForce(0.0f);
        ChatActivity chatActivity = this.parentFragment;
        SpringAnimation spring = springAnimation2.setSpring(springForce.setStiffness((chatActivity == null || !chatActivity.shareAlertDebugTopicsSlowMotion) ? 800.0f : 10.0f).setDampingRatio(1.0f));
        this.topicsAnimation = spring;
        spring.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                this.f$0.lambda$collapseTopics$22(view, iArr, dynamicAnimation, f, f2);
            }
        });
        this.topicsAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                this.f$0.lambda$collapseTopics$23(dynamicAnimation, z, f, f2);
            }
        });
        this.topicsAnimation.start();
    }

    public void lambda$collapseTopics$22(View view, int[] iArr, DynamicAnimation dynamicAnimation, float f, float f2) {
        invalidateTopicsAnimation(view, iArr, f / 1000.0f);
    }

    public void lambda$collapseTopics$23(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.topicsGridView.setVisibility(8);
        this.topicsBackActionBar.setVisibility(8);
        this.shareTopicsAdapter.topics = null;
        this.shareTopicsAdapter.notifyDataSetChanged();
        this.topicsAnimation = null;
        this.searchWasVisibleBeforeTopics = false;
    }

    public void invalidateTopicsAnimation(View view, int[] iArr, float f) {
        this.topicsGridView.setPivotX(view.getX() + (view.getWidth() / 2.0f));
        this.topicsGridView.setPivotY(view.getY() + (view.getHeight() / 2.0f));
        float f2 = 0.25f * f;
        float f3 = 0.75f + f2;
        this.topicsGridView.setScaleX(f3);
        this.topicsGridView.setScaleY(f3);
        this.topicsGridView.setAlpha(f);
        RecyclerListView mainGridView = getMainGridView();
        mainGridView.setPivotX(view.getX() + (view.getWidth() / 2.0f));
        mainGridView.setPivotY(view.getY() + (view.getHeight() / 2.0f));
        float f4 = f2 + 1.0f;
        mainGridView.setScaleX(f4);
        mainGridView.setScaleY(f4);
        float f5 = 1.0f - f;
        mainGridView.setAlpha(f5);
        FragmentSearchField fragmentSearchField = this.searchView;
        fragmentSearchField.setPivotX(fragmentSearchField.getWidth() / 2.0f);
        this.searchView.setPivotY(0.0f);
        float f6 = (0.1f * f5) + 0.9f;
        this.searchView.setScaleX(f6);
        this.searchView.setScaleY(f6);
        this.searchView.setAlpha(f5);
        this.topicsBackActionBar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f5);
        this.topicsBackActionBar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f5);
        this.topicsBackActionBar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f5);
        this.topicsBackActionBar.setAlpha(f);
        this.topicsGridView.getLocationInWindow(iArr);
        float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f);
        for (int i = 0; i < mainGridView.getChildCount(); i++) {
            View childAt = mainGridView.getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f5);
                }
            }
        }
        for (int i2 = 0; i2 < this.topicsGridView.getChildCount(); i2++) {
            View childAt2 = this.topicsGridView.getChildAt(i2);
            if (childAt2 instanceof ShareTopicCell) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) (((double) (-(childAt2.getX() - view.getX()))) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (((double) (-((childAt2.getY() + this.topicsGridView.getTranslationY()) - view.getY()))) * Math.pow(d, 2.0d)));
            }
        }
        this.containerView.requestLayout();
        mainGridView.invalidate();
    }

    @Override
    public int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.containerViewTop;
    }

    private boolean onSendLongClick(View view) {
        int measuredHeight;
        ChatActivity chatActivity;
        if (this.parentActivity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        if (this.sendingMessageObjects != null) {
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity, this.resourcesProvider);
            if (this.darkTheme) {
                actionBarPopupWindowLayout.setBackgroundColor(getThemedColor(Theme.key_voipgroup_inviteMembersBackground));
            }
            actionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindowLayout.setOnTouchListener(new View.OnTouchListener() {
                private Rect popupRect = new Rect();

                @Override
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() != 0 || ShareAlert.this.sendPopupWindow == null || !ShareAlert.this.sendPopupWindow.isShowing()) {
                        return false;
                    }
                    view2.getHitRect(this.popupRect);
                    if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        return false;
                    }
                    ShareAlert.this.sendPopupWindow.dismiss();
                    return false;
                }
            });
            actionBarPopupWindowLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
                @Override
                public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                    this.f$0.lambda$onSendLongClick$24(keyEvent);
                }
            });
            actionBarPopupWindowLayout.setShownFromBottom(false);
            final ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), true, true, false, this.resourcesProvider);
            if (this.darkTheme) {
                actionBarMenuSubItem.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            }
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.ShowSendersName), 0);
            this.showSendersName = true;
            actionBarMenuSubItem.setChecked(true);
            final ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(getContext(), true, false, true, this.resourcesProvider);
            if (this.darkTheme) {
                actionBarMenuSubItem2.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            }
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem2, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.HideSendersName), 0);
            actionBarMenuSubItem2.setChecked(!this.showSendersName);
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$onSendLongClick$25(actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                }
            });
            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$onSendLongClick$26(actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                }
            });
            actionBarPopupWindowLayout.setupRadialSelectors(getThemedColor(Theme.key_dialogButtonSelector));
            linearLayout.addView(actionBarPopupWindowLayout, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, -8.0f));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity, this.resourcesProvider);
        if (this.darkTheme) {
            actionBarPopupWindowLayout2.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_inviteMembersBackground));
        }
        actionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindowLayout2.setOnTouchListener(new View.OnTouchListener() {
            private Rect popupRect = new Rect();

            @Override
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0 || ShareAlert.this.sendPopupWindow == null || !ShareAlert.this.sendPopupWindow.isShowing()) {
                    return false;
                }
                view2.getHitRect(this.popupRect);
                if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                ShareAlert.this.sendPopupWindow.dismiss();
                return false;
            }
        });
        actionBarPopupWindowLayout2.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
            @Override
            public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                this.f$0.lambda$onSendLongClick$27(keyEvent);
            }
        });
        actionBarPopupWindowLayout2.setShownFromBottom(false);
        ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(getContext(), true, true, this.resourcesProvider);
        if (this.darkTheme) {
            actionBarMenuSubItem3.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            actionBarMenuSubItem3.setIconColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        }
        actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off);
        actionBarMenuSubItem3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindowLayout2.addView((View) actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$onSendLongClick$28(view2);
            }
        });
        ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(getContext(), true, true, this.resourcesProvider);
        if (this.darkTheme) {
            actionBarMenuSubItem4.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            actionBarMenuSubItem4.setIconColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        }
        actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send);
        actionBarMenuSubItem4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindowLayout2.addView((View) actionBarMenuSubItem4, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$onSendLongClick$29(view2);
            }
        });
        actionBarPopupWindowLayout2.setupRadialSelectors(getThemedColor(Theme.key_dialogButtonSelector));
        linearLayout.addView(actionBarPopupWindowLayout2, LayoutHelper.createLinear(-1, -2));
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(linearLayout, -2, -2);
        this.sendPopupWindow = actionBarPopupWindow;
        actionBarPopupWindow.setAnimationEnabled(false);
        this.sendPopupWindow.setAnimationStyle(R.style.PopupContextAnimation2);
        this.sendPopupWindow.setOutsideTouchable(true);
        this.sendPopupWindow.setClippingEnabled(true);
        this.sendPopupWindow.setInputMethodMode(2);
        this.sendPopupWindow.setSoftInputMode(0);
        this.sendPopupWindow.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.sendPopupWindow.setFocusable(true);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        if (this.keyboardVisible && (chatActivity = this.parentFragment) != null && chatActivity.contentView.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = iArr[1] + view.getMeasuredHeight();
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        this.sendPopupWindow.showAtLocation(view, 51, ((iArr[0] + view.getMeasuredWidth()) - linearLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f), measuredHeight);
        this.sendPopupWindow.dimBehind();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public void lambda$onSendLongClick$24(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$onSendLongClick$25(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, View view) {
        this.showSendersName = true;
        actionBarMenuSubItem.setChecked(true);
        actionBarMenuSubItem2.setChecked(!this.showSendersName);
    }

    public void lambda$onSendLongClick$26(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, View view) {
        this.showSendersName = false;
        actionBarMenuSubItem.setChecked(false);
        actionBarMenuSubItem2.setChecked(!this.showSendersName);
    }

    public void lambda$onSendLongClick$27(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$onSendLongClick$28(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        sendInternal(false);
    }

    public void lambda$onSendLongClick$29(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        sendInternal(true);
    }

    protected void sendInternal(final boolean z) {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.selectedDialogs.size(); i4++) {
            if (AlertsCreator.checkSlowMode(getContext(), this.currentAccount, this.selectedDialogs.keyAt(i4), this.frameLayout2.getTag() != null && this.commentTextView.length() > 0)) {
                return;
            }
        }
        final CharSequence[] charSequenceArr = {this.commentTextView.getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CheckBox2 checkBox2 = this.timestampCheckbox;
        final int i5 = (checkBox2 == null || !checkBox2.isChecked()) ? -1 : this.timestamp;
        ArrayList arrayList = new ArrayList();
        if (this.sendingMessageObjects != null) {
            i2 = 0;
            while (i3 < this.selectedDialogs.size()) {
                long jKeyAt = this.selectedDialogs.keyAt(i3);
                long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(jKeyAt);
                if (sendPaidMessagesStars <= 0) {
                    sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(jKeyAt));
                }
                if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && sendPaidMessagesStars > 0) {
                    i2++;
                }
                if (sendPaidMessagesStars > 0) {
                    i2++;
                }
                if (sendPaidMessagesStars > 0 && !arrayList.contains(Long.valueOf(jKeyAt))) {
                    arrayList.add(Long.valueOf(jKeyAt));
                }
                i3++;
            }
        } else {
            SwitchView switchView = this.switchView;
            int i6 = switchView != null ? switchView.currentTab : 0;
            if (this.storyItem != null) {
                i = 0;
                for (int i7 = 0; i7 < this.selectedDialogs.size(); i7++) {
                    long jKeyAt2 = this.selectedDialogs.keyAt(i7);
                    long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(jKeyAt2);
                    if (sendPaidMessagesStars2 <= 0) {
                        sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(jKeyAt2));
                    }
                    if (this.storyItem != null && this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
                        i++;
                    }
                    if (sendPaidMessagesStars2 > 0) {
                        i++;
                    }
                    if (sendPaidMessagesStars2 > 0 && !arrayList.contains(Long.valueOf(jKeyAt2))) {
                        arrayList.add(Long.valueOf(jKeyAt2));
                    }
                }
            } else if (this.sendingText[i6] != null) {
                i2 = 0;
                while (i3 < this.selectedDialogs.size()) {
                    long jKeyAt3 = this.selectedDialogs.keyAt(i3);
                    long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(jKeyAt3);
                    if (sendPaidMessagesStars3 <= 0) {
                        sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(jKeyAt3));
                    }
                    if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && sendPaidMessagesStars3 > 0) {
                        i2++;
                    }
                    if (sendPaidMessagesStars3 > 0) {
                        i2++;
                    }
                    if (sendPaidMessagesStars3 > 0 && !arrayList.contains(Long.valueOf(jKeyAt3))) {
                        arrayList.add(Long.valueOf(jKeyAt3));
                    }
                    i3++;
                }
            } else {
                i = 0;
            }
            AlertsCreator.ensurePaidMessagesMultiConfirmation(this.currentAccount, arrayList, i, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$sendInternal$30(charSequenceArr, entities, z, i5, (HashMap) obj);
                }
            });
        }
        i = i2;
        AlertsCreator.ensurePaidMessagesMultiConfirmation(this.currentAccount, arrayList, i, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$sendInternal$30(charSequenceArr, entities, z, i5, (HashMap) obj);
            }
        });
    }

    public void lambda$sendInternal$30(CharSequence[] charSequenceArr, ArrayList arrayList, boolean z, int i, HashMap map) {
        boolean z2;
        long j;
        char c;
        MessageObject messageObject;
        long j2;
        SendMessagesHelper.SendMessageParams sendMessageParamsOf;
        TLRPC.TL_forumTopic tL_forumTopic = null;
        long peerDialogId = 0;
        Long l = 0L;
        ?? r8 = 0;
        if (this.sendingMessageObjects != null) {
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            boolean z3 = false;
            while (i2 < this.selectedDialogs.size()) {
                long jKeyAt = this.selectedDialogs.keyAt(i2);
                boolean zIsMonoForum = MessagesController.getInstance(this.currentAccount).isMonoForum(jKeyAt);
                Long l2 = map == null ? l : (Long) map.get(Long.valueOf(jKeyAt));
                if (l2 != null && l2.longValue() > peerDialogId) {
                    z3 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) this.selectedDialogTopics.get(this.selectedDialogs.get(jKeyAt));
                if (tL_forumTopic2 != null && zIsMonoForum) {
                    peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                }
                MessageObject messageObject2 = (tL_forumTopic2 == null || zIsMonoForum) ? null : new MessageObject(this.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                if (messageObject2 != null) {
                    messageObject2.isTopicMainMessage = true;
                }
                if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0) {
                    CharSequence charSequence = charSequenceArr[0];
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf2 = SendMessagesHelper.SendMessageParams.of(charSequence == null ? null : charSequence.toString(), jKeyAt, messageObject2, messageObject2, null, true, arrayList, null, null, z, 0, 0, null, false);
                    sendMessageParamsOf2.payStars = l2 == null ? 0L : l2.longValue();
                    sendMessageParamsOf2.monoForumPeer = peerDialogId;
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf2);
                }
                int iSendMessage = SendMessagesHelper.getInstance(this.currentAccount).sendMessage(this.sendingMessageObjects, jKeyAt, !this.showSendersName, false, z, 0, 0, messageObject2, i, l2 == null ? 0L : l2.longValue(), peerDialogId, null);
                if (iSendMessage != 0) {
                    arrayList2.add(Long.valueOf(jKeyAt));
                }
                if (this.selectedDialogs.size() == 1) {
                    AlertsCreator.showSendMediaAlert(iSendMessage, this.parentFragment, null);
                    if (iSendMessage != 0) {
                        break;
                    }
                }
                i2++;
                peerDialogId = 0;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Long) it.next()).longValue();
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.selectedDialogs.get(jLongValue);
                this.selectedDialogs.remove(jLongValue);
                if (dialog != null) {
                    this.selectedDialogTopics.remove(dialog);
                }
            }
            if (!this.selectedDialogs.isEmpty()) {
                onSend(this.selectedDialogs, this.sendingMessageObjects.size(), this.selectedDialogs.size() == 1 ? (TLRPC.TL_forumTopic) this.selectedDialogTopics.get(this.selectedDialogs.valueAt(0)) : null, true ^ z3);
            }
        } else {
            SwitchView switchView = this.switchView;
            int i3 = switchView != null ? switchView.currentTab : 0;
            if (this.storyItem != null) {
                int i4 = 0;
                z2 = false;
                while (i4 < this.selectedDialogs.size()) {
                    long jKeyAt2 = this.selectedDialogs.keyAt(i4);
                    boolean zIsMonoForum2 = MessagesController.getInstance(this.currentAccount).isMonoForum(jKeyAt2);
                    Long l3 = map == null ? l : (Long) map.get(Long.valueOf(jKeyAt2));
                    if (l3 != null && l3.longValue() > 0) {
                        z2 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) this.selectedDialogTopics.get(this.selectedDialogs.get(jKeyAt2));
                    long peerDialogId2 = (tL_forumTopic3 == null || !zIsMonoForum2) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    Object messageObject3 = (tL_forumTopic3 == null || zIsMonoForum2) ? tL_forumTopic : new MessageObject(this.currentAccount, tL_forumTopic3.topicStartMessage, r8, r8);
                    if (this.storyItem == null) {
                        if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0) {
                            CharSequence charSequence2 = charSequenceArr[r8];
                            sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? tL_forumTopic : charSequence2.toString(), jKeyAt2, messageObject3, messageObject3, null, true, arrayList, null, null, z, 0, 0, null, false);
                        } else {
                            sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(this.sendingText[i3], jKeyAt2, messageObject3, messageObject3, null, true, null, null, null, z, 0, 0, null, false);
                        }
                    } else {
                        if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && charSequenceArr[r8] != null) {
                            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[r8].toString(), jKeyAt2, null, messageObject3, null, true, null, null, null, z, 0, 0, null, false));
                        }
                        sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(null, jKeyAt2, messageObject3, messageObject3, null, true, null, null, null, z, 0, 0, null, false);
                        sendMessageParamsOf.sendingStory = this.storyItem;
                    }
                    sendMessageParamsOf.payStars = l3 == null ? 0L : l3.longValue();
                    sendMessageParamsOf.monoForumPeer = peerDialogId2;
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
                    i4++;
                    tL_forumTopic = null;
                    r8 = 0;
                }
            } else if (this.sendingText[i3] != null) {
                int i5 = 0;
                z2 = false;
                while (i5 < this.selectedDialogs.size()) {
                    long jKeyAt3 = this.selectedDialogs.keyAt(i5);
                    boolean zIsMonoForum3 = MessagesController.getInstance(this.currentAccount).isMonoForum(jKeyAt3);
                    Long l4 = map == null ? l : (Long) map.get(Long.valueOf(jKeyAt3));
                    if (l4 != null) {
                        j = 0;
                        if (l4.longValue() > 0) {
                            z2 = true;
                        }
                    } else {
                        j = 0;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) this.selectedDialogTopics.get(this.selectedDialogs.get(jKeyAt3));
                    long peerDialogId3 = (tL_forumTopic4 == null || !zIsMonoForum3) ? j : DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                    if (tL_forumTopic4 == null || zIsMonoForum3) {
                        c = 0;
                        messageObject = null;
                    } else {
                        c = 0;
                        messageObject = new MessageObject(this.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                    }
                    if (this.frameLayout2.getTag() == null || this.commentTextView.length() <= 0) {
                        j2 = peerDialogId3;
                    } else {
                        CharSequence charSequence3 = charSequenceArr[c];
                        j2 = peerDialogId3;
                        SendMessagesHelper.SendMessageParams sendMessageParamsOf3 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), jKeyAt3, messageObject, messageObject, null, true, arrayList, null, null, z, 0, 0, null, false);
                        sendMessageParamsOf3.payStars = l4 == null ? j : l4.longValue();
                        sendMessageParamsOf3.monoForumPeer = j2;
                        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf3);
                    }
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf4 = SendMessagesHelper.SendMessageParams.of(this.sendingText[i3], jKeyAt3, messageObject, messageObject, null, true, null, null, null, z, 0, 0, null, false);
                    sendMessageParamsOf4.payStars = l4 == null ? j : l4.longValue();
                    sendMessageParamsOf4.monoForumPeer = j2;
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf4);
                    i5++;
                    z2 = z2;
                    l = l;
                }
            } else {
                z2 = false;
            }
            LongSparseArray longSparseArray = this.selectedDialogs;
            onSend(longSparseArray, 1, (TLRPC.TL_forumTopic) this.selectedDialogTopics.get(longSparseArray.valueAt(0)), !z2);
        }
        ShareAlertDelegate shareAlertDelegate = this.delegate;
        if (shareAlertDelegate != null) {
            shareAlertDelegate.didShare();
        }
        lambda$new$0();
    }

    public int getCurrentTop() {
        if (this.gridView.getChildCount() == 0) {
            return -1000;
        }
        int top = 0;
        View childAt = this.gridView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
        if (holder == null) {
            return -1000;
        }
        int paddingTop = this.gridView.getPaddingTop();
        if (holder.getLayoutPosition() == 0 && childAt.getTop() >= 0) {
            top = childAt.getTop();
        }
        return paddingTop - top;
    }

    private RecyclerListView getMainGridView() {
        return (this.searchIsVisible || this.searchWasVisibleBeforeTopics) ? this.searchGridView : this.gridView;
    }

    public void setDelegate(ShareAlertDelegate shareAlertDelegate) {
        this.delegate = shareAlertDelegate;
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
    }

    @Override
    public void lambda$openCrafting$8() {
        if (this.selectedTopicDialog != null) {
            collapseTopics();
            return;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null && editTextEmoji.isPopupShowing()) {
            this.commentTextView.hidePopup(true);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.dialogsNeedReload;
        if (i == i3) {
            ShareDialogsAdapter shareDialogsAdapter = this.listAdapter;
            if (shareDialogsAdapter != null) {
                shareDialogsAdapter.fetchDialogs();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i3);
        }
    }

    public void updateLayout() {
        if (this.panTranslationMoveLayout) {
            return;
        }
        RecyclerListView recyclerListView = this.searchIsVisible ? this.searchGridView : this.gridView;
        if (recyclerListView.getChildCount() <= 0) {
            return;
        }
        View childAt = recyclerListView.getChildAt(0);
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            if (recyclerListView.getChildAt(i).getTop() < childAt.getTop()) {
                childAt = recyclerListView.getChildAt(i);
            }
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerListView.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i2 = (top <= 0 || holder == null || holder.getAdapterPosition() != 0) ? 0 : top;
        if (top >= 0 && holder != null && holder.getAdapterPosition() == 0) {
            this.lastOffset = childAt.getTop();
            runShadowAnimation(0, false);
        } else {
            this.lastOffset = Integer.MAX_VALUE;
            runShadowAnimation(0, true);
            top = i2;
        }
        if (this.topicsGridView.getVisibility() == 0) {
            RecyclerListView recyclerListView2 = this.topicsGridView;
            if (recyclerListView2.getChildCount() <= 0) {
                return;
            }
            View childAt2 = recyclerListView2.getChildAt(0);
            for (int i3 = 0; i3 < recyclerListView2.getChildCount(); i3++) {
                if (recyclerListView2.getChildAt(i3).getTop() < childAt2.getTop()) {
                    childAt2 = recyclerListView2.getChildAt(i3);
                }
            }
            RecyclerListView.Holder holder2 = (RecyclerListView.Holder) recyclerListView2.findContainingViewHolder(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i4 = (top2 <= 0 || holder2 == null || holder2.getAdapterPosition() != 0) ? 0 : top2;
            if (top2 >= 0 && holder2 != null && holder2.getAdapterPosition() == 0) {
                this.lastOffset = childAt2.getTop();
                runShadowAnimation(0, false);
            } else {
                this.lastOffset = Integer.MAX_VALUE;
                runShadowAnimation(0, true);
                top2 = i4;
            }
            top = AndroidUtilities.lerp(top, top2, this.topicsGridView.getAlpha());
        }
        int i5 = this.scrollOffsetY;
        if (i5 != top) {
            this.previousScrollOffsetY = i5;
            RecyclerListView recyclerListView3 = this.gridView;
            float f = top;
            int i6 = (int) (this.currentPanTranslationY + f);
            this.scrollOffsetY = i6;
            recyclerListView3.setTopGlowOffset(i6);
            RecyclerListView recyclerListView4 = this.searchGridView;
            int i7 = (int) (this.currentPanTranslationY + f);
            this.scrollOffsetY = i7;
            recyclerListView4.setTopGlowOffset(i7);
            RecyclerListView recyclerListView5 = this.topicsGridView;
            int i8 = (int) (f + this.currentPanTranslationY);
            this.scrollOffsetY = i8;
            recyclerListView5.setTopGlowOffset(i8);
            this.frameLayout.setTranslationY(this.scrollOffsetY + this.currentPanTranslationY);
            this.searchEmptyView.setTranslationY(this.scrollOffsetY + this.currentPanTranslationY);
            this.containerView.invalidate();
        }
    }

    private void runShadowAnimation(final int i, final boolean z) {
        if ((!z || this.shadow[i].getTag() == null) && (z || this.shadow[i].getTag() != null)) {
            return;
        }
        this.shadow[i].setTag(z ? null : 1);
        if (z) {
            this.shadow[i].setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation[i];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.shadowAnimation[i] = new AnimatorSet();
        this.shadowAnimation[i].playTogether(ObjectAnimator.ofFloat(this.shadow[i], (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.shadowAnimation[i].setDuration(150L);
        this.shadowAnimation[i].addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ShareAlert.this.shadowAnimation[i] == null || !ShareAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                if (!z) {
                    ShareAlert.this.shadow[i].setVisibility(4);
                }
                ShareAlert.this.shadowAnimation[i] = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (ShareAlert.this.shadowAnimation[i] == null || !ShareAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                ShareAlert.this.shadowAnimation[i] = null;
            }
        });
        this.shadowAnimation[i].start();
    }

    private void copyLink(Context context) {
        final boolean z = false;
        if (this.exportedMessageLink == null && this.linkToCopy[0] == null) {
            return;
        }
        try {
            String link = getLink();
            ClipboardManager clipboardManager = (ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard");
            if (link == null) {
                link = this.exportedMessageLink.link;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", link));
            ShareAlertDelegate shareAlertDelegate = this.delegate;
            if (shareAlertDelegate != null && shareAlertDelegate.didCopy()) {
                return;
            }
            if (this.parentActivity instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.exportedMessageLink;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z = true;
                }
                ((LaunchActivity) this.parentActivity).showBulletin(new Function() {
                    @Override
                    public final Object apply(Object obj) {
                        return ShareAlert.lambda$copyLink$31(z, (BulletinFactory) obj);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static Bulletin lambda$copyLink$31(boolean z, BulletinFactory bulletinFactory) {
        return bulletinFactory.createCopyLinkBulletin(z);
    }

    private boolean showCommentTextView(final boolean z) {
        if (z == (this.frameLayout2.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.frameLayout2.setTag(z ? 1 : null);
        if (this.commentTextView.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.commentTextView.getEditText());
        }
        this.commentTextView.hidePopup(true);
        if (z) {
            this.frameLayout2.setVisibility(0);
            FrameLayout frameLayout = this.timestampFrameLayout;
            if (frameLayout != null && this.pickerBottom == null) {
                frameLayout.setVisibility(0);
            }
            this.writeButtonContainer.setVisibility(0);
        } else {
            FrameLayout frameLayout2 = this.pickerBottom;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
        }
        FrameLayout frameLayout3 = this.pickerBottom;
        if (frameLayout3 != null) {
            ViewCompat.setImportantForAccessibility(frameLayout3, z ? 4 : 1);
        }
        LinearLayout linearLayout = this.sharesCountLayout;
        if (linearLayout != null) {
            ViewCompat.setImportantForAccessibility(linearLayout, z ? 4 : 1);
        }
        this.animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout4 = this.frameLayout2;
        Property property = View.ALPHA;
        float fDp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        FrameLayout frameLayout5 = this.timestampFrameLayout;
        if (frameLayout5 != null && this.pickerBottom == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout5, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) View.SCALE_X, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) View.SCALE_Y, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        FrameLayout frameLayout6 = this.pickerBottom;
        if (frameLayout6 == null || frameLayout6.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.shadow[1], (Property<View, Float>) property, z ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout7 = this.pickerBottomLayout;
        if (frameLayout7 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.darkTheme && z) {
                fDp = AndroidUtilities.dp(this.timestampLayout != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout7, (Property<FrameLayout, Float>) property2, fDp));
        }
        this.animatorSet.playTogether(arrayList);
        this.animatorSet.setInterpolator(new DecelerateInterpolator());
        this.animatorSet.setDuration(180L);
        this.animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(ShareAlert.this.animatorSet)) {
                    if (!z) {
                        ShareAlert.this.frameLayout2.setVisibility(4);
                        ShareAlert shareAlert = ShareAlert.this;
                        if (shareAlert.timestampFrameLayout != null && shareAlert.pickerBottom == null) {
                            ShareAlert.this.timestampFrameLayout.setVisibility(4);
                        }
                        ShareAlert.this.writeButtonContainer.setVisibility(4);
                    } else if (ShareAlert.this.pickerBottom != null) {
                        ShareAlert.this.pickerBottom.setVisibility(4);
                    }
                    ShareAlert.this.animatorSet = null;
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (animator.equals(ShareAlert.this.animatorSet)) {
                    ShareAlert.this.animatorSet = null;
                }
            }
        });
        this.animatorSet.start();
        return true;
    }

    public void updateSelectedCount(int i) {
        if (this.selectedDialogs.size() == 0) {
            showCommentTextView(false);
            return;
        }
        ArrayList arrayList = this.sendingMessageObjects;
        int size = arrayList == null ? 1 : arrayList.size();
        if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0) {
            size++;
        }
        long j = 0;
        for (int i2 = 0; i2 < this.selectedDialogs.size(); i2++) {
            long j2 = ((TLRPC.Dialog) this.selectedDialogs.valueAt(i2)).id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j2);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j2));
            }
            j += sendPaidMessagesStars;
        }
        this.writeButton.setCount(Math.max(1, this.selectedDialogs.size()), i != 0);
        this.writeButton.setStarsPrice(j, size, i != 0);
        showCommentTextView(true);
        this.commentTextView.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), this.writeButton.width()), 0);
    }

    @Override
    public void lambda$new$0() {
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            AndroidUtilities.hideKeyboard(editTextEmoji.getEditText());
        }
        this.fullyShown = false;
        super.lambda$new$0();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    private class ShareDialogsAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private ArrayList dialogs = new ArrayList();
        private LongSparseArray dialogsMap = new LongSparseArray();

        @Override
        public int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        private class MyStoryDialog extends TLRPC.Dialog {
            private MyStoryDialog() {
                this.id = Long.MAX_VALUE;
            }
        }

        public ShareDialogsAdapter(Context context) {
            this.context = context;
            fetchDialogs();
        }

        public void fetchDialogs() {
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            this.dialogs.clear();
            this.dialogsMap.clear();
            long j = UserConfig.getInstance(((BottomSheet) ShareAlert.this).currentAccount).clientUserId;
            if (ShareAlert.this.includeStory) {
                MyStoryDialog myStoryDialog = new MyStoryDialog();
                this.dialogs.add(myStoryDialog);
                this.dialogsMap.put(myStoryDialog.id, myStoryDialog);
            }
            if (!MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).dialogsForward.isEmpty()) {
                TLRPC.Dialog dialog = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).dialogsForward.get(0);
                this.dialogs.add(dialog);
                this.dialogsMap.put(dialog.id, dialog);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getAllDialogs();
            for (int i = 0; i < allDialogs.size(); i++) {
                TLRPC.Dialog dialog2 = allDialogs.get(i);
                if (dialog2 instanceof TLRPC.TL_dialog) {
                    long j2 = dialog2.id;
                    if (j2 != j && !DialogObject.isEncryptedDialog(j2)) {
                        if (!DialogObject.isUserDialog(dialog2.id)) {
                            TLRPC.Chat chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(-dialog2.id));
                            if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog2.folder_id == 1) {
                                    arrayList.add(dialog2);
                                } else {
                                    this.dialogs.add(dialog2);
                                }
                                this.dialogsMap.put(dialog2.id, dialog2);
                            }
                        } else {
                            if (dialog2.folder_id == 1) {
                                arrayList.add(dialog2);
                            } else {
                                this.dialogs.add(dialog2);
                            }
                            this.dialogsMap.put(dialog2.id, dialog2);
                        }
                    }
                }
            }
            this.dialogs.addAll(arrayList);
            if (ShareAlert.this.parentFragment != null) {
                int i2 = ShareAlert.this.parentFragment.shareAlertDebugMode;
                if (i2 == 1) {
                    ArrayList arrayList2 = this.dialogs;
                    ArrayList arrayList3 = new ArrayList(arrayList2.subList(0, Math.min(4, arrayList2.size())));
                    this.dialogs.clear();
                    this.dialogs.addAll(arrayList3);
                } else if (i2 == 2) {
                    while (!this.dialogs.isEmpty() && this.dialogs.size() < 80) {
                        ArrayList arrayList4 = this.dialogs;
                        arrayList4.add((TLRPC.Dialog) arrayList4.get(arrayList4.size() - 1));
                    }
                }
            }
            notifyDataSetChanged();
        }

        @Override
        public int getItemCount() {
            int size = this.dialogs.size();
            return size != 0 ? size + 1 : size;
        }

        public TLRPC.Dialog getItem(int i) {
            int i2 = i - 1;
            if (i2 < 0 || i2 >= this.dialogs.size()) {
                return null;
            }
            return (TLRPC.Dialog) this.dialogs.get(i2);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                view = new ShareDialogCell(this.context, 0, ((BottomSheet) ShareAlert.this).resourcesProvider) {
                    @Override
                    protected String repostToCustomName() {
                        if (ShareAlert.this.includeStoryFromMessage) {
                            return LocaleController.getString(R.string.RepostToStory);
                        }
                        return super.repostToCustomName();
                    }
                };
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
            } else {
                view = new View(this.context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 56.0f : 109.0f)));
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) viewHolder.itemView;
                TLRPC.Dialog item = getItem(i);
                if (item == null) {
                    return;
                }
                shareDialogCell.setTopic((TLRPC.TL_forumTopic) ShareAlert.this.selectedDialogTopics.get(item), MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).isMonoForum(item.id), false);
                long j = item.id;
                shareDialogCell.setDialog(j, ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0, null);
            }
        }
    }

    private class ShareTopicsAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private boolean isBotForum;
        private boolean isBotForumWithManageTopics;
        private List topics;

        @Override
        public int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        public ShareTopicsAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            List list = this.topics;
            return (list != null ? list.size() + 1 : 0) + (this.isBotForum ? 1 : 0);
        }

        public TLRPC.TL_forumTopic getItemTopic(int i) {
            int i2 = i - 1;
            if (this.isBotForum) {
                i2 = i - 2;
            }
            List list = this.topics;
            if (list == null || i2 < 0 || i2 >= list.size()) {
                return null;
            }
            return (TLRPC.TL_forumTopic) this.topics.get(i2);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shareTopicCell;
            if (i == 0 || i == 2) {
                shareTopicCell = new ShareTopicCell(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider);
                shareTopicCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
            } else {
                shareTopicCell = new View(this.context);
                shareTopicCell.setLayoutParams(new RecyclerView.LayoutParams(-1, ActionBar.getCurrentActionBarHeight()));
            }
            return new RecyclerListView.Holder(shareTopicCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ShareTopicCell shareTopicCell = (ShareTopicCell) viewHolder.itemView;
                if (i == 1 && this.isBotForum) {
                    shareTopicCell.setAsNewBotForumTopic(this.isBotForumWithManageTopics);
                } else if (this.topics != null) {
                    TLRPC.TL_forumTopic itemTopic = getItemTopic(i);
                    shareTopicCell.setTopic(ShareAlert.this.selectedTopicDialog, itemTopic, itemTopic != null && ShareAlert.this.selectedDialogs.indexOfKey((long) itemTopic.id) >= 0, null);
                }
            }
        }
    }

    public class ShareSearchAdapter extends RecyclerListView.SelectionAdapter {
        DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapter;
        RecyclerView categoryListView;
        private Context context;
        int itemsCount;
        private int lastGlobalSearchId;
        int lastItemCont;
        private int lastLocalSearchId;
        private int lastSearchId;
        private String lastSearchText;
        private SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private Runnable searchRunnable2;
        private ArrayList searchResult = new ArrayList();
        int hintsCell = -1;
        int resentTitleCell = -1;
        int firstEmptyViewCell = -1;
        int recentDialogsStartRow = -1;
        int searchResultsStartRow = -1;
        int lastFilledItem = -1;
        boolean internalDialogsIsSearching = false;

        public ShareSearchAdapter(Context context) {
            this.context = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false) {
                @Override
                protected boolean filter(TLObject tLObject) {
                    return !(tLObject instanceof TLRPC.Chat) || ChatObject.canWriteToChat((TLRPC.Chat) tLObject);
                }
            };
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() {
                @Override
                public LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
                }

                @Override
                public LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
                }

                @Override
                public void onSetHashtags(ArrayList arrayList, HashMap map) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$onSetHashtags(this, arrayList, map);
                }

                @Override
                public void onDataSetChanged(int i) {
                    ShareSearchAdapter.this.lastGlobalSearchId = i;
                    if (ShareSearchAdapter.this.lastLocalSearchId != i) {
                        ShareSearchAdapter.this.searchResult.clear();
                    }
                    ShareSearchAdapter shareSearchAdapter = ShareSearchAdapter.this;
                    int i2 = shareSearchAdapter.lastItemCont;
                    if (shareSearchAdapter.getItemCount() != 0 || ShareSearchAdapter.this.searchAdapterHelper.isSearchInProgress()) {
                        ShareAlert.this.recyclerItemsEnterAnimator.showItemsAnimated(i2);
                    } else {
                        ShareSearchAdapter shareSearchAdapter2 = ShareSearchAdapter.this;
                        if (!shareSearchAdapter2.internalDialogsIsSearching) {
                            ShareAlert.this.searchEmptyView.showProgress(false, true);
                        } else {
                            ShareAlert.this.recyclerItemsEnterAnimator.showItemsAnimated(i2);
                        }
                    }
                    ShareSearchAdapter.this.notifyDataSetChanged();
                    ShareAlert.this.checkCurrentList(true);
                }

                @Override
                public boolean canApplySearchResults(int i) {
                    return i == ShareSearchAdapter.this.lastSearchId;
                }
            });
        }

        private void searchDialogsInternal(final String str, final int i) {
            MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$searchDialogsInternal$1(str, i);
                }
            });
        }

        public void lambda$searchDialogsInternal$1(String str, int i) {
            LongSparseArray longSparseArray;
            String str2;
            int i2;
            LongSparseArray longSparseArray2;
            char c;
            LongSparseArray longSparseArray3;
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            String str3;
            char c2;
            NativeByteBuffer nativeByteBufferByteBufferValue;
            TLRPC.User userTLdeserialize;
            DialogSearchResult dialogSearchResult;
            TLRPC.UserStatus userStatus;
            char c3;
            int i3 = 0;
            try {
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    this.lastSearchId = -1;
                    updateSearchResults(new ArrayList(), this.lastSearchId);
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i4 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i4];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                LongSparseArray longSparseArray4 = new LongSparseArray();
                SQLiteCursor sQLiteCursorQueryFinalized = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getDatabase().queryFinalized("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 400", new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                    DialogSearchResult dialogSearchResult2 = new DialogSearchResult();
                    dialogSearchResult2.date = sQLiteCursorQueryFinalized.intValue(1);
                    longSparseArray4.put(jLongValue, dialogSearchResult2);
                    if (DialogObject.isUserDialog(jLongValue)) {
                        if (!arrayList.contains(Long.valueOf(jLongValue))) {
                            arrayList.add(Long.valueOf(jLongValue));
                        }
                    } else if (DialogObject.isChatDialog(jLongValue)) {
                        long j = -jLongValue;
                        if (!arrayList2.contains(Long.valueOf(j))) {
                            arrayList2.add(Long.valueOf(j));
                        }
                    }
                }
                sQLiteCursorQueryFinalized.dispose();
                String str4 = ";;;";
                String str5 = " ";
                if (arrayList.isEmpty()) {
                    longSparseArray = longSparseArray4;
                    str2 = ";;;";
                    i2 = 0;
                } else {
                    SQLiteCursor sQLiteCursorQueryFinalized2 = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, status, name FROM users WHERE uid IN(%s)", TextUtils.join(",", arrayList)), new Object[0]);
                    i2 = 0;
                    while (sQLiteCursorQueryFinalized2.next()) {
                        String strStringValue = sQLiteCursorQueryFinalized2.stringValue(2);
                        String translitString2 = LocaleController.getInstance().getTranslitString(strStringValue);
                        if (strStringValue.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int iLastIndexOf = strStringValue.lastIndexOf(str4);
                        String strSubstring = iLastIndexOf != -1 ? strStringValue.substring(iLastIndexOf + 3) : null;
                        char c4 = 0;
                        while (true) {
                            if (i3 >= i4) {
                                longSparseArray4 = longSparseArray4;
                                str3 = str4;
                                break;
                            }
                            char c5 = c4;
                            String str6 = strArr[i3];
                            if (strStringValue.startsWith(str6)) {
                                str3 = str4;
                            } else {
                                str3 = str4;
                                if (!strStringValue.contains(" " + str6)) {
                                    if (translitString2 != null) {
                                        if (!translitString2.startsWith(str6)) {
                                            if (translitString2.contains(" " + str6)) {
                                            }
                                        }
                                    }
                                    c2 = (strSubstring == null || !strSubstring.startsWith(str6)) ? c5 : (char) 2;
                                }
                                if (c2 != 0) {
                                    nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                    if (nativeByteBufferByteBufferValue != null) {
                                        longSparseArray4 = longSparseArray4;
                                        break;
                                    }
                                    userTLdeserialize = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                    nativeByteBufferByteBufferValue.reuse();
                                    dialogSearchResult = (DialogSearchResult) longSparseArray4.get(userTLdeserialize.id);
                                    userStatus = userTLdeserialize.status;
                                    if (userStatus != null) {
                                        c3 = 1;
                                        userStatus.expires = sQLiteCursorQueryFinalized2.intValue(1);
                                    } else {
                                        c3 = 1;
                                    }
                                    if (c2 == c3) {
                                        dialogSearchResult.name = AndroidUtilities.generateSearchName(userTLdeserialize.first_name, userTLdeserialize.last_name, str6);
                                    } else {
                                        dialogSearchResult.name = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(userTLdeserialize), null, "@" + str6);
                                    }
                                    dialogSearchResult.object = userTLdeserialize;
                                    dialogSearchResult.dialog.id = userTLdeserialize.id;
                                    i2++;
                                    break;
                                }
                                i3++;
                                c4 = c2;
                                strSubstring = strSubstring;
                                str4 = str3;
                            }
                            c2 = 1;
                            if (c2 != 0) {
                                nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(0);
                                if (nativeByteBufferByteBufferValue != null) {
                                    longSparseArray4 = longSparseArray4;
                                    break;
                                    break;
                                }
                                userTLdeserialize = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false);
                                nativeByteBufferByteBufferValue.reuse();
                                dialogSearchResult = (DialogSearchResult) longSparseArray4.get(userTLdeserialize.id);
                                userStatus = userTLdeserialize.status;
                                if (userStatus != null) {
                                    c3 = 1;
                                    userStatus.expires = sQLiteCursorQueryFinalized2.intValue(1);
                                } else {
                                    c3 = 1;
                                }
                                if (c2 == c3) {
                                    dialogSearchResult.name = AndroidUtilities.generateSearchName(userTLdeserialize.first_name, userTLdeserialize.last_name, str6);
                                } else {
                                    dialogSearchResult.name = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(userTLdeserialize), null, "@" + str6);
                                }
                                dialogSearchResult.object = userTLdeserialize;
                                dialogSearchResult.dialog.id = userTLdeserialize.id;
                                i2++;
                                break;
                                break;
                            }
                            i3++;
                            c4 = c2;
                            strSubstring = strSubstring;
                            str4 = str3;
                        }
                        str4 = str3;
                        longSparseArray4 = longSparseArray4;
                        i3 = 0;
                    }
                    longSparseArray = longSparseArray4;
                    str2 = str4;
                    sQLiteCursorQueryFinalized2.dispose();
                }
                if (arrayList2.isEmpty()) {
                    longSparseArray2 = longSparseArray;
                } else {
                    SQLiteCursor sQLiteCursorQueryFinalized3 = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getDatabase().queryFinalized(String.format(Locale.US, "SELECT data, name FROM chats WHERE uid IN(%s)", TextUtils.join(",", arrayList2)), new Object[0]);
                    while (sQLiteCursorQueryFinalized3.next()) {
                        String strStringValue2 = sQLiteCursorQueryFinalized3.stringValue(1);
                        String translitString3 = LocaleController.getInstance().getTranslitString(strStringValue2);
                        if (strStringValue2.equals(translitString3)) {
                            translitString3 = null;
                        }
                        int i5 = 0;
                        while (true) {
                            if (i5 < i4) {
                                String str7 = strArr[i5];
                                if (!strStringValue2.startsWith(str7)) {
                                    if (!strStringValue2.contains(" " + str7)) {
                                        if (translitString3 != null) {
                                            if (!translitString3.startsWith(str7)) {
                                                if (translitString3.contains(" " + str7)) {
                                                }
                                            }
                                        }
                                        i5++;
                                    }
                                }
                                NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized3.byteBufferValue(0);
                                if (nativeByteBufferByteBufferValue2 != null) {
                                    TLRPC.Chat chatTLdeserialize = TLRPC.Chat.TLdeserialize(nativeByteBufferByteBufferValue2, nativeByteBufferByteBufferValue2.readInt32(false), false);
                                    nativeByteBufferByteBufferValue2.reuse();
                                    if (chatTLdeserialize != null && !ChatObject.isNotInChat(chatTLdeserialize) && (!ChatObject.isChannel(chatTLdeserialize) || chatTLdeserialize.creator || (((tL_chatAdminRights = chatTLdeserialize.admin_rights) != null && tL_chatAdminRights.post_messages) || chatTLdeserialize.megagroup))) {
                                        longSparseArray3 = longSparseArray;
                                        DialogSearchResult dialogSearchResult3 = (DialogSearchResult) longSparseArray3.get(-chatTLdeserialize.id);
                                        dialogSearchResult3.name = AndroidUtilities.generateSearchName(chatTLdeserialize.title, null, str7);
                                        dialogSearchResult3.object = chatTLdeserialize;
                                        dialogSearchResult3.dialog.id = -chatTLdeserialize.id;
                                        i2++;
                                    }
                                }
                                longSparseArray = longSparseArray3;
                            }
                            longSparseArray3 = longSparseArray;
                            longSparseArray = longSparseArray3;
                        }
                    }
                    longSparseArray2 = longSparseArray;
                    sQLiteCursorQueryFinalized3.dispose();
                }
                ArrayList arrayList3 = new ArrayList(i2);
                for (int i6 = 0; i6 < longSparseArray2.size(); i6++) {
                    DialogSearchResult dialogSearchResult4 = (DialogSearchResult) longSparseArray2.valueAt(i6);
                    if (dialogSearchResult4.object != null && dialogSearchResult4.name != null) {
                        arrayList3.add(dialogSearchResult4);
                    }
                }
                SQLiteCursor sQLiteCursorQueryFinalized4 = MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getDatabase().queryFinalized("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
                while (sQLiteCursorQueryFinalized4.next()) {
                    if (longSparseArray2.indexOfKey(sQLiteCursorQueryFinalized4.longValue(3)) < 0) {
                        String strStringValue3 = sQLiteCursorQueryFinalized4.stringValue(2);
                        String translitString4 = LocaleController.getInstance().getTranslitString(strStringValue3);
                        if (strStringValue3.equals(translitString4)) {
                            translitString4 = null;
                        }
                        int iLastIndexOf2 = strStringValue3.lastIndexOf(str2);
                        String strSubstring2 = iLastIndexOf2 != -1 ? strStringValue3.substring(iLastIndexOf2 + 3) : null;
                        int i7 = 0;
                        char c6 = 0;
                        while (true) {
                            if (i7 < i4) {
                                String str8 = strArr[i7];
                                if (strStringValue3.startsWith(str8)) {
                                    c = 1;
                                } else {
                                    if (strStringValue3.contains(str5 + str8)) {
                                        c = 1;
                                    } else {
                                        if (translitString4 != null) {
                                            if (!translitString4.startsWith(str8)) {
                                                if (translitString4.contains(str5 + str8)) {
                                                }
                                            }
                                            c = 1;
                                        }
                                        c = (strSubstring2 == null || !strSubstring2.startsWith(str8)) ? c6 : (char) 2;
                                    }
                                }
                                if (c != 0) {
                                    NativeByteBuffer nativeByteBufferByteBufferValue3 = sQLiteCursorQueryFinalized4.byteBufferValue(0);
                                    if (nativeByteBufferByteBufferValue3 != null) {
                                        TLRPC.User userTLdeserialize2 = TLRPC.User.TLdeserialize(nativeByteBufferByteBufferValue3, nativeByteBufferByteBufferValue3.readInt32(false), false);
                                        nativeByteBufferByteBufferValue3.reuse();
                                        DialogSearchResult dialogSearchResult5 = new DialogSearchResult();
                                        TLRPC.UserStatus userStatus2 = userTLdeserialize2.status;
                                        if (userStatus2 != null) {
                                            userStatus2.expires = sQLiteCursorQueryFinalized4.intValue(1);
                                        }
                                        int i8 = i4;
                                        String str9 = str5;
                                        dialogSearchResult5.dialog.id = userTLdeserialize2.id;
                                        dialogSearchResult5.object = userTLdeserialize2;
                                        if (c == 1) {
                                            dialogSearchResult5.name = AndroidUtilities.generateSearchName(userTLdeserialize2.first_name, userTLdeserialize2.last_name, str8);
                                        } else {
                                            dialogSearchResult5.name = AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(userTLdeserialize2), null, "@" + str8);
                                        }
                                        arrayList3.add(dialogSearchResult5);
                                        str2 = str2;
                                        i4 = i8;
                                        str5 = str9;
                                        break;
                                    }
                                } else {
                                    i7++;
                                    c6 = c;
                                    i4 = i4;
                                }
                            }
                            str2 = str2;
                            break;
                        }
                    }
                }
                sQLiteCursorQueryFinalized4.dispose();
                Collections.sort(arrayList3, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return ShareAlert.ShareSearchAdapter.lambda$searchDialogsInternal$0(obj, obj2);
                    }
                });
                updateSearchResults(arrayList3, i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static int lambda$searchDialogsInternal$0(Object obj, Object obj2) {
            int i = ((DialogSearchResult) obj).date;
            int i2 = ((DialogSearchResult) obj2).date;
            if (i < i2) {
                return 1;
            }
            return i > i2 ? -1 : 0;
        }

        private void updateSearchResults(final ArrayList arrayList, final int i) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateSearchResults$2(i, arrayList);
                }
            });
        }

        public void lambda$updateSearchResults$2(int i, ArrayList arrayList) {
            if (i != this.lastSearchId) {
                return;
            }
            getItemCount();
            this.internalDialogsIsSearching = false;
            this.lastLocalSearchId = i;
            if (this.lastGlobalSearchId != i) {
                this.searchAdapterHelper.clear();
            }
            if (ShareAlert.this.gridView.getAdapter() != ShareAlert.this.searchAdapter) {
                ShareAlert shareAlert = ShareAlert.this;
                shareAlert.topBeforeSwitch = shareAlert.getCurrentTop();
                ShareAlert.this.searchAdapter.notifyDataSetChanged();
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLObject tLObject = ((DialogSearchResult) arrayList.get(i2)).object;
                if (tLObject instanceof TLRPC.User) {
                    MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putUser((TLRPC.User) tLObject, true);
                } else if (tLObject instanceof TLRPC.Chat) {
                    MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putChat((TLRPC.Chat) tLObject, true);
                }
            }
            boolean z = !this.searchResult.isEmpty() && arrayList.isEmpty();
            if (this.searchResult.isEmpty()) {
                arrayList.isEmpty();
            }
            if (z) {
                ShareAlert shareAlert2 = ShareAlert.this;
                shareAlert2.topBeforeSwitch = shareAlert2.getCurrentTop();
            }
            this.searchResult = arrayList;
            this.searchAdapterHelper.mergeResults(arrayList, null);
            int i3 = this.lastItemCont;
            if (getItemCount() == 0 && !this.searchAdapterHelper.isSearchInProgress() && !this.internalDialogsIsSearching) {
                ShareAlert.this.searchEmptyView.showProgress(false, true);
            } else {
                ShareAlert.this.recyclerItemsEnterAnimator.showItemsAnimated(i3);
            }
            notifyDataSetChanged();
            ShareAlert.this.checkCurrentList(true);
        }

        public void searchDialogs(final String str) {
            if (str == null || !str.equals(this.lastSearchText)) {
                this.lastSearchText = str;
                if (this.searchRunnable != null) {
                    Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                    this.searchRunnable = null;
                }
                Runnable runnable = this.searchRunnable2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.searchRunnable2 = null;
                }
                this.searchResult.clear();
                this.searchAdapterHelper.mergeResults(null);
                this.searchAdapterHelper.queryServerSearch(null, true, true, true, true, false, 0L, false, 0, 0);
                notifyDataSetChanged();
                ShareAlert.this.checkCurrentList(true);
                if (TextUtils.isEmpty(str)) {
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.topBeforeSwitch = shareAlert.getCurrentTop();
                    this.lastSearchId = -1;
                    this.internalDialogsIsSearching = false;
                } else {
                    this.internalDialogsIsSearching = true;
                    final int i = this.lastSearchId + 1;
                    this.lastSearchId = i;
                    ShareAlert.this.searchEmptyView.showProgress(true, true);
                    DispatchQueue dispatchQueue = Utilities.searchQueue;
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$searchDialogs$4(str, i);
                        }
                    };
                    this.searchRunnable = runnable2;
                    dispatchQueue.postRunnable(runnable2, 300L);
                }
                ShareAlert.this.checkCurrentList(false);
            }
        }

        public void lambda$searchDialogs$4(final String str, final int i) {
            this.searchRunnable = null;
            searchDialogsInternal(str, i);
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$searchDialogs$3(i, str);
                }
            };
            this.searchRunnable2 = runnable;
            AndroidUtilities.runOnUIThread(runnable);
        }

        public void lambda$searchDialogs$3(int i, String str) {
            this.searchRunnable2 = null;
            if (i != this.lastSearchId) {
                return;
            }
            this.searchAdapterHelper.queryServerSearch(str, true, true, true, true, false, 0L, false, 0, i);
        }

        @Override
        public int getItemCount() {
            this.itemsCount = 0;
            this.hintsCell = -1;
            this.resentTitleCell = -1;
            this.recentDialogsStartRow = -1;
            this.searchResultsStartRow = -1;
            this.lastFilledItem = -1;
            if (TextUtils.isEmpty(this.lastSearchText)) {
                int i = this.itemsCount;
                this.firstEmptyViewCell = i;
                this.itemsCount = i + 2;
                this.hintsCell = i + 1;
                if (ShareAlert.this.recentSearchObjects.size() > 0) {
                    int i2 = this.itemsCount;
                    int i3 = i2 + 1;
                    this.itemsCount = i3;
                    this.resentTitleCell = i2;
                    this.recentDialogsStartRow = i3;
                    this.itemsCount = i3 + ShareAlert.this.recentSearchObjects.size();
                }
                int i4 = this.itemsCount;
                int i5 = i4 + 1;
                this.itemsCount = i5;
                this.lastFilledItem = i4;
                this.lastItemCont = i5;
                return i5;
            }
            int i6 = this.itemsCount;
            int i7 = i6 + 1;
            this.itemsCount = i7;
            this.firstEmptyViewCell = i6;
            this.searchResultsStartRow = i7;
            int size = i7 + this.searchResult.size() + this.searchAdapterHelper.getLocalServerSearch().size();
            this.itemsCount = size;
            if (size == 1) {
                this.firstEmptyViewCell = -1;
                this.itemsCount = 0;
                this.lastItemCont = 0;
                return 0;
            }
            int i8 = size + 1;
            this.itemsCount = i8;
            this.lastFilledItem = size;
            this.lastItemCont = i8;
            return i8;
        }

        public TLRPC.Dialog getItem(int i) {
            int i2 = this.recentDialogsStartRow;
            if (i >= i2 && i2 >= 0) {
                int i3 = i - i2;
                if (i3 >= 0 && i3 < ShareAlert.this.recentSearchObjects.size()) {
                    TLObject tLObject = ((DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i3)).object;
                    TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                    if (tLObject instanceof TLRPC.User) {
                        tL_dialog.id = ((TLRPC.User) tLObject).id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                    }
                    return tL_dialog;
                }
                return null;
            }
            int i4 = i - 1;
            if (i4 < 0) {
                return null;
            }
            if (i4 < this.searchResult.size()) {
                return ((DialogSearchResult) this.searchResult.get(i4)).dialog;
            }
            int size = i4 - this.searchResult.size();
            ArrayList localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
            if (size < localServerSearch.size()) {
                TLObject tLObject2 = (TLObject) localServerSearch.get(size);
                TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                if (tLObject2 instanceof TLRPC.User) {
                    tL_dialog2.id = ((TLRPC.User) tLObject2).id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    tL_dialog2.id = -((TLRPC.Chat) tLObject2).id;
                }
                return tL_dialog2;
            }
            return null;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return (viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 4) ? false : true;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View viewShowPremiumBlock;
            if (i == 0) {
                viewShowPremiumBlock = new ProfileSearchCell(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider).useCustomPaints().showPremiumBlock(true);
            } else if (i == 2) {
                RecyclerListView recyclerListView = new RecyclerListView(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider) {
                    @Override
                    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                        if (getParent() != null && getParent().getParent() != null) {
                            ViewParent parent = getParent().getParent();
                            boolean z = true;
                            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                                z = false;
                            }
                            parent.requestDisallowInterceptTouchEvent(z);
                        }
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                };
                this.categoryListView = recyclerListView;
                recyclerListView.setItemAnimator(null);
                recyclerListView.setLayoutAnimation(null);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.context) {
                    @Override
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }
                };
                linearLayoutManager.setOrientation(0);
                recyclerListView.setLayoutManager(linearLayoutManager);
                DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapterRecycler = new DialogsSearchAdapter.CategoryAdapterRecycler(this.context, ((BottomSheet) ShareAlert.this).currentAccount, true, true, ((BottomSheet) ShareAlert.this).resourcesProvider) {
                    @Override
                    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                        TLRPC.Chat chat;
                        String firstName;
                        HintDialogCell hintDialogCell = (HintDialogCell) viewHolder.itemView;
                        if (ShareAlert.this.darkTheme || ShareAlert.this.forceDarkThemeForHint) {
                            hintDialogCell.setColors(Theme.key_voipgroup_nameText, Theme.key_voipgroup_inviteMembersBackground);
                        }
                        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).hints.get(i2);
                        TLRPC.Peer peer = tL_topPeer.peer;
                        long j = peer.user_id;
                        TLRPC.User user = null;
                        if (j != 0) {
                            user = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getUser(Long.valueOf(tL_topPeer.peer.user_id));
                            chat = null;
                        } else {
                            long j2 = peer.channel_id;
                            if (j2 != 0) {
                                j = -j2;
                                chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
                            } else {
                                long j3 = peer.chat_id;
                                if (j3 != 0) {
                                    j = -j3;
                                    chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                                } else {
                                    chat = null;
                                    j = 0;
                                }
                            }
                        }
                        boolean z = j == hintDialogCell.getDialogId();
                        hintDialogCell.setTag(Long.valueOf(j));
                        if (user != null) {
                            firstName = UserObject.getFirstName(user);
                        } else {
                            firstName = chat != null ? chat.title : "";
                        }
                        hintDialogCell.setDialog(j, true, firstName);
                        hintDialogCell.setChecked(ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0, z);
                    }
                };
                this.categoryAdapter = categoryAdapterRecycler;
                recyclerListView.setAdapter(categoryAdapterRecycler);
                recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                    @Override
                    public final void onItemClick(View view, int i2) {
                        this.f$0.lambda$onCreateViewHolder$5(view, i2);
                    }
                });
                viewShowPremiumBlock = recyclerListView;
            } else if (i == 3) {
                GraySectionCell graySectionCell = new GraySectionCell(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider);
                graySectionCell.setTextColor(Theme.key_graySectionText);
                graySectionCell.setBackgroundColor(ShareAlert.this.getThemedColor(Theme.key_graySection));
                graySectionCell.setText(LocaleController.getString(R.string.Recent));
                viewShowPremiumBlock = graySectionCell;
            } else if (i == 4) {
                viewShowPremiumBlock = new View(this.context) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(ShareAlert.this.searchLayoutManager.lastItemHeight, 1073741824));
                    }
                };
            } else if (i == 5) {
                ShareDialogCell shareDialogCell = new ShareDialogCell(this.context, 0, ((BottomSheet) ShareAlert.this).resourcesProvider);
                shareDialogCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
                viewShowPremiumBlock = shareDialogCell;
            } else {
                View view = new View(this.context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 56.0f : 109.0f)));
                viewShowPremiumBlock = view;
            }
            return new RecyclerListView.Holder(viewShowPremiumBlock);
        }

        public void lambda$onCreateViewHolder$5(View view, int i) {
            HintDialogCell hintDialogCell = (HintDialogCell) view;
            TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).hints.get(i);
            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            TLRPC.Peer peer = tL_topPeer.peer;
            long j = peer.user_id;
            if (j == 0) {
                long j2 = peer.channel_id;
                if (j2 != 0) {
                    j = -j2;
                } else {
                    j2 = peer.chat_id;
                    if (j2 != 0) {
                        j = -j2;
                    } else {
                        j = 0;
                    }
                }
            }
            if (hintDialogCell.isBlocked()) {
                ShareAlert.this.showPremiumBlockedToast(hintDialogCell, j);
                return;
            }
            tL_dialog.id = j;
            ShareAlert.this.selectDialog(null, tL_dialog);
            hintDialogCell.setChecked(ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0, true);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            String name;
            CharSequence charSequence;
            long j2;
            int iIndexOfIgnoreCase;
            Object obj;
            int iIndexOfIgnoreCase2;
            if (viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 5) {
                TLObject tLObject = null;
                name = null;
                name = null;
                CharSequence name2 = null;
                TLRPC.EncryptedChat encryptedChat = null;
                if (TextUtils.isEmpty(this.lastSearchText)) {
                    int i2 = this.recentDialogsStartRow;
                    long j3 = 0;
                    if (i2 < 0 || i < i2) {
                        obj = null;
                    } else {
                        Object obj2 = ((DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i - i2)).object;
                        if (obj2 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) obj2;
                            j3 = user.id;
                            name2 = ContactsController.formatName(user.first_name, user.last_name);
                        } else if (obj2 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) obj2;
                            j3 = -chat.id;
                            name2 = chat.title;
                        } else if (obj2 instanceof TLRPC.TL_encryptedChat) {
                            encryptedChat = (TLRPC.TL_encryptedChat) obj2;
                            TLRPC.User user2 = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
                            if (user2 != null) {
                                j3 = user2.id;
                                name2 = ContactsController.formatName(user2.first_name, user2.last_name);
                            }
                        }
                        String lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                        if (TextUtils.isEmpty(lastFoundUsername) || name2 == null || (iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(name2.toString(), lastFoundUsername)) == -1) {
                            obj = obj2;
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name2);
                            spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, ((BottomSheet) ShareAlert.this).resourcesProvider), iIndexOfIgnoreCase2, lastFoundUsername.length() + iIndexOfIgnoreCase2, 33);
                            obj = obj2;
                            name2 = spannableStringBuilder;
                        }
                    }
                    TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                    View view = viewHolder.itemView;
                    if (view instanceof ProfileSearchCell) {
                        ((ProfileSearchCell) view).setData(obj, encryptedChat2, name2, null, false, false);
                        ((ProfileSearchCell) viewHolder.itemView).useSeparator = i < getItemCount() - 2;
                        return;
                    } else {
                        if (view instanceof ShareDialogCell) {
                            ((ShareDialogCell) view).setDialog(j3, ShareAlert.this.selectedDialogs.indexOfKey(j3) >= 0, name2);
                            return;
                        }
                        return;
                    }
                }
                int size = i - 1;
                if (size < this.searchResult.size()) {
                    DialogSearchResult dialogSearchResult = (DialogSearchResult) this.searchResult.get(size);
                    j2 = dialogSearchResult.dialog.id;
                    charSequence = dialogSearchResult.name;
                } else {
                    size -= this.searchResult.size();
                    tLObject = (TLObject) this.searchAdapterHelper.getLocalServerSearch().get(size);
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) tLObject;
                        j = user3.id;
                        name = ContactsController.formatName(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
                        j = -chat2.id;
                        name = chat2.title;
                    }
                    String lastFoundUsername2 = this.searchAdapterHelper.getLastFoundUsername();
                    if (TextUtils.isEmpty(lastFoundUsername2) || name == null || (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(name.toString(), lastFoundUsername2)) == -1) {
                        charSequence = name;
                    } else {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(name);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, ((BottomSheet) ShareAlert.this).resourcesProvider), iIndexOfIgnoreCase, lastFoundUsername2.length() + iIndexOfIgnoreCase, 33);
                        charSequence = spannableStringBuilder2;
                    }
                    j2 = j;
                }
                TLObject tLObject2 = tLObject;
                View view2 = viewHolder.itemView;
                if (view2 instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) view2).setData(tLObject2, null, charSequence, null, false, false);
                    ((ProfileSearchCell) viewHolder.itemView).useSeparator = size < getItemCount() - 2;
                    return;
                } else {
                    if (view2 instanceof ShareDialogCell) {
                        ((ShareDialogCell) view2).setDialog(j2, ShareAlert.this.selectedDialogs.indexOfKey(j2) >= 0, charSequence);
                        return;
                    }
                    return;
                }
            }
            if (viewHolder.getItemViewType() == 2) {
                ((RecyclerListView) viewHolder.itemView).getAdapter().notifyDataSetChanged();
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == this.lastFilledItem) {
                return 4;
            }
            if (i == this.firstEmptyViewCell) {
                return 1;
            }
            if (i == this.hintsCell) {
                return 2;
            }
            if (i == this.resentTitleCell) {
                return 3;
            }
            return TextUtils.isEmpty(this.lastSearchText) ? 0 : 5;
        }

        public int getSpanSize(int i, int i2) {
            if (i2 == this.hintsCell || i2 == this.resentTitleCell || i2 == this.firstEmptyViewCell || i2 == this.lastFilledItem || getItemViewType(i2) == 0) {
                return i;
            }
            return 1;
        }
    }

    public void checkCurrentList(boolean z) {
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.searchView.editText.getText()) || ((this.keyboardVisible && this.searchView.editText.hasFocus()) || this.searchWasVisibleBeforeTopics)) {
            this.updateSearchAdapter = true;
            if (this.selectedTopicDialog == null) {
                AndroidUtilities.updateViewVisibilityAnimated(this.gridView, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, true);
            }
        } else {
            if (this.selectedTopicDialog == null) {
                AndroidUtilities.updateViewVisibilityAnimated(this.gridView, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, false);
            }
            z2 = false;
        }
        if (this.searchIsVisible != z2 || z) {
            this.searchIsVisible = z2;
            this.searchAdapter.notifyDataSetChanged();
            this.listAdapter.notifyDataSetChanged();
            if (this.searchIsVisible) {
                if (this.lastOffset == Integer.MAX_VALUE) {
                    ((LinearLayoutManager) this.searchGridView.getLayoutManager()).scrollToPositionWithOffset(0, -this.searchGridView.getPaddingTop());
                } else {
                    ((LinearLayoutManager) this.searchGridView.getLayoutManager()).scrollToPositionWithOffset(0, this.lastOffset - this.searchGridView.getPaddingTop());
                }
                this.searchAdapter.searchDialogs(this.searchView.editText.getText().toString());
                return;
            }
            if (this.lastOffset == Integer.MAX_VALUE) {
                this.layoutManager.scrollToPositionWithOffset(0, 0);
            } else {
                this.layoutManager.scrollToPositionWithOffset(0, 0);
            }
        }
    }

    private String getLink() {
        String string;
        SwitchView switchView = this.switchView;
        if (switchView != null) {
            string = this.linkToCopy[switchView.currentTab];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.exportedMessageLink;
            string = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            if (string == null) {
                string = this.linkToCopy[0];
            }
        }
        CheckBox2 checkBox2 = this.timestampCheckbox;
        if (checkBox2 != null && checkBox2.isChecked()) {
            try {
                string = Uri.parse(string).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.timestamp)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return string == null ? "" : string;
    }

    public void updateLinkTextView() {
        if (this.linkTextView != null) {
            String link = getLink();
            if (link != null) {
                if (link.startsWith("https://")) {
                    link = link.substring(8);
                } else if (link.startsWith("http://")) {
                    link = link.substring(7);
                }
            }
            this.linkTextView.setText(link);
        }
    }

    public void updateBottomOverlay() {
        AdjustPanLayoutHelper adjustPanLayoutHelper;
        if (this.frameLayout2 == null) {
            return;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        float fDp = 0.0f;
        if (editTextEmoji != null && editTextEmoji.isPopupVisible()) {
            this.keyboardT = this.commentTextView.getEmojiPaddingShown();
        } else {
            SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
            if (sizeNotifierFrameLayout != null && (adjustPanLayoutHelper = sizeNotifierFrameLayout.adjustPanLayoutHelper) != null && !adjustPanLayoutHelper.animationInProgress()) {
                this.keyboardT = this.keyboardSize2 > AndroidUtilities.dp(20.0f) ? 1.0f : 0.0f;
            }
        }
        FrameLayout frameLayout = this.timestampFrameLayout;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            fDp = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.pickerBottom;
        if (frameLayout2 != null) {
            float f = -fDp;
            frameLayout2.setTranslationY(f);
            LinearLayout linearLayout = this.sharesCountLayout;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f);
            }
        }
        float f2 = -fDp;
        this.frameLayout2.setTranslationY(f2);
        this.writeButtonContainer.setTranslationY(f2);
    }

    private void onTopicCellClick(TLRPC.TL_forumTopic tL_forumTopic) {
        TLRPC.Dialog dialog;
        if (tL_forumTopic == null || (dialog = this.selectedTopicDialog) == null) {
            return;
        }
        long j = dialog.id;
        boolean zIsMonoForum = MessagesController.getInstance(this.currentAccount).isMonoForum(j);
        TLRPC.Dialog dialog2 = this.selectedTopicDialog;
        this.selectedDialogs.put(j, dialog2);
        this.selectedDialogTopics.put(dialog2, tL_forumTopic);
        updateSelectedCount(2);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            if (((TLRPC.Dialog) this.listAdapter.dialogsMap.get(dialog2.id)) == null) {
                this.listAdapter.dialogsMap.put(dialog2.id, dialog2);
                this.listAdapter.dialogs.add(!this.listAdapter.dialogs.isEmpty() ? 1 : 0, dialog2);
            }
            this.listAdapter.notifyDataSetChanged();
            this.updateSearchAdapter = false;
            this.searchView.editText.setText("");
            checkCurrentList(false);
        }
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) childAt;
                if (shareDialogCell.getCurrentDialog() == this.selectedTopicDialog.id) {
                    shareDialogCell.setTopic(tL_forumTopic, zIsMonoForum, true);
                    shareDialogCell.setChecked(true, true);
                }
            }
        }
        collapseTopics();
    }

    private void onTopicCreateCellClick() {
        TLRPC.Dialog dialog = this.selectedTopicDialog;
        if (dialog == null) {
            return;
        }
        this.selectedDialogs.put(dialog.id, dialog);
        this.selectedDialogTopics.remove(dialog);
        updateSelectedCount(2);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            if (((TLRPC.Dialog) this.listAdapter.dialogsMap.get(dialog.id)) == null) {
                this.listAdapter.dialogsMap.put(dialog.id, dialog);
                this.listAdapter.dialogs.add(!this.listAdapter.dialogs.isEmpty() ? 1 : 0, dialog);
            }
            this.listAdapter.notifyDataSetChanged();
            this.updateSearchAdapter = false;
            this.searchView.editText.setText("");
            checkCurrentList(false);
        }
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) childAt;
                if (shareDialogCell.getCurrentDialog() == this.selectedTopicDialog.id) {
                    shareDialogCell.setTopic(null, false, true);
                    shareDialogCell.setChecked(true, true);
                }
            }
        }
        collapseTopics();
    }

    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        this.iBlur3PositionMainTabs.set(0.0f, 0.0f, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.iBlur3Positions, 1);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }
}
