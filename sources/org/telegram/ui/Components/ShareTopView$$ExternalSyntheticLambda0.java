package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class ShareTopView$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public ShareTopView$$ExternalSyntheticLambda0(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((ShareTopView) this.f$0).lambda$requestLinkPreview$2(this.f$1, (String) this.f$2, tLObject, tL_error);
                break;
            case 1:
                FolderBottomSheet.lambda$showForDeletion$1((BaseFragment) this.f$0, this.f$1, (Utilities.Callback) this.f$2, tLObject, tL_error);
                break;
            default:
                ((HashtagsSearchAdapter) this.f$0).lambda$search$2(this.f$1, (String) this.f$2, tLObject, tL_error);
                break;
        }
    }
}
