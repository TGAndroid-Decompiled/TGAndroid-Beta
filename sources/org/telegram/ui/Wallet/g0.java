package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class g0 implements AutoCloseable {
    public TL_wallet.sendTransfer f36609a;
    public i0 f36610b;
    public byte[] f36611c;

    @Override
    public final void close() {
        i0 i0Var = this.f36610b;
        if (i0Var != null) {
            i0Var.close();
        }
    }
}
