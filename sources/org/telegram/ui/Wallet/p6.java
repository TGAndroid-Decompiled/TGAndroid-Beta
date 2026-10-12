package org.telegram.ui.Wallet;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cp0;
public final class p6 implements Runnable {
    public final int f33606a;
    public final Object f33607b;
    public final Object f33608c;
    public final Object d;
    public final Object e;
    public final Object f33609f;

    public p6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f33606a = i10;
        this.f33607b = obj;
        this.f33608c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f33609f = obj5;
    }

    @Override
    public final void run() {
        long j10;
        long j11;
        int i10;
        int i11;
        int i12 = this.f33606a;
        cp0 cp0Var = 0;
        SQLiteCursor sQLiteCursor = null;
        cp0 cp0Var2 = null;
        r5 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        cp0 cp0Var3 = null;
        Object obj = this.f33609f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f33608c;
        Object obj5 = this.f33607b;
        int i13 = 0;
        switch (i12) {
            case 0:
                ((WalletEngine2) obj5).lambda$prepareSend$49((Utilities.Callback3) obj4, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error != null) {
                    callback.run(tL_error);
                    return;
                } else if (tLObject instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject;
                    messagesController.putUsers(tL_premium_myBoosts.users, false);
                    messagesController.putChats(tL_premium_myBoosts.chats, false);
                    callback2.run(tL_premium_myBoosts);
                    return;
                } else {
                    return;
                }
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                org.telegram.messenger.x xVar = (org.telegram.messenger.x) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                MessagesController messagesController2 = (MessagesController) obj2;
                org.telegram.messenger.j2 j2Var = (org.telegram.messenger.j2) obj;
                if (tL_error2 != null) {
                    xVar.run(tL_error2);
                    return;
                } else if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject2;
                    messagesController2.putUsers(tL_premium_myBoosts2.users, false);
                    messagesController2.putChats(tL_premium_myBoosts2.chats, false);
                    j2Var.run(tL_premium_myBoosts2);
                    return;
                } else {
                    return;
                }
            case 3:
                TLObject tLObject3 = (TLObject) obj5;
                MessagesController messagesController3 = (MessagesController) obj4;
                bi.u3 u3Var = (bi.u3) obj3;
                ug.g gVar = (ug.g) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject3;
                    messagesController3.putChats(tL_payments_checkedGiftCode.chats, false);
                    messagesController3.putUsers(tL_payments_checkedGiftCode.users, false);
                    u3Var.run(tL_payments_checkedGiftCode);
                }
                gVar.run(tL_error3);
                return;
            case 4:
                ug.m1.S((ug.m1) obj5, (TLObject) obj4, (TLRPC.UserFull) obj3, (TL_account.TL_birthday) obj2, (TLRPC.TL_error) obj);
                return;
            case 5:
                yh.x4 x4Var = (yh.x4) obj5;
                TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = (TLRPC.TL_inputStorePaymentGiftPremium) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                int i14 = x4Var.Y;
                org.telegram.ui.ActionBar.m2 m2Var = x4Var.f24345n;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = m2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(i14);
                    qf.b bVar = new qf.b(9);
                    bVar.e0(x4Var.f49204e0.h);
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentGiftPremium, Collections.singletonList(bVar.w()));
                    return;
                } else if (tL_error4 != null) {
                    org.telegram.ui.Components.g5.e0(i14, tL_error4, m2Var, tL_payments_canPurchaseStore, new Object[0]);
                    return;
                } else {
                    return;
                }
            case 6:
                zh.z zVar = (zh.z) obj5;
                pf.c cVar = (pf.c) obj4;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj;
                zh.a1 a1Var = zVar.f51358q0;
                if (a1Var != null) {
                    a1Var.run();
                }
                cVar.c(false);
                a2Var.dismiss();
                zVar.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates != null) {
                        sc M = zc.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, zVar.Z, DialogObject.getShortName(zVar.f51343a0))), R.raw.forward);
                        M.f29112t = true;
                        M.j();
                        return;
                    }
                    zc.a0(U).f0(tL_error5, false);
                    return;
                }
                return;
            case 7:
                zh.n5 n5Var = (zh.n5) obj5;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj4;
                rh.s sVar = (rh.s) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) obj;
                if (tL_error6 != null) {
                    sVar.run(Boolean.FALSE, tL_error6.text);
                    return;
                }
                if (tLObject4 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject4;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(n5Var.f50864a).putUsers(paymentForm.users, false);
                    cp0Var = new cp0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    cp0Var = new cp0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (cp0Var != 0) {
                    cp0Var.Z0 = new zh.x3(sVar, 1);
                    org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                    if (R != 0) {
                        if (AndroidUtilities.hasDialogOnTop(R)) {
                            ?? obj6 = new Object();
                            obj6.f20469a = true;
                            R.showAsSheet(cp0Var, obj6);
                            return;
                        }
                        R.presentFragment(cp0Var);
                        return;
                    }
                    return;
                }
                sVar.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            case 8:
                zh.n5 n5Var2 = (zh.n5) obj5;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj4;
                d90 d90Var = (d90) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) obj;
                if (tL_error7 != null) {
                    d90Var.run(Boolean.FALSE, tL_error7.text);
                    return;
                }
                if (tLObject5 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject5;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(n5Var2.f50864a).putUsers(paymentForm2.users, false);
                    cp0Var3 = new cp0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject5 instanceof TLRPC.PaymentReceipt) {
                    cp0Var3 = new cp0((TLRPC.PaymentReceipt) tLObject5);
                }
                if (cp0Var3 != null) {
                    cp0Var3.Z0 = new zh.x3(d90Var, 2);
                    org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                    if (R2 != 0) {
                        if (AndroidUtilities.hasDialogOnTop(R2)) {
                            ?? obj7 = new Object();
                            obj7.f20469a = true;
                            R2.showAsSheet(cp0Var3, obj7);
                            return;
                        }
                        R2.presentFragment(cp0Var3);
                        return;
                    }
                    return;
                }
                d90Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            case 9:
                ((boolean[]) obj4)[0] = true;
                ((zh.n5) obj5).Z((String) obj2, (TLRPC.ChatInvite) obj3, new ii.a((Utilities.Callback2) obj, 25));
                return;
            case 10:
                MessagesStorage messagesStorage = (MessagesStorage) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                ArrayList<TLRPC.Chat> arrayList2 = (ArrayList) obj3;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) obj2;
                rg.b0 b0Var = (rg.b0) obj;
                try {
                    try {
                        sQLiteCursor = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        int i15 = 0;
                        long j12 = 0;
                        while (sQLiteCursor.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                if (byteBufferValue != null) {
                                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    if (TLdeserialize != null) {
                                        arrayList.add(TLdeserialize);
                                    }
                                    byteBufferValue.reuse();
                                    i15 = (int) sQLiteCursor.longValue(1);
                                    j12 = sQLiteCursor.longValue(2);
                                }
                            } catch (Exception e) {
                                e = e;
                                i13 = i15;
                                j10 = j12;
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                j11 = j10;
                                i10 = i13;
                                AndroidUtilities.runOnUIThread(new fi.p3(b0Var, arrayList, i10, j11, arrayList3, arrayList2));
                                return;
                            }
                        }
                        ArrayList<Long> arrayList4 = new ArrayList<>();
                        ArrayList arrayList5 = new ArrayList();
                        int size = arrayList.size();
                        while (i13 < size) {
                            Object obj8 = arrayList.get(i13);
                            i13++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj8).released_by;
                            if (peer != null) {
                                i11 = size;
                                long peerDialogId = DialogObject.getPeerDialogId(peer);
                                int i16 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                                if (i16 > 0) {
                                    arrayList4.add(Long.valueOf(peerDialogId));
                                } else if (i16 < 0) {
                                    arrayList5.add(Long.valueOf(-peerDialogId));
                                }
                            } else {
                                i11 = size;
                            }
                            size = i11;
                        }
                        if (!arrayList5.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList5), arrayList2);
                        }
                        if (!arrayList4.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList4, arrayList3);
                        }
                        sQLiteCursor.dispose();
                        j11 = j12;
                        i10 = i15;
                    } catch (Throwable th2) {
                        if (0 != 0) {
                            cp0Var.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e7) {
                    e = e7;
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(new fi.p3(b0Var, arrayList, i10, j11, arrayList3, arrayList2));
                return;
            case 11:
                TLObject tLObject6 = (TLObject) obj3;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj2;
                Utilities.Callback callback3 = (Utilities.Callback) obj;
                int i17 = ((zh.n5) obj5).f50864a;
                ((org.telegram.ui.ActionBar.a2) obj4).dismiss();
                if (tLObject6 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject6;
                    MessagesController.getInstance(i17).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i17).putChats(tL_payments_savedStarGifts.chats, false);
                    while (i13 < tL_payments_savedStarGifts.gifts.size()) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i13);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        } else {
                            i13++;
                        }
                    }
                }
                callback3.run(savedStarGift);
                return;
            case 12:
                zh.n5 n5Var3 = (zh.n5) obj5;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                Utilities.Callback2 callback22 = (Utilities.Callback2) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) obj;
                if (tL_error8 != null) {
                    callback22.run(Boolean.FALSE, tL_error8.text);
                    return;
                }
                if (tLObject7 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject7;
                    paymentForm3.invoice.recurring = true;
                    MessagesController.getInstance(n5Var3.f50864a).putUsers(paymentForm3.users, false);
                    cp0Var2 = new cp0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject7 instanceof TLRPC.PaymentReceipt) {
                    cp0Var2 = new cp0((TLRPC.PaymentReceipt) tLObject7);
                }
                if (cp0Var2 != null) {
                    cp0Var2.Z0 = new zh.x3(callback22, 0);
                    org.telegram.ui.ActionBar.m2 R3 = LaunchActivity.R();
                    if (R3 != 0) {
                        if (AndroidUtilities.hasDialogOnTop(R3)) {
                            ?? obj9 = new Object();
                            obj9.f20469a = true;
                            R3.showAsSheet(cp0Var2, obj9);
                            return;
                        }
                        R3.presentFragment(cp0Var2);
                        return;
                    }
                    return;
                }
                callback22.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            default:
                List list = (List) obj5;
                Utilities.Callback2 callback23 = (Utilities.Callback2) obj4;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) obj3;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new zh.w3(2, callback23));
                    return;
                }
                c5.p pVar = (c5.p) list.get(0);
                c5.l a2 = pVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new zh.w3(3, callback23));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.f4393c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.f4392b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(pVar.f4404c, new di.c5(callback23, 6));
                BillingController.getInstance().setOnCanceled(new zh.w3(0, callback23));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController2 = BillingController.getInstance();
                AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                qf.b bVar2 = new qf.b(9);
                bVar2.e0((c5.p) list.get(0));
                billingController2.launchBillingFlow(activity, accountInstance2, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar2.w()));
                return;
        }
    }

    public p6(zh.n5 n5Var, boolean[] zArr, String str, TLRPC.ChatInvite chatInvite, Utilities.Callback2 callback2) {
        this.f33606a = 9;
        this.f33607b = n5Var;
        this.f33608c = zArr;
        this.e = str;
        this.d = chatInvite;
        this.f33609f = callback2;
    }
}
