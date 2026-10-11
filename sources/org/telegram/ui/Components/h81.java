package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class h81 implements g2.h {
    public final g2.h f26929a;
    public final long f26930b;

    public h81(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f26929a = extendedDefaultDataSource;
        this.f26930b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f26929a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f26929a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f26929a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f26929a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10260b = mVar.f10269e + this.f26930b;
        return this.f26929a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f26929a.read(bArr, i10, i11);
    }
}
