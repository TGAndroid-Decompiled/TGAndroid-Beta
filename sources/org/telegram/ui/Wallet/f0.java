package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class f0 implements AutoCloseable {
    public TL_wallet.sendTransfer f42507a;
    public h0 f42508b;
    public byte[] f42509c;

    @Override
    public final void close() {
        h0 h0Var = this.f42508b;
        if (h0Var != null) {
            h0Var.close();
        }
    }
}
