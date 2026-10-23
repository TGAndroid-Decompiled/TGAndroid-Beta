package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y8 implements Runnable {
    public final int f20206a = 0;
    public final int f20207b;
    public final long f20208c;
    public final long d;
    public final int e;
    public final int f20209f;
    public final boolean h;
    public final BaseController f20210n;
    public final Object f20211r;

    public y8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f20210n = mediaDataController;
        this.f20207b = i10;
        this.f20211r = arrayList;
        this.h = z10;
        this.f20208c = j10;
        this.e = i11;
        this.f20209f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20206a) {
            case 0:
                int i10 = this.f20209f;
                long j10 = this.d;
                ((MediaDataController) this.f20210n).lambda$putMediaDatabase$140(this.f20207b, (ArrayList) this.f20211r, this.h, this.f20208c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f20209f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f20210n).lambda$putMessages$238(this.f20207b, (TLRPC.messages_Messages) this.f20211r, this.f20208c, this.d, this.e, i11, z10);
                return;
        }
    }

    public y8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f20210n = messagesStorage;
        this.f20207b = i10;
        this.f20211r = messages_messages;
        this.f20208c = j10;
        this.d = j11;
        this.e = i11;
        this.f20209f = i12;
        this.h = z10;
    }
}
