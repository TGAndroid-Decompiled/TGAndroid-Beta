package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class o81 implements g2.h {
    public final g2.h f31233a;
    public final long f31234b;

    public o81(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f31233a = extendedDefaultDataSource;
        this.f31234b = j10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f31233a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f31233a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f31233a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f31233a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f12252b = mVar.e + this.f31234b;
        return this.f31233a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f31233a.read(bArr, i10, i11);
    }
}
