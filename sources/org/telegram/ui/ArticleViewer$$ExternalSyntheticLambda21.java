package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.common.base.Splitter;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.BottomSheetTabsOverlay;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer.TextSizeCell;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiPacksAlert$EmojiPacksLoader$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.EmojiView$2$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.poll.sheets.PollStatisticsBottomSheet;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.bots.BotButtons;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.BookmarksFragment;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.SearchEngine;
import org.telegram.ui.web.WebBrowserSettings;
import org.telegram.ui.web.WebInstantView;

public final class ArticleViewer$$ExternalSyntheticLambda21 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ArticleViewer$$ExternalSyntheticLambda21(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj) {
        WebInstantView.Loader loader;
        String url;
        String openURL;
        File file;
        String url2;
        FrameLayout frameLayout;
        String url3;
        int color;
        ChatActivity chatActivity;
        ChatActivity.AnonymousClass39 anonymousClass39;
        ArrayList<TLRPC.Document> arrayList;
        int i = 2;
        int i2 = 10;
        int i3 = 9;
        int i4 = 4;
        int i5 = 3;
        int i6 = 0;
        int i7 = 1;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Integer num = (Integer) obj;
                ArticleViewer articleViewer = (ArticleViewer) obj3;
                if ((!articleViewer.pages[0].isArticle() || articleViewer.pages[0].adapter.currentPage != null) && articleViewer.parentActivity != null) {
                    if (num.intValue() == 1) {
                        ArticleViewer.AnonymousClass15 anonymousClass15 = articleViewer.actionBar;
                        int iDp = AndroidUtilities.dp(56.0f);
                        articleViewer.currentHeaderHeight = iDp;
                        anonymousClass15.setHeight(iDp);
                        articleViewer.actionBar.showSearch(true);
                        break;
                    } else if (num.intValue() == 2) {
                        if (!articleViewer.pages[0].isWeb()) {
                            TLRPC.WebPage webPage = articleViewer.pages[0].adapter.currentPage;
                            if (webPage != null) {
                                url3 = webPage.url;
                            }
                        } else if (articleViewer.pages[0].getWebView() != null) {
                            url3 = articleViewer.pages[0].getWebView().getUrl();
                        }
                        String strMagic2tonsite = BotWebViewContainer.magic2tonsite(url3);
                        articleViewer.showDialog(new ShareAlert(articleViewer.parentActivity, strMagic2tonsite, strMagic2tonsite, AndroidUtilities.computePerceivedBrightness(articleViewer.actionBar.getBackgroundColor()) < 0.721f ? new DarkThemeResourceProvider() : null));
                        break;
                    } else {
                        int iIntValue = num.intValue();
                        ArticleViewer.Sheet sheet = articleViewer.sheet;
                        if (iIntValue == 6) {
                            if (!articleViewer.pages[0].isWeb()) {
                                ArticleViewer.PageLayout pageLayout = articleViewer.pages[0];
                                TLRPC.WebPage webPage2 = pageLayout.adapter.currentPage;
                                if (webPage2 != null) {
                                    url2 = webPage2.url;
                                    frameLayout = pageLayout;
                                }
                            } else if (articleViewer.pages[0].getWebView() != null) {
                                url2 = articleViewer.pages[0].getWebView().getUrl();
                                frameLayout = articleViewer.pages[0].webViewContainer;
                            }
                            ArticleViewer.addBookmark(url2, articleViewer.currentAccount, frameLayout, sheet, null);
                            break;
                        } else if (num.intValue() == 7) {
                            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                            bottomSheetParams.transitionFromLeft = true;
                            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                            if (safeLastFragment != null) {
                                safeLastFragment.showAsSheet(new BookmarksFragment(new ArticleViewer$$ExternalSyntheticLambda10(articleViewer, i), sheet != null ? new ArticleViewer$$ExternalSyntheticLambda0(articleViewer, i4) : null), bottomSheetParams);
                            }
                            break;
                        } else if (num.intValue() == 8) {
                            BaseFragment.BottomSheetParams bottomSheetParams2 = new BaseFragment.BottomSheetParams();
                            bottomSheetParams2.transitionFromLeft = true;
                            BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                            if (safeLastFragment2 != null) {
                                safeLastFragment2.showAsSheet(new HistoryFragment(new ArticleViewer$$ExternalSyntheticLambda10(articleViewer, i5), sheet != null ? new ArticleViewer$$ExternalSyntheticLambda0(articleViewer, 5) : null), bottomSheetParams2);
                            }
                            break;
                        } else if (num.intValue() == 9) {
                            if (articleViewer.pages[0].getWebView() != null) {
                                articleViewer.pages[0].getWebView().goForward();
                            }
                            break;
                        } else if (num.intValue() == 3) {
                            if (!articleViewer.pages[0].isWeb()) {
                                TLRPC.WebPage webPage3 = articleViewer.pages[0].adapter.currentPage;
                                if (webPage3 != null) {
                                    String str = webPage3.url;
                                    TL_iv.Page page = webPage3.cached_page;
                                    if (page != null) {
                                        file = page.local;
                                        url = str;
                                        openURL = null;
                                    } else {
                                        url = str;
                                        openURL = null;
                                        file = null;
                                    }
                                }
                            } else if (articleViewer.pages[0].getWebView() != null) {
                                url = articleViewer.pages[0].getWebView().getUrl();
                                openURL = articleViewer.pages[0].getWebView().getOpenURL();
                                file = null;
                            }
                            Activity activity = articleViewer.parentActivity;
                            if (activity != null && !activity.isFinishing()) {
                                if (file != null) {
                                    AndroidUtilities.openForView(file, null, "text/markdown", articleViewer.parentActivity, null, true);
                                    break;
                                } else if (url != null) {
                                    String hostAuthority = AndroidUtilities.getHostAuthority(openURL, true);
                                    String hostAuthority2 = AndroidUtilities.getHostAuthority(url, true);
                                    ArticleViewer$$ExternalSyntheticLambda32 articleViewer$$ExternalSyntheticLambda32 = new ArticleViewer$$ExternalSyntheticLambda32(articleViewer, url, i7);
                                    ArticleViewer$$ExternalSyntheticLambda33 articleViewer$$ExternalSyntheticLambda33 = new ArticleViewer$$ExternalSyntheticLambda33(articleViewer, hostAuthority2, hostAuthority, i7);
                                    if (articleViewer.pages[0].isWeb() && MessagesController.getInstance(articleViewer.currentAccount).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(articleViewer.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
                                        AlertsCreator.showOpenExternalBrowserAlert((Activity) obj2, null, url, true, new OAuthSheet$$ExternalSyntheticLambda18(i7, articleViewer$$ExternalSyntheticLambda33, articleViewer$$ExternalSyntheticLambda32));
                                    } else {
                                        articleViewer$$ExternalSyntheticLambda32.run();
                                    }
                                    break;
                                }
                            }
                        } else if (num.intValue() == 4) {
                            if (!articleViewer.pages[0].isWeb()) {
                                BottomSheet bottomSheet = new BottomSheet(articleViewer.parentActivity, null, false, false);
                                bottomSheet.fixNavigationBar();
                                bottomSheet.applyTopPadding = false;
                                LinearLayout linearLayout = new LinearLayout(articleViewer.parentActivity);
                                linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                                linearLayout.setOrientation(1);
                                HeaderCell headerCell = new HeaderCell(articleViewer.parentActivity, (Theme.ResourcesProvider) null);
                                headerCell.setText(LocaleController.getString(R.string.FontSize));
                                linearLayout.addView(headerCell, LayoutHelper.createLinear(-2, -2, 51, 3, 1, 3, 0));
                                linearLayout.addView(articleViewer.new TextSizeCell(articleViewer.parentActivity), LayoutHelper.createLinear(-1, -2, 51, 3, 0, 3, 0));
                                HeaderCell headerCell2 = new HeaderCell(articleViewer.parentActivity, (Theme.ResourcesProvider) null);
                                headerCell2.setText(LocaleController.getString(R.string.FontType));
                                linearLayout.addView(headerCell2, LayoutHelper.createLinear(-2, -2, 51, 3, 4, 3, 2));
                                int i8 = 0;
                                while (i8 < 2) {
                                    IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(articleViewer.parentActivity, 3);
                                    IntroActivity.AnonymousClass1[] anonymousClass1Arr = articleViewer.fontCells;
                                    anonymousClass1Arr[i8] = anonymousClass1;
                                    TextView textView = (TextView) anonymousClass1.val$themeFrameLayout;
                                    if (i8 == 0) {
                                        String string = LocaleController.getString(R.string.Default);
                                        Typeface typeface = Typeface.DEFAULT;
                                        textView.setText(string);
                                        textView.setTypeface(typeface);
                                        anonymousClass1.setContentDescription(string);
                                        anonymousClass1.invalidate();
                                    } else if (i8 == 1) {
                                        Typeface typeface2 = Typeface.SERIF;
                                        textView.setText("Serif");
                                        textView.setTypeface(typeface2);
                                        anonymousClass1.setContentDescription("Serif");
                                        anonymousClass1.invalidate();
                                    }
                                    ((RadioButton) anonymousClass1Arr[i8].this$0).setChecked(i8 == articleViewer.selectedFont, false);
                                    anonymousClass1Arr[i8].setTag(Integer.valueOf(i8));
                                    anonymousClass1Arr[i8].setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda11(articleViewer, i4));
                                    linearLayout.addView(anonymousClass1Arr[i8], LayoutHelper.createLinear(-1, 50));
                                    i8++;
                                }
                                bottomSheet.customView = linearLayout;
                                articleViewer.linkSheet = bottomSheet;
                                articleViewer.showDialog(bottomSheet);
                            } else {
                                BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                                if (safeLastFragment3 != null) {
                                    BaseFragment.BottomSheetParams bottomSheetParams3 = new BaseFragment.BottomSheetParams();
                                    bottomSheetParams3.transitionFromLeft = true;
                                    safeLastFragment3.showAsSheet(new WebBrowserSettings(new ArticleViewer$$ExternalSyntheticLambda10(articleViewer, i5)), bottomSheetParams3);
                                }
                            }
                            break;
                        } else if (num.intValue() != 5) {
                            if (num.intValue() == 10 && (loader = articleViewer.pages[0].currentInstantLoader) != null && loader.getWebPage() != null) {
                                TLRPC.WebPage webPage4 = loader.getWebPage();
                                articleViewer.saveCurrentPagePosition();
                                articleViewer.pagesStack.add(webPage4);
                                articleViewer.actionBar.showSearch(false);
                                articleViewer.updateInterfaceForCurrentPage(1, webPage4, false);
                                articleViewer.scrollToAnchor(null, false);
                                break;
                            }
                        } else if (articleViewer.pages[0].isWeb() && articleViewer.pages[0].getWebView() != null) {
                            articleViewer.pages[0].getWebView().reload();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 2:
                BaseFragment baseFragment = (BaseFragment) obj;
                BottomSheetTabs bottomSheetTabs = (BottomSheetTabs) obj3;
                bottomSheetTabs.getClass();
                if (baseFragment != null) {
                    if ((baseFragment instanceof ChatActivity) && (anonymousClass39 = (chatActivity = (ChatActivity) baseFragment).chatActivityEnterView) != null) {
                        AndroidUtilities.hideKeyboard(anonymousClass39.messageEditText);
                        chatActivity.chatActivityEnterView.hidePopup(true, false, true);
                    }
                    if (baseFragment.getContext() != null && baseFragment.getParentActivity() != null) {
                        BotWebViewSheet botWebViewSheet = new BotWebViewSheet(baseFragment.getContext(), baseFragment.getResourceProvider());
                        botWebViewSheet.parentActivity = baseFragment.getParentActivity();
                        BottomSheetTabs.WebTabData webTabData = (BottomSheetTabs.WebTabData) obj2;
                        if (webTabData != null && webTabData.props != null) {
                            botWebViewSheet.fromTab = true;
                            boolean z = webTabData.overrideBackgroundColor;
                            botWebViewSheet.overrideBackgroundColor = z;
                            if (z) {
                                botWebViewSheet.setBackgroundColor(webTabData.backgroundColor, false);
                            }
                            if (webTabData.overrideActionBarColor) {
                                color = webTabData.actionBarColor;
                            } else {
                                int i9 = webTabData.actionBarColorKey;
                                if (i9 < 0) {
                                    i9 = Theme.key_windowBackgroundWhite;
                                }
                                color = Theme.getColor(i9, botWebViewSheet.resourcesProvider);
                            }
                            botWebViewSheet.setActionBarColor(color, webTabData.overrideActionBarColor, false);
                            botWebViewSheet.setNavigationBarColor(webTabData.navigationBarColor, false);
                            botWebViewSheet.showExpanded = webTabData.expanded;
                            botWebViewSheet.showOffsetY = webTabData.expandedOffset;
                            boolean z2 = webTabData.backButton;
                            botWebViewSheet.backButtonShown = z2;
                            BotWebViewSheet.AnonymousClass2 anonymousClass2 = botWebViewSheet.webViewContainer;
                            anonymousClass2.setIsBackButtonVisible(z2);
                            botWebViewSheet.swipeContainer.setAllowSwipes(webTabData.allowSwipes);
                            AndroidUtilities.updateImageViewImageAnimated(botWebViewSheet.actionBar.getBackButton(), botWebViewSheet.backButtonShown ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = botWebViewSheet.fullscreenButtons;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(botWebViewSheet.backButtonShown, false);
                            }
                            botWebViewSheet.needCloseConfirmation = webTabData.confirmDismiss;
                            botWebViewSheet.fullsize = Boolean.valueOf(webTabData.fullsize);
                            botWebViewSheet.needsContext = webTabData.needsContext;
                            BotSensors botSensors = webTabData.sensors;
                            botWebViewSheet.sensors = botSensors;
                            if (botSensors != null && botSensors.paused) {
                                botSensors.paused = false;
                                SensorManager sensorManager = botSensors.sensorManager;
                                if (sensorManager != null) {
                                    Sensor sensor = botSensors.accelerometer;
                                    if (sensor != null) {
                                        sensorManager.registerListener(botSensors.accelerometerListener, sensor, BotSensors.getSensorDelay(botSensors.accelerometerDesiredRefreshRate));
                                    }
                                    Sensor sensor2 = botSensors.gyroscope;
                                    if (sensor2 != null) {
                                        sensorManager.registerListener(botSensors.gyroscopeListener, sensor2, BotSensors.getSensorDelay(botSensors.gyroscopeDesiredRefreshRate));
                                    }
                                    Sensor sensor3 = botSensors.orientationAccelerometer;
                                    BotSensors.AnonymousClass3 anonymousClass3 = botSensors.absoluteOrientationListener;
                                    if (sensor3 != null) {
                                        sensorManager.registerListener(anonymousClass3, sensor3, BotSensors.getSensorDelay(botSensors.absoluteOrientationDesiredRefreshRate));
                                    }
                                    Sensor sensor4 = botSensors.orientationMagnetometer;
                                    if (sensor4 != null) {
                                        sensorManager.registerListener(anonymousClass3, sensor4, BotSensors.getSensorDelay(botSensors.absoluteOrientationDesiredRefreshRate));
                                    }
                                    Sensor sensor5 = botSensors.rotation;
                                    if (sensor5 != null) {
                                        sensorManager.registerListener(botSensors.relativeOrientationListener, sensor5, BotSensors.getSensorDelay(botSensors.relativeOrientationDesiredRefreshRate));
                                    }
                                }
                            }
                            Splitter splitter = webTabData.buttons;
                            if (splitter != null) {
                                BotWebViewSheet.AnonymousClass4 anonymousClass4 = botWebViewSheet.botButtons;
                                int totalHeight = anonymousClass4.getTotalHeight();
                                anonymousClass4.state = splitter;
                                BotButtons.Button[] buttonArr = anonymousClass4.buttons;
                                BotButtons.setText(buttonArr[0].textDrawable, (BotButtons.ButtonState) splitter.trimmer, false);
                                BotButtons.setText(buttonArr[1].textDrawable, (BotButtons.ButtonState) splitter.strategy, false);
                                anonymousClass4.invalidate();
                                if (totalHeight != anonymousClass4.getTotalHeight() && anonymousClass4.whenResized != null) {
                                    if (totalHeight < anonymousClass4.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(anonymousClass4.whenResized, 200L);
                                    } else {
                                        anonymousClass4.whenResized.run();
                                    }
                                }
                                int i10 = splitter.limit;
                                Paint paint = anonymousClass4.backgroundPaint;
                                anonymousClass4.state.limit = i10;
                                paint.setColor(i10);
                                anonymousClass4.background.set(i10, true);
                            }
                            botWebViewSheet.setFullscreen(webTabData.fullscreen, false, webTabData.fullscreenBlur);
                            WebViewRequestProps webViewRequestProps = webTabData.props;
                            botWebViewSheet.currentAccount = webViewRequestProps != null ? webViewRequestProps.currentAccount : UserConfig.selectedAccount;
                            BotWebViewContainer.MyWebView myWebView = webTabData.webView;
                            if (myWebView != null) {
                                myWebView.onResume();
                                int i11 = botWebViewSheet.currentAccount;
                                BotWebViewContainer.MyWebView myWebView2 = webTabData.webView;
                                Object obj4 = webTabData.proxy;
                                anonymousClass2.currentAccount = i11;
                                anonymousClass2.setupWebView(myWebView2, obj4);
                                if (anonymousClass2.bot) {
                                    anonymousClass2.notifyEvent("visibility_changed", BotWebViewContainer.obj(Boolean.TRUE, "is_visible"));
                                }
                                boolean z3 = webTabData.ready || webTabData.webView.isPageLoaded;
                                String str2 = webTabData.lastUrl;
                                anonymousClass2.d("setState(" + z3 + ", " + str2 + ")");
                                anonymousClass2.isPageLoaded = z3;
                                anonymousClass2.mUrl = str2;
                                if (Theme.currentTheme.isDark() != webTabData.themeIsDark) {
                                    anonymousClass2.notifyThemeChanged();
                                }
                            } else {
                                webViewRequestProps.response = null;
                                webViewRequestProps.responseTime = 0L;
                            }
                            botWebViewSheet.requestWebView(baseFragment, webTabData.props);
                            botWebViewSheet.hasSettings = webTabData.settings;
                            if (webTabData.error) {
                                botWebViewSheet.errorShown = true;
                                botWebViewSheet.createErrorContainer();
                                ArticleViewer.ErrorContainer errorContainer = botWebViewSheet.errorContainer;
                                String userName = UserObject.getUserName(MessagesController.getInstance(botWebViewSheet.currentAccount).getUser(Long.valueOf(botWebViewSheet.botId)));
                                String str3 = webTabData.errorDescription;
                                botWebViewSheet.errorCode = str3;
                                errorContainer.titleView.setText(LocaleController.getString(R.string.WebErrorTitle));
                                zzko.m(R.string.WebErrorInfoBot, new Object[]{userName}, errorContainer.descriptionView);
                                errorContainer.codeView.setText(str3);
                                ArticleViewer.ErrorContainer errorContainer2 = botWebViewSheet.errorContainer;
                                Paint paint2 = botWebViewSheet.backgroundPaint;
                                errorContainer2.setDark(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                                botWebViewSheet.errorContainer.setBackgroundColor(paint2.getColor());
                                botWebViewSheet.errorContainer.setVisibility(0);
                                botWebViewSheet.errorContainer.setAlpha(1.0f);
                            }
                            boolean z4 = webTabData.orientationLocked;
                            if (botWebViewSheet.orientationLocked != z4) {
                                botWebViewSheet.orientationLocked = z4;
                                if (botWebViewSheet.attached) {
                                    if (z4) {
                                        BotWebViewSheet.shownLockedBots++;
                                    } else {
                                        BotWebViewSheet.shownLockedBots--;
                                    }
                                }
                                if (BotWebViewSheet.shownLockedBots > 0) {
                                    Activity ownerActivity = botWebViewSheet.getOwnerActivity();
                                    if (ownerActivity == null) {
                                        ownerActivity = LaunchActivity.instance;
                                    }
                                    if (ownerActivity == null) {
                                        ownerActivity = AndroidUtilities.findActivity(botWebViewSheet.getContext());
                                    }
                                    AndroidUtilities.lockOrientation(ownerActivity);
                                } else {
                                    Activity ownerActivity2 = botWebViewSheet.getOwnerActivity();
                                    if (ownerActivity2 == null) {
                                        ownerActivity2 = LaunchActivity.instance;
                                    }
                                    if (ownerActivity2 == null) {
                                        ownerActivity2 = AndroidUtilities.findActivity(botWebViewSheet.getContext());
                                    }
                                    AndroidUtilities.unlockOrientation(ownerActivity2);
                                }
                            }
                            bottomSheetTabs.removeTab(bottomSheetTabs.currentAccount, webTabData, false);
                            botWebViewSheet.show();
                            break;
                        }
                    }
                }
                break;
            case 3:
                ((BottomSheetTabs.WebTabData) obj3).previewBitmap = (Bitmap) obj;
                BottomSheetTabsOverlay.Sheet sheet2 = (BottomSheetTabsOverlay.Sheet) obj2;
                sheet2.mo1066getWindowView().setDrawingFromOverlay(false);
                sheet2.release();
                break;
            case 4:
                BottomSheetTabsOverlay.OverlayAccessibilityHelper overlayAccessibilityHelper = (BottomSheetTabsOverlay.OverlayAccessibilityHelper) obj3;
                overlayAccessibilityHelper.getClass();
                BottomSheetTabsOverlay.TabPreview tabPreview = (BottomSheetTabsOverlay.TabPreview) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    tabPreview.animateDismiss(0.0f);
                } else {
                    tabPreview.animateDismiss(1.0f);
                    BottomSheetTabsOverlay bottomSheetTabsOverlay = BottomSheetTabsOverlay.this;
                    if (bottomSheetTabsOverlay.tabsView.getTabs().isEmpty()) {
                        bottomSheetTabsOverlay.animateOpen(false);
                    }
                }
                break;
            case 5:
                String strReplace = (String) obj;
                if (!TextUtils.isEmpty(strReplace)) {
                    ArticleViewer.PageLayout pageLayout2 = (ArticleViewer.PageLayout) obj3;
                    if (pageLayout2.getWebView() != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strReplace.trim());
                        AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                        int length = spannableStringBuilder.length();
                        int iMax = 0;
                        while (i6 < uRLSpanArr.length) {
                            length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i6]), length);
                            iMax = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i6]), iMax);
                            i6++;
                        }
                        Uri uriUriParseSafe = Utilities.uriParseSafe(strReplace);
                        if (uriUriParseSafe == null || !TextUtils.equals(uriUriParseSafe.getScheme(), "javascript")) {
                            if ((uRLSpanArr.length > 0 && length == 0 && iMax > 0) || !(uriUriParseSafe == null || uriUriParseSafe.getScheme() == null)) {
                                if (uriUriParseSafe != null && uriUriParseSafe.getScheme() == null && uriUriParseSafe.getHost() == null && uriUriParseSafe.getPath() != null) {
                                    strReplace = Browser.replace(uriUriParseSafe, "https", null, uriUriParseSafe.getPath(), "/");
                                }
                                pageLayout2.getWebView().loadUrl(strReplace);
                            } else {
                                AddressBarList.pushRecentSearch((Activity) obj2, strReplace);
                                BotWebViewContainer.MyWebView webView = pageLayout2.getWebView();
                                SearchEngine current = SearchEngine.getCurrent();
                                webView.loadUrl(current.search_url != null ? current.search_url + URLEncoder.encode(strReplace) : null);
                            }
                        }
                        break;
                    }
                }
                break;
            case 6:
                Runnable runnable = (Runnable) obj;
                View view = (View) obj3;
                if (view != null) {
                    view.requestFocus();
                }
                AndroidUtilities.hideKeyboard((BusinessLinksActivity.AnonymousClass1) obj2);
                AndroidUtilities.runOnUIThread(runnable, 80L);
                break;
            case 7:
                ChatAttachAlertQuickRepliesLayout chatAttachAlertQuickRepliesLayout = (ChatAttachAlertQuickRepliesLayout) obj3;
                chatAttachAlertQuickRepliesLayout.getClass();
                QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(UserConfig.selectedAccount);
                ChatAttachAlert chatAttachAlert = chatAttachAlertQuickRepliesLayout.parentAlert;
                long dialogId = chatAttachAlert.getDialogId();
                QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) obj2;
                if (quickReply != null) {
                    TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                    int i12 = quickRepliesController.currentAccount;
                    TLRPC.InputPeer inputPeer = MessagesController.getInstance(i12).getInputPeer(dialogId);
                    tL_messages_sendQuickReplyMessages.peer = inputPeer;
                    if (inputPeer != null) {
                        tL_messages_sendQuickReplyMessages.shortcut_id = quickReply.id;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new ChatActivity$$ExternalSyntheticLambda271(quickRepliesController, messagesStorage, quickReply, tL_messages_sendQuickReplyMessages, 16));
                    }
                }
                chatAttachAlert.lambda$showGiftOfferSheet$15();
                break;
            case 8:
                ((OpeningHoursActivity) obj3).lambda$onClick$3((View) obj2, (String) obj);
                break;
            case 9:
                ChatActivity chatActivity2 = (ChatActivity) obj3;
                chatActivity2.getClass();
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages2.peer = chatActivity2.getMessagesController().getInputPeer(chatActivity2.dialog_id);
                tL_messages_sendQuickReplyMessages2.shortcut_id = ((QuickRepliesController.QuickReply) obj2).id;
                chatActivity2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages2, null);
                ChatActivity.AnonymousClass39 anonymousClass310 = chatActivity2.chatActivityEnterView;
                if (anonymousClass310 != null) {
                    anonymousClass310.setFieldText(null);
                }
                break;
            case 10:
                ChatActivity chatActivity3 = (ChatActivity) obj3;
                chatActivity3.getClass();
                SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of((String) obj2, chatActivity3.dialog_id, chatActivity3.replyingMessageObject, chatActivity3.threadMessageObject, null, false, null, null, null, true, 0, 0, null, false);
                sendMessageParamsOf.sendMessageChatArguments = chatActivity3.getMessageChatSendParams();
                sendMessageParamsOf.payStars = ((Long) obj).longValue();
                sendMessageParamsOf.monoForumPeer = chatActivity3.getSendMonoForumPeerId();
                sendMessageParamsOf.suggestionParams = chatActivity3.messageSuggestionParams;
                chatActivity3.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
                chatActivity3.chatActivityEnterView.setFieldText("");
                chatActivity3.hideFieldPanel(false);
                break;
            case 11:
                Long l = (Long) obj;
                ChatActivity chatActivity4 = (ChatActivity) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                if (chatActivity4.chatMode != 1) {
                    chatActivity4.sendBotInlineResult(botInlineResult, true, 0, l.longValue());
                } else {
                    AlertsCreator.createScheduleDatePickerDialog(chatActivity4.getParentActivity(), chatActivity4.dialog_id, -1L, 0, new ChatActivity$$ExternalSyntheticLambda248(chatActivity4, botInlineResult, l, i2), null, chatActivity4.themeDelegate);
                }
                break;
            case 12:
                ((ChatActivity) obj3).lambda$updateTopPanel$235((RevenueSharingAdsInfoBottomSheet[]) obj2, (ItemOptions) obj);
                break;
            case 13:
                AlertDialog[] alertDialogArr = (AlertDialog[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                ChatActivity chatActivity5 = (ChatActivity) obj3;
                chatActivity5.getClass();
                try {
                    alertDialogArr[0].dismiss();
                    break;
                } catch (Throwable unused) {
                }
                alertDialogArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (!(tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError)) {
                        new PollStatisticsBottomSheet(chatActivity5.getParentActivity(), chatActivity5.themeDelegate, tL_statsPollStats).show();
                    } else {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.PollStatsWillLater, BulletinFactory.of(chatActivity5), R.raw.timer_toast, 24);
                    }
                }
                break;
            case 14:
                ChatActivity chatActivity6 = (ChatActivity) obj3;
                chatActivity6.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                MessageObject messageObject = (MessageObject) obj2;
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    chatActivity6.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 15:
                String str4 = (String) obj;
                ChatActivity chatActivity7 = ChatActivity.this;
                QuickRepliesController.QuickReply quickReply2 = (QuickRepliesController.QuickReply) obj2;
                if (quickReply2 != null) {
                    QuickRepliesController.getInstance(((BaseFragment) chatActivity7).currentAccount).renameReply(quickReply2.id, str4);
                }
                chatActivity7.quickReplyShortcut = str4;
                chatActivity7.avatarContainer.setTitle(str4);
                break;
            case 16:
                Long l2 = (Long) obj;
                ChatActivity chatActivity8 = ChatActivity.this;
                if (chatActivity8.checkSlowModeAlert()) {
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf2 = SendMessagesHelper.SendMessageParams.of(((MessageObject) obj2).getDiceEmoji(), chatActivity8.dialog_id, chatActivity8.replyingMessageObject, chatActivity8.threadMessageObject, null, false, null, null, null, true, 0, 0, null, false);
                    sendMessageParamsOf2.sendMessageChatArguments = chatActivity8.getMessageChatSendParams();
                    sendMessageParamsOf2.dice_stake = l2.longValue();
                    chatActivity8.getSendMessagesHelper().sendMessage(sendMessageParamsOf2);
                }
                break;
            case 17:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) obj3;
                chatMessageCellDelegate.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) obj2;
                    if (chatMessageCell.getMessageObject() != null) {
                        chatMessageCell.getMessageObject().isSensitiveCached = Boolean.FALSE;
                    }
                    PhotoViewer.AnonymousClass11 anonymousClass11 = chatMessageCell.photoImage;
                    float imageWidth = (anonymousClass11.getImageWidth() / 2.0f) + anonymousClass11.getImageX();
                    float imageHeight = (anonymousClass11.getImageHeight() / 2.0f) + anonymousClass11.getImageY();
                    chatMessageCell.mediaSpoilerRevealMaxRadius = (float) Math.sqrt(Math.pow(anonymousClass11.getImageHeight(), 2.0d) + Math.pow(anonymousClass11.getImageWidth(), 2.0d));
                    chatMessageCell.startRevealMedia(imageWidth, imageHeight);
                } else {
                    while (true) {
                        ChatActivity chatActivity9 = ChatActivity.this;
                        if (i6 < chatActivity9.chatListView.getChildCount()) {
                            View childAt = chatActivity9.chatListView.getChildAt(i6);
                            if (childAt instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt;
                                if (chatMessageCell2.getMessageObject() != null && chatMessageCell2.getMessageObject().isSensitive()) {
                                    PhotoViewer.AnonymousClass11 anonymousClass12 = chatMessageCell2.photoImage;
                                    float imageWidth2 = (anonymousClass12.getImageWidth() / 2.0f) + anonymousClass12.getImageX();
                                    float imageHeight2 = (anonymousClass12.getImageHeight() / 2.0f) + anonymousClass12.getImageY();
                                    chatMessageCell2.mediaSpoilerRevealMaxRadius = (float) Math.sqrt(Math.pow(anonymousClass12.getImageHeight(), 2.0d) + Math.pow(anonymousClass12.getImageWidth(), 2.0d));
                                    chatMessageCell2.startRevealMedia(imageWidth2, imageHeight2);
                                }
                            }
                            i6++;
                        }
                    }
                }
                break;
            case 18:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate2 = (ChatActivity.ChatMessageCellDelegate) obj3;
                chatMessageCellDelegate2.getClass();
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ChatActivity chatActivity10 = ChatActivity.this;
                if (!zBooleanValue) {
                    BulletinFactory.of(chatActivity10).createSimpleBulletin(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).show();
                } else {
                    chatActivity10.getMessagesController().setContentSettings(true);
                    BulletinFactory.of(chatActivity10).createSimpleBulletinDetail(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8(chatMessageCellDelegate2, i3)), true)).show(true);
                    ((ArticleViewer$$ExternalSyntheticLambda21) obj2).run(Boolean.TRUE);
                }
                break;
            case 19:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ChatActivity.this.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 20:
                ChatBackgroundDrawable chatBackgroundDrawable = (ChatBackgroundDrawable) obj3;
                chatBackgroundDrawable.getClass();
                chatBackgroundDrawable.motionBackgroundDrawable.setPatternBitmap(((WallpaperBitmapHolder) obj).bitmap, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = chatBackgroundDrawable.parent;
                if (view2 != null) {
                    view2.invalidate();
                }
                break;
            case 21:
                Long l3 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                SendMessagesHelper.SendMessageParams sendMessageParamsOf3 = SendMessagesHelper.SendMessageParams.of((String) obj2, chatActivityEnterView.dialog_id, chatActivityEnterView.replyingMessageObject, chatActivityEnterView.getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                ChatActivity chatActivity11 = chatActivityEnterView.parentFragment;
                sendMessageParamsOf3.sendMessageChatArguments = chatActivity11 != null ? chatActivity11.getMessageChatSendParams() : null;
                sendMessageParamsOf3.effect_id = chatActivityEnterView.effectId;
                sendMessageParamsOf3.payStars = l3.longValue();
                sendMessageParamsOf3.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                sendMessageParamsOf3.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.currentAccount).sendMessage(sendMessageParamsOf3);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.botCommandsMenuContainer.dismiss();
                chatActivityEnterView.effectId = 0L;
                chatActivityEnterView.sendButton.setEffect(0L);
                break;
            case 22:
                ChatAttachAlert chatAttachAlert2 = (ChatAttachAlert) obj3;
                chatAttachAlert2.getClass();
                ((ChatActivity) obj2).messageSuggestionParams = (MessageSuggestionParams) obj;
                boolean zSendPressed = chatAttachAlert2.sendPressed(0, true, 0, chatAttachAlert2.isCaptionAbove(), chatAttachAlert2.effectId);
                ChatAttachAlert.AnonymousClass25 anonymousClass25 = chatAttachAlert2.messageSendPreview;
                if (anonymousClass25 != null) {
                    anonymousClass25.sent = !zSendPressed;
                    anonymousClass25.dismiss();
                    chatAttachAlert2.messageSendPreview = null;
                }
                break;
            case 23:
                ((ChatAttachAlertBotWebViewLayout) obj3).getWebViewContainer().onInvoiceStatusUpdate((String) obj2, (String) obj, false);
                break;
            case 24:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = ChatAttachAlertLocationLayout.this;
                chatAttachAlertLocationLayout.delegate.didSelectLocation(((ChatAttachAlertLocationLayout.VenueLocation) obj2).venue, chatAttachAlertLocationLayout.locationType, true, 0, ((Long) obj).longValue());
                chatAttachAlertLocationLayout.parentAlert.dismiss(true);
                break;
            case 25:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                EmojiPacksAlert.EmojiPacksLoader emojiPacksLoader = (EmojiPacksAlert.EmojiPacksLoader) obj3;
                emojiPacksLoader.getClass();
                if (tL_messages_stickerSet == null) {
                    boolean[] zArr = (boolean[]) obj2;
                    if (!zArr[0]) {
                        zArr[0] = true;
                        AndroidUtilities.runOnUIThread(new EmojiPacksAlert$EmojiPacksLoader$$ExternalSyntheticLambda1(emojiPacksLoader, i7));
                    }
                }
                break;
            case 26:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    ((LinkedHashSet) obj3).addAll(tL_emojiList.document_id);
                }
                ((EmojiView$2$$ExternalSyntheticLambda1) obj2).run();
                break;
            case 27:
                EmojiView.EmojiSearchAdapter.AnonymousClass5 anonymousClass5 = (EmojiView.EmojiSearchAdapter.AnonymousClass5) obj3;
                EmojiView.EmojiSearchAdapter emojiSearchAdapter = EmojiView.EmojiSearchAdapter.this;
                MediaDataController mediaDataController = MediaDataController.getInstance(EmojiView.this.currentAccount);
                EmojiView emojiView = EmojiView.this;
                mediaDataController.getEmojiSuggestions(emojiView.lastSearchKeyboardLanguage, emojiSearchAdapter.lastSearchEmojiString, false, new VoIPFragment$$ExternalSyntheticLambda42(anonymousClass5, (String) obj2, (Runnable) obj, i7), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(emojiView.currentAccount).isPremium(), false, true, 25);
                break;
            case 28:
                Runnable runnable2 = (Runnable) obj;
                EmojiView.EmojiSearchAdapter emojiSearchAdapter2 = EmojiView.EmojiSearchAdapter.this;
                if (ConnectionsManager.getInstance(EmojiView.this.currentAccount).getConnectionState() == 3) {
                    emojiSearchAdapter2.searchEmoji(false, runnable2, (ArrayList) obj2);
                } else {
                    runnable2.run();
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                EmojiView.StickersSearchGridAdapter.AnonymousClass1 anonymousClass6 = (EmojiView.StickersSearchGridAdapter.AnonymousClass1) obj3;
                anonymousClass6.getClass();
                int size = arrayList2.size();
                while (i6 < size) {
                    Object obj5 = arrayList2.get(i6);
                    i6++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj5;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(EmojiView.this.currentAccount).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        anonymousClass6.foundEmojiPacks.add(new EmojiView.EmojiPackInfo(stickerSetCovered, arrayList));
                    }
                }
                ((Runnable) obj2).run();
                break;
        }
    }
}
