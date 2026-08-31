package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class f71 implements g5.m {
    public final g5.m f26781a;
    public final long f26782b;

    public f71(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f26781a = extendedDefaultDataSource;
        this.f26782b = j10;
    }

    @Override
    public final void addTransferListener(g5.v0 v0Var) {
        this.f26781a.addTransferListener(v0Var);
    }

    @Override
    public final void close() {
        this.f26781a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f26781a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f26781a.getUri();
    }

    @Override
    public final long open(g5.p pVar) {
        c4.c a2 = pVar.a();
        a2.f2242b = pVar.f6888e + this.f26782b;
        return this.f26781a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f26781a.read(bArr, i10, i11);
    }
}
