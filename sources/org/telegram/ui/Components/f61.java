package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class f61 implements com.google.android.exoplayer2.upstream.m {
    public final com.google.android.exoplayer2.upstream.m f28317a;
    public final long f28318b;

    public f61(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f28317a = extendedDefaultDataSource;
        this.f28318b = j10;
    }

    @Override
    public final void addTransferListener(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.f28317a.addTransferListener(y0Var);
    }

    @Override
    public final void close() {
        this.f28317a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f28317a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f28317a.getUri();
    }

    @Override
    public final long open(com.google.android.exoplayer2.upstream.q qVar) {
        ?? obj = new Object();
        obj.f2581e = qVar.f2585a;
        obj.f2578a = qVar.f2586b;
        obj.f2582f = qVar.f2587c;
        obj.f2583g = qVar.d;
        obj.f2579b = qVar.f2588e;
        obj.d = qVar.f2589f;
        obj.h = qVar.f2590g;
        obj.f2580c = qVar.h;
        obj.f2579b = qVar.f2588e + this.f28318b;
        d5.a.k((Uri) obj.f2581e, "The uri must be set.");
        return this.f28317a.open(new com.google.android.exoplayer2.upstream.q((Uri) obj.f2581e, obj.f2578a, (byte[]) obj.f2582f, (Map) obj.f2583g, obj.f2579b, obj.d, (String) obj.h, obj.f2580c));
    }

    @Override
    public final int read(byte[] bArr, int i9, int i10) {
        return this.f28317a.read(bArr, i9, i10);
    }
}
