package org.telegram.ui;

import android.os.Bundle;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.TextCheckCell;

public final class LinkManager$$ExternalSyntheticLambda15 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public LinkManager$$ExternalSyntheticLambda15(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager) this.f$0).lambda$handleSettings$11((String) this.f$1, tLObject, tL_error);
                break;
            case 1:
                ((LoginActivity) this.f$0).lambda$resendCodeFromSafetyNet$21((Bundle) this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((LoginActivity.LoginActivityRecoverView) this.f$0).lambda$onNextPressed$8((String) this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((LoginActivity.LoginActivitySmsView) this.f$0).lambda$onNextPressed$29((TL_account.confirmPhone) this.f$1, tLObject, tL_error);
                break;
            case 4:
                ((LoginActivity.PhoneView) this.f$0).lambda$new$13((HashMap) this.f$1, tLObject, tL_error);
                break;
            case 5:
                ((LoginActivity.PhoneView) this.f$0).lambda$onNextPressed$21((String) this.f$1, tLObject, tL_error);
                break;
            case 6:
                ((NewContactBottomSheet) this.f$0).lambda$updatedPhone$20((OAuthSheet$$ExternalSyntheticLambda1) this.f$1, tLObject, tL_error);
                break;
            case 7:
                ((PassportActivity.PhoneConfirmationView) this.f$0).lambda$onNextPressed$7((TL_account.verifyPhone) this.f$1, tLObject, tL_error);
                break;
            case 8:
                ((PaymentFormActivity) this.f$0).lambda$sendForm$55((TLObject) this.f$1, tLObject, tL_error);
                break;
            case 9:
                ((PaymentFormActivity) this.f$0).lambda$sendData$69((TLRPC.TL_payments_sendPaymentForm) this.f$1, tLObject, tL_error);
                break;
            case 10:
                ((PaymentFormActivity) this.f$0).lambda$checkPassword$71((TL_account.getTmpPassword) this.f$1, tLObject, tL_error);
                break;
            case 11:
                ((PostSuggestionsEditActivity) this.f$0).lambda$processDone$3((TL_stars.updatePaidMessagesPrice) this.f$1, tLObject, tL_error);
                break;
            case 12:
                ((PrivacyControlActivity) this.f$0).lambda$applyCurrentPrivacySettings$15((boolean[]) this.f$1, tLObject, tL_error);
                break;
            case 13:
                ((PrivacySettingsActivity) this.f$0).lambda$createView$12((TextCheckCell) this.f$1, tLObject, tL_error);
                break;
            case 14:
                ((ProfileActivity) this.f$0).lambda$didUploadPhoto$112((String) this.f$1, tLObject, tL_error);
                break;
            case 15:
                ((ProfileActivity) this.f$0).lambda$processOnClickOrPress$70((TLRPC.TL_username) this.f$1, tLObject, tL_error);
                break;
            case 16:
                ((ProfileActivity) this.f$0).lambda$createView$28((int[]) this.f$1, tLObject, tL_error);
                break;
            case 17:
                ((SettingsActivity) this.f$0).lambda$didUploadPhoto$23((String) this.f$1, tLObject, tL_error);
                break;
            case 18:
                ((SettingsActivity) this.f$0).lambda$onClick$14((TLRPC.TL_attachMenuBot) this.f$1, tLObject, tL_error);
                break;
            case 19:
                ((StatisticActivity.ChartViewData) this.f$0).lambda$load$1((Utilities.Callback0Return) this.f$1, tLObject, tL_error);
                break;
            case 20:
                ((ThemeSetUrlActivity) this.f$0).lambda$checkUrl$7((String) this.f$1, tLObject, tL_error);
                break;
            case 21:
                ((ThemeSetUrlActivity) this.f$0).lambda$saveTheme$12((TL_account.updateTheme) this.f$1, tLObject, tL_error);
                break;
            case 22:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$processNext$27((byte[]) this.f$1, tLObject, tL_error);
                break;
            default:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$processNext$31((String) this.f$1, tLObject, tL_error);
                break;
        }
    }
}
