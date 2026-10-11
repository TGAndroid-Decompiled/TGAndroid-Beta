package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class g81 implements g2.h {
    public final g2.h f26683a;
    public final long f26684b;

    public g81(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f26683a = extendedDefaultDataSource;
        this.f26684b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f26683a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f26683a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f26683a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f26683a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10260b = mVar.f10269e + this.f26684b;
        return this.f26683a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f26683a.read(bArr, i10, i11);
    }
}
