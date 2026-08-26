package org.telegram.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import com.android.billingclient.api.BillingResult;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.ScrimOptions;

public final class ChatActivity$$ExternalSyntheticLambda53 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Serializable f$4;
    public final Object f$5;
    public final Object f$6;

    public ChatActivity$$ExternalSyntheticLambda53(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$4 = str;
        this.f$3 = obj3;
        this.f$5 = tLObject;
        this.f$6 = obj4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$didLongPressFormattedDate$418((ItemOptions) this.f$1, (MessageObject) this.f$2, (ChatMessageCell) this.f$3, (String) this.f$4, (TLRPC.TL_messageEntityFormattedDate) this.f$5, (ScrimOptions) this.f$6);
                break;
            case 1:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressOther$3((AlertDialog) this.f$1, (TLObject) this.f$3, (HashSet) this.f$4, (TLRPC.TL_inputGroupCallInviteMessage) this.f$5, (MessageObject) this.f$2, (TLRPC.TL_error) this.f$6);
                break;
            case 2:
                ((LoginActivity.PhoneView) this.f$0).lambda$onNextPressed$22((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (Bundle) this.f$3, (String) this.f$4, (LoginActivity.PhoneInputData) this.f$5, (TLObject) this.f$6);
                break;
            case 3:
                ((PassportActivity.AnonymousClass20.AnonymousClass1) this.f$0).lambda$run$1((TLObject) this.f$1, (String) this.f$4, (TLRPC.TL_secureRequiredType) this.f$2, (PassportActivity.PassportActivityDelegate) this.f$3, (TLRPC.TL_error) this.f$5, (PassportActivity.ErrorRunnable) this.f$6);
                break;
            case 4:
                ((ChatActivity) this.f$0).lambda$didLongPressUsername$435((TLRPC.TL_error) this.f$1, (TLObject) this.f$2, (TLObject) this.f$3, (Utilities.Callback2) this.f$5, (String) this.f$4, (Browser.Progress) this.f$6);
                break;
            case 5:
                ((LaunchActivity) this.f$0).lambda$handleIntent$11((AlertDialog) this.f$1, (TLRPC.TL_error) this.f$2, (String) this.f$4, (Bundle) this.f$3, (TLObject) this.f$5, (TL_account.sendConfirmPhoneCode) this.f$6);
                break;
            default:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$23((BillingResult) this.f$1, (List) this.f$2, (String) this.f$4, (TLRPC.TL_inputStorePaymentAuthCode) this.f$3, (TLRPC.TL_payments_canPurchaseStore) this.f$5, (Runnable) this.f$6);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda53(String str, TLObject tLObject, TLRPC.TL_error tL_error, TLRPC.TL_secureRequiredType tL_secureRequiredType, PassportActivity.AnonymousClass20.AnonymousClass1 anonymousClass1, PassportActivity.ErrorRunnable errorRunnable, PassportActivity.PassportActivityDelegate passportActivityDelegate) {
        this.$r8$classId = 3;
        this.f$0 = anonymousClass1;
        this.f$1 = tLObject;
        this.f$4 = str;
        this.f$2 = tL_secureRequiredType;
        this.f$3 = passportActivityDelegate;
        this.f$5 = tL_error;
        this.f$6 = errorRunnable;
    }

    public ChatActivity$$ExternalSyntheticLambda53(HashSet hashSet, MessageObject messageObject, TLObject tLObject, TLRPC.TL_error tL_error, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, AlertDialog alertDialog, ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate) {
        this.$r8$classId = 1;
        this.f$0 = chatMessageCellDelegate;
        this.f$1 = alertDialog;
        this.f$3 = tLObject;
        this.f$4 = hashSet;
        this.f$5 = tL_inputGroupCallInviteMessage;
        this.f$2 = messageObject;
        this.f$6 = tL_error;
    }

    public ChatActivity$$ExternalSyntheticLambda53(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = str;
        this.f$5 = obj4;
        this.f$6 = obj5;
    }

    public ChatActivity$$ExternalSyntheticLambda53(ChatActivity chatActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, Utilities.Callback2 callback2, String str, Browser.Progress progress) {
        this.$r8$classId = 4;
        this.f$0 = chatActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = tLObject2;
        this.f$5 = callback2;
        this.f$4 = str;
        this.f$6 = progress;
    }
}
