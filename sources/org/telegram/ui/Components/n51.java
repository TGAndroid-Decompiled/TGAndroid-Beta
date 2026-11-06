package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class n51 implements j2.h {
    public final j2.h f36200a;
    public final long f36201b;

    public n51(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f36200a = extendedDefaultDataSource;
        this.f36201b = j3;
    }

    @Override
    public final void addTransferListener(j2.d0 d0Var) {
        this.f36200a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        this.f36200a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f36200a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f36200a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        j2.l a10 = mVar.a();
        a10.f16440b = mVar.f16449e + this.f36201b;
        return this.f36200a.open(a10.d());
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        return this.f36200a.read(bArr, i7, i10);
    }
}
