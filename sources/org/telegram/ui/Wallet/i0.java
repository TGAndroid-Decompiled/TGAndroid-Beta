package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class i0 implements AutoCloseable {
    public TL_wallet.sendTransfer f42605a;
    public k0 f42606b;
    public byte[] f42607c;

    @Override
    public final void close() {
        k0 k0Var = this.f42606b;
        if (k0Var != null) {
            k0Var.close();
        }
    }
}
