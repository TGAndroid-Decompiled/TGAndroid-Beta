package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.og0;
public final class a0 implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean f34440a;
    public final NotificationCenter f34441b;
    public final og0 f34442c;
    public final l0 d;

    public a0(NotificationCenter notificationCenter, og0 og0Var, l0 l0Var) {
        this.f34441b = notificationCenter;
        this.f34442c = og0Var;
        this.d = l0Var;
    }

    public final void a() {
        if (!this.f34440a) {
            l0 l0Var = this.d;
            if (l0Var.f34997e != null) {
                ArrayList arrayList = l0Var.C;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((h0) obj).d) {
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
        if (this.f34440a) {
            return;
        }
        this.f34440a = true;
        AndroidUtilities.cancelRunOnUIThread(this);
        this.f34441b.removeObserver(this, NotificationCenter.walletUpdate);
        this.f34442c.run();
    }
}
