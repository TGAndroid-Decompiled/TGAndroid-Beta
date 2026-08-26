package org.telegram.ui.Gifts;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.BottomSheetTabsOverlay;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.Paint.Views.LinkView;
import org.telegram.ui.Components.Paint.Views.PaintCancelView;
import org.telegram.ui.Components.Paint.Views.PaintDoneView;
import org.telegram.ui.Components.Paint.Views.PaintWeightChooserView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda22;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.Stars.BalanceCloud$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.SellGiftEnterPriceSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.QRScanner;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacySelector;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda14;
import org.telegram.ui.Stories.recorder.StoryRecorder$13$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.Stories.recorder.Weather;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotButtons;
import org.telegram.ui.bots.BotLocation;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.community.CommunityCreateActivity;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda22;

public final class GiftSheet$$ExternalSyntheticLambda4 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public GiftSheet$$ExternalSyntheticLambda4(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj) {
        int color;
        boolean z;
        int i;
        int i2;
        int i3 = 2;
        float f = 1.0f;
        int i4 = 0;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (((Object[]) obj)[1] == ((StarsController.GiftsList) obj3)) {
                    ((PhotoViewer$$ExternalSyntheticLambda22) obj2).run();
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
                    if (baseFragment instanceof ChatActivity) {
                        ChatActivity chatActivity = (ChatActivity) baseFragment;
                        if (chatActivity.getChatActivityEnterView() != null) {
                            chatActivity.getChatActivityEnterView().closeKeyboard();
                            chatActivity.getChatActivityEnterView().hidePopup(true, false);
                        }
                    }
                    if (baseFragment.getContext() != null && baseFragment.getParentActivity() != null) {
                        BotWebViewSheet botWebViewSheet = new BotWebViewSheet(baseFragment.getContext(), baseFragment.getResourceProvider());
                        botWebViewSheet.parentActivity = baseFragment.getParentActivity();
                        BottomSheetTabs.WebTabData webTabData = (BottomSheetTabs.WebTabData) obj2;
                        if (webTabData != null && webTabData.props != null) {
                            botWebViewSheet.fromTab = true;
                            boolean z2 = webTabData.overrideBackgroundColor;
                            botWebViewSheet.overrideBackgroundColor = z2;
                            if (z2) {
                                botWebViewSheet.setBackgroundColor(webTabData.backgroundColor, false);
                            }
                            if (webTabData.overrideActionBarColor) {
                                color = webTabData.actionBarColor;
                            } else {
                                int i5 = webTabData.actionBarColorKey;
                                if (i5 < 0) {
                                    i5 = Theme.key_windowBackgroundWhite;
                                }
                                color = Theme.getColor(i5, botWebViewSheet.resourcesProvider);
                            }
                            botWebViewSheet.setActionBarColor(color, webTabData.overrideActionBarColor, false);
                            botWebViewSheet.setNavigationBarColor(webTabData.navigationBarColor, false);
                            botWebViewSheet.showExpanded = webTabData.expanded;
                            botWebViewSheet.showOffsetY = webTabData.expandedOffset;
                            boolean z3 = webTabData.backButton;
                            botWebViewSheet.backButtonShown = z3;
                            BotWebViewSheet.AnonymousClass2 anonymousClass2 = botWebViewSheet.webViewContainer;
                            anonymousClass2.setIsBackButtonVisible(z3);
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
                            BotButtons.ButtonsState buttonsState = webTabData.buttons;
                            if (buttonsState != null) {
                                BotWebViewSheet.AnonymousClass4 anonymousClass4 = botWebViewSheet.botButtons;
                                int totalHeight = anonymousClass4.getTotalHeight();
                                anonymousClass4.state = buttonsState;
                                BotButtons.Button[] buttonArr = anonymousClass4.buttons;
                                BotButtons.setText(buttonArr[0].textDrawable, buttonsState.main, false);
                                BotButtons.setText(buttonArr[1].textDrawable, buttonsState.secondary, false);
                                anonymousClass4.invalidate();
                                if (totalHeight != anonymousClass4.getTotalHeight() && anonymousClass4.whenResized != null) {
                                    if (totalHeight < anonymousClass4.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(anonymousClass4.whenResized, 200L);
                                    } else {
                                        anonymousClass4.whenResized.run();
                                    }
                                }
                                int i6 = buttonsState.backgroundColor;
                                Paint paint = anonymousClass4.backgroundPaint;
                                anonymousClass4.state.backgroundColor = i6;
                                paint.setColor(i6);
                                anonymousClass4.background.set(i6, true);
                            }
                            botWebViewSheet.setFullscreen(webTabData.fullscreen, false, webTabData.fullscreenBlur);
                            WebViewRequestProps webViewRequestProps = webTabData.props;
                            botWebViewSheet.currentAccount = webViewRequestProps != null ? webViewRequestProps.currentAccount : UserConfig.selectedAccount;
                            BotWebViewContainer.MyWebView myWebView = webTabData.webView;
                            if (myWebView != null) {
                                myWebView.onResume();
                                anonymousClass2.replaceWebView(botWebViewSheet.currentAccount, webTabData.webView, webTabData.proxy);
                                anonymousClass2.setState(webTabData.ready || webTabData.webView.isPageLoaded, webTabData.lastUrl);
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
                                String str = webTabData.errorDescription;
                                botWebViewSheet.errorCode = str;
                                errorContainer.set(userName, str);
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
                BottomSheetTabsOverlay.Sheet sheet = (BottomSheetTabsOverlay.Sheet) obj2;
                sheet.mo1107getWindowView().setDrawingFromOverlay(false);
                sheet.release();
                break;
            case 4:
                BottomSheetTabsOverlay.OverlayAccessibilityHelper overlayAccessibilityHelper = (BottomSheetTabsOverlay.OverlayAccessibilityHelper) obj3;
                overlayAccessibilityHelper.getClass();
                BottomSheetTabsOverlay.TabPreview tabPreview = (BottomSheetTabsOverlay.TabPreview) obj2;
                if (((Boolean) obj).booleanValue()) {
                    tabPreview.animateDismiss(1.0f);
                    BottomSheetTabsOverlay bottomSheetTabsOverlay = BottomSheetTabsOverlay.this;
                    if (bottomSheetTabsOverlay.tabsView.getTabs().isEmpty()) {
                        bottomSheetTabsOverlay.animateOpen(false);
                    }
                } else {
                    tabPreview.animateDismiss(0.0f);
                }
                break;
            case 5:
                Runnable runnable = (Runnable) obj;
                View view = (View) obj3;
                if (view != null) {
                    view.requestFocus();
                }
                AndroidUtilities.hideKeyboard((BusinessLinksActivity.AnonymousClass1) obj2);
                AndroidUtilities.runOnUIThread(runnable, 80L);
                break;
            case 6:
                ((ChatAttachAlertQuickRepliesLayout) obj3).lambda$new$2((QuickRepliesController.QuickReply) obj2);
                break;
            case 7:
                ((OpeningHoursActivity) obj3).lambda$onClick$3((View) obj2, (String) obj);
                break;
            case 8:
                Boolean bool = (Boolean) obj;
                GiftSheet giftSheet = (GiftSheet) obj3;
                giftSheet.getClass();
                Utilities.Callback callback = (Utilities.Callback) obj2;
                if (callback != null) {
                    callback.run(bool);
                }
                if (bool.booleanValue()) {
                    giftSheet.skipDismissAnimation();
                }
                giftSheet.lambda$showGiftOfferSheet$15();
                break;
            case 9:
                ((ProfileGiftsContainer) obj3).lambda$new$3((TL_stars.TL_starGiftCollection) obj2, (String) obj);
                break;
            case 10:
                SendGiftSheet sendGiftSheet = (SendGiftSheet) obj3;
                Runnable runnable2 = sendGiftSheet.closeParentSheet;
                if (runnable2 != null) {
                    runnable2.run();
                }
                sendGiftSheet.lambda$showGiftOfferSheet$15();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda15((TLRPC.User) obj2, i4), 250L);
                SharedPreferences.Editor editorEdit = MessagesController.getInstance(sendGiftSheet.currentAccount).getMainSettings().edit();
                StringBuilder sb = new StringBuilder("show_gift_for_");
                long j = sendGiftSheet.dialogId;
                sb.append(j);
                editorEdit.putBoolean(sb.toString(), true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j, true).apply();
                break;
            case 11:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj3;
                if (stargiftupgradepreview == null) {
                    starGiftSheet.getClass();
                } else {
                    StarGiftSheet.TopView topView = starGiftSheet.topView;
                    topView.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    starGiftSheet.switchPage(1, false, null);
                    topView.setText(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, (String) obj2), null, null, null, null);
                    AffiliateProgramFragment.FeatureCell[] featureCellArr = starGiftSheet.upgradeFeatureCells;
                    featureCellArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    featureCellArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    featureCellArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    starGiftSheet.checkboxLayout.setVisibility(8);
                    starGiftSheet.checkboxSeparator.setVisibility(8);
                    ButtonWithCounterView buttonWithCounterView = starGiftSheet.button;
                    buttonWithCounterView.setFilled(true);
                    buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false);
                    buttonWithCounterView.setSubText(null, false);
                    buttonWithCounterView.setOnClickListener(new StarGiftSheet$$ExternalSyntheticLambda9(starGiftSheet, 5));
                    starGiftSheet.show();
                }
                break;
            case 12:
                ((StarGiftSheet) obj3).lambda$show$115((AlertDialog) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 13:
                StarGiftSheet.CraftTopView craftTopView = (StarGiftSheet.CraftTopView) obj3;
                craftTopView.getClass();
                ((StarGiftSheet.CraftTopView.SelectGiftView) obj2).setGift((TL_stars.StarGift) obj, true);
                craftTopView.updateCounts(true);
                break;
            case 14:
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                StarGiftSheet.ResaleBuyTransferAlert resaleBuyTransferAlert = (StarGiftSheet.ResaleBuyTransferAlert) obj3;
                Browser.Progress progress = resaleBuyTransferAlert.lastPositiveButtonProgress;
                AmountUtils$Currency amountUtils$Currency = (AmountUtils$Currency) obj2;
                if (progress != null && amountUtils$Currency == resaleBuyTransferAlert.selectedCurrency) {
                    progress.end();
                }
                resaleBuyTransferAlert.loadingForms.remove(amountUtils$Currency);
                if (tL_payments_paymentFormStarGift != null) {
                    resaleBuyTransferAlert.forms.put(amountUtils$Currency, new StarGiftSheet.PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift));
                    resaleBuyTransferAlert.onUpdateCurrency(true);
                }
                break;
            case 15:
                ((Utilities.Callback2) obj3).run((AmountUtils$Amount) obj, new BalanceCloud$$ExternalSyntheticLambda1((SellGiftEnterPriceSheet[]) obj2, 14));
                break;
            case 16:
                Weather.State state = (Weather.State) obj;
                EmojiBottomSheet.StoryWidgetsCell storyWidgetsCell = (EmojiBottomSheet.StoryWidgetsCell) obj3;
                storyWidgetsCell.getClass();
                EmojiBottomSheet.StoryWidgetsCell.Button button = ((EmojiBottomSheet.StoryWidgetsCell.Button[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(state == null ? "🌤" : state.emoji);
                sb2.append(" ");
                sb2.append(state == null ? Weather.isDefaultCelsius() ? "24°C" : "72°F" : state.getTemperature());
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(sb2.toString(), storyWidgetsCell.textPaint.getFontMetricsInt(), false), EmojiBottomSheet.StoryWidgetsCell.this.textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), EmojiBottomSheet.StoryWidgetsCell.this.textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                button.layout = staticLayout;
                button.textWidth = staticLayout.getLineCount() > 0 ? button.layout.getLineWidth(0) : 0.0f;
                button.textLeft = button.layout.getLineCount() > 0 ? button.layout.getLineLeft(0) : 0.0f;
                button.width = AndroidUtilities.dpf2(17.6f) + button.textWidth;
                button.height = AndroidUtilities.dpf2(36.0f);
                storyWidgetsCell.invalidate();
                storyWidgetsCell.requestLayout();
                break;
            case 17:
                StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) obj3;
                StoryRecorder.WindowView windowView = (StoryRecorder.WindowView) obj2;
                int iMax = Math.max(0, Math.max(((Integer) obj).intValue() - windowView.getBottomPadding2(), anonymousClass24.emojiPadding - windowView.getPaddingUnderContainer()));
                anonymousClass24.notifyHeightChanged();
                if (iMax > 0) {
                    EntityView entityView = anonymousClass24.currentEntityView;
                    if ((entityView instanceof TextPaintView) && ((TextPaintView) entityView).getEditText().isFocused()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                AnimatorSet animatorSet = anonymousClass24.keyboardAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                anonymousClass24.keyboardAnimator = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                float[] fArr = {iMax > 0 ? Math.min(0.0f, ((-iMax) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass24.weightChooserView, (Property<PaintWeightChooserView, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass24.bottomLayout, (Property<PaintView.AnonymousClass9, Float>) property, iMax > 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-iMax)) : 0));
                FloatingToolbar.AnonymousClass2 anonymousClass5 = anonymousClass24.tabsLayout;
                float[] fArr2 = {z ? 0.0f : 1.0f};
                Property property2 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass5, (Property<FloatingToolbar.AnonymousClass2, Float>) property2, fArr2));
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass24.doneButton, (Property<PaintDoneView, Float>) property2, (!z || anonymousClass24.isColorListShown) ? 1.0f : 0.0f));
                if (z && !anonymousClass24.isColorListShown) {
                    f = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass24.cancelButton, (Property<PaintCancelView, Float>) property2, f));
                anonymousClass24.updatePreviewViewTranslationY();
                anonymousClass24.keyboardAnimator.playTogether(arrayList);
                if (z) {
                    anonymousClass24.keyboardAnimator.setDuration(250L);
                    anonymousClass24.keyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                } else {
                    anonymousClass24.keyboardAnimator.setDuration(350L);
                    anonymousClass24.keyboardAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                }
                anonymousClass24.keyboardAnimator.start();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((Animator) arrayList.get(i7)).setDuration(z ? 350L : 250L);
                    ((Animator) arrayList.get(i7)).setInterpolator(z ? CubicBezierInterpolator.EASE_OUT_QUINT : AdjustPanLayoutHelper.keyboardInterpolator);
                    ((Animator) arrayList.get(i7)).start();
                }
                if (!z) {
                    anonymousClass24.showTypefaceMenu$1(false);
                }
                if (anonymousClass24.wasKeyboardVisible != z) {
                    anonymousClass24.checkEntitiesIsVideo();
                }
                anonymousClass24.wasKeyboardVisible = z;
                break;
            case 18:
                Weather.State state2 = (Weather.State) obj;
                PaintView paintView = (PaintView) obj3;
                paintView.getClass();
                if (state2 != null) {
                    ((PaintView.AnonymousClass22) obj2).lambda$showGiftOfferSheet$15();
                    paintView.onOpenCloseStickersAlert(false);
                    paintView.appearAnimation(paintView.createWeatherView(state2));
                }
                break;
            case 19:
                LinkPreview.WebPagePreview webPagePreview = (LinkPreview.WebPagePreview) obj;
                PaintView paintView2 = (PaintView) obj3;
                LinkView linkView = (LinkView) obj2;
                if (linkView != null) {
                    paintView2.getClass();
                    linkView.link = webPagePreview;
                    linkView.marker.set(paintView2.currentAccount, webPagePreview, false);
                    EntityView.SelectionView selectionView = linkView.selectionView;
                    if (selectionView != null) {
                        selectionView.updatePosition();
                    }
                    paintView2.appearAnimation(linkView);
                } else {
                    paintView2.appearAnimation(paintView2.createLinkSticker(webPagePreview));
                }
                break;
            case 20:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) obj3;
                page.getClass();
                ((ItemOptions) obj2).dismiss();
                page.updateItems(true, true);
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                StoryRecorder$$ExternalSyntheticLambda14 storyRecorder$$ExternalSyntheticLambda14 = storyPrivacyBottomSheet.onSelectedAlbums;
                if (storyRecorder$$ExternalSyntheticLambda14 != null) {
                    storyRecorder$$ExternalSyntheticLambda14.run(new HashSet(storyPrivacyBottomSheet.selectedAlbums));
                }
                break;
            case 21:
                StoryPrivacyBottomSheet.Page page2 = (StoryPrivacyBottomSheet.Page) obj3;
                StoryPrivacyBottomSheet.this.isRtmpStream = true;
                ((CreateRtmpStreamBottomSheet[]) obj2)[0].lambda$showGiftOfferSheet$15();
                page2.updateItems(true, true);
                break;
            case 22:
                Integer num = (Integer) obj;
                StoryRecorder.AnonymousClass13 anonymousClass13 = (StoryRecorder.AnonymousClass13) obj3;
                StoryRecorder storyRecorder = StoryRecorder.this;
                if (storyRecorder.useDisplayFlashlight()) {
                    try {
                        storyRecorder.windowView.performHapticFeedback(3, 1);
                        break;
                    } catch (Exception unused) {
                    }
                }
                storyRecorder.takingPhoto = false;
                QRScanner qRScanner = storyRecorder.qrScanner;
                if (qRScanner != null) {
                    qRScanner.setPaused(false);
                }
                if (storyRecorder.outputFile != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(storyRecorder.outputFile.getAbsolutePath(), options);
                        i = options.outWidth;
                        try {
                            i2 = options.outHeight;
                        } catch (Exception unused2) {
                            i2 = -1;
                        }
                    } catch (Exception unused3) {
                        i = -1;
                    }
                    int i8 = num.intValue() == -1 ? 0 : 90;
                    if (num.intValue() == -1) {
                        if (i > i2) {
                            i8 = 270;
                        }
                    } else if (i2 > i && i8 != 0) {
                        i8 = 0;
                    }
                    StoryEntry storyEntryFromPhotoShoot = StoryEntry.fromPhotoShoot(i8, storyRecorder.outputFile);
                    storyEntryFromPhotoShoot.botId = storyRecorder.botId;
                    storyEntryFromPhotoShoot.botLang = storyRecorder.botLang;
                    boolean zHasLayout = storyRecorder.collageLayoutView.hasLayout();
                    Utilities.Callback callback2 = (Utilities.Callback) obj2;
                    int i9 = storyRecorder.currentAccount;
                    if (zHasLayout) {
                        storyRecorder.outputFile = null;
                        if (storyRecorder.collageLayoutView.push(storyEntryFromPhotoShoot)) {
                            StoryEntry storyEntryAsCollage = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), storyRecorder.collageLayoutView.getContent());
                            storyRecorder.outputEntry = storyEntryAsCollage;
                            StoryPrivacySelector.applySaved(i9, storyEntryAsCollage);
                            storyRecorder.fromGallery = false;
                            if (callback2 != null) {
                                callback2.run(null);
                            }
                        } else if (callback2 != null) {
                            callback2.run(null);
                        }
                        storyRecorder.updateActionBarButtons(true);
                    } else {
                        storyRecorder.outputEntry = storyEntryFromPhotoShoot;
                        StoryPrivacySelector.applySaved(i9, storyEntryFromPhotoShoot);
                        storyRecorder.fromGallery = false;
                        if (callback2 != null) {
                            callback2.run(new StoryRecorder$13$$ExternalSyntheticLambda0(anonymousClass13, i3));
                        } else {
                            storyRecorder.navigateTo(1, true);
                        }
                    }
                    break;
                }
                break;
            case 23:
                Float f2 = (Float) obj;
                TimelineView timelineView = (TimelineView) obj3;
                timelineView.getClass();
                TimelineView.Track track = (TimelineView.Track) obj2;
                track.volume = f2.floatValue();
                TimelineView.TimelineDelegate timelineDelegate = timelineView.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onVideoVolumeChange(track.index, f2.floatValue());
                }
                break;
            case 24:
                int[] iArr = (int[]) obj;
                BotLocation botLocation = (BotLocation) obj3;
                botLocation.getClass();
                boolean z5 = false;
                while (i4 < iArr.length) {
                    if (iArr[i4] == 0) {
                        z5 = true;
                    }
                    i4++;
                }
                botLocation.requested = true;
                botLocation.granted = true;
                botLocation.save();
                Iterator it = botLocation.listeners.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                ((BotWebViewContainer$$ExternalSyntheticLambda22) obj2).run(Boolean.TRUE, Boolean.valueOf(z5));
                break;
            case 25:
                int[] iArr2 = (int[]) obj;
                BotLocation botLocation2 = (BotLocation) obj3;
                botLocation2.getClass();
                boolean z6 = false;
                while (i4 < iArr2.length) {
                    if (iArr2[i4] == 0) {
                        z6 = true;
                    }
                    i4++;
                }
                botLocation2.requested = z6;
                botLocation2.granted = z6;
                botLocation2.save();
                Iterator it2 = botLocation2.listeners.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                QrActivity$$ExternalSyntheticLambda5 qrActivity$$ExternalSyntheticLambda5 = (QrActivity$$ExternalSyntheticLambda5) obj2;
                if (qrActivity$$ExternalSyntheticLambda5 != null) {
                    qrActivity$$ExternalSyntheticLambda5.run();
                }
                break;
            case 26:
                ((File[]) obj3)[0] = (File) obj;
                ((BotShareSheet$$ExternalSyntheticLambda4) obj2).run();
                break;
            case 27:
                BotWebViewSheet.this.webViewContainer.onInvoiceStatusUpdate((String) obj2, (String) obj);
                break;
            case 28:
                CommunityCreateActivity communityCreateActivity = (CommunityCreateActivity) obj3;
                communityCreateActivity.getClass();
                communityCreateActivity.linkToCommunity(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            default:
                CommunityCreateActivity communityCreateActivity2 = (CommunityCreateActivity) obj3;
                communityCreateActivity2.getClass();
                communityCreateActivity2.createNewCommunity((String) obj2, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
