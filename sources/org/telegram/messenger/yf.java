package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class yf implements RequestDelegate {
    public final int f19379a;
    public final f1 f19380b;
    public final long f19381c;
    public final long d;
    public final Object e;

    public yf(f1 f1Var, Object obj, long j10, long j11, int i10) {
        this.f19379a = i10;
        this.f19380b = f1Var;
        this.e = obj;
        this.f19381c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        switch (this.f19379a) {
            case 0:
                ui uiVar = (ui) this.f19380b;
                TLRPC.TL_channels_getMessages tL_channels_getMessages = (TLRPC.TL_channels_getMessages) this.e;
                long j10 = this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ui.K1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        uiVar.getMessagesController().L0(Long.valueOf(this.f19381c));
                        hc.X(messages_messages.messages);
                        uiVar.k(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        uiVar.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
                        if (!arrayList.isEmpty()) {
                            uiVar.getMessagesStorage().f15938a.c(new d4(uiVar, arrayList, j10, 14));
                            return;
                        }
                        return;
                    }
                }
                uiVar.getMessagesStorage().c2(j10, tL_channels_getMessages.f19831id, false, -1, 0, false, null);
                return;
            case 1:
                ui uiVar2 = (ui) this.f19380b;
                int[] iArr = (int[]) this.e;
                uiVar2.getClass();
                for (int i11 = 0; i11 < 9; i11++) {
                    if (iArr[i11] < 0) {
                        iArr[i11] = 0;
                    }
                }
                boolean z10 = tLObject instanceof Vector;
                long j11 = this.f19381c;
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
                        uiVar2.H1(j11, j12, i10, i13);
                    }
                }
                i0.g3(new gg(uiVar2, j11, j12, iArr, 2));
                return;
            default:
                i0.g3(new m9((x00) this.f19380b, tLObject, (TLRPC.TL_forumTopic) this.e, this.f19381c, this.d));
                return;
        }
    }

    public yf(ui uiVar, long j10, long j11, TLRPC.TL_channels_getMessages tL_channels_getMessages) {
        this.f19379a = 0;
        this.f19380b = uiVar;
        this.f19381c = j10;
        this.d = j11;
        this.e = tL_channels_getMessages;
    }
}
