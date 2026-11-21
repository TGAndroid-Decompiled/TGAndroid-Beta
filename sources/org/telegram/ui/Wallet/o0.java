package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class o0 implements AutoCloseable {
    public TL_wallet.sendTransfer f44719a;
    public r0 f44720b;
    public byte[] f44721c;

    @Override
    public final void close() {
        r0 r0Var = this.f44720b;
        if (r0Var != null) {
            r0Var.close();
        }
    }
}
