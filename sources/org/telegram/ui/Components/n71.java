package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class n71 implements g2.h {
    public final g2.h f26657a;
    public final long f26658b;

    public n71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f26657a = extendedDefaultDataSource;
        this.f26658b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f26657a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f26657a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f26657a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f26657a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f9357b = mVar.e + this.f26658b;
        return this.f26657a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f26657a.read(bArr, i10, i11);
    }
}
