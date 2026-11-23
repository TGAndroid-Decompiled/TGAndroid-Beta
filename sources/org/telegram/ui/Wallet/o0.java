package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class o0 implements AutoCloseable {
    public TL_wallet.sendTransfer f44723a;
    public r0 f44724b;
    public byte[] f44725c;

    @Override
    public final void close() {
        r0 r0Var = this.f44724b;
        if (r0Var != null) {
            r0Var.close();
        }
    }
}
