package org.telegram.messenger;

import com.google.android.gms.location.LocationRequest;
public final class z9 implements qa {
    public LocationRequest f28276a;

    public final void a() {
        this.f28276a.f7355c = 1000L;
    }

    public final void b() {
        LocationRequest locationRequest = this.f28276a;
        long j3 = locationRequest.f7355c;
        long j10 = locationRequest.f7354b;
        if (j3 == j10 / 6) {
            locationRequest.f7355c = 166L;
        }
        if (locationRequest.f7359r == j10) {
            locationRequest.f7359r = 1000L;
        }
        locationRequest.f7354b = 1000L;
    }

    public final void c() {
        this.f28276a.f7353a = 100;
    }
}
