package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y8 implements Runnable {
    public final int f18199a = 0;
    public final int f18200b;
    public final long f18201c;
    public final long d;
    public final int e;
    public final int f18202f;
    public final boolean h;
    public final BaseController f18203n;
    public final Object f18204r;

    public y8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f18203n = mediaDataController;
        this.f18200b = i10;
        this.f18204r = arrayList;
        this.h = z10;
        this.f18201c = j3;
        this.e = i11;
        this.f18202f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18199a) {
            case 0:
                int i10 = this.f18202f;
                long j3 = this.d;
                ((MediaDataController) this.f18203n).lambda$putMediaDatabase$140(this.f18200b, (ArrayList) this.f18204r, this.h, this.f18201c, this.e, i10, j3);
                return;
            default:
                int i11 = this.f18202f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f18203n).lambda$putMessages$238(this.f18200b, (TLRPC.messages_Messages) this.f18204r, this.f18201c, this.d, this.e, i11, z10);
                return;
        }
    }

    public y8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f18203n = messagesStorage;
        this.f18200b = i10;
        this.f18204r = messages_messages;
        this.f18201c = j3;
        this.d = j10;
        this.e = i11;
        this.f18202f = i12;
        this.h = z10;
    }
}
