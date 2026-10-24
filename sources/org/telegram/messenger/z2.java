package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f20260a;
    public final FileLoader f20261b;
    public final TLRPC.Document f20262c;
    public final boolean d;

    public z2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f20260a = i10;
        this.f20261b = fileLoader;
        this.f20262c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20260a) {
            case 0:
                this.f20261b.lambda$setLoadingVideo$0(this.f20262c, this.d);
                return;
            default:
                this.f20261b.lambda$removeLoadingVideo$1(this.f20262c, this.d);
                return;
        }
    }
}
