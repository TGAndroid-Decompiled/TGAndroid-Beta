package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class zf implements RequestDelegate {
    public final int f19707a;
    public final f1 f19708b;
    public final long f19709c;
    public final long d;
    public final Object e;

    public zf(f1 f1Var, Object obj, long j10, long j11, int i10) {
        this.f19707a = i10;
        this.f19708b = f1Var;
        this.e = obj;
        this.f19709c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        switch (this.f19707a) {
            case 0:
                vi viVar = (vi) this.f19708b;
                TLRPC.TL_channels_getMessages tL_channels_getMessages = (TLRPC.TL_channels_getMessages) this.e;
                long j10 = this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    vi.K1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        viVar.getMessagesController().L0(Long.valueOf(this.f19709c));
                        ic.X(messages_messages.messages);
                        viVar.k(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        viVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        if (!arrayList.isEmpty()) {
                            viVar.getMessagesStorage().f16331a.c(new d4(viVar, arrayList, j10, 14));
                            return;
                        }
                        return;
                    }
                }
                viVar.getMessagesStorage().c2(j10, tL_channels_getMessages.f19832id, false, -1, 0, false, null);
                return;
            case 1:
                vi viVar2 = (vi) this.f19708b;
                int[] iArr = (int[]) this.e;
                viVar2.getClass();
                for (int i11 = 0; i11 < 9; i11++) {
                    if (iArr[i11] < 0) {
                        iArr[i11] = 0;
                    }
                }
                boolean z10 = tLObject instanceof Vector;
                long j11 = this.f19709c;
                long j12 = this.d;
                if (z10) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        TLRPC.TL_messages_searchCounter tL_messages_searchCounter = (TLRPC.TL_messages_searchCounter) vector.objects.get(i12);
                        TLRPC.MessagesFilter messagesFilter = tL_messages_searchCounter.filter;
                        if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotoVideo) {
                            i10 = 0;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterDocument) {
                            i10 = 1;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterRoundVoice) {
                            i10 = 2;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterUrl) {
                            i10 = 3;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterMusic) {
                            i10 = 4;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterGif) {
                            i10 = 5;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPhotos) {
                            i10 = 6;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterVideo) {
                            i10 = 7;
                        } else if (messagesFilter instanceof TLRPC.TL_inputMessagesFilterPoll) {
                            i10 = 8;
                        }
                        int i13 = tL_messages_searchCounter.count;
                        iArr[i10] = i13;
                        viVar2.H1(j11, j12, i10, i13);
                    }
                }
                i0.g3(new hg(viVar2, j11, j12, iArr, 2));
                return;
            default:
                i0.g3(new n9((y00) this.f19708b, tLObject, (TLRPC.TL_forumTopic) this.e, this.f19709c, this.d));
                return;
        }
    }

    public zf(vi viVar, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f19707a = 0;
        this.f19708b = viVar;
        this.f19709c = j10;
        this.d = j11;
        this.e = tL_channels_getMessages;
    }
}
