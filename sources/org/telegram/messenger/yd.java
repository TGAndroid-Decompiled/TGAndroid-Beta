package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yd implements RequestDelegate {
    public final int f22243a;
    public final long f22244b;
    public final int f22245c;
    public final Object d;

    public yd(BaseController baseController, long j10, int i9, int i10) {
        this.f22243a = i10;
        this.d = baseController;
        this.f22244b = j10;
        this.f22245c = i9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22243a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.f22244b, this.f22245c, tLObject, tL_error);
                return;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.f22244b, this.f22245c, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new gh.c9((org.telegram.ui.l4) this.d, tLObject, this.f22245c, this.f22244b, 12));
                return;
        }
    }

    public yd(org.telegram.ui.l4 l4Var, int i9, long j10) {
        this.f22243a = 2;
        this.d = l4Var;
        this.f22245c = i9;
        this.f22244b = j10;
    }
}
