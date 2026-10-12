package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
public final class mh0 implements Runnable {
    public final int f28555a;
    public final Object f28556b;
    public final Object f28557c;
    public final Object d;

    public mh0(Object obj, Object obj2, Object obj3, int i10) {
        this.f28555a = i10;
        this.f28556b = obj;
        this.f28557c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ((VideoFileRenderer) this.f28556b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.f28557c, (VideoFrame) this.d);
    }

    private final void b() {
        Exception runtimeException;
        byte[] bArr;
        pi.s sVar = (pi.s) this.f28556b;
        byte[] bArr2 = (byte[]) this.d;
        File file = ((pi.m) this.f28557c).f45794b;
        if (sVar.f45822m != pi.q.d) {
            return;
        }
        sVar.B = bArr2;
        try {
            sVar.o();
            i2.f0 a2 = new i2.p(sVar.f45812a).a();
            sVar.A = a2;
            a2.o0(sVar.F);
            i2.f0 f0Var = sVar.A;
            b2.k0 b10 = b2.k0.b(Uri.fromFile(file));
            f0Var.getClass();
            f0Var.I0(e9.i0.z(b10));
            sVar.A.b();
            sVar.s(pi.q.f45806e);
            pi.j jVar = sVar.f45815e;
            long j3 = sVar.j();
            long j10 = sVar.f45827r;
            long j11 = sVar.f45828s;
            byte[] bArr3 = sVar.B;
            if (bArr3 == null) {
                bArr = null;
            } else {
                bArr = (byte[]) bArr3.clone();
            }
            jVar.onPreviewReady(j3, j10, j11, bArr);
        } catch (Throwable th2) {
            if (th2 instanceof Exception) {
                runtimeException = th2;
            } else {
                runtimeException = new RuntimeException(th2);
            }
            sVar.g(runtimeException);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mh0.run():void");
    }
}
