package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class g0 implements AutoCloseable {
    public TL_wallet.sendTransfer f34779a;
    public i0 f34780b;
    public byte[] f34781c;

    @Override
    public final void close() {
        i0 i0Var = this.f34780b;
        if (i0Var != null) {
            i0Var.close();
        }
    }
}
