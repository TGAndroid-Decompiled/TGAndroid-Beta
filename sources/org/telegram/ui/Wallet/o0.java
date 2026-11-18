package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class o0 implements AutoCloseable {
    public TL_wallet.sendTransfer f44679a;
    public r0 f44680b;
    public byte[] f44681c;

    @Override
    public final void close() {
        r0 r0Var = this.f44680b;
        if (r0Var != null) {
            r0Var.close();
        }
    }
}
