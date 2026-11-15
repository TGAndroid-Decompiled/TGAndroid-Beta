package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class q51 implements j2.h {
    public final j2.h f38530a;
    public final long f38531b;

    public q51(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f38530a = extendedDefaultDataSource;
        this.f38531b = j3;
    }

    @Override
    public final void addTransferListener(j2.c0 c0Var) {
        this.f38530a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f38530a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f38530a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f38530a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        j2.l a10 = mVar.a();
        a10.f16797b = mVar.f16806e + this.f38531b;
        return this.f38530a.open(a10.d());
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        return this.f38530a.read(bArr, i7, i10);
    }
}
