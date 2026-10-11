package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class g0 implements AutoCloseable {
    public TL_wallet.sendTransfer f35002a;
    public i0 f35003b;
    public byte[] f35004c;

    @Override
    public final void close() {
        i0 i0Var = this.f35003b;
        if (i0Var != null) {
            i0Var.close();
        }
    }
}
