package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.ShareAlert;

public final class ProfileActivity$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ProfileActivity$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$68((TLRPC.TL_username) this.f$1, (ShareAlert) this.f$2, tLObject, tL_error);
                break;
            case 1:
                ((NewContactBottomSheet) this.f$0).lambda$done$23((TLRPC.TL_inputPhoneContact) this.f$1, (TLRPC.TL_contacts_importContacts) this.f$2, tLObject, tL_error);
                break;
            case 2:
                ((PassportActivity.PhoneConfirmationView) this.f$0).lambda$resendCode$3((Bundle) this.f$1, (TLRPC.TL_auth_resendCode) this.f$2, tLObject, tL_error);
                break;
            case 3:
                ((PaymentFormActivity) this.f$0).lambda$sendSavedForm$51((Runnable) this.f$1, (TLObject) this.f$2, tLObject, tL_error);
                break;
            case 4:
                ((PaymentFormActivity) this.f$0).lambda$checkPassword$74((String) this.f$1, (TL_account.getPassword) this.f$2, tLObject, tL_error);
                break;
            case 5:
                ((PrivacySettingsActivity) this.f$0).lambda$createView$5((AlertDialog) this.f$1, (TL_account.setAccountTTL) this.f$2, tLObject, tL_error);
                break;
            case 6:
                ((ProfileActivity) this.f$0).lambda$editRow$142((TLRPC.UserFull) this.f$1, (TL_account.TL_birthday) this.f$2, tLObject, tL_error);
                break;
            case 7:
                ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$72((String) this.f$1, (TLRPC.User) this.f$2, tLObject, tL_error);
                break;
            case 8:
                ((SelectChatUserSheet) this.f$0).lambda$initTransfer$11((TwoStepVerificationActivity) this.f$1, (TLRPC.User) this.f$2, tLObject, tL_error);
                break;
            case 9:
                ((SessionsActivity) this.f$0).lambda$createView$16((AlertDialog) this.f$1, (TLRPC.TL_authorization) this.f$2, tLObject, tL_error);
                break;
            case 10:
                ((SessionsActivity) this.f$0).lambda$createView$18((AlertDialog) this.f$1, (TLRPC.TL_webAuthorization) this.f$2, tLObject, tL_error);
                break;
            case 11:
                ((StatisticActivity.ChartCell) this.f$0).lambda$onZoomed$1((String) this.f$1, (StatisticActivity.ZoomCancelable) this.f$2, tLObject, tL_error);
                break;
            default:
                ((TwoStepVerificationActivity) this.f$0).lambda$processDone$34((byte[]) this.f$1, (byte[]) this.f$2, tLObject, tL_error);
                break;
        }
    }
}
