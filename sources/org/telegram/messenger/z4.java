package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class z4 implements Runnable {
    public final int f19711a = 0;
    public final boolean f19712b;
    public final long f19713c;
    public final long d;
    public final int f19714e;
    public final Object f19715f;

    public z4(int i10, String str, long j3, long j10, boolean z10) {
        this.f19714e = i10;
        this.f19715f = str;
        this.f19713c = j3;
        this.d = j10;
        this.f19712b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19711a) {
            case 0:
                long j3 = this.d;
                boolean z10 = this.f19712b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.f19714e, (String) this.f19715f, this.f19713c, j3, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f19715f, this.f19712b, this.f19713c, this.d, this.f19714e);
                return;
        }
    }

    public z4(TLObject tLObject, boolean z10, long j3, long j10, int i10) {
        this.f19715f = tLObject;
        this.f19712b = z10;
        this.f19713c = j3;
        this.d = j10;
        this.f19714e = i10;
    }
}
