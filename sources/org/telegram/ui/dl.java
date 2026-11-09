package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class dl extends pq0 {
    public final cn f45051a;

    public dl(cn cnVar) {
        this.f45051a = cnVar;
    }

    @Override
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return cn.P1(this.f45051a, ijVar, fileLocation, i7, z9, false);
    }

    @Override
    public final boolean L() {
        return true;
    }
}
