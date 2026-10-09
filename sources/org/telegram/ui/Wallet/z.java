package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.tf0;
public final class z implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean f35676a;
    public final NotificationCenter f35677b;
    public final tf0 f35678c;
    public final k0 d;

    public z(NotificationCenter notificationCenter, tf0 tf0Var, k0 k0Var) {
        this.f35677b = notificationCenter;
        this.f35678c = tf0Var;
        this.d = k0Var;
    }

    public final void a() {
        if (!this.f35676a) {
            k0 k0Var = this.d;
            if (k0Var.f35096e != null) {
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
        if (this.f35676a) {
            return;
        }
        this.f35676a = true;
        AndroidUtilities.cancelRunOnUIThread(this);
        this.f35677b.removeObserver(this, NotificationCenter.walletUpdate);
        this.f35678c.run();
    }
}
