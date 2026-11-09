package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class g0 implements AutoCloseable {
    public TL_wallet.sendTransfer f42495a;
    public i0 f42496b;
    public byte[] f42497c;

    @Override
    public final void close() {
        i0 i0Var = this.f42496b;
        if (i0Var != null) {
            i0Var.close();
        }
    }
}
