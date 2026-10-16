package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class d81 implements g2.h {
    public final g2.h f24010a;
    public final long f24011b;

    public d81(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f24010a = extendedDefaultDataSource;
        this.f24011b = j10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f24010a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f24010a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f24010a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f24010a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f9881b = mVar.e + this.f24011b;
        return this.f24010a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f24010a.read(bArr, i10, i11);
    }
}
