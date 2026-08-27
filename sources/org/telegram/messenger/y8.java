package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class y8 implements Runnable {

    public final int f22210a = 0;

    public final int f22211b;

    public final long f22212c;
    public final long d;

    public final int f22213e;

    public final int f22214f;
    public final boolean h;

    public final BaseController f22215n;

    public final Object f22216r;

    public y8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.f22215n = mediaDataController;
        this.f22211b = i10;
        this.f22216r = arrayList;
        this.h = z10;
        this.f22212c = j10;
        this.f22213e = i11;
        this.f22214f = i12;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f22210a) {
            case 0:
                ((MediaDataController) this.f22215n).lambda$putMediaDatabase$140(this.f22211b, (ArrayList) this.f22216r, this.h, this.f22212c, this.f22213e, this.f22214f, this.d);
                break;
            default:
                ((MessagesStorage) this.f22215n).lambda$putMessages$238(this.f22211b, (TLRPC.messages_Messages) this.f22216r, this.f22212c, this.d, this.f22213e, this.f22214f, this.h);
                break;
        }
    }

    public y8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.f22215n = messagesStorage;
        this.f22211b = i10;
        this.f22216r = messages_messages;
        this.f22212c = j10;
        this.d = j11;
        this.f22213e = i11;
        this.f22214f = i12;
        this.h = z10;
    }
}
