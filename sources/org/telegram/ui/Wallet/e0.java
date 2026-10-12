package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class e0 implements AutoCloseable {
    public TL_wallet.sendTransfer f33111a;
    public g0 f33112b;
    public byte[] f33113c;

    @Override
    public final void close() {
        g0 g0Var = this.f33112b;
        if (g0Var != null) {
            g0Var.close();
        }
    }
}
