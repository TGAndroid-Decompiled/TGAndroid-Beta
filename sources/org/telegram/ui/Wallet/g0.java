package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class g0 implements AutoCloseable {
    public TL_wallet.sendTransfer f34527a;
    public i0 f34528b;
    public byte[] f34529c;

    @Override
    public final void close() {
        i0 i0Var = this.f34528b;
        if (i0Var != null) {
            i0Var.close();
        }
    }
}
