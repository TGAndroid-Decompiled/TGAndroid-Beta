package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class r61 implements g2.h {
    public final g2.h f29900a;
    public final long f29901b;

    public r61(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f29900a = extendedDefaultDataSource;
        this.f29901b = j10;
    }

    @Override
    public final void addTransferListener(g2.d0 d0Var) {
        this.f29900a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        this.f29900a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f29900a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f29900a.getUri();
    }

    @Override
    public final long open(g2.n nVar) {
        g2.m a2 = nVar.a();
        a2.f7310b = nVar.e + this.f29901b;
        return this.f29900a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f29900a.read(bArr, i10, i11);
    }
}
