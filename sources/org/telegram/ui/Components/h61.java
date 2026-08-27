package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;

public final class h61 implements com.google.android.exoplayer2.upstream.m {

    public final com.google.android.exoplayer2.upstream.m f28934a;

    public final long f28935b;

    public h61(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f28934a = extendedDefaultDataSource;
        this.f28935b = j10;
    }

    @Override
    public final void addTransferListener(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.f28934a.addTransferListener(y0Var);
    }

    @Override
    public final void close() {
        this.f28934a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f28934a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f28934a.getUri();
    }

    @Override
    public final long open(com.google.android.exoplayer2.upstream.q qVar) {
        com.google.android.exoplayer2.upstream.p pVar = new com.google.android.exoplayer2.upstream.p();
        pVar.f3018e = qVar.f3022a;
        pVar.f3015a = qVar.f3023b;
        pVar.f3019f = qVar.f3024c;
        pVar.f3020g = qVar.d;
        pVar.f3016b = qVar.f3025e;
        pVar.d = qVar.f3026f;
        pVar.h = qVar.f3027g;
        pVar.f3017c = qVar.h;
        pVar.f3016b = qVar.f3025e + this.f28935b;
        d5.a.k((Uri) pVar.f3018e, "The uri must be set.");
        return this.f28934a.open(new com.google.android.exoplayer2.upstream.q((Uri) pVar.f3018e, pVar.f3015a, (byte[]) pVar.f3019f, (Map) pVar.f3020g, pVar.f3016b, pVar.d, (String) pVar.h, pVar.f3017c));
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f28934a.read(bArr, i10, i11);
    }
}
