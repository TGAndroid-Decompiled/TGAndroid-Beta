package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f20210a;
    public final FileLoader f20211b;
    public final TLRPC.Document f20212c;
    public final boolean d;

    public z2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f20210a = i10;
        this.f20211b = fileLoader;
        this.f20212c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20210a) {
            case 0:
                this.f20211b.lambda$setLoadingVideo$0(this.f20212c, this.d);
                return;
            default:
                this.f20211b.lambda$removeLoadingVideo$1(this.f20212c, this.d);
                return;
        }
    }
}
