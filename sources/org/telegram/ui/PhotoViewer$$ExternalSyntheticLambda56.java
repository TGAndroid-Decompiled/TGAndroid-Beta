package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class PhotoViewer$$ExternalSyntheticLambda56 implements View.OnClickListener {
    public final int $r8$classId;
    public final PhotoViewer f$0;

    public PhotoViewer$$ExternalSyntheticLambda56(PhotoViewer photoViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = photoViewer;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        PhotoViewer.PhotoViewerProvider photoViewerProvider;
        ItemOptions itemOptionsMakeSwipeback;
        int iDp;
        int iDp2;
        ArrayList arrayList;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TLRPC.Message message;
        float f = 0.0f;
        int i6 = 2;
        final PhotoViewer photoViewer = this.f$0;
        int i7 = 1;
        final int i8 = 0;
        switch (this.$r8$classId) {
            case 0:
                float f2 = -photoViewer.photoCropView.cropView.getStateOrientation();
                if (Math.abs(f2) > 180.0f) {
                    f2 = f2 < 0.0f ? f2 + 360.0f : -(360.0f - f2);
                }
                photoViewer.cropRotate(f2, photoViewer.photoCropView.cropView.getStateMirror(), new PhotoViewer$$ExternalSyntheticLambda16(photoViewer, 8));
                break;
            case 1:
                if (!photoViewer.sendPhotoTypeIsPollMedia && !photoViewer.isCaptionOpen()) {
                    photoViewer.setPhotoChecked();
                }
                break;
            case 2:
                if (!photoViewer.isCaptionOpen() && (photoViewerProvider = photoViewer.placeProvider) != null && photoViewerProvider.getSelectedPhotosOrder() != null && !photoViewer.placeProvider.getSelectedPhotosOrder().isEmpty()) {
                    photoViewer.togglePhotosListView(!photoViewer.isPhotosListViewVisible, true);
                    break;
                }
                break;
            case 3:
                photoViewer.onActionClick(true);
                photoViewer.checkProgress(0, true);
                break;
            case 4:
                MessageObject messageObject = photoViewer.currentMessageObject;
                if (messageObject == null || !messageObject.isSponsored()) {
                    if (photoViewer.actionBar.actionBarMenuOnItemClick.canOpenMenu()) {
                        photoViewer.menuItem.toggleSubMenu(null, null);
                    }
                    break;
                } else {
                    MessageObject messageObject2 = photoViewer.currentMessageObject;
                    if (messageObject2 != null && messageObject2.isSponsored() && photoViewer.menuItem.getAlpha() > 0.5f) {
                        final int i9 = photoViewer.currentMessageObject.currentAccount;
                        final DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
                        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(photoViewer.containerView, darkThemeResourceProvider, photoViewer.menuItem, true);
                        itemOptionsMakeOptions.translate(0.0f, -AndroidUtilities.dp(46.0f));
                        itemOptionsMakeOptions.setGravity(5);
                        MessageObject messageObject3 = photoViewer.currentMessageObject;
                        if (messageObject3.sponsoredInfo == null && messageObject3.sponsoredAdditionalInfo == null) {
                            String str2 = messageObject3.sponsoredUrl;
                            if (str2 != null) {
                                if (!str2.startsWith("https://" + MessagesController.getInstance(photoViewer.currentAccount).linkPrefix)) {
                                    itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
                                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, photoViewer.activityContext, darkThemeResourceProvider, true, false);
                                    actionBarMenuSubItem.setItemHeight(44);
                                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                                    AnimatedEmojiSpan.TextViewEmojis textView = actionBarMenuSubItem.getTextView();
                                    if (LocaleController.isRTL) {
                                        iDp = 0;
                                    } else {
                                        iDp = AndroidUtilities.dp(40.0f);
                                    }
                                    if (LocaleController.isRTL) {
                                        iDp2 = AndroidUtilities.dp(40.0f);
                                    } else {
                                        iDp2 = 0;
                                    }
                                    textView.setPadding(iDp, 0, iDp2, 0);
                                    actionBarMenuSubItem.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda128(0, itemOptionsMakeOptions));
                                    itemOptionsMakeSwipeback.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
                                    itemOptionsMakeSwipeback.addView(new ActionBarPopupWindow.GapView(photoViewer.activityContext, Theme.key_actionBarDefaultSubmenuSeparator, darkThemeResourceProvider), LayoutHelper.createLinear(-1, 8));
                                    arrayList = new ArrayList();
                                    str = photoViewer.currentMessageObject.sponsoredUrl;
                                    if (str != null) {
                                        TextView textView2 = new TextView(photoViewer.activityContext);
                                        textView2.setTextColor(darkThemeResourceProvider.getColor(Theme.key_chat_messageLinkIn));
                                        textView2.setTextSize(1, 14.0f);
                                        textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                        textView2.setMaxWidth(AndroidUtilities.dp(300.0f));
                                        Uri uri = Uri.parse(photoViewer.currentMessageObject.sponsoredUrl);
                                        textView2.setText(Browser.replace(uri, null, null, Browser.IDN_toUnicode(uri.getHost()), null));
                                        int themedColor$17 = photoViewer.getThemedColor$17(Theme.key_dialogButtonSelector);
                                        if (photoViewer.currentMessageObject.sponsoredAdditionalInfo == null) {
                                            i5 = 6;
                                        } else {
                                            i5 = 0;
                                        }
                                        textView2.setBackground(Theme.createRadSelectorDrawable(themedColor$17, 0, i5));
                                        textView2.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(i6, photoViewer, itemOptionsMakeOptions));
                                        textView2.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda130(i8, photoViewer, darkThemeResourceProvider));
                                        arrayList.add(textView2);
                                    }
                                    if (photoViewer.currentMessageObject.sponsoredInfo != null) {
                                        TextView textView3 = new TextView(photoViewer.activityContext);
                                        textView3.setTextColor(darkThemeResourceProvider.getColor(Theme.key_actionBarDefaultSubmenuItem));
                                        textView3.setTextSize(1, 14.0f);
                                        textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                        textView3.setMaxWidth(AndroidUtilities.dp(300.0f));
                                        textView3.setText(photoViewer.currentMessageObject.sponsoredInfo);
                                        int themedColor$18 = photoViewer.getThemedColor$17(Theme.key_dialogButtonSelector);
                                        if (photoViewer.currentMessageObject.sponsoredAdditionalInfo == null) {
                                            i4 = 6;
                                        } else {
                                            i4 = 0;
                                        }
                                        textView3.setBackground(Theme.createRadSelectorDrawable(themedColor$18, 0, i4));
                                        textView3.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public final void onClick(View view2) {
                                                switch (i8) {
                                                    case 0:
                                                        PhotoViewer photoViewer2 = photoViewer;
                                                        if (AndroidUtilities.addToClipboard(photoViewer2.currentMessageObject.sponsoredInfo)) {
                                                            Bulletin.BulletinWindow bulletinWindow = new Bulletin.BulletinWindow(photoViewer2.activityContext, null);
                                                            zzkn.m(R.string.TextCopied, new BulletinFactory(bulletinWindow.container, darkThemeResourceProvider));
                                                        }
                                                        break;
                                                    default:
                                                        PhotoViewer photoViewer3 = photoViewer;
                                                        if (AndroidUtilities.addToClipboard(photoViewer3.currentMessageObject.sponsoredAdditionalInfo)) {
                                                            Bulletin.BulletinWindow bulletinWindow2 = new Bulletin.BulletinWindow(photoViewer3.activityContext, null);
                                                            zzkn.m(R.string.TextCopied, new BulletinFactory(bulletinWindow2.container, darkThemeResourceProvider));
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        arrayList.add(textView3);
                                    }
                                    if (photoViewer.currentMessageObject.sponsoredAdditionalInfo != null) {
                                        TextView textView4 = new TextView(photoViewer.activityContext);
                                        textView4.setTextColor(darkThemeResourceProvider.getColor(Theme.key_actionBarDefaultSubmenuItem));
                                        textView4.setTextSize(1, 14.0f);
                                        textView4.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                        textView4.setMaxWidth(AndroidUtilities.dp(300.0f));
                                        textView4.setText(photoViewer.currentMessageObject.sponsoredAdditionalInfo);
                                        textView4.setBackground(Theme.createRadSelectorDrawable(photoViewer.getThemedColor$17(Theme.key_dialogButtonSelector), 0, 6));
                                        final int i10 = 1;
                                        textView4.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public final void onClick(View view2) {
                                                switch (i10) {
                                                    case 0:
                                                        PhotoViewer photoViewer2 = photoViewer;
                                                        if (AndroidUtilities.addToClipboard(photoViewer2.currentMessageObject.sponsoredInfo)) {
                                                            Bulletin.BulletinWindow bulletinWindow = new Bulletin.BulletinWindow(photoViewer2.activityContext, null);
                                                            zzkn.m(R.string.TextCopied, new BulletinFactory(bulletinWindow.container, darkThemeResourceProvider));
                                                        }
                                                        break;
                                                    default:
                                                        PhotoViewer photoViewer3 = photoViewer;
                                                        if (AndroidUtilities.addToClipboard(photoViewer3.currentMessageObject.sponsoredAdditionalInfo)) {
                                                            Bulletin.BulletinWindow bulletinWindow2 = new Bulletin.BulletinWindow(photoViewer3.activityContext, null);
                                                            zzkn.m(R.string.TextCopied, new BulletinFactory(bulletinWindow2.container, darkThemeResourceProvider));
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        arrayList.add(textView4);
                                    }
                                    for (i = 0; i < arrayList.size(); i += i3) {
                                        View view2 = (View) arrayList.get(i);
                                        if (i > 0) {
                                            FrameLayout frameLayout = new FrameLayout(photoViewer.activityContext);
                                            frameLayout.setBackgroundColor(darkThemeResourceProvider.getColor(Theme.key_divider));
                                            i2 = -1;
                                            i3 = 1;
                                            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(-1, 1);
                                            layoutParamsCreateLinear.height = 1;
                                            itemOptionsMakeSwipeback.addView(frameLayout, layoutParamsCreateLinear);
                                        } else {
                                            i2 = -1;
                                            i3 = 1;
                                        }
                                        itemOptionsMakeSwipeback.addView(view2, LayoutHelper.createLinear(i2, -2));
                                    }
                                    itemOptionsMakeOptions.add(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new PhotoViewer$$ExternalSyntheticLambda133(itemOptionsMakeOptions, itemOptionsMakeSwipeback, 0), false);
                                }
                            }
                        } else {
                            itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
                            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, photoViewer.activityContext, darkThemeResourceProvider, true, false);
                            actionBarMenuSubItem2.setItemHeight(44);
                            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                            AnimatedEmojiSpan.TextViewEmojis textView5 = actionBarMenuSubItem2.getTextView();
                            if (LocaleController.isRTL) {
                                iDp = 0;
                            } else {
                                iDp = AndroidUtilities.dp(40.0f);
                            }
                            if (LocaleController.isRTL) {
                                iDp2 = AndroidUtilities.dp(40.0f);
                            } else {
                                iDp2 = 0;
                            }
                            textView5.setPadding(iDp, 0, iDp2, 0);
                            actionBarMenuSubItem2.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda128(0, itemOptionsMakeOptions));
                            itemOptionsMakeSwipeback.addView(actionBarMenuSubItem2, LayoutHelper.createLinear(-1, -2));
                            itemOptionsMakeSwipeback.addView(new ActionBarPopupWindow.GapView(photoViewer.activityContext, Theme.key_actionBarDefaultSubmenuSeparator, darkThemeResourceProvider), LayoutHelper.createLinear(-1, 8));
                            arrayList = new ArrayList();
                            str = photoViewer.currentMessageObject.sponsoredUrl;
                            if (str != null && !TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(photoViewer.currentAccount).linkPrefix)) {
                                TextView textView6 = new TextView(photoViewer.activityContext);
                                textView6.setTextColor(darkThemeResourceProvider.getColor(Theme.key_chat_messageLinkIn));
                                textView6.setTextSize(1, 14.0f);
                                textView6.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                textView6.setMaxWidth(AndroidUtilities.dp(300.0f));
                                Uri uri2 = Uri.parse(photoViewer.currentMessageObject.sponsoredUrl);
                                textView6.setText(Browser.replace(uri2, null, null, Browser.IDN_toUnicode(uri2.getHost()), null));
                                int themedColor$19 = photoViewer.getThemedColor$17(Theme.key_dialogButtonSelector);
                                if (photoViewer.currentMessageObject.sponsoredAdditionalInfo == null) {
                                    i5 = 6;
                                } else {
                                    i5 = 0;
                                }
                                textView6.setBackground(Theme.createRadSelectorDrawable(themedColor$19, 0, i5));
                                textView6.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(i6, photoViewer, itemOptionsMakeOptions));
                                textView6.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda130(i8, photoViewer, darkThemeResourceProvider));
                                arrayList.add(textView6);
                            }
                            if (photoViewer.currentMessageObject.sponsoredInfo != null) {
                                TextView textView7 = new TextView(photoViewer.activityContext);
                                textView7.setTextColor(darkThemeResourceProvider.getColor(Theme.key_actionBarDefaultSubmenuItem));
                                textView7.setTextSize(1, 14.0f);
                                textView7.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                textView7.setMaxWidth(AndroidUtilities.dp(300.0f));
                                textView7.setText(photoViewer.currentMessageObject.sponsoredInfo);
                                int themedColor$110 = photoViewer.getThemedColor$17(Theme.key_dialogButtonSelector);
                                if (photoViewer.currentMessageObject.sponsoredAdditionalInfo == null) {
                                    i4 = 6;
                                } else {
                                    i4 = 0;
                                }
                                textView7.setBackground(Theme.createRadSelectorDrawable(themedColor$110, 0, i4));
                                textView7.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view3) {
                                        switch (i8) {
                                            case 0:
                                                PhotoViewer photoViewer2 = photoViewer;
                                                if (AndroidUtilities.addToClipboard(photoViewer2.currentMessageObject.sponsoredInfo)) {
                                                    Bulletin.BulletinWindow bulletinWindow = new Bulletin.BulletinWindow(photoViewer2.activityContext, null);
                                                    zzkn.m(R.string.TextCopied, new BulletinFactory(bulletinWindow.container, darkThemeResourceProvider));
                                                }
                                                break;
                                            default:
                                                PhotoViewer photoViewer3 = photoViewer;
                                                if (AndroidUtilities.addToClipboard(photoViewer3.currentMessageObject.sponsoredAdditionalInfo)) {
                                                    Bulletin.BulletinWindow bulletinWindow2 = new Bulletin.BulletinWindow(photoViewer3.activityContext, null);
                                                    zzkn.m(R.string.TextCopied, new BulletinFactory(bulletinWindow2.container, darkThemeResourceProvider));
                                                }
                                                break;
                                        }
                                    }
                                });
                                arrayList.add(textView7);
                            }
                            if (photoViewer.currentMessageObject.sponsoredAdditionalInfo != null) {
                                TextView textView8 = new TextView(photoViewer.activityContext);
                                textView8.setTextColor(darkThemeResourceProvider.getColor(Theme.key_actionBarDefaultSubmenuItem));
                                textView8.setTextSize(1, 14.0f);
                                textView8.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                textView8.setMaxWidth(AndroidUtilities.dp(300.0f));
                                textView8.setText(photoViewer.currentMessageObject.sponsoredAdditionalInfo);
                                textView8.setBackground(Theme.createRadSelectorDrawable(photoViewer.getThemedColor$17(Theme.key_dialogButtonSelector), 0, 6));
                                final int i11 = 1;
                                textView8.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view3) {
                                        switch (i11) {
                                            case 0:
                                                PhotoViewer photoViewer2 = photoViewer;
                                                if (AndroidUtilities.addToClipboard(photoViewer2.currentMessageObject.sponsoredInfo)) {
                                                    Bulletin.BulletinWindow bulletinWindow = new Bulletin.BulletinWindow(photoViewer2.activityContext, null);
                                                    zzkn.m(R.string.TextCopied, new BulletinFactory(bulletinWindow.container, darkThemeResourceProvider));
                                                }
                                                break;
                                            default:
                                                PhotoViewer photoViewer3 = photoViewer;
                                                if (AndroidUtilities.addToClipboard(photoViewer3.currentMessageObject.sponsoredAdditionalInfo)) {
                                                    Bulletin.BulletinWindow bulletinWindow2 = new Bulletin.BulletinWindow(photoViewer3.activityContext, null);
                                                    zzkn.m(R.string.TextCopied, new BulletinFactory(bulletinWindow2.container, darkThemeResourceProvider));
                                                }
                                                break;
                                        }
                                    }
                                });
                                arrayList.add(textView8);
                            }
                            while (i < arrayList.size()) {
                                View view3 = (View) arrayList.get(i);
                                if (i > 0) {
                                    FrameLayout frameLayout2 = new FrameLayout(photoViewer.activityContext);
                                    frameLayout2.setBackgroundColor(darkThemeResourceProvider.getColor(Theme.key_divider));
                                    i2 = -1;
                                    i3 = 1;
                                    LinearLayout.LayoutParams layoutParamsCreateLinear2 = LayoutHelper.createLinear(-1, 1);
                                    layoutParamsCreateLinear2.height = 1;
                                    itemOptionsMakeSwipeback.addView(frameLayout2, layoutParamsCreateLinear2);
                                } else {
                                    i2 = -1;
                                    i3 = 1;
                                }
                                itemOptionsMakeSwipeback.addView(view3, LayoutHelper.createLinear(i2, -2));
                            }
                            itemOptionsMakeOptions.add(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new PhotoViewer$$ExternalSyntheticLambda133(itemOptionsMakeOptions, itemOptionsMakeSwipeback, 0), false);
                        }
                        if (!UserConfig.getInstance(i9).isPremium() && !MessagesController.getInstance(photoViewer.currentAccount).premiumFeaturesBlocked() && !photoViewer.currentMessageObject.sponsoredCanReport) {
                            itemOptionsMakeOptions.add(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i8) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            photoViewer2.getClass();
                                            int i12 = i9;
                                            if (!UserConfig.getInstance(i12).isPremium()) {
                                                new PremiumFeatureBottomSheet(photoViewer2.parentFragment, 3, true).show();
                                            } else {
                                                new BulletinFactory(photoViewer2.containerView, darkThemeResourceProvider).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                                                MessagesController.getInstance(i12).disableAds(true);
                                                BaseFragment baseFragment = photoViewer2.parentFragment;
                                                if (baseFragment instanceof ChatActivity) {
                                                    ChatActivity chatActivity = (ChatActivity) baseFragment;
                                                    chatActivity.removeFromSponsored(photoViewer2.currentMessageObject);
                                                    chatActivity.removeMessageWithThanos(photoViewer2.currentMessageObject);
                                                }
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            photoViewer3.getClass();
                                            int i13 = i9;
                                            if (!UserConfig.getInstance(i13).isPremium()) {
                                                new PremiumFeatureBottomSheet(photoViewer3.parentFragment, 3, true).show();
                                            } else {
                                                new BulletinFactory(photoViewer3.containerView, darkThemeResourceProvider).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                                                MessagesController.getInstance(i13).disableAds(true);
                                                BaseFragment baseFragment2 = photoViewer3.parentFragment;
                                                if (baseFragment2 instanceof ChatActivity) {
                                                    ChatActivity chatActivity2 = (ChatActivity) baseFragment2;
                                                    chatActivity2.removeFromSponsored(photoViewer3.currentMessageObject);
                                                    chatActivity2.removeMessageWithThanos(photoViewer3.currentMessageObject);
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (photoViewer.currentMessageObject.sponsoredCanReport) {
                            itemOptionsMakeOptions.add(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new PhotoViewer$$ExternalSyntheticLambda7(8, photoViewer, darkThemeResourceProvider), false);
                            if ((photoViewer.parentFragment instanceof ChatActivity) && !MessagesController.getInstance(i9).premiumFeaturesBlocked()) {
                                itemOptionsMakeOptions.addGap();
                                final int i12 = 1;
                                itemOptionsMakeOptions.add(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                PhotoViewer photoViewer2 = photoViewer;
                                                photoViewer2.getClass();
                                                int i13 = i9;
                                                if (!UserConfig.getInstance(i13).isPremium()) {
                                                    new PremiumFeatureBottomSheet(photoViewer2.parentFragment, 3, true).show();
                                                } else {
                                                    new BulletinFactory(photoViewer2.containerView, darkThemeResourceProvider).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                                                    MessagesController.getInstance(i13).disableAds(true);
                                                    BaseFragment baseFragment = photoViewer2.parentFragment;
                                                    if (baseFragment instanceof ChatActivity) {
                                                        ChatActivity chatActivity = (ChatActivity) baseFragment;
                                                        chatActivity.removeFromSponsored(photoViewer2.currentMessageObject);
                                                        chatActivity.removeMessageWithThanos(photoViewer2.currentMessageObject);
                                                    }
                                                }
                                                break;
                                            default:
                                                PhotoViewer photoViewer3 = photoViewer;
                                                photoViewer3.getClass();
                                                int i14 = i9;
                                                if (!UserConfig.getInstance(i14).isPremium()) {
                                                    new PremiumFeatureBottomSheet(photoViewer3.parentFragment, 3, true).show();
                                                } else {
                                                    new BulletinFactory(photoViewer3.containerView, darkThemeResourceProvider).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                                                    MessagesController.getInstance(i14).disableAds(true);
                                                    BaseFragment baseFragment2 = photoViewer3.parentFragment;
                                                    if (baseFragment2 instanceof ChatActivity) {
                                                        ChatActivity chatActivity2 = (ChatActivity) baseFragment2;
                                                        chatActivity2.removeFromSponsored(photoViewer3.currentMessageObject);
                                                        chatActivity2.removeMessageWithThanos(photoViewer3.currentMessageObject);
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        if (itemOptionsMakeOptions.getItemsCount() > 0) {
                            itemOptionsMakeOptions.show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                MessageObject messageObject4 = photoViewer.currentMessageObject;
                if (messageObject4 != null && messageObject4.hasVideoQualities()) {
                    ChooseDownloadQualityLayout chooseDownloadQualityLayout = photoViewer.chooseDownloadQualityLayout;
                    MessageObject messageObject5 = photoViewer.currentMessageObject;
                    chooseDownloadQualityLayout.getClass();
                    if (messageObject5 != null && (message = messageObject5.messageOwner) != null && message.media != null && messageObject5.hasVideoQualities()) {
                        int i13 = messageObject5.currentAccount;
                        TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                        ArrayList qualities = VideoPlayer.getQualities(i13, messageMedia.document, messageMedia.alt_documents, 0, true);
                        LinearLayout linearLayout = chooseDownloadQualityLayout.buttonsLayout;
                        linearLayout.removeAllViews();
                        int i14 = 0;
                        while (i14 < qualities.size()) {
                            VideoPlayer.Quality quality = (VideoPlayer.Quality) qualities.get(i14);
                            VideoPlayer.VideoUri downloadUri = quality.getDownloadUri();
                            StringBuilder sb = new StringBuilder();
                            int i15 = R.string.QualitySaveIn;
                            Object[] objArr = new Object[i7];
                            objArr[0] = Integer.valueOf(quality.p());
                            sb.append(LocaleController.formatString(i15, objArr));
                            sb.append(quality.original ? " (" + LocaleController.getString(R.string.QualitySource) + ")" : "");
                            String string = sb.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (downloadUri.isCached()) {
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(downloadUri.document.size));
                                spannableStringBuilder.append(LocaleController.getString(R.string.QualityCached));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_arrow_mediabold);
                                coloredImageSpan.rotate(90.0f);
                                coloredImageSpan.translate(f, AndroidUtilities.dp(1.0f));
                                coloredImageSpan.spaceScaleX = 0.85f;
                                spannableString.setSpan(coloredImageSpan, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(downloadUri.document.size));
                            }
                            ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(false, false, linearLayout, 0, string, false, null);
                            actionBarMenuSubItemAddItem.setSubtext(spannableStringBuilder);
                            actionBarMenuSubItemAddItem.setTextColor(-328966);
                            actionBarMenuSubItemAddItem.setIconColor(-328966);
                            actionBarMenuSubItemAddItem.subtextView.setPadding(0, 0, 0, 0);
                            actionBarMenuSubItemAddItem.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(chooseDownloadQualityLayout, messageObject5, quality, 11));
                            actionBarMenuSubItemAddItem.setSelectorColor(268435455);
                            i14++;
                            f = 0.0f;
                            i7 = 1;
                        }
                        Runnable runnable = photoViewer.galleryButton.openSwipeBackLayout;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                PhotoViewer.AnonymousClass15 anonymousClass15 = photoViewer.actionBar;
                if (anonymousClass15 != null && anonymousClass15.getActionBarMenuOnItemClick() != null) {
                    photoViewer.actionBar.getActionBarMenuOnItemClick().onItemClick(2);
                    photoViewer.menuItem.toggleSubMenu(null, null);
                    break;
                }
                break;
            case 6:
                Activity activity = photoViewer.parentActivity;
                if (activity != null) {
                    photoViewer.wasRotated = false;
                    photoViewer.fullscreenedByButton = 1;
                    if (photoViewer.prevOrientation == -10) {
                        photoViewer.prevOrientation = activity.getRequestedOrientation();
                    }
                    if (((WindowManager) photoViewer.parentActivity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                        photoViewer.parentActivity.setRequestedOrientation(8);
                    } else {
                        photoViewer.parentActivity.setRequestedOrientation(0);
                    }
                    photoViewer.toggleActionBar(false, false, PhotoViewer.ActionBarToggleParams.DEFAULT);
                    break;
                }
                break;
            default:
                Activity activity2 = photoViewer.parentActivity;
                if (activity2 != null) {
                    photoViewer.wasRotated = false;
                    photoViewer.fullscreenedByButton = 2;
                    if (photoViewer.prevOrientation == -10) {
                        photoViewer.prevOrientation = activity2.getRequestedOrientation();
                    }
                    photoViewer.parentActivity.setRequestedOrientation(1);
                    break;
                }
                break;
        }
    }
}
