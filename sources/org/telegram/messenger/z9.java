package org.telegram.messenger;

import android.os.Bundle;
public final class z9 implements com.google.android.gms.common.api.k {
    public final oa f27898a;

    public z9(oa oaVar) {
        this.f27898a = oaVar;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        rd rdVar = (rd) this.f27898a;
        rdVar.M = true;
        try {
            ((h6.m) t0.j()).checkLocationSettings(rdVar.O, new ld(rdVar, 1));
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override
    public final void onConnectionSuspended(int i7) {
        this.f27898a.getClass();
    }
}
