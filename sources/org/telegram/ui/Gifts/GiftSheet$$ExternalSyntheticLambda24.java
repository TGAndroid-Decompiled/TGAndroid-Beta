package org.telegram.ui.Gifts;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.widget.TextView;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.MessagePrivateSeenView;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda73;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda95;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda111;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda113;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesController$StoriesList$$ExternalSyntheticLambda7;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.Weather$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.Weather$$ExternalSyntheticLambda4;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;
import org.telegram.ui.web.BotWebViewContainer;

public final class GiftSheet$$ExternalSyntheticLambda24 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public GiftSheet$$ExternalSyntheticLambda24(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
    }

    @Override
    public final void run() {
        LaunchActivity$$ExternalSyntheticLambda73 launchActivity$$ExternalSyntheticLambda73;
        BaseFragment safeLastFragment;
        TLRPC.User user = null;
        int i = 0;
        Object obj = this.f$3;
        Object obj2 = this.f$1;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        Object obj5 = this.f$5;
        Object obj6 = this.f$4;
        switch (this.$r8$classId) {
            case 0:
                ((GiftSheet) obj4).lambda$new$17((AlertDialog) obj2, (TLObject) obj3, (GiftSheet$$ExternalSyntheticLambda15) obj, (Utilities.Callback) obj6, (TLRPC.TL_error) obj5);
                break;
            case 1:
                ((BaseLocationAdapter) obj4).lambda$searchPlacesWithQuery$5((Locale) obj2, (String) obj3, (Locale) obj, (Location) obj6, (String) obj5);
                break;
            case 2:
                MentionsAdapter mentionsAdapter = MentionsAdapter.this;
                String str = mentionsAdapter.searchingContextUsername;
                if (str != null && str.equals((String) obj2)) {
                    if (((TLRPC.TL_error) obj5) == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj3);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            TLRPC.User user2 = tL_contacts_resolvedPeer.users.get(0);
                            ((MessagesController) obj).putUser(user2, false);
                            ((MessagesStorage) obj6).putUsersAndChats(tL_contacts_resolvedPeer.users, null, true, true);
                            user = user2;
                        }
                    }
                    mentionsAdapter.processFoundUser(user);
                    mentionsAdapter.contextUsernameReqid = 0;
                    break;
                }
                break;
            case 3:
                MessagePrivateSeenView.lambda$showSheet$5((TLRPC.TL_error) obj5, (Context) obj4, (Theme.ResourcesProvider) obj2, (ButtonWithCounterView) obj3, (BottomSheet) obj, (Runnable) obj6);
                break;
            case 4:
                ((StickersAlert) obj4).lambda$showNameEnterAlert$41((TLObject) obj3, (EditTextBoldCursor) obj2, (TextView) obj, (TextView) obj6, (int[]) obj5);
                break;
            case 5:
                ((StarGiftSheet) obj4).lambda$showDeleteDescriptionAlert$71((TLObject) obj3, (CharSequence) obj2, (TL_stars.TL_starGiftUnique) obj, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj6, (TLRPC.TL_error) obj5);
                break;
            case 6:
                ((StarGiftSheet) obj4).lambda$openTransfer$147((TLObject) obj3, (UserSelectorBottomSheet[]) obj2, (Long) obj, (StarGiftSheet$$ExternalSyntheticLambda66) obj6, (TLRPC.TL_error) obj5);
                break;
            case 7:
                StarsController starsController = (StarsController) obj4;
                starsController.getClass();
                ((boolean[]) obj2)[0] = true;
                starsController.payAfterConfirmed((MessageObject) obj3, (TLRPC.InputInvoice) obj, (TLRPC.TL_payments_paymentFormStars) obj5, new StarGiftSheet$$ExternalSyntheticLambda95(1, (Utilities.Callback) obj6));
                break;
            case 8:
                StarsController starsController2 = (StarsController) obj4;
                Runnable runnable = (Runnable) obj2;
                if (starsController2.balanceLoaded) {
                    starsController2.openPaymentForm(runnable, (MessageObject) obj3, (TLRPC.InputInvoice) obj, (TLRPC.TL_payments_paymentFormStars) obj5, (Utilities.Callback) obj6);
                } else {
                    StarsController.bulletinError("NO_BALANCE");
                    runnable.run();
                }
                break;
            case 9:
                StarsController starsController3 = (StarsController) obj4;
                TLObject tLObject = (TLObject) obj3;
                LaunchActivity$$ExternalSyntheticLambda73 launchActivity$$ExternalSyntheticLambda74 = (LaunchActivity$$ExternalSyntheticLambda73) obj6;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject;
                    TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) obj;
                    launchActivity$$ExternalSyntheticLambda73 = launchActivity$$ExternalSyntheticLambda74;
                    starsController3.openPaymentForm(launchActivity$$ExternalSyntheticLambda73, (MessageObject) obj2, tL_inputInvoiceMessage, tL_payments_paymentFormStars, null);
                } else {
                    launchActivity$$ExternalSyntheticLambda73 = launchActivity$$ExternalSyntheticLambda74;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                    StarsController.bulletinError(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
                }
                launchActivity$$ExternalSyntheticLambda73.run();
                break;
            case 10:
                StarsController starsController4 = (StarsController) obj4;
                List list = (List) obj2;
                BotBiometry$$ExternalSyntheticLambda10 botBiometry$$ExternalSyntheticLambda10 = (BotBiometry$$ExternalSyntheticLambda10) obj3;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda111(botBiometry$$ExternalSyntheticLambda10, i));
                } else {
                    ProductDetails productDetails = (ProductDetails) list.get(0);
                    if (productDetails.getOneTimePurchaseOfferDetails() == null) {
                        AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda111(botBiometry$$ExternalSyntheticLambda10, 1));
                    } else {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) obj;
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(starsController4.currentAccount).sendRequest(tL_payments_canPurchaseStore, new StarsController$$ExternalSyntheticLambda113(productDetails, (BillingResult) obj6, botBiometry$$ExternalSyntheticLambda10, (Activity) obj5, tL_inputStorePaymentStarsGiveaway, list, 0));
                    }
                }
                break;
            case 11:
                StarsController.GiftsCollections giftsCollections = (StarsController.GiftsCollections) obj4;
                giftsCollections.creating = false;
                TLObject tLObject2 = (TLObject) obj3;
                boolean z = tLObject2 instanceof TL_stars.TL_starGiftCollection;
                HashMap map = giftsCollections.gifts;
                ArrayList arrayList = giftsCollections.collections;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                long j = giftsCollections.dialogId;
                int i2 = giftsCollections.currentAccount;
                if (z) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                    arrayList.remove(tL_starGiftCollection);
                    arrayList.add(tL_starGiftCollection2);
                    map.remove(-1);
                    int i3 = tL_starGiftCollection2.collection_id;
                    StarsController.GiftsList giftsList = (StarsController.GiftsList) obj;
                    giftsList.collectionId = i3;
                    map.put(Integer.valueOf(i3), giftsList);
                    giftsCollections.refilterCollections();
                    NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j), giftsCollections);
                    Utilities.Callback callback = (Utilities.Callback) obj6;
                    if (callback != null) {
                        callback.run(tL_starGiftCollection2);
                    }
                } else {
                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                    if (tL_error2 != null && (safeLastFragment = LaunchActivity.getSafeLastFragment()) != null) {
                        BulletinFactory.of(safeLastFragment).showForError(tL_error2);
                    }
                    arrayList.remove(tL_starGiftCollection);
                    map.remove(-1);
                    giftsCollections.refilterCollections();
                    NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j), giftsCollections);
                }
                break;
            case 12:
                StringBuilder sb = new StringBuilder("StoriesList ");
                StoriesController.StoriesList storiesList = (StoriesController.StoriesList) obj4;
                sb.append(storiesList.type);
                sb.append("{");
                sb.append(storiesList.dialogId);
                sb.append("} preloadCache {");
                ArrayList arrayList2 = (ArrayList) obj2;
                sb.append(StoriesController.access$900(arrayList2));
                sb.append("}");
                FileLog.d(sb.toString());
                ArrayList arrayList3 = storiesList.pinnedIds;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj3);
                storiesList.preloading = false;
                int i4 = storiesList.currentAccount;
                MessagesController.getInstance(i4).putUsers((ArrayList) obj, true);
                MessagesController.getInstance(i4).putChats((ArrayList) obj6, true);
                if (storiesList.invalidateAfterPreload) {
                    storiesList.invalidateAfterPreload = false;
                    storiesList.toLoad = null;
                    storiesList.invalidateCache();
                } else {
                    storiesList.seenStories.addAll((HashSet) obj5);
                    storiesList.cachedObjects.clear();
                    for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                        storiesList.pushObject((MessageObject) arrayList2.get(i5), true);
                    }
                    storiesList.fill(false);
                    StoriesController$StoriesList$$ExternalSyntheticLambda7 storiesController$StoriesList$$ExternalSyntheticLambda7 = storiesList.toLoad;
                    if (storiesController$StoriesList$$ExternalSyntheticLambda7 != null) {
                        storiesController$StoriesList$$ExternalSyntheticLambda7.run(0);
                        storiesList.toLoad = null;
                    }
                    NotificationCenter.getInstance(i4).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, storiesList);
                }
                break;
            case 13:
                ((int[]) obj4)[0] = 0;
                TLObject tLObject3 = (TLObject) obj3;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    MessagesController messagesController = (MessagesController) obj2;
                    messagesController.putUsers(tL_contacts_resolvedPeer2.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer2.chats, false);
                    TLRPC.User user3 = messagesController.getUser(Long.valueOf(DialogObject.getPeerDialogId(tL_contacts_resolvedPeer2.peer)));
                    ((TLRPC.User[]) obj)[0] = user3;
                    if (user3 != null) {
                        ((Weather$$ExternalSyntheticLambda4) obj6).run();
                    }
                }
                ((Weather$$ExternalSyntheticLambda1) obj5).run(null);
                break;
            case 14:
                ((BotWebViewContainer) obj4).lambda$onWebEventReceived$5((TLObject) obj3, (TLRPC.TL_messages_requestUrlAuth) obj2, (String) obj, (TLRPC.TL_error) obj5, (String) obj6);
                break;
            default:
                ((BotWebViewContainer) obj4).lambda$onEventReceived$35((File) obj3, (AlertDialog) obj2, (String) obj, (String) obj6, (String) obj5);
                break;
        }
    }

    public GiftSheet$$ExternalSyntheticLambda24(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
    }

    public GiftSheet$$ExternalSyntheticLambda24(TLRPC.TL_error tL_error, Context context, Theme.ResourcesProvider resourcesProvider, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, Runnable runnable) {
        this.$r8$classId = 3;
        this.f$5 = tL_error;
        this.f$0 = context;
        this.f$1 = resourcesProvider;
        this.f$2 = buttonWithCounterView;
        this.f$3 = bottomSheet;
        this.f$4 = runnable;
    }

    public GiftSheet$$ExternalSyntheticLambda24(MentionsAdapter.AnonymousClass4 anonymousClass4, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.$r8$classId = 2;
        this.f$0 = anonymousClass4;
        this.f$1 = str;
        this.f$5 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = messagesController;
        this.f$4 = messagesStorage;
    }

    public GiftSheet$$ExternalSyntheticLambda24(StarsController starsController, Object obj, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = starsController;
        this.f$1 = obj;
        this.f$2 = messageObject;
        this.f$3 = inputInvoice;
        this.f$5 = tL_payments_paymentFormStars;
        this.f$4 = callback;
    }

    public GiftSheet$$ExternalSyntheticLambda24(BotWebViewContainer botWebViewContainer, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.$r8$classId = 14;
        this.f$0 = botWebViewContainer;
        this.f$2 = tLObject;
        this.f$1 = tL_messages_requestUrlAuth;
        this.f$3 = str;
        this.f$5 = tL_error;
        this.f$4 = str2;
    }
}
