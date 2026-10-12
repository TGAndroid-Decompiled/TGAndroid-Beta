package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class i5 extends d5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f35148c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f35148c).f19363id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f35150g;
            if (z10) {
                if (z10) {
                    this.f35150g = false;
                    this.f35147b.removeObserver(this.f35146a, this.e);
                }
                this.f35149f.accept(userFull);
            }
        }
    }
}
