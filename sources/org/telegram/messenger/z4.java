package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.TLObject;
public final class z4 implements Runnable {
    public final int f19712a = 0;
    public final boolean f19713b;
    public final long f19714c;
    public final long d;
    public final int f19715e;
    public final Object f19716f;

    public z4(int i10, String str, long j3, long j10, boolean z10) {
        this.f19715e = i10;
        this.f19716f = str;
        this.f19714c = j3;
        this.d = j10;
        this.f19713b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19712a) {
            case 0:
                long j3 = this.d;
                boolean z10 = this.f19713b;
                ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(this.f19715e, (String) this.f19716f, this.f19714c, j3, z10);
                return;
            default:
                FileLog.lambda$dumpUnparsedMessage$2((TLObject) this.f19716f, this.f19713b, this.f19714c, this.d, this.f19715e);
                return;
        }
    }

    public z4(TLObject tLObject, boolean z10, long j3, long j10, int i10) {
        this.f19716f = tLObject;
        this.f19713b = z10;
        this.f19714c = j3;
        this.d = j10;
        this.f19715e = i10;
    }
}
