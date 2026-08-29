package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class vw {
    public final int f34188a;
    public final long f34189b;
    public final long f34190c;
    public boolean f34191e;
    public final int f34193g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f34192f = -1;

    public vw(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.f34193g = i11;
        this.h = notificationCenterDelegate;
        this.f34188a = i10;
        this.f34189b = j10;
        this.f34190c = j11;
    }

    public final void a() {
        boolean z10;
        switch (this.f34193g) {
            case 0:
                fz fzVar = (fz) this.h;
                if (fzVar.f28623p1 != null && fzVar.getVisibility() == 0 && fzVar.G0) {
                    z10 = true;
                    break;
                } else {
                    z10 = false;
                    break;
                }
            default:
                z10 = ((rf.v0) this.h).N();
                break;
        }
        this.d = z10;
        if (!z10) {
            if (this.f34191e) {
                MessagesController.getInstance(this.f34188a).sendTyping(this.f34189b, this.f34190c, 2, 0);
            }
            this.f34192f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f34192f == -1) {
                this.f34192f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f34192f > 2000) {
                this.f34191e = true;
                this.f34192f = System.currentTimeMillis();
                MessagesController.getInstance(this.f34188a).sendTyping(this.f34189b, this.f34190c, 10, 0);
            }
        }
    }
}
