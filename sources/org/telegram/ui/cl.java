package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cl extends oq0 {
    public final bn f46588a;

    public cl(bn bnVar) {
        this.f46588a = bnVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return bn.P1(this.f46588a, fjVar, fileLocation, i7, z10, false);
    }

    @Override
    public final boolean L() {
        return true;
    }
}
