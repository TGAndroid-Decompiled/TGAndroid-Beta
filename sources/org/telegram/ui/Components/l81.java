package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class l81 implements g2.h {
    public final g2.h f28092a;
    public final long f28093b;

    public l81(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f28092a = extendedDefaultDataSource;
        this.f28093b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f28092a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f28092a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f28092a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f28092a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10259b = mVar.f10268e + this.f28093b;
        return this.f28092a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f28092a.read(bArr, i10, i11);
    }
}
