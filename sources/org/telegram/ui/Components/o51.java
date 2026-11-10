package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class o51 implements j2.h {
    public final j2.h f36523a;
    public final long f36524b;

    public o51(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f36523a = extendedDefaultDataSource;
        this.f36524b = j3;
    }

    @Override
    public final void addTransferListener(j2.d0 d0Var) {
        this.f36523a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        this.f36523a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f36523a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f36523a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        j2.l a10 = mVar.a();
        a10.f16443b = mVar.f16452e + this.f36524b;
        return this.f36523a.open(a10.d());
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        return this.f36523a.read(bArr, i7, i10);
    }
}
