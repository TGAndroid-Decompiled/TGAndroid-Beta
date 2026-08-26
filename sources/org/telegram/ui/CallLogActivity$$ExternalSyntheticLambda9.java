package org.telegram.ui;

import java.io.Serializable;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class CallLogActivity$$ExternalSyntheticLambda9 implements RequestDelegate {
    public final int $r8$classId;
    public final BaseFragment f$0;
    public final Object f$1;
    public final Serializable f$2;
    public final TLObject f$3;
    public final boolean f$4;

    public CallLogActivity$$ExternalSyntheticLambda9(CallLogActivity callLogActivity, AlertDialog alertDialog, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = callLogActivity;
        this.f$1 = alertDialog;
        this.f$2 = hashSet;
        this.f$3 = tL_inputGroupCallInviteMessage;
        this.f$4 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((CallLogActivity) this.f$0).lambda$onCallClick$6((AlertDialog) this.f$1, (HashSet) this.f$2, (TLRPC.TL_inputGroupCallInviteMessage) this.f$3, this.f$4, tLObject, tL_error);
                break;
            case 1:
                ((CallLogActivity) this.f$0).lambda$onClick$11((AlertDialog) this.f$1, (HashSet) this.f$2, (TLRPC.TL_inputGroupCallInviteMessage) this.f$3, this.f$4, tLObject, tL_error);
                break;
            default:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$setNewPassword$49(this.f$4, (byte[]) this.f$1, (String) this.f$2, (TL_account.passwordInputSettings) this.f$3, tLObject, tL_error);
                break;
        }
    }

    public CallLogActivity$$ExternalSyntheticLambda9(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, boolean z, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.$r8$classId = 2;
        this.f$0 = twoStepVerificationSetupActivity;
        this.f$4 = z;
        this.f$1 = bArr;
        this.f$2 = str;
        this.f$3 = passwordinputsettings;
    }
}
