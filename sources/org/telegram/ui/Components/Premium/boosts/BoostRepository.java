package org.telegram.ui.Components.Premium.boosts;

import android.text.TextUtils;
import android.util.Pair;
import com.android.billingclient.api.AccountIdentifiers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda206;
import org.telegram.ui.PassportActivity$3$$ExternalSyntheticLambda3;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda75;
import org.telegram.ui.bots.BotWebViewSheet;

public abstract class BoostRepository {
    public static HashMap cachedGiftOptions;

    public static void applyBoost(long j, List list, Utilities.Callback callback, Utilities.Callback callback2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TL_stories.TL_premium_applyBoost tL_premium_applyBoost = new TL_stories.TL_premium_applyBoost();
        tL_premium_applyBoost.peer = messagesController.getInputPeer(-j);
        tL_premium_applyBoost.flags |= 1;
        tL_premium_applyBoost.slots.addAll(list);
        connectionsManager.sendRequest(tL_premium_applyBoost, new BoostsActivity$$ExternalSyntheticLambda7(callback2, messagesController, callback, 18), 66);
    }

    public static int boostsPerSentGift() {
        return (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift;
    }

    public static ArrayList filterGiftOptions(int i, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
            String str = tL_premiumGiftCodeOption.store_product;
            if (tL_premiumGiftCodeOption.users == i) {
                arrayList.add(tL_premiumGiftCodeOption);
            }
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) it2.next();
                if (tL_premiumGiftCodeOption2.users == 1) {
                    arrayList.add(tL_premiumGiftCodeOption2);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList filterGiftOptionsByBilling(ArrayList arrayList) {
        if (!isGoogleBillingAvailable()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
            if (tL_premiumGiftCodeOption.store_product != null) {
                arrayList2.add(tL_premiumGiftCodeOption);
            }
        }
        return arrayList2;
    }

    public static void getGiveawayInfo(MessageObject messageObject, Utilities.Callback callback, Utilities.Callback callback2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_getGiveawayInfo tL_payments_getGiveawayInfo = new TLRPC.TL_payments_getGiveawayInfo();
        tL_payments_getGiveawayInfo.msg_id = messageObject.getId();
        tL_payments_getGiveawayInfo.peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        connectionsManager.sendRequest(tL_payments_getGiveawayInfo, new BoostRepository$$ExternalSyntheticLambda6(callback2, callback, 0));
    }

    public static ArrayList getMyChannels(long j) {
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i = 0; i < allDialogs.size(); i++) {
            TLRPC.Dialog dialog = allDialogs.get(i);
            if (DialogObject.isChatDialog(dialog.id) && ChatObject.isBoostSupported(messagesController.getChat(Long.valueOf(-dialog.id)))) {
                long j2 = dialog.id;
                if ((-j2) != j) {
                    arrayList.add(messagesController.getInputPeer(j2));
                }
            }
        }
        return arrayList;
    }

    public static long giveawayAddPeersMax() {
        return MessagesController.getInstance(UserConfig.selectedAccount).giveawayAddPeersMax;
    }

    public static long giveawayCountriesMax() {
        return MessagesController.getInstance(UserConfig.selectedAccount).giveawayCountriesMax;
    }

    public static boolean isGoogleBillingAvailable() {
        if (BuildVars.useInvoiceBilling()) {
            return false;
        }
        return BillingController.getInstance().isReady();
    }

    public static boolean isMultiBoostsAvailable() {
        return MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift > 0;
    }

    public static int loadGiftOptions(int i, TLRPC.Chat chat, Utilities.Callback callback) {
        Pair pair;
        if (chat == null) {
            HashMap map = cachedGiftOptions;
            List list = (map == null || (pair = (Pair) map.get(Integer.valueOf(i))) == null || System.currentTimeMillis() - ((Long) pair.first).longValue() >= 1800000) ? null : (List) pair.second;
            if (list != null) {
                callback.run(list);
                return -1;
            }
        }
        MessagesController messagesController = MessagesController.getInstance(i);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        TLRPC.TL_payments_getPremiumGiftCodeOptions tL_payments_getPremiumGiftCodeOptions = new TLRPC.TL_payments_getPremiumGiftCodeOptions();
        if (chat != null) {
            tL_payments_getPremiumGiftCodeOptions.flags = 1;
            tL_payments_getPremiumGiftCodeOptions.boost_peer = messagesController.getInputPeer(-chat.id);
        }
        return connectionsManager.sendRequest(tL_payments_getPremiumGiftCodeOptions, new ProfileActivity$$ExternalSyntheticLambda75(chat, i, callback, 8));
    }

    public static void payGiftCodeByGoogle(ArrayList arrayList, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.Chat chat, TLRPC.TL_textWithEntities tL_textWithEntities, BaseFragment baseFragment, Utilities.Callback callback, Utilities.Callback callback2) {
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = new TLRPC.TL_inputStorePaymentPremiumGiftCode();
        tL_inputStorePaymentPremiumGiftCode.users = new ArrayList<>();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLObject tLObject = (TLObject) obj;
            if (tLObject instanceof TLRPC.User) {
                tL_inputStorePaymentPremiumGiftCode.users.add(messagesController.getInputUser((TLRPC.User) tLObject));
            }
        }
        if (chat != null) {
            tL_inputStorePaymentPremiumGiftCode.flags = 1;
            tL_inputStorePaymentPremiumGiftCode.boost_peer = messagesController.getInputPeer(-chat.id);
        }
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputStorePaymentPremiumGiftCode.flags |= 2;
            tL_inputStorePaymentPremiumGiftCode.message = tL_textWithEntities;
        }
        AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
        accountIdentifiers.zzb = "inapp";
        accountIdentifiers.zza = tL_premiumGiftCodeOption.store_product;
        BillingController.getInstance().queryProductDetails(Arrays.asList(accountIdentifiers.build()), new PassportActivity$3$$ExternalSyntheticLambda3(tL_inputStorePaymentPremiumGiftCode, tL_premiumGiftCodeOption, connectionsManager, callback2, callback, baseFragment, 3));
    }

    public static void payGiftCodeByInvoice(ArrayList arrayList, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.Chat chat, TLRPC.TL_textWithEntities tL_textWithEntities, BaseFragment baseFragment, Utilities.Callback callback, Utilities.Callback callback2) {
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
        TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = new TLRPC.TL_inputStorePaymentPremiumGiftCode();
        tL_inputStorePaymentPremiumGiftCode.users = new ArrayList<>();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLObject tLObject = (TLObject) obj;
            if (tLObject instanceof TLRPC.User) {
                tL_inputStorePaymentPremiumGiftCode.users.add(messagesController.getInputUser((TLRPC.User) tLObject));
            }
        }
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputStorePaymentPremiumGiftCode.flags |= 2;
            tL_inputStorePaymentPremiumGiftCode.message = tL_textWithEntities;
        }
        if (chat != null) {
            tL_inputStorePaymentPremiumGiftCode.flags |= 1;
            tL_inputStorePaymentPremiumGiftCode.boost_peer = messagesController.getInputPeer(-chat.id);
        }
        tL_inputStorePaymentPremiumGiftCode.currency = tL_premiumGiftCodeOption.currency;
        tL_inputStorePaymentPremiumGiftCode.amount = tL_premiumGiftCodeOption.amount;
        tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiftCode;
        tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption;
        JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(baseFragment.getResourceProvider(), false);
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
        connectionsManager.sendRequest(tL_payments_getPaymentForm, new ChatActivity$$ExternalSyntheticLambda206(callback2, messagesController, tL_inputInvoicePremiumGiftCode, baseFragment, callback, 6));
    }
}
