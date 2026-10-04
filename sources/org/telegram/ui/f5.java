package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class f5 extends a5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f34672c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f34672c).f20189id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f34675g;
            if (z10) {
                if (z10) {
                    this.f34675g = false;
                    this.f34671b.removeObserver(this.f34670a, this.f34673e);
                }
                this.f34674f.accept(userFull);
            }
        }
    }
}
