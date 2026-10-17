package org.telegram.ui.Wallet;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u61;
public final class f3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34196a;
    public final Object f34197b;

    public f3(Object obj, int i10) {
        this.f34196a = i10;
        this.f34197b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        u61 u61Var;
        switch (this.f34196a) {
            case 0:
                k3 k3Var = (k3) this.f34197b;
                k3Var.getClass();
                if (i10 == NotificationCenter.userInfoDidLoad && i11 == k3Var.f34425w0 && k3Var.f34427x0 != 0 && objArr.length > 1) {
                    Object obj = objArr[0];
                    if ((obj instanceof Long) && ((Long) obj).longValue() == k3Var.f34427x0) {
                        k3Var.p(k3.h((TLRPC.UserFull) objArr[1]), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                t9 t9Var = (t9) this.f34197b;
                if (!t9Var.f34910n && (u61Var = t9Var.f31190a) != null) {
                    u61Var.W2.N(true);
                    return;
                }
                return;
        }
    }
}
