package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class g0 implements AutoCloseable {
    public TL_wallet.sendTransfer f34777a;
    public i0 f34778b;
    public byte[] f34779c;

    @Override
    public final void close() {
        i0 i0Var = this.f34778b;
        if (i0Var != null) {
            i0Var.close();
        }
    }
}
