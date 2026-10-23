package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z2 implements Runnable {
    public final int f20274a;
    public final FileLoader f20275b;
    public final TLRPC.Document f20276c;
    public final boolean d;

    public z2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.f20274a = i10;
        this.f20275b = fileLoader;
        this.f20276c = document;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20274a) {
            case 0:
                this.f20275b.lambda$setLoadingVideo$0(this.f20276c, this.d);
                return;
            default:
                this.f20275b.lambda$removeLoadingVideo$1(this.f20276c, this.d);
                return;
        }
    }
}
