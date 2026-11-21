package org.telegram.messenger;

import com.google.android.gms.location.LocationRequest;
public final class z9 implements qa {
    public LocationRequest f28302a;

    public final void a() {
        this.f28302a.f7381c = 1000L;
    }

    public final void b() {
        LocationRequest locationRequest = this.f28302a;
        long j3 = locationRequest.f7381c;
        long j10 = locationRequest.f7380b;
        if (j3 == j10 / 6) {
            locationRequest.f7381c = 166L;
        }
        if (locationRequest.f7385r == j10) {
            locationRequest.f7385r = 1000L;
        }
        locationRequest.f7380b = 1000L;
    }

    public final void c() {
        this.f28302a.f7379a = 100;
    }
}
