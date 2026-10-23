package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.f80;
public final class a0 implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean f34267a;
    public final NotificationCenter f34268b;
    public final f80 f34269c;
    public final l0 d;

    public a0(NotificationCenter notificationCenter, f80 f80Var, l0 l0Var) {
        this.f34268b = notificationCenter;
        this.f34269c = f80Var;
        this.d = l0Var;
    }

    public final void a() {
        if (!this.f34267a) {
            l0 l0Var = this.d;
            if (l0Var.e != null) {
                ArrayList arrayList = l0Var.G;
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
        if (this.f34267a) {
            return;
        }
        this.f34267a = true;
        AndroidUtilities.cancelRunOnUIThread(this);
        this.f34268b.removeObserver(this, NotificationCenter.walletUpdate);
        this.f34269c.run();
    }
}
