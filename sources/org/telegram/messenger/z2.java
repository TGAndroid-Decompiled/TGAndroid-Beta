package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f20205a;
    public final FileLoader f20206b;
    public final TLRPC.Document f20207c;
    public final boolean d;

    public z2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f20205a = i10;
        this.f20206b = fileLoader;
        this.f20207c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20205a) {
            case 0:
                this.f20206b.lambda$setLoadingVideo$0(this.f20207c, this.d);
                return;
            default:
                this.f20206b.lambda$removeLoadingVideo$1(this.f20207c, this.d);
                return;
        }
    }
}
