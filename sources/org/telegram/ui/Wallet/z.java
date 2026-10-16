package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.se0;
public final class z implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean f33632a;
    public final NotificationCenter f33633b;
    public final se0 f33634c;
    public final k0 d;

    public z(NotificationCenter notificationCenter, se0 se0Var, k0 k0Var) {
        this.f33633b = notificationCenter;
        this.f33634c = se0Var;
        this.d = k0Var;
    }

    public final void a() {
        if (!this.f33632a) {
            k0 k0Var = this.d;
            if (k0Var.e != null) {
                ArrayList arrayList = k0Var.C;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((g0) obj).d) {
                        return;
                    }
                }
                run();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f33632a) {
            return;
        }
        this.f33632a = true;
        AndroidUtilities.cancelRunOnUIThread(this);
        this.f33633b.removeObserver(this, NotificationCenter.walletUpdate);
        this.f33634c.run();
    }
}
