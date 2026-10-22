package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z8 implements Runnable {
    public final int f20214a = 0;
    public final int f20215b;
    public final long f20216c;
    public final long d;
    public final int e;
    public final int f20217f;
    public final boolean h;
    public final BaseController f20218n;
    public final Object f20219r;

    public z8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f20218n = mediaDataController;
        this.f20215b = i10;
        this.f20219r = arrayList;
        this.h = z10;
        this.f20216c = j10;
        this.e = i11;
        this.f20217f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20214a) {
            case 0:
                int i10 = this.f20217f;
                long j10 = this.d;
                ((MediaDataController) this.f20218n).lambda$putMediaDatabase$140(this.f20215b, (ArrayList) this.f20219r, this.h, this.f20216c, this.e, i10, j10);
                return;
            default:
                int i11 = this.f20217f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f20218n).lambda$putMessages$238(this.f20215b, (TLRPC.messages_Messages) this.f20219r, this.f20216c, this.d, this.e, i11, z10);
                return;
        }
    }

    public z8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f20218n = messagesStorage;
        this.f20215b = i10;
        this.f20219r = messages_messages;
        this.f20216c = j10;
        this.d = j11;
        this.e = i11;
        this.f20217f = i12;
        this.h = z10;
    }
}
