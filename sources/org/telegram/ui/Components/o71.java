package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class o71 implements g2.h {
    public final g2.h f25690a;
    public final long f25691b;

    public o71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f25690a = extendedDefaultDataSource;
        this.f25691b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f25690a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f25690a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f25690a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f25690a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f8503b = mVar.e + this.f25691b;
        return this.f25690a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f25690a.read(bArr, i10, i11);
    }
}
