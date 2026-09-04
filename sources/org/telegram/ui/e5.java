package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class e5 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f43285c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f43285c).f20016id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f43288g;
            if (z10) {
                if (z10) {
                    this.f43288g = false;
                    this.f43284b.removeObserver(this.f43283a, this.f43286e);
                }
                this.f43287f.accept(userFull);
            }
        }
    }
}
