package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class d71 implements g5.m {
    public final g5.m f24185a;
    public final long f24186b;

    public d71(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f24185a = extendedDefaultDataSource;
        this.f24186b = j10;
    }

    @Override
    public final void addTransferListener(g5.v0 v0Var) {
        this.f24185a.addTransferListener(v0Var);
    }

    @Override
    public final void close() {
        this.f24185a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f24185a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f24185a.getUri();
    }

    @Override
    public final long open(g5.p pVar) {
        c4.c a2 = pVar.a();
        a2.f2063b = pVar.e + this.f24186b;
        return this.f24185a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f24185a.read(bArr, i10, i11);
    }
}
