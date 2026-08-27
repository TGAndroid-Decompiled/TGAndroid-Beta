package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class z6 implements Runnable {

    public final int f22309a;

    public final MediaDataController f22310b;

    public final TLRPC.messages_Messages f22311c;
    public final int d;

    public final long f22312e;

    public final ArrayList f22313f;
    public final int h;

    public final int f22314n;

    public final boolean f22315r;

    public final int f22316s;
    public final int v;

    public z6(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i10, long j10, ArrayList arrayList, int i11, int i12, boolean z10, int i13, int i14, int i15) {
        this.f22309a = i15;
        this.f22310b = mediaDataController;
        this.f22311c = messages_messages;
        this.d = i10;
        this.f22312e = j10;
        this.f22313f = arrayList;
        this.h = i11;
        this.f22314n = i12;
        this.f22315r = z10;
        this.f22316s = i13;
        this.v = i14;
    }

    @Override
    public final void run() {
        switch (this.f22309a) {
            case 0:
                this.f22310b.lambda$processLoadedMedia$133(this.f22311c, this.d, this.f22312e, this.f22313f, this.h, this.f22314n, this.f22315r, this.f22316s, this.v);
                break;
            default:
                this.f22310b.lambda$processLoadedMedia$134(this.f22311c, this.d, this.f22312e, this.f22313f, this.h, this.f22314n, this.f22315r, this.f22316s, this.v);
                break;
        }
    }
}
