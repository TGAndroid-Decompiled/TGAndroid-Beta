package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class LinkManager$1$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;

    public LinkManager$1$$ExternalSyntheticLambda2(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager.AnonymousClass1) this.f$0).lambda$onCallUsersSelected$1((TLRPC.User) this.f$1, this.f$2, tLObject, tL_error);
                break;
            case 1:
                ((DialogsActivity.AnonymousClass50) this.f$0).lambda$didUploadPhoto$1((String) this.f$1, this.f$2, tLObject, tL_error);
                break;
            case 2:
                ((FilterChatlistActivity.ListAdapter.AnonymousClass1) this.f$0).lambda$revoke$1(this.f$2, (AlertDialog) this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((FilterCreateActivity.LinkCell) this.f$0).lambda$revoke$3(this.f$2, (AlertDialog) this.f$1, tLObject, tL_error);
                break;
            case 4:
                ((LinkManager.AnonymousClass1) this.f$0).lambda$onCallUsersSelected$3(this.f$2, (HashSet) this.f$1, tLObject, tL_error);
                break;
            case 5:
                ((ChannelMonetizationLayout) this.f$0).lambda$initWithdraw$22((TwoStepVerificationActivity) this.f$1, this.f$2, tLObject, tL_error);
                break;
            case 6:
                ((GroupCallActivity) this.f$0).lambda$getLink$56((TLRPC.ChatFull) this.f$1, this.f$2, tLObject, tL_error);
                break;
            case 7:
                ((ManageLinksActivity) this.f$0).lambda$loadLinks$5((TLRPC.TL_chatInviteExported) this.f$1, this.f$2, tLObject, tL_error);
                break;
            default:
                ((PaymentFormActivity) this.f$0).lambda$sendSavePassword$47(this.f$2, (String) this.f$1, tLObject, tL_error);
                break;
        }
    }

    public LinkManager$1$$ExternalSyntheticLambda2(Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = z;
        this.f$1 = obj2;
    }
}
