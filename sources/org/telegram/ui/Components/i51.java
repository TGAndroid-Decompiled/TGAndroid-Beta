package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class i51 implements i2.h {
    public final i2.h f34618a;
    public final long f34619b;

    public i51(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f34618a = extendedDefaultDataSource;
        this.f34619b = j10;
    }

    @Override
    public final void addTransferListener(i2.d0 d0Var) {
        this.f34618a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        this.f34618a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f34618a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f34618a.getUri();
    }

    @Override
    public final long open(i2.n nVar) {
        i2.m a10 = nVar.a();
        a10.f14558b = nVar.f14567e + this.f34619b;
        return this.f34618a.open(a10.d());
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        return this.f34618a.read(bArr, i3, i10);
    }
}
