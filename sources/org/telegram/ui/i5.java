package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class i5 extends d5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f33325c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f33325c).f19306id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z4 = this.f33327g;
            if (z4) {
                if (z4) {
                    this.f33327g = false;
                    this.f33324b.removeObserver(this.f33323a, this.e);
                }
                this.f33326f.accept(userFull);
            }
        }
    }
}
