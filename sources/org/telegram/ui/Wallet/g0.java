package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class g0 implements AutoCloseable {
    public TL_wallet.sendTransfer f43855a;
    public i0 f43856b;
    public byte[] f43857c;

    @Override
    public final void close() {
        i0 i0Var = this.f43856b;
        if (i0Var != null) {
            i0Var.close();
        }
    }
}
