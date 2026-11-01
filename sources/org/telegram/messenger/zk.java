package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zk implements RequestDelegate {
    public final int f19728a;
    public final wp f19729b;
    public final long f19730c;
    public final long d;

    public zk(int i10, long j10, long j11, wp wpVar) {
        this.f19728a = i10;
        this.f19729b = wpVar;
        this.f19730c = j10;
        this.d = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19728a) {
            case 0:
                wp wpVar = this.f19729b;
                wpVar.getClass();
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
                    wpVar.I3(tL_messages_affectedMessages.pts, tL_messages_affectedMessages.pts_count, this.f19730c);
                }
                long j10 = this.d;
                if (j10 != 0) {
                    wpVar.getMessagesStorage().q1(j10);
                    return;
                }
                return;
            default:
                wp wpVar2 = this.f19729b;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty()) {
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        wpVar2.G3(tL_messages_dialogs, null, null, ((TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0)).folder_id, 0, 1, wpVar2.Q7, false, false, false);
                    }
                }
                long j11 = this.f19730c;
                if (j11 != 0) {
                    wpVar2.getMessagesStorage().q1(j11);
                }
                wpVar2.f19097c1.e(this.d);
                return;
        }
    }
}
