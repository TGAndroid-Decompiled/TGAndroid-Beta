package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bl extends mq0 {
    public final an f45783a;

    public bl(an anVar) {
        this.f45783a = anVar;
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return an.P1(this.f45783a, gjVar, fileLocation, i7, z10, false);
    }

    @Override
    public final boolean L() {
        return true;
    }
}
