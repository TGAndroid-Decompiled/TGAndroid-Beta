package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class f0 implements AutoCloseable {
    public TL_wallet.sendTransfer f34939a;
    public h0 f34940b;
    public byte[] f34941c;

    @Override
    public final void close() {
        h0 h0Var = this.f34940b;
        if (h0Var != null) {
            h0Var.close();
        }
    }
}
