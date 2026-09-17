package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class c71 implements g2.h {
    public final g2.h f22952a;
    public final long f22953b;

    public c71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f22952a = extendedDefaultDataSource;
        this.f22953b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f22952a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f22952a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f22952a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f22952a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f9375b = mVar.e + this.f22953b;
        return this.f22952a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f22952a.read(bArr, i10, i11);
    }
}
