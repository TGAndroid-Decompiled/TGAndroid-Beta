package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class w71 implements g2.h {
    public final g2.h f32032a;
    public final long f32033b;

    public w71(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f32032a = extendedDefaultDataSource;
        this.f32033b = j10;
    }

    @Override
    public final void addTransferListener(g2.c0 c0Var) {
        this.f32032a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f32032a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f32032a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f32032a.getUri();
    }

    @Override
    public final long open(g2.m mVar) {
        g2.l a2 = mVar.a();
        a2.f10788b = mVar.e + this.f32033b;
        return this.f32032a.open(a2.d());
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f32032a.read(bArr, i10, i11);
    }
}
