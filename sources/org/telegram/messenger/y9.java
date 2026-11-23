package org.telegram.messenger;

import android.os.Bundle;
public final class y9 implements com.google.android.gms.common.api.k {
    public final na f28207a;

    public y9(na naVar) {
        this.f28207a = naVar;
    }

    @Override
    public final void onConnected(Bundle bundle) {
        qd qdVar = (qd) this.f28207a;
        qdVar.M = true;
        try {
            ((h6.m) t0.j()).checkLocationSettings(qdVar.O, new kd(qdVar, 1));
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override
    public final void onConnectionSuspended(int i7) {
        this.f28207a.getClass();
    }
}
