package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f20211a;
    public final LocationSharingService f20212b;

    public z5(LocationSharingService locationSharingService, int i10) {
        this.f20211a = i10;
        this.f20212b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f20211a) {
            case 0:
                LocationSharingService.a(this.f20212b);
                return;
            default:
                LocationSharingService.b(this.f20212b);
                return;
        }
    }
}
