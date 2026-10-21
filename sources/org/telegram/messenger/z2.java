package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f20199a;
    public final FileLoader f20200b;
    public final TLRPC.Document f20201c;
    public final boolean d;

    public z2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f20199a = i10;
        this.f20200b = fileLoader;
        this.f20201c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20199a) {
            case 0:
                this.f20200b.lambda$setLoadingVideo$0(this.f20201c, this.d);
                return;
            default:
                this.f20200b.lambda$removeLoadingVideo$1(this.f20201c, this.d);
                return;
        }
    }
}
