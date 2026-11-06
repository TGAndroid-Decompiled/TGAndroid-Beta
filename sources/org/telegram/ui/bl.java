package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bl extends mq0 {
    public final an f44404a;

    public bl(an anVar) {
        this.f44404a = anVar;
    }

    @Override
    public final vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return an.O1(this.f44404a, ijVar, fileLocation, i7, z9, false);
    }

    @Override
    public final boolean L() {
        return true;
    }
}
