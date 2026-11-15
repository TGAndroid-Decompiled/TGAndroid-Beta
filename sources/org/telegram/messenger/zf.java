package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class zf implements RequestDelegate {
    public final int f27930a;
    public final c1 f27931b;
    public final long f27932c;
    public final long d;
    public final Object f27933e;

    public zf(c1 c1Var, Object obj, long j3, long j10, int i7) {
        this.f27930a = i7;
        this.f27931b = c1Var;
        this.f27933e = obj;
        this.f27932c = j3;
        this.d = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        switch (this.f27930a) {
            case 0:
                si siVar = (si) this.f27931b;
                TLRPC.TL_channels_getMessages tL_channels_getMessages = (TLRPC.TL_channels_getMessages) this.f27933e;
                long j3 = this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    si.K1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        siVar.getMessagesController().M0(Long.valueOf(this.f27932c));
                        fc.X(messages_messages.messages);
                        siVar.k(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        siVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        if (!arrayList.isEmpty()) {
                            siVar.getMessagesStorage().f27219a.c(new a4(siVar, arrayList, j3, 14));
                            return;
                        }
                        return;
                    }
                }
                siVar.getMessagesStorage().c2(j3, tL_channels_getMessages.f28089id, false, -1, 0, false, null);
                return;
            case 1:
                si siVar2 = (si) this.f27931b;
                int[] iArr = (int[]) this.f27933e;
                siVar2.getClass();
                for (int i10 = 0; i10 < 9; i10++) {
                    if (iArr[i10] < 0) {
                        iArr[i10] = 0;
                    }
                }
                boolean z10 = tLObject instanceof Vector;
                long j10 = this.f27932c;
                long j11 = this.d;
                if (z10) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        TLRPC.TL_messages_searchCounter tL_messages_searchCounter = (TLRPC.TL_messages_searchCounter) vector.objects.get(i11);
                        TLRPC.MessagesFilter messagesFilter = tL_messages_searchCounter.filter;
                        if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotoVideo) {
                            i7 = 0;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterDocument) {
                            i7 = 1;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterRoundVoice) {
                            i7 = 2;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterUrl) {
                            i7 = 3;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterMusic) {
                            i7 = 4;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterGif) {
                            i7 = 5;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotos) {
                            i7 = 6;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterVideo) {
                            i7 = 7;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPoll) {
                            i7 = 8;
                        }
                        int i12 = tL_messages_searchCounter.count;
                        iArr[i7] = i12;
                        siVar2.H1(j10, j11, i7, i12);
                    }
                }
                g0.h3(new gg(siVar2, j10, j11, iArr, 2));
                return;
            default:
                g0.h3(new k9((h00) this.f27931b, tLObject, (TLRPC.TL_forumTopic) this.f27933e, this.f27932c, this.d));
                return;
        }
    }

    public zf(si siVar, long j3, long j10, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f27930a = 0;
        this.f27931b = siVar;
        this.f27932c = j3;
        this.d = j10;
        this.f27933e = tL_channels_getMessages;
    }
}
