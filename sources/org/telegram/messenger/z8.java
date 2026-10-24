package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final int f20278a = 0;
    public final int f20279b;
    public final long f20280c;
    public final long d;
    public final int e;
    public final int f20281f;
    public final boolean h;
    public final BaseController f20282n;
    public final Object f20283r;

    public z8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f20282n = mediaDataController;
        this.f20279b = i10;
        this.f20283r = arrayList;
        this.h = z10;
        this.f20280c = j10;
        this.e = i11;
        this.f20281f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20278a) {
            case 0:
                int i10 = this.f20281f;
                long j10 = this.d;
                ((MediaDataController) this.f20282n).lambda$putMediaDatabase$140(this.f20279b, (ArrayList) this.f20283r, this.h, this.f20280c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f20281f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f20282n).lambda$putMessages$238(this.f20279b, (TLRPC.messages_Messages) this.f20283r, this.f20280c, this.d, this.e, i11, z10);
                return;
        }
    }

    public z8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f20282n = messagesStorage;
        this.f20279b = i10;
        this.f20283r = messages_messages;
        this.f20280c = j10;
        this.d = j11;
        this.e = i11;
        this.f20281f = i12;
        this.h = z10;
    }
}
