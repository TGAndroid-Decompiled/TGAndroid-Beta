package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class g5 extends b5 {
    @Override
    public final void a() {
        MessagesController.getInstance(UserConfig.selectedAccount).loadUserInfo((TLRPC.User) this.f32239c, false, this.d);
    }

    @Override
    public final void b(Object... objArr) {
        if (((Long) objArr[0]).longValue() == ((TLRPC.User) this.f32239c).f18476id) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            boolean z10 = this.f32241g;
            if (z10) {
                if (z10) {
                    this.f32241g = false;
                    this.f32238b.removeObserver(this.f32237a, this.e);
                }
                this.f32240f.accept(userFull);
            }
        }
    }
}
