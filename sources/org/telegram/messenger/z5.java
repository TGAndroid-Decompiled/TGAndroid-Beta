package org.telegram.messenger;

import java.util.ArrayList;
public final class z5 implements Runnable {
    public final int f21966a;
    public final LocationController f21967b;
    public final ArrayList f21968c;

    public z5(LocationController locationController, ArrayList arrayList, int i10) {
        this.f21966a = i10;
        this.f21967b = locationController;
        this.f21968c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21966a) {
            case 0:
                this.f21967b.lambda$loadSharingLocations$14(this.f21968c);
                return;
            default:
                this.f21967b.lambda$loadSharingLocations$15(this.f21968c);
                return;
        }
    }
}
