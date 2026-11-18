package org.telegram.messenger;

import com.google.android.gms.location.LocationRequest;
public final class z9 implements qa {
    public LocationRequest f28274a;

    public final void a() {
        this.f28274a.f7352c = 1000L;
    }

    public final void b() {
        LocationRequest locationRequest = this.f28274a;
        long j3 = locationRequest.f7352c;
        long j10 = locationRequest.f7351b;
        if (j3 == j10 / 6) {
            locationRequest.f7352c = 166L;
        }
        if (locationRequest.f7356r == j10) {
            locationRequest.f7356r = 1000L;
        }
        locationRequest.f7351b = 1000L;
    }

    public final void c() {
        this.f28274a.f7350a = 100;
    }
}
