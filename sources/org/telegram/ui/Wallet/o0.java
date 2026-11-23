package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class o0 implements AutoCloseable {
    public TL_wallet.sendTransfer f44689a;
    public r0 f44690b;
    public byte[] f44691c;

    @Override
    public final void close() {
        r0 r0Var = this.f44690b;
        if (r0Var != null) {
            r0Var.close();
        }
    }
}
