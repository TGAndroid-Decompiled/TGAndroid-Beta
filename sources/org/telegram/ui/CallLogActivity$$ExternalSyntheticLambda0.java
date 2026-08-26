package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class CallLogActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final CallLogActivity f$0;
    public final AlertDialog f$1;
    public final TLObject f$2;
    public final HashSet f$3;
    public final TLRPC.TL_inputGroupCallInviteMessage f$4;
    public final boolean f$5;
    public final TLRPC.TL_error f$6;

    public CallLogActivity$$ExternalSyntheticLambda0(CallLogActivity callLogActivity, AlertDialog alertDialog, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = callLogActivity;
        this.f$1 = alertDialog;
        this.f$2 = tLObject;
        this.f$3 = hashSet;
        this.f$4 = tL_inputGroupCallInviteMessage;
        this.f$5 = z;
        this.f$6 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onCallClick$5(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                break;
            default:
                this.f$0.lambda$onClick$10(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                break;
        }
    }
}
