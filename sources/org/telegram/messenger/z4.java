package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class z4 implements Runnable {
    public final int f18835a = 0;
    public final boolean f18836b;
    public final long f18837c;
    public final long d;
    public final int e;
    public final Object f18838f;

    public z4(int i10, String str, long j10, long j11, boolean z10) {
        this.e = i10;
        this.f18838f = str;
        this.f18837c = j10;
        this.d = j11;
        this.f18836b = z10;
    }

    @Override
    public final void run() {
        switch (this.f18835a) {
            case 0:
                long j10 = this.d;
                boolean z10 = this.f18836b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.e, (String) this.f18838f, this.f18837c, j10, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f18838f, this.f18836b, this.f18837c, this.d, this.e);
                return;
        }
    }

    public z4(TLObject tLObject, boolean z10, long j10, long j11, int i10) {
        this.f18838f = tLObject;
        this.f18836b = z10;
        this.f18837c = j10;
        this.d = j11;
        this.e = i10;
    }
}
