package org.telegram.messenger;

import com.google.android.gms.location.LocationRequest;
public final class z9 implements qa {
    public LocationRequest f28366a;

    public final void a() {
        this.f28366a.f7346c = 1000L;
    }

    public final void b() {
        LocationRequest locationRequest = this.f28366a;
        long j3 = locationRequest.f7346c;
        long j10 = locationRequest.f7345b;
        if (j3 == j10 / 6) {
            locationRequest.f7346c = 166L;
        }
        if (locationRequest.f7350r == j10) {
            locationRequest.f7350r = 1000L;
        }
        locationRequest.f7345b = 1000L;
    }

    public final void c() {
        this.f28366a.f7344a = 100;
    }
}
