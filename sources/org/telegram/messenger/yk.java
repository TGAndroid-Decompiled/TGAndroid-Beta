package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yk implements RequestDelegate {
    public final int f19400a;
    public final vp f19401b;
    public final long f19402c;
    public final long d;

    public yk(int i10, long j10, long j11, vp vpVar) {
        this.f19400a = i10;
        this.f19401b = vpVar;
        this.f19402c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19400a) {
            case 0:
                vp vpVar = this.f19401b;
                vpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    vpVar.I3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, this.f19402c);
                }
                long j10 = this.d;
                if (j10 != 0) {
                    vpVar.getMessagesStorage().q1(j10);
                    return;
                }
                return;
            default:
                vp vpVar2 = this.f19401b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        vpVar2.G3(tL_messages_dialogs, null, null, ((TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, vpVar2.Q7, false, false, false);
                    }
                }
                long j11 = this.f19402c;
                if (j11 != 0) {
                    vpVar2.getMessagesStorage().q1(j11);
                }
                vpVar2.f18754c1.e(this.d);
                return;
        }
    }
}
