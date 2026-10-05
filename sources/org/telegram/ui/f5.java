package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class f5 extends a5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f34682c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f34682c).f20194id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f34685g;
            if (z10) {
                if (z10) {
                    this.f34685g = false;
                    this.f34681b.removeObserver(this.f34680a, this.f34683e);
                }
                this.f34684f.accept(userFull);
            }
        }
    }
}
