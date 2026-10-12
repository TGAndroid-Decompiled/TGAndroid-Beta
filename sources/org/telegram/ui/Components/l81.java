package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class l81 implements g2.h {
    public final g2.h f28107a;
    public final long f28108b;

    public l81(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f28107a = extendedDefaultDataSource;
        this.f28108b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f28107a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f28107a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f28107a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f28107a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10259b = mVar.f10268e + this.f28108b;
        return this.f28107a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f28107a.read(bArr, i10, i11);
    }
}
