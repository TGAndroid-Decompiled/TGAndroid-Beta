package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class g5 extends b5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f35353c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f35353c).f20992id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z4 = this.f35356g;
            if (z4) {
                if (z4) {
                    this.f35356g = false;
                    this.f35352b.removeObserver(this.f35351a, this.f35354e);
                }
                this.f35355f.accept(userFull);
            }
        }
    }
}
