package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yc implements Runnable {
    public final int f21907a;
    public final Object f21908b;
    public final long f21909c;
    public final int d;
    public final long e;
    public final Object f21910f;
    public final Object h;
    public final Object f21911n;
    public final Object f21912r;

    public yc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f21907a = 1;
        this.f21908b = messagesController;
        this.f21910f = arrayList;
        this.f21909c = j10;
        this.h = updates_channeldifference;
        this.f21911n = chat;
        this.f21912r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f21907a) {
            case 0:
                ((MessagesController) this.f21908b).lambda$ensureMessagesLoaded$465((boolean[]) this.f21910f, (MessagesStorage) this.h, this.f21909c, (Runnable[]) this.f21911n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f21912r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f21908b).lambda$getChannelDifference$348((ArrayList) this.f21910f, this.f21909c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f21911n, (a0.h) this.f21912r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f21908b).lambda$onReceive$0((AccountInstance) this.f21910f, (TLRPC.User) this.h, (CharSequence) this.f21911n, this.f21909c, this.e, this.d, (int[]) this.f21912r);
                return;
            default:
                ((WearReplyReceiver) this.f21908b).lambda$onReceive$2((AccountInstance) this.f21910f, (TLRPC.Chat) this.h, (CharSequence) this.f21911n, this.f21909c, this.e, this.d, (int[]) this.f21912r);
                return;
        }
    }

    public yc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f21907a = 0;
        this.f21908b = messagesController;
        this.f21910f = zArr;
        this.h = messagesStorage;
        this.f21909c = j10;
        this.f21911n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f21912r = messagesLoadedCallback;
    }

    public yc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f21907a = i11;
        this.f21908b = wearReplyReceiver;
        this.f21910f = accountInstance;
        this.h = tLObject;
        this.f21911n = charSequence;
        this.f21909c = j10;
        this.e = j11;
        this.d = i10;
        this.f21912r = iArr;
    }
}
