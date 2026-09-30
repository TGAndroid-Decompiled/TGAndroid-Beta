package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class p71 implements g2.h {
    public final g2.h f27280a;
    public final long f27281b;

    public p71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f27280a = extendedDefaultDataSource;
        this.f27281b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f27280a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f27280a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f27280a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f27280a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f9357b = mVar.e + this.f27281b;
        return this.f27280a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f27280a.read(bArr, i10, i11);
    }
}
