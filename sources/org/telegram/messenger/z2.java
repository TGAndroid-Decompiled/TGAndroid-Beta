package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f20193a;
    public final FileLoader f20194b;
    public final TLRPC.Document f20195c;
    public final boolean d;

    public z2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f20193a = i10;
        this.f20194b = fileLoader;
        this.f20195c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20193a) {
            case 0:
                this.f20194b.lambda$setLoadingVideo$0(this.f20195c, this.d);
                return;
            default:
                this.f20194b.lambda$removeLoadingVideo$1(this.f20195c, this.d);
                return;
        }
    }
}
