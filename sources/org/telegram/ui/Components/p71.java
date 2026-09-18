package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class p71 implements g2.h {
    public final g2.h f27125a;
    public final long f27126b;

    public p71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f27125a = extendedDefaultDataSource;
        this.f27126b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f27125a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f27125a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f27125a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f27125a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f9374b = mVar.e + this.f27126b;
        return this.f27125a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f27125a.read(bArr, i10, i11);
    }
}
