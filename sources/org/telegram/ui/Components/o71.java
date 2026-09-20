package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class o71 implements g2.h {
    public final g2.h f26829a;
    public final long f26830b;

    public o71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f26829a = extendedDefaultDataSource;
        this.f26830b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f26829a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f26829a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f26829a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f26829a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f9375b = mVar.e + this.f26830b;
        return this.f26829a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f26829a.read(bArr, i10, i11);
    }
}
