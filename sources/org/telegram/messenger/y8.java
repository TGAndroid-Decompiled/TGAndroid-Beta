package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y8 implements Runnable {
    public final int f17943a = 0;
    public final int f17944b;
    public final long f17945c;
    public final long d;
    public final int e;
    public final int f17946f;
    public final boolean h;
    public final BaseController f17947n;
    public final Object f17948r;

    public y8(MediaDataController mediaDataController, int i10, ArrayList arrayList, boolean z10, long j3, int i11, int i12, long j10) {
        this.f17947n = mediaDataController;
        this.f17944b = i10;
        this.f17948r = arrayList;
        this.h = z10;
        this.f17945c = j3;
        this.e = i11;
        this.f17946f = i12;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17943a) {
            case 0:
                int i10 = this.f17946f;
                long j3 = this.d;
                ((MediaDataController) this.f17947n).lambda$putMediaDatabase$140(this.f17944b, (ArrayList) this.f17948r, this.h, this.f17945c, this.e, i10, j3);
                return;
            default:
                int i11 = this.f17946f;
                boolean z10 = this.h;
                ((MessagesStorage) this.f17947n).lambda$putMessages$238(this.f17944b, (TLRPC.messages_Messages) this.f17948r, this.f17945c, this.d, this.e, i11, z10);
                return;
        }
    }

    public y8(MessagesStorage messagesStorage, int i10, TLRPC.messages_Messages messages_messages, long j3, long j10, int i11, int i12, boolean z10) {
        this.f17947n = messagesStorage;
        this.f17944b = i10;
        this.f17948r = messages_messages;
        this.f17945c = j3;
        this.d = j10;
        this.e = i11;
        this.f17946f = i12;
        this.h = z10;
    }
}
