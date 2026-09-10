package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f17114a;
    public final FileLoader f17115b;
    public final TLRPC.Document f17116c;
    public final boolean d;

    public z2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f17114a = i10;
        this.f17115b = fileLoader;
        this.f17116c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17114a) {
            case 0:
                this.f17115b.lambda$setLoadingVideo$0(this.f17116c, this.d);
                return;
            default:
                this.f17115b.lambda$removeLoadingVideo$1(this.f17116c, this.d);
                return;
        }
    }
}
