package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda102;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda5;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.Weather$$ExternalSyntheticLambda5;
import org.telegram.ui.web.BotWebViewContainer;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public final class ChatActivity$$ExternalSyntheticLambda375 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public ChatActivity$$ExternalSyntheticLambda375(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
    }

    private final void run$org$telegram$ui$ReportBottomSheet$$ExternalSyntheticLambda24() {
        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) ((TLObject) this.f$4);
        final Activity activity = (Activity) this.f$0;
        byte[] bArr = (byte[]) this.f$2;
        final Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$1;
        ReportBottomSheet reportBottomSheet = new ReportBottomSheet(activity, resourcesProvider, 0L, bArr);
        reportBottomSheet.setReportChooseOption(tL_channels_sponsoredMessageReportResultChooseOption);
        final ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29 = (ShareAlert$$ExternalSyntheticLambda29) this.f$5;
        final BaseFragment baseFragment = (BaseFragment) this.f$3;
        reportBottomSheet.listener = new ReportBottomSheet.Listener() {
            @Override
            public final void onHidden() {
                int i = 16;
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda17(i, baseFragment, shareAlert$$ExternalSyntheticLambda29), 200L);
            }

            @Override
            public final void onPremiumRequired() {
                BaseFragment baseFragment2 = baseFragment;
                baseFragment2.showDialog(new PremiumFeatureBottomSheet(baseFragment2, 3, true));
            }

            @Override
            public final void onReported() {
                AndroidUtilities.runOnUIThread(new ReportBottomSheet$$ExternalSyntheticLambda25(baseFragment, activity, resourcesProvider, shareAlert$$ExternalSyntheticLambda29, 2), 200L);
            }
        };
        reportBottomSheet.show();
    }

    private final void run$org$telegram$ui$SelectChatUserSheet$$ExternalSyntheticLambda15() {
        TLRPC.TL_channels_editCreator tL_channels_editCreator = (TLRPC.TL_channels_editCreator) this.f$5;
        ((SelectChatUserSheet) this.f$0).lambda$initTransfer$12((TLRPC.TL_error) this.f$1, (TLRPC.TL_inputCheckPasswordSRP) this.f$2, (TLRPC.User) this.f$3, (TwoStepVerificationActivity) this.f$4, tL_channels_editCreator);
    }

    private final void run$org$telegram$ui$Stars$StarGiftSheet$$ExternalSyntheticLambda136() {
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f$3;
        ((StarGiftSheet) this.f$0).lambda$showDeleteDescriptionAlert$71((TLObject) this.f$4, (CharSequence) this.f$1, (TL_stars.TL_starGiftUnique) this.f$2, tL_inputInvoiceStarGiftDropOriginalDetails, (TLRPC.TL_error) this.f$5);
    }

    private final void run$org$telegram$ui$Stars$StarGiftSheet$$ExternalSyntheticLambda149() {
        PollItemMenu$$ExternalSyntheticLambda8 pollItemMenu$$ExternalSyntheticLambda8 = (PollItemMenu$$ExternalSyntheticLambda8) this.f$3;
        ((StarGiftSheet) this.f$0).lambda$openTransfer$147((TLObject) this.f$4, (UserSelectorBottomSheet[]) this.f$1, (Long) this.f$2, pollItemMenu$$ExternalSyntheticLambda8, (TLRPC.TL_error) this.f$5);
    }

    private final void run$org$telegram$ui$Stars$StarsController$$ExternalSyntheticLambda108() {
        StarsController starsController = (StarsController) this.f$0;
        List list = (List) this.f$1;
        boolean zIsEmpty = list.isEmpty();
        OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18 = (OAuthSheet$$ExternalSyntheticLambda18) this.f$2;
        if (zIsEmpty) {
            AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda7(oAuthSheet$$ExternalSyntheticLambda18, 1));
            return;
        }
        ProductDetails productDetails = (ProductDetails) list.get(0);
        if (productDetails.getOneTimePurchaseOfferDetails() == null) {
            AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda7(oAuthSheet$$ExternalSyntheticLambda18, 2));
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f$3;
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(starsController.currentAccount).sendRequest(tL_payments_canPurchaseStore, new UserInfoActivity$$ExternalSyntheticLambda1(productDetails, (BillingResult) this.f$4, oAuthSheet$$ExternalSyntheticLambda18, (Activity) this.f$5, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void run$org$telegram$ui$Stars$StarsController$$ExternalSyntheticLambda41() {
        StarsController starsController = (StarsController) this.f$0;
        boolean z = starsController.balanceLoaded;
        Runnable runnable = (Runnable) this.f$1;
        if (!z) {
            StarsController.bulletinError("NO_BALANCE");
            runnable.run();
        } else {
            starsController.openPaymentForm(runnable, (MessageObject) this.f$2, (TLRPC.InputInvoice) this.f$3, (TLRPC.TL_payments_paymentFormStars) this.f$4, (Utilities.Callback) this.f$5);
        }
    }

    private final void run$org$telegram$ui$Stars$StarsController$$ExternalSyntheticLambda76() {
        ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda174;
        StarsController starsController = (StarsController) this.f$0;
        TLObject tLObject = (TLObject) this.f$4;
        boolean z = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        ChatActivity$$ExternalSyntheticLambda174 chatActivity$$ExternalSyntheticLambda175 = (ChatActivity$$ExternalSyntheticLambda174) this.f$3;
        if (z) {
            chatActivity$$ExternalSyntheticLambda174 = chatActivity$$ExternalSyntheticLambda175;
            starsController.openPaymentForm(chatActivity$$ExternalSyntheticLambda174, (MessageObject) this.f$1, (TLRPC.TL_inputInvoiceMessage) this.f$2, (TLRPC.TL_payments_paymentFormStars) tLObject, null);
        } else {
            chatActivity$$ExternalSyntheticLambda174 = chatActivity$$ExternalSyntheticLambda175;
            TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$5;
            StarsController.bulletinError(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
        }
        chatActivity$$ExternalSyntheticLambda174.run();
    }

    private final void run$org$telegram$ui$Stars$StarsController$$ExternalSyntheticLambda93() {
        StarsController starsController = (StarsController) this.f$0;
        starsController.getClass();
        ((boolean[]) this.f$1)[0] = true;
        StarGiftSheet$$ExternalSyntheticLambda102 starGiftSheet$$ExternalSyntheticLambda102 = new StarGiftSheet$$ExternalSyntheticLambda102(3, (Utilities.Callback) this.f$5);
        starsController.payAfterConfirmed((MessageObject) this.f$2, (TLRPC.InputInvoice) this.f$3, (TLRPC.TL_payments_paymentFormStars) this.f$4, starGiftSheet$$ExternalSyntheticLambda102);
    }

    private final void run$org$telegram$ui$Stars$StarsController$GiftsCollections$$ExternalSyntheticLambda7() {
        BaseFragment safeLastFragment;
        StarsController.GiftsCollections giftsCollections = (StarsController.GiftsCollections) this.f$0;
        giftsCollections.creating = false;
        TLObject tLObject = (TLObject) this.f$4;
        boolean z = tLObject instanceof TL_stars.TL_starGiftCollection;
        HashMap map = giftsCollections.gifts;
        ArrayList arrayList = giftsCollections.collections;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f$1;
        long j = giftsCollections.dialogId;
        int i = giftsCollections.currentAccount;
        if (!z) {
            TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$5;
            if (tL_error != null && (safeLastFragment = LaunchActivity.getSafeLastFragment()) != null) {
                BulletinFactory.of(safeLastFragment).showForError(false, tL_error);
            }
            arrayList.remove(tL_starGiftCollection);
            map.remove(-1);
            giftsCollections.refilterCollections();
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j), giftsCollections);
            return;
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject;
        arrayList.remove(tL_starGiftCollection);
        arrayList.add(tL_starGiftCollection2);
        map.remove(-1);
        int i2 = tL_starGiftCollection2.collection_id;
        StarsController.GiftsList giftsList = (StarsController.GiftsList) this.f$2;
        giftsList.collectionId = i2;
        map.put(Integer.valueOf(i2), giftsList);
        giftsCollections.refilterCollections();
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j), giftsCollections);
        Utilities.Callback callback = (Utilities.Callback) this.f$3;
        if (callback != null) {
            callback.run(tL_starGiftCollection2);
        }
    }

    private final void run$org$telegram$ui$Stories$StoriesController$StoriesList$$ExternalSyntheticLambda13() {
        StringBuilder sb = new StringBuilder("StoriesList ");
        StoriesController.StoriesList storiesList = (StoriesController.StoriesList) this.f$0;
        sb.append(storiesList.type);
        sb.append("{");
        sb.append(storiesList.dialogId);
        sb.append("} preloadCache {");
        ArrayList arrayList = (ArrayList) this.f$1;
        sb.append(StoriesController.access$900(arrayList));
        sb.append("}");
        FileLog.d(sb.toString());
        ArrayList arrayList2 = storiesList.pinnedIds;
        arrayList2.clear();
        arrayList2.addAll((ArrayList) this.f$2);
        storiesList.preloading = false;
        int i = storiesList.currentAccount;
        MessagesController.getInstance(i).putUsers((ArrayList) this.f$3, true);
        MessagesController.getInstance(i).putChats((ArrayList) this.f$4, true);
        if (storiesList.invalidateAfterPreload) {
            storiesList.invalidateAfterPreload = false;
            storiesList.toLoad = null;
            storiesList.invalidateCache();
            return;
        }
        storiesList.seenStories.addAll((HashSet) this.f$5);
        storiesList.cachedObjects.clear();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            storiesList.pushObject((MessageObject) arrayList.get(i2), true);
        }
        storiesList.fill(false);
        StoriesController$StoriesList$$ExternalSyntheticLambda5 storiesController$StoriesList$$ExternalSyntheticLambda5 = storiesList.toLoad;
        if (storiesController$StoriesList$$ExternalSyntheticLambda5 != null) {
            storiesController$StoriesList$$ExternalSyntheticLambda5.run(0);
            storiesList.toLoad = null;
        }
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, storiesList);
    }

    private final void run$org$telegram$ui$Stories$recorder$Weather$$ExternalSyntheticLambda10() {
        ((int[]) this.f$0)[0] = 0;
        TLObject tLObject = (TLObject) this.f$4;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            ArrayList<TLRPC.User> arrayList = tL_contacts_resolvedPeer.users;
            MessagesController messagesController = (MessagesController) this.f$1;
            messagesController.putUsers(arrayList, false);
            messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
            TLRPC.User user = messagesController.getUser(Long.valueOf(DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer)));
            ((TLRPC.User[]) this.f$2)[0] = user;
            if (user != null) {
                ((Weather$$ExternalSyntheticLambda5) this.f$3).run();
                return;
            }
        }
        ((PhotoViewer$$ExternalSyntheticLambda91) this.f$5).run(null);
    }

    private final void run$org$telegram$ui$web$BotWebViewContainer$$ExternalSyntheticLambda45() {
        BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
        botWebViewContainer.getClass();
        TLObject tLObject = (TLObject) this.f$4;
        if (tLObject != null) {
            boolean z = tLObject instanceof TLRPC.TL_urlAuthResultRequest;
            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f$1;
            if (z) {
                OAuthSheet.handle(false, botWebViewContainer.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, botWebViewContainer);
                return;
            } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
                OAuthSheet.handle(false, botWebViewContainer.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, botWebViewContainer);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
                    AlertsCreator.showOpenUrlAlert(botWebViewContainer.getContext(), (String) this.f$3, false, true, false, 0L, null, null, null);
                    return;
                }
                return;
            }
        }
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$2;
        if (tL_error != null) {
            boolean zEqualsIgnoreCase = "URL_EXPIRED".equalsIgnoreCase(tL_error.text);
            Theme.ResourcesProvider resourcesProvider = botWebViewContainer.resourcesProvider;
            if (!zEqualsIgnoreCase) {
                new BulletinFactory(botWebViewContainer, resourcesProvider).showForError(false, tL_error);
                return;
            }
            new BulletinFactory(botWebViewContainer, resourcesProvider).createSimpleBulletin(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, (String) this.f$5), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider)), R.raw.error).show();
        }
    }

    @Override
    public final void run() {
        BaseLocationAdapter baseLocationAdapter;
        String str;
        Location location;
        String str2;
        List<Address> list;
        List<Address> list2;
        Locale locale;
        HashSet hashSet;
        HashSet hashSet2;
        int i;
        HashSet hashSet3;
        boolean z;
        boolean z2;
        String countryName;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        String subAdminArea;
        String adminArea;
        boolean z3;
        StringBuilder sb;
        String addressLine;
        String[] strArrSplit;
        int length;
        String str3;
        int i2;
        String str4;
        boolean zCanUserDoAction;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.ChatParticipants chatParticipants;
        String str5;
        String str6 = "";
        TLRPC.User user = null;
        int i3 = 0;
        boolean z4 = true;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                ((ChatActivity.AnonymousClass127) this.f$1).end(false);
                ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$2;
                ItemOptions itemOptions = new ItemOptions(chatActivity, chatMessageCell, true, true);
                ScrimOptions scrimOptions = new ScrimOptions(chatActivity.getParentActivity(), chatActivity.themeDelegate);
                itemOptions.dismissListener = new ChatActivity$$ExternalSyntheticLambda112(scrimOptions, 0);
                itemOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.CopyCardNumber), new ChatActivity$$ExternalSyntheticLambda134(chatActivity, scrimOptions, (String) this.f$3, 2), false);
                TLObject tLObject = (TLObject) this.f$4;
                if (tLObject instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList4 = tL_payments_bankCardData.open_urls;
                    int size = arrayList4.size();
                    int i4 = 0;
                    while (i4 < size) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList4.get(i4);
                        i4++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        itemOptions.add(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new ChatActivity$$ExternalSyntheticLambda7(22, chatActivity, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        itemOptions.addGap();
                        itemOptions.addText(13, AndroidUtilities.dp(200.0f), tL_payments_bankCardData.title);
                    }
                }
                scrimOptions.setItemOptions(itemOptions);
                scrimOptions.setScrim(chatMessageCell, (CharacterStyle) this.f$5, null, false);
                chatActivity.showDialog(scrimOptions);
                break;
            case 1:
                BaseLocationAdapter baseLocationAdapter2 = (BaseLocationAdapter) this.f$0;
                Locale locale2 = (Locale) this.f$1;
                String str7 = (String) this.f$3;
                Locale locale3 = (Locale) this.f$2;
                Location location2 = (Location) this.f$4;
                String str8 = (String) this.f$5;
                baseLocationAdapter2.getClass();
                Location location3 = location2;
                String str9 = str8;
                ArrayList arrayList5 = new ArrayList();
                try {
                    int i5 = baseLocationAdapter2.biz ? 10 : 5;
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, locale2).getFromLocationName(str7, 5);
                    List<Address> fromLocationName2 = baseLocationAdapter2.stories ? new Geocoder(ApplicationLoader.applicationContext, locale3).getFromLocationName(str7, 5) : null;
                    HashSet hashSet4 = new HashSet();
                    HashSet hashSet5 = new HashSet();
                    int i6 = 0;
                    while (i6 < fromLocationName.size()) {
                        Address address = fromLocationName.get(i6);
                        Address address2 = (fromLocationName2 == null || i6 >= fromLocationName2.size()) ? null : fromLocationName2.get(i6);
                        if (address.hasLatitude() && address.hasLongitude()) {
                            Address address3 = address2;
                            double latitude = address.getLatitude();
                            str2 = str6;
                            list = fromLocationName;
                            double longitude = address.getLongitude();
                            list2 = fromLocationName2;
                            StringBuilder sb2 = new StringBuilder();
                            locale = locale2;
                            StringBuilder sb3 = new StringBuilder();
                            str = str9;
                            try {
                                StringBuilder sb4 = new StringBuilder();
                                String locality = address.getLocality();
                                if (TextUtils.isEmpty(locality)) {
                                    locality = address.getAdminArea();
                                }
                                location = location3;
                                String str10 = locality;
                                if (address3 != null) {
                                    try {
                                        if (TextUtils.isEmpty(address3.getLocality())) {
                                            address3.getAdminArea();
                                        }
                                    } catch (Exception unused) {
                                        baseLocationAdapter = baseLocationAdapter2;
                                    }
                                }
                                i = i6;
                                String thoroughfare = address.getThoroughfare();
                                if (TextUtils.isEmpty(thoroughfare)) {
                                    hashSet3 = hashSet4;
                                } else {
                                    hashSet3 = hashSet4;
                                    if (!TextUtils.equals(thoroughfare, address.getAdminArea())) {
                                        if (sb4.length() > 0) {
                                            sb4.append(", ");
                                        }
                                        sb4.append(thoroughfare);
                                    }
                                    z = false;
                                    if (TextUtils.isEmpty(str10)) {
                                        z2 = true;
                                    } else {
                                        if (sb3.length() > 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(str10);
                                        if (sb4 != null) {
                                            if (sb4.length() > 0) {
                                                sb4.append(", ");
                                            }
                                            sb4.append(str10);
                                        }
                                        z2 = false;
                                    }
                                    boolean z5 = z;
                                    countryName = address.getCountryName();
                                    if (TextUtils.isEmpty(countryName)) {
                                        hashSet5 = hashSet5;
                                    } else {
                                        if (!"US".equals(address.getCountryCode()) || "AE".equals(address.getCountryCode()) || ("GB".equals(address.getCountryCode()) && "en".equals(locale.getLanguage()))) {
                                            strArrSplit = countryName.split(" ");
                                            str3 = str2;
                                            i2 = 0;
                                            for (length = strArrSplit.length; i2 < length; length = length) {
                                                int i7 = i2;
                                                str4 = strArrSplit[i7];
                                                if (str4.length() > 0) {
                                                    str3 = str3 + str4.charAt(0);
                                                }
                                                i2 = i7 + 1;
                                            }
                                        } else {
                                            str3 = countryName;
                                        }
                                        if (sb3.length() > 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(str3);
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(countryName);
                                    }
                                    if (baseLocationAdapter2.biz) {
                                        sb = new StringBuilder();
                                        try {
                                            addressLine = address.getAddressLine(0);
                                            if (!TextUtils.isEmpty(addressLine)) {
                                                sb.append(addressLine);
                                            }
                                            break;
                                        } catch (Exception unused2) {
                                        }
                                        if (sb.length() > 0) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue3.geo = tL_geoPoint;
                                            tL_geoPoint.lat = latitude;
                                            tL_geoPoint._long = longitude;
                                            tL_messageMediaVenue3.query_id = -1L;
                                            tL_messageMediaVenue3.title = sb.toString();
                                            tL_messageMediaVenue3.icon = "pin";
                                            tL_messageMediaVenue3.address = LocaleController.getString(R.string.PassportAddress);
                                            arrayList5.add(tL_messageMediaVenue3);
                                        }
                                        baseLocationAdapter = baseLocationAdapter2;
                                        hashSet = hashSet3;
                                        hashSet2 = hashSet5;
                                    } else {
                                        if (sb4 == 0 && sb4.length() > 0) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue4.geo = tL_geoPoint2;
                                            tL_geoPoint2.lat = latitude;
                                            tL_geoPoint2._long = longitude;
                                            tL_messageMediaVenue4.query_id = -1L;
                                            tL_messageMediaVenue4.title = sb4.toString();
                                            tL_messageMediaVenue4.icon = "pin";
                                            tL_messageMediaVenue4.address = LocaleController.getString(z5 ? R.string.PassportCity : R.string.PassportStreet1);
                                            if (address3 != null) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                                tL_messageMediaVenue4.geoAddress = tL_geoPointAddress;
                                                tL_geoPointAddress.country_iso2 = address3.getCountryCode();
                                                String locality2 = TextUtils.isEmpty(null) ? address3.getLocality() : null;
                                                if (TextUtils.isEmpty(locality2)) {
                                                    locality2 = address3.getAdminArea();
                                                }
                                                if (TextUtils.isEmpty(locality2)) {
                                                    locality2 = address3.getSubAdminArea();
                                                }
                                                String adminArea2 = address3.getAdminArea();
                                                StringBuilder sb5 = new StringBuilder();
                                                if (TextUtils.isEmpty(adminArea2)) {
                                                    baseLocationAdapter = baseLocationAdapter2;
                                                } else {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue4.geoAddress;
                                                    tL_geoPointAddress2.state = adminArea2;
                                                    baseLocationAdapter = baseLocationAdapter2;
                                                    try {
                                                        tL_geoPointAddress2.flags |= 1;
                                                        break;
                                                    } catch (Exception unused3) {
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(locality2)) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue4.geoAddress;
                                                    tL_geoPointAddress3.city = locality2;
                                                    tL_geoPointAddress3.flags |= 2;
                                                }
                                                if (!z5) {
                                                    String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address3.getThoroughfare(), str10) || TextUtils.equals(address3.getThoroughfare(), address3.getCountryName())) ? null : address3.getThoroughfare();
                                                    if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getSubLocality(), str10) && !TextUtils.equals(address3.getSubLocality(), address3.getCountryName())) {
                                                        thoroughfare2 = address3.getSubLocality();
                                                    }
                                                    if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getLocality(), str10) && !TextUtils.equals(address3.getLocality(), address3.getCountryName())) {
                                                        thoroughfare2 = address3.getLocality();
                                                    }
                                                    if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea2) || TextUtils.equals(thoroughfare2, address3.getCountryName())) {
                                                        sb5 = null;
                                                    } else {
                                                        if (sb5.length() > 0) {
                                                            sb5.append(", ");
                                                        }
                                                        sb5.append(thoroughfare2);
                                                    }
                                                    if (TextUtils.isEmpty(sb5)) {
                                                        z3 = false;
                                                    } else {
                                                        int i8 = 0;
                                                        while (true) {
                                                            String[] strArr = LocationController.unnamedRoads;
                                                            if (i8 >= strArr.length) {
                                                                z3 = false;
                                                            } else if (strArr[i8].equalsIgnoreCase(sb5.toString())) {
                                                                z3 = true;
                                                            } else {
                                                                i8++;
                                                            }
                                                        }
                                                    }
                                                    if (!TextUtils.isEmpty(sb5)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue4.geoAddress;
                                                        tL_geoPointAddress4.flags |= 4;
                                                        tL_geoPointAddress4.street = sb5.toString();
                                                    }
                                                }
                                                if (!z3) {
                                                    arrayList5.add(tL_messageMediaVenue4);
                                                    if (arrayList5.size() >= i5) {
                                                    }
                                                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(baseLocationAdapter, location, str, arrayList5, 9));
                                                }
                                            } else {
                                                sb2 = sb2;
                                                baseLocationAdapter = baseLocationAdapter2;
                                            }
                                            z3 = false;
                                            if (!z3) {
                                                arrayList5.add(tL_messageMediaVenue4);
                                                if (arrayList5.size() >= i5) {
                                                }
                                                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(baseLocationAdapter, location, str, arrayList5, 9));
                                            }
                                        } else {
                                            sb2 = sb2;
                                            baseLocationAdapter = baseLocationAdapter2;
                                        }
                                        if (!z2) {
                                            hashSet2 = hashSet5;
                                            if (!hashSet2.contains(sb3.toString())) {
                                                tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue2.geo = tL_geoPoint3;
                                                tL_geoPoint3.lat = latitude;
                                                tL_geoPoint3._long = longitude;
                                                tL_messageMediaVenue2.query_id = -1L;
                                                tL_messageMediaVenue2.title = sb3.toString();
                                                tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                                tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                                hashSet2.add(tL_messageMediaVenue2.title);
                                                tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                                if (address3 != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress5;
                                                    tL_geoPointAddress5.country_iso2 = address3.getCountryCode();
                                                    if (TextUtils.isEmpty(null)) {
                                                        subAdminArea = address3.getLocality();
                                                    } else {
                                                        subAdminArea = null;
                                                    }
                                                    if (TextUtils.isEmpty(subAdminArea)) {
                                                        subAdminArea = address3.getAdminArea();
                                                    }
                                                    if (TextUtils.isEmpty(subAdminArea)) {
                                                        subAdminArea = address3.getSubAdminArea();
                                                    }
                                                    adminArea = address3.getAdminArea();
                                                    if (!TextUtils.isEmpty(adminArea)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress6.state = adminArea;
                                                        tL_geoPointAddress6.flags |= 1;
                                                    }
                                                    if (!TextUtils.isEmpty(subAdminArea)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress7.city = subAdminArea;
                                                        tL_geoPointAddress7.flags |= 2;
                                                    }
                                                }
                                                arrayList5.add(tL_messageMediaVenue2);
                                                if (arrayList5.size() >= i5) {
                                                }
                                                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(baseLocationAdapter, location, str, arrayList5, 9));
                                            }
                                        } else {
                                            hashSet2 = hashSet5;
                                        }
                                        if (sb2.length() > 0) {
                                            hashSet = hashSet3;
                                            if (hashSet.contains(sb2.toString())) {
                                                continue;
                                            } else {
                                                tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue.geo = tL_geoPoint4;
                                                tL_geoPoint4.lat = latitude;
                                                tL_geoPoint4._long = longitude;
                                                tL_messageMediaVenue.query_id = -1L;
                                                tL_messageMediaVenue.title = sb2.toString();
                                                tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                                tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                                hashSet.add(tL_messageMediaVenue.title);
                                                tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                                if (address3 != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue.geoAddress = tL_geoPointAddress8;
                                                    tL_geoPointAddress8.country_iso2 = address3.getCountryCode();
                                                }
                                                arrayList5.add(tL_messageMediaVenue);
                                                if (arrayList5.size() >= i5) {
                                                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(baseLocationAdapter, location, str, arrayList5, 9));
                                                    break;
                                                }
                                            }
                                        } else {
                                            hashSet = hashSet3;
                                        }
                                    }
                                }
                                String subLocality = address.getSubLocality();
                                if (TextUtils.isEmpty(subLocality)) {
                                    String locality3 = address.getLocality();
                                    if (TextUtils.isEmpty(locality3) || TextUtils.equals(locality3, str10)) {
                                        sb4 = null;
                                        z = true;
                                    } else {
                                        if (sb4.length() > 0) {
                                            sb4.append(", ");
                                        }
                                        sb4.append(locality3);
                                    }
                                    if (TextUtils.isEmpty(str10)) {
                                        if (sb3.length() > 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(str10);
                                        if (sb4 != null) {
                                            if (sb4.length() > 0) {
                                                sb4.append(", ");
                                            }
                                            sb4.append(str10);
                                        }
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    boolean z6 = z;
                                    countryName = address.getCountryName();
                                    if (TextUtils.isEmpty(countryName)) {
                                        if ("US".equals(address.getCountryCode())) {
                                            strArrSplit = countryName.split(" ");
                                            str3 = str2;
                                            i2 = 0;
                                            while (i2 < length) {
                                                int i9 = i2;
                                                str4 = strArrSplit[i9];
                                                if (str4.length() > 0) {
                                                    str3 = str3 + str4.charAt(0);
                                                }
                                                i2 = i9 + 1;
                                            }
                                        } else {
                                            strArrSplit = countryName.split(" ");
                                            str3 = str2;
                                            i2 = 0;
                                            while (i2 < length) {
                                                int i10 = i2;
                                                str4 = strArrSplit[i10];
                                                if (str4.length() > 0) {
                                                    str3 = str3 + str4.charAt(0);
                                                }
                                                i2 = i10 + 1;
                                            }
                                        }
                                        if (sb3.length() > 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(str3);
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(countryName);
                                    } else {
                                        hashSet5 = hashSet5;
                                    }
                                    if (baseLocationAdapter2.biz) {
                                        if (sb4 == 0) {
                                            sb2 = sb2;
                                            baseLocationAdapter = baseLocationAdapter2;
                                            if (!z2) {
                                                hashSet2 = hashSet5;
                                                if (!hashSet2.contains(sb3.toString())) {
                                                    tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                    TLRPC.TL_geoPoint tL_geoPoint5 = new TLRPC.TL_geoPoint();
                                                    tL_messageMediaVenue2.geo = tL_geoPoint5;
                                                    tL_geoPoint5.lat = latitude;
                                                    tL_geoPoint5._long = longitude;
                                                    tL_messageMediaVenue2.query_id = -1L;
                                                    tL_messageMediaVenue2.title = sb3.toString();
                                                    tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                                    tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                                    hashSet2.add(tL_messageMediaVenue2.title);
                                                    tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                                    if (address3 != null) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress9 = new TL_stories.TL_geoPointAddress();
                                                        tL_messageMediaVenue2.geoAddress = tL_geoPointAddress9;
                                                        tL_geoPointAddress9.country_iso2 = address3.getCountryCode();
                                                        if (TextUtils.isEmpty(null)) {
                                                            subAdminArea = address3.getLocality();
                                                        } else {
                                                            subAdminArea = null;
                                                        }
                                                        if (TextUtils.isEmpty(subAdminArea)) {
                                                            subAdminArea = address3.getAdminArea();
                                                        }
                                                        if (TextUtils.isEmpty(subAdminArea)) {
                                                            subAdminArea = address3.getSubAdminArea();
                                                        }
                                                        adminArea = address3.getAdminArea();
                                                        if (!TextUtils.isEmpty(adminArea)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress10 = tL_messageMediaVenue2.geoAddress;
                                                            tL_geoPointAddress10.state = adminArea;
                                                            tL_geoPointAddress10.flags |= 1;
                                                        }
                                                        if (!TextUtils.isEmpty(subAdminArea)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress11 = tL_messageMediaVenue2.geoAddress;
                                                            tL_geoPointAddress11.city = subAdminArea;
                                                            tL_geoPointAddress11.flags |= 2;
                                                        }
                                                    }
                                                    arrayList5.add(tL_messageMediaVenue2);
                                                    if (arrayList5.size() >= i5) {
                                                    }
                                                }
                                            } else {
                                                hashSet2 = hashSet5;
                                            }
                                            if (sb2.length() > 0) {
                                                hashSet = hashSet3;
                                                if (hashSet.contains(sb2.toString())) {
                                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                                    TLRPC.TL_geoPoint tL_geoPoint6 = new TLRPC.TL_geoPoint();
                                                    tL_messageMediaVenue.geo = tL_geoPoint6;
                                                    tL_geoPoint6.lat = latitude;
                                                    tL_geoPoint6._long = longitude;
                                                    tL_messageMediaVenue.query_id = -1L;
                                                    tL_messageMediaVenue.title = sb2.toString();
                                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                                    hashSet.add(tL_messageMediaVenue.title);
                                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                                    if (address3 != null) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress12 = new TL_stories.TL_geoPointAddress();
                                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress12;
                                                        tL_geoPointAddress12.country_iso2 = address3.getCountryCode();
                                                    }
                                                    arrayList5.add(tL_messageMediaVenue);
                                                    if (arrayList5.size() >= i5) {
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                hashSet = hashSet3;
                                            }
                                        } else {
                                            sb2 = sb2;
                                            baseLocationAdapter = baseLocationAdapter2;
                                            if (!z2) {
                                                hashSet2 = hashSet5;
                                                if (!hashSet2.contains(sb3.toString())) {
                                                    tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                    TLRPC.TL_geoPoint tL_geoPoint7 = new TLRPC.TL_geoPoint();
                                                    tL_messageMediaVenue2.geo = tL_geoPoint7;
                                                    tL_geoPoint7.lat = latitude;
                                                    tL_geoPoint7._long = longitude;
                                                    tL_messageMediaVenue2.query_id = -1L;
                                                    tL_messageMediaVenue2.title = sb3.toString();
                                                    tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                                    tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                                    hashSet2.add(tL_messageMediaVenue2.title);
                                                    tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                                    if (address3 != null) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress13 = new TL_stories.TL_geoPointAddress();
                                                        tL_messageMediaVenue2.geoAddress = tL_geoPointAddress13;
                                                        tL_geoPointAddress13.country_iso2 = address3.getCountryCode();
                                                        if (TextUtils.isEmpty(null)) {
                                                            subAdminArea = address3.getLocality();
                                                        } else {
                                                            subAdminArea = null;
                                                        }
                                                        if (TextUtils.isEmpty(subAdminArea)) {
                                                            subAdminArea = address3.getAdminArea();
                                                        }
                                                        if (TextUtils.isEmpty(subAdminArea)) {
                                                            subAdminArea = address3.getSubAdminArea();
                                                        }
                                                        adminArea = address3.getAdminArea();
                                                        if (!TextUtils.isEmpty(adminArea)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress14 = tL_messageMediaVenue2.geoAddress;
                                                            tL_geoPointAddress14.state = adminArea;
                                                            tL_geoPointAddress14.flags |= 1;
                                                        }
                                                        if (!TextUtils.isEmpty(subAdminArea)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress15 = tL_messageMediaVenue2.geoAddress;
                                                            tL_geoPointAddress15.city = subAdminArea;
                                                            tL_geoPointAddress15.flags |= 2;
                                                        }
                                                    }
                                                    arrayList5.add(tL_messageMediaVenue2);
                                                    if (arrayList5.size() >= i5) {
                                                    }
                                                }
                                            } else {
                                                hashSet2 = hashSet5;
                                            }
                                            if (sb2.length() > 0) {
                                                hashSet = hashSet3;
                                                if (hashSet.contains(sb2.toString())) {
                                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                                    TLRPC.TL_geoPoint tL_geoPoint8 = new TLRPC.TL_geoPoint();
                                                    tL_messageMediaVenue.geo = tL_geoPoint8;
                                                    tL_geoPoint8.lat = latitude;
                                                    tL_geoPoint8._long = longitude;
                                                    tL_messageMediaVenue.query_id = -1L;
                                                    tL_messageMediaVenue.title = sb2.toString();
                                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                                    hashSet.add(tL_messageMediaVenue.title);
                                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                                    if (address3 != null) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress16 = new TL_stories.TL_geoPointAddress();
                                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress16;
                                                        tL_geoPointAddress16.country_iso2 = address3.getCountryCode();
                                                    }
                                                    arrayList5.add(tL_messageMediaVenue);
                                                    if (arrayList5.size() >= i5) {
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                hashSet = hashSet3;
                                            }
                                        }
                                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(baseLocationAdapter, location, str, arrayList5, 9));
                                    } else {
                                        sb = new StringBuilder();
                                        addressLine = address.getAddressLine(0);
                                        if (!TextUtils.isEmpty(addressLine)) {
                                            sb.append(addressLine);
                                        }
                                        if (sb.length() > 0) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue5 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint9 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue5.geo = tL_geoPoint9;
                                            tL_geoPoint9.lat = latitude;
                                            tL_geoPoint9._long = longitude;
                                            tL_messageMediaVenue5.query_id = -1L;
                                            tL_messageMediaVenue5.title = sb.toString();
                                            tL_messageMediaVenue5.icon = "pin";
                                            tL_messageMediaVenue5.address = LocaleController.getString(R.string.PassportAddress);
                                            arrayList5.add(tL_messageMediaVenue5);
                                        }
                                        baseLocationAdapter = baseLocationAdapter2;
                                        hashSet = hashSet3;
                                        hashSet2 = hashSet5;
                                    }
                                } else {
                                    if (sb4.length() > 0) {
                                        sb4.append(", ");
                                    }
                                    sb4.append(subLocality);
                                }
                                z = false;
                                if (TextUtils.isEmpty(str10)) {
                                    if (sb3.length() > 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(str10);
                                    if (sb4 != null) {
                                        if (sb4.length() > 0) {
                                            sb4.append(", ");
                                        }
                                        sb4.append(str10);
                                    }
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                boolean z7 = z;
                                countryName = address.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                    if ("US".equals(address.getCountryCode())) {
                                        strArrSplit = countryName.split(" ");
                                        str3 = str2;
                                        i2 = 0;
                                        while (i2 < length) {
                                            int i11 = i2;
                                            str4 = strArrSplit[i11];
                                            if (str4.length() > 0) {
                                                str3 = str3 + str4.charAt(0);
                                            }
                                            i2 = i11 + 1;
                                        }
                                    } else {
                                        strArrSplit = countryName.split(" ");
                                        str3 = str2;
                                        i2 = 0;
                                        while (i2 < length) {
                                            int i12 = i2;
                                            str4 = strArrSplit[i12];
                                            if (str4.length() > 0) {
                                                str3 = str3 + str4.charAt(0);
                                            }
                                            i2 = i12 + 1;
                                        }
                                    }
                                    if (sb3.length() > 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(str3);
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(countryName);
                                } else {
                                    hashSet5 = hashSet5;
                                }
                                if (baseLocationAdapter2.biz) {
                                    if (sb4 == 0) {
                                        sb2 = sb2;
                                        baseLocationAdapter = baseLocationAdapter2;
                                        if (!z2) {
                                            hashSet2 = hashSet5;
                                            if (!hashSet2.contains(sb3.toString())) {
                                                tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint10 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue2.geo = tL_geoPoint10;
                                                tL_geoPoint10.lat = latitude;
                                                tL_geoPoint10._long = longitude;
                                                tL_messageMediaVenue2.query_id = -1L;
                                                tL_messageMediaVenue2.title = sb3.toString();
                                                tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                                tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                                hashSet2.add(tL_messageMediaVenue2.title);
                                                tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                                if (address3 != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress17 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress17;
                                                    tL_geoPointAddress17.country_iso2 = address3.getCountryCode();
                                                    if (TextUtils.isEmpty(null)) {
                                                        subAdminArea = address3.getLocality();
                                                    } else {
                                                        subAdminArea = null;
                                                    }
                                                    if (TextUtils.isEmpty(subAdminArea)) {
                                                        subAdminArea = address3.getAdminArea();
                                                    }
                                                    if (TextUtils.isEmpty(subAdminArea)) {
                                                        subAdminArea = address3.getSubAdminArea();
                                                    }
                                                    adminArea = address3.getAdminArea();
                                                    if (!TextUtils.isEmpty(adminArea)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress18 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress18.state = adminArea;
                                                        tL_geoPointAddress18.flags |= 1;
                                                    }
                                                    if (!TextUtils.isEmpty(subAdminArea)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress19 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress19.city = subAdminArea;
                                                        tL_geoPointAddress19.flags |= 2;
                                                    }
                                                }
                                                arrayList5.add(tL_messageMediaVenue2);
                                                if (arrayList5.size() >= i5) {
                                                }
                                            }
                                        } else {
                                            hashSet2 = hashSet5;
                                        }
                                        if (sb2.length() > 0) {
                                            hashSet = hashSet3;
                                            if (hashSet.contains(sb2.toString())) {
                                                tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint11 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue.geo = tL_geoPoint11;
                                                tL_geoPoint11.lat = latitude;
                                                tL_geoPoint11._long = longitude;
                                                tL_messageMediaVenue.query_id = -1L;
                                                tL_messageMediaVenue.title = sb2.toString();
                                                tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                                tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                                hashSet.add(tL_messageMediaVenue.title);
                                                tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                                if (address3 != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress110 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue.geoAddress = tL_geoPointAddress110;
                                                    tL_geoPointAddress110.country_iso2 = address3.getCountryCode();
                                                }
                                                arrayList5.add(tL_messageMediaVenue);
                                                if (arrayList5.size() >= i5) {
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            hashSet = hashSet3;
                                        }
                                    } else {
                                        sb2 = sb2;
                                        baseLocationAdapter = baseLocationAdapter2;
                                        if (!z2) {
                                            hashSet2 = hashSet5;
                                            if (!hashSet2.contains(sb3.toString())) {
                                                tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint12 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue2.geo = tL_geoPoint12;
                                                tL_geoPoint12.lat = latitude;
                                                tL_geoPoint12._long = longitude;
                                                tL_messageMediaVenue2.query_id = -1L;
                                                tL_messageMediaVenue2.title = sb3.toString();
                                                tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                                tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                                hashSet2.add(tL_messageMediaVenue2.title);
                                                tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                                if (address3 != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress111 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress111;
                                                    tL_geoPointAddress111.country_iso2 = address3.getCountryCode();
                                                    if (TextUtils.isEmpty(null)) {
                                                        subAdminArea = address3.getLocality();
                                                    } else {
                                                        subAdminArea = null;
                                                    }
                                                    if (TextUtils.isEmpty(subAdminArea)) {
                                                        subAdminArea = address3.getAdminArea();
                                                    }
                                                    if (TextUtils.isEmpty(subAdminArea)) {
                                                        subAdminArea = address3.getSubAdminArea();
                                                    }
                                                    adminArea = address3.getAdminArea();
                                                    if (!TextUtils.isEmpty(adminArea)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress112 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress112.state = adminArea;
                                                        tL_geoPointAddress112.flags |= 1;
                                                    }
                                                    if (!TextUtils.isEmpty(subAdminArea)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress113 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress113.city = subAdminArea;
                                                        tL_geoPointAddress113.flags |= 2;
                                                    }
                                                }
                                                arrayList5.add(tL_messageMediaVenue2);
                                                if (arrayList5.size() >= i5) {
                                                }
                                            }
                                        } else {
                                            hashSet2 = hashSet5;
                                        }
                                        if (sb2.length() > 0) {
                                            hashSet = hashSet3;
                                            if (hashSet.contains(sb2.toString())) {
                                                tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint13 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue.geo = tL_geoPoint13;
                                                tL_geoPoint13.lat = latitude;
                                                tL_geoPoint13._long = longitude;
                                                tL_messageMediaVenue.query_id = -1L;
                                                tL_messageMediaVenue.title = sb2.toString();
                                                tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                                tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                                hashSet.add(tL_messageMediaVenue.title);
                                                tL_messageMediaVenue.address = LocaleController.getString(R.string.Country);
                                                if (address3 != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress114 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue.geoAddress = tL_geoPointAddress114;
                                                    tL_geoPointAddress114.country_iso2 = address3.getCountryCode();
                                                }
                                                arrayList5.add(tL_messageMediaVenue);
                                                if (arrayList5.size() >= i5) {
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            hashSet = hashSet3;
                                        }
                                    }
                                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(baseLocationAdapter, location, str, arrayList5, 9));
                                } else {
                                    sb = new StringBuilder();
                                    addressLine = address.getAddressLine(0);
                                    if (!TextUtils.isEmpty(addressLine)) {
                                        sb.append(addressLine);
                                    }
                                    if (sb.length() > 0) {
                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue6 = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint14 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue6.geo = tL_geoPoint14;
                                        tL_geoPoint14.lat = latitude;
                                        tL_geoPoint14._long = longitude;
                                        tL_messageMediaVenue6.query_id = -1L;
                                        tL_messageMediaVenue6.title = sb.toString();
                                        tL_messageMediaVenue6.icon = "pin";
                                        tL_messageMediaVenue6.address = LocaleController.getString(R.string.PassportAddress);
                                        arrayList5.add(tL_messageMediaVenue6);
                                    }
                                    baseLocationAdapter = baseLocationAdapter2;
                                    hashSet = hashSet3;
                                    hashSet2 = hashSet5;
                                }
                            } catch (Exception unused4) {
                                baseLocationAdapter = baseLocationAdapter2;
                                location = location3;
                            }
                        } else {
                            str2 = str6;
                            list = fromLocationName;
                            list2 = fromLocationName2;
                            locale = locale2;
                            hashSet = hashSet4;
                            baseLocationAdapter = baseLocationAdapter2;
                            hashSet2 = hashSet5;
                            str = str9;
                            location = location3;
                            i = i6;
                        }
                        i6 = i + 1;
                        hashSet5 = hashSet2;
                        hashSet4 = hashSet;
                        str6 = str2;
                        fromLocationName = list;
                        fromLocationName2 = list2;
                        locale2 = locale;
                        str9 = str;
                        location3 = location;
                        baseLocationAdapter2 = baseLocationAdapter;
                        break;
                    }
                } catch (Exception unused5) {
                }
                baseLocationAdapter = baseLocationAdapter2;
                str = str9;
                location = location3;
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(baseLocationAdapter, location, str, arrayList5, 9));
                break;
            case 2:
                MentionsAdapter mentionsAdapter = MentionsAdapter.this;
                String str11 = mentionsAdapter.searchingContextUsername;
                if (str11 != null && str11.equals((String) this.f$3)) {
                    if (((TLRPC.TL_error) this.f$1) == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f$4);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            TLRPC.User user2 = tL_contacts_resolvedPeer.users.get(0);
                            ((MessagesController) this.f$2).putUser(user2, false);
                            ((MessagesStorage) this.f$5).putUsersAndChats(tL_contacts_resolvedPeer.users, null, true, true);
                            user = user2;
                        }
                    }
                    mentionsAdapter.processFoundUser(user);
                    mentionsAdapter.contextUsernameReqid = 0;
                    break;
                }
                break;
            case 3:
                TLObject tLObject2 = (TLObject) this.f$4;
                if (tLObject2 instanceof TL_phone.exportedGroupCallInvite) {
                    final String strSubstring = ((TL_phone.exportedGroupCallInvite) tLObject2).link;
                    ((String[]) this.f$0)[0] = strSubstring;
                    if (strSubstring.startsWith("https://")) {
                        strSubstring = strSubstring.substring(8);
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    final FrameLayout frameLayout = (FrameLayout) this.f$1;
                    final LinkSpanDrawable.LinksTextView linksTextView = (LinkSpanDrawable.LinksTextView) this.f$2;
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float fAbs = (Math.abs(fFloatValue - 0.5f) / 5.0f) + 0.9f;
                            FrameLayout frameLayout2 = frameLayout;
                            frameLayout2.setScaleX(fAbs);
                            frameLayout2.setScaleY(fAbs);
                            if (fFloatValue >= 0.5f) {
                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                if (atomicBoolean2.get()) {
                                    return;
                                }
                                atomicBoolean2.set(true);
                                linksTextView.setText(strSubstring);
                            }
                        }
                    });
                    duration.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            AtomicBoolean atomicBoolean2 = atomicBoolean;
                            if (atomicBoolean2.get()) {
                                return;
                            }
                            atomicBoolean2.set(true);
                            linksTextView.setText(strSubstring);
                        }
                    });
                    duration.start();
                    new BulletinFactory(((BottomSheet) this.f$3).topBulletinContainer, (Theme.ResourcesProvider) this.f$5).createSimpleBulletin(LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText), R.raw.linkbroken).show();
                }
                break;
            case 4:
                ChannelAdminLogActivity channelAdminLogActivity = (ChannelAdminLogActivity) this.f$0;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.f$1;
                channelAdminLogActivity.selectedParticipant = channelParticipant;
                if (channelParticipant != null) {
                    boolean z8 = channelParticipant.peer instanceof TLRPC.TL_peerUser;
                    TLRPC.Chat chat = channelAdminLogActivity.currentChat;
                    if (z8) {
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.ChannelParticipant adminInChannel = channelAdminLogActivity.getMessagesController().getAdminInChannel(channelParticipant.peer.user_id, chat.id);
                            if (adminInChannel != null && ((adminInChannel instanceof TLRPC.TL_channelParticipantCreator) || adminInChannel.admin_rights.manage_call)) {
                                if (chat.creator) {
                                }
                            }
                        } else {
                            TLRPC.ChatFull chatFull = channelAdminLogActivity.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                int size2 = chatParticipants.participants.size();
                                while (true) {
                                    if (i3 < size2) {
                                        TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i3);
                                        if (chatParticipant.user_id != channelParticipant.peer.user_id) {
                                            i3++;
                                        } else if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                            if (chat.creator) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        zCanUserDoAction = ChatObject.canUserDoAction(chat, channelParticipant, 6);
                        arrayList = (ArrayList) this.f$2;
                        arrayList2 = (ArrayList) this.f$3;
                        arrayList3 = (ArrayList) this.f$4;
                        if (zCanUserDoAction) {
                            arrayList.add(LocaleController.getString(R.string.Restrict));
                            zzlo.m(R.drawable.msg_block2, 33, arrayList2, arrayList3);
                        } else {
                            arrayList.add(LocaleController.getString(R.string.Restrict));
                            zzlo.m(R.drawable.msg_block2, 33, arrayList2, arrayList3);
                        }
                        arrayList.add(LocaleController.getString(R.string.Ban));
                        zzlo.m(R.drawable.msg_block, 35, arrayList2, arrayList3);
                    } else {
                        zCanUserDoAction = ChatObject.canUserDoAction(chat, channelParticipant, 6);
                        arrayList = (ArrayList) this.f$2;
                        arrayList2 = (ArrayList) this.f$3;
                        arrayList3 = (ArrayList) this.f$4;
                        if (zCanUserDoAction || ChatObject.canUserDoAction(chat, channelParticipant, 7)) {
                            arrayList.add(LocaleController.getString(R.string.Restrict));
                            zzlo.m(R.drawable.msg_block2, 33, arrayList2, arrayList3);
                        }
                        arrayList.add(LocaleController.getString(R.string.Ban));
                        zzlo.m(R.drawable.msg_block, 35, arrayList2, arrayList3);
                    }
                }
                ((ChannelAdminLogActivity$$ExternalSyntheticLambda9) this.f$5).run();
                break;
            case 5:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$0;
                Context context = (Context) this.f$1;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$2;
                if (tL_error != null) {
                    new BulletinFactory(new Bulletin.BulletinWindow(context, null).container, resourcesProvider).showForError(false, tL_error);
                } else {
                    ((ButtonWithCounterView) this.f$3).setLoading(false);
                    ((BottomSheet) this.f$4).lambda$showGiftOfferSheet$15();
                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.PremiumReadSet, new BulletinFactory(new Bulletin.BulletinWindow(context, null).container, resourcesProvider), R.raw.chats_infotip, 36);
                    Runnable runnable = (Runnable) this.f$5;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                break;
            case 6:
                StickersAlert stickersAlert = (StickersAlert) this.f$0;
                stickersAlert.getClass();
                TLObject tLObject3 = (TLObject) this.f$4;
                boolean z9 = tLObject3 instanceof TLRPC.TL_stickers_suggestedShortName;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f$1;
                if (!z9 || (str5 = ((TLRPC.TL_stickers_suggestedShortName) tLObject3).short_name) == null) {
                    z4 = false;
                } else {
                    editTextBoldCursor.setText(str5);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    stickersAlert.checkUrlAvailable((TextView) this.f$2, editTextBoldCursor.getText().toString(), true);
                }
                TextView textView = (TextView) this.f$3;
                textView.setVisibility(0);
                editTextBoldCursor.setPadding(textView.getMeasuredWidth(), AndroidUtilities.dp(4.0f), 0, 0);
                if (!z4) {
                    editTextBoldCursor.setText("");
                }
                ((int[]) this.f$5)[0] = 2;
                break;
            case 7:
                ((GiftSheet) this.f$0).lambda$new$17((AlertDialog) this.f$1, (TLObject) this.f$4, (WearAuthSheet$$ExternalSyntheticLambda3) this.f$2, (Utilities.Callback) this.f$3, (TLRPC.TL_error) this.f$5);
                break;
            case 8:
                ((PassportActivity) this.f$0).lambda$startPhoneVerification$65((TLRPC.TL_error) this.f$1, (String) this.f$3, (PassportActivity.PassportActivityDelegate) this.f$2, (TLObject) this.f$4, (TL_account.sendVerifyPhoneCode) this.f$5);
                break;
            case 9:
                ((ReportBottomSheet) this.f$0).lambda$submitOption$3((TLObject) this.f$4, (CharSequence) this.f$1, (TLRPC.TL_error) this.f$2, (byte[]) this.f$5, (String) this.f$3);
                break;
            case 10:
                run$org$telegram$ui$ReportBottomSheet$$ExternalSyntheticLambda24();
                break;
            case 11:
                run$org$telegram$ui$SelectChatUserSheet$$ExternalSyntheticLambda15();
                break;
            case 12:
                run$org$telegram$ui$Stars$StarGiftSheet$$ExternalSyntheticLambda136();
                break;
            case 13:
                run$org$telegram$ui$Stars$StarGiftSheet$$ExternalSyntheticLambda149();
                break;
            case 14:
                run$org$telegram$ui$Stars$StarsController$$ExternalSyntheticLambda108();
                break;
            case 15:
                run$org$telegram$ui$Stars$StarsController$$ExternalSyntheticLambda41();
                break;
            case 16:
                run$org$telegram$ui$Stars$StarsController$$ExternalSyntheticLambda76();
                break;
            case 17:
                run$org$telegram$ui$Stars$StarsController$$ExternalSyntheticLambda93();
                break;
            case 18:
                run$org$telegram$ui$Stars$StarsController$GiftsCollections$$ExternalSyntheticLambda7();
                break;
            case 19:
                run$org$telegram$ui$Stories$StoriesController$StoriesList$$ExternalSyntheticLambda13();
                break;
            case 20:
                run$org$telegram$ui$Stories$recorder$Weather$$ExternalSyntheticLambda10();
                break;
            case 21:
                run$org$telegram$ui$web$BotWebViewContainer$$ExternalSyntheticLambda45();
                break;
            default:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                File file = (File) this.f$1;
                AlertDialog alertDialog = (AlertDialog) this.f$2;
                String str12 = (String) this.f$3;
                String str13 = (String) this.f$4;
                String str14 = (String) this.f$5;
                botWebViewContainer.getClass();
                if (file == null) {
                    alertDialog.dismissUnless(500L);
                } else {
                    int[] iArr = new int[11];
                    Utilities.globalQueue.postRunnable(new EglRenderer$$ExternalSyntheticLambda6(file, iArr, new ChatActivity$$ExternalSyntheticLambda135(botWebViewContainer, iArr, file, alertDialog, str12, str13, str14, 13)));
                }
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda375(Object obj, Object obj2, String str, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = str;
        this.f$2 = obj3;
        this.f$4 = obj4;
        this.f$5 = obj5;
    }

    public ChatActivity$$ExternalSyntheticLambda375(Object obj, TLObject tLObject, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$4 = tLObject;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$5 = obj5;
    }

    public ChatActivity$$ExternalSyntheticLambda375(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$4 = tLObject;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$5 = obj5;
    }

    public ChatActivity$$ExternalSyntheticLambda375(MentionsAdapter.AnonymousClass4 anonymousClass4, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.$r8$classId = 2;
        this.f$0 = anonymousClass4;
        this.f$3 = str;
        this.f$1 = tL_error;
        this.f$4 = tLObject;
        this.f$2 = messagesController;
        this.f$5 = messagesStorage;
    }

    public ChatActivity$$ExternalSyntheticLambda375(GiftSheet giftSheet, AlertDialog alertDialog, TLObject tLObject, WearAuthSheet$$ExternalSyntheticLambda3 wearAuthSheet$$ExternalSyntheticLambda3, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.$r8$classId = 7;
        this.f$0 = giftSheet;
        this.f$1 = alertDialog;
        this.f$4 = tLObject;
        this.f$2 = wearAuthSheet$$ExternalSyntheticLambda3;
        this.f$3 = callback;
        this.f$5 = tL_error;
    }

    public ChatActivity$$ExternalSyntheticLambda375(ReportBottomSheet reportBottomSheet, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.$r8$classId = 9;
        this.f$0 = reportBottomSheet;
        this.f$4 = tLObject;
        this.f$1 = charSequence;
        this.f$2 = tL_error;
        this.f$5 = bArr;
        this.f$3 = str;
    }

    public ChatActivity$$ExternalSyntheticLambda375(BotWebViewContainer botWebViewContainer, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.$r8$classId = 21;
        this.f$0 = botWebViewContainer;
        this.f$4 = tLObject;
        this.f$1 = tL_messages_requestUrlAuth;
        this.f$3 = str;
        this.f$2 = tL_error;
        this.f$5 = str2;
    }
}
