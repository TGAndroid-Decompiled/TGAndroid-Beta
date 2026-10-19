package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class z4 implements Runnable {
    public final int f20196a = 0;
    public final boolean f20197b;
    public final long f20198c;
    public final long d;
    public final int e;
    public final Object f20199f;

    public z4(int i10, String str, long j10, long j11, boolean z10) {
        this.e = i10;
        this.f20199f = str;
        this.f20198c = j10;
        this.d = j11;
        this.f20197b = z10;
    }

    @Override
    public final void run() {
        switch (this.f20196a) {
            case 0:
                long j10 = this.d;
                boolean z10 = this.f20197b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.e, (String) this.f20199f, this.f20198c, j10, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f20199f, this.f20197b, this.f20198c, this.d, this.e);
                return;
        }
    }

    public z4(TLObject tLObject, boolean z10, long j10, long j11, int i10) {
        this.f20199f = tLObject;
        this.f20197b = z10;
        this.f20198c = j10;
        this.d = j11;
        this.e = i10;
    }
}
