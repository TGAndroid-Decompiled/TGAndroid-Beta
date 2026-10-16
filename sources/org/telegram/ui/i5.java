package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class i5 extends d5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f34877c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f34877c).f19063id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f34879g;
            if (z10) {
                if (z10) {
                    this.f34879g = false;
                    this.f34876b.removeObserver(this.f34875a, this.e);
                }
                this.f34878f.accept(userFull);
            }
        }
    }
}
