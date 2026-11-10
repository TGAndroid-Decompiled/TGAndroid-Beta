package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class g0 implements AutoCloseable {
    public TL_wallet.sendTransfer f42517a;
    public i0 f42518b;
    public byte[] f42519c;

    @Override
    public final void close() {
        i0 i0Var = this.f42518b;
        if (i0Var != null) {
            i0Var.close();
        }
    }
}
