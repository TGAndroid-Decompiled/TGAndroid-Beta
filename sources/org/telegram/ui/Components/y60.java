package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y60 implements org.telegram.ui.qb0 {
    public final z60 f30653a;

    public y60(z60 z60Var) {
        this.f30653a = z60Var;
    }

    @Override
    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
        int i10;
        org.telegram.ui.hb hbVar = this.f30653a.f30901a.f22577c.f24236j0;
        if (hbVar != null) {
            TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
            TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = new TLRPC.TL_channelAdminLogEventActionExportedInviteEdit();
            tL_channelAdminLogEventActionExportedInviteEdit.new_invite = tL_chatInviteExported;
            tL_channelAdminLogEventActionExportedInviteEdit.prev_invite = tL_chatInviteExported;
            tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteEdit;
            tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
            org.telegram.ui.ub ubVar = hbVar.f34272a;
            tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
            i10 = ((org.telegram.ui.ActionBar.m2) ubVar).currentAccount;
            if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.f38494n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f38485f, ubVar.T, true).contentType >= 0) {
                ubVar.R0();
                ubVar.E.l();
                org.telegram.ui.ub.K0(ubVar);
            }
        }
    }

    @Override
    public final void a(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public final void c(TLObject tLObject) {
    }
}
