package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f32295a;
    public final Object f32296b;

    public x1(Object obj, int i10) {
        this.f32295a = i10;
        this.f32296b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32295a;
        Object obj = this.f32296b;
        switch (i10) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.vp.r1(cVar.f14863a).L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.i0.g3(new cd(27, (cr) obj, tLObject));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new cd(28, (fs) obj, tLObject));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new at(4, (pw) obj, tLObject));
                return;
            case 4:
                zx zxVar = (zx) obj;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new at(9, zxVar, tLObject));
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.i0.g3(new at(17, (c60) obj, tLObject));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new jg((m60) obj, tL_error, tLObject, 10));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new jg((gb0) obj, tL_error, tLObject, 13));
                return;
            case 8:
                org.telegram.messenger.i0.g3(new at(26, (cg0) obj, tLObject));
                return;
            case 9:
                li0 li0Var = (li0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    li0Var.post(new ji0(li0Var, i11, tL_messages_messageReactionsList, 0));
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.i0.g3(new mi0((vi0) obj, tLObject, 0));
                return;
            case 11:
                ls0 ls0Var = (ls0) obj;
                ls0Var.getClass();
                org.telegram.messenger.i0.g3(new jg(ls0Var, tL_error, tLObject, 21));
                return;
            case 12:
                org.telegram.messenger.i0.g3(new jg((cx0) obj, tL_error, tLObject, 27));
                return;
            case 13:
                org.telegram.messenger.i0.g3(new nw0(tLObject, (org.telegram.messenger.q20) obj, 0));
                return;
            case 14:
                o21 o21Var = (o21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.vp.r1(o21Var.f28957n).L3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.i0.h3(new gi0(16, o21Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.i0.g3(new gi0(18, (m31) obj, tLObject));
                return;
            case 16:
                v41 v41Var = (v41) obj;
                v41Var.getClass();
                org.telegram.messenger.i0.g3(new u41(v41Var, tL_error, tLObject, 0));
                return;
            default:
                int i12 = UndoView.f24237i0;
                org.telegram.messenger.i0.g3(new gi0(21, (UndoView) obj, tLObject));
                return;
        }
    }
}
