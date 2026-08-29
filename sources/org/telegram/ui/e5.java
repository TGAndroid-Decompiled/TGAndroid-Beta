package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class e5 extends z4 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f45065c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f45065c).f22539id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f45068g;
            if (z10) {
                if (z10) {
                    this.f45068g = false;
                    this.f45064b.removeObserver(this.f45063a, this.f45066e);
                }
                this.f45067f.accept(userFull);
            }
        }
    }
}
