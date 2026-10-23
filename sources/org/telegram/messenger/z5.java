package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f20219a;
    public final LocationSharingService f20220b;

    public z5(LocationSharingService locationSharingService, int i10) {
        this.f20219a = i10;
        this.f20220b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f20219a) {
            case 0:
                LocationSharingService.a(this.f20220b);
                return;
            default:
                LocationSharingService.b(this.f20220b);
                return;
        }
    }
}
