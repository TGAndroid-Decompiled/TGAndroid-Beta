package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class g81 implements g2.h {
    public final g2.h f26636a;
    public final long f26637b;

    public g81(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f26636a = extendedDefaultDataSource;
        this.f26637b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f26636a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f26636a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f26636a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f26636a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10261b = mVar.f10270e + this.f26637b;
        return this.f26636a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f26636a.read(bArr, i10, i11);
    }
}
