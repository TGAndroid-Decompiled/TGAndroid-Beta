package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.EmptyBaseFragment;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bots.BotWebViewAttachedSheet;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.web.BotWebViewContainer;
public class BottomSheetTabs extends FrameLayout {
    private static TextPaint textPaint;
    private final ActionBarLayout actionBarLayout;
    private int backgroundColor;
    private AnimatedColor backgroundColorAnimated;
    private final Paint backgroundPaint;
    private boolean closeRippleHit;
    public int currentAccount;
    public boolean drawTabs;
    private final RectF rect;
    private int tabColor;
    private AnimatedColor tabColorAnimated;
    private AnimatedFloat tabDarkAnimated;
    public final HashMap<Integer, ArrayList<TabDrawable>> tabDrawables;
    private boolean tabIsDark;
    public final HashMap<Integer, ArrayList<WebTabData>> tabs;

    public static void lambda$onTouchEvent$7(Boolean bool) {
    }

    static TextPaint access$100() {
        return getTextPaint();
    }

    public BottomSheetTabs(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.drawTabs = true;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.backgroundColorAnimated = new AnimatedColor(this, 0L, 200L, cubicBezierInterpolator);
        this.tabColorAnimated = new AnimatedColor(this, 0L, 200L, cubicBezierInterpolator);
        this.tabDarkAnimated = new AnimatedFloat(this, 0L, 200L, cubicBezierInterpolator);
        this.currentAccount = UserConfig.selectedAccount;
        this.tabs = new HashMap<>();
        this.tabDrawables = new HashMap<>();
        this.rect = new RectF();
        this.actionBarLayout = actionBarLayout;
        setNavigationBarColor(Theme.getColor(Theme.key_windowBackgroundGray));
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BottomSheetTabs.this.lambda$new$0(view);
            }
        });
        updateMultipleTitle();
    }

    public void lambda$new$0(View view) {
        ArrayList<WebTabData> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        WebTabData webTabData = tabs.get(tabs.size() - 1);
        LaunchActivity launchActivity = LaunchActivity.instance;
        BottomSheetTabsOverlay bottomSheetTabsOverlay = launchActivity == null ? null : launchActivity.getBottomSheetTabsOverlay();
        if (bottomSheetTabsOverlay != null) {
            bottomSheetTabsOverlay.stopAnimations();
        }
        if (size == 1 || bottomSheetTabsOverlay == null) {
            openTab(webTabData);
        } else {
            bottomSheetTabsOverlay.openTabsView();
        }
    }

    public void openTab(final WebTabData webTabData) {
        final BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment == null || lastFragment.getParentActivity() == null) {
            return;
        }
        boolean z = lastFragment instanceof ChatActivity;
        if (z) {
            ChatActivity chatActivity = (ChatActivity) lastFragment;
            if (chatActivity.getChatActivityEnterView() != null) {
                chatActivity.getChatActivityEnterView().closeKeyboard();
                chatActivity.getChatActivityEnterView().hidePopup(true, false);
            }
        }
        if (webTabData.articleViewer != null) {
            EmptyBaseFragment sheetFragment = this.actionBarLayout.getSheetFragment();
            ArticleViewer articleViewer = webTabData.articleViewer;
            BottomSheetTabDialog.checkSheet(articleViewer.sheet);
            sheetFragment.addSheet(articleViewer.sheet);
            articleViewer.sheet.reset();
            articleViewer.setParentActivity(sheetFragment.getParentActivity(), sheetFragment);
            articleViewer.sheet.attachInternal(sheetFragment);
            articleViewer.sheet.animateOpen(true, true, null);
            removeTab(webTabData, false);
            return;
        }
        final boolean closeAttachedSheets = closeAttachedSheets();
        new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BottomSheetTabs.this.lambda$openTab$1(webTabData, closeAttachedSheets, (BaseFragment) obj);
            }
        }.run(lastFragment);
        if (webTabData.needsContext) {
            if (z && ((ChatActivity) lastFragment).getDialogId() == webTabData.props.botId) {
                return;
            }
            final ChatActivity of = ChatActivity.of(webTabData.props.botId);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BaseFragment.this.presentFragment(of);
                }
            }, 220L);
        }
    }

    public void lambda$openTab$1(WebTabData webTabData, boolean z, BaseFragment baseFragment) {
        if (baseFragment == null) {
            return;
        }
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            if (chatActivity.getChatActivityEnterView() != null) {
                chatActivity.getChatActivityEnterView().closeKeyboard();
                chatActivity.getChatActivityEnterView().hidePopup(true, false);
            }
        }
        if (baseFragment.getContext() == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (AndroidUtilities.isTablet() && !webTabData.isWeb) {
            BotWebViewSheet botWebViewSheet = new BotWebViewSheet(baseFragment.getContext(), baseFragment.getResourceProvider());
            botWebViewSheet.setParentActivity(baseFragment.getParentActivity());
            if (botWebViewSheet.restoreState(baseFragment, webTabData)) {
                removeTab(webTabData, false);
                botWebViewSheet.show();
                return;
            }
            return;
        }
        EmptyBaseFragment sheetFragment = this.actionBarLayout.getSheetFragment();
        if (sheetFragment == null) {
            return;
        }
        BotWebViewAttachedSheet createBotViewer = sheetFragment.createBotViewer();
        createBotViewer.setParentActivity(baseFragment.getParentActivity());
        if (createBotViewer.restoreState(baseFragment, webTabData)) {
            removeTab(webTabData, false);
            createBotViewer.show(z);
        }
    }

    public WebTabData tryReopenTab(WebViewRequestProps webViewRequestProps) {
        ArrayList<WebTabData> arrayList = this.tabs.get(Integer.valueOf(this.currentAccount));
        if (arrayList == null) {
            HashMap<Integer, ArrayList<WebTabData>> hashMap = this.tabs;
            Integer valueOf = Integer.valueOf(this.currentAccount);
            ArrayList<WebTabData> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf, arrayList2);
            arrayList = arrayList2;
        }
        if (webViewRequestProps == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            WebTabData webTabData = arrayList.get(i);
            if (webViewRequestProps.equals(webTabData.props)) {
                openTab(webTabData);
                return webTabData;
            }
        }
        return null;
    }

    public String urlWithoutFragment(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(35);
        return indexOf >= 0 ? str.substring(0, indexOf + 1) : str;
    }

    public WebTabData tryReopenTab(String str) {
        ArticleViewer.PageLayout[] pageLayoutArr;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<WebTabData> tabs = getTabs();
        for (int i = 0; i < tabs.size(); i++) {
            WebTabData webTabData = tabs.get(i);
            ArticleViewer articleViewer = webTabData.articleViewer;
            if (articleViewer != null && !articleViewer.pagesStack.isEmpty()) {
                ArrayList<Object> arrayList = webTabData.articleViewer.pagesStack;
                Object obj = arrayList.get(arrayList.size() - 1);
                if (obj instanceof ArticleViewer.CachedWeb) {
                    BotWebViewContainer.MyWebView myWebView = ((ArticleViewer.CachedWeb) obj).webView;
                    if (myWebView == null && (pageLayoutArr = webTabData.articleViewer.pages) != null && pageLayoutArr[0] != null) {
                        myWebView = pageLayoutArr[0].getWebView();
                    }
                    if (myWebView == null) {
                        continue;
                    } else {
                        if (TextUtils.equals(urlWithoutFragment(myWebView.canGoBack() ? myWebView.getUrl() : myWebView.getOpenURL()), urlWithoutFragment(str))) {
                            openTab(webTabData);
                            return webTabData;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public WebTabData tryReopenTab(TLRPC$WebPage tLRPC$WebPage) {
        TLRPC$WebPage tLRPC$WebPage2;
        if (tLRPC$WebPage == null) {
            return null;
        }
        ArrayList<WebTabData> tabs = getTabs();
        for (int i = 0; i < tabs.size(); i++) {
            WebTabData webTabData = tabs.get(i);
            ArticleViewer articleViewer = webTabData.articleViewer;
            if (articleViewer != null && !articleViewer.pagesStack.isEmpty()) {
                ArrayList<Object> arrayList = webTabData.articleViewer.pagesStack;
                Object obj = arrayList.get(arrayList.size() - 1);
                if ((obj instanceof TLRPC$WebPage) && (tLRPC$WebPage2 = (TLRPC$WebPage) obj) != null && tLRPC$WebPage2.id == tLRPC$WebPage.id) {
                    openTab(webTabData);
                    return webTabData;
                }
            }
        }
        return null;
    }

    public WebTabData tryReopenTab(MessageObject messageObject) {
        TLRPC$Message tLRPC$Message;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        TLRPC$WebPage tLRPC$WebPage;
        if (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null || (tLRPC$MessageMedia = tLRPC$Message.media) == null || (tLRPC$WebPage = tLRPC$MessageMedia.webpage) == null) {
            return null;
        }
        return tryReopenTab(tLRPC$WebPage);
    }

    public boolean closeAttachedSheets() {
        BottomSheetTabsOverlay bottomSheetTabsOverlay = LaunchActivity.instance.getBottomSheetTabsOverlay();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        int i = 0;
        if (safeLastFragment != null) {
            boolean z = false;
            while (true) {
                ArrayList<BaseFragment.AttachedSheet> arrayList = safeLastFragment.sheetsStack;
                if (arrayList == null || i >= arrayList.size()) {
                    break;
                }
                BaseFragment.AttachedSheet attachedSheet = safeLastFragment.sheetsStack.get(i);
                if (attachedSheet instanceof BotWebViewAttachedSheet) {
                    if (bottomSheetTabsOverlay != null) {
                        bottomSheetTabsOverlay.setSlowerDismiss(true);
                    }
                    ((BotWebViewAttachedSheet) attachedSheet).dismiss(true, null);
                    z = true;
                }
                i++;
            }
            return z;
        }
        return false;
    }

    public void setNavigationBarColor(int i) {
        setNavigationBarColor(i, true);
    }

    public void setNavigationBarColor(int i, boolean z) {
        if (i != this.backgroundColor) {
            ActionBarLayout actionBarLayout = this.actionBarLayout;
            z = (!actionBarLayout.startedTracking || actionBarLayout.animationInProgress) ? false : false;
            this.backgroundColor = i;
            int blendOver = Theme.blendOver(i, Theme.multAlpha(-1, (AndroidUtilities.computePerceivedBrightness(i) > 0.721f ? 1 : (AndroidUtilities.computePerceivedBrightness(i) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f));
            this.tabColor = blendOver;
            this.tabIsDark = AndroidUtilities.computePerceivedBrightness(blendOver) < 0.721f;
            if (!z) {
                this.backgroundColorAnimated.set(this.backgroundColor, true);
                this.tabColorAnimated.set(this.tabColor, true);
                this.tabDarkAnimated.set(this.tabIsDark, true);
            }
            invalidate();
        }
    }

    public void updateCurrentAccount() {
        setCurrentAccount(UserConfig.selectedAccount);
    }

    public void setCurrentAccount(int i) {
        if (this.currentAccount != i) {
            this.currentAccount = i;
            this.actionBarLayout.updateBottomTabsVisibility(false);
            invalidate();
        }
    }

    public int getExpandedHeight() {
        int size = getTabs().size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return AndroidUtilities.dp(60.0f);
        }
        return AndroidUtilities.dp(68.0f);
    }

    public ArrayList<WebTabData> getTabs() {
        return getTabs(this.currentAccount);
    }

    public ArrayList<TabDrawable> getTabDrawables() {
        return getTabDrawables(this.currentAccount);
    }

    public ArrayList<WebTabData> getTabs(int i) {
        ArrayList<WebTabData> arrayList = this.tabs.get(Integer.valueOf(i));
        if (arrayList == null) {
            HashMap<Integer, ArrayList<WebTabData>> hashMap = this.tabs;
            Integer valueOf = Integer.valueOf(i);
            ArrayList<WebTabData> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<TabDrawable> getTabDrawables(int i) {
        ArrayList<TabDrawable> arrayList = this.tabDrawables.get(Integer.valueOf(i));
        if (arrayList == null) {
            HashMap<Integer, ArrayList<TabDrawable>> hashMap = this.tabDrawables;
            Integer valueOf = Integer.valueOf(i);
            ArrayList<TabDrawable> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public TabDrawable findTabDrawable(WebTabData webTabData) {
        ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        for (int i = 0; i < tabDrawables.size(); i++) {
            if (tabDrawables.get(i).tab == webTabData) {
                return tabDrawables.get(i);
            }
        }
        return null;
    }

    public TabDrawable pushTab(WebTabData webTabData) {
        ArrayList<WebTabData> tabs = getTabs();
        ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        TabDrawable tabDrawable = new TabDrawable(this, webTabData);
        tabDrawable.animatedPosition.set(-1.0f, true);
        tabDrawable.animatedAlpha.set(0.0f, true);
        tabDrawables.add(tabDrawable);
        tabs.add(0, webTabData);
        for (int i = 0; i < tabDrawables.size(); i++) {
            TabDrawable tabDrawable2 = tabDrawables.get(i);
            int indexOf = tabs.indexOf(tabDrawable2.tab);
            tabDrawable2.index = indexOf;
            if (indexOf >= 0) {
                tabDrawable2.position = indexOf;
            }
        }
        updateMultipleTitle();
        this.actionBarLayout.updateBottomTabsVisibility(true);
        invalidate();
        return tabDrawable;
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }

    private static TextPaint getTextPaint() {
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            textPaint = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.bold());
            textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        }
        return textPaint;
    }

    private void updateMultipleTitle() {
        CharSequence replaceEmoji;
        ArrayList<WebTabData> tabs = getTabs();
        ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i = 0; i < tabDrawables.size(); i++) {
            TabDrawable tabDrawable = tabDrawables.get(i);
            if (tabs.size() > 1 && tabDrawable.position == 0) {
                replaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs.size() - 1, tabDrawable.tab.getTitle()), getTextPaint().getFontMetricsInt(), false);
                tabDrawable.setOverrideTitle(replaceEmoji);
            } else {
                replaceEmoji = Emoji.replaceEmoji(tabDrawable.tab.getTitle(), getTextPaint().getFontMetricsInt(), false);
                tabDrawable.setOverrideTitle(null);
            }
            charSequence = replaceEmoji;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(LocaleController.formatString(R.string.AccDescrTabs, ""));
            return;
        }
        setImportantForAccessibility(1);
        int i2 = R.string.AccDescrTabs;
        Object[] objArr = new Object[1];
        if (charSequence == null) {
            charSequence = "";
        }
        objArr[0] = charSequence;
        setContentDescription(LocaleController.formatString(i2, objArr));
    }

    public boolean removeAll() {
        ArrayList<WebTabData> tabs = getTabs();
        ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        for (int i = 0; i < tabs.size(); i++) {
            tabs.get(i).destroy();
        }
        tabs.clear();
        for (int i2 = 0; i2 < tabDrawables.size(); i2++) {
            tabDrawables.get(i2).index = -1;
        }
        updateMultipleTitle();
        this.actionBarLayout.updateBottomTabsVisibility(true);
        invalidate();
        return tabs.isEmpty();
    }

    public boolean tryRemoveTabWith(ArticleViewer articleViewer) {
        for (int i = 0; i < this.tabs.size(); i++) {
            ArrayList<WebTabData> arrayList = this.tabs.get(Integer.valueOf(i));
            if (arrayList != null) {
                Iterator<WebTabData> it = arrayList.iterator();
                while (it.hasNext()) {
                    WebTabData next = it.next();
                    if (next.articleViewer == articleViewer) {
                        return removeTab(i, next, true);
                    }
                }
                continue;
            }
        }
        return false;
    }

    public void removeTab(final WebTabData webTabData, final Utilities.Callback<Boolean> callback) {
        if (webTabData == null) {
            callback.run(Boolean.TRUE);
        } else if (!webTabData.confirmDismiss) {
            removeTab(webTabData, true);
            callback.run(Boolean.TRUE);
        } else {
            TLRPC$User user = MessagesController.getInstance(webTabData.props.currentAccount).getUser(Long.valueOf(webTabData.props.botId));
            final boolean[] zArr = {false};
            final AlertDialog[] alertDialogArr = {new AlertDialog.Builder(getContext()).setTitle(user != null ? ContactsController.formatName(user.first_name, user.last_name) : null).setMessage(LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved)).setPositiveButton(LocaleController.getString(R.string.BotWebViewCloseAnyway), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BottomSheetTabs.this.lambda$removeTab$3(zArr, webTabData, callback, alertDialogArr, dialogInterface, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BottomSheetTabs.lambda$removeTab$4(zArr, callback, alertDialogArr, dialogInterface, i);
                }
            }).create()};
            alertDialogArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    BottomSheetTabs.lambda$removeTab$5(zArr, callback, dialogInterface);
                }
            });
            alertDialogArr[0].show();
            ((TextView) alertDialogArr[0].getButton(-1)).setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public void lambda$removeTab$3(boolean[] zArr, WebTabData webTabData, Utilities.Callback callback, AlertDialog[] alertDialogArr, DialogInterface dialogInterface, int i) {
        zArr[0] = true;
        removeTab(webTabData, true);
        callback.run(Boolean.TRUE);
        alertDialogArr[0].dismiss();
    }

    public static void lambda$removeTab$4(boolean[] zArr, Utilities.Callback callback, AlertDialog[] alertDialogArr, DialogInterface dialogInterface, int i) {
        zArr[0] = true;
        callback.run(Boolean.FALSE);
        alertDialogArr[0].dismiss();
    }

    public static void lambda$removeTab$5(boolean[] zArr, Utilities.Callback callback, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        callback.run(Boolean.FALSE);
        zArr[0] = true;
    }

    public boolean removeTab(WebTabData webTabData, boolean z) {
        return removeTab(this.currentAccount, webTabData, z);
    }

    public boolean removeTab(int i, final WebTabData webTabData, boolean z) {
        ArrayList<WebTabData> tabs = getTabs(i);
        final ArrayList<TabDrawable> tabDrawables = getTabDrawables(i);
        tabs.remove(webTabData);
        if (z) {
            webTabData.destroy();
        }
        for (int i2 = 0; i2 < tabDrawables.size(); i2++) {
            TabDrawable tabDrawable = tabDrawables.get(i2);
            int indexOf = tabs.indexOf(tabDrawable.tab);
            tabDrawable.index = indexOf;
            if (indexOf >= 0) {
                tabDrawable.position = indexOf;
            }
        }
        updateMultipleTitle();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BottomSheetTabs.this.lambda$removeTab$6(tabDrawables, webTabData);
            }
        }, 320L);
        this.actionBarLayout.updateBottomTabsVisibility(true);
        invalidate();
        return tabs.isEmpty();
    }

    public void lambda$removeTab$6(ArrayList arrayList, WebTabData webTabData) {
        int i = 0;
        while (i < arrayList.size()) {
            if (((TabDrawable) arrayList.get(i)).tab == webTabData) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ArrayList<WebTabData> tabs = getTabs();
        ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        if (this.drawTabs) {
            WebTabData webTabData = tabs.isEmpty() ? null : tabs.get(0);
            TabDrawable findTabDrawable = findTabDrawable(webTabData);
            if (findTabDrawable != null) {
                getTabBounds(this.rect, findTabDrawable.getPosition());
                boolean contains = findTabDrawable.closeRipple.getBounds().contains((int) (motionEvent.getX() - this.rect.left), (int) (motionEvent.getY() - this.rect.centerY()));
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    this.closeRippleHit = contains;
                    findTabDrawable.closeRipple.setState(contains ? new int[]{16842919, 16842910} : new int[0]);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.closeRippleHit && motionEvent.getAction() == 1) {
                        removeTab(webTabData, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                BottomSheetTabs.lambda$onTouchEvent$7((Boolean) obj);
                            }
                        });
                    }
                    this.closeRippleHit = false;
                    findTabDrawable.closeRipple.setState(new int[0]);
                }
                for (int i = 0; i < tabDrawables.size(); i++) {
                    if (tabDrawables.get(i) != findTabDrawable) {
                        tabDrawables.get(i).closeRipple.setState(new int[0]);
                    }
                }
            } else {
                this.closeRippleHit = false;
            }
        }
        if (this.closeRippleHit) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        getTabs();
        ArrayList<TabDrawable> tabDrawables = getTabDrawables();
        this.backgroundPaint.setColor(this.backgroundColorAnimated.set(this.backgroundColor));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.backgroundPaint);
        super.dispatchDraw(canvas);
        int i = this.tabColorAnimated.set(this.tabColor);
        float f = this.tabDarkAnimated.set(this.tabIsDark);
        if (this.drawTabs) {
            for (int i2 = 0; i2 < tabDrawables.size(); i2++) {
                TabDrawable tabDrawable = tabDrawables.get(i2);
                float position = tabDrawable.getPosition();
                float alpha = tabDrawable.getAlpha();
                if (alpha > 0.0f && position <= 1.99f) {
                    getTabBounds(this.rect, position);
                    tabDrawable.setExpandProgress(0.0f);
                    tabDrawable.setBackgroundColor(i, f > 0.5f);
                    tabDrawable.draw(canvas, this.rect, AndroidUtilities.dp(10.0f), alpha, 1.0f);
                }
            }
        }
    }

    public void setupTab(TabDrawable tabDrawable) {
        int i = this.tabColorAnimated.set(this.tabColor);
        float f = this.tabDarkAnimated.set(this.tabIsDark);
        tabDrawable.setExpandProgress(0.0f);
        tabDrawable.setBackgroundColor(i, f > 0.5f);
    }

    public void getTabBounds(RectF rectF, float f) {
        rectF.set(AndroidUtilities.dp(4.0f), (getHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(50.0f), getWidth() - AndroidUtilities.dp(4.0f), getHeight() - AndroidUtilities.dp(4.0f));
        rectF.offset(0.0f, (-AndroidUtilities.dp(8.0f)) * f);
        float lerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f2 = (width / 2.0f) * lerp;
        rectF.left = centerX - f2;
        rectF.right = centerX + f2;
        float f3 = (height / 2.0f) * lerp;
        rectF.top = centerY - f3;
        rectF.bottom = centerY + f3;
    }

    public static class TabDrawable {
        public final AnimatedFloat animatedAlpha;
        public final AnimatedFloat animatedPosition;
        private int backgroundColor;
        private boolean backgroundIsDark;
        private final Path closePath;
        public final Drawable closeRipple;
        public int closeRippleColor;
        private final Path expandPath;
        private float expandProgress;
        private Bitmap favicon;
        private final Paint faviconPaint;
        private Drawable iconDrawable;
        private int iconDrawableColor;
        private final Paint iconPaint;
        public int index;
        private Text overrideTitle;
        private int position;
        private float progress;
        private final float[] radii;
        private final Path rectPath;
        public final WebTabData tab;
        private int tabColor;
        private boolean tabIsDark;
        private final Text title;
        private final Paint backgroundPaint = new Paint(1);
        private final Paint progressPaint = new Paint(1);

        public TabDrawable(View view, WebTabData webTabData) {
            Paint paint = new Paint(1);
            this.iconPaint = paint;
            this.faviconPaint = new Paint(3);
            Drawable createSelectorDrawable = Theme.createSelectorDrawable(822083583, 1);
            this.closeRipple = createSelectorDrawable;
            this.iconDrawableColor = -1;
            this.radii = new float[8];
            this.rectPath = new Path();
            Path path = new Path();
            this.closePath = path;
            Path path2 = new Path();
            this.expandPath = path2;
            this.tab = webTabData;
            createSelectorDrawable.setCallback(view);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animatedPosition = new AnimatedFloat(view, 320L, cubicBezierInterpolator);
            this.animatedAlpha = new AnimatedFloat(view, 320L, cubicBezierInterpolator);
            this.favicon = webTabData.favicon;
            this.title = new Text(Emoji.replaceEmoji(webTabData.getTitle(), BottomSheetTabs.access$100().getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
            int i = webTabData.actionBarColor;
            this.tabColor = i;
            this.tabIsDark = AndroidUtilities.computePerceivedBrightness(i) < 0.721f;
            if (webTabData.isArticle()) {
                this.iconDrawable = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
            }
            this.progress = webTabData.articleProgress;
            path.rewind();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            path.moveTo(AndroidUtilities.dp(12.0f), 0.0f);
            path.lineTo(0.0f, AndroidUtilities.dp(12.0f));
            path2.rewind();
            path2.moveTo(0.0f, AndroidUtilities.dp(6.33f) / 2.0f);
            path2.lineTo(AndroidUtilities.dp(12.66f) / 2.0f, (-AndroidUtilities.dp(6.33f)) / 2.0f);
            path2.lineTo(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(6.33f) / 2.0f);
        }

        public void setOverrideTitle(CharSequence charSequence) {
            if (charSequence == null) {
                this.overrideTitle = null;
            } else {
                this.overrideTitle = new Text(charSequence, 17.0f, AndroidUtilities.bold());
            }
        }

        public float getPosition() {
            return this.index < 0 ? this.position : this.animatedPosition.set(this.position);
        }

        public float getAlpha() {
            float min;
            float position = getPosition();
            if (position < 0.0f) {
                min = position + 1.0f;
            } else if (position >= 0.0f && position < 1.0f) {
                min = AndroidUtilities.lerp(1.0f, 0.87f, position);
            } else {
                min = (1.0f - Math.min(1.0f, position - 1.0f)) * 0.87f;
            }
            return min * this.animatedAlpha.set(this.index >= 0);
        }

        public void setBackgroundColor(int i, boolean z) {
            this.backgroundColor = i;
            this.backgroundIsDark = z;
        }

        public void setExpandProgress(float f) {
            this.expandProgress = f;
        }

        public void draw(Canvas canvas, RectF rectF, float f, float f2, float f3) {
            int blendARGB = ColorUtils.blendARGB(this.backgroundColor, this.tabColor, this.expandProgress);
            this.backgroundPaint.setColor(blendARGB);
            float f4 = f2 * 255.0f;
            this.backgroundPaint.setAlpha((int) f4);
            this.backgroundPaint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(268435456, f2));
            float[] fArr = this.radii;
            fArr[3] = f;
            fArr[2] = f;
            fArr[1] = f;
            int i = 0;
            fArr[0] = f;
            float lerp = AndroidUtilities.lerp(f, 0.0f, this.expandProgress);
            fArr[7] = lerp;
            fArr[6] = lerp;
            fArr[5] = lerp;
            fArr[4] = lerp;
            this.rectPath.rewind();
            this.rectPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
            canvas.drawPath(this.rectPath, this.backgroundPaint);
            if (this.progress > 0.0f && this.expandProgress > 0.0f && f2 > 0.0f) {
                canvas.save();
                canvas.clipPath(this.rectPath);
                this.progressPaint.setColor(Theme.multAlpha(AndroidUtilities.computePerceivedBrightness(blendARGB) > 0.721f ? -16777216 : -1, 0.07f * f2 * this.expandProgress));
                float f5 = rectF.left;
                canvas.drawRect(f5, rectF.top, f5 + (rectF.width() * this.progress), rectF.bottom, this.progressPaint);
                canvas.restore();
            }
            float lerp2 = AndroidUtilities.lerp(this.backgroundIsDark ? 1.0f : 0.0f, this.tabIsDark ? 1.0f : 0.0f, this.expandProgress);
            int blendARGB2 = ColorUtils.blendARGB(-16777216, -1, lerp2);
            this.iconPaint.setColor(blendARGB2);
            this.iconPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.save();
            canvas.translate(rectF.left, rectF.centerY());
            int blendARGB3 = ColorUtils.blendARGB(553648127, 553648127, lerp2);
            this.closeRipple.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f));
            if (this.closeRippleColor != blendARGB3) {
                Drawable drawable = this.closeRipple;
                this.closeRippleColor = blendARGB3;
                Theme.setSelectorDrawableColor(drawable, blendARGB3, false);
            }
            this.closeRipple.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
            float f6 = f4 * f3;
            int i2 = (int) f6;
            this.iconPaint.setAlpha(i2);
            canvas.drawPath(this.closePath, this.iconPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
            this.iconPaint.setAlpha((int) (f6 * (1.0f - this.expandProgress)));
            canvas.drawPath(this.expandPath, this.iconPaint);
            canvas.restore();
            if (this.favicon != null) {
                int dp = AndroidUtilities.dp(24.0f);
                canvas.save();
                Rect rect = AndroidUtilities.rectTmp2;
                float f7 = dp;
                float f8 = f7 / 2.0f;
                rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f8), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f7), (int) (rectF.centerY() + f8));
                this.faviconPaint.setAlpha(i2);
                canvas.drawBitmap(this.favicon, (Rect) null, rect, this.faviconPaint);
                canvas.restore();
                i = dp + AndroidUtilities.dp(4.0f);
            } else if (this.iconDrawable != null) {
                float dp2 = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((dp2 / this.iconDrawable.getIntrinsicHeight()) * this.iconDrawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f9 = (dp2 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f9), (int) (rectF.left + AndroidUtilities.dp(56.0f) + (intrinsicHeight * 0.7f)), (int) (rectF.centerY() + f9));
                if (blendARGB2 != this.iconDrawableColor) {
                    Drawable drawable2 = this.iconDrawable;
                    this.iconDrawableColor = blendARGB2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(blendARGB2, PorterDuff.Mode.SRC_IN));
                }
                this.iconDrawable.setAlpha(i2);
                this.iconDrawable.setBounds(rect2);
                this.iconDrawable.draw(canvas);
                i = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
            Text text = this.overrideTitle;
            if (text != null) {
                float f10 = i;
                text.ellipsize((int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f10)).draw(canvas, f10 + rectF.left + AndroidUtilities.dp(60.0f), rectF.centerY(), blendARGB2, (1.0f - this.expandProgress) * f2 * f3);
            }
            float f11 = i;
            this.title.ellipsize((int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - f11)).draw(canvas, f11 + rectF.left + AndroidUtilities.dp(60.0f), rectF.centerY(), blendARGB2, (this.overrideTitle != null ? this.expandProgress : 1.0f) * f2 * f3);
        }
    }

    public static class WebTabData {
        public int actionBarColor;
        public int actionBarColorKey;
        public float articleProgress;
        public ArticleViewer articleViewer;
        public boolean backButton;
        public int backgroundColor;
        public boolean confirmDismiss;
        public boolean expanded;
        public Bitmap favicon;
        public boolean fullsize;
        public boolean isWeb;
        public String lastUrl;
        public BotWebViewAttachedSheet.MainButtonSettings main;
        public boolean needsContext;
        public boolean overrideActionBarColor;
        public Bitmap previewBitmap;
        public Object previewNode;
        public WebViewRequestProps props;
        public Object proxy;
        public boolean ready;
        public boolean settings;
        public boolean themeIsDark;
        public String title;
        public View view2;
        public int viewHeight;
        public int viewScroll;
        public int viewWidth;
        public BotWebViewContainer.MyWebView webView;
        public float expandedOffset = Float.MAX_VALUE;
        public boolean allowSwipes = true;

        public void destroy() {
            try {
                BotWebViewContainer.MyWebView myWebView = this.webView;
                if (myWebView != null) {
                    myWebView.destroy();
                    this.webView = null;
                }
                ArticleViewer articleViewer = this.articleViewer;
                if (articleViewer != null) {
                    articleViewer.destroy();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public boolean isArticle() {
            ArticleViewer articleViewer = this.articleViewer;
            return articleViewer != null && articleViewer.isLastArticle();
        }

        public String getTitle() {
            if (this.isWeb || this.articleViewer != null) {
                if (TextUtils.isEmpty(this.title)) {
                    return LocaleController.getString(R.string.WebEmpty);
                }
                return this.title;
            }
            WebViewRequestProps webViewRequestProps = this.props;
            return webViewRequestProps == null ? "" : UserObject.getUserName(MessagesController.getInstance(webViewRequestProps.currentAccount).getUser(Long.valueOf(this.props.botId)));
        }
    }
}
