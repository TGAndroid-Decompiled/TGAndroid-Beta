package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class j51 implements j2.h {
    public final j2.h f34886a;
    public final long f34887b;

    public j51(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f34886a = extendedDefaultDataSource;
        this.f34887b = j3;
    }

    @Override
    public final void addTransferListener(j2.d0 d0Var) {
        this.f34886a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        this.f34886a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f34886a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f34886a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        j2.l a10 = mVar.a();
        a10.f16440b = mVar.f16449e + this.f34887b;
        return this.f34886a.open(a10.d());
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        return this.f34886a.read(bArr, i7, i10);
    }
}
