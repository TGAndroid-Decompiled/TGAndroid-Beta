package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline1;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.FBool;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public final class SelectAudioAlert extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, FactorAnimator.Target {
    public UniversalAdapter adapter;
    public final BoolAnimator animatorFadeVisible;
    public MessageObject downloadingMessageObject;
    public final ChatAttachAlert.SearchFadeView fadeView;
    public boolean failedToResolveGlobalAudioBot;
    public final FrameLayout frameLayout;
    public final ArrayList globalAudio;
    public TLRPC.User globalAudioBot;
    public boolean globalAudioHasMore;
    public int globalAudioId;
    public String globalAudioOffset;
    public final SelectAudioAlert$$ExternalSyntheticLambda3 iBlur3Capture;
    public final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    public final RectF iBlur3PositionActionBar;
    public final ArrayList iBlur3Positions;
    public final ArrayList iBlur3PositionsMerged;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    public boolean ignoreScroll;
    public String lastLoadingGlobalAudioQuery;
    public String lastLoadingSharedAudioQuery;
    public final SelectAudioAlert$$ExternalSyntheticLambda1 loadGlobalAudioRunnable;
    public final SelectAudioAlert$$ExternalSyntheticLambda1 loadSharedAudioRunnable;
    public boolean loadingGlobalAudio;
    public int loadingGlobalAudioRequestId;
    public boolean loadingLocalAudio;
    public boolean loadingSharedAudio;
    public int loadingSharedAudioRequestId;
    public boolean local;
    public final ArrayList localAudio;
    public int nextSearchRate;
    public final Utilities.Callback onAudioSelected;
    public final SelectAudioAlert parentAlert;
    public MessageObject playingAudio;
    public String query;
    public boolean resolvingGlobalAudioBot;
    public final MessagesController.SavedMusicList savedMusicList;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public final ArrayList sharedAudio;
    public boolean sharedAudioHasMore;
    public final int tag;
    public boolean willLoadGlobalAudio;
    public boolean willLoadSharedAudio;
    public boolean withoutSavedMusic;

    public SelectAudioAlert(Context context, boolean z, SelectAudioAlert selectAudioAlert, Utilities.Callback callback, DarkThemeResourceProvider darkThemeResourceProvider) {
        super(context, null, true, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, darkThemeResourceProvider);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorFadeVisible = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, false);
        this.localAudio = new ArrayList();
        this.sharedAudio = new ArrayList();
        this.globalAudio = new ArrayList();
        this.loadingSharedAudioRequestId = -1;
        final int i = 0;
        this.loadSharedAudioRunnable = new Runnable(this) {
            public final SelectAudioAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.loadSharedAudio();
                        break;
                    case 1:
                        this.f$0.loadGlobalAudio();
                        break;
                    default:
                        this.f$0.lambda$loadLocalAudio$7();
                        break;
                }
            }
        };
        this.loadingGlobalAudioRequestId = -1;
        this.globalAudioId = -2000000000;
        final int i2 = 1;
        this.loadGlobalAudioRunnable = new Runnable(this) {
            public final SelectAudioAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.loadSharedAudio();
                        break;
                    case 1:
                        this.f$0.loadGlobalAudio();
                        break;
                    default:
                        this.f$0.lambda$loadLocalAudio$7();
                        break;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        arrayList.add(rectF);
        this.iBlur3PositionsMerged = new ArrayList();
        this.topPadding = 0.35f;
        fixNavigationBar();
        setSlidingActionBar();
        this.headerPaddingTop = AndroidUtilities.dp(4.0f);
        this.headerPaddingBottom = AndroidUtilities.dp(-20.0f);
        this.local = z;
        this.tag = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.parentAlert = selectAudioAlert;
        this.onAudioSelected = callback;
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.paint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public final void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    Blur3HashImpl blur3HashImpl = (Blur3HashImpl) iBlur3Hash;
                    blur3HashImpl.hash = MediaDataController.calcHash(blur3HashImpl.hash, SelectAudioAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    ((Blur3HashImpl) iBlur3Hash).add(SharedConfig.chatBlurEnabled());
                }

                @Override
                public final void renderNodeUpdateDisplayList(Canvas canvas) {
                    int i3 = Theme.key_windowBackgroundWhite;
                    SelectAudioAlert selectAudioAlert2 = SelectAudioAlert.this;
                    canvas.drawColor(selectAudioAlert2.getThemedColor(i3));
                    if (SharedConfig.chatBlurEnabled()) {
                        selectAudioAlert2.scrollableViewNoiseSuppressor.draw(canvas, -2);
                    }
                }
            });
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlassFrosted = blurredBackgroundSourceRenderNode2;
            blurredBackgroundSourceRenderNode2.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public final void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    Blur3HashImpl blur3HashImpl = (Blur3HashImpl) iBlur3Hash;
                    blur3HashImpl.hash = MediaDataController.calcHash(blur3HashImpl.hash, SelectAudioAlert.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    ((Blur3HashImpl) iBlur3Hash).add(SharedConfig.chatBlurEnabled());
                }

                @Override
                public final void renderNodeUpdateDisplayList(Canvas canvas) {
                    int i3 = Theme.key_windowBackgroundWhite;
                    SelectAudioAlert selectAudioAlert2 = SelectAudioAlert.this;
                    canvas.drawColor(selectAudioAlert2.getThemedColor(i3));
                    if (SharedConfig.chatBlurEnabled()) {
                        selectAudioAlert2.scrollableViewNoiseSuppressor.draw(canvas, -3);
                    }
                }
            });
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        this.iBlur3Capture = new IBlur3Capture() {
            @Override
            public final void capture(Canvas canvas, RectF rectF2) {
                this.f$0.lambda$new$0(canvas, rectF2);
            }

            @Override
            public final void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF2) {
                ((Blur3HashImpl) iBlur3Hash).unsupported = true;
            }
        };
        int i3 = Theme.key_windowBackgroundGray;
        ChatAttachAlert.SearchFadeView searchFadeView = new ChatAttachAlert.SearchFadeView(context, i3, darkThemeResourceProvider);
        this.fadeView = searchFadeView;
        searchFadeView.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, darkThemeResourceProvider);
        fragmentSearchField.editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z2) {
                if (z2) {
                    SelectAudioAlert selectAudioAlert2 = SelectAudioAlert.this;
                    selectAudioAlert2.ignoreScroll = true;
                    SelectAudioAlert.access$600(selectAudioAlert2);
                }
            }
        });
        fragmentSearchField.setSectionBackground();
        fragmentSearchField.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        fragmentSearchField.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                SelectAudioAlert selectAudioAlert2 = SelectAudioAlert.this;
                String str = selectAudioAlert2.query;
                String string = editable.toString();
                selectAudioAlert2.query = string;
                if (!selectAudioAlert2.local) {
                    String str2 = selectAudioAlert2.lastLoadingSharedAudioQuery;
                    if (string == null) {
                        string = "";
                    }
                    boolean zEquals = TextUtils.equals(str2, string);
                    boolean z2 = false;
                    if (!zEquals) {
                        selectAudioAlert2.cancelLoadingSharedAudio();
                        String str3 = selectAudioAlert2.query;
                        selectAudioAlert2.willLoadSharedAudio = str3 != null && str3.length() > 0;
                    }
                    String str4 = selectAudioAlert2.lastLoadingGlobalAudioQuery;
                    String str5 = selectAudioAlert2.query;
                    if (!TextUtils.equals(str4, str5 != null ? str5 : "")) {
                        selectAudioAlert2.cancelLoadingGlobalAudio();
                        String str6 = selectAudioAlert2.query;
                        if (str6 != null && str6.length() > 3 && !TextUtils.isEmpty(MessagesController.getInstance(((BottomSheet) selectAudioAlert2).currentAccount).config.musicSearchUsername.get())) {
                            z2 = true;
                        }
                        selectAudioAlert2.willLoadGlobalAudio = z2;
                    }
                    SelectAudioAlert$$ExternalSyntheticLambda1 selectAudioAlert$$ExternalSyntheticLambda1 = selectAudioAlert2.loadSharedAudioRunnable;
                    AndroidUtilities.cancelRunOnUIThread(selectAudioAlert$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(selectAudioAlert$$ExternalSyntheticLambda1, 400L);
                    SelectAudioAlert$$ExternalSyntheticLambda1 selectAudioAlert$$ExternalSyntheticLambda2 = selectAudioAlert2.loadGlobalAudioRunnable;
                    AndroidUtilities.cancelRunOnUIThread(selectAudioAlert$$ExternalSyntheticLambda2);
                    AndroidUtilities.runOnUIThread(selectAudioAlert$$ExternalSyntheticLambda2, 400L);
                }
                selectAudioAlert2.adapter.update(true);
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }
        });
        fragmentSearchField.editText.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(searchFadeView, LayoutHelper.createFrameMatchParent());
        frameLayout.addView(fragmentSearchField, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        fragmentSearchField.setupBlurredBackground(this.iBlur3FactoryLiquidGlass.create(fragmentSearchField, BlurredBackgroundProviderImpl.topPanel(darkThemeResourceProvider), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, -2, 55));
        setBackgroundColor(getThemedColor(i3));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i4 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i4, 0, i4, 0);
        this.recyclerListView.setSections();
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(cubicBezierInterpolator);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        if (z) {
            this.savedMusicList = null;
            if (this.local && !this.loadingLocalAudio) {
                this.loadingLocalAudio = true;
                final int i5 = 2;
                Utilities.globalQueue.postRunnable(new Runnable(this) {
                    public final SelectAudioAlert f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i5) {
                            case 0:
                                this.f$0.loadSharedAudio();
                                break;
                            case 1:
                                this.f$0.loadGlobalAudio();
                                break;
                            default:
                                this.f$0.lambda$loadLocalAudio$7();
                                break;
                        }
                    }
                });
            }
        } else {
            int i6 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i6, UserConfig.getInstance(i6).getClientUserId());
            this.savedMusicList = savedMusicList;
            savedMusicList.load();
            loadSharedAudio();
            loadGlobalAudio();
        }
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
                super.onScrollStateChanged(recyclerView, i7);
                if (i7 == 0) {
                    SelectAudioAlert selectAudioAlert2 = SelectAudioAlert.this;
                    if (selectAudioAlert2.ignoreScroll) {
                        selectAudioAlert2.ignoreScroll = false;
                    }
                }
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                SelectAudioAlert selectAudioAlert2 = SelectAudioAlert.this;
                selectAudioAlert2.updateSearchY();
                selectAudioAlert2.blur3_InvalidateBlur();
                if (!((BottomSheetWithRecyclerListView) selectAudioAlert2).recyclerListView.scrollingByUser || selectAudioAlert2.ignoreScroll) {
                    return;
                }
                AndroidUtilities.hideKeyboard(((BottomSheet) selectAudioAlert2).containerView);
            }
        });
        this.recyclerListView.setOnItemClickListener(new StoryLinkSheet$$ExternalSyntheticLambda6(this, callback, darkThemeResourceProvider, 1));
    }

    public static void access$600(SelectAudioAlert selectAudioAlert) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) selectAudioAlert.recyclerListView.getLayoutManager();
        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(selectAudioAlert.getContext(), 2);
        linearSmoothScrollerCustom.setTargetPosition(1);
        linearSmoothScrollerCustom.setOffset((ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(1.0f));
        linearLayoutManager.startSmoothScroll(linearSmoothScrollerCustom);
    }

    public static boolean matches(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (!lowerCase.startsWith(str) && !SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str, lowerCase)) {
            String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
            if (!strTranslitSafe.startsWith(str2) && !SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, strTranslitSafe)) {
                return false;
            }
        }
        return true;
    }

    public final int addSection(boolean z, ArrayList arrayList, String str, ArrayList arrayList2, boolean z2, boolean z3, int i) {
        int iDp;
        int i2 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z2)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.query;
            String lowerCase = str2 == null ? null : str2.toLowerCase();
            String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                MessageObject messageObject = (MessageObject) obj;
                if (!z) {
                    messageObject.setQuery(this.query);
                    arrayList3.add(messageObject);
                } else if (TextUtils.isEmpty(lowerCase) || arrayList2 == this.sharedAudio) {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                } else {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (matches(lowerCase, strTranslitSafe, musicTitle) || matches(lowerCase, strTranslitSafe, musicAuthor)) {
                        messageObject.setQuery(this.query);
                        arrayList3.add(messageObject);
                    }
                }
            }
            if (!arrayList3.isEmpty() || z2) {
                if (arrayList.isEmpty() || arrayList.size() <= 1) {
                    iDp = 0;
                } else {
                    arrayList.add(UItem.asShadow(null));
                    iDp = AndroidUtilities.dp(12.0f);
                }
                this.adapter.whiteSectionStart();
                arrayList.add(UItem.asHeader(str));
                int size2 = arrayList3.size();
                while (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                        @Override
                        public final Object run(Object obj3) {
                            MessageObject messageObject2 = (MessageObject) obj3;
                            this.f$0.playingAudio = messageObject2;
                            return Boolean.valueOf(MediaController.getInstance().setPlaylist(MediaController$$ExternalSyntheticOutline1.m(messageObject2), messageObject2, 0L));
                        }
                    };
                    int i4 = SharedAudioCell.Factory.$r8$clinit;
                    UItem uItemOfFactory = UItem.ofFactory(SharedAudioCell.Factory.class);
                    uItemOfFactory.object = (MessageObject) obj2;
                    uItemOfFactory.object2 = callbackReturn;
                    arrayList.add(uItemOfFactory);
                    iDp += AndroidUtilities.dp(56.0f);
                }
                if (z2) {
                    arrayList.add(UItem.asFlicker(4));
                    arrayList.add(UItem.asFlicker(4));
                    arrayList.add(UItem.asFlicker(4));
                    iDp += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z3 && !z2) {
                    arrayList.add(UItem.asButton(i, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore)).accent());
                    iDp += AndroidUtilities.dp(50.0f);
                }
                this.adapter.whiteSectionEnd();
                return iDp;
            }
        }
        return 0;
    }

    public final void blur3_InvalidateBlur() {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        this.iBlur3PositionActionBar.set(0.0f, ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        ArrayList arrayList = this.iBlur3Positions;
        ArrayList arrayList2 = this.iBlur3PositionsMerged;
        downscaleScrollableNoiseSuppressor.setupRenderNodes(FBool.mergeOverlapping(arrayList, arrayList2, 1), arrayList2);
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void cancelLoadingGlobalAudio() {
        if (this.loadingGlobalAudioRequestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.loadingGlobalAudioRequestId, true);
        }
        this.loadingGlobalAudioRequestId = -1;
        this.globalAudioOffset = "";
        this.globalAudioHasMore = false;
        this.globalAudio.clear();
        this.loadingGlobalAudio = false;
        this.willLoadGlobalAudio = false;
    }

    public final void cancelLoadingSharedAudio() {
        if (this.loadingSharedAudioRequestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.loadingSharedAudioRequestId, true);
        }
        this.loadingSharedAudioRequestId = -1;
        this.nextSearchRate = 0;
        this.sharedAudio.clear();
        this.loadingSharedAudio = false;
        this.willLoadSharedAudio = false;
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, new SelectAudioAlert$$ExternalSyntheticLambda0(this, 0), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.musicListLoaded) {
            this.adapter.update(true);
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        if (this.playingAudio != null && MediaController.getInstance().isPlayingMessage(this.playingAudio)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.playingAudio = null;
    }

    @Override
    public final int getObserverTag() {
        return this.tag;
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    public final void lambda$loadGlobalAudio$4(Long l) {
        this.resolvingGlobalAudioBot = false;
        TLRPC.User user = l == null ? null : MessagesController.getInstance(this.currentAccount).getUser(l);
        this.globalAudioBot = user;
        this.failedToResolveGlobalAudioBot = user == null;
        if (user != null) {
            loadGlobalAudio();
        }
    }

    public final void lambda$loadGlobalAudio$5(TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList;
        boolean z = false;
        this.loadingGlobalAudio = false;
        this.willLoadGlobalAudio = false;
        if (messages_botresults == null) {
            this.adapter.update(true);
            return;
        }
        MessagesController.getInstance(this.currentAccount).putUsers(messages_botresults.users, false);
        ArrayList<TLRPC.BotInlineResult> arrayList2 = messages_botresults.results;
        int size = arrayList2.size();
        int i = 0;
        while (true) {
            arrayList = this.globalAudio;
            if (i >= size) {
                break;
            }
            TLRPC.BotInlineResult botInlineResult = arrayList2.get(i);
            i++;
            TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
            if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                if (tL_botInlineMediaResult.document != null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    int i2 = this.globalAudioId;
                    this.globalAudioId = i2 - 1;
                    tL_message.id = i2;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                    tL_message.flags |= 768;
                    arrayList.add(new MessageObject(this.currentAccount, tL_message, false, true));
                }
            }
        }
        this.globalAudioOffset = messages_botresults.next_offset;
        if (!arrayList.isEmpty() && !TextUtils.isEmpty(this.globalAudioOffset)) {
            z = true;
        }
        this.globalAudioHasMore = z;
        this.adapter.update(true);
    }

    public final void lambda$loadLocalAudio$7() {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i = -2000000000;
            while (cursorQuery.moveToNext()) {
                try {
                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                    audioEntry.id = cursorQuery.getInt(0);
                    audioEntry.author = cursorQuery.getString(1);
                    audioEntry.title = cursorQuery.getString(2);
                    audioEntry.path = cursorQuery.getString(3);
                    audioEntry.duration = (int) (cursorQuery.getLong(4) / 1000);
                    audioEntry.genre = cursorQuery.getString(5);
                    File file = new File(audioEntry.path);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    tL_message.id = i;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    tL_message.attachPath = audioEntry.path;
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                    tL_message.flags |= 768;
                    String fileExtension = FileLoader.getFileExtension(file);
                    TLRPC.Document document = tL_message.media.document;
                    document.id = 0L;
                    document.access_hash = 0L;
                    document.file_reference = new byte[0];
                    document.date = tL_message.date;
                    StringBuilder sb = new StringBuilder();
                    sb.append("audio/");
                    if (fileExtension.length() <= 0) {
                        fileExtension = "mp3";
                    }
                    sb.append(fileExtension);
                    document.mime_type = sb.toString();
                    tL_message.media.document.size = (int) file.length();
                    tL_message.media.document.dc_id = 0;
                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                    tL_documentAttributeAudio.duration = audioEntry.duration;
                    tL_documentAttributeAudio.title = audioEntry.title;
                    tL_documentAttributeAudio.performer = audioEntry.author;
                    tL_documentAttributeAudio.flags = 3 | tL_documentAttributeAudio.flags;
                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = file.getName();
                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                    MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, true);
                    audioEntry.messageObject = messageObject;
                    arrayList.add(messageObject);
                    i--;
                } catch (Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            cursorQuery.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(29, this, arrayList));
    }

    public final void lambda$loadSharedAudio$2(TLObject tLObject) {
        ArrayList arrayList;
        boolean z = false;
        this.willLoadSharedAudio = false;
        this.loadingSharedAudio = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                arrayList = this.sharedAudio;
                if (i >= size) {
                    break;
                }
                TLRPC.Message message = arrayList2.get(i);
                i++;
                arrayList.add(new MessageObject(this.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z = true;
            }
            this.sharedAudioHasMore = z;
            this.nextSearchRate = messages_messages.next_rate;
        } else {
            this.sharedAudioHasMore = false;
            this.nextSearchRate = 0;
        }
        this.adapter.update(true);
    }

    public final void lambda$new$0(Canvas canvas, RectF rectF) {
        RecyclerListView recyclerListView = this.recyclerListView;
        Blur3Utils.captureRelativeParent(recyclerListView, canvas, rectF, recyclerListView, getContainerView(), 255);
    }

    public final void lambda$new$1(Utilities.Callback callback, DarkThemeResourceProvider darkThemeResourceProvider, View view, int i) {
        if (!(view instanceof SharedAudioCell)) {
            UItem item = this.adapter.getItem(i - 1);
            if (item != null && item.id == 1) {
                new SelectAudioAlert(getContext(), true, this, callback, darkThemeResourceProvider).show();
                return;
            }
            if (item != null && item.id == 2) {
                this.savedMusicList.load();
                return;
            }
            if (item != null && item.id == 3) {
                loadSharedAudio();
                return;
            } else {
                if (item == null || item.id != 4) {
                    return;
                }
                loadGlobalAudio();
                return;
            }
        }
        MessageObject message = ((SharedAudioCell) view).getMessage();
        if (message != null) {
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            if (this.downloadingMessageObject != null) {
                FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.downloadingMessageObject.getDocument());
                this.downloadingMessageObject = null;
            }
            if (message.attachPathExists || message.mediaExists) {
                this.onAudioSelected.run(message);
                SelectAudioAlert selectAudioAlert = this.parentAlert;
                if (selectAudioAlert != null) {
                    selectAudioAlert.lambda$showGiftOfferSheet$15();
                }
                lambda$showGiftOfferSheet$15();
                return;
            }
            String fileName = message.getFileName();
            if (!TextUtils.isEmpty(fileName)) {
                this.downloadingMessageObject = message;
                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(fileName, message, this);
                FileLoader.getInstance(this.currentAccount).loadFile(message.getDocument(), message, 1, 0);
            }
        }
    }

    public final void loadGlobalAudio() {
        String str;
        String str2 = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = this.lastLoadingGlobalAudioQuery;
        String str4 = this.query;
        if (str4 == null) {
            str4 = "";
        }
        if (!TextUtils.equals(str3, str4)) {
            cancelLoadingGlobalAudio();
        }
        if (this.loadingGlobalAudio || TextUtils.isEmpty(this.query) || this.query.length() < 3) {
            return;
        }
        ArrayList arrayList = this.globalAudio;
        if (arrayList.isEmpty() || this.globalAudioHasMore) {
            if (this.globalAudioBot == null) {
                this.globalAudioBot = MessagesController.getInstance(this.currentAccount).getUser(str2);
            }
            if (this.globalAudioBot == null) {
                if (this.resolvingGlobalAudioBot || this.failedToResolveGlobalAudioBot) {
                    return;
                }
                this.resolvingGlobalAudioBot = true;
                MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str2, new SelectAudioAlert$$ExternalSyntheticLambda5(this, 0));
                return;
            }
            this.loadingGlobalAudio = true;
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.globalAudioBot);
            tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
            if (arrayList.isEmpty() || (str = this.globalAudioOffset) == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.offset = str;
            String str5 = this.query;
            String str6 = str5 != null ? str5 : "";
            this.lastLoadingGlobalAudioQuery = str6;
            tL_messages_getInlineBotResults.query = str6;
            this.loadingGlobalAudioRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new AiTonesController$$ExternalSyntheticLambda0(), new SelectAudioAlert$$ExternalSyntheticLambda0(this, 1));
            this.adapter.update(true);
        }
    }

    public final void loadSharedAudio() {
        if (this.local) {
            return;
        }
        String str = this.lastLoadingSharedAudioQuery;
        String str2 = this.query;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str, str2)) {
            cancelLoadingSharedAudio();
        }
        if (this.loadingSharedAudio) {
            return;
        }
        ArrayList arrayList = this.sharedAudio;
        if (arrayList.isEmpty() || this.sharedAudioHasMore) {
            this.loadingSharedAudio = true;
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
            String str3 = this.query;
            String str4 = str3 != null ? str3 : "";
            this.lastLoadingSharedAudioQuery = str4;
            tL_messages_searchGlobal.q = str4;
            tL_messages_searchGlobal.limit = 20;
            if (arrayList.size() > 0) {
                MessageObject messageObject = (MessageObject) Fragment$$ExternalSyntheticOutline0.m(1, arrayList);
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                tL_messages_searchGlobal.offset_rate = this.nextSearchRate;
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.loadingSharedAudioRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new StoryEntry$$ExternalSyntheticLambda12(this, 2));
            this.adapter.update(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            ChatAttachAlert.SearchFadeView searchFadeView = this.fadeView;
            searchFadeView.setAlpha(f);
            searchFadeView.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onSuccessDownload(String str) {
        MessageObject messageObject = this.downloadingMessageObject;
        if (messageObject == null || !TextUtils.equals(messageObject.getFileName(), str)) {
            return;
        }
        this.onAudioSelected.run(this.downloadingMessageObject);
        SelectAudioAlert selectAudioAlert = this.parentAlert;
        if (selectAudioAlert != null) {
            selectAudioAlert.lambda$showGiftOfferSheet$15();
        }
        lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void preDrawInternal(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.scrollableViewNoiseSuppressor != null) {
            blur3_InvalidateBlur();
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = this.iBlur3SourceGlassFrosted;
            if (blurredBackgroundSourceRenderNode != null) {
                blurredBackgroundSourceRenderNode.setSize(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                blurredBackgroundSourceRenderNode.renderNodeWithHash.updateDisplayListIfNeeded();
            }
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = this.iBlur3SourceGlass;
            if (blurredBackgroundSourceRenderNode2 != null) {
                blurredBackgroundSourceRenderNode2.setSize(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                blurredBackgroundSourceRenderNode2.renderNodeWithHash.updateDisplayListIfNeeded();
            }
        }
        updateSearchY();
        super.preDrawInternal(canvas, view);
    }

    public final void updateSearchY() {
        float y = AndroidUtilities.displaySize.y;
        for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            if (this.recyclerListView.getChildAdapterPosition(childAt) >= 1 && childAt.getY() < y) {
                y = childAt.getY();
            }
        }
        this.frameLayout.setTranslationY(Math.max(ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, y));
        this.animatorFadeVisible.setValue(y <= ((float) (ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)), true);
    }
}
