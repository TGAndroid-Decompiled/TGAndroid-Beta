package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class j5 extends e5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f36552c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f36552c).f20427id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f36554g;
            if (z10) {
                if (z10) {
                    this.f36554g = false;
                    this.f36551b.removeObserver(this.f36550a, this.e);
                }
                this.f36553f.accept(userFull);
            }
        }
    }
}
