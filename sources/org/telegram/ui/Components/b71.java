package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class b71 implements g2.h {
    public final g2.h f24619a;
    public final long f24620b;

    public b71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f24619a = extendedDefaultDataSource;
        this.f24620b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f24619a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f24619a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f24619a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f24619a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10352b = mVar.f10361e + this.f24620b;
        return this.f24619a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f24619a.read(bArr, i10, i11);
    }
}
