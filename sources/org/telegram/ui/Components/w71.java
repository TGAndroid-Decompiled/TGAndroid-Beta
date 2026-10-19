package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class w71 implements g2.h {
    public final g2.h f32030a;
    public final long f32031b;

    public w71(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f32030a = extendedDefaultDataSource;
        this.f32031b = j10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f32030a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f32030a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f32030a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f32030a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10786b = mVar.e + this.f32031b;
        return this.f32030a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f32030a.read(bArr, i10, i11);
    }
}
