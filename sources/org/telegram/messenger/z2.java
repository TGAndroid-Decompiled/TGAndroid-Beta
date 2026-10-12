package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19707a;
    public final FileLoader f19708b;
    public final TLRPC.Document f19709c;
    public final boolean d;

    public z2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19707a = i10;
        this.f19708b = fileLoader;
        this.f19709c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19707a) {
            case 0:
                this.f19708b.lambda$setLoadingVideo$0(this.f19709c, this.d);
                return;
            default:
                this.f19708b.lambda$removeLoadingVideo$1(this.f19709c, this.d);
                return;
        }
    }
}
