package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class a71 implements g2.h {
    public final g2.h f22380a;
    public final long f22381b;

    public a71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f22380a = extendedDefaultDataSource;
        this.f22381b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f22380a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f22380a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f22380a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f22380a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f9358b = mVar.e + this.f22381b;
        return this.f22380a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f22380a.read(bArr, i10, i11);
    }
}
