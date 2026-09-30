package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class q71 implements g2.h {
    public final g2.h f27584a;
    public final long f27585b;

    public q71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f27584a = extendedDefaultDataSource;
        this.f27585b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f27584a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f27584a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f27584a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f27584a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f9369b = mVar.e + this.f27585b;
        return this.f27584a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f27584a.read(bArr, i10, i11);
    }
}
