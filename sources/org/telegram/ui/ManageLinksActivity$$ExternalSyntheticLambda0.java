package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ManageLinksActivity$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final ManageLinksActivity f$0;

    public ManageLinksActivity$$ExternalSyntheticLambda0(ManageLinksActivity manageLinksActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = manageLinksActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ManageLinksActivity manageLinksActivity = this.f$0;
                manageLinksActivity.getClass();
                AndroidUtilities.runOnUIThread(new ManageLinksActivity$$ExternalSyntheticLambda7(manageLinksActivity, tL_error, tLObject, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(18, this.f$0, tL_error));
                break;
        }
    }
}
