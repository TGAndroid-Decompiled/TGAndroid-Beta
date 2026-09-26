package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y8 implements Runnable {
    public final int f18198a = 0;
    public final int f18199b;
    public final long f18200c;
    public final long d;
    public final int e;
    public final int f18201f;
    public final boolean h;
    public final BaseController f18202n;
    public final Object f18203r;

    public y8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f18202n = mediaDataController;
        this.f18199b = i10;
        this.f18203r = arrayList;
        this.h = z10;
        this.f18200c = j3;
        this.e = i11;
        this.f18201f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18198a) {
            case 0:
                int i10 = this.f18201f;
                long j3 = this.d;
                ((MediaDataController) this.f18202n).lambda$putMediaDatabase$140(this.f18199b, (ArrayList) this.f18203r, this.h, this.f18200c, this.e, i10, j3);
                return;
            default:
                int i11 = this.f18201f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f18202n).lambda$putMessages$238(this.f18199b, (TLRPC.messages_Messages) this.f18203r, this.f18200c, this.d, this.e, i11, z10);
                return;
        }
    }

    public y8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f18202n = messagesStorage;
        this.f18199b = i10;
        this.f18203r = messages_messages;
        this.f18200c = j3;
        this.d = j10;
        this.e = i11;
        this.f18201f = i12;
        this.h = z10;
    }
}
