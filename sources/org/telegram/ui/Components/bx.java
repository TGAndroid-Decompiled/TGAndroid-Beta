package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class bx {
    public final int f25707a;
    public final long f25708b;
    public final long f25709c;
    public boolean f25710e;
    public final int f25712g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f25711f = -1;

    public bx(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.f25712g = i11;
        this.h = notificationCenterDelegate;
        this.f25707a = i10;
        this.f25708b = j10;
        this.f25709c = j11;
    }

    public final void a() {
        boolean z4;
        switch (this.f25712g) {
            case 0:
                mz mzVar = (mz) this.h;
                if (mzVar.f29317q1 != null && mzVar.getVisibility() == 0 && mzVar.H0) {
                    z4 = true;
                    break;
                } else {
                    z4 = false;
                    break;
                }
            default:
                z4 = ((uf.u0) this.h).N();
                break;
        }
        this.d = z4;
        if (!z4) {
            if (this.f25710e) {
                MessagesController.getInstance(this.f25707a).sendTyping(this.f25708b, this.f25709c, 2, 0);
            }
            this.f25711f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f25711f == -1) {
                this.f25711f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f25711f > 2000) {
                this.f25710e = true;
                this.f25711f = System.currentTimeMillis();
                MessagesController.getInstance(this.f25707a).sendTyping(this.f25708b, this.f25709c, 10, 0);
            }
        }
    }
}
