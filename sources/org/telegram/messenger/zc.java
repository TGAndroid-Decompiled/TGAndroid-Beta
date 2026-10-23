package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zc implements Runnable {
    public final int f20308a;
    public final Object f20309b;
    public final long f20310c;
    public final int d;
    public final long e;
    public final Object f20311f;
    public final Object h;
    public final Object f20312n;
    public final Object f20313r;

    public zc(MessagesController messagesController, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f20308a = 1;
        this.f20309b = messagesController;
        this.f20311f = arrayList;
        this.f20310c = j10;
        this.h = updates_channeldifference;
        this.f20312n = chat;
        this.f20313r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20308a) {
            case 0:
                ((MessagesController) this.f20309b).lambda$ensureMessagesLoaded$463((boolean[]) this.f20311f, (MessagesStorage) this.h, this.f20310c, (Runnable[]) this.f20312n, this.e, this.d, (MessagesController.MessagesLoadedCallback) this.f20313r);
                return;
            case 1:
                int i10 = this.d;
                long j10 = this.e;
                ((MessagesController) this.f20309b).lambda$getChannelDifference$346((ArrayList) this.f20311f, this.f20310c, (TLRPC.updates_ChannelDifference) this.h, (TLRPC.Chat) this.f20312n, (a0.h) this.f20313r, i10, j10);
                return;
            case 2:
                ((WearReplyReceiver) this.f20309b).lambda$onReceive$0((AccountInstance) this.f20311f, (TLRPC.User) this.h, (CharSequence) this.f20312n, this.f20310c, this.e, this.d, (int[]) this.f20313r);
                return;
            default:
                ((WearReplyReceiver) this.f20309b).lambda$onReceive$2((AccountInstance) this.f20311f, (TLRPC.Chat) this.h, (CharSequence) this.f20312n, this.f20310c, this.e, this.d, (int[]) this.f20313r);
                return;
        }
    }

    public zc(MessagesController messagesController, boolean[] zArr, MessagesStorage messagesStorage, long j10, Runnable[] runnableArr, long j11, int i10, MessagesController.MessagesLoadedCallback messagesLoadedCallback) {
        this.f20308a = 0;
        this.f20309b = messagesController;
        this.f20311f = zArr;
        this.h = messagesStorage;
        this.f20310c = j10;
        this.f20312n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f20313r = messagesLoadedCallback;
    }

    public zc(WearReplyReceiver wearReplyReceiver, AccountInstance accountInstance, TLObject tLObject, CharSequence charSequence, long j10, long j11, int i10, int[] iArr, int i11) {
        this.f20308a = i11;
        this.f20309b = wearReplyReceiver;
        this.f20311f = accountInstance;
        this.h = tLObject;
        this.f20312n = charSequence;
        this.f20310c = j10;
        this.e = j11;
        this.d = i10;
        this.f20313r = iArr;
    }
}
