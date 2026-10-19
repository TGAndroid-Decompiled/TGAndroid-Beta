package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class h0 implements AutoCloseable {
    public TL_wallet.sendTransfer f34265a;
    public j0 f34266b;
    public byte[] f34267c;

    @Override
    public final void close() {
        j0 j0Var = this.f34266b;
        if (j0Var != null) {
            j0Var.close();
        }
    }
}
