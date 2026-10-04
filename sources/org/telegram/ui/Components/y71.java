package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class y71 implements g2.h {
    public final g2.h f33100a;
    public final long f33101b;

    public y71(ExtendedDefaultDataSource extendedDefaultDataSource, long j3) {
        this.f33100a = extendedDefaultDataSource;
        this.f33101b = j3;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f33100a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f33100a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f33100a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f33100a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10187b = mVar.f10196e + this.f33101b;
        return this.f33100a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f33100a.read(bArr, i10, i11);
    }
}
