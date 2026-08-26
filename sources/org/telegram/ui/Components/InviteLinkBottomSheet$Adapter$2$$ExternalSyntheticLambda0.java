package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class InviteLinkBottomSheet$Adapter$2$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final InviteLinkBottomSheet.Adapter.AnonymousClass2 f$0;

    public InviteLinkBottomSheet$Adapter$2$$ExternalSyntheticLambda0(InviteLinkBottomSheet.Adapter.AnonymousClass2 anonymousClass2, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                InviteLinkBottomSheet.Adapter.AnonymousClass2 anonymousClass2 = this.f$0;
                anonymousClass2.getClass();
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(anonymousClass2, tL_error, tLObject, 12));
                break;
            default:
                InviteLinkBottomSheet.Adapter.AnonymousClass2 anonymousClass3 = this.f$0;
                anonymousClass3.getClass();
                AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(4, anonymousClass3, tL_error));
                break;
        }
    }
}
