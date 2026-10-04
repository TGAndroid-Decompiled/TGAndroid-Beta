package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class y71 implements g2.h {
    public final g2.h f33106a;
    public final long f33107b;

    public y71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f33106a = extendedDefaultDataSource;
        this.f33107b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f33106a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f33106a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f33106a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f33106a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10188b = mVar.f10197e + this.f33107b;
        return this.f33106a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f33106a.read(bArr, i10, i11);
    }
}
