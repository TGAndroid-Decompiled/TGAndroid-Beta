package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class h0 implements AutoCloseable {
    public TL_wallet.sendTransfer f34272a;
    public j0 f34273b;
    public byte[] f34274c;

    @Override
    public final void close() {
        j0 j0Var = this.f34273b;
        if (j0Var != null) {
            j0Var.close();
        }
    }
}
