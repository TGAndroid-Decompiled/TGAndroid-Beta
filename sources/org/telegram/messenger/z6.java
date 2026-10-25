package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class z6 implements Runnable {
    public final int f21969a;
    public final int f21970b;
    public final int f21971c;
    public final Object d;

    public z6(int i10, int i11, String str) {
        this.f21969a = 3;
        this.f21970b = i10;
        this.f21971c = i11;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f21969a) {
            case 0:
                ((MediaController.AnonymousClass8) this.d).lambda$onStateChanged$0(this.f21970b, this.f21971c);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$processLoadedStickers$106(this.f21970b, this.f21971c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$deleteNotificationChannelGlobal$44(this.f21970b, this.f21971c);
                return;
            default:
                PushListenerController.lambda$sendRegistrationToServer$0(this.f21970b, this.f21971c, (String) this.d);
                return;
        }
    }

    public z6(Object obj, int i10, int i11, int i12) {
        this.f21969a = i12;
        this.d = obj;
        this.f21970b = i10;
        this.f21971c = i11;
    }
}
