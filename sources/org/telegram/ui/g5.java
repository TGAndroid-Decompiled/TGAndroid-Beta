package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class g5 extends b5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f35332c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f35332c).f20990id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z4 = this.f35335g;
            if (z4) {
                if (z4) {
                    this.f35335g = false;
                    this.f35331b.removeObserver(this.f35330a, this.f35333e);
                }
                this.f35334f.accept(userFull);
            }
        }
    }
}
