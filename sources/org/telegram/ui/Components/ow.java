package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;

public final class ow {

    public final int f31415a;

    public final long f31416b;

    public final long f31417c;

    public boolean f31418e;

    public final int f31420g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;

    public long f31419f = -1;

    public ow(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.f31420g = i11;
        this.h = notificationCenterDelegate;
        this.f31415a = i10;
        this.f31416b = j10;
        this.f31417c = j11;
    }

    public final void a() {
        boolean zN;
        switch (this.f31420g) {
            case 0:
                yy yyVar = (yy) this.h;
                zN = yyVar.f35025p1 != null && yyVar.getVisibility() == 0 && yyVar.G0;
                break;
            default:
                zN = ((pf.u0) this.h).N();
                break;
        }
        this.d = zN;
        if (zN) {
            return;
        }
        if (this.f31418e) {
            MessagesController.getInstance(this.f31415a).sendTyping(this.f31416b, this.f31417c, 2, 0);
        }
        this.f31419f = -1L;
    }

    public final void b() {
        if (this.d) {
            if (this.f31419f == -1) {
                this.f31419f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f31419f > 2000) {
                this.f31418e = true;
                this.f31419f = System.currentTimeMillis();
                MessagesController.getInstance(this.f31415a).sendTyping(this.f31416b, this.f31417c, 10, 0);
            }
        }
    }
}
