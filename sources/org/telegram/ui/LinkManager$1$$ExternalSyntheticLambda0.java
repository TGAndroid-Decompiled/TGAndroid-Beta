package org.telegram.ui;

import java.io.Serializable;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;

public final class LinkManager$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;
    public final Object f$3;
    public final Object f$4;

    public LinkManager$1$$ExternalSyntheticLambda0(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$4 = tL_error;
        this.f$1 = tLObject;
        this.f$3 = obj2;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager.AnonymousClass1) this.f$0).lambda$onCallUsersSelected$2((TLObject) this.f$1, this.f$2, (HashSet) this.f$3, (TLRPC.TL_error) this.f$4);
                break;
            case 1:
                ((DialogsActivity.AnonymousClass50) this.f$0).lambda$didUploadPhoto$0((TLRPC.TL_error) this.f$4, (TLObject) this.f$1, (String) this.f$3, this.f$2);
                break;
            case 2:
                ((ChannelMonetizationLayout) this.f$0).lambda$initWithdraw$21((TLRPC.TL_error) this.f$4, (TLObject) this.f$1, (TwoStepVerificationActivity) this.f$3, this.f$2);
                break;
            case 3:
                ((ChatActivity) this.f$0).lambda$didLongPressUsername$432((Browser.Progress) this.f$3, (TLObject) this.f$1, (Utilities.Callback2) this.f$4, this.f$2);
                break;
            case 4:
                ((ChatActivity) this.f$0).lambda$showRequestUrlAlert$385((TLObject) this.f$1, (String) this.f$3, (TLRPC.TL_messages_requestUrlAuth) this.f$4, this.f$2);
                break;
            case 5:
                ((PaymentFormActivity) this.f$0).lambda$sendSavePassword$48(this.f$2, (String) this.f$1, (String) this.f$3, (TL_account.updatePasswordSettings) this.f$4);
                break;
            case 6:
                ((PaymentFormActivity) this.f$0).lambda$sendSavePassword$46((TLRPC.TL_error) this.f$4, this.f$2, (TLObject) this.f$1, (String) this.f$3);
                break;
            default:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$setNewPassword$50((TLObject) this.f$1, this.f$2, (String) this.f$3, (TL_account.passwordInputSettings) this.f$4);
                break;
        }
    }

    public LinkManager$1$$ExternalSyntheticLambda0(String str, TLObject tLObject, TLRPC.TL_error tL_error, PaymentFormActivity paymentFormActivity, boolean z) {
        this.$r8$classId = 6;
        this.f$0 = paymentFormActivity;
        this.f$4 = tL_error;
        this.f$2 = z;
        this.f$1 = tLObject;
        this.f$3 = str;
    }

    public LinkManager$1$$ExternalSyntheticLambda0(TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, ChatActivity chatActivity, String str, boolean z) {
        this.$r8$classId = 4;
        this.f$0 = chatActivity;
        this.f$1 = tLObject;
        this.f$3 = str;
        this.f$4 = tL_messages_requestUrlAuth;
        this.f$2 = z;
    }

    public LinkManager$1$$ExternalSyntheticLambda0(BaseFragment baseFragment, TLObject tLObject, boolean z, Serializable serializable, TLObject tLObject2, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
        this.f$1 = tLObject;
        this.f$2 = z;
        this.f$3 = serializable;
        this.f$4 = tLObject2;
    }

    public LinkManager$1$$ExternalSyntheticLambda0(ChatActivity chatActivity, Browser.Progress progress, TLObject tLObject, Utilities.Callback2 callback2, boolean z) {
        this.$r8$classId = 3;
        this.f$0 = chatActivity;
        this.f$3 = progress;
        this.f$1 = tLObject;
        this.f$4 = callback2;
        this.f$2 = z;
    }

    public LinkManager$1$$ExternalSyntheticLambda0(PaymentFormActivity paymentFormActivity, boolean z, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.$r8$classId = 5;
        this.f$0 = paymentFormActivity;
        this.f$2 = z;
        this.f$1 = str;
        this.f$3 = str2;
        this.f$4 = updatepasswordsettings;
    }
}
