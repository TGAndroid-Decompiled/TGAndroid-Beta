package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class o51 implements j2.h {
    public final j2.h f36558a;
    public final long f36559b;

    public o51(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f36558a = extendedDefaultDataSource;
        this.f36559b = j3;
    }

    @Override
    public final void addTransferListener(j2.d0 d0Var) {
        this.f36558a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        this.f36558a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f36558a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f36558a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        j2.l a10 = mVar.a();
        a10.f16440b = mVar.f16449e + this.f36559b;
        return this.f36558a.open(a10.d());
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        return this.f36558a.read(bArr, i7, i10);
    }
}
