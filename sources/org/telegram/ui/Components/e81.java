package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class e81 implements g2.h {
    public final g2.h f25983a;
    public final long f25984b;

    public e81(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f25983a = extendedDefaultDataSource;
        this.f25984b = j10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f25983a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f25983a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f25983a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f25983a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10805b = mVar.e + this.f25984b;
        return this.f25983a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f25983a.read(bArr, i10, i11);
    }
}
