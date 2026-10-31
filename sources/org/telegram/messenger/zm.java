package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zm implements Runnable {
    public final int f19553a = 3;
    public final long f19554b;
    public final long f19555c;
    public final int d;
    public final Object e;
    public final Object f19556f;
    public final Object h;
    public final Object f19557n;

    public zm(vp vpVar, TLRPC.updates_ChannelDifference updates_channeldifference, long j10, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.e = vpVar;
        this.f19556f = updates_channeldifference;
        this.f19554b = j10;
        this.h = chat;
        this.f19557n = hVar;
        this.d = i10;
        this.f19555c = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zm.run():void");
    }

    public zm(qz qzVar, long j10, long j11, int i10, TLRPC.Message message, ArrayList arrayList, jj jjVar) {
        this.e = qzVar;
        this.f19554b = j10;
        this.f19555c = j11;
        this.d = i10;
        this.f19556f = message;
        this.h = arrayList;
        this.f19557n = jjVar;
    }

    public zm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.Chat chat, CharSequence charSequence, long j10, long j11, int i10, int[] iArr) {
        this.e = cVar;
        this.h = chat;
        this.f19556f = charSequence;
        this.f19554b = j10;
        this.f19555c = j11;
        this.d = i10;
        this.f19557n = iArr;
    }

    public zm(WearReplyReceiver wearReplyReceiver, c cVar, TLRPC.User user, CharSequence charSequence, long j10, long j11, int i10, int[] iArr) {
        this.e = cVar;
        this.f19556f = user;
        this.h = charSequence;
        this.f19554b = j10;
        this.f19555c = j11;
        this.d = i10;
        this.f19557n = iArr;
    }
}
