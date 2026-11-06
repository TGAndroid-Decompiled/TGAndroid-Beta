package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class i0 implements AutoCloseable {
    public TL_wallet.sendTransfer f42606a;
    public k0 f42607b;
    public byte[] f42608c;

    @Override
    public final void close() {
        k0 k0Var = this.f42607b;
        if (k0Var != null) {
            k0Var.close();
        }
    }
}
