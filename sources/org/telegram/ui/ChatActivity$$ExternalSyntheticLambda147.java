package org.telegram.ui;

import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import com.android.billingclient.api.Purchase;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.LinkSpanDrawable;

public final class ChatActivity$$ExternalSyntheticLambda147 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public ChatActivity$$ExternalSyntheticLambda147(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$didLongPressUsername$436((TLObject) this.f$1, (ChatActivity$$ExternalSyntheticLambda146) this.f$2, (String) this.f$3, (Browser.Progress) this.f$4, tLObject, tL_error);
                break;
            case 1:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressOther$4((AlertDialog) this.f$1, (HashSet) this.f$2, (TLRPC.TL_inputGroupCallInviteMessage) this.f$3, (MessageObject) this.f$4, tLObject, tL_error);
                break;
            case 2:
                ((LoginActivity.PhoneView) this.f$0).lambda$onNextPressed$23((Bundle) this.f$2, (String) this.f$3, (LoginActivity.PhoneInputData) this.f$4, (TLObject) this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((PassportActivity.AnonymousClass20.AnonymousClass1) this.f$0).lambda$run$2((String) this.f$3, (TLRPC.TL_secureRequiredType) this.f$1, (PassportActivity.PassportActivityDelegate) this.f$2, (PassportActivity.ErrorRunnable) this.f$4, tLObject, tL_error);
                break;
            case 4:
                CallLogActivity.lambda$showCallLinkSheet$29((String[]) this.f$0, (FrameLayout) this.f$1, (LinkSpanDrawable.LinksTextView) this.f$2, (BottomSheet) this.f$3, (Theme.ResourcesProvider) this.f$4, tLObject, tL_error);
                break;
            case 5:
                ((ChangeBioActivity) this.f$0).lambda$saveName$4((AlertDialog) this.f$1, (TLRPC.UserFull) this.f$2, (String) this.f$3, (TL_account.updateProfile) this.f$4, tLObject, tL_error);
                break;
            case 6:
                ((ChatActivity) this.f$0).lambda$didLongPressCard$425((Browser.Progress) this.f$4, (ChatMessageCell) this.f$1, (String) this.f$3, (CharacterStyle) this.f$2, tLObject, tL_error);
                break;
            case 7:
                ((LaunchActivity) this.f$0).lambda$handleIntent$12((AlertDialog) this.f$1, (String) this.f$3, (Bundle) this.f$2, (TL_account.sendConfirmPhoneCode) this.f$4, tLObject, tL_error);
                break;
            case 8:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$22((TLRPC.TL_inputStorePaymentAuthCode) this.f$1, (Purchase) this.f$2, (TLRPC.TL_payments_canPurchaseStore) this.f$3, (Runnable) this.f$4, tLObject, tL_error);
                break;
            default:
                ((SelectChatUserSheet) this.f$0).lambda$initTransfer$13((TLRPC.InputCheckPasswordSRP) this.f$1, (TLRPC.User) this.f$2, (TwoStepVerificationActivity) this.f$3, (TLRPC.TL_channels_editCreator) this.f$4, tLObject, tL_error);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda147(ChatActivity chatActivity, Browser.Progress progress, ChatMessageCell chatMessageCell, String str, CharacterStyle characterStyle) {
        this.$r8$classId = 6;
        this.f$0 = chatActivity;
        this.f$4 = progress;
        this.f$1 = chatMessageCell;
        this.f$3 = str;
        this.f$2 = characterStyle;
    }

    public ChatActivity$$ExternalSyntheticLambda147(LaunchActivity launchActivity, AlertDialog alertDialog, String str, Bundle bundle, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        this.$r8$classId = 7;
        this.f$0 = launchActivity;
        this.f$1 = alertDialog;
        this.f$3 = str;
        this.f$2 = bundle;
        this.f$4 = sendconfirmphonecode;
    }

    public ChatActivity$$ExternalSyntheticLambda147(LoginActivity.PhoneView phoneView, Bundle bundle, String str, LoginActivity.PhoneInputData phoneInputData, TLObject tLObject) {
        this.$r8$classId = 2;
        this.f$0 = phoneView;
        this.f$2 = bundle;
        this.f$3 = str;
        this.f$4 = phoneInputData;
        this.f$1 = tLObject;
    }

    public ChatActivity$$ExternalSyntheticLambda147(PassportActivity.AnonymousClass20.AnonymousClass1 anonymousClass1, String str, TLRPC.TL_secureRequiredType tL_secureRequiredType, PassportActivity.PassportActivityDelegate passportActivityDelegate, PassportActivity.ErrorRunnable errorRunnable) {
        this.$r8$classId = 3;
        this.f$0 = anonymousClass1;
        this.f$3 = str;
        this.f$1 = tL_secureRequiredType;
        this.f$2 = passportActivityDelegate;
        this.f$4 = errorRunnable;
    }
}
