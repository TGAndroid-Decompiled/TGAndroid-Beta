package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cl extends oq0 {
    public final bn f46591a;

    public cl(bn bnVar) {
        this.f46591a = bnVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return bn.P1(this.f46591a, gjVar, fileLocation, i7, z10, false);
    }

    @Override
    public final boolean L() {
        return true;
    }
}
