package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class q71 implements g2.h {
    public final g2.h f27520a;
    public final long f27521b;

    public q71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f27520a = extendedDefaultDataSource;
        this.f27521b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f27520a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f27520a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f27520a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f27520a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f9375b = mVar.e + this.f27521b;
        return this.f27520a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f27520a.read(bArr, i10, i11);
    }
}
