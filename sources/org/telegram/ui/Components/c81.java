package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class c81 implements g2.h {
    public final g2.h f23968a;
    public final long f23969b;

    public c81(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f23968a = extendedDefaultDataSource;
        this.f23969b = j10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f23968a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f23968a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f23968a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f23968a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f9878b = mVar.e + this.f23969b;
        return this.f23968a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f23968a.read(bArr, i10, i11);
    }
}
