package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class v71 implements g2.h {
    public final g2.h f31218a;
    public final long f31219b;

    public v71(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f31218a = extendedDefaultDataSource;
        this.f31219b = j10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f31218a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f31218a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f31218a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f31218a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10787b = mVar.e + this.f31219b;
        return this.f31218a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f31218a.read(bArr, i10, i11);
    }
}
