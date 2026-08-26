package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.cast.framework.media.zzq;
import java.io.File;
import java.util.HashMap;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ThemePreviewMessagesCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.web.MHTML;

public final class PhotoViewer$$ExternalSyntheticLambda21 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda21(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        Theme.ThemeInfo themeInfo;
        String[] strArr;
        String str;
        SparseIntArray themeFileValues;
        int[] iArr;
        int i;
        Theme.ThemeAccent accent;
        PeerColorActivity.Page page;
        boolean z;
        RLottieDrawable rLottieDrawable;
        MHTML mhtmlCreateBackgroundDrawable;
        Drawable drawable;
        int i2;
        ChatActivity.AnonymousClass39 anonymousClass39;
        int i3 = 3;
        int i4 = 0;
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer.FrameLayoutDrawer) this.f$0).invalidate();
                break;
            case 1:
                TLObject tLObject = (TLObject) this.f$0;
                if (tLObject instanceof TLRPC.TL_help_passportConfig) {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    SharedConfig.setPassportConfig(tL_help_passportConfig.countries_langs.data, tL_help_passportConfig.hash);
                } else {
                    SharedConfig.getCountryLangs();
                }
                break;
            case 2:
                PassportActivity.this.finishFragment();
                break;
            case 3:
                AlertsCreator.showUpdateAppAlert(PassportActivity.this.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                break;
            case 4:
                zzq zzqVar = (zzq) this.f$0;
                zzqVar.getClass();
                double dCurrentTimeMillis = System.currentTimeMillis();
                PassportActivity.PhoneConfirmationView phoneConfirmationView = (PassportActivity.PhoneConfirmationView) zzqVar.zza;
                double d = dCurrentTimeMillis - phoneConfirmationView.lastCodeTime;
                phoneConfirmationView.lastCodeTime = dCurrentTimeMillis;
                int i5 = (int) (((double) phoneConfirmationView.codeTime) - d);
                phoneConfirmationView.codeTime = i5;
                if (i5 <= 1000) {
                    phoneConfirmationView.problemText.setVisibility(0);
                    phoneConfirmationView.timeText.setVisibility(8);
                    phoneConfirmationView.destroyCodeTimer$1();
                }
                break;
            case 5:
                PassportActivity.PhoneConfirmationView.AnonymousClass5 anonymousClass5 = (PassportActivity.PhoneConfirmationView.AnonymousClass5) this.f$0;
                PassportActivity.PhoneConfirmationView phoneConfirmationView2 = PassportActivity.PhoneConfirmationView.this;
                int i6 = phoneConfirmationView2.time;
                PassportActivity.ProgressView progressView = phoneConfirmationView2.progressView;
                ArticleViewer.AnonymousClass9 anonymousClass9 = phoneConfirmationView2.timeText;
                if (i6 >= 1000) {
                    int i7 = i6 / 1000;
                    int i8 = i7 / 60;
                    int i9 = i7 - (i8 * 60);
                    int i10 = phoneConfirmationView2.nextType;
                    if (i10 == 4 || i10 == 3) {
                        anonymousClass9.setText(LocaleController.formatString("CallText", R.string.CallText, Integer.valueOf(i8), Integer.valueOf(i9)));
                    } else if (i10 == 2) {
                        anonymousClass9.setText(LocaleController.formatString("SmsText", R.string.SmsText, Integer.valueOf(i8), Integer.valueOf(i9)));
                    }
                    if (progressView != null) {
                        progressView.progress = 1.0f - (phoneConfirmationView2.time / phoneConfirmationView2.timeout);
                        progressView.invalidate();
                    }
                } else {
                    if (progressView != null) {
                        progressView.progress = 1.0f;
                        progressView.invalidate();
                    }
                    phoneConfirmationView2.destroyTimer$1();
                    int i11 = phoneConfirmationView2.verificationType;
                    if (i11 == 3) {
                        AndroidUtilities.setWaitingForCall(false);
                        NotificationCenter.getGlobalInstance().removeObserver(phoneConfirmationView2, NotificationCenter.didReceiveCall);
                        phoneConfirmationView2.waitingForEvent = false;
                        phoneConfirmationView2.destroyCodeTimer$1();
                        phoneConfirmationView2.resendCode$1();
                    } else if (i11 == 2 || i11 == 4) {
                        int i12 = phoneConfirmationView2.nextType;
                        if (i12 == 4 || i12 == 2) {
                            if (i12 == 4) {
                                anonymousClass9.setText(LocaleController.getString(R.string.Calling));
                            } else {
                                anonymousClass9.setText(LocaleController.getString(R.string.SendingSms));
                            }
                            if (phoneConfirmationView2.codeTimer == null) {
                                phoneConfirmationView2.codeTime = 15000;
                                phoneConfirmationView2.codeTimer = new Timer();
                                phoneConfirmationView2.lastCodeTime = System.currentTimeMillis();
                                phoneConfirmationView2.codeTimer.schedule(new zzq(phoneConfirmationView2, i3), 0L, 1000L);
                            }
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = phoneConfirmationView2.phone;
                            tL_auth_resendCode.phone_code_hash = phoneConfirmationView2.phoneHash;
                            ConnectionsManager.getInstance(((BaseFragment) PassportActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LinkManager$$ExternalSyntheticLambda3(anonymousClass5, 18), 2);
                        } else if (i12 == 3) {
                            AndroidUtilities.setWaitingForSms(false);
                            NotificationCenter.getGlobalInstance().removeObserver(phoneConfirmationView2, NotificationCenter.didReceiveSmsCode);
                            phoneConfirmationView2.waitingForEvent = false;
                            phoneConfirmationView2.destroyCodeTimer$1();
                            phoneConfirmationView2.resendCode$1();
                        }
                    }
                }
                break;
            case 6:
                Browser.openUrl(PaymentFormActivity.this.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 7:
                PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                paymentFormActivity.goToNextStep();
                paymentFormActivity.showEditDoneProgress$3(true, false);
                paymentFormActivity.setDonePressed(false);
                break;
            case 8:
                Browser.openUrl(PaymentFormActivity.this.getParentActivity(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                PeerColorActivity peerColorActivity = (PeerColorActivity) this.f$0;
                peerColorActivity.isDark = !peerColorActivity.isDark;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                HashMap map = Theme.themesDict;
                if (((Theme.ThemeInfo) map.get(string)) == null || ((Theme.ThemeInfo) map.get(string)).isDark()) {
                    string = "Blue";
                }
                String str3 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (((Theme.ThemeInfo) map.get(string2)) == null || !((Theme.ThemeInfo) map.get(string2)).isDark()) {
                    string2 = "Dark Blue";
                }
                Theme.ThemeInfo themeInfo2 = Theme.currentTheme;
                if (string.equals(string2)) {
                    if (themeInfo2.isDark() || string.equals("Dark Blue") || string.equals("Night")) {
                        str3 = string2;
                    }
                    if (peerColorActivity.isDark) {
                        themeInfo = (Theme.ThemeInfo) map.get(str3);
                    } else {
                        themeInfo = (Theme.ThemeInfo) map.get(str2);
                    }
                    peerColorActivity.currentColors.clear();
                    strArr = new String[1];
                    str = themeInfo.assetName;
                    if (str != null) {
                        themeFileValues = Theme.getThemeFileValues(null, str, strArr);
                    } else {
                        themeFileValues = Theme.getThemeFileValues(new File(themeInfo.pathToFile), null, strArr);
                    }
                    iArr = Theme.defaultColors;
                    if (iArr != null) {
                        for (i2 = 0; i2 < iArr.length; i2++) {
                            peerColorActivity.currentColors.put(i2, iArr[i2]);
                        }
                    }
                    for (i = 0; i < themeFileValues.size(); i++) {
                        peerColorActivity.currentColors.put(themeFileValues.keyAt(i), themeFileValues.valueAt(i));
                    }
                    accent = themeInfo.getAccent(false);
                    if (accent != null) {
                        accent.fillAccentColors(themeFileValues, peerColorActivity.currentColors);
                    }
                    page = peerColorActivity.namePage;
                    if (page != null && page.messagesCellPreview != null) {
                        mhtmlCreateBackgroundDrawable = Theme.createBackgroundDrawable(themeInfo, peerColorActivity.currentColors, strArr[0], 0, true);
                        ThemePreviewMessagesCell themePreviewMessagesCell = peerColorActivity.namePage.messagesCellPreview;
                        drawable = (BitmapDrawable) mhtmlCreateBackgroundDrawable.boundary;
                        if (drawable == null) {
                            drawable = (Drawable) mhtmlCreateBackgroundDrawable.file;
                        }
                        themePreviewMessagesCell.setOverrideBackground(drawable);
                    }
                    z = peerColorActivity.isDark;
                    if (peerColorActivity.forceDark != z) {
                        peerColorActivity.forceDark = z;
                        RLottieDrawable rLottieDrawable2 = peerColorActivity.sunDrawable;
                        rLottieDrawable2.setCustomEndFrame(z ? rLottieDrawable2.metaData[0] : 0);
                        rLottieDrawable = peerColorActivity.sunDrawable;
                        if (rLottieDrawable != null) {
                            rLottieDrawable.start();
                        }
                    }
                    peerColorActivity.updateColors$5();
                } else {
                    str3 = string2;
                }
                str2 = string;
                if (peerColorActivity.isDark) {
                    themeInfo = (Theme.ThemeInfo) map.get(str3);
                } else {
                    themeInfo = (Theme.ThemeInfo) map.get(str2);
                }
                peerColorActivity.currentColors.clear();
                strArr = new String[1];
                str = themeInfo.assetName;
                if (str != null) {
                    themeFileValues = Theme.getThemeFileValues(null, str, strArr);
                } else {
                    themeFileValues = Theme.getThemeFileValues(new File(themeInfo.pathToFile), null, strArr);
                }
                iArr = Theme.defaultColors;
                if (iArr != null) {
                    while (i2 < iArr.length) {
                        peerColorActivity.currentColors.put(i2, iArr[i2]);
                    }
                }
                while (i < themeFileValues.size()) {
                    peerColorActivity.currentColors.put(themeFileValues.keyAt(i), themeFileValues.valueAt(i));
                }
                accent = themeInfo.getAccent(false);
                if (accent != null) {
                    accent.fillAccentColors(themeFileValues, peerColorActivity.currentColors);
                }
                page = peerColorActivity.namePage;
                if (page != null) {
                    mhtmlCreateBackgroundDrawable = Theme.createBackgroundDrawable(themeInfo, peerColorActivity.currentColors, strArr[0], 0, true);
                    ThemePreviewMessagesCell themePreviewMessagesCell2 = peerColorActivity.namePage.messagesCellPreview;
                    drawable = (BitmapDrawable) mhtmlCreateBackgroundDrawable.boundary;
                    if (drawable == null) {
                        drawable = (Drawable) mhtmlCreateBackgroundDrawable.file;
                    }
                    themePreviewMessagesCell2.setOverrideBackground(drawable);
                }
                z = peerColorActivity.isDark;
                if (peerColorActivity.forceDark != z) {
                    peerColorActivity.forceDark = z;
                    RLottieDrawable rLottieDrawable3 = peerColorActivity.sunDrawable;
                    rLottieDrawable3.setCustomEndFrame(z ? rLottieDrawable3.metaData[0] : 0);
                    rLottieDrawable = peerColorActivity.sunDrawable;
                    if (rLottieDrawable != null) {
                        rLottieDrawable.start();
                    }
                }
                peerColorActivity.updateColors$5();
                break;
            case 10:
                GiftSheet.Tabs tabs = null;
                int i13 = 0;
                while (true) {
                    PeerColorActivity.Page.EmptyView emptyView = (PeerColorActivity.Page.EmptyView) this.f$0;
                    PeerColorActivity.Page page2 = PeerColorActivity.Page.this;
                    if (i13 < page2.listView.getChildCount()) {
                        View childAt = page2.listView.getChildAt(i13);
                        if (childAt instanceof GiftSheet.Tabs) {
                            tabs = (GiftSheet.Tabs) childAt;
                        }
                        i13++;
                    } else if (tabs != null && page2.tabs.size() > 1) {
                        tabs.selected = 1;
                        tabs.layout.invalidate();
                        TL_stars.StarGift starGift = (TL_stars.StarGift) page2.index2gift.get(1);
                        page2.selectedTabGift = starGift;
                        PeerColorActivity peerColorActivity2 = PeerColorActivity.this;
                        if (starGift == null) {
                            ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = page2.resaleGifts;
                            if (resaleGiftsList != null) {
                                resaleGiftsList.cancel();
                                page2.resaleGifts = null;
                            }
                        } else {
                            ResaleGiftsFragment.ResaleGiftsList resaleGiftsList2 = page2.resaleGifts;
                            if (resaleGiftsList2 == null || resaleGiftsList2.gift_id != starGift.id) {
                                ResaleGiftsFragment.ResaleGiftsList resaleGiftsList3 = new ResaleGiftsFragment.ResaleGiftsList(page2.selectedTabGift.id, ((BaseFragment) peerColorActivity2).currentAccount, new PollItemMenu$$ExternalSyntheticLambda14(emptyView, 23));
                                page2.resaleGifts = resaleGiftsList3;
                                resaleGiftsList3.load(false);
                            }
                        }
                        page2.update();
                        (peerColorActivity2.viewPager.getCurrentPosition() == 1 ? peerColorActivity2.profilePage : peerColorActivity2.namePage).update();
                        break;
                    }
                }
                break;
            case 11:
                PhotoPickerActivity photoPickerActivity = PhotoPickerActivity.this;
                photoPickerActivity.processSearch(photoPickerActivity.searchItem.getSearchField());
                break;
            case 12:
                PhotoPickerActivity.this.listAdapter.notifyDataSetChanged();
                break;
            case 13:
                PhotoViewer.AnonymousClass27 anonymousClass27 = (PhotoViewer.AnonymousClass27) this.f$0;
                long j = anonymousClass27.seekTo;
                Drawable[] drawableArr = PhotoViewer.progressDrawables;
                PhotoViewer photoViewer = PhotoViewer.this;
                photoViewer.seekVideoOrWebTo(j);
                if (photoViewer.sendPhotoType == 1) {
                    long j2 = anonymousClass27.seekTo;
                    photoViewer.needCaptureFrameReadyAtTime = j2;
                    if (photoViewer.captureFrameReadyAtTime != j2) {
                        photoViewer.captureFrameReadyAtTime = -1L;
                    }
                }
                anonymousClass27.seekToRunnable = null;
                break;
            case 14:
                PhotoViewer photoViewer2 = (PhotoViewer) ((PhotoViewer.AnonymousClass38) this.f$0).this$0;
                ImageView imageView = photoViewer2.lastFrameImageView;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.lastFrameImageView.getParent()).removeView(photoViewer2.lastFrameImageView);
                    if (photoViewer2.lastFrameBitmap != null) {
                        ImageView imageView2 = photoViewer2.lastFrameImageView;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        AndroidUtilities.recycleBitmap(photoViewer2.lastFrameBitmap);
                        photoViewer2.lastFrameBitmap = null;
                    }
                    photoViewer2.lastFrameImageView = null;
                    break;
                }
                break;
            case 15:
                ChatActivity chatActivity = PhotoViewer.this.parentChatActivity;
                if (chatActivity != null && (anonymousClass39 = chatActivity.chatActivityEnterView) != null) {
                    anonymousClass39.openKeyboard();
                    break;
                }
                break;
            case 16:
                QrActivity.AnonymousClass4 anonymousClass4 = (QrActivity.AnonymousClass4) ((PhotoViewer$41$1) this.f$0).this$1;
                PhotoViewer photoViewer3 = (PhotoViewer) anonymousClass4.this$0;
                photoViewer3.manuallyPaused = false;
                VideoPlayer videoPlayer = photoViewer3.videoPlayer;
                if (videoPlayer != null) {
                    videoPlayer.play();
                }
                ((PhotoViewer) anonymousClass4.this$0).videoPlayRunnable = null;
                break;
            case 17:
                PhotoViewer photoViewer4 = PhotoViewer.this;
                photoViewer4.manuallyPaused = false;
                VideoPlayer videoPlayer2 = photoViewer4.videoPlayer;
                if (videoPlayer2 != null) {
                    videoPlayer2.play();
                }
                photoViewer4.videoPlayRunnable = null;
                break;
            case 18:
                PhotoViewer.AnonymousClass77 anonymousClass77 = (PhotoViewer.AnonymousClass77) ((PhotoViewer$41$1) this.f$0).this$1;
                PhotoViewer.this.transitionNotificationLocker.unlock();
                PhotoViewer photoViewer5 = PhotoViewer.this;
                Runnable runnable = photoViewer5.animationEndRunnable;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.animationEndRunnable = null;
                }
                photoViewer5.setCaptionHwLayerEnabled(true);
                break;
            case 19:
                PhotoViewer photoViewer6 = ((PhotoViewer.AnonymousClass45) this.f$0).this$0;
                Runnable runnable2 = photoViewer6.animationEndRunnable;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.animationEndRunnable = null;
                }
                break;
            case 20:
                ((PhotoViewer.BackgroundDrawable) this.f$0).checkAllowDrawContent();
                break;
            case 21:
                ((PhotoViewer.CaptionTextView) this.f$0).links.clear(true);
                break;
            case 22:
                ((PhotoViewer.FirstFrameView) this.f$0).gotError = true;
                break;
            case 23:
                LoginActivity.AnonymousClass4 anonymousClass6 = (LoginActivity.AnonymousClass4) this.f$0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((PhotoViewer) anonymousClass6.this$0).checkImageView.getLayoutParams();
                ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                int iM$2 = OKLCH.m$2(34.0f, ActionBar.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer7 = (PhotoViewer) anonymousClass6.this$0;
                int i14 = iM$2 + (!photoViewer7.inBubbleMode ? AndroidUtilities.statusBarHeight : 0);
                if (i14 != layoutParams.topMargin) {
                    layoutParams.topMargin = i14;
                    photoViewer7.checkImageView.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((PhotoViewer) anonymousClass6.this$0).photosCounterView.getLayoutParams();
                int iM$3 = OKLCH.m$2(40.0f, ActionBar.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer8 = (PhotoViewer) anonymousClass6.this$0;
                int i15 = iM$3 + (photoViewer8.inBubbleMode ? 0 : AndroidUtilities.statusBarHeight);
                if (layoutParams2.topMargin != i15) {
                    layoutParams2.topMargin = i15;
                    photoViewer8.photosCounterView.setLayoutParams(layoutParams2);
                }
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
                premiumPreviewFragment.showDialog(new RevenueSharingAdsInfoBottomSheet(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 25:
                ((ProfileActivity$$ExternalSyntheticLambda114) this.f$0).run(0);
                break;
            case 26:
                AndroidUtilities.addToClipboard((String) this.f$0);
                break;
            case 27:
                ProfileActivity.AnonymousClass13 anonymousClass13 = (ProfileActivity.AnonymousClass13) this.f$0;
                ProfileActivity.this.getNotificationCenter().onAnimationFinish(anonymousClass13.animationIndex);
                break;
            case 28:
                ProfileActivity profileActivity = (ProfileActivity) ((IntroActivity.AnonymousClass1) this.f$0).this$0;
                if (profileActivity.customAvatarProgress != 1.0f) {
                    ProfileActivity.AnonymousClass23 anonymousClass23 = profileActivity.avatarsViewPager;
                    while (((ProfileGalleryView) anonymousClass23).adapter.getRealPosition(i4) != anonymousClass23.getRealCount() - 1) {
                        i4++;
                    }
                    anonymousClass23.setCurrentItem(i4, true);
                }
                break;
            default:
                ProfileActivity profileActivity2 = ProfileActivity.this;
                profileActivity2.getMessagesController().toggleChatNoForwards(profileActivity2.userId, 0, true, new ProfileActivity$$ExternalSyntheticLambda85(true, profileActivity2, i4));
                break;
        }
    }
}
