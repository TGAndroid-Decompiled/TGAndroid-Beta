package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class h0 implements AutoCloseable {
    public TL_wallet.sendTransfer f42576a;
    public j0 f42577b;
    public byte[] f42578c;

    @Override
    public final void close() {
        j0 j0Var = this.f42577b;
        if (j0Var != null) {
            j0Var.close();
        }
    }
}
