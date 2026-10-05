package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class z71 implements g2.h {
    public final g2.h f33452a;
    public final long f33453b;

    public z71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f33452a = extendedDefaultDataSource;
        this.f33453b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f33452a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f33452a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f33452a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f33452a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10188b = mVar.f10197e + this.f33453b;
        return this.f33452a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f33452a.read(bArr, i10, i11);
    }
}
