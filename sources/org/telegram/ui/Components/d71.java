package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class d71 implements g5.m {
    public final g5.m f24210a;
    public final long f24211b;

    public d71(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f24210a = extendedDefaultDataSource;
        this.f24211b = j10;
    }

    @Override
    public final void addTransferListener(g5.v0 v0Var) {
        this.f24210a.addTransferListener(v0Var);
    }

    @Override
    public final void close() {
        this.f24210a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f24210a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f24210a.getUri();
    }

    @Override
    public final long open(g5.p pVar) {
        c4.c a2 = pVar.a();
        a2.f2086b = pVar.e + this.f24211b;
        return this.f24210a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f24210a.read(bArr, i10, i11);
    }
}
