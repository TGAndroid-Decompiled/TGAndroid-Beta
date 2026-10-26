package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class n81 implements g2.h {
    public final g2.h f30923a;
    public final long f30924b;

    public n81(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f30923a = extendedDefaultDataSource;
        this.f30924b = j10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f30923a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f30923a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f30923a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f30923a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f12253b = mVar.e + this.f30924b;
        return this.f30923a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f30923a.read(bArr, i10, i11);
    }
}
