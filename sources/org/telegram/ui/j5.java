package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class j5 extends e5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f36541c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f36541c).f20420id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f36543g;
            if (z10) {
                if (z10) {
                    this.f36543g = false;
                    this.f36540b.removeObserver(this.f36539a, this.e);
                }
                this.f36542f.accept(userFull);
            }
        }
    }
}
