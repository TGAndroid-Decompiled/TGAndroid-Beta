package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class p0 implements AutoCloseable {
    public TL_wallet.sendTransfer f44851a;
    public s0 f44852b;
    public byte[] f44853c;

    @Override
    public final void close() {
        s0 s0Var = this.f44852b;
        if (s0Var != null) {
            s0Var.close();
        }
    }
}
