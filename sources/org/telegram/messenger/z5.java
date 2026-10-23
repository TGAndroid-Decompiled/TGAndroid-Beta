package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f20283a;
    public final LocationSharingService f20284b;

    public z5(LocationSharingService locationSharingService, int i10) {
        this.f20283a = i10;
        this.f20284b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f20283a) {
            case 0:
                LocationSharingService.a(this.f20284b);
                return;
            default:
                LocationSharingService.b(this.f20284b);
                return;
        }
    }
}
