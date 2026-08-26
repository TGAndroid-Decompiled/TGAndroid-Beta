package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class LoginActivity$$ExternalSyntheticLambda27 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public LoginActivity$$ExternalSyntheticLambda27(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((LoginActivity) this.f$0).lambda$tryResetAccount$32((String) this.f$1, (String) this.f$2, (String) this.f$3, tLObject, tL_error);
                break;
            case 1:
                ((ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass3) this.f$0).lambda$needOpenInviteLink$2((TLRPC.TL_chatInviteExported) this.f$1, (boolean[]) this.f$2, (AlertDialog) this.f$3, tLObject, tL_error);
                break;
            case 2:
                ((PassportActivity) this.f$0).lambda$startPhoneVerification$66((String) this.f$1, (PassportActivity.PassportActivityDelegate) this.f$2, (TL_account.sendVerifyPhoneCode) this.f$3, tLObject, tL_error);
                break;
            case 3:
                ((PassportActivity.AnonymousClass3) this.f$0).lambda$onItemClick$6((PhotoViewer$$ExternalSyntheticLambda60) this.f$1, (PassportActivity.AnonymousClass3.AnonymousClass2) this.f$2, (TL_account.verifyEmail) this.f$3, tLObject, tL_error);
                break;
            case 4:
                ((ChatLinkActivity) this.f$0).lambda$linkChat$13((AlertDialog[]) this.f$1, (TLRPC.Chat) this.f$2, (BaseFragment) this.f$3, tLObject, tL_error);
                break;
            case 5:
                ((ChatRightsEditActivity) this.f$0).lambda$initTransfer$20((TLRPC.InputCheckPasswordSRP) this.f$1, (TwoStepVerificationActivity) this.f$2, (TLRPC.TL_channels_editCreator) this.f$3, tLObject, tL_error);
                break;
            case 6:
                ((PrivacyControlActivity) this.f$0).lambda$applyCurrentPrivacySettings$17((boolean[]) this.f$1, (TLRPC.GlobalPrivacySettings) this.f$2, (TL_account.setGlobalPrivacySettings) this.f$3, tLObject, tL_error);
                break;
            default:
                ((ReportBottomSheet) this.f$0).lambda$submitOption$4((CharSequence) this.f$2, (byte[]) this.f$3, (String) this.f$1, tLObject, tL_error);
                break;
        }
    }

    public LoginActivity$$ExternalSyntheticLambda27(ReportBottomSheet reportBottomSheet, CharSequence charSequence, byte[] bArr, String str) {
        this.$r8$classId = 7;
        this.f$0 = reportBottomSheet;
        this.f$2 = charSequence;
        this.f$3 = bArr;
        this.f$1 = str;
    }
}
