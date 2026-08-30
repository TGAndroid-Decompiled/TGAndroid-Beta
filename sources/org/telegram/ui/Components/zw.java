package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
public final class zw {
    public final int f31449a;
    public final long f31450b;
    public final long f31451c;
    public boolean e;
    public final int f31453g;
    public final NotificationCenter.NotificationCenterDelegate h;
    public boolean d = false;
    public long f31452f = -1;

    public zw(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, long j10, long j11, int i11) {
        this.f31453g = i11;
        this.h = notificationCenterDelegate;
        this.f31449a = i10;
        this.f31450b = j10;
        this.f31451c = j11;
    }

    public final void a() {
        boolean z4;
        switch (this.f31453g) {
            case 0:
                kz kzVar = (kz) this.h;
                if (kzVar.f26460q1 != null && kzVar.getVisibility() == 0 && kzVar.H0) {
                    z4 = true;
                    break;
                } else {
                    z4 = false;
                    break;
                }
            default:
                z4 = ((tf.u0) this.h).N();
                break;
        }
        this.d = z4;
        if (!z4) {
            if (this.e) {
                MessagesController.getInstance(this.f31449a).sendTyping(this.f31450b, this.f31451c, 2, 0);
            }
            this.f31452f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f31452f == -1) {
                this.f31452f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f31452f > 2000) {
                this.e = true;
                this.f31452f = System.currentTimeMillis();
                MessagesController.getInstance(this.f31449a).sendTyping(this.f31450b, this.f31451c, 10, 0);
            }
        }
    }
}
