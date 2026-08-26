package org.telegram.ui.bots;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda70;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AutoDeletePopupWrapper;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ColorPicker$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.LinkActionView$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.LinkActionView$$ExternalSyntheticLambda9;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda12;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileNotificationsActivity$$ExternalSyntheticLambda6;
import org.telegram.ui.RevenueSharingAdsInfoBottomSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class BotAdView$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public BotAdView$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void onClick(View view) {
        Context context;
        float paddingLeft;
        TL_stars.SavedStarGift savedStarGift;
        int i;
        ActionBarPopupWindow actionBarPopupWindow;
        int i2 = 3;
        int i3 = 2;
        int i4 = 7;
        int i5 = 5;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        int i6 = 0;
        Object obj4 = this.f$0;
        int i7 = 1;
        switch (this.$r8$classId) {
            case 0:
                BotAdView botAdView = (BotAdView) obj4;
                ChatActivity chatActivity = (ChatActivity) obj3;
                if (chatActivity != null) {
                    botAdView.getClass();
                    chatActivity.logSponsoredClicked((MessageObject) obj2, false, false);
                }
                Browser.openUrl(botAdView.getContext(), Uri.parse((String) obj), true, false, false, null, null, false, MessagesController.getInstance(UserConfig.selectedAccount).sponsoredLinksInappAllow, false);
                break;
            case 1:
                ((VideoAds) obj4).lambda$show$7((ItemOptions) obj3, (TLRPC.TL_sponsoredMessage) obj2, (Context) obj, view);
                break;
            case 2:
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(((BottomSheet) obj4).getContainer(), (Theme.ResourcesProvider) obj3, (ImageView) obj2);
                itemOptionsMakeOptions.add(R.drawable.menu_link_revoke, LocaleController.getString(R.string.GroupCallCreatedLinkRevoke), (ArticleViewer$$ExternalSyntheticLambda70) obj, false);
                itemOptionsMakeOptions.onTopOfScrim = true;
                itemOptionsMakeOptions.translate(0.0f, -AndroidUtilities.dp(6.0f));
                itemOptionsMakeOptions.dimAlpha = 0;
                itemOptionsMakeOptions.show();
                break;
            case 3:
                ((AlertsCreator.ScheduleDatePickerDelegate) obj2).didSelectDate(((int[]) obj4)[((AlertsCreator.AnonymousClass52) obj3).getValue()] * 60, 0, true);
                ((BottomSheet.Builder) obj).bottomSheet.dismissRunnable.run();
                break;
            case 4:
                ProfileNotificationsActivity$$ExternalSyntheticLambda6 profileNotificationsActivity$$ExternalSyntheticLambda6 = (ProfileNotificationsActivity$$ExternalSyntheticLambda6) obj2;
                profileNotificationsActivity$$ExternalSyntheticLambda6.f$0.lambda$createView$4(((AlertsCreator.AnonymousClass48) obj4).getValue() + 1, (((AlertsCreator.AnonymousClass49) obj3).getValue() + 1) * 60, profileNotificationsActivity$$ExternalSyntheticLambda6.f$1);
                ((BottomSheet.Builder) obj).bottomSheet.dismissRunnable.run();
                break;
            case 5:
                ((AlertsCreator.ScheduleDatePickerDelegate) obj2).didSelectDate(((int[]) obj4)[((AlertsCreator.AnonymousClass45) obj3).getValue()], 0, true);
                ((BottomSheet.Builder) obj).bottomSheet.dismissRunnable.run();
                break;
            case 6:
                AutoDeletePopupWrapper autoDeletePopupWrapper = (AutoDeletePopupWrapper) obj4;
                autoDeletePopupWrapper.callback.dismiss();
                autoDeletePopupWrapper.lastDismissTime = System.currentTimeMillis();
                AlertsCreator.createAutoDeleteDatePickerDialog((Context) obj3, (Theme.ResourcesProvider) obj2, new ColorPicker$$ExternalSyntheticLambda6((AutoDeletePopupWrapper.Callback) obj, i4));
                break;
            case 7:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                chatActivityEnterView.captionAbove = !chatActivityEnterView.captionAbove;
                int i8 = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) obj3;
                    if (i8 >= arrayList.size()) {
                        ((MessagePreviewView.ToggleButton) obj2).setState(!chatActivityEnterView.captionAbove, true);
                        MessageSendPreview messageSendPreview = (MessageSendPreview) obj;
                        if (!arrayList.isEmpty()) {
                            MessageObject messageObject = (MessageObject) arrayList.get(0);
                            MessageObject.GroupedMessages validGroupedMessage$1 = messageSendPreview.getValidGroupedMessage$1(messageObject);
                            if (validGroupedMessage$1 != null) {
                                validGroupedMessage$1.calculate();
                                ArrayList<MessageObject> arrayList2 = validGroupedMessage$1.messages;
                                int size = arrayList2.size();
                                while (i6 < size) {
                                    MessageObject messageObject2 = arrayList2.get(i6);
                                    i6++;
                                    messageSendPreview.changeMessageInternal(messageObject2);
                                }
                            } else {
                                messageSendPreview.changeMessageInternal(messageObject);
                            }
                        }
                        messageSendPreview.scrollTo(!chatActivityEnterView.captionAbove);
                    } else {
                        ((MessageObject) arrayList.get(i8)).messageOwner.invert_media = chatActivityEnterView.captionAbove;
                        i8++;
                    }
                    break;
                }
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                chatActivityEnterView2.getClass();
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                if (groupedMessages != null) {
                    ArrayList<MessageObject> arrayList3 = groupedMessages.messages;
                    int size2 = arrayList3.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        MessageObject messageObject3 = arrayList3.get(i9);
                        i9++;
                        messageObject3.messageOwner.invert_media = chatActivityEnterView2.captionAbove;
                    }
                    groupedMessages.calculate();
                } else {
                    ((MessageObject) obj2).messageOwner.invert_media = chatActivityEnterView2.captionAbove;
                }
                chatActivityEnterView2.doneEditingMessage();
                MessageSendPreview messageSendPreview2 = (MessageSendPreview) obj;
                messageSendPreview2.sent = true;
                messageSendPreview2.dismiss();
                chatActivityEnterView2.captionAbove = false;
                break;
            case 9:
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) obj4;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert.photoLayout;
                if (chatAttachAlertPhotoLayout != null) {
                    StarsIntroActivity.showMediaPriceSheet((Context) obj3, chatAttachAlertPhotoLayout.getStarsPrice(), true, new OAuthSheet$$ExternalSyntheticLambda18(i4, chatAttachAlert, (ActionBarMenuSubItem) obj2), (Theme.ResourcesProvider) obj);
                    break;
                }
                break;
            case 10:
                LinkActionView linkActionView = (LinkActionView) obj4;
                if (linkActionView.actionBarPopupWindow == null) {
                    Context context2 = (Context) obj3;
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context2);
                    boolean z = linkActionView.permanent;
                    ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
                    if (z || !linkActionView.canEdit) {
                        context = context2;
                    } else {
                        context = context2;
                        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, context, null, true, false);
                        actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Edit), R.drawable.msg_edit, null);
                        anonymousClass2.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, 48));
                        actionBarMenuSubItem.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda1(linkActionView, i7));
                    }
                    ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, context, null, true, false);
                    actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    anonymousClass2.addView(actionBarMenuSubItem2, LayoutHelper.createLinear(-1, 48));
                    actionBarMenuSubItem2.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda1(linkActionView, i3));
                    if (!linkActionView.hideRevokeOption) {
                        ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, context, null, false, true);
                        actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.RevokeLink), R.drawable.msg_delete, null);
                        int i10 = Theme.key_text_RedRegular;
                        int color = Theme.getColor(null, i10, false);
                        int color2 = Theme.getColor(null, i10, false);
                        actionBarMenuSubItem3.setTextColor(color);
                        actionBarMenuSubItem3.setIconColor(color2);
                        actionBarMenuSubItem3.setOnClickListener(new LinkActionView$$ExternalSyntheticLambda1(linkActionView, i2));
                        anonymousClass2.addView(actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 48));
                    }
                    BottomSheet bottomSheet = (BottomSheet) obj2;
                    FrameLayout overlayContainerView = bottomSheet == null ? ((ActionBarLayout) ((BaseFragment) obj).getParentLayout()).getOverlayContainerView() : bottomSheet.getContainer();
                    if (overlayContainerView != null) {
                        FrameLayout frameLayout = linkActionView.frameLayout;
                        float[] fArr = linkActionView.point;
                        LinkActionView.getPointOnScreen(frameLayout, overlayContainerView, fArr);
                        float paddingTop = fArr[1];
                        ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(linkActionView, context, overlayContainerView, i2);
                        PhotoViewer.AnonymousClass9 anonymousClass9 = new PhotoViewer.AnonymousClass9(anonymousClass27, i5);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(anonymousClass9);
                        overlayContainerView.addView(anonymousClass27, LayoutHelper.createFrame(-1.0f, -1));
                        anonymousClass27.setAlpha(0.0f);
                        anonymousClass27.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(actionBarPopupWindowLayout);
                        linkActionView.actionBarPopupWindow = actionBarPopupWindow2;
                        actionBarPopupWindow2.setOnDismissListener(new LinkActionView.AnonymousClass4(linkActionView, anonymousClass27, overlayContainerView, anonymousClass9, 0));
                        linkActionView.actionBarPopupWindow.setOutsideTouchable(true);
                        linkActionView.actionBarPopupWindow.setFocusable(true);
                        linkActionView.actionBarPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
                        linkActionView.actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
                        linkActionView.actionBarPopupWindow.setInputMethodMode(2);
                        linkActionView.actionBarPopupWindow.setSoftInputMode(0);
                        actionBarPopupWindowLayout.setDispatchKeyEventListener(new LinkActionView$$ExternalSyntheticLambda9(linkActionView, i6));
                        if (AndroidUtilities.isTablet()) {
                            paddingTop += overlayContainerView.getPaddingTop();
                            paddingLeft = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            paddingLeft = 0.0f;
                        }
                        linkActionView.actionBarPopupWindow.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + paddingLeft), (int) (overlayContainerView.getY() + paddingTop + frameLayout.getMeasuredHeight()));
                    }
                    break;
                }
                break;
            case 11:
                ProfileGiftsContainer.UnpinSheet unpinSheet = (ProfileGiftsContainer.UnpinSheet) obj4;
                unpinSheet.getClass();
                StarsController.GiftsList giftsList = (StarsController.GiftsList) obj3;
                ArrayList pinned = giftsList.getPinned();
                int i11 = 0;
                while (true) {
                    if (i11 >= pinned.size()) {
                        savedStarGift = null;
                        i = -1;
                    } else if (((TL_stars.SavedStarGift) pinned.get(i11)).gift.id == unpinSheet.selectedGift) {
                        savedStarGift = (TL_stars.SavedStarGift) pinned.get(i11);
                        i = i11;
                    } else {
                        i11++;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                    pinned.set(i, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList4 = giftsList.gifts;
                    arrayList4.removeAll(pinned);
                    if (giftsList.sort_by_date && !giftsList.isCollection) {
                        Collections.sort(arrayList4, new OAuthSheet$$ExternalSyntheticLambda3(i4));
                    }
                    arrayList4.addAll(0, pinned);
                    NotificationCenter.getInstance(giftsList.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(giftsList.dialogId), giftsList);
                    giftsList.sendPinnedOrder();
                    unpinSheet.lambda$showGiftOfferSheet$15();
                    ((BulletinFactory) ((Utilities.Callback0Return) obj).run()).createSimpleBulletin(LocaleController.formatString(R.string.Gift2ReplacedPinTitle, StarGiftSheet.getGiftName(savedStarGift2.gift)), LocaleController.formatString(R.string.Gift2ReplacedPinSubtitle, StarGiftSheet.getGiftName(savedStarGift.gift)), R.raw.ic_pin).show();
                    break;
                }
                break;
            case 12:
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) obj4;
                ItemOptions itemOptions = new ItemOptions(LoginActivity.this, loginPayView.optionsButton, false, true);
                itemOptions.add(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new LinkManager$$ExternalSyntheticLambda12(loginPayView, (String) obj, (String) obj3, (String) obj2, 13), false);
                itemOptions.setGravity(5);
                itemOptions.show();
                break;
            case 13:
                ItemOptions itemOptionsMakeOptions2 = ItemOptions.makeOptions(((RevenueSharingAdsInfoBottomSheet) obj4).container, (Theme.ResourcesProvider) obj2, (ImageView) obj, true);
                itemOptionsMakeOptions2.setGravity(5);
                itemOptionsMakeOptions2.drawScrim = false;
                itemOptionsMakeOptions2.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(-32.0f));
                ((ArticleViewer$$ExternalSyntheticLambda21) obj3).run(itemOptionsMakeOptions2);
                break;
            case 14:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = ((PeerStoriesView.AnonymousClass8) obj4).this$0;
                PeerStoriesView.AnonymousClass8 anonymousClass8 = anonymousClass1.popupMenu;
                if (anonymousClass8 != null && (actionBarPopupWindow = anonymousClass8.popupWindow) != null) {
                    actionBarPopupWindow.dismiss(true);
                }
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                storyItem.dialogId = anonymousClass1.dialogId;
                storyItem.messageId = storyItem.id;
                MessageObject messageObject4 = new MessageObject(anonymousClass1.currentAccount, storyItem);
                messageObject4.generateThumbs(false);
                ((StoryViewer) obj2).presentFragment(new PeerStoriesView.AnonymousClass8.AnonymousClass1(messageObject4, false, ((TLRPC.Chat) obj).id));
                break;
            case 15:
                String[] strArr = (String[]) obj4;
                strArr[0] = ((BotStorage.StorageConfig) obj3).storage_id;
                ArrayList arrayList5 = (ArrayList) obj2;
                int size3 = arrayList5.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj5 = arrayList5.get(i12);
                    i12++;
                    BotStorage.C1StorageCell c1StorageCell = (BotStorage.C1StorageCell) obj5;
                    c1StorageCell.radioButton.setChecked(TextUtils.equals(c1StorageCell.id, strArr[0]), true);
                }
                ((ButtonWithCounterView) obj).setEnabled(strArr[0] != null);
                break;
            default:
                boolean[] zArr = (boolean[]) obj4;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((GiftSheet$$ExternalSyntheticLambda23) obj3).run(((String[]) obj2)[0]);
                }
                ((BottomSheet) obj).lambda$showGiftOfferSheet$15();
                break;
        }
    }

    public BotAdView$$ExternalSyntheticLambda2(AutoDeletePopupWrapper autoDeletePopupWrapper, Context context, int i, Theme.ResourcesProvider resourcesProvider, AutoDeletePopupWrapper.Callback callback) {
        this.$r8$classId = 6;
        this.f$0 = autoDeletePopupWrapper;
        this.f$1 = context;
        this.f$2 = resourcesProvider;
        this.f$3 = callback;
    }

    public BotAdView$$ExternalSyntheticLambda2(LoginActivity.LoginPayView loginPayView, String str, String str2, String str3) {
        this.$r8$classId = 12;
        this.f$0 = loginPayView;
        this.f$3 = str;
        this.f$1 = str2;
        this.f$2 = str3;
    }
}
