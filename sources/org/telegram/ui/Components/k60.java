package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k60 implements RequestDelegate {
    public final int f26171a;
    public final m60 f26172b;

    public k60(m60 m60Var, int i10) {
        this.f26171a = i10;
        this.f26172b = m60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26171a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hp((Object) this.f26172b, (Object) tL_error, tLObject, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new il(28, this.f26172b, tL_error));
                return;
        }
    }
}
