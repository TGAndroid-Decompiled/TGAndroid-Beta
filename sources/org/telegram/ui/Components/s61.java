package org.telegram.ui.Components;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class s61 implements com.google.android.exoplayer2.upstream.m {
    public final com.google.android.exoplayer2.upstream.m f32533a;
    public final long f32534b;

    public s61(ExtendedDefaultDataSource extendedDefaultDataSource, long j10) {
        this.f32533a = extendedDefaultDataSource;
        this.f32534b = j10;
    }

    @Override
    public final void addTransferListener(com.google.android.exoplayer2.upstream.y0 y0Var) {
        this.f32533a.addTransferListener(y0Var);
    }

    @Override
    public final void close() {
        this.f32533a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f32533a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f32533a.getUri();
    }

    @Override
    public final long open(com.google.android.exoplayer2.upstream.q qVar) {
        ?? obj = new Object();
        obj.f3595e = qVar.f3599a;
        obj.f3592a = qVar.f3600b;
        obj.f3596f = qVar.f3601c;
        obj.f3597g = qVar.d;
        obj.f3593b = qVar.f3602e;
        obj.d = qVar.f3603f;
        obj.h = qVar.f3604g;
        obj.f3594c = qVar.h;
        obj.f3593b = qVar.f3602e + this.f32534b;
        f5.a.k((Uri) obj.f3595e, "The uri must be set.");
        return this.f32533a.open(new com.google.android.exoplayer2.upstream.q((Uri) obj.f3595e, obj.f3592a, (byte[]) obj.f3596f, (Map) obj.f3597g, obj.f3593b, obj.d, (String) obj.h, obj.f3594c));
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f32533a.read(bArr, i10, i11);
    }
}
