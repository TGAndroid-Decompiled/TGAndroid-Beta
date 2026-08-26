package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessageAuthorView$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public MessageAuthorView$$ExternalSyntheticLambda1(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((MessageAuthorView) this.f$0).lambda$new$1(this.f$1, tLObject, tL_error);
                break;
            default:
                ((WallpapersListActivity.SearchAdapter) this.f$0).lambda$searchImages$4(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
