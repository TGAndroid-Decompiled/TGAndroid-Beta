package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class CallLogActivity$$ExternalSyntheticLambda18 implements RequestDelegate {
    public final int $r8$classId;
    public final CallLogActivity f$0;
    public final AlertDialog f$1;
    public final HashSet f$2;
    public final TLRPC.TL_inputGroupCallInviteMessage f$3;
    public final boolean f$4;

    public CallLogActivity$$ExternalSyntheticLambda18(CallLogActivity callLogActivity, AlertDialog alertDialog, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = callLogActivity;
        this.f$1 = alertDialog;
        this.f$2 = hashSet;
        this.f$3 = tL_inputGroupCallInviteMessage;
        this.f$4 = z;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final CallLogActivity callLogActivity = this.f$0;
                callLogActivity.getClass();
                final AlertDialog alertDialog = this.f$1;
                final HashSet hashSet = this.f$2;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.f$3;
                final boolean z = this.f$4;
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                callLogActivity.lambda$onClick$10(alertDialog, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                                break;
                            default:
                                callLogActivity.lambda$onCallClick$5(alertDialog, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final CallLogActivity callLogActivity2 = this.f$0;
                final AlertDialog alertDialog2 = this.f$1;
                final HashSet hashSet2 = this.f$2;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.f$3;
                final boolean z2 = this.f$4;
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                callLogActivity2.lambda$onClick$10(alertDialog2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z2, tL_error);
                                break;
                            default:
                                callLogActivity2.lambda$onCallClick$5(alertDialog2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
