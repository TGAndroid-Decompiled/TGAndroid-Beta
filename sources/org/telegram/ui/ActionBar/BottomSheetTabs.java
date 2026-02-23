package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
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
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
import org.telegram.tgnet.TLRPC;
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
import org.telegram.ui.bots.BotButtons;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.web.BotWebViewContainer;

public class BottomSheetTabs extends FrameLayout {
    private static TextPaint textPaint;
    private final ActionBarLayout actionBarLayout;
    private int backgroundColor;
    private AnimatedColor backgroundColorAnimated;
    private final Paint backgroundPaint;
    private ValueAnimator bottomTabsAnimator;
    public int bottomTabsHeight;
    public float bottomTabsProgress;
    private boolean closeRippleHit;
    public int currentAccount;
    public boolean doNotDismiss;
    public boolean drawTabs;
    private boolean hit;
    private final HashSet invalidateListeners;
    private final RectF rect;
    private final HashSet relayoutListeners;
    private int tabColor;
    private AnimatedColor tabColorAnimated;
    private AnimatedFloat tabDarkAnimated;
    private boolean tabIsDark;
    public static final HashMap tabs = new HashMap();
    public static final HashMap tabDrawables = new HashMap();

    public static void lambda$touchEvent$6(Boolean bool) {
    }

    public BottomSheetTabs(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.drawTabs = true;
        this.doNotDismiss = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.backgroundColorAnimated = new AnimatedColor(this, 0L, 200L, cubicBezierInterpolator);
        this.tabColorAnimated = new AnimatedColor(this, 0L, 200L, cubicBezierInterpolator);
        this.tabDarkAnimated = new AnimatedFloat(this, 0L, 200L, cubicBezierInterpolator);
        this.currentAccount = UserConfig.selectedAccount;
        this.rect = new RectF();
        this.invalidateListeners = new HashSet();
        this.relayoutListeners = new HashSet();
        this.actionBarLayout = actionBarLayout;
        setNavigationBarColor(Theme.getColor(Theme.key_windowBackgroundGray));
        updateMultipleTitle();
        updateVisibility(false);
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
        closeAttachedSheets();
        new Utilities.Callback() {
            @Override
            public final void run(Object obj) throws Resources.NotFoundException {
                this.f$0.lambda$openTab$0(webTabData, (BaseFragment) obj);
            }
        }.run(lastFragment);
        if (webTabData.needsContext) {
            if (z && ((ChatActivity) lastFragment).getDialogId() == webTabData.props.botId) {
                return;
            }
            this.doNotDismiss = true;
            final ChatActivity chatActivityOf = ChatActivity.of(webTabData.props.botId);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openTab$1(lastFragment, chatActivityOf);
                }
            }, 220L);
        }
    }

    public void lambda$openTab$0(WebTabData webTabData, BaseFragment baseFragment) throws Resources.NotFoundException {
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
        BotWebViewSheet botWebViewSheet = new BotWebViewSheet(baseFragment.getContext(), baseFragment.getResourceProvider());
        botWebViewSheet.setParentActivity(baseFragment.getParentActivity());
        if (botWebViewSheet.restoreState(baseFragment, webTabData)) {
            removeTab(webTabData, false);
            botWebViewSheet.show();
        }
    }

    public void lambda$openTab$1(BaseFragment baseFragment, BaseFragment baseFragment2) {
        baseFragment.presentFragment(baseFragment2);
        this.doNotDismiss = false;
    }

    public WebTabData tryReopenTab(WebViewRequestProps webViewRequestProps) {
        HashMap map = tabs;
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(this.currentAccount));
        if (arrayList == null) {
            Integer numValueOf = Integer.valueOf(this.currentAccount);
            ArrayList arrayList2 = new ArrayList();
            map.put(numValueOf, arrayList2);
            arrayList = arrayList2;
        }
        if (webViewRequestProps == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            WebTabData webTabData = (WebTabData) arrayList.get(i);
            if (webViewRequestProps.equals(webTabData.props)) {
                openTab(webTabData);
                return webTabData;
            }
        }
        return null;
    }

    public static String urlWithoutFragment(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(35);
        return iIndexOf >= 0 ? str.substring(0, iIndexOf + 1) : str;
    }

    public WebTabData tryReopenTab(String str) {
        ArticleViewer.PageLayout[] pageLayoutArr;
        ArticleViewer.PageLayout pageLayout;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<WebTabData> tabs2 = getTabs();
        for (int i = 0; i < tabs2.size(); i++) {
            WebTabData webTabData = tabs2.get(i);
            ArticleViewer articleViewer = webTabData.articleViewer;
            if (articleViewer != null && !articleViewer.pagesStack.isEmpty()) {
                Object obj = webTabData.articleViewer.pagesStack.get(r5.size() - 1);
                if (obj instanceof ArticleViewer.CachedWeb) {
                    BotWebViewContainer.MyWebView webView = ((ArticleViewer.CachedWeb) obj).webView;
                    if (webView == null && (pageLayoutArr = webTabData.articleViewer.pages) != null && (pageLayout = pageLayoutArr[0]) != null) {
                        webView = pageLayout.getWebView();
                    }
                    if (webView == null) {
                        continue;
                    } else {
                        if (TextUtils.equals(urlWithoutFragment(webView.canGoBack() ? webView.getUrl() : webView.getOpenURL()), urlWithoutFragment(str))) {
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

    public WebTabData tryReopenTab(TLRPC.WebPage webPage) {
        TLRPC.WebPage webPage2;
        if (webPage == null) {
            return null;
        }
        ArrayList<WebTabData> tabs2 = getTabs();
        for (int i = 0; i < tabs2.size(); i++) {
            WebTabData webTabData = tabs2.get(i);
            ArticleViewer articleViewer = webTabData.articleViewer;
            if (articleViewer != null && !articleViewer.pagesStack.isEmpty()) {
                Object obj = webTabData.articleViewer.pagesStack.get(r4.size() - 1);
                if ((obj instanceof TLRPC.WebPage) && (webPage2 = (TLRPC.WebPage) obj) != null && webPage2.id == webPage.id) {
                    openTab(webTabData);
                    return webTabData;
                }
            }
        }
        return null;
    }

    public WebTabData tryReopenTab(MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (messageObject == null || (message = messageObject.messageOwner) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return tryReopenTab(webPage);
    }

    public boolean closeAttachedSheets() {
        LaunchActivity.instance.getBottomSheetTabsOverlay();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            int i = 0;
            while (true) {
                ArrayList<BaseFragment.AttachedSheet> arrayList = safeLastFragment.sheetsStack;
                if (arrayList == null || i >= arrayList.size()) {
                    break;
                }
                safeLastFragment.sheetsStack.get(i);
                i++;
            }
        }
        return false;
    }

    public void setNavigationBarColor(int i) {
        setNavigationBarColor(i, true);
    }

    public void setNavigationBarColor(int i, boolean z) {
        if (i != this.backgroundColor) {
            ActionBarLayout actionBarLayout = this.actionBarLayout;
            if (!actionBarLayout.startedTracking || actionBarLayout.animationInProgress) {
                z = false;
            }
            this.backgroundColor = i;
            int iBlendOver = Theme.blendOver(i, Theme.multAlpha(-1, (AndroidUtilities.computePerceivedBrightness(i) > 0.721f ? 1 : (AndroidUtilities.computePerceivedBrightness(i) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f));
            this.tabColor = iBlendOver;
            this.tabIsDark = AndroidUtilities.computePerceivedBrightness(iBlendOver) < 0.721f;
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
            updateVisibility(false);
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

    public ArrayList getTabs(int i) {
        HashMap map = tabs;
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(i));
        if (arrayList != null) {
            return arrayList;
        }
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList2 = new ArrayList();
        map.put(numValueOf, arrayList2);
        return arrayList2;
    }

    public ArrayList getTabDrawables(int i) {
        HashMap map = tabDrawables;
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(i));
        if (arrayList != null) {
            return arrayList;
        }
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList2 = new ArrayList();
        map.put(numValueOf, arrayList2);
        return arrayList2;
    }

    public TabDrawable findTabDrawable(WebTabData webTabData) {
        ArrayList<TabDrawable> tabDrawables2 = getTabDrawables();
        for (int i = 0; i < tabDrawables2.size(); i++) {
            if (tabDrawables2.get(i).tab == webTabData) {
                return tabDrawables2.get(i);
            }
        }
        return null;
    }

    public TabDrawable pushTab(WebTabData webTabData) {
        ArrayList<WebTabData> tabs2 = getTabs();
        ArrayList<TabDrawable> tabDrawables2 = getTabDrawables();
        TabDrawable tabDrawable = new TabDrawable(this, webTabData);
        tabDrawable.animatedPosition.set(-1.0f, true);
        tabDrawable.animatedAlpha.set(0.0f, true);
        tabDrawables2.add(tabDrawable);
        tabs2.add(0, webTabData);
        for (int i = 0; i < tabDrawables2.size(); i++) {
            TabDrawable tabDrawable2 = tabDrawables2.get(i);
            int iIndexOf = tabs2.indexOf(tabDrawable2.tab);
            tabDrawable2.index = iIndexOf;
            if (iIndexOf >= 0) {
                tabDrawable2.position = iIndexOf;
            }
        }
        updateMultipleTitle();
        updateVisibility(true);
        invalidate();
        return tabDrawable;
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }

    public static TextPaint getTextPaint() {
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            textPaint = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.bold());
            textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        }
        return textPaint;
    }

    private void updateMultipleTitle() {
        CharSequence charSequenceReplaceEmoji;
        ArrayList<WebTabData> tabs2 = getTabs();
        ArrayList<TabDrawable> tabDrawables2 = getTabDrawables();
        CharSequence charSequence = null;
        for (int i = 0; i < tabDrawables2.size(); i++) {
            TabDrawable tabDrawable = tabDrawables2.get(i);
            if (tabs2.size() > 1 && tabDrawable.position == 0) {
                charSequenceReplaceEmoji = Emoji.replaceEmoji(LocaleController.formatPluralString("BotMoreTabs", tabs2.size() - 1, tabDrawable.tab.getTitle()), getTextPaint().getFontMetricsInt(), false);
                tabDrawable.setOverrideTitle(charSequenceReplaceEmoji);
            } else {
                charSequenceReplaceEmoji = Emoji.replaceEmoji(tabDrawable.tab.getTitle(), getTextPaint().getFontMetricsInt(), false);
                tabDrawable.setOverrideTitle(null);
            }
            charSequence = charSequenceReplaceEmoji;
        }
        if (tabs2.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(LocaleController.formatString(R.string.AccDescrTabs, ""));
            return;
        }
        setImportantForAccessibility(1);
        int i2 = R.string.AccDescrTabs;
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(LocaleController.formatString(i2, charSequence));
    }

    public boolean removeAll() {
        ArrayList<WebTabData> tabs2 = getTabs();
        ArrayList<TabDrawable> tabDrawables2 = getTabDrawables();
        for (int i = 0; i < tabs2.size(); i++) {
            tabs2.get(i).destroy();
        }
        tabs2.clear();
        for (int i2 = 0; i2 < tabDrawables2.size(); i2++) {
            tabDrawables2.get(i2).index = -1;
        }
        updateMultipleTitle();
        updateVisibility(true);
        invalidate();
        return tabs2.isEmpty();
    }

    public boolean tryRemoveTabWith(ArticleViewer articleViewer) {
        int i = 0;
        while (true) {
            HashMap map = tabs;
            if (i >= map.size()) {
                return false;
            }
            ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(i));
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    WebTabData webTabData = (WebTabData) it.next();
                    if (webTabData.articleViewer == articleViewer) {
                        return removeTab(i, webTabData, true);
                    }
                }
            }
            i++;
        }
    }

    public void removeTab(final WebTabData webTabData, final Utilities.Callback callback) {
        if (webTabData == null) {
            callback.run(Boolean.TRUE);
            return;
        }
        if (!webTabData.confirmDismiss) {
            removeTab(webTabData, true);
            callback.run(Boolean.TRUE);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(webTabData.props.currentAccount).getUser(Long.valueOf(webTabData.props.botId));
        final boolean[] zArr = {false};
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setTitle(user != null ? ContactsController.formatName(user.first_name, user.last_name) : null).setMessage(LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved)).setPositiveButton(LocaleController.getString(R.string.BotWebViewCloseAnyway), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$removeTab$2(zArr, webTabData, callback, alertDialogArr, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                BottomSheetTabs.lambda$removeTab$3(zArr, callback, alertDialogArr, alertDialog, i);
            }
        }).create();
        final AlertDialog[] alertDialogArr = {alertDialogCreate};
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                BottomSheetTabs.lambda$removeTab$4(zArr, callback, dialogInterface);
            }
        });
        alertDialogArr[0].show();
        ((TextView) alertDialogArr[0].getButton(-1)).setTextColor(Theme.getColor(Theme.key_text_RedBold));
    }

    public void lambda$removeTab$2(boolean[] zArr, WebTabData webTabData, Utilities.Callback callback, AlertDialog[] alertDialogArr, AlertDialog alertDialog, int i) {
        zArr[0] = true;
        removeTab(webTabData, true);
        callback.run(Boolean.TRUE);
        alertDialogArr[0].dismiss();
    }

    public static void lambda$removeTab$3(boolean[] zArr, Utilities.Callback callback, AlertDialog[] alertDialogArr, AlertDialog alertDialog, int i) {
        zArr[0] = true;
        callback.run(Boolean.FALSE);
        alertDialogArr[0].dismiss();
    }

    public static void lambda$removeTab$4(boolean[] zArr, Utilities.Callback callback, DialogInterface dialogInterface) {
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
        ArrayList tabs2 = getTabs(i);
        final ArrayList tabDrawables2 = getTabDrawables(i);
        tabs2.remove(webTabData);
        if (z) {
            webTabData.destroy();
        }
        for (int i2 = 0; i2 < tabDrawables2.size(); i2++) {
            TabDrawable tabDrawable = (TabDrawable) tabDrawables2.get(i2);
            int iIndexOf = tabs2.indexOf(tabDrawable.tab);
            tabDrawable.index = iIndexOf;
            if (iIndexOf >= 0) {
                tabDrawable.position = iIndexOf;
            }
        }
        updateMultipleTitle();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$removeTab$5(tabDrawables2, webTabData);
            }
        }, 320L);
        updateVisibility(true);
        invalidate();
        return tabs2.isEmpty();
    }

    public void lambda$removeTab$5(ArrayList arrayList, WebTabData webTabData) {
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
        return touchEvent(motionEvent.getAction(), motionEvent.getX(), motionEvent.getY()) || super.onTouchEvent(motionEvent);
    }

    public boolean touchEvent(int i, float f, float f2) {
        ArrayList<WebTabData> tabs2 = getTabs();
        ArrayList<TabDrawable> tabDrawables2 = getTabDrawables();
        if (this.drawTabs) {
            WebTabData webTabData = tabs2.isEmpty() ? null : tabs2.get(0);
            TabDrawable tabDrawableFindTabDrawable = findTabDrawable(webTabData);
            if (tabDrawableFindTabDrawable != null) {
                getTabBounds(this.rect, tabDrawableFindTabDrawable.getPosition());
                if (i == 0 || i == 2) {
                    Rect bounds = tabDrawableFindTabDrawable.closeRipple.getBounds();
                    RectF rectF = this.rect;
                    boolean zContains = bounds.contains((int) (f - rectF.left), (int) (f2 - rectF.centerY()));
                    this.closeRippleHit = zContains;
                    this.hit = !zContains && this.rect.contains(f, f2);
                    tabDrawableFindTabDrawable.closeRipple.setState(this.closeRippleHit ? new int[]{16842919, 16842910} : new int[0]);
                } else if (i == 1 || i == 3) {
                    if (this.hit && i == 1) {
                        click();
                    } else if (this.closeRippleHit && i == 1) {
                        removeTab(webTabData, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                BottomSheetTabs.lambda$touchEvent$6((Boolean) obj);
                            }
                        });
                    }
                    this.closeRippleHit = false;
                    this.hit = false;
                    tabDrawableFindTabDrawable.closeRipple.setState(new int[0]);
                }
                for (int i2 = 0; i2 < tabDrawables2.size(); i2++) {
                    if (tabDrawables2.get(i2) != tabDrawableFindTabDrawable) {
                        tabDrawables2.get(i2).closeRipple.setState(new int[0]);
                    }
                }
            } else {
                this.hit = false;
                this.closeRippleHit = false;
            }
        } else {
            this.hit = false;
            this.closeRippleHit = false;
        }
        return this.hit || this.closeRippleHit;
    }

    public void click() {
        ArrayList<WebTabData> tabs2 = getTabs();
        int size = tabs2.size();
        if (size == 0) {
            return;
        }
        WebTabData webTabData = tabs2.get(tabs2.size() - 1);
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

    @Override
    protected void dispatchDraw(Canvas canvas) {
        getTabs();
        ArrayList<TabDrawable> tabDrawables2 = getTabDrawables();
        if (this.bottomTabsProgress <= 0.0f) {
            return;
        }
        this.backgroundPaint.setColor(this.backgroundColorAnimated.set(this.backgroundColor));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.backgroundPaint);
        super.dispatchDraw(canvas);
        int i = this.tabColorAnimated.set(this.tabColor);
        float f = this.tabDarkAnimated.set(this.tabIsDark);
        if (this.drawTabs) {
            for (int i2 = 0; i2 < tabDrawables2.size(); i2++) {
                TabDrawable tabDrawable = tabDrawables2.get(i2);
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
        float fLerp = AndroidUtilities.lerp(1.0f, 0.95f, Math.abs(f));
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f2 = (fWidth / 2.0f) * fLerp;
        rectF.left = fCenterX - f2;
        rectF.right = fCenterX + f2;
        float f3 = (fHeight / 2.0f) * fLerp;
        rectF.top = fCenterY - f3;
        rectF.bottom = fCenterY + f3;
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
        public final View parentView;
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
            Drawable drawableCreateSelectorDrawable = Theme.createSelectorDrawable(822083583, 1);
            this.closeRipple = drawableCreateSelectorDrawable;
            this.iconDrawableColor = -1;
            this.radii = new float[8];
            this.rectPath = new Path();
            Path path = new Path();
            this.closePath = path;
            Path path2 = new Path();
            this.expandPath = path2;
            this.parentView = view;
            this.tab = webTabData;
            drawableCreateSelectorDrawable.setCallback(view);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animatedPosition = new AnimatedFloat(view, 320L, cubicBezierInterpolator);
            this.animatedAlpha = new AnimatedFloat(view, 320L, cubicBezierInterpolator);
            this.favicon = webTabData.favicon;
            this.title = new Text(Emoji.replaceEmoji(webTabData.getTitle(), BottomSheetTabs.getTextPaint().getFontMetricsInt(), false), 17.0f, AndroidUtilities.bold());
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
            float fMin;
            float position = getPosition();
            if (position < 0.0f) {
                fMin = position + 1.0f;
            } else if (position >= 0.0f && position < 1.0f) {
                fMin = AndroidUtilities.lerp(1.0f, 0.87f, position);
            } else {
                fMin = (1.0f - Math.min(1.0f, position - 1.0f)) * 0.87f;
            }
            return fMin * this.animatedAlpha.set(this.index >= 0);
        }

        public void setBackgroundColor(int i, boolean z) {
            this.backgroundColor = i;
            this.backgroundIsDark = z;
        }

        public void setExpandProgress(float f) {
            this.expandProgress = f;
        }

        public void draw(Canvas canvas, RectF rectF, float f, float f2, float f3) {
            int iBlendARGB = ColorUtils.blendARGB(this.backgroundColor, this.tabColor, this.expandProgress);
            this.backgroundPaint.setColor(iBlendARGB);
            float f4 = f2 * 255.0f;
            this.backgroundPaint.setAlpha((int) f4);
            this.backgroundPaint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(268435456, f2));
            float[] fArr = this.radii;
            fArr[3] = f;
            fArr[2] = f;
            fArr[1] = f;
            int iDp = 0;
            fArr[0] = f;
            float fLerp = AndroidUtilities.lerp(f, 0.0f, this.expandProgress);
            fArr[7] = fLerp;
            fArr[6] = fLerp;
            fArr[5] = fLerp;
            fArr[4] = fLerp;
            this.rectPath.rewind();
            this.rectPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
            canvas.drawPath(this.rectPath, this.backgroundPaint);
            if (this.progress > 0.0f && this.expandProgress > 0.0f && f2 > 0.0f) {
                canvas.save();
                canvas.clipPath(this.rectPath);
                this.progressPaint.setColor(Theme.multAlpha(AndroidUtilities.computePerceivedBrightness(iBlendARGB) > 0.721f ? -16777216 : -1, 0.07f * f2 * this.expandProgress));
                float f5 = rectF.left;
                canvas.drawRect(f5, rectF.top, f5 + (rectF.width() * this.progress), rectF.bottom, this.progressPaint);
                canvas.restore();
            }
            float fLerp2 = AndroidUtilities.lerp(this.backgroundIsDark ? 1.0f : 0.0f, this.tabIsDark ? 1.0f : 0.0f, this.expandProgress);
            int iBlendARGB2 = ColorUtils.blendARGB(-16777216, -1, fLerp2);
            this.iconPaint.setColor(iBlendARGB2);
            this.iconPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            canvas.save();
            canvas.translate(rectF.left, rectF.centerY());
            int iBlendARGB3 = ColorUtils.blendARGB(553648127, 553648127, fLerp2);
            this.closeRipple.setBounds(AndroidUtilities.dp(25.0f) + (-AndroidUtilities.dp(25.0f)), -AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f));
            if (this.closeRippleColor != iBlendARGB3) {
                Drawable drawable = this.closeRipple;
                this.closeRippleColor = iBlendARGB3;
                Theme.setSelectorDrawableColor(drawable, iBlendARGB3, false);
            }
            this.closeRipple.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(rectF.left + AndroidUtilities.dp(18.0f), rectF.centerY() - AndroidUtilities.dp(6.0f));
            float f6 = f4 * f3;
            int i = (int) f6;
            this.iconPaint.setAlpha(i);
            canvas.drawPath(this.closePath, this.iconPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(rectF.right - AndroidUtilities.dp(30.66f), rectF.centerY());
            this.iconPaint.setAlpha((int) (f6 * (1.0f - this.expandProgress)));
            canvas.drawPath(this.expandPath, this.iconPaint);
            canvas.restore();
            if (this.favicon != null) {
                int iDp2 = AndroidUtilities.dp(24.0f);
                canvas.save();
                Rect rect = AndroidUtilities.rectTmp2;
                float f7 = iDp2;
                float f8 = f7 / 2.0f;
                rect.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f8), (int) (rectF.left + AndroidUtilities.dp(56.0f) + f7), (int) (rectF.centerY() + f8));
                this.faviconPaint.setAlpha(i);
                canvas.drawBitmap(this.favicon, (Rect) null, rect, this.faviconPaint);
                canvas.restore();
                iDp = iDp2 + AndroidUtilities.dp(4.0f);
            } else if (this.iconDrawable != null) {
                float fDp = AndroidUtilities.dp(24.0f);
                int intrinsicHeight = (int) ((fDp / this.iconDrawable.getIntrinsicHeight()) * this.iconDrawable.getIntrinsicWidth());
                Rect rect2 = AndroidUtilities.rectTmp2;
                float f9 = (fDp / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + AndroidUtilities.dp(56.0f)), (int) (rectF.centerY() - f9), (int) (rectF.left + AndroidUtilities.dp(56.0f) + (intrinsicHeight * 0.7f)), (int) (rectF.centerY() + f9));
                if (iBlendARGB2 != this.iconDrawableColor) {
                    Drawable drawable2 = this.iconDrawable;
                    this.iconDrawableColor = iBlendARGB2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(iBlendARGB2, PorterDuff.Mode.SRC_IN));
                }
                this.iconDrawable.setAlpha(i);
                this.iconDrawable.setBounds(rect2);
                this.iconDrawable.draw(canvas);
                iDp = intrinsicHeight - AndroidUtilities.dp(2.0f);
            }
            Text text = this.overrideTitle;
            if (text != null) {
                text.ellipsize((int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - r3)).draw(canvas, iDp + rectF.left + AndroidUtilities.dp(60.0f), rectF.centerY(), iBlendARGB2, (1.0f - this.expandProgress) * f2 * f3);
            }
            this.title.ellipsize((int) ((rectF.width() - AndroidUtilities.dp(100.0f)) - r3)).draw(canvas, iDp + rectF.left + AndroidUtilities.dp(60.0f), rectF.centerY(), iBlendARGB2, (this.overrideTitle != null ? this.expandProgress : 1.0f) * f2 * f3);
        }
    }

    public static class WebTabData {
        public int actionBarColor;
        public int actionBarColorKey;
        public float articleProgress;
        public ArticleViewer articleViewer;
        public boolean backButton;
        public int backgroundColor;
        public BotButtons.ButtonsState buttons;
        public boolean confirmDismiss;
        public String currentUrl;
        public boolean error;
        public String errorDescription;
        public boolean expanded;
        public Bitmap favicon;
        public boolean fullscreen;
        public boolean fullscreenBlur;
        public boolean fullsize;
        public boolean isWeb;
        public String lastUrl;
        public int navigationBarColor;
        public boolean needsContext;
        public boolean orientationLocked;
        public boolean overrideActionBarColor;
        public boolean overrideBackgroundColor;
        public Bitmap previewBitmap;
        public Object previewNode;
        public WebViewRequestProps props;
        public Object proxy;
        public boolean ready;
        public BotSensors sensors;
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

    public void updateVisibility(boolean z) {
        if (this.bottomTabsHeight == getExpandedHeight()) {
            return;
        }
        ValueAnimator valueAnimator = this.bottomTabsAnimator;
        if (valueAnimator != null) {
            this.bottomTabsAnimator = null;
            valueAnimator.cancel();
        }
        this.bottomTabsHeight = getExpandedHeight();
        Iterator it = this.relayoutListeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.bottomTabsProgress, this.bottomTabsHeight);
            this.bottomTabsAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$updateVisibility$7(valueAnimator2);
                }
            });
            this.bottomTabsAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (BottomSheetTabs.this.bottomTabsAnimator == animator) {
                        BottomSheetTabs bottomSheetTabs = BottomSheetTabs.this;
                        bottomSheetTabs.bottomTabsProgress = bottomSheetTabs.bottomTabsHeight;
                        Iterator it2 = bottomSheetTabs.invalidateListeners.iterator();
                        while (it2.hasNext()) {
                            ((Runnable) it2.next()).run();
                        }
                    }
                }
            });
            this.bottomTabsAnimator.setDuration(250L);
            this.bottomTabsAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            this.bottomTabsAnimator.start();
        } else {
            this.bottomTabsProgress = this.bottomTabsHeight;
            invalidate();
        }
        Object parent = getParent();
        if (parent instanceof View) {
            ViewCompat.requestApplyInsets((View) parent);
        }
    }

    public void lambda$updateVisibility$7(ValueAnimator valueAnimator) {
        this.bottomTabsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator it = this.invalidateListeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        invalidate();
    }

    public static class ClipTools {
        private final BottomSheetTabs tabs;
        private final RectF clipRect = new RectF();
        private final float[] clipRadius = new float[8];
        private final Path clipPath = new Path();
        private final Paint clipShadowPaint = new Paint(1);

        public ClipTools(BottomSheetTabs bottomSheetTabs) {
            this.tabs = bottomSheetTabs;
        }

        public void clip(Canvas canvas, boolean z, boolean z2, int i, int i2, float f) {
            int height = (int) ((z2 ? 0 : this.tabs.getHeight(true)) * f);
            int iMin = Math.min(1, height / AndroidUtilities.dp(60.0f)) * AndroidUtilities.dp(10.0f);
            if (height <= 0) {
                return;
            }
            float[] fArr = this.clipRadius;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
            float f2 = iMin;
            fArr[7] = f2;
            fArr[6] = f2;
            fArr[5] = f2;
            fArr[4] = f2;
            this.clipPath.rewind();
            this.clipRect.set(0.0f, 0.0f, i, (this.tabs.getY() + this.tabs.getHeight()) - height);
            this.clipPath.addRoundRect(this.clipRect, this.clipRadius, Path.Direction.CW);
            this.clipShadowPaint.setAlpha(0);
            if (z) {
                this.clipShadowPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), 268435456);
                canvas.drawPath(this.clipPath, this.clipShadowPaint);
            }
            canvas.clipPath(this.clipPath);
        }
    }

    public int getHeight(boolean z) {
        if (z) {
            return (int) this.bottomTabsProgress;
        }
        return this.bottomTabsHeight;
    }

    public void listen(Runnable runnable, Runnable runnable2) {
        this.invalidateListeners.add(runnable);
        this.relayoutListeners.add(runnable2);
    }

    public void stopListening(Runnable runnable, Runnable runnable2) {
        this.invalidateListeners.remove(runnable);
        this.relayoutListeners.remove(runnable2);
    }
}
