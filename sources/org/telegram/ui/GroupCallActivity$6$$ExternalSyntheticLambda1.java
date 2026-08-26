package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.JoinCallAlert;

public final class GroupCallActivity$6$$ExternalSyntheticLambda1 implements AlertDialog.OnButtonClickListener, JoinCallAlert.JoinCallAlertDelegate {
    public final GroupCallActivity.AnonymousClass6 f$0;

    public GroupCallActivity$6$$ExternalSyntheticLambda1(GroupCallActivity.AnonymousClass6 anonymousClass6) {
        this.f$0 = anonymousClass6;
    }

    @Override
    public void didSelectChat(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3) {
        this.f$0.lambda$onItemClick$9(inputPeer, z, z2, z3);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$onItemClick$1(alertDialog, i);
    }
}
