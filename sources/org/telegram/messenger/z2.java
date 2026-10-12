package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f19706a;
    public final FileLoader f19707b;
    public final TLRPC.Document f19708c;
    public final boolean d;

    public z2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f19706a = i10;
        this.f19707b = fileLoader;
        this.f19708c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f19706a) {
            case 0:
                this.f19707b.lambda$setLoadingVideo$0(this.f19708c, this.d);
                return;
            default:
                this.f19707b.lambda$removeLoadingVideo$1(this.f19708c, this.d);
                return;
        }
    }
}
