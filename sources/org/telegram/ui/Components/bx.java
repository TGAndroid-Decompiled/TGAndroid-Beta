package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class bx {
    public final int f25728a;
    public final long f25729b;
    public final long f25730c;
    public boolean f25731e;
    public final int f25733g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f25732f = -1;

    public bx(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.f25733g = i11;
        this.h = notificationCenterDelegate;
        this.f25728a = i10;
        this.f25729b = j10;
        this.f25730c = j11;
    }

    public final void a() {
        boolean z4;
        switch (this.f25733g) {
            case 0:
                mz mzVar = (mz) this.h;
                if (mzVar.f29315q1 != null && mzVar.getVisibility() == 0 && mzVar.H0) {
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
            if (this.f25731e) {
                MessagesController.getInstance(this.f25728a).sendTyping(this.f25729b, this.f25730c, 2, 0);
            }
            this.f25732f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f25732f == -1) {
                this.f25732f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f25732f > 2000) {
                this.f25731e = true;
                this.f25732f = System.currentTimeMillis();
                MessagesController.getInstance(this.f25728a).sendTyping(this.f25729b, this.f25730c, 10, 0);
            }
        }
    }
}
