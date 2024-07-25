package org.telegram.ui.Stories.bots;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineId$$ExternalSyntheticBackport0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$InputMedia;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.tl.TL_bots$botPreviewMedia;
import org.telegram.tgnet.tl.TL_bots$deletePreviewMedia;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.tgnet.tl.TL_stories$TL_storyItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedPhotoVideoCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
public class BotPreviewsEditContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static LongSparseArray<LongSparseArray<BotPreviewsEditContainer>> attachedContainers;
    private static LongSparseArray<LongSparseArray<StoriesController.BotPreviewsList>> cachedLists;
    private final long bot_id;
    private final int currentAccount;
    private final BaseFragment fragment;
    private final ArrayList<StoriesController.BotPreviewsList> langLists;
    private final ArrayList<String> localLangs;
    private final StoriesController.BotPreviewsList mainList;
    private final Theme.ResourcesProvider resourcesProvider;
    private int setColumnsCount;
    private Boolean shownTabs;
    private float tabsAlpha;
    private ValueAnimator tabsAnimator;
    private final ViewPagerFixed.TabsView tabsView;
    private final ViewPagerFixed viewPager;
    private int visibleHeight;

    public int getStartedTrackingX() {
        return 0;
    }

    protected boolean isActionModeShowed() {
        return false;
    }

    protected boolean isSelected(MessageObject messageObject) {
        return false;
    }

    public void onSelectedTabChanged() {
    }

    protected boolean select(MessageObject messageObject) {
        return false;
    }

    protected boolean unselect(MessageObject messageObject) {
        return false;
    }

    public static void push(int i, long j, String str, TL_bots$botPreviewMedia tL_bots$botPreviewMedia) {
        LongSparseArray<BotPreviewsEditContainer> longSparseArray;
        BotPreviewsEditContainer botPreviewsEditContainer;
        LongSparseArray<StoriesController.BotPreviewsList> longSparseArray2;
        LongSparseArray<LongSparseArray<StoriesController.BotPreviewsList>> longSparseArray3 = cachedLists;
        if (longSparseArray3 != null && (longSparseArray2 = longSparseArray3.get(i)) != null) {
            StoriesController.BotPreviewsList botPreviewsList = longSparseArray2.get(j);
            if (botPreviewsList.currentAccount == i) {
                if (TextUtils.equals(botPreviewsList.lang_code, str)) {
                    botPreviewsList.push(tL_bots$botPreviewMedia);
                } else if (!TextUtils.isEmpty(str) && !botPreviewsList.lang_codes.contains(str)) {
                    botPreviewsList.lang_codes.add(str);
                    botPreviewsList.notifyUpdate();
                }
            }
        }
        LongSparseArray<LongSparseArray<BotPreviewsEditContainer>> longSparseArray4 = attachedContainers;
        if (longSparseArray4 == null || (longSparseArray = longSparseArray4.get(i)) == null || (botPreviewsEditContainer = longSparseArray.get(j)) == null) {
            return;
        }
        for (int i2 = 0; i2 < botPreviewsEditContainer.langLists.size(); i2++) {
            StoriesController.BotPreviewsList botPreviewsList2 = botPreviewsEditContainer.langLists.get(i2);
            if (botPreviewsList2.currentAccount == i && TextUtils.equals(botPreviewsList2.lang_code, str)) {
                botPreviewsList2.push(tL_bots$botPreviewMedia);
            }
        }
    }

    public static void edit(int i, long j, String str, TLRPC$InputMedia tLRPC$InputMedia, TL_bots$botPreviewMedia tL_bots$botPreviewMedia) {
        LongSparseArray<BotPreviewsEditContainer> longSparseArray;
        BotPreviewsEditContainer botPreviewsEditContainer;
        LongSparseArray<StoriesController.BotPreviewsList> longSparseArray2;
        LongSparseArray<LongSparseArray<StoriesController.BotPreviewsList>> longSparseArray3 = cachedLists;
        if (longSparseArray3 != null && (longSparseArray2 = longSparseArray3.get(i)) != null) {
            StoriesController.BotPreviewsList botPreviewsList = longSparseArray2.get(j);
            if (botPreviewsList.currentAccount == i) {
                if (TextUtils.equals(botPreviewsList.lang_code, str)) {
                    botPreviewsList.edit(tLRPC$InputMedia, tL_bots$botPreviewMedia);
                } else if (!TextUtils.isEmpty(str) && !botPreviewsList.lang_codes.contains(str)) {
                    botPreviewsList.lang_codes.add(str);
                    botPreviewsList.notifyUpdate();
                }
            }
        }
        LongSparseArray<LongSparseArray<BotPreviewsEditContainer>> longSparseArray4 = attachedContainers;
        if (longSparseArray4 == null || (longSparseArray = longSparseArray4.get(i)) == null || (botPreviewsEditContainer = longSparseArray.get(j)) == null) {
            return;
        }
        for (int i2 = 0; i2 < botPreviewsEditContainer.langLists.size(); i2++) {
            StoriesController.BotPreviewsList botPreviewsList2 = botPreviewsEditContainer.langLists.get(i2);
            if (botPreviewsList2.currentAccount == i && TextUtils.equals(botPreviewsList2.lang_code, str)) {
                botPreviewsList2.edit(tLRPC$InputMedia, tL_bots$botPreviewMedia);
            }
        }
    }

    public BotPreviewsEditContainer(final Context context, BaseFragment baseFragment, long j) {
        super(context);
        this.langLists = new ArrayList<>();
        this.localLangs = new ArrayList<>();
        this.shownTabs = null;
        this.visibleHeight = AndroidUtilities.displaySize.y;
        this.setColumnsCount = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.fragment = baseFragment;
        int currentAccount = baseFragment.getCurrentAccount();
        this.currentAccount = currentAccount;
        Theme.ResourcesProvider resourceProvider = baseFragment.getResourceProvider();
        this.resourcesProvider = resourceProvider;
        this.bot_id = j;
        setBackgroundColor(Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, resourceProvider), Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourceProvider), 0.04f)));
        if (cachedLists == null) {
            cachedLists = new LongSparseArray<>();
        }
        LongSparseArray<StoriesController.BotPreviewsList> longSparseArray = cachedLists.get(currentAccount);
        if (longSparseArray == null) {
            LongSparseArray<StoriesController.BotPreviewsList> longSparseArray2 = new LongSparseArray<>();
            cachedLists.put(currentAccount, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        StoriesController.BotPreviewsList botPreviewsList = longSparseArray.get(j);
        if (botPreviewsList == null) {
            botPreviewsList = new StoriesController.BotPreviewsList(currentAccount, j, "", null);
            longSparseArray.put(j, botPreviewsList);
        }
        this.mainList = botPreviewsList;
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            private String lastLang;

            @Override
            public boolean canScroll(MotionEvent motionEvent) {
                if (BotPreviewsEditContainer.this.isActionModeShowed()) {
                    return false;
                }
                return super.canScroll(motionEvent);
            }

            @Override
            public void onTabAnimationUpdate(boolean z) {
                String currentLang = BotPreviewsEditContainer.this.getCurrentLang();
                if (TextUtils.equals(this.lastLang, currentLang)) {
                    return;
                }
                this.lastLang = currentLang;
                BotPreviewsEditContainer.this.onSelectedTabChanged();
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAllowDisallowInterceptTouch(true);
        viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public int getItemCount() {
                return BotPreviewsEditContainer.this.langLists.size() + 1;
            }

            @Override
            public View createView(int i) {
                return new BotPreviewsEditLangContainer(context);
            }

            @Override
            public int getItemId(int i) {
                if (i == 0) {
                    return 0;
                }
                return ((StoriesController.BotPreviewsList) BotPreviewsEditContainer.this.langLists.get(i - 1)).lang_code.hashCode();
            }

            @Override
            public void bindView(View view, int i, int i2) {
                BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditLangContainer) view;
                StoriesController.BotPreviewsList botPreviewsList2 = i == 0 ? BotPreviewsEditContainer.this.mainList : (StoriesController.BotPreviewsList) BotPreviewsEditContainer.this.langLists.get(i - 1);
                botPreviewsEditLangContainer.setList(botPreviewsList2);
                botPreviewsEditLangContainer.setVisibleHeight(BotPreviewsEditContainer.this.visibleHeight);
                botPreviewsList2.load(true, 0, null);
            }

            @Override
            public String getItemTitle(int i) {
                if (i != 0) {
                    return TranslateAlert2.languageName(((StoriesController.BotPreviewsList) BotPreviewsEditContainer.this.langLists.get(i - 1)).lang_code);
                }
                return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
            }
        });
        addView(viewPagerFixed, LayoutHelper.createFrame(-1, -1, 119));
        ViewPagerFixed.TabsView createTabsView = viewPagerFixed.createTabsView(true, 9);
        this.tabsView = createTabsView;
        createTabsView.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                Boolean lambda$new$0;
                lambda$new$0 = BotPreviewsEditContainer.this.lambda$new$0((Integer) obj, (Integer) obj2);
                return lambda$new$0;
            }
        });
        addView(createTabsView, LayoutHelper.createFrame(-1, 42, 48));
        updateLangs(false);
    }

    public Boolean lambda$new$0(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            addTranslation();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void addTranslation() {
        new ChooseLanguageSheet(this.fragment, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BotPreviewsEditContainer.this.lambda$addTranslation$2((String) obj);
            }
        }).show();
    }

    public void lambda$addTranslation$2(final String str) {
        if (!this.localLangs.contains(str)) {
            this.localLangs.add(str);
            updateLangs(true);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotPreviewsEditContainer.this.lambda$addTranslation$1(str);
            }
        }, 120L);
    }

    public void lambda$addTranslation$1(String str) {
        int indexOf = this.localLangs.indexOf(str);
        if (indexOf >= 0) {
            this.tabsView.scrollToTab(str.hashCode(), indexOf + 1);
        }
    }

    public RecyclerListView getCurrentListView() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof BotPreviewsEditLangContainer) {
            return ((BotPreviewsEditLangContainer) currentView).listView;
        }
        return null;
    }

    public String getCurrentLang() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof BotPreviewsEditLangContainer) {
            BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditLangContainer) currentView;
            if (botPreviewsEditLangContainer.list != null) {
                return botPreviewsEditLangContainer.list.lang_code;
            }
            return null;
        }
        return null;
    }

    public StoriesController.BotPreviewsList getCurrentList() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof BotPreviewsEditLangContainer) {
            BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditLangContainer) currentView;
            if (botPreviewsEditLangContainer.list != null) {
                return botPreviewsEditLangContainer.list;
            }
            return null;
        }
        return null;
    }

    public int getItemsCount() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof BotPreviewsEditLangContainer) {
            BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditLangContainer) currentView;
            if (botPreviewsEditLangContainer.list != null) {
                return botPreviewsEditLangContainer.list.getCount();
            }
            return 0;
        }
        return 0;
    }

    public boolean canScroll(boolean z) {
        return z ? this.viewPager.getCurrentPosition() == (this.langLists.size() + 1) - 1 : this.viewPager.getCurrentPosition() == 0;
    }

    public boolean isSelectedAll() {
        StoriesController.BotPreviewsList botPreviewsList;
        View currentView = this.viewPager.getCurrentView();
        if ((currentView instanceof BotPreviewsEditLangContainer) && (botPreviewsList = ((BotPreviewsEditLangContainer) currentView).list) != null) {
            for (int i = 0; i < botPreviewsList.messageObjects.size(); i++) {
                if (!isSelected(botPreviewsList.messageObjects.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public void selectAll() {
        StoriesController.BotPreviewsList botPreviewsList;
        View currentView = this.viewPager.getCurrentView();
        if (!(currentView instanceof BotPreviewsEditLangContainer) || (botPreviewsList = ((BotPreviewsEditLangContainer) currentView).list) == null) {
            return;
        }
        for (int i = 0; i < botPreviewsList.messageObjects.size(); i++) {
            if (!isSelected(botPreviewsList.messageObjects.get(i))) {
                select(botPreviewsList.messageObjects.get(i));
            }
        }
    }

    public void unselectAll() {
        StoriesController.BotPreviewsList botPreviewsList;
        View currentView = this.viewPager.getCurrentView();
        if (!(currentView instanceof BotPreviewsEditLangContainer) || (botPreviewsList = ((BotPreviewsEditLangContainer) currentView).list) == null) {
            return;
        }
        for (int i = 0; i < botPreviewsList.messageObjects.size(); i++) {
            if (isSelected(botPreviewsList.messageObjects.get(i))) {
                unselect(botPreviewsList.messageObjects.get(i));
            }
        }
    }

    public boolean checkPinchToZoom(MotionEvent motionEvent) {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof BotPreviewsEditLangContainer) {
            return ((BotPreviewsEditLangContainer) currentView).checkPinchToZoom(motionEvent);
        }
        return false;
    }

    public void setVisibleHeight(int i) {
        this.visibleHeight = i;
        View[] viewPages = this.viewPager.getViewPages();
        if (viewPages != null) {
            for (int i2 = 0; i2 < viewPages.length; i2++) {
                if (viewPages[i2] instanceof BotPreviewsEditLangContainer) {
                    ((BotPreviewsEditLangContainer) viewPages[i2]).setVisibleHeight(i);
                }
            }
        }
    }

    public String getBotPreviewsSubtitle() {
        int i;
        int i2;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        StringBuilder sb = new StringBuilder();
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof BotPreviewsEditLangContainer) {
            StoriesController.BotPreviewsList botPreviewsList = ((BotPreviewsEditLangContainer) currentView).list;
            if (botPreviewsList != null) {
                i = 0;
                i2 = 0;
                for (int i3 = 0; i3 < botPreviewsList.messageObjects.size(); i3++) {
                    MessageObject messageObject = botPreviewsList.messageObjects.get(i3);
                    TL_stories$StoryItem tL_stories$StoryItem = messageObject.storyItem;
                    if (tL_stories$StoryItem != null && (tLRPC$MessageMedia = tL_stories$StoryItem.media) != null) {
                        if (MessageObject.isVideoDocument(tLRPC$MessageMedia.document)) {
                            i2++;
                        } else if (messageObject.storyItem.media.photo != null) {
                            i++;
                        }
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return LocaleController.getString(R.string.BotPreviewEmpty);
            }
            if (i > 0) {
                sb.append(LocaleController.formatPluralString("Images", i, new Object[0]));
            }
            if (i2 > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.formatPluralString("Videos", i2, new Object[0]));
            }
        }
        return sb.toString();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        View[] viewPages;
        int i3 = 0;
        if (i == NotificationCenter.storiesListUpdated) {
            if (objArr[0] == this.mainList) {
                updateLangs(true);
                View[] viewPages2 = this.viewPager.getViewPages();
                int length = viewPages2.length;
                while (i3 < length) {
                    View view = viewPages2[i3];
                    if (view instanceof BotPreviewsEditLangContainer) {
                        BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditLangContainer) view;
                        if (botPreviewsEditLangContainer.list == this.mainList) {
                            botPreviewsEditLangContainer.adapter.notifyDataSetChanged();
                        }
                    }
                    i3++;
                }
            } else if (this.langLists.indexOf(objArr[0]) >= 0) {
                for (View view2 : this.viewPager.getViewPages()) {
                    if (view2 instanceof BotPreviewsEditLangContainer) {
                        BotPreviewsEditLangContainer botPreviewsEditLangContainer2 = (BotPreviewsEditLangContainer) view2;
                        if (botPreviewsEditLangContainer2.list == objArr[0]) {
                            botPreviewsEditLangContainer2.adapter.notifyDataSetChanged();
                        }
                    }
                }
            }
        } else if (i == NotificationCenter.storiesUpdated) {
            updateLangs(true);
            View[] viewPages3 = this.viewPager.getViewPages();
            int length2 = viewPages3.length;
            while (i3 < length2) {
                View view3 = viewPages3[i3];
                boolean z = view3 instanceof BotPreviewsEditLangContainer;
                if (z && z) {
                    ((BotPreviewsEditLangContainer) view3).adapter.notifyDataSetChanged();
                }
                i3++;
            }
        }
    }

    private void updateLangs(boolean z) {
        StoriesController.BotPreviewsList botPreviewsList;
        StoryEntry storyEntry;
        ArrayList arrayList = new ArrayList(this.mainList.lang_codes);
        Iterator<String> it = this.localLangs.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!arrayList.contains(next)) {
                arrayList.add(next);
            }
        }
        ArrayList<StoriesController.UploadingStory> uploadingStories = MessagesController.getInstance(this.currentAccount).getStoriesController().getUploadingStories(this.bot_id);
        if (uploadingStories != null) {
            Iterator<StoriesController.UploadingStory> it2 = uploadingStories.iterator();
            while (it2.hasNext()) {
                StoriesController.UploadingStory next2 = it2.next();
                if (next2 != null && (storyEntry = next2.entry) != null && storyEntry.botId == this.bot_id && !TextUtils.isEmpty(storyEntry.botLang) && !arrayList.contains(next2.entry.botLang)) {
                    arrayList.add(next2.entry.botLang);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(this.langLists);
        this.langLists.clear();
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            String str = (String) it3.next();
            int i = 0;
            while (true) {
                if (i >= arrayList2.size()) {
                    botPreviewsList = null;
                    break;
                } else if (TextUtils.equals(((StoriesController.BotPreviewsList) arrayList2.get(i)).lang_code, str)) {
                    botPreviewsList = (StoriesController.BotPreviewsList) arrayList2.get(i);
                    break;
                } else {
                    i++;
                }
            }
            if (botPreviewsList == null) {
                botPreviewsList = new StoriesController.BotPreviewsList(this.currentAccount, this.bot_id, str, null);
                botPreviewsList.load(true, 0, null);
            }
            this.langLists.add(botPreviewsList);
        }
        this.viewPager.fillTabs(true);
        SpannableString spannableString = new SpannableString("+ " + LocaleController.getString(R.string.ProfileBotLanguageAdd));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_filled_plus);
        coloredImageSpan.setScale(0.9f, 0.9f);
        coloredImageSpan.spaceScaleX = 0.85f;
        spannableString.setSpan(coloredImageSpan, 0, 1, 33);
        this.tabsView.addTab(-1, spannableString);
        this.tabsView.finishAddingTabs();
        updateTabs(this.langLists.size() + 1 > 1, z);
    }

    public void deleteLang(String str) {
        StoriesController.BotPreviewsList botPreviewsList;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mainList.lang_codes.remove(str);
        this.localLangs.remove(str);
        int i = 0;
        while (true) {
            if (i >= this.langLists.size()) {
                botPreviewsList = null;
                break;
            }
            botPreviewsList = this.langLists.get(i);
            if (botPreviewsList != null && TextUtils.equals(botPreviewsList.lang_code, str)) {
                break;
            }
            i++;
        }
        if (botPreviewsList != null) {
            TL_bots$deletePreviewMedia tL_bots$deletePreviewMedia = new TL_bots$deletePreviewMedia();
            tL_bots$deletePreviewMedia.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.bot_id);
            tL_bots$deletePreviewMedia.lang_code = str;
            for (int i2 = 0; i2 < botPreviewsList.messageObjects.size(); i2++) {
                TL_stories$StoryItem tL_stories$StoryItem = botPreviewsList.messageObjects.get(i2).storyItem;
                if (tL_stories$StoryItem != null && (tLRPC$MessageMedia = tL_stories$StoryItem.media) != null) {
                    tL_bots$deletePreviewMedia.media.add(MessagesController.toInputMedia(tLRPC$MessageMedia));
                }
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_bots$deletePreviewMedia, null);
        }
        updateLangs(true);
        this.tabsView.scrollToTab(-1, 0);
    }

    private void updateTabs(final boolean z, boolean z2) {
        Boolean bool = this.shownTabs;
        if (bool == null || bool.booleanValue() != z) {
            ValueAnimator valueAnimator = this.tabsAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.shownTabs = Boolean.valueOf(z);
            if (!z2) {
                this.tabsAlpha = z ? 1.0f : 0.0f;
                this.tabsView.setTranslationY(AndroidUtilities.dp(z ? 0.0f : -42.0f));
                this.viewPager.setTranslationY(AndroidUtilities.dp(z ? 42.0f : 0.0f));
                return;
            }
            float[] fArr = new float[2];
            fArr[0] = this.tabsAlpha;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.tabsAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    BotPreviewsEditContainer.this.lambda$updateTabs$3(valueAnimator2);
                }
            });
            this.tabsAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    BotPreviewsEditContainer.this.tabsAlpha = z ? 1.0f : 0.0f;
                    BotPreviewsEditContainer.this.tabsView.setTranslationY(AndroidUtilities.dp(z ? 0.0f : -42.0f));
                    BotPreviewsEditContainer.this.viewPager.setTranslationY(AndroidUtilities.dp(z ? 42.0f : 0.0f));
                }
            });
            this.tabsAnimator.setDuration(320L);
            this.tabsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.tabsAnimator.start();
        }
    }

    public void lambda$updateTabs$3(ValueAnimator valueAnimator) {
        this.tabsAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.tabsView.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, this.tabsAlpha));
        this.viewPager.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), this.tabsAlpha));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (attachedContainers == null) {
            attachedContainers = new LongSparseArray<>();
        }
        LongSparseArray<BotPreviewsEditContainer> longSparseArray = attachedContainers.get(this.currentAccount);
        if (longSparseArray == null) {
            LongSparseArray<BotPreviewsEditContainer> longSparseArray2 = new LongSparseArray<>();
            attachedContainers.put(this.currentAccount, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        longSparseArray.put(this.bot_id, this);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (attachedContainers == null) {
            attachedContainers = new LongSparseArray<>();
        }
        LongSparseArray<BotPreviewsEditContainer> longSparseArray = attachedContainers.get(this.currentAccount);
        if (longSparseArray != null) {
            longSparseArray.remove(this.bot_id);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void updateSelection(boolean z) {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof BotPreviewsEditLangContainer) {
            ((BotPreviewsEditLangContainer) currentView).updateSelection(z);
        }
    }

    public class BotPreviewsEditLangContainer extends FrameLayout {
        private final StoriesAdapter adapter;
        private boolean allowStoriesSingleColumn;
        private int animateToColumnsCount;
        private boolean columnsAnimation;
        private float columnsAnimationProgress;
        private int columnsCount;
        private final StickerEmptyView emptyView;
        private final ButtonWithCounterView emptyViewButton2;
        private final TextView emptyViewOr;
        private final FooterView footer;
        boolean isInPinchToZoomTouchMode;
        private final DefaultItemAnimator itemAnimator;
        private final ExtendedGridLayoutManager layoutManager;
        private StoriesController.BotPreviewsList list;
        private final SharedMediaLayout.SharedMediaListView listView;
        boolean maybePinchToZoomTouchMode;
        boolean maybePinchToZoomTouchMode2;
        int pinchCenterOffset;
        int pinchCenterPosition;
        int pinchCenterX;
        int pinchCenterY;
        float pinchScale;
        boolean pinchScaleUp;
        float pinchStartDistance;
        private int pointerId1;
        private int pointerId2;
        private final FlickerLoadingView progressView;
        Rect rect;
        private ItemTouchHelper reorder;
        private boolean storiesColumnsCountSet;
        private final StoriesAdapter supportingAdapter;
        private final GridLayoutManager supportingLayoutManager;
        private final SharedMediaLayout.InternalListView supportingListView;

        public static boolean lambda$new$5(View view, MotionEvent motionEvent) {
            return true;
        }

        public void saveScrollPosition() {
        }

        public void setList(StoriesController.BotPreviewsList botPreviewsList) {
            if (this.list != botPreviewsList) {
                this.allowStoriesSingleColumn = false;
                this.storiesColumnsCountSet = false;
                this.columnsCount = BotPreviewsEditContainer.this.setColumnsCount;
            }
            this.list = botPreviewsList;
            this.adapter.setList(botPreviewsList);
            this.supportingAdapter.setList(botPreviewsList);
            updateFooter();
        }

        private void updateFooter() {
            String formatString;
            int i;
            String string;
            StoriesController.BotPreviewsList botPreviewsList = this.list;
            int count = botPreviewsList == null ? 0 : botPreviewsList.getCount();
            StoriesController.BotPreviewsList botPreviewsList2 = this.list;
            final boolean z = botPreviewsList2 == null || TextUtils.isEmpty(botPreviewsList2.lang_code);
            this.footer.setVisibility(count > 0 ? 0 : 8);
            FooterView footerView = this.footer;
            if (z) {
                formatString = LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral);
            } else {
                formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, TranslateAlert2.languageName(this.list.lang_code));
            }
            String str = formatString;
            String string2 = LocaleController.getString(R.string.ProfileBotAddPreview);
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    BotPreviewsEditContainer.BotPreviewsEditLangContainer.this.lambda$updateFooter$0();
                }
            };
            if (z || count <= 0) {
                if (z) {
                    i = R.string.ProfileBotPreviewFooterCreateTranslation;
                } else {
                    i = R.string.ProfileBotPreviewFooterDeleteTranslation;
                }
                string = LocaleController.getString(i);
            } else {
                string = null;
            }
            footerView.set(str, string2, runnable, string, (z || count <= 0) ? new Runnable() {
                @Override
                public final void run() {
                    BotPreviewsEditContainer.BotPreviewsEditLangContainer.this.lambda$updateFooter$1(z);
                }
            } : null);
            if (z) {
                this.emptyView.title.setVisibility(0);
                this.emptyView.title.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
                this.emptyView.subtitle.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(BotPreviewsEditContainer.this.currentAccount).botPreviewMediasMax, new Object[0]));
                this.emptyView.button.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false);
                this.emptyViewOr.setVisibility(8);
                this.emptyViewButton2.setVisibility(8);
                return;
            }
            this.emptyView.title.setVisibility(8);
            this.emptyView.subtitle.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, TranslateAlert2.languageName(this.list.lang_code)));
            this.emptyViewOr.setVisibility(0);
            this.emptyViewButton2.setVisibility(0);
            this.emptyViewButton2.setText(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false);
            this.emptyViewButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    BotPreviewsEditContainer.BotPreviewsEditLangContainer.this.lambda$updateFooter$2(view);
                }
            });
        }

        public void lambda$updateFooter$0() {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.instance;
            }
            StoryRecorder storyRecorder = StoryRecorder.getInstance(findActivity, BotPreviewsEditContainer.this.currentAccount);
            long j = BotPreviewsEditContainer.this.bot_id;
            StoriesController.BotPreviewsList botPreviewsList = this.list;
            storyRecorder.openBot(j, botPreviewsList == null ? "" : botPreviewsList.lang_code, null);
        }

        public void lambda$updateFooter$1(boolean z) {
            if (z) {
                BotPreviewsEditContainer.this.addTranslation();
            } else {
                BotPreviewsEditContainer.this.deleteLang(this.list.lang_code);
            }
        }

        public void lambda$updateFooter$2(View view) {
            BotPreviewsEditContainer.this.deleteLang(this.list.lang_code);
        }

        public void setVisibleHeight(int i) {
            float f = (-(getMeasuredHeight() - Math.max(i, AndroidUtilities.dp(280.0f)))) / 2.0f;
            this.emptyView.setTranslationY(f);
            this.progressView.setTranslationY(-f);
        }

        public BotPreviewsEditLangContainer(final Context context) {
            super(context);
            this.columnsCount = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
            this.animateToColumnsCount = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
            this.allowStoriesSingleColumn = false;
            this.storiesColumnsCountSet = false;
            this.rect = new Rect();
            ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(this, context, 100, BotPreviewsEditContainer.this) {
                private final Size size = new Size();

                @Override
                public int getFlowItemCount() {
                    return 0;
                }

                @Override
                public boolean supportsPredictiveItemAnimations() {
                    return false;
                }

                @Override
                public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
                    super.calculateExtraLayoutSpace(state, iArr);
                    iArr[1] = Math.max(iArr[1], SharedPhotoVideoCell.getItemSize(1) * 2);
                }

                @Override
                protected Size getSizeForItem(int i) {
                    Size size = this.size;
                    size.height = 100.0f;
                    size.width = 100.0f;
                    return size;
                }

                @Override
                public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfoForItem(recycler, state, view, accessibilityNodeInfoCompat);
                    AccessibilityNodeInfoCompat.CollectionItemInfoCompat collectionItemInfo = accessibilityNodeInfoCompat.getCollectionItemInfo();
                    if (collectionItemInfo == null || !collectionItemInfo.isHeading()) {
                        return;
                    }
                    accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false));
                }

                @Override
                public void setSpanCount(int i) {
                    super.setSpanCount(i);
                }
            };
            this.layoutManager = extendedGridLayoutManager;
            extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(BotPreviewsEditContainer.this) {
                @Override
                public int getSpanSize(int i) {
                    if (BotPreviewsEditLangContainer.this.adapter.getItemViewType(i) == 2) {
                        return BotPreviewsEditLangContainer.this.columnsCount;
                    }
                    return 1;
                }
            });
            extendedGridLayoutManager.setSpanCount(this.columnsCount);
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            this.itemAnimator = defaultItemAnimator;
            defaultItemAnimator.setDurations(280L);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            SharedMediaLayout.SharedMediaListView sharedMediaListView = new SharedMediaLayout.SharedMediaListView(context, BotPreviewsEditContainer.this) {
                @Override
                public boolean isStories() {
                    return true;
                }

                @Override
                public int getColumnsCount() {
                    return BotPreviewsEditLangContainer.this.columnsCount;
                }

                @Override
                public int getAnimateToColumnsCount() {
                    return BotPreviewsEditLangContainer.this.animateToColumnsCount;
                }

                @Override
                public boolean isChangeColumnsAnimation() {
                    return BotPreviewsEditLangContainer.this.columnsAnimation;
                }

                @Override
                public float getChangeColumnsProgress() {
                    return BotPreviewsEditLangContainer.this.columnsAnimationProgress;
                }

                @Override
                public SharedMediaLayout.InternalListView getSupportingListView() {
                    return BotPreviewsEditLangContainer.this.supportingListView;
                }

                @Override
                public RecyclerListView.FastScrollAdapter getMovingAdapter() {
                    if (!BotPreviewsEditLangContainer.this.reorder.isIdle() || BotPreviewsEditContainer.this.isActionModeShowed()) {
                        return null;
                    }
                    return BotPreviewsEditLangContainer.this.adapter;
                }

                @Override
                public RecyclerListView.FastScrollAdapter getSupportingAdapter() {
                    return BotPreviewsEditLangContainer.this.supportingAdapter;
                }

                @Override
                public void dispatchDraw(Canvas canvas) {
                    super.dispatchDraw(canvas);
                    float listBottom = getListBottom(this);
                    if (BotPreviewsEditLangContainer.this.columnsAnimation) {
                        listBottom = AndroidUtilities.lerp(listBottom, getListBottom(BotPreviewsEditLangContainer.this.supportingListView), BotPreviewsEditLangContainer.this.columnsAnimationProgress);
                    }
                    BotPreviewsEditLangContainer.this.footer.setVisibility(BotPreviewsEditLangContainer.this.adapter.getItemCount() > 0 ? 0 : 8);
                    BotPreviewsEditLangContainer.this.footer.setTranslationY(listBottom);
                }

                private int getListBottom(ViewGroup viewGroup) {
                    int i = 0;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        int bottom = viewGroup.getChildAt(i2).getBottom() - viewGroup.getPaddingTop();
                        if (bottom > i) {
                            i = bottom;
                        }
                    }
                    return i;
                }
            };
            this.listView = sharedMediaListView;
            sharedMediaListView.setScrollingTouchSlop(1);
            sharedMediaListView.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
            sharedMediaListView.setPadding(0, 0, 0, 0);
            sharedMediaListView.setItemAnimator(null);
            sharedMediaListView.setClipToPadding(false);
            sharedMediaListView.setSectionsType(2);
            sharedMediaListView.setLayoutManager(extendedGridLayoutManager);
            addView(sharedMediaListView, LayoutHelper.createFrame(-1, -1.0f));
            sharedMediaListView.addItemDecoration(new RecyclerView.ItemDecoration(BotPreviewsEditContainer.this) {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    if (view instanceof SharedPhotoVideoCell2) {
                        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                        int childAdapterPosition = BotPreviewsEditLangContainer.this.listView.getChildAdapterPosition(sharedPhotoVideoCell2);
                        int spanCount = BotPreviewsEditLangContainer.this.layoutManager.getSpanCount();
                        int i = childAdapterPosition % spanCount;
                        sharedPhotoVideoCell2.isFirst = i == 0;
                        sharedPhotoVideoCell2.isLast = i == spanCount - 1;
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                        return;
                    }
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                }
            });
            sharedMediaListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i) {
                    BotPreviewsEditContainer.BotPreviewsEditLangContainer.this.lambda$new$3(view, i);
                }
            });
            sharedMediaListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
                @Override
                public final boolean onItemClick(View view, int i) {
                    boolean lambda$new$4;
                    lambda$new$4 = BotPreviewsEditContainer.BotPreviewsEditLangContainer.this.lambda$new$4(view, i);
                    return lambda$new$4;
                }
            });
            SharedMediaLayout.InternalListView internalListView = new SharedMediaLayout.InternalListView(context);
            this.supportingListView = internalListView;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3, BotPreviewsEditContainer.this) {
                @Override
                public boolean supportsPredictiveItemAnimations() {
                    return false;
                }

                @Override
                public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    if (BotPreviewsEditLangContainer.this.columnsAnimation) {
                        i = 0;
                    }
                    return super.scrollVerticallyBy(i, recycler, state);
                }
            };
            this.supportingLayoutManager = gridLayoutManager;
            internalListView.setLayoutManager(gridLayoutManager);
            internalListView.addItemDecoration(new RecyclerView.ItemDecoration(BotPreviewsEditContainer.this) {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    if (view instanceof SharedPhotoVideoCell2) {
                        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                        int childAdapterPosition = BotPreviewsEditLangContainer.this.supportingListView.getChildAdapterPosition(sharedPhotoVideoCell2);
                        int spanCount = BotPreviewsEditLangContainer.this.supportingLayoutManager.getSpanCount();
                        int i = childAdapterPosition % spanCount;
                        sharedPhotoVideoCell2.isFirst = i == 0;
                        sharedPhotoVideoCell2.isLast = i == spanCount - 1;
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                        return;
                    }
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                }
            });
            gridLayoutManager.setSpanCount(this.animateToColumnsCount);
            internalListView.setVisibility(8);
            addView(internalListView, LayoutHelper.createFrame(-1, -1.0f));
            StoriesAdapter storiesAdapter = new StoriesAdapter(context, BotPreviewsEditContainer.this) {
                @Override
                public void notifyDataSetChanged() {
                    super.notifyDataSetChanged();
                    if (BotPreviewsEditLangContainer.this.supportingListView.getVisibility() == 0) {
                        BotPreviewsEditLangContainer.this.supportingAdapter.notifyDataSetChanged();
                    }
                    if (BotPreviewsEditLangContainer.this.emptyView != null) {
                        StickerEmptyView stickerEmptyView = BotPreviewsEditLangContainer.this.emptyView;
                        StoriesController.StoriesList storiesList = this.storiesList;
                        stickerEmptyView.showProgress(storiesList != null && storiesList.isLoading());
                    }
                }
            };
            this.adapter = storiesAdapter;
            sharedMediaListView.setAdapter(storiesAdapter);
            StoriesAdapter makeSupporting = storiesAdapter.makeSupporting();
            this.supportingAdapter = makeSupporting;
            internalListView.setAdapter(makeSupporting);
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, BotPreviewsEditContainer.this) {
                private final Paint backgroundPaint = new Paint();

                @Override
                public int getColumnsCount() {
                    return BotPreviewsEditLangContainer.this.columnsCount;
                }

                @Override
                public int getViewType() {
                    setIsSingleCell(false);
                    return 27;
                }

                @Override
                public void onDraw(Canvas canvas) {
                    this.backgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, BotPreviewsEditContainer.this.resourcesProvider));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.backgroundPaint);
                    super.onDraw(canvas);
                }
            };
            this.progressView = flickerLoadingView;
            flickerLoadingView.showDate(false);
            StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, 1);
            this.emptyView = stickerEmptyView;
            stickerEmptyView.setVisibility(8);
            stickerEmptyView.setAnimateLayoutChange(true);
            addView(stickerEmptyView, LayoutHelper.createFrame(-1, -1.0f));
            stickerEmptyView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$new$5;
                    lambda$new$5 = BotPreviewsEditContainer.BotPreviewsEditLangContainer.lambda$new$5(view, motionEvent);
                    return lambda$new$5;
                }
            });
            stickerEmptyView.showProgress(true, false);
            stickerEmptyView.stickerView.setVisibility(8);
            stickerEmptyView.title.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            stickerEmptyView.subtitle.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(BotPreviewsEditContainer.this.currentAccount).botPreviewMediasMax, new Object[0]));
            stickerEmptyView.button.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false);
            stickerEmptyView.button.setVisibility(0);
            stickerEmptyView.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    BotPreviewsEditContainer.BotPreviewsEditLangContainer.this.lambda$new$6(context, view);
                }
            });
            TextView textView = new TextView(context, BotPreviewsEditContainer.this) {
                private final Paint paint = new Paint(1);

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    int height = (getHeight() / 2) + AndroidUtilities.dp(1.0f);
                    int max = Math.max(1, AndroidUtilities.dp(0.66f));
                    Layout layout = getLayout();
                    if (layout != null) {
                        this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, BotPreviewsEditContainer.this.resourcesProvider), 0.45f));
                        float f = height;
                        float f2 = max / 2.0f;
                        float f3 = f - f2;
                        float f4 = f + f2;
                        canvas.drawRect(0.0f, f3, (getWidth() - (layout.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f4, this.paint);
                        canvas.drawRect(((getWidth() + layout.getLineWidth(0)) + AndroidUtilities.dp(16.0f)) / 2.0f, f3, getWidth(), f4, this.paint);
                    }
                    super.dispatchDraw(canvas);
                }
            };
            this.emptyViewOr = textView;
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, BotPreviewsEditContainer.this.resourcesProvider));
            textView.setText(LocaleController.getString(R.string.ProfileBotOr));
            textView.setTextSize(1, 14.0f);
            textView.setTextAlignment(4);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            stickerEmptyView.linearLayout.addView(textView, LayoutHelper.createLinear(165, -2, 17, 0, 17, 0, 12));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, false, BotPreviewsEditContainer.this.resourcesProvider);
            this.emptyViewButton2 = buttonWithCounterView;
            buttonWithCounterView.setMinWidth(AndroidUtilities.dp(200.0f));
            stickerEmptyView.linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-2, 44, 17));
            stickerEmptyView.addView(flickerLoadingView, LayoutHelper.createFrame(-1, -1.0f));
            sharedMediaListView.setEmptyView(stickerEmptyView);
            sharedMediaListView.setAnimateEmptyView(true, 0);
            new RecyclerAnimationScrollHelper(sharedMediaListView, extendedGridLayoutManager);
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback(BotPreviewsEditContainer.this) {
                @Override
                public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
                }

                @Override
                public boolean isLongPressDragEnabled() {
                    return BotPreviewsEditContainer.this.isActionModeShowed();
                }

                @Override
                public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    if (BotPreviewsEditContainer.this.isActionModeShowed() && BotPreviewsEditLangContainer.this.adapter.canReorder(viewHolder.getAdapterPosition())) {
                        BotPreviewsEditLangContainer.this.listView.setItemAnimator(BotPreviewsEditLangContainer.this.itemAnimator);
                        return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
                    }
                    return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                }

                @Override
                public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    if (BotPreviewsEditLangContainer.this.adapter.canReorder(viewHolder.getAdapterPosition()) && BotPreviewsEditLangContainer.this.adapter.canReorder(viewHolder2.getAdapterPosition())) {
                        BotPreviewsEditLangContainer.this.adapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
                        return true;
                    }
                    return false;
                }

                @Override
                public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
                    if (viewHolder != null) {
                        BotPreviewsEditLangContainer.this.listView.hideSelector(false);
                    }
                    if (i == 0) {
                        BotPreviewsEditLangContainer.this.adapter.reorderDone();
                        BotPreviewsEditLangContainer.this.listView.setItemAnimator(null);
                    } else {
                        BotPreviewsEditLangContainer.this.listView.cancelClickRunnables(false);
                        if (viewHolder != null) {
                            viewHolder.itemView.setPressed(true);
                        }
                    }
                    super.onSelectedChanged(viewHolder, i);
                }

                @Override
                public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    super.clearView(recyclerView, viewHolder);
                    viewHolder.itemView.setPressed(false);
                }
            });
            this.reorder = itemTouchHelper;
            itemTouchHelper.attachToRecyclerView(sharedMediaListView);
            FooterView footerView = new FooterView(this, context, BotPreviewsEditContainer.this.resourcesProvider);
            this.footer = footerView;
            addView(footerView, LayoutHelper.createFrame(-1, -2, 48));
        }

        public void lambda$new$3(View view, int i) {
            if (view instanceof SharedPhotoVideoCell2) {
                MessageObject messageObject = ((SharedPhotoVideoCell2) view).getMessageObject();
                if (BotPreviewsEditContainer.this.isActionModeShowed()) {
                    if (BotPreviewsEditContainer.this.isSelected(messageObject)) {
                        BotPreviewsEditContainer.this.unselect(messageObject);
                        return;
                    } else {
                        BotPreviewsEditContainer.this.select(messageObject);
                        return;
                    }
                }
                BotPreviewsEditContainer.this.fragment.getOrCreateStoryViewer().open(getContext(), messageObject.getId(), this.list, StoriesListPlaceProvider.of(this.listView).addBottomClip(((BotPreviewsEditContainer.this.fragment instanceof ProfileActivity) && ((ProfileActivity) BotPreviewsEditContainer.this.fragment).myProfile) ? AndroidUtilities.dp(68.0f) : 0));
            }
        }

        public boolean lambda$new$4(View view, int i) {
            if (!BotPreviewsEditContainer.this.isActionModeShowed() && (view instanceof SharedPhotoVideoCell2)) {
                MessageObject messageObject = ((SharedPhotoVideoCell2) view).getMessageObject();
                if (BotPreviewsEditContainer.this.isSelected(messageObject)) {
                    BotPreviewsEditContainer.this.unselect(messageObject);
                    return true;
                }
                BotPreviewsEditContainer.this.select(messageObject);
                return true;
            }
            return false;
        }

        public void lambda$new$6(Context context, View view) {
            Activity findActivity = AndroidUtilities.findActivity(context);
            if (findActivity == null) {
                findActivity = LaunchActivity.instance;
            }
            StoryRecorder storyRecorder = StoryRecorder.getInstance(findActivity, BotPreviewsEditContainer.this.currentAccount);
            long j = BotPreviewsEditContainer.this.bot_id;
            StoriesController.BotPreviewsList botPreviewsList = this.list;
            storyRecorder.openBot(j, botPreviewsList == null ? "" : botPreviewsList.lang_code, null);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            SharedMediaLayout.SharedMediaListView sharedMediaListView = this.listView;
            int paddingLeft = sharedMediaListView.getPaddingLeft();
            SharedMediaLayout.SharedMediaListView sharedMediaListView2 = this.listView;
            sharedMediaListView.setPadding(paddingLeft, sharedMediaListView2.topPadding, sharedMediaListView2.getPaddingRight(), AndroidUtilities.dp(42.0f) + this.footer.getMeasuredHeight());
        }

        public void updateSelection(boolean z) {
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                    sharedPhotoVideoCell2.setChecked(BotPreviewsEditContainer.this.isSelected(sharedPhotoVideoCell2.getMessageObject()), z);
                }
            }
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.supportingListView) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        public class StoriesAdapter extends RecyclerListView.FastScrollAdapter {
            public boolean applyingReorder;
            private final Context context;
            FlickerLoadingView globalGradientView;
            private SharedPhotoVideoCell2.SharedResources sharedResources;
            public StoriesController.StoriesList storiesList;
            private StoriesAdapter supportingAdapter;
            private final ArrayList<StoriesController.UploadingStory> uploadingStories = new ArrayList<>();
            public ArrayList<Integer> lastPinnedIds = new ArrayList<>();

            @Override
            public int getItemViewType(int i) {
                return 19;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return false;
            }

            @Override
            public void onFastScrollSingleTap() {
            }

            public StoriesAdapter(Context context) {
                this.context = context;
                checkColumns();
            }

            public void setList(StoriesController.StoriesList storiesList) {
                this.storiesList = storiesList;
                if (this != BotPreviewsEditLangContainer.this.supportingAdapter) {
                    checkColumns();
                }
                notifyDataSetChanged();
            }

            public StoriesAdapter makeSupporting() {
                BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                StoriesAdapter storiesAdapter = new StoriesAdapter(botPreviewsEditLangContainer.getContext());
                this.supportingAdapter = storiesAdapter;
                return storiesAdapter;
            }

            private void checkColumns() {
                if (this.storiesList == null) {
                    return;
                }
                if ((!BotPreviewsEditLangContainer.this.storiesColumnsCountSet || (BotPreviewsEditLangContainer.this.allowStoriesSingleColumn && getItemCount() > 1)) && getItemCount() > 0) {
                    if (getItemCount() < 5) {
                        BotPreviewsEditLangContainer.this.columnsCount = Math.max(1, getItemCount());
                        BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                        botPreviewsEditLangContainer.allowStoriesSingleColumn = botPreviewsEditLangContainer.columnsCount == 1;
                    } else if (BotPreviewsEditLangContainer.this.allowStoriesSingleColumn || BotPreviewsEditLangContainer.this.columnsCount == 1) {
                        BotPreviewsEditLangContainer.this.allowStoriesSingleColumn = false;
                        BotPreviewsEditLangContainer.this.columnsCount = Math.max(2, SharedConfig.storiesColumnsCount);
                    }
                    BotPreviewsEditLangContainer.this.layoutManager.setSpanCount(BotPreviewsEditLangContainer.this.columnsCount);
                    BotPreviewsEditLangContainer.this.storiesColumnsCountSet = true;
                }
            }

            @Override
            public void notifyDataSetChanged() {
                StoriesController.StoriesList storiesList = this.storiesList;
                if (storiesList instanceof StoriesController.BotPreviewsList) {
                    StoriesController.BotPreviewsList botPreviewsList = (StoriesController.BotPreviewsList) storiesList;
                    this.uploadingStories.clear();
                    ArrayList<StoriesController.UploadingStory> uploadingStories = MessagesController.getInstance(this.storiesList.currentAccount).getStoriesController().getUploadingStories(BotPreviewsEditContainer.this.bot_id);
                    if (uploadingStories != null) {
                        for (int i = 0; i < uploadingStories.size(); i++) {
                            StoriesController.UploadingStory uploadingStory = uploadingStories.get(i);
                            StoryEntry storyEntry = uploadingStory.entry;
                            if (storyEntry != null && TextUtils.equals(storyEntry.botLang, botPreviewsList.lang_code)) {
                                this.uploadingStories.add(uploadingStory);
                            }
                        }
                    }
                }
                super.notifyDataSetChanged();
                StoriesAdapter storiesAdapter = this.supportingAdapter;
                if (storiesAdapter != null) {
                    storiesAdapter.notifyDataSetChanged();
                }
                if (this != BotPreviewsEditLangContainer.this.supportingAdapter) {
                    checkColumns();
                }
            }

            @Override
            public int getItemCount() {
                if (this.storiesList == null) {
                    return 0;
                }
                return this.uploadingStories.size() + this.storiesList.getCount();
            }

            @Override
            public int getTotalItemsCount() {
                return getItemCount();
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (this.sharedResources == null) {
                    this.sharedResources = new SharedPhotoVideoCell2.SharedResources(viewGroup.getContext(), BotPreviewsEditContainer.this.resourcesProvider);
                }
                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = new SharedPhotoVideoCell2(this.context, this.sharedResources, BotPreviewsEditContainer.this.currentAccount);
                sharedPhotoVideoCell2.setCheck2();
                sharedPhotoVideoCell2.setGradientView(this.globalGradientView);
                sharedPhotoVideoCell2.isStory = true;
                return new RecyclerListView.Holder(sharedPhotoVideoCell2);
            }

            private int columnsCount() {
                return this == this.supportingAdapter ? BotPreviewsEditLangContainer.this.animateToColumnsCount : BotPreviewsEditLangContainer.this.columnsCount;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (this.storiesList == null) {
                    return;
                }
                viewHolder.getItemViewType();
                View view = viewHolder.itemView;
                if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    sharedPhotoVideoCell2.isStory = true;
                    if (i >= 0 && i < this.uploadingStories.size()) {
                        StoriesController.UploadingStory uploadingStory = this.uploadingStories.get(i);
                        sharedPhotoVideoCell2.isStoryPinned = false;
                        if (uploadingStory.sharedMessageObject == null) {
                            TL_stories$TL_storyItem tL_stories$TL_storyItem = new TL_stories$TL_storyItem();
                            int m = CoroutineId$$ExternalSyntheticBackport0.m(uploadingStory.random_id);
                            tL_stories$TL_storyItem.messageId = m;
                            tL_stories$TL_storyItem.id = m;
                            tL_stories$TL_storyItem.attachPath = uploadingStory.firstFramePath;
                            MessageObject messageObject = new MessageObject(this, this.storiesList.currentAccount, tL_stories$TL_storyItem) {
                                @Override
                                public float getProgress() {
                                    return this.uploadingStory.progress;
                                }
                            };
                            uploadingStory.sharedMessageObject = messageObject;
                            messageObject.uploadingStory = uploadingStory;
                        }
                        sharedPhotoVideoCell2.setMessageObject(uploadingStory.sharedMessageObject, columnsCount());
                        sharedPhotoVideoCell2.isStory = true;
                        sharedPhotoVideoCell2.setReorder(false);
                        sharedPhotoVideoCell2.setChecked(false, false);
                        return;
                    }
                    int size = i - this.uploadingStories.size();
                    if (size < 0 || size >= this.storiesList.messageObjects.size()) {
                        sharedPhotoVideoCell2.isStoryPinned = false;
                        sharedPhotoVideoCell2.setMessageObject(null, columnsCount());
                        sharedPhotoVideoCell2.isStory = true;
                        return;
                    }
                    MessageObject messageObject2 = this.storiesList.messageObjects.get(size);
                    sharedPhotoVideoCell2.isStoryPinned = messageObject2 != null && this.storiesList.isPinned(messageObject2.getId());
                    sharedPhotoVideoCell2.setReorder(true);
                    sharedPhotoVideoCell2.setMessageObject(messageObject2, columnsCount());
                    if (BotPreviewsEditContainer.this.isActionModeShowed() && messageObject2 != null) {
                        sharedPhotoVideoCell2.setChecked(BotPreviewsEditContainer.this.isSelected(messageObject2), true);
                    } else {
                        sharedPhotoVideoCell2.setChecked(false, false);
                    }
                }
            }

            @Override
            public String getLetter(int i) {
                MessageObject messageObject;
                TL_stories$StoryItem tL_stories$StoryItem;
                StoriesController.StoriesList storiesList = this.storiesList;
                if (storiesList == null || i < 0 || i >= storiesList.messageObjects.size() || (messageObject = this.storiesList.messageObjects.get(i)) == null || (tL_stories$StoryItem = messageObject.storyItem) == null) {
                    return null;
                }
                return LocaleController.formatYearMont(tL_stories$StoryItem.date, true);
            }

            public boolean canReorder(int i) {
                StoriesController.StoriesList storiesList = this.storiesList;
                if (storiesList == null) {
                    return false;
                }
                if (storiesList instanceof StoriesController.BotPreviewsList) {
                    TLRPC$User user = MessagesController.getInstance(BotPreviewsEditContainer.this.currentAccount).getUser(Long.valueOf(BotPreviewsEditContainer.this.bot_id));
                    return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
                } else if (i < 0 || i >= storiesList.messageObjects.size()) {
                    return false;
                } else {
                    return this.storiesList.isPinned(this.storiesList.messageObjects.get(i).getId());
                }
            }

            public boolean swapElements(int i, int i2) {
                ArrayList<Integer> arrayList;
                StoriesController.StoriesList storiesList = this.storiesList;
                if (storiesList != null && i >= 0 && i < storiesList.messageObjects.size() && i2 >= 0 && i2 < this.storiesList.messageObjects.size()) {
                    if (this.storiesList instanceof StoriesController.BotPreviewsList) {
                        arrayList = new ArrayList<>();
                        for (int i3 = 0; i3 < this.storiesList.messageObjects.size(); i3++) {
                            arrayList.add(Integer.valueOf(this.storiesList.messageObjects.get(i3).getId()));
                        }
                    } else {
                        arrayList = new ArrayList<>(this.storiesList.pinnedIds);
                    }
                    if (!this.applyingReorder) {
                        this.lastPinnedIds.clear();
                        this.lastPinnedIds.addAll(arrayList);
                        this.applyingReorder = true;
                    }
                    MessageObject messageObject = this.storiesList.messageObjects.get(i);
                    this.storiesList.messageObjects.get(i2);
                    arrayList.remove(Integer.valueOf(messageObject.getId()));
                    arrayList.add(Utilities.clamp(i2, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
                    this.storiesList.updatePinnedOrder(arrayList, false);
                    notifyItemMoved(i, i2);
                    return true;
                }
                return false;
            }

            public void reorderDone() {
                ArrayList<Integer> arrayList;
                StoriesController.StoriesList storiesList = this.storiesList;
                if (storiesList != null && this.applyingReorder) {
                    if (storiesList instanceof StoriesController.BotPreviewsList) {
                        arrayList = new ArrayList<>();
                        for (int i = 0; i < this.storiesList.messageObjects.size(); i++) {
                            arrayList.add(Integer.valueOf(this.storiesList.messageObjects.get(i).getId()));
                        }
                    } else {
                        arrayList = storiesList.pinnedIds;
                    }
                    boolean z = this.lastPinnedIds.size() != arrayList.size();
                    if (!z) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= this.lastPinnedIds.size()) {
                                break;
                            } else if (this.lastPinnedIds.get(i2) != arrayList.get(i2)) {
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (z) {
                        this.storiesList.updatePinnedOrder(arrayList, true);
                    }
                    this.applyingReorder = false;
                }
            }

            @Override
            public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
                int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
                int columnsCount = columnsCount();
                double ceil = Math.ceil(getTotalItemsCount() / columnsCount);
                double d = measuredHeight;
                Double.isNaN(d);
                int i = (int) (ceil * d);
                int measuredHeight2 = recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop();
                if (measuredHeight == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                    return;
                }
                float f2 = f * (i - measuredHeight2);
                iArr[0] = ((int) (f2 / measuredHeight)) * columnsCount;
                iArr[1] = ((int) f2) % measuredHeight;
            }
        }

        public boolean checkPinchToZoom(MotionEvent motionEvent) {
            if (this.list == null || getParent() == null) {
                return false;
            }
            if (!this.columnsAnimation || this.isInPinchToZoomTouchMode) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.maybePinchToZoomTouchMode && !this.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                        this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.pinchScale = 1.0f;
                        this.pointerId1 = motionEvent.getPointerId(0);
                        this.pointerId2 = motionEvent.getPointerId(1);
                        this.listView.cancelClickRunnables(false);
                        this.listView.cancelLongPress();
                        this.listView.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view = (View) getParent();
                        this.pinchCenterX = (int) ((((int) ((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f)) - view.getX()) - getX());
                        int y = (int) ((((int) ((motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f)) - view.getY()) - getY());
                        this.pinchCenterY = y;
                        selectPinchPosition(this.pinchCenterX, y);
                        this.maybePinchToZoomTouchMode2 = true;
                    }
                    if (motionEvent.getActionMasked() == 0 && (motionEvent.getY() - ((View) getParent()).getY()) - getY() > 0.0f) {
                        this.maybePinchToZoomTouchMode = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && (this.isInPinchToZoomTouchMode || this.maybePinchToZoomTouchMode2)) {
                    int i = -1;
                    int i2 = -1;
                    for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                        if (this.pointerId1 == motionEvent.getPointerId(i3)) {
                            i = i3;
                        }
                        if (this.pointerId2 == motionEvent.getPointerId(i3)) {
                            i2 = i3;
                        }
                    }
                    if (i == -1 || i2 == -1) {
                        this.maybePinchToZoomTouchMode = false;
                        this.maybePinchToZoomTouchMode2 = false;
                        this.isInPinchToZoomTouchMode = false;
                        finishPinchToMediaColumnsCount();
                        return false;
                    }
                    float hypot = ((float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i))) / this.pinchStartDistance;
                    this.pinchScale = hypot;
                    if (!this.isInPinchToZoomTouchMode && (hypot > 1.01f || hypot < 0.99f)) {
                        this.isInPinchToZoomTouchMode = true;
                        boolean z = hypot > 1.0f;
                        this.pinchScaleUp = z;
                        startPinchToMediaColumnsCount(z);
                    }
                    if (this.isInPinchToZoomTouchMode) {
                        boolean z2 = this.pinchScaleUp;
                        if ((!z2 || this.pinchScale >= 1.0f) && (z2 || this.pinchScale <= 1.0f)) {
                            this.columnsAnimationProgress = Math.max(0.0f, Math.min(1.0f, z2 ? 1.0f - ((2.0f - this.pinchScale) / 1.0f) : (1.0f - this.pinchScale) / 0.5f));
                        } else {
                            this.columnsAnimationProgress = 0.0f;
                        }
                        float f = this.columnsAnimationProgress;
                        if (f == 1.0f || f == 0.0f) {
                            if (f == 1.0f) {
                                int ceil = (int) Math.ceil(this.pinchCenterPosition / this.animateToColumnsCount);
                                float startedTrackingX = BotPreviewsEditContainer.this.getStartedTrackingX() / (this.listView.getMeasuredWidth() - ((int) (this.listView.getMeasuredWidth() / this.animateToColumnsCount)));
                                int i4 = this.animateToColumnsCount;
                                int i5 = (ceil * i4) + ((int) (startedTrackingX * (i4 - 1)));
                                if (i5 >= this.adapter.getItemCount()) {
                                    i5 = this.adapter.getItemCount() - 1;
                                }
                                this.pinchCenterPosition = i5;
                            }
                            finishPinchToMediaColumnsCount();
                            if (this.columnsAnimationProgress == 0.0f) {
                                this.pinchScaleUp = !this.pinchScaleUp;
                            }
                            startPinchToMediaColumnsCount(this.pinchScaleUp);
                            this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        this.listView.invalidate();
                    }
                } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && checkPointerIds(motionEvent)) || motionEvent.getActionMasked() == 3)) && this.isInPinchToZoomTouchMode) {
                    this.maybePinchToZoomTouchMode2 = false;
                    this.maybePinchToZoomTouchMode = false;
                    this.isInPinchToZoomTouchMode = false;
                    finishPinchToMediaColumnsCount();
                }
                return this.isInPinchToZoomTouchMode;
            }
            return true;
        }

        private void selectPinchPosition(int i, int i2) {
            this.pinchCenterPosition = -1;
            int i3 = i2 + this.listView.blurTopPadding;
            for (int i4 = 0; i4 < this.listView.getChildCount(); i4++) {
                View childAt = this.listView.getChildAt(i4);
                childAt.getHitRect(this.rect);
                if (this.rect.contains(i, i3)) {
                    this.pinchCenterPosition = this.listView.getChildLayoutPosition(childAt);
                    this.pinchCenterOffset = childAt.getTop();
                }
            }
        }

        private boolean checkPointerIds(MotionEvent motionEvent) {
            if (motionEvent.getPointerCount() < 2) {
                return false;
            }
            if (this.pointerId1 == motionEvent.getPointerId(0) && this.pointerId2 == motionEvent.getPointerId(1)) {
                return true;
            }
            return this.pointerId1 == motionEvent.getPointerId(1) && this.pointerId2 == motionEvent.getPointerId(0);
        }

        public int getNextMediaColumnsCount(int i, boolean z) {
            int i2 = i + (!z ? 1 : -1);
            if (i2 > 6) {
                i2 = !z ? 9 : 6;
            }
            return Utilities.clamp(i2, 6, this.allowStoriesSingleColumn ? 1 : 2);
        }

        private void startPinchToMediaColumnsCount(boolean z) {
            if (this.columnsAnimation || BotPreviewsEditContainer.this.isActionModeShowed()) {
                return;
            }
            int nextMediaColumnsCount = getNextMediaColumnsCount(this.columnsCount, z);
            this.animateToColumnsCount = nextMediaColumnsCount;
            if (nextMediaColumnsCount == this.columnsCount || this.allowStoriesSingleColumn) {
                return;
            }
            this.supportingListView.setVisibility(0);
            this.supportingListView.setAdapter(this.supportingAdapter);
            SharedMediaLayout.InternalListView internalListView = this.supportingListView;
            internalListView.setPadding(internalListView.getPaddingLeft(), 0, this.supportingListView.getPaddingRight(), AndroidUtilities.dp(42.0f) + this.footer.getMeasuredHeight());
            this.supportingLayoutManager.setSpanCount(nextMediaColumnsCount);
            this.supportingListView.invalidateItemDecorations();
            this.supportingLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i) {
                    if (BotPreviewsEditLangContainer.this.adapter.getItemViewType(i) == 2) {
                        return BotPreviewsEditLangContainer.this.columnsCount;
                    }
                    return 1;
                }
            });
            AndroidUtilities.updateVisibleRows(this.listView);
            this.columnsAnimation = true;
            this.columnsAnimationProgress = 0.0f;
            int i = this.pinchCenterPosition;
            if (i >= 0) {
                this.supportingLayoutManager.scrollToPositionWithOffset(i, this.pinchCenterOffset - this.supportingListView.getPaddingTop());
            } else {
                saveScrollPosition();
            }
        }

        private void finishPinchToMediaColumnsCount() {
            if (this.columnsAnimation) {
                float f = this.columnsAnimationProgress;
                if (f != 1.0f) {
                    if (f == 0.0f) {
                        this.columnsAnimation = false;
                        this.supportingListView.setVisibility(8);
                        this.listView.invalidate();
                        return;
                    }
                    final boolean z = f > 0.2f;
                    float[] fArr = new float[2];
                    fArr[0] = f;
                    fArr[1] = z ? 1.0f : 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            BotPreviewsEditLangContainer.this.columnsAnimationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            BotPreviewsEditLangContainer.this.listView.invalidate();
                        }
                    });
                    ofFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            View findViewByPosition;
                            BotPreviewsEditLangContainer.this.columnsAnimation = false;
                            if (z) {
                                BotPreviewsEditLangContainer botPreviewsEditLangContainer = BotPreviewsEditLangContainer.this;
                                botPreviewsEditLangContainer.columnsCount = botPreviewsEditLangContainer.animateToColumnsCount;
                                BotPreviewsEditLangContainer botPreviewsEditLangContainer2 = BotPreviewsEditLangContainer.this;
                                BotPreviewsEditContainer.this.setColumnsCount = botPreviewsEditLangContainer2.columnsCount;
                                SharedConfig.setStoriesColumnsCount(BotPreviewsEditLangContainer.this.animateToColumnsCount);
                            }
                            int itemCount = BotPreviewsEditLangContainer.this.adapter.getItemCount();
                            if (z) {
                                BotPreviewsEditLangContainer.this.layoutManager.setSpanCount(BotPreviewsEditLangContainer.this.columnsCount);
                                BotPreviewsEditLangContainer.this.listView.invalidateItemDecorations();
                                if (BotPreviewsEditLangContainer.this.adapter.getItemCount() == itemCount) {
                                    AndroidUtilities.updateVisibleRows(BotPreviewsEditLangContainer.this.listView);
                                } else {
                                    BotPreviewsEditLangContainer.this.adapter.notifyDataSetChanged();
                                }
                            }
                            BotPreviewsEditLangContainer.this.supportingListView.setVisibility(8);
                            BotPreviewsEditLangContainer botPreviewsEditLangContainer3 = BotPreviewsEditLangContainer.this;
                            if (botPreviewsEditLangContainer3.pinchCenterPosition < 0) {
                                botPreviewsEditLangContainer3.saveScrollPosition();
                            } else {
                                if (z && (findViewByPosition = botPreviewsEditLangContainer3.supportingLayoutManager.findViewByPosition(BotPreviewsEditLangContainer.this.pinchCenterPosition)) != null) {
                                    BotPreviewsEditLangContainer.this.pinchCenterOffset = findViewByPosition.getTop();
                                }
                                ExtendedGridLayoutManager extendedGridLayoutManager = BotPreviewsEditLangContainer.this.layoutManager;
                                BotPreviewsEditLangContainer botPreviewsEditLangContainer4 = BotPreviewsEditLangContainer.this;
                                extendedGridLayoutManager.scrollToPositionWithOffset(botPreviewsEditLangContainer4.pinchCenterPosition, (-botPreviewsEditLangContainer4.listView.getPaddingTop()) + BotPreviewsEditLangContainer.this.pinchCenterOffset);
                            }
                            super.onAnimationEnd(animator);
                        }
                    });
                    ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    return;
                }
                this.columnsAnimation = false;
                BotPreviewsEditContainer botPreviewsEditContainer = BotPreviewsEditContainer.this;
                int i = this.animateToColumnsCount;
                this.columnsCount = i;
                botPreviewsEditContainer.setColumnsCount = i;
                SharedConfig.setStoriesColumnsCount(this.animateToColumnsCount);
                int itemCount = this.adapter.getItemCount();
                this.supportingListView.setVisibility(8);
                this.layoutManager.setSpanCount(this.columnsCount);
                this.listView.invalidateItemDecorations();
                this.listView.invalidate();
                if (this.adapter.getItemCount() == itemCount) {
                    AndroidUtilities.updateVisibleRows(this.listView);
                } else {
                    this.adapter.notifyDataSetChanged();
                }
                int i2 = this.pinchCenterPosition;
                if (i2 >= 0) {
                    View findViewByPosition = this.supportingLayoutManager.findViewByPosition(i2);
                    if (findViewByPosition != null) {
                        this.pinchCenterOffset = findViewByPosition.getTop();
                    }
                    this.layoutManager.scrollToPositionWithOffset(this.pinchCenterPosition, (-this.listView.getPaddingTop()) + this.pinchCenterOffset);
                    return;
                }
                saveScrollPosition();
            }
        }

        public class FooterView extends LinearLayout {
            private final ButtonWithCounterView button2View;
            private final ButtonWithCounterView buttonView;
            private final TextView orTextView;
            private final TextView textView;

            public FooterView(BotPreviewsEditLangContainer botPreviewsEditLangContainer, Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context);
                setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
                setOrientation(1);
                TextView textView = new TextView(context);
                this.textView = textView;
                int i = Theme.key_windowBackgroundWhiteGrayText;
                textView.setTextColor(Theme.getColor(i, resourcesProvider));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                textView.setTextAlignment(4);
                addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 19.0f));
                ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(this, context, resourcesProvider, botPreviewsEditLangContainer) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, i3);
                    }
                };
                this.buttonView = buttonWithCounterView;
                buttonWithCounterView.setMinWidth(AndroidUtilities.dp(200.0f));
                buttonWithCounterView.setText(LocaleController.getString(R.string.ProfileBotAddPreview), false);
                addView(buttonWithCounterView, LayoutHelper.createLinear(-2, 44, 17));
                TextView textView2 = new TextView(this, context, botPreviewsEditLangContainer, resourcesProvider) {
                    private final Paint paint = new Paint(1);
                    final Theme.ResourcesProvider val$resourcesProvider;

                    {
                        this.val$resourcesProvider = resourcesProvider;
                    }

                    @Override
                    protected void dispatchDraw(Canvas canvas) {
                        int height = (getHeight() / 2) + AndroidUtilities.dp(1.0f);
                        int max = Math.max(1, AndroidUtilities.dp(0.66f));
                        Layout layout = getLayout();
                        if (layout != null) {
                            this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, this.val$resourcesProvider), 0.45f));
                            float f = height;
                            float f2 = max / 2.0f;
                            float f3 = f - f2;
                            float f4 = f + f2;
                            canvas.drawRect(0.0f, f3, (getWidth() - (layout.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f4, this.paint);
                            canvas.drawRect(((getWidth() + layout.getLineWidth(0)) + AndroidUtilities.dp(16.0f)) / 2.0f, f3, getWidth(), f4, this.paint);
                        }
                        super.dispatchDraw(canvas);
                    }
                };
                this.orTextView = textView2;
                textView2.setTextColor(Theme.getColor(i, resourcesProvider));
                textView2.setText(LocaleController.getString(R.string.ProfileBotOr));
                textView2.setTextSize(1, 14.0f);
                textView2.setTextAlignment(4);
                textView2.setGravity(17);
                textView2.setTypeface(AndroidUtilities.bold());
                addView(textView2, LayoutHelper.createLinear(165, -2, 17, 0, 17, 0, 12));
                ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, resourcesProvider);
                this.button2View = buttonWithCounterView2;
                buttonWithCounterView2.setMinWidth(AndroidUtilities.dp(200.0f));
                addView(buttonWithCounterView2, LayoutHelper.createLinear(-2, 44, 17));
            }

            public void set(CharSequence charSequence, CharSequence charSequence2, final Runnable runnable, CharSequence charSequence3, final Runnable runnable2) {
                this.textView.setText(charSequence);
                this.buttonView.setText(charSequence2, false);
                this.buttonView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        runnable.run();
                    }
                });
                if (charSequence3 == null) {
                    this.orTextView.setVisibility(8);
                    this.button2View.setVisibility(8);
                    return;
                }
                this.orTextView.setVisibility(0);
                this.button2View.setVisibility(0);
                this.button2View.setText(charSequence3, false);
                this.button2View.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        runnable2.run();
                    }
                });
            }
        }
    }

    public static class ChooseLanguageSheet extends BottomSheetWithRecyclerListView {
        private UniversalAdapter adapter;
        private final int currentAccount;
        private final CharSequence title;

        public ChooseLanguageSheet(BaseFragment baseFragment, CharSequence charSequence, final Utilities.Callback<String> callback) {
            super(baseFragment, true, false, false, baseFragment.getResourceProvider());
            new FrameLayout(getContext());
            new ImageView(getContext());
            this.currentAccount = baseFragment.getCurrentAccount();
            this.title = charSequence;
            updateTitle();
            this.topPadding = 0.6f;
            setShowHandle(true);
            this.handleOffset = true;
            fixNavigationBar();
            setSlidingActionBar();
            RecyclerListView recyclerListView = this.recyclerListView;
            int i = this.backgroundPaddingLeft;
            recyclerListView.setPadding(i, 0, i, 0);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i2) {
                    BotPreviewsEditContainer.ChooseLanguageSheet.this.lambda$new$0(callback, view, i2);
                }
            });
        }

        public void lambda$new$0(Utilities.Callback callback, View view, int i) {
            UItem item;
            UniversalAdapter universalAdapter = this.adapter;
            if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                return;
            }
            Object obj = item.object;
            if (obj instanceof TranslateController.Language) {
                callback.run(((TranslateController.Language) obj).code);
                dismiss();
            }
        }

        @Override
        protected CharSequence getTitle() {
            return this.title;
        }

        @Override
        protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    BotPreviewsEditContainer.ChooseLanguageSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, this.resourcesProvider);
            this.adapter = universalAdapter;
            return universalAdapter;
        }

        public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
            Iterator<TranslateController.Language> it = TranslateController.getLanguages().iterator();
            while (it.hasNext()) {
                arrayList.add(LanguageView.Factory.of(it.next()));
            }
        }

        public static class LanguageView extends LinearLayout {
            private boolean needDivider;
            private final TextView subtitle;
            private final TextView title;

            public LanguageView(Context context) {
                super(context);
                setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                setOrientation(1);
                TextView textView = new TextView(context);
                this.title = textView;
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                addView(textView, LayoutHelper.createLinear(-1, -2, 51, 0, 7, 0, 0));
                TextView textView2 = new TextView(context);
                this.subtitle = textView2;
                textView2.setTextSize(1, 13.0f);
                textView2.setTextColor(Theme.getColor(Theme.key_dialogTextGray2));
                textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                addView(textView2, LayoutHelper.createLinear(-1, -2, 51, 0, 4, 0, 0));
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            }

            public void set(TranslateController.Language language, boolean z) {
                this.title.setText(language.displayName);
                this.subtitle.setText(language.ownDisplayName);
                if (this.needDivider != z) {
                    invalidate();
                }
                this.needDivider = z;
                setWillNotDraw(!z);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (this.needDivider) {
                    canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), Theme.dividerPaint);
                }
            }

            public static class Factory extends UItem.UItemFactory<LanguageView> {
                @Override
                public LanguageView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                    return new LanguageView(context);
                }

                @Override
                public void bindView(View view, UItem uItem, boolean z) {
                    ((LanguageView) view).set((TranslateController.Language) uItem.object, z);
                }

                public static UItem of(TranslateController.Language language) {
                    UItem ofFactory = UItem.ofFactory(Factory.class);
                    ofFactory.object = language;
                    return ofFactory;
                }
            }
        }
    }
}
