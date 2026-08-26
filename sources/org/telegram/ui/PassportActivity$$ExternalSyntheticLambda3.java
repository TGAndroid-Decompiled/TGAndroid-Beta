package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class PassportActivity$$ExternalSyntheticLambda3 implements RequestDelegate {
    public final int $r8$classId;

    public PassportActivity$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                PassportActivity.lambda$new$1(tLObject, tL_error);
                break;
            case 1:
                ChatEditTypeActivity.UsernamesListView.lambda$sendReorder$0(tLObject, tL_error);
                break;
            case 2:
                GroupCallActivity.AnonymousClass6.lambda$onItemClick$8(tLObject, tL_error);
                break;
            case 3:
                NotificationsSoundActivity.AnonymousClass1.lambda$deleteSelectedMessages$2(tLObject, tL_error);
                break;
            case 4:
                TopicCreateFragment.AnonymousClass1.lambda$onItemClick$2(tLObject, tL_error);
                break;
            case 5:
                TopicCreateFragment.AnonymousClass1.lambda$onItemClick$3(tLObject, tL_error);
                break;
            case 6:
                ArchiveSettingsActivity.lambda$onFragmentDestroy$2(tLObject, tL_error);
                break;
            case 7:
                ChangeNameActivity.lambda$saveName$3(tLObject, tL_error);
                break;
            case 8:
                ChangeUsernameActivity.lambda$sendReorder$2(tLObject, tL_error);
                break;
            case 9:
                ChatUsersActivity.lambda$processDone$30(tLObject, tL_error);
                break;
            case 10:
                FiltersSetupActivity.lambda$onFragmentDestroy$1(tLObject, tL_error);
                break;
            case 11:
                LoginActivity.LoginActivitySmsView.lambda$onBackPressed$43(tLObject, tL_error);
                break;
            case 12:
                NotificationsSettingsActivity.lambda$createView$7(tLObject, tL_error);
                break;
            case 13:
                PassportActivity.PhoneConfirmationView.lambda$onBackPressed$9(tLObject, tL_error);
                break;
            case 14:
                PaymentFormActivity.lambda$createView$26(tLObject, tL_error);
                break;
            case 15:
                PaymentFormActivity.lambda$sendForm$52(tLObject, tL_error);
                break;
            case 16:
                PremiumPreviewFragment.lambda$sentShowFeaturePreview$23(tLObject, tL_error);
                break;
            case 17:
                PremiumPreviewFragment.lambda$sentShowScreenStat$20(tLObject, tL_error);
                break;
            case 18:
                PremiumPreviewFragment.lambda$sentPremiumBuyCanceled$22(tLObject, tL_error);
                break;
            case 19:
                PremiumPreviewFragment.lambda$sentPremiumButtonClick$21(tLObject, tL_error);
                break;
            case 20:
                PrivacySettingsActivity.lambda$createView$16(tLObject, tL_error);
                break;
            case 21:
                PrivacySettingsActivity.lambda$onFragmentDestroy$2(tLObject, tL_error);
                break;
            case 22:
                PrivacySettingsActivity.lambda$onFragmentDestroy$3(tLObject, tL_error);
                break;
            case 23:
                ProfileActivity.lambda$createView$22(tLObject, tL_error);
                break;
            case 24:
                SessionBottomSheet.lambda$uploadSessionSettings$0(tLObject, tL_error);
                break;
            case 25:
                SessionsActivity.lambda$createView$1(tLObject, tL_error);
                break;
            case 26:
                TopicsNotifySettingsFragments.lambda$removeException$0(tLObject, tL_error);
                break;
            case 27:
                TwoStepVerificationActivity.lambda$checkSecretValues$28(tLObject, tL_error);
                break;
            default:
                TwoStepVerificationSetupActivity.lambda$createView$19(tLObject, tL_error);
                break;
        }
    }
}
