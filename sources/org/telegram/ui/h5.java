package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class h5 extends c5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f38263c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f38263c).f22174id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f38265g;
            if (z10) {
                if (z10) {
                    this.f38265g = false;
                    this.f38262b.removeObserver(this.f38261a, this.e);
                }
                this.f38264f.accept(userFull);
            }
        }
    }
}
