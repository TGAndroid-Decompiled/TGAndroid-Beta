package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.cg0;
public final class a0 implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean f34442a;
    public final NotificationCenter f34443b;
    public final cg0 f34444c;
    public final l0 d;

    public a0(NotificationCenter notificationCenter, cg0 cg0Var, l0 l0Var) {
        this.f34443b = notificationCenter;
        this.f34444c = cg0Var;
        this.d = l0Var;
    }

    public final void a() {
        if (!this.f34442a) {
            l0 l0Var = this.d;
            if (l0Var.f34999e != null) {
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
        if (this.f34442a) {
            return;
        }
        this.f34442a = true;
        AndroidUtilities.cancelRunOnUIThread(this);
        this.f34443b.removeObserver(this, NotificationCenter.walletUpdate);
        this.f34444c.run();
    }
}
