package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x1 implements RequestDelegate {
    public final int f32354a;
    public final Object f32355b;

    public x1(Object obj, int i10) {
        this.f32354a = i10;
        this.f32355b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32354a;
        Object obj = this.f32355b;
        switch (i10) {
            case 0:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    org.telegram.messenger.wp.r1(cVar.f15043a).L3((TLRPC.Updates) tLObject, false);
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
                mi0 mi0Var = (mi0) obj;
                if (tLObject instanceof TLRPC.TL_messages_messageReactionsList) {
                    TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) tLObject;
                    int i11 = tL_messages_messageReactionsList.count;
                    tL_messages_messageReactionsList.users.size();
                    mi0Var.post(new ki0(mi0Var, i11, tL_messages_messageReactionsList, 0));
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.i0.g3(new ni0((wi0) obj, tLObject, 0));
                return;
            case 11:
                ms0 ms0Var = (ms0) obj;
                ms0Var.getClass();
                org.telegram.messenger.i0.g3(new jg(ms0Var, tL_error, tLObject, 21));
                return;
            case 12:
                org.telegram.messenger.i0.g3(new jg((dx0) obj, tL_error, tLObject, 27));
                return;
            case 13:
                org.telegram.messenger.i0.g3(new ow0(tLObject, (org.telegram.messenger.r20) obj, 0));
                return;
            case 14:
                p21 p21Var = (p21) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.wp.r1(p21Var.e).L3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        org.telegram.messenger.i0.h3(new hi0(17, p21Var, updates), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.i0.g3(new hi0(19, (n31) obj, tLObject));
                return;
            case 16:
                w41 w41Var = (w41) obj;
                w41Var.getClass();
                org.telegram.messenger.i0.g3(new v41(w41Var, tL_error, tLObject, 0));
                return;
            default:
                int i12 = UndoView.f24238i0;
                org.telegram.messenger.i0.g3(new hi0(22, (UndoView) obj, tLObject));
                return;
        }
    }
}
