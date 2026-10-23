package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class e81 implements g2.h {
    public final g2.h f25921a;
    public final long f25922b;

    public e81(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f25921a = extendedDefaultDataSource;
        this.f25922b = j10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f25921a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f25921a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f25921a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f25921a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10805b = mVar.e + this.f25922b;
        return this.f25921a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f25921a.read(bArr, i10, i11);
    }
}
