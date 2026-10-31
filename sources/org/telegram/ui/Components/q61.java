package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class q61 implements g2.h {
    public final g2.h f29543a;
    public final long f29544b;

    public q61(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f29543a = extendedDefaultDataSource;
        this.f29544b = j10;
    }

    @Override
    public final void addTransferListener(g2.d0 d0Var) {
        this.f29543a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        this.f29543a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f29543a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f29543a.getUri();
    }

    @Override
    public final long open(g2.n nVar) {
        g2.m a2 = nVar.a();
        a2.f7309b = nVar.e + this.f29544b;
        return this.f29543a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f29543a.read(bArr, i10, i11);
    }
}
