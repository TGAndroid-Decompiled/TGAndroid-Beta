package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class f0 implements AutoCloseable {
    public TL_wallet.sendTransfer f32886a;
    public h0 f32887b;
    public byte[] f32888c;

    @Override
    public final void close() {
        h0 h0Var = this.f32887b;
        if (h0Var != null) {
            h0Var.close();
        }
    }
}
