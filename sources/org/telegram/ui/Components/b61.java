package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class b61 implements j2.h {
    public final j2.h f33570a;
    public final long f33571b;

    public b61(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f33570a = extendedDefaultDataSource;
        this.f33571b = j3;
    }

    @Override
    public final void addTransferListener(j2.c0 c0Var) {
        this.f33570a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f33570a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f33570a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f33570a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        j2.l a10 = mVar.a();
        a10.f17179b = mVar.f17188e + this.f33571b;
        return this.f33570a.open(a10.d());
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        return this.f33570a.read(bArr, i7, i10);
    }
}
