package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class e61 implements j2.h {
    public final j2.h f34689a;
    public final long f34690b;

    public e61(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f34689a = extendedDefaultDataSource;
        this.f34690b = j3;
    }

    @Override
    public final void addTransferListener(j2.c0 c0Var) {
        this.f34689a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f34689a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f34689a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f34689a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        j2.l a10 = mVar.a();
        a10.f17207b = mVar.f17216e + this.f34690b;
        return this.f34689a.open(a10.d());
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        return this.f34689a.read(bArr, i7, i10);
    }
}
