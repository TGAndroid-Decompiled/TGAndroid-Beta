package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i30 {
    public final TLObject f34543a;
    public TLRPC.User f34544b;
    public final int f34545c;
    public final boolean d;
    public boolean f34546e;

    public i30(int i7, TLObject tLObject) {
        boolean z9;
        this.f34543a = tLObject;
        this.f34545c = i7;
        if ((tLObject instanceof TLRPC.User) && ((TLRPC.User) tLObject).self) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
    }
}
