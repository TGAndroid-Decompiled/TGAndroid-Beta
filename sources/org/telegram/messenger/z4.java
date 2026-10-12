package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class z4 implements Runnable {
    public final int f19133a = 0;
    public final boolean f19134b;
    public final long f19135c;
    public final long d;
    public final int e;
    public final Object f19136f;

    public z4(int i10, String str, long j10, long j11, boolean z10) {
        this.e = i10;
        this.f19136f = str;
        this.f19135c = j10;
        this.d = j11;
        this.f19134b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19133a) {
            case 0:
                long j10 = this.d;
                boolean z10 = this.f19134b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.e, (String) this.f19136f, this.f19135c, j10, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f19136f, this.f19134b, this.f19135c, this.d, this.e);
                return;
        }
    }

    public z4(TLObject tLObject, boolean z10, long j10, long j11, int i10) {
        this.f19136f = tLObject;
        this.f19134b = z10;
        this.f19135c = j10;
        this.d = j11;
        this.e = i10;
    }
}
