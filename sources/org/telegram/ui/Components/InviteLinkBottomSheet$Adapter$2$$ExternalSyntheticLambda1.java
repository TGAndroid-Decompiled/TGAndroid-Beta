package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class InviteLinkBottomSheet$Adapter$2$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final InviteLinkBottomSheet.Adapter.AnonymousClass2 f$0;

    public InviteLinkBottomSheet$Adapter$2$$ExternalSyntheticLambda1(InviteLinkBottomSheet.Adapter.AnonymousClass2 anonymousClass2, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$revokeLink$1(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$removeLink$3(tLObject, tL_error);
                break;
        }
    }
}
