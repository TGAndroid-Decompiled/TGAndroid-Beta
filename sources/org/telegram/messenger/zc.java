package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zc implements Runnable {
    public final int f20244a;
    public final Object f20245b;
    public final long f20246c;
    public final int d;
    public final long e;
    public final Object f20247f;
    public final Object h;
    public final Object f20248n;
    public final Object f20249r;

    public zc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f20244a = 1;
        this.f20245b = messagesController;
        this.f20247f = arrayList;
        this.f20246c = j10;
        this.h = updates_channeldifference;
        this.f20248n = chat;
        this.f20249r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20244a) {
            case 0:
                ((MessagesController) this.f20245b).lambda$ensureMessagesLoaded$463((boolean[]) this.f20247f, (MessagesStorage) this.h, this.f20246c, (Runnable[]) this.f20248n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f20249r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f20245b).lambda$getChannelDifference$346((ArrayList) this.f20247f, this.f20246c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f20248n, (a0.h) this.f20249r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f20245b).lambda$onReceive$0((AccountInstance) this.f20247f, (TLRPC.User) this.h, (CharSequence) this.f20248n, this.f20246c, this.e, this.d, (int[]) this.f20249r);
                return;
            default:
                ((WearReplyReceiver) this.f20245b).lambda$onReceive$2((AccountInstance) this.f20247f, (TLRPC.Chat) this.h, (CharSequence) this.f20248n, this.f20246c, this.e, this.d, (int[]) this.f20249r);
                return;
        }
    }

    public zc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f20244a = 0;
        this.f20245b = messagesController;
        this.f20247f = zArr;
        this.h = messagesStorage;
        this.f20246c = j10;
        this.f20248n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f20249r = messagesLoadedCallback;
    }

    public zc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f20244a = i11;
        this.f20245b = wearReplyReceiver;
        this.f20247f = accountInstance;
        this.h = tLObject;
        this.f20248n = charSequence;
        this.f20246c = j10;
        this.e = j11;
        this.d = i10;
        this.f20249r = iArr;
    }
}
